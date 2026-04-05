package com.cc;

import com.yinhan.kjava.main.MainCanvas;

import javax.microedition.io.Connector;
import javax.microedition.io.SocketConnection;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;

/**
 * Socket 读线程 + 发包执行者。
 *
 * 职责：
 *   - run()：独立线程，阻塞读 Socket InputStream，将收到的数据包放入 NetUtils.receivePacketQueue（生产者）
 *   - write()：由 SocketWristLooper 线程每 15ms 调用，从 packetQueue/heartbeatQueue 取包写入 Socket（消费者）
 *
 * 发包队列由主线程（MainCanvas.run → netUtils.sendPacket）写入。
 */
public final class SocketReadLooper implements Runnable {
    private SocketConnection socketConnection;
    private DataOutputStream os;
    private DataInputStream is;
    private NetUtils netUtils;
    private long g;
    // 普通数据包发送队列（主线程生产，SocketWristLooper 消费）
    public Vector packetQueue = new Vector();
    // 心跳包发送队列（间隔 2s 发一次，优先级低于普通包）
    public Vector heartbeatQueue = new Vector();
    private boolean isStart = true;
    private boolean firstHands;

    public SocketReadLooper(NetUtils netUtils) {
        NetUtils.status = 1;
        this.netUtils = netUtils;
        new Thread(this).start();
    }

    public void stop() {
        this.isStart = false;

        try {
            if (this.is != null) {
                this.is.close();
            }

            if (this.os != null) {
                this.os.close();
            }

            if (this.socketConnection != null) {
                this.socketConnection.close();
            }

            this.packetQueue.removeAllElements();
            this.heartbeatQueue.removeAllElements();
        } catch (IOException var2) {
            ((Throwable) var2).printStackTrace();
        }

        this.socketConnection = null;
        this.os = null;
        this.is = null;
    }

    public void write() {
        if (NetUtils.status != 3) {
            try {
                if (this.socketConnection == null) {
                    this.socketConnection = (SocketConnection) Connector.open(NetUtils.socketUrl);
                    this.socketConnection.setSocketOption((byte) 2, 1);
                    this.socketConnection.setSocketOption((byte) 1, 5);
                    this.socketConnection.setSocketOption((byte) 0, 10000);
                    this.os = this.socketConnection.openDataOutputStream();
                    this.is = this.socketConnection.openDataInputStream();
                    this.firstHands = true;
                }

                if (this.socketConnection != null) {
                    if (!this.packetQueue.isEmpty()) {
                        this.doWrite(this.packetQueue);
                        this.g = this.netUtils.mainCanvas.frameStartTs;
                        return;
                    }

                    if (!this.heartbeatQueue.isEmpty()) {
                        if (this.netUtils.mainCanvas.frameStartTs - this.g < 2000L) {
                            return;
                        }

                        this.doWrite(this.heartbeatQueue);
                        this.g = this.netUtils.mainCanvas.frameStartTs;
                    }
                }

            } catch (IOException var4) {
                var4.printStackTrace();
                ++this.netUtils.retryCount;
                GlobalConfig.printStr("数据发送异常，尝试重连|" + this.netUtils.retryCount);
                if (this.netUtils.retryCount > 30) {
                    this.netUtils.stop();
                    this.netUtils.toast("连接超时,请尝试其他连接方式!");
                }

                this.stop();
                this.g = this.netUtils.mainCanvas.frameStartTs;
            }
        }
    }

    private void doWrite(Vector queue) {
        NetPacket packet = (NetPacket) queue.elementAt(0);
        GlobalConfig.printStr("开始数据包发送|" + packet.getCode());
        byte[] buffer = new byte[packet.payload.length + 2];
        for (short i = 0; i < buffer.length; ++i) {
            if (i == 0) {
                buffer[i] = packet.payload[i];
            } else if (i == 1) {
                buffer[i] = (byte) (packet.payload.length >> 8 & 255);
                ++i;
                buffer[i] = (byte) packet.payload.length;
            } else {
                buffer[i] = packet.payload[i - 2];
            }
        }
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            DataOutputStream dos = new DataOutputStream(bos);
            if (this.firstHands || packet.firstPacket) {
                dos.writeByte(NetPayloadBuilder.hands1);
                dos.writeByte(NetPayloadBuilder.hands2);
                this.firstHands = false;
            }
            dos.write(buffer);
            this.os.write(bos.toByteArray());
            this.os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (packet.getCode() == 4630) {
            GlobalStatus.lastSyncTime = System.currentTimeMillis();
        }

        this.g = this.netUtils.mainCanvas.frameStartTs;
        this.netUtils.retryCount = 0;
        queue.removeElementAt(0);
        if (packet.getCode() == 4352) {
            this.packetQueue.removeAllElements();
            this.heartbeatQueue.removeAllElements();
        }
        GlobalConfig.printStr("完成数据包发送|" + packet.getCode());
    }

    /**
     * Socket 读线程：阻塞读取服务端数据，解析后放入 receivePacketQueue，由主线程消费。
     */
    public void run() {
        while (this.isStart && NetUtils.status != 3) {
            try {
                if (this.socketConnection != null && this.is != null) {
                    this.netUtils.readSocket((InputStream) this.is);
                }
            } catch (Exception e) {
                e.printStackTrace();
                GlobalConfig.printStr("数据读取异常" + ((Throwable) e).getMessage());
                try {
                    this.stop();
                    if (MainCanvas.uiSceneController != null && MainCanvas.uiSceneController.currentSceneModeId == 25) {
                        if (MainCanvas.uiSceneController.overlayDialogController != null) {
                            MainCanvas.uiSceneController.overlayDialogController.l();
                        }
                    } else if (this.netUtils.mainCanvas.lastPageStatus != 3 && this.netUtils.mainCanvas.lastPageStatus != 9 && this.netUtils.mainCanvas.lastPageStatus != 4) {
                        this.netUtils.toast("数据更新失败:");
                    }
                } catch (Exception var2) {
                    var2.printStackTrace();
                }
            }
        }
    }
}

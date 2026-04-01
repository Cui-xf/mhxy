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

public final class SocketReadLooper implements Runnable {
    private SocketConnection socketConnection;
    private DataOutputStream os;
    private DataInputStream is;
    private NetUtils netUtils;
    private long g;
    public Vector packetQueue = new Vector();
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
                    this.socketConnection = (SocketConnection) Connector.open(NetUtils.c);
                    this.socketConnection.setSocketOption((byte) 2, 1);
                    this.socketConnection.setSocketOption((byte) 1, 5);
                    this.socketConnection.setSocketOption((byte) 0, 10000);
                    this.os = this.socketConnection.openDataOutputStream();
                    this.is = this.socketConnection.openDataInputStream();
                    this.firstHands = true;
                }

                if (this.socketConnection != null) {
                    if (this.packetQueue.size() > 0) {
                        this.doWrite(this.packetQueue);
                        this.g = this.netUtils.mainCanvas.ak;
                        return;
                    }

                    if (this.heartbeatQueue.size() > 0) {
                        if (this.netUtils.mainCanvas.ak - this.g < 2000L) {
                            return;
                        }

                        this.doWrite(this.heartbeatQueue);
                        this.g = this.netUtils.mainCanvas.ak;
                    }
                }

            } catch (IOException var4) {
                ((Throwable) var4).printStackTrace();
                ++this.netUtils.e;
                (new StringBuffer()).append("数据发送异常，尝试重连|").append(this.netUtils.e).toString();
                if (this.netUtils.e > 30) {
                    this.netUtils.d();
                    this.netUtils.toast("连接超时,请尝试其他连接方式!");
                }

                this.stop();
                this.g = this.netUtils.mainCanvas.ak;
            } finally {

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
                if (GlobalConfig.channel == 0) {
                    //代理头
                    dos.write(NetPayloadBuilder.buildProxy((byte) 1, NetPayloadBuilder.channelFlag, 0, 0));
                } else {
                    dos.writeByte(NetPayloadBuilder.hands1);
                    dos.writeByte(NetPayloadBuilder.hands2);
                }
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

        this.g = this.netUtils.mainCanvas.ak;
        this.netUtils.e = 0;
        queue.removeElementAt(0);
        if (packet.getCode() == 4352) {
            this.packetQueue.removeAllElements();
            this.heartbeatQueue.removeAllElements();
        }
        GlobalConfig.printStr("完成数据包发送|" + packet.getCode());
    }

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
                    if (MainCanvas.e != null && MainCanvas.e.k == 25) {
                        if (MainCanvas.e.g != null) {
                            MainCanvas.e.g.l();
                        }
                    } else if (this.netUtils.mainCanvas.k != 3 && this.netUtils.mainCanvas.k != 9 && this.netUtils.mainCanvas.k != 4) {
                        this.netUtils.toast("数据更新失败:");
                    }
                } catch (Exception var2) {
                    var2.printStackTrace();
                }
            }
        }
    }
}

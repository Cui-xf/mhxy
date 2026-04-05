package com.cc;

import com.yinhan.kjava.main.MainCanvas;

import java.io.*;
import java.util.Vector;

//public final class av_1 {

public final class NetUtils {
    public static String socketUrl = "socket://120.78.151.213:20008";
    //        public static String socketUrl = "socket://127.0.0.1:20008";
    public static byte status;
    public byte retryCount;
    public MainCanvas mainCanvas;
    private NetworkPacketProcessors networkPacketProcessors = new NetworkPacketProcessors();
    private SocketWristLooper socketWristLooper;
    public SocketReadLooper socketReadLooper;
    // 接收包队列：SocketReadLooper 线程写入，主线程（run()）通过 processNetPacket() 消费
    private Vector receivePacketQueue = new Vector();

    public NetUtils() {
        NetPayloadBuilder.channelFlag = GlobalConfig.channel == 0 ? 162 : 40;
        this.start();
    }

    public final void setMainCanvas(MainCanvas mainCanvas) {
        this.mainCanvas = mainCanvas;
        if (this.networkPacketProcessors != null) {
            this.networkPacketProcessors.setMainCanvas(mainCanvas);
        }

    }

    private void startSocket() {
        status = 1;
        if (this.socketReadLooper != null) {
            this.socketReadLooper.stop();
        }

        this.socketReadLooper = new SocketReadLooper(this);
        if (this.socketWristLooper == null) {
            this.socketWristLooper = new SocketWristLooper(this);
        }
    }

    public NetworkPacketProcessors getNetworkPacketProcessors() {
        return this.networkPacketProcessors;
    }

    public void start() {
        status = 3;
        this.startSocket();
        GlobalConfig.printStr("当前服务地址-->" + socketUrl);
    }

    private void onReceivePacket(NetPacket packet) {
        this.receivePacketQueue.addElement(packet);
    }

    public static boolean checkExist(Vector packetQueue, NetPacket packet) {
        for (int i = 0; i < packetQueue.size(); ++i) {
            NetPacket t = (NetPacket) packetQueue.elementAt(i);
            if (packet.getCode() == t.getCode()) {
                return true;
            }
        }
        return false;
    }

    /**
     * 每帧由主线程（MainCanvas.run）调用，从接收队列取出一个数据包交给业务处理器。
     * 每次调用只处理一个包，避免单帧阻塞过久。
     */
    public void processNetPacket() {
        if (!this.receivePacketQueue.isEmpty()) {
            for (int var1 = 0; var1 < this.receivePacketQueue.size(); ++var1) {
                NetPacket netPacket = (NetPacket) this.receivePacketQueue.elementAt(0);
                if (netPacket != null) {
                    try {
                        if (this.networkPacketProcessors != null) {
                            this.networkPacketProcessors.process(netPacket);
                        } else {
                            this.mainCanvas.showTips("网络数据包处理器未启动");
                        }
                    } catch (Exception var3) {
                        if (this.mainCanvas != null) {
                            this.mainCanvas.showException((Exception) var3, (byte) 6);
                            var3.printStackTrace();
                        }
                    }

                    this.receivePacketQueue.removeElementAt(0);
                    return;
                }
            }
        }

    }

    /**
     * 由主线程调用，将数据包放入发送队列，由 SocketWristLooper 线程异步发出。
     * 心跳包（4101）放入 heartbeatQueue；普通包去重后放入 packetQueue。
     */
    public void sendPacket(NetPacket packet) {
        //心跳包
        if (packet.getCode() == 4101) {
            if (this.socketReadLooper.heartbeatQueue.isEmpty()) {
                this.socketReadLooper.heartbeatQueue.addElement(packet);
            }
        } else if (!checkExist(this.socketReadLooper.packetQueue, packet)) {
            GlobalConfig.printStr("添加发送数据包: " + packet.getCode());
            this.socketReadLooper.packetQueue.addElement(packet);
        }

    }

    public void readSocket(InputStream is) throws IOException {
        DataInputStream dis = new DataInputStream(is);
        if (dis.readByte() == 2) { //非压缩
            short code = dis.readShort();
            GlobalConfig.printStr("接收数据包|" + code);
            if (code != NetPacketCode.MultiPackContainer) {
                byte[] var3 = new byte[dis.readInt()];
                dis.readFully(var3);
                this.onReceivePacket(new NetPacket(code, var3));
                return;
            }
            dis.readInt();
            this.readChildPacket(dis);
        } else {//压缩包
            short var7 = (short) dis.readByte();
            int size = (short) dis.readByte();
            size = ((var7 < 0 ? var7 + 256 : var7) << 8) + (size < 0 ? size + 256 : size);
            GlobalConfig.printStr("接收压缩数据包大小|" + size);
            if (size > 0) {
                byte[] bytes = new byte[size];
                dis.readFully(bytes);
                bytes = GzipUtil.unZip(bytes);
                ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
                DataInputStream dis2 = new DataInputStream(bis);
                short code = dis2.readShort();
                GlobalConfig.printStr("接收压缩数据包|" + code);
                if (code == NetPacketCode.MultiPackContainer) {
                    dis2.readInt();
                    this.readChildPacket(dis2);
                    return;
                }
                byte[] var13 = new byte[dis2.readInt()];
                dis2.readFully(var13);
                this.onReceivePacket(new NetPacket(code, var13));
            }
        }

    }

    private void readChildPacket(DataInputStream dis) throws IOException {
        byte num = dis.readByte();
        if (num > 0) {
            NetPacket parent = new NetPacket(NetPacketCode.MultiPackContainer);
            for (int i = 0; i < num; ++i) {
                short code = dis.readShort();
                GlobalConfig.printStr("接收子数据包_|" + code);
                byte[] var8 = new byte[dis.readInt()];
                dis.readFully(var8);
                NetPacket c = new NetPacket(code, var8);
                parent.child.addElement(c);
            }
            this.onReceivePacket(parent);
        }
    }

    public void toast(String msg) {
        ByteArrayOutputStream var2 = new ByteArrayOutputStream();
        DataOutputStream var3 = new DataOutputStream(var2);
        try {
            var3.writeByte(-10);
            var3.writeUTF(msg);
            var3.flush();
            var2.flush();
            byte[] payload = var2.toByteArray();
            NetPacket packet = new NetPacket((short) 8193, payload);
            this.onReceivePacket(packet);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                var3.close();
                var2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void stop() {
        status = 3;
        if (this.socketWristLooper != null) {
            this.socketWristLooper.stop();
        }

        if (this.socketReadLooper != null) {
            this.socketReadLooper.stop();
        }

        this.socketWristLooper = null;
        this.socketReadLooper = null;
    }

    public static void sleep(int ms) {
        try {
            Thread.sleep((long) ms);
        } catch (Exception var1) {
        }
    }
}

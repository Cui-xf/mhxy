package com.cc;

import com.yinhan.kjava.main.MainCanvas;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;

//public final class av_1 {

public final class NetUtils {
    public static String httpUrl = "http://117.135.138.130:7099";
    public static String socketUrl = "socket://120.78.151.213:20008";
    public static String c = "";
    private static String j = "";
    public static byte status;
    public byte e;
    public MainCanvas mainCanvas;
    private q k = new q();
    private SocketWristLooper l;
    public SocketReadLooper socketReadLooper;
    private Vector receivePacketQueue = new Vector();
    private NetPacket n = null;
    public static byte h = -1;
    public static byte i = 2;

    public NetUtils() {
        NetPayloadBuilder.channelFlag = GlobalConfig.channel == 0 ? 162 : 40;
        h = -1;
        i = 2;
        if (httpUrl == null) {
            httpUrl = "http://117.135.138.130:7099";
        }

        if (socketUrl == null) {
            socketUrl = "socket://120.78.151.213:20008";
        }

        c = "";
        j = "";
        this.b();
    }

    public final void a(MainCanvas mainCanvas) {
        this.mainCanvas = mainCanvas;
        if (this.k != null) {
            this.k.a(mainCanvas);
        }

    }

    private void e() {
        if (h == 2) {
            status = 1;
            c = socketUrl;
            if (this.socketReadLooper != null) {
                this.socketReadLooper.stop();
            }

            this.socketReadLooper = new SocketReadLooper(this);
            if (this.l == null) {
                this.l = new SocketWristLooper(this);
            }
        }

    }

    public final q a() {
        return this.k;
    }

    public static boolean a(String var0) {
        return !c.equals(var0);
    }

    public final void b() {
        if (GlobalConfig.channel == 0) {
            if (h == -1) {
                i = 2;
                j = null;
                socketUrl = null;
                c = null;
                h = i;
                this.e();
            }

        } else {
            j = i == 2 ? socketUrl : httpUrl;
            h = i;
            c = j;
            status = 3;
            if (h == 2) {
                this.e();
            }

            GlobalConfig.printStr("当前服务地址-->" + c);
        }
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

    public final void c() {
        if (this.receivePacketQueue.size() > 0) {
            for (int var1 = 0; var1 < this.receivePacketQueue.size(); ++var1) {
                this.n = (NetPacket) this.receivePacketQueue.elementAt(0);
                if (this.n != null) {
                    try {
                        NetPacket var2 = this.n;
                        if (this.k != null) {
                            this.k.a(var2);
                        } else {
                            this.mainCanvas.b("网络数据包处理器未启动");
                        }
                    } catch (Exception var3) {
                        if (this.mainCanvas != null) {
                            this.mainCanvas.a((Exception) var3, (byte) 6);
                            ((Throwable) var3).printStackTrace();
                        }
                    }

                    this.receivePacketQueue.removeElementAt(0);
                    return;
                }
            }
        }

    }

    public void sendPacket(NetPacket packet) {
        GlobalConfig.printStr("sendPacket:" + Integer.toHexString(packet.getCode()));
        //心跳包
        if (packet.getCode() == 4101) {
            if (this.socketReadLooper.heartbeatQueue.size() == 0) {
                this.socketReadLooper.heartbeatQueue.addElement(packet);
                return;
            }
        } else if (!checkExist(this.socketReadLooper.packetQueue, packet)) {
            GlobalConfig.printStr("添加发送数据包: " + packet.getCode());
            this.socketReadLooper.packetQueue.addElement(packet);
        }

    }

    public final void readSocket(InputStream var1) throws IOException {
        DataInputStream var4;
        if ((var4 = new DataInputStream(var1)).readByte() == 2) {
            short var2 = var4.readShort();
            (new StringBuffer()).append("接收数据包|").append(var2).toString();
            if (var2 != 8192) {
                byte[] var3 = new byte[var4.readInt()];
                var4.readFully(var3);
                this.onReceivePacket(new NetPacket(var2, var3));
                return;
            }

            var4.readInt();
            this.a(var4);
        } else {
            short var7 = (short) var4.readByte();
            int var11 = (short) var4.readByte();
            var11 = ((var7 < 0 ? var7 + 256 : var7) << 8) + (var11 < 0 ? var11 + 256 : var11);
            (new StringBuffer()).append("接收压缩数据包大小|").append(var11).toString();
            if (var11 > 0) {
                byte[] var8 = new byte[var11];
                var4.readFully(var8);
                var8 = ci_1.a(var8);
                ByteArrayInputStream var5 = new ByteArrayInputStream(var8);
                DataInputStream var6;
                short var10 = (var6 = new DataInputStream(var5)).readShort();
                (new StringBuffer()).append("接收压缩数据包|").append(var10).toString();
                if (var10 == 8192) {
                    var6.readInt();
                    this.a(var6);
                    return;
                }

                byte[] var13 = new byte[var6.readInt()];
                var6.readFully(var13);
                this.onReceivePacket(new NetPacket(var10, var13));
            }
        }

    }

    private void a(DataInputStream var1) throws IOException {
        byte var2;
        if ((var2 = var1.readByte()) > 0) {
            NetPacket var3 = new NetPacket((short) 8192);
            boolean var5 = false;

            for (int var6 = 0; var6 < var2; ++var6) {
                short var4 = var1.readShort();
                (new StringBuffer()).append("接收子数据包_|").append(var4).toString();
                byte[] var8 = new byte[var1.readInt()];
                var1.readFully(var8);
                NetPacket var7 = new NetPacket(var4, var8);
                var3.child.addElement(var7);
            }

            this.onReceivePacket(var3);
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

    public final void d() {
        status = 3;
        if (this.l != null) {
            this.l.stop();
        }

        if (this.socketReadLooper != null) {
            this.socketReadLooper.stop();
        }

        this.l = null;
        this.socketReadLooper = null;
    }

    public static void sleep(int ms) {
        try {
            Thread.sleep((long) ms);
        } catch (Exception var1) {
        }
    }
}

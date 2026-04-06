package com.cc;

import javax.microedition.lcdui.Graphics;
import java.io.DataInputStream;
import java.io.IOException;

/**
 * 场景动态对象：表示地图上的 NPC、传送点、宝箱等可交互实体，持有坐标、状态标志、动画帧及可选的浮动文字渲染器。
 * 由服务器包 8198(MapObjects) 下发，通过 {@link #parseNpcObject(DataInputStream)} 反序列化。
 */
public final class NpcObject {
    public short a;
    public String b;
    public short c;
    public short d;
    public byte e;
    public byte f;
    public byte g;
    public byte h;
    public byte i;
    public byte j;
    public byte k;
    public byte l;
    public byte m;
    public byte n;
    public byte o;
    public byte p;
    public byte q;
    public byte r;
    public byte s;
    public byte t;
    public short resName;
    public int hashKey;
    public Frame1 frame1 = null;
    public boolean x = false;
    public short y;
    public short z;
    public short A;
    public String[] B = null;
    public String[] C = null;
    public byte D;
    public byte E;
    public byte F;
    public byte G;
    public byte H;
    public byte I;
    public byte J;
    public byte K;
    public byte L;
    public byte M;
    public byte N;
    public byte O;
    public byte P;
    public byte Q;
    public byte R;
    public int S;
    public byte T;
    private byte V = 0;
    private String W;
    public byte U = 0;
    private FWBRender X;
    private int[] Y = null;
    private int Z = 0;
    private boolean aa = false;

    public final short a() {
        return this.frame1 == null ? (short) (this.c - 8) : (short) (this.c - this.frame1.g() / 2);
    }

    public final short b() {
        return this.frame1 == null ? (short) (this.d - 30) : (short) (this.d - (this.frame1.h() == 0 ? 30 : this.frame1.h()));
    }

    public final short c() {
        if (this.frame1 == null) {
            return 16;
        } else {
            return this.frame1 != null && this.frame1.g() != 0 ? this.frame1.g() : 16;
        }
    }

    public final short d() {
        if (this.frame1 == null) {
            return 30;
        } else {
            return this.frame1.h() == 0 ? 30 : this.frame1.h();
        }
    }

    /**
     * 从数据流反序列化场景对象：读取 id、名称、坐标、状态标志位、动画帧资源 id 等全部字段。
     */
    public void parseNpcObject(DataInputStream dis) throws IOException {
        this.a = dis.readShort();
        this.b = dis.readUTF();
        dis.readShort();
        this.c = (short) (dis.readShort() + 8);
        this.d = (short) (dis.readShort() + 8);
        dis.readShort();
        int var2 = dis.readByte();
        this.e = (byte) (var2 & 1);
        this.f = (byte) (var2 >>> 1 & 1);
        this.g = (byte) (var2 >>> 2 & 1);
        this.h = (byte) (var2 >>> 3 & 1);
        this.i = (byte) (var2 >>> 4 & 1);
        this.k = (byte) (var2 >>> 5 & 1);
        this.l = (byte) (var2 >>> 6 & 1);
        var2 = dis.readByte();
        this.m = (byte) (var2 & 1);
        this.n = (byte) (var2 >>> 1 & 1);
        this.o = (byte) (var2 >>> 2 & 1);
        this.p = (byte) (var2 >>> 3 & 1);
        this.q = (byte) (var2 >>> 4 & 1);
        this.D = (byte) (var2 >>> 5 & 1);
        this.E = (byte) (var2 >>> 6 & 1);
        this.F = (byte) (var2 >>> 7 & 1);
        var2 = dis.readByte();
        this.G = (byte) (var2 & 1);
        this.J = (byte) (var2 >>> 1 & 1);
        this.r = (byte) (var2 >>> 2 & 1);
        this.s = (byte) (var2 >>> 3 & 1);
        this.K = (byte) (var2 >>> 4 & 1);
        this.L = (byte) (var2 >>> 5 & 1);
        this.M = (byte) (var2 >>> 6 & 1);
        this.Q = (byte) (var2 >>> 7 & 1);
        var2 = dis.readByte();
        this.R = (byte) (var2 & 1);
        this.N = (byte) (var2 >>> 1 & 1);
        this.O = (byte) (var2 >>> 2 & 1);
        this.P = (byte) (var2 >>> 3 & 1);
        this.T = (byte) (var2 >>> 4 & 1);
        this.j = dis.readByte();
        this.H = dis.readByte();
        this.I = dis.readByte();
        this.t = dis.readByte();
        this.resName = dis.readShort();
        this.y = dis.readShort();
        this.z = dis.readShort();
        this.A = dis.readShort();
        this.V = dis.readByte();
        if (this.V == 1) {
            this.W = dis.readUTF();
            this.U = dis.readByte();
        }

        if ((var2 = dis.readByte()) > 0) {
            this.B = new String[var2];

            for (int var3 = 0; var3 < var2; ++var3) {
                this.B[var3] = dis.readUTF();
            }

            this.C = new String[var2];

            for (int var14 = 0; var14 < var2; ++var14) {
                this.C[var14] = dis.readUTF();
            }
        }

        if (this.R == 1) {
            this.S = dis.readInt();
        }

        this.hashKey = Page.hashKey(Page.wrapName(String.valueOf(this.resName), (byte) 2).toCharArray());
        this.V = 1;
        if (this.U > 0) {
            int var10003 = GlobalConfig.defaultWidth - 40;
            byte var4 = this.U;
            short var15 = this.d;
            var2 = var10003;
            String var7 = this.W;
            if (var7 == null) {
                this.X = null;
                this.U = 0;
                return;
            }

            this.aa = false;
            this.Z = 0;
            this.X = new FWBRender(var7, (short) (var2 - 10));
            if (this.X.getLines() != 0) {
                int var8 = GlobalConfig.font2_h;
                this.Y = new int[4];
                this.Y[2] = var2;
                this.Y[3] = this.X.getLines() * var8 + 10;
                this.Y[0] = (GlobalConfig.defaultWidth - this.Y[2]) / 2;
                this.Y[1] = var15;
                return;
            }

            this.Y = null;
        }
    }

    public final void a(Graphics var1, PngUtil var2, int var3, int var4, byte var5) {
        if (this.t == -1 && GameSceneController.t_2 != null || this.I == 100 && GameSceneController.t_2 != null) {
            var2.a(var1, (Frame1) GameSceneController.t_2, (int[]) null, var3, var4, this.c - GameSceneController.t_2.i() / 2, this.d - (this.frame1 == null ? 30 : this.frame1.j()) - GlobalConfig.font2_h - GameSceneController.t_2.j(), 20, var5);
        } else if (this.t == 1 && GameSceneController.s != null) {
            var2.a(var1, (Frame1) GameSceneController.s, (int[]) null, var3, var4, this.c - GameSceneController.s.i() / 2, this.d - (this.frame1 == null ? 30 : this.frame1.j()) - GlobalConfig.font2_h - GameSceneController.s.j(), 20, var5);
        }

        if (this.x && GameSceneController.u != null) {
            var2.a(var1, (Frame1) GameSceneController.u, (int[]) null, var3, var4, this.c + (this.frame1 == null ? 8 : this.frame1.i() / 2), this.d - (this.frame1 == null ? 30 : this.frame1.j()), 20, var5);
            if (this.X != null && this.Y != null && this.U != 0) {
                var1.setClip(0, 0, GlobalConfig.defaultWidth, GlobalConfig.defaultHigh);
                if (this.Z >= 0) {
                    int var9;
                    if ((var9 = this.Y[1] - var4) + this.Y[3] > GlobalConfig.defaultHigh) {
                        var9 = GlobalConfig.defaultHigh - this.Y[3] - 4;
                    }

                    int var10001 = this.Y[0];
                    int var10003 = this.Y[2];
                    int var7 = this.Y[3];
                    int var6 = var10003;
                    var4 = var10001;
                    LoadingPage.fillRect(var1, 1009050, 150, var4, var9, var6, var7);
                    if (this.Z >= 3) {
                        this.X.a(var1, this.Y[0] + 5, var9 + 5, 20);
                    }
                }

                this.aa = true;
                ++this.Z;
                return;
            }
        } else {
            this.Z = 0;
        }

    }

    public final void e() {
        if (this.U >= 0) {
            if (this.U > 0) {
                if (this.aa) {
                    this.aa = false;
                    --this.U;
                }

            } else {
                this.X = null;
                this.Z = 0;
                this.Y = null;
            }
        }
    }
}

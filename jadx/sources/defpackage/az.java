package defpackage;

import java.io.DataInputStream;
import java.io.IOException;
import javax.microedition.lcdui.Graphics;

/* loaded from: java版梦回西游3区251011.jar:az.class */
public final class az {
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
    public short u;
    public int v;
    public short y;
    public short z;
    public short A;
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
    private String W;
    private bw X;
    public bc w = null;
    public boolean x = false;
    public String[] B = null;
    public String[] C = null;
    private byte V = 0;
    public byte U = 0;
    private int[] Y = null;
    private int Z = 0;
    private boolean aa = false;

    public final short a() {
        return this.w == null ? (short) (this.c - 8) : (short) (this.c - (this.w.g() / 2));
    }

    public final short b() {
        if (this.w == null) {
            return (short) (this.d - 30);
        }
        return (short) (this.d - (this.w.h() == 0 ? (short) 30 : this.w.h()));
    }

    public final short c() {
        if (this.w == null || this.w == null || this.w.g() == 0) {
            return (short) 16;
        }
        return this.w.g();
    }

    public final short d() {
        if (this.w == null || this.w.h() == 0) {
            return (short) 30;
        }
        return this.w.h();
    }

    public final void a(DataInputStream dataInputStream) throws IOException {
        this.a = dataInputStream.readShort();
        this.b = dataInputStream.readUTF();
        dataInputStream.readShort();
        this.c = (short) (dataInputStream.readShort() + 8);
        this.d = (short) (dataInputStream.readShort() + 8);
        dataInputStream.readShort();
        byte b = dataInputStream.readByte();
        this.e = (byte) (b & 1);
        this.f = (byte) ((b >>> 1) & 1);
        this.g = (byte) ((b >>> 2) & 1);
        this.h = (byte) ((b >>> 3) & 1);
        this.i = (byte) ((b >>> 4) & 1);
        this.k = (byte) ((b >>> 5) & 1);
        this.l = (byte) ((b >>> 6) & 1);
        byte b2 = dataInputStream.readByte();
        this.m = (byte) (b2 & 1);
        this.n = (byte) ((b2 >>> 1) & 1);
        this.o = (byte) ((b2 >>> 2) & 1);
        this.p = (byte) ((b2 >>> 3) & 1);
        this.q = (byte) ((b2 >>> 4) & 1);
        this.D = (byte) ((b2 >>> 5) & 1);
        this.E = (byte) ((b2 >>> 6) & 1);
        this.F = (byte) ((b2 >>> 7) & 1);
        byte b3 = dataInputStream.readByte();
        this.G = (byte) (b3 & 1);
        this.J = (byte) ((b3 >>> 1) & 1);
        this.r = (byte) ((b3 >>> 2) & 1);
        this.s = (byte) ((b3 >>> 3) & 1);
        this.K = (byte) ((b3 >>> 4) & 1);
        this.L = (byte) ((b3 >>> 5) & 1);
        this.M = (byte) ((b3 >>> 6) & 1);
        this.Q = (byte) ((b3 >>> 7) & 1);
        byte b4 = dataInputStream.readByte();
        this.R = (byte) (b4 & 1);
        this.N = (byte) ((b4 >>> 1) & 1);
        this.O = (byte) ((b4 >>> 2) & 1);
        this.P = (byte) ((b4 >>> 3) & 1);
        this.T = (byte) ((b4 >>> 4) & 1);
        this.j = dataInputStream.readByte();
        this.H = dataInputStream.readByte();
        this.I = dataInputStream.readByte();
        this.t = dataInputStream.readByte();
        this.u = dataInputStream.readShort();
        this.y = dataInputStream.readShort();
        this.z = dataInputStream.readShort();
        this.A = dataInputStream.readShort();
        this.V = dataInputStream.readByte();
        if (this.V == 1) {
            this.W = dataInputStream.readUTF();
            this.U = dataInputStream.readByte();
        }
        int i = dataInputStream.readByte();
        if (i > 0) {
            this.B = new String[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.B[i2] = dataInputStream.readUTF();
            }
            this.C = new String[i];
            for (int i3 = 0; i3 < i; i3++) {
                this.C[i3] = dataInputStream.readUTF();
            }
        }
        if (this.R == 1) {
            this.S = dataInputStream.readInt();
        }
        this.v = bu.a(bu.b(String.valueOf((int) this.u), (byte) 2).toCharArray());
        this.V = (byte) 1;
        if (this.V != 1 || this.U <= 0) {
            return;
        }
        String str = this.W;
        int i4 = t.b - 40;
        short s = this.d;
        byte b5 = this.U;
        if (str == null || this.U == 0) {
            this.X = null;
            this.U = (byte) 0;
            return;
        }
        this.U = b5;
        this.aa = false;
        this.Z = 0;
        this.X = new bw(str, (short) (i4 - 10));
        if (this.X == null || this.X.a() == 0) {
            this.Y = null;
            return;
        }
        int i5 = t.j;
        this.Y = new int[4];
        this.Y[2] = i4;
        this.Y[3] = (this.X.a() * i5) + 10;
        this.Y[0] = (t.b - this.Y[2]) / 2;
        this.Y[1] = s;
    }

    public final void a(Graphics graphics, ai aiVar, int i, int i2, byte b) {
        if ((this.t == -1 && ao.t != null) || (this.I == 100 && ao.t != null)) {
            aiVar.a(graphics, ao.t, (int[]) null, i, i2, this.c - (ao.t.i() / 2), ((this.d - (this.w == null ? (short) 30 : this.w.j())) - t.j) - ao.t.j(), 20, b);
        } else if (this.t == 1 && ao.s != null) {
            aiVar.a(graphics, ao.s, (int[]) null, i, i2, this.c - (ao.s.i() / 2), ((this.d - (this.w == null ? (short) 30 : this.w.j())) - t.j) - ao.s.j(), 20, b);
        }
        if (!this.x || ao.u == null) {
            this.Z = 0;
            return;
        }
        aiVar.a(graphics, ao.u, (int[]) null, i, i2, this.c + (this.w == null ? 8 : this.w.i() / 2), this.d - (this.w == null ? (short) 30 : this.w.j()), 20, b);
        if (this.X == null || this.Y == null || this.U == 0) {
            return;
        }
        graphics.setClip(0, 0, t.b, t.c);
        if (this.Z >= 0) {
            int i3 = this.Y[1] - i2;
            int i4 = i3;
            if (i3 + this.Y[3] > t.c) {
                i4 = (t.c - this.Y[3]) - 4;
            }
            ca.a(graphics, 1009050, 150, this.Y[0], i4, this.Y[2], this.Y[3]);
            if (this.Z >= 3) {
                this.X.a(graphics, this.Y[0] + 5, i4 + 5, 20);
            }
        }
        this.aa = true;
        this.Z++;
    }

    public final void e() {
        if (this.U < 0) {
            return;
        }
        if (this.U <= 0) {
            this.X = null;
            this.Z = 0;
            this.Y = null;
        } else if (this.aa) {
            this.aa = false;
            this.U = (byte) (this.U - 1);
        }
    }
}

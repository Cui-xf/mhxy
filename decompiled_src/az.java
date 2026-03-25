/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import java.io.DataInputStream;
import javax.microedition.lcdui.Graphics;

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
    public bc w = null;
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
    private bw X;
    private int[] Y = null;
    private int Z = 0;
    private boolean aa = false;

    public final short a() {
        if (this.w == null) {
            return (short)(this.c - 8);
        }
        return (short)(this.c - this.w.g() / 2);
    }

    public final short b() {
        if (this.w == null) {
            return (short)(this.d - 30);
        }
        return (short)(this.d - (this.w.h() == 0 ? 30 : (int)this.w.h()));
    }

    public final short c() {
        if (this.w == null) {
            return 16;
        }
        if (this.w == null || this.w.g() == 0) {
            return 16;
        }
        return this.w.g();
    }

    public final short d() {
        if (this.w == null) {
            return 30;
        }
        if (this.w.h() == 0) {
            return 30;
        }
        return this.w.h();
    }

    public final void a(DataInputStream object) {
        int n2;
        az3.a = ((DataInputStream)object).readShort();
        az3.b = ((DataInputStream)object).readUTF();
        ((DataInputStream)object).readShort();
        az3.c = (short)(((DataInputStream)object).readShort() + 8);
        az3.d = (short)(((DataInputStream)object).readShort() + 8);
        ((DataInputStream)object).readShort();
        int n3 = ((DataInputStream)object).readByte();
        az3.e = (byte)(n3 & 1);
        az3.f = (byte)(n3 >>> 1 & 1);
        az3.g = (byte)(n3 >>> 2 & 1);
        az3.h = (byte)(n3 >>> 3 & 1);
        az3.i = (byte)(n3 >>> 4 & 1);
        az3.k = (byte)(n3 >>> 5 & 1);
        az3.l = (byte)(n3 >>> 6 & 1);
        n3 = ((DataInputStream)object).readByte();
        az3.m = (byte)(n3 & 1);
        az3.n = (byte)(n3 >>> 1 & 1);
        az3.o = (byte)(n3 >>> 2 & 1);
        az3.p = (byte)(n3 >>> 3 & 1);
        az3.q = (byte)(n3 >>> 4 & 1);
        az3.D = (byte)(n3 >>> 5 & 1);
        az3.E = (byte)(n3 >>> 6 & 1);
        az3.F = (byte)(n3 >>> 7 & 1);
        n3 = ((DataInputStream)object).readByte();
        az3.G = (byte)(n3 & 1);
        az3.J = (byte)(n3 >>> 1 & 1);
        az3.r = (byte)(n3 >>> 2 & 1);
        az3.s = (byte)(n3 >>> 3 & 1);
        az3.K = (byte)(n3 >>> 4 & 1);
        az3.L = (byte)(n3 >>> 5 & 1);
        az3.M = (byte)(n3 >>> 6 & 1);
        az3.Q = (byte)(n3 >>> 7 & 1);
        n3 = ((DataInputStream)object).readByte();
        az3.R = (byte)(n3 & 1);
        az3.N = (byte)(n3 >>> 1 & 1);
        az3.O = (byte)(n3 >>> 2 & 1);
        az3.P = (byte)(n3 >>> 3 & 1);
        az3.T = (byte)(n3 >>> 4 & 1);
        az3.j = ((DataInputStream)object).readByte();
        az3.H = ((DataInputStream)object).readByte();
        az3.I = ((DataInputStream)object).readByte();
        az3.t = ((DataInputStream)object).readByte();
        az3.u = ((DataInputStream)object).readShort();
        az3.y = ((DataInputStream)object).readShort();
        az3.z = ((DataInputStream)object).readShort();
        az3.A = ((DataInputStream)object).readShort();
        az3.V = ((DataInputStream)object).readByte();
        if (az3.V == 1) {
            az3.W = ((DataInputStream)object).readUTF();
            az3.U = ((DataInputStream)object).readByte();
        }
        if ((n3 = ((DataInputStream)object).readByte()) > 0) {
            az3.B = new String[n3];
            for (n2 = 0; n2 < n3; ++n2) {
                az3.B[n2] = ((DataInputStream)object).readUTF();
            }
            az3.C = new String[n3];
            for (n2 = 0; n2 < n3; ++n2) {
                az3.C[n2] = ((DataInputStream)object).readUTF();
            }
        }
        if (az3.R == 1) {
            az3.S = ((DataInputStream)object).readInt();
        }
        az3.v = bu.a(bu.b(String.valueOf(az3.u), (byte)2).toCharArray());
        az3.V = 1;
        if (az3.V == 1 && az3.U > 0) {
            az az2 = az3;
            byte by2 = az3.U;
            n2 = az3.d;
            n3 = t.b - 40;
            az az3 = null;
            object = az3.W;
            az3 = az2;
            if (object == null || az3.U == 0) {
                az3.X = null;
                az3.U = 0;
                return;
            }
            az3.U = by2;
            az3.aa = false;
            az3.Z = 0;
            az3.X = new bw((String)object, (short)(n3 - 10));
            if (az3.X != null && az3.X.a() != 0) {
                int n4 = t.j;
                az3.Y = new int[4];
                az3.Y[2] = n3;
                az3.Y[3] = az3.X.a() * n4 + 10;
                az3.Y[0] = (t.b - az3.Y[2]) / 2;
                az3.Y[1] = n2;
                return;
            }
            az3.Y = null;
        }
    }

    public final void a(Graphics graphics, ai ai2, int n2, int n3, byte by2) {
        if (this.t == -1 && ao.t != null || this.I == 100 && ao.t != null) {
            ai2.a(graphics, ao.t, null, n2, n3, this.c - ao.t.i() / 2, this.d - (this.w == null ? 30 : (int)this.w.j()) - t.j - ao.t.j(), 20, (int)by2);
        } else if (this.t == 1 && ao.s != null) {
            ai2.a(graphics, ao.s, null, n2, n3, this.c - ao.s.i() / 2, this.d - (this.w == null ? 30 : (int)this.w.j()) - t.j - ao.s.j(), 20, (int)by2);
        }
        if (this.x && ao.u != null) {
            ai2.a(graphics, ao.u, null, n2, n3, this.c + (this.w == null ? 8 : this.w.i() / 2), this.d - (this.w == null ? 30 : (int)this.w.j()), 20, (int)by2);
            int n4 = n3;
            if (this.X != null && this.Y != null && this.U != 0) {
                graphics.setClip(0, 0, (int)t.b, (int)t.c);
                if (this.Z >= 0) {
                    if ((n4 = this.Y[1] - n4) + this.Y[3] > t.c) {
                        n4 = t.c - this.Y[3] - 4;
                    }
                    int n5 = this.Y[3];
                    int n6 = this.Y[2];
                    by2 = (byte)n4;
                    n3 = this.Y[0];
                    Graphics graphics2 = graphics;
                    ca.a(graphics2, 1009050, 150, n3, (int)by2, n6, n5);
                    if (this.Z >= 3) {
                        this.X.a(graphics, this.Y[0] + 5, n4 + 5, 20);
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
        if (this.U < 0) {
            return;
        }
        if (this.U > 0) {
            if (this.aa) {
                this.aa = false;
                this.U = (byte)(this.U - 1);
            }
            return;
        }
        this.X = null;
        this.Z = 0;
        this.Y = null;
    }
}


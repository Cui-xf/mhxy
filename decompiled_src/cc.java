/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import com.yinhan.kjava.main.a;
import java.io.DataInputStream;
import javax.microedition.lcdui.Graphics;

public final class cc {
    private ao b;
    private a c;
    private int[][] d = null;
    private int e;
    private bc[] f = null;
    private int g = 0;
    public short a = 0;
    private short h = 0;
    private short i = 0;
    private int j = 0;
    private String[] k = null;
    private String[] l = null;
    private short[] m = null;
    private int[] n = null;
    private String[] o = null;
    private String[] p = null;
    private int[] q = null;
    private byte[] r = null;
    private String[] s = null;
    private byte[] t = null;
    private byte[] u = null;
    private int[] v = null;
    private String[] w = null;
    private String[] x = null;
    private String[] y = null;
    private String[] z = null;
    private String[] A = null;
    private int[] B = null;
    private String C = null;

    public cc(ao ao2, a a2) {
        this.b = ao2;
        this.c = a2;
    }

    public final void a(short s2) {
        int n2;
        if (this.d == null) {
            this.d = new int[4][4];
            this.f = new bc[4];
        }
        if (this.p != null) {
            for (n2 = 0; n2 < this.f.length && n2 < this.p.length; ++n2) {
                this.f[n2] = com.yinhan.kjava.main.a.ab.a(this.s[n2], (short)0, (short)0, (short)0);
                if (this.f[n2] != null) continue;
                com.yinhan.kjava.main.a.a(this.t[n2], this.u[n2], (byte)0, (byte)0, this.s[n2], (short)0, (short)0, (short)0);
                this.f[n2] = com.yinhan.kjava.main.a.ab.a(this.v[n2], (short)0, (short)0, (short)0);
            }
        }
        this.b.l = 0;
        this.c.aq.j();
        this.c.aq.a("\u4ed9\u4f4d\u6392\u4f4d\u8d5b");
        this.c.as.a(new String[]{"\u98ce\u4e91\u699c", "\u6597\u6cd5\u573a", "\u6597\u6cd5\u8bb0\u5f55"});
        this.c.as.a = (byte)s2;
        this.a = s2;
        this.c.aq.a(this.c.as);
        this.c.aq.a(true);
        if (this.a == 0) {
            this.c.at.b("", t.i, (byte)1);
            this.c.aq.a(this.c.at);
            this.c.au.a(new String[]{"\u64cd\u4f5c", "\u8fd4\u56de"});
            this.c.aq.a(this.c.au);
            this.c.aq.a(t.f, t.g, t.d, t.e);
            this.e = this.c.at.e;
            n2 = (this.c.aq.c - 16 - 2) / 2;
            s2 = (short)((this.c.at.e - 6) / 2);
            for (int i2 = 0; i2 < this.d.length; ++i2) {
                this.d[i2][0] = this.c.at.b + 2 + i2 % 2 * (n2 + 2);
                this.d[i2][1] = this.c.at.c + 2 + i2 / 2 * (s2 + 2);
                this.d[i2][2] = n2;
                this.d[i2][3] = s2;
            }
        } else if (this.a == 1) {
            this.c.ar.a(null, this.w, this.x, this.y);
            this.c.ar.a(this.B);
            this.c.aq.a(this.c.ar);
            this.c.aq.a(t.f, t.g, t.d, t.e);
        } else if (this.a == 2) {
            this.c.at.b(this.C, t.i, (byte)1);
            this.c.aq.a(this.c.at);
            this.c.au.a(new String[]{"\u8d2d\u4e70\u6b21\u6570", "\u8fd4\u56de"});
            this.c.aq.a(this.c.au);
            this.c.aq.a(t.f, t.g, t.d, t.e);
            this.e = t.j * 3 + 4;
            this.c.at.a(this.c.at.b, this.c.at.c, this.c.at.d, this.c.at.e - this.e - 2);
            ao.K = new bw("\u5f53\u524d\u6392\u540d\uff1a" + (this.h <= 0 ? "\u65e0" : "\u7b2c" + this.h + "\u540d") + "\t\u5269\u4f59\u6311\u6218\uff1a" + this.i + "\u6b21\t\u5f53\u524d\u79ef\u5206\uff1a" + this.j, (short)(this.c.at.d - 20));
        }
        this.c.j = this.c.k;
        this.b.k = (short)130;
        this.b.j = (short)130;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(int n2) {
        if (this.b.l == 0) {
            if (this.c.aq != null) {
                this.c.aq.b(n2);
            }
            if (n2 == 0x20000000) {
                this.b.N();
                this.a();
                return;
            }
            if (n2 == 8 || n2 == 2 || n2 == 516 || n2 == 518) {
                this.a(this.c.as.a);
                return;
            }
            if (n2 == 1 || n2 == 514) {
                --this.g;
                this.g = this.g < 0 ? 3 : this.g;
                return;
            }
            if (n2 == 4 || n2 == 520) {
                ++this.g;
                this.g %= 4;
                return;
            }
            if (this.a == 0) {
                for (int i2 = 0; i2 < this.f.length; ++i2) {
                    ai.a(this.f[i2], this.c.ak);
                }
                if (n2 != 0x40000000 && n2 != 517) {
                    if (n2 != 0x10000000) return;
                }
                if (this.g < 0) return;
                if (this.g > 3) return;
                if (this.p == null) return;
                if (this.g >= this.p.length) return;
                ca.a(this.d[this.g][0] + 30, this.d[this.g][1] + 20, new String[]{"\u5c5e\u6027", "\u88c5\u5907"}, false);
                this.b.l = 1;
                return;
            }
            if (this.a == 1) {
                if (n2 != 0x10000000 && n2 != 0x40000000) {
                    if (n2 != 517) return;
                }
                if (this.c.ar.g() <= 0) return;
                ca.a(t.d / 3, this.c.ar.b() + 40, new String[]{"\u6311\u6218", "\u5c5e\u6027", "\u88c5\u5907"}, false);
                this.b.l = 1;
                return;
            }
            if (this.a != 2) return;
            if (n2 != 0x10000000 && n2 != 0x40000000) {
                if (n2 != 517) return;
            }
            this.a = this.c.as.a;
            byte[] byArray = bz.d((short)4690, (byte)2, "");
            if (byArray != null) {
                w w2 = new w(4690, byArray);
                com.yinhan.kjava.main.a.i.a(w2);
                this.c.a((String)null);
                return;
            }
            this.c.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
            return;
        }
        if (this.b.l == 1) {
            ca.b(n2);
            if (n2 != 0x10000000 && n2 != 0x40000000 && n2 != 517) {
                if (n2 != 0x20000000) return;
                this.b.l = 0;
                return;
            }
            this.a = this.c.as.a;
            if (ca.o == 0 && this.a == 1) {
                ca.h = 0;
                this.b.l = (short)2;
                return;
            }
            if (ca.o == 1 && this.a == 1 || ca.o == 0 && this.a == 0) {
                this.a = this.c.as.a;
                String string = this.a == 0 ? this.p[this.g] : this.A[this.c.ar.g() - 1];
                byte[] byArray = bz.a((short)4110, bt.ad, string, (byte)0);
                if (byArray != null) {
                    com.yinhan.kjava.main.a.i.a(new w(4110, byArray));
                    this.c.a((String)null);
                    return;
                }
                this.c.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
                return;
            }
            this.a = this.c.as.a;
            String string = this.a == 0 ? this.p[this.g] : this.A[this.c.ar.g() - 1];
            byte[] byArray = bz.b((short)4111, bt.ad, string);
            if (byArray != null) {
                com.yinhan.kjava.main.a.i.a(new w(4111, byArray));
                this.c.a((String)null);
                return;
            }
            this.c.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
            return;
        }
        if (this.b.l == 2) {
            if (n2 != 0x10000000 && n2 != 0x40000000 && n2 != 517) {
                if (n2 != 0x20000000) return;
                this.b.l = 1;
                return;
            }
            String string = this.a == 0 ? this.o[this.g] : this.z[this.c.ar.g() - 1];
            byte[] byArray = bz.d((short)4690, (byte)1, string);
            if (byArray != null) {
                w w3 = new w(4690, byArray);
                com.yinhan.kjava.main.a.i.a(w3);
                this.c.a((String)null);
                return;
            }
            this.c.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
            return;
        }
        if (this.b.l == 3) {
            this.b.T.b(n2);
            if (n2 != 0x20000000) return;
            this.b.T.j();
            this.b.l = 1;
            return;
        }
        if (this.b.l != 4) return;
        this.b.a(bt.cJ);
        this.b.g(n2);
        if (n2 != 0x20000000) return;
        if (this.b.m != 0) {
            if (this.b.m != 1) return;
            this.b.m = 0;
            return;
        }
        if (bt.cJ != null) {
            bt.o();
        }
        this.b.T.j();
        this.b.l = 1;
    }

    public final void a(Graphics graphics) {
        if (this.c.aq != null) {
            if (this.b.l == 4) {
                this.b.a(graphics, "", ao.q);
                return;
            }
            this.c.aq.a(graphics);
            if (this.a == 0) {
                for (int i2 = 0; i2 < this.d.length; ++i2) {
                    ca.a(graphics, null, this.d[i2][0], this.d[i2][1], this.d[i2][2], this.d[i2][3], i2 == this.g);
                    if (this.p == null || i2 >= this.p.length) continue;
                    graphics.setColor(65535);
                    graphics.drawString(this.l[i2], this.d[i2][0] + (this.d[i2][2] - t.i.stringWidth(this.l[i2])) / 2, this.d[i2][1] + 4, 20);
                    graphics.setColor(0xFFFFFF);
                    graphics.drawString(this.k[i2], this.d[i2][0] + (this.d[i2][2] - t.i.stringWidth(this.k[i2])) / 2, this.d[i2][1] + this.d[i2][3] - t.j - 4, 20);
                    com.yinhan.kjava.main.a.f.a(graphics, this.f[i2], null, 0, 0, this.d[i2][0] + this.d[i2][2] / 2, this.d[i2][1] + this.d[i2][3] / 4 * 3, 20, 0);
                }
            } else if (this.a != 1 && this.a == 2) {
                ca.a(graphics, this.c.at.b, this.c.at.c + this.c.at.e + 1, this.c.at.d, this.e + 1, 1);
                ao.K.a(graphics, this.c.at.b + 10, this.c.at.c + this.c.at.e + 4, 0);
            }
            if (this.b.l == 1) {
                ca.c(graphics);
                return;
            }
            if (this.b.l == 2) {
                ca.a(graphics, "\u786e\u5b9a\u6311\u6218\u8be5\u73a9\u5bb6?", new String[]{"\u786e\u5b9a", "\u53d6\u6d88"});
                return;
            }
            if (this.b.l == 3) {
                this.b.T.a(graphics);
            }
        }
    }

    public final int a(int n2, int n3, int n4) {
        if (this.a == 0 && this.p != null) {
            for (int i2 = 0; i2 < this.d.length && i2 < this.p.length; ++i2) {
                if (n3 < this.d[i2][0] || n3 > this.d[i2][0] + this.d[i2][2] || n4 < this.d[i2][1] || n4 > this.d[i2][1] + this.d[i2][3]) continue;
                if (this.g == i2) {
                    return 0x40000000;
                }
                this.g = (byte)i2;
            }
        }
        return n2;
    }

    public final void a(DataInputStream dataInputStream) {
        int n2;
        this.h = dataInputStream.readShort();
        this.i = dataInputStream.readShort();
        this.j = dataInputStream.readInt();
        int n3 = dataInputStream.readShort();
        if (n3 > 0) {
            this.k = new String[n3];
            this.l = new String[n3];
            this.m = new short[n3];
            this.n = new int[n3];
            this.o = new String[n3];
            this.p = new String[n3];
            this.q = new int[n3];
            this.r = new byte[n3];
            this.s = new String[n3];
            this.t = new byte[n3];
            this.u = new byte[n3];
            this.v = new int[n3];
            for (n2 = 0; n2 < n3; ++n2) {
                this.k[n2] = "\u7b2c" + dataInputStream.readShort() + "\u540d";
                this.l[n2] = dataInputStream.readUTF();
                this.m[n2] = dataInputStream.readShort();
                this.n[n2] = dataInputStream.readInt();
                this.o[n2] = dataInputStream.readUTF();
                this.p[n2] = dataInputStream.readUTF();
                this.q[n2] = ca.a(dataInputStream.readInt());
                this.r[n2] = dataInputStream.readByte();
                this.s[n2] = dataInputStream.readUTF();
                this.t[n2] = dataInputStream.readByte();
                this.u[n2] = dataInputStream.readByte();
                this.v[n2] = bu.a(com.yinhan.kjava.main.a.a(this.t[n2], this.u[n2], (byte)0, (byte)0, false, this.s[n2]), (byte)2);
            }
        } else {
            this.k = null;
            this.l = null;
            this.m = null;
            this.n = null;
            this.o = null;
            this.p = null;
            this.q = null;
            this.r = null;
            this.s = null;
            this.t = null;
            this.u = null;
            this.v = null;
        }
        if ((n2 = dataInputStream.readShort()) > 0) {
            this.w = new String[n2 + 1];
            this.x = new String[n2 + 1];
            this.y = new String[n2 + 1];
            this.z = new String[n2];
            this.A = new String[n2];
            this.B = new int[n2 + 1];
            this.w[0] = "\u6392\u884c";
            this.x[0] = "\u6635\u79f0";
            this.y[0] = "\u6218\u529b";
            this.B[0] = ca.a(0);
            for (n3 = 0; n3 < n2; ++n3) {
                this.w[n3 + 1] = dataInputStream.readShort() + "";
                this.x[n3 + 1] = dataInputStream.readUTF() + "(" + dataInputStream.readShort() + "\u7ea7)";
                this.y[n3 + 1] = dataInputStream.readInt() + "";
                this.z[n3] = dataInputStream.readUTF();
                this.A[n3] = dataInputStream.readUTF();
                int n4 = dataInputStream.readInt();
                this.B[n3 + 1] = ca.a(n4 == 0 ? 15 : 5);
            }
        } else {
            this.w = null;
            this.x = null;
            this.y = null;
            this.z = null;
            this.A = null;
        }
        this.C = dataInputStream.readUTF();
    }

    public final void b(DataInputStream dataInputStream) {
        this.i = dataInputStream.readShort();
    }

    public final void a() {
        int n2;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = null;
        this.B = null;
        if (this.d != null) {
            for (n2 = 0; n2 < this.d.length; ++n2) {
                this.d[n2] = null;
            }
        }
        this.d = null;
        if (this.f != null) {
            for (n2 = 0; n2 < this.f.length; ++n2) {
                this.f[n2] = null;
            }
        }
        this.f = null;
    }
}


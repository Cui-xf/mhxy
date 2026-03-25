/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import com.yinhan.kjava.main.a;
import java.io.DataInputStream;
import javax.microedition.lcdui.Graphics;

public final class cg {
    private ao e;
    private a f;
    private ai g;
    private bc h;
    private bc i;
    public static int a;
    private static String j;
    private static int k;
    private static int l;
    private static int m;
    private static int n;
    private static int o;
    private static String p;
    private static int q;
    private static int r;
    private static int s;
    private static int t;
    private static short u;
    private static short v;
    private static short w;
    private static short x;
    private static short y;
    private static short z;
    private static short A;
    private static short B;
    private static byte C;
    private static int[] D;
    private static int E;
    private static int F;
    public static int b;
    public static int c;
    public static boolean d;
    private int G;
    private an H;
    private an I;
    private int[][] J;
    private int K;
    private String L;
    private String M;

    public cg(ao ao2, a a2, ai ai2) {
        this.e = ao2;
        this.f = a2;
        this.g = ai2;
    }

    public static void a(int n2) {
        a = bt.fA[n2];
        j = bt.fB[n2];
        l = bt.fM[n2];
        m = bt.fN[n2];
        n = bt.fO[n2];
        o = bt.fP[n2];
        u = bt.fE[n2];
        v = bt.fF[n2];
        w = bt.fG[n2];
        x = bt.fH[n2];
        k = -1;
        p = "";
        y = (short)-1;
        q = -1;
        r = -1;
        s = -1;
        t = -1;
        E = 0;
        F = -1;
    }

    public final void a() {
        a = -1;
        j = null;
        u = (short)-1;
        l = -1;
        m = -1;
        n = -1;
        o = -1;
        k = -1;
        p = "";
        y = (short)-1;
        q = -1;
        r = -1;
        s = -1;
        t = -1;
        F = -1;
        E = 0;
        this.h = null;
        this.i = null;
    }

    public static void a(DataInputStream dataInputStream) {
        C = dataInputStream.readByte();
        if (C == 0) {
            int n2 = dataInputStream.readShort();
            D = new int[n2];
            for (int i2 = 0; i2 < n2; ++i2) {
                cg.D[i2] = dataInputStream.readInt();
            }
            int n3 = b;
            a = bt.fA[n3];
            j = bt.fB[n3];
            l = bt.fM[n3];
            m = bt.fN[n3];
            n = bt.fO[n3];
            o = bt.fP[n3];
            u = bt.fE[n3];
            v = bt.fF[n3];
            w = bt.fG[n3];
            x = bt.fH[n3];
            return;
        }
        if (C == 1) {
            k = bt.fA[c];
            dataInputStream.readUTF();
            p = dataInputStream.readUTF();
            q = dataInputStream.readInt();
            r = dataInputStream.readInt();
            s = dataInputStream.readInt();
            t = dataInputStream.readInt();
            E = dataInputStream.readInt();
            for (int i3 = 0; i3 < bt.fA.length; ++i3) {
                if (bt.fA[i3] != k) continue;
                y = bt.fE[i3];
                z = bt.fF[i3];
                A = bt.fG[i3];
                B = bt.fH[i3];
            }
            d = false;
            return;
        }
        if (C == 2) {
            F = dataInputStream.readInt();
        }
    }

    private static void c() {
        bt.fw = null;
        if (bt.fA == null || bt.fA.length <= 0) {
            return;
        }
        int n2 = 0;
        if (k != -1) {
            ++n2;
        }
        bt.fw = new int[D.length - n2];
        n2 = 0;
        for (int i2 = 0; i2 < D.length; ++i2) {
            for (int i3 = 0; i3 < bt.fA.length; ++i3) {
                if (bt.fA[i3] != D[i2] || bt.fA[i3] == k) continue;
                bt.fw[n2] = i3;
                ++n2;
            }
        }
    }

    private void a(int n2, int n3, int n4, int n5, int n6) {
        if (this.J != null && this.J.length > n2) {
            this.J[n2][0] = n3;
            this.J[n2][1] = n4;
            this.J[n2][2] = 50;
            this.J[n2][3] = 50;
        }
    }

    public final int a(int n2, int n3) {
        if (this.e.l == 1) {
            return ca.c(n2, n3);
        }
        int n4 = 0;
        n4 = this.f.aq.b(n2, n3);
        if (n4 <= 0) {
            n4 = this.H.b(n2, n3);
        }
        if (n4 <= 0) {
            n4 = this.I.b(n2, n3);
        }
        if (n4 <= 0) {
            for (int i2 = 0; i2 < this.J.length; ++i2) {
                if (n2 < this.J[i2][0] || n2 > this.J[i2][0] + this.J[i2][2] || n3 < this.J[i2][1] || n3 > this.J[i2][1] + this.J[i2][3]) continue;
                this.K = i2 == 0 ? 0 : 1;
                n4 = 0x10000000;
            }
        }
        return n4;
    }

    public final void b() {
        this.K = 0;
        cg cg2 = this;
        if (cg2.J != null) {
            for (int i2 = 0; i2 < cg2.J.length; ++i2) {
                if (cg2.J[i2] == null) continue;
                cg2.J[i2] = null;
            }
            cg2.J = null;
        }
        this.J = new int[2][4];
        this.H = new an();
        this.I = new an();
        this.L = "\u7ee7\u627f\u524d\t" + j + "\t" + "\u661f\u7ea7: \t" + "\u653b\u51fb\uff1a" + l + "-" + m + "\t" + "\u6cd5\u529f\uff1a" + n + "-" + o;
        this.M = k != -1 ? "\u7ee7\u627f\u540e\t" + j + "\t" + "<0>\u661f\u7ea7: " + p + "\t" + "<2>\u653b\u51fb\uff1a" + q + "-" + r + "\t" + "\u6cd5\u529f\uff1a" + s + "-" + t : "\u7ee7\u627f\u540e";
        this.f.aq.b();
        this.f.aq.a("\u661f\u7ea7\u7ee7\u627f");
        this.f.aq.a(true);
        this.H.a(this.L, t.i, (byte)2);
        this.I.a(this.M, t.i, (byte)2);
        if (a != -1 && u != -1) {
            ao.a(u, v, w, x);
            this.h = com.yinhan.kjava.main.a.ah.a(String.valueOf(u + "_0"), v, w, x);
        } else if (this.h != null) {
            this.h.a();
            this.h = null;
        }
        if (k != -1 && y != -1) {
            ao.a(y, z, A, B);
            this.i = com.yinhan.kjava.main.a.ah.a(String.valueOf(y + "_0"), z, A, B);
        } else if (this.i != null) {
            this.i.a();
            this.i = null;
        }
        if (t.c > 220) {
            this.f.au.a("");
            this.f.aq.a(this.f.au);
        }
        this.G = (this.f.aq.d - 32 - t.j) / 3 - 10;
        this.f.aq.a(t.f, t.g, t.d, t.e);
        this.H.a(this.f.aq.a + 5, this.f.aq.b + 32 + this.G, this.f.aq.c - 11, this.G + 10);
        this.I.a(this.f.aq.a + 5, this.f.aq.b + 32 + 2 * this.G + 10, this.f.aq.c - 11, this.G + 10);
        ca.l = 0;
        this.e.l = 0;
        this.f.j = this.f.k;
        this.e.k = (short)131;
        this.e.j = (short)131;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void b(int n2) {
        int n3;
        if (F == 1) {
            F = 0;
            this.f.b("\u5ba0\u7269\u661f\u7ea7\u7ee7\u627f\u6210\u529f");
            n3 = 0;
            this.e.c(0, this.e.aE, this.e.aA);
            this.e.E();
            ca.o = 3;
            this.e.l = 1;
        }
        if (this.e.l == 0) {
            if (this.f.aq != null) {
                this.f.aq.b(n3);
                this.H.b(n3);
                this.I.b(n3);
            }
            if (a != -1 && this.h != null) {
                ai.a(this.h, this.f.ak);
            }
            if (k != -1 && this.i != null) {
                ai.a(this.i, this.f.ak);
            }
            if (n3 == 8 || n3 == 2) {
                this.K = this.K == 1 ? 0 : 1;
                ca.l = 0;
                return;
            }
            if (n3 != 0x10000000 && n3 != 0x40000000) {
                if (n3 != 0x20000000) return;
                this.e.c(0, this.e.aE, this.e.aA);
                this.e.E();
                ca.o = 3;
                this.e.l = 1;
                return;
            }
            if (this.K == 0) {
                if (a != -1) {
                    ca.a(t.b / 2, t.c / 2, new String[]{"\u7ee7\u627f", "\u66f4\u6362"}, true);
                    this.e.l = 1;
                    return;
                }
                this.e.j(0);
                return;
            }
            if (this.K != 1) return;
            if (a == -1) {
                this.f.b("\u8bf7\u5148\u653e\u5165\u4e3b\u5ba0");
                return;
            }
            if (k != -1) {
                ca.a(t.b / 2, t.c / 2, new String[]{"\u66f4\u6362"}, true);
                this.e.l = 1;
                return;
            }
            cg.c();
            if (bt.fw != null && bt.fw.length > 0) {
                d = true;
                this.e.j(11);
                return;
            }
            this.f.b("\u60a8\u6ca1\u6709\u7b26\u5408\u8981\u6c42\u7684\u526f\u5ba0");
            return;
        }
        if (this.e.l != 1) return;
        ca.b(n3);
        if (n3 == 0x20000000) {
            this.e.l = 0;
            return;
        }
        if (n3 != 0x10000000) {
            if (n3 != 0x40000000) return;
        }
        if (this.K == 0) {
            if (ca.o == 0) {
                if (a != -1 && k != -1) {
                    byte[] byArray = bz.b((byte)2, a, k, E);
                    if (byArray != null) {
                        w w2 = new w(4691, byArray);
                        com.yinhan.kjava.main.a.i.a(w2);
                        this.f.a((String)null);
                        return;
                    }
                    this.f.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
                    return;
                }
                this.f.b("\u8bf7\u5148\u653e\u5165\u526f\u5ba0");
                return;
            }
            if (ca.o != 1) return;
            bt.fw = null;
            if (bt.fA != null && bt.fA.length > 0) {
                void var1_6;
                int n4;
                boolean bl2 = false;
                for (n4 = 0; n4 < bt.fA.length; ++n4) {
                    if (!bt.gf[n4].equals("")) continue;
                    ++var1_6;
                }
                if (var1_6 - true > 0) {
                    void var1_8;
                    bt.fw = new int[var1_6 - true];
                    n4 = 0;
                    boolean bl3 = false;
                    while (var1_8 < bt.fA.length) {
                        if (bt.fA[var1_8] != a && bt.gf[var1_8].equals("")) {
                            bt.fw[n4] = var1_8;
                            ++n4;
                        }
                        ++var1_8;
                    }
                }
            }
            if (bt.fw != null && bt.fw.length > 0) {
                this.e.j(11);
                return;
            }
            this.f.b("\u60a8\u6ca1\u6709\u4e3b\u5ba0\u53ef\u4ee5\u9009\u62e9");
            return;
        }
        if (this.K != 1) return;
        if (ca.o != 0) return;
        cg.c();
        if (bt.fw != null && bt.fw.length > 0) {
            d = true;
            this.e.j(11);
            return;
        }
        this.f.b("\u60a8\u6ca1\u6709\u7b26\u5408\u8981\u6c42\u7684\u526f\u5ba0");
    }

    public final void a(Graphics graphics) {
        if (this.f.aq != null) {
            this.f.aq.a(graphics);
            this.H.a(graphics);
            this.I.a(graphics);
            ca.a(graphics, this.f.aq.a + 5, this.f.aq.b + 32, this.f.aq.c - 11, this.G, 1);
        }
        ca.a(graphics, this.f.aq.a + 5 + 25, this.f.aq.b + 32 + 10, 50, 50, 1);
        graphics.setColor(2917024);
        graphics.fillRect(this.f.aq.a + 5 + 25 + this.f.aq.c / 2, this.f.aq.b + 32 + 10, 50, 50);
        graphics.setColor(9360850);
        graphics.drawRect(this.f.aq.a + 5 + 25 + this.f.aq.c / 2, this.f.aq.b + 32 + 10, 49, 49);
        this.a(0, this.f.aq.a + 5 + 25, this.f.aq.b + 32 + 10, 50, 50);
        this.a(1, this.f.aq.a + 5 + 25 + this.f.aq.c / 2, this.f.aq.b + 32 + 10, 50, 50);
        ca.d(graphics, this.J[this.K][0], this.J[this.K][1], 50, 50);
        if (a != -1 && this.h != null) {
            this.g.a(graphics, this.h, null, 0, 0, this.f.aq.a + 5 + 25, this.f.aq.b + 32 + 10, 0, 0);
        }
        if (k != -1 && this.i != null) {
            this.g.a(graphics, this.i, null, 0, 0, this.f.aq.a + 5 + 25 + this.f.aq.c / 2, this.f.aq.b + 32 + 10, 0, 0);
        } else {
            graphics.setColor(0xFFFF00);
            graphics.drawString("\u526f\u5ba0", this.f.aq.a + 5 + 25 + this.f.aq.c / 2 + 25, this.f.aq.b + 32 + 10 + t.j / 4 + 25, 65);
        }
        if (this.e.l == 1) {
            ca.c(graphics);
        }
    }

    static {
        b = 0;
        c = 0;
        d = false;
    }
}


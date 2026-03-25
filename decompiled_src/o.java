/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import com.yinhan.kjava.main.a;
import java.io.DataInputStream;
import javax.microedition.lcdui.Graphics;

public final class o {
    private ao i;
    private a j;
    private ai k;
    public byte a = 0;
    public byte b = 0;
    public short c = 0;
    public int d = 0;
    private int[][] l;
    public static byte e = (byte)-1;
    private static String m;
    private static String n;
    private static String o;
    private static String p;
    private static String q;
    private static String r;
    private static String s;
    private static short t;
    private static String u;
    public int f;
    public static int g;
    private static short v;
    private static String w;
    private static long x;
    private static String y;
    private static short z;
    private static String A;
    private static byte[] B;
    private static int[] C;
    private static int[] D;
    private static int E;
    private String F;
    private int[][] G;
    private int H;
    private int I;
    private int J;
    private bf K;
    private bf L;
    private int M;
    public static byte h;
    private boolean N;
    private boolean[] O;
    private String[] P;

    public o(ao ao2, a a2, ai ai2) {
        int[] nArray = new int[]{15588137, 15531505, 955345, 6893779};
        this.M = 0;
        this.N = false;
        this.O = null;
        this.P = new String[]{"\u7269\u653b", "\u9632\u5fa1", "\u6cd5\u653b", "\u51b0\u6297", "\u706b\u6297", "\u96f7\u6297", "\u751f\u547d", "\u5185\u529b", "\u901f\u5ea6", "\u66b4\u51fb", "\u8fde\u51fb", "\u53cd\u9707"};
        this.i = ao2;
        this.j = a2;
        this.k = ai2;
    }

    public final void a(int n2, short s2, int n3) {
        this.i.l = 0;
        this.b = (byte)n2;
        this.c = s2;
        this.d = n3;
        this.e();
        if (bt.kr != null) {
            this.l = new int[bt.kr.length][4];
        }
        this.i.a(bt.kr);
        this.j.aq.b();
        this.j.aq.a(bt.kp);
        this.j.aq.a(false);
        this.j.aq.a(30);
        this.j.at.a(bt.a(this.j.l), t.i, (byte)1);
        this.j.au.a("\u786e\u5b9a");
        this.j.aq.a(this.j.at);
        if (t.c > 220) {
            this.j.aq.a(this.j.au);
        }
        this.j.aq.a(t.f, t.g, t.d, t.e);
        n2 = this.j.aq.a + 10 + t.i.stringWidth("\u5b9d\u77f3:");
        s2 = (short)(this.j.aq.b + 37);
        if (this.l != null) {
            for (n3 = 0; n3 < this.l.length; ++n3) {
                int n4 = 17;
                n4 = 17;
                short s3 = s2;
                int n5 = n2 + 2 + n3 * 17;
                int n6 = n3;
                o o2 = this;
                if (o2.l == null || o2.l.length <= n6) continue;
                o2.l[n6][0] = n5;
                o2.l[n6][1] = s3;
                o2.l[n6][2] = 17;
                o2.l[n6][3] = 17;
            }
        }
        this.j.j = this.j.k;
        this.i.k = (short)64;
        this.i.j = (short)64;
    }

    private void e() {
        if (this.l != null) {
            for (int i2 = 0; i2 < this.l.length; ++i2) {
                if (this.l[i2] == null) continue;
                this.l[i2] = null;
            }
            this.l = null;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(int n2) {
        if (this.i.l == 0) {
            if (this.j.aq != null) {
                this.j.aq.b(n2);
            }
            if (n2 == 0x10000000 || n2 == 0x40000000 || n2 == 517) {
                if (bt.kr == null) return;
                if ((this.c != 4 || this.d != 0) && this.c != 5) {
                    if (this.c != 13) return;
                }
                if (bt.kr[this.b] <= -1) return;
                if (bt.kr[this.b] == 0) {
                    ca.a(this.j.aq.a + 10 + t.i.stringWidth("\u5b9d\u77f3:") + 12 + this.b * 17, this.j.aq.b + 45, new String[]{"\u9576\u5d4c", "\u5168\u90e8\u6316\u51fa"}, false);
                    this.a = this.b;
                    this.i.l = 1;
                    return;
                }
                ca.a(this.j.aq.a + 10 + t.i.stringWidth("\u5b9d\u77f3:") + 12 + this.b * 17, this.j.aq.b + 45, new String[]{"\u67e5\u770b", "\u6316\u51fa", "\u5168\u90e8\u6316\u51fa"}, false);
                this.a = this.b;
                this.i.l = (short)2;
                return;
            }
            if (n2 == 8 || n2 == 516) {
                if (bt.kr == null) return;
                this.b = this.b <= 0 ? (byte)(bt.kr.length - 1) : (this.b = (byte)(this.b - 1));
                return;
            }
            if (n2 == 2 || n2 == 518) {
                if (bt.kr == null) return;
                this.b = this.b >= (byte)(bt.kr.length - 1) ? (byte)0 : (this.b = (byte)(this.b + 1));
                return;
            }
            if (n2 != 0x20000000) return;
            e = (byte)-1;
            this.e();
            bt.K();
            if (this.c == 4) {
                n2 = (byte)this.i.aq;
                byte by2 = (byte)this.i.ar;
                this.i.e(this.d);
                this.i.aq = n2;
                this.i.ar = by2;
                this.i.q();
                return;
            }
            if (this.c == 11) {
                n2 = (byte)this.i.aq;
                byte by3 = (byte)this.i.ar;
                this.i.n(this.d);
                this.i.aq = n2;
                this.i.ar = by3;
                return;
            }
            if (this.c == 23) {
                this.i.I();
                return;
            }
            if (this.c == 59) {
                this.i.l((byte)this.d);
                return;
            }
            if (this.c == 22) {
                n2 = (byte)this.j.ax;
                byte by4 = (byte)this.i.ar;
                this.i.b((byte)this.d, true);
                this.j.ax = n2;
                this.i.ar = by4;
                return;
            }
            if (this.c == 102) {
                this.i.V.a(false);
                return;
            }
            if (this.c == 106) {
                this.i.O.a(false);
                return;
            }
            if (this.c == 115) {
                this.i.M.o();
                return;
            }
            if (this.c == 110) {
                this.i.P.a(true);
                return;
            }
            if (this.c == 118) {
                this.i.Q.a(true);
                return;
            }
            if (this.c == 5) {
                this.i.t();
                return;
            }
            if (this.c == 13) {
                this.i.c(false);
                return;
            }
            this.i.l = 0;
            this.i.k = 0;
            this.i.j = 0;
            com.yinhan.kjava.main.a.f.a(this.i.f, ao.h, ao.i, true, false, 1009050);
            return;
        }
        if (this.i.l == 1) {
            ca.b(n2);
            if (n2 != 0x10000000 && n2 != 0x40000000 && n2 != 517) {
                if (n2 != 0x20000000) return;
                this.i.l = 0;
                return;
            }
            if (ca.o == 0) {
                this.i.a((byte)1, new byte[]{30});
                return;
            }
            if (ca.o != 1) return;
            e = 1;
            byte[] byArray = bz.a((short)4687, bt.ko, (byte)2, this.c == 13 ? bt.jG : 0, 0, (byte)0, "", bt.ad);
            if (byArray != null) {
                w w2 = new w(4687, byArray);
                com.yinhan.kjava.main.a.i.a(w2);
                this.j.a((String)null);
                return;
            }
            this.j.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
            return;
        }
        if (this.i.l != 2) return;
        ca.b(n2);
        if (n2 != 0x10000000 && n2 != 0x40000000 && n2 != 517) {
            if (n2 != 0x20000000) return;
            this.i.l = 0;
            return;
        }
        if (ca.o == 0) {
            if (this.c == 13) {
                byte[] byArray = bz.a((short)4687, bt.ko, (byte)0, bt.jG, 0, this.b, "", bt.ad);
                if (byArray != null) {
                    w w3 = new w(4687, byArray);
                    com.yinhan.kjava.main.a.i.a(w3);
                    this.j.a((String)null);
                    return;
                }
                this.j.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
                return;
            }
            byte[] byArray = bz.g((short)4647, bt.ad, bt.ko, this.b);
            if (byArray != null) {
                w w4 = new w(4647, byArray);
                com.yinhan.kjava.main.a.i.a(w4);
                this.j.a((String)null);
                return;
            }
            this.j.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
            return;
        }
        if (ca.o == 1) {
            e = 1;
            if (this.c == 13) {
                byte[] byArray = bz.a((short)4687, bt.ko, (byte)1, bt.jG, 0, this.b, "", bt.ad);
                if (byArray != null) {
                    w w5 = new w(4687, byArray);
                    com.yinhan.kjava.main.a.i.a(w5);
                    this.j.a((String)null);
                    return;
                }
                this.j.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
                return;
            }
            byte[] byArray = bz.f((short)4646, bt.ad, bt.ko, this.b);
            if (byArray != null) {
                w w6 = new w(4646, byArray);
                com.yinhan.kjava.main.a.i.a(w6);
                this.j.a((String)null);
                return;
            }
            this.j.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
            return;
        }
        if (ca.o != 2) return;
        e = 1;
        byte[] byArray = bz.a((short)4687, bt.ko, (byte)2, this.c == 13 ? bt.jG : 0, 0, (byte)0, "", bt.ad);
        if (byArray != null) {
            w w7 = new w(4687, byArray);
            com.yinhan.kjava.main.a.i.a(w7);
            this.j.a((String)null);
            return;
        }
        this.j.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
    }

    public final void a(Graphics graphics) {
        if (this.j.aq != null) {
            this.j.aq.a(30);
            this.j.aq.a(graphics);
            ca.a(graphics, this.j.aq.a + 5, this.j.aq.b + 32, this.j.aq.c - 11, 30, 1);
            ca.a(graphics, "\u5b9d\u77f3", this.j.aq.a + 10, this.j.aq.b + 35 + t.a(25), 20, 0xFFFF00, 0);
        }
        if (bt.kr != null) {
            this.i.a(graphics, this.j.aq.a + 10 + t.i.stringWidth("\u5b9d\u77f3:"), this.j.aq.b + 37, 17, 17, bt.kr.length, 1);
            for (int n2 = 0; n2 < bt.kr.length; n2 = (int)((byte)(n2 + 1))) {
                if (bt.kr[n2] <= -1) {
                    ca.a(graphics, 0x7777777, 207, this.j.aq.a + 10 + t.i.stringWidth("\u5b9d\u77f3:") + 2 + n2 * 17, this.j.aq.b + 39, 17, 17);
                }
                if (bt.kr[n2] <= 0) continue;
                com.yinhan.kjava.main.a.f.a(graphics, ao.b(bt.kr[n2]), null, null, 0, 0, this.j.aq.a + 10 + t.i.stringWidth("\u5b9d\u77f3:") + 2 + n2 * 17, this.j.aq.b + 39, 0, 0);
            }
            if (this.c == 4 && this.d == 0 || this.c == 5 || this.c == 13) {
                graphics.setColor(0xFFFF00);
                graphics.drawRect(this.j.aq.a + 10 + t.i.stringWidth("\u5b9d\u77f3:") + 2 + this.b * 17, this.j.aq.b + 39, 17, 17);
            }
        }
        if (this.i.l == 1 || this.i.l == 2) {
            ca.c(graphics);
        }
    }

    public final int a(int n2, int n3, int n4) {
        if (this.l != null) {
            for (int i2 = 0; i2 < this.l.length; ++i2) {
                if (n3 < this.l[i2][0] || n3 > this.l[i2][0] + this.l[i2][2] || n4 < this.l[i2][1] || n4 > this.l[i2][1] + this.l[i2][3]) continue;
                if (this.b == i2) {
                    return 0x10000000;
                }
                this.b = (byte)(i2 - 1);
                return 2;
            }
        }
        return n2;
    }

    public final void a() {
        this.i.l = 0;
        this.j.aq.b();
        this.j.aq.a("\u88c5\u5907\u6253\u5b54");
        this.j.ar.a(null, bt.kn, null, null);
        this.j.au.a("\u786e\u5b9a");
        if (bt.km != null && bt.km.length > 0) {
            this.j.at.a(bt.i(this.j.l, this.j.ar.g()), t.i, (byte)2);
        } else {
            this.j.at.a(null, t.i, (byte)2);
        }
        this.j.at.a((byte)1);
        this.j.aq.a(this.j.ar);
        this.j.aq.a(this.j.at);
        if (t.c > 220) {
            this.j.aq.a(this.j.au);
        }
        this.j.aq.a(t.f, t.g, t.d, t.e);
        this.j.k = (short)7;
        this.j.j = (short)7;
        this.i.k = (short)65;
        this.i.j = (short)65;
    }

    public final void b(int n2) {
        if (this.i.l == 0) {
            if (this.j.aq != null) {
                this.j.aq.b(n2);
            }
            if (n2 == 514 || n2 == 520 || n2 == 1 || n2 == 4) {
                if (bt.km != null && bt.km.length > 0) {
                    this.j.at.a(bt.i(this.j.l, this.j.ar.g()), t.i, (byte)2);
                    this.j.at.a((byte)1);
                    return;
                }
            } else if (n2 == 0x10000000 || n2 == 0x40000000 || n2 == 517) {
                if (bt.km != null && bt.km.length > 0) {
                    this.i.e(10);
                    return;
                }
            } else if (n2 == 0x20000000) {
                this.i.m();
                return;
            }
        } else if (this.i.l == 1) {
            ca.b(n2);
            if (n2 == 0x10000000 || n2 == 0x40000000 || n2 == 517) {
                if (ca.o == 0) {
                    this.i.e(10);
                    return;
                }
            } else if (n2 == 0x20000000) {
                this.i.l = 0;
            }
        }
    }

    public final void b(Graphics graphics) {
        if (this.i.l == 0 && this.j.aq != null) {
            this.j.aq.a(graphics);
        }
        if (this.i.l == 1) {
            ca.c(graphics);
        }
    }

    public final void b() {
        this.j.b("\u6b64\u754c\u9762\u6b63\u5728\u7ef4\u62a4\uff0c\u5982\u6709\u4e0d\u4fbf\u4e4b\u5904\u8bf7\u8c05\u89e3!");
    }

    public final void c(int n2) {
        if (n2 == 0x20000000) {
            this.i.k = 0;
            this.i.j = 0;
        }
    }

    public static void a(DataInputStream dataInputStream) {
        m = dataInputStream.readUTF();
        dataInputStream.readShort();
        n = dataInputStream.readUTF();
        o = dataInputStream.readUTF();
        p = dataInputStream.readUTF();
        q = dataInputStream.readUTF();
        r = dataInputStream.readUTF();
        s = dataInputStream.readUTF();
        t = dataInputStream.readShort();
        u = dataInputStream.readUTF();
    }

    public final void c() {
        this.j.aq.b();
        this.j.aq.a(m);
        an an2 = this.j.at;
        StringBuffer stringBuffer = this.j.l;
        if (stringBuffer == null) {
            stringBuffer = new StringBuffer();
        } else {
            t.a(stringBuffer);
        }
        stringBuffer.append(m);
        stringBuffer.append("\t");
        if (n != null && n.length() > 0) {
            stringBuffer.append(n);
            stringBuffer.append('\t');
        }
        if (o != null && o.length() > 0) {
            stringBuffer.append(o);
            stringBuffer.append('\t');
        }
        if (p != null && p.length() > 0) {
            stringBuffer.append(p);
            stringBuffer.append('\t');
        }
        if (q != null && q.length() > 0) {
            stringBuffer.append(q);
            stringBuffer.append('\t');
        }
        if (r != null && r.length() > 0) {
            stringBuffer.append(r);
            stringBuffer.append('\t');
        }
        if (s != null && s.length() > 0) {
            stringBuffer.append(s);
            stringBuffer.append('\t');
        }
        if (t > 0) {
            stringBuffer.append("\u8981\u6c42\u88c5\u5907\u7b49\u7ea7:");
            stringBuffer.append(t);
            stringBuffer.append('\t');
        }
        if (u != null && !u.equals("")) {
            stringBuffer.append(u);
        }
        an2.a(stringBuffer.toString(), t.i, (byte)1);
        this.j.au.a("\u786e\u5b9a");
        this.j.aq.a(this.j.at);
        if (t.c > 220) {
            this.j.aq.a(this.j.au);
        }
        this.j.aq.a(t.f, t.g, t.d, t.e);
        this.j.k = (short)7;
        this.j.j = (short)7;
        this.i.k = (short)67;
        this.i.j = (short)67;
    }

    public final void d(int n2) {
        if (this.j.aq != null) {
            this.j.aq.b(n2);
        }
        if (n2 == 0x20000000) {
            m = null;
            u = null;
            n = null;
            o = null;
            q = null;
            r = null;
            s = null;
            this.a((int)this.a, this.c, this.d);
        }
    }

    public final void c(Graphics graphics) {
        if (this.j.aq != null) {
            this.j.aq.a(graphics);
        }
    }

    public final void b(DataInputStream dataInputStream) {
        g = dataInputStream.readInt();
        v = dataInputStream.readShort();
        w = dataInputStream.readUTF();
        x = dataInputStream.readLong();
        y = dataInputStream.readUTF();
        z = dataInputStream.readShort();
        A = dataInputStream.readUTF();
        int n2 = dataInputStream.readByte();
        if (n2 > 0) {
            B = new byte[n2];
            C = new int[n2];
            D = new int[n2];
            for (int i2 = 0; i2 < n2; ++i2) {
                o.B[i2] = dataInputStream.readByte();
                o.C[i2] = dataInputStream.readInt();
                o.D[i2] = dataInputStream.readInt();
            }
        } else {
            B = null;
            C = null;
            D = null;
        }
        E = dataInputStream.readInt();
        this.M = 0;
        dataInputStream.readUTF();
        dataInputStream.readByte();
        bt.N();
        o.f(g);
        o.f((int)x);
        this.g();
    }

    private static void f(int n2) {
        if (bt.bC == null || bt.bC.size() <= 0) {
            return;
        }
        bn bn2 = null;
        for (int i2 = 0; i2 < bt.bC.size(); ++i2) {
            bn2 = (bn)bt.bC.elementAt(i2);
            if (bn2 == null || bn2.a != n2) continue;
            bn2.v = (byte)(bn2.v + 1);
        }
    }

    private void f() {
        if (this.G != null) {
            for (int i2 = 0; i2 < this.G.length; ++i2) {
                if (this.G[i2] == null) continue;
                this.G[i2] = null;
            }
            this.G = null;
        }
    }

    private void g() {
        this.F = null;
        if (this.f == 0) {
            if (w != null) {
                this.F = w;
                return;
            }
        } else if (this.f == 1 && A != null) {
            this.F = y;
        }
    }

    public final void d() {
        g = -1;
        v = (short)-1;
        w = null;
        x = -1L;
        z = (short)-1;
        y = null;
        A = null;
        B = null;
        C = null;
        D = null;
        this.M = 0;
        E = 0;
        this.O = null;
        h = 0;
        this.N = false;
        bt.N();
    }

    public final void a(boolean bl2) {
        if (bl2) {
            this.f = 0;
            this.M = 0;
        }
        this.f();
        if (B != null) {
            this.O = new boolean[B.length];
            this.G = new int[2 + B.length][4];
        } else {
            this.G = new int[2][4];
        }
        if (this.K == null) {
            this.K = com.yinhan.kjava.main.a.ag.a("jianding_02");
            this.L = com.yinhan.kjava.main.a.ag.a("jianding_01");
        }
        if (g != -1) {
            this.i.a(new short[]{v});
        }
        if (x != -1L) {
            this.i.a(new short[]{z});
        }
        this.j.aq.b();
        this.j.aq.a("\u88c5\u5907\u6d17\u70bc");
        this.j.aq.a(false);
        this.J = Math.max(ao.x.c, t.j) * 7 + 16;
        this.H = ao.x.c + t.j + 8;
        this.I = t.e - 32 - l.b() - (this.J + 4) - this.H;
        this.j.aq.a(this.H + this.I);
        this.j.at.a(null, t.i, (byte)1);
        this.j.aq.a(this.j.at);
        this.j.at.a((byte)1);
        this.j.au.a("\u786e\u5b9a");
        this.j.aq.a(this.j.au);
        this.j.aq.a(t.f, t.g, t.d, t.e);
        boolean bl3 = false;
        int n2 = 0;
        if (this.G != null) {
            for (int i2 = 0; i2 < this.G.length; ++i2) {
                int n3;
                if (i2 == 0) {
                    n3 = this.j.aq.a + this.j.aq.c / 4 - 8;
                    n2 = this.j.aq.b + 32 + this.H - 4 - 17;
                } else if (i2 == 1) {
                    n3 = this.j.aq.a + this.j.aq.c / 4 * 3 - 8;
                } else if (i2 > 1) {
                    n3 = this.j.aq.a + (this.j.aq.c - 17) / 2;
                    n2 = this.j.aq.b + 32 + this.H + this.I + 4 + 2 + (i2 - 1) * (Math.max(ao.x.c, t.j) + 1);
                }
                this.a(i2, n3, n2, 17, 17);
            }
        }
        this.g();
        ca.l = 0;
        this.i.l = 0;
        this.j.j = this.j.k;
        this.i.k = (short)106;
        this.i.j = (short)106;
    }

    public final void e(int n2) {
        if (this.i.l == 0) {
            if (this.j.aq != null) {
                this.j.aq.b(n2);
            }
            if (n2 == 8 || n2 == 1) {
                --this.f;
                if (this.f < 0) {
                    this.f = this.G.length - 1;
                }
                ca.l = 0;
                this.g();
            } else if (n2 == 2 || n2 == 4) {
                ++this.f;
                if (this.f >= this.G.length) {
                    this.f = 0;
                }
                ca.l = 0;
                this.g();
            } else if (n2 == 0x10000000 || n2 == 0x40000000) {
                if (this.f == 0) {
                    if (g == -1) {
                        this.N = true;
                        this.i.a((byte)0, new byte[]{2});
                    } else {
                        ca.a(this.G[0][0] + 8, this.G[0][1] + 8, new String[]{"\u6d17\u70bc", "\u67e5\u770b", "\u53d6\u51fa"}, false);
                        this.i.l = 1;
                    }
                } else if (this.f == 1) {
                    if (g == -1) {
                        this.j.b("\u8bf7\u5148\u653e\u5165\u6d17\u70bc\u88c5\u5907");
                    } else if (x == -1L) {
                        this.i.a((byte)0, new byte[]{5});
                    } else {
                        ca.a(this.G[1][0] + 8, this.G[1][1] + 8, new String[]{"\u53d6\u51fa"}, false);
                        this.i.l = 1;
                    }
                } else if (this.O != null && this.f - 2 < this.O.length) {
                    if (!this.O[this.f - 2]) {
                        if (this.M + 1 > E) {
                            this.j.b("\u6ca1\u6709\u8db3\u591f\u7684\u6d17\u70bc\u9501");
                        } else {
                            this.O[this.f - 2] = true;
                            ++this.M;
                        }
                    } else {
                        this.O[this.f - 2] = false;
                        --this.M;
                    }
                }
            } else if (n2 == 0x20000000) {
                this.d();
                this.f();
                this.F = null;
                if (this.i.aw) {
                    this.i.aw = false;
                    this.i.t();
                } else if (this.i.aJ) {
                    this.i.aJ = false;
                    this.i.c(false);
                } else {
                    this.i.l();
                    this.i.c(2);
                }
            }
        } else if (this.i.l == 1) {
            ca.b(n2);
            if (n2 == 0x10000000 || n2 == 0x40000000) {
                if (ca.o == 0) {
                    Object object = null;
                    if (this.f == 0) {
                        object = null;
                        if (this.O != null) {
                            object = new byte[this.M];
                            int n3 = 0;
                            for (int i2 = 0; i2 < this.O.length; ++i2) {
                                if (!this.O[i2]) continue;
                                object[n3] = B[i2];
                                n3 = (byte)(n3 + 1);
                            }
                        }
                        object = bz.a((short)4688, g, x, (byte)3, h, bt.jG, object, bt.ad);
                    } else if (this.f == 1) {
                        object = bz.a((short)4688, g, x, (byte)2, h, bt.jG, B, bt.ad);
                    }
                    if (object != null) {
                        object = new w(4688, (byte[])object);
                        com.yinhan.kjava.main.a.i.a((w)object);
                        this.j.a((String)null);
                    } else {
                        this.j.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
                    }
                } else if (ca.o == 1) {
                    if (this.i.aw && !this.N) {
                        bt.a(this.i.av);
                    } else if (this.i.aJ && !this.N) {
                        bt.b((int)ao.l(this.i.aq));
                    } else {
                        bn bn2;
                        bn bn3;
                        block54: {
                            n2 = g;
                            bn bn4 = null;
                            for (int i3 = 0; i3 < bt.bC.size(); ++i3) {
                                bn4 = (bn)bt.bC.elementAt(i3);
                                if (bn4 == null || bn4.a != n2) continue;
                                bn3 = bn4;
                                break block54;
                            }
                            bn3 = bn2 = null;
                        }
                        if (bn3 != null) {
                            bt.a(bn2);
                        } else {
                            this.j.b("\u88c5\u5907\u4e0d\u5b58\u5728");
                        }
                    }
                    this.i.O.a(0, this.i.k, -1);
                } else if (ca.o == 2) {
                    this.d();
                    this.a(true);
                    this.g();
                    this.i.l = 0;
                }
            } else if (n2 == 0x20000000) {
                ca.l = 0;
                this.g();
                this.i.l = 0;
            }
        }
        this.j.a = 0;
    }

    private void a(int n2, int n3, int n4, int n5, int n6) {
        if (this.G != null && this.G.length > n2) {
            this.G[n2][0] = n3;
            this.G[n2][1] = n4;
            this.G[n2][2] = 17;
            this.G[n2][3] = 17;
        }
    }

    public final int b(int n2, int n3, int n4) {
        if (this.G != null) {
            for (int i2 = 0; i2 < this.G.length; ++i2) {
                if (n3 < this.G[i2][0] || n3 > this.G[i2][0] + this.G[i2][2] || n4 < this.G[i2][1] || n4 > this.G[i2][1] + this.G[i2][3]) continue;
                if (this.f == i2) {
                    return 0x40000000;
                }
                this.f = i2;
                ca.l = 0;
                this.g();
                return n2;
            }
        }
        return n2;
    }

    public final void d(Graphics graphics) {
        int n2;
        int n3 = this.j.aq.b + 32 + this.H + this.I + 4;
        int n4 = (this.j.aq.c - 21 - 31) / 2;
        int n5 = this.j.aq.a + 10;
        int n6 = n5 + n4 + 31;
        if (this.j.aq != null) {
            this.j.aq.a(graphics);
            ca.a(graphics, this.j.aq.a + 5, this.j.aq.b + 32, this.j.aq.c - 11, this.H, 1);
            ca.a(graphics, this.j.aq.a + 5, this.j.aq.b + 32 + this.H + 1, this.j.aq.c - 11, this.I - 2, 1);
            ca.a(graphics, n5, n3, n4, this.J - 9, 1);
            ca.a(graphics, n6, n3, n4, this.J - 9, 1);
        }
        if (this.G != null) {
            for (n2 = 0; n2 < this.G.length; ++n2) {
                bf bf2;
                Graphics graphics2;
                ai ai2;
                if (n2 < 2) {
                    ai2 = this.k;
                    graphics2 = graphics;
                    bf2 = ao.x;
                } else {
                    if (this.O == null || n2 - 2 >= this.O.length) continue;
                    ai2 = this.k;
                    graphics2 = graphics;
                    bf2 = this.O[n2 - 2] ? this.K : this.L;
                }
                ai2.a(graphics2, bf2, null, null, 0, 0, this.G[n2][0], this.G[n2][1], 0, 0);
            }
        }
        graphics.setColor(255);
        graphics.drawString("\u88c5\u5907\u5b54", this.G[0][0] + 8, this.G[0][1] - 2, 33);
        if (g != -1) {
            this.k.a(graphics, ao.b(v), null, null, 0, 0, this.G[0][0], this.G[0][1], 0, 0);
        }
        graphics.setColor(255);
        graphics.drawString("\u6d17\u70bc\u7b26", this.G[1][0] + 8, this.G[1][1] - 2, 33);
        if (x != -1L) {
            this.k.a(graphics, ao.b(z), null, null, 0, 0, this.G[1][0], this.G[1][1], 0, 0);
        }
        graphics.drawString("\u6d17\u70bc\u9501", this.G[0][0] + 17, this.j.aq.b + 32 + this.H + 3, 20);
        graphics.drawString(this.M + " / " + E, this.G[1][0] - 5, this.j.aq.b + 32 + this.H + 3, 20);
        n2 = n3 + 2;
        n3 = Math.max(ao.x.c, t.j);
        graphics.drawString("\u5f53    \u524d", n5 + n4 / 2, n2, 17);
        graphics.drawString("\u6700    \u5927", n6 + n4 / 2, n2, 17);
        if (C != null) {
            for (int i2 = 0; i2 < C.length; ++i2) {
                graphics.drawString(this.P[B[i2]], n5 + 4, n2 += n3 + 1, 20);
                graphics.drawString("+" + C[i2], n5 + n4 - 4, n2, 24);
                graphics.drawString(this.P[B[i2]], n6 + 4, n2, 20);
                graphics.drawString("+" + D[i2], n6 + n4 - 4, n2, 24);
            }
        }
        ca.d(graphics, this.G[this.f][0], this.G[this.f][1], 17, 17);
        if (this.i.l == 0) {
            if (this.F != null || this.F != "") {
                if (this.f == 1) {
                    ca.b(graphics, this.F, this.G[1][0] + 8, this.G[1][1] + 8, t.c - 5, 1);
                    return;
                }
                if (this.f == 0) {
                    ca.b(graphics, this.F, this.G[0][0] + 8, this.G[0][1] + 8, t.c - 5, 1);
                    return;
                }
            }
        } else if (this.i.l == 1) {
            ca.c(graphics);
        }
    }

    static {
        h = 0;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import com.yinhan.kjava.main.a;
import java.io.DataInputStream;
import javax.microedition.lcdui.Graphics;

public final class v {
    private ao h;
    private a i;
    public static int[] a;
    private static String[] j;
    private static String[] k;
    public static String b;
    private static byte l;
    public static String c;
    public int d = 0;
    private String[] m = new String[]{"\u540c\u610f(\u70b9\u51fb\u7533\u8bf7\u7ed3\u5a5a)", "\u62d2\u7edd"};
    public static byte e;
    public static String f;
    public int g = 0;
    private String[] n = new String[]{"\u79bb\u5a5a(\u70b9\u51fb\u7533\u8bf7\u79bb\u5a5a)", "\u53d6\u6d88\u79bb\u5a5a"};
    private static int[] o;
    private static String[] p;

    public v(ao ao2, a a2) {
        this.h = ao2;
        this.i = a2;
    }

    public final void a(String object, String string, long l2) {
        byte[] byArray = bz.a((short)4857, bt.ad, (String)object, string, l2);
        object = byArray;
        if (byArray != null) {
            com.yinhan.kjava.main.a.i.a(new w(4857, (byte[])object));
            this.h.k = 0;
            this.h.j = 0;
            this.i.a((String)null);
            return;
        }
        this.i.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
    }

    public final void a() {
        byte[] byArray = bz.m((short)4858, bt.ad, bt.gQ);
        if (byArray != null) {
            com.yinhan.kjava.main.a.i.a(new w(4858, byArray));
            this.h.k = 0;
            this.h.j = 0;
            this.i.a((String)null);
            return;
        }
        this.i.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
    }

    public static void a(DataInputStream dataInputStream) {
        bt.gQ = dataInputStream.readShort();
        int n2 = dataInputStream.readShort();
        bt.gR = dataInputStream.readByte();
        if (n2 > 0) {
            a = new int[n2];
            j = new String[n2];
            k = new String[n2];
            for (int i2 = 0; i2 < n2; ++i2) {
                v.a[i2] = dataInputStream.readInt();
                v.j[i2] = dataInputStream.readUTF();
                v.k[i2] = dataInputStream.readUTF();
            }
            return;
        }
        v.g();
    }

    private static void g() {
        a = null;
        j = null;
        k = null;
    }

    public static void b(DataInputStream dataInputStream) {
        b = dataInputStream.readUTF();
    }

    public final void a(int n2) {
        this.i.aq.j();
        this.i.aq.a("\u6c42\u7231\u5ba3\u8a00");
        this.i.aq.a(false);
        this.i.ar.a(null, k, null, j);
        this.i.ar.a(n2);
        this.i.au.a("\u67e5\u770b");
        this.i.au.a(true);
        this.i.aq.a(this.i.ar);
        this.i.aq.a(this.i.au);
        this.i.aq.a(t.f, t.g, t.d, t.e);
        this.h.l = 0;
        this.i.j = this.i.k;
        this.h.k = (short)90;
        this.h.j = (short)90;
    }

    public final void b() {
        this.i.aq.j();
        this.i.aq.a("\u6c42\u7231\u5ba3\u8a00");
        this.i.aq.a(false);
        this.i.at.a(b, t.i, (byte)2);
        this.i.au.a("\u786e\u5b9a");
        this.i.aq.a(this.i.at);
        this.i.aq.a(this.i.au);
        this.i.aq.a(t.f, t.g, t.d, t.e);
        this.h.l = (short)2;
        this.i.j = this.i.k;
        this.h.k = (short)90;
        this.h.j = (short)90;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void b(int n2) {
        if (this.h.l == 0) {
            if (this.i.aq != null) {
                this.i.aq.b(n2);
            }
            if (a != null && (n2 == 0x10000000 || n2 == 0x40000000 || n2 == 517)) {
                ca.a(80 + t.f, t.j + 20 + this.i.ar.i() * t.j + t.g, new String[]{"\u67e5\u770b"}, false);
                this.h.l = 1;
                this.h.aA = this.i.ar.h();
                this.h.aE = this.i.ar.g();
            }
            if (n2 == 0x20000000) {
                this.h.l = 0;
                this.h.k = 0;
                this.h.j = 0;
                return;
            }
            if (n2 == 1024) {
                if (bt.gQ > 1 && bt.gR == 1) {
                    bt.gQ = bt.gQ - 1 <= 1 ? (short)1 : (short)(bt.gQ - 1);
                    this.a();
                    return;
                }
                if (bt.gQ <= 1) return;
                if (bt.gR != 0) return;
                bt.gQ = bt.gQ - 1 < 1 ? (short)1 : (short)(bt.gQ - 1);
                this.a();
                return;
            }
            if (n2 != 2048) return;
            if (bt.gQ <= 1 && bt.gR == 1) {
                bt.gQ = (short)(bt.gQ + 1);
                this.a();
                return;
            }
            if (bt.gQ <= 1) return;
            if (bt.gR != 1) return;
            bt.gQ = (short)(bt.gQ + 1);
            this.a();
            return;
        }
        if (this.h.l == 1) {
            ca.b(n2);
            if (n2 != 0x10000000 && n2 != 0x40000000 && n2 != 517) {
                if (n2 != 0x20000000) return;
                this.h.l = 0;
                return;
            }
            if (ca.o != 0) return;
            n2 = a[this.i.ar.g()];
            byte[] byArray = bz.A((short)4859, bt.ad, n2);
            if (byArray != null) {
                com.yinhan.kjava.main.a.i.a(new w(4859, byArray));
                this.h.k = 0;
                this.h.j = 0;
                this.i.a((String)null);
                return;
            }
            this.i.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
            return;
        }
        if (this.h.l != 2) return;
        if (this.i.aq != null) {
            this.i.aq.b(n2);
        }
        if (n2 != 0x10000000 && n2 != 0x40000000 && n2 != 517) {
            if (n2 != 0x20000000) return;
        }
        this.a(this.h.aE);
        b = null;
    }

    public final void a(Graphics graphics) {
        if (this.h.l == 0 || this.h.l == 1) {
            if (this.i.aq != null) {
                this.i.aq.a(graphics);
            }
            if (this.h.l == 1) {
                ca.c(graphics);
                return;
            }
        } else if (this.h.l == 2 && this.i.aq != null) {
            this.i.aq.a(graphics);
        }
    }

    public final void a(byte by2) {
        byte[] byArray = bz.m((short)4860, bt.ad, by2);
        if (byArray != null) {
            com.yinhan.kjava.main.a.i.a(new w(4860, byArray));
            this.h.k = 0;
            this.h.j = 0;
            this.i.a((String)null);
            return;
        }
        this.i.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
    }

    public static void c(DataInputStream dataInputStream) {
        l = dataInputStream.readByte();
    }

    public final void c() {
        this.i.d.a();
        this.i.aq.j();
        this.i.aq.a("\u7533\u8bf7\u7ed3\u5a5a");
        this.i.aq.a(false);
        this.i.at.b(c, t.i, (byte)2);
        this.i.at.a((byte)1);
        this.i.aq.a(this.i.at);
        int n2 = 2 * t.j + 16;
        m m2 = this.i.aq;
        this.i.aq.g = n2;
        this.i.aq.a(t.f, t.g, t.d, t.e);
        this.h.l = 0;
        this.i.j = this.i.k;
        this.h.k = (short)91;
        this.h.j = (short)91;
    }

    public final void c(int n2) {
        if (this.h.l == 0) {
            if (this.i.aq != null) {
                this.i.aq.b(n2);
            }
            if (n2 == 514 || n2 == 1) {
                this.d = this.d == 0 ? 1 : 0;
                return;
            }
            if (n2 == 520 || n2 == 4) {
                this.d = this.d == 1 ? 0 : 1;
                return;
            }
            if (n2 == 0x40000000 || n2 == 517 || n2 == 0x10000000) {
                if (this.d == 0) {
                    if (l != 1) {
                        this.a((byte)1);
                        return;
                    }
                } else if (this.d == 1) {
                    this.d = 0;
                    this.a((byte)2);
                    return;
                }
            } else if (n2 == 0x20000000) {
                this.d = 0;
                this.a((byte)2);
                this.h.l = 0;
                this.h.k = 0;
                this.h.j = 0;
            }
        }
    }

    public final void b(Graphics graphics) {
        if (this.h.l == 0) {
            int n2 = 0;
            int n3 = 0;
            if (this.i.aq != null) {
                n2 = this.i.aq.a + 5;
                n3 = this.i.aq.b + this.i.aq.d - (2 * t.j + 16) - 6;
                ca.a(graphics, n2, n3, this.i.aq.c - 11, 2 * t.j + 16, 1);
                this.i.aq.a(graphics);
            }
            int n4 = 0;
            for (int i2 = 0; i2 < 2; ++i2) {
                n4 = 0xFFFFFF;
                if (l != 0) {
                    n4 = this.d == 1 ? (l == 1 ? 0x858585 : 0xFFFFFF) : 0xFFFFFF;
                    this.m[0] = l == 1 ? "\u540c\u610f(\u7b49\u5f85\u5bf9\u65b9\u786e\u8ba4)" : "\u540c\u610f(\u5bf9\u65b9\u5df2\u786e\u8ba4)";
                } else {
                    this.m[0] = "\u540c\u610f(\u70b9\u51fb\u7533\u8bf7\u7ed3\u5a5a)";
                }
                ca.a(graphics, this.m[i2], n2 + 4, n3 + 5 + i2 * (t.j + 5), 20, this.d == i2 ? 0xFF0000 : n4, 0);
            }
        }
    }

    public final void b(byte by2) {
        byte[] byArray = bz.n((short)4861, bt.ad, by2);
        if (byArray != null) {
            com.yinhan.kjava.main.a.i.a(new w(4861, byArray));
            this.h.k = 0;
            this.h.j = 0;
            this.i.a((String)null);
            return;
        }
        this.i.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
    }

    public static void d(DataInputStream dataInputStream) {
        e = dataInputStream.readByte();
    }

    public final void d() {
        this.i.aq.j();
        this.i.aq.a("\u7533\u8bf7\u79bb\u5a5a");
        this.i.aq.a(false);
        this.i.at.b(f, t.i, (byte)2);
        this.i.at.a((byte)1);
        this.i.aq.a(this.i.at);
        int n2 = 2 * t.j + 16;
        m m2 = this.i.aq;
        this.i.aq.g = n2;
        this.i.aq.a(t.f, t.g, t.d, t.e);
        this.h.l = 0;
        this.i.j = this.i.k;
        this.h.k = (short)92;
        this.h.j = (short)92;
    }

    public final void d(int n2) {
        if (this.h.l == 0) {
            if (this.i.aq != null) {
                this.i.aq.b(n2);
            }
            if (n2 == 514 || n2 == 1) {
                this.g = this.g == 0 ? 1 : 0;
                return;
            }
            if (n2 == 520 || n2 == 4) {
                this.g = this.g == 1 ? 0 : 1;
                return;
            }
            if (n2 == 0x40000000 || n2 == 517 || n2 == 0x10000000) {
                if (this.g == 0) {
                    if (e != 1) {
                        this.i.a("\u8f93\u5165OK\u786e\u5b9a\u79bb\u5a5a", 0);
                        return;
                    }
                } else if (this.g == 1) {
                    this.g = 0;
                    if (e == 1) {
                        this.b((byte)2);
                        return;
                    }
                    this.h.l = 0;
                    this.h.k = 0;
                    this.h.j = 0;
                    return;
                }
            } else if (n2 == 0x20000000) {
                this.g = 0;
                this.h.l = 0;
                this.h.k = 0;
                this.h.j = 0;
            }
        }
    }

    public final void c(Graphics graphics) {
        if (this.h.l == 0) {
            int n2 = 0;
            int n3 = 0;
            if (this.i.aq != null) {
                n2 = this.i.aq.a + 5;
                n3 = this.i.aq.b + this.i.aq.d - (2 * t.j + 16) - 6;
                ca.a(graphics, n2, n3, this.i.aq.c - 11, 2 * t.j + 16, 1);
                this.i.aq.a(graphics);
            }
            int n4 = 0;
            for (int i2 = 0; i2 < 2; ++i2) {
                n4 = 0xFFFFFF;
                if (e != 0) {
                    n4 = this.g == 1 ? (e == 1 ? 0x858585 : 0xFFFFFF) : 0xFFFFFF;
                    this.n[0] = e == 1 ? "\u79bb\u5a5a(\u7b49\u5f85\u5bf9\u65b9\u786e\u8ba4)" : "\u79bb\u5a5a(\u5bf9\u65b9\u5df2\u786e\u8ba4)";
                } else {
                    this.n[0] = "\u79bb\u5a5a(\u70b9\u51fb\u7533\u8bf7\u79bb\u5a5a)";
                }
                ca.a(graphics, this.n[i2], n2 + 4, n3 + 5 + i2 * (t.j + 5), 20, this.g == i2 ? 0xFF0000 : n4, 0);
            }
        }
    }

    public final void e() {
        byte[] byArray = bz.n((short)4862, bt.ad, bt.gQ);
        if (byArray != null) {
            com.yinhan.kjava.main.a.i.a(new w(4862, byArray));
            this.h.k = 0;
            this.h.j = 0;
            this.i.a((String)null);
            return;
        }
        this.i.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
    }

    public static void e(DataInputStream dataInputStream) {
        bt.gQ = dataInputStream.readShort();
        int n2 = dataInputStream.readShort();
        bt.gR = dataInputStream.readByte();
        if (n2 > 0) {
            o = new int[n2];
            p = new String[n2];
            for (int i2 = 0; i2 < n2; ++i2) {
                v.o[i2] = dataInputStream.readInt();
                v.p[i2] = dataInputStream.readUTF();
            }
            return;
        }
        v.g();
    }

    public final void f() {
        this.i.aq.j();
        this.i.aq.a("\u65b0\u4eba\u793c\u5802");
        this.i.aq.a(false);
        this.i.ar.a(null, p, null, null);
        this.i.au.a("\u8fdb\u5165");
        this.i.au.a(true);
        this.i.aq.a(this.i.ar);
        this.i.aq.a(this.i.au);
        this.i.aq.a(t.f, t.g, t.d, t.e);
        this.h.l = 0;
        this.i.j = this.i.k;
        this.h.k = (short)93;
        this.h.j = (short)93;
    }

    public final void e(int n2) {
        if (this.h.l == 0) {
            if (this.i.aq != null) {
                this.i.aq.b(n2);
            }
            if (o != null && (n2 == 0x10000000 || n2 == 0x40000000 || n2 == 517)) {
                int n3 = o[this.i.ar.g()];
                v v2 = this;
                byte[] byArray = bz.a((short)4863, bt.ad, (int)bt.t[v2.h.af].a, n3, v2.h.I.j, v2.h.I.k);
                if (byArray != null) {
                    com.yinhan.kjava.main.a.i.a(new w(4863, byArray));
                    v2.h.k = 0;
                    v2.h.j = 0;
                    v2.i.a((String)null);
                } else {
                    v2.i.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
                }
            }
            if (n2 == 0x20000000) {
                this.h.l = 0;
                this.h.k = 0;
                this.h.j = 0;
                return;
            }
            if (n2 == 1024) {
                if (bt.gQ > 1 && bt.gR == 1) {
                    bt.gQ = bt.gQ - 1 <= 1 ? (short)1 : (short)(bt.gQ - 1);
                    this.e();
                    return;
                }
                if (bt.gQ > 1 && bt.gR == 0) {
                    bt.gQ = bt.gQ - 1 < 1 ? (short)1 : (short)(bt.gQ - 1);
                    this.e();
                    return;
                }
            } else if (n2 == 2048) {
                if (bt.gQ <= 1 && bt.gR == 1) {
                    bt.gQ = (short)(bt.gQ + 1);
                    this.e();
                    return;
                }
                if (bt.gQ > 1 && bt.gR == 1) {
                    bt.gQ = (short)(bt.gQ + 1);
                    this.e();
                }
            }
        }
    }

    public final void d(Graphics graphics) {
        if (this.h.l == 0 && this.i.aq != null) {
            this.i.aq.a(graphics);
        }
    }

    static {
        l = 0;
        c = "\u7ed3\u5a5a\u5b88\u5219\uff1a\t1.\u6e38\u620f\u4e2d\u672a\u5a5a\u72b6\u6001\u7684\u4e00\u5bf9\u5f02\u6027\u73a9\u5bb6\u53ef\u7533\u8bf7\u7ed3\u5a5a\t2.\u53cc\u65b9\u597d\u611f\u5ea6\u5747\u9700\u8fbe\u52301000\u70b9\u6216\u4ee5\u4e0a\t3.\u53cc\u65b9\u7b49\u7ea7\u9700\u8fbe\u523040\u7ea7\u6216\u4ee5\u4e0a\t4.\u53cc\u65b9\u9700\u5404\u81ea\u652f\u4ed8100\u4e07\u4e24\u7684\u7ed3\u5a5a\u7533\u8bf7\u8d39\u7528";
        e = 0;
        f = "\u79bb\u5a5a\u5b88\u5219\uff1a\t1.\u79bb\u5a5a\u540e\u592b\u59bb\u53cc\u65b9\u597d\u611f\u5ea6\u964d\u4f4e\u4e3a0\t2.\u79bb\u5a5a\u540e\u4e0d\u53ef\u4f7f\u7528\u592b\u59bb\u9970\u7269\u3001\u63a5\u53d6\u592b\u59bb\u4efb\u52a1\u548c\u83b7\u5f97\u592b\u59bb\u58f0\u671b\t3.\u4e00\u65b9\u7533\u8bf7\u79bb\u5a5a\uff0c\u5728\u5bf9\u65b9\u540c\u610f\u79bb\u5a5a\u540e\uff0c\u79bb\u5a5a\u6548\u679c\u5373\u65f6\u751f\u6548\t4.\u4e00\u65b9\u7533\u8bf7\u79bb\u5a5a\uff0c\u5982\u5bf9\u65b9\u4e0d\u8fdb\u884c\u786e\u8ba4\uff0c\u5219\u79bb\u5a5a\u6548\u679c\u5728\u7533\u8bf7\u79bb\u5a5a\u540e72\u65f6\u81ea\u52a8\u751f\u6548";
    }
}


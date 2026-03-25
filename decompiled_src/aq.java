/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import com.yinhan.kjava.main.a;
import javax.microedition.lcdui.Graphics;

public final class aq {
    public ao a;
    public a b;
    public String c;
    public String d;
    private long u;
    public String e;
    public String f;
    public int g;
    private int v = 0;
    public String h;
    private short[] w = new short[]{1919, 2147, 2150, 2149, 2148};
    private int[][] x;
    private int[][] y;
    private int[][] z;
    private short[] A = new short[]{1919, 2147, 2148};
    public int[] i = new int[3];
    public long j = 0L;
    private short B = 0;
    private short C = 0;
    private short D = 0;
    private short E = 0;
    public int[] k = null;
    public int[][] l;
    public int[][] m;
    public int[] n;
    public String o = "";
    public int p;
    public long q = 1000L;
    public long r = 1000L;
    public int s;
    public int t;

    public aq(ao ao2, a a2) {
        this.a = ao2;
        this.b = a2;
    }

    public final void a(int n2) {
        this.b.aq.j();
        this.b.aq.a("\u5e2e\u6d3e");
        this.b.aq.a(false);
        this.b.ar.a(null, t.Z, null, null);
        this.b.ar.a(n2);
        this.b.at.b(t.aa[n2], t.i, (byte)2);
        this.b.at.a((byte)1);
        this.b.au.a("\u9009\u62e9");
        this.b.aq.a(this.b.ar);
        this.b.aq.a(this.b.at);
        this.b.aq.a(this.b.au);
        this.b.aq.a(t.f, t.g, t.d, t.e);
        this.a.l = 0;
        this.a.e.j = this.a.e.k;
        this.a.k = (short)41;
        this.a.j = (short)41;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void b(int n2) {
        if (this.a.l == 0) {
            if (this.b.aq != null) {
                this.b.aq.b(n2);
            }
            if (n2 == 1 || n2 == 514 || n2 == 4 || n2 == 520) {
                this.b.at.b(t.aa[this.b.ar.g()], t.i, (byte)2);
                this.b.at.a((byte)1);
            }
            if (n2 != 0x10000000 && n2 != 0x40000000 && n2 != 517) {
                if (n2 != 0x20000000) return;
                this.a.k = 0;
                this.a.j = 0;
                return;
            }
            this.a.aA = this.b.ar.h();
            this.a.aE = this.b.ar.g();
            switch (this.a.aE) {
                case 0: {
                    this.a.e.a("\u8f93\u5165\u5e2e\u6d3e\u540d\u79f0", 0);
                    return;
                }
                case 1: {
                    bt.gQ = 1;
                    this.z();
                    return;
                }
                case 2: {
                    this.a.e.a("\u8f93\u5165\u62db\u52df\u91d1\u989d", 2);
                    return;
                }
                case 3: {
                    bt.gQ = 1;
                    this.A();
                    return;
                }
                case 4: {
                    this.r();
                    return;
                }
                case 5: {
                    this.a.l = 1;
                    ca.h = 0;
                    return;
                }
                case 6: {
                    this.a.l = (short)2;
                    ca.h = 0;
                }
            }
            return;
        }
        if (this.a.l == 1) {
            if (n2 != 0x10000000 && n2 != 0x40000000) {
                if (n2 != 0x20000000) return;
                this.a.l = 0;
                return;
            }
            this.d();
            return;
        }
        if (this.a.l == 2) {
            if (n2 != 0x10000000 && n2 != 0x40000000) {
                if (n2 != 0x20000000) return;
                this.a.l = 0;
                return;
            }
            this.a.e.a("\u8f93\u5165OK\u786e\u8ba4\u89e3\u6563\u5e2e\u6d3e", 0);
            return;
        }
        if (this.a.l != 3) return;
        if (n2 != 0x10000000 && n2 != 0x40000000) {
            if (n2 != 0x20000000) return;
            this.a.l = 0;
            return;
        }
        byte[] byArray = bz.a((short)4224, bt.ad, this.u);
        if (byArray != null) {
            com.yinhan.kjava.main.a.i.a(new w(4224, byArray));
            this.a.e.a((String)null);
            return;
        }
        this.a.e.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
    }

    private void z() {
        byte[] byArray = bz.g((short)4198, bt.ad, bt.gQ);
        if (byArray != null) {
            com.yinhan.kjava.main.a.i.a(new w(4198, byArray));
            this.a.e.a((String)null);
            return;
        }
        this.a.e.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
    }

    public final void a(long l2) {
        this.u = l2;
        this.a.o();
    }

    public final void a() {
        this.a.am = ca.a("\u5c06\u4ea4\u4ed8" + this.u + "\u5e2e\u6d3e\u57fa\u91d1\u4f5c\u4e3a\u62db\u52df\u8d39\u7528\uff0c\u6301\u7eed\u4e00\u5468\uff1f", t.i, 140, "\t");
        this.a.l = (short)3;
        ca.h = 0;
    }

    private void A() {
        byte[] byArray = bz.j((short)4225, bt.ad, bt.gQ);
        if (byArray != null) {
            com.yinhan.kjava.main.a.i.a(new w(4225, byArray));
            this.a.e.a((String)null);
            return;
        }
        this.a.e.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
    }

    public final void b() {
        this.b.aq.j();
        this.b.aq.a("\u7b49\u5f85\u54cd\u5e94");
        this.b.aq.a(false);
        c c2 = this.b.ar;
        byte[] byArray = bt.in;
        String[] stringArray = new String[bt.in.length];
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            stringArray[i2] = new String(byArray[i2] + "\u4eba\u54cd\u5e94");
        }
        c2.a(null, bt.il, null, stringArray);
        this.b.at.b(bt.im == null ? null : bt.im[0], t.i, (byte)2);
        this.b.at.a((byte)1);
        this.b.au.a("\u54cd\u5e94");
        this.b.au.a(true);
        this.b.aq.a(this.b.ar);
        this.b.aq.a(this.b.at);
        this.b.aq.a(this.b.au);
        this.b.aq.a(t.f, t.g, t.d, t.e);
        this.a.l = 0;
        this.b.j = this.b.k;
        this.a.k = (short)42;
        this.a.j = (short)42;
    }

    public final void c(int n2) {
        if (this.a.l == 0) {
            if (this.b.aq != null) {
                this.b.aq.b(n2);
            }
            if (n2 == 1 || n2 == 514 || n2 == 520 || n2 == 4) {
                this.b.at.b(bt.im == null ? null : bt.im[this.b.ar.g()], t.i, (byte)2);
                this.b.at.a((byte)1);
            }
            if (n2 == 0x10000000 || n2 == 0x40000000 || n2 == 517) {
                String[] stringArray;
                int n3 = t.j + 20 + this.b.ar.i() * t.j + t.g;
                if (bt.io[this.b.ar.g()] == 1) {
                    String[] stringArray2 = new String[1];
                    stringArray = stringArray2;
                    stringArray2[0] = "\u53d6\u6d88\u54cd\u5e94";
                } else {
                    String[] stringArray3 = new String[1];
                    stringArray = stringArray3;
                    stringArray3[0] = "\u54cd\u5e94";
                }
                ca.a(80 + t.f, n3, stringArray, false);
                this.a.l = 1;
                return;
            }
            if (n2 == 0x20000000) {
                bt.gQ = 1;
                this.a(this.a.aE);
                return;
            }
            if (n2 == 1024) {
                if (bt.gQ > 1 && bt.gR == 1) {
                    bt.gQ = bt.gQ - 1 <= 1 ? (short)1 : (short)(bt.gQ - 1);
                    this.z();
                    return;
                }
                if (bt.gQ > 1 && bt.gR == 0) {
                    bt.gQ = bt.gQ - 1 < 1 ? (short)1 : (short)(bt.gQ - 1);
                    this.z();
                    return;
                }
            } else if (n2 == 2048) {
                if (bt.gQ <= 1 && bt.gR == 1) {
                    bt.gQ = (short)(bt.gQ + 1);
                    this.z();
                    return;
                }
                if (bt.gQ > 1 && bt.gR == 1) {
                    bt.gQ = (short)(bt.gQ + 1);
                    this.z();
                    return;
                }
            }
        } else if (this.a.l == 1) {
            if (n2 == 0x10000000 || n2 == 0x40000000 || n2 == 517) {
                if (ca.o == 0) {
                    if (bt.io[this.b.ar.g()] == 1) {
                        Object object = bz.x((short)4243, bt.ad, bt.ik[this.b.ar.g()]);
                        if (object != null) {
                            object = new w(4243, (byte[])object);
                            com.yinhan.kjava.main.a.i.a((w)object);
                        } else {
                            this.b.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
                        }
                        this.b.a((String)null);
                        return;
                    }
                    Object object = bz.x((short)4199, bt.ad, bt.ik[this.b.ar.g()]);
                    if (object != null) {
                        object = new w(4199, (byte[])object);
                        com.yinhan.kjava.main.a.i.a((w)object);
                    } else {
                        this.b.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
                    }
                    this.b.a((String)null);
                    return;
                }
            } else if (n2 == 0x20000000) {
                this.a.l = 0;
            }
        }
    }

    public final void c() {
        this.b.aq.j();
        this.b.aq.a("\u5e2e\u6d3e\u62db\u52df");
        this.b.aq.a(false);
        this.b.ar.a(null, bt.iq, null, null);
        this.b.at.b(bt.ir == null ? null : bt.ir[0], t.i, (byte)2);
        this.b.at.a((byte)1);
        this.b.au.a("\u7533\u8bf7");
        this.b.au.a(true);
        this.b.aq.a(this.b.ar);
        this.b.aq.a(this.b.at);
        this.b.aq.a(this.b.au);
        this.b.aq.a(t.f, t.g, t.d, t.e);
        this.a.l = 0;
        this.b.j = this.b.k;
        this.a.k = (short)43;
        this.a.j = (short)43;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void d(int n2) {
        if (this.a.l == 0) {
            if (bt.ip != null) {
                if (this.b.aq == null) {
                    return;
                }
                this.b.aq.b(n2);
                if (n2 == 1 || n2 == 514 || n2 == 520 || n2 == 4) {
                    this.b.at.b(bt.ir == null ? null : bt.ir[this.b.ar.g()], t.i, (byte)2);
                    this.b.at.a((byte)1);
                }
                if (n2 == 0x10000000 || n2 == 0x40000000 || n2 == 517) {
                    String[] stringArray;
                    int n3 = t.j + 20 + this.b.ar.i() * t.j + t.g;
                    if (bt.is[this.b.ar.g()] == 1) {
                        String[] stringArray2 = new String[1];
                        stringArray = stringArray2;
                        stringArray2[0] = "\u53d6\u6d88\u7533\u8bf7";
                    } else {
                        String[] stringArray3 = new String[1];
                        stringArray = stringArray3;
                        stringArray3[0] = "\u7533\u8bf7";
                    }
                    ca.a(80 + t.f, n3, stringArray, false);
                    this.a.l = 1;
                }
            }
            if (n2 == 0x20000000) {
                this.a(this.a.aE);
                return;
            }
            if (n2 == 1024) {
                if (bt.gQ > 1 && bt.gR == 1) {
                    bt.gQ = bt.gQ - 1 <= 1 ? (short)1 : (short)(bt.gQ - 1);
                    this.A();
                    return;
                }
                if (bt.gQ <= 1) return;
                if (bt.gR != 0) return;
                bt.gQ = bt.gQ - 1 < 1 ? (short)1 : (short)(bt.gQ - 1);
                this.A();
                return;
            }
            if (n2 != 2048) return;
            if (bt.gQ <= 1 && bt.gR == 1) {
                bt.gQ = (short)(bt.gQ + 1);
                this.A();
                return;
            }
            if (bt.gQ <= 1) return;
            if (bt.gR != 1) return;
            bt.gQ = (short)(bt.gQ + 1);
            this.A();
            return;
        }
        if (this.a.l != 1) return;
        ca.b(n2);
        if (n2 != 0x10000000 && n2 != 0x40000000 && n2 != 517) {
            if (n2 != 0x20000000) return;
            this.a.l = 0;
            return;
        }
        if (ca.o != 0) return;
        if (bt.is[this.b.ar.g()] == 1) {
            Object object = bt.ip[this.b.ar.g()];
            byte[] byArray = bz.l((short)4242, bt.ad, (String)object);
            object = byArray;
            if (byArray != null) {
                com.yinhan.kjava.main.a.i.a(new w(4242, (byte[])object));
                this.b.a((String)null);
                return;
            }
            this.b.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
            return;
        }
        Object object = bt.ip[this.b.ar.g()];
        byte[] byArray = bz.l((short)4226, bt.ad, (String)object);
        object = byArray;
        if (byArray != null) {
            com.yinhan.kjava.main.a.i.a(new w(4226, (byte[])object));
            this.b.a((String)null);
            return;
        }
        this.b.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
    }

    public final void d() {
        byte[] byArray = bz.m((short)4209, bt.ad);
        if (byArray != null) {
            com.yinhan.kjava.main.a.i.a(new w(4209, byArray));
            this.b.a((String)null);
            return;
        }
        this.b.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
    }

    public final void a(boolean bl2) {
        this.b.aq.j();
        this.b.aq.a("\u5e2e\u6d3e\u7ba1\u7406");
        this.b.aq.a(false);
        this.b.ar.a(null, t.ab, null, null);
        if (bl2) {
            this.b.ar.a(this.a.aA, this.a.aE);
            this.b.at.b(t.ac[this.a.aE], t.i, (byte)2);
        } else {
            this.b.at.b(t.ac[0], t.i, (byte)2);
        }
        this.b.at.a((byte)1);
        this.b.au.a("\u786e\u5b9a");
        this.b.aq.a(this.b.ar);
        this.b.aq.a(this.b.at);
        this.b.aq.a(this.b.au);
        this.b.aq.a(t.f, t.g, t.d, t.e);
        this.a.l = 0;
        this.b.j = this.b.k;
        this.a.k = (short)45;
        this.a.j = (short)45;
    }

    public final void e(int n2) {
        block11: {
            block12: {
                if (this.a.l != 0) break block11;
                if (this.b.aq != null) {
                    this.b.aq.b(n2);
                }
                if (n2 == 1 || n2 == 514 || n2 == 520 || n2 == 4) {
                    this.b.at.b(t.ac[this.b.ar.g()], t.i, (byte)2);
                    this.b.at.a((byte)1);
                }
                if (n2 != 0x10000000 && n2 != 0x40000000 && n2 != 517) break block12;
                this.a.aA = this.b.ar.h();
                this.a.aE = this.b.ar.g();
                switch (this.a.aE) {
                    case 0: {
                        this.b.a("\u8f93\u5165\u5e2e\u6d3e\u65b0\u5b97\u65e8", 0);
                        break block11;
                    }
                    case 1: {
                        bt.gQ = 1;
                        this.e();
                        break block11;
                    }
                    case 2: {
                        this.g();
                        break block11;
                    }
                    case 3: {
                        bt.gQ = 1;
                        this.j(1);
                        break block11;
                    }
                    case 4: {
                        bt.gQ = 1;
                        this.g(1);
                        break block11;
                    }
                    case 5: {
                        this.a((byte)1);
                    }
                    default: {
                        return;
                    }
                }
            }
            if (n2 == 0x20000000) {
                this.a.aA = 0;
                this.a.aE = 0;
                this.a.k = 0;
                this.a.j = 0;
            }
        }
    }

    public final void e() {
        byte[] byArray = bz.i((short)4227, bt.ad, bt.gQ);
        if (byArray != null) {
            com.yinhan.kjava.main.a.i.a(new w(4227, byArray));
            this.b.a((String)null);
            return;
        }
        this.b.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
    }

    public final void f() {
        this.b.aq.j();
        this.b.aq.a("\u7533\u8bf7\u5217\u8868");
        this.b.aq.a(false);
        c c2 = this.b.ar;
        short[] sArray = bt.iv;
        String[] stringArray = null;
        if (sArray != null) {
            stringArray = new String[sArray.length];
            for (int i2 = 0; i2 < sArray.length; ++i2) {
                stringArray[i2] = new String(sArray[i2] + "\u7ea7");
            }
        }
        c2.a(null, bt.iu, stringArray, bt.iw);
        this.b.au.a("\u786e\u5b9a");
        this.b.au.a(true);
        this.b.aq.a(this.b.ar);
        this.b.aq.a(this.b.au);
        this.b.aq.a(t.f, t.g, t.d, t.e);
        this.a.l = 0;
        this.b.j = this.b.k;
        this.a.k = (short)46;
        this.a.j = (short)46;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void f(int n2) {
        if (this.a.l == 0) {
            if (this.b.aq != null) {
                this.b.aq.b(n2);
            }
            if (n2 == 0x10000000 || n2 == 0x40000000 || n2 == 517) {
                ca.a(80 + t.f, t.j + 20 + this.b.ar.i() * t.j + t.g, new String[]{"\u8be6\u60c5", "\u63a5\u7eb3", "\u62d2\u7edd"}, false);
                this.a.l = 1;
                return;
            }
            if (n2 == 0x20000000) {
                this.a(true);
                return;
            }
            if (n2 == 1024) {
                if (bt.gQ > 1 && bt.gR == 1) {
                    bt.gQ = bt.gQ - 1 <= 1 ? (short)1 : (short)(bt.gQ - 1);
                    this.e();
                    return;
                }
                if (bt.gQ <= 1) return;
                if (bt.gR != 0) return;
                bt.gQ = bt.gQ - 1 < 1 ? (short)1 : (short)(bt.gQ - 1);
                this.e();
                return;
            }
            if (n2 != 2048) return;
            if (bt.gQ <= 1 && bt.gR == 1) {
                bt.gQ = (short)(bt.gQ + 1);
                this.e();
                return;
            }
            if (bt.gQ <= 1) return;
            if (bt.gR != 1) return;
            bt.gQ = (short)(bt.gQ + 1);
            this.e();
            return;
        }
        if (this.a.l == 1) {
            ca.b(n2);
            if (n2 != 0x10000000 && n2 != 0x40000000 && n2 != 517) {
                if (n2 != 0x20000000) return;
                this.a.l = 0;
                return;
            }
            if (ca.o == 0) {
                if (bt.ix[this.b.ar.g()] != 1) {
                    this.b.b("\u5bf9\u65b9\u4e0d\u5728\u7ebf");
                    return;
                }
                byte[] byArray = bz.a((short)4110, bt.ad, bt.it[this.b.ar.g()], (byte)0);
                if (byArray != null) {
                    com.yinhan.kjava.main.a.i.a(new w(4110, byArray));
                    this.b.a((String)null);
                    return;
                }
                this.b.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
                return;
            }
            if (ca.o == 1) {
                byte[] byArray = bz.m((short)4228, bt.ad, bt.it[this.b.ar.g()]);
                if (byArray != null) {
                    com.yinhan.kjava.main.a.i.a(new w(4228, byArray));
                    this.b.a((String)null);
                    return;
                }
                this.b.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
                return;
            }
            if (ca.o != 2) return;
            byte[] byArray = bz.m((short)4229, bt.ad, bt.it[this.b.ar.g()]);
            if (byArray != null) {
                com.yinhan.kjava.main.a.i.a(new w(4229, byArray));
                this.b.a((String)null);
                return;
            }
            this.b.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
            return;
        }
        if (this.a.l != 2) return;
        this.a.T.b(n2);
        if (n2 != 0x10000000 && n2 != 0x20000000 && n2 != 0x40000000) {
            if (n2 != 517) return;
        }
        this.a.T.j();
        this.f();
    }

    public final void g() {
        this.b.a("\u8f93\u5165\u73a9\u5bb6\u540d\u79f0", 0);
    }

    public final void h() {
        if (this.f != null) {
            Object object = bz.j((short)4201, bt.ad, this.f);
            if (object != null) {
                object = new w(4201, (byte[])object);
                com.yinhan.kjava.main.a.i.a((w)object);
            } else {
                this.b.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
            }
            this.b.a((String)null);
        }
    }

    public final void g(int n2) {
        this.g = n2;
        byte[] byArray = bz.h((short)4212, bt.ad, bt.gQ);
        if (byArray != null) {
            com.yinhan.kjava.main.a.i.a(new w(4212, byArray));
            this.b.a((String)null);
            return;
        }
        this.b.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
    }

    private void B() {
        byte[] byArray = bz.o((short)4211, bt.ad);
        if (byArray != null) {
            com.yinhan.kjava.main.a.i.a(new w(4211, byArray));
            this.b.a((String)null);
            return;
        }
        this.b.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
    }

    private void a(byte by2) {
        byte[] byArray = bz.k((short)4263, bt.ad, by2);
        if (byArray != null) {
            com.yinhan.kjava.main.a.i.a(new w(4263, byArray));
            this.b.a((String)null);
            return;
        }
        this.b.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
    }

    public final void h(int n2) {
        this.b.aq.j();
        this.b.aq.a("\u5e2e\u6d3e\u4fe1\u606f");
        this.b.aq.a(true);
        this.b.as.a(new String[]{"\u6210\u5458", "\u5e2e\u6d3e", "\u5916\u4ea4", "\u5e2e\u6218"});
        this.b.aq.a(this.b.as);
        if (n2 == 0) {
            this.b.as.a = 0;
            this.b.ar.a(null, bt.iz, bt.iA, aq.a(bt.iC, "\u6218\u529b"));
            this.b.ar.a((short[])(bt.aC == 1 ? bt.iE : null));
            this.b.ar.b((short[])(bt.aH == 1 ? bt.iF : null));
            this.b.ar.a(bt.iG);
            this.b.au.a("\u786e\u5b9a");
            this.b.au.a(true);
            this.b.aq.a(this.b.ar);
            this.b.aq.a(this.b.au);
            this.b.aq.a(t.f, t.g, t.d, t.e);
        } else if (n2 == 1) {
            this.b.as.a = 1;
            this.b.at.b(bt.iH, t.i, (byte)2);
            this.b.aq.a(this.b.at);
            this.b.aq.a(t.f, t.g, t.d, t.e);
        } else if (n2 == 2) {
            this.b.as.a = (byte)2;
            String[] stringArray = null;
            int[] nArray = null;
            if (bt.jY != null && bt.jY.length > 0) {
                stringArray = new String[bt.jY.length];
                nArray = new int[bt.jY.length];
                for (int i2 = 0; i2 < stringArray.length; ++i2) {
                    stringArray[i2] = bt.d(bt.ka[i2]);
                    nArray[i2] = bt.ka[i2] == 2 ? 0xC40000 : (bt.ka[i2] == 3 ? 0xFF0000 : 0xFFFF00);
                }
            }
            this.b.ar.a(null, bt.jZ, null, stringArray);
            this.b.ar.a("\u641c\u7d22...");
            this.b.ar.a(nArray);
            this.b.ar.a("\u5e2e\u6d3e\u641c\u7d22", 1);
            this.b.au.a("\u786e\u5b9a");
            this.b.au.a(true);
            this.b.aq.a(this.b.ar);
            this.b.aq.a(this.b.au);
            this.b.aq.a(t.f, t.g, t.d, t.e);
            ca.l = 0;
        } else if (n2 == 3) {
            this.b.as.a = (byte)3;
            this.b.at.b(bt.kl, t.i, (byte)2);
            this.b.au.a("\u786e\u5b9a");
            this.b.au.a(true);
            this.b.aq.a(this.b.at);
            this.b.aq.a(this.b.au);
            this.b.aq.a(t.f, t.g, t.d, t.e);
        }
        this.a.l = 0;
        this.b.j = this.b.k;
        this.a.k = (short)47;
        this.a.j = (short)47;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void i(int n2) {
        block81: {
            block86: {
                block91: {
                    block94: {
                        block93: {
                            block92: {
                                block88: {
                                    block90: {
                                        block89: {
                                            block87: {
                                                block82: {
                                                    block83: {
                                                        block85: {
                                                            block84: {
                                                                if (this.a.l != 0) break block81;
                                                                if (this.b.as.a != 0) break block82;
                                                                if (this.b.aq != null) {
                                                                    this.b.aq.b(n2);
                                                                }
                                                                if (bt.iy == null) break block83;
                                                                if (n2 != 0x10000000 && n2 != 0x40000000 && n2 != 517) break block84;
                                                                if (bt.iD[this.b.ar.g()] == 1) {
                                                                    if (!bt.iy[this.b.ar.g()].equals(bt.ad)) {
                                                                        ca.a(80 + t.f, 2 * t.j + 20 + this.b.ar.i() * t.j + t.g, new String[]{"\u67e5\u770b", "\u79c1\u804a", "\u7ec4\u961f", "\u4ea4\u6613", "\u597d\u53cb", "\u9ed1\u540d\u5355"}, false);
                                                                        this.a.l = 1;
                                                                        this.a.aE = this.b.ar.g();
                                                                        this.a.aA = this.b.ar.h();
                                                                    }
                                                                    break block83;
                                                                } else if (!bt.iy[this.b.ar.g()].equals(bt.ad)) {
                                                                    ca.a(80 + t.f, 2 * t.j + 20 + this.b.ar.i() * t.j + t.g, new String[]{"\u67e5\u770b"}, false);
                                                                    this.a.l = 1;
                                                                    this.a.aE = this.b.ar.g();
                                                                    this.a.aA = this.b.ar.h();
                                                                }
                                                                break block83;
                                                            }
                                                            if (n2 != 1024) break block85;
                                                            if (bt.gQ > 1 && bt.gR == 1) {
                                                                bt.gQ = bt.gQ - 1 <= 1 ? (short)1 : (short)(bt.gQ - 1);
                                                                this.g(this.g);
                                                                break block83;
                                                            } else if (bt.gQ > 1 && bt.gR == 0) {
                                                                bt.gQ = bt.gQ - 1 < 1 ? (short)1 : (short)(bt.gQ - 1);
                                                                this.g(this.g);
                                                            }
                                                            break block83;
                                                        }
                                                        if (n2 == 2048) {
                                                            if (bt.gQ <= 1 && bt.gR == 1) {
                                                                bt.gQ = (short)(bt.gQ + 1);
                                                                this.g(this.g);
                                                            } else if (bt.gQ > 1 && bt.gR == 1) {
                                                                bt.gQ = (short)(bt.gQ + 1);
                                                                this.g(this.g);
                                                            }
                                                        }
                                                    }
                                                    if (n2 == 2 || n2 == 518) {
                                                        this.B();
                                                        break block86;
                                                    } else if (n2 == 8 || n2 == 516) {
                                                        bt.gQ = 1;
                                                        this.C();
                                                    }
                                                    break block86;
                                                }
                                                if (this.b.as.a != 1) break block87;
                                                if (this.b.aq != null) {
                                                    this.b.aq.b(n2);
                                                }
                                                if (n2 == 8 || n2 == 516) {
                                                    bt.gQ = 1;
                                                    this.g(this.g);
                                                    break block86;
                                                } else if (n2 == 2 || n2 == 518) {
                                                    bt.gQ = 1;
                                                    this.p = 1;
                                                    this.o = "";
                                                    this.a(this.o);
                                                }
                                                break block86;
                                            }
                                            if (this.b.as.a != 2) break block88;
                                            if (this.b.aq != null) {
                                                this.b.aq.b(n2);
                                            }
                                            if (n2 == 8 || n2 == 516) {
                                                this.B();
                                            } else if (n2 == 2 || n2 == 518) {
                                                bt.gQ = 1;
                                                this.C();
                                                this.h(3);
                                            }
                                            if (n2 == 1 || n2 == 514 || n2 == 520 || n2 == 4) {
                                                boolean bl2 = this.b.ar.g() == this.b.ar.h();
                                                this.b.ar.a(bl2 ? "\u5e2e\u6d3e\u641c\u7d22" : aq.w(this.b.ar.g() - 1), 1);
                                            }
                                            if (n2 != 0x10000000 && n2 != 0x40000000 && n2 != 517) break block89;
                                            this.a.aA = this.b.ar.h();
                                            this.a.aE = this.b.ar.g();
                                            if (this.b.ar.g() == this.b.ar.h()) {
                                                this.b.a("\u8bf7\u8f93\u5165\u8981\u641c\u7d22\u7684\u5e2e\u6d3e\u540d\u79f0", 0);
                                                break block86;
                                            } else if (bt.jY != null) {
                                                ca.a(80 + t.f, 2 * t.j + 20 + this.b.ar.i() * t.j + t.g, new String[]{"\u67e5\u770b", "\u5916\u4ea4", "\u5ba3\u6218"}, true);
                                                this.a.l = (short)7;
                                            }
                                            break block86;
                                        }
                                        if (n2 != 1024) break block90;
                                        if (bt.gQ > 1 && bt.gR == 1) {
                                            bt.gQ = bt.gQ - 1 <= 1 ? (short)1 : (short)(bt.gQ - 1);
                                            this.a(this.o);
                                            break block86;
                                        } else if (bt.gQ > 1 && bt.gR == 0) {
                                            bt.gQ = bt.gQ - 1 < 1 ? (short)1 : (short)(bt.gQ - 1);
                                            this.a(this.o);
                                        }
                                        break block86;
                                    }
                                    if (n2 != 2048) break block86;
                                    if (bt.gQ <= 1 && bt.gR == 1) {
                                        bt.gQ = (short)(bt.gQ + 1);
                                        this.a(this.o);
                                        break block86;
                                    } else if (bt.gQ > 1 && bt.gR == 1) {
                                        bt.gQ = (short)(bt.gQ + 1);
                                        this.a(this.o);
                                    }
                                    break block86;
                                }
                                if (this.b.as.a != 3) break block91;
                                if (this.b.aq != null) {
                                    this.b.aq.b(n2);
                                }
                                if (n2 != 8 && n2 != 516) break block92;
                                bt.gQ = 1;
                                this.p = 1;
                                this.o = "";
                                this.a(this.o);
                                break block86;
                            }
                            if (n2 != 2 && n2 != 518) break block93;
                            bt.gQ = 1;
                            this.g(this.g);
                            break block86;
                        }
                        if (n2 != 1024) break block94;
                        if (bt.gQ > 1 && bt.gR == 1) {
                            bt.gQ = bt.gQ - 1 <= 1 ? (short)1 : (short)(bt.gQ - 1);
                            this.C();
                            break block86;
                        } else if (bt.gQ > 1 && bt.gR == 0) {
                            bt.gQ = bt.gQ - 1 < 1 ? (short)1 : (short)(bt.gQ - 1);
                            this.C();
                        }
                        break block86;
                    }
                    if (n2 != 2048) break block86;
                    if (bt.gQ <= 1 && bt.gR == 1) {
                        bt.gQ = (short)(bt.gQ + 1);
                        this.C();
                        break block86;
                    } else if (bt.gQ > 1 && bt.gR == 1) {
                        bt.gQ = (short)(bt.gQ + 1);
                        this.C();
                    }
                    break block86;
                }
                if (this.b.as.a == 4) {
                    if (this.b.aq != null) {
                        this.b.aq.b(n2);
                    }
                    if (n2 == 8 || n2 == 516) {
                        bt.gQ = 1;
                        this.C();
                    }
                }
            }
            if (n2 != 0x20000000) return;
            this.o = "";
            bt.gQ = 1;
            if (this.g == 1) {
                this.a(true);
                return;
            }
            if (this.g != 0) return;
            this.a.k();
            this.a.c(1);
            return;
        }
        if (this.a.l == 1) {
            if (this.b.aC != null && this.b.g) {
                this.a.aQ = bt.iz[this.b.ar.g()];
                this.a.a(bt.iy[this.b.ar.g()], (byte)4);
                this.a.l = 0;
                this.b.b("\u804a\u5929\u6d88\u606f\u5df2\u53d1\u9001!");
            }
            ca.b(n2);
            if (n2 != 0x10000000 && n2 != 0x40000000 && n2 != 517) {
                if (n2 != 0x20000000) return;
                this.a.l = 0;
                return;
            }
            if (ca.o == 0) {
                ca.a(80 + t.f, 2 * t.j + 20 + this.b.ar.i() * t.j + t.g, new String[]{"\u5c5e\u6027", "\u88c5\u5907"}, false);
                this.a.l = (short)2;
                return;
            }
            if (ca.o == 1) {
                this.a.aS = bt.iy[this.b.ar.g()];
                this.a.aT = 4;
                this.b.a("\u804a\u5929", 0);
                return;
            }
            if (ca.o == 2) {
                if (bt.bs == -1) {
                    ca.a(80 + t.f, 2 * t.j + 20 + this.b.ar.i() * t.j + t.g, new String[]{"\u81ea\u7531", "\u8ddf\u968f"}, false);
                    this.a.l = (short)6;
                    return;
                }
                this.a.a(bt.s, bt.iy[this.b.ar.g()]);
                return;
            }
            if (ca.o == 3) {
                ca.a(80 + t.f, 2 * t.j + 20 + this.b.ar.i() * t.j + t.g, new String[]{"\u7269\u54c1", "\u5ba0\u7269"}, false);
                this.a.l = (short)5;
                return;
            }
            if (ca.o == 4) {
                this.a.a(bt.iy[this.b.ar.g()]);
                this.a.l = 0;
                return;
            }
            if (ca.o != 5) return;
            this.a.b(bt.iy[this.b.ar.g()]);
            this.a.l = 0;
            return;
        }
        if (this.a.l == 2) {
            ca.b(n2);
            if (n2 == 0x10000000 || n2 == 0x40000000 || n2 == 517) {
                if (ca.o == 0) {
                    byte[] byArray = bz.a((short)4110, bt.ad, bt.iy[this.b.ar.g()], (byte)1);
                    if (byArray != null) {
                        com.yinhan.kjava.main.a.i.a(new w(4110, byArray));
                        this.b.a((String)null);
                        return;
                    }
                    this.b.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
                    return;
                }
                if (ca.o != 1) return;
                byte[] byArray = bz.b((short)4111, bt.ad, bt.iy[this.b.ar.g()]);
                if (byArray != null) {
                    com.yinhan.kjava.main.a.i.a(new w(4111, byArray));
                    this.b.a((String)null);
                    return;
                }
                this.b.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
                return;
            }
            if (n2 != 0x20000000) return;
            if (bt.iD[this.b.ar.g()] == 1) {
                ca.a(80 + t.f, 2 * t.j + 20 + this.b.ar.i() * t.j + t.g, new String[]{"\u67e5\u770b", "\u79c1\u804a", "\u7ec4\u961f", "\u4ea4\u6613", "\u597d\u53cb", "\u9ed1\u540d\u5355"}, false);
            } else {
                ca.a(80 + t.f, 2 * t.j + 20 + this.b.ar.i() * t.j + t.g, new String[]{"\u67e5\u770b"}, false);
            }
            this.a.l = 1;
            return;
        }
        if (this.a.l == 3) {
            this.a.T.b(n2);
            if (n2 != 0x10000000) {
                if (n2 != 0x20000000) return;
            }
            this.a.T.j();
            this.a.l = (short)2;
            return;
        }
        if (this.a.l == 4) {
            this.a.a(bt.cJ);
            this.a.g(n2);
            if (n2 != 0x20000000) return;
            if (this.a.m == 1) {
                this.a.T.j();
                this.a.m = 0;
                return;
            }
            if (bt.cJ != null) {
                bt.o();
            }
            ao.q = null;
            this.a.al = null;
            this.a.l = (short)2;
            com.yinhan.kjava.main.a.f.a(this.a.f, ao.h, ao.i, true, false, 1009050);
            return;
        }
        if (this.a.l == 5) {
            ca.b(n2);
            if (n2 != 0x10000000 && n2 != 0x40000000 && n2 != 517) {
                if (n2 != 0x20000000) return;
                ca.a(80 + t.f, 2 * t.j + 20 + this.b.ar.i() * t.j + t.g, new String[]{"\u67e5\u770b", "\u79c1\u804a", "\u7ec4\u961f", "\u4ea4\u6613", "\u597d\u53cb", "\u9ed1\u540d\u5355"}, false);
                ca.o = 3;
                this.a.l = 1;
                return;
            }
            byte[] byArray = bz.b((short)4124, bt.ad, bt.iy[this.b.ar.g()], (byte)ca.o);
            if (byArray != null) {
                com.yinhan.kjava.main.a.i.a(new w(4124, byArray));
                this.b.a((String)null);
                return;
            }
            this.b.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
            return;
        }
        if (this.a.l == 6) {
            boolean bl3;
            ca.b(n2);
            if (n2 != 0x10000000 && n2 != 0x40000000 && n2 != 517) {
                if (n2 != 0x20000000) return;
                ca.a(80 + t.f, 2 * t.j + 20 + this.b.ar.i() * t.j + t.g, new String[]{"\u67e5\u770b", "\u79c1\u804a", "\u7ec4\u961f", "\u4ea4\u6613", "\u597d\u53cb", "\u9ed1\u540d\u5355"}, false);
                ca.o = 2;
                this.a.l = 1;
                return;
            }
            boolean bl4 = bl3 = ca.o == 0;
            if (bt.bs == 0) {
                this.b.b("\u961f\u5458\u4e0d\u80fd\u53d1\u9001\u7ec4\u961f\u9080\u8bf7\uff01");
                return;
            }
            if (bt.bs == 1 && bt.q != null && bt.q.length >= 3) {
                this.b.b("\u961f\u4f0d\u5df2\u6ee1\uff0c\u65e0\u6cd5\u9080\u8bf7\uff01");
                return;
            }
            byte[] byArray = bz.a((short)4112, bt.ad, bt.iy[this.b.ar.g()], (short)(bl3 ? 1 : 0));
            if (byArray != null) {
                w w2 = new w(4112, byArray);
                com.yinhan.kjava.main.a.i.a(w2);
                this.a.l = 0;
                return;
            }
            this.b.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
            return;
        }
        if (this.a.l == 7) {
            ca.b(n2);
            if (n2 != 0x10000000 && n2 != 0x40000000 && n2 != 517) {
                if (n2 != 0x20000000) return;
                this.a.l = 0;
                return;
            }
            this.b.aw = ca.o;
            if (ca.o == 0) {
                this.b(bt.jY[this.b.ar.g() - 1]);
                return;
            }
            if (ca.o == 1) {
                ca.a(80 + t.f, 2 * t.j + 20 + this.b.ar.i() * t.j + t.g, new String[]{"\u4e2d\u7acb", "\u654c\u5bf9"}, true);
                this.a.l = (short)8;
                return;
            }
            if (ca.o != 2) return;
            this.a.l = (short)9;
            ca.h = 0;
            return;
        }
        if (this.a.l == 8) {
            ca.b(n2);
            if (n2 != 0x10000000 && n2 != 0x40000000 && n2 != 517) {
                if (n2 != 0x20000000) return;
                this.a.l = 0;
                return;
            }
            if (ca.o == 0) {
                this.a((byte)1, bt.jY[this.b.ar.g() - 1]);
                return;
            }
            if (ca.o != 1) return;
            this.a((byte)2, bt.jY[this.b.ar.g() - 1]);
            return;
        }
        if (this.a.l != 9) return;
        if (n2 != 0x10000000 && n2 != 0x40000000 && n2 != 517) {
            if (n2 != 0x20000000) return;
            this.a.l = 0;
            return;
        }
        this.b.a("\u8f93\u5165OK\u786e\u8ba4\u5ba3\u6218", 0);
    }

    public final void j(int n2) {
        this.g = n2;
        byte[] byArray = bz.h((short)4240, bt.ad, bt.gQ);
        if (byArray != null) {
            com.yinhan.kjava.main.a.i.a(new w(4240, byArray));
            return;
        }
        this.b.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
    }

    public final void i() {
        this.b.aq.j();
        this.b.aq.a("\u6210\u5458\u5217\u8868");
        this.b.aq.a(false);
        this.b.ar.a(null, bt.iz, bt.iA, aq.a(bt.iB, "\u529f\u52cb"));
        this.b.ar.a((short[])(bt.aC == 1 ? bt.iE : null));
        this.b.ar.b((short[])(bt.aH == 1 ? bt.iF : null));
        this.b.ar.a(bt.iG);
        this.b.au.a("\u4efb\u514d");
        this.b.au.a(true);
        this.b.aq.a(this.b.ar);
        this.b.aq.a(this.b.au);
        this.b.aq.a(t.f, t.g, t.d, t.e);
        this.a.l = 0;
        this.b.j = this.b.k;
        this.a.k = (short)48;
        this.a.j = (short)48;
    }

    private static String[] a(int[] nArray, String string) {
        String[] stringArray = null;
        if (nArray != null) {
            stringArray = new String[nArray.length];
            for (int i2 = 0; i2 < nArray.length; ++i2) {
                stringArray[i2] = new String("" + nArray[i2] + string);
            }
        }
        return stringArray;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void k(int n2) {
        if (this.a.l == 0) {
            if (bt.iy != null) {
                if (this.b.aq != null) {
                    this.b.aq.b(n2);
                }
                if (n2 == 0x10000000 || n2 == 0x40000000 || n2 == 517) {
                    ca.a(80 + t.f, t.j + 20 + this.b.ar.i() * t.j + t.g, new String[]{"\u4efb\u514d", "\u5f00\u9664"}, false);
                    this.a.l = 1;
                    this.v = this.b.ar.g();
                }
            }
            if (n2 == 0x20000000) {
                if (this.g == 1) {
                    this.a(true);
                    return;
                }
                if (this.g != 0) return;
                this.a.k();
                this.a.c(1);
                return;
            }
            if (n2 == 1024) {
                if (bt.gQ > 1 && bt.gR == 1) {
                    bt.gQ = bt.gQ - 1 <= 1 ? (short)1 : (short)(bt.gQ - 1);
                    this.j(this.g);
                    return;
                }
                if (bt.gQ <= 1) return;
                if (bt.gR != 0) return;
                bt.gQ = bt.gQ - 1 < 1 ? (short)1 : (short)(bt.gQ - 1);
                this.j(this.g);
                return;
            }
            if (n2 != 2048) return;
            if (bt.gQ <= 1 && bt.gR == 1) {
                bt.gQ = (short)(bt.gQ + 1);
                this.j(this.g);
                return;
            }
            if (bt.gQ <= 1) return;
            if (bt.gR != 1) return;
            bt.gQ = (short)(bt.gQ + 1);
            this.j(this.g);
            return;
        }
        if (this.a.l == 1) {
            ca.b(n2);
            if (n2 != 0x10000000 && n2 != 0x40000000 && n2 != 517) {
                if (n2 != 0x20000000) return;
                this.a.l = 0;
                return;
            }
            if (ca.o != 0) {
                if (ca.o != 1) return;
                this.a.l = (short)3;
                ca.h = 0;
                return;
            }
            byte[] byArray = bz.p((short)4241, bt.ad);
            if (byArray != null) {
                com.yinhan.kjava.main.a.i.a(new w(4241, byArray));
                this.b.a((String)null);
                return;
            }
            this.b.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
            return;
        }
        if (this.a.l == 2) {
            if (this.b.aq != null) {
                this.b.aq.b(n2);
            }
            if (n2 == 1 || n2 == 514 || n2 == 520 || n2 == 4) {
                this.b.at.b(bt.je[this.b.ar.g()], t.i, (byte)2);
                this.b.at.a((byte)1);
            }
            if (n2 != 0x10000000 && n2 != 0x40000000 && n2 != 517) {
                if (n2 != 0x20000000) return;
                this.i();
                return;
            }
            byte by2 = bt.jc[this.b.ar.g()];
            Object object = bt.iy[this.v];
            byte[] byArray = bz.d((short)4217, bt.ad, (String)object, by2);
            object = byArray;
            if (byArray != null) {
                com.yinhan.kjava.main.a.i.a(new w(4217, (byte[])object));
                this.b.a((String)null);
                return;
            }
            this.b.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
            return;
        }
        if (this.a.l != 3) return;
        if (n2 != 0x10000000 && n2 != 0x40000000 && n2 != 517) {
            if (n2 != 0x20000000) return;
            this.a.l = 0;
            return;
        }
        String string = bt.iy[this.b.ar.g()];
        byte[] byArray = bz.k((short)4208, bt.ad, string);
        if (byArray != null) {
            com.yinhan.kjava.main.a.i.a(new w(4208, byArray));
            this.b.a((String)null);
            return;
        }
        this.b.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
    }

    public final void j() {
        this.b.aq.j();
        this.b.aq.a("\u804c\u52a1\u5217\u8868");
        this.b.aq.a(true);
        this.b.ar.a(null, bt.jd, null, null);
        this.b.at.b(bt.je[this.b.ar.g()], t.i, (byte)2);
        this.b.at.a((byte)1);
        this.b.au.a("\u786e\u5b9a");
        this.b.aq.a(this.b.ar);
        this.b.aq.a(this.b.at);
        this.b.aq.a(this.b.au);
        this.b.aq.a(t.f, t.g, t.d, t.e);
        this.a.l = (short)2;
        this.b.j = this.b.k;
        this.a.k = (short)48;
        this.a.j = (short)48;
    }

    public final void l(int n2) {
        if (this.a.l == 0) {
            if (this.b.aq != null) {
                this.b.aq.b(n2);
            }
            if (n2 == 0x10000000 || n2 == 0x20000000 || n2 == 0x40000000 || n2 == 517) {
                this.a.m();
            }
        }
    }

    public final void k() {
        this.b.aq.j();
        this.b.aq.a("\u5e2e\u6d3e\u516c\u544a");
        this.b.aq.a(false);
        this.b.at.b(bt.jf, t.i, (byte)2);
        this.b.au.a("\u786e\u5b9a");
        this.b.aq.a(this.b.at);
        this.b.aq.a(this.b.au);
        this.b.aq.a(t.f, t.g, t.d, t.e);
        this.a.l = 0;
        this.b.j = this.b.k;
        this.a.k = (short)49;
        this.a.j = (short)49;
    }

    public final void b(boolean bl2) {
        this.b.aq.j();
        this.b.aq.a("\u5b9d\u5e93\u7ba1\u7406");
        this.b.aq.a(false);
        this.b.ar.a(null, t.ad, null, null);
        if (bl2) {
            this.b.ar.a(this.a.aA, this.a.aE);
            this.b.at.b(bt.iI[this.a.aE], t.i, (byte)2);
        } else {
            this.b.at.b(bt.iI[0], t.i, (byte)2);
        }
        this.b.at.a((byte)1);
        this.b.au.a("\u786e\u5b9a");
        this.b.aq.a(this.b.ar);
        this.b.aq.a(this.b.at);
        this.b.aq.a(this.b.au);
        this.b.aq.a(t.f, t.g, t.d, t.e);
        ca.h = 0;
        ca.g = 0;
        this.b.a = 0;
        this.a.l = 0;
        this.b.j = this.b.k;
        this.a.k = (short)50;
        this.a.j = (short)50;
    }

    public final void m(int n2) {
        block49: {
            block47: {
                block48: {
                    if (this.a.l != 0) break block47;
                    if (this.b.aq != null) {
                        this.b.aq.b(n2);
                    }
                    if (n2 == 514 || n2 == 520 || n2 == 1 || n2 == 4) {
                        this.b.at.b(bt.iI[this.b.ar.g()], t.i, (byte)2);
                        this.b.at.a((byte)1);
                    }
                    if (n2 != 0x10000000 && n2 != 0x40000000 && n2 != 517) break block48;
                    this.a.aA = this.b.ar.h();
                    this.a.aE = this.b.ar.g();
                    switch (this.a.aE) {
                        case 0: {
                            this.o();
                            break block49;
                        }
                        case 1: {
                            this.a.e(18);
                            break block49;
                        }
                        case 2: {
                            this.a.o();
                            this.a.l = 1;
                            this.a.a(bt.ap);
                            break block49;
                        }
                        case 3: {
                            this.a.o();
                            this.a.l = (short)5;
                            this.a.a(999999999L);
                            break block49;
                        }
                        case 4: {
                            this.a.o();
                            this.a.l = (short)2;
                            this.a.a(bt.am);
                            break block49;
                        }
                        case 5: {
                            this.m();
                            break block49;
                        }
                        case 6: {
                            this.a.a(99L);
                            this.a.l = (short)3;
                            break block49;
                        }
                        case 7: {
                            this.a.a(99L);
                            this.a.l = (short)4;
                            break block49;
                        }
                        case 8: {
                            this.b((byte)1);
                            break block49;
                        }
                        case 9: {
                            this.a.l = (short)6;
                            this.a.at = "\u60a8\u786e\u5b9a\u8981\u6d88\u8017\u4e00\u5b9a\u7269\u54c1\u63d0\u5347\u5e2e\u6d3e\u4eba\u6c14\u5417\uff1f";
                            ca.h = 0;
                            break block49;
                        }
                        case 10: {
                            this.a.l = (short)7;
                            this.a.at = "\u60a8\u786e\u5b9a\u8981\u6d88\u8017\u4e00\u5b9a\u7269\u54c1\u6269\u5bb9\u5e2e\u6d3e\u5b9d\u5e93\u5417\uff1f";
                            ca.h = 0;
                        }
                        default: {
                            return;
                        }
                    }
                }
                if (n2 == 0x20000000) {
                    bt.H();
                    this.a.k = 0;
                    this.a.j = 0;
                    return;
                }
                break block49;
            }
            if (this.a.l == 1 || this.a.l == 2) {
                if (n2 == 0x10000000 || n2 == 0x40000000) {
                    if (this.a.n() != -1L) {
                        if (this.a.n() > this.a.ah) {
                            this.b.b("\u8d85\u51fa\u6700\u5927\u503c,\u8bf7\u91cd\u65b0\u8f93\u5165");
                            return;
                        }
                        byte[] byArray = bz.b((short)4264, (byte)(this.a.l == 1 ? 1 : 3), this.a.n(), bt.ad);
                        if (byArray != null) {
                            com.yinhan.kjava.main.a.i.a(new w(4264, byArray));
                            this.b.a((String)null);
                        } else {
                            this.b.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
                        }
                        this.a.l = 0;
                        return;
                    }
                    this.b.b("\u8f93\u5165\u6709\u8bef,\u8bf7\u91cd\u65b0\u8f93\u5165");
                    return;
                }
                if (n2 == 0x20000000) {
                    this.a.l = 0;
                    return;
                }
                this.a.d(n2);
                return;
            }
            if (this.a.l == 3 || this.a.l == 4) {
                if (this.a.m == 0) {
                    if (n2 == 0x10000000 || n2 == 0x40000000 || n2 == 517) {
                        this.a.at = "\u53d1\u5e03" + this.a.ag + "\u5929\u5e2e\u6d3e\u4efb\u52a1\t\u662f\u5426\u786e\u8ba4\uff1f";
                        this.a.m = 1;
                        ca.h = 0;
                        return;
                    }
                    if (n2 == 0x20000000) {
                        this.a.l = 0;
                        return;
                    }
                    this.a.b(n2);
                    return;
                }
                if (this.a.m == 1) {
                    if (n2 == 0x10000000 || n2 == 0x40000000 || n2 == 517) {
                        byte[] byArray = bz.a((short)4368, this.a.ag, (byte)(this.a.l == 3 ? 1 : 2), bt.ad);
                        if (byArray != null) {
                            com.yinhan.kjava.main.a.i.a(new w(4368, byArray));
                            this.b.a((String)null);
                        } else {
                            this.b.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
                        }
                        ca.h = 0;
                        this.a.m = 0;
                        return;
                    }
                    if (n2 == 0x20000000) {
                        this.a.at = null;
                        this.a.m = 0;
                        ca.h = 0;
                        return;
                    }
                }
            } else {
                if (this.a.l == 5) {
                    if (n2 == 0x10000000 || n2 == 0x40000000) {
                        if (this.a.n() != -1L) {
                            if (this.a.n() > this.a.ah) {
                                this.b.b("\u8d85\u51fa\u6700\u5927\u503c,\u8bf7\u91cd\u65b0\u8f93\u5165");
                                return;
                            }
                            byte[] byArray = bz.b((short)4264, (byte)2, this.a.n(), bt.ad);
                            if (byArray != null) {
                                com.yinhan.kjava.main.a.i.a(new w(4264, byArray));
                                this.b.a((String)null);
                            } else {
                                this.b.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
                            }
                            this.a.l = 0;
                            return;
                        }
                        this.b.b("\u8f93\u5165\u6709\u8bef,\u8bf7\u91cd\u65b0\u8f93\u5165");
                        return;
                    }
                    if (n2 == 0x20000000) {
                        this.a.l = 0;
                        return;
                    }
                    this.a.d(n2);
                    return;
                }
                if (this.a.l == 6) {
                    if (n2 == 0x10000000 || n2 == 0x40000000 || n2 == 517) {
                        this.a.l = 0;
                        this.a((short)4677);
                        return;
                    }
                    if (n2 == 0x20000000) {
                        ca.l = 0;
                        ca.h = 0;
                        this.a.l = 0;
                        return;
                    }
                } else if (this.a.l == 7) {
                    if (n2 == 0x10000000 || n2 == 0x40000000 || n2 == 517) {
                        this.a.l = 0;
                        this.a((short)4265);
                        return;
                    }
                    if (n2 == 0x20000000) {
                        ca.l = 0;
                        ca.h = 0;
                        this.a.l = 0;
                    }
                }
            }
        }
    }

    private void a(short s2) {
        byte[] byArray = bz.C(s2, bt.ad);
        if (byArray != null) {
            com.yinhan.kjava.main.a.i.a(new w(s2, byArray));
            this.b.a((String)null);
            return;
        }
        this.b.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
    }

    private void b(byte by2) {
        byte[] byArray = bz.a((short)4239, by2, this.i, bt.ad);
        if (byArray != null) {
            com.yinhan.kjava.main.a.i.a(new w(4239, byArray));
            this.b.a((String)null);
            return;
        }
        this.b.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
    }

    public final void l() {
        String[] stringArray;
        this.a.a(this.w);
        this.k = new int[5];
        this.l = new int[5][4];
        this.m = new int[5][4];
        this.n = new int[4];
        this.b.aq.j();
        this.b.aq.a("\u8d21\u732e\u7269\u54c1");
        this.b.aq.a(false);
        if (t.b <= 176) {
            String[] stringArray2 = new String[5];
            stringArray2[0] = "";
            stringArray2[1] = "";
            stringArray2[2] = "";
            stringArray2[3] = "";
            stringArray = stringArray2;
            stringArray2[4] = "";
        } else {
            stringArray = t.ae;
        }
        Object object = stringArray;
        this.b.ar.a(ao.b(this.w), (String[])object, null, null);
        short s2 = com.yinhan.kjava.main.a.L.c;
        object = this.b.aq;
        this.b.aq.f = s2;
        this.b.ar.b(false);
        this.b.au.a(new String[]{"\u786e\u5b9a", "\u8fd4\u56de"});
        this.b.aq.a(this.b.ar);
        this.b.aq.a(this.b.au);
        this.b.aq.a(t.f, t.g, t.d, t.e);
        this.a.l = 0;
        this.b.j = this.b.k;
        this.a.k = (short)51;
        this.a.j = (short)51;
    }

    public final void m() {
        byte[] byArray = bz.r((short)4221, bt.ad);
        if (byArray != null) {
            com.yinhan.kjava.main.a.i.a(new w(4221, byArray));
            this.b.a((String)null);
            return;
        }
        this.b.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void n(int n2) {
        block72: {
            block71: {
                if (this.a.l != 0) return;
                if (this.b.aq != null) {
                    this.b.aq.b(n2);
                }
                if (this.b.aA <= 40) break block71;
                if (this.b.b == 2 || this.b.b == 518) {
                    switch (this.b.ar.g()) {
                        case 0: {
                            this.j = this.j + 100L <= bt.ap ? this.j + 100L : bt.ap;
                            this.k[0] = (int)this.j;
                            break;
                        }
                        case 1: {
                            short s2;
                            short s3 = this.B;
                            this.B = (short)(s3 + 1);
                            if (s3 >= bt.jh) {
                                s2 = bt.jh;
                            } else {
                                short s4 = this.B;
                                s2 = s4;
                                this.B = (short)(s4 + 1);
                            }
                            this.B = s2;
                            this.k[1] = s2;
                            break;
                        }
                        case 2: {
                            short s5;
                            short s6 = this.C;
                            this.C = (short)(s6 + 1);
                            if (s6 >= bt.jj) {
                                s5 = bt.jj;
                            } else {
                                short s7 = this.C;
                                s5 = s7;
                                this.C = (short)(s7 + 1);
                            }
                            this.C = s5;
                            this.k[2] = s5;
                            break;
                        }
                        case 3: {
                            short s8;
                            short s9 = this.D;
                            this.D = (short)(s9 + 1);
                            if (s9 >= bt.jl) {
                                s8 = bt.jl;
                            } else {
                                short s10 = this.D;
                                s8 = s10;
                                this.D = (short)(s10 + 1);
                            }
                            this.D = s8;
                            this.k[3] = s8;
                            break;
                        }
                        case 4: {
                            short s11;
                            short s12 = this.E;
                            this.E = (short)(s12 + 1);
                            if (s12 >= bt.jn) {
                                s11 = bt.jn;
                            } else {
                                short s13 = this.E;
                                s11 = s13;
                                this.E = (short)(s13 + 1);
                            }
                            this.E = s11;
                            this.k[4] = s11;
                        }
                    }
                    break block72;
                } else if (this.b.b == 8 || this.b.b == 516) {
                    switch (this.b.ar.g()) {
                        case 0: {
                            this.j = this.j - 100L <= 0L ? 0L : this.j - 100L;
                            this.k[0] = (int)this.j;
                            break;
                        }
                        case 1: {
                            short s14;
                            short s15 = this.B;
                            this.B = (short)(s15 - 1);
                            if (s15 <= 0) {
                                s14 = 0;
                            } else {
                                short s16 = this.B;
                                s14 = s16;
                                this.B = (short)(s16 - 1);
                            }
                            this.B = s14;
                            this.k[1] = s14;
                            break;
                        }
                        case 2: {
                            short s17;
                            short s18 = this.C;
                            this.C = (short)(s18 - 1);
                            if (s18 <= 0) {
                                s17 = 0;
                            } else {
                                short s19 = this.C;
                                s17 = s19;
                                this.C = (short)(s19 - 1);
                            }
                            this.C = s17;
                            this.k[2] = s17;
                            break;
                        }
                        case 3: {
                            short s20;
                            short s21 = this.D;
                            this.D = (short)(s21 - 1);
                            if (s21 <= 0) {
                                s20 = 0;
                            } else {
                                short s22 = this.D;
                                s20 = s22;
                                this.D = (short)(s22 - 1);
                            }
                            this.D = s20;
                            this.k[3] = s20;
                            break;
                        }
                        case 4: {
                            short s23;
                            short s24 = this.E;
                            this.E = (short)(s24 - 1);
                            if (s24 <= 0) {
                                s23 = 0;
                            } else {
                                short s25 = this.E;
                                s23 = s25;
                                this.E = (short)(s25 - 1);
                            }
                            this.E = s23;
                            this.k[4] = s23;
                        }
                        default: {
                            break;
                        }
                    }
                }
                break block72;
            }
            if (n2 == 2 || n2 == 518) {
                switch (this.b.ar.g()) {
                    case 0: {
                        this.j = this.j + 100L <= bt.ap ? this.j + 100L : bt.ap;
                        this.k[0] = (int)this.j;
                        break;
                    }
                    case 1: {
                        short s26;
                        short s27 = this.B;
                        this.B = (short)(s27 + 1);
                        if (s27 >= bt.jh) {
                            s26 = bt.jh;
                        } else {
                            short s28 = this.B;
                            s26 = s28;
                            this.B = (short)(s28 + 1);
                        }
                        this.B = s26;
                        this.k[1] = s26;
                        break;
                    }
                    case 2: {
                        short s29;
                        short s30 = this.C;
                        this.C = (short)(s30 + 1);
                        if (s30 >= bt.jj) {
                            s29 = bt.jj;
                        } else {
                            short s31 = this.C;
                            s29 = s31;
                            this.C = (short)(s31 + 1);
                        }
                        this.C = s29;
                        this.k[2] = s29;
                        break;
                    }
                    case 3: {
                        short s32;
                        short s33 = this.D;
                        this.D = (short)(s33 + 1);
                        if (s33 >= bt.jl) {
                            s32 = bt.jl;
                        } else {
                            short s34 = this.D;
                            s32 = s34;
                            this.D = (short)(s34 + 1);
                        }
                        this.D = s32;
                        this.k[3] = s32;
                        break;
                    }
                    case 4: {
                        short s35;
                        short s36 = this.E;
                        this.E = (short)(s36 + 1);
                        if (s36 >= bt.jn) {
                            s35 = bt.jn;
                        } else {
                            short s37 = this.E;
                            s35 = s37;
                            this.E = (short)(s37 + 1);
                        }
                        this.E = s35;
                        this.k[4] = s35;
                    }
                }
            } else if (n2 == 8 || n2 == 516) {
                switch (this.b.ar.g()) {
                    case 0: {
                        this.j = this.j - 100L <= 0L ? 0L : this.j - 100L;
                        this.k[0] = (int)this.j;
                        break;
                    }
                    case 1: {
                        short s38;
                        short s39 = this.B;
                        this.B = (short)(s39 - 1);
                        if (s39 <= 0) {
                            s38 = 0;
                        } else {
                            short s40 = this.B;
                            s38 = s40;
                            this.B = (short)(s40 - 1);
                        }
                        this.B = s38;
                        this.k[1] = s38;
                        break;
                    }
                    case 2: {
                        short s41;
                        short s42 = this.C;
                        this.C = (short)(s42 - 1);
                        if (s42 <= 0) {
                            s41 = 0;
                        } else {
                            short s43 = this.C;
                            s41 = s43;
                            this.C = (short)(s43 - 1);
                        }
                        this.C = s41;
                        this.k[2] = s41;
                        break;
                    }
                    case 3: {
                        short s44;
                        short s45 = this.D;
                        this.D = (short)(s45 - 1);
                        if (s45 <= 0) {
                            s44 = 0;
                        } else {
                            short s46 = this.D;
                            s44 = s46;
                            this.D = (short)(s46 - 1);
                        }
                        this.D = s44;
                        this.k[3] = s44;
                        break;
                    }
                    case 4: {
                        short s47;
                        short s48 = this.E;
                        this.E = (short)(s48 - 1);
                        if (s48 <= 0) {
                            s47 = 0;
                        } else {
                            short s49 = this.E;
                            s47 = s49;
                            this.E = (short)(s49 - 1);
                        }
                        this.E = s47;
                        this.k[4] = s47;
                        break;
                    }
                }
            }
            ++this.b.aA;
        }
        if (n2 == 0x40000000 || n2 == 517) {
            if (this.b.ar.g() != 0) return;
            this.b.a("\u8bf7\u8f93\u5165\u8d21\u732e\u91d1\u989d", 2);
            return;
        }
        if (n2 != 0x10000000) {
            if (n2 != 0x20000000) return;
            this.q();
            this.b(true);
            return;
        }
        if (this.j == 0L && this.B == 0 && this.C == 0 && this.D == 0 && this.E == 0) {
            this.b.b("\u8bf7\u8f93\u5165\u8d21\u732e\u57fa\u91d1\u7684\u6570\u76ee\uff01");
            return;
        }
        byte[] byArray = bz.a((short)4220, bt.ad, this.j, this.B, this.C, this.D, this.E);
        if (byArray != null) {
            com.yinhan.kjava.main.a.i.a(new w(4220, byArray));
            this.b.a((String)null);
            return;
        }
        this.b.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
    }

    public final void n() {
        this.a.a(this.A);
        this.i[0] = bt.iK[0];
        this.i[1] = bt.iM[0];
        this.i[2] = bt.iL[0];
        this.x = new int[3][4];
        this.y = new int[3][4];
        this.z = new int[3][4];
        this.b.aq.j();
        this.b.aq.a("\u5b9d\u5e93\u914d\u7f6e");
        this.b.aq.a(false);
        this.b.ar.a(ao.b(this.A), t.af, null, null);
        this.b.au.a(new String[]{"\u786e\u5b9a", "\u8fd4\u56de"});
        this.b.aq.a(this.b.ar);
        this.b.aq.a(this.b.au);
        this.b.aq.a(t.f, t.g, t.d, t.e);
        this.a.l = 0;
        this.b.j = this.b.k;
        this.a.k = (short)114;
        this.a.j = (short)114;
    }

    public final void o(int n2) {
        if (this.b.aq != null) {
            this.b.aq.b(n2);
        }
        if (this.b.aA > 40) {
            if (this.b.b == 2 || this.b.b == 518) {
                switch (this.b.ar.g()) {
                    case 0: {
                        int n3;
                        byte by2 = bt.iK[0];
                        bt.iK[0] = (byte)(by2 + 1);
                        if (by2 >= bt.iK[1]) {
                            n3 = bt.iK[1];
                        } else {
                            int n4 = bt.iK[0];
                            n3 = n4;
                            bt.iK[0] = (byte)(n4 + 1);
                        }
                        bt.iK[0] = n3;
                        this.i[0] = n3;
                        break;
                    }
                    case 1: {
                        bt.iM[0] = bt.iM[0] + 10000 >= bt.iM[1] ? bt.iM[1] : bt.iM[0] + 10000;
                        this.i[1] = bt.iM[0];
                        break;
                    }
                    case 2: {
                        int n5;
                        byte by3 = bt.iL[0];
                        bt.iL[0] = (byte)(by3 + 1);
                        if (by3 >= bt.iL[1]) {
                            n5 = bt.iL[1];
                        } else {
                            int n6 = bt.iL[0];
                            n5 = n6;
                            bt.iL[0] = (byte)(n6 + 1);
                        }
                        bt.iL[0] = n5;
                        this.i[2] = n5;
                    }
                }
            } else if (this.b.b == 8 || this.b.b == 516) {
                switch (this.b.ar.g()) {
                    case 0: {
                        int n7;
                        byte by4 = bt.iK[0];
                        bt.iK[0] = (byte)(by4 - 1);
                        if (by4 <= 0) {
                            n7 = 0;
                        } else {
                            int n8 = bt.iK[0];
                            n7 = n8;
                            bt.iK[0] = (byte)(n8 - 1);
                        }
                        bt.iK[0] = n7;
                        this.i[0] = n7;
                        break;
                    }
                    case 1: {
                        bt.iM[0] = bt.iM[0] - 10000 <= 0 ? 0 : bt.iM[0] - 10000;
                        this.i[1] = bt.iM[0];
                        break;
                    }
                    case 2: {
                        int n9;
                        byte by5 = bt.iL[0];
                        bt.iL[0] = (byte)(by5 - 1);
                        if (by5 <= 0) {
                            n9 = 0;
                        } else {
                            int n10 = bt.iL[0];
                            n9 = n10;
                            bt.iL[0] = (byte)(n10 - 1);
                        }
                        bt.iL[0] = n9;
                        this.i[2] = n9;
                    }
                    default: {
                        break;
                    }
                }
            }
        } else {
            if (n2 == 2 || n2 == 518) {
                switch (this.b.ar.g()) {
                    case 0: {
                        int n11;
                        byte by6 = bt.iK[0];
                        bt.iK[0] = (byte)(by6 + 1);
                        if (by6 >= bt.iK[1]) {
                            n11 = bt.iK[1];
                        } else {
                            int n12 = bt.iK[0];
                            n11 = n12;
                            bt.iK[0] = (byte)(n12 + 1);
                        }
                        bt.iK[0] = n11;
                        this.i[0] = n11;
                        break;
                    }
                    case 1: {
                        bt.iM[0] = bt.iM[0] + 10000 >= bt.iM[1] ? bt.iM[1] : bt.iM[0] + 10000;
                        this.i[1] = bt.iM[0];
                        break;
                    }
                    case 2: {
                        int n13;
                        byte by7 = bt.iL[0];
                        bt.iL[0] = (byte)(by7 + 1);
                        if (by7 >= bt.iL[1]) {
                            n13 = bt.iL[1];
                        } else {
                            int n14 = bt.iL[0];
                            n13 = n14;
                            bt.iL[0] = (byte)(n14 + 1);
                        }
                        bt.iL[0] = n13;
                        this.i[2] = n13;
                    }
                }
            } else if (n2 == 8 || n2 == 516) {
                switch (this.b.ar.g()) {
                    case 0: {
                        int n15;
                        byte by8 = bt.iK[0];
                        bt.iK[0] = (byte)(by8 - 1);
                        if (by8 <= 0) {
                            n15 = 0;
                        } else {
                            int n16 = bt.iK[0];
                            n15 = n16;
                            bt.iK[0] = (byte)(n16 - 1);
                        }
                        bt.iK[0] = n15;
                        this.i[0] = n15;
                        break;
                    }
                    case 1: {
                        bt.iM[0] = bt.iM[0] - 10000 <= 0 ? 0 : bt.iM[0] - 10000;
                        this.i[1] = bt.iM[0];
                        break;
                    }
                    case 2: {
                        int n17;
                        byte by9 = bt.iL[0];
                        bt.iL[0] = (byte)(by9 - 1);
                        if (by9 <= 0) {
                            n17 = 0;
                        } else {
                            int n18 = bt.iL[0];
                            n17 = n18;
                            bt.iL[0] = (byte)(n18 - 1);
                        }
                        bt.iL[0] = n17;
                        this.i[2] = n17;
                    }
                }
            }
            ++this.b.aA;
        }
        if (n2 == 0x40000000 || n2 == 517) {
            if (this.b.ar.g() == 0) {
                this.b.a("\u8bf7\u8f93\u5165\u7269\u54c1\u6389\u7387", 2);
                return;
            }
            if (this.b.ar.g() == 1) {
                this.b.a("\u8bf7\u8f93\u5165\u94f6\u4e24\u5956\u52b1", 2);
                return;
            }
            if (this.b.ar.g() == 2) {
                this.b.a("\u8bf7\u8f93\u5165\u7ecf\u9a8c\u52a0\u6210", 2);
                return;
            }
        } else {
            if (n2 == 0x10000000) {
                if (bt.iK[1] != 0 || bt.iM[1] != 0 || bt.iL[1] != 0) {
                    this.b((byte)2);
                    this.b.a = 0;
                    return;
                }
                this.b.b("\u8bf7\u8f93\u5165\u6b63\u786e\u7684\u6570\u76ee\uff01");
                return;
            }
            if (n2 == 0x20000000) {
                this.b(true);
            }
        }
    }

    public final void a(Graphics graphics) {
        if (this.b.aq != null) {
            this.b.aq.a(graphics);
            for (int i2 = 0; i2 < this.b.ar.f(); ++i2) {
                int n2 = this.b.ar.a() + this.b.ar.c() - com.yinhan.kjava.main.a.C.b - 126;
                int n3 = this.b.ar.b() + 4 + i2 * this.b.ar.e();
                ca.a(graphics, i2 == 1 ? ao.a(this.b.l, this.i[i2]) : this.i[i2] + "%", n2, n3, 122);
                int n4 = n2;
                n2 = 122;
                int n5 = n3;
                int n6 = n4;
                n3 = i2;
                aq aq2 = this;
                if (aq2.x != null && aq2.x.length > n3) {
                    aq2.x[n3][0] = n6;
                    aq2.x[n3][1] = n5;
                    aq2.x[n3][2] = 12;
                    aq2.x[n3][3] = t.j;
                }
                if (aq2.y != null && aq2.y.length > n3) {
                    aq2.y[n3][0] = n6 + 122 - 12;
                    aq2.y[n3][1] = n5;
                    aq2.y[n3][2] = 12;
                    aq2.y[n3][3] = t.j;
                }
                if (aq2.z == null) continue;
                aq2.z[n3][0] = n6 + 12;
                aq2.z[n3][1] = n5;
                aq2.z[n3][2] = 98;
                aq2.z[n3][3] = t.j;
            }
        }
    }

    public final int a(int n2, int n3, int n4) {
        if (n2 == 0) {
            for (int i2 = 0; i2 < this.x.length; ++i2) {
                if (n3 >= this.x[i2][0] && n3 <= this.x[i2][0] + this.x[i2][2] && n4 >= this.x[i2][1] && n4 <= this.x[i2][1] + this.x[i2][3]) {
                    return 8;
                }
                if (n3 >= this.y[i2][0] && n3 <= this.y[i2][0] + this.y[i2][2] && n4 >= this.y[i2][1] && n4 <= this.y[i2][1] + this.y[i2][3]) {
                    return 2;
                }
                if (n3 < this.z[i2][0] || n3 > this.z[i2][0] + this.z[i2][2] || n4 < this.z[i2][1] || n4 > this.z[i2][1] + this.z[i2][3]) continue;
                return 0x40000000;
            }
        }
        return n2;
    }

    public final void o() {
        this.a.l = 0;
        this.b.aw = 0;
        ca.l = 0;
        this.b.aq.b();
        this.b.aq.a("\u5e2e\u6d3e\u5b9d\u5e93");
        this.b.aq.a(true);
        this.b.as.a(new String[]{"\u5b9d\u5e93\u4e00", "\u5b9d\u5e93\u4e8c", "\u5b9d\u5e93\u4e09"});
        this.b.as.a((byte)1);
        this.b.aq.a(t.e <= 240 ? 79 : 120);
        if (this.a.j == 115 || this.a.j == 64) {
            this.a.aq = this.a.aF;
            this.a.ar = this.a.aG;
            this.b.as.a = this.a.aH;
        } else {
            this.a.ar = 0;
            this.a.aq = 0;
        }
        int n2 = (this.b.as.a << 5) + (this.a.ar << 3) + this.a.aq;
        if (bt.iN != null && n2 < bt.iN.length) {
            this.b.at.a(bt.ja[n2], t.i, (byte)1);
        } else {
            this.b.at.a("\u6ca1\u6709\u7269\u54c1,\u63093\u30019\u952e\u53ef\u4ee5\u4e0a\u4e0b\u7ffb\u6eda\u6b64\u5c5e\u6027\u63cf\u8ff0\u6846", t.i, (byte)1);
        }
        this.b.au.a("\u64cd\u4f5c");
        this.b.au.a(true);
        this.b.at.a((byte)1);
        this.b.aq.a(this.b.as);
        this.b.aq.a(this.b.at);
        this.b.aq.a(this.b.au);
        this.b.aq.a(t.f, t.g, t.d, t.e);
        this.b.j = this.b.k;
        this.a.k = (short)115;
        this.a.j = (short)115;
    }

    public final void p() {
        int n2 = (this.b.as.a << 5) + (this.a.ar << 3) + this.a.aq;
        if (bt.iN != null && n2 < bt.iN.length) {
            this.b.at.a(bt.ja[n2], t.i, (byte)1);
        } else {
            this.b.at.a("\u6ca1\u6709\u7269\u54c1\uff0c\u63093\u30019\u952e\u53ef\u4ee5\u4e0a\u4e0b\u7ffb\u6eda\u6b64\u5c5e\u6027\u63cf\u8ff0\u6846", t.i, (byte)1);
        }
        this.b.at.a((byte)1);
        ca.l = 0;
    }

    public final void p(int n2) {
        block53: {
            int n3;
            block54: {
                block55: {
                    block52: {
                        n3 = (this.b.as.a << 5) + (this.a.ar << 3) + this.a.aq;
                        if (this.a.l != 0) break block52;
                        this.a.a(bt.iR);
                        if (this.b.aq != null) {
                            this.b.aq.b(n2);
                        }
                        if (n2 == 0x10000000 || n2 == 0x40000000 || n2 == 517) {
                            if (bt.iN != null && n3 < bt.iN.length) {
                                String[] stringArray = new String[]{"\u67e5\u770b", "\u53d6\u51fa", "\u4e22\u5f03", "\u6574\u7406"};
                                ca.a(this.a.au[(this.a.ar << 3) + this.a.aq][0] - 17, this.a.au[(this.a.ar << 3) + this.a.aq][1] + 17, stringArray, false);
                                this.a.l = 1;
                                return;
                            }
                        } else {
                            if (n2 == 1024 || n2 == 2048) {
                                this.p();
                                return;
                            }
                            if (n2 == 8 || n2 == 516) {
                                this.a.aq = this.a.aq <= 0 ? 7 : (this.a.aq = this.a.aq - 1);
                                this.p();
                                return;
                            }
                            if (n2 == 2 || n2 == 518) {
                                this.a.aq = this.a.aq >= 7 ? 0 : (this.a.aq = this.a.aq + 1);
                                this.p();
                                return;
                            }
                            if (n2 == 1 || n2 == 514) {
                                this.a.ar = this.a.ar <= 0 ? 3 : (this.a.ar = this.a.ar - 1);
                                this.p();
                                return;
                            }
                            if (n2 == 4 || n2 == 520) {
                                this.a.ar = this.a.ar >= 3 ? 0 : (this.a.ar = this.a.ar + 1);
                                this.p();
                                return;
                            }
                            if (n2 == 0x20000000) {
                                this.a.am = null;
                                this.b(true);
                                return;
                            }
                        }
                        break block53;
                    }
                    if (this.a.l != 1) break block54;
                    ca.b(n2);
                    if (n2 != 0x10000000 && n2 != 517 && n2 != 0x40000000) break block55;
                    if (bt.iN == null || n3 >= bt.iN.length || bt.iQ[n3] <= 0) break block53;
                    switch (ca.o) {
                        case 0: {
                            if (bt.a(bt.iP[n3])) {
                                n2 = n3;
                                bt.ko = bt.iN[n2];
                                bt.kp = bt.iO[n2];
                                bt.kq = bt.iO[n2];
                                bt.ks = bt.iS[n2];
                                bt.kt = bt.iT[n2];
                                bt.ku = bt.iU[n2];
                                bt.kv = bt.iV[n2];
                                bt.kw = bt.iW[n2];
                                bt.kx = bt.iX[n2];
                                n3 = 0;
                                if (bt.jb[n2] != null) {
                                    byte by2 = (byte)bt.jb[n2].length;
                                    n3 = by2;
                                    if (by2 > 0) {
                                        bt.kr = new short[n3];
                                        for (int n4 = 0; n4 < n3; n4 = (int)((byte)(n4 + 1))) {
                                            bt.kr[n4] = bt.jb[n2][n4];
                                        }
                                    }
                                } else {
                                    bt.kr = null;
                                }
                                bt.ky = bt.iY[n2];
                                bt.kz = (byte)-1;
                                bt.kA = bt.ja[n2];
                                this.a.O.a(0, this.a.k, -1);
                            } else {
                                this.b.aq.j();
                                this.b.aq.b();
                                this.b.aq.a("\u5b9d\u7269\u8be6\u60c5");
                                if (bt.ja != null && n3 < bt.ja.length && bt.ja[n3] != null) {
                                    this.b.at.a(bt.iO[n3] + "\uff1a\t" + bt.ja[n3], t.i, (byte)1);
                                }
                                this.b.aq.a(this.b.at);
                                this.b.aq.a(t.f, t.g, t.d, t.e);
                                this.a.l = (short)2;
                            }
                            this.a.aF = this.a.aq;
                            this.a.aG = this.a.ar;
                            this.a.aH = this.b.as.a;
                            break block53;
                        }
                        case 1: {
                            if (bt.iQ[n3] > 1) {
                                this.a.a((long)bt.iQ[n3]);
                                this.a.l = (short)3;
                            } else {
                                ca.h = 0;
                                String string = bt.iO[n3];
                                int n5 = ca.a(string) != -1 ? ca.a(string) : 15138723;
                                this.a.at = "\u60a8\u786e\u5b9a\u53d6\u51fa" + (n5 != 15138723 ? string.substring(3, string.length()) : string) + "X" + bt.iQ[n3] + "\uff1f";
                                this.a.l = (short)5;
                            }
                            break block53;
                        }
                        case 2: {
                            if (bt.iQ[n3] > 1) {
                                this.a.a((long)bt.iQ[n3]);
                                this.a.l = (short)6;
                            } else {
                                ca.h = 0;
                                String string = bt.iO[n3];
                                int n6 = ca.a(string) != -1 ? ca.a(string) : 15138723;
                                this.a.at = "\u60a8\u786e\u5b9a\u4e22\u5f03" + (n6 != 15138723 ? string.substring(3, string.length()) : string) + "X" + bt.iQ[n3] + "\uff1f";
                                this.a.l = (short)4;
                            }
                            break block53;
                        }
                        case 3: {
                            byte[] byArray = bz.C((short)4366, bt.ad);
                            if (byArray != null) {
                                com.yinhan.kjava.main.a.i.a(new w(4366, byArray));
                                this.a.e.a((String)null);
                            } else {
                                this.a.e.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
                            }
                            this.a.l = 0;
                        }
                        default: {
                            return;
                        }
                    }
                }
                if (n2 == 0x20000000) {
                    this.a.l = 0;
                    return;
                }
                break block53;
            }
            if (this.a.l == 2) {
                if (this.b.aq != null) {
                    this.b.aq.b(n2);
                }
                if (n2 == 0x20000000) {
                    this.o();
                    return;
                }
            } else if (this.a.l == 3 || this.a.l == 6) {
                this.a.b(n2);
                if (n2 == 0x10000000 || n2 == 0x40000000 || n2 == 517) {
                    if (bt.iN != null && n3 < bt.iN.length && bt.iQ[n3] > 0) {
                        ca.h = 0;
                        if (this.a.l == 3) {
                            ca.h = 0;
                            String string = bt.iO[n3];
                            int n7 = ca.a(string) != -1 ? ca.a(string) : 15138723;
                            this.a.at = "\u60a8\u786e\u5b9a\u53d6\u51fa" + (n7 != 15138723 ? string.substring(3, string.length()) : string) + "X" + this.a.ag + "\uff1f";
                            this.a.l = (short)5;
                            return;
                        }
                        ca.h = 0;
                        String string = bt.iO[n3];
                        int n8 = ca.a(string) != -1 ? ca.a(string) : 15138723;
                        this.a.at = "\u60a8\u786e\u5b9a\u4e22\u5f03" + (n8 != 15138723 ? string.substring(3, string.length()) : string) + "X" + this.a.ag + "\uff1f";
                        this.a.l = (short)4;
                        return;
                    }
                } else if (n2 == 0x20000000) {
                    this.a.l = 1;
                    return;
                }
            } else if (this.a.l == 4) {
                if (n2 == 0x10000000 || n2 == 0x40000000 || n2 == 517) {
                    if (bt.iQ[n3] > 1) {
                        this.c((byte)this.a.ag);
                    } else {
                        this.c(bt.iQ[n3]);
                    }
                    this.a.l = 0;
                    ca.h = 0;
                    return;
                }
                if (n2 == 0x20000000) {
                    ca.h = 0;
                    this.a.l = 0;
                    return;
                }
            } else if (this.a.l == 5) {
                if (n2 == 0x10000000 || n2 == 0x40000000 || n2 == 517) {
                    if (bt.iQ[n3] > 1) {
                        this.d((byte)this.a.ag);
                    } else {
                        this.d(bt.iQ[n3]);
                    }
                    ca.h = 0;
                    this.a.l = 0;
                    return;
                }
                if (n2 == 0x20000000) {
                    ca.h = 0;
                    this.a.l = 0;
                }
            }
        }
    }

    private void c(byte by2) {
        byte[] byArray = bz.b((short)4246, bt.iN[(this.b.as.a << 5) + (this.a.ar << 3) + this.a.aq], by2, bt.ad);
        if (byArray != null) {
            com.yinhan.kjava.main.a.i.a(new w(4246, byArray));
            this.a.e.a((String)null);
            return;
        }
        this.a.e.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
    }

    public final void b(Graphics graphics) {
        if (this.b.aq != null) {
            int n2;
            int n3 = t.e <= 240 ? 79 : 120;
            this.b.aq.a(graphics);
            n n4 = this.b.as;
            ca.a(graphics, this.b.aq.a + 5, this.b.aq.b + 29 + n4.b, this.b.aq.c - 11, n3, 1);
            ca.a(graphics);
            Graphics graphics2 = graphics;
            aq aq2 = this;
            int n5 = (aq2.b.aq.c - 11 - (ao.x.b << 3)) / 9;
            int n6 = ((t.e <= 240 ? 79 : 120) - 6 - (ao.x.b << 2)) / 5;
            int n7 = aq2.b.aq.a + 8 + n5;
            n4 = aq2.b.as;
            int n8 = aq2.b.aq.b + 33 + n4.b + n6;
            for (n2 = 0; n2 < 32; ++n2) {
                com.yinhan.kjava.main.a.f.a(graphics2, ao.x, null, null, 0, 0, n2 % 8 * (ao.x.b + n5) + n7, n2 / 8 * (ao.x.b + n6) + n8, 0, 0);
                aq2.a.a(n2, n2 % 8 * (ao.x.b + n5) + n7, n2 / 8 * (ao.x.b + n6) + n8, (int)ao.x.b, (int)ao.x.c);
            }
            n2 = 0;
            ca.d(graphics2, n7 + aq2.a.aq * (ao.x.b + n5), n8 + aq2.a.ar * (ao.x.b + n6), 17, 17);
            if (bt.iR != null) {
                for (int i2 = aq2.b.as.a << 5; i2 < (bt.iR.length > aq2.b.as.a + 1 << 5 ? aq2.b.as.a + 1 << 5 : bt.iR.length); ++i2) {
                    int n9 = i2 % 32;
                    com.yinhan.kjava.main.a.f.a(graphics2, ao.b(bt.iR[i2]), null, null, 0, 0, n9 % 8 * (ao.x.b + n5) + n7 + 1, n9 / 8 * (ao.x.b + n6) + n8 + 1, 0, 0);
                    if (bt.iQ[i2] > 9) {
                        com.yinhan.kjava.main.a.f.a(graphics2, com.yinhan.kjava.main.a.n, null, bt.iQ[i2] / 10, 0, 0, 10 + n9 % 8 * (ao.x.b + n5) + n7, n9 / 8 * (ao.x.b + n6) + n8 + 12, 0, 0);
                        com.yinhan.kjava.main.a.f.a(graphics2, com.yinhan.kjava.main.a.n, null, bt.iQ[i2] % 10, 0, 0, 14 + n9 % 8 * (ao.x.b + n5) + n7, n9 / 8 * (ao.x.b + n6) + n8 + 12, 0, 0);
                    } else if (bt.iQ[i2] > 1) {
                        com.yinhan.kjava.main.a.f.a(graphics2, com.yinhan.kjava.main.a.n, null, bt.iQ[i2] % 10, 0, 0, 14 + n9 % 8 * (ao.x.b + n5) + n7, n9 / 8 * (ao.x.b + n6) + n8 + 12, 0, 0);
                    }
                    if (i2 != (aq2.a.ar << 3) + aq2.a.aq + 32 * aq2.b.as.a) continue;
                    n2 = i2;
                }
                if (n2 >= 0 && n2 < bt.iR.length && n2 == (aq2.a.ar << 3) + aq2.a.aq + 32 * aq2.b.as.a) {
                    ca.a(graphics2, bt.iO[n2] + "X" + bt.iQ[n2], bt.iZ[n2], n7 + aq2.a.aq * (ao.x.b + n5) + ao.x.b / 2, n8 + aq2.a.ar * (ao.x.b + n6) + ao.x.b / 2);
                } else if ((aq2.b.as.a << 5) + (aq2.a.ar << 3) + aq2.a.aq >= bt.iJ) {
                    ca.a(graphics2, "\u672a\u5f00\u542f", -1L, n7 + aq2.a.aq * (ao.x.b + n5) + ao.x.b / 2, n8 + aq2.a.ar * (ao.x.b + n6) + ao.x.b / 2);
                }
            }
        }
        if (this.a.l == 1) {
            ca.c(graphics);
            return;
        }
        if (this.a.l == 2) {
            if (this.b.aq != null) {
                this.b.aq.a(graphics);
                return;
            }
        } else {
            if (this.a.l == 3 || this.a.l == 6) {
                this.a.a(graphics, "\u6570\u91cf");
                return;
            }
            if (this.a.l == 5 || this.a.l == 4) {
                ca.a(graphics, this.a.at, new String[]{"\u786e\u5b9a", "\u53d6\u6d88"});
            }
        }
    }

    private void d(byte by2) {
        byte[] byArray = bz.b((short)4245, bt.iN[(this.b.as.a << 5) + (this.a.ar << 3) + this.a.aq], by2, bt.ad);
        if (byArray != null) {
            com.yinhan.kjava.main.a.i.a(new w(4245, byArray));
            this.a.e.a((String)null);
            return;
        }
        this.a.e.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
    }

    public final void q() {
        this.j = 0L;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = 0;
    }

    public final void c(Graphics graphics) {
        if (this.a.l == 0 && this.b.aq != null) {
            ca.a(graphics, com.yinhan.kjava.main.a.L.a, com.yinhan.kjava.main.a.L.b, this.b.aq.a + 5, this.b.aq.b + this.b.aq.d - 53, this.b.aq.c - 10, (int)com.yinhan.kjava.main.a.L.c);
            this.b.aq.a(graphics);
            for (int i2 = 0; i2 < this.b.ar.f(); ++i2) {
                int n2 = this.b.ar.a() + this.b.ar.c() - com.yinhan.kjava.main.a.C.b - 130;
                int n3 = this.b.ar.b() + 4 + i2 * this.b.ar.e();
                ca.a(graphics, i2 == 0 ? ao.a(this.b.l, this.j) : "" + this.k[i2], n2, n3, 124);
                int n4 = n2;
                n2 = 124;
                int n5 = n3;
                int n6 = n4;
                n3 = i2;
                aq aq2 = this;
                if (aq2.l != null && aq2.l.length > n3) {
                    aq2.l[n3][0] = n6;
                    aq2.l[n3][1] = n5;
                    aq2.l[n3][2] = 12;
                    aq2.l[n3][3] = t.j;
                }
                if (aq2.m != null && aq2.m.length > n3) {
                    aq2.m[n3][0] = n6 + 124 - 12;
                    aq2.m[n3][1] = n5;
                    aq2.m[n3][2] = 12;
                    aq2.m[n3][3] = t.j;
                }
                if (aq2.n == null || n3 != 0) continue;
                aq2.n[0] = n6 + 12;
                aq2.n[1] = n5;
                aq2.n[2] = 100;
                aq2.n[3] = t.j;
            }
            long l2 = (this.j + (long)this.B * bt.jg + (long)this.C * bt.ji + (long)this.D * bt.jk + (long)this.E * bt.jm) / 300L;
            ca.a(graphics, "\u5f97\u5230\u529f\u52cb\uff1a" + l2, this.b.aq.a + this.b.aq.c / 2, this.b.aq.b + this.b.aq.d - 51 + (com.yinhan.kjava.main.a.M.a.getHeight() - t.j) / 2, 17, 0xFFFDDA, 0);
        }
    }

    public final void r() {
        byte[] byArray = bz.s((short)4236, bt.ad);
        if (byArray != null) {
            com.yinhan.kjava.main.a.i.a(new w(4236, byArray));
            this.b.a((String)null);
            return;
        }
        this.b.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
    }

    public final void q(int n2) {
        byte[] byArray = bz.k(n2 == 0 ? (short)4230 : 4232, bt.ad, bt.gQ);
        if (byArray != null) {
            com.yinhan.kjava.main.a.i.a(new w(n2 == 0 ? (short)4230 : 4232, byArray));
            this.b.a((String)null);
            return;
        }
        this.b.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
    }

    public final void s() {
        this.b.aq.j();
        this.b.aq.a("\u533a\u57df\u5efa\u8bbe");
        this.b.aq.a(true);
        this.b.as.a(new String[]{"\u8d2d\u4e70", "\u4ed3\u5e93"});
        this.b.ar.a(null, bt.jp, null, null);
        this.b.at.b(bt.jq == null ? null : bt.jq[this.b.ar.g()], t.i, (byte)2);
        this.b.at.a((byte)1);
        this.b.au.a("\u8d2d\u4e70");
        this.b.au.a(true);
        this.b.aq.a(this.b.as);
        this.b.aq.a(this.b.ar);
        this.b.aq.a(this.b.at);
        this.b.aq.a(this.b.au);
        this.b.aq.a(t.f, t.g, t.d, t.e);
        this.a.l = 0;
        this.b.j = this.b.k;
        this.a.k = (short)52;
        this.a.j = (short)52;
    }

    public final void t() {
        this.b.ar.a(null, bt.js, null, null);
        this.b.at.b(bt.jt == null ? null : bt.jt[this.b.ar.g()], t.i, (byte)2);
        this.b.at.a((byte)1);
        this.b.au.a("\u9009\u62e9");
        this.b.au.a(true);
        this.a.l = 0;
        this.b.j = this.b.k;
        this.a.k = (short)52;
        this.a.j = (short)52;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void r(int n2) {
        if (this.a.l == 0) {
            if (this.b.aq != null) {
                this.b.aq.b(n2);
            }
            if (n2 == 8 || n2 == 516 || n2 == 2 || n2 == 518) {
                bt.gQ = 1;
                this.q(this.b.as.a);
                if (this.b.as.a == 0) {
                    this.b.au.a("\u9009\u62e9");
                    this.b.au.a(true);
                } else if (this.b.as.a == 1) {
                    this.b.au.a("\u8d2d\u4e70");
                    this.b.au.a(true);
                }
            }
            if ((n2 == 1 || n2 == 514 || n2 == 4 || n2 == 520) && (this.b.as.a == 0 ? bt.jq != null : bt.jt != null)) {
                this.b.at.b(this.b.as.a == 0 ? bt.jq[this.b.ar.g()] : bt.jt[this.b.ar.g()], t.i, (byte)2);
                this.b.at.a((byte)1);
            }
            if (n2 == 0x10000000 || n2 == 0x40000000 || n2 == 517) {
                if (this.b.as.a == 0 && bt.jo != null) {
                    ca.a(0 + t.f, 2 * t.j + 11 + this.b.ar.i() * t.j + t.g, new String[]{"\u8d2d\u4e70"}, true);
                    this.a.l = 1;
                    return;
                }
                if (this.b.as.a != 1) return;
                if (bt.jr == null) return;
                ca.a(0 + t.f, 2 * t.j + 11 + this.b.ar.i() * t.j + t.g, new String[]{"\u5e03\u7f6e", "\u5356\u51fa"}, true);
                this.a.l = (short)2;
                return;
            }
            if (n2 == 0x20000000) {
                bt.I();
                bt.J();
                this.a.k = 0;
                this.a.j = 0;
                return;
            }
            if (n2 == 1024) {
                if (bt.gQ > 1 && bt.gR == 1) {
                    bt.gQ = bt.gQ - 1 <= 1 ? (short)1 : (short)(bt.gQ - 1);
                    this.q(this.b.as.a);
                    return;
                }
                if (bt.gQ <= 1) return;
                if (bt.gR != 0) return;
                bt.gQ = bt.gQ - 1 < 1 ? (short)1 : (short)(bt.gQ - 1);
                this.q(this.b.as.a);
                return;
            }
            if (n2 != 2048) return;
            if (bt.gQ <= 1 && bt.gR == 1) {
                bt.gQ = (short)(bt.gQ + 1);
                this.q(this.b.as.a);
                return;
            }
            if (bt.gQ <= 1) return;
            if (bt.gR != 1) return;
            bt.gQ = (short)(bt.gQ + 1);
            this.q(this.b.as.a);
            return;
        }
        if (this.a.l == 1) {
            ca.b(n2);
            if (n2 != 0x10000000 && n2 != 0x40000000 && n2 != 517) {
                if (n2 != 0x20000000) return;
                this.a.l = 0;
                return;
            }
            byte[] byArray = bz.l((short)4233, bt.ad, bt.jo[this.b.ar.g()]);
            if (byArray != null) {
                com.yinhan.kjava.main.a.i.a(new w(4233, byArray));
                this.b.a((String)null);
                return;
            }
            this.b.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
            return;
        }
        if (this.a.l != 2) return;
        ca.b(n2);
        if (n2 != 0x10000000 && n2 != 0x40000000 && n2 != 517) {
            if (n2 != 0x20000000) return;
            this.a.l = 0;
            return;
        }
        if (ca.o == 0) {
            this.a.a(bt.js[this.b.ar.g()], bt.jr[this.b.ar.g()], bt.ju[this.b.ar.g()], (byte)0, (byte)4);
            return;
        }
        if (ca.o != 1) return;
        byte[] byArray = bz.y((short)4237, bt.ad, bt.jr[this.b.ar.g()]);
        if (byArray != null) {
            com.yinhan.kjava.main.a.i.a(new w(4237, byArray));
            this.b.a((String)null);
            return;
        }
        this.b.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
    }

    public final void a(String object) {
        byte[] byArray = bz.d((short)4864, (String)object, bt.ad, bt.gQ);
        object = byArray;
        if (byArray != null) {
            com.yinhan.kjava.main.a.i.a(new w(4864, (byte[])object));
            this.b.a((String)null);
            return;
        }
        this.b.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
    }

    public final void a(byte by2, String string) {
        byte[] byArray = bz.a((short)4865, string, by2, bt.ad);
        if (byArray != null) {
            com.yinhan.kjava.main.a.i.a(new w(4865, byArray));
            this.b.a((String)null);
            return;
        }
        this.b.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
    }

    public final void u() {
        this.b.aq.j();
        this.b.aq.a("\u5e2e\u6d3e\u5916\u4ea4");
        this.b.aq.a(false);
        String[] stringArray = null;
        int[] nArray = null;
        if (bt.jY != null && bt.jY.length > 0) {
            stringArray = new String[bt.jY.length];
            nArray = new int[bt.jY.length];
            for (int i2 = 0; i2 < stringArray.length; ++i2) {
                stringArray[i2] = bt.d(bt.ka[i2]);
                nArray[i2] = bt.ka[i2] == 2 ? 0xC40000 : (bt.ka[i2] == 3 ? 0xFF0000 : 0xFFFF00);
            }
        }
        this.b.ar.a(null, bt.jZ, null, stringArray);
        this.b.ar.a("\u641c\u7d22...");
        this.b.ar.a(nArray);
        this.b.ar.a("\u5e2e\u6d3e\u641c\u7d22", 1);
        this.b.au.a("\u786e\u5b9a");
        this.b.au.a(true);
        this.b.aq.a(this.b.ar);
        this.b.aq.a(this.b.au);
        this.b.aq.a(t.f, t.g, t.d, t.e);
        ca.l = 0;
        this.a.l = 0;
        this.b.j = this.b.k;
        this.a.k = (short)60;
        this.a.j = (short)60;
    }

    private static String w(int n2) {
        if (n2 < 0) {
            return null;
        }
        if (bt.jY == null || bt.jY.length == 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        if (bt.kb != null) {
            stringBuffer.append("\u5bf9\u65b9\u72b6\u6001\uff1a" + (bt.kb[n2] == 0 ? "\u4fdd\u62a4" : (bt.kb[n2] == 1 ? "\u548c\u5e73" : "\u6218\u4e89")));
            stringBuffer.append('\t');
        }
        if (bt.kc != null) {
            stringBuffer.append("\u5bf9\u65b9\u6001\u5ea6\uff1a" + (bt.kc[n2] == 0 ? "\u4e2d\u7acb" : "\u654c\u5bf9"));
            stringBuffer.append('\t');
        }
        if (bt.kd != null) {
            stringBuffer.append("\u4f60\u7684\u6001\u5ea6\uff1a" + (bt.kd[n2] == 0 ? "\u4e2d\u7acb" : "\u654c\u5bf9"));
            stringBuffer.append('\t');
        }
        return stringBuffer.toString();
    }

    public final void s(int n2) {
        if (this.a.l == 0) {
            if (this.b.aq != null) {
                this.b.aq.b(n2);
            }
            if (n2 == 1 || n2 == 514 || n2 == 520 || n2 == 4) {
                boolean bl2 = this.b.ar.g() == this.b.ar.h();
                this.b.ar.a(bl2 ? "\u5e2e\u6d3e\u641c\u7d22" : aq.w(this.b.ar.g() - 1), 1);
            }
            if (n2 == 0x10000000 || n2 == 0x40000000 || n2 == 517) {
                this.a.aA = this.b.ar.h();
                this.a.aE = this.b.ar.g();
                if (this.b.ar.g() == this.b.ar.h()) {
                    this.b.a("\u8bf7\u8f93\u5165\u8981\u641c\u7d22\u7684\u5e2e\u6d3e\u540d\u79f0", 0);
                    return;
                }
                if (bt.jY != null) {
                    ca.a(t.f, t.j + 11 + this.b.ar.i() * t.j + t.g, new String[]{"\u67e5\u770b", "\u5916\u4ea4", "\u5ba3\u6218"}, true);
                    this.a.l = 1;
                    return;
                }
            } else {
                if (n2 == 0x20000000) {
                    this.a.k = 0;
                    this.a.j = 0;
                    return;
                }
                if (n2 == 1024) {
                    if (bt.gQ > 1 && bt.gR == 1) {
                        bt.gQ = bt.gQ - 1 <= 1 ? (short)1 : (short)(bt.gQ - 1);
                        this.a(this.o);
                        return;
                    }
                    if (bt.gQ > 1 && bt.gR == 0) {
                        bt.gQ = bt.gQ - 1 < 1 ? (short)1 : (short)(bt.gQ - 1);
                        this.a(this.o);
                        return;
                    }
                } else if (n2 == 2048) {
                    if (bt.gQ <= 1 && bt.gR == 1) {
                        bt.gQ = (short)(bt.gQ + 1);
                        this.a(this.o);
                        return;
                    }
                    if (bt.gQ > 1 && bt.gR == 1) {
                        bt.gQ = (short)(bt.gQ + 1);
                        this.a(this.o);
                        return;
                    }
                }
            }
        } else if (this.a.l == 1) {
            ca.b(n2);
            if (n2 == 0x10000000 || n2 == 0x40000000 || n2 == 517) {
                this.b.aw = ca.o;
                if (ca.o == 0) {
                    this.b(bt.jY[this.b.ar.g() - 1]);
                    return;
                }
                if (ca.o == 1) {
                    ca.a(0, t.j + 11 + this.b.ar.i() * t.j + t.g, new String[]{"\u4e2d\u7acb", "\u654c\u5bf9"}, true);
                    this.a.l = (short)2;
                    return;
                }
                if (ca.o == 2) {
                    ca.h = 0;
                    this.a.l = (short)3;
                    return;
                }
            } else if (n2 == 0x20000000) {
                this.a.l = 0;
                return;
            }
        } else if (this.a.l == 2) {
            ca.b(n2);
            if (n2 == 0x10000000 || n2 == 0x40000000 || n2 == 517) {
                if (ca.o == 0) {
                    this.a((byte)1, bt.jY[this.b.ar.g() - 1]);
                    return;
                }
                if (ca.o == 1) {
                    this.a((byte)2, bt.jY[this.b.ar.g() - 1]);
                    return;
                }
            } else if (n2 == 0x20000000) {
                this.a.l = 0;
                return;
            }
        } else if (this.a.l == 3) {
            if (n2 == 0x10000000 || n2 == 0x40000000 || n2 == 517) {
                this.b.a("\u8f93\u5165OK\u786e\u8ba4\u5ba3\u6218", 0);
                return;
            }
            if (n2 == 0x20000000) {
                this.a.l = 0;
            }
        }
    }

    public final void a(String object, byte by2) {
        byte[] byArray = bz.b((short)4866, (String)object, by2, bt.ad);
        object = byArray;
        if (byArray != null) {
            com.yinhan.kjava.main.a.i.a(new w(4866, (byte[])object));
            this.b.a((String)null);
            return;
        }
        this.b.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
    }

    public final void v() {
        this.a.M();
        if (this.b.b == 8 || this.b.b == 516) {
            ao.h = ao.h - 4 < 0 ? 0 : ao.h - 4;
        } else if (this.b.b == 2 || this.b.b == 518) {
            ao.h = ao.h + 4 > this.a.f.a - t.b ? this.a.f.a - t.b : ao.h + 4;
        } else if (this.b.b == 1 || this.b.b == 514) {
            ao.i = ao.i - 4 < 0 ? 0 : ao.i - 4;
        } else if (this.b.b == 4 || this.b.b == 520) {
            int n2 = ao.i = ao.i + 4 > this.a.f.b - t.c ? this.a.f.b - t.c : ao.i + 4;
        }
        if (bt.bw != 2 || bt.kj == 0) {
            aq aq2 = this;
            bt.kj = 0;
            ao.h = aq2.s;
            ao.i = aq2.t;
            aq2.a.l = 0;
            aq2.a.k = 0;
            aq2.a.j = 0;
            this.b.b = 0;
            this.b.a = 0;
        }
    }

    private void b(String object) {
        byte[] byArray = bz.o((short)4868, (String)object, bt.ad);
        object = byArray;
        if (byArray != null) {
            com.yinhan.kjava.main.a.i.a(new w(4868, (byte[])object));
            return;
        }
        this.b.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
    }

    private void C() {
        byte[] byArray = bz.l((short)4869, bt.ad, bt.gQ);
        if (byArray != null) {
            com.yinhan.kjava.main.a.i.a(new w(4869, byArray));
            this.b.a((String)null);
            return;
        }
        this.b.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
    }

    public final void w() {
        ca.h = 0;
        this.a.l = 0;
        this.b.j = this.b.k;
        this.a.k = (short)62;
        this.a.j = (short)62;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void t(int n2) {
        if (this.a.l != 0) return;
        if (n2 != 0x10000000 && n2 != 0x40000000 && n2 != 517) {
            if (n2 != 0x20000000) return;
            this.a.al = null;
            this.a.k = 0;
            this.a.j = 0;
            return;
        }
        byte[] byArray = bz.v((short)4871, bt.ad);
        if (byArray != null) {
            com.yinhan.kjava.main.a.i.a(new w(4871, byArray));
            this.b.a((String)null);
            return;
        }
        this.b.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
    }

    public final void x() {
        if (bt.kE != null) {
            this.b.aq.j();
            this.b.aq.a("\u6218\u4e89\u6377\u62a5");
            this.b.aq.a(false);
            this.b.ar.a(null, bt.kE, null, null);
            this.b.at.b(bt.kF[0], t.i, (byte)2);
            this.b.at.a((byte)1);
            this.b.au.a("\u786e\u5b9a");
            this.b.aq.a(this.b.ar);
            this.b.aq.a(this.b.at);
            this.b.aq.a(this.b.au);
            int n2 = 2 * t.j + 8;
            m m2 = this.b.aq;
            this.b.aq.e = n2;
            int cfr_ignored_0 = m2.e;
            this.b.aq.a(t.f, t.g, t.d, t.e);
            this.a.l = 0;
            this.b.j = this.b.k;
            this.a.k = (short)63;
            this.a.j = (short)63;
        }
    }

    public final void u(int n2) {
        block7: {
            block8: {
                if (this.a.l != 0 || bt.kE == null) break block7;
                if (this.b.aq != null) {
                    this.b.aq.b(n2);
                }
                if (n2 == 1 || n2 == 514 || n2 == 520 || n2 == 4) {
                    this.b.at.b(bt.kF[this.b.ar.g()], t.i, (byte)2);
                    this.b.at.a((byte)1);
                }
                if (n2 != 0x10000000 && n2 != 0x40000000 && n2 != 517) break block8;
                this.a.aA = this.b.ar.h();
                this.a.aE = this.b.ar.g();
                switch (this.a.aE) {
                    case 0: {
                        this.b.a("\u8bf7\u8f93\u5165\u8b66\u544a\u8bed\uff0830\u4e2a\u5b57\u7b26\u5185\uff09", 0);
                        break block7;
                    }
                    case 1: 
                    case 2: 
                    case 3: {
                        this.b((byte)this.b.ar.g(), null);
                    }
                    default: {
                        return;
                    }
                }
            }
            if (n2 == 0x20000000) {
                this.a.l = 0;
                this.a.k = 0;
                this.a.j = 0;
            }
        }
    }

    public final void b(byte by2, String string) {
        byte[] byArray = bz.c((short)4872, bt.ad, by2, string);
        if (byArray != null) {
            com.yinhan.kjava.main.a.i.a(new w(4872, byArray));
            return;
        }
        this.b.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
    }

    public final void y() {
        this.b.aq.b();
        this.b.aq.a("\u5e2e\u6d3e\u5347\u7ea7");
        this.b.aq.a(false);
        this.b.at.b(bt.mw == null ? "\u6682\u65e0\u5e2e\u6d3e\u5347\u7ea7\u4fe1\u606f" : bt.mw, t.i, (byte)0);
        this.b.aq.a(this.b.at);
        this.b.au.a("\u5347\u7ea7");
        this.b.aq.a(this.b.at);
        if (t.c > 220) {
            this.b.aq.a(this.b.au);
        }
        this.b.aq.a(t.f, t.g, t.d, t.e);
        this.a.l = 0;
        this.b.j = this.b.k;
        this.a.k = (short)113;
        this.a.j = (short)113;
    }

    public final void v(int n2) {
        if (this.a.l == 0) {
            if (this.b.aq != null) {
                this.b.aq.b(n2);
            }
            if (n2 == 0x10000000 || n2 == 0x40000000 || n2 == 517) {
                this.a((byte)2);
                return;
            }
            if (n2 == 0x20000000) {
                this.a(true);
            }
        }
    }

    public final void d(Graphics graphics) {
        if (this.a.l == 0 && this.b.aq != null) {
            this.b.aq.a(graphics);
        }
    }
}


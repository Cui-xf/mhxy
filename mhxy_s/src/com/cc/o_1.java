package com.cc;

import com.yinhan.kjava.main.MainCanvas;

import java.io.DataInputStream;
import java.io.IOException;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class o_1 {
    private ao_1 i;
    private MainCanvas j;
    private PngUtil k;
    public byte a = 0;
    public byte b = 0;
    public short c = 0;
    public int d = 0;
    private int[][] l;
    public static byte e = -1;
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
    private Frame0 K;
    private Frame0 L;
    private int M;
    public static byte h = 0;
    private boolean N;
    private boolean[] O;
    private String[] P;

    public o_1(ao_1 var1, MainCanvas var2, PngUtil var3) {
        int[] var10000 = new int[]{15588137, 15531505, 955345, 6893779};
        this.M = 0;
        this.N = false;
        this.O = null;
        this.P = new String[]{"物攻", "防御", "法攻", "冰抗", "火抗", "雷抗", "生命", "内力", "速度", "暴击", "连击", "反震"};
        this.i = var1;
        this.j = var2;
        this.k = var3;
    }

    public final void a(int var1, short var2, int var3) {
        this.i.l = 0;
        this.b = (byte) var1;
        this.c = (short) var2;
        this.d = var3;
        this.e();
        if (GlobalStatus.kr != null) {
            this.l = new int[GlobalStatus.kr.length][4];
        }

        this.i.a(GlobalStatus.kr);
        this.j.aq.b();
        this.j.aq.a(GlobalStatus.kp);
        this.j.aq.a(false);
        this.j.aq.a(30);
        this.j.at.a(GlobalStatus.a(this.j.l), GlobalConfig.i, (byte) 1);
        this.j.au.a("确定");
        this.j.aq.a((al) this.j.at);
        if (GlobalConfig.defaultHigh > 220) {
            this.j.aq.a((al) this.j.au);
        }

        this.j.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
        var1 = this.j.aq.a + 10 + GlobalConfig.i.stringWidth("宝石:");
        int var2_t = this.j.aq.b + 37;
        if (this.l != null) {
            for (int var10 = 0; var10 < this.l.length; ++var10) {
                int var10002 = var1 + 2 + var10 * 17;
                boolean var4 = true;
                var4 = true;
                int var6 = var10002;
                if (this.l != null && this.l.length > var10) {
                    this.l[var10][0] = var6;
                    this.l[var10][1] = var2_t;
                    this.l[var10][2] = 17;
                    this.l[var10][3] = 17;
                }
            }
        }

        this.j.touchPageCase = this.j.k;
        this.i.j = this.i.k = 64;
    }

    private void e() {
        if (this.l != null) {
            for (int var1 = 0; var1 < this.l.length; ++var1) {
                if (this.l[var1] != null) {
                    this.l[var1] = null;
                }
            }

            this.l = null;
        }

    }

    public final void a(int var1) {
        if (this.i.l == 0) {
            if (this.j.aq != null) {
                this.j.aq.b(var1);
            }

            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 != 8 && var1 != 516) {
                    if (var1 != 2 && var1 != 518) {
                        if (var1 == 536870912) {
                            e = -1;
                            this.e();
                            GlobalStatus.K();
                            if (this.c == 4) {
                                var1 = (byte) this.i.aq;
                                byte var13 = (byte) this.i.ar;
                                this.i.e(this.d);
                                this.i.aq = var1;
                                this.i.ar = var13;
                                this.i.q();
                                return;
                            }

                            if (this.c == 11) {
                                var1 = (byte) this.i.aq;
                                byte var12 = (byte) this.i.ar;
                                this.i.n(this.d);
                                this.i.aq = var1;
                                this.i.ar = var12;
                                return;
                            }

                            if (this.c == 23) {
                                this.i.I();
                                return;
                            }

                            if (this.c == 59) {
                                this.i.l((byte) this.d);
                                return;
                            }

                            if (this.c == 22) {
                                var1 = (byte) this.j.ax;
                                byte var2 = (byte) this.i.ar;
                                this.i.b((byte) this.d, true);
                                this.j.ax = var1;
                                this.i.ar = var2;
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
                            this.i.j = this.i.k = 0;
                            MainCanvas.f.a(this.i.f, ao_1.h, ao_1.i, true, false, 1009050);
                            return;
                        }
                    } else if (GlobalStatus.kr != null) {
                        this.b = this.b >= (byte) (GlobalStatus.kr.length - 1) ? 0 : ++this.b;
                        return;
                    }
                } else if (GlobalStatus.kr != null) {
                    this.b = this.b <= 0 ? (byte) (GlobalStatus.kr.length - 1) : --this.b;
                    return;
                }
            } else if (GlobalStatus.kr != null && (this.c == 4 && this.d == 0 || this.c == 5 || this.c == 13) && GlobalStatus.kr[this.b] > -1) {
                if (GlobalStatus.kr[this.b] == 0) {
                    LoadingPage.a(this.j.aq.a + 10 + GlobalConfig.i.stringWidth("宝石:") + 12 + this.b * 17, this.j.aq.b + 45, new String[]{"镶嵌", "全部挖出"}, false);
                    this.a = this.b;
                    this.i.l = 1;
                    return;
                }

                LoadingPage.a(this.j.aq.a + 10 + GlobalConfig.i.stringWidth("宝石:") + 12 + this.b * 17, this.j.aq.b + 45, new String[]{"查看", "挖出", "全部挖出"}, false);
                this.a = this.b;
                this.i.l = 2;
                return;
            }
        } else if (this.i.l == 1) {
            LoadingPage.b(var1);
            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    this.i.l = 0;
                    return;
                }
            } else {
                if (LoadingPage.o == 0) {
                    this.i.a((byte) 1, (byte[]) (new byte[]{30}));
                    return;
                }

                if (LoadingPage.o == 1) {
                    e = 1;
                    byte[] var6;
                    if ((var6 = NetPayloadBuilder.a((short) 4687, GlobalStatus.ko, (byte) 2, this.c == 13 ? GlobalStatus.jG : 0, 0, (byte) 0, "", GlobalStatus.ad)) == null) {
                        this.j.b("获取上传指令数据错误!");
                        return;
                    }

                    NetPacket var14 = new NetPacket((short) 4687, var6);
                    MainCanvas.netUtils.sendPacket(var14);
                    this.j.a((String) null);
                }
            }
        } else if (this.i.l == 2) {
            LoadingPage.b(var1);
            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    this.i.l = 0;
                }
            } else if (LoadingPage.o == 0) {
                if (this.c == 13) {
                    byte[] var7;
                    if ((var7 = NetPayloadBuilder.a((short) 4687, GlobalStatus.ko, (byte) 0, GlobalStatus.jG, 0, this.b, "", GlobalStatus.ad)) == null) {
                        this.j.b("获取上传指令数据错误!");
                        return;
                    }

                    NetPacket var15 = new NetPacket((short) 4687, var7);
                    MainCanvas.netUtils.sendPacket(var15);
                    this.j.a((String) null);
                } else {
                    byte[] var8;
                    if ((var8 = NetPayloadBuilder.g((short) 4647, GlobalStatus.ad, GlobalStatus.ko, (byte) this.b)) == null) {
                        this.j.b("获取上传指令数据错误!");
                        return;
                    }

                    NetPacket var16 = new NetPacket((short) 4647, var8);
                    MainCanvas.netUtils.sendPacket(var16);
                    this.j.a((String) null);
                }
            } else if (LoadingPage.o == 1) {
                e = 1;
                if (this.c == 13) {
                    byte[] var9;
                    if ((var9 = NetPayloadBuilder.a((short) 4687, GlobalStatus.ko, (byte) 1, GlobalStatus.jG, 0, this.b, "", GlobalStatus.ad)) == null) {
                        this.j.b("获取上传指令数据错误!");
                        return;
                    }

                    NetPacket var17 = new NetPacket((short) 4687, var9);
                    MainCanvas.netUtils.sendPacket(var17);
                    this.j.a((String) null);
                } else {
                    byte[] var10;
                    if ((var10 = NetPayloadBuilder.f((short) 4646, GlobalStatus.ad, GlobalStatus.ko, (byte) this.b)) == null) {
                        this.j.b("获取上传指令数据错误!");
                        return;
                    }

                    NetPacket var18 = new NetPacket((short) 4646, var10);
                    MainCanvas.netUtils.sendPacket(var18);
                    this.j.a((String) null);
                }
            } else if (LoadingPage.o == 2) {
                e = 1;
                byte[] var11;
                if ((var11 = NetPayloadBuilder.a((short) 4687, GlobalStatus.ko, (byte) 2, this.c == 13 ? GlobalStatus.jG : 0, 0, (byte) 0, "", GlobalStatus.ad)) == null) {
                    this.j.b("获取上传指令数据错误!");
                    return;
                }

                NetPacket var19 = new NetPacket((short) 4687, var11);
                MainCanvas.netUtils.sendPacket(var19);
                this.j.a((String) null);
            }
        }

    }

    public final void a(Graphics var1) {
        if (this.j.aq != null) {
            this.j.aq.a(30);
            this.j.aq.a(var1);
            LoadingPage.a(var1, this.j.aq.a + 5, this.j.aq.b + 32, this.j.aq.c - 11, 30, 1);
            LoadingPage.a(var1, (String) "宝石", (int) (this.j.aq.a + 10), this.j.aq.b + 35 + GlobalConfig.a(25), 20, 16776960, 0);
        }

        if (GlobalStatus.kr != null) {
            this.i.a(var1, this.j.aq.a + 10 + GlobalConfig.i.stringWidth("宝石:"), this.j.aq.b + 37, 17, 17, GlobalStatus.kr.length, 1);

            for (byte var2 = 0; var2 < GlobalStatus.kr.length; ++var2) {
                if (GlobalStatus.kr[var2] <= -1) {
                    LoadingPage.a(var1, 125269879, 207, this.j.aq.a + 10 + GlobalConfig.i.stringWidth("宝石:") + 2 + var2 * 17, this.j.aq.b + 39, 17, 17);
                }

                if (GlobalStatus.kr[var2] > 0) {
                    MainCanvas.f.a(var1, ao_1.b(GlobalStatus.kr[var2]), (int[]) null, (aj) null, 0, 0, this.j.aq.a + 10 + GlobalConfig.i.stringWidth("宝石:") + 2 + var2 * 17, this.j.aq.b + 39, 0, 0);
                }
            }

            if (this.c == 4 && this.d == 0 || this.c == 5 || this.c == 13) {
                var1.setColor(16776960);
                var1.drawRect(this.j.aq.a + 10 + GlobalConfig.i.stringWidth("宝石:") + 2 + this.b * 17, this.j.aq.b + 39, 17, 17);
            }
        }

        if (this.i.l == 1 || this.i.l == 2) {
            LoadingPage.c(var1);
        }

    }

    public final int a(int var1, int var2, int var3) {
        if (this.l != null) {
            for (int var4 = 0; var4 < this.l.length; ++var4) {
                if (var2 >= this.l[var4][0] && var2 <= this.l[var4][0] + this.l[var4][2] && var3 >= this.l[var4][1] && var3 <= this.l[var4][1] + this.l[var4][3]) {
                    if (this.b == var4) {
                        return 268435456;
                    }

                    this.b = (byte) (var4 - 1);
                    return 2;
                }
            }
        }

        return var1;
    }

    public final void a() {
        this.i.l = 0;
        this.j.aq.b();
        this.j.aq.a("装备打孔");
        this.j.ar.a((Image[]) null, GlobalStatus.kn, (String[]) null, (String[]) null);
        this.j.au.a("确定");
        if (GlobalStatus.km != null && GlobalStatus.km.length > 0) {
            this.j.at.a(GlobalStatus.i(this.j.l, this.j.ar.g()), GlobalConfig.i, (byte) 2);
        } else {
            this.j.at.a((String) null, GlobalConfig.i, (byte) 2);
        }

        this.j.at.a((byte) 1);
        this.j.aq.a((al) this.j.ar);
        this.j.aq.a((al) this.j.at);
        if (GlobalConfig.defaultHigh > 220) {
            this.j.aq.a((al) this.j.au);
        }

        this.j.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
        this.j.touchPageCase = this.j.k = 7;
        this.i.j = this.i.k = 65;
    }

    public final void b(int var1) {
        if (this.i.l == 0) {
            if (this.j.aq != null) {
                this.j.aq.b(var1);
            }

            if (var1 != 514 && var1 != 520 && var1 != 1 && var1 != 4) {
                if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                    if (var1 == 536870912) {
                        this.i.m();
                        return;
                    }
                } else if (GlobalStatus.km != null && GlobalStatus.km.length > 0) {
                    this.i.e((int) 10);
                    return;
                }
            } else if (GlobalStatus.km != null && GlobalStatus.km.length > 0) {
                this.j.at.a(GlobalStatus.i(this.j.l, this.j.ar.g()), GlobalConfig.i, (byte) 2);
                this.j.at.a((byte) 1);
                return;
            }
        } else if (this.i.l == 1) {
            LoadingPage.b(var1);
            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    this.i.l = 0;
                }
            } else if (LoadingPage.o == 0) {
                this.i.e((int) 10);
                return;
            }
        }

    }

    public final void b(Graphics var1) {
        if (this.i.l == 0 && this.j.aq != null) {
            this.j.aq.a(var1);
        }

        if (this.i.l == 1) {
            LoadingPage.c(var1);
        }

    }

    public final void b() {
        this.j.b("此界面正在维护，如有不便之处请谅解!");
    }

    public final void c(int var1) {
        if (var1 == 536870912) {
            this.i.j = this.i.k = 0;
        }

    }

    public static void a(DataInputStream var0) throws IOException {
        m = var0.readUTF();
        var0.readShort();
        n = var0.readUTF();
        o = var0.readUTF();
        p = var0.readUTF();
        q = var0.readUTF();
        r = var0.readUTF();
        s = var0.readUTF();
        t = var0.readShort();
        u = var0.readUTF();
    }

    public final void c() {
        this.j.aq.b();
        this.j.aq.a(m);
        an_1 var10000 = this.j.at;
        StringBuffer var1;
        if ((var1 = this.j.l) == null) {
            var1 = new StringBuffer();
        } else {
            GlobalConfig.clearStr(var1);
        }

        var1.append(m);
        var1.append("\t");
        if (n != null && n.length() > 0) {
            var1.append(n);
            var1.append('\t');
        }

        if (o != null && o.length() > 0) {
            var1.append(o);
            var1.append('\t');
        }

        if (p != null && p.length() > 0) {
            var1.append(p);
            var1.append('\t');
        }

        if (q != null && q.length() > 0) {
            var1.append(q);
            var1.append('\t');
        }

        if (r != null && r.length() > 0) {
            var1.append(r);
            var1.append('\t');
        }

        if (s != null && s.length() > 0) {
            var1.append(s);
            var1.append('\t');
        }

        if (t > 0) {
            var1.append("要求装备等级:");
            var1.append(t);
            var1.append('\t');
        }

        if (u != null && !u.equals("")) {
            var1.append(u);
        }

        var10000.a(var1.toString(), GlobalConfig.i, (byte) 1);
        this.j.au.a("确定");
        this.j.aq.a((al) this.j.at);
        if (GlobalConfig.defaultHigh > 220) {
            this.j.aq.a((al) this.j.au);
        }

        this.j.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
        this.j.touchPageCase = this.j.k = 7;
        this.i.j = this.i.k = 67;
    }

    public final void d(int var1) {
        if (this.j.aq != null) {
            this.j.aq.b(var1);
        }

        if (var1 == 536870912) {
            m = null;
            u = null;
            n = null;
            o = null;
            q = null;
            r = null;
            s = null;
            this.a(this.a, (short) this.c, this.d);
        }

    }

    public final void c(Graphics var1) {
        if (this.j.aq != null) {
            this.j.aq.a(var1);
        }

    }

    public final void b(DataInputStream var1) throws IOException {
        g = var1.readInt();
        v = var1.readShort();
        w = var1.readUTF();
        x = var1.readLong();
        y = var1.readUTF();
        z = var1.readShort();
        A = var1.readUTF();
        byte var2;
        if ((var2 = var1.readByte()) > 0) {
            B = new byte[var2];
            C = new int[var2];
            D = new int[var2];

            for (int var3 = 0; var3 < var2; ++var3) {
                B[var3] = var1.readByte();
                C[var3] = var1.readInt();
                D[var3] = var1.readInt();
            }
        } else {
            B = null;
            C = null;
            D = null;
        }

        E = var1.readInt();
        this.M = 0;
        var1.readUTF();
        var1.readByte();
        GlobalStatus.N();
        f(g);
        f((int) x);
        this.g();
    }

    private static void f(int var0) {
        if (GlobalStatus.bC != null && GlobalStatus.bC.size() > 0) {
            bn var1 = null;

            for (int var2 = 0; var2 < GlobalStatus.bC.size(); ++var2) {
                if ((var1 = (bn) GlobalStatus.bC.elementAt(var2)) != null && var1.a == var0) {
                    ++var1.v;
                }
            }

        }
    }

    private void f() {
        if (this.G != null) {
            for (int var1 = 0; var1 < this.G.length; ++var1) {
                if (this.G[var1] != null) {
                    this.G[var1] = null;
                }
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
        v = -1;
        w = null;
        x = -1L;
        z = -1;
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
        GlobalStatus.N();
    }

    public final void a(boolean var1) {
        if (var1) {
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
            this.K = MainCanvas.publicUI.getFrame("jianding_02");
            this.L = MainCanvas.publicUI.getFrame("jianding_01");
        }

        if (g != -1) {
            this.i.a(new short[]{v});
        }

        if (x != -1L) {
            this.i.a(new short[]{z});
        }

        this.j.aq.b();
        this.j.aq.a("装备洗炼");
        this.j.aq.a(false);
        this.J = Math.max(ao_1.x.c, GlobalConfig.j) * 7 + 16;
        this.H = ao_1.x.c + GlobalConfig.j + 8;
        this.I = GlobalConfig.realHigh - 32 - l_1.b() - (this.J + 4) - this.H;
        this.j.aq.a(this.H + this.I);
        this.j.at.a((String) null, GlobalConfig.i, (byte) 1);
        this.j.aq.a((al) this.j.at);
        this.j.at.a((byte) 1);
        this.j.au.a("确定");
        this.j.aq.a((al) this.j.au);
        this.j.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
        int var1_t = 0;
        int var2 = 0;
        if (this.G != null) {
            for (int var3 = 0; var3 < this.G.length; ++var3) {
                if (var3 == 0) {
                    var1_t = this.j.aq.a + this.j.aq.c / 4 - 8;
                    var2 = this.j.aq.b + 32 + this.H - 4 - 17;
                } else if (var3 == 1) {
                    var1_t = this.j.aq.a + this.j.aq.c / 4 * 3 - 8;
                } else if (var3 > 1) {
                    var1_t = this.j.aq.a + (this.j.aq.c - 17) / 2;
                    var2 = this.j.aq.b + 32 + this.H + this.I + 4 + 2 + (var3 - 1) * (Math.max(ao_1.x.c, GlobalConfig.j) + 1);
                }

                boolean var10001 = true;
                this.a(var3, var1_t, var2, 17, 17);
            }
        }

        this.g();
        LoadingPage.l = 0;
        this.i.l = 0;
        this.j.touchPageCase = this.j.k;
        this.i.j = this.i.k = 106;
    }

    public final void e(int var1) {
        if (this.i.l == 0) {
            if (this.j.aq != null) {
                this.j.aq.b(var1);
            }

            if (var1 != 8 && var1 != 1) {
                if (var1 != 2 && var1 != 4) {
                    if (var1 != 268435456 && var1 != 1073741824) {
                        if (var1 == 536870912) {
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
                                this.i.c((int) 2);
                            }
                        }
                    } else if (this.f == 0) {
                        if (g == -1) {
                            this.N = true;
                            this.i.a((byte) 0, (byte[]) (new byte[]{2}));
                        } else {
                            LoadingPage.a(this.G[0][0] + 8, this.G[0][1] + 8, new String[]{"洗炼", "查看", "取出"}, false);
                            this.i.l = 1;
                        }
                    } else if (this.f == 1) {
                        if (g == -1) {
                            this.j.b("请先放入洗炼装备");
                        } else if (x == -1L) {
                            this.i.a((byte) 0, (byte[]) (new byte[]{5}));
                        } else {
                            LoadingPage.a(this.G[1][0] + 8, this.G[1][1] + 8, new String[]{"取出"}, false);
                            this.i.l = 1;
                        }
                    } else if (this.O != null && this.f - 2 < this.O.length) {
                        if (!this.O[this.f - 2]) {
                            if (this.M + 1 > E) {
                                this.j.b("没有足够的洗炼锁");
                            } else {
                                this.O[this.f - 2] = true;
                                ++this.M;
                            }
                        } else {
                            this.O[this.f - 2] = false;
                            --this.M;
                        }
                    }
                } else {
                    ++this.f;
                    if (this.f >= this.G.length) {
                        this.f = 0;
                    }

                    LoadingPage.l = 0;
                    this.g();
                }
            } else {
                --this.f;
                if (this.f < 0) {
                    this.f = this.G.length - 1;
                }

                LoadingPage.l = 0;
                this.g();
            }
        } else if (this.i.l == 1) {
            LoadingPage.b(var1);
            if (var1 != 268435456 && var1 != 1073741824) {
                if (var1 == 536870912) {
                    LoadingPage.l = 0;
                    this.g();
                    this.i.l = 0;
                }
            } else if (LoadingPage.o == 0) {
                byte[] var4 = null;
                if (this.f != 0) {
                    if (this.f == 1) {
                        var4 = NetPayloadBuilder.a((short) 4688, g, x, (byte) 2, h, GlobalStatus.jG, B, GlobalStatus.ad);
                    }
                } else {
                    var4 = null;
                    if (this.O != null) {
                        var4 = new byte[this.M];
                        byte var2 = 0;

                        for (int var3 = 0; var3 < this.O.length; ++var3) {
                            if (this.O[var3]) {
                                var4[var2] = B[var3];
                                ++var2;
                            }
                        }
                    }

                    var4 = NetPayloadBuilder.a((short) 4688, g, x, (byte) 3, h, GlobalStatus.jG, var4, GlobalStatus.ad);
                }

                if (var4 != null) {
                    NetPacket var6 = new NetPacket((short) 4688, var4);
                    MainCanvas.netUtils.sendPacket(var6);
                    this.j.a((String) null);
                } else {
                    this.j.b("获取上传指令数据错误!");
                }
            } else if (LoadingPage.o == 1) {
                if (this.i.aw && !this.N) {
                    GlobalStatus.a(this.i.av);
                } else if (this.i.aJ && !this.N) {
                    GlobalStatus.b((int) ao_1.l(this.i.aq));
                } else {
                    var1 = g;
                    Object var9 = null;
                    int var11 = 0;

                    bn var10000;
                    while (true) {
                        if (var11 >= GlobalStatus.bC.size()) {
                            var10000 = null;
                            break;
                        }

                        bn var10;
                        if ((var10 = (bn) GlobalStatus.bC.elementAt(var11)) != null && var10.a == var1) {
                            var10000 = var10;
                            break;
                        }

                        ++var11;
                    }

                    bn var8 = var10000;
                    if (var10000 != null) {
                        GlobalStatus.a(var8);
                    } else {
                        this.j.b("装备不存在");
                    }
                }

                this.i.O.a(0, (short) this.i.k, -1);
            } else if (LoadingPage.o == 2) {
                this.d();
                this.a(true);
                this.g();
                this.i.l = 0;
            }
        }

        this.j.touchAction = 0;
    }

    private void a(int var1, int var2, int var3, int var4, int var5) {
        if (this.G != null && this.G.length > var1) {
            this.G[var1][0] = var2;
            this.G[var1][1] = var3;
            this.G[var1][2] = 17;
            this.G[var1][3] = 17;
        }

    }

    public final int b(int var1, int var2, int var3) {
        if (this.G != null) {
            for (int var4 = 0; var4 < this.G.length; ++var4) {
                if (var2 >= this.G[var4][0] && var2 <= this.G[var4][0] + this.G[var4][2] && var3 >= this.G[var4][1] && var3 <= this.G[var4][1] + this.G[var4][3]) {
                    if (this.f == var4) {
                        return 1073741824;
                    }

                    this.f = var4;
                    LoadingPage.l = 0;
                    this.g();
                    return var1;
                }
            }
        }

        return var1;
    }

    public final void d(Graphics var1) {
        int var2 = this.j.aq.b + 32 + this.H + this.I + 4;
        int var3 = (this.j.aq.c - 21 - 31) / 2;
        int var4;
        int var5 = (var4 = this.j.aq.a + 10) + var3 + 31;
        if (this.j.aq != null) {
            this.j.aq.a(var1);
            LoadingPage.a(var1, this.j.aq.a + 5, this.j.aq.b + 32, this.j.aq.c - 11, this.H, 1);
            LoadingPage.a(var1, this.j.aq.a + 5, this.j.aq.b + 32 + this.H + 1, this.j.aq.c - 11, this.I - 2, 1);
            LoadingPage.a(var1, var4, var2, var3, this.J - 9, 1);
            LoadingPage.a(var1, var5, var2, var3, this.J - 9, 1);
        }

        if (this.G != null) {
            for (int var6 = 0; var6 < this.G.length; ++var6) {
                PngUtil var10000;
                Graphics var10001;
                Frame0 var10002;
                if (var6 < 2) {
                    var10000 = this.k;
                    var10001 = var1;
                    var10002 = ao_1.x;
                } else {
                    if (this.O == null || var6 - 2 >= this.O.length) {
                        continue;
                    }

                    var10000 = this.k;
                    var10001 = var1;
                    var10002 = this.O[var6 - 2] ? this.K : this.L;
                }

                var10000.a(var10001, var10002, (int[]) null, (aj) null, 0, 0, this.G[var6][0], this.G[var6][1], 0, 0);
            }
        }

        var1.setColor(255);
        var1.drawString("装备孔", this.G[0][0] + 8, this.G[0][1] - 2, 33);
        if (g != -1) {
            this.k.a(var1, ao_1.b(v), (int[]) null, (aj) null, 0, 0, this.G[0][0], this.G[0][1], 0, 0);
        }

        var1.setColor(255);
        var1.drawString("洗炼符", this.G[1][0] + 8, this.G[1][1] - 2, 33);
        if (x != -1L) {
            this.k.a(var1, ao_1.b(z), (int[]) null, (aj) null, 0, 0, this.G[1][0], this.G[1][1], 0, 0);
        }

        var1.drawString("洗炼锁", this.G[0][0] + 17, this.j.aq.b + 32 + this.H + 3, 20);
        var1.drawString(this.M + " / " + E, this.G[1][0] - 5, this.j.aq.b + 32 + this.H + 3, 20);
        int var9 = var2 + 2;
        var2 = Math.max(ao_1.x.c, GlobalConfig.j);
        var1.drawString("当    前", var4 + var3 / 2, var9, 17);
        var1.drawString("最    大", var5 + var3 / 2, var9, 17);
        if (C != null) {
            for (int var7 = 0; var7 < C.length; ++var7) {
                var9 += var2 + 1;
                var1.drawString(this.P[B[var7]], var4 + 4, var9, 20);
                var1.drawString("+" + C[var7], var4 + var3 - 4, var9, 24);
                var1.drawString(this.P[B[var7]], var5 + 4, var9, 20);
                var1.drawString("+" + D[var7], var5 + var3 - 4, var9, 24);
            }
        }

        LoadingPage.d(var1, this.G[this.f][0], this.G[this.f][1], 17, 17);
        if (this.i.l == 0) {
            if (this.F != null || this.F != "") {
                if (this.f == 1) {
                    LoadingPage.b(var1, this.F, this.G[1][0] + 8, this.G[1][1] + 8, GlobalConfig.defaultHigh - 5, 1);
                    return;
                }

                if (this.f == 0) {
                    LoadingPage.b(var1, this.F, this.G[0][0] + 8, this.G[0][1] + 8, GlobalConfig.defaultHigh - 5, 1);
                    return;
                }
            }
        } else if (this.i.l == 1) {
            LoadingPage.c(var1);
        }

    }
}

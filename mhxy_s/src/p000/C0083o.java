package p000;

import com.yinhan.kjava.main.RunnableC0066a;
import java.io.DataInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* renamed from: o */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-4234804660425969496/classes.dex */
public final class C0083o {

    /* renamed from: A */
    private static String f2376A;

    /* renamed from: B */
    private static byte[] f2377B;

    /* renamed from: C */
    private static int[] f2378C;

    /* renamed from: D */
    private static int[] f2379D;

    /* renamed from: E */
    private static int f2380E;

    /* renamed from: g */
    public static int f2382g;

    /* renamed from: m */
    private static String f2384m;

    /* renamed from: n */
    private static String f2385n;

    /* renamed from: o */
    private static String f2386o;

    /* renamed from: p */
    private static String f2387p;

    /* renamed from: q */
    private static String f2388q;

    /* renamed from: r */
    private static String f2389r;

    /* renamed from: s */
    private static String f2390s;

    /* renamed from: t */
    private static short f2391t;

    /* renamed from: u */
    private static String f2392u;

    /* renamed from: v */
    private static short f2393v;

    /* renamed from: w */
    private static String f2394w;

    /* renamed from: x */
    private static long f2395x;

    /* renamed from: y */
    private static String f2396y;

    /* renamed from: z */
    private static short f2397z;

    /* renamed from: F */
    private String f2398F;

    /* renamed from: G */
    private int[][] f2399G;

    /* renamed from: H */
    private int f2400H;

    /* renamed from: I */
    private int f2401I;

    /* renamed from: J */
    private int f2402J;

    /* renamed from: K */
    private C0033bf f2403K;

    /* renamed from: L */
    private C0033bf f2404L;

    /* renamed from: f */
    public int f2413f;

    /* renamed from: i */
    private C0015ao f2414i;

    /* renamed from: j */
    private RunnableC0066a f2415j;

    /* renamed from: k */
    private C0009ai f2416k;

    /* renamed from: l */
    private int[][] f2417l;

    /* renamed from: e */
    public static byte f2381e = -1;

    /* renamed from: h */
    public static byte f2383h = 0;

    /* renamed from: a */
    public byte f2409a = 0;

    /* renamed from: b */
    public byte f2410b = 0;

    /* renamed from: c */
    public short f2411c = 0;

    /* renamed from: d */
    public int f2412d = 0;

    /* renamed from: M */
    private int f2405M = 0;

    /* renamed from: N */
    private boolean f2406N = false;

    /* renamed from: O */
    private boolean[] f2407O = null;

    /* renamed from: P */
    private String[] f2408P = {"物攻", "防御", "法攻", "冰抗", "火抗", "雷抗", "生命", "内力", "速度", "暴击", "连击", "反震"};

    public C0083o(C0015ao c0015ao, RunnableC0066a runnableC0066a, C0009ai c0009ai) {
        int[] iArr = {15588137, 15531505, 955345, 6893779};
        this.f2414i = c0015ao;
        this.f2415j = runnableC0066a;
        this.f2416k = c0009ai;
    }

    /* renamed from: a */
    private void m1611a(int i, int i2, int i3, int i4, int i5) {
        if (this.f2399G == null || this.f2399G.length <= i) {
            return;
        }
        this.f2399G[i][0] = i2;
        this.f2399G[i][1] = i3;
        this.f2399G[i][2] = 17;
        this.f2399G[i][3] = 17;
    }

    /* renamed from: a */
    public static void m1612a(DataInputStream dataInputStream) throws IOException {
        f2384m = dataInputStream.readUTF();
        dataInputStream.readShort();
        f2385n = dataInputStream.readUTF();
        f2386o = dataInputStream.readUTF();
        f2387p = dataInputStream.readUTF();
        f2388q = dataInputStream.readUTF();
        f2389r = dataInputStream.readUTF();
        f2390s = dataInputStream.readUTF();
        f2391t = dataInputStream.readShort();
        f2392u = dataInputStream.readUTF();
    }

    /* renamed from: e */
    private void m1613e() {
        if (this.f2417l != null) {
            for (int i = 0; i < this.f2417l.length; i++) {
                if (this.f2417l[i] != null) {
                    this.f2417l[i] = null;
                }
            }
            this.f2417l = null;
        }
    }

    /* renamed from: f */
    private void m1614f() {
        if (this.f2399G != null) {
            for (int i = 0; i < this.f2399G.length; i++) {
                if (this.f2399G[i] != null) {
                    this.f2399G[i] = null;
                }
            }
            this.f2399G = null;
        }
    }

    /* renamed from: f */
    private static void m1615f(int i) {
        if (C0047bt.f891bC == null || C0047bt.f891bC.size() <= 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= C0047bt.f891bC.size()) {
                return;
            }
            C0041bn c0041bn = (C0041bn) C0047bt.f891bC.elementAt(i3);
            if (c0041bn != null && c0041bn.f714a == i) {
                c0041bn.f735v = (byte) (c0041bn.f735v + 1);
            }
            i2 = i3 + 1;
        }
    }

    /* renamed from: g */
    private void m1616g() {
        this.f2398F = null;
        if (this.f2413f == 0) {
            if (f2394w != null) {
                this.f2398F = f2394w;
            }
        } else {
            if (this.f2413f != 1 || f2376A == null) {
                return;
            }
            this.f2398F = f2396y;
        }
    }

    /* renamed from: a */
    public final int m1617a(int i, int i2, int i3) {
        if (this.f2417l == null) {
            return i;
        }
        for (int i4 = 0; i4 < this.f2417l.length; i4++) {
            if (i2 >= this.f2417l[i4][0] && i2 <= this.f2417l[i4][0] + this.f2417l[i4][2] && i3 >= this.f2417l[i4][1] && i3 <= this.f2417l[i4][1] + this.f2417l[i4][3]) {
                if (this.f2410b == i4) {
                    return 268435456;
                }
                this.f2410b = (byte) (i4 - 1);
                return 2;
            }
        }
        return i;
    }

    /* renamed from: a */
    public final void m1618a() {
        this.f2414i.f359l = (short) 0;
        this.f2415j.f2149aq.m1604b();
        this.f2415j.f2149aq.m1601a("装备打孔");
        this.f2415j.f2150ar.m1266a((Image[]) null, C0047bt.f1405kn, (String[]) null, (String[]) null);
        this.f2415j.f2153au.m1590a("确定");
        if (C0047bt.f1404km == null || C0047bt.f1404km.length <= 0) {
            this.f2415j.f2152at.m77a((String) null, C0088t.f2523i, (byte) 2);
        } else {
            this.f2415j.f2152at.m77a(C0047bt.m918i(this.f2415j.f2218l, this.f2415j.f2150ar.m1275g()), C0088t.f2523i, (byte) 2);
        }
        this.f2415j.f2152at.m75a((byte) 1);
        this.f2415j.f2149aq.m1600a(this.f2415j.f2150ar);
        this.f2415j.f2149aq.m1600a(this.f2415j.f2152at);
        if (C0088t.f2517c > 220) {
            this.f2415j.f2149aq.m1600a(this.f2415j.f2153au);
        }
        this.f2415j.f2149aq.m1598a(C0088t.f2520f, C0088t.f2521g, C0088t.f2518d, C0088t.f2519e);
        RunnableC0066a runnableC0066a = this.f2415j;
        this.f2415j.f2217k = (short) 7;
        runnableC0066a.f2216j = (short) 7;
        C0015ao c0015ao = this.f2414i;
        this.f2414i.f358k = (short) 65;
        c0015ao.f357j = (short) 65;
    }

    /* renamed from: a */
    public final void m1619a(int i) throws IOException {
        byte length;
        byte b = 0;
        if (this.f2414i.f359l != 0) {
            if (this.f2414i.f359l == 1) {
                C0055ca.m1317b(i);
                if (i != 268435456 && i != 1073741824 && i != 517) {
                    if (i == 536870912) {
                        this.f2414i.f359l = (short) 0;
                        return;
                    }
                    return;
                } else {
                    if (C0055ca.f1895o == 0) {
                        this.f2414i.m377a((byte) 1, new byte[]{30});
                        return;
                    }
                    if (C0055ca.f1895o == 1) {
                        f2381e = (byte) 1;
                        byte[] bArrM1048a = C0053bz.m1048a((short) 4687, C0047bt.f1406ko, (byte) 2, this.f2411c == 13 ? C0047bt.f1319jG : 0, 0, (byte) 0, "", C0047bt.f865ad);
                        if (bArrM1048a == null) {
                            this.f2415j.m1442b("获取上传指令数据错误!");
                            return;
                        } else {
                            RunnableC0066a.f2115i.m600a(new C0091w((short) 4687, bArrM1048a));
                            this.f2415j.m1434a((String) null);
                            return;
                        }
                    }
                    return;
                }
            }
            if (this.f2414i.f359l == 2) {
                C0055ca.m1317b(i);
                if (i != 268435456 && i != 1073741824 && i != 517) {
                    if (i == 536870912) {
                        this.f2414i.f359l = (short) 0;
                        return;
                    }
                    return;
                }
                if (C0055ca.f1895o == 0) {
                    if (this.f2411c == 13) {
                        byte[] bArrM1048a2 = C0053bz.m1048a((short) 4687, C0047bt.f1406ko, (byte) 0, C0047bt.f1319jG, 0, this.f2410b, "", C0047bt.f865ad);
                        if (bArrM1048a2 == null) {
                            this.f2415j.m1442b("获取上传指令数据错误!");
                            return;
                        } else {
                            RunnableC0066a.f2115i.m600a(new C0091w((short) 4687, bArrM1048a2));
                            this.f2415j.m1434a((String) null);
                            return;
                        }
                    }
                    byte[] bArrM1178g = C0053bz.m1178g((short) 4647, C0047bt.f865ad, C0047bt.f1406ko, this.f2410b);
                    if (bArrM1178g == null) {
                        this.f2415j.m1442b("获取上传指令数据错误!");
                        return;
                    } else {
                        RunnableC0066a.f2115i.m600a(new C0091w((short) 4647, bArrM1178g));
                        this.f2415j.m1434a((String) null);
                        return;
                    }
                }
                if (C0055ca.f1895o != 1) {
                    if (C0055ca.f1895o == 2) {
                        f2381e = (byte) 1;
                        byte[] bArrM1048a3 = C0053bz.m1048a((short) 4687, C0047bt.f1406ko, (byte) 2, this.f2411c == 13 ? C0047bt.f1319jG : 0, 0, (byte) 0, "", C0047bt.f865ad);
                        if (bArrM1048a3 == null) {
                            this.f2415j.m1442b("获取上传指令数据错误!");
                            return;
                        } else {
                            RunnableC0066a.f2115i.m600a(new C0091w((short) 4687, bArrM1048a3));
                            this.f2415j.m1434a((String) null);
                            return;
                        }
                    }
                    return;
                }
                f2381e = (byte) 1;
                if (this.f2411c == 13) {
                    byte[] bArrM1048a4 = C0053bz.m1048a((short) 4687, C0047bt.f1406ko, (byte) 1, C0047bt.f1319jG, 0, this.f2410b, "", C0047bt.f865ad);
                    if (bArrM1048a4 == null) {
                        this.f2415j.m1442b("获取上传指令数据错误!");
                        return;
                    } else {
                        RunnableC0066a.f2115i.m600a(new C0091w((short) 4687, bArrM1048a4));
                        this.f2415j.m1434a((String) null);
                        return;
                    }
                }
                byte[] bArrM1171f = C0053bz.m1171f((short) 4646, C0047bt.f865ad, C0047bt.f1406ko, this.f2410b);
                if (bArrM1171f == null) {
                    this.f2415j.m1442b("获取上传指令数据错误!");
                    return;
                } else {
                    RunnableC0066a.f2115i.m600a(new C0091w((short) 4646, bArrM1171f));
                    this.f2415j.m1434a((String) null);
                    return;
                }
            }
            return;
        }
        if (this.f2415j.f2149aq != null) {
            this.f2415j.f2149aq.mo70b(i);
        }
        if (i == 268435456 || i == 1073741824 || i == 517) {
            if (C0047bt.f1409kr != null) {
                if (!((this.f2411c == 4 && this.f2412d == 0) || this.f2411c == 5 || this.f2411c == 13) || C0047bt.f1409kr[this.f2410b] <= -1) {
                    return;
                }
                if (C0047bt.f1409kr[this.f2410b] == 0) {
                    C0055ca.m1285a(this.f2415j.f2149aq.f2328a + 10 + C0088t.f2523i.stringWidth("宝石:") + 12 + (this.f2410b * 17), this.f2415j.f2149aq.f2329b + 45, new String[]{"镶嵌", "全部挖出"}, false);
                    this.f2409a = this.f2410b;
                    this.f2414i.f359l = (short) 1;
                    return;
                } else {
                    C0055ca.m1285a(this.f2415j.f2149aq.f2328a + 10 + C0088t.f2523i.stringWidth("宝石:") + 12 + (this.f2410b * 17), this.f2415j.f2149aq.f2329b + 45, new String[]{"查看", "挖出", "全部挖出"}, false);
                    this.f2409a = this.f2410b;
                    this.f2414i.f359l = (short) 2;
                    return;
                }
            }
            return;
        }
        if (i == 8 || i == 516) {
            if (C0047bt.f1409kr != null) {
                if (this.f2410b <= 0) {
                    length = (byte) (C0047bt.f1409kr.length - 1);
                } else {
                    length = (byte) (this.f2410b - 1);
                    this.f2410b = length;
                }
                this.f2410b = length;
                return;
            }
            return;
        }
        if (i == 2 || i == 518) {
            if (C0047bt.f1409kr != null) {
                if (this.f2410b < ((byte) (C0047bt.f1409kr.length - 1))) {
                    b = (byte) (this.f2410b + 1);
                    this.f2410b = b;
                }
                this.f2410b = b;
                return;
            }
            return;
        }
        if (i == 536870912) {
            f2381e = (byte) -1;
            m1613e();
            C0047bt.m778K();
            if (this.f2411c == 4) {
                byte b2 = (byte) this.f2414i.f230aq;
                byte b3 = (byte) this.f2414i.f231ar;
                this.f2414i.m447e(this.f2412d);
                this.f2414i.f230aq = b2;
                this.f2414i.f231ar = b3;
                this.f2414i.m481q();
                return;
            }
            if (this.f2411c == 11) {
                byte b4 = (byte) this.f2414i.f230aq;
                byte b5 = (byte) this.f2414i.f231ar;
                this.f2414i.m476n(this.f2412d);
                this.f2414i.f230aq = b4;
                this.f2414i.f231ar = b5;
                return;
            }
            if (this.f2411c == 23) {
                this.f2414i.m356I();
                return;
            }
            if (this.f2411c == 59) {
                this.f2414i.m472l((byte) this.f2412d);
                return;
            }
            if (this.f2411c == 22) {
                byte b6 = (byte) this.f2415j.f2156ax;
                byte b7 = (byte) this.f2414i.f231ar;
                this.f2414i.m420b((byte) this.f2412d, true);
                this.f2415j.f2156ax = b6;
                this.f2414i.f231ar = b7;
                return;
            }
            if (this.f2411c == 102) {
                this.f2414i.f192V.m1360a(false);
                return;
            }
            if (this.f2411c == 106) {
                this.f2414i.f185O.m1622a(false);
                return;
            }
            if (this.f2411c == 115) {
                this.f2414i.f183M.m546o();
                return;
            }
            if (this.f2411c == 110) {
                this.f2414i.f186P.m1672a(true);
                return;
            }
            if (this.f2411c == 118) {
                this.f2414i.f187Q.m1583a(true);
                return;
            }
            if (this.f2411c == 5) {
                this.f2414i.m486t();
                return;
            }
            if (this.f2411c == 13) {
                this.f2414i.m434c(false);
                return;
            }
            this.f2414i.f359l = (short) 0;
            C0015ao c0015ao = this.f2414i;
            this.f2414i.f358k = (short) 0;
            c0015ao.f357j = (short) 0;
            RunnableC0066a.f2114f.m57a(this.f2414i.f355f, C0015ao.f167h, C0015ao.f168i, true, false, 1009050);
        }
    }

    /* renamed from: a */
    public final void m1620a(int i, short s, int i2) {
        this.f2414i.f359l = (short) 0;
        this.f2410b = (byte) i;
        this.f2411c = s;
        this.f2412d = i2;
        m1613e();
        if (C0047bt.f1409kr != null) {
            this.f2417l = new int[C0047bt.f1409kr.length][4];
        }
        this.f2414i.m401a(C0047bt.f1409kr);
        this.f2415j.f2149aq.m1604b();
        this.f2415j.f2149aq.m1601a(C0047bt.f1407kp);
        this.f2415j.f2149aq.m1603a(false);
        this.f2415j.f2149aq.m1597a(30);
        this.f2415j.f2152at.m77a(C0047bt.m810a(this.f2415j.f2218l), C0088t.f2523i, (byte) 1);
        this.f2415j.f2153au.m1590a("确定");
        this.f2415j.f2149aq.m1600a(this.f2415j.f2152at);
        if (C0088t.f2517c > 220) {
            this.f2415j.f2149aq.m1600a(this.f2415j.f2153au);
        }
        this.f2415j.f2149aq.m1598a(C0088t.f2520f, C0088t.f2521g, C0088t.f2518d, C0088t.f2519e);
        int iStringWidth = C0088t.f2523i.stringWidth("宝石:") + this.f2415j.f2149aq.f2328a + 10;
        int i3 = this.f2415j.f2149aq.f2329b + 37;
        if (this.f2417l != null) {
            for (int i4 = 0; i4 < this.f2417l.length; i4++) {
                int i5 = iStringWidth + 2 + (i4 * 17);
                if (this.f2417l != null && this.f2417l.length > i4) {
                    this.f2417l[i4][0] = i5;
                    this.f2417l[i4][1] = i3;
                    this.f2417l[i4][2] = 17;
                    this.f2417l[i4][3] = 17;
                }
            }
        }
        this.f2415j.f2216j = this.f2415j.f2217k;
        C0015ao c0015ao = this.f2414i;
        this.f2414i.f358k = (short) 64;
        c0015ao.f357j = (short) 64;
    }

    /* renamed from: a */
    public final void m1621a(Graphics graphics) {
        if (this.f2415j.f2149aq != null) {
            this.f2415j.f2149aq.m1597a(30);
            this.f2415j.f2149aq.m1602a(graphics);
            C0055ca.m1292a(graphics, this.f2415j.f2149aq.f2328a + 5, this.f2415j.f2149aq.f2329b + 32, this.f2415j.f2149aq.f2330c - 11, 30, 1);
            C0055ca.m1298a(graphics, "宝石", this.f2415j.f2149aq.f2328a + 10, C0088t.m1674a(25) + this.f2415j.f2149aq.f2329b + 35, 20, 16776960, 0);
        }
        if (C0047bt.f1409kr != null) {
            this.f2414i.m391a(graphics, C0088t.f2523i.stringWidth("宝石:") + this.f2415j.f2149aq.f2328a + 10, this.f2415j.f2149aq.f2329b + 37, 17, 17, C0047bt.f1409kr.length, 1);
            byte b = 0;
            while (true) {
                byte b2 = b;
                if (b2 >= C0047bt.f1409kr.length) {
                    break;
                }
                if (C0047bt.f1409kr[b2] <= -1) {
                    C0055ca.m1293a(graphics, 125269879, 207, (b2 * 17) + this.f2415j.f2149aq.f2328a + 10 + C0088t.f2523i.stringWidth("宝石:") + 2, this.f2415j.f2149aq.f2329b + 39, 17, 17);
                }
                if (C0047bt.f1409kr[b2] > 0) {
                    RunnableC0066a.f2114f.m64a(graphics, C0015ao.m264b(C0047bt.f1409kr[b2]), (int[]) null, (C0010aj) null, 0, 0, (b2 * 17) + this.f2415j.f2149aq.f2328a + 10 + C0088t.f2523i.stringWidth("宝石:") + 2, this.f2415j.f2149aq.f2329b + 39, 0, 0);
                }
                b = (byte) (b2 + 1);
            }
            if ((this.f2411c == 4 && this.f2412d == 0) || this.f2411c == 5 || this.f2411c == 13) {
                graphics.setColor(16776960);
                graphics.drawRect(this.f2415j.f2149aq.f2328a + 10 + C0088t.f2523i.stringWidth("宝石:") + 2 + (this.f2410b * 17), this.f2415j.f2149aq.f2329b + 39, 17, 17);
            }
        }
        if (this.f2414i.f359l == 1 || this.f2414i.f359l == 2) {
            C0055ca.m1324c(graphics);
        }
    }

    /* renamed from: a */
    public final void m1622a(boolean z) {
        if (z) {
            this.f2413f = 0;
            this.f2405M = 0;
        }
        m1614f();
        if (f2377B != null) {
            this.f2407O = new boolean[f2377B.length];
            this.f2399G = new int[f2377B.length + 2][4];// () Array.newInstance((Class<?>) Integer.TYPE, f2377B.length + 2, 4);
        } else {
            this.f2399G = new int[2][4];
        }
        if (this.f2403K == null) {
            this.f2403K = RunnableC0066a.f2101ag.m985a("jianding_02");
            this.f2404L = RunnableC0066a.f2101ag.m985a("jianding_01");
        }
        if (f2382g != -1) {
            this.f2414i.m401a(new short[]{f2393v});
        }
        if (f2395x != -1) {
            this.f2414i.m401a(new short[]{f2397z});
        }
        this.f2415j.f2149aq.m1604b();
        this.f2415j.f2149aq.m1601a("装备洗炼");
        this.f2415j.f2149aq.m1603a(false);
        this.f2402J = (Math.max((int) C0015ao.f178x.f600c, C0088t.f2524j) * 7) + 16;
        this.f2400H = C0015ao.f178x.f600c + C0088t.f2524j + 8;
        this.f2401I = (((C0088t.f2519e - 32) - C0080l.m1585b()) - (this.f2402J + 4)) - this.f2400H;
        this.f2415j.f2149aq.m1597a(this.f2400H + this.f2401I);
        this.f2415j.f2152at.m77a((String) null, C0088t.f2523i, (byte) 1);
        this.f2415j.f2149aq.m1600a(this.f2415j.f2152at);
        this.f2415j.f2152at.m75a((byte) 1);
        this.f2415j.f2153au.m1590a("确定");
        this.f2415j.f2149aq.m1600a(this.f2415j.f2153au);
        this.f2415j.f2149aq.m1598a(C0088t.f2520f, C0088t.f2521g, C0088t.f2518d, C0088t.f2519e);
        if (this.f2399G != null) {
            int iMax = 0;
            int i = 0;
            for (int i2 = 0; i2 < this.f2399G.length; i2++) {
                if (i2 == 0) {
                    i = (this.f2415j.f2149aq.f2328a + (this.f2415j.f2149aq.f2330c / 4)) - 8;
                    iMax = (((this.f2415j.f2149aq.f2329b + 32) + this.f2400H) - 4) - 17;
                } else if (i2 == 1) {
                    i = (this.f2415j.f2149aq.f2328a + ((this.f2415j.f2149aq.f2330c / 4) * 3)) - 8;
                } else if (i2 > 1) {
                    i = ((this.f2415j.f2149aq.f2330c - 17) / 2) + this.f2415j.f2149aq.f2328a;
                    iMax = ((i2 - 1) * (Math.max((int) C0015ao.f178x.f600c, C0088t.f2524j) + 1)) + this.f2415j.f2149aq.f2329b + 32 + this.f2400H + this.f2401I + 4 + 2;
                }
                m1611a(i2, i, iMax, 17, 17);
            }
        }
        m1616g();
        C0055ca.f1892l = 0;
        this.f2414i.f359l = (short) 0;
        this.f2415j.f2216j = this.f2415j.f2217k;
        C0015ao c0015ao = this.f2414i;
        this.f2414i.f358k = (short) 106;
        c0015ao.f357j = (short) 106;
    }

    /* renamed from: b */
    public final int m1623b(int i, int i2, int i3) {
        if (this.f2399G == null) {
            return i;
        }
        for (int i4 = 0; i4 < this.f2399G.length; i4++) {
            if (i2 >= this.f2399G[i4][0] && i2 <= this.f2399G[i4][0] + this.f2399G[i4][2] && i3 >= this.f2399G[i4][1] && i3 <= this.f2399G[i4][1] + this.f2399G[i4][3]) {
                if (this.f2413f == i4) {
                    return 1073741824;
                }
                this.f2413f = i4;
                C0055ca.f1892l = 0;
                m1616g();
                return i;
            }
        }
        return i;
    }

    /* renamed from: b */
    public final void m1624b() {
        this.f2415j.m1442b("此界面正在维护，如有不便之处请谅解!");
    }

    /* renamed from: b */
    public final void m1625b(int i) {
        if (this.f2414i.f359l != 0) {
            if (this.f2414i.f359l == 1) {
                C0055ca.m1317b(i);
                if (i == 268435456 || i == 1073741824 || i == 517) {
                    if (C0055ca.f1895o == 0) {
                        this.f2414i.m447e(10);
                        return;
                    }
                    return;
                } else {
                    if (i == 536870912) {
                        this.f2414i.f359l = (short) 0;
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (this.f2415j.f2149aq != null) {
            this.f2415j.f2149aq.mo70b(i);
        }
        if (i == 514 || i == 520 || i == 1 || i == 4) {
            if (C0047bt.f1404km == null || C0047bt.f1404km.length <= 0) {
                return;
            }
            this.f2415j.f2152at.m77a(C0047bt.m918i(this.f2415j.f2218l, this.f2415j.f2150ar.m1275g()), C0088t.f2523i, (byte) 2);
            this.f2415j.f2152at.m75a((byte) 1);
            return;
        }
        if (i != 268435456 && i != 1073741824 && i != 517) {
            if (i == 536870912) {
                this.f2414i.m473m();
            }
        } else {
            if (C0047bt.f1404km == null || C0047bt.f1404km.length <= 0) {
                return;
            }
            this.f2414i.m447e(10);
        }
    }

    /* renamed from: b */
    public final void m1626b(DataInputStream dataInputStream) throws IOException {
        f2382g = dataInputStream.readInt();
        f2393v = dataInputStream.readShort();
        f2394w = dataInputStream.readUTF();
        f2395x = dataInputStream.readLong();
        f2396y = dataInputStream.readUTF();
        f2397z = dataInputStream.readShort();
        f2376A = dataInputStream.readUTF();
        int i = dataInputStream.readByte();
        if (i > 0) {
            f2377B = new byte[i];
            f2378C = new int[i];
            f2379D = new int[i];
            for (int i2 = 0; i2 < i; i2++) {
                f2377B[i2] = dataInputStream.readByte();
                f2378C[i2] = dataInputStream.readInt();
                f2379D[i2] = dataInputStream.readInt();
            }
        } else {
            f2377B = null;
            f2378C = null;
            f2379D = null;
        }
        f2380E = dataInputStream.readInt();
        this.f2405M = 0;
        dataInputStream.readUTF();
        dataInputStream.readByte();
        C0047bt.m784N();
        m1615f(f2382g);
        m1615f((int) f2395x);
        m1616g();
    }

    /* renamed from: b */
    public final void m1627b(Graphics graphics) {
        if (this.f2414i.f359l == 0 && this.f2415j.f2149aq != null) {
            this.f2415j.f2149aq.m1602a(graphics);
        }
        if (this.f2414i.f359l == 1) {
            C0055ca.m1324c(graphics);
        }
    }

    /* renamed from: c */
    public final void m1628c() {
        this.f2415j.f2149aq.m1604b();
        this.f2415j.f2149aq.m1601a(f2384m);
        C0014an c0014an = this.f2415j.f2152at;
        StringBuffer stringBuffer = this.f2415j.f2218l;
        if (stringBuffer == null) {
            stringBuffer = new StringBuffer();
        } else {
            C0088t.m1680a(stringBuffer);
        }
        stringBuffer.append(f2384m);
        stringBuffer.append("\t");
        if (f2385n != null && f2385n.length() > 0) {
            stringBuffer.append(f2385n);
            stringBuffer.append('\t');
        }
        if (f2386o != null && f2386o.length() > 0) {
            stringBuffer.append(f2386o);
            stringBuffer.append('\t');
        }
        if (f2387p != null && f2387p.length() > 0) {
            stringBuffer.append(f2387p);
            stringBuffer.append('\t');
        }
        if (f2388q != null && f2388q.length() > 0) {
            stringBuffer.append(f2388q);
            stringBuffer.append('\t');
        }
        if (f2389r != null && f2389r.length() > 0) {
            stringBuffer.append(f2389r);
            stringBuffer.append('\t');
        }
        if (f2390s != null && f2390s.length() > 0) {
            stringBuffer.append(f2390s);
            stringBuffer.append('\t');
        }
        if (f2391t > 0) {
            stringBuffer.append("要求装备等级:");
            stringBuffer.append((int) f2391t);
            stringBuffer.append('\t');
        }
        if (f2392u != null && !f2392u.equals("")) {
            stringBuffer.append(f2392u);
        }
        c0014an.m77a(stringBuffer.toString(), C0088t.f2523i, (byte) 1);
        this.f2415j.f2153au.m1590a("确定");
        this.f2415j.f2149aq.m1600a(this.f2415j.f2152at);
        if (C0088t.f2517c > 220) {
            this.f2415j.f2149aq.m1600a(this.f2415j.f2153au);
        }
        this.f2415j.f2149aq.m1598a(C0088t.f2520f, C0088t.f2521g, C0088t.f2518d, C0088t.f2519e);
        RunnableC0066a runnableC0066a = this.f2415j;
        this.f2415j.f2217k = (short) 7;
        runnableC0066a.f2216j = (short) 7;
        C0015ao c0015ao = this.f2414i;
        this.f2414i.f358k = (short) 67;
        c0015ao.f357j = (short) 67;
    }

    /* renamed from: c */
    public final void m1629c(int i) {
        if (i == 536870912) {
            C0015ao c0015ao = this.f2414i;
            this.f2414i.f358k = (short) 0;
            c0015ao.f357j = (short) 0;
        }
    }

    /* renamed from: c */
    public final void m1630c(Graphics graphics) {
        if (this.f2415j.f2149aq != null) {
            this.f2415j.f2149aq.m1602a(graphics);
        }
    }

    /* renamed from: d */
    public final void m1631d() {
        f2382g = -1;
        f2393v = (short) -1;
        f2394w = null;
        f2395x = -1L;
        f2397z = (short) -1;
        f2396y = null;
        f2376A = null;
        f2377B = null;
        f2378C = null;
        f2379D = null;
        this.f2405M = 0;
        f2380E = 0;
        this.f2407O = null;
        f2383h = (byte) 0;
        this.f2406N = false;
        C0047bt.m784N();
    }

    /* renamed from: d */
    public final void m1632d(int i) {
        if (this.f2415j.f2149aq != null) {
            this.f2415j.f2149aq.mo70b(i);
        }
        if (i == 536870912) {
            f2384m = null;
            f2392u = null;
            f2385n = null;
            f2386o = null;
            f2388q = null;
            f2389r = null;
            f2390s = null;
            m1620a((int) this.f2409a, this.f2411c, this.f2412d);
        }
    }

    /* renamed from: d */
    public final void m1633d(Graphics graphics) {
        C0009ai c0009ai;
        C0033bf c0033bf;
        Graphics graphics2;
        int i = this.f2415j.f2149aq.f2329b + 32 + this.f2400H + this.f2401I + 4;
        int i2 = ((this.f2415j.f2149aq.f2330c - 21) - 31) / 2;
        int i3 = this.f2415j.f2149aq.f2328a + 10;
        int i4 = i3 + i2 + 31;
        if (this.f2415j.f2149aq != null) {
            this.f2415j.f2149aq.m1602a(graphics);
            C0055ca.m1292a(graphics, this.f2415j.f2149aq.f2328a + 5, this.f2415j.f2149aq.f2329b + 32, this.f2415j.f2149aq.f2330c - 11, this.f2400H, 1);
            C0055ca.m1292a(graphics, this.f2415j.f2149aq.f2328a + 5, this.f2415j.f2149aq.f2329b + 32 + this.f2400H + 1, this.f2415j.f2149aq.f2330c - 11, this.f2401I - 2, 1);
            C0055ca.m1292a(graphics, i3, i, i2, this.f2402J - 9, 1);
            C0055ca.m1292a(graphics, i4, i, i2, this.f2402J - 9, 1);
        }
        if (this.f2399G != null) {
            int i5 = 0;
            while (true) {
                int i6 = i5;
                if (i6 >= this.f2399G.length) {
                    break;
                }
                if (i6 < 2) {
                    c0009ai = this.f2416k;
                    c0033bf = C0015ao.f178x;
                    graphics2 = graphics;
                } else if (this.f2407O == null || i6 - 2 >= this.f2407O.length) {
                    i5 = i6 + 1;
                } else {
                    c0009ai = this.f2416k;
                    if (this.f2407O[i6 - 2]) {
                        c0033bf = this.f2403K;
                        graphics2 = graphics;
                    } else {
                        c0033bf = this.f2404L;
                        graphics2 = graphics;
                    }
                }
                c0009ai.m64a(graphics2, c0033bf, (int[]) null, (C0010aj) null, 0, 0, this.f2399G[i6][0], this.f2399G[i6][1], 0, 0);
                i5 = i6 + 1;
            }
        }
        graphics.setColor(255);
        graphics.drawString("装备孔", this.f2399G[0][0] + 8, this.f2399G[0][1] - 2, 33);
        if (f2382g != -1) {
            this.f2416k.m64a(graphics, C0015ao.m264b(f2393v), (int[]) null, (C0010aj) null, 0, 0, this.f2399G[0][0], this.f2399G[0][1], 0, 0);
        }
        graphics.setColor(255);
        graphics.drawString("洗炼符", this.f2399G[1][0] + 8, this.f2399G[1][1] - 2, 33);
        if (f2395x != -1) {
            this.f2416k.m64a(graphics, C0015ao.m264b(f2397z), (int[]) null, (C0010aj) null, 0, 0, this.f2399G[1][0], this.f2399G[1][1], 0, 0);
        }
        graphics.drawString("洗炼锁", this.f2399G[0][0] + 17, this.f2415j.f2149aq.f2329b + 32 + this.f2400H + 3, 20);
        graphics.drawString(new StringBuffer().append(this.f2405M).append(" / ").append(f2380E).toString(), this.f2399G[1][0] - 5, this.f2415j.f2149aq.f2329b + 32 + this.f2400H + 3, 20);
        int i7 = i + 2;
        int iMax = Math.max((int) C0015ao.f178x.f600c, C0088t.f2524j);
        graphics.drawString("当    前", (i2 / 2) + i3, i7, 17);
        graphics.drawString("最    大", (i2 / 2) + i4, i7, 17);
        if (f2378C != null) {
            for (int i8 = 0; i8 < f2378C.length; i8++) {
                i7 += iMax + 1;
                graphics.drawString(this.f2408P[f2377B[i8]], i3 + 4, i7, 20);
                graphics.drawString(new StringBuffer().append("+").append(f2378C[i8]).toString(), (i3 + i2) - 4, i7, 24);
                graphics.drawString(this.f2408P[f2377B[i8]], i4 + 4, i7, 20);
                graphics.drawString(new StringBuffer().append("+").append(f2379D[i8]).toString(), (i4 + i2) - 4, i7, 24);
            }
        }
        C0055ca.m1328d(graphics, this.f2399G[this.f2413f][0], this.f2399G[this.f2413f][1], 17, 17);
        if (this.f2414i.f359l != 0) {
            if (this.f2414i.f359l == 1) {
                C0055ca.m1324c(graphics);
            }
        } else {
            if (this.f2398F == null && this.f2398F == "") {
                return;
            }
            if (this.f2413f == 1) {
                C0055ca.m1321b(graphics, this.f2398F, this.f2399G[1][0] + 8, this.f2399G[1][1] + 8, C0088t.f2517c - 5, 1);
            } else if (this.f2413f == 0) {
                C0055ca.m1321b(graphics, this.f2398F, this.f2399G[0][0] + 8, this.f2399G[0][1] + 8, C0088t.f2517c - 5, 1);
            }
        }
    }

    /* renamed from: e */
    public final void m1634e(int i) throws IOException {
        C0041bn c0041bn;
        byte[] bArrM1052a;
        byte[] bArr;
        if (this.f2414i.f359l == 0) {
            if (this.f2415j.f2149aq != null) {
                this.f2415j.f2149aq.mo70b(i);
            }
            if (i == 8 || i == 1) {
                this.f2413f--;
                if (this.f2413f < 0) {
                    this.f2413f = this.f2399G.length - 1;
                }
                C0055ca.f1892l = 0;
                m1616g();
            } else if (i == 2 || i == 4) {
                this.f2413f++;
                if (this.f2413f >= this.f2399G.length) {
                    this.f2413f = 0;
                }
                C0055ca.f1892l = 0;
                m1616g();
            } else if (i == 268435456 || i == 1073741824) {
                if (this.f2413f == 0) {
                    if (f2382g == -1) {
                        this.f2406N = true;
                        this.f2414i.m377a((byte) 0, new byte[]{2});
                    } else {
                        C0055ca.m1285a(this.f2399G[0][0] + 8, this.f2399G[0][1] + 8, new String[]{"洗炼", "查看", "取出"}, false);
                        this.f2414i.f359l = (short) 1;
                    }
                } else if (this.f2413f == 1) {
                    if (f2382g == -1) {
                        this.f2415j.m1442b("请先放入洗炼装备");
                    } else if (f2395x == -1) {
                        this.f2414i.m377a((byte) 0, new byte[]{5});
                    } else {
                        C0055ca.m1285a(this.f2399G[1][0] + 8, this.f2399G[1][1] + 8, new String[]{"取出"}, false);
                        this.f2414i.f359l = (short) 1;
                    }
                } else if (this.f2407O != null && this.f2413f - 2 < this.f2407O.length) {
                    if (this.f2407O[this.f2413f - 2]) {
                        this.f2407O[this.f2413f - 2] = false;
                        this.f2405M--;
                    } else if (this.f2405M + 1 > f2380E) {
                        this.f2415j.m1442b("没有足够的洗炼锁");
                    } else {
                        this.f2407O[this.f2413f - 2] = true;
                        this.f2405M++;
                    }
                }
            } else if (i == 536870912) {
                m1631d();
                m1614f();
                this.f2398F = null;
                if (this.f2414i.f236aw) {
                    this.f2414i.f236aw = false;
                    this.f2414i.m486t();
                } else if (this.f2414i.f205aJ) {
                    this.f2414i.f205aJ = false;
                    this.f2414i.m434c(false);
                } else {
                    this.f2414i.m471l();
                    this.f2414i.m430c(2);
                }
            }
        } else if (this.f2414i.f359l == 1) {
            C0055ca.m1317b(i);
            if (i == 268435456 || i == 1073741824) {
                if (C0055ca.f1895o == 0) {
                    if (this.f2413f == 0) {
                        if (this.f2407O != null) {
                            bArr = new byte[this.f2405M];
                            byte b = 0;
                            for (int i2 = 0; i2 < this.f2407O.length; i2++) {
                                if (this.f2407O[i2]) {
                                    bArr[b] = f2377B[i2];
                                    b = (byte) (b + 1);
                                }
                            }
                        } else {
                            bArr = null;
                        }
                        bArrM1052a = C0053bz.m1052a((short) 4688, f2382g, f2395x, (byte) 3, f2383h, C0047bt.f1319jG, bArr, C0047bt.f865ad);
                    } else {
                        bArrM1052a = this.f2413f == 1 ? C0053bz.m1052a((short) 4688, f2382g, f2395x, (byte) 2, f2383h, C0047bt.f1319jG, f2377B, C0047bt.f865ad) : null;
                    }
                    if (bArrM1052a != null) {
                        RunnableC0066a.f2115i.m600a(new C0091w((short) 4688, bArrM1052a));
                        this.f2415j.m1434a((String) null);
                    } else {
                        this.f2415j.m1442b("获取上传指令数据错误!");
                    }
                } else if (C0055ca.f1895o == 1) {
                    if (this.f2414i.f236aw && !this.f2406N) {
                        C0047bt.m817a(this.f2414i.f235av);
                    } else if (!this.f2414i.f205aJ || this.f2406N) {
                        int i3 = f2382g;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= C0047bt.f891bC.size()) {
                                c0041bn = null;
                                break;
                            }
                            c0041bn = (C0041bn) C0047bt.f891bC.elementAt(i4);
                            if (c0041bn != null && c0041bn.f714a == i3) {
                                break;
                            } else {
                                i4++;
                            }
                        }
                        if (c0041bn != null) {
                            C0047bt.m819a(c0041bn);
                        } else {
                            this.f2415j.m1442b("装备不存在");
                        }
                    } else {
                        C0047bt.m883b((int) C0015ao.m313l(this.f2414i.f230aq));
                    }
                    this.f2414i.f185O.m1620a(0, this.f2414i.f358k, -1);
                } else if (C0055ca.f1895o == 2) {
                    m1631d();
                    m1622a(true);
                    m1616g();
                    this.f2414i.f359l = (short) 0;
                }
            } else if (i == 536870912) {
                C0055ca.f1892l = 0;
                m1616g();
                this.f2414i.f359l = (short) 0;
            }
        }
        this.f2415j.f2126a = 0;
    }
}

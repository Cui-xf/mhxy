package p000;

import com.yinhan.kjava.main.RunnableC0066a;
import java.io.DataInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import javax.microedition.lcdui.Graphics;

/* renamed from: cg */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-5080095226433994817/classes.dex */
public final class C0061cg {

    /* renamed from: A */
    private static short f1958A;

    /* renamed from: B */
    private static short f1959B;

    /* renamed from: C */
    private static byte f1960C;

    /* renamed from: D */
    private static int[] f1961D;

    /* renamed from: E */
    private static int f1962E;

    /* renamed from: F */
    private static int f1963F;

    /* renamed from: a */
    public static int f1964a;

    /* renamed from: b */
    public static int f1965b = 0;

    /* renamed from: c */
    public static int f1966c = 0;

    /* renamed from: d */
    public static boolean f1967d = false;

    /* renamed from: j */
    private static String f1968j;

    /* renamed from: k */
    private static int f1969k;

    /* renamed from: l */
    private static int f1970l;

    /* renamed from: m */
    private static int f1971m;

    /* renamed from: n */
    private static int f1972n;

    /* renamed from: o */
    private static int f1973o;

    /* renamed from: p */
    private static String f1974p;

    /* renamed from: q */
    private static int f1975q;

    /* renamed from: r */
    private static int f1976r;

    /* renamed from: s */
    private static int f1977s;

    /* renamed from: t */
    private static int f1978t;

    /* renamed from: u */
    private static short f1979u;

    /* renamed from: v */
    private static short f1980v;

    /* renamed from: w */
    private static short f1981w;

    /* renamed from: x */
    private static short f1982x;

    /* renamed from: y */
    private static short f1983y;

    /* renamed from: z */
    private static short f1984z;

    /* renamed from: G */
    private int f1985G;

    /* renamed from: H */
    private C0014an f1986H;

    /* renamed from: I */
    private C0014an f1987I;

    /* renamed from: J */
    private int[][] f1988J;

    /* renamed from: K */
    private int f1989K;

    /* renamed from: L */
    private String f1990L;

    /* renamed from: M */
    private String f1991M;

    /* renamed from: e */
    private C0015ao f1992e;

    /* renamed from: f */
    private RunnableC0066a f1993f;

    /* renamed from: g */
    private C0009ai f1994g;

    /* renamed from: h */
    private C0030bc f1995h;

    /* renamed from: i */
    private C0030bc f1996i;

    public C0061cg(C0015ao c0015ao, RunnableC0066a runnableC0066a, C0009ai c0009ai) {
        this.f1992e = c0015ao;
        this.f1993f = runnableC0066a;
        this.f1994g = c0009ai;
    }

    /* renamed from: a */
    public static void m1344a(int i) {
        f1964a = C0047bt.f1101fA[i];
        f1968j = C0047bt.f1102fB[i];
        f1970l = C0047bt.f1113fM[i];
        f1971m = C0047bt.f1114fN[i];
        f1972n = C0047bt.f1115fO[i];
        f1973o = C0047bt.f1116fP[i];
        f1979u = C0047bt.f1105fE[i];
        f1980v = C0047bt.f1106fF[i];
        f1981w = C0047bt.f1107fG[i];
        f1982x = C0047bt.f1108fH[i];
        f1969k = -1;
        f1974p = "";
        f1983y = (short) -1;
        f1975q = -1;
        f1976r = -1;
        f1977s = -1;
        f1978t = -1;
        f1962E = 0;
        f1963F = -1;
    }

    /* renamed from: a */
    private void m1345a(int i, int i2, int i3, int i4, int i5) {
        if (this.f1988J == null || this.f1988J.length <= i) {
            return;
        }
        this.f1988J[i][0] = i2;
        this.f1988J[i][1] = i3;
        this.f1988J[i][2] = 50;
        this.f1988J[i][3] = 50;
    }

    /* renamed from: a */
    public static void m1346a(DataInputStream dataInputStream) throws IOException {
        byte b = dataInputStream.readByte();
        f1960C = b;
        if (b == 0) {
            int i = dataInputStream.readShort();
            f1961D = new int[i];
            for (int i2 = 0; i2 < i; i2++) {
                f1961D[i2] = dataInputStream.readInt();
            }
            int i3 = f1965b;
            f1964a = C0047bt.f1101fA[i3];
            f1968j = C0047bt.f1102fB[i3];
            f1970l = C0047bt.f1113fM[i3];
            f1971m = C0047bt.f1114fN[i3];
            f1972n = C0047bt.f1115fO[i3];
            f1973o = C0047bt.f1116fP[i3];
            f1979u = C0047bt.f1105fE[i3];
            f1980v = C0047bt.f1106fF[i3];
            f1981w = C0047bt.f1107fG[i3];
            f1982x = C0047bt.f1108fH[i3];
            return;
        }
        if (f1960C != 1) {
            if (f1960C == 2) {
                f1963F = dataInputStream.readInt();
                return;
            }
            return;
        }
        f1969k = C0047bt.f1101fA[f1966c];
        dataInputStream.readUTF();
        f1974p = dataInputStream.readUTF();
        f1975q = dataInputStream.readInt();
        f1976r = dataInputStream.readInt();
        f1977s = dataInputStream.readInt();
        f1978t = dataInputStream.readInt();
        f1962E = dataInputStream.readInt();
        for (int i4 = 0; i4 < C0047bt.f1101fA.length; i4++) {
            if (C0047bt.f1101fA[i4] == f1969k) {
                f1983y = C0047bt.f1105fE[i4];
                f1984z = C0047bt.f1106fF[i4];
                f1958A = C0047bt.f1107fG[i4];
                f1959B = C0047bt.f1108fH[i4];
            }
        }
        f1967d = false;
    }

    /* renamed from: c */
    private static void m1347c() {
        C0047bt.f1149fw = null;
        if (C0047bt.f1101fA == null || C0047bt.f1101fA.length <= 0) {
            return;
        }
        C0047bt.f1149fw = new int[f1961D.length - (f1969k != -1 ? 1 : 0)];
        int i = 0;
        for (int i2 = 0; i2 < f1961D.length; i2++) {
            for (int i3 = 0; i3 < C0047bt.f1101fA.length; i3++) {
                if (C0047bt.f1101fA[i3] == f1961D[i2] && C0047bt.f1101fA[i3] != f1969k) {
                    C0047bt.f1149fw[i] = i3;
                    i++;
                }
            }
        }
    }

    /* renamed from: a */
    public final int m1348a(int i, int i2) {
        if (this.f1992e.f359l == 1) {
            return C0055ca.m1322c(i, i2);
        }
        int iMo69b = this.f1993f.f2149aq.mo69b(i, i2);
        if (iMo69b <= 0) {
            iMo69b = this.f1986H.mo69b(i, i2);
        }
        if (iMo69b <= 0) {
            iMo69b = this.f1987I.mo69b(i, i2);
        }
        if (iMo69b > 0) {
            return iMo69b;
        }
        for (int i3 = 0; i3 < this.f1988J.length; i3++) {
            if (i >= this.f1988J[i3][0] && i <= this.f1988J[i3][0] + this.f1988J[i3][2] && i2 >= this.f1988J[i3][1] && i2 <= this.f1988J[i3][1] + this.f1988J[i3][3]) {
                if (i3 == 0) {
                    this.f1989K = 0;
                } else {
                    this.f1989K = 1;
                }
                iMo69b = 268435456;
            }
        }
        return iMo69b;
    }

    /* renamed from: a */
    public final void m1349a() {
        f1964a = -1;
        f1968j = null;
        f1979u = (short) -1;
        f1970l = -1;
        f1971m = -1;
        f1972n = -1;
        f1973o = -1;
        f1969k = -1;
        f1974p = "";
        f1983y = (short) -1;
        f1975q = -1;
        f1976r = -1;
        f1977s = -1;
        f1978t = -1;
        f1963F = -1;
        f1962E = 0;
        this.f1995h = null;
        this.f1996i = null;
    }

    /* renamed from: a */
    public final void m1350a(Graphics graphics) {
        if (this.f1993f.f2149aq != null) {
            this.f1993f.f2149aq.m1602a(graphics);
            this.f1986H.m78a(graphics);
            this.f1987I.m78a(graphics);
            C0055ca.m1292a(graphics, this.f1993f.f2149aq.f2328a + 5, this.f1993f.f2149aq.f2329b + 32, this.f1993f.f2149aq.f2330c - 11, this.f1985G, 1);
        }
        C0055ca.m1292a(graphics, this.f1993f.f2149aq.f2328a + 5 + 25, this.f1993f.f2149aq.f2329b + 32 + 10, 50, 50, 1);
        graphics.setColor(2917024);
        graphics.fillRect(this.f1993f.f2149aq.f2328a + 5 + 25 + (this.f1993f.f2149aq.f2330c / 2), this.f1993f.f2149aq.f2329b + 32 + 10, 50, 50);
        graphics.setColor(9360850);
        graphics.drawRect(this.f1993f.f2149aq.f2328a + 5 + 25 + (this.f1993f.f2149aq.f2330c / 2), this.f1993f.f2149aq.f2329b + 32 + 10, 49, 49);
        m1345a(0, this.f1993f.f2149aq.f2328a + 5 + 25, this.f1993f.f2149aq.f2329b + 32 + 10, 50, 50);
        m1345a(1, (this.f1993f.f2149aq.f2330c / 2) + this.f1993f.f2149aq.f2328a + 5 + 25, this.f1993f.f2149aq.f2329b + 32 + 10, 50, 50);
        C0055ca.m1328d(graphics, this.f1988J[this.f1989K][0], this.f1988J[this.f1989K][1], 50, 50);
        if (f1964a != -1 && this.f1995h != null) {
            this.f1994g.m62a(graphics, this.f1995h, (int[]) null, 0, 0, this.f1993f.f2149aq.f2328a + 5 + 25, this.f1993f.f2149aq.f2329b + 32 + 10, 0, 0);
        }
        if (f1969k == -1 || this.f1996i == null) {
            graphics.setColor(16776960);
            graphics.drawString("副宠", this.f1993f.f2149aq.f2328a + 5 + 25 + (this.f1993f.f2149aq.f2330c / 2) + 25, this.f1993f.f2149aq.f2329b + 32 + 10 + (C0088t.f2524j / 4) + 25, 65);
        } else {
            this.f1994g.m62a(graphics, this.f1996i, (int[]) null, 0, 0, (this.f1993f.f2149aq.f2330c / 2) + this.f1993f.f2149aq.f2328a + 5 + 25, this.f1993f.f2149aq.f2329b + 32 + 10, 0, 0);
        }
        if (this.f1992e.f359l == 1) {
            C0055ca.m1324c(graphics);
        }
    }

    /* renamed from: b */
    public final void m1351b() {
        this.f1989K = 0;
        if (this.f1988J != null) {
            for (int i = 0; i < this.f1988J.length; i++) {
                if (this.f1988J[i] != null) {
                    this.f1988J[i] = null;
                }
            }
            this.f1988J = null;
        }
        this.f1988J = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 2, 4);
        this.f1986H = new C0014an();
        this.f1987I = new C0014an();
        this.f1990L = new StringBuffer().append("继承前\t").append(f1968j).append("\t").append("星级: \t").append("攻击：").append(f1970l).append("-").append(f1971m).append("\t").append("法功：").append(f1972n).append("-").append(f1973o).toString();
        if (f1969k != -1) {
            this.f1991M = new StringBuffer().append("继承后\t").append(f1968j).append("\t").append("<0>星级: ").append(f1974p).append("\t").append("<2>攻击：").append(f1975q).append("-").append(f1976r).append("\t").append("法功：").append(f1977s).append("-").append(f1978t).toString();
        } else {
            this.f1991M = "继承后";
        }
        this.f1993f.f2149aq.m1604b();
        this.f1993f.f2149aq.m1601a("星级继承");
        this.f1993f.f2149aq.m1603a(true);
        this.f1986H.m77a(this.f1990L, C0088t.f2523i, (byte) 2);
        this.f1987I.m77a(this.f1991M, C0088t.f2523i, (byte) 2);
        if (f1964a != -1 && f1979u != -1) {
            C0015ao.m164a(f1979u, f1980v, f1981w, f1982x);
            this.f1995h = RunnableC0066a.f2102ah.m984a(String.valueOf(new StringBuffer().append((int) f1979u).append("_0").toString()), f1980v, f1981w, f1982x);
        } else if (this.f1995h != null) {
            this.f1995h.mo606a();
            this.f1995h = null;
        }
        if (f1969k != -1 && f1983y != -1) {
            C0015ao.m164a(f1983y, f1984z, f1958A, f1959B);
            this.f1996i = RunnableC0066a.f2102ah.m984a(String.valueOf(new StringBuffer().append((int) f1983y).append("_0").toString()), f1984z, f1958A, f1959B);
        } else if (this.f1996i != null) {
            this.f1996i.mo606a();
            this.f1996i = null;
        }
        if (C0088t.f2517c > 220) {
            this.f1993f.f2153au.m1590a("");
            this.f1993f.f2149aq.m1600a(this.f1993f.f2153au);
        }
        this.f1985G = (((this.f1993f.f2149aq.f2331d - 32) - C0088t.f2524j) / 3) - 10;
        this.f1993f.f2149aq.m1598a(C0088t.f2520f, C0088t.f2521g, C0088t.f2518d, C0088t.f2519e);
        this.f1986H.m76a(this.f1993f.f2149aq.f2328a + 5, this.f1993f.f2149aq.f2329b + 32 + this.f1985G, this.f1993f.f2149aq.f2330c - 11, this.f1985G + 10);
        this.f1987I.m76a(this.f1993f.f2149aq.f2328a + 5, this.f1993f.f2149aq.f2329b + 32 + (this.f1985G * 2) + 10, this.f1993f.f2149aq.f2330c - 11, this.f1985G + 10);
        C0055ca.f1892l = 0;
        this.f1992e.f359l = (short) 0;
        this.f1993f.f2216j = this.f1993f.f2217k;
        C0015ao c0015ao = this.f1992e;
        this.f1992e.f358k = (short) 131;
        c0015ao.f357j = (short) 131;
    }

    /* renamed from: b */
    public final void m1352b(int i) throws IOException {
        if (f1963F == 1) {
            f1963F = 0;
            this.f1993f.m1442b("宠物星级继承成功");
            this.f1992e.m431c(0, this.f1992e.f200aE, this.f1992e.f196aA);
            this.f1992e.m352E();
            C0055ca.f1895o = 3;
            this.f1992e.f359l = (short) 1;
            i = 0;
        }
        if (this.f1992e.f359l == 0) {
            if (this.f1993f.f2149aq != null) {
                this.f1993f.f2149aq.mo70b(i);
                this.f1986H.mo70b(i);
                this.f1987I.mo70b(i);
            }
            if (f1964a != -1 && this.f1995h != null) {
                C0009ai.m43a(this.f1995h, this.f1993f.f2147ak);
            }
            if (f1969k != -1 && this.f1996i != null) {
                C0009ai.m43a(this.f1996i, this.f1993f.f2147ak);
            }
            if (i == 8 || i == 2) {
                this.f1989K = this.f1989K == 1 ? 0 : 1;
                C0055ca.f1892l = 0;
                return;
            }
            if (i != 268435456 && i != 1073741824) {
                if (i == 536870912) {
                    this.f1992e.m431c(0, this.f1992e.f200aE, this.f1992e.f196aA);
                    this.f1992e.m352E();
                    C0055ca.f1895o = 3;
                    this.f1992e.f359l = (short) 1;
                    return;
                }
                return;
            }
            if (this.f1989K == 0) {
                if (f1964a == -1) {
                    this.f1992e.m467j(0);
                    return;
                } else {
                    C0055ca.m1285a(C0088t.f2516b / 2, C0088t.f2517c / 2, new String[]{"继承", "更换"}, true);
                    this.f1992e.f359l = (short) 1;
                    return;
                }
            }
            if (this.f1989K == 1) {
                if (f1964a == -1) {
                    this.f1993f.m1442b("请先放入主宠");
                    return;
                }
                if (f1969k != -1) {
                    C0055ca.m1285a(C0088t.f2516b / 2, C0088t.f2517c / 2, new String[]{"更换"}, true);
                    this.f1992e.f359l = (short) 1;
                    return;
                }
                m1347c();
                if (C0047bt.f1149fw == null || C0047bt.f1149fw.length <= 0) {
                    this.f1993f.m1442b("您没有符合要求的副宠");
                    return;
                } else {
                    f1967d = true;
                    this.f1992e.m467j(11);
                    return;
                }
            }
            return;
        }
        if (this.f1992e.f359l == 1) {
            C0055ca.m1317b(i);
            if (i == 536870912) {
                this.f1992e.f359l = (short) 0;
                return;
            }
            if (i == 268435456 || i == 1073741824) {
                if (this.f1989K != 0) {
                    if (this.f1989K == 1 && C0055ca.f1895o == 0) {
                        m1347c();
                        if (C0047bt.f1149fw == null || C0047bt.f1149fw.length <= 0) {
                            this.f1993f.m1442b("您没有符合要求的副宠");
                            return;
                        } else {
                            f1967d = true;
                            this.f1992e.m467j(11);
                            return;
                        }
                    }
                    return;
                }
                if (C0055ca.f1895o == 0) {
                    if (f1964a == -1 || f1969k == -1) {
                        this.f1993f.m1442b("请先放入副宠");
                        return;
                    }
                    byte[] bArrM1110b = C0053bz.m1110b((byte) 2, f1964a, f1969k, f1962E);
                    if (bArrM1110b == null) {
                        this.f1993f.m1442b("获取上传指令数据错误!");
                        return;
                    } else {
                        RunnableC0066a.f2115i.m600a(new C0091w((short) 4691, bArrM1110b));
                        this.f1993f.m1434a((String) null);
                        return;
                    }
                }
                if (C0055ca.f1895o == 1) {
                    C0047bt.f1149fw = null;
                    if (C0047bt.f1101fA != null && C0047bt.f1101fA.length > 0) {
                        int i2 = 0;
                        for (int i3 = 0; i3 < C0047bt.f1101fA.length; i3++) {
                            if (C0047bt.f1185gf[i3].equals("")) {
                                i2++;
                            }
                        }
                        if (i2 - 1 > 0) {
                            C0047bt.f1149fw = new int[i2 - 1];
                            int i4 = 0;
                            int i5 = 0;
                            while (i5 < C0047bt.f1101fA.length) {
                                if (C0047bt.f1101fA[i5] != f1964a && C0047bt.f1185gf[i5].equals("")) {
                                    C0047bt.f1149fw[i4] = i5;
                                    i4++;
                                }
                                i5++;
                                i4 = i4;
                            }
                        }
                    }
                    if (C0047bt.f1149fw == null || C0047bt.f1149fw.length <= 0) {
                        this.f1993f.m1442b("您没有主宠可以选择");
                    } else {
                        this.f1992e.m467j(11);
                    }
                }
            }
        }
    }
}

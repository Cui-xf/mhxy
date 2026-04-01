package p000;

import com.yinhan.kjava.main.RunnableC0066a;
import java.lang.reflect.Array;
import java.util.Random;
import java.util.Vector;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* renamed from: ca */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-4234804660425969496/classes.dex */
public final class C0055ca {

    /* renamed from: E */
    private static int[][] f1842E;

    /* renamed from: F */
    private static int[][] f1843F;

    /* renamed from: G */
    private static int[][] f1844G;

    /* renamed from: I */
    private static int f1846I;

    /* renamed from: J */
    private static int[][] f1847J;

    /* renamed from: M */
    private static int f1850M;

    /* renamed from: N */
    private static int f1851N;

    /* renamed from: O */
    private static int f1852O;

    /* renamed from: P */
    private static int f1853P;

    /* renamed from: Q */
    private static String f1854Q;

    /* renamed from: R */
    private static short f1855R;

    /* renamed from: S */
    private static short f1856S;

    /* renamed from: T */
    private static int f1857T;

    /* renamed from: U */
    private static int f1858U;

    /* renamed from: V */
    private static C0050bw f1859V;

    /* renamed from: W */
    private static String[] f1860W;

    /* renamed from: ac */
    private static String f1867ac;

    /* renamed from: ad */
    private static String f1868ad;

    /* renamed from: ae */
    private static C0050bw f1869ae;

    /* renamed from: ag */
    private static int f1871ag;

    /* renamed from: ah */
    private static int[] f1872ah;

    /* renamed from: an */
    private static int[] f1878an;

    /* renamed from: ap */
    private static C0050bw f1880ap;

    /* renamed from: q */
    public static int f1897q;

    /* renamed from: r */
    public static int f1898r;

    /* renamed from: s */
    public static int f1899s;

    /* renamed from: t */
    public static int f1900t;

    /* renamed from: u */
    public static int f1901u;

    /* renamed from: v */
    public static int f1902v;

    /* renamed from: w */
    public static int f1903w;

    /* renamed from: x */
    public static int f1904x;

    /* renamed from: y */
    public static int f1905y;

    /* renamed from: z */
    public static int f1906z;

    /* renamed from: a */
    public static int f1864a = 16777215;

    /* renamed from: b */
    public static int f1882b = 0;

    /* renamed from: B */
    private static int f1839B = 6732228;

    /* renamed from: c */
    public static int f1883c = 4562087;

    /* renamed from: C */
    private static int f1840C = 0;

    /* renamed from: d */
    public static int f1884d = 0;

    /* renamed from: e */
    public static int f1885e = 0;

    /* renamed from: f */
    public static int f1886f = 0;

    /* renamed from: g */
    public static int f1887g = 0;

    /* renamed from: D */
    private static int[] f1841D = new int[4];

    /* renamed from: h */
    public static int f1888h = 0;

    /* renamed from: H */
    private static String[] f1845H = null;

    /* renamed from: i */
    public static int f1889i = 26540;

    /* renamed from: K */
    private static int f1848K = 11267556;

    /* renamed from: j */
    public static int[] f1890j = new int[3];

    /* renamed from: L */
    private static byte f1849L = 0;

    /* renamed from: k */
    public static int f1891k = 0;

    /* renamed from: l */
    public static int f1892l = 0;

    /* renamed from: X */
    private static int f1861X = 0;

    /* renamed from: Y */
    private static int f1862Y = 0;

    /* renamed from: Z */
    private static int f1863Z = 0;

    /* renamed from: aa */
    private static int f1865aa = 0;

    /* renamed from: ab */
    private static int f1866ab = 0;

    /* renamed from: m */
    public static int f1893m = 1;

    /* renamed from: n */
    public static int[] f1894n = {16711680, 4194166, 15588145, 12066995, 12066995, 16776960, 2241484, 16777215, 15138723, 4521983, 16755438, 15095, 14221536, 31834, 13513984, 8750469, 65280, 0, 16514810, 65532, 65316, 16490750, 16197367};

    /* renamed from: af */
    private static int[] f1870af = new int[2];

    /* renamed from: o */
    public static int f1895o = 0;

    /* renamed from: p */
    public static String[] f1896p = new String[0];

    /* renamed from: ai */
    private static int[][] f1873ai = null;

    /* renamed from: aj */
    private static int[][] f1874aj = new int[4][4];

    /* renamed from: ak */
    private static int[][] f1875ak = new int[2][4];

    /* renamed from: al */
    private static int[] f1876al = new int[4];

    /* renamed from: am */
    private static boolean f1877am = false;

    /* renamed from: A */
    public static int f1838A = 0;

    /* renamed from: ao */
    private static String[] f1879ao = {"系统菜单内可进行动态NPC和小地图等设置", "按“3”键可打开角色物品栏", "按“1”键可查看周围玩家", "按“0”键可打开宠物栏", "按“7”键可打开地图", "按“9”键可打开社交栏", "按“*”键可打开聊天栏", "按“#”键可打开任务栏"};

    /* renamed from: aq */
    private static Random f1881aq = new Random();

    /* renamed from: a */
    public static int m1278a(int i) {
        if (i < 0 || i >= f1894n.length) {
            return 15138723;
        }
        return f1894n[i];
    }

    /* renamed from: a */
    public static int m1279a(int i, int i2) {
        if (f1842E != null) {
            if (i >= f1842E[0][0] && i <= f1842E[0][0] + f1842E[0][2] && i2 >= f1842E[0][1] && i2 <= f1842E[0][1] + f1842E[0][3]) {
                return 8;
            }
            if (i >= f1842E[1][0] && i <= f1842E[1][0] + f1842E[1][2] && i2 >= f1842E[1][1] && i2 <= f1842E[1][1] + f1842E[1][3]) {
                return 2;
            }
        }
        if (f1843F != null) {
            for (int i3 = 0; i3 < f1843F.length; i3++) {
                if (i >= f1843F[i3][0] && i <= f1843F[i3][0] + f1843F[i3][2] && i2 >= f1843F[i3][1] && i2 <= f1843F[i3][1] + f1843F[i3][3]) {
                    f1887g = i3;
                    return 1073741824;
                }
            }
        }
        if (f1844G == null) {
            if (f1841D != null) {
                return (i < f1841D[0] || i > f1841D[0] + f1841D[2] || i2 < f1841D[1] || i2 > f1841D[1] + f1841D[3]) ? 536870912 : 0;
            }
            return 0;
        }
        if (f1844G.length < 1 || i < f1844G[0][0] || i > f1844G[0][0] + f1844G[0][2] || i2 < f1844G[0][1] || i2 > f1844G[0][1] + f1844G[0][3]) {
            return (f1844G.length != 2 || i < f1844G[1][0] || i > f1844G[1][0] + f1844G[1][2] || i2 < f1844G[1][1] || i2 > f1844G[1][1] + f1844G[1][3]) ? 0 : 536870912;
        }
        return 268435456;
    }

    /* renamed from: a */
    public static int m1280a(String str) {
        if (str == null || str.trim().equals("")) {
            return -1;
        }
        f1893m = 1;
        if (str.charAt(0) != '<') {
            return -1;
        }
        if (str.charAt(2) == '>') {
            return m1315b(str.substring(1, 2));
        }
        if (str.charAt(3) != '>') {
            return -1;
        }
        f1893m = 2;
        return m1315b(str.substring(1, 3));
    }

    /* renamed from: a */
    public static void m1281a() {
        f1878an = new int[]{(C0088t.f2516b - 100) / 2, ((C0088t.f2517c / 3) << 1) + 20, 100, 3};
        f1838A = 0;
        f1880ap = new C0050bw(f1879ao[m1331f(1, 100) % 7], (short) (C0088t.f2516b - 20));
    }

    /* renamed from: a */
    public static void m1282a(int i, int i2, int i3) {
        if (i == 514 || i == 1) {
            if (f1903w == 0) {
                f1906z = f1902v % f1904x == 0 ? f1902v - f1904x : f1902v - (f1902v % f1904x);
                f1903w = f1902v - 1;
            } else {
                f1903w--;
            }
            while (f1906z > 0 && f1877am && (f1903w - f1906z) + 1 < f1904x) {
                f1906z--;
            }
            return;
        }
        if (i == 520 || i == 4) {
            if (f1903w == f1902v - 1) {
                f1906z = 0;
                f1903w = 0;
            } else {
                f1903w++;
            }
            while (f1906z < f1903w && f1877am && (f1903w - f1906z) + 1 > f1904x) {
                f1906z++;
            }
        }
    }

    /* renamed from: a */
    public static void m1283a(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        f1903w = 0;
        f1905y = 0;
        f1906z = 0;
        f1898r = 4;
        f1899s = i3;
        f1900t = i4;
        f1901u = i5;
        f1902v = i;
        f1904x = i6;
        if (f1902v <= i6) {
            f1877am = false;
        } else {
            f1877am = true;
            f1905y = (f1904x * (i5 - 16)) / i;
        }
    }

    /* renamed from: a */
    public static void m1284a(int i, int i2, int i3, int i4, String str) {
        f1850M = i;
        f1851N = i2;
        f1852O = i3;
        if (str == null) {
            str = "载入中…";
        }
        f1854Q = str;
        f1853P = f1850M + ((f1852O - C0088t.f2523i.stringWidth(f1854Q)) / 2);
    }

    /* renamed from: a */
    public static void m1285a(int i, int i2, String[] strArr, boolean z) {
        int[] iArr;
        int i3;
        if (strArr == null) {
            return;
        }
        f1872ah = null;
        f1895o = 0;
        f1896p = new String[strArr.length];
        f1873ai = new int[strArr.length][4];
        for (int i4 = 0; i4 < strArr.length; i4++) {
            System.arraycopy(strArr, 0, f1896p, 0, strArr.length);
        }
        f1897q = C0088t.f2523i.stringWidth("菜单");
        for (int i5 = 0; i5 < f1896p.length; i5++) {
            f1897q = Math.max(f1897q, C0088t.f2523i.stringWidth(f1896p[i5]));
        }
        f1897q += 20;
        f1870af[0] = i;
        f1870af[1] = i2;
        f1871ag = (f1896p.length * (C0088t.f2524j + 3)) + 3;
        f1870af[1] = f1870af[1] + f1871ag > C0088t.f2517c ? C0088t.f2517c - f1871ag : f1870af[1];
        if (z) {
            iArr = f1870af;
            i3 = (C0088t.f2516b / 2) - (f1897q / 2);
        } else {
            iArr = f1870af;
            i3 = f1870af[0] + f1897q > C0088t.f2516b ? C0088t.f2516b - f1897q : f1870af[0];
        }
        iArr[0] = i3;
    }

    /* renamed from: a */
    public static void m1286a(C0026az c0026az, C0050bw c0050bw, String[] strArr, String[] strArr2, boolean z) {
        int length;
        f1840C = 0;
        f1884d = 0;
        f1885e = 0;
        f1887g = 0;
        f1886f = 0;
        if (strArr != null) {
            length = strArr.length;
            f1843F = new int[strArr.length][4];
        } else {
            f1843F = null;
            length = 0;
        }
        f1844G = null;
        short sM617d = c0026az != null ? c0026az.m617d() : (short) 0;
        if (c0050bw != null && c0050bw.m1015a() != 0) {
            int i = (((C0088t.f2517c - 26) - sM617d) - (C0088t.f2524j * length)) / C0088t.f2524j;
            if (z) {
                short sM1015a = c0050bw.m1015a();
                int[] iArr = new int[2];
                if (sM1015a <= i) {
                    iArr[0] = 1;
                    iArr[1] = sM1015a;
                } else {
                    int i2 = 0;
                    for (int i3 = sM1015a; i3 > 0; i3--) {
                        if (sM1015a % i3 == 0) {
                            i2++;
                        }
                    }
                    int i4 = i2 == 2 ? sM1015a + 1 : sM1015a;
                    int i5 = i;
                    while (true) {
                        if (i5 <= 0) {
                            break;
                        }
                        if (i4 % i5 == 0) {
                            iArr[0] = i4 / i5;
                            iArr[1] = i5;
                            break;
                        }
                        i5--;
                    }
                }
                f1840C = iArr[0];
                f1884d = iArr[1];
            } else {
                f1840C = (c0050bw.m1015a() % i != 0 ? 1 : 0) + (c0050bw.m1015a() / i);
                f1884d = i;
            }
            if (f1840C > 1) {
                f1842E = new int[2][4];
            } else {
                f1842E = null;
            }
        }
        f1886f = ((f1884d + length) * C0088t.f2524j) + 26;
    }

    /* renamed from: a */
    private static void m1287a(String str, int i, int i2, int i3) {
        if (str == null || f1847J == null || f1847J.length <= i) {
            return;
        }
        f1847J[i][0] = i2;
        f1847J[i][1] = i3;
        f1847J[i][2] = C0088t.f2523i.stringWidth(str);
        f1847J[i][3] = C0088t.f2524j;
    }

    /* renamed from: a */
    public static void m1288a(Graphics graphics) {
        graphics.setColor(f1848K);
        graphics.fillRect(f1890j[0] - 2, f1890j[1], f1890j[2] + 4, 2);
        graphics.setColor(f1889i);
        graphics.fillRect(f1890j[0] - 1, f1890j[1], f1890j[2] + 2, 3);
        graphics.setColor(f1839B);
        graphics.fillRect(f1890j[0], f1890j[1], f1890j[2], 3);
    }

    /* renamed from: a */
    public static void m1289a(Graphics graphics, int i) {
        int[] iArr = new int[1];
        switch (i) {
            case -1:
                iArr[0] = 16777215;
                break;
            case 0:
                iArr[0] = 0;
                break;
            case 1:
                iArr[0] = 6014420;
                break;
            case 2:
                iArr[0] = 20871;
                break;
            case 3:
                iArr[0] = 1152942;
                break;
            case 4:
                iArr[0] = 9820642;
                break;
            case 5:
                iArr[0] = 12170677;
                break;
            case 6:
                iArr[0] = 12170677;
                break;
            case 7:
                iArr[0] = 12170677;
                break;
            case 8:
                iArr[0] = 852044;
                break;
            case 9:
                iArr[0] = 873078;
                break;
            case 10:
                iArr[0] = 7479845;
                break;
            case 11:
                iArr[0] = 29803;
                break;
        }
        graphics.setColor(iArr[0]);
    }

    /* renamed from: a */
    public static void m1290a(Graphics graphics, int i, int i2, int i3) {
        graphics.setColor(f1889i);
        graphics.fillRect(i, i2, i3 - 1, 3);
        graphics.setColor(f1848K);
        graphics.drawLine(i, i2 + 1, (i + i3) - 1, i2 + 1);
    }

    /* renamed from: a */
    public static void m1291a(Graphics graphics, int i, int i2, int i3, int i4) {
        graphics.setClip(0, 0, C0088t.f2516b, C0088t.f2517c);
        m1293a(graphics, 1009050, 180, i, i2, i3, i4);
        m1289a(graphics, 2);
        graphics.drawRect(i, i2, i3 - 1, i4 - 1);
        graphics.drawRect(i + 4, i2 + 4, i3 - 9, i4 - 9);
        m1289a(graphics, 3);
        graphics.drawRect(i + 1, i2 + 1, i3 - 3, i4 - 3);
        graphics.drawRect(i + 3, i2 + 3, i3 - 7, i4 - 7);
        m1289a(graphics, 4);
        graphics.drawRect(i + 2, i2 + 2, i3 - 5, i4 - 5);
        if (RunnableC0066a.f2124y != null) {
            graphics.drawImage(RunnableC0066a.f2124y.f598a, i, i2, 20);
        }
        if (RunnableC0066a.f2125z != null) {
            graphics.drawImage(RunnableC0066a.f2125z.f598a, i, (i2 + i4) - RunnableC0066a.f2125z.f600c, 20);
        }
        if (RunnableC0066a.f2122w != null) {
            graphics.drawImage(RunnableC0066a.f2122w.f598a, (i + i3) - RunnableC0066a.f2122w.f599b, i2, 20);
        }
        if (RunnableC0066a.f2123x != null) {
            graphics.drawImage(RunnableC0066a.f2123x.f598a, (i + i3) - RunnableC0066a.f2123x.f599b, (i2 + i4) - RunnableC0066a.f2123x.f600c, 20);
        }
    }

    /* renamed from: a */
    public static void m1292a(Graphics graphics, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 1) {
            graphics.setColor(f1839B);
            graphics.fillRect(i, i2, i3, i4);
        } else if (i5 == 2) {
            graphics.setColor(f1883c);
            graphics.fillRect(i, i2, i3, i4);
        } else if (i5 == 3) {
            graphics.setColor(6793943);
            graphics.fillRect(i, i2, i3, i4);
        } else if (i5 == 4) {
            m1293a(graphics, 8634850, 210, i, i2, i3, i4);
        }
        graphics.setColor(f1889i);
        graphics.drawRect(i, i2, i3, i4);
        graphics.drawRect(i + 2, i2 + 2, i3 - 4, i4 - 4);
        graphics.setColor(f1848K);
        graphics.drawRect(i + 1, i2 + 1, i3 - 2, i4 - 2);
    }

    /* renamed from: a */
    public static void m1293a(Graphics graphics, int i, int i2, int i3, int i4, int i5, int i6) {
        if (C0088t.f2531q != 2) {
            C0024ax.m609a(graphics, i, i2, i3, i4, i5, i6);
        }
    }

    /* renamed from: a */
    public static void m1294a(Graphics graphics, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = 0;
        graphics.setColor(20871);
        graphics.fillRect(i + 4, i2, 4, i3);
        graphics.setColor(1152942);
        graphics.fillRect(i + 5, i2, 2, i3);
        graphics.drawImage(RunnableC0066a.f2064C.f598a, i, i2, 20);
        graphics.drawImage(RunnableC0066a.f2065D.f598a, i, (i2 + i3) - RunnableC0066a.f2065D.f600c, 20);
        int i9 = i6 == i7 ? 0 : i4;
        if (i9 > 0) {
            i8 = RunnableC0066a.f2064C.f600c + i2 + (((((i3 - RunnableC0066a.f2064C.f600c) - RunnableC0066a.f2065D.f600c) - i9) * i5) / (i6 - i7));
        } else if (i9 <= 0) {
            i8 = RunnableC0066a.f2064C.f600c + i2;
            i9 = (i3 - RunnableC0066a.f2064C.f600c) - RunnableC0066a.f2065D.f600c;
        }
        graphics.setColor(11267556);
        graphics.fillRect(i, i8, RunnableC0066a.f2064C.f599b - 1, i9 - 1);
        graphics.setColor(5555146);
        graphics.fillRect(i + 2, i8 + 2, 8, i9 - 4);
        graphics.setColor(1801628);
        graphics.fillRect(i + 3, i8 + 3, 6, i9 - 6);
        graphics.setColor(1464956);
        graphics.fillRect(i + 6, i8 + 4, 2, i9 - 8);
        graphics.setColor(150092);
        graphics.drawRect(i, i8, RunnableC0066a.f2064C.f599b - 1, i9 - 1);
    }

    /* renamed from: a */
    public static void m1295a(Graphics graphics, int i, int i2, int i3, int i4, C0050bw c0050bw, String[] strArr, String[] strArr2) {
        m1291a(graphics, 0, i2, i3, i4);
        m1308a(f1841D, 0, i2, i3, i4);
        if (c0050bw != null) {
            int iM1015a = f1885e + f1884d >= c0050bw.m1015a() ? c0050bw.m1015a() : f1885e + f1884d;
            for (int i5 = f1885e; i5 < iM1015a; i5++) {
                c0050bw.m1018a(graphics, 10, i2 + 12 + ((i5 - f1885e) * C0088t.f2524j), i5, 20);
            }
            if (RunnableC0066a.f2062A != null) {
                if (f1885e != 0) {
                    C0009ai.m43a(RunnableC0066a.f2062A, System.currentTimeMillis());
                    RunnableC0066a.f2114f.m62a(graphics, RunnableC0066a.f2062A, (int[]) null, 0, 0, 16, i2 + 5, 20, 0);
                    m1308a(f1842E != null ? f1842E[0] : null, 16, i2 + 5, 16, 9);
                } else {
                    m1308a(f1842E != null ? f1842E[0] : null, 0, 0, 0, 0);
                }
            }
            if (RunnableC0066a.f2063B != null) {
                if (f1885e + f1884d < c0050bw.m1015a()) {
                    C0009ai.m43a(RunnableC0066a.f2063B, System.currentTimeMillis());
                    RunnableC0066a.f2114f.m62a(graphics, RunnableC0066a.f2063B, (int[]) null, 0, 0, i3 - 32, i2 + 5, 20, 0);
                    m1308a(f1842E != null ? f1842E[1] : null, i3 - 32, i2 + 5, 16, 9);
                } else {
                    m1308a(f1842E != null ? f1842E[1] : null, 0, 0, 0, 0);
                }
            }
        }
        if (strArr == null || f1843F == null) {
            return;
        }
        int i6 = 0;
        while (true) {
            int i7 = i6;
            if (i7 >= strArr.length) {
                return;
            }
            m1308a(f1843F != null ? f1843F[i7] : null, 10, ((i2 + i4) - 9) - ((strArr.length - i7) * C0088t.f2524j), C0088t.f2523i.stringWidth(strArr[i7]), C0088t.f2524j);
            m1298a(graphics, strArr[i7], f1843F[i7][0], f1843F[i7][1], 20, f1887g == i7 ? 16711680 : 16777215, 0);
            i6 = i7 + 1;
        }
    }

    /* renamed from: a */
    public static void m1296a(Graphics graphics, String str, int i, int i2, int i3) {
        graphics.drawImage(RunnableC0066a.f2085X.f598a, i, i2 + 3, 20);
        m1326c(graphics, i + 12, i2, i3 - 24, C0088t.f2524j, 1);
        graphics.drawImage(RunnableC0066a.f2086Y.f598a, (i + i3) - 9, i2 + 3, 20);
        m1297a(graphics, str, i + (i3 / 2), i2 + 3, 17, 16711639);
    }

    /* renamed from: a */
    public static void m1297a(Graphics graphics, String str, int i, int i2, int i3, int i4) {
        graphics.setColor(i4);
        graphics.drawString(str, i, i2, i3);
    }

    /* renamed from: a */
    public static void m1298a(Graphics graphics, String str, int i, int i2, int i3, int i4, int i5) {
        graphics.setColor(i5);
        graphics.drawString(str, i - 1, i2 - 1, i3);
        graphics.drawString(str, i, i2 - 1, i3);
        graphics.drawString(str, i - 1, i2, i3);
        graphics.drawString(str, i + 1, i2, i3);
        graphics.drawString(str, i, i2 + 1, i3);
        graphics.drawString(str, i + 1, i2 + 1, i3);
        graphics.setColor(i4);
        graphics.drawString(str, i, i2, i3);
    }

    /* renamed from: a */
    public static void m1299a(Graphics graphics, String str, int i, boolean z) {
        f1892l = 0;
        int i2 = (C0088t.f2524j << 1) + 35 + 24;
        int i3 = (C0088t.f2516b - 140) / 2;
        int i4 = (C0088t.f2517c - i2) / 2;
        m1326c(graphics, i3, i4, 140, i2, 0);
        m1326c(graphics, i3 + 20, i4 + 5 + C0088t.f2524j + 12, 100, C0088t.f2524j, 1);
        m1308a(f1876al, i3 + 20, i4 + 5 + C0088t.f2524j + 12, 100, C0088t.f2524j);
        m1298a(graphics, str, i3 + 70, i4 + 5, 17, 16776666, 0);
        if (i > 0) {
            m1297a(graphics, new StringBuffer().append("").append(i).toString(), i3 + 70, i4 + 6 + C0088t.f2524j + 12, 17, 16711639);
        }
        if (z && RunnableC0066a.f2085X != null && RunnableC0066a.f2086Y != null && RunnableC0066a.f2083V != null && RunnableC0066a.f2084W != null) {
            graphics.drawImage(RunnableC0066a.f2083V.f598a, ((140 - RunnableC0066a.f2083V.f599b) / 2) + i3, i4 + 7 + C0088t.f2524j, 20);
            m1308a(f1874aj[0], ((140 - RunnableC0066a.f2083V.f599b) / 2) + i3, i4 + 7 + C0088t.f2524j, RunnableC0066a.f2083V.f598a.getWidth(), RunnableC0066a.f2083V.f598a.getHeight());
            graphics.drawImage(RunnableC0066a.f2084W.f598a, ((140 - RunnableC0066a.f2083V.f599b) / 2) + i3, i4 + 5 + (C0088t.f2524j << 1) + 14, 20);
            m1308a(f1874aj[1], ((140 - RunnableC0066a.f2083V.f599b) / 2) + i3, i4 + 5 + (C0088t.f2524j << 1) + 14, RunnableC0066a.f2084W.f598a.getWidth(), RunnableC0066a.f2084W.f598a.getHeight());
            graphics.drawImage(RunnableC0066a.f2085X.f598a, i3 + 5, i4 + 5 + C0088t.f2524j + 12, 20);
            m1308a(f1874aj[2], i3 + 5, i4 + 5 + C0088t.f2524j + 12, RunnableC0066a.f2085X.f598a.getWidth(), RunnableC0066a.f2085X.f598a.getHeight());
            graphics.drawImage(RunnableC0066a.f2086Y.f598a, ((i3 + 140) - 5) - RunnableC0066a.f2086Y.f599b, i4 + 5 + C0088t.f2524j + 12, 20);
            m1308a(f1874aj[3], ((i3 + 140) - 5) - RunnableC0066a.f2086Y.f599b, i4 + 5 + C0088t.f2524j + 12, RunnableC0066a.f2086Y.f598a.getWidth(), RunnableC0066a.f2086Y.f598a.getHeight());
        }
        if (RunnableC0066a.f2081T == null || RunnableC0066a.f2082U == null) {
            return;
        }
        graphics.drawImage(RunnableC0066a.f2081T.f598a, i3 + 5, ((i4 + i2) - 5) - RunnableC0066a.f2081T.f600c, 20);
        m1308a(f1875ak[0], i3 + 5, ((i4 + i2) - 5) - RunnableC0066a.f2081T.f600c, RunnableC0066a.f2081T.f598a.getWidth(), RunnableC0066a.f2081T.f598a.getHeight());
        graphics.drawImage(RunnableC0066a.f2082U.f598a, ((i3 + 140) - 5) - RunnableC0066a.f2082U.f599b, ((i4 + i2) - 5) - RunnableC0066a.f2082U.f600c, 20);
        m1308a(f1875ak[1], ((i3 + 140) - 5) - RunnableC0066a.f2082U.f599b, ((i4 + i2) - 5) - RunnableC0066a.f2082U.f600c, RunnableC0066a.f2082U.f598a.getWidth(), RunnableC0066a.f2082U.f598a.getHeight());
    }

    /* renamed from: a */
    public static void m1300a(Graphics graphics, String str, long j, int i, int i2) {
        m1301a(graphics, str, j, i, i2, 20);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f2  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m1301a(Graphics graphics, String str, long j, int i, int i2, int i3) {
        if (f1892l >= 15) {
            if (f1892l == 15) {
                f1868ad = j >= 0 ? new StringBuffer().append("价格:").append(C0088t.m1677a(new StringBuffer(), j)).toString() : null;
                if (str != null) {
                    int iM1280a = m1280a(str) != -1 ? m1280a(str) : 15138723;
                    f1866ab = iM1280a;
                    if (iM1280a != 15138723) {
                        if (str.charAt(2) == '>') {
                            f1867ac = str.substring(3, str.length());
                        } else {
                            f1867ac = str.substring(4, str.length());
                        }
                    }
                    f1861X = Math.max(C0088t.f2523i.stringWidth(f1867ac), f1868ad != null ? 0 : C0088t.f2523i.stringWidth(f1868ad)) + 8;
                    f1862Y = ((f1868ad != null ? 1 : 2) * C0088t.f2524j) + 8;
                    f1863Z = i;
                    f1865aa = i2;
                    if (i3 != 40) {
                        if (f1863Z - f1861X < 0) {
                            m1293a(graphics, 1009050, 210, f1863Z, i2 - (f1862Y / 4), f1861X / 4, f1862Y / 4);
                        } else {
                            m1293a(graphics, 1009050, 210, f1863Z - (f1861X / 4), i2 - (f1862Y / 4), f1861X / 4, f1862Y / 4);
                        }
                    } else if (i3 == 36) {
                        if (f1863Z + f1861X > C0088t.f2520f + C0088t.f2518d) {
                            m1293a(graphics, 1009050, 210, f1863Z - (f1861X / 4), i2 - (f1862Y / 4), f1861X / 4, f1862Y / 4);
                        } else {
                            m1293a(graphics, 1009050, 210, f1863Z, i2 - (f1862Y / 4), f1861X / 4, f1862Y / 4);
                        }
                    } else if (i3 == 24) {
                        if (f1863Z - f1861X < 0) {
                            m1293a(graphics, 1009050, 210, f1863Z, i2, f1861X / 4, f1862Y / 4);
                        } else {
                            m1293a(graphics, 1009050, 210, f1863Z - (f1861X / 4), i2, f1861X / 4, f1862Y / 4);
                        }
                    } else if (f1861X + i <= C0088t.f2520f + C0088t.f2518d) {
                        m1293a(graphics, 1009050, 210, f1863Z, i2, f1861X / 4, f1862Y / 4);
                    } else {
                        m1293a(graphics, 1009050, 210, f1863Z - (f1861X / 4), i2, f1861X / 4, f1862Y / 4);
                    }
                } else {
                    f1866ab = 15138723;
                    str = "";
                }
                f1867ac = str;
                f1861X = Math.max(C0088t.f2523i.stringWidth(f1867ac), f1868ad != null ? 0 : C0088t.f2523i.stringWidth(f1868ad)) + 8;
                f1862Y = ((f1868ad != null ? 1 : 2) * C0088t.f2524j) + 8;
                f1863Z = i;
                f1865aa = i2;
                if (i3 != 40) {
                }
            } else if (f1892l == 16) {
                if (i3 == 40) {
                    if (f1863Z - f1861X < 0) {
                        m1293a(graphics, 1009050, 210, f1863Z, i2 - (f1862Y / 4), f1861X / 4, f1862Y / 4);
                    } else {
                        m1293a(graphics, 1009050, 210, f1863Z - (f1861X / 2), i2 - (f1862Y / 2), f1861X / 2, f1862Y / 2);
                    }
                } else if (i3 == 36) {
                    if (f1863Z + f1861X > C0088t.f2520f + C0088t.f2518d) {
                        m1293a(graphics, 1009050, 210, f1863Z - (f1861X / 2), i2 - (f1862Y / 2), f1861X / 2, f1862Y / 2);
                    } else {
                        m1293a(graphics, 1009050, 210, f1863Z, i2 - (f1862Y / 2), f1861X / 2, f1862Y / 2);
                    }
                } else if (i3 == 24) {
                    if (f1863Z - f1861X < 0) {
                        m1293a(graphics, 1009050, 210, f1863Z, i2, f1861X / 2, f1862Y / 2);
                    } else {
                        m1293a(graphics, 1009050, 210, f1863Z - (f1861X / 2), i2, f1861X / 2, f1862Y / 2);
                    }
                } else if (f1861X + i <= C0088t.f2520f + C0088t.f2518d) {
                    m1293a(graphics, 1009050, 210, f1863Z, i2, f1861X / 2, f1862Y / 2);
                } else {
                    m1293a(graphics, 1009050, 210, f1863Z - (f1861X / 2), i2, f1861X / 2, f1862Y / 4);
                }
            } else if (f1892l != 17) {
                graphics.setColor(16230);
                if (i3 == 40) {
                    if (f1863Z - f1861X < 0) {
                        m1293a(graphics, 1009050, 210, f1863Z, i2 - f1862Y, f1861X, f1862Y);
                        graphics.drawRect(f1863Z, i2 - f1862Y, f1861X, f1862Y);
                        graphics.setColor(f1866ab);
                        graphics.drawString(f1867ac, f1863Z + 4, (i2 - f1862Y) + 4, 20);
                        if (f1868ad != null) {
                            graphics.drawString(f1868ad, f1863Z + 4, (i2 - f1862Y) + 4 + C0088t.f2524j, 20);
                        }
                    } else {
                        m1293a(graphics, 1009050, 210, f1863Z - f1861X, i2 - f1862Y, f1861X, f1862Y);
                        graphics.drawRect(f1863Z - f1861X, i2 - f1862Y, f1861X, f1862Y);
                        graphics.setColor(f1866ab);
                        graphics.drawString(f1867ac, (f1863Z - f1861X) + 4, (i2 - f1862Y) + 4, 20);
                        if (f1868ad != null) {
                            graphics.drawString(f1868ad, (f1863Z - f1861X) + 4, (i2 - f1862Y) + 4 + C0088t.f2524j, 20);
                        }
                    }
                } else if (i3 == 36) {
                    if (f1863Z + f1861X > C0088t.f2520f + C0088t.f2518d) {
                        m1293a(graphics, 1009050, 210, f1863Z - f1861X, i2 - f1862Y, f1861X, f1862Y);
                        graphics.drawRect(f1863Z - f1861X, i2 - f1862Y, f1861X, f1862Y);
                        graphics.setColor(f1866ab);
                        graphics.drawString(f1867ac, (f1863Z - f1861X) + 4, (i2 - f1862Y) + 4, 20);
                        if (f1868ad != null) {
                            graphics.drawString(f1868ad, (f1863Z - f1861X) + 4, (i2 - f1862Y) + 4 + C0088t.f2524j, 20);
                        }
                    } else {
                        m1293a(graphics, 1009050, 210, f1863Z, i2 - f1862Y, f1861X, f1862Y);
                        graphics.drawRect(f1863Z, i2 - f1862Y, f1861X, f1862Y);
                        graphics.setColor(f1866ab);
                        graphics.drawString(f1867ac, f1863Z + 4, (i2 - f1862Y) + 4, 20);
                        if (f1868ad != null) {
                            graphics.drawString(f1868ad, f1863Z + 4, (i2 - f1862Y) + 4 + C0088t.f2524j, 20);
                        }
                    }
                } else if (i3 != 24) {
                    int i4 = f1863Z;
                    int i5 = f1865aa;
                    if (f1861X + i > C0088t.f2520f + C0088t.f2518d && (i4 = i4 - f1861X) < 0) {
                        i4 = 0;
                    }
                    m1293a(graphics, 1009050, 210, i4, i5, f1861X, f1862Y);
                    graphics.drawRect(i4, i5, f1861X, f1862Y);
                    graphics.setColor(f1866ab);
                    graphics.drawString(f1867ac, i4 + 4, i5 + 4, 20);
                    if (f1868ad != null) {
                        graphics.drawString(f1868ad, i4 + 4, i5 + 4 + C0088t.f2524j, 20);
                    }
                } else if (f1863Z - f1861X < 0) {
                    m1293a(graphics, 1009050, 210, f1863Z, i2, f1861X, f1862Y);
                    graphics.drawRect(f1863Z, i2, f1861X, f1862Y);
                    graphics.setColor(f1866ab);
                    graphics.drawString(f1867ac, f1863Z + 4, i2 + 4, 20);
                    if (f1868ad != null) {
                        graphics.drawString(f1868ad, f1863Z + 4, i2 + 4 + C0088t.f2524j, 20);
                    }
                } else {
                    m1293a(graphics, 1009050, 210, f1863Z - f1861X, i2, f1861X, f1862Y);
                    graphics.drawRect(f1863Z - f1861X, i2, f1861X, f1862Y);
                    graphics.setColor(f1866ab);
                    graphics.drawString(f1867ac, (f1863Z - f1861X) + 4, i2 + 4, 20);
                    if (f1868ad != null) {
                        graphics.drawString(f1868ad, (f1863Z - f1861X) + 4, i2 + 4 + C0088t.f2524j, 20);
                    }
                }
            } else if (i3 == 40) {
                if (f1863Z - f1861X < 0) {
                    m1293a(graphics, 1009050, 210, f1863Z, i2 - (f1862Y / 2), f1861X / 2, f1862Y / 2);
                } else {
                    m1293a(graphics, 1009050, 210, f1863Z - ((f1861X / 4) * 3), i2 - ((f1862Y / 4) * 3), (f1861X / 4) * 3, (f1862Y / 4) * 3);
                }
            } else if (i3 == 36) {
                if (f1863Z + f1861X > C0088t.f2520f + C0088t.f2518d) {
                    m1293a(graphics, 1009050, 210, f1863Z - ((f1861X / 4) * 3), i2 - ((f1862Y / 4) * 3), (f1861X / 4) * 3, (f1862Y / 4) * 3);
                } else {
                    m1293a(graphics, 1009050, 210, f1863Z, i2 - ((f1862Y / 4) * 3), (f1861X / 4) * 3, (f1862Y / 4) * 3);
                }
            } else if (i3 == 24) {
                if (f1863Z - f1861X < 0) {
                    m1293a(graphics, 1009050, 210, f1863Z, i2, (f1861X / 4) * 3, (f1862Y / 4) * 3);
                } else {
                    m1293a(graphics, 1009050, 210, f1863Z - ((f1861X / 4) * 3), i2, (f1861X / 4) * 3, (f1862Y / 4) * 3);
                }
            } else if (f1861X + i <= C0088t.f2520f + C0088t.f2518d) {
                m1293a(graphics, 1009050, 210, f1863Z, i2, (f1861X / 4) * 3, (f1862Y / 4) * 3);
            } else {
                m1293a(graphics, 1009050, 210, f1863Z - ((f1861X / 4) * 3), i2, (f1861X / 4) * 3, (f1862Y / 4) * 3);
            }
        }
        f1892l++;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x023c  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m1302a(Graphics graphics, String str, String str2, int i, int i2, int i3) {
        if (f1892l >= 15) {
            if (f1892l == 15) {
                f1861X = C0088t.f2516b - 30;
                if (str2.equals("")) {
                    f1869ae = null;
                } else {
                    f1869ae = new C0050bw(str2, (short) (f1861X - 8));
                }
                if (str != null) {
                    int iM1280a = m1280a(str) != -1 ? m1280a(str) : 15138723;
                    f1866ab = iM1280a;
                    if (iM1280a != 15138723) {
                        str = str.substring(3, str.length());
                    }
                    f1867ac = str;
                } else {
                    f1866ab = 15138723;
                    f1867ac = "";
                }
                int iStringWidth = C0088t.f2523i.stringWidth(f1867ac) + 8;
                if (f1869ae != null) {
                    iStringWidth = f1869ae.f1789a <= 0 ? f1861X : Math.max(iStringWidth, f1869ae.f1789a + 8);
                }
                f1861X = iStringWidth;
                f1862Y = ((f1869ae == null ? 1 : f1869ae.m1015a() + 1) * C0088t.f2524j) + 8;
                if (f1861X + i > C0088t.f2516b) {
                    i = C0088t.f2516b - f1861X;
                } else if (i < 0) {
                    i = 0;
                }
                int i4 = f1862Y + i2 > C0088t.f2517c ? C0088t.f2517c - f1862Y : i2 < 0 ? 0 : i2;
                f1863Z = i;
                if (i3 == 40) {
                    if (f1863Z - f1861X < 0) {
                        if (i4 < f1862Y) {
                            m1293a(graphics, 1009050, 210, f1863Z, i4, f1861X / 4, f1862Y / 4);
                        } else {
                            m1293a(graphics, 1009050, 210, f1863Z, i4 - (f1862Y / 4), f1861X / 4, f1862Y / 4);
                        }
                    } else if (i4 < f1862Y) {
                        m1293a(graphics, 1009050, 210, f1863Z, i4, f1861X / 4, f1862Y / 4);
                    } else {
                        m1293a(graphics, 1009050, 210, f1863Z - (f1861X / 4), i4 - (f1862Y / 4), f1861X / 4, f1862Y / 4);
                    }
                } else if (i3 == 36) {
                    if (f1863Z + f1861X > C0088t.f2516b) {
                        if (i4 >= f1862Y) {
                            m1293a(graphics, 1009050, 210, f1863Z - (f1861X / 4), i4 - (f1862Y / 4), f1861X / 4, f1862Y / 4);
                        } else {
                            m1293a(graphics, 1009050, 210, f1863Z - (f1861X / 4), i4, f1861X / 4, f1862Y / 4);
                        }
                    } else if (i4 < f1862Y) {
                        m1293a(graphics, 1009050, 210, f1863Z, i4, f1861X / 4, f1862Y / 4);
                    } else {
                        m1293a(graphics, 1009050, 210, f1863Z, i4 - (f1862Y / 4), f1861X / 4, f1862Y / 4);
                    }
                } else if (i3 == 24) {
                    if (f1863Z - f1861X < 0) {
                        if (f1862Y + i4 >= C0088t.f2517c) {
                            m1293a(graphics, 1009050, 210, f1863Z, i4 - (f1862Y / 4), f1861X / 4, f1862Y / 4);
                        } else {
                            m1293a(graphics, 1009050, 210, f1863Z, i4, f1861X / 4, f1862Y / 4);
                        }
                    } else if (f1862Y + i4 >= C0088t.f2517c) {
                        m1293a(graphics, 1009050, 210, f1863Z, i4 - (f1862Y / 4), f1861X / 4, f1862Y / 4);
                    } else {
                        m1293a(graphics, 1009050, 210, f1863Z - (f1861X / 4), i4, f1861X / 4, f1862Y / 4);
                    }
                } else if (f1861X + i <= C0088t.f2516b) {
                    if (f1862Y + i4 >= C0088t.f2517c) {
                        m1293a(graphics, 1009050, 210, f1863Z - (f1861X / 4), i4 - (f1862Y / 4), f1861X / 4, f1862Y / 4);
                    } else {
                        m1293a(graphics, 1009050, 210, f1863Z, i4, f1861X / 4, f1862Y / 4);
                    }
                } else if (f1862Y + i4 >= C0088t.f2517c) {
                    m1293a(graphics, 1009050, 210, f1863Z - (f1861X / 4), i4 - (f1862Y / 4), f1861X / 4, f1862Y / 4);
                }
            } else if (f1892l == 16) {
                if (i3 == 40) {
                    if (f1863Z - f1861X < 0) {
                        if (i2 < f1862Y) {
                            m1293a(graphics, 1009050, 210, f1863Z, i2, f1861X / 4, f1862Y / 4);
                        } else {
                            m1293a(graphics, 1009050, 210, f1863Z, i2 - (f1862Y / 4), f1861X / 4, f1862Y / 4);
                        }
                    } else if (i2 < f1862Y) {
                        m1293a(graphics, 1009050, 210, f1863Z, i2, f1861X / 2, f1862Y / 2);
                    } else {
                        m1293a(graphics, 1009050, 210, f1863Z - (f1861X / 2), i2 - (f1862Y / 2), f1861X / 2, f1862Y / 2);
                    }
                } else if (i3 == 36) {
                    if (f1863Z + f1861X > C0088t.f2516b) {
                        if (i2 < f1862Y) {
                            m1293a(graphics, 1009050, 210, f1863Z - (f1861X / 2), i2, f1861X / 2, f1862Y / 2);
                        } else {
                            m1293a(graphics, 1009050, 210, f1863Z - (f1861X / 2), i2 - (f1862Y / 2), f1861X / 2, f1862Y / 2);
                        }
                    } else if (i2 < f1862Y) {
                        m1293a(graphics, 1009050, 210, f1863Z, i2, f1861X / 2, f1862Y / 2);
                    } else {
                        m1293a(graphics, 1009050, 210, f1863Z, i2 - (f1862Y / 2), f1861X / 2, f1862Y / 2);
                    }
                } else if (i3 == 24) {
                    if (f1863Z - f1861X < 0) {
                        if (f1862Y + i2 >= C0088t.f2517c) {
                            m1293a(graphics, 1009050, 210, f1863Z, i2 - (f1862Y / 2), f1861X / 2, f1862Y / 2);
                        } else {
                            m1293a(graphics, 1009050, 210, f1863Z, i2, f1861X / 2, f1862Y / 2);
                        }
                    } else if (f1862Y + i2 >= C0088t.f2517c) {
                        m1293a(graphics, 1009050, 210, f1863Z, i2 - (f1862Y / 2), f1861X / 2, f1862Y / 2);
                    } else {
                        m1293a(graphics, 1009050, 210, f1863Z - (f1861X / 2), i2, f1861X / 2, f1862Y / 2);
                    }
                } else if (f1861X + i <= C0088t.f2516b) {
                    if (f1862Y + i2 >= C0088t.f2517c) {
                        m1293a(graphics, 1009050, 210, f1863Z - (f1861X / 2), i2 - (f1862Y / 2), f1861X / 2, f1862Y / 2);
                    } else {
                        m1293a(graphics, 1009050, 210, f1863Z, i2, f1861X / 2, f1862Y / 2);
                    }
                } else if (f1862Y + i2 >= C0088t.f2517c) {
                    m1293a(graphics, 1009050, 210, f1863Z - (f1861X / 2), i2 - (f1862Y / 2), f1861X / 2, f1862Y / 4);
                } else {
                    m1293a(graphics, 1009050, 210, f1863Z - (f1861X / 2), i2, f1861X / 2, f1862Y / 4);
                }
            } else if (f1892l != 17) {
                graphics.setColor(16230);
                if (i3 == 40) {
                    if (f1863Z - f1861X < 0) {
                        if (i2 < f1862Y) {
                            m1293a(graphics, 1009050, 210, f1863Z, i2, f1861X, f1862Y);
                            graphics.drawRect(f1863Z, i2, f1861X, f1862Y);
                            graphics.setColor(f1866ab);
                            graphics.drawString(f1867ac, f1863Z + 4, i2 + 4, 20);
                            if (f1869ae != null) {
                                f1869ae.m1017a(graphics, f1863Z + 4, i2 + 4 + C0088t.f2524j, 0);
                            }
                        } else {
                            m1293a(graphics, 1009050, 210, f1863Z, i2 - f1862Y, f1861X, f1862Y);
                            graphics.drawRect(f1863Z, i2 - f1862Y, f1861X, f1862Y);
                            graphics.setColor(f1866ab);
                            graphics.drawString(f1867ac, f1863Z + 4, (i2 - f1862Y) + 4, 20);
                            if (f1869ae != null) {
                                f1869ae.m1017a(graphics, f1863Z + 4, (i2 - f1862Y) + 4 + C0088t.f2524j, 0);
                            }
                        }
                    } else if (i2 < f1862Y) {
                        m1293a(graphics, 1009050, 210, f1863Z, i2, f1861X, f1862Y);
                        graphics.drawRect(f1863Z, i2, f1861X, f1862Y);
                        graphics.setColor(f1866ab);
                        graphics.drawString(f1867ac, f1863Z + 4, i2 + 4, 20);
                        if (f1869ae != null) {
                            f1869ae.m1017a(graphics, f1863Z + 4, i2 + 4 + C0088t.f2524j, 0);
                        }
                    } else {
                        m1293a(graphics, 1009050, 210, f1863Z - f1861X, i2 - f1862Y, f1861X, f1862Y);
                        graphics.drawRect(f1863Z - f1861X, i2 - f1862Y, f1861X, f1862Y);
                        graphics.setColor(f1866ab);
                        graphics.drawString(f1867ac, (f1863Z - f1861X) + 4, (i2 - f1862Y) + 4, 20);
                        if (f1869ae != null) {
                            f1869ae.m1017a(graphics, (f1863Z - f1861X) + 4, (i2 - f1862Y) + 4 + C0088t.f2524j, 0);
                        }
                    }
                } else if (i3 == 36) {
                    if (f1863Z + f1861X > C0088t.f2516b) {
                        if (i2 < f1862Y) {
                            m1293a(graphics, 1009050, 210, f1863Z, i2, f1861X, f1862Y);
                            graphics.drawRect(f1863Z, i2, f1861X, f1862Y);
                            graphics.setColor(f1866ab);
                            graphics.drawString(f1867ac, f1863Z + 4, i2 + 4, 20);
                            if (f1869ae != null) {
                                f1869ae.m1017a(graphics, f1863Z + 4, i2 + 4 + C0088t.f2524j, 0);
                            }
                        } else {
                            m1293a(graphics, 1009050, 210, f1863Z - f1861X, i2 - f1862Y, f1861X, f1862Y);
                            graphics.drawRect(f1863Z - f1861X, i2 - f1862Y, f1861X, f1862Y);
                            graphics.setColor(f1866ab);
                            graphics.drawString(f1867ac, (f1863Z - f1861X) + 4, (i2 - f1862Y) + 4, 20);
                            if (f1869ae != null) {
                                f1869ae.m1017a(graphics, (f1863Z - f1861X) + 4, (i2 - f1862Y) + 4 + C0088t.f2524j, 0);
                            }
                        }
                    } else if (i2 < f1862Y) {
                        m1293a(graphics, 1009050, 210, f1863Z, i2, f1861X, f1862Y);
                        graphics.drawRect(f1863Z, i2, f1861X, f1862Y);
                        graphics.setColor(f1866ab);
                        graphics.drawString(f1867ac, f1863Z + 4, i2 + 4, 20);
                        if (f1869ae != null) {
                            f1869ae.m1017a(graphics, f1863Z + 4, i2 + 4 + C0088t.f2524j, 0);
                        }
                    } else {
                        m1293a(graphics, 1009050, 210, f1863Z, i2 - f1862Y, f1861X, f1862Y);
                        graphics.drawRect(f1863Z, i2 - f1862Y, f1861X, f1862Y);
                        graphics.setColor(f1866ab);
                        graphics.drawString(f1867ac, f1863Z + 4, (i2 - f1862Y) + 4, 20);
                        if (f1869ae != null) {
                            f1869ae.m1017a(graphics, f1863Z + 4, (i2 - f1862Y) + 4 + C0088t.f2524j, 0);
                        }
                    }
                } else if (i3 == 24) {
                    if (f1863Z - f1861X < 0) {
                        if (f1862Y + i2 >= C0088t.f2517c) {
                            m1293a(graphics, 1009050, 210, f1863Z, i2 - f1862Y, f1861X, f1862Y);
                            graphics.drawRect(f1863Z, i2 - f1862Y, f1861X, f1862Y);
                            graphics.setColor(f1866ab);
                            graphics.drawString(f1867ac, f1863Z + 4, (i2 + 4) - f1862Y, 20);
                            if (f1869ae != null) {
                                f1869ae.m1017a(graphics, f1863Z + 4, ((i2 + 4) + C0088t.f2524j) - f1862Y, 0);
                            }
                        } else {
                            m1293a(graphics, 1009050, 210, f1863Z, i2, f1861X, f1862Y);
                            graphics.drawRect(f1863Z, i2, f1861X, f1862Y);
                            graphics.setColor(f1866ab);
                            graphics.drawString(f1867ac, f1863Z + 4, i2 + 4, 20);
                            if (f1869ae != null) {
                                f1869ae.m1017a(graphics, f1863Z + 4, i2 + 4 + C0088t.f2524j, 0);
                            }
                        }
                    } else if (f1862Y + i2 >= C0088t.f2517c) {
                        m1293a(graphics, 1009050, 210, f1863Z, i2 - f1862Y, f1861X, f1862Y);
                        graphics.drawRect(f1863Z, i2 - f1862Y, f1861X, f1862Y);
                        graphics.setColor(f1866ab);
                        graphics.drawString(f1867ac, f1863Z + 4, (i2 + 4) - f1862Y, 20);
                        if (f1869ae != null) {
                            f1869ae.m1017a(graphics, f1863Z + 4, ((i2 + 4) + C0088t.f2524j) - f1862Y, 0);
                        }
                    } else {
                        m1293a(graphics, 1009050, 210, f1863Z - f1861X, i2, f1861X, f1862Y);
                        graphics.drawRect(f1863Z - f1861X, i2, f1861X, f1862Y);
                        graphics.setColor(f1866ab);
                        graphics.drawString(f1867ac, (f1863Z - f1861X) + 4, i2 + 4, 20);
                        if (f1869ae != null) {
                            f1869ae.m1017a(graphics, (f1863Z - f1861X) + 4, i2 + 4 + C0088t.f2524j, 0);
                        }
                    }
                } else if (f1861X + i <= C0088t.f2516b) {
                    if (f1862Y + i2 >= C0088t.f2517c) {
                        m1293a(graphics, 1009050, 210, f1863Z - f1861X, i2 - f1862Y, f1861X, f1862Y);
                        graphics.drawRect(f1863Z - f1861X, i2 - f1862Y, f1861X, f1862Y);
                        graphics.setColor(f1866ab);
                        graphics.drawString(f1867ac, (f1863Z + 4) - f1861X, (i2 + 4) - f1862Y, 20);
                        if (f1869ae != null) {
                            f1869ae.m1017a(graphics, (f1863Z + 4) - f1861X, ((i2 + 4) + C0088t.f2524j) - f1862Y, 0);
                        }
                    } else {
                        m1293a(graphics, 1009050, 210, f1863Z, i2, f1861X, f1862Y);
                        graphics.drawRect(f1863Z, i2, f1861X, f1862Y);
                        graphics.setColor(f1866ab);
                        graphics.drawString(f1867ac, f1863Z + 4, i2 + 4, 20);
                        if (f1869ae != null) {
                            f1869ae.m1017a(graphics, f1863Z + 4, i2 + 4 + C0088t.f2524j, 0);
                        }
                    }
                } else if (f1862Y + i2 >= C0088t.f2517c) {
                    m1293a(graphics, 1009050, 210, f1863Z - f1861X, i2 - f1862Y, f1861X, f1862Y);
                    if (f1863Z < f1861X) {
                        f1863Z = f1861X;
                    }
                    graphics.drawRect(f1863Z - f1861X, i2 - f1862Y, f1861X, f1862Y);
                    graphics.setColor(f1866ab);
                    graphics.drawString(f1867ac, (f1863Z - f1861X) + 4, (i2 + 4) - f1862Y, 20);
                    if (f1869ae != null) {
                        f1869ae.m1017a(graphics, (f1863Z - f1861X) + 4, ((i2 + 4) + C0088t.f2524j) - f1862Y, 0);
                    }
                } else {
                    m1293a(graphics, 1009050, 210, f1863Z - f1861X, i2, f1861X, f1862Y);
                    graphics.drawRect(f1863Z - f1861X, i2, f1861X, f1862Y);
                    graphics.setColor(f1866ab);
                    graphics.drawString(f1867ac, (f1863Z - f1861X) + 4, i2 + 4, 20);
                    if (f1869ae != null) {
                        f1869ae.m1017a(graphics, (f1863Z - f1861X) + 4, i2 + 4 + C0088t.f2524j, 0);
                    }
                }
            } else if (i3 == 40) {
                if (f1863Z - f1861X < 0) {
                    if (i2 < f1862Y) {
                        m1293a(graphics, 1009050, 210, f1863Z, i2, f1861X / 2, f1862Y / 2);
                    } else {
                        m1293a(graphics, 1009050, 210, f1863Z, i2 - (f1862Y / 2), f1861X / 2, f1862Y / 2);
                    }
                } else if (i2 < f1862Y) {
                    m1293a(graphics, 1009050, 210, f1863Z, i2, (f1861X / 4) * 3, (f1862Y / 4) * 3);
                } else {
                    m1293a(graphics, 1009050, 210, f1863Z - ((f1861X / 4) * 3), i2 - ((f1862Y / 4) * 3), (f1861X / 4) * 3, (f1862Y / 4) * 3);
                }
            } else if (i3 == 36) {
                if (f1863Z + f1861X > C0088t.f2516b) {
                    if (i2 < f1862Y) {
                        m1293a(graphics, 1009050, 210, f1863Z - ((f1861X / 4) * 3), i2, (f1861X / 4) * 3, (f1862Y / 4) * 3);
                    } else {
                        m1293a(graphics, 1009050, 210, f1863Z - ((f1861X / 4) * 3), i2 - ((f1862Y / 4) * 3), (f1861X / 4) * 3, (f1862Y / 4) * 3);
                    }
                } else if (i2 < f1862Y) {
                    m1293a(graphics, 1009050, 210, f1863Z, i2, (f1861X / 4) * 3, (f1862Y / 4) * 3);
                } else {
                    m1293a(graphics, 1009050, 210, f1863Z, i2 - ((f1862Y / 4) * 3), (f1861X / 4) * 3, (f1862Y / 4) * 3);
                }
            } else if (i3 == 24) {
                if (f1863Z - f1861X < 0) {
                    if (f1862Y + i2 >= C0088t.f2517c) {
                        m1293a(graphics, 1009050, 210, f1863Z, i2 - ((f1862Y / 4) * 3), (f1861X / 4) * 3, (f1862Y / 4) * 3);
                    } else {
                        m1293a(graphics, 1009050, 210, f1863Z, i2, (f1861X / 4) * 3, (f1862Y / 4) * 3);
                    }
                } else if (f1862Y + i2 >= C0088t.f2517c) {
                    m1293a(graphics, 1009050, 210, f1863Z, i2 - ((f1862Y / 4) * 3), (f1861X / 4) * 3, (f1862Y / 4) * 3);
                } else {
                    m1293a(graphics, 1009050, 210, f1863Z - ((f1861X / 4) * 3), i2, (f1861X / 4) * 3, (f1862Y / 4) * 3);
                }
            } else if (f1861X + i <= C0088t.f2516b) {
                if (f1862Y + i2 >= C0088t.f2517c) {
                    m1293a(graphics, 1009050, 210, f1863Z - ((f1861X / 4) * 3), i2 - ((f1862Y / 4) * 3), (f1861X / 4) * 3, (f1862Y / 4) * 3);
                } else {
                    m1293a(graphics, 1009050, 210, f1863Z, i2, (f1861X / 4) * 3, (f1862Y / 4) * 3);
                }
            } else if (f1862Y + i2 >= C0088t.f2517c) {
                m1293a(graphics, 1009050, 210, f1863Z - ((f1861X / 4) * 3), i2 - ((f1862Y / 4) * 3), (f1861X / 4) * 3, (f1862Y / 4) * 3);
            } else {
                m1293a(graphics, 1009050, 210, f1863Z - ((f1861X / 4) * 3), i2, (f1861X / 4) * 3, (f1862Y / 4) * 3);
            }
        }
        f1892l++;
    }

    /* renamed from: a */
    public static void m1303a(Graphics graphics, String str, String[] strArr) {
        if (str == null) {
            return;
        }
        f1892l = 0;
        graphics.setClip(0, 0, C0088t.f2516b, C0088t.f2517c);
        if (f1888h >= 0) {
            if (f1888h == 0) {
                String[] strArrM1311a = m1311a(str, C0088t.f2523i, C0088t.f2516b - 10, "\t");
                f1845H = strArrM1311a;
                f1846I = ((strArrM1311a.length + 1) * C0088t.f2524j) + 20;
                m1291a(graphics, (C0088t.f2516b / 2) * 3, (C0088t.f2517c - (f1846I / 4)) / 2, C0088t.f2516b / 4, f1846I / 4);
                f1847J = new int[strArr.length][4];
            } else if (f1888h == 1) {
                m1291a(graphics, C0088t.f2516b / 4, (C0088t.f2517c - (f1846I / 2)) / 2, C0088t.f2516b / 2, f1846I / 2);
            } else if (f1888h == 2) {
                m1291a(graphics, C0088t.f2516b / 8, (C0088t.f2517c - ((f1846I / 4) * 3)) / 2, (C0088t.f2516b / 4) * 3, (f1846I / 4) * 3);
            } else {
                m1291a(graphics, 0, (C0088t.f2517c - f1846I) / 2, C0088t.f2516b, f1846I);
                if (f1845H != null) {
                    if (f1845H.length == 1) {
                        m1298a(graphics, f1845H[0], (C0088t.f2516b - C0088t.f2523i.stringWidth(f1845H[0])) / 2, ((C0088t.f2517c - f1846I) / 2) + 10, 20, 16777215, 0);
                    } else {
                        for (int i = 0; i < f1845H.length; i++) {
                            m1298a(graphics, f1845H[i], (C0088t.f2516b - C0088t.f2523i.stringWidth(f1845H[i])) / 2, (C0088t.f2524j * i) + ((C0088t.f2517c - f1846I) / 2) + 10, 20, 16777215, 0);
                        }
                    }
                }
                if (f1847J == null) {
                    f1888h = 0;
                    return;
                } else if (strArr.length == 2) {
                    m1287a(strArr[0], 0, 10, ((((C0088t.f2517c - f1846I) / 2) + f1846I) - 9) - C0088t.f2524j);
                    m1298a(graphics, strArr[0], f1847J[0][0], f1847J[0][1], 20, 16775357, 0);
                    m1287a(strArr[1], 1, (C0088t.f2516b - 10) - C0088t.f2523i.stringWidth(strArr[1]), ((((C0088t.f2517c - f1846I) / 2) + f1846I) - 9) - C0088t.f2524j);
                    m1298a(graphics, strArr[1], f1847J[1][0], f1847J[1][1], 20, 16775357, 0);
                } else {
                    m1287a(strArr[0], 0, (C0088t.f2516b - C0088t.f2523i.stringWidth(strArr[0])) / 2, ((((C0088t.f2517c - f1846I) / 2) + f1846I) - 9) - C0088t.f2524j);
                    m1298a(graphics, strArr[0], f1847J[0][0], f1847J[0][0], 20, 16775357, 0);
                }
            }
        }
        f1888h++;
    }

    /* renamed from: a */
    public static void m1304a(Graphics graphics, Image image) {
        if (f1878an == null || image == null) {
            return;
        }
        graphics.setColor(0);
        graphics.fillRect(0, 0, C0088t.f2516b, C0088t.f2517c);
        if (f1880ap != null) {
            f1880ap.m1017a(graphics, C0088t.f2516b / 2, 20, 17);
        }
        graphics.setColor(16777215);
        graphics.drawString("正在载入资源...", C0088t.f2516b / 2, C0088t.f2517c / 2, 17);
        graphics.setColor(14459464);
        graphics.drawString(new StringBuffer().append((f1838A * 100) / 100).append("%").toString(), C0088t.f2516b / 2, f1878an[1] + 10, 17);
        graphics.drawImage(image, f1878an[0] - 5, f1878an[1] - 4, 20);
        graphics.setColor(16382066);
        graphics.fillRect(f1878an[0], f1878an[1], (f1838A * 100) / 100, 3);
        graphics.setColor(14459464);
        graphics.fillRect(f1878an[0], f1878an[1] + 1, (f1838A * 100) / 100, 2);
        int i = f1838A + 1;
        f1838A = i;
        f1838A = i <= 100 ? f1838A : 100;
    }

    /* renamed from: a */
    public static void m1305a(Graphics graphics, Image image, int i, int i2, int i3, int i4, boolean z) {
        graphics.setColor(409969);
        graphics.fillRect(i, i2, i3, i4);
        if (z) {
            graphics.setColor(6597852);
        } else {
            graphics.setColor(5018307);
        }
        graphics.fillRect(i + 3, i2 + 3, i3 - 6, i4 - 6);
        if (z) {
            graphics.setColor(16775125);
        } else {
            graphics.setColor(3775208);
        }
        graphics.drawRect(i + 1, i2 + 1, i3 - 3, i4 - 3);
    }

    /* renamed from: a */
    public static void m1306a(Graphics graphics, Image image, short s, int i, int i2, int i3, int i4) {
        graphics.setClip(i, i2, i3, i4);
        int i5 = (i3 / s) + (i3 % s != 0 ? 1 : 0);
        for (int i6 = 0; i6 < i5; i6++) {
            graphics.drawImage(image, (i6 * s) + i, i2, 20);
        }
        graphics.setClip(0, 0, C0088t.f2516b, C0088t.f2517c);
    }

    /* renamed from: a */
    public static void m1307a(int[] iArr) {
        f1872ah = iArr;
    }

    /* renamed from: a */
    private static void m1308a(int[] iArr, int i, int i2, int i3, int i4) {
        if (iArr != null) {
            iArr[0] = i;
            iArr[1] = i2;
            iArr[2] = i3;
            iArr[3] = i4;
        }
    }

    /* renamed from: a */
    private static String[] m1309a(String str, String str2) {
        int iIndexOf;
        String[] strArrM1313a = new String[0];
        do {
            iIndexOf = str.indexOf(str2);
            if (iIndexOf < 0) {
                return m1313a(strArrM1313a, str);
            }
            strArrM1313a = m1313a(strArrM1313a, str.substring(0, iIndexOf));
            str = str.substring(str2.length() + iIndexOf);
        } while (iIndexOf >= 0);
        return strArrM1313a;
    }

    /* renamed from: a */
    public static String[] m1310a(String str, Font font, int i) {
        Vector vector = new Vector();
        do {
            String strM1323c = m1323c(str, font, i);
            vector.addElement(strM1323c);
            str = str.substring(strM1323c.length());
        } while (str.length() != 0);
        String[] strArr = new String[vector.size()];
        vector.copyInto(strArr);
        return m1312a(strArr);
    }

    /* renamed from: a */
    public static String[] m1311a(String str, Font font, int i, String str2) {
        if (str == null) {
            str = "";
        }
        Vector vector = new Vector();
        String[] strings = m1309a(str, str2);
        for (int i1 = 0; i1 < strings.length; i1++) {
            String strSubstring = strings[i1];
            do {
                String strM1316b = m1316b(strSubstring, font, i);
                vector.addElement(strM1316b);
                strSubstring = strSubstring.substring(strM1316b.length());
            } while (strSubstring.length() != 0);
        }
        String[] strArr = new String[vector.size()];
        vector.copyInto(strArr);
        return m1312a(strArr);
    }

    /* renamed from: a */
    private static String[] m1312a(String[] strArr) {
        Vector vector = new Vector();
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i] != null && !strArr[i].equals("")) {
                vector.addElement(strArr[i]);
            }
        }
        String[] strArr2 = new String[vector.size()];
        vector.copyInto(strArr2);
        return strArr2;
    }

    /* renamed from: a */
    private static String[] m1313a(String[] strArr, String str) {
        if (str == null) {
            return strArr;
        }
        if (strArr == null) {
            return new String[]{str};
        }
        String[] strArr2 = new String[strArr.length + 1];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        strArr2[strArr2.length - 1] = str;
        return strArr2;
    }

    /* renamed from: b */
    public static int m1314b(int i, int i2) {
        if (f1847J == null) {
            return 0;
        }
        if (f1847J.length < 1 || i < f1847J[0][0] || i > f1847J[0][0] + f1847J[0][2] || i2 < f1847J[0][1] || i2 > f1847J[0][1] + f1847J[0][3]) {
            return (f1847J.length != 2 || i < f1847J[1][0] || i > f1847J[1][0] + f1847J[1][2] || i2 < f1847J[1][1] || i2 > f1847J[1][1] + f1847J[1][3]) ? 0 : 536870912;
        }
        return 268435456;
    }

    /* renamed from: b */
    private static int m1315b(String str) throws NumberFormatException {
        int i = -1;
        try {
            i = Integer.parseInt(str);
        } catch (Exception e) {
        }
        if (i < 0 || i >= f1894n.length) {
            return 15138723;
        }
        return f1894n[i];
    }

    /* renamed from: b */
    private static String m1316b(String str, Font font, int i) {
        int iStringWidth = font.stringWidth(str);
        return iStringWidth <= i ? str : m1316b(str.substring(0, (str.length() * i) / iStringWidth), font, i);
    }

    /* renamed from: b */
    public static void m1317b(int i) {
        int i2;
        int length;
        if (i == 1) {
            if (f1895o <= 0) {
                length = f1896p.length - 1;
            } else {
                length = f1895o - 1;
                f1895o = length;
            }
            f1895o = length;
            return;
        }
        if (i == 4) {
            if (f1895o >= f1896p.length - 1) {
                i2 = 0;
            } else {
                i2 = f1895o + 1;
                f1895o = i2;
            }
            f1895o = i2;
        }
    }

    /* renamed from: b */
    public static void m1318b(Graphics graphics) {
        graphics.setClip(0, 0, C0088t.f2516b, C0088t.f2517c);
        m1293a(graphics, 1808583, 95, f1850M, f1851N - (C0088t.f2524j + 4), f1852O, C0088t.f2524j + 8 + 18);
        graphics.setColor(26540);
        graphics.drawRect(f1850M, f1851N - (C0088t.f2524j + 4), f1852O, C0088t.f2524j + 8 + 18);
        graphics.drawRect(f1850M + 2, f1851N - (C0088t.f2524j + 2), f1852O - 4, C0088t.f2524j + 8 + 14);
        graphics.setColor(11267556);
        graphics.drawRect(f1850M + 1, f1851N - (C0088t.f2524j + 3), f1852O - 2, C0088t.f2524j + 8 + 16);
        m1298a(graphics, f1854Q, f1853P, f1851N, 36, 16777215, 727632);
        graphics.setColor(539727);
        graphics.fillRect(f1850M + 2, f1851N, f1852O - 4, 18);
        graphics.setColor(4448748);
        graphics.drawRect(f1850M + 3, f1851N + 1, f1852O - 6, 15);
        graphics.setColor(1265510);
        graphics.fillRect(f1850M + 4, f1851N + 3, f1852O - 8, 12);
        graphics.setClip(f1850M + 4, f1851N + 3, f1852O - 8, 12);
        int i = ((f1850M + 3) + (f1892l % (f1852O + 15))) - 20;
        int i2 = f1851N + 3;
        graphics.setColor(4432868);
        graphics.fillRect(i + 1, i2 + 1, 23, 10);
        graphics.setColor(10738430);
        graphics.fillRect(i + 2, i2 + 3, 21, 5);
        graphics.setColor(15333119);
        graphics.drawLine(i + 2, i2 + 5, i + 22, i2 + 5);
        graphics.setColor(26540);
        graphics.drawRect(i, i2, 24, 11);
        graphics.drawLine(i + 12, i2, i + 12, i2 + 12);
        graphics.setClip(0, 0, C0088t.f2516b, C0088t.f2517c);
        f1892l += 2;
    }

    /* renamed from: b */
    public static void m1319b(Graphics graphics, int i, int i2, int i3, int i4) {
        m1289a(graphics, 2);
        graphics.fillRect(i, i2, 5, i4 - i2);
        m1289a(graphics, 3);
        graphics.fillRect(i + 1, i2, 3, i4 - i2);
        m1289a(graphics, 4);
        graphics.drawLine(i + 2, i2, i3 + 2, i4 - 1);
    }

    /* renamed from: b */
    public static void m1320b(Graphics graphics, int i, int i2, int i3, int i4, int i5) {
        graphics.setColor(i);
        int iAbs = Math.abs(i4);
        int i6 = i4 / iAbs;
        for (int i7 = 0; i7 < iAbs; i7++) {
            graphics.drawLine((i7 * i6) + i2, i3 - i7, (i7 * i6) + i2, i3 + i7);
        }
    }

    /* renamed from: b */
    public static void m1321b(Graphics graphics, String str, int i, int i2, int i3, int i4) {
        if (str == null || i4 == 0 || str.trim().length() == 0) {
            return;
        }
        if (f1892l >= 15) {
            int i5 = C0088t.f2518d - 20;
            String string = "";
            String strSubstring = str;
            while (true) {
                int iIndexOf = strSubstring.indexOf(62);
                if (iIndexOf < 0) {
                    string = new StringBuffer().append(string).append(strSubstring).toString();
                    break;
                }
                if (iIndexOf - 2 < 0 || strSubstring.charAt(iIndexOf - 2) != '<') {
                    string = new StringBuffer().append(string).append(strSubstring.substring(0, iIndexOf + 1)).toString();
                    strSubstring = strSubstring.substring(iIndexOf + 1);
                } else {
                    string = new StringBuffer().append(string).append(strSubstring.substring(0, iIndexOf - 2)).toString();
                    strSubstring = strSubstring.substring(iIndexOf + 1);
                }
                if (iIndexOf < 0) {
                    break;
                }
            }
            String[] strArrM1311a = m1311a(string.trim(), C0088t.f2523i, i5, "\t");
            int iMax = 0;
            for (int i1 = 0; i1 < strArrM1311a.length; i1++) {
                String str2 = strArrM1311a[i1];
                iMax = Math.max(iMax, C0088t.f2523i.stringWidth(str2) + 8);
            }
            f1861X = Math.min(iMax, i5);
            if (i4 == 1) {
                f1859V = new C0050bw(str, (short) (f1861X - 8));
                f1862Y = (C0088t.f2524j * f1859V.m1015a()) + 8;
            } else if (i4 == 2) {
                f1860W = m1311a(str.trim(), C0088t.f2523i, f1861X - 8, "\t");
                f1862Y = (C0088t.f2524j * f1860W.length) + 8;
            }
            if (f1861X + i > C0088t.f2520f + C0088t.f2518d) {
                i = i - f1861X >= C0088t.f2520f ? i - f1861X : C0088t.f2520f + ((C0088t.f2518d - f1861X) / 2);
            }
            f1863Z = i;
            if (f1862Y + i2 > i3) {
                i2 = i2 - f1862Y >= C0088t.f2521g ? i2 - f1862Y : C0088t.f2521g + ((C0088t.f2519e - f1862Y) / 2);
            }
            f1865aa = i2;
            if (f1892l == 15) {
                m1293a(graphics, 1009050, 210, f1863Z, f1865aa, f1861X / 4, f1862Y / 4);
            } else if (f1892l == 16) {
                m1293a(graphics, 1009050, 210, f1863Z, f1865aa, f1861X / 2, f1862Y / 2);
            } else if (f1892l == 17) {
                m1293a(graphics, 1009050, 210, f1863Z, f1865aa, (f1861X / 4) * 3, (f1862Y / 4) * 3);
            } else {
                m1293a(graphics, 1009050, 210, f1863Z, f1865aa, f1861X, f1862Y);
                graphics.setColor(16230);
                graphics.drawRect(f1863Z, f1865aa, f1861X, f1862Y);
                if (i4 == 1) {
                    f1859V.m1017a(graphics, f1863Z + 4, f1865aa + 4, 20);
                } else if (i4 == 2) {
                    graphics.setColor(15138723);
                    for (int i6 = 0; i6 < f1860W.length; i6++) {
                        if (f1860W[i6] != null) {
                            graphics.drawString(f1860W[i6], f1863Z + 4, f1865aa + 4 + (C0088t.f2524j * i6), 0);
                        }
                    }
                }
            }
        }
        f1892l++;
    }

    /* renamed from: c */
    public static int m1322c(int i, int i2) {
        if (f1873ai != null) {
            for (int i3 = 0; i3 < f1873ai.length; i3++) {
                if (i >= f1873ai[i3][0] && i <= f1873ai[i3][0] + f1873ai[i3][2] && i2 >= f1873ai[i3][1] && i2 <= f1873ai[i3][1] + f1873ai[i3][3]) {
                    f1895o = i3;
                    return 1073741824;
                }
            }
        }
        return (i < f1870af[0] || i > f1870af[0] + f1897q || i2 < f1870af[1] || i2 > f1870af[1] + f1871ag) ? 536870912 : 0;
    }

    /* renamed from: c */
    private static String m1323c(String str, Font font, int i) {
        f1856S = (short) 0;
        f1855R = (short) 0;
        int iStringWidth = font.stringWidth(str);
        if (iStringWidth <= i) {
            return str;
        }
        String strSubstring = str.substring(0, (str.length() * i) / iStringWidth);
        for (int i2 = 0; i2 < strSubstring.length(); i2++) {
            char cCharAt = strSubstring.charAt(i2);
            if (cCharAt == '<') {
                f1855R = (short) (f1855R + 1);
            } else if (cCharAt == '>') {
                f1856S = (short) (f1856S + 1);
            }
        }
        if (f1855R != f1856S) {
            f1857T = str.lastIndexOf(60);
            int iLastIndexOf = str.lastIndexOf(62);
            f1858U = iLastIndexOf;
            if (iLastIndexOf - f1857T >= 1) {
                try {
                    strSubstring = Integer.parseInt(str.substring(f1857T + 1, f1858U)) <= 41 ? str.substring(0, str.lastIndexOf(60)) : strSubstring;
                } catch (Exception e) {
                }
            } else {
                strSubstring = str.substring(0, f1857T);
            }
        }
        return m1323c(strSubstring, font, i);
    }

    /* renamed from: c */
    public static void m1324c(Graphics graphics) {
        f1892l = 0;
        graphics.setClip(0, 0, C0088t.f2516b, C0088t.f2517c);
        graphics.setColor(11138815);
        graphics.fillRect(f1870af[0], f1870af[1], f1897q, f1871ag);
        graphics.setColor(14172);
        graphics.drawRect(f1870af[0], f1870af[1], f1897q - 1, f1871ag - 1);
        int i = 0;
        while (i < f1896p.length) {
            graphics.setColor(f1895o == i ? 1539988 : 6082765);
            graphics.fillRect(f1870af[0] + 2, f1870af[1] + 2 + ((C0088t.f2524j + 3) * i), f1897q - 4, C0088t.f2524j + 2);
            graphics.setColor(14172);
            graphics.drawRect(f1870af[0] + 2, f1870af[1] + 2 + ((C0088t.f2524j + 3) * i), f1897q - 5, C0088t.f2524j + 1);
            m1308a(f1873ai[i], f1870af[0] + 2, f1870af[1] + 2 + ((C0088t.f2524j + 3) * i), f1897q - 5, C0088t.f2524j + 1);
            graphics.setColor(f1895o == i ? 16053950 : 3756286);
            if (f1872ah != null && i < f1872ah.length && f1872ah[i] == 1) {
                graphics.setColor(8750469);
            }
            graphics.drawString(f1896p[i], f1870af[0] + (f1897q / 2), f1870af[1] + 2 + ((C0088t.f2524j + 3) * i), 17);
            i++;
        }
        if (RunnableC0066a.f2080S == null || RunnableC0066a.f2080S.length != 4) {
            return;
        }
        graphics.drawImage(RunnableC0066a.f2080S[0].f598a, f1870af[0], f1870af[1], 20);
        graphics.drawImage(RunnableC0066a.f2080S[1].f598a, (f1870af[0] + f1897q) - RunnableC0066a.f2080S[1].f599b, f1870af[1], 20);
        graphics.drawImage(RunnableC0066a.f2080S[2].f598a, f1870af[0], (f1870af[1] + f1871ag) - RunnableC0066a.f2080S[2].f600c, 20);
        graphics.drawImage(RunnableC0066a.f2080S[3].f598a, (f1870af[0] + f1897q) - RunnableC0066a.f2080S[3].f599b, (f1870af[1] + f1871ag) - RunnableC0066a.f2080S[3].f600c, 20);
    }

    /* renamed from: c */
    public static void m1325c(Graphics graphics, int i, int i2, int i3, int i4) {
        graphics.setColor(f1889i);
        graphics.fillRect(i, i2, 3, i4 - i2);
        graphics.setColor(f1848K);
        graphics.drawLine(i + 1, i2, i3 + 1, i4);
    }

    /* renamed from: c */
    public static void m1326c(Graphics graphics, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            m1293a(graphics, 2511520, 210, i, i2, i3, i4);
        } else if (i5 == 1) {
            graphics.setColor(15990);
            graphics.fillRect(i, i2, i3, i4);
        }
        graphics.setColor(14172);
        graphics.drawRect(i, i2, i3, i4);
        graphics.drawRect(i + 2, i2 + 2, i3 - 4, i4 - 4);
        graphics.setColor(11267556);
        graphics.drawRect(i + 1, i2 + 1, i3 - 2, i4 - 2);
    }

    /* renamed from: d */
    public static int m1327d(int i, int i2) {
        if (f1874aj != null) {
            for (int i3 = 0; i3 < f1874aj.length; i3++) {
                if (i >= f1874aj[i3][0] && i <= f1874aj[i3][0] + f1874aj[i3][2] && i2 >= f1874aj[i3][1] && i2 <= f1874aj[i3][1] + f1874aj[i3][3]) {
                    switch (i3) {
                        case 0:
                            return 1;
                        case 1:
                            return 4;
                        case 2:
                            return 8;
                        case 3:
                            return 2;
                    }
                }
            }
        }
        if (f1875ak == null) {
            return 0;
        }
        if (i < f1875ak[0][0] || i > f1875ak[0][0] + f1875ak[0][2] || i2 < f1875ak[0][1] || i2 > f1875ak[0][1] + f1875ak[0][3]) {
            return (i < f1875ak[1][0] || i > f1875ak[1][0] + f1875ak[1][2] || i2 < f1875ak[1][1] || i2 > f1875ak[1][1] + f1875ak[1][3]) ? 0 : 536870912;
        }
        return 268435456;
    }

    /* renamed from: d */
    public static void m1328d(Graphics graphics, int i, int i2, int i3, int i4) {
        graphics.setClip(0, 0, C0088t.f2516b, C0088t.f2517c);
        graphics.setColor(16248869);
        graphics.drawLine(i, i2, i + 4, i2);
        graphics.drawLine(i, i2, i, i2 + 4);
        graphics.drawLine(i, (i2 + i4) - 4, i, i2 + i4);
        graphics.drawLine(i, i2 + i4, i + 4, i2 + i4);
        graphics.drawLine((i + i3) - 4, i2, i + i3, i2);
        graphics.drawLine(i + i3, i2, i + i3, i2 + 4);
        graphics.drawLine(i + i3, (i2 + i4) - 4, i + i3, i2 + i4);
        graphics.drawLine((i + i3) - 4, i2 + i4, i + i3, i2 + i4);
    }

    /* renamed from: e */
    public static void m1329e(Graphics graphics, int i, int i2, int i3, int i4) {
        graphics.setColor(16777215);
        graphics.fillRect(i + 1, i2 + 1, 20, 2);
        graphics.setColor(i4 == 0 ? 16711680 : 48127);
        graphics.fillRect(i + 1, i2 + 1, i3, 2);
        graphics.setColor(i4 == 0 ? 10945027 : 230064);
        graphics.fillRect(i + 1, i2 + 2, i3, 1);
        graphics.drawImage(RunnableC0066a.f2087Z.f598a, i, i2, 20);
    }

    /* renamed from: e */
    public static boolean m1330e(int i, int i2) {
        return f1876al != null && i >= f1876al[0] && i <= f1876al[0] + f1876al[2] && i2 >= f1876al[1] && i2 <= f1876al[1] + f1876al[3];
    }

    /* renamed from: f */
    public static int m1331f(int i, int i2) {
        int iNextInt = (f1881aq.nextInt() % (i2 - i)) + i;
        if (iNextInt < 0) {
            iNextInt = -iNextInt;
        }
        if (iNextInt == 0) {
            return 1;
        }
        return iNextInt;
    }

    /* renamed from: f */
    public static void m1332f(Graphics graphics, int i, int i2, int i3, int i4) {
        graphics.setClip(0, 0, C0088t.f2516b, C0088t.f2517c);
        m1289a(graphics, 2);
        graphics.drawRect(i - 4, i2 - 4, i3 + 7, i4 + 7);
        graphics.drawRect(i, i2, i3 - 1, i4 - 1);
        m1289a(graphics, 3);
        graphics.drawRect(i - 3, i2 - 3, i3 + 5, i4 + 5);
        graphics.drawRect(i - 1, i2 - 1, i3 + 1, i4 + 1);
        m1289a(graphics, 4);
        graphics.drawRect(i - 2, i2 - 2, i3 + 3, i4 + 3);
        if (RunnableC0066a.f2124y != null) {
            graphics.drawImage(RunnableC0066a.f2124y.f598a, i - 4, i2 - 4, 20);
        }
        if (RunnableC0066a.f2125z != null) {
            graphics.drawImage(RunnableC0066a.f2125z.f598a, i - 4, ((i4 + 4) + i2) - RunnableC0066a.f2125z.f600c, 20);
        }
        if (RunnableC0066a.f2122w != null) {
            graphics.drawImage(RunnableC0066a.f2122w.f598a, ((i + 4) + i3) - RunnableC0066a.f2122w.f599b, i2 - 4, 20);
        }
        if (RunnableC0066a.f2123x != null) {
            graphics.drawImage(RunnableC0066a.f2123x.f598a, ((i + 4) + i3) - RunnableC0066a.f2123x.f599b, ((i4 + 4) + i2) - RunnableC0066a.f2123x.f600c, 20);
        }
    }
}

package com.yinhan.kjava.main;

import com.cc.CloseUtil;
import p000.*;

import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.lcdui.*;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreNotOpenException;
import java.io.*;
import java.util.Vector;

/* renamed from: com.yinhan.kjava.main.a */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-4234804660425969496/classes.dex */
public final class RunnableC0066a extends Canvas implements Runnable, CommandListener {

    /* renamed from: A */
    public static C0030bc f2062A;

    /* renamed from: B */
    public static C0030bc f2063B;

    /* renamed from: C */
    public static C0033bf f2064C;

    /* renamed from: D */
    public static C0033bf f2065D;

    /* renamed from: E */
    public static C0033bf f2066E;

    /* renamed from: F */
    public static C0026az f2067F;

    /* renamed from: G */
    public static C0033bf f2068G;

    /* renamed from: H */
    public static C0033bf f2069H;

    /* renamed from: I */
    public static C0033bf f2070I;

    /* renamed from: J */
    public static C0033bf f2071J;

    /* renamed from: K */
    public static C0033bf f2072K;

    /* renamed from: L */
    public static C0033bf f2073L;

    /* renamed from: M */
    public static C0033bf f2074M;

    /* renamed from: N */
    public static C0033bf f2075N;

    /* renamed from: O */
    public static C0033bf f2076O;

    /* renamed from: P */
    public static C0033bf f2077P;

    /* renamed from: Q */
    public static C0033bf f2078Q;

    /* renamed from: R */
    public static C0033bf[] f2079R;

    /* renamed from: S */
    public static C0033bf[] f2080S;

    /* renamed from: T */
    public static C0033bf f2081T;

    /* renamed from: U */
    public static C0033bf f2082U;

    /* renamed from: V */
    public static C0033bf f2083V;

    /* renamed from: W */
    public static C0033bf f2084W;

    /* renamed from: X */
    public static C0033bf f2085X;

    /* renamed from: Y */
    public static C0033bf f2086Y;

    /* renamed from: Z */
    public static C0033bf f2087Z;

    /* renamed from: aH */
    public static String f2089aH;

    /* renamed from: aI */
    public static String f2090aI;

    /* renamed from: ab */
    public static C0048bu f2096ab;

    /* renamed from: ac */
    public static C0048bu f2097ac;

    /* renamed from: ad */
    public static C0048bu f2098ad;

    /* renamed from: ae */
    public static C0048bu f2099ae;

    /* renamed from: af */
    public static C0048bu f2100af;

    /* renamed from: ag */
    public static C0048bu f2101ag;

    /* renamed from: ah */
    public static C0048bu f2102ah;

    /* renamed from: bm */
    private static C0030bc f2110bm;

    /* renamed from: bn */
    private static C0030bc f2111bn;

    /* renamed from: e */
    public static C0015ao f2113e;

    /* renamed from: f */
    public static C0009ai f2114f;

    /* renamed from: i */
    public static C0022av f2115i;

    /* renamed from: n */
    public static C0033bf f2116n;

    /* renamed from: r */
    public static C0033bf f2117r;

    /* renamed from: s */
    public static C0033bf f2118s;

    /* renamed from: t */
    public static C0033bf f2119t;

    /* renamed from: u */
    public static C0033bf f2120u;

    /* renamed from: v */
    public static C0033bf f2121v;

    /* renamed from: w */
    public static C0033bf f2122w;

    /* renamed from: x */
    public static C0033bf f2123x;

    /* renamed from: y */
    public static C0033bf f2124y;

    /* renamed from: z */
    public static C0033bf f2125z;

    /* renamed from: a */
    public int f2126a;

    /* renamed from: aC */
    public TextField f2128aC;

    /* renamed from: aD */
    public Form f2129aD;

    /* renamed from: aE */
    public ChoiceGroup f2130aE;

    /* renamed from: aF */
    public int f2131aF;

    /* renamed from: aG */
    public int f2132aG;

    /* renamed from: aJ */
    private boolean f2133aJ;

    /* renamed from: aQ */
    private long f2136aQ;

    /* renamed from: aR */
    private boolean f2137aR;

    /* renamed from: aT */
    private C0050bw f2139aT;

    /* renamed from: aV */
    private int f2141aV;

    /* renamed from: aW */
    private int f2142aW;

    /* renamed from: aX */
    private int f2143aX;

    /* renamed from: aY */
    private int f2144aY;

    /* renamed from: aj */
    public C0071f f2146aj;

    /* renamed from: ak */
    public long f2147ak;

    /* renamed from: ax */
    public int f2156ax;

    /* renamed from: az */
    public boolean f2158az;

    /* renamed from: b */
    public int f2159b;

    /* renamed from: bA */
    private byte f2160bA;

    /* renamed from: bE */
    private byte f2164bE;

    /* renamed from: bF */
    private byte f2165bF;

    /* renamed from: bL */
    private TextField f2170bL;

    /* renamed from: bM */
    private TextField f2171bM;

    /* renamed from: bN */
    private TextField f2172bN;

    /* renamed from: bO */
    private TextField f2173bO;

    /* renamed from: bP */
    private Command f2174bP;

    /* renamed from: bQ */
    private Command f2175bQ;

    /* renamed from: bR */
    private Command f2176bR;

    /* renamed from: bS */
    private StringItem f2177bS;

    /* renamed from: bT */
    private StringItem f2178bT;

    /* renamed from: bU */
    private StringItem f2179bU;

    /* renamed from: bV */
    private StringItem f2180bV;

    /* renamed from: bW */
    private String f2181bW;

    /* renamed from: bX */
    private ChoiceGroup f2182bX;

    /* renamed from: bZ */
    private String f2184bZ;

    /* renamed from: ba */
    private int f2185ba;

    /* renamed from: bb */
    private ChoiceGroup f2186bb;

    /* renamed from: bc */
    private ChoiceGroup f2187bc;

    /* renamed from: bd */
    private ChoiceGroup f2188bd;

    /* renamed from: bj */
    private Image f2194bj;

    /* renamed from: bk */
    private Image f2195bk;

    /* renamed from: bp */
    private int[][] f2197bp;

    /* renamed from: bq */
    private int[] f2198bq;

    /* renamed from: br */
    private int f2199br;

    /* renamed from: bt */
    private int f2201bt;

    /* renamed from: bu */
    private int f2202bu;

    /* renamed from: bx */
    private C0030bc[] f2204bx;

    /* renamed from: by */
    private C0030bc[] f2205by;

    /* renamed from: bz */
    private byte f2206bz;

    /* renamed from: ca */
    private int f2208ca;

    /* renamed from: cb */
    private int f2209cb;

    /* renamed from: cc */
    private int f2210cc;

    /* renamed from: cd */
    private int f2211cd;

    /* renamed from: ce */
    private short f2212ce;

    /* renamed from: d */
    public MainMidlet f2213d;

    /* renamed from: j */
    public short f2216j;

    /* renamed from: k */
    public short f2217k;

    /* renamed from: l */
    public StringBuffer f2218l;

    /* renamed from: m */
    public int f2219m;

    /* renamed from: q */
    public Display f2222q;

    /* renamed from: aL */
    private static Image[] f2091aL = null;

    /* renamed from: aM */
    private static Image f2092aM = null;

    /* renamed from: aa */
    public static Image f2095aa = null;

    /* renamed from: ai */
    public static C0068c f2103ai = null;

    /* renamed from: aN */
    private static Vector f2093aN = new Vector();

    /* renamed from: aO */
    private static StringBuffer f2094aO = new StringBuffer();

    /* renamed from: bl */
    private static C0048bu f2109bl = null;

    /* renamed from: bv */
    private static boolean f2112bv = false;

    /* renamed from: am */
    public static String f2104am = null;

    /* renamed from: an */
    public static String f2105an = null;

    /* renamed from: ao */
    public static byte f2106ao = 0;

    /* renamed from: ap */
    public static boolean f2107ap = true;

    /* renamed from: bK */
    private static byte f2108bK = 1;

    /* renamed from: aB */
    public static byte f2088aB = 2;

    /* renamed from: c */
    public short f2207c = 0;

    /* renamed from: g */
    public boolean f2214g = false;

    /* renamed from: h */
    public boolean f2215h = false;

    /* renamed from: aK */
    private String f2134aK = new StringBuffer().append("mhxy.zyy").append((int) C0088t.f2532r).append("_").append((int) C0088t.f2533s).toString();

    /* renamed from: o */
    public boolean f2220o = false;

    /* renamed from: p */
    public boolean f2221p = false;

    /* renamed from: al */
    public long f2148al = 0;

    /* renamed from: aP */
    private long f2135aP = 0;

    /* renamed from: aS */
    private String f2138aS = null;

    /* renamed from: aU */
    private boolean f2140aU = false;

    /* renamed from: aZ */
    private boolean f2145aZ = false;

    /* renamed from: be */
    private Image f2189be = null;

    /* renamed from: bf */
    private Image f2190bf = null;

    /* renamed from: bg */
    private Image f2191bg = null;

    /* renamed from: bh */
    private Image f2192bh = null;

    /* renamed from: bi */
    private Image f2193bi = null;

    /* renamed from: bo */
    private String[] f2196bo = null;

    /* renamed from: bs */
    private int f2200bs = 0;

    /* renamed from: bw */
    private int f2203bw = -1;

    /* renamed from: aq */
    public C0081m f2149aq = null;

    /* renamed from: ar */
    public C0054c f2150ar = null;

    /* renamed from: as */
    public C0082n f2151as = null;

    /* renamed from: at */
    public C0014an f2152at = null;

    /* renamed from: au */
    public C0080l f2153au = null;

    /* renamed from: av */
    public C0093y f2154av = null;

    /* renamed from: aw */
    public int f2155aw = 0;

    /* renamed from: bB */
    private int f2161bB = 0;

    /* renamed from: bC */
    private int[][] f2162bC = null;

    /* renamed from: ay */
    public String f2157ay = "";

    /* renamed from: bD */
    private Image f2163bD = null;

    /* renamed from: bG */
    private int f2166bG = 0;

    /* renamed from: bH */
    private int f2167bH = 0;

    /* renamed from: aA */
    public int f2127aA = 0;

    /* renamed from: bI */
    private int f2168bI = -1;

    /* renamed from: bJ */
    private long f2169bJ = 0;

    /* renamed from: bY */
    private byte f2183bY = -1;

    public RunnableC0066a(MainMidlet mainMidlet, Display display) {
        C0088t.m1681a(mainMidlet);
        setFullScreenMode(true);
        this.f2222q = display;
        this.f2213d = mainMidlet;
        f2103ai = new C0068c(mainMidlet, display);
        this.f2133aJ = true;
        C0088t.f2516b = (short) getWidth();
        C0088t.f2517c = (short) getHeight();
        short s = C0088t.f2516b;
        C0088t.f2518d = s;
        C0015ao.f143a = s;
        short s2 = C0088t.f2517c;
        C0088t.f2519e = s2;
        C0015ao.f153b = s2;
        this.f2219m = 10;
        if (C0088t.f2516b >= 240) {
            this.f2219m = 8;
            short s3 = (short) ((C0088t.f2516b * 95) / 100);
            C0088t.f2518d = s3;
            C0015ao.f143a = s3;
            short s4 = (short) (((C0088t.f2517c > 320 ? (short) 80 : (short) 95) * C0088t.f2517c) / 100);
            C0088t.f2519e = s4;
            C0015ao.f153b = s4;
            short s5 = (short) ((C0088t.f2516b - C0015ao.f143a) / 2);
            C0015ao.f169o = s5;
            C0088t.f2520f = s5;
            short s6 = (short) ((C0088t.f2517c - C0015ao.f153b) / 2);
            C0015ao.f170p = s6;
            C0088t.f2521g = s6;
        }
        C0093y.m1711c().m689a(C0088t.f2520f, C0088t.f2521g, C0088t.f2518d, C0088t.f2519e);
        m1426y();
        new Thread(this).start();
    }

    /* renamed from: A */
    private void m1378A() {
        if (f2113e != null) {
            f2113e.m418b();
            f2113e = null;
            if (!C0088t.f2529o || this.f2146aj == null) {
                return;
            }
            this.f2146aj.f2231a = null;
        }
    }

    /* renamed from: B */
    private void m1379B() {
        if (this.f2207c != 0) {
            if (this.f2207c != 1) {
                if (this.f2207c == 2) {
                    if (this.f2126a == 268435456) {
                        m1435a("输入“OK” 删除角色", 0);
                        this.f2207c = (short) 0;
                    } else if (this.f2126a == 536870912) {
                        this.f2207c = (short) 1;
                    }
                    this.f2126a = 0;
                    return;
                }
                return;
            }
            C0055ca.m1317b(this.f2126a);
            if (this.f2126a == 268435456 || this.f2126a == 1073741824 || this.f2126a == 517) {
                if (C0055ca.f1895o == 0) {
                    m1415g(C0047bt.f831W[(this.f2160bA << 1) + this.f2206bz]);
                } else if (C0055ca.f1895o == 1) {
                    this.f2155aw = (this.f2160bA << 1) + this.f2206bz;
                    this.f2207c = (short) 2;
                }
            } else if (this.f2126a == 536870912) {
                m1440b(C0047bt.f831W.length);
                this.f2207c = (short) 0;
            }
            this.f2126a = 0;
            return;
        }
        if (this.f2149aq != null) {
            this.f2149aq.mo70b(this.f2126a);
        }
        if (this.f2126a == 1 || this.f2126a == 514) {
            this.f2160bA = (byte) (this.f2160bA <= 0 ? 1 : this.f2160bA - 1);
            this.f2152at.m79b(m1413f((this.f2160bA << 1) + this.f2206bz), C0088t.f2523i, (byte) 1);
        } else if (this.f2126a == 4 || this.f2126a == 520) {
            this.f2160bA = (byte) (this.f2160bA >= 1 ? 0 : this.f2160bA + 1);
            this.f2152at.m79b(m1413f((this.f2160bA << 1) + this.f2206bz), C0088t.f2523i, (byte) 1);
        } else if (this.f2126a == 8 || this.f2126a == 516) {
            this.f2206bz = (byte) (this.f2206bz <= 0 ? 1 : this.f2206bz - 1);
            this.f2152at.m79b(m1413f((this.f2160bA << 1) + this.f2206bz), C0088t.f2523i, (byte) 1);
        } else if (this.f2126a == 2 || this.f2126a == 518) {
            this.f2206bz = (byte) (this.f2206bz >= 1 ? 0 : this.f2206bz + 1);
            this.f2152at.m79b(m1413f((this.f2160bA << 1) + this.f2206bz), C0088t.f2523i, (byte) 1);
        } else if (this.f2126a == 268435456) {
            if (C0047bt.f831W == null || (this.f2160bA << 1) + this.f2206bz >= C0047bt.f831W.length) {
                m1380C();
            } else {
                m1415g(C0047bt.f831W[(this.f2160bA << 1) + this.f2206bz]);
            }
        } else if (this.f2126a == 1073741824 || this.f2126a == 517) {
            if (C0047bt.f831W == null || (this.f2160bA << 1) + this.f2206bz >= C0047bt.f831W.length) {
                m1380C();
            } else if (C0047bt.f831W.length >= 4) {
                C0055ca.m1285a(this.f2162bC[(this.f2160bA << 1) + this.f2206bz][0] + (this.f2161bB / 2), this.f2162bC[(this.f2160bA << 1) + this.f2206bz][1] + (this.f2161bB / 2), new String[]{"进入", "删除"}, false);
                this.f2207c = (short) 1;
            } else {
                m1415g(C0047bt.f831W[(this.f2160bA << 1) + this.f2206bz]);
            }
        } else if (this.f2126a == 536870912) {
            m1444c();
        }
        if (this.f2204bx != null) {
            for (int i = 0; i < this.f2204bx.length; i++) {
                C0009ai.m43a(this.f2204bx[i], this.f2147ak);
            }
        }
        if (this.f2205by != null) {
            for (int i2 = 0; i2 < this.f2205by.length; i2++) {
                C0009ai.m43a(this.f2205by[i2], this.f2147ak);
            }
        }
        this.f2126a = 0;
    }

    /* renamed from: C */
    private void m1380C(){
        m1424w();
        this.f2163bD = m1419k("/images/logo_btn_random.png");
        this.f2204bx = new C0030bc[6];
        int i = 0;
        while (i < this.f2204bx.length) {
            this.f2204bx[i] = m1429a(this.f2204bx[i], (byte) (i % 3), i < 3 ? (byte) 0 : (byte) 1, (byte) 3, (byte) 1, false);
            i++;
        }
        this.f2161bB = 35;
        this.f2166bG = 0;
        this.f2164bE = (byte) 0;
        this.f2165bF = (byte) 0;
        this.f2149aq.m1604b();
        this.f2149aq.m1601a("创建角色");
        this.f2149aq.m1597a(C0088t.f2519e <= 240 ? (this.f2161bB * 3) + 6 : 150);
        this.f2152at.m79b(C0088t.f2487H[0], C0088t.f2523i, (byte) 1);
        this.f2152at.m75a((byte) 1);
        this.f2153au.m1593a(new String[]{"创 建", ""});
        this.f2149aq.m1600a(this.f2152at);
        if (C0088t.f2517c > 220) {
            this.f2149aq.m1600a(this.f2153au);
        }
        this.f2149aq.m1598a(C0088t.f2520f, C0088t.f2521g, C0088t.f2518d, C0088t.f2519e);
        this.f2126a = 0;
        this.f2159b = 0;
        this.f2216j = (short) 6;
        this.f2217k = (short) 6;
    }

    /* renamed from: D */
    private void m1381D() {
        if (this.f2129aD != null) {
            this.f2129aD.deleteAll();
        }
        this.f2177bS = null;
        this.f2174bP = null;
        this.f2175bQ = null;
        this.f2128aC = null;
        this.f2129aD = null;
    }

    /* renamed from: E */
    private void m1382E() {
        try {
            if (f2113e == null) {
                return;
            }
            f2113e.m374a();
            if (f2113e.f358k != 0) {
                this.f2126a = 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
            m1433a(e, (byte) 4);
        }
    }

    /* renamed from: F */
    private void m1383F() throws IOException {
        if (C0047bt.f888b == null || C0047bt.f941c == null) {
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeUTF(C0047bt.f888b == null ? "" : C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f941c == null ? "" : C0047bt.f941c);
            m1402a(byteArrayOutputStream.toByteArray(), this.f2134aK);
            byteArrayOutputStream.close();
            dataOutputStream.close();
        } catch (IOException e) {
        } catch (Exception e2) {
        }
    }

    /* renamed from: G */
    private void m1384G() {
        this.f2133aJ = false;
        m1425x();
    }

    /* renamed from: H */
    private void m1385H() {
        this.f2129aD = null;
        this.f2174bP = null;
        this.f2174bP = null;
        this.f2128aC = null;
        this.f2182bX = null;
    }

    /* renamed from: I */
    private void m1386I() {
        if (this.f2129aD != null) {
            this.f2129aD.removeCommand(this.f2174bP);
            this.f2129aD.removeCommand(this.f2175bQ);
            this.f2129aD.deleteAll();
        }
        this.f2174bP = null;
        this.f2175bQ = null;
        this.f2129aD = null;
    }

    /* renamed from: J */
    private void m1387J() {
        this.f2133aJ = false;
        f2115i = null;

        this.f2213d.destroyApp(true);
        this.f2213d.notifyDestroyed();
    }

    /* renamed from: K */
    private void m1388K() {
        try {
            RecordStore recordStoreM1395a = m1395a("S", false);
            DataInputStream dataInputStreamM1389a = m1389a(recordStoreM1395a);
            if (m1418j("S") && dataInputStreamM1389a != null) {
                this.f2212ce = (short) 0;
                this.f2212ce = dataInputStreamM1389a.readShort();
                dataInputStreamM1389a.close();
                recordStoreM1395a.closeRecordStore();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private static DataInputStream m1389a(RecordStore recordStore) {
        try {
            if (recordStore.getNumRecords() <= 0) {
                return null;
            }
            return new DataInputStream(new ByteArrayInputStream(recordStore.getRecord(1)));
        } catch (RecordStoreException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    /* renamed from: a */
    public static String m1390a(byte b, byte b2, byte b3, byte b4, boolean z) {
        if (C0088t.f2527m == 2) {
            b4 = 0;
        }
        return new StringBuffer().append("").append(C0088t.f2501V[b]).append(C0088t.f2502W[b2]).append((int) b4).append(C0088t.f2503X[b3]).append(z ? "4" : "").toString();
    }

    /* renamed from: a */
    public static String m1391a(byte b, byte b2, byte b3, byte b4, boolean z, String str) {
        if (C0088t.f2527m == 2) {
            b4 = 0;
        }
        if (!C0088t.f2530p) {
            return new StringBuffer().append("").append(C0088t.f2501V[b]).append(C0088t.f2502W[b2]).append((int) b4).append(C0088t.f2503X[b3]).append(z ? "4" : "").toString();
        }
        f2094aO.delete(0, f2094aO.length());
        f2094aO.append("");
        f2094aO.append(str);
        f2094aO.append(C0088t.f2501V[b]);
        f2094aO.append(C0088t.f2502W[b2]);
        f2094aO.append((int) b4);
        f2094aO.append(C0088t.f2503X[b3]);
        f2094aO.append(z ? "4" : "");
        return f2094aO.toString();
    }

    /* renamed from: a */
    static ChoiceGroup m1392a(RunnableC0066a runnableC0066a) {
        return runnableC0066a.f2186bb;
    }

    /* renamed from: a */
    static ChoiceGroup m1393a(RunnableC0066a runnableC0066a, int i) {
        return m1411e(i);
    }

    /* renamed from: a */
    static ChoiceGroup m1394a(RunnableC0066a runnableC0066a, ChoiceGroup choiceGroup) {
        runnableC0066a.f2187bc = choiceGroup;
        return choiceGroup;
    }

    /* renamed from: a */
    private static RecordStore m1395a(String str, boolean z) {
        try {
            if (!z) {
                return RecordStore.openRecordStore(str, !z);
            }
            RecordStore.deleteRecordStore(str);
            return RecordStore.openRecordStore(str, z);
        } catch (RecordStoreException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m1396a(byte b, byte b2, byte b3, byte b4, String str, short s, short s2, short s3) {
        f2093aN.removeAllElements();
        if (b3 == 5) {
            f2093aN.addElement(m1391a(b, b2, (byte) 1, b4, false, str));
            f2093aN.addElement(m1391a(b, b2, (byte) 3, b4, false, str));
            f2093aN.addElement(m1391a(b, b2, (byte) 3, b4, true, str));
            f2093aN.addElement(m1391a(b, b2, (byte) 0, b4, false, str));
            f2093aN.addElement(m1391a(b, b2, (byte) 0, b4, true, str));
            f2093aN.addElement(m1391a(b, b2, (byte) 2, b4, false, str));
            f2093aN.addElement(m1391a(b, b2, (byte) 2, b4, true, str));
        } else {
            f2093aN.addElement(m1391a(b, b2, b3, b4, false, str));
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= f2093aN.size()) {
                f2093aN.removeAllElements();
                return;
            } else {
                f2096ab.m993b((String) f2093aN.elementAt(i2), s, s2, s3);
                i = i2 + 1;
            }
        }
    }

    /* renamed from: a */
    private void m1397a(int i, int i2, int i3, int i4, int i5) {
        if (this.f2162bC == null || this.f2162bC.length <= i) {
            return;
        }
        this.f2162bC[i][0] = i2;
        this.f2162bC[i][1] = i3;
        this.f2162bC[i][2] = i4;
        this.f2162bC[i][3] = i5;
    }

    /* renamed from: a */
    public static void m1398a(String str, byte b) {
        C0022av.f447i = b;
        if (b == 2) {
            C0022av.f443b = str;
        } else {
            C0022av.f442a = str;
        }
    }

    /* renamed from: a */
    private void m1399a(Graphics graphics) {
        if (m1422u()) {
            return;
        }
        C0055ca.m1291a(graphics, this.f2141aV, this.f2142aW, this.f2143aX, this.f2144aY);
        if (this.f2139aT != null) {
            this.f2139aT.m1016a(graphics, C0088t.f2516b / 2, this.f2142aW + 7);
        }
    }

    /* renamed from: a */
    public static void m1400a(TextField textField, String str) {
        if (str != null) {
            try {
                if (textField.getMaxSize() > str.length()) {
                    textField.setString(str);
                }
            } catch (Exception e) {
                textField.setString("");
            }
        }
    }

    /* renamed from: a */
    private void m1401a(short s) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeShort(s);
            m1402a(byteArrayOutputStream.toByteArray(), "S");
            byteArrayOutputStream.close();
            dataOutputStream.close();
        } catch (IOException e) {
        } catch (Exception e2) {
        }
    }

    /* renamed from: a */
    private void m1402a(byte[] bArr, String str) {
        RecordStore recordStoreM1395a = null;
        try {
            recordStoreM1395a = m1395a(str, m1418j(str));
            recordStoreM1395a.addRecord(bArr, 0, bArr.length);
        } catch (RecordStoreException e) {
            e.printStackTrace();
        } finally {
            if (recordStoreM1395a != null) {
                try {
                    recordStoreM1395a.closeRecordStore();
                } catch (RecordStoreException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: b */
    static ChoiceGroup m1403b(RunnableC0066a runnableC0066a) {
        return runnableC0066a.f2187bc;
    }

    /* renamed from: b */
    private void m1404b(String str, byte b) {
        if (str == null) {
            str = b == 2 ? "socket://120.78.151.213:20008" : "http://117.135.138.130:7099";
        }
        m1398a(str, b);
        if (C0088t.f2537w) {
            m1423v();
        } else {
            this.f2129aD = new Form("登陆游戏");
            this.f2174bP = new Command("登陆", 4, 1);
            this.f2175bQ = new Command("返回", 2, 1);
            this.f2172bN = new TextField("帐号:", C0047bt.f888b, 20, 0);
            this.f2173bO = new TextField("密码:", C0047bt.f941c, 20, 65536);
            this.f2129aD.addCommand(this.f2174bP);
            this.f2129aD.addCommand(this.f2175bQ);
            this.f2129aD.append(this.f2172bN);
            this.f2129aD.append(this.f2173bO);
            this.f2129aD.setCommandListener(this);
            this.f2222q.setCurrent(this.f2129aD);
        }
        this.f2216j = (short) 3;
        this.f2217k = (short) 3;
    }

    /* renamed from: b */
    private void m1405b(Graphics graphics) {
        if (this.f2148al < 260) {
            this.f2148al = 260L;
        }
        if (this.f2148al >= 260) {
            graphics.setColor(0);
            graphics.fillRect(0, 0, C0088t.f2516b, C0088t.f2517c);
            graphics.drawImage(this.f2189be, (C0088t.f2516b - this.f2189be.getWidth()) >> 1, (C0088t.f2517c - this.f2189be.getHeight()) >> 1, 20);
            this.f2202bu = (int) (515 - this.f2148al > 0 ? 515 - this.f2148al : 0L);
            C0055ca.m1293a(graphics, 0, this.f2202bu, (C0088t.f2516b - this.f2189be.getWidth()) >> 1, (C0088t.f2517c - this.f2189be.getHeight()) >> 1, this.f2189be.getWidth(), this.f2189be.getHeight());
            this.f2148al += 5;
        }
    }

    /* renamed from: c */
    public static final Image m1406c(int i) {
        if (i == 1) {
            return f2092aM;
        }
        return null;
    }

    /* renamed from: c */
    static void m1407c(RunnableC0066a runnableC0066a) {
        DataInputStream dataInputStreamM1389a;
        C0048bu c0048bu = new C0048bu("/", "ui");
        f2097ac = c0048bu;
        c0048bu.m999d();
        if (f2097ac.m992b() == 0) {
        }
        C0048bu c0048bu2 = new C0048bu("/", "publicUI");
        f2101ag = c0048bu2;
        c0048bu2.m999d();
        if (f2101ag.m992b() != 0) {
            C0015ao.f177w = f2101ag.m985a("money");
            C0015ao.f178x = f2101ag.m985a("goods");
            C0015ao.f134C = f2101ag.m985a("chat");
            C0015ao.f135D = f2101ag.m985a("elite");
            f2116n = f2101ag.m985a("num");
            f2101ag.m991b("email");
            C0033bf c0033bfM985a = f2101ag.m985a("mail_2");
            C0010aj[] c0010ajArr = c0033bfM985a.f601d;
            int i = 1;
            while (true) {
                int i2 = i;
                if (i2 >= c0010ajArr.length) {
                    break;
                }
                Image imageCreateImage = Image.createImage(c0033bfM985a.f598a, c0010ajArr[i2].f95a, c0010ajArr[i2].f96b, c0010ajArr[i2].f97c, c0010ajArr[i2].f98d, 0);
                if ((i2 & 1) == 0) {
                    C0032be.f592e[i2 >> 2] = imageCreateImage;
                } else {
                    C0042bo.f736g[i2 >> 1] = imageCreateImage;
                }
                i = i2 + 1;
            }
            f2095aa = f2101ag.m985a("talk_01").f598a;
            f2120u = f2101ag.m985a("close");
            f2121v = f2101ag.m985a("title");
            f2066E = f2101ag.m985a("button1");
            f2117r = f2101ag.m985a("lu");
            f2118s = f2101ag.m985a("ld");
            f2119t = f2101ag.m985a("rd");
            f2123x = f2101ag.m985a("rd0");
            f2122w = f2101ag.m985a("ru0");
            f2124y = f2101ag.m985a("lu0");
            f2125z = f2101ag.m985a("ld0");
            f2064C = f2101ag.m985a("up");
            f2065D = f2101ag.m985a("down");
            f2062A = f2101ag.m991b("go-left");
            f2063B = f2101ag.m991b("go-right");
            C0093y.f2569a = f2121v;
            C0093y.f2570b = f2120u;
            C0093y.f2571c = f2117r;
            C0093y.f2572d = f2125z;
            C0093y.f2573e = f2123x;
            f2068G = f2101ag.m985a("tradetitle");
            f2073L = f2101ag.m985a("tradebottom");
            f2072K = f2101ag.m985a("moneybutton");
            f2069H = f2101ag.m985a("tradelock01");
            f2070I = f2101ag.m985a("tradelock_02");
            f2071J = f2101ag.m985a("tradelock_03");
            f2074M = f2101ag.m985a("plus");
            f2075N = f2101ag.m985a("subtraction");
            f2076O = f2101ag.m985a("equip");
            f2077P = f2101ag.m985a("nextpage");
            f2078Q = f2101ag.m985a("backpage");
            f2079R = new C0033bf[8];
            for (int i3 = 0; i3 < f2079R.length; i3++) {
                f2079R[i3] = f2101ag.m985a(new StringBuffer().append("equip_").append(i3).toString());
            }
            f2080S = new C0033bf[4];
            for (int i4 = 0; i4 < f2080S.length; i4++) {
                f2080S[i4] = f2101ag.m985a(new StringBuffer().append("submenu_").append(i4).toString());
            }
            f2081T = f2101ag.m985a("button_ok");
            f2082U = f2101ag.m985a("button_back");
            f2083V = f2101ag.m985a("trigon_u");
            f2084W = f2101ag.m985a("trigon_d");
            f2085X = f2101ag.m985a("trigon_l");
            f2086Y = f2101ag.m985a("trigon_r");
            C0015ao.f172r = f2101ag.m991b("select");
            f2087Z = f2101ag.m985a("rim");
            f2101ag.m985a("cursor");
            f2101ag.m985a("scorebar");
            f2091aL = new Image[7];
            for (int i5 = 0; i5 < f2091aL.length; i5++) {
                f2091aL[i5] = f2101ag.m985a(new StringBuffer().append("chq-").append(i5 + 1).toString()).f598a;
            }
            f2092aM = m1419k("/images/mz_1.png");
        }
        f2096ab = new C0048bu("/role/", "role");
        f2102ah = new C0048bu("/petfight/", "petfight");
        f2100af = new C0048bu("/icon/", "icon");
        RecordStore recordStoreM1395a = null;
        try {
            if (m1418j(runnableC0066a.f2134aK) && (dataInputStreamM1389a = m1389a((recordStoreM1395a = m1395a(runnableC0066a.f2134aK, false)))) != null) {
                C0047bt.f888b = dataInputStreamM1389a.readUTF();
                C0047bt.f941c = dataInputStreamM1389a.readUTF();
                dataInputStreamM1389a.close();
            }
            if (recordStoreM1395a != null) {
                try {
                    recordStoreM1395a.closeRecordStore();
                } catch (RecordStoreNotOpenException e) {
                } catch (RecordStoreException e2) {
                }
            }
        } catch (Exception e3) {
            if (recordStoreM1395a != null) {
                try {
                    recordStoreM1395a.closeRecordStore();
                } catch (RecordStoreNotOpenException e4) {
                } catch (RecordStoreException e5) {
                }
            }
        } catch (Throwable th) {
            if (recordStoreM1395a != null) {
                try {
                    recordStoreM1395a.closeRecordStore();
                } catch (RecordStoreNotOpenException e6) {
                } catch (RecordStoreException e7) {
                }
            }
        }
        runnableC0066a.f2218l = new StringBuffer();
        runnableC0066a.f2149aq = new C0081m();
        runnableC0066a.f2154av = C0093y.m1711c();
        runnableC0066a.f2150ar = new C0054c();
        runnableC0066a.f2153au = new C0080l();
        runnableC0066a.f2151as = new C0082n();
        runnableC0066a.f2152at = new C0014an();
        f2114f = new C0009ai();
        if (C0088t.f2529o) {
            runnableC0066a.f2146aj = new C0071f(runnableC0066a, f2114f);
        }
        f2103ai.m1474a();
        runnableC0066a.m1444c();
    }

    /* renamed from: c */
    private void m1408c(Graphics graphics) {
        this.f2201bt = (C0088t.f2517c <= 240 || this.f2192bh == null || this.f2193bi == null) ? 2 : ((C0088t.f2517c - this.f2192bh.getHeight()) - (this.f2193bi.getHeight() * 7)) / 3;
        if (this.f2191bg != null) {
            graphics.drawImage(this.f2191bg, (C0088t.f2516b - this.f2191bg.getWidth()) >> 1, (C0088t.f2517c - this.f2191bg.getHeight()) >> 1, 20);
        }
        if (this.f2192bh != null) {
            graphics.drawImage(this.f2192bh, (C0088t.f2516b - this.f2192bh.getWidth()) >> 1, this.f2201bt, 20);
        }
        if (f2110bm != null) {
            C0009ai.m43a(f2110bm, this.f2147ak);
            f2114f.m62a(graphics, f2110bm, (int[]) null, 0, 0, C0088t.f2516b - 100, C0088t.f2517c - 100, 0, 0);
        }
        if (f2111bn != null) {
            C0009ai.m43a(f2111bn, this.f2147ak);
            f2114f.m62a(graphics, f2111bn, (int[]) null, 0, 0, C0088t.f2516b - 100, C0088t.f2517c - 100, 0, 0);
        }
        if (this.f2194bj == null || this.f2195bk == null || this.f2197bp == null) {
            return;
        }
        for (int i = 0; i < this.f2197bp.length; i++) {
            for (int i2 = 0; i2 < this.f2197bp[i].length; i2++) {
                if (this.f2197bp[i][0] < 0 || this.f2197bp[i][0] > C0088t.f2516b || this.f2197bp[i][1] < 0) {
                    this.f2197bp[i] = m1427z();
                } else if ((this.f2199br & 1) == 0) {
                    this.f2197bp[i][0] = (C0055ca.m1331f(10, 40) % 2 == 0 ? -this.f2197bp[i][2] : this.f2197bp[i][2]) + this.f2197bp[i][0];
                    this.f2197bp[i][1] = this.f2197bp[i][1] - this.f2197bp[i][3];
                }
                graphics.drawImage(this.f2197bp[i][4] == 0 ? this.f2194bj : this.f2195bk, this.f2197bp[i][0], this.f2197bp[i][1], 20);
            }
        }
        this.f2199br++;
    }

    /* renamed from: d */
    public static final Image m1409d(int i) {
        if (i <= 0 || i >= 8) {
            return null;
        }
        return f2091aL[i - 1];
    }

    /* renamed from: d */
    private void m1410d(Graphics graphics) {
        m1408c(graphics);
        C0055ca.m1298a(graphics, C0088t.f2534t, 5, C0088t.f2517c - 3, 36, 6160358, 335925);
        if (C0088t.f2506a == 1) {
            C0055ca.m1298a(graphics, "退出", C0088t.f2516b - 5, C0088t.f2517c - 3, 40, 16777215, 335925);
        }
        for (int i = 0; i < this.f2196bo.length; i++) {
            if (i == this.f2200bs) {
                graphics.drawImage(this.f2193bi, (C0088t.f2516b - this.f2193bi.getWidth()) >> 1, (this.f2201bt << 1) + this.f2192bh.getHeight() + (this.f2193bi.getHeight() * i), 20);
            }
            C0055ca.m1298a(graphics, this.f2196bo[i], C0088t.f2516b >> 1, ((this.f2193bi.getHeight() - C0088t.f2524j) / 2) + (this.f2201bt << 1) + this.f2192bh.getHeight() + (this.f2193bi.getHeight() * i), 17, 16777215, 335925);
        }
        if (this.f2207c == 1) {
            C0055ca.m1303a(graphics, "当前没有账号信息，是否自动注册？", new String[]{"确定", "返回"});
        }
    }

    /* renamed from: e */
    private static ChoiceGroup m1411e(int i) {
        return new ChoiceGroup("方式", 4, i == 1 ? new String[]{"乐乐号", "用户名"} : new String[]{"用户名", "手机号", "ID"}, (Image[]) null);
    }

    /* renamed from: e */
    private void m1412e(Graphics graphics) {
        if (C0088t.f2506a == 1 && !C0088t.f2537w && C0047bt.f1255hw) {
            return;
        }
        m1408c(graphics);
        if (this.f2149aq != null) {
            this.f2149aq.m1602a(graphics);
        }
        if (this.f2207c == 2) {
            m1399a(graphics);
        }
    }

    /* renamed from: f */
    private String m1413f(int i) {
        if (C0047bt.f862aa == null || i >= C0047bt.f862aa.length) {
            this.f2153au.m1593a(new String[]{"创 建", ""});
            return "创建角色";
        }
        C0088t.m1680a(this.f2218l);
        this.f2218l.append(new StringBuffer().append("昵称：").append(C0047bt.f862aa[i]).append('\t').toString());
        if (C0088t.f2506a == 0) {
            this.f2218l.append(new StringBuffer().append("ID：").append(C0047bt.f831W[i]).append('\t').toString());
        }
        this.f2218l.append(new StringBuffer().append("等级：").append((int) C0047bt.f832X[i]).append('\t').toString());
        this.f2153au.m1593a(new String[]{"进入游戏", ""});
        return this.f2218l.toString();
    }

    /* renamed from: f */
    private void m1414f(Graphics graphics) {
        m1408c(graphics);
        if (this.f2149aq != null) {
            this.f2149aq.m1602a(graphics);
            C0055ca.m1292a(graphics, this.f2149aq.f2328a + 5, this.f2149aq.f2329b + 32, this.f2149aq.f2330c - 11, this.f2149aq.m1597a((this.f2161bB << 1) + 6), 1);
            int i = ((this.f2149aq.f2330c - (this.f2161bB << 1)) - 16) / 3;
            int iM1597a = ((this.f2149aq.m1597a(C0088t.f2519e <= 240 ? (this.f2161bB << 1) + 6 : 111) - (this.f2161bB << 1)) - 6) / 3;
            for (int i3 = 0; i3 < 2; ++i3) {
                for (int i5 = 0; i5 < 2; ++i5) {
                    m1397a((i3 << 1) + i5, ((this.f2161bB + i) * i5) + this.f2149aq.f2328a + 8 + i, ((this.f2161bB + iM1597a) * i3) + this.f2149aq.f2329b + 35 + iM1597a, this.f2161bB, this.f2161bB);
                    C0055ca.m1305a(graphics, (Image) null, this.f2162bC[(i3 << 1) + i5][0], this.f2162bC[(i3 << 1) + i5][1], this.f2161bB, this.f2161bB, i3 == this.f2160bA && i5 == this.f2206bz);
                }
            }
            if (this.f2204bx != null && C0047bt.f862aa != null && C0047bt.f862aa.length > 0) {
                int i6 = 0;
                while (true) {
                    int i7 = i6;
                    if (i7 >= C0047bt.f862aa.length) {
                        break;
                    }
                    if (this.f2204bx[i7] == null || i7 != (this.f2160bA << 1) + this.f2206bz) {
                        if (this.f2205by != null && i7 != (this.f2160bA << 1) + this.f2206bz) {
                            f2114f.m62a(graphics, this.f2205by[i7], (int[]) null, 0, 0, (this.f2162bC[i7][0] + 40) - 18, this.f2162bC[i7][1] + 45, 20, 0);
                        }
                    } else if (C0047bt.f834Z[i7] == 0) {
                        if (C0047bt.f833Y[i7] == 0) {
                            f2114f.m62a(graphics, this.f2204bx[i7], (int[]) null, 0, 0, this.f2162bC[i7][0] + 40 + 6, this.f2162bC[i7][1] + 45 + 1, 20, 0);
                        } else {
                            f2114f.m62a(graphics, this.f2204bx[i7], (int[]) null, 0, 0, this.f2162bC[i7][0] + 40 + 9, this.f2162bC[i7][1] + 45 + 16, 20, 0);
                        }
                    } else if (C0047bt.f834Z[i7] == 1) {
                        if (C0047bt.f833Y[i7] == 0) {
                            f2114f.m62a(graphics, this.f2204bx[i7], (int[]) null, 0, 0, this.f2162bC[i7][0] + 40 + 8, this.f2162bC[i7][1] + 45 + 14, 20, 0);
                        } else {
                            f2114f.m62a(graphics, this.f2204bx[i7], (int[]) null, 0, 0, (this.f2162bC[i7][0] + 40) - 1, this.f2162bC[i7][1] + 45 + 9, 20, 0);
                        }
                    } else if (C0047bt.f833Y[i7] == 0) {
                        f2114f.m62a(graphics, this.f2204bx[i7], (int[]) null, 0, 0, (this.f2162bC[i7][0] + 40) - 9, this.f2162bC[i7][1] + 45 + 10, 20, 0);
                    } else {
                        f2114f.m62a(graphics, this.f2204bx[i7], (int[]) null, 0, 0, (this.f2162bC[i7][0] + 40) - 3, this.f2162bC[i7][1] + 45 + 12, 20, 0);
                    }
                    i6 = i7 + 1;
                }
            }
        }
        if (this.f2207c == 1) {
            C0055ca.m1324c(graphics);
        } else if (this.f2207c == 2) {
            C0055ca.m1303a(graphics, "确认删除？", new String[]{"确认", "返回"});
        }
    }

    /* renamed from: g */
    private void m1415g(String str) {
        byte[] bArrM1137c = C0053bz.m1137c((short) 4250, str);
        if (bArrM1137c == null) {
            m1442b("获取上传指令数据错误!");
            return;
        }
        f2115i.m600a(new C0091w((short) 4250, bArrM1137c));
        m1434a((String) null);
    }

    /* renamed from: h */
    private void m1416h(String str) throws IOException {
        byte[] bArrM1137c = C0053bz.m1137c((short) 4251, str);
        if (bArrM1137c == null) {
            m1442b("获取上传指令数据错误!");
            return;
        }
        f2115i.m600a(new C0091w((short) 4251, bArrM1137c));
        m1434a((String) null);
    }

    /* renamed from: i */
    private void m1417i(String str) throws IOException {
        C0047bt.f1170gQ = (short) 1;
        byte[] bArrM1117b = C0053bz.m1117b((short) 4103, str);
        if (bArrM1117b == null) {
            m1442b("获取上传指令数据错误!");
            return;
        }
        f2115i.m600a(new C0091w((short) 4103, bArrM1117b));
        m1434a((String) null);
    }

    /* renamed from: j */
    private static boolean m1418j(String str) {
        String[] strArrListRecordStores = RecordStore.listRecordStores();
        if (strArrListRecordStores == null) {
            return false;
        }
        for (int length = strArrListRecordStores.length - 1; length >= 0; length--) {
            if (strArrListRecordStores[length].equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    private static Image m1419k(String str) {
        try {
            return Image.createImage(str);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: s */
    private static void m1420s() {
        if (f2115i != null) {
            f2115i.m604d();
            f2115i = null;
        }
    }

    /* renamed from: t */
    private void m1421t() {
        if (f2113e == null) {
            m1426y();
        } else {
            f2113e.m461h((byte) 1);
            m1434a((String) null);
        }
        this.f2138aS = null;
    }

    /* renamed from: u */
    private static boolean m1422u() {
        return C0047bt.f1050eC != null && C0047bt.f1050eC.equals("数据更新失败:");
    }

    /* renamed from: v */
    private void m1423v() {
        C0088t.f2537w = false;
        if (m1418j("dcn_user_info.db")) {
            try {
                RecordStore recordStoreM1395a = m1395a("dcn_user_info.db", false);
                DataInputStream dataInputStreamM1389a = m1389a(recordStoreM1395a);
                if (dataInputStreamM1389a != null) {
                    C0088t.f2537w = dataInputStreamM1389a.readBoolean();
                    this.f2185ba = dataInputStreamM1389a.readByte();
                    C0029bb.f557k = dataInputStreamM1389a.readBoolean();
                    C0047bt.f888b = dataInputStreamM1389a.readUTF();
                    C0047bt.f941c = dataInputStreamM1389a.readUTF();
                    dataInputStreamM1389a.close();
                }
                if (recordStoreM1395a != null) {
                    recordStoreM1395a.closeRecordStore();
                }
            } catch (RecordStoreException e) {
                e.printStackTrace();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        this.f2129aD = new Form(C0088t.f2537w ? "登录当乐通行证" : "登录一哥哥通行证");
        this.f2186bb = new ChoiceGroup((String) null, 1);
        this.f2186bb.append("官方帐号登录", (Image) null);
        this.f2186bb.append("当乐帐号登录", (Image) null);
        this.f2187bc = m1411e(C0088t.f2537w ? 1 : 0);
        this.f2188bd = new ChoiceGroup((String) null, 2, new String[]{"记住密码"}, (Image[]) null);
        this.f2172bN = new TextField("帐  号:", (String) null, 16, 0);
        this.f2173bO = new TextField("密  码:", (String) null, 16, 65536);
        if (C0029bb.f557k) {
            this.f2186bb.setSelectedIndex(C0088t.f2537w ? 1 : 0, true);
            this.f2187bc.setSelectedIndex(this.f2185ba, true);
            this.f2188bd.setSelectedIndex(0, true);
            this.f2172bN.setString(C0047bt.f888b);
            this.f2173bO.setString(C0047bt.f941c);
        }
        this.f2129aD.setItemStateListener(new C0069d(this));
        this.f2129aD.append(this.f2186bb);
        this.f2129aD.append(this.f2187bc);
        this.f2129aD.append(this.f2172bN);
        this.f2129aD.append(this.f2173bO);
        this.f2129aD.append(this.f2188bd);
        this.f2129aD.append("温馨提示：如果有当乐帐号的用户可以在帐号选择使用当乐帐号进行登录游戏！");
        this.f2174bP = new Command("登陆", 4, 1);
        this.f2175bQ = new Command("返回", 2, 1);
        this.f2129aD.addCommand(this.f2174bP);
        this.f2129aD.addCommand(this.f2175bQ);
        this.f2129aD.setCommandListener(this);
        this.f2222q.setCurrent(this.f2129aD);
    }

    /* renamed from: w */
    private void m1424w() {
        if (f2112bv) {
            return;
        }
        m1425x();
        this.f2194bj = m1419k("/images/light_0.png");
        this.f2195bk = m1419k("/images/light_1.png");
        int i = C0088t.f2516b / 9;
        this.f2198bq = new int[8];
        for (int i2 = 0; i2 < this.f2198bq.length; i2++) {
            this.f2198bq[i2] = (i2 + 1) * i;
        }
        this.f2197bp = new int[8][5];
        for (int i3 = 0; i3 < this.f2197bp.length; i3++) {
            for (int i4 = 0; i4 < this.f2197bp[i3].length; i4++) {
                this.f2197bp[i3] = m1427z();
            }
        }
        if (f2109bl == null) {
            C0048bu c0048bu = new C0048bu("/", "cartoon");
            f2109bl = c0048bu;
            c0048bu.m999d();
            if (f2109bl.m992b() != 0) {
                f2110bm = f2109bl.m991b("hudie");
                f2111bn = f2109bl.m991b("hudie_2");
            }
        }
        this.f2192bh = m1419k(new StringBuffer().append("/images/").append(C0088t.f2517c <= 220 ? "logoTitle_M.png" : "logoTitle_B.png").toString());
        this.f2191bg = m1419k("/images/menuBG.png");
        this.f2193bi = m1419k("/images/menuItem.png");
        f2112bv = true;
    }

    /* renamed from: x */
    private void m1425x() {
        this.f2194bj = null;
        this.f2195bk = null;
        f2110bm = null;
        f2111bn = null;
        f2109bl = null;
        this.f2192bh = null;
        this.f2191bg = null;
        this.f2193bi = null;
        f2112bv = false;
    }

    /* renamed from: y */
    private void m1426y() {
        if ("mhxy060".equals(C0088t.f2536v)) {
            this.f2189be = m1419k("/jy_logo.png");
        } else {
            this.f2189be = m1419k("/logo.png");
        }
        this.f2190bf = m1419k("/images/loading.png");
        this.f2148al = 0L;
        this.f2216j = (short) 9;
        this.f2217k = (short) 9;
        m1439b();
    }

    /* renamed from: z */
    private int[] m1427z() {
        return new int[]{this.f2198bq[C0055ca.m1331f(1, 100) % 8], C0088t.f2517c + C0055ca.m1331f(1, 200), 1, 1, C0055ca.m1331f(1, 100) % 2};
    }

    /* renamed from: a */
    public final int m1428a(int i, int i2) {
        return (i < this.f2141aV || i > this.f2141aV + this.f2143aX || i2 < this.f2142aW || i2 > this.f2142aW + this.f2144aY) ? 536870912 : 0;
    }

    /* renamed from: a */
    public final C0030bc m1429a(C0030bc c0030bc, byte b, byte b2, byte b3, byte b4, boolean z) {
        C0088t.f2513ag.delete(0, C0088t.f2513ag.length());
        C0088t.f2513ag.append("f").append(C0088t.f2501V[b]).append(C0088t.f2502W[b2]).append((int) b4).append(C0088t.f2503X[3]).append(z ? 1 : 2);
        String string = C0088t.f2513ag.toString();
        f2096ab.m1000d(string);
        C0030bc c0030bcM991b = f2096ab.m991b(string);
        return c0030bcM991b != null ? c0030bcM991b.m628b() : c0030bcM991b;
    }

    /* renamed from: a */
    public final void m1430a() {
        f2096ab.m998c();
        f2099ae.m998c();
        f2100af.m998c();
        f2102ah.m998c();
        this.f2218l = new StringBuffer();
        this.f2149aq = new C0081m();
        this.f2150ar = new C0054c();
        this.f2153au = new C0080l();
        this.f2151as = new C0082n();
        this.f2152at = new C0014an();
    }

    /* renamed from: a */
    public final void m1431a(byte b, String str, String str2, String str3, String str4, String str5, String str6) {
        this.f2183bY = (byte) 0;
        C0047bt.f823O.f2263q = str5;
        C0047bt.f823O.f2264r = str6;
        boolean zEquals = str.equals("回复邮件");
        if (this.f2183bY == 0) {
            this.f2129aD = new Form(str);
            if (zEquals) {
                this.f2179bU = new StringItem("收件人: ", str3);
            } else {
                this.f2170bL = new TextField("收件人: ", str3, 10, 0);
            }
            this.f2128aC = new TextField("标    题: ", str2, 10, 0);
            this.f2171bM = new TextField("正    文: ", str4, 100, 0);
            this.f2174bP = new Command("发送", 3, 0);
            this.f2175bQ = new Command("返回", 1, 5);
            if (!zEquals) {
                this.f2176bR = new Command("选择收件人", 1, 5);
            }
            this.f2177bS = new StringItem("温馨提示", "★请保护好个人帐号，勿在邮件内容中泄漏任何与财产相关的信息，后果需自负。");
            this.f2178bT = new StringItem((String) null, "★官方与玩家联系使用系统邮件形式，慎访私人邮件冒用官方名义行骗。");
            this.f2129aD.addCommand(this.f2174bP);
            if (!zEquals) {
                this.f2129aD.addCommand(this.f2176bR);
            }
            this.f2129aD.addCommand(this.f2175bQ);
            this.f2129aD.append(this.f2128aC);
            if (zEquals) {
                this.f2129aD.append(this.f2179bU);
            } else {
                this.f2129aD.append(this.f2170bL);
            }
            this.f2129aD.append(this.f2171bM);
            this.f2129aD.append(this.f2177bS);
            this.f2129aD.append(this.f2178bT);
            this.f2129aD.setCommandListener(this);
            this.f2222q.setCurrent(this.f2129aD);
        }
    }

    /* renamed from: a */
    public final void m1432a(int i) throws IOException {
        String str;
        m1420s();
        if (C0022av.f446h == 1) {
            if (C0047bt.f1208hB[i].equals("")) {
                m1442b(new StringBuffer().append(C0047bt.f1207hA[i]).append("繁忙,请选择其他服!").toString());
                str = null;
            } else {
                str = C0047bt.f1208hB[i];
                m1398a("http://117.135.138.130:7099", (byte) 1);
                C0053bz.f1804a = (byte) C0047bt.f1210hD[i];
                C0053bz.f1805b = (byte) C0047bt.f1211hE[i];
                m1401a(C0047bt.f1211hE[i]);
            }
        } else if (C0047bt.f1209hC[i].equals("")) {
            m1442b(new StringBuffer().append(C0047bt.f1207hA[i]).append("繁忙,请选择其他服!").toString());
            str = null;
        } else {
            str = C0047bt.f1209hC[i];
            m1398a(str, (byte) 2);
            C0053bz.f1804a = (byte) C0047bt.f1210hD[i];
            C0053bz.f1805b = (byte) C0047bt.f1211hE[i];
            m1401a(C0047bt.f1211hE[i]);
        }
        m1436a(str, "http://117.135.138.130:7099");
        byte[] bArrM1099a = C0053bz.m1099a((short) 4096, C0047bt.f1257hy, C0047bt.f1258hz, C0088t.f2536v, C0047bt.f1255hw);
        if (bArrM1099a == null) {
            m1442b("获取上传指令数据错误!");
            return;
        }
        C0091w c0091w = new C0091w((short) 4096, bArrM1099a);
        c0091w.f2563a = true;
        f2115i.m600a(c0091w);
        this.f2145aZ = false;
        m1434a((String) null);
    }

    /* renamed from: a */
    public final void m1433a(Exception exc, byte b) {
        exc.printStackTrace();
        if (f2113e != null) {
            f2113e.f282c = false;
            f2113e.f195Y = -1;
            C0015ao.m115R();
            if (f2113e.f356g != null) {
                f2113e.f356g.m754l();
            }
            C0015ao c0015ao = f2113e;
            f2113e.f358k = (short) 0;
            c0015ao.f357j = (short) 0;
            this.f2217k = (short) 7;
            this.f2216j = (short) 7;
        }
        C0047bt.f816H = null;
        C0047bt.f821M = null;
        C0047bt.f817I = null;
        C0047bt.f822N = null;
        C0047bt.f880as = (short) -1;
        this.f2221p = false;
        if (b == 1) {
            m1442b(new StringBuffer().append("系统异常<").append((int) b).append(">").toString());
        }
    }

    /* renamed from: a */
    public final void m1434a(String str) {
        int i = (C0088t.f2516b * 6) / 11;
        int i2 = i >= 110 ? i > 160 ? 160 : i : 110;
        C0055ca.m1284a((C0088t.f2516b - i2) / 2, (C0088t.f2517c / 2) + 15, i2, 20, str);
        this.f2135aP = this.f2147ak;
        this.f2216j = (short) 1;
    }

    /* renamed from: a */
    public final void m1435a(String str, int i) {
        this.f2129aD = new Form(str);
        if (i == 2) {
            this.f2128aC = new TextField(str, (String) null, 9, i);
        } else if (str.equals("聊天")) {
            if (f2113e.f358k == 18) {
                if (f2113e.f212aR) {
                    this.f2128aC = new TextField(new StringBuffer().append("与").append(f2113e.f211aQ).append("私聊").toString(), (String) null, 30, i);
                } else {
                    this.f2128aC = new TextField(C0088t.f2484E[f2113e.f214aT], (String) null, 30, i);
                }
            } else if (f2113e.f358k == 7) {
                if (this.f2151as.f2353a < 3) {
                    this.f2128aC = new TextField(new StringBuffer().append("与").append(C0047bt.f1163gJ[this.f2150ar.m1275g()]).append("私聊").toString(), (String) null, 30, i);
                } else if (C0047bt.f933bs == 1) {
                    if (C0055ca.f1895o == 3) {
                        this.f2128aC = new TextField("群聊", (String) null, 30, i);
                    } else if (C0055ca.f1895o == 4) {
                        this.f2128aC = new TextField(new StringBuffer().append("与").append(C0047bt.f1683q[this.f2150ar.m1275g()].f397e).append("私聊").toString(), (String) null, 30, i);
                    }
                } else if (C0047bt.f933bs == 0) {
                    if (C0055ca.f1895o == 0) {
                        this.f2128aC = new TextField("群聊", (String) null, 30, i);
                    } else if (C0055ca.f1895o == 1) {
                        this.f2128aC = new TextField(new StringBuffer().append("与").append(C0047bt.f1683q[this.f2150ar.m1275g()].f397e).append("私聊").toString(), (String) null, 30, i);
                    }
                }
            } else if (f2113e.f358k == 19) {
                this.f2128aC = new TextField(new StringBuffer().append("与").append(C0047bt.f1006dL[this.f2150ar.m1275g() - 1]).append("私聊").toString(), (String) null, 30, i);
            } else if (f2113e.f358k == 47) {
                this.f2128aC = new TextField(new StringBuffer().append("与").append(C0047bt.f1311iz[this.f2150ar.m1275g()]).append("私聊").toString(), (String) null, 30, i);
            } else {
                this.f2128aC = new TextField("聊天", (String) null, 30, i);
            }
        } else if (str.equals("输入帮派宗旨") || str.equals("输入帮派新宗旨") || str.equals("输入公告")) {
            this.f2128aC = new TextField(str, (String) null, 100, i);
        } else if (str.equals("输入帮派名称") || str.equals("请输入要搜索的帮派名称")) {
            this.f2128aC = new TextField(str, (String) null, 6, i);
        } else if (str.equals("请输入警告语（30个字符内）") || str.equals("输入兑换码")) {
            this.f2128aC = new TextField(str, (String) null, 30, i);
        } else {
            this.f2128aC = new TextField(str, (String) null, 5, i);
        }
        this.f2175bQ = new Command("返回", 8, 1);
        this.f2174bP = new Command("确定", 2, 1);
        if (str.equals("聊天")) {
            this.f2176bR = new Command("表情", 8, 1);
            this.f2129aD.addCommand(this.f2176bR);
        }
        this.f2129aD.addCommand(this.f2174bP);
        this.f2129aD.addCommand(this.f2175bQ);
        this.f2129aD.append(this.f2128aC);
        this.f2129aD.setCommandListener(this);
        this.f2222q.setCurrent(this.f2129aD);
        if (str.equals("聊天")) {
            m1400a(this.f2128aC, this.f2184bZ);
        }
    }

    /* renamed from: a */
    public final void m1436a(String str, String str2) {
        if (f2115i == null) {
            f2115i = new C0022av();
        } else {
            m1398a(str, (byte) 2);
            f2115i.m601b();
        }
        f2115i.m598a(this);
    }

    /* renamed from: a */
    public final void m1437a(String str, String str2, String str3, String str4) {
        this.f2129aD = new Form("邮件举报");
        this.f2128aC = new TextField("举报理由: ", "", 100, 0);
        this.f2177bS = new StringItem("举报邮件：", "");
        this.f2178bT = new StringItem("发件人：", str2);
        this.f2179bU = new StringItem("标    题：", str3);
        this.f2180bV = new StringItem("正    文：", str4);
        this.f2181bW = str;
        this.f2174bP = new Command("举报", 3, 0);
        this.f2175bQ = new Command("返回", 1, 5);
        this.f2129aD.addCommand(this.f2174bP);
        this.f2129aD.addCommand(this.f2175bQ);
        this.f2129aD.append(this.f2128aC);
        this.f2129aD.append(this.f2177bS);
        this.f2129aD.append(this.f2178bT);
        this.f2129aD.append(this.f2179bU);
        this.f2129aD.append(this.f2180bV);
        this.f2222q.setCurrent(this.f2129aD);
        this.f2129aD.setCommandListener(this);
        this.f2222q.setCurrent(this.f2129aD);
    }

    /* renamed from: a */
    public final void m1438a(boolean z) {
        this.f2137aR = false;
    }

    /* renamed from: b */
    public final void m1439b() {
        repaint();
        serviceRepaints();
    }

    /* renamed from: b */
    public final void m1440b(int i)  {
        m1424w();
        this.f2162bC = new int[6][4];
        C0055ca.f1892l = 0;
        C0055ca.f1888h = 0;
        C0055ca.f1895o = 0;
        this.f2207c = (short) 0;
        this.f2126a = 0;
        this.f2159b = 0;
        C0047bt.m786O();
        m1378A();
        if (i <= 0 && this.f2217k != 6) {
            this.f2204bx = null;
            this.f2205by = null;
            this.f2161bB = 45;
            m1380C();
            return;
        }
        this.f2204bx = new C0030bc[i];
        this.f2205by = new C0030bc[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.f2204bx[i2] = m1429a(this.f2204bx[i2], C0047bt.f834Z[i2], C0047bt.f833Y[i2], (byte) 3, (byte) 1, false);
            this.f2205by[i2] = m1429a(this.f2205by[i2], C0047bt.f834Z[i2], C0047bt.f833Y[i2], (byte) 3, (byte) 1, true);
        }
        this.f2161bB = 55;
        this.f2206bz = (byte) 0;
        this.f2160bA = (byte) 0;
        this.f2149aq.m1604b();
        this.f2149aq.m1601a("角色列表");
        this.f2149aq.m1597a((this.f2161bB << 1) + 6);
        this.f2152at.m79b(m1413f(0), C0088t.f2523i, (byte) 1);
        this.f2152at.m75a((byte) 1);
        this.f2149aq.m1600a(this.f2152at);
        if (C0088t.f2517c > 220) {
            this.f2153au.m1593a(new String[]{"进入游戏", ""});
            this.f2149aq.m1600a(this.f2153au);
        }
        this.f2149aq.m1598a(C0088t.f2520f, C0088t.f2521g, C0088t.f2518d, C0088t.f2519e);
        m1424w();
        this.f2216j = (short) 5;
        this.f2217k = (short) 5;
    }

    /* renamed from: b */
    public final void m1441b(int i, int i2) {
        int i3 = i - 8;
        int i4 = i2 - 16;
        Vector vector = new Vector();
        this.f2208ca = (f2113e.f181I.f402j % 16 == 0 ? 0 : 1) + (f2113e.f181I.f402j / 16);
        this.f2209cb = (f2113e.f181I.f403k % 16 == 0 ? 0 : 1) + (f2113e.f181I.f403k / 16);
        this.f2210cc = (i3 % 16 == 0 ? 0 : 1) + (i3 / 16);
        this.f2211cd = (i4 % 16 == 0 ? 0 : 1) + (i4 / 16);
        if (this.f2208ca == this.f2210cc && this.f2209cb == this.f2211cd) {
            return;
        }
        for (int i5 = 0; i5 < f2113e.f355f.f464i.length; i5++) {
            for (int i6 = 0; i6 < f2113e.f355f.f464i[i5].length; i6++) {
                if (f2113e.f355f.f464i[i5][i6] == 1 && i3 >= (f2113e.f355f.f460e * i5) - 15 && i3 < ((f2113e.f355f.f460e * i5) + f2113e.f355f.f460e) - 15 && i4 >= (f2113e.f355f.f461f * i6) - f2113e.f355f.f461f && i4 < f2113e.f355f.f461f * i6) {
                    return;
                }
            }
        }
        Vector vectorM1659a = f2115i.m597a().m1659a(f2113e.f355f, vector, new C0046bs(this.f2208ca, this.f2209cb), new C0046bs(this.f2210cc, this.f2211cd));
        if (vectorM1659a.isEmpty()) {
            return;
        }
        int size = vectorM1659a.size();
        f2113e.f181I.f17c.removeAllElements();
        int i7 = 0;
        while (i7 < size) {
            C0046bs c0046bs = (C0046bs) vectorM1659a.elementAt(i7);
            C0046bs c0046bs2 = i7 < size + (-1) ? (C0046bs) vectorM1659a.elementAt(i7 + 1) : c0046bs;
            if (c0046bs.f806a != c0046bs2.f806a) {
                if (c0046bs.f806a > c0046bs2.f806a) {
                    for (int i8 = 0; i8 < 4; i8++) {
                        f2113e.f181I.f17c.addElement(new short[]{(short) ((c0046bs.f806a << 4) - (i8 << 2)), (short) (c0046bs.f807b << 4)});
                    }
                } else {
                    for (int i9 = 0; i9 < 4; i9++) {
                        f2113e.f181I.f17c.addElement(new short[]{(short) ((c0046bs.f806a << 4) + (i9 << 2)), (short) (c0046bs.f807b << 4)});
                    }
                }
            } else if (c0046bs.f807b != c0046bs2.f807b) {
                if (c0046bs.f807b > c0046bs2.f807b) {
                    for (int i10 = 0; i10 < 4; i10++) {
                        f2113e.f181I.f17c.addElement(new short[]{(short) (c0046bs.f806a << 4), (short) ((c0046bs.f807b << 4) - (i10 << 2))});
                    }
                } else {
                    for (int i11 = 0; i11 < 4; i11++) {
                        f2113e.f181I.f17c.addElement(new short[]{(short) (c0046bs.f806a << 4), (short) ((c0046bs.f807b << 4) + (i11 << 2))});
                    }
                }
            }
            i7++;
        }
    }

    /* renamed from: b */
    public final void m1442b(String str) {
        if (this.f2138aS != null && this.f2138aS.startsWith("系统异常")) {
            m1421t();
        }
        if (str != null && str.startsWith("系统异常")) {
            this.f2138aS = str;
        }
        if (C0047bt.f933bs == 1 && C0047bt.f1765s == 0 && C0047bt.f1050eC != null && C0047bt.f1050eC.startsWith("队伍成员位置信息不一致")) {
            f2113e.m364S();
            C0047bt.f1050eC = null;
            m1455i();
            return;
        }
        C0047bt.f1050eC = str;
        this.f2139aT = new C0050bw(C0047bt.f1050eC, (short) (C0088t.f2516b - 20));
        if (f2113e == null || f2113e.f358k != 25) {
            setFullScreenMode(true);
            this.f2213d.f2061b.setCurrent(this);
        }
        this.f2136aQ = this.f2147ak;
        this.f2137aR = true;
        if (this.f2139aT != null) {
            this.f2143aX = 0;
            this.f2143aX = this.f2139aT.f1789a;
            this.f2143aX = this.f2143aX + 20 > C0088t.f2516b ? C0088t.f2516b : this.f2143aX + 20;
            if (this.f2143aX < (C0088t.f2516b * 5) / 7) {
                this.f2143aX = (C0088t.f2516b * 5) / 7;
            }
            this.f2141aV = (C0088t.f2516b - this.f2143aX) / 2;
            this.f2144aY = (this.f2139aT.m1015a() * C0088t.f2524j) + 14;
            this.f2142aW = (C0088t.f2517c - this.f2144aY) / 2;
        }
        this.f2216j = (short) 2;
        if (!C0088t.f2529o || this.f2146aj == null) {
            return;
        }
        this.f2146aj.f2235e = -1;
        this.f2146aj.f2236f = -1;
    }

    /* renamed from: b */
    public final void m1443b(String str, String str2) {
        m1381D();
        if (str != null) {
            this.f2177bS = new StringItem(str, str2);
        }
        this.f2129aD = new Form("角色昵称");
        this.f2128aC = new TextField("角色昵称", (String) null, 5, 0);
        this.f2175bQ = new Command("返回", 8, 1);
        this.f2174bP = new Command("确定", 2, 1);
        this.f2129aD.addCommand(this.f2174bP);
        this.f2129aD.addCommand(this.f2175bQ);
        this.f2129aD.append(this.f2128aC);
        if (str != null) {
            this.f2129aD.append(this.f2177bS);
        }
        this.f2129aD.setCommandListener(this);
        this.f2222q.setCurrent(this.f2129aD);
    }

    /* renamed from: c */
    public final void m1444c() {
        C0053bz.f1804a = (byte) 90;
        m1424w();
        if (C0088t.f2506a == 0) {
            this.f2196bo = new String[]{"进入游戏", "更多游戏", "退出游戏"};
        } else if (C0088t.f2506a == 1) {
            this.f2196bo = new String[]{"登陆游戏", "注册游戏", "修改密码"};
        }
        this.f2207c = (short) 0;
        this.f2202bu = 0;
        C0055ca.f1892l = 0;
        C0055ca.f1888h = 0;
        if (C0088t.f2506a != 0) {
            if (f2104am == null && C0029bb.f559m != null) {
                f2104am = C0029bb.f559m;
                f2105an = C0029bb.f560n;
                f2106ao = C0029bb.f558l;
                f2107ap = C0029bb.f557k;
            }
            if (f2104am == null) {
                f2104am = "";
                if ("mhxy011".equals(C0088t.f2536v) || "mhxy278".equals(C0088t.f2536v)) {
                    this.f2207c = (short) 1;
                }
            }
            if (f2105an == null) {
                f2105an = "";
            }
            if (C0053bz.f1805b != 72) {
                m1420s();
                f2115i = null;
            }
        } else if (C0053bz.f1806c != 162) {
            C0053bz.f1806c = 162;
            m1420s();
        }
        C0047bt.m786O();
        m1378A();
        this.f2148al = 8L;
        this.f2200bs = 0;
        this.f2216j = (short) 14;
        this.f2217k = (short) 14;
    }

    /* renamed from: c */
    public final void m1445c(String str) {
        try {
            this.f2213d.platformRequest(str);
            m1384G();
        } catch (ConnectionNotFoundException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    public final void m1446c(String str, String str2) {
        new RunnableC0070e(this, str, str2);
    }

    public final void commandAction(Command command, Displayable displayable) {
        if (this.f2129aD == null) {
            return;
        }
        String title = this.f2129aD.getTitle();
        if (title.equals("登录当乐通行证") || title.equals("登录一哥哥通行证")) {
            if (!command.getLabel().equals("登陆")) {
                m1444c();
                this.f2213d.m1377a();
                return;
            }
            byte selectedIndex = (byte) this.f2187bc.getSelectedIndex();
            boolean zIsSelected = this.f2188bd.isSelected(0);
            String strTrim = this.f2172bN.getString().trim();
            String strTrim2 = this.f2173bO.getString().trim();
            if (zIsSelected) {
                byte b = (byte) (title.equals("登录当乐通行证") ? 0 : 1);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                try {
                    dataOutputStream.writeBoolean(b == 0);
                    dataOutputStream.writeByte(selectedIndex);
                    dataOutputStream.writeBoolean(true);
                    dataOutputStream.writeUTF(strTrim == null ? "" : strTrim);
                    dataOutputStream.writeUTF(strTrim2 == null ? "" : strTrim2);
                    m1402a(byteArrayOutputStream.toByteArray(), "dcn_user_info.db");
                    byteArrayOutputStream.close();
                    dataOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (!title.equals("登录当乐通行证")) {
                C0088t.f2537w = false;
                f2103ai.m1475a((byte) (selectedIndex + 1), strTrim, strTrim2);
                this.f2213d.m1377a();
                m1434a("请求中...");
                return;
            }
            C0088t.f2537w = true;
            C0068c.m1468b();
            byte[] bArrM1040a = C0053bz.m1040a((short) 5392, C0088t.f2533s, C0029bb.f547a, C0029bb.f548b, selectedIndex == 0 ? strTrim : "", selectedIndex == 1 ? strTrim : "", strTrim2, C0088t.f2536v, C0088t.f2485F, (int) Runtime.getRuntime().totalMemory(), C0088t.f2535u);
            m1436a("socket://120.78.151.213:20008", "http://117.135.138.130:7099");
            if (bArrM1040a == null) {
                m1442b("获取上传指令数据错误!");
                return;
            }
            f2115i.m600a(new C0091w((short) 5392, bArrM1040a));
            this.f2213d.m1377a();
            m1434a("正在登录...");
            return;
        }
        if (title.equals("登陆游戏")) {
            String label = command.getLabel();
            if (!label.equals("登陆")) {
                if (label.equals("返回")) {
                    m1444c();
                    this.f2126a = 0;
                    this.f2159b = 0;
                    this.f2213d.m1377a();
                    return;
                }
                return;
            }
            if (!this.f2172bN.getString().equals("") && !this.f2173bO.getString().equals("")) {
                this.f2145aZ = true;
                this.f2213d.m1377a();
                return;
            } else if (this.f2172bN.getString().equals("")) {
                m1442b("帐号不能为空!");
                return;
            } else {
                if (this.f2173bO.getString().equals("")) {
                    m1442b("密码不能为空!");
                    return;
                }
                return;
            }
        }
        if (title.equals("角色昵称")) {
            String label2 = command.getLabel();
            if (!label2.equals("确定")) {
                if (label2.equals("返回")) {
                    this.f2126a = 0;
                    this.f2159b = 0;
                    this.f2213d.m1377a();
                    return;
                }
                return;
            }
            if (this.f2128aC.getString().equals("")) {
                m1442b("昵称不能为空！");
                return;
            }
            this.f2157ay = this.f2128aC.getString().trim();
            m1381D();
            this.f2213d.m1377a();
            return;
        }
        if (title.equals("聊天")) {
            String label3 = command.getLabel();
            if (label3.equals("确定")) {
                if (this.f2128aC.getString() == null || this.f2128aC.getString().equals("")) {
                    this.f2213d.m1377a();
                    m1442b("不能发送空消息");
                    return;
                }
                if (f2113e.f357j == 1) {
                    C0015ao c0015ao = f2113e;
                    f2113e.f358k = (short) 0;
                    c0015ao.f357j = (short) 0;
                } else {
                    f2113e.f358k = f2113e.f357j;
                }
                this.f2126a = 0;
                this.f2159b = 0;
                this.f2213d.m1377a();
                if (f2113e.f358k == 0) {
                    f2114f.m57a(f2113e.f355f, C0015ao.f167h, C0015ao.f168i, true, false, 1009050);
                }
                this.f2214g = true;
                return;
            }
            if (!label3.equals("返回")) {
                if (label3.equals("表情")) {
                    f2113e.m359L();
                    this.f2213d.m1377a();
                    return;
                }
                return;
            }
            m1460n();
            if (f2113e.f357j == 1) {
                f2113e.f357j = (short) 0;
                f2113e.f358k = (short) 0;
            } else {
                f2113e.f358k = f2113e.f357j;
            }
            this.f2126a = 0;
            this.f2159b = 0;
            this.f2213d.m1377a();
            if (f2113e.f358k == 0) {
                f2114f.m57a(f2113e.f355f, C0015ao.f167h, C0015ao.f168i, true, false, 1009050);
                return;
            }
            return;
        }
        if (title.equals("物品关键字搜索")) {
            String label4 = command.getLabel();
            String string = this.f2128aC.getString();
            if (!label4.equals("确定") || string == null) {
                if (label4.equals("返回")) {
                    this.f2129aD = null;
                    this.f2128aC = null;
                    this.f2126a = 0;
                    this.f2159b = 0;
                    this.f2213d.m1377a();
                    return;
                }
                return;
            }
            f2113e.f215aU = this.f2150ar.m1275g();
            f2113e.f206aK = string;
            f2113e.f207aL = "";
            f2113e.f208aM = 1;
            f2113e.f209aN = 0;
            f2113e.m386a(f2113e.f206aK, f2113e.f207aL, f2113e.f208aM, f2113e.f209aN);
            this.f2213d.m1377a();
            m1434a((String) null);
            return;
        }
        if (title.equals("宠物关键字搜索")) {
            String label5 = command.getLabel();
            String string2 = this.f2128aC.getString();
            if (!label5.equals("确定") || string2 == null) {
                if (label5.equals("返回")) {
                    this.f2129aD = null;
                    this.f2128aC = null;
                    this.f2126a = 0;
                    this.f2159b = 0;
                    this.f2213d.m1377a();
                    return;
                }
                return;
            }
            f2113e.f215aU = this.f2150ar.m1275g();
            f2113e.f206aK = string2;
            f2113e.f207aL = "";
            f2113e.f208aM = 1;
            f2113e.f209aN = 0;
            f2113e.m424b(f2113e.f206aK, f2113e.f207aL, f2113e.f208aM, f2113e.f209aN);
            this.f2213d.m1377a();
            m1434a((String) null);
            return;
        }
        if (title.equals("宠物名称")) {
            String label6 = command.getLabel();
            String string3 = this.f2128aC.getString();
            if (!label6.equals("更改") || string3 == null) {
                if (label6.equals("返回")) {
                    this.f2213d.m1377a();
                    m1459m();
                    return;
                }
                return;
            }
            if (string3.length() == 0) {
                m1442b("名称为空！");
                return;
            } else {
                this.f2215h = true;
                this.f2213d.m1377a();
                return;
            }
        }
        if (title.equals("服务地址")) {
            String label7 = command.getLabel();
            if (label7.equals("确定")) {
                String string4 = this.f2128aC.getString();
                int selectedIndex2 = this.f2182bX.getSelectedIndex();
                m1385H();
                m1404b(string4, selectedIndex2 != 1 ? (byte) 2 : (byte) 1);
                return;
            }
            if (label7.equals("返回")) {
                m1385H();
                m1426y();
                this.f2213d.m1377a();
                this.f2126a = 0;
                this.f2159b = 0;
                return;
            }
            return;
        }
        if (title.equals("请输入拍卖价格") || title.equals("请输入取出银两") || title.equals("请输入存入银两") || title.equals("拍卖价格") || title.equals("输入交易银两") || title.equals("请输入决斗金额") || title.equals("捐献银两数量") || title.equals("取出银两数量") || title.equals("捐献经验数量") || title.equals("请输入决斗金额") || title.equals("请输入竞标银两")) {
            String label8 = command.getLabel();
            if (!label8.equals("确定")) {
                if (label8.equals("返回")) {
                    this.f2129aD = null;
                    this.f2128aC = null;
                    this.f2213d.m1377a();
                    this.f2126a = 0;
                    this.f2159b = 0;
                    return;
                }
                return;
            }
            if (this.f2128aC.getString() == "" || this.f2128aC.getString().substring(0, 1).equals("-")) {
                m1442b("输入有误,请重新输入");
                return;
            }
            f2113e.m477o();
            f2113e.f224ak.append(this.f2128aC.getString());
            this.f2213d.m1377a();
            this.f2126a = 0;
            this.f2159b = 0;
            return;
        }
        if (title.equals("输入帮派名称")) {
            String label9 = command.getLabel();
            String string5 = this.f2128aC.getString();
            if (!label9.equals("确定") || string5 == null) {
                if (label9.equals("返回")) {
                    f2113e.f183M.f372c = null;
                    m1386I();
                    this.f2213d.m1377a();
                    return;
                }
                return;
            }
            if (string5.length() == 0) {
                m1442b("名字输入错误！");
                return;
            }
            f2113e.f183M.f372c = string5;
            m1386I();
            m1435a("输入帮派宗旨", 0);
            return;
        }
        if (title.equals("输入帮派宗旨")) {
            String label10 = command.getLabel();
            String string6 = this.f2128aC.getString();
            if (!label10.equals("确定") || string6 == null) {
                if (label10.equals("返回")) {
                    f2113e.f183M.f372c = null;
                    f2113e.f183M.f373d = null;
                    m1386I();
                    this.f2213d.m1377a();
                    return;
                }
                return;
            }
            if (string6.length() == 0) {
                m1442b("请输入帮派宗旨！");
                return;
            }
            f2113e.f183M.f373d = string6;
            m1386I();
            C0017aq c0017aq = f2113e.f183M;
            if (c0017aq.f372c != null && c0017aq.f373d != null) {
                byte[] bArrM1132b = C0053bz.m1132b((short) 4197, C0047bt.f865ad, c0017aq.f372c, c0017aq.f373d);
                if (bArrM1132b != null) {
                    f2115i.m600a(new C0091w((short) 4197, bArrM1132b));
                } else {
                    c0017aq.f370a.f354e.m1442b("获取上传指令数据错误!");
                }
                c0017aq.f370a.f354e.m1434a((String) null);
            }
            this.f2213d.m1377a();
            return;
        }
        if (title.equals("输入帮派新宗旨")) {
            String label11 = command.getLabel();
            String string7 = this.f2128aC.getString();
            if (!label11.equals("确定") || string7 == null) {
                if (label11.equals("返回")) {
                    f2113e.f183M.f374e = null;
                    m1386I();
                    this.f2213d.m1377a();
                    return;
                }
                return;
            }
            if (string7.length() == 0) {
                m1442b("请输入帮派宗旨！");
                return;
            }
            f2113e.f183M.f374e = string7;
            m1386I();
            C0017aq c0017aq2 = f2113e.f183M;
            if (c0017aq2.f374e != null) {
                byte[] bArrM1192i = C0053bz.m1192i((short) 4216, C0047bt.f865ad, c0017aq2.f374e);
                if (bArrM1192i != null) {
                    f2115i.m600a(new C0091w((short) 4216, bArrM1192i));
                } else {
                    c0017aq2.f371b.m1442b("获取上传指令数据错误!");
                }
                c0017aq2.f371b.m1434a((String) null);
            }
            this.f2213d.m1377a();
            return;
        }
        if (title.equals("输入玩家名称")) {
            String label12 = command.getLabel();
            String string8 = this.f2128aC.getString();
            if (!label12.equals("确定") || string8 == null) {
                if (label12.equals("返回")) {
                    this.f2213d.m1377a();
                    m1386I();
                    return;
                }
                return;
            }
            if (string8.length() == 0) {
                m1442b("名称不能为空！");
                return;
            }
            f2113e.f183M.f375f = string8;
            m1386I();
            f2113e.f183M.m532h();
            this.f2213d.m1377a();
            return;
        }
        if (title.equals("输入招募金额")) {
            String label13 = command.getLabel();
            if (!label13.equals("确定")) {
                if (label13.equals("返回")) {
                    this.f2129aD = null;
                    this.f2128aC = null;
                    this.f2213d.m1377a();
                    return;
                }
                return;
            }
            if (this.f2128aC.getString() != "") {
                f2113e.m477o();
                f2113e.f224ak.append(this.f2128aC.getString());
                if (f2113e.m475n() < 0) {
                    m1442b("输入有误,请重新输入");
                    return;
                }
                f2113e.f183M.m510a(f2113e.m475n());
                f2113e.f183M.m507a();
                this.f2213d.m1377a();
                return;
            }
            return;
        }
        if (title.equals("请输入贡献金额")) {
            String label14 = command.getLabel();
            if (!label14.equals("确定")) {
                if (label14.equals("返回")) {
                    this.f2129aD = null;
                    this.f2128aC = null;
                    this.f2213d.m1377a();
                    return;
                }
                return;
            }
            if (this.f2128aC.getString() == "") {
                m1442b("请输入金额");
                return;
            }
            f2113e.m477o();
            f2113e.f224ak.append(this.f2128aC.getString());
            if (f2113e.m475n() < 0) {
                m1442b("输入有误,请重新输入");
                return;
            }
            if (f2113e.m475n() > C0047bt.f877ap) {
                m1442b("您没有这么多银两,请重新输入！");
                return;
            }
            int[] iArr = f2113e.f183M.f380k;
            C0017aq c0017aq3 = f2113e.f183M;
            long jM475n = f2113e.m475n();
            c0017aq3.f379j = jM475n;
            iArr[0] = (int) jM475n;
            this.f2213d.m1377a();
            return;
        }
        if (title.equals("请输入银两奖励")) {
            String label15 = command.getLabel();
            if (!label15.equals("确定")) {
                if (label15.equals("返回")) {
                    this.f2129aD = null;
                    this.f2128aC = null;
                    this.f2213d.m1377a();
                    return;
                }
                return;
            }
            if (this.f2128aC.getString() == "") {
                m1442b("请输入银两");
                return;
            }
            f2113e.m477o();
            f2113e.f224ak.append(this.f2128aC.getString());
            if (f2113e.m475n() < 0) {
                m1442b("输入有误,请重新输入");
                return;
            }
            if (f2113e.m475n() > C0047bt.f1272iM[1]) {
                m1442b(new StringBuffer().append("最多只能配置").append(C0047bt.m809a(C0047bt.f1272iM[1])).append(",请重新输入！").toString());
                return;
            }
            int[] iArr2 = f2113e.f183M.f378i;
            int[] iArr3 = C0047bt.f1272iM;
            int iM475n = (int) f2113e.m475n();
            iArr3[0] = iM475n;
            iArr2[1] = iM475n;
            this.f2213d.m1377a();
            return;
        }
        if (title.equals("请输入物品掉率")) {
            String label16 = command.getLabel();
            if (!label16.equals("确定")) {
                if (label16.equals("返回")) {
                    this.f2129aD = null;
                    this.f2128aC = null;
                    this.f2213d.m1377a();
                    return;
                }
                return;
            }
            if (this.f2128aC.getString() == "") {
                m1442b("请输入掉率");
                return;
            }
            f2113e.m477o();
            f2113e.f224ak.append(this.f2128aC.getString());
            if (f2113e.m475n() < 0) {
                m1442b("输入有误,请重新输入");
                return;
            }
            if (f2113e.m475n() > C0047bt.f1270iK[1]) {
                m1442b(new StringBuffer().append("最多只能配置").append((int) C0047bt.f1270iK[1]).append("%,请重新输入！").toString());
                return;
            }
            int[] iArr4 = f2113e.f183M.f378i;
            byte bM475n = (byte) f2113e.m475n();
            C0047bt.f1270iK[0] = bM475n;
            iArr4[0] = bM475n;
            this.f2213d.m1377a();
            return;
        }
        if (title.equals("请输入经验加成")) {
            String label17 = command.getLabel();
            if (!label17.equals("确定")) {
                if (label17.equals("返回")) {
                    this.f2129aD = null;
                    this.f2128aC = null;
                    this.f2213d.m1377a();
                    return;
                }
                return;
            }
            if (this.f2128aC.getString() == "") {
                m1442b("请输入加成");
                return;
            }
            f2113e.m477o();
            f2113e.f224ak.append(this.f2128aC.getString());
            if (f2113e.m475n() < 0) {
                m1442b("输入有误,请重新输入");
                return;
            }
            if (f2113e.m475n() > C0047bt.f1271iL[1]) {
                m1442b(new StringBuffer().append("最多只能配置").append((int) C0047bt.f1271iL[1]).append("%,请重新输入！").toString());
                return;
            }
            int[] iArr5 = f2113e.f183M.f378i;
            byte bM475n2 = (byte) f2113e.m475n();
            C0047bt.f1271iL[0] = bM475n2;
            iArr5[2] = bM475n2;
            this.f2213d.m1377a();
            return;
        }
        if (title.equals("输入公告")) {
            String label18 = command.getLabel();
            String string9 = this.f2128aC.getString();
            if (!label18.equals("确定") || string9 == null) {
                if (label18.equals("返回")) {
                    f2113e.f183M.f377h = null;
                    m1386I();
                    this.f2213d.m1377a();
                    return;
                }
                return;
            }
            if (string9.length() == 0) {
                m1442b("请输入公告！");
                return;
            }
            f2113e.f183M.f377h = string9;
            m1386I();
            C0017aq c0017aq4 = f2113e.f183M;
            byte[] bArrM1221n = C0053bz.m1221n((short) 4218, C0047bt.f865ad, c0017aq4.f377h);
            if (bArrM1221n != null) {
                f2115i.m600a(new C0091w((short) 4218, bArrM1221n));
                c0017aq4.f371b.m1434a((String) null);
            } else {
                c0017aq4.f371b.m1442b("获取上传指令数据错误!");
            }
            this.f2213d.m1377a();
            return;
        }
        if (title.equals("输入“OK” 删除角色")) {
            String label19 = command.getLabel();
            String string10 = this.f2128aC.getString();
            if (!label19.equals("确定") || string10 == null) {
                if (label19.equals("返回")) {
                    this.f2129aD = null;
                    this.f2213d.m1377a();
                    return;
                }
                return;
            }
            if (!string10.equals("OK")) {
                m1442b("请输入“OK” ！");
                return;
            }
            byte[] bArrM1054a = C0053bz.m1054a((short) 4100, C0047bt.f831W[this.f2155aw]);
            if (bArrM1054a != null) {
                f2115i.m600a(new C0091w((short) 4100, bArrM1054a));
                m1434a((String) null);
            } else {
                m1442b("获取上传指令数据错误!");
            }
            this.f2213d.m1377a();
            return;
        }
        if (title.equals("请输入好友昵称")) {
            String label20 = command.getLabel();
            if (label20.equals("确定")) {
                if (this.f2128aC.getString().equals("")) {
                    m1442b("昵称不能为空！");
                    return;
                }
                f2113e.m388a(this.f2128aC.getString(), true);
                this.f2126a = 0;
                this.f2159b = 0;
                this.f2213d.m1377a();
                return;
            }
            if (label20.equals("返回")) {
                this.f2129aD = null;
                this.f2128aC = null;
                this.f2126a = 0;
                this.f2159b = 0;
                this.f2213d.m1377a();
                return;
            }
            return;
        }
        if (title.equals("重要物品输入OK丢弃")) {
            String label21 = command.getLabel();
            String string11 = this.f2128aC.getString();
            if (!label21.equals("确定") || string11 == null) {
                if (label21.equals("返回")) {
                    this.f2129aD = null;
                    this.f2128aC = null;
                    this.f2126a = 0;
                    this.f2159b = 0;
                    this.f2213d.m1377a();
                    return;
                }
                return;
            }
            if (!string11.equals("OK")) {
                m1442b("请输入“OK” ！");
                return;
            }
            f2113e.m454f(f2113e.f221ag);
            this.f2126a = 0;
            this.f2159b = 0;
            this.f2213d.m1377a();
            return;
        }
        if (title.equals("输入OK确认解散帮派")) {
            String label22 = command.getLabel();
            String string12 = this.f2128aC.getString();
            if (!label22.equals("确定") || string12 == null) {
                if (label22.equals("返回")) {
                    this.f2129aD = null;
                    this.f2128aC = null;
                    this.f2126a = 0;
                    this.f2159b = 0;
                    f2113e.f359l = (short) 0;
                    this.f2213d.m1377a();
                    return;
                }
                return;
            }
            if (!string12.equals("OK")) {
                m1442b("如需要解散帮派，请输入“OK”！");
                return;
            }
            C0017aq c0017aq5 = f2113e.f183M;
            byte[] bArrM1218n = C0053bz.m1218n((short) 4214, C0047bt.f865ad);
            if (bArrM1218n != null) {
                f2115i.m600a(new C0091w((short) 4214, bArrM1218n));
                c0017aq5.f371b.m1434a((String) null);
            } else {
                c0017aq5.f371b.m1442b("获取上传指令数据错误!");
            }
            this.f2126a = 0;
            this.f2159b = 0;
            this.f2213d.m1377a();
            return;
        }
        if (title.equals("请输入要搜索的帮派名称")) {
            String label23 = command.getLabel();
            String string13 = this.f2128aC.getString();
            if (!label23.equals("确定") || string13 == null) {
                if (label23.equals("返回")) {
                    m1386I();
                    this.f2126a = 0;
                    this.f2159b = 0;
                    this.f2213d.m1377a();
                    return;
                }
                return;
            }
            C0047bt.f1170gQ = (short) 1;
            if (string13.length() == 0) {
                f2113e.f183M.f384o = "";
                f2113e.f183M.m511a(f2113e.f183M.f384o);
            } else {
                f2113e.f183M.f384o = string13;
                f2113e.f183M.m511a(f2113e.f183M.f384o);
            }
            m1386I();
            this.f2126a = 0;
            this.f2159b = 0;
            this.f2213d.m1377a();
            return;
        }
        if (title.equals("输入OK确认宣战")) {
            String label24 = command.getLabel();
            String string14 = this.f2128aC.getString();
            if (label24.equals("确定") && string14 != null) {
                if (!string14.equals("OK")) {
                    m1442b("确定宣战，请输入“OK”！");
                    return;
                }
                f2113e.f183M.m508a((byte) 3, C0047bt.f1337jY[this.f2150ar.m1275g() - 1]);
                this.f2126a = 0;
                this.f2159b = 0;
                this.f2213d.m1377a();
                return;
            }
            if (label24.equals("返回")) {
                this.f2129aD = null;
                this.f2128aC = null;
                this.f2126a = 0;
                this.f2159b = 0;
                f2113e.f359l = (short) 0;
                this.f2213d.m1377a();
                return;
            }
            return;
        }
        if (title.equals("重要物品输入OK卖出")) {
            String label25 = command.getLabel();
            String string15 = this.f2128aC.getString();
            if (!label25.equals("确定") || string15 == null) {
                if (label25.equals("返回")) {
                    this.f2129aD = null;
                    this.f2128aC = null;
                    this.f2126a = 0;
                    this.f2159b = 0;
                    this.f2213d.m1377a();
                    return;
                }
                return;
            }
            if (!string15.equals("OK")) {
                m1442b("请输入“OK” ！");
                return;
            }
            f2113e.m474m(f2113e.f221ag);
            this.f2126a = 0;
            this.f2159b = 0;
            this.f2213d.m1377a();
            return;
        }
        if (title.equals("请输入警告语（30个字符内）")) {
            String label26 = command.getLabel();
            String string16 = this.f2128aC.getString();
            if (label26.equals("确定") && string16 != null) {
                f2113e.f183M.m516b((byte) 0, string16);
                this.f2126a = 0;
                this.f2159b = 0;
                this.f2213d.m1377a();
                return;
            }
            if (label26.equals("返回")) {
                this.f2129aD = null;
                this.f2128aC = null;
                this.f2126a = 0;
                this.f2159b = 0;
                this.f2213d.m1377a();
                return;
            }
            return;
        }
        if (title.equals("输入OK确定遗忘宠物技能")) {
            String label27 = command.getLabel();
            String string17 = this.f2128aC.getString();
            if (!label27.equals("确定") || string17 == null) {
                if (label27.equals("返回")) {
                    this.f2129aD = null;
                    this.f2128aC = null;
                    this.f2126a = 0;
                    this.f2159b = 0;
                    this.f2213d.m1377a();
                    return;
                }
                return;
            }
            if (!string17.equals("OK")) {
                m1442b("请输入“OK” ！");
                return;
            }
            f2113e.m492y();
            this.f2126a = 0;
            this.f2159b = 0;
            this.f2213d.m1377a();
            return;
        }
        if (title.equals("发布求爱宣言")) {
            String label28 = command.getLabel();
            String string18 = this.f2128aC.getString();
            String string19 = this.f2170bL.getString();
            String string20 = this.f2171bM.getString();
            if (!label28.equals("确定")) {
                if (label28.equals("返回")) {
                    this.f2129aD = null;
                    this.f2128aC = null;
                    this.f2170bL = null;
                    this.f2171bM = null;
                    this.f2126a = 0;
                    this.f2159b = 0;
                    this.f2213d.m1377a();
                    return;
                }
                return;
            }
            if (!string18.equals("") && !string19.equals("") && !string20.equals("")) {
                f2113e.m477o();
                f2113e.f224ak.append(string20);
                long jM475n2 = f2113e.m475n();
                if (jM475n2 <= 0) {
                    Alert alert = new Alert("银两输入有误", "请重新输入银两！", (Image) null, AlertType.ERROR);
                    alert.setTimeout(-2);
                    this.f2222q.setCurrent(alert);
                    return;
                } else {
                    f2113e.f189S.m1694a(string18, string19, jM475n2);
                    this.f2126a = 0;
                    this.f2159b = 0;
                    this.f2213d.m1377a();
                    return;
                }
            }
            if (string18.equals("")) {
                Alert alert2 = new Alert("昵称为空", "请输入求爱人昵称！", (Image) null, AlertType.ERROR);
                alert2.setTimeout(-2);
                this.f2222q.setCurrent(alert2);
                return;
            } else if (string19.equals("")) {
                Alert alert3 = new Alert("求爱宣言为空", "请输入求爱宣言！", (Image) null, AlertType.ERROR);
                alert3.setTimeout(-2);
                this.f2222q.setCurrent(alert3);
                return;
            } else {
                if (string20.equals("")) {
                    Alert alert4 = new Alert("银两为空", "请输入银两！", (Image) null, AlertType.ERROR);
                    alert4.setTimeout(-2);
                    this.f2222q.setCurrent(alert4);
                    return;
                }
                return;
            }
        }
        if (title.equals("输入OK确定离婚")) {
            String label29 = command.getLabel();
            String string21 = this.f2128aC.getString();
            if (!label29.equals("确定") || string21 == null) {
                if (label29.equals("返回")) {
                    this.f2129aD = null;
                    this.f2213d.m1377a();
                    return;
                }
                return;
            }
            if (!string21.equals("OK")) {
                m1442b("请输入“OK” ！");
                return;
            } else {
                if (C0090v.f2550e != 1) {
                    f2113e.f189S.m1697b((byte) 1);
                    return;
                }
                return;
            }
        }
        if (title.equals("输入兑换码")) {
            String label30 = command.getLabel();
            String string22 = this.f2128aC.getString();
            if (!label30.equals("确定") || string22 == null) {
                if (label30.equals("返回")) {
                    this.f2129aD = null;
                    this.f2213d.m1377a();
                    return;
                }
                return;
            }
            byte[] bArrM1231q = C0053bz.m1231q((short) 4880, C0047bt.f865ad, this.f2128aC.getString());
            if (bArrM1231q == null) {
                m1442b("获取上传指令数据错误!");
                return;
            } else {
                f2115i.m600a(new C0091w((short) 4880, bArrM1231q));
                m1434a((String) null);
                return;
            }
        }
        if (!title.equals("发送邮件") && !title.equals("回复邮件")) {
            if (title.equals("选择收件人")) {
                if (command.getLabel().equals("确定")) {
                    C0047bt.f823O.f2261o = C0047bt.f823O.f2265s[this.f2182bX.getSelectedIndex()];
                    C0047bt.f823O.f2264r = C0047bt.f823O.f2266t[this.f2182bX.getSelectedIndex()];
                }
                m1431a((byte) 0, C0047bt.f823O.f2259m, C0047bt.f823O.f2260n, C0047bt.f823O.f2261o, C0047bt.f823O.f2262p == null ? "" : C0047bt.f823O.f2262p, C0047bt.f823O.f2263q, C0047bt.f823O.f2264r);
                return;
            }
            if (title.equals("邮件举报")) {
                if (command.getLabel().equals("举报")) {
                    f2113e.m385a(this.f2181bW, this.f2128aC.getString().trim(), C0047bt.f823O.f2250d);
                    this.f2213d.m1377a();
                    return;
                } else {
                    this.f2129aD = null;
                    this.f2213d.m1377a();
                    return;
                }
            }
            if (!title.equals("联系客服")) {
                this.f2129aD = null;
                this.f2213d.m1377a();
                return;
            } else {
                if (!command.getLabel().equals("确定")) {
                    this.f2129aD = null;
                    this.f2213d.m1377a();
                    return;
                }
                String strTrim3 = this.f2128aC.getString().trim();
                if (strTrim3.length() < 5) {
                    m1442b("信息长度不足，不能少于5字，请重新输入");
                    return;
                } else {
                    f2113e.m384a(strTrim3, C0007ag.f46a[this.f2182bX.getSelectedIndex()]);
                    this.f2213d.m1377a();
                    return;
                }
            }
        }
        String label31 = command.getLabel();
        if (this.f2183bY == 0) {
            C0047bt.f823O.m1556a();
            C0047bt.f823O.f2259m = this.f2129aD.getTitle();
            C0047bt.f823O.f2260n = this.f2128aC == null ? "" : this.f2128aC.getString().trim();
            C0047bt.f823O.f2261o = this.f2170bL == null ? "" : this.f2170bL.getString().trim();
            C0047bt.f823O.f2262p = this.f2171bM == null ? "" : this.f2171bM.getString().trim();
            if (label31.equals("发送")) {
                f2113e.m387a(C0047bt.f823O.f2260n, title.equals("回复邮件") ? this.f2179bU.getText() : C0047bt.f823O.f2261o, C0047bt.f823O.f2262p, C0047bt.f823O.f2250d);
                this.f2213d.m1377a();
                return;
            }
            if (!label31.equals("选择收件人")) {
                this.f2129aD = null;
                this.f2213d.m1377a();
                return;
            }
            if (this.f2183bY == 0) {
                this.f2129aD = new Form("选择收件人");
                if (C0047bt.f823O.f2265s == null || C0047bt.f823O.f2265s.length <= 0) {
                    this.f2177bS = new StringItem((String) null, "您的好友名单为空，请直接输入收件人昵称，或添加为好友后从列表中选择！");
                    this.f2175bQ = new Command("返回", 1, 5);
                    this.f2129aD.addCommand(this.f2175bQ);
                    this.f2129aD.append(this.f2177bS);
                } else {
                    this.f2182bX = new ChoiceGroup("从好友列表中选择收件人", 1, C0047bt.f823O.f2265s, (Image[]) null);
                    this.f2174bP = new Command("确定", 3, 0);
                    this.f2175bQ = new Command("返回", 1, 5);
                    this.f2129aD.addCommand(this.f2174bP);
                    this.f2129aD.addCommand(this.f2175bQ);
                    this.f2129aD.append(this.f2182bX);
                }
                this.f2222q.setCurrent(this.f2129aD);
                this.f2129aD.setCommandListener(this);
            }
        }
    }

    /* renamed from: d */
    public final void m1447d() {
        int[] iArr;
        if (this.f2129aD != null) {
            this.f2129aD.removeCommand(this.f2174bP);
            this.f2129aD.removeCommand(this.f2175bQ);
            this.f2129aD.deleteAll();
        }
        this.f2174bP = null;
        this.f2175bQ = null;
        this.f2172bN = null;
        this.f2173bO = null;
        this.f2129aD = null;
        this.f2213d.m1377a();
        if (C0047bt.f1211hE != null) {
            m1388K();
            for (int i = 0; i < C0047bt.f1211hE.length; i++) {
                if (C0047bt.f1211hE[i] == this.f2212ce && i != 0) {
                    String str = C0047bt.f1207hA[i];
                    String str2 = C0047bt.f1208hB[i];
                    String str3 = C0047bt.f1209hC[i];
                    short s = C0047bt.f1211hE[i];
                    String str4 = C0047bt.f1212hF[i];
                    for (int i2 = i; i2 > 0; i2--) {
                        C0047bt.f1207hA[i2] = C0047bt.f1207hA[i2 - 1];
                        C0047bt.f1208hB[i2] = C0047bt.f1208hB[i2 - 1];
                        C0047bt.f1209hC[i2] = C0047bt.f1209hC[i2 - 1];
                        C0047bt.f1211hE[i2] = C0047bt.f1211hE[i2 - 1];
                        C0047bt.f1212hF[i2] = C0047bt.f1212hF[i2 - 1];
                    }
                    C0047bt.f1207hA[0] = str;
                    C0047bt.f1208hB[0] = str2;
                    C0047bt.f1209hC[0] = str3;
                    C0047bt.f1211hE[0] = s;
                    C0047bt.f1212hF[0] = str4;
                }
            }
        }
        this.f2149aq.m1604b();
        this.f2149aq.m1601a("服务器列表");
        if (C0088t.f2506a != 1 || C0047bt.f1256hx < 0 || C0047bt.f1256hx >= C0047bt.f1207hA.length) {
            iArr = null;
        } else {
            int[] iArr2 = new int[C0047bt.f1207hA.length];
            for (int i3 = 0; i3 < iArr2.length; i3++) {
                if (i3 == C0047bt.f1256hx) {
                    iArr2[i3] = C0055ca.m1278a(0);
                } else {
                    iArr2[i3] = C0055ca.m1278a(6);
                }
            }
            iArr = iArr2;
        }
        this.f2150ar.m1266a((Image[]) null, C0047bt.f1207hA, (String[]) null, C0047bt.f1212hF);
        this.f2150ar.m1263a(iArr);
        this.f2149aq.m1600a(this.f2150ar);
        this.f2153au.m1593a(new String[]{"进入选区", ""});
        this.f2149aq.m1600a(this.f2153au);
        this.f2149aq.m1598a(C0088t.f2520f, C0088t.f2521g, C0088t.f2518d, C0088t.f2519e);
        this.f2216j = (short) 4;
        this.f2217k = (short) 4;
        this.f2207c = (short) 0;
        this.f2126a = 0;
        this.f2159b = 0;
    }

    /* renamed from: d */
    public final void m1448d(String str) {
        this.f2129aD = new Form(str);
        this.f2130aE = new ChoiceGroup("", 1, new String[]{"世界聊", "区域聊", "队伍聊", "帮派聊", "跨服聊"}, (Image[]) null);
        this.f2130aE.setSelectedIndex(1, true);
        this.f2128aC = new TextField(str, (String) null, 30, 0);
        this.f2175bQ = new Command("返回", 8, 1);
        this.f2176bR = new Command("表情", 8, 1);
        this.f2174bP = new Command("确定", 2, 1);
        this.f2129aD.addCommand(this.f2174bP);
        this.f2129aD.addCommand(this.f2176bR);
        this.f2129aD.addCommand(this.f2175bQ);
        this.f2129aD.append(this.f2128aC);
        this.f2129aD.append(this.f2130aE);
        this.f2129aD.setCommandListener(this);
        this.f2222q.setCurrent(this.f2129aD);
        m1400a(this.f2128aC, this.f2184bZ);
    }

    /* renamed from: e */
    public final void m1449e() throws IOException {
        if (C0047bt.f1471m != null && C0047bt.f1471m.length() > 0) {
            m1416h(C0047bt.f1471m);
        } else if (C0047bt.f831W != null) {
            m1416h(C0047bt.f831W[(this.f2160bA << 1) + this.f2206bz]);
        }
    }

    /* renamed from: e */
    public final void m1450e(String str) {
        this.f2129aD = new Form(str);
        this.f2174bP = new Command("确定", 4, 2);
        this.f2175bQ = new Command("返回", 2, 1);
        this.f2129aD.addCommand(this.f2175bQ);
        this.f2129aD.addCommand(this.f2174bP);
        this.f2129aD.setCommandListener(this);
        this.f2128aC = new TextField("请输入搜索关键字:", "", 10, 0);
        this.f2129aD.append(this.f2128aC);
        this.f2222q.setCurrent(this.f2129aD);
    }

    /* renamed from: f */
    public final void m1451f() throws IOException {
        if (C0047bt.f1471m != null && C0047bt.f1471m.length() > 0) {
            m1417i(C0047bt.f1471m);
        } else {
            if (f2113e != null || C0047bt.f831W == null) {
                return;
            }
            m1417i(C0047bt.f831W[(this.f2160bA << 1) + this.f2206bz]);
        }
    }

    /* renamed from: f */
    public final void m1452f(String str) {
        this.f2129aD = new Form(str);
        this.f2174bP = new Command("更改", 4, 2);
        this.f2175bQ = new Command("返回", 2, 1);
        this.f2129aD.addCommand(this.f2175bQ);
        this.f2129aD.addCommand(this.f2174bP);
        this.f2129aD.setCommandListener(this);
        this.f2128aC = new TextField("新名称:", "", 5, 0);
        this.f2129aD.append(this.f2128aC);
        this.f2222q.setCurrent(this.f2129aD);
        this.f2215h = false;
    }

    /* renamed from: g */
    public final void m1453g() {
        m1425x();
        m1454h();
        f2113e = new C0015ao(this, f2114f);
        if (this.f2146aj != null) {
            this.f2146aj.f2231a = f2113e;
        }
        f2113e.m432c("欢迎来到<梦回西游>世界");
        this.f2216j = (short) 7;
        this.f2217k = (short) 7;
    }

    /* renamed from: h */
    public final void m1454h() {
        C0047bt.m904e();
        C0088t.m1680a(this.f2218l);
        if (this.f2204bx != null) {
            for (int i = 0; i < this.f2204bx.length; i++) {
                if (this.f2204bx[i] != null) {
                    this.f2204bx[i] = null;
                }
            }
            this.f2204bx = null;
        }
        if (this.f2205by != null) {
            for (int i2 = 0; i2 < this.f2205by.length; i2++) {
                if (this.f2205by[i2] != null) {
                    this.f2205by[i2] = null;
                }
            }
            this.f2205by = null;
        }
    }

    /* renamed from: i */
    public final void m1455i() {
        short s = 0;
        short s2 = f2113e.f359l;
        f2113e.f359l = (short) 0;
        f2113e.f360m = (short) 0;
        if (f2113e.f356g != null && (f2113e.f356g.f785d != 2 || f2113e.f356g.f786e != 2)) {
            f2113e.f356g.f785d = 0;
            C0044bq c0044bq = f2113e.f356g;
            if (f2113e.f356g.f787f == -1) {
                f2113e.f356g.f787f = (short) 0;
            } else {
                s = f2113e.f356g.f787f;
            }
            c0044bq.f787f = s;
        }
        if (this.f2158az && C0015ao.m310i()) {
            f2113e.m394a(f2113e.f265bb);
        } else if (f2113e.f358k == 18) {
            f2113e.f359l = (short) 1;
            f2113e.f358k = f2113e.f357j;
        } else if (f2113e.f358k == 13) {
            if (s2 == 6) {
                f2113e.m470k(f2113e.f200aE);
            } else if (s2 == 7 || s2 == 8) {
                f2113e.f359l = s2;
            } else {
                f2113e.m467j(f2113e.f232as);
            }
        } else if (f2113e.f358k == 2) {
            if (s2 == 1) {
                f2113e.f359l = (short) 1;
            } else {
                f2113e.m473m();
            }
        } else if (f2113e.f358k == 42) {
            f2113e.f183M.m509a(f2113e.f200aE);
        } else if (f2113e.f358k == 48) {
            if (s2 == 2) {
                f2113e.f359l = s2;
            }
        } else if (f2113e.f358k == 46) {
            if (s2 == 1) {
                f2113e.f183M.m514a(true);
                f2113e.f183M.m526e();
            }
        } else if (f2113e.f358k == 45) {
            f2113e.f183M.m514a(true);
        } else if (f2113e.f358k == 51) {
            f2113e.f183M.m550q();
            f2113e.f183M.m542m();
        } else if (f2113e.f358k == 52) {
            if (s2 == 0 && this.f2151as.f2353a == 1) {
                f2113e.f183M.m556t();
            } else if (s2 == 2 && C0055ca.f1895o == 1) {
                f2113e.f183M.m551q(1);
            }
        } else if (f2113e.f358k == 70 && !C0047bt.f1385kT) {
            if (C0047bt.f1381kP == 2) {
                byte b = (byte) f2113e.f230aq;
                byte b2 = (byte) f2113e.f231ar;
                f2113e.m447e(f2113e.f232as);
                f2113e.f230aq = b;
                f2113e.f231ar = b2;
                f2113e.m481q();
            }
            if (C0047bt.f1381kP == 0 || C0047bt.f1381kP == 1) {
                f2113e.m473m();
            }
            if (C0047bt.f1381kP == 3) {
                f2113e.m361N();
            }
        } else if (f2113e.f358k == 1 || f2113e.f358k == 104 || f2113e.f358k == 115 || f2113e.f358k == 126 || f2113e.f358k == 128 || f2113e.f358k == 130) {
            f2113e.f359l = s2;
        } else if (f2113e.f357j == 4 && f2113e.f232as == 7) {
            f2113e.m486t();
        } else if (f2113e.f357j == 14) {
            if (f2113e.f358k != 14) {
                f2113e.m355H();
            }
        } else if (f2113e.f357j != 32) {
            f2113e.f358k = f2113e.f357j;
        }
        this.f2216j = (short) 7;
        this.f2217k = (short) 7;
    }

    /* renamed from: j */
    public final void m1456j() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        for (int i = 0; i < C0015ao.f145aW.length; i++) {
            try {
                if (i != 15) {
                    dataOutputStream.writeByte(C0015ao.f145aW[i]);
                }
            } catch (IOException e) {
                return;
            }
        }
        m1402a(byteArrayOutputStream.toByteArray(), C0047bt.f865ad);
        CloseUtil.close(byteArrayOutputStream, dataOutputStream);
    }

    /* renamed from: k */
    public final void m1457k(){
        if (!m1418j(C0047bt.f865ad)) {
            return;
        }
        RecordStore recordStoreM1395a = m1395a(C0047bt.f865ad, false);
        DataInputStream dataInputStreamM1389a = m1389a(recordStoreM1395a);
        for (int i = 0; i < C0015ao.f145aW.length; i++) {
            if (i != 15) {
                try {
                    C0015ao.f145aW[i] = dataInputStreamM1389a.readByte();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    protected final void keyPressed(int i) {
        int i2;
        int i3 = 4;
        int i4 = this.f2126a;
        switch (i) {
            case -22:
            case -11:
            case -7:
                i2 = 536870912;
                break;
            case -21:
            case -6:
                i2 = 268435456;
                break;
            case 35:
                i2 = 2048;
                break;
            case 42:
                i2 = 1024;
                break;
            case 48:
                i2 = 48;
                break;
            case 49:
                i2 = 513;
                break;
            case 50:
                i2 = 514;
                break;
            case 51:
                i2 = 515;
                break;
            case 52:
                i2 = 516;
                break;
            case 53:
                i2 = 517;
                break;
            case 54:
                i2 = 518;
                break;
            case 55:
                i2 = 519;
                break;
            case 56:
                i2 = 520;
                break;
            case 57:
                i2 = 521;
                break;
            default:
                switch (getGameAction(i)) {
                    case 1:
                        i2 = 1;
                        break;
                    case 2:
                        i2 = 8;
                        break;
                    case 3:
                    case 4:
                    case 7:
                    default:
                        i2 = 0;
                        break;
                    case 5:
                        i2 = 2;
                        break;
                    case 6:
                        i2 = 4;
                        break;
                    case 8:
                        i2 = 1073741824;
                        break;
                }
        }
        this.f2126a = i2 | i4;
        if (this.f2168bI != this.f2126a || System.currentTimeMillis() - this.f2169bJ > 600) {
            if (f2113e != null) {
                f2113e.f331d = (byte) -1;
            }
            this.f2168bI = this.f2126a;
        } else if (f2113e != null && f2113e.f358k == 0) {
            if (this.f2168bI == 1 || this.f2168bI == 514) {
                f2113e.f331d = (byte) 1;
            } else if (this.f2168bI == 8 || this.f2168bI == 516) {
                f2113e.f331d = (byte) 0;
            } else if (this.f2168bI == 4 || this.f2168bI == 520) {
                f2113e.f331d = (byte) 3;
            } else if (this.f2168bI == 2 || this.f2168bI == 518) {
                f2113e.f331d = (byte) 2;
            } else {
                f2113e.f331d = (byte) -1;
            }
        }
        this.f2169bJ = System.currentTimeMillis();
        int i5 = this.f2159b;
        switch (getGameAction(i)) {
            case 1:
                i3 = 1;
                break;
            case 2:
                i3 = 8;
                break;
            case 3:
            case 4:
            default:
                switch (i) {
                    case 50:
                        i3 = 514;
                        break;
                    case 51:
                    case 53:
                    case 55:
                    default:
                        i3 = 0;
                        break;
                    case 52:
                        i3 = 516;
                        break;
                    case 54:
                        i3 = 518;
                        break;
                    case 56:
                        i3 = 520;
                        break;
                }
            case 5:
                i3 = 2;
                break;
            case 6:
                break;
        }
        this.f2159b = i5 | i3;
        this.f2127aA = 0;
    }

    protected final void keyReleased(int i) {
        this.f2126a = 0;
        this.f2159b = 0;
        this.f2127aA = 0;
    }

    /* renamed from: l */
    public final void m1458l() {
        this.f2129aD = new Form("联系客服");
        this.f2182bX = new ChoiceGroup("类型: ", 1, C0007ag.f46a, (Image[]) null);
        this.f2128aC = new TextField("内容: ", "", 100, 0);
        this.f2174bP = new Command("确定", 3, 0);
        this.f2175bQ = new Command("返回", 1, 5);
        this.f2129aD.addCommand(this.f2174bP);
        this.f2129aD.addCommand(this.f2175bQ);
        this.f2129aD.append(this.f2128aC);
        this.f2129aD.append(this.f2182bX);
        this.f2222q.setCurrent(this.f2129aD);
        this.f2129aD.setCommandListener(this);
    }

    /* renamed from: m */
    public final void m1459m() {
        if (this.f2129aD != null) {
            this.f2129aD.removeCommand(this.f2174bP);
            this.f2129aD.removeCommand(this.f2175bQ);
            this.f2129aD.deleteAll();
        }
        this.f2174bP = null;
        this.f2175bQ = null;
        this.f2128aC = null;
        this.f2129aD = null;
        this.f2215h = false;
    }

    /* renamed from: n */
    public final void m1460n() {
        if (this.f2128aC != null && this.f2128aC.getString() != null) {
            this.f2184bZ = this.f2128aC.getString();
        }
        if (this.f2129aD != null) {
            this.f2129aD.removeCommand(this.f2174bP);
            this.f2129aD.removeCommand(this.f2175bQ);
            this.f2129aD.deleteAll();
        }
        if (this.f2130aE != null) {
            this.f2130aE.deleteAll();
        }
        this.f2130aE = null;
        this.f2174bP = null;
        this.f2175bQ = null;
        this.f2128aC = null;
        this.f2129aD = null;
    }

    /* renamed from: o */
    public final void m1461o() {
        if (this.f2129aD != null) {
            this.f2129aD.removeCommand(this.f2174bP);
            this.f2129aD.removeCommand(this.f2175bQ);
            this.f2129aD.deleteAll();
        }
        this.f2174bP = null;
        this.f2175bQ = null;
        this.f2128aC = null;
        this.f2129aD = null;
    }

    /* renamed from: p */
    public final void m1462p() {
        this.f2129aD = new Form("发布求爱宣言");
        this.f2128aC = new TextField("求爱宣言保留48小时，请输入求爱人昵称：", (String) null, 5, 0);
        this.f2170bL = new TextField("请输入求爱宣言，不超过100字：", (String) null, 100, 0);
        this.f2171bM = new TextField("银两不可低于10万两，银两越多排位越靠前，请输入银两：", (String) null, 9, 2);
        this.f2175bQ = new Command("返回", 8, 1);
        this.f2174bP = new Command("确定", 2, 1);
        this.f2129aD.addCommand(this.f2174bP);
        this.f2129aD.addCommand(this.f2175bQ);
        this.f2129aD.append(this.f2128aC);
        this.f2129aD.append(this.f2170bL);
        this.f2129aD.append(this.f2171bM);
        this.f2129aD.setCommandListener(this);
        this.f2222q.setCurrent(this.f2129aD);
    }

    protected final void paint(Graphics graphics) {
        try {
            if (this.f2216j == 9) {
                graphics.setColor(0);
                graphics.fillRect(0, 0, C0088t.f2516b, C0088t.f2517c);
            }
            graphics.setClip(0, 0, C0088t.f2516b, C0088t.f2517c);
            graphics.setFont(C0088t.f2523i);
            if (this.f2221p) {
                C0055ca.m1318b(graphics);
            }
            if (this.f2133aJ) {
                switch (this.f2216j) {
                    case 0:
                        C0055ca.m1304a(graphics, this.f2190bf);
                        break;
                    case 1:
                        if (f2113e != null) {
                            f2113e.m389a(graphics);
                        } else if (this.f2217k == 9) {
                            m1405b(graphics);
                        } else if (this.f2217k == 14 || this.f2217k == 3) {
                            m1410d(graphics);
                        } else if (this.f2217k == 4) {
                            m1412e(graphics);
                        } else if (this.f2217k == 5) {
                            m1414f(graphics);
                        }
                        C0055ca.m1318b(graphics);
                        break;
                    case 2:
                        if (this.f2138aS != null && this.f2138aS.startsWith("系统异常")) {
                            m1399a(graphics);
                            break;
                        } else {
                            if (f2113e != null) {
                                f2113e.m389a(graphics);
                            }
                            m1399a(graphics);
                            break;
                        }
                    case 3:
                        m1410d(graphics);
                        break;
                    case 4:
                        m1412e(graphics);
                        break;
                    case 5:
                        m1414f(graphics);
                        break;
                    case 6:
                        m1408c(graphics);
                        if (this.f2149aq != null) {
                            this.f2149aq.m1602a(graphics);
                            C0055ca.m1292a(graphics, this.f2149aq.f2328a + 5, this.f2149aq.f2329b + 32, this.f2149aq.f2330c - 11, this.f2149aq.m1597a(C0088t.f2519e <= 240 ? (this.f2161bB * 3) + 6 : 150), 1);
                            C0055ca.m1319b(graphics, this.f2149aq.f2328a + 80, this.f2149aq.f2329b + 35, this.f2149aq.f2328a + 80, (this.f2149aq.m1597a(C0088t.f2519e <= 240 ? (this.f2161bB * 3) + 6 : 150) + (this.f2149aq.f2329b + 35)) - 5);
                            graphics.setColor(2176196);
                            int iStringWidth = C0088t.f2523i.stringWidth(C0088t.f2486G[0]);
                            int i = this.f2149aq.f2329b + 45;
                            int i2 = this.f2149aq.f2328a + 5 + 80 + ((((this.f2149aq.f2330c - 80) - 13) - iStringWidth) / 2);
                            graphics.drawString(C0088t.f2486G[this.f2164bE], this.f2164bE == 2 ? (C0088t.f2525k / 2) + i2 : i2, i, 20);
                            graphics.drawImage(f2085X.f598a, i2 - 20, i, 20);
                            m1397a(0, i2 - 20, i, f2085X.f599b, f2085X.f600c);
                            graphics.drawImage(f2086Y.f598a, i2 + iStringWidth + 15, i, 20);
                            m1397a(1, i2 + iStringWidth + 15, i, f2086Y.f599b, f2086Y.f600c);
                            graphics.drawString(this.f2165bF == 0 ? "男" : "女", this.f2149aq.f2328a + 5 + 80 + ((((this.f2149aq.f2330c - 80) - 13) - C0088t.f2525k) / 2), C0088t.f2524j + 10 + i, 20);
                            graphics.drawImage(f2085X.f598a, i2 - 20, C0088t.f2524j + 10 + i, 20);
                            m1397a(2, i2 - 20, i + C0088t.f2524j + 10, f2085X.f599b, f2085X.f600c);
                            graphics.drawImage(f2086Y.f598a, i2 + iStringWidth + 15, C0088t.f2524j + 10 + i, 20);
                            m1397a(3, i2 + iStringWidth + 15, i + C0088t.f2524j + 10, f2085X.f599b, f2085X.f600c);
                            graphics.drawString("昵称：", this.f2149aq.f2328a + 5 + 80 + 5, ((C0088t.f2524j + 10) << 1) + i, 20);
                            C0055ca.m1326c(graphics, this.f2149aq.f2328a + 5 + 80 + 5, (((C0088t.f2524j + 10) * 3) + i) - 1, ((this.f2149aq.f2330c - 80) - this.f2163bD.getWidth()) - 20, C0088t.f2524j, 0);
                            C0055ca.m1297a(graphics, this.f2157ay, this.f2149aq.f2328a + 5 + 80 + 5 + 2, i + ((C0088t.f2524j + 10) * 3), 20, 16711639);
                            graphics.drawImage(this.f2163bD, (this.f2149aq.f2328a + this.f2149aq.f2330c) - 8, ((C0088t.f2524j + 10) * 3) + i, 24);
                            m1397a(4, this.f2149aq.f2328a + 5 + 80 + 5, i + ((C0088t.f2524j + 10) * 3), ((this.f2149aq.f2330c - 80) - this.f2163bD.getWidth()) - 20, C0088t.f2524j);
                            m1397a(5, ((this.f2149aq.f2328a + this.f2149aq.f2330c) - 8) - this.f2163bD.getWidth(), i + ((C0088t.f2524j + 10) * 3), this.f2163bD.getWidth(), this.f2163bD.getHeight());
                            graphics.setColor(16711680);
                            if (this.f2167bH == 0) {
                                graphics.drawRect(i2, i, iStringWidth, C0088t.f2524j);
                            } else if (this.f2167bH == 1) {
                                graphics.drawRect(this.f2149aq.f2328a + 5 + 80 + ((((this.f2149aq.f2330c - 80) - 13) - C0088t.f2525k) / 2), C0088t.f2524j + 10 + i, C0088t.f2525k, C0088t.f2524j);
                            } else if (this.f2166bG == 0) {
                                graphics.drawRect(this.f2149aq.f2328a + 5 + 80 + 5, (((C0088t.f2524j + 10) * 3) + i) - 1, ((this.f2149aq.f2330c - 80) - this.f2163bD.getWidth()) - 20, C0088t.f2524j);
                            } else {
                                graphics.drawRect(((this.f2149aq.f2328a + this.f2149aq.f2330c) - 8) - this.f2163bD.getWidth(), ((C0088t.f2524j + 10) * 3) + i, this.f2163bD.getWidth(), this.f2163bD.getHeight());
                            }
                            if (this.f2204bx != null && this.f2204bx[(this.f2165bF * 3) + this.f2164bE] != null) {
                                f2114f.m62a(graphics, this.f2204bx[(this.f2165bF * 3) + this.f2164bE], (int[]) null, 0, 0, this.f2149aq.f2328a + 40 + 5, this.f2204bx[(this.f2165bF * 3) + this.f2164bE].m636j() + this.f2149aq.f2329b + 32 + ((this.f2149aq.m1597a(C0088t.f2519e <= 240 ? (this.f2161bB << 1) + 6 : 120) - this.f2204bx[(this.f2165bF * 3) + this.f2164bE].m636j()) / 2), 20, 0);
                                break;
                            }
                        }
                        break;
                    case 7:
                        f2113e.m389a(graphics);
                        break;
                    case 9:
                        m1405b(graphics);
                        break;
                    case 14:
                        m1410d(graphics);
                        break;
                    case 15:
                        m1408c(graphics);
                        if (C0088t.f2506a != 0) {
                            if (C0088t.f2506a != 1) {
                                C0055ca.m1303a(graphics, "更多精彩游戏尽在当乐网\t(d.cn)", new String[]{"更多", "返回"});
                                break;
                            } else {
                                C0055ca.m1303a(graphics, "更多精彩游戏尽在一哥哥网游戏频道\t(3g.01234.com.cn)", new String[]{"更多", "返回"});
                                break;
                            }
                        } else {
                            C0055ca.m1303a(graphics, "更多精彩游戏尽在腾讯游戏频道\t(3g.qq.com)", new String[]{"更多", "退出"});
                            break;
                        }
                    case 16:
                        m1410d(graphics);
                        C0055ca.m1303a(graphics, "确认退出？", new String[]{"确认", "返回"});
                        break;
                    case 17:
                        m1410d(graphics);
                        if (!C0088t.f2538x) {
                            if (!C0088t.f2540z) {
                                if (!C0088t.f2480A) {
                                    if (!C0088t.f2482C) {
                                        C0055ca.m1303a(graphics, "更多精彩游戏尽在一哥哥网游戏频道\t(3g.01234.com.cn)", new String[]{"更多", "退出"});
                                        break;
                                    } else {
                                        C0055ca.m1303a(graphics, "更多精彩游戏尽在http://haxiang.cn", new String[]{"更多", "退出"});
                                        break;
                                    }
                                } else {
                                    C0055ca.m1303a(graphics, "更多精彩游戏尽在http://g.uc.cn", new String[]{"更多", "退出"});
                                    break;
                                }
                            } else {
                                C0055ca.m1303a(graphics, "更多精彩游戏尽在九游网游戏频道\t(http://9Game.CN/Url.Aspx?id=219)", new String[]{"更多", "退出"});
                                break;
                            }
                        } else {
                            C0055ca.m1303a(graphics, "是否进入当乐梦回西游论坛\t(http://zt.d.cn/a091111_netgame_forum_promotion/index.pih?fid=6724&cid=269)", new String[]{"进入", "退出"});
                            break;
                        }
                    case 20:
                        m1408c(graphics);
                        C0055ca.m1303a(graphics, f2089aH, new String[]{"下载", "取消"});
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected final void pointerDragged(int i, int i2) {
        if (!C0088t.f2529o || this.f2146aj == null || f2113e == null) {
            return;
        }
        if (f2113e.f358k != 0 || f2113e.f182J == null) {
            switch (f2113e.f358k) {
                case 0:
                    this.f2146aj.f2234d = 1;
                    this.f2131aF = i;
                    this.f2132aG = i2;
                    break;
                case 39:
                    if (this.f2146aj.f2233c == 1) {
                        this.f2146aj.f2234d = 1;
                        this.f2131aF = i;
                        this.f2132aG = i2;
                        break;
                    }
                    break;
            }
        }
    }

    protected final void pointerPressed(int i, int i2) {
        int i3;
        int i4;
        if (!C0088t.f2529o || this.f2146aj == null) {
            return;
        }
        this.f2146aj.f2235e = i;
        this.f2146aj.f2236f = i2;
        this.f2127aA = 0;
        this.f2146aj.m1550a(this.f2146aj.f2235e, this.f2146aj.f2236f);
        C0071f c0071f = this.f2146aj;
        int i6 = this.f2146aj.f2235e;
        int i7 = this.f2146aj.f2236f;
        switch (c0071f.f2232b.f2216j) {
            case 2:
                c0071f.f2232b.f2126a = c0071f.f2232b.m1428a(i6, i7);
                return;
            case 3:
            case 7:
            case 8:
            case 9:
            case 11:
            case 12:
            case 13:
            default:
                return;
            case 4:
                if (c0071f.f2232b.f2207c == 0) {
                    if (c0071f.f2232b.f2149aq != null) {
                        c0071f.f2232b.f2126a = c0071f.f2232b.f2149aq.mo69b(i6, i7);
                        return;
                    }
                    return;
                } else {
                    if (c0071f.f2232b.f2207c == 2) {
                        c0071f.f2232b.f2126a = c0071f.f2232b.m1428a(i6, i7);
                        return;
                    }
                    return;
                }
            case 5:
                if (c0071f.f2232b.f2149aq != null) {
                    c0071f.f2232b.f2126a = c0071f.f2232b.f2149aq.mo69b(i6, i7);
                    RunnableC0066a runnableC0066a = c0071f.f2232b;
                    RunnableC0066a runnableC0066a2 = c0071f.f2232b;
                    int i8 = c0071f.f2232b.f2126a;
                    if (runnableC0066a2.f2162bC != null) {
                        for (int i9 = 0; i9 < runnableC0066a2.f2162bC.length; i9++) {
                            if (i6 >= runnableC0066a2.f2162bC[i9][0] && i6 <= runnableC0066a2.f2162bC[i9][0] + runnableC0066a2.f2162bC[i9][2] && i7 >= runnableC0066a2.f2162bC[i9][1] && i7 <= runnableC0066a2.f2162bC[i9][1] + runnableC0066a2.f2162bC[i9][3]) {
                                byte b = (byte) (i9 % 2);
                                byte b2 = (byte) (i9 / 2);
                                if (b == runnableC0066a2.f2206bz && b2 == runnableC0066a2.f2160bA) {
                                    i4 = 1073741824;
                                } else {
                                    runnableC0066a2.f2206bz = b;
                                    runnableC0066a2.f2160bA = b2;
                                    i4 = 4;
                                }
                                runnableC0066a.f2126a = i4;
                            }
                        }
                        i4 = i8;
                        runnableC0066a.f2126a = i4;
                    } else {
                        i4 = i8;
                        runnableC0066a.f2126a = i4;
                    }
                }
                if (c0071f.f2232b.f2207c == 1) {
                    c0071f.f2232b.f2126a = C0055ca.m1322c(i6, i7);
                    return;
                } else if (c0071f.f2232b.f2207c != 2) {
                    return;
                }
                break;
            case 6:
                if (c0071f.f2232b.f2149aq != null) {
                    c0071f.f2232b.f2126a = c0071f.f2232b.f2149aq.mo69b(i6, i7);
                    RunnableC0066a runnableC0066a3 = c0071f.f2232b;
                    RunnableC0066a runnableC0066a4 = c0071f.f2232b;
                    int i10 = c0071f.f2232b.f2126a;
                    if (runnableC0066a4.f2162bC != null) {
                        for (int i11 = 0; i11 < runnableC0066a4.f2162bC.length; i11++) {
                            if (i6 >= runnableC0066a4.f2162bC[i11][0] && i6 <= runnableC0066a4.f2162bC[i11][0] + runnableC0066a4.f2162bC[i11][2] && i7 >= runnableC0066a4.f2162bC[i11][1] && i7 <= runnableC0066a4.f2162bC[i11][1] + runnableC0066a4.f2162bC[i11][3]) {
                                if (i11 < 2) {
                                    runnableC0066a4.f2167bH = 0;
                                } else if (i11 < 4) {
                                    runnableC0066a4.f2167bH = 1;
                                } else {
                                    runnableC0066a4.f2167bH = 2;
                                    runnableC0066a4.f2166bG = i11 % 2;
                                    i3 = 1073741824;
                                }
                                i3 = i11 % 2 == 0 ? 8 : 2;
                            }
                        }
                        i3 = i10;
                    } else {
                        i3 = i10;
                    }
                    runnableC0066a3.f2126a = i3;
                    return;
                }
                return;
            case 10:
                if (c0071f.f2232b.f2149aq != null) {
                    c0071f.f2232b.f2126a = c0071f.f2232b.f2149aq.mo69b(i6, i7);
                    return;
                }
                return;
            case 14:
                if (c0071f.f2232b.f2207c != 0) {
                    c0071f.f2232b.f2126a = C0055ca.m1314b(i6, i7);
                    return;
                }
                RunnableC0066a runnableC0066a5 = c0071f.f2232b;
                RunnableC0066a runnableC0066a6 = c0071f.f2232b;
                int i12 = 0;
                int i5;
                while (true) {
                    if (i12 >= runnableC0066a6.f2196bo.length) {
                        if (C0088t.f2506a != 1 || i6 < C0088t.f2516b - C0088t.f2523i.stringWidth("退出") + -4 || i6 > C0088t.f2516b + -4 || i7 < C0088t.f2517c - C0088t.f2524j + -4 || i7 > C0088t.f2517c + -4) {
                            i5 = 0;
                            break;
                        } else {
                            i5 = 536870912;
                            break;
                        }
                    }
                    if (i6 > C0088t.f2516b - runnableC0066a6.f2193bi.getWidth() >> 1 && i6 < ((C0088t.f2516b - runnableC0066a6.f2193bi.getWidth()) >> 1) + runnableC0066a6.f2193bi.getWidth() && i7 > (runnableC0066a6.f2201bt << 1) + runnableC0066a6.f2192bh.getHeight() + (runnableC0066a6.f2193bi.getHeight() * i12) && i7 < (runnableC0066a6.f2201bt << 1) + runnableC0066a6.f2192bh.getHeight() + ((i12 + 1) * runnableC0066a6.f2193bi.getHeight())) {
                        runnableC0066a6.f2200bs = i12;
                        runnableC0066a6.f2148al = 0L;
                        i5 = 1073741824;
                        break;
                    }
                    i12++;
                }
                runnableC0066a5.f2126a = i5;
                return;
            case 15:
                c0071f.f2232b.f2126a = C0055ca.m1314b(i6, i7);
                return;
            case 16:
                c0071f.f2232b.f2126a = C0055ca.m1314b(i6, i7);
                return;
            case 17:
                c0071f.f2232b.f2126a = C0055ca.m1314b(i6, i7);
                return;
            case 18:
                c0071f.f2232b.f2126a = C0055ca.m1279a(i6, i7);
                return;
            case 19:
                c0071f.f2232b.f2126a = C0055ca.m1279a(i6, i7);
                return;
            case 20:
                break;
        }
        c0071f.f2232b.f2126a = C0055ca.m1314b(i6, i7);
    }

    protected final void pointerReleased(int i, int i2) {
        if (!C0088t.f2529o || this.f2146aj == null) {
            return;
        }
        this.f2146aj.f2233c = 0;
        this.f2146aj.f2234d = 0;
        this.f2159b = 0;
        this.f2126a = 0;
        this.f2127aA = 0;
    }

    /* renamed from: q */
    public final void m1463q() {
        C0055ca.f1888h = 0;
        this.f2216j = (short) 20;
        this.f2217k = (short) 20;
    }

    /* renamed from: r */
    public final void m1464r() {
        C0055ca.f1838A = 100;
        m1439b();
        this.f2213d.m1377a();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a1 A[Catch: Exception -> 0x006d, TryCatch #1 {Exception -> 0x006d, blocks: (B:6:0x0010, B:8:0x0014, B:9:0x0019, B:11:0x001d, B:12:0x001f, B:13:0x0022, B:15:0x0026, B:17:0x0030, B:24:0x0054, B:26:0x0067, B:30:0x0075, B:32:0x0080, B:34:0x0085, B:36:0x008b, B:40:0x0096, B:44:0x00a5, B:46:0x00ab, B:48:0x00b1, B:50:0x00b7, B:52:0x00bb, B:109:0x0182, B:111:0x018c, B:113:0x0190, B:54:0x00c1, B:56:0x00c5, B:58:0x00cf, B:60:0x00d6, B:62:0x00e0, B:64:0x00e4, B:67:0x00ef, B:69:0x00f3, B:71:0x00fd, B:73:0x0107, B:75:0x010b, B:76:0x0113, B:77:0x0118, B:79:0x011c, B:81:0x0120, B:83:0x0124, B:85:0x012e, B:87:0x0138, B:88:0x013d, B:90:0x0141, B:92:0x014b, B:94:0x0155, B:95:0x015a, B:97:0x015e, B:99:0x0168, B:100:0x016d, B:102:0x0172, B:116:0x01aa, B:118:0x01af, B:120:0x01b3, B:122:0x01b7, B:123:0x01bb, B:124:0x01bf, B:125:0x01c3, B:127:0x01c8, B:128:0x01cf, B:130:0x01d4, B:131:0x01d8, B:133:0x01de, B:134:0x01e2, B:136:0x01e7, B:138:0x01ef, B:139:0x0202, B:141:0x020a, B:143:0x021c, B:144:0x0221, B:145:0x022c, B:146:0x0232, B:148:0x023a, B:149:0x024a, B:150:0x024f, B:152:0x0255, B:153:0x025a, B:155:0x0260, B:104:0x0177, B:106:0x017b, B:108:0x017f, B:114:0x019c, B:115:0x01a3, B:66:0x00ea, B:42:0x00a1, B:156:0x0265, B:158:0x0269, B:160:0x0296, B:162:0x02b1, B:161:0x02ac, B:163:0x02b7, B:165:0x02bb, B:167:0x02bf, B:169:0x02c5, B:170:0x02cc, B:172:0x02d0, B:173:0x02d7, B:175:0x02db, B:177:0x02e1, B:206:0x03cd, B:208:0x03d3, B:179:0x02e7, B:181:0x02eb, B:183:0x02f0, B:185:0x02f4, B:187:0x0301, B:189:0x030d, B:190:0x0328, B:192:0x033f, B:199:0x03ab, B:194:0x035a, B:195:0x0372, B:197:0x037e, B:198:0x039a, B:200:0x03b1, B:202:0x03b5, B:203:0x03bf, B:205:0x03c3, B:193:0x0355, B:209:0x03d8, B:210:0x03dd, B:212:0x03e1, B:213:0x03e8, B:215:0x03ec, B:228:0x0425, B:230:0x042a, B:237:0x043f, B:239:0x0445, B:260:0x0492, B:262:0x0496, B:283:0x04e4, B:285:0x04e8, B:287:0x04f6, B:221:0x03fb, B:223:0x03ff, B:225:0x040b, B:226:0x041b, B:288:0x0508, B:289:0x050f, B:291:0x0515, B:293:0x0519, B:294:0x0521, B:296:0x052d, B:297:0x053f, B:298:0x0546, B:300:0x054c, B:302:0x0552, B:304:0x0556, B:306:0x055a, B:307:0x0561, B:309:0x056b, B:310:0x057d, B:264:0x049c, B:266:0x04a0, B:269:0x04a7, B:270:0x04c0, B:271:0x04c5, B:273:0x04c9, B:276:0x04d0, B:278:0x04d7, B:281:0x04de, B:241:0x044b, B:243:0x044f, B:246:0x0456, B:247:0x046e, B:248:0x0473, B:250:0x0477, B:253:0x047e, B:255:0x0485, B:258:0x048c, B:232:0x0430, B:235:0x0437, B:236:0x043a, B:217:0x03f2, B:220:0x03f9, B:227:0x0420, B:311:0x0584, B:312:0x0589, B:314:0x0591, B:315:0x05a9, B:317:0x05ad, B:319:0x05b1, B:321:0x05b7, B:323:0x05bd, B:331:0x05da, B:333:0x05df, B:335:0x05e5, B:337:0x05e9, B:344:0x0603, B:346:0x0607, B:348:0x060d, B:371:0x0684, B:329:0x05cf, B:373:0x068a, B:375:0x068e, B:350:0x0613, B:352:0x0617, B:353:0x0619, B:355:0x061d, B:357:0x0621, B:359:0x0643, B:360:0x0659, B:361:0x0660, B:362:0x0665, B:363:0x0667, B:365:0x066c, B:367:0x0670, B:368:0x0675, B:369:0x067a, B:370:0x067f, B:339:0x05ef, B:341:0x05f8, B:342:0x05fe, B:325:0x05c3, B:327:0x05c7, B:328:0x05cd, B:330:0x05d4, B:376:0x0699, B:378:0x069d, B:380:0x06a1, B:383:0x06b4, B:385:0x06ba, B:382:0x06a7, B:386:0x06bf, B:388:0x06c3, B:389:0x06cb, B:390:0x06d0, B:392:0x06d6, B:393:0x06dd, B:395:0x06e1, B:397:0x06e5, B:399:0x06e9, B:403:0x06f5, B:402:0x06f0, B:401:0x06ed, B:404:0x06ff, B:406:0x0705, B:407:0x070c, B:409:0x0710, B:411:0x0714, B:412:0x0719, B:413:0x071c, B:414:0x0721, B:416:0x0725, B:417:0x072b, B:419:0x072f, B:420:0x0735, B:422:0x0739, B:423:0x073f, B:424:0x0745, B:426:0x074b, B:427:0x0752, B:429:0x0758, B:437:0x0773, B:439:0x0777, B:446:0x0795, B:448:0x0799, B:451:0x07a5, B:435:0x076c, B:453:0x07ab, B:450:0x079f, B:441:0x077d, B:443:0x078a, B:444:0x078f, B:445:0x0792, B:431:0x075e, B:433:0x0765, B:434:0x076a), top: B:465:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a5 A[Catch: Exception -> 0x006d, TryCatch #1 {Exception -> 0x006d, blocks: (B:6:0x0010, B:8:0x0014, B:9:0x0019, B:11:0x001d, B:12:0x001f, B:13:0x0022, B:15:0x0026, B:17:0x0030, B:24:0x0054, B:26:0x0067, B:30:0x0075, B:32:0x0080, B:34:0x0085, B:36:0x008b, B:40:0x0096, B:44:0x00a5, B:46:0x00ab, B:48:0x00b1, B:50:0x00b7, B:52:0x00bb, B:109:0x0182, B:111:0x018c, B:113:0x0190, B:54:0x00c1, B:56:0x00c5, B:58:0x00cf, B:60:0x00d6, B:62:0x00e0, B:64:0x00e4, B:67:0x00ef, B:69:0x00f3, B:71:0x00fd, B:73:0x0107, B:75:0x010b, B:76:0x0113, B:77:0x0118, B:79:0x011c, B:81:0x0120, B:83:0x0124, B:85:0x012e, B:87:0x0138, B:88:0x013d, B:90:0x0141, B:92:0x014b, B:94:0x0155, B:95:0x015a, B:97:0x015e, B:99:0x0168, B:100:0x016d, B:102:0x0172, B:116:0x01aa, B:118:0x01af, B:120:0x01b3, B:122:0x01b7, B:123:0x01bb, B:124:0x01bf, B:125:0x01c3, B:127:0x01c8, B:128:0x01cf, B:130:0x01d4, B:131:0x01d8, B:133:0x01de, B:134:0x01e2, B:136:0x01e7, B:138:0x01ef, B:139:0x0202, B:141:0x020a, B:143:0x021c, B:144:0x0221, B:145:0x022c, B:146:0x0232, B:148:0x023a, B:149:0x024a, B:150:0x024f, B:152:0x0255, B:153:0x025a, B:155:0x0260, B:104:0x0177, B:106:0x017b, B:108:0x017f, B:114:0x019c, B:115:0x01a3, B:66:0x00ea, B:42:0x00a1, B:156:0x0265, B:158:0x0269, B:160:0x0296, B:162:0x02b1, B:161:0x02ac, B:163:0x02b7, B:165:0x02bb, B:167:0x02bf, B:169:0x02c5, B:170:0x02cc, B:172:0x02d0, B:173:0x02d7, B:175:0x02db, B:177:0x02e1, B:206:0x03cd, B:208:0x03d3, B:179:0x02e7, B:181:0x02eb, B:183:0x02f0, B:185:0x02f4, B:187:0x0301, B:189:0x030d, B:190:0x0328, B:192:0x033f, B:199:0x03ab, B:194:0x035a, B:195:0x0372, B:197:0x037e, B:198:0x039a, B:200:0x03b1, B:202:0x03b5, B:203:0x03bf, B:205:0x03c3, B:193:0x0355, B:209:0x03d8, B:210:0x03dd, B:212:0x03e1, B:213:0x03e8, B:215:0x03ec, B:228:0x0425, B:230:0x042a, B:237:0x043f, B:239:0x0445, B:260:0x0492, B:262:0x0496, B:283:0x04e4, B:285:0x04e8, B:287:0x04f6, B:221:0x03fb, B:223:0x03ff, B:225:0x040b, B:226:0x041b, B:288:0x0508, B:289:0x050f, B:291:0x0515, B:293:0x0519, B:294:0x0521, B:296:0x052d, B:297:0x053f, B:298:0x0546, B:300:0x054c, B:302:0x0552, B:304:0x0556, B:306:0x055a, B:307:0x0561, B:309:0x056b, B:310:0x057d, B:264:0x049c, B:266:0x04a0, B:269:0x04a7, B:270:0x04c0, B:271:0x04c5, B:273:0x04c9, B:276:0x04d0, B:278:0x04d7, B:281:0x04de, B:241:0x044b, B:243:0x044f, B:246:0x0456, B:247:0x046e, B:248:0x0473, B:250:0x0477, B:253:0x047e, B:255:0x0485, B:258:0x048c, B:232:0x0430, B:235:0x0437, B:236:0x043a, B:217:0x03f2, B:220:0x03f9, B:227:0x0420, B:311:0x0584, B:312:0x0589, B:314:0x0591, B:315:0x05a9, B:317:0x05ad, B:319:0x05b1, B:321:0x05b7, B:323:0x05bd, B:331:0x05da, B:333:0x05df, B:335:0x05e5, B:337:0x05e9, B:344:0x0603, B:346:0x0607, B:348:0x060d, B:371:0x0684, B:329:0x05cf, B:373:0x068a, B:375:0x068e, B:350:0x0613, B:352:0x0617, B:353:0x0619, B:355:0x061d, B:357:0x0621, B:359:0x0643, B:360:0x0659, B:361:0x0660, B:362:0x0665, B:363:0x0667, B:365:0x066c, B:367:0x0670, B:368:0x0675, B:369:0x067a, B:370:0x067f, B:339:0x05ef, B:341:0x05f8, B:342:0x05fe, B:325:0x05c3, B:327:0x05c7, B:328:0x05cd, B:330:0x05d4, B:376:0x0699, B:378:0x069d, B:380:0x06a1, B:383:0x06b4, B:385:0x06ba, B:382:0x06a7, B:386:0x06bf, B:388:0x06c3, B:389:0x06cb, B:390:0x06d0, B:392:0x06d6, B:393:0x06dd, B:395:0x06e1, B:397:0x06e5, B:399:0x06e9, B:403:0x06f5, B:402:0x06f0, B:401:0x06ed, B:404:0x06ff, B:406:0x0705, B:407:0x070c, B:409:0x0710, B:411:0x0714, B:412:0x0719, B:413:0x071c, B:414:0x0721, B:416:0x0725, B:417:0x072b, B:419:0x072f, B:420:0x0735, B:422:0x0739, B:423:0x073f, B:424:0x0745, B:426:0x074b, B:427:0x0752, B:429:0x0758, B:437:0x0773, B:439:0x0777, B:446:0x0795, B:448:0x0799, B:451:0x07a5, B:435:0x076c, B:453:0x07ab, B:450:0x079f, B:441:0x077d, B:443:0x078a, B:444:0x078f, B:445:0x0792, B:431:0x075e, B:433:0x0765, B:434:0x076a), top: B:465:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c1 A[Catch: Exception -> 0x006d, TryCatch #1 {Exception -> 0x006d, blocks: (B:6:0x0010, B:8:0x0014, B:9:0x0019, B:11:0x001d, B:12:0x001f, B:13:0x0022, B:15:0x0026, B:17:0x0030, B:24:0x0054, B:26:0x0067, B:30:0x0075, B:32:0x0080, B:34:0x0085, B:36:0x008b, B:40:0x0096, B:44:0x00a5, B:46:0x00ab, B:48:0x00b1, B:50:0x00b7, B:52:0x00bb, B:109:0x0182, B:111:0x018c, B:113:0x0190, B:54:0x00c1, B:56:0x00c5, B:58:0x00cf, B:60:0x00d6, B:62:0x00e0, B:64:0x00e4, B:67:0x00ef, B:69:0x00f3, B:71:0x00fd, B:73:0x0107, B:75:0x010b, B:76:0x0113, B:77:0x0118, B:79:0x011c, B:81:0x0120, B:83:0x0124, B:85:0x012e, B:87:0x0138, B:88:0x013d, B:90:0x0141, B:92:0x014b, B:94:0x0155, B:95:0x015a, B:97:0x015e, B:99:0x0168, B:100:0x016d, B:102:0x0172, B:116:0x01aa, B:118:0x01af, B:120:0x01b3, B:122:0x01b7, B:123:0x01bb, B:124:0x01bf, B:125:0x01c3, B:127:0x01c8, B:128:0x01cf, B:130:0x01d4, B:131:0x01d8, B:133:0x01de, B:134:0x01e2, B:136:0x01e7, B:138:0x01ef, B:139:0x0202, B:141:0x020a, B:143:0x021c, B:144:0x0221, B:145:0x022c, B:146:0x0232, B:148:0x023a, B:149:0x024a, B:150:0x024f, B:152:0x0255, B:153:0x025a, B:155:0x0260, B:104:0x0177, B:106:0x017b, B:108:0x017f, B:114:0x019c, B:115:0x01a3, B:66:0x00ea, B:42:0x00a1, B:156:0x0265, B:158:0x0269, B:160:0x0296, B:162:0x02b1, B:161:0x02ac, B:163:0x02b7, B:165:0x02bb, B:167:0x02bf, B:169:0x02c5, B:170:0x02cc, B:172:0x02d0, B:173:0x02d7, B:175:0x02db, B:177:0x02e1, B:206:0x03cd, B:208:0x03d3, B:179:0x02e7, B:181:0x02eb, B:183:0x02f0, B:185:0x02f4, B:187:0x0301, B:189:0x030d, B:190:0x0328, B:192:0x033f, B:199:0x03ab, B:194:0x035a, B:195:0x0372, B:197:0x037e, B:198:0x039a, B:200:0x03b1, B:202:0x03b5, B:203:0x03bf, B:205:0x03c3, B:193:0x0355, B:209:0x03d8, B:210:0x03dd, B:212:0x03e1, B:213:0x03e8, B:215:0x03ec, B:228:0x0425, B:230:0x042a, B:237:0x043f, B:239:0x0445, B:260:0x0492, B:262:0x0496, B:283:0x04e4, B:285:0x04e8, B:287:0x04f6, B:221:0x03fb, B:223:0x03ff, B:225:0x040b, B:226:0x041b, B:288:0x0508, B:289:0x050f, B:291:0x0515, B:293:0x0519, B:294:0x0521, B:296:0x052d, B:297:0x053f, B:298:0x0546, B:300:0x054c, B:302:0x0552, B:304:0x0556, B:306:0x055a, B:307:0x0561, B:309:0x056b, B:310:0x057d, B:264:0x049c, B:266:0x04a0, B:269:0x04a7, B:270:0x04c0, B:271:0x04c5, B:273:0x04c9, B:276:0x04d0, B:278:0x04d7, B:281:0x04de, B:241:0x044b, B:243:0x044f, B:246:0x0456, B:247:0x046e, B:248:0x0473, B:250:0x0477, B:253:0x047e, B:255:0x0485, B:258:0x048c, B:232:0x0430, B:235:0x0437, B:236:0x043a, B:217:0x03f2, B:220:0x03f9, B:227:0x0420, B:311:0x0584, B:312:0x0589, B:314:0x0591, B:315:0x05a9, B:317:0x05ad, B:319:0x05b1, B:321:0x05b7, B:323:0x05bd, B:331:0x05da, B:333:0x05df, B:335:0x05e5, B:337:0x05e9, B:344:0x0603, B:346:0x0607, B:348:0x060d, B:371:0x0684, B:329:0x05cf, B:373:0x068a, B:375:0x068e, B:350:0x0613, B:352:0x0617, B:353:0x0619, B:355:0x061d, B:357:0x0621, B:359:0x0643, B:360:0x0659, B:361:0x0660, B:362:0x0665, B:363:0x0667, B:365:0x066c, B:367:0x0670, B:368:0x0675, B:369:0x067a, B:370:0x067f, B:339:0x05ef, B:341:0x05f8, B:342:0x05fe, B:325:0x05c3, B:327:0x05c7, B:328:0x05cd, B:330:0x05d4, B:376:0x0699, B:378:0x069d, B:380:0x06a1, B:383:0x06b4, B:385:0x06ba, B:382:0x06a7, B:386:0x06bf, B:388:0x06c3, B:389:0x06cb, B:390:0x06d0, B:392:0x06d6, B:393:0x06dd, B:395:0x06e1, B:397:0x06e5, B:399:0x06e9, B:403:0x06f5, B:402:0x06f0, B:401:0x06ed, B:404:0x06ff, B:406:0x0705, B:407:0x070c, B:409:0x0710, B:411:0x0714, B:412:0x0719, B:413:0x071c, B:414:0x0721, B:416:0x0725, B:417:0x072b, B:419:0x072f, B:420:0x0735, B:422:0x0739, B:423:0x073f, B:424:0x0745, B:426:0x074b, B:427:0x0752, B:429:0x0758, B:437:0x0773, B:439:0x0777, B:446:0x0795, B:448:0x0799, B:451:0x07a5, B:435:0x076c, B:453:0x07ab, B:450:0x079f, B:441:0x077d, B:443:0x078a, B:444:0x078f, B:445:0x0792, B:431:0x075e, B:433:0x0765, B:434:0x076a), top: B:465:0x0010 }] */
    // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int length;
        int i;
        String str;
        while (this.f2133aJ) {
            this.f2147ak = System.currentTimeMillis();
            try {
                if (f2115i != null) {
                    f2115i.m603c();
                }
                if (this.f2133aJ) {
                    switch (this.f2216j) {
                        case 1:
                            this.f2148al++;
                            if (this.f2147ak - this.f2135aP >= 60000) {
                                m1442b("响应超时");
                                break;
                            }
                            break;
                        case 2:
                            if (this.f2147ak - this.f2136aQ < 6600) {
                                if (!(this.f2217k == 7 && f2113e.f356g != null && f2113e.f358k == 25) || this.f2147ak - this.f2136aQ < 2000) {
                                }
                            } else if (!this.f2137aR) {
                                if (this.f2126a != 1073741824 && this.f2126a != 517 && this.f2126a != 536870912 && this.f2126a != 268435456 && !m1422u()) {
                                    this.f2159b = 0;
                                    this.f2126a = 0;
                                    if (C0088t.f2529o) {
                                        this.f2146aj.f2233c = 0;
                                        this.f2146aj.f2234d = 0;
                                    }
                                } else if (this.f2138aS != null && this.f2138aS.startsWith("系统异常")) {
                                    m1421t();
                                    break;
                                } else if (!C0047bt.f1050eC.startsWith("异常离线") && C0047bt.f1049eB != 0 && this.f2217k != 9) {
                                    if (C0047bt.f1050eC != null && (C0047bt.f1050eC.startsWith("连接超时") || C0047bt.f1050eC.startsWith("响应超时"))) {
                                        if (f2115i != null) {
                                            f2115i.m604d();
                                            f2115i = null;
                                        }
                                        m1426y();
                                        break;
                                    } else {
                                        if (C0047bt.f1050eC != null && f2113e != null) {
                                            if (C0047bt.f838aC == 1 && (C0047bt.f1050eC.endsWith("超Q用户才可兑换") || C0047bt.f1050eC.endsWith("超Q用户才可接取"))) {
                                                f2113e.m407af();
                                            }
                                            if (C0047bt.f843aH == 1 && (C0047bt.f1050eC.endsWith("魔钻用户才可兑换") || C0047bt.f1050eC.endsWith("魔钻用户才可接取"))) {
                                                f2113e.m408ag();
                                            }
                                        }
                                        if (C0047bt.f1050eC != null && C0047bt.f1050eC.equals("您已短信申请开通VIP服务")) {
                                            this.f2217k = (short) 7;
                                            this.f2216j = (short) 7;
                                        }
                                        if (this.f2217k == 3 || C0047bt.f1049eB == -4) {
                                            if (C0088t.f2506a != 1 || C0029bb.f553g == null) {
                                                m1404b((String) null, C0022av.f446h);
                                            } else {
                                                this.f2133aJ = false;
                                            }
                                        } else if (this.f2217k == 4) {
                                            if (C0088t.f2506a == 1 && C0047bt.f1255hw) {
                                                m1444c();
                                            } else {
                                                m1447d();
                                            }
                                        } else if (this.f2217k == 5) {
                                            m1440b(C0047bt.f833Y.length);
                                        } else if (this.f2217k == 6) {
                                            m1380C();
                                        } else if (this.f2217k == 10) {
                                            m1384G();
                                        } else if (this.f2217k == 7) {
                                            if (f2113e.f358k == 71) {
                                                f2113e.m446e(this.f2151as.f2353a);
                                                this.f2150ar.m1256a(f2113e.f200aE);
                                            } else if (f2113e.f358k == 76) {
                                                byte b = this.f2151as.f2353a;
                                                int iM1275g = this.f2150ar.m1275g();
                                                f2113e.m438d(b);
                                                this.f2150ar.m1256a(Math.min(iM1275g, b == 0 ? C0047bt.f823O.f2252f.length : C0047bt.f824P.f48b.length));
                                            } else if (f2113e.f358k == 77) {
                                                f2113e.m488u();
                                                this.f2150ar.m1256a(C0047bt.f824P.f55i);
                                            } else {
                                                m1455i();
                                            }
                                        } else if (this.f2217k == 9) {
                                            m1384G();
                                        } else if (this.f2217k == 14) {
                                            m1444c();
                                        }
                                        this.f2159b = 0;
                                        this.f2126a = 0;
                                        if (C0088t.f2529o && this.f2146aj != null) {
                                            this.f2146aj.f2233c = 0;
                                            this.f2146aj.f2234d = 0;
                                            break;
                                        }
                                    }
                                } else {
                                    m1384G();
                                    break;
                                }
                            }
                            break;
                        case 3:
                            if (this.f2145aZ) {
                                m1436a("socket://120.78.151.213:20008", "http://117.135.138.130:7099");
                                C0088t.m1680a(this.f2218l);
                                C0047bt.f888b = this.f2172bN.getString();
                                C0047bt.f941c = this.f2173bO.getString();
                                m1383F();
                                byte[] bArrM1094a = C0053bz.m1094a((short) 5379, C0047bt.f888b, C0047bt.f941c, C0088t.f2536v);
                                if (bArrM1094a != null) {
                                    C0091w c0091w = new C0091w((short) 5379, bArrM1094a);
                                    c0091w.f2563a = true;
                                    f2115i.m600a(c0091w);
                                    this.f2145aZ = false;
                                    m1434a((String) null);
                                } else {
                                    m1442b("获取上传指令数据错误!");
                                }
                            }
                            this.f2126a = 0;
                            break;
                        case 4:
                            if (this.f2207c == 0) {
                                if (C0088t.f2506a == 1 && this.f2203bw != C0029bb.f550d) {
                                    this.f2203bw = C0029bb.f550d;
                                    m1447d();
                                }
                                if (this.f2149aq != null) {
                                    this.f2149aq.mo70b(this.f2126a);
                                }
                                if (this.f2126a == 268435456 || this.f2126a == 1073741824 || this.f2126a == 517) {
                                    if (C0047bt.f1207hA != null || C0047bt.f1207hA.length > 0) {
                                        if (C0088t.f2506a == 0) {
                                            int iM1275g2 = this.f2150ar.m1275g();
                                            m1420s();
                                            if (C0022av.f446h == 1) {
                                                if (C0047bt.f1208hB[iM1275g2].equals("")) {
                                                    m1442b(new StringBuffer().append(C0047bt.f1207hA[iM1275g2]).append("繁忙,请选择其他服!").toString());
                                                    str = null;
                                                } else {
                                                    str = C0047bt.f1208hB[iM1275g2];
                                                    m1398a("http://117.135.138.130:7099", (byte) 1);
                                                    C0053bz.f1806c = C0047bt.f1211hE[iM1275g2];
                                                    m1401a(C0047bt.f1211hE[iM1275g2]);
                                                }
                                            } else if (C0047bt.f1209hC[iM1275g2].equals("")) {
                                                m1442b(new StringBuffer().append(C0047bt.f1207hA[iM1275g2]).append("繁忙,请选择其他服!").toString());
                                                str = null;
                                            } else {
                                                str = C0047bt.f1209hC[iM1275g2];
                                                m1398a(str, (byte) 2);
                                                m1401a(C0047bt.f1211hE[iM1275g2]);
                                            }
                                            m1436a(str, "http://117.135.138.130:7099");
                                            C0053bz.f1806c = C0047bt.f1211hE[iM1275g2];
                                            byte[] bArrM1180g = C0053bz.m1180g((short) 4196, C0047bt.f1257hy, C0047bt.f1258hz);
                                            if (bArrM1180g != null) {
                                                C0091w c0091w2 = new C0091w((short) 4196, bArrM1180g);
                                                c0091w2.f2563a = true;
                                                f2115i.m600a(c0091w2);
                                                this.f2145aZ = false;
                                                m1434a((String) null);
                                            } else {
                                                m1442b("获取上传指令数据错误!");
                                            }
                                        } else if (C0088t.f2537w || !C0047bt.f1255hw) {
                                            m1432a(this.f2150ar.m1275g());
                                        }
                                    }
                                } else if (this.f2126a == 536870912) {
                                    m1444c();
                                }
                            }
                            this.f2126a = 0;
                            break;
                        case 5:
                            m1379B();
                            break;
                        case 6:
                            if (this.f2149aq != null) {
                                this.f2149aq.mo70b(this.f2126a);
                            }
                            if (this.f2126a == 1 || this.f2126a == 514) {
                                this.f2167bH = this.f2167bH + (-1) < 0 ? 2 : this.f2167bH - 1;
                            } else if (this.f2126a == 4 || this.f2126a == 520) {
                                this.f2167bH = this.f2167bH + 1 > 2 ? 0 : this.f2167bH + 1;
                            } else if (this.f2126a == 8 || this.f2126a == 516) {
                                if (this.f2167bH == 0) {
                                    this.f2164bE = (byte) (this.f2164bE + (-1) < 0 ? 2 : this.f2164bE - 1);
                                    this.f2152at.m79b(C0088t.f2487H[this.f2164bE], C0088t.f2523i, (byte) 1);
                                    this.f2152at.m75a((byte) 1);
                                } else if (this.f2167bH == 1) {
                                    this.f2165bF = (byte) (this.f2165bF + (-1) < 0 ? 1 : 0);
                                } else {
                                    this.f2166bG = this.f2166bG + (-1) < 0 ? 1 : 0;
                                }
                            } else if (this.f2126a == 2 || this.f2126a == 518) {
                                if (this.f2167bH == 0) {
                                    this.f2164bE = (byte) (this.f2164bE + 1 > 2 ? 0 : this.f2164bE + 1);
                                    this.f2152at.m79b(C0088t.f2487H[this.f2164bE], C0088t.f2523i, (byte) 1);
                                    this.f2152at.m75a((byte) 1);
                                } else if (this.f2167bH == 1) {
                                    this.f2165bF = (byte) (this.f2165bF + 1 > 1 ? 0 : 1);
                                } else {
                                    this.f2166bG = this.f2166bG + 1 > 1 ? 0 : 1;
                                }
                            } else if (this.f2126a == 268435456) {
                                byte[] bArrM1056a = C0053bz.m1056a((short) 4099, this.f2157ay, this.f2165bF, this.f2164bE);
                                if (bArrM1056a != null) {
                                    f2115i.m600a(new C0091w((short) 4099, bArrM1056a));
                                    m1434a((String) null);
                                } else {
                                    m1442b("获取上传指令数据错误!");
                                }
                            } else if (this.f2126a == 536870912) {
                                if (C0047bt.f831W != null) {
                                    m1440b(C0047bt.f831W.length);
                                    break;
                                } else {
                                    byte[] bArrM1088a = C0053bz.m1088a((short) 4098, C0047bt.f994d, C0047bt.f888b);
                                    if (bArrM1088a != null) {
                                        f2115i.m600a(new C0091w((short) 4098, bArrM1088a));
                                        m1434a((String) null);
                                    } else {
                                        m1442b("获取上传指令数据错误!");
                                    }
                                }
                            } else if ((this.f2126a == 1073741824 || this.f2126a == 517) && this.f2167bH == 2) {
                                if (this.f2166bG == 0) {
                                    m1443b((String) null, (String) null);
                                } else {
                                    byte[] bArrM1038a = C0053bz.m1038a((short) 4372, this.f2165bF);
                                    if (bArrM1038a != null) {
                                        f2115i.m600a(new C0091w((short) 4372, bArrM1038a));
                                        m1434a((String) null);
                                    } else {
                                        m1442b("获取上传指令数据错误!");
                                    }
                                }
                            }
                            if (this.f2204bx != null && (this.f2165bF * 3) + this.f2164bE < this.f2204bx.length) {
                                C0009ai.m43a(this.f2204bx[(this.f2165bF * 3) + this.f2164bE], this.f2147ak);
                            }
                            this.f2126a = 0;
                            break;
                        case 7:
                            m1382E();
                            break;
                        case 9:
                            if (this.f2148al >= 520) {
                                this.f2148al = 0L;
                                this.f2189be = null;
                                C0055ca.m1281a();
                                this.f2216j = (short) 0;
                                this.f2217k = (short) 0;
                                new RunnableC0067b(this, f2108bK);
                                break;
                            }
                            break;
                        case 14:
                            if (this.f2207c == 0) {
                                if (this.f2126a == 1 || this.f2126a == 50 || this.f2126a == 8 || this.f2126a == 516) {
                                    if (this.f2200bs > 0) {
                                        length = this.f2200bs - 1;
                                        this.f2200bs = length;
                                    } else {
                                        length = this.f2196bo.length - 1;
                                    }
                                    this.f2200bs = length;
                                } else if (this.f2126a == 4 || this.f2126a == 520 || this.f2126a == 2 || this.f2126a == 518) {
                                    if (this.f2200bs < this.f2196bo.length - 1) {
                                        i = this.f2200bs + 1;
                                        this.f2200bs = i;
                                    } else {
                                        i = 0;
                                    }
                                    this.f2200bs = i;
                                } else if (this.f2126a == 268435456 || this.f2126a == 1073741824 || this.f2126a == 517) {
                                    if (C0088t.f2506a != 0) {
                                        switch (this.f2200bs) {
                                            case 0:
                                                if (!C0088t.f2538x) {
                                                    C0068c.m1469c();
                                                    break;
                                                } else {
                                                    m1423v();
                                                    break;
                                                }
                                            case 1:
                                                C0068c.m1470e();
                                                break;
                                            case 2:
                                                C0068c.m1471f();
                                                break;
                                        }
                                    } else {
                                        switch (this.f2200bs) {
                                            case 0:
                                                if (C0088t.f2506a == 0) {
                                                    m1436a("socket://120.78.151.213:20008", "http://117.135.138.130:7099");
                                                    byte[] bArrM1044a = C0053bz.m1044a((short) 5383, (byte) 0, (String) null, (String) null, false, C0088t.f2536v, C0088t.f2485F, (int) Runtime.getRuntime().totalMemory(), "");
                                                    if (bArrM1044a == null) {
                                                        m1442b("获取上传指令数据错误!");
                                                        break;
                                                    } else {
                                                        f2115i.m600a(new C0091w((short) 5383, bArrM1044a));
                                                        this.f2145aZ = false;
                                                        m1434a("服务器列表");
                                                        break;
                                                    }
                                                }
                                                break;
                                            case 2:
                                                m1384G();
                                                break;
                                        }
                                    }
                                } else if (this.f2126a == 536870912 && C0088t.f2506a == 1) {
                                    C0055ca.f1888h = 0;
                                    this.f2216j = (short) 16;
                                    this.f2217k = (short) 16;
                                }
                            } else if (this.f2207c == 1) {
                                if (this.f2126a == 268435456 || this.f2126a == 1073741824) {
                                    this.f2207c = (short) 0;
                                    C0088t.f2537w = false;
                                    f2103ai.m1476d();
                                } else if (this.f2126a == 536870912) {
                                    this.f2207c = (short) 0;
                                }
                            }
                            this.f2126a = 0;
                            break;
                        case 15:
                            if (this.f2126a == 268435456) {
                                m1445c("http://3g.01234.com.cn/game/gameAction.do?m=gameIndex&sId=");
                                this.f2133aJ = false;
                            } else if (this.f2126a == 536870912) {
                                m1444c();
                                this.f2200bs = 1;
                            }
                            this.f2126a = 0;
                            break;
                        case 16:
                            if (this.f2126a == 268435456) {
                                if (C0088t.f2539y || C0088t.f2481B || C0088t.f2483D) {
                                    this.f2133aJ = false;
                                } else {
                                    C0055ca.f1888h = 0;
                                    this.f2216j = (short) 17;
                                    this.f2217k = (short) 17;
                                }
                            } else if (this.f2126a == 536870912) {
                                this.f2216j = (short) 14;
                                this.f2217k = (short) 14;
                            }
                            this.f2126a = 0;
                            break;
                        case 17:
                            if (this.f2126a == 268435456) {
                                if (C0088t.f2538x) {
                                    m1445c("http://zt.d.cn/a091111_netgame_forum_promotion/index.pih?fid=6724&cid=269");
                                } else if (C0088t.f2540z) {
                                    m1445c("http://9Game.CN/Url.Aspx?id=219");
                                } else if (C0088t.f2480A) {
                                    m1445c("http://g.uc.cn");
                                } else if (C0088t.f2482C) {
                                    m1445c("http://haxiang.cn");
                                } else {
                                    m1445c("http://3g.01234.com.cn/game/gameAction.do?m=gameIndex&sId=");
                                }
                                this.f2133aJ = false;
                            } else if (this.f2126a == 536870912) {
                                this.f2207c = (short) 0;
                                m1384G();
                            }
                            this.f2126a = 0;
                            break;
                        case 20:
                            if (this.f2126a == 8 || this.f2126a == 516) {
                                C0055ca.f1885e = C0055ca.f1885e - C0055ca.f1884d >= 0 ? C0055ca.f1885e - C0055ca.f1884d : 0;
                            } else if (this.f2126a == 2 || this.f2126a == 518) {
                                C0055ca.f1885e = C0055ca.f1885e + C0055ca.f1884d < C0015ao.f140K.m1015a() ? C0055ca.f1885e + C0055ca.f1884d : C0055ca.f1885e;
                            } else if (this.f2126a == 268435456 || this.f2126a == 1073741824) {
                                m1445c(f2090aI);
                            } else if (this.f2126a == 536870912) {
                                m1444c();
                                this.f2200bs = 0;
                            }
                            this.f2126a = 0;
                            break;
                    }
                    if (f2113e != null) {
                        f2113e.m437d();
                        if (this.f2216j == 7) {
                            f2113e.m428c();
                        }
                    }
                }
            } catch (Exception e) {
                m1433a(e, (byte) 1);
                e.printStackTrace();
            }
            repaint();
            serviceRepaints();
            long jCurrentTimeMillis = 35 - (System.currentTimeMillis() - this.f2147ak);
            if (jCurrentTimeMillis > 0) {
                try {
                    Thread.sleep(jCurrentTimeMillis);
                } catch (InterruptedException ignored) {
                }
            } else {
                try {
                    Thread.sleep(1L);
                } catch (InterruptedException e) {
                }
            }
        }
        if (f2115i != null) {
            f2115i.m604d();
        }
        f2113e = null;
        m1387J();
    }
}

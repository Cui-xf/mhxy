package p000;

import com.yinhan.kjava.main.RunnableC0066a;
import java.lang.reflect.Array;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

/* renamed from: bq */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-4234804660425969496/classes.dex */
public final class C0044bq {

    /* renamed from: c */
    public static short f764c;

    /* renamed from: t */
    private static short f768t;

    /* renamed from: A */
    private C0064cj f769A;

    /* renamed from: B */
    private long f770B;

    /* renamed from: C */
    private long f771C;

    /* renamed from: E */
    private C0077i[] f773E;

    /* renamed from: F */
    private C0005ae[] f774F;

    /* renamed from: K */
    private String[] f779K;

    /* renamed from: d */
    public int f785d;

    /* renamed from: e */
    public int f786e;

    /* renamed from: f */
    public short f787f;

    /* renamed from: h */
    public byte f788h;

    /* renamed from: i */
    public byte f789i;

    /* renamed from: j */
    public byte f790j;

    /* renamed from: k */
    public byte f791k;

    /* renamed from: l */
    public byte f792l;

    /* renamed from: m */
    public byte f793m;

    /* renamed from: n */
    public byte f794n;

    /* renamed from: o */
    public byte f795o;

    /* renamed from: p */
    public int f796p;

    /* renamed from: q */
    public int f797q;

    /* renamed from: u */
    private String[] f798u;

    /* renamed from: y */
    private RunnableC0066a f802y;

    /* renamed from: z */
    private C0015ao f803z;

    /* renamed from: a */
    public static byte f762a = 25;

    /* renamed from: b */
    public static short f763b = (short) 25;

    /* renamed from: g */
    public static int f765g = -1;

    /* renamed from: r */
    public static long f766r = 0;

    /* renamed from: s */
    public static short f767s = f763b;

    /* renamed from: P */
    private static short f761P = f762a;

    /* renamed from: v */
    private Vector f799v = new Vector();

    /* renamed from: w */
    private Vector f800w = new Vector();

    /* renamed from: x */
    private Vector f801x = new Vector();

    /* renamed from: D */
    private long f772D = -1;

    /* renamed from: G */
    private C0033bf f775G = null;

    /* renamed from: H */
    private Vector f776H = new Vector();

    /* renamed from: I */
    private long f777I = 0;

    /* renamed from: J */
    private boolean f778J = false;

    /* renamed from: L */
    private int[][] f780L = new int[5][4];

    /* renamed from: M */
    private int[][] f781M = new int[3][4];

    /* renamed from: N */
    private int[][] f782N = new int[10][4];

    /* renamed from: O */
    private int[] f783O = {513, 514, 515, 516, 517, 518, 519, 520, 1024, 2048};

    /* renamed from: Q */
    private boolean f784Q = true;

    public C0044bq(RunnableC0066a runnableC0066a, C0015ao c0015ao, byte b) {
        this.f802y = runnableC0066a;
        this.f803z = c0015ao;
        f768t = b;
        runnableC0066a.m1439b();
        C0047bt.f1768v = C0047bt.f1769w;
        m743a();
        runnableC0066a.m1439b();
    }

    /* renamed from: a */
    private static int m705a(byte b) {
        for (byte b2 = 0; b2 < C0047bt.f816H.length; b2 = (byte) (b2 + 1)) {
            if (C0047bt.f816H[b2].f2418a == b) {
                return b2;
            }
        }
        return -1;
    }

    /* renamed from: a */
    private static void m706a(Vector vector, Vector vector2) {
        int i;
        int i2 = 0;
        while (i2 < vector.size()) {
            if (vector2.contains((C0033bf) vector.elementAt(i2))) {
                i = i2;
            } else {
                vector.removeElementAt(i2);
                i = 0;
            }
            i2 = i + 1;
        }
        for (int i3 = 0; i3 < vector2.size(); i3++) {
            C0033bf c0033bf = (C0033bf) vector2.elementAt(i3);
            if (!vector.contains(c0033bf)) {
                vector.addElement(c0033bf);
            }
        }
    }

    /* renamed from: a */
    private void m707a(Graphics graphics) {
        int i;
        int i2;
        int i3;
        int i4;
        if (this.f774F == null || this.f774F.length <= 0) {
            return;
        }
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        while (b < this.f774F.length) {
            if (this.f774F[b].f35b == 1 && this.f774F[b].f37d != 0 && m718c((int) this.f774F[b].f36c) >= 0 && m718c((int) this.f774F[b].f36c) < C0047bt.f821M.length) {
                int i5 = this.f774F[b].f37d;
                short s = C0088t.f2497R[this.f774F[b].f36c][0];
                int iM1376d = C0088t.f2497R[this.f774F[b].f36c][1] - C0047bt.f821M[m718c((int) this.f774F[b].f36c)].m1376d();
                if (this.f774F[b].f39f <= 24) {
                    C0005ae c0005ae = this.f774F[b];
                    i4 = c0005ae.f39f + 4;
                    c0005ae.f39f = i4;
                } else {
                    i4 = 24;
                }
                m708a(graphics, i5, s, (iM1376d - i4) + (b5 * 10), 1, 0, 0);
                b5 = (byte) (b5 + 1);
            }
            if (this.f774F[b].f35b == 1 && this.f774F[b].f38e != 0 && m718c((int) this.f774F[b].f36c) >= 0 && m718c((int) this.f774F[b].f36c) < C0047bt.f821M.length) {
                int i6 = this.f774F[b].f38e;
                short s2 = C0088t.f2497R[this.f774F[b].f36c][0];
                int iM1376d2 = C0088t.f2497R[this.f774F[b].f36c][1] - C0047bt.f821M[m718c((int) this.f774F[b].f36c)].m1376d();
                if (this.f774F[b].f39f <= 24) {
                    C0005ae c0005ae2 = this.f774F[b];
                    i3 = c0005ae2.f39f + 4;
                    c0005ae2.f39f = i3;
                } else {
                    i3 = 24;
                }
                m708a(graphics, i6, s2, (iM1376d2 - i3) + (b4 * 10), 0, 0, 0);
                b4 = (byte) (b4 + 1);
            }
            if (this.f774F[b].f35b == 0 && this.f774F[b].f37d != 0 && m705a(this.f774F[b].f36c) >= 0 && m705a(this.f774F[b].f36c) < C0047bt.f816H.length) {
                int i7 = this.f774F[b].f37d;
                int i8 = C0088t.f2496Q[this.f774F[b].f36c][0] + 10;
                int iM1646i = C0088t.f2496Q[this.f774F[b].f36c][1] - C0047bt.f816H[m705a(this.f774F[b].f36c)].m1646i();
                if (this.f774F[b].f39f <= 24) {
                    C0005ae c0005ae3 = this.f774F[b];
                    i2 = c0005ae3.f39f + 4;
                    c0005ae3.f39f = i2;
                } else {
                    i2 = 24;
                }
                m708a(graphics, i7, i8, (iM1646i - i2) + (b3 * 10), 1, 0, 1);
                b3 = (byte) (b3 + 1);
            }
            if (this.f774F[b].f35b == 0 && this.f774F[b].f38e != 0 && m705a(this.f774F[b].f36c) >= 0 && m705a(this.f774F[b].f36c) < C0047bt.f816H.length) {
                int i9 = this.f774F[b].f38e;
                int i10 = C0088t.f2496Q[this.f774F[b].f36c][0] + 10;
                int iM1646i2 = C0088t.f2496Q[this.f774F[b].f36c][1] - C0047bt.f816H[m705a(this.f774F[b].f36c)].m1646i();
                if (this.f774F[b].f39f <= 24) {
                    C0005ae c0005ae4 = this.f774F[b];
                    i = c0005ae4.f39f + 4;
                    c0005ae4.f39f = i;
                } else {
                    i = 24;
                }
                m708a(graphics, i9, i10, (iM1646i2 - i) + (b2 * 10), 0, 0, 1);
                b2 = (byte) (b2 + 1);
            }
            b = (byte) (b + 1);
            b2 = b2;
        }
    }

    /* renamed from: a */
    private void m708a(Graphics graphics, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = 0;
        int i8 = 0;
        int i9 = i >= 0 ? i : -i;
        while (i9 > 0) {
            i9 /= 10;
            i7 = i8;
            i8++;
        }
        int i10 = i6 == 0 ? ((i7 + 2) / 2) * 7 : (i7 + 2) * 7;
        graphics.drawRegion(C0015ao.f136E.f598a, i >= 0 ? 8 : 0, i4 == 0 ? 0 : 10, 8, 10, 0, i2 - i10, i3, 0);
        if (i < 0) {
            i = -i;
        }
        for (int i11 = i7; i11 >= 0; i11--) {
            graphics.drawRegion(C0015ao.f136E.f598a, ((i / m720d(i11)) * 7) + 16, i4 == 0 ? 0 : 10, 7, 10, 0, ((i2 + 8) + ((i7 - i11) * 7)) - i10, i3, 0);
            i %= m720d(i11);
        }
    }

    /* renamed from: a */
    private void m709a(Graphics graphics, String str) {
        if (this.f802y.f2216j != 2) {
            if (this.f779K == null) {
                this.f779K = C0055ca.m1311a(str, C0088t.f2523i, (C0088t.f2516b / 2) - 20, "/t");
            }
            if (this.f779K != null) {
                C0055ca.m1291a(graphics, (C0088t.f2516b - (C0088t.f2525k * 10)) / 2, ((C0088t.f2517c - (C0088t.f2524j * this.f779K.length)) - 20) / 2, C0088t.f2525k * 10, (C0088t.f2524j * this.f779K.length) + 20);
                for (int i = 0; i < this.f779K.length; i++) {
                    C0055ca.m1298a(graphics, this.f779K[i], C0088t.f2516b / 2, (C0088t.f2524j * i) + (((C0088t.f2517c - (C0088t.f2524j * this.f779K.length)) - 20) / 2) + 10, 17, C0055ca.f1864a, 0);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m710a(C0084p c0084p, C0005ae c0005ae) {
        c0084p.f2422e = c0005ae.f40g;
        c0084p.f2424g = c0005ae.f41h;
        c0084p.f2423f = c0005ae.f42i;
        c0084p.f2425h = c0005ae.f43j;
        if (!c0084p.f2420c.equals(C0047bt.f865ad) || C0047bt.f1770x == -1) {
            return;
        }
        C0047bt.f849aN = c0084p.f2422e;
        C0047bt.f851aP = c0084p.f2424g;
        C0047bt.f848aM = c0084p.f2423f;
        C0047bt.f850aO = c0084p.f2425h;
    }

    /* renamed from: a */
    private static boolean m711a(byte b, byte b2) {
        if (b == 0) {
            for (int i = 0; i < C0047bt.f816H.length; i++) {
                if (C0047bt.f816H[i].f2418a == b2 && C0047bt.f816H[i].f2422e <= 0) {
                    return true;
                }
            }
            return false;
        }
        if (b != 1) {
            return false;
        }
        for (int i2 = 0; i2 < C0047bt.f821M.length; i2++) {
            if (C0047bt.f821M[i2].f2035a == b2 && C0047bt.f821M[i2].f2039e <= 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private static byte m712b(byte b) {
        byte length = (byte) (b - 1);
        if (length < 0) {
            length = (byte) (C0047bt.f821M.length - 1);
        }
        while (C0047bt.f821M[length].m1372a()) {
            length = (byte) (length - 1);
            if (length < 0) {
                length = (byte) (C0047bt.f821M.length - 1);
            }
        }
        return length;
    }

    /* renamed from: b */
    public static int m713b() {
        byte b = 0;
        byte b2 = 0;
        while (true) {
            byte b3 = b;
            if (b2 >= C0047bt.f816H.length) {
                return b3;
            }
            b = C0047bt.f816H[b2].f2422e > 0 ? (byte) (b3 + 1) : b3;
            b2 = (byte) (b2 + 1);
        }
    }

    /* renamed from: b */
    private void m714b(Graphics graphics) {
        if (C0015ao.f142Z == null) {
            return;
        }
        byte b = 0;
        while (true) {
            byte b2 = b;
            if (b2 >= 5) {
                return;
            }
            int i = (C0088t.f2517c - 102) + (b2 << 4);
            short s = C0015ao.f142Z.f600c;
            if (this.f780L != null && this.f780L.length > b2) {
                this.f780L[b2][0] = 1;
                this.f780L[b2][1] = i;
                this.f780L[b2][2] = 25;
                this.f780L[b2][3] = s;
            }
            RunnableC0066a.f2114f.m63a(graphics, C0015ao.f142Z, (int[]) null, b2 + 1, 0, 0, 1, (b2 << 4) + (C0088t.f2517c - 102), 0, 0);
            if (b2 == this.f786e) {
                graphics.setColor(16711680);
                C0055ca.m1328d(graphics, 1, (C0088t.f2517c - 102) + (this.f786e << 4), 25, 15);
                switch (this.f786e) {
                    case 0:
                        C0055ca.m1298a(graphics, "攻击", C0088t.f2516b / 2, (C0088t.f2517c - 22) - C0088t.f2524j, 17, 16776960, 0);
                        break;
                    case 1:
                        C0055ca.m1298a(graphics, "防御", C0088t.f2516b / 2, (C0088t.f2517c - 22) - C0088t.f2524j, 17, 16776960, 0);
                        break;
                    case 2:
                        C0055ca.m1298a(graphics, "技能", C0088t.f2516b / 2, (C0088t.f2517c - 22) - C0088t.f2524j, 17, 16776960, 0);
                        break;
                    case 3:
                        C0055ca.m1298a(graphics, "道具", C0088t.f2516b / 2, (C0088t.f2517c - 22) - C0088t.f2524j, 17, 16776960, 0);
                        break;
                    case 4:
                        C0055ca.m1298a(graphics, "逃跑", C0088t.f2516b / 2, (C0088t.f2517c - 22) - C0088t.f2524j, 17, 16776960, 0);
                        break;
                }
            }
            b = (byte) (b2 + 1);
        }
    }

    /* renamed from: b */
    private boolean m715b(int i) {
        if (m717c() > 1) {
            return C0047bt.f1084ek != null && m717c() <= C0047bt.f1086em[this.f803z.f238az];
        }
        return true;
    }

    /* renamed from: c */
    private static byte m716c(byte b) {
        byte b2 = (byte) (b - 1);
        return b2 < 0 ? (byte) (C0047bt.f816H.length - 1) : b2;
    }

    /* renamed from: c */
    public static int m717c() {
        int i = 0;
        byte b = 0;
        while (true) {
            int i2 = i;
            if (b >= C0047bt.f821M.length) {
                return i2;
            }
            i = C0047bt.f821M[b].f2039e > 0 ? i2 + 1 : i2;
            b = (byte) (b + 1);
        }
    }

    /* renamed from: c */
    private static int m718c(int i) {
        for (byte b = 0; b < C0047bt.f821M.length; b = (byte) (b + 1)) {
            if (C0047bt.f821M[b].f2035a == i) {
                return b;
            }
        }
        return -1;
    }

    /* renamed from: c */
    private void m719c(Graphics graphics) {
        if (C0015ao.f142Z == null) {
            return;
        }
        byte b = 0;
        while (true) {
            byte b2 = b;
            if (b2 >= 3) {
                return;
            }
            int i = (C0088t.f2517c - 70) + (b2 << 4);
            short s = C0015ao.f142Z.f600c;
            if (this.f781M != null && this.f781M.length > b2) {
                this.f781M[b2][0] = 1;
                this.f781M[b2][1] = i;
                this.f781M[b2][2] = 25;
                this.f781M[b2][3] = s;
            }
            RunnableC0066a.f2114f.m63a(graphics, C0015ao.f142Z, (int[]) null, b2 + 1, 0, 0, 1, (b2 << 4) + (C0088t.f2517c - 70), 0, 0);
            if (b2 == this.f786e) {
                graphics.setColor(16711680);
                C0055ca.m1328d(graphics, 1, (C0088t.f2517c - 70) + (b2 << 4), 25, 15);
                switch (this.f786e) {
                    case 0:
                        C0055ca.m1298a(graphics, "攻击", C0088t.f2516b / 2, (C0088t.f2517c - 22) - C0088t.f2524j, 17, 16776960, 0);
                        break;
                    case 1:
                        C0055ca.m1298a(graphics, "防御", C0088t.f2516b / 2, (C0088t.f2517c - 22) - C0088t.f2524j, 17, 16776960, 0);
                        break;
                    case 2:
                        C0055ca.m1298a(graphics, "技能", C0088t.f2516b / 2, (C0088t.f2517c - 22) - C0088t.f2524j, 17, 16776960, 0);
                        break;
                }
            }
            b = (byte) (b2 + 1);
        }
    }

    /* renamed from: d */
    private static int m720d(int i) {
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            i2 *= 10;
        }
        return i2;
    }

    /* renamed from: d */
    private void m721d(Graphics graphics) {
        C0009ai c0009ai;
        C0033bf c0033bf;
        int[] iArr;
        int i;
        Graphics graphics2;
        if (C0047bt.f1083ej == null) {
            return;
        }
        if (this.f785d == 0 || this.f785d == 1 || this.f785d == 4) {
            this.f803z.m390a(graphics, 0, C0088t.f2517c - 22, 0);
        } else {
            this.f803z.m390a(graphics, 0, C0088t.f2517c - 22, 1);
        }
        byte b = 0;
        while (true) {
            byte b2 = b;
            if (b2 >= C0047bt.f1083ej.length) {
                break;
            }
            if (b2 < 0 || b2 >= 8) {
                RunnableC0066a.f2114f.m63a(graphics, C0015ao.f137F, (int[]) null, b2 == 8 ? 0 : 2, 0, 0, (C0047bt.f1083ej[b2] * 17) + 3, C0088t.f2517c - 19, 0, 0);
                c0009ai = RunnableC0066a.f2114f;
                c0033bf = C0015ao.f138G;
                iArr = null;
                if (b2 == 8) {
                    i = 0;
                    graphics2 = graphics;
                } else {
                    i = 1;
                    graphics2 = graphics;
                }
            } else {
                c0009ai = RunnableC0066a.f2114f;
                c0033bf = RunnableC0066a.f2116n;
                iArr = null;
                i = b2 + 1;
                graphics2 = graphics;
            }
            c0009ai.m63a(graphics2, c0033bf, iArr, i, 0, 0, (C0047bt.f1083ej[b2] * 17) + 3, C0088t.f2517c - 19, 0, 0);
            int i2 = (b2 * 17) + 3;
            int i3 = C0088t.f2517c - 19;
            if (this.f782N != null && this.f782N.length > b2) {
                this.f782N[b2][0] = i2;
                this.f782N[b2][1] = i3;
                this.f782N[b2][2] = 17;
                this.f782N[b2][3] = 17;
            }
            b = (byte) (b2 + 1);
        }
        if ((this.f786e != 5 || C0047bt.f1083ej == null) && (this.f786e != 3 || C0047bt.f1083ej == null || this.f785d <= 1)) {
            return;
        }
        for (byte b3 = 0; b3 < C0047bt.f1083ej.length; b3 = (byte) (b3 + 1)) {
            if (b3 == this.f803z.f238az) {
                graphics.setColor(16711680);
                C0055ca.m1328d(graphics, (b3 * 17) + 2, C0088t.f2517c - 20, 17, 17);
                if (this.f787f == 0) {
                    switch (this.f803z.f238az) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            if (this.f785d == 0) {
                                if (C0047bt.f1087en[this.f803z.f238az] != -1) {
                                    C0055ca.m1298a(graphics, C0047bt.f1088eo[this.f803z.f238az], C0088t.f2516b / 2, (C0088t.f2517c - 22) - C0088t.f2524j, 17, 16776960, 0);
                                    break;
                                }
                            } else if (this.f785d == 2 && C0047bt.f1093et[this.f803z.f238az] != -1) {
                                C0055ca.m1298a(graphics, C0047bt.f1094eu[this.f803z.f238az], C0088t.f2516b / 2, (C0088t.f2517c - 22) - C0088t.f2524j, 17, 16776960, 0);
                                break;
                            }
                            break;
                        case 8:
                            C0055ca.m1298a(graphics, "聊天记录", C0088t.f2516b / 2, (C0088t.f2517c - 22) - C0088t.f2524j, 17, 16776960, 0);
                            break;
                        case 9:
                            C0055ca.m1298a(graphics, "自动打怪", C0088t.f2516b / 2, (C0088t.f2517c - 22) - C0088t.f2524j, 17, 16776960, 0);
                            break;
                    }
                    return;
                }
                return;
            }
        }
    }

    /* renamed from: d */
    private static boolean m722d(byte b) {
        return b == 4 || b == 6 || b == 7 || b == 5;
    }

    /* renamed from: e */
    public static void m723e() {
        if (C0047bt.f821M != null) {
            for (byte b = 0; b < C0047bt.f821M.length; b = (byte) (b + 1)) {
                if (C0047bt.f821M[b] != null) {
                    C0047bt.f821M[b].m1373b();
                    C0047bt.f821M[b] = null;
                }
            }
            C0047bt.f821M = null;
        }
        if (C0047bt.f816H != null) {
            for (byte b2 = 0; b2 < C0047bt.f816H.length; b2 = (byte) (b2 + 1)) {
                if (C0047bt.f816H[b2] != null) {
                    C0047bt.f816H[b2].m1642e();
                    C0047bt.f816H[b2] = null;
                }
            }
            C0047bt.f816H = null;
        }
    }

    /* renamed from: e */
    private void m724e(Graphics graphics) {
        if (this.f798u != null) {
            for (byte b = 0; b < this.f798u.length; b = (byte) (b + 1)) {
                C0055ca.m1298a(graphics, this.f798u[b], C0088t.f2516b / 2, (C0088t.f2524j * b) + ((C0088t.f2517c - (this.f798u.length * C0088t.f2524j)) / 2), 17, 15849739, 0);
            }
        }
    }

    /* renamed from: f */
    public static byte m725f() {
        for (byte b = 0; b < C0047bt.f816H.length; b = (byte) (b + 1)) {
            if (C0047bt.f816H[b].f2420c.equals(C0047bt.f865ad)) {
                return b;
            }
        }
        return (byte) -1;
    }

    /* renamed from: h */
    public static boolean m726h() {
        for (byte b = 0; b < C0047bt.f816H.length; b = (byte) (b + 1)) {
            if (C0047bt.f816H[b].f2419b == 0 && C0047bt.f816H[b].f2420c.equals(C0047bt.f865ad) && C0047bt.f816H[b].f2422e <= 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public static byte m727i() {
        for (byte b = 0; b < C0047bt.f816H.length; b = (byte) (b + 1)) {
            if (C0047bt.f816H[b].f2419b == 0 && C0047bt.f816H[b].f2420c.equals(C0047bt.f865ad)) {
                return C0047bt.f816H[b].f2418a;
            }
        }
        return (byte) -1;
    }

    /* renamed from: k */
    public static void m728k() {
        if (C0047bt.f934bt) {
            short s = f767s;
            f761P = s;
            if (s <= 0) {
                f761P = (short) 1;
            }
            f763b = (short) 1;
            f767s = (short) 1;
        } else {
            f767s = f761P;
        }
        short s2 = C0047bt.f934bt ? (short) 1 : f762a;
        f763b = s2;
        f767s = s2;
        f764c = C0047bt.f934bt ? (short) 25 : (short) 0;
        C0015ao.f145aW[15] = (byte) (C0047bt.f934bt ? 0 : 1);
    }

    /* renamed from: n */
    private void m729n() {
        for (byte b = 0; b < this.f774F.length; b = (byte) (b + 1)) {
            if (this.f774F[b].f44k >= 0 && this.f774F[b].f35b == 1) {
                for (byte b2 = 0; b2 < C0047bt.f821M.length; b2 = (byte) (b2 + 1)) {
                    if (C0047bt.f821M[b2] != null && !C0047bt.f821M[b2].m1372a() && this.f774F[b].f36c == C0047bt.f821M[b2].f2035a) {
                        C0047bt.f821M[b2].m1374b((byte) 4);
                    }
                }
            }
        }
        this.f770B = this.f802y.f2147ak;
        this.f787f = (short) 3;
    }

    /* renamed from: o */
    private void m730o() {
        if (this.f773E[0].f2275a == 0) {
            for (byte b = 0; b < C0047bt.f816H.length; b = (byte) (b + 1)) {
                C0047bt.f816H[b].f2429l = false;
                if (C0047bt.f816H[b].f2418a == this.f773E[0].f2276b) {
                    if (this.f773E[0].f2278d != 1 && this.f773E[0].f2278d != 5 && this.f773E[0].f2278d != 8 && this.f773E[0].f2278d != 10) {
                        if (this.f773E[0].f2278d == 2) {
                            C0047bt.f816H[b].f2429l = true;
                            this.f787f = (short) 6;
                            return;
                        } else if (this.f773E[0].f2278d == 3) {
                            C0047bt.f816H[b].f2430m = true;
                            return;
                        } else {
                            if (this.f773E[0].f2278d == -1) {
                                this.f770B = this.f802y.f2147ak;
                                this.f787f = (short) 3;
                                return;
                            }
                            return;
                        }
                    }
                    if (this.f773E[0].f2278d == 8) {
                        C0047bt.f816H[b].f2431n = true;
                    }
                    this.f769A = null;
                    if (this.f773E[0].f2278d == 5) {
                        if (this.f773E[0].f2279e >= 10) {
                            this.f769A = new C0064cj(this.f773E[0].f2279e, m737v());
                            for (byte b2 = 0; b2 < this.f769A.f2033b.length; b2 = (byte) (b2 + 1)) {
                                if (this.f774F != null) {
                                    byte b3 = 0;
                                    while (true) {
                                        if (b3 >= this.f774F.length) {
                                            break;
                                        }
                                        if (this.f774F[b3].f35b == 1 && this.f774F[b3].f45l == 0) {
                                            this.f774F[b3].f45l = (byte) 1;
                                            if (m718c((int) this.f774F[b3].f36c) >= 0 && m718c((int) this.f774F[b3].f36c) < C0047bt.f821M.length && C0047bt.f821M[m718c((int) this.f774F[b3].f36c)].f2047m != null) {
                                                this.f769A.m1367a(b2, C0088t.f2497R[this.f774F[b3].f36c][0], C0088t.f2497R[this.f774F[b3].f36c][1]);
                                            }
                                        } else if (this.f774F[b3].f35b == 0 && this.f774F[b3].f45l == 0) {
                                            this.f774F[b3].f45l = (byte) 1;
                                            if (C0047bt.f816H[m705a(this.f774F[b3].f36c)].f2427j != null) {
                                                this.f769A.m1367a(b2, C0088t.f2496Q[this.f774F[b3].f36c][0], C0088t.f2496Q[this.f774F[b3].f36c][1]);
                                            }
                                        } else {
                                            b3 = (byte) (b3 + 1);
                                        }
                                    }
                                }
                            }
                        }
                    } else if (this.f773E[0].f2278d == 10) {
                        if (this.f773E[0].f2279e >= 10) {
                            this.f769A = new C0064cj(this.f773E[0].f2279e, 1);
                            if (this.f774F != null) {
                                byte b4 = 0;
                                while (true) {
                                    if (b4 >= this.f774F.length) {
                                        break;
                                    }
                                    if (this.f774F[b4].f35b < 0) {
                                        b4 = (byte) (b4 + 1);
                                    } else if (this.f774F[b4].f35b == 1) {
                                        this.f769A.m1367a(0, C0088t.f2497R[1][0], C0088t.f2497R[1][1]);
                                    } else if (this.f774F[b4].f35b == 0) {
                                        this.f769A.m1367a(0, C0088t.f2496Q[1][0], C0088t.f2496Q[1][1]);
                                    }
                                }
                            }
                        }
                    } else if (this.f773E[0].f2279e >= 10) {
                        this.f769A = new C0064cj(this.f773E[0].f2279e, this.f773E[0].f2279e == 22 ? 1 : m738w());
                        for (byte b5 = 0; b5 < this.f769A.f2033b.length; b5 = (byte) (b5 + 1)) {
                            if (this.f774F != null) {
                                for (byte b6 = 0; b6 < this.f774F.length; b6 = (byte) (b6 + 1)) {
                                    if ((this.f774F[b6].f35b == 1 && this.f774F[b6].f45l == 0) || this.f773E[0].f2279e == 22) {
                                        this.f774F[b6].f45l = (byte) 1;
                                        if (m718c((int) this.f774F[b6].f36c) >= 0 && m718c((int) this.f774F[b6].f36c) < C0047bt.f821M.length && C0047bt.f821M[m718c((int) this.f774F[b6].f36c)].f2047m != null) {
                                            this.f769A.m1367a(b5, C0088t.f2497R[this.f774F[b6].f36c][0], C0088t.f2497R[this.f774F[b6].f36c][1]);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    C0047bt.f816H[b].m1639b((byte) 2);
                    this.f787f = (short) 2;
                    this.f772D = this.f802y.f2147ak;
                    return;
                }
            }
            return;
        }
        if (this.f773E[0].f2275a == 1) {
            for (byte b7 = 0; b7 < C0047bt.f821M.length; b7 = (byte) (b7 + 1)) {
                C0047bt.f821M[b7].f2049o = false;
                if (C0047bt.f821M[b7].f2035a == this.f773E[0].f2276b) {
                    if (this.f773E[0].f2278d != 6) {
                        if (f768t != 0 && this.f773E[0].f2278d != 8 && ((f768t != 1 || (this.f773E[0].f2278d != 1 && this.f773E[0].f2278d != 5)) && ((f768t != 2 || (this.f773E[0].f2278d != 1 && this.f773E[0].f2278d != 5)) && ((f768t != 1 || (this.f773E[0].f2278d != 1 && this.f773E[0].f2278d != 10)) && (f768t != 2 || (this.f773E[0].f2278d != 1 && this.f773E[0].f2278d != 10)))))) {
                            if (this.f773E[0].f2278d == 2) {
                                C0047bt.f821M[b7].f2049o = true;
                                this.f787f = (short) 6;
                                return;
                            } else if (this.f773E[0].f2278d == 3) {
                                C0047bt.f821M[b7].f2050p = true;
                                return;
                            } else {
                                if (this.f773E[0].f2278d == -1) {
                                    this.f770B = this.f802y.f2147ak;
                                    this.f787f = (short) 3;
                                    return;
                                }
                                return;
                            }
                        }
                        if (this.f773E[0].f2278d == 8) {
                            C0047bt.f821M[b7].f2051q = true;
                        }
                        C0047bt.f821M[b7].m1374b((byte) 2);
                        this.f769A = null;
                        if (this.f773E[0].f2278d == 5) {
                            if (this.f773E[0].f2279e >= 10) {
                                this.f769A = new C0064cj(this.f773E[0].f2279e, m737v());
                                for (byte b8 = 0; b8 < this.f769A.f2033b.length; b8 = (byte) (b8 + 1)) {
                                    if (this.f774F != null) {
                                        byte b9 = 0;
                                        while (true) {
                                            if (b9 >= this.f774F.length) {
                                                break;
                                            }
                                            if (this.f774F[b9].f35b == 0 && this.f774F[b9].f45l == 0) {
                                                this.f774F[b9].f45l = (byte) 1;
                                                if (m705a(this.f774F[b9].f36c) >= 0 && m705a(this.f774F[b9].f36c) <= C0047bt.f816H.length - 1 && C0047bt.f816H[m705a(this.f774F[b9].f36c)].f2427j != null) {
                                                    this.f769A.m1367a(b8, C0088t.f2496Q[this.f774F[b9].f36c][0], C0088t.f2496Q[this.f774F[b9].f36c][1]);
                                                    break;
                                                }
                                                b9 = (byte) (b9 + 1);
                                            } else {
                                                if (this.f774F[b9].f35b == 1 && this.f774F[b9].f45l == 0) {
                                                    this.f774F[b9].f45l = (byte) 1;
                                                    if (m718c((int) this.f774F[b9].f36c) >= 0 && m718c((int) this.f774F[b9].f36c) <= C0047bt.f821M.length - 1 && C0047bt.f821M[m718c((int) this.f774F[b9].f36c)].f2047m != null) {
                                                        this.f769A.m1367a(b8, C0088t.f2497R[this.f774F[b9].f36c][0], C0088t.f2497R[this.f774F[b9].f36c][1]);
                                                        break;
                                                    }
                                                }
                                                b9 = (byte) (b9 + 1);
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (this.f773E[0].f2278d == 10) {
                            if (this.f773E[0].f2279e >= 10) {
                                this.f769A = new C0064cj(this.f773E[0].f2279e, 1);
                                if (this.f774F != null) {
                                    byte b10 = 0;
                                    while (true) {
                                        if (b10 >= this.f774F.length) {
                                            break;
                                        }
                                        if (this.f774F[b10].f35b < 0) {
                                            b10 = (byte) (b10 + 1);
                                        } else if (this.f774F[b10].f35b == 1) {
                                            this.f769A.m1367a(0, C0088t.f2497R[1][0], C0088t.f2497R[1][1]);
                                        } else if (this.f774F[b10].f35b == 0) {
                                            this.f769A.m1367a(0, C0088t.f2496Q[1][0], C0088t.f2496Q[1][1]);
                                        }
                                    }
                                }
                            }
                        } else if (this.f773E[0].f2279e >= 10) {
                            this.f769A = new C0064cj(this.f773E[0].f2279e, m738w());
                            for (byte b11 = 0; b11 < this.f769A.f2033b.length; b11 = (byte) (b11 + 1)) {
                                if (this.f774F != null) {
                                    byte b12 = 0;
                                    while (true) {
                                        if (b12 >= this.f774F.length) {
                                            break;
                                        }
                                        if (this.f774F[b12].f35b == 0 && this.f774F[b12].f45l == 0 && m705a(this.f774F[b12].f36c) >= 0 && m705a(this.f774F[b12].f36c) <= C0047bt.f816H.length - 1 && C0047bt.f816H[m705a(this.f774F[b12].f36c)].f2427j != null) {
                                            this.f774F[b12].f45l = (byte) 1;
                                            this.f769A.m1367a(b11, C0088t.f2496Q[this.f774F[b12].f36c][0], C0088t.f2496Q[this.f774F[b12].f36c][1]);
                                            break;
                                        }
                                        b12 = (byte) (b12 + 1);
                                    }
                                }
                            }
                        }
                        this.f787f = (short) 2;
                        this.f772D = this.f802y.f2147ak;
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* renamed from: p */
    private void m731p() {
        if (this.f777I - this.f771C >= 1000) {
            this.f771C = this.f802y.f2147ak;
            short s = (short) (f767s - 1);
            f767s = s;
            if (s <= 0) {
                if (C0047bt.f934bt && f764c <= 0) {
                    this.f803z.m362O();
                    f764c = (short) 0;
                    this.f786e = 5;
                    return;
                }
                this.f790j = (byte) 0;
                this.f803z.f238az = (this.f803z.f238az > C0047bt.f1083ej.length + (-1) || this.f803z.f238az < 0) ? (byte) 0 : this.f803z.f238az;
                this.f796p = C0047bt.f1083ej[this.f803z.f238az];
                this.f794n = (byte) 1;
                this.f788h = (this.f788h > C0047bt.f821M.length + (-1) || this.f788h < 0) ? (byte) 0 : this.f788h;
                m744a(C0047bt.f934bt ? (byte) 0 : (byte) 1, C0047bt.f934bt ? 0 : 1, (byte) 1, C0047bt.f821M[this.f788h].f2035a, C0047bt.f934bt ? (byte) 0 : (byte) 1, C0047bt.f934bt ? 0 : 1, (byte) 1, C0047bt.f821M[this.f788h].f2035a);
                this.f787f = (short) -1;
                this.f786e = 5;
                if (C0002ab.m0c()) {
                    return;
                }
                f764c = (byte) (C0047bt.f934bt ? f764c - 1 : 0);
            }
        }
    }

    /* renamed from: q */
    private void m732q() {
        if (C0047bt.f1087en[this.f803z.f238az] == -1 || this.f803z.f238az < 0 || this.f803z.f238az >= 8) {
            return;
        }
        this.f790j = (byte) 0;
        this.f796p = C0047bt.f1083ej[this.f803z.f238az];
        if (m726h() && C0047bt.f1084ek[this.f803z.f238az] != 2) {
            this.f802y.m1442b("只能使用复活道具");
            return;
        }
        if (C0047bt.f1085el[this.f803z.f238az] == 2) {
            this.f794n = (byte) 1;
            this.f795o = C0047bt.f821M[this.f788h].f2035a;
            if (m717c() > 1 && m717c() > C0047bt.f1086em[this.f803z.f238az]) {
                this.f785d = 1;
                return;
            }
            if (!m753j()) {
                this.f785d = 2;
                this.f786e = 3;
                return;
            } else {
                m744a(this.f790j, this.f796p, this.f794n, this.f795o, (byte) 1, 1, (byte) 1, C0047bt.f821M[this.f788h].f2035a);
                this.f787f = (short) -1;
                this.f786e = 5;
                return;
            }
        }
        if (C0047bt.f1085el[this.f803z.f238az] == 1) {
            this.f794n = (byte) 0;
            this.f789i = m725f() < 0 ? this.f789i : m725f();
            this.f785d = 7;
        } else if (C0047bt.f1085el[this.f803z.f238az] == 0) {
            this.f794n = (byte) 0;
            byte bM727i = m727i();
            this.f789i = bM727i;
            this.f795o = bM727i;
            if (!m753j()) {
                this.f785d = 2;
                this.f786e = 3;
            } else {
                m744a(this.f790j, this.f796p, this.f794n, this.f795o, (byte) 1, 1, (byte) 1, (byte) -1);
                this.f787f = (short) -1;
                this.f786e = 5;
            }
        }
    }

    /* renamed from: r */
    private void m733r() {
        if (C0047bt.f1091er[this.f803z.f238az] == 2) {
            this.f792l = (byte) 1;
            if (m717c() <= 1 || m717c() <= C0047bt.f1092es[this.f803z.f238az]) {
                m744a(this.f790j, this.f796p, this.f794n, this.f795o, (byte) 0, this.f803z.f238az, (byte) 1, C0047bt.f821M[this.f788h].f2035a);
                this.f787f = (short) -1;
                this.f786e = 5;
                return;
            } else {
                this.f791k = (byte) 0;
                this.f797q = C0047bt.f1089ep[this.f803z.f238az];
                this.f785d = 3;
                return;
            }
        }
        if (C0047bt.f1091er[this.f803z.f238az] != 1) {
            if (C0047bt.f1091er[this.f803z.f238az] == 0) {
                this.f791k = (byte) 0;
                this.f797q = C0047bt.f1089ep[this.f803z.f238az];
                this.f793m = (byte) (m727i() + 3);
                this.f792l = (byte) 0;
                this.f789i = m752g();
                m744a(this.f790j, this.f796p, this.f794n, this.f795o, this.f791k, this.f797q, this.f792l, this.f793m);
                this.f787f = (short) -1;
                this.f786e = 5;
                return;
            }
            return;
        }
        this.f792l = (byte) 0;
        this.f791k = (byte) 0;
        this.f797q = C0047bt.f1089ep[this.f803z.f238az];
        if (m713b() > 1 && m713b() > C0047bt.f1092es[this.f803z.f238az]) {
            this.f789i = m752g();
            this.f785d = 8;
            return;
        }
        byte bM727i = (byte) (m727i() + 3);
        this.f789i = bM727i;
        this.f793m = bM727i;
        this.f792l = (byte) 0;
        m744a(this.f790j, this.f796p, this.f794n, this.f795o, this.f791k, this.f797q, this.f792l, this.f793m);
        this.f787f = (short) -1;
        this.f786e = 5;
    }

    /* renamed from: s */
    private int m734s() {
        if (this.f769A == null) {
            return 0;
        }
        C0064cj c0064cj = this.f769A;
        C0009ai c0009ai = RunnableC0066a.f2114f;
        return C0009ai.m43a(c0064cj.f2032a, this.f802y.f2147ak);
    }

    /* renamed from: t */
    private static boolean m735t() {
        if (C0047bt.f821M != null) {
            for (byte b = 0; b < C0047bt.f821M.length; b = (byte) (b + 1)) {
                if (C0047bt.f821M[b] != null && C0047bt.f821M[b].f2039e > 0) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: u */
    private static boolean m736u() {
        if (C0047bt.f816H != null) {
            for (byte b = 0; b < C0047bt.f816H.length; b = (byte) (b + 1)) {
                if (C0047bt.f816H[b] != null && C0047bt.f816H[b].f2422e > 0 && C0047bt.f816H[b].f2419b != 2) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: v */
    private byte m737v() {
        byte b = 0;
        if (this.f774F == null) {
            return (byte) 0;
        }
        byte b2 = 0;
        while (true) {
            byte b3 = b;
            if (b2 >= this.f774F.length) {
                return b3;
            }
            b = this.f774F[b2].f34a >= 5 ? (byte) (b3 + 1) : b3;
            b2 = (byte) (b2 + 1);
        }
    }

    /* renamed from: w */
    private int m738w() {
        if (this.f774F == null) {
            return 0;
        }
        int i = 0;
        for (byte b = 0; b < this.f774F.length; b = (byte) (b + 1)) {
            if (this.f774F[b].f35b != this.f773E[0].f2275a) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: x */
    private static boolean m739x() {
        for (byte b = 0; b < C0047bt.f816H.length; b = (byte) (b + 1)) {
            if (!C0047bt.f816H[b].m1641d() && C0047bt.f816H[b].f2428k != 1) {
                return false;
            }
        }
        for (byte b2 = 0; b2 < C0047bt.f821M.length; b2 = (byte) (b2 + 1)) {
            if (!C0047bt.f821M[b2].m1372a() && C0047bt.f821M[b2].f2048n != 1) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: y */
    private static boolean m740y() {
        for (int i = 0; i < C0047bt.f816H.length; i++) {
            if (C0047bt.f816H[i].f2420c.equals(C0047bt.f865ad) && C0047bt.f816H[i].f2432o) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final int m741a(int i, int i2) {
        if (this.f780L == null) {
            return 0;
        }
        for (int i3 = 0; i3 < this.f780L.length; i3++) {
            if (i >= this.f780L[i3][0] && i <= this.f780L[i3][0] + this.f780L[i3][2] && i2 >= this.f780L[i3][1] && i2 <= this.f780L[i3][1] + this.f780L[i3][3]) {
                this.f786e = i3;
                return 1073741824;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public final int m742a(int i, int i2, int i3) {
        if (this.f782N == null) {
            return 0;
        }
        int i4 = i == 0 ? 5 : i == 2 ? 3 : 0;
        if (i4 == 0) {
            return 0;
        }
        for (int i5 = 0; i5 < this.f782N.length; i5++) {
            if (i2 >= this.f782N[i5][0] && i2 <= this.f782N[i5][0] + this.f782N[i5][2] && i3 >= this.f782N[i5][1] && i3 <= this.f782N[i5][1] + this.f782N[i5][3]) {
                if (this.f803z.f238az != i5 || this.f786e != i4) {
                    this.f786e = i4;
                    this.f803z.f238az = (byte) (i5 - 1);
                    return 2;
                }
                if (this.f803z.f238az == i5 && this.f786e == i4) {
                    return this.f783O[i5];
                }
            }
        }
        return 0;
    }

    /* renamed from: a */
    public final void m743a() {
        int i = (C0088t.f2516b - 176) / 4;
        int i2 = (C0088t.f2517c - 208) / 6;
        C0088t.f2496Q = new short[6][2];
        short[][] sArr = new short[6][2];
        C0088t.f2497R = sArr;
        sArr[0][0] = (short) (C0088t.f2499T[0][0] + i);
        C0088t.f2497R[0][1] = (short) (C0088t.f2499T[0][1] + (i2 << 1));
        C0088t.f2497R[1][0] = (short) (C0088t.f2499T[1][0] + (i << 1));
        C0088t.f2497R[1][1] = (short) (C0088t.f2499T[1][1] + (i2 << 1));
        C0088t.f2497R[2][0] = (short) (C0088t.f2499T[2][0] + (i * 3));
        C0088t.f2497R[2][1] = (short) (C0088t.f2499T[2][1] + (i2 << 1));
        C0088t.f2497R[3][0] = (short) (C0088t.f2499T[3][0] + i);
        C0088t.f2497R[3][1] = (short) (C0088t.f2499T[3][1] + i2);
        C0088t.f2497R[4][0] = (short) (C0088t.f2499T[4][0] + (i << 1));
        C0088t.f2497R[4][1] = (short) (C0088t.f2499T[4][1] + i2);
        C0088t.f2497R[5][0] = (short) (C0088t.f2499T[5][0] + (i * 3));
        C0088t.f2497R[5][1] = (short) (C0088t.f2499T[5][1] + i2);
        C0088t.f2496Q[0][0] = (short) (C0088t.f2498S[0][0] + i);
        C0088t.f2496Q[0][1] = (short) (C0088t.f2498S[0][1] + (i2 * 5));
        C0088t.f2496Q[1][0] = (short) (C0088t.f2498S[1][0] + (i << 1));
        C0088t.f2496Q[1][1] = (short) (C0088t.f2498S[1][1] + (i2 * 5));
        C0088t.f2496Q[2][0] = (short) (C0088t.f2498S[2][0] + (i * 3));
        C0088t.f2496Q[2][1] = (short) (C0088t.f2498S[2][1] + (i2 * 5));
        C0088t.f2496Q[3][0] = (short) (C0088t.f2498S[3][0] + i);
        C0088t.f2496Q[3][1] = (short) (C0088t.f2498S[3][1] + (i2 << 2));
        C0088t.f2496Q[4][0] = (short) (C0088t.f2498S[4][0] + (i << 1));
        C0088t.f2496Q[4][1] = (short) (C0088t.f2498S[4][1] + (i2 << 2));
        C0088t.f2496Q[5][0] = (short) ((i * 3) + C0088t.f2498S[5][0]);
        C0088t.f2496Q[5][1] = (short) (C0088t.f2498S[5][1] + (i2 << 2));
        C0047bt.f816H = new C0084p[C0047bt.f817I.length];
        if (f768t == 0) {
            C0047bt.f821M = new C0065ck[C0047bt.f822N.length];
        } else if (f768t == 1 || f768t == 2) {
            C0047bt.f821M = new C0065ck[C0047bt.f818J.length];
        }
        for (int i3 = 0; i3 < C0047bt.f817I.length; i3++) {
            C0047bt.f816H[i3] = C0047bt.f817I[i3].m1640c();
            C0047bt.f816H[i3].m1639b((byte) 1);
        }
        if (f768t == 0) {
            for (byte b = 0; b < C0047bt.f822N.length; b = (byte) (b + 1)) {
                C0065ck[] c0065ckArr = C0047bt.f821M;
                C0065ck c0065ck = C0047bt.f822N[b];
                C0065ck c0065ck2 = new C0065ck();
                c0065ck2.f2035a = c0065ck.f2035a;
                c0065ck2.f2036b = c0065ck.f2036b;
                c0065ck2.f2037c = c0065ck.f2037c;
                c0065ck2.f2038d = c0065ck.f2038d;
                c0065ck2.f2039e = c0065ck.f2039e;
                c0065ck2.f2040f = c0065ck.f2040f;
                c0065ck2.f2041g = c0065ck.f2041g;
                c0065ck2.f2042h = c0065ck.f2042h;
                c0065ck2.f2044j = c0065ck.f2044j;
                c0065ck2.f2048n = c0065ck.f2048n;
                c0065ck2.f2047m = c0065ck.f2047m;
                c0065ck2.f2052r = c0065ck.f2052r;
                c0065ck2.f2053s = c0065ck.f2053s;
                c0065ck2.f2054t = c0065ck.f2054t;
                c0065ck2.f2043i = c0065ck.f2043i;
                c0065ck2.f2045k = c0065ck.f2045k;
                c0065ck2.f2046l = c0065ck.f2046l;
                c0065ckArr[b] = c0065ck2;
                C0047bt.f821M[b].m1374b((byte) 1);
            }
        } else if (f768t == 1 || f768t == 2) {
            for (byte b2 = 0; b2 < C0047bt.f818J.length; b2 = (byte) (b2 + 1)) {
                C0047bt.f821M[b2] = C0047bt.f818J[b2].m1638b();
                C0047bt.f821M[b2].m1374b((byte) 1);
            }
        }
        if (C0047bt.f817I != null) {
            for (byte b3 = 0; b3 < C0047bt.f817I.length; b3 = (byte) (b3 + 1)) {
                if (C0047bt.f817I[b3] != null) {
                    C0047bt.f817I[b3].m1642e();
                    C0047bt.f817I[b3] = null;
                }
            }
            C0047bt.f817I = null;
        }
        if (f768t == 0) {
            if (C0047bt.f822N != null) {
                for (byte b4 = 0; b4 < C0047bt.f822N.length; b4 = (byte) (b4 + 1)) {
                    if (C0047bt.f822N[b4] != null) {
                        C0047bt.f822N[b4].m1373b();
                        C0047bt.f822N[b4] = null;
                    }
                }
                C0047bt.f822N = null;
            }
        } else if (C0047bt.f818J != null) {
            for (byte b5 = 0; b5 < C0047bt.f818J.length; b5 = (byte) (b5 + 1)) {
                if (C0047bt.f818J[b5] != null) {
                    C0047bt.f818J[b5].m1642e();
                    C0047bt.f818J[b5] = null;
                }
            }
            C0047bt.f818J = null;
        }
        C0047bt.f819K = C0047bt.f820L;
        C0047bt.f820L = (short) -1;
        if (C0047bt.f819K == 2 && C0047bt.f933bs != -1 && C0047bt.f1765s == 0) {
            this.f787f = (short) 9;
        } else {
            this.f787f = (short) 0;
        }
        this.f785d = 0;
        this.f788h = (byte) 0;
        this.f786e = 5;
        this.f803z.f238az = (byte) 0;
        if (C0047bt.f934bt) {
            f763b = (short) 1;
            f767s = (short) 1;
            f761P = f762a;
        } else {
            short s = f762a;
            f763b = s;
            f767s = s;
            f761P = s;
        }
        this.f771C = System.currentTimeMillis();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007c A[EDGE_INSN: B:78:0x007c->B:43:0x007c BREAK  A[LOOP:0: B:10:0x0014->B:22:0x003e]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cd  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m744a(byte b, int i, byte b2, byte b3, byte b4, int i2, byte b5, byte b6) {
        boolean z;
        boolean z2;
        if (b != 4 && m711a(b2, b3) && b2 == 0) {
            if (b == 2) {
                int i3 = 0;
                while (true) {
                    int i4 = i3;
                    if (i4 >= C0047bt.f891bC.size()) {
                        break;
                    }
                    C0041bn c0041bn = (C0041bn) C0047bt.f891bC.elementAt(i4);
                    if (c0041bn != null && i == c0041bn.f714a && c0041bn.f719f == 2) {
                        z2 = true;
                        break;
                    }
                    i3 = i4 + 1;
                }
                if (!z2) {
                    this.f802y.m1442b("不能对死亡目标使用");
                    return;
                }
            } else if (b == 0) {
                z2 = C0047bt.f1084ek[i] == 2 ? true : C0047bt.f1084ek[i] == 6 && C0047bt.f1085el[i] == 1;
                if (!z2) {
                }
            } else if (b == 1) {
                for (int i5 = 0; i5 < C0047bt.f1045dy.length; i5++) {
                    if (i == C0047bt.f1042dv[i5] && C0047bt.f1045dy[i5] == 1) {
                        z2 = true;
                        break;
                    }
                }
                if (!z2) {
                }
            }
        }
        if (b4 != 4 && m711a(b5, b6) && b2 == 0) {
            if (b4 == 2) {
                z = false;
                if (!z) {
                    this.f802y.m1442b("不能对死亡目标使用");
                    return;
                }
            } else if (b4 == 0) {
                if (C0047bt.f1090eq != null && C0047bt.f1090eq[i2] == 2) {
                    z = true;
                }
                if (!z) {
                }
            } else if (b4 == 1 && C0047bt.f962cU != null) {
                for (int i6 = 0; i6 < C0047bt.f962cU.length; i6++) {
                    if (i2 == C0047bt.f959cR[i6] && C0047bt.f962cU[i6] == 1) {
                        z = true;
                        break;
                    }
                }
                z = false;
                if (!z) {
                }
            }
        }
        byte[] bArrM1086a = C0053bz.m1086a((short) 4180, C0047bt.f865ad, C0047bt.f1768v, f765g, f768t, b, i, b2, b3, b4, i2, b5, b6);
        if (bArrM1086a == null) {
            this.f802y.m1442b("获取上传指令数据错误!");
            return;
        }
        RunnableC0066a.f2115i.m600a(new C0091w((short) 4180, bArrM1086a));
        this.f778J = false;
        this.f785d = 0;
    }

    /* renamed from: a */
    public final void m745a(int i) {
        byte b;
        byte b2;
        byte b3;
        byte b4;
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        if (C0047bt.f933bs == 0 && C0047bt.f1765s == 0 && f765g > 0) {
            m751d();
            return;
        }
        if (this.f787f != 10) {
            if (C0015ao.f148ac != null) {
                C0009ai.m43a(C0015ao.f148ac, this.f802y.f2147ak);
            }
            if (C0015ao.f149ad != null) {
                C0009ai.m43a(C0015ao.f149ad, this.f802y.f2147ak);
            }
            if (C0015ao.f150ae != null) {
                C0009ai.m43a(C0015ao.f150ae, this.f802y.f2147ak);
            }
            if (C0047bt.f816H != null) {
                for (byte b5 = 0; b5 < C0047bt.f816H.length; b5 = (byte) (b5 + 1)) {
                    if (C0047bt.f816H[b5].f2428k == 1) {
                        C0084p c0084p = C0047bt.f816H[b5];
                        C0009ai c0009ai = RunnableC0066a.f2114f;
                        long j = this.f802y.f2147ak;
                        if (c0084p.f2427j != null && !c0084p.m1641d()) {
                            C0009ai.m43a(c0084p.f2427j, j);
                        }
                        if (this.f774F != null) {
                            for (byte b6 = 0; b6 < this.f774F.length; b6 = (byte) (b6 + 1)) {
                                if (this.f774F[b6].f35b == 0 && this.f774F[b6].f36c == C0047bt.f816H[b5].f2418a) {
                                    m710a(C0047bt.f816H[b5], this.f774F[b6]);
                                }
                            }
                        }
                    } else if (C0047bt.f816H[b5].f2428k == 2) {
                        if (C0047bt.f816H[b5].f2427j == null || C0009ai.m43a(C0047bt.f816H[b5].f2427j, this.f802y.f2147ak) == 2) {
                            C0047bt.f816H[b5].m1639b((byte) 1);
                            if (this.f774F != null) {
                                for (byte b7 = 0; b7 < this.f774F.length; b7 = (byte) (b7 + 1)) {
                                    if (this.f774F[b7].f35b == 0 && this.f774F[b7].f36c == C0047bt.f816H[b5].f2418a) {
                                        m710a(C0047bt.f816H[b5], this.f774F[b7]);
                                    }
                                }
                            }
                            if (this.f769A == null) {
                                for (byte b8 = 0; b8 < C0047bt.f821M.length; b8 = (byte) (b8 + 1)) {
                                    if (this.f774F != null) {
                                        byte b9 = 0;
                                        while (true) {
                                            if (b9 >= this.f774F.length) {
                                                break;
                                            }
                                            if (this.f774F[b9].f35b == 1 && C0047bt.f821M[b8].f2035a == this.f774F[b9].f36c) {
                                                C0047bt.f821M[b8].m1374b((byte) 4);
                                                break;
                                            }
                                            b9 = (byte) (b9 + 1);
                                        }
                                    }
                                }
                                for (byte b10 = 0; b10 < C0047bt.f816H.length; b10 = (byte) (b10 + 1)) {
                                    if (this.f774F != null) {
                                        byte b11 = 0;
                                        while (true) {
                                            if (b11 >= this.f774F.length) {
                                                break;
                                            }
                                            if (this.f774F[b11].f35b == 0 && C0047bt.f816H[b10].f2418a == this.f774F[b11].f36c) {
                                                C0047bt.f816H[b10].m1639b((byte) 4);
                                                break;
                                            }
                                            b11 = (byte) (b11 + 1);
                                        }
                                    }
                                }
                                this.f770B = this.f802y.f2147ak;
                                this.f787f = (short) 3;
                            } else {
                                this.f787f = (short) 5;
                            }
                        }
                    } else if (C0047bt.f816H[b5].f2428k == 4 && (C0047bt.f816H[b5].f2427j == null || C0009ai.m43a(C0047bt.f816H[b5].f2427j, this.f802y.f2147ak) == 2)) {
                        if (this.f774F != null) {
                            for (byte b12 = 0; b12 < this.f774F.length; b12 = (byte) (b12 + 1)) {
                                if (this.f774F[b12].f35b == 0 && this.f774F[b12].f36c == C0047bt.f816H[b5].f2418a) {
                                    m710a(C0047bt.f816H[b5], this.f774F[b12]);
                                }
                            }
                        }
                        C0047bt.f816H[b5].m1639b((byte) 1);
                    }
                }
            }
            if (C0047bt.f821M != null) {
                for (byte b13 = 0; b13 < C0047bt.f821M.length; b13 = (byte) (b13 + 1)) {
                    if (C0047bt.f821M[b13].f2048n == 1) {
                        C0047bt.f821M[b13].m1369a(RunnableC0066a.f2114f, this.f802y.f2147ak);
                    } else if (C0047bt.f821M[b13].f2048n == 2) {
                        if (C0047bt.f821M[b13].f2047m == null || C0009ai.m43a(C0047bt.f821M[b13].f2047m, this.f802y.f2147ak) == 2) {
                            C0047bt.f821M[b13].m1374b((byte) 1);
                            if (this.f769A == null) {
                                for (byte b14 = 0; b14 < C0047bt.f816H.length; b14 = (byte) (b14 + 1)) {
                                    if (this.f774F != null) {
                                        byte b15 = 0;
                                        while (true) {
                                            if (b15 >= this.f774F.length) {
                                                break;
                                            }
                                            if (this.f774F[b15].f35b == 0 && C0047bt.f816H[b14].f2418a == this.f774F[b15].f36c) {
                                                C0047bt.f816H[b14].m1639b((byte) 4);
                                                break;
                                            }
                                            b15 = (byte) (b15 + 1);
                                        }
                                    }
                                }
                                for (byte b16 = 0; b16 < C0047bt.f821M.length; b16 = (byte) (b16 + 1)) {
                                    if (this.f774F != null) {
                                        byte b17 = 0;
                                        while (true) {
                                            if (b17 >= this.f774F.length) {
                                                break;
                                            }
                                            if (this.f774F[b17].f35b == 1 && C0047bt.f821M[b16].f2035a == this.f774F[b17].f36c) {
                                                C0047bt.f821M[b16].m1374b((byte) 4);
                                                break;
                                            }
                                            b17 = (byte) (b17 + 1);
                                        }
                                    }
                                }
                                this.f770B = this.f802y.f2147ak;
                                this.f787f = (short) 3;
                            } else {
                                this.f787f = (short) 5;
                            }
                        }
                    } else if (C0047bt.f821M[b13].f2048n != 3 && C0047bt.f821M[b13].f2048n == 4 && (C0047bt.f821M[b13].f2047m == null || C0009ai.m43a(C0047bt.f821M[b13].f2047m, this.f802y.f2147ak) == 2)) {
                        if (this.f774F != null) {
                            for (byte b18 = 0; b18 < this.f774F.length; b18 = (byte) (b18 + 1)) {
                                if (this.f774F[b18].f35b == 1 && this.f774F[b18].f36c == C0047bt.f821M[b13].f2035a) {
                                    C0047bt.f821M[b13].f2039e = this.f774F[b18].f40g;
                                    C0047bt.f821M[b13].f2041g = this.f774F[b18].f41h;
                                    C0047bt.f821M[b13].f2040f = this.f774F[b18].f42i;
                                    C0047bt.f821M[b13].f2042h = this.f774F[b18].f43j;
                                    if (C0047bt.f821M[b13].f2039e <= 0) {
                                        byte b19 = 0;
                                        while (true) {
                                            if (b19 >= C0047bt.f821M.length) {
                                                b19 = -1;
                                                break;
                                            }
                                            if (f768t == 1 || f768t == 2) {
                                                if (C0047bt.f821M[b19].f2039e > 0 && C0047bt.f821M[b19].f2036b == 0) {
                                                    break;
                                                } else {
                                                    b19 = (byte) (b19 + 1);
                                                }
                                            } else if (C0047bt.f821M[b19].f2039e > 0) {
                                                break;
                                            } else {
                                                b19 = (byte) (b19 + 1);
                                            }
                                        }
                                        this.f788h = b19;
                                        this.f788h = this.f788h < 0 ? (byte) 0 : this.f788h;
                                    }
                                }
                            }
                        }
                        C0047bt.f821M[b13].m1374b((byte) 1);
                    }
                }
            }
        }
        if (this.f785d == 0 || this.f785d == 2 || this.f787f > 1) {
            if (i == 8) {
                if (this.f786e == 5 || (this.f786e == 3 && this.f785d > 1)) {
                    C0015ao c0015ao = this.f803z;
                    if (this.f803z.f238az <= 0) {
                        b2 = 9;
                    } else {
                        b2 = (byte) (r2.f238az - 1);
                        this.f803z.f238az = b2;
                    }
                    c0015ao.f238az = b2;
                }
            } else if (i == 2) {
                if (this.f786e == 5 || (this.f786e == 3 && this.f785d > 1)) {
                    C0015ao c0015ao2 = this.f803z;
                    if (this.f803z.f238az >= 9) {
                        b = 0;
                    } else {
                        C0015ao c0015ao3 = this.f803z;
                        b = (byte) (c0015ao3.f238az + 1);
                        c0015ao3.f238az = b;
                    }
                    c0015ao2.f238az = b;
                }
            } else if (i == 1073741824) {
                if (this.f786e == 5 || (this.f786e == 3 && this.f785d > 1)) {
                    if (this.f803z.f238az == 8) {
                        this.f803z.m358K();
                    } else if (this.f803z.f238az == 9) {
                        this.f803z.m362O();
                        this.f786e = 5;
                    }
                }
            } else if (i == 1024) {
                this.f803z.m358K();
            } else if (i == 2048) {
                this.f803z.m362O();
                if (this.f785d <= 1) {
                    this.f786e = 5;
                } else if (this.f785d > 1) {
                    this.f786e = 3;
                }
            }
        }
        if (this.f787f == 0) {
            this.f777I = System.currentTimeMillis();
            if (m726h() && this.f787f != -1 && !C0015ao.m327r()) {
                this.f790j = (byte) 0;
                this.f796p = C0047bt.f1083ej[this.f803z.f238az];
                this.f794n = (byte) 1;
                byte b20 = C0047bt.f934bt ? (byte) 0 : (byte) 1;
                int i6 = C0047bt.f934bt ? 0 : 1;
                byte b21 = C0047bt.f821M[this.f788h].f2035a;
                boolean z2 = C0047bt.f934bt;
                m744a(b20, i6, (byte) 1, b21, (byte) 1, C0047bt.f934bt ? 0 : 1, (byte) 1, C0047bt.f821M[this.f788h].f2035a);
                this.f787f = (short) -1;
                this.f786e = 5;
                this.f785d = 0;
            }
            if (this.f785d == 0) {
                if (m740y() && !m726h()) {
                    this.f790j = (byte) 1;
                    this.f796p = 1;
                    this.f794n = (byte) 1;
                    if (m753j()) {
                        m744a(this.f790j, this.f796p, this.f794n, this.f795o, (byte) 1, 1, (byte) 1, C0047bt.f821M[this.f788h].f2035a);
                        this.f787f = (short) -1;
                        this.f786e = 5;
                    } else {
                        this.f785d = 2;
                        this.f786e = 3;
                    }
                } else if (i == 1) {
                    if (this.f786e <= 0) {
                        i5 = 5;
                    } else {
                        i5 = this.f786e - 1;
                        this.f786e = i5;
                    }
                    this.f786e = i5;
                } else if (i == 4) {
                    if (this.f786e >= 5) {
                        i4 = 0;
                    } else {
                        i4 = this.f786e + 1;
                        this.f786e = i4;
                    }
                    this.f786e = i4;
                } else if (i == 1073741824) {
                    this.f778J = false;
                    if (this.f786e != 0 || m726h()) {
                        if (this.f786e == 1 && !m726h()) {
                            this.f790j = (byte) 3;
                            this.f796p = 1;
                            this.f794n = (byte) 1;
                            this.f795o = C0047bt.f821M[this.f788h].f2035a;
                            if (m753j()) {
                                m744a(this.f790j, this.f796p, this.f794n, this.f795o, (byte) 1, 1, (byte) 1, C0047bt.f821M[this.f788h].f2035a);
                                this.f787f = (short) -1;
                                this.f786e = 5;
                            } else {
                                this.f785d = 2;
                                this.f786e = 3;
                            }
                        } else if (this.f786e != 2 || m726h()) {
                            if (this.f786e == 3) {
                                this.f803z.m447e(6);
                            } else if (this.f786e != 4 || m726h()) {
                                if (this.f786e == 5 && C0047bt.f1087en[this.f803z.f238az] != -1 && this.f803z.f238az >= 0 && this.f803z.f238az < 8) {
                                    m732q();
                                }
                            } else if (m753j()) {
                                this.f791k = (byte) 1;
                                this.f797q = 1;
                                if (f768t == 1) {
                                    this.f802y.m1442b("决斗时不能逃跑!");
                                } else if (C0047bt.f933bs == 0 && C0047bt.f1765s == 0) {
                                    this.f802y.m1442b("队员不能逃跑");
                                } else {
                                    m744a((byte) 4, -1, (byte) 0, this.f795o, this.f791k, this.f797q, (byte) 1, C0047bt.f821M[this.f788h].f2035a);
                                    this.f787f = (short) -1;
                                    this.f786e = 5;
                                }
                            } else if (f768t == 1) {
                                this.f802y.m1442b("决斗时不能逃跑!");
                            } else {
                                this.f790j = (byte) 4;
                                this.f796p = 1;
                                this.f794n = (byte) 0;
                                this.f795o = (byte) 1;
                                this.f785d = 2;
                                this.f786e = 3;
                            }
                        } else if (C0047bt.f996dB == null || C0047bt.f996dB.length <= 0) {
                            this.f802y.m1442b("没有可用技能");
                        } else {
                            this.f803z.m462h(3);
                        }
                    } else if (m717c() <= 1) {
                        this.f790j = (byte) 1;
                        this.f796p = 1;
                        this.f794n = (byte) 1;
                        this.f795o = C0047bt.f821M[this.f788h].f2035a;
                        if (m753j()) {
                            m744a(this.f790j, this.f796p, this.f794n, this.f795o, (byte) 1, 1, (byte) 1, C0047bt.f821M[this.f788h].f2035a);
                            this.f787f = (short) -1;
                            this.f786e = 5;
                        } else {
                            this.f785d = 2;
                            this.f786e = 3;
                        }
                    } else {
                        this.f785d = 1;
                    }
                } else if (i != 513 || C0047bt.f934bt) {
                    if (i != 514 || C0047bt.f934bt) {
                        if (i != 515 || C0047bt.f934bt) {
                            if (i != 516 || C0047bt.f934bt) {
                                if (i != 517 || C0047bt.f934bt) {
                                    if (i != 518 || C0047bt.f934bt) {
                                        if (i != 519 || C0047bt.f934bt) {
                                            if (i == 520 && !C0047bt.f934bt && C0047bt.f1087en[7] != -1) {
                                                this.f803z.f238az = (byte) 7;
                                                if (C0047bt.f1085el[this.f803z.f238az] < 2) {
                                                    m732q();
                                                } else if (m715b(0)) {
                                                    this.f790j = (byte) 0;
                                                    this.f796p = C0047bt.f1083ej[this.f803z.f238az];
                                                    this.f794n = (byte) 1;
                                                    this.f795o = C0047bt.f821M[this.f788h].f2035a;
                                                    if (m753j()) {
                                                        m744a(this.f790j, this.f796p, this.f794n, this.f795o, (byte) 1, 1, (byte) 1, C0047bt.f821M[this.f788h].f2035a);
                                                        this.f787f = (short) -1;
                                                        this.f786e = 5;
                                                    } else {
                                                        this.f785d = 2;
                                                        this.f786e = 3;
                                                    }
                                                } else {
                                                    this.f778J = true;
                                                    this.f785d = 1;
                                                }
                                            }
                                        } else if (C0047bt.f1087en[6] != -1) {
                                            this.f803z.f238az = (byte) 6;
                                            if (C0047bt.f1085el[this.f803z.f238az] < 2) {
                                                m732q();
                                            } else if (m715b(0)) {
                                                this.f790j = (byte) 0;
                                                this.f796p = C0047bt.f1083ej[this.f803z.f238az];
                                                this.f794n = (byte) 1;
                                                this.f795o = C0047bt.f821M[this.f788h].f2035a;
                                                if (m753j()) {
                                                    m744a(this.f790j, this.f796p, this.f794n, this.f795o, (byte) 1, 1, (byte) 1, C0047bt.f821M[this.f788h].f2035a);
                                                    this.f787f = (short) -1;
                                                    this.f786e = 5;
                                                } else {
                                                    this.f785d = 2;
                                                    this.f786e = 3;
                                                }
                                            } else {
                                                this.f778J = true;
                                                this.f785d = 1;
                                            }
                                        }
                                    } else if (C0047bt.f1087en[5] != -1) {
                                        this.f803z.f238az = (byte) 5;
                                        if (C0047bt.f1085el[this.f803z.f238az] < 2) {
                                            m732q();
                                        } else if (m715b(0)) {
                                            this.f790j = (byte) 0;
                                            this.f796p = C0047bt.f1083ej[this.f803z.f238az];
                                            this.f794n = (byte) 1;
                                            this.f795o = C0047bt.f821M[this.f788h].f2035a;
                                            if (m753j()) {
                                                m744a(this.f790j, this.f796p, this.f794n, this.f795o, (byte) 1, 1, (byte) 1, C0047bt.f821M[this.f788h].f2035a);
                                                this.f787f = (short) -1;
                                                this.f786e = 5;
                                            } else {
                                                this.f785d = 2;
                                                this.f786e = 3;
                                            }
                                        } else {
                                            this.f778J = true;
                                            this.f785d = 1;
                                        }
                                    }
                                } else if (C0047bt.f1087en[4] != -1) {
                                    this.f803z.f238az = (byte) 4;
                                    if (C0047bt.f1085el[this.f803z.f238az] < 2) {
                                        m732q();
                                    } else if (m715b(0)) {
                                        this.f790j = (byte) 0;
                                        this.f796p = C0047bt.f1083ej[this.f803z.f238az];
                                        this.f794n = (byte) 1;
                                        this.f795o = C0047bt.f821M[this.f788h].f2035a;
                                        if (m753j()) {
                                            m744a(this.f790j, this.f796p, this.f794n, this.f795o, (byte) 1, 1, (byte) 1, C0047bt.f821M[this.f788h].f2035a);
                                            this.f787f = (short) -1;
                                            this.f786e = 5;
                                        } else {
                                            this.f785d = 2;
                                            this.f786e = 3;
                                        }
                                    } else {
                                        this.f778J = true;
                                        this.f785d = 1;
                                    }
                                }
                            } else if (C0047bt.f1087en[3] != -1) {
                                this.f803z.f238az = (byte) 3;
                                if (C0047bt.f1085el[this.f803z.f238az] < 2) {
                                    m732q();
                                } else if (m715b(0)) {
                                    this.f790j = (byte) 0;
                                    this.f796p = C0047bt.f1083ej[this.f803z.f238az];
                                    this.f794n = (byte) 1;
                                    this.f795o = C0047bt.f821M[this.f788h].f2035a;
                                    if (m753j()) {
                                        m744a(this.f790j, this.f796p, this.f794n, this.f795o, (byte) 1, 1, (byte) 1, C0047bt.f821M[this.f788h].f2035a);
                                        this.f787f = (short) -1;
                                        this.f786e = 5;
                                    } else {
                                        this.f785d = 2;
                                        this.f786e = 3;
                                    }
                                } else {
                                    this.f778J = true;
                                    this.f785d = 1;
                                }
                            }
                        } else if (C0047bt.f1087en[2] != -1) {
                            this.f803z.f238az = (byte) 2;
                            if (C0047bt.f1085el[this.f803z.f238az] < 2) {
                                m732q();
                            } else if (m715b(0)) {
                                this.f790j = (byte) 0;
                                this.f796p = C0047bt.f1083ej[this.f803z.f238az];
                                this.f794n = (byte) 1;
                                this.f795o = C0047bt.f821M[this.f788h].f2035a;
                                if (m753j()) {
                                    m744a(this.f790j, this.f796p, this.f794n, this.f795o, (byte) 1, 1, (byte) 1, C0047bt.f821M[this.f788h].f2035a);
                                    this.f787f = (short) -1;
                                    this.f786e = 5;
                                } else {
                                    this.f785d = 2;
                                    this.f786e = 3;
                                }
                            } else {
                                this.f778J = true;
                                this.f785d = 1;
                            }
                        }
                    } else if (C0047bt.f1087en[1] != -1) {
                        this.f803z.f238az = (byte) 1;
                        if (C0047bt.f1085el[this.f803z.f238az] < 2) {
                            m732q();
                        } else if (m715b(0)) {
                            this.f790j = (byte) 0;
                            this.f796p = C0047bt.f1083ej[this.f803z.f238az];
                            this.f794n = (byte) 1;
                            this.f795o = C0047bt.f821M[this.f788h].f2035a;
                            if (m753j()) {
                                m744a(this.f790j, this.f796p, this.f794n, this.f795o, (byte) 1, 1, (byte) 1, C0047bt.f821M[this.f788h].f2035a);
                                this.f787f = (short) -1;
                                this.f786e = 5;
                            } else {
                                this.f785d = 2;
                                this.f786e = 3;
                            }
                        } else {
                            this.f778J = true;
                            this.f785d = 1;
                        }
                    }
                } else if (C0047bt.f1087en[0] != -1) {
                    this.f803z.f238az = (byte) 0;
                    if (C0047bt.f1085el[this.f803z.f238az] < 2) {
                        m732q();
                    } else if (m715b(0)) {
                        this.f790j = (byte) 0;
                        this.f796p = C0047bt.f1083ej[this.f803z.f238az];
                        this.f794n = (byte) 1;
                        this.f795o = C0047bt.f821M[this.f788h].f2035a;
                        if (m753j()) {
                            m744a(this.f790j, this.f796p, this.f794n, this.f795o, (byte) 1, 1, (byte) 1, C0047bt.f821M[this.f788h].f2035a);
                            this.f787f = (short) -1;
                            this.f786e = 5;
                        } else {
                            this.f785d = 2;
                            this.f786e = 3;
                        }
                    } else {
                        this.f778J = true;
                        this.f785d = 1;
                    }
                }
            } else if (this.f785d == 1) {
                if (i == 8 || i == 2 || i == 1 || i == 4) {
                    this.f788h = m712b(this.f788h);
                } else if (i == 1073741824) {
                    if (this.f786e == 5 || this.f778J) {
                        if (this.f803z.f238az < 0 || this.f803z.f238az > 7 || !C0047bt.f934bt) {
                            this.f790j = (byte) 0;
                            this.f796p = C0047bt.f1083ej[this.f803z.f238az];
                            this.f794n = (byte) 1;
                            this.f795o = C0047bt.f821M[this.f788h].f2035a;
                        }
                    } else if (this.f786e == 0) {
                        this.f790j = (byte) 1;
                        this.f796p = 1;
                        this.f794n = (byte) 1;
                        this.f795o = C0047bt.f821M[this.f788h].f2035a;
                    } else if (this.f786e == 2) {
                        this.f790j = (byte) 1;
                        this.f796p = C0047bt.f1032dl[this.f802y.f2150ar.m1275g()];
                        this.f794n = (byte) 1;
                        this.f795o = C0047bt.f821M[this.f788h].f2035a;
                    }
                    if (m753j()) {
                        m744a(this.f790j, this.f796p, this.f794n, this.f795o, (byte) 1, 1, (byte) 1, (byte) -1);
                        this.f787f = (short) -1;
                        this.f786e = 5;
                    } else {
                        this.f785d = 2;
                        this.f786e = 3;
                    }
                } else if (i == 536870912) {
                    this.f785d = 0;
                }
            } else if (this.f785d == 2) {
                byte b22 = 0;
                while (true) {
                    if (b22 >= C0047bt.f816H.length) {
                        z = false;
                        break;
                    } else {
                        if (C0047bt.f816H[b22].f2419b != 0 && C0047bt.f816H[b22].f2418a == m727i() + 3 && C0047bt.f816H[b22].f2432o) {
                            z = true;
                            break;
                        }
                        b22 = (byte) (b22 + 1);
                    }
                }
                if (z) {
                    m744a(this.f790j, this.f796p, this.f794n, this.f795o, (byte) 1, 1, (byte) 1, C0047bt.f821M[this.f788h].f2035a);
                    this.f787f = (short) -1;
                    this.f786e = 5;
                } else {
                    if (i == 1) {
                        if (this.f786e <= 0) {
                            i3 = 3;
                        } else {
                            i3 = this.f786e - 1;
                            this.f786e = i3;
                        }
                        this.f786e = i3;
                    } else if (i == 4) {
                        if (this.f786e >= 3) {
                            i2 = 0;
                        } else {
                            i2 = this.f786e + 1;
                            this.f786e = i2;
                        }
                        this.f786e = i2;
                    } else if (i == 1073741824) {
                        if (this.f786e == 0) {
                            if (m717c() <= 1) {
                                m744a(this.f790j, this.f796p, this.f794n, this.f795o, (byte) 1, 1, (byte) 1, C0047bt.f821M[this.f788h].f2035a);
                                this.f787f = (short) -1;
                                this.f786e = 5;
                            } else {
                                this.f791k = (byte) 1;
                                this.f797q = 1;
                                this.f785d = 3;
                            }
                        } else if (this.f786e == 1) {
                            m744a(this.f790j, this.f796p, this.f794n, this.f795o, (byte) 3, 1, (byte) 1, C0047bt.f821M[this.f788h].f2035a);
                            this.f787f = (short) -1;
                            this.f786e = 5;
                        } else if (this.f786e == 2) {
                            if (C0047bt.f959cR == null || C0047bt.f959cR.length <= 0) {
                                this.f802y.m1442b("宠物没有技能!");
                            } else {
                                this.f803z.m398a(false, true);
                            }
                        } else if (this.f786e == 3 && C0047bt.f1093et[this.f803z.f238az] != -1) {
                            m733r();
                        }
                    }
                    if (i != 513 || C0047bt.f934bt) {
                        if (i != 514 || C0047bt.f934bt) {
                            if (i != 515 || C0047bt.f934bt) {
                                if (i != 516 || C0047bt.f934bt) {
                                    if (i != 517 || C0047bt.f934bt) {
                                        if (i != 518 || C0047bt.f934bt) {
                                            if (i != 519 || C0047bt.f934bt) {
                                                if (i != 520 || C0047bt.f934bt) {
                                                    if (i == 536870912) {
                                                        if (m740y()) {
                                                            this.f802y.m1442b("你已被锁定\t无法进行该操作");
                                                        } else {
                                                            this.f785d = 0;
                                                        }
                                                    }
                                                } else if (C0047bt.f1093et[7] != -1) {
                                                    this.f803z.f238az = (byte) 7;
                                                    m733r();
                                                }
                                            } else if (C0047bt.f1093et[6] != -1) {
                                                this.f803z.f238az = (byte) 6;
                                                m733r();
                                            }
                                        } else if (C0047bt.f1093et[5] != -1) {
                                            this.f803z.f238az = (byte) 5;
                                            m733r();
                                        }
                                    } else if (C0047bt.f1093et[4] != -1) {
                                        this.f803z.f238az = (byte) 4;
                                        m733r();
                                    }
                                } else if (C0047bt.f1093et[3] != -1) {
                                    this.f803z.f238az = (byte) 3;
                                    m733r();
                                }
                            } else if (C0047bt.f1093et[2] != -1) {
                                this.f803z.f238az = (byte) 2;
                                m733r();
                            }
                        } else if (C0047bt.f1093et[1] != -1) {
                            this.f803z.f238az = (byte) 1;
                            m733r();
                        }
                    } else if (C0047bt.f1093et[0] != -1) {
                        this.f803z.f238az = (byte) 0;
                        m733r();
                    }
                }
            } else if (this.f785d == 3) {
                if (i == 8 || i == 2 || i == 1 || i == 4) {
                    this.f788h = m712b(this.f788h);
                } else if (i == 1073741824 || i == 517) {
                    m744a(this.f790j, this.f796p, this.f794n, this.f795o, this.f791k, this.f797q, (byte) 1, C0047bt.f821M[this.f788h].f2035a);
                    this.f787f = (short) -1;
                    this.f786e = 5;
                } else if (i == 536870912) {
                    this.f785d = 2;
                    this.f786e = 3;
                }
            } else if (this.f785d == 4) {
                if (i == 8 || i == 2 || i == 1 || i == 4) {
                    if (m726h()) {
                        this.f802y.m1442b("只能对自己使用复活道具");
                    } else {
                        this.f789i = m716c(this.f789i);
                    }
                } else if (i == 1073741824 || i == 517) {
                    this.f795o = C0047bt.f816H[this.f789i].f2418a;
                    if (m753j()) {
                        m744a(this.f790j, this.f796p, this.f794n, this.f795o, (byte) 1, 1, (byte) 1, C0047bt.f821M[this.f788h].f2035a);
                        this.f787f = (short) -1;
                        this.f786e = 5;
                    } else {
                        this.f785d = 2;
                        this.f786e = 3;
                    }
                } else if (i == 536870912) {
                    this.f785d = 0;
                }
            } else if (this.f785d == 5) {
                if (i == 8 || i == 2 || i == 1 || i == 4) {
                    this.f789i = m716c(this.f789i);
                } else if (i == 1073741824 || i == 517) {
                    this.f795o = C0047bt.f816H[this.f789i].f2418a;
                    this.f790j = (byte) 1;
                    this.f796p = C0047bt.f1032dl[this.f802y.f2150ar.m1275g()];
                    this.f794n = (byte) 0;
                    if (m753j()) {
                        m744a(this.f790j, this.f796p, this.f794n, this.f795o, (byte) 1, 1, (byte) 1, (byte) -1);
                        this.f787f = (short) -1;
                        this.f786e = 5;
                    } else {
                        this.f785d = 2;
                        this.f786e = 3;
                    }
                } else if (i == 536870912) {
                    this.f785d = 0;
                }
            } else if (this.f785d == 6) {
                if (i == 8 || i == 2 || i == 1 || i == 4) {
                    this.f789i = m716c(this.f789i);
                } else if (i == 1073741824 || i == 517) {
                    this.f791k = (byte) 1;
                    this.f797q = C0047bt.f1032dl[this.f802y.f2150ar.m1275g()];
                    this.f792l = (byte) 0;
                    m744a(this.f790j, this.f796p, this.f794n, this.f795o, this.f791k, this.f797q, this.f792l, C0047bt.f816H[this.f789i].f2418a);
                    this.f787f = (short) -1;
                    this.f786e = 5;
                } else if (i == 536870912) {
                    this.f785d = 2;
                    this.f786e = 3;
                }
            } else if (this.f785d == 7) {
                if (i == 8 || i == 2 || i == 1 || i == 4) {
                    this.f789i = m716c(this.f789i);
                } else if (i == 1073741824 || i == 517) {
                    this.f795o = C0047bt.f816H[this.f789i].f2418a;
                    if (m753j()) {
                        m744a(this.f790j, this.f796p, this.f794n, this.f795o, (byte) 1, 1, (byte) 1, (byte) -1);
                        this.f787f = (short) -1;
                        this.f786e = 5;
                    } else {
                        this.f785d = 2;
                        this.f786e = 3;
                    }
                } else if (i == 536870912) {
                    this.f785d = 0;
                }
            } else if (this.f785d == 8) {
                if (i == 8 || i == 2 || i == 1 || i == 4) {
                    this.f789i = m716c(this.f789i);
                } else if (i == 1073741824 || i == 517) {
                    m744a(this.f790j, this.f796p, this.f794n, this.f795o, this.f791k, this.f797q, this.f792l, C0047bt.f816H[this.f789i].f2418a);
                    this.f787f = (short) -1;
                    this.f786e = 5;
                } else if (i == 536870912) {
                    this.f785d = 2;
                    this.f786e = 3;
                }
            } else if (this.f785d == 9) {
                if (i == 8 || i == 2 || i == 1 || i == 4) {
                    this.f788h = m712b(this.f788h);
                } else if (i == 1073741824 || i == 517) {
                    this.f795o = C0047bt.f821M[this.f788h].f2035a;
                    if (m753j()) {
                        m744a(this.f790j, this.f796p, this.f794n, this.f795o, (byte) 1, 1, (byte) 1, (byte) -1);
                        this.f787f = (short) -1;
                        this.f786e = 5;
                    } else {
                        this.f785d = 2;
                        this.f786e = 3;
                    }
                } else if (i == 536870912) {
                    this.f785d = 0;
                }
            }
        } else if (this.f787f == 1) {
            if (this.f784Q) {
                this.f784Q = false;
                boolean z3 = false;
                boolean z4 = false;
                byte b23 = 0;
                while (true) {
                    if (b23 >= C0047bt.f816H.length) {
                        b3 = -1;
                        break;
                    } else {
                        if (C0047bt.f816H[b23].f2419b == 0 && C0047bt.f816H[b23].f2420c.equals(C0047bt.f865ad)) {
                            b3 = b23;
                            break;
                        }
                        b23 = (byte) (b23 + 1);
                    }
                }
                byte b24 = 0;
                while (true) {
                    if (b24 >= C0047bt.f816H.length) {
                        b4 = -1;
                        break;
                    } else {
                        if (C0047bt.f816H[b24].f2419b != 0 && C0047bt.f816H[b24].f2418a == m727i() + 3) {
                            b4 = b24;
                            break;
                        }
                        b24 = (byte) (b24 + 1);
                    }
                }
                int i7 = 0;
                while (true) {
                    int i8 = i7;
                    if (i8 >= this.f799v.size()) {
                        break;
                    }
                    if (((C0077i[]) this.f799v.elementAt(i8))[0].f2278d == 9) {
                        C0005ae[] c0005aeArr = (C0005ae[]) this.f800w.elementAt(i8);
                        for (int i9 = 0; i9 < c0005aeArr.length; i9++) {
                            if (c0005aeArr[i9].f35b == 0 && C0047bt.f816H[b3].f2418a == c0005aeArr[i9].f36c && m722d(c0005aeArr[i9].f44k)) {
                                C0047bt.f816H[b3].f2432o = true;
                                z3 = true;
                            }
                            if (C0047bt.f919be > 0 && c0005aeArr[i9].f35b == 0 && C0047bt.f816H[b4].f2418a == c0005aeArr[i9].f36c && m722d(c0005aeArr[i9].f44k)) {
                                C0047bt.f816H[b4].f2432o = true;
                                z4 = true;
                            }
                        }
                    }
                    i7 = i8 + 1;
                }
                if (!z3) {
                    C0047bt.f816H[b3].f2432o = false;
                }
                if (!z4 && C0047bt.f919be > 0) {
                    C0047bt.f816H[b4].f2432o = false;
                }
            }
            if (this.f799v.size() <= 0) {
                this.f773E = null;
                if (m726h()) {
                    if (C0015ao.m327r()) {
                        this.f787f = (short) 0;
                        f767s = f763b;
                    } else {
                        this.f790j = (byte) 0;
                        this.f796p = C0047bt.f1083ej[this.f803z.f238az];
                        this.f794n = (byte) 1;
                        byte b25 = C0047bt.f934bt ? (byte) 0 : (byte) 1;
                        int i10 = C0047bt.f934bt ? 0 : 1;
                        byte b26 = C0047bt.f821M[this.f788h].f2035a;
                        boolean z5 = C0047bt.f934bt;
                        m744a(b25, i10, (byte) 1, b26, (byte) 1, C0047bt.f934bt ? 0 : 1, (byte) 1, C0047bt.f821M[this.f788h].f2035a);
                        this.f787f = (short) -1;
                        this.f786e = 5;
                    }
                    this.f785d = 0;
                } else if (this.f787f != 0) {
                    this.f785d = 0;
                    f767s = f763b;
                    this.f787f = (short) 0;
                }
                for (byte b27 = 0; b27 < C0047bt.f816H.length; b27 = (byte) (b27 + 1)) {
                    C0047bt.f816H[b27].f2430m = false;
                    C0047bt.f816H[b27].f2429l = false;
                    C0047bt.f816H[b27].f2431n = false;
                }
                for (byte b28 = 0; b28 < C0047bt.f821M.length; b28 = (byte) (b28 + 1)) {
                    C0047bt.f821M[b28].f2050p = false;
                    C0047bt.f821M[b28].f2049o = false;
                    C0047bt.f821M[b28].f2051q = false;
                }
                this.f784Q = true;
            } else if (this.f799v.size() > 0) {
                this.f773E = (C0077i[]) this.f799v.elementAt(0);
                if (this.f800w.size() > 0) {
                    this.f774F = (C0005ae[]) this.f800w.elementAt(0);
                } else {
                    this.f774F = null;
                }
                if (this.f801x.size() > 0) {
                    this.f798u = (String[]) this.f801x.elementAt(0);
                } else {
                    this.f798u = null;
                }
                if (this.f773E[0].f2278d == 7 || this.f773E[0].f2278d == 5 || this.f773E[0].f2278d == 9 || this.f773E[0].f2278d == 1 || this.f773E[0].f2278d == 2 || this.f773E[0].f2278d == 3) {
                    for (byte b29 = 0; b29 < C0047bt.f816H.length; b29 = (byte) (b29 + 1)) {
                        if (C0047bt.f816H[b29] != null && !C0047bt.f816H[b29].m1641d()) {
                            for (byte b30 = 0; b30 < this.f774F.length; b30 = (byte) (b30 + 1)) {
                                if (this.f774F[b30].f44k >= 0 && this.f774F[b30].f35b == 0 && this.f774F[b30].f36c == C0047bt.f816H[b29].f2418a) {
                                    this.f775G = RunnableC0066a.f2097ac.m985a(String.valueOf((int) this.f774F[b30].f44k));
                                    if (this.f775G != null && !this.f776H.contains(this.f775G)) {
                                        boolean z6 = true;
                                        for (int i11 = 0; i11 < this.f776H.size(); i11++) {
                                            if (this.f776H.elementAt(i11).equals(this.f775G)) {
                                                z6 = false;
                                            }
                                        }
                                        if (z6) {
                                            this.f776H.addElement(this.f775G);
                                        }
                                    }
                                }
                            }
                        }
                        m706a(C0047bt.f816H[b29].f2436s, this.f776H);
                        this.f776H.removeAllElements();
                    }
                    for (byte b31 = 0; b31 < C0047bt.f821M.length; b31 = (byte) (b31 + 1)) {
                        if (C0047bt.f821M[b31] != null && !C0047bt.f821M[b31].m1372a()) {
                            for (byte b32 = 0; b32 < this.f774F.length; b32 = (byte) (b32 + 1)) {
                                if (this.f774F[b32].f44k >= 0 && this.f774F[b32].f35b == 1 && this.f774F[b32].f36c == C0047bt.f821M[b31].f2035a) {
                                    this.f775G = RunnableC0066a.f2097ac.m985a(String.valueOf((int) this.f774F[b32].f44k));
                                    if (this.f775G != null && !this.f776H.contains(this.f775G)) {
                                        boolean z7 = true;
                                        for (int i12 = 0; i12 < this.f776H.size(); i12++) {
                                            if (this.f776H.elementAt(i12) != this.f775G) {
                                                z7 = false;
                                            }
                                        }
                                        if (z7) {
                                            this.f776H.addElement(this.f775G);
                                        }
                                    }
                                }
                            }
                            m706a(C0047bt.f821M[b31].f2055u, this.f776H);
                            this.f776H.removeAllElements();
                        }
                    }
                }
                if (this.f773E[0].f2278d == 7) {
                    m729n();
                } else {
                    m730o();
                }
                if (this.f799v.size() > 0) {
                    this.f799v.removeElementAt(0);
                }
                if (this.f800w.size() > 0) {
                    this.f800w.removeElementAt(0);
                }
                if (this.f801x.size() > 0) {
                    this.f801x.removeElementAt(0);
                }
            }
        } else if (this.f787f == 2) {
            if (this.f772D == -1) {
                this.f772D = this.f802y.f2147ak;
            }
        } else if (this.f787f == 3 && m739x() && ((this.f798u != null && this.f802y.f2147ak - this.f770B >= 1450) || this.f798u == null)) {
            this.f787f = (short) 1;
        }
        if (this.f787f == 4) {
            if (m736u()) {
                this.f802y.f2213d.m1377a();
            }
            m751d();
            C0015ao c0015ao4 = this.f803z;
            this.f803z.f358k = (short) 0;
            c0015ao4.f357j = (short) 0;
        } else if (this.f787f == 5) {
            if (m734s() == 2) {
                for (byte b33 = 0; b33 < C0047bt.f816H.length; b33 = (byte) (b33 + 1)) {
                    if (this.f774F != null) {
                        byte b34 = 0;
                        while (true) {
                            if (b34 >= this.f774F.length) {
                                break;
                            }
                            if (this.f774F[b34].f35b == 0 && C0047bt.f816H[b33].f2418a == this.f774F[b34].f36c) {
                                C0047bt.f816H[b33].m1639b((byte) 4);
                                break;
                            }
                            b34 = (byte) (b34 + 1);
                        }
                    }
                }
                for (byte b35 = 0; b35 < C0047bt.f821M.length; b35 = (byte) (b35 + 1)) {
                    if (this.f774F != null) {
                        byte b36 = 0;
                        while (true) {
                            if (b36 >= this.f774F.length) {
                                break;
                            }
                            if (this.f774F[b36].f35b == 1 && C0047bt.f821M[b35].f2035a == this.f774F[b36].f36c) {
                                C0047bt.f821M[b35].m1374b((byte) 4);
                                break;
                            }
                            b36 = (byte) (b36 + 1);
                        }
                    }
                }
                this.f770B = this.f802y.f2147ak;
                this.f787f = (short) 3;
            }
        } else if (this.f787f == 6) {
            if (C0009ai.m43a(C0015ao.f147ab, this.f802y.f2147ak) == 2) {
                this.f787f = (short) 1;
            }
        } else if (this.f787f == 7) {
            if (C0009ai.m43a(C0015ao.f146aa, this.f802y.f2147ak) == 2) {
                this.f787f = (short) 8;
            }
        } else if (this.f787f == 8) {
            this.f802y.f2213d.m1377a();
            m751d();
            C0015ao c0015ao5 = this.f803z;
            this.f803z.f358k = (short) 0;
            c0015ao5.f357j = (short) 0;
        }
        if (this.f787f == 0 || this.f787f == 1) {
            if (this.f799v.size() <= 0 && C0047bt.f1770x == -1) {
                if ((m735t() || m736u()) || this.f787f == 1) {
                    this.f787f = (short) 4;
                    return;
                }
                return;
            }
            if (this.f787f != 9) {
                if (!((C0047bt.f933bs >= 0 && C0047bt.f1765s == 0) || f768t == 1 || f768t == 2 || C0047bt.f934bt) || f767s <= 0) {
                    return;
                }
                m731p();
            }
        }
    }

    /* renamed from: a */
    public final void m746a(C0009ai c0009ai, Graphics graphics) {
        graphics.setClip(0, 0, C0088t.f2516b, C0088t.f2517c);
        if ((this.f787f == 2 || this.f787f == 3 || this.f787f == 6) && this.f773E != null && this.f773E[0].f2280f != null && !this.f773E[0].f2280f.equals("")) {
            C0055ca.m1298a(graphics, this.f773E[0].f2280f, C0088t.f2516b / 2, (C0088t.f2517c - 22) - C0088t.f2524j, 17, 0, 16777215);
        }
        if (this.f787f != 4 && this.f787f != 8) {
            if (C0047bt.f816H != null) {
                for (byte length = (byte) (C0047bt.f816H.length - 1); length >= 0; length = (byte) (length - 1)) {
                    if (C0047bt.f816H[length].f2427j != null) {
                        if (C0047bt.f816H[length].m1641d()) {
                            RunnableC0066a.f2114f.m62a(graphics, C0015ao.f149ad, (int[]) null, 0, 0, C0088t.f2496Q[C0047bt.f816H[length].f2418a][0], C0088t.f2496Q[C0047bt.f816H[length].f2418a][1], 0, 0);
                        } else if (C0047bt.f816H[length].f2419b != 0 && C0047bt.f816H[length].f2427j != null) {
                            if (C0047bt.f816H[length].f2428k == 1 || C0047bt.f816H[length].f2428k == 4) {
                                C0047bt.f816H[length].m1637a(graphics, RunnableC0066a.f2114f, C0088t.f2496Q[C0047bt.f816H[length].f2418a][0], C0088t.f2496Q[C0047bt.f816H[length].f2418a][1], (byte) 0);
                            }
                            if (this.f787f != -1 && this.f787f != 0 && this.f787f != 7 && C0047bt.f816H[length].f2430m) {
                                RunnableC0066a.f2114f.m62a(graphics, C0015ao.f150ae, (int[]) null, 0, 0, C0088t.f2496Q[C0047bt.f816H[length].f2418a][0], C0088t.f2496Q[C0047bt.f816H[length].f2418a][1], 0, 0);
                            } else if (this.f787f == 6 && C0047bt.f816H[length].f2429l) {
                                RunnableC0066a.f2114f.m62a(graphics, C0015ao.f147ab, (int[]) null, 0, 0, C0088t.f2496Q[C0047bt.f816H[length].f2418a][0], C0088t.f2496Q[C0047bt.f816H[length].f2418a][1], 0, 0);
                            }
                        }
                    }
                }
                byte b = 0;
                while (true) {
                    byte b2 = b;
                    if (b2 >= C0047bt.f816H.length) {
                        break;
                    }
                    if (C0047bt.f816H[b2].f2419b == 0 && C0047bt.f816H[b2].f2427j != null) {
                        if (C0047bt.f816H[b2].f2420c.equals(C0047bt.f865ad)) {
                            graphics.drawImage(C0015ao.f139H.f598a, C0088t.f2496Q[C0047bt.f816H[b2].f2418a][0] - (C0015ao.f139H.f599b / 2), C0088t.f2496Q[C0047bt.f816H[b2].f2418a][1] - (C0015ao.f139H.f600c / 2), 20);
                            if ((this.f787f == 7 && C0047bt.f933bs == 1) || ((this.f787f == 7 && C0047bt.f933bs == -1) || (this.f787f == 7 && C0047bt.f1765s == 1))) {
                                RunnableC0066a.f2114f.m62a(graphics, C0015ao.f146aa, (int[]) null, 0, 0, C0088t.f2496Q[C0047bt.f816H[b2].f2418a][0], C0088t.f2496Q[C0047bt.f816H[b2].f2418a][1], 0, 0);
                            } else if (!C0047bt.f816H[b2].m1641d()) {
                                if (C0047bt.f816H[b2].f2428k == 1 || C0047bt.f816H[b2].f2428k == 4) {
                                    C0047bt.f816H[b2].m1637a(graphics, RunnableC0066a.f2114f, C0088t.f2496Q[C0047bt.f816H[b2].f2418a][0], C0088t.f2496Q[C0047bt.f816H[b2].f2418a][1], (byte) 0);
                                }
                                if (this.f787f != -1 && this.f787f != 0 && C0047bt.f816H[b2].f2430m) {
                                    RunnableC0066a.f2114f.m62a(graphics, C0015ao.f150ae, (int[]) null, 0, 0, C0088t.f2496Q[C0047bt.f816H[b2].f2418a][0], C0088t.f2496Q[C0047bt.f816H[b2].f2418a][1], 0, 0);
                                } else if (this.f787f == 6 && C0047bt.f816H[b2].f2429l) {
                                    RunnableC0066a.f2114f.m62a(graphics, C0015ao.f147ab, (int[]) null, 0, 0, C0088t.f2496Q[C0047bt.f816H[b2].f2418a][0], C0088t.f2496Q[C0047bt.f816H[b2].f2418a][1], 0, 0);
                                }
                            }
                        } else if (this.f787f == 7) {
                            int i = 0;
                            while (true) {
                                int i2 = i;
                                if (i2 >= C0047bt.f1683q.length) {
                                    break;
                                }
                                if (C0047bt.f1683q[i2].f397e.equals(C0047bt.f816H[b2].f2421d) && C0047bt.f1683q[i2].f753s == 1) {
                                    RunnableC0066a.f2114f.m62a(graphics, C0015ao.f146aa, (int[]) null, 0, 0, C0088t.f2496Q[C0047bt.f816H[b2].f2418a][0], C0088t.f2496Q[C0047bt.f816H[b2].f2418a][1], 0, 0);
                                } else if (C0047bt.f1683q[i2].f397e.equals(C0047bt.f816H[b2].f2421d) && C0047bt.f1683q[i2].f753s == 0 && !C0047bt.f816H[b2].m1641d()) {
                                    if (C0047bt.f816H[b2].f2428k == 1 || C0047bt.f816H[b2].f2428k == 4) {
                                        C0047bt.f816H[b2].m1637a(graphics, RunnableC0066a.f2114f, C0088t.f2496Q[C0047bt.f816H[b2].f2418a][0], C0088t.f2496Q[C0047bt.f816H[b2].f2418a][1], (byte) 0);
                                    }
                                    if (this.f787f != -1 && this.f787f != 0 && C0047bt.f816H[b2].f2430m) {
                                        RunnableC0066a.f2114f.m62a(graphics, C0015ao.f150ae, (int[]) null, 0, 0, C0088t.f2496Q[C0047bt.f816H[b2].f2418a][0], C0088t.f2496Q[C0047bt.f816H[b2].f2418a][1], 0, 0);
                                    } else if (this.f787f == 6 && C0047bt.f816H[b2].f2429l) {
                                        RunnableC0066a.f2114f.m62a(graphics, C0015ao.f147ab, (int[]) null, 0, 0, C0088t.f2496Q[C0047bt.f816H[b2].f2418a][0], C0088t.f2496Q[C0047bt.f816H[b2].f2418a][1], 0, 0);
                                    }
                                }
                                i = i2 + 1;
                            }
                        } else if (!C0047bt.f816H[b2].m1641d()) {
                            if (C0047bt.f816H[b2].f2428k == 1 || C0047bt.f816H[b2].f2428k == 4) {
                                C0047bt.f816H[b2].m1637a(graphics, RunnableC0066a.f2114f, C0088t.f2496Q[C0047bt.f816H[b2].f2418a][0], C0088t.f2496Q[C0047bt.f816H[b2].f2418a][1], (byte) 0);
                            }
                            if (this.f787f != -1 && this.f787f != 0 && C0047bt.f816H[b2].f2430m) {
                                RunnableC0066a.f2114f.m62a(graphics, C0015ao.f150ae, (int[]) null, 0, 0, C0088t.f2496Q[C0047bt.f816H[b2].f2418a][0], C0088t.f2496Q[C0047bt.f816H[b2].f2418a][1], 0, 0);
                            } else if (this.f787f == 6 && C0047bt.f816H[b2].f2429l) {
                                RunnableC0066a.f2114f.m62a(graphics, C0015ao.f147ab, (int[]) null, 0, 0, C0088t.f2496Q[C0047bt.f816H[b2].f2418a][0], C0088t.f2496Q[C0047bt.f816H[b2].f2418a][1], 0, 0);
                            }
                        }
                    }
                    if (C0047bt.f816H[b2].f2436s.size() > 0 && C0047bt.f816H[b2].f2427j != null) {
                        byte b3 = 0;
                        while (true) {
                            byte b4 = b3;
                            if (b4 < C0047bt.f816H[b2].f2436s.size()) {
                                RunnableC0066a.f2114f.m63a(graphics, (C0033bf) C0047bt.f816H[b2].f2436s.elementAt(b4), (int[]) null, 0, 0, 0, C0088t.f2496Q[C0047bt.f816H[b2].f2418a][0] - (C0047bt.f816H[b2].m1645h() / 2), (C0088t.f2496Q[C0047bt.f816H[b2].f2418a][1] + (b4 * 11)) - C0047bt.f816H[b2].m1646i(), 0, 0);
                                b3 = (byte) (b4 + 1);
                            }
                        }
                    }
                    b = (byte) (b2 + 1);
                }
            }
            if (C0047bt.f821M != null) {
                byte b5 = 0;
                while (true) {
                    byte b6 = b5;
                    if (b6 >= C0047bt.f821M.length) {
                        break;
                    }
                    if (C0047bt.f821M[b6].f2047m != null) {
                        if (!C0047bt.f821M[b6].m1372a()) {
                            if (C0047bt.f821M[b6].f2048n == 1 || C0047bt.f821M[b6].f2048n == 4) {
                                C0047bt.f821M[b6].m1371a(graphics, RunnableC0066a.f2114f, C0088t.f2497R[C0047bt.f821M[b6].f2035a][0], C0088t.f2497R[C0047bt.f821M[b6].f2035a][1], (byte) 0);
                                if (this.f787f != -1 && this.f787f != 0 && C0047bt.f821M[b6].f2050p) {
                                    RunnableC0066a.f2114f.m62a(graphics, C0015ao.f150ae, (int[]) null, 0, 0, C0088t.f2497R[C0047bt.f821M[b6].f2035a][0], C0088t.f2497R[C0047bt.f821M[b6].f2035a][1], 0, 0);
                                } else if (this.f787f == 6 && C0047bt.f821M[b6].f2049o) {
                                    RunnableC0066a.f2114f.m62a(graphics, C0015ao.f147ab, (int[]) null, 0, 0, C0088t.f2497R[C0047bt.f821M[b6].f2035a][0], C0088t.f2497R[C0047bt.f821M[b6].f2035a][1], 0, 0);
                                }
                            } else if (C0047bt.f821M[b6].f2048n == 2) {
                                if (this.f769A != null && this.f769A.f2033b.length > 0) {
                                    C0047bt.f821M[b6].m1371a(graphics, RunnableC0066a.f2114f, C0088t.f2497R[C0047bt.f821M[b6].f2035a][0], C0088t.f2497R[C0047bt.f821M[b6].f2035a][1], (byte) 0);
                                } else if (C0047bt.f821M[b6].f2051q) {
                                    if (m718c((int) this.f773E[0].f2277c) >= 0 && m718c((int) this.f773E[0].f2277c) < C0047bt.f821M.length) {
                                        C0047bt.f821M[b6].m1371a(graphics, RunnableC0066a.f2114f, C0088t.f2497R[C0047bt.f821M[m718c((int) this.f773E[0].f2277c)].f2035a][0], C0088t.f2497R[C0047bt.f821M[m718c((int) this.f773E[0].f2277c)].f2035a][1], (byte) 0);
                                    }
                                } else if (m705a(this.f773E[0].f2277c) >= 0 && m705a(this.f773E[0].f2277c) < C0047bt.f816H.length) {
                                    C0047bt.f821M[b6].m1371a(graphics, RunnableC0066a.f2114f, C0088t.f2496Q[C0047bt.f816H[m705a(this.f773E[0].f2277c)].f2418a][0] - (C0047bt.f816H[m705a(this.f773E[0].f2277c)].m1645h() / 2), C0088t.f2496Q[C0047bt.f816H[m705a(this.f773E[0].f2277c)].f2418a][1], (byte) 0);
                                }
                            }
                            if (C0047bt.f821M[b6].f2055u.size() > 0) {
                                byte b7 = 0;
                                while (true) {
                                    byte b8 = b7;
                                    if (b8 < C0047bt.f821M[b6].f2055u.size()) {
                                        C0009ai c0009ai2 = RunnableC0066a.f2114f;
                                        C0033bf c0033bf = (C0033bf) C0047bt.f821M[b6].f2055u.elementAt(b8);
                                        short s = C0088t.f2497R[C0047bt.f821M[b6].f2035a][0];
                                        C0065ck c0065ck = C0047bt.f821M[b6];
                                        c0009ai2.m63a(graphics, c0033bf, (int[]) null, 0, 0, 0, s - (((c0065ck.f2047m == null || c0065ck.f2047m.f567g == null) ? (short) 0 : c0065ck.f2047m.f567g[0]) / 2), (C0088t.f2497R[C0047bt.f821M[b6].f2035a][1] + (b8 * 11)) - C0047bt.f821M[b6].m1376d(), 0, 0);
                                        b7 = (byte) (b8 + 1);
                                    }
                                }
                            }
                        } else if (f768t == 1 || f768t == 2) {
                            RunnableC0066a.f2114f.m62a(graphics, C0015ao.f148ac, (int[]) null, 0, 0, C0088t.f2497R[C0047bt.f821M[b6].f2035a][0], C0088t.f2497R[C0047bt.f821M[b6].f2035a][1], 0, 0);
                        }
                    }
                    b5 = (byte) (b6 + 1);
                }
            }
            if (C0047bt.f816H != null && this.f787f != 7) {
                byte b9 = 0;
                while (true) {
                    byte b10 = b9;
                    if (b10 >= C0047bt.f816H.length) {
                        break;
                    }
                    if (!C0047bt.f816H[b10].m1641d() && C0047bt.f816H[b10].f2428k == 2 && this.f773E[0].f2277c >= 0) {
                        if (this.f769A != null && this.f769A.f2033b.length > 0) {
                            C0047bt.f816H[b10].m1637a(graphics, RunnableC0066a.f2114f, C0088t.f2496Q[C0047bt.f816H[b10].f2418a][0], C0088t.f2496Q[C0047bt.f816H[b10].f2418a][1], (byte) 0);
                        } else if (C0047bt.f816H[b10].f2431n) {
                            byte bM705a = (byte) m705a(this.f773E[0].f2277c);
                            if (bM705a >= 0 && bM705a <= C0047bt.f816H.length - 1) {
                                C0047bt.f816H[b10].m1637a(graphics, RunnableC0066a.f2114f, C0088t.f2496Q[C0047bt.f816H[m705a(this.f773E[0].f2277c)].f2418a][0], C0088t.f2496Q[C0047bt.f816H[m705a(this.f773E[0].f2277c)].f2418a][1], (byte) 0);
                            }
                        } else {
                            byte bM718c = (byte) m718c((int) this.f773E[0].f2277c);
                            if (bM718c >= 0 && bM718c <= C0047bt.f821M.length - 1) {
                                C0047bt.f816H[b10].m1637a(graphics, RunnableC0066a.f2114f, (C0047bt.f821M[m718c((int) this.f773E[0].f2277c)].m1375c() / 2) + C0088t.f2497R[C0047bt.f821M[m718c((int) this.f773E[0].f2277c)].f2035a][0], C0088t.f2497R[C0047bt.f821M[m718c((int) this.f773E[0].f2277c)].f2035a][1], (byte) 0);
                            }
                        }
                    }
                    b9 = (byte) (b10 + 1);
                }
            }
            if (this.f785d != 4 && this.f785d != 5 && this.f785d != 6) {
                if (this.f785d == 0 || this.f785d == 1) {
                    for (byte b11 = 0; b11 < C0047bt.f816H.length; b11 = (byte) (b11 + 1)) {
                        if (C0047bt.f816H[b11].f2422e > 0 && C0047bt.f816H[b11].f2419b == 0 && C0047bt.f816H[b11].f2420c.equals(C0047bt.f865ad)) {
                            if (C0047bt.f816H[b11].f2426i == 291) {
                                C0055ca.m1329e(graphics, C0088t.f2496Q[C0047bt.f816H[b11].f2418a][0] - 10, (C0088t.f2496Q[C0047bt.f816H[b11].f2418a][1] - 2) - C0047bt.f816H[b11].m1646i(), (C0047bt.f816H[b11].f2422e * 19) / (C0047bt.f816H[b11].f2423f <= 0 ? 1 : C0047bt.f816H[b11].f2423f), 0);
                                C0055ca.m1329e(graphics, C0088t.f2496Q[C0047bt.f816H[b11].f2418a][0] - 10, (C0088t.f2496Q[C0047bt.f816H[b11].f2418a][1] + 3) - C0047bt.f816H[b11].m1646i(), (C0047bt.f816H[b11].f2424g * 19) / (C0047bt.f816H[b11].f2425h <= 0 ? 1 : C0047bt.f816H[b11].f2425h), 1);
                            } else {
                                C0055ca.m1329e(graphics, C0088t.f2496Q[C0047bt.f816H[b11].f2418a][0] - 10, (C0088t.f2496Q[C0047bt.f816H[b11].f2418a][1] - 9) - C0047bt.f816H[b11].m1646i(), (C0047bt.f816H[b11].f2422e * 19) / (C0047bt.f816H[b11].f2423f <= 0 ? 1 : C0047bt.f816H[b11].f2423f), 0);
                                C0055ca.m1329e(graphics, C0088t.f2496Q[C0047bt.f816H[b11].f2418a][0] - 10, (C0088t.f2496Q[C0047bt.f816H[b11].f2418a][1] - 4) - C0047bt.f816H[b11].m1646i(), (C0047bt.f816H[b11].f2424g * 19) / (C0047bt.f816H[b11].f2425h <= 0 ? 1 : C0047bt.f816H[b11].f2425h), 1);
                            }
                        }
                    }
                } else if (this.f785d == 2 || this.f785d == 3) {
                    for (byte b12 = 0; b12 < C0047bt.f816H.length; b12 = (byte) (b12 + 1)) {
                        if (C0047bt.f816H[b12].f2422e > 0 && C0047bt.f816H[b12].f2419b != 0 && C0047bt.f816H[b12].f2418a == m727i() + 3) {
                            C0055ca.m1329e(graphics, C0088t.f2496Q[C0047bt.f816H[b12].f2418a][0] - 10, (C0088t.f2496Q[C0047bt.f816H[b12].f2418a][1] - 9) - C0047bt.f816H[b12].m1646i(), (C0047bt.f816H[b12].f2422e * 19) / (C0047bt.f816H[b12].f2423f <= 0 ? 1 : C0047bt.f816H[b12].f2423f), 0);
                            C0055ca.m1329e(graphics, C0088t.f2496Q[C0047bt.f816H[b12].f2418a][0] - 10, (C0088t.f2496Q[C0047bt.f816H[b12].f2418a][1] - 4) - C0047bt.f816H[b12].m1646i(), (C0047bt.f816H[b12].f2424g * 19) / (C0047bt.f816H[b12].f2425h <= 0 ? 1 : C0047bt.f816H[b12].f2425h), 1);
                        }
                    }
                }
            }
            byte b13 = 0;
            while (true) {
                byte b14 = b13;
                if (b14 >= C0047bt.f816H.length) {
                    break;
                }
                if (C0047bt.f816H != null && b14 >= 0 && b14 <= C0047bt.f816H.length - 1 && b14 >= 0 && !C0047bt.f816H[b14].m1641d()) {
                    if (this.f789i == b14 && (this.f785d == 4 || this.f785d == 5)) {
                        C0055ca.m1298a(graphics, C0047bt.f816H[this.f789i].f2421d, 2, 2, 20, 14337302, 0);
                    }
                    if (C0047bt.f816H[b14].f2419b == 0) {
                        if (C0047bt.f816H[b14].f2426i == 291) {
                            C0055ca.m1329e(graphics, C0088t.f2496Q[C0047bt.f816H[b14].f2418a][0] - 10, (C0088t.f2496Q[C0047bt.f816H[b14].f2418a][1] - 2) - C0047bt.f816H[b14].m1646i(), (C0047bt.f816H[b14].f2422e * 19) / C0047bt.f816H[b14].f2423f, 0);
                            C0055ca.m1329e(graphics, C0088t.f2496Q[C0047bt.f816H[b14].f2418a][0] - 10, (C0088t.f2496Q[C0047bt.f816H[b14].f2418a][1] + 3) - C0047bt.f816H[b14].m1646i(), (C0047bt.f816H[b14].f2424g * 19) / C0047bt.f816H[b14].f2425h, 1);
                        } else {
                            C0055ca.m1329e(graphics, C0088t.f2496Q[C0047bt.f816H[b14].f2418a][0] - 10, (C0088t.f2496Q[C0047bt.f816H[b14].f2418a][1] - 9) - C0047bt.f816H[b14].m1646i(), (C0047bt.f816H[b14].f2422e * 19) / C0047bt.f816H[b14].f2423f, 0);
                            C0055ca.m1329e(graphics, C0088t.f2496Q[C0047bt.f816H[b14].f2418a][0] - 10, (C0088t.f2496Q[C0047bt.f816H[b14].f2418a][1] - 4) - C0047bt.f816H[b14].m1646i(), (C0047bt.f816H[b14].f2424g * 19) / C0047bt.f816H[b14].f2425h, 1);
                        }
                    } else if (C0047bt.f816H[b14].f2419b == 2) {
                        C0055ca.m1329e(graphics, C0088t.f2496Q[C0047bt.f816H[b14].f2418a][0] - 10, (C0088t.f2496Q[C0047bt.f816H[b14].f2418a][1] - 9) - C0047bt.f816H[b14].m1646i(), (C0047bt.f816H[b14].f2422e * 19) / C0047bt.f816H[b14].f2423f, 0);
                        C0055ca.m1329e(graphics, C0088t.f2496Q[C0047bt.f816H[b14].f2418a][0] - 10, (C0088t.f2496Q[C0047bt.f816H[b14].f2418a][1] - 4) - C0047bt.f816H[b14].m1646i(), (C0047bt.f816H[b14].f2424g * 19) / C0047bt.f816H[b14].f2425h, 1);
                    }
                }
                b13 = (byte) (b14 + 1);
            }
            byte b15 = 0;
            while (true) {
                byte b16 = b15;
                if (b16 >= C0047bt.f821M.length) {
                    break;
                }
                if (b16 >= 0 && !C0047bt.f821M[b16].m1372a()) {
                    C0055ca.m1329e(graphics, C0088t.f2497R[C0047bt.f821M[b16].f2035a][0] - 11, (C0088t.f2497R[C0047bt.f821M[b16].f2035a][1] - 4) - C0047bt.f821M[b16].m1376d(), (C0047bt.f821M[b16].f2039e * 19) / C0047bt.f821M[b16].f2040f, 0);
                    if (this.f788h == b16 && (this.f785d == 1 || this.f785d == 0 || this.f785d == 2 || this.f785d == 3 || this.f785d == 9)) {
                        C0055ca.m1298a(graphics, C0047bt.f821M[b16].f2038d, 2, 2, 20, 14337302, 0);
                        C0055ca.m1298a(graphics, new StringBuffer().append("").append(C0088t.f2490K[C0047bt.f821M[b16].f2045k]).toString(), C0088t.f2516b - 2, 2, 24, 14337302, 0);
                    }
                    if (C0047bt.f821M[b16].f2043i > 99) {
                        RunnableC0066a.f2114f.m63a(graphics, C0015ao.f133B, (int[]) null, (C0047bt.f821M[b16].f2043i / 100) + 1, 0, 0, C0088t.f2497R[C0047bt.f821M[b16].f2035a][0] - 15, (C0088t.f2497R[C0047bt.f821M[b16].f2035a][1] - 11) - C0047bt.f821M[b16].m1376d(), 0, 0);
                        RunnableC0066a.f2114f.m63a(graphics, C0015ao.f133B, (int[]) null, ((C0047bt.f821M[b16].f2043i - 100) / 10) + 1, 0, 0, C0088t.f2497R[C0047bt.f821M[b16].f2035a][0] - 11, (C0088t.f2497R[C0047bt.f821M[b16].f2035a][1] - 11) - C0047bt.f821M[b16].m1376d(), 0, 0);
                        RunnableC0066a.f2114f.m63a(graphics, C0015ao.f133B, (int[]) null, (C0047bt.f821M[b16].f2043i % 10) + 1, 0, 0, C0088t.f2497R[C0047bt.f821M[b16].f2035a][0] - 7, (C0088t.f2497R[C0047bt.f821M[b16].f2035a][1] - 11) - C0047bt.f821M[b16].m1376d(), 0, 0);
                    } else if (C0047bt.f821M[b16].f2043i > 9) {
                        RunnableC0066a.f2114f.m63a(graphics, C0015ao.f133B, (int[]) null, (C0047bt.f821M[b16].f2043i / 10) + 1, 0, 0, C0088t.f2497R[C0047bt.f821M[b16].f2035a][0] - 11, (C0088t.f2497R[C0047bt.f821M[b16].f2035a][1] - 11) - C0047bt.f821M[b16].m1376d(), 0, 0);
                        RunnableC0066a.f2114f.m63a(graphics, C0015ao.f133B, (int[]) null, (C0047bt.f821M[b16].f2043i % 10) + 1, 0, 0, C0088t.f2497R[C0047bt.f821M[b16].f2035a][0] - 7, (C0088t.f2497R[C0047bt.f821M[b16].f2035a][1] - 11) - C0047bt.f821M[b16].m1376d(), 0, 0);
                    } else if (C0047bt.f821M[b16].f2043i > 1) {
                        RunnableC0066a.f2114f.m63a(graphics, C0015ao.f133B, (int[]) null, (C0047bt.f821M[b16].f2043i % 10) + 1, 0, 0, C0088t.f2497R[C0047bt.f821M[b16].f2035a][0] - 11, (C0088t.f2497R[C0047bt.f821M[b16].f2035a][1] - 11) - C0047bt.f821M[b16].m1376d(), 0, 0);
                    }
                    if (this.f788h == b16 && C0047bt.f821M[b16].f2046l == 1) {
                        RunnableC0066a.f2114f.m63a(graphics, C0015ao.f135D, (int[]) null, -1, 0, 0, C0088t.f2523i.stringWidth(C0047bt.f821M[b16].f2038d) + 4, 6, 0, 0);
                    }
                }
                b15 = (byte) (b16 + 1);
            }
        }
        if (this.f787f == 0 || this.f787f == 1) {
            if (this.f785d == 4 || this.f785d == 5 || this.f785d == 6 || this.f785d == 7 || this.f785d == 8) {
                if (this.f789i >= 0 && this.f789i <= C0047bt.f816H.length - 1 && C0047bt.f816H[this.f789i].f2427j != null) {
                    C0009ai.m43a(C0015ao.f172r, this.f802y.f2147ak);
                    RunnableC0066a.f2114f.m62a(graphics, C0015ao.f172r, (int[]) null, 0, 0, C0088t.f2496Q[C0047bt.f816H[this.f789i].f2418a][0], (C0088t.f2496Q[C0047bt.f816H[this.f789i].f2418a][1] - 10) - C0047bt.f816H[this.f789i].m1646i(), 20, 0);
                }
            } else if (this.f788h >= 0 && this.f788h <= C0047bt.f821M.length - 1) {
                C0009ai.m43a(C0015ao.f172r, this.f802y.f2147ak);
                RunnableC0066a.f2114f.m62a(graphics, C0015ao.f172r, (int[]) null, 0, 0, C0088t.f2497R[C0047bt.f821M[this.f788h].f2035a][0], (C0088t.f2497R[C0047bt.f821M[this.f788h].f2035a][1] - 10) - C0047bt.f821M[this.f788h].m1376d(), 20, 0);
            }
        }
        if (this.f787f == 0) {
            if (this.f785d == 0) {
                m714b(graphics);
            } else if (this.f785d == 2) {
                m719c(graphics);
            }
            if (((C0047bt.f933bs >= 0 && C0047bt.f1765s == 0) || f768t == 1 || f768t == 2) && f767s >= 0) {
                C0055ca.m1298a(graphics, String.valueOf((int) f767s), C0088t.f2516b / 2, (C0088t.f2517c / 2) - (C0088t.f2517c <= 240 ? C0088t.f2524j : C0088t.f2524j / 2), 17, 16711680, 0);
            }
        } else if (this.f787f == 3) {
            m707a(graphics);
            m724e(graphics);
        } else if (this.f787f != 4) {
            if (this.f787f == 5) {
                if (this.f774F != null && this.f769A != null) {
                    this.f769A.m1368a(graphics, RunnableC0066a.f2114f, 0, 0);
                }
            } else if (this.f787f == 6) {
                m707a(graphics);
            } else if (this.f787f == -1) {
                m709a(graphics, "请等待......");
            } else if (this.f787f == 9) {
                m709a(graphics, "等待队友......");
            }
        }
        m721d(graphics);
        if (C0047bt.f934bt && f764c > 0) {
            C0055ca.m1298a(graphics, new StringBuffer().append("自动回合:").append((int) f764c).toString(), (C0088t.f2516b - (C0088t.f2523i.stringWidth(new StringBuffer().append("自动回合:").append((int) f764c).toString()) / 2)) - 45, 2, 17, 16777215, 0);
        }
        if (C0088t.f2529o) {
            graphics.drawImage(RunnableC0066a.f2082U.f598a, C0088t.f2516b - RunnableC0066a.f2082U.f599b, C0088t.f2517c - RunnableC0066a.f2082U.f600c, 20);
        }
        graphics.setClip(0, 0, C0088t.f2516b, C0088t.f2517c);
    }

    /* renamed from: a */
    public final void m747a(String str) {
        if (this.f801x == null) {
            return;
        }
        synchronized (this.f801x) {
            this.f801x.addElement(C0055ca.m1311a(str, C0088t.f2523i, (C0088t.f2516b * 5) / 7, "\t"));
        }
    }

    /* renamed from: a */
    public final void m748a(C0005ae[] c0005aeArr) {
        if (this.f800w == null) {
            return;
        }
        synchronized (this.f800w) {
            this.f800w.addElement(c0005aeArr);
        }
    }

    /* renamed from: a */
    public final void m749a(C0077i[] c0077iArr) {
        if (this.f799v == null) {
            return;
        }
        for (int i = 0; i < C0047bt.f816H.length; i++) {
            if (C0047bt.f816H[i] != null) {
                C0047bt.f816H[i].f2430m = false;
                C0047bt.f816H[i].f2429l = false;
            }
        }
        synchronized (this.f799v) {
            this.f799v.addElement(c0077iArr);
        }
    }

    /* renamed from: b */
    public final int m750b(int i, int i2) {
        if (this.f781M == null) {
            return 0;
        }
        for (int i3 = 0; i3 < this.f781M.length; i3++) {
            if (i >= this.f781M[i3][0] && i <= this.f781M[i3][0] + this.f781M[i3][2] && i2 >= this.f781M[i3][1] && i2 <= this.f781M[i3][1] + this.f781M[i3][3]) {
                this.f786e = i3;
                return 1073741824;
            }
        }
        return 0;
    }

    /* renamed from: d */
    public final void m751d() {
        this.f802y.f2221p = true;
        this.f802y.m1439b();
        if (this.f799v != null) {
            this.f799v.removeAllElements();
            this.f799v = null;
        }
        if (this.f800w != null) {
            this.f800w.removeAllElements();
            this.f800w = null;
        }
        if (this.f769A != null) {
            this.f769A = null;
        }
        m723e();
        this.f802y.m1439b();
        C0047bt.m933p();
        this.f802y.m1439b();
        this.f803z.f282c = false;
        this.f802y.m1439b();
        this.f798u = null;
        this.f803z.m365T();
        this.f802y.m1439b();
        C0047bt.m913g();
        this.f802y.m1439b();
        RunnableC0066a.f2114f.m57a(this.f803z.f355f, C0015ao.f167h, C0015ao.f168i, true, false, 1283472);
        this.f802y.m1439b();
        this.f803z.m465j();
        this.f802y.m1439b();
        this.f802y.f2221p = false;
        f766r = System.currentTimeMillis();
        f765g = -1;
    }

    /* renamed from: g */
    public final byte m752g() {
        for (byte b = 0; b < C0047bt.f816H.length; b = (byte) (b + 1)) {
            if (C0047bt.f816H[b].f2419b != 0 && C0047bt.f816H[b].f2418a == m727i() + 3) {
                return b;
            }
        }
        return (byte) -1;
    }

    /* renamed from: j */
    public final boolean m753j() {
        for (byte b = 0; b < C0047bt.f816H.length; b = (byte) (b + 1)) {
            if (C0047bt.f816H[b].f2419b != 0 && C0047bt.f816H[b].f2418a == m727i() + 3 && C0047bt.f816H[b].f2422e > 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: l */
    public final void m754l() {
        m751d();
        C0015ao c0015ao = this.f803z;
        this.f803z.f358k = (short) 0;
        c0015ao.f357j = (short) 0;
    }

    /* renamed from: m */
    public final void m755m() {
        for (int i = 0; i < C0047bt.f816H.length; i++) {
            if (C0047bt.f816H[i].f2420c.equals(C0047bt.f865ad)) {
                this.f789i = (byte) i;
                return;
            }
        }
    }
}

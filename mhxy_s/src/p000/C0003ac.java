package p000;

import com.yinhan.kjava.main.RunnableC0066a;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

/* renamed from: ac */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-4234804660425969496/classes.dex */
public final class C0003ac extends AbstractC0018ar {

    /* renamed from: n */
    private static short f6n = 4;

    /* renamed from: B */
    private byte f8B;

    /* renamed from: C */
    private boolean f9C;

    /* renamed from: D */
    private byte f10D;

    /* renamed from: G */
    private byte f13G;

    /* renamed from: a */
    public short f15a;

    /* renamed from: b */
    public short f16b;

    /* renamed from: p */
    private short f19p;

    /* renamed from: q */
    private short f20q;

    /* renamed from: r */
    private short f21r;

    /* renamed from: s */
    private short f22s;

    /* renamed from: t */
    private String f23t;

    /* renamed from: o */
    private short f18o = -1;

    /* renamed from: u */
    private int[] f24u = new int[4];

    /* renamed from: v */
    private int[] f25v = new int[4];

    /* renamed from: w */
    private String f26w = "";

    /* renamed from: x */
    private byte f27x = 3;

    /* renamed from: y */
    private boolean f28y = false;

    /* renamed from: z */
    private byte f29z = 0;

    /* renamed from: A */
    private boolean f7A = false;

    /* renamed from: E */
    private C0087s f11E = null;

    /* renamed from: F */
    private C0049bv f12F = null;

    /* renamed from: c */
    public Vector f17c = new Vector();

    /* renamed from: H */
    private C0039bl f14H = null;

    public C0003ac() {
        this.f22s = (short) -1;
        this.f23t = "";
        this.f22s = C0047bt.f886ay;
        this.f23t = C0047bt.f1564nn;
        m5s();
        m17a(false);
        m6t();
    }

    /* renamed from: a */
    private void m3a(C0023aw c0023aw) {
        if (this.f402j < 0) {
            this.f402j = (short) 0;
            return;
        }
        if (this.f402j >= c0023aw.f456a) {
            this.f402j = (short) (c0023aw.f456a - f6n);
            return;
        }
        if (this.f403k <= -8) {
            this.f403k = (short) -8;
        } else if (this.f403k >= c0023aw.f457b) {
            this.f403k = c0023aw.f457b;
        } else {
            m570r();
            m7u();
        }
    }

    /* renamed from: a */
    private static boolean m4a(int i, int i2, int i3, int i4) {
        return (i >> 4) == (i3 >> 4) && (i2 >> 4) == (i4 >> 4);
    }

    /* renamed from: s */
    private void m5s() {
        this.f24u[1] = C0048bu.m955a(RunnableC0066a.m1391a(C0047bt.f885ax, C0047bt.f871aj, (byte) 1, C0047bt.f886ay, false, C0047bt.f1564nn), (byte) 2);
        this.f25v[1] = C0048bu.m955a(RunnableC0066a.m1391a(C0047bt.f885ax, C0047bt.f871aj, (byte) 1, C0047bt.f886ay, true, C0047bt.f1564nn), (byte) 2);
        this.f24u[3] = C0048bu.m955a(RunnableC0066a.m1391a(C0047bt.f885ax, C0047bt.f871aj, (byte) 3, C0047bt.f886ay, false, C0047bt.f1564nn), (byte) 2);
        this.f25v[3] = C0048bu.m955a(RunnableC0066a.m1391a(C0047bt.f885ax, C0047bt.f871aj, (byte) 3, C0047bt.f886ay, true, C0047bt.f1564nn), (byte) 2);
        this.f24u[0] = C0048bu.m955a(RunnableC0066a.m1391a(C0047bt.f885ax, C0047bt.f871aj, (byte) 0, C0047bt.f886ay, false, C0047bt.f1564nn), (byte) 2);
        this.f25v[0] = C0048bu.m955a(RunnableC0066a.m1391a(C0047bt.f885ax, C0047bt.f871aj, (byte) 0, C0047bt.f886ay, true, C0047bt.f1564nn), (byte) 2);
        this.f24u[2] = C0048bu.m955a(RunnableC0066a.m1391a(C0047bt.f885ax, C0047bt.f871aj, (byte) 2, C0047bt.f886ay, false, C0047bt.f1564nn), (byte) 2);
        this.f25v[2] = C0048bu.m955a(RunnableC0066a.m1391a(C0047bt.f885ax, C0047bt.f871aj, (byte) 2, C0047bt.f886ay, true, C0047bt.f1564nn), (byte) 2);
    }

    /* renamed from: t */
    private void m6t() {
        if (C0047bt.f919be <= 0 && this.f396d != null) {
            C0021au c0021au = this.f396d;
            if (c0021au.f435e != null) {
                c0021au.f435e.removeAllElements();
                c0021au.f435e = null;
            }
            if (c0021au.f436f != null) {
                C0030bc c0030bc = c0021au.f436f;
            }
            c0021au.f436f = null;
            this.f396d = null;
        }
        if (C0047bt.f919be > 0) {
            if (this.f396d == null || this.f18o != C0047bt.f919be || this.f19p != C0047bt.f930bp || this.f20q != C0047bt.f931bq || this.f21r != C0047bt.f932br) {
                this.f18o = C0047bt.f919be;
                this.f19p = C0047bt.f930bp;
                this.f20q = C0047bt.f931bq;
                this.f21r = C0047bt.f932br;
                this.f396d = new C0021au((byte) 1, C0047bt.f919be, C0047bt.f930bp, C0047bt.f931bq, C0047bt.f932br);
            }
            if (this.f396d.f438h == 0 && this.f396d.f439i == 0) {
                this.f396d.f438h = this.f402j;
                this.f396d.f439i = this.f403k;
            }
            this.f396d.m583a(this.f400h);
        }
    }

    /* renamed from: u */
    private void m7u() {
        if (C0047bt.f1683q == null || C0047bt.f1765s != 0) {
            return;
        }
        for (int i = 0; i < C0047bt.f1683q.length; i++) {
            if (!C0047bt.f1683q[i].f746b.equals(C0047bt.f865ad)) {
                C0047bt.f1683q[i].f398f.addElement(new short[]{this.f402j, this.f403k});
            }
        }
    }

    /* renamed from: a */
    public final int m8a(RunnableC0066a runnableC0066a) {
        if ((C0047bt.f933bs != 0 || (C0047bt.f933bs == 0 && C0047bt.f1765s != 0)) && C0047bt.f863ab != null && runnableC0066a.f2216j != 1) {
            for (int i = 0; i < C0047bt.f863ab.length; i++) {
                if (m4a(this.f402j, this.f403k, C0047bt.f863ab[i], C0047bt.f864ac[i]) || m4a(this.f402j + 8, this.f403k + 8, C0047bt.f863ab[i], C0047bt.f864ac[i])) {
                    this.f8B = this.f8B == 0 ? (byte) 1 : this.f8B;
                    if (this.f8B == 2 || this.f8B == 0) {
                        return -1;
                    }
                    return i;
                }
            }
        }
        this.f8B = (byte) 0;
        return -1;
    }

    /* renamed from: a */
    public final C0039bl m9a(C0039bl[] c0039blArr) {
        if (c0039blArr != null) {
            for (C0039bl c0039bl : c0039blArr) {
                this.f14H = c0039bl;
                if (this.f399g == null) {
                    return null;
                }
                if ((this.f14H.f694u == 2 || this.f14H.f694u == 3) && (m4a(this.f402j + (this.f399g.m633g() / 2), (this.f403k + 16) - this.f399g.m634h(), this.f14H.f402j, this.f14H.f403k) || m4a(this.f402j + (this.f399g.m633g() / 2), (this.f403k + 32) - this.f399g.m634h(), this.f14H.f402j, this.f14H.f403k))) {
                    this.f13G = this.f13G == 0 ? (byte) 1 : this.f13G;
                    if (this.f13G == 2 || this.f13G == 0) {
                        return null;
                    }
                    return this.f14H;
                }
            }
        }
        this.f13G = (byte) 0;
        return null;
    }

    /* renamed from: a */
    public final C0087s m10a(Vector vector) {
        for (int i = 0; i < vector.size(); i++) {
            this.f11E = (C0087s) vector.elementAt(i);
            if (this.f399g == null) {
                return null;
            }
            if (this.f11E.f2475d == 0 && (m4a(this.f402j + 8, this.f403k + 16, this.f11E.f438h, this.f11E.f439i) || m4a(this.f402j + 8, this.f403k, this.f11E.f438h, this.f11E.f439i))) {
                this.f10D = this.f10D == 0 ? (byte) 1 : this.f10D;
                if (this.f10D == 2 || this.f10D == 0) {
                    return null;
                }
                return this.f11E;
            }
        }
        this.f10D = (byte) 0;
        return null;
    }

    /* renamed from: a */
    public final void m11a() {
        m6t();
    }

    /* renamed from: a */
    public final void m12a(byte b) {
        if (C0047bt.f933bs == 0 && C0047bt.f1765s == 0) {
            return;
        }
        this.f400h = b;
        if (b == 0) {
            this.f15a = (short) (-f6n);
            this.f16b = (short) 0;
        } else if (b == 2) {
            this.f15a = f6n;
            this.f16b = (short) 0;
        } else if (b == 1) {
            this.f15a = (short) 0;
            this.f16b = (short) (-f6n);
        } else if (b == 3) {
            this.f15a = (short) 0;
            this.f16b = f6n;
        }
        this.f7A = false;
        if (this.f27x != b || this.f28y) {
            m17a(false);
            this.f27x = b;
            this.f28y = false;
            this.f7A = true;
        }
    }

    /* renamed from: a */
    public final void m13a(int i) {
        if (i == 1) {
            this.f9C = true;
        } else if (i == 0) {
            this.f9C = false;
        }
    }

    /* renamed from: a */
    public final void m14a(C0023aw c0023aw, C0009ai c0009ai, long j) {
        if (this.f399g == null || c0023aw == null) {
            return;
        }
        if (!this.f28y && !this.f7A) {
            if (this.f15a != 0 || this.f16b >= 0) {
                if (this.f15a >= 0 || this.f16b != 0) {
                    if (this.f15a <= 0 || this.f16b != 0) {
                        if (this.f15a == 0 && this.f16b > 0 && c0009ai.m52a(c0023aw, this.f402j + this.f15a + 8, this.f403k + this.f16b + 16) == 0 && c0009ai.m52a(c0023aw, this.f402j + this.f15a + 10, this.f403k + this.f16b + 16) == 0 && !c0009ai.m68a(this.f402j + this.f15a + 8, this.f403k + this.f16b + 16) && !c0009ai.m68a(this.f402j + this.f15a + 10, this.f403k + this.f16b + 16)) {
                            this.f402j = (short) (this.f402j + this.f15a);
                            this.f403k = (short) (this.f403k + this.f16b);
                            m3a(c0023aw);
                        }
                    } else if (c0009ai.m52a(c0023aw, this.f402j + this.f15a + 12, this.f403k + this.f16b + 16) == 0 && !c0009ai.m68a(this.f402j + this.f15a + 12, this.f403k + this.f16b + 16)) {
                        this.f402j = (short) (this.f402j + this.f15a);
                        this.f403k = (short) (this.f403k + this.f16b);
                        m3a(c0023aw);
                    }
                } else if (c0009ai.m52a(c0023aw, this.f402j + this.f15a + 2, this.f403k + this.f16b + 16) == 0 && !c0009ai.m68a(this.f402j + this.f15a + 2, this.f403k + this.f16b + 16)) {
                    this.f402j = (short) (this.f402j + this.f15a);
                    this.f403k = (short) (this.f403k + this.f16b);
                    m3a(c0023aw);
                }
            } else if (c0009ai.m52a(c0023aw, this.f402j + this.f15a + 8, this.f403k + this.f16b + 16) == 0 && c0009ai.m52a(c0023aw, this.f402j + this.f15a + 10, this.f403k + this.f16b + 16) == 0 && !c0009ai.m68a(this.f402j + this.f15a + 8, this.f403k + this.f16b + 16) && !c0009ai.m68a(this.f402j + this.f15a + 10, this.f403k + this.f16b + 16)) {
                this.f402j = (short) (this.f402j + this.f15a);
                this.f403k = (short) (this.f403k + this.f16b);
                m3a(c0023aw);
            }
        }
        C0009ai.m43a(this.f399g, j);
        if (this.f396d != null) {
            this.f396d.mo584a(c0023aw, c0009ai, j);
        }
    }

    /* renamed from: a */
    public final void m15a(Graphics graphics, C0009ai c0009ai, int i, int i2, byte b) {
        if (this.f399g != null) {
            c0009ai.m62a(graphics, this.f399g, (int[]) null, i, i2, this.f402j + 8, this.f403k + 16, 20, 0);
            if (C0047bt.f868ag != null) {
                this.f26w = C0047bt.f868ag;
                C0055ca.m1298a(graphics, this.f26w, (this.f402j + 8) - i, (((this.f403k - i2) - C0088t.f2524j) - this.f399g.m636j()) + 16, 17, C0047bt.f933bs >= 0 ? 65280 : C0047bt.f870ai, 0);
            }
            if (C0047bt.f869ah != null && !C0047bt.f869ah.equals("")) {
                C0055ca.m1297a(graphics, C0047bt.f869ah, (this.f402j + 8) - i, (((this.f403k - i2) - (C0088t.f2524j << 1)) - this.f399g.m636j()) + 16, 17, C0047bt.f933bs >= 0 ? 65280 : C0047bt.f870ai);
            }
            if (C0047bt.f933bs == 1) {
                c0009ai.m64a(graphics, C0015ao.f179y, (int[]) null, (C0010aj) null, i, i2, ((this.f402j + 8) - (C0088t.f2523i.stringWidth(this.f26w) / 2)) - C0015ao.f179y.f599b, (this.f403k - C0088t.f2524j) - 18, 20, 0);
            } else if (C0047bt.f933bs == 0) {
                c0009ai.m64a(graphics, C0015ao.f180z, (int[]) null, (C0010aj) null, i, i2, ((this.f402j + 8) - (C0088t.f2523i.stringWidth(this.f26w) / 2)) - C0015ao.f180z.f599b, (this.f403k - C0088t.f2524j) - 18, 20, 0);
            }
        }
    }

    /* renamed from: a */
    public final void m16a(short s, short s2) {
        if (!this.f17c.isEmpty()) {
            this.f17c.removeAllElements();
            m17a(false);
        }
        this.f402j = s;
        this.f403k = s2;
    }

    /* renamed from: a */
    public final void m17a(boolean z) {
        short s;
        short s2;
        short s3;
        if (this.f22s != C0047bt.f886ay) {
            this.f22s = C0047bt.f886ay;
            m5s();
        } else if (!this.f23t.equals(C0047bt.f1564nn)) {
            this.f23t = C0047bt.f1564nn;
            m5s();
        }
        if (C0047bt.f1564nn.equals("") || !C0088t.f2530p) {
            s = 0;
            s2 = 0;
            s3 = 0;
        } else {
            s3 = C0047bt.f1565no;
            s2 = C0047bt.f1567nq;
            s = C0047bt.f1566np;
        }
        this.f399g = RunnableC0066a.f2096ab.m983a(z ? this.f25v[this.f400h] : this.f24u[this.f400h], s3, s2, s);
        if (this.f399g != null) {
            if (C0047bt.f1564nn.equals("")) {
                return;
            }
            this.f399g.f561a = C0047bt.f1565no;
            this.f399g.f562b = C0047bt.f1567nq;
            this.f399g.f563c = C0047bt.f1566np;
            return;
        }
        RunnableC0066a.m1396a(C0047bt.f885ax, C0047bt.f871aj, (byte) 5, C0047bt.f886ay, this.f23t, s3, s2, s);
        this.f399g = RunnableC0066a.f2096ab.m983a(z ? this.f25v[this.f400h] : this.f24u[this.f400h], s3, s2, s);
        if (this.f399g == null) {
            C0047bt.f886ay = (byte) 0;
            m5s();
            this.f399g = RunnableC0066a.f2096ab.m997c(z ? this.f25v[this.f400h] : this.f24u[this.f400h]);
            if (this.f399g == null) {
                RunnableC0066a.m1396a(C0047bt.f885ax, C0047bt.f871aj, (byte) 5, C0047bt.f886ay, this.f23t, s3, s2, s);
                this.f399g = RunnableC0066a.f2096ab.m997c(z ? this.f25v[this.f400h] : this.f24u[this.f400h]);
            }
        }
    }

    /* renamed from: b */
    public final C0049bv m18b(Vector vector) {
        if (vector != null && this.f399g != null) {
            for (int i = 0; i < vector.size(); i++) {
                this.f12F = (C0049bv) vector.elementAt(i);
                if (this.f12F.f1781d != null) {
                    short s = this.f402j;
                    short s2 = this.f403k;
                    short sM633g = this.f399g.m633g();
                    short sM634h = this.f399g.m634h();
                    int i2 = this.f12F.f1782e - 16;
                    int i3 = this.f12F.f1783f - 16;
                    int iM633g = this.f12F.f1781d.m633g() + 32;
                    int iM634h = this.f12F.f1781d.m634h() + 32;
                    if (Math.abs((s + (sM633g / 2)) - (i2 + (iM633g / 2))) <= (sM633g / 2) + (iM633g / 2) && Math.abs(((sM634h / 2) + s2) - ((iM634h / 2) + i3)) <= (sM634h / 2) + (iM634h / 2)) {
                        return this.f12F;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void m19b() {
        m17a(false);
    }

    /* renamed from: c */
    public final void m20c() {
        if (this.f17c.isEmpty()) {
            this.f15a = (short) 0;
            this.f16b = (short) 0;
            if (!(this.f27x == this.f400h && this.f28y && this.f29z == C0047bt.f886ay) && this.f17c.isEmpty()) {
                m17a(true);
                this.f28y = true;
                this.f27x = this.f400h;
                this.f29z = C0047bt.f886ay;
            }
        }
    }

    /* renamed from: d */
    public final void m21d() {
        this.f8B = (byte) 2;
    }

    /* renamed from: e */
    public final boolean m22e() {
        return this.f8B == 1;
    }

    /* renamed from: f */
    public final void m23f() {
        this.f10D = (byte) 2;
    }

    /* renamed from: g */
    public final boolean m24g() {
        return this.f10D == 1;
    }

    /* renamed from: h */
    public final boolean m25h() {
        return this.f9C;
    }

    /* renamed from: i */
    public final void m26i() {
        this.f9C = false;
    }

    /* renamed from: j */
    public final void m27j() {
        if (C0047bt.f933bs == 0 && C0047bt.f1765s == 0) {
            return;
        }
        if (this.f17c.size() <= 0) {
            m17a(true);
            this.f17c.removeAllElements();
            return;
        }
        int size = this.f17c.size() - 1;
        if (size >= 0) {
            short[] sArr = (short[]) this.f17c.elementAt(size);
            short[] sArr2 = size + (-1) > 0 ? (short[]) this.f17c.elementAt(size - 1) : (short[]) this.f17c.elementAt(0);
            if (sArr2[0] != sArr[0]) {
                if (sArr2[0] > sArr[0]) {
                    this.f400h = (byte) 2;
                } else {
                    this.f400h = (byte) 0;
                }
                m17a(false);
                if (this.f27x != this.f400h) {
                    this.f7A = true;
                } else {
                    this.f7A = false;
                }
            } else if (sArr2[1] != sArr[1]) {
                if (sArr2[1] > sArr[1]) {
                    this.f400h = (byte) 3;
                } else {
                    this.f400h = (byte) 1;
                }
                m17a(false);
                if (this.f27x != this.f400h) {
                    this.f7A = true;
                } else {
                    this.f7A = false;
                }
            } else {
                m17a(false);
                if (this.f27x != this.f400h) {
                    this.f7A = true;
                } else {
                    this.f7A = false;
                }
            }
            if (!this.f7A) {
                this.f402j = sArr2[0];
                this.f403k = sArr2[1];
                m570r();
                m7u();
                this.f17c.removeElementAt(size);
                this.f28y = false;
            }
            this.f27x = this.f400h;
        }
    }

    /* renamed from: k */
    public final void m28k() {
        this.f13G = (byte) 2;
    }

    /* renamed from: l */
    public final boolean m29l() {
        return this.f13G == 1;
    }
}

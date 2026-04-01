package p000;

import com.yinhan.kjava.main.RunnableC0066a;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

/* renamed from: ck */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-4234804660425969496/classes.dex */
public final class C0065ck {

    /* renamed from: a */
    public byte f2035a;

    /* renamed from: b */
    public byte f2036b;

    /* renamed from: c */
    public String f2037c;

    /* renamed from: d */
    public String f2038d;

    /* renamed from: e */
    public int f2039e;

    /* renamed from: f */
    public int f2040f;

    /* renamed from: g */
    public int f2041g;

    /* renamed from: h */
    public int f2042h;

    /* renamed from: i */
    public short f2043i;

    /* renamed from: j */
    public short f2044j;

    /* renamed from: k */
    public byte f2045k;

    /* renamed from: l */
    public byte f2046l;

    /* renamed from: m */
    public C0030bc f2047m;

    /* renamed from: n */
    public byte f2048n;

    /* renamed from: r */
    public short f2052r;

    /* renamed from: s */
    public short f2053s;

    /* renamed from: t */
    public short f2054t;

    /* renamed from: v */
    private byte f2056v;

    /* renamed from: w */
    private int[] f2057w;

    /* renamed from: o */
    public boolean f2049o = false;

    /* renamed from: p */
    public boolean f2050p = false;

    /* renamed from: q */
    public boolean f2051q = false;

    /* renamed from: u */
    public Vector f2055u = new Vector();

    /* renamed from: x */
    private int f2058x = 0;

    /* renamed from: a */
    public final int m1369a(C0009ai c0009ai, long j) {
        if (this.f2047m == null || m1372a()) {
            return -1;
        }
        if (this.f2057w == null) {
            this.f2057w = new int[2];
            C0009ai.m45a(this.f2047m, this.f2057w);
        }
        if (this.f2058x != 2) {
            this.f2058x = C0009ai.m43a(this.f2047m, j);
        }
        if (this.f2058x == 2) {
            this.f2058x = 0;
        }
        return this.f2058x;
    }

    /* renamed from: a */
    public final void m1370a(byte b) {
        if (b <= 0) {
            b = 1;
        }
        this.f2056v = b;
    }

    /* renamed from: a */
    public final void m1371a(Graphics graphics, C0009ai c0009ai, int i, int i2, byte b) {
        if (m1372a() || this.f2047m == null) {
            return;
        }
        if (this.f2057w == null) {
            this.f2057w = new int[2];
            C0009ai.m45a(this.f2047m, this.f2057w);
        }
        c0009ai.m62a(graphics, this.f2047m, (int[]) null, 0, 0, i, i2, 20, 0);
    }

    /* renamed from: a */
    public final boolean m1372a() {
        return this.f2039e <= 0;
    }

    /* renamed from: b */
    public final void m1373b() {
        this.f2038d = null;
        this.f2057w = null;
        if (this.f2047m != null) {
            C0030bc c0030bc = this.f2047m;
        }
        this.f2047m = null;
    }

    /* renamed from: b */
    public final void m1374b(byte b) {
        C0088t.f2513ag.delete(0, C0088t.f2513ag.length());
        this.f2048n = b;
        if (this.f2036b == 0) {
            if (b == 4) {
                C0088t.f2513ag.append("f").append((int) this.f2044j).append(1).append((int) b);
            } else {
                C0088t.f2513ag.append("f").append((int) this.f2044j).append(1).append((int) this.f2056v).append((int) b);
            }
            this.f2047m = RunnableC0066a.f2096ab.m991b(C0088t.f2513ag.toString());
            if (this.f2047m == null && b != 4) {
                C0088t.f2513ag.delete(0, C0088t.f2513ag.length());
                C0088t.f2513ag.append("f").append((int) this.f2044j).append(1).append(1).append((int) b);
                this.f2047m = RunnableC0066a.f2096ab.m991b(C0088t.f2513ag.toString());
            }
        } else if (this.f2036b == 1) {
            StringBuffer stringBufferAppend = C0088t.f2513ag.append((int) this.f2044j);
            if (b > 3) {
                b = 3;
            }
            stringBufferAppend.append((int) b);
            this.f2047m = RunnableC0066a.f2102ah.m984a(C0088t.f2513ag.toString(), this.f2052r, this.f2053s, this.f2054t);
        }
        if (this.f2047m != null) {
            this.f2047m = this.f2047m.m628b();
        }
    }

    /* renamed from: c */
    public final short m1375c() {
        if (this.f2047m == null || this.f2047m.f567g == null) {
            return (short) 0;
        }
        return this.f2047m.f567g[this.f2047m.f566f];
    }

    /* renamed from: d */
    public final short m1376d() {
        if (this.f2047m == null || this.f2047m.f568h == null) {
            return (short) 0;
        }
        return this.f2047m.f568h[0];
    }
}

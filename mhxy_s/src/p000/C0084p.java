package p000;

import com.yinhan.kjava.main.RunnableC0066a;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

/* renamed from: p */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-4234804660425969496/classes.dex */
public final class C0084p {

    /* renamed from: a */
    public byte f2418a;

    /* renamed from: b */
    public byte f2419b;

    /* renamed from: c */
    public String f2420c;

    /* renamed from: d */
    public String f2421d;

    /* renamed from: e */
    public int f2422e;

    /* renamed from: f */
    public int f2423f;

    /* renamed from: g */
    public int f2424g;

    /* renamed from: h */
    public int f2425h;

    /* renamed from: i */
    public short f2426i;

    /* renamed from: j */
    public C0030bc f2427j;

    /* renamed from: k */
    public byte f2428k;

    /* renamed from: p */
    public short f2433p;

    /* renamed from: q */
    public short f2434q;

    /* renamed from: r */
    public short f2435r;

    /* renamed from: t */
    private byte f2437t;

    /* renamed from: l */
    public boolean f2429l = false;

    /* renamed from: m */
    public boolean f2430m = false;

    /* renamed from: n */
    public boolean f2431n = false;

    /* renamed from: o */
    public boolean f2432o = false;

    /* renamed from: s */
    public Vector f2436s = new Vector();

    /* renamed from: a */
    public final byte m1635a() {
        return this.f2437t;
    }

    /* renamed from: a */
    public final void m1636a(byte b) {
        if (b <= 0) {
            b = 1;
        }
        this.f2437t = b;
    }

    /* renamed from: a */
    public final void m1637a(Graphics graphics, C0009ai c0009ai, int i, int i2, byte b) {
        if (m1641d() || this.f2427j == null) {
            return;
        }
        c0009ai.m62a(graphics, this.f2427j, (int[]) null, 0, 0, i, i2, 20, 0);
    }

    /* renamed from: b */
    public final C0065ck m1638b() {
        C0065ck c0065ck = new C0065ck();
        c0065ck.f2035a = this.f2418a;
        c0065ck.f2036b = this.f2419b == 2 ? (byte) 1 : this.f2419b;
        c0065ck.f2037c = this.f2420c;
        c0065ck.f2038d = this.f2421d;
        c0065ck.f2039e = this.f2422e;
        c0065ck.f2040f = this.f2423f;
        c0065ck.f2041g = this.f2424g;
        c0065ck.f2042h = this.f2425h;
        c0065ck.f2044j = this.f2426i;
        c0065ck.m1370a(this.f2437t);
        c0065ck.f2048n = this.f2428k;
        c0065ck.f2047m = this.f2427j;
        c0065ck.f2052r = this.f2433p;
        c0065ck.f2053s = this.f2434q;
        c0065ck.f2054t = this.f2435r;
        return c0065ck;
    }

    /* renamed from: b */
    public final void m1639b(byte b) {
        C0088t.f2513ag.delete(0, C0088t.f2513ag.length());
        this.f2428k = b;
        if (this.f2419b == 0) {
            if (b == 4) {
                C0088t.f2513ag.append("f").append((int) this.f2426i).append(0).append((int) b);
            } else {
                C0088t.f2513ag.append("f").append((int) this.f2426i).append(0).append((int) this.f2437t).append((int) b);
            }
            this.f2427j = RunnableC0066a.f2096ab.m991b(C0088t.f2513ag.toString());
            if (this.f2427j != null || b == 4) {
                return;
            }
            C0088t.f2513ag.delete(0, C0088t.f2513ag.length());
            C0088t.f2513ag.append("f").append((int) this.f2426i).append(0).append(1).append((int) b);
            this.f2427j = RunnableC0066a.f2096ab.m991b(C0088t.f2513ag.toString());
            return;
        }
        if (this.f2419b != 1) {
            if (this.f2419b == 2) {
                C0088t.f2513ag.append((int) this.f2426i).append((int) (b <= 3 ? b : (byte) 3));
                this.f2427j = RunnableC0066a.f2102ah.m984a(C0088t.f2513ag.toString(), this.f2433p, this.f2434q, this.f2435r);
                return;
            }
            return;
        }
        C0088t.f2513ag.append((int) this.f2426i).append((int) (b > 3 ? (byte) 3 : b));
        this.f2427j = RunnableC0066a.f2102ah.m984a(C0088t.f2513ag.toString(), this.f2433p, this.f2434q, this.f2435r);
        if (this.f2427j == null) {
            C0088t.f2513ag.delete(0, C0088t.f2513ag.length());
            C0088t.f2513ag.append(100).append((int) (b <= 3 ? b : (byte) 3));
            this.f2427j = RunnableC0066a.f2102ah.m984a(C0088t.f2513ag.toString(), this.f2433p, this.f2434q, this.f2435r);
        }
    }

    /* renamed from: c */
    public final C0084p m1640c() {
        C0084p c0084p = new C0084p();
        c0084p.f2418a = this.f2418a;
        c0084p.f2419b = this.f2419b;
        c0084p.f2420c = this.f2420c;
        c0084p.f2421d = this.f2421d;
        c0084p.f2422e = this.f2422e;
        c0084p.f2423f = this.f2423f;
        c0084p.f2424g = this.f2424g;
        c0084p.f2425h = this.f2425h;
        c0084p.f2426i = this.f2426i;
        c0084p.m1636a(this.f2437t);
        c0084p.f2428k = this.f2428k;
        c0084p.f2427j = this.f2427j;
        c0084p.f2433p = this.f2433p;
        c0084p.f2434q = this.f2434q;
        c0084p.f2435r = this.f2435r;
        return c0084p;
    }

    /* renamed from: d */
    public final boolean m1641d() {
        return this.f2422e <= 0;
    }

    /* renamed from: e */
    public final void m1642e() {
        this.f2420c = null;
        this.f2421d = null;
        if (this.f2427j != null) {
            C0030bc c0030bc = this.f2427j;
        }
        this.f2427j = null;
    }

    /* renamed from: f */
    public final short m1643f() {
        if (this.f2427j == null || this.f2427j.f567g == null) {
            return (short) 0;
        }
        return this.f2427j.f567g[this.f2427j.f566f];
    }

    /* renamed from: g */
    public final short m1644g() {
        if (this.f2427j == null || this.f2427j.f568h == null) {
            return (short) 0;
        }
        return this.f2427j.f568h[this.f2427j.f566f];
    }

    /* renamed from: h */
    public final short m1645h() {
        if (this.f2427j == null || this.f2427j.f567g == null) {
            return (short) 0;
        }
        return this.f2427j.f567g[0];
    }

    /* renamed from: i */
    public final short m1646i() {
        if (this.f2427j == null || this.f2427j.f568h == null) {
            return (short) 0;
        }
        return this.f2427j.f568h[0];
    }
}

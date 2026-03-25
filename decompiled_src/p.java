/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import com.yinhan.kjava.main.a;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class p {
    public byte a;
    public byte b;
    public String c;
    public String d;
    public int e;
    public int f;
    public int g;
    public int h;
    public short i;
    private byte t;
    public bc j;
    public byte k;
    public boolean l = false;
    public boolean m = false;
    public boolean n = false;
    public boolean o = false;
    public short p;
    public short q;
    public short r;
    public Vector s = new Vector();

    public final void a(byte by2) {
        this.t = by2 <= 0 ? (byte)1 : by2;
    }

    public final byte a() {
        return this.t;
    }

    public final ck b() {
        ck ck2 = new ck();
        new ck().a = this.a;
        ck2.b = this.b == 2 ? (byte)1 : this.b;
        ck2.c = this.c;
        ck2.d = this.d;
        ck2.e = this.e;
        ck2.f = this.f;
        ck2.g = this.g;
        ck2.h = this.h;
        ck2.j = this.i;
        ck2.a(this.t);
        ck2.n = this.k;
        ck2.m = this.j;
        ck2.r = this.p;
        ck2.s = this.q;
        ck2.t = this.r;
        return ck2;
    }

    public final p c() {
        p p2 = new p();
        new p().a = this.a;
        p2.b = this.b;
        p2.c = this.c;
        p2.d = this.d;
        p2.e = this.e;
        p2.f = this.f;
        p2.g = this.g;
        p2.h = this.h;
        p2.i = this.i;
        p2.a(this.t);
        p2.k = this.k;
        p2.j = this.j;
        p2.p = this.p;
        p2.q = this.q;
        p2.r = this.r;
        return p2;
    }

    public final void b(byte by2) {
        t.ag.delete(0, t.ag.length());
        this.k = by2;
        if (this.b == 0) {
            if (by2 == 4) {
                t.ag.append("f").append(this.i).append(0).append(by2);
            } else {
                t.ag.append("f").append(this.i).append(0).append(this.t).append(by2);
            }
            this.j = com.yinhan.kjava.main.a.ab.b(t.ag.toString());
            if (this.j == null && by2 != 4) {
                t.ag.delete(0, t.ag.length());
                t.ag.append("f").append(this.i).append(0).append(1).append(by2);
                this.j = com.yinhan.kjava.main.a.ab.b(t.ag.toString());
                return;
            }
        } else if (this.b == 1) {
            t.ag.append(this.i).append(by2 > 3 ? 3 : (int)by2);
            this.j = com.yinhan.kjava.main.a.ah.a(t.ag.toString(), this.p, this.q, this.r);
            if (this.j == null) {
                t.ag.delete(0, t.ag.length());
                t.ag.append(100).append(by2 > 3 ? 3 : (int)by2);
                this.j = com.yinhan.kjava.main.a.ah.a(t.ag.toString(), this.p, this.q, this.r);
                return;
            }
        } else if (this.b == 2) {
            t.ag.append(this.i).append(by2 > 3 ? 3 : (int)by2);
            this.j = com.yinhan.kjava.main.a.ah.a(t.ag.toString(), this.p, this.q, this.r);
        }
    }

    public final void a(Graphics graphics, ai ai2, int n2, int n3, byte by2) {
        if (!this.d() && this.j != null) {
            ai2.a(graphics, this.j, null, 0, 0, n2, n3, 20, 0);
        }
    }

    public final boolean d() {
        return this.e <= 0;
    }

    public final void e() {
        this.c = null;
        this.d = null;
        if (this.j != null) {
            bc bc2 = this.j;
        }
        this.j = null;
    }

    public final short f() {
        if (this.j != null && this.j.g != null) {
            return this.j.g[this.j.f];
        }
        return 0;
    }

    public final short g() {
        if (this.j != null && this.j.h != null) {
            return this.j.h[this.j.f];
        }
        return 0;
    }

    public final short h() {
        if (this.j != null && this.j.g != null) {
            return this.j.g[0];
        }
        return 0;
    }

    public final short i() {
        if (this.j != null && this.j.h != null) {
            return this.j.h[0];
        }
        return 0;
    }
}


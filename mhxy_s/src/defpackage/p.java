package defpackage;

import com.yinhan.kjava.main.a;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-8105993946875401281/classes.dex */
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
    public bc j;
    public byte k;
    public short p;
    public short q;
    public short r;
    private byte t;
    public boolean l = false;
    public boolean m = false;
    public boolean n = false;
    public boolean o = false;
    public Vector s = new Vector();

    public final byte a() {
        return this.t;
    }

    public final void a(byte b) {
        if (b <= 0) {
            b = 1;
        }
        this.t = b;
    }

    public final void a(Graphics graphics, ai aiVar, int i, int i2, byte b) {
        if (d() || this.j == null) {
            return;
        }
        aiVar.a(graphics, this.j, (int[]) null, 0, 0, i, i2, 20, 0);
    }

    public final ck b() {
        ck ckVar = new ck();
        ckVar.a = this.a;
        ckVar.b = this.b == 2 ? (byte) 1 : this.b;
        ckVar.c = this.c;
        ckVar.d = this.d;
        ckVar.e = this.e;
        ckVar.f = this.f;
        ckVar.g = this.g;
        ckVar.h = this.h;
        ckVar.j = this.i;
        ckVar.a(this.t);
        ckVar.n = this.k;
        ckVar.m = this.j;
        ckVar.r = this.p;
        ckVar.s = this.q;
        ckVar.t = this.r;
        return ckVar;
    }

    public final void b(byte b) {
        t.ag.delete(0, t.ag.length());
        this.k = b;
        if (this.b == 0) {
            if (b == 4) {
                t.ag.append("f").append((int) this.i).append(0).append((int) b);
            } else {
                t.ag.append("f").append((int) this.i).append(0).append((int) this.t).append((int) b);
            }
            this.j = a.ab.b(t.ag.toString());
            if (this.j != null || b == 4) {
                return;
            }
            t.ag.delete(0, t.ag.length());
            t.ag.append("f").append((int) this.i).append(0).append(1).append((int) b);
            this.j = a.ab.b(t.ag.toString());
            return;
        }
        if (this.b != 1) {
            if (this.b == 2) {
                t.ag.append((int) this.i).append((int) (b <= 3 ? b : (byte) 3));
                this.j = a.ah.a(t.ag.toString(), this.p, this.q, this.r);
                return;
            }
            return;
        }
        t.ag.append((int) this.i).append((int) (b > 3 ? (byte) 3 : b));
        this.j = a.ah.a(t.ag.toString(), this.p, this.q, this.r);
        if (this.j == null) {
            t.ag.delete(0, t.ag.length());
            t.ag.append(100).append((int) (b <= 3 ? b : (byte) 3));
            this.j = a.ah.a(t.ag.toString(), this.p, this.q, this.r);
        }
    }

    public final p c() {
        p pVar = new p();
        pVar.a = this.a;
        pVar.b = this.b;
        pVar.c = this.c;
        pVar.d = this.d;
        pVar.e = this.e;
        pVar.f = this.f;
        pVar.g = this.g;
        pVar.h = this.h;
        pVar.i = this.i;
        pVar.a(this.t);
        pVar.k = this.k;
        pVar.j = this.j;
        pVar.p = this.p;
        pVar.q = this.q;
        pVar.r = this.r;
        return pVar;
    }

    public final boolean d() {
        return this.e <= 0;
    }

    public final void e() {
        this.c = null;
        this.d = null;
        if (this.j != null) {
            bc bcVar = this.j;
        }
        this.j = null;
    }

    public final short f() {
        if (this.j == null || this.j.g == null) {
            return (short) 0;
        }
        return this.j.g[this.j.f];
    }

    public final short g() {
        if (this.j == null || this.j.h == null) {
            return (short) 0;
        }
        return this.j.h[this.j.f];
    }

    public final short h() {
        if (this.j == null || this.j.g == null) {
            return (short) 0;
        }
        return this.j.g[0];
    }

    public final short i() {
        if (this.j == null || this.j.h == null) {
            return (short) 0;
        }
        return this.j.h[0];
    }
}

package defpackage;

import com.yinhan.kjava.main.a;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-8105993946875401281/classes.dex */
public final class ac extends ar {
    private static short n = 4;
    private byte B;
    private boolean C;
    private byte D;
    private byte G;
    public short a;
    public short b;
    private short p;
    private short q;
    private short r;
    private short s;
    private String t;
    private short o = -1;
    private int[] u = new int[4];
    private int[] v = new int[4];
    private String w = "";
    private byte x = 3;
    private boolean y = false;
    private byte z = 0;
    private boolean A = false;
    private s E = null;
    private bv F = null;
    public Vector c = new Vector();
    private bl H = null;

    public ac() {
        this.s = (short) -1;
        this.t = "";
        this.s = bt.ay;
        this.t = bt.nn;
        s();
        a(false);
        t();
    }

    private void a(aw awVar) {
        if (this.j < 0) {
            this.j = (short) 0;
            return;
        }
        if (this.j >= awVar.a) {
            this.j = (short) (awVar.a - n);
            return;
        }
        if (this.k <= -8) {
            this.k = (short) -8;
        } else if (this.k >= awVar.b) {
            this.k = awVar.b;
        } else {
            r();
            u();
        }
    }

    private static boolean a(int i, int i2, int i3, int i4) {
        return (i >> 4) == (i3 >> 4) && (i2 >> 4) == (i4 >> 4);
    }

    private void s() {
        this.u[1] = bu.a(a.a(bt.ax, bt.aj, (byte) 1, bt.ay, false, bt.nn), (byte) 2);
        this.v[1] = bu.a(a.a(bt.ax, bt.aj, (byte) 1, bt.ay, true, bt.nn), (byte) 2);
        this.u[3] = bu.a(a.a(bt.ax, bt.aj, (byte) 3, bt.ay, false, bt.nn), (byte) 2);
        this.v[3] = bu.a(a.a(bt.ax, bt.aj, (byte) 3, bt.ay, true, bt.nn), (byte) 2);
        this.u[0] = bu.a(a.a(bt.ax, bt.aj, (byte) 0, bt.ay, false, bt.nn), (byte) 2);
        this.v[0] = bu.a(a.a(bt.ax, bt.aj, (byte) 0, bt.ay, true, bt.nn), (byte) 2);
        this.u[2] = bu.a(a.a(bt.ax, bt.aj, (byte) 2, bt.ay, false, bt.nn), (byte) 2);
        this.v[2] = bu.a(a.a(bt.ax, bt.aj, (byte) 2, bt.ay, true, bt.nn), (byte) 2);
    }

    private void t() {
        if (bt.be <= 0 && this.d != null) {
            au auVar = this.d;
            if (auVar.e != null) {
                auVar.e.removeAllElements();
                auVar.e = null;
            }
            if (auVar.f != null) {
                bc bcVar = auVar.f;
            }
            auVar.f = null;
            this.d = null;
        }
        if (bt.be > 0) {
            if (this.d == null || this.o != bt.be || this.p != bt.bp || this.q != bt.bq || this.r != bt.br) {
                this.o = bt.be;
                this.p = bt.bp;
                this.q = bt.bq;
                this.r = bt.br;
                this.d = new au((byte) 1, bt.be, bt.bp, bt.bq, bt.br);
            }
            if (this.d.h == 0 && this.d.i == 0) {
                this.d.h = this.j;
                this.d.i = this.k;
            }
            this.d.a(this.h);
        }
    }

    private void u() {
        if (bt.q == null || bt.s != 0) {
            return;
        }
        for (int i = 0; i < bt.q.length; i++) {
            if (!bt.q[i].b.equals(bt.ad)) {
                bt.q[i].f.addElement(new short[]{this.j, this.k});
            }
        }
    }

    public final int a(a aVar) {
        if ((bt.bs != 0 || (bt.bs == 0 && bt.s != 0)) && bt.ab != null && aVar.j != 1) {
            for (int i = 0; i < bt.ab.length; i++) {
                if (a(this.j, this.k, bt.ab[i], bt.ac[i]) || a(this.j + 8, this.k + 8, bt.ab[i], bt.ac[i])) {
                    this.B = this.B == 0 ? (byte) 1 : this.B;
                    if (this.B == 2 || this.B == 0) {
                        return -1;
                    }
                    return i;
                }
            }
        }
        this.B = (byte) 0;
        return -1;
    }

    public final bl a(bl[] blVarArr) {
        if (blVarArr != null) {
            for (bl blVar : blVarArr) {
                this.H = blVar;
                if (this.g == null) {
                    return null;
                }
                if ((this.H.u == 2 || this.H.u == 3) && (a(this.j + (this.g.g() / 2), (this.k + 16) - this.g.h(), this.H.j, this.H.k) || a(this.j + (this.g.g() / 2), (this.k + 32) - this.g.h(), this.H.j, this.H.k))) {
                    this.G = this.G == 0 ? (byte) 1 : this.G;
                    if (this.G == 2 || this.G == 0) {
                        return null;
                    }
                    return this.H;
                }
            }
        }
        this.G = (byte) 0;
        return null;
    }

    public final s a(Vector vector) {
        for (int i = 0; i < vector.size(); i++) {
            this.E = (s) vector.elementAt(i);
            if (this.g == null) {
                return null;
            }
            if (this.E.d == 0 && (a(this.j + 8, this.k + 16, this.E.h, this.E.i) || a(this.j + 8, this.k, this.E.h, this.E.i))) {
                this.D = this.D == 0 ? (byte) 1 : this.D;
                if (this.D == 2 || this.D == 0) {
                    return null;
                }
                return this.E;
            }
        }
        this.D = (byte) 0;
        return null;
    }

    public final void a() {
        t();
    }

    public final void a(byte b) {
        if (bt.bs == 0 && bt.s == 0) {
            return;
        }
        this.h = b;
        if (b == 0) {
            this.a = (short) (-n);
            this.b = (short) 0;
        } else if (b == 2) {
            this.a = n;
            this.b = (short) 0;
        } else if (b == 1) {
            this.a = (short) 0;
            this.b = (short) (-n);
        } else if (b == 3) {
            this.a = (short) 0;
            this.b = n;
        }
        this.A = false;
        if (this.x != b || this.y) {
            a(false);
            this.x = b;
            this.y = false;
            this.A = true;
        }
    }

    public final void a(int i) {
        if (i == 1) {
            this.C = true;
        } else if (i == 0) {
            this.C = false;
        }
    }

    public final void a(aw awVar, ai aiVar, long j) {
        if (this.g == null || awVar == null) {
            return;
        }
        if (!this.y && !this.A) {
            if (this.a != 0 || this.b >= 0) {
                if (this.a >= 0 || this.b != 0) {
                    if (this.a <= 0 || this.b != 0) {
                        if (this.a == 0 && this.b > 0 && aiVar.a(awVar, this.j + this.a + 8, this.k + this.b + 16) == 0 && aiVar.a(awVar, this.j + this.a + 10, this.k + this.b + 16) == 0 && !aiVar.a(this.j + this.a + 8, this.k + this.b + 16) && !aiVar.a(this.j + this.a + 10, this.k + this.b + 16)) {
                            this.j = (short) (this.j + this.a);
                            this.k = (short) (this.k + this.b);
                            a(awVar);
                        }
                    } else if (aiVar.a(awVar, this.j + this.a + 12, this.k + this.b + 16) == 0 && !aiVar.a(this.j + this.a + 12, this.k + this.b + 16)) {
                        this.j = (short) (this.j + this.a);
                        this.k = (short) (this.k + this.b);
                        a(awVar);
                    }
                } else if (aiVar.a(awVar, this.j + this.a + 2, this.k + this.b + 16) == 0 && !aiVar.a(this.j + this.a + 2, this.k + this.b + 16)) {
                    this.j = (short) (this.j + this.a);
                    this.k = (short) (this.k + this.b);
                    a(awVar);
                }
            } else if (aiVar.a(awVar, this.j + this.a + 8, this.k + this.b + 16) == 0 && aiVar.a(awVar, this.j + this.a + 10, this.k + this.b + 16) == 0 && !aiVar.a(this.j + this.a + 8, this.k + this.b + 16) && !aiVar.a(this.j + this.a + 10, this.k + this.b + 16)) {
                this.j = (short) (this.j + this.a);
                this.k = (short) (this.k + this.b);
                a(awVar);
            }
        }
        ai.a(this.g, j);
        if (this.d != null) {
            this.d.a(awVar, aiVar, j);
        }
    }

    public final void a(Graphics graphics, ai aiVar, int i, int i2, byte b) {
        if (this.g != null) {
            aiVar.a(graphics, this.g, (int[]) null, i, i2, this.j + 8, this.k + 16, 20, 0);
            if (bt.ag != null) {
                this.w = bt.ag;
                ca.a(graphics, this.w, (this.j + 8) - i, (((this.k - i2) - t.j) - this.g.j()) + 16, 17, bt.bs >= 0 ? 65280 : bt.ai, 0);
            }
            if (bt.ah != null && !bt.ah.equals("")) {
                ca.a(graphics, bt.ah, (this.j + 8) - i, (((this.k - i2) - (t.j << 1)) - this.g.j()) + 16, 17, bt.bs >= 0 ? 65280 : bt.ai);
            }
            if (bt.bs == 1) {
                aiVar.a(graphics, ao.y, (int[]) null, (aj) null, i, i2, ((this.j + 8) - (t.i.stringWidth(this.w) / 2)) - ao.y.b, (this.k - t.j) - 18, 20, 0);
            } else if (bt.bs == 0) {
                aiVar.a(graphics, ao.z, (int[]) null, (aj) null, i, i2, ((this.j + 8) - (t.i.stringWidth(this.w) / 2)) - ao.z.b, (this.k - t.j) - 18, 20, 0);
            }
        }
    }

    public final void a(short s, short s2) {
        if (!this.c.isEmpty()) {
            this.c.removeAllElements();
            a(false);
        }
        this.j = s;
        this.k = s2;
    }

    public final void a(boolean z) {
        short s;
        short s2;
        short s3;
        if (this.s != bt.ay) {
            this.s = bt.ay;
            s();
        } else if (!this.t.equals(bt.nn)) {
            this.t = bt.nn;
            s();
        }
        if (bt.nn.equals("") || !t.p) {
            s = 0;
            s2 = 0;
            s3 = 0;
        } else {
            s3 = bt.no;
            s2 = bt.nq;
            s = bt.np;
        }
        this.g = a.ab.a(z ? this.v[this.h] : this.u[this.h], s3, s2, s);
        if (this.g != null) {
            if (bt.nn.equals("")) {
                return;
            }
            this.g.a = bt.no;
            this.g.b = bt.nq;
            this.g.c = bt.np;
            return;
        }
        a.a(bt.ax, bt.aj, (byte) 5, bt.ay, this.t, s3, s2, s);
        this.g = a.ab.a(z ? this.v[this.h] : this.u[this.h], s3, s2, s);
        if (this.g == null) {
            bt.ay = (byte) 0;
            s();
            this.g = a.ab.c(z ? this.v[this.h] : this.u[this.h]);
            if (this.g == null) {
                a.a(bt.ax, bt.aj, (byte) 5, bt.ay, this.t, s3, s2, s);
                this.g = a.ab.c(z ? this.v[this.h] : this.u[this.h]);
            }
        }
    }

    public final bv b(Vector vector) {
        if (vector != null && this.g != null) {
            for (int i = 0; i < vector.size(); i++) {
                this.F = (bv) vector.elementAt(i);
                if (this.F.d != null) {
                    short s = this.j;
                    short s2 = this.k;
                    short sG = this.g.g();
                    short sH = this.g.h();
                    int i2 = this.F.e - 16;
                    int i3 = this.F.f - 16;
                    int iG = this.F.d.g() + 32;
                    int iH = this.F.d.h() + 32;
                    if (Math.abs((s + (sG / 2)) - (i2 + (iG / 2))) <= (sG / 2) + (iG / 2) && Math.abs(((sH / 2) + s2) - ((iH / 2) + i3)) <= (sH / 2) + (iH / 2)) {
                        return this.F;
                    }
                }
            }
        }
        return null;
    }

    public final void b() {
        a(false);
    }

    public final void c() {
        if (this.c.isEmpty()) {
            this.a = (short) 0;
            this.b = (short) 0;
            if (!(this.x == this.h && this.y && this.z == bt.ay) && this.c.isEmpty()) {
                a(true);
                this.y = true;
                this.x = this.h;
                this.z = bt.ay;
            }
        }
    }

    public final void d() {
        this.B = (byte) 2;
    }

    public final boolean e() {
        return this.B == 1;
    }

    public final void f() {
        this.D = (byte) 2;
    }

    public final boolean g() {
        return this.D == 1;
    }

    public final boolean h() {
        return this.C;
    }

    public final void i() {
        this.C = false;
    }

    public final void j() {
        if (bt.bs == 0 && bt.s == 0) {
            return;
        }
        if (this.c.size() <= 0) {
            a(true);
            this.c.removeAllElements();
            return;
        }
        int size = this.c.size() - 1;
        if (size >= 0) {
            short[] sArr = (short[]) this.c.elementAt(size);
            short[] sArr2 = size + (-1) > 0 ? (short[]) this.c.elementAt(size - 1) : (short[]) this.c.elementAt(0);
            if (sArr2[0] != sArr[0]) {
                if (sArr2[0] > sArr[0]) {
                    this.h = (byte) 2;
                } else {
                    this.h = (byte) 0;
                }
                a(false);
                if (this.x != this.h) {
                    this.A = true;
                } else {
                    this.A = false;
                }
            } else if (sArr2[1] != sArr[1]) {
                if (sArr2[1] > sArr[1]) {
                    this.h = (byte) 3;
                } else {
                    this.h = (byte) 1;
                }
                a(false);
                if (this.x != this.h) {
                    this.A = true;
                } else {
                    this.A = false;
                }
            } else {
                a(false);
                if (this.x != this.h) {
                    this.A = true;
                } else {
                    this.A = false;
                }
            }
            if (!this.A) {
                this.j = sArr2[0];
                this.k = sArr2[1];
                r();
                u();
                this.c.removeElementAt(size);
                this.y = false;
            }
            this.x = this.h;
        }
    }

    public final void k() {
        this.G = (byte) 2;
    }

    public final boolean l() {
        return this.G == 1;
    }
}

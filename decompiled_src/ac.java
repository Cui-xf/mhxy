/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import com.yinhan.kjava.main.a;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class ac
extends ar {
    private static short n = (short)4;
    public short a;
    public short b;
    private short o = (short)-1;
    private short p;
    private short q;
    private short r;
    private short s = (short)-1;
    private String t = "";
    private int[] u = new int[4];
    private int[] v = new int[4];
    private String w = "";
    private byte x = (byte)3;
    private boolean y = false;
    private byte z = 0;
    private boolean A = false;
    private byte B;
    private boolean C;
    private byte D;
    private s E = null;
    private bv F = null;
    public Vector c = new Vector();
    private byte G;
    private bl H = null;

    public ac() {
        this.s = bt.ay;
        this.t = bt.nn;
        this.s();
        this.a(false);
        this.t();
    }

    private void s() {
        this.u[1] = bu.a(com.yinhan.kjava.main.a.a(bt.ax, bt.aj, (byte)1, bt.ay, false, bt.nn), (byte)2);
        this.v[1] = bu.a(com.yinhan.kjava.main.a.a(bt.ax, bt.aj, (byte)1, bt.ay, true, bt.nn), (byte)2);
        this.u[3] = bu.a(com.yinhan.kjava.main.a.a(bt.ax, bt.aj, (byte)3, bt.ay, false, bt.nn), (byte)2);
        this.v[3] = bu.a(com.yinhan.kjava.main.a.a(bt.ax, bt.aj, (byte)3, bt.ay, true, bt.nn), (byte)2);
        this.u[0] = bu.a(com.yinhan.kjava.main.a.a(bt.ax, bt.aj, (byte)0, bt.ay, false, bt.nn), (byte)2);
        this.v[0] = bu.a(com.yinhan.kjava.main.a.a(bt.ax, bt.aj, (byte)0, bt.ay, true, bt.nn), (byte)2);
        this.u[2] = bu.a(com.yinhan.kjava.main.a.a(bt.ax, bt.aj, (byte)2, bt.ay, false, bt.nn), (byte)2);
        this.v[2] = bu.a(com.yinhan.kjava.main.a.a(bt.ax, bt.aj, (byte)2, bt.ay, true, bt.nn), (byte)2);
    }

    public final void a() {
        this.t();
    }

    public final void a(boolean bl2) {
        short s2;
        short s3;
        short s4;
        if (this.s != bt.ay) {
            this.s = bt.ay;
            this.s();
        } else if (!this.t.equals(bt.nn)) {
            this.t = bt.nn;
            this.s();
        }
        if (bt.nn.equals("") || !t.p) {
            s4 = 0;
            s3 = 0;
            s2 = 0;
        } else {
            s2 = bt.no;
            s3 = bt.nq;
            s4 = bt.np;
        }
        this.g = com.yinhan.kjava.main.a.ab.a(bl2 ? this.v[this.h] : this.u[this.h], s2, s3, s4);
        if (this.g == null) {
            com.yinhan.kjava.main.a.a(bt.ax, bt.aj, (byte)5, bt.ay, this.t, s2, s3, s4);
            this.g = com.yinhan.kjava.main.a.ab.a(bl2 ? this.v[this.h] : this.u[this.h], s2, s3, s4);
            if (this.g == null) {
                bt.ay = 0;
                this.s();
                this.g = com.yinhan.kjava.main.a.ab.c(bl2 ? this.v[this.h] : this.u[this.h]);
                if (this.g == null) {
                    com.yinhan.kjava.main.a.a(bt.ax, bt.aj, (byte)5, bt.ay, this.t, s2, s3, s4);
                    this.g = com.yinhan.kjava.main.a.ab.c(bl2 ? this.v[this.h] : this.u[this.h]);
                    return;
                }
            }
        } else if (!bt.nn.equals("")) {
            this.g.a = bt.no;
            this.g.b = bt.nq;
            this.g.c = bt.np;
        }
    }

    public final void b() {
        this.a(false);
    }

    private void t() {
        if (bt.be <= 0 && this.d != null) {
            au au2 = this.d;
            if (au2.e != null) {
                au2.e.removeAllElements();
                au2.e = null;
            }
            if (au2.f != null) {
                bc bc2 = au2.f;
            }
            au2.f = null;
            this.d = null;
        }
        if (bt.be > 0) {
            if (this.d == null || this.o != bt.be || this.p != bt.bp || this.q != bt.bq || this.r != bt.br) {
                this.o = bt.be;
                this.p = bt.bp;
                this.q = bt.bq;
                this.r = bt.br;
                this.d = new au(1, bt.be, bt.bp, bt.bq, bt.br);
            }
            if (this.d.h == 0 && this.d.i == 0) {
                this.d.h = this.j;
                this.d.i = this.k;
            }
            this.d.a(this.h);
        }
    }

    public final void a(aw aw2, ai ai2, long l2) {
        if (this.g != null && aw2 != null) {
            if (!this.y && !this.A) {
                if (this.a == 0 && this.b < 0) {
                    if (ai2.a(aw2, this.j + this.a + 8, this.k + this.b + 16) == 0 && ai2.a(aw2, this.j + this.a + 10, this.k + this.b + 16) == 0 && !ai2.a(this.j + this.a + 8, this.k + this.b + 16) && !ai2.a(this.j + this.a + 10, this.k + this.b + 16)) {
                        this.j = (short)(this.j + this.a);
                        this.k = (short)(this.k + this.b);
                        this.a(aw2);
                    }
                } else if (this.a < 0 && this.b == 0) {
                    if (ai2.a(aw2, this.j + this.a + 2, this.k + this.b + 16) == 0 && !ai2.a(this.j + this.a + 2, this.k + this.b + 16)) {
                        this.j = (short)(this.j + this.a);
                        this.k = (short)(this.k + this.b);
                        this.a(aw2);
                    }
                } else if (this.a > 0 && this.b == 0) {
                    if (ai2.a(aw2, this.j + this.a + 12, this.k + this.b + 16) == 0 && !ai2.a(this.j + this.a + 12, this.k + this.b + 16)) {
                        this.j = (short)(this.j + this.a);
                        this.k = (short)(this.k + this.b);
                        this.a(aw2);
                    }
                } else if (this.a == 0 && this.b > 0 && ai2.a(aw2, this.j + this.a + 8, this.k + this.b + 16) == 0 && ai2.a(aw2, this.j + this.a + 10, this.k + this.b + 16) == 0 && !ai2.a(this.j + this.a + 8, this.k + this.b + 16) && !ai2.a(this.j + this.a + 10, this.k + this.b + 16)) {
                    this.j = (short)(this.j + this.a);
                    this.k = (short)(this.k + this.b);
                    this.a(aw2);
                }
            }
            ai.a(this.g, l2);
            if (this.d != null) {
                this.d.a(aw2, ai2, l2);
            }
        }
    }

    private void a(aw aw2) {
        if (this.j < 0) {
            this.j = 0;
            return;
        }
        if (this.j >= aw2.a) {
            this.j = (short)(aw2.a - n);
            return;
        }
        if (this.k <= -8) {
            this.k = (short)-8;
            return;
        }
        if (this.k >= aw2.b) {
            this.k = aw2.b;
            return;
        }
        this.r();
        this.u();
    }

    private void u() {
        if (bt.q != null && bt.s == 0) {
            for (int i2 = 0; i2 < bt.q.length; ++i2) {
                if (bt.q[i2].b.equals(bt.ad)) continue;
                bt.q[i2].f.addElement(new short[]{this.j, this.k});
            }
        }
    }

    public final void a(Graphics graphics, ai ai2, int n2, int n3, byte by2) {
        if (this.g != null) {
            ai2.a(graphics, this.g, null, n2, n3, this.j + 8, this.k + 16, 20, 0);
            if (bt.ag != null) {
                this.w = bt.ag;
                ca.a(graphics, this.w, this.j + 8 - n2, this.k - n3 - t.j - this.g.j() + 16, 17, bt.bs >= 0 ? 65280 : bt.ai, 0);
            }
            if (bt.ah != null && !bt.ah.equals("")) {
                ca.a(graphics, bt.ah, this.j + 8 - n2, this.k - n3 - (t.j << 1) - this.g.j() + 16, 17, bt.bs >= 0 ? 65280 : bt.ai);
            }
            if (bt.bs == 1) {
                ai2.a(graphics, ao.y, null, null, n2, n3, this.j + 8 - t.i.stringWidth(this.w) / 2 - ao.y.b, this.k - t.j - 18, 20, 0);
                return;
            }
            if (bt.bs == 0) {
                ai2.a(graphics, ao.z, null, null, n2, n3, this.j + 8 - t.i.stringWidth(this.w) / 2 - ao.z.b, this.k - t.j - 18, 20, 0);
            }
        }
    }

    public final void a(byte by2) {
        if (bt.bs == 0 && bt.s == 0) {
            return;
        }
        this.h = by2;
        if (by2 == 0) {
            this.a = -n;
            this.b = 0;
        } else if (by2 == 2) {
            this.a = n;
            this.b = 0;
        } else if (by2 == 1) {
            this.a = 0;
            this.b = -n;
        } else if (by2 == 3) {
            this.a = 0;
            this.b = n;
        }
        this.A = false;
        if (this.x != by2 || this.y) {
            this.a(false);
            this.x = by2;
            this.y = false;
            this.A = true;
        }
    }

    public final void c() {
        if (this.c.isEmpty()) {
            this.a = 0;
            this.b = 0;
            if ((this.x != this.h || !this.y || this.z != bt.ay) && this.c.isEmpty()) {
                this.a(true);
                this.y = true;
                this.x = this.h;
                this.z = bt.ay;
            }
        }
    }

    public final int a(a a2) {
        if ((bt.bs != 0 || bt.bs == 0 && bt.s != 0) && bt.ab != null && a2.j != 1) {
            for (int i2 = 0; i2 < bt.ab.length; ++i2) {
                if (!ac.a(this.j, this.k, bt.ab[i2], bt.ac[i2]) && !ac.a(this.j + 8, this.k + 8, bt.ab[i2], bt.ac[i2])) continue;
                byte by2 = this.B = this.B == 0 ? (byte)1 : this.B;
                if (this.B == 2 || this.B == 0) {
                    return -1;
                }
                return i2;
            }
        }
        this.B = 0;
        return -1;
    }

    public final s a(Vector vector) {
        for (int i2 = 0; i2 < vector.size(); ++i2) {
            this.E = (s)vector.elementAt(i2);
            if (this.g == null) {
                return null;
            }
            if (this.E.d != 0 || !ac.a(this.j + 8, this.k + 16, this.E.h, this.E.i) && !ac.a(this.j + 8, this.k, this.E.h, this.E.i)) continue;
            byte by2 = this.D = this.D == 0 ? (byte)1 : this.D;
            if (this.D == 2 || this.D == 0) {
                return null;
            }
            return this.E;
        }
        this.D = 0;
        return null;
    }

    public final bv b(Vector vector) {
        if (vector != null && this.g != null) {
            for (int i2 = 0; i2 < vector.size(); ++i2) {
                this.F = (bv)vector.elementAt(i2);
                if (this.F.d == null) continue;
                int n2 = this.F.d.h() + 32;
                int n3 = this.F.d.g() + 32;
                int n4 = this.F.f - 16;
                int n5 = this.F.e - 16;
                short s2 = this.g.h();
                short s3 = this.g.g();
                short s4 = this.k;
                short s5 = this.j;
                if (!(Math.abs(s5 + s3 / 2 - (n5 + n3 / 2)) <= s3 / 2 + n3 / 2 && Math.abs(s4 + s2 / 2 - (n4 + n2 / 2)) <= s2 / 2 + n2 / 2)) continue;
                return this.F;
            }
        }
        return null;
    }

    private static boolean a(int n2, int n3, int n4, int n5) {
        return n2 >> 4 == n4 >> 4 && n3 >> 4 == n5 >> 4;
    }

    public final void d() {
        this.B = (byte)2;
    }

    public final boolean e() {
        return this.B == 1;
    }

    public final void f() {
        this.D = (byte)2;
    }

    public final boolean g() {
        return this.D == 1;
    }

    public final void a(int n2) {
        if (n2 == 1) {
            this.C = true;
            return;
        }
        if (n2 == 0) {
            this.C = false;
        }
    }

    public final boolean h() {
        return this.C;
    }

    public final void i() {
        this.C = false;
    }

    public final void a(short s2, short s3) {
        if (!this.c.isEmpty()) {
            this.c.removeAllElements();
            this.a(false);
        }
        this.j = s2;
        this.k = s3;
    }

    public final void j() {
        if (bt.bs == 0 && bt.s == 0) {
            return;
        }
        int n2 = this.c.size();
        if (n2 > 0) {
            int n3 = this.c.size() - 1;
            if (n3 >= 0) {
                short[] sArray;
                short[] sArray2 = n3 - 1 > 0 ? (short[])this.c.elementAt(n3 - 1) : (short[])this.c.elementAt(0);
                if (sArray2[0] != (sArray = (short[])this.c.elementAt(n3))[0]) {
                    this.h = sArray2[0] > sArray[0] ? (byte)2 : (byte)0;
                    this.a(false);
                    this.A = this.x != this.h;
                } else if (sArray2[1] != sArray[1]) {
                    this.h = sArray2[1] > sArray[1] ? (byte)3 : (byte)1;
                    this.a(false);
                    this.A = this.x != this.h;
                } else {
                    this.a(false);
                    this.A = this.x != this.h;
                }
                if (!this.A) {
                    this.j = sArray2[0];
                    this.k = sArray2[1];
                    this.r();
                    this.u();
                    this.c.removeElementAt(n3);
                    this.y = false;
                }
                this.x = this.h;
            }
            return;
        }
        this.a(true);
        this.c.removeAllElements();
    }

    public final bl a(bl[] blArray) {
        if (blArray != null) {
            for (int i2 = 0; i2 < blArray.length; ++i2) {
                this.H = blArray[i2];
                if (this.g == null) {
                    return null;
                }
                if (this.H.u != 2 && this.H.u != 3 || !ac.a(this.j + this.g.g() / 2, this.k + 16 - this.g.h(), this.H.j, this.H.k) && !ac.a(this.j + this.g.g() / 2, this.k + 32 - this.g.h(), this.H.j, this.H.k)) continue;
                byte by2 = this.G = this.G == 0 ? (byte)1 : this.G;
                if (this.G == 2 || this.G == 0) {
                    return null;
                }
                return this.H;
            }
        }
        this.G = 0;
        return null;
    }

    public final void k() {
        this.G = (byte)2;
    }

    public final boolean l() {
        return this.G == 1;
    }
}


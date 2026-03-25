/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Font
 *  javax.microedition.lcdui.Graphics
 */
import com.yinhan.kjava.main.a;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

public final class an
extends al {
    private byte g = 1;
    private int h = 0;
    public int a = 0;
    private boolean i;
    private boolean j;
    private boolean k;
    public int b;
    public int c;
    public int d;
    public int e;
    private Font l;
    private String m;
    private String[] n;
    private int o;
    private int p;
    private int q;
    private boolean r = false;
    private String s;
    private bw t;
    private String u = "\t";
    private int v = 2176196;
    private int[][] w = new int[2][4];
    public boolean f = false;
    private byte x;
    private int y;

    public an() {
        boolean bl2 = false;
        an an2 = this;
        this.i = false;
        boolean bl3 = true;
        an an3 = this;
        this.j = true;
        boolean bl4 = false;
        an an4 = this;
        this.k = false;
        this.b((byte)1);
        this.r = false;
    }

    public final void a(int n2, int n3, int n4, int n5) {
        this.b = n2;
        this.c = n3;
        this.d = n4;
        this.e = n5;
    }

    public final void b(int n2) {
        block34: {
            int n3;
            block35: {
                an an2;
                block32: {
                    block33: {
                        if (!this.r) break block32;
                        if (this.s != null && !this.s.equals("")) break block33;
                        this.o = 0;
                        this.t = null;
                        break block34;
                    }
                    this.t = new bw(this.s, (short)(this.d - 8 - com.yinhan.kjava.main.a.C.b));
                    an2 = this;
                    n3 = this.t.a();
                    break block35;
                }
                if (this.m != null && !this.m.equals("")) {
                    this.n = ca.a(this.m, this.l, this.d - 8 - com.yinhan.kjava.main.a.C.b, this.u);
                    int n4 = this.v = ca.a(this.n[0]) != -1 ? ca.a(this.n[0]) : 2176196;
                    if (this.v != 2176196) {
                        this.n[0] = this.n[0].substring(3, this.n[0].length());
                    }
                } else {
                    this.n = null;
                }
                an2 = this;
                n3 = this.n == null ? 0 : this.n.length;
            }
            an2.o = n3;
        }
        this.p = (this.e - 6) / this.y;
        this.q = this.o > this.p ? (this.p * (this.e - 16) / this.o > 6 ? this.p * (this.e - 16) / this.o : 6) : 0;
        if (this.x == 0 && (n2 == 1 || n2 == 514) || this.x == 1 && n2 == 515) {
            an an3 = this;
            if (an3.g == 0) {
                if (an3.h == 0) {
                    an3.a = an3.o % an3.p == 0 ? an3.o - an3.p : an3.o - an3.o % an3.p;
                }
                int n5 = an3.h = an3.h == 0 ? an3.o - 1 : an3.h - 1;
                while (an3.a > 0 && an3.q != 0 && an3.h - an3.a + 1 < an3.p) {
                    --an3.a;
                }
            } else if (an3.g == 1) {
                if (an3.h <= an3.p - 1) {
                    an3.a = an3.o % an3.p == 0 ? an3.o - an3.p : an3.o - an3.o % an3.p;
                }
                int n6 = an3.h = an3.h <= an3.p - 1 ? an3.o - 1 : an3.h - 1;
                while (an3.a > 0 && an3.q != 0 && an3.h - an3.a + 1 < an3.p) {
                    --an3.a;
                }
            } else if (an3.g == 2 && an3.o > an3.p) {
                if (an3.a == 0) {
                    an3.a = an3.o - an3.p;
                    an3.h = an3.o - 1;
                } else {
                    int n7 = an3.a = an3.a - an3.p <= 0 ? 0 : an3.a - an3.p;
                    an3.h = an3.a == 0 ? an3.p - 1 : an3.a + an3.p - 1;
                }
            }
        } else if (this.x == 0 && (n2 == 4 || n2 == 520) || this.x == 1 && n2 == 521) {
            an an4 = this;
            if (an4.g == 0) {
                if (an4.h == an4.o - 1) {
                    an4.a = 0;
                }
                int n8 = an4.h = an4.h == an4.o - 1 ? 0 : an4.h + 1;
                while (an4.a < an4.h && an4.q != 0 && an4.h - an4.a + 1 > an4.p) {
                    ++an4.a;
                }
            } else if (an4.g == 1) {
                if (an4.h == an4.o - 1) {
                    an4.a = 0;
                }
                int n9 = an4.h == an4.o - 1 ? an4.p - 1 : (an4.h = an4.h <= an4.p - 1 ? an4.p : an4.h + 1);
                while (an4.a < an4.h && an4.q != 0 && an4.h - an4.a + 1 > an4.p) {
                    ++an4.a;
                }
            } else if (an4.g == 2 && an4.o > an4.p) {
                if (an4.a == an4.o - an4.p) {
                    an4.a = 0;
                    an4.h = an4.p - 1;
                } else {
                    an4.a = an4.a + an4.p >= an4.o - an4.p ? an4.o - an4.p : an4.a + an4.p;
                    an4.h = an4.a == an4.o - an4.p ? an4.o - 1 : an4.a + an4.p - 1;
                }
            }
        }
        while (this.h > this.o - 1) {
            --this.h;
            --this.a;
        }
        while (this.a > 0 && this.q != 0 && this.h - this.a + 1 < this.p) {
            --this.a;
        }
        while (this.a < this.h && this.q != 0 && this.h - this.a + 1 > this.p) {
            ++this.a;
        }
        if (this.q == 0 && this.a != 0) {
            this.a = 0;
        }
    }

    public final int b(int n2, int n3) {
        if (this.a(n2, n3, 0)) {
            if (this.x == 0) {
                return 1;
            }
            return 515;
        }
        if (this.a(n2, n3, 1)) {
            if (this.x == 0) {
                return 4;
            }
            return 521;
        }
        return 0;
    }

    private void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.w[0][0] = n2;
        this.w[0][1] = n3;
        this.w[0][2] = n6;
        this.w[0][3] = n7;
        this.w[1][0] = n4;
        this.w[1][1] = n5;
        this.w[1][2] = n6;
        this.w[1][3] = n7;
    }

    private boolean a(int n2, int n3, int n4) {
        return n4 == 0 ? n2 >= this.w[0][0] && n2 <= this.w[0][0] + this.w[0][2] && n3 >= this.w[0][1] && n3 <= this.w[0][1] + this.w[0][3] : n4 == 1 && n2 >= this.w[1][0] && n2 <= this.w[1][0] + this.w[1][2] && n3 >= this.w[1][1] && n3 <= this.w[1][1] + this.w[1][3];
    }

    public final void a(String object, Font font, byte by2) {
        this.y = font.getHeight();
        this.h = 0;
        this.a = 0;
        this.l = font;
        this.s = object;
        this.t = null;
        this.b(by2);
        byte by3 = 0;
        object = this;
        this.x = by3;
        this.r = true;
        this.u = "\t";
        this.m = null;
        this.n = null;
    }

    public final void b(String object, Font font, byte by2) {
        this.y = font.getHeight();
        this.h = 0;
        this.a = 0;
        this.l = font;
        this.m = object;
        this.b(by2);
        byte by3 = 0;
        object = this;
        this.x = by3;
        this.u = "\t";
        this.r = false;
        this.s = null;
        this.t = null;
    }

    public final void a(Graphics graphics) {
        if (this.i) {
            ca.a(graphics, 6014420);
            graphics.fillRect(this.b, this.c, this.d, this.e);
        }
        if (this.j) {
            ca.a(graphics, this.b, this.c, this.d, this.e, 1);
            if (this.f) {
                ca.a(graphics);
            }
        }
        if (!this.r && this.n != null) {
            for (int i2 = this.a; i2 < this.n.length && i2 < this.a + this.p; ++i2) {
                if (i2 == this.h && this.k) {
                    ca.a(graphics, 9);
                    if (this.h >= this.p) {
                        graphics.fillRect(this.b + 4, this.c + 4 + (this.p - 1) * this.y, this.d - com.yinhan.kjava.main.a.C.b - 8, this.y);
                    } else {
                        graphics.fillRect(this.b + 4, this.c + 4 + this.h * this.y, this.d - com.yinhan.kjava.main.a.C.b - 8, this.y);
                    }
                }
                if (i2 == this.h && this.g == 0) {
                    ca.a(graphics, this.n[i2], this.b + 4, this.c + 4 + (i2 - this.a) * this.y, 20, 13500379);
                    continue;
                }
                ca.a(graphics, this.n[i2], this.b + 4, this.c + 4 + (i2 - this.a) * this.y, 20, this.v);
            }
            if (this.q > 0) {
                ca.a(graphics, this.b + this.d - 2 - com.yinhan.kjava.main.a.C.b, this.c + 3, this.e - 5, this.q, this.a, this.o, this.p);
                this.a(this.b + this.d - 2 - com.yinhan.kjava.main.a.C.b, this.c + 3, this.b + this.d - 2 - com.yinhan.kjava.main.a.C.b, this.c + 3 + this.e - 5 - com.yinhan.kjava.main.a.D.c, com.yinhan.kjava.main.a.D.b, com.yinhan.kjava.main.a.D.c);
                return;
            }
        } else if (this.r && this.t != null) {
            for (int i3 = this.a; i3 < this.t.a() && i3 < this.a + this.p; ++i3) {
                this.t.a(graphics, this.b + 4, this.c + 4 + (i3 - this.a) * this.y, i3, 0);
            }
            if (this.q > 0) {
                ca.a(graphics, this.b + this.d - 2 - com.yinhan.kjava.main.a.C.b, this.c + 3, this.e - 5, this.q, this.a, this.o, this.p);
                this.a(this.b + this.d - 2 - com.yinhan.kjava.main.a.C.b, this.c + 3, this.b + this.d - 2 - com.yinhan.kjava.main.a.C.b, this.c + 3 + this.e - 5 - com.yinhan.kjava.main.a.D.c, com.yinhan.kjava.main.a.D.b, com.yinhan.kjava.main.a.D.c);
            }
        }
    }

    private void b(byte by2) {
        this.g = by2;
        if (by2 == 1) {
            boolean bl2 = false;
            an an2 = this;
            this.k = false;
        }
    }

    public final void j() {
        if (this.n != null) {
            for (int n2 = 0; n2 < this.n.length; n2 = (int)((short)(n2 + 1))) {
                this.n[n2] = null;
            }
            this.n = null;
        }
        this.s = null;
        this.t = null;
    }

    public final void a(byte by2) {
        this.x = by2;
    }
}


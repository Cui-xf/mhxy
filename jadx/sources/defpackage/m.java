package defpackage;

import com.yinhan.kjava.main.a;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-8105993946875401281/classes.dex */
public final class m extends al {
    public int c;
    public int d;
    private String i;
    private int m;
    private int n;
    private int o;
    private int p;
    private int h = 16776917;
    private boolean j = false;
    private boolean k = true;
    public int a = 0;
    public int b = 0;
    private Vector l = new Vector();
    private int[] q = null;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    private int r = 0;
    private int s = 0;
    private int t = -1;
    private int u = -1;
    private int v = -1;
    private int w = -1;
    private int x = -1;
    private boolean y = false;

    private void b(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.s = this.b + 5;
        if (this.i == null || a.v == null) {
            return;
        }
        int i5 = this.a;
        int i6 = this.s;
        int i7 = this.c;
        short s = a.v.c;
        if (this.i != null) {
            this.m = i5;
            this.n = i6;
            this.o = i7;
            this.p = s;
            this.s = this.s + this.p + 3;
        }
    }

    private void c() {
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = -1;
        this.x = -1;
        for (int i = 0; i < this.l.size(); i++) {
            Object objElementAt = this.l.elementAt(i);
            if (objElementAt instanceof n) {
                this.t = i;
            } else if (objElementAt instanceof c) {
                this.u = i;
            } else if (objElementAt instanceof an) {
                this.v = i;
            } else if (objElementAt instanceof bm) {
                this.w = i;
            } else if (objElementAt instanceof l) {
                this.x = i;
            }
        }
    }

    public final int a() {
        return this.n + this.p + 3;
    }

    public final int a(int i) {
        this.r = i;
        return this.r;
    }

    public final void a(int i, int i2, int i3, int i4) {
        b(i, i2, i3, i4);
        c();
        if (this.t != -1) {
            ((n) this.l.elementAt(this.t)).a(this.a + 5, this.s, this.c - 20, t.j + 3);
            this.s += t.j;
        }
        if (this.u != -1 && this.v == -1) {
            int i5 = (((((this.b + this.d) - this.s) - 6) - (this.w != -1 ? t.j + 4 : 0)) - (this.x != -1 ? a.E.c : (short) 0)) - this.e;
            ((c) this.l.elementAt(this.u)).a(this.a + 5, this.s + this.e, this.c - 11, i5 - this.f);
            this.s += i5;
        } else if (this.u == -1 && this.v != -1) {
            int i6 = (((((this.b + this.d) - this.s) - 6) - (this.w != -1 ? t.j + 4 : 0)) - (this.x != -1 ? a.E.c : (short) 0)) - this.r;
            ((an) this.l.elementAt(this.v)).a(this.a + 5, this.s + this.r, this.c - 11, i6 - this.g);
            this.s += i6;
        } else if (this.u != -1 && this.v != -1) {
            int i7 = (((((this.b + this.d) - this.s) - 6) - (this.w != -1 ? t.j + 4 : 0)) - (this.x != -1 ? a.E.c : (short) 0)) - this.e;
            int i8 = i7 / 2;
            this.s += this.e;
            ((c) this.l.elementAt(this.u)).a(this.a + 5, this.s, this.c - 11, i8);
            this.s += i8;
            ((an) this.l.elementAt(this.v)).a(this.a + 5, this.s, this.c - 11, i7 - i8);
        }
        if (this.w == -1) {
            if (this.x != -1) {
                ((l) this.l.elementAt(this.x)).a(this.a, this.b, this.c, this.d - 5);
            }
        } else {
            int i9 = this.a + 6;
            int i10 = this.b;
            int i11 = this.c - 13;
            int i12 = this.d - 6;
        }
    }

    public final void a(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        b(i, i2, i3, i4);
        c();
        if (this.t != -1) {
            ((n) this.l.elementAt(this.t)).a(this.a + 5, this.s, this.c - 20, t.j + 3);
            this.s += t.j;
        }
        if (this.u != -1 && this.v == -1) {
            int i7 = (((((this.b + this.d) - this.s) - 6) - (this.w != -1 ? t.j + 4 : 0)) - (this.x != -1 ? a.E.c : (short) 0)) - this.e;
            ((c) this.l.elementAt(this.u)).a(this.a + 5, this.s + this.e, this.c - 11, i7 - this.f);
            this.s += i7;
        } else if (this.u == -1 && this.v != -1) {
            int i8 = (((((this.b + this.d) - this.s) - 6) - (this.w != -1 ? t.j + 4 : 0)) - (this.x != -1 ? a.E.c : (short) 0)) - this.r;
            ((an) this.l.elementAt(this.v)).a(this.a + 5, this.s + this.r, this.c - 11, i8 - this.g);
            this.s += i8;
        } else if (this.u != -1 && this.v != -1) {
            int i9 = (((((this.b + this.d) - this.s) - 6) - (this.w != -1 ? t.j + 4 : 0)) - (this.x != -1 ? a.E.c : (short) 0)) - this.e;
            int i10 = (i9 * i5) / i6;
            this.s += this.e;
            if (z) {
                ((an) this.l.elementAt(this.v)).a(this.a + 5, this.s, this.c - 11, i10);
                this.s += i10;
                ((c) this.l.elementAt(this.u)).a(this.a + 5, this.s, this.c - 11, i9 - i10);
            } else {
                ((c) this.l.elementAt(this.u)).a(this.a + 5, this.s, this.c - 11, i10);
                this.s += i10;
                ((an) this.l.elementAt(this.v)).a(this.a + 5, this.s, this.c - 11, i9 - i10);
            }
        }
        if (this.w == -1) {
            if (this.x != -1) {
                ((l) this.l.elementAt(this.x)).a(this.a, this.b, this.c, this.d - 5);
            }
        } else {
            int i11 = this.a + 6;
            int i12 = this.b;
            int i13 = this.c - 13;
            int i14 = this.d - 6;
        }
    }

    public final void a(al alVar) {
        this.l.addElement(alVar);
    }

    public final void a(String str) {
        this.i = str;
        if (str == null) {
            this.q = null;
        } else {
            this.q = new int[4];
        }
        this.r = 0;
        this.s = 0;
    }

    public final void a(Graphics graphics) {
        graphics.setClip(this.a, this.b, this.c, this.d);
        if (this.j) {
            graphics.setColor(2780801);
            graphics.fillRect(this.a, this.b, this.c, this.d);
        }
        this.y = false;
        if (this.i != null && this.i != null) {
            ca.a(graphics, a.v.a, a.v.b, this.m, this.n, this.o, this.p);
            graphics.drawImage(a.u.a, ((this.m + this.o) - 5) - a.u.b, this.n + 1, 20);
            int i = ((this.m + this.o) - 5) - a.u.b;
            int i2 = this.n + 1;
            short s = a.u.b;
            short s2 = a.u.c;
            if (this.q != null) {
                this.q[0] = i;
                this.q[1] = i2;
                this.q[2] = s;
                this.q[3] = s2;
            }
            int iA = ca.a(this.i) != -1 ? ca.a(this.i) : this.h;
            String strSubstring = this.i;
            if (iA != this.h) {
                strSubstring = ca.m == 2 ? this.i.substring(4, this.i.length()) : this.i.substring(3, this.i.length());
            }
            ca.a(graphics, strSubstring, (this.o / 2) + this.m, t.a(a.v.c) + this.n, 17, iA, 0);
            ca.a(graphics, this.m, this.n + this.p, this.o);
        }
        for (int i3 = 0; i3 < this.l.size(); i3++) {
            Object objElementAt = this.l.elementAt(i3);
            if (objElementAt instanceof n) {
                ((n) objElementAt).a(graphics);
                this.y = true;
            } else if (objElementAt instanceof c) {
                ((c) objElementAt).a(graphics);
                ((c) objElementAt).a(this.y);
            } else if (objElementAt instanceof an) {
                ((an) objElementAt).a(graphics);
                ((an) objElementAt).f = this.y;
            } else if (objElementAt instanceof bm) {
            } else if (objElementAt instanceof l) {
                ((l) objElementAt).a(graphics);
            }
        }
        ca.a(graphics, 2);
        graphics.drawRect(this.a, this.b, this.c - 1, this.d - 1);
        graphics.drawRect(this.a + 4, this.b + 4, this.c - 9, this.d - 9);
        ca.a(graphics, 3);
        graphics.drawRect(this.a + 1, this.b + 1, this.c - 3, this.d - 3);
        graphics.drawRect(this.a + 3, this.b + 3, this.c - 7, this.d - 7);
        ca.a(graphics, 4);
        graphics.drawRect(this.a + 2, this.b + 2, this.c - 5, this.d - 5);
        if (a.r.a != null && this.k) {
            graphics.drawImage(a.r.a, this.a, this.b, 20);
        }
        if (a.s.a != null) {
            graphics.drawImage(a.s.a, this.a, (this.b + this.d) - a.s.c, 20);
        }
        if (a.t.a != null) {
            graphics.drawImage(a.t.a, (this.a + this.c) - a.t.b, (this.b + this.d) - a.t.c, 20);
        }
        graphics.setClip(this.a, this.b, this.c, this.d);
    }

    public final void a(boolean z) {
        this.j = z;
    }

    @Override // defpackage.al
    public final int b(int i, int i2) {
        if (this.q != null && i >= this.q[0] && i <= this.q[0] + this.q[2] && i2 >= this.q[1] && i2 <= this.q[1] + this.q[3]) {
            return 536870912;
        }
        for (int i3 = 0; i3 < this.l.size(); i3++) {
            if (((al) this.l.elementAt(i3)).b(i, i2) != 0) {
                return ((al) this.l.elementAt(i3)).b(i, i2);
            }
        }
        return 0;
    }

    public final void b() {
        this.i = null;
        this.j = false;
        this.r = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.l.removeAllElements();
    }

    @Override // defpackage.al
    public final void b(int i) {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= this.l.size()) {
                return;
            }
            ((al) this.l.elementAt(i3)).b(i);
            i2 = i3 + 1;
        }
    }

    public final void b(boolean z) {
        this.k = false;
    }

    @Override // defpackage.al
    public final void j() {
        int i = 0;
        this.i = null;
        this.j = false;
        this.r = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.k = true;
        while (true) {
            int i2 = i;
            if (i2 >= this.l.size()) {
                this.l.removeAllElements();
                return;
            } else {
                ((al) this.l.elementAt(i2)).j();
                i = i2 + 1;
            }
        }
    }
}

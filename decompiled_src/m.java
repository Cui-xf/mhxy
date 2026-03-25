/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import com.yinhan.kjava.main.a;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class m
extends al {
    private int h = 16776917;
    private String i;
    private boolean j = false;
    private boolean k = true;
    public int a = 0;
    public int b = 0;
    public int c;
    public int d;
    private Vector l = new Vector();
    private int m;
    private int n;
    private int o;
    private int p;
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

    public final void a(boolean bl2) {
        this.j = bl2;
    }

    public final void a(String string) {
        this.i = string;
        this.q = (int[])(string == null ? null : new int[4]);
        this.r = 0;
        this.s = 0;
    }

    public final int a() {
        return this.n + this.p + 3;
    }

    private void b(int n2, int n3, int n4, int n5) {
        this.a = n2;
        this.b = n3;
        this.c = n4;
        this.d = n5;
        this.s = this.b + 5;
        if (this.i != null && com.yinhan.kjava.main.a.v != null) {
            n5 = com.yinhan.kjava.main.a.v.c;
            n4 = this.c;
            n3 = this.s;
            n2 = this.a;
            if (this.i != null) {
                this.m = n2;
                this.n = n3;
                this.o = n4;
                this.p = n5;
                this.s = this.s + this.p + 3;
            }
        }
    }

    public final int a(int n2) {
        this.r = n2;
        return this.r;
    }

    public final void a(int n2, int n3, int n4, int n5) {
        this.b(n2, n3, n4, n5);
        this.c();
        if (this.t != -1) {
            ((n)this.l.elementAt(this.t)).a(this.a + 5, this.s, this.c - 20, t.j + 3);
            this.s += t.j;
        }
        if (this.u != -1 && this.v == -1) {
            n2 = this.b + this.d - this.s - 6 - (this.w != -1 ? t.j + 4 : 0) - (this.x != -1 ? com.yinhan.kjava.main.a.E.c : (short)0) - this.e;
            ((c)this.l.elementAt(this.u)).a(this.a + 5, this.s + this.e, this.c - 11, n2 - this.f);
            this.s += n2;
        } else if (this.u == -1 && this.v != -1) {
            n2 = this.b + this.d - this.s - 6 - (this.w != -1 ? t.j + 4 : 0) - (this.x != -1 ? com.yinhan.kjava.main.a.E.c : (short)0) - this.r;
            ((an)this.l.elementAt(this.v)).a(this.a + 5, this.s + this.r, this.c - 11, n2 - this.g);
            this.s += n2;
        } else if (this.u != -1 && this.v != -1) {
            n2 = this.b + this.d - this.s - 6 - (this.w != -1 ? t.j + 4 : 0) - (this.x != -1 ? com.yinhan.kjava.main.a.E.c : (short)0) - this.e;
            n3 = n2 / 2;
            this.s += this.e;
            ((c)this.l.elementAt(this.u)).a(this.a + 5, this.s, this.c - 11, n3);
            this.s += n3;
            ((an)this.l.elementAt(this.v)).a(this.a + 5, this.s, this.c - 11, n2 -= n3);
        }
        if (this.w != -1) {
            int n6 = this.d - 6;
            n6 = this.c - 13;
            n6 = this.b;
            n6 = this.a + 6;
            bm bm2 = (bm)this.l.elementAt(this.w);
            return;
        }
        if (this.x != -1) {
            ((l)this.l.elementAt(this.x)).a(this.a, this.b, this.c, this.d - 5);
        }
    }

    public final void a(int n2, int n3, int n4, int n5, int n6, int n7, boolean bl2) {
        this.b(n2, n3, n4, n5);
        this.c();
        if (this.t != -1) {
            ((n)this.l.elementAt(this.t)).a(this.a + 5, this.s, this.c - 20, t.j + 3);
            this.s += t.j;
        }
        if (this.u != -1 && this.v == -1) {
            n2 = this.b + this.d - this.s - 6 - (this.w != -1 ? t.j + 4 : 0) - (this.x != -1 ? com.yinhan.kjava.main.a.E.c : (short)0) - this.e;
            ((c)this.l.elementAt(this.u)).a(this.a + 5, this.s + this.e, this.c - 11, n2 - this.f);
            this.s += n2;
        } else if (this.u == -1 && this.v != -1) {
            n2 = this.b + this.d - this.s - 6 - (this.w != -1 ? t.j + 4 : 0) - (this.x != -1 ? com.yinhan.kjava.main.a.E.c : (short)0) - this.r;
            ((an)this.l.elementAt(this.v)).a(this.a + 5, this.s + this.r, this.c - 11, n2 - this.g);
            this.s += n2;
        } else if (this.u != -1 && this.v != -1) {
            n2 = this.b + this.d - this.s - 6 - (this.w != -1 ? t.j + 4 : 0) - (this.x != -1 ? com.yinhan.kjava.main.a.E.c : (short)0) - this.e;
            n3 = n2 * n6 / n7;
            this.s += this.e;
            if (bl2) {
                ((an)this.l.elementAt(this.v)).a(this.a + 5, this.s, this.c - 11, n3);
                this.s += n3;
                ((c)this.l.elementAt(this.u)).a(this.a + 5, this.s, this.c - 11, n2 -= n3);
            } else {
                ((c)this.l.elementAt(this.u)).a(this.a + 5, this.s, this.c - 11, n3);
                this.s += n3;
                ((an)this.l.elementAt(this.v)).a(this.a + 5, this.s, this.c - 11, n2 -= n3);
            }
        }
        if (this.w != -1) {
            int n8 = this.d - 6;
            n8 = this.c - 13;
            n8 = this.b;
            n8 = this.a + 6;
            bm bm2 = (bm)this.l.elementAt(this.w);
            return;
        }
        if (this.x != -1) {
            ((l)this.l.elementAt(this.x)).a(this.a, this.b, this.c, this.d - 5);
        }
    }

    public final void a(al al2) {
        this.l.addElement(al2);
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

    public final void b(int n2) {
        for (int i2 = 0; i2 < this.l.size(); ++i2) {
            ((al)this.l.elementAt(i2)).b(n2);
        }
    }

    public final int b(int n2, int n3) {
        int n4 = n3;
        int n5 = n2;
        m m2 = this;
        if (m2.q != null && n5 >= m2.q[0] && n5 <= m2.q[0] + m2.q[2] && n4 >= m2.q[1] && n4 <= m2.q[1] + m2.q[3]) {
            return 0x20000000;
        }
        for (int i2 = 0; i2 < this.l.size(); ++i2) {
            if (((al)this.l.elementAt(i2)).b(n2, n3) == 0) continue;
            return ((al)this.l.elementAt(i2)).b(n2, n3);
        }
        return 0;
    }

    private void c() {
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = -1;
        this.x = -1;
        for (int i2 = 0; i2 < this.l.size(); ++i2) {
            Object e2 = this.l.elementAt(i2);
            if (e2 instanceof n) {
                this.t = i2;
                continue;
            }
            if (e2 instanceof c) {
                this.u = i2;
                continue;
            }
            if (e2 instanceof an) {
                this.v = i2;
                continue;
            }
            if (e2 instanceof bm) {
                this.w = i2;
                continue;
            }
            if (!(e2 instanceof l)) continue;
            this.x = i2;
        }
    }

    public final void b(boolean bl2) {
        this.k = false;
    }

    public final void a(Graphics graphics) {
        int n2;
        al al2;
        Graphics graphics2;
        graphics.setClip(this.a, this.b, this.c, this.d);
        if (this.j) {
            graphics.setColor(2780801);
            graphics.fillRect(this.a, this.b, this.c, this.d);
        }
        this.y = false;
        if (this.i != null) {
            graphics2 = graphics;
            al2 = this;
            if (al2.i != null) {
                ca.a(graphics2, com.yinhan.kjava.main.a.v.a, com.yinhan.kjava.main.a.v.b, al2.m, al2.n, al2.o, al2.p);
                graphics2.drawImage(com.yinhan.kjava.main.a.u.a, al2.m + al2.o - 5 - com.yinhan.kjava.main.a.u.b, al2.n + 1, 20);
                short s2 = com.yinhan.kjava.main.a.u.c;
                short s3 = com.yinhan.kjava.main.a.u.b;
                int n3 = al2.n + 1;
                int n4 = al2.m + al2.o - 5 - com.yinhan.kjava.main.a.u.b;
                al al3 = al2;
                if (al3.q != null) {
                    al3.q[0] = n4;
                    al3.q[1] = n3;
                    al3.q[2] = s3;
                    al3.q[3] = s2;
                }
                n2 = ca.a(al2.i) != -1 ? ca.a(al2.i) : al2.h;
                String string = al2.i;
                if (n2 != al2.h) {
                    string = ca.m == 2 ? al2.i.substring(4, al2.i.length()) : al2.i.substring(3, al2.i.length());
                }
                ca.a(graphics2, string, al2.m + al2.o / 2, al2.n + t.a(com.yinhan.kjava.main.a.v.c), 17, n2, 0);
                ca.a(graphics2, al2.m, al2.n + al2.p, al2.o);
            }
        }
        for (n2 = 0; n2 < this.l.size(); ++n2) {
            al2 = this.l.elementAt(n2);
            if (al2 instanceof n) {
                ((n)al2).a(graphics);
                this.y = true;
                continue;
            }
            if (al2 instanceof c) {
                ((c)al2).a(graphics);
                ((c)al2).a(this.y);
                continue;
            }
            if (al2 instanceof an) {
                ((an)al2).a(graphics);
                boolean bl2 = this.y;
                al2 = (an)al2;
                v0.f = bl2;
                continue;
            }
            if (al2 instanceof bm) {
                graphics2 = graphics;
                al2 = (bm)al2;
                continue;
            }
            if (!(al2 instanceof l)) continue;
            ((l)al2).a(graphics);
        }
        ca.a(graphics, 2);
        graphics.drawRect(this.a, this.b, this.c - 1, this.d - 1);
        graphics.drawRect(this.a + 4, this.b + 4, this.c - 9, this.d - 9);
        ca.a(graphics, 3);
        graphics.drawRect(this.a + 1, this.b + 1, this.c - 3, this.d - 3);
        graphics.drawRect(this.a + 3, this.b + 3, this.c - 7, this.d - 7);
        ca.a(graphics, 4);
        graphics.drawRect(this.a + 2, this.b + 2, this.c - 5, this.d - 5);
        if (com.yinhan.kjava.main.a.r.a != null && this.k) {
            graphics.drawImage(com.yinhan.kjava.main.a.r.a, this.a, this.b, 20);
        }
        if (com.yinhan.kjava.main.a.s.a != null) {
            graphics.drawImage(com.yinhan.kjava.main.a.s.a, this.a, this.b + this.d - com.yinhan.kjava.main.a.s.c, 20);
        }
        if (com.yinhan.kjava.main.a.t.a != null) {
            graphics.drawImage(com.yinhan.kjava.main.a.t.a, this.a + this.c - com.yinhan.kjava.main.a.t.b, this.b + this.d - com.yinhan.kjava.main.a.t.c, 20);
        }
        graphics.setClip(this.a, this.b, this.c, this.d);
    }

    public final void j() {
        this.i = null;
        this.j = false;
        this.r = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.k = true;
        for (int i2 = 0; i2 < this.l.size(); ++i2) {
            ((al)this.l.elementAt(i2)).j();
        }
        this.l.removeAllElements();
    }
}


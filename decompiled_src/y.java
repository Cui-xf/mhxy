/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class y
extends bk {
    private int[] j = new int[]{20871, 1152942, 9820642, 20871, 1152942};
    private int k = 2780801;
    private int l = 16776917;
    private String m;
    private int n;
    private int o;
    private boolean p = true;
    public static bf a;
    public static bf b;
    public static bf c;
    public static bf d;
    public static bf e;
    private int q;
    private int r;
    private int s;
    private int t;
    private Vector u = new Vector();
    private static y v;

    public static y c() {
        if (v == null) {
            v = new y();
        }
        return v;
    }

    public final void a() {
    }

    public final void a(String string) {
        this.m = string;
    }

    public final void a(bk bk2) {
        if (bk2 instanceof af) {
            this.u.insertElementAt(bk2, 0);
            return;
        }
        this.u.addElement(bk2);
    }

    public final void b() {
        for (int i2 = 0; i2 < this.u.size(); ++i2) {
            ((bk)this.u.elementAt(i2)).b();
        }
        this.u.removeAllElements();
    }

    public final void d() {
        bk bk2;
        int n2;
        if (this.m != null) {
            this.n = this.f + (this.h - t.i.stringWidth(this.m)) / 2;
            this.o = this.g + 5;
        }
        y y2 = this;
        y2.t = -1;
        y2.s = -1;
        y2.r = -1;
        this.q = -1;
        for (n2 = 0; n2 < y2.u.size(); ++n2) {
            Object e2 = y2.u.elementAt(n2);
            if (e2 instanceof af) {
                y2.q = n2;
                continue;
            }
            if (e2 instanceof ay) {
                y2.r = n2;
                continue;
            }
            if (e2 instanceof bi) {
                y2.s = n2;
                continue;
            }
            if (!(e2 instanceof u)) continue;
            y2.t = n2;
        }
        int n3 = this.f + 5;
        n2 = this.g + 31;
        int n4 = this.i - 25 - 10;
        if (this.q != -1) {
            bk2 = (af)this.u.elementAt(this.q);
            bk2.a(n3, n2, this.h - 10, 25);
            n2 += bk2.e() - 3;
            n4 -= bk2.e() - 3;
        }
        if (this.t != -1) {
            bk2 = (u)this.u.elementAt(this.t);
            bk2.a(this.f + 5, this.g + this.i - 30, this.h - 10, 26);
            n4 -= bk2.e();
        }
        if (this.r != -1 && this.s != -1) {
            bk2 = (ay)this.u.elementAt(this.r);
            bk2.a(n3, n2, this.h - 10, (n4 << 2) / 7);
            ((ay)bk2).a(this.q != -1);
            n2 += (n4 << 2) / 7;
            n4 -= bk2.e();
            bk2 = (bi)this.u.elementAt(this.s);
            bk2.a(n3, n2, this.h - 10, n4);
            ((bi)bk2).a(this.q != -1);
        } else if (this.r != -1 || this.s != -1) {
            bk2 = (bk)this.u.elementAt(Math.max(this.r, this.s));
            bk2.a(n3, n2, this.h - 10, n4);
            if (this.r != -1) {
                ((ay)bk2).a(this.q != -1);
            } else {
                ((bi)bk2).a(this.q != -1);
            }
        }
        for (int i2 = 0; i2 < this.u.size(); ++i2) {
            ((bk)this.u.elementAt(i2)).a();
        }
    }

    public final void a(int n2) {
        for (int i2 = 0; i2 < this.u.size(); ++i2) {
            bk bk2 = (bk)this.u.elementAt(i2);
            bk2.a(n2);
        }
    }

    public final int a(int n2, int n3) {
        if (n2 > this.f + this.h - 30 && n2 < this.f + this.h - 5 && n3 > this.g && n3 < this.g + 30) {
            return 0x20000000;
        }
        int n4 = 0;
        for (int i2 = 0; i2 < this.u.size(); ++i2) {
            bk bk2 = (bk)this.u.elementAt(i2);
            n4 = bk2.a(n2, n3);
            if (n4 == 0) continue;
            return n4;
        }
        return 0;
    }

    public final void a(Graphics graphics) {
        int n2;
        graphics.setClip(this.f, this.g, this.h, this.i);
        if (this.p) {
            graphics.setColor(this.k);
            graphics.fillRect(this.f, this.g, this.h, this.i);
        }
        int n3 = this.h / y.a.b + (this.h % y.a.b != 0 ? 1 : 0);
        graphics.setClip(this.f, this.g + 5, this.h, (int)y.a.c);
        for (n2 = 0; n2 < n3; ++n2) {
            graphics.drawImage(y.a.a, this.f + n2 * y.a.b, this.g + 5, 20);
        }
        graphics.setClip(this.f, this.g, this.h, this.i);
        graphics.drawImage(y.b.a, this.f + this.h - y.b.b - 5, this.g + 6, 20);
        if (this.m != null) {
            ca.a(graphics, this.m, this.n, this.o + (y.a.c - t.j) / 2, 0, this.l, 0);
        }
        graphics.setColor(11267556);
        graphics.drawLine(this.f, this.g + 6 + y.a.c, this.f + this.h - 1, this.g + 6 + y.a.c);
        for (n2 = 0; n2 < this.u.size(); ++n2) {
            ((bk)this.u.elementAt(n2)).a(graphics);
        }
        graphics.setClip(this.f, this.g, this.h, this.i);
        for (n2 = 0; n2 < this.j.length; ++n2) {
            graphics.setColor(this.j[n2]);
            graphics.drawRect(this.f + n2, this.g + n2, this.h - n2 * 2 - 1, this.i - n2 * 2 - 1);
        }
        graphics.drawImage(y.c.a, this.f, this.g, 20);
        graphics.drawImage(y.d.a, this.f, this.g + this.i - y.d.c, 20);
        graphics.drawImage(y.e.a, this.f + this.h - y.e.b, this.g + this.i - y.e.c, 20);
    }

    static {
        v = null;
    }
}


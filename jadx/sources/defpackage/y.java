package defpackage;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;

/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-8105993946875401281/classes.dex */
public final class y extends bk {
    public static bf a;
    public static bf b;
    public static bf c;
    public static bf d;
    public static bf e;
    private static y v = null;
    private String m;
    private int n;
    private int o;
    private int q;
    private int r;
    private int s;
    private int t;
    private int[] j = {20871, 1152942, 9820642, 20871, 1152942};
    private int k = 2780801;
    private int l = 16776917;
    private boolean p = true;
    private Vector u = new Vector();

    public static y c() {
        if (v == null) {
            v = new y();
        }
        return v;
    }

    @Override // defpackage.bk
    public final int a(int i, int i2) {
        if (i > (this.f + this.h) - 30 && i < (this.f + this.h) - 5 && i2 > this.g && i2 < this.g + 30) {
            return 536870912;
        }
        for (int i3 = 0; i3 < this.u.size(); i3++) {
            int iA = ((bk) this.u.elementAt(i3)).a(i, i2);
            if (iA != 0) {
                return iA;
            }
        }
        return 0;
    }

    @Override // defpackage.bk
    public final void a() {
    }

    @Override // defpackage.bk
    public final void a(int i) {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= this.u.size()) {
                return;
            }
            ((bk) this.u.elementAt(i3)).a(i);
            i2 = i3 + 1;
        }
    }

    public final void a(bk bkVar) {
        if (bkVar instanceof af) {
            this.u.insertElementAt(bkVar, 0);
        } else {
            this.u.addElement(bkVar);
        }
    }

    public final void a(String str) {
        this.m = str;
    }

    @Override // defpackage.bk
    public final void a(Graphics graphics) {
        graphics.setClip(this.f, this.g, this.h, this.i);
        if (this.p) {
            graphics.setColor(this.k);
            graphics.fillRect(this.f, this.g, this.h, this.i);
        }
        int i = (this.h / a.b) + (this.h % a.b != 0 ? 1 : 0);
        graphics.setClip(this.f, this.g + 5, this.h, a.c);
        for (int i2 = 0; i2 < i; i2++) {
            graphics.drawImage(a.a, this.f + (a.b * i2), this.g + 5, 20);
        }
        graphics.setClip(this.f, this.g, this.h, this.i);
        graphics.drawImage(b.a, ((this.f + this.h) - b.b) - 5, this.g + 6, 20);
        if (this.m != null) {
            ca.a(graphics, this.m, this.n, ((a.c - t.j) / 2) + this.o, 0, this.l, 0);
        }
        graphics.setColor(11267556);
        graphics.drawLine(this.f, this.g + 6 + a.c, (this.f + this.h) - 1, this.g + 6 + a.c);
        for (int i3 = 0; i3 < this.u.size(); i3++) {
            ((bk) this.u.elementAt(i3)).a(graphics);
        }
        graphics.setClip(this.f, this.g, this.h, this.i);
        for (int i4 = 0; i4 < this.j.length; i4++) {
            graphics.setColor(this.j[i4]);
            graphics.drawRect(this.f + i4, this.g + i4, (this.h - (i4 * 2)) - 1, (this.i - (i4 * 2)) - 1);
        }
        graphics.drawImage(c.a, this.f, this.g, 20);
        graphics.drawImage(d.a, this.f, (this.g + this.i) - d.c, 20);
        graphics.drawImage(e.a, (this.f + this.h) - e.b, (this.g + this.i) - e.c, 20);
    }

    @Override // defpackage.bk
    public final void b() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.u.size()) {
                this.u.removeAllElements();
                return;
            } else {
                ((bk) this.u.elementAt(i2)).b();
                i = i2 + 1;
            }
        }
    }

    public final void d() {
        if (this.m != null) {
            this.n = this.f + ((this.h - t.i.stringWidth(this.m)) / 2);
            this.o = this.g + 5;
        }
        this.t = -1;
        this.s = -1;
        this.r = -1;
        this.q = -1;
        for (int i = 0; i < this.u.size(); i++) {
            Object objElementAt = this.u.elementAt(i);
            if (objElementAt instanceof af) {
                this.q = i;
            } else if (objElementAt instanceof ay) {
                this.r = i;
            } else if (objElementAt instanceof bi) {
                this.s = i;
            } else if (objElementAt instanceof u) {
                this.t = i;
            }
        }
        int i2 = this.f + 5;
        int iE = this.g + 31;
        int iE2 = (this.i - 25) - 10;
        if (this.q != -1) {
            ((af) this.u.elementAt(this.q)).a(i2, iE, this.h - 10, 25);
            iE += r0.e() - 3;
            iE2 -= r0.e() - 3;
        }
        if (this.t != -1) {
            u uVar = (u) this.u.elementAt(this.t);
            uVar.a(this.f + 5, (this.g + this.i) - 30, this.h - 10, 26);
            iE2 -= uVar.e();
        }
        if (this.r != -1 && this.s != -1) {
            ay ayVar = (ay) this.u.elementAt(this.r);
            ayVar.a(i2, iE, this.h - 10, (iE2 << 2) / 7);
            ayVar.a(this.q != -1);
            int i3 = iE + ((iE2 << 2) / 7);
            int iE3 = iE2 - ayVar.e();
            bi biVar = (bi) this.u.elementAt(this.s);
            biVar.a(i2, i3, this.h - 10, iE3);
            biVar.a(this.q != -1);
        } else if (this.r != -1 || this.s != -1) {
            bk bkVar = (bk) this.u.elementAt(Math.max(this.r, this.s));
            bkVar.a(i2, iE, this.h - 10, iE2);
            if (this.r != -1) {
                ((ay) bkVar).a(this.q != -1);
            } else {
                ((bi) bkVar).a(this.q != -1);
            }
        }
        for (int i4 = 0; i4 < this.u.size(); i4++) {
            ((bk) this.u.elementAt(i4)).a();
        }
    }
}

package p000;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;

/* renamed from: y */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-4234804660425969496/classes.dex */
public final class C0093y extends AbstractC0038bk {

    /* renamed from: a */
    public static C0033bf f2569a;

    /* renamed from: b */
    public static C0033bf f2570b;

    /* renamed from: c */
    public static C0033bf f2571c;

    /* renamed from: d */
    public static C0033bf f2572d;

    /* renamed from: e */
    public static C0033bf f2573e;

    /* renamed from: v */
    private static C0093y f2574v = null;

    /* renamed from: m */
    private String f2578m;

    /* renamed from: n */
    private int f2579n;

    /* renamed from: o */
    private int f2580o;

    /* renamed from: q */
    private int f2582q;

    /* renamed from: r */
    private int f2583r;

    /* renamed from: s */
    private int f2584s;

    /* renamed from: t */
    private int f2585t;

    /* renamed from: j */
    private int[] f2575j = {20871, 1152942, 9820642, 20871, 1152942};

    /* renamed from: k */
    private int f2576k = 2780801;

    /* renamed from: l */
    private int f2577l = 16776917;

    /* renamed from: p */
    private boolean f2581p = true;

    /* renamed from: u */
    private Vector f2586u = new Vector();

    /* renamed from: c */
    public static C0093y m1711c() {
        if (f2574v == null) {
            f2574v = new C0093y();
        }
        return f2574v;
    }

    @Override // p000.AbstractC0038bk
    /* renamed from: a */
    public final int mo30a(int i, int i2) {
        if (i > (this.f676f + this.f678h) - 30 && i < (this.f676f + this.f678h) - 5 && i2 > this.f677g && i2 < this.f677g + 30) {
            return 536870912;
        }
        for (int i3 = 0; i3 < this.f2586u.size(); i3++) {
            int iMo30a = ((AbstractC0038bk) this.f2586u.elementAt(i3)).mo30a(i, i2);
            if (iMo30a != 0) {
                return iMo30a;
            }
        }
        return 0;
    }

    @Override // p000.AbstractC0038bk
    /* renamed from: a */
    public final void mo31a() {
    }

    @Override // p000.AbstractC0038bk
    /* renamed from: a */
    public final void mo32a(int i) {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= this.f2586u.size()) {
                return;
            }
            ((AbstractC0038bk) this.f2586u.elementAt(i3)).mo32a(i);
            i2 = i3 + 1;
        }
    }

    /* renamed from: a */
    public final void m1712a(AbstractC0038bk abstractC0038bk) {
        if (abstractC0038bk instanceof C0006af) {
            this.f2586u.insertElementAt(abstractC0038bk, 0);
        } else {
            this.f2586u.addElement(abstractC0038bk);
        }
    }

    /* renamed from: a */
    public final void m1713a(String str) {
        this.f2578m = str;
    }

    @Override // p000.AbstractC0038bk
    /* renamed from: a */
    public final void mo33a(Graphics graphics) {
        graphics.setClip(this.f676f, this.f677g, this.f678h, this.f679i);
        if (this.f2581p) {
            graphics.setColor(this.f2576k);
            graphics.fillRect(this.f676f, this.f677g, this.f678h, this.f679i);
        }
        int i = (this.f678h / f2569a.f599b) + (this.f678h % f2569a.f599b != 0 ? 1 : 0);
        graphics.setClip(this.f676f, this.f677g + 5, this.f678h, f2569a.f600c);
        for (int i2 = 0; i2 < i; i2++) {
            graphics.drawImage(f2569a.f598a, this.f676f + (f2569a.f599b * i2), this.f677g + 5, 20);
        }
        graphics.setClip(this.f676f, this.f677g, this.f678h, this.f679i);
        graphics.drawImage(f2570b.f598a, ((this.f676f + this.f678h) - f2570b.f599b) - 5, this.f677g + 6, 20);
        if (this.f2578m != null) {
            C0055ca.m1298a(graphics, this.f2578m, this.f2579n, ((f2569a.f600c - C0088t.f2524j) / 2) + this.f2580o, 0, this.f2577l, 0);
        }
        graphics.setColor(11267556);
        graphics.drawLine(this.f676f, this.f677g + 6 + f2569a.f600c, (this.f676f + this.f678h) - 1, this.f677g + 6 + f2569a.f600c);
        for (int i3 = 0; i3 < this.f2586u.size(); i3++) {
            ((AbstractC0038bk) this.f2586u.elementAt(i3)).mo33a(graphics);
        }
        graphics.setClip(this.f676f, this.f677g, this.f678h, this.f679i);
        for (int i4 = 0; i4 < this.f2575j.length; i4++) {
            graphics.setColor(this.f2575j[i4]);
            graphics.drawRect(this.f676f + i4, this.f677g + i4, (this.f678h - (i4 * 2)) - 1, (this.f679i - (i4 * 2)) - 1);
        }
        graphics.drawImage(f2571c.f598a, this.f676f, this.f677g, 20);
        graphics.drawImage(f2572d.f598a, this.f676f, (this.f677g + this.f679i) - f2572d.f600c, 20);
        graphics.drawImage(f2573e.f598a, (this.f676f + this.f678h) - f2573e.f599b, (this.f677g + this.f679i) - f2573e.f600c, 20);
    }

    @Override // p000.AbstractC0038bk
    /* renamed from: b */
    public final void mo34b() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f2586u.size()) {
                this.f2586u.removeAllElements();
                return;
            } else {
                ((AbstractC0038bk) this.f2586u.elementAt(i2)).mo34b();
                i = i2 + 1;
            }
        }
    }

    /* renamed from: d */
    public final void m1714d() {
        if (this.f2578m != null) {
            this.f2579n = this.f676f + ((this.f678h - C0088t.f2523i.stringWidth(this.f2578m)) / 2);
            this.f2580o = this.f677g + 5;
        }
        this.f2585t = -1;
        this.f2584s = -1;
        this.f2583r = -1;
        this.f2582q = -1;
        for (int i = 0; i < this.f2586u.size(); i++) {
            Object objElementAt = this.f2586u.elementAt(i);
            if (objElementAt instanceof C0006af) {
                this.f2582q = i;
            } else if (objElementAt instanceof C0025ay) {
                this.f2583r = i;
            } else if (objElementAt instanceof C0036bi) {
                this.f2584s = i;
            } else if (objElementAt instanceof C0089u) {
                this.f2585t = i;
            }
        }
        int i2 = this.f676f + 5;
        int iM691e = this.f677g + 31;
        int iM691e2 = (this.f679i - 25) - 10;
        if (this.f2582q != -1) {
            ((C0006af) this.f2586u.elementAt(this.f2582q)).m689a(i2, iM691e, this.f678h - 10, 25);
            iM691e += r0.m691e() - 3;
            iM691e2 -= r0.m691e() - 3;
        }
        if (this.f2585t != -1) {
            C0089u c0089u = (C0089u) this.f2586u.elementAt(this.f2585t);
            c0089u.m689a(this.f676f + 5, (this.f677g + this.f679i) - 30, this.f678h - 10, 26);
            iM691e2 -= c0089u.m691e();
        }
        if (this.f2583r != -1 && this.f2584s != -1) {
            C0025ay c0025ay = (C0025ay) this.f2586u.elementAt(this.f2583r);
            c0025ay.m689a(i2, iM691e, this.f678h - 10, (iM691e2 << 2) / 7);
            c0025ay.m611a(this.f2582q != -1);
            int i3 = iM691e + ((iM691e2 << 2) / 7);
            int iM691e3 = iM691e2 - c0025ay.m691e();
            C0036bi c0036bi = (C0036bi) this.f2586u.elementAt(this.f2584s);
            c0036bi.m689a(i2, i3, this.f678h - 10, iM691e3);
            c0036bi.m680a(this.f2582q != -1);
        } else if (this.f2583r != -1 || this.f2584s != -1) {
            AbstractC0038bk abstractC0038bk = (AbstractC0038bk) this.f2586u.elementAt(Math.max(this.f2583r, this.f2584s));
            abstractC0038bk.m689a(i2, iM691e, this.f678h - 10, iM691e2);
            if (this.f2583r != -1) {
                ((C0025ay) abstractC0038bk).m611a(this.f2582q != -1);
            } else {
                ((C0036bi) abstractC0038bk).m680a(this.f2582q != -1);
            }
        }
        for (int i4 = 0; i4 < this.f2586u.size(); i4++) {
            ((AbstractC0038bk) this.f2586u.elementAt(i4)).mo31a();
        }
    }
}

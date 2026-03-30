package defpackage;

import com.yinhan.kjava.main.a;
import javax.microedition.lcdui.Graphics;

/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-8105993946875401281/classes.dex */
public final class bi extends bk {
    private int a;
    private int b;
    private int c;
    private int d;
    private boolean e;
    private boolean j;
    private boolean k;
    private int l;
    private String m;
    private d[] n;

    public bi() {
    }

    public bi(String str) {
        this.m = str;
        this.j = true;
        this.k = false;
    }

    @Override // defpackage.bk
    public final int a(int i, int i2) {
        if (this.b > 0 && i >= (this.f + this.h) - 15 && i < this.f + this.h) {
            if (i2 >= this.g && i2 <= this.g + 20) {
                return 1;
            }
            if (i2 > (this.g + this.i) - 20 && i2 <= this.g + this.i) {
                return 4;
            }
        }
        return 0;
    }

    @Override // defpackage.bk
    public final void a() {
        this.b = 0;
        this.a = 0;
        if (this.m != null) {
            this.n = d.a(this.m, this.h - 6, t.i, '\t');
        }
        this.d = this.n == null ? 0 : this.n.length;
        this.l = t.j;
        for (int i = 0; i < this.d; i++) {
            if (this.n[i].a() > this.l) {
                this.l = this.n[i].a();
            }
        }
        this.c = (this.i - 6) / this.l;
        if (this.d > this.c) {
            this.n = d.a(this.m, (this.h - 6) - 12, t.i, '\t');
            this.d = this.n.length;
            this.b = Math.max(6, (this.c * ((this.i - 6) - 10)) / this.d);
        }
    }

    @Override // defpackage.bk
    public final void a(int i) {
        int i2 = this.j ? this.l : this.c * this.l;
        if (i == 1 || i == 514) {
            int i3 = (this.a - i2) % this.l;
            this.a = (i3 <= 0 ? 0 : this.l - i3) + (this.a - i2);
            this.a = Math.max(this.a, 0);
            return;
        }
        if (i == 4 || i == 520) {
            this.a = (i2 - (this.a % this.l)) + this.a;
            this.a = Math.min(this.a, Math.max(0, ((this.l * this.d) - this.i) + 6));
        }
    }

    @Override // defpackage.bk
    public final void a(Graphics graphics) {
        graphics.setClip(this.f, this.g, this.h, this.i);
        ca.a(graphics, this.f, this.g, this.h, this.i, 1);
        if (this.e) {
            ca.a(graphics);
        }
        graphics.setClip(this.f, this.g + 4, this.h, this.i - 6);
        int i = this.a / this.l;
        int iMin = Math.min(this.c + i + 2, this.d);
        int i2 = (this.g + 4) - (this.a - (this.l * i));
        while (i < iMin) {
            this.n[i].a(graphics, this.f + 4, i2, 20);
            i2 += this.l;
            i++;
        }
        if (this.b > 0) {
            graphics.setClip(this.f, this.g, this.h, this.i);
            ca.a(graphics, ((this.f + this.h) - 2) - a.C.b, this.g + 4, this.i - 6, this.b, this.a, this.d * this.l, this.i - 6);
        }
    }

    public final void a(boolean z) {
        this.e = z;
    }

    @Override // defpackage.bk
    public final void b() {
        this.m = null;
        this.n = null;
    }
}

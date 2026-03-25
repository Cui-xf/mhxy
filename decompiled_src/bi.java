/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import com.yinhan.kjava.main.a;
import javax.microedition.lcdui.Graphics;

public final class bi
extends bk {
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

    public bi(String string) {
        v0.m = string;
        this.j = true;
        this.k = false;
    }

    public final void a() {
        this.b = 0;
        this.a = 0;
        if (this.m != null) {
            this.n = d.a(this.m, this.h - 6, t.i, '\t');
        }
        this.d = this.n == null ? 0 : this.n.length;
        this.l = t.j;
        for (int i2 = 0; i2 < this.d; ++i2) {
            if (this.n[i2].a() <= this.l) continue;
            this.l = this.n[i2].a();
        }
        this.c = (this.i - 6) / this.l;
        if (this.d > this.c) {
            this.n = d.a(this.m, this.h - 6 - 12, t.i, '\t');
            this.d = this.n.length;
            this.b = Math.max(6, this.c * (this.i - 6 - 10) / this.d);
        }
    }

    public final void b() {
        this.m = null;
        this.n = null;
    }

    public final void a(boolean bl2) {
        this.e = bl2;
    }

    public final void a(int n2) {
        int n3;
        int n4 = n3 = this.j ? this.l : this.c * this.l;
        if (n2 == 1 || n2 == 514) {
            n2 = (this.a - n3) % this.l;
            this.a = this.a - n3 + (n2 <= 0 ? 0 : this.l - n2);
            this.a = Math.max(this.a, 0);
            return;
        }
        if (n2 == 4 || n2 == 520) {
            this.a += n3 - this.a % this.l;
            this.a = Math.min(this.a, Math.max(0, this.l * this.d - this.i + 6));
        }
    }

    public final int a(int n2, int n3) {
        if (this.b > 0 && n2 >= this.f + this.h - 15 && n2 < this.f + this.h) {
            if (n3 >= this.g && n3 <= this.g + 20) {
                return 1;
            }
            if (n3 > this.g + this.i - 20 && n3 <= this.g + this.i) {
                return 4;
            }
        }
        return 0;
    }

    public final void a(Graphics graphics) {
        graphics.setClip(this.f, this.g, this.h, this.i);
        ca.a(graphics, this.f, this.g, this.h, this.i, 1);
        if (this.e) {
            ca.a(graphics);
        }
        graphics.setClip(this.f, this.g + 4, this.h, this.i - 6);
        int n2 = this.a / this.l;
        int n3 = Math.min(n2 + this.c + 2, this.d);
        int n4 = this.g + 4 - (this.a - n2 * this.l);
        while (n2 < n3) {
            this.n[n2].a(graphics, this.f + 4, n4, 20);
            n4 += this.l;
            ++n2;
        }
        if (this.b > 0) {
            graphics.setClip(this.f, this.g, this.h, this.i);
            ca.a(graphics, this.f + this.h - 2 - com.yinhan.kjava.main.a.C.b, this.g + 4, this.i - 6, this.b, this.a, this.l * this.d, this.i - 6);
        }
    }
}


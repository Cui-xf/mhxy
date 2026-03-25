/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

public final class ay
extends bk {
    private boolean a;
    private int b;
    private int c;
    private int d;
    private int e;
    private a j;

    public final void a() {
        this.e = 0;
        this.b = 0;
        this.d = (this.i - 4) / 0;
        if (0 > this.d) {
            this.e = Math.max(6, this.d * (this.i - 6) / 0);
        }
    }

    public final void b() {
        this.j = null;
    }

    public final void a(boolean bl2) {
        this.a = bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(int n2) {
        if (n2 == 1 || n2 == 514) {
            n2 = this.b / 0;
            int n3 = (this.b + this.i - 6) / 0;
            if (this.c < n2 || this.c > n3) {
                this.c = n3;
                int cfr_ignored_0 = this.c + 1;
                this.b = 0 - this.i + 6;
                return;
            }
            if (this.c > 0) {
                --this.c;
            } else {
                this.c = -1;
                this.b = Math.max(this.i - 2, 0) - this.i + 6;
            }
            if (n2 < this.c) return;
            this.b = 0;
            return;
        }
        if (n2 != 4) {
            if (n2 != 520) return;
        }
        n2 = this.b / 0;
        int n4 = (this.b + this.i - 6) / 0;
        if (this.c < n2 || this.c > n4) {
            this.c = n2;
            this.b = 0;
            return;
        }
        if (this.c < -1) {
            ++this.c;
        } else {
            this.c = 0;
            this.b = 0;
        }
        int cfr_ignored_1 = this.c + 1;
        if (this.b + this.i - 6 >= 0) return;
        int cfr_ignored_2 = this.c + 1;
        this.b = 0 - this.i + 6;
    }

    public final int a(int n2, int n3) {
        if (this.b(n2, n3)) {
            null[1] = n3;
            if (this.e > 0 && n2 >= this.f + this.h - 15 && n2 < this.f + this.h) {
                if (n3 >= this.g && n3 <= this.g + 20) {
                    return 1;
                }
                if (n3 > this.g + this.i - 20 && n3 <= this.g + this.i) {
                    return 4;
                }
            }
            if ((n2 = (this.b + n3 - this.g) / 0) == this.c) {
                return 0x40000000;
            }
            this.c = n2;
        }
        return 0;
    }

    public final void a(Graphics graphics) {
        graphics.setClip(this.f, this.g, this.h, this.i);
        ca.a(graphics, this.f, this.g, this.h, this.i, 1);
        if (this.a) {
            ca.a(graphics);
        }
        int n2 = this.b / 0;
        Math.min(n2 + (this.i - 6) / 0 + 2, 0);
        graphics.setClip(this.f + 4, this.g + 3, this.h - 4, this.i - 6);
        if (this.e > 0) {
            graphics.setClip(this.f, this.g, this.h, this.i);
            ca.a(graphics, this.f + this.h - 2 - com.yinhan.kjava.main.a.C.b, this.g + 2, this.i - 4, this.e, this.b, 0, this.i - 6);
        }
    }
}


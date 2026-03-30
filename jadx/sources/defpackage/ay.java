package defpackage;

import com.yinhan.kjava.main.a;
import javax.microedition.lcdui.Graphics;

/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-8105993946875401281/classes.dex */
public final class ay extends bk {
    private boolean a;
    private int b;
    private int c;
    private int d;
    private int e;
    private a j;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bk
    public final int a(int i, int i2) {
        if (b(i, i2)) {
            Object[] objArr = 0;
            objArr[1] = i2;
            if (this.e > 0 && i >= (this.f + this.h) - 15 && i < this.f + this.h) {
                if (i2 >= this.g && i2 <= this.g + 20) {
                    return 1;
                }
                if (i2 > (this.g + this.i) - 20 && i2 <= this.g + this.i) {
                    return 4;
                }
            }
            int i3 = ((this.b + i2) - this.g) / 0;
            if (i3 == this.c) {
                return 1073741824;
            }
            this.c = i3;
        }
        return 0;
    }

    @Override // defpackage.bk
    public final void a() {
        this.e = 0;
        this.b = 0;
        this.d = (this.i - 4) / 0;
        if (this.d < 0) {
            this.e = Math.max(6, (this.d * (this.i - 6)) / 0);
        }
    }

    @Override // defpackage.bk
    public final void a(int i) {
        if (i == 1 || i == 514) {
            int i2 = this.b / 0;
            int i3 = ((this.b + this.i) - 6) / 0;
            if (this.c < i2 || this.c > i3) {
                this.c = i3;
                int i4 = this.c + 1;
                this.b = (0 - this.i) + 6;
                return;
            }
            if (this.c > 0) {
                this.c--;
            } else {
                this.c = -1;
                this.b = (Math.max(this.i - 2, 0) - this.i) + 6;
            }
            if (i2 >= this.c) {
                int i5 = this.c;
                this.b = 0;
                return;
            }
            return;
        }
        if (i == 4 || i == 520) {
            int i6 = this.b / 0;
            int i7 = ((this.b + this.i) - 6) / 0;
            if (this.c < i6 || this.c > i7) {
                this.c = i6;
                int i8 = this.c;
                this.b = 0;
                return;
            }
            if (this.c < -1) {
                this.c++;
            } else {
                this.c = 0;
                this.b = 0;
            }
            int i9 = (this.b + this.i) - 6;
            int i10 = this.c + 1;
            if (i9 < 0) {
                int i11 = this.c + 1;
                this.b = (0 - this.i) + 6;
            }
        }
    }

    @Override // defpackage.bk
    public final void a(Graphics graphics) {
        graphics.setClip(this.f, this.g, this.h, this.i);
        ca.a(graphics, this.f, this.g, this.h, this.i, 1);
        if (this.a) {
            ca.a(graphics);
        }
        Math.min((this.b / 0) + ((this.i - 6) / 0) + 2, 0);
        graphics.setClip(this.f + 4, this.g + 3, this.h - 4, this.i - 6);
        if (this.e > 0) {
            graphics.setClip(this.f, this.g, this.h, this.i);
            ca.a(graphics, ((this.f + this.h) - 2) - a.C.b, this.g + 2, this.i - 4, this.e, this.b, 0, this.i - 6);
        }
    }

    public final void a(boolean z) {
        this.a = z;
    }

    @Override // defpackage.bk
    public final void b() {
        this.j = null;
    }
}

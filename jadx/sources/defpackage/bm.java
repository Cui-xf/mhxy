package defpackage;

import javax.microedition.lcdui.Font;

/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-8105993946875401281/classes.dex */
public final class bm extends al {
    private String a;
    private String b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k = 268435200;
    private int l = 268435200;
    private Font m = t.i;
    private Font n = t.i;

    @Override // defpackage.al
    public final int b(int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i < this.c || i > this.c + this.e || i2 < this.d || i2 > this.d + this.f) {
            this.m = t.i;
            this.k = 16776960;
            z = false;
        } else {
            this.k = 16711680;
            this.m = t.h;
            z = true;
        }
        if (z) {
            return 268435456;
        }
        if (i < this.g || i > this.g + this.i || i2 < this.h || i2 > this.h + this.j) {
            this.n = t.i;
            this.l = 16776960;
            z2 = false;
        } else {
            this.l = 16711680;
            this.n = t.h;
        }
        return z2 ? 536870912 : 0;
    }

    @Override // defpackage.al
    public final void b(int i) {
    }

    @Override // defpackage.al
    public final void j() {
        this.a = null;
        this.b = null;
        this.m = null;
        this.n = null;
    }
}

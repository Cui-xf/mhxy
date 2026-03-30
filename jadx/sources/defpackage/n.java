package defpackage;

import java.lang.reflect.Array;
import javax.microedition.lcdui.Graphics;

/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-8105993946875401281/classes.dex */
public final class n extends al {
    public int b;
    private String[] c;
    private int e;
    private int f;
    private int g;
    private int h;
    private int[][] j;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private byte w;
    public byte a = 0;
    private byte d = 0;
    private boolean i = false;
    private int k = 0;
    private int t = 2152398;
    private int u = 2152398;
    private int v = 16449445;

    private int a() {
        int iStringWidth = 0;
        for (byte b = this.d; b <= this.a; b = (byte) (b + 1)) {
            iStringWidth += t.i.stringWidth(this.c[b]) + 10;
        }
        return iStringWidth;
    }

    public final void a(byte b) {
        this.w = b;
    }

    public final void a(int i, int i2, int i3, int i4) {
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.b = i4;
        this.h = 0;
        for (int i5 = 0; i5 < this.c.length; i5++) {
            this.h += t.i.stringWidth(this.c[i5]) + 10;
        }
        this.i = this.h > this.g + (-22);
    }

    public final void a(Graphics graphics) {
        int i;
        int i2 = 0;
        int iStringWidth = t.i.stringWidth(this.c[this.d]) + 10;
        this.k = 0;
        int i3 = this.d;
        while (true) {
            int i4 = i3;
            int i5 = iStringWidth;
            i = i2;
            if (i4 >= this.c.length || i5 > this.g - 22) {
                break;
            }
            int iStringWidth2 = t.i.stringWidth(this.c[i4]) + 10;
            this.k++;
            if (i4 == this.a) {
                ca.a(graphics, this.e + i, this.f, iStringWidth2 - 1, this.b, 1);
                ca.j[0] = this.e + i + 3;
                ca.j[1] = (this.f + this.b) - 3;
                ca.j[2] = iStringWidth2 - 6;
            } else {
                ca.a(graphics, this.e + i, this.f, iStringWidth2 - 1, this.b, 2);
            }
            ca.a(graphics, this.c[i4], ((iStringWidth2 - 1) / 2) + this.e + i, t.a(this.b) + this.f, 17, i4 == this.a ? this.v : 5426130);
            i2 = i + iStringWidth2;
            iStringWidth = i5 + (i4 < this.c.length + (-1) ? t.i.stringWidth(this.c[i4 + 1]) + 10 : 0);
            i3 = i4 + 1;
        }
        String[] strArr = this.c;
        byte b = this.d;
        int i6 = this.e + 1;
        int i7 = this.f + 2;
        int iStringWidth3 = 0;
        for (int i8 = 0; i8 < strArr.length; i8++) {
            if (i8 < b || i8 >= this.k + b) {
                this.j[i8][0] = -1;
                this.j[i8][1] = -1;
                this.j[i8][2] = -1;
                this.j[i8][3] = -1;
            } else {
                int iStringWidth4 = t.i.stringWidth(this.c[i8]) + 10;
                this.j[i8][0] = i6 + iStringWidth3;
                this.j[i8][1] = i7;
                this.j[i8][2] = iStringWidth4 - 2;
                this.j[i8][3] = t.j - 2;
                iStringWidth3 += t.i.stringWidth(this.c[i8]) + 10;
            }
        }
        if (this.i) {
            graphics.setColor(ca.c);
            graphics.fillRect(this.e + i + 1, this.f + 2, 19, t.j - 2);
            graphics.setColor(ca.i);
            graphics.drawRect(this.e + i, this.f + 1, 19, t.j - 2);
            int i9 = this.e + i + 1;
            int i10 = this.f + 1;
            int i11 = t.j - 2;
            this.l = i9;
            this.m = i10;
            this.n = 9;
            this.o = i11;
            int i12 = this.e + i + 11;
            int i13 = this.f + 1;
            int i14 = t.j - 2;
            this.p = i12;
            this.q = i13;
            this.r = 9;
            this.s = i14;
            ca.b(graphics, this.a == 0 ? 2780801 : this.t, this.e + i + 3, (t.j / 2) + this.f, 6, 1);
            ca.b(graphics, this.a == this.c.length + (-1) ? 2780801 : this.u, this.e + i + 16, (t.j / 2) + this.f, -6, 1);
        }
    }

    public final void a(String[] strArr) {
        this.c = strArr;
        this.w = (byte) 0;
        this.a = (byte) 0;
        this.d = (byte) 0;
        if (this.c == null) {
            this.j = null;
        } else {
            this.j = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, this.c.length, 4);
        }
    }

    @Override // defpackage.al
    public final int b(int i, int i2) {
        boolean z;
        if (this.j != null) {
            for (int i3 = 0; i3 < this.j.length; i3++) {
                if (i >= this.j[i3][0] && i <= this.j[i3][0] + this.j[i3][2] && i2 >= this.j[i3][1] && i2 <= this.j[i3][1] + this.j[i3][3]) {
                    if (i3 + 1 >= this.j.length) {
                        this.a = (byte) 0;
                    } else {
                        this.a = (byte) (i3 + 1);
                    }
                    z = true;
                }
            }
            z = false;
        } else {
            z = false;
        }
        if (z) {
            return this.w == 0 ? 8 : 1024;
        }
        if (this.i && i >= this.l && i <= this.l + this.n && i2 >= this.m && i2 <= this.m + this.o) {
            return this.w == 0 ? 8 : 1024;
        }
        if (this.i && i >= this.p && i <= this.p + this.r && i2 >= this.q && i2 <= this.q + this.s) {
            return this.w == 0 ? 2 : 2048;
        }
        return 0;
    }

    @Override // defpackage.al
    public final void b(int i) {
        byte b;
        int length;
        if ((this.w == 0 && (i == 8 || i == 516)) || (this.w == 1 && i == 1024)) {
            if (this.a <= 0) {
                length = this.c.length - 1;
            } else {
                byte b2 = (byte) (this.a - 1);
                this.a = b2;
                length = b2;
            }
            this.a = (byte) length;
            while (this.i && this.d > this.a) {
                this.d = (byte) (this.d - 1);
            }
            if (this.d < this.a && a() > this.g - 22 && this.i) {
                this.d = (byte) (this.d + 1);
            }
        } else if ((this.w == 0 && (i == 2 || i == 518)) || (this.w == 1 && i == 2048)) {
            if (this.a >= this.c.length - 1) {
                b = 0;
            } else {
                b = (byte) (this.a + 1);
                this.a = b;
            }
            this.a = b;
            if (this.d < this.a && a() > this.g - 22 && this.i) {
                this.d = (byte) (this.d + 1);
            }
            while (this.i && this.d > this.a) {
                this.d = (byte) (this.d - 1);
            }
        }
        while (this.d > 0 && a() < this.g - 22 && this.i) {
            this.d = (byte) (this.d - 1);
        }
        while (this.d < this.a && a() > this.g - 22 && this.i) {
            this.d = (byte) (this.d + 1);
        }
        if (this.i || this.d == 0) {
            return;
        }
        this.d = (byte) 0;
    }

    @Override // defpackage.al
    public final void j() {
        if (this.c != null) {
            for (byte b = 0; b < this.c.length; b = (byte) (b + 1)) {
                this.c[b] = null;
            }
            this.c = null;
        }
        this.j = null;
    }
}

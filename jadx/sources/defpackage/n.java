package defpackage;

import javax.microedition.lcdui.Graphics;

/* loaded from: java版梦回西游3区251011.jar:n.class */
public final class n extends al {
    private String[] c;
    private int e;
    private int f;
    private int g;
    public int b;
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

    public final void a(String[] strArr) {
        this.c = strArr;
        this.w = (byte) 0;
        this.a = (byte) 0;
        this.d = (byte) 0;
        if (this.c != null) {
            this.j = new int[this.c.length][4];
        } else {
            this.j = null;
        }
    }

    public final void a(int i, int i2, int i3, int i4) {
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.b = i4;
        this.h = 0;
        for (int i5 = 0; i5 < this.c.length; i5++) {
            this.h += 10 + t.i.stringWidth(this.c[i5]);
        }
        this.i = this.h > this.g - 22;
    }

    private int a() {
        int iStringWidth = 0;
        byte b = this.d;
        while (true) {
            byte b2 = b;
            if (b2 > this.a) {
                return iStringWidth;
            }
            iStringWidth += 10 + t.i.stringWidth(this.c[b2]);
            b = (byte) (b2 + 1);
        }
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
                length = b2;
                this.a = b2;
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
                byte b3 = (byte) (this.a + 1);
                b = b3;
                this.a = b3;
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

    public final void a(Graphics graphics) {
        int i = 0;
        int iStringWidth = 10 + t.i.stringWidth(this.c[this.d]);
        this.k = 0;
        int i2 = this.d;
        while (i2 < this.c.length && iStringWidth <= this.g - 22) {
            int iStringWidth2 = 10 + t.i.stringWidth(this.c[i2]);
            this.k++;
            if (i2 == this.a) {
                ca.a(graphics, this.e + i, this.f, iStringWidth2 - 1, this.b, 1);
                ca.j[0] = this.e + i + 3;
                ca.j[1] = (this.f + this.b) - 3;
                ca.j[2] = iStringWidth2 - 6;
            } else {
                ca.a(graphics, this.e + i, this.f, iStringWidth2 - 1, this.b, 2);
            }
            ca.a(graphics, this.c[i2], this.e + i + ((iStringWidth2 - 1) / 2), this.f + t.a(this.b), 17, i2 == this.a ? this.v : 5426130);
            i += iStringWidth2;
            iStringWidth += i2 < this.c.length - 1 ? 10 + t.i.stringWidth(this.c[i2 + 1]) : 0;
            i2++;
        }
        String[] strArr = this.c;
        int i3 = this.d;
        int i4 = this.e + 1;
        int i5 = this.f + 2;
        int iStringWidth3 = 0;
        for (int i6 = 0; i6 < strArr.length; i6++) {
            if (i6 < i3 || i6 >= i3 + this.k) {
                this.j[i6][0] = -1;
                this.j[i6][1] = -1;
                this.j[i6][2] = -1;
                this.j[i6][3] = -1;
            } else {
                int iStringWidth4 = 10 + t.i.stringWidth(this.c[i6]);
                this.j[i6][0] = i4 + iStringWidth3;
                this.j[i6][1] = i5;
                this.j[i6][2] = iStringWidth4 - 2;
                this.j[i6][3] = t.j - 2;
                iStringWidth3 += 10 + t.i.stringWidth(this.c[i6]);
            }
        }
        if (this.i) {
            graphics.setColor(ca.c);
            graphics.fillRect(this.e + i + 1, this.f + 2, 19, t.j - 2);
            graphics.setColor(ca.i);
            graphics.drawRect(this.e + i, this.f + 1, 19, t.j - 2);
            int i7 = this.e + i + 1;
            int i8 = this.f + 1;
            int i9 = t.j - 2;
            this.l = i7;
            this.m = i8;
            this.n = 9;
            this.o = i9;
            int i10 = this.e + i + 11;
            int i11 = this.f + 1;
            int i12 = t.j - 2;
            this.p = i10;
            this.q = i11;
            this.r = 9;
            this.s = i12;
            ca.b(graphics, this.a == 0 ? 2780801 : this.t, this.e + i + 3, this.f + (t.j / 2), 6, 1);
            ca.b(graphics, this.a == this.c.length - 1 ? 2780801 : this.u, this.e + i + 16, this.f + (t.j / 2), -6, 1);
        }
    }

    @Override // defpackage.al
    public final void j() {
        if (this.c != null) {
            byte b = 0;
            while (true) {
                byte b2 = b;
                if (b2 >= this.c.length) {
                    break;
                }
                this.c[b2] = null;
                b = (byte) (b2 + 1);
            }
            this.c = null;
        }
        this.j = null;
    }

    public final void a(byte b) {
        this.w = b;
    }
}

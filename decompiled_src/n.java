/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

public final class n
extends al {
    private String[] c;
    public byte a = 0;
    private byte d = 0;
    private int e;
    private int f;
    private int g;
    public int b;
    private int h;
    private boolean i = false;
    private int[][] j;
    private int k = 0;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t = 2152398;
    private int u = 2152398;
    private int v = 0xFAFFA5;
    private byte w;

    public final void a(String[] object) {
        this.c = object;
        byte by2 = 0;
        object = this;
        this.w = by2;
        this.a = 0;
        this.d = 0;
        if (this.c != null) {
            this.j = new int[this.c.length][4];
            return;
        }
        this.j = null;
    }

    public final void a(int n2, int n3, int n4, int n5) {
        this.e = n2;
        this.f = n3;
        this.g = n4;
        this.b = n5;
        this.h = 0;
        for (n2 = 0; n2 < this.c.length; ++n2) {
            this.h += 10 + t.i.stringWidth(this.c[n2]);
        }
        this.i = this.h > this.g - 22;
    }

    private int a() {
        int n2 = 0;
        for (byte by2 = this.d; by2 <= this.a; by2 = (byte)(by2 + 1)) {
            n2 += 10 + t.i.stringWidth(this.c[by2]);
        }
        return n2;
    }

    public final void b(int n2) {
        if (this.w == 0 && (n2 == 8 || n2 == 516) || this.w == 1 && n2 == 1024) {
            int n3;
            if (this.a <= 0) {
                n3 = this.c.length - 1;
            } else {
                byte by2 = (byte)(this.a - 1);
                n3 = by2;
                this.a = by2;
            }
            this.a = (byte)n3;
            while (this.i && this.d > this.a) {
                this.d = (byte)(this.d - 1);
            }
            if (this.d < this.a && this.a() > this.g - 22 && this.i) {
                this.d = (byte)(this.d + 1);
            }
        } else if (this.w == 0 && (n2 == 2 || n2 == 518) || this.w == 1 && n2 == 2048) {
            byte by3 = this.a = this.a >= this.c.length - 1 ? (byte)0 : (this.a = (byte)(this.a + 1));
            if (this.d < this.a && this.a() > this.g - 22 && this.i) {
                this.d = (byte)(this.d + 1);
            }
            while (this.i && this.d > this.a) {
                this.d = (byte)(this.d - 1);
            }
        }
        while (this.d > 0 && this.a() < this.g - 22 && this.i) {
            this.d = (byte)(this.d - 1);
        }
        while (this.d < this.a && this.a() > this.g - 22 && this.i) {
            this.d = (byte)(this.d + 1);
        }
        if (!this.i && this.d != 0) {
            this.d = 0;
        }
    }

    public final int b(int n2, int n3) {
        boolean bl2;
        int n4 = n3;
        int n5 = n2;
        n n6 = this;
        if (n6.j != null) {
            for (int i2 = 0; i2 < n6.j.length; ++i2) {
                if (n5 < n6.j[i2][0] || n5 > n6.j[i2][0] + n6.j[i2][2] || n4 < n6.j[i2][1] || n4 > n6.j[i2][1] + n6.j[i2][3]) continue;
                n6.a = i2 + 1 >= n6.j.length ? (byte)0 : (byte)(i2 + 1);
                bl2 = true;
                break;
            }
        } else {
            bl2 = false;
        }
        if (bl2) {
            if (this.w == 0) {
                return 8;
            }
            return 1024;
        }
        n4 = n3;
        n5 = n2;
        n6 = this;
        if (n6.i && n5 >= n6.l && n5 <= n6.l + n6.n && n4 >= n6.m && n4 <= n6.m + n6.o) {
            if (this.w == 0) {
                return 8;
            }
            return 1024;
        }
        n4 = n3;
        n5 = n2;
        n6 = this;
        if (n6.i && n5 >= n6.p && n5 <= n6.p + n6.r && n4 >= n6.q && n4 <= n6.q + n6.s) {
            if (this.w == 0) {
                return 2;
            }
            return 2048;
        }
        return 0;
    }

    public final void a(Graphics graphics) {
        int n2;
        int n3 = 0;
        int n4 = 10 + t.i.stringWidth(this.c[this.d]);
        this.k = 0;
        for (int i2 = this.d; i2 < this.c.length && n4 <= this.g - 22; n4 += i2 < this.c.length - 1 ? 10 + t.i.stringWidth(this.c[i2 + 1]) : 0, ++i2) {
            n2 = 10 + t.i.stringWidth(this.c[i2]);
            ++this.k;
            if (i2 == this.a) {
                ca.a(graphics, this.e + n3, this.f, n2 - 1, this.b, 1);
                ca.j[0] = this.e + n3 + 3;
                ca.j[1] = this.f + this.b - 3;
                ca.j[2] = n2 - 6;
            } else {
                ca.a(graphics, this.e + n3, this.f, n2 - 1, this.b, 2);
            }
            ca.a(graphics, this.c[i2], this.e + n3 + (n2 - 1) / 2, this.f + t.a(this.b), 17, i2 == this.a ? this.v : 5426130);
            n3 += n2;
        }
        int n5 = this.f + 2;
        int n6 = this.e + 1;
        n2 = this.d;
        String[] stringArray = this.c;
        n n7 = this;
        int n8 = 0;
        for (int i3 = 0; i3 < stringArray.length; ++i3) {
            if (i3 >= n2 && i3 < n2 + n7.k) {
                int n9 = 10 + t.i.stringWidth(n7.c[i3]);
                n7.j[i3][0] = n6 + n8;
                n7.j[i3][1] = n5;
                n7.j[i3][2] = n9 - 2;
                n7.j[i3][3] = t.j - 2;
                n8 += 10 + t.i.stringWidth(n7.c[i3]);
                continue;
            }
            n7.j[i3][0] = -1;
            n7.j[i3][1] = -1;
            n7.j[i3][2] = -1;
            n7.j[i3][3] = -1;
        }
        if (this.i) {
            graphics.setColor(ca.c);
            graphics.fillRect(this.e + n3 + 1, this.f + 2, 19, t.j - 2);
            graphics.setColor(ca.i);
            graphics.drawRect(this.e + n3, this.f + 1, 19, t.j - 2);
            n5 = t.j - 2;
            n6 = 9;
            n2 = this.f + 1;
            int n10 = this.e + n3 + 1;
            n7 = this;
            this.l = n10;
            n7.m = n2;
            n7.n = 9;
            n7.o = n5;
            n5 = t.j - 2;
            n6 = 9;
            n2 = this.f + 1;
            n10 = this.e + n3 + 11;
            n7 = this;
            this.p = n10;
            n7.q = n2;
            n7.r = 9;
            n7.s = n5;
            ca.b(graphics, this.a == 0 ? 2780801 : this.t, this.e + n3 + 3, this.f + t.j / 2, 6, 1);
            ca.b(graphics, this.a == this.c.length - 1 ? 2780801 : this.u, this.e + n3 + 16, this.f + t.j / 2, -6, 1);
        }
    }

    public final void j() {
        if (this.c != null) {
            for (int n2 = 0; n2 < this.c.length; n2 = (int)((byte)(n2 + 1))) {
                this.c[n2] = null;
            }
            this.c = null;
        }
        this.j = null;
    }

    public final void a(byte by2) {
        this.w = by2;
    }
}


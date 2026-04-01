package p000;

import java.lang.reflect.Array;
import javax.microedition.lcdui.Graphics;

/* renamed from: n */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-4234804660425969496/classes.dex */
public final class C0082n extends AbstractC0012al {

    /* renamed from: b */
    public int f2354b;

    /* renamed from: c */
    private String[] f2355c;

    /* renamed from: e */
    private int f2357e;

    /* renamed from: f */
    private int f2358f;

    /* renamed from: g */
    private int f2359g;

    /* renamed from: h */
    private int f2360h;

    /* renamed from: j */
    private int[][] f2362j;

    /* renamed from: l */
    private int f2364l;

    /* renamed from: m */
    private int f2365m;

    /* renamed from: n */
    private int f2366n;

    /* renamed from: o */
    private int f2367o;

    /* renamed from: p */
    private int f2368p;

    /* renamed from: q */
    private int f2369q;

    /* renamed from: r */
    private int f2370r;

    /* renamed from: s */
    private int f2371s;

    /* renamed from: w */
    private byte f2375w;

    /* renamed from: a */
    public byte f2353a = 0;

    /* renamed from: d */
    private byte f2356d = 0;

    /* renamed from: i */
    private boolean f2361i = false;

    /* renamed from: k */
    private int f2363k = 0;

    /* renamed from: t */
    private int f2372t = 2152398;

    /* renamed from: u */
    private int f2373u = 2152398;

    /* renamed from: v */
    private int f2374v = 16449445;

    /* renamed from: a */
    private int m1606a() {
        int iStringWidth = 0;
        for (byte b = this.f2356d; b <= this.f2353a; b = (byte) (b + 1)) {
            iStringWidth += C0088t.f2523i.stringWidth(this.f2355c[b]) + 10;
        }
        return iStringWidth;
    }

    /* renamed from: a */
    public final void m1607a(byte b) {
        this.f2375w = b;
    }

    /* renamed from: a */
    public final void m1608a(int i, int i2, int i3, int i4) {
        this.f2357e = i;
        this.f2358f = i2;
        this.f2359g = i3;
        this.f2354b = i4;
        this.f2360h = 0;
        for (int i5 = 0; i5 < this.f2355c.length; i5++) {
            this.f2360h += C0088t.f2523i.stringWidth(this.f2355c[i5]) + 10;
        }
        this.f2361i = this.f2360h > this.f2359g + (-22);
    }

    /* renamed from: a */
    public final void m1609a(Graphics graphics) {
        int i;
        int i2 = 0;
        int iStringWidth = C0088t.f2523i.stringWidth(this.f2355c[this.f2356d]) + 10;
        this.f2363k = 0;
        int i3 = this.f2356d;
        while (true) {
            int i4 = i3;
            int i5 = iStringWidth;
            i = i2;
            if (i4 >= this.f2355c.length || i5 > this.f2359g - 22) {
                break;
            }
            int iStringWidth2 = C0088t.f2523i.stringWidth(this.f2355c[i4]) + 10;
            this.f2363k++;
            if (i4 == this.f2353a) {
                C0055ca.m1292a(graphics, this.f2357e + i, this.f2358f, iStringWidth2 - 1, this.f2354b, 1);
                C0055ca.f1890j[0] = this.f2357e + i + 3;
                C0055ca.f1890j[1] = (this.f2358f + this.f2354b) - 3;
                C0055ca.f1890j[2] = iStringWidth2 - 6;
            } else {
                C0055ca.m1292a(graphics, this.f2357e + i, this.f2358f, iStringWidth2 - 1, this.f2354b, 2);
            }
            C0055ca.m1297a(graphics, this.f2355c[i4], ((iStringWidth2 - 1) / 2) + this.f2357e + i, C0088t.m1674a(this.f2354b) + this.f2358f, 17, i4 == this.f2353a ? this.f2374v : 5426130);
            i2 = i + iStringWidth2;
            iStringWidth = i5 + (i4 < this.f2355c.length + (-1) ? C0088t.f2523i.stringWidth(this.f2355c[i4 + 1]) + 10 : 0);
            i3 = i4 + 1;
        }
        String[] strArr = this.f2355c;
        byte b = this.f2356d;
        int i6 = this.f2357e + 1;
        int i7 = this.f2358f + 2;
        int iStringWidth3 = 0;
        for (int i8 = 0; i8 < strArr.length; i8++) {
            if (i8 < b || i8 >= this.f2363k + b) {
                this.f2362j[i8][0] = -1;
                this.f2362j[i8][1] = -1;
                this.f2362j[i8][2] = -1;
                this.f2362j[i8][3] = -1;
            } else {
                int iStringWidth4 = C0088t.f2523i.stringWidth(this.f2355c[i8]) + 10;
                this.f2362j[i8][0] = i6 + iStringWidth3;
                this.f2362j[i8][1] = i7;
                this.f2362j[i8][2] = iStringWidth4 - 2;
                this.f2362j[i8][3] = C0088t.f2524j - 2;
                iStringWidth3 += C0088t.f2523i.stringWidth(this.f2355c[i8]) + 10;
            }
        }
        if (this.f2361i) {
            graphics.setColor(C0055ca.f1883c);
            graphics.fillRect(this.f2357e + i + 1, this.f2358f + 2, 19, C0088t.f2524j - 2);
            graphics.setColor(C0055ca.f1889i);
            graphics.drawRect(this.f2357e + i, this.f2358f + 1, 19, C0088t.f2524j - 2);
            int i9 = this.f2357e + i + 1;
            int i10 = this.f2358f + 1;
            int i11 = C0088t.f2524j - 2;
            this.f2364l = i9;
            this.f2365m = i10;
            this.f2366n = 9;
            this.f2367o = i11;
            int i12 = this.f2357e + i + 11;
            int i13 = this.f2358f + 1;
            int i14 = C0088t.f2524j - 2;
            this.f2368p = i12;
            this.f2369q = i13;
            this.f2370r = 9;
            this.f2371s = i14;
            C0055ca.m1320b(graphics, this.f2353a == 0 ? 2780801 : this.f2372t, this.f2357e + i + 3, (C0088t.f2524j / 2) + this.f2358f, 6, 1);
            C0055ca.m1320b(graphics, this.f2353a == this.f2355c.length + (-1) ? 2780801 : this.f2373u, this.f2357e + i + 16, (C0088t.f2524j / 2) + this.f2358f, -6, 1);
        }
    }

    /* renamed from: a */
    public final void m1610a(String[] strArr) {
        this.f2355c = strArr;
        this.f2375w = (byte) 0;
        this.f2353a = (byte) 0;
        this.f2356d = (byte) 0;
        if (this.f2355c == null) {
            this.f2362j = null;
        } else {
            this.f2362j = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, this.f2355c.length, 4);
        }
    }

    @Override // p000.AbstractC0012al
    /* renamed from: b */
    public final int mo69b(int i, int i2) {
        boolean z;
        if (this.f2362j != null) {
            for (int i3 = 0; i3 < this.f2362j.length; i3++) {
                if (i >= this.f2362j[i3][0] && i <= this.f2362j[i3][0] + this.f2362j[i3][2] && i2 >= this.f2362j[i3][1] && i2 <= this.f2362j[i3][1] + this.f2362j[i3][3]) {
                    if (i3 + 1 >= this.f2362j.length) {
                        this.f2353a = (byte) 0;
                    } else {
                        this.f2353a = (byte) (i3 + 1);
                    }
                    z = true;
                }
            }
            z = false;
        } else {
            z = false;
        }
        if (z) {
            return this.f2375w == 0 ? 8 : 1024;
        }
        if (this.f2361i && i >= this.f2364l && i <= this.f2364l + this.f2366n && i2 >= this.f2365m && i2 <= this.f2365m + this.f2367o) {
            return this.f2375w == 0 ? 8 : 1024;
        }
        if (this.f2361i && i >= this.f2368p && i <= this.f2368p + this.f2370r && i2 >= this.f2369q && i2 <= this.f2369q + this.f2371s) {
            return this.f2375w == 0 ? 2 : 2048;
        }
        return 0;
    }

    @Override // p000.AbstractC0012al
    /* renamed from: b */
    public final void mo70b(int i) {
        byte b;
        int length;
        if ((this.f2375w == 0 && (i == 8 || i == 516)) || (this.f2375w == 1 && i == 1024)) {
            if (this.f2353a <= 0) {
                length = this.f2355c.length - 1;
            } else {
                byte b2 = (byte) (this.f2353a - 1);
                this.f2353a = b2;
                length = b2;
            }
            this.f2353a = (byte) length;
            while (this.f2361i && this.f2356d > this.f2353a) {
                this.f2356d = (byte) (this.f2356d - 1);
            }
            if (this.f2356d < this.f2353a && m1606a() > this.f2359g - 22 && this.f2361i) {
                this.f2356d = (byte) (this.f2356d + 1);
            }
        } else if ((this.f2375w == 0 && (i == 2 || i == 518)) || (this.f2375w == 1 && i == 2048)) {
            if (this.f2353a >= this.f2355c.length - 1) {
                b = 0;
            } else {
                b = (byte) (this.f2353a + 1);
                this.f2353a = b;
            }
            this.f2353a = b;
            if (this.f2356d < this.f2353a && m1606a() > this.f2359g - 22 && this.f2361i) {
                this.f2356d = (byte) (this.f2356d + 1);
            }
            while (this.f2361i && this.f2356d > this.f2353a) {
                this.f2356d = (byte) (this.f2356d - 1);
            }
        }
        while (this.f2356d > 0 && m1606a() < this.f2359g - 22 && this.f2361i) {
            this.f2356d = (byte) (this.f2356d - 1);
        }
        while (this.f2356d < this.f2353a && m1606a() > this.f2359g - 22 && this.f2361i) {
            this.f2356d = (byte) (this.f2356d + 1);
        }
        if (this.f2361i || this.f2356d == 0) {
            return;
        }
        this.f2356d = (byte) 0;
    }

    @Override // p000.AbstractC0012al
    /* renamed from: j */
    public final void mo71j() {
        if (this.f2355c != null) {
            for (byte b = 0; b < this.f2355c.length; b = (byte) (b + 1)) {
                this.f2355c[b] = null;
            }
            this.f2355c = null;
        }
        this.f2362j = null;
    }
}

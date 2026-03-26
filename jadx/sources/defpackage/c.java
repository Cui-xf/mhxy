package defpackage;

import com.yinhan.kjava.main.a;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* loaded from: java版梦回西游3区251011.jar:c.class */
public final class c extends al {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private short m;
    private short n;
    private short o;
    private String p;
    private String q;
    private Image[] r;
    private String[] s;
    private String[] t;
    private String[] u;
    private short[] v;
    private short[] w;
    private byte y;
    private byte z;
    private boolean C;
    private int[] x = null;
    private byte A = 0;
    private boolean B = true;
    private boolean D = false;
    private boolean E = false;

    public final void a(String[] strArr, String[] strArr2, String[] strArr3) {
        a((Image[]) null, strArr, (short[]) null, (String[]) null, strArr3);
    }

    public final void a(Image[] imageArr, String[] strArr, String[] strArr2, String[] strArr3) {
        a(imageArr, strArr, (short[]) null, strArr2, strArr3);
    }

    private void a(Image[] imageArr, String[] strArr, short[] sArr, String[] strArr2, String[] strArr3) {
        j();
        this.r = imageArr;
        this.s = strArr;
        this.t = strArr2;
        this.u = strArr3;
        this.v = null;
        this.C = true;
        this.D = false;
        this.e = 0;
        this.f = 0;
        this.z = (byte) 0;
        this.i = t.j;
        this.h = strArr == null ? 0 : strArr.length;
        this.g = Math.min(this.h + this.z, (this.d - 8) / this.i);
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final int e() {
        return this.i;
    }

    public final int f() {
        return this.g;
    }

    public final int g() {
        return this.f;
    }

    public final int h() {
        return this.e;
    }

    public final int i() {
        return this.f - this.e;
    }

    public final void a(boolean z) {
        this.E = z;
    }

    public final void a(Image[] imageArr) {
        this.r = imageArr;
    }

    public final void b(boolean z) {
        this.C = false;
    }

    public final void a(String str) {
        this.p = str;
        this.z = (byte) 1;
    }

    public final void a(String str, int i) {
        ca.l = 0;
        this.q = str;
        this.y = (byte) i;
    }

    public final void a(int i) {
        this.f = i;
        this.g = Math.min(this.h + this.z, (this.d - 8) / this.i);
        while (this.e < this.f && (this.f - this.e) + 1 > this.g) {
            this.e++;
        }
        if (this.e > this.h || this.f > this.h) {
            this.e = 0;
            this.f = 0;
        }
    }

    public final void a(int i, int i2) {
        this.e = i;
        this.f = i2;
        if (this.f == (this.h - 1) + this.z) {
            this.e = Math.max(0, (this.f - this.g) + 1);
        }
        if (this.e > this.h || this.f > this.h) {
            this.e = 0;
            this.f = 0;
        }
    }

    public final void a(short[] sArr) {
        this.v = sArr;
    }

    public final void b(short[] sArr) {
        this.w = sArr;
    }

    public final void a(int[] iArr) {
        this.x = iArr;
    }

    public final void a(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    @Override // defpackage.al
    public final void b(int i) {
        int length;
        int i2;
        int i3;
        if (i == 1 || i == 514) {
            if (this.s != null) {
                if (this.f <= 0) {
                    length = (this.s.length - 1) + this.z;
                } else {
                    int i4 = this.f - 1;
                    length = i4;
                    this.f = i4;
                }
                this.f = length;
                if (this.e > 0 && this.e + this.z > this.f) {
                    this.e--;
                }
                if (this.f == (this.s.length - 1) + this.z) {
                    this.e = (this.f - this.g) + 1;
                }
            }
            this.B = true;
            return;
        }
        if (i == 4 || i == 520) {
            if (this.s != null) {
                if (this.f >= (this.s.length - 1) + this.z) {
                    i2 = 0;
                } else {
                    int i5 = this.f + 1;
                    i2 = i5;
                    this.f = i5;
                }
                this.f = i2;
                if (this.f - this.e >= this.g) {
                    int i6 = this.e + 1;
                    i3 = i6;
                    this.e = i6;
                } else {
                    i3 = this.f == 0 ? 0 : this.e;
                }
                this.e = i3;
            }
            this.B = true;
        }
    }

    @Override // defpackage.al
    public final int b(int i, int i2) {
        if (i >= ((this.a + this.c) - 2) - a.C.b && i <= this.a + this.c && i2 >= this.b + 3 && i2 <= this.b + 3 + a.C.c) {
            return 1;
        }
        if (i >= ((this.a + this.c) - 2) - a.D.b && i <= this.a + this.c && i2 >= ((this.b + this.d) - 2) - a.D.c && i2 <= this.b + this.d) {
            return 4;
        }
        for (int i3 = 0; i3 < this.g; i3++) {
            if (i > this.a + 4 && i < (this.a + this.c) - 8 && i2 > this.b + 4 + (i3 * this.i) && i2 < this.b + 4 + ((i3 + 1) * this.i)) {
                if (this.f == this.e + i3) {
                    return 1073741824;
                }
                this.B = true;
                this.f = (this.e + i3) - 1;
                return 4;
            }
        }
        return 0;
    }

    @Override // defpackage.al
    public final void j() {
        this.s = null;
        this.t = null;
        this.u = null;
        this.x = null;
        this.p = null;
        this.r = null;
        this.q = null;
        this.v = null;
        this.w = null;
    }

    public final void a(Graphics graphics) {
        this.g = Math.min(this.h + this.z, (this.d - 8) / this.i);
        ca.a(graphics, 6014420);
        graphics.setClip(0, 0, t.b, t.c);
        graphics.fillRect(this.a, this.b, this.c, this.d);
        ca.a(graphics, this.a, this.b, this.c, this.d, 1);
        if (this.E) {
            ca.a(graphics);
        }
        int i = 0;
        for (int i2 = this.e - this.z; i < this.g && i2 < this.h; i2++) {
            graphics.setClip(this.a, this.b, this.c, this.d);
            if (this.f == i2 + this.z) {
                ca.a(graphics, 9);
                graphics.fillRect(this.a + 4, this.b + 4 + (i * this.i), this.c - 11, this.i);
            }
            if (i2 + this.z != this.e || this.p == null) {
                this.A = (byte) 0;
                int iStringWidth = 0;
                int iStringWidth2 = 0;
                if (this.r != null && this.r[i2] != null) {
                    this.A = (byte) this.r[i2].getWidth();
                    graphics.drawImage(this.r[i2], this.a + 4, this.b + 4 + (i * this.i) + ((this.i - this.r[i2].getHeight()) / 2), 20);
                    if (this.C) {
                        graphics.setColor(16515586);
                        graphics.drawRect(this.a + 4, this.b + 4 + (i * this.i) + ((this.i - this.r[i2].getHeight()) / 2), this.r[i2].getWidth(), this.r[i2].getHeight());
                    }
                }
                int iStringWidth3 = 0 + this.A + ((this.v == null || this.v[i2] <= 0) ? (byte) 0 : (byte) 16) + ((this.w == null || this.w[i2] <= 0) ? 0 : 18);
                if (this.s[i2] != null) {
                    iStringWidth3 += t.i.stringWidth(this.s[i2]);
                }
                if (this.t != null && this.t[i2] != null) {
                    iStringWidth2 = t.i.stringWidth(this.t[i2]);
                }
                if (this.u != null && this.u[i2] != null) {
                    iStringWidth = t.i.stringWidth(this.u[i2]);
                }
                this.m = (short) (this.a + 4 + iStringWidth3 + Math.max(4, ((((this.c - iStringWidth3) - iStringWidth2) - iStringWidth) - 20) >> 1));
                this.n = (short) (this.m + iStringWidth2 + Math.max(4, ((((this.c - iStringWidth3) - iStringWidth2) - iStringWidth) - 20) >> 1));
                this.o = (short) (this.f == i2 + this.z ? this.n + iStringWidth : 0);
                graphics.setClip(this.a + 4 + this.A, this.b, ((this.c - 6) - this.A) - 12, this.d);
                if (this.s != null && this.s[i2] != null) {
                    if (ca.a(this.s[i2]) != -1) {
                        graphics.setColor(this.f == i2 + this.z ? 16777215 : ca.a(this.s[i2]));
                        a(graphics, this.s[i2].substring(3), this.a + 6 + this.A, this.b + 4 + (i * this.i), this.o > (this.a + this.c) - 12);
                    } else {
                        graphics.setColor(this.f == i2 + this.z ? 16777215 : this.x != null ? this.x[i2] : 2176196);
                        a(graphics, this.s[i2], this.a + 6 + this.A, this.b + 4 + (i * this.i), this.o > (this.a + this.c) - 12);
                    }
                }
                if (this.v != null && this.v[i2] > 0) {
                    a(graphics, this.a + 4 + this.A + t.i.stringWidth(this.s[i2]) + 2, this.b + 4 + (i * this.i), a.d(this.v[i2]));
                }
                if (this.w != null && this.w[i2] > 0) {
                    a(graphics, ((this.a + 4) + iStringWidth3) - 18, this.b + 4 + (i * this.i), a.c(this.w[i2]));
                }
                if (this.t != null && this.t[i2] != null) {
                    a(graphics, this.t[i2], this.m, this.b + 4 + (i * this.i), this.o > (this.a + this.c) - 12);
                }
                if (this.u != null && this.u[i2] != null) {
                    if (this.n + iStringWidth < (this.a + this.c) - 12) {
                        graphics.drawString(this.u[i2], (this.a + this.c) - 16, this.b + 4 + (i * this.i), 24);
                    } else {
                        a(graphics, this.u[i2], this.n, this.b + 4 + (i * this.i), this.o > (this.a + this.c) - 12);
                    }
                }
                if (this.f == i2 + this.z && this.o > (this.a + this.c) - 12) {
                    if (this.B) {
                        this.B = false;
                        this.k = 0;
                        this.l = this.o + 10;
                    }
                    if (this.k + this.o >= 0) {
                        this.k--;
                        this.l--;
                    } else {
                        this.k = this.l;
                        this.l = this.k + this.o + 10;
                    }
                }
            } else {
                graphics.setColor(16776960);
                graphics.drawString(this.p, this.a + 6, this.b + 4 + (i * this.i), 20);
            }
            i++;
        }
        if (this.g > 0) {
            graphics.setClip(0, 0, t.b, t.c);
            if (a.C != null) {
                this.j = 0;
                if (this.g < this.h && this.h != 0) {
                    this.j = (this.g * (this.d - 16)) / this.h > 6 ? (this.g * (this.d - 16)) / this.h : 6;
                }
                ca.a(graphics, ((this.a + this.c) - 2) - a.C.b, this.b + 3, this.d - 5, this.j, this.e, this.h, this.g - this.z);
            }
            ca.b(graphics, this.q, this.a + 5, this.b + (((this.f - this.e) + 1) * this.i), this.b + this.d, this.y);
        }
    }

    private void a(Graphics graphics, int i, int i2, Image image) {
        if (image != null) {
            if (this.o <= (this.a + this.c) - 12) {
                graphics.drawImage(image, i, i2 + ((this.i - image.getHeight()) / 2), 20);
            } else {
                graphics.drawImage(image, this.k + i, i2 + ((this.i - image.getHeight()) / 2), 20);
                graphics.drawImage(image, this.l + i, i2 + ((this.i - image.getHeight()) / 2), 20);
            }
        }
    }

    private void a(Graphics graphics, String str, int i, int i2, boolean z) {
        if (!z) {
            graphics.drawString(str, i, i2, 20);
        } else {
            graphics.drawString(str, this.k + i, i2, 20);
            graphics.drawString(str, this.l + i, i2, 20);
        }
    }
}

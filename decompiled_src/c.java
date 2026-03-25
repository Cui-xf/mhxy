/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import com.yinhan.kjava.main.a;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class c
extends al {
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
    private int[] x = null;
    private byte y;
    private byte z;
    private byte A = 0;
    private boolean B = true;
    private boolean C;
    private boolean D = false;
    private boolean E = false;

    public final void a(String[] stringArray, String[] stringArray2, String[] stringArray3) {
        this.a(null, stringArray, null, null, stringArray3);
    }

    public final void a(Image[] imageArray, String[] stringArray, String[] stringArray2, String[] stringArray3) {
        this.a(imageArray, stringArray, null, stringArray2, stringArray3);
    }

    private void a(Image[] imageArray, String[] stringArray, short[] sArray, String[] stringArray2, String[] stringArray3) {
        this.j();
        this.r = imageArray;
        this.s = stringArray;
        this.t = stringArray2;
        this.u = stringArray3;
        this.v = null;
        this.C = true;
        this.D = false;
        this.e = 0;
        this.f = 0;
        this.z = 0;
        this.i = t.j;
        this.h = stringArray == null ? 0 : stringArray.length;
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

    public final void a(boolean bl2) {
        this.E = bl2;
    }

    public final void a(Image[] imageArray) {
        this.r = imageArray;
    }

    public final void b(boolean bl2) {
        this.C = false;
    }

    public final void a(String string) {
        this.p = string;
        this.z = 1;
    }

    public final void a(String string, int n2) {
        ca.l = 0;
        this.q = string;
        this.y = (byte)n2;
    }

    public final void a(int n2) {
        this.f = n2;
        this.g = Math.min(this.h + this.z, (this.d - 8) / this.i);
        while (this.e < this.f && this.f - this.e + 1 > this.g) {
            ++this.e;
        }
        if (this.e > this.h || this.f > this.h) {
            this.e = 0;
            this.f = 0;
        }
    }

    public final void a(int n2, int n3) {
        this.e = n2;
        this.f = n3;
        if (this.f == this.h - 1 + this.z) {
            this.e = Math.max(0, this.f - this.g + 1);
        }
        if (this.e > this.h || this.f > this.h) {
            this.e = 0;
            this.f = 0;
        }
    }

    public final void a(short[] sArray) {
        this.v = sArray;
    }

    public final void b(short[] sArray) {
        this.w = sArray;
    }

    public final void a(int[] nArray) {
        this.x = nArray;
    }

    public final void a(int n2, int n3, int n4, int n5) {
        this.a = n2;
        this.b = n3;
        this.c = n4;
        this.d = n5;
    }

    public final void b(int n2) {
        if (n2 == 1 || n2 == 514) {
            if (this.s != null) {
                int n3 = this.f = this.f <= 0 ? this.s.length - 1 + this.z : (this.f = this.f - 1);
                if (this.e > 0 && this.e + this.z > this.f) {
                    --this.e;
                }
                if (this.f == this.s.length - 1 + this.z) {
                    this.e = this.f - this.g + 1;
                }
            }
            this.B = true;
            return;
        }
        if (n2 == 4 || n2 == 520) {
            if (this.s != null) {
                int n4 = this.f = this.f >= this.s.length - 1 + this.z ? 0 : (this.f = this.f + 1);
                this.e = this.f - this.e >= this.g ? (this.e = this.e + 1) : (this.f == 0 ? 0 : this.e);
            }
            this.B = true;
        }
    }

    public final int b(int n2, int n3) {
        if (n2 >= this.a + this.c - 2 - com.yinhan.kjava.main.a.C.b && n2 <= this.a + this.c && n3 >= this.b + 3 && n3 <= this.b + 3 + com.yinhan.kjava.main.a.C.c) {
            return 1;
        }
        if (n2 >= this.a + this.c - 2 - com.yinhan.kjava.main.a.D.b && n2 <= this.a + this.c && n3 >= this.b + this.d - 2 - com.yinhan.kjava.main.a.D.c && n3 <= this.b + this.d) {
            return 4;
        }
        for (int i2 = 0; i2 < this.g; ++i2) {
            if (n2 <= this.a + 4 || n2 >= this.a + this.c - 8 || n3 <= this.b + 4 + i2 * this.i || n3 >= this.b + 4 + (i2 + 1) * this.i) continue;
            if (this.f == this.e + i2) {
                return 0x40000000;
            }
            this.B = true;
            this.f = this.e + i2 - 1;
            return 4;
        }
        return 0;
    }

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
        graphics.setClip(0, 0, (int)t.b, (int)t.c);
        graphics.fillRect(this.a, this.b, this.c, this.d);
        ca.a(graphics, this.a, this.b, this.c, this.d, 1);
        if (this.E) {
            ca.a(graphics);
        }
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        for (int i2 = this.e - this.z; n5 < this.g && i2 < this.h; ++n5, ++i2) {
            graphics.setClip(this.a, this.b, this.c, this.d);
            if (this.f == i2 + this.z) {
                ca.a(graphics, 9);
                graphics.fillRect(this.a + 4, this.b + 4 + n5 * this.i, this.c - 11, this.i);
            }
            if (i2 + this.z == this.e && this.p != null) {
                graphics.setColor(0xFFFF00);
                graphics.drawString(this.p, this.a + 6, this.b + 4 + n5 * this.i, 20);
                continue;
            }
            this.A = 0;
            n4 = 0;
            n3 = 0;
            if (this.r != null && this.r[i2] != null) {
                this.A = (byte)this.r[i2].getWidth();
                graphics.drawImage(this.r[i2], this.a + 4, this.b + 4 + n5 * this.i + (this.i - this.r[i2].getHeight()) / 2, 20);
                if (this.C) {
                    graphics.setColor(16515586);
                    graphics.drawRect(this.a + 4, this.b + 4 + n5 * this.i + (this.i - this.r[i2].getHeight()) / 2, this.r[i2].getWidth(), this.r[i2].getHeight());
                }
            }
            n2 = 0 + (this.A + (this.v != null && this.v[i2] > 0 ? 16 : 0));
            n2 += this.w != null && this.w[i2] > 0 ? 18 : 0;
            if (this.s[i2] != null) {
                n2 += t.i.stringWidth(this.s[i2]);
            }
            if (this.t != null && this.t[i2] != null) {
                n3 = t.i.stringWidth(this.t[i2]);
            }
            if (this.u != null && this.u[i2] != null) {
                n4 = t.i.stringWidth(this.u[i2]);
            }
            this.m = (short)(this.a + 4 + n2 + Math.max(4, this.c - n2 - n3 - n4 - 20 >> 1));
            this.n = (short)(this.m + n3 + Math.max(4, this.c - n2 - n3 - n4 - 20 >> 1));
            this.o = (short)(this.f == i2 + this.z ? this.n + n4 : 0);
            graphics.setClip(this.a + 4 + this.A, this.b, this.c - 6 - this.A - 12, this.d);
            if (this.s != null && this.s[i2] != null) {
                if (ca.a(this.s[i2]) != -1) {
                    graphics.setColor(this.f == i2 + this.z ? 0xFFFFFF : ca.a(this.s[i2]));
                    this.a(graphics, this.s[i2].substring(3), this.a + 6 + this.A, this.b + 4 + n5 * this.i, this.o > this.a + this.c - 12);
                } else {
                    graphics.setColor(this.f == i2 + this.z ? 0xFFFFFF : (this.x != null ? this.x[i2] : 2176196));
                    this.a(graphics, this.s[i2], this.a + 6 + this.A, this.b + 4 + n5 * this.i, this.o > this.a + this.c - 12);
                }
            }
            if (this.v != null && this.v[i2] > 0) {
                this.a(graphics, this.a + 4 + this.A + t.i.stringWidth(this.s[i2]) + 2, this.b + 4 + n5 * this.i, com.yinhan.kjava.main.a.d(this.v[i2]));
            }
            if (this.w != null && this.w[i2] > 0) {
                this.a(graphics, this.a + 4 + n2 - 18, this.b + 4 + n5 * this.i, com.yinhan.kjava.main.a.c(this.w[i2]));
            }
            if (this.t != null && this.t[i2] != null) {
                this.a(graphics, this.t[i2], this.m, this.b + 4 + n5 * this.i, this.o > this.a + this.c - 12);
            }
            if (this.u != null && this.u[i2] != null) {
                if (this.n + n4 < this.a + this.c - 12) {
                    graphics.drawString(this.u[i2], this.a + this.c - 16, this.b + 4 + n5 * this.i, 24);
                } else {
                    this.a(graphics, this.u[i2], this.n, this.b + 4 + n5 * this.i, this.o > this.a + this.c - 12);
                }
            }
            if (this.f != i2 + this.z || this.o <= this.a + this.c - 12) continue;
            if (this.B) {
                this.B = false;
                this.k = 0;
                this.l = this.o + 10;
            }
            if (this.k + this.o >= 0) {
                --this.k;
                --this.l;
                continue;
            }
            this.k = this.l;
            this.l = this.k + this.o + 10;
        }
        if (this.g > 0) {
            graphics.setClip(0, 0, (int)t.b, (int)t.c);
            if (com.yinhan.kjava.main.a.C != null) {
                this.j = 0;
                if (this.g < this.h && this.h != 0) {
                    this.j = this.g * (this.d - 16) / this.h > 6 ? this.g * (this.d - 16) / this.h : 6;
                }
                ca.a(graphics, this.a + this.c - 2 - com.yinhan.kjava.main.a.C.b, this.b + 3, this.d - 5, this.j, this.e, this.h, this.g - this.z);
            }
            ca.b(graphics, this.q, this.a + 5, this.b + (this.f - this.e + 1) * this.i, this.b + this.d, (int)this.y);
        }
    }

    private void a(Graphics graphics, int n2, int n3, Image image) {
        if (image != null) {
            if (this.o > this.a + this.c - 12) {
                graphics.drawImage(image, this.k + n2, n3 + (this.i - image.getHeight()) / 2, 20);
                graphics.drawImage(image, this.l + n2, n3 + (this.i - image.getHeight()) / 2, 20);
                return;
            }
            graphics.drawImage(image, n2, n3 + (this.i - image.getHeight()) / 2, 20);
        }
    }

    private void a(Graphics graphics, String string, int n2, int n3, boolean bl2) {
        if (bl2) {
            graphics.drawString(string, this.k + n2, n3, 20);
            graphics.drawString(string, this.l + n2, n3, 20);
            return;
        }
        graphics.drawString(string, n2, n3, 20);
    }
}


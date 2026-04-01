package p000;

import com.yinhan.kjava.main.RunnableC0066a;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* renamed from: c */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-5080095226433994817/classes.dex */
public final class C0054c extends AbstractC0012al {

    /* renamed from: C */
    private boolean f1809C;

    /* renamed from: a */
    private int f1812a;

    /* renamed from: b */
    private int f1813b;

    /* renamed from: c */
    private int f1814c;

    /* renamed from: d */
    private int f1815d;

    /* renamed from: e */
    private int f1816e;

    /* renamed from: f */
    private int f1817f;

    /* renamed from: g */
    private int f1818g;

    /* renamed from: h */
    private int f1819h;

    /* renamed from: i */
    private int f1820i;

    /* renamed from: j */
    private int f1821j;

    /* renamed from: k */
    private int f1822k;

    /* renamed from: l */
    private int f1823l;

    /* renamed from: m */
    private short f1824m;

    /* renamed from: n */
    private short f1825n;

    /* renamed from: o */
    private short f1826o;

    /* renamed from: p */
    private String f1827p;

    /* renamed from: q */
    private String f1828q;

    /* renamed from: r */
    private Image[] f1829r;

    /* renamed from: s */
    private String[] f1830s;

    /* renamed from: t */
    private String[] f1831t;

    /* renamed from: u */
    private String[] f1832u;

    /* renamed from: v */
    private short[] f1833v;

    /* renamed from: w */
    private short[] f1834w;

    /* renamed from: y */
    private byte f1836y;

    /* renamed from: z */
    private byte f1837z;

    /* renamed from: x */
    private int[] f1835x = null;

    /* renamed from: A */
    private byte f1807A = 0;

    /* renamed from: B */
    private boolean f1808B = true;

    /* renamed from: D */
    private boolean f1810D = false;

    /* renamed from: E */
    private boolean f1811E = false;

    /* renamed from: a */
    private void m1252a(Graphics graphics, int i, int i2, Image image) {
        if (image != null) {
            if (this.f1826o <= (this.f1812a + this.f1814c) - 12) {
                graphics.drawImage(image, i, ((this.f1820i - image.getHeight()) / 2) + i2, 20);
            } else {
                graphics.drawImage(image, this.f1822k + i, ((this.f1820i - image.getHeight()) / 2) + i2, 20);
                graphics.drawImage(image, this.f1823l + i, ((this.f1820i - image.getHeight()) / 2) + i2, 20);
            }
        }
    }

    /* renamed from: a */
    private void m1253a(Graphics graphics, String str, int i, int i2, boolean z) {
        if (!z) {
            graphics.drawString(str, i, i2, 20);
        } else {
            graphics.drawString(str, this.f1822k + i, i2, 20);
            graphics.drawString(str, this.f1823l + i, i2, 20);
        }
    }

    /* renamed from: a */
    private void m1254a(Image[] imageArr, String[] strArr, short[] sArr, String[] strArr2, String[] strArr3) {
        mo71j();
        this.f1829r = imageArr;
        this.f1830s = strArr;
        this.f1831t = strArr2;
        this.f1832u = strArr3;
        this.f1833v = null;
        this.f1809C = true;
        this.f1810D = false;
        this.f1816e = 0;
        this.f1817f = 0;
        this.f1837z = (byte) 0;
        this.f1820i = C0088t.f2524j;
        this.f1819h = strArr != null ? strArr.length : 0;
        this.f1818g = Math.min(this.f1819h + this.f1837z, (this.f1815d - 8) / this.f1820i);
    }

    /* renamed from: a */
    public final int m1255a() {
        return this.f1812a;
    }

    /* renamed from: a */
    public final void m1256a(int i) {
        this.f1817f = i;
        this.f1818g = Math.min(this.f1819h + this.f1837z, (this.f1815d - 8) / this.f1820i);
        while (this.f1816e < this.f1817f && (this.f1817f - this.f1816e) + 1 > this.f1818g) {
            this.f1816e++;
        }
        if (this.f1816e > this.f1819h || this.f1817f > this.f1819h) {
            this.f1816e = 0;
            this.f1817f = 0;
        }
    }

    /* renamed from: a */
    public final void m1257a(int i, int i2) {
        this.f1816e = i;
        this.f1817f = i2;
        if (this.f1817f == (this.f1819h - 1) + this.f1837z) {
            this.f1816e = Math.max(0, (this.f1817f - this.f1818g) + 1);
        }
        if (this.f1816e > this.f1819h || this.f1817f > this.f1819h) {
            this.f1816e = 0;
            this.f1817f = 0;
        }
    }

    /* renamed from: a */
    public final void m1258a(int i, int i2, int i3, int i4) {
        this.f1812a = i;
        this.f1813b = i2;
        this.f1814c = i3;
        this.f1815d = i4;
    }

    /* renamed from: a */
    public final void m1259a(String str) {
        this.f1827p = str;
        this.f1837z = (byte) 1;
    }

    /* renamed from: a */
    public final void m1260a(String str, int i) {
        C0055ca.f1892l = 0;
        this.f1828q = str;
        this.f1836y = (byte) i;
    }

    /* renamed from: a */
    public final void m1261a(Graphics graphics) {
        this.f1818g = Math.min(this.f1819h + this.f1837z, (this.f1815d - 8) / this.f1820i);
        C0055ca.m1289a(graphics, 6014420);
        graphics.setClip(0, 0, C0088t.f2516b, C0088t.f2517c);
        graphics.fillRect(this.f1812a, this.f1813b, this.f1814c, this.f1815d);
        C0055ca.m1292a(graphics, this.f1812a, this.f1813b, this.f1814c, this.f1815d, 1);
        if (this.f1811E) {
            C0055ca.m1288a(graphics);
        }
        int i = 0;
        int i2 = this.f1816e - this.f1837z;
        while (true) {
            int i3 = i2;
            int i4 = i;
            if (i4 >= this.f1818g || i3 >= this.f1819h) {
                break;
            }
            graphics.setClip(this.f1812a, this.f1813b, this.f1814c, this.f1815d);
            if (this.f1817f == this.f1837z + i3) {
                C0055ca.m1289a(graphics, 9);
                graphics.fillRect(this.f1812a + 4, this.f1813b + 4 + (this.f1820i * i4), this.f1814c - 11, this.f1820i);
            }
            if (this.f1837z + i3 != this.f1816e || this.f1827p == null) {
                this.f1807A = (byte) 0;
                if (this.f1829r != null && this.f1829r[i3] != null) {
                    this.f1807A = (byte) this.f1829r[i3].getWidth();
                    graphics.drawImage(this.f1829r[i3], this.f1812a + 4, this.f1813b + 4 + (this.f1820i * i4) + ((this.f1820i - this.f1829r[i3].getHeight()) / 2), 20);
                    if (this.f1809C) {
                        graphics.setColor(16515586);
                        graphics.drawRect(this.f1812a + 4, this.f1813b + 4 + (this.f1820i * i4) + ((this.f1820i - this.f1829r[i3].getHeight()) / 2), this.f1829r[i3].getWidth(), this.f1829r[i3].getHeight());
                    }
                }
                int i5 = ((this.f1834w == null || this.f1834w[i3] <= 0) ? 0 : 18) + ((this.f1833v == null || this.f1833v[i3] <= 0) ? (byte) 0 : (byte) 16) + this.f1807A + 0;
                int iStringWidth = this.f1830s[i3] != null ? i5 + C0088t.f2523i.stringWidth(this.f1830s[i3]) : i5;
                int iStringWidth2 = (this.f1831t == null || this.f1831t[i3] == null) ? 0 : C0088t.f2523i.stringWidth(this.f1831t[i3]);
                int iStringWidth3 = (this.f1832u == null || this.f1832u[i3] == null) ? 0 : C0088t.f2523i.stringWidth(this.f1832u[i3]);
                this.f1824m = (short) (this.f1812a + 4 + iStringWidth + Math.max(4, ((((this.f1814c - iStringWidth) - iStringWidth2) - iStringWidth3) - 20) >> 1));
                this.f1825n = (short) (Math.max(4, ((((this.f1814c - iStringWidth) - iStringWidth2) - iStringWidth3) - 20) >> 1) + this.f1824m + iStringWidth2);
                this.f1826o = (short) (this.f1817f == this.f1837z + i3 ? this.f1825n + iStringWidth3 : 0);
                graphics.setClip(this.f1812a + 4 + this.f1807A, this.f1813b, ((this.f1814c - 6) - this.f1807A) - 12, this.f1815d);
                if (this.f1830s != null && this.f1830s[i3] != null) {
                    if (C0055ca.m1280a(this.f1830s[i3]) != -1) {
                        graphics.setColor(this.f1817f == this.f1837z + i3 ? 16777215 : C0055ca.m1280a(this.f1830s[i3]));
                        m1253a(graphics, this.f1830s[i3].substring(3), this.f1812a + 6 + this.f1807A, this.f1813b + 4 + (this.f1820i * i4), this.f1826o > (this.f1812a + this.f1814c) + (-12));
                    } else {
                        graphics.setColor(this.f1817f == this.f1837z + i3 ? 16777215 : this.f1835x != null ? this.f1835x[i3] : 2176196);
                        m1253a(graphics, this.f1830s[i3], this.f1812a + 6 + this.f1807A, this.f1813b + 4 + (this.f1820i * i4), this.f1826o > (this.f1812a + this.f1814c) + (-12));
                    }
                }
                if (this.f1833v != null && this.f1833v[i3] > 0) {
                    m1252a(graphics, this.f1812a + 4 + this.f1807A + C0088t.f2523i.stringWidth(this.f1830s[i3]) + 2, this.f1813b + 4 + (this.f1820i * i4), RunnableC0066a.m1409d(this.f1833v[i3]));
                }
                if (this.f1834w != null && this.f1834w[i3] > 0) {
                    m1252a(graphics, ((this.f1812a + 4) + iStringWidth) - 18, this.f1813b + 4 + (this.f1820i * i4), RunnableC0066a.m1406c(this.f1834w[i3]));
                }
                if (this.f1831t != null && this.f1831t[i3] != null) {
                    m1253a(graphics, this.f1831t[i3], this.f1824m, this.f1813b + 4 + (this.f1820i * i4), this.f1826o > (this.f1812a + this.f1814c) + (-12));
                }
                if (this.f1832u != null && this.f1832u[i3] != null) {
                    if (this.f1825n + iStringWidth3 < (this.f1812a + this.f1814c) - 12) {
                        graphics.drawString(this.f1832u[i3], (this.f1812a + this.f1814c) - 16, this.f1813b + 4 + (this.f1820i * i4), 24);
                    } else {
                        m1253a(graphics, this.f1832u[i3], this.f1825n, this.f1813b + 4 + (this.f1820i * i4), this.f1826o > (this.f1812a + this.f1814c) + (-12));
                    }
                }
                if (this.f1817f == this.f1837z + i3 && this.f1826o > (this.f1812a + this.f1814c) - 12) {
                    if (this.f1808B) {
                        this.f1808B = false;
                        this.f1822k = 0;
                        this.f1823l = this.f1826o + 10;
                    }
                    if (this.f1822k + this.f1826o >= 0) {
                        this.f1822k--;
                        this.f1823l--;
                    } else {
                        this.f1822k = this.f1823l;
                        this.f1823l = this.f1822k + this.f1826o + 10;
                    }
                }
            } else {
                graphics.setColor(16776960);
                graphics.drawString(this.f1827p, this.f1812a + 6, this.f1813b + 4 + (this.f1820i * i4), 20);
            }
            i = i4 + 1;
            i2 = i3 + 1;
        }
        if (this.f1818g > 0) {
            graphics.setClip(0, 0, C0088t.f2516b, C0088t.f2517c);
            if (RunnableC0066a.f2064C != null) {
                this.f1821j = 0;
                if (this.f1818g < this.f1819h && this.f1819h != 0) {
                    this.f1821j = (this.f1818g * (this.f1815d + (-16))) / this.f1819h > 6 ? (this.f1818g * (this.f1815d - 16)) / this.f1819h : 6;
                }
                C0055ca.m1294a(graphics, ((this.f1812a + this.f1814c) - 2) - RunnableC0066a.f2064C.f599b, this.f1813b + 3, this.f1815d - 5, this.f1821j, this.f1816e, this.f1819h, this.f1818g - this.f1837z);
            }
            C0055ca.m1321b(graphics, this.f1828q, this.f1812a + 5, (((this.f1817f - this.f1816e) + 1) * this.f1820i) + this.f1813b, this.f1815d + this.f1813b, this.f1836y);
        }
    }

    /* renamed from: a */
    public final void m1262a(boolean z) {
        this.f1811E = z;
    }

    /* renamed from: a */
    public final void m1263a(int[] iArr) {
        this.f1835x = iArr;
    }

    /* renamed from: a */
    public final void m1264a(String[] strArr, String[] strArr2, String[] strArr3) {
        m1254a((Image[]) null, strArr, (short[]) null, (String[]) null, strArr3);
    }

    /* renamed from: a */
    public final void m1265a(Image[] imageArr) {
        this.f1829r = imageArr;
    }

    /* renamed from: a */
    public final void m1266a(Image[] imageArr, String[] strArr, String[] strArr2, String[] strArr3) {
        m1254a(imageArr, strArr, (short[]) null, strArr2, strArr3);
    }

    /* renamed from: a */
    public final void m1267a(short[] sArr) {
        this.f1833v = sArr;
    }

    /* renamed from: b */
    public final int m1268b() {
        return this.f1813b;
    }

    @Override // p000.AbstractC0012al
    /* renamed from: b */
    public final int mo69b(int i, int i2) {
        if (i >= ((this.f1812a + this.f1814c) - 2) - RunnableC0066a.f2064C.f599b && i <= this.f1812a + this.f1814c && i2 >= this.f1813b + 3 && i2 <= this.f1813b + 3 + RunnableC0066a.f2064C.f600c) {
            return 1;
        }
        if (i >= ((this.f1812a + this.f1814c) - 2) - RunnableC0066a.f2065D.f599b && i <= this.f1812a + this.f1814c && i2 >= ((this.f1813b + this.f1815d) - 2) - RunnableC0066a.f2065D.f600c && i2 <= this.f1813b + this.f1815d) {
            return 4;
        }
        for (int i3 = 0; i3 < this.f1818g; i3++) {
            if (i > this.f1812a + 4 && i < (this.f1812a + this.f1814c) - 8 && i2 > this.f1813b + 4 + (this.f1820i * i3) && i2 < this.f1813b + 4 + ((i3 + 1) * this.f1820i)) {
                if (this.f1817f == this.f1816e + i3) {
                    return 1073741824;
                }
                this.f1808B = true;
                this.f1817f = (i3 + this.f1816e) - 1;
                return 4;
            }
        }
        return 0;
    }

    @Override // p000.AbstractC0012al
    /* renamed from: b */
    public final void mo70b(int i) {
        int length;
        int i2;
        int i3 = 0;
        if (i == 1 || i == 514) {
            if (this.f1830s != null) {
                if (this.f1817f <= 0) {
                    length = (this.f1830s.length - 1) + this.f1837z;
                } else {
                    length = this.f1817f - 1;
                    this.f1817f = length;
                }
                this.f1817f = length;
                if (this.f1816e > 0 && this.f1816e + this.f1837z > this.f1817f) {
                    this.f1816e--;
                }
                if (this.f1817f == (this.f1830s.length - 1) + this.f1837z) {
                    this.f1816e = (this.f1817f - this.f1818g) + 1;
                }
            }
            this.f1808B = true;
            return;
        }
        if (i == 4 || i == 520) {
            if (this.f1830s != null) {
                if (this.f1817f >= (this.f1830s.length - 1) + this.f1837z) {
                    i2 = 0;
                } else {
                    i2 = this.f1817f + 1;
                    this.f1817f = i2;
                }
                this.f1817f = i2;
                if (this.f1817f - this.f1816e >= this.f1818g) {
                    i3 = this.f1816e + 1;
                    this.f1816e = i3;
                } else if (this.f1817f != 0) {
                    i3 = this.f1816e;
                }
                this.f1816e = i3;
            }
            this.f1808B = true;
        }
    }

    /* renamed from: b */
    public final void m1269b(boolean z) {
        this.f1809C = false;
    }

    /* renamed from: b */
    public final void m1270b(short[] sArr) {
        this.f1834w = sArr;
    }

    /* renamed from: c */
    public final int m1271c() {
        return this.f1814c;
    }

    /* renamed from: d */
    public final int m1272d() {
        return this.f1815d;
    }

    /* renamed from: e */
    public final int m1273e() {
        return this.f1820i;
    }

    /* renamed from: f */
    public final int m1274f() {
        return this.f1818g;
    }

    /* renamed from: g */
    public final int m1275g() {
        return this.f1817f;
    }

    /* renamed from: h */
    public final int m1276h() {
        return this.f1816e;
    }

    /* renamed from: i */
    public final int m1277i() {
        return this.f1817f - this.f1816e;
    }

    @Override // p000.AbstractC0012al
    /* renamed from: j */
    public final void mo71j() {
        this.f1830s = null;
        this.f1831t = null;
        this.f1832u = null;
        this.f1835x = null;
        this.f1827p = null;
        this.f1829r = null;
        this.f1828q = null;
        this.f1833v = null;
        this.f1834w = null;
    }
}

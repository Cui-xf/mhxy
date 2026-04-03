package p000;

import com.yinhan.kjava.main.RunnableC0066a;
import java.lang.reflect.Array;
import javax.microedition.lcdui.Graphics;

/* renamed from: l */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-4234804660425969496/classes.dex */
public final class C0080l extends AbstractC0012al {

    /* renamed from: a */
    private String f2306a;

    /* renamed from: c */
    private int f2308c;

    /* renamed from: d */
    private int f2309d;

    /* renamed from: e */
    private int f2310e;

    /* renamed from: f */
    private int f2311f;

    /* renamed from: g */
    private int f2312g;

    /* renamed from: h */
    private int f2313h;

    /* renamed from: i */
    private int f2314i;

    /* renamed from: j */
    private int f2315j;

    /* renamed from: k */
    private int f2316k;

    /* renamed from: l */
    private int f2317l;

    /* renamed from: m */
    private int f2318m;

    /* renamed from: n */
    private int f2319n;

    /* renamed from: o */
    private int f2320o;

    /* renamed from: p */
    private int f2321p;

    /* renamed from: q */
    private int f2322q;

    /* renamed from: b */
    private String[] f2307b = null;

    /* renamed from: r */
    private int f2323r = 16776917;

    /* renamed from: s */
    private int f2324s = 16776917;

    /* renamed from: t */
    private int f2325t = 16776917;

    /* renamed from: u */
    private boolean f2326u = false;

    /* renamed from: v */
    private int[][] f2327v = new int[2][4];

    /* renamed from: a */
    private void m1584a(Graphics graphics, int i, int i2, int i3) {
        if (this.f2326u) {
            graphics.drawImage(RunnableC0066a.f2078Q.f598a, i, i3, 20);
            graphics.drawImage(RunnableC0066a.f2077P.f598a, i2, i3, 20);
            this.f2327v[0][0] = i;
            this.f2327v[0][1] = i3;
            this.f2327v[0][2] = RunnableC0066a.f2078Q.f599b;
            this.f2327v[0][3] = RunnableC0066a.f2078Q.f600c;
            this.f2327v[1][0] = i2;
            this.f2327v[1][1] = i3;
            this.f2327v[1][2] = RunnableC0066a.f2077P.f599b;
            this.f2327v[1][3] = RunnableC0066a.f2077P.f600c;
        }
    }

    /* renamed from: b */
    public static int m1585b() {
        return RunnableC0066a.f2066E != null ? RunnableC0066a.f2066E.f600c : C0088t.f2524j;
    }

    /* renamed from: b */
    private void m1586b(int i, int i2, int i3, int i4) {
        this.f2311f = i;
        this.f2312g = i2;
        this.f2313h = i3;
        this.f2314i = i4;
    }

    /* renamed from: c */
    private void m1587c(int i, int i2, int i3, int i4) {
        this.f2315j = i;
        this.f2316k = i2;
        this.f2317l = i3;
        this.f2318m = i4;
    }

    /* renamed from: a */
    public final int m1588a() {
        return this.f2309d;
    }

    /* renamed from: a */
    public final void m1589a(int i, int i2, int i3, int i4) {
        this.f2308c = i;
        this.f2309d = (i2 + i4) - RunnableC0066a.f2066E.f600c;
        this.f2310e = i3;
        if (this.f2306a != null) {
            m1586b(((i3 - C0088t.f2523i.stringWidth(this.f2306a)) / 2) + i, this.f2309d, C0088t.f2523i.stringWidth(this.f2306a), RunnableC0066a.f2066E.f600c);
            return;
        }
        if (this.f2307b != null && this.f2307b.length == 2) {
            m1586b(i + 10, this.f2309d, C0088t.f2523i.stringWidth(this.f2307b[0]), RunnableC0066a.f2066E.f600c);
            m1587c(((i + i3) - 10) - C0088t.f2523i.stringWidth(this.f2307b[1]), this.f2309d, C0088t.f2523i.stringWidth(this.f2307b[1]), RunnableC0066a.f2066E.f600c);
            return;
        }
        if (this.f2307b == null || this.f2307b.length != 3) {
            return;
        }
        m1586b(i + 10, this.f2309d, C0088t.f2523i.stringWidth(this.f2307b[0]), RunnableC0066a.f2066E.f600c);
        int iStringWidth = (((i + i3) - 10) - C0088t.f2523i.stringWidth(this.f2307b[1])) / 2;
        int i5 = this.f2309d;
        int iStringWidth2 = C0088t.f2523i.stringWidth(this.f2307b[1]);
        short s = RunnableC0066a.f2066E.f600c;
        this.f2319n = iStringWidth;
        this.f2320o = i5;
        this.f2321p = iStringWidth2;
        this.f2322q = s;
        m1587c(((i + i3) - 10) - C0088t.f2523i.stringWidth(this.f2307b[2]), this.f2309d, C0088t.f2523i.stringWidth(this.f2307b[2]), RunnableC0066a.f2066E.f600c);
    }

    /* renamed from: a */
    public final void m1590a(String str) {
        this.f2306a = str;
        this.f2307b = null;
        this.f2326u = false;
    }

    /* renamed from: a */
    public final void m1591a(Graphics graphics) {
        if (this.f2306a == null && this.f2307b == null) {
            return;
        }
        C0055ca.m1306a(graphics, RunnableC0066a.f2066E.f598a, RunnableC0066a.f2066E.f599b, this.f2308c, this.f2309d, this.f2310e, RunnableC0066a.f2066E.f600c);
        graphics.setFont(C0088t.f2523i);
        if (this.f2306a != null) {
            C0055ca.m1298a(graphics, this.f2306a, this.f2311f, C0088t.m1674a(RunnableC0066a.f2066E.f600c) + this.f2312g, 20, this.f2323r, 0);
            m1584a(graphics, (this.f2311f - 5) - RunnableC0066a.f2078Q.f599b, this.f2311f + 5 + C0088t.f2523i.stringWidth(this.f2306a), this.f2312g + 4);
            return;
        }
        if (this.f2307b != null) {
            if (this.f2307b.length == 2) {
                C0055ca.m1298a(graphics, this.f2307b[0], this.f2311f, C0088t.m1674a(RunnableC0066a.f2066E.f600c) + this.f2312g, 20, this.f2323r, 0);
                C0055ca.m1298a(graphics, this.f2307b[1], this.f2315j, C0088t.m1674a(RunnableC0066a.f2066E.f600c) + this.f2316k, 20, this.f2324s, 0);
            } else if (this.f2307b.length == 3) {
                C0055ca.m1298a(graphics, this.f2307b[0], this.f2311f, C0088t.m1674a(RunnableC0066a.f2066E.f600c) + this.f2312g, 20, this.f2323r, 0);
                C0055ca.m1298a(graphics, this.f2307b[1], this.f2319n, C0088t.m1674a(RunnableC0066a.f2066E.f600c) + this.f2320o, 20, this.f2325t, 0);
                C0055ca.m1298a(graphics, this.f2307b[2], this.f2315j, C0088t.m1674a(RunnableC0066a.f2066E.f600c) + this.f2316k, 20, this.f2324s, 0);
            }
            m1584a(graphics, this.f2311f + C0088t.f2523i.stringWidth(this.f2307b[0]) + 10, (this.f2315j - 10) - RunnableC0066a.f2077P.f599b, this.f2312g + 4);
        }
    }

    /* renamed from: a */
    public final void m1592a(boolean z) {
        this.f2326u = true;
    }

    /* renamed from: a */
    public final void m1593a(String[] strArr) {
        this.f2307b = strArr;
        this.f2306a = null;
        this.f2326u = false;
    }

     // p000.AbstractC0012al
    /* renamed from: b */
    public final int mo69b(int i, int i2) {
        int z;
        if (this.f2306a != null) {
            z = (i >= this.f2311f && i <= this.f2311f + this.f2313h && i2 >= this.f2312g && i2 <= this.f2312g + this.f2314i) ? 1 : 0;
        } else if (this.f2307b != null) {
            if (i >= this.f2311f && i <= this.f2311f + this.f2313h && i2 >= this.f2312g && i2 <= this.f2312g + this.f2314i) {
                z = 1;
            } else if (i >= this.f2319n && i <= this.f2319n + this.f2321p && i2 >= this.f2320o && i2 <= this.f2320o + this.f2322q) {
                z = 2;
            } else if (i >= this.f2315j && i <= this.f2315j + this.f2317l && i2 >= this.f2316k && i2 <= this.f2316k + this.f2318m) {
                z = 3;
            } else {
                z = 0;
            }
        } else {
            z = 0;
        }
        switch (z) {
            case 1:
                return 268435456;
            case 2:
                return 1073741824;
            case 3:
                return 536870912;
            default:
                if (this.f2326u) {
                    if (i >= this.f2327v[0][0] && i <= this.f2327v[0][0] + this.f2327v[0][2] && i2 >= this.f2327v[0][1] && i2 <= this.f2327v[0][1] + this.f2327v[0][3]) {
                        return 1024;
                    }
                    if (i >= this.f2327v[1][0] && i <= this.f2327v[1][0] + this.f2327v[1][2] && i2 >= this.f2327v[1][1] && i2 <= this.f2327v[1][1] + this.f2327v[1][3]) {
                        return 2048;
                    }
                }
                return 0;
        }
    }

     // p000.AbstractC0012al
    /* renamed from: b */
    public final void mo70b(int i) {
    }

     // p000.AbstractC0012al
    /* renamed from: j */
    public final void mo71j() {
        if (this.f2306a != null) {
            this.f2306a = null;
        }
        if (this.f2307b != null) {
            this.f2307b = null;
        }
    }
}

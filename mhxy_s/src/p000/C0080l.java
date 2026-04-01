package p000;

import com.yinhan.kjava.main.RunnableC0066a;
import java.lang.reflect.Array;
import javax.microedition.lcdui.Graphics;

/* renamed from: l */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-5080095226433994817/classes.dex */
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
    private int[][] f2327v = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 2, 4);

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

    /* JADX WARN: Removed duplicated region for block: B:55:0x00a4  */
    @Override // p000.AbstractC0012al
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo69b(int r7, int r8) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0080l.mo69b(int, int):int");
    }

    @Override // p000.AbstractC0012al
    /* renamed from: b */
    public final void mo70b(int i) {
    }

    @Override // p000.AbstractC0012al
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

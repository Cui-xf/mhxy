package p000;

import com.yinhan.kjava.main.RunnableC0066a;
import java.io.UnsupportedEncodingException;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* renamed from: ai */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-5080095226433994817/classes.dex */
public final class C0009ai {

    /* renamed from: a */
    public static final String[] f68a = {"sBIT", "IHDR", "PLTE", "tRNS", "IDAT"};

    /* renamed from: b */
    public static byte[] f69b = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: c */
    public static byte[] f70c = {0, 0, 0, 0, 73, 69, 78, 68, -82, 66, 96, -126};

    /* renamed from: d */
    public static final byte[] f71d = m51b();

    /* renamed from: i */
    private static byte[] f72i = {0, 5, 3, 6, 2, 7, 1, 4};

    /* renamed from: e */
    public int f74e;

    /* renamed from: f */
    public int f75f;

    /* renamed from: r */
    private int f86r;

    /* renamed from: s */
    private int f87s;

    /* renamed from: u */
    private int f89u;

    /* renamed from: v */
    private int f90v;

    /* renamed from: w */
    private int f91w;

    /* renamed from: x */
    private int f92x;

    /* renamed from: y */
    private Image f93y;

    /* renamed from: z */
    private Graphics f94z;

    /* renamed from: g */
    private int[] f76g = new int[2];

    /* renamed from: h */
    private int[] f77h = new int[4];

    /* renamed from: j */
    private int f78j = 0;

    /* renamed from: k */
    private int f79k = 0;

    /* renamed from: l */
    private Image f80l = null;

    /* renamed from: m */
    private Graphics f81m = null;

    /* renamed from: n */
    private int f82n = 0;

    /* renamed from: o */
    private int f83o = 0;

    /* renamed from: p */
    private int f84p = -1;

    /* renamed from: q */
    private int f85q = -1;

    /* renamed from: t */
    private int f88t = 16;

    /* renamed from: A */
    private C0049bv f73A = null;

    /* renamed from: a */
    public static int m43a(C0030bc c0030bc, long j) {
        int i = 2;
        if (c0030bc == null || c0030bc.f571k == null) {
            return 2;
        }
        if ((j - c0030bc.f565e) - c0030bc.f564d <= 0) {
            return 0;
        }
        c0030bc.f566f = (byte) (c0030bc.f566f + 1);
        if (c0030bc.f566f >= c0030bc.f571k.length) {
            c0030bc.f566f = (byte) 0;
        } else {
            i = 1;
        }
        c0030bc.f565e = j;
        return i;
    }

    /* renamed from: a */
    private void m44a(C0023aw c0023aw, int i, int i2, int i3, int i4, boolean z) {
        this.f81m.setClip(0, 0, this.f78j, this.f79k);
        if (this.f82n == -1 && this.f83o == -1) {
            m47a(this.f81m, c0023aw, i - this.f88t, i2 - this.f88t, i4, z);
            this.f82n = i;
            this.f83o = i2;
            return;
        }
        if (this.f82n - i >= this.f88t) {
            this.f82n -= this.f88t;
            for (int i5 = this.f78j / this.f88t; i5 > 0; i5--) {
                this.f81m.setClip(this.f88t * i5, 0, this.f88t, this.f79k);
                this.f81m.drawImage(this.f80l, this.f88t, 0, 0);
            }
            this.f81m.setClip(0, 0, this.f88t, this.f79k);
            m47a(this.f81m, c0023aw, this.f82n - this.f88t, this.f83o - this.f88t, i4, z);
            return;
        }
        if (this.f82n - i <= (-this.f88t)) {
            this.f82n += this.f88t;
            this.f81m.setClip(0, 0, this.f78j - this.f88t, this.f79k);
            this.f81m.drawImage(this.f80l, -this.f88t, 0, 0);
            this.f81m.setClip(this.f78j - this.f88t, 0, this.f88t, this.f79k);
            m47a(this.f81m, c0023aw, this.f82n - this.f88t, this.f83o - this.f88t, i4, z);
            return;
        }
        if (this.f83o - i2 < this.f88t) {
            if (this.f83o - i2 <= (-this.f88t)) {
                this.f83o += this.f88t;
                this.f81m.setClip(0, 0, this.f78j, this.f79k - this.f88t);
                this.f81m.drawImage(this.f80l, 0, -this.f88t, 0);
                this.f81m.setClip(0, this.f79k - this.f88t, this.f78j, this.f88t);
                m47a(this.f81m, c0023aw, this.f82n - this.f88t, this.f83o - this.f88t, i4, z);
                return;
            }
            return;
        }
        this.f83o -= this.f88t;
        for (int i6 = this.f79k / this.f88t; i6 > 0; i6--) {
            this.f81m.setClip(0, this.f88t * i6, this.f78j, this.f88t);
            this.f81m.drawImage(this.f80l, 0, this.f88t, 0);
        }
        this.f81m.setClip(0, 0, this.f78j, this.f88t);
        m47a(this.f81m, c0023aw, this.f82n - this.f88t, this.f83o - this.f88t, i4, z);
    }

    /* renamed from: a */
    public static void m45a(C0030bc c0030bc, int[] iArr) {
        if (c0030bc != null) {
            iArr[0] = c0030bc.m633g();
            iArr[1] = c0030bc.m634h();
        }
    }

    /* renamed from: a */
    private static void m46a(C0033bf c0033bf, int[] iArr, C0010aj c0010aj) {
        if (c0033bf != null) {
            if (c0010aj == null) {
                iArr[0] = 0;
                iArr[1] = 0;
                iArr[2] = c0033bf.f599b;
                iArr[3] = c0033bf.f600c;
                return;
            }
            iArr[0] = c0010aj.f95a;
            iArr[1] = c0010aj.f96b;
            iArr[2] = c0010aj.f97c;
            iArr[3] = c0010aj.f98d;
        }
    }

    /* renamed from: a */
    private void m47a(Graphics graphics, C0023aw c0023aw, int i, int i2, int i3, boolean z) {
        this.f89u = Math.max(0, (i / c0023aw.f458c) + (graphics.getClipX() / c0023aw.f458c));
        this.f90v = Math.max(0, (i2 / c0023aw.f459d) + (graphics.getClipY() / c0023aw.f459d));
        this.f91w = Math.min((int) c0023aw.f462g, this.f89u + (graphics.getClipWidth() / c0023aw.f458c) + 1);
        this.f92x = Math.min((int) c0023aw.f463h, this.f90v + (graphics.getClipHeight() / c0023aw.f459d) + 1);
        if (c0023aw.f465j != null) {
            int i4 = this.f89u;
            while (true) {
                int i5 = i4;
                if (i5 >= this.f91w) {
                    break;
                }
                int i6 = this.f90v;
                while (true) {
                    int i7 = i6;
                    if (i7 < this.f92x) {
                        if (c0023aw.f465j[i5][i7] != null && (((c0023aw.f458c * i5) - i) + c0023aw.f458c) - graphics.getClipX() > 0 && ((c0023aw.f458c * i5) - i) - graphics.getClipX() < graphics.getClipWidth() && (((c0023aw.f459d * i7) - i2) + c0023aw.f459d) - graphics.getClipY() > 0 && ((c0023aw.f459d * i7) - i2) - graphics.getClipY() < graphics.getClipHeight()) {
                            if (!m50b(i5, i7) || C0047bt.f1214hH == null) {
                                m65a(graphics, c0023aw.f465j[i5][i7], (int[]) null, 0, 0, (c0023aw.f458c * i5) - i, (c0023aw.f459d * i7) - i2, i3);
                            } else {
                                m63a(graphics, C0047bt.f1214hH, (int[]) null, C0047bt.f1215hI, 0, 0, (c0023aw.f458c * i5) - i, (c0023aw.f459d * i7) - i2, 0, i3);
                            }
                        }
                        i6 = i7 + 1;
                    }
                }
                i4 = i5 + 1;
            }
        }
        if (c0023aw.f466k != null) {
            int i8 = 0;
            while (true) {
                int i9 = i8;
                if (i9 >= c0023aw.f466k.length) {
                    break;
                }
                if (c0023aw.f466k[i9] != null) {
                    m58a(c0023aw.f466k[i9], this.f76g);
                    if (((c0023aw.f466k[i9].f1797e - i) + this.f76g[0]) - graphics.getClipX() > 0 && (c0023aw.f466k[i9].f1797e - i) - graphics.getClipX() < graphics.getClipWidth() && ((c0023aw.f466k[i9].f1798f - i2) + this.f76g[1]) - graphics.getClipY() > 0 && (c0023aw.f466k[i9].f1798f - i2) - graphics.getClipY() < graphics.getClipHeight()) {
                        m65a(graphics, c0023aw.f466k[i9], (int[]) null, i, i2, c0023aw.f466k[i9].f1797e, c0023aw.f466k[i9].f1798f, i3);
                    }
                }
                i8 = i9 + 1;
            }
        }
        if (c0023aw.f467l != null) {
            int i10 = 0;
            while (true) {
                int i11 = i10;
                if (i11 >= c0023aw.f467l.length) {
                    break;
                }
                if (c0023aw.f467l[i11] != null && c0023aw.f467l[i11].f1793a != null && (c0023aw.f467l[i11].f1793a.f1956o != 2 || ((C0030bc) c0023aw.f467l[i11].f1793a).f571k == null || ((C0030bc) c0023aw.f467l[i11].f1793a).f571k.length <= 1)) {
                    m58a(c0023aw.f467l[i11], this.f76g);
                    if (((c0023aw.f467l[i11].f1797e - i) + this.f76g[0]) - graphics.getClipX() > 0 && (c0023aw.f467l[i11].f1797e - i) - graphics.getClipX() < graphics.getClipWidth() && ((c0023aw.f467l[i11].f1798f - i2) + this.f76g[1]) - graphics.getClipY() > 0 && (c0023aw.f467l[i11].f1798f - i2) - graphics.getClipY() < graphics.getClipHeight()) {
                        m65a(graphics, c0023aw.f467l[i11], (int[]) null, i, i2, c0023aw.f467l[i11].f1797e, c0023aw.f467l[i11].f1798f, i3);
                    }
                }
                i10 = i11 + 1;
            }
        }
        if (C0047bt.f1766t == null || !z) {
            return;
        }
        int i12 = 0;
        while (true) {
            int i13 = i12;
            if (i13 >= C0047bt.f1766t.length) {
                return;
            }
            if (C0047bt.f1766t[i13] != null) {
                if (C0015ao.f145aW[3] == 0 && C0047bt.f1766t[i13].f510b != null) {
                    graphics.setFont(C0088t.f2523i);
                    C0055ca.m1298a(graphics, C0047bt.f1766t[i13].f510b, C0047bt.f1766t[i13].f511c - i, ((C0047bt.f1766t[i13].f512d - (C0047bt.f1766t[i13].f531w == null ? (short) 30 : C0047bt.f1766t[i13].f531w.m636j())) - C0088t.f2524j) - i2, 17, 255, 16777215);
                }
                if (C0047bt.f1766t[i13].f531w != null && C0047bt.f1766t[i13].f531w.f571k != null && C0015ao.f145aW[10] == 1) {
                    m66a(graphics, C0047bt.f1766t[i13].f531w.f571k[C0047bt.f1766t[i13].f531w.f566f], C0047bt.f1766t[i13].f531w.m633g(), C0047bt.f1766t[i13].f531w.m634h(), null, i, i2, C0047bt.f1766t[i13].f511c, C0047bt.f1766t[i13].f512d, 20, i3);
                    graphics.setFont(C0088t.f2523i);
                }
            }
            i12 = i13 + 1;
        }
    }

    /* renamed from: a */
    private void m48a(Graphics graphics, C0051bx c0051bx, int[] iArr, int i, int i2, int i3, int i4, int i5, int i6) {
        if (c0051bx == null || c0051bx.f1793a == null) {
            return;
        }
        switch (c0051bx.f1793a.f1956o) {
            case 0:
                m64a(graphics, (C0033bf) c0051bx.f1793a, iArr, c0051bx.m1019a(), i, i2, i3 + c0051bx.f1797e, i4 + c0051bx.f1798f, 20, c0051bx.f1799g);
                break;
            case 2:
                m62a(graphics, (C0030bc) c0051bx.f1793a, iArr, i, i2, i3 + c0051bx.f1797e, i4 + c0051bx.f1798f, 20, i6);
                break;
        }
    }

    /* renamed from: a */
    public static boolean m49a(int[] iArr, int[] iArr2) {
        return Math.abs((iArr[0] + (iArr[2] / 2)) - (iArr2[0] + (iArr2[2] / 2))) < (iArr[2] / 2) + (iArr2[2] / 2) && Math.abs((iArr[1] + (iArr[3] / 2)) - (iArr2[1] + (iArr2[3] / 2))) < (iArr[3] / 2) + (iArr2[3] / 2);
    }

    /* renamed from: b */
    private static boolean m50b(int i, int i2) {
        if (C0047bt.f1213hG == -1 || C0047bt.f1213hG != C0047bt.f879ar || C0047bt.f1216hJ == null || C0047bt.f1217hK == null) {
            return false;
        }
        for (short s = 0; s < C0047bt.f1216hJ.length; s = (short) (s + 1)) {
            if (C0047bt.f1216hJ[s] == i && C0047bt.f1217hK[s] == i2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private static byte[] m51b() {
        try {
            return "版权归苏龙德所有".getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public final byte m52a(C0023aw c0023aw, int i, int i2) {
        if (c0023aw == null || c0023aw.f464i == null) {
            return (byte) 0;
        }
        if (i < 0 || i > c0023aw.f456a || i2 < 0 || i2 >= c0023aw.f457b) {
            return (byte) 1;
        }
        int length = i / c0023aw.f460e;
        int length2 = i2 / c0023aw.f461f;
        if (length < 0) {
            length = 0;
        } else if (length >= c0023aw.f464i.length) {
            length = c0023aw.f464i.length - 1;
        }
        if (length2 < 0) {
            length2 = 0;
        } else if (length2 >= c0023aw.f464i[0].length) {
            length2 = c0023aw.f464i[0].length - 1;
        }
        if (m50b(length, length2)) {
            return (byte) 0;
        }
        return c0023aw.f464i[length][length2];
    }

    /* renamed from: a */
    public final void m53a() {
        this.f93y = null;
        this.f94z = null;
    }

    /* renamed from: a */
    public final void m54a(int i, int i2, int i3, int i4) {
        int i5 = (((this.f88t + i3) - 1) / this.f88t) * this.f88t;
        int i6 = (((this.f88t + i4) - 1) / this.f88t) * this.f88t;
        this.f82n = -1;
        this.f83o = -1;
        if (this.f80l == null) {
            this.f80l = Image.createImage((this.f88t * 2) + i5, (this.f88t * 2) + i6);
            this.f81m = this.f80l.getGraphics();
        }
        this.f84p = i;
        this.f85q = i2;
        this.f86r = i3;
        this.f87s = i4;
        this.f78j = i5 + (this.f88t * 2);
        this.f79k = (this.f88t * 2) + i6;
    }

    /* renamed from: a */
    public final void m55a(C0023aw c0023aw, int i) {
        this.f74e = c0023aw.f456a / i;
        this.f75f = c0023aw.f457b / i;
        this.f93y = Image.createImage(this.f74e, this.f75f);
        this.f94z = this.f93y.getGraphics();
        this.f94z.setColor(8487297);
        this.f94z.fillRect(0, 0, this.f74e, this.f75f);
        this.f94z.setColor(352261);
        if (c0023aw.f464i != null) {
            for (int i2 = 0; i2 < c0023aw.f464i.length; i2++) {
                for (int i3 = 0; i3 < c0023aw.f464i[i2].length; i3++) {
                    if (c0023aw.f464i[i2][i3] == 1) {
                        this.f94z.fillRect((c0023aw.f460e * i2) / i, (c0023aw.f461f * i3) / i, 2, 2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void m56a(C0023aw c0023aw, int i, int i2, boolean z) {
        this.f82n = -1;
        this.f83o = -1;
        if (this.f84p != 0 || this.f85q != 0) {
            this.f81m.setColor(0);
            this.f81m.fillRect(0, 0, this.f78j, this.f79k);
        }
        m44a(c0023aw, i, i2, 0, 0, false);
        if (C0015ao.f132A != null) {
            RunnableC0066a.f2114f.f81m.drawImage(C0015ao.f132A, (this.f78j - C0015ao.f132A.getWidth()) >> 1, ((this.f79k - C0015ao.f132A.getHeight()) - 16) >> 1, 20);
        }
        C0055ca.m1293a(this.f81m, 4017771, 159, 0, 0, this.f78j, this.f79k);
    }

    /* renamed from: a */
    public final void m57a(C0023aw c0023aw, int i, int i2, boolean z, boolean z2, int i3) {
        this.f82n = -1;
        this.f83o = -1;
        if (this.f84p != 0 || this.f85q != 0) {
            this.f81m.setColor(0);
            this.f81m.fillRect(0, 0, this.f78j, this.f79k);
        }
        m44a(c0023aw, i, i2, 0, 0, z);
        if (z2) {
            C0055ca.m1293a(this.f81m, i3, 175, 0, 0, this.f78j, this.f79k);
        }
    }

    /* renamed from: a */
    public final void m58a(C0051bx c0051bx, int[] iArr) {
        if (c0051bx.f1793a == null) {
        }
        switch (c0051bx.f1793a.f1956o) {
            case 0:
                C0033bf c0033bf = (C0033bf) c0051bx.f1793a;
                int[] iArr2 = this.f76g;
                C0010aj c0010ajM650a = ((C0033bf) c0051bx.f1793a).m650a(c0051bx.f1796d);
                if (c0033bf != null) {
                    if (c0010ajM650a == null) {
                        iArr2[0] = c0033bf.f599b;
                        iArr2[1] = c0033bf.f600c;
                    } else {
                        iArr2[0] = c0010ajM650a.f97c;
                        iArr2[1] = c0010ajM650a.f98d;
                    }
                }
                byte b = c0051bx.f1799g;
                int i = this.f76g[0];
                int i2 = this.f76g[1];
                switch (b) {
                    case 0:
                        iArr[0] = i;
                        iArr[1] = i2;
                        break;
                    case 1:
                        iArr[0] = i2;
                        iArr[1] = i;
                        break;
                    case 2:
                        iArr[0] = i;
                        iArr[1] = i2;
                        break;
                    case 3:
                        iArr[0] = i2;
                        iArr[1] = i;
                        break;
                    case 4:
                        iArr[0] = i;
                        iArr[1] = i2;
                        break;
                    case 5:
                        iArr[0] = i2;
                        iArr[1] = i;
                        break;
                    case 6:
                        iArr[0] = i;
                        iArr[1] = i2;
                        break;
                    case 7:
                        iArr[0] = i2;
                        iArr[1] = i;
                        break;
                    default:
                        iArr[0] = i;
                        iArr[1] = i2;
                        break;
                }
            case 1:
            default:
                iArr[0] = 0;
                iArr[1] = 0;
                break;
            case 2:
                m45a((C0030bc) c0051bx.f1793a, iArr);
                break;
        }
    }

    /* renamed from: a */
    public final void m59a(Graphics graphics, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.f93y != null) {
            graphics.drawRegion(this.f93y, 0, 0, this.f74e, this.f75f, 0, 2, i4, 0);
            graphics.setColor(0);
            graphics.drawRect(1, i4 - 1, this.f74e + 1, this.f75f + 1);
            graphics.setColor(16711680);
            graphics.fillRect(i + 2, i4 + i2, i5, i6);
        }
    }

    /* renamed from: a */
    public final void m60a(Graphics graphics, C0023aw c0023aw, int i, int i2) {
        if (C0088t.f2516b - c0023aw.f456a > 0) {
            graphics.setClip((C0088t.f2516b - c0023aw.f456a) / 2, this.f85q, c0023aw.f456a, c0023aw.f457b);
        } else {
            graphics.setClip(this.f84p, this.f85q, this.f86r, this.f87s);
        }
        graphics.drawImage(this.f80l, (this.f84p + (this.f82n - i)) - this.f88t, (this.f85q + (this.f83o - i2)) - this.f88t, 0);
        graphics.setClip(0, 0, this.f78j, this.f79k);
    }

    /* renamed from: a */
    public final void m61a(Graphics graphics, C0023aw c0023aw, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        graphics.setClip(this.f84p, this.f85q, c0023aw.f456a < this.f86r ? c0023aw.f456a : this.f86r, c0023aw.f457b < this.f87s ? c0023aw.f457b : this.f87s);
        m44a(c0023aw, i, i2, 0, 0, true);
        graphics.setClip(this.f84p, this.f85q, c0023aw.f456a < this.f86r ? c0023aw.f456a : this.f86r, c0023aw.f457b < this.f87s ? c0023aw.f457b : this.f87s);
        graphics.drawImage(this.f80l, (this.f84p + (this.f82n - i)) - this.f88t, (this.f85q + (this.f83o - i2)) - this.f88t, 0);
        graphics.setClip(0, 0, this.f78j, this.f79k);
    }

    /* renamed from: a */
    public final void m62a(Graphics graphics, C0030bc c0030bc, int[] iArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int iM634h;
        int iM633g;
        if (c0030bc == null || c0030bc.f571k == null || c0030bc.f566f >= c0030bc.f571k.length || c0030bc.f571k[c0030bc.f566f] == null) {
            return;
        }
        if (i5 == 3) {
            int iM633g2 = i3 - (c0030bc.m633g() >> 1);
            iM634h = i4 - (c0030bc.m634h() >> 1);
            iM633g = iM633g2;
        } else if (i5 == 17) {
            iM634h = i4;
            iM633g = i3 - (c0030bc.m633g() >> 1);
        } else if (i5 == 33) {
            int iM633g3 = i3 - (c0030bc.m633g() >> 1);
            iM634h = i4 - c0030bc.m634h();
            iM633g = iM633g3;
        } else if (i5 == 36) {
            iM634h = i4 - c0030bc.m634h();
            iM633g = i3;
        } else {
            iM634h = i4;
            iM633g = i3;
        }
        int i7 = 0;
        while (true) {
            int i8 = i7;
            if (i8 >= c0030bc.f571k[c0030bc.f566f].length) {
                return;
            }
            if (c0030bc.f571k[c0030bc.f566f][i8] != null) {
                m48a(graphics, c0030bc.f571k[c0030bc.f566f][i8], iArr, i, i2, iM633g, iM634h, 20, i6);
            }
            i7 = i8 + 1;
        }
    }

    /* renamed from: a */
    public final void m63a(Graphics graphics, C0033bf c0033bf, int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (c0033bf == null || c0033bf.f601d == null || i < 0 || i >= c0033bf.f601d.length) {
            return;
        }
        m64a(graphics, c0033bf, (int[]) null, c0033bf.f601d[i], 0, 0, i4, i5, 0, i7);
    }

    /* renamed from: a */
    public final void m64a(Graphics graphics, C0033bf c0033bf, int[] iArr, C0010aj c0010aj, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i3 - i;
        int i8 = i4 - i2;
        if (c0033bf == null || c0033bf.f598a == null) {
            return;
        }
        if (iArr == null || iArr[2] <= 0 || iArr[3] <= 0) {
            if (c0010aj == null) {
                graphics.drawRegion(c0033bf.f598a, 0, 0, c0033bf.f599b, c0033bf.f600c, f72i[i6], i7, i8, i5);
                return;
            }
            m46a(c0033bf, this.f77h, c0010aj);
            short s = (short) this.f77h[0];
            short s2 = (short) this.f77h[1];
            short s3 = (short) this.f77h[2];
            short s4 = (short) this.f77h[3];
            if (s < 0 || s + s3 > c0033bf.f599b || s2 < 0 || s2 + s4 > c0033bf.f600c || s >= c0033bf.f599b || s2 >= c0033bf.f600c || s3 <= 0 || s4 <= 0) {
                return;
            }
            graphics.drawRegion(c0033bf.f598a, s, s2, s3, s4, f72i[i6], i7, i8, i5);
            return;
        }
        if (c0010aj == null) {
            graphics.setClip(iArr[0] - i, iArr[1] - i2, iArr[2], iArr[3]);
            graphics.drawRegion(c0033bf.f598a, 0, 0, c0033bf.f599b, c0033bf.f600c, f72i[i6], i7, i8, i5);
            return;
        }
        m46a(c0033bf, this.f77h, c0010aj);
        short s5 = (short) this.f77h[0];
        short s6 = (short) this.f77h[1];
        short s7 = (short) this.f77h[2];
        short s8 = (short) this.f77h[3];
        if (s5 < 0 || s5 + s7 > c0033bf.f599b || s6 < 0 || s6 + s8 > c0033bf.f600c || s5 >= c0033bf.f599b || s6 >= c0033bf.f600c || s7 <= 0 || s8 <= 0) {
            return;
        }
        graphics.setClip(iArr[0] - i, iArr[1] - i2, iArr[2], iArr[3]);
        graphics.drawRegion(c0033bf.f598a, s5, s6, s7, s8, f72i[i6], i7, i8, i5);
        graphics.setClip(this.f84p, this.f85q, this.f86r, this.f87s);
    }

    /* renamed from: a */
    public final void m65a(Graphics graphics, C0051bx c0051bx, int[] iArr, int i, int i2, int i3, int i4, int i5) {
        if (c0051bx == null || c0051bx.f1793a == null) {
            return;
        }
        switch (c0051bx.f1793a.f1956o) {
            case 0:
                m64a(graphics, (C0033bf) c0051bx.f1793a, iArr, c0051bx.m1019a(), i, i2, i3, i4, 0, c0051bx.f1799g);
                break;
            case 2:
                m62a(graphics, (C0030bc) c0051bx.f1793a, iArr, i, i2, i3, i4, 0, i5);
                break;
        }
    }

    /* renamed from: a */
    public final void m66a(Graphics graphics, C0051bx[] c0051bxArr, short s, short s2, int[] iArr, int i, int i2, int i3, int i4, int i5, int i6) {
        if (c0051bxArr == null) {
            return;
        }
        int i7 = 0;
        while (true) {
            int i8 = i7;
            if (i8 >= c0051bxArr.length) {
                return;
            }
            m48a(graphics, c0051bxArr[i8], iArr, i, i2, i3, i4, 20, i6);
            i7 = i8 + 1;
        }
    }

    /* renamed from: a */
    public final void m67a(int[] iArr, int[] iArr2, int[] iArr3) {
        char c = (iArr2[0] < iArr[0] || iArr2[0] + iArr2[2] > iArr[0] + iArr[2] || iArr2[1] < iArr[1] || iArr2[1] + iArr2[3] > iArr[1] + iArr[3]) ? (iArr[0] < iArr2[0] || iArr[0] + iArr[2] > iArr2[0] + iArr2[2] || iArr[1] < iArr2[1] || iArr[1] + iArr[3] > iArr2[1] + iArr2[3]) ? (char) 0 : (char) 1 : (char) 65535;
        if (c != 0) {
            if (c == 65535) {
                iArr3[0] = iArr2[0];
                iArr3[1] = iArr2[1];
                iArr3[2] = iArr2[2];
                iArr3[3] = iArr2[3];
                return;
            }
            iArr3[0] = iArr[0];
            iArr3[1] = iArr[1];
            iArr3[2] = iArr[2];
            iArr3[3] = iArr[3];
            return;
        }
        if (iArr[0] <= iArr2[0]) {
            if (iArr2[0] <= iArr[0] + iArr[2]) {
                int i = iArr2[0] + iArr2[2] <= iArr[0] + iArr[2] ? iArr2[2] : (iArr[0] + iArr[2]) - iArr2[0];
                if (iArr2[1] < iArr[1] && iArr2[1] + iArr2[3] > iArr[1]) {
                    int i2 = iArr[1] + iArr[3] <= iArr2[1] + iArr2[3] ? iArr[3] : (iArr2[1] + iArr2[3]) - iArr[1];
                    iArr3[0] = iArr2[0];
                    iArr3[1] = iArr[1];
                    iArr3[2] = i;
                    iArr3[3] = i2;
                }
                if (iArr2[1] < iArr[1] || iArr2[1] > iArr[1] + iArr[3]) {
                    return;
                }
                int i3 = iArr2[1] + iArr2[3] <= iArr[1] + iArr[3] ? iArr2[3] : (iArr[1] + iArr[3]) - iArr2[1];
                iArr3[0] = iArr2[0];
                iArr3[1] = iArr2[1];
                iArr3[2] = i;
                iArr3[3] = i3;
                return;
            }
            return;
        }
        if (iArr[0] <= iArr2[0] + iArr2[2]) {
            int i4 = iArr[0] + iArr[2] <= iArr2[0] + iArr2[2] ? iArr[2] : (iArr2[0] + iArr2[2]) - iArr[0];
            if (iArr2[1] < iArr[1] && iArr2[1] + iArr2[3] > iArr[1]) {
                int i5 = iArr[1] + iArr[3] <= iArr2[1] + iArr2[3] ? iArr[3] : (iArr2[1] + iArr2[3]) - iArr[1];
                iArr3[0] = iArr[0];
                iArr3[1] = iArr[1];
                iArr3[2] = i4;
                iArr3[3] = i5;
            }
            if (iArr2[1] < iArr[1] || iArr2[1] > iArr[1] + iArr[3]) {
                return;
            }
            int i6 = iArr2[1] + iArr2[3] <= iArr[1] + iArr[3] ? iArr2[3] : (iArr[1] + iArr[3]) - iArr2[1];
            iArr3[0] = iArr[0];
            iArr3[1] = iArr2[1];
            iArr3[2] = i4;
            iArr3[3] = i6;
        }
    }

    /* renamed from: a */
    public final boolean m68a(int i, int i2) {
        if (C0047bt.f1295ij == null) {
            return false;
        }
        for (int i3 = 0; i3 < C0047bt.f1295ij.size(); i3++) {
            this.f73A = (C0049bv) C0047bt.f1295ij.elementAt(i3);
            if (this.f73A.f1781d != null && i >= this.f73A.f1782e + this.f73A.f1781d.m629c() && i <= this.f73A.f1782e + this.f73A.f1781d.m629c() + this.f73A.f1781d.m631e() && i2 >= this.f73A.f1783f + this.f73A.f1781d.m630d() && i2 <= this.f73A.f1783f + this.f73A.f1781d.m630d() + this.f73A.f1781d.m632f()) {
                return true;
            }
        }
        return false;
    }
}

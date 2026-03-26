package defpackage;

import com.yinhan.kjava.main.a;
import java.io.UnsupportedEncodingException;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* loaded from: java版梦回西游3区251011.jar:ai.class */
public final class ai {
    private int r;
    private int s;
    private int u;
    private int v;
    private int w;
    private int x;
    private Image y;
    public int e;
    public int f;
    private Graphics z;
    public static final String[] a = {"sBIT", "IHDR", "PLTE", "tRNS", "IDAT"};
    public static byte[] b = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static byte[] c = {0, 0, 0, 0, 73, 69, 78, 68, -82, 66, 96, -126};
    public static final byte[] d = b();
    private static byte[] i = {0, 5, 3, 6, 2, 7, 1, 4};
    private int[] g = new int[2];
    private int[] h = new int[4];
    private int j = 0;
    private int k = 0;
    private Image l = null;
    private Graphics m = null;
    private int n = 0;
    private int o = 0;
    private int p = -1;
    private int q = -1;
    private int t = 16;
    private bv A = null;

    /* JADX WARN: Type inference failed for: r0v3, types: [byte[], java.lang.Throwable] */
    private static byte[] b() throws UnsupportedEncodingException {
        ?? bytes;
        try {
            bytes = "版权归苏龙德所有".getBytes("UTF-8");
            return bytes;
        } catch (UnsupportedEncodingException e) {
            bytes.printStackTrace();
            return null;
        }
    }

    public final byte a(aw awVar, int i2, int i3) {
        if (awVar == null || awVar.i == null) {
            return (byte) 0;
        }
        if (i2 < 0 || i2 > awVar.a || i3 < 0 || i3 >= awVar.b) {
            return (byte) 1;
        }
        int i4 = i2 / awVar.e;
        int i5 = i3 / awVar.f;
        int length = i4 < 0 ? 0 : i4 >= awVar.i.length ? awVar.i.length - 1 : i4;
        int length2 = i5 < 0 ? 0 : i5 >= awVar.i[0].length ? awVar.i[0].length - 1 : i5;
        if (b(length, length2)) {
            return (byte) 0;
        }
        return awVar.i[length][length2];
    }

    private static boolean b(int i2, int i3) {
        if (bt.hG == -1 || bt.hG != bt.ar || bt.hJ == null || bt.hK == null) {
            return false;
        }
        short s = 0;
        while (true) {
            short s2 = s;
            if (s2 >= bt.hJ.length) {
                return false;
            }
            if (bt.hJ[s2] == i2 && bt.hK[s2] == i3) {
                return true;
            }
            s = (short) (s2 + 1);
        }
    }

    public static int a(bc bcVar, long j) {
        if (bcVar == null || bcVar.k == null) {
            return 2;
        }
        int i2 = 0;
        if ((j - bcVar.e) - bcVar.d > 0) {
            bcVar.f = (byte) (bcVar.f + 1);
            if (bcVar.f >= bcVar.k.length) {
                bcVar.f = (byte) 0;
                i2 = 2;
            } else {
                i2 = 1;
            }
            bcVar.e = j;
        }
        return i2;
    }

    public final void a(Graphics graphics, bx bxVar, int[] iArr, int i2, int i3, int i4, int i5, int i6) {
        if (bxVar == null || bxVar.a == null) {
            return;
        }
        switch (bxVar.a.o) {
            case 0:
                a(graphics, (bf) bxVar.a, iArr, bxVar.a(), i2, i3, i4, i5, 0, bxVar.g);
                break;
            case 2:
                a(graphics, (bc) bxVar.a, iArr, i2, i3, i4, i5, 0, i6);
                break;
        }
    }

    private void a(Graphics graphics, bx bxVar, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (bxVar == null || bxVar.a == null) {
            return;
        }
        switch (bxVar.a.o) {
            case 0:
                a(graphics, (bf) bxVar.a, iArr, bxVar.a(), i2, i3, i4 + bxVar.e, i5 + bxVar.f, 20, bxVar.g);
                break;
            case 2:
                a(graphics, (bc) bxVar.a, iArr, i2, i3, i4 + bxVar.e, i5 + bxVar.f, 20, i7);
                break;
        }
    }

    public final void a(Graphics graphics, bf bfVar, int[] iArr, aj ajVar, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = i4 - i2;
        int i9 = i5 - i3;
        if (bfVar == null || bfVar.a == null) {
            return;
        }
        if (iArr == null || iArr[2] <= 0 || iArr[3] <= 0) {
            if (ajVar == null) {
                graphics.drawRegion(bfVar.a, 0, 0, bfVar.b, bfVar.c, i[i7], i8, i9, i6);
                return;
            }
            a(bfVar, this.h, ajVar);
            short s = (short) this.h[0];
            short s2 = (short) this.h[1];
            short s3 = (short) this.h[2];
            short s4 = (short) this.h[3];
            if (s < 0 || s + s3 > bfVar.b || s2 < 0 || s2 + s4 > bfVar.c || s >= bfVar.b || s2 >= bfVar.c || s3 <= 0 || s4 <= 0) {
                return;
            }
            graphics.drawRegion(bfVar.a, s, s2, s3, s4, i[i7], i8, i9, i6);
            return;
        }
        if (ajVar == null) {
            graphics.setClip(iArr[0] - i2, iArr[1] - i3, iArr[2], iArr[3]);
            graphics.drawRegion(bfVar.a, 0, 0, bfVar.b, bfVar.c, i[i7], i8, i9, i6);
            return;
        }
        a(bfVar, this.h, ajVar);
        short s5 = (short) this.h[0];
        short s6 = (short) this.h[1];
        short s7 = (short) this.h[2];
        short s8 = (short) this.h[3];
        if (s5 < 0 || s5 + s7 > bfVar.b || s6 < 0 || s6 + s8 > bfVar.c || s5 >= bfVar.b || s6 >= bfVar.c || s7 <= 0 || s8 <= 0) {
            return;
        }
        graphics.setClip(iArr[0] - i2, iArr[1] - i3, iArr[2], iArr[3]);
        graphics.drawRegion(bfVar.a, s5, s6, s7, s8, i[i7], i8, i9, i6);
        graphics.setClip(this.p, this.q, this.r, this.s);
    }

    public final void a(Graphics graphics, bf bfVar, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (bfVar == null || bfVar.d == null || i2 < 0 || i2 >= bfVar.d.length) {
            return;
        }
        a(graphics, bfVar, (int[]) null, bfVar.d[i2], 0, 0, i5, i6, 0, i8);
    }

    public final void a(Graphics graphics, bc bcVar, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (bcVar == null || bcVar.k == null || bcVar.f >= bcVar.k.length || bcVar.k[bcVar.f] == null) {
            return;
        }
        if (i6 == 3) {
            i4 -= bcVar.g() >> 1;
            i5 -= bcVar.h() >> 1;
        } else if (i6 == 17) {
            i4 -= bcVar.g() >> 1;
        } else if (i6 == 33) {
            i4 -= bcVar.g() >> 1;
            i5 -= bcVar.h();
        } else if (i6 == 36) {
            i5 -= bcVar.h();
        }
        for (int i8 = 0; i8 < bcVar.k[bcVar.f].length; i8++) {
            if (bcVar.k[bcVar.f][i8] != null) {
                a(graphics, bcVar.k[bcVar.f][i8], iArr, i2, i3, i4, i5, 20, i7);
            }
        }
    }

    public final void a(Graphics graphics, bx[] bxVarArr, short s, short s2, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (bxVarArr == null) {
            return;
        }
        for (bx bxVar : bxVarArr) {
            a(graphics, bxVar, iArr, i2, i3, i4, i5, 20, i7);
        }
    }

    public final void a(int i2, int i3, int i4, int i5) {
        int i6 = (((i4 + this.t) - 1) / this.t) * this.t;
        int i7 = (((i5 + this.t) - 1) / this.t) * this.t;
        this.n = -1;
        this.o = -1;
        if (this.l == null) {
            this.l = Image.createImage(i6 + (2 * this.t), i7 + (2 * this.t));
            this.m = this.l.getGraphics();
        }
        this.p = i2;
        this.q = i3;
        this.r = i4;
        this.s = i5;
        this.j = i6 + (2 * this.t);
        this.k = i7 + (2 * this.t);
    }

    private void a(aw awVar, int i2, int i3, int i4, int i5, boolean z) {
        this.m.setClip(0, 0, this.j, this.k);
        if (this.n == -1 && this.o == -1) {
            a(this.m, awVar, i2 - this.t, i3 - this.t, i5, z);
            this.n = i2;
            this.o = i3;
            return;
        }
        if (this.n - i2 >= this.t) {
            this.n -= this.t;
            for (int i6 = this.j / this.t; i6 > 0; i6--) {
                this.m.setClip(i6 * this.t, 0, this.t, this.k);
                this.m.drawImage(this.l, this.t, 0, 0);
            }
            this.m.setClip(0, 0, this.t, this.k);
            a(this.m, awVar, this.n - this.t, this.o - this.t, i5, z);
            return;
        }
        if (this.n - i2 <= (-this.t)) {
            this.n += this.t;
            this.m.setClip(0, 0, this.j - this.t, this.k);
            this.m.drawImage(this.l, -this.t, 0, 0);
            this.m.setClip(this.j - this.t, 0, this.t, this.k);
            a(this.m, awVar, this.n - this.t, this.o - this.t, i5, z);
            return;
        }
        if (this.o - i3 < this.t) {
            if (this.o - i3 <= (-this.t)) {
                this.o += this.t;
                this.m.setClip(0, 0, this.j, this.k - this.t);
                this.m.drawImage(this.l, 0, -this.t, 0);
                this.m.setClip(0, this.k - this.t, this.j, this.t);
                a(this.m, awVar, this.n - this.t, this.o - this.t, i5, z);
                return;
            }
            return;
        }
        this.o -= this.t;
        for (int i7 = this.k / this.t; i7 > 0; i7--) {
            this.m.setClip(0, i7 * this.t, this.j, this.t);
            this.m.drawImage(this.l, 0, this.t, 0);
        }
        this.m.setClip(0, 0, this.j, this.t);
        a(this.m, awVar, this.n - this.t, this.o - this.t, i5, z);
    }

    public final void a(Graphics graphics, aw awVar, int i2, int i3, int i4, int i5, boolean z, boolean z2) {
        graphics.setClip(this.p, this.q, awVar.a < this.r ? awVar.a : this.r, awVar.b < this.s ? awVar.b : this.s);
        a(awVar, i2, i3, 0, 0, true);
        graphics.setClip(this.p, this.q, awVar.a < this.r ? awVar.a : this.r, awVar.b < this.s ? awVar.b : this.s);
        graphics.drawImage(this.l, (this.p + (this.n - i2)) - this.t, (this.q + (this.o - i3)) - this.t, 0);
        graphics.setClip(0, 0, this.j, this.k);
    }

    public final void a(Graphics graphics, aw awVar, int i2, int i3) {
        if (t.b - awVar.a > 0) {
            graphics.setClip((t.b - awVar.a) / 2, this.q, awVar.a, awVar.b);
        } else {
            graphics.setClip(this.p, this.q, this.r, this.s);
        }
        graphics.drawImage(this.l, (this.p + (this.n - i2)) - this.t, (this.q + (this.o - i3)) - this.t, 0);
        graphics.setClip(0, 0, this.j, this.k);
    }

    public final void a(aw awVar, int i2, int i3, boolean z) {
        this.n = -1;
        this.o = -1;
        if (this.p != 0 || this.q != 0) {
            this.m.setColor(0);
            this.m.fillRect(0, 0, this.j, this.k);
        }
        a(awVar, i2, i3, 0, 0, false);
        if (ao.A != null) {
            a.f.m.drawImage(ao.A, (this.j - ao.A.getWidth()) >> 1, ((this.k - ao.A.getHeight()) - 16) >> 1, 20);
        }
        ca.a(this.m, 4017771, 159, 0, 0, this.j, this.k);
    }

    public final void a(aw awVar, int i2, int i3, boolean z, boolean z2, int i4) {
        this.n = -1;
        this.o = -1;
        if (this.p != 0 || this.q != 0) {
            this.m.setColor(0);
            this.m.fillRect(0, 0, this.j, this.k);
        }
        a(awVar, i2, i3, 0, 0, z);
        if (z2) {
            ca.a(this.m, i4, 175, 0, 0, this.j, this.k);
        }
    }

    private void a(Graphics graphics, aw awVar, int i2, int i3, int i4, boolean z) {
        this.u = Math.max(0, (i2 / awVar.c) + (graphics.getClipX() / awVar.c));
        this.v = Math.max(0, (i3 / awVar.d) + (graphics.getClipY() / awVar.d));
        this.w = Math.min((int) awVar.g, this.u + (graphics.getClipWidth() / awVar.c) + 1);
        this.x = Math.min((int) awVar.h, this.v + (graphics.getClipHeight() / awVar.d) + 1);
        if (awVar.j != null) {
            for (int i5 = this.u; i5 < this.w; i5++) {
                for (int i6 = this.v; i6 < this.x; i6++) {
                    if (awVar.j[i5][i6] != null && (((i5 * awVar.c) - i2) + awVar.c) - graphics.getClipX() > 0 && ((i5 * awVar.c) - i2) - graphics.getClipX() < graphics.getClipWidth() && (((i6 * awVar.d) - i3) + awVar.d) - graphics.getClipY() > 0 && ((i6 * awVar.d) - i3) - graphics.getClipY() < graphics.getClipHeight()) {
                        if (!b(i5, i6) || bt.hH == null) {
                            a(graphics, awVar.j[i5][i6], (int[]) null, 0, 0, (i5 * awVar.c) - i2, (i6 * awVar.d) - i3, i4);
                        } else {
                            a(graphics, bt.hH, (int[]) null, bt.hI, 0, 0, (i5 * awVar.c) - i2, (i6 * awVar.d) - i3, 0, i4);
                        }
                    }
                }
            }
        }
        if (awVar.k != null) {
            for (int i7 = 0; i7 < awVar.k.length; i7++) {
                if (awVar.k[i7] != null) {
                    a(awVar.k[i7], this.g);
                    if (((awVar.k[i7].e - i2) + this.g[0]) - graphics.getClipX() > 0 && (awVar.k[i7].e - i2) - graphics.getClipX() < graphics.getClipWidth() && ((awVar.k[i7].f - i3) + this.g[1]) - graphics.getClipY() > 0 && (awVar.k[i7].f - i3) - graphics.getClipY() < graphics.getClipHeight()) {
                        a(graphics, awVar.k[i7], (int[]) null, i2, i3, awVar.k[i7].e, awVar.k[i7].f, i4);
                    }
                }
            }
        }
        if (awVar.l != null) {
            for (int i8 = 0; i8 < awVar.l.length; i8++) {
                if (awVar.l[i8] != null && awVar.l[i8].a != null && (awVar.l[i8].a.o != 2 || ((bc) awVar.l[i8].a).k == null || ((bc) awVar.l[i8].a).k.length <= 1)) {
                    a(awVar.l[i8], this.g);
                    if (((awVar.l[i8].e - i2) + this.g[0]) - graphics.getClipX() > 0 && (awVar.l[i8].e - i2) - graphics.getClipX() < graphics.getClipWidth() && ((awVar.l[i8].f - i3) + this.g[1]) - graphics.getClipY() > 0 && (awVar.l[i8].f - i3) - graphics.getClipY() < graphics.getClipHeight()) {
                        a(graphics, awVar.l[i8], (int[]) null, i2, i3, awVar.l[i8].e, awVar.l[i8].f, i4);
                    }
                }
            }
        }
        if (bt.t == null || !z) {
            return;
        }
        for (int i9 = 0; i9 < bt.t.length; i9++) {
            if (bt.t[i9] != null) {
                if (ao.aW[3] == 0 && bt.t[i9].b != null) {
                    graphics.setFont(t.i);
                    ca.a(graphics, bt.t[i9].b, bt.t[i9].c - i2, ((bt.t[i9].d - (bt.t[i9].w == null ? (short) 30 : bt.t[i9].w.j())) - t.j) - i3, 17, 255, 16777215);
                }
                if (bt.t[i9].w != null && bt.t[i9].w.k != null && ao.aW[10] == 1) {
                    a(graphics, bt.t[i9].w.k[bt.t[i9].w.f], bt.t[i9].w.g(), bt.t[i9].w.h(), null, i2, i3, bt.t[i9].c, bt.t[i9].d, 20, i4);
                    graphics.setFont(t.i);
                }
            }
        }
    }

    public final void a(aw awVar, int i2) {
        this.e = awVar.a / i2;
        this.f = awVar.b / i2;
        this.y = Image.createImage(this.e, this.f);
        this.z = this.y.getGraphics();
        this.z.setColor(8487297);
        this.z.fillRect(0, 0, this.e, this.f);
        this.z.setColor(352261);
        if (awVar.i != null) {
            for (int i3 = 0; i3 < awVar.i.length; i3++) {
                for (int i4 = 0; i4 < awVar.i[i3].length; i4++) {
                    if (awVar.i[i3][i4] == 1) {
                        this.z.fillRect((i3 * awVar.e) / i2, (i4 * awVar.f) / i2, 2, 2);
                    }
                }
            }
        }
    }

    public final void a() {
        this.y = null;
        this.z = null;
    }

    public final void a(Graphics graphics, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        if (this.y != null) {
            graphics.drawRegion(this.y, 0, 0, this.e, this.f, 0, 2, i5, 0);
            graphics.setColor(0);
            graphics.drawRect(1, i5 - 1, this.e + 1, this.f + 1);
            graphics.setColor(16711680);
            graphics.fillRect(i2 + 2, i5 + i3, i6, i7);
        }
    }

    public final void a(bx bxVar, int[] iArr) {
        if (bxVar.a == null) {
        }
        switch (bxVar.a.o) {
            case 0:
                bf bfVar = (bf) bxVar.a;
                int[] iArr2 = this.g;
                aj ajVarA = ((bf) bxVar.a).a(bxVar.d);
                if (bfVar != null) {
                    if (ajVarA == null) {
                        iArr2[0] = bfVar.b;
                        iArr2[1] = bfVar.c;
                    } else {
                        iArr2[0] = ajVarA.c;
                        iArr2[1] = ajVarA.d;
                    }
                }
                byte b2 = bxVar.g;
                int i2 = this.g[0];
                int i3 = this.g[1];
                switch (b2) {
                    case 0:
                        iArr[0] = i2;
                        iArr[1] = i3;
                        break;
                    case 1:
                        iArr[0] = i3;
                        iArr[1] = i2;
                        break;
                    case 2:
                        iArr[0] = i2;
                        iArr[1] = i3;
                        break;
                    case 3:
                        iArr[0] = i3;
                        iArr[1] = i2;
                        break;
                    case 4:
                        iArr[0] = i2;
                        iArr[1] = i3;
                        break;
                    case 5:
                        iArr[0] = i3;
                        iArr[1] = i2;
                        break;
                    case 6:
                        iArr[0] = i2;
                        iArr[1] = i3;
                        break;
                    case 7:
                        iArr[0] = i3;
                        iArr[1] = i2;
                        break;
                    default:
                        iArr[0] = i2;
                        iArr[1] = i3;
                        break;
                }
            case 2:
                a((bc) bxVar.a, iArr);
                break;
            default:
                iArr[0] = 0;
                iArr[1] = 0;
                break;
        }
    }

    private static void a(bf bfVar, int[] iArr, aj ajVar) {
        if (bfVar != null) {
            if (ajVar == null) {
                iArr[0] = 0;
                iArr[1] = 0;
                iArr[2] = bfVar.b;
                iArr[3] = bfVar.c;
                return;
            }
            iArr[0] = ajVar.a;
            iArr[1] = ajVar.b;
            iArr[2] = ajVar.c;
            iArr[3] = ajVar.d;
        }
    }

    public static void a(bc bcVar, int[] iArr) {
        if (bcVar != null) {
            iArr[0] = bcVar.g();
            iArr[1] = bcVar.h();
        }
    }

    public static boolean a(int[] iArr, int[] iArr2) {
        return Math.abs((iArr[0] + (iArr[2] / 2)) - (iArr2[0] + (iArr2[2] / 2))) < (iArr[2] / 2) + (iArr2[2] / 2) && Math.abs((iArr[1] + (iArr[3] / 2)) - (iArr2[1] + (iArr2[3] / 2))) < (iArr[3] / 2) + (iArr2[3] / 2);
    }

    public final void a(int[] iArr, int[] iArr2, int[] iArr3) {
        char c2 = (iArr2[0] < iArr[0] || iArr2[0] + iArr2[2] > iArr[0] + iArr[2] || iArr2[1] < iArr[1] || iArr2[1] + iArr2[3] > iArr[1] + iArr[3]) ? (iArr[0] < iArr2[0] || iArr[0] + iArr[2] > iArr2[0] + iArr2[2] || iArr[1] < iArr2[1] || iArr[1] + iArr[3] > iArr2[1] + iArr2[3]) ? (char) 0 : (char) 1 : (char) 65535;
        char c3 = c2;
        if (c2 != 0) {
            if (c3 == 65535) {
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
                int i2 = iArr2[0] + iArr2[2] <= iArr[0] + iArr[2] ? iArr2[2] : (iArr[0] + iArr[2]) - iArr2[0];
                if (iArr2[1] < iArr[1] && iArr2[1] + iArr2[3] > iArr[1]) {
                    int i3 = iArr[1] + iArr[3] <= iArr2[1] + iArr2[3] ? iArr[3] : (iArr2[1] + iArr2[3]) - iArr[1];
                    iArr3[0] = iArr2[0];
                    iArr3[1] = iArr[1];
                    iArr3[2] = i2;
                    iArr3[3] = i3;
                }
                if (iArr2[1] < iArr[1] || iArr2[1] > iArr[1] + iArr[3]) {
                    return;
                }
                int i4 = iArr2[1] + iArr2[3] <= iArr[1] + iArr[3] ? iArr2[3] : (iArr[1] + iArr[3]) - iArr2[1];
                iArr3[0] = iArr2[0];
                iArr3[1] = iArr2[1];
                iArr3[2] = i2;
                iArr3[3] = i4;
                return;
            }
            return;
        }
        if (iArr[0] <= iArr2[0] + iArr2[2]) {
            int i5 = iArr[0] + iArr[2] <= iArr2[0] + iArr2[2] ? iArr[2] : (iArr2[0] + iArr2[2]) - iArr[0];
            if (iArr2[1] < iArr[1] && iArr2[1] + iArr2[3] > iArr[1]) {
                int i6 = iArr[1] + iArr[3] <= iArr2[1] + iArr2[3] ? iArr[3] : (iArr2[1] + iArr2[3]) - iArr[1];
                iArr3[0] = iArr[0];
                iArr3[1] = iArr[1];
                iArr3[2] = i5;
                iArr3[3] = i6;
            }
            if (iArr2[1] < iArr[1] || iArr2[1] > iArr[1] + iArr[3]) {
                return;
            }
            int i7 = iArr2[1] + iArr2[3] <= iArr[1] + iArr[3] ? iArr2[3] : (iArr[1] + iArr[3]) - iArr2[1];
            iArr3[0] = iArr[0];
            iArr3[1] = iArr2[1];
            iArr3[2] = i5;
            iArr3[3] = i7;
        }
    }

    public final boolean a(int i2, int i3) {
        if (bt.ij == null) {
            return false;
        }
        for (int i4 = 0; i4 < bt.ij.size(); i4++) {
            this.A = (bv) bt.ij.elementAt(i4);
            if (this.A.d != null && i2 >= this.A.e + this.A.d.c() && i2 <= this.A.e + this.A.d.c() + this.A.d.e() && i3 >= this.A.f + this.A.d.d() && i3 <= this.A.f + this.A.d.d() + this.A.d.f()) {
                return true;
            }
        }
        return false;
    }
}

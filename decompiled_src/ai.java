/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import com.yinhan.kjava.main.a;
import java.io.UnsupportedEncodingException;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ai {
    public static final String[] a = new String[]{"sBIT", "IHDR", "PLTE", "tRNS", "IDAT"};
    public static byte[] b = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
    public static byte[] c = new byte[]{0, 0, 0, 0, 73, 69, 78, 68, -82, 66, 96, -126};
    private int[] g = new int[2];
    private int[] h = new int[4];
    public static final byte[] d = ai.b();
    private static byte[] i = new byte[]{0, 5, 3, 6, 2, 7, 1, 4};
    private int j = 0;
    private int k = 0;
    private Image l = null;
    private Graphics m = null;
    private int n = 0;
    private int o = 0;
    private int p = -1;
    private int q = -1;
    private int r;
    private int s;
    private int t = 16;
    private int u;
    private int v;
    private int w;
    private int x;
    private Image y;
    public int e;
    public int f;
    private Graphics z;
    private bv A = null;

    private static byte[] b() {
        try {
            return "\u7248\u6743\u5f52\u82cf\u9f99\u5fb7\u6240\u6709".getBytes("UTF-8");
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            UnsupportedEncodingException unsupportedEncodingException2 = unsupportedEncodingException;
            unsupportedEncodingException.printStackTrace();
            return null;
        }
    }

    public final byte a(aw aw2, int n2, int n3) {
        if (aw2 == null || aw2.i == null) {
            return 0;
        }
        if (n2 < 0 || n2 > aw2.a || n3 < 0 || n3 >= aw2.b) {
            return 1;
        }
        n3 /= aw2.f;
        int n4 = (n2 /= aw2.e) < 0 ? 0 : (n2 = n2 >= aw2.i.length ? aw2.i.length - 1 : n2);
        int n5 = n3 < 0 ? 0 : (n3 = n3 >= aw2.i[0].length ? aw2.i[0].length - 1 : n3);
        if (ai.b(n2, n3)) {
            return 0;
        }
        return aw2.i[n2][n3];
    }

    private static boolean b(int n2, int n3) {
        if (bt.hG != -1 && bt.hG == bt.ar) {
            if (bt.hJ == null || bt.hK == null) {
                return false;
            }
            for (int n4 = 0; n4 < bt.hJ.length; n4 = (int)((short)(n4 + 1))) {
                if (bt.hJ[n4] != n2 || bt.hK[n4] != n3) continue;
                return true;
            }
            return false;
        }
        return false;
    }

    public static int a(bc bc2, long l2) {
        if (bc2 == null || bc2.k == null) {
            return 2;
        }
        int n2 = 0;
        if (l2 - bc2.e - (long)bc2.d > 0L) {
            bc2.f = (byte)(bc2.f + 1);
            if (bc2.f >= bc2.k.length) {
                bc2.f = 0;
                n2 = 2;
            } else {
                n2 = 1;
            }
            bc2.e = l2;
        }
        return n2;
    }

    public final void a(Graphics graphics, bx bx2, int[] nArray, int n2, int n3, int n4, int n5, int n6) {
        if (bx2 != null && bx2.a != null) {
            switch (bx2.a.o) {
                case 0: {
                    this.a(graphics, (bf)bx2.a, nArray, bx2.a(), n2, n3, n4, n5, 0, (int)bx2.g);
                    return;
                }
                case 2: {
                    this.a(graphics, (bc)bx2.a, nArray, n2, n3, n4, n5, 0, n6);
                }
            }
        }
    }

    private void a(Graphics graphics, bx bx2, int[] nArray, int n2, int n3, int n4, int n5, int n6, int n7) {
        if (bx2 != null && bx2.a != null) {
            switch (bx2.a.o) {
                case 0: {
                    this.a(graphics, (bf)bx2.a, nArray, bx2.a(), n2, n3, n4 += bx2.e, n5 += bx2.f, 20, (int)bx2.g);
                    return;
                }
                case 2: {
                    this.a(graphics, (bc)bx2.a, nArray, n2, n3, n4 += bx2.e, n5 += bx2.f, 20, n7);
                }
            }
        }
    }

    public final void a(Graphics graphics, bf bf2, int[] nArray, aj aj2, int n2, int n3, int n4, int n5, int n6, int n7) {
        n4 -= n2;
        n5 -= n3;
        if (bf2 == null || bf2.a == null) {
            return;
        }
        if (nArray != null && nArray[2] > 0 && nArray[3] > 0) {
            if (aj2 == null) {
                graphics.setClip(nArray[0] - n2, nArray[1] - n3, nArray[2], nArray[3]);
                graphics.drawRegion(bf2.a, 0, 0, (int)bf2.b, (int)bf2.c, (int)i[n7], n4, n5, n6);
                return;
            }
            ai.a(bf2, this.h, aj2);
            short s2 = (short)this.h[0];
            short s3 = (short)this.h[1];
            short s4 = (short)this.h[2];
            short s5 = (short)this.h[3];
            if (s2 < 0 || s2 + s4 > bf2.b || s3 < 0 || s3 + s5 > bf2.c || s2 >= bf2.b || s3 >= bf2.c || s4 <= 0 || s5 <= 0) {
                return;
            }
            graphics.setClip(nArray[0] - n2, nArray[1] - n3, nArray[2], nArray[3]);
            graphics.drawRegion(bf2.a, (int)s2, (int)s3, (int)s4, (int)s5, (int)i[n7], n4, n5, n6);
            graphics.setClip(this.p, this.q, this.r, this.s);
            return;
        }
        if (aj2 == null) {
            graphics.drawRegion(bf2.a, 0, 0, (int)bf2.b, (int)bf2.c, (int)i[n7], n4, n5, n6);
            return;
        }
        ai.a(bf2, this.h, aj2);
        short s6 = (short)this.h[0];
        short s7 = (short)this.h[1];
        short s8 = (short)this.h[2];
        short s9 = (short)this.h[3];
        if (s6 < 0 || s6 + s8 > bf2.b || s7 < 0 || s7 + s9 > bf2.c || s6 >= bf2.b || s7 >= bf2.c || s8 <= 0 || s9 <= 0) {
            return;
        }
        graphics.drawRegion(bf2.a, (int)s6, (int)s7, (int)s8, (int)s9, (int)i[n7], n4, n5, n6);
    }

    public final void a(Graphics graphics, bf bf2, int[] nArray, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        if (bf2 == null || bf2.d == null || n2 < 0 || n2 >= bf2.d.length) {
            return;
        }
        this.a(graphics, bf2, null, bf2.d[n2], 0, 0, n5, n6, 0, n8);
    }

    public final void a(Graphics graphics, bc bc2, int[] nArray, int n2, int n3, int n4, int n5, int n6, int n7) {
        if (bc2 != null && bc2.k != null && bc2.f < bc2.k.length && bc2.k[bc2.f] != null) {
            if (n6 == 3) {
                n4 -= bc2.g() >> 1;
                n5 -= bc2.h() >> 1;
            } else if (n6 == 17) {
                n4 -= bc2.g() >> 1;
            } else if (n6 == 33) {
                n4 -= bc2.g() >> 1;
                n5 -= bc2.h();
            } else if (n6 == 36) {
                n5 -= bc2.h();
            }
            for (n6 = 0; n6 < bc2.k[bc2.f].length; ++n6) {
                if (bc2.k[bc2.f][n6] == null) continue;
                this.a(graphics, bc2.k[bc2.f][n6], nArray, n2, n3, n4, n5, 20, n7);
            }
        }
    }

    public final void a(Graphics graphics, bx[] bxArray, short s2, short s3, int[] nArray, int n2, int n3, int n4, int n5, int n6, int n7) {
        if (bxArray == null) {
            return;
        }
        for (s2 = 0; s2 < bxArray.length; s2 = (short)(s2 + 1)) {
            this.a(graphics, bxArray[s2], nArray, n2, n3, n4, n5, 20, n7);
        }
    }

    public final void a(int n2, int n3, int n4, int n5) {
        int n6 = (n4 + this.t - 1) / this.t * this.t;
        int n7 = (n5 + this.t - 1) / this.t * this.t;
        this.n = -1;
        this.o = -1;
        if (this.l == null) {
            this.l = Image.createImage((int)(n6 + 2 * this.t), (int)(n7 + 2 * this.t));
            this.m = this.l.getGraphics();
        }
        this.p = n2;
        this.q = n3;
        this.r = n4;
        this.s = n5;
        this.j = n6 + 2 * this.t;
        this.k = n7 + 2 * this.t;
    }

    private void a(aw aw2, int n2, int n3, int n4, int n5, boolean bl2) {
        this.m.setClip(0, 0, this.j, this.k);
        if (this.n == -1 && this.o == -1) {
            this.a(this.m, aw2, n2 - this.t, n3 - this.t, n5, bl2);
            this.n = n2;
            this.o = n3;
            return;
        }
        if (this.n - n2 >= this.t) {
            this.n -= this.t;
            for (n2 = this.j / this.t; n2 > 0; --n2) {
                this.m.setClip(n2 * this.t, 0, this.t, this.k);
                this.m.drawImage(this.l, this.t, 0, 0);
            }
            this.m.setClip(0, 0, this.t, this.k);
            this.a(this.m, aw2, this.n - this.t, this.o - this.t, n5, bl2);
            return;
        }
        if (this.n - n2 <= -this.t) {
            this.n += this.t;
            this.m.setClip(0, 0, this.j - this.t, this.k);
            this.m.drawImage(this.l, -this.t, 0, 0);
            this.m.setClip(this.j - this.t, 0, this.t, this.k);
            this.a(this.m, aw2, this.n - this.t, this.o - this.t, n5, bl2);
            return;
        }
        if (this.o - n3 >= this.t) {
            this.o -= this.t;
            for (n2 = this.k / this.t; n2 > 0; --n2) {
                this.m.setClip(0, n2 * this.t, this.j, this.t);
                this.m.drawImage(this.l, 0, this.t, 0);
            }
            this.m.setClip(0, 0, this.j, this.t);
            this.a(this.m, aw2, this.n - this.t, this.o - this.t, n5, bl2);
            return;
        }
        if (this.o - n3 <= -this.t) {
            this.o += this.t;
            this.m.setClip(0, 0, this.j, this.k - this.t);
            this.m.drawImage(this.l, 0, -this.t, 0);
            this.m.setClip(0, this.k - this.t, this.j, this.t);
            this.a(this.m, aw2, this.n - this.t, this.o - this.t, n5, bl2);
        }
    }

    public final void a(Graphics graphics, aw aw2, int n2, int n3, int n4, int n5, boolean bl2, boolean bl3) {
        graphics.setClip(this.p, this.q, aw2.a < this.r ? aw2.a : this.r, aw2.b < this.s ? aw2.b : this.s);
        this.a(aw2, n2, n3, 0, 0, true);
        graphics.setClip(this.p, this.q, aw2.a < this.r ? aw2.a : this.r, aw2.b < this.s ? aw2.b : this.s);
        graphics.drawImage(this.l, this.p + (this.n - n2) - this.t, this.q + (this.o - n3) - this.t, 0);
        graphics.setClip(0, 0, this.j, this.k);
    }

    public final void a(Graphics graphics, aw aw2, int n2, int n3) {
        if (t.b - aw2.a > 0) {
            graphics.setClip((t.b - aw2.a) / 2, this.q, (int)aw2.a, (int)aw2.b);
        } else {
            graphics.setClip(this.p, this.q, this.r, this.s);
        }
        graphics.drawImage(this.l, this.p + (this.n - n2) - this.t, this.q + (this.o - n3) - this.t, 0);
        graphics.setClip(0, 0, this.j, this.k);
    }

    public final void a(aw aw2, int n2, int n3, boolean bl2) {
        this.n = -1;
        this.o = -1;
        if (this.p != 0 || this.q != 0) {
            this.m.setColor(0);
            this.m.fillRect(0, 0, this.j, this.k);
        }
        this.a(aw2, n2, n3, 0, 0, false);
        if (ao.A != null) {
            com.yinhan.kjava.main.a.f.m.drawImage(ao.A, this.j - ao.A.getWidth() >> 1, this.k - ao.A.getHeight() - 16 >> 1, 20);
        }
        ca.a(this.m, 4017771, 159, 0, 0, this.j, this.k);
    }

    public final void a(aw aw2, int n2, int n3, boolean bl2, boolean bl3, int n4) {
        this.n = -1;
        this.o = -1;
        if (this.p != 0 || this.q != 0) {
            this.m.setColor(0);
            this.m.fillRect(0, 0, this.j, this.k);
        }
        this.a(aw2, n2, n3, 0, 0, bl2);
        if (bl3) {
            ca.a(this.m, n4, 175, 0, 0, this.j, this.k);
        }
    }

    private void a(Graphics graphics, aw aw2, int n2, int n3, int n4, boolean bl2) {
        int n5;
        this.u = Math.max(0, n2 / aw2.c + graphics.getClipX() / aw2.c);
        this.v = Math.max(0, n3 / aw2.d + graphics.getClipY() / aw2.d);
        this.w = Math.min(aw2.g, this.u + graphics.getClipWidth() / aw2.c + 1);
        this.x = Math.min(aw2.h, this.v + graphics.getClipHeight() / aw2.d + 1);
        if (aw2.j != null) {
            for (n5 = this.u; n5 < this.w; ++n5) {
                for (int i2 = this.v; i2 < this.x; ++i2) {
                    if (aw2.j[n5][i2] == null || n5 * aw2.c - n2 + aw2.c - graphics.getClipX() <= 0 || n5 * aw2.c - n2 - graphics.getClipX() >= graphics.getClipWidth() || i2 * aw2.d - n3 + aw2.d - graphics.getClipY() <= 0 || i2 * aw2.d - n3 - graphics.getClipY() >= graphics.getClipHeight()) continue;
                    if (ai.b(n5, i2) && bt.hH != null) {
                        this.a(graphics, bt.hH, null, bt.hI, 0, 0, n5 * aw2.c - n2, i2 * aw2.d - n3, 0, n4);
                        continue;
                    }
                    this.a(graphics, aw2.j[n5][i2], null, 0, 0, n5 * aw2.c - n2, i2 * aw2.d - n3, n4);
                }
            }
        }
        if (aw2.k != null) {
            for (n5 = 0; n5 < aw2.k.length; ++n5) {
                if (aw2.k[n5] == null) continue;
                this.a(aw2.k[n5], this.g);
                if (aw2.k[n5].e - n2 + this.g[0] - graphics.getClipX() <= 0 || aw2.k[n5].e - n2 - graphics.getClipX() >= graphics.getClipWidth() || aw2.k[n5].f - n3 + this.g[1] - graphics.getClipY() <= 0 || aw2.k[n5].f - n3 - graphics.getClipY() >= graphics.getClipHeight()) continue;
                this.a(graphics, aw2.k[n5], null, n2, n3, (int)aw2.k[n5].e, aw2.k[n5].f, n4);
            }
        }
        if (aw2.l != null) {
            for (n5 = 0; n5 < aw2.l.length; ++n5) {
                if (aw2.l[n5] == null || aw2.l[n5].a == null || aw2.l[n5].a.o == 2 && ((bc)aw2.l[n5].a).k != null && ((bc)aw2.l[n5].a).k.length > 1) continue;
                this.a(aw2.l[n5], this.g);
                if (aw2.l[n5].e - n2 + this.g[0] - graphics.getClipX() <= 0 || aw2.l[n5].e - n2 - graphics.getClipX() >= graphics.getClipWidth() || aw2.l[n5].f - n3 + this.g[1] - graphics.getClipY() <= 0 || aw2.l[n5].f - n3 - graphics.getClipY() >= graphics.getClipHeight()) continue;
                this.a(graphics, aw2.l[n5], null, n2, n3, (int)aw2.l[n5].e, aw2.l[n5].f, n4);
            }
        }
        if (bt.t != null && bl2) {
            for (n5 = 0; n5 < bt.t.length; ++n5) {
                if (bt.t[n5] == null) continue;
                if (ao.aW[3] == 0 && bt.t[n5].b != null) {
                    graphics.setFont(t.i);
                    ca.a(graphics, bt.t[n5].b, bt.t[n5].c - n2, bt.t[n5].d - (bt.t[n5].w == null ? 30 : (int)bt.t[n5].w.j()) - t.j - n3, 17, 255, 0xFFFFFF);
                }
                if (bt.t[n5].w == null || bt.t[n5].w.k == null || ao.aW[10] != 1) continue;
                this.a(graphics, bt.t[n5].w.k[bt.t[n5].w.f], bt.t[n5].w.g(), bt.t[n5].w.h(), null, n2, n3, bt.t[n5].c, bt.t[n5].d, 20, n4);
                graphics.setFont(t.i);
            }
        }
    }

    public final void a(aw aw2, int n2) {
        this.e = aw2.a / n2;
        this.f = aw2.b / n2;
        this.y = Image.createImage((int)this.e, (int)this.f);
        this.z = this.y.getGraphics();
        this.z.setColor(0x818181);
        this.z.fillRect(0, 0, this.e, this.f);
        this.z.setColor(352261);
        if (aw2.i != null) {
            for (int i2 = 0; i2 < aw2.i.length; ++i2) {
                for (int i3 = 0; i3 < aw2.i[i2].length; ++i3) {
                    if (aw2.i[i2][i3] != 1) continue;
                    this.z.fillRect(i2 * aw2.e / n2, i3 * aw2.f / n2, 2, 2);
                }
            }
        }
    }

    public final void a() {
        this.y = null;
        this.z = null;
    }

    public final void a(Graphics graphics, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        if (this.y != null) {
            graphics.drawRegion(this.y, 0, 0, this.e, this.f, 0, 2, n5, 0);
            graphics.setColor(0);
            graphics.drawRect(1, n5 - 1, this.e + 1, this.f + 1);
            graphics.setColor(0xFF0000);
            graphics.fillRect(n2 + 2, n5 + n3, n6, n7);
        }
    }

    public final void a(bx bx2, int[] nArray) {
        if (bx2.a == null) {
            return;
        }
        block0 : switch (bx2.a.o) {
            case 0: {
                aj aj2 = ((bf)bx2.a).a(bx2.d);
                int[] nArray2 = this.g;
                bf bf2 = (bf)bx2.a;
                if (bf2 != null) {
                    if (aj2 == null) {
                        nArray2[0] = bf2.b;
                        nArray2[1] = bf2.c;
                    } else {
                        nArray2[0] = aj2.c;
                        nArray2[1] = aj2.d;
                    }
                }
                int n2 = this.g[1];
                int n3 = this.g[0];
                nArray2 = nArray;
                byte by2 = bx2.g;
                switch (by2) {
                    case 0: {
                        nArray2[0] = n3;
                        nArray2[1] = n2;
                        break block0;
                    }
                    case 1: {
                        nArray2[0] = n2;
                        nArray2[1] = n3;
                        break block0;
                    }
                    case 2: {
                        nArray2[0] = n3;
                        nArray2[1] = n2;
                        break block0;
                    }
                    case 3: {
                        nArray2[0] = n2;
                        nArray2[1] = n3;
                        break block0;
                    }
                    case 4: {
                        nArray2[0] = n3;
                        nArray2[1] = n2;
                        break block0;
                    }
                    case 5: {
                        nArray2[0] = n2;
                        nArray2[1] = n3;
                        break block0;
                    }
                    case 6: {
                        nArray2[0] = n3;
                        nArray2[1] = n2;
                        break block0;
                    }
                    case 7: {
                        nArray2[0] = n2;
                        nArray2[1] = n3;
                        break block0;
                    }
                }
                nArray2[0] = n3;
                nArray2[1] = n2;
                return;
            }
            case 2: {
                ai.a((bc)bx2.a, nArray);
                return;
            }
            default: {
                nArray[0] = 0;
                nArray[1] = 0;
            }
        }
    }

    private static void a(bf bf2, int[] nArray, aj aj2) {
        if (bf2 != null) {
            if (aj2 == null) {
                nArray[0] = 0;
                nArray[1] = 0;
                nArray[2] = bf2.b;
                nArray[3] = bf2.c;
                return;
            }
            nArray[0] = aj2.a;
            nArray[1] = aj2.b;
            nArray[2] = aj2.c;
            nArray[3] = aj2.d;
        }
    }

    public static void a(bc bc2, int[] nArray) {
        if (bc2 != null) {
            nArray[0] = bc2.g();
            nArray[1] = bc2.h();
        }
    }

    public static boolean a(int[] nArray, int[] nArray2) {
        return Math.abs(nArray[0] + nArray[2] / 2 - (nArray2[0] + nArray2[2] / 2)) < nArray[2] / 2 + nArray2[2] / 2 && Math.abs(nArray[1] + nArray[3] / 2 - (nArray2[1] + nArray2[3] / 2)) < nArray[3] / 2 + nArray2[3] / 2;
    }

    public final void a(int[] nArray, int[] nArray2, int[] nArray3) {
        int n2;
        int[] nArray4 = nArray2;
        Object object = nArray;
        if ((nArray4[0] >= object[0] && nArray4[0] + nArray4[2] <= object[0] + object[2] && nArray4[1] >= object[1] && nArray4[1] + nArray4[3] <= object[1] + object[3] ? -1 : (n2 = object[0] >= nArray4[0] && object[0] + object[2] <= nArray4[0] + nArray4[2] && object[1] >= nArray4[1] && object[1] + object[3] <= nArray4[1] + nArray4[3] ? 1 : 0)) != 0) {
            if (n2 == -1) {
                nArray3[0] = nArray2[0];
                nArray3[1] = nArray2[1];
                nArray3[2] = nArray2[2];
                nArray3[3] = nArray2[3];
                return;
            }
            nArray3[0] = nArray[0];
            nArray3[1] = nArray[1];
            nArray3[2] = nArray[2];
            nArray3[3] = nArray[3];
            return;
        }
        int[] nArray5 = nArray;
        nArray = nArray3;
        nArray4 = nArray2;
        int[] nArray6 = nArray5;
        if (nArray5[0] <= nArray4[0]) {
            if (nArray4[0] <= nArray6[0] + nArray6[2]) {
                int n3 = nArray4[0] + nArray4[2] <= nArray6[0] + nArray6[2] ? nArray4[2] : nArray6[0] + nArray6[2] - nArray4[0];
                if (nArray4[1] < nArray6[1] && nArray4[1] + nArray4[3] > nArray6[1]) {
                    int n4 = nArray6[1] + nArray6[3] <= nArray4[1] + nArray4[3] ? nArray6[3] : nArray4[1] + nArray4[3] - nArray6[1];
                    nArray[0] = nArray4[0];
                    nArray[1] = nArray6[1];
                    nArray[2] = n3;
                    nArray[3] = n4;
                }
                if (nArray4[1] >= nArray6[1] && nArray4[1] <= nArray6[1] + nArray6[3]) {
                    int n5 = nArray4[1] + nArray4[3] <= nArray6[1] + nArray6[3] ? nArray4[3] : nArray6[1] + nArray6[3] - nArray4[1];
                    nArray[0] = nArray4[0];
                    nArray[1] = nArray4[1];
                    nArray[2] = n3;
                    nArray[3] = n5;
                }
                return;
            }
        } else if (nArray6[0] <= nArray4[0] + nArray4[2]) {
            int n6 = nArray6[0] + nArray6[2] <= nArray4[0] + nArray4[2] ? nArray6[2] : nArray4[0] + nArray4[2] - nArray6[0];
            if (nArray4[1] < nArray6[1] && nArray4[1] + nArray4[3] > nArray6[1]) {
                int n7 = nArray6[1] + nArray6[3] <= nArray4[1] + nArray4[3] ? nArray6[3] : nArray4[1] + nArray4[3] - nArray6[1];
                nArray[0] = nArray6[0];
                nArray[1] = nArray6[1];
                nArray[2] = n6;
                nArray[3] = n7;
            }
            if (nArray4[1] >= nArray6[1] && nArray4[1] <= nArray6[1] + nArray6[3]) {
                int n8 = nArray4[1] + nArray4[3] <= nArray6[1] + nArray6[3] ? nArray4[3] : nArray6[1] + nArray6[3] - nArray4[1];
                nArray[0] = nArray6[0];
                nArray[1] = nArray4[1];
                nArray[2] = n6;
                nArray[3] = n8;
            }
        }
    }

    public final boolean a(int n2, int n3) {
        if (bt.ij != null) {
            for (int i2 = 0; i2 < bt.ij.size(); ++i2) {
                this.A = (bv)bt.ij.elementAt(i2);
                if (this.A.d == null || n2 < this.A.e + this.A.d.c() || n2 > this.A.e + this.A.d.c() + this.A.d.e() || n3 < this.A.f + this.A.d.d() || n3 > this.A.f + this.A.d.d() + this.A.d.f()) continue;
                return true;
            }
        }
        return false;
    }
}


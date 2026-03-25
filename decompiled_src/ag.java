/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import com.yinhan.kjava.main.a;
import javax.microedition.lcdui.Image;

public final class ag {
    private static String[] p = new String[]{"\u8054\u7cfb\u5ba2\u670d", "", ""};
    public static final String[] a;
    public be[] b = new be[0];
    public ak[] c = new ak[0];
    private int q = 0;
    public String[] d = null;
    public String[] e = null;
    public String[] f = null;
    private String[] r = null;
    public Image[] g = null;
    public int[] h = null;
    public int i = -1;
    private int s = 0;
    public String[] j = null;
    public final String[] k = null;
    public final String[] l = null;
    public final Image[] m = null;
    public int[] n = null;
    public boolean o = false;

    public final String a() {
        be be2 = null;
        for (int i2 = 0; i2 < this.b.length; ++i2) {
            be2 = this.b[i2];
            if (!be2.d) continue;
            return be2.a;
        }
        return null;
    }

    public final int a(String string) {
        for (int i2 = 0; i2 < this.b.length; ++i2) {
            if (!this.b[i2].a.equals(string)) continue;
            return i2;
        }
        return -1;
    }

    public static ag b() {
        ag ag2 = new ag();
        new ag().b = new be[0];
        return ag2;
    }

    public final void c() {
        if (this.c == null || this.c.length <= 0) {
            this.i = -1;
            this.s = 0;
            this.j = null;
            this.n = null;
            return;
        }
        this.s = this.c.length;
        this.j = new String[this.s];
        this.n = new int[this.s];
        ak ak2 = null;
        for (int i2 = 0; i2 < this.s; ++i2) {
            ak2 = this.c[i2];
            this.j[i2] = ak2.b;
            this.n[i2] = ak2.a;
        }
    }

    public final void d() {
        this.o = false;
        this.q = 1 + this.b.length;
        this.d = new String[this.q];
        this.e = new String[this.q];
        this.f = new String[this.q];
        this.r = new String[this.q];
        this.g = new Image[this.q];
        this.h = new int[this.q];
        int n2 = 0;
        this.d[0] = p[0];
        this.e[0] = p[1];
        this.f[0] = p[2];
        this.r[0] = "";
        this.g[0] = com.yinhan.kjava.main.a.af.a((String)"103").a;
        this.h[0] = 4915330;
        ++n2;
        for (int i2 = 0; i2 < this.b.length; ++i2) {
            this.d[n2] = this.b[i2].b;
            this.e[n2] = "";
            this.f[n2] = this.b[i2].c;
            this.r[n2] = "";
            if (this.b[i2].d) {
                if (!this.o) {
                    this.o = true;
                }
                this.g[n2] = be.e[0];
            } else {
                this.g[n2] = be.e[1];
            }
            this.h[n2] = 9118290;
            ++n2;
        }
    }

    static {
        (new String[1])[0] = "\u67e5\u770b";
        a = new String[]{"Bug", "\u5efa\u8bae", "\u54a8\u8be2"};
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;

public final class f {
    private static String[] v = new String[]{"\u3010\u90ae\u4ef6\u6807\u9898\u3011", "\u3010\u53d1\u4ef6\u4eba\u3011"};
    public static final String[] a = new String[]{"\u4e0a\u9875", "\u4e0b\u9875", "\u53d1\u4ef6", "\u6e05\u7406", "\u5b9a\u8d2d"};
    public static final String[] b = new String[]{"\u67e5\u770b", "\u56de\u590d", "\u5220\u9664", "\u52a0\u4e3a\u597d\u53cb", "\u52a0\u9ed1\u540d\u5355", "\u4e3e\u62a5"};
    public static final String[] c = new String[]{b[1], b[2], b[3], b[4], b[5]};
    public int d = 0;
    public String e = "";
    public bo[] f = new bo[0];
    private int w = 0;
    public String[] g = null;
    public String[] h = null;
    public String[] i = null;
    private String[] x = null;
    public String[] j = null;
    public Image[] k = null;
    public int[] l = null;
    public String m = null;
    public String n = null;
    public String o = null;
    public String p = null;
    public String q = null;
    public String r = null;
    public String[] s = null;
    public String[] t = null;
    public boolean u = false;

    public final void a() {
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
    }

    public static f b() {
        f f2 = new f();
        new f().d = 0;
        f2.e = "\u3010\u6211\u7684\u90ae\u4ef6\u3011\t\u90ae\u4ef6\u540c\u6b65\u4e2d...\u8bf7\u7a0d\u5019...";
        f2.f = new bo[0];
        return f2;
    }

    public final void c() {
        this.u = false;
        f f2 = this;
        this.w = 0;
        f2.g = null;
        f2.h = null;
        f2.i = null;
        f2.x = null;
        f2.j = null;
        f2.k = null;
        f2.l = null;
        this.w = 1 + this.f.length;
        this.g = new String[this.w];
        this.h = new String[this.w];
        this.i = new String[this.w];
        this.x = new String[this.w];
        this.j = new String[this.w];
        this.k = new Image[this.w];
        this.l = new int[this.w];
        int n2 = 0;
        this.g[0] = v[0];
        this.h[0] = "";
        this.i[0] = v[1];
        this.x[0] = "";
        this.j[0] = this.e;
        this.k[0] = null;
        this.l[0] = 4915330;
        ++n2;
        for (int i2 = 0; i2 < this.f.length; ++i2) {
            this.g[n2] = this.f[i2].a();
            this.h[n2] = "";
            this.i[n2] = this.f[i2].e;
            this.x[n2] = "";
            this.j[n2] = this.f[i2].b();
            if (this.f[i2].f) {
                this.k[n2] = bo.g[1];
            } else {
                if (!this.u) {
                    this.u = true;
                }
                this.k[n2] = bo.g[0];
            }
            this.l[n2] = 0xFFFFFF;
            ++n2;
        }
    }
}


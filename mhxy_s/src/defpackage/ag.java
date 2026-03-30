package defpackage;

import com.yinhan.kjava.main.a;
import javax.microedition.lcdui.Image;

/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-8105993946875401281/classes.dex */
public final class ag {
    public static final String[] a;
    private static String[] p = {"联系客服", "", ""};
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

    static {
        new String[1][0] = "查看";
        a = new String[]{"Bug", "建议", "咨询"};
    }

    public static ag b() {
        ag agVar = new ag();
        agVar.b = new be[0];
        return agVar;
    }

    public final int a(String str) {
        for (int i = 0; i < this.b.length; i++) {
            if (this.b[i].a.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    public final String a() {
        for (int i = 0; i < this.b.length; i++) {
            be beVar = this.b[i];
            if (beVar.d) {
                return beVar.a;
            }
        }
        return null;
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
        for (int i = 0; i < this.s; i++) {
            ak akVar = this.c[i];
            this.j[i] = akVar.b;
            this.n[i] = akVar.a;
        }
    }

    public final void d() {
        this.o = false;
        this.q = this.b.length + 1;
        this.d = new String[this.q];
        this.e = new String[this.q];
        this.f = new String[this.q];
        this.r = new String[this.q];
        this.g = new Image[this.q];
        this.h = new int[this.q];
        this.d[0] = p[0];
        this.e[0] = p[1];
        this.f[0] = p[2];
        this.r[0] = "";
        this.g[0] = a.af.a("103").a;
        this.h[0] = 4915330;
        int i = 1;
        for (int i2 = 0; i2 < this.b.length; i2++) {
            this.d[i] = this.b[i2].b;
            this.e[i] = "";
            this.f[i] = this.b[i2].c;
            this.r[i] = "";
            if (this.b[i2].d) {
                if (!this.o) {
                    this.o = true;
                }
                this.g[i] = be.e[0];
            } else {
                this.g[i] = be.e[1];
            }
            this.h[i] = 9118290;
            i++;
        }
    }
}

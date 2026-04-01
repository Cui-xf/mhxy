package p000;

import com.yinhan.kjava.main.RunnableC0066a;
import javax.microedition.lcdui.Image;

/* renamed from: ag */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-4234804660425969496/classes.dex */
public final class C0007ag {

    /* renamed from: a */
    public static final String[] f46a;

    /* renamed from: p */
    private static String[] f47p = {"联系客服", "", ""};

    /* renamed from: b */
    public C0032be[] f48b = new C0032be[0];

    /* renamed from: c */
    public C0011ak[] f49c = new C0011ak[0];

    /* renamed from: q */
    private int f62q = 0;

    /* renamed from: d */
    public String[] f50d = null;

    /* renamed from: e */
    public String[] f51e = null;

    /* renamed from: f */
    public String[] f52f = null;

    /* renamed from: r */
    private String[] f63r = null;

    /* renamed from: g */
    public Image[] f53g = null;

    /* renamed from: h */
    public int[] f54h = null;

    /* renamed from: i */
    public int f55i = -1;

    /* renamed from: s */
    private int f64s = 0;

    /* renamed from: j */
    public String[] f56j = null;

    /* renamed from: k */
    public final String[] f57k = null;

    /* renamed from: l */
    public final String[] f58l = null;

    /* renamed from: m */
    public final Image[] f59m = null;

    /* renamed from: n */
    public int[] f60n = null;

    /* renamed from: o */
    public boolean f61o = false;

    static {
        new String[1][0] = "查看";
        f46a = new String[]{"Bug", "建议", "咨询"};
    }

    /* renamed from: b */
    public static C0007ag m35b() {
        C0007ag c0007ag = new C0007ag();
        c0007ag.f48b = new C0032be[0];
        return c0007ag;
    }

    /* renamed from: a */
    public final int m36a(String str) {
        for (int i = 0; i < this.f48b.length; i++) {
            if (this.f48b[i].f593a.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final String m37a() {
        for (int i = 0; i < this.f48b.length; i++) {
            C0032be c0032be = this.f48b[i];
            if (c0032be.f596d) {
                return c0032be.f593a;
            }
        }
        return null;
    }

    /* renamed from: c */
    public final void m38c() {
        if (this.f49c == null || this.f49c.length <= 0) {
            this.f55i = -1;
            this.f64s = 0;
            this.f56j = null;
            this.f60n = null;
            return;
        }
        this.f64s = this.f49c.length;
        this.f56j = new String[this.f64s];
        this.f60n = new int[this.f64s];
        for (int i = 0; i < this.f64s; i++) {
            C0011ak c0011ak = this.f49c[i];
            this.f56j[i] = c0011ak.f100b;
            this.f60n[i] = c0011ak.f99a;
        }
    }

    /* renamed from: d */
    public final void m39d() {
        this.f61o = false;
        this.f62q = this.f48b.length + 1;
        this.f50d = new String[this.f62q];
        this.f51e = new String[this.f62q];
        this.f52f = new String[this.f62q];
        this.f63r = new String[this.f62q];
        this.f53g = new Image[this.f62q];
        this.f54h = new int[this.f62q];
        this.f50d[0] = f47p[0];
        this.f51e[0] = f47p[1];
        this.f52f[0] = f47p[2];
        this.f63r[0] = "";
        this.f53g[0] = RunnableC0066a.f2100af.m985a("103").f598a;
        this.f54h[0] = 4915330;
        int i = 1;
        for (int i2 = 0; i2 < this.f48b.length; i2++) {
            this.f50d[i] = this.f48b[i2].f594b;
            this.f51e[i] = "";
            this.f52f[i] = this.f48b[i2].f595c;
            this.f63r[i] = "";
            if (this.f48b[i2].f596d) {
                if (!this.f61o) {
                    this.f61o = true;
                }
                this.f53g[i] = C0032be.f592e[0];
            } else {
                this.f53g[i] = C0032be.f592e[1];
            }
            this.f54h[i] = 9118290;
            i++;
        }
    }
}

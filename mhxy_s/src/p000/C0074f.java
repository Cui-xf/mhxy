package p000;

import javax.microedition.lcdui.Image;

/* renamed from: f */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-4234804660425969496/classes.dex */
public final class C0074f {

    /* renamed from: v */
    private static String[] f2249v = {"【邮件标题】", "【发件人】"};

    /* renamed from: a */
    public static final String[] f2246a = {"上页", "下页", "发件", "清理", "定购"};

    /* renamed from: b */
    public static final String[] f2247b = {"查看", "回复", "删除", "加为好友", "加黑名单", "举报"};

    /* renamed from: c */
    public static final String[] f2248c = {f2247b[1], f2247b[2], f2247b[3], f2247b[4], f2247b[5]};

    /* renamed from: d */
    public int f2250d = 0;

    /* renamed from: e */
    public String f2251e = "";

    /* renamed from: f */
    public C0042bo[] f2252f = new C0042bo[0];

    /* renamed from: w */
    private int f2268w = 0;

    /* renamed from: g */
    public String[] f2253g = null;

    /* renamed from: h */
    public String[] f2254h = null;

    /* renamed from: i */
    public String[] f2255i = null;

    /* renamed from: x */
    private String[] f2269x = null;

    /* renamed from: j */
    public String[] f2256j = null;

    /* renamed from: k */
    public Image[] f2257k = null;

    /* renamed from: l */
    public int[] f2258l = null;

    /* renamed from: m */
    public String f2259m = null;

    /* renamed from: n */
    public String f2260n = null;

    /* renamed from: o */
    public String f2261o = null;

    /* renamed from: p */
    public String f2262p = null;

    /* renamed from: q */
    public String f2263q = null;

    /* renamed from: r */
    public String f2264r = null;

    /* renamed from: s */
    public String[] f2265s = null;

    /* renamed from: t */
    public String[] f2266t = null;

    /* renamed from: u */
    public boolean f2267u = false;

    /* renamed from: b */
    public static C0074f m1555b() {
        C0074f c0074f = new C0074f();
        c0074f.f2250d = 0;
        c0074f.f2251e = "【我的邮件】\t邮件同步中...请稍候...";
        c0074f.f2252f = new C0042bo[0];
        return c0074f;
    }

    /* renamed from: a */
    public final void m1556a() {
        this.f2259m = null;
        this.f2260n = null;
        this.f2261o = null;
        this.f2262p = null;
        this.f2263q = null;
        this.f2264r = null;
    }

    /* renamed from: c */
    public final void m1557c() {
        this.f2267u = false;
        this.f2268w = 0;
        this.f2253g = null;
        this.f2254h = null;
        this.f2255i = null;
        this.f2269x = null;
        this.f2256j = null;
        this.f2257k = null;
        this.f2258l = null;
        this.f2268w = this.f2252f.length + 1;
        this.f2253g = new String[this.f2268w];
        this.f2254h = new String[this.f2268w];
        this.f2255i = new String[this.f2268w];
        this.f2269x = new String[this.f2268w];
        this.f2256j = new String[this.f2268w];
        this.f2257k = new Image[this.f2268w];
        this.f2258l = new int[this.f2268w];
        this.f2253g[0] = f2249v[0];
        this.f2254h[0] = "";
        this.f2255i[0] = f2249v[1];
        this.f2269x[0] = "";
        this.f2256j[0] = this.f2251e;
        this.f2257k[0] = null;
        this.f2258l[0] = 4915330;
        int i = 1;
        for (int i2 = 0; i2 < this.f2252f.length; i2++) {
            this.f2253g[i] = this.f2252f[i2].m697a();
            this.f2254h[i] = "";
            this.f2255i[i] = this.f2252f[i2].f741e;
            this.f2269x[i] = "";
            this.f2256j[i] = this.f2252f[i2].m699b();
            if (this.f2252f[i2].f742f) {
                this.f2257k[i] = C0042bo.f736g[1];
            } else {
                if (!this.f2267u) {
                    this.f2267u = true;
                }
                this.f2257k[i] = C0042bo.f736g[0];
            }
            this.f2258l[i] = 16777215;
            i++;
        }
    }
}

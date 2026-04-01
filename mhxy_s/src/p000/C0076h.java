package p000;

import com.yinhan.kjava.main.MainMidlet;
import com.yinhan.kjava.main.RunnableC0066a;
import javax.microedition.lcdui.Display;

/* renamed from: h */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-4234804660425969496/classes.dex */
public final class C0076h {

    /* renamed from: a */
    public MainMidlet f2272a;

    /* renamed from: b */
    public C0034bg f2273b;

    /* renamed from: c */
    private Display f2274c;

    public C0076h(MainMidlet mainMidlet, Display display) throws Throwable {
        String appProperty = mainMidlet.getAppProperty("CpId");
        appProperty = appProperty == null ? "" : appProperty;
        String appProperty2 = mainMidlet.getAppProperty("GameId");
        appProperty2 = appProperty2 == null ? "" : appProperty2;
        String appProperty3 = mainMidlet.getAppProperty("LoginServerId");
        appProperty3 = appProperty3 == null ? "" : appProperty3;
        String appProperty4 = mainMidlet.getAppProperty("PaymentServerId");
        appProperty4 = appProperty4 == null ? "" : appProperty4;
        C0029bb.f547a = C0094z.m1723f(appProperty.trim());
        C0029bb.f548b = C0094z.m1723f(appProperty2.trim());
        C0094z.m1723f(appProperty3.trim());
        C0094z.m1723f(appProperty4.trim());
        C0029bb.m624a();
        this.f2272a = mainMidlet;
        this.f2274c = display;
        this.f2273b = new C0034bg(this);
        this.f2273b.m667a();
    }

    /* renamed from: a */
    public final Display m1558a() {
        return this.f2274c;
    }

    /* renamed from: a */
    public final void m1559a(int i) {
        this.f2273b.m669a(this.f2274c, i);
    }

    /* renamed from: a */
    public final void m1560a(String str, String str2) {
        this.f2273b.m670a(this.f2274c, str, str2);
    }

    /* renamed from: a */
    public final void m1561a(C0091w c0091w) {
        if (RunnableC0066a.f2115i == null || C0053bz.f1805b != 72 || C0022av.m593a("socket://120.78.151.213:20008")) {
            C0053bz.f1805b = (byte) 72;
            RunnableC0066a.m1398a("socket://120.78.151.213:20008", (byte) 2);
            this.f2272a.f2060a.m1436a("socket://120.78.151.213:20008", "http://117.135.138.130:7099");
        }
        if (RunnableC0066a.f2115i != null) {
            c0091w.f2563a = true;
            RunnableC0066a.f2115i.m600a(c0091w);
        }
    }

    /* renamed from: a */
    public final void m1562a(boolean z) {
        this.f2273b.m672a(this.f2274c, z);
    }

    /* renamed from: b */
    public final void m1563b() {
        if (this.f2272a == null) {
            return;
        }
        this.f2272a.f2060a.m1464r();
    }

    /* renamed from: c */
    public final void m1564c() {
        this.f2273b = null;
        this.f2272a.notifyDestroyed();
    }

    /* renamed from: d */
    public final void m1565d() {
        this.f2273b.m674b(this.f2274c);
    }

    /* renamed from: e */
    public final void m1566e() {
        this.f2273b.m674b(this.f2274c);
    }

    /* renamed from: f */
    public final void m1567f() {
        this.f2273b.m675c(this.f2274c);
    }

    /* renamed from: g */
    public final void m1568g() {
        this.f2273b.m668a(this.f2274c);
    }

    /* renamed from: h */
    public final void m1569h() {
        this.f2273b.m671a(this.f2274c, RunnableC0066a.f2104am, RunnableC0066a.f2105an, 0);
    }
}

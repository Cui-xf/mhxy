package defpackage;

import com.yinhan.kjava.main.MainMidlet;
import com.yinhan.kjava.main.a;
import javax.microedition.lcdui.Display;

/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-8105993946875401281/classes.dex */
public final class h {
    public MainMidlet a;
    public bg b;
    private Display c;

    public h(MainMidlet mainMidlet, Display display) throws Throwable {
        String appProperty = mainMidlet.getAppProperty("CpId");
        appProperty = appProperty == null ? "" : appProperty;
        String appProperty2 = mainMidlet.getAppProperty("GameId");
        appProperty2 = appProperty2 == null ? "" : appProperty2;
        String appProperty3 = mainMidlet.getAppProperty("LoginServerId");
        appProperty3 = appProperty3 == null ? "" : appProperty3;
        String appProperty4 = mainMidlet.getAppProperty("PaymentServerId");
        appProperty4 = appProperty4 == null ? "" : appProperty4;
        bb.a = z.f(appProperty.trim());
        bb.b = z.f(appProperty2.trim());
        z.f(appProperty3.trim());
        z.f(appProperty4.trim());
        bb.a();
        this.a = mainMidlet;
        this.c = display;
        this.b = new bg(this);
        this.b.a();
    }

    public final Display a() {
        return this.c;
    }

    public final void a(int i) {
        this.b.a(this.c, i);
    }

    public final void a(String str, String str2) {
        this.b.a(this.c, str, str2);
    }

    public final void a(w wVar) {
        if (a.i == null || bz.b != 72 || av.a("socket://120.78.151.213:20008")) {
            bz.b = (byte) 72;
            a.a("socket://120.78.151.213:20008", (byte) 2);
            this.a.a.a("socket://120.78.151.213:20008", "http://117.135.138.130:7099");
        }
        if (a.i != null) {
            wVar.a = true;
            a.i.a(wVar);
        }
    }

    public final void a(boolean z) {
        this.b.a(this.c, z);
    }

    public final void b() {
        if (this.a == null) {
            return;
        }
        this.a.a.r();
    }

    public final void c() {
        this.b = null;
        this.a.notifyDestroyed();
    }

    public final void d() {
        this.b.b(this.c);
    }

    public final void e() {
        this.b.b(this.c);
    }

    public final void f() {
        this.b.c(this.c);
    }

    public final void g() {
        this.b.a(this.c);
    }

    public final void h() {
        this.b.a(this.c, a.am, a.an, 0);
    }
}

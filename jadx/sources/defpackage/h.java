package defpackage;

import com.yinhan.kjava.main.MainMidlet;
import com.yinhan.kjava.main.a;
import javax.microedition.lcdui.Display;

/* loaded from: java版梦回西游3区251011.jar:h.class */
public final class h {
    public MainMidlet a;
    private Display c;
    public bg b;

    public h(MainMidlet mainMidlet, Display display) {
        String appProperty = mainMidlet.getAppProperty("CpId");
        String str = appProperty == null ? "" : appProperty;
        String appProperty2 = mainMidlet.getAppProperty("GameId");
        String str2 = appProperty2 == null ? "" : appProperty2;
        String appProperty3 = mainMidlet.getAppProperty("LoginServerId");
        String str3 = appProperty3 == null ? "" : appProperty3;
        String appProperty4 = mainMidlet.getAppProperty("PaymentServerId");
        String str4 = appProperty4 == null ? "" : appProperty4;
        bb.a = z.f(str.trim());
        bb.b = z.f(str2.trim());
        z.f(str3.trim());
        z.f(str4.trim());
        bb.a();
        this.a = mainMidlet;
        this.c = display;
        this.b = new bg(this);
        this.b.a();
    }

    public final Display a() {
        return this.c;
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

    public final void a(int i) {
        this.b.a(this.c, i);
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

    public final void a(boolean z) {
        this.b.a(this.c, z);
    }

    public final void g() {
        this.b.a(this.c);
    }

    public final void a(String str, String str2) {
        this.b.a(this.c, str, str2);
    }

    public final void h() {
        this.b.a(this.c, a.am, a.an, 0);
    }
}

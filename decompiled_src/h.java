/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Display
 */
import com.yinhan.kjava.main.MainMidlet;
import com.yinhan.kjava.main.a;
import javax.microedition.lcdui.Display;

public final class h {
    public MainMidlet a;
    private Display c;
    public bg b;

    public h(MainMidlet mainMidlet, Display display) {
        Object object = mainMidlet;
        String string = object.getAppProperty("CpId");
        string = string == null ? "" : string;
        String string2 = object.getAppProperty("GameId");
        string2 = string2 == null ? "" : string2;
        String string3 = object.getAppProperty("LoginServerId");
        string3 = string3 == null ? "" : string3;
        object = object.getAppProperty("PaymentServerId");
        object = object == null ? "" : object;
        bb.a = z.f(string.trim());
        bb.b = z.f(string2.trim());
        z.f(string3.trim());
        z.f(((String)object).trim());
        bb.a();
        this.a = mainMidlet;
        this.c = display;
        this.b = new bg(this);
        this.b.a();
    }

    public final Display a() {
        return this.c;
    }

    public final void a(w w2) {
        if (com.yinhan.kjava.main.a.i == null || bz.b != 72 || av.a("socket://120.78.151.213:20008")) {
            bz.b = (byte)72;
            com.yinhan.kjava.main.a.a("socket://120.78.151.213:20008", (byte)2);
            this.a.a.a("socket://120.78.151.213:20008", "http://117.135.138.130:7099");
        }
        if (com.yinhan.kjava.main.a.i != null) {
            w2.a = true;
            com.yinhan.kjava.main.a.i.a(w2);
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

    public final void a(int n2) {
        this.b.a(this.c, n2);
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

    public final void a(boolean bl2) {
        this.b.a(this.c, bl2);
    }

    public final void g() {
        this.b.a(this.c);
    }

    public final void a(String string, String string2) {
        this.b.a(this.c, string, string2);
    }

    public final void h() {
        this.b.a(this.c, com.yinhan.kjava.main.a.am, com.yinhan.kjava.main.a.an, 0);
    }
}


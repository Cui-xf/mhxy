package com.yinhan.kjava.main;

import defpackage.av;
import defpackage.bz;
import defpackage.h;
import defpackage.t;
import defpackage.w;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;

/* loaded from: java版梦回西游3区251011.jar:com/yinhan/kjava/main/c.class */
public final class c {
    private MainMidlet a;
    private Display b;
    private static h c;

    public c(MainMidlet mainMidlet, Display display) {
        this.a = mainMidlet;
        this.b = display;
    }

    public final void a() {
        c = new h(this.a, this.b);
    }

    public final void a(byte b, String str, String str2) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append((int) b);
        stringBuffer.append(':');
        stringBuffer.append(str);
        stringBuffer.append(':');
        stringBuffer.append(str2);
        w wVarA = bz.a((byte) 1, (byte) 1, stringBuffer.toString());
        if (a.i == null || bz.b != 72 || av.a("socket://120.78.151.213:20008")) {
            System.out.println("socket://120.78.151.213:20008");
            bz.b = (byte) 72;
            this.a.a.a("socket://120.78.151.213:20008", "http://117.135.138.130:7099");
        }
        if (a.i != null) {
            wVarA.a = true;
            a.i.a(wVarA);
        }
    }

    public static void b() {
        c.b.b();
    }

    public static void c() {
        c.h();
    }

    public final void d() {
        c.a(bz.a((byte) 1, (byte) 3, ""));
        this.a.a();
        this.a.a.a("请求中...");
    }

    public static void e() {
        c.a(false);
    }

    public static void f() {
        c.g();
    }

    public static void a(String str, String str2) {
        c.a(str, str2);
    }

    public static void a(boolean z) {
        c.a(true);
    }

    public static void a(Displayable displayable, String str, short s, int i) {
        c.a(1);
    }

    public static void g() {
        if (t.x) {
            c.e();
        } else {
            c.d();
        }
    }

    public static void h() {
        c.f();
    }
}

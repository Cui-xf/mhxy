/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 */
package com.yinhan.kjava.main;

import com.yinhan.kjava.main.MainMidlet;
import com.yinhan.kjava.main.a;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;

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

    public final void a(byte by2, String string, String string2) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(by2);
        stringBuffer.append(':');
        stringBuffer.append(string);
        stringBuffer.append(':');
        stringBuffer.append(string2);
        w w2 = bz.a((byte)1, (byte)1, stringBuffer.toString());
        if (com.yinhan.kjava.main.a.i == null || bz.b != 72 || av.a("socket://120.78.151.213:20008")) {
            System.out.println("socket://120.78.151.213:20008");
            bz.b = (byte)72;
            this.a.a.a("socket://120.78.151.213:20008", "http://117.135.138.130:7099");
        }
        if (com.yinhan.kjava.main.a.i != null) {
            w2.a = true;
            com.yinhan.kjava.main.a.i.a(w2);
        }
    }

    public static void b() {
        com.yinhan.kjava.main.c.c.b.b();
    }

    public static void c() {
        c.h();
    }

    public final void d() {
        c.a(bz.a((byte)1, (byte)3, ""));
        this.a.a();
        this.a.a.a("\u8bf7\u6c42\u4e2d...");
    }

    public static void e() {
        c.a(false);
    }

    public static void f() {
        c.g();
    }

    public static void a(String string, String string2) {
        c.a(string, string2);
    }

    public static void a(boolean bl2) {
        c.a(true);
    }

    public static void a(Displayable displayable, String string, short s2, int n2) {
        c.a(1);
    }

    public static void g() {
        if (t.x) {
            c.e();
            return;
        }
        c.d();
    }

    public static void h() {
        c.f();
    }
}


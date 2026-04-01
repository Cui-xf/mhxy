package com.yinhan.kjava.main;

import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import p000.C0022av;
import p000.C0053bz;
import p000.C0076h;
import p000.C0088t;
import p000.C0091w;

/* renamed from: com.yinhan.kjava.main.c */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-4234804660425969496/classes.dex */
public final class C0068c {

    /* renamed from: c */
    private static C0076h f2225c;

    /* renamed from: a */
    private MainMidlet f2226a;

    /* renamed from: b */
    private Display f2227b;

    public C0068c(MainMidlet mainMidlet, Display display) {
        this.f2226a = mainMidlet;
        this.f2227b = display;
    }

    /* renamed from: a */
    public static void m1465a(String str, String str2) {
        f2225c.m1560a(str, str2);
    }

    /* renamed from: a */
    public static void m1466a(Displayable displayable, String str, short s, int i) {
        f2225c.m1559a(1);
    }

    /* renamed from: a */
    public static void m1467a(boolean z) {
        f2225c.m1562a(true);
    }

    /* renamed from: b */
    public static void m1468b() {
        f2225c.f2273b.m673b();
    }

    /* renamed from: c */
    public static void m1469c() {
        f2225c.m1569h();
    }

    /* renamed from: e */
    public static void m1470e() {
        f2225c.m1562a(false);
    }

    /* renamed from: f */
    public static void m1471f() {
        f2225c.m1568g();
    }

    /* renamed from: g */
    public static void m1472g() {
        if (C0088t.f2538x) {
            f2225c.m1566e();
        } else {
            f2225c.m1565d();
        }
    }

    /* renamed from: h */
    public static void m1473h() {
        f2225c.m1567f();
    }

    /* renamed from: a */
    public final void m1474a() {
        f2225c = new C0076h(this.f2226a, this.f2227b);
    }

    /* renamed from: a */
    public final void m1475a(byte b, String str, String str2) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append((int) b);
        stringBuffer.append(':');
        stringBuffer.append(str);
        stringBuffer.append(':');
        stringBuffer.append(str2);
        C0091w c0091wM1027a = C0053bz.m1027a((byte) 1, (byte) 1, stringBuffer.toString());
        if (RunnableC0066a.f2115i == null || C0053bz.f1805b != 72 || C0022av.m593a("socket://120.78.151.213:20008")) {
            System.out.println("socket://120.78.151.213:20008");
            C0053bz.f1805b = (byte) 72;
            this.f2226a.f2060a.m1436a("socket://120.78.151.213:20008", "http://117.135.138.130:7099");
        }
        if (RunnableC0066a.f2115i != null) {
            c0091wM1027a.f2563a = true;
            RunnableC0066a.f2115i.m600a(c0091wM1027a);
        }
    }

    /* renamed from: d */
    public final void m1476d() {
        f2225c.m1561a(C0053bz.m1027a((byte) 1, (byte) 3, ""));
        this.f2226a.m1377a();
        this.f2226a.f2060a.m1434a("请求中...");
    }
}

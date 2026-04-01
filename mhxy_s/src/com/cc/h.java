package com.cc;

import com.yinhan.kjava.main.MainCanvas;
import com.yinhan.kjava.main.MainMidlet;

import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

public final class h {
    public MainMidlet mainMidlet;
    private Display display;
    public LoginModel loginModel;

    public h(MainMidlet midlet, Display display) {
        String var4;
        var4 = (var4 = ((MIDlet) midlet).getAppProperty("CpId")) == null ? "" : var4;
        String var5;
        var5 = (var5 = ((MIDlet) midlet).getAppProperty("GameId")) == null ? "" : var5;
        String var6;
        var6 = (var6 = ((MIDlet) midlet).getAppProperty("LoginServerId")) == null ? "" : var6;
        String var3;
        var3 = (var3 = ((MIDlet) midlet).getAppProperty("PaymentServerId")) == null ? "" : var3;
        bb_1.a = ZhangHaoUtils.f(var4.trim());
        bb_1.b = ZhangHaoUtils.f(var5.trim());
        ZhangHaoUtils.f(var6.trim());
        ZhangHaoUtils.f(var3.trim());
        bb_1.a();
        this.mainMidlet = midlet;
        this.display = display;
        this.loginModel = new LoginModel(this);
        this.loginModel.a();
    }

    public final Display getDisplay() {
        return this.display;
    }

    public void sendFirstPacket(NetPacket packet) {
        if (MainCanvas.netUtils == null || NetPayloadBuilder.hands2 != 72 || NetUtils.sockerUrlNotEq("socket://120.78.151.213:20008")) {
            NetPayloadBuilder.hands2 = 72;
            MainCanvas.setUrl("socket://120.78.151.213:20008", (byte) 2);
            this.mainMidlet.mainCanvas.init("socket://120.78.151.213:20008", "http://117.135.138.130:7099");
        }

        if (MainCanvas.netUtils != null) {
            packet.firstPacket = true;
            MainCanvas.netUtils.sendPacket(packet);
        }

    }

    public final void b() {
        if (this.mainMidlet != null) {
            this.mainMidlet.mainCanvas.r();
        }
    }

    public final void c() {
        this.loginModel = null;
        this.mainMidlet.notifyDestroyed();
    }

    public final void a(int var1) {
        this.loginModel.a(this.display, var1);
    }

    public final void d() {
        this.loginModel.b(this.display);
    }

    public final void e() {
        this.loginModel.b(this.display);
    }

    public final void f() {
        this.loginModel.c(this.display);
    }

    public final void a(boolean var1) {
        this.loginModel.a(this.display, var1);
    }

    public final void g() {
        this.loginModel.a(this.display);
    }

    public final void a(String var1, String var2) {
        this.loginModel.a(this.display, var1, var2);
    }

    public final void h() {
        this.loginModel.a(this.display, MainCanvas.am, MainCanvas.an, 0);
    }
}

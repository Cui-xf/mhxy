package com.cc;

import com.yinhan.kjava.main.MainMidlet;
import com.yinhan.kjava.main.MainCanvas;

import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

public final class h {
   public MainMidlet a;
   private Display c;
   public bg b;

   public h(MainMidlet var1, Display var2) {
      String var4;
      var4 = (var4 = ((MIDlet)var1).getAppProperty("CpId")) == null ? "" : var4;
      String var5;
      var5 = (var5 = ((MIDlet)var1).getAppProperty("GameId")) == null ? "" : var5;
      String var6;
      var6 = (var6 = ((MIDlet)var1).getAppProperty("LoginServerId")) == null ? "" : var6;
      String var3;
      var3 = (var3 = ((MIDlet)var1).getAppProperty("PaymentServerId")) == null ? "" : var3;
      bb_1.a = z_1.f(var4.trim());
      bb_1.b = z_1.f(var5.trim());
      z_1.f(var6.trim());
      z_1.f(var3.trim());
      bb_1.a();
      this.a = var1;
      this.c = var2;
      this.b = new bg(this);
      this.b.a();
   }

   public final Display a() {
      return this.c;
   }

   public final void a(w var1) {
      if (MainCanvas.i == null || bz_1.b != 72 || av_1.a("socket://120.78.151.213:20008")) {
         bz_1.b = 72;
         MainCanvas.a((String)"socket://120.78.151.213:20008", (byte)2);
         this.a.mainCanvas.a("socket://120.78.151.213:20008", "http://117.135.138.130:7099");
      }

      if (MainCanvas.i != null) {
         var1.a = true;
         MainCanvas.i.a(var1);
      }

   }

   public final void b() {
      if (this.a != null) {
         this.a.mainCanvas.r();
      }
   }

   public final void c() {
      this.b = null;
      this.a.notifyDestroyed();
   }

   public final void a(int var1) {
      this.b.a(this.c, var1);
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

   public final void a(boolean var1) {
      this.b.a(this.c, var1);
   }

   public final void g() {
      this.b.a(this.c);
   }

   public final void a(String var1, String var2) {
      this.b.a(this.c, var1, var2);
   }

   public final void h() {
      this.b.a(this.c, MainCanvas.am, MainCanvas.an, 0);
   }
}

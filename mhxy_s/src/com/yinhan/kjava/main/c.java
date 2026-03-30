package com.yinhan.kjava.main;

import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;

public final class c {
   private MainMidlet a;
   private Display b;
   private static .h c;

   public c(MainMidlet var1, Display var2) {
      this.a = var1;
      this.b = var2;
   }

   public final void a() {
      c = new .h(this.a, this.b);
   }

   public final void a(byte var1, String var2, String var3) {
      StringBuffer var4;
      (var4 = new StringBuffer()).append(var1);
      var4.append(':');
      var4.append(var2);
      var4.append(':');
      var4.append(var3);
      .w var5 = .bz.a((byte)1, (byte)1, var4.toString());
      if (a_MainCanvas.i == null || .bz.b != 72 || .av.a("socket://120.78.151.213:20008")) {
         System.out.println("socket://120.78.151.213:20008");
         .bz.b = 72;
         this.a.a.a("socket://120.78.151.213:20008", "http://117.135.138.130:7099");
      }

      if (a_MainCanvas.i != null) {
         var5.a = true;
         a_MainCanvas.i.a(var5);
      }

   }

   public static void b() {
      c.b.b();
   }

   public static void c() {
      c.h();
   }

   public final void d() {
      c.a(.bz.a((byte)1, (byte)3, ""));
      this.a.a();
      this.a.a.a("请求中...");
   }

   public static void e() {
      c.a(false);
   }

   public static void f() {
      c.g();
   }

   public static void a(String var0, String var1) {
      c.a(var0, var1);
   }

   public static void a(boolean var0) {
      c.a(true);
   }

   public static void a(Displayable var0, String var1, short var2, int var3) {
      c.a(1);
   }

   public static void g() {
      if (.t.x) {
         c.e();
      } else {
         c.d();
      }
   }

   public static void h() {
      c.f();
   }
}

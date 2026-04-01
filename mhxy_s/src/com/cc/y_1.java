package com.cc;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class y_1 extends bk {
   private int[] j = new int[]{20871, 1152942, 9820642, 20871, 1152942};
   private int k = 2780801;
   private int l = 16776917;
   private String m;
   private int n;
   private int o;
   private boolean p = true;
   public static Frame0 a;
   public static Frame0 b;
   public static Frame0 c;
   public static Frame0 d;
   public static Frame0 e;
   private int q;
   private int r;
   private int s;
   private int t;
   private Vector u = new Vector();
   private static y_1 v = null;

   public static y_1 c() {
      if (v == null) {
         v = new y_1();
      }

      return v;
   }

   public final void a() {
   }

   public final void a(String var1) {
      this.m = var1;
   }

   public final void a(bk var1) {
      if (var1 instanceof af) {
         this.u.insertElementAt(var1, 0);
      } else {
         this.u.addElement(var1);
      }
   }

   public final void b() {
      for(int var1 = 0; var1 < this.u.size(); ++var1) {
         ((bk)this.u.elementAt(var1)).b();
      }

      this.u.removeAllElements();
   }

   public final void d() {
      if (this.m != null) {
         this.n = super.f + (super.h - GlobalConfig.i.stringWidth(this.m)) / 2;
         this.o = super.g + 5;
      }

      y_1 var1 = this;
      this.q = this.r = this.s = this.t = -1;

      for(int var2 = 0; var2 < var1.u.size(); ++var2) {
         Object var3;
         if ((var3 = var1.u.elementAt(var2)) instanceof af) {
            var1.q = var2;
         } else if (var3 instanceof ay) {
            var1.r = var2;
         } else if (var3 instanceof bi) {
            var1.s = var2;
         } else if (var3 instanceof u) {
            var1.t = var2;
         }
      }

      int var5 = super.f + 5;
      int var6 = super.g + 31;
      int var8 = super.i - 25 - 10;
      if (this.q != -1) {
         af var4;
         (var4 = (af)this.u.elementAt(this.q)).a(var5, var6, super.h - 10, 25);
         var6 += ((bk)var4).e() - 3;
         var8 -= ((bk)var4).e() - 3;
      }

      if (this.t != -1) {
         u var10;
         (var10 = (u)this.u.elementAt(this.t)).a(super.f + 5, super.g + super.i - 30, super.h - 10, 26);
         var8 -= ((bk)var10).e();
      }

      if (this.r != -1 && this.s != -1) {
         ay var12;
         (var12 = (ay)this.u.elementAt(this.r)).a(var5, var6, super.h - 10, (var8 << 2) / 7);
         var12.a(this.q != -1);
         var6 += (var8 << 2) / 7;
         var8 -= ((bk)var12).e();
         bi var13;
         (var13 = (bi)this.u.elementAt(this.s)).a(var5, var6, super.h - 10, var8);
         var13.a(this.q != -1);
      } else if (this.r != -1 || this.s != -1) {
         bk var11;
         (var11 = (bk)this.u.elementAt(Math.max(this.r, this.s))).a(var5, var6, super.h - 10, var8);
         if (this.r != -1) {
            ((ay)var11).a(this.q != -1);
         } else {
            ((bi)var11).a(this.q != -1);
         }
      }

      for(int var14 = 0; var14 < this.u.size(); ++var14) {
         ((bk)this.u.elementAt(var14)).a();
      }

   }

   public final void a(int var1) {
      for(int var3 = 0; var3 < this.u.size(); ++var3) {
         ((bk)this.u.elementAt(var3)).a(var1);
      }

   }

   public final int a(int var1, int var2) {
      if (var1 > super.f + super.h - 30 && var1 < super.f + super.h - 5 && var2 > super.g && var2 < super.g + 30) {
         return 536870912;
      } else {
         int var3 = 0;

         for(int var4 = 0; var4 < this.u.size(); ++var4) {
            if ((var3 = ((bk)this.u.elementAt(var4)).a(var1, var2)) != 0) {
               return var3;
            }
         }

         return 0;
      }
   }

   public final void a(Graphics var1) {
      var1.setClip(super.f, super.g, super.h, super.i);
      if (this.p) {
         var1.setColor(this.k);
         var1.fillRect(super.f, super.g, super.h, super.i);
      }

      int var2 = super.h / a.b + (super.h % a.b != 0 ? 1 : 0);
      var1.setClip(super.f, super.g + 5, super.h, a.c);

      for(int var3 = 0; var3 < var2; ++var3) {
         var1.drawImage(a.pngImage, super.f + var3 * a.b, super.g + 5, 20);
      }

      var1.setClip(super.f, super.g, super.h, super.i);
      var1.drawImage(b.pngImage, super.f + super.h - b.b - 5, super.g + 6, 20);
      if (this.m != null) {
         LoadingPage.a(var1, (String)this.m, (int)this.n, this.o + (a.c - GlobalConfig.j) / 2, 0, this.l, 0);
      }

      var1.setColor(11267556);
      var1.drawLine(super.f, super.g + 6 + a.c, super.f + super.h - 1, super.g + 6 + a.c);

      for(int var4 = 0; var4 < this.u.size(); ++var4) {
         ((bk)this.u.elementAt(var4)).a(var1);
      }

      var1.setClip(super.f, super.g, super.h, super.i);

      for(int var5 = 0; var5 < this.j.length; ++var5) {
         var1.setColor(this.j[var5]);
         var1.drawRect(super.f + var5, super.g + var5, super.h - var5 * 2 - 1, super.i - var5 * 2 - 1);
      }

      var1.drawImage(c.pngImage, super.f, super.g, 20);
      var1.drawImage(d.pngImage, super.f, super.g + super.i - d.c, 20);
      var1.drawImage(e.pngImage, super.f + super.h - e.b, super.g + super.i - e.c, 20);
   }
}

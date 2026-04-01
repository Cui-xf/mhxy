package com.cc;

import com.yinhan.kjava.main.MainCanvas;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class u extends bk {
   private int a = 16777215;
   private int b = 16777215;
   private int c = 16777215;
   private String d;
   private String e;
   private String j;

   public final void a() {
   }

   public final void b() {
      this.d = null;
      this.e = null;
      this.j = null;
   }

   public final void a(String var1) {
      this.d = var1;
   }

   public final void b(String var1) {
      this.e = var1;
   }

   public final void c(String var1) {
      this.j = var1;
   }

   public final void a(int var1) {
   }

   public final int a(int var1, int var2) {
      if (((bk)this).b(var1, var2)) {
         if (this.d != null && var1 > super.f && var1 < super.f + GlobalConfig.i.stringWidth(this.d) + 5 && var2 > super.g && var2 < super.g + super.i) {
            return 268435456;
         }

         if (this.e != null) {
            int var3 = GlobalConfig.i.stringWidth(this.e) + 10;
            if (var1 > super.f + (super.h - var3) / 2 && var1 < super.f + (super.h + var3) / 2 && var2 > super.f && var2 < super.g + super.i) {
               return 1073741824;
            }
         }

         if (this.j != null && var1 > super.f + super.h - GlobalConfig.i.stringWidth(this.j) - 5 && var1 < super.f + super.h && var2 > super.g && var2 < super.g + super.i) {
            return 536870912;
         }
      }

      return 0;
   }

   public final void a(Graphics var1) {
      var1.setClip(super.f, super.g, super.h, super.i);
      LoadingPage.a(var1, (Image) MainCanvas.E.pngImage, (short) MainCanvas.E.b, super.f, super.g, super.h, MainCanvas.E.c);
      if (this.d != null) {
         var1.setColor(this.a);
         var1.drawString(this.d, super.f + 3, super.g + (super.i - GlobalConfig.j) / 2, 20);
      }

      if (this.e != null) {
         var1.setColor(this.b);
         var1.drawString(this.e, super.f + super.h / 2, super.g + (super.i - GlobalConfig.j) / 2, 17);
      }

      if (this.j != null) {
         var1.setColor(this.c);
         var1.drawString(this.j, super.f + super.h - 3, super.g + (super.i - GlobalConfig.j) / 2, 24);
      }

   }
}

package com.cc;

import javax.microedition.lcdui.Graphics;

public final class ah {
   private byte a;
   private short b;
   private String c;

   public ah(byte var1, short var2, String var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public final int a() {
      return this.a == 1 ? 16 : t_1.i.stringWidth(this.c);
   }

   public final int b() {
      return this.a == 1 ? 17 : t_1.j;
   }

   public final void a(Graphics var1, int var2, int var3, int var4, int var5) {
      switch (this.a) {
         case 0:
            var1.setColor(LoadingPage.a(this.b));
            var1.drawString(this.c, var2, var3 + (var4 - t_1.j) / 2, var5);
            break;
         case 1:
            Frame0 var6;
            if ((var6 = ao_1.b(this.b)) != null) {
               var1.drawImage(var6.pngImage, var2, var3 + (var4 - var6.c) / 2, var5);
               return;
            }
      }

   }
}

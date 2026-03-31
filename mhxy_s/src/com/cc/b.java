package com.cc;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class b {
   public String a;
   private am[] b;
   private int c;
   private int d;

   public b(String var1, int var2) {
      this.a = var1;
      this.c = var2;
      this.a(var1);
   }

   private void a(String var1) {
      int var2 = 0;
      int var3 = 0;
      int var4 = -1;
      Vector var5 = new Vector();

      for(int var6 = 0; var6 < var1.length(); ++var6) {
         if (var1.charAt(var6) == '<') {
            var2 = var6;

            for(int var7 = var6 + 1; var7 < var1.length(); ++var7) {
               if (var1.charAt(var7) == '>') {
                  try {
                     int var8;
                     if ((var8 = Integer.parseInt(var1.substring(var6 + 1, var7))) <= 42 && var8 >= 1) {
                        if (var4 < 0) {
                           var4 = var6;
                           var5.addElement(new am(this, (byte)0, var1.substring(0, var6)));
                        } else if (var2 - var3 > 1) {
                           var5.addElement(new am(this, (byte)0, var1.substring(var3 + 1, var2)));
                        }

                        var3 = var7;
                        var5.addElement(new am(this, (byte)1, var1.substring(var6 + 1, var7)));
                     }
                  } catch (Exception var9) {
                  }
               }
            }
         }
      }

      if (var3 > 0) {
         if (var1.length() - var3 > 1) {
            var5.addElement(new am(this, (byte)0, var1.substring(var3 + 1, var1.length())));
         }
      } else {
         var5.addElement(new am(this, (byte)0, var1.substring(0, var1.length())));
      }

      this.b = new am[var5.size()];
      var5.copyInto(this.b);
      var5.removeAllElements();
   }

   public final void a(Graphics var1, PngUtil var2, Frame0 var3, int var4, int var5) {
      var1.setColor(this.c);
      this.d = 0;

      for(int var6 = 0; var6 < this.b.length; ++var6) {
         if (this.b[var6].a == 0) {
            var1.drawString(this.b[var6].b, var4 + this.d, var5, 0);
            this.d += t_1.i.stringWidth(this.b[var6].b);
         } else {
            var2.a(var1, var3, (int[])null, Integer.parseInt(this.b[var6].b), 0, 0, var4 + this.d, var5, 0, 0);
            this.d += 16;
         }
      }

   }
}

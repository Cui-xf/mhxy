package com.cc;

import com.yinhan.kjava.main.MainCanvas;

import java.util.Vector;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

public final class d_1 {
   private int a;
   private ah[] b;

   private d_1(Vector var1) {
      this.b = new ah[var1.size()];
      var1.copyInto(this.b);

      for(int var2 = 0; var2 < this.b.length; ++var2) {
         if (var2 == 0 || this.a < this.b[var2].b()) {
            this.a = this.b[var2].b();
         }
      }

   }

   public final int a() {
      return this.a;
   }

   public final void a(Graphics var1, int var2, int var3, int var4) {
      for(int var5 = 0; var5 < this.b.length; ++var5) {
         this.b[var5].a(var1, var2, var3, this.a, 20);
         var2 += this.b[var5].a();
      }

   }

   public static d_1[] a(String var0, int var1, Font var2, char var3) {
      if (var0 != null && var2 != null && var1 >= 0) {
         StringBuffer var16 = new StringBuffer();
         StringBuffer var4 = new StringBuffer();
         StringBuffer var5 = new StringBuffer();
         byte var6 = -1;
         int var7 = 0;
         short var8 = 0;
         char var9 = ' ';
         Vector var10 = new Vector();
         Vector var11 = new Vector();

         for(int var12 = 0; var12 < var0.length(); ++var12) {
            char var13 = var0.charAt(var12);
            var8 = -1;
            if (var13 == '<') {
               var16.delete(0, var16.length());
               var9 = ' ';

               for(int var14 = var12 + 1; var14 < Math.min(var12 + 1 + 6, var0.length()); ++var14) {
                  char var15 = var0.charAt(var14);
                  if (var14 != var12 + 1 || var15 != '/' && var15 != 'f' && var15 != 'i') {
                     if (var15 == '>' && var16.length() > 0) {
                        var12 = var14;
                        var8 = Short.parseShort(var16.toString());
                        break;
                     }

                     if (var15 < '0' || var15 > '9') {
                        break;
                     }

                     var16.append(var15);
                  } else {
                     var9 = var15;
                  }
               }
            }

            if (var8 != -1) {
               switch (var9) {
                  case ' ':
                     var5.append(var8);
                     break;
                  case '/':
                     var5.delete(var5.length() > 0 ? var5.length() - 1 : 0, var5.length());
               }

               if (var4.length() > 0) {
                  var10.addElement(new ah((byte)0, (short)var6, var4.toString()));
                  var4.delete(0, var4.length());
               }

               var6 = (byte)(var5.length() > 0 ? var5.charAt(var5.length() - 1) - 48 : -1);
               if (var9 == 'f' || var9 == 'i') {
                  MainCanvas.icon.e(String.valueOf(var8));
                  Sprite var19;
                  short var20 = (var19 = GameSceneController.b(var8)) == null ? 0 : var19.w;
                  if ((var7 += var20) > var1) {
                     var7 = var20;
                     var11.addElement(new d_1(var10));
                     var10.removeAllElements();
                  }

                  var10.addElement(new ah((byte)1, var8, (String)null));
               }
            } else {
               var7 += var2.charWidth(var13);
               if (var13 != '\t' && var7 <= var1) {
                  var4.append(var13);
               } else {
                  var7 = 0;
                  if (var13 != '\t') {
                     --var12;
                  }

                  if (var4.length() > 0 || var13 == '\t') {
                     var10.addElement(new ah((byte)0, (short)var6, var4.toString()));
                     var4.delete(0, var4.length());
                  }

                  var11.addElement(new d_1(var10));
                  var10.removeAllElements();
               }
            }
         }

         if (var7 > 0) {
            if (var4.length() > 0) {
               var10.addElement(new ah((byte)0, (short)var6, var4.toString()));
            }

            var11.addElement(new d_1(var10));
         }

         d_1[] var18 = new d_1[var11.size()];
         var11.copyInto(var18);
         return var18;
      } else {
         return null;
      }
   }
}

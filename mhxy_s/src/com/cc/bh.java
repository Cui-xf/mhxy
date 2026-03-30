package com.cc;

import java.util.Vector;

public final class bh {
   private j[] a;
   private short b = 160;

   public bh(String var1, short var2) {
      this.a(var1);
   }

   private void a(String var1) {
      int var2 = 0;
      int var3 = 0;
      Vector var4 = new Vector();
      StringBuffer var5 = new StringBuffer();
      ad var6 = null;
      ad var7 = null;
      int var8 = 0;

      for(var8 = 0; var8 < var1.length(); ++var8) {
         if ((var2 = var1.charAt(var8)) != '<') {
            var5.append(var2);
         } else if (var1.charAt(var8 + 1) == '/') {
            var2 = var8;
            int var22 = 0;

            for(var22 = var8 + 2; var22 < var1.length(); ++var22) {
               if (var1.charAt(var22) == '>') {
                  try {
                     var8 = Integer.parseInt(var1.substring(var8 + 2, var22));
                     if (var7 != null && var8 == var7.a) {
                        var7.d = (short)(a(var5) - 1);
                        new ad(this);
                        var7 = null;
                     }

                     var8 = var22;
                  } catch (Exception var10) {
                     var8 = var22;
                     var5.append(var1.substring(var2, var3 + 1));
                     var22 = 0;
                  }
                  break;
               }

               if (var1.charAt(var22) == '<') {
                  var3 = var22;
                  var8 = var22;
                  var5.append(var1.substring(var2, var22 - 1));
                  break;
               }
            }

            if (var22 == var1.length()) {
               var5.append(var1.substring(var2, var22));
            }
         } else {
            var2 = var8;
            int var9 = 0;

            for(var9 = var8 + 1; var9 < var1.length(); ++var9) {
               if (var1.charAt(var9) == '>') {
                  try {
                     if (var7 != null) {
                        var7.d = (short)(a(var5) - 1);
                     }

                     label83: {
                        var3 = var9;
                        var8 = Integer.parseInt(var1.substring(var8 + 1, var9));
                        var6 = new ad(this, var8, a(var5));
                        if (var1.charAt(var9 + 1) == '[' && var1.charAt(var9 + 3) == ']') {
                           try {
                              var8 = Integer.parseInt("" + var1.charAt(var9 + 2));
                              var6.b = var8;
                              var8 = var9 + 3;
                              break label83;
                           } catch (Exception var11) {
                           }
                        }

                        var6.b = 0;
                        var8 = var9;
                     }

                     var4.addElement(var6);
                     var7 = var6;
                  } catch (Exception var12) {
                     var8 = var9;
                     var5.append(var1.substring(var2, var3 + 1));
                     var9 = 0;
                  }
                  break;
               }

               if (var1.charAt(var9) == '<') {
                  var3 = var9;
                  var8 = var9;
                  var5.append(var1.substring(var2, var9 - 1));
                  break;
               }
            }

            if (var9 == var1.length()) {
               var5.append(var1.substring(var2, var9));
            }
         }
      }

      if (var7 != null) {
         var7.d = (short)(a(var5) - 1);
      }

      ad[] var24 = new ad[var4.size()];
      var4.copyInto(var24);
      this.a(var5.toString(), var24);
      var4.removeAllElements();
   }

   private static short a(StringBuffer var0) {
      short var1 = 0;

      for(int var2 = 0; var2 < var0.length(); ++var2) {
         if (var0.charAt(var2) != '\t') {
            ++var1;
         }
      }

      return var1;
   }

   private void a(String var1, ad[] var2) {
      var1 = ca.a(var1, t.i, this.b, "\t");
      int var3 = 0;
      this.a = new j[var1.length];
      Vector var4 = new Vector();
      Vector var5 = new Vector();
      Vector var6 = new Vector();
      Object var7 = null;
      Object var8 = null;
      Object var9 = null;

      for(int var10 = 0; var10 < var1.length; ++var10) {
         var3 = this.a(var1[var10], var3, var2, var4, var5, var6);
         String[] var12 = new String[var4.size()];
         String[] var13 = new String[var5.size()];
         String[] var14 = new String[var6.size()];
         var4.copyInto(var12);
         var5.copyInto(var13);
         var6.copyInto(var14);
         this.a[var10] = new j(this, var12, var13, var14);
         var4.removeAllElements();
         var5.removeAllElements();
         var6.removeAllElements();
      }

   }

   private int a(String var1, int var2, ad[] var3, Vector var4, Vector var5, Vector var6) {
      int var15 = 0;
      int var7 = 0;
      int var8 = -1;
      int var9 = 0;
      int var10 = 0;
      var15 = (boolean)0;
      int var11 = 0;

      for(var11 = 0; var11 < var1.length(); ++var11) {
         int var10000 = var15 = var2 + var11;
         ad[] var13 = var3;
         int var12 = var10000;
         int var14 = 0;

         while(true) {
            if (var14 >= var13.length) {
               var10000 = -1;
               break;
            }

            if (var12 >= var13[var14].c && var12 <= var13[var14].d) {
               var10000 = var13[var14].a;
               break;
            }

            ++var14;
         }

         var7 = var10000;
         var13 = var3;
         var12 = var15;
         var14 = 0;

         while(true) {
            if (var14 >= var13.length) {
               var10000 = 0;
               break;
            }

            if (var12 >= var13[var14].c && var12 <= var13[var14].d) {
               var10000 = var13[var14].b;
               break;
            }

            ++var14;
         }

         var15 = var10000;
         if (var8 != var7) {
            var4.addElement(var1.substring(var9, var11));
            var5.addElement(String.valueOf(var8));
            var6.addElement(String.valueOf(var10));
            var9 = var11;
            var8 = var7;
            var10 = var15;
         }
      }

      if (var11 == var1.length()) {
         var4.addElement(var1.substring(var9, var1.length()));
         var5.addElement(String.valueOf(var8));
         var6.addElement(String.valueOf(var10));
      }

      return var2 + var1.length();
   }
}

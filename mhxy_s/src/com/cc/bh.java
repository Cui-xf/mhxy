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

   private void a(String str, ad[] adVarArr) {
      String[] strArrA = LoadingPage.a(str, GlobalConfig.font2, this.b, "\t");
      int iA = 0;
      this.a = new j[strArrA.length];
      Vector vector = new Vector();
      Vector vector2 = new Vector();
      Vector vector3 = new Vector();
      for (int i = 0; i < strArrA.length; i++) {
         iA = a(strArrA[i], iA, adVarArr, vector, vector2, vector3);
         String[] strArr = new String[vector.size()];
         String[] strArr2 = new String[vector2.size()];
         String[] strArr3 = new String[vector3.size()];
         vector.copyInto(strArr);
         vector2.copyInto(strArr2);
         vector3.copyInto(strArr3);
         this.a[i] = new j(this, strArr, strArr2, strArr3);
         vector.removeAllElements();
         vector2.removeAllElements();
         vector3.removeAllElements();
      }
   }



//   private int a(String var1, int var2, ad[] var3, Vector var4, Vector var5, Vector var6) {
//      int var15 = 0;
//      int var7 = 0;
//      int var8 = -1;
//      int var9 = 0;
//      int var10 = 0;
//      var15 = (boolean)0;
//
//      int var11 = 0;
//      for(var11 = 0; var11 < var1.length(); ++var11) {
//         int var10000 = var15 = var2 + var11;
//         ad[] var13 = var3;
//         int var12 = var10000;
//         int var14 = 0;
//
//         while(true) {
//            if (var14 >= var13.length) {
//               var10000 = -1;
//               break;
//            }
//
//            if (var12 >= var13[var14].c && var12 <= var13[var14].d) {
//               var10000 = var13[var14].a;
//               break;
//            }
//
//            ++var14;
//         }
//
//         var7 = var10000;
//         var13 = var3;
//         var12 = var15;
//         var14 = 0;
//
//         while(true) {
//            if (var14 >= var13.length) {
//               var10000 = 0;
//               break;
//            }
//
//            if (var12 >= var13[var14].c && var12 <= var13[var14].d) {
//               var10000 = var13[var14].b;
//               break;
//            }
//
//            ++var14;
//         }
//
//         var15 = var10000;
//         if (var8 != var7) {
//            var4.addElement(var1.substring(var9, var11));
//            var5.addElement(String.valueOf(var8));
//            var6.addElement(String.valueOf(var10));
//            var9 = var11;
//            var8 = var7;
//            var10 = var15;
//         }
//      }
//
//      if (var11 == var1.length()) {
//         var4.addElement(var1.substring(var9, var1.length()));
//         var5.addElement(String.valueOf(var8));
//         var6.addElement(String.valueOf(var10));
//      }
//
//      return var2 + var1.length();
//   }

   private int a(String str, int var2, ad[] adVarArr, Vector vector, Vector vector2, Vector vector3) {
      int i;
      int i2;
      int i3 = -1;
      int i4 = 0;
      int i5 = 0;
      int var11 = 0;
      while (var11 < str.length()) {
         int i6 = var2 + var11;
         int i7 = 0;
         while (true) {
            if (i7 >= adVarArr.length) {
               i = -1;
               break;
            }
            if (i6 >= adVarArr[i7].c && i6 <= adVarArr[i7].d) {
               i = adVarArr[i7].a;
               break;
            }
            i7++;
         }
         int i8 = i;
         int i9 = 0;
         while (true) {
            if (i9 >= adVarArr.length) {
               i2 = 0;
               break;
            }
            if (i6 >= adVarArr[i9].c && i6 <= adVarArr[i9].d) {
               i2 = adVarArr[i9].b;
               break;
            }
            i9++;
         }
         int i10 = i2;
         if (i3 != i8) {
            vector.addElement(str.substring(i4, var11));
            vector2.addElement(String.valueOf(i3));
            vector3.addElement(String.valueOf(i5));
            i4 = var11;
            i3 = i8;
            i5 = i10;
         }
         var11++;
      }
      if (var11 == str.length()) {
         vector.addElement(str.substring(i4, str.length()));
         vector2.addElement(String.valueOf(i3));
         vector3.addElement(String.valueOf(i5));
      }
      return var2 + str.length();
   }

}

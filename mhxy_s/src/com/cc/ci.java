package com.cc;

import java.io.IOException;

public final class ci {
   private static final int[] a = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 0, 99, 99};
   private static final int[] b = new int[]{3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 15, 17, 19, 23, 27, 31, 35, 43, 51, 59, 67, 83, 99, 115, 131, 163, 195, 227, 258, 0, 0};
   private static final int[] c = new int[]{0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13};
   private static final int[] d = new int[]{1, 2, 3, 4, 5, 7, 9, 13, 17, 25, 33, 49, 65, 97, 129, 193, 257, 385, 513, 769, 1025, 1537, 2049, 3073, 4097, 6145, 8193, 12289, 16385, 24577};
   private static final int[] e = new int[]{16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};
   private static int f;
   private static int g;
   private static int h;

   public static byte[] a(byte[] var0) {
      Object var1 = null;
      h = 0;
      g = 0;
      f = 0;
      if (a(var0, 16) == 35615 && a(var0, 8) == 8) {
         int var11 = a(var0, 8);
         f += 6;
         if ((var11 & 4) != 0) {
            f += a(var0, 16);
         }

         if ((var11 & 8) != 0) {
            while(var0[f++] != 0) {
            }
         }

         if ((var11 & 16) != 0) {
            while(var0[f++] != 0) {
            }
         }

         if ((var11 & 2) != 0) {
            f += 2;
         }

         int var2 = f;
         f = var0.length - 4;
         byte[] var12 = new byte[a(var0, 16) | a(var0, 16) << 16];
         int var3 = 0;
         f = var2;
         var2 = 0;
         int var4 = 0;

         do {
            var2 = a(var0, 1);
            if ((var4 = a(var0, 2)) == 0) {
               h = 0;
               var4 = a(var0, 16);
               a(var0, 16);
               System.arraycopy(var0, f, var12, var3, var4);
               f += var4;
               var3 += var4;
            } else {
               int[] var5;
               int[] var16;
               if (var4 == 2) {
                  int var6 = a(var0, 5) + 257;
                  int var7 = a(var0, 5) + 1;
                  int var8 = a(var0, 4) + 4;
                  byte[] var9 = new byte[19];

                  for(int var10 = 0; var10 < var8; ++var10) {
                     var9[e[var10]] = (byte)a(var0, 3);
                  }

                  int[] var34 = b(var9, 18);
                  var16 = b(a(var0, var34, var6), var6 - 1);
                  var5 = b(a(var0, var34, var7), var7 - 1);
               } else {
                  byte[] var18 = new byte[288];

                  for(int var24 = 0; var24 < 144; ++var24) {
                     var18[var24] = 8;
                  }

                  for(int var25 = 144; var25 < 256; ++var25) {
                     var18[var25] = 9;
                  }

                  for(int var26 = 256; var26 < 280; ++var26) {
                     var18[var26] = 7;
                  }

                  for(int var27 = 280; var27 < 288; ++var27) {
                     var18[var27] = 8;
                  }

                  var16 = b(var18, 287);
                  byte[] var28 = new byte[32];

                  for(int var31 = 0; var31 < var28.length; ++var31) {
                     var28[var31] = 5;
                  }

                  var5 = b(var28, 31);
               }

               int var19 = 0;
               int var29 = 0;

               while((var19 = a(var0, var16)) != 256) {
                  if (var19 > 256) {
                     var19 -= 257;
                     int var33 = b[var19];
                     if ((var29 = a[var19]) > 0) {
                        var33 += a(var0, var29);
                     }

                     var19 = a(var0, var5);
                     int var35 = d[var19];
                     int var32;
                     if ((var32 = c[var19]) > 0) {
                        var35 += a(var0, var32);
                     }

                     for(var19 = var3 - var35; var35 < var33; var35 <<= 1) {
                        System.arraycopy(var12, var19, var12, var3, var35);
                        var3 += var35;
                        var33 -= var35;
                     }

                     System.arraycopy(var12, var19, var12, var3, var33);
                     var3 += var33;
                  } else {
                     var12[var3++] = (byte)var19;
                  }
               }
            }
         } while(var2 == 0);

         return var12;
      } else {
         throw new IOException("Invalid GZIP format");
      }
   }

   private static int a(byte[] var0, int var1) {
      int var2 = h == 0 ? (g = var0[f++] & 255) : g >> h;

      for(int var3 = 8 - h; var3 < var1; var3 += 8) {
         g = var0[f++] & 255;
         var2 |= g << var3;
      }

      h = h + var1 & 7;
      return var2 & (1 << var1) - 1;
   }

   private static int a(byte[] var0, int[] var1) {
      int var2;
      for(var2 = var1[0]; var2 >= 0; h = h + 1 & 7) {
         if (h == 0) {
            g = var0[f++] & 255;
         }

         var2 = (g & 1 << h) == 0 ? var1[var2 >> 16] : var1[var2 & '\uffff'];
      }

      return var2 & '\uffff';
   }

   private static byte[] a(byte[] var0, int[] var1, int var2) {
      byte[] var3 = new byte[var2];
      int var4 = 0;
      int var5 = 0;

      for(int var6 = 0; var4 < var2; var6 = var5) {
         if ((var5 = a(var0, var1)) >= 16) {
            int var7 = 0;
            if (var5 == 16) {
               var7 = 3 + a(var0, 2);
               var5 = var6;
            } else {
               if (var5 == 17) {
                  var7 = 3 + a(var0, 3);
               } else {
                  var7 = 11 + a(var0, 7);
               }

               var5 = 0;
            }

            while(var7-- > 0) {
               var3[var4++] = (byte)var5;
            }
         } else {
            var3[var4++] = (byte)var5;
         }
      }

      return var3;
   }

   private static int[] b(byte[] var0, int var1) {
      int[] var2 = new int[17];

      for(int var3 = 0; var3 < var0.length; ++var3) {
         ++var2[var0[var3]];
      }

      int var11 = 0;
      var2[0] = 0;
      int[] var4 = new int[17];

      for(int var5 = 1; var5 <= 16; ++var5) {
         var4[var5] = var11 = var11 + var2[var5 - 1] << 1;
      }

      int[] var13 = new int[(var1 << 1) + 16];
      int var10 = 1;

      for(int var6 = 0; var6 <= var1; ++var6) {
         int var7;
         if ((var7 = var0[var6]) != 0) {
            var11 = var4[var7]++;
            int var8 = 0;
            --var7;

            for(; var7 >= 0; --var7) {
               if ((var11 & 1 << var7) == 0) {
                  int var9;
                  if ((var9 = var13[var8] >> 16) == 0) {
                     var13[var8] |= var10 << 16;
                     var8 = var10++;
                  } else {
                     var8 = var9;
                  }
               } else {
                  int var15;
                  if ((var15 = var13[var8] & '\uffff') == 0) {
                     var13[var8] |= var10;
                     var8 = var10++;
                  } else {
                     var8 = var15;
                  }
               }
            }

            var13[var8] = Integer.MIN_VALUE | var6;
         }
      }

      return var13;
   }
}

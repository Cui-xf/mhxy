package com.cc;

import java.io.IOException;

public final class GzipUtil {
   private static final int[] a = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 0, 99, 99};
   private static final int[] b = new int[]{3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 15, 17, 19, 23, 27, 31, 35, 43, 51, 59, 67, 83, 99, 115, 131, 163, 195, 227, 258, 0, 0};
   private static final int[] c = new int[]{0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13};
   private static final int[] d = new int[]{1, 2, 3, 4, 5, 7, 9, 13, 17, 25, 33, 49, 65, 97, 129, 193, 257, 385, 513, 769, 1025, 1537, 2049, 3073, 4097, 6145, 8193, 12289, 16385, 24577};
   private static final int[] e = new int[]{16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};
   private static int f;
   private static int g;
   private static int h;

   public static byte[] unZip(byte[] bArr) throws IOException {
      int iA;
      int[] iArrB;
      int[] iArrB2;
      int i;
      int i2;
      h = 0;
      g = 0;
      f = 0;
      if (a(bArr, 16) != 35615 || a(bArr, 8) != 8) {
         throw new IOException("Invalid GZIP format");
      }
      int iA2 = a(bArr, 8);
      f += 6;
      if ((iA2 & 4) != 0) {
         f += a(bArr, 16);
      }
      if ((iA2 & 8) != 0) {
         do {
            i2 = f;
            f = i2 + 1;
         } while (bArr[i2] != 0);
      }
      if ((iA2 & 16) != 0) {
         do {
            i = f;
            f = i + 1;
         } while (bArr[i] != 0);
      }
      if ((iA2 & 2) != 0) {
         f += 2;
      }
      int i3 = f;
      f = bArr.length - 4;
      byte[] bArr2 = new byte[a(bArr, 16) | (a(bArr, 16) << 16)];
      int i4 = 0;
      f = i3;
      do {
         iA = a(bArr, 1);
         int iA3 = a(bArr, 2);
         if (iA3 != 0) {
            if (iA3 == 2) {
               int iA4 = a(bArr, 5) + 257;
               int iA5 = a(bArr, 5) + 1;
               int iA6 = a(bArr, 4) + 4;
               byte[] bArr3 = new byte[19];
               for (int i5 = 0; i5 < iA6; i5++) {
                  bArr3[e[i5]] = (byte) a(bArr, 3);
               }
               int[] iArrB3 = b(bArr3, 18);
               iArrB = b(a(bArr, iArrB3, iA4), iA4 - 1);
               iArrB2 = b(a(bArr, iArrB3, iA5), iA5 - 1);
            } else {
               byte[] bArr4 = new byte[288];
               for (int i6 = 0; i6 < 144; i6++) {
                  bArr4[i6] = 8;
               }
               for (int i7 = 144; i7 < 256; i7++) {
                  bArr4[i7] = 9;
               }
               for (int i8 = 256; i8 < 280; i8++) {
                  bArr4[i8] = 7;
               }
               for (int i9 = 280; i9 < 288; i9++) {
                  bArr4[i9] = 8;
               }
               iArrB = b(bArr4, 287);
               byte[] bArr5 = new byte[32];
               for (int i10 = 0; i10 < bArr5.length; i10++) {
                  bArr5[i10] = 5;
               }
               iArrB2 = b(bArr5, 31);
            }
            while (true) {
               int iA7 = a(bArr, iArrB);
               if (iA7 == 256) {
                  break;
               }
               if (iA7 > 256) {
                  int i11 = iA7 - 257;
                  int iA8 = b[i11];
                  int i12 = a[i11];
                  if (i12 > 0) {
                     iA8 += a(bArr, i12);
                  }
                  int iA9 = a(bArr, iArrB2);
                  int iA10 = d[iA9];
                  int i13 = c[iA9];
                  if (i13 > 0) {
                     iA10 += a(bArr, i13);
                  }
                  int i14 = i4 - iA10;
                  while (iA10 < iA8) {
                     System.arraycopy(bArr2, i14, bArr2, i4, iA10);
                     i4 += iA10;
                     iA8 -= iA10;
                     iA10 <<= 1;
                  }
                  System.arraycopy(bArr2, i14, bArr2, i4, iA8);
                  i4 += iA8;
               } else {
                  int i15 = i4;
                  i4++;
                  bArr2[i15] = (byte) iA7;
               }
            }
         } else {
            h = 0;
            int iA11 = a(bArr, 16);
            a(bArr, 16);
            System.arraycopy(bArr, f, bArr2, i4, iA11);
            f += iA11;
            i4 += iA11;
         }
      } while (iA == 0);
      return bArr2;
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

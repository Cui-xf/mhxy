package com.cc;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ax {
   private static int a;
   private static int[] b = new int[0];
   private static boolean[] c = new boolean[0];
   private static Image[] d = new Image[0];
   private static byte[] e = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10, 0, 0, 0, 13, 73, 72, 68, 82, 0, 0, 0, 32, 0, 0, 0, 32, 1, 3, 0, 0, 0, 73, -76, -24, -73, 0, 0, 0, 3, 80, 76, 84, 69, -67, 46, 36, 93, -8, -67, 100, 0, 0, 0, 1, 116, 82, 78, 83, -103, -55, 53, -13, -122, 0, 0, 0, 12, 73, 68, 65, 84, 120, -100, 99, 96, 24, -36, 0, 0, 0, -96, 0, 1, -80, 6, 98, 24, 0, 0, 0, 0, 73, 69, 78, 68, -82, 66, 96, -126};
   private static int[] f;

   private static Image a(int var0, byte var1) {
      int var2 = var1 << 24 | var0;
      int var4 = var2;
      int[] var3 = b;
      int var5 = 0;

      int var10000;
      while(true) {
         if (var5 >= var3.length) {
            var10000 = -1;
            break;
         }

         if (var3[var5] == var4) {
            var10000 = var5;
            break;
         }

         ++var5;
      }

      int var10 = var10000;
      if (var10000 < 0) {
         e[41] = (byte)(var0 >>> 16);
         e[42] = (byte)(var0 >>> 8);
         e[43] = (byte)var0;
         var0 = a(e, 37, 7);
         e[44] = (byte)(var0 >> 24);
         e[45] = (byte)(var0 >>> 16);
         e[46] = (byte)(var0 >>> 8);
         e[47] = (byte)var0;
         e[56] = var1;
         var0 = a(e, 52, 5);
         e[57] = (byte)(var0 >> 24);
         e[58] = (byte)(var0 >>> 16);
         e[59] = (byte)(var0 >>> 8);
         e[60] = (byte)var0;
         if (a >= b.length) {
            Image[] var11 = d;
            int[] var12 = b;
            boolean[] var13 = c;
            d = new Image[var0 = var11.length + 1];
            b = new int[var0];
            c = new boolean[var0];
            System.arraycopy(var11, 0, d, 0, var11.length);
            System.arraycopy(var12, 0, b, 0, var12.length);
            System.arraycopy(var13, 0, c, 0, var13.length);
         }

         try {
            var10 = a;
            d[var10] = Image.createImage(new ByteArrayInputStream(e));
            b[var10] = var2;
            ++a;
         } catch (IOException var6) {
            ((Throwable)var6).printStackTrace();
            return null;
         }
      }

      c[var10] = true;
      return d[var10];
   }

   public static void a(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int[] var8 = new int[]{var0.getClipX(), var0.getClipY(), var0.getClipWidth(), var0.getClipHeight()};
      var0.clipRect(var3, var4, var5, var6);
      var4 = var0.getClipX();
      var5 = var0.getClipY();
      var6 = var0.getClipWidth();
      int var7 = var0.getClipHeight();

      try {
         Image var13;
         var2 = (var13 = a(var1, (byte)var2)).getWidth();
         int var21 = var13.getHeight();
         var6 = var6 / var2 + (var6 % var2 == 0 ? 0 : 1);
         var7 = var7 / var21 + (var7 % var21 == 0 ? 0 : 1);

         for(int var9 = 0; var9 < var7; ++var9) {
            for(int var10 = 0; var10 < var6; ++var10) {
               var0.drawImage(var13, var4 + var10 * var2, var5 + var9 * var21, 0);
            }
         }
      } finally {
         a(var0, var8);
      }

   }

   private static void a(Graphics var0, int[] var1) {
      var0.setClip(var1[0], var1[1], var1[2], var1[3]);
   }

   private static int a(byte[] var0, int var1, int var2) {
      int var3 = var2;
      var2 = var1;
      byte[] var9 = var0;
      int var7 = 0;
      var7 = -1;
      if (f == null) {
         f = new int[256];

         for(int var5 = 0; var5 < 256; ++var5) {
            int var4 = var5;

            for(int var6 = 0; var6 < 8; ++var6) {
               if ((var4 & 1) == 1) {
                  var4 = -306674912 ^ var4 >>> 1;
               } else {
                  var4 >>>= 1;
               }
            }

            f[var5] = var4;
         }
      }

      for(int var11 = var1; var11 < var3 + var2; ++var11) {
         var7 = f[(var7 ^ var9[var11]) & 255] ^ var7 >>> 8;
      }

      return ~var7;
   }
}

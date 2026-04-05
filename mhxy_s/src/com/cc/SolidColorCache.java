package com.cc;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/**
 * 纯色 32×32 PNG 图片的运行时生成与缓存工具（用于绘制纯色平铺背景）。
 *
 * 核心思路：
 *   内置一张 32×32 的单色 PNG 模板（字节数组 e），
 *   每次需要某种颜色时，直接修改模板中 PLTE（调色板）和 tRNS（透明度）chunk 的字节，
 *   重新计算 CRC32 校验值后，通过 Image.createImage() 解码生成 Image 对象并缓存。
 *   相同颜色+透明度的请求直接命中缓存返回，不重复生成。
 *
 * 对外只暴露一个方法：
 *   a(Graphics, color, alpha, clipX, clipY, clipW, clipH)
 *   —— 在指定裁剪区域内，用指定颜色/透明度的 32×32 图片平铺填充。
 */
//public final class  ax {
public final class SolidColorCache {
   /** 缓存中已存入的图片数量（下一个空槽位索引） */
   private static int a;
   /** 缓存键数组：每个元素 = alpha(高8位) | color(低24位) */
   private static int[] b = new int[0];
   /** 各缓存槽位是否被占用（预留，当前未实际用于淘汰逻辑） */
   private static boolean[] c = new boolean[0];
   /** 缓存的 Image 对象数组，与 b 一一对应 */
   private static Image[] d = new Image[0];
   /**
    * 内置 32×32 单色 PNG 模板字节数组（PNG 文件头 + IHDR + PLTE + tRNS + IDAT + IEND）。
    * 调色板颜色字节位于 e[41..43]，透明度字节位于 e[56]，
    * 修改这两处后需重新写入对应 chunk 的 CRC32（e[44..47] 和 e[57..60]）。
    */
   private static byte[] e = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10, 0, 0, 0, 13, 73, 72, 68, 82, 0, 0, 0, 32, 0, 0, 0, 32, 1, 3, 0, 0, 0, 73, -76, -24, -73, 0, 0, 0, 3, 80, 76, 84, 69, -67, 46, 36, 93, -8, -67, 100, 0, 0, 0, 1, 116, 82, 78, 83, -103, -55, 53, -13, -122, 0, 0, 0, 12, 73, 68, 65, 84, 120, -100, 99, 96, 24, -36, 0, 0, 0, -96, 0, 1, -80, 6, 98, 24, 0, 0, 0, 0, 73, 69, 78, 68, -82, 66, 96, -126};
   /** CRC32 查找表（256项，首次使用时懒初始化） */
   private static int[] f;

   /**
    * 获取指定颜色+透明度的 32×32 纯色 Image（优先命中缓存）。
    *
    * @param var0 RGB 颜色值（24位）
    * @param var1 透明度（写入 PNG tRNS chunk，0=全透明，255=不透明）
    * @return 对应的 Image 对象
    *
    * 缓存未命中时：修改模板字节数组 e 中的颜色和透明度，
    * 重新计算 PLTE chunk CRC32（e[44..47]）和 tRNS chunk CRC32（e[57..60]），
    * 再通过 Image.createImage 解码生成新 Image 并存入缓存。
    */
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

   /**
    * 在指定裁剪区域内，用纯色图片平铺填充背景。
    *
    * @param graphics Graphics 对象
    * @param color 颜色值（RGB 24位）
    * @param alpha 透明度
    * @param x 裁剪区域 X
    * @param y 裁剪区域 Y
    * @param w 裁剪区域宽
    * @param h 裁剪区域高
    *
    * 先与当前 clip 取交集缩小绘制范围，再按 32×32 的步长平铺绘制，最后恢复原 clip。
    */
   public static void fillRect(Graphics graphics, int color, int alpha, int x, int y, int w, int h) {
      int[] var8 = new int[]{graphics.getClipX(), graphics.getClipY(), graphics.getClipWidth(), graphics.getClipHeight()};
      graphics.clipRect(x, y, w, h);
      y = graphics.getClipX();
      w = graphics.getClipY();
      h = graphics.getClipWidth();
      int var7 = graphics.getClipHeight();

      try {
         Image var13;
         alpha = (var13 = a(color, (byte)alpha)).getWidth();
         int var21 = var13.getHeight();
         h = h / alpha + (h % alpha == 0 ? 0 : 1);
         var7 = var7 / var21 + (var7 % var21 == 0 ? 0 : 1);

         for(int var9 = 0; var9 < var7; ++var9) {
            for(int var10 = 0; var10 < h; ++var10) {
               graphics.drawImage(var13, y + var10 * alpha, w + var9 * var21, 0);
            }
         }
      } finally {
         a(graphics, var8);
      }

   }

   /** 恢复 Graphics 的裁剪区域为保存的旧值 [x, y, w, h] */
   private static void a(Graphics var0, int[] var1) {
      var0.setClip(var1[0], var1[1], var1[2], var1[3]);
   }

   /**
    * 计算字节数组指定区间的 CRC32 校验值（用于修改 PNG chunk 后重新写入校验码）。
    *
    * @param var0 字节数组
    * @param var1 起始偏移
    * @param var2 长度
    * @return CRC32 值
    */
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

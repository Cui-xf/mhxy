package com.cc;

import com.cc.resource.Resource;

import javax.microedition.lcdui.Image;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

//bf
//一张静态精灵位图，含若干 ImageSlice 子区域切片
public final class Sprite extends Resource {
    /**
     * CRC32 查表缓存（静态共享）
     */
    private static int[] crc32Cache;

    /**
     * 解码后的 PNG 图像对象，直接用于绘制
     */
    public Image image;
    /**
     * 图像宽度（像素）
     */
    public short w;
    /**
     * 图像高度（像素）
     */
    public short h;
    /**
     * 子区域切片数组，每个 ImageSlice 描述图集中一个子图的 (x, y, w, h)
     */
    public ImageSlice[] slices;
    /**
     * 色相偏移量（HSL 变换，单位 1/100000 度；0 表示不变色）
     */
    public int H;
    /**
     * 饱和度偏移量（HSL 变换，单位 1/100000；0 表示不变色）
     */
    public int S;
    /**
     * 亮度偏移量（HSL 变换，单位 1/100000；0 表示不变色）
     */
    public int L;
    /**
     * 最近一次计算的 PLTE CRC32，用于检测调色板是否已修改
     */
    private int crc32;

    public Sprite() {
        super((byte) 0);
    }

    public Sprite(int h, int s, int l) {
        super((byte) 0);
        this.H = h;
        this.S = s;
        this.L = l;
    }

    public ImageSlice getImageSlice(int index) {
        return index >= 0 && index < this.slices.length ? this.slices[index] : null;
    }

    public void createImage(byte[][] bArr, boolean z) throws IOException {
        if (this.H == 0 && this.S == 0 && this.L == 0) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(PngUtil.pngHeader);
            int i = 1;
            while (i < bArr.length) {
                if (bArr[i] != null && bArr[i].length > 4) {
                    byteArrayOutputStream.write(buildPngData(PngUtil.pngChunks[i > 4 ? 4 : i], bArr[i]));
                }
                i++;
            }
            byteArrayOutputStream.write(PngUtil.pngEnd);
            this.image = Image.createImage(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
            byteArrayOutputStream.close();
        } else {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            bos.write(PngUtil.pngHeader);
            int i1 = 1;
            while (i1 < bArr.length) {
                byte[] bytes = bArr[i1];
                if (bytes != null && bytes.length > 4) {
                    if (PngUtil.pngChunks[i1 > 4 ? 4 : i1].equals("PLTE")) {
                        byte[] data = new byte[bytes.length - 4];
                        System.arraycopy(bytes, 0, data, 0, data.length);
                        int[] hsl = hslTransform(rgbToHsl(data, null), this.H * 100000, this.S * 100000, this.L * 100000, 0L, false);
                        byte[] rgb = new byte[data.length];
                        hslToRgb(rgb, (byte[]) null, hsl);
                        System.arraycopy(rgb, 0, bytes, 0, rgb.length);
                        crcCheck(true, rgb);
                        byte[] bArr4 = bytes;
                        int length = rgb.length;
                        int i3 = this.crc32;
                        bArr4[length] = (byte) (i3 >> 24);
                        bArr4[length + 1] = (byte) (i3 >>> 16);
                        bArr4[length + 2] = (byte) (i3 >>> 8);
                        bArr4[length + 3] = (byte) i3;
                    }
                    bos.write(buildPngData(PngUtil.pngChunks[i1 > 4 ? 4 : i1], bytes));
                }
                i1++;
            }
            bos.write(PngUtil.pngEnd);
            byte[] byteArray = bos.toByteArray();
            try {
                this.image = Image.createImage(byteArray, 0, byteArray.length);
                bos.close();
            } catch (Exception e) {
                bos.close();
            }
        }
    }

    private static long[][] rgbToHsl(byte[] rgb, byte[] var1) {
        if (rgb == null) {
            return null;
        } else {
            try {
                long[][] var5 = new long[rgb.length / 3][4];

                for (int var2 = 0; var2 < var5.length; ++var2) {
                    var5[var2][0] = (long) (rgb[var2 * 3] & 255);
                    var5[var2][1] = (long) (rgb[var2 * 3 + 1] & 255);
                    var5[var2][2] = (long) (rgb[var2 * 3 + 2] & 255);
                    var5[var2][3] = 255L;
                }

                for (int var6 = 0; var6 < var5.length; ++var6) {
                    var5[var6][0] *= 100000L;
                    var5[var6][1] *= 100000L;
                    var5[var6][2] *= 100000L;
                    var5[var6][3] *= 100000L;
                }

                return var5;
            } catch (Exception var3) {
                return null;
            }
        }
    }

    private static void hslToRgb(byte[] var0, byte[] var1, int[] var2) {
        if (var2 != null) {
            var1 = new byte[var0.length / 3];

            for (int var3 = 0; var3 < var2.length; ++var3) {
                var0[var3 * 3] = (byte) (var2[var3] >>> 16);
                var0[var3 * 3 + 1] = (byte) (var2[var3] >>> 8);
                var0[var3 * 3 + 2] = (byte) var2[var3];
                if (var3 <= var1.length) {
                    var1[var3] = (byte) (var2[var3] >>> 24);
                }
            }

            boolean var6 = false;

            for (int var4 = 0; var4 < var1.length; ++var4) {
                if (var1[var4] != -1) {
                    var6 = true;
                }
            }

            if (var6) {
                byte[] var10000 = new byte[]{0};
            }

        }
    }

    private static byte[] buildPngData(String pngChunk, byte[] data) {
        byte[] var2 = new byte[data.length + 8];
        int var3 = data.length - 4;
        var2[0] = (byte) (var3 >> 24);
        var2[1] = (byte) (var3 >>> 16);
        var2[2] = (byte) (var3 >>> 8);
        var2[3] = (byte) var3;
        System.arraycopy(pngChunk.getBytes(), 0, var2, 4, 4);
        System.arraycopy(data, 0, var2, 8, data.length);
        return var2;
    }

    private boolean crcCheck(boolean var1, byte[] var2) {
        byte[] var10000 = "PLTE".getBytes();
        var1 = true;
        boolean var3 = false;
        byte[] var7 = var10000;
        int var13 = ~crcCheck_1(0, var7, 0, 4);
        byte[] var10001 = var2;
        int var10 = var2.length;
        int var8 = 0;
        byte[] var12 = var10001;
        var8 = ~crcCheck_1(var13, var12, 0, var10);

        try {
            return this.crc32 == var8;
        } finally {
            this.crc32 = var8;
        }
    }

    private static int crcCheck_1(int var0, byte[] var1, int var2, int var3) {
        var0 = ~var0;
        if (crc32Cache == null) {
            if (crc32Cache == null) {
                crc32Cache = new int[256];
            } else {
                for (int var4 = 0; var4 < crc32Cache.length; ++var4) {
                    crc32Cache[var4] = 0;
                }
            }

            for (int var5 = 0; var5 < 256; ++var5) {
                int var8 = var5;

                for (int var6 = 0; var6 < 8; ++var6) {
                    if ((var8 & 1) == 1) {
                        var8 = -306674912 ^ var8 >>> 1;
                    } else {
                        var8 >>>= 1;
                    }
                }

                crc32Cache[var5] = var8;
            }
        }

        for (int var9 = var2; var9 < var3 + var2; ++var9) {
            var0 = crc32Cache[(var0 ^ var1[var9]) & 255] ^ var0 >>> 8;
        }

        return var0;
    }

    private static int[] hslTransform(long[][] hsl, long h, long s, long l, long var7, boolean var9) {
        int[] var63 = new int[hsl.length];
        long var11 = 0L;
        long var13 = 0L;

        for (int var8 = 0; var8 < hsl.length; ++var8) {
            long[] var64 = new long[3];
            long var17 = hsl[var8][0];
            long var19 = hsl[var8][1];
            long var21 = hsl[var8][2];
            long var42 = var17 / 255L;
            long var44 = var19 / 255L;
            long var46 = var21 / 255L;
            long[] var10 = new long[2];
            if (var42 >= var44) {
                if (var42 >= var46) {
                    var10[0] = var42;
                    var10[1] = var44 <= var46 ? var44 : var46;
                } else {
                    var10[0] = var46;
                    var10[1] = var44;
                }
            } else if (var44 >= var46) {
                var10[0] = var44;
                var10[1] = var42 <= var46 ? var42 : var46;
            } else {
                var10[0] = var46;
                var10[1] = var42;
            }

            long var40 = var10[1];
            long var38;
            long var48 = (var38 = var10[0]) - var40;
            long var36 = (var38 + var40) / 2L;
            long var32;
            long var34;
            if (var48 == 0L) {
                var32 = 0L;
                var34 = 0L;
            } else {
                if (var36 < 50000L) {
                    var34 = var48 * 100000L / (var38 + var40);
                } else {
                    var34 = var48 * 100000L / (200000L - var38 - var40);
                }

                long var50 = ((var38 - var42) / 6L + var48 / 2L) * 100000L / var48;
                long var52 = ((var38 - var44) / 6L + var48 / 2L) * 100000L / var48;
                long var54 = ((var38 - var46) / 6L + var48 / 2L) * 100000L / var48;
                if (var42 == var38) {
                    var32 = var54 - var52;
                } else if (var44 == var38) {
                    var32 = var50 + 33333L - var54;
                } else {
                    var32 = var52 + 66666L - var50;
                }

                if (var32 < 0L) {
                    var32 += 100000L;
                }

                if (var32 > 100000L) {
                    var32 -= 100000L;
                }
            }

            var64[0] = var32;
            var64[1] = var34;
            var64[2] = var36;
            long var29 = var64[0] * 360L;
            long var27 = 36000000L;
            long var25 = 0L;
            if (var29 >= 0L && var29 <= var27) {
                var64[0] = (var64[0] * 360L + h) % 36000000L / 360L;
                if (s > 0L) {
                    var64[1] += (100000L - var64[1]) / 128L * s / 100000L;
                } else {
                    long var23 = -1L * s;
                    var64[1] -= var64[1] / 128L * var23 / 100000L;
                }

                if (l > 0L) {
                    var64[2] += (100000L - var64[2]) / 128L * l / 100000L;
                } else {
                    long var67 = -1L * l;
                    var64[2] -= var64[2] / 128L * var67 / 100000L;
                }

                if ((var11 = (hsl[var8][3] & -16777216L) >>> 24) != 0L) {
                    var13 = var11 + 0L * (255L - var11) / 128L / 100000L;
                } else if (var11 != 0L) {
                    var13 = var11 + var11 * 0L / 128L / 100000L;
                } else {
                    var13 = var11;
                }

                long var10000 = var64[0];
                long var10001 = var64[1];
                var29 = var64[2];
                var27 = var10001;
                var25 = var10000;
                long var31;
                long var33;
                long var35;
                if (var27 == 0L) {
                    var31 = var29 * 255L;
                    var33 = var29 * 255L;
                    var35 = var29 * 255L;
                } else {
                    long var39;
                    if (var29 < 50000L) {
                        var39 = var29 * (var27 + 100000L) / 100000L;
                    } else {
                        var39 = var29 + var27 - var27 * var29 / 100000L;
                    }

                    long var37 = 2L * var29 - var39;
                    long var41 = var25 + 33333L;
                    long var43 = var25 - 33333L;
                    var31 = 255L * hslTransform_1(var37, var39, var41);
                    var33 = 255L * hslTransform_1(var37, var39, var25);
                    var35 = 255L * hslTransform_1(var37, var39, var43);
                }

                int var24 = (-16777216 | ((int) (var31 / 100000L) & 255) << 16 | ((int) (var33 / 100000L) & 255) << 8 | (int) (var35 / 100000L) & 255) & 16777215 | (int) (var13 / 100000L) << 24;
                var63[var8] = var24;
            } else {
                var63[var8] = (int) (hsl[var8][3] / 100000L);
            }
        }

        return var63;
    }

    private static long hslTransform_1(long var0, long var2, long var4) {
        if (var4 < 0L) {
            var4 += 100000L;
        }

        if (var4 > 100000L) {
            var4 -= 100000L;
        }

        if (6L * var4 < 100000L) {
            return var0 + (var2 - var0) * 6L * var4 / 100000L;
        } else if (2L * var4 < 100000L) {
            return var2;
        } else {
            return 3L * var4 < 200000L ? var0 + (var2 - var0) * (66666L - var4) * 6L / 100000L : var0;
        }
    }

    public void clear() {
    }
}

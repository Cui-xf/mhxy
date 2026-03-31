package com.cc;

import javax.microedition.lcdui.Image;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

//bf
public final class Frame0 extends Frame {
    public Image pngImage;
    public short b;
    public short c;
    public aj[] d;
    private static int[] h;
    public int e;
    public int f;
    public int g;
    private int i;

    public Frame0() {
        super((byte) 0);
    }

    public Frame0(int var1, int var2, int var3) {
        super((byte) 0);
        this.e = var1;
        this.f = var2;
        this.g = var3;
    }

    public final aj a(int var1) {
        return var1 >= 0 && var1 < this.d.length ? this.d[var1] : null;
    }

    // public final void a(byte[][] bArr, boolean z) throws IOException {
//    public void draw(byte[][] data, boolean var2) throws IOException {
//        if (this.e == 0 && this.f == 0 && this.g == 0) {
//            byte[][] var21 = data;
//            ByteArrayOutputStream var22 = new ByteArrayOutputStream();
//            (var22 = ).write(ai_1.b);
//
//            for (int var11 = 1; var11 < var21.length; ++var11) {
//                if (var21[var11] != null && var21[var11].length > 4) {
//                    ((OutputStream) var22).write(a(ai_1.a[var11 > 4 ? 4 : var11], var21[var11]));
//                }
//            }
//
//            ((OutputStream) var22).write(ai_1.c);
//            byte[] var12 = var22.toByteArray();
//            this.a = Image.createImage(new ByteArrayInputStream(var12));
//            var22.close();
//        } else {
//            ByteArrayOutputStream var13;
//            (var13 = new ByteArrayOutputStream()).write(ai_1.b);
//
//            for (int var3 = 1; var3 < data.length; ++var3) {
//                if (data[var3] != null && data[var3].length > 4) {
//                    if (ai_1.a[var3 > 4 ? 4 : var3].equals("PLTE")) {
//                        byte[] var4;
//                        byte[] var5 = new byte[(var4 = data[var3]).length - 4];
//                        System.arraycopy(var4, 0, var5, 0, var5.length);
//                        int[] var19 = a(a((byte[]) var5, (byte[]) null), (long) this.e * 100000L, (long) this.f * 100000L, (long) this.g * 100000L, 0L, false);
//                        a(var4 = new byte[var5.length], (byte[]) null, var19);
//                        System.arraycopy(var4, 0, data[var3], 0, var4.length);
//                        this.a(true, var4);
//                        byte[] var10000 = data[var3];
//                        int var10001 = var4.length;
//                        int var6 = this.i;
//                        int var20 = var10001;
//                        var4 = var10000;
//                        var10000[var20] = (byte) (var6 >> 24);
//                        var4[var20 + 1] = (byte) (var6 >>> 16);
//                        var4[var20 + 2] = (byte) (var6 >>> 8);
//                        var4[var20 + 3] = (byte) var6;
//                    }
//
//                    ((OutputStream) var13).write(a(ai_1.a[var3 > 4 ? 4 : var3], data[var3]));
//                }
//            }
//
//            ((OutputStream) var13).write(ai_1.c);
//            byte[] var14 = var13.toByteArray();
//
//            try {
//                this.a = Image.createImage(var14, 0, var14.length);
//                return;
//            } catch (Exception var9) {
//            } finally {
//                var13.close();
//            }
//
//        }
//    }

    public void draw(byte[][] bArr, boolean z) throws IOException {
        if (this.e == 0 && this.f == 0 && this.g == 0) {
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
            this.pngImage = Image.createImage(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
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
                        int[] iArrA = a(toRGBA(data, (byte[]) null), this.e * 100000, this.f * 100000, this.g * 100000, 0L, false);
                        byte[] bArr3 = new byte[data.length];
                        a(bArr3, (byte[]) null, iArrA);
                        System.arraycopy(bArr3, 0, bytes, 0, bArr3.length);
                        a(true, bArr3);
                        byte[] bArr4 = bytes;
                        int length = bArr3.length;
                        int i3 = this.i;
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
                this.pngImage = Image.createImage(byteArray, 0, byteArray.length);
                bos.close();
            } catch (Exception e) {
                bos.close();
            }
        }
    }

    private static long[][] toRGBA(byte[] var0, byte[] var1) {
        if ((var0 = var0) == null) {
            return null;
        } else {
            try {
                long[][] var5 = new long[var0.length / 3][4];

                for (int var2 = 0; var2 < var5.length; ++var2) {
                    var5[var2][0] = (long) (var0[var2 * 3] & 255);
                    var5[var2][1] = (long) (var0[var2 * 3 + 1] & 255);
                    var5[var2][2] = (long) (var0[var2 * 3 + 2] & 255);
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

    private static void a(byte[] var0, byte[] var1, int[] var2) {
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

    private boolean a(boolean var1, byte[] var2) {
        byte[] var10000 = "PLTE".getBytes();
        var1 = true;
        boolean var3 = false;
        byte[] var7 = var10000;
        int var13 = ~a(0, var7, 0, 4);
        byte[] var10001 = var2;
        int var10 = var2.length;
        int var8 = 0;
        byte[] var12 = var10001;
        var8 = ~a(var13, var12, 0, var10);

        try {
            return this.i == var8;
        } finally {
            this.i = var8;
        }
    }

    private static int a(int var0, byte[] var1, int var2, int var3) {
        var0 = ~var0;
        if (h == null) {
            if (h == null) {
                h = new int[256];
            } else {
                for (int var4 = 0; var4 < h.length; ++var4) {
                    h[var4] = 0;
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

                h[var5] = var8;
            }
        }

        for (int var9 = var2; var9 < var3 + var2; ++var9) {
            var0 = h[(var0 ^ var1[var9]) & 255] ^ var0 >>> 8;
        }

        return var0;
    }

    private static int[] a(long[][] var0, long var1, long var3, long var5, long var7, boolean var9) {
        int[] var63 = new int[var0.length];
        long var11 = 0L;
        long var13 = 0L;

        for (int var8 = 0; var8 < var0.length; ++var8) {
            long[] var64 = new long[3];
            long var17 = var0[var8][0];
            long var19 = var0[var8][1];
            long var21 = var0[var8][2];
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
                var64[0] = (var64[0] * 360L + var1) % 36000000L / 360L;
                if (var3 > 0L) {
                    var64[1] += (100000L - var64[1]) / 128L * var3 / 100000L;
                } else {
                    long var23 = -1L * var3;
                    var64[1] -= var64[1] / 128L * var23 / 100000L;
                }

                if (var5 > 0L) {
                    var64[2] += (100000L - var64[2]) / 128L * var5 / 100000L;
                } else {
                    long var67 = -1L * var5;
                    var64[2] -= var64[2] / 128L * var67 / 100000L;
                }

                if ((var11 = (var0[var8][3] & -16777216L) >>> 24) != 0L) {
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
                    var31 = 255L * a(var37, var39, var41);
                    var33 = 255L * a(var37, var39, var25);
                    var35 = 255L * a(var37, var39, var43);
                }

                int var24 = (-16777216 | ((int) (var31 / 100000L) & 255) << 16 | ((int) (var33 / 100000L) & 255) << 8 | (int) (var35 / 100000L) & 255) & 16777215 | (int) (var13 / 100000L) << 24;
                var63[var8] = var24;
            } else {
                var63[var8] = (int) (var0[var8][3] / 100000L);
            }
        }

        return var63;
    }

    private static long a(long var0, long var2, long var4) {
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

    public final void a() {
    }
}

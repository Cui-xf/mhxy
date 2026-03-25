/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import javax.microedition.lcdui.Image;

public final class bf
extends cf {
    public Image a;
    public short b;
    public short c;
    public aj[] d;
    private static int[] h;
    public int e;
    public int f;
    public int g;
    private int i;

    public bf() {
        super((byte)0);
    }

    public bf(int n2, int n3, int n4) {
        super((byte)0);
        this.e = n2;
        this.f = n3;
        this.g = n4;
    }

    public final aj a(int n2) {
        if (n2 >= 0 && n2 < this.d.length) {
            return this.d[n2];
        }
        return null;
    }

    public final void a(byte[][] byArray, boolean bl2) {
        if (this.e == 0 && this.f == 0 && this.g == 0) {
            byte[][] byArray2 = byArray;
            bf bf2 = this;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(ai.b);
            for (int i2 = 1; i2 < byArray2.length; ++i2) {
                if (byArray2[i2] == null || byArray2[i2].length <= 4) continue;
                byteArrayOutputStream.write(bf.a(ai.a[i2 > 4 ? 4 : i2], byArray2[i2]));
            }
            byteArrayOutputStream.write(ai.c);
            byte[] byArray3 = byteArrayOutputStream.toByteArray();
            bf2.a = Image.createImage((InputStream)new ByteArrayInputStream(byArray3));
            byteArrayOutputStream.close();
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(ai.b);
        for (int i3 = 1; i3 < byArray.length; ++i3) {
            if (byArray[i3] == null || byArray[i3].length <= 4) continue;
            if (ai.a[i3 > 4 ? 4 : i3].equals("PLTE")) {
                byte[] byArray4 = byArray[i3];
                Object object = new byte[byArray4.length - 4];
                System.arraycopy(byArray4, 0, object, 0, ((byte[])object).length);
                byArray4 = object;
                long[][] lArray = bf.a(object, null);
                object = lArray;
                object = bf.a(lArray, (long)this.e * 100000L, (long)this.f * 100000L, (long)this.g * 100000L, 0L, false);
                byArray4 = new byte[byArray4.length];
                bf.a(byArray4, null, object);
                System.arraycopy(byArray4, 0, byArray[i3], 0, byArray4.length);
                this.a(true, byArray4);
                byte[] byArray5 = byArray[i3];
                int n2 = this.i;
                int n3 = byArray4.length;
                byArray4 = byArray5;
                byArray5[n3] = n2 >> 24;
                byArray4[n3 + 1] = (byte)(n2 >>> 16);
                byArray4[n3 + 2] = (byte)(n2 >>> 8);
                byArray4[n3 + 3] = (byte)n2;
            }
            byteArrayOutputStream.write(bf.a(ai.a[i3 > 4 ? 4 : i3], byArray[i3]));
        }
        byteArrayOutputStream.write(ai.c);
        byte[] byArray6 = byteArrayOutputStream.toByteArray();
        try {
            this.a = Image.createImage((byte[])byArray6, (int)0, (int)byArray6.length);
            return;
        }
        catch (Exception exception) {
            return;
        }
        finally {
            byteArrayOutputStream.close();
        }
    }

    private static long[][] a(byte[] byArray, byte[] object) {
        if (byArray == null) {
            return null;
        }
        try {
            int n2;
            object = new long[byArray.length / 3][4];
            for (n2 = 0; n2 < ((byte[])object).length; ++n2) {
                object[n2][0] = byArray[n2 * 3] & 0xFF;
                object[n2][1] = byArray[n2 * 3 + 1] & 0xFF;
                object[n2][2] = byArray[n2 * 3 + 2] & 0xFF;
                object[n2][3] = 255L;
            }
            for (n2 = 0; n2 < ((byte[])object).length; ++n2) {
                object[n2][0] = object[n2][0] * 100000L;
                object[n2][1] = object[n2][1] * 100000L;
                object[n2][2] = object[n2][2] * 100000L;
                object[n2][3] = object[n2][3] * 100000L;
            }
            return object;
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static void a(byte[] byArray, byte[] byArray2, int[] nArray) {
        int n2;
        if (nArray == null) {
            return;
        }
        byArray2 = new byte[byArray.length / 3];
        for (n2 = 0; n2 < nArray.length; ++n2) {
            byArray[n2 * 3] = (byte)(nArray[n2] >>> 16);
            byArray[n2 * 3 + 1] = (byte)(nArray[n2] >>> 8);
            byArray[n2 * 3 + 2] = (byte)nArray[n2];
            if (n2 > byArray2.length) continue;
            byArray2[n2] = (byte)(nArray[n2] >>> 24);
        }
        n2 = 0;
        for (int i2 = 0; i2 < byArray2.length; ++i2) {
            if (byArray2[i2] == -1) continue;
            n2 = 1;
        }
        if (n2 != 0) {
            (new byte[1])[0] = 0;
        }
    }

    private static byte[] a(String string, byte[] byArray) {
        byte[] byArray2 = new byte[byArray.length + 8];
        int n2 = byArray.length - 4;
        byArray2[0] = n2 >> 24;
        byArray2[1] = (byte)(n2 >>> 16);
        byArray2[2] = (byte)(n2 >>> 8);
        byArray2[3] = (byte)n2;
        System.arraycopy(string.getBytes(), 0, byArray2, 4, 4);
        System.arraycopy(byArray, 0, byArray2, 8, byArray.length);
        return byArray2;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(boolean bl2, byte[] byArray) {
        void var2_8;
        int byArray2 = 4;
        boolean bl3 = false;
        byte[] n3 = "PLTE".getBytes();
        int n2 = ~bf.a(0, n3, 0, 4);
        boolean bl4 = ((void)var2_8).length;
        boolean bl5 = false;
        void var3_12 = var2_8;
        int n5 = n2;
        n5 = ~bf.a(n2, (byte[])var3_12, 0, bl4 ? 1 : 0);
        try {
            bl4 = this.i == n5;
            return bl4;
        }
        finally {
            this.i = n5;
        }
    }

    private static int a(int n2, byte[] byArray, int n3, int n4) {
        int n5;
        n2 ^= 0xFFFFFFFF;
        if (h == null) {
            if (h == null) {
                h = new int[256];
            } else {
                for (n5 = 0; n5 < h.length; ++n5) {
                    bf.h[n5] = 0;
                }
            }
            for (int i2 = 0; i2 < 256; ++i2) {
                n5 = i2;
                for (int i3 = 0; i3 < 8; ++i3) {
                    if ((n5 & 1) == 1) {
                        n5 = 0xEDB88320 ^ n5 >>> 1;
                        continue;
                    }
                    n5 >>>= 1;
                }
                bf.h[i2] = n5;
            }
        }
        for (n5 = n3; n5 < n4 + n3; ++n5) {
            n2 = h[(n2 ^ byArray[n5]) & 0xFF] ^ n2 >>> 8;
        }
        return n2;
    }

    private static int[] a(long[][] lArray, long l2, long l3, long l4, long l5, boolean bl2) {
        int[] nArray = new int[lArray.length];
        long l6 = 0L;
        long l7 = 0L;
        for (int i2 = 0; i2 < lArray.length; ++i2) {
            long l8;
            long l9;
            long[] lArray2;
            long[] lArray3 = new long[3];
            long l10 = lArray[i2][0];
            long l11 = lArray[i2][1];
            long l12 = lArray[i2][2];
            long[] lArray4 = lArray3;
            long l13 = l12;
            long l14 = l11;
            long l15 = l10;
            long l16 = l15 / 255L;
            long l17 = l14 / 255L;
            long l18 = l13 / 255L;
            long[] lArray5 = lArray2 = new long[2];
            long l19 = l18;
            long l20 = l16;
            long l21 = l17;
            if (l20 >= l21) {
                if (l20 >= l19) {
                    lArray5[0] = l20;
                    lArray5[1] = l21 <= l19 ? l21 : l19;
                } else {
                    lArray5[0] = l19;
                    lArray5[1] = l21;
                }
            } else if (l21 >= l19) {
                lArray5[0] = l21;
                lArray5[1] = l20 <= l19 ? l20 : l19;
            } else {
                lArray5[0] = l19;
                lArray5[1] = l20;
            }
            long l22 = lArray2[1];
            long l23 = lArray2[0];
            long l24 = l23 - l22;
            long l25 = (l23 + l22) / 2L;
            if (l24 == 0L) {
                l9 = 0L;
                l8 = 0L;
            } else {
                l8 = l25 < 50000L ? l24 * 100000L / (l23 + l22) : l24 * 100000L / (200000L - l23 - l22);
                long l26 = ((l23 - l16) / 6L + l24 / 2L) * 100000L / l24;
                long l27 = ((l23 - l17) / 6L + l24 / 2L) * 100000L / l24;
                long l28 = ((l23 - l18) / 6L + l24 / 2L) * 100000L / l24;
                l9 = l16 == l23 ? l28 - l27 : (l17 == l23 ? l26 + 33333L - l28 : l27 + 66666L - l26);
                if (l9 < 0L) {
                    l9 += 100000L;
                }
                if (l9 > 100000L) {
                    l9 -= 100000L;
                }
            }
            lArray4[0] = l9;
            lArray4[1] = l8;
            lArray4[2] = l25;
            l13 = lArray3[0] * 360L;
            l14 = 36000000L;
            l15 = 0L;
            if (l13 >= 0L && l13 <= l14) {
                int n2;
                long l29;
                long l30;
                long l31;
                long l32;
                lArray3[0] = (lArray3[0] * 360L + l2) % 36000000L / 360L;
                if (l3 > 0L) {
                    lArray3[1] = lArray3[1] + (100000L - lArray3[1]) / 128L * l3 / 100000L;
                } else {
                    l32 = -1L * l3;
                    lArray3[1] = lArray3[1] - lArray3[1] / 128L * l32 / 100000L;
                }
                if (l4 > 0L) {
                    lArray3[2] = lArray3[2] + (100000L - lArray3[2]) / 128L * l4 / 100000L;
                } else {
                    l32 = -1L * l4;
                    lArray3[2] = lArray3[2] - lArray3[2] / 128L * l32 / 100000L;
                }
                long l33 = (lArray[i2][3] & 0xFFFFFFFFFF000000L) >>> 24;
                l7 = l33 != 0L ? l33 + 0L * (255L - l33) / 128L / 100000L : (l33 != 0L ? l33 + l33 * 0L / 128L / 100000L : l33);
                l13 = lArray3[2];
                l14 = lArray3[1];
                l15 = lArray3[0];
                if (l14 == 0L) {
                    l31 = l13 * 255L;
                    l30 = l13 * 255L;
                    l29 = l13 * 255L;
                } else {
                    long l34 = l13 < 50000L ? l13 * (l14 + 100000L) / 100000L : l13 + l14 - l14 * l13 / 100000L;
                    long l35 = 2L * l13 - l34;
                    long l36 = l15 + 33333L;
                    long l37 = l15 - 33333L;
                    l31 = 255L * bf.a(l35, l34, l36);
                    l30 = 255L * bf.a(l35, l34, l15);
                    l29 = 255L * bf.a(l35, l34, l37);
                }
                int n3 = (0xFF000000 | ((int)(l31 / 100000L) & 0xFF) << 16 | ((int)(l30 / 100000L) & 0xFF) << 8 | (int)(l29 / 100000L) & 0xFF) & 0xFFFFFF;
                nArray[i2] = n2 = n3 | (int)(l7 / 100000L) << 24;
                continue;
            }
            nArray[i2] = (int)(lArray[i2][3] / 100000L);
        }
        return nArray;
    }

    private static long a(long l2, long l3, long l4) {
        if (l4 < 0L) {
            l4 += 100000L;
        }
        if (l4 > 100000L) {
            l4 -= 100000L;
        }
        if (6L * l4 < 100000L) {
            return l2 + (l3 - l2) * 6L * l4 / 100000L;
        }
        if (2L * l4 < 100000L) {
            return l3;
        }
        if (3L * l4 < 200000L) {
            return l2 + (l3 - l2) * (66666L - l4) * 6L / 100000L;
        }
        return l2;
    }

    public final void a() {
    }
}


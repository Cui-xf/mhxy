/*
 * Decompiled with CFR 0.152.
 */
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

    public static byte[] a(byte[] byArray) {
        Object var1_1 = null;
        h = 0;
        g = 0;
        f = 0;
        if (ci.a(byArray, 16) != 35615 || ci.a(byArray, 8) != 8) {
            throw new IOException("Invalid GZIP format");
        }
        int n2 = ci.a(byArray, 8);
        f += 6;
        if ((n2 & 4) != 0) {
            f += ci.a(byArray, 16);
        }
        if ((n2 & 8) != 0) {
            while (byArray[f++] != 0) {
            }
        }
        if ((n2 & 0x10) != 0) {
            while (byArray[f++] != 0) {
            }
        }
        if ((n2 & 2) != 0) {
            f += 2;
        }
        int n3 = f;
        f = byArray.length - 4;
        byte[] byArray2 = new byte[ci.a(byArray, 16) | ci.a(byArray, 16) << 16];
        int n4 = 0;
        f = n3;
        n3 = 0;
        int n5 = 0;
        do {
            int[] nArray;
            int[] nArray2;
            int n6;
            int n7;
            int n8;
            n3 = ci.a(byArray, 1);
            n5 = ci.a(byArray, 2);
            if (n5 == 0) {
                h = 0;
                n5 = ci.a(byArray, 16);
                ci.a(byArray, 16);
                System.arraycopy(byArray, f, byArray2, n4, n5);
                f += n5;
                n4 += n5;
                continue;
            }
            if (n5 == 2) {
                n8 = ci.a(byArray, 5) + 257;
                n7 = ci.a(byArray, 5) + 1;
                n6 = ci.a(byArray, 4) + 4;
                byte[] byArray3 = new byte[19];
                for (int i2 = 0; i2 < n6; ++i2) {
                    byArray3[ci.e[i2]] = (byte)ci.a(byArray, 3);
                }
                int[] nArray3 = ci.b(byArray3, 18);
                nArray2 = ci.b(ci.a(byArray, nArray3, n8), n8 - 1);
                nArray = ci.b(ci.a(byArray, nArray3, n7), n7 - 1);
            } else {
                byte[] byArray4 = new byte[288];
                for (n7 = 0; n7 < 144; ++n7) {
                    byArray4[n7] = 8;
                }
                for (n7 = 144; n7 < 256; ++n7) {
                    byArray4[n7] = 9;
                }
                for (n7 = 256; n7 < 280; ++n7) {
                    byArray4[n7] = 7;
                }
                for (n7 = 280; n7 < 288; ++n7) {
                    byArray4[n7] = 8;
                }
                nArray2 = ci.b(byArray4, 287);
                byte[] byArray5 = new byte[32];
                for (n6 = 0; n6 < byArray5.length; ++n6) {
                    byArray5[n6] = 5;
                }
                nArray = ci.b(byArray5, 31);
            }
            n8 = 0;
            n7 = 0;
            while ((n8 = ci.a(byArray, nArray2)) != 256) {
                if (n8 > 256) {
                    int n9 = b[n8 -= 257];
                    n7 = a[n8];
                    if (n7 > 0) {
                        n9 += ci.a(byArray, n7);
                    }
                    n8 = ci.a(byArray, nArray);
                    int n10 = d[n8];
                    n6 = c[n8];
                    if (n6 > 0) {
                        n10 += ci.a(byArray, n6);
                    }
                    n8 = n4 - n10;
                    while (n10 < n9) {
                        System.arraycopy(byArray2, n8, byArray2, n4, n10);
                        n4 += n10;
                        n9 -= n10;
                        n10 <<= 1;
                    }
                    System.arraycopy(byArray2, n8, byArray2, n4, n9);
                    n4 += n9;
                    continue;
                }
                byArray2[n4++] = (byte)n8;
            }
        } while (n3 == 0);
        return byArray2;
    }

    private static int a(byte[] byArray, int n2) {
        int n3 = h == 0 ? (g = byArray[f++] & 0xFF) : g >> h;
        for (int i2 = 8 - h; i2 < n2; i2 += 8) {
            g = byArray[f++] & 0xFF;
            n3 |= g << i2;
        }
        h = h + n2 & 7;
        return n3 & (1 << n2) - 1;
    }

    private static int a(byte[] byArray, int[] nArray) {
        int n2 = nArray[0];
        while (n2 >= 0) {
            if (h == 0) {
                g = byArray[f++] & 0xFF;
            }
            n2 = (g & 1 << h) == 0 ? nArray[n2 >> 16] : nArray[n2 & 0xFFFF];
            h = h + 1 & 7;
        }
        return n2 & 0xFFFF;
    }

    private static byte[] a(byte[] byArray, int[] nArray, int n2) {
        byte[] byArray2 = new byte[n2];
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        while (n3 < n2) {
            n4 = ci.a(byArray, nArray);
            if (n4 >= 16) {
                int n6 = 0;
                if (n4 == 16) {
                    n6 = 3 + ci.a(byArray, 2);
                    n4 = n5;
                } else {
                    n6 = n4 == 17 ? 3 + ci.a(byArray, 3) : 11 + ci.a(byArray, 7);
                    n4 = 0;
                }
                while (n6-- > 0) {
                    byArray2[n3++] = (byte)n4;
                }
            } else {
                byArray2[n3++] = (byte)n4;
            }
            n5 = n4;
        }
        return byArray2;
    }

    private static int[] b(byte[] byArray, int n2) {
        int n3;
        int[] nArray = new int[17];
        for (n3 = 0; n3 < byArray.length; ++n3) {
            byte by2 = byArray[n3];
            nArray[by2] = nArray[by2] + 1;
        }
        n3 = 0;
        nArray[0] = 0;
        int[] nArray2 = new int[17];
        for (int i2 = 1; i2 <= 16; ++i2) {
            nArray2[i2] = n3 = n3 + nArray[i2 - 1] << 1;
        }
        int[] nArray3 = new int[(n2 << 1) + 16];
        int n4 = 1;
        for (int i3 = 0; i3 <= n2; ++i3) {
            int n5 = byArray[i3];
            if (n5 == 0) continue;
            int n6 = n5--;
            nArray2[n6] = nArray2[n6] + 1;
            int n7 = 0;
            while (n5 >= 0) {
                int n8 = n3 & 1 << n5;
                if (n8 == 0) {
                    n8 = nArray3[n7] >> 16;
                    if (n8 == 0) {
                        int n9 = n7;
                        nArray3[n9] = nArray3[n9] | n4 << 16;
                        n7 = n4++;
                    } else {
                        n7 = n8;
                    }
                } else {
                    n8 = nArray3[n7] & 0xFFFF;
                    if (n8 == 0) {
                        int n10 = n7;
                        nArray3[n10] = nArray3[n10] | n4;
                        n7 = n4++;
                    } else {
                        n7 = n8;
                    }
                }
                --n5;
            }
            nArray3[n7] = Integer.MIN_VALUE | i3;
        }
        return nArray3;
    }
}


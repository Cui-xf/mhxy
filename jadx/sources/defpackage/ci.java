package defpackage;

import java.io.IOException;

/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-8105993946875401281/classes.dex */
public final class ci {
    private static final int[] a = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 0, 99, 99};
    private static final int[] b = {3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 15, 17, 19, 23, 27, 31, 35, 43, 51, 59, 67, 83, 99, 115, 131, 163, 195, 227, 258, 0, 0};
    private static final int[] c = {0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13};
    private static final int[] d = {1, 2, 3, 4, 5, 7, 9, 13, 17, 25, 33, 49, 65, 97, 129, 193, 257, 385, 513, 769, 1025, 1537, 2049, 3073, 4097, 6145, 8193, 12289, 16385, 24577};
    private static final int[] e = {16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};
    private static int f;
    private static int g;
    private static int h;

    private static int a(byte[] bArr, int i) {
        int i2;
        if (h == 0) {
            int i3 = f;
            f = i3 + 1;
            i2 = bArr[i3] & 255;
            g = i2;
        } else {
            i2 = g >> h;
        }
        int i4 = i2;
        for (int i5 = 8 - h; i5 < i; i5 += 8) {
            int i6 = f;
            f = i6 + 1;
            g = bArr[i6] & 255;
            i4 |= g << i5;
        }
        h = (h + i) & 7;
        return ((1 << i) - 1) & i4;
    }

    private static int a(byte[] bArr, int[] iArr) {
        int i = iArr[0];
        while (i >= 0) {
            if (h == 0) {
                int i2 = f;
                f = i2 + 1;
                g = bArr[i2] & 255;
            }
            i = (g & (1 << h)) == 0 ? iArr[i >> 16] : iArr[i & 65535];
            h = (h + 1) & 7;
        }
        return i & 65535;
    }

    public static byte[] a(byte[] bArr) throws IOException {
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
        f = i3;
        int i4 = 0;
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
                        bArr2[i4] = (byte) iA7;
                        i4++;
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

    private static byte[] a(byte[] bArr, int[] iArr, int i) {
        int iA;
        byte[] bArr2 = new byte[i];
        int i2 = 0;
        int i3 = 0;
        while (i3 < i) {
            int iA2 = a(bArr, iArr);
            if (iA2 >= 16) {
                if (iA2 == 16) {
                    iA = a(bArr, 2) + 3;
                } else {
                    iA = iA2 == 17 ? a(bArr, 3) + 3 : a(bArr, 7) + 11;
                    i2 = 0;
                }
                while (true) {
                    int i4 = iA - 1;
                    if (iA <= 0) {
                        break;
                    }
                    bArr2[i3] = (byte) i2;
                    iA = i4;
                    i3++;
                }
                iA2 = i2;
            } else {
                bArr2[i3] = (byte) iA2;
                i3++;
            }
            i2 = iA2;
        }
        return bArr2;
    }

    private static int[] b(byte[] bArr, int i) {
        int i2;
        int i3;
        int[] iArr = new int[17];
        for (byte b2 : bArr) {
            iArr[b2] = iArr[b2] + 1;
        }
        iArr[0] = 0;
        int[] iArr2 = new int[17];
        int i4 = 0;
        for (int i5 = 1; i5 <= 16; i5++) {
            i4 = (i4 + iArr[i5 - 1]) << 1;
            iArr2[i5] = i4;
        }
        int[] iArr3 = new int[(i << 1) + 16];
        int i6 = 1;
        for (int i7 = 0; i7 <= i; i7++) {
            byte b3 = bArr[i7];
            if (b3 != 0) {
                int i8 = iArr2[b3];
                iArr2[b3] = i8 + 1;
                int i9 = 0;
                int i10 = b3 - 1;
                while (i10 >= 0) {
                    if (((1 << i10) & i8) == 0) {
                        i2 = iArr3[i9] >> 16;
                        if (i2 == 0) {
                            iArr3[i9] = iArr3[i9] | (i6 << 16);
                            i3 = i6 + 1;
                            i2 = i6;
                        } else {
                            i3 = i6;
                        }
                    } else {
                        i2 = iArr3[i9] & 65535;
                        if (i2 == 0) {
                            iArr3[i9] = iArr3[i9] | i6;
                            i3 = i6 + 1;
                            i2 = i6;
                        } else {
                            i3 = i6;
                        }
                    }
                    i10--;
                    i9 = i2;
                    i6 = i3;
                }
                iArr3[i9] = Integer.MIN_VALUE | i7;
            }
        }
        return iArr3;
    }
}

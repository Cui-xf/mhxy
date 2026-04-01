package p000;

import java.io.IOException;

/* renamed from: ci */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-4234804660425969496/classes.dex */
public final class C0063ci {

    /* renamed from: a */
    private static final int[] f2024a = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 0, 99, 99};

    /* renamed from: b */
    private static final int[] f2025b = {3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 15, 17, 19, 23, 27, 31, 35, 43, 51, 59, 67, 83, 99, 115, 131, 163, 195, 227, 258, 0, 0};

    /* renamed from: c */
    private static final int[] f2026c = {0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13};

    /* renamed from: d */
    private static final int[] f2027d = {1, 2, 3, 4, 5, 7, 9, 13, 17, 25, 33, 49, 65, 97, 129, 193, 257, 385, 513, 769, 1025, 1537, 2049, 3073, 4097, 6145, 8193, 12289, 16385, 24577};

    /* renamed from: e */
    private static final int[] f2028e = {16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};

    /* renamed from: f */
    private static int f2029f;

    /* renamed from: g */
    private static int f2030g;

    /* renamed from: h */
    private static int f2031h;

    /* renamed from: a */
    private static int m1362a(byte[] bArr, int i) {
        int i2;
        if (f2031h == 0) {
            int i3 = f2029f;
            f2029f = i3 + 1;
            i2 = bArr[i3] & 255;
            f2030g = i2;
        } else {
            i2 = f2030g >> f2031h;
        }
        int i4 = i2;
        for (int i5 = 8 - f2031h; i5 < i; i5 += 8) {
            int i6 = f2029f;
            f2029f = i6 + 1;
            f2030g = bArr[i6] & 255;
            i4 |= f2030g << i5;
        }
        f2031h = (f2031h + i) & 7;
        return ((1 << i) - 1) & i4;
    }

    /* renamed from: a */
    private static int m1363a(byte[] bArr, int[] iArr) {
        int i = iArr[0];
        while (i >= 0) {
            if (f2031h == 0) {
                int i2 = f2029f;
                f2029f = i2 + 1;
                f2030g = bArr[i2] & 255;
            }
            i = (f2030g & (1 << f2031h)) == 0 ? iArr[i >> 16] : iArr[i & 65535];
            f2031h = (f2031h + 1) & 7;
        }
        return i & 65535;
    }

    /* renamed from: a */
    public static byte[] m1364a(byte[] bArr) throws IOException {
        int iM1362a;
        int[] iArrM1366b;
        int[] iArrM1366b2;
        int i;
        int i2;
        f2031h = 0;
        f2030g = 0;
        f2029f = 0;
        if (m1362a(bArr, 16) != 35615 || m1362a(bArr, 8) != 8) {
            throw new IOException("Invalid GZIP format");
        }
        int iM1362a2 = m1362a(bArr, 8);
        f2029f += 6;
        if ((iM1362a2 & 4) != 0) {
            f2029f += m1362a(bArr, 16);
        }
        if ((iM1362a2 & 8) != 0) {
            do {
                i2 = f2029f;
                f2029f = i2 + 1;
            } while (bArr[i2] != 0);
        }
        if ((iM1362a2 & 16) != 0) {
            do {
                i = f2029f;
                f2029f = i + 1;
            } while (bArr[i] != 0);
        }
        if ((iM1362a2 & 2) != 0) {
            f2029f += 2;
        }
        int i3 = f2029f;
        f2029f = bArr.length - 4;
        byte[] bArr2 = new byte[m1362a(bArr, 16) | (m1362a(bArr, 16) << 16)];
        f2029f = i3;
        int i4 = 0;
        do {
            iM1362a = m1362a(bArr, 1);
            int iM1362a3 = m1362a(bArr, 2);
            if (iM1362a3 != 0) {
                if (iM1362a3 == 2) {
                    int iM1362a4 = m1362a(bArr, 5) + 257;
                    int iM1362a5 = m1362a(bArr, 5) + 1;
                    int iM1362a6 = m1362a(bArr, 4) + 4;
                    byte[] bArr3 = new byte[19];
                    for (int i5 = 0; i5 < iM1362a6; i5++) {
                        bArr3[f2028e[i5]] = (byte) m1362a(bArr, 3);
                    }
                    int[] iArrM1366b3 = m1366b(bArr3, 18);
                    iArrM1366b = m1366b(m1365a(bArr, iArrM1366b3, iM1362a4), iM1362a4 - 1);
                    iArrM1366b2 = m1366b(m1365a(bArr, iArrM1366b3, iM1362a5), iM1362a5 - 1);
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
                    iArrM1366b = m1366b(bArr4, 287);
                    byte[] bArr5 = new byte[32];
                    for (int i10 = 0; i10 < bArr5.length; i10++) {
                        bArr5[i10] = 5;
                    }
                    iArrM1366b2 = m1366b(bArr5, 31);
                }
                while (true) {
                    int iM1363a = m1363a(bArr, iArrM1366b);
                    if (iM1363a == 256) {
                        break;
                    }
                    if (iM1363a > 256) {
                        int i11 = iM1363a - 257;
                        int iM1362a7 = f2025b[i11];
                        int i12 = f2024a[i11];
                        if (i12 > 0) {
                            iM1362a7 += m1362a(bArr, i12);
                        }
                        int iM1363a2 = m1363a(bArr, iArrM1366b2);
                        int iM1362a8 = f2027d[iM1363a2];
                        int i13 = f2026c[iM1363a2];
                        if (i13 > 0) {
                            iM1362a8 += m1362a(bArr, i13);
                        }
                        int i14 = i4 - iM1362a8;
                        while (iM1362a8 < iM1362a7) {
                            System.arraycopy(bArr2, i14, bArr2, i4, iM1362a8);
                            i4 += iM1362a8;
                            iM1362a7 -= iM1362a8;
                            iM1362a8 <<= 1;
                        }
                        System.arraycopy(bArr2, i14, bArr2, i4, iM1362a7);
                        i4 += iM1362a7;
                    } else {
                        bArr2[i4] = (byte) iM1363a;
                        i4++;
                    }
                }
            } else {
                f2031h = 0;
                int iM1362a9 = m1362a(bArr, 16);
                m1362a(bArr, 16);
                System.arraycopy(bArr, f2029f, bArr2, i4, iM1362a9);
                f2029f += iM1362a9;
                i4 += iM1362a9;
            }
        } while (iM1362a == 0);
        return bArr2;
    }

    /* renamed from: a */
    private static byte[] m1365a(byte[] bArr, int[] iArr, int i) {
        int iM1362a;
        byte[] bArr2 = new byte[i];
        int i2 = 0;
        int i3 = 0;
        while (i3 < i) {
            int iM1363a = m1363a(bArr, iArr);
            if (iM1363a >= 16) {
                if (iM1363a == 16) {
                    iM1362a = m1362a(bArr, 2) + 3;
                } else {
                    iM1362a = iM1363a == 17 ? m1362a(bArr, 3) + 3 : m1362a(bArr, 7) + 11;
                    i2 = 0;
                }
                while (true) {
                    int i4 = iM1362a - 1;
                    if (iM1362a <= 0) {
                        break;
                    }
                    bArr2[i3] = (byte) i2;
                    iM1362a = i4;
                    i3++;
                }
                iM1363a = i2;
            } else {
                bArr2[i3] = (byte) iM1363a;
                i3++;
            }
            i2 = iM1363a;
        }
        return bArr2;
    }

    /* renamed from: b */
    private static int[] m1366b(byte[] bArr, int i) {
        int i2;
        int i3;
        int[] iArr = new int[17];
        for (byte b : bArr) {
            iArr[b] = iArr[b] + 1;
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
            byte b2 = bArr[i7];
            if (b2 != 0) {
                int i8 = iArr2[b2];
                iArr2[b2] = i8 + 1;
                int i9 = 0;
                int i10 = b2 - 1;
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

package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import javax.microedition.lcdui.Image;

/* loaded from: java版梦回西游3区251011.jar:bf.class */
public final class bf extends cf {
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
        super((byte) 0);
    }

    public bf(int i, int i2, int i3) {
        super((byte) 0);
        this.e = i;
        this.f = i2;
        this.g = i3;
    }

    public final aj a(int i) {
        if (i < 0 || i >= this.d.length) {
            return null;
        }
        return this.d[i];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v21, types: [int] */
    public final void a(byte[][] bArr, boolean z) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        if (this.e == 0 && this.f == 0 && this.g == 0) {
            byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(ai.b);
            int i = 1;
            while (i < bArr.length) {
                if (bArr[i] != 0 && bArr[i].length > 4) {
                    byteArrayOutputStream.write(a(ai.a[i > 4 ? 4 : i], bArr[i]));
                }
                i++;
            }
            byteArrayOutputStream.write(ai.c);
            this.a = Image.createImage(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
            return;
        }
        byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(ai.b);
        int i2 = 1;
        while (i2 < bArr.length) {
            if (bArr[i2] != 0 && bArr[i2].length > 4) {
                if (ai.a[i2 > 4 ? 4 : i2].equals("PLTE")) {
                    Object[] objArr = bArr[i2];
                    byte[] bArr2 = new byte[objArr.length - 4];
                    System.arraycopy(objArr, 0, bArr2, 0, bArr2.length);
                    int[] iArrA = a(a(bArr2, (byte[]) null), this.e * 100000, this.f * 100000, this.g * 100000, 0L, false);
                    byte[] bArr3 = new byte[bArr2.length];
                    a(bArr3, (byte[]) null, iArrA);
                    System.arraycopy(bArr3, 0, bArr[i2], 0, bArr3.length);
                    a(true, bArr3);
                    Object[] objArr2 = bArr[i2];
                    int length = bArr3.length;
                    int i3 = this.i;
                    objArr2[length] = i3 >> 24;
                    objArr2[length + 1] = (byte) (i3 >>> 16);
                    objArr2[length + 2] = (byte) (i3 >>> 8);
                    objArr2[length + 3] = (byte) i3;
                }
                byteArrayOutputStream.write(a(ai.a[i2 > 4 ? 4 : i2], bArr[i2]));
            }
            i2++;
        }
        byteArrayOutputStream.write(ai.c);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            this.a = Image.createImage(byteArray, 0, byteArray.length);
        } catch (Exception unused) {
        } finally {
            byteArrayOutputStream.close();
        }
    }

    private static long[][] a(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return null;
        }
        try {
            long[][] jArr = new long[bArr.length / 3][4];
            for (int i = 0; i < jArr.length; i++) {
                jArr[i][0] = bArr[i * 3] & 255;
                jArr[i][1] = bArr[(i * 3) + 1] & 255;
                jArr[i][2] = bArr[(i * 3) + 2] & 255;
                jArr[i][3] = 255;
            }
            for (int i2 = 0; i2 < jArr.length; i2++) {
                jArr[i2][0] = jArr[i2][0] * 100000;
                jArr[i2][1] = jArr[i2][1] * 100000;
                jArr[i2][2] = jArr[i2][2] * 100000;
                jArr[i2][3] = jArr[i2][3] * 100000;
            }
            return jArr;
        } catch (Exception unused) {
            return null;
        }
    }

    private static void a(byte[] bArr, byte[] bArr2, int[] iArr) {
        if (iArr == null) {
            return;
        }
        byte[] bArr3 = new byte[bArr.length / 3];
        for (int i = 0; i < iArr.length; i++) {
            bArr[i * 3] = (byte) (iArr[i] >>> 16);
            bArr[(i * 3) + 1] = (byte) (iArr[i] >>> 8);
            bArr[(i * 3) + 2] = (byte) iArr[i];
            if (i <= bArr3.length) {
                bArr3[i] = (byte) (iArr[i] >>> 24);
            }
        }
        boolean z = false;
        for (byte b : bArr3) {
            if (b != -1) {
                z = true;
            }
        }
        if (z) {
            new byte[1][0] = 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    private static byte[] a(String str, byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length + 8];
        int length = bArr.length - 4;
        bArr2[0] = length >> 24;
        bArr2[1] = (byte) (length >>> 16);
        bArr2[2] = (byte) (length >>> 8);
        bArr2[3] = (byte) length;
        System.arraycopy(str.getBytes(), 0, bArr2, 4, 4);
        System.arraycopy(bArr, 0, bArr2, 8, bArr.length);
        return bArr2;
    }

    private boolean a(boolean z, byte[] bArr) {
        int iA = a(a(0, "PLTE".getBytes(), 0, 4) ^ (-1), bArr, 0, bArr.length) ^ (-1);
        try {
            return this.i == iA;
        } finally {
            this.i = iA;
        }
    }

    private static int a(int i, byte[] bArr, int i2, int i3) {
        int i4 = i ^ (-1);
        if (h == null) {
            if (h == null) {
                h = new int[256];
            } else {
                for (int i5 = 0; i5 < h.length; i5++) {
                    h[i5] = 0;
                }
            }
            for (int i6 = 0; i6 < 256; i6++) {
                int i7 = i6;
                for (int i8 = 0; i8 < 8; i8++) {
                    i7 = (i7 & 1) == 1 ? (-306674912) ^ (i7 >>> 1) : i7 >>> 1;
                }
                h[i6] = i7;
            }
        }
        for (int i9 = i2; i9 < i3 + i2; i9++) {
            i4 = h[(i4 ^ bArr[i9]) & 255] ^ (i4 >>> 8);
        }
        return i4;
    }

    private static int[] a(long[][] jArr, long j, long j2, long j3, long j4, boolean z) {
        long j5;
        long j6;
        long jA;
        long jA2;
        long jA3;
        int[] iArr = new int[jArr.length];
        for (int i = 0; i < jArr.length; i++) {
            long[] jArr2 = new long[3];
            long j7 = jArr[i][0] / 255;
            long j8 = jArr[i][1] / 255;
            long j9 = jArr[i][2] / 255;
            long[] jArr3 = new long[2];
            if (j7 >= j8) {
                if (j7 >= j9) {
                    jArr3[0] = j7;
                    jArr3[1] = j8 <= j9 ? j8 : j9;
                } else {
                    jArr3[0] = j9;
                    jArr3[1] = j8;
                }
            } else if (j8 >= j9) {
                jArr3[0] = j8;
                jArr3[1] = j7 <= j9 ? j7 : j9;
            } else {
                jArr3[0] = j9;
                jArr3[1] = j7;
            }
            long j10 = jArr3[1];
            long j11 = jArr3[0];
            long j12 = j11 - j10;
            long j13 = (j11 + j10) / 2;
            if (j12 == 0) {
                j6 = 0;
                j5 = 0;
            } else {
                j5 = j13 < 50000 ? (j12 * 100000) / (j11 + j10) : (j12 * 100000) / ((200000 - j11) - j10);
                long j14 = ((((j11 - j7) / 6) + (j12 / 2)) * 100000) / j12;
                long j15 = ((((j11 - j8) / 6) + (j12 / 2)) * 100000) / j12;
                long j16 = ((((j11 - j9) / 6) + (j12 / 2)) * 100000) / j12;
                j6 = j7 == j11 ? j16 - j15 : j8 == j11 ? (j14 + 33333) - j16 : (j15 + 66666) - j14;
                if (j6 < 0) {
                    j6 += 100000;
                }
                if (j6 > 100000) {
                    j6 -= 100000;
                }
            }
            jArr2[0] = j6;
            jArr2[1] = j5;
            jArr2[2] = j13;
            long j17 = jArr2[0] * 360;
            if (j17 >= 0 && j17 <= 36000000) {
                jArr2[0] = (((jArr2[0] * 360) + j) % 36000000) / 360;
                if (j2 > 0) {
                    jArr2[1] = jArr2[1] + ((((100000 - jArr2[1]) / 128) * j2) / 100000);
                } else {
                    jArr2[1] = jArr2[1] - (((jArr2[1] / 128) * ((-1) * j2)) / 100000);
                }
                if (j3 > 0) {
                    jArr2[2] = jArr2[2] + ((((100000 - jArr2[2]) / 128) * j3) / 100000);
                } else {
                    jArr2[2] = jArr2[2] - (((jArr2[2] / 128) * ((-1) * j3)) / 100000);
                }
                long j18 = (jArr[i][3] & (-16777216)) >>> 24;
                long j19 = j18 != 0 ? j18 + (((0 * (255 - j18)) / 128) / 100000) : j18 != 0 ? j18 + (((j18 * 0) / 128) / 100000) : j18;
                long j20 = jArr2[0];
                long j21 = jArr2[1];
                long j22 = jArr2[2];
                if (j21 == 0) {
                    jA = j22 * 255;
                    jA2 = j22 * 255;
                    jA3 = j22 * 255;
                } else {
                    long j23 = j22 < 50000 ? (j22 * (j21 + 100000)) / 100000 : (j22 + j21) - ((j21 * j22) / 100000);
                    long j24 = (2 * j22) - j23;
                    jA = 255 * a(j24, j23, j20 + 33333);
                    jA2 = 255 * a(j24, j23, j20);
                    jA3 = 255 * a(j24, j23, j20 - 33333);
                }
                iArr[i] = (((-16777216) | ((((int) (jA / 100000)) & 255) << 16) | ((((int) (jA2 / 100000)) & 255) << 8) | (((int) (jA3 / 100000)) & 255)) & 16777215) | (((int) (j19 / 100000)) << 24);
            } else {
                iArr[i] = (int) (jArr[i][3] / 100000);
            }
        }
        return iArr;
    }

    private static long a(long j, long j2, long j3) {
        if (j3 < 0) {
            j3 += 100000;
        }
        if (j3 > 100000) {
            j3 -= 100000;
        }
        return 6 * j3 < 100000 ? j + ((((j2 - j) * 6) * j3) / 100000) : 2 * j3 < 100000 ? j2 : 3 * j3 < 200000 ? j + ((((j2 - j) * (66666 - j3)) * 6) / 100000) : j;
    }

    @Override // defpackage.cf
    public final void a() {
    }
}

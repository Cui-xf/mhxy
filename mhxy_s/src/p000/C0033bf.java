package p000;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import javax.microedition.lcdui.Image;

/* renamed from: bf */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-4234804660425969496/classes.dex */
public final class C0033bf extends AbstractC0060cf {

    /* renamed from: h */
    private static int[] f597h;

    /* renamed from: a */
    public Image f598a;

    /* renamed from: b */
    public short f599b;

    /* renamed from: c */
    public short f600c;

    /* renamed from: d */
    public C0010aj[] f601d;

    /* renamed from: e */
    public int f602e;

    /* renamed from: f */
    public int f603f;

    /* renamed from: g */
    public int f604g;

    /* renamed from: i */
    private int f605i;

    public C0033bf() {
        super((byte) 0);
    }

    public C0033bf(int i, int i2, int i3) {
        super((byte) 0);
        this.f602e = i;
        this.f603f = i2;
        this.f604g = i3;
    }

    /* renamed from: a */
    private static int m643a(int i, byte[] bArr, int i2, int i3) {
        int i4 = i ^ (-1);
        if (f597h == null) {
            if (f597h == null) {
                f597h = new int[256];
            } else {
                for (int i5 = 0; i5 < f597h.length; i5++) {
                    f597h[i5] = 0;
                }
            }
            for (int i6 = 0; i6 < 256; i6++) {
                int i7 = i6;
                for (int i8 = 0; i8 < 8; i8++) {
                    i7 = (i7 & 1) == 1 ? (i7 >>> 1) ^ (-306674912) : i7 >>> 1;
                }
                f597h[i6] = i7;
            }
        }
        int i9 = i4;
        for (int i10 = i2; i10 < i3 + i2; i10++) {
            i9 = (i9 >>> 8) ^ f597h[(bArr[i10] ^ i9) & 255];
        }
        return i9;
    }

    /* renamed from: a */
    private static long m644a(long j, long j2, long j3) {
        long j4 = j3 < 0 ? j3 + 100000 : j3;
        if (j4 > 100000) {
            j4 -= 100000;
        }
        if (6 * j4 < 100000) {
            return j + ((j4 * ((j2 - j) * 6)) / 100000);
        }
        if (2 * j4 < 100000) {
            return j2;
        }
        if (3 * j4 < 200000) {
            return j + ((((66666 - j4) * (j2 - j)) * 6) / 100000);
        }
        return j;
    }

    /* renamed from: a */
    private static void m645a(byte[] bArr, byte[] bArr2, int[] iArr) {
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

    /* renamed from: a */
    private boolean m646a(boolean z, byte[] bArr) {
        int iM643a = m643a(m643a(0, "PLTE".getBytes(), 0, 4) ^ (-1), bArr, 0, bArr.length) ^ (-1);
        try {
            return this.f605i == iM643a;
        } finally {
            this.f605i = iM643a;
        }
    }

    /* renamed from: a */
    private static byte[] m647a(String str, byte[] bArr) {
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

    /* renamed from: a */
    private static int[] m648a(long[][] jArr, long j, long j2, long j3, long j4, boolean z) {
        long j5;
        long j6;
        long jM644a;
        long j7;
        long j8;
        int[] iArr = new int[jArr.length];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= jArr.length) {
                return iArr;
            }
            long[] jArr2 = new long[3];
            long j9 = jArr[i2][0] / 255;
            long j10 = jArr[i2][1] / 255;
            long j11 = jArr[i2][2] / 255;
            long[] jArr3 = new long[2];
            if (j9 >= j10) {
                if (j9 >= j11) {
                    jArr3[0] = j9;
                    jArr3[1] = j10 <= j11 ? j10 : j11;
                } else {
                    jArr3[0] = j11;
                    jArr3[1] = j10;
                }
            } else if (j10 >= j11) {
                jArr3[0] = j10;
                jArr3[1] = j9 <= j11 ? j9 : j11;
            } else {
                jArr3[0] = j11;
                jArr3[1] = j9;
            }
            long j12 = jArr3[1];
            long j13 = jArr3[0];
            long j14 = j13 - j12;
            long j15 = (j13 + j12) / 2;
            if (j14 == 0) {
                j6 = 0;
                j5 = 0;
            } else {
                j5 = j15 < 50000 ? (100000 * j14) / (j12 + j13) : (100000 * j14) / ((200000 - j13) - j12);
                long j16 = ((((j13 - j9) / 6) + (j14 / 2)) * 100000) / j14;
                long j17 = ((((j13 - j10) / 6) + (j14 / 2)) * 100000) / j14;
                long j18 = ((((j13 - j11) / 6) + (j14 / 2)) * 100000) / j14;
                j6 = j9 == j13 ? j18 - j17 : j10 == j13 ? (33333 + j16) - j18 : (66666 + j17) - j16;
                if (j6 < 0) {
                    j6 += 100000;
                }
                if (j6 > 100000) {
                    j6 -= 100000;
                }
            }
            jArr2[0] = j6;
            jArr2[1] = j5;
            jArr2[2] = j15;
            long j19 = jArr2[0] * 360;
            if (j19 >= 0 && j19 <= 36000000) {
                jArr2[0] = (((jArr2[0] * 360) + j) % 36000000) / 360;
                if (j2 > 0) {
                    jArr2[1] = jArr2[1] + ((((100000 - jArr2[1]) / 128) * j2) / 100000);
                } else {
                    jArr2[1] = jArr2[1] - ((((-1) * j2) * (jArr2[1] / 128)) / 100000);
                }
                if (j3 > 0) {
                    jArr2[2] = jArr2[2] + ((((100000 - jArr2[2]) / 128) * j3) / 100000);
                } else {
                    jArr2[2] = jArr2[2] - ((((-1) * j3) * (jArr2[2] / 128)) / 100000);
                }
                long j20 = (jArr[i2][3] & (-16777216)) >>> 24;
                long j21 = j20 != 0 ? j20 + (((0 * (255 - j20)) / 128) / 100000) : j20 != 0 ? j20 + (((0 * j20) / 128) / 100000) : j20;
                long j22 = jArr2[0];
                long j23 = jArr2[1];
                long j24 = jArr2[2];
                if (j23 == 0) {
                    j8 = j24 * 255;
                    j7 = j24 * 255;
                    jM644a = 255 * j24;
                } else {
                    long j25 = j24 < 50000 ? ((j23 + 100000) * j24) / 100000 : (j24 + j23) - ((j23 * j24) / 100000);
                    long j26 = (2 * j24) - j25;
                    long jM644a2 = 255 * m644a(j26, j25, 33333 + j22);
                    long jM644a3 = 255 * m644a(j26, j25, j22);
                    jM644a = m644a(j26, j25, j22 - 33333) * 255;
                    j7 = jM644a3;
                    j8 = jM644a2;
                }
                iArr[i2] = (((((int) (jM644a / 100000)) & 255) | ((((int) (j7 / 100000)) & 255) << 8) | ((((int) (j8 / 100000)) & 255) << 16) | (-16777216)) & 16777215) | (((int) (j21 / 100000)) << 24);
            } else {
                iArr[i2] = (int) (jArr[i2][3] / 100000);
            }
            i = i2 + 1;
        }
    }

    /* renamed from: a */
    private static long[][] m649a(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return null;
        }
        try {
            long[][] jArr = (long[][]) Array.newInstance((Class<?>) Long.TYPE, bArr.length / 3, 4);
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
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: a */
    public final C0010aj m650a(int i) {
        if (i < 0 || i >= this.f601d.length) {
            return null;
        }
        return this.f601d[i];
    }

     // p000.AbstractC0060cf
    /* renamed from: a */
    public final void mo606a() {
    }

    /* renamed from: a */
    public final void m651a(byte[][] bArr, boolean z) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        if (this.f602e == 0 && this.f603f == 0 && this.f604g == 0) {
            byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(C0009ai.f69b);
            int i = 1;
            while (i < bArr.length) {
                if (bArr[i] != null && bArr[i].length > 4) {
                    byteArrayOutputStream.write(m647a(C0009ai.f68a[i > 4 ? 4 : i], bArr[i]));
                }
                i++;
            }
            byteArrayOutputStream.write(C0009ai.f70c);
            this.f598a = Image.createImage(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
            return;
        }
        byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(C0009ai.f69b);
        int i2 = 1;
        while (i2 < bArr.length) {
            if (bArr[i2] != null && bArr[i2].length > 4) {
                if (C0009ai.f68a[i2 > 4 ? 4 : i2].equals("PLTE")) {
                    byte[] bArr2 = new byte[r1.length - 4];
                    System.arraycopy(bArr[i2], 0, bArr2, 0, bArr2.length);
                    int[] iArrM648a = m648a(m649a(bArr2, (byte[]) null), this.f602e * 100000, this.f603f * 100000, this.f604g * 100000, 0L, false);
                    byte[] bArr3 = new byte[bArr2.length];
                    m645a(bArr3, (byte[]) null, iArrM648a);
                    System.arraycopy(bArr3, 0, bArr[i2], 0, bArr3.length);
                    m646a(true, bArr3);
                    byte[] bArr4 = bArr[i2];
                    int length = bArr3.length;
                    int i3 = this.f605i;
                    bArr4[length] = i3 >> 24;
                    bArr4[length + 1] = (byte) (i3 >>> 16);
                    bArr4[length + 2] = (byte) (i3 >>> 8);
                    bArr4[length + 3] = (byte) i3;
                }
                byteArrayOutputStream.write(m647a(C0009ai.f68a[i2 > 4 ? 4 : i2], bArr[i2]));
            }
            i2++;
        }
        byteArrayOutputStream.write(C0009ai.f70c);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            this.f598a = Image.createImage(byteArray, 0, byteArray.length);
        } catch (Exception e) {
        } finally {
            byteArrayOutputStream.close();
        }
    }
}

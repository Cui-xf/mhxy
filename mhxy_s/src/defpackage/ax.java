package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-8105993946875401281/classes.dex */
public final class ax {
    private static int a;
    private static int[] b = new int[0];
    private static boolean[] c = new boolean[0];
    private static Image[] d = new Image[0];
    private static byte[] e = {-119, 80, 78, 71, 13, 10, 26, 10, 0, 0, 0, 13, 73, 72, 68, 82, 0, 0, 0, 32, 0, 0, 0, 32, 1, 3, 0, 0, 0, 73, -76, -24, -73, 0, 0, 0, 3, 80, 76, 84, 69, -67, 46, 36, 93, -8, -67, 100, 0, 0, 0, 1, 116, 82, 78, 83, -103, -55, 53, -13, -122, 0, 0, 0, 12, 73, 68, 65, 84, 120, -100, 99, 96, 24, -36, 0, 0, 0, -96, 0, 1, -80, 6, 98, 24, 0, 0, 0, 0, 73, 69, 78, 68, -82, 66, 96, -126};
    private static int[] f;

    private static int a(byte[] bArr, int i, int i2) {
        int i3 = -1;
        if (f == null) {
            f = new int[256];
            for (int i4 = 0; i4 < 256; i4++) {
                int i5 = i4;
                for (int i6 = 0; i6 < 8; i6++) {
                    i5 = (i5 & 1) == 1 ? (i5 >>> 1) ^ (-306674912) : i5 >>> 1;
                }
                f[i4] = i5;
            }
        }
        for (int i7 = i; i7 < i2 + i; i7++) {
            i3 = (i3 >>> 8) ^ f[(bArr[i7] ^ i3) & 255];
        }
        return i3 ^ (-1);
    }

    private static Image a(int i, byte b2) {
        int i2 = (b2 << 24) | i;
        int[] iArr = b;
        int i3 = 0;
        while (true) {
            if (i3 >= iArr.length) {
                i3 = -1;
                break;
            }
            if (iArr[i3] == i2) {
                break;
            }
            i3++;
        }
        if (i3 < 0) {
            e[41] = (byte) (i >>> 16);
            e[42] = (byte) (i >>> 8);
            e[43] = (byte) i;
            int iA = a(e, 37, 7);
            e[44] = iA >> 24;
            e[45] = (byte) (iA >>> 16);
            e[46] = (byte) (iA >>> 8);
            e[47] = (byte) iA;
            e[56] = b2;
            int iA2 = a(e, 52, 5);
            e[57] = iA2 >> 24;
            e[58] = (byte) (iA2 >>> 16);
            e[59] = (byte) (iA2 >>> 8);
            e[60] = (byte) iA2;
            if (a >= b.length) {
                Image[] imageArr = d;
                int[] iArr2 = b;
                boolean[] zArr = c;
                int length = imageArr.length + 1;
                d = new Image[length];
                b = new int[length];
                c = new boolean[length];
                System.arraycopy(imageArr, 0, d, 0, imageArr.length);
                System.arraycopy(iArr2, 0, b, 0, iArr2.length);
                System.arraycopy(zArr, 0, c, 0, zArr.length);
            }
            try {
                i3 = a;
                d[i3] = Image.createImage(new ByteArrayInputStream(e));
                b[i3] = i2;
                a++;
            } catch (IOException e2) {
                e2.printStackTrace();
                return null;
            }
        }
        c[i3] = true;
        return d[i3];
    }

    public static void a(Graphics graphics, int i, int i2, int i3, int i4, int i5, int i6) {
        int[] iArr = {graphics.getClipX(), graphics.getClipY(), graphics.getClipWidth(), graphics.getClipHeight()};
        graphics.clipRect(i3, i4, i5, i6);
        int clipX = graphics.getClipX();
        int clipY = graphics.getClipY();
        int clipWidth = graphics.getClipWidth();
        int clipHeight = graphics.getClipHeight();
        try {
            Image imageA = a(i, (byte) i2);
            int width = imageA.getWidth();
            int height = imageA.getHeight();
            int i7 = (clipWidth / width) + (clipWidth % width == 0 ? 0 : 1);
            int i8 = (clipHeight / height) + (clipHeight % height == 0 ? 0 : 1);
            for (int i9 = 0; i9 < i8; i9++) {
                for (int i10 = 0; i10 < i7; i10++) {
                    graphics.drawImage(imageA, (i10 * width) + clipX, (i9 * height) + clipY, 0);
                }
            }
            a(graphics, iArr);
        } catch (Throwable th) {
            a(graphics, iArr);
            throw th;
        }
    }

    private static void a(Graphics graphics, int[] iArr) {
        graphics.setClip(iArr[0], iArr[1], iArr[2], iArr[3]);
    }
}

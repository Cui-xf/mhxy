package p000;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* renamed from: ax */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-4234804660425969496/classes.dex */
public final class C0024ax {

    /* renamed from: a */
    private static int f470a;

    /* renamed from: b */
    private static int[] f471b = new int[0];

    /* renamed from: c */
    private static boolean[] f472c = new boolean[0];

    /* renamed from: d */
    private static Image[] f473d = new Image[0];

    /* renamed from: e */
    private static byte[] f474e = {-119, 80, 78, 71, 13, 10, 26, 10, 0, 0, 0, 13, 73, 72, 68, 82, 0, 0, 0, 32, 0, 0, 0, 32, 1, 3, 0, 0, 0, 73, -76, -24, -73, 0, 0, 0, 3, 80, 76, 84, 69, -67, 46, 36, 93, -8, -67, 100, 0, 0, 0, 1, 116, 82, 78, 83, -103, -55, 53, -13, -122, 0, 0, 0, 12, 73, 68, 65, 84, 120, -100, 99, 96, 24, -36, 0, 0, 0, -96, 0, 1, -80, 6, 98, 24, 0, 0, 0, 0, 73, 69, 78, 68, -82, 66, 96, -126};

    /* renamed from: f */
    private static int[] f475f;

    /* renamed from: a */
    private static int m607a(byte[] bArr, int i, int i2) {
        int i3 = -1;
        if (f475f == null) {
            f475f = new int[256];
            for (int i4 = 0; i4 < 256; i4++) {
                int i5 = i4;
                for (int i6 = 0; i6 < 8; i6++) {
                    i5 = (i5 & 1) == 1 ? (i5 >>> 1) ^ (-306674912) : i5 >>> 1;
                }
                f475f[i4] = i5;
            }
        }
        for (int i7 = i; i7 < i2 + i; i7++) {
            i3 = (i3 >>> 8) ^ f475f[(bArr[i7] ^ i3) & 255];
        }
        return i3 ^ (-1);
    }

    /* renamed from: a */
    private static Image m608a(int i, byte b) {
        int i2 = (b << 24) | i;
        int[] iArr = f471b;
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
            f474e[41] = (byte) (i >>> 16);
            f474e[42] = (byte) (i >>> 8);
            f474e[43] = (byte) i;
            int iM607a = m607a(f474e, 37, 7);
            f474e[44] = iM607a >> 24;
            f474e[45] = (byte) (iM607a >>> 16);
            f474e[46] = (byte) (iM607a >>> 8);
            f474e[47] = (byte) iM607a;
            f474e[56] = b;
            int iM607a2 = m607a(f474e, 52, 5);
            f474e[57] = iM607a2 >> 24;
            f474e[58] = (byte) (iM607a2 >>> 16);
            f474e[59] = (byte) (iM607a2 >>> 8);
            f474e[60] = (byte) iM607a2;
            if (f470a >= f471b.length) {
                Image[] imageArr = f473d;
                int[] iArr2 = f471b;
                boolean[] zArr = f472c;
                int length = imageArr.length + 1;
                f473d = new Image[length];
                f471b = new int[length];
                f472c = new boolean[length];
                System.arraycopy(imageArr, 0, f473d, 0, imageArr.length);
                System.arraycopy(iArr2, 0, f471b, 0, iArr2.length);
                System.arraycopy(zArr, 0, f472c, 0, zArr.length);
            }
            try {
                i3 = f470a;
                f473d[i3] = Image.createImage(new ByteArrayInputStream(f474e));
                f471b[i3] = i2;
                f470a++;
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }
        f472c[i3] = true;
        return f473d[i3];
    }

    /* renamed from: a */
    public static void m609a(Graphics graphics, int i, int i2, int i3, int i4, int i5, int i6) {
        int[] iArr = {graphics.getClipX(), graphics.getClipY(), graphics.getClipWidth(), graphics.getClipHeight()};
        graphics.clipRect(i3, i4, i5, i6);
        int clipX = graphics.getClipX();
        int clipY = graphics.getClipY();
        int clipWidth = graphics.getClipWidth();
        int clipHeight = graphics.getClipHeight();
        try {
            Image imageM608a = m608a(i, (byte) i2);
            int width = imageM608a.getWidth();
            int height = imageM608a.getHeight();
            int i7 = (clipWidth / width) + (clipWidth % width == 0 ? 0 : 1);
            int i8 = (clipHeight / height) + (clipHeight % height == 0 ? 0 : 1);
            for (int i9 = 0; i9 < i8; i9++) {
                for (int i10 = 0; i10 < i7; i10++) {
                    graphics.drawImage(imageM608a, (i10 * width) + clipX, (i9 * height) + clipY, 0);
                }
            }
        } finally {
            m610a(graphics, iArr);
        }
    }

    /* renamed from: a */
    private static void m610a(Graphics graphics, int[] iArr) {
        graphics.setClip(iArr[0], iArr[1], iArr[2], iArr[3]);
    }
}

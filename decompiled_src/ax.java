/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ax {
    private static int a;
    private static int[] b;
    private static boolean[] c;
    private static Image[] d;
    private static byte[] e;
    private static int[] f;

    private static Image a(int n2, byte by2) {
        int n3;
        int n4;
        int n5;
        block5: {
            int n6 = n5 = by2 << 24 | n2;
            int[] nArray = b;
            for (int i2 = 0; i2 < nArray.length; ++i2) {
                if (nArray[i2] != n6) continue;
                n4 = i2;
                break block5;
            }
            n4 = n3 = -1;
        }
        if (n4 < 0) {
            ax.e[41] = (byte)(n2 >>> 16);
            ax.e[42] = (byte)(n2 >>> 8);
            ax.e[43] = (byte)n2;
            n2 = ax.a(e, 37, 7);
            ax.e[44] = n2 >> 24;
            ax.e[45] = (byte)(n2 >>> 16);
            ax.e[46] = (byte)(n2 >>> 8);
            ax.e[47] = (byte)n2;
            ax.e[56] = by2;
            n2 = ax.a(e, 52, 5);
            ax.e[57] = n2 >> 24;
            ax.e[58] = (byte)(n2 >>> 16);
            ax.e[59] = (byte)(n2 >>> 8);
            ax.e[60] = (byte)n2;
            if (a >= b.length) {
                Image[] imageArray = d;
                int[] nArray = b;
                boolean[] blArray = c;
                n2 = imageArray.length + 1;
                d = new Image[n2];
                b = new int[n2];
                c = new boolean[n2];
                System.arraycopy(imageArray, 0, d, 0, imageArray.length);
                System.arraycopy(nArray, 0, b, 0, nArray.length);
                System.arraycopy(blArray, 0, c, 0, blArray.length);
            }
            try {
                n3 = a++;
                ax.d[n3] = Image.createImage((InputStream)new ByteArrayInputStream(e));
                ax.b[n3] = n5;
            }
            catch (IOException iOException) {
                IOException iOException2 = iOException;
                iOException.printStackTrace();
                return null;
            }
        }
        ax.c[n3] = true;
        return d[n3];
    }

    public static void a(Graphics graphics, int n2, int n3, int n4, int n5, int n6, int n7) {
        int n8 = n7;
        n7 = n6;
        n6 = n5;
        n5 = n4;
        Object object = graphics;
        int[] nArray = new int[]{object.getClipX(), object.getClipY(), object.getClipWidth(), object.getClipHeight()};
        object.clipRect(n5, n6, n7, n8);
        object = nArray;
        n5 = graphics.getClipX();
        n6 = graphics.getClipY();
        n7 = graphics.getClipWidth();
        n8 = graphics.getClipHeight();
        try {
            Image image = ax.a(n2, (byte)n3);
            n3 = image.getWidth();
            int n9 = image.getHeight();
            n7 = n7 / n3 + (n7 % n3 == 0 ? 0 : 1);
            n8 = n8 / n9 + (n8 % n9 == 0 ? 0 : 1);
            for (int i2 = 0; i2 < n8; ++i2) {
                for (int i3 = 0; i3 < n7; ++i3) {
                    graphics.drawImage(image, n5 + i3 * n3, n6 + i2 * n9, 0);
                }
            }
            return;
        }
        finally {
            ax.a(graphics, (int[])object);
        }
    }

    private static void a(Graphics graphics, int[] nArray) {
        graphics.setClip(nArray[0], nArray[1], nArray[2], nArray[3]);
    }

    private static int a(byte[] byArray, int n2, int n3) {
        int n4;
        int n5 = n3;
        n3 = n2;
        byte[] byArray2 = byArray;
        int n6 = 0;
        n6 = -1;
        if (f == null) {
            f = new int[256];
            for (int i2 = 0; i2 < 256; ++i2) {
                n4 = i2;
                for (int i3 = 0; i3 < 8; ++i3) {
                    if ((n4 & 1) == 1) {
                        n4 = 0xEDB88320 ^ n4 >>> 1;
                        continue;
                    }
                    n4 >>>= 1;
                }
                ax.f[i2] = n4;
            }
        }
        for (n4 = n3; n4 < n5 + n3; ++n4) {
            n6 = f[(n6 ^ byArray2[n4]) & 0xFF] ^ n6 >>> 8;
        }
        return ~n6;
    }

    static {
        b = new int[0];
        c = new boolean[0];
        d = new Image[0];
        e = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10, 0, 0, 0, 13, 73, 72, 68, 82, 0, 0, 0, 32, 0, 0, 0, 32, 1, 3, 0, 0, 0, 73, -76, -24, -73, 0, 0, 0, 3, 80, 76, 84, 69, -67, 46, 36, 93, -8, -67, 100, 0, 0, 0, 1, 116, 82, 78, 83, -103, -55, 53, -13, -122, 0, 0, 0, 12, 73, 68, 65, 84, 120, -100, 99, 96, 24, -36, 0, 0, 0, -96, 0, 1, -80, 6, 98, 24, 0, 0, 0, 0, 73, 69, 78, 68, -82, 66, 96, -126};
    }
}


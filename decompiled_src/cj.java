/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import com.yinhan.kjava.main.a;
import javax.microedition.lcdui.Graphics;

public final class cj {
    public bc a;
    public int[] b;
    public int[] c;

    public cj(int n2, int n3) {
        this.b = new int[n3];
        this.c = new int[n3];
        this.a = com.yinhan.kjava.main.a.ad.b(String.valueOf(n2));
        if (this.a == null || this.a.k == null || this.a.k[0] == null || this.a.k[0][0] == null || this.a.k[0][0].a == null) {
            this.a = com.yinhan.kjava.main.a.ad.b(String.valueOf(10));
        }
    }

    public final void a(int n2, int n3, int n4) {
        this.b[n2] = n3;
        this.c[n2] = n4;
    }

    public final void a(Graphics graphics, ai ai2, int n2, int n3) {
        if (this.a != null) {
            for (n2 = 0; n2 < this.b.length; n2 = (int)((byte)(n2 + 1))) {
                if (this.b[n2] == 0 || this.c[n2] == 0) continue;
                ai2.a(graphics, this.a, null, 0, 0, this.b[n2], this.c[n2], 20, 0);
            }
        }
    }
}


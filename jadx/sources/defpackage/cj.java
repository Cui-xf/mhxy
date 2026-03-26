package defpackage;

import com.yinhan.kjava.main.a;
import javax.microedition.lcdui.Graphics;

/* loaded from: java版梦回西游3区251011.jar:cj.class */
public final class cj {
    public bc a;
    public int[] b;
    public int[] c;

    public cj(int i, int i2) {
        this.b = new int[i2];
        this.c = new int[i2];
        this.a = a.ad.b(String.valueOf(i));
        if (this.a == null || this.a.k == null || this.a.k[0] == null || this.a.k[0][0] == null || this.a.k[0][0].a == null) {
            this.a = a.ad.b(String.valueOf(10));
        }
    }

    public final void a(int i, int i2, int i3) {
        this.b[i] = i2;
        this.c[i] = i3;
    }

    public final void a(Graphics graphics, ai aiVar, int i, int i2) {
        if (this.a == null) {
            return;
        }
        byte b = 0;
        while (true) {
            byte b2 = b;
            if (b2 >= this.b.length) {
                return;
            }
            if (this.b[b2] != 0 && this.c[b2] != 0) {
                aiVar.a(graphics, this.a, (int[]) null, 0, 0, this.b[b2], this.c[b2], 20, 0);
            }
            b = (byte) (b2 + 1);
        }
    }
}

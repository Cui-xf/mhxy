package defpackage;

import com.yinhan.kjava.main.a;
import javax.microedition.lcdui.Graphics;

/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-8105993946875401281/classes.dex */
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
        if (this.a != null) {
            for (byte b = 0; b < this.b.length; b = (byte) (b + 1)) {
                if (this.b[b] != 0 && this.c[b] != 0) {
                    aiVar.a(graphics, this.a, (int[]) null, 0, 0, this.b[b], this.c[b], 20, 0);
                }
            }
        }
    }
}

package p000;

import com.yinhan.kjava.main.RunnableC0066a;
import javax.microedition.lcdui.Graphics;

/* renamed from: cj */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-5080095226433994817/classes.dex */
public final class C0064cj {

    /* renamed from: a */
    public C0030bc f2032a;

    /* renamed from: b */
    public int[] f2033b;

    /* renamed from: c */
    public int[] f2034c;

    public C0064cj(int i, int i2) {
        this.f2033b = new int[i2];
        this.f2034c = new int[i2];
        this.f2032a = RunnableC0066a.f2098ad.m991b(String.valueOf(i));
        if (this.f2032a == null || this.f2032a.f571k == null || this.f2032a.f571k[0] == null || this.f2032a.f571k[0][0] == null || this.f2032a.f571k[0][0].f1793a == null) {
            this.f2032a = RunnableC0066a.f2098ad.m991b(String.valueOf(10));
        }
    }

    /* renamed from: a */
    public final void m1367a(int i, int i2, int i3) {
        this.f2033b[i] = i2;
        this.f2034c[i] = i3;
    }

    /* renamed from: a */
    public final void m1368a(Graphics graphics, C0009ai c0009ai, int i, int i2) {
        if (this.f2032a != null) {
            for (byte b = 0; b < this.f2033b.length; b = (byte) (b + 1)) {
                if (this.f2033b[b] != 0 && this.f2034c[b] != 0) {
                    c0009ai.m62a(graphics, this.f2032a, (int[]) null, 0, 0, this.f2033b[b], this.f2034c[b], 20, 0);
                }
            }
        }
    }
}

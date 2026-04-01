package p000;

import com.yinhan.kjava.main.RunnableC0066a;
import javax.microedition.lcdui.Graphics;

/* renamed from: u */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-5080095226433994817/classes.dex */
public final class C0089u extends AbstractC0038bk {

    /* renamed from: a */
    private int f2541a = 16777215;

    /* renamed from: b */
    private int f2542b = 16777215;

    /* renamed from: c */
    private int f2543c = 16777215;

    /* renamed from: d */
    private String f2544d;

    /* renamed from: e */
    private String f2545e;

    /* renamed from: j */
    private String f2546j;

    @Override // p000.AbstractC0038bk
    /* renamed from: a */
    public final int mo30a(int i, int i2) {
        if (m690b(i, i2)) {
            if (this.f2544d != null && i > this.f676f && i < this.f676f + C0088t.f2523i.stringWidth(this.f2544d) + 5 && i2 > this.f677g && i2 < this.f677g + this.f679i) {
                return 268435456;
            }
            if (this.f2545e != null) {
                int iStringWidth = C0088t.f2523i.stringWidth(this.f2545e) + 10;
                if (i > this.f676f + ((this.f678h - iStringWidth) / 2)) {
                    if (i < ((iStringWidth + this.f678h) / 2) + this.f676f && i2 > this.f676f && i2 < this.f677g + this.f679i) {
                        return 1073741824;
                    }
                }
            }
            if (this.f2546j != null && i > ((this.f676f + this.f678h) - C0088t.f2523i.stringWidth(this.f2546j)) - 5 && i < this.f676f + this.f678h && i2 > this.f677g && i2 < this.f677g + this.f679i) {
                return 536870912;
            }
        }
        return 0;
    }

    @Override // p000.AbstractC0038bk
    /* renamed from: a */
    public final void mo31a() {
    }

    @Override // p000.AbstractC0038bk
    /* renamed from: a */
    public final void mo32a(int i) {
    }

    /* renamed from: a */
    public final void m1682a(String str) {
        this.f2544d = str;
    }

    @Override // p000.AbstractC0038bk
    /* renamed from: a */
    public final void mo33a(Graphics graphics) {
        graphics.setClip(this.f676f, this.f677g, this.f678h, this.f679i);
        C0055ca.m1306a(graphics, RunnableC0066a.f2066E.f598a, RunnableC0066a.f2066E.f599b, this.f676f, this.f677g, this.f678h, RunnableC0066a.f2066E.f600c);
        if (this.f2544d != null) {
            graphics.setColor(this.f2541a);
            graphics.drawString(this.f2544d, this.f676f + 3, this.f677g + ((this.f679i - C0088t.f2524j) / 2), 20);
        }
        if (this.f2545e != null) {
            graphics.setColor(this.f2542b);
            graphics.drawString(this.f2545e, this.f676f + (this.f678h / 2), this.f677g + ((this.f679i - C0088t.f2524j) / 2), 17);
        }
        if (this.f2546j != null) {
            graphics.setColor(this.f2543c);
            graphics.drawString(this.f2546j, (this.f676f + this.f678h) - 3, this.f677g + ((this.f679i - C0088t.f2524j) / 2), 24);
        }
    }

    @Override // p000.AbstractC0038bk
    /* renamed from: b */
    public final void mo34b() {
        this.f2544d = null;
        this.f2545e = null;
        this.f2546j = null;
    }

    /* renamed from: b */
    public final void m1683b(String str) {
        this.f2545e = str;
    }

    /* renamed from: c */
    public final void m1684c(String str) {
        this.f2546j = str;
    }
}

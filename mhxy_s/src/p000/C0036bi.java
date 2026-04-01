package p000;

import com.yinhan.kjava.main.RunnableC0066a;
import javax.microedition.lcdui.Graphics;

/* renamed from: bi */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-5080095226433994817/classes.dex */
public final class C0036bi extends AbstractC0038bk {

    /* renamed from: a */
    private int f666a;

    /* renamed from: b */
    private int f667b;

    /* renamed from: c */
    private int f668c;

    /* renamed from: d */
    private int f669d;

    /* renamed from: e */
    private boolean f670e;

    /* renamed from: j */
    private boolean f671j;

    /* renamed from: k */
    private boolean f672k;

    /* renamed from: l */
    private int f673l;

    /* renamed from: m */
    private String f674m;

    /* renamed from: n */
    private C0072d[] f675n;

    public C0036bi() {
    }

    public C0036bi(String str) {
        this.f674m = str;
        this.f671j = true;
        this.f672k = false;
    }

    @Override // p000.AbstractC0038bk
    /* renamed from: a */
    public final int mo30a(int i, int i2) {
        if (this.f667b > 0 && i >= (this.f676f + this.f678h) - 15 && i < this.f676f + this.f678h) {
            if (i2 >= this.f677g && i2 <= this.f677g + 20) {
                return 1;
            }
            if (i2 > (this.f677g + this.f679i) - 20 && i2 <= this.f677g + this.f679i) {
                return 4;
            }
        }
        return 0;
    }

    @Override // p000.AbstractC0038bk
    /* renamed from: a */
    public final void mo31a() {
        this.f667b = 0;
        this.f666a = 0;
        if (this.f674m != null) {
            this.f675n = C0072d.m1551a(this.f674m, this.f678h - 6, C0088t.f2523i, '\t');
        }
        this.f669d = this.f675n == null ? 0 : this.f675n.length;
        this.f673l = C0088t.f2524j;
        for (int i = 0; i < this.f669d; i++) {
            if (this.f675n[i].m1552a() > this.f673l) {
                this.f673l = this.f675n[i].m1552a();
            }
        }
        this.f668c = (this.f679i - 6) / this.f673l;
        if (this.f669d > this.f668c) {
            this.f675n = C0072d.m1551a(this.f674m, (this.f678h - 6) - 12, C0088t.f2523i, '\t');
            this.f669d = this.f675n.length;
            this.f667b = Math.max(6, (this.f668c * ((this.f679i - 6) - 10)) / this.f669d);
        }
    }

    @Override // p000.AbstractC0038bk
    /* renamed from: a */
    public final void mo32a(int i) {
        int i2 = this.f671j ? this.f673l : this.f668c * this.f673l;
        if (i == 1 || i == 514) {
            int i3 = (this.f666a - i2) % this.f673l;
            this.f666a = (i3 <= 0 ? 0 : this.f673l - i3) + (this.f666a - i2);
            this.f666a = Math.max(this.f666a, 0);
            return;
        }
        if (i == 4 || i == 520) {
            this.f666a = (i2 - (this.f666a % this.f673l)) + this.f666a;
            this.f666a = Math.min(this.f666a, Math.max(0, ((this.f673l * this.f669d) - this.f679i) + 6));
        }
    }

    @Override // p000.AbstractC0038bk
    /* renamed from: a */
    public final void mo33a(Graphics graphics) {
        graphics.setClip(this.f676f, this.f677g, this.f678h, this.f679i);
        C0055ca.m1292a(graphics, this.f676f, this.f677g, this.f678h, this.f679i, 1);
        if (this.f670e) {
            C0055ca.m1288a(graphics);
        }
        graphics.setClip(this.f676f, this.f677g + 4, this.f678h, this.f679i - 6);
        int i = this.f666a / this.f673l;
        int iMin = Math.min(this.f668c + i + 2, this.f669d);
        int i2 = (this.f677g + 4) - (this.f666a - (this.f673l * i));
        while (i < iMin) {
            this.f675n[i].m1553a(graphics, this.f676f + 4, i2, 20);
            i2 += this.f673l;
            i++;
        }
        if (this.f667b > 0) {
            graphics.setClip(this.f676f, this.f677g, this.f678h, this.f679i);
            C0055ca.m1294a(graphics, ((this.f676f + this.f678h) - 2) - RunnableC0066a.f2064C.f599b, this.f677g + 4, this.f679i - 6, this.f667b, this.f666a, this.f669d * this.f673l, this.f679i - 6);
        }
    }

    /* renamed from: a */
    public final void m680a(boolean z) {
        this.f670e = z;
    }

    @Override // p000.AbstractC0038bk
    /* renamed from: b */
    public final void mo34b() {
        this.f674m = null;
        this.f675n = null;
    }
}

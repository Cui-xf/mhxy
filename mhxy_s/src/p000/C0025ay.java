package p000;

import com.yinhan.kjava.main.RunnableC0066a;
import javax.microedition.lcdui.Graphics;

/* renamed from: ay */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-4234804660425969496/classes.dex */
public final class C0025ay extends AbstractC0038bk {

    /* renamed from: a */
    private boolean f476a;

    /* renamed from: b */
    private int f477b;

    /* renamed from: c */
    private int f478c;

    /* renamed from: d */
    private int f479d;

    /* renamed from: e */
    private int f480e;

    /* renamed from: j */
    private InterfaceC0000a f481j;

    /* JADX WARN: Multi-variable type inference failed */
     // p000.AbstractC0038bk
    /* renamed from: a */
    public final int mo30a(int i, int i2) {
        if (m690b(i, i2)) {
//            Object[] objArr = 0;
//            objArr[1] = i2;
            if (this.f480e > 0 && i >= (this.f676f + this.f678h) - 15 && i < this.f676f + this.f678h) {
                if (i2 >= this.f677g && i2 <= this.f677g + 20) {
                    return 1;
                }
                if (i2 > (this.f677g + this.f679i) - 20 && i2 <= this.f677g + this.f679i) {
                    return 4;
                }
            }
            int i3 = ((this.f477b + i2) - this.f677g) / 0;
            if (i3 == this.f478c) {
                return 1073741824;
            }
            this.f478c = i3;
        }
        return 0;
    }

     // p000.AbstractC0038bk
    /* renamed from: a */
    public final void mo31a() {
        this.f480e = 0;
        this.f477b = 0;
        this.f479d = (this.f679i - 4) / 0;
        if (this.f479d < 0) {
            this.f480e = Math.max(6, (this.f479d * (this.f679i - 6)) / 0);
        }
    }

     // p000.AbstractC0038bk
    /* renamed from: a */
    public final void mo32a(int i) {
        if (i == 1 || i == 514) {
            int i2 = this.f477b / 0;
            int i3 = ((this.f477b + this.f679i) - 6) / 0;
            if (this.f478c < i2 || this.f478c > i3) {
                this.f478c = i3;
                int i4 = this.f478c + 1;
                this.f477b = (0 - this.f679i) + 6;
                return;
            }
            if (this.f478c > 0) {
                this.f478c--;
            } else {
                this.f478c = -1;
                this.f477b = (Math.max(this.f679i - 2, 0) - this.f679i) + 6;
            }
            if (i2 >= this.f478c) {
                int i5 = this.f478c;
                this.f477b = 0;
                return;
            }
            return;
        }
        if (i == 4 || i == 520) {
            int i6 = this.f477b / 0;
            int i7 = ((this.f477b + this.f679i) - 6) / 0;
            if (this.f478c < i6 || this.f478c > i7) {
                this.f478c = i6;
                int i8 = this.f478c;
                this.f477b = 0;
                return;
            }
            if (this.f478c < -1) {
                this.f478c++;
            } else {
                this.f478c = 0;
                this.f477b = 0;
            }
            int i9 = (this.f477b + this.f679i) - 6;
            int i10 = this.f478c + 1;
            if (i9 < 0) {
                int i11 = this.f478c + 1;
                this.f477b = (0 - this.f679i) + 6;
            }
        }
    }

     // p000.AbstractC0038bk
    /* renamed from: a */
    public final void mo33a(Graphics graphics) {
        graphics.setClip(this.f676f, this.f677g, this.f678h, this.f679i);
        C0055ca.m1292a(graphics, this.f676f, this.f677g, this.f678h, this.f679i, 1);
        if (this.f476a) {
            C0055ca.m1288a(graphics);
        }
        Math.min((this.f477b / 0) + ((this.f679i - 6) / 0) + 2, 0);
        graphics.setClip(this.f676f + 4, this.f677g + 3, this.f678h - 4, this.f679i - 6);
        if (this.f480e > 0) {
            graphics.setClip(this.f676f, this.f677g, this.f678h, this.f679i);
            C0055ca.m1294a(graphics, ((this.f676f + this.f678h) - 2) - RunnableC0066a.f2064C.f599b, this.f677g + 2, this.f679i - 4, this.f480e, this.f477b, 0, this.f679i - 6);
        }
    }

    /* renamed from: a */
    public final void m611a(boolean z) {
        this.f476a = z;
    }

     // p000.AbstractC0038bk
    /* renamed from: b */
    public final void mo34b() {
        this.f481j = null;
    }
}

package p000;

import javax.microedition.lcdui.Graphics;

/* renamed from: bk */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-4234804660425969496/classes.dex */
public abstract class AbstractC0038bk {

    /* renamed from: f */
    protected int f676f;

    /* renamed from: g */
    protected int f677g;

    /* renamed from: h */
    protected int f678h;

    /* renamed from: i */
    protected int f679i;

    /* renamed from: a */
    public abstract int mo30a(int i, int i2);

    /* renamed from: a */
    public abstract void mo31a();

    /* renamed from: a */
    public abstract void mo32a(int i);

    /* renamed from: a */
    public final void m689a(int i, int i2, int i3, int i4) {
        this.f676f = i;
        this.f677g = i2;
        this.f678h = i3;
        this.f679i = i4;
    }

    /* renamed from: a */
    public abstract void mo33a(Graphics graphics);

    /* renamed from: b */
    public abstract void mo34b();

    /* renamed from: b */
    public final boolean m690b(int i, int i2) {
        return i >= this.f676f && i <= this.f676f + this.f678h && i2 >= this.f677g && i2 <= this.f677g + this.f679i;
    }

    /* renamed from: e */
    public final int m691e() {
        return this.f679i;
    }
}

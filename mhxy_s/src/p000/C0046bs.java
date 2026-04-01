package p000;

/* renamed from: bs */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-5080095226433994817/classes.dex */
public final class C0046bs {

    /* renamed from: a */
    public int f806a;

    /* renamed from: b */
    public int f807b;

    /* renamed from: c */
    public C0046bs f808c;

    public C0046bs() {
        this.f807b = 0;
        this.f806a = 0;
    }

    public C0046bs(int i, int i2) {
        this.f806a = i;
        this.f807b = i2;
    }

    public C0046bs(int i, int i2, C0046bs c0046bs) {
        this.f806a = i;
        this.f807b = i2;
        this.f808c = c0046bs;
    }

    /* renamed from: a */
    public final int m756a(C0046bs c0046bs) {
        return ((this.f806a - c0046bs.f806a) * (this.f806a - c0046bs.f806a)) + ((this.f807b - c0046bs.f807b) * (this.f807b - c0046bs.f807b));
    }

    /* renamed from: b */
    public final boolean m757b(C0046bs c0046bs) {
        return this.f806a == c0046bs.f806a && this.f807b == c0046bs.f807b;
    }
}

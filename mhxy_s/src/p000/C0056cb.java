package p000;

/* renamed from: cb */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-4234804660425969496/classes.dex */
public final class C0056cb extends C0052by {

    /* renamed from: d */
    public int[] f1907d;

    /* renamed from: e */
    private int f1908e;

    public C0056cb(byte b, C0051bx c0051bx, short s, short s2, int[] iArr) {
        super((byte) 6, c0051bx, true);
        this.f1907d = iArr;
        this.f1908e = c0051bx.f1798f + iArr[3] + iArr[1];
    }

     // p000.C0052by
    /* renamed from: a */
    public final short mo1021a() {
        switch (this.f1802b) {
            case 6:
                return (short) this.f1908e;
            default:
                return (short) 0;
        }
    }
}

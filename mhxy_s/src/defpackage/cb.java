package defpackage;

/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-8105993946875401281/classes.dex */
public final class cb extends by {
    public int[] d;
    private int e;

    public cb(byte b, bx bxVar, short s, short s2, int[] iArr) {
        super((byte) 6, bxVar, true);
        this.d = iArr;
        this.e = bxVar.f + iArr[3] + iArr[1];
    }

    @Override // defpackage.by
    public final short a() {
        switch (this.b) {
            case 6:
                return (short) this.e;
            default:
                return (short) 0;
        }
    }
}

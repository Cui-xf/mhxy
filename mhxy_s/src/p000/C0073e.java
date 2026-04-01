package p000;

/* renamed from: e */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-4234804660425969496/classes.dex */
final class C0073e {

    /* renamed from: a */
    public String[] f2244a;

    /* renamed from: b */
    public int[] f2245b;

    public C0073e(C0050bw c0050bw, String[] strArr, String[] strArr2) {
        this.f2244a = strArr;
        this.f2245b = new int[strArr2.length];
        for (int i = 0; i < strArr2.length; i++) {
            this.f2245b[i] = C0055ca.m1278a(Integer.parseInt(strArr2[i]));
        }
    }

    /* renamed from: a */
    public final short m1554a() {
        short sStringWidth = 0;
        if (this.f2244a == null || this.f2244a.length <= 0) {
            return (short) 0;
        }
        int i = 0;
        while (true) {
            short s = sStringWidth;
            if (i >= this.f2244a.length) {
                return s;
            }
            sStringWidth = (short) (C0088t.f2523i.stringWidth(this.f2244a[i]) + s);
            i++;
        }
    }
}

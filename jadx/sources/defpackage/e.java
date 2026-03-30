package defpackage;

/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-8105993946875401281/classes.dex */
final class e {
    public String[] a;
    public int[] b;

    public e(bw bwVar, String[] strArr, String[] strArr2) {
        this.a = strArr;
        this.b = new int[strArr2.length];
        for (int i = 0; i < strArr2.length; i++) {
            this.b[i] = ca.a(Integer.parseInt(strArr2[i]));
        }
    }

    public final short a() {
        short sStringWidth = 0;
        if (this.a == null || this.a.length <= 0) {
            return (short) 0;
        }
        int i = 0;
        while (true) {
            short s = sStringWidth;
            if (i >= this.a.length) {
                return s;
            }
            sStringWidth = (short) (t.i.stringWidth(this.a[i]) + s);
            i++;
        }
    }
}

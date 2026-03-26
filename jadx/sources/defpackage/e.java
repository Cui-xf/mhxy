package defpackage;

/* loaded from: java版梦回西游3区251011.jar:e.class */
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
        if (this.a == null || this.a.length <= 0) {
            return (short) 0;
        }
        short sStringWidth = 0;
        for (int i = 0; i < this.a.length; i++) {
            sStringWidth = (short) (sStringWidth + t.i.stringWidth(this.a[i]));
        }
        return sStringWidth;
    }
}

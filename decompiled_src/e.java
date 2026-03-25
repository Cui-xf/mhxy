/*
 * Decompiled with CFR 0.152.
 */
final class e {
    public String[] a;
    public int[] b;

    public e(bw bw2, String[] stringArray, String[] stringArray2) {
        this.a = stringArray;
        this.b = new int[stringArray2.length];
        for (int i2 = 0; i2 < stringArray2.length; ++i2) {
            this.b[i2] = ca.a(Integer.parseInt(stringArray2[i2]));
        }
    }

    public final short a() {
        if (this.a == null || this.a.length <= 0) {
            return 0;
        }
        short s2 = 0;
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            s2 = (short)(s2 + t.i.stringWidth(this.a[i2]));
        }
        return s2;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
public final class cb
extends by {
    public int[] d;
    private int e;

    public cb(byte by2, bx bx2, short s2, short s3, int[] nArray) {
        super((byte)6, bx2, true);
        this.d = nArray;
        this.e = bx2.f + nArray[3] + nArray[1];
    }

    public final short a() {
        switch (this.b) {
            case 6: {
                return (short)this.e;
            }
        }
        return 0;
    }
}


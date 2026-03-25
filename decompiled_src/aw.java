/*
 * Decompiled with CFR 0.152.
 */
public final class aw
extends cf {
    public short a;
    public short b;
    public byte c;
    public byte d;
    public byte e;
    public byte f;
    public byte g;
    public byte h;
    public byte[][] i;
    public bx[][] j;
    public bx[] k;
    public bx[] l;
    public short[][] m;
    public int[][] n;

    public aw() {
        super((byte)3);
    }

    public final short a(int n2) {
        if (this.m == null) {
            return -1;
        }
        for (int i2 = 0; i2 < this.m.length; ++i2) {
            if (this.m[i2][0] != n2) continue;
            return (short)i2;
        }
        return -1;
    }

    public final void a() {
        int n2;
        this.i = null;
        if (this.j != null) {
            for (n2 = 0; n2 < this.j.length; ++n2) {
                for (int i2 = 0; i2 < this.j[n2].length; ++i2) {
                    if (this.j[n2][i2] == null) continue;
                    this.j[n2][i2] = null;
                }
            }
            this.j = null;
        }
        if (this.k != null) {
            for (n2 = 0; n2 < this.k.length; ++n2) {
                if (this.k[n2] == null) continue;
                this.k[n2] = null;
            }
            this.k = null;
        }
        if (this.l != null) {
            for (n2 = 0; n2 < this.l.length; ++n2) {
                if (this.l[n2] == null) continue;
                this.l[n2] = null;
            }
            this.l = null;
        }
    }
}


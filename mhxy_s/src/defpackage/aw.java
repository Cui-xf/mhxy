package defpackage;

/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-8105993946875401281/classes.dex */
public final class aw extends cf {
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
        super((byte) 3);
    }

    public final short a(int i) {
        if (this.m == null) {
            return (short) -1;
        }
        for (int i2 = 0; i2 < this.m.length; i2++) {
            if (this.m[i2][0] == i) {
                return (short) i2;
            }
        }
        return (short) -1;
    }

    @Override // defpackage.cf
    public final void a() {
        this.i = null;
        if (this.j != null) {
            for (int i = 0; i < this.j.length; i++) {
                for (int i2 = 0; i2 < this.j[i].length; i2++) {
                    if (this.j[i][i2] != null) {
                        this.j[i][i2] = null;
                    }
                }
            }
            this.j = null;
        }
        if (this.k != null) {
            for (int i3 = 0; i3 < this.k.length; i3++) {
                if (this.k[i3] != null) {
                    this.k[i3] = null;
                }
            }
            this.k = null;
        }
        if (this.l != null) {
            for (int i4 = 0; i4 < this.l.length; i4++) {
                if (this.l[i4] != null) {
                    this.l[i4] = null;
                }
            }
            this.l = null;
        }
    }
}

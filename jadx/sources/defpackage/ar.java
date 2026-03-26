package defpackage;

import java.util.Vector;

/* loaded from: java版梦回西游3区251011.jar:ar.class */
public abstract class ar {
    public au d;
    public String e;
    public bc g;
    short[] i;
    public Vector f = new Vector();
    public byte h = 3;
    public short j = -1;
    public short k = -1;
    public short l = -1;
    public short m = -1;

    public final short m() {
        return (short) (this.k + 16);
    }

    public final short n() {
        if (this.g == null) {
            return (short) 0;
        }
        return (short) (this.k - (this.g.h() - 16));
    }

    public final short o() {
        if (this.g == null) {
            return (short) 0;
        }
        return (short) ((this.j + 8) - (this.g.g() / 2));
    }

    public final short p() {
        if (this.g == null) {
            return (short) 0;
        }
        return this.g.g();
    }

    public final short q() {
        if (this.g == null) {
            return (short) 0;
        }
        return this.g.h();
    }

    public final void r() {
        if (this.d != null) {
            this.d.e.addElement(new short[]{this.j, this.k});
        }
    }
}

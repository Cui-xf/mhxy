/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

public abstract class ar {
    public au d;
    public String e;
    public Vector f = new Vector();
    public bc g;
    public byte h = (byte)3;
    short[] i;
    public short j = (short)-1;
    public short k = (short)-1;
    public short l = (short)-1;
    public short m = (short)-1;

    public final short m() {
        return (short)(this.k + 16);
    }

    public final short n() {
        if (this.g == null) {
            return 0;
        }
        return (short)(this.k - (this.g.h() - 16));
    }

    public final short o() {
        if (this.g == null) {
            return 0;
        }
        return (short)(this.j + 8 - this.g.g() / 2);
    }

    public final short p() {
        if (this.g == null) {
            return 0;
        }
        return this.g.g();
    }

    public final short q() {
        if (this.g == null) {
            return 0;
        }
        return this.g.h();
    }

    public final void r() {
        if (this.d != null) {
            this.d.e.addElement(new short[]{this.j, this.k});
        }
    }
}


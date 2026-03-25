/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

public final class w {
    public boolean a = false;
    private short d;
    public byte[] b;
    public Vector c;

    public w(short s2) {
        this.d = (short)8192;
        this.c = new Vector();
    }

    public w(short s2, byte[] byArray) {
        this.d = s2;
        this.b = byArray;
    }

    public final short a() {
        return this.d;
    }
}


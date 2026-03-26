package defpackage;

import java.util.Vector;

/* loaded from: java版梦回西游3区251011.jar:w.class */
public final class w {
    public boolean a;
    private short d;
    public byte[] b;
    public Vector c;

    public w(short s) {
        this.a = false;
        this.d = (short) 8192;
        this.c = new Vector();
    }

    public w(short s, byte[] bArr) {
        this.a = false;
        this.d = s;
        this.b = bArr;
    }

    public final short a() {
        return this.d;
    }
}

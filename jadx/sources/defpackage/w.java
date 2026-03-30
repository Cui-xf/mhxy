package defpackage;

import java.util.Vector;

/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-8105993946875401281/classes.dex */
public final class w {
    public boolean a;
    public byte[] b;
    public Vector c;
    private short d;

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

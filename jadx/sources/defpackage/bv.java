package defpackage;

import java.io.DataInputStream;
import java.io.IOException;
import javax.microedition.lcdui.Graphics;

/* loaded from: java版梦回西游3区251011.jar:bv.class */
public final class bv {
    public short a;
    public short b;
    public int c;
    public bc d;
    public short e;
    public short f;
    public short g;
    public int h;
    public byte i;
    public int[] j;
    public String[] k;

    public bv() {
        this.a = (short) 4;
        this.b = (short) 4;
        this.i = (byte) -1;
    }

    public bv(int i, short s, short s2, short s3, byte b) {
        this.a = (short) 4;
        this.b = (short) 4;
        this.i = (byte) -1;
        this.c = i;
        this.e = s;
        this.f = s2;
        this.g = s3;
        this.i = b;
    }

    public final void a(DataInputStream dataInputStream) throws IOException {
        this.c = dataInputStream.readInt();
        dataInputStream.readUTF();
        this.e = dataInputStream.readShort();
        this.f = dataInputStream.readShort();
        this.g = dataInputStream.readShort();
        int i = dataInputStream.readByte();
        this.j = new int[i];
        this.k = new String[i];
        this.h = bu.a(String.valueOf((int) this.g), (byte) 2);
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2] = dataInputStream.readInt();
            this.k[i2] = dataInputStream.readUTF();
        }
    }

    public final short a() {
        if (this.d == null) {
            return (short) 0;
        }
        if (this.d.g() == 0) {
            return (short) 16;
        }
        return this.d.g();
    }

    public final short b() {
        if (this.d == null) {
            return (short) 0;
        }
        if (this.d.h() == 0) {
            return (short) 24;
        }
        return this.d.h();
    }

    public final void a(byte b) {
        if (bt.bs == 0 && bt.s == 0) {
            return;
        }
        if (b == 0) {
            this.a = (short) -4;
            this.b = (short) 0;
            return;
        }
        if (b == 2) {
            this.a = (short) 4;
            this.b = (short) 0;
        } else if (b == 1) {
            this.a = (short) 0;
            this.b = (short) -4;
        } else if (b == 3) {
            this.a = (short) 0;
            this.b = (short) 4;
        } else {
            this.a = (short) 0;
            this.b = (short) 0;
        }
    }

    public final void a(Graphics graphics, ai aiVar, int i, int i2, byte b) {
        if (this.d == null || this.d.k == null) {
            return;
        }
        aiVar.a(graphics, this.d.k[this.d.f], this.d.g(), this.d.h(), null, i, i2, this.e, this.f, 20, 0);
    }
}

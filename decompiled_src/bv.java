/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import java.io.DataInputStream;
import javax.microedition.lcdui.Graphics;

public final class bv {
    public short a = (short)4;
    public short b = (short)4;
    public int c;
    public bc d;
    public short e;
    public short f;
    public short g;
    public int h;
    public byte i = (byte)-1;
    public int[] j;
    public String[] k;

    public bv() {
    }

    public bv(int n2, short s2, short s3, short s4, byte by2) {
        this.c = n2;
        this.e = s2;
        this.f = s3;
        this.g = s4;
        this.i = by2;
    }

    public final void a(DataInputStream dataInputStream) {
        this.c = dataInputStream.readInt();
        dataInputStream.readUTF();
        this.e = dataInputStream.readShort();
        this.f = dataInputStream.readShort();
        this.g = dataInputStream.readShort();
        int n2 = dataInputStream.readByte();
        this.j = new int[n2];
        this.k = new String[n2];
        this.h = bu.a(String.valueOf(this.g), (byte)2);
        for (int i2 = 0; i2 < n2; ++i2) {
            this.j[i2] = dataInputStream.readInt();
            this.k[i2] = dataInputStream.readUTF();
        }
    }

    public final short a() {
        if (this.d == null) {
            return 0;
        }
        if (this.d.g() == 0) {
            return 16;
        }
        return this.d.g();
    }

    public final short b() {
        if (this.d == null) {
            return 0;
        }
        if (this.d.h() == 0) {
            return 24;
        }
        return this.d.h();
    }

    public final void a(byte by2) {
        if (bt.bs == 0 && bt.s == 0) {
            return;
        }
        if (by2 == 0) {
            this.a = (short)-4;
            this.b = 0;
            return;
        }
        if (by2 == 2) {
            this.a = (short)4;
            this.b = 0;
            return;
        }
        if (by2 == 1) {
            this.a = 0;
            this.b = (short)-4;
            return;
        }
        if (by2 == 3) {
            this.a = 0;
            this.b = (short)4;
            return;
        }
        this.a = 0;
        this.b = 0;
    }

    public final void a(Graphics graphics, ai ai2, int n2, int n3, byte by2) {
        if (this.d != null && this.d.k != null) {
            ai2.a(graphics, this.d.k[this.d.f], this.d.g(), this.d.h(), null, n2, n3, this.e, this.f, 20, 0);
        }
    }
}


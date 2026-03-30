package defpackage;

import java.io.DataInputStream;

/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-8105993946875401281/classes.dex */
public final class bn {
    public int a;
    public String b;
    public byte c;
    public byte d;
    public byte e;
    public byte f;
    public byte g;
    public short h;
    public short i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public short p;
    public long q;
    public short r;
    public String s;
    public int t;
    public short[] u;
    public byte v = 0;

    public final void a(DataInputStream dataInputStream) {
        this.a = dataInputStream.readInt();
        this.b = dataInputStream.readUTF();
        this.h = dataInputStream.readShort();
        this.c = dataInputStream.readByte();
        this.d = dataInputStream.readByte();
        this.e = dataInputStream.readByte();
        this.f = dataInputStream.readByte();
        this.g = dataInputStream.readByte();
        this.i = dataInputStream.readShort();
        this.j = dataInputStream.readUTF();
        this.k = dataInputStream.readUTF();
        this.l = dataInputStream.readUTF();
        this.m = dataInputStream.readUTF();
        this.n = dataInputStream.readUTF();
        this.o = dataInputStream.readUTF();
        this.p = dataInputStream.readShort();
        this.q = dataInputStream.readLong();
        this.r = dataInputStream.readShort();
        this.s = dataInputStream.readUTF();
        this.t = dataInputStream.readInt();
        int i = dataInputStream.readByte();
        if (i > 0) {
            this.u = new short[i];
            for (byte b = 0; b < i; b = (byte) (b + 1)) {
                this.u[b] = dataInputStream.readShort();
            }
        }
    }
}

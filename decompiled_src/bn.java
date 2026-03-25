/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;

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
        byte by2 = dataInputStream.readByte();
        if (by2 > 0) {
            this.u = new short[by2];
            for (byte by3 = 0; by3 < by2; by3 = (byte)(by3 + 1)) {
                this.u[by3] = dataInputStream.readShort();
            }
        }
    }
}


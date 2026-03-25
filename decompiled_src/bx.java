/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;

public final class bx {
    public cf a;
    public short b;
    public byte c;
    public short d;
    public short e;
    public short f;
    public byte g;
    private aj h;

    public final aj a() {
        if (this.h == null && this.a != null && this.a.o == 0) {
            this.h = ((bf)this.a).a(this.d);
        }
        if (this.h == null) {
            return new aj(0, 0, 0, 0);
        }
        return this.h;
    }

    public final void a(DataInputStream dataInputStream, boolean bl2) {
        this.b = dataInputStream.readShort();
        this.c = dataInputStream.readByte();
        this.e = dataInputStream.readShort();
        this.f = dataInputStream.readShort();
        this.d = dataInputStream.readShort();
        this.g = dataInputStream.readByte();
    }
}


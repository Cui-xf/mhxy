package defpackage;

import java.io.DataInputStream;

/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-8105993946875401281/classes.dex */
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
            this.h = ((bf) this.a).a(this.d);
        }
        return this.h == null ? new aj((short) 0, (short) 0, (short) 0, (short) 0) : this.h;
    }

    public final void a(DataInputStream dataInputStream, boolean z) {
        this.b = dataInputStream.readShort();
        this.c = dataInputStream.readByte();
        this.e = dataInputStream.readShort();
        this.f = dataInputStream.readShort();
        this.d = dataInputStream.readShort();
        this.g = dataInputStream.readByte();
    }
}

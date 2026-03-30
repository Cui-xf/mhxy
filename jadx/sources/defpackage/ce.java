package defpackage;

import java.io.DataInputStream;
import java.io.IOException;

/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-8105993946875401281/classes.dex */
public final class ce {
    public byte a;
    public byte b;
    public String c;
    public String d;
    public String e;

    public ce() {
    }

    public ce(String str, byte b, String str2, byte b2) {
        this.d = str;
        this.b = b;
        this.e = str2;
        this.a = b2;
    }

    public final void a(DataInputStream dataInputStream) throws IOException {
        dataInputStream.readInt();
        this.a = dataInputStream.readByte();
        this.b = dataInputStream.readByte();
        this.c = dataInputStream.readUTF();
        this.d = dataInputStream.readUTF();
        this.e = dataInputStream.readUTF();
    }
}

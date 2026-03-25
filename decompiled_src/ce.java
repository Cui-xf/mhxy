/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;

public final class ce {
    public byte a;
    public byte b;
    public String c;
    public String d;
    public String e;

    public ce() {
    }

    public ce(String string, byte by2, String string2, byte by3) {
        this.d = string;
        this.b = by2;
        this.e = string2;
        this.a = by3;
    }

    public final void a(DataInputStream dataInputStream) {
        dataInputStream.readInt();
        this.a = dataInputStream.readByte();
        this.b = dataInputStream.readByte();
        this.c = dataInputStream.readUTF();
        this.d = dataInputStream.readUTF();
        this.e = dataInputStream.readUTF();
    }
}


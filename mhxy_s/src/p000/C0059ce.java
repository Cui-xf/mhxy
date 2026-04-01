package p000;

import java.io.DataInputStream;
import java.io.IOException;

/* renamed from: ce */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-5080095226433994817/classes.dex */
public final class C0059ce {

    /* renamed from: a */
    public byte f1951a;

    /* renamed from: b */
    public byte f1952b;

    /* renamed from: c */
    public String f1953c;

    /* renamed from: d */
    public String f1954d;

    /* renamed from: e */
    public String f1955e;

    public C0059ce() {
    }

    public C0059ce(String str, byte b, String str2, byte b2) {
        this.f1954d = str;
        this.f1952b = b;
        this.f1955e = str2;
        this.f1951a = b2;
    }

    /* renamed from: a */
    public final void m1343a(DataInputStream dataInputStream) throws IOException {
        dataInputStream.readInt();
        this.f1951a = dataInputStream.readByte();
        this.f1952b = dataInputStream.readByte();
        this.f1953c = dataInputStream.readUTF();
        this.f1954d = dataInputStream.readUTF();
        this.f1955e = dataInputStream.readUTF();
    }
}

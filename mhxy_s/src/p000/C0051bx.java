package p000;

import java.io.DataInputStream;
import java.io.IOException;

/* renamed from: bx */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-4234804660425969496/classes.dex */
public final class C0051bx {

    /* renamed from: a */
    public AbstractC0060cf f1793a;

    /* renamed from: b */
    public short f1794b;

    /* renamed from: c */
    public byte f1795c;

    /* renamed from: d */
    public short f1796d;

    /* renamed from: e */
    public short f1797e;

    /* renamed from: f */
    public short f1798f;

    /* renamed from: g */
    public byte f1799g;

    /* renamed from: h */
    private C0010aj f1800h;

    /* renamed from: a */
    public final C0010aj m1019a() {
        if (this.f1800h == null && this.f1793a != null && this.f1793a.f1956o == 0) {
            this.f1800h = ((C0033bf) this.f1793a).m650a(this.f1796d);
        }
        return this.f1800h == null ? new C0010aj((short) 0, (short) 0, (short) 0, (short) 0) : this.f1800h;
    }

    /* renamed from: a */
    public final void m1020a(DataInputStream dataInputStream, boolean z) throws IOException {
        this.f1794b = dataInputStream.readShort();
        this.f1795c = dataInputStream.readByte();
        this.f1797e = dataInputStream.readShort();
        this.f1798f = dataInputStream.readShort();
        this.f1796d = dataInputStream.readShort();
        this.f1799g = dataInputStream.readByte();
    }
}

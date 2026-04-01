package p000;

import java.io.DataInputStream;
import java.io.IOException;

/* renamed from: bn */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-4234804660425969496/classes.dex */
public final class C0041bn {

    /* renamed from: a */
    public int f714a;

    /* renamed from: b */
    public String f715b;

    /* renamed from: c */
    public byte f716c;

    /* renamed from: d */
    public byte f717d;

    /* renamed from: e */
    public byte f718e;

    /* renamed from: f */
    public byte f719f;

    /* renamed from: g */
    public byte f720g;

    /* renamed from: h */
    public short f721h;

    /* renamed from: i */
    public short f722i;

    /* renamed from: j */
    public String f723j;

    /* renamed from: k */
    public String f724k;

    /* renamed from: l */
    public String f725l;

    /* renamed from: m */
    public String f726m;

    /* renamed from: n */
    public String f727n;

    /* renamed from: o */
    public String f728o;

    /* renamed from: p */
    public short f729p;

    /* renamed from: q */
    public long f730q;

    /* renamed from: r */
    public short f731r;

    /* renamed from: s */
    public String f732s;

    /* renamed from: t */
    public int f733t;

    /* renamed from: u */
    public short[] f734u;

    /* renamed from: v */
    public byte f735v = 0;

    /* renamed from: a */
    public final void m696a(DataInputStream dataInputStream) throws IOException {
        this.f714a = dataInputStream.readInt();
        this.f715b = dataInputStream.readUTF();
        this.f721h = dataInputStream.readShort();
        this.f716c = dataInputStream.readByte();
        this.f717d = dataInputStream.readByte();
        this.f718e = dataInputStream.readByte();
        this.f719f = dataInputStream.readByte();
        this.f720g = dataInputStream.readByte();
        this.f722i = dataInputStream.readShort();
        this.f723j = dataInputStream.readUTF();
        this.f724k = dataInputStream.readUTF();
        this.f725l = dataInputStream.readUTF();
        this.f726m = dataInputStream.readUTF();
        this.f727n = dataInputStream.readUTF();
        this.f728o = dataInputStream.readUTF();
        this.f729p = dataInputStream.readShort();
        this.f730q = dataInputStream.readLong();
        this.f731r = dataInputStream.readShort();
        this.f732s = dataInputStream.readUTF();
        this.f733t = dataInputStream.readInt();
        int i = dataInputStream.readByte();
        if (i > 0) {
            this.f734u = new short[i];
            for (byte b = 0; b < i; b = (byte) (b + 1)) {
                this.f734u[b] = dataInputStream.readShort();
            }
        }
    }
}

package p000;

/* renamed from: aw */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-4234804660425969496/classes.dex */
public final class C0023aw extends AbstractC0060cf {

    /* renamed from: a */
    public short f456a;

    /* renamed from: b */
    public short f457b;

    /* renamed from: c */
    public byte f458c;

    /* renamed from: d */
    public byte f459d;

    /* renamed from: e */
    public byte f460e;

    /* renamed from: f */
    public byte f461f;

    /* renamed from: g */
    public byte f462g;

    /* renamed from: h */
    public byte f463h;

    /* renamed from: i */
    public byte[][] f464i;

    /* renamed from: j */
    public C0051bx[][] f465j;

    /* renamed from: k */
    public C0051bx[] f466k;

    /* renamed from: l */
    public C0051bx[] f467l;

    /* renamed from: m */
    public short[][] f468m;

    /* renamed from: n */
    public int[][] f469n;

    public C0023aw() {
        super((byte) 3);
    }

    /* renamed from: a */
    public final short m605a(int i) {
        if (this.f468m == null) {
            return (short) -1;
        }
        for (int i2 = 0; i2 < this.f468m.length; i2++) {
            if (this.f468m[i2][0] == i) {
                return (short) i2;
            }
        }
        return (short) -1;
    }

     // p000.AbstractC0060cf
    /* renamed from: a */
    public final void mo606a() {
        this.f464i = null;
        if (this.f465j != null) {
            for (int i = 0; i < this.f465j.length; i++) {
                for (int i2 = 0; i2 < this.f465j[i].length; i2++) {
                    if (this.f465j[i][i2] != null) {
                        this.f465j[i][i2] = null;
                    }
                }
            }
            this.f465j = null;
        }
        if (this.f466k != null) {
            for (int i3 = 0; i3 < this.f466k.length; i3++) {
                if (this.f466k[i3] != null) {
                    this.f466k[i3] = null;
                }
            }
            this.f466k = null;
        }
        if (this.f467l != null) {
            for (int i4 = 0; i4 < this.f467l.length; i4++) {
                if (this.f467l[i4] != null) {
                    this.f467l[i4] = null;
                }
            }
            this.f467l = null;
        }
    }
}

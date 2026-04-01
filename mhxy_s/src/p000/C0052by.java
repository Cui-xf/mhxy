package p000;

/* renamed from: by */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-4234804660425969496/classes.dex */
public class C0052by {

    /* renamed from: a */
    public boolean f1801a;

    /* renamed from: b */
    public byte f1802b;

    /* renamed from: c */
    public Object f1803c;

    public C0052by(byte b, Object obj, boolean z) {
        this.f1802b = b;
        this.f1803c = obj;
        this.f1801a = z;
    }

    /* renamed from: a */
    public short mo1021a() {
        switch (this.f1802b) {
            case 1:
                return ((AbstractC0018ar) this.f1803c).m565m();
            case 2:
                return ((C0039bl) this.f1803c).m565m();
            case 3:
                return ((C0043bp) this.f1803c).m565m();
            case 4:
                return ((C0021au) this.f1803c).m582a();
            case 5:
                return ((C0026az) this.f1803c).f512d;
            case 6:
            default:
                return (short) 0;
            case 7:
                return ((C0087s) this.f1803c).m582a();
            case 8:
                C0049bv c0049bv = (C0049bv) this.f1803c;
                if (c0049bv.f1781d == null) {
                    return (short) 0;
                }
                return (short) ((c0049bv.f1781d.m634h() == 0 ? (short) 24 : c0049bv.f1781d.m634h()) + c0049bv.f1783f);
        }
    }
}

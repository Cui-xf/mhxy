package defpackage;

/* loaded from: java版梦回西游3区251011.jar:by.class */
public class by {
    public boolean a;
    public byte b;
    public Object c;

    public by(byte b, Object obj, boolean z) {
        this.b = b;
        this.c = obj;
        this.a = z;
    }

    public short a() {
        switch (this.b) {
            case 1:
                return ((ar) this.c).m();
            case 2:
                return ((bl) this.c).m();
            case 3:
                return ((bp) this.c).m();
            case 4:
                return ((au) this.c).a();
            case 5:
                return ((az) this.c).d;
            case 6:
            default:
                return (short) 0;
            case 7:
                return ((s) this.c).a();
            case 8:
                bv bvVar = (bv) this.c;
                if (bvVar.d == null) {
                    return (short) 0;
                }
                return (short) (bvVar.f + (bvVar.d.h() == 0 ? (short) 24 : bvVar.d.h()));
        }
    }
}

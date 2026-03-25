/*
 * Decompiled with CFR 0.152.
 */
public class by {
    public boolean a;
    public byte b;
    public Object c;

    public by(byte by2, Object object, boolean bl2) {
        this.b = by2;
        this.c = object;
        this.a = bl2;
    }

    public short a() {
        switch (((by)object).b) {
            case 1: {
                return ((ar)((by)object).c).m();
            }
            case 2: {
                return ((bl)((by)object).c).m();
            }
            case 4: {
                return ((au)((by)object).c).a();
            }
            case 5: {
                Object object = (az)((by)object).c;
                return ((az)object).d;
            }
            case 3: {
                return ((bp)((by)object).c).m();
            }
            case 7: {
                return ((s)((by)object).c).a();
            }
            case 8: {
                Object object = (bv)((by)object).c;
                if (((bv)object).d == null) {
                    return 0;
                }
                return (short)(((bv)object).f + (((bv)object).d.h() == 0 ? 24 : (int)((bv)object).d.h()));
            }
        }
        return 0;
    }
}


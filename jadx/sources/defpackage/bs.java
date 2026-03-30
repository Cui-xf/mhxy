package defpackage;

/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-8105993946875401281/classes.dex */
public final class bs {
    public int a;
    public int b;
    public bs c;

    public bs() {
        this.b = 0;
        this.a = 0;
    }

    public bs(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public bs(int i, int i2, bs bsVar) {
        this.a = i;
        this.b = i2;
        this.c = bsVar;
    }

    public final int a(bs bsVar) {
        return ((this.a - bsVar.a) * (this.a - bsVar.a)) + ((this.b - bsVar.b) * (this.b - bsVar.b));
    }

    public final boolean b(bs bsVar) {
        return this.a == bsVar.a && this.b == bsVar.b;
    }
}

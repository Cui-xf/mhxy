package defpackage;

/* loaded from: java版梦回西游3区251011.jar:bs.class */
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

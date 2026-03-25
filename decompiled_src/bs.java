/*
 * Decompiled with CFR 0.152.
 */
public final class bs {
    public int a;
    public int b;
    public bs c;

    public bs() {
        this.b = 0;
        this.a = 0;
    }

    public bs(int n2, int n3) {
        this.a = n2;
        this.b = n3;
    }

    public bs(int n2, int n3, bs bs2) {
        this.a = n2;
        this.b = n3;
        this.c = bs2;
    }

    public final int a(bs bs2) {
        return (this.a - bs2.a) * (this.a - bs2.a) + (this.b - bs2.b) * (this.b - bs2.b);
    }

    public final boolean b(bs bs2) {
        return this.a == bs2.a && this.b == bs2.b;
    }
}


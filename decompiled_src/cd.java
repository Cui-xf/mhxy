/*
 * Decompiled with CFR 0.152.
 */
public final class cd {
    public short a = (short)-1;
    public String b = null;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public String g = null;
    public String h = null;
    public String[] i = null;
    public int[] j = null;
    public int[] k = null;
    public int[] l = null;
    public y m = null;

    public final void a(y y2) {
        this.m = y2;
    }

    public final void a() {
        this.m.a(this.c, this.d, this.e, this.f);
    }

    public final void b() {
        if (this.g != null) {
            this.m.a(this.g);
        }
        this.m.a(new bi(this.h));
        if (this.i != null) {
            u u2 = new u();
            if (this.i[0] != null) {
                u2.a(this.i[0]);
            }
            if (this.i[1] != null) {
                u2.b(this.i[1]);
            }
            if (this.i[2] != null) {
                u2.c(this.i[2]);
            }
            this.m.a(u2);
        }
        this.m.d();
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import com.yinhan.kjava.main.a;
import javax.microedition.lcdui.Graphics;

public final class l
extends al {
    private String a;
    private String[] b = null;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r = 16776917;
    private int s = 16776917;
    private int t = 16776917;
    private boolean u = false;
    private int[][] v = new int[2][4];

    public final int a() {
        return this.d;
    }

    public static int b() {
        if (com.yinhan.kjava.main.a.E != null) {
            return com.yinhan.kjava.main.a.E.c;
        }
        return t.j;
    }

    public final void a(String string) {
        this.a = string;
        this.b = null;
        this.u = false;
    }

    public final void a(String[] stringArray) {
        this.b = stringArray;
        this.a = null;
        this.u = false;
    }

    public final void a(int n2, int n3, int n4, int n5) {
        this.c = n2;
        this.d = n3 + n5 - com.yinhan.kjava.main.a.E.c;
        this.e = n4;
        if (this.a != null) {
            this.b(n2 + (n4 - t.i.stringWidth(this.a)) / 2, this.d, t.i.stringWidth(this.a), com.yinhan.kjava.main.a.E.c);
            return;
        }
        if (this.b != null && this.b.length == 2) {
            this.b(n2 + 10, this.d, t.i.stringWidth(this.b[0]), com.yinhan.kjava.main.a.E.c);
            this.c(n2 + n4 - 10 - t.i.stringWidth(this.b[1]), this.d, t.i.stringWidth(this.b[1]), com.yinhan.kjava.main.a.E.c);
            return;
        }
        if (this.b != null && this.b.length == 3) {
            this.b(n2 + 10, this.d, t.i.stringWidth(this.b[0]), com.yinhan.kjava.main.a.E.c);
            short s2 = com.yinhan.kjava.main.a.E.c;
            int n6 = t.i.stringWidth(this.b[1]);
            int n7 = this.d;
            n5 = (n2 + n4 - 10 - t.i.stringWidth(this.b[1])) / 2;
            l l2 = this;
            this.n = n5;
            l2.o = n7;
            l2.p = n6;
            l2.q = s2;
            this.c(n2 + n4 - 10 - t.i.stringWidth(this.b[2]), this.d, t.i.stringWidth(this.b[2]), com.yinhan.kjava.main.a.E.c);
        }
    }

    private void b(int n2, int n3, int n4, int n5) {
        this.f = n2;
        this.g = n3;
        this.h = n4;
        this.i = n5;
    }

    private void c(int n2, int n3, int n4, int n5) {
        this.j = n2;
        this.k = n3;
        this.l = n4;
        this.m = n5;
    }

    public final void b(int n2) {
    }

    /*
     * Unable to fully structure code
     */
    public final int b(int var1_1, int var2_2) {
        block15: {
            block14: {
                var5_3 = var2_2;
                var4_4 = var1_1;
                var3_5 = this;
                if (var3_5.a == null) break block14;
                if (var4_4 < var3_5.f || var4_4 > var3_5.f + var3_5.h || var5_3 < var3_5.g || var5_3 > var3_5.g + var3_5.i) ** GOTO lbl-1000
                v0 = 1;
                break block15;
            }
            if (var3_5.b == null) ** GOTO lbl-1000
            if (var4_4 >= var3_5.f && var4_4 <= var3_5.f + var3_5.h && var5_3 >= var3_5.g && var5_3 <= var3_5.g + var3_5.i) {
                v0 = 1;
            } else if (var4_4 >= var3_5.n && var4_4 <= var3_5.n + var3_5.p && var5_3 >= var3_5.o && var5_3 <= var3_5.o + var3_5.q) {
                v0 = 2;
            } else if (var4_4 >= var3_5.j && var4_4 <= var3_5.j + var3_5.l && var5_3 >= var3_5.k && var5_3 <= var3_5.k + var3_5.m) {
                v0 = 3;
            } else lbl-1000:
            // 3 sources

            {
                v0 = 0;
            }
        }
        switch (v0) {
            case 1: {
                return 0x10000000;
            }
            case 2: {
                return 0x40000000;
            }
            case 3: {
                return 0x20000000;
            }
        }
        var5_3 = var2_2;
        var4_4 = var1_1;
        var3_5 = this;
        if (var3_5.u) {
            if (var4_4 >= var3_5.v[0][0] && var4_4 <= var3_5.v[0][0] + var3_5.v[0][2] && var5_3 >= var3_5.v[0][1] && var5_3 <= var3_5.v[0][1] + var3_5.v[0][3]) {
                return 1024;
            }
            if (var4_4 >= var3_5.v[1][0] && var4_4 <= var3_5.v[1][0] + var3_5.v[1][2] && var5_3 >= var3_5.v[1][1] && var5_3 <= var3_5.v[1][1] + var3_5.v[1][3]) {
                return 2048;
            }
        }
        return 0;
    }

    public final void a(Graphics graphics) {
        if (this.a == null && this.b == null) {
            return;
        }
        ca.a(graphics, com.yinhan.kjava.main.a.E.a, com.yinhan.kjava.main.a.E.b, this.c, this.d, this.e, (int)com.yinhan.kjava.main.a.E.c);
        graphics.setFont(t.i);
        if (this.a != null) {
            ca.a(graphics, this.a, this.f, this.g + t.a(com.yinhan.kjava.main.a.E.c), 20, this.r, 0);
            this.a(graphics, this.f - 5 - com.yinhan.kjava.main.a.Q.b, this.f + 5 + t.i.stringWidth(this.a), this.g + 4);
            return;
        }
        if (this.b != null) {
            if (this.b.length == 2) {
                ca.a(graphics, this.b[0], this.f, this.g + t.a(com.yinhan.kjava.main.a.E.c), 20, this.r, 0);
                ca.a(graphics, this.b[1], this.j, this.k + t.a(com.yinhan.kjava.main.a.E.c), 20, this.s, 0);
            } else if (this.b.length == 3) {
                ca.a(graphics, this.b[0], this.f, this.g + t.a(com.yinhan.kjava.main.a.E.c), 20, this.r, 0);
                ca.a(graphics, this.b[1], this.n, this.o + t.a(com.yinhan.kjava.main.a.E.c), 20, this.t, 0);
                ca.a(graphics, this.b[2], this.j, this.k + t.a(com.yinhan.kjava.main.a.E.c), 20, this.s, 0);
            }
            this.a(graphics, this.f + t.i.stringWidth(this.b[0]) + 10, this.j - 10 - com.yinhan.kjava.main.a.P.b, this.g + 4);
        }
    }

    private void a(Graphics graphics, int n2, int n3, int n4) {
        if (this.u) {
            graphics.drawImage(com.yinhan.kjava.main.a.Q.a, n2, n4, 20);
            graphics.drawImage(com.yinhan.kjava.main.a.P.a, n3, n4, 20);
            this.v[0][0] = n2;
            this.v[0][1] = n4;
            this.v[0][2] = com.yinhan.kjava.main.a.Q.b;
            this.v[0][3] = com.yinhan.kjava.main.a.Q.c;
            this.v[1][0] = n3;
            this.v[1][1] = n4;
            this.v[1][2] = com.yinhan.kjava.main.a.P.b;
            this.v[1][3] = com.yinhan.kjava.main.a.P.c;
        }
    }

    public final void j() {
        if (this.a != null) {
            this.a = null;
        }
        if (this.b != null) {
            this.b = null;
        }
    }

    public final void a(boolean bl2) {
        this.u = true;
    }
}


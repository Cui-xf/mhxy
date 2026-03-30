package defpackage;

import com.yinhan.kjava.main.a;
import java.lang.reflect.Array;
import javax.microedition.lcdui.Graphics;

/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-8105993946875401281/classes.dex */
public final class l extends al {
    private String a;
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
    private String[] b = null;
    private int r = 16776917;
    private int s = 16776917;
    private int t = 16776917;
    private boolean u = false;
    private int[][] v = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 2, 4);

    private void a(Graphics graphics, int i, int i2, int i3) {
        if (this.u) {
            graphics.drawImage(a.Q.a, i, i3, 20);
            graphics.drawImage(a.P.a, i2, i3, 20);
            this.v[0][0] = i;
            this.v[0][1] = i3;
            this.v[0][2] = a.Q.b;
            this.v[0][3] = a.Q.c;
            this.v[1][0] = i2;
            this.v[1][1] = i3;
            this.v[1][2] = a.P.b;
            this.v[1][3] = a.P.c;
        }
    }

    public static int b() {
        return a.E != null ? a.E.c : t.j;
    }

    private void b(int i, int i2, int i3, int i4) {
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = i4;
    }

    private void c(int i, int i2, int i3, int i4) {
        this.j = i;
        this.k = i2;
        this.l = i3;
        this.m = i4;
    }

    public final int a() {
        return this.d;
    }

    public final void a(int i, int i2, int i3, int i4) {
        this.c = i;
        this.d = (i2 + i4) - a.E.c;
        this.e = i3;
        if (this.a != null) {
            b(((i3 - t.i.stringWidth(this.a)) / 2) + i, this.d, t.i.stringWidth(this.a), a.E.c);
            return;
        }
        if (this.b != null && this.b.length == 2) {
            b(i + 10, this.d, t.i.stringWidth(this.b[0]), a.E.c);
            c(((i + i3) - 10) - t.i.stringWidth(this.b[1]), this.d, t.i.stringWidth(this.b[1]), a.E.c);
            return;
        }
        if (this.b == null || this.b.length != 3) {
            return;
        }
        b(i + 10, this.d, t.i.stringWidth(this.b[0]), a.E.c);
        int iStringWidth = (((i + i3) - 10) - t.i.stringWidth(this.b[1])) / 2;
        int i5 = this.d;
        int iStringWidth2 = t.i.stringWidth(this.b[1]);
        short s = a.E.c;
        this.n = iStringWidth;
        this.o = i5;
        this.p = iStringWidth2;
        this.q = s;
        c(((i + i3) - 10) - t.i.stringWidth(this.b[2]), this.d, t.i.stringWidth(this.b[2]), a.E.c);
    }

    public final void a(String str) {
        this.a = str;
        this.b = null;
        this.u = false;
    }

    public final void a(Graphics graphics) {
        if (this.a == null && this.b == null) {
            return;
        }
        ca.a(graphics, a.E.a, a.E.b, this.c, this.d, this.e, a.E.c);
        graphics.setFont(t.i);
        if (this.a != null) {
            ca.a(graphics, this.a, this.f, t.a(a.E.c) + this.g, 20, this.r, 0);
            a(graphics, (this.f - 5) - a.Q.b, this.f + 5 + t.i.stringWidth(this.a), this.g + 4);
            return;
        }
        if (this.b != null) {
            if (this.b.length == 2) {
                ca.a(graphics, this.b[0], this.f, t.a(a.E.c) + this.g, 20, this.r, 0);
                ca.a(graphics, this.b[1], this.j, t.a(a.E.c) + this.k, 20, this.s, 0);
            } else if (this.b.length == 3) {
                ca.a(graphics, this.b[0], this.f, t.a(a.E.c) + this.g, 20, this.r, 0);
                ca.a(graphics, this.b[1], this.n, t.a(a.E.c) + this.o, 20, this.t, 0);
                ca.a(graphics, this.b[2], this.j, t.a(a.E.c) + this.k, 20, this.s, 0);
            }
            a(graphics, this.f + t.i.stringWidth(this.b[0]) + 10, (this.j - 10) - a.P.b, this.g + 4);
        }
    }

    public final void a(boolean z) {
        this.u = true;
    }

    public final void a(String[] strArr) {
        this.b = strArr;
        this.a = null;
        this.u = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00a4  */
    @Override // defpackage.al
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(int r7, int r8) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l.b(int, int):int");
    }

    @Override // defpackage.al
    public final void b(int i) {
    }

    @Override // defpackage.al
    public final void j() {
        if (this.a != null) {
            this.a = null;
        }
        if (this.b != null) {
            this.b = null;
        }
    }
}

package defpackage;

import com.yinhan.kjava.main.a;
import java.lang.reflect.Array;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-8105993946875401281/classes.dex */
public final class an extends al {
    public int b;
    public int c;
    public int d;
    public int e;
    private Font l;
    private String m;
    private String[] n;
    private int o;
    private int p;
    private int q;
    private boolean r;
    private String s;
    private bw t;
    private byte x;
    private int y;
    private byte g = 1;
    private int h = 0;
    public int a = 0;
    private String u = "\t";
    private int v = 2176196;
    private int[][] w = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 2, 4);
    public boolean f = false;
    private boolean i = false;
    private boolean j = true;
    private boolean k = false;

    public an() {
        this.r = false;
        b((byte) 1);
        this.r = false;
    }

    private void a(int i, int i2, int i3, int i4, int i5, int i6) {
        this.w[0][0] = i;
        this.w[0][1] = i2;
        this.w[0][2] = i5;
        this.w[0][3] = i6;
        this.w[1][0] = i3;
        this.w[1][1] = i4;
        this.w[1][2] = i5;
        this.w[1][3] = i6;
    }

    private boolean a(int i, int i2, int i3) {
        if (i3 == 0) {
            if (i >= this.w[0][0] && i <= this.w[0][0] + this.w[0][2] && i2 >= this.w[0][1] && i2 <= this.w[0][1] + this.w[0][3]) {
                return true;
            }
        } else if (i3 == 1 && i >= this.w[1][0] && i <= this.w[1][0] + this.w[1][2] && i2 >= this.w[1][1] && i2 <= this.w[1][1] + this.w[1][3]) {
            return true;
        }
        return false;
    }

    private void b(byte b) {
        this.g = b;
        if (b == 1) {
            this.k = false;
        }
    }

    public final void a(byte b) {
        this.x = b;
    }

    public final void a(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public final void a(String str, Font font, byte b) {
        this.y = font.getHeight();
        this.h = 0;
        this.a = 0;
        this.l = font;
        this.s = str;
        this.t = null;
        b(b);
        this.x = (byte) 0;
        this.r = true;
        this.u = "\t";
        this.m = null;
        this.n = null;
    }

    public final void a(Graphics graphics) {
        if (this.i) {
            ca.a(graphics, 6014420);
            graphics.fillRect(this.b, this.c, this.d, this.e);
        }
        if (this.j) {
            ca.a(graphics, this.b, this.c, this.d, this.e, 1);
            if (this.f) {
                ca.a(graphics);
            }
        }
        if (this.r || this.n == null) {
            if (!this.r || this.t == null) {
                return;
            }
            for (int i = this.a; i < this.t.a() && i < this.a + this.p; i++) {
                this.t.a(graphics, this.b + 4, ((i - this.a) * this.y) + this.c + 4, i, 0);
            }
            if (this.q > 0) {
                ca.a(graphics, ((this.b + this.d) - 2) - a.C.b, this.c + 3, this.e - 5, this.q, this.a, this.o, this.p);
                a(((this.b + this.d) - 2) - a.C.b, this.c + 3, ((this.b + this.d) - 2) - a.C.b, (((this.c + 3) + this.e) - 5) - a.D.c, a.D.b, a.D.c);
                return;
            }
            return;
        }
        int i2 = this.a;
        while (true) {
            int i3 = i2;
            if (i3 >= this.n.length || i3 >= this.a + this.p) {
                break;
            }
            if (i3 == this.h && this.k) {
                ca.a(graphics, 9);
                if (this.h >= this.p) {
                    graphics.fillRect(this.b + 4, this.c + 4 + ((this.p - 1) * this.y), (this.d - a.C.b) - 8, this.y);
                } else {
                    graphics.fillRect(this.b + 4, this.c + 4 + (this.h * this.y), (this.d - a.C.b) - 8, this.y);
                }
            }
            if (i3 == this.h && this.g == 0) {
                ca.a(graphics, this.n[i3], this.b + 4, ((i3 - this.a) * this.y) + this.c + 4, 20, 13500379);
            } else {
                ca.a(graphics, this.n[i3], this.b + 4, ((i3 - this.a) * this.y) + this.c + 4, 20, this.v);
            }
            i2 = i3 + 1;
        }
        if (this.q > 0) {
            ca.a(graphics, ((this.b + this.d) - 2) - a.C.b, this.c + 3, this.e - 5, this.q, this.a, this.o, this.p);
            a(((this.b + this.d) - 2) - a.C.b, this.c + 3, ((this.b + this.d) - 2) - a.C.b, (((this.c + 3) + this.e) - 5) - a.D.c, a.D.b, a.D.c);
        }
    }

    @Override // defpackage.al
    public final int b(int i, int i2) {
        if (a(i, i2, 0)) {
            return this.x == 0 ? 1 : 515;
        }
        if (a(i, i2, 1)) {
            return this.x == 0 ? 4 : 521;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x019c A[LOOP:1: B:93:0x0194->B:95:0x019c, LOOP_END] */
    @Override // defpackage.al
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(int r10) {
        /*
            Method dump skipped, instructions count: 758
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.an.b(int):void");
    }

    public final void b(String str, Font font, byte b) {
        this.y = font.getHeight();
        this.h = 0;
        this.a = 0;
        this.l = font;
        this.m = str;
        b(b);
        this.x = (byte) 0;
        this.u = "\t";
        this.r = false;
        this.s = null;
        this.t = null;
    }

    @Override // defpackage.al
    public final void j() {
        if (this.n != null) {
            for (short s = 0; s < this.n.length; s = (short) (s + 1)) {
                this.n[s] = null;
            }
            this.n = null;
        }
        this.s = null;
        this.t = null;
    }
}

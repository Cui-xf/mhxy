/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import com.yinhan.kjava.main.a;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class ck {
    public byte a;
    public byte b;
    public String c;
    public String d;
    public int e;
    public int f;
    public int g;
    public int h;
    public short i;
    public short j;
    private byte v;
    public byte k;
    public byte l;
    public bc m;
    public byte n;
    private int[] w;
    public boolean o = false;
    public boolean p = false;
    public boolean q = false;
    public short r;
    public short s;
    public short t;
    public Vector u = new Vector();
    private int x = 0;

    public final void a(byte by2) {
        this.v = by2 <= 0 ? (byte)1 : by2;
    }

    public final void b(byte by2) {
        t.ag.delete(0, t.ag.length());
        this.n = by2;
        if (this.b == 0) {
            if (by2 == 4) {
                t.ag.append("f").append(this.j).append(1).append(by2);
            } else {
                t.ag.append("f").append(this.j).append(1).append(this.v).append(by2);
            }
            this.m = com.yinhan.kjava.main.a.ab.b(t.ag.toString());
            if (this.m == null && by2 != 4) {
                t.ag.delete(0, t.ag.length());
                t.ag.append("f").append(this.j).append(1).append(1).append(by2);
                this.m = com.yinhan.kjava.main.a.ab.b(t.ag.toString());
            }
        } else if (this.b == 1) {
            t.ag.append(this.j).append(by2 > 3 ? 3 : (int)by2);
            this.m = com.yinhan.kjava.main.a.ah.a(t.ag.toString(), this.r, this.s, this.t);
        }
        if (this.m != null) {
            this.m = this.m.b();
        }
    }

    public final int a(ai ai2, long l2) {
        if (this.m != null && !this.a()) {
            if (this.w == null) {
                this.w = new int[2];
                ai.a(this.m, this.w);
            }
            if (this.x != 2) {
                this.x = ai.a(this.m, l2);
            }
            if (this.x == 2) {
                this.x = 0;
            }
            return this.x;
        }
        return -1;
    }

    public final void a(Graphics graphics, ai ai2, int n2, int n3, byte by2) {
        if (!this.a() && this.m != null) {
            if (this.w == null) {
                this.w = new int[2];
                ai.a(this.m, this.w);
            }
            ai2.a(graphics, this.m, null, 0, 0, n2, n3, 20, 0);
        }
    }

    public final boolean a() {
        return this.e <= 0;
    }

    public final void b() {
        this.d = null;
        this.w = null;
        if (this.m != null) {
            bc bc2 = this.m;
        }
        this.m = null;
    }

    public final short c() {
        if (this.m != null && this.m.g != null) {
            return this.m.g[this.m.f];
        }
        return 0;
    }

    public final short d() {
        if (this.m != null && this.m.h != null) {
            return this.m.h[0];
        }
        return 0;
    }
}


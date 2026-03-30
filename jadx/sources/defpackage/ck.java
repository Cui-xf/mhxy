package defpackage;

import com.yinhan.kjava.main.a;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-8105993946875401281/classes.dex */
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
    public byte k;
    public byte l;
    public bc m;
    public byte n;
    public short r;
    public short s;
    public short t;
    private byte v;
    private int[] w;
    public boolean o = false;
    public boolean p = false;
    public boolean q = false;
    public Vector u = new Vector();
    private int x = 0;

    public final int a(ai aiVar, long j) {
        if (this.m == null || a()) {
            return -1;
        }
        if (this.w == null) {
            this.w = new int[2];
            ai.a(this.m, this.w);
        }
        if (this.x != 2) {
            this.x = ai.a(this.m, j);
        }
        if (this.x == 2) {
            this.x = 0;
        }
        return this.x;
    }

    public final void a(byte b) {
        if (b <= 0) {
            b = 1;
        }
        this.v = b;
    }

    public final void a(Graphics graphics, ai aiVar, int i, int i2, byte b) {
        if (a() || this.m == null) {
            return;
        }
        if (this.w == null) {
            this.w = new int[2];
            ai.a(this.m, this.w);
        }
        aiVar.a(graphics, this.m, (int[]) null, 0, 0, i, i2, 20, 0);
    }

    public final boolean a() {
        return this.e <= 0;
    }

    public final void b() {
        this.d = null;
        this.w = null;
        if (this.m != null) {
            bc bcVar = this.m;
        }
        this.m = null;
    }

    public final void b(byte b) {
        t.ag.delete(0, t.ag.length());
        this.n = b;
        if (this.b == 0) {
            if (b == 4) {
                t.ag.append("f").append((int) this.j).append(1).append((int) b);
            } else {
                t.ag.append("f").append((int) this.j).append(1).append((int) this.v).append((int) b);
            }
            this.m = a.ab.b(t.ag.toString());
            if (this.m == null && b != 4) {
                t.ag.delete(0, t.ag.length());
                t.ag.append("f").append((int) this.j).append(1).append(1).append((int) b);
                this.m = a.ab.b(t.ag.toString());
            }
        } else if (this.b == 1) {
            StringBuffer stringBufferAppend = t.ag.append((int) this.j);
            if (b > 3) {
                b = 3;
            }
            stringBufferAppend.append((int) b);
            this.m = a.ah.a(t.ag.toString(), this.r, this.s, this.t);
        }
        if (this.m != null) {
            this.m = this.m.b();
        }
    }

    public final short c() {
        if (this.m == null || this.m.g == null) {
            return (short) 0;
        }
        return this.m.g[this.m.f];
    }

    public final short d() {
        if (this.m == null || this.m.h == null) {
            return (short) 0;
        }
        return this.m.h[0];
    }
}

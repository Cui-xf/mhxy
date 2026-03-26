package defpackage;

import javax.microedition.lcdui.Graphics;

/* loaded from: java版梦回西游3区251011.jar:bk.class */
public abstract class bk {
    protected int f;
    protected int g;
    protected int h;
    protected int i;

    public final int e() {
        return this.i;
    }

    public final boolean b(int i, int i2) {
        return i >= this.f && i <= this.f + this.h && i2 >= this.g && i2 <= this.g + this.i;
    }

    public final void a(int i, int i2, int i3, int i4) {
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = i4;
    }

    public abstract void a();

    public abstract void b();

    public abstract void a(int i);

    public abstract int a(int i, int i2);

    public abstract void a(Graphics graphics);
}

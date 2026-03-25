/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

public abstract class bk {
    protected int f;
    protected int g;
    protected int h;
    protected int i;

    public final int e() {
        return this.i;
    }

    public final boolean b(int n2, int n3) {
        return n2 >= this.f && n2 <= this.f + this.h && n3 >= this.g && n3 <= this.g + this.i;
    }

    public final void a(int n2, int n3, int n4, int n5) {
        this.f = n2;
        this.g = n3;
        this.h = n4;
        this.i = n5;
    }

    public abstract void a();

    public abstract void b();

    public abstract void a(int var1);

    public abstract int a(int var1, int var2);

    public abstract void a(Graphics var1);
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import com.yinhan.kjava.main.a;
import javax.microedition.lcdui.Graphics;

public final class u
extends bk {
    private int a = 0xFFFFFF;
    private int b = 0xFFFFFF;
    private int c = 0xFFFFFF;
    private String d;
    private String e;
    private String j;

    public final void a() {
    }

    public final void b() {
        this.d = null;
        this.e = null;
        this.j = null;
    }

    public final void a(String string) {
        this.d = string;
    }

    public final void b(String string) {
        this.e = string;
    }

    public final void c(String string) {
        this.j = string;
    }

    public final void a(int n2) {
    }

    public final int a(int n2, int n3) {
        if (this.b(n2, n3)) {
            int n4;
            if (this.d != null && n2 > this.f && n2 < this.f + t.i.stringWidth(this.d) + 5 && n3 > this.g && n3 < this.g + this.i) {
                return 0x10000000;
            }
            if (this.e != null && n2 > this.f + (this.h - (n4 = t.i.stringWidth(this.e) + 10)) / 2 && n2 < this.f + (this.h + n4) / 2 && n3 > this.f && n3 < this.g + this.i) {
                return 0x40000000;
            }
            if (this.j != null && n2 > this.f + this.h - t.i.stringWidth(this.j) - 5 && n2 < this.f + this.h && n3 > this.g && n3 < this.g + this.i) {
                return 0x20000000;
            }
        }
        return 0;
    }

    public final void a(Graphics graphics) {
        graphics.setClip(this.f, this.g, this.h, this.i);
        ca.a(graphics, com.yinhan.kjava.main.a.E.a, com.yinhan.kjava.main.a.E.b, this.f, this.g, this.h, (int)com.yinhan.kjava.main.a.E.c);
        if (this.d != null) {
            graphics.setColor(this.a);
            graphics.drawString(this.d, this.f + 3, this.g + (this.i - t.j) / 2, 20);
        }
        if (this.e != null) {
            graphics.setColor(this.b);
            graphics.drawString(this.e, this.f + this.h / 2, this.g + (this.i - t.j) / 2, 17);
        }
        if (this.j != null) {
            graphics.setColor(this.c);
            graphics.drawString(this.j, this.f + this.h - 3, this.g + (this.i - t.j) / 2, 24);
        }
    }
}


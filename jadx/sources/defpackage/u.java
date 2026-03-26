package defpackage;

import com.yinhan.kjava.main.a;
import javax.microedition.lcdui.Graphics;

/* loaded from: java版梦回西游3区251011.jar:u.class */
public final class u extends bk {
    private int a = 16777215;
    private int b = 16777215;
    private int c = 16777215;
    private String d;
    private String e;
    private String j;

    @Override // defpackage.bk
    public final void a() {
    }

    @Override // defpackage.bk
    public final void b() {
        this.d = null;
        this.e = null;
        this.j = null;
    }

    public final void a(String str) {
        this.d = str;
    }

    public final void b(String str) {
        this.e = str;
    }

    public final void c(String str) {
        this.j = str;
    }

    @Override // defpackage.bk
    public final void a(int i) {
    }

    @Override // defpackage.bk
    public final int a(int i, int i2) {
        if (!b(i, i2)) {
            return 0;
        }
        if (this.d != null && i > this.f && i < this.f + t.i.stringWidth(this.d) + 5 && i2 > this.g && i2 < this.g + this.i) {
            return 268435456;
        }
        if (this.e != null) {
            int iStringWidth = t.i.stringWidth(this.e) + 10;
            if (i > this.f + ((this.h - iStringWidth) / 2) && i < this.f + ((this.h + iStringWidth) / 2) && i2 > this.f && i2 < this.g + this.i) {
                return 1073741824;
            }
        }
        return (this.j == null || i <= ((this.f + this.h) - t.i.stringWidth(this.j)) - 5 || i >= this.f + this.h || i2 <= this.g || i2 >= this.g + this.i) ? 0 : 536870912;
    }

    @Override // defpackage.bk
    public final void a(Graphics graphics) {
        graphics.setClip(this.f, this.g, this.h, this.i);
        ca.a(graphics, a.E.a, a.E.b, this.f, this.g, this.h, a.E.c);
        if (this.d != null) {
            graphics.setColor(this.a);
            graphics.drawString(this.d, this.f + 3, this.g + ((this.i - t.j) / 2), 20);
        }
        if (this.e != null) {
            graphics.setColor(this.b);
            graphics.drawString(this.e, this.f + (this.h / 2), this.g + ((this.i - t.j) / 2), 17);
        }
        if (this.j != null) {
            graphics.setColor(this.c);
            graphics.drawString(this.j, (this.f + this.h) - 3, this.g + ((this.i - t.j) / 2), 24);
        }
    }
}

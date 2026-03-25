/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import com.yinhan.kjava.main.a;
import javax.microedition.lcdui.Graphics;

public final class ba {
    private ao a;
    private ai b;
    private a c;
    private short d;
    private int e;
    private int f;
    private int g;
    private int h;

    public ba(a a2, ao ao2, ai ai2) {
        this.c = a2;
        this.a = ao2;
        this.b = ai2;
        a2.aq.b();
        a2.aq.a("\u5ba0\u7269\u5347\u661f");
        a2.aq.a(a2.at);
        if (t.c > 220) {
            a2.au.a("");
            a2.aq.a(a2.au);
        }
        a2.aq.a(t.f, t.g, t.d, t.e);
        this.d = (short)(a2.at.e >> 1);
        this.e = a2.at.b;
        this.f = a2.at.c;
        this.g = a2.at.d;
        this.h = this.d;
        a2.at.a(this.e, this.f + this.h, this.g, this.h + 1);
    }

    public final void a() {
        this.c.aq.b();
        this.c.aq.a("\u5ba0\u7269\u5347\u661f");
        this.c.aq.a(this.c.at);
        if (t.c > 220) {
            this.c.au.a("");
            this.c.aq.a(this.c.au);
        }
        this.c.aq.a("\u5ba0\u7269\u5347\u661f");
        this.c.at.a(this.e, this.f + this.h + 1, this.g, this.d);
    }

    public final void a(Graphics graphics) {
        this.c.aq.a(graphics);
        ca.a(graphics, this.e, this.f, this.g, this.h - 32, 1);
        ca.a(graphics, this.e, this.f, 80, this.h - 32, 1);
        if (this.a.bf == 0 && this.a.be == 0) {
            graphics.setColor(0xFFFF00);
            graphics.drawRect(this.e, this.f, 80, this.h - 32);
        }
        if (bt.mx != -1 && this.a.aI != null) {
            this.b.a(graphics, this.a.aI, null, 0, 0, this.e + 40 - this.a.aI.g() / 2, this.f + (this.h - 32) / 2 - this.a.aI.h() / 2, 0, 0);
        } else {
            graphics.setColor(0xFFFF00);
            graphics.drawString("\u4e3b\u5ba0", this.e + 40, this.f + (this.h - 32) / 2, 65);
        }
        graphics.setColor(255);
        graphics.drawString("\u5e78\u8fd0\u6750\u6599", this.e + 80 + 4, this.f + 8, 0);
        com.yinhan.kjava.main.a.f.a(graphics, ao.x, null, null, 0, 0, this.e + 80 + 8 + 24, this.f + this.h - 32 - 44, 0, 0);
        if (bt.mK[0] > 0) {
            this.b.a(graphics, ao.b(bt.mK[0]), null, null, 0, 0, this.e + 80 + 8 + 24, this.f + this.h - 32 - 44, 0, 0);
        }
        if (this.a.bf == 0 && this.a.be == 1) {
            graphics.setColor(0xFFFF00);
            graphics.drawRect(this.e + 80 + 8 + 24, this.f + this.h - 32 - 44, 16, 16);
        }
        graphics.setColor(2917024);
        graphics.fillRect(this.e + this.g - 44, this.f + (this.h - 32 - 40) / 2, 40, 40);
        graphics.setColor(this.a.bf == 1 && this.a.be == 0 ? 0xFFFF00 : 9360850);
        graphics.drawRect(this.e + this.g - 44, this.f + (this.h - 32 - 40) / 2, 39, 39);
        if (bt.mD != -1 && this.a.bd != null) {
            this.b.a(graphics, this.a.bd, null, 0, 0, this.e + this.g - 44 + 20 - this.a.bd.g() / 2, this.f + (this.h - 32) / 2 - this.a.bd.h() / 2, 0, 0);
        } else {
            graphics.setColor(0xFFFF00);
            graphics.drawString("\u526f\u5ba0", this.e + this.g - 44 + 20, this.f + (this.h - 32) / 2, 65);
        }
        ca.a(graphics, this.e, this.f + this.h - 32, this.g, 32, 1);
        if (bt.mM != null) {
            graphics.setColor(0xFFFF00);
            graphics.drawString(bt.mM, t.b / 2, this.f + this.h - 25 + 2, 17);
        }
        if (this.a.l == 1) {
            ca.c(graphics);
        }
    }

    public final int a(byte by2, int n2, int n3) {
        if (this.a.l == 1) {
            return ca.c(n2, n3);
        }
        if (this.c.aq.b(n2, n3) > 0) {
            return this.c.aq.b(n2, n3);
        }
        if (n2 > this.e && n2 < this.e + 80 && n3 > this.f && n3 < this.f + this.h - 32) {
            if (this.a.be == 0 && this.a.bf == 0) {
                return 0x10000000;
            }
            this.a.bf = 0;
            this.a.be = 0;
            ca.l = 0;
            this.a.ak();
        } else if (n2 > this.e + this.g - 44 && n2 < this.e + this.g - 4 && n3 > this.f + (this.h - 32 - 40) / 2 && n3 < this.f + (this.h - 32 - 40) / 2 + 40) {
            if (this.a.be == 0 && this.a.bf == 1) {
                return 0x10000000;
            }
            this.a.bf = 1;
            this.a.be = 0;
            ca.l = 0;
            this.a.ak();
        } else if (n2 > this.e + 80 + 8 + 24 && n2 < this.e + 80 + 8 + 24 + 16 && n3 > this.f + this.h - 32 - 44 && n3 < this.f + this.h - 32 - 44 + 16) {
            if (this.a.be == 1 && this.a.bf == 0) {
                return 0x10000000;
            }
            this.a.bf = 0;
            this.a.be = 1;
            ca.l = 0;
            this.a.ak();
        }
        return 0;
    }
}


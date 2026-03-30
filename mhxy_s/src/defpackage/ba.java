package defpackage;

import com.yinhan.kjava.main.a;
import javax.microedition.lcdui.Graphics;

/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-8105993946875401281/classes.dex */
public final class ba {
    private ao a;
    private ai b;
    private a c;
    private short d;
    private int e;
    private int f;
    private int g;
    private int h;

    public ba(a aVar, ao aoVar, ai aiVar) {
        this.c = aVar;
        this.a = aoVar;
        this.b = aiVar;
        aVar.aq.b();
        aVar.aq.a("宠物升星");
        aVar.aq.a(aVar.at);
        if (t.c > 220) {
            aVar.au.a("");
            aVar.aq.a(aVar.au);
        }
        aVar.aq.a(t.f, t.g, t.d, t.e);
        this.d = (short) (aVar.at.e >> 1);
        this.e = aVar.at.b;
        this.f = aVar.at.c;
        this.g = aVar.at.d;
        this.h = this.d;
        aVar.at.a(this.e, this.f + this.h, this.g, this.h + 1);
    }

    public final int a(byte b, int i, int i2) {
        if (this.a.l == 1) {
            return ca.c(i, i2);
        }
        if (this.c.aq.b(i, i2) > 0) {
            return this.c.aq.b(i, i2);
        }
        if (i <= this.e || i >= this.e + 80 || i2 <= this.f || i2 >= (this.f + this.h) - 32) {
            if (i <= (this.e + this.g) - 44 || i >= (this.e + this.g) - 4 || i2 <= this.f + (((this.h - 32) - 40) / 2) || i2 >= this.f + (((this.h - 32) - 40) / 2) + 40) {
                if (i > this.e + 80 + 8 + 24 && i < this.e + 80 + 8 + 24 + 16 && i2 > ((this.f + this.h) - 32) - 44 && i2 < (((this.f + this.h) - 32) - 44) + 16) {
                    if (this.a.be == 1 && this.a.bf == 0) {
                        return 268435456;
                    }
                    this.a.bf = 0;
                    this.a.be = 1;
                    ca.l = 0;
                    this.a.ak();
                }
            } else {
                if (this.a.be == 0 && this.a.bf == 1) {
                    return 268435456;
                }
                this.a.bf = 1;
                this.a.be = 0;
                ca.l = 0;
                this.a.ak();
            }
        } else {
            if (this.a.be == 0 && this.a.bf == 0) {
                return 268435456;
            }
            this.a.bf = 0;
            this.a.be = 0;
            ca.l = 0;
            this.a.ak();
        }
        return 0;
    }

    public final void a() {
        this.c.aq.b();
        this.c.aq.a("宠物升星");
        this.c.aq.a(this.c.at);
        if (t.c > 220) {
            this.c.au.a("");
            this.c.aq.a(this.c.au);
        }
        this.c.aq.a("宠物升星");
        this.c.at.a(this.e, this.f + this.h + 1, this.g, this.d);
    }

    public final void a(Graphics graphics) {
        this.c.aq.a(graphics);
        ca.a(graphics, this.e, this.f, this.g, this.h - 32, 1);
        ca.a(graphics, this.e, this.f, 80, this.h - 32, 1);
        if (this.a.bf == 0 && this.a.be == 0) {
            graphics.setColor(16776960);
            graphics.drawRect(this.e, this.f, 80, this.h - 32);
        }
        if (bt.mx == -1 || this.a.aI == null) {
            graphics.setColor(16776960);
            graphics.drawString("主宠", this.e + 40, this.f + ((this.h - 32) / 2), 65);
        } else {
            this.b.a(graphics, this.a.aI, (int[]) null, 0, 0, (this.e + 40) - (this.a.aI.g() / 2), (this.f + ((this.h - 32) / 2)) - (this.a.aI.h() / 2), 0, 0);
        }
        graphics.setColor(255);
        graphics.drawString("幸运材料", this.e + 80 + 4, this.f + 8, 0);
        a.f.a(graphics, ao.x, (int[]) null, (aj) null, 0, 0, this.e + 80 + 8 + 24, ((this.f + this.h) - 32) - 44, 0, 0);
        if (bt.mK[0] > 0) {
            this.b.a(graphics, ao.b(bt.mK[0]), (int[]) null, (aj) null, 0, 0, this.e + 80 + 8 + 24, ((this.f + this.h) - 32) - 44, 0, 0);
        }
        if (this.a.bf == 0 && this.a.be == 1) {
            graphics.setColor(16776960);
            graphics.drawRect(this.e + 80 + 8 + 24, ((this.f + this.h) - 32) - 44, 16, 16);
        }
        graphics.setColor(2917024);
        graphics.fillRect((this.e + this.g) - 44, this.f + (((this.h - 32) - 40) / 2), 40, 40);
        graphics.setColor((this.a.bf == 1 && this.a.be == 0) ? 16776960 : 9360850);
        graphics.drawRect((this.e + this.g) - 44, this.f + (((this.h - 32) - 40) / 2), 39, 39);
        if (bt.mD == -1 || this.a.bd == null) {
            graphics.setColor(16776960);
            graphics.drawString("副宠", ((this.e + this.g) - 44) + 20, this.f + ((this.h - 32) / 2), 65);
        } else {
            this.b.a(graphics, this.a.bd, (int[]) null, 0, 0, (((this.e + this.g) - 44) + 20) - (this.a.bd.g() / 2), (this.f + ((this.h - 32) / 2)) - (this.a.bd.h() / 2), 0, 0);
        }
        ca.a(graphics, this.e, (this.f + this.h) - 32, this.g, 32, 1);
        if (bt.mM != null) {
            graphics.setColor(16776960);
            graphics.drawString(bt.mM, t.b / 2, ((this.f + this.h) - 25) + 2, 17);
        }
        if (this.a.l == 1) {
            ca.c(graphics);
        }
    }
}

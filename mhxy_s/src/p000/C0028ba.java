package p000;

import com.yinhan.kjava.main.RunnableC0066a;
import javax.microedition.lcdui.Graphics;

/* renamed from: ba */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-5080095226433994817/classes.dex */
public final class C0028ba {

    /* renamed from: a */
    private C0015ao f539a;

    /* renamed from: b */
    private C0009ai f540b;

    /* renamed from: c */
    private RunnableC0066a f541c;

    /* renamed from: d */
    private short f542d;

    /* renamed from: e */
    private int f543e;

    /* renamed from: f */
    private int f544f;

    /* renamed from: g */
    private int f545g;

    /* renamed from: h */
    private int f546h;

    public C0028ba(RunnableC0066a runnableC0066a, C0015ao c0015ao, C0009ai c0009ai) {
        this.f541c = runnableC0066a;
        this.f539a = c0015ao;
        this.f540b = c0009ai;
        runnableC0066a.f2149aq.m1604b();
        runnableC0066a.f2149aq.m1601a("宠物升星");
        runnableC0066a.f2149aq.m1600a(runnableC0066a.f2152at);
        if (C0088t.f2517c > 220) {
            runnableC0066a.f2153au.m1590a("");
            runnableC0066a.f2149aq.m1600a(runnableC0066a.f2153au);
        }
        runnableC0066a.f2149aq.m1598a(C0088t.f2520f, C0088t.f2521g, C0088t.f2518d, C0088t.f2519e);
        this.f542d = (short) (runnableC0066a.f2152at.f111e >> 1);
        this.f543e = runnableC0066a.f2152at.f108b;
        this.f544f = runnableC0066a.f2152at.f109c;
        this.f545g = runnableC0066a.f2152at.f110d;
        this.f546h = this.f542d;
        runnableC0066a.f2152at.m76a(this.f543e, this.f544f + this.f546h, this.f545g, this.f546h + 1);
    }

    /* renamed from: a */
    public final int m621a(byte b, int i, int i2) {
        if (this.f539a.f359l == 1) {
            return C0055ca.m1322c(i, i2);
        }
        if (this.f541c.f2149aq.mo69b(i, i2) > 0) {
            return this.f541c.f2149aq.mo69b(i, i2);
        }
        if (i <= this.f543e || i >= this.f543e + 80 || i2 <= this.f544f || i2 >= (this.f544f + this.f546h) - 32) {
            if (i <= (this.f543e + this.f545g) - 44 || i >= (this.f543e + this.f545g) - 4 || i2 <= this.f544f + (((this.f546h - 32) - 40) / 2) || i2 >= this.f544f + (((this.f546h - 32) - 40) / 2) + 40) {
                if (i > this.f543e + 80 + 8 + 24 && i < this.f543e + 80 + 8 + 24 + 16 && i2 > ((this.f544f + this.f546h) - 32) - 44 && i2 < (((this.f544f + this.f546h) - 32) - 44) + 16) {
                    if (this.f539a.f268be == 1 && this.f539a.f269bf == 0) {
                        return 268435456;
                    }
                    this.f539a.f269bf = 0;
                    this.f539a.f268be = 1;
                    C0055ca.f1892l = 0;
                    this.f539a.m412ak();
                }
            } else {
                if (this.f539a.f268be == 0 && this.f539a.f269bf == 1) {
                    return 268435456;
                }
                this.f539a.f269bf = 1;
                this.f539a.f268be = 0;
                C0055ca.f1892l = 0;
                this.f539a.m412ak();
            }
        } else {
            if (this.f539a.f268be == 0 && this.f539a.f269bf == 0) {
                return 268435456;
            }
            this.f539a.f269bf = 0;
            this.f539a.f268be = 0;
            C0055ca.f1892l = 0;
            this.f539a.m412ak();
        }
        return 0;
    }

    /* renamed from: a */
    public final void m622a() {
        this.f541c.f2149aq.m1604b();
        this.f541c.f2149aq.m1601a("宠物升星");
        this.f541c.f2149aq.m1600a(this.f541c.f2152at);
        if (C0088t.f2517c > 220) {
            this.f541c.f2153au.m1590a("");
            this.f541c.f2149aq.m1600a(this.f541c.f2153au);
        }
        this.f541c.f2149aq.m1601a("宠物升星");
        this.f541c.f2152at.m76a(this.f543e, this.f544f + this.f546h + 1, this.f545g, this.f542d);
    }

    /* renamed from: a */
    public final void m623a(Graphics graphics) {
        this.f541c.f2149aq.m1602a(graphics);
        C0055ca.m1292a(graphics, this.f543e, this.f544f, this.f545g, this.f546h - 32, 1);
        C0055ca.m1292a(graphics, this.f543e, this.f544f, 80, this.f546h - 32, 1);
        if (this.f539a.f269bf == 0 && this.f539a.f268be == 0) {
            graphics.setColor(16776960);
            graphics.drawRect(this.f543e, this.f544f, 80, this.f546h - 32);
        }
        if (C0047bt.f1521mx == -1 || this.f539a.f204aI == null) {
            graphics.setColor(16776960);
            graphics.drawString("主宠", this.f543e + 40, this.f544f + ((this.f546h - 32) / 2), 65);
        } else {
            this.f540b.m62a(graphics, this.f539a.f204aI, (int[]) null, 0, 0, (this.f543e + 40) - (this.f539a.f204aI.m633g() / 2), (this.f544f + ((this.f546h - 32) / 2)) - (this.f539a.f204aI.m634h() / 2), 0, 0);
        }
        graphics.setColor(255);
        graphics.drawString("幸运材料", this.f543e + 80 + 4, this.f544f + 8, 0);
        RunnableC0066a.f2114f.m64a(graphics, C0015ao.f178x, (int[]) null, (C0010aj) null, 0, 0, this.f543e + 80 + 8 + 24, ((this.f544f + this.f546h) - 32) - 44, 0, 0);
        if (C0047bt.f1482mK[0] > 0) {
            this.f540b.m64a(graphics, C0015ao.m264b(C0047bt.f1482mK[0]), (int[]) null, (C0010aj) null, 0, 0, this.f543e + 80 + 8 + 24, ((this.f544f + this.f546h) - 32) - 44, 0, 0);
        }
        if (this.f539a.f269bf == 0 && this.f539a.f268be == 1) {
            graphics.setColor(16776960);
            graphics.drawRect(this.f543e + 80 + 8 + 24, ((this.f544f + this.f546h) - 32) - 44, 16, 16);
        }
        graphics.setColor(2917024);
        graphics.fillRect((this.f543e + this.f545g) - 44, this.f544f + (((this.f546h - 32) - 40) / 2), 40, 40);
        graphics.setColor((this.f539a.f269bf == 1 && this.f539a.f268be == 0) ? 16776960 : 9360850);
        graphics.drawRect((this.f543e + this.f545g) - 44, this.f544f + (((this.f546h - 32) - 40) / 2), 39, 39);
        if (C0047bt.f1475mD == -1 || this.f539a.f267bd == null) {
            graphics.setColor(16776960);
            graphics.drawString("副宠", ((this.f543e + this.f545g) - 44) + 20, this.f544f + ((this.f546h - 32) / 2), 65);
        } else {
            this.f540b.m62a(graphics, this.f539a.f267bd, (int[]) null, 0, 0, (((this.f543e + this.f545g) - 44) + 20) - (this.f539a.f267bd.m633g() / 2), (this.f544f + ((this.f546h - 32) / 2)) - (this.f539a.f267bd.m634h() / 2), 0, 0);
        }
        C0055ca.m1292a(graphics, this.f543e, (this.f544f + this.f546h) - 32, this.f545g, 32, 1);
        if (C0047bt.f1484mM != null) {
            graphics.setColor(16776960);
            graphics.drawString(C0047bt.f1484mM, C0088t.f2516b / 2, ((this.f544f + this.f546h) - 25) + 2, 17);
        }
        if (this.f539a.f359l == 1) {
            C0055ca.m1324c(graphics);
        }
    }
}

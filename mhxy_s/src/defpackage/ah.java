package defpackage;

import javax.microedition.lcdui.Graphics;

/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-8105993946875401281/classes.dex */
public final class ah {
    private byte a;
    private short b;
    private String c;

    public ah(byte b, short s, String str) {
        this.a = b;
        this.b = s;
        this.c = str;
    }

    public final int a() {
        if (this.a == 1) {
            return 16;
        }
        return t.i.stringWidth(this.c);
    }

    public final void a(Graphics graphics, int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 0:
                graphics.setColor(ca.a(this.b));
                graphics.drawString(this.c, i, ((i3 - t.j) / 2) + i2, i4);
                break;
            case 1:
                bf bfVarB = ao.b(this.b);
                if (bfVarB != null) {
                    graphics.drawImage(bfVarB.a, i, ((i3 - bfVarB.c) / 2) + i2, i4);
                    break;
                }
                break;
        }
    }

    public final int b() {
        if (this.a == 1) {
            return 17;
        }
        return t.j;
    }
}

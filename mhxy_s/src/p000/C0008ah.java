package p000;

import javax.microedition.lcdui.Graphics;

/* renamed from: ah */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-4234804660425969496/classes.dex */
public final class C0008ah {

    /* renamed from: a */
    private byte f65a;

    /* renamed from: b */
    private short f66b;

    /* renamed from: c */
    private String f67c;

    public C0008ah(byte b, short s, String str) {
        this.f65a = b;
        this.f66b = s;
        this.f67c = str;
    }

    /* renamed from: a */
    public final int m40a() {
        if (this.f65a == 1) {
            return 16;
        }
        return C0088t.f2523i.stringWidth(this.f67c);
    }

    /* renamed from: a */
    public final void m41a(Graphics graphics, int i, int i2, int i3, int i4) {
        switch (this.f65a) {
            case 0:
                graphics.setColor(C0055ca.m1278a(this.f66b));
                graphics.drawString(this.f67c, i, ((i3 - C0088t.f2524j) / 2) + i2, i4);
                break;
            case 1:
                C0033bf c0033bfM264b = C0015ao.m264b(this.f66b);
                if (c0033bfM264b != null) {
                    graphics.drawImage(c0033bfM264b.f598a, i, ((i3 - c0033bfM264b.f600c) / 2) + i2, i4);
                    break;
                }
                break;
        }
    }

    /* renamed from: b */
    public final int m42b() {
        if (this.f65a == 1) {
            return 17;
        }
        return C0088t.f2524j;
    }
}

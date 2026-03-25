/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

public final class ah {
    private byte a;
    private short b;
    private String c;

    public ah(byte by2, short s2, String string) {
        this.a = by2;
        this.b = s2;
        this.c = string;
    }

    public final int a() {
        if (this.a == 1) {
            return 16;
        }
        return t.i.stringWidth(this.c);
    }

    public final int b() {
        if (this.a == 1) {
            return 17;
        }
        return t.j;
    }

    public final void a(Graphics graphics, int n2, int n3, int n4, int n5) {
        switch (((ah)((Object)bf2)).a) {
            case 1: {
                bf bf2 = ao.b(((ah)((Object)bf2)).b);
                if (bf2 == null) break;
                graphics.drawImage(bf2.a, n2, n3 + (n4 - bf2.c) / 2, n5);
                return;
            }
            case 0: {
                graphics.setColor(ca.a(((ah)((Object)bf2)).b));
                graphics.drawString(((ah)((Object)bf2)).c, n2, n3 + (n4 - t.j) / 2, n5);
            }
        }
    }
}


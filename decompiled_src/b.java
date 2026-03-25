/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class b {
    public String a;
    private am[] b;
    private int c;
    private int d;

    public b(String string, int n2) {
        this.a = string;
        this.c = n2;
        this.a(string);
    }

    private void a(String string) {
        int n2 = 0;
        int n3 = 0;
        int n4 = -1;
        Vector<am> vector = new Vector<am>();
        for (int i2 = 0; i2 < string.length(); ++i2) {
            n2 = string.charAt(i2);
            if (n2 != 60) continue;
            n2 = i2;
            for (int i3 = i2 + 1; i3 < string.length(); ++i3) {
                if (string.charAt(i3) != '>') continue;
                try {
                    int n5 = Integer.parseInt(string.substring(i2 + 1, i3));
                    if (n5 > 42 || n5 < 1) continue;
                    if (n4 < 0) {
                        n4 = i2;
                        vector.addElement(new am(this, 0, string.substring(0, n4)));
                    } else if (n2 - n3 > 1) {
                        vector.addElement(new am(this, 0, string.substring(n3 + 1, n2)));
                    }
                    n3 = i3;
                    vector.addElement(new am(this, 1, string.substring(i2 + 1, i3)));
                    continue;
                }
                catch (Exception exception) {}
            }
        }
        if (n3 > 0) {
            if (string.length() - n3 > 1) {
                vector.addElement(new am(this, 0, string.substring(n3 + 1, string.length())));
            }
        } else {
            vector.addElement(new am(this, 0, string.substring(0, string.length())));
        }
        this.b = new am[vector.size()];
        vector.copyInto(this.b);
        vector.removeAllElements();
    }

    public final void a(Graphics graphics, ai ai2, bf bf2, int n2, int n3) {
        graphics.setColor(this.c);
        this.d = 0;
        for (int i2 = 0; i2 < this.b.length; ++i2) {
            if (this.b[i2].a == 0) {
                graphics.drawString(this.b[i2].b, n2 + this.d, n3, 0);
                this.d += t.i.stringWidth(this.b[i2].b);
                continue;
            }
            ai2.a(graphics, bf2, null, Integer.parseInt(this.b[i2].b), 0, 0, n2 + this.d, n3, 0, 0);
            this.d += 16;
        }
    }
}


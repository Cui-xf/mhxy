package defpackage;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;

/* loaded from: java版梦回西游3区251011.jar:b.class */
public final class b {
    public String a;
    private am[] b;
    private int c;
    private int d;

    public b(String str, int i) throws NumberFormatException {
        this.a = str;
        this.c = i;
        a(str);
    }

    private void a(String str) throws NumberFormatException {
        int i = 0;
        int i2 = -1;
        Vector vector = new Vector();
        for (int i3 = 0; i3 < str.length(); i3++) {
            if (str.charAt(i3) == '<') {
                int i4 = i3;
                for (int i5 = i3 + 1; i5 < str.length(); i5++) {
                    if (str.charAt(i5) == '>') {
                        try {
                            int i6 = Integer.parseInt(str.substring(i3 + 1, i5));
                            if (i6 <= 42 && i6 >= 1) {
                                if (i2 < 0) {
                                    i2 = i3;
                                    vector.addElement(new am(this, (byte) 0, str.substring(0, i2)));
                                } else if (i4 - i > 1) {
                                    vector.addElement(new am(this, (byte) 0, str.substring(i + 1, i4)));
                                }
                                i = i5;
                                vector.addElement(new am(this, (byte) 1, str.substring(i3 + 1, i5)));
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
        if (i <= 0) {
            vector.addElement(new am(this, (byte) 0, str.substring(0, str.length())));
        } else if (str.length() - i > 1) {
            vector.addElement(new am(this, (byte) 0, str.substring(i + 1, str.length())));
        }
        this.b = new am[vector.size()];
        vector.copyInto(this.b);
        vector.removeAllElements();
    }

    public final void a(Graphics graphics, ai aiVar, bf bfVar, int i, int i2) {
        graphics.setColor(this.c);
        this.d = 0;
        for (int i3 = 0; i3 < this.b.length; i3++) {
            if (this.b[i3].a == 0) {
                graphics.drawString(this.b[i3].b, i + this.d, i2, 0);
                this.d += t.i.stringWidth(this.b[i3].b);
            } else {
                aiVar.a(graphics, bfVar, (int[]) null, Integer.parseInt(this.b[i3].b), 0, 0, i + this.d, i2, 0, 0);
                this.d += 16;
            }
        }
    }
}

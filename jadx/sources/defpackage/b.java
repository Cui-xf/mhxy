package defpackage;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;

/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-8105993946875401281/classes.dex */
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
        int i = -1;
        Vector vector = new Vector();
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            if (str.charAt(i3) == '<') {
                int i4 = i3 + 1;
                int i5 = i;
                int i6 = i2;
                while (i4 < str.length()) {
                    if (str.charAt(i4) == '>') {
                        try {
                            int i7 = Integer.parseInt(str.substring(i3 + 1, i4));
                            if (i7 <= 42 && i7 >= 1) {
                                if (i5 < 0) {
                                    try {
                                        vector.addElement(new am(this, (byte) 0, str.substring(0, i3)));
                                        i5 = i3;
                                    } catch (Exception e) {
                                        i5 = i3;
                                    }
                                } else if (i3 - i6 > 1) {
                                    vector.addElement(new am(this, (byte) 0, str.substring(i6 + 1, i3)));
                                }
                                try {
                                    vector.addElement(new am(this, (byte) 1, str.substring(i3 + 1, i4)));
                                    i6 = i4;
                                } catch (Exception e2) {
                                    i6 = i4;
                                }
                            }
                        } catch (Exception e3) {
                        }
                    }
                    i4++;
                    i5 = i5;
                }
                i = i5;
                i2 = i6;
            }
        }
        if (i2 <= 0) {
            vector.addElement(new am(this, (byte) 0, str.substring(0, str.length())));
        } else if (str.length() - i2 > 1) {
            vector.addElement(new am(this, (byte) 0, str.substring(i2 + 1, str.length())));
        }
        this.b = new am[vector.size()];
        vector.copyInto(this.b);
        vector.removeAllElements();
    }

    public final void a(Graphics graphics, ai aiVar, bf bfVar, int i, int i2) {
        graphics.setColor(this.c);
        this.d = 0;
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= this.b.length) {
                return;
            }
            if (this.b[i4].a == 0) {
                graphics.drawString(this.b[i4].b, this.d + i, i2, 0);
                this.d += t.i.stringWidth(this.b[i4].b);
            } else {
                aiVar.a(graphics, bfVar, (int[]) null, Integer.parseInt(this.b[i4].b), 0, 0, i + this.d, i2, 0, 0);
                this.d += 16;
            }
            i3 = i4 + 1;
        }
    }
}

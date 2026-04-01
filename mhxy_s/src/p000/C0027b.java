package p000;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;

/* renamed from: b */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-4234804660425969496/classes.dex */
public final class C0027b {

    /* renamed from: a */
    public String f535a;

    /* renamed from: b */
    private C0013am[] f536b;

    /* renamed from: c */
    private int f537c;

    /* renamed from: d */
    private int f538d;

    public C0027b(String str, int i) throws NumberFormatException {
        this.f535a = str;
        this.f537c = i;
        m619a(str);
    }

    /* renamed from: a */
    private void m619a(String str) throws NumberFormatException {
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
                                        vector.addElement(new C0013am(this, (byte) 0, str.substring(0, i3)));
                                        i5 = i3;
                                    } catch (Exception e) {
                                        i5 = i3;
                                    }
                                } else if (i3 - i6 > 1) {
                                    vector.addElement(new C0013am(this, (byte) 0, str.substring(i6 + 1, i3)));
                                }
                                try {
                                    vector.addElement(new C0013am(this, (byte) 1, str.substring(i3 + 1, i4)));
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
            vector.addElement(new C0013am(this, (byte) 0, str.substring(0, str.length())));
        } else if (str.length() - i2 > 1) {
            vector.addElement(new C0013am(this, (byte) 0, str.substring(i2 + 1, str.length())));
        }
        this.f536b = new C0013am[vector.size()];
        vector.copyInto(this.f536b);
        vector.removeAllElements();
    }

    /* renamed from: a */
    public final void m620a(Graphics graphics, C0009ai c0009ai, C0033bf c0033bf, int i, int i2) {
        graphics.setColor(this.f537c);
        this.f538d = 0;
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= this.f536b.length) {
                return;
            }
            if (this.f536b[i4].f105a == 0) {
                graphics.drawString(this.f536b[i4].f106b, this.f538d + i, i2, 0);
                this.f538d += C0088t.f2523i.stringWidth(this.f536b[i4].f106b);
            } else {
                c0009ai.m63a(graphics, c0033bf, (int[]) null, Integer.parseInt(this.f536b[i4].f106b), 0, 0, i + this.f538d, i2, 0, 0);
                this.f538d += 16;
            }
            i3 = i4 + 1;
        }
    }
}

package defpackage;

import com.yinhan.kjava.main.a;
import java.util.Vector;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

/* loaded from: java版梦回西游3区251011.jar:d.class */
public final class d {
    private int a;
    private ah[] b;

    private d(Vector vector) {
        this.b = new ah[vector.size()];
        vector.copyInto(this.b);
        for (int i = 0; i < this.b.length; i++) {
            if (i == 0 || this.a < this.b[i].b()) {
                this.a = this.b[i].b();
            }
        }
    }

    public final int a() {
        return this.a;
    }

    public final void a(Graphics graphics, int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.b.length; i4++) {
            this.b[i4].a(graphics, i, i2, this.a, 20);
            i += this.b[i4].a();
        }
    }

    public static d[] a(String str, int i, Font font, char c) throws NumberFormatException {
        if (str == null || font == null || i < 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        StringBuffer stringBuffer3 = new StringBuffer();
        byte bCharAt = -1;
        int iCharWidth = 0;
        char c2 = ' ';
        Vector vector = new Vector();
        Vector vector2 = new Vector();
        int i2 = 0;
        while (i2 < str.length()) {
            char cCharAt = str.charAt(i2);
            short s = -1;
            if (cCharAt == '<') {
                stringBuffer.delete(0, stringBuffer.length());
                c2 = ' ';
                int i3 = i2 + 1;
                while (true) {
                    if (i3 < Math.min(i2 + 1 + 6, str.length())) {
                        char cCharAt2 = str.charAt(i3);
                        if (i3 == i2 + 1 && (cCharAt2 == '/' || cCharAt2 == 'f' || cCharAt2 == 'i')) {
                            c2 = cCharAt2;
                        } else if (cCharAt2 == '>' && stringBuffer.length() > 0) {
                            i2 = i3;
                            s = Short.parseShort(stringBuffer.toString());
                        } else if (cCharAt2 >= '0' && cCharAt2 <= '9') {
                            stringBuffer.append(cCharAt2);
                        }
                        i3++;
                    }
                }
            }
            if (s != -1) {
                switch (c2) {
                    case ' ':
                        stringBuffer3.append((int) s);
                        break;
                    case '/':
                        stringBuffer3.delete(stringBuffer3.length() > 0 ? stringBuffer3.length() - 1 : 0, stringBuffer3.length());
                        break;
                }
                if (stringBuffer2.length() > 0) {
                    vector.addElement(new ah((byte) 0, bCharAt, stringBuffer2.toString()));
                    stringBuffer2.delete(0, stringBuffer2.length());
                }
                bCharAt = (byte) (stringBuffer3.length() > 0 ? stringBuffer3.charAt(stringBuffer3.length() - 1) - '0' : -1);
                if (c2 == 'f' || c2 == 'i') {
                    a.af.e(String.valueOf((int) s));
                    bf bfVarB = ao.b(s);
                    short s2 = bfVarB == null ? (short) 0 : bfVarB.b;
                    int i4 = iCharWidth + s2;
                    iCharWidth = i4;
                    if (i4 > i) {
                        iCharWidth = s2;
                        vector2.addElement(new d(vector));
                        vector.removeAllElements();
                    }
                    vector.addElement(new ah((byte) 1, s, null));
                }
            } else {
                iCharWidth += font.charWidth(cCharAt);
                if (cCharAt == '\t' || iCharWidth > i) {
                    iCharWidth = 0;
                    if (cCharAt != '\t') {
                        i2--;
                    }
                    if (stringBuffer2.length() > 0 || cCharAt == '\t') {
                        vector.addElement(new ah((byte) 0, bCharAt, stringBuffer2.toString()));
                        stringBuffer2.delete(0, stringBuffer2.length());
                    }
                    vector2.addElement(new d(vector));
                    vector.removeAllElements();
                } else {
                    stringBuffer2.append(cCharAt);
                }
            }
            i2++;
        }
        if (iCharWidth > 0) {
            if (stringBuffer2.length() > 0) {
                vector.addElement(new ah((byte) 0, bCharAt, stringBuffer2.toString()));
            }
            vector2.addElement(new d(vector));
        }
        d[] dVarArr = new d[vector2.size()];
        vector2.copyInto(dVarArr);
        return dVarArr;
    }
}

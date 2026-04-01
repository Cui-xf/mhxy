package p000;

import com.yinhan.kjava.main.RunnableC0066a;
import java.util.Vector;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

/* renamed from: d */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-4234804660425969496/classes.dex */
public final class C0072d {

    /* renamed from: a */
    private int f2242a;

    /* renamed from: b */
    private C0008ah[] f2243b;

    private C0072d(Vector vector) {
        this.f2243b = new C0008ah[vector.size()];
        vector.copyInto(this.f2243b);
        for (int i = 0; i < this.f2243b.length; i++) {
            if (i == 0 || this.f2242a < this.f2243b[i].m42b()) {
                this.f2242a = this.f2243b[i].m42b();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x018b, code lost:
    
        r5 = r1;
        r2 = r6;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0072d[] m1551a(String str, int i, Font font, char c) throws NumberFormatException {
        int i2;
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
        int i3 = 0;
        while (i3 < str.length()) {
            char cCharAt = str.charAt(i3);
            short s = -1;
            if (cCharAt == '<') {
                stringBuffer.delete(0, stringBuffer.length());
                char c3 = ' ';
                int i4 = i3 + 1;
                while (true) {
                    i2 = i4;
                    if (i2 < Math.min(i3 + 1 + 6, str.length())) {
                        char cCharAt2 = str.charAt(i2);
                        if (i2 == i3 + 1 && (cCharAt2 == '/' || cCharAt2 == 'f' || cCharAt2 == 'i')) {
                            c3 = cCharAt2;
                        } else if (cCharAt2 == '>' && stringBuffer.length() > 0) {
                            c2 = c3;
                            s = Short.parseShort(stringBuffer.toString());
                        } else if (cCharAt2 >= '0' && cCharAt2 <= '9') {
                            stringBuffer.append(cCharAt2);
                        }
                        i4 = i2 + 1;
                    }
                }
            } else {
                i2 = i3;
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
                    vector.addElement(new C0008ah((byte) 0, bCharAt, stringBuffer2.toString()));
                    stringBuffer2.delete(0, stringBuffer2.length());
                }
                bCharAt = (byte) (stringBuffer3.length() > 0 ? stringBuffer3.charAt(stringBuffer3.length() - 1) - '0' : -1);
                if (c2 == 'f' || c2 == 'i') {
                    RunnableC0066a.f2100af.m1001e(String.valueOf((int) s));
                    C0033bf c0033bfM264b = C0015ao.m264b(s);
                    int i5 = c0033bfM264b == null ? 0 : c0033bfM264b.f599b;
                    int i6 = iCharWidth + i5;
                    if (i6 > i) {
                        vector2.addElement(new C0072d(vector));
                        vector.removeAllElements();
                    } else {
                        i5 = i6;
                    }
                    vector.addElement(new C0008ah((byte) 1, s, null));
                    iCharWidth = i5;
                }
            } else {
                iCharWidth += font.charWidth(cCharAt);
                if (cCharAt == '\t' || iCharWidth > i) {
                    iCharWidth = 0;
                    int i7 = cCharAt != '\t' ? i2 - 1 : i2;
                    if (stringBuffer2.length() > 0 || cCharAt == '\t') {
                        vector.addElement(new C0008ah((byte) 0, bCharAt, stringBuffer2.toString()));
                        stringBuffer2.delete(0, stringBuffer2.length());
                    }
                    vector2.addElement(new C0072d(vector));
                    vector.removeAllElements();
                    i2 = i7;
                } else {
                    stringBuffer2.append(cCharAt);
                }
            }
            i3 = i2 + 1;
        }
        if (iCharWidth > 0) {
            if (stringBuffer2.length() > 0) {
                vector.addElement(new C0008ah((byte) 0, bCharAt, stringBuffer2.toString()));
            }
            vector2.addElement(new C0072d(vector));
        }
        C0072d[] c0072dArr = new C0072d[vector2.size()];
        vector2.copyInto(c0072dArr);
        return c0072dArr;
    }

    /* renamed from: a */
    public final int m1552a() {
        return this.f2242a;
    }

    /* renamed from: a */
    public final void m1553a(Graphics graphics, int i, int i2, int i3) {
        int iM40a = i;
        for (int i4 = 0; i4 < this.f2243b.length; i4++) {
            this.f2243b[i4].m41a(graphics, iM40a, i2, this.f2242a, 20);
            iM40a += this.f2243b[i4].m40a();
        }
    }
}

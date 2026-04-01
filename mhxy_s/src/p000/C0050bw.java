package p000;

import java.util.Vector;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

/* renamed from: bw */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-4234804660425969496/classes.dex */
public final class C0050bw {

    /* renamed from: a */
    public short f1789a;

    /* renamed from: b */
    private C0073e[] f1790b;

    /* renamed from: c */
    private short f1791c;

    /* renamed from: d */
    private int f1792d = 0;

    public C0050bw(String str, short s) throws NumberFormatException {
        this.f1791c = s;
        m1010a(str);
    }

    /* renamed from: a */
    private int m1007a(String str, int i, C0016ap[] c0016apArr, Vector vector, Vector vector2) {
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = -1;
        while (i3 < str.length()) {
            int i6 = i + i3;
            int i7 = 0;
            while (true) {
                if (i7 >= c0016apArr.length) {
                    i2 = -1;
                    break;
                }
                if (i6 >= c0016apArr[i7].f363b && i6 <= c0016apArr[i7].f364c) {
                    i2 = c0016apArr[i7].f362a;
                    break;
                }
                i7++;
            }
            if (i2 != i5) {
                vector.addElement(str.substring(i4, i3));
                vector2.addElement(String.valueOf(i5));
                i4 = i3;
                i5 = i2;
            }
            i3++;
        }
        if (i3 == str.length()) {
            vector.addElement(str.substring(i4, str.length()));
            vector2.addElement(String.valueOf(i5));
        }
        return str.length() + i;
    }

    /* renamed from: a */
    private String m1008a(String str, Font font, int i) {
        int iStringWidth = font.stringWidth(str);
        return iStringWidth <= i ? str : m1008a(str.substring(0, (str.length() * i) / iStringWidth), font, i);
    }

    /* renamed from: a */
    private static short m1009a(StringBuffer stringBuffer) {
        short s = 0;
        int i = 0;
        while (true) {
            short s2 = s;
            if (i >= stringBuffer.length()) {
                return s2;
            }
            s = stringBuffer.charAt(i) != '\t' ? (short) (s2 + 1) : s2;
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x006e A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m1010a(String str) throws NumberFormatException {
        int i;
        int i2;
        int i3;
        int i4;
        Vector vector = new Vector();
        StringBuffer stringBuffer = new StringBuffer();
        int i5 = 0;
        C0016ap c0016ap = null;
        int i6 = 0;
        while (i5 < str.length()) {
            char cCharAt = str.charAt(i5);
            if (cCharAt != '<' || i5 + 1 >= str.length()) {
                stringBuffer.append(cCharAt);
                i = i5;
                i2 = i6;
            } else if (str.charAt(i5 + 1) == '/') {
                int i7 = i5 + 2;
                while (true) {
                    if (i7 >= str.length()) {
                        i4 = i7;
                        i = i5;
                        i2 = i6;
                        break;
                    }
                    if (str.charAt(i7) == '>') {
                        try {
                            int i8 = Integer.parseInt(str.substring(i5 + 2, i7));
                            if (c0016ap != null && i8 == c0016ap.f362a) {
                                c0016ap.f364c = (short) (m1009a(stringBuffer) - 1);
                                new C0016ap(this);
                                c0016ap = null;
                            }
                            i4 = i7;
                            i = i7;
                            i2 = i6;
                        } catch (Exception e) {
                            stringBuffer.append(str.substring(i5, i6 + 1));
                            i4 = 0;
                            i = i7;
                            i2 = i6;
                        }
                    } else {
                        if (str.charAt(i7) == '<') {
                            stringBuffer.append(str.substring(i5, i7 - 1));
                            i4 = i7;
                            i = i7;
                            i2 = i7;
                            break;
                        }
                        i7++;
                    }
                }
                if (i4 == str.length()) {
                    stringBuffer.append(str.substring(i5, i4));
                }
            } else {
                int i9 = i5 + 1;
                while (true) {
                    if (i9 >= str.length()) {
                        i3 = i9;
                        i = i5;
                        i2 = i6;
                        break;
                    }
                    if (str.charAt(i9) == '>') {
                        if (c0016ap != null) {
                            try {
                                c0016ap.f364c = (short) (m1009a(stringBuffer) - 1);
                                try {
                                    C0016ap c0016ap2 = new C0016ap(this, Integer.parseInt(str.substring(i5 + 1, i9)), m1009a(stringBuffer));
                                    i = (str.charAt(i9 + 1) == '[' || str.charAt(i9 + 3) != ']') ? i9 : i9 + 3;
                                    vector.addElement(c0016ap2);
                                    i3 = i9;
                                    c0016ap = c0016ap2;
                                    i2 = i9;
                                } catch (Exception e2) {
                                    i6 = i9;
                                    stringBuffer.append(str.substring(i5, i6 + 1));
                                    i3 = 0;
                                    i = i9;
                                    i2 = i6;
                                    if (i3 == str.length()) {
                                    }
                                    i5 = i + 1;
                                    i6 = i2;
                                }
                            } catch (Exception e3) {
                                stringBuffer.append(str.substring(i5, i6 + 1));
                                i3 = 0;
                                i = i9;
                                i2 = i6;
                                if (i3 == str.length()) {
                                }
                                i5 = i + 1;
                                i6 = i2;
                            }
                        } else {
                            C0016ap c0016ap22 = new C0016ap(this, Integer.parseInt(str.substring(i5 + 1, i9)), m1009a(stringBuffer));
                            if (str.charAt(i9 + 1) == '[') {
                                vector.addElement(c0016ap22);
                                i3 = i9;
                                c0016ap = c0016ap22;
                                i2 = i9;
                            }
                        }
                    } else {
                        if (str.charAt(i9) == '<') {
                            stringBuffer.append(str.substring(i5, i9 - 1));
                            i3 = i9;
                            i = i9;
                            i2 = i9;
                            break;
                        }
                        i9++;
                    }
                }
                if (i3 == str.length()) {
                    stringBuffer.append(str.substring(i5, i3));
                }
            }
            i5 = i + 1;
            i6 = i2;
        }
        if (c0016ap != null) {
            c0016ap.f364c = (short) (m1009a(stringBuffer) - 1);
        }
        C0016ap[] c0016apArr = new C0016ap[vector.size()];
        vector.copyInto(c0016apArr);
        m1011a(stringBuffer.toString(), c0016apArr);
        vector.removeAllElements();
    }

    /* renamed from: a */
    private void m1011a(String str, C0016ap[] c0016apArr) {
        Font font = C0088t.f2523i;
        int i = this.f1791c;
        if (str == null) {
            str = "";
        }
        Vector vector = new Vector();
        String[] strings = m1012a(str, "\t");
        for (int i1 = 0; i1 < strings.length; i1++) {
            String strSubstring = strings[i1];
            do {
                String strM1008a = m1008a(strSubstring, font, i);
                vector.addElement(strM1008a);
                strSubstring = strSubstring.substring(strM1008a.length());
            } while (strSubstring.length() != 0);
        }
        String[] strArr = new String[vector.size()];
        vector.copyInto(strArr);
        String[] strArrM1013a = m1013a(strArr);
        this.f1790b = new C0073e[strArrM1013a.length];
        Vector vector2 = new Vector();
        Vector vector3 = new Vector();
        int iM1007a = 0;
        for (int i2 = 0; i2 < strArrM1013a.length; i2++) {
            iM1007a = m1007a(strArrM1013a[i2], iM1007a, c0016apArr, vector2, vector3);
            String[] strArr2 = new String[vector2.size()];
            String[] strArr3 = new String[vector3.size()];
            vector2.copyInto(strArr2);
            vector3.copyInto(strArr3);
            this.f1790b[i2] = new C0073e(this, strArr2, strArr3);
            short sM1554a = this.f1790b[i2].m1554a();
            if (this.f1789a < sM1554a) {
                this.f1789a = sM1554a;
            }
            vector2.removeAllElements();
            vector3.removeAllElements();
        }
    }

    /* renamed from: a */
    private String[] m1012a(String str, String str2) {
        int iIndexOf;
        String[] strArrM1014a = new String[0];
        do {
            iIndexOf = str.indexOf(str2);
            if (iIndexOf < 0) {
                return m1014a(strArrM1014a, str);
            }
            strArrM1014a = m1014a(strArrM1014a, str.substring(0, iIndexOf));
            str = str.substring(str2.length() + iIndexOf);
        } while (iIndexOf >= 0);
        return strArrM1014a;
    }

    /* renamed from: a */
    private static String[] m1013a(String[] strArr) {
        Vector vector = new Vector();
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i] != null && !strArr[i].equals("")) {
                vector.addElement(strArr[i]);
            }
        }
        String[] strArr2 = new String[vector.size()];
        vector.copyInto(strArr2);
        return strArr2;
    }

    /* renamed from: a */
    private String[] m1014a(String[] strArr, String str) {
        if (str == null) {
            return strArr;
        }
        if (strArr == null) {
            return new String[]{str};
        }
        String[] strArr2 = new String[strArr.length + 1];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        strArr2[strArr2.length - 1] = str;
        return strArr2;
    }

    /* renamed from: a */
    public final short m1015a() {
        if (this.f1790b != null) {
            return (short) this.f1790b.length;
        }
        return (short) 0;
    }

    /* renamed from: a */
    public final void m1016a(Graphics graphics, int i, int i2) {
        if (this.f1790b == null) {
            return;
        }
        for (int i3 = 0; i3 < this.f1790b.length; i3++) {
            if (this.f1790b[i3] != null) {
                this.f1792d = 0;
                short sM1554a = this.f1790b[i3].m1554a();
                for (int i4 = 0; i4 < this.f1790b[i3].f2244a.length; i4++) {
                    graphics.setColor(this.f1790b[i3].f2245b[i4]);
                    graphics.drawString(this.f1790b[i3].f2244a[i4], (i - (sM1554a / 2)) + this.f1792d, (C0088t.f2524j * i3) + i2, 20);
                    this.f1792d += C0088t.f2523i.stringWidth(this.f1790b[i3].f2244a[i4]);
                }
            }
        }
    }

    /* renamed from: a */
    public final void m1017a(Graphics graphics, int i, int i2, int i3) {
        if (this.f1790b == null) {
            return;
        }
        for (int i4 = 0; i4 < this.f1790b.length; i4++) {
            if (this.f1790b[i4] != null) {
                this.f1792d = 0;
                for (int i5 = 0; i5 < this.f1790b[i4].f2244a.length; i5++) {
                    graphics.setColor(this.f1790b[i4].f2245b[i5]);
                    graphics.drawString(this.f1790b[i4].f2244a[i5], this.f1792d + i, (C0088t.f2524j * i4) + i2, i3);
                    this.f1792d += C0088t.f2523i.stringWidth(this.f1790b[i4].f2244a[i5]);
                }
            }
        }
    }

    /* renamed from: a */
    public final void m1018a(Graphics graphics, int i, int i2, int i3, int i4) {
        this.f1792d = 0;
        for (int i5 = 0; i5 < this.f1790b[i3].f2244a.length; i5++) {
            graphics.setColor(this.f1790b[i3].f2245b[i5]);
            graphics.drawString(this.f1790b[i3].f2244a[i5], this.f1792d + i, i2, i4);
            this.f1792d += C0088t.f2523i.stringWidth(this.f1790b[i3].f2244a[i5]);
        }
    }
}

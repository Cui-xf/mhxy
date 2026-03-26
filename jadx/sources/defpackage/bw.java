package defpackage;

import java.util.Vector;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

/* loaded from: java版梦回西游3区251011.jar:bw.class */
public final class bw {
    private e[] b;
    private short c;
    public short a;
    private int d = 0;

    public bw(String str, short s) throws NumberFormatException {
        this.c = s;
        a(str);
    }

    public final short a() {
        if (this.b != null) {
            return (short) this.b.length;
        }
        return (short) 0;
    }

    public final void a(Graphics graphics, int i, int i2, int i3) {
        if (this.b == null) {
            return;
        }
        for (int i4 = 0; i4 < this.b.length; i4++) {
            if (this.b[i4] != null) {
                this.d = 0;
                for (int i5 = 0; i5 < this.b[i4].a.length; i5++) {
                    graphics.setColor(this.b[i4].b[i5]);
                    graphics.drawString(this.b[i4].a[i5], i + this.d, i2 + (i4 * t.j), i3);
                    this.d += t.i.stringWidth(this.b[i4].a[i5]);
                }
            }
        }
    }

    public final void a(Graphics graphics, int i, int i2) {
        if (this.b == null) {
            return;
        }
        for (int i3 = 0; i3 < this.b.length; i3++) {
            if (this.b[i3] != null) {
                this.d = 0;
                short sA = this.b[i3].a();
                for (int i4 = 0; i4 < this.b[i3].a.length; i4++) {
                    graphics.setColor(this.b[i3].b[i4]);
                    graphics.drawString(this.b[i3].a[i4], (i - (sA / 2)) + this.d, i2 + (i3 * t.j), 20);
                    this.d += t.i.stringWidth(this.b[i3].a[i4]);
                }
            }
        }
    }

    public final void a(Graphics graphics, int i, int i2, int i3, int i4) {
        this.d = 0;
        for (int i5 = 0; i5 < this.b[i3].a.length; i5++) {
            graphics.setColor(this.b[i3].b[i5]);
            graphics.drawString(this.b[i3].a[i5], i + this.d, i2, i4);
            this.d += t.i.stringWidth(this.b[i3].a[i5]);
        }
    }

    private void a(String str) throws NumberFormatException {
        int i = 0;
        Vector vector = new Vector();
        StringBuffer stringBuffer = new StringBuffer();
        ap apVar = null;
        int i2 = 0;
        while (i2 < str.length()) {
            char cCharAt = str.charAt(i2);
            if (cCharAt != '<' || i2 + 1 >= str.length()) {
                stringBuffer.append(cCharAt);
            } else if (str.charAt(i2 + 1) == '/') {
                int i3 = i2;
                int i4 = i2 + 2;
                while (true) {
                    if (i4 >= str.length()) {
                        break;
                    }
                    if (str.charAt(i4) == '>') {
                        try {
                            int i5 = Integer.parseInt(str.substring(i2 + 2, i4));
                            if (apVar != null && i5 == apVar.a) {
                                apVar.c = (short) (a(stringBuffer) - 1);
                                new ap(this);
                                apVar = null;
                            }
                            i2 = i4;
                        } catch (Exception e) {
                            i2 = i4;
                            stringBuffer.append(str.substring(i3, i + 1));
                            i4 = 0;
                        }
                    } else {
                        if (str.charAt(i4) == '<') {
                            i = i4;
                            i2 = i4;
                            stringBuffer.append(str.substring(i3, i - 1));
                            break;
                        }
                        i4++;
                    }
                }
                if (i4 == str.length()) {
                    stringBuffer.append(str.substring(i3, i4));
                }
            } else {
                int i6 = i2;
                int i7 = i2 + 1;
                while (true) {
                    if (i7 >= str.length()) {
                        break;
                    }
                    if (str.charAt(i7) == '>') {
                        if (apVar != null) {
                            try {
                                apVar.c = (short) (a(stringBuffer) - 1);
                            } catch (Exception unused) {
                                i2 = i7;
                                stringBuffer.append(str.substring(i6, i + 1));
                                i7 = 0;
                            }
                        }
                        i = i7;
                        ap apVar2 = new ap(this, Integer.parseInt(str.substring(i2 + 1, i)), a(stringBuffer));
                        i2 = (str.charAt(i7 + 1) == '[' && str.charAt(i7 + 3) == ']') ? i7 + 3 : i7;
                        vector.addElement(apVar2);
                        apVar = apVar2;
                    } else {
                        if (str.charAt(i7) == '<') {
                            i = i7;
                            i2 = i7;
                            stringBuffer.append(str.substring(i6, i - 1));
                            break;
                        }
                        i7++;
                    }
                }
                if (i7 == str.length()) {
                    stringBuffer.append(str.substring(i6, i7));
                }
            }
            i2++;
        }
        if (apVar != null) {
            apVar.c = (short) (a(stringBuffer) - 1);
        }
        ap[] apVarArr = new ap[vector.size()];
        vector.copyInto(apVarArr);
        a(stringBuffer.toString(), apVarArr);
        vector.removeAllElements();
    }

    private static short a(StringBuffer stringBuffer) {
        short s = 0;
        for (int i = 0; i < stringBuffer.length(); i++) {
            if (stringBuffer.charAt(i) != '\t') {
                s = (short) (s + 1);
            }
        }
        return s;
    }

    private void a(String str, ap[] apVarArr) {
        String strSubstring;
        Font font = t.i;
        int i = this.c;
        String str2 = str;
        if (str2 == null) {
            str2 = "";
        }
        Vector vector = new Vector();
        for (String str3 : a(str2, "\t")) {
            do {
                String strA = a(str3, font, i);
                vector.addElement(strA);
                strSubstring = str3.substring(strA.length());
                str3 = strSubstring;
            } while (strSubstring.length() != 0);
        }
        String[] strArr = new String[vector.size()];
        vector.copyInto(strArr);
        String[] strArrA = a(strArr);
        int iA = 0;
        this.b = new e[strArrA.length];
        Vector vector2 = new Vector();
        Vector vector3 = new Vector();
        for (int i2 = 0; i2 < strArrA.length; i2++) {
            iA = a(strArrA[i2], iA, apVarArr, vector2, vector3);
            String[] strArr2 = new String[vector2.size()];
            String[] strArr3 = new String[vector3.size()];
            vector2.copyInto(strArr2);
            vector3.copyInto(strArr3);
            this.b[i2] = new e(this, strArr2, strArr3);
            short sA = this.b[i2].a();
            if (this.a < sA) {
                this.a = sA;
            }
            vector2.removeAllElements();
            vector3.removeAllElements();
        }
    }

    private int a(String str, int i, ap[] apVarArr, Vector vector, Vector vector2) {
        int i2;
        int i3 = -1;
        int i4 = 0;
        int i5 = 0;
        while (i5 < str.length()) {
            int i6 = i + i5;
            int i7 = 0;
            while (true) {
                if (i7 >= apVarArr.length) {
                    i2 = -1;
                    break;
                }
                if (i6 >= apVarArr[i7].b && i6 <= apVarArr[i7].c) {
                    i2 = apVarArr[i7].a;
                    break;
                }
                i7++;
            }
            int i8 = i2;
            if (i2 != i3) {
                vector.addElement(str.substring(i4, i5));
                vector2.addElement(String.valueOf(i3));
                i4 = i5;
                i3 = i8;
            }
            i5++;
        }
        if (i5 == str.length()) {
            vector.addElement(str.substring(i4, str.length()));
            vector2.addElement(String.valueOf(i3));
        }
        return i + str.length();
    }

    private String[] a(String str, String str2) {
        String[] strArrA = new String[0];
        while (true) {
            int iIndexOf = str.indexOf(str2);
            if (iIndexOf < 0) {
                strArrA = a(strArrA, str);
                break;
            }
            strArrA = a(strArrA, str.substring(0, iIndexOf));
            str = str.substring(iIndexOf + str2.length());
            if (iIndexOf < 0) {
                break;
            }
        }
        return strArrA;
    }

    private String[] a(String[] strArr, String str) {
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

    private String a(String str, Font font, int i) {
        int iStringWidth = font.stringWidth(str);
        return iStringWidth <= i ? str : a(str.substring(0, (str.length() * i) / iStringWidth), font, i);
    }

    private static String[] a(String[] strArr) {
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
}

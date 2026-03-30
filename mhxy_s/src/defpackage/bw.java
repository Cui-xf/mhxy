package defpackage;

import java.util.Vector;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-8105993946875401281/classes.dex */
public final class bw {
    public short a;
    private e[] b;
    private short c;
    private int d = 0;

    public bw(String str, short s) throws NumberFormatException {
        this.c = s;
        a(str);
    }

    private int a(String str, int i, ap[] apVarArr, Vector vector, Vector vector2) {
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = -1;
        while (i3 < str.length()) {
            int i6 = i + i3;
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

    private String a(String str, Font font, int i) {
        int iStringWidth = font.stringWidth(str);
        return iStringWidth <= i ? str : a(str.substring(0, (str.length() * i) / iStringWidth), font, i);
    }

    private static short a(StringBuffer stringBuffer) {
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(java.lang.String r14) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bw.a(java.lang.String):void");
    }

    private void a(String str, ap[] apVarArr) {
        Font font = t.i;
        int i = this.c;
        if (str == null) {
            str = "";
        }
        Vector vector = new Vector();
        for (String strSubstring : a(str, "\t")) {
            do {
                String strA = a(strSubstring, font, i);
                vector.addElement(strA);
                strSubstring = strSubstring.substring(strA.length());
            } while (strSubstring.length() != 0);
        }
        String[] strArr = new String[vector.size()];
        vector.copyInto(strArr);
        String[] strArrA = a(strArr);
        this.b = new e[strArrA.length];
        Vector vector2 = new Vector();
        Vector vector3 = new Vector();
        int iA = 0;
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

    private String[] a(String str, String str2) {
        int iIndexOf;
        String[] strArrA = new String[0];
        do {
            iIndexOf = str.indexOf(str2);
            if (iIndexOf < 0) {
                return a(strArrA, str);
            }
            strArrA = a(strArrA, str.substring(0, iIndexOf));
            str = str.substring(str2.length() + iIndexOf);
        } while (iIndexOf >= 0);
        return strArrA;
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

    public final short a() {
        if (this.b != null) {
            return (short) this.b.length;
        }
        return (short) 0;
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
                    graphics.drawString(this.b[i3].a[i4], (i - (sA / 2)) + this.d, (t.j * i3) + i2, 20);
                    this.d += t.i.stringWidth(this.b[i3].a[i4]);
                }
            }
        }
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
                    graphics.drawString(this.b[i4].a[i5], this.d + i, (t.j * i4) + i2, i3);
                    this.d += t.i.stringWidth(this.b[i4].a[i5]);
                }
            }
        }
    }

    public final void a(Graphics graphics, int i, int i2, int i3, int i4) {
        this.d = 0;
        for (int i5 = 0; i5 < this.b[i3].a.length; i5++) {
            graphics.setColor(this.b[i3].b[i5]);
            graphics.drawString(this.b[i3].a[i5], this.d + i, i2, i4);
            this.d += t.i.stringWidth(this.b[i3].a[i5]);
        }
    }
}

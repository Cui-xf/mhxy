package defpackage;

import java.util.Vector;

/* loaded from: java版梦回西游3区251011.jar:bh.class */
public final class bh {
    private j[] a;
    private short b = 160;

    public bh(String str, short s) throws NumberFormatException {
        a(str);
    }

    private void a(String str) throws NumberFormatException {
        int i = 0;
        Vector vector = new Vector();
        StringBuffer stringBuffer = new StringBuffer();
        ad adVar = null;
        int i2 = 0;
        while (i2 < str.length()) {
            char cCharAt = str.charAt(i2);
            if (cCharAt != '<') {
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
                            if (adVar != null && i5 == adVar.a) {
                                adVar.d = (short) (a(stringBuffer) - 1);
                                new ad(this);
                                adVar = null;
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
                        if (adVar != null) {
                            try {
                                adVar.d = (short) (a(stringBuffer) - 1);
                            } catch (Exception unused) {
                                i2 = i7;
                                stringBuffer.append(str.substring(i6, i + 1));
                                i7 = 0;
                            }
                        }
                        i = i7;
                        ad adVar2 = new ad(this, Integer.parseInt(str.substring(i2 + 1, i)), a(stringBuffer));
                        if (str.charAt(i7 + 1) == '[' && str.charAt(i7 + 3) == ']') {
                            try {
                                adVar2.b = Integer.parseInt(new StringBuffer().append("").append(str.charAt(i7 + 2)).toString());
                                i2 = i7 + 3;
                            } catch (Exception unused2) {
                            }
                            vector.addElement(adVar2);
                            adVar = adVar2;
                        } else {
                            adVar2.b = 0;
                            i2 = i7;
                            vector.addElement(adVar2);
                            adVar = adVar2;
                        }
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
        if (adVar != null) {
            adVar.d = (short) (a(stringBuffer) - 1);
        }
        ad[] adVarArr = new ad[vector.size()];
        vector.copyInto(adVarArr);
        a(stringBuffer.toString(), adVarArr);
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

    private void a(String str, ad[] adVarArr) {
        String[] strArrA = ca.a(str, t.i, this.b, "\t");
        int iA = 0;
        this.a = new j[strArrA.length];
        Vector vector = new Vector();
        Vector vector2 = new Vector();
        Vector vector3 = new Vector();
        for (int i = 0; i < strArrA.length; i++) {
            iA = a(strArrA[i], iA, adVarArr, vector, vector2, vector3);
            String[] strArr = new String[vector.size()];
            String[] strArr2 = new String[vector2.size()];
            String[] strArr3 = new String[vector3.size()];
            vector.copyInto(strArr);
            vector2.copyInto(strArr2);
            vector3.copyInto(strArr3);
            this.a[i] = new j(this, strArr, strArr2, strArr3);
            vector.removeAllElements();
            vector2.removeAllElements();
            vector3.removeAllElements();
        }
    }

    private int a(String str, int i, ad[] adVarArr, Vector vector, Vector vector2, Vector vector3) {
        int i2;
        int i3;
        int i4 = -1;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i7 < str.length()) {
            int i8 = i + i7;
            int i9 = 0;
            while (true) {
                if (i9 >= adVarArr.length) {
                    i2 = -1;
                    break;
                }
                if (i8 >= adVarArr[i9].c && i8 <= adVarArr[i9].d) {
                    i2 = adVarArr[i9].a;
                    break;
                }
                i9++;
            }
            int i10 = i2;
            int i11 = 0;
            while (true) {
                if (i11 >= adVarArr.length) {
                    i3 = 0;
                    break;
                }
                if (i8 >= adVarArr[i11].c && i8 <= adVarArr[i11].d) {
                    i3 = adVarArr[i11].b;
                    break;
                }
                i11++;
            }
            int i12 = i3;
            if (i4 != i10) {
                vector.addElement(str.substring(i5, i7));
                vector2.addElement(String.valueOf(i4));
                vector3.addElement(String.valueOf(i6));
                i5 = i7;
                i4 = i10;
                i6 = i12;
            }
            i7++;
        }
        if (i7 == str.length()) {
            vector.addElement(str.substring(i5, str.length()));
            vector2.addElement(String.valueOf(i4));
            vector3.addElement(String.valueOf(i6));
        }
        return i + str.length();
    }
}

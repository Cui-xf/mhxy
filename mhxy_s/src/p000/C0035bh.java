package p000;

import java.util.Vector;

/* renamed from: bh */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-4234804660425969496/classes.dex */
public final class C0035bh {

    /* renamed from: a */
    private C0078j[] f664a;

    /* renamed from: b */
    private short f665b = 160;

    public C0035bh(String str, short s) throws NumberFormatException {
        m678a(str);
    }

    /* renamed from: a */
    private int m676a(String str, int i, C0004ad[] c0004adArr, Vector vector, Vector vector2, Vector vector3) {
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
                if (i9 >= c0004adArr.length) {
                    i2 = -1;
                    break;
                }
                if (i8 >= c0004adArr[i9].f32c && i8 <= c0004adArr[i9].f33d) {
                    i2 = c0004adArr[i9].f30a;
                    break;
                }
                i9++;
            }
            int i10 = 0;
            while (true) {
                if (i10 >= c0004adArr.length) {
                    i3 = 0;
                    break;
                }
                if (i8 >= c0004adArr[i10].f32c && i8 <= c0004adArr[i10].f33d) {
                    i3 = c0004adArr[i10].f31b;
                    break;
                }
                i10++;
            }
            if (i4 != i2) {
                vector.addElement(str.substring(i5, i7));
                vector2.addElement(String.valueOf(i4));
                vector3.addElement(String.valueOf(i6));
                i6 = i3;
                i5 = i7;
                i4 = i2;
            }
            i7++;
        }
        if (i7 == str.length()) {
            vector.addElement(str.substring(i5, str.length()));
            vector2.addElement(String.valueOf(i4));
            vector3.addElement(String.valueOf(i6));
        }
        return str.length() + i;
    }

    /* renamed from: a */
    private static short m677a(StringBuffer stringBuffer) {
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

    /* JADX WARN: Removed duplicated region for block: B:51:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0066 A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m678a(String str) throws NumberFormatException {
        int i;
        int i2;
        int i3;
        C0004ad c0004ad;
        int i4;
        Vector vector = new Vector();
        StringBuffer stringBuffer = new StringBuffer();
        int i5 = 0;
        C0004ad c0004ad2 = null;
        int i6 = 0;
        while (i5 < str.length()) {
            char cCharAt = str.charAt(i5);
            if (cCharAt != '<') {
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
                            if (c0004ad2 != null && i8 == c0004ad2.f30a) {
                                c0004ad2.f33d = (short) (m677a(stringBuffer) - 1);
                                new C0004ad(this);
                                c0004ad2 = null;
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
                        if (c0004ad2 != null) {
                            try {
                                c0004ad2.f33d = (short) (m677a(stringBuffer) - 1);
                                try {
                                    c0004ad = new C0004ad(this, Integer.parseInt(str.substring(i5 + 1, i9)), m677a(stringBuffer));
                                    if (str.charAt(i9 + 1) == '[' || str.charAt(i9 + 3) != ']') {
                                        c0004ad.f31b = 0;
                                        i = i9;
                                        vector.addElement(c0004ad);
                                        i3 = i9;
                                        c0004ad2 = c0004ad;
                                        i2 = i9;
                                    } else {
                                        try {
                                            c0004ad.f31b = Integer.parseInt(new StringBuffer().append("").append(str.charAt(i9 + 2)).toString());
                                            i = i9 + 3;
                                        } catch (Exception e2) {
                                        }
                                        vector.addElement(c0004ad);
                                        i3 = i9;
                                        c0004ad2 = c0004ad;
                                        i2 = i9;
                                    }
                                } catch (Exception e3) {
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
                            } catch (Exception e4) {
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
                            c0004ad = new C0004ad(this, Integer.parseInt(str.substring(i5 + 1, i9)), m677a(stringBuffer));
                            if (str.charAt(i9 + 1) == '[') {
                                c0004ad.f31b = 0;
                                i = i9;
                                vector.addElement(c0004ad);
                                i3 = i9;
                                c0004ad2 = c0004ad;
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
        if (c0004ad2 != null) {
            c0004ad2.f33d = (short) (m677a(stringBuffer) - 1);
        }
        C0004ad[] c0004adArr = new C0004ad[vector.size()];
        vector.copyInto(c0004adArr);
        m679a(stringBuffer.toString(), c0004adArr);
        vector.removeAllElements();
    }

    /* renamed from: a */
    private void m679a(String str, C0004ad[] c0004adArr) {
        String[] strArrM1311a = C0055ca.m1311a(str, C0088t.f2523i, this.f665b, "\t");
        this.f664a = new C0078j[strArrM1311a.length];
        Vector vector = new Vector();
        Vector vector2 = new Vector();
        Vector vector3 = new Vector();
        int iM676a = 0;
        for (int i = 0; i < strArrM1311a.length; i++) {
            iM676a = m676a(strArrM1311a[i], iM676a, c0004adArr, vector, vector2, vector3);
            String[] strArr = new String[vector.size()];
            String[] strArr2 = new String[vector2.size()];
            String[] strArr3 = new String[vector3.size()];
            vector.copyInto(strArr);
            vector2.copyInto(strArr2);
            vector3.copyInto(strArr3);
            this.f664a[i] = new C0078j(this, strArr, strArr2, strArr3);
            vector.removeAllElements();
            vector2.removeAllElements();
            vector3.removeAllElements();
        }
    }
}

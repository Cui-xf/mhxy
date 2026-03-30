package defpackage;

import java.util.Vector;

/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-8105993946875401281/classes.dex */
public final class bh {
    private j[] a;
    private short b = 160;

    public bh(String str, short s) throws NumberFormatException {
        a(str);
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
            int i10 = 0;
            while (true) {
                if (i10 >= adVarArr.length) {
                    i3 = 0;
                    break;
                }
                if (i8 >= adVarArr[i10].c && i8 <= adVarArr[i10].d) {
                    i3 = adVarArr[i10].b;
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

    /* JADX WARN: Removed duplicated region for block: B:51:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0066 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(java.lang.String r14) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bh.a(java.lang.String):void");
    }

    private void a(String str, ad[] adVarArr) {
        String[] strArrA = ca.a(str, t.i, this.b, "\t");
        this.a = new j[strArrA.length];
        Vector vector = new Vector();
        Vector vector2 = new Vector();
        Vector vector3 = new Vector();
        int iA = 0;
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
}

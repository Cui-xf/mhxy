package defpackage;

import java.util.Enumeration;
import java.util.Vector;

/* loaded from: java版梦回西游3区251011.jar:z.class */
public final class z {
    public static boolean a(String str) {
        return str == null || "".equals(str.trim());
    }

    public static boolean b(String str) {
        if (str != null) {
            str = str.trim();
        }
        return (str == null || "".equals(str)) ? false : true;
    }

    public static boolean c(String str) {
        if (!b(str)) {
            return true;
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (!((cCharAt >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z') || (cCharAt >= '0' && cCharAt <= '9'))) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(String str) {
        boolean z = false;
        if (b(str)) {
            z = true;
            for (int i = 0; i < str.length(); i++) {
                if (!a(str.charAt(i))) {
                    return false;
                }
            }
        }
        return z;
    }

    public static boolean a(String str, int i, int i2) {
        boolean z = false;
        if (b(str)) {
            z = str.trim().length() >= i && str.trim().length() <= i2;
        }
        return z;
    }

    public static boolean e(String str) {
        boolean z = false;
        if (str != null && str.trim().length() == 11) {
            z = true;
            for (int i = 0; i < str.length(); i++) {
                if (!a(str.charAt(i))) {
                    return false;
                }
            }
        }
        return z;
    }

    public static int f(String str) {
        if (str == null) {
            return 0;
        }
        try {
            if ("".equals(str)) {
                return 0;
            }
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return 0;
        }
    }

    public static String[] a(String str, char c) {
        String[] strArr = null;
        if (b(str)) {
            char[] charArray = str.toCharArray();
            int i = 0;
            Vector vector = new Vector();
            for (int i2 = 0; i2 < charArray.length; i2++) {
                if (':' == charArray[i2] && i2 == charArray.length - 1 && i != 0) {
                    vector.addElement("");
                } else if (':' == charArray[i2] && i2 == charArray.length - 1) {
                    vector.addElement("");
                    vector.addElement("");
                } else if (':' == charArray[i2]) {
                    vector.addElement(str.substring(i, i2));
                    i = i2 + 1;
                } else if (i != 0 && i2 == charArray.length - 1) {
                    vector.addElement(str.substring(i, charArray.length));
                } else if (i == 0 && i2 == charArray.length - 1) {
                    vector.addElement(str);
                }
            }
            strArr = new String[vector.size()];
            int i3 = 0;
            Enumeration enumerationElements = vector.elements();
            while (enumerationElements.hasMoreElements()) {
                strArr[i3] = (String) enumerationElements.nextElement();
                i3++;
            }
        }
        return strArr;
    }

    private static boolean a(char c) {
        return c >= '0' && c <= '9';
    }
}

package defpackage;

import java.util.Enumeration;
import java.util.Vector;

/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-8105993946875401281/classes.dex */
public final class z {
    private static boolean a(char c) {
        return c >= '0' && c <= '9';
    }

    public static boolean a(String str) {
        return str == null || "".equals(str.trim());
    }

    public static boolean a(String str, int i, int i2) {
        return b(str) && str.trim().length() >= i && str.trim().length() <= i2;
    }

    public static String[] a(String str, char c) {
        int i = 0;
        if (!b(str)) {
            return null;
        }
        char[] charArray = str.toCharArray();
        Vector vector = new Vector();
        int i2 = 0;
        for (int i3 = 0; i3 < charArray.length; i3++) {
            if (':' == charArray[i3] && i3 == charArray.length - 1 && i2 != 0) {
                vector.addElement("");
            } else if (':' == charArray[i3] && i3 == charArray.length - 1) {
                vector.addElement("");
                vector.addElement("");
            } else if (':' == charArray[i3]) {
                vector.addElement(str.substring(i2, i3));
                i2 = i3 + 1;
            } else if (i2 != 0 && i3 == charArray.length - 1) {
                vector.addElement(str.substring(i2, charArray.length));
            } else if (i2 == 0 && i3 == charArray.length - 1) {
                vector.addElement(str);
            }
        }
        String[] strArr = new String[vector.size()];
        Enumeration enumerationElements = vector.elements();
        while (enumerationElements.hasMoreElements()) {
            strArr[i] = (String) enumerationElements.nextElement();
            i++;
        }
        return strArr;
    }

    public static boolean b(String str) {
        if (str != null) {
            str = str.trim();
        }
        return (str == null || "".equals(str)) ? false : true;
    }

    public static boolean c(String str) {
        if (b(str)) {
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if (!((cCharAt >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z') || (cCharAt >= '0' && cCharAt <= '9'))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean d(String str) {
        if (!b(str)) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!a(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean e(String str) {
        if (str == null || str.trim().length() != 11) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!a(str.charAt(i))) {
                return false;
            }
        }
        return true;
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
        } catch (Exception e) {
            return 0;
        }
    }
}

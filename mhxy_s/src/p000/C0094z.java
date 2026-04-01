package p000;

import java.util.Enumeration;
import java.util.Vector;

/* renamed from: z */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-5080095226433994817/classes.dex */
public final class C0094z {
    /* renamed from: a */
    private static boolean m1715a(char c) {
        return c >= '0' && c <= '9';
    }

    /* renamed from: a */
    public static boolean m1716a(String str) {
        return str == null || "".equals(str.trim());
    }

    /* renamed from: a */
    public static boolean m1717a(String str, int i, int i2) {
        return m1719b(str) && str.trim().length() >= i && str.trim().length() <= i2;
    }

    /* renamed from: a */
    public static String[] m1718a(String str, char c) {
        int i = 0;
        if (!m1719b(str)) {
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

    /* renamed from: b */
    public static boolean m1719b(String str) {
        if (str != null) {
            str = str.trim();
        }
        return (str == null || "".equals(str)) ? false : true;
    }

    /* renamed from: c */
    public static boolean m1720c(String str) {
        if (m1719b(str)) {
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if (!((cCharAt >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z') || (cCharAt >= '0' && cCharAt <= '9'))) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m1721d(String str) {
        if (!m1719b(str)) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!m1715a(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m1722e(String str) {
        if (str == null || str.trim().length() != 11) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!m1715a(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public static int m1723f(String str) {
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

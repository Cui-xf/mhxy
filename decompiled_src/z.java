/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

public final class z {
    public static boolean a(String string) {
        return string == null || "".equals(string.trim());
    }

    public static boolean b(String string) {
        if (string != null) {
            string = string.trim();
        }
        return string != null && !"".equals(string);
    }

    public static boolean c(String string) {
        if (z.b(string)) {
            for (int i2 = 0; i2 < string.length(); ++i2) {
                char c2 = string.charAt(i2);
                if (c2 >= 'a' && c2 <= 'z' || c2 >= 'A' && c2 <= 'Z' || c2 >= '0' && c2 <= '9') continue;
                return false;
            }
        }
        return true;
    }

    public static boolean d(String string) {
        boolean bl2 = false;
        if (z.b(string)) {
            bl2 = true;
            for (int i2 = 0; i2 < string.length(); ++i2) {
                if (z.a(string.charAt(i2))) continue;
                return false;
            }
        }
        return bl2;
    }

    public static boolean a(String string, int n2, int n3) {
        boolean bl2 = false;
        if (z.b(string)) {
            bl2 = string.trim().length() >= n2 && string.trim().length() <= n3;
        }
        return bl2;
    }

    public static boolean e(String string) {
        boolean bl2 = false;
        if (string != null && string.trim().length() == 11) {
            bl2 = true;
            for (int i2 = 0; i2 < string.length(); ++i2) {
                if (z.a(string.charAt(i2))) continue;
                return false;
            }
        }
        return bl2;
    }

    public static int f(String string) {
        try {
            if (string == null || "".equals(string)) {
                return 0;
            }
            return Integer.parseInt(string);
        }
        catch (Exception exception) {
            return 0;
        }
    }

    public static String[] a(String object, char c2) {
        Object[] objectArray = null;
        if (z.b((String)object)) {
            int n2;
            objectArray = ((String)object).toCharArray();
            int n3 = 0;
            Vector<Object> vector = new Vector<Object>();
            for (n2 = 0; n2 < objectArray.length; ++n2) {
                if (':' == objectArray[n2] && n2 == objectArray.length - 1 && n3 != 0) {
                    vector.addElement("");
                    continue;
                }
                if (':' == objectArray[n2] && n2 == objectArray.length - 1) {
                    vector.addElement("");
                    vector.addElement("");
                    continue;
                }
                if (':' == objectArray[n2]) {
                    vector.addElement(((String)object).substring(n3, n2));
                    n3 = n2 + 1;
                    continue;
                }
                if (n3 != 0 && n2 == objectArray.length - 1) {
                    vector.addElement(((String)object).substring(n3, objectArray.length));
                    continue;
                }
                if (n3 != 0 || n2 != objectArray.length - 1) continue;
                vector.addElement(object);
            }
            objectArray = new String[vector.size()];
            n2 = 0;
            object = vector.elements();
            while (object.hasMoreElements()) {
                objectArray[n2] = (char)((String)object.nextElement());
                ++n2;
            }
        }
        return objectArray;
    }

    private static boolean a(char c2) {
        return c2 >= '0' && c2 <= '9';
    }
}


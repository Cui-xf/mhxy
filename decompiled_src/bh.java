/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

public final class bh {
    private j[] a;
    private short b = (short)160;

    public bh(String string, short s2) {
        this.a(string);
    }

    private void a(String string) {
        int n2 = 0;
        int n3 = 0;
        Vector<ad> vector = new Vector<ad>();
        StringBuffer stringBuffer = new StringBuffer();
        ad ad2 = null;
        ad ad3 = null;
        int n4 = 0;
        for (n4 = 0; n4 < string.length(); ++n4) {
            n2 = string.charAt(n4);
            if (n2 == 60) {
                int n5;
                if (string.charAt(n4 + 1) == '/') {
                    n2 = n4;
                    n5 = 0;
                    for (n5 = n4 + 2; n5 < string.length(); ++n5) {
                        if (string.charAt(n5) == '>') {
                            try {
                                n4 = Integer.parseInt(string.substring(n4 + 2, n5));
                                if (ad3 != null && n4 == ad3.a) {
                                    ad3.d = (short)(bh.a(stringBuffer) - 1);
                                    ad3 = new ad(this);
                                    ad3 = null;
                                }
                                n4 = n5;
                            }
                            catch (Exception exception) {
                                n4 = n5;
                                stringBuffer.append(string.substring(n2, n3 + 1));
                                n5 = 0;
                            }
                            break;
                        }
                        if (string.charAt(n5) != '<') continue;
                        n3 = n5;
                        n4 = n5;
                        stringBuffer.append(string.substring(n2, n3 - 1));
                        break;
                    }
                    if (n5 != string.length()) continue;
                    stringBuffer.append(string.substring(n2, n5));
                    continue;
                }
                n2 = n4;
                n5 = 0;
                for (n5 = n4 + 1; n5 < string.length(); ++n5) {
                    if (string.charAt(n5) == '>') {
                        try {
                            block17: {
                                if (ad3 != null) {
                                    ad3.d = (short)(bh.a(stringBuffer) - 1);
                                }
                                n3 = n5;
                                n4 = Integer.parseInt(string.substring(n4 + 1, n3));
                                ad2 = new ad(this, n4, bh.a(stringBuffer));
                                if (string.charAt(n5 + 1) == '[' && string.charAt(n5 + 3) == ']') {
                                    try {
                                        ad2.b = n4 = Integer.parseInt("" + string.charAt(n5 + 2));
                                        n4 = n5 + 3;
                                        break block17;
                                    }
                                    catch (Exception exception) {}
                                }
                                ad2.b = 0;
                                n4 = n5;
                            }
                            vector.addElement(ad2);
                            ad3 = ad2;
                        }
                        catch (Exception exception) {
                            n4 = n5;
                            stringBuffer.append(string.substring(n2, n3 + 1));
                            n5 = 0;
                        }
                        break;
                    }
                    if (string.charAt(n5) != '<') continue;
                    n3 = n5;
                    n4 = n5;
                    stringBuffer.append(string.substring(n2, n3 - 1));
                    break;
                }
                if (n5 != string.length()) continue;
                stringBuffer.append(string.substring(n2, n5));
                continue;
            }
            stringBuffer.append((char)n2);
        }
        if (ad3 != null) {
            ad3.d = (short)(bh.a(stringBuffer) - 1);
        }
        Object[] objectArray = new ad[vector.size()];
        vector.copyInto(objectArray);
        this.a(stringBuffer.toString(), (ad[])objectArray);
        vector.removeAllElements();
    }

    private static short a(StringBuffer stringBuffer) {
        short s2 = 0;
        for (int i2 = 0; i2 < stringBuffer.length(); ++i2) {
            if (stringBuffer.charAt(i2) == '\t') continue;
            s2 = (short)(s2 + 1);
        }
        return s2;
    }

    private void a(String stringArray, ad[] adArray) {
        stringArray = ca.a((String)stringArray, t.i, (int)this.b, "\t");
        int n2 = 0;
        this.a = new j[stringArray.length];
        Vector vector = new Vector();
        Vector vector2 = new Vector();
        Vector vector3 = new Vector();
        Object[] objectArray = null;
        Object[] objectArray2 = null;
        Object[] objectArray3 = null;
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            n2 = this.a(stringArray[i2], n2, adArray, vector, vector2, vector3);
            objectArray = new String[vector.size()];
            objectArray2 = new String[vector2.size()];
            objectArray3 = new String[vector3.size()];
            vector.copyInto(objectArray);
            vector2.copyInto(objectArray2);
            vector3.copyInto(objectArray3);
            this.a[i2] = new j(this, (String[])objectArray, (String[])objectArray2, (String[])objectArray3);
            vector.removeAllElements();
            vector2.removeAllElements();
            vector3.removeAllElements();
        }
    }

    private int a(String string, int n2, ad[] adArray, Vector vector, Vector vector2, Vector vector3) {
        int n3 = 0;
        int n4 = 0;
        int n5 = -1;
        int n6 = 0;
        int n7 = 0;
        n3 = 0;
        int n8 = 0;
        for (n8 = 0; n8 < string.length(); ++n8) {
            block5: {
                int n9;
                int n10;
                int n11;
                int n12;
                ad[] adArray2;
                block4: {
                    n3 = n2 + n8;
                    adArray2 = adArray;
                    n12 = n3;
                    for (n11 = 0; n11 < adArray2.length; ++n11) {
                        if (n12 < adArray2[n11].c || n12 > adArray2[n11].d) continue;
                        n10 = adArray2[n11].a;
                        break block4;
                    }
                    n10 = -1;
                }
                n4 = n10;
                adArray2 = adArray;
                n12 = n3;
                for (n11 = 0; n11 < adArray2.length; ++n11) {
                    if (n12 < adArray2[n11].c || n12 > adArray2[n11].d) continue;
                    n9 = adArray2[n11].b;
                    break block5;
                }
                n9 = n3 = 0;
            }
            if (n5 == n4) continue;
            vector.addElement(string.substring(n6, n8));
            vector2.addElement(String.valueOf(n5));
            vector3.addElement(String.valueOf(n7));
            n6 = n8;
            n5 = n4;
            n7 = n3;
        }
        if (n8 == string.length()) {
            vector.addElement(string.substring(n6, string.length()));
            vector2.addElement(String.valueOf(n5));
            vector3.addElement(String.valueOf(n7));
        }
        return n2 + string.length();
    }
}


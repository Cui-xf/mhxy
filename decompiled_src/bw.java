/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Font
 *  javax.microedition.lcdui.Graphics
 */
import java.util.Vector;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

public final class bw {
    private e[] b;
    private short c;
    public short a;
    private int d = 0;

    public bw(String string, short s2) {
        this.c = s2;
        this.a(string);
    }

    public final short a() {
        if (this.b != null) {
            return (short)this.b.length;
        }
        return 0;
    }

    public final void a(Graphics graphics, int n2, int n3, int n4) {
        if (this.b == null) {
            return;
        }
        for (int i2 = 0; i2 < this.b.length; ++i2) {
            if (this.b[i2] == null) continue;
            this.d = 0;
            for (int i3 = 0; i3 < this.b[i2].a.length; ++i3) {
                graphics.setColor(this.b[i2].b[i3]);
                graphics.drawString(this.b[i2].a[i3], n2 + this.d, n3 + i2 * t.j, n4);
                this.d += t.i.stringWidth(this.b[i2].a[i3]);
            }
        }
    }

    public final void a(Graphics graphics, int n2, int n3) {
        if (this.b == null) {
            return;
        }
        short s2 = 0;
        for (int i2 = 0; i2 < this.b.length; ++i2) {
            if (this.b[i2] == null) continue;
            this.d = 0;
            s2 = this.b[i2].a();
            for (int i3 = 0; i3 < this.b[i2].a.length; ++i3) {
                graphics.setColor(this.b[i2].b[i3]);
                graphics.drawString(this.b[i2].a[i3], n2 - s2 / 2 + this.d, n3 + i2 * t.j, 20);
                this.d += t.i.stringWidth(this.b[i2].a[i3]);
            }
        }
    }

    public final void a(Graphics graphics, int n2, int n3, int n4, int n5) {
        this.d = 0;
        for (int i2 = 0; i2 < this.b[n4].a.length; ++i2) {
            graphics.setColor(this.b[n4].b[i2]);
            graphics.drawString(this.b[n4].a[i2], n2 + this.d, n3, n5);
            this.d += t.i.stringWidth(this.b[n4].a[i2]);
        }
    }

    private void a(String string) {
        int n2 = 0;
        int n3 = 0;
        Vector<ap> vector = new Vector<ap>();
        StringBuffer stringBuffer = new StringBuffer();
        Object var6_6 = null;
        ap ap2 = null;
        int n4 = 0;
        for (n4 = 0; n4 < string.length(); ++n4) {
            n2 = string.charAt(n4);
            if (n2 == 60 && n4 + 1 < string.length()) {
                int n5;
                if (string.charAt(n4 + 1) == '/') {
                    n2 = n4;
                    n5 = 0;
                    for (n5 = n4 + 2; n5 < string.length(); ++n5) {
                        if (string.charAt(n5) == '>') {
                            try {
                                int n6 = Integer.parseInt(string.substring(n4 + 2, n5));
                                if (ap2 != null && n6 == ap2.a) {
                                    ap2.c = (short)(bw.a(stringBuffer) - 1);
                                    ap2 = new ap(this);
                                    ap2 = null;
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
                            if (ap2 != null) {
                                ap2.c = (short)(bw.a(stringBuffer) - 1);
                            }
                            n3 = n5;
                            int n7 = Integer.parseInt(string.substring(n4 + 1, n3));
                            ap ap3 = new ap(this, n7, bw.a(stringBuffer));
                            n4 = string.charAt(n5 + 1) == '[' && string.charAt(n5 + 3) == ']' ? n5 + 3 : n5;
                            vector.addElement(ap3);
                            ap2 = ap3;
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
        if (ap2 != null) {
            ap2.c = (short)(bw.a(stringBuffer) - 1);
        }
        Object[] objectArray = new ap[vector.size()];
        vector.copyInto(objectArray);
        this.a(stringBuffer.toString(), (ap[])objectArray);
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

    private void a(String stringArray, ap[] apArray) {
        String string = "\t";
        short s2 = this.c;
        Object object = t.i;
        String[] stringArray2 = stringArray;
        stringArray = this;
        if (stringArray2 == null) {
            stringArray2 = "";
        }
        Object[] objectArray = new Vector();
        stringArray2 = super.a((String)stringArray2, string);
        for (int i2 = 0; i2 < stringArray2.length; ++i2) {
            String string2;
            String string3 = stringArray2[i2];
            do {
                string2 = super.a(string3, (Font)object, (int)s2);
                objectArray.addElement(string2);
            } while ((string3 = string3.substring(string2.length())).length() != 0);
        }
        Object[] objectArray2 = new String[objectArray.size()];
        objectArray.copyInto(objectArray2);
        stringArray = bw.a((String[])objectArray2);
        int n2 = 0;
        this.b = new e[stringArray.length];
        object = new Vector();
        Vector vector = new Vector();
        objectArray2 = null;
        objectArray = null;
        for (int i3 = 0; i3 < stringArray.length; ++i3) {
            n2 = this.a(stringArray[i3], n2, apArray, (Vector)object, vector);
            Object[] objectArray3 = new String[((Vector)object).size()];
            objectArray = new String[vector.size()];
            ((Vector)object).copyInto(objectArray3);
            vector.copyInto(objectArray);
            this.b[i3] = new e(this, (String[])objectArray3, (String[])objectArray);
            short s3 = this.b[i3].a();
            if (this.a < s3) {
                this.a = s3;
            }
            ((Vector)object).removeAllElements();
            vector.removeAllElements();
        }
    }

    private int a(String string, int n2, ap[] apArray, Vector vector, Vector vector2) {
        int n3 = 0;
        n3 = 0;
        int n4 = -1;
        int n5 = 0;
        int n6 = 0;
        for (n6 = 0; n6 < string.length(); ++n6) {
            int n7;
            block3: {
                n3 = n2 + n6;
                ap[] apArray2 = apArray;
                for (int i2 = 0; i2 < apArray2.length; ++i2) {
                    if (n3 < apArray2[i2].b || n3 > apArray2[i2].c) continue;
                    n7 = apArray2[i2].a;
                    break block3;
                }
                n7 = n3 = -1;
            }
            if (n7 == n4) continue;
            vector.addElement(string.substring(n5, n6));
            vector2.addElement(String.valueOf(n4));
            n5 = n6;
            n4 = n3;
        }
        if (n6 == string.length()) {
            vector.addElement(string.substring(n5, string.length()));
            vector2.addElement(String.valueOf(n4));
        }
        return n2 + string.length();
    }

    private String[] a(String string, String string2) {
        int n2 = 0;
        String[] stringArray = new String[]{};
        do {
            if ((n2 = string.indexOf(string2)) < 0) {
                stringArray = this.a(stringArray, string);
                break;
            }
            stringArray = this.a(stringArray, string.substring(0, n2));
            string = string.substring(n2 + string2.length());
        } while (n2 >= 0);
        return stringArray;
    }

    private String[] a(String[] stringArray, String string) {
        if (string == null) {
            return stringArray;
        }
        if (stringArray == null) {
            return new String[]{string};
        }
        boolean bl2 = true;
        String[] stringArray2 = stringArray;
        stringArray = new String[stringArray.length + 1];
        System.arraycopy(stringArray2, 0, stringArray, 0, stringArray2.length);
        stringArray[stringArray.length - 1] = string;
        return stringArray;
    }

    private String a(String string, Font font, int n2) {
        int n3 = font.stringWidth(string);
        if (n3 <= n2) {
            return string;
        }
        return this.a(string.substring(0, string.length() * n2 / n3), font, n2);
    }

    private static String[] a(String[] stringArray) {
        Vector<String> vector = new Vector<String>();
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            if (stringArray[i2] == null || stringArray[i2].equals("")) continue;
            vector.addElement(stringArray[i2]);
        }
        Object[] objectArray = new String[vector.size()];
        vector.copyInto(objectArray);
        return objectArray;
    }
}


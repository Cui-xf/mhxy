/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Font
 *  javax.microedition.lcdui.Graphics
 */
import com.yinhan.kjava.main.a;
import java.util.Vector;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

public final class d {
    private int a;
    private ah[] b;

    private d(Vector vector) {
        this.b = new ah[vector.size()];
        vector.copyInto(this.b);
        for (int i2 = 0; i2 < this.b.length; ++i2) {
            if (i2 != 0 && this.a >= this.b[i2].b()) continue;
            this.a = this.b[i2].b();
        }
    }

    public final int a() {
        return this.a;
    }

    public final void a(Graphics graphics, int n2, int n3, int n4) {
        for (n4 = 0; n4 < this.b.length; ++n4) {
            this.b[n4].a(graphics, n2, n3, this.a, 20);
            n2 += this.b[n4].a();
        }
    }

    public static d[] a(String string, int n2, Font font, char c2) {
        if (string == null || font == null || n2 < 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        StringBuffer stringBuffer3 = new StringBuffer();
        int n3 = -1;
        int n4 = 0;
        short s2 = 0;
        int n5 = 32;
        Vector<ah> vector = new Vector<ah>();
        Vector<d> vector2 = new Vector<d>();
        for (int i2 = 0; i2 < string.length(); ++i2) {
            short s3;
            char c3 = string.charAt(i2);
            s2 = -1;
            if (c3 == '<') {
                stringBuffer.delete(0, stringBuffer.length());
                n5 = 32;
                for (int i3 = i2 + 1; i3 < Math.min(i2 + 1 + 6, string.length()); ++i3) {
                    s3 = string.charAt(i3);
                    if (i3 == i2 + 1 && (s3 == 47 || s3 == 102 || s3 == 105)) {
                        n5 = s3;
                        continue;
                    }
                    if (s3 == 62 && stringBuffer.length() > 0) {
                        i2 = i3;
                        s2 = Short.parseShort(stringBuffer.toString());
                        break;
                    }
                    if (s3 < 48 || s3 > 57) break;
                    stringBuffer.append((char)s3);
                }
            }
            if (s2 != -1) {
                switch (n5) {
                    case 32: {
                        stringBuffer3.append(s2);
                        break;
                    }
                    case 47: {
                        stringBuffer3.delete(stringBuffer3.length() > 0 ? stringBuffer3.length() - 1 : 0, stringBuffer3.length());
                    }
                }
                if (stringBuffer2.length() > 0) {
                    vector.addElement(new ah(0, (short)n3, stringBuffer2.toString()));
                    stringBuffer2.delete(0, stringBuffer2.length());
                }
                n3 = (byte)(stringBuffer3.length() > 0 ? stringBuffer3.charAt(stringBuffer3.length() - 1) - 48 : -1);
                if (n5 != 102 && n5 != 105) continue;
                com.yinhan.kjava.main.a.af.e(String.valueOf(s2));
                bf bf2 = ao.b(s2);
                short s4 = s3 = bf2 == null ? (short)0 : bf2.b;
                if ((n4 += s3) > n2) {
                    n4 = s3;
                    vector2.addElement(new d(vector));
                    vector.removeAllElements();
                }
                vector.addElement(new ah(1, s2, null));
                continue;
            }
            if (c3 == '\t' || (n4 += font.charWidth(c3)) > n2) {
                n4 = 0;
                if (c3 != '\t') {
                    --i2;
                }
                if (stringBuffer2.length() > 0 || c3 == '\t') {
                    vector.addElement(new ah(0, (short)n3, stringBuffer2.toString()));
                    stringBuffer2.delete(0, stringBuffer2.length());
                }
                vector2.addElement(new d(vector));
                vector.removeAllElements();
                continue;
            }
            stringBuffer2.append(c3);
        }
        if (n4 > 0) {
            if (stringBuffer2.length() > 0) {
                vector.addElement(new ah(0, (short)n3, stringBuffer2.toString()));
            }
            vector2.addElement(new d(vector));
        }
        Object[] objectArray = new d[vector2.size()];
        vector2.copyInto(objectArray);
        return objectArray;
    }
}


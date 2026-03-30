package com.cc;

import java.util.Vector;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

public final class bw_1 {
    private e[] b;
    private short c;
    public short a;
    private int d = 0;

    public bw_1(String var1, short var2) {
        this.c = var2;
        this.a(var1);
    }

    public final short a() {
        return this.b != null ? (short) this.b.length : 0;
    }

    public final void a(Graphics var1, int var2, int var3, int var4) {
        if (this.b != null) {
            for (int var5 = 0; var5 < this.b.length; ++var5) {
                if (this.b[var5] != null) {
                    this.d = 0;

                    for (int var6 = 0; var6 < this.b[var5].a.length; ++var6) {
                        var1.setColor(this.b[var5].b[var6]);
                        var1.drawString(this.b[var5].a[var6], var2 + this.d, var3 + var5 * t_1.j, var4);
                        this.d += t_1.i.stringWidth(this.b[var5].a[var6]);
                    }
                }
            }

        }
    }

    public final void a(Graphics var1, int var2, int var3) {
        if (this.b != null) {
            short var4 = 0;

            for (int var5 = 0; var5 < this.b.length; ++var5) {
                if (this.b[var5] != null) {
                    this.d = 0;
                    var4 = this.b[var5].a();

                    for (int var6 = 0; var6 < this.b[var5].a.length; ++var6) {
                        var1.setColor(this.b[var5].b[var6]);
                        var1.drawString(this.b[var5].a[var6], var2 - var4 / 2 + this.d, var3 + var5 * t_1.j, 20);
                        this.d += t_1.i.stringWidth(this.b[var5].a[var6]);
                    }
                }
            }

        }
    }

    public final void a(Graphics var1, int var2, int var3, int var4, int var5) {
        this.d = 0;

        for (int var6 = 0; var6 < this.b[var4].a.length; ++var6) {
            var1.setColor(this.b[var4].b[var6]);
            var1.drawString(this.b[var4].a[var6], var2 + this.d, var3, var5);
            this.d += t_1.i.stringWidth(this.b[var4].a[var6]);
        }

    }

    private void a(String var1) {
        int var2 = 0;
        int var3 = 0;
        Vector var4 = new Vector();
        StringBuffer var5 = new StringBuffer();
        Object var6 = null;
        ap var7 = null;
        boolean var8 = false;

        for (int var18 = 0; var18 < var1.length(); ++var18) {
            if ((var2 = var1.charAt(var18)) == '<' && var18 + 1 < var1.length()) {
                if (var1.charAt(var18 + 1) == '/') {
                    var2 = var18;
                    int var20 = 0;

                    for (var20 = var18 + 2; var20 < var1.length(); ++var20) {
                        if (var1.charAt(var20) == '>') {
                            try {
                                int var17 = Integer.parseInt(var1.substring(var18 + 2, var20));
                                if (var7 != null && var17 == var7.a) {
                                    var7.c = (short) (a(var5) - 1);
                                    new ap(this);
                                    var7 = null;
                                }

                                var18 = var20;
                            } catch (Exception var10) {
                                var18 = var20;
                                var5.append(var1.substring(var2, var3 + 1));
                                var20 = 0;
                            }
                            break;
                        }

                        if (var1.charAt(var20) == '<') {
                            var3 = var20;
                            var18 = var20;
                            var5.append(var1.substring(var2, var20 - 1));
                            break;
                        }
                    }

                    if (var20 == var1.length()) {
                        var5.append(var1.substring(var2, var20));
                    }
                } else {
                    var2 = var18;
                    int var9 = 0;

                    for (var9 = var18 + 1; var9 < var1.length(); ++var9) {
                        if (var1.charAt(var9) == '>') {
                            try {
                                if (var7 != null) {
                                    var7.c = (short) (a(var5) - 1);
                                }

                                var3 = var9;
                                int var15 = Integer.parseInt(var1.substring(var18 + 1, var9));
                                ap var16 = new ap(this, var15, a(var5));
                                if (var1.charAt(var9 + 1) == '[' && var1.charAt(var9 + 3) == ']') {
                                    var18 = var9 + 3;
                                } else {
                                    var18 = var9;
                                }

                                var4.addElement(var16);
                                var7 = var16;
                            } catch (Exception var11) {
                                var18 = var9;
                                var5.append(var1.substring(var2, var3 + 1));
                                var9 = 0;
                            }
                            break;
                        }

                        if (var1.charAt(var9) == '<') {
                            var3 = var9;
                            var18 = var9;
                            var5.append(var1.substring(var2, var9 - 1));
                            break;
                        }
                    }

                    if (var9 == var1.length()) {
                        var5.append(var1.substring(var2, var9));
                    }
                }
            } else {
                var5.append(var2);
            }
        }

        if (var7 != null) {
            var7.c = (short) (a(var5) - 1);
        }

        ap[] var22 = new ap[var4.size()];
        var4.copyInto(var22);
        this.a(var5.toString(), var22);
        var4.removeAllElements();
    }

    private static short a(StringBuffer var0) {
        short var1 = 0;

        for (int var2 = 0; var2 < var0.length(); ++var2) {
            if (var0.charAt(var2) != '\t') {
                ++var1;
            }
        }

        return var1;
    }

    private void a(String str, ap[] apVarArr) {
        String strSubstring;
        Font font = t_1.i;
        int i = this.c;
        String str2 = str;
        if (str2 == null) {
            str2 = "";
        }
        Vector vector = new Vector();
        String[] a1 = a(str2, "\t");
        for (int i1 = 0; i1 < a1.length; i1++) {
            String str3 = a1[i1];
            do {
                String strA = a(str3, font, i);
                vector.addElement(strA);
                strSubstring = str3.substring(strA.length());
                str3 = strSubstring;
            } while (strSubstring.length() != 0);
        }

        String[] strArr = new String[vector.size()];
        vector.copyInto(strArr);
        String[] strArrA = a(strArr);
        int iA = 0;
        this.b = new e[strArrA.length];
        Vector vector2 = new Vector();
        Vector vector3 = new Vector();
        for (int i2 = 0; i2 < strArrA.length; i2++) {
            iA = a(strArrA[i2], iA, apVarArr, vector2, vector3);
            String[] strArr2 = new String[vector2.size()];
            String[] strArr3 = new String[vector3.size()];
            vector2.copyInto(strArr2);
            vector3.copyInto(strArr3);
            this.b[i2] = new e(this, strArr2, strArr3);
            short sA = this.b[i2].a();
            if (this.a < sA) {
                this.a = sA;
            }
            vector2.removeAllElements();
            vector3.removeAllElements();
        }
    }


    private int a(String str, int i, ap[] apVarArr, Vector vector, Vector vector2) {
        int i2;
        int i3 = -1;
        int i4 = 0;
        int i5 = 0;
        while (i5 < str.length()) {
            int i6 = i + i5;
            int i7 = 0;
            while (true) {
                if (i7 >= apVarArr.length) {
                    i2 = -1;
                    break;
                }
                if (i6 >= apVarArr[i7].b && i6 <= apVarArr[i7].c) {
                    i2 = apVarArr[i7].a;
                    break;
                }
                i7++;
            }
            int i8 = i2;
            if (i2 != i3) {
                vector.addElement(str.substring(i4, i5));
                vector2.addElement(String.valueOf(i3));
                i4 = i5;
                i3 = i8;
            }
            i5++;
        }
        if (i5 == str.length()) {
            vector.addElement(str.substring(i4, str.length()));
            vector2.addElement(String.valueOf(i3));
        }
        return i + str.length();
    }


    private String[] a(String var1, String var2) {
        int var3 = 0;
        String[] var4 = new String[0];

        do {
            if ((var3 = var1.indexOf(var2)) < 0) {
                var4 = this.a(var4, var1);
                break;
            }

            var4 = this.a(var4, var1.substring(0, var3));
            var1 = var1.substring(var3 + var2.length());
        } while (var3 >= 0);

        return var4;
    }

    private String[] a(String[] var1, String var2) {
        if (var2 == null) {
            return var1;
        } else if (var1 == null) {
            return new String[]{var2};
        } else {
            boolean var3 = true;
            String[] var4 = var1;
            var1 = new String[var1.length + 1];
            System.arraycopy(var4, 0, var1, 0, var4.length);
            var1[var1.length - 1] = var2;
            return var1;
        }
    }

    private String a(String var1, Font var2, int var3) {
        int var4;
        return (var4 = var2.stringWidth(var1)) <= var3 ? var1 : this.a(var1.substring(0, var1.length() * var3 / var4), var2, var3);
    }

    private static String[] a(String[] var0) {
        Vector var1 = new Vector();

        for (int var2 = 0; var2 < var0.length; ++var2) {
            if (var0[var2] != null && !var0[var2].equals("")) {
                var1.addElement(var0[var2]);
            }
        }

        String[] var3 = new String[var1.size()];
        var1.copyInto(var3);
        return var3;
    }
}

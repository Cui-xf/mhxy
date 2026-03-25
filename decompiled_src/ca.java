/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Font
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import com.yinhan.kjava.main.a;
import java.util.Random;
import java.util.Vector;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ca {
    public static int a = 0xFFFFFF;
    public static int b = 0;
    private static int B = 6732228;
    public static int c = 4562087;
    private static int C = 0;
    public static int d = 0;
    public static int e = 0;
    public static int f = 0;
    public static int g = 0;
    private static int[] D = new int[4];
    private static int[][] E;
    private static int[][] F;
    private static int[][] G;
    public static int h;
    private static String[] H;
    private static int I;
    private static int[][] J;
    public static int i;
    private static int K;
    public static int[] j;
    private static byte L;
    public static int k;
    private static int M;
    private static int N;
    private static int O;
    private static int P;
    public static int l;
    private static String Q;
    private static short R;
    private static short S;
    private static int T;
    private static int U;
    private static bw V;
    private static String[] W;
    private static int X;
    private static int Y;
    private static int Z;
    private static int aa;
    private static int ab;
    private static String ac;
    private static String ad;
    private static bw ae;
    public static int m;
    public static int[] n;
    private static int[] af;
    public static int o;
    public static String[] p;
    public static int q;
    private static int ag;
    private static int[] ah;
    private static int[][] ai;
    private static int[][] aj;
    private static int[][] ak;
    private static int[] al;
    public static int r;
    public static int s;
    public static int t;
    public static int u;
    private static boolean am;
    public static int v;
    public static int w;
    public static int x;
    public static int y;
    public static int z;
    private static int[] an;
    public static int A;
    private static String[] ao;
    private static bw ap;
    private static Random aq;

    public static void a(Graphics graphics, int n2, int n3, int n4, int n5, int n6, int n7) {
        if (t.q != 2) {
            ax.a(graphics, n2, n3, n4, n5, n6, n7);
        }
    }

    public static void a(Graphics graphics, String string, int n2, int n3, int n4, int n5) {
        graphics.setColor(n5);
        graphics.drawString(string, n2, n3, n4);
    }

    public static void a(az az2, bw bw2, String[] stringArray, String[] stringArray2, boolean n2) {
        C = 0;
        d = 0;
        e = 0;
        g = 0;
        f = 0;
        int n3 = 0;
        if (stringArray != null) {
            n3 = stringArray.length;
            F = new int[stringArray.length][4];
        } else {
            F = null;
        }
        G = null;
        short s2 = 0;
        if (az2 != null) {
            s2 = az2.d();
        }
        if (bw2 != null && bw2.a() != 0) {
            int n4 = (t.c - 26 - s2 - n3 * t.j) / t.j;
            if (n2 != 0) {
                int n5 = n4;
                n4 = bw2.a();
                int[] nArray = new int[2];
                if (n4 <= n5) {
                    nArray[0] = 1;
                    nArray[1] = n4;
                } else {
                    int n6;
                    n2 = 0;
                    for (n6 = n4; n6 > 0; --n6) {
                        if (n4 % n6 != 0) continue;
                        ++n2;
                    }
                    if (n2 == 2) {
                        ++n4;
                    }
                    for (n6 = n5; n6 > 0; --n6) {
                        if (n4 % n6 != 0) continue;
                        nArray[0] = n4 / n6;
                        nArray[1] = n6;
                        break;
                    }
                }
                int[] nArray2 = nArray;
                C = nArray[0];
                d = nArray2[1];
            } else {
                C = bw2.a() / n4 + (bw2.a() % n4 != 0 ? 1 : 0);
                d = n4;
            }
            E = (int[][])(C > 1 ? new int[2][4] : null);
        }
        f = (d + n3) * t.j + 26;
    }

    public static int a(int n2, int n3) {
        if (E != null) {
            if (n2 >= E[0][0] && n2 <= E[0][0] + E[0][2] && n3 >= E[0][1] && n3 <= E[0][1] + E[0][3]) {
                return 8;
            }
            if (n2 >= E[1][0] && n2 <= E[1][0] + E[1][2] && n3 >= E[1][1] && n3 <= E[1][1] + E[1][3]) {
                return 2;
            }
        }
        if (F != null) {
            for (int i2 = 0; i2 < F.length; ++i2) {
                if (n2 < F[i2][0] || n2 > F[i2][0] + F[i2][2] || n3 < F[i2][1] || n3 > F[i2][1] + F[i2][3]) continue;
                g = i2;
                return 0x40000000;
            }
        }
        if (G != null) {
            if (G.length >= 1 && n2 >= G[0][0] && n2 <= G[0][0] + G[0][2] && n3 >= G[0][1] && n3 <= G[0][1] + G[0][3]) {
                return 0x10000000;
            }
            if (G.length == 2 && n2 >= G[1][0] && n2 <= G[1][0] + G[1][2] && n3 >= G[1][1] && n3 <= G[1][1] + G[1][3]) {
                return 0x20000000;
            }
        } else if (D != null && (n2 < D[0] || n2 > D[0] + D[2] || n3 < D[1] || n3 > D[1] + D[3])) {
            return 0x20000000;
        }
        return 0;
    }

    public static void a(Graphics graphics, int n2, int n3, int n4, int n5, bw bw2, String[] stringArray, String[] stringArray2) {
        ca.a(graphics, 0, n3, n4, n5);
        ca.a(D, 0, n3, n4, n5);
        if (bw2 != null) {
            n2 = e + d >= bw2.a() ? bw2.a() : e + d;
            for (int i2 = e; i2 < n2; ++i2) {
                bw2.a(graphics, 10, n3 + 12 + (i2 - e) * t.j, i2, 20);
            }
            if (com.yinhan.kjava.main.a.A != null) {
                if (e != 0) {
                    ai.a(com.yinhan.kjava.main.a.A, System.currentTimeMillis());
                    com.yinhan.kjava.main.a.f.a(graphics, com.yinhan.kjava.main.a.A, null, 0, 0, 16, n3 + 5, 20, 0);
                    ca.a(E != null ? E[0] : null, 16, n3 + 5, 16, 9);
                } else {
                    ca.a(E != null ? E[0] : null, 0, 0, 0, 0);
                }
            }
            if (com.yinhan.kjava.main.a.B != null) {
                if (e + d < bw2.a()) {
                    ai.a(com.yinhan.kjava.main.a.B, System.currentTimeMillis());
                    com.yinhan.kjava.main.a.f.a(graphics, com.yinhan.kjava.main.a.B, null, 0, 0, n4 - 32, n3 + 5, 20, 0);
                    ca.a(E != null ? E[1] : null, n4 - 32, n3 + 5, 16, 9);
                } else {
                    ca.a(E != null ? E[1] : null, 0, 0, 0, 0);
                }
            }
        }
        if (stringArray != null && F != null) {
            for (n2 = 0; n2 < stringArray.length; ++n2) {
                ca.a(F != null ? F[n2] : null, 10, n3 + n5 - 9 - (stringArray.length - n2) * t.j, t.i.stringWidth(stringArray[n2]), t.j);
                ca.a(graphics, stringArray[n2], F[n2][0], F[n2][1], 20, g == n2 ? 0xFF0000 : 0xFFFFFF, 0);
            }
        }
    }

    public static void a(Graphics graphics, String string, String[] stringArray) {
        if (string == null) {
            return;
        }
        l = 0;
        graphics.setClip(0, 0, (int)t.b, (int)t.c);
        if (h >= 0) {
            if (h == 0) {
                H = ca.a(string, t.i, t.b - 10, "\t");
                I = (H.length + 1) * t.j + 20;
                ca.a(graphics, t.b / 2 * 3, (t.c - I / 4) / 2, t.b / 4, I / 4);
                J = new int[stringArray.length][4];
            } else if (h == 1) {
                ca.a(graphics, t.b / 4, (t.c - I / 2) / 2, t.b / 2, I / 2);
            } else if (h == 2) {
                ca.a(graphics, t.b / 8, (t.c - I / 4 * 3) / 2, t.b / 4 * 3, I / 4 * 3);
            } else {
                ca.a(graphics, 0, (t.c - I) / 2, (int)t.b, I);
                if (H != null) {
                    if (H.length == 1) {
                        ca.a(graphics, H[0], (t.b - t.i.stringWidth(H[0])) / 2, (t.c - I) / 2 + 10, 20, 0xFFFFFF, 0);
                    } else {
                        for (int i2 = 0; i2 < H.length; ++i2) {
                            ca.a(graphics, H[i2], (t.b - t.i.stringWidth(H[i2])) / 2, (t.c - I) / 2 + 10 + i2 * t.j, 20, 0xFFFFFF, 0);
                        }
                    }
                }
                if (J == null) {
                    h = 0;
                    return;
                }
                if (stringArray.length == 2) {
                    ca.a(stringArray[0], 0, 10, (t.c - I) / 2 + I - 9 - t.j);
                    ca.a(graphics, stringArray[0], J[0][0], J[0][1], 20, 16775357, 0);
                    ca.a(stringArray[1], 1, t.b - 10 - t.i.stringWidth(stringArray[1]), (t.c - I) / 2 + I - 9 - t.j);
                    ca.a(graphics, stringArray[1], J[1][0], J[1][1], 20, 16775357, 0);
                } else {
                    ca.a(stringArray[0], 0, (t.b - t.i.stringWidth(stringArray[0])) / 2, (t.c - I) / 2 + I - 9 - t.j);
                    ca.a(graphics, stringArray[0], J[0][0], J[0][0], 20, 16775357, 0);
                }
            }
        }
        ++h;
    }

    private static void a(String string, int n2, int n3, int n4) {
        if (string != null && J != null && J.length > n2) {
            ca.J[n2][0] = n3;
            ca.J[n2][1] = n4;
            ca.J[n2][2] = t.i.stringWidth(string);
            ca.J[n2][3] = t.j;
        }
    }

    public static int b(int n2, int n3) {
        if (J != null) {
            if (J.length >= 1 && n2 >= J[0][0] && n2 <= J[0][0] + J[0][2] && n3 >= J[0][1] && n3 <= J[0][1] + J[0][3]) {
                return 0x10000000;
            }
            if (J.length == 2 && n2 >= J[1][0] && n2 <= J[1][0] + J[1][2] && n3 >= J[1][1] && n3 <= J[1][1] + J[1][3]) {
                return 0x20000000;
            }
        }
        return 0;
    }

    public static void a(Graphics graphics, int n2, int n3, int n4, int n5) {
        graphics.setClip(0, 0, (int)t.b, (int)t.c);
        ca.a(graphics, 1009050, 180, n2, n3, n4, n5);
        ca.a(graphics, 2);
        graphics.drawRect(n2, n3, n4 - 1, n5 - 1);
        graphics.drawRect(n2 + 4, n3 + 4, n4 - 9, n5 - 9);
        ca.a(graphics, 3);
        graphics.drawRect(n2 + 1, n3 + 1, n4 - 3, n5 - 3);
        graphics.drawRect(n2 + 3, n3 + 3, n4 - 7, n5 - 7);
        ca.a(graphics, 4);
        graphics.drawRect(n2 + 2, n3 + 2, n4 - 5, n5 - 5);
        if (com.yinhan.kjava.main.a.y != null) {
            graphics.drawImage(com.yinhan.kjava.main.a.y.a, n2, n3, 20);
        }
        if (com.yinhan.kjava.main.a.z != null) {
            graphics.drawImage(com.yinhan.kjava.main.a.z.a, n2, n3 + n5 - com.yinhan.kjava.main.a.z.c, 20);
        }
        if (com.yinhan.kjava.main.a.w != null) {
            graphics.drawImage(com.yinhan.kjava.main.a.w.a, n2 + n4 - com.yinhan.kjava.main.a.w.b, n3, 20);
        }
        if (com.yinhan.kjava.main.a.x != null) {
            graphics.drawImage(com.yinhan.kjava.main.a.x.a, n2 + n4 - com.yinhan.kjava.main.a.x.b, n3 + n5 - com.yinhan.kjava.main.a.x.c, 20);
        }
    }

    public static void a(Graphics graphics, Image image, short s2, int n2, int n3, int n4, int n5) {
        graphics.setClip(n2, n3, n4, n5);
        n4 = n4 / s2 + (n4 % s2 != 0 ? 1 : 0);
        for (n5 = 0; n5 < n4; ++n5) {
            graphics.drawImage(image, n2 + n5 * s2, n3, 20);
        }
        graphics.setClip(0, 0, (int)t.b, (int)t.c);
    }

    public static void b(Graphics graphics, int n2, int n3, int n4, int n5) {
        ca.a(graphics, 2);
        graphics.fillRect(n2, n3, 5, n5 - n3);
        ca.a(graphics, 3);
        graphics.fillRect(n2 + 1, n3, 3, n5 - n3);
        ca.a(graphics, 4);
        graphics.drawLine(n2 + 2, n3, n4 + 2, n5 - 1);
    }

    public static void c(Graphics graphics, int n2, int n3, int n4, int n5) {
        graphics.setColor(i);
        graphics.fillRect(n2, n3, 3, n5 - n3);
        graphics.setColor(K);
        graphics.drawLine(n2 + 1, n3, n4 + 1, n5);
    }

    public static void a(Graphics graphics, int n2, int n3, int n4, int n5, int n6) {
        if (n6 == 1) {
            graphics.setColor(B);
            graphics.fillRect(n2, n3, n4, n5);
        } else if (n6 == 2) {
            graphics.setColor(c);
            graphics.fillRect(n2, n3, n4, n5);
        } else if (n6 == 3) {
            graphics.setColor(6793943);
            graphics.fillRect(n2, n3, n4, n5);
        } else if (n6 == 4) {
            ca.a(graphics, 8634850, 210, n2, n3, n4, n5);
        }
        graphics.setColor(i);
        graphics.drawRect(n2, n3, n4, n5);
        graphics.drawRect(n2 + 2, n3 + 2, n4 - 4, n5 - 4);
        graphics.setColor(K);
        graphics.drawRect(n2 + 1, n3 + 1, n4 - 2, n5 - 2);
    }

    public static void a(Graphics graphics, Image image, int n2, int n3, int n4, int n5, boolean bl2) {
        graphics.setColor(409969);
        graphics.fillRect(n2, n3, n4, n5);
        if (bl2) {
            graphics.setColor(6597852);
        } else {
            graphics.setColor(5018307);
        }
        graphics.fillRect(n2 + 3, n3 + 3, n4 - 6, n5 - 6);
        if (bl2) {
            graphics.setColor(16775125);
        } else {
            graphics.setColor(3775208);
        }
        graphics.drawRect(n2 + 1, n3 + 1, n4 - 3, n5 - 3);
    }

    public static void a(Graphics graphics) {
        graphics.setColor(K);
        graphics.fillRect(j[0] - 2, j[1], j[2] + 4, 2);
        graphics.setColor(i);
        graphics.fillRect(j[0] - 1, j[1], j[2] + 2, 3);
        graphics.setColor(B);
        graphics.fillRect(j[0], j[1], j[2], 3);
    }

    public static void a(Graphics graphics, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        graphics.setColor(20871);
        graphics.fillRect(n2 + 4, n3, 4, n4);
        graphics.setColor(1152942);
        graphics.fillRect(n2 + 5, n3, 2, n4);
        graphics.drawImage(com.yinhan.kjava.main.a.C.a, n2, n3, 20);
        graphics.drawImage(com.yinhan.kjava.main.a.D.a, n2, n3 + n4 - com.yinhan.kjava.main.a.D.c, 20);
        int n9 = 0;
        if (n7 == n8) {
            n5 = 0;
        }
        if (n5 > 0) {
            n9 = n3 + com.yinhan.kjava.main.a.C.c + (n4 - com.yinhan.kjava.main.a.C.c - com.yinhan.kjava.main.a.D.c - n5) * n6 / (n7 - n8);
        } else if (n5 <= 0) {
            n9 = n3 + com.yinhan.kjava.main.a.C.c;
            n5 = n4 - com.yinhan.kjava.main.a.C.c - com.yinhan.kjava.main.a.D.c;
        }
        graphics.setColor(11267556);
        graphics.fillRect(n2, n9, com.yinhan.kjava.main.a.C.b - 1, n5 - 1);
        graphics.setColor(5555146);
        graphics.fillRect(n2 + 2, n9 + 2, 8, n5 - 4);
        graphics.setColor(1801628);
        graphics.fillRect(n2 + 3, n9 + 3, 6, n5 - 6);
        graphics.setColor(1464956);
        graphics.fillRect(n2 + 6, n9 + 4, 2, n5 - 8);
        graphics.setColor(150092);
        graphics.drawRect(n2, n9, com.yinhan.kjava.main.a.C.b - 1, n5 - 1);
    }

    public static void b(Graphics graphics, int n2, int n3, int n4, int n5, int n6) {
        graphics.setColor(n2);
        n2 = Math.abs(n5);
        n5 /= n2;
        for (n6 = 0; n6 < n2; ++n6) {
            graphics.drawLine(n3 + n6 * n5, n4 - n6, n3 + n6 * n5, n4 + n6);
        }
    }

    public static String[] a(String stringArray, Font font, int n2, String string) {
        if (stringArray == null) {
            stringArray = "";
        }
        Vector<String> vector = new Vector<String>();
        stringArray = ca.a((String)stringArray, string);
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            String string2;
            String string3 = stringArray[i2];
            do {
                string2 = ca.b(string3, font, n2);
                vector.addElement(string2);
            } while ((string3 = string3.substring(string2.length())).length() != 0);
        }
        Object[] objectArray = new String[vector.size()];
        vector.copyInto(objectArray);
        return ca.a((String[])objectArray);
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

    private static String[] a(String string, String string2) {
        int n2 = 0;
        String[] stringArray = new String[]{};
        do {
            if ((n2 = string.indexOf(string2)) < 0) {
                stringArray = ca.a(stringArray, string);
                break;
            }
            stringArray = ca.a(stringArray, string.substring(0, n2));
            string = string.substring(n2 + string2.length());
        } while (n2 >= 0);
        return stringArray;
    }

    private static String b(String string, Font font, int n2) {
        int n3 = font.stringWidth(string);
        if (n3 <= n2) {
            return string;
        }
        return ca.b(string.substring(0, string.length() * n2 / n3), font, n2);
    }

    private static String[] a(String[] stringArray, String string) {
        if (string == null) {
            return stringArray;
        }
        if (stringArray == null) {
            return new String[]{string};
        }
        boolean bl2 = true;
        String[] stringArray2 = stringArray;
        String[] stringArray3 = new String[stringArray.length + 1];
        System.arraycopy(stringArray2, 0, stringArray3, 0, stringArray2.length);
        stringArray2 = stringArray3;
        stringArray3[stringArray2.length - 1] = string;
        return stringArray2;
    }

    public static void a(Graphics graphics, int n2) {
        int[] nArray = new int[1];
        switch (n2) {
            case -1: {
                nArray[0] = 0xFFFFFF;
                break;
            }
            case 0: {
                nArray[0] = 0;
                break;
            }
            case 1: {
                nArray[0] = 6014420;
                break;
            }
            case 2: {
                nArray[0] = 20871;
                break;
            }
            case 3: {
                nArray[0] = 1152942;
                break;
            }
            case 4: {
                nArray[0] = 9820642;
                break;
            }
            case 5: {
                nArray[0] = 0xB9B5B5;
                break;
            }
            case 6: {
                nArray[0] = 0xB9B5B5;
                break;
            }
            case 7: {
                nArray[0] = 0xB9B5B5;
                break;
            }
            case 8: {
                nArray[0] = 852044;
                break;
            }
            case 10: {
                nArray[0] = 0x722225;
                break;
            }
            case 11: {
                nArray[0] = 29803;
                break;
            }
            case 9: {
                nArray[0] = 873078;
            }
        }
        graphics.setColor(nArray[0]);
    }

    public static void a(Graphics graphics, String string, int n2, int n3, int n4, int n5, int n6) {
        graphics.setColor(n6);
        graphics.drawString(string, n2 - 1, n3 - 1, n4);
        graphics.drawString(string, n2, n3 - 1, n4);
        graphics.drawString(string, n2 - 1, n3, n4);
        graphics.drawString(string, n2 + 1, n3, n4);
        graphics.drawString(string, n2, n3 + 1, n4);
        graphics.drawString(string, n2 + 1, n3 + 1, n4);
        graphics.setColor(n5);
        graphics.drawString(string, n2, n3, n4);
    }

    public static void a(Graphics graphics, int n2, int n3, int n4) {
        graphics.setColor(i);
        graphics.fillRect(n2, n3, n4 - 1, 3);
        graphics.setColor(K);
        graphics.drawLine(n2, n3 + 1, n2 + n4 - 1, n3 + 1);
    }

    public static void a(int n2, int n3, int n4, int n5, String string) {
        M = n2;
        N = n3;
        O = n4;
        Q = string == null ? "\u8f7d\u5165\u4e2d\u2026" : string;
        P = M + (O - t.i.stringWidth(Q)) / 2;
    }

    public static void b(Graphics graphics) {
        graphics.setClip(0, 0, (int)t.b, (int)t.c);
        ca.a(graphics, 1808583, 95, M, N - (4 + t.j), O, 8 + t.j + 18);
        graphics.setColor(26540);
        graphics.drawRect(M, N - (4 + t.j), O, 8 + t.j + 18);
        graphics.drawRect(M + 2, N - (2 + t.j), O - 4, 8 + t.j + 14);
        graphics.setColor(11267556);
        graphics.drawRect(M + 1, N - (3 + t.j), O - 2, 8 + t.j + 16);
        ca.a(graphics, Q, P, N, 36, 0xFFFFFF, 727632);
        graphics.setColor(539727);
        graphics.fillRect(M + 2, N, O - 4, 18);
        graphics.setColor(4448748);
        graphics.drawRect(M + 3, N + 1, O - 6, 15);
        graphics.setColor(1265510);
        graphics.fillRect(M + 4, N + 3, O - 8, 12);
        graphics.setClip(M + 4, N + 3, O - 8, 12);
        int n2 = N + 3;
        int n3 = M + 3 + l % (O + 15) - 20;
        Graphics graphics2 = graphics;
        graphics2.setColor(4432868);
        graphics2.fillRect(n3 + 1, n2 + 1, 23, 10);
        graphics2.setColor(10738430);
        graphics2.fillRect(n3 + 2, n2 + 3, 21, 5);
        graphics2.setColor(15333119);
        graphics2.drawLine(n3 + 2, n2 + 5, n3 + 22, n2 + 5);
        graphics2.setColor(26540);
        graphics2.drawRect(n3, n2, 24, 11);
        graphics2.drawLine(n3 + 12, n2, n3 + 12, n2 + 12);
        graphics.setClip(0, 0, (int)t.b, (int)t.c);
        l += 2;
    }

    public static String[] a(String string, Font font, int n2) {
        Object[] objectArray;
        Vector<Object[]> vector = new Vector<Object[]>();
        do {
            objectArray = ca.c(string, font, n2);
            vector.addElement(objectArray);
        } while ((string = string.substring(objectArray.length())).length() != 0);
        objectArray = new String[vector.size()];
        vector.copyInto(objectArray);
        return ca.a((String[])objectArray);
    }

    private static String c(String string, Font font, int n2) {
        int n3;
        S = 0;
        R = 0;
        int n4 = font.stringWidth(string);
        if (n4 <= n2) {
            return string;
        }
        String string2 = string.substring(0, string.length() * n2 / n4);
        for (n3 = 0; n3 < string2.length(); ++n3) {
            char c2 = string2.charAt(n3);
            if (c2 == '<') {
                R = (short)(R + 1);
                continue;
            }
            if (c2 != '>') continue;
            S = (short)(S + 1);
        }
        if (R != S) {
            T = string.lastIndexOf(60);
            U = string.lastIndexOf(62);
            if (U - T >= 1) {
                try {
                    n3 = Integer.parseInt(string.substring(T + 1, U));
                    if (n3 <= 41) {
                        string2 = string.substring(0, string.lastIndexOf(60));
                    }
                }
                catch (Exception exception) {}
            } else {
                string2 = string.substring(0, T);
            }
        }
        return ca.c(string2, font, n2);
    }

    public static void b(Graphics graphics, String stringArray, int n2, int n3, int n4, int n5) {
        if (stringArray == null || n5 == 0 || stringArray.trim().length() == 0) {
            return;
        }
        if (l >= 15) {
            int n6 = t.d - 20;
            Object object = stringArray;
            int n7 = 0;
            String string = "";
            do {
                if ((n7 = ((String)object).indexOf(62)) >= 0) {
                    if (n7 - 2 >= 0 && ((String)object).charAt(n7 - 2) == '<') {
                        string = string + ((String)object).substring(0, n7 - 2);
                        object = ((String)object).substring(n7 + 1);
                        continue;
                    }
                    string = string + ((String)object).substring(0, n7 + 1);
                    object = ((String)object).substring(n7 + 1);
                    continue;
                }
                string = string + (String)object;
                break;
            } while (n7 >= 0);
            object = ca.a(string.trim(), t.i, n6, "\t");
            n7 = 0;
            for (int i2 = 0; i2 < ((String[])object).length; ++i2) {
                n7 = Math.max(n7, t.i.stringWidth((String)object[i2]) + 8);
            }
            X = Math.min(n7, n6);
            if (n5 == 1) {
                V = new bw((String)stringArray, (short)(X - 8));
                Y = t.j * V.a() + 8;
            } else if (n5 == 2) {
                W = ca.a(stringArray.trim(), t.i, X - 8, "\t");
                Y = t.j * W.length + 8;
            }
            int n8 = n2 + X <= t.f + t.d ? n2 : (Z = n2 - X >= t.f ? n2 - X : t.f + (t.d - X) / 2);
            int n9 = n3 + Y <= n4 ? n3 : (aa = n3 - Y >= t.g ? n3 - Y : t.g + (t.e - Y) / 2);
            if (l == 15) {
                ca.a(graphics, 1009050, 210, Z, aa, X / 4, Y / 4);
            } else if (l == 16) {
                ca.a(graphics, 1009050, 210, Z, aa, X / 2, Y / 2);
            } else if (l == 17) {
                ca.a(graphics, 1009050, 210, Z, aa, X / 4 * 3, Y / 4 * 3);
            } else {
                ca.a(graphics, 1009050, 210, Z, aa, X, Y);
                graphics.setColor(16230);
                graphics.drawRect(Z, aa, X, Y);
                if (n5 == 1) {
                    V.a(graphics, Z + 4, aa + 4, 20);
                } else if (n5 == 2) {
                    graphics.setColor(15138723);
                    for (int i3 = 0; i3 < W.length; ++i3) {
                        if (W[i3] == null) continue;
                        graphics.drawString(W[i3], Z + 4, aa + 4 + i3 * t.j, 0);
                    }
                }
            }
        }
        ++l;
    }

    public static void a(Graphics graphics, String string, long l2, int n2, int n3) {
        ca.a(graphics, string, l2, n2, n3, 20);
    }

    public static void a(Graphics graphics, String string, long l2, int n2, int n3, int n4) {
        block66: {
            block67: {
                block70: {
                    String string2;
                    block71: {
                        block68: {
                            block69: {
                                if (l < 15) break block66;
                                if (l != 15) break block67;
                                String string3 = ad = l2 >= 0L ? "\u4ef7\u683c:" + t.a(new StringBuffer(), l2) : null;
                                if (string == null) break block68;
                                ab = ca.a(string) != -1 ? ca.a(string) : 15138723;
                                if (ab == 15138723) break block69;
                                char c2 = string.charAt(2);
                                ac = c2 == '>' ? string.substring(3, string.length()) : string.substring(4, string.length());
                                break block70;
                            }
                            string2 = string;
                            break block71;
                        }
                        ab = 15138723;
                        string2 = "";
                    }
                    ac = string2;
                }
                X = Math.max(t.i.stringWidth(ac), ad == null ? 0 : t.i.stringWidth(ad)) + 8;
                Y = t.j * (ad == null ? 1 : 2) + 8;
                Z = n2;
                aa = n3;
                if (n4 == 40) {
                    if (Z - X < 0) {
                        ca.a(graphics, 1009050, 210, Z, n3 - Y / 4, X / 4, Y / 4);
                    } else {
                        ca.a(graphics, 1009050, 210, Z - X / 4, n3 - Y / 4, X / 4, Y / 4);
                    }
                } else if (n4 == 36) {
                    if (Z + X > t.f + t.d) {
                        ca.a(graphics, 1009050, 210, Z - X / 4, n3 - Y / 4, X / 4, Y / 4);
                    } else {
                        ca.a(graphics, 1009050, 210, Z, n3 - Y / 4, X / 4, Y / 4);
                    }
                } else if (n4 == 24) {
                    if (Z - X < 0) {
                        ca.a(graphics, 1009050, 210, Z, n3, X / 4, Y / 4);
                    } else {
                        ca.a(graphics, 1009050, 210, Z - X / 4, n3, X / 4, Y / 4);
                    }
                } else if (n2 + X <= t.f + t.d) {
                    ca.a(graphics, 1009050, 210, Z, n3, X / 4, Y / 4);
                } else {
                    ca.a(graphics, 1009050, 210, Z - X / 4, n3, X / 4, Y / 4);
                }
                break block66;
            }
            if (l == 16) {
                if (n4 == 40) {
                    if (Z - X < 0) {
                        ca.a(graphics, 1009050, 210, Z, n3 - Y / 4, X / 4, Y / 4);
                    } else {
                        ca.a(graphics, 1009050, 210, Z - X / 2, n3 - Y / 2, X / 2, Y / 2);
                    }
                } else if (n4 == 36) {
                    if (Z + X > t.f + t.d) {
                        ca.a(graphics, 1009050, 210, Z - X / 2, n3 - Y / 2, X / 2, Y / 2);
                    } else {
                        ca.a(graphics, 1009050, 210, Z, n3 - Y / 2, X / 2, Y / 2);
                    }
                } else if (n4 == 24) {
                    if (Z - X < 0) {
                        ca.a(graphics, 1009050, 210, Z, n3, X / 2, Y / 2);
                    } else {
                        ca.a(graphics, 1009050, 210, Z - X / 2, n3, X / 2, Y / 2);
                    }
                } else if (n2 + X <= t.f + t.d) {
                    ca.a(graphics, 1009050, 210, Z, n3, X / 2, Y / 2);
                } else {
                    ca.a(graphics, 1009050, 210, Z - X / 2, n3, X / 2, Y / 4);
                }
            } else if (l == 17) {
                if (n4 == 40) {
                    if (Z - X < 0) {
                        ca.a(graphics, 1009050, 210, Z, n3 - Y / 2, X / 2, Y / 2);
                    } else {
                        ca.a(graphics, 1009050, 210, Z - X / 4 * 3, n3 - Y / 4 * 3, X / 4 * 3, Y / 4 * 3);
                    }
                } else if (n4 == 36) {
                    if (Z + X > t.f + t.d) {
                        ca.a(graphics, 1009050, 210, Z - X / 4 * 3, n3 - Y / 4 * 3, X / 4 * 3, Y / 4 * 3);
                    } else {
                        ca.a(graphics, 1009050, 210, Z, n3 - Y / 4 * 3, X / 4 * 3, Y / 4 * 3);
                    }
                } else if (n4 == 24) {
                    if (Z - X < 0) {
                        ca.a(graphics, 1009050, 210, Z, n3, X / 4 * 3, Y / 4 * 3);
                    } else {
                        ca.a(graphics, 1009050, 210, Z - X / 4 * 3, n3, X / 4 * 3, Y / 4 * 3);
                    }
                } else if (n2 + X <= t.f + t.d) {
                    ca.a(graphics, 1009050, 210, Z, n3, X / 4 * 3, Y / 4 * 3);
                } else {
                    ca.a(graphics, 1009050, 210, Z - X / 4 * 3, n3, X / 4 * 3, Y / 4 * 3);
                }
            } else {
                graphics.setColor(16230);
                if (n4 == 40) {
                    if (Z - X < 0) {
                        ca.a(graphics, 1009050, 210, Z, n3 - Y, X, Y);
                        graphics.drawRect(Z, n3 - Y, X, Y);
                        graphics.setColor(ab);
                        graphics.drawString(ac, Z + 4, n3 - Y + 4, 20);
                        if (ad != null) {
                            graphics.drawString(ad, Z + 4, n3 - Y + 4 + t.j, 20);
                        }
                    } else {
                        ca.a(graphics, 1009050, 210, Z - X, n3 - Y, X, Y);
                        graphics.drawRect(Z - X, n3 - Y, X, Y);
                        graphics.setColor(ab);
                        graphics.drawString(ac, Z - X + 4, n3 - Y + 4, 20);
                        if (ad != null) {
                            graphics.drawString(ad, Z - X + 4, n3 - Y + 4 + t.j, 20);
                        }
                    }
                } else if (n4 == 36) {
                    if (Z + X > t.f + t.d) {
                        ca.a(graphics, 1009050, 210, Z - X, n3 - Y, X, Y);
                        graphics.drawRect(Z - X, n3 - Y, X, Y);
                        graphics.setColor(ab);
                        graphics.drawString(ac, Z - X + 4, n3 - Y + 4, 20);
                        if (ad != null) {
                            graphics.drawString(ad, Z - X + 4, n3 - Y + 4 + t.j, 20);
                        }
                    } else {
                        ca.a(graphics, 1009050, 210, Z, n3 - Y, X, Y);
                        graphics.drawRect(Z, n3 - Y, X, Y);
                        graphics.setColor(ab);
                        graphics.drawString(ac, Z + 4, n3 - Y + 4, 20);
                        if (ad != null) {
                            graphics.drawString(ad, Z + 4, n3 - Y + 4 + t.j, 20);
                        }
                    }
                } else if (n4 == 24) {
                    if (Z - X < 0) {
                        ca.a(graphics, 1009050, 210, Z, n3, X, Y);
                        graphics.drawRect(Z, n3, X, Y);
                        graphics.setColor(ab);
                        graphics.drawString(ac, Z + 4, n3 + 4, 20);
                        if (ad != null) {
                            graphics.drawString(ad, Z + 4, n3 + 4 + t.j, 20);
                        }
                    } else {
                        ca.a(graphics, 1009050, 210, Z - X, n3, X, Y);
                        graphics.drawRect(Z - X, n3, X, Y);
                        graphics.setColor(ab);
                        graphics.drawString(ac, Z - X + 4, n3 + 4, 20);
                        if (ad != null) {
                            graphics.drawString(ad, Z - X + 4, n3 + 4 + t.j, 20);
                        }
                    }
                } else {
                    int n5 = Z;
                    int n6 = aa;
                    if (n2 + X > t.f + t.d && (n5 -= X) < 0) {
                        n5 = 0;
                    }
                    ca.a(graphics, 1009050, 210, n5, n6, X, Y);
                    graphics.drawRect(n5, n6, X, Y);
                    graphics.setColor(ab);
                    graphics.drawString(ac, n5 + 4, n6 + 4, 20);
                    if (ad != null) {
                        graphics.drawString(ad, n5 + 4, n6 + 4 + t.j, 20);
                    }
                }
            }
        }
        ++l;
    }

    /*
     * Unable to fully structure code
     */
    public static void a(Graphics var0, String var1_1, String var2_3, int var3_4, int var4_5, int var5_6) {
        block141: {
            block142: {
                block144: {
                    block145: {
                        block143: {
                            if (ca.l < 15) break block141;
                            if (ca.l != 15) break block142;
                            ca.X = t.b - 30;
                            ca.ae = var2_3.equals("") != false ? null : new bw(var2_3, (short)(ca.X - 8));
                            if (var1_1 != null) {
                                ca.ab = ca.a(var1_1) != -1 ? ca.a(var1_1) : 15138723;
                                ca.ac = ca.ab != 15138723 ? var1_1.substring(3, var1_1.length()) : var1_1;
                            } else {
                                ca.ab = 15138723;
                                ca.ac = "";
                            }
                            var1_2 = t.i.stringWidth(ca.ac) + 8;
                            ca.X = ca.ae == null ? var1_2 : (ca.ae.a <= 0 ? ca.X : Math.max(var1_2, ca.ae.a + 8));
                            ca.Y = t.j * (ca.ae == null ? 1 : ca.ae.a() + 1) + 8;
                            if (var3_4 + ca.X > t.b) {
                                var3_4 = t.b - ca.X;
                            } else if (var3_4 < 0) {
                                var3_4 = 0;
                            }
                            if (var4_5 + ca.Y > t.c) {
                                var4_5 = t.c - ca.Y;
                            } else if (var4_5 < 0) {
                                var4_5 = 0;
                            }
                            ca.Z = var3_4;
                            if (var5_6 != 40) break block143;
                            if (ca.Z - ca.X < 0) {
                                if (var4_5 < ca.Y) {
                                    ca.a(var0, 1009050, 210, ca.Z, var4_5, ca.X / 4, ca.Y / 4);
                                } else {
                                    ca.a(var0, 1009050, 210, ca.Z, var4_5 - ca.Y / 4, ca.X / 4, ca.Y / 4);
                                }
                            } else if (var4_5 < ca.Y) {
                                ca.a(var0, 1009050, 210, ca.Z, var4_5, ca.X / 4, ca.Y / 4);
                            } else {
                                ca.a(var0, 1009050, 210, ca.Z - ca.X / 4, var4_5 - ca.Y / 4, ca.X / 4, ca.Y / 4);
                            }
                            break block141;
                        }
                        if (var5_6 != 36) break block144;
                        if (ca.Z + ca.X <= t.b) break block145;
                        if (var4_5 < ca.Y) ** GOTO lbl-1000
                        ca.a(var0, 1009050, 210, ca.Z - ca.X / 4, var4_5 - ca.Y / 4, ca.X / 4, ca.Y / 4);
                        break block141;
                    }
                    if (var4_5 < ca.Y) {
                        ca.a(var0, 1009050, 210, ca.Z, var4_5, ca.X / 4, ca.Y / 4);
                    } else {
                        ca.a(var0, 1009050, 210, ca.Z, var4_5 - ca.Y / 4, ca.X / 4, ca.Y / 4);
                    }
                    break block141;
                }
                if (var5_6 == 24) {
                    if (ca.Z - ca.X < 0) {
                        if (var4_5 + ca.Y >= t.c) {
                            ca.a(var0, 1009050, 210, ca.Z, var4_5 - ca.Y / 4, ca.X / 4, ca.Y / 4);
                        } else {
                            ca.a(var0, 1009050, 210, ca.Z, var4_5, ca.X / 4, ca.Y / 4);
                        }
                    } else if (var4_5 + ca.Y >= t.c) {
                        ca.a(var0, 1009050, 210, ca.Z, var4_5 - ca.Y / 4, ca.X / 4, ca.Y / 4);
                    } else {
                        ca.a(var0, 1009050, 210, ca.Z - ca.X / 4, var4_5, ca.X / 4, ca.Y / 4);
                    }
                } else if (var3_4 + ca.X <= t.b) {
                    if (var4_5 + ca.Y >= t.c) {
                        ca.a(var0, 1009050, 210, ca.Z - ca.X / 4, var4_5 - ca.Y / 4, ca.X / 4, ca.Y / 4);
                    } else {
                        ca.a(var0, 1009050, 210, ca.Z, var4_5, ca.X / 4, ca.Y / 4);
                    }
                } else if (var4_5 + ca.Y >= t.c) {
                    ca.a(var0, 1009050, 210, ca.Z - ca.X / 4, var4_5 - ca.Y / 4, ca.X / 4, ca.Y / 4);
                } else lbl-1000:
                // 2 sources

                {
                    ca.a(var0, 1009050, 210, ca.Z - ca.X / 4, var4_5, ca.X / 4, ca.Y / 4);
                }
                break block141;
            }
            if (ca.l == 16) {
                if (var5_6 == 40) {
                    if (ca.Z - ca.X < 0) {
                        if (var4_5 < ca.Y) {
                            ca.a(var0, 1009050, 210, ca.Z, var4_5, ca.X / 4, ca.Y / 4);
                        } else {
                            ca.a(var0, 1009050, 210, ca.Z, var4_5 - ca.Y / 4, ca.X / 4, ca.Y / 4);
                        }
                    } else if (var4_5 < ca.Y) {
                        ca.a(var0, 1009050, 210, ca.Z, var4_5, ca.X / 2, ca.Y / 2);
                    } else {
                        ca.a(var0, 1009050, 210, ca.Z - ca.X / 2, var4_5 - ca.Y / 2, ca.X / 2, ca.Y / 2);
                    }
                } else if (var5_6 == 36) {
                    if (ca.Z + ca.X > t.b) {
                        if (var4_5 < ca.Y) {
                            ca.a(var0, 1009050, 210, ca.Z - ca.X / 2, var4_5, ca.X / 2, ca.Y / 2);
                        } else {
                            ca.a(var0, 1009050, 210, ca.Z - ca.X / 2, var4_5 - ca.Y / 2, ca.X / 2, ca.Y / 2);
                        }
                    } else if (var4_5 < ca.Y) {
                        ca.a(var0, 1009050, 210, ca.Z, var4_5, ca.X / 2, ca.Y / 2);
                    } else {
                        ca.a(var0, 1009050, 210, ca.Z, var4_5 - ca.Y / 2, ca.X / 2, ca.Y / 2);
                    }
                } else if (var5_6 == 24) {
                    if (ca.Z - ca.X < 0) {
                        if (var4_5 + ca.Y >= t.c) {
                            ca.a(var0, 1009050, 210, ca.Z, var4_5 - ca.Y / 2, ca.X / 2, ca.Y / 2);
                        } else {
                            ca.a(var0, 1009050, 210, ca.Z, var4_5, ca.X / 2, ca.Y / 2);
                        }
                    } else if (var4_5 + ca.Y >= t.c) {
                        ca.a(var0, 1009050, 210, ca.Z, var4_5 - ca.Y / 2, ca.X / 2, ca.Y / 2);
                    } else {
                        ca.a(var0, 1009050, 210, ca.Z - ca.X / 2, var4_5, ca.X / 2, ca.Y / 2);
                    }
                } else if (var3_4 + ca.X <= t.b) {
                    if (var4_5 + ca.Y >= t.c) {
                        ca.a(var0, 1009050, 210, ca.Z - ca.X / 2, var4_5 - ca.Y / 2, ca.X / 2, ca.Y / 2);
                    } else {
                        ca.a(var0, 1009050, 210, ca.Z, var4_5, ca.X / 2, ca.Y / 2);
                    }
                } else if (var4_5 + ca.Y >= t.c) {
                    ca.a(var0, 1009050, 210, ca.Z - ca.X / 2, var4_5 - ca.Y / 2, ca.X / 2, ca.Y / 4);
                } else {
                    ca.a(var0, 1009050, 210, ca.Z - ca.X / 2, var4_5, ca.X / 2, ca.Y / 4);
                }
            } else if (ca.l == 17) {
                if (var5_6 == 40) {
                    if (ca.Z - ca.X < 0) {
                        if (var4_5 < ca.Y) {
                            ca.a(var0, 1009050, 210, ca.Z, var4_5, ca.X / 2, ca.Y / 2);
                        } else {
                            ca.a(var0, 1009050, 210, ca.Z, var4_5 - ca.Y / 2, ca.X / 2, ca.Y / 2);
                        }
                    } else if (var4_5 < ca.Y) {
                        ca.a(var0, 1009050, 210, ca.Z, var4_5, ca.X / 4 * 3, ca.Y / 4 * 3);
                    } else {
                        ca.a(var0, 1009050, 210, ca.Z - ca.X / 4 * 3, var4_5 - ca.Y / 4 * 3, ca.X / 4 * 3, ca.Y / 4 * 3);
                    }
                } else if (var5_6 == 36) {
                    if (ca.Z + ca.X > t.b) {
                        if (var4_5 < ca.Y) {
                            ca.a(var0, 1009050, 210, ca.Z - ca.X / 4 * 3, var4_5, ca.X / 4 * 3, ca.Y / 4 * 3);
                        } else {
                            ca.a(var0, 1009050, 210, ca.Z - ca.X / 4 * 3, var4_5 - ca.Y / 4 * 3, ca.X / 4 * 3, ca.Y / 4 * 3);
                        }
                    } else if (var4_5 < ca.Y) {
                        ca.a(var0, 1009050, 210, ca.Z, var4_5, ca.X / 4 * 3, ca.Y / 4 * 3);
                    } else {
                        ca.a(var0, 1009050, 210, ca.Z, var4_5 - ca.Y / 4 * 3, ca.X / 4 * 3, ca.Y / 4 * 3);
                    }
                } else if (var5_6 == 24) {
                    if (ca.Z - ca.X < 0) {
                        if (var4_5 + ca.Y >= t.c) {
                            ca.a(var0, 1009050, 210, ca.Z, var4_5 - ca.Y / 4 * 3, ca.X / 4 * 3, ca.Y / 4 * 3);
                        } else {
                            ca.a(var0, 1009050, 210, ca.Z, var4_5, ca.X / 4 * 3, ca.Y / 4 * 3);
                        }
                    } else if (var4_5 + ca.Y >= t.c) {
                        ca.a(var0, 1009050, 210, ca.Z, var4_5 - ca.Y / 4 * 3, ca.X / 4 * 3, ca.Y / 4 * 3);
                    } else {
                        ca.a(var0, 1009050, 210, ca.Z - ca.X / 4 * 3, var4_5, ca.X / 4 * 3, ca.Y / 4 * 3);
                    }
                } else if (var3_4 + ca.X <= t.b) {
                    if (var4_5 + ca.Y >= t.c) {
                        ca.a(var0, 1009050, 210, ca.Z - ca.X / 4 * 3, var4_5 - ca.Y / 4 * 3, ca.X / 4 * 3, ca.Y / 4 * 3);
                    } else {
                        ca.a(var0, 1009050, 210, ca.Z, var4_5, ca.X / 4 * 3, ca.Y / 4 * 3);
                    }
                } else if (var4_5 + ca.Y >= t.c) {
                    ca.a(var0, 1009050, 210, ca.Z - ca.X / 4 * 3, var4_5 - ca.Y / 4 * 3, ca.X / 4 * 3, ca.Y / 4 * 3);
                } else {
                    ca.a(var0, 1009050, 210, ca.Z - ca.X / 4 * 3, var4_5, ca.X / 4 * 3, ca.Y / 4 * 3);
                }
            } else {
                var0.setColor(16230);
                if (var5_6 == 40) {
                    if (ca.Z - ca.X < 0) {
                        if (var4_5 < ca.Y) {
                            ca.a(var0, 1009050, 210, ca.Z, var4_5, ca.X, ca.Y);
                            var0.drawRect(ca.Z, var4_5, ca.X, ca.Y);
                            var0.setColor(ca.ab);
                            var0.drawString(ca.ac, ca.Z + 4, var4_5 + 4, 20);
                            if (ca.ae != null) {
                                ca.ae.a(var0, ca.Z + 4, var4_5 + 4 + t.j, 0);
                            }
                        } else {
                            ca.a(var0, 1009050, 210, ca.Z, var4_5 - ca.Y, ca.X, ca.Y);
                            var0.drawRect(ca.Z, var4_5 - ca.Y, ca.X, ca.Y);
                            var0.setColor(ca.ab);
                            var0.drawString(ca.ac, ca.Z + 4, var4_5 - ca.Y + 4, 20);
                            if (ca.ae != null) {
                                ca.ae.a(var0, ca.Z + 4, var4_5 - ca.Y + 4 + t.j, 0);
                            }
                        }
                    } else if (var4_5 < ca.Y) {
                        ca.a(var0, 1009050, 210, ca.Z, var4_5, ca.X, ca.Y);
                        var0.drawRect(ca.Z, var4_5, ca.X, ca.Y);
                        var0.setColor(ca.ab);
                        var0.drawString(ca.ac, ca.Z + 4, var4_5 + 4, 20);
                        if (ca.ae != null) {
                            ca.ae.a(var0, ca.Z + 4, var4_5 + 4 + t.j, 0);
                        }
                    } else {
                        ca.a(var0, 1009050, 210, ca.Z - ca.X, var4_5 - ca.Y, ca.X, ca.Y);
                        var0.drawRect(ca.Z - ca.X, var4_5 - ca.Y, ca.X, ca.Y);
                        var0.setColor(ca.ab);
                        var0.drawString(ca.ac, ca.Z - ca.X + 4, var4_5 - ca.Y + 4, 20);
                        if (ca.ae != null) {
                            ca.ae.a(var0, ca.Z - ca.X + 4, var4_5 - ca.Y + 4 + t.j, 0);
                        }
                    }
                } else if (var5_6 == 36) {
                    if (ca.Z + ca.X > t.b) {
                        if (var4_5 < ca.Y) {
                            ca.a(var0, 1009050, 210, ca.Z, var4_5, ca.X, ca.Y);
                            var0.drawRect(ca.Z, var4_5, ca.X, ca.Y);
                            var0.setColor(ca.ab);
                            var0.drawString(ca.ac, ca.Z + 4, var4_5 + 4, 20);
                            if (ca.ae != null) {
                                ca.ae.a(var0, ca.Z + 4, var4_5 + 4 + t.j, 0);
                            }
                        } else {
                            ca.a(var0, 1009050, 210, ca.Z - ca.X, var4_5 - ca.Y, ca.X, ca.Y);
                            var0.drawRect(ca.Z - ca.X, var4_5 - ca.Y, ca.X, ca.Y);
                            var0.setColor(ca.ab);
                            var0.drawString(ca.ac, ca.Z - ca.X + 4, var4_5 - ca.Y + 4, 20);
                            if (ca.ae != null) {
                                ca.ae.a(var0, ca.Z - ca.X + 4, var4_5 - ca.Y + 4 + t.j, 0);
                            }
                        }
                    } else if (var4_5 < ca.Y) {
                        ca.a(var0, 1009050, 210, ca.Z, var4_5, ca.X, ca.Y);
                        var0.drawRect(ca.Z, var4_5, ca.X, ca.Y);
                        var0.setColor(ca.ab);
                        var0.drawString(ca.ac, ca.Z + 4, var4_5 + 4, 20);
                        if (ca.ae != null) {
                            ca.ae.a(var0, ca.Z + 4, var4_5 + 4 + t.j, 0);
                        }
                    } else {
                        ca.a(var0, 1009050, 210, ca.Z, var4_5 - ca.Y, ca.X, ca.Y);
                        var0.drawRect(ca.Z, var4_5 - ca.Y, ca.X, ca.Y);
                        var0.setColor(ca.ab);
                        var0.drawString(ca.ac, ca.Z + 4, var4_5 - ca.Y + 4, 20);
                        if (ca.ae != null) {
                            ca.ae.a(var0, ca.Z + 4, var4_5 - ca.Y + 4 + t.j, 0);
                        }
                    }
                } else if (var5_6 == 24) {
                    if (ca.Z - ca.X < 0) {
                        if (var4_5 + ca.Y >= t.c) {
                            ca.a(var0, 1009050, 210, ca.Z, var4_5 - ca.Y, ca.X, ca.Y);
                            var0.drawRect(ca.Z, var4_5 - ca.Y, ca.X, ca.Y);
                            var0.setColor(ca.ab);
                            var0.drawString(ca.ac, ca.Z + 4, var4_5 + 4 - ca.Y, 20);
                            if (ca.ae != null) {
                                ca.ae.a(var0, ca.Z + 4, var4_5 + 4 + t.j - ca.Y, 0);
                            }
                        } else {
                            ca.a(var0, 1009050, 210, ca.Z, var4_5, ca.X, ca.Y);
                            var0.drawRect(ca.Z, var4_5, ca.X, ca.Y);
                            var0.setColor(ca.ab);
                            var0.drawString(ca.ac, ca.Z + 4, var4_5 + 4, 20);
                            if (ca.ae != null) {
                                ca.ae.a(var0, ca.Z + 4, var4_5 + 4 + t.j, 0);
                            }
                        }
                    } else if (var4_5 + ca.Y >= t.c) {
                        ca.a(var0, 1009050, 210, ca.Z, var4_5 - ca.Y, ca.X, ca.Y);
                        var0.drawRect(ca.Z, var4_5 - ca.Y, ca.X, ca.Y);
                        var0.setColor(ca.ab);
                        var0.drawString(ca.ac, ca.Z + 4, var4_5 + 4 - ca.Y, 20);
                        if (ca.ae != null) {
                            ca.ae.a(var0, ca.Z + 4, var4_5 + 4 + t.j - ca.Y, 0);
                        }
                    } else {
                        ca.a(var0, 1009050, 210, ca.Z - ca.X, var4_5, ca.X, ca.Y);
                        var0.drawRect(ca.Z - ca.X, var4_5, ca.X, ca.Y);
                        var0.setColor(ca.ab);
                        var0.drawString(ca.ac, ca.Z - ca.X + 4, var4_5 + 4, 20);
                        if (ca.ae != null) {
                            ca.ae.a(var0, ca.Z - ca.X + 4, var4_5 + 4 + t.j, 0);
                        }
                    }
                } else if (var3_4 + ca.X <= t.b) {
                    if (var4_5 + ca.Y >= t.c) {
                        ca.a(var0, 1009050, 210, ca.Z - ca.X, var4_5 - ca.Y, ca.X, ca.Y);
                        var0.drawRect(ca.Z - ca.X, var4_5 - ca.Y, ca.X, ca.Y);
                        var0.setColor(ca.ab);
                        var0.drawString(ca.ac, ca.Z + 4 - ca.X, var4_5 + 4 - ca.Y, 20);
                        if (ca.ae != null) {
                            ca.ae.a(var0, ca.Z + 4 - ca.X, var4_5 + 4 + t.j - ca.Y, 0);
                        }
                    } else {
                        ca.a(var0, 1009050, 210, ca.Z, var4_5, ca.X, ca.Y);
                        var0.drawRect(ca.Z, var4_5, ca.X, ca.Y);
                        var0.setColor(ca.ab);
                        var0.drawString(ca.ac, ca.Z + 4, var4_5 + 4, 20);
                        if (ca.ae != null) {
                            ca.ae.a(var0, ca.Z + 4, var4_5 + 4 + t.j, 0);
                        }
                    }
                } else if (var4_5 + ca.Y >= t.c) {
                    ca.a(var0, 1009050, 210, ca.Z - ca.X, var4_5 - ca.Y, ca.X, ca.Y);
                    if (ca.Z < ca.X) {
                        ca.Z = ca.X;
                    }
                    var0.drawRect(ca.Z - ca.X, var4_5 - ca.Y, ca.X, ca.Y);
                    var0.setColor(ca.ab);
                    var0.drawString(ca.ac, ca.Z - ca.X + 4, var4_5 + 4 - ca.Y, 20);
                    if (ca.ae != null) {
                        ca.ae.a(var0, ca.Z - ca.X + 4, var4_5 + 4 + t.j - ca.Y, 0);
                    }
                } else {
                    ca.a(var0, 1009050, 210, ca.Z - ca.X, var4_5, ca.X, ca.Y);
                    var0.drawRect(ca.Z - ca.X, var4_5, ca.X, ca.Y);
                    var0.setColor(ca.ab);
                    var0.drawString(ca.ac, ca.Z - ca.X + 4, var4_5 + 4, 20);
                    if (ca.ae != null) {
                        ca.ae.a(var0, ca.Z - ca.X + 4, var4_5 + 4 + t.j, 0);
                    }
                }
            }
        }
        ++ca.l;
    }

    public static int a(String string) {
        if (string == null || string.trim().equals("")) {
            return -1;
        }
        m = 1;
        char c2 = string.charAt(0);
        if (c2 == '<') {
            c2 = string.charAt(2);
            if (c2 == '>') {
                return ca.b(string.substring(1, 2));
            }
            c2 = string.charAt(3);
            if (c2 == '>') {
                m = 2;
                return ca.b(string.substring(1, 3));
            }
        }
        return -1;
    }

    private static int b(String string) {
        int n2 = -1;
        try {
            n2 = Integer.parseInt(string);
        }
        catch (Exception exception) {}
        if (n2 >= 0 && n2 < n.length) {
            return n[n2];
        }
        return 15138723;
    }

    public static int a(int n2) {
        if (n2 >= 0 && n2 < n.length) {
            return n[n2];
        }
        return 15138723;
    }

    public static void a(int n2, int n3, String[] stringArray, boolean bl2) {
        int n4;
        int n5;
        int[] nArray;
        int n6;
        if (stringArray == null) {
            return;
        }
        ah = null;
        o = 0;
        p = new String[stringArray.length];
        ai = new int[stringArray.length][4];
        for (n6 = 0; n6 < stringArray.length; ++n6) {
            System.arraycopy(stringArray, 0, p, 0, stringArray.length);
        }
        q = t.i.stringWidth("\u83dc\u5355");
        for (n6 = 0; n6 < p.length; ++n6) {
            q = Math.max(q, t.i.stringWidth(p[n6]));
        }
        q += 20;
        ca.af[0] = n2;
        ca.af[1] = n3;
        ag = p.length * (t.j + 3) + 3;
        int n7 = ca.af[1] = af[1] + ag > t.c ? t.c - ag : af[1];
        if (bl2) {
            nArray = af;
            n5 = 0;
            n4 = t.b / 2 - q / 2;
        } else {
            nArray = af;
            n5 = 0;
            n4 = af[0] + q > t.b ? t.b - q : af[0];
        }
        nArray[n5] = n4;
    }

    public static void b(int n2) {
        if (n2 == 1) {
            o = o <= 0 ? p.length - 1 : (o = o - 1);
            return;
        }
        if (n2 == 4) {
            o = o >= p.length - 1 ? 0 : (o = o + 1);
        }
    }

    public static void a(int[] nArray) {
        ah = nArray;
    }

    public static void c(Graphics graphics) {
        l = 0;
        graphics.setClip(0, 0, (int)t.b, (int)t.c);
        graphics.setColor(11138815);
        graphics.fillRect(af[0], af[1], q, ag);
        graphics.setColor(14172);
        graphics.drawRect(af[0], af[1], q - 1, ag - 1);
        for (int i2 = 0; i2 < p.length; ++i2) {
            graphics.setColor(o == i2 ? 1539988 : 6082765);
            graphics.fillRect(af[0] + 2, af[1] + 2 + (t.j + 3) * i2, q - 4, t.j + 2);
            graphics.setColor(14172);
            graphics.drawRect(af[0] + 2, af[1] + 2 + (t.j + 3) * i2, q - 5, t.j + 1);
            ca.a(ai[i2], af[0] + 2, af[1] + 2 + (t.j + 3) * i2, q - 5, t.j + 1);
            graphics.setColor(o == i2 ? 16053950 : 3756286);
            if (ah != null && i2 < ah.length && ah[i2] == 1) {
                graphics.setColor(0x858585);
            }
            graphics.drawString(p[i2], af[0] + q / 2, af[1] + 2 + (t.j + 3) * i2, 17);
        }
        if (com.yinhan.kjava.main.a.S != null && com.yinhan.kjava.main.a.S.length == 4) {
            graphics.drawImage(com.yinhan.kjava.main.a.S[0].a, af[0], af[1], 20);
            graphics.drawImage(com.yinhan.kjava.main.a.S[1].a, af[0] + q - com.yinhan.kjava.main.a.S[1].b, af[1], 20);
            graphics.drawImage(com.yinhan.kjava.main.a.S[2].a, af[0], af[1] + ag - com.yinhan.kjava.main.a.S[2].c, 20);
            graphics.drawImage(com.yinhan.kjava.main.a.S[3].a, af[0] + q - com.yinhan.kjava.main.a.S[3].b, af[1] + ag - com.yinhan.kjava.main.a.S[3].c, 20);
        }
    }

    public static int c(int n2, int n3) {
        if (ai != null) {
            for (int i2 = 0; i2 < ai.length; ++i2) {
                if (n2 < ai[i2][0] || n2 > ai[i2][0] + ai[i2][2] || n3 < ai[i2][1] || n3 > ai[i2][1] + ai[i2][3]) continue;
                o = i2;
                return 0x40000000;
            }
        }
        if (n2 < af[0] || n2 > af[0] + q || n3 < af[1] || n3 > af[1] + ag) {
            return 0x20000000;
        }
        return 0;
    }

    public static void a(Graphics graphics, String string, int n2, boolean bl2) {
        l = 0;
        int n3 = (t.j << 1) + 35 + 24;
        int n4 = (t.b - 140) / 2;
        int n5 = (t.c - n3) / 2;
        ca.c(graphics, n4, n5, 140, n3, 0);
        ca.c(graphics, n4 + 20, n5 + 5 + t.j + 12, 100, t.j, 1);
        ca.a(al, n4 + 20, n5 + 5 + t.j + 12, 100, t.j);
        ca.a(graphics, string, n4 + 70, n5 + 5, 17, 0xFFFDDA, 0);
        if (n2 > 0) {
            ca.a(graphics, "" + n2, n4 + 70, n5 + 6 + t.j + 12, 17, 16711639);
        }
        if (bl2 && com.yinhan.kjava.main.a.X != null && com.yinhan.kjava.main.a.Y != null && com.yinhan.kjava.main.a.V != null && com.yinhan.kjava.main.a.W != null) {
            graphics.drawImage(com.yinhan.kjava.main.a.V.a, n4 + (140 - com.yinhan.kjava.main.a.V.b) / 2, n5 + 7 + t.j, 20);
            ca.a(aj[0], n4 + (140 - com.yinhan.kjava.main.a.V.b) / 2, n5 + 7 + t.j, com.yinhan.kjava.main.a.V.a.getWidth(), com.yinhan.kjava.main.a.V.a.getHeight());
            graphics.drawImage(com.yinhan.kjava.main.a.W.a, n4 + (140 - com.yinhan.kjava.main.a.V.b) / 2, n5 + 5 + (t.j << 1) + 14, 20);
            ca.a(aj[1], n4 + (140 - com.yinhan.kjava.main.a.V.b) / 2, n5 + 5 + (t.j << 1) + 14, com.yinhan.kjava.main.a.W.a.getWidth(), com.yinhan.kjava.main.a.W.a.getHeight());
            graphics.drawImage(com.yinhan.kjava.main.a.X.a, n4 + 5, n5 + 5 + t.j + 12, 20);
            ca.a(aj[2], n4 + 5, n5 + 5 + t.j + 12, com.yinhan.kjava.main.a.X.a.getWidth(), com.yinhan.kjava.main.a.X.a.getHeight());
            graphics.drawImage(com.yinhan.kjava.main.a.Y.a, n4 + 140 - 5 - com.yinhan.kjava.main.a.Y.b, n5 + 5 + t.j + 12, 20);
            ca.a(aj[3], n4 + 140 - 5 - com.yinhan.kjava.main.a.Y.b, n5 + 5 + t.j + 12, com.yinhan.kjava.main.a.Y.a.getWidth(), com.yinhan.kjava.main.a.Y.a.getHeight());
        }
        if (com.yinhan.kjava.main.a.T != null && com.yinhan.kjava.main.a.U != null) {
            graphics.drawImage(com.yinhan.kjava.main.a.T.a, n4 + 5, n5 + n3 - 5 - com.yinhan.kjava.main.a.T.c, 20);
            ca.a(ak[0], n4 + 5, n5 + n3 - 5 - com.yinhan.kjava.main.a.T.c, com.yinhan.kjava.main.a.T.a.getWidth(), com.yinhan.kjava.main.a.T.a.getHeight());
            graphics.drawImage(com.yinhan.kjava.main.a.U.a, n4 + 140 - 5 - com.yinhan.kjava.main.a.U.b, n5 + n3 - 5 - com.yinhan.kjava.main.a.U.c, 20);
            ca.a(ak[1], n4 + 140 - 5 - com.yinhan.kjava.main.a.U.b, n5 + n3 - 5 - com.yinhan.kjava.main.a.U.c, com.yinhan.kjava.main.a.U.a.getWidth(), com.yinhan.kjava.main.a.U.a.getHeight());
        }
    }

    public static void c(Graphics graphics, int n2, int n3, int n4, int n5, int n6) {
        if (n6 == 0) {
            ca.a(graphics, 2511520, 210, n2, n3, n4, n5);
        } else if (n6 == 1) {
            graphics.setColor(15990);
            graphics.fillRect(n2, n3, n4, n5);
        }
        graphics.setColor(14172);
        graphics.drawRect(n2, n3, n4, n5);
        graphics.drawRect(n2 + 2, n3 + 2, n4 - 4, n5 - 4);
        graphics.setColor(11267556);
        graphics.drawRect(n2 + 1, n3 + 1, n4 - 2, n5 - 2);
    }

    public static void a(Graphics graphics, String string, int n2, int n3, int n4) {
        graphics.drawImage(com.yinhan.kjava.main.a.X.a, n2, n3 + 3, 20);
        ca.c(graphics, n2 + 12, n3, n4 - 24, t.j, 1);
        graphics.drawImage(com.yinhan.kjava.main.a.Y.a, n2 + n4 - 9, n3 + 3, 20);
        ca.a(graphics, string, n2 + n4 / 2, n3 + 3, 17, 16711639);
    }

    public static int d(int n2, int n3) {
        if (aj != null) {
            for (int i2 = 0; i2 < aj.length; ++i2) {
                if (n2 < aj[i2][0] || n2 > aj[i2][0] + aj[i2][2] || n3 < aj[i2][1] || n3 > aj[i2][1] + aj[i2][3]) continue;
                switch (i2) {
                    case 0: {
                        return 1;
                    }
                    case 1: {
                        return 4;
                    }
                    case 2: {
                        return 8;
                    }
                    case 3: {
                        return 2;
                    }
                }
            }
        }
        if (ak != null) {
            if (n2 >= ak[0][0] && n2 <= ak[0][0] + ak[0][2] && n3 >= ak[0][1] && n3 <= ak[0][1] + ak[0][3]) {
                return 0x10000000;
            }
            if (n2 >= ak[1][0] && n2 <= ak[1][0] + ak[1][2] && n3 >= ak[1][1] && n3 <= ak[1][1] + ak[1][3]) {
                return 0x20000000;
            }
        }
        return 0;
    }

    public static boolean e(int n2, int n3) {
        return al != null && n2 >= al[0] && n2 <= al[0] + al[2] && n3 >= al[1] && n3 <= al[1] + al[3];
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, boolean bl2) {
        w = 0;
        y = 0;
        z = 0;
        r = 4;
        s = n4;
        t = n5;
        u = n6;
        v = n2;
        x = n7;
        if (v > n7) {
            am = true;
            y = x * (n6 - 16) / n2;
            return;
        }
        am = false;
    }

    public static void a(int n2, int n3, int n4) {
        block13: {
            if (n2 == 514 || n2 == 1) {
                n2 = 1;
                if (1 == 0) {
                    int n5 = w = w <= 0 ? 0 : w - 1;
                    while (am && z > w) {
                        --z;
                    }
                } else {
                    if (w == 0) {
                        z = v % x == 0 ? v - x : v - v % x;
                        w = v - 1;
                    } else {
                        --w;
                    }
                    while (z > 0 && am && w - z + 1 < x) {
                        --z;
                    }
                }
                return;
            }
            if (n2 != 520 && n2 != 4) break block13;
            n2 = 1;
            if (1 == 0) {
                int n6 = w = w >= v - x ? v - x : w + 1;
                while (z < w && am) {
                    ++z;
                }
            } else {
                if (w == v - 1) {
                    z = 0;
                    w = 0;
                } else {
                    ++w;
                }
                while (z < w && am && w - z + 1 > x) {
                    ++z;
                }
            }
        }
    }

    public static void d(Graphics graphics, int n2, int n3, int n4, int n5) {
        graphics.setClip(0, 0, (int)t.b, (int)t.c);
        graphics.setColor(16248869);
        graphics.drawLine(n2, n3, n2 + 4, n3);
        graphics.drawLine(n2, n3, n2, n3 + 4);
        graphics.drawLine(n2, n3 + n5 - 4, n2, n3 + n5);
        graphics.drawLine(n2, n3 + n5, n2 + 4, n3 + n5);
        graphics.drawLine(n2 + n4 - 4, n3, n2 + n4, n3);
        graphics.drawLine(n2 + n4, n3, n2 + n4, n3 + 4);
        graphics.drawLine(n2 + n4, n3 + n5 - 4, n2 + n4, n3 + n5);
        graphics.drawLine(n2 + n4 - 4, n3 + n5, n2 + n4, n3 + n5);
    }

    public static void e(Graphics graphics, int n2, int n3, int n4, int n5) {
        graphics.setColor(0xFFFFFF);
        graphics.fillRect(n2 + 1, n3 + 1, 20, 2);
        graphics.setColor(n5 == 0 ? 0xFF0000 : 48127);
        graphics.fillRect(n2 + 1, n3 + 1, n4, 2);
        graphics.setColor(n5 == 0 ? 10945027 : 230064);
        graphics.fillRect(n2 + 1, n3 + 2, n4, 1);
        graphics.drawImage(com.yinhan.kjava.main.a.Z.a, n2, n3, 20);
    }

    private static void a(int[] nArray, int n2, int n3, int n4, int n5) {
        if (nArray != null) {
            nArray[0] = n2;
            nArray[1] = n3;
            nArray[2] = n4;
            nArray[3] = n5;
        }
    }

    public static void a() {
        an = new int[]{(t.b - 100) / 2, (t.c / 3 << 1) + 20, 100, 3};
        A = 0;
        ap = new bw(ao[ca.f(1, 100) % 7], (short)(t.b - 20));
    }

    public static void a(Graphics graphics, Image image) {
        if (an == null || image == null) {
            return;
        }
        graphics.setColor(0);
        graphics.fillRect(0, 0, (int)t.b, (int)t.c);
        if (ap != null) {
            ap.a(graphics, t.b / 2, 20, 17);
        }
        graphics.setColor(0xFFFFFF);
        graphics.drawString("\u6b63\u5728\u8f7d\u5165\u8d44\u6e90...", t.b / 2, t.c / 2, 17);
        graphics.setColor(14459464);
        graphics.drawString(100 * A / 100 + "%", t.b / 2, an[1] + 10, 17);
        graphics.drawImage(image, an[0] - 5, an[1] - 4, 20);
        graphics.setColor(16382066);
        graphics.fillRect(an[0], an[1], 100 * A / 100, 3);
        graphics.setColor(14459464);
        graphics.fillRect(an[0], an[1] + 1, 100 * A / 100, 2);
        A = ++A > 100 ? 100 : A;
    }

    public static int f(int n2, int n3) {
        n2 = (n2 += aq.nextInt() % (n3 - n2)) < 0 ? -n2 : n2;
        n2 = n2 == 0 ? 1 : n2;
        return n2;
    }

    public static void f(Graphics graphics, int n2, int n3, int n4, int n5) {
        graphics.setClip(0, 0, (int)t.b, (int)t.c);
        ca.a(graphics, 2);
        graphics.drawRect(n2 - 4, n3 - 4, n4 + 7, n5 + 7);
        graphics.drawRect(n2, n3, n4 - 1, n5 - 1);
        ca.a(graphics, 3);
        graphics.drawRect(n2 - 3, n3 - 3, n4 + 5, n5 + 5);
        graphics.drawRect(n2 - 1, n3 - 1, n4 + 1, n5 + 1);
        ca.a(graphics, 4);
        graphics.drawRect(n2 - 2, n3 - 2, n4 + 3, n5 + 3);
        if (com.yinhan.kjava.main.a.y != null) {
            graphics.drawImage(com.yinhan.kjava.main.a.y.a, n2 - 4, n3 - 4, 20);
        }
        if (com.yinhan.kjava.main.a.z != null) {
            graphics.drawImage(com.yinhan.kjava.main.a.z.a, n2 - 4, n3 + (n5 + 4) - com.yinhan.kjava.main.a.z.c, 20);
        }
        if (com.yinhan.kjava.main.a.w != null) {
            graphics.drawImage(com.yinhan.kjava.main.a.w.a, n2 + 4 + n4 - com.yinhan.kjava.main.a.w.b, n3 - 4, 20);
        }
        if (com.yinhan.kjava.main.a.x != null) {
            graphics.drawImage(com.yinhan.kjava.main.a.x.a, n2 + 4 + n4 - com.yinhan.kjava.main.a.x.b, n3 + (n5 + 4) - com.yinhan.kjava.main.a.x.c, 20);
        }
    }

    static {
        h = 0;
        H = null;
        i = 26540;
        K = 11267556;
        j = new int[3];
        L = 0;
        k = 0;
        l = 0;
        X = 0;
        Y = 0;
        Z = 0;
        aa = 0;
        ab = 0;
        m = 1;
        n = new int[]{0xFF0000, 4194166, 15588145, 12066995, 12066995, 0xFFFF00, 0x2233CC, 0xFFFFFF, 15138723, 0x44FFFF, 0xFFAAEE, 15095, 14221536, 31834, 13513984, 0x858585, 65280, 0, 16514810, 65532, 65316, 16490750, 16197367};
        af = new int[2];
        o = 0;
        p = new String[0];
        ai = null;
        aj = new int[4][4];
        ak = new int[2][4];
        al = new int[4];
        am = false;
        A = 0;
        ao = new String[]{"\u7cfb\u7edf\u83dc\u5355\u5185\u53ef\u8fdb\u884c\u52a8\u6001NPC\u548c\u5c0f\u5730\u56fe\u7b49\u8bbe\u7f6e", "\u6309\u201c3\u201d\u952e\u53ef\u6253\u5f00\u89d2\u8272\u7269\u54c1\u680f", "\u6309\u201c1\u201d\u952e\u53ef\u67e5\u770b\u5468\u56f4\u73a9\u5bb6", "\u6309\u201c0\u201d\u952e\u53ef\u6253\u5f00\u5ba0\u7269\u680f", "\u6309\u201c7\u201d\u952e\u53ef\u6253\u5f00\u5730\u56fe", "\u6309\u201c9\u201d\u952e\u53ef\u6253\u5f00\u793e\u4ea4\u680f", "\u6309\u201c*\u201d\u952e\u53ef\u6253\u5f00\u804a\u5929\u680f", "\u6309\u201c#\u201d\u952e\u53ef\u6253\u5f00\u4efb\u52a1\u680f"};
        aq = new Random();
    }
}


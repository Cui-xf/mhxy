package defpackage;

import com.yinhan.kjava.main.a;
import java.lang.reflect.Array;
import java.util.Random;
import java.util.Vector;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-8105993946875401281/classes.dex */
public final class ca {
    private static int[][] E;
    private static int[][] F;
    private static int[][] G;
    private static int I;
    private static int[][] J;
    private static int M;
    private static int N;
    private static int O;
    private static int P;
    private static String Q;
    private static short R;
    private static short S;
    private static int T;
    private static int U;
    private static bw V;
    private static String[] W;
    private static String ac;
    private static String ad;
    private static bw ae;
    private static int ag;
    private static int[] ah;
    private static int[] an;
    private static bw ap;
    public static int q;
    public static int r;
    public static int s;
    public static int t;
    public static int u;
    public static int v;
    public static int w;
    public static int x;
    public static int y;
    public static int z;
    public static int a = 16777215;
    public static int b = 0;
    private static int B = 6732228;
    public static int c = 4562087;
    private static int C = 0;
    public static int d = 0;
    public static int e = 0;
    public static int f = 0;
    public static int g = 0;
    private static int[] D = new int[4];
    public static int h = 0;
    private static String[] H = null;
    public static int i = 26540;
    private static int K = 11267556;
    public static int[] j = new int[3];
    private static byte L = 0;
    public static int k = 0;
    public static int l = 0;
    private static int X = 0;
    private static int Y = 0;
    private static int Z = 0;
    private static int aa = 0;
    private static int ab = 0;
    public static int m = 1;
    public static int[] n = {16711680, 4194166, 15588145, 12066995, 12066995, 16776960, 2241484, 16777215, 15138723, 4521983, 16755438, 15095, 14221536, 31834, 13513984, 8750469, 65280, 0, 16514810, 65532, 65316, 16490750, 16197367};
    private static int[] af = new int[2];
    public static int o = 0;
    public static String[] p = new String[0];
    private static int[][] ai = null;
    private static int[][] aj = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 4, 4);
    private static int[][] ak = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 2, 4);
    private static int[] al = new int[4];
    private static boolean am = false;
    public static int A = 0;
    private static String[] ao = {"系统菜单内可进行动态NPC和小地图等设置", "按“3”键可打开角色物品栏", "按“1”键可查看周围玩家", "按“0”键可打开宠物栏", "按“7”键可打开地图", "按“9”键可打开社交栏", "按“*”键可打开聊天栏", "按“#”键可打开任务栏"};
    private static Random aq = new Random();

    public static int a(int i2) {
        if (i2 < 0 || i2 >= n.length) {
            return 15138723;
        }
        return n[i2];
    }

    public static int a(int i2, int i3) {
        if (E != null) {
            if (i2 >= E[0][0] && i2 <= E[0][0] + E[0][2] && i3 >= E[0][1] && i3 <= E[0][1] + E[0][3]) {
                return 8;
            }
            if (i2 >= E[1][0] && i2 <= E[1][0] + E[1][2] && i3 >= E[1][1] && i3 <= E[1][1] + E[1][3]) {
                return 2;
            }
        }
        if (F != null) {
            for (int i4 = 0; i4 < F.length; i4++) {
                if (i2 >= F[i4][0] && i2 <= F[i4][0] + F[i4][2] && i3 >= F[i4][1] && i3 <= F[i4][1] + F[i4][3]) {
                    g = i4;
                    return 1073741824;
                }
            }
        }
        if (G == null) {
            if (D != null) {
                return (i2 < D[0] || i2 > D[0] + D[2] || i3 < D[1] || i3 > D[1] + D[3]) ? 536870912 : 0;
            }
            return 0;
        }
        if (G.length < 1 || i2 < G[0][0] || i2 > G[0][0] + G[0][2] || i3 < G[0][1] || i3 > G[0][1] + G[0][3]) {
            return (G.length != 2 || i2 < G[1][0] || i2 > G[1][0] + G[1][2] || i3 < G[1][1] || i3 > G[1][1] + G[1][3]) ? 0 : 536870912;
        }
        return 268435456;
    }

    public static int a(String str) {
        if (str == null || str.trim().equals("")) {
            return -1;
        }
        m = 1;
        if (str.charAt(0) != '<') {
            return -1;
        }
        if (str.charAt(2) == '>') {
            return b(str.substring(1, 2));
        }
        if (str.charAt(3) != '>') {
            return -1;
        }
        m = 2;
        return b(str.substring(1, 3));
    }

    public static void a() {
        an = new int[]{(t.b - 100) / 2, ((t.c / 3) << 1) + 20, 100, 3};
        A = 0;
        ap = new bw(ao[f(1, 100) % 7], (short) (t.b - 20));
    }

    public static void a(int i2, int i3, int i4) {
        if (i2 == 514 || i2 == 1) {
            if (w == 0) {
                z = v % x == 0 ? v - x : v - (v % x);
                w = v - 1;
            } else {
                w--;
            }
            while (z > 0 && am && (w - z) + 1 < x) {
                z--;
            }
            return;
        }
        if (i2 == 520 || i2 == 4) {
            if (w == v - 1) {
                z = 0;
                w = 0;
            } else {
                w++;
            }
            while (z < w && am && (w - z) + 1 > x) {
                z++;
            }
        }
    }

    public static void a(int i2, int i3, int i4, int i5, int i6, int i7, boolean z2) {
        w = 0;
        y = 0;
        z = 0;
        r = 4;
        s = i4;
        t = i5;
        u = i6;
        v = i2;
        x = i7;
        if (v <= i7) {
            am = false;
        } else {
            am = true;
            y = (x * (i6 - 16)) / i2;
        }
    }

    public static void a(int i2, int i3, int i4, int i5, String str) {
        M = i2;
        N = i3;
        O = i4;
        if (str == null) {
            str = "载入中…";
        }
        Q = str;
        P = M + ((O - t.i.stringWidth(Q)) / 2);
    }

    public static void a(int i2, int i3, String[] strArr, boolean z2) {
        int[] iArr;
        int i4;
        if (strArr == null) {
            return;
        }
        ah = null;
        o = 0;
        p = new String[strArr.length];
        ai = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, strArr.length, 4);
        for (int i5 = 0; i5 < strArr.length; i5++) {
            System.arraycopy(strArr, 0, p, 0, strArr.length);
        }
        q = t.i.stringWidth("菜单");
        for (int i6 = 0; i6 < p.length; i6++) {
            q = Math.max(q, t.i.stringWidth(p[i6]));
        }
        q += 20;
        af[0] = i2;
        af[1] = i3;
        ag = (p.length * (t.j + 3)) + 3;
        af[1] = af[1] + ag > t.c ? t.c - ag : af[1];
        if (z2) {
            iArr = af;
            i4 = (t.b / 2) - (q / 2);
        } else {
            iArr = af;
            i4 = af[0] + q > t.b ? t.b - q : af[0];
        }
        iArr[0] = i4;
    }

    public static void a(az azVar, bw bwVar, String[] strArr, String[] strArr2, boolean z2) {
        int length;
        C = 0;
        d = 0;
        e = 0;
        g = 0;
        f = 0;
        if (strArr != null) {
            length = strArr.length;
            F = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, strArr.length, 4);
        } else {
            F = null;
            length = 0;
        }
        G = null;
        short sD = azVar != null ? azVar.d() : (short) 0;
        if (bwVar != null && bwVar.a() != 0) {
            int i2 = (((t.c - 26) - sD) - (t.j * length)) / t.j;
            if (z2) {
                short sA = bwVar.a();
                int[] iArr = new int[2];
                if (sA <= i2) {
                    iArr[0] = 1;
                    iArr[1] = sA;
                } else {
                    int i3 = 0;
                    for (int i4 = sA; i4 > 0; i4--) {
                        if (sA % i4 == 0) {
                            i3++;
                        }
                    }
                    int i5 = i3 == 2 ? sA + 1 : sA;
                    int i6 = i2;
                    while (true) {
                        if (i6 <= 0) {
                            break;
                        }
                        if (i5 % i6 == 0) {
                            iArr[0] = i5 / i6;
                            iArr[1] = i6;
                            break;
                        }
                        i6--;
                    }
                }
                C = iArr[0];
                d = iArr[1];
            } else {
                C = (bwVar.a() % i2 != 0 ? 1 : 0) + (bwVar.a() / i2);
                d = i2;
            }
            if (C > 1) {
                E = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 2, 4);
            } else {
                E = null;
            }
        }
        f = ((d + length) * t.j) + 26;
    }

    private static void a(String str, int i2, int i3, int i4) {
        if (str == null || J == null || J.length <= i2) {
            return;
        }
        J[i2][0] = i3;
        J[i2][1] = i4;
        J[i2][2] = t.i.stringWidth(str);
        J[i2][3] = t.j;
    }

    public static void a(Graphics graphics) {
        graphics.setColor(K);
        graphics.fillRect(j[0] - 2, j[1], j[2] + 4, 2);
        graphics.setColor(i);
        graphics.fillRect(j[0] - 1, j[1], j[2] + 2, 3);
        graphics.setColor(B);
        graphics.fillRect(j[0], j[1], j[2], 3);
    }

    public static void a(Graphics graphics, int i2) {
        int[] iArr = new int[1];
        switch (i2) {
            case -1:
                iArr[0] = 16777215;
                break;
            case 0:
                iArr[0] = 0;
                break;
            case 1:
                iArr[0] = 6014420;
                break;
            case 2:
                iArr[0] = 20871;
                break;
            case 3:
                iArr[0] = 1152942;
                break;
            case 4:
                iArr[0] = 9820642;
                break;
            case 5:
                iArr[0] = 12170677;
                break;
            case 6:
                iArr[0] = 12170677;
                break;
            case 7:
                iArr[0] = 12170677;
                break;
            case 8:
                iArr[0] = 852044;
                break;
            case 9:
                iArr[0] = 873078;
                break;
            case 10:
                iArr[0] = 7479845;
                break;
            case 11:
                iArr[0] = 29803;
                break;
        }
        graphics.setColor(iArr[0]);
    }

    public static void a(Graphics graphics, int i2, int i3, int i4) {
        graphics.setColor(i);
        graphics.fillRect(i2, i3, i4 - 1, 3);
        graphics.setColor(K);
        graphics.drawLine(i2, i3 + 1, (i2 + i4) - 1, i3 + 1);
    }

    public static void a(Graphics graphics, int i2, int i3, int i4, int i5) {
        graphics.setClip(0, 0, t.b, t.c);
        a(graphics, 1009050, 180, i2, i3, i4, i5);
        a(graphics, 2);
        graphics.drawRect(i2, i3, i4 - 1, i5 - 1);
        graphics.drawRect(i2 + 4, i3 + 4, i4 - 9, i5 - 9);
        a(graphics, 3);
        graphics.drawRect(i2 + 1, i3 + 1, i4 - 3, i5 - 3);
        graphics.drawRect(i2 + 3, i3 + 3, i4 - 7, i5 - 7);
        a(graphics, 4);
        graphics.drawRect(i2 + 2, i3 + 2, i4 - 5, i5 - 5);
        if (a.y != null) {
            graphics.drawImage(a.y.a, i2, i3, 20);
        }
        if (a.z != null) {
            graphics.drawImage(a.z.a, i2, (i3 + i5) - a.z.c, 20);
        }
        if (a.w != null) {
            graphics.drawImage(a.w.a, (i2 + i4) - a.w.b, i3, 20);
        }
        if (a.x != null) {
            graphics.drawImage(a.x.a, (i2 + i4) - a.x.b, (i3 + i5) - a.x.c, 20);
        }
    }

    public static void a(Graphics graphics, int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 1) {
            graphics.setColor(B);
            graphics.fillRect(i2, i3, i4, i5);
        } else if (i6 == 2) {
            graphics.setColor(c);
            graphics.fillRect(i2, i3, i4, i5);
        } else if (i6 == 3) {
            graphics.setColor(6793943);
            graphics.fillRect(i2, i3, i4, i5);
        } else if (i6 == 4) {
            a(graphics, 8634850, 210, i2, i3, i4, i5);
        }
        graphics.setColor(i);
        graphics.drawRect(i2, i3, i4, i5);
        graphics.drawRect(i2 + 2, i3 + 2, i4 - 4, i5 - 4);
        graphics.setColor(K);
        graphics.drawRect(i2 + 1, i3 + 1, i4 - 2, i5 - 2);
    }

    public static void a(Graphics graphics, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (t.q != 2) {
            ax.a(graphics, i2, i3, i4, i5, i6, i7);
        }
    }

    public static void a(Graphics graphics, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = 0;
        graphics.setColor(20871);
        graphics.fillRect(i2 + 4, i3, 4, i4);
        graphics.setColor(1152942);
        graphics.fillRect(i2 + 5, i3, 2, i4);
        graphics.drawImage(a.C.a, i2, i3, 20);
        graphics.drawImage(a.D.a, i2, (i3 + i4) - a.D.c, 20);
        int i10 = i7 == i8 ? 0 : i5;
        if (i10 > 0) {
            i9 = a.C.c + i3 + (((((i4 - a.C.c) - a.D.c) - i10) * i6) / (i7 - i8));
        } else if (i10 <= 0) {
            i9 = a.C.c + i3;
            i10 = (i4 - a.C.c) - a.D.c;
        }
        graphics.setColor(11267556);
        graphics.fillRect(i2, i9, a.C.b - 1, i10 - 1);
        graphics.setColor(5555146);
        graphics.fillRect(i2 + 2, i9 + 2, 8, i10 - 4);
        graphics.setColor(1801628);
        graphics.fillRect(i2 + 3, i9 + 3, 6, i10 - 6);
        graphics.setColor(1464956);
        graphics.fillRect(i2 + 6, i9 + 4, 2, i10 - 8);
        graphics.setColor(150092);
        graphics.drawRect(i2, i9, a.C.b - 1, i10 - 1);
    }

    public static void a(Graphics graphics, int i2, int i3, int i4, int i5, bw bwVar, String[] strArr, String[] strArr2) {
        a(graphics, 0, i3, i4, i5);
        a(D, 0, i3, i4, i5);
        if (bwVar != null) {
            int iA = e + d >= bwVar.a() ? bwVar.a() : e + d;
            for (int i6 = e; i6 < iA; i6++) {
                bwVar.a(graphics, 10, i3 + 12 + ((i6 - e) * t.j), i6, 20);
            }
            if (a.A != null) {
                if (e != 0) {
                    ai.a(a.A, System.currentTimeMillis());
                    a.f.a(graphics, a.A, (int[]) null, 0, 0, 16, i3 + 5, 20, 0);
                    a(E != null ? E[0] : null, 16, i3 + 5, 16, 9);
                } else {
                    a(E != null ? E[0] : null, 0, 0, 0, 0);
                }
            }
            if (a.B != null) {
                if (e + d < bwVar.a()) {
                    ai.a(a.B, System.currentTimeMillis());
                    a.f.a(graphics, a.B, (int[]) null, 0, 0, i4 - 32, i3 + 5, 20, 0);
                    a(E != null ? E[1] : null, i4 - 32, i3 + 5, 16, 9);
                } else {
                    a(E != null ? E[1] : null, 0, 0, 0, 0);
                }
            }
        }
        if (strArr == null || F == null) {
            return;
        }
        int i7 = 0;
        while (true) {
            int i8 = i7;
            if (i8 >= strArr.length) {
                return;
            }
            a(F != null ? F[i8] : null, 10, ((i3 + i5) - 9) - ((strArr.length - i8) * t.j), t.i.stringWidth(strArr[i8]), t.j);
            a(graphics, strArr[i8], F[i8][0], F[i8][1], 20, g == i8 ? 16711680 : 16777215, 0);
            i7 = i8 + 1;
        }
    }

    public static void a(Graphics graphics, String str, int i2, int i3, int i4) {
        graphics.drawImage(a.X.a, i2, i3 + 3, 20);
        c(graphics, i2 + 12, i3, i4 - 24, t.j, 1);
        graphics.drawImage(a.Y.a, (i2 + i4) - 9, i3 + 3, 20);
        a(graphics, str, i2 + (i4 / 2), i3 + 3, 17, 16711639);
    }

    public static void a(Graphics graphics, String str, int i2, int i3, int i4, int i5) {
        graphics.setColor(i5);
        graphics.drawString(str, i2, i3, i4);
    }

    public static void a(Graphics graphics, String str, int i2, int i3, int i4, int i5, int i6) {
        graphics.setColor(i6);
        graphics.drawString(str, i2 - 1, i3 - 1, i4);
        graphics.drawString(str, i2, i3 - 1, i4);
        graphics.drawString(str, i2 - 1, i3, i4);
        graphics.drawString(str, i2 + 1, i3, i4);
        graphics.drawString(str, i2, i3 + 1, i4);
        graphics.drawString(str, i2 + 1, i3 + 1, i4);
        graphics.setColor(i5);
        graphics.drawString(str, i2, i3, i4);
    }

    public static void a(Graphics graphics, String str, int i2, boolean z2) {
        l = 0;
        int i3 = (t.j << 1) + 35 + 24;
        int i4 = (t.b - 140) / 2;
        int i5 = (t.c - i3) / 2;
        c(graphics, i4, i5, 140, i3, 0);
        c(graphics, i4 + 20, i5 + 5 + t.j + 12, 100, t.j, 1);
        a(al, i4 + 20, i5 + 5 + t.j + 12, 100, t.j);
        a(graphics, str, i4 + 70, i5 + 5, 17, 16776666, 0);
        if (i2 > 0) {
            a(graphics, new StringBuffer().append("").append(i2).toString(), i4 + 70, i5 + 6 + t.j + 12, 17, 16711639);
        }
        if (z2 && a.X != null && a.Y != null && a.V != null && a.W != null) {
            graphics.drawImage(a.V.a, ((140 - a.V.b) / 2) + i4, i5 + 7 + t.j, 20);
            a(aj[0], ((140 - a.V.b) / 2) + i4, i5 + 7 + t.j, a.V.a.getWidth(), a.V.a.getHeight());
            graphics.drawImage(a.W.a, ((140 - a.V.b) / 2) + i4, i5 + 5 + (t.j << 1) + 14, 20);
            a(aj[1], ((140 - a.V.b) / 2) + i4, i5 + 5 + (t.j << 1) + 14, a.W.a.getWidth(), a.W.a.getHeight());
            graphics.drawImage(a.X.a, i4 + 5, i5 + 5 + t.j + 12, 20);
            a(aj[2], i4 + 5, i5 + 5 + t.j + 12, a.X.a.getWidth(), a.X.a.getHeight());
            graphics.drawImage(a.Y.a, ((i4 + 140) - 5) - a.Y.b, i5 + 5 + t.j + 12, 20);
            a(aj[3], ((i4 + 140) - 5) - a.Y.b, i5 + 5 + t.j + 12, a.Y.a.getWidth(), a.Y.a.getHeight());
        }
        if (a.T == null || a.U == null) {
            return;
        }
        graphics.drawImage(a.T.a, i4 + 5, ((i5 + i3) - 5) - a.T.c, 20);
        a(ak[0], i4 + 5, ((i5 + i3) - 5) - a.T.c, a.T.a.getWidth(), a.T.a.getHeight());
        graphics.drawImage(a.U.a, ((i4 + 140) - 5) - a.U.b, ((i5 + i3) - 5) - a.U.c, 20);
        a(ak[1], ((i4 + 140) - 5) - a.U.b, ((i5 + i3) - 5) - a.U.c, a.U.a.getWidth(), a.U.a.getHeight());
    }

    public static void a(Graphics graphics, String str, long j2, int i2, int i3) {
        a(graphics, str, j2, i2, i3, 20);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(javax.microedition.lcdui.Graphics r12, java.lang.String r13, long r14, int r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 1491
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ca.a(javax.microedition.lcdui.Graphics, java.lang.String, long, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x023c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(javax.microedition.lcdui.Graphics r9, java.lang.String r10, java.lang.String r11, int r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 2754
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ca.a(javax.microedition.lcdui.Graphics, java.lang.String, java.lang.String, int, int, int):void");
    }

    public static void a(Graphics graphics, String str, String[] strArr) {
        if (str == null) {
            return;
        }
        l = 0;
        graphics.setClip(0, 0, t.b, t.c);
        if (h >= 0) {
            if (h == 0) {
                String[] strArrA = a(str, t.i, t.b - 10, "\t");
                H = strArrA;
                I = ((strArrA.length + 1) * t.j) + 20;
                a(graphics, (t.b / 2) * 3, (t.c - (I / 4)) / 2, t.b / 4, I / 4);
                J = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, strArr.length, 4);
            } else if (h == 1) {
                a(graphics, t.b / 4, (t.c - (I / 2)) / 2, t.b / 2, I / 2);
            } else if (h == 2) {
                a(graphics, t.b / 8, (t.c - ((I / 4) * 3)) / 2, (t.b / 4) * 3, (I / 4) * 3);
            } else {
                a(graphics, 0, (t.c - I) / 2, t.b, I);
                if (H != null) {
                    if (H.length == 1) {
                        a(graphics, H[0], (t.b - t.i.stringWidth(H[0])) / 2, ((t.c - I) / 2) + 10, 20, 16777215, 0);
                    } else {
                        for (int i2 = 0; i2 < H.length; i2++) {
                            a(graphics, H[i2], (t.b - t.i.stringWidth(H[i2])) / 2, (t.j * i2) + ((t.c - I) / 2) + 10, 20, 16777215, 0);
                        }
                    }
                }
                if (J == null) {
                    h = 0;
                    return;
                } else if (strArr.length == 2) {
                    a(strArr[0], 0, 10, ((((t.c - I) / 2) + I) - 9) - t.j);
                    a(graphics, strArr[0], J[0][0], J[0][1], 20, 16775357, 0);
                    a(strArr[1], 1, (t.b - 10) - t.i.stringWidth(strArr[1]), ((((t.c - I) / 2) + I) - 9) - t.j);
                    a(graphics, strArr[1], J[1][0], J[1][1], 20, 16775357, 0);
                } else {
                    a(strArr[0], 0, (t.b - t.i.stringWidth(strArr[0])) / 2, ((((t.c - I) / 2) + I) - 9) - t.j);
                    a(graphics, strArr[0], J[0][0], J[0][0], 20, 16775357, 0);
                }
            }
        }
        h++;
    }

    public static void a(Graphics graphics, Image image) {
        if (an == null || image == null) {
            return;
        }
        graphics.setColor(0);
        graphics.fillRect(0, 0, t.b, t.c);
        if (ap != null) {
            ap.a(graphics, t.b / 2, 20, 17);
        }
        graphics.setColor(16777215);
        graphics.drawString("正在载入资源...", t.b / 2, t.c / 2, 17);
        graphics.setColor(14459464);
        graphics.drawString(new StringBuffer().append((A * 100) / 100).append("%").toString(), t.b / 2, an[1] + 10, 17);
        graphics.drawImage(image, an[0] - 5, an[1] - 4, 20);
        graphics.setColor(16382066);
        graphics.fillRect(an[0], an[1], (A * 100) / 100, 3);
        graphics.setColor(14459464);
        graphics.fillRect(an[0], an[1] + 1, (A * 100) / 100, 2);
        int i2 = A + 1;
        A = i2;
        A = i2 <= 100 ? A : 100;
    }

    public static void a(Graphics graphics, Image image, int i2, int i3, int i4, int i5, boolean z2) {
        graphics.setColor(409969);
        graphics.fillRect(i2, i3, i4, i5);
        if (z2) {
            graphics.setColor(6597852);
        } else {
            graphics.setColor(5018307);
        }
        graphics.fillRect(i2 + 3, i3 + 3, i4 - 6, i5 - 6);
        if (z2) {
            graphics.setColor(16775125);
        } else {
            graphics.setColor(3775208);
        }
        graphics.drawRect(i2 + 1, i3 + 1, i4 - 3, i5 - 3);
    }

    public static void a(Graphics graphics, Image image, short s2, int i2, int i3, int i4, int i5) {
        graphics.setClip(i2, i3, i4, i5);
        int i6 = (i4 / s2) + (i4 % s2 != 0 ? 1 : 0);
        for (int i7 = 0; i7 < i6; i7++) {
            graphics.drawImage(image, (i7 * s2) + i2, i3, 20);
        }
        graphics.setClip(0, 0, t.b, t.c);
    }

    public static void a(int[] iArr) {
        ah = iArr;
    }

    private static void a(int[] iArr, int i2, int i3, int i4, int i5) {
        if (iArr != null) {
            iArr[0] = i2;
            iArr[1] = i3;
            iArr[2] = i4;
            iArr[3] = i5;
        }
    }

    private static String[] a(String str, String str2) {
        int iIndexOf;
        String[] strArrA = new String[0];
        do {
            iIndexOf = str.indexOf(str2);
            if (iIndexOf < 0) {
                return a(strArrA, str);
            }
            strArrA = a(strArrA, str.substring(0, iIndexOf));
            str = str.substring(str2.length() + iIndexOf);
        } while (iIndexOf >= 0);
        return strArrA;
    }

    public static String[] a(String str, Font font, int i2) {
        Vector vector = new Vector();
        do {
            String strC = c(str, font, i2);
            vector.addElement(strC);
            str = str.substring(strC.length());
        } while (str.length() != 0);
        String[] strArr = new String[vector.size()];
        vector.copyInto(strArr);
        return a(strArr);
    }

    public static String[] a(String str, Font font, int i2, String str2) {
        if (str == null) {
            str = "";
        }
        Vector vector = new Vector();
        for (String strSubstring : a(str, str2)) {
            do {
                String strB = b(strSubstring, font, i2);
                vector.addElement(strB);
                strSubstring = strSubstring.substring(strB.length());
            } while (strSubstring.length() != 0);
        }
        String[] strArr = new String[vector.size()];
        vector.copyInto(strArr);
        return a(strArr);
    }

    private static String[] a(String[] strArr) {
        Vector vector = new Vector();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (strArr[i2] != null && !strArr[i2].equals("")) {
                vector.addElement(strArr[i2]);
            }
        }
        String[] strArr2 = new String[vector.size()];
        vector.copyInto(strArr2);
        return strArr2;
    }

    private static String[] a(String[] strArr, String str) {
        if (str == null) {
            return strArr;
        }
        if (strArr == null) {
            return new String[]{str};
        }
        String[] strArr2 = new String[strArr.length + 1];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        strArr2[strArr2.length - 1] = str;
        return strArr2;
    }

    public static int b(int i2, int i3) {
        if (J == null) {
            return 0;
        }
        if (J.length < 1 || i2 < J[0][0] || i2 > J[0][0] + J[0][2] || i3 < J[0][1] || i3 > J[0][1] + J[0][3]) {
            return (J.length != 2 || i2 < J[1][0] || i2 > J[1][0] + J[1][2] || i3 < J[1][1] || i3 > J[1][1] + J[1][3]) ? 0 : 536870912;
        }
        return 268435456;
    }

    private static int b(String str) throws NumberFormatException {
        int i2 = -1;
        try {
            i2 = Integer.parseInt(str);
        } catch (Exception e2) {
        }
        if (i2 < 0 || i2 >= n.length) {
            return 15138723;
        }
        return n[i2];
    }

    private static String b(String str, Font font, int i2) {
        int iStringWidth = font.stringWidth(str);
        return iStringWidth <= i2 ? str : b(str.substring(0, (str.length() * i2) / iStringWidth), font, i2);
    }

    public static void b(int i2) {
        int i3;
        int length;
        if (i2 == 1) {
            if (o <= 0) {
                length = p.length - 1;
            } else {
                length = o - 1;
                o = length;
            }
            o = length;
            return;
        }
        if (i2 == 4) {
            if (o >= p.length - 1) {
                i3 = 0;
            } else {
                i3 = o + 1;
                o = i3;
            }
            o = i3;
        }
    }

    public static void b(Graphics graphics) {
        graphics.setClip(0, 0, t.b, t.c);
        a(graphics, 1808583, 95, M, N - (t.j + 4), O, t.j + 8 + 18);
        graphics.setColor(26540);
        graphics.drawRect(M, N - (t.j + 4), O, t.j + 8 + 18);
        graphics.drawRect(M + 2, N - (t.j + 2), O - 4, t.j + 8 + 14);
        graphics.setColor(11267556);
        graphics.drawRect(M + 1, N - (t.j + 3), O - 2, t.j + 8 + 16);
        a(graphics, Q, P, N, 36, 16777215, 727632);
        graphics.setColor(539727);
        graphics.fillRect(M + 2, N, O - 4, 18);
        graphics.setColor(4448748);
        graphics.drawRect(M + 3, N + 1, O - 6, 15);
        graphics.setColor(1265510);
        graphics.fillRect(M + 4, N + 3, O - 8, 12);
        graphics.setClip(M + 4, N + 3, O - 8, 12);
        int i2 = ((M + 3) + (l % (O + 15))) - 20;
        int i3 = N + 3;
        graphics.setColor(4432868);
        graphics.fillRect(i2 + 1, i3 + 1, 23, 10);
        graphics.setColor(10738430);
        graphics.fillRect(i2 + 2, i3 + 3, 21, 5);
        graphics.setColor(15333119);
        graphics.drawLine(i2 + 2, i3 + 5, i2 + 22, i3 + 5);
        graphics.setColor(26540);
        graphics.drawRect(i2, i3, 24, 11);
        graphics.drawLine(i2 + 12, i3, i2 + 12, i3 + 12);
        graphics.setClip(0, 0, t.b, t.c);
        l += 2;
    }

    public static void b(Graphics graphics, int i2, int i3, int i4, int i5) {
        a(graphics, 2);
        graphics.fillRect(i2, i3, 5, i5 - i3);
        a(graphics, 3);
        graphics.fillRect(i2 + 1, i3, 3, i5 - i3);
        a(graphics, 4);
        graphics.drawLine(i2 + 2, i3, i4 + 2, i5 - 1);
    }

    public static void b(Graphics graphics, int i2, int i3, int i4, int i5, int i6) {
        graphics.setColor(i2);
        int iAbs = Math.abs(i5);
        int i7 = i5 / iAbs;
        for (int i8 = 0; i8 < iAbs; i8++) {
            graphics.drawLine((i8 * i7) + i3, i4 - i8, (i8 * i7) + i3, i4 + i8);
        }
    }

    public static void b(Graphics graphics, String str, int i2, int i3, int i4, int i5) {
        if (str == null || i5 == 0 || str.trim().length() == 0) {
            return;
        }
        if (l >= 15) {
            int i6 = t.d - 20;
            String string = "";
            String strSubstring = str;
            while (true) {
                int iIndexOf = strSubstring.indexOf(62);
                if (iIndexOf < 0) {
                    string = new StringBuffer().append(string).append(strSubstring).toString();
                    break;
                }
                if (iIndexOf - 2 < 0 || strSubstring.charAt(iIndexOf - 2) != '<') {
                    string = new StringBuffer().append(string).append(strSubstring.substring(0, iIndexOf + 1)).toString();
                    strSubstring = strSubstring.substring(iIndexOf + 1);
                } else {
                    string = new StringBuffer().append(string).append(strSubstring.substring(0, iIndexOf - 2)).toString();
                    strSubstring = strSubstring.substring(iIndexOf + 1);
                }
                if (iIndexOf < 0) {
                    break;
                }
            }
            String[] strArrA = a(string.trim(), t.i, i6, "\t");
            int iMax = 0;
            for (String str2 : strArrA) {
                iMax = Math.max(iMax, t.i.stringWidth(str2) + 8);
            }
            X = Math.min(iMax, i6);
            if (i5 == 1) {
                V = new bw(str, (short) (X - 8));
                Y = (t.j * V.a()) + 8;
            } else if (i5 == 2) {
                W = a(str.trim(), t.i, X - 8, "\t");
                Y = (t.j * W.length) + 8;
            }
            if (X + i2 > t.f + t.d) {
                i2 = i2 - X >= t.f ? i2 - X : t.f + ((t.d - X) / 2);
            }
            Z = i2;
            if (Y + i3 > i4) {
                i3 = i3 - Y >= t.g ? i3 - Y : t.g + ((t.e - Y) / 2);
            }
            aa = i3;
            if (l == 15) {
                a(graphics, 1009050, 210, Z, aa, X / 4, Y / 4);
            } else if (l == 16) {
                a(graphics, 1009050, 210, Z, aa, X / 2, Y / 2);
            } else if (l == 17) {
                a(graphics, 1009050, 210, Z, aa, (X / 4) * 3, (Y / 4) * 3);
            } else {
                a(graphics, 1009050, 210, Z, aa, X, Y);
                graphics.setColor(16230);
                graphics.drawRect(Z, aa, X, Y);
                if (i5 == 1) {
                    V.a(graphics, Z + 4, aa + 4, 20);
                } else if (i5 == 2) {
                    graphics.setColor(15138723);
                    for (int i7 = 0; i7 < W.length; i7++) {
                        if (W[i7] != null) {
                            graphics.drawString(W[i7], Z + 4, aa + 4 + (t.j * i7), 0);
                        }
                    }
                }
            }
        }
        l++;
    }

    public static int c(int i2, int i3) {
        if (ai != null) {
            for (int i4 = 0; i4 < ai.length; i4++) {
                if (i2 >= ai[i4][0] && i2 <= ai[i4][0] + ai[i4][2] && i3 >= ai[i4][1] && i3 <= ai[i4][1] + ai[i4][3]) {
                    o = i4;
                    return 1073741824;
                }
            }
        }
        return (i2 < af[0] || i2 > af[0] + q || i3 < af[1] || i3 > af[1] + ag) ? 536870912 : 0;
    }

    private static String c(String str, Font font, int i2) {
        S = (short) 0;
        R = (short) 0;
        int iStringWidth = font.stringWidth(str);
        if (iStringWidth <= i2) {
            return str;
        }
        String strSubstring = str.substring(0, (str.length() * i2) / iStringWidth);
        for (int i3 = 0; i3 < strSubstring.length(); i3++) {
            char cCharAt = strSubstring.charAt(i3);
            if (cCharAt == '<') {
                R = (short) (R + 1);
            } else if (cCharAt == '>') {
                S = (short) (S + 1);
            }
        }
        if (R != S) {
            T = str.lastIndexOf(60);
            int iLastIndexOf = str.lastIndexOf(62);
            U = iLastIndexOf;
            if (iLastIndexOf - T >= 1) {
                try {
                    strSubstring = Integer.parseInt(str.substring(T + 1, U)) <= 41 ? str.substring(0, str.lastIndexOf(60)) : strSubstring;
                } catch (Exception e2) {
                }
            } else {
                strSubstring = str.substring(0, T);
            }
        }
        return c(strSubstring, font, i2);
    }

    public static void c(Graphics graphics) {
        l = 0;
        graphics.setClip(0, 0, t.b, t.c);
        graphics.setColor(11138815);
        graphics.fillRect(af[0], af[1], q, ag);
        graphics.setColor(14172);
        graphics.drawRect(af[0], af[1], q - 1, ag - 1);
        int i2 = 0;
        while (i2 < p.length) {
            graphics.setColor(o == i2 ? 1539988 : 6082765);
            graphics.fillRect(af[0] + 2, af[1] + 2 + ((t.j + 3) * i2), q - 4, t.j + 2);
            graphics.setColor(14172);
            graphics.drawRect(af[0] + 2, af[1] + 2 + ((t.j + 3) * i2), q - 5, t.j + 1);
            a(ai[i2], af[0] + 2, af[1] + 2 + ((t.j + 3) * i2), q - 5, t.j + 1);
            graphics.setColor(o == i2 ? 16053950 : 3756286);
            if (ah != null && i2 < ah.length && ah[i2] == 1) {
                graphics.setColor(8750469);
            }
            graphics.drawString(p[i2], af[0] + (q / 2), af[1] + 2 + ((t.j + 3) * i2), 17);
            i2++;
        }
        if (a.S == null || a.S.length != 4) {
            return;
        }
        graphics.drawImage(a.S[0].a, af[0], af[1], 20);
        graphics.drawImage(a.S[1].a, (af[0] + q) - a.S[1].b, af[1], 20);
        graphics.drawImage(a.S[2].a, af[0], (af[1] + ag) - a.S[2].c, 20);
        graphics.drawImage(a.S[3].a, (af[0] + q) - a.S[3].b, (af[1] + ag) - a.S[3].c, 20);
    }

    public static void c(Graphics graphics, int i2, int i3, int i4, int i5) {
        graphics.setColor(i);
        graphics.fillRect(i2, i3, 3, i5 - i3);
        graphics.setColor(K);
        graphics.drawLine(i2 + 1, i3, i4 + 1, i5);
    }

    public static void c(Graphics graphics, int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            a(graphics, 2511520, 210, i2, i3, i4, i5);
        } else if (i6 == 1) {
            graphics.setColor(15990);
            graphics.fillRect(i2, i3, i4, i5);
        }
        graphics.setColor(14172);
        graphics.drawRect(i2, i3, i4, i5);
        graphics.drawRect(i2 + 2, i3 + 2, i4 - 4, i5 - 4);
        graphics.setColor(11267556);
        graphics.drawRect(i2 + 1, i3 + 1, i4 - 2, i5 - 2);
    }

    public static int d(int i2, int i3) {
        if (aj != null) {
            for (int i4 = 0; i4 < aj.length; i4++) {
                if (i2 >= aj[i4][0] && i2 <= aj[i4][0] + aj[i4][2] && i3 >= aj[i4][1] && i3 <= aj[i4][1] + aj[i4][3]) {
                    switch (i4) {
                        case 0:
                            return 1;
                        case 1:
                            return 4;
                        case 2:
                            return 8;
                        case 3:
                            return 2;
                    }
                }
            }
        }
        if (ak == null) {
            return 0;
        }
        if (i2 < ak[0][0] || i2 > ak[0][0] + ak[0][2] || i3 < ak[0][1] || i3 > ak[0][1] + ak[0][3]) {
            return (i2 < ak[1][0] || i2 > ak[1][0] + ak[1][2] || i3 < ak[1][1] || i3 > ak[1][1] + ak[1][3]) ? 0 : 536870912;
        }
        return 268435456;
    }

    public static void d(Graphics graphics, int i2, int i3, int i4, int i5) {
        graphics.setClip(0, 0, t.b, t.c);
        graphics.setColor(16248869);
        graphics.drawLine(i2, i3, i2 + 4, i3);
        graphics.drawLine(i2, i3, i2, i3 + 4);
        graphics.drawLine(i2, (i3 + i5) - 4, i2, i3 + i5);
        graphics.drawLine(i2, i3 + i5, i2 + 4, i3 + i5);
        graphics.drawLine((i2 + i4) - 4, i3, i2 + i4, i3);
        graphics.drawLine(i2 + i4, i3, i2 + i4, i3 + 4);
        graphics.drawLine(i2 + i4, (i3 + i5) - 4, i2 + i4, i3 + i5);
        graphics.drawLine((i2 + i4) - 4, i3 + i5, i2 + i4, i3 + i5);
    }

    public static void e(Graphics graphics, int i2, int i3, int i4, int i5) {
        graphics.setColor(16777215);
        graphics.fillRect(i2 + 1, i3 + 1, 20, 2);
        graphics.setColor(i5 == 0 ? 16711680 : 48127);
        graphics.fillRect(i2 + 1, i3 + 1, i4, 2);
        graphics.setColor(i5 == 0 ? 10945027 : 230064);
        graphics.fillRect(i2 + 1, i3 + 2, i4, 1);
        graphics.drawImage(a.Z.a, i2, i3, 20);
    }

    public static boolean e(int i2, int i3) {
        return al != null && i2 >= al[0] && i2 <= al[0] + al[2] && i3 >= al[1] && i3 <= al[1] + al[3];
    }

    public static int f(int i2, int i3) {
        int iNextInt = (aq.nextInt() % (i3 - i2)) + i2;
        if (iNextInt < 0) {
            iNextInt = -iNextInt;
        }
        if (iNextInt == 0) {
            return 1;
        }
        return iNextInt;
    }

    public static void f(Graphics graphics, int i2, int i3, int i4, int i5) {
        graphics.setClip(0, 0, t.b, t.c);
        a(graphics, 2);
        graphics.drawRect(i2 - 4, i3 - 4, i4 + 7, i5 + 7);
        graphics.drawRect(i2, i3, i4 - 1, i5 - 1);
        a(graphics, 3);
        graphics.drawRect(i2 - 3, i3 - 3, i4 + 5, i5 + 5);
        graphics.drawRect(i2 - 1, i3 - 1, i4 + 1, i5 + 1);
        a(graphics, 4);
        graphics.drawRect(i2 - 2, i3 - 2, i4 + 3, i5 + 3);
        if (a.y != null) {
            graphics.drawImage(a.y.a, i2 - 4, i3 - 4, 20);
        }
        if (a.z != null) {
            graphics.drawImage(a.z.a, i2 - 4, ((i5 + 4) + i3) - a.z.c, 20);
        }
        if (a.w != null) {
            graphics.drawImage(a.w.a, ((i2 + 4) + i4) - a.w.b, i3 - 4, 20);
        }
        if (a.x != null) {
            graphics.drawImage(a.x.a, ((i2 + 4) + i4) - a.x.b, ((i5 + 4) + i3) - a.x.c, 20);
        }
    }
}

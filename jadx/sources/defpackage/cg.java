package defpackage;

import com.yinhan.kjava.main.a;
import java.io.DataInputStream;
import java.io.IOException;
import javax.microedition.lcdui.Graphics;

/* loaded from: java版梦回西游3区251011.jar:cg.class */
public final class cg {
    private ao e;
    private a f;
    private ai g;
    private bc h;
    private bc i;
    public static int a;
    private static String j;
    private static int k;
    private static int l;
    private static int m;
    private static int n;
    private static int o;
    private static String p;
    private static int q;
    private static int r;
    private static int s;
    private static int t;
    private static short u;
    private static short v;
    private static short w;
    private static short x;
    private static short y;
    private static short z;
    private static short A;
    private static short B;
    private static byte C;
    private static int[] D;
    private static int E;
    private static int F;
    public static int b = 0;
    public static int c = 0;
    public static boolean d = false;
    private int G;
    private an H;
    private an I;
    private int[][] J;
    private int K;
    private String L;
    private String M;

    public cg(ao aoVar, a aVar, ai aiVar) {
        this.e = aoVar;
        this.f = aVar;
        this.g = aiVar;
    }

    public static void a(int i) {
        a = bt.fA[i];
        j = bt.fB[i];
        l = bt.fM[i];
        m = bt.fN[i];
        n = bt.fO[i];
        o = bt.fP[i];
        u = bt.fE[i];
        v = bt.fF[i];
        w = bt.fG[i];
        x = bt.fH[i];
        k = -1;
        p = "";
        y = (short) -1;
        q = -1;
        r = -1;
        s = -1;
        t = -1;
        E = 0;
        F = -1;
    }

    public final void a() {
        a = -1;
        j = null;
        u = (short) -1;
        l = -1;
        m = -1;
        n = -1;
        o = -1;
        k = -1;
        p = "";
        y = (short) -1;
        q = -1;
        r = -1;
        s = -1;
        t = -1;
        F = -1;
        E = 0;
        this.h = null;
        this.i = null;
    }

    public static void a(DataInputStream dataInputStream) throws IOException {
        byte b2 = dataInputStream.readByte();
        C = b2;
        if (b2 == 0) {
            int i = dataInputStream.readShort();
            D = new int[i];
            for (int i2 = 0; i2 < i; i2++) {
                D[i2] = dataInputStream.readInt();
            }
            int i3 = b;
            a = bt.fA[i3];
            j = bt.fB[i3];
            l = bt.fM[i3];
            m = bt.fN[i3];
            n = bt.fO[i3];
            o = bt.fP[i3];
            u = bt.fE[i3];
            v = bt.fF[i3];
            w = bt.fG[i3];
            x = bt.fH[i3];
            return;
        }
        if (C != 1) {
            if (C == 2) {
                F = dataInputStream.readInt();
                return;
            }
            return;
        }
        k = bt.fA[c];
        dataInputStream.readUTF();
        p = dataInputStream.readUTF();
        q = dataInputStream.readInt();
        r = dataInputStream.readInt();
        s = dataInputStream.readInt();
        t = dataInputStream.readInt();
        E = dataInputStream.readInt();
        for (int i4 = 0; i4 < bt.fA.length; i4++) {
            if (bt.fA[i4] == k) {
                y = bt.fE[i4];
                z = bt.fF[i4];
                A = bt.fG[i4];
                B = bt.fH[i4];
            }
        }
        d = false;
    }

    private static void c() {
        bt.fw = null;
        if (bt.fA == null || bt.fA.length <= 0) {
            return;
        }
        bt.fw = new int[D.length - (k != -1 ? 0 + 1 : 0)];
        int i = 0;
        for (int i2 = 0; i2 < D.length; i2++) {
            for (int i3 = 0; i3 < bt.fA.length; i3++) {
                if (bt.fA[i3] == D[i2] && bt.fA[i3] != k) {
                    bt.fw[i] = i3;
                    i++;
                }
            }
        }
    }

    private void a(int i, int i2, int i3, int i4, int i5) {
        if (this.J == null || this.J.length <= i) {
            return;
        }
        this.J[i][0] = i2;
        this.J[i][1] = i3;
        this.J[i][2] = 50;
        this.J[i][3] = 50;
    }

    public final int a(int i, int i2) {
        if (this.e.l == 1) {
            return ca.c(i, i2);
        }
        int iB = this.f.aq.b(i, i2);
        int iB2 = iB;
        if (iB <= 0) {
            iB2 = this.H.b(i, i2);
        }
        if (iB2 <= 0) {
            iB2 = this.I.b(i, i2);
        }
        if (iB2 <= 0) {
            for (int i3 = 0; i3 < this.J.length; i3++) {
                if (i >= this.J[i3][0] && i <= this.J[i3][0] + this.J[i3][2] && i2 >= this.J[i3][1] && i2 <= this.J[i3][1] + this.J[i3][3]) {
                    if (i3 == 0) {
                        this.K = 0;
                    } else {
                        this.K = 1;
                    }
                    iB2 = 268435456;
                }
            }
        }
        return iB2;
    }

    public final void b() {
        this.K = 0;
        if (this.J != null) {
            for (int i = 0; i < this.J.length; i++) {
                if (this.J[i] != null) {
                    this.J[i] = null;
                }
            }
            this.J = null;
        }
        this.J = new int[2][4];
        this.H = new an();
        this.I = new an();
        this.L = new StringBuffer().append("继承前\t").append(j).append("\t").append("星级: \t").append("攻击：").append(l).append("-").append(m).append("\t").append("法功：").append(n).append("-").append(o).toString();
        if (k != -1) {
            this.M = new StringBuffer().append("继承后\t").append(j).append("\t").append("<0>星级: ").append(p).append("\t").append("<2>攻击：").append(q).append("-").append(r).append("\t").append("法功：").append(s).append("-").append(t).toString();
        } else {
            this.M = "继承后";
        }
        this.f.aq.b();
        this.f.aq.a("星级继承");
        this.f.aq.a(true);
        this.H.a(this.L, t.i, (byte) 2);
        this.I.a(this.M, t.i, (byte) 2);
        if (a != -1 && u != -1) {
            ao.a(u, v, w, x);
            this.h = a.ah.a(String.valueOf(new StringBuffer().append((int) u).append("_0").toString()), v, w, x);
        } else if (this.h != null) {
            this.h.a();
            this.h = null;
        }
        if (k != -1 && y != -1) {
            ao.a(y, z, A, B);
            this.i = a.ah.a(String.valueOf(new StringBuffer().append((int) y).append("_0").toString()), z, A, B);
        } else if (this.i != null) {
            this.i.a();
            this.i = null;
        }
        if (t.c > 220) {
            this.f.au.a("");
            this.f.aq.a(this.f.au);
        }
        this.G = (((this.f.aq.d - 32) - t.j) / 3) - 10;
        this.f.aq.a(t.f, t.g, t.d, t.e);
        this.H.a(this.f.aq.a + 5, this.f.aq.b + 32 + this.G, this.f.aq.c - 11, this.G + 10);
        this.I.a(this.f.aq.a + 5, this.f.aq.b + 32 + (2 * this.G) + 10, this.f.aq.c - 11, this.G + 10);
        ca.l = 0;
        this.e.l = (short) 0;
        this.f.j = this.f.k;
        ao aoVar = this.e;
        this.e.k = (short) 131;
        aoVar.j = (short) 131;
    }

    public final void b(int i) throws IOException {
        if (F == 1) {
            F = 0;
            this.f.b("宠物星级继承成功");
            i = 0;
            this.e.c(0, this.e.aE, this.e.aA);
            this.e.E();
            ca.o = 3;
            this.e.l = (short) 1;
        }
        if (this.e.l == 0) {
            if (this.f.aq != null) {
                this.f.aq.b(i);
                this.H.b(i);
                this.I.b(i);
            }
            if (a != -1 && this.h != null) {
                ai.a(this.h, this.f.ak);
            }
            if (k != -1 && this.i != null) {
                ai.a(this.i, this.f.ak);
            }
            if (i == 8 || i == 2) {
                this.K = this.K == 1 ? 0 : 1;
                ca.l = 0;
                return;
            }
            if (i != 268435456 && i != 1073741824) {
                if (i == 536870912) {
                    this.e.c(0, this.e.aE, this.e.aA);
                    this.e.E();
                    ca.o = 3;
                    this.e.l = (short) 1;
                    return;
                }
                return;
            }
            if (this.K == 0) {
                if (a == -1) {
                    this.e.j(0);
                    return;
                } else {
                    ca.a(t.b / 2, t.c / 2, new String[]{"继承", "更换"}, true);
                    this.e.l = (short) 1;
                    return;
                }
            }
            if (this.K == 1) {
                if (a == -1) {
                    this.f.b("请先放入主宠");
                    return;
                }
                if (k != -1) {
                    ca.a(t.b / 2, t.c / 2, new String[]{"更换"}, true);
                    this.e.l = (short) 1;
                    return;
                }
                c();
                if (bt.fw == null || bt.fw.length <= 0) {
                    this.f.b("您没有符合要求的副宠");
                    return;
                } else {
                    d = true;
                    this.e.j(11);
                    return;
                }
            }
            return;
        }
        if (this.e.l == 1) {
            ca.b(i);
            if (i == 536870912) {
                this.e.l = (short) 0;
                return;
            }
            if (i == 268435456 || i == 1073741824) {
                if (this.K != 0) {
                    if (this.K == 1 && ca.o == 0) {
                        c();
                        if (bt.fw == null || bt.fw.length <= 0) {
                            this.f.b("您没有符合要求的副宠");
                            return;
                        } else {
                            d = true;
                            this.e.j(11);
                            return;
                        }
                    }
                    return;
                }
                if (ca.o == 0) {
                    if (a == -1 || k == -1) {
                        this.f.b("请先放入副宠");
                        return;
                    }
                    byte[] bArrB = bz.b((byte) 2, a, k, E);
                    if (bArrB == null) {
                        this.f.b("获取上传指令数据错误!");
                        return;
                    } else {
                        a.i.a(new w((short) 4691, bArrB));
                        this.f.a((String) null);
                        return;
                    }
                }
                if (ca.o == 1) {
                    bt.fw = null;
                    if (bt.fA != null && bt.fA.length > 0) {
                        int i2 = 0;
                        for (int i3 = 0; i3 < bt.fA.length; i3++) {
                            if (bt.gf[i3].equals("")) {
                                i2++;
                            }
                        }
                        if (i2 - 1 > 0) {
                            bt.fw = new int[i2 - 1];
                            int i4 = 0;
                            for (int i5 = 0; i5 < bt.fA.length; i5++) {
                                if (bt.fA[i5] != a && bt.gf[i5].equals("")) {
                                    bt.fw[i4] = i5;
                                    i4++;
                                }
                            }
                        }
                    }
                    if (bt.fw == null || bt.fw.length <= 0) {
                        this.f.b("您没有主宠可以选择");
                    } else {
                        this.e.j(11);
                    }
                }
            }
        }
    }

    public final void a(Graphics graphics) {
        if (this.f.aq != null) {
            this.f.aq.a(graphics);
            this.H.a(graphics);
            this.I.a(graphics);
            ca.a(graphics, this.f.aq.a + 5, this.f.aq.b + 32, this.f.aq.c - 11, this.G, 1);
        }
        ca.a(graphics, this.f.aq.a + 5 + 25, this.f.aq.b + 32 + 10, 50, 50, 1);
        graphics.setColor(2917024);
        graphics.fillRect(this.f.aq.a + 5 + 25 + (this.f.aq.c / 2), this.f.aq.b + 32 + 10, 50, 50);
        graphics.setColor(9360850);
        graphics.drawRect(this.f.aq.a + 5 + 25 + (this.f.aq.c / 2), this.f.aq.b + 32 + 10, 49, 49);
        a(0, this.f.aq.a + 5 + 25, this.f.aq.b + 32 + 10, 50, 50);
        a(1, this.f.aq.a + 5 + 25 + (this.f.aq.c / 2), this.f.aq.b + 32 + 10, 50, 50);
        ca.d(graphics, this.J[this.K][0], this.J[this.K][1], 50, 50);
        if (a != -1 && this.h != null) {
            this.g.a(graphics, this.h, (int[]) null, 0, 0, this.f.aq.a + 5 + 25, this.f.aq.b + 32 + 10, 0, 0);
        }
        if (k == -1 || this.i == null) {
            graphics.setColor(16776960);
            graphics.drawString("副宠", this.f.aq.a + 5 + 25 + (this.f.aq.c / 2) + 25, this.f.aq.b + 32 + 10 + (t.j / 4) + 25, 65);
        } else {
            this.g.a(graphics, this.i, (int[]) null, 0, 0, this.f.aq.a + 5 + 25 + (this.f.aq.c / 2), this.f.aq.b + 32 + 10, 0, 0);
        }
        if (this.e.l == 1) {
            ca.c(graphics);
        }
    }
}

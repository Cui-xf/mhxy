package defpackage;

import com.yinhan.kjava.main.a;
import java.io.DataInputStream;
import java.io.IOException;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* loaded from: java版梦回西游3区251011.jar:o.class */
public final class o {
    private ao i;
    private a j;
    private ai k;
    private int[][] l;
    private static String m;
    private static String n;
    private static String o;
    private static String p;
    private static String q;
    private static String r;
    private static String s;
    private static short t;
    private static String u;
    public int f;
    public static int g;
    private static short v;
    private static String w;
    private static long x;
    private static String y;
    private static short z;
    private static String A;
    private static byte[] B;
    private static int[] C;
    private static int[] D;
    private static int E;
    private String F;
    private int[][] G;
    private int H;
    private int I;
    private int J;
    private bf K;
    private bf L;
    public static byte e = -1;
    public static byte h = 0;
    public byte a = 0;
    public byte b = 0;
    public short c = 0;
    public int d = 0;
    private int M = 0;
    private boolean N = false;
    private boolean[] O = null;
    private String[] P = {"物攻", "防御", "法攻", "冰抗", "火抗", "雷抗", "生命", "内力", "速度", "暴击", "连击", "反震"};

    public o(ao aoVar, a aVar, ai aiVar) {
        int[] iArr = {15588137, 15531505, 955345, 6893779};
        this.i = aoVar;
        this.j = aVar;
        this.k = aiVar;
    }

    public final void a(int i, short s2, int i2) {
        this.i.l = (short) 0;
        this.b = (byte) i;
        this.c = s2;
        this.d = i2;
        e();
        if (bt.kr != null) {
            this.l = new int[bt.kr.length][4];
        }
        this.i.a(bt.kr);
        this.j.aq.b();
        this.j.aq.a(bt.kp);
        this.j.aq.a(false);
        this.j.aq.a(30);
        this.j.at.a(bt.a(this.j.l), t.i, (byte) 1);
        this.j.au.a("确定");
        this.j.aq.a(this.j.at);
        if (t.c > 220) {
            this.j.aq.a(this.j.au);
        }
        this.j.aq.a(t.f, t.g, t.d, t.e);
        int iStringWidth = this.j.aq.a + 10 + t.i.stringWidth("宝石:");
        int i3 = this.j.aq.b + 37;
        if (this.l != null) {
            for (int i4 = 0; i4 < this.l.length; i4++) {
                int i5 = i4;
                int i6 = iStringWidth + 2 + (i4 * 17);
                if (this.l != null && this.l.length > i5) {
                    this.l[i5][0] = i6;
                    this.l[i5][1] = i3;
                    this.l[i5][2] = 17;
                    this.l[i5][3] = 17;
                }
            }
        }
        this.j.j = this.j.k;
        ao aoVar = this.i;
        this.i.k = (short) 64;
        aoVar.j = (short) 64;
    }

    private void e() {
        if (this.l != null) {
            for (int i = 0; i < this.l.length; i++) {
                if (this.l[i] != null) {
                    this.l[i] = null;
                }
            }
            this.l = null;
        }
    }

    public final void a(int i) throws IOException {
        byte length;
        byte b;
        if (this.i.l != 0) {
            if (this.i.l == 1) {
                ca.b(i);
                if (i != 268435456 && i != 1073741824 && i != 517) {
                    if (i == 536870912) {
                        this.i.l = (short) 0;
                        return;
                    }
                    return;
                } else {
                    if (ca.o == 0) {
                        this.i.a((byte) 1, new byte[]{30});
                        return;
                    }
                    if (ca.o == 1) {
                        e = (byte) 1;
                        byte[] bArrA = bz.a((short) 4687, bt.ko, (byte) 2, this.c == 13 ? bt.jG : 0, 0, (byte) 0, "", bt.ad);
                        if (bArrA == null) {
                            this.j.b("获取上传指令数据错误!");
                            return;
                        } else {
                            a.i.a(new w((short) 4687, bArrA));
                            this.j.a((String) null);
                            return;
                        }
                    }
                    return;
                }
            }
            if (this.i.l == 2) {
                ca.b(i);
                if (i != 268435456 && i != 1073741824 && i != 517) {
                    if (i == 536870912) {
                        this.i.l = (short) 0;
                        return;
                    }
                    return;
                }
                if (ca.o == 0) {
                    if (this.c == 13) {
                        byte[] bArrA2 = bz.a((short) 4687, bt.ko, (byte) 0, bt.jG, 0, this.b, "", bt.ad);
                        if (bArrA2 == null) {
                            this.j.b("获取上传指令数据错误!");
                            return;
                        } else {
                            a.i.a(new w((short) 4687, bArrA2));
                            this.j.a((String) null);
                            return;
                        }
                    }
                    byte[] bArrG = bz.g((short) 4647, bt.ad, bt.ko, this.b);
                    if (bArrG == null) {
                        this.j.b("获取上传指令数据错误!");
                        return;
                    } else {
                        a.i.a(new w((short) 4647, bArrG));
                        this.j.a((String) null);
                        return;
                    }
                }
                if (ca.o != 1) {
                    if (ca.o == 2) {
                        e = (byte) 1;
                        byte[] bArrA3 = bz.a((short) 4687, bt.ko, (byte) 2, this.c == 13 ? bt.jG : 0, 0, (byte) 0, "", bt.ad);
                        if (bArrA3 == null) {
                            this.j.b("获取上传指令数据错误!");
                            return;
                        } else {
                            a.i.a(new w((short) 4687, bArrA3));
                            this.j.a((String) null);
                            return;
                        }
                    }
                    return;
                }
                e = (byte) 1;
                if (this.c == 13) {
                    byte[] bArrA4 = bz.a((short) 4687, bt.ko, (byte) 1, bt.jG, 0, this.b, "", bt.ad);
                    if (bArrA4 == null) {
                        this.j.b("获取上传指令数据错误!");
                        return;
                    } else {
                        a.i.a(new w((short) 4687, bArrA4));
                        this.j.a((String) null);
                        return;
                    }
                }
                byte[] bArrF = bz.f((short) 4646, bt.ad, bt.ko, this.b);
                if (bArrF == null) {
                    this.j.b("获取上传指令数据错误!");
                    return;
                } else {
                    a.i.a(new w((short) 4646, bArrF));
                    this.j.a((String) null);
                    return;
                }
            }
            return;
        }
        if (this.j.aq != null) {
            this.j.aq.b(i);
        }
        if (i == 268435456 || i == 1073741824 || i == 517) {
            if (bt.kr != null) {
                if (!((this.c == 4 && this.d == 0) || this.c == 5 || this.c == 13) || bt.kr[this.b] <= -1) {
                    return;
                }
                if (bt.kr[this.b] == 0) {
                    ca.a(this.j.aq.a + 10 + t.i.stringWidth("宝石:") + 12 + (this.b * 17), this.j.aq.b + 45, new String[]{"镶嵌", "全部挖出"}, false);
                    this.a = this.b;
                    this.i.l = (short) 1;
                    return;
                } else {
                    ca.a(this.j.aq.a + 10 + t.i.stringWidth("宝石:") + 12 + (this.b * 17), this.j.aq.b + 45, new String[]{"查看", "挖出", "全部挖出"}, false);
                    this.a = this.b;
                    this.i.l = (short) 2;
                    return;
                }
            }
            return;
        }
        if (i == 8 || i == 516) {
            if (bt.kr != null) {
                if (this.b <= 0) {
                    length = (byte) (bt.kr.length - 1);
                } else {
                    byte b2 = (byte) (this.b - 1);
                    length = b2;
                    this.b = b2;
                }
                this.b = length;
                return;
            }
            return;
        }
        if (i == 2 || i == 518) {
            if (bt.kr != null) {
                if (this.b >= ((byte) (bt.kr.length - 1))) {
                    b = 0;
                } else {
                    byte b3 = (byte) (this.b + 1);
                    b = b3;
                    this.b = b3;
                }
                this.b = b;
                return;
            }
            return;
        }
        if (i == 536870912) {
            e = (byte) -1;
            e();
            bt.K();
            if (this.c == 4) {
                byte b4 = (byte) this.i.aq;
                byte b5 = (byte) this.i.ar;
                this.i.e(this.d);
                this.i.aq = b4;
                this.i.ar = b5;
                this.i.q();
                return;
            }
            if (this.c == 11) {
                byte b6 = (byte) this.i.aq;
                byte b7 = (byte) this.i.ar;
                this.i.n(this.d);
                this.i.aq = b6;
                this.i.ar = b7;
                return;
            }
            if (this.c == 23) {
                this.i.I();
                return;
            }
            if (this.c == 59) {
                this.i.l((byte) this.d);
                return;
            }
            if (this.c == 22) {
                byte b8 = (byte) this.j.ax;
                byte b9 = (byte) this.i.ar;
                this.i.b((byte) this.d, true);
                this.j.ax = b8;
                this.i.ar = b9;
                return;
            }
            if (this.c == 102) {
                this.i.V.a(false);
                return;
            }
            if (this.c == 106) {
                this.i.O.a(false);
                return;
            }
            if (this.c == 115) {
                this.i.M.o();
                return;
            }
            if (this.c == 110) {
                this.i.P.a(true);
                return;
            }
            if (this.c == 118) {
                this.i.Q.a(true);
                return;
            }
            if (this.c == 5) {
                this.i.t();
                return;
            }
            if (this.c == 13) {
                this.i.c(false);
                return;
            }
            this.i.l = (short) 0;
            ao aoVar = this.i;
            this.i.k = (short) 0;
            aoVar.j = (short) 0;
            a.f.a(this.i.f, ao.h, ao.i, true, false, 1009050);
        }
    }

    public final void a(Graphics graphics) {
        if (this.j.aq != null) {
            this.j.aq.a(30);
            this.j.aq.a(graphics);
            ca.a(graphics, this.j.aq.a + 5, this.j.aq.b + 32, this.j.aq.c - 11, 30, 1);
            ca.a(graphics, "宝石", this.j.aq.a + 10, this.j.aq.b + 35 + t.a(25), 20, 16776960, 0);
        }
        if (bt.kr != null) {
            this.i.a(graphics, this.j.aq.a + 10 + t.i.stringWidth("宝石:"), this.j.aq.b + 37, 17, 17, bt.kr.length, 1);
            byte b = 0;
            while (true) {
                byte b2 = b;
                if (b2 >= bt.kr.length) {
                    break;
                }
                if (bt.kr[b2] <= -1) {
                    ca.a(graphics, 125269879, 207, this.j.aq.a + 10 + t.i.stringWidth("宝石:") + 2 + (b2 * 17), this.j.aq.b + 39, 17, 17);
                }
                if (bt.kr[b2] > 0) {
                    a.f.a(graphics, ao.b(bt.kr[b2]), (int[]) null, (aj) null, 0, 0, this.j.aq.a + 10 + t.i.stringWidth("宝石:") + 2 + (b2 * 17), this.j.aq.b + 39, 0, 0);
                }
                b = (byte) (b2 + 1);
            }
            if ((this.c == 4 && this.d == 0) || this.c == 5 || this.c == 13) {
                graphics.setColor(16776960);
                graphics.drawRect(this.j.aq.a + 10 + t.i.stringWidth("宝石:") + 2 + (this.b * 17), this.j.aq.b + 39, 17, 17);
            }
        }
        if (this.i.l == 1 || this.i.l == 2) {
            ca.c(graphics);
        }
    }

    public final int a(int i, int i2, int i3) {
        if (this.l != null) {
            for (int i4 = 0; i4 < this.l.length; i4++) {
                if (i2 >= this.l[i4][0] && i2 <= this.l[i4][0] + this.l[i4][2] && i3 >= this.l[i4][1] && i3 <= this.l[i4][1] + this.l[i4][3]) {
                    if (this.b == i4) {
                        return 268435456;
                    }
                    this.b = (byte) (i4 - 1);
                    return 2;
                }
            }
        }
        return i;
    }

    public final void a() {
        this.i.l = (short) 0;
        this.j.aq.b();
        this.j.aq.a("装备打孔");
        this.j.ar.a((Image[]) null, bt.kn, (String[]) null, (String[]) null);
        this.j.au.a("确定");
        if (bt.km == null || bt.km.length <= 0) {
            this.j.at.a((String) null, t.i, (byte) 2);
        } else {
            this.j.at.a(bt.i(this.j.l, this.j.ar.g()), t.i, (byte) 2);
        }
        this.j.at.a((byte) 1);
        this.j.aq.a(this.j.ar);
        this.j.aq.a(this.j.at);
        if (t.c > 220) {
            this.j.aq.a(this.j.au);
        }
        this.j.aq.a(t.f, t.g, t.d, t.e);
        a aVar = this.j;
        this.j.k = (short) 7;
        aVar.j = (short) 7;
        ao aoVar = this.i;
        this.i.k = (short) 65;
        aoVar.j = (short) 65;
    }

    public final void b(int i) {
        if (this.i.l != 0) {
            if (this.i.l == 1) {
                ca.b(i);
                if (i == 268435456 || i == 1073741824 || i == 517) {
                    if (ca.o == 0) {
                        this.i.e(10);
                        return;
                    }
                    return;
                } else {
                    if (i == 536870912) {
                        this.i.l = (short) 0;
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (this.j.aq != null) {
            this.j.aq.b(i);
        }
        if (i == 514 || i == 520 || i == 1 || i == 4) {
            if (bt.km == null || bt.km.length <= 0) {
                return;
            }
            this.j.at.a(bt.i(this.j.l, this.j.ar.g()), t.i, (byte) 2);
            this.j.at.a((byte) 1);
            return;
        }
        if (i != 268435456 && i != 1073741824 && i != 517) {
            if (i == 536870912) {
                this.i.m();
            }
        } else {
            if (bt.km == null || bt.km.length <= 0) {
                return;
            }
            this.i.e(10);
        }
    }

    public final void b(Graphics graphics) {
        if (this.i.l == 0 && this.j.aq != null) {
            this.j.aq.a(graphics);
        }
        if (this.i.l == 1) {
            ca.c(graphics);
        }
    }

    public final void b() {
        this.j.b("此界面正在维护，如有不便之处请谅解!");
    }

    public final void c(int i) {
        if (i == 536870912) {
            ao aoVar = this.i;
            this.i.k = (short) 0;
            aoVar.j = (short) 0;
        }
    }

    public static void a(DataInputStream dataInputStream) throws IOException {
        m = dataInputStream.readUTF();
        dataInputStream.readShort();
        n = dataInputStream.readUTF();
        o = dataInputStream.readUTF();
        p = dataInputStream.readUTF();
        q = dataInputStream.readUTF();
        r = dataInputStream.readUTF();
        s = dataInputStream.readUTF();
        t = dataInputStream.readShort();
        u = dataInputStream.readUTF();
    }

    public final void c() {
        this.j.aq.b();
        this.j.aq.a(m);
        an anVar = this.j.at;
        StringBuffer stringBuffer = this.j.l;
        StringBuffer stringBuffer2 = stringBuffer;
        if (stringBuffer == null) {
            stringBuffer2 = new StringBuffer();
        } else {
            t.a(stringBuffer2);
        }
        stringBuffer2.append(m);
        stringBuffer2.append("\t");
        if (n != null && n.length() > 0) {
            stringBuffer2.append(n);
            stringBuffer2.append('\t');
        }
        if (o != null && o.length() > 0) {
            stringBuffer2.append(o);
            stringBuffer2.append('\t');
        }
        if (p != null && p.length() > 0) {
            stringBuffer2.append(p);
            stringBuffer2.append('\t');
        }
        if (q != null && q.length() > 0) {
            stringBuffer2.append(q);
            stringBuffer2.append('\t');
        }
        if (r != null && r.length() > 0) {
            stringBuffer2.append(r);
            stringBuffer2.append('\t');
        }
        if (s != null && s.length() > 0) {
            stringBuffer2.append(s);
            stringBuffer2.append('\t');
        }
        if (t > 0) {
            stringBuffer2.append("要求装备等级:");
            stringBuffer2.append((int) t);
            stringBuffer2.append('\t');
        }
        if (u != null && !u.equals("")) {
            stringBuffer2.append(u);
        }
        anVar.a(stringBuffer2.toString(), t.i, (byte) 1);
        this.j.au.a("确定");
        this.j.aq.a(this.j.at);
        if (t.c > 220) {
            this.j.aq.a(this.j.au);
        }
        this.j.aq.a(t.f, t.g, t.d, t.e);
        a aVar = this.j;
        this.j.k = (short) 7;
        aVar.j = (short) 7;
        ao aoVar = this.i;
        this.i.k = (short) 67;
        aoVar.j = (short) 67;
    }

    public final void d(int i) {
        if (this.j.aq != null) {
            this.j.aq.b(i);
        }
        if (i == 536870912) {
            m = null;
            u = null;
            n = null;
            o = null;
            q = null;
            r = null;
            s = null;
            a((int) this.a, this.c, this.d);
        }
    }

    public final void c(Graphics graphics) {
        if (this.j.aq != null) {
            this.j.aq.a(graphics);
        }
    }

    public final void b(DataInputStream dataInputStream) throws IOException {
        g = dataInputStream.readInt();
        v = dataInputStream.readShort();
        w = dataInputStream.readUTF();
        x = dataInputStream.readLong();
        y = dataInputStream.readUTF();
        z = dataInputStream.readShort();
        A = dataInputStream.readUTF();
        int i = dataInputStream.readByte();
        if (i > 0) {
            B = new byte[i];
            C = new int[i];
            D = new int[i];
            for (int i2 = 0; i2 < i; i2++) {
                B[i2] = dataInputStream.readByte();
                C[i2] = dataInputStream.readInt();
                D[i2] = dataInputStream.readInt();
            }
        } else {
            B = null;
            C = null;
            D = null;
        }
        E = dataInputStream.readInt();
        this.M = 0;
        dataInputStream.readUTF();
        dataInputStream.readByte();
        bt.N();
        f(g);
        f((int) x);
        g();
    }

    private static void f(int i) {
        if (bt.bC == null || bt.bC.size() <= 0) {
            return;
        }
        for (int i2 = 0; i2 < bt.bC.size(); i2++) {
            bn bnVar = (bn) bt.bC.elementAt(i2);
            if (bnVar != null && bnVar.a == i) {
                bnVar.v = (byte) (bnVar.v + 1);
            }
        }
    }

    private void f() {
        if (this.G != null) {
            for (int i = 0; i < this.G.length; i++) {
                if (this.G[i] != null) {
                    this.G[i] = null;
                }
            }
            this.G = null;
        }
    }

    private void g() {
        this.F = null;
        if (this.f == 0) {
            if (w != null) {
                this.F = w;
            }
        } else {
            if (this.f != 1 || A == null) {
                return;
            }
            this.F = y;
        }
    }

    public final void d() {
        g = -1;
        v = (short) -1;
        w = null;
        x = -1L;
        z = (short) -1;
        y = null;
        A = null;
        B = null;
        C = null;
        D = null;
        this.M = 0;
        E = 0;
        this.O = null;
        h = (byte) 0;
        this.N = false;
        bt.N();
    }

    public final void a(boolean z2) {
        if (z2) {
            this.f = 0;
            this.M = 0;
        }
        f();
        if (B != null) {
            this.O = new boolean[B.length];
            this.G = new int[2 + B.length][4];
        } else {
            this.G = new int[2][4];
        }
        if (this.K == null) {
            this.K = a.ag.a("jianding_02");
            this.L = a.ag.a("jianding_01");
        }
        if (g != -1) {
            this.i.a(new short[]{v});
        }
        if (x != -1) {
            this.i.a(new short[]{z});
        }
        this.j.aq.b();
        this.j.aq.a("装备洗炼");
        this.j.aq.a(false);
        this.J = (Math.max((int) ao.x.c, t.j) * 7) + 16;
        this.H = ao.x.c + t.j + 8;
        this.I = (((t.e - 32) - l.b()) - (this.J + 4)) - this.H;
        this.j.aq.a(this.H + this.I);
        this.j.at.a((String) null, t.i, (byte) 1);
        this.j.aq.a(this.j.at);
        this.j.at.a((byte) 1);
        this.j.au.a("确定");
        this.j.aq.a(this.j.au);
        this.j.aq.a(t.f, t.g, t.d, t.e);
        int i = 0;
        int iMax = 0;
        if (this.G != null) {
            for (int i2 = 0; i2 < this.G.length; i2++) {
                if (i2 == 0) {
                    i = (this.j.aq.a + (this.j.aq.c / 4)) - 8;
                    iMax = (((this.j.aq.b + 32) + this.H) - 4) - 17;
                } else if (i2 == 1) {
                    i = (this.j.aq.a + ((this.j.aq.c / 4) * 3)) - 8;
                } else if (i2 > 1) {
                    i = this.j.aq.a + ((this.j.aq.c - 17) / 2);
                    iMax = this.j.aq.b + 32 + this.H + this.I + 4 + 2 + ((i2 - 1) * (Math.max((int) ao.x.c, t.j) + 1));
                }
                a(i2, i, iMax, 17, 17);
            }
        }
        g();
        ca.l = 0;
        this.i.l = (short) 0;
        this.j.j = this.j.k;
        ao aoVar = this.i;
        this.i.k = (short) 106;
        aoVar.j = (short) 106;
    }

    public final void e(int i) throws IOException {
        bn bnVar;
        if (this.i.l == 0) {
            if (this.j.aq != null) {
                this.j.aq.b(i);
            }
            if (i == 8 || i == 1) {
                this.f--;
                if (this.f < 0) {
                    this.f = this.G.length - 1;
                }
                ca.l = 0;
                g();
            } else if (i == 2 || i == 4) {
                this.f++;
                if (this.f >= this.G.length) {
                    this.f = 0;
                }
                ca.l = 0;
                g();
            } else if (i == 268435456 || i == 1073741824) {
                if (this.f == 0) {
                    if (g == -1) {
                        this.N = true;
                        this.i.a((byte) 0, new byte[]{2});
                    } else {
                        ca.a(this.G[0][0] + 8, this.G[0][1] + 8, new String[]{"洗炼", "查看", "取出"}, false);
                        this.i.l = (short) 1;
                    }
                } else if (this.f == 1) {
                    if (g == -1) {
                        this.j.b("请先放入洗炼装备");
                    } else if (x == -1) {
                        this.i.a((byte) 0, new byte[]{5});
                    } else {
                        ca.a(this.G[1][0] + 8, this.G[1][1] + 8, new String[]{"取出"}, false);
                        this.i.l = (short) 1;
                    }
                } else if (this.O != null && this.f - 2 < this.O.length) {
                    if (this.O[this.f - 2]) {
                        this.O[this.f - 2] = false;
                        this.M--;
                    } else if (this.M + 1 > E) {
                        this.j.b("没有足够的洗炼锁");
                    } else {
                        this.O[this.f - 2] = true;
                        this.M++;
                    }
                }
            } else if (i == 536870912) {
                d();
                f();
                this.F = null;
                if (this.i.aw) {
                    this.i.aw = false;
                    this.i.t();
                } else if (this.i.aJ) {
                    this.i.aJ = false;
                    this.i.c(false);
                } else {
                    this.i.l();
                    this.i.c(2);
                }
            }
        } else if (this.i.l == 1) {
            ca.b(i);
            if (i == 268435456 || i == 1073741824) {
                if (ca.o == 0) {
                    byte[] bArrA = null;
                    if (this.f == 0) {
                        byte[] bArr = null;
                        if (this.O != null) {
                            bArr = new byte[this.M];
                            byte b = 0;
                            for (int i2 = 0; i2 < this.O.length; i2++) {
                                if (this.O[i2]) {
                                    bArr[b] = B[i2];
                                    b = (byte) (b + 1);
                                }
                            }
                        }
                        bArrA = bz.a((short) 4688, g, x, (byte) 3, h, bt.jG, bArr, bt.ad);
                    } else if (this.f == 1) {
                        bArrA = bz.a((short) 4688, g, x, (byte) 2, h, bt.jG, B, bt.ad);
                    }
                    if (bArrA != null) {
                        a.i.a(new w((short) 4688, bArrA));
                        this.j.a((String) null);
                    } else {
                        this.j.b("获取上传指令数据错误!");
                    }
                } else if (ca.o == 1) {
                    if (this.i.aw && !this.N) {
                        bt.a(this.i.av);
                    } else if (!this.i.aJ || this.N) {
                        int i3 = g;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= bt.bC.size()) {
                                bnVar = null;
                                break;
                            }
                            bn bnVar2 = (bn) bt.bC.elementAt(i4);
                            if (bnVar2 != null && bnVar2.a == i3) {
                                bnVar = bnVar2;
                                break;
                            }
                            i4++;
                        }
                        bn bnVar3 = bnVar;
                        if (bnVar != null) {
                            bt.a(bnVar3);
                        } else {
                            this.j.b("装备不存在");
                        }
                    } else {
                        bt.b((int) ao.l(this.i.aq));
                    }
                    this.i.O.a(0, this.i.k, -1);
                } else if (ca.o == 2) {
                    d();
                    a(true);
                    g();
                    this.i.l = (short) 0;
                }
            } else if (i == 536870912) {
                ca.l = 0;
                g();
                this.i.l = (short) 0;
            }
        }
        this.j.a = 0;
    }

    private void a(int i, int i2, int i3, int i4, int i5) {
        if (this.G == null || this.G.length <= i) {
            return;
        }
        this.G[i][0] = i2;
        this.G[i][1] = i3;
        this.G[i][2] = 17;
        this.G[i][3] = 17;
    }

    public final int b(int i, int i2, int i3) {
        if (this.G != null) {
            for (int i4 = 0; i4 < this.G.length; i4++) {
                if (i2 >= this.G[i4][0] && i2 <= this.G[i4][0] + this.G[i4][2] && i3 >= this.G[i4][1] && i3 <= this.G[i4][1] + this.G[i4][3]) {
                    if (this.f == i4) {
                        return 1073741824;
                    }
                    this.f = i4;
                    ca.l = 0;
                    g();
                    return i;
                }
            }
        }
        return i;
    }

    public final void d(Graphics graphics) {
        ai aiVar;
        Graphics graphics2;
        bf bfVar;
        int i = this.j.aq.b + 32 + this.H + this.I + 4;
        int i2 = ((this.j.aq.c - 21) - 31) / 2;
        int i3 = this.j.aq.a + 10;
        int i4 = i3 + i2 + 31;
        if (this.j.aq != null) {
            this.j.aq.a(graphics);
            ca.a(graphics, this.j.aq.a + 5, this.j.aq.b + 32, this.j.aq.c - 11, this.H, 1);
            ca.a(graphics, this.j.aq.a + 5, this.j.aq.b + 32 + this.H + 1, this.j.aq.c - 11, this.I - 2, 1);
            ca.a(graphics, i3, i, i2, this.J - 9, 1);
            ca.a(graphics, i4, i, i2, this.J - 9, 1);
        }
        if (this.G != null) {
            for (int i5 = 0; i5 < this.G.length; i5++) {
                if (i5 < 2) {
                    aiVar = this.k;
                    graphics2 = graphics;
                    bfVar = ao.x;
                } else if (this.O != null && i5 - 2 < this.O.length) {
                    aiVar = this.k;
                    graphics2 = graphics;
                    bfVar = this.O[i5 - 2] ? this.K : this.L;
                }
                aiVar.a(graphics2, bfVar, (int[]) null, (aj) null, 0, 0, this.G[i5][0], this.G[i5][1], 0, 0);
            }
        }
        graphics.setColor(255);
        graphics.drawString("装备孔", this.G[0][0] + 8, this.G[0][1] - 2, 33);
        if (g != -1) {
            this.k.a(graphics, ao.b(v), (int[]) null, (aj) null, 0, 0, this.G[0][0], this.G[0][1], 0, 0);
        }
        graphics.setColor(255);
        graphics.drawString("洗炼符", this.G[1][0] + 8, this.G[1][1] - 2, 33);
        if (x != -1) {
            this.k.a(graphics, ao.b(z), (int[]) null, (aj) null, 0, 0, this.G[1][0], this.G[1][1], 0, 0);
        }
        graphics.drawString("洗炼锁", this.G[0][0] + 17, this.j.aq.b + 32 + this.H + 3, 20);
        graphics.drawString(new StringBuffer().append(this.M).append(" / ").append(E).toString(), this.G[1][0] - 5, this.j.aq.b + 32 + this.H + 3, 20);
        int i6 = i + 2;
        int iMax = Math.max((int) ao.x.c, t.j);
        graphics.drawString("当    前", i3 + (i2 / 2), i6, 17);
        graphics.drawString("最    大", i4 + (i2 / 2), i6, 17);
        if (C != null) {
            for (int i7 = 0; i7 < C.length; i7++) {
                i6 += iMax + 1;
                graphics.drawString(this.P[B[i7]], i3 + 4, i6, 20);
                graphics.drawString(new StringBuffer().append("+").append(C[i7]).toString(), (i3 + i2) - 4, i6, 24);
                graphics.drawString(this.P[B[i7]], i4 + 4, i6, 20);
                graphics.drawString(new StringBuffer().append("+").append(D[i7]).toString(), (i4 + i2) - 4, i6, 24);
            }
        }
        ca.d(graphics, this.G[this.f][0], this.G[this.f][1], 17, 17);
        if (this.i.l != 0) {
            if (this.i.l == 1) {
                ca.c(graphics);
            }
        } else {
            if (this.F == null && this.F == "") {
                return;
            }
            if (this.f == 1) {
                ca.b(graphics, this.F, this.G[1][0] + 8, this.G[1][1] + 8, t.c - 5, 1);
            } else if (this.f == 0) {
                ca.b(graphics, this.F, this.G[0][0] + 8, this.G[0][1] + 8, t.c - 5, 1);
            }
        }
    }
}

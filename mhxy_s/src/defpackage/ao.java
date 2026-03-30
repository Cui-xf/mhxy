package defpackage;

import com.yinhan.kjava.main.MainMidlet;
import com.yinhan.kjava.main.a;
import com.yinhan.kjava.main.c;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-8105993946875401281/classes.dex */
public final class ao {
    public static Image A;
    public static bf B;
    public static bf C;
    public static bf D;
    public static bf E;
    public static bf F;
    public static bf G;
    public static bf H;
    public static bw K;
    public static bv L;
    public static bf Z;
    public static bc aa;
    public static bc ab;
    public static bc ac;
    public static bc ad;
    public static bc ae;
    private static bc bn;
    private static bc bo;
    private static bc bp;
    private static bf bq;
    private static bf br;
    private static volatile boolean cL;
    public static int h;
    public static int i;
    public static bc q;
    public static bc r;
    public static bc s;
    public static bc t;
    public static bc u;
    public static bf v;
    public static bf w;
    public static bf x;
    public static bf y;
    public static bf z;
    public ac I;
    public aq M;
    public cc N;
    public o O;
    public r P;
    public k Q;
    public bd R;
    public v S;
    public m T;
    public as U;
    public ch V;
    public cg W;
    public int Y;
    public int aA;
    public int aB;
    public int aC;
    public int aD;
    public int aE;
    public int aF;
    public int aG;
    public byte aH;
    public bc aI;
    public String aL;
    public int aM;
    public int aN;
    public String aQ;
    public int aU;
    public int aV;
    public boolean aX;
    public long aY;
    public byte af;
    public int ag;
    public long ah;
    public int ai;
    public String[] al;
    public String[] am;
    public String[] an;
    public boolean ao;
    public boolean ap;
    public int aq;
    public int ar;
    public int as;
    public int av;
    public int ay;
    public byte az;
    private String[] bA;
    private int bC;
    private int bD;
    private String bI;
    private String[] bK;
    private int[][] bL;
    private short[] bM;
    private long bR;
    private byte bX;
    private Image bZ;
    public bv ba;
    public ba bc;
    public bc bd;
    public int bg;
    public boolean bh;
    private long bt;
    private c bu;
    private an bv;
    private l bw;
    private int bz;
    private int[][] cB;
    private int[][] cC;
    private int cK;
    private boolean cM;
    private short[] cW;
    private byte cX;
    private boolean cY;
    private byte cZ;
    private boolean cg;
    private bc ch;
    private String cl;
    private byte cm;
    private int cn;
    private int co;
    private int cp;
    private b cq;
    private byte cy;
    public byte d;
    private int db;
    private int dc;
    private bw dd;
    private bh dh;
    private an di;
    private an dj;
    private bc[] dk;
    private int dm;
    private int dn;
    private int ds;
    private int dt;
    private boolean du;
    private bw dv;
    public a e;
    public aw f;
    public bq g;
    public short j;
    public short k;
    public short l;
    public short m;
    public static short a = 176;
    public static short b = 208;
    private static Vector bk = new Vector();
    private static Vector bl = new Vector();
    private static Vector bm = new Vector();
    public static short o = 0;
    public static short p = 0;
    private static Vector bH = new Vector();
    public static boolean aj = false;
    public static byte ax = 0;
    private static byte ca = 1;
    private static byte cb = 2;
    private static Vector ck = new Vector();
    public static Vector aP = new Vector();
    public static byte[] aW = {3, 10, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1};
    public boolean c = false;
    private byte bi = -1;
    private Vector bj = new Vector();
    public boolean n = false;
    public String J = null;
    private short bs = 0;
    private short bx = 0;
    private byte by = 0;
    private int bB = 0;
    private int[][] bE = null;
    private int[] bF = null;
    private String bG = null;
    private boolean bJ = true;
    public StringBuffer ak = new StringBuffer();
    private String[] bN = {"生命", "内力", "物攻", "法攻", "防御", "速度", "冰抗", "火抗", "雷抗"};
    private String[] bO = null;
    private int[][] bP = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 2, 4);
    private int bQ = 0;
    public String at = null;
    private boolean bS = false;
    public int[][] au = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 32, 4);
    private bn bT = null;
    private Vector bU = new Vector();
    private int[][] bV = null;
    private int[] bW = new int[4];
    public boolean aw = false;
    private int[][] bY = {new int[]{39, 6}, new int[]{13, 24}, new int[]{3, 55}, new int[]{13, 87}, new int[]{39, 105}, new int[]{72, 105}, new int[]{97, 87}, new int[]{108, 55}, new int[]{97, 24}, new int[]{72, 6}};
    private int[][] cc = {new int[]{8, 32}, new int[]{8, 78}, new int[]{55, 108}, new int[]{102, 78}, new int[]{102, 32}, new int[]{55, 5}};
    private String[] cd = null;
    private String[] ce = null;
    private String[] cf = null;
    private int[] ci = null;
    public boolean aJ = false;
    private byte cj = 0;
    public String aK = " ";
    public Vector aO = new Vector();
    public boolean aR = false;
    public String aS = null;
    public int aT = -1;
    private int[][] cr = null;
    private int[][] cs = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 2, 4);
    private byte ct = 0;
    private String cu = null;
    private int[][] cv = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 8, 4);
    private int[][] cw = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 8, 4);
    private int[][] cx = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 2, 4);
    private int[][] cz = null;
    private int cA = -1;
    private Vector cD = new Vector();
    private long cE = 0;
    private int[][] cF = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 15, 4);
    private int[] cG = new int[4];
    private int[] cH = new int[4];
    private int[] cI = new int[4];
    private boolean cJ = false;
    private String[] cN = new String[24];
    private String[] cO = new String[9];
    private short[][] cP = (short[][]) Array.newInstance((Class<?>) Short.TYPE, 3, 9);
    private String[] cQ = new String[18];
    private short[][] cR = (short[][]) Array.newInstance((Class<?>) Short.TYPE, 3, 18);
    private byte cS = 0;
    private byte cT = 0;
    private byte cU = 0;
    private int cV = 0;
    public byte aZ = -1;
    public short bb = 0;
    private String da = null;
    private String de = null;
    private String df = null;
    private String[] dg = {"确定", "取消"};
    public int be = 0;
    public int bf = 0;
    private byte dl = 0;

    /* renamed from: do, reason: not valid java name */
    private String[] f0do = {"休息", "骑术升级", "取消"};
    private String[] dp = {"骑乘", "骑术升级", "取消"};
    private String[] dq = {"购买", "骑术升级", "取消"};
    private String[] dr = {"", "骑术升级", ""};
    public ab X = new ab(this);

    public ao(a aVar, ai aiVar) {
        this.d = (byte) -1;
        this.Y = -1;
        this.aY = 0L;
        this.e = aVar;
        this.M = new aq(this, this.e);
        this.O = new o(this, this.e, aiVar);
        this.S = new v(this, this.e);
        this.U = new as(this, this.e, aiVar);
        this.V = new ch(this, this.e, aiVar);
        this.W = new cg(this, this.e, aiVar);
        if (bt.bu) {
            bt.bu = false;
            bt.bv = 0;
        }
        bt.bt = false;
        this.T = new m();
        this.bu = new c();
        this.bv = new an();
        this.bw = new l();
        j();
        bt.a = false;
        this.e.p = true;
        this.d = (byte) -1;
        this.e.b();
        this.e.k();
        this.e.b();
        this.aY = 0L;
        bt.as = (short) -1;
        ar();
        this.e.b();
        ao();
        this.e.b();
        a.af.e("-1000");
        a.af.e("103");
        this.e.b();
        aq();
        this.e.b();
        U();
        this.e.b();
        t.a(bt.ax, bt.aj, (byte) 3, 1, false);
        this.I = new ac();
        this.I.a(bt.at, bt.au);
        a.f.a(g(), h(), t.b, t.c);
        this.e.b();
        as();
        if (this.I.d != null) {
            this.I.d.h = this.I.j;
            this.I.d.i = this.I.k;
        }
        this.e.b();
        bt.E();
        this.aO.removeAllElements();
        this.Y = bt.ar;
        this.e.b();
        N();
        a aVar2 = this.e;
        this.e.k = (short) 7;
        aVar2.j = (short) 7;
        this.e.p = false;
    }

    private String A(int i2) {
        int i3 = (this.e.as.a << 5) + i2;
        int i4 = 0;
        while (true) {
            int i5 = i4;
            if (i5 >= bt.bC.size()) {
                return null;
            }
            bn bnVar = (bn) bt.bC.elementAt(i5);
            if (bnVar != null && bnVar.h == i3) {
                if (this.j == 4 && this.as == 4 && bnVar.g - bnVar.v <= 0) {
                    return null;
                }
                return a(bnVar);
            }
            i4 = i5 + 1;
        }
    }

    private void A(Graphics graphics) {
        int i2;
        if (B == null || v.a == null || bq == null) {
            return;
        }
        int i3 = t.b - 67;
        graphics.drawImage(bq.a, i3, 5, 20);
        graphics.drawImage(v.a, i3 + 37, 8, 20);
        if (bt.ak < 10) {
            a.f.a(graphics, B, (int[]) null, (bt.ak % 10) + 1, 0, 0, i3 + 23, 25, 0, 0);
        } else if (bt.ak < 10 || bt.ak > 99) {
            a.f.a(graphics, B, (int[]) null, (bt.ak % 10) + 1, 0, 0, i3 + 28, 25, 0, 0);
            a.f.a(graphics, B, (int[]) null, ((bt.ak - ((bt.ak / 100) * 100)) / 10) + 1, 0, 0, i3 + 23, 25, 0, 0);
            a.f.a(graphics, B, (int[]) null, (bt.ak / 100) + 1, 0, 0, i3 + 18, 25, 0, 0);
        } else {
            a.f.a(graphics, B, (int[]) null, (bt.ak / 10) + 1, 0, 0, i3 + 20, 25, 0, 0);
            a.f.a(graphics, B, (int[]) null, (bt.ak % 10) + 1, 0, 0, i3 + 25, 25, 0, 0);
        }
        int i4 = (bt.aN * 30) / bt.aM;
        graphics.setColor(16472935);
        graphics.drawLine((i3 + 32) - i4, 7, i3 + 32, 7);
        graphics.setColor(16717352);
        graphics.drawLine((i3 + 32) - i4, 8, i3 + 32, 8);
        graphics.setColor(11731460);
        graphics.drawLine((i3 + 32) - i4, 9, i3 + 32, 9);
        int i5 = (bt.aP * 30) / bt.aO;
        graphics.setColor(1937134);
        graphics.drawLine((i3 + 32) - i5, 13, i3 + 32, 13);
        graphics.setColor(881618);
        graphics.drawLine((i3 + 32) - i5, 14, i3 + 32, 14);
        graphics.setColor(21145);
        graphics.drawLine((i3 + 32) - i5, 15, i3 + 32, 15);
        switch (bt.h) {
            case 0:
                i2 = 30;
                break;
            case 1:
                i2 = 20;
                break;
            case 2:
                i2 = 10;
                break;
            default:
                i2 = 0;
                break;
        }
        graphics.setColor(14811050);
        graphics.drawLine((i3 + 32) - i2, 19, i3 + 32, 19);
        graphics.setColor(10873387);
        graphics.drawLine((i3 + 32) - i2, 20, i3 + 32, 20);
        graphics.setColor(7252485);
        graphics.drawLine((i3 + 32) - i2, 21, i3 + 32, 21);
        if (bt.bf != 0) {
            a aVar = this.e;
            long j = aVar.al;
            aVar.al = 1 + j;
            graphics.setColor((j % 8) / 4 == 0 ? 15984780 : 15953687);
            graphics.fillRect(i3 + 2, 24, br.b - 2, br.c);
            graphics.drawImage(br.a, i3, 24, 20);
        }
        if (bt.bs < 0 || bt.q == null) {
            return;
        }
        int i6 = 0;
        int i7 = 0;
        while (i6 < bt.q.length) {
            if (bt.q[i6] != null && !bt.q[i6].b.equals(bt.ad)) {
                ca.a(graphics, bt.q[i6].e, (t.b - 2) - t.i.stringWidth(bt.q[i6].e), (t.j * i7) + 60, 0, 65280, 0);
                i7++;
            }
            i6++;
            i7 = i7;
        }
    }

    private void B(int i2) {
        byte b2;
        int i3;
        int i4;
        byte b3 = 0;
        int i5 = 0;
        int i6 = 0;
        if (this.l == 0) {
            aV();
            if (this.e.aq != null) {
                this.e.aq.b(i2);
            }
            if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                if (i2 == 1024 || i2 == 2048) {
                    q();
                    return;
                }
                if (i2 == 8 || i2 == 516) {
                    if (this.aq <= 0) {
                        i3 = 7;
                    } else {
                        i3 = this.aq - 1;
                        this.aq = i3;
                    }
                    this.aq = i3;
                    s();
                    return;
                }
                if (i2 == 2 || i2 == 518) {
                    if (this.aq < 7) {
                        i6 = this.aq + 1;
                        this.aq = i6;
                    }
                    this.aq = i6;
                    s();
                    return;
                }
                if (i2 == 1 || i2 == 514) {
                    if (this.ar <= 0) {
                        i4 = 3;
                    } else {
                        i4 = this.ar - 1;
                        this.ar = i4;
                    }
                    this.ar = i4;
                    s();
                    return;
                }
                if (i2 == 4 || i2 == 520) {
                    if (this.ar < 3) {
                        i5 = this.ar + 1;
                        this.ar = i5;
                    }
                    this.ar = i5;
                    s();
                    return;
                }
                if (i2 == 536870912) {
                    this.al = null;
                    this.am = null;
                    this.at = null;
                    this.aF = 0;
                    this.aG = 0;
                    this.aH = (byte) 0;
                    if (this.as == 0) {
                        if (this.by == 1) {
                            N();
                            this.by = (byte) 0;
                            return;
                        } else {
                            at();
                            c(2);
                            return;
                        }
                    }
                    if (this.as == 1) {
                        c(0, this.aE, this.aA);
                        E();
                        ca.o = 0;
                        this.l = (short) 1;
                        return;
                    }
                    if (this.as == 2) {
                        m();
                        this.aq = 0;
                        this.an = new String[]{"取出物品", "存入物品"};
                        K = new bw(new StringBuffer().append(bt.t[this.af].b).append(":物品仓库已打开").toString(), (short) (t.b - 20));
                        ca.a(a.F, K, this.an, (String[]) null, true);
                        this.l = (short) 3;
                        return;
                    }
                    if (this.as == 3) {
                        c(0, this.aE, this.aA);
                        ca.o = 2;
                        this.l = (short) 1;
                        return;
                    }
                    if (this.as == 4) {
                        b((byte) 0, true);
                        this.ar = this.aU;
                        this.e.ax = this.aV;
                        return;
                    }
                    if (this.as == 5 || this.as == 8) {
                        m();
                        ca.o = this.ai;
                        return;
                    }
                    if (this.as == 6) {
                        this.e.j = this.e.k;
                        this.k = (short) 25;
                        this.j = (short) 25;
                        return;
                    }
                    if (this.as == 7) {
                        t();
                        return;
                    }
                    if (this.as == 9) {
                        this.as = 0;
                        c(false);
                        return;
                    }
                    if (this.as == 10) {
                        this.O.a();
                        this.e.ar.a(0);
                        return;
                    }
                    if (this.as == 11) {
                        this.aH = this.e.as.a;
                        this.O.a((int) this.O.a, this.O.c, this.O.d);
                        return;
                    }
                    if (this.as == 13) {
                        p(0);
                        return;
                    }
                    if (this.as == 14) {
                        c(0, this.aE, this.aA);
                        E();
                        ca.o = 8;
                        this.l = (short) 1;
                        return;
                    }
                    if (this.as == 18) {
                        this.M.b(true);
                        return;
                    }
                    if (this.as == 20) {
                        e(false);
                        return;
                    } else {
                        if (this.as == 21 || this.as == 22) {
                            s(this.bg);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            bn bnVarY = y((this.ar << 3) + this.aq);
            if (bnVarY == null || bnVarY.a <= 0 || A((this.ar << 3) + this.aq) == null) {
                return;
            }
            if (this.as == 0) {
                ca.a(this.au[(this.ar << 3) + this.aq][0] - 17, this.au[(this.ar << 3) + this.aq][1] + 17, this.am, false);
                this.l = (short) 1;
                return;
            }
            if (this.as == 1) {
                byte[] bArrG = bz.g((short) 4173, bt.ad, bt.fA[this.e.ar.g()], z((this.ar << 3) + this.aq));
                if (bArrG == null) {
                    this.e.b("获取上传指令数据错误!");
                    return;
                } else {
                    a.i.a(new w((short) 4173, bArrG));
                    this.e.a((String) null);
                    return;
                }
            }
            if (this.as == 2) {
                if (bnVarY.g <= 1) {
                    E(bnVarY.g);
                    return;
                } else {
                    a(bnVarY.g);
                    this.l = (short) 2;
                    return;
                }
            }
            if (this.as == 3) {
                byte[] bArrH = bz.h((short) 4174, bt.ad, bt.fA[this.e.ar.g()], z((this.ar << 3) + this.aq));
                if (bArrH == null) {
                    this.e.b("获取上传指令数据错误!");
                    return;
                } else {
                    a.i.a(new w((short) 4174, bArrH));
                    this.e.a((String) null);
                    return;
                }
            }
            if (this.as == 4) {
                if (bnVarY.g - bnVarY.v > 0) {
                    if (bt.a(bnVarY.d)) {
                        ca.a(this.au[(this.ar << 3) + this.aq][0] - 17, this.au[(this.ar << 3) + this.aq][1] + 17, new String[]{"查看", "交易"}, false);
                        this.l = (short) 15;
                        return;
                    }
                    if (bnVarY.g - bnVarY.v > 1) {
                        if (bnVarY.g - bnVarY.v > 1) {
                            a(bnVarY.g - bnVarY.v);
                            this.l = (short) 4;
                            return;
                        }
                        return;
                    }
                    D(1);
                    b((byte) 0, true);
                    this.ar = this.aU;
                    this.e.ax = this.aV;
                    this.as = 0;
                    this.e.a((String) null);
                    return;
                }
                return;
            }
            if (this.as == 5) {
                if (bt.a(bnVarY.d)) {
                    ca.a(this.au[(this.ar << 3) + this.aq][0] - 17, this.au[(this.ar << 3) + this.aq][1] + 17, new String[]{"查看", "拍卖"}, false);
                    this.l = (short) 16;
                    return;
                } else if (bnVarY.g > 1) {
                    a(bnVarY.g);
                    this.l = (short) 7;
                    return;
                } else {
                    this.ag = 1;
                    this.l = (short) 6;
                    o();
                    return;
                }
            }
            if (this.as == 6) {
                if (bnVarY.d != 10 && bnVarY.d != 15 && bnVarY.d != 16) {
                    this.e.b("战斗中你不能使用该物品!");
                    return;
                }
                if (this.g != null) {
                    if (bq.h() && bnVarY.f != 2) {
                        this.e.b("你只能使用复活道具");
                        return;
                    }
                    if (bnVarY.d == 16) {
                        if (bnVarY.f == 3) {
                            if (this.g.j()) {
                                this.g.a((byte) 2, bnVarY.a, (byte) 0, bq.i(), (byte) 1, 1, (byte) 1, (byte) -1);
                                this.g.f = (short) -1;
                                this.g.e = 5;
                            } else {
                                this.g.j = (byte) 2;
                                this.g.p = bnVarY.a;
                                this.g.n = (byte) 0;
                                this.g.d = 4;
                            }
                        } else if (bnVarY.f == 4) {
                            if (bq.b() <= 1) {
                                this.g.a((byte) 2, bnVarY.a, (byte) 0, bq.i(), (byte) 1, 1, (byte) 1, (byte) -1);
                                this.g.f = (short) -1;
                                this.g.e = 5;
                            } else {
                                this.g.j = (byte) 2;
                                this.g.p = bnVarY.a;
                                this.g.n = (byte) 0;
                                this.g.d = 4;
                            }
                        } else if (bnVarY.f == 5) {
                            if (bq.c() <= 1) {
                                this.g.a((byte) 2, bnVarY.a, (byte) 1, bt.M[this.g.h].a, (byte) 2, -1, (byte) -1, (byte) -1);
                                this.g.f = (short) -1;
                                this.g.e = 5;
                            } else {
                                this.g.j = (byte) 2;
                                this.g.p = bnVarY.a;
                                this.g.n = (byte) 1;
                                this.g.d = 9;
                            }
                        }
                    } else if (bt.H.length <= 1 || bq.h()) {
                        if (bq.h()) {
                            this.g.m();
                        }
                        this.g.a((byte) 2, bnVarY.a, (byte) 0, bt.H[this.g.i].a, (byte) 2, -1, (byte) -1, (byte) -1);
                        this.g.f = (short) -1;
                        this.g.e = 5;
                    } else {
                        this.g.j = (byte) 2;
                        this.g.p = bnVarY.a;
                        this.g.n = (byte) 0;
                        this.g.d = 4;
                    }
                    this.k = (short) 25;
                    this.j = (short) 25;
                    return;
                }
                return;
            }
            if (this.as == 7) {
                if (bt.b(bnVarY.d)) {
                    byte[] bArrB = bz.b((short) 4135, bt.ad, bnVarY.a, (byte) (this.av + 0));
                    if (bArrB == null) {
                        this.e.b("获取上传指令数据错误!");
                        return;
                    } else {
                        a.i.a(new w((short) 4135, bArrB));
                        this.e.a((String) null);
                        return;
                    }
                }
                return;
            }
            if (this.as == 8) {
                if (bnVarY.g > 1) {
                    a(bnVarY.g);
                    this.l = (short) 12;
                    return;
                } else {
                    this.ag = 1;
                    this.l = (short) 11;
                    o();
                    return;
                }
            }
            if (this.as == 9) {
                if (bt.c(bnVarY.d)) {
                    if (bnVarY.e == 2) {
                        this.l = (short) 13;
                        ca.h = 0;
                        return;
                    } else {
                        this.as = 0;
                        V(bnVarY.a);
                        return;
                    }
                }
                return;
            }
            if (this.as == 10) {
                if (bt.a(bnVarY.d)) {
                    ca.a(this.au[(this.ar << 3) + this.aq][0] - 17, this.au[(this.ar << 3) + this.aq][1] + 17, new String[]{"查看", "打孔"}, false);
                    this.l = (short) 14;
                    return;
                }
                return;
            }
            if (this.as == 11) {
                if (bnVarY.d == 30) {
                    o.e = (byte) 1;
                    if (this.O.c == 13) {
                        byte[] bArrA = bz.a((short) 4687, bt.ko, (byte) 3, bt.jG, bnVarY.a, this.O.b, "", bt.ad);
                        if (bArrA == null) {
                            this.e.b("获取上传指令数据错误!");
                            return;
                        } else {
                            a.i.a(new w((short) 4687, bArrA));
                            this.e.a((String) null);
                            return;
                        }
                    }
                    byte[] bArrC = bz.c((short) 4645, bt.ad, bt.ko, bnVarY.a, this.O.b);
                    if (bArrC == null) {
                        this.e.b("获取上传指令数据错误!");
                        return;
                    } else {
                        a.i.a(new w((short) 4645, bArrC));
                        this.e.a((String) null);
                        return;
                    }
                }
                return;
            }
            if (this.as == 13) {
                byte[] bArrB2 = bz.b((short) 4856, bt.ad, bt.dK[this.e.ar.g() - 1], z((this.ar << 3) + this.aq));
                if (bArrB2 == null) {
                    this.e.b("获取上传指令数据错误!");
                    return;
                } else {
                    a.i.a(new w((short) 4856, bArrB2));
                    this.e.a((String) null);
                    return;
                }
            }
            if (this.as == 14) {
                byte[] bArrH2 = bz.h((short) 4661, bt.ad, bt.fA[this.e.ar.g()], z((this.ar << 3) + this.aq));
                if (bArrH2 == null) {
                    this.e.b("获取上传指令数据错误!");
                    return;
                } else {
                    a.i.a(new w((short) 4661, bArrH2));
                    this.e.a((String) null);
                    return;
                }
            }
            if (this.as == 18) {
                if (bnVarY.g > 1) {
                    a(bnVarY.g);
                    this.l = (short) 2;
                    return;
                } else {
                    ca.h = 0;
                    this.at = new StringBuffer().append("您确定向你的帮派捐献").append((ca.a(bnVarY.b) != -1 ? ca.a(bnVarY.b) : 15138723) != 15138723 ? bnVarY.b.substring(3, bnVarY.b.length()) : bnVarY.b).append("X").append((int) bnVarY.g).append("？").toString();
                    this.l = (short) 18;
                    return;
                }
            }
            if (this.as == 20) {
                t.a("升星 选择物品");
                if (bnVarY.g - bnVarY.v > 0) {
                    b(bnVarY.a, (byte) 0);
                    return;
                }
                return;
            }
            if (this.as == 21) {
                a((byte) 0, bt.fA[this.bg], bnVarY.a, (byte) 34, (byte) this.e.ar.g());
                return;
            } else {
                if (this.as == 22) {
                    a((byte) 0, bt.fA[this.bg], bnVarY.a, (byte) 35, (byte) (this.e.ar.g() - 5));
                    return;
                }
                return;
            }
        }
        if (this.l == 1) {
            a(bt.en);
            ca.b(i2);
            if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                if (i2 == 536870912) {
                    this.l = (short) 0;
                    return;
                }
                return;
            }
            bn bnVarY2 = y((this.ar << 3) + this.aq);
            if (bnVarY2 == null || bnVarY2.a <= 0 || bnVarY2.g <= 0) {
                this.l = (short) 0;
                return;
            }
            switch (ca.o) {
                case 0:
                    if (!bt.a(bnVarY2.d) || bnVarY2.e != 2) {
                        byte[] bArrB3 = bz.b((short) 4105, bt.ad, bnVarY2.a);
                        if (bArrB3 == null) {
                            this.e.b("获取上传指令数据错误!");
                            break;
                        } else {
                            a.i.a(new w((short) 4105, bArrB3));
                            this.e.a((String) null);
                            break;
                        }
                    } else {
                        this.l = (short) 10;
                        ca.h = 0;
                        break;
                    }
                    break;
                case 1:
                    this.aH = this.e.as.a;
                    if (!bt.a(bnVarY2.d)) {
                        this.e.aq.j();
                        this.e.aq.b();
                        this.e.aq.a("物品详情");
                        this.e.at.a(A((this.ar << 3) + this.aq), t.i, (byte) 1);
                        this.e.aq.a(this.e.at);
                        this.e.aq.a(t.f, t.g, t.d, t.e);
                        this.l = (short) 17;
                        break;
                    } else {
                        bt.a(bnVarY2);
                        this.O.a(0, this.k, this.as);
                        break;
                    }
                case 2:
                    if (bnVarY2.g <= 1) {
                        ca.a(this.au[(this.ar << 3) + this.aq][0] - 17, this.au[(this.ar << 3) + this.aq][1] + 17, new String[]{"取消", "确认"}, false);
                        this.l = (short) 3;
                        break;
                    } else {
                        a(bnVarY2.g);
                        this.l = (short) 2;
                        break;
                    }
                case 3:
                    if (this.e.j != 2) {
                        this.e.j = this.e.k;
                    }
                    this.az = (byte) 0;
                    this.l = (short) 8;
                    break;
                case 4:
                    byte[] bArrJ = bz.j((short) 4143, bt.ad);
                    if (bArrJ == null) {
                        this.e.b("获取上传指令数据错误!");
                        break;
                    } else {
                        a.i.a(new w((short) 4143, bArrJ));
                        this.e.a((String) null);
                        break;
                    }
            }
            return;
        }
        if (this.l == 2) {
            b(i2);
            if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                if (i2 == 536870912) {
                    if (this.as != 0) {
                        this.l = (short) 0;
                        return;
                    } else {
                        ca.a(this.au[(this.ar << 3) + this.aq][0] - 17, this.au[(this.ar << 3) + this.aq][1] + 17, this.am, false);
                        this.l = (short) 1;
                        return;
                    }
                }
                return;
            }
            bn bnVarY3 = y((this.ar << 3) + this.aq);
            if (bnVarY3 == null || bnVarY3.a <= 0 || bnVarY3.g <= 0) {
                return;
            }
            if (this.as == 0) {
                ca.a(this.au[(this.ar << 3) + this.aq][0] - 17, this.au[(this.ar << 3) + this.aq][1] + 17, new String[]{"取消", "确认"}, false);
                this.l = (short) 3;
                return;
            } else if (this.as == 2) {
                E(bnVarY3.g > 1 ? this.ag : 1);
                return;
            } else {
                if (this.as == 18) {
                    ca.h = 0;
                    this.at = new StringBuffer().append("您确定向你的帮派捐献").append((ca.a(bnVarY3.b) != -1 ? ca.a(bnVarY3.b) : 15138723) != 15138723 ? bnVarY3.b.substring(3, bnVarY3.b.length()) : bnVarY3.b).append("X").append(this.ag).append("？").toString();
                    this.l = (short) 18;
                    return;
                }
                return;
            }
        }
        if (this.l == 3) {
            ca.b(i2);
            if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                if (i2 == 536870912) {
                    bn bnVarY4 = y((this.ar << 3) + this.aq);
                    if (bnVarY4 == null || bnVarY4.a <= 0 || bnVarY4.g <= 0) {
                        this.l = (short) 0;
                        return;
                    } else {
                        ca.a(this.au[(this.ar << 3) + this.aq][0] - 17, this.au[(this.ar << 3) + this.aq][1] + 17, this.am, false);
                        this.l = (short) 1;
                        return;
                    }
                }
                return;
            }
            bn bnVarY5 = y((this.ar << 3) + this.aq);
            if (bnVarY5 == null || bnVarY5.a <= 0 || bnVarY5.g <= 0) {
                this.l = (short) 0;
                return;
            }
            if (ca.o != 1) {
                ca.a(this.au[(this.ar << 3) + this.aq][0] - 17, this.au[(this.ar << 3) + this.aq][1] + 17, this.am, false);
                this.l = (short) 1;
                return;
            } else if (this.as != 0) {
                if (this.as == 1 || this.as != 3) {
                }
                return;
            } else if (bnVarY5.r == 0) {
                f(bnVarY5.g > 1 ? this.ag : 1);
                return;
            } else {
                this.e.a("重要物品输入OK丢弃", 0);
                this.ag = bnVarY5.g > 1 ? this.ag : 1;
                return;
            }
        }
        if (this.l == 4) {
            b(i2);
            if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                if (i2 == 536870912) {
                    this.l = (short) 0;
                    return;
                }
                return;
            } else {
                D(this.ag);
                b((byte) 0, true);
                this.ar = this.aU;
                this.e.ax = this.aV;
                this.as = 0;
                this.e.a((String) null);
                return;
            }
        }
        if (this.l == 5) {
            if (i2 != 268435456 && i2 != 517 && i2 != 1073741824) {
                if (i2 == 536870912) {
                    this.at = null;
                    this.l = (short) 6;
                    o();
                    return;
                }
                return;
            }
            bn bnVarY6 = y((this.ar << 3) + this.aq);
            if (bnVarY6 == null || bnVarY6.a <= 0 || bnVarY6.g <= 0) {
                return;
            }
            byte[] bArrB4 = bz.b((short) 4152, bt.ad, bnVarY6.a, this.ag > bnVarY6.g ? bnVarY6.g : this.ag, this.bR);
            if (bArrB4 == null) {
                this.e.b("获取上传指令数据错误!");
                return;
            } else {
                a.i.a(new w((short) 4152, bArrB4));
                this.e.a((String) null);
                return;
            }
        }
        if (this.l == 6) {
            if (i2 != 268435456 && i2 != 1073741824) {
                if (i2 != 1073741824) {
                    if (i2 != 536870912) {
                        d(i2);
                        return;
                    }
                    this.e.o();
                    bn bnVarY7 = y((this.ar << 3) + this.aq);
                    if (bnVarY7 == null || bnVarY7.g <= 1) {
                        this.l = (short) 0;
                        return;
                    } else {
                        this.l = (short) 7;
                        return;
                    }
                }
                return;
            }
            if (n() == -1) {
                this.e.b("输入有误,请重新输入");
                return;
            }
            try {
                bn bnVarY8 = y((this.ar << 3) + this.aq);
                if (bnVarY8 == null || bnVarY8.a <= 0 || bnVarY8.g <= 0) {
                    return;
                }
                this.bR = n();
                this.at = new StringBuffer().append("您确定以").append(this.bR).append("两的价格拍卖此物品").append(this.ag > bnVarY8.g ? bnVarY8.g : this.ag).append("个?").toString();
                this.l = (short) 5;
                ca.h = 0;
                return;
            } catch (Exception e) {
                this.e.b("超出最大值,请重新输入");
                return;
            }
        }
        if (this.l == 7) {
            b(i2);
            if (i2 == 268435456 || i2 == 517 || i2 == 1073741824) {
                this.l = (short) 6;
                o();
                return;
            } else {
                if (i2 == 536870912) {
                    this.l = (short) 0;
                    return;
                }
                return;
            }
        }
        if (this.l == 8) {
            if (i2 == 516 || i2 == 8) {
                if (this.az <= 0) {
                    b2 = 7;
                } else {
                    b2 = (byte) (this.az - 1);
                    this.az = b2;
                }
                this.az = b2;
                return;
            }
            if (i2 == 518 || i2 == 2) {
                if (this.az < 7) {
                    b3 = (byte) (this.az + 1);
                    this.az = b3;
                }
                this.az = b3;
                return;
            }
            if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                if (i2 == 536870912) {
                    ca.a(this.au[(this.ar << 3) + this.aq][0] - 17, this.au[(this.ar << 3) + this.aq][1] + 17, this.am, false);
                    this.l = (short) 1;
                    return;
                }
                return;
            }
            if (bt.ek != null && bt.ek[this.az] == -1) {
                a(true, (byte) 2);
                return;
            } else {
                ca.a(this.au[(this.ar << 3) + this.aq][0] - 17, this.au[(this.ar << 3) + this.aq][1] + 17, new String[]{"覆盖", "清空"}, false);
                this.l = (short) 9;
                return;
            }
        }
        if (this.l == 9) {
            ca.b(i2);
            if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                if (i2 == 536870912) {
                    this.l = (short) 8;
                    return;
                }
                return;
            } else if (ca.o == 0) {
                a(true, (byte) 2);
                return;
            } else {
                a(false, (byte) 2);
                return;
            }
        }
        if (this.l == 10) {
            if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                if (i2 == 536870912) {
                    this.l = (short) 1;
                    s();
                    return;
                }
                return;
            }
            byte[] bArrB5 = bz.b((short) 4105, bt.ad, z((this.ar << 3) + this.aq));
            if (bArrB5 == null) {
                this.e.b("获取上传指令数据错误!");
                return;
            } else {
                a.i.a(new w((short) 4105, bArrB5));
                this.e.a((String) null);
                return;
            }
        }
        if (this.l == 11) {
            if (i2 != 268435456 && i2 != 1073741824) {
                if (i2 != 536870912) {
                    d(i2);
                    return;
                }
                this.e.o();
                bn bnVarY9 = y((this.ar << 3) + this.aq);
                if (bnVarY9 == null || bnVarY9.g <= 1) {
                    this.l = (short) 0;
                    return;
                } else {
                    this.l = (short) 12;
                    return;
                }
            }
            if (n() == -1) {
                this.e.b("输入有误,请重新输入");
                return;
            }
            try {
                bn bnVarY10 = y((this.ar << 3) + this.aq);
                if (bnVarY10 == null || bnVarY10.a <= 0 || bnVarY10.g <= 0) {
                    return;
                }
                this.bR = n();
                this.at = new StringBuffer().append("您确定以").append(this.bR).append("个金豆的价格拍卖此物品").append(this.ag > bnVarY10.g ? bnVarY10.g : this.ag).append("个?").toString();
                this.l = (short) 5;
                ca.h = 0;
                return;
            } catch (Exception e2) {
                this.e.b("超出最大值,请重新输入");
                return;
            }
        }
        if (this.l == 12) {
            b(i2);
            if (i2 == 268435456 || i2 == 517 || i2 == 1073741824) {
                this.l = (short) 11;
                o();
                return;
            } else {
                if (i2 == 536870912) {
                    this.l = (short) 0;
                    return;
                }
                return;
            }
        }
        if (this.l == 13) {
            if (i2 == 268435456 || i2 == 1073741824 || i2 == 517) {
                this.as = 0;
                V(z((this.ar << 3) + this.aq));
                return;
            } else {
                if (i2 == 536870912) {
                    this.l = (short) 0;
                    s();
                    return;
                }
                return;
            }
        }
        if (this.l == 14) {
            ca.b(i2);
            if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                if (i2 == 536870912) {
                    this.l = (short) 0;
                    return;
                }
                return;
            } else if (ca.o == 0) {
                this.aH = this.e.as.a;
                bt.a(y((this.ar << 3) + this.aq));
                this.O.a(0, this.k, this.as);
                return;
            } else {
                if (ca.o == 1) {
                    o.e = (byte) 0;
                    byte[] bArrB6 = bz.b((short) 4642, bt.ad, (int) bt.km[this.e.ar.g()], y((this.ar << 3) + this.aq).a, bt.t[this.af].a);
                    if (bArrB6 == null) {
                        this.e.b("获取上传指令数据错误!");
                        return;
                    } else {
                        a.i.a(new w((short) 4642, bArrB6));
                        this.e.a((String) null);
                        return;
                    }
                }
                return;
            }
        }
        if (this.l == 15) {
            ca.b(i2);
            if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                if (i2 == 536870912) {
                    this.l = (short) 0;
                    return;
                }
                return;
            }
            bn bnVarY11 = y((this.ar << 3) + this.aq);
            if (ca.o == 0) {
                this.aH = this.e.as.a;
                bt.a(bnVarY11);
                this.O.a(0, this.k, this.as);
                return;
            } else {
                if (ca.o == 1) {
                    if (bnVarY11.g - bnVarY11.v > 1) {
                        if (bnVarY11.g - bnVarY11.v > 1) {
                            a(bnVarY11.g - bnVarY11.v);
                            this.l = (short) 4;
                            return;
                        }
                        return;
                    }
                    D(1);
                    b((byte) 0, true);
                    this.ar = this.aU;
                    this.e.ax = this.aV;
                    this.as = 0;
                    this.e.a((String) null);
                    return;
                }
                return;
            }
        }
        if (this.l == 16) {
            ca.b(i2);
            if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                if (i2 == 536870912) {
                    this.l = (short) 0;
                    return;
                }
                return;
            }
            bn bnVarY12 = y((this.ar << 3) + this.aq);
            if (ca.o == 0) {
                this.aH = this.e.as.a;
                bt.a(bnVarY12);
                this.O.a(0, this.k, this.as);
                return;
            } else if (bnVarY12.g > 1) {
                a(bnVarY12.g);
                this.l = (short) 7;
                return;
            } else {
                this.ag = 1;
                this.l = (short) 6;
                o();
                return;
            }
        }
        if (this.l == 17) {
            if (this.e.aq != null) {
                this.e.aq.b(i2);
            }
            if (i2 == 268435456 || i2 == 1073741824 || i2 == 517 || i2 != 536870912) {
                return;
            }
            e(0);
            return;
        }
        if (this.l == 18) {
            if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                if (i2 == 536870912) {
                    ca.h = 0;
                    this.l = (short) 0;
                    return;
                }
                return;
            }
            bn bnVarY13 = y((this.ar << 3) + this.aq);
            if (bnVarY13.g > 1) {
                C(this.ag);
            } else {
                C(bnVarY13.g);
            }
            ca.h = 0;
            this.l = (short) 0;
        }
    }

    private void B(Graphics graphics) {
        if (this.l == 0) {
            ca.a(graphics, 0, t.c - ca.f, t.b, ca.f, K, this.am, (String[]) null);
        }
    }

    private void C(int i2) {
        byte[] bArrB = bz.b((short) 4244, z((this.ar << 3) + this.aq), i2, bt.ad);
        if (bArrB == null) {
            this.e.b("获取上传指令数据错误!");
            return;
        }
        a.i.a(new w((short) 4244, bArrB));
        this.e.a((String) null);
    }

    private void C(Graphics graphics) {
        if (this.l == 0 && this.e.aq != null) {
            this.e.aq.a(graphics);
            return;
        }
        if (this.l == 1 && this.e.av != null) {
            this.e.av.a(graphics);
        } else {
            if (this.l != 2 || this.e.av == null) {
                return;
            }
            this.e.av.a(graphics);
            ca.a(graphics, bt.P.c[bt.P.i].e, new String[]{"确定", "取消"});
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    private void D(int i2) {
        if (this.bS) {
            if (bt.fh.length >= 10) {
                this.e.b("交易物品栏已满");
                return;
            }
            short s2 = 0;
            while (true) {
                if (s2 >= 10) {
                    break;
                }
                boolean z2 = false;
                for (int i3 = 0; i3 < bt.fk.length; i3++) {
                    if (s2 == bt.fk[i3]) {
                        z2 = true;
                    }
                }
                if (!z2) {
                    this.e.ax = s2;
                    break;
                }
                s2++;
            }
        }
        byte[] bArrA = bz.a((short) 4126, bt.ad, z((this.ar << 3) + this.aq), this.e.ax % 10, i2);
        if (bArrA == null) {
            this.e.b("获取上传指令数据错误!");
        } else {
            a.i.a(new w((short) 4126, bArrA));
            this.bS = true;
        }
    }

    private void D(Graphics graphics) {
        if (this.e.aq != null) {
            this.e.aq.a(graphics);
        }
        if (this.l == 1) {
            ca.c(graphics);
        }
    }

    private void E(int i2) {
        byte[] bArrE = bz.e((short) 4157, bt.ad, z((this.ar << 3) + this.aq), i2);
        if (bArrE == null) {
            this.e.b("获取上传指令数据错误!");
            return;
        }
        a.i.a(new w((short) 4157, bArrE));
        this.e.a((String) null);
    }

    private void E(Graphics graphics) {
        if (this.e.aq != null) {
            this.e.aq.a(graphics);
        }
        if (this.l == 1) {
            ca.c(graphics);
        }
    }

    private void F(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.l == 0) {
            aV();
            if (this.e.aq != null) {
                this.e.aq.b(i2);
            }
            if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                if (i2 == 1024 || i2 == 2048) {
                    G((this.ar << 3) + this.aq);
                    return;
                }
                if (i2 == 8 || i2 == 516) {
                    if (this.aq <= 0) {
                        i3 = 7;
                    } else {
                        i3 = this.aq - 1;
                        this.aq = i3;
                    }
                    this.aq = i3;
                    G((this.ar << 3) + this.aq);
                    return;
                }
                if (i2 == 2 || i2 == 518) {
                    if (this.aq >= 7) {
                        i4 = 0;
                    } else {
                        i4 = this.aq + 1;
                        this.aq = i4;
                    }
                    this.aq = i4;
                    G((this.ar << 3) + this.aq);
                    return;
                }
                if (i2 == 1 || i2 == 514) {
                    if (this.ar <= 0) {
                        i5 = 3;
                    } else {
                        i5 = this.ar - 1;
                        this.ar = i5;
                    }
                    this.ar = i5;
                    G((this.ar << 3) + this.aq);
                    return;
                }
                if (i2 == 4 || i2 == 520) {
                    if (this.ar >= 3) {
                        i6 = 0;
                    } else {
                        i6 = this.ar + 1;
                        this.ar = i6;
                    }
                    this.ar = i6;
                    G((this.ar << 3) + this.aq);
                    return;
                }
                if (i2 == 536870912) {
                    if (this.j == 102) {
                        this.V.a(false);
                        return;
                    }
                    if (this.j == 106) {
                        this.O.a(false);
                        return;
                    }
                    if (this.j == 110) {
                        this.P.a(false);
                        return;
                    } else if (this.j == 118) {
                        this.Q.a(false);
                        return;
                    } else {
                        if (this.j == 64) {
                            this.O.a((int) this.O.a, this.O.c, this.O.d);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            int i7 = this.aq + (this.e.as.a << 5) + (this.ar << 3);
            bn bnVar = i7 < this.bU.size() ? (bn) this.bU.elementAt(i7) : null;
            if (bnVar != null) {
                if (this.j == 102) {
                    if (bnVar.g - bnVar.v <= 0 || this.V.b != 0) {
                        return;
                    }
                    byte[] bArrA = bz.a((short) 4689, bnVar.a, (byte) 0, (byte) -1, bt.ad);
                    if (bArrA == null) {
                        this.e.b("获取上传指令数据错误!");
                        return;
                    } else {
                        a.i.a(new w((short) 4689, bArrA));
                        this.e.a((String) null);
                        return;
                    }
                }
                if (this.j == 106) {
                    if (bnVar.g - bnVar.v > 0) {
                        byte[] bArrA2 = null;
                        if (this.O.f == 0) {
                            bArrA2 = bz.a((short) 4688, bnVar.a, -1L, (byte) 0, o.h, bt.jG, (byte[]) null, bt.ad);
                        } else if (this.O.f == 1) {
                            bArrA2 = bz.a((short) 4688, o.g, bnVar.a, (byte) 1, o.h, bt.jG, (byte[]) null, bt.ad);
                        }
                        if (bArrA2 == null) {
                            this.e.b("获取上传指令数据错误!");
                            return;
                        } else {
                            a.i.a(new w((short) 4688, bArrA2));
                            this.e.a((String) null);
                            return;
                        }
                    }
                    return;
                }
                if (this.j == 110) {
                    if (bnVar.g - bnVar.v > 0) {
                        if (this.P.b == 0 || (this.P.b == 1 && this.P.c != -1)) {
                            byte[] bArrA3 = null;
                            if (this.P.b != 0) {
                                bArrA3 = bz.a((short) 4262, this.P.c, this.P.d, (byte) this.P.b, this.P.e, this.P.f, bnVar.a, (byte) this.P.a, bt.ad);
                            } else if (this.P.a == 0) {
                                bArrA3 = bz.a((short) 4262, bnVar.a, -1L, (byte) this.P.b, (int[]) null, (byte[]) null, -1, (byte) this.P.a, bt.ad);
                            } else if (this.P.a == 1) {
                                bArrA3 = bz.a((short) 4262, this.P.c, bnVar.a, (byte) 4, (int[]) null, (byte[]) null, -1, (byte) this.P.a, bt.ad);
                            }
                            if (bArrA3 == null) {
                                this.e.b("获取上传指令数据错误!");
                                return;
                            } else {
                                a.i.a(new w((short) 4262, bArrA3));
                                this.e.a((String) null);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                if (this.j == 118) {
                    if (bnVar.g - bnVar.v > 0) {
                        if (this.Q.b == 0 || (this.Q.b == 1 && this.Q.c != -1)) {
                            byte[] bArrA4 = null;
                            if (this.Q.b != 0) {
                                bArrA4 = bz.a((byte) 4, this.Q.c, this.Q.d, this.Q.e, this.Q.f, bnVar.a, (byte) this.Q.a, bt.ad);
                            } else if (this.Q.a == 0) {
                                bArrA4 = bz.a((byte) 1, bnVar.a, -1, (int[]) null, (byte[]) null, -1, (byte) this.Q.a, bt.ad);
                            } else if (this.Q.a == 1) {
                                bArrA4 = bz.a((byte) 2, this.Q.c, bnVar.a, (int[]) null, (byte[]) null, -1, (byte) this.Q.a, bt.ad);
                            }
                            if (bArrA4 == null) {
                                this.e.b("获取上传指令数据错误!");
                                return;
                            } else {
                                a.i.a(new w((short) 4266, bArrA4));
                                this.e.a((String) null);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                if (this.j != 64 || bnVar.g - bnVar.v <= 0) {
                    return;
                }
                o.e = (byte) 1;
                if (this.O.c == 13) {
                    byte[] bArrA5 = bz.a((short) 4687, bt.ko, (byte) 3, bt.jG, bnVar.a, this.O.b, "", bt.ad);
                    if (bArrA5 == null) {
                        this.e.b("获取上传指令数据错误!");
                        return;
                    } else {
                        a.i.a(new w((short) 4687, bArrA5));
                        this.e.a((String) null);
                        return;
                    }
                }
                byte[] bArrC = bz.c((short) 4645, bt.ad, bt.ko, bnVar.a, this.O.b);
                if (bArrC == null) {
                    this.e.b("获取上传指令数据错误!");
                } else {
                    a.i.a(new w((short) 4645, bArrC));
                    this.e.a((String) null);
                }
            }
        }
    }

    private void F(Graphics graphics) {
        ca.a(graphics, 0, t.c - ca.f, t.b, ca.f, K, bt.lz, (String[]) null);
        if (this.l == 1) {
            ca.a(graphics, bt.lB[ca.g], new String[]{"确定", "取消"});
        }
    }

    private void G(int i2) {
        int i3 = (this.e.as.a << 5) + i2;
        if (this.bU.size() <= 0 || i3 >= this.bU.size()) {
            this.e.at.a("没有物品，按3、9键可以上下翻滚此属性描述框", t.i, (byte) 1);
        } else {
            this.e.at.a(a((bn) this.bU.elementAt(i3)), t.i, (byte) 1);
        }
        this.e.at.a((byte) 1);
        this.l = (short) 0;
        ca.l = 0;
    }

    private void G(Graphics graphics) {
        if (this.l == 0) {
            ca.c(graphics);
        }
    }

    private void H(int i2) {
        boolean z2 = false;
        if (this.l == 0) {
            if (this.e.aq != null) {
                this.e.aq.b(i2);
            }
            this.aV = this.e.as.a;
            if (i2 == 8 || i2 == 2 || i2 == 518 || i2 == 516) {
                b(this.e.as.a);
            }
            if (i2 == 268435456 || i2 == 1073741824 || i2 == 517) {
                if (this.e.as.a < 3) {
                    if (bt.gH != null) {
                        ca.a(o + 65, (t.j * 2) + 10 + (this.e.ar.g() * t.j) + p, new String[]{"查看", "私聊", "组队", "交易", "好友", "黑名单", "PK", "参观住宅"}, false);
                        this.l = (short) 1;
                        return;
                    }
                    return;
                }
                if (this.e.as.a != 3 || bt.q == null || bt.q[this.e.ar.g()].b.equals(bt.ad)) {
                    return;
                }
                if (bt.bs == 1) {
                    int iG = p + ((this.e.ar.g() + 3) * t.j) + 10;
                    String[] strArr = new String[7];
                    strArr[0] = "踢除";
                    strArr[1] = "任命";
                    strArr[2] = "解散";
                    strArr[3] = "群聊";
                    strArr[4] = "私聊";
                    strArr[5] = "查看";
                    strArr[6] = bt.s == 0 ? "自由" : "跟随";
                    ca.a(0, iG, strArr, true);
                } else {
                    ca.a(0, ((this.e.ar.g() + 3) * t.j) + p, new String[]{"群聊", "私聊", "离开", "查看"}, true);
                }
                this.l = (short) 8;
                return;
            }
            if (i2 == 536870912) {
                if (this.by == 1) {
                    N();
                    this.by = (byte) 0;
                } else {
                    au();
                    c(2);
                }
                bt.gQ = (short) 1;
                bt.D();
                return;
            }
            if (i2 == 1024) {
                if (bt.gQ > 1 && bt.gR == 1) {
                    if (bt.gQ - 1 <= 1) {
                        bt.gQ = (short) 1;
                    } else {
                        bt.gQ = (short) (bt.gQ - 1);
                    }
                    aS();
                    return;
                }
                if (bt.gQ <= 1 || bt.gR != 0) {
                    return;
                }
                if (bt.gQ - 1 < 1) {
                    bt.gQ = (short) 1;
                } else {
                    bt.gQ = (short) (bt.gQ - 1);
                }
                aS();
                return;
            }
            if (i2 != 2048) {
                if (i2 == 513) {
                    this.e.as.a = (byte) 3;
                    b(this.e.as.a);
                    return;
                }
                return;
            }
            if (bt.gQ <= 1 && bt.gR == 1) {
                bt.gQ = (short) (bt.gQ + 1);
                aS();
                return;
            } else {
                if (bt.gQ <= 1 || bt.gR != 1) {
                    return;
                }
                bt.gQ = (short) (bt.gQ + 1);
                aS();
                return;
            }
        }
        if (this.l == 1) {
            if (this.e.aC != null && this.e.g) {
                this.aQ = bt.gJ[this.e.ar.g()];
                a(bt.gH[this.e.ar.g()], (byte) 4);
                this.l = (short) 0;
            }
            ca.b(i2);
            if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                if (i2 == 536870912) {
                    this.l = (short) 0;
                    return;
                }
                return;
            }
            if (ca.o == 0) {
                ca.a(o + 65, ((this.e.ar.g() + 3) * t.j) + p, new String[]{"属性", "装备", "成就"}, false);
                this.l = (short) 2;
                return;
            }
            if (ca.o == 1) {
                this.aS = bt.gH[this.e.ar.g()];
                this.aT = 4;
                this.e.a("聊天", 0);
                return;
            }
            if (ca.o == 2) {
                if (bt.G()) {
                    this.e.b("住宅中不能组队");
                    return;
                }
                if (bt.bw >= 1 && (bt.gP[this.e.ar.g()] == 2 || bt.gP[this.e.ar.g()] == 3)) {
                    this.e.b("敌对玩家不能组队！");
                    return;
                } else if (bt.bs != -1) {
                    a(bt.s, bt.gH[this.e.ar.g()]);
                    return;
                } else {
                    ca.a(o + 65, ((this.e.ar.g() + 3) * t.j) + p, new String[]{"自由", "跟随"}, false);
                    this.l = (short) 6;
                    return;
                }
            }
            if (ca.o == 3) {
                if (bt.bw >= 1 && (bt.gP[this.e.ar.g()] == 2 || bt.gP[this.e.ar.g()] == 3)) {
                    this.e.b("敌对玩家不能交易！");
                    return;
                } else {
                    ca.a(o + 65, ((this.e.ar.g() + 3) * t.j) + p, new String[]{"物品", "宠物"}, false);
                    this.l = (short) 5;
                    return;
                }
            }
            if (ca.o == 4) {
                a(bt.gH[this.e.ar.g()]);
                this.l = (short) 0;
                return;
            }
            if (ca.o == 5) {
                b(bt.gH[this.e.ar.g()]);
                this.l = (short) 0;
                return;
            }
            if (ca.o != 6) {
                if (ca.o == 7) {
                    if (bt.G()) {
                        this.e.b("住宅中不能参观别人住宅");
                        return;
                    } else if (bt.bs != -1) {
                        this.e.b("队伍中不能参看住宅！");
                        return;
                    } else {
                        a((byte) 1, -1, bt.gH[this.e.ar.g()]);
                        return;
                    }
                }
                return;
            }
            String str = bt.gH[this.e.ar.g()];
            if (bt.q != null) {
                byte b2 = 0;
                while (true) {
                    if (b2 >= bt.q.length) {
                        break;
                    }
                    if (bt.q[b2].b.equals(str)) {
                        z2 = true;
                        break;
                    }
                    b2 = (byte) (b2 + 1);
                }
            }
            if (z2) {
                this.e.b("队友间不允许决斗!");
                return;
            }
            if (bt.gL[this.e.ar.g()] == 0 && bt.s == 0) {
                this.e.b(new StringBuffer().append(bt.gJ[this.e.ar.g()]).append("不是队长!").toString());
                return;
            }
            if (bt.bs == 0 && bt.s == 0) {
                this.e.b("跟随模式下队员不能发出决斗邀请");
                return;
            }
            if (bt.bw < 1) {
                o();
                this.l = (short) 7;
                return;
            }
            if (bt.gP[this.e.ar.g()] == 0 || bt.gP[this.e.ar.g()] == 1) {
                this.e.b("非敌对玩家不能决斗！");
                return;
            }
            if (bt.gP[this.e.ar.g()] == 2 || bt.gP[this.e.ar.g()] == 3) {
                if (System.currentTimeMillis() - bt.y > (bt.bw == 1 ? this.M.q : bt.bw == 2 ? this.M.r : 0L)) {
                    this.M.a(bt.gH[this.e.ar.g()], (byte) 1);
                    return;
                } else {
                    this.e.b("保护时间内玩家不能决斗！");
                    return;
                }
            }
            return;
        }
        if (this.l == 2 || this.l == 6) {
            ca.b(i2);
            if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                if (i2 == 536870912) {
                    ca.a(o + 65, (t.j * 2) + 20 + (this.e.ar.g() * t.j) + p, new String[]{"查看", "私聊", "组队", "交易", "好友", "黑名单", "PK", "参观住宅"}, false);
                    this.l = (short) 1;
                    return;
                }
                return;
            }
            if (this.l == 6) {
                a(ca.o != 0 ? (short) 0 : (short) 1, bt.gH[this.e.ar.g()]);
                return;
            }
            if (ca.o == 0) {
                byte[] bArrA = bz.a((short) 4110, bt.ad, bt.gH[this.e.ar.g()], (byte) 0);
                if (bArrA == null) {
                    this.e.b("获取上传指令数据错误!");
                    return;
                } else {
                    a.i.a(new w((short) 4110, bArrA));
                    this.e.a((String) null);
                    return;
                }
            }
            if (ca.o != 1) {
                if (ca.o == 2) {
                    this.df = bt.gH[this.e.ar.g()];
                    a(bt.gH[this.e.ar.g()], bt.ad, (short) 2, (short) 1);
                    return;
                }
                return;
            }
            byte[] bArrB = bz.b((short) 4111, bt.ad, bt.gH[this.e.ar.g()]);
            if (bArrB == null) {
                this.e.b("获取上传指令数据错误!");
                return;
            } else {
                a.i.a(new w((short) 4111, bArrB));
                this.e.a((String) null);
                return;
            }
        }
        if (this.l == 3) {
            this.T.b(i2);
            if (i2 == 268435456 || i2 == 536870912) {
                this.al = null;
                this.T.j();
                this.l = (short) 2;
                return;
            }
            return;
        }
        if (this.l == 4) {
            a(bt.cJ);
            g(i2);
            if (i2 == 536870912) {
                if (this.m == 1) {
                    this.T.j();
                    this.m = (short) 0;
                    return;
                }
                if (bt.cJ != null) {
                    bt.o();
                }
                q = null;
                this.al = null;
                a.f.a(this.f, h, i, true, false, 1009050);
                this.l = (short) 2;
                return;
            }
            return;
        }
        if (this.l == 5) {
            ca.b(i2);
            if (i2 == 268435456 || i2 == 1073741824 || i2 == 517) {
                e(bt.gH[this.e.ar.g()]);
                return;
            } else {
                if (i2 == 536870912) {
                    ca.a(o + 65, (t.j * 2) + 20 + (this.e.ar.g() * t.j) + p, new String[]{"查看", "私聊", "组队", "交易", "好友", "黑名单", "PK", "参观住宅"}, false);
                    ca.o = 3;
                    this.l = (short) 1;
                    return;
                }
                return;
            }
        }
        if (this.l == 7) {
            d(i2);
            if (i2 != 268435456) {
                if (i2 == 536870912) {
                    ca.a(o + 65, (t.j * 2) + 20 + (this.e.ar.g() * t.j) + p, new String[]{"查看", "私聊", "组队", "交易", "好友", "黑名单", "PK", "参观住宅"}, false);
                    this.l = (short) 1;
                    return;
                }
                return;
            }
            if (n() <= 0) {
                this.e.b("输入金钱必须大于0!");
                return;
            }
            if (n() > bt.ap) {
                this.e.b("输入金钱超出你支付能力!");
                return;
            }
            byte[] bArrA2 = bz.a((short) 4185, bt.ad, bt.gH[this.e.ar.g()], n());
            if (bArrA2 != null) {
                a.i.a(new w((short) 4185, bArrA2));
            } else {
                this.e.b("获取上传指令数据错误!");
            }
            this.l = (short) 0;
            return;
        }
        if (this.l == 8) {
            ca.b(i2);
            if (this.e.aC != null && this.e.g) {
                if (this.bz == 0 || this.bz == 3) {
                    a((String) null, (byte) 2);
                } else {
                    a(bt.q[this.e.ar.g()].b, (byte) 4);
                }
            }
            if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                if (i2 == 536870912) {
                    this.l = (short) 0;
                    return;
                }
                return;
            }
            if (bt.bs != 1) {
                if (bt.bs == 0) {
                    if (ca.o == 0) {
                        this.aS = null;
                        this.aT = 2;
                        this.e.a("聊天", 0);
                        this.bz = 0;
                        this.aQ = bt.q[this.e.ar.g()].e;
                        return;
                    }
                    if (ca.o == 1) {
                        this.aS = bt.q[this.e.ar.g()].b;
                        this.aT = 2;
                        this.e.a("聊天", 0);
                        this.bz = 1;
                        this.aQ = bt.q[this.e.ar.g()].e;
                        return;
                    }
                    if (ca.o == 2) {
                        ca.a(0, ((this.e.ar.g() + 3) * t.j) + p, new String[]{"确认", "取消"}, true);
                        this.bz = 2;
                        this.l = (short) 9;
                        return;
                    } else {
                        if (ca.o == 3) {
                            ca.a(0, ((this.e.ar.g() + 3) * t.j) + p, new String[]{"属性", "装备"}, true);
                            this.bz = 3;
                            this.l = (short) 10;
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (ca.o == 0) {
                ca.a(0, ((this.e.ar.g() + 3) * t.j) + p, new String[]{"确认", "取消"}, true);
                this.bz = 0;
                this.l = (short) 9;
                return;
            }
            if (ca.o == 1) {
                ca.a(0, ((this.e.ar.g() + 3) * t.j) + p, new String[]{"确认", "取消"}, true);
                this.bz = 1;
                this.l = (short) 9;
                return;
            }
            if (ca.o == 2) {
                ca.a(0, ((this.e.ar.g() + 3) * t.j) + p, new String[]{"确认", "取消"}, true);
                this.bz = 2;
                this.l = (short) 9;
                return;
            }
            if (ca.o == 3) {
                this.aS = null;
                this.aT = 2;
                this.e.a("聊天", 0);
                this.bz = 3;
                this.aQ = bt.q[this.e.ar.g()].e;
                return;
            }
            if (ca.o == 4) {
                this.aS = bt.q[this.e.ar.g()].b;
                this.aT = 4;
                this.e.a("聊天", 0);
                this.bz = 4;
                this.aQ = bt.q[this.e.ar.g()].e;
                return;
            }
            if (ca.o == 5) {
                ca.a(0, ((this.e.ar.g() + 3) * t.j) + p, new String[]{"属性", "装备"}, true);
                this.l = (short) 10;
                return;
            }
            if (ca.o == 6) {
                this.bz = 6;
                byte[] bArrB2 = bz.b((short) 4115, bt.ad, bt.s);
                if (bArrB2 == null) {
                    this.e.b("获取上传指令数据错误!");
                    return;
                }
                a.i.a(new w((short) 4115, bArrB2));
                if (bt.s == 0) {
                    this.e.b("队员自由活动请求已发送!");
                    return;
                } else {
                    if (bt.s == 1) {
                        this.e.b("队伍集合请求已发送!");
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (this.l == 9) {
            ca.b(i2);
            if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                if (i2 == 536870912) {
                    an(this.bz);
                    return;
                }
                return;
            }
            if (ca.o != 0) {
                if (ca.o == 1) {
                    an(this.bz);
                    return;
                }
                return;
            }
            if (this.bz == 0) {
                byte[] bArrE = bz.e((short) 4114, bt.ad, bt.q[this.e.ar.g()].b);
                if (bArrE == null) {
                    this.e.b("获取上传指令数据错误!");
                    return;
                } else {
                    a.i.a(new w((short) 4114, bArrE));
                    this.e.b(new StringBuffer().append("剔除队员").append(bt.q[this.e.ar.g()].e).append("请求已发送!").toString());
                    return;
                }
            }
            if (this.bz == 1) {
                byte[] bArrF = bz.f((short) 4119, bt.ad, bt.q[this.e.ar.g()].b);
                if (bArrF == null) {
                    this.e.b("获取上传指令数据错误!");
                    return;
                } else {
                    a.i.a(new w((short) 4119, bArrF));
                    this.e.b(new StringBuffer().append("任命").append(bt.q[this.e.ar.g()].e).append("为队长请求已发送!").toString());
                    return;
                }
            }
            if (this.bz == 2) {
                if (bt.bs == 1) {
                    byte[] bArrH = bz.h((short) 4120, bt.ad);
                    if (bArrH == null) {
                        this.e.b("获取上传指令数据错误!");
                        return;
                    } else {
                        a.i.a(new w((short) 4120, bArrH));
                        this.e.b("解散队伍请求已发送!");
                        return;
                    }
                }
                if (bt.bs == 0) {
                    byte[] bArrI = bz.i((short) 4121, bt.ad);
                    if (bArrI == null) {
                        this.e.b("获取上传指令数据错误!");
                        return;
                    } else {
                        a.i.a(new w((short) 4121, bArrI));
                        this.e.b("脱离队伍请求已发送!");
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (this.l != 10) {
            if (this.l == 11) {
                this.T.b(i2);
                if (i2 == 268435456 || i2 == 536870912) {
                    ca.a(0, ((this.e.ar.g() + 3) * t.j) + p, new String[]{"属性", "装备"}, true);
                    this.T.j();
                    this.l = (short) 10;
                    return;
                }
                return;
            }
            if (this.l == 12) {
                a(bt.cJ);
                g(i2);
                if (i2 == 536870912) {
                    if (this.m == 1) {
                        this.T.j();
                        this.m = (short) 0;
                        return;
                    }
                    ca.a(0, ((this.e.ar.g() + 3) * t.j) + p, new String[]{"属性", "装备"}, true);
                    if (bt.cJ != null) {
                        bt.o();
                    }
                    q = null;
                    this.al = null;
                    a.f.a(this.f, h, i, true, false, 1009050);
                    this.l = (short) 10;
                    return;
                }
                return;
            }
            return;
        }
        ca.b(i2);
        if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
            if (i2 == 536870912) {
                this.bz = 3;
                if (bt.bs == 1) {
                    this.bz = 5;
                }
                an(this.bz);
                return;
            }
            return;
        }
        if (ca.o == 0) {
            byte[] bArrA3 = bz.a((short) 4110, bt.ad, bt.q[this.e.ar.g()].b, (byte) 0);
            if (bArrA3 == null) {
                this.e.b("获取上传指令数据错误!");
                return;
            } else {
                a.i.a(new w((short) 4110, bArrA3));
                this.e.a((String) null);
                return;
            }
        }
        if (ca.o == 1) {
            byte[] bArrB3 = bz.b((short) 4111, bt.ad, bt.q[this.e.ar.g()].b);
            if (bArrB3 == null) {
                this.e.b("获取上传指令数据错误!");
            } else {
                a.i.a(new w((short) 4111, bArrB3));
                this.e.a((String) null);
            }
        }
    }

    private void H(Graphics graphics) {
        if (this.e.aq != null) {
            this.e.aq.a(graphics);
        }
    }

    private void I(int i2) {
        int i3 = 1;
        int i4 = 0;
        this.cd = null;
        this.ce = null;
        this.cf = null;
        if (i2 == 0) {
            if (bt.bS == null) {
                this.cd = new String[1];
                this.cd[0] = "没有已经接任务";
                return;
            }
            this.cd = bt.bS;
            short[] sArr = bt.bT;
            this.ce = new String[sArr.length];
            while (i4 < sArr.length) {
                this.ce[i4] = new StringBuffer().append((int) sArr[i4]).append("级").toString();
                i4++;
            }
            this.cf = bt.bV;
            return;
        }
        switch (i2) {
            case 1:
                i3 = 2;
                break;
            case 2:
                break;
            case 3:
                i3 = 3;
                break;
            case 4:
                i3 = 0;
                break;
            default:
                i3 = 0;
                break;
        }
        if (bt.bM != null) {
            Vector vector = new Vector();
            Vector vector2 = new Vector();
            Vector vector3 = new Vector();
            while (i4 < bt.bO.length) {
                if (bt.bO[i4] == i3) {
                    vector.addElement(bt.bM[i4]);
                    vector2.addElement(new StringBuffer().append((int) bt.bN[i4]).append("级").toString());
                    vector3.addElement(bt.bP[i4]);
                }
                i4++;
            }
            if (vector.size() > 0) {
                this.cd = new String[vector.size()];
                this.ce = new String[vector2.size()];
                this.cf = new String[vector3.size()];
                vector.copyInto(this.cd);
                vector2.copyInto(this.ce);
                vector3.copyInto(this.cf);
                vector.removeAllElements();
                vector2.removeAllElements();
                vector3.removeAllElements();
            }
        }
    }

    private void I(Graphics graphics) {
        if (this.T != null) {
            this.T.a(graphics);
        }
    }

    private void J(int i2) {
        if (this.l == 0) {
            if (this.e.aq != null) {
                this.e.aq.b(i2);
            }
            if (i2 == 8 || i2 == 516 || i2 == 2 || i2 == 518) {
                I(this.e.as.a);
                this.e.ar.a((Image[]) null, this.cd, (String[]) null, this.ce);
                if (this.cf == null || this.cf.length <= 0) {
                    this.e.ar.a("", 1);
                    return;
                } else {
                    this.e.ar.a(this.cf[this.e.ar.g()], 1);
                    return;
                }
            }
            if (i2 == 536870912 || (bt.bR == null && bt.bL == null)) {
                if (this.by == 1) {
                    N();
                    this.by = (byte) 0;
                    return;
                } else {
                    at();
                    c(3);
                    return;
                }
            }
            if (i2 == 1 || i2 == 4 || i2 == 514 || i2 == 520) {
                if (this.cf == null || this.cf.length <= 0) {
                    return;
                }
                this.e.ar.a(this.cf[this.e.ar.g() < this.cf.length ? this.e.ar.g() : this.cf.length - 1], 1);
                return;
            }
            if ((i2 == 268435456 || i2 == 1073741824 || i2 == 517) && this.e.as.a == 0 && bt.bR != null && bt.bU[this.e.ar.g()] == 0) {
                aE();
                return;
            }
            return;
        }
        if (this.l == 1) {
            ca.b(i2);
            if (i2 == 268435456 || i2 == 517 || i2 == 1073741824) {
                switch (ca.o) {
                    case 0:
                        a((short) 5124, bz.a((short) 5124, bt.ad, bt.bR[this.e.ar.g()]), (String) null);
                        break;
                    case 1:
                        this.bs = (short) 0;
                        a((short) 5125, bz.a((short) 5125, bt.ad, bt.bR[this.e.ar.g()]), (String) null);
                        this.l = (short) 0;
                        break;
                    case 2:
                        a((short) 4132, bz.d((short) 4132, bt.ad, bt.bR[this.e.ar.g()]), (String) null);
                        this.aA = this.e.ar.h();
                        this.aE = this.e.ar.g();
                        break;
                    case 3:
                        ca.a(o + 35, ((this.e.ar.i() + 3) * t.j) + 12 + p, new String[]{"确认", "取消"}, false);
                        this.l = (short) 2;
                        break;
                }
                return;
            }
            if (i2 != 536870912) {
                return;
            }
        } else {
            if (this.l == 2) {
                ca.b(i2);
                if (i2 == 268435456 || i2 == 517 || i2 == 1073741824) {
                    if (ca.o == 0) {
                        a((short) 4133, bz.e((short) 4133, bt.ad, bt.bR[this.e.ar.g()]), (String) null);
                        return;
                    } else {
                        if (ca.o == 1) {
                            aE();
                            return;
                        }
                        return;
                    }
                }
                if (i2 == 536870912) {
                    aE();
                    return;
                }
                if (bt.bR == null && bt.bL == null) {
                    if (this.by == 1) {
                        N();
                        this.by = (byte) 0;
                        return;
                    } else {
                        at();
                        this.e.ax = 1;
                        return;
                    }
                }
                return;
            }
            if (this.l != 3) {
                return;
            }
            if (this.e.aq != null) {
                this.e.aq.b(i2);
            }
            if (i2 != 268435456 && i2 != 536870912 && i2 != 517 && i2 != 1073741824) {
                return;
            }
            x();
            this.e.ar.a(this.aA, this.aE);
            if (bt.bV != null && bt.bV.length > 0) {
                this.e.ar.a(bt.bV[this.aE], 1);
            }
        }
        this.l = (short) 0;
    }

    private void J(Graphics graphics) {
        this.e.aq.a(graphics);
        if (this.l == 1 || this.l == 2) {
            ca.c(graphics);
        }
    }

    private void K(int i2) {
        byte b2;
        byte b3;
        String[] strArr;
        String[] strArr2;
        if (this.l == 0) {
            if (this.e.aq != null) {
                this.e.aq.b(i2);
            }
            a(bt.dr);
            if (i2 == 1 || i2 == 4 || i2 == 514 || i2 == 520) {
                if (bt.dl == null || bt.dl.length <= 0) {
                    this.e.a = 0;
                    return;
                }
                this.e.ar.a(bt.ds[this.e.ar.g()], 2);
                this.e.at.a("".equals(bt.dt[this.e.ar.g()]) ? "<0>当前已经最高等级" : bt.dt[this.e.ar.g()], t.i, (byte) 1);
                this.e.at.a((byte) 1);
                return;
            }
            if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                if (i2 == 536870912) {
                    bt.p();
                    if (this.g != null && !i()) {
                        this.g.e = 3;
                        this.k = (short) 25;
                        this.j = (short) 25;
                        return;
                    } else {
                        c(0, this.aE, this.aA);
                        E();
                        ca.o = 8;
                        this.l = (short) 1;
                        return;
                    }
                }
                return;
            }
            if (bt.dl == null || bt.dl.length <= 0) {
                return;
            }
            if (i()) {
                if (bt.dn[this.e.ar.g()] == 2 || bt.du[this.e.ar.g()] != 1) {
                    if ("".equals(bt.dt[this.e.ar.g()])) {
                        String[] strArr3 = new String[2];
                        strArr3[0] = bt.du[this.e.ar.g()] == 0 ? "激活技能" : "取消激活";
                        strArr3[1] = "遗忘技能";
                        strArr = strArr3;
                    } else {
                        String[] strArr4 = new String[3];
                        strArr4[0] = "升级";
                        strArr4[1] = bt.du[this.e.ar.g()] == 0 ? "激活技能" : "取消激活";
                        strArr4[2] = "遗忘技能";
                        strArr = strArr4;
                    }
                    ca.a(t.f + 70, (t.j * 2) + 16 + (this.e.ar.i() * t.j) + t.g, strArr, true);
                    this.l = (short) 5;
                    return;
                }
                if ("".equals(bt.dt[this.e.ar.g()])) {
                    String[] strArr5 = new String[3];
                    strArr5[0] = "设置快捷";
                    strArr5[1] = bt.du[this.e.ar.g()] == 0 ? "激活技能" : "取消激活";
                    strArr5[2] = "遗忘技能";
                    strArr2 = strArr5;
                } else {
                    String[] strArr6 = new String[4];
                    strArr6[0] = "升级";
                    strArr6[1] = "设置快捷";
                    strArr6[2] = bt.du[this.e.ar.g()] == 0 ? "激活技能" : "取消激活";
                    strArr6[3] = "遗忘技能";
                    strArr2 = strArr6;
                }
                ca.a(t.f + 70, (t.j * 2) + 16 + (this.e.ar.i() * t.j) + t.g, strArr2, true);
                this.l = (short) 1;
                return;
            }
            if (this.g == null || bt.dn[this.e.ar.g()] == 2 || i() || bt.du[this.e.ar.g()] != 1) {
                return;
            }
            if (bt.f1do[this.e.ar.g()] == 2) {
                if (bq.c() <= 1 || bq.c() <= bt.dp[this.e.ar.g()]) {
                    this.g.a(this.g.j, this.g.p, this.g.n, this.g.o, (byte) 1, bt.dl[this.e.ar.g()], (byte) 1, bt.M[this.g.h].a);
                    this.g.f = (short) -1;
                    this.g.e = 5;
                } else {
                    this.g.k = (byte) 1;
                    this.g.q = bt.dl[this.e.ar.g()];
                    this.g.d = 3;
                }
            } else if (bt.f1do[this.e.ar.g()] == 1) {
                this.g.k = (byte) 1;
                this.g.q = bt.dl[this.e.ar.g()];
                if (bq.b() <= 1) {
                    this.g.m = (byte) (bq.i() + 3);
                    this.g.l = (byte) 0;
                    this.g.a(this.g.j, this.g.p, this.g.n, this.g.o, (byte) 1, bt.dl[this.e.ar.g()], this.g.l, this.g.m);
                    this.g.f = (short) -1;
                    this.g.e = 5;
                } else {
                    this.g.k = (byte) 1;
                    this.g.q = bt.dl[this.e.ar.g()];
                    this.g.d = 6;
                    this.g.i = this.g.g();
                }
            } else if (bt.f1do[this.e.ar.g()] == 0) {
                this.g.k = (byte) 1;
                this.g.q = bt.dl[this.e.ar.g()];
                this.g.m = (byte) (bq.i() + 3);
                this.g.l = (byte) 0;
                this.g.a(this.g.j, this.g.p, this.g.n, this.g.o, (byte) 1, bt.dl[this.e.ar.g()], this.g.l, this.g.m);
                this.g.f = (short) -1;
                this.g.e = 5;
            }
            this.k = (short) 25;
            this.j = (short) 25;
            return;
        }
        if (this.l == 1) {
            if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                if (i2 == 536870912) {
                    this.l = (short) 0;
                    return;
                } else {
                    ca.b(i2);
                    return;
                }
            }
            if (ca.p.length == 4 && ca.o == 0) {
                this.l = (short) 0;
                this.aq = this.e.ar.h();
                this.ar = this.e.ar.g();
                byte[] bArrJ = bz.j((short) 4166, bt.ad, bt.fA[this.aE], bt.dl[this.e.ar.g()]);
                if (bArrJ == null) {
                    this.e.b("获取上传指令数据错误!");
                    return;
                } else {
                    a.i.a(new w((short) 4166, bArrJ));
                    this.e.a((String) null);
                    return;
                }
            }
            if ((ca.p.length == 3 && ca.o == 0) || (ca.p.length == 4 && ca.o == 1)) {
                this.az = (byte) 0;
                if (bt.eq != null) {
                    this.l = (short) 2;
                    return;
                }
                if (this.e.j != 2) {
                    this.e.j = this.e.k;
                }
                this.l = (short) 2;
                return;
            }
            if ((ca.p.length == 3 && ca.o == 1) || (ca.p.length == 4 && ca.o == 2)) {
                this.aq = this.e.ar.h();
                this.ar = this.e.ar.g();
                byte[] bArrA = bz.a((short) 4663, bt.fA[this.aE], bt.dl[this.e.ar.g()], bt.du[this.e.ar.g()], bt.ad);
                if (bArrA == null) {
                    this.e.b("获取上传指令数据错误!");
                    return;
                } else {
                    a.i.a(new w((short) 4663, bArrA));
                    this.e.a((String) null);
                    return;
                }
            }
            if ((ca.p.length == 3 && ca.o == 2) || (ca.p.length == 4 && ca.o == 3)) {
                if (bt.dl[this.e.ar.g()] != 1) {
                    this.e.a("输入OK确定遗忘宠物技能", 0);
                } else {
                    this.e.b("普通技能不能被遗忘");
                }
                this.l = (short) 0;
                return;
            }
            return;
        }
        if (this.l == 2) {
            a(bt.et);
            if (i2 == 516 || i2 == 8) {
                if (this.az <= 0) {
                    b2 = 7;
                } else {
                    b2 = (byte) (this.az - 1);
                    this.az = b2;
                }
                this.az = b2;
                return;
            }
            if (i2 == 518 || i2 == 2) {
                if (this.az >= 7) {
                    b3 = 0;
                } else {
                    b3 = (byte) (this.az + 1);
                    this.az = b3;
                }
                this.az = b3;
                return;
            }
            if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                if (i2 == 536870912) {
                    this.l = (short) 0;
                    return;
                }
                return;
            } else if (bt.eq != null && bt.eq[this.az] == -1) {
                b(true, (byte) 1);
                return;
            } else {
                ca.a(t.f + 70, (t.j * 2) + 16 + (this.e.ar.i() * t.j) + t.g, new String[]{"覆盖", "清空"}, true);
                this.l = (short) 3;
                return;
            }
        }
        if (this.l == 3) {
            a(bt.et);
            if (i2 == 268435456 || i2 == 1073741824 || i2 == 517) {
                if (ca.o == 0) {
                    b(true, (byte) 1);
                    return;
                } else {
                    b(false, (byte) 1);
                    return;
                }
            }
            if (i2 == 536870912) {
                this.l = (short) 2;
                return;
            } else {
                ca.b(i2);
                return;
            }
        }
        if (this.l == 5) {
            ca.b(i2);
            if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                if (i2 == 536870912) {
                    this.l = (short) 0;
                    return;
                }
                return;
            }
            if (ca.p.length == 3 && ca.o == 0) {
                this.l = (short) 0;
                this.aq = this.e.ar.h();
                this.ar = this.e.ar.g();
                byte[] bArrJ2 = bz.j((short) 4166, bt.ad, bt.fA[this.aE], bt.dl[this.e.ar.g()]);
                if (bArrJ2 == null) {
                    this.e.b("获取上传指令数据错误!");
                    return;
                } else {
                    a.i.a(new w((short) 4166, bArrJ2));
                    this.e.a((String) null);
                    return;
                }
            }
            if ((ca.p.length == 3 && ca.o == 1) || (ca.p.length == 2 && ca.o == 0)) {
                this.l = (short) 0;
                this.aq = this.e.ar.h();
                this.ar = this.e.ar.g();
                byte[] bArrA2 = bz.a((short) 4663, bt.fA[this.aE], bt.dl[this.e.ar.g()], bt.du[this.e.ar.g()], bt.ad);
                if (bArrA2 == null) {
                    this.e.b("获取上传指令数据错误!");
                    return;
                } else {
                    a.i.a(new w((short) 4663, bArrA2));
                    this.e.a((String) null);
                    return;
                }
            }
            if ((ca.p.length == 3 && ca.o == 2) || (ca.p.length == 2 && ca.o == 1)) {
                if (bt.dl[this.e.ar.g()] != 1) {
                    this.e.a("输入OK确定遗忘宠物技能", 0);
                } else {
                    this.e.b("普通技能不能被遗忘");
                }
                this.l = (short) 0;
            }
        }
    }

    private void K(Graphics graphics) {
        ca.a(graphics, 0, t.c - ca.f, t.b, ca.f, K, this.dg, (String[]) null);
    }

    private void L(int i2) {
        if (this.l == 0) {
            this.e.aq.b(i2);
            if (i2 == 1 || i2 == 4) {
                this.ch = a.ad.b(new StringBuffer().append("").append((int) bt.mR[this.e.ar.g()]).toString());
                this.e.ar.a(bt.mS[this.e.ar.g()], 1);
                return;
            } else if (i2 == 268435456 || i2 == 1073741824 || i2 == 517) {
                ca.a(t.f + 70, (t.j * 2) + 28 + (this.e.ar.i() * t.j) + p, new String[]{"激活", "取消激活"}, true);
                this.l = (short) 1;
                return;
            } else {
                if (i2 == 536870912) {
                    av();
                    c(2);
                    return;
                }
                return;
            }
        }
        if (this.l == 1) {
            ca.b(i2);
            if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                if (i2 == 536870912) {
                    this.l = (short) 0;
                }
            } else if (ca.o == 0) {
                a((byte) 1, bt.mO[this.e.ar.g()], 0);
            } else if (ca.o == 1) {
                a((byte) 3, bt.mO[this.e.ar.g()], 0);
            }
        }
    }

    private void L(Graphics graphics) {
        if (this.l != 0 || this.e.aq == null) {
            return;
        }
        this.e.aq.a(graphics);
    }

    private void M(int i2) {
        this.e.aq.b(i2);
        if (i2 == 268435456 || i2 == 1073741824 || i2 == 517) {
            if (bt.nb != null) {
                a((byte) 4, bt.mZ, bt.nb[this.e.ar.g()]);
            }
        } else if (i2 == 536870912) {
            z();
        }
    }

    private void M(Graphics graphics) {
        if (this.e.aq != null) {
            this.e.aq.a(graphics);
        }
        if (this.l == 2) {
            ca.a(graphics, this.k == 108 ? "确认以发送短信方式开通超Q？ " : "确认以发送短信方式开通魔钻？", new String[]{"确 认", "取 消"});
        }
        if (this.l == 3) {
            ca.a(graphics, "进入超Q官网开通超Q？", new String[]{"进入", "返回"});
        }
    }

    private void N(int i2) {
        this.e.aq.b(i2);
        if (i2 == 268435456 || i2 == 1073741824 || i2 == 517) {
            a((byte) 2, bt.mT, bt.mV[this.e.ar.g()]);
        } else if (i2 == 536870912) {
            z();
        }
    }

    private static void N(Graphics graphics) {
        if (bt.Q != null) {
            bt.Q.m.a(graphics);
        }
    }

    private void O(int i2) {
        byte b2;
        byte b3;
        if (this.l != 0) {
            if (this.l == 1) {
                if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                    if (i2 == 536870912) {
                        this.l = (short) 0;
                        return;
                    } else {
                        ca.b(i2);
                        return;
                    }
                }
                if (ca.p.length == 3 && ca.o == 0) {
                    this.aE = this.e.ar.g();
                    this.aA = this.e.ar.h();
                    byte[] bArrQ = bz.q((short) 4167, bt.ad, bt.dl[this.e.ar.g()]);
                    if (bArrQ == null) {
                        this.e.b("获取上传指令数据错误!");
                        return;
                    } else {
                        a.i.a(new w((short) 4167, bArrQ));
                        this.e.a((String) null);
                        return;
                    }
                }
                if ((ca.p.length != 3 || ca.o != 1) && (ca.p.length != 2 || ca.o != 0)) {
                    if ((ca.p.length == 2 && ca.o == 1) || (ca.p.length == 3 && ca.o == 2)) {
                        a((byte) 5, "", bt.dl[this.e.ar.g()]);
                        return;
                    }
                    return;
                }
                this.az = (byte) 0;
                if (bt.ek != null) {
                    this.l = (short) 6;
                    return;
                }
                if (this.e.j != 2) {
                    this.e.j = this.e.k;
                }
                this.l = (short) 6;
                return;
            }
            if (this.l != 6) {
                if (this.l == 7) {
                    if (i2 == 268435456 || i2 == 1073741824 || i2 == 517) {
                        if (ca.o == 0) {
                            a(true, (byte) 1);
                            return;
                        } else {
                            a(false, (byte) 1);
                            return;
                        }
                    }
                    if (i2 == 536870912) {
                        this.l = (short) 6;
                        return;
                    } else {
                        ca.b(i2);
                        return;
                    }
                }
                return;
            }
            a(bt.en);
            if (i2 == 516 || i2 == 8) {
                if (this.az <= 0) {
                    b2 = 7;
                } else {
                    b2 = (byte) (this.az - 1);
                    this.az = b2;
                }
                this.az = b2;
                return;
            }
            if (i2 == 518 || i2 == 2) {
                if (this.az >= 7) {
                    b3 = 0;
                } else {
                    b3 = (byte) (this.az + 1);
                    this.az = b3;
                }
                this.az = b3;
                return;
            }
            if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                if (i2 == 536870912) {
                    this.l = (short) 0;
                    return;
                }
                return;
            } else if (bt.ek != null && bt.ek[this.az] == -1) {
                a(true, (byte) 1);
                return;
            } else {
                ca.a(t.f + 70, (t.j * 2) + 28 + (this.e.ar.i() * t.j) + p, new String[]{"覆盖", "清空"}, true);
                this.l = (short) 7;
                return;
            }
        }
        if (this.e.aq != null) {
            this.e.aq.b(i2);
        }
        if (i2 == 8 || i2 == 2 || i2 == 518 || i2 == 516) {
            if (this.e.as.a == 0) {
                a((byte) 1, false);
            } else if (this.e.as.a == 1) {
                a((byte) 0, false);
            } else {
                a(this.e.as.a, false);
            }
        }
        if (i2 == 1 || i2 == 4 || i2 == 514 || i2 == 520) {
            if (bt.dl == null || bt.dl.length <= 0) {
                return;
            }
            this.e.ar.a(bt.ds[this.e.ar.g()], 2);
            this.e.at.a("".equals(bt.dt[this.e.ar.g()]) ? "<0>当前已经最高等级" : bt.dt[this.e.ar.g()], t.i, (byte) 1);
            this.e.at.a((byte) 1);
            return;
        }
        if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
            if (i2 == 536870912) {
                bt.p();
                if (this.as == 0) {
                    av();
                    c(1);
                    return;
                } else {
                    if (this.as == 2 || this.as != 3) {
                        return;
                    }
                    this.k = (short) 25;
                    this.j = (short) 25;
                    return;
                }
            }
            return;
        }
        if (bt.dl == null || bt.dl.length <= 0) {
            return;
        }
        if (this.as == 0) {
            if (this.e.as.a == 0) {
                ca.a((t.d / 3) - (t.i.stringWidth("操作") / 2), (t.j * 2) + 28 + (this.e.ar.i() * t.j) + p, "".equals(bt.dt[this.e.ar.g()]) ? new String[]{"设置", "特效"} : new String[]{"升级", "设置", "特效"}, true);
                this.l = (short) 1;
                return;
            }
            if (this.e.as.a != 1 || "".equals(bt.dt[this.e.ar.g()])) {
                return;
            }
            this.aE = this.e.ar.g();
            this.aA = this.e.ar.h();
            byte[] bArrQ2 = bz.q((short) 4167, bt.ad, bt.dl[this.e.ar.g()]);
            if (bArrQ2 == null) {
                this.e.b("获取上传指令数据错误!");
                return;
            } else {
                a.i.a(new w((short) 4167, bArrQ2));
                this.e.a((String) null);
                return;
            }
        }
        if (this.as != 3 || this.g == null || this.e.as.a == 2) {
            return;
        }
        this.g.j = (byte) 1;
        this.g.p = bt.dl[this.e.ar.g()];
        if (bt.f1do[this.e.ar.g()] == 2) {
            if (bq.c() <= 1 || bq.c() <= bt.dp[this.e.ar.g()]) {
                this.g.n = (byte) 1;
                this.g.o = bt.M[this.g.h].a;
                if (this.g.j()) {
                    this.g.a((byte) 1, this.g.p, this.g.n, this.g.o, (byte) 1, 1, (byte) 1, (byte) -1);
                    this.g.f = (short) -1;
                    this.g.e = 5;
                } else {
                    this.g.d = 2;
                }
            } else {
                this.g.n = (byte) 1;
                this.g.d = 1;
            }
        } else if (bt.f1do[this.e.ar.g()] == 1) {
            this.g.n = (byte) 0;
            this.g.d = 5;
            this.g.i = bq.f() < 0 ? this.g.i : bq.f();
        } else if (bt.f1do[this.e.ar.g()] == 0) {
            this.g.n = (byte) 0;
            this.g.o = bq.i();
            if (this.g.j()) {
                this.g.a((byte) 1, this.g.p, this.g.n, this.g.o, (byte) 1, 1, (byte) 1, (byte) -1);
                this.g.f = (short) -1;
                this.g.e = 5;
            } else {
                this.g.d = 2;
            }
        }
        this.k = (short) 25;
        this.j = (short) 25;
    }

    private void O(Graphics graphics) {
        if (this.P != null) {
            this.P.a(graphics);
        }
    }

    private void P(int i2) {
        if (this.l == 0) {
            if (this.e.aq != null) {
                this.e.aq.b(i2);
            }
            if (i2 == 8 || i2 == 2) {
                if (this.e.as.a == 0 && this.aV != 0) {
                    bt.gQ = (short) 1;
                    a((byte) 1, bt.gQ);
                    this.aV = this.e.as.a;
                } else if (this.e.as.a == 1) {
                    bt.gQ = (short) 1;
                    c((byte) 1, bt.gQ);
                    this.aV = this.e.as.a;
                } else if (this.e.as.a == 2 && this.aV != 2) {
                    bt.gQ = (short) 1;
                    b((byte) 1, bt.gQ);
                    this.aV = this.e.as.a;
                }
            }
            if (i2 == 1024) {
                if (bt.gQ > 1) {
                    if (this.e.as.a == 0) {
                        a((byte) 1, (short) (bt.gQ - 1));
                    } else if (this.e.as.a == 1) {
                        c((byte) 1, (short) (bt.gQ - 1));
                    } else {
                        b((byte) 1, (short) (bt.gQ - 1));
                    }
                }
            } else if (i2 == 2048) {
                if (bt.gR == 1) {
                    if (this.e.as.a == 0) {
                        a((byte) 1, (short) (bt.gQ + 1));
                    } else if (this.e.as.a == 1) {
                        c((byte) 1, (short) (bt.gQ + 1));
                    } else {
                        b((byte) 1, (short) (bt.gQ + 1));
                    }
                }
            } else if (i2 == 536870912) {
                m();
            }
            if (this.e.as.a == 2 || bt.gs == null) {
                return;
            }
            if (bt.gA != null && bt.gA[this.e.ar.g()] != null && bt.gA[this.e.ar.g()].length > 0) {
                for (byte b2 = 0; b2 < bt.gA[this.e.ar.g()].length; b2 = (byte) (b2 + 1)) {
                    a(bt.gA[this.e.ar.g()]);
                }
            }
            if (i2 == 1 || i2 == 514 || i2 == 520 || i2 == 4) {
                this.e.at.a(bt.a(this.e.l, this.e.ar.g(), this.e.as.a), t.i, (byte) 2);
                this.e.at.a((byte) 1);
                a(bt.gw[this.e.ar.g()], bt.gx[this.e.ar.g()], bt.gy[this.e.ar.g()], bt.gz[this.e.ar.g()]);
                this.aI = a.ah.a(String.valueOf(new StringBuffer().append((int) bt.gw[this.e.ar.g()]).append("_0").toString()), bt.gx[this.e.ar.g()], bt.gy[this.e.ar.g()], bt.gz[this.e.ar.g()]);
            }
            ai.a(this.aI, this.e.ak);
            if (i2 == 268435456 || i2 == 1073741824 || i2 == 517) {
                if (this.e.as.a == 0 && bt.gs != null) {
                    ca.a(t.f + 35, ((this.e.ar.i() + 3) * t.j) + t.g, new String[]{"取消拍卖"}, false);
                    this.l = (short) 1;
                    return;
                } else {
                    if (this.e.as.a != 1 || bt.gs == null) {
                        return;
                    }
                    ca.a(t.f + 35, ((this.e.ar.i() + 3) * t.j) + t.g, new String[]{"拍卖", "取回"}, false);
                    this.l = (short) 2;
                    return;
                }
            }
            return;
        }
        if (this.l == 1) {
            ca.b(i2);
            if (i2 != 1073741824 && i2 != 268435456 && i2 != 517) {
                if (i2 == 536870912) {
                    this.l = (short) 0;
                    return;
                }
                return;
            } else {
                if (ca.o == 0) {
                    this.l = (short) 3;
                    ca.h = 0;
                    return;
                }
                return;
            }
        }
        if (this.l == 2) {
            ca.b(i2);
            if (i2 != 1073741824 && i2 != 268435456 && i2 != 517) {
                if (i2 == 536870912) {
                    this.l = (short) 0;
                    return;
                }
                return;
            } else {
                if (ca.o == 0) {
                    this.l = (short) 4;
                    return;
                }
                if (ca.o == 1) {
                    byte[] bArrN = bz.n((short) 4151, bt.ad, bt.gs[this.e.ar.g()]);
                    if (bArrN == null) {
                        this.e.b("获取上传指令数据错误!");
                        return;
                    } else {
                        a.i.a(new w((short) 4151, bArrN));
                        this.e.a((String) null);
                        return;
                    }
                }
                return;
            }
        }
        if (this.l == 3) {
            if (i2 == 1073741824 || i2 == 268435456 || i2 == 517) {
                a((byte) 1, bt.gs[this.e.ar.g()]);
                return;
            } else {
                if (i2 == 536870912) {
                    this.l = (short) 1;
                    return;
                }
                return;
            }
        }
        if (this.l != 4) {
            if (this.l == 5) {
                if (i2 == 1073741824 || i2 == 268435456 || i2 == 517) {
                    a((byte) 1, bt.gs[this.e.ar.g()], this.bR);
                    return;
                } else {
                    if (i2 == 536870912) {
                        this.l = (short) 2;
                        o();
                        return;
                    }
                    return;
                }
            }
            return;
        }
        d(i2);
        this.bR = n();
        if (i2 != 1073741824 && i2 != 268435456) {
            if (i2 == 536870912) {
                this.l = (short) 2;
                o();
                return;
            }
            return;
        }
        if (n() <= 0) {
            this.e.b("输入金钱必须大于0!");
            return;
        }
        this.l = (short) 5;
        ca.h = 0;
        o();
    }

    private static void P(Graphics graphics) {
        ca.a(graphics, bt.eD, new String[]{"确定", "取消"});
    }

    public static void Q() {
        cL = true;
    }

    private void Q(int i2) {
        if (bt.gs == null) {
            this.e.j = this.e.k;
            N();
            return;
        }
        if (this.l == 0) {
            if (this.e.aq != null) {
                this.e.aq.b(i2);
            }
            if (bt.gA[this.e.ar.g()] != null && bt.gA[this.e.ar.g()].length > 0 && this.e.at.a == 0) {
                for (byte b2 = 0; b2 < bt.gA[this.e.ar.g()].length; b2 = (byte) (b2 + 1)) {
                    a(bt.gA[this.e.ar.g()]);
                }
            }
            if ((i2 == 1 || i2 == 514 || i2 == 520 || i2 == 4) && bt.gs != null && bt.gs.length > 0) {
                this.e.at.a(bt.g(this.e.l, this.e.ar.g()), t.i, (byte) 2);
                this.e.at.a((byte) 1);
                a(bt.gw[this.e.ar.g()], bt.gx[this.e.ar.g()], bt.gy[this.e.ar.g()], bt.gz[this.e.ar.g()]);
                this.aI = a.ah.a(String.valueOf(new StringBuffer().append((int) bt.gw[this.e.ar.g()]).append("_0").toString()), bt.gx[this.e.ar.g()], bt.gy[this.e.ar.g()], bt.gz[this.e.ar.g()]);
            }
            ai.a(this.aI, this.e.ak);
            if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                if (i2 == 536870912) {
                    this.al = null;
                    this.aE = 0;
                    m();
                    return;
                }
                return;
            }
            this.aE = this.e.ar.g();
            this.aA = this.e.ar.h();
            byte[] bArrO = bz.o((short) 4162, bt.ad, bt.gs[this.e.ar.g()]);
            if (bArrO == null) {
                this.e.b("获取上传指令数据错误!");
                return;
            }
            a.i.a(new w((short) 4162, bArrO));
            this.e.a((String) null);
        }
    }

    private static void Q(Graphics graphics) {
        ca.a(graphics, 0, t.c - ca.f, t.b, ca.f, K, bt.eL, (String[]) null);
    }

    public static void R() {
        bt.q = null;
        bt.bs = (short) -1;
        bt.s = (short) -1;
    }

    private void R(int i2) {
        if (this.l == 0) {
            a(bt.dH);
            if (this.e.aq != null) {
                this.e.ar.a(b(bt.dH));
                this.e.aq.b(i2);
            }
            if ((i2 == 1 || i2 == 4 || i2 == 514 || i2 == 520) && bt.dI != null) {
                this.e.ar.a(bt.dI[this.e.ar.g()], 2);
            }
            if ((i2 != 268435456 && i2 != 1073741824 && i2 != 517) || bt.dI == null) {
                if (i2 == 536870912 || bt.dI == null) {
                    m();
                    return;
                }
                return;
            }
            this.aE = this.e.ar.g();
            this.aA = this.e.ar.h();
            byte[] bArrQ = bz.q((short) 4167, bt.ad, bt.dE[this.e.ar.g()]);
            if (bArrQ == null) {
                this.e.b("获取上传指令数据错误!");
                return;
            }
            a.i.a(new w((short) 4167, bArrQ));
            this.e.a((String) null);
        }
    }

    private void R(Graphics graphics) {
        if (this.Q != null) {
            this.Q.a(graphics);
        }
    }

    private short S(int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < this.bM.length; i4++) {
            i3 += this.bM[i4];
        }
        return (short) (bt.fW[i2] - i3 >= 0 ? bt.fW[i2] - i3 : 0);
    }

    private void S(Graphics graphics) {
        this.bc.a(graphics);
    }

    private void T(int i2) {
        int i3;
        if (bt.fA == null || bt.fA.length <= 0) {
            this.e.j = this.e.k;
            N();
            return;
        }
        if ((this.as == 4 || this.as == 10 || this.as == 11) && (bt.fw == null || bt.fw.length <= 0)) {
            return;
        }
        if (this.e.h) {
            this.e.h = false;
            byte[] bArrA = bz.a((short) 4188, bt.ad, bt.fA[this.e.ar.g()], this.e.aC.getString());
            if (bArrA != null) {
                a.i.a(new w((short) 4188, bArrA));
            } else {
                this.e.b("获取上传指令数据错误!");
            }
            this.e.a((String) null);
            this.e.m();
        }
        if (this.l == 0) {
            if (this.e.aq != null) {
                this.e.aq.b(i2);
            }
            int iG = (this.as == 4 || this.as == 10 || this.as == 11) ? bt.fw[this.e.ar.g()] : this.e.ar.g();
            if (bt.gb[iG] != null && bt.gb[iG].length > 0 && this.e.at.a == 0) {
                for (byte b2 = 0; b2 < bt.gb[iG].length; b2 = (byte) (b2 + 1)) {
                    a(bt.gb[iG]);
                }
            }
            if (i2 == 1 || i2 == 514 || i2 == 520 || i2 == 4) {
                this.e.at.a(bt.e(this.e.l, iG), t.i, (byte) 2);
                this.e.at.a((byte) 1);
                a(bt.fE[iG], bt.fF[iG], bt.fG[iG], bt.fH[iG]);
                this.aI = a.ah.a(String.valueOf(new StringBuffer().append((int) bt.fE[iG]).append("_0").toString()), bt.fF[iG], bt.fG[iG], bt.fH[iG]);
            }
            ai.a(this.aI, this.e.ak);
            if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                if (i2 == 536870912 || bt.fA == null) {
                    this.al = null;
                    this.am = null;
                    this.bK = null;
                    if (this.as == 0) {
                        if (this.by == 1) {
                            N();
                            this.by = (byte) 0;
                        } else {
                            at();
                            c(7);
                        }
                        this.aE = 0;
                        return;
                    }
                    if (this.as == 1 || this.as == 6) {
                        m();
                        return;
                    }
                    if (this.as == 2) {
                        this.l = (short) 5;
                        m();
                        return;
                    }
                    if (this.as == 4) {
                        b((byte) 1, true);
                        this.ar = this.aU;
                        this.e.ax = this.aV;
                        return;
                    } else if (this.as == 5) {
                        m();
                        return;
                    } else if (this.as == 10) {
                        e(false);
                        return;
                    } else {
                        if (this.as == 11) {
                            this.W.b();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            this.aA = this.e.ar.h();
            this.aE = this.e.ar.g();
            if (this.as == 0) {
                E();
                this.aE = this.e.ar.g();
            } else if (this.as == 1) {
                ca.a(o + 70, (t.j * 2) + 5 + (this.e.ar.i() * t.j) + p, new String[]{"拍卖"}, false);
            } else if (this.as == 2) {
                ca.a(o + 70, (t.j * 2) + 5 + (this.e.ar.i() * t.j) + p, new String[]{"寄养"}, false);
            } else if (this.as == 4) {
                ca.a(o + 70, (t.j * 2) + 5 + (this.e.ar.i() * t.j) + p, new String[]{"交易"}, false);
            } else if (this.as == 5) {
                ca.a(o + 70, (t.j * 2) + 5 + (this.e.ar.i() * t.j) + p, new String[]{"出售", "取消"}, false);
            }
            this.l = (short) 1;
            if (this.as == 6) {
                this.l = (short) 0;
                byte[] bArrV = bz.v((short) 4191, bt.ad, bt.fA[this.e.ar.g()]);
                if (bArrV == null) {
                    this.e.b("获取上传指令数据错误!");
                    return;
                } else {
                    a.i.a(new w((short) 4191, bArrV));
                    this.e.a((String) null);
                    return;
                }
            }
            if (this.as == 10) {
                this.l = (short) 0;
                c(bt.fA[bt.fw[this.e.ar.g()]], (byte) 0);
                return;
            }
            if (this.as == 11) {
                this.l = (short) 0;
                if (cg.d) {
                    cg.c = iG;
                    byte[] bArrB = bz.b((byte) 1, cg.a, bt.fA[iG], 0);
                    if (bArrB == null) {
                        this.e.b("获取上传指令数据错误!");
                        return;
                    } else {
                        a.i.a(new w((short) 4691, bArrB));
                        this.e.a((String) null);
                        return;
                    }
                }
                cg.b = iG;
                byte[] bArrB2 = bz.b((byte) 0, bt.fA[iG], -1, 0);
                if (bArrB2 == null) {
                    this.e.b("获取上传指令数据错误!");
                    return;
                } else {
                    a.i.a(new w((short) 4691, bArrB2));
                    this.e.a((String) null);
                    return;
                }
            }
            return;
        }
        if (this.l == 1) {
            ca.b(i2);
            if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                if (i2 == 536870912) {
                    this.l = (short) 0;
                    return;
                }
                return;
            }
            if (this.as != 0) {
                if (this.as == 1) {
                    if (bt.fz[this.e.ar.g()] == 1) {
                        this.e.b("出战宠物不能拍卖");
                        return;
                    } else {
                        this.l = (short) 3;
                        o();
                        return;
                    }
                }
                if (this.as == 2) {
                    if (ca.o == 0) {
                        byte[] bArrK = bz.k((short) 4161, bt.ad, bt.fA[this.e.ar.g()]);
                        if (bArrK == null) {
                            this.e.b("获取上传指令数据错误!");
                            return;
                        } else {
                            a.i.a(new w((short) 4161, bArrK));
                            this.e.a((String) null);
                            return;
                        }
                    }
                    return;
                }
                if (this.as == 4) {
                    if (ca.o == 0) {
                        int i4 = bt.fw[this.e.ar.g()];
                        if (bt.fz[i4] != 0) {
                            this.e.b("出战宠物不能交易");
                            return;
                        }
                        a.i.a(new w((short) 4172, bz.i((short) 4172, bt.ad, bt.fA[i4], this.e.ax % 10)));
                        b((byte) 1, true);
                        this.ar = this.aU;
                        this.e.ax = this.aV;
                        this.e.a((String) null);
                        return;
                    }
                    return;
                }
                if (this.as == 5) {
                    if (ca.o != 0) {
                        if (ca.o == 1) {
                            this.l = (short) 0;
                            return;
                        }
                        return;
                    } else {
                        if (bt.fz[this.e.ar.g()] != 0) {
                            this.e.b("出战宠物不能出售");
                            return;
                        }
                        byte[] bArrR = bz.r((short) 4146, bt.ad, bt.fA[this.e.ar.g()]);
                        if (bArrR == null) {
                            this.e.b("获取上传指令数据错误!");
                            return;
                        } else {
                            a.i.a(new w((short) 4146, bArrR));
                            this.e.a((String) null);
                            return;
                        }
                    }
                }
                return;
            }
            if (ca.o == 0) {
                if (bt.bC.size() > 0) {
                    e(1);
                    return;
                } else {
                    this.e.b("背包中没有物品");
                    return;
                }
            }
            if (ca.o == 1) {
                s(this.e.ar.g());
                return;
            }
            if (ca.o == 2) {
                if (bt.bC.size() > 0) {
                    e(3);
                    return;
                } else {
                    this.e.b("背包中没有物品");
                    return;
                }
            }
            if (ca.o == 3) {
                if (!bt.gf[this.e.ar.g()].equals("")) {
                    this.e.b("该宠物已经自带星级了，星级为零的宠物才能做主宠。");
                    return;
                }
                cg.b = this.e.ar.g();
                this.W.a();
                byte[] bArrB3 = bz.b((byte) 0, bt.fA[this.e.ar.g()], -1, 0);
                if (bArrB3 == null) {
                    this.e.b("获取上传指令数据错误!");
                    return;
                } else {
                    a.i.a(new w((short) 4691, bArrB3));
                    this.e.a((String) null);
                    return;
                }
            }
            if (ca.o == 4) {
                if (bt.fz[this.e.ar.g()] == 0) {
                    byte[] bArrH = bz.h((short) 4163, bt.ad, bt.fA[this.e.ar.g()]);
                    if (bArrH == null) {
                        this.e.b("获取上传指令数据错误!");
                        return;
                    } else {
                        a.i.a(new w((short) 4163, bArrH));
                        this.e.a((String) null);
                        return;
                    }
                }
                if (bt.fz[this.e.ar.g()] == 1) {
                    byte[] bArrI = bz.i((short) 4164, bt.ad, bt.fA[this.e.ar.g()]);
                    if (bArrI == null) {
                        this.e.b("获取上传指令数据错误!");
                        return;
                    } else {
                        a.i.a(new w((short) 4164, bArrI));
                        this.e.a((String) null);
                        return;
                    }
                }
                return;
            }
            if (ca.o == 5) {
                W(this.e.ar.g());
                return;
            }
            if (ca.o == 6) {
                this.e.f("宠物名称");
                return;
            }
            if (ca.o == 7) {
                this.aE = this.e.ar.g();
                k(this.e.ar.g());
                return;
            }
            if (ca.o == 8) {
                ca.a(o + 70, (t.j * 2) + 5 + (this.e.ar.i() * t.j) + p, new String[]{"列表", "开灵"}, false);
                this.l = (short) 9;
                return;
            }
            if (ca.o == 9) {
                byte[] bArrZ = bz.z((short) 4613, bt.ad, bt.fA[this.e.ar.g()]);
                if (bArrZ == null) {
                    this.e.b("获取上传指令数据错误!");
                    return;
                } else {
                    a.i.a(new w((short) 4148, bArrZ));
                    this.e.a((String) null);
                    return;
                }
            }
            if (ca.o == 10) {
                byte[] bArrB4 = bz.b(bt.fA[this.e.ar.g()]);
                if (bArrB4 == null) {
                    this.e.b("获取上传指令数据错误!");
                    return;
                } else {
                    a.i.a(new w((short) 4686, bArrB4));
                    this.e.a((String) null);
                    return;
                }
            }
            return;
        }
        if (this.l == 2) {
            ca.b(i2);
            if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                if (i2 == 536870912) {
                    E();
                    this.l = (short) 1;
                    return;
                }
                return;
            }
            if (ca.o != 1) {
                if (ca.o == 0) {
                    E();
                    this.l = (short) 1;
                    return;
                }
                return;
            }
            byte[] bArrG = bz.g((short) 4165, bt.ad, bt.fA[this.e.ar.g()]);
            if (bArrG == null) {
                this.e.b("获取上传指令数据错误!");
                return;
            } else {
                a.i.a(new w((short) 4165, bArrG));
                this.e.a((String) null);
                return;
            }
        }
        if (this.l == 3) {
            if (i2 != 268435456 && i2 != 1073741824) {
                if (i2 != 1073741824) {
                    if (i2 != 536870912) {
                        d(i2);
                        return;
                    }
                    this.e.o();
                    ca.a(o + 70, (t.j * 2) + 5 + (this.e.ar.i() * t.j) + p, new String[]{"拍卖"}, false);
                    this.l = (short) 1;
                    return;
                }
                return;
            }
            if (n() == -1) {
                this.e.b("输入有误,请重新输入");
                return;
            }
            try {
                this.bR = n();
                if (this.bR > 999999999) {
                    this.e.b("价格太高,请重新输入!");
                } else {
                    this.l = (short) 4;
                    ca.h = 0;
                }
                return;
            } catch (Exception e) {
                this.e.b("输入有误,请重新输入");
                return;
            }
        }
        if (this.l == 4) {
            if (i2 != 268435456 && i2 != 1073741824) {
                if (i2 == 536870912) {
                    this.l = (short) 3;
                    o();
                    return;
                }
                return;
            }
            byte[] bArrA2 = bz.a((short) 4148, bt.ad, bt.fA[this.e.ar.g()], 1, this.bR);
            if (bArrA2 == null) {
                this.e.b("获取上传指令数据错误!");
                return;
            } else {
                a.i.a(new w((short) 4148, bArrA2));
                this.e.a((String) null);
                return;
            }
        }
        if (this.l == 7) {
            a(bt.jK);
            ai.a(this.aI, this.e.ak);
            if (i2 == 8 || i2 == 516) {
                this.aq = this.aq + (-1) < 0 ? 5 : this.aq - 1;
                ca.l = 0;
                return;
            }
            if (i2 == 2 || i2 == 518) {
                this.aq = this.aq + 1 > 5 ? 0 : this.aq + 1;
                ca.l = 0;
                return;
            }
            if (i2 == 536870912) {
                c(0, this.aE, this.aA);
                E();
                ca.o = 9;
                this.l = (short) 1;
                return;
            }
            if (i2 == 268435456 || i2 == 517 || i2 == 1073741824) {
                this.cj = (byte) this.aq;
                if (U(this.aq) < 0) {
                    e(9);
                    return;
                } else {
                    ca.a(((t.b - t.i.stringWidth("操作")) - 20) / 2, (t.c - ((t.j + 3) * 6)) / 2, new String[]{"查看", "更换", "卸下", "升星", "洗炼", "附魔"}, true);
                    this.l = (short) 8;
                    return;
                }
            }
            return;
        }
        if (this.l != 8) {
            if (this.l != 9) {
                if (this.l == 10) {
                    if (this.e.aq != null) {
                        this.e.aq.b(i2);
                    }
                    if (i2 == 536870912) {
                        this.l = (short) 8;
                        return;
                    }
                    return;
                }
                if (this.l == 11) {
                    if (i2 != 268435456) {
                        if (i2 == 536870912) {
                            this.l = (short) 0;
                            return;
                        }
                        return;
                    } else {
                        byte[] bArrA3 = bz.a(bt.fA[this.e.ar.g()]);
                        if (bArrA3 == null) {
                            this.e.b("获取上传指令数据错误!");
                            return;
                        } else {
                            a.i.a(new w((short) 4682, bArrA3));
                            this.e.a((String) null);
                            return;
                        }
                    }
                }
                return;
            }
            ca.b(i2);
            if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                if (i2 == 536870912) {
                    E();
                    ca.o = 8;
                    this.l = (short) 1;
                    return;
                }
                return;
            }
            if (ca.o != 0) {
                if (ca.o == 1) {
                    this.cj = (byte) this.aq;
                    e(14);
                    return;
                }
                return;
            }
            this.ay = this.e.ar.g();
            if (bt.fz[this.e.ar.g()] == 0) {
                a.i.a(new w((short) 4189, bz.u((short) 4189, bt.ad, bt.fA[this.e.ar.g()])));
                this.e.a((String) null);
                return;
            } else if (bt.cR == null || bt.cR.length <= 0) {
                this.e.b("宠物没有技能!");
                return;
            } else {
                a(false, false);
                return;
            }
        }
        ca.b(i2);
        if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
            if (i2 == 536870912) {
                c(false);
                return;
            }
            return;
        }
        if (ca.o == 0) {
            bt.b((int) l(this.aq));
            this.O.a(0, this.k, this.as);
            return;
        }
        if (ca.o == 1) {
            e(9);
            return;
        }
        if (ca.o == 2) {
            byte bL = l(this.aq);
            if (bL < 0 || bL > 6) {
                this.e.b("卸下失败");
                return;
            }
            byte[] bArrD = bz.d((short) 4615, bt.ad, bt.jG, bL);
            if (bArrD == null) {
                this.e.b("获取上传指令数据错误!");
                return;
            } else {
                a.i.a(new w((short) 4614, bArrD));
                this.e.a((String) null);
                return;
            }
        }
        if (ca.o == 3) {
            this.aJ = true;
            ch.a();
            int i5 = 0;
            while (true) {
                if (i5 >= bt.jH.length) {
                    i3 = -1;
                    break;
                } else {
                    if (n(bt.jJ[i5]) == this.aq) {
                        i3 = bt.jH[i5];
                        break;
                    }
                    i5++;
                }
            }
            byte[] bArrA4 = bz.a((short) 4689, i3, (byte) 0, (byte) -1, bt.ad);
            if (bArrA4 == null) {
                this.e.b("获取上传指令数据错误!");
                return;
            } else {
                a.i.a(new w((short) 4689, bArrA4));
                this.e.a((String) null);
                return;
            }
        }
        if (ca.o == 4) {
            this.aJ = true;
            this.O.d();
            int i6 = -1;
            int i7 = 0;
            while (true) {
                if (i7 >= bt.jH.length) {
                    break;
                }
                if (n(bt.jJ[i7]) == this.aq) {
                    i6 = bt.jH[i7];
                    break;
                }
                i7++;
            }
            o.h = (byte) 2;
            byte[] bArrA5 = bz.a((short) 4688, i6, -1L, (byte) 0, o.h, bt.jG, (byte[]) null, bt.ad);
            if (bArrA5 == null) {
                this.e.b("获取上传指令数据错误!");
                return;
            } else {
                a.i.a(new w((short) 4688, bArrA5));
                this.e.a((String) null);
                return;
            }
        }
        if (ca.o == 5) {
            if (this.P == null) {
                this.P = new r(this, this.e, a.f);
            }
            this.P.b();
            this.aJ = true;
            int i8 = -1;
            int i9 = 0;
            while (true) {
                if (i9 >= bt.jH.length) {
                    break;
                }
                if (n(bt.jJ[i9]) == this.aq) {
                    i8 = bt.jH[i9];
                    break;
                }
                i9++;
            }
            byte[] bArrA6 = bz.a((short) 4262, i8, -1L, (byte) 0, (int[]) null, (byte[]) null, -1, (byte) 0, bt.ad);
            if (bArrA6 == null) {
                this.e.b("获取上传指令数据错误!");
            } else {
                a.i.a(new w((short) 4262, bArrA6));
                this.e.a((String) null);
            }
        }
    }

    private void T(Graphics graphics) {
        this.e.aq.a(graphics);
        if (this.l == 1) {
            ca.c(graphics);
        }
    }

    private byte U(int i2) {
        if (bt.jJ == null) {
            return (byte) -1;
        }
        for (byte b2 = 0; b2 < bt.jJ.length; b2 = (byte) (b2 + 1)) {
            if (n(bt.jJ[b2]) == i2) {
                return b2;
            }
        }
        return (byte) -1;
    }

    private void U(Graphics graphics) {
        this.e.aq.a(graphics);
        this.di.a(graphics);
        this.dj.a(graphics);
        if (this.dk == null || this.dk.length <= 0) {
            return;
        }
        graphics.setColor(2176196);
        int i2 = this.e.aq.b + 45 + 15;
        int i3 = this.e.aq.a + ((this.e.aq.c * 3) / 4);
        int iJ = this.e.aq.b + 45 + this.dk[0].j();
        if (this.dl == 2) {
            iJ += 30;
        }
        a.f.a(graphics, this.dk[this.dl], (int[]) null, 0, 0, i3, iJ, 20, 0);
        if (this.dm == 0) {
            this.dm = i3;
            this.dn = t.j + 10 + i2;
        }
        graphics.drawImage(a.X.a, this.dm - 30, this.dn, 20);
        graphics.drawImage(a.Y.a, this.dm + 20, this.dn, 20);
    }

    private void V(int i2) {
        byte bL = l((int) this.cj);
        if (bL < 0 || bL > 6) {
            this.e.b("装备失败");
            return;
        }
        byte[] bArrB = bz.b((short) 4614, bt.ad, bt.jG, i2, bL);
        if (bArrB == null) {
            this.e.b("获取上传指令数据错误!");
            return;
        }
        a.i.a(new w((short) 4614, bArrB));
        this.e.a((String) null);
    }

    private void V(Graphics graphics) {
        this.e.aq.a(graphics);
        ca.a(graphics, this.ds, this.dt, this.e.at.d, this.e.at.e >> 1, 1);
        graphics.setColor(255);
        graphics.drawString("可开出的珍贵物品", this.ds + 32, this.dt + 8, 0);
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= 4) {
                break;
            }
            a.f.a(graphics, x, (int[]) null, (aj) null, 0, 0, (i3 * 40) + ((this.ds + (this.e.at.d / 2)) - 76), (this.dt + (this.e.at.e >> 1)) - 24, 0, 0);
            if (i3 < bt.ng.length) {
                if (!bt.ne[i3].equals("MONEY")) {
                    short s2 = (short) Integer.parseInt(bt.ng[i3]);
                    a.af.e(bt.ng[i3]);
                    a.f.a(graphics, b(s2), (int[]) null, (aj) null, 0, 0, (i3 * 40) + ((this.ds + (this.e.at.d / 2)) - 76), (this.dt + (this.e.at.e >> 1)) - 24, 0, 0);
                }
                if (i3 == this.aq) {
                    ca.d(graphics, ((this.ds + (this.e.at.d / 2)) - 76) + (i3 * 40), (this.dt + (this.e.at.e >> 1)) - 24, 17, 17);
                }
            }
            i2 = i3 + 1;
        }
        ca.a(graphics, this.ds, (this.e.at.e >> 1) + this.dt, this.e.at.d, this.e.at.e >> 1, 1);
        graphics.setColor(2917024);
        graphics.fillRect(((this.ds - 70) + (this.e.at.d >> 1)) - 20, ((this.dt + (this.e.at.e >> 1)) + (this.e.at.e >> 2)) - 20, 40, 40);
        graphics.setColor(9360850);
        graphics.drawRect(((this.ds - 70) + (this.e.at.d >> 1)) - 20, ((this.dt + (this.e.at.e >> 1)) + (this.e.at.e >> 2)) - 20, 39, 39);
        if (bt.nl != null) {
            a.af.e(bt.nl);
            a.f.a(graphics, b((short) Integer.parseInt(bt.nl)), (int[]) null, (aj) null, 0, 0, ((this.ds - 70) + (this.e.at.d >> 1)) - 8, ((this.dt + (this.e.at.e >> 1)) + (this.e.at.e >> 2)) - 8, 0, 0);
        }
        this.dv.a(graphics, ((this.ds + 40) + (this.e.at.d >> 1)) - 40, ((this.dt + (this.e.at.e >> 1)) + (this.e.at.e >> 2)) - 20, 0);
        if (!this.du) {
            return;
        }
        int i4 = 0;
        while (true) {
            int i5 = i4;
            if (i5 >= 4) {
                return;
            }
            if (i5 == this.aq) {
                String str = bt.nf[i5];
                if (bt.ne[i5].equals("MONEY")) {
                    str = "金钱";
                }
                ca.a(graphics, bt.ne[i5], str, (i5 * 40) + ((this.ds + (this.e.at.d / 2)) - 76), (this.dt + (this.e.at.e >> 1)) - 24, 40);
            }
            i4 = i5 + 1;
        }
    }

    private void W(int i2) {
        t.a(this.e.l);
        this.e.l.append(new StringBuffer().append("名称：").append(bt.fB[i2]).append('\t').toString());
        this.e.l.append("星级:").append(bt.gf[i2]).append('\t');
        this.e.l.append(new StringBuffer().append("种类：").append(bt.fC[i2]).append('\t').toString());
        this.e.l.append(new StringBuffer().append("级别：").append((int) bt.fD[i2]).append('\t').toString());
        this.e.l.append(new StringBuffer().append("经验：").append(bt.fY[i2] - bt.ga[i2]).append('/').append(bt.fZ[i2] - bt.ga[i2]).append('\t').toString());
        this.e.l.append(new StringBuffer().append("生命：").append(bt.fI[i2]).append('/').append(bt.fJ[i2]).append('\t').toString());
        this.e.l.append(new StringBuffer().append("内力：").append(bt.fK[i2]).append('/').append(bt.fL[i2]).append('\t').toString());
        this.e.l.append(new StringBuffer().append("物攻：").append(bt.fM[i2]).append('/').append(bt.fN[i2]).append('\t').toString());
        this.e.l.append(new StringBuffer().append("法攻：").append(bt.fO[i2]).append('/').append(bt.fP[i2]).append('\t').toString());
        this.e.l.append(new StringBuffer().append("防御：").append(bt.fQ[i2]).append('/').append(bt.fR[i2]).append('\t').toString());
        this.e.l.append(new StringBuffer().append("速度：").append(bt.fS[i2]).append('\t').toString());
        this.e.l.append(new StringBuffer().append("冰抗：").append(bt.fT[i2]).append('\t').toString());
        this.e.l.append(new StringBuffer().append("火抗：").append(bt.fU[i2]).append('\t').toString());
        this.e.l.append(new StringBuffer().append("雷抗：").append(bt.fV[i2]).append('\t').toString());
        this.e.l.append(bt.fX[i2]);
        if (bt.gc != null && bt.gc[i2] != null && bt.gc[i2].length > 0) {
            byte b2 = 0;
            while (b2 < bt.gc[i2].length) {
                this.e.l.append(new StringBuffer().append(b2 == 0 ? "技能：" : "，").append(bt.gc[i2][b2]).toString());
                if (b2 == bt.gc[i2].length - 1) {
                    this.e.l.append("\t");
                }
                b2 = (byte) (b2 + 1);
            }
        }
        if (bt.gh[i2] != null) {
            this.e.l.append("技能附魂:");
            for (int i3 = 0; i3 < bt.gh[i2].length; i3++) {
                if (bt.gh[i2][i3] != null) {
                    this.e.l.append(bt.gh[i2][i3]);
                    this.e.l.append(",");
                }
            }
            this.e.l.append('\t');
        }
        if (bt.gl[i2] != null) {
            this.e.l.append("状态附魂:");
            for (int i4 = 0; i4 < bt.gl[i2].length; i4++) {
                if (bt.gl[i2][i4] != null) {
                    this.e.l.append(bt.gl[i2][i4]);
                    this.e.l.append(",");
                }
            }
            this.e.l.append('\t');
        }
        this.e.aq.j();
        this.e.aq.a("宠物属性");
        this.e.aq.a(true);
        this.e.at.a(this.e.l.toString(), t.i, (byte) 2);
        this.e.aq.a(this.e.at);
        this.e.aq.a(t.f, t.g, t.d, t.e);
        this.k = (short) 95;
        this.j = (short) 95;
    }

    private void W(Graphics graphics) {
        this.e.aq.a(graphics);
        if (this.l == 1) {
            ca.c(graphics);
        }
    }

    private void X(int i2) {
        if (this.e.aq != null) {
            this.e.aq.b(i2);
        }
        if (i2 == 268435456 || i2 == 536870912) {
            c(0, this.aE, this.aA);
            ca.o = 5;
            this.l = (short) 1;
        }
    }

    private static String Y(int i2) {
        StringBuffer stringBuffer = new StringBuffer();
        if (bt.cc[i2] > 0 || bt.cd[i2] > 0) {
            stringBuffer.append("攻击:");
            stringBuffer.append((int) bt.cc[i2]);
            stringBuffer.append('-');
            stringBuffer.append((int) bt.cd[i2]);
            stringBuffer.append('\t');
        }
        if (bt.ce[i2] > 0 || bt.cf[i2] > 0) {
            stringBuffer.append("法攻:");
            stringBuffer.append((int) bt.ce[i2]);
            stringBuffer.append('-');
            stringBuffer.append((int) bt.cf[i2]);
            stringBuffer.append('\t');
        }
        if (bt.cg[i2] > 0 || bt.ch[i2] > 0) {
            stringBuffer.append("防御:");
            stringBuffer.append((int) bt.cg[i2]);
            stringBuffer.append('-');
            stringBuffer.append((int) bt.ch[i2]);
            stringBuffer.append('\t');
        }
        if (bt.ci[i2] > 0 && bt.ci[i2] == bt.cj[i2] && bt.cj[i2] == bt.ck[i2]) {
            stringBuffer.append("冰火雷抗:");
            stringBuffer.append((int) bt.ci[i2]);
            stringBuffer.append('\t');
        } else {
            if (bt.ci[i2] > 0) {
                stringBuffer.append("冰抗:");
                stringBuffer.append((int) bt.ci[i2]);
                if (bt.cj[i2] > 0 || bt.ck[i2] > 0) {
                    stringBuffer.append(' ');
                } else {
                    stringBuffer.append('\t');
                }
            }
            if (bt.cj[i2] > 0) {
                stringBuffer.append("火抗:");
                stringBuffer.append((int) bt.cj[i2]);
                if (bt.ck[i2] <= 0) {
                    stringBuffer.append('\t');
                } else {
                    stringBuffer.append(' ');
                }
            }
            if (bt.ck[i2] > 0) {
                stringBuffer.append("雷抗:");
                stringBuffer.append((int) bt.ck[i2]);
                stringBuffer.append('\t');
            }
        }
        if (bt.cn[i2] > 0) {
            stringBuffer.append("速度:");
            stringBuffer.append((int) bt.cn[i2]);
            stringBuffer.append('\t');
        }
        if (bt.cl[i2] > 0) {
            stringBuffer.append("增加HP:");
            stringBuffer.append((int) bt.cl[i2]);
            stringBuffer.append('\t');
        }
        if (bt.cm[i2] > 0) {
            stringBuffer.append("增加MP:");
            stringBuffer.append((int) bt.cm[i2]);
            stringBuffer.append('\t');
        }
        if (bt.co[i2] > 0) {
            stringBuffer.append("等级:");
            stringBuffer.append((int) bt.co[i2]);
            stringBuffer.append('\t');
        }
        if (bt.cq[i2] != null) {
            stringBuffer.append(bt.cq[i2]);
            stringBuffer.append('\t');
        }
        return stringBuffer.toString();
    }

    private void Z(int i2) {
        byte[] bArrA = bz.a((short) 4138, bt.ad, bt.bW ? bt.bX : bt.t[this.af].a, bt.bY[(this.ar << 3) + this.aq], (byte) i2);
        if (bArrA == null) {
            this.e.b("获取上传指令数据错误!");
        } else {
            a.i.a(new w((short) 4138, bArrA));
            this.e.a((String) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0313 A[PHI: r2
      0x0313: PHI (r2v49 boolean) = (r2v48 boolean), (r2v48 boolean), (r2v48 boolean), (r2v55 boolean) binds: [B:34:0x00a0, B:35:0x00a2, B:37:0x00a8, B:44:0x00be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v100, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private byte a(defpackage.bv r11) {
        /*
            Method dump skipped, instructions count: 796
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ao.a(bv):byte");
    }

    private String a(int i2, boolean z2) {
        for (int i3 = 0; i3 < bt.cG.length; i3++) {
            if (bt.cI[i3] == i2) {
                StringBuffer stringBuffer = new StringBuffer();
                if (z2) {
                    stringBuffer.append(bt.cH[i3]);
                    stringBuffer.append("（");
                    t.a(this.e.l, bt.cO[i3]);
                    stringBuffer.append(new StringBuffer().append(this.e.l.toString()).append("）").toString());
                    stringBuffer.append('\t');
                }
                if (bt.cK != null && bt.cK.length > 0) {
                    stringBuffer.append(bt.cK[i3]);
                    stringBuffer.append('\t');
                }
                if (bt.cL != null && bt.cL.length > 0) {
                    stringBuffer.append(bt.cL[i3]);
                    stringBuffer.append('\t');
                }
                if (bt.cM != null && bt.cM.length > 0) {
                    stringBuffer.append(bt.cM[i3]);
                    stringBuffer.append('\t');
                }
                if (bt.cN[i3] > 0) {
                    stringBuffer.append("等级:");
                    stringBuffer.append((int) bt.cN[i3]);
                    stringBuffer.append('\t');
                }
                if (z2 && bt.cP[i3] != null) {
                    stringBuffer.append(bt.cP[i3]);
                    stringBuffer.append('\t');
                }
                return stringBuffer.toString();
            }
        }
        return null;
    }

    private static String a(bn bnVar) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(bnVar.b);
        stringBuffer.append('\t');
        if (bnVar.j != null && bnVar.j.length() > 0) {
            stringBuffer.append(bnVar.j);
            stringBuffer.append('\t');
        }
        if (bnVar.k != null && bnVar.k.length() > 0) {
            stringBuffer.append(bnVar.k);
            stringBuffer.append('\t');
        }
        if (bnVar.l != null && bnVar.l.length() > 0) {
            stringBuffer.append(bnVar.l);
            stringBuffer.append('\t');
        }
        if (bnVar.p > 0) {
            stringBuffer.append("等级:");
            stringBuffer.append((int) bnVar.p);
            stringBuffer.append('\t');
        }
        if (bnVar.e > 0) {
            stringBuffer.append("状态:");
            stringBuffer.append(bnVar.e == 1 ? "已绑定" : "装备绑定");
            stringBuffer.append('\t');
        }
        if (bnVar.s != null) {
            stringBuffer.append(bnVar.s);
            stringBuffer.append('\t');
        }
        return stringBuffer.toString();
    }

    public static String a(StringBuffer stringBuffer, long j) {
        stringBuffer.delete(0, stringBuffer.capacity());
        stringBuffer.append(bt.a(j));
        if (stringBuffer.length() > 5) {
            stringBuffer.delete(5, stringBuffer.length());
            stringBuffer.append("..");
        }
        return stringBuffer.toString();
    }

    private static Vector a(short[] sArr, byte[] bArr) {
        if (sArr == null) {
            return null;
        }
        Vector vector = new Vector();
        for (int i2 = 0; i2 < sArr.length; i2++) {
            if (bArr[i2] == 1) {
                vector.addElement(new Short(sArr[i2]));
            }
        }
        return vector;
    }

    private void a(byte b2, byte b3, byte b4, byte b5) {
        if (bt.bs == 0) {
            this.e.b("队员不能发随机送组队邀请");
            return;
        }
        if (bt.bs == 1 && bt.q != null && bt.q.length >= 3) {
            this.e.b("队伍已满，无法邀请");
            return;
        }
        if (bt.G()) {
            this.e.b("住宅区域中，无法邀请");
            return;
        }
        byte[] bArrA = bz.a((short) 4259, b2, b3, b4, b5, bt.ad);
        if (bArrA == null) {
            this.e.b("获取上传指令数据错误!");
            return;
        }
        a.i.a(new w((short) 4659, bArrA));
        this.e.a((String) null);
    }

    public static void a(byte b2, byte b3, byte b4, String str, short s2, short s3, short s4) {
        bk.removeAllElements();
        bk.addElement(a.a(b2, b3, (byte) 1, b4, false, str));
        bk.addElement(a.a(b2, b3, (byte) 3, b4, false, str));
        bk.addElement(a.a(b2, b3, (byte) 3, b4, true, str));
        bk.addElement(a.a(b2, b3, (byte) 0, b4, false, str));
        bk.addElement(a.a(b2, b3, (byte) 0, b4, true, str));
        bk.addElement(a.a(b2, b3, (byte) 2, b4, false, str));
        bk.addElement(a.a(b2, b3, (byte) 2, b4, true, str));
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bk.size()) {
                bk.removeAllElements();
                return;
            } else {
                a.ab.b((String) bk.elementAt(i3), s2, s3, s4);
                i2 = i3 + 1;
            }
        }
    }

    private void a(byte b2, byte b3, short s2) {
        byte[] bArrA = bz.a(b2, b3, (short) 0);
        if (bArrA == null) {
            this.e.b("获取上传指令数据错误!");
            return;
        }
        a.i.a(new w((short) 4685, bArrA));
        this.e.a("");
    }

    private void a(byte b2, int i2) {
        byte[] bArrE = bz.e((short) 4633, bt.ad, i2, b2);
        if (bArrE == null) {
            this.e.b("获取上传指令数据错误!");
            return;
        }
        a.i.a(new w((short) 4633, bArrE));
        this.e.a((String) null);
    }

    private void a(byte b2, int i2, byte b3) {
        byte[] bArrA = bz.a((short) 4363, bt.ad, b2, i2, b3);
        if (bArrA == null) {
            this.e.b("获取上传指令数据错误!");
        } else {
            a.i.a(new w((short) 4363, bArrA));
            this.e.a((String) null);
        }
    }

    private void a(byte b2, int i2, int i3) {
        if (L.j == null || L.j.length <= i3) {
            this.e.b("获取上传指令数据错误!");
            return;
        }
        byte[] bArrA = bz.a((short) 4364, bt.ad, b2, i2, L.j[i3]);
        if (bArrA == null) {
            this.e.b("获取上传指令数据错误!");
        } else {
            a.i.a(new w((short) 4364, bArrA));
            this.e.a((String) null);
        }
    }

    private void a(byte b2, int i2, int i3, byte b3, byte b4) {
        byte[] bArrA = bz.a(b2, i2, i3, b3, b4);
        if (bArrA == null) {
            this.e.b("获取上传指令数据错误!");
            return;
        }
        a.i.a(new w((short) 4684, bArrA));
        this.e.a((String) null);
    }

    private void a(byte b2, int i2, long j) {
        byte[] bArrA = bz.a((short) 4640, bt.ad, i2, b2, j);
        if (bArrA == null) {
            this.e.b("获取上传指令数据错误!");
            return;
        }
        a.i.a(new w((short) 4640, bArrA));
        this.e.a((String) null);
    }

    private void a(byte b2, int i2, String str) {
        byte[] bArrA = bz.a((short) 4356, bt.ad, (byte) 1, i2, str, this.I.j, this.I.k);
        if (bArrA == null) {
            this.e.b("获取上传指令数据错误!");
        } else {
            a.i.a(new w((short) 4356, bArrA));
            this.e.a((String) null);
        }
    }

    private void a(byte b2, bv bvVar) {
        byte[] bArrA = bz.a((short) 4360, bt.ad, b2, bvVar);
        if (bArrA == null) {
            this.e.b("获取上传指令数据错误!");
        } else {
            a.i.a(new w((short) 4360, bArrA));
        }
    }

    private void a(byte b2, String str, byte b3) {
        byte[] bArrA = bz.a((short) 4882, b2, str, b3, bt.ad);
        if (bArrA == null) {
            this.e.b("获取上传指令数据错误!");
        } else {
            a.i.a(new w((short) 4882, bArrA));
            this.e.a((String) null);
        }
    }

    private void a(byte b2, String str, int i2) {
        byte[] bArrA = bz.a(b2, str, i2);
        if (bArrA == null) {
            this.e.b("获取上传指令数据错误!");
            return;
        }
        a.i.a(new w((short) 4374, bArrA));
        this.e.a((String) null);
    }

    private void a(byte b2, short s2) {
        byte[] bArrA = bz.a((short) 4631, bt.ad, b2, s2);
        if (bArrA == null) {
            this.e.b("获取上传指令数据错误!");
            return;
        }
        a.i.a(new w((short) 4631, bArrA));
        this.e.a((String) null);
    }

    private void a(byte b2, short s2, int i2, short s3, String str) {
        byte[] bArrA = bz.a((short) 4253, bt.ad, b2, i2, s2, s3, str);
        if (bArrA == null) {
            this.e.b("获取上传指令数据错误!");
        } else {
            a.i.a(new w((short) 4253, bArrA));
        }
    }

    private void a(int i2, byte b2) {
        switch (i2) {
            case 0:
                this.bL[i2][0] = this.bL[i2][0] + (b2 * 20);
                if (this.bL[i2][1] != -1) {
                    this.bL[i2][1] = this.bL[i2][1] + (b2 * 20);
                    break;
                }
                break;
            case 1:
                this.bL[i2][0] = this.bL[i2][0] + (b2 * 5);
                if (this.bL[i2][1] != -1) {
                    this.bL[i2][1] = this.bL[i2][1] + (b2 * 5);
                    break;
                }
                break;
            case 2:
                this.bL[i2][0] = (this.bL[i2][0] - (((this.bM[i2] - b2) * 1250) / 1000)) + ((this.bM[i2] * 1250) / 1000);
                if (this.bL[i2][1] != -1) {
                    this.bL[i2][1] = (this.bL[i2][1] - (((this.bM[i2] - b2) * 1250) / 1000)) + ((this.bM[i2] * 1250) / 1000);
                    break;
                }
                break;
            case 3:
                this.bL[i2][0] = (this.bL[i2][0] - (((this.bM[i2] - b2) * 400) / 1000)) + ((this.bM[i2] * 400) / 1000);
                if (this.bL[i2][1] != -1) {
                    this.bL[i2][1] = (this.bL[i2][1] - (((this.bM[i2] - b2) * 400) / 1000)) + ((this.bM[i2] * 400) / 1000);
                    break;
                }
                break;
            case 4:
                this.bL[i2][0] = (this.bL[i2][0] - (((this.bM[i2] - b2) * 625) / 1000)) + ((this.bM[i2] * 625) / 1000);
                if (this.bL[i2][1] != -1) {
                    this.bL[i2][1] = (this.bL[i2][1] - (((this.bM[i2] - b2) * 625) / 1000)) + ((this.bM[i2] * 625) / 1000);
                    break;
                }
                break;
            case 5:
                this.bL[i2][0] = (this.bL[i2][0] - (((this.bM[i2] - b2) * 1040) / 1000)) + ((this.bM[i2] * 1040) / 1000);
                if (this.bL[i2][1] != -1) {
                    this.bL[i2][1] = (this.bL[i2][1] - (((this.bM[i2] - b2) * 1040) / 1000)) + ((this.bM[i2] * 1040) / 1000);
                    break;
                }
                break;
            default:
                this.bL[i2][0] = (this.bL[i2][0] - (((this.bM[i2] - b2) * 1875) / 1000)) + ((this.bM[i2] * 1875) / 1000);
                if (this.bL[i2][1] != -1) {
                    this.bL[i2][1] = (this.bL[i2][1] - (((this.bM[i2] - b2) * 1875) / 1000)) + ((this.bM[i2] * 1875) / 1000);
                    break;
                }
                break;
        }
        this.bO[i2] = new StringBuffer().append(this.bL[i2][0]).append(this.bL[i2][1] != -1 ? new StringBuffer().append("/").append(this.bL[i2][1]).toString() : "").toString();
        int iH = this.e.ar.h();
        this.e.ar.a((Image[]) null, this.bN, (String[]) null, this.bO);
        this.e.ar.a(iH, i2);
    }

    private void a(int i2, int i3, int i4, int i5) {
        if (this.bW != null) {
            this.bW[0] = i2;
            this.bW[1] = i3;
            this.bW[2] = i4;
            this.bW[3] = i5;
        }
    }

    private void a(ce ceVar) {
        String[] strArrA;
        if (this.k != 18) {
            if (aW[5] != 1 || ceVar.b == 5) {
                if (aW[7] == 1 && ceVar.b == 0) {
                    return;
                }
                if (aW[8] == 1 && ceVar.b == 1) {
                    return;
                }
                if (aW[17] == 1 && ceVar.b == 3) {
                    return;
                }
                if ((aW[7] == 1 && ceVar.b == 6) || (strArrA = ca.a(new StringBuffer().append("[").append(ceVar.d).append("]").append(ceVar.e).toString(), t.i, t.b - 5)) == null || strArrA.length <= 0) {
                    return;
                }
                u((byte) strArrA.length);
                for (String str : strArrA) {
                    this.cD.insertElementAt(new b(str, ca.n[ceVar.a]), this.cD.size());
                }
            }
        }
    }

    private void a(String str, String str2, short s2) {
        this.e.aq.j();
        this.e.aq.a(str);
        this.e.aq.a(false);
        this.e.at.a(str2, t.i, (byte) 2);
        this.e.au.a(new String[]{"开 通", "取 消"});
        this.e.aq.a(this.e.at);
        this.e.aq.a(this.e.au);
        this.e.aq.a(t.f, t.g, t.d, t.e);
        this.l = (short) 0;
        this.e.j = this.e.k;
        this.k = s2;
        this.j = s2;
    }

    private void a(String str, String str2, short s2, short s3) {
        byte[] bArrA = bz.a((short) 5121, str, str2, (byte) 1, s3, s2);
        bt.lo = str;
        if (bArrA == null) {
            this.e.b("获取上传指令数据错误!");
        } else {
            a.i.a(new w((short) 5121, bArrA));
            this.e.a((String) null);
        }
    }

    private void a(String str, short s2, short s3) {
        byte[] bArrA = bz.a((short) 5122, str, bt.la[this.e.ar.g()], s3, s2);
        if (bArrA == null) {
            this.e.b("获取上传指令数据错误!");
        } else {
            a.i.a(new w((short) 5122, bArrA));
            this.e.a((String) null);
        }
    }

    private void a(Graphics graphics, int i2) {
        if (this.e.aq != null) {
            this.e.aq.a(graphics);
        }
        graphics.drawImage(a.L.a, this.e.aq.a + 5, (this.e.aq.b + this.e.aq.d) - 53, 20);
        graphics.drawImage(a.L.a, ((this.e.aq.a + this.e.aq.c) - 5) - a.L.b, (this.e.aq.b + this.e.aq.d) - 53, 20);
        int iMax = Math.max(this.e.aq.c - (a.L.b << 1), t.i.stringWidth(String.valueOf((int) (i2 == 0 ? aC() : S(this.aE)))));
        int i3 = this.e.aq.a + ((this.e.aq.c - iMax) / 2);
        graphics.setColor(79948);
        graphics.fillRect(i3, (this.e.aq.b + this.e.aq.d) - 53, iMax, a.L.c);
        if (i2 == 0) {
            graphics.setColor(aC() < bt.bf ? 16776960 : 16777215);
        } else {
            graphics.setColor(S(this.aE) < bt.fW[this.aE] ? 16776960 : 16777215);
        }
        graphics.fillRect(i3 - 15, (this.e.aq.b + this.e.aq.d) - 42, 10, 2);
        b(0, i3 - a.N.b, (this.e.aq.b + this.e.aq.d) - 51, a.N.b, a.N.c);
        graphics.drawImage(a.N.a, this.bP[0][0], this.bP[0][1], 20);
        if (i2 == 0) {
            graphics.setColor(aC() > 0 ? 16776960 : 16777215);
        } else {
            graphics.setColor(S(this.aE) > 0 ? 16776960 : 16777215);
        }
        graphics.fillRect(i3 + iMax + 5, (this.e.aq.b + this.e.aq.d) - 46, 10, 10);
        b(1, i3 + iMax, (this.e.aq.b + this.e.aq.d) - 51, a.M.b, a.M.c);
        graphics.drawImage(a.M.a, this.bP[1][0], this.bP[1][1], 20);
        graphics.setColor(16776960);
        graphics.drawString(String.valueOf((int) (i2 == 0 ? aC() : S(this.aE))), t.b >> 1, ((this.e.aq.b + this.e.aq.d) - 51) + ((a.M.a.getHeight() - t.j) / 2), 17);
    }

    private void a(Graphics graphics, int i2, int i3, int i4, byte b2) {
        int i5;
        a.f.a(graphics, a.L, (int[]) null, (aj) null, 0, 0, i2, i3, 0, 0);
        a.f.a(graphics, a.L, (int[]) null, (aj) null, 0, 0, (i2 + i4) - a.L.b, i3, 0, 0);
        graphics.setColor(79948);
        if (b2 == 0 && bt.fn > 0 && t.i.stringWidth(t.a(this.e.l, bt.fn)) > i4 - (a.L.b << 1)) {
            int iStringWidth = t.i.stringWidth(t.a(this.e.l, bt.fn));
            graphics.fillRect(((i4 - iStringWidth) / 2) + i2, i3, iStringWidth, a.L.c);
            i5 = iStringWidth;
        } else if (b2 != 1 || bt.fg <= 0 || t.i.stringWidth(t.a(this.e.l, bt.fg)) <= i4 - (a.L.b << 1)) {
            int i6 = i4 - (a.L.b << 1);
            graphics.fillRect(a.L.b + i2, i3, i4 - (a.L.b << 1), a.L.c);
            i5 = i6;
        } else {
            int iStringWidth2 = t.i.stringWidth(t.a(this.e.l, bt.fg));
            graphics.fillRect(((i4 - iStringWidth2) / 2) + i2, i3, iStringWidth2, a.L.c);
            i5 = iStringWidth2;
        }
        graphics.setColor(16776917);
        if (b2 == 0 && bt.fn > 0) {
            graphics.drawString(t.a(this.e.l, bt.fn), (i4 / 2) + i2 + 2, i3, 17);
        } else if (b2 == 1 && bt.fg > 0) {
            graphics.drawString(t.a(this.e.l, bt.fg), (i4 / 2) + i2 + 2, i3, 17);
        }
        a.f.a(graphics, w, (int[]) null, (aj) null, 0, 0, ((((i4 - i5) / 2) + i2) - w.b) - 2, i3 + 2, 0, 0);
    }

    private static void a(Graphics graphics, int i2, int i3, int i4, int i5) {
        graphics.setColor(20871);
        graphics.drawLine(i2, i3, i4, i5);
        int i6 = i3 + 1;
        int i7 = i5 + 1;
        graphics.setColor(1286064);
        graphics.drawLine(i2, i6, i4, i7);
        int i8 = i6 + 1;
        int i9 = i7 + 1;
        graphics.setColor(9820642);
        graphics.drawLine(i2, i8, i4, i9);
        int i10 = i8 + 1;
        int i11 = i9 + 1;
        graphics.setColor(1286064);
        graphics.drawLine(i2, i10, i4, i11);
        graphics.setColor(20871);
        graphics.drawLine(i2, i10 + 1, i4, i11 + 1);
    }

    private void a(Graphics graphics, long j, int i2, int i3) {
        t.a(this.e.l, j);
        ca.a(graphics, this.e.l.toString(), i2, i3, 17, 16776917, 0);
    }

    private void a(Graphics graphics, bc bcVar) {
        int i2;
        int i3;
        if (bcVar == null || a.O == null || a.R == null) {
            i2 = 0;
            i3 = 0;
        } else {
            i3 = (t.b - a.O.b) / 2;
            int i4 = (t.c - a.O.c) / 2;
            graphics.drawImage(a.O.a, i3, i4, 20);
            a(i3, i4, a.O.b, a.O.c);
            graphics.drawImage(a.R[0].a, this.cc[0][0] + i3, this.cc[0][1] + i4, 20);
            graphics.drawImage(a.R[1].a, this.cc[1][0] + i3, this.cc[1][1] + i4, 20);
            graphics.drawImage(a.R[4].a, this.cc[2][0] + i3, this.cc[2][1] + i4, 20);
            graphics.drawImage(a.R[3].a, this.cc[3][0] + i3, this.cc[3][1] + i4, 20);
            graphics.drawImage(a.R[5].a, this.cc[4][0] + i3, this.cc[4][1] + i4, 20);
            graphics.drawImage(a.R[6].a, this.cc[5][0] + i3, this.cc[5][1] + i4, 20);
            for (int i5 = 0; i5 < 6; i5++) {
                c(i5, i3 + this.cc[i5][0], i4 + this.cc[i5][1], a.R[0].b, a.R[0].c);
            }
            a.f.a(graphics, bcVar, (int[]) null, 0, 0, i3 + ((a.O.b - bcVar.i()) / 2), i4 + ((a.O.c - bcVar.j()) / 2), 20, 0);
            i2 = i4;
        }
        ca.d(graphics, this.cc[this.aq][0] + i3, this.cc[this.aq][1] + i2, 17, 17);
        int[] iArr = {-1, -1, -1, -1, -1, -1};
        if (bt.jH != null) {
            int i6 = 0;
            while (true) {
                int i7 = i6;
                if (i7 >= bt.jH.length) {
                    break;
                }
                a.f.a(graphics, b(bt.jK[i7]), (int[]) null, (aj) null, 0, 0, this.cc[n(bt.jJ[i7])][0] + i3 + 1, this.cc[n(bt.jJ[i7])][1] + i2 + 1, 0, 0);
                iArr[n(bt.jJ[i7])] = i7;
                i6 = i7 + 1;
            }
        }
        if (iArr[this.aq] >= 0) {
            if (this.aq == 0) {
                ca.a(graphics, bt.jI[iArr[this.aq]], bt.jL[iArr[this.aq]], this.cc[this.aq][0] + i3 + 16, i2 + this.cc[this.aq][1], 40);
                return;
            }
            if (this.aq == 1) {
                ca.a(graphics, bt.jI[iArr[this.aq]], bt.jL[iArr[this.aq]], this.cc[this.aq][0] + i3 + 16, this.cc[this.aq][1] + i2 + 16, 24);
                return;
            } else if (this.aq == 2) {
                ca.a(graphics, bt.jI[iArr[this.aq]], bt.jL[iArr[this.aq]], i3 + this.cc[this.aq][0], this.cc[this.aq][1] + i2 + 16, 20);
                return;
            } else {
                ca.a(graphics, bt.jI[iArr[this.aq]], bt.jL[iArr[this.aq]], i3 + this.cc[this.aq][0], i2 + this.cc[this.aq][1], 36);
                return;
            }
        }
        if (this.aq == 0) {
            ca.a(graphics, "没有装备", -1L, this.cc[this.aq][0] + i3 + 16, i2 + this.cc[this.aq][1], 40);
            return;
        }
        if (this.aq == 1) {
            ca.a(graphics, "没有装备", -1L, this.cc[this.aq][0] + i3 + 16, this.cc[this.aq][1] + i2 + 16, 24);
        } else if (this.aq == 2) {
            ca.a(graphics, "没有装备", -1L, i3 + this.cc[this.aq][0], this.cc[this.aq][1] + i2 + 16, 20);
        } else {
            ca.a(graphics, "没有装备", -1L, i3 + this.cc[this.aq][0], i2 + this.cc[this.aq][1], 36);
        }
    }

    private void a(short s2, byte b2, byte b3) {
        if (t.m == 2) {
            b2 = 1;
        }
        for (int i2 = 1; i2 <= 4; i2++) {
            t.ag.delete(0, t.ag.length());
            if (i2 == 4) {
                t.ag.append("f").append((int) s2).append((int) b3).append(i2);
            } else {
                t.ag.append("f").append((int) s2).append((int) b3).append((int) b2).append(i2);
            }
            this.cN[this.cS] = t.ag.toString();
            this.cS = (byte) (this.cS + 1);
        }
    }

    private void a(short s2, int i2, String str, String str2) {
        byte[] bArrA = bz.a((short) 4256, bt.ad, s2, i2, str, str2);
        if (bArrA == null) {
            this.e.b("获取上传指令数据错误!");
        } else {
            a.i.a(new w((short) 4256, bArrA));
            this.e.a((String) null);
        }
    }

    private void a(short s2, String str, byte b2, String str2, int i2) {
        byte[] bArrA = bz.a((short) 4665, bt.ad, str, b2, str2, i2);
        if (bArrA == null) {
            this.e.b("获取上传指令数据错误!");
        } else {
            a.i.a(new w((short) 4665, bArrA));
            this.e.a((String) null);
        }
    }

    public static void a(short s2, short s3, short s4, short s5) {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= (s2 == 701 ? 1 : 4)) {
                return;
            }
            a.ah.b(new StringBuffer().append(String.valueOf((int) s2)).append("_").append(i3).toString(), s3, s4, s5);
            i2 = i3 + 1;
        }
    }

    private void a(short s2, byte[] bArr, String str) {
        if (bArr == null) {
            this.e.b("获取上传指令数据错误!");
        } else {
            a.i.a(new w(s2, bArr));
            this.e.a((String) null);
        }
    }

    private void a(boolean z2, byte b2) {
        byte[] bArrA = bz.a((short) 4117, bt.ad, this.az, z2 ? b2 : (byte) 0, z2 ? b2 == 2 ? z((this.ar << 3) + this.aq) : bt.dl[this.e.ar.g()] : -1);
        if (bArrA == null) {
            this.e.b("获取上传指令数据错误!");
        } else {
            a.i.a(new w((short) 4117, bArrA));
            this.e.a((String) null);
        }
    }

    public static void a(bl[] blVarArr) {
        bl blVar;
        bm.removeAllElements();
        for (int i2 = 0; i2 < blVarArr.length; i2++) {
            if (aW[9] == 0) {
                if (i2 < (bt.bw == 0 ? aW[0] : blVarArr.length)) {
                    if (blVarArr[i2].q != -1) {
                        blVarArr[i2].d = new au((byte) 2, blVarArr[i2].q, blVarArr[i2].r, blVarArr[i2].s, blVarArr[i2].t);
                        blVarArr[i2].d.h = blVarArr[i2].j;
                        blVarArr[i2].d.i = blVarArr[i2].k;
                    }
                    if (blVarArr[i2].d != null) {
                        String str = blVarArr[i2].a;
                        if (bt.o != null) {
                            for (int i3 = 0; i3 < bt.o.length; i3++) {
                                if (bt.o[i3] != null && bt.o[i3].a.equals(str)) {
                                    blVar = bt.o[i3];
                                    break;
                                }
                            }
                            blVar = null;
                            if (blVar != null && blVar.d != null) {
                                blVarArr[i2].d.h = blVar.d.h;
                                blVarArr[i2].d.i = blVar.d.i;
                                blVarArr[i2].d.a(blVar.h);
                            }
                            bm.addElement(blVarArr[i2].d);
                        } else {
                            blVar = null;
                            if (blVar != null) {
                                blVarArr[i2].d.h = blVar.d.h;
                                blVarArr[i2].d.i = blVar.d.i;
                                blVarArr[i2].d.a(blVar.h);
                            }
                            bm.addElement(blVarArr[i2].d);
                        }
                    }
                }
            }
        }
        bt.o = blVarArr;
    }

    private void a(String[] strArr) {
        if (strArr.length > 0) {
            this.bA = strArr;
            this.bE = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, strArr.length, 4);
        }
    }

    private static boolean a(byte b2, byte b3) {
        switch (b2) {
            case 0:
                return b3 == 2;
            case 1:
                return b3 == 0 || b3 == 1;
            case 2:
                return b3 == 3;
            default:
                return false;
        }
    }

    private static boolean a(int i2, byte b2, byte b3, byte b4) {
        return i2 == bu.a(a.a(b2, b3, (byte) 1, b4, false), (byte) 2) || i2 == bu.a(a.a(b2, b3, (byte) 3, b4, false), (byte) 2) || i2 == bu.a(a.a(b2, b3, (byte) 3, b4, true), (byte) 2) || i2 == bu.a(a.a(b2, b3, (byte) 0, b4, false), (byte) 2) || i2 == bu.a(a.a(b2, b3, (byte) 0, b4, true), (byte) 2) || i2 == bu.a(a.a(b2, b3, (byte) 2, b4, false), (byte) 2) || i2 == bu.a(a.a(b2, b3, (byte) 2, b4, true), (byte) 2);
    }

    private static boolean a(Vector vector, String str) {
        if (str == null || str.equals("")) {
            return false;
        }
        for (int i2 = 0; i2 < vector.size(); i2++) {
            if (vector.elementAt(i2).toString().equals(str)) {
                return true;
            }
        }
        return false;
    }

    private static String[] a(StringBuffer stringBuffer, String[] strArr, byte[] bArr) {
        if (strArr == null || strArr.length <= 0) {
            return null;
        }
        String[] strArr2 = new String[strArr.length];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            stringBuffer.delete(0, stringBuffer.capacity());
            if (strArr[i2].startsWith("<")) {
                stringBuffer.append(strArr[i2].substring(3));
            } else {
                stringBuffer.append(strArr[i2]);
            }
            if (stringBuffer.length() > 3) {
                stringBuffer.delete(3, stringBuffer.length());
                stringBuffer.append("..");
            }
            if (bArr != null && bArr.length == strArr.length) {
                stringBuffer.append("x");
                stringBuffer.append((int) bArr[i2]);
            }
            strArr2[i2] = stringBuffer.toString();
        }
        return strArr2;
    }

    private String[] a(long[] jArr) {
        if (jArr == null || jArr.length <= 0) {
            return null;
        }
        String[] strArr = new String[jArr.length];
        for (int i2 = 0; i2 < jArr.length; i2++) {
            strArr[i2] = t.a(this.e.l, jArr[i2]);
        }
        return strArr;
    }

    private static String aA(int i2) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<0>需求:");
        stringBuffer.append(bt.kL[i2]);
        stringBuffer.append("<1>获得:");
        stringBuffer.append(bt.kM[i2]);
        return stringBuffer.toString();
    }

    private void aA() {
        if (this.e.aC == null || !this.e.g) {
            return;
        }
        if (this.aT == 4 || this.aR) {
            a(this.aS, (byte) 4);
            this.e.n();
        } else {
            a(this.aS, (byte) this.aT);
            this.e.n();
        }
    }

    private void aB() {
        this.e.at.b(this.e.l.toString(), t.i, (byte) 2);
        this.e.aq.a(this.e.at);
    }

    private void aB(int i2) {
        if (this.l != 0) {
            if (this.l == 1) {
                b(i2);
                if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                    if (i2 == 536870912) {
                        this.l = (short) 0;
                        return;
                    }
                    return;
                }
                byte[] bArrA = bz.a((short) 4650, bt.kJ[this.e.ar.g()], this.ag, bt.ad);
                if (bArrA == null) {
                    this.e.b("获取上传指令数据错误!");
                    return;
                }
                a.i.a(new w((short) 4650, bArrA));
                this.e.a((String) null);
                return;
            }
            return;
        }
        if (this.e.aq != null) {
            this.e.aq.b(i2);
        }
        if (i2 == 536870912) {
            if (this.bb == 68) {
                this.al = null;
                bt.M();
                Y();
                this.e.ar.a(this.aA, this.aU);
            } else {
                N();
            }
        }
        if (bt.kJ == null || bt.kJ.length <= 0) {
            return;
        }
        if (i2 == 514 || i2 == 520 || i2 == 1 || i2 == 4) {
            this.e.at.a(aA(this.e.ar.g()), t.i, (byte) 2);
            this.e.at.a((byte) 1);
        } else if (i2 == 268435456 || i2 == 1073741824 || i2 == 517) {
            a(99L);
            this.l = (short) 1;
        }
    }

    private short aC() {
        int i2 = 0;
        for (int i3 = 0; i3 < this.bM.length; i3++) {
            i2 += this.bM[i3];
        }
        return (short) (bt.bf - i2 >= 0 ? bt.bf - i2 : 0);
    }

    private void aC(int i2) {
        if (this.l == 0) {
            if (i2 == 8 || i2 == 516) {
                ca.e = ca.e - ca.d >= 0 ? ca.e - ca.d : 0;
            } else if (i2 == 2 || i2 == 518) {
                ca.e = ca.e + ca.d < K.a() ? ca.e + ca.d : ca.e;
            }
            if (bt.kR.length <= 0) {
                return;
            }
            if (i2 == 1 || i2 == 514) {
                if (this.am != null) {
                    ca.g = ca.g + (-1) >= 0 ? ca.g - 1 : this.am.length - 1;
                    return;
                }
                return;
            }
            if (i2 == 4 || i2 == 520) {
                if (this.am != null) {
                    ca.g = ca.g + 1 < this.am.length ? ca.g + 1 : 0;
                }
            } else if (i2 == 268435456 || i2 == 1073741824 || i2 == 517) {
                byte[] bArrA = bz.a((short) 4652, bt.ad, bt.kO, bt.kP, (byte) ca.g);
                if (bArrA != null) {
                    a.i.a(new w((short) 4652, bArrA));
                    this.e.a((String) null);
                } else {
                    this.e.b("获取上传指令数据错误!");
                }
                bt.kT = false;
                this.l = (short) 0;
            }
        }
    }

    private void aD(int i2) {
        if (this.e.aq != null) {
            this.e.aq.b(i2);
        }
        if (i2 == 268435456 || i2 == 536870912) {
            bt.by = null;
            bt.bz = null;
            N();
        }
    }

    private static boolean aD() {
        return bt.lA != null && bt.lA.length == 2 && bt.lA[0].equals("26") && bt.lA[1].equals("27");
    }

    private void aE() {
        ca.a(o + 35, ((this.e.ar.i() + 3) * t.j) + 12 + p, new String[]{"自动", "追踪", "详情", "放弃"}, false);
        this.l = (short) 1;
    }

    private void aE(int i2) {
        if (this.l == 0) {
            ca.b(i2);
            if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                if (i2 == 536870912) {
                    this.k = (short) 0;
                    this.j = (short) 0;
                    return;
                }
                return;
            }
            if (bt.bf == 0) {
                if (bt.bs < 0) {
                    if (ca.o == 0) {
                        aZ();
                        return;
                    }
                    if (ca.o == 1) {
                        ba();
                        return;
                    }
                    if (ca.o == 2) {
                        d((byte) 0);
                        return;
                    }
                    if (ca.o == 3) {
                        bb();
                        return;
                    } else {
                        if (ca.o == 4) {
                            this.by = (byte) 1;
                            aF(-1);
                            return;
                        }
                        return;
                    }
                }
                if (ca.o == 0) {
                    aZ();
                    return;
                }
                if (ca.o == 1) {
                    ba();
                    return;
                }
                if (ca.o == 2) {
                    if (bt.bs == 0) {
                        bd();
                        return;
                    } else {
                        if (bt.bs == 1) {
                            bc();
                            return;
                        }
                        return;
                    }
                }
                if (ca.o == 3) {
                    d((byte) 0);
                    return;
                }
                if (ca.o == 4) {
                    bb();
                    return;
                } else {
                    if (ca.o == 5) {
                        this.by = (byte) 1;
                        aF(-1);
                        return;
                    }
                    return;
                }
            }
            if (bt.bs < 0) {
                if (ca.o == 0) {
                    aZ();
                    return;
                }
                if (ca.o == 1) {
                    ba();
                    return;
                }
                if (ca.o == 2) {
                    p();
                    return;
                }
                if (ca.o == 3) {
                    d((byte) 0);
                    return;
                }
                if (ca.o == 4) {
                    bb();
                    return;
                } else {
                    if (ca.o == 5) {
                        this.by = (byte) 1;
                        aF(-1);
                        return;
                    }
                    return;
                }
            }
            if (ca.o == 0) {
                aZ();
                return;
            }
            if (ca.o == 1) {
                ba();
                return;
            }
            if (ca.o == 3) {
                if (bt.bs == 0) {
                    bd();
                    return;
                } else {
                    if (bt.bs == 1) {
                        bc();
                        return;
                    }
                    return;
                }
            }
            if (ca.o == 2) {
                p();
                return;
            }
            if (ca.o == 4) {
                d((byte) 0);
                return;
            }
            if (ca.o == 5) {
                bb();
            } else if (ca.o == 6) {
                this.by = (byte) 1;
                aF(-1);
            }
        }
    }

    private void aF() {
        this.l = (short) 0;
        this.e.aq.b();
        this.e.aq.a("宠物仓库");
        if (bt.gs == null || bt.gs.length <= 0) {
            this.e.ar.a((Image[]) null, (String[]) null, (String[]) null, (String[]) null);
            this.e.at.a((String) null, t.i, (byte) 2);
        } else {
            this.e.ar.a((Image[]) null, bt.gt, (String[]) null, e(bt.gu));
            this.e.at.a(bt.g(this.e.l, 0), t.i, (byte) 2);
        }
        this.e.at.a((byte) 1);
        this.e.au.a("取回");
        this.e.aq.a(this.e.ar);
        this.e.aq.a(this.e.at);
        if (t.c > 220) {
            this.e.aq.a(this.e.au);
        }
        this.e.aq.a(t.f, t.g, t.d, t.e);
        if (bt.gw != null) {
            a(bt.gw[0], bt.gx[0], bt.gy[0], bt.gz[0]);
            this.aI = a.ah.a(String.valueOf(new StringBuffer().append((int) bt.gw[0]).append("_0").toString()), bt.gx[0], bt.gy[0], bt.gz[0]);
        }
        this.k = (short) 35;
        this.j = (short) 35;
    }

    private void aF(int i2) {
        byte[] bArrC = bz.c((short) 4106, bt.ad, -1);
        if (bArrC == null) {
            this.e.b("获取上传指令数据错误!");
        } else {
            a.i.a(new w((short) 4106, bArrC));
            this.e.a((String) null);
        }
    }

    private void aG() {
        if (bt.bY == null || (this.ar << 3) + this.aq >= bt.bY.length) {
            this.e.at.a("没有商品,按3、9键可以上下翻滚此属性描述框", t.i, (byte) 1);
        } else {
            this.e.at.a(Y((this.ar << 3) + this.aq), t.i, (byte) 1);
        }
        this.e.at.a((byte) 1);
        ca.l = 0;
    }

    private void aG(int i2) {
        int iA;
        if (this.l != 0) {
            if (this.l == 1) {
                if (i2 == 268435456 || i2 == 1073741824 || i2 == 517) {
                    N();
                    a((byte) 1, bt.lu, bt.lv, Short.parseShort(bt.lA[ca.g]), bt.lz[ca.g]);
                    this.l = (short) 0;
                }
                if (i2 == 536870912) {
                    this.l = (short) 0;
                    return;
                }
                return;
            }
            return;
        }
        if (i2 == 8 || i2 == 516) {
            ca.e = ca.e - ca.d >= 0 ? ca.e - ca.d : 0;
        } else if (i2 == 2 || i2 == 518) {
            ca.e = ca.e + ca.d < K.a() ? ca.e + ca.d : ca.e;
        }
        if (bt.lz == null || bt.lz.length <= 0) {
            return;
        }
        if (i2 == 1 || i2 == 514) {
            if (bt.lz != null) {
                ca.g = ca.g + (-1) >= 0 ? ca.g - 1 : bt.lz.length - 1;
                ca.h = 0;
            }
        } else if (i2 == 4 || i2 == 520) {
            if (bt.lz != null) {
                ca.g = ca.g + 1 < bt.lz.length ? ca.g + 1 : 0;
                ca.h = 0;
            }
        } else if (i2 == 268435456 || i2 == 1073741824 || i2 == 517) {
            if (bt.lB[ca.g] != null) {
                this.l = (short) 1;
            } else {
                short s2 = this.j;
                N();
                if (aD()) {
                    if (ca.g == 0) {
                        this.e.b("游客注册 第1步: ", "修改角色昵称");
                    }
                } else if (s2 == 76) {
                    a((byte) 1, bt.lu, bt.lv, Short.parseShort(bt.lA[ca.g]), bt.lC);
                } else {
                    a((byte) 1, bt.lu, bt.lv, Short.parseShort(bt.lA[ca.g]), bt.lz[ca.g]);
                }
            }
        }
        if (i2 == 536870912) {
            this.as = 0;
            if (aD()) {
                N();
            } else if (this.j == 76) {
                a((byte) 1, bt.lu, bt.lv, (short) -1, bt.lC);
                d((byte) 1);
                if (bt.lv == 2 && bt.lC != null && (iA = bt.P.a(bt.lC)) != -1) {
                    this.e.ar.a(iA + 1);
                }
            } else {
                a((byte) 1, bt.lu, bt.lv, (short) -1, "");
                N();
            }
            K = null;
        }
    }

    private void aH() {
        this.aK = "";
        this.aL = "";
        this.aM = 1;
        this.aN = 0;
        this.aV = 0;
    }

    private void aH(int i2) {
        if (this.l == 0) {
            if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                if (this.e.aq != null) {
                    this.e.aq.b(i2);
                }
                if (i2 == 536870912) {
                    d((byte) 0);
                    return;
                }
                return;
            }
            bt.P.i = this.e.ar.g();
            ak akVar = bt.P.c[bt.P.i];
            this.l = (short) 1;
            this.e.av.b();
            this.e.av.a(t.f, t.g, t.d, t.e);
            this.e.av.a(akVar.b);
            this.e.av.a(new bi(akVar.c));
            u uVar = new u();
            uVar.b(akVar.d);
            this.e.av.a(uVar);
            this.e.av.d();
            return;
        }
        if (this.l == 1) {
            if (this.e.av != null) {
                this.e.av.a(i2);
            }
            if (i2 == 268435456 || i2 == 1073741824 || i2 == 517) {
                this.l = (short) 2;
                ca.h = 0;
            }
            if (i2 == 536870912) {
                this.e.av.b();
                u();
                this.e.ar.a(bt.P.i);
                bt.P.i = -1;
                this.l = (short) 0;
                return;
            }
            return;
        }
        if (this.l == 2) {
            if (i2 == 268435456 || i2 == 1073741824 || i2 == 517) {
                byte[] bArrR = bz.r((short) 4678, bt.ad, bt.P.c[bt.P.i].f);
                if (bArrR == null) {
                    this.e.b("获取上传指令数据错误!");
                } else {
                    a.i.a(new w((short) 4678, bArrR));
                    this.e.a((String) null);
                }
            }
            if (i2 == 536870912) {
                this.l = (short) 1;
            }
        }
    }

    private void aI() {
        this.e.aq.b();
        this.e.aq.a("宠物拍卖场");
        this.e.ar.a((Image[]) null, new String[]{"关键字", "雷属性", "火属性", "冰属性", "无属性"}, (String[]) null, (String[]) null);
        this.e.au.a("搜索");
        this.e.aq.a(this.e.ar);
        if (t.c > 220) {
            this.e.aq.a(this.e.au);
        }
        this.e.aq.a(t.f, t.g, t.d, t.e);
        this.e.j = this.e.k;
        this.k = (short) 15;
        this.j = (short) 15;
    }

    private void aI(int i2) {
        if (this.l == 0) {
            if (this.e.aq != null) {
                this.e.aq.b(i2);
            }
            if ((i2 == 8 || i2 == 2 || i2 == 516 || i2 == 518) && this.e.as.a != this.as) {
                d(this.e.as.a);
            }
            if (i2 == 268435456 || i2 == 1073741824 || i2 == 517) {
                int iG = this.e.ar.g();
                if (this.as == 0) {
                    if (iG == 0) {
                        ca.a(t.f + 80, (t.j * 2) + 26 + (this.e.ar.i() * t.j) + t.g, f.a, false);
                        this.l = (short) 1;
                    } else {
                        bo boVar = bt.O.f[iG - 1];
                        ca.a(t.f + 80, (t.j * 2) + 26 + (this.e.ar.i() * t.j) + t.g, boVar != null && boVar.f ? f.c : f.b, false);
                        this.l = (short) 1;
                    }
                } else if (iG != 0) {
                    g(bt.P.b[iG - 1].a);
                } else if (bt.V != null) {
                    this.e.b(bt.V);
                } else {
                    this.e.l();
                }
            }
            if ((i2 == 1 || i2 == 4 || i2 == 514 || i2 == 520) && this.as == 0) {
                this.e.at.a(bt.O.j[this.e.ar.g()], t.i, (byte) 2);
                this.e.at.a((byte) 1);
            }
            if (i2 == 536870912) {
                int i3 = this.as;
                N();
                return;
            }
            return;
        }
        if (this.l == 1) {
            if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                if (i2 == 1 || i2 == 4 || i2 == 514 || i2 == 520) {
                    ca.b(i2);
                    return;
                } else {
                    if (i2 == 536870912 && this.as == 0) {
                        this.l = (short) 0;
                        return;
                    }
                    return;
                }
            }
            if (this.as == 0) {
                int iG2 = this.e.ar.g();
                String str = ca.p[ca.o];
                if (iG2 == 0) {
                    if (f.a[0].equals(str)) {
                        av(bt.O.d - 1);
                        return;
                    }
                    if (f.a[1].equals(str)) {
                        av(bt.O.d + 1);
                        return;
                    }
                    if (f.a[2].equals(str)) {
                        if (bt.S == null) {
                            this.e.a((byte) 0, "发送邮件", bt.O.n, bt.O.o, bt.O.p == null ? "" : bt.O.p, bt.O.q, bt.O.r);
                            return;
                        } else {
                            this.l = (short) 0;
                            this.e.b(bt.S);
                            return;
                        }
                    }
                    if (f.a[3].equals(str)) {
                        f("all");
                        return;
                    }
                    if (f.a[4].equals(str)) {
                        if (bt.U != null) {
                            this.e.b(bt.U);
                            return;
                        }
                        byte[] bArrL = bz.l((short) 4672, bt.ad);
                        if (bArrL == null) {
                            this.e.b("获取上传指令数据错误!");
                            return;
                        } else {
                            a.i.a(new w((short) 4668, bArrL));
                            this.e.a((String) null);
                            return;
                        }
                    }
                    return;
                }
                bo boVar2 = bt.O.f[iG2 - 1];
                if (f.b[0].equals(str)) {
                    boVar2.f = true;
                    bt.O.c();
                    d((byte) 0);
                    this.e.ar.a(iG2);
                    this.e.at.a(bt.O.j[iG2], t.i, (byte) 1);
                    this.e.at.a((byte) 1);
                    this.l = (short) 0;
                    byte[] bArrH = bz.h((short) 4673, bt.ad, boVar2.a);
                    if (bArrH == null) {
                        this.e.b("获取上传指令数据错误!");
                        return;
                    } else {
                        a.i.a(new w((short) 4673, bArrH));
                        return;
                    }
                }
                if (f.b[1].equals(str)) {
                    if (bt.S != null) {
                        this.e.b(bt.S);
                        return;
                    }
                    if (!boVar2.f) {
                        this.e.b("未读邮件，请查看后再进行回复");
                        return;
                    }
                    bt.O.a();
                    bt.O.q = boVar2.a;
                    bt.O.r = boVar2.d;
                    bt.O.o = boVar2.e;
                    this.e.a((byte) 0, "回复邮件", bt.O.n, bt.O.o, bt.O.p == null ? "" : bt.O.p, bt.O.q, bt.O.r);
                    return;
                }
                if (f.b[2].equals(str)) {
                    f(boVar2.a);
                    return;
                }
                if (f.b[3].equals(str)) {
                    a(boVar2.e, false);
                    return;
                }
                if (f.b[4].equals(str)) {
                    b(boVar2.e);
                    return;
                }
                if (f.b[5].equals(str)) {
                    if (bt.T != null) {
                        this.e.b(bt.T);
                    } else if (boVar2.f) {
                        this.e.a(boVar2.a, boVar2.e, boVar2.b, boVar2.c);
                    } else {
                        this.e.b("未读邮件，请先查看");
                    }
                }
            }
        }
    }

    private void aJ() {
        if (this.e.as.a == 0) {
            aM();
        } else if (this.e.as.a == 1) {
            o((byte) 5);
        } else if (this.e.as.a == 2) {
            o((byte) 0);
        } else if (this.e.as.a == 3) {
            o((byte) 3);
        } else if (this.e.as.a == 4) {
            o((byte) 1);
        } else if (this.e.as.a == 5) {
            o((byte) 2);
        } else if (this.e.as.a == 6) {
            o((byte) 4);
        } else if (this.e.as.a == 7) {
            o((byte) 6);
        }
        this.cr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, aP.size(), 4);
        ca.a(aP.size(), 4, this.e.as.b + 6, t.b - 8, (t.c - this.e.as.b) - 6, ((t.c - this.e.as.b) - 6) / t.j, false);
        if (this.cp == this.e.as.a) {
            ca.w = this.cn;
            ca.z = this.co;
        }
    }

    private void aJ(int i2) {
        String str;
        int iA;
        if (this.l != 0) {
            if (this.l == 1) {
                if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                    if (i2 == 536870912) {
                        this.l = (short) 0;
                        return;
                    }
                    return;
                } else {
                    short s2 = this.as == 0 ? bt.lQ[this.e.ar.g()] : this.as == 1 ? bt.lY[this.e.ar.g()] : this.as == 2 ? bt.mg[this.e.ar.g()] : (short) 0;
                    String strValueOf = s2 != 0 ? String.valueOf((int) s2) : null;
                    if (strValueOf != null) {
                        this.aE = this.e.ar.g();
                        a(bt.lD, bt.lE, strValueOf, bt.mi);
                    }
                    this.l = (short) 0;
                    return;
                }
            }
            return;
        }
        if (this.e.aq != null) {
            this.e.aq.b(i2);
        }
        if ((i2 == 8 || i2 == 2 || i2 == 516 || i2 == 518) && this.e.as.a != this.as) {
            e(this.e.as.a);
        }
        if (i2 == 268435456 || i2 == 1073741824 || i2 == 517) {
            if (this.as == 0) {
                if (bt.lP == null) {
                    return;
                } else {
                    str = bt.lP[this.e.ar.g()];
                }
            } else if (this.as == 1) {
                if (bt.lX == null) {
                    return;
                } else {
                    str = bt.lX[this.e.ar.g()];
                }
            } else if (this.as != 2 || bt.mf == null) {
                return;
            } else {
                str = bt.mf[this.e.ar.g()];
            }
            if (str != null) {
                ca.a(t.f + 80, (t.j * 2) + 26 + (this.e.ar.i() * t.j) + t.g, new String[]{str}, false);
                this.l = (short) 1;
            }
        }
        if (i2 == 1 || i2 == 4 || i2 == 514 || i2 == 520) {
            if (this.as == 0) {
                if (bt.lO != null) {
                    this.e.ar.a(bt.lO[this.e.ar.g()], 1);
                }
                if (bt.lN != null && bt.lN.length != 1) {
                    this.e.at.a(bt.lN[this.e.ar.g()], t.i, (byte) 2);
                    if (bt.lK != null) {
                        this.e.at.a((byte) 1);
                    }
                }
            }
            if (this.as == 1) {
                if (bt.lW != null) {
                    this.e.ar.a(bt.lW[this.e.ar.g()], 1);
                }
                if (bt.lV != null && bt.lV.length != 1) {
                    this.e.at.a(bt.lV[this.e.ar.g()], t.i, (byte) 2);
                    if (bt.lS != null) {
                        this.e.at.a((byte) 1);
                    }
                }
            }
            if (this.as == 2) {
                if (bt.me != null) {
                    this.e.ar.a(bt.me[this.e.ar.g()], 1);
                }
                if (bt.md != null && bt.md.length != 1) {
                    this.e.at.a(bt.md[this.e.ar.g()], t.i, (byte) 2);
                    if (bt.ma != null) {
                        this.e.at.a((byte) 1);
                    }
                }
            }
        }
        if (i2 == 536870912) {
            this.as = 0;
            a((byte) 0, bt.lD, bt.lE, (short) -1, bt.lF);
            if (this.j == 1) {
                av();
                c(7);
            } else {
                if (this.j != 76) {
                    N();
                    return;
                }
                d((byte) 1);
                if (bt.lE != 2 || bt.mi == null || (iA = bt.P.a(bt.mi)) == -1) {
                    return;
                }
                this.e.ar.a(iA + 1);
            }
        }
    }

    private static String aK(int i2) {
        if (bt.ld == null || bt.ld.length <= i2) {
            return null;
        }
        return bt.ld[i2];
    }

    private void aK() {
        this.e.d("聊天");
        if (this.e.as.a == 2) {
            this.e.aE.setSelectedIndex(0, true);
            return;
        }
        if (this.e.as.a == 3) {
            this.e.aE.setSelectedIndex(3, true);
            return;
        }
        if (this.e.as.a == 4) {
            this.e.aE.setSelectedIndex(1, true);
        } else if (this.e.as.a == 5) {
            this.e.aE.setSelectedIndex(2, true);
        } else if (this.e.as.a == 7) {
            this.e.aE.setSelectedIndex(4, true);
        }
    }

    private void aL() {
        if (this.e.as.a == 0) {
            aM();
            return;
        }
        if (this.e.as.a == 1) {
            o((byte) 5);
            return;
        }
        if (this.e.as.a == 2) {
            o((byte) 0);
            return;
        }
        if (this.e.as.a == 3) {
            o((byte) 3);
            return;
        }
        if (this.e.as.a == 4) {
            o((byte) 1);
            return;
        }
        if (this.e.as.a == 5) {
            o((byte) 2);
        } else if (this.e.as.a == 6) {
            o((byte) 4);
        } else if (this.e.as.a == 7) {
            o((byte) 6);
        }
    }

    private void aL(int i2) {
        if (this.l == 0 || this.l == 4) {
            if (this.T != null) {
                this.T.b(i2);
            }
            if (i2 == 514 || i2 == 520 || i2 == 1 || i2 == 4) {
                this.bv.a(bt.lk[this.bu.g()], t.i, (byte) 1);
                this.bv.a((byte) 1);
                return;
            }
            if (i2 == 536870912) {
                this.k = (short) 104;
                bt.lr = (short) 1;
                bt.Q();
                return;
            }
            if (i2 != 1024) {
                if (i2 == 2048) {
                    if (bt.lr <= 1 && bt.ls == 1) {
                        bt.lr = (short) (bt.lr + 1);
                        a(bt.ad, this.l, bt.lr);
                        return;
                    } else {
                        if (bt.lr <= 1 || bt.ls != 1) {
                            return;
                        }
                        bt.lr = (short) (bt.lr + 1);
                        a(bt.ad, this.l, bt.lr);
                        return;
                    }
                }
                return;
            }
            if (bt.lr > 1 && bt.ls == 1) {
                if (bt.lr - 1 <= 1) {
                    bt.lr = (short) 1;
                } else {
                    bt.lr = (short) (bt.lr - 1);
                }
                a(bt.ad, this.l, bt.lr);
                return;
            }
            if (bt.lr <= 1 || bt.ls != 0) {
                return;
            }
            if (bt.lr - 1 < 1) {
                bt.lr = (short) 1;
            } else {
                bt.lr = (short) (bt.lr - 1);
            }
            a(bt.ad, this.l, bt.lr);
            return;
        }
        if (this.l == 2) {
            if (this.T != null) {
                this.T.b(i2);
            }
            if (i2 == 514 || i2 == 520 || i2 == 1 || i2 == 4) {
                this.bv.a(bt.lk[this.bu.g()], t.i, (byte) 1);
                this.bv.a((byte) 1);
                return;
            }
            if (i2 == 536870912) {
                this.k = (short) 104;
                bt.lr = (short) 1;
                bt.Q();
                return;
            }
            if (i2 != 1024) {
                if (i2 == 2048) {
                    if (bt.lr <= 1 && bt.ls == 1) {
                        bt.lr = (short) (bt.lr + 1);
                        a(bt.lo, (short) 2, bt.lr);
                        return;
                    } else {
                        if (bt.lr <= 1 || bt.ls != 1) {
                            return;
                        }
                        bt.lr = (short) (bt.lr + 1);
                        a(bt.lo, (short) 2, bt.lr);
                        return;
                    }
                }
                return;
            }
            if (bt.lr > 1 && bt.ls == 1) {
                if (bt.lr - 1 <= 1) {
                    bt.lr = (short) 1;
                } else {
                    bt.lr = (short) (bt.lr - 1);
                }
                a(bt.lo, (short) 2, bt.lr);
                return;
            }
            if (bt.lr <= 1 || bt.ls != 0) {
                return;
            }
            if (bt.lr - 1 < 1) {
                bt.lr = (short) 1;
            } else {
                bt.lr = (short) (bt.lr - 1);
            }
            a(bt.lo, (short) 2, bt.lr);
            return;
        }
        if (this.l == 3) {
            if (this.T != null) {
                this.T.b(i2);
            }
            if (i2 == 514 || i2 == 520 || i2 == 1 || i2 == 4) {
                this.bv.a(bt.lk[this.bu.g()], t.i, (byte) 1);
                this.bv.a((byte) 1);
                return;
            }
            if (i2 == 536870912) {
                this.k = (short) 104;
                bt.lr = (short) 1;
                bt.Q();
                return;
            }
            if (i2 != 1024) {
                if (i2 == 2048) {
                    if (bt.lr <= 1 && bt.ls == 1) {
                        bt.lr = (short) (bt.lr + 1);
                        a(bt.lo, (short) 3, bt.lr);
                        return;
                    } else {
                        if (bt.lr <= 1 || bt.ls != 1) {
                            return;
                        }
                        bt.lr = (short) (bt.lr + 1);
                        a(bt.lo, (short) 3, bt.lr);
                        return;
                    }
                }
                return;
            }
            if (bt.lr > 1 && bt.ls == 1) {
                if (bt.lr - 1 <= 1) {
                    bt.lr = (short) 1;
                } else {
                    bt.lr = (short) (bt.lr - 1);
                }
                a(bt.lo, (short) 3, bt.lr);
                return;
            }
            if (bt.lr <= 1 || bt.ls != 0) {
                return;
            }
            if (bt.lr - 1 < 1) {
                bt.lr = (short) 1;
            } else {
                bt.lr = (short) (bt.lr - 1);
            }
            a(bt.lo, (short) 3, bt.lr);
        }
    }

    private void aM() {
        try {
            aP.removeAllElements();
            for (int i2 = 0; i2 < ck.size(); i2++) {
                ce ceVar = (ce) ck.elementAt(i2);
                String[] strArrA = ca.a(new StringBuffer().append("[").append(ceVar.d).append("]").append(ceVar.e).toString(), t.i, t.b - 20);
                if (strArrA != null && strArrA.length > 0) {
                    for (String str : strArrA) {
                        aP.addElement(new b(str, ca.n[ceVar.a]));
                    }
                }
            }
        } catch (Exception e) {
        }
    }

    private void aM(int i2) {
        if (this.l == 0 || this.l == 4) {
            if (this.e.aq != null) {
                this.e.aq.b(i2);
            }
            if (i2 == 1 || i2 == 514 || i2 == 520 || i2 == 4) {
                this.e.at.a(aK(this.e.ar.g()), t.i, (byte) 1);
                this.e.at.a((byte) 1);
                return;
            }
            if (i2 == 268435456 || i2 == 1073741824) {
                a(bt.ad, this.l, (short) 1);
                return;
            }
            if (i2 == 536870912) {
                if (this.l == 0) {
                    bt.lp = (short) 1;
                    av();
                    c(6);
                } else if (this.l == 4) {
                    this.k = (short) 0;
                    this.j = (short) 0;
                    a aVar = this.e;
                    this.e.k = (short) 7;
                    aVar.j = (short) 7;
                }
                bt.P();
                return;
            }
            if (i2 != 1024) {
                if (i2 == 2048) {
                    if (bt.lp <= 1 && bt.lq == 1) {
                        bt.lp = (short) (bt.lp + 1);
                        a(bt.ad, bt.ad, this.l, bt.lp);
                        return;
                    } else {
                        if (bt.lp <= 1 || bt.lq != 1) {
                            return;
                        }
                        bt.lp = (short) (bt.lp + 1);
                        a(bt.ad, bt.ad, this.l, bt.lp);
                        return;
                    }
                }
                return;
            }
            if (bt.lp > 1 && bt.lq == 1) {
                if (bt.lp - 1 <= 1) {
                    bt.lp = (short) 1;
                } else {
                    bt.lp = (short) (bt.lp - 1);
                }
                a(bt.ad, bt.ad, this.l, bt.lp);
                return;
            }
            if (bt.lp <= 1 || bt.lq != 0) {
                return;
            }
            if (bt.lp - 1 < 1) {
                bt.lp = (short) 1;
            } else {
                bt.lp = (short) (bt.lp - 1);
            }
            a(bt.ad, bt.ad, this.l, bt.lp);
            return;
        }
        if (this.l == 2) {
            if (this.e.aq != null) {
                this.e.aq.b(i2);
            }
            if (i2 == 1 || i2 == 514 || i2 == 520 || i2 == 4) {
                this.e.at.a(aK(this.e.ar.g()), t.i, (byte) 1);
                this.e.at.a((byte) 1);
                return;
            }
            if (i2 == 268435456 || i2 == 1073741824) {
                a(bt.lo, (short) 2, (short) 1);
                return;
            }
            if (i2 == 536870912) {
                bt.lp = (short) 1;
                b((byte) 0);
                bt.P();
                return;
            }
            if (i2 != 1024) {
                if (i2 == 2048) {
                    if (bt.lp <= 1 && bt.lq == 1) {
                        bt.lp = (short) (bt.lp + 1);
                        a(this.df, bt.ad, (short) 2, bt.lp);
                        return;
                    } else {
                        if (bt.lp <= 1 || bt.lq != 1) {
                            return;
                        }
                        bt.lp = (short) (bt.lp + 1);
                        a(this.df, bt.ad, (short) 2, bt.lp);
                        return;
                    }
                }
                return;
            }
            if (bt.lp > 1 && bt.lq == 1) {
                if (bt.lp - 1 <= 1) {
                    bt.lp = (short) 1;
                } else {
                    bt.lp = (short) (bt.lp - 1);
                }
                a(this.df, bt.ad, (short) 2, bt.lp);
                return;
            }
            if (bt.lp <= 1 || bt.lq != 0) {
                return;
            }
            if (bt.lp - 1 < 1) {
                bt.lp = (short) 1;
            } else {
                bt.lp = (short) (bt.lp - 1);
            }
            a(this.df, bt.ad, (short) 2, bt.lp);
            return;
        }
        if (this.l == 3) {
            if (this.e.aq != null) {
                this.e.aq.b(i2);
            }
            if (i2 == 1 || i2 == 514 || i2 == 520 || i2 == 4) {
                this.e.at.a(aK(this.e.ar.g()), t.i, (byte) 1);
                this.e.at.a((byte) 1);
                return;
            }
            if (i2 == 268435456 || i2 == 1073741824) {
                a(bt.lo, (short) 3, (short) 1);
                return;
            }
            if (i2 == 536870912) {
                p(0);
                bt.lp = (short) 1;
                bt.P();
                return;
            }
            if (i2 != 1024) {
                if (i2 == 2048) {
                    if (bt.lp <= 1 && bt.lq == 1) {
                        bt.lp = (short) (bt.lp + 1);
                        a(this.de, bt.ad, (short) 3, bt.lp);
                        return;
                    } else {
                        if (bt.lp <= 1 || bt.lq != 1) {
                            return;
                        }
                        bt.lp = (short) (bt.lp + 1);
                        a(this.de, bt.ad, (short) 3, bt.lp);
                        return;
                    }
                }
                return;
            }
            if (bt.lp > 1 && bt.lq == 1) {
                if (bt.lp - 1 <= 1) {
                    bt.lp = (short) 1;
                } else {
                    bt.lp = (short) (bt.lp - 1);
                }
                a(this.de, bt.ad, (short) 3, bt.lp);
                return;
            }
            if (bt.lp <= 1 || bt.lq != 0) {
                return;
            }
            if (bt.lp - 1 < 1) {
                bt.lp = (short) 1;
            } else {
                bt.lp = (short) (bt.lp - 1);
            }
            a(this.de, bt.ad, (short) 3, bt.lp);
        }
    }

    private static String aN(int i2) {
        if (bt.mo == null || bt.mo.length <= i2) {
            return null;
        }
        return bt.mo[i2];
    }

    private void aN() {
        Image[] imageArr = new Image[bt.q.length];
        this.am = new String[bt.q.length];
        this.al = new String[bt.q.length];
        for (byte b2 = 0; b2 < bt.q.length; b2 = (byte) (b2 + 1)) {
            this.am[b2] = bt.q[b2].e;
            this.al[b2] = new StringBuffer().append((int) bt.q[b2].o).append("级").toString();
            if (bt.q[b2].s == 1) {
                imageArr[b2] = y.a;
            } else if (bt.q[b2].s == 0) {
                imageArr[b2] = z.a;
            }
        }
        if (this.j == 21) {
            this.e.aq.a(new StringBuffer().append("队伍(").append(bt.s == 0 ? "跟随" : "自由").append(")信息").toString());
            this.e.ar.a(imageArr, this.am, (String[]) null, this.al);
            return;
        }
        this.l = (short) 0;
        this.e.aq.j();
        this.e.aq.a(new StringBuffer().append("队伍(").append(bt.s == 0 ? "跟随" : "自由").append(")信息").toString());
        this.e.ar.a(imageArr, this.am, (String[]) null, this.al);
        this.e.aq.a(this.e.ar);
        this.e.aq.a(t.f, t.g, t.d, t.e);
        this.e.j = this.e.k;
        this.k = (short) 21;
        this.j = (short) 21;
    }

    private void aO(int i2) {
        if (this.l != 0) {
            if (this.l == 1) {
                ca.b(i2);
                if (i2 == 268435456 || i2 == 517 || i2 == 1073741824) {
                    if (ca.o == 0) {
                        a(this.e.as.a, bt.mk[this.e.ar.g()], (byte) 2);
                        return;
                    }
                    return;
                } else {
                    if (i2 == 536870912) {
                        this.l = (short) 0;
                        return;
                    }
                    return;
                }
            }
            if (this.l == 2) {
                ca.b(i2);
                if (i2 == 268435456 || i2 == 517 || i2 == 1073741824) {
                    a(this.e.as.a, bt.mk[this.e.ar.g()], (byte) 1);
                    return;
                } else {
                    if (i2 == 536870912) {
                        this.l = (short) 0;
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (this.e.aq != null) {
            this.e.aq.b(i2);
        }
        if (i2 == 1 || i2 == 514 || i2 == 520 || i2 == 4) {
            this.e.at.a(aN(this.e.ar.g()), t.i, (byte) 1);
            this.e.at.a((byte) 1);
            return;
        }
        if (i2 == 8 || i2 == 2 || i2 == 518 || i2 == 516) {
            x(this.e.as.a);
            return;
        }
        if (i2 != 268435456 && i2 != 517 && i2 != 1073741824) {
            if (i2 == 536870912) {
                av();
                c(5);
                return;
            }
            return;
        }
        if (bt.ml == null || bt.mk == null) {
            return;
        }
        if (bt.mm[this.e.ar.g()] == 1) {
            this.am = new String[]{"取消激活"};
            this.l = (short) 1;
        } else {
            this.am = new String[]{"激活"};
            this.l = (short) 2;
        }
        ca.a((int) t.f, (t.j * 3) + 11 + (this.e.ar.i() * t.j) + t.g, this.am, true);
    }

    private boolean aO() {
        if (this.ct == 0) {
            if (this.ar == 1 && bt.fh != null) {
                for (int i2 = 0; i2 < bt.fm.length; i2++) {
                    if (this.e.ax == bt.fk[i2]) {
                        return false;
                    }
                }
            }
        } else if (this.ct == 1 && this.ar == 1 && bt.fu != null) {
            for (int i3 = 0; i3 < bt.fu.length; i3++) {
                if (this.e.ax == bt.fv[i3]) {
                    return false;
                }
            }
        }
        return true;
    }

    private void aP() {
        int i2 = 0;
        int i3 = this.e.ax;
        ca.l = 0;
        this.cu = this.ct == 0 ? "没有物品" : "没有宠物";
        if (this.ct == 0) {
            if (this.ar == 0 && bt.fo != null) {
                for (int i4 = 0; i4 < bt.ft.length; i4++) {
                    if (i3 == bt.fr[i4]) {
                        this.cu = bt.b(this.e.l, i4);
                        return;
                    }
                }
                return;
            }
            if (this.ar != 1 || bt.fh == null) {
                return;
            }
            while (i2 < bt.fm.length) {
                if (i3 == bt.fk[i2]) {
                    this.cu = bt.a(this.e.l, i2);
                    return;
                }
                i2++;
            }
            return;
        }
        if (this.ct == 1) {
            if (this.ar == 0 && bt.fx != null) {
                while (i2 < bt.fx.length) {
                    if (i3 == bt.fy[i2]) {
                        this.cu = bt.d(this.e.l, i2);
                        return;
                    }
                    i2++;
                }
                return;
            }
            if (this.ar != 1 || bt.fu == null) {
                return;
            }
            while (i2 < bt.fu.length) {
                if (i3 == bt.fv[i2]) {
                    this.cu = bt.c(this.e.l, i2);
                    return;
                }
                i2++;
            }
        }
    }

    private void aP(int i2) {
        if (i2 == 1 || i2 == 514) {
            if (this.dg != null) {
                ca.g = ca.g + (-1) >= 0 ? ca.g - 1 : this.dg.length - 1;
                return;
            }
            return;
        }
        if (i2 == 4 || i2 == 520) {
            if (this.dg != null) {
                ca.g = ca.g + 1 < this.dg.length ? ca.g + 1 : 0;
            }
        } else {
            if (i2 == 268435456 || i2 == 1073741824 || i2 == 517) {
                if (ca.g == 0) {
                    this.e.b("游客注册 第1步: ", "修改角色昵称");
                }
                K = null;
                this.k = (short) 0;
                this.j = (short) 0;
                return;
            }
            if (i2 == 536870912) {
                K = null;
                this.k = (short) 0;
                this.j = (short) 0;
            }
        }
    }

    private void aQ() {
        if (this.j == 28) {
            d(false);
            return;
        }
        this.cA = 0;
        this.cB = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 2, 4);
        this.cC = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 2, 4);
        this.e.k();
        d(true);
        this.e.aq.j();
        this.e.aq.a("游戏设置");
        this.e.ar.a((Image[]) null, this.al, (String[]) null, this.am);
        this.e.aq.a(this.e.ar);
        this.e.aq.a(t.f, t.g, t.d, t.e);
        this.e.j = this.e.k;
        this.k = (short) 28;
        this.j = (short) 28;
    }

    private void aQ(int i2) {
        if (this.l == 0) {
            if (this.e.aq != null) {
                this.e.aq.b(i2);
            }
            if (i2 == 268435456 || i2 == 517 || i2 == 1073741824) {
                if (bt.mq == 1) {
                    a(bt.mq, (byte) this.e.ar.g(), (byte) -1, (byte) -1);
                    return;
                } else if (bt.mq == 2) {
                    a(bt.mq, bt.ms, (byte) this.e.ar.g(), (byte) -1);
                    return;
                } else {
                    if (bt.mq == 3) {
                        a(bt.mq, bt.ms, bt.mt, (byte) this.e.ar.g());
                        return;
                    }
                    return;
                }
            }
            if (i2 == 1 || i2 == 514 || i2 == 520 || i2 == 4) {
                this.e.at.a(bt.mv == null ? null : bt.mv[this.e.ar.g()], t.i, (byte) 1);
                this.e.at.a((byte) 1);
                return;
            }
            if (i2 == 536870912) {
                if (bt.mq == 1) {
                    bt.S();
                    bt.R();
                    this.l = (short) 0;
                    this.k = (short) 0;
                    this.j = (short) 0;
                    return;
                }
                if (bt.mq == 2) {
                    a((byte) (bt.mq - 2), bt.ms, (byte) -1, (byte) -1);
                } else if (bt.mq == 3) {
                    a((byte) (bt.mq - 2), bt.ms, bt.mt, (byte) -1);
                }
            }
        }
    }

    private void aR() {
        if (this.k == 18) {
            aL();
            aJ();
        }
    }

    private void aR(int i2) {
        if (this.l == 0) {
            this.e.aq.b(i2);
            if (i2 != 268435456 && i2 != 1073741824) {
                if (i2 == 536870912) {
                    N();
                    return;
                }
                return;
            }
            ca.h = 0;
            this.l = (short) 2;
            if (this.k == 108) {
                this.l = (short) 1;
                this.e.aq.j();
                this.e.aq.a("开通超Q");
                this.e.aq.a(false);
                this.e.ar.a(new String[]{"中国移动", "中国联通"}, null, null);
                this.e.at.b(t.ah[0], t.i, (byte) 2);
                this.e.au.a(new String[]{"开通", "取消"});
                this.e.aq.a(this.e.ar);
                this.e.aq.a(this.e.at);
                this.e.aq.a(this.e.au);
                this.e.aq.a(t.f, t.g, t.d, t.e);
                return;
            }
            return;
        }
        if (this.l == 1) {
            this.e.aq.b(i2);
            if (i2 == 268435456 || i2 == 1073741824) {
                ca.h = 0;
                this.l = (short) (this.e.ar.g() != 0 ? 3 : 2);
                return;
            } else if (i2 == 1 || i2 == 4) {
                this.e.at.b(t.ah[this.e.ar.g()], t.i, (byte) 2);
                return;
            } else {
                if (i2 == 536870912) {
                    N();
                    return;
                }
                return;
            }
        }
        if (this.l == 2) {
            if (i2 == 268435456 || i2 == 1073741824) {
                this.e.c(this.k == 108 ? bt.aE : bt.aK, this.k == 108 ? bt.aF : bt.aL);
                N();
                return;
            } else {
                if (i2 == 536870912) {
                    this.l = (short) (this.k == 108 ? 1 : 0);
                    return;
                }
                return;
            }
        }
        if (this.l == 3) {
            if (i2 == 268435456 || i2 == 1073741824) {
                this.e.c(bt.aG);
            } else if (i2 == 536870912) {
                this.l = (short) 1;
            }
        }
    }

    private void aS() {
        byte[] bArrA = bz.a((short) 4140, bt.ad, bt.gQ);
        if (bArrA == null) {
            this.e.b("获取上传指令数据错误!");
            return;
        }
        a.i.a(new w((short) 4140, bArrA));
        this.e.a((String) null);
    }

    private void aS(int i2) {
        this.e.aq.b(i2);
        if (i2 != 268435456 && i2 != 1073741824) {
            if (i2 == 536870912) {
                if (this.l != 0) {
                    this.l = (short) (this.l - 1);
                    return;
                } else {
                    av();
                    c(8);
                    return;
                }
            }
            return;
        }
        switch (this.l) {
            case 0:
                this.l = (short) 1;
                ca.a(this.e.aq.a + (this.e.aq.c / 2), this.e.aq.b + 45 + (this.bQ / 2), new String[]{"领取"}, false);
                break;
            case 1:
                byte[] bArrX = bz.x((short) 4658, bt.ad);
                if (bArrX == null) {
                    this.e.b("获取上传指令数据错误!");
                    break;
                } else {
                    a.i.a(new w((short) 4658, bArrX));
                    this.e.a((String) null);
                    break;
                }
        }
    }

    private void aT() {
        aU();
        T();
        if (a.ad == null) {
            bu buVar = new bu("/", "skill");
            a.ad = buVar;
            buVar.d();
        }
        if (ab == null) {
            ab = a.ad.b("27");
        }
        if (aa == null) {
            aa = a.ad.b("quit");
        }
        if (ac == null) {
            ac = a.ad.b("dead");
        }
        if (ad == null) {
            ad = a.ad.b("dead2");
        }
        if (ae == null) {
            ae = a.ad.b("defence");
        }
        c(bt.cb);
        c(bt.cx);
        c(bt.fs);
        c(bt.fl);
        aW();
        c(bt.dB);
        a(bt.en);
        a(bt.et);
        a(bt.cX);
        if (Z == null) {
            Z = a.ag.a("fightmenu");
        }
        if (bt.N != null) {
            for (int i2 = 0; i2 < bt.N.length; i2++) {
                if (bt.N[i2] != null) {
                    if (bt.N[i2].b == 1) {
                        c(bt.N[i2].j, bt.N[i2].r, bt.N[i2].s, bt.N[i2].t);
                    } else if (bt.N[i2].b == 2) {
                        b(bt.N[i2].j, bt.N[i2].r, bt.N[i2].s, bt.N[i2].t);
                    }
                }
            }
        } else if (bt.J != null) {
            for (int i3 = 0; i3 < bt.J.length; i3++) {
                if (bt.J[i3] != null) {
                    if (bt.J[i3].b == 0) {
                        a(bt.J[i3].i, bt.J[i3].a(), (byte) 1);
                    } else if (bt.J[i3].b == 2) {
                        b(bt.J[i3].i, bt.J[i3].p, bt.J[i3].q, bt.J[i3].r);
                    } else if (bt.J[i3].b == 1) {
                        c(bt.J[i3].i, bt.J[i3].p, bt.J[i3].q, bt.J[i3].r);
                    }
                }
            }
        }
        if (bt.I != null) {
            for (int i4 = 0; i4 < bt.I.length; i4++) {
                if (bt.I[i4] != null) {
                    if (bt.I[i4].b == 0) {
                        a(bt.I[i4].i, bt.I[i4].a(), (byte) 0);
                    } else if (bt.I[i4].b == 2) {
                        b(bt.I[i4].i, bt.I[i4].p, bt.I[i4].q, bt.I[i4].r);
                    }
                }
            }
        }
        a.ab.a(this.cN);
        a.ah.a(this.cO, this.cP[0], this.cP[1], this.cP[2]);
        a.ah.a(this.cQ, this.cR[0], this.cR[1], this.cR[2]);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009c A[LOOP:2: B:40:0x009c->B:45:0x00aa, LOOP_START, PHI: r2
      0x009c: PHI (r2v1 int) = (r2v0 int), (r2v3 int) binds: [B:39:0x009a, B:45:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void aT(int r9) {
        /*
            r8 = this;
            r1 = 3
            r3 = 1
            r4 = -1
            r7 = 0
            r2 = 0
            com.yinhan.kjava.main.a r0 = r8.e
            y r0 = r0.av
            if (r0 == 0) goto L12
            com.yinhan.kjava.main.a r0 = r8.e
            y r0 = r0.av
            r0.a(r9)
        L12:
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            if (r9 != r0) goto L43
            short r2 = r8.j
            short r0 = r8.j
            r5 = 76
            if (r0 != r5) goto L3f
            com.yinhan.kjava.main.a r0 = r8.e
            c r0 = r0.ar
            int r0 = r0.g()
            r8.d(r3)
            com.yinhan.kjava.main.a r3 = r8.e
            c r3 = r3.ar
            r3.a(r0)
        L30:
            cd r0 = defpackage.bt.Q
            short r3 = r0.a
            cd r0 = defpackage.bt.Q
            java.lang.String r5 = r0.b
            r0 = r8
            r0.a(r1, r2, r3, r4, r5)
            defpackage.bt.Q = r7
        L3e:
            return
        L3f:
            r8.N()
            goto L30
        L43:
            cd r0 = defpackage.bt.Q
            java.lang.String[] r0 = r0.i
            if (r0 != 0) goto L4c
            defpackage.bt.Q = r7
            goto L3e
        L4c:
            cd r5 = defpackage.bt.Q
            int[] r0 = r5.j
            if (r0 == 0) goto L83
            r0 = r2
        L53:
            int[] r6 = r5.j
            int r6 = r6.length
            if (r0 >= r6) goto L83
            int[] r6 = r5.j
            r6 = r6[r0]
            if (r6 != r9) goto L80
            r0 = r2
        L5f:
            if (r0 == r4) goto L3e
            cd r2 = defpackage.bt.Q
            java.lang.String[] r2 = r2.i
            r2 = r2[r0]
            if (r2 == 0) goto L3e
            short r2 = r8.j
            cd r3 = defpackage.bt.Q
            short r3 = r3.a
            short r4 = (short) r0
            cd r0 = defpackage.bt.Q
            java.lang.String r5 = r0.b
            r0 = r8
            r0.a(r1, r2, r3, r4, r5)
            com.yinhan.kjava.main.a r0 = r8.e
            r0.a(r7)
            defpackage.bt.Q = r7
            goto L3e
        L80:
            int r0 = r0 + 1
            goto L53
        L83:
            int[] r0 = r5.k
            if (r0 == 0) goto L98
            r0 = r2
        L88:
            int[] r6 = r5.k
            int r6 = r6.length
            if (r0 >= r6) goto L98
            int[] r6 = r5.k
            r6 = r6[r0]
            if (r6 != r9) goto L95
            r0 = r3
            goto L5f
        L95:
            int r0 = r0 + 1
            goto L88
        L98:
            int[] r0 = r5.l
            if (r0 == 0) goto Lad
        L9c:
            int[] r0 = r5.l
            int r0 = r0.length
            if (r2 >= r0) goto Lad
            int[] r0 = r5.l
            r0 = r0[r2]
            if (r0 != r9) goto Laa
            r2 = 2
            r0 = r2
            goto L5f
        Laa:
            int r2 = r2 + 1
            goto L9c
        Lad:
            r0 = r4
            goto L5f
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ao.aT(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void aU() {
        /*
            r9 = this;
            r4 = 1
            r2 = 0
            r3 = r2
        L3:
            bu r0 = com.yinhan.kjava.main.a.ab
            java.util.Vector r0 = r0.a()
            int r0 = r0.size()
            if (r3 >= r0) goto L9e
            bu r0 = com.yinhan.kjava.main.a.ab
            java.util.Vector r0 = r0.a()
            java.lang.Object r0 = r0.elementAt(r3)
            cf r0 = (defpackage.cf) r0
            aa r1 = r0.p
            if (r1 == 0) goto La9
            byte r1 = r0.o
            r5 = 2
            if (r1 != r5) goto La9
            aa r1 = r0.p
            int r1 = r1.a
            byte r5 = defpackage.bt.ax
            byte r6 = defpackage.bt.aj
            byte r7 = defpackage.bt.ay
            boolean r1 = a(r1, r5, r6, r7)
            if (r1 != 0) goto La9
            aa r1 = r0.p
            int r5 = r1.a
            bl[] r1 = defpackage.bt.o
            if (r1 == 0) goto La2
            r1 = r2
        L3d:
            bl[] r6 = defpackage.bt.o
            int r6 = r6.length
            if (r1 >= r6) goto La2
            bl[] r6 = defpackage.bt.o
            r6 = r6[r1]
            if (r6 == 0) goto L9f
            bl[] r6 = defpackage.bt.o
            r6 = r6[r1]
            byte r6 = r6.c
            bl[] r7 = defpackage.bt.o
            r7 = r7[r1]
            byte r7 = r7.n
            bl[] r8 = defpackage.bt.o
            r8 = r8[r1]
            byte r8 = r8.o
            boolean r6 = a(r5, r6, r7, r8)
            if (r6 == 0) goto L9f
            r1 = r4
        L61:
            if (r1 != 0) goto La9
            aa r1 = r0.p
            int r5 = r1.a
            bp[] r1 = defpackage.bt.q
            if (r1 == 0) goto La7
            r1 = r2
        L6c:
            bp[] r6 = defpackage.bt.q
            int r6 = r6.length
            if (r1 >= r6) goto La7
            bp[] r6 = defpackage.bt.q
            r6 = r6[r1]
            if (r6 == 0) goto La4
            bp[] r6 = defpackage.bt.q
            r6 = r6[r1]
            byte r6 = r6.q
            bp[] r7 = defpackage.bt.q
            r7 = r7[r1]
            byte r7 = r7.p
            bp[] r8 = defpackage.bt.q
            r8 = r8[r1]
            byte r8 = r8.r
            boolean r6 = a(r5, r6, r7, r8)
            if (r6 == 0) goto La4
            r1 = r4
        L90:
            if (r1 != 0) goto La9
            r0.a()
            bu r0 = com.yinhan.kjava.main.a.ab
            java.util.Vector r0 = r0.a()
            r0.removeElementAt(r2)
        L9e:
            return
        L9f:
            int r1 = r1 + 1
            goto L3d
        La2:
            r1 = r2
            goto L61
        La4:
            int r1 = r1 + 1
            goto L6c
        La7:
            r1 = r2
            goto L90
        La9:
            int r0 = r3 + 1
            r3 = r0
            goto L3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ao.aU():void");
    }

    private void aU(int i2) {
        if (this.P != null) {
            this.P.a(i2);
        }
        if (this.l == 0 && this.k == 0) {
            this.P = null;
        }
    }

    private void aV() {
        if (bt.bC.size() <= 0 || !bt.bD) {
            return;
        }
        this.bj.removeAllElements();
        for (int i2 = 0; i2 < bt.bC.size(); i2++) {
            this.bT = (bn) bt.bC.elementAt(i2);
            if (this.bT != null && this.bT.i >= 1000) {
                this.bj.addElement(String.valueOf((int) this.bT.i));
            }
        }
        a.af.b(this.bj, (short[]) null, (short[]) null, (short[]) null);
        this.bj.removeAllElements();
        bt.bD = false;
    }

    private void aV(int i2) {
        if (this.Q != null) {
            this.Q.a(i2);
        }
        if (this.l == 0 && this.k == 0) {
            this.Q = null;
        }
    }

    private static void aW() {
        if (a.af.b() <= 70 || bt.bC.size() <= 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bt.bC.size()) {
                return;
            }
            bn bnVar = (bn) bt.bC.elementAt(i3);
            if (bnVar != null && bnVar.i != -1) {
                int iA = bu.a(String.valueOf((int) bnVar.i).toCharArray());
                if (a.af.b(iA)) {
                    a.af.a(iA);
                }
                if (a.af.b() <= 70) {
                    return;
                }
            }
            i2 = i3 + 1;
        }
    }

    private void aW(int i2) {
        if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
            if (i2 == 536870912) {
                this.k = this.j;
                this.l = (short) 0;
                this.m = (short) 0;
                ca.h = 0;
                return;
            }
            return;
        }
        byte[] bArrD = bz.D((short) 4369, bt.ad);
        if (bArrD != null) {
            a.i.a(new w((short) 4369, bArrD));
        }
        this.k = this.j;
        this.l = (short) 0;
        this.m = (short) 0;
        ca.h = 0;
    }

    private void aX() {
        byte[] bArrT = bz.t((short) 4248, bt.ad);
        if (bArrT == null) {
            this.e.b("获取上传指令数据错误!");
        } else {
            a.i.a(new w((short) 4248, bArrT));
            this.e.a((String) null);
        }
    }

    private void aX(int i2) {
        if ((bt.eL.length > 0 && i2 == 536870912) || (bt.eL.length <= 0 && (i2 == 536870912 || i2 == 268435456 || i2 == 517 || i2 == 1073741824))) {
            this.k = this.j;
            this.l = (short) 0;
            this.m = (short) 0;
            ca.g = 0;
            ca.h = 0;
        }
        if (i2 == 8 || i2 == 516) {
            ca.e = ca.e - ca.d >= 0 ? ca.e - ca.d : 0;
        } else if (i2 == 2 || i2 == 518) {
            ca.e = ca.e + ca.d < K.a() ? ca.e + ca.d : ca.e;
        }
        if (bt.eL.length <= 0) {
            return;
        }
        if (i2 == 1 || i2 == 514) {
            if (bt.eL != null) {
                ca.g = ca.g + (-1) >= 0 ? ca.g - 1 : bt.eL.length - 1;
                return;
            }
            return;
        }
        if (i2 == 4 || i2 == 520) {
            if (bt.eL != null) {
                ca.g = ca.g + 1 < bt.eL.length ? ca.g + 1 : 0;
            }
        } else if (i2 == 268435456 || i2 == 1073741824 || i2 == 517) {
            byte[] bArrC = bz.c((short) 4370, (byte) ca.g, bt.ad);
            if (bArrC != null) {
                a.i.a(new w((short) 4370, bArrC));
                this.e.a((String) null);
            } else {
                this.e.b("获取上传指令数据错误!");
            }
            ca.g = 0;
        }
    }

    private String aY() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.j == 59) {
            if (bt.jT == null || bt.jT.length <= 0) {
                return null;
            }
            for (int i2 = 0; i2 < bt.jT.length; i2++) {
                for (String str : ca.a(new StringBuffer().append("<").append(bt.jS[i2]).append(">以").append(t.a(this.e.l, bt.jU[i2])).append("购买了您的").append(bt.jT[i2]).toString(), t.i, 155, "\t")) {
                    stringBuffer.append(str);
                    stringBuffer.append('\t');
                }
            }
        } else {
            if (bt.jW == null || bt.jW.length <= 0) {
                return null;
            }
            for (int i3 = 0; i3 < bt.jW.length; i3++) {
                for (String str2 : ca.a(new StringBuffer().append("<").append(bt.jV[i3]).append(">以").append(t.a(this.e.l, bt.jX[i3])).append("购买了您的").append(bt.jW[i3]).toString(), t.i, 160, "\t")) {
                    stringBuffer.append(str2);
                    stringBuffer.append('\t');
                }
            }
        }
        return stringBuffer.toString();
    }

    private void aY(int i2) {
        if (this.l == 0) {
            if (bt.mx != -1 && this.aI != null) {
                ai.a(this.aI, this.e.ak);
            }
            if (bt.mD != -1 && this.bd != null) {
                ai.a(this.bd, this.e.ak);
            }
            this.e.at.b(i2);
            if (i2 == 2) {
                if (this.be == 0 && this.bf == 0) {
                    this.be = 1;
                    ca.l = 0;
                    ak();
                } else if (this.be == 1) {
                    this.be = 0;
                    this.bf = 1;
                    ca.l = 0;
                    ak();
                }
            } else if (i2 == 8) {
                if (this.be == 0 && this.bf == 1) {
                    this.be = 1;
                    this.bf = 0;
                    ca.l = 0;
                    ak();
                } else if (this.be == 1) {
                    this.be = 0;
                    this.bf = 0;
                    ca.l = 0;
                    ak();
                }
            } else if (i2 == 268435456 || i2 == 1073741824) {
                if (this.be == 0) {
                    if (this.bf == 0) {
                        if (bt.mx != -1) {
                            ca.a(t.b / 2, t.c / 2, new String[]{"升星", "取出"}, true);
                            this.l = (short) 1;
                        } else if (bt.fw == null || bt.fw.length <= 0) {
                            this.e.b("您没有宠物可选择");
                        } else {
                            j(10);
                        }
                    } else if (this.bf == 1) {
                        if (bt.mD != -1) {
                            ca.a(t.b / 2, t.c / 2, new String[]{"取出"}, true);
                            this.l = (short) 1;
                        } else if (bt.mx == -1) {
                            this.e.b("请先放入要升星的宠物");
                        } else if (bt.fw == null || bt.fw.length <= 0) {
                            this.e.b("您没有宠物可选择");
                        } else {
                            j(10);
                        }
                    }
                } else if (this.be == 1) {
                    if (bt.mJ[this.bf] != -1) {
                        ca.a(t.b / 2, t.c / 2, new String[]{"取出"}, true);
                        this.l = (short) 1;
                    } else if (bt.mx != -1) {
                        e(20);
                    } else {
                        this.e.b("请先放入要升星的宠物");
                    }
                }
            }
            if (i2 == 536870912) {
                this.dh = null;
                if (this.aI != null) {
                    this.aI = null;
                }
                if (this.bd != null) {
                    this.bd = null;
                }
                bt.U();
                l();
                c(4);
            }
        } else if (this.l == 1) {
            ca.b(i2);
            if (i2 == 536870912) {
                this.l = (short) 0;
            } else if (i2 == 268435456 || i2 == 1073741824) {
                if (ca.o == 0) {
                    if (this.be == 0 && this.bf == 1) {
                        c(0, (byte) 1);
                    } else if (this.be == 0 && this.bf == 0) {
                        byte[] bArrA = bz.a((byte) 6, bt.mx, bt.mD, bt.mJ, -1, (byte) this.bf);
                        if (bArrA != null) {
                            a.i.a(new w((short) 4681, bArrA));
                            this.e.a((String) null);
                        } else {
                            this.e.b("获取上传指令数据错误!");
                        }
                    } else if (this.be == 1) {
                        b(0, (byte) 1);
                    }
                } else if (ca.o == 1) {
                    c(0, (byte) 1);
                }
            }
        }
        this.e.a = 0;
    }

    private void aZ() {
        byte[] bArrC = bz.C((short) 4680, bt.ad);
        if (bArrC == null) {
            this.e.b("获取上传指令数据错误!");
            return;
        }
        a.i.a(new w((short) 4680, bArrC));
        this.e.a((String) null);
    }

    private void aZ(int i2) {
        if (this.l != 0) {
            if (this.l == 1) {
                if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                    if (i2 == 536870912) {
                        this.l = (short) 0;
                        return;
                    }
                    return;
                } else {
                    if (ca.o == 0) {
                        if (this.e.ar.g() < 5) {
                            if (bt.gh[this.bg] == null || bt.gh[this.bg][this.e.ar.g() - 1] == null) {
                                e(21);
                                return;
                            } else {
                                a((byte) 1, bt.fA[this.bg], bt.gg[this.bg][this.e.ar.g() - 1], (byte) 34, bt.gj[this.bg][this.e.ar.g() - 1]);
                                return;
                            }
                        }
                        if (bt.gl[this.bg] == null || bt.gl[this.bg][this.e.ar.g() - 6] == null) {
                            e(22);
                            return;
                        } else {
                            a((byte) 1, bt.fA[this.bg], bt.gk[this.bg][this.e.ar.g() - 6], (byte) 35, bt.gn[this.bg][this.e.ar.g() - 6]);
                            return;
                        }
                    }
                    return;
                }
            }
            return;
        }
        this.e.aq.b(i2);
        if (i2 == 268435456 || i2 == 1073741824 || i2 == 517) {
            if (this.e.ar.g() == 0 || this.e.ar.g() == 5) {
                return;
            }
            if (this.e.ar.g() < 5) {
                if (bt.gh[this.bg] == null || bt.gh[this.bg][this.e.ar.g() - 1] == null) {
                    ca.a(t.b >> 1, t.c >> 1, new String[]{"嵌入"}, true);
                    this.l = (short) 1;
                    return;
                } else {
                    ca.a(t.b >> 1, t.c >> 1, new String[]{"挖出"}, true);
                    this.l = (short) 1;
                    return;
                }
            }
            if (bt.gl[this.bg] == null || bt.gl[this.bg][this.e.ar.g() - 6] == null) {
                ca.a(t.b >> 1, t.c >> 1, new String[]{"嵌入"}, true);
                this.l = (short) 1;
                return;
            } else {
                ca.a(t.b >> 1, t.c >> 1, new String[]{"挖出"}, true);
                this.l = (short) 1;
                return;
            }
        }
        if (i2 == 536870912) {
            this.bh = false;
            this.bg = 0;
            j(0);
            return;
        }
        if (i2 == 1 || i2 == 4 || i2 == 514 || i2 == 520) {
            if (this.e.ar.g() == 0 || this.e.ar.g() == 5) {
                this.e.at.a("", t.i, (byte) 2);
                this.e.at.a((byte) 1);
                return;
            }
            if (this.e.ar.g() < 5) {
                if (bt.gh[this.bg] == null || bt.gh[this.bg][this.e.ar.g() - 1] == null) {
                    this.e.at.a("可以嵌入符文", t.i, (byte) 2);
                    this.e.at.a((byte) 1);
                    return;
                } else {
                    this.e.at.a(bt.gi[this.bg][this.e.ar.g() - 1], t.i, (byte) 2);
                    this.e.at.a((byte) 1);
                    return;
                }
            }
            if (bt.gl[this.bg] == null || bt.gl[this.bg][this.e.ar.g() - 6] == null) {
                this.e.at.a("可以嵌入符文", t.i, (byte) 2);
                this.e.at.a((byte) 1);
            } else {
                this.e.at.a(bt.gm[this.bg][this.e.ar.g() - 6], t.i, (byte) 2);
                this.e.at.a((byte) 1);
            }
        }
    }

    private void aa(int i2) {
        int i3;
        int i4;
        int i5 = 7;
        int i6 = 0;
        if (this.l != 0) {
            if (this.l == 2) {
                b(i2);
                if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                    if (i2 == 536870912) {
                        this.l = (short) 0;
                        return;
                    }
                    return;
                } else {
                    this.aE = this.aq;
                    this.aG = this.ar;
                    if (y((this.ar << 3) + this.aq).r != 0) {
                        this.e.a("重要物品输入OK卖出", 0);
                        return;
                    } else {
                        m(this.ag);
                        return;
                    }
                }
            }
            return;
        }
        aV();
        if (this.e.aq != null) {
            this.e.aq.b(i2);
        }
        if (i2 == 268435456 || i2 == 1073741824 || i2 == 517) {
            bn bnVarY = y((this.ar << 3) + this.aq);
            if (bnVarY == null || bnVarY.a <= 0 || A((this.ar << 3) + this.aq) == null) {
                return;
            }
            if (bnVarY.g > 1) {
                a(bnVarY.g);
                this.l = (short) 2;
                return;
            }
            this.aE = this.aq;
            this.aG = this.ar;
            if (bnVarY.r == 0) {
                m(1);
                return;
            } else {
                this.e.a("重要物品输入OK卖出", 0);
                this.ag = 1;
                return;
            }
        }
        if (i2 == 536870912) {
            this.al = null;
            m();
            return;
        }
        if (i2 == 1024 || i2 == 2048) {
            q();
            return;
        }
        if (i2 == 8 || i2 == 516) {
            if (this.aq > 0) {
                i5 = this.aq - 1;
                this.aq = i5;
            }
            this.aq = i5;
            s();
            return;
        }
        if (i2 == 2 || i2 == 518) {
            if (this.aq >= 7) {
                i3 = 0;
            } else {
                i3 = this.aq + 1;
                this.aq = i3;
            }
            this.aq = i3;
            s();
            return;
        }
        if (i2 == 1 || i2 == 514) {
            if (this.ar <= 0) {
                i4 = 3;
            } else {
                i4 = this.ar - 1;
                this.ar = i4;
            }
            this.ar = i4;
            s();
            return;
        }
        if (i2 == 4 || i2 == 520) {
            if (this.ar < 3) {
                i6 = this.ar + 1;
                this.ar = i6;
            }
            this.ar = i6;
            s();
        }
    }

    private void ab(int i2) {
        int i3;
        int i4;
        int i5 = 0;
        if (bt.cx == null || bt.ct.length <= 0) {
            if (bt.cx != null) {
                bt.m();
            }
            m();
            this.aq = 0;
            if (this.as == 0) {
                this.an = new String[]{"取出物品", "存入物品"};
                K = new bw(new StringBuffer().append(bt.t[this.af].b).append(":物品仓库已打开").toString(), (short) (t.b - 20));
                ca.a(a.F, K, this.an, (String[]) null, true);
                this.l = (short) 3;
            } else if (this.as == 1) {
                this.an = new String[]{"拍卖物品", "拍卖场", "拍卖场仓库"};
                K = new bw(new StringBuffer().append(bt.t[this.af].b).append(":物品仓库已打开").toString(), (short) (t.b - 20));
                ca.a(a.F, K, this.an, (String[]) null, true);
            }
        }
        if (this.l != 0) {
            if (this.l == 2) {
                b(i2);
                if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                    if (i2 == 536870912) {
                        this.l = (short) 0;
                        return;
                    }
                    return;
                } else if (bt.ct == null || bt.cw[(this.e.as.a << 5) + (this.ar << 3) + this.aq] <= 0) {
                    this.l = (short) 0;
                    return;
                } else if (this.as == 0) {
                    ac(this.ag);
                    return;
                } else {
                    if (this.as == 1) {
                        ad(bt.ct[(this.e.as.a << 5) + (this.ar << 3) + this.aq]);
                        return;
                    }
                    return;
                }
            }
            if (this.l == 4) {
                ca.b(i2);
                if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                    if (i2 == 536870912) {
                        this.l = (short) 0;
                        return;
                    }
                    return;
                }
                if (ca.o == 0) {
                    this.aH = this.e.as.a;
                    bt.c((this.e.as.a << 5) + (this.ar << 3) + this.aq);
                    this.O.a(0, this.k, this.as);
                    return;
                } else {
                    if (ca.o == 1) {
                        if (bt.cw[(this.e.as.a << 5) + (this.ar << 3) + this.aq] > 1) {
                            a(bt.cw[(this.e.as.a << 5) + (this.ar << 3) + this.aq]);
                            this.l = (short) 2;
                            return;
                        } else if (bt.ct == null || bt.cw[(this.e.as.a << 5) + (this.ar << 3) + this.aq] <= 0) {
                            this.l = (short) 0;
                            return;
                        } else {
                            if (this.as == 0) {
                                ac(1);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
            }
            return;
        }
        a(bt.cx);
        if (this.e.aq != null) {
            this.e.aq.b(i2);
        }
        if (i2 == 1024 || i2 == 2048) {
            G();
        }
        if (i2 == 268435456 || i2 == 1073741824 || i2 == 517) {
            if (bt.ct == null || (this.e.as.a << 5) + (this.ar << 3) + this.aq >= bt.ct.length) {
                return;
            }
            if (this.as != 0) {
                if (this.as == 1) {
                    if (bt.ct == null || bt.cw[(this.e.as.a << 5) + (this.ar << 3) + this.aq] <= 0) {
                        this.l = (short) 0;
                        return;
                    } else {
                        ad(bt.ct[(this.e.as.a << 5) + (this.ar << 3) + this.aq]);
                        return;
                    }
                }
                return;
            }
            if (bt.a(bt.cv[(this.e.as.a << 5) + (this.ar << 3) + this.aq])) {
                ca.a((this.aq * 17) + 3 + 8 + o, (t.j * 2) + 13 + (this.ar * 17) + 17 + p, new String[]{"查看", "取出"}, false);
                this.l = (short) 4;
                return;
            }
            if (bt.cw[(this.e.as.a << 5) + (this.ar << 3) + this.aq] > 1) {
                a(bt.cw[(this.e.as.a << 5) + (this.ar << 3) + this.aq]);
                this.l = (short) 2;
                return;
            } else if (bt.ct == null || bt.cw[(this.e.as.a << 5) + (this.ar << 3) + this.aq] <= 0) {
                this.l = (short) 0;
                return;
            } else {
                if (this.as == 0) {
                    ac(1);
                    return;
                }
                return;
            }
        }
        if (i2 == 536870912) {
            m();
            this.aF = 0;
            this.aG = 0;
            this.aH = (byte) 0;
            if (this.as == 0) {
                this.an = new String[]{"取出物品", "存入物品"};
                K = new bw(new StringBuffer().append(bt.t[this.af].b).append(":物品仓库已打开").toString(), (short) (t.b - 20));
                ca.a(a.F, K, this.an, (String[]) null, true);
                this.l = (short) 3;
                return;
            }
            if (this.as == 1) {
                this.an = new String[]{"拍卖物品", "拍卖场", "拍卖场仓库"};
                K = new bw(new StringBuffer().append(bt.t[this.af].b).append(":物品仓库已打开").toString(), (short) (t.b - 20));
                ca.a(a.F, K, this.an, (String[]) null, true);
                return;
            }
            return;
        }
        if (i2 == 8 || i2 == 516) {
            if (this.aq <= 0) {
                i3 = 7;
            } else {
                i3 = this.aq - 1;
                this.aq = i3;
            }
            this.aq = i3;
            G();
            return;
        }
        if (i2 == 2 || i2 == 518) {
            if (this.aq < 7) {
                i5 = this.aq + 1;
                this.aq = i5;
            }
            this.aq = i5;
            G();
            return;
        }
        if (i2 == 1 || i2 == 514) {
            if (this.ar <= 0) {
                i4 = 3;
            } else {
                i4 = this.ar - 1;
                this.ar = i4;
            }
            this.ar = i4;
            G();
            return;
        }
        if (i2 == 4 || i2 == 520) {
            if (this.ar < 3) {
                i5 = this.ar + 1;
                this.ar = i5;
            }
            this.ar = i5;
            G();
        }
    }

    private void ac(int i2) {
        byte[] bArrF = bz.f((short) 4158, bt.ad, bt.ct[(this.e.as.a << 5) + (this.ar << 3) + this.aq], i2);
        if (bArrF == null) {
            this.e.b("获取上传指令数据错误!");
            return;
        }
        a.i.a(new w((short) 4158, bArrF));
        this.e.a((String) null);
    }

    private void ad(int i2) {
        byte[] bArrP = bz.p((short) 4155, bt.ad, i2);
        if (bArrP == null) {
            this.e.b("获取上传指令数据错误!");
            return;
        }
        a.i.a(new w((short) 4155, bArrP));
        this.e.a((String) null);
    }

    private void ae(int i2) {
        if (this.e.aq != null) {
            this.e.aq.b(i2);
        }
        if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
            if (i2 == 536870912) {
                this.al = null;
                m();
                this.e.ar.a(this.ai);
                return;
            }
            return;
        }
        this.aU = this.e.ar.g();
        if (this.e.ar.g() == 0) {
            this.e.e("物品关键字搜索");
            return;
        }
        this.aK = "";
        this.aL = t.P[this.aU - 1];
        this.aM = 1;
        this.aN = 0;
        a(this.aK, this.aL, this.aM, this.aN);
        this.e.a((String) null);
    }

    private String af(int i2) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(bt.dZ[i2]);
        stringBuffer.append(new StringBuffer().append("X").append((int) bt.eb[i2]).toString());
        stringBuffer.append("（");
        t.a(this.e.l, bt.eg[i2]);
        stringBuffer.append(new StringBuffer().append(this.e.l.toString()).append("）").toString());
        stringBuffer.append('\t');
        if (bt.ed[i2] != null && bt.ed[i2].length() > 0) {
            stringBuffer.append(bt.ed[i2]);
            stringBuffer.append('\t');
        }
        if (bt.ee[i2] != null && bt.ee[i2].length() > 0) {
            stringBuffer.append(bt.ee[i2]);
            stringBuffer.append('\t');
        }
        if (bt.ef[i2] > 0) {
            stringBuffer.append("等级:");
            stringBuffer.append((int) bt.ef[i2]);
            stringBuffer.append('\t');
        }
        if (bt.eh[i2] != null) {
            stringBuffer.append(bt.eh[i2]);
            stringBuffer.append('\t');
        }
        return stringBuffer.toString();
    }

    private void ag(int i2) {
        if (bt.dY == null) {
            this.am = null;
            this.al = null;
            this.e.j = this.e.k;
            N();
            return;
        }
        if (this.l == 0) {
            this.e.aq.b(i2);
            if (i2 == 1 || i2 == 4 || i2 == 514 || i2 == 520) {
                this.e.ar.a(af(this.e.ar.g()), 1);
            } else {
                if (i2 == 8 || i2 == 2 || i2 == 516 || i2 == 518) {
                    this.aV = this.e.as.a;
                    this.aL = this.aL.equals("") ? this.aL : t.P[this.aU - 1];
                    this.aM = 1;
                } else if (i2 == 1024) {
                    this.aV = this.e.as.a;
                    this.aL = this.aL.equals("") ? this.aL : t.P[this.aU - 1];
                    this.aM--;
                    if (this.aM < 1) {
                        this.aM = 1;
                        return;
                    } else {
                        this.aN = this.e.as.a;
                        a(this.aK, this.aL, this.aM, this.aN);
                        this.e.a((String) null);
                    }
                } else if (i2 == 2048) {
                    this.aV = this.e.as.a;
                    this.aL = this.aL.equals("") ? this.aL : t.P[this.aU - 1];
                    if (bt.ei != 1) {
                        return;
                    } else {
                        this.aM++;
                    }
                }
                this.aN = this.e.as.a;
                a(this.aK, this.aL, this.aM, this.aN);
                this.e.a((String) null);
            }
            if (i2 == 268435456 || i2 == 1073741824 || i2 == 517) {
                ca.a(o + 50, (t.j * 2) + 15 + p + (this.e.ar.i() * t.j), bt.a(bt.ea[this.e.ar.g()]) ? new String[]{"查看", "购买"} : new String[]{"购买"}, false);
                this.l = (short) 1;
                return;
            } else {
                if (i2 == 536870912) {
                    H();
                    this.e.ar.a(this.aU);
                    aH();
                    return;
                }
                return;
            }
        }
        if (this.l == 1) {
            ca.b(i2);
            if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                if (i2 == 536870912) {
                    this.l = (short) 0;
                    return;
                }
                return;
            }
            if (!bt.a(bt.ea[this.e.ar.g()])) {
                if (ca.o == 0) {
                    this.ag = 1;
                    this.l = (short) 3;
                    ca.h = 0;
                    return;
                }
                return;
            }
            if (ca.o == 0) {
                this.aq = this.e.ar.g();
                this.aA = this.e.ar.h();
                this.aH = this.e.as.a;
                bt.d(this.e.ar.g());
                this.O.a(0, this.k, this.as);
                return;
            }
            if (ca.o == 1) {
                this.ag = 1;
                ca.h = 0;
                this.l = (short) 3;
                return;
            }
            return;
        }
        if (this.l == 2) {
            b(i2);
            if (i2 == 268435456 || i2 == 1073741824 || i2 == 517) {
                this.l = (short) 4;
                ca.h = 0;
                return;
            } else {
                if (i2 == 536870912) {
                    this.l = (short) 0;
                    return;
                }
                return;
            }
        }
        if (this.l == 3 || this.l == 4) {
            if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                if (i2 == 536870912) {
                    this.l = (short) 0;
                    return;
                }
                return;
            }
            t.a(this.e.l);
            byte[] bArrL = bz.l((short) 4154, bt.ad, bt.dY[this.e.ar.g()]);
            if (bArrL == null) {
                this.e.b("获取上传指令数据错误!");
            } else {
                a.i.a(new w((short) 4154, bArrL));
                this.e.a((String) null);
            }
        }
    }

    private void ah(int i2) {
        this.e.aq.b(i2);
        if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
            if (i2 == 536870912) {
                this.al = null;
                m();
                ca.g = this.ai;
                return;
            }
            return;
        }
        this.aU = this.e.ar.g();
        if (this.e.ar.g() == 0) {
            this.e.e("宠物关键字搜索");
            return;
        }
        this.aK = "";
        this.aL = t.O[this.aU - 1];
        this.aM = 1;
        this.aN = 0;
        b(this.aK, this.aL, this.aM, this.aN);
        this.e.a((String) null);
    }

    private void ai(int i2) {
        if (bt.gs == null) {
            this.am = null;
            this.al = null;
            this.e.j = this.e.k;
            N();
            return;
        }
        if (this.l != 0) {
            if (this.l == 1) {
                ca.b(i2);
                if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                    if (i2 == 536870912) {
                        this.l = (short) 0;
                        return;
                    }
                    return;
                } else {
                    if (ca.o == 0) {
                        this.l = (short) 2;
                        ca.h = 0;
                        return;
                    }
                    return;
                }
            }
            if (this.l == 2) {
                if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                    if (i2 == 536870912) {
                        ca.a(o + 50, (t.j * 2) + 15 + p + (this.e.ar.i() * t.j), new String[]{"购买"}, false);
                        this.l = (short) 1;
                        return;
                    }
                    return;
                }
                byte[] bArrM = bz.m((short) 4149, bt.ad, bt.gs[this.e.ar.g()]);
                if (bArrM == null) {
                    this.e.b("获取上传指令数据错误!");
                    return;
                } else {
                    a.i.a(new w((short) 4149, bArrM));
                    this.e.a((String) null);
                    return;
                }
            }
            return;
        }
        this.e.aq.b(i2);
        if (bt.gA[this.e.ar.g()] != null && bt.gA[this.e.ar.g()].length > 0 && this.e.at.a == 0) {
            for (byte b2 = 0; b2 < bt.gA[this.e.ar.g()].length; b2 = (byte) (b2 + 1)) {
                a(bt.gA[this.e.ar.g()]);
            }
        }
        ai.a(this.aI, this.e.ak);
        if (i2 == 1 || i2 == 4 || i2 == 514 || i2 == 520) {
            this.e.at.a(bt.g(this.e.l, this.e.ar.g()), t.i, (byte) 2);
            this.e.at.a((byte) 1);
            a(bt.gw[this.e.ar.g()], bt.gx[this.e.ar.g()], bt.gy[this.e.ar.g()], bt.gz[this.e.ar.g()]);
            this.aI = a.ah.a(String.valueOf(new StringBuffer().append((int) bt.gw[this.e.ar.g()]).append("_0").toString()), bt.gx[this.e.ar.g()], bt.gy[this.e.ar.g()], bt.gz[this.e.ar.g()]);
            return;
        }
        if (i2 == 8 || i2 == 2 || i2 == 516 || i2 == 518) {
            this.aV = this.e.as.a;
            this.aL = this.aL.equals("") ? this.aL : t.O[this.aU - 1];
            this.aM = 1;
            this.aN = this.e.as.a;
            b(this.aK, this.aL, this.aM, this.aN);
            this.e.a((String) null);
            return;
        }
        if (i2 == 1024) {
            this.aV = this.e.as.a;
            this.aL = this.aL.equals("") ? this.aL : t.O[this.aU - 1];
            this.aM--;
            if (this.aM < 1) {
                this.aM = 1;
                return;
            }
            this.aN = this.e.as.a;
            b(this.aK, this.aL, this.aM, this.aN);
            this.e.a((String) null);
            return;
        }
        if (i2 == 2048) {
            this.aV = this.e.as.a;
            this.aL = this.aL.equals("") ? this.aL : t.O[this.aU - 1];
            if (bt.ei == 1) {
                this.aM++;
                this.aN = this.e.as.a;
                b(this.aK, this.aL, this.aM, this.aN);
                this.e.a((String) null);
                return;
            }
            return;
        }
        if (i2 == 268435456 || i2 == 1073741824 || i2 == 517) {
            ca.a(o + 50, (t.j * 2) + 15 + p + (this.e.ar.i() * t.j), new String[]{"购买"}, false);
            this.l = (short) 1;
        } else if (i2 == 536870912) {
            aI();
            this.e.ar.a(this.aU);
            aH();
        }
    }

    private void aj(int i2) {
        if (this.e.aC != null && this.e.g) {
            if (this.e.aE != null) {
                f((short) -1);
            } else if (this.e.as.a == 6 || this.aR) {
                a(this.cl, (byte) 4);
                this.e.n();
            } else if (this.e.as.a == 0) {
                a(this.cl, (byte) this.aT);
                this.e.n();
            } else if (this.e.as.a != 1) {
                if (this.e.as.a == 2) {
                    a(this.cl, (byte) 0);
                    this.e.n();
                } else if (this.e.as.a == 3) {
                    a(this.cl, (byte) 3);
                    this.e.n();
                } else if (this.e.as.a == 4) {
                    a(this.cl, (byte) 1);
                    this.e.n();
                } else if (this.e.as.a == 5) {
                    a(this.cl, (byte) 2);
                    this.e.n();
                }
            }
            this.l = (short) 1;
        }
        if (this.l == 0) {
            this.e.aq.b(i2);
            if (this.e.as.a != this.cp) {
                aL();
                aJ();
                this.cp = this.e.as.a;
            }
            if (this.e.aA > 40) {
                ca.a(this.e.b, 1, 1);
            } else {
                ca.a(i2, 1, 1);
                this.e.aA++;
            }
            this.cn = ca.w;
            this.co = ca.z;
            if (i2 != 1024) {
                if (i2 == 268435456 || i2 == 1073741824 || i2 == 517) {
                    g((short) 2);
                    return;
                }
                if (i2 == 536870912) {
                    if (this.c) {
                        a.f.a(this.f, h, i, false);
                        this.k = (short) 25;
                        this.j = (short) 25;
                    } else if (this.by == 1) {
                        N();
                        this.by = (byte) 0;
                    } else {
                        au();
                        c(1);
                    }
                    this.cl = null;
                    this.aQ = null;
                    aP.removeAllElements();
                    return;
                }
                return;
            }
            return;
        }
        if (this.l == 1) {
            this.e.aq.b(i2);
            if (this.e.as.a != this.cp) {
                aL();
                aJ();
                this.cp = this.e.as.a;
            }
            if (this.e.aA > 40) {
                ca.a(this.e.b, 1, 1);
            } else {
                ca.a(i2, 1, 1);
                this.e.aA++;
            }
            this.cn = ca.w;
            this.co = ca.z;
            if (i2 != 1024) {
                if (i2 == 268435456 || i2 == 1073741824 || i2 == 517) {
                    g((short) 3);
                    return;
                }
                if (i2 == 536870912) {
                    if (this.c) {
                        a.f.a(this.f, h, i, false);
                        this.k = (short) 25;
                        this.j = (short) 25;
                    } else if (this.by == 1) {
                        N();
                        this.by = (byte) 0;
                    } else {
                        au();
                        c(1);
                    }
                    aP.removeAllElements();
                    return;
                }
                return;
            }
            return;
        }
        if (this.l != 2 && this.l != 3) {
            if (this.l != 4) {
                if (this.l == 5) {
                    ca.b(i2);
                    if (i2 == 268435456 || i2 == 1073741824 || i2 == 517) {
                        a(ca.o != 0 ? (short) 1 : (short) 0, this.cl);
                        return;
                    } else {
                        if (i2 == 536870912) {
                            this.l = (short) 0;
                            return;
                        }
                        return;
                    }
                }
                if (this.l == 6) {
                    ca.b(i2);
                    if (i2 == 268435456 || i2 == 1073741824 || i2 == 517) {
                        e(this.cl);
                        return;
                    } else {
                        if (i2 == 536870912) {
                            this.l = (short) 0;
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            ca.b(i2);
            if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                if (i2 == 536870912) {
                    if (this.e.as.a == 5) {
                        if (this.c) {
                            ca.a(0, this.m == 2 ? 150 : 40, new String[]{"私聊", "好友", "黑名单"}, true);
                        } else {
                            ca.a(0, this.m == 2 ? 150 : 40, new String[]{"私聊", "好友", "黑名单", "组队", "交易"}, true);
                        }
                        ca.o = 2;
                    } else {
                        if (this.c) {
                            ca.a(0, this.m == 2 ? 150 : 40, new String[]{"私聊", "频道聊天", "好友", "黑名单"}, true);
                        } else {
                            ca.a(0, this.m == 2 ? 150 : 40, new String[]{"私聊", "频道聊天", "好友", "黑名单", "组队", "交易"}, true);
                        }
                        ca.o = 3;
                    }
                    this.l = this.m;
                    return;
                }
                return;
            }
            if (ca.o == 0) {
                b(this.cl);
                this.l = (short) 0;
                return;
            }
            if (ca.o == 1) {
                if (this.e.as.a == 5) {
                    if (this.c) {
                        ca.a(0, this.m == 2 ? 150 : 40, new String[]{"私聊", "好友", "黑名单"}, true);
                    } else {
                        ca.a(0, this.m == 2 ? 150 : 40, new String[]{"私聊", "好友", "黑名单", "组队", "交易"}, true);
                    }
                    ca.o = 2;
                } else {
                    if (this.c) {
                        ca.a(0, this.m == 2 ? 150 : 40, new String[]{"私聊", "频道聊天", "好友", "黑名单"}, true);
                    } else {
                        ca.a(0, this.m == 2 ? 150 : 40, new String[]{"私聊", "频道聊天", "好友", "黑名单", "组队", "交易"}, true);
                    }
                    ca.o = 3;
                }
                this.l = this.m;
                return;
            }
            return;
        }
        ca.b(i2);
        if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
            if (i2 == 536870912) {
                if (this.l == 2) {
                    this.l = (short) 0;
                    return;
                } else {
                    this.l = (short) 1;
                    return;
                }
            }
            return;
        }
        this.aR = false;
        if (this.cl == null || this.cl.equals("")) {
            return;
        }
        if (this.e.as.a == 6) {
            if (ca.o == 0) {
                this.aR = true;
                this.aS = this.cl;
                this.aT = 4;
                this.e.a("聊天", 0);
                return;
            }
            if (ca.o == 1) {
                a(this.cl);
                this.l = (short) 0;
                return;
            }
            if (ca.o == 2) {
                ca.a(0, this.l == 2 ? 150 : 40, new String[]{"确认", "取消"}, true);
                this.l = (short) 4;
                return;
            }
            if (ca.o != 3) {
                if (ca.o == 4) {
                    ca.a(ca.r + 65 + o, (t.j * 2) + 20 + (ca.w * t.j) + p, new String[]{"物品", "宠物"}, false);
                    this.l = (short) 6;
                    return;
                }
                return;
            }
            if (bt.bs != -1) {
                a(bt.s, this.cl);
                return;
            } else {
                ca.a(ca.r + 65 + o, (t.j * 2) + 20 + (ca.w * t.j) + p, new String[]{"跟随", "自由"}, false);
                this.l = (short) 5;
                return;
            }
        }
        if (ca.o == 0) {
            this.aR = true;
            this.aS = this.cl;
            this.aT = 4;
            this.e.a("聊天", 0);
            return;
        }
        if (ca.o == 1) {
            if (this.e.as.a != 1) {
                this.aS = this.cl;
                this.aT = this.cm == 4 ? (byte) 0 : this.cm;
                this.e.a("聊天", 0);
                return;
            } else if (this.e.as.a == 3) {
                this.e.a("聊天", 0);
                return;
            } else {
                if (this.e.as.a == 4) {
                    if (bt.bs == -1) {
                        this.e.b("不在队伍中");
                        return;
                    } else {
                        this.e.a("聊天", 0);
                        return;
                    }
                }
                return;
            }
        }
        if (ca.o == 2) {
            a(this.cl);
            this.l = (short) 1;
            return;
        }
        if (ca.o == 3) {
            ca.a(0, this.l == 2 ? 150 : 40, new String[]{"确认", "取消"}, true);
            this.l = (short) 4;
            return;
        }
        if (ca.o != 4) {
            if (ca.o == 5) {
                ca.a(ca.r + 65 + o, (t.j * 2) + 20 + (ca.w * t.j) + p, new String[]{"物品", "宠物"}, false);
                this.l = (short) 6;
                return;
            }
            return;
        }
        if (bt.bs != -1) {
            a(bt.s, this.cl);
        } else {
            ca.a(ca.r + 65 + o, (t.j * 2) + 20 + (ca.w * t.j) + p, new String[]{"跟随", "自由"}, false);
            this.l = (short) 5;
        }
    }

    private void ak(int i2) {
        if (this.e.aC != null && this.e.g && this.e.ar.g() - 1 >= 0) {
            a(bt.dK[this.e.ar.g() - 1], (byte) 4);
        }
        if (this.l == 0) {
            if (this.e.aq != null) {
                this.e.aq.b(i2);
            }
            if (i2 == 8 || i2 == 2 || i2 == 516 || i2 == 518) {
                if (this.e.as.a == 0) {
                    byte[] bArrF = bz.f((short) 4168, bt.ad);
                    if (bArrF != null) {
                        a.i.a(new w((short) 4168, bArrF));
                        this.e.a((String) null);
                    } else {
                        this.e.b("获取上传指令数据错误!");
                    }
                } else if (this.e.as.a == 1) {
                    byte[] bArrC = bz.C((short) 4202, bt.ad);
                    if (bArrC != null) {
                        a.i.a(new w((short) 4202, bArrC));
                    } else {
                        this.e.b("获取上传指令数据错误!");
                    }
                } else if (this.e.as.a == 2) {
                    byte[] bArrG = bz.g((short) 4169, bt.ad);
                    if (bArrG != null) {
                        a.i.a(new w((short) 4169, bArrG));
                        this.e.a((String) null);
                    } else {
                        this.e.b("获取上传指令数据错误!");
                    }
                }
            }
            if (this.e.as.a == 0) {
                if (i2 == 268435456 || i2 == 1073741824 || i2 == 517) {
                    if (this.e.ar.g() == this.e.ar.h()) {
                        this.e.a("请输入好友昵称", 0);
                    } else if (bt.dK != null) {
                        if (bt.dM[this.e.ar.g() - 1] == 0) {
                            ca.a((int) t.f, (t.j * 2) + 11 + (this.e.ar.i() * t.j) + t.g, new String[]{"聊天", "状态", "删除", "黑名单"}, true);
                        } else if (bt.dM[this.e.ar.g() - 1] == 1) {
                            ca.a((int) t.f, (t.j * 2) + 11 + (this.e.ar.i() * t.j) + t.g, new String[]{"聊天", "状态", "删除", "黑名单", "组队", "交易", "参观住宅", "邀请入帮"}, true);
                        }
                        this.l = (short) 1;
                    }
                }
            } else if (this.e.as.a == 2 && ((i2 == 268435456 || i2 == 1073741824 || i2 == 517) && bt.dK != null)) {
                if (bt.dM[this.e.ar.g()] == 0 || bt.dM[this.e.ar.g()] == 1) {
                    ca.a(t.f + 0, (t.j * 2) + 11 + (this.e.ar.i() * t.j) + t.g, new String[]{"删除", "加为好友"}, true);
                }
                this.l = (short) 4;
            }
            if (i2 == 536870912) {
                bt.s();
                if (this.by == 1) {
                    N();
                    this.by = (byte) 0;
                    return;
                } else {
                    au();
                    c(0);
                    return;
                }
            }
            return;
        }
        if (this.l == 1) {
            ca.b(i2);
            if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                if (i2 == 536870912) {
                    this.l = (short) 0;
                    return;
                }
                return;
            }
            this.e.aw = ca.o;
            if (ca.o == 0) {
                this.aQ = bt.dL[this.e.ar.g() - 1];
                this.aS = bt.dK[this.e.ar.g() - 1];
                this.aT = 4;
                this.e.a("聊天", 0);
                return;
            }
            if (ca.o == 1) {
                ca.a(0, (t.j * 2) + 11 + (this.e.ar.i() * t.j) + t.g, new String[]{"查看", "道具", "成就"}, true);
                this.l = (short) 9;
                return;
            }
            if (ca.o == 2) {
                ca.a(0, (t.j * 2) + 11 + (this.e.ar.i() * t.j) + t.g, new String[]{"确认", "取消"}, true);
                this.l = (short) 2;
                return;
            }
            if (ca.o == 3) {
                ca.a(0, (t.j * 2) + 11 + (this.e.ar.i() * t.j) + t.g, new String[]{"确认", "取消"}, true);
                this.l = (short) 3;
                return;
            }
            if (ca.o == 4) {
                if (bt.bs != -1) {
                    a(bt.s, bt.dK[this.e.ar.g() - 1]);
                    return;
                } else {
                    ca.a(t.f + 65, (t.j * 2) + 20 + (this.e.ar.g() * t.j) + t.g, new String[]{"自由", "跟随"}, false);
                    this.l = (short) 6;
                    return;
                }
            }
            if (ca.o == 5) {
                ca.a(t.f + 65, (t.j * 2) + 20 + (this.e.ar.g() * t.j) + t.g, new String[]{"物品", "宠物"}, false);
                this.l = (short) 7;
                return;
            }
            if (ca.o != 6) {
                if (ca.o == 7) {
                    this.M.f = bt.dL[this.e.ar.g() - 1];
                    this.M.h();
                    return;
                }
                return;
            }
            if (bt.G()) {
                this.e.b("住宅中不能参观别人住宅");
                return;
            } else if (bt.bs != -1) {
                this.e.b("队伍中不能参看住宅！");
                return;
            } else {
                a((byte) 1, -1, bt.dK[this.e.ar.g() - 1]);
                return;
            }
        }
        if (this.l == 2 || this.l == 3) {
            ca.b(i2);
            if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                if (i2 == 536870912) {
                    if (bt.dM[this.e.ar.g() - 1] == 0) {
                        ca.a((int) t.f, (t.j * 2) + 11 + (this.e.ar.i() * t.j) + t.g, new String[]{"聊天", "状态", "删除", "黑名单"}, true);
                    } else if (bt.dM[this.e.ar.g() - 1] == 1) {
                        ca.a((int) t.f, (t.j * 2) + 11 + (this.e.ar.i() * t.j) + t.g, new String[]{"聊天", "状态", "删除", "黑名单", "组队", "交易", "参观住宅", "邀请入帮"}, true);
                    }
                    ca.o = this.e.aw;
                    this.l = (short) 1;
                    return;
                }
                return;
            }
            if (ca.o != 0) {
                if (ca.o == 1) {
                    if (bt.dM[this.e.ar.g() - 1] == 0) {
                        ca.a((int) t.f, (t.j * 2) + 11 + (this.e.ar.i() * t.j) + t.g, new String[]{"聊天", "状态", "删除", "黑名单"}, true);
                    } else if (bt.dM[this.e.ar.g() - 1] == 1) {
                        ca.a((int) t.f, (t.j * 2) + 11 + (this.e.ar.i() * t.j) + t.g, new String[]{"聊天", "状态", "删除", "黑名单", "组队", "交易", "参观住宅", "邀请入帮"}, true);
                    }
                    ca.o = this.e.aw;
                    this.l = (short) 1;
                    return;
                }
                return;
            }
            if (this.e.aw == 2) {
                this.l = (short) 8;
                ca.h = 0;
                return;
            } else {
                if (this.e.aw == 3) {
                    if (bt.dM[this.e.ar.g() - 1] == 1) {
                        b(bt.dK[this.e.ar.g() - 1]);
                        return;
                    } else {
                        this.e.b("对方不在线");
                        return;
                    }
                }
                return;
            }
        }
        if (this.l == 4) {
            ca.b(i2);
            if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                if (i2 == 536870912) {
                    this.l = (short) 0;
                    return;
                }
                return;
            } else if (ca.o == 0) {
                ca.a(0, (t.j * 2) + 11 + (this.e.ar.i() * t.j) + t.g, new String[]{"确认", "取消"}, true);
                this.l = (short) 5;
                return;
            } else {
                if (ca.o == 1) {
                    a(bt.dK[this.e.ar.g()]);
                    return;
                }
                return;
            }
        }
        if (this.l == 5) {
            ca.b(i2);
            if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                if (i2 == 536870912) {
                    if (bt.dM[this.e.ar.g()] == 0 || bt.dM[this.e.ar.g()] == 1) {
                        ca.a(t.f + 0, (t.j * 2) + 11 + (this.e.ar.i() * t.j) + t.g, new String[]{"删除", "加为好友"}, true);
                        this.l = (short) 4;
                        return;
                    }
                    return;
                }
                return;
            }
            if (ca.o == 0) {
                byte[] bArrD = bz.d((short) 4171, bt.ad, bt.dK[this.e.ar.g()]);
                if (bArrD == null) {
                    this.e.b("获取上传指令数据错误!");
                    return;
                } else {
                    a.i.a(new w((short) 4171, bArrD));
                    this.e.a((String) null);
                    return;
                }
            }
            if (ca.o == 1) {
                if (bt.dM[this.e.ar.g()] == 0 || bt.dM[this.e.ar.g()] == 1) {
                    ca.a(t.f + 0, (t.j * 2) + 11 + (this.e.ar.i() * t.j) + t.g, new String[]{"删除", "加为好友"}, true);
                    this.l = (short) 4;
                    return;
                }
                return;
            }
            return;
        }
        if (this.l == 6) {
            ca.b(i2);
            if (i2 == 268435456 || i2 == 1073741824 || i2 == 517) {
                a(ca.o != 0 ? (short) 0 : (short) 1, bt.dK[this.e.ar.g() - 1]);
                return;
            } else {
                if (i2 == 536870912) {
                    this.l = (short) 0;
                    return;
                }
                return;
            }
        }
        if (this.l == 7) {
            ca.b(i2);
            if (i2 == 268435456 || i2 == 1073741824 || i2 == 517) {
                e(bt.dK[this.e.ar.g() - 1]);
                return;
            } else {
                if (i2 == 536870912) {
                    this.l = (short) 0;
                    return;
                }
                return;
            }
        }
        if (this.l == 8) {
            if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                if (i2 == 536870912) {
                    this.l = (short) 0;
                    return;
                }
                return;
            } else {
                byte[] bArrC2 = bz.c((short) 4170, bt.ad, bt.dK[this.e.ar.g() - 1]);
                if (bArrC2 != null) {
                    a.i.a(new w((short) 4170, bArrC2));
                    return;
                } else {
                    this.e.b("获取上传指令数据错误!");
                    return;
                }
            }
        }
        if (this.l != 9) {
            if (this.l == 10) {
                this.T.b(i2);
                if (i2 == 268435456 || i2 == 536870912) {
                    this.T.j();
                    p(0);
                    return;
                }
                return;
            }
            return;
        }
        ca.b(i2);
        if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
            if (i2 == 536870912) {
                this.l = (short) 0;
                return;
            }
            return;
        }
        if (ca.o == 0) {
            byte[] bArrA = bz.a((short) 4110, bt.ad, bt.dK[this.e.ar.g() - 1], (byte) 0);
            if (bArrA == null) {
                this.e.b("获取上传指令数据错误!");
                return;
            } else {
                a.i.a(new w((short) 4110, bArrA));
                this.e.a((String) null);
                return;
            }
        }
        if (ca.o == 1) {
            if (bt.bC.size() > 0) {
                e(13);
                return;
            } else {
                this.e.b("背包中没有物品");
                return;
            }
        }
        if (ca.o == 2) {
            this.de = bt.dK[this.e.ar.g() - 1];
            a(bt.dK[this.e.ar.g() - 1], bt.ad, (short) 3, (short) 1);
        }
    }

    private void al(int i2) {
        if (i2 == 1 || i2 == 514) {
            if (this.an != null) {
                ca.g = ca.g + (-1) >= 0 ? ca.g - 1 : this.an.length - 1;
            }
        } else if (i2 == 4 || i2 == 520) {
            if (this.an != null) {
                ca.g = ca.g + 1 < this.an.length ? ca.g + 1 : 0;
            }
        } else if (i2 == 8 || i2 == 516) {
            ca.e = ca.e - ca.d >= 0 ? ca.e - ca.d : 0;
        } else if (i2 == 2 || i2 == 518) {
            ca.e = ca.e + ca.d < K.a() ? ca.e + ca.d : ca.e;
        } else if (i2 == 268435456 || i2 == 517 || i2 == 1073741824) {
            if (ca.g == 0) {
                N();
                b(bt.dS[1], bt.dU);
                if (bt.dU == 26 && bt.dS[2].equals("注册")) {
                    c.a(true);
                } else if (bt.dU == 28 && bt.dS[2].equals("下载")) {
                    this.e.c(bt.dS[1]);
                } else {
                    this.e.a((String) null);
                }
            } else if (ca.g == 1) {
                b(bt.dS[1], bt.dW);
                N();
            }
            if (this.bb == 64) {
                this.bb = (short) 0;
                this.O.a((int) a.e.O.a, this.O.c, this.O.d);
            }
        } else if (i2 == 536870912) {
            b(bt.dS[1], bt.dW);
            N();
        }
        this.e.b = 0;
    }

    private void am(int i2) {
        if (bt.q == null) {
            this.al = null;
            N();
            return;
        }
        if (this.e.aC != null && this.e.g) {
            if (this.bz == 0 || this.bz == 3) {
                a((String) null, (byte) 2);
            } else {
                a(bt.q[this.e.ar.g()].b, (byte) 4);
            }
        }
        if (this.l == 0) {
            this.e.aq.b(i2);
            if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                if (i2 == 536870912) {
                    this.e.aq.j();
                    c(0);
                    this.l = (short) 1;
                    a.f.a(this.f, h, i, false, false, 1009050);
                    this.k = (short) 1;
                    this.j = (short) 1;
                    return;
                }
                return;
            }
            if (bt.q[this.e.ar.g()].b.equals(bt.ad)) {
                return;
            }
            if (bt.bs == 1) {
                int i3 = p + (t.j * 2) + 10;
                String[] strArr = new String[7];
                strArr[0] = "踢除";
                strArr[1] = "任命";
                strArr[2] = "解散";
                strArr[3] = "群聊";
                strArr[4] = "私聊";
                strArr[5] = "查看";
                strArr[6] = bt.s == 0 ? "自由" : "跟随";
                ca.a(0, i3, strArr, true);
            } else {
                ca.a(0, (t.j * 2) + 10 + p, new String[]{"群聊", "私聊", "离开", "查看"}, true);
            }
            this.l = (short) 1;
            return;
        }
        if (this.l == 1) {
            ca.b(i2);
            if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                if (i2 == 536870912) {
                    this.l = (short) 0;
                    return;
                }
                return;
            }
            if (bt.bs != 1) {
                if (bt.bs == 0) {
                    if (ca.o == 0) {
                        this.e.a("聊天", 0);
                        this.bz = 0;
                        this.aQ = bt.q[this.e.ar.g()].e;
                        return;
                    }
                    if (ca.o == 1) {
                        this.e.a("聊天", 0);
                        this.bz = 1;
                        this.aQ = bt.q[this.e.ar.g()].e;
                        return;
                    } else if (ca.o == 2) {
                        ca.a(0, (t.j * 2) + 10 + p, new String[]{"确认", "取消"}, true);
                        this.bz = 2;
                        this.l = (short) 2;
                        return;
                    } else {
                        if (ca.o == 3) {
                            ca.a(0, (t.j * 2) + 10 + p, new String[]{"属性", "装备"}, true);
                            this.bz = 3;
                            this.l = (short) 3;
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (ca.o == 0) {
                ca.a(0, (t.j * 2) + 10 + p, new String[]{"确认", "取消"}, true);
                this.bz = 0;
                this.l = (short) 2;
                return;
            }
            if (ca.o == 1) {
                ca.a(0, (t.j * 2) + 10 + p, new String[]{"确认", "取消"}, true);
                this.bz = 1;
                this.l = (short) 2;
                return;
            }
            if (ca.o == 2) {
                ca.a(0, (t.j * 2) + 10 + p, new String[]{"确认", "取消"}, true);
                this.bz = 2;
                this.l = (short) 2;
                return;
            }
            if (ca.o == 3) {
                this.e.a("聊天", 0);
                this.bz = 3;
                this.aQ = bt.q[this.e.ar.g()].e;
                return;
            }
            if (ca.o == 4) {
                this.e.a("聊天", 0);
                this.bz = 4;
                this.aQ = bt.q[this.e.ar.g()].e;
                return;
            }
            if (ca.o == 5) {
                ca.a(0, (t.j * 2) + 10 + p, new String[]{"属性", "装备"}, true);
                this.l = (short) 3;
                return;
            }
            if (ca.o == 6) {
                this.bz = 6;
                byte[] bArrB = bz.b((short) 4115, bt.ad, bt.s);
                if (bArrB == null) {
                    this.e.b("获取上传指令数据错误!");
                    return;
                }
                a.i.a(new w((short) 4115, bArrB));
                if (bt.s == 0) {
                    this.e.b("队员自由活动请求已发送!");
                    return;
                } else {
                    if (bt.s == 1) {
                        this.e.b("队伍集合请求已发送!");
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (this.l == 2) {
            ca.b(i2);
            if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                if (i2 == 536870912) {
                    an(this.bz);
                    return;
                }
                return;
            }
            if (ca.o != 0) {
                if (ca.o == 1) {
                    an(this.bz);
                    return;
                }
                return;
            }
            if (this.bz == 0) {
                byte[] bArrE = bz.e((short) 4114, bt.ad, bt.q[this.e.ar.g()].b);
                if (bArrE == null) {
                    this.e.b("获取上传指令数据错误!");
                    return;
                } else {
                    a.i.a(new w((short) 4114, bArrE));
                    this.e.b(new StringBuffer().append("剔除队员").append(bt.q[this.e.ar.g()].e).append("请求已发送!").toString());
                    return;
                }
            }
            if (this.bz == 1) {
                byte[] bArrF = bz.f((short) 4119, bt.ad, bt.q[this.e.ar.g()].b);
                if (bArrF == null) {
                    this.e.b("获取上传指令数据错误!");
                    return;
                } else {
                    a.i.a(new w((short) 4119, bArrF));
                    this.e.b(new StringBuffer().append("任命").append(bt.q[this.e.ar.g()].e).append("为队长请求已发送!").toString());
                    return;
                }
            }
            if (this.bz == 2) {
                if (bt.bs == 1) {
                    byte[] bArrH = bz.h((short) 4120, bt.ad);
                    if (bArrH == null) {
                        this.e.b("获取上传指令数据错误!");
                        return;
                    } else {
                        a.i.a(new w((short) 4120, bArrH));
                        this.e.b("解散队伍请求已发送!");
                        return;
                    }
                }
                if (bt.bs == 0) {
                    byte[] bArrI = bz.i((short) 4121, bt.ad);
                    if (bArrI == null) {
                        this.e.b("获取上传指令数据错误!");
                        return;
                    } else {
                        a.i.a(new w((short) 4121, bArrI));
                        this.e.b("脱离队伍请求已发送!");
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (this.l != 3) {
            if (this.l == 4) {
                this.T.b(i2);
                if (i2 == 268435456 || i2 == 536870912) {
                    ca.a(0, (t.j * 2) + 10 + p, new String[]{"属性", "装备"}, true);
                    this.al = null;
                    this.T.j();
                    this.l = (short) 3;
                    return;
                }
                return;
            }
            if (this.l == 5) {
                a(bt.cJ);
                g(i2);
                if (i2 == 536870912) {
                    ca.a(0, (t.j * 2) + 10 + p, new String[]{"属性", "装备"}, true);
                    if (bt.cJ != null) {
                        bt.o();
                    }
                    q = null;
                    this.al = null;
                    this.l = (short) 3;
                    return;
                }
                return;
            }
            return;
        }
        ca.b(i2);
        if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
            if (i2 == 536870912) {
                this.bz = 3;
                if (bt.bs == 1) {
                    this.bz = 5;
                }
                an(this.bz);
                return;
            }
            return;
        }
        if (ca.o == 0) {
            byte[] bArrA = bz.a((short) 4110, bt.ad, bt.q[this.e.ar.g()].b, (byte) 0);
            if (bArrA == null) {
                this.e.b("获取上传指令数据错误!");
                return;
            } else {
                a.i.a(new w((short) 4110, bArrA));
                this.e.a((String) null);
                return;
            }
        }
        if (ca.o == 1) {
            byte[] bArrB2 = bz.b((short) 4111, bt.ad, bt.q[this.e.ar.g()].b);
            if (bArrB2 == null) {
                this.e.b("获取上传指令数据错误!");
            } else {
                a.i.a(new w((short) 4111, bArrB2));
                this.e.a((String) null);
            }
        }
    }

    private void an(int i2) {
        if (bt.bs == 1) {
            int i3 = p + (t.j * 2) + 10;
            String[] strArr = new String[7];
            strArr[0] = "踢除";
            strArr[1] = "任命";
            strArr[2] = "解散";
            strArr[3] = "群聊";
            strArr[4] = "私聊";
            strArr[5] = "查看";
            strArr[6] = bt.s == 0 ? "自由" : "跟随";
            ca.a(0, i3, strArr, true);
        } else {
            ca.a(0, (t.j * 2) + 10 + p, new String[]{"群聊", "私聊", "离开", "查看"}, true);
        }
        ca.o = i2;
        if (this.k == 21) {
            this.l = (short) 1;
        } else if (this.k == 7) {
            this.l = (short) 8;
        }
    }

    private void ao() {
        if (this.f.l == null) {
            this.f.n = null;
            return;
        }
        this.f.n = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, this.f.l.length, 2);
        for (int i2 = 0; i2 < this.f.l.length; i2++) {
            if (this.f.l[i2] != null) {
                a.f.a(this.f.l[i2], this.f.n[i2]);
            }
        }
    }

    private void ao(int i2) {
        int i3;
        int i4;
        int i5 = 0;
        if (this.aE == this.e.ax) {
            aP();
            this.aE = -1;
        }
        if (this.l == 0) {
            if (this.ct == 0) {
                a(bt.fs);
                aV();
            } else if (this.ct == 1) {
                a(new short[]{1920});
            }
            if (i2 == 516 || i2 == 8) {
                if (this.ar == 3) {
                    a aVar = this.e;
                    i4 = this.e.ax != 0 ? 0 : 1;
                    aVar.ax = i4;
                    this.aV = i4;
                    aP();
                    return;
                }
                a aVar2 = this.e;
                if (this.e.ax <= 0) {
                    i3 = 7;
                } else {
                    a aVar3 = this.e;
                    i3 = aVar3.ax - 1;
                    aVar3.ax = i3;
                }
                aVar2.ax = i3;
                this.aV = i3;
                this.aE = i3;
                aP();
                return;
            }
            if (i2 == 518 || i2 == 2) {
                if (this.ar == 3) {
                    a aVar4 = this.e;
                    i4 = this.e.ax != 0 ? 0 : 1;
                    aVar4.ax = i4;
                    this.aV = i4;
                    aP();
                    return;
                }
                a aVar5 = this.e;
                if (this.e.ax < 7) {
                    a aVar6 = this.e;
                    i5 = aVar6.ax + 1;
                    aVar6.ax = i5;
                }
                aVar5.ax = i5;
                this.aV = i5;
                this.aE = i5;
                aP();
                return;
            }
            if (i2 == 514 || i2 == 1) {
                if (this.ar - 1 == 1) {
                    this.e.ax = 0;
                    this.aV = 0;
                }
                this.ar--;
                if (this.ar < 0) {
                    this.ar++;
                }
                int i6 = this.ar;
                this.aU = i6;
                this.aE = i6;
                aP();
                return;
            }
            if (i2 == 520 || i2 == 4) {
                this.ar++;
                if (this.ar > 1) {
                    this.ar--;
                }
                int i7 = this.ar;
                this.aU = i7;
                this.aE = i7;
                aP();
                return;
            }
            if (i2 != 1073741824) {
                if (i2 == 536870912) {
                    ca.h = 0;
                    this.l = (short) 5;
                    return;
                }
                if (i2 == 1024) {
                    if (bt.i == 0) {
                        this.e.b("交易已锁定");
                        return;
                    }
                    byte[] bArrG = bz.g((short) 4128, bt.ad, this.ct);
                    if (bArrG == null) {
                        this.e.b("获取上传指令数据错误!");
                        return;
                    } else {
                        a.i.a(new w((short) 4128, bArrG));
                        this.e.a((String) null);
                        return;
                    }
                }
                if (i2 != 2048) {
                    if (i2 == 268435456) {
                        byte[] bArrH = bz.h((short) 4129, bt.ad, this.ct);
                        if (bArrH == null) {
                            this.e.b("获取上传指令数据错误!");
                            return;
                        } else {
                            a.i.a(new w((short) 4129, bArrH));
                            this.e.a((String) null);
                            return;
                        }
                    }
                    return;
                }
                if (bt.i == 0) {
                    this.e.b("交易已锁定");
                    return;
                } else {
                    if (bt.ap <= 0) {
                        this.e.b("身上没有银两");
                        return;
                    }
                    this.ah = bt.ap;
                    this.l = (short) 6;
                    o();
                    return;
                }
            }
            if (this.ar == 0) {
                if (bt.fp != null && bt.a((byte) 1, this.e.ax)) {
                    ca.a(t.f + 20 + (this.e.ax * 17), t.g + 41, new String[]{"查看"}, false);
                    this.l = (short) 3;
                }
            } else if (this.ar <= 1) {
                if (this.ct == 0) {
                    if (this.ar == 1) {
                        if (bt.fh == null || (bt.fh != null && aO())) {
                            if (bt.fi == null || !bt.a((byte) 0, this.e.ax)) {
                                ca.a(t.f + 20 + (this.e.ax * 17), t.g + (t.j * 4) + 35, new String[]{"放入", "金钱", "锁定", "交易", "退出"}, false);
                            } else {
                                ca.a(t.f + 20 + (this.e.ax * 17), t.g + (t.j * 4) + 35, new String[]{"查看", "放入", "金钱", "锁定", "交易", "退出"}, false);
                            }
                            ca.o = 0;
                            this.l = (short) 1;
                        } else {
                            if (bt.fi == null || !bt.a((byte) 0, this.e.ax)) {
                                ca.a(t.f + 20 + (this.e.ax * 17), t.g + (t.j * 4) + 35, new String[]{"取出", "金钱", "锁定", "交易", "退出"}, false);
                            } else {
                                ca.a(t.f + 20 + (this.e.ax * 17), t.g + (t.j * 4) + 35, new String[]{"查看", "取出", "金钱", "锁定", "交易", "退出"}, false);
                            }
                            ca.o = 0;
                            this.l = (short) 2;
                        }
                    }
                } else if (this.ct == 1 && this.ar == 1) {
                    if (bt.fu == null || (bt.fu != null && aO())) {
                        ca.a(t.f + 20 + (this.e.ax * 17), t.g + (t.j * 4) + 35, new String[]{"放入", "金钱", "锁定", "交易", "退出"}, false);
                        ca.o = 0;
                        this.l = (short) 1;
                    } else {
                        ca.a(t.f + 20 + (this.e.ax * 17), t.g + (t.j * 4) + 35, new String[]{"取出", "金钱", "锁定", "交易", "退出"}, false);
                        ca.o = 0;
                        this.l = (short) 2;
                    }
                }
            }
            this.aF = this.e.ax;
            return;
        }
        if (this.l != 1 && this.l != 2) {
            if (this.l == 3) {
                if (i2 == 268435456 || i2 == 1073741824 || i2 == 517) {
                    this.aH = this.e.as.a;
                    bt.a(this.e.ax, 1);
                    this.O.a(0, this.k, (int) this.ct);
                    return;
                } else {
                    if (i2 == 536870912) {
                        this.l = (short) 0;
                        return;
                    }
                    return;
                }
            }
            if (this.l == 5) {
                if (i2 == 268435456) {
                    g(this.ct);
                    this.e.a((String) null);
                    return;
                } else {
                    if (i2 == 536870912) {
                        this.l = (short) 0;
                        return;
                    }
                    return;
                }
            }
            if (this.l == 6) {
                if (i2 != 268435456 && i2 != 1073741824) {
                    if (i2 != 1073741824) {
                        if (i2 == 536870912) {
                            this.l = (short) 0;
                            return;
                        } else {
                            d(i2);
                            return;
                        }
                    }
                    return;
                }
                if (n() != -1) {
                    if (n() > this.ah) {
                        this.e.b("超出最大值，请重新输入");
                        return;
                    }
                    byte[] bArrA = bz.a((short) 4127, bt.ad, n(), (int) this.ct);
                    if (bArrA != null) {
                        a.i.a(new w((short) 4127, bArrA));
                        this.e.a((String) null);
                    } else {
                        this.e.b("获取上传指令数据错误!");
                    }
                    this.l = (short) 0;
                    return;
                }
                return;
            }
            return;
        }
        ca.b(i2);
        if (i2 != 268435456 && i2 != 517 && i2 != 1073741824) {
            if (i2 == 536870912) {
                this.l = (short) 0;
                return;
            }
            return;
        }
        if (bt.fi == null || !bt.a((byte) 0, this.e.ax)) {
            if (ca.o != 0) {
                if (ca.o == 1) {
                    if (bt.i == 0) {
                        this.e.b("交易已锁定");
                        return;
                    } else {
                        if (bt.ap <= 0) {
                            this.e.b("身上没有银两");
                            return;
                        }
                        this.ah = bt.ap;
                        this.l = (short) 6;
                        o();
                        return;
                    }
                }
                if (ca.o == 2) {
                    if (bt.i == 0) {
                        this.e.b("交易已锁定");
                        return;
                    }
                    byte[] bArrG2 = bz.g((short) 4128, bt.ad, this.ct);
                    if (bArrG2 == null) {
                        this.e.b("获取上传指令数据错误!");
                        return;
                    } else {
                        a.i.a(new w((short) 4128, bArrG2));
                        this.e.a((String) null);
                        return;
                    }
                }
                if (ca.o != 3) {
                    if (ca.o == 4) {
                        ca.h = 0;
                        this.l = (short) 5;
                        return;
                    }
                    return;
                }
                byte[] bArrH2 = bz.h((short) 4129, bt.ad, this.ct);
                if (bArrH2 == null) {
                    this.e.b("获取上传指令数据错误!");
                    return;
                } else {
                    a.i.a(new w((short) 4129, bArrH2));
                    this.e.a((String) null);
                    return;
                }
            }
            if (bt.i == 0) {
                this.e.b("交易已锁定");
                return;
            }
            if (this.l != 1) {
                if (this.l == 2) {
                    if (this.ct == 0) {
                        b(this.ct, (byte) this.e.ax);
                        b((byte) 0, true);
                        this.ar = this.aU;
                        this.e.ax = this.aF;
                        this.as = 0;
                        this.e.a((String) null);
                        return;
                    }
                    if (this.ct == 1) {
                        b(this.ct, (byte) this.e.ax);
                        b((byte) 1, true);
                        this.ar = this.aU;
                        this.e.ax = this.aF;
                        this.e.a((String) null);
                        return;
                    }
                    return;
                }
                return;
            }
            if (this.ct == 0) {
                if (bt.fh == null || bt.fh.length < 10) {
                    e(4);
                    return;
                } else {
                    this.e.b("交易物品栏已满!");
                    return;
                }
            }
            if (this.ct == 1) {
                if (bt.gs != null && bt.gs.length >= 10) {
                    this.e.b("交易宠物栏已满!");
                    return;
                } else if (bt.fw == null || bt.fw.length <= 0) {
                    this.e.b("您没有宠物!");
                    return;
                } else {
                    j(4);
                    return;
                }
            }
            return;
        }
        if (ca.o == 0) {
            this.aH = this.e.as.a;
            bt.a(this.e.ax, 0);
            this.O.a(0, this.k, (int) this.ct);
            return;
        }
        if (ca.o != 1) {
            if (ca.o == 2) {
                if (bt.i == 0) {
                    this.e.b("交易已锁定");
                    return;
                } else {
                    if (bt.ap <= 0) {
                        this.e.b("身上没有银两");
                        return;
                    }
                    this.ah = bt.ap;
                    this.l = (short) 6;
                    o();
                    return;
                }
            }
            if (ca.o == 3) {
                if (bt.i == 0) {
                    this.e.b("交易已锁定");
                    return;
                }
                byte[] bArrG3 = bz.g((short) 4128, bt.ad, this.ct);
                if (bArrG3 == null) {
                    this.e.b("获取上传指令数据错误!");
                    return;
                } else {
                    a.i.a(new w((short) 4128, bArrG3));
                    this.e.a((String) null);
                    return;
                }
            }
            if (ca.o != 4) {
                if (ca.o == 5) {
                    ca.h = 0;
                    this.l = (short) 5;
                    return;
                }
                return;
            }
            byte[] bArrH3 = bz.h((short) 4129, bt.ad, this.ct);
            if (bArrH3 == null) {
                this.e.b("获取上传指令数据错误!");
                return;
            } else {
                a.i.a(new w((short) 4129, bArrH3));
                this.e.a((String) null);
                return;
            }
        }
        if (bt.i == 0) {
            this.e.b("交易已锁定");
            return;
        }
        if (this.l != 1) {
            if (this.l == 2) {
                if (this.ct == 0) {
                    b(this.ct, (byte) this.e.ax);
                    b((byte) 0, true);
                    this.ar = this.aU;
                    this.e.ax = this.aF;
                    this.as = 0;
                    this.e.a((String) null);
                    return;
                }
                if (this.ct == 1) {
                    b(this.ct, (byte) this.e.ax);
                    b((byte) 1, true);
                    this.ar = this.aU;
                    this.e.ax = this.aF;
                    this.e.a((String) null);
                    return;
                }
                return;
            }
            return;
        }
        if (this.ct == 0) {
            if (bt.fh == null || bt.fh.length < 10) {
                e(4);
                return;
            } else {
                this.e.b("交易物品栏已满!");
                return;
            }
        }
        if (this.ct == 1) {
            if (bt.gs != null && bt.gs.length >= 10) {
                this.e.b("交易宠物栏已满!");
            } else if (bt.fw == null || bt.fw.length <= 0) {
                this.e.b("您没有宠物!");
            } else {
                j(4);
            }
        }
    }

    private static String ap(int i2) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<6>需求：<1>");
        stringBuffer.append(bt.ey[i2]);
        if (bt.ez[i2].length() > 0) {
            stringBuffer.append("<6>不满足：<0>");
            stringBuffer.append(bt.ez[i2]);
        }
        stringBuffer.append("<6>获得：");
        stringBuffer.append(bt.eA[i2]);
        return stringBuffer.toString();
    }

    private static void ap() {
        if (bt.s != 0 || bt.q == null) {
            return;
        }
        for (int i2 = 0; i2 < bt.q.length; i2++) {
            if (bt.q[i2] != null) {
                bt.q[i2].f.removeAllElements();
                bt.q[i2].j = bt.at;
                bt.q[i2].k = bt.au;
            }
        }
    }

    private void aq() {
        try {
            A = Image.createImage("/images/fightBG.png");
        } catch (IOException e) {
            e.printStackTrace();
        }
        y = a.ac.a("leader");
        z = a.ac.a("member");
        G = a.ac.a("hotkeyicon");
        F = a.ac.a("fighticon");
        E = a.ac.a("fightnum");
        bn = a.ac.b("trans");
        u = a.ac.b("dialog");
        s = a.ac.b("?");
        t = a.ac.b("!");
        bo = a.ac.b("mapnpc");
        H = a.ac.a("mystation");
        v = a.ag.a(t.N[bt.ax][bt.aj]);
        B = a.ag.a("lvl");
        bq = a.ag.a("board");
        br = a.ag.a("board+");
    }

    private void aq(int i2) {
        if (this.l == 0) {
            if (this.e.aq != null) {
                this.e.aq.b(i2);
            }
            if (i2 == 514 || i2 == 520 || i2 == 1 || i2 == 4) {
                if (bt.ew == null || bt.ew.length <= 0) {
                    return;
                }
                this.e.at.a(ap(this.e.ar.g()), t.i, (byte) 2);
                this.e.at.a((byte) 1);
                return;
            }
            if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                if (i2 == 536870912) {
                    if (this.bb == 130) {
                        this.N.a(this.N.a);
                        return;
                    } else {
                        N();
                        return;
                    }
                }
                return;
            }
            if (bt.ew == null || bt.ew.length <= 0) {
                return;
            }
            if (this.cy == 2) {
                ca.a(this.e.ar.a() + 65 + t.f, t.j + 20 + (this.e.ar.g() * t.j) + t.g, new String[]{"锻造", "查看"}, true);
                this.l = (short) 2;
                return;
            } else {
                a(99L);
                this.l = (short) 1;
                return;
            }
        }
        if (this.l == 1) {
            b(i2);
            if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                if (i2 == 536870912) {
                    this.l = (short) 0;
                    return;
                }
                return;
            } else {
                byte[] bArrK = (aj || bt.ev) ? bz.k((short) 4178, bt.ad, bt.ew[this.e.ar.g()], this.ag) : bz.k((short) 4365, bt.ad, bt.ew[this.e.ar.g()], this.ag);
                if (bArrK == null) {
                    this.e.b("获取上传指令数据错误!");
                    return;
                } else {
                    a.i.a(new w((short) 4178, bArrK));
                    this.e.a((String) null);
                    return;
                }
            }
        }
        if (this.l == 2) {
            ca.b(i2);
            if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                if (i2 == 536870912) {
                    this.l = (short) 0;
                }
            } else if (ca.o != 0) {
                if (ca.o == 1) {
                    this.e.b("没有此功能!");
                }
            } else {
                byte[] bArrK2 = aj ? bz.k((short) 4178, bt.ad, bt.ew[this.e.ar.g()], 1) : bz.k((short) 4365, bt.ad, bt.ew[this.e.ar.g()], 1);
                if (bArrK2 == null) {
                    this.e.b("获取上传指令数据错误!");
                } else {
                    a.i.a(new w((short) 4178, bArrK2));
                    this.e.a((String) null);
                }
            }
        }
    }

    private void ar() {
        if (bt.as != bt.ar) {
            this.e.o = false;
            bt.as = bt.ar;
            if (t.l == 2) {
                a.ah.c();
                a.ah.c();
            }
            this.f = null;
            byte[] bArrA = bt.a(bt.ar);
            if (bArrA != null) {
                this.f = a.ae.a(bArrA);
            } else {
                this.f = a.ae.c(String.valueOf((int) bt.ar));
            }
            a.f.a();
            a.f.a(this.f, this.e.m);
        }
    }

    private void ar(int i2) {
        int i3;
        int i4;
        int i5 = 6;
        int i6 = 0;
        if (i2 == 1 || i2 == 514) {
            if (this.ar > 0) {
                i5 = this.ar - 1;
                this.ar = i5;
            }
            this.ar = i5;
            return;
        }
        if (i2 == 520 || i2 == 4) {
            if (this.ar >= 6) {
                i3 = 0;
            } else {
                i3 = this.ar + 1;
                this.ar = i3;
            }
            this.ar = i3;
            return;
        }
        if (i2 == 8 || i2 == 516) {
            if (this.aq <= 0) {
                i4 = 5;
            } else {
                i4 = this.aq - 1;
                this.aq = i4;
            }
            this.aq = i4;
            return;
        }
        if (i2 == 518 || i2 == 2) {
            if (this.aq < 5) {
                i6 = this.aq + 1;
                this.aq = i6;
            }
            this.aq = i6;
            return;
        }
        if (i2 == 268435456 || i2 == 1073741824 || i2 == 517) {
            String string = new StringBuffer().append(this.e.aC.getString()).append("<").append((this.ar * 6) + this.aq + 1).append(">").toString();
            if (string.toCharArray().length > 30) {
                this.e.b("表情插入失败，聊天内容过长");
                return;
            } else {
                a.a(this.e.aC, string);
                this.e.q.setCurrent(this.e.aD);
                return;
            }
        }
        if (i2 == 536870912) {
            if (t.b >= 240) {
                this.e.m = 8;
                o = (short) 35;
                p = (short) 50;
            }
            this.e.q.setCurrent(this.e.aD);
        }
    }

    private void as() {
        if (this.f.i == null) {
            return;
        }
        short s2 = t.b;
        short s3 = t.c;
        int i2 = t.b / 2;
        int i3 = t.c / 2;
        if (this.f.a < t.b) {
            s2 = this.f.a;
            i2 = this.f.a / 2;
        }
        if (this.f.b < t.c) {
            s3 = this.f.b;
            i3 = this.f.b / 2;
        }
        if (bt.bs != 0 || bt.s != 0) {
            h = this.I.j - i2 < 0 ? 0 : this.I.j + i2 > this.f.a ? this.f.a - s2 : this.I.j - i2;
            i = this.I.k - i3 >= 0 ? this.I.k + i3 > this.f.b ? this.f.b - s3 : this.I.k - i3 : 0;
        } else if (bt.q != null) {
            short s4 = bt.q[0].j;
            short s5 = bt.q[0].k;
            h = s4 - i2 < 0 ? 0 : s4 + i2 > this.f.a ? this.f.a - s2 : s4 - i2;
            i = s5 - i3 >= 0 ? s5 + i3 > this.f.b ? this.f.b - s3 : s5 - i3 : 0;
        }
    }

    private void as(int i2) {
        byte b2;
        byte b3;
        byte b4;
        if (this.f.i == null) {
            return;
        }
        this.e.aq.b(i2);
        if (i2 == 516 || i2 == 8) {
            this.aA = this.e.ar.h();
            this.cA = this.e.ar.g();
            if (this.e.ar.g() == 0 || this.e.ar.g() == 12) {
                byte[] bArr = aW;
                int iG = this.e.ar.g();
                if (aW[this.e.ar.g()] > 0) {
                    b = (byte) (r3[r4] - 1);
                    aW[this.e.ar.g()] = b;
                }
                bArr[iG] = b;
                return;
            }
            if (this.e.ar.g() == 1) {
                byte[] bArr2 = aW;
                int iG2 = this.e.ar.g();
                if (aW[this.e.ar.g()] <= 10) {
                    b2 = 10;
                } else {
                    b2 = (byte) (r3[r4] - 1);
                    aW[this.e.ar.g()] = b2;
                }
                bArr2[iG2] = b2;
                return;
            }
            if (this.e.ar.g() == 3) {
                aW[3] = aW[3] == 0 ? (byte) 1 : (byte) 0;
                a.f.a(this.f, h, i, true, true, 1009050);
                aQ();
                return;
            }
            if (this.e.ar.g() == 7 || this.e.ar.g() == 8 || this.e.ar.g() == 17) {
                if (this.e.ar.g() == 7) {
                    p((byte) 0);
                    return;
                } else if (this.e.ar.g() == 8) {
                    p((byte) 1);
                    return;
                } else {
                    if (this.e.ar.g() == 17) {
                        p((byte) 3);
                        return;
                    }
                    return;
                }
            }
            if (this.e.ar.g() == 13) {
                r(bt.B);
                return;
            }
            if (this.e.ar.g() == 14) {
                s(bt.A);
                return;
            }
            if (this.e.ar.g() == 15) {
                O();
                return;
            }
            if (this.e.ar.g() == 16) {
                q(bt.D);
                return;
            }
            if (this.e.ar.g() == 18) {
                aW[18] = aW[18] == 0 ? (byte) 1 : (byte) 0;
                d(true);
                bt.k = null;
                this.dd = null;
                return;
            }
            if (this.e.ar.g() == 19) {
                t(bt.E);
                return;
            } else {
                aW[this.e.ar.g()] = aW[this.e.ar.g()] != 0 ? (byte) 0 : (byte) 1;
                aQ();
                return;
            }
        }
        if (i2 != 518 && i2 != 2) {
            if (i2 == 536870912) {
                this.e.j();
                this.e.aq.j();
                ax();
                this.cB = null;
                this.cC = null;
                return;
            }
            return;
        }
        this.aA = this.e.ar.h();
        this.cA = this.e.ar.g();
        if (this.e.ar.g() == 0) {
            byte[] bArr3 = aW;
            if (aW[0] >= 50) {
                b4 = 50;
            } else {
                byte[] bArr4 = aW;
                b4 = (byte) (bArr4[0] + 1);
                bArr4[0] = b4;
            }
            bArr3[0] = b4;
            aQ();
            return;
        }
        if (this.e.ar.g() == 1) {
            byte[] bArr5 = aW;
            if (aW[1] >= 50) {
                b3 = 50;
            } else {
                byte[] bArr6 = aW;
                b3 = (byte) (bArr6[1] + 1);
                bArr6[1] = b3;
            }
            bArr5[1] = b3;
            aQ();
            return;
        }
        if (this.e.ar.g() == 3) {
            aW[3] = aW[3] == 0 ? (byte) 1 : (byte) 0;
            a.f.a(this.f, h, i, true, true, 1009050);
            aQ();
            return;
        }
        if (this.e.ar.g() == 7 || this.e.ar.g() == 8 || this.e.ar.g() == 17) {
            if (this.e.ar.g() == 7) {
                p((byte) 0);
                return;
            } else if (this.e.ar.g() == 8) {
                p((byte) 1);
                return;
            } else {
                if (this.e.ar.g() == 17) {
                    p((byte) 3);
                    return;
                }
                return;
            }
        }
        if (this.e.ar.g() == 13) {
            r(bt.B);
            return;
        }
        if (this.e.ar.g() == 14) {
            s(bt.A);
            return;
        }
        if (this.e.ar.g() == 15) {
            O();
            return;
        }
        if (this.e.ar.g() == 16) {
            q(bt.D);
        } else if (this.e.ar.g() == 19) {
            t(bt.E);
        } else {
            aW[this.e.ar.g()] = aW[this.e.ar.g()] != 1 ? (byte) 1 : (byte) 0;
            aQ();
        }
    }

    private void at() {
        j();
        c(0);
        this.l = (short) 0;
        a.f.a(this.f, h, i, false, false, 1009050);
        this.k = (short) 1;
        this.j = (short) 1;
    }

    private void at(int i2) {
        if (this.l == 0) {
            if (this.e.aq != null) {
                this.e.aq.b(i2);
            }
            if (i2 == 8 || i2 == 2 || i2 == 518 || i2 == 516) {
                if (this.e.as.a == 0) {
                    if (this.as == 1) {
                        j((byte) 0);
                    } else if (this.as == 3 || this.as == 8 || this.as == 7) {
                        this.aZ = (byte) this.as;
                        j((byte) 2);
                    } else if (this.as == 5 || this.as == 6 || this.as == 10 || this.as == 9) {
                        this.aZ = (byte) this.as;
                        this.as = 4;
                        c((short) 4361, this.af, (byte) 1);
                    }
                } else if (this.e.as.a == 1) {
                    if (this.as == 0) {
                        v((byte) 1);
                    } else if (this.as == 2 || this.as == 7 || this.as == 8) {
                        v((byte) 2);
                        this.aZ = (byte) this.as;
                    } else if (this.as == 4 || this.as == 6 || this.as == 9 || this.as == 10) {
                        this.aZ = (byte) this.as;
                        v((byte) 3);
                    }
                } else if (this.e.as.a == 2) {
                    if (this.as == 5 || this.as == 4 || this.as == 9 || this.as == 10) {
                        this.aZ = (byte) this.as;
                        c((short) 4361, this.af, (byte) 2);
                    } else if (this.as == 3 || this.as == 8 || this.as == 2) {
                        this.aU = this.e.as.a;
                        c((short) 4664, this.af);
                    } else if (this.as == 0) {
                        v((byte) 1);
                    }
                } else if (this.e.as.a == 3) {
                    this.aU = this.e.as.a;
                    if (this.as == 7 || this.as == 2 || this.as == 3) {
                        d((short) 4666, this.af);
                    } else if (this.as == 4 || this.as == 5 || this.as == 6 || this.as == 10) {
                        c((short) 4664, this.af);
                    }
                } else if (this.e.as.a == 4) {
                    this.aU = this.e.as.a;
                    if (this.as == 9 || this.as == 4 || this.as == 5 || this.as == 6) {
                        d((short) 4666, this.af);
                    }
                }
            }
            if (i2 == 1 || i2 == 4 || i2 == 514 || i2 == 520) {
                if (this.as == 0 || this.as == 2 || this.as == 4 || this.as == 6) {
                    if (bt.hN == null || bt.hN.length <= 0) {
                        return;
                    }
                    this.e.at.b(au(this.e.ar.g()), t.i, (byte) 1);
                    this.e.at.a((byte) 1);
                } else if (this.as == 1 || this.as == 3 || this.as == 5) {
                    if (bt.hP == null || bt.hP.length <= 0) {
                        return;
                    }
                    this.e.at.b(bt.hR[this.e.ar.g()], t.i, (byte) 1);
                    this.e.at.a((byte) 1);
                } else if (this.as == 7 || this.as == 9) {
                    if (bt.hW != null) {
                        this.e.ar.a(bt.hW[this.e.ar.g()], 1);
                    }
                } else if ((this.as == 8 || this.as == 10) && bt.hZ != null) {
                    this.e.ar.a(bt.hZ[this.e.ar.g()], 1);
                }
            }
            if (i2 != 1073741824 && i2 != 517 && i2 != 268435456) {
                if (i2 == 536870912) {
                    this.as = -1;
                    this.aZ = (byte) -1;
                    m();
                    return;
                }
                return;
            }
            if (this.as == 0 && this.e.as.a == 0) {
                if (bt.hL != null) {
                    ca.a(t.f + 70, (t.j * 2) + 16 + (this.e.ar.i() * t.j) + t.g, new String[]{"购买", "取消"}, true);
                    this.l = (short) 1;
                    return;
                }
                return;
            }
            if (this.as == 1 && this.e.as.a == 1) {
                if (bt.hP != null) {
                    ca.a(t.f + 70, (t.j * 2) + 16 + (this.e.ar.i() * t.j) + t.g, new String[]{"进入", "拍卖", "消拍", "卖出"}, true);
                    this.l = (short) 2;
                    return;
                }
                return;
            }
            if (this.as == 2 && this.e.as.a == 0) {
                if (bt.hL != null) {
                    ca.a(t.f + 70, (t.j * 2) + 16 + (this.e.ar.i() * t.j) + t.g, new String[]{"购买"}, true);
                    this.l = (short) 3;
                    return;
                }
                return;
            }
            if (this.as == 3 && this.e.as.a == 1) {
                if (bt.hP != null) {
                    ca.a(t.f + 70, (t.j * 2) + 16 + (this.e.ar.i() * t.j) + t.g, new String[]{"布置", "卖出"}, true);
                    this.l = (short) 4;
                    return;
                }
                return;
            }
            if (this.as == 4 && this.e.as.a == 0) {
                if (bt.hL != null) {
                    ca.a(t.f + 70, (t.j * 2) + 16 + (this.e.ar.i() * t.j) + t.g, new String[]{"购买", "取消"}, true);
                    this.l = (short) 5;
                    return;
                }
                return;
            }
            if (this.as == 5 && this.e.as.a == 1) {
                if (bt.hP != null) {
                    ca.a(t.f + 70, (t.j * 2) + 16 + (this.e.ar.i() * t.j) + t.g, new String[]{"布置", "卖出"}, true);
                    this.l = (short) 6;
                    return;
                }
                return;
            }
            if (this.as == 6 && this.e.as.a == 2) {
                if (bt.hL != null) {
                    ca.a(t.f + 70, (t.j * 2) + 16 + (this.e.ar.i() * t.j) + t.g, new String[]{"升级", "取消"}, true);
                    this.l = (short) 8;
                    return;
                }
                return;
            }
            if ((this.as == 7 && this.e.as.a == 2) || (this.as == 9 && this.e.as.a == 3)) {
                if (bt.hV != null) {
                    this.l = (short) 9;
                    ca.h = 0;
                    return;
                }
                return;
            }
            if (!((this.as == 8 && this.e.as.a == 3) || (this.as == 10 && this.e.as.a == 4)) || bt.hX == null) {
                return;
            }
            ca.a(t.f + 70, (t.j * 2) + 16 + (this.e.ar.i() * t.j) + t.g, new String[]{"安排", "解约"}, true);
            this.l = (short) 10;
            return;
        }
        if (this.l != 1 && this.l != 2 && this.l != 3 && this.l != 4 && this.l != 5 && this.l != 6 && this.l != 8 && this.l != 10) {
            if (this.l != 7) {
                if (this.l == 9) {
                    if (i2 == 268435456 || i2 == 1073741824) {
                        a((short) 4665, String.valueOf((int) bt.t[this.af].a), (byte) 0, bt.hV[this.e.ar.g()], 0);
                        return;
                    } else {
                        if (i2 == 536870912) {
                            this.l = (short) 0;
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            ca.b(i2);
            if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                if (i2 == 536870912) {
                    this.l = (short) 0;
                    return;
                }
                return;
            }
            if (ca.o == 0) {
                this.l = (short) 0;
                return;
            }
            if (ca.o == 1) {
                if (this.as == 3) {
                    a((byte) 2, bt.hP[this.e.ar.g()], (byte) 3);
                    return;
                }
                if (this.as == 5) {
                    a((byte) 3, bt.hP[this.e.ar.g()], (byte) 3);
                    return;
                }
                if (this.as == 1) {
                    a((byte) 1, bt.hP[this.e.ar.g()], (byte) 1);
                    return;
                } else {
                    if (this.as == 8 || this.as == 10) {
                        a((short) 4665, String.valueOf((int) bt.t[this.af].a), (byte) 1, "", bt.hX[this.e.ar.g()]);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (this.as == 0) {
            ca.b(i2);
            if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                if (i2 == 536870912) {
                    this.l = (short) 0;
                    return;
                }
                return;
            } else if (ca.o == 0) {
                b((short) 4354, (byte) this.e.ar.g(), this.af);
                return;
            } else {
                if (ca.o == 1) {
                    this.l = (short) 0;
                    return;
                }
                return;
            }
        }
        if (this.as == 1) {
            ca.b(i2);
            if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                if (i2 == 536870912) {
                    this.l = (short) 0;
                    return;
                }
                return;
            } else if (ca.o == 0) {
                a((byte) 1, (short) bt.hP[this.e.ar.g()], bt.ad);
                return;
            } else if (ca.o != 3) {
                this.e.b("该功能稍后开放");
                return;
            } else {
                ca.a(t.f + 40, (t.j * 2) + 16 + (this.e.ar.i() * t.j) + t.g, new String[]{"取消", "确认"}, false);
                this.l = (short) 7;
                return;
            }
        }
        if (this.as == 2) {
            ca.b(i2);
            if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                if (i2 == 536870912) {
                    this.l = (short) 0;
                    return;
                }
                return;
            } else if (ca.o == 0) {
                b((short) 4359, (byte) this.e.ar.g(), this.af);
                return;
            } else {
                this.e.b("该功能稍后开放");
                return;
            }
        }
        if (this.as == 3) {
            ca.b(i2);
            if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                if (i2 == 536870912) {
                    this.l = (short) 0;
                    return;
                }
                return;
            } else if (ca.o == 0) {
                this.as = -1;
                this.aZ = (byte) -1;
                a(bt.hQ[this.e.ar.g()], bt.hP[this.e.ar.g()], bt.hS[this.e.ar.g()], bt.hT[this.e.ar.g()], (byte) 2);
                return;
            } else if (ca.o != 1) {
                this.e.b("该功能稍后开放");
                return;
            } else {
                ca.a(t.f + 40, (t.j * 2) + 16 + (this.e.ar.i() * t.j) + t.g, new String[]{"取消", "确认"}, false);
                this.l = (short) 7;
                return;
            }
        }
        if (this.as == 4) {
            ca.b(i2);
            if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                if (i2 == 536870912) {
                    this.l = (short) 0;
                    return;
                }
                return;
            } else if (ca.o == 0) {
                b((short) 4362, (byte) this.e.ar.g(), this.af);
                return;
            } else {
                this.l = (short) 0;
                return;
            }
        }
        if (this.as == 5) {
            ca.b(i2);
            if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                if (i2 == 536870912) {
                    this.l = (short) 0;
                    return;
                }
                return;
            } else if (ca.o == 0) {
                this.as = -1;
                this.aZ = (byte) -1;
                a(bt.hQ[this.e.ar.g()], bt.hP[this.e.ar.g()], bt.hS[this.e.ar.g()], bt.hT[this.e.ar.g()], (byte) 3);
                return;
            } else if (ca.o != 1) {
                this.l = (short) 0;
                return;
            } else {
                ca.a(t.f + 40, (t.j * 2) + 16 + (this.e.ar.i() * t.j) + t.g, new String[]{"取消", "确认"}, false);
                this.l = (short) 7;
                return;
            }
        }
        if (this.as == 6) {
            ca.b(i2);
            if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                if (i2 == 536870912) {
                    this.l = (short) 0;
                    return;
                }
                return;
            } else if (ca.o == 0) {
                b((short) 4362, (byte) this.e.ar.g(), this.af);
                return;
            } else {
                if (ca.o == 1) {
                    this.l = (short) 0;
                    return;
                }
                return;
            }
        }
        if (this.as == 8 || this.as == 10) {
            ca.b(i2);
            if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                if (i2 == 536870912) {
                    this.l = (short) 0;
                }
            } else if (ca.o == 0) {
                this.as = -1;
                this.aZ = (byte) -1;
                a("", -1, Short.parseShort(bt.ia[this.e.ar.g()]), (byte) 0, (byte) 5);
            } else if (ca.o == 1) {
                ca.a(t.f + 40, (t.j * 2) + 16 + (this.e.ar.i() * t.j) + t.g, new String[]{"取消", "确认"}, false);
                this.l = (short) 7;
            }
        }
    }

    private String au(int i2) {
        this.e.l.delete(0, this.e.l.length());
        int i3 = bt.hO[i2] >> 16;
        short s2 = (short) bt.hO[i2];
        this.e.l.append(bt.hN[i2]);
        this.e.l.append("\t");
        this.e.l.append("公共剩余:");
        if (i3 >= 0) {
            this.e.l.append(i3);
        } else {
            this.e.l.append("无限制");
        }
        this.e.l.append("\t");
        this.e.l.append("个人剩余:");
        if (s2 >= 0) {
            this.e.l.append((int) s2);
        } else {
            this.e.l.append("无限制");
        }
        return this.e.l.toString();
    }

    private void au() {
        a(new String[]{"好友", "聊天", "周围"});
        c(0);
        this.l = (short) 20;
        a.f.a(this.f, h, i, false, false, 1009050);
        this.k = (short) 1;
        this.j = (short) 1;
    }

    private void av() {
        if (t.a == 0) {
            a(new String[]{"属性", "技能", "特效", "装备", "配点", "称号", "成就", "活跃", "超Q"});
        } else {
            a(new String[]{"属性", "技能", "特效", "装备", "配点", "称号", "成就", "活跃"});
        }
        c(0);
        a.f.a(this.f, h, i, false, false, 1009050);
        this.l = (short) 3;
        this.k = (short) 1;
        this.j = (short) 1;
    }

    private void av(int i2) {
        byte[] bArrW = bz.w((short) 4668, bt.ad, i2);
        if (bArrW == null) {
            this.e.b("获取上传指令数据错误!");
        } else {
            a.i.a(new w((short) 4668, bArrW));
            this.e.a((String) null);
        }
    }

    private void aw() {
        if (t.a == 0) {
            a(new String[]{"豆城", "果城", "仓库", "充值", "说明"});
        } else {
            a(new String[]{"豆城", "仓库", "充值", "换豆", "余额", "说明"});
        }
        c(0);
        this.l = (short) 4;
        a.f.a(this.f, h, i, false, false, 1009050);
        this.k = (short) 1;
        this.j = (short) 1;
    }

    private void aw(int i2) {
        byte[] bArrL;
        if (this.l != 0) {
            if (this.l == 1) {
                if (this.e.aq != null) {
                    this.e.aq.b(i2);
                }
                if (i2 == 268435456 || i2 == 536870912 || i2 == 517 || i2 == 1073741824) {
                    this.l = (short) 0;
                    return;
                }
                return;
            }
            return;
        }
        if (i2 == 514 || i2 == 1) {
            ca.g = ca.g == 0 ? this.an.length - 1 : ca.g - 1;
            return;
        }
        if (i2 == 520 || i2 == 4) {
            ca.g = ca.g != this.an.length + (-1) ? ca.g + 1 : 0;
            return;
        }
        if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
            if (i2 == 536870912) {
                this.l = (short) 0;
                this.k = (short) 0;
                this.j = (short) 0;
                a aVar = this.e;
                this.e.k = (short) 7;
                aVar.j = (short) 7;
                return;
            }
            return;
        }
        if (bt.ib == 1) {
            a((byte) 2, L.c, ca.g);
        } else if (bt.ib == 2) {
            a((byte) 3, L.c, ca.g);
        } else if (bt.ib == 4) {
            aq aqVar = this.M;
            int i3 = L.c;
            int i4 = ca.g;
            if (L.j == null || L.j.length <= i4 || (bArrL = bz.l((short) 4238, bt.ad, i3, L.j[i4])) == null) {
                aqVar.b.b("获取上传指令数据错误!");
            } else {
                a.i.a(new w((short) 4238, bArrL));
                aqVar.b.a((String) null);
            }
        }
        aj = false;
        N();
        a aVar2 = this.e;
        this.e.k = (short) 7;
        aVar2.j = (short) 7;
    }

    private void ax() {
        a(new String[]{"设置", "帮助", "自动", "脱离", "角色", "退出"});
        c(0);
        this.l = (short) 5;
        this.k = (short) 1;
        this.j = (short) 1;
    }

    private void ax(int i2) {
        if (this.l == 0) {
            if (this.e.aq != null) {
                this.e.aq.b(i2);
            }
            if (bt.jz != null) {
                a(bt.jC);
                if ((i2 == 1 || i2 == 514 || i2 == 520 || i2 == 4) && bt.jD != null) {
                    this.e.at.b(bt.jD != null ? bt.jD[this.e.ar.g()] : null, t.i, (byte) 1);
                    this.e.at.a((byte) 1);
                }
                if (i2 == 268435456 || i2 == 1073741824 || i2 == 517) {
                    ca.a(o + 65, t.j + 20 + (this.e.ar.g() * t.j) + p, new String[]{"取回"}, true);
                    this.l = (short) 1;
                }
            }
            if (i2 == 536870912) {
                this.al = null;
                N();
                return;
            }
            return;
        }
        if (this.l == 1) {
            ca.b(i2);
            if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                if (i2 == 536870912) {
                    this.l = (short) 0;
                    return;
                }
                return;
            } else {
                if (ca.o == 0) {
                    a(bt.jB[this.e.ar.g()] > 99 ? 99L : bt.jB[this.e.ar.g()]);
                    this.l = (short) 2;
                    return;
                }
                return;
            }
        }
        if (this.l == 2) {
            b(i2);
            if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
                if (i2 == 536870912) {
                    this.l = (short) 0;
                }
            } else {
                byte[] bArrC = bz.c((short) 4249, bt.ad, bt.jz[this.e.ar.g()], (byte) this.ag);
                if (bArrC == null) {
                    this.e.b("获取上传指令数据错误!");
                } else {
                    a.i.a(new w((short) 4249, bArrC));
                    this.e.a((String) null);
                }
            }
        }
    }

    private void ay(int i2) {
        if (this.l == 0) {
            this.e.aq.b(i2);
            if (i2 == 4 || i2 == 1) {
                if (this.e.as.a == 0) {
                    if (bt.jN != null) {
                        this.e.ar.a(bt.h(this.e.l, this.e.ar.g()), 1);
                        return;
                    }
                    return;
                } else {
                    if (this.e.as.a != 1 || bt.ct == null) {
                        return;
                    }
                    this.e.ar.a(bt.a(this.k, this.e.l, this.e.ar.g()), 1);
                    return;
                }
            }
            if (i2 == 8 || i2 == 2) {
                if (this.e.as.a == 0 && this.aV != 0) {
                    bt.gQ = (short) 1;
                    a((byte) 0, bt.gQ);
                    this.aV = this.e.as.a;
                    return;
                } else if (this.e.as.a == 1) {
                    bt.gQ = (short) 1;
                    c((byte) 0, bt.gQ);
                    this.aV = this.e.as.a;
                    return;
                } else {
                    if (this.e.as.a != 2 || this.aV == 2) {
                        return;
                    }
                    bt.gQ = (short) 1;
                    b((byte) 0, bt.gQ);
                    this.aV = this.e.as.a;
                    return;
                }
            }
            if (i2 == 268435456 || i2 == 1073741824 || i2 == 517) {
                if (this.e.as.a == 0 && bt.jN != null) {
                    ca.a(o + 35, ((this.e.ar.i() + 3) * t.j) + p, bt.a(bt.jQ[this.e.ar.g()]) ? new String[]{"查看", "取消拍卖"} : new String[]{"取消拍卖"}, false);
                    this.l = (short) 1;
                    return;
                } else {
                    if (this.e.as.a != 1 || bt.ct == null) {
                        return;
                    }
                    ca.a(o + 35, ((this.e.ar.i() + 3) * t.j) + p, bt.a(bt.cv[this.e.ar.g()]) ? new String[]{"查看", "拍卖", "取回"} : new String[]{"拍卖", "取回"}, false);
                    this.l = (short) 2;
                    return;
                }
            }
            if (i2 == 536870912) {
                m();
                ca.g = this.ai;
                return;
            }
            if (i2 == 1024) {
                if (bt.gQ > 1) {
                    if (this.e.as.a == 0) {
                        a((byte) 0, (short) (bt.gQ + (-1) <= 1 ? 1 : bt.gQ - 1));
                        return;
                    } else if (this.e.as.a == 1) {
                        c((byte) 0, (short) (bt.gQ + (-1) > 1 ? bt.gQ - 1 : 1));
                        return;
                    } else {
                        b((byte) 0, (short) (bt.gQ + (-1) > 1 ? bt.gQ - 1 : 1));
                        return;
                    }
                }
                return;
            }
            if (i2 == 2048 && bt.gR == 1) {
                if (this.e.as.a == 0) {
                    a((byte) 0, (short) (bt.gQ + 1));
                    return;
                } else if (this.e.as.a == 1) {
                    c((byte) 0, (short) (bt.gQ + 1));
                    return;
                } else {
                    b((byte) 0, (short) (bt.gQ + 1));
                    return;
                }
            }
            return;
        }
        if (this.l == 1) {
            ca.b(i2);
            if (i2 != 1073741824 && i2 != 268435456 && i2 != 517) {
                if (i2 == 536870912) {
                    this.l = (short) 0;
                    return;
                }
                return;
            }
            if (!bt.a(bt.jQ[this.e.ar.g()])) {
                if (ca.o == 0) {
                    this.l = (short) 3;
                    ca.h = 0;
                    return;
                }
                return;
            }
            if (ca.o != 0) {
                if (ca.o == 1) {
                    this.l = (short) 3;
                    ca.h = 0;
                    return;
                }
                return;
            }
            if (this.e.as.a == 0) {
                bt.e(this.e.ar.g());
            } else {
                bt.c(this.e.ar.g());
            }
            this.aq = this.e.ar.g();
            this.aA = this.e.ar.h();
            this.O.a(0, this.k, (int) this.cZ);
            return;
        }
        if (this.l == 2) {
            ca.b(i2);
            if (i2 != 1073741824 && i2 != 268435456 && i2 != 517) {
                if (i2 == 536870912) {
                    this.l = (short) 0;
                    return;
                }
                return;
            }
            if (!bt.a(bt.cv[this.e.ar.g()])) {
                if (ca.o == 0) {
                    this.l = (short) 4;
                    return;
                } else {
                    if (ca.o == 1) {
                        ad(bt.ct[this.e.ar.g()]);
                        return;
                    }
                    return;
                }
            }
            if (ca.o == 0) {
                if (this.e.as.a == 0) {
                    bt.e(this.e.ar.g());
                } else {
                    bt.c(this.e.ar.g());
                }
                this.aq = this.e.ar.g();
                this.aA = this.e.ar.h();
                this.O.a(0, this.k, (int) this.cZ);
                return;
            }
            if (ca.o == 1) {
                this.l = (short) 4;
                return;
            } else {
                if (ca.o == 2) {
                    ad(bt.ct[this.e.ar.g()]);
                    return;
                }
                return;
            }
        }
        if (this.l == 3) {
            if (i2 == 1073741824 || i2 == 268435456 || i2 == 517) {
                a((byte) 0, bt.jN[this.e.ar.g()]);
                return;
            } else {
                if (i2 == 536870912) {
                    this.l = (short) 1;
                    return;
                }
                return;
            }
        }
        if (this.l != 4) {
            if (this.l == 5) {
                if (i2 == 1073741824 || i2 == 268435456 || i2 == 517) {
                    a((byte) 0, bt.ct[this.e.ar.g()], this.bR);
                    return;
                } else {
                    if (i2 == 536870912) {
                        this.l = (short) 2;
                        o();
                        return;
                    }
                    return;
                }
            }
            return;
        }
        d(i2);
        this.bR = n();
        if (i2 != 1073741824 && i2 != 268435456) {
            if (i2 == 536870912) {
                this.l = (short) 2;
                o();
                return;
            }
            return;
        }
        if (n() <= 0) {
            this.e.b("输入金钱必须大于0!");
            return;
        }
        this.l = (short) 5;
        ca.h = 0;
        o();
    }

    private boolean ay() {
        if (!t.x) {
            return true;
        }
        this.e.b("该功能暂不支持");
        return false;
    }

    private void az() {
        this.e.aq.b();
        this.e.aq.a("商城必看");
        if (bt.n == null || bt.n.equals("")) {
            this.e.at.b("正在同步数据，请稍候！", t.i, (byte) 2);
        } else {
            this.e.at.b(bt.n, t.i, (byte) 2);
        }
        this.e.aq.a(this.e.at);
        this.e.aq.a(t.f, t.g, t.d, t.e);
        this.k = (short) 94;
        this.j = (short) 94;
    }

    private void az(int i2) {
        if (this.e.aq != null) {
            this.e.aq.b(i2);
        }
        if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
            if (i2 == 536870912) {
                bt.L();
                aw();
                c(bt.kI == 0 ? 0 : 1);
                return;
            }
            return;
        }
        this.aA = this.e.ar.h();
        this.aU = this.e.ar.g();
        byte[] bArrA = bz.a((short) 4649, bt.kI, (short) this.e.ar.g(), bt.ad);
        if (bArrA == null) {
            this.e.b("获取上传指令数据错误!");
        } else {
            a.i.a(new w((short) 4649, bArrA));
            this.e.a((String) null);
        }
    }

    public static bf b(short s2) {
        bf bfVarA = a.af.a(String.valueOf((int) s2));
        return bfVarA == null ? a.af.a(String.valueOf(-1000)) : bfVarA;
    }

    private void b(byte b2, byte b3) {
        byte[] bArrC = bz.c((short) 4134, bt.ad, b2, b3);
        if (bArrC != null) {
            a.i.a(new w((short) 4134, bArrC));
        } else {
            this.e.b("获取上传指令数据错误!");
        }
    }

    private void b(byte b2, short s2) {
        byte[] bArrB = bz.b((short) 4632, bt.ad, b2, s2);
        if (bArrB == null) {
            this.e.b("获取上传指令数据错误!");
            return;
        }
        a.i.a(new w((short) 4632, bArrB));
        this.e.a((String) null);
    }

    private void b(int i2, byte b2) {
        byte[] bArrA = b2 == 0 ? bz.a((byte) 2, bt.mx, bt.mD, bt.mJ, i2, (byte) this.bf) : bz.a((byte) 5, bt.mx, bt.mD, bt.mJ, i2, (byte) this.bf);
        if (bArrA == null) {
            this.e.b("获取上传指令数据错误!");
        } else {
            a.i.a(new w((short) 4681, bArrA));
            this.e.a((String) null);
        }
    }

    private void b(int i2, int i3, int i4, int i5) {
        if (this.cB != null && this.cB.length > i2) {
            this.cB[i2][0] = i3;
            this.cB[i2][1] = i4;
            this.cB[i2][2] = 12;
            this.cB[i2][3] = t.j;
        }
        if (this.cC == null || this.cC.length <= i2) {
            return;
        }
        this.cC[i2][0] = (i3 + 60) - 12;
        this.cC[i2][1] = i4;
        this.cC[i2][2] = 12;
        this.cC[i2][3] = t.j;
    }

    private void b(int i2, int i3, int i4, int i5, int i6) {
        if (this.bP == null || this.bP.length <= i2) {
            return;
        }
        this.bP[i2][0] = i3;
        this.bP[i2][1] = i4;
        this.bP[i2][2] = i5;
        this.bP[i2][3] = i6;
    }

    private static void b(ce ceVar) {
        ck.insertElementAt(ceVar, 0);
        int i2 = 0;
        for (int i3 = 0; i3 < ck.size(); i3++) {
            if (((ce) ck.elementAt(i3)).b == ceVar.b && (i2 = i2 + 1) >= aW[1]) {
                ck.removeElementAt(i3);
                return;
            }
        }
    }

    private void b(Graphics graphics) {
        int iMin = Math.min((t.b / this.bC) - 2, t.i.stringWidth("字符长") + 12);
        int i2 = t.j + 10;
        int i3 = (t.b - (this.bC * iMin)) / 2;
        int i4 = (t.c - (this.bD * i2)) / 2;
        graphics.setColor(6732228);
        int i5 = this.bC * iMin;
        int i6 = this.bD * i2;
        if (this.bF != null) {
            this.bF[0] = i3;
            this.bF[1] = i4;
            this.bF[2] = i5;
            this.bF[3] = i6;
        }
        graphics.fillRect(i3, i4, this.bC * iMin, this.bD * i2);
        for (int i7 = 0; i7 < this.bD; i7++) {
            for (int i8 = 0; i8 < this.bC; i8++) {
                ca.a(graphics, 4);
                graphics.drawRect((i8 * iMin) + i3 + 1, (i7 * i2) + i4, iMin - 2, i2);
                graphics.drawRect((i8 * iMin) + i3, (i7 * i2) + i4 + 1, iMin, i2 - 2);
                ca.a(graphics, 3);
                graphics.drawRect((i8 * iMin) + i3 + 2, (i7 * i2) + i4 + 2, iMin - 3, i2 - 3);
                if (this.bB == (this.bC * i7) + i8) {
                    graphics.setColor(2780801);
                    graphics.fillRect((i8 * iMin) + i3 + 3, (i7 * i2) + i4 + 3, iMin - 4, i2 - 4);
                }
                if ((this.bC * i7) + i8 < this.bA.length) {
                    graphics.setColor(this.bB == (this.bC * i7) + i8 ? 16777215 : 1855685);
                    int i9 = (this.bC * i7) + i8;
                    int i10 = (i8 * iMin) + i3;
                    int i11 = (i7 * i2) + i4;
                    if (this.bE != null && this.bE.length > i9) {
                        this.bE[i9][0] = i10;
                        this.bE[i9][1] = i11;
                        this.bE[i9][2] = iMin;
                        this.bE[i9][3] = i2;
                    }
                    graphics.drawString(this.bA[(this.bC * i7) + i8], (i8 * iMin) + i3 + (iMin / 2), (i7 * i2) + i4 + 5, 17);
                }
            }
        }
        ca.f(graphics, i3, i4, this.bC * iMin, this.bD * i2);
        if (this.l == 6) {
            ca.a(graphics, "您真的要退出帮派吗？", new String[]{"确定", "返回"});
        } else if (this.l == 7) {
            ca.a(graphics, "您确定要退出游戏吗？", new String[]{"确定", "返回"});
        }
        if (this.l == 8) {
            a(graphics, "输入数量");
        }
    }

    private void b(short s2, byte b2) {
        byte[] bArrD = bz.d(s2, bt.ad, bt.t[b2].a);
        if (bArrD == null) {
            this.e.b("获取上传指令数据错误!");
        } else {
            a.i.a(new w(s2, bArrD));
            this.e.a((String) null);
        }
    }

    private void b(short s2, byte b2, byte b3) {
        byte[] bArrA = bz.a(s2, bt.ad, bt.hL[b2], (int) bt.t[b3].a);
        if (bArrA == null) {
            this.e.b("获取上传指令数据错误!");
        } else {
            a.i.a(new w(s2, bArrA));
            this.e.a((String) null);
        }
    }

    private void b(short s2, short s3, short s4, short s5) {
        for (int i2 = 1; i2 <= 3; i2++) {
            t.ag.delete(0, t.ag.length());
            t.ag.append((int) s2).append(i2);
            this.cO[this.cT] = t.ag.toString();
            this.cP[0][this.cT] = s3;
            this.cP[1][this.cT] = s4;
            this.cP[2][this.cT] = s5;
            this.cT = (byte) (this.cT + 1);
        }
    }

    private void b(boolean z2, byte b2) {
        byte[] bArrA = bz.a((short) 4193, bt.ad, bt.fA[this.ay], this.az, z2 ? (byte) 1 : (byte) 0, z2 ? bt.dl[this.e.ar.g()] : -1);
        if (bArrA == null) {
            this.e.b("获取上传指令数据错误!");
        } else {
            a.i.a(new w((short) 4193, bArrA));
            this.e.a((String) null);
        }
    }

    public static Image[] b(short[] sArr) {
        if (sArr == null || sArr.length <= 0) {
            return null;
        }
        if (sArr == null) {
            return null;
        }
        Image[] imageArr = new Image[sArr.length];
        for (int i2 = 0; i2 < sArr.length; i2++) {
            bf bfVarB = b(sArr[i2]);
            if (bfVarB != null) {
                imageArr[i2] = bfVarB.a;
            } else {
                imageArr[i2] = null;
            }
        }
        return imageArr;
    }

    private void ba() {
        byte[] bArrY = bz.y((short) 4659, bt.ad);
        if (bArrY == null) {
            this.e.b("获取上传指令数据错误!");
            return;
        }
        a.i.a(new w((short) 4659, bArrY));
        this.e.a((String) null);
    }

    private void ba(int i2) {
        this.e.aq.b(i2);
        this.di.b(i2);
        this.dj.b(i2);
        if (this.dk != null && this.dk.length > 0) {
            for (int i3 = 0; i3 < this.dk.length; i3++) {
                ai.a(this.dk[i3], this.e.ak);
            }
        }
        if (i2 == 1073741824 || i2 == 517 || i2 == -7) {
            a((byte) 1, this.dl, (short) 0);
            return;
        }
        if (i2 == 268435456) {
            if (this.dk == null || this.dk.length <= 0) {
                return;
            }
            if (bt.nu[this.dl] == bt.nm) {
                if (bt.nn.equals("")) {
                    a((byte) 2, bt.nu[this.dl], (short) 0);
                    return;
                } else {
                    a((byte) 4, bt.nu[this.dl], (short) 0);
                    return;
                }
            }
            if (bt.nw[this.dl] == 0) {
                a((byte) 5, bt.nu[this.dl], (short) 0);
                return;
            } else {
                a((byte) 2, bt.nu[this.dl], (short) 0);
                return;
            }
        }
        if (i2 == 8) {
            if (this.dk == null || this.dk.length <= 0 || this.dl <= 0) {
                return;
            }
            this.dl = (byte) (this.dl - 1);
            be();
            return;
        }
        if (i2 == 2) {
            if (this.dk == null || this.dk.length <= 0 || this.dl >= this.dk.length - 1) {
                return;
            }
            this.dl = (byte) (this.dl + 1);
            be();
            return;
        }
        if (i2 == 536870912) {
            this.di.j();
            this.di = null;
            this.dj.j();
            this.dj = null;
            at();
            c(6);
        }
    }

    private void bb() {
        byte[] bArrB = bz.b((short) 4267);
        if (bArrB != null) {
            a.i.a(new w((short) 4267, bArrB));
        } else {
            this.e.b("获取上传指令数据错误!");
        }
    }

    private void bb(int i2) {
        this.e.aq.b(i2);
        if (i2 == 536870912) {
            if (this.du) {
                this.du = false;
                return;
            }
            bt.W();
            this.dv = null;
            this.k = (short) 2;
            this.j = (short) 2;
            return;
        }
        if (i2 == 8 || i2 == 516) {
            this.aq = this.aq <= 0 ? this.aq : this.aq - 1;
            this.du = true;
            ca.l = 0;
            return;
        }
        if (i2 == 2 || i2 == 518) {
            this.aq = this.aq >= 3 ? this.aq : this.aq + 1;
            this.du = true;
            ca.l = 0;
        } else if (i2 == 268435456 || i2 == 1073741824 || i2 == 517) {
            byte[] bArrA = bz.a((byte) 1);
            if (bArrA == null) {
                this.e.b("获取上传指令数据错误!");
            } else {
                a.i.a(new w((short) 4683, bArrA));
                this.e.a((String) null);
            }
        }
    }

    private void bc() {
        byte[] bArrH = bz.h((short) 4120, bt.ad);
        if (bArrH == null) {
            this.e.b("获取上传指令数据错误!");
        } else {
            a.i.a(new w((short) 4120, bArrH));
            this.e.b("解散队伍请求已发送!");
        }
    }

    private void bc(int i2) {
        this.e.aq.b(i2);
        if (this.l != 0) {
            if (this.l == 1) {
                ca.b(i2);
                if (i2 == 268435456 || i2 == 1073741824) {
                    a((byte) 6, bt.nx[this.e.ar.g()], bt.dl[this.aU]);
                    return;
                } else {
                    if (i2 == 536870912) {
                        this.l = (short) 0;
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (i2 == 536870912) {
            bt.X();
            h(0);
            return;
        }
        if (bt.nx == null || bt.nx.length <= 0) {
            return;
        }
        if (i2 == 1 || i2 == 4) {
            this.e.at.b(bt.nA[this.e.ar.g()], t.i, (byte) 2);
        } else if (i2 == 268435456 || i2 == 1073741824) {
            ca.a((t.d / 3) - (t.i.stringWidth("操作") / 2), (t.j * 3) + 11 + (this.e.ar.i() * t.j) + t.g, new String[]{"激活"}, true);
            this.l = (short) 1;
        }
    }

    private void bd() {
        byte[] bArrI = bz.i((short) 4121, bt.ad);
        if (bArrI == null) {
            this.e.b("获取上传指令数据错误!");
        } else {
            a.i.a(new w((short) 4121, bArrI));
            this.e.b("脱离队伍请求已发送!");
        }
    }

    private void be() {
        if (bt.nu[this.dl] == bt.nm) {
            if (!bt.nn.equals("")) {
                this.e.au.a(this.f0do);
                return;
            }
        } else if (bt.nw[this.dl] == 0) {
            this.e.au.a(this.dq);
            return;
        }
        this.e.au.a(this.dp);
    }

    private void c(byte b2, short s2) {
        byte[] bArrC = bz.c((short) 4150, bt.ad, b2, s2);
        if (bArrC == null) {
            this.e.b("获取上传指令数据错误!");
            return;
        }
        a.i.a(new w((short) 4150, bArrC));
        this.e.a((String) null);
    }

    private void c(int i2, byte b2) {
        byte[] bArrA = this.bf == 0 ? b2 == 0 ? bz.a((byte) 0, i2, bt.mD, bt.mJ, -1, (byte) this.bf) : bz.a((byte) 3, i2, bt.mD, bt.mJ, -1, (byte) this.bf) : b2 == 0 ? bz.a((byte) 1, bt.mx, i2, bt.mJ, -1, (byte) this.bf) : bz.a((byte) 4, bt.mx, i2, bt.mJ, -1, (byte) this.bf);
        if (bArrA == null) {
            this.e.b("获取上传指令数据错误!");
        } else {
            a.i.a(new w((short) 4681, bArrA));
            this.e.a((String) null);
        }
    }

    private void c(int i2, int i3, int i4, int i5, int i6) {
        if (this.bV == null || this.bV.length <= i2) {
            return;
        }
        this.bV[i2][0] = i3;
        this.bV[i2][1] = i4;
        this.bV[i2][2] = i5;
        this.bV[i2][3] = i6;
    }

    private void c(Graphics graphics) {
        if (this.e.aq != null) {
            this.e.aq.a(graphics);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x045a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void c(javax.microedition.lcdui.Graphics r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 1120
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ao.c(javax.microedition.lcdui.Graphics, java.lang.String):void");
    }

    private void c(short s2, byte b2) {
        byte[] bArrE = bz.e((short) 4664, bt.ad, bt.t[b2].a);
        if (bArrE == null) {
            this.e.b("获取上传指令数据错误!");
        } else {
            a.i.a(new w((short) 4664, bArrE));
            this.e.a((String) null);
        }
    }

    private void c(short s2, byte b2, byte b3) {
        byte[] bArrA = bz.a((short) 4361, bt.ad, bt.t[b2].a, b3);
        if (bArrA == null) {
            this.e.b("获取上传指令数据错误!");
        } else {
            a.i.a(new w((short) 4361, bArrA));
            this.e.a((String) null);
        }
    }

    private void c(short s2, short s3, short s4, short s5) {
        for (int i2 = 1; i2 <= 3; i2++) {
            t.ag.delete(0, t.ag.length());
            t.ag.append((int) s2).append(i2);
            this.cQ[this.cU] = t.ag.toString();
            this.cR[0][this.cU] = s3;
            this.cR[1][this.cU] = s4;
            this.cR[2][this.cU] = s5;
            this.cU = (byte) (this.cU + 1);
        }
    }

    public static void c(short[] sArr) {
        if (a.af.b() <= 70 || sArr == null) {
            return;
        }
        for (int i2 = 0; i2 < sArr.length; i2++) {
            if (sArr[i2] != -1) {
                int iA = bu.a(String.valueOf((int) sArr[i2]).toCharArray());
                if (a.af.b(iA)) {
                    a.af.a(iA);
                }
                if (a.af.b() <= 70) {
                    return;
                }
            }
        }
    }

    private static boolean c(int i2, int i3, int i4, int i5) {
        int i6 = h;
        int i7 = i;
        return (i2 - i6) + i4 >= 0 && i2 - i6 <= t.b && (i3 - i7) + i5 >= 0 && i3 - i7 <= t.c;
    }

    private void d(int i2, int i3, int i4, int i5, int i6) {
        if (this.cx == null || this.cx.length <= i2) {
            return;
        }
        this.cx[i2][0] = i3;
        this.cx[i2][1] = i4;
        this.cx[i2][2] = i5;
        this.cx[i2][3] = i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x02df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void d(javax.microedition.lcdui.Graphics r22) {
        /*
            Method dump skipped, instructions count: 738
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ao.d(javax.microedition.lcdui.Graphics):void");
    }

    private void d(short s2, byte b2) {
        byte[] bArrF = bz.f((short) 4666, bt.ad, bt.t[b2].a);
        if (bArrF == null) {
            this.e.b("获取上传指令数据错误!");
        } else {
            a.i.a(new w((short) 4666, bArrF));
            this.e.a((String) null);
        }
    }

    private static String[] d(short[] sArr) {
        if (sArr == null) {
            return null;
        }
        String[] strArr = new String[sArr.length];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            strArr[i2] = new StringBuffer().append("").append((int) sArr[i2]).append("级").toString();
        }
        return strArr;
    }

    private void e(String str) {
        byte[] bArrB = bz.b((short) 4124, bt.ad, str, (byte) ca.o);
        if (bArrB == null) {
            this.e.b("获取上传指令数据错误!");
        } else {
            a.i.a(new w((short) 4124, bArrB));
            this.e.a((String) null);
        }
    }

    private void e(Graphics graphics) {
        int i2;
        int i3;
        if (this.l != 2) {
            if (q == null || a.O == null || a.R == null) {
                i2 = 0;
                i3 = 0;
            } else {
                i3 = (t.b - a.O.b) / 2;
                int i4 = (t.c - a.O.c) / 2;
                graphics.drawImage(a.O.a, i3, i4, 20);
                a(i3, i4, a.O.b, a.O.c);
                for (int i5 = 0; i5 < this.bY.length; i5++) {
                    if (i5 < a.R.length) {
                        this.bZ = a.R[i5].a;
                    } else if (i5 == 8) {
                        this.bZ = a.R[1].a;
                    } else if (i5 == 9) {
                        this.bZ = a.R[7].a;
                    }
                    graphics.drawImage(this.bZ, this.bY[i5][0] + i3, this.bY[i5][1] + i4, 20);
                    c(i5, i3 + this.bY[i5][0], i4 + this.bY[i5][1], a.R[0].b, a.R[0].c);
                }
                a.f.a(graphics, q, (int[]) null, 0, 0, i3 + (a.O.b / 2), q.j() + ((a.O.c - q.j()) / 2) + i4, 20, 0);
                i2 = i4;
            }
            graphics.setColor(10092544);
            ca.d(graphics, this.bY[this.av][0] + i3, this.bY[this.av][1] + i2, 17, 17);
            int[] iArr = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
            if (bt.cz != null) {
                int i6 = 0;
                while (true) {
                    int i7 = i6;
                    if (i7 >= bt.cz.length) {
                        break;
                    }
                    a.f.a(graphics, b(bt.cC[i7]), (int[]) null, (aj) null, 0, 0, this.bY[bt.cB[i7]][0] + i3 + 1, this.bY[bt.cB[i7]][1] + i2 + 1, 0, 0);
                    iArr[bt.cB[i7]] = i7;
                    i6 = i7 + 1;
                }
            }
            if (iArr[this.av] >= 0) {
                if (this.av < 3) {
                    ca.a(graphics, bt.cA[iArr[this.av]], bt.a(this.e.l, this.av, false), this.bY[this.av][0] + i3 + 16, i2 + this.bY[this.av][1], 40);
                } else if (this.av < 5) {
                    ca.a(graphics, bt.cA[iArr[this.av]], bt.a(this.e.l, this.av, false), this.bY[this.av][0] + i3 + 16, this.bY[this.av][1] + i2 + 16, 24);
                } else if (this.av < 7) {
                    ca.a(graphics, bt.cA[iArr[this.av]], bt.a(this.e.l, this.av, false), i3 + this.bY[this.av][0], this.bY[this.av][1] + i2 + 16, 20);
                } else {
                    ca.a(graphics, bt.cA[iArr[this.av]], bt.a(this.e.l, this.av, false), i3 + this.bY[this.av][0], i2 + this.bY[this.av][1], 36);
                }
            } else if (this.av < 3) {
                ca.a(graphics, t.M[this.av], "", this.bY[this.av][0] + i3 + 16, i2 + this.bY[this.av][1], 40);
            } else if (this.av < 5) {
                ca.a(graphics, t.M[this.av], "", this.bY[this.av][0] + i3 + 16, this.bY[this.av][1] + i2 + 16, 24);
            } else if (this.av < 7) {
                ca.a(graphics, t.M[this.av], "", i3 + this.bY[this.av][0], this.bY[this.av][1] + i2 + 16, 20);
            } else {
                ca.a(graphics, t.M[this.av], "", i3 + this.bY[this.av][0], i2 + this.bY[this.av][1], 36);
            }
            if (this.l == 1) {
                ca.c(graphics);
                return;
            }
            return;
        }
        if (this.l != 2) {
            return;
        }
        if (this.e.aq != null) {
            this.e.aq.a(30);
            this.e.aq.a(graphics);
            ca.a(graphics, this.e.aq.a + 5, this.e.aq.b + 32, this.e.aq.c - 11, 30, 1);
            ca.a(graphics, "宝石", this.e.aq.a + 10, t.a(25) + this.e.aq.b + 35, 20, 16776960, 0);
        }
        if (bt.cD == null) {
            return;
        }
        int i8 = 0;
        while (true) {
            int i9 = i8;
            if (i9 >= bt.cD.length) {
                return;
            }
            if (bt.cB[i9] == this.av && bt.cD[i9] != null) {
                a(graphics, this.e.aq.a + 10 + t.i.stringWidth("宝石:"), this.e.aq.b + 37, 17, 17, bt.cD[i9].length, 1);
                byte b2 = 0;
                while (true) {
                    byte b3 = b2;
                    if (b3 < bt.cD[i9].length) {
                        if (bt.cD[i9][b3] <= -1) {
                            ca.a(graphics, 125269879, 207, (b3 * 17) + this.e.aq.a + 10 + t.i.stringWidth("宝石:") + 2, this.e.aq.b + 39, 17, 17);
                        }
                        if (bt.cD[i9][b3] > 0) {
                            a.f.a(graphics, b(bt.cD[i9][b3]), (int[]) null, (aj) null, 0, 0, (b3 * 17) + this.e.aq.a + 10 + t.i.stringWidth("宝石:") + 2, this.e.aq.b + 39, 0, 0);
                        }
                        b2 = (byte) (b3 + 1);
                    }
                }
            }
            i8 = i9 + 1;
        }
    }

    private static String[] e(short[] sArr) {
        if (sArr == null || sArr.length <= 0) {
            return null;
        }
        String[] strArr = new String[sArr.length];
        for (int i2 = 0; i2 < sArr.length; i2++) {
            strArr[i2] = new StringBuffer().append((int) sArr[i2]).append("级").toString();
        }
        return strArr;
    }

    private void f(String str) {
        byte[] bArrA = bz.a((short) 4671, bt.ad, str, bt.O.d);
        if (bArrA == null) {
            this.e.b("获取上传指令数据错误!");
        } else {
            a.i.a(new w((short) 4671, bArrA));
            this.e.a((String) null);
        }
    }

    private void f(Graphics graphics) {
        if (this.e.aq != null && this.l != 4 && this.l != 12) {
            this.e.aq.a(graphics);
        }
        if (this.e.as.a == 3) {
            if (this.e.as.a != 3 || bt.q == null) {
                return;
            }
            if (this.l == 8 || this.l == 9 || this.l == 10) {
                ca.c(graphics);
                return;
            } else if (this.l == 11) {
                this.T.a(graphics);
                return;
            } else {
                if (this.l == 12) {
                    a(graphics, bt.q[this.e.ar.g()].e, q);
                    return;
                }
                return;
            }
        }
        if (this.l != 1) {
            if (this.l == 2 || this.l == 5 || this.l == 6) {
                ca.c(graphics);
                return;
            }
            if (this.l == 3) {
                this.T.a(graphics);
                return;
            } else if (this.l == 4) {
                a(graphics, bt.gJ[this.e.ar.g()], q);
                return;
            } else {
                if (this.l == 7) {
                    b(graphics, "请输入决斗金额");
                    return;
                }
                return;
            }
        }
        if (bt.bw < 1) {
            ca.c(graphics);
            return;
        }
        int[] iArr = new int[ca.p.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (i2 == 2 || i2 == 3) {
                if (bt.gP[this.e.ar.g()] == 2 || bt.gP[this.e.ar.g()] == 3) {
                    iArr[i2] = 1;
                } else {
                    iArr[i2] = 0;
                }
            } else if (i2 != 6) {
                iArr[i2] = 0;
            } else if (bt.gP[this.e.ar.g()] == 0 || bt.gP[this.e.ar.g()] == 1) {
                iArr[i2] = 1;
            } else {
                iArr[i2] = 0;
            }
        }
        ca.a(iArr);
        ca.c(graphics);
    }

    private void f(short s2) {
        if (this.e.aC == null || this.e.aE == null || !this.e.g) {
            return;
        }
        byte selectedIndex = (byte) this.e.aE.getSelectedIndex();
        if (selectedIndex == 0) {
            if (bt.ak < 9) {
                this.e.g = false;
                this.e.n();
                this.e.b("需要九级才能使用世界频道!");
                return;
            } else {
                a((String) null, selectedIndex);
                this.e.n();
                if (this.l >= 0) {
                    this.l = (short) -1;
                    return;
                }
                return;
            }
        }
        if (selectedIndex == 2) {
            if (bt.bs == -1) {
                this.e.g = false;
                this.e.n();
                this.e.b("没有队伍,不能使用队伍频道!");
                return;
            } else {
                a((String) null, selectedIndex);
                this.e.n();
                if (this.l >= 0) {
                    this.l = (short) -1;
                    return;
                }
                return;
            }
        }
        if (selectedIndex == 3) {
            if (bt.az.equals("无")) {
                this.e.g = false;
                this.e.n();
                this.e.b("没有帮派,不能使用帮派频道!");
                return;
            } else {
                a((String) null, selectedIndex);
                this.e.n();
                if (this.l >= 0) {
                    this.l = (short) -1;
                    return;
                }
                return;
            }
        }
        if (selectedIndex == 4) {
            a((String) null, (byte) (selectedIndex + 2));
            this.e.n();
            if (this.l >= 0) {
                this.l = (short) -1;
                return;
            }
            return;
        }
        a((String) null, selectedIndex);
        this.e.n();
        if (this.l >= 0) {
            this.l = (short) -1;
        }
    }

    private void g(String str) {
        byte[] bArrS = bz.s((short) 4675, bt.ad, str);
        if (bArrS == null) {
            this.e.b("获取上传指令数据错误!");
        } else {
            a.i.a(new w((short) 4675, bArrS));
            this.e.a((String) null);
        }
    }

    private void g(Graphics graphics) {
        if (this.e.aq != null) {
            this.e.aq.a(graphics);
        }
        if (this.l == 1 || this.l == 3 || this.l == 5) {
            ca.c(graphics);
            return;
        }
        if (this.l == 2) {
            a(graphics, (t.b - 176) / 2, (t.c - 20) / 2, 1);
            for (int i2 = 0; i2 < bt.ep.length; i2++) {
                if (i2 == this.az) {
                    ca.d(graphics, (i2 * 17) + ((t.b - 176) / 2) + 2, ((t.c - 20) / 2) + 2, 17, 17);
                    return;
                }
            }
        }
    }

    private void g(short s2) {
        String str;
        byte b2;
        if (ca.v <= 0 || this.e.as.a == 1) {
            if (this.e.as.a != 6) {
                aK();
                return;
            }
            return;
        }
        if (ca.w >= aP.size() || aP.size() < 1) {
            aK();
            return;
        }
        if (this.e.as.a == 7) {
            aK();
            return;
        }
        this.cq = aP.size() > 0 ? (b) aP.elementAt(ca.w) : null;
        if (this.cq == null || this.cq.equals("")) {
            aK();
            return;
        }
        int iIndexOf = this.cq.a.indexOf("[");
        if (iIndexOf == 0) {
            this.aQ = this.cq.a.substring(iIndexOf + 1, this.cq.a.indexOf("]"));
            if (this.aQ == null || this.aQ.equals("") || this.aQ.equals(bt.af) || this.aQ.equals("系统") || this.aQ.equals("系统提示")) {
                aK();
                return;
            }
            String str2 = this.aQ;
            int i2 = 0;
            while (true) {
                if (i2 >= ck.size()) {
                    str = null;
                    break;
                }
                ce ceVar = (ce) ck.elementAt(i2);
                if (ceVar.d.equals(str2)) {
                    str = ceVar.c;
                    break;
                }
                i2++;
            }
            this.cl = str;
            String str3 = this.aQ;
            int i3 = 0;
            while (true) {
                if (i3 >= ck.size()) {
                    b2 = 0;
                    break;
                }
                ce ceVar2 = (ce) ck.elementAt(i3);
                if (ceVar2.d.equals(str3)) {
                    b2 = ceVar2.b;
                    break;
                }
                i3++;
            }
            this.cm = b2;
            if (this.cl == null || (this.cl != null && this.cl.equals(bt.ad))) {
                this.e.b("不能自言自语！");
                return;
            }
            if (this.e.as.a == 6) {
                if (this.c) {
                    ca.a(0, s2 == 2 ? 150 : 40, new String[]{"私聊", "好友", "黑名单"}, true);
                } else {
                    ca.a(0, s2 == 2 ? 150 : 40, new String[]{"私聊", "好友", "黑名单", "组队", "交易"}, true);
                }
                this.l = s2;
                this.m = s2;
                return;
            }
            if (this.c) {
                ca.a(0, s2 == 2 ? 150 : 40, new String[]{"私聊", "频道聊天", "好友", "黑名单"}, true);
            } else {
                ca.a(0, s2 == 2 ? 150 : 40, new String[]{"私聊", "频道聊天", "好友", "黑名单", "组队", "交易"}, true);
            }
            this.l = s2;
            this.m = s2;
        }
    }

    private void h(Graphics graphics) {
        this.e.aq.a(graphics);
        if (this.l != 0) {
            if (this.l == 1) {
                ca.c(graphics);
            }
        } else if (this.ch != null) {
            ai.a(this.ch, this.e.ak);
            a.f.a(graphics, this.ch, this.ci, 0, 0, this.e.aq.a + (this.e.aq.c / 4), this.e.ar.b() + (this.e.ar.d() / 2) + (this.ch.h() / 2), 0, 0);
        }
    }

    private void i(Graphics graphics) {
        this.e.aq.a(graphics);
    }

    public static boolean i() {
        return bt.H == null;
    }

    private void j(Graphics graphics) {
        this.e.aq.a(graphics);
    }

    private void k(Graphics graphics) {
        if (this.e.aq != null) {
            this.e.aq.a(graphics);
        }
        if (this.l == 1 || this.l == 7) {
            ca.c(graphics);
            return;
        }
        if (this.l == 6) {
            a(graphics, (t.b - 176) / 2, (t.c - 20) / 2, 0);
            for (int i2 = 0; i2 < bt.ej.length; i2++) {
                if (i2 == this.az) {
                    ca.d(graphics, (i2 * 17) + ((t.b - 176) / 2) + 2, ((t.c - 20) / 2) + 2, 17, 17);
                    return;
                }
            }
        }
    }

    public static byte l(int i2) {
        if (i2 == 3) {
            return (byte) 0;
        }
        if (i2 == 1) {
            return (byte) 1;
        }
        if (i2 == 4) {
            return (byte) 2;
        }
        if (i2 == 0) {
            return (byte) 3;
        }
        if (i2 == 2) {
            return (byte) 4;
        }
        return i2 == 5 ? (byte) 5 : (byte) -1;
    }

    private void l(Graphics graphics) {
        if (this.e.aq != null) {
            this.e.aq.a(graphics);
        }
        if (this.e.as.a != 2) {
            if (bt.gw != null && bt.gA[this.e.ar.g()] != null && bt.gA[this.e.ar.g()].length > 0 && this.e.at.a == 0) {
                Vector vectorA = a(bt.gA[this.e.ar.g()], bt.gB[this.e.ar.g()]);
                if (bt.gG[this.e.ar.g()] > 11) {
                    a(graphics, ((t.b - t.f) - 187) - 26, this.e.at.c + 3, 17, 17, 11, 1);
                    a(graphics, ((t.b - t.f) - ((bt.gG[this.e.ar.g()] - 11) * 17)) - 26, this.e.at.c + 24, 17, 17, bt.gG[this.e.ar.g()] - 11, 1);
                } else {
                    a(graphics, ((t.b - t.f) - (bt.gG[this.e.ar.g()] * 17)) - 26, this.e.at.c + 3, 17, 17, bt.gG[this.e.ar.g()], 1);
                }
                byte b2 = 0;
                while (true) {
                    byte b3 = b2;
                    if (b3 >= vectorA.size()) {
                        break;
                    }
                    if (bt.gG[this.e.ar.g()] <= 11) {
                        a.f.a(graphics, b(((Short) vectorA.elementAt(b3)).shortValue()), (int[]) null, (aj) null, 0, 0, ((t.b - t.f) - ((bt.gG[this.e.ar.g()] - b3) * 17)) - 23, this.e.at.c + 4 + 2, 0, 0);
                    } else if (b3 < 11) {
                        a.f.a(graphics, b(((Short) vectorA.elementAt(b3)).shortValue()), (int[]) null, (aj) null, 0, 0, ((t.b - t.f) - ((11 - b3) * 17)) - 23, this.e.at.c + 4 + 2, 0, 0);
                    } else {
                        a.f.a(graphics, b(((Short) vectorA.elementAt(b3)).shortValue()), (int[]) null, (aj) null, 0, 0, ((t.b - t.f) - ((bt.gG[this.e.ar.g()] - b3) * 17)) - 23, this.e.at.c + 4 + 2 + 21, 0, 0);
                    }
                    b2 = (byte) (b3 + 1);
                }
            }
            if (bt.gw != null && this.aI != null && this.l == 0) {
                int iB = this.e.ar.b() + 2 + (((this.e.ar.g() - this.e.ar.h()) + 1) * t.j);
                if (iB + 50 > this.e.ar.b() + this.e.ar.d()) {
                    iB = (this.e.ar.b() + this.e.ar.d()) - 50;
                }
                int iA = ((this.e.ar.a() + this.e.ar.c()) - 50) - 20;
                ca.a(graphics, 1009050, 159, iA, iB, 50, 50);
                graphics.setColor(16776960);
                graphics.drawRect(iA - 1, iB - 1, 51, 51);
                graphics.setColor(16777215);
                graphics.fillRect(iA + 9, iB + 2, 31, 3);
                graphics.setColor(0);
                graphics.drawRect(iA + 9, iB + 2, 31, 3);
                graphics.setColor(16711680);
                graphics.fillRect(iA + 1 + 9, iB + 1 + 2, (bt.gD[this.e.ar.g()] * 30) / bt.gC[this.e.ar.g()], 2);
                graphics.setColor(16777215);
                graphics.fillRect(iA + 9, iB + 7, 31, 3);
                graphics.setColor(0);
                graphics.drawRect(iA + 9, iB + 7, 31, 3);
                graphics.setColor(48127);
                graphics.fillRect(iA + 1 + 9, iB + 1 + 7, (bt.gF[this.e.ar.g()] * 30) / bt.gE[this.e.ar.g()], 2);
                a.f.a(graphics, this.aI, (int[]) null, 0, 0, (iA + 25) - (this.aI.g() / 2), ((iB + 50) - this.aI.h()) - 3, 20, 0);
            }
        }
        if (this.l == 1 || this.l == 2) {
            ca.c(graphics);
            return;
        }
        if (this.l == 3) {
            ca.a(graphics, new StringBuffer().append("是否将").append(bt.gt[this.e.ar.g()]).append("从拍卖场中撤下？").toString(), new String[]{"确定", "取消"});
        } else if (this.l == 4) {
            b(graphics, "拍卖价格");
        } else if (this.l == 5) {
            ca.a(graphics, new StringBuffer().append("您确定以").append(this.bR).append("两的价格拍卖此物品?").toString(), new String[]{"确定", "取消"});
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0042 A[PHI: r2
      0x0042: PHI (r2v35 int) = (r2v9 int), (r2v41 int) binds: [B:10:0x001d, B:23:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m(byte r13) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ao.m(byte):void");
    }

    private void m(Graphics graphics) {
        if (bt.gs == null) {
            return;
        }
        if (this.e.aq != null) {
            this.e.aq.a(graphics);
        }
        if (this.aI != null && this.l == 0 && bt.gA[this.e.ar.g()] != null && bt.gA[this.e.ar.g()].length > 0 && this.e.at.a == 0) {
            Vector vectorA = a(bt.gA[this.e.ar.g()], bt.gB[this.e.ar.g()]);
            if (bt.gG[this.e.ar.g()] > 11) {
                a(graphics, ((t.b - t.f) - 187) - 26, this.e.at.c + 3, 17, 17, 11, 1);
                a(graphics, ((t.b - t.f) - ((bt.gG[this.e.ar.g()] - 11) * 17)) - 26, this.e.at.c + 24, 17, 17, bt.gG[this.e.ar.g()] - 11, 1);
            } else {
                a(graphics, ((t.b - t.f) - (bt.gG[this.e.ar.g()] * 17)) - 26, this.e.at.c + 3, 17, 17, bt.gG[this.e.ar.g()], 1);
            }
            byte b2 = 0;
            while (true) {
                byte b3 = b2;
                if (b3 >= vectorA.size()) {
                    break;
                }
                if (bt.gG[this.e.ar.g()] <= 11) {
                    a.f.a(graphics, b(((Short) vectorA.elementAt(b3)).shortValue()), (int[]) null, (aj) null, 0, 0, ((t.b - t.f) - ((bt.gG[this.e.ar.g()] - b3) * 17)) - 23, this.e.at.c + 4 + 2, 0, 0);
                } else if (b3 < 11) {
                    a.f.a(graphics, b(((Short) vectorA.elementAt(b3)).shortValue()), (int[]) null, (aj) null, 0, 0, ((t.b - t.f) - ((11 - b3) * 17)) - 23, this.e.at.c + 4 + 2, 0, 0);
                } else {
                    a.f.a(graphics, b(((Short) vectorA.elementAt(b3)).shortValue()), (int[]) null, (aj) null, 0, 0, ((t.b - t.f) - ((bt.gG[this.e.ar.g()] - b3) * 17)) - 23, this.e.at.c + 4 + 2 + 21, 0, 0);
                }
                b2 = (byte) (b3 + 1);
            }
        }
        if (this.aI == null || this.l != 0) {
            return;
        }
        int iB = this.e.ar.b() + 2 + ((this.e.ar.g() - this.e.ar.h()) * t.j);
        if (iB + 42 > this.e.ar.b() + this.e.ar.d()) {
            iB = (this.e.ar.b() + this.e.ar.d()) - 42;
        }
        int i2 = ((t.f + t.d) - 50) - 20;
        ca.a(graphics, 1009050, 159, i2, iB, 50, 42);
        graphics.setColor(16776960);
        graphics.drawRect(i2 - 1, iB - 1, 51, 43);
        graphics.setColor(16777215);
        graphics.fillRect(i2 + 4, iB + 2, 31, 3);
        graphics.setColor(0);
        graphics.drawRect(i2 + 4, iB + 2, 31, 3);
        graphics.setColor(16711680);
        graphics.fillRect(i2 + 1 + 4, iB + 1 + 2, (bt.gD[this.e.ar.g()] * 30) / bt.gC[this.e.ar.g()], 2);
        graphics.setColor(16777215);
        graphics.fillRect(i2 + 4, iB + 7, 31, 3);
        graphics.setColor(0);
        graphics.drawRect(i2 + 4, iB + 7, 31, 3);
        graphics.setColor(48127);
        graphics.fillRect(i2 + 1 + 4, iB + 1 + 7, (bt.gF[this.e.ar.g()] * 30) / bt.gE[this.e.ar.g()], 2);
        a.f.a(graphics, this.aI, (int[]) null, 0, 0, (i2 + 25) - (this.aI.g() / 2), ((iB + 21) - (this.aI.h() / 2)) + 6, 20, 0);
    }

    private static byte n(byte b2) {
        if (b2 == 0) {
            return (byte) 3;
        }
        if (b2 == 1) {
            return (byte) 1;
        }
        if (b2 == 2) {
            return (byte) 4;
        }
        if (b2 == 3) {
            return (byte) 0;
        }
        if (b2 == 4) {
            return (byte) 2;
        }
        return b2 == 5 ? (byte) 5 : (byte) 0;
    }

    private void n(Graphics graphics) {
        if (this.f.i == null) {
            return;
        }
        graphics.setClip(this.aB - 4, this.aC - 4, ((this.f.a * this.aD) / 16) + 7, ((this.f.b * this.aD) / 16) + 7);
        graphics.setColor(8947848);
        graphics.fillRect(this.aB, this.aC, (this.f.a * this.aD) / 16, (this.f.b * this.aD) / 16);
        graphics.setColor(14589486);
        graphics.drawRect(this.aB - 1, this.aC - 1, ((this.f.a * this.aD) / 16) + 1, ((this.f.b * this.aD) / 16) + 1);
        graphics.setColor(8804879);
        graphics.drawRect(this.aB - 2, this.aC - 2, ((this.f.a * this.aD) / 16) + 3, ((this.f.b * this.aD) / 16) + 3);
        graphics.setColor(7030278);
        graphics.drawRect(this.aB - 3, this.aC - 3, ((this.f.a * this.aD) / 16) + 5, ((this.f.b * this.aD) / 16) + 5);
        graphics.setColor(2118916);
        if (this.f.i != null) {
            for (int i2 = 0; i2 < this.f.i.length; i2++) {
                for (int i3 = 0; i3 < this.f.i[i2].length; i3++) {
                    if (this.f.i[i2][i3] == 1) {
                        graphics.fillRect(this.aB + (((this.f.e * i2) * this.aD) / 16), this.aC + (((this.f.f * i3) * this.aD) / 16), (this.f.e * this.aD) / 16, (this.f.f * this.aD) / 16);
                    }
                }
            }
        }
        if (bt.ab != null) {
            graphics.setColor(16711680);
            for (int i4 = 0; i4 < bt.ab.length; i4++) {
                graphics.fillRect(this.aB + ((bt.ab[i4] * this.aD) / 16), this.aC + ((bt.ac[i4] * this.aD) / 16), this.aD, this.aD);
            }
        }
        if (bt.t != null) {
            int i5 = 0;
            while (true) {
                int i6 = i5;
                if (i6 >= bt.t.length) {
                    break;
                }
                if (bt.t[i6] != null) {
                    if (bt.t[i6].t == -1 && t != null) {
                        a.f.a(graphics, t, (int[]) null, 0, 0, (this.aB + ((bt.t[i6].c * this.aD) / 16)) - 10, ((this.aC + ((bt.t[i6].d * this.aD) / 16)) - t.j()) - 5, 0, 0);
                    } else if (bt.t[i6].t == 1 && s != null) {
                        a.f.a(graphics, s, (int[]) null, 0, 0, (this.aB + ((bt.t[i6].c * this.aD) / 16)) - 10, ((this.aC + ((bt.t[i6].d * this.aD) / 16)) - s.j()) - 5, 0, 0);
                    }
                    if (bt.t[i6].b.length() <= 2) {
                        ca.a(graphics, bt.t[i6].b, ((bt.t[i6].c * this.aD) / 16) + this.aB, ((this.aC + ((bt.t[i6].d * this.aD) / 16)) - t.j) - 5, 17, 13883606, 0);
                    } else {
                        ca.a(graphics, new StringBuffer().append(bt.t[i6].b.substring(0, 1)).append("~").toString(), ((bt.t[i6].c * this.aD) / 16) + this.aB, ((this.aC + ((bt.t[i6].d * this.aD) / 16)) - t.j) - 5, 17, 13883606, 0);
                    }
                    if (bo != null) {
                        a.f.a(graphics, bo, (int[]) null, 0, 0, ((bt.t[i6].c * this.aD) / 16) + this.aB, ((bt.t[i6].d * this.aD) / 16) + this.aC, 0, 0);
                    }
                }
                i5 = i6 + 1;
            }
        }
        graphics.setClip(0, 0, t.b, t.c);
    }

    private static void o(byte b2) {
        String[] strArrA;
        aP.removeAllElements();
        for (int i2 = 0; i2 < ck.size(); i2++) {
            ce ceVar = (ce) ck.elementAt(i2);
            if (ceVar.b == b2 && (strArrA = ca.a(new StringBuffer().append("[").append(ceVar.d).append("]").append(ceVar.e).toString(), t.i, t.b - 20)) != null && strArrA.length > 0) {
                for (String str : strArrA) {
                    aP.addElement(new b(str, ca.n[ceVar.a]));
                }
            }
        }
    }

    private void o(Graphics graphics) {
        if (bt.fA == null) {
            return;
        }
        if (this.as == 4 && (bt.fw == null || bt.fw.length <= 0)) {
            return;
        }
        if (this.l != 7 && this.l != 8 && this.l != 10) {
            if (this.e.aq != null) {
                this.e.aq.a(graphics);
            }
            int iG = (this.as == 4 || this.as == 10 || this.as == 11) ? bt.fw[this.e.ar.g()] : this.e.ar.g();
            if (this.aI != null && this.l == 0 && bt.gb[iG] != null && bt.gb[iG].length > 0 && this.e.at.a == 0) {
                Vector vectorA = a(bt.gb[iG], bt.gd[iG]);
                if (bt.ge[iG] > 11) {
                    a(graphics, ((t.b - t.f) - 187) - 26, this.e.at.c + 3, 17, 17, 11, 1);
                    a(graphics, ((t.b - t.f) - ((bt.ge[iG] - 11) * 17)) - 26, this.e.at.c + 24, 17, 17, bt.ge[iG] - 11, 1);
                } else {
                    a(graphics, ((t.b - t.f) - (bt.ge[iG] * 17)) - 26, this.e.at.c + 3, 17, 17, bt.ge[iG], 1);
                }
                byte b2 = 0;
                while (true) {
                    byte b3 = b2;
                    if (b3 >= vectorA.size()) {
                        break;
                    }
                    if (bt.ge[iG] <= 11) {
                        a.f.a(graphics, b(((Short) vectorA.elementAt(b3)).shortValue()), (int[]) null, (aj) null, 0, 0, ((t.b - t.f) - ((bt.ge[iG] - b3) * 17)) - 23, this.e.at.c + 4 + 2, 0, 0);
                    } else if (b3 < 11) {
                        a.f.a(graphics, b(((Short) vectorA.elementAt(b3)).shortValue()), (int[]) null, (aj) null, 0, 0, ((t.b - t.f) - ((11 - b3) * 17)) - 23, this.e.at.c + 4 + 2, 0, 0);
                    } else {
                        a.f.a(graphics, b(((Short) vectorA.elementAt(b3)).shortValue()), (int[]) null, (aj) null, 0, 0, ((t.b - t.f) - ((bt.ge[iG] - b3) * 17)) - 23, this.e.at.c + 4 + 2 + 21, 0, 0);
                    }
                    b2 = (byte) (b3 + 1);
                }
            }
        }
        int iG2 = this.as == 4 ? bt.fw[this.e.ar.g()] : this.e.ar.g();
        if (this.aI != null && this.l == 0) {
            int iB = this.e.ar.b() + 2 + (((this.e.ar.g() - this.e.ar.h()) + 1) * t.j);
            if (iB + 50 > this.e.ar.b() + this.e.ar.d()) {
                iB = (this.e.ar.b() + this.e.ar.d()) - 50;
            }
            int iA = ((this.e.ar.a() + this.e.ar.c()) - 50) - 20;
            ca.a(graphics, 1009050, 159, iA, iB, 50, 50);
            graphics.setColor(16776960);
            graphics.drawRect(iA - 1, iB - 1, 51, 51);
            graphics.setColor(16777215);
            graphics.fillRect(iA + 9, iB + 2, 31, 3);
            graphics.setColor(0);
            graphics.drawRect(iA + 9, iB + 2, 31, 3);
            graphics.setColor(16711680);
            graphics.fillRect(iA + 1 + 9, iB + 1 + 2, (bt.fI[iG2] * 30) / bt.fJ[iG2], 2);
            graphics.setColor(16777215);
            graphics.fillRect(iA + 9, iB + 7, 31, 3);
            graphics.setColor(0);
            graphics.drawRect(iA + 9, iB + 7, 31, 3);
            graphics.setColor(48127);
            graphics.fillRect(iA + 1 + 9, iB + 1 + 7, (bt.fK[iG2] * 30) / bt.fL[iG2], 2);
            a.f.a(graphics, this.aI, (int[]) null, 0, 0, (iA + 25) - (this.aI.g() / 2), ((iB + 50) - this.aI.h()) - 3, 20, 0);
        }
        if (this.l == 1 || this.l == 2 || this.l == 9) {
            ca.c(graphics);
            return;
        }
        if (this.l == 3) {
            b(graphics, "请输入拍卖价格:");
            return;
        }
        if (this.l == 4) {
            ca.a(graphics, new StringBuffer().append("您确定以").append(this.bR).append("两的价格拍卖此宠物1只?").toString(), new String[]{"确定", "取消"});
            return;
        }
        if (this.l == 6) {
            a(graphics, 1);
            return;
        }
        if (this.l == 7) {
            a(graphics, this.aI);
            return;
        }
        if (this.l == 8) {
            a(graphics, this.aI);
            ca.c(graphics);
            return;
        }
        if (this.l != 10) {
            if (this.l == 11) {
                ca.a(graphics, new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("炼化条件:").append(bt.nC[0]).append("\t").toString()).append("炼化所得:").append(bt.nC[2]).append("\t").toString()).append("消耗:").append(bt.nC[1]).append("\t").toString(), new String[]{"确定", "取消"});
                return;
            }
            return;
        }
        if (this.e.aq != null) {
            this.e.aq.a(30);
            this.e.aq.a(graphics);
            ca.a(graphics, this.e.aq.a + 5, this.e.aq.b + 32, this.e.aq.c - 11, 30, 1);
            ca.a(graphics, "宝石", this.e.aq.a + 10, t.a(25) + this.e.aq.b + 35, 20, 16776960, 0);
        }
        if (bt.jM == null) {
            return;
        }
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bt.jH.length) {
                return;
            }
            if (n(bt.jJ[i3]) == this.aq && bt.jM[i3] != null) {
                a(graphics, this.e.aq.a + 10 + t.i.stringWidth("宝石:"), this.e.aq.b + 37, 17, 17, bt.jM[i3].length, 1);
                byte b4 = 0;
                while (true) {
                    byte b5 = b4;
                    if (b5 < bt.jM[i3].length) {
                        if (bt.jM[i3][b5] <= -1) {
                            ca.a(graphics, 125269879, 207, (b5 * 17) + this.e.aq.a + 10 + t.i.stringWidth("宝石:") + 2, this.e.aq.b + 39, 17, 17);
                        }
                        if (bt.jM[i3][b5] > 0) {
                            a.f.a(graphics, b(bt.jM[i3][b5]), (int[]) null, (aj) null, 0, 0, (b5 * 17) + this.e.aq.a + 10 + t.i.stringWidth("宝石:") + 2, this.e.aq.b + 39, 0, 0);
                        }
                        graphics.setColor(16776960);
                        graphics.drawRect(this.e.aq.a + 10 + t.i.stringWidth("宝石:") + 2 + (b5 * 17), this.e.aq.b + 39, 17, 17);
                        b4 = (byte) (b5 + 1);
                    }
                }
            }
            i2 = i3 + 1;
        }
    }

    private void p(byte b2) {
        byte[] bArrB = bz.b((short) 4610, bt.ad, b2, bt.C[b2]);
        if (bArrB != null) {
            a.i.a(new w((short) 4610, bArrB));
        } else {
            this.e.b("获取上传指令数据错误!");
        }
    }

    private void p(Graphics graphics) {
        if (this.e.aq != null) {
            this.e.aq.a(graphics);
        }
    }

    private void q(byte b2) {
        byte[] bArrC = bz.c((short) 4611, bt.ad, b2);
        if (bArrC == null) {
            this.e.b("获取上传指令数据错误!");
        } else {
            a.i.a(new w((short) 4611, bArrC));
            this.e.a((String) null);
        }
    }

    private void q(Graphics graphics) {
        int i2;
        if (this.e.aq != null) {
            int i3 = t.e <= 240 ? 79 : 120;
            this.e.aq.a(i3);
            this.e.aq.a(graphics);
            ca.a(graphics, this.e.aq.a + 5, this.e.as.b + this.e.aq.b + 29, this.e.aq.c - 11, i3, 1);
            ca.a(graphics);
            int i4 = ((this.e.aq.c - 11) - (x.b << 3)) / 9;
            int i5 = (((t.e <= 240 ? 79 : 120) - 6) - (x.b << 2)) / 5;
            int i6 = this.e.aq.a + 8 + i4;
            int i7 = this.e.aq.b + 33 + this.e.as.b + i5;
            int i8 = 0;
            while (true) {
                int i9 = i8;
                if (i9 >= 32) {
                    break;
                }
                a.f.a(graphics, x, (int[]) null, (aj) null, 0, 0, ((i9 % 8) * (x.b + i4)) + i6, ((i9 / 8) * (x.b + i5)) + i7, 0, 0);
                a(i9, ((i9 % 8) * (x.b + i4)) + i6, ((i9 / 8) * (x.b + i5)) + i7, x.b, x.c);
                i8 = i9 + 1;
            }
            int i10 = -1;
            int i11 = 0;
            while (true) {
                int i12 = i11;
                i2 = i10;
                if (i12 >= bt.cb.length) {
                    break;
                }
                a.f.a(graphics, b(bt.cb[i12]), (int[]) null, (aj) null, 0, 0, ((i12 % 8) * (x.b + i4)) + i6 + 1, ((i12 / 8) * (x.b + i5)) + i7 + 1, 0, 0);
                i10 = i12 == (this.ar << 3) + this.aq ? i12 : i2;
                i11 = i12 + 1;
            }
            graphics.setColor(13172693);
            ca.d(graphics, ((this.aq * (x.b + i4)) + i6) - 1, ((this.ar * (x.b + i5)) + i7) - 1, 19, 19);
            if (i2 >= 0 && i2 < bt.cb.length) {
                ca.a(graphics, bt.bZ[i2], bt.cp[i2], (x.b / 2) + (this.aq * (x.b + i4)) + i6, (x.b / 2) + (this.ar * (x.b + i5)) + i7);
            }
            a(graphics, bt.ap, (t.b / 2) + x.b, this.e.au.a() + t.a(a.E.c));
            a.f.a(graphics, w, (int[]) null, (aj) null, 0, 0, t.a(t.b, this.e.l.toString()) - x.b, this.e.au.a() + 4, 0, 0);
        }
        if (this.l == 2) {
            a(graphics, "数量");
        }
    }

    private void r(byte b2) {
        byte[] bArrC = bz.c((short) 4609, bt.ad, b2);
        if (bArrC == null) {
            this.e.b("获取上传指令数据错误!");
        } else {
            a.i.a(new w((short) 4609, bArrC));
            this.e.a((String) null);
        }
    }

    private void r(Graphics graphics) {
        int i2;
        if (bt.ct == null || bt.ct.length <= 0) {
            return;
        }
        if (this.e.aq != null) {
            this.e.aq.a("仓库");
            int i3 = t.e <= 240 ? 79 : 120;
            this.e.aq.a(i3);
            this.e.aq.a(graphics);
            ca.a(graphics, this.e.aq.a + 5, this.e.as.b + this.e.aq.b + 29, this.e.aq.c - 11, i3, 1);
            ca.a(graphics);
            int i4 = ((this.e.aq.c - 11) - (x.b << 3)) / 9;
            int i5 = (((t.e <= 240 ? 79 : 120) - 6) - (x.b << 2)) / 5;
            int i6 = this.e.aq.a + 8 + i4;
            int i7 = this.e.aq.b + 33 + this.e.as.b + i5;
            int i8 = 0;
            while (true) {
                int i9 = i8;
                if (i9 >= 32) {
                    break;
                }
                a.f.a(graphics, x, (int[]) null, (aj) null, 0, 0, ((i9 % 8) * (x.b + i4)) + i6, ((i9 / 8) * (x.b + i5)) + i7, 0, 0);
                a(i9, ((i9 % 8) * (x.b + i4)) + i6, ((i9 / 8) * (x.b + i5)) + i7, x.b, x.c);
                i8 = i9 + 1;
            }
            int i10 = 0;
            int i11 = this.e.as.a << 5;
            while (true) {
                int i12 = i11;
                i2 = i10;
                if (i12 >= (bt.cx.length > ((this.e.as.a + 1) << 5) ? (this.e.as.a + 1) << 5 : bt.cx.length)) {
                    break;
                }
                int i13 = i12 % 32;
                a.f.a(graphics, b(bt.cx[i12]), (int[]) null, (aj) null, 0, 0, ((i13 % 8) * (x.b + i4)) + i6 + 1, ((i13 / 8) * (x.b + i5)) + i7 + 1, 0, 0);
                if (bt.cw[i12] > 9) {
                    a.f.a(graphics, a.n, (int[]) null, bt.cw[i12] / 10, 0, 0, ((i13 % 8) * (x.b + i4)) + 10 + i6, ((i13 / 8) * (x.b + i5)) + i7 + 12, 0, 0);
                    a.f.a(graphics, a.n, (int[]) null, bt.cw[i12] % 10, 0, 0, ((i13 % 8) * (x.b + i4)) + 14 + i6, ((i13 / 8) * (x.b + i5)) + i7 + 12, 0, 0);
                } else if (bt.cw[i12] > 1) {
                    a.f.a(graphics, a.n, (int[]) null, bt.cw[i12] % 10, 0, 0, ((i13 % 8) * (x.b + i4)) + 14 + i6, ((i13 / 8) * (x.b + i5)) + i7 + 12, 0, 0);
                }
                i10 = i12 == ((this.ar << 3) + this.aq) + (this.e.as.a * 32) ? i12 : i2;
                i11 = i12 + 1;
            }
            ca.d(graphics, (this.aq * (x.b + i4)) + i6, (this.ar * (x.b + i5)) + i7, 17, 17);
            if (i2 >= 0 && i2 < bt.cx.length && i2 == (this.ar << 3) + this.aq + (this.e.as.a * 32)) {
                ca.a(graphics, new StringBuffer().append(bt.cu[i2]).append("X").append((int) bt.cw[i2]).toString(), bt.cy[i2], (x.b / 2) + (this.aq * (x.b + i4)) + i6, (x.b / 2) + (this.ar * (x.b + i5)) + i7);
            }
        }
        if (this.l == 1 || this.l == 4) {
            ca.c(graphics);
        } else if (this.l == 2) {
            a(graphics, "数量");
        }
    }

    public static boolean r() {
        for (int i2 = 0; i2 < bt.bC.size(); i2++) {
            bn bnVar = (bn) bt.bC.elementAt(i2);
            if (bnVar != null && bnVar.f == 2) {
                return true;
            }
        }
        return false;
    }

    private void s(byte b2) {
        byte[] bArrB = bz.b((short) 4608, bt.ad, b2);
        if (bArrB == null) {
            this.e.b("获取上传指令数据错误!");
        } else {
            a.i.a(new w((short) 4608, bArrB));
            this.e.a((String) null);
        }
    }

    private void s(Graphics graphics) {
        if (bt.gs == null) {
            return;
        }
        if (this.e.aq != null) {
            this.e.aq.a(graphics);
        }
        if (this.aI != null && this.l == 0 && bt.gA[this.e.ar.g()] != null && bt.gA[this.e.ar.g()].length > 0 && this.e.at.a == 0) {
            Vector vectorA = a(bt.gA[this.e.ar.g()], bt.gB[this.e.ar.g()]);
            if (bt.gG[this.e.ar.g()] > 11) {
                a(graphics, ((t.b - t.f) - 187) - 26, this.e.at.c + 3, 17, 17, 11, 1);
                a(graphics, ((t.b - t.f) - ((bt.gG[this.e.ar.g()] - 11) * 17)) - 26, this.e.at.c + 24, 17, 17, bt.gG[this.e.ar.g()] - 11, 1);
            } else {
                a(graphics, ((t.b - t.f) - (bt.gG[this.e.ar.g()] * 17)) - 26, this.e.at.c + 3, 17, 17, bt.gG[this.e.ar.g()], 1);
            }
            byte b2 = 0;
            while (true) {
                byte b3 = b2;
                if (b3 >= vectorA.size()) {
                    break;
                }
                if (bt.gG[this.e.ar.g()] <= 11) {
                    a.f.a(graphics, b(((Short) vectorA.elementAt(b3)).shortValue()), (int[]) null, (aj) null, 0, 0, ((t.b - t.f) - ((bt.gG[this.e.ar.g()] - b3) * 17)) - 23, this.e.at.c + 4 + 2, 0, 0);
                } else if (b3 < 11) {
                    a.f.a(graphics, b(((Short) vectorA.elementAt(b3)).shortValue()), (int[]) null, (aj) null, 0, 0, ((t.b - t.f) - ((11 - b3) * 17)) - 23, this.e.at.c + 4 + 2, 0, 0);
                } else {
                    a.f.a(graphics, b(((Short) vectorA.elementAt(b3)).shortValue()), (int[]) null, (aj) null, 0, 0, ((t.b - t.f) - ((bt.gG[this.e.ar.g()] - b3) * 17)) - 23, this.e.at.c + 4 + 2 + 21, 0, 0);
                }
                b2 = (byte) (b3 + 1);
            }
        }
        if (this.aI != null && this.l == 0) {
            int iB = this.e.ar.b() + 2 + (((this.e.ar.g() - this.e.ar.h()) + 1) * t.j);
            if (iB + 50 > this.e.ar.b() + this.e.ar.d()) {
                iB = (this.e.ar.b() + this.e.ar.d()) - 50;
            }
            int iA = ((this.e.ar.a() + this.e.ar.c()) - 50) - 20;
            ca.a(graphics, 1009050, 159, iA, iB, 50, 50);
            graphics.setColor(16776960);
            graphics.drawRect(iA - 1, iB - 1, 51, 51);
            graphics.setColor(16777215);
            graphics.fillRect(iA + 9, iB + 2, 31, 3);
            graphics.setColor(0);
            graphics.drawRect(iA + 9, iB + 2, 31, 3);
            graphics.setColor(16711680);
            graphics.fillRect(iA + 1 + 9, iB + 1 + 2, (bt.gD[this.e.ar.g()] * 30) / bt.gC[this.e.ar.g()], 2);
            graphics.setColor(16777215);
            graphics.fillRect(iA + 9, iB + 7, 31, 3);
            graphics.setColor(0);
            graphics.drawRect(iA + 9, iB + 7, 31, 3);
            graphics.setColor(48127);
            graphics.fillRect(iA + 1 + 9, iB + 1 + 7, (bt.gF[this.e.ar.g()] * 30) / bt.gE[this.e.ar.g()], 2);
            a.f.a(graphics, this.aI, (int[]) null, 0, 0, (iA + 25) - (this.aI.g() / 2), ((iB + 50) - this.aI.h()) - 3, 20, 0);
        }
        if (this.l == 1) {
            ca.c(graphics);
        } else if (this.l == 2) {
            ca.a(graphics, new StringBuffer().append("您确认以").append(bt.a(bt.gv[this.e.ar.g()])).append("的价格购买该宠物1只").toString(), new String[]{"确定", "取消"});
        }
    }

    private void t(byte b2) {
        a((short) 5120, bz.d((short) 5120, bt.ad, b2), (String) null);
    }

    private void t(Graphics graphics) {
        try {
            if (this.g == null || bt.H == null || bt.M == null) {
                return;
            }
            if (this.k != 18 && t.b >= 240) {
                this.e.m = 8;
            }
            this.g.a(a.f, graphics);
            if (this.k == 18) {
                ca.a(graphics, 0, 159, 0, 0, t.b, t.c);
            }
        } catch (Exception e) {
            c("系统异常[10]");
            e.printStackTrace();
        }
    }

    private void u(byte b2) {
        while (this.cD.size() > 20 - b2) {
            this.cD.removeElementAt(this.cD.size() - 1);
        }
    }

    private void u(int i2) {
        if (this.e.aq != null) {
            this.e.aq.b(i2);
        }
        if (i2 == 536870912) {
            aw();
            c(t.a == 0 ? 4 : 5);
        }
    }

    private void u(Graphics graphics) {
        try {
            for (int i2 = ca.z; i2 < aP.size() && i2 < ca.z + ca.x; i2++) {
                if (ca.w == i2) {
                    ca.a(graphics, 9);
                    if (ca.w >= ca.x) {
                        ca.a(graphics, 873078, 191, ca.r + 2, ((ca.x - 1) * t.j) + ca.s, ca.t - 20, t.j);
                    } else {
                        ca.a(graphics, 873078, 191, ca.r + 2, (ca.w * t.j) + ca.s, ca.t - 20, t.j);
                    }
                }
                this.cq = (b) aP.elementAt(i2);
                this.cq.a(graphics, a.f, C, ca.r + 2, ((i2 - ca.z) * graphics.getFont().getHeight()) + ca.s);
                int i3 = ca.r + 2;
                int height = ca.s + ((i2 - ca.z) * graphics.getFont().getHeight());
                int i4 = ca.t - 20;
                int i5 = t.j;
                if (this.cr != null && this.cr.length > i2) {
                    this.cr[i2][0] = i3;
                    this.cr[i2][1] = height;
                    this.cr[i2][2] = i4;
                    this.cr[i2][3] = i5;
                }
            }
            ca.a(graphics, (t.b - 5) - a.C.b, t.j + 10, ca.u - 20, ca.y, ca.z, ca.v, ca.x);
            int i6 = (t.b - 5) - a.C.b;
            int i7 = t.j + 10;
            int i8 = (t.b - 5) - a.C.b;
            int i9 = ((t.j - 10) + ca.u) - a.D.c;
            short s2 = a.D.b;
            short s3 = a.D.c;
            this.cs[0][0] = i6;
            this.cs[0][1] = i7;
            this.cs[0][2] = s2;
            this.cs[0][3] = s3;
            this.cs[1][0] = i8;
            this.cs[1][1] = i9;
            this.cs[1][2] = s2;
            this.cs[1][3] = s3;
            this.e.aq.a(graphics);
            if (this.l == 2 || this.l == 3 || this.l == 4 || this.l == 5 || this.l == 6) {
                ca.c(graphics);
            }
            if (!t.o || this.e.aj == null || a.u == null) {
                return;
            }
            graphics.drawImage(a.u.a, (t.b - a.u.b) - 5, 5, 20);
        } catch (Exception e) {
            K();
        }
    }

    private void v(byte b2) {
        byte[] bArrI = bz.i((short) 4355, bt.ad, b2);
        if (bArrI == null) {
            this.e.b("获取上传指令数据错误!");
        } else {
            a.i.a(new w((short) 4354, bArrI));
            this.e.a((String) null);
        }
    }

    private void v(int i2) {
        if (this.l == 0) {
            if (this.m == 0) {
                if ((bH.size() <= 0 || i2 != 536870912) && (bH.size() > 0 || !(i2 == 536870912 || i2 == 268435456 || i2 == 517 || i2 == 1073741824))) {
                    if (i2 == 8 || i2 == 516) {
                        ca.e = ca.e - ca.d >= 0 ? ca.e - ca.d : 0;
                    } else if (i2 == 2 || i2 == 518) {
                        ca.e = ca.e + ca.d < K.a() ? ca.e + ca.d : ca.e;
                    }
                    if (bH.size() <= 0) {
                        return;
                    }
                    if (i2 != 1 && i2 != 514) {
                        if (i2 != 4 && i2 != 520) {
                            if (i2 == 268435456 || i2 == 1073741824 || i2 == 517) {
                                int length = bt.bI != null ? bt.bI.length : 0;
                                this.ai = ca.g;
                                this.bI = bH.elementAt(this.ai).toString();
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= t.I.length) {
                                        i3 = -1;
                                        break;
                                    } else if (this.bI.equals(t.I[i3])) {
                                        break;
                                    } else {
                                        i3++;
                                    }
                                }
                                switch (i3) {
                                    case 0:
                                        if (bt.bY == null) {
                                            this.e.b("npc商店没有商品!");
                                            break;
                                        } else {
                                            F();
                                            break;
                                        }
                                    case 1:
                                        if (this.am == null) {
                                            this.aE = 0;
                                            this.aG = 0;
                                            this.aH = (byte) 0;
                                        }
                                        e(0);
                                        this.k = (short) 9;
                                        this.j = (short) 9;
                                        break;
                                    case 2:
                                        if (bt.aM <= 0) {
                                            this.e.b("生命值为0,不能战斗!");
                                            break;
                                        } else {
                                            a((short) 4118, bz.c((short) 4118, bt.ad, bt.t[this.af].a), (String) null);
                                            break;
                                        }
                                    case 3:
                                        if (bt.cr != null && bt.cr.length > 0) {
                                            a(true);
                                            break;
                                        } else {
                                            this.e.b("传送列表为空!");
                                            break;
                                        }
                                        break;
                                    case 4:
                                        this.ar = 0;
                                        this.m = (short) 0;
                                        this.an = new String[]{"取出物品", "存入物品"};
                                        K = new bw(new StringBuffer().append(bt.t[this.af].b).append(":物品仓库已打开").toString(), (short) (t.b - 20));
                                        ca.a(a.F, K, this.an, (String[]) null, true);
                                        this.l = (short) 3;
                                        break;
                                    case 5:
                                        this.ar = 0;
                                        this.m = (short) 0;
                                        this.an = new String[]{"取出银两", "存入银两"};
                                        String strA = bt.a(bt.aq);
                                        t.a(this.e.l, bt.ap);
                                        K = new bw(new StringBuffer().append(bt.t[this.af].b).append(":已存入银两").append(strA).append(",现有银两").append(this.e.l.toString()).toString(), (short) (t.b - 20));
                                        ca.a(a.F, K, this.an, (String[]) null, true);
                                        this.l = (short) 4;
                                        break;
                                    case 6:
                                        this.ar = 0;
                                        this.m = (short) 0;
                                        this.an = new String[]{"寄养宠物", "领回宠物"};
                                        K = new bw(new StringBuffer().append(bt.t[this.af].b).append(":宠物仓库已打开").toString(), (short) (t.b - 20));
                                        ca.a(a.F, K, this.an, (String[]) null, true);
                                        this.l = (short) 5;
                                        break;
                                    case 7:
                                        e(5);
                                        break;
                                    case 8:
                                        if (bt.fA == null) {
                                            this.e.b("您没有宠物!");
                                            break;
                                        } else {
                                            j(1);
                                            break;
                                        }
                                    case 9:
                                        if (this.as != 256) {
                                            if (this.as == 257) {
                                                aI();
                                                break;
                                            }
                                        } else {
                                            H();
                                            break;
                                        }
                                        break;
                                    case 10:
                                        if (this.as == 256) {
                                            if (this.as == 256) {
                                                bt.gQ = (short) 1;
                                                a((byte) 0, bt.gQ);
                                                break;
                                            }
                                        } else {
                                            bt.gQ = (short) 1;
                                            a((byte) 1, bt.gQ);
                                            break;
                                        }
                                        break;
                                    case 11:
                                        if (bt.dE == null) {
                                            this.e.b("当前没有可升级技能");
                                            break;
                                        } else {
                                            i(0);
                                            break;
                                        }
                                    case 12:
                                    default:
                                        if (bt.t[this.af].B != null && bt.t[this.af].B.length > 0 && this.ai >= length) {
                                            int i4 = 0;
                                            while (true) {
                                                if (i4 >= bt.t[this.af].B.length) {
                                                    break;
                                                } else if (this.bI.equals(bt.t[this.af].B[i4])) {
                                                    N();
                                                    a((short) -1, -1, bt.t[this.af].C[i4], (String) null);
                                                    break;
                                                } else {
                                                    i4++;
                                                }
                                            }
                                        } else if (bt.bI != null && this.ai < bt.bI.length) {
                                            byte[] bArrA = bz.a((short) 4107, bt.ad, (int) bt.t[this.af].a, bt.bI[this.ai]);
                                            if (bArrA == null) {
                                                this.e.b("获取上传指令数据错误!");
                                                break;
                                            } else {
                                                a.i.a(new w((short) 4107, bArrA));
                                                this.e.a((String) null);
                                                break;
                                            }
                                        }
                                        break;
                                    case 13:
                                        if (bt.fA == null) {
                                            this.e.b("您没有宠物");
                                            break;
                                        } else {
                                            j(5);
                                            break;
                                        }
                                    case 14:
                                        break;
                                    case 15:
                                        if (bt.ew != null && bt.ew.length > 0) {
                                            a(this.k, (byte) 1);
                                            break;
                                        } else {
                                            this.e.b("兑换列表为空");
                                            break;
                                        }
                                        break;
                                    case 16:
                                        byte[] bArrS = bz.s((short) 4145, bt.ad, (int) bt.t[this.af].a);
                                        if (bArrS == null) {
                                            this.e.b("获取上传指令数据错误!");
                                            break;
                                        } else {
                                            a.i.a(new w((short) 4145, bArrS));
                                            N();
                                            this.e.a((String) null);
                                            break;
                                        }
                                    case 17:
                                        a((short) 4190, bz.k((short) 4190, bt.ad), (String) null);
                                        break;
                                    case 18:
                                        if (bt.fA != null) {
                                            j(6);
                                            break;
                                        } else {
                                            this.e.b("您没有宠物");
                                            return;
                                        }
                                    case 19:
                                        b((short) 4353, this.af);
                                        break;
                                    case 20:
                                        if (bt.bs == -1) {
                                            b((short) 4358, this.af);
                                            break;
                                        } else {
                                            this.e.b("队伍状态下不能进行住宅操作");
                                            return;
                                        }
                                    case 21:
                                        w((byte) 1);
                                        break;
                                    case 22:
                                        c((short) 4361, this.af, (byte) 1);
                                        break;
                                    case 23:
                                        w((byte) 2);
                                        break;
                                    case 24:
                                        this.M.a(0);
                                        break;
                                    case 25:
                                        bt.gQ = (short) 1;
                                        this.M.q(0);
                                        break;
                                    case 26:
                                        this.ar = 0;
                                        this.m = (short) 0;
                                        this.an = new String[]{"查看公告", "修改公告"};
                                        K = new bw("查看和修改公告", (short) (t.b - 20));
                                        ca.a(a.F, K, this.an, (String[]) null, true);
                                        ca.g = 0;
                                        this.l = (short) 9;
                                        break;
                                    case 27:
                                        this.M.a(false);
                                        break;
                                    case 28:
                                        aq aqVar = this.M;
                                        byte[] bArrB = bz.B((short) 4222, bt.ad);
                                        if (bArrB == null) {
                                            aqVar.b.b("获取上传指令数据错误!");
                                            break;
                                        } else {
                                            a.i.a(new w((short) 4222, bArrB));
                                            aqVar.b.a((String) null);
                                            break;
                                        }
                                    case 29:
                                        bt.gQ = (short) 1;
                                        this.M.p = 0;
                                        this.M.o = "";
                                        this.M.a(this.M.o);
                                        break;
                                    case 30:
                                        this.O.a();
                                        break;
                                    case 31:
                                        if (bt.kB == null) {
                                            this.e.b("无可开孔装备");
                                            break;
                                        } else {
                                            this.O.b();
                                            break;
                                        }
                                    case 32:
                                        aq aqVar2 = this.M;
                                        byte[] bArrV = bz.v((short) 4870, bt.ad);
                                        if (bArrV == null) {
                                            aqVar2.b.b("获取上传指令数据错误!");
                                            break;
                                        } else {
                                            a.i.a(new w((short) 4870, bArrV));
                                            aqVar2.b.a((String) null);
                                            break;
                                        }
                                    case 33:
                                        aq aqVar3 = this.M;
                                        byte[] bArrV2 = bz.v((short) 4873, bt.ad);
                                        if (bArrV2 == null) {
                                            aqVar3.b.b("获取上传指令数据错误!");
                                            break;
                                        } else {
                                            a.i.a(new w((short) 4873, bArrV2));
                                            aqVar3.b.a((String) null);
                                            break;
                                        }
                                    case 34:
                                        this.ar = 0;
                                        this.m = (short) 0;
                                        this.an = new String[]{"查看", "发布"};
                                        K = new bw("查看、发布“求爱宣言”", (short) (t.b - 20));
                                        ca.a(a.F, K, this.an, (String[]) null, true);
                                        ca.g = 0;
                                        this.l = (short) 7;
                                        break;
                                    case 35:
                                        this.S.a((byte) 0);
                                        break;
                                    case 36:
                                        this.S.b((byte) 0);
                                        break;
                                    case 37:
                                        bt.gQ = (short) 1;
                                        this.S.e();
                                        break;
                                    case 38:
                                    case 40:
                                        a((short) 4651, bz.p((short) 4651, bt.ad, String.valueOf((int) bt.t[this.af].a)), (String) null);
                                        break;
                                    case 39:
                                        if (bt.ew != null && bt.ew.length > 0) {
                                            a(this.k, (byte) 2);
                                            break;
                                        } else {
                                            this.e.b("锻造列表为空");
                                            break;
                                        }
                                        break;
                                    case 41:
                                        byte[] bArrA2 = bz.a((short) 4660, bt.t[this.af].a, bt.ad);
                                        if (bArrA2 == null) {
                                            this.e.b("获取上传指令数据错误!");
                                            break;
                                        } else {
                                            a.i.a(new w((short) 4660, bArrA2));
                                            this.e.a((String) null);
                                            break;
                                        }
                                    case 42:
                                        byte[] bArrA3 = bz.a((short) 4662, bt.t[this.af].a, bt.ad);
                                        if (bArrA3 == null) {
                                            this.e.b("获取上传指令数据错误!");
                                            break;
                                        } else {
                                            a.i.a(new w((short) 4662, bArrA3));
                                            this.e.a((String) null);
                                            break;
                                        }
                                    case 43:
                                        this.e.a("输入兑换码", 0);
                                        break;
                                    case 44:
                                        this.U.a.b("装备暂不能升星");
                                        break;
                                    case 45:
                                        a((short) 4665, String.valueOf((int) bt.t[this.af].a), (byte) 2, "", bt.t[this.af].S);
                                        this.k = (short) 0;
                                        this.j = (short) 0;
                                        break;
                                    case 46:
                                        this.O.d();
                                        this.O.a(true);
                                        break;
                                    case 47:
                                        if (this.P == null) {
                                            this.P = new r(this, this.e, a.f);
                                        }
                                        this.P.b();
                                        this.P.a(true);
                                        break;
                                    case 48:
                                        this.ar = 0;
                                        this.m = (short) 0;
                                        this.an = new String[]{"银两竞标", "金豆竞标"};
                                        t.a(this.e.l, bt.ap);
                                        K = new bw(new StringBuffer().append(bt.t[this.af].b).append(":选择银两竞标或金豆竞标，一金豆折合300万银两。").toString(), (short) (t.b - 20));
                                        ca.a(a.F, K, this.an, (String[]) null, true);
                                        this.l = (short) 10;
                                        break;
                                    case 49:
                                        byte[] bArrA4 = bz.a((byte) 0);
                                        if (bArrA4 == null) {
                                            this.e.b("获取上传指令数据错误!");
                                            break;
                                        } else {
                                            a.i.a(new w((short) 4683, bArrA4));
                                            this.e.a((String) null);
                                            break;
                                        }
                                }
                            }
                        } else if (this.am != null) {
                            ca.g = ca.g + 1 < this.am.length ? ca.g + 1 : 0;
                        }
                    } else if (this.am != null) {
                        ca.g = ca.g + (-1) >= 0 ? ca.g - 1 : this.am.length - 1;
                    }
                } else {
                    bt.j();
                    bt.l();
                    bt.k();
                    bt.m();
                    bt.A();
                    bt.u();
                    bt.r();
                    bt.bQ = null;
                    K = null;
                    this.am = null;
                    bH.removeAllElements();
                    N();
                }
            }
        } else if (this.l == 1) {
            if (i2 == 1 || i2 == 514) {
                if (this.an != null) {
                    ca.g = ca.g + (-1) >= 0 ? ca.g - 1 : this.an.length - 1;
                }
            } else if (i2 == 4 || i2 == 520) {
                if (this.an != null) {
                    ca.g = ca.g + 1 < this.an.length ? ca.g + 1 : 0;
                }
            } else if (i2 == 8 || i2 == 516) {
                ca.e = ca.e - ca.d >= 0 ? ca.e - ca.d : 0;
            } else if (i2 == 2 || i2 == 518) {
                ca.e = ca.e + ca.d < K.a() ? ca.e + ca.d : ca.e;
            } else if (i2 == 268435456 || i2 == 1073741824 || i2 == 517) {
                if (ca.g == 0) {
                    if (bt.bE && bt.bG != -1) {
                        byte[] bArrB2 = bz.b((short) 4108, bt.ad, bt.bG, bt.bF);
                        if (bArrB2 != null) {
                            a.i.a(new w((short) 4108, bArrB2));
                            bt.j();
                            N();
                            this.e.a((String) null);
                        } else {
                            this.e.b("获取上传指令数据错误!");
                        }
                    } else if (bt.bK[this.ai] == -1) {
                        byte[] bArrB3 = bz.b((short) 4108, bt.ad, bt.bI[this.ai], -1);
                        if (bArrB3 != null) {
                            a.i.a(new w((short) 4108, bArrB3));
                            bt.j();
                            N();
                            this.e.a((String) null);
                        } else {
                            this.e.b("获取上传指令数据错误!");
                        }
                    } else if (bt.bK[this.ai] == 1) {
                        N();
                        byte[] bArrC = bz.c((short) 4109, bt.ad, (int) bt.t[this.af].a, bt.bI[this.ai]);
                        if (bArrC != null) {
                            a.i.a(new w((short) 4109, bArrC));
                            bt.j();
                            this.e.a((String) null);
                        } else {
                            this.e.b("获取上传指令数据错误!");
                        }
                    } else {
                        bt.bH = null;
                        this.am = null;
                        K = null;
                        this.l = (short) 0;
                        m();
                    }
                    this.l = (short) 0;
                } else if (ca.g == 1) {
                    bt.bH = null;
                    this.am = null;
                    K = null;
                    this.l = (short) 0;
                    if (!bt.bE || bt.bG == -1) {
                        m();
                    } else {
                        N();
                        bt.bE = false;
                        bt.bG = -1;
                    }
                }
            } else if (i2 == 536870912) {
                bt.bH = null;
                this.am = null;
                K = null;
                this.l = (short) 0;
                m();
            }
        } else if (this.l == 3 || this.l == 4 || this.l == 10) {
            if (this.m == 0) {
                if (i2 == 1 || i2 == 514) {
                    if (this.an != null) {
                        ca.g = ca.g + (-1) >= 0 ? ca.g - 1 : this.an.length - 1;
                    }
                } else if (i2 == 4 || i2 == 520) {
                    if (this.an != null) {
                        ca.g = ca.g + 1 < this.an.length ? ca.g + 1 : 0;
                    }
                } else if (i2 == 268435456 || i2 == 1073741824 || i2 == 517) {
                    if (ca.g == 0) {
                        if (this.l == 3) {
                            if (bt.ct == null) {
                                bt.m();
                                this.e.b("仓库中没有物品");
                            } else if (this.k == 2) {
                                n(0);
                            }
                        } else if (this.l == 4) {
                            if (bt.aq > 0) {
                                this.ah = bt.aq;
                                this.m = (short) 1;
                                o();
                            } else {
                                this.e.b("银库中没有银两");
                            }
                        } else if (bt.ap > 0) {
                            a(bt.ap);
                            this.m = (short) 3;
                            o();
                        } else {
                            this.e.b("身上没有银两");
                        }
                    } else if (ca.g == 1) {
                        if (this.l == 3) {
                            e(2);
                        } else if (this.l != 4) {
                            o();
                            a(99L);
                            this.m = (short) 4;
                        } else if (bt.ap > 0) {
                            this.ah = bt.ap;
                            this.m = (short) 2;
                            o();
                        } else {
                            this.e.b("身上没有银两");
                        }
                    }
                } else if (i2 == 536870912) {
                    this.l = (short) 0;
                    m();
                }
            } else if (this.m == 1 || this.m == 2 || this.m == 3) {
                if (i2 == 268435456 || i2 == 1073741824) {
                    if (n() == -1) {
                        this.e.b("输入有误,请重新输入");
                    } else if (n() > this.ah) {
                        if (this.m == 1) {
                            this.e.b("超出最大值,请重新输入");
                        } else {
                            this.e.b("您的银两不足,请重新输入");
                        }
                    } else if (this.m == 1) {
                        byte[] bArrA5 = bz.a((short) 4159, bt.ad, n(), (byte) 0);
                        if (bArrA5 != null) {
                            a.i.a(new w((short) 4159, bArrA5));
                            this.e.a((String) null);
                        } else {
                            this.e.b("获取上传指令数据错误!");
                        }
                    } else if (this.m == 2) {
                        byte[] bArrA6 = bz.a((short) 4159, bt.ad, n(), (byte) 1);
                        if (bArrA6 != null) {
                            a.i.a(new w((short) 4159, bArrA6));
                            this.e.a((String) null);
                        } else {
                            this.e.b("获取上传指令数据错误!");
                        }
                    } else if (this.m == 3) {
                        this.at = new StringBuffer().append("确定消耗").append(bt.a(n())).append("进行攻城竞标？").toString();
                        ca.h = 0;
                        this.m = (short) 5;
                    }
                } else if (i2 == 536870912) {
                    this.e.o();
                    this.m = (short) 0;
                } else {
                    d(i2);
                }
            } else if (this.m == 4) {
                b(i2);
                if (i2 == 268435456 || i2 == 1073741824 || i2 == 517) {
                    this.at = new StringBuffer().append("确定消耗").append(this.ag).append("金豆进行攻城竞标？").toString();
                    ca.h = 0;
                    this.m = (short) 6;
                } else if (i2 == 536870912) {
                    this.m = (short) 0;
                }
            } else if (this.m == 5) {
                if (i2 == 268435456 || i2 == 1073741824 || i2 == 517) {
                    byte[] bArrA7 = bz.a((short) 4676, (byte) 1, n(), bt.ad);
                    if (bArrA7 != null) {
                        a.i.a(new w((short) 4676, bArrA7));
                        this.e.a((String) null);
                    } else {
                        this.e.b("获取上传指令数据错误!");
                    }
                } else if (i2 == 536870912) {
                    this.m = (short) 0;
                    ca.h = 0;
                    this.at = null;
                }
            } else if (this.m == 6) {
                if (i2 == 268435456 || i2 == 1073741824 || i2 == 517) {
                    byte[] bArrA8 = bz.a((short) 4676, (byte) 2, this.ag, bt.ad);
                    if (bArrA8 != null) {
                        a.i.a(new w((short) 4676, bArrA8));
                        this.e.a((String) null);
                    } else {
                        this.e.b("获取上传指令数据错误!");
                    }
                } else if (i2 == 536870912) {
                    this.m = (short) 0;
                    ca.h = 0;
                    this.at = null;
                }
            }
        } else if (this.l == 5) {
            if (i2 == 1 || i2 == 514) {
                if (this.an != null) {
                    ca.g = ca.g + (-1) >= 0 ? ca.g - 1 : this.an.length - 1;
                }
            } else if (i2 == 4 || i2 == 520) {
                if (this.an != null) {
                    ca.g = ca.g + 1 < this.an.length ? ca.g + 1 : 0;
                }
            } else if (i2 == 268435456 || i2 == 1073741824 || i2 == 517) {
                if (ca.g == 0) {
                    if (bt.fA != null) {
                        j(2);
                    } else {
                        this.e.b("您没有宠物!");
                    }
                } else if (ca.g == 1) {
                    if (bt.gs != null) {
                        aF();
                    } else {
                        this.e.b("没有寄养宠物!");
                    }
                }
            } else if (i2 == 536870912) {
                this.l = (short) 0;
                m();
            }
        } else if (this.l == 7) {
            if (i2 == 514 || i2 == 1) {
                ca.g = ca.g == 0 ? 1 : 0;
            } else if (i2 == 520 || i2 == 4) {
                ca.g = ca.g == 1 ? 0 : 1;
            } else if (i2 == 268435456 || i2 == 1073741824 || i2 == 517) {
                if (ca.g == 0) {
                    bt.gQ = (short) 1;
                    this.S.a();
                } else if (ca.g == 1) {
                    this.e.p();
                }
            } else if (i2 == 536870912) {
                this.l = (short) 0;
                m();
            }
        } else if (this.l == 9) {
            if (i2 == 514 || i2 == 1) {
                ca.g = ca.g != 0 ? 0 : 1;
            } else if (i2 == 520 || i2 == 4) {
                ca.g = ca.g == 1 ? 0 : 1;
            } else if (i2 == 268435456 || i2 == 1073741824 || i2 == 517) {
                if (ca.g == 0) {
                    aq aqVar4 = this.M;
                    byte[] bArrQ = bz.q((short) 4219, bt.ad);
                    if (bArrQ != null) {
                        a.i.a(new w((short) 4219, bArrQ));
                        aqVar4.b.a((String) null);
                    } else {
                        aqVar4.b.b("获取上传指令数据错误!");
                    }
                } else if (ca.g == 1) {
                    this.e.a("输入公告", 0);
                }
            } else if (i2 == 536870912) {
                this.l = (short) 0;
                m();
            }
        }
        this.e.b = 0;
    }

    private void v(Graphics graphics) {
        int i2;
        int i3;
        this.e.aq.a(graphics);
        ca.a(graphics, this.e.aq.a + 5, this.e.aq.b + 29, this.e.aq.c - 11, (this.e.aq.d - 30) - l.b(), 1);
        int i4 = this.e.aq.a + 8;
        int i5 = this.e.aq.b + 32;
        int i6 = this.e.aq.c - 16;
        int i7 = ((this.e.aq.d - 29) - 24) - 10;
        int i8 = ((((i7 - (a.L.c << 1)) - a.H.c) - a.G.c) - (x.c << 1)) / 7;
        int i9 = i5 + ((((((i7 - (a.L.c << 1)) - a.H.c) - a.G.c) - (x.c << 1)) % 7) / 2) + i8;
        int i10 = 0;
        while (true) {
            int i11 = i10;
            if (i11 >= 8) {
                break;
            }
            int i12 = (((i6 - 144) % 9) / 2) + i4 + (((i6 - 144) / 9) * (i11 + 1)) + (i11 * 18);
            short s2 = x.b;
            short s3 = x.c;
            if (this.cv != null && this.cv.length > i11) {
                this.cv[i11][0] = i12;
                this.cv[i11][1] = i9;
                this.cv[i11][2] = s2;
                this.cv[i11][3] = s3;
            }
            a.f.a(graphics, x, (int[]) null, (aj) null, 0, 0, this.cv[i11][0], this.cv[i11][1], 0, 0);
            i10 = i11 + 1;
        }
        if (this.ct == 0) {
            if (bt.fs != null && bt.fs.length > 0) {
                int i13 = 0;
                while (true) {
                    int i14 = i13;
                    if (i14 >= bt.fs.length) {
                        break;
                    }
                    a.f.a(graphics, b(bt.fs[i14]), (int[]) null, (aj) null, 0, 0, (((i6 - 144) % 9) / 2) + i4 + (((i6 - 144) / 9) * (bt.fr[i14] + 1)) + (bt.fr[i14] * 18) + 1, i9 + 1, 0, 0);
                    if (bt.fq[i14] > 9) {
                        a.f.a(graphics, a.n, (int[]) null, bt.fq[i14] / 10, 0, 0, (((i6 - 144) % 9) / 2) + i4 + (((i6 - 144) / 9) * (bt.fr[i14] + 1)) + (bt.fr[i14] * 18) + 1, i9 + 1, 0, 0);
                        a.f.a(graphics, a.n, (int[]) null, bt.fq[i14] % 10, 0, 0, (((i6 - 144) % 9) / 2) + i4 + (((i6 - 144) / 9) * (bt.fr[i14] + 1)) + (bt.fr[i14] * 18) + 5, i9 + 1, 0, 0);
                    } else if (bt.fq[i14] > 1) {
                        a.f.a(graphics, a.n, (int[]) null, bt.fq[i14] % 10, 0, 0, (((i6 - 144) % 9) / 2) + i4 + (((i6 - 144) / 9) * (bt.fr[i14] + 1)) + (bt.fr[i14] * 18) + 1, i9 + 1, 0, 0);
                    }
                    i13 = i14 + 1;
                }
            }
        } else if (this.ct == 1 && bt.fx != null) {
            Image image = b((short) 1920).a;
            for (int i15 = 0; i15 < bt.fx.length; i15++) {
                graphics.drawImage(image, (((i6 - 144) % 9) / 2) + i4 + (((i6 - 144) / 9) * (bt.fy[i15] + 1)) + (bt.fy[i15] * 18) + 1, i9 + 1, 0);
            }
        }
        if (this.ar == 0) {
            ca.d(graphics, (((i6 - 144) % 9) / 2) + i4 + (((i6 - 144) / 9) * (this.e.ax + 1)) + (this.e.ax * 18), i9, 18, 18);
            i2 = i9;
        } else {
            i2 = 0;
        }
        int i16 = x.c + i9 + i8;
        a(graphics, i4, i16, i6, (byte) 0);
        int i17 = a.K.c + i16;
        a(graphics, i4, i17, i4 + i6, i17);
        int i18 = i17 + 5 + i8;
        a.f.a(graphics, a.G, (int[]) null, (aj) null, 0, 0, ((i6 / 2) + i4) - (a.G.b / 2), i18, 0, 0);
        int i19 = a.G.c + i18 + i8;
        int i20 = 0;
        while (true) {
            int i21 = i20;
            if (i21 >= 8) {
                break;
            }
            int i22 = (((i6 - 144) % 9) / 2) + i4 + (((i6 - 144) / 9) * (i21 + 1)) + (i21 * 18);
            short s4 = x.b;
            short s5 = x.c;
            if (this.cw != null && this.cw.length > i21) {
                this.cw[i21][0] = i22;
                this.cw[i21][1] = i19;
                this.cw[i21][2] = s4;
                this.cw[i21][3] = s5;
            }
            a.f.a(graphics, x, (int[]) null, (aj) null, 0, 0, this.cw[i21][0], this.cw[i21][1], 0, 0);
            i20 = i21 + 1;
        }
        if (this.ct == 0) {
            if (bt.fl != null && bt.fl.length > 0) {
                int i23 = 0;
                while (true) {
                    int i24 = i23;
                    if (i24 >= bt.fl.length) {
                        break;
                    }
                    a.f.a(graphics, b(bt.fl[i24]), (int[]) null, (aj) null, 0, 0, (((i6 - 144) % 9) / 2) + i4 + (((i6 - 144) / 9) * (bt.fk[i24] + 1)) + (bt.fk[i24] * 18) + 1, i19 + 1, 0, 0);
                    if (bt.fj[i24] > 9) {
                        a.f.a(graphics, a.n, (int[]) null, bt.fj[i24] / 10, 0, 0, (((i6 - 144) % 9) / 2) + i4 + (((i6 - 144) / 9) * (bt.fk[i24] + 1)) + (bt.fk[i24] * 18) + 1, i19 + 1, 0, 0);
                        a.f.a(graphics, a.n, (int[]) null, bt.fj[i24] % 10, 0, 0, (((i6 - 144) % 9) / 2) + i4 + (((i6 - 144) / 9) * (bt.fk[i24] + 1)) + (bt.fk[i24] * 18) + 5, i19 + 1, 0, 0);
                    } else if (bt.fj[i24] > 1) {
                        a.f.a(graphics, a.n, (int[]) null, bt.fj[i24] % 10, 0, 0, (((i6 - 144) % 9) / 2) + i4 + (((i6 - 144) / 9) * (bt.fk[i24] + 1)) + (bt.fk[i24] * 18) + 1, i19 + 1, 0, 0);
                    }
                    i23 = i24 + 1;
                }
            }
        } else if (this.ct == 1 && bt.fu != null) {
            Image image2 = b((short) 1920).a;
            for (int i25 = 0; i25 < bt.fu.length; i25++) {
                graphics.drawImage(image2, (((i6 - 144) % 9) / 2) + i4 + (((i6 - 144) / 9) * (bt.fv[i25] + 1)) + (bt.fv[i25] * 18) + 1, i19 + 1, 0);
            }
        }
        if (this.ar == 1) {
            ca.d(graphics, (((i6 - 144) % 9) / 2) + i4 + (((i6 - 144) / 9) * (this.e.ax + 1)) + (this.e.ax * 18), i19, 18, 18);
            i3 = i19;
        } else {
            i3 = i2;
        }
        int i26 = i19 + 18 + i8;
        a(graphics, i4, i26, i6, (byte) 1);
        int i27 = a.K.c + i26;
        a(graphics, i4, i27, i4 + i6, i27);
        int i28 = i27 + 5 + i8 + ((((((i7 - (a.L.c << 1)) - a.H.c) - a.G.c) - (x.c << 1)) % 7) / 2);
        d(0, ((i6 / 4) + i4) - (a.K.b / 2), i28, a.H.b, a.H.c);
        if (bt.i == 0 && bt.j == -1) {
            a.f.a(graphics, a.I, (int[]) null, (aj) null, 0, 0, this.cx[0][0], this.cx[0][1], 0, 0);
        } else if (bt.j == 0 && bt.i == -1) {
            a.f.a(graphics, a.I, (int[]) null, (aj) null, 0, 0, this.cx[0][0], this.cx[0][1], 0, 0);
        } else if (bt.i == 0 && bt.j == 0) {
            a.f.a(graphics, a.J, (int[]) null, (aj) null, 0, 0, this.cx[0][0], this.cx[0][1], 0, 0);
        } else {
            a.f.a(graphics, a.H, (int[]) null, (aj) null, 0, 0, this.cx[0][0], this.cx[0][1], 0, 0);
        }
        d(1, (((i6 * 3) / 4) + i4) - (a.K.b / 2), i28, a.K.b, a.K.c);
        a.f.a(graphics, a.K, (int[]) null, (aj) null, 0, 0, this.cx[1][0], this.cx[1][1], 0, 0);
        if (this.cu != null) {
            ca.b(graphics, this.cu, (((i6 - 144) % 9) / 2) + i4 + (((i6 - 144) / 9) * (this.e.ax + 1)) + (this.e.ax * 18) + 16, i3 + 16, t.e + t.g, 1);
        }
        if ((this.ar == 1 && (this.l == 1 || this.l == 2)) || (this.ar == 0 && this.l == 3)) {
            ca.c(graphics);
        } else if (this.l == 5) {
            ca.a(graphics, "确定放弃该次交易?", new String[]{"确定", "取消"});
        } else if (this.l == 6) {
            b(graphics, "输入交易银两");
        }
    }

    private void w(byte b2) {
        byte[] bArrJ = bz.j((short) 4357, bt.ad, b2);
        if (bArrJ == null) {
            this.e.b("获取上传指令数据错误!");
        } else {
            a.i.a(new w((short) 4357, bArrJ));
            this.e.a((String) null);
        }
    }

    private void w(int i2) {
        if (this.e.aq != null) {
            this.e.aq.b(i2);
            if (i2 == 268435456 || i2 == 1073741824 || i2 == 517) {
                byte[] bArrA = bz.a((short) 4142, bt.ad, (int) (this.bJ ? bt.t[this.af].a : (short) -1), bt.cr[this.e.ar.g()]);
                if (bArrA == null) {
                    this.e.b("获取上传指令数据错误!");
                    return;
                } else {
                    a.i.a(new w((short) 4142, bArrA));
                    this.e.a((String) null);
                    return;
                }
            }
            if (i2 == 536870912) {
                if (this.bJ) {
                    K = null;
                    m();
                } else if (this.by == 1) {
                    this.by = (byte) 0;
                    N();
                } else {
                    l();
                    c(3);
                }
            }
        }
    }

    private void w(Graphics graphics) {
        int i2 = 1;
        while (true) {
            int i3 = i2;
            if (i3 >= 7) {
                ca.d(graphics, (this.aB - 7) + (this.aq * 19), this.aC + 1 + (this.ar * 19), 17, 17);
                graphics.setClip(0, 0, t.b, t.c);
                return;
            }
            int i4 = 0;
            while (true) {
                int i5 = i4;
                if (i5 < 8) {
                    a.f.a(graphics, C, (int[]) null, (i5 * 6) + i3, 0, 0, ((i3 - 1) * 19) + (this.aB - 6), (i5 * 19) + this.aC + 2, 0, 0);
                    int i6 = ((i5 * 6) + i3) - 1;
                    int i7 = (this.aB - 6) + ((i3 - 1) * 19);
                    int i8 = this.aC + 2 + (i5 * 19);
                    if (this.cz != null && this.cz.length > i6) {
                        this.cz[i6][0] = i7;
                        this.cz[i6][1] = i8;
                        this.cz[i6][2] = 17;
                        this.cz[i6][3] = 17;
                    }
                    i4 = i5 + 1;
                }
            }
            i2 = i3 + 1;
        }
    }

    private void x(byte b2) {
        byte[] bArrB = bz.b((short) 4881, b2, bt.ad);
        if (bArrB == null) {
            this.e.b("获取上传指令数据错误!");
        } else {
            a.i.a(new w((short) 4881, bArrB));
            this.e.a((String) null);
        }
    }

    private void x(int i2) {
        byte[] bArrA;
        if (this.e.aq != null) {
            this.e.aq.b(i2);
        }
        if (this.e.aA <= 40) {
            if (i2 == 8 || i2 == 516) {
                this.bM[this.e.ar.g()] = (short) (r0[r2] - 1);
                if (this.bM[this.e.ar.g()] < 0) {
                    short[] sArr = this.bM;
                    int iG = this.e.ar.g();
                    sArr[iG] = (short) (sArr[iG] + 1);
                    return;
                }
                a(this.e.ar.g(), (byte) -1);
            } else if (i2 == 2 || i2 == 518) {
                short[] sArr2 = this.bM;
                int iG2 = this.e.ar.g();
                sArr2[iG2] = (short) (sArr2[iG2] + 1);
                int i3 = 0;
                for (int i4 = 0; i4 < this.bM.length; i4++) {
                    i3 += this.bM[i4];
                }
                if (i3 > (this.k == 37 ? bt.bf : bt.fW[this.aE])) {
                    this.bM[this.e.ar.g()] = (short) (r0[r1] - 1);
                    return;
                }
                a(this.e.ar.g(), (byte) 1);
            }
            this.e.aA++;
        } else if (this.e.b == 8 || this.e.b == 516) {
            this.bM[this.e.ar.g()] = (short) (r0[r2] - 1);
            if (this.bM[this.e.ar.g()] < 0) {
                short[] sArr3 = this.bM;
                int iG3 = this.e.ar.g();
                sArr3[iG3] = (short) (sArr3[iG3] + 1);
                return;
            }
            a(this.e.ar.g(), (byte) -1);
        } else if (this.e.b == 2 || this.e.b == 518) {
            short[] sArr4 = this.bM;
            int iG4 = this.e.ar.g();
            sArr4[iG4] = (short) (sArr4[iG4] + 1);
            int i5 = 0;
            for (int i6 = 0; i6 < this.bM.length; i6++) {
                i5 += this.bM[i6];
            }
            if (i5 > (this.k == 37 ? bt.bf : bt.fW[this.aE])) {
                this.bM[this.e.ar.g()] = (short) (r0[r1] - 1);
                return;
            }
            a(this.e.ar.g(), (byte) 1);
        }
        if (i2 == 268435456) {
            if (this.k == 37) {
                this.ao = true;
                bArrA = bz.a((short) 4186, bt.ad, this.bM);
            } else {
                this.ap = true;
                bArrA = bz.a((short) 4187, bt.ad, bt.fA[this.aE], this.bM);
            }
            a.i.a(new w((short) 4186, bArrA));
            this.e.a((String) null);
            return;
        }
        if (i2 == 536870912) {
            if (this.k != 37) {
                c(0, this.aE, this.aA);
                ca.o = 7;
                this.l = (short) 1;
            } else {
                this.al = null;
                if (this.j != 1) {
                    N();
                } else {
                    av();
                    c(4);
                }
            }
        }
    }

    private void x(Graphics graphics) {
        int i2;
        int i3 = 0;
        int size = this.cD.size();
        int i4 = size < 3 ? size : 3;
        int i5 = t.j;
        if (i5 <= 16) {
            i5 = 16;
        }
        int i6 = 0;
        while (i6 < 3) {
            b bVar = i6 < this.cD.size() ? (b) this.cD.elementAt(i3) : null;
            if (bVar != null) {
                ca.a(graphics, 2109231, 175, 0, t.c - ((i4 - i3) * i5), t.b, i5);
                bVar.a(graphics, a.f, C, 2, t.c - ((i4 - i3) * i5));
                i2 = i3 + 1;
            } else {
                i2 = i3;
            }
            i6++;
            i3 = i2;
        }
    }

    private bn y(int i2) {
        int i3 = (this.e.as.a << 5) + i2;
        int i4 = 0;
        while (true) {
            int i5 = i4;
            if (i5 >= bt.bC.size()) {
                return null;
            }
            bn bnVar = (bn) bt.bC.elementAt(i5);
            if (bnVar != null && bnVar.h == i3) {
                return bnVar;
            }
            i4 = i5 + 1;
        }
    }

    private void y(Graphics graphics) {
        try {
            int iG = h - g();
            int iH = i - h();
            for (int i2 = 0; i2 < bl.size(); i2++) {
                by byVar = (by) bl.elementAt(i2);
                if (byVar.a && byVar != null) {
                    if (byVar.b == 6) {
                        bx bxVar = (bx) byVar.c;
                        a.f.a(graphics, bxVar, ((cb) byVar).d, iG, iH, bxVar.e, bxVar.f, 0);
                    } else if (byVar.b == 1) {
                        this.I.a(graphics, a.f, iG, iH, (byte) 0);
                    } else if (byVar.b == 2) {
                        bl blVar = (bl) byVar.c;
                        ai aiVar = a.f;
                        if (blVar.g != null) {
                            aiVar.a(graphics, blVar.g, (int[]) null, iG, iH, blVar.j + 8, blVar.k + 16, 20, 0);
                            if (blVar.e != null && aW[2] == 0) {
                                if (blVar.b != null && !blVar.b.equals("")) {
                                    ca.a(graphics, blVar.b, (blVar.j - iG) + 8, (((blVar.k - iH) - (t.j << 1)) - blVar.g.j()) + 16, 17, blVar.a(blVar.u, blVar.p));
                                }
                                ca.a(graphics, blVar.e, (blVar.j - iG) + 8, (((blVar.k - iH) - t.j) - blVar.g.j()) + 16, 17, blVar.a(blVar.u, blVar.p), 0);
                            }
                            if (blVar.p == 1 && y != null) {
                                aiVar.a(graphics, y, (int[]) null, (aj) null, iG, iH, (blVar.j + 8) - (aW[2] == 0 ? (t.i.stringWidth(blVar.e) / 2) + y.b : y.b / 2), (blVar.k - t.j) - 18, 20, 0);
                            } else if (blVar.p == 0 && z != null) {
                                aiVar.a(graphics, z, (int[]) null, (aj) null, iG, iH, (blVar.j + 8) - (aW[2] == 0 ? (t.i.stringWidth(blVar.e) / 2) + z.b : z.b / 2), (blVar.k - t.j) - 18, 20, 0);
                            }
                        }
                    } else if (byVar.b == 3) {
                        bp bpVar = (bp) byVar.c;
                        ai aiVar2 = a.f;
                        if (bpVar.g != null) {
                            aiVar2.a(graphics, bpVar.g, (int[]) null, iG, iH, bpVar.j + 8, bpVar.k + 16, 20, 0);
                            if (bpVar.e != null && (bpVar.b.equals(bt.ad) || aW[4] == 0)) {
                                if (bpVar.c != null && !bpVar.c.equals("")) {
                                    ca.a(graphics, bpVar.c, (bpVar.j - iG) + 8, (((bpVar.k - iH) - (t.j << 1)) - bpVar.g.j()) + 16, 17, 65280);
                                }
                                ca.a(graphics, bpVar.e, (bpVar.j - iG) + 8, (((bpVar.k - iH) - t.j) - bpVar.g.j()) + 16, 17, 65280, 0);
                            }
                            if (bpVar.s == 1) {
                                aiVar2.a(graphics, y, (int[]) null, (aj) null, iG, iH, (bpVar.j + 8) - (aW[4] == 0 ? (t.i.stringWidth(bpVar.e) / 2) + y.b : y.b / 2), (bpVar.k - t.j) - 18, 20, 0);
                            } else if (bpVar.s == 0) {
                                aiVar2.a(graphics, z, (int[]) null, (aj) null, iG, iH, (bpVar.j + 8) - (aW[4] == 0 ? (t.i.stringWidth(bpVar.e) / 2) + z.b : z.b / 2), (bpVar.k - t.j) - 18, 20, 0);
                            }
                        }
                    } else if (byVar.b == 5) {
                        az azVar = (az) byVar.c;
                        if (aW[10] == 0) {
                            int i3 = azVar.c / 16;
                            int i4 = azVar.d / 16;
                            int i5 = (this.I.j + 8) / 16;
                            int i6 = (this.I.k + 8) / 16;
                            if ((i3 == i5 && i4 == i6) || ((i3 - 1 == i5 && i4 == i6) || ((i3 + 1 == i5 && i4 == i6) || ((i3 - 1 == i5 && i4 - 1 == i6) || ((i3 == i5 && i4 - 1 == i6) || ((i3 + 1 == i5 && i4 - 1 == i6) || ((i3 - 1 == i5 && i4 + 1 == i6) || ((i3 == i5 && i4 + 1 == i6) || (i3 + 1 == i5 && i4 + 1 == i6))))))))) {
                                azVar.x = true;
                            } else {
                                azVar.x = false;
                                azVar.e();
                            }
                        }
                        ai aiVar3 = a.f;
                        if (aW[10] == 1) {
                            if (azVar.w != null && azVar.w.k != null) {
                                aiVar3.a(graphics, azVar.w.k[azVar.w.f], azVar.w.g(), azVar.w.h(), null, iG, iH, azVar.c, azVar.d, 20, 0);
                            }
                        } else if (azVar.w != null && azVar.w.k != null) {
                            aiVar3.a(graphics, azVar.w, (int[]) null, iG, iH, azVar.c, azVar.d, 20, 0);
                        }
                        if (azVar.b != null && azVar.x && aW[3] == 1) {
                            ca.a(graphics, azVar.b, azVar.c - iG, ((azVar.d - (azVar.w == null ? (short) 30 : azVar.w.j())) - t.j) - iH, 17, 255, 16777215);
                        }
                        azVar.a(graphics, aiVar3, iG, iH, (byte) 0);
                    } else if (byVar.b == 4) {
                        ((au) byVar.c).a(graphics, a.f, iG, iH, (byte) 0);
                    } else if (byVar.b == 7) {
                        ((s) byVar.c).a(graphics, a.f, iG, iH, (byte) 0);
                    } else if (byVar.b == 8) {
                        ((bv) byVar.c).a(graphics, a.f, iG, iH, (byte) 0);
                    }
                }
            }
            if (aW[10] != 1 || bt.t == null) {
                return;
            }
            for (int i7 = 0; i7 < bt.t.length; i7++) {
                if (bt.t[i7] != null) {
                    int i8 = bt.t[i7].c / 16;
                    int i9 = bt.t[i7].d / 16;
                    int i10 = (this.I.j + 8) / 16;
                    int i11 = (this.I.k + 8) / 16;
                    if ((i8 == i10 && i9 == i11) || ((i8 - 1 == i10 && i9 == i11) || ((i8 + 1 == i10 && i9 == i11) || ((i8 - 1 == i10 && i9 - 1 == i11) || ((i8 == i10 && i9 - 1 == i11) || ((i8 + 1 == i10 && i9 - 1 == i11) || ((i8 - 1 == i10 && i9 + 1 == i11) || ((i8 == i10 && i9 + 1 == i11) || (i8 + 1 == i10 && i9 + 1 == i11))))))))) {
                        bt.t[i7].x = true;
                    } else {
                        bt.t[i7].x = false;
                        bt.t[i7].e();
                    }
                    bt.t[i7].a(graphics, a.f, iG, iH, (byte) 0);
                }
            }
        } catch (Exception e) {
            c("系统异常[9]");
            e.printStackTrace();
        }
    }

    private int z(int i2) {
        int i3 = (this.e.as.a << 5) + i2;
        for (int i4 = 0; i4 < bt.bC.size(); i4++) {
            bn bnVar = (bn) bt.bC.elementAt(i4);
            if (bnVar != null && bnVar.h == i3) {
                return bnVar.a;
            }
        }
        return 0;
    }

    private void z(Graphics graphics) {
        if (!bt.G() || bt.ih == null) {
            return;
        }
        for (int i2 = 0; i2 < bt.ih.length; i2++) {
            this.cI[0] = bt.ie[i2];
            this.cI[1] = bt.f2if[i2];
            this.cI[2] = bt.ig[i2];
            this.cI[3] = bt.ih[i2];
            graphics.setColor(3781962);
            graphics.drawRect((this.cI[0] - h) + g(), (this.cI[1] - i) + h(), this.cI[2], this.cI[3]);
            graphics.drawRect(((this.cI[0] - h) + g()) - 1, ((this.cI[1] - i) - 1) + h(), this.cI[2] + 2, this.cI[3] + 2);
        }
    }

    public final void A() {
        if (bt.nb == null) {
            this.e.aq.j();
            this.e.aq.a("消除特效");
            this.e.aq.a(true);
            this.e.ar.a((Image[]) null, (String[]) null, (String[]) null, (String[]) null);
            this.e.au.a("");
            this.e.aq.a(this.e.ar);
            if (t.c > 220) {
                this.e.aq.a(this.e.au);
            }
            this.e.aq.a(t.f, t.g, t.d, t.e);
        } else {
            this.e.aq.j();
            this.e.aq.a("消除特效");
            this.e.aq.a(true);
            String[] strArr = new String[bt.nb.length];
            for (int i2 = 0; i2 < strArr.length; i2++) {
                strArr[i2] = bt.na;
            }
            this.e.ar.a((Image[]) null, strArr, bt.nc, bt.nd);
            this.e.au.a("");
            this.e.aq.a(this.e.ar);
            if (t.c > 220) {
                this.e.aq.a(this.e.au);
            }
            this.e.aq.a(t.f, t.g, t.d, t.e);
        }
        this.l = (short) 0;
        this.e.j = this.e.k;
        this.k = (short) 121;
        this.j = (short) 121;
    }

    public final void B() {
        this.l = (short) 0;
        this.e.aq.j();
        this.e.aq.a("激活特效");
        this.e.aq.a(true);
        a(bt.mX);
        this.e.ar.a(b(bt.mX), bt.mW, (String[]) null, bt.mY);
        this.e.at.b(null, t.i, (byte) 2);
        this.e.at.a((byte) 1);
        this.e.au.a("");
        this.e.aq.a(this.e.ar);
        this.e.aq.a(this.e.at);
        if (t.c > 220) {
            this.e.aq.a(this.e.au);
        }
        this.e.aq.a(t.f, t.g, t.d, t.e);
        this.e.j = this.e.k;
        this.k = (short) 122;
        this.j = (short) 122;
    }

    public final void C() {
        this.l = (short) 0;
        if (this.j != 34) {
            this.aV = 0;
            this.e.as.a(new String[]{"拍卖中", "仓库", "记录"});
        }
        if (this.j == 34 && (this.j != 34 || this.e.as.a == 2)) {
            this.e.aq.b();
            this.e.aq.a("宠物拍卖详情");
            this.e.aq.a(true);
            this.e.au.a("确定");
            this.e.au.a(true);
            this.e.at.a(aY(), t.i, (byte) 2);
            this.e.at.a((byte) 0);
            this.e.aq.a(this.e.as);
            this.e.aq.a(this.e.at);
            if (t.c > 220) {
                this.e.aq.a(this.e.au);
            }
            this.e.aq.a(t.f, t.g, t.d, t.e);
            this.e.j = this.e.k;
            this.k = (short) 34;
            this.j = (short) 34;
            return;
        }
        this.e.aq.b();
        this.e.aq.a("宠物拍卖详情");
        this.e.ar.a((Image[]) null, bt.gt, e(bt.gu), a(bt.gv));
        if (this.e.as.a == 0) {
            this.e.au.a("下架");
        } else {
            this.e.au.a("取回");
        }
        this.e.au.a(true);
        this.e.at.a(bt.a(this.e.l, 0, this.e.as.a), t.i, (byte) 2);
        this.e.at.a((byte) 1);
        this.e.aq.a(this.e.as);
        this.e.aq.a(this.e.ar);
        this.e.aq.a(this.e.at);
        this.e.aq.a(this.e.au);
        this.e.aq.a(t.f, t.g, t.d, t.e);
        this.e.aq.a(true);
        if (bt.gw != null) {
            a(bt.gw[0], bt.gx[0], bt.gy[0], bt.gz[0]);
            this.aI = a.ah.a(String.valueOf(new StringBuffer().append((int) bt.gw[0]).append("_0").toString()), bt.gx[0], bt.gy[0], bt.gz[0]);
        }
        this.e.j = this.e.k;
        this.k = (short) 34;
        this.j = (short) 34;
    }

    public final void D() {
        aF();
        this.e.ar.a(this.aA, this.aE >= bt.gs.length ? bt.gs.length - 1 : this.aE);
        if (bt.gw != null) {
            a(bt.gw[this.e.ar.g()], bt.gx[this.e.ar.g()], bt.gy[this.e.ar.g()], bt.gz[this.e.ar.g()]);
            this.aI = a.ah.a(String.valueOf(new StringBuffer().append((int) bt.gw[this.e.ar.g()]).append("_0").toString()), bt.gx[this.e.ar.g()], bt.gy[this.e.ar.g()], bt.gz[this.e.ar.g()]);
        }
    }

    public final void E() {
        if (bt.fz[this.e.ar.g()] == 0) {
            ca.a(o + 70, (t.j * 2) + 5 + (this.e.ar.i() * t.j) + p, new String[]{"喂养", "附魂", "学习", "继承", "出战", "状态", "改名", "配点", "技能", "装备", "炼化"}, false);
        } else {
            ca.a(o + 70, (t.j * 2) + 5 + (this.e.ar.i() * t.j) + p, new String[]{"喂养", "附魂", "学习", "继承", "休息", "状态", "改名", "配点", "技能", "装备", "炼化"}, false);
        }
    }

    public final void F() {
        this.l = (short) 0;
        this.e.aw = 0;
        ca.l = 0;
        this.ar = 0;
        this.aq = 0;
        this.e.aq.b();
        this.e.aq.a("买东西");
        this.e.aq.a(true);
        this.e.as.a(new String[]{"货柜一"});
        this.e.as.a((byte) 1);
        this.e.aq.a(t.e <= 240 ? 79 : 120);
        if (bt.bY == null || bt.bY.length <= 0) {
            this.e.at.a("没有物品,按3、9键可以上下翻滚此属性描述框", t.i, (byte) 1);
        } else {
            this.e.at.a(Y((this.ar << 3) + this.aq), t.i, (byte) 1);
        }
        this.e.at.a((byte) 1);
        this.e.au.a("");
        this.e.aq.a(this.e.as);
        this.e.aq.a(this.e.at);
        this.e.aq.a(this.e.au);
        this.e.aq.a(t.f, t.g, t.d, t.e);
        this.e.j = this.e.k;
        this.k = (short) 8;
        this.j = (short) 8;
    }

    public final void G() {
        if (bt.ct == null || (this.e.as.a << 5) + (this.ar << 3) + this.aq >= bt.ct.length) {
            this.e.at.a("没有商品,按3、9键可以上下翻滚此属性描述框", t.i, (byte) 1);
        } else {
            this.e.at.a(bt.a(this.k, this.e.l, (this.e.as.a << 5) + (this.ar << 3) + this.aq), t.i, (byte) 1);
        }
        this.e.at.a((byte) 1);
        ca.l = 0;
    }

    public final void H() {
        this.e.aq.b();
        this.e.aq.a("物品拍卖场");
        this.e.ar.a((Image[]) null, new String[]{"关键字", "武器", "头盔", "衣甲", "鞋子", "饰品", "书籍", "材料", "打造"}, (String[]) null, (String[]) null);
        this.e.au.a("搜索");
        this.e.aq.a(this.e.ar);
        if (t.c > 220) {
            this.e.aq.a(this.e.au);
        }
        this.e.aq.a(t.f, t.g, t.d, t.e);
        this.k = (short) 14;
        this.j = (short) 14;
    }

    public final void I() {
        a(bt.ec);
        this.e.aq.b();
        if (this.k != 23) {
            this.e.as.a(new String[]{"低价", "高价"});
            this.e.as.a((byte) 0);
        }
        if (bt.dY == null || bt.dY.length <= 0) {
            this.e.ar.a((Image[]) null, (String[]) null, (String[]) null, (String[]) null);
        } else {
            this.e.ar.a(b(bt.ec), a(this.e.l, bt.dZ, bt.eb), a(bt.eg), (String[]) null);
            if (this.j == 64) {
                this.e.ar.a(this.aA, this.aq);
                this.e.as.a = this.aH;
            }
            this.e.ar.a(af(this.e.ar.g()), 1);
        }
        this.e.aq.a("物品拍卖场");
        this.e.aq.a(true);
        this.e.au.a("购买");
        this.e.au.a(true);
        this.e.aq.a(this.e.as);
        this.e.aq.a(this.e.ar);
        if (t.c > 220) {
            this.e.aq.a(this.e.au);
        }
        this.e.aq.a(t.f, t.g, t.d, t.e);
        this.l = (short) 0;
        this.e.j = this.e.k;
        this.k = (short) 23;
        this.j = (short) 23;
    }

    public final void J() {
        if (bt.gw != null) {
            a(bt.gw[0], bt.gx[0], bt.gy[0], bt.gz[0]);
            this.aI = a.ah.a(String.valueOf(new StringBuffer().append((int) bt.gw[0]).append("_0").toString()), bt.gx[0], bt.gy[0], bt.gz[0]);
        }
        this.e.aq.b();
        this.e.aq.a("宠物拍卖场");
        if (this.j != 24) {
            this.e.as.a(new String[]{"低价", "高价"});
            this.e.as.a((byte) 0);
        }
        this.e.ar.a((Image[]) null, bt.gt, (String[]) null, a(bt.gv));
        this.e.at.a(bt.g(this.e.l, 0), t.i, (byte) 2);
        this.e.at.a((byte) 1);
        this.e.au.a("购买");
        this.e.au.a(true);
        this.e.aq.a(this.e.as);
        this.e.aq.a(this.e.ar);
        this.e.aq.a(this.e.at);
        if (t.c > 220) {
            this.e.aq.a(this.e.au);
        }
        this.e.aq.a(t.f, t.g, t.d, t.e);
        this.e.aq.a(true);
        this.l = (short) 0;
        this.e.j = this.e.k;
        this.k = (short) 24;
        this.j = (short) 24;
    }

    public final void K() {
        this.l = (short) 0;
        this.cp = -1;
        if (this.n) {
            this.n = false;
        }
        this.aR = false;
        aM();
        ca.a(aP.size(), 4, this.e.as.b + 6, t.b - 8, (t.c - this.e.as.b) - 6, ((t.c - this.e.as.b) - 6) / t.j, false);
        this.cr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, aP.size(), 4);
        this.l = (short) 1;
        this.e.aq.j();
        this.e.aq.a(false);
        this.e.aq.b(false);
        this.e.aq.a((String) null);
        this.e.as.a(new String[]{"全", "系", "世", "帮", "区", "队", "私", "跨"});
        this.e.aq.a(this.e.as);
        this.e.aq.a(0, 0, t.b, t.c);
        a.f.a(this.f, h, i, false, true, 2109231);
        this.k = (short) 18;
        this.j = (short) 18;
    }

    public final void L() {
        this.cz = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 42, 4);
        this.ar = 0;
        this.aq = 0;
        this.aB = (t.b - C.b) / 2;
        this.aC = (t.c - C.c) / 2;
        a.f.a(this.f, h, i, false, true, 2109231);
        a aVar = this.e;
        this.e.k = (short) 7;
        aVar.j = (short) 7;
        this.k = (short) 32;
    }

    public final void M() {
        short sC;
        short sB;
        short sA;
        short sB2;
        if (this.c) {
            return;
        }
        try {
            this.I.a(this.f, a.f, this.e.ak);
            bl.removeAllElements();
            ai.a(u, this.e.ak);
            ai.a(t, this.e.ak);
            ai.a(s, this.e.ak);
            if (bt.s != 0 && this.I.d != null && this.I.d.f != null) {
                if (c((int) this.I.d.h, (int) this.I.d.i, (int) this.I.d.f.g(), (int) this.I.d.f.h())) {
                    bl.addElement(new by((byte) 4, this.I.d, true));
                } else {
                    bl.addElement(new by((byte) 4, this.I.d, false));
                }
            }
            for (int i2 = 0; i2 < bm.size(); i2++) {
                au auVar = (au) bm.elementAt(i2);
                if (auVar.f != null) {
                    if (c((int) auVar.h, (int) auVar.i, (int) auVar.f.g(), (int) auVar.f.h())) {
                        bl.addElement(new by((byte) 4, auVar, true));
                    } else {
                        bl.addElement(new by((byte) 4, auVar, false));
                    }
                }
            }
            if (bt.t != null) {
                for (int i3 = 0; i3 < bt.t.length; i3++) {
                    if (bt.t[i3] != null) {
                        if (c(bt.t[i3].c, bt.t[i3].d - bt.t[i3].d(), bt.t[i3].c() / 2, bt.t[i3].d())) {
                            bl.addElement(new by((byte) 5, bt.t[i3], true));
                        } else {
                            bl.addElement(new by((byte) 5, bt.t[i3], false));
                        }
                    }
                }
            }
            if (bt.o != null) {
                for (int i4 = 0; i4 < bt.o.length; i4++) {
                    if (bt.o[i4] != null && bt.o[i4].g != null) {
                        if (c((int) bt.o[i4].j, (int) bt.o[i4].k, (int) bt.o[i4].g.g(), (int) bt.o[i4].g.h())) {
                            bl.addElement(new by((byte) 2, bt.o[i4], true));
                        } else {
                            bl.addElement(new by((byte) 2, bt.o[i4], false));
                        }
                    }
                }
            }
            if (bt.bs != -1 && bt.s == 0 && bt.q != null) {
                for (int i5 = 0; i5 < bt.q.length; i5++) {
                    if (bt.q[i5] != null && bt.q[i5].g != null && (bt.bs != 1 || !bt.q[i5].b.equals(bt.ad))) {
                        if (c((int) bt.q[i5].j, (int) bt.q[i5].k, (int) bt.q[i5].g.g(), (int) bt.q[i5].g.h())) {
                            bl.addElement(new by((byte) 3, bt.q[i5], true));
                        } else {
                            bl.addElement(new by((byte) 3, bt.q[i5], false));
                        }
                    }
                }
            }
            if (bt.bs != 0 || (bt.s == 1 && bt.bs == 0)) {
                bl.addElement(new by((byte) 1, this.I, true));
            }
            for (int i6 = 0; i6 < this.aO.size(); i6++) {
                s sVar = (s) this.aO.elementAt(i6);
                if (c((int) sVar.h, (int) sVar.i, (int) sVar.d(), (int) sVar.e())) {
                    bl.addElement(new by((byte) 7, sVar, true));
                } else {
                    bl.addElement(new by((byte) 7, sVar, false));
                }
            }
            if (bt.ij != null) {
                for (int i7 = 0; i7 < bt.ij.size(); i7++) {
                    bv bvVar = (bv) bt.ij.elementAt(i7);
                    if (c((int) bvVar.e, (int) bvVar.f, (int) bvVar.a(), (int) bvVar.b())) {
                        bl.addElement(new by((byte) 8, bvVar, true));
                    }
                }
            }
            if (this.f != null && this.f.l != null) {
                int size = bl.size();
                for (int i8 = 0; i8 < size; i8++) {
                    by byVar = (by) bl.elementAt(i8);
                    if (byVar.a && this.f.l != null) {
                        int[] iArr = this.cH;
                        switch (byVar.b) {
                            case 1:
                                sC = ((ar) byVar.c).o();
                                break;
                            case 2:
                                sC = ((bl) byVar.c).o();
                                break;
                            case 3:
                                sC = ((bp) byVar.c).o();
                                break;
                            case 4:
                                sC = ((au) byVar.c).c();
                                break;
                            case 5:
                                sC = ((az) byVar.c).a();
                                break;
                            case 6:
                            default:
                                sC = 0;
                                break;
                            case 7:
                                sC = ((s) byVar.c).c();
                                break;
                            case 8:
                                sC = ((bv) byVar.c).e;
                                break;
                        }
                        iArr[0] = sC;
                        int[] iArr2 = this.cH;
                        switch (byVar.b) {
                            case 1:
                                sB = ((ar) byVar.c).n();
                                break;
                            case 2:
                                sB = ((bl) byVar.c).n();
                                break;
                            case 3:
                                sB = ((bp) byVar.c).n();
                                break;
                            case 4:
                                sB = ((au) byVar.c).b();
                                break;
                            case 5:
                                sB = ((az) byVar.c).b();
                                break;
                            case 6:
                            default:
                                sB = 0;
                                break;
                            case 7:
                                sB = ((s) byVar.c).b();
                                break;
                            case 8:
                                sB = ((bv) byVar.c).f;
                                break;
                        }
                        iArr2[1] = sB;
                        int[] iArr3 = this.cH;
                        switch (byVar.b) {
                            case 1:
                                sA = ((ar) byVar.c).p();
                                break;
                            case 2:
                                sA = ((bl) byVar.c).p();
                                break;
                            case 3:
                                sA = ((bp) byVar.c).p();
                                break;
                            case 4:
                                sA = ((au) byVar.c).d();
                                break;
                            case 5:
                                sA = ((az) byVar.c).c();
                                break;
                            case 6:
                            default:
                                sA = 0;
                                break;
                            case 7:
                                sA = ((s) byVar.c).d();
                                break;
                            case 8:
                                sA = ((bv) byVar.c).a();
                                break;
                        }
                        iArr3[2] = sA;
                        int[] iArr4 = this.cH;
                        switch (byVar.b) {
                            case 1:
                                sB2 = ((ar) byVar.c).q();
                                break;
                            case 2:
                                sB2 = ((bl) byVar.c).q();
                                break;
                            case 3:
                                sB2 = ((bp) byVar.c).q();
                                break;
                            case 4:
                                sB2 = ((au) byVar.c).e();
                                break;
                            case 5:
                                sB2 = ((az) byVar.c).d();
                                break;
                            case 6:
                            default:
                                sB2 = 0;
                                break;
                            case 7:
                                sB2 = ((s) byVar.c).e();
                                break;
                            case 8:
                                sB2 = ((bv) byVar.c).b();
                                break;
                        }
                        iArr4[3] = sB2;
                        for (int i9 = 0; i9 < this.f.l.length; i9++) {
                            this.cI[2] = this.f.n[i9][0];
                            this.cI[3] = this.f.n[i9][1];
                            this.cI[0] = this.f.l[i9].e;
                            this.cI[1] = this.f.l[i9].f;
                            int i10 = this.cI[1] + this.f.n[i9][1];
                            if (c(this.cI[0], this.cI[1], this.cI[2], this.cI[3]) && byVar.a() < i10 && ai.a(this.cH, this.cI)) {
                                int[] iArr5 = new int[4];
                                a.f.a(this.cH, this.cI, iArr5);
                                bl.addElement(new cb((byte) 6, this.f.l[i9], (short) this.f.n[i9][1], (short) this.f.n[i9][0], iArr5));
                            }
                        }
                    }
                }
            }
            try {
                if (!bl.isEmpty() && bl.size() > 1) {
                    int i11 = 0;
                    while (true) {
                        int i12 = i11;
                        if (i12 < bl.size() - 1) {
                            int i13 = 0;
                            while (true) {
                                int i14 = i13;
                                if (i14 < bl.size()) {
                                    if (i14 < bl.size() - 1) {
                                        by byVar2 = (by) bl.elementAt(i14);
                                        by byVar3 = i14 + 1 <= bl.size() ? (by) bl.elementAt(i14 + 1) : null;
                                        if (byVar2 != null && byVar3 != null && byVar2.a() > byVar3.a()) {
                                            bl.setElementAt(byVar2, i14 + 1);
                                            bl.setElementAt(byVar3, i14);
                                        }
                                    }
                                    i13 = i14 + 1;
                                }
                            }
                            i11 = i12 + 1;
                        }
                    }
                }
            } catch (Exception e) {
            }
            if (bl != null) {
                for (int i15 = 0; i15 < bl.size(); i15++) {
                    by byVar4 = (by) bl.elementAt(i15);
                    if (byVar4 != null && byVar4.c != null && (byVar4.b != 1 || this.cK >= 0)) {
                        if (byVar4.b == 2) {
                            ((bl) byVar4.c).a(this.f, a.f, this.e.ak);
                        } else if (byVar4.b == 3) {
                            ((bp) byVar4.c).a(a.f, this.e.ak);
                        } else if (byVar4.b == 5) {
                            az azVar = (az) byVar4.c;
                            ai aiVar = a.f;
                            long j = this.e.ak;
                            if (azVar.w != null && aW[10] == 0) {
                                ai.a(azVar.w, j);
                            }
                        } else if (byVar4.b == 4) {
                            ((au) byVar4.c).a(this.f, a.f, this.e.ak);
                        } else if (byVar4.b == 7) {
                            ((s) byVar4.c).a(this.f, a.f, this.e.ak);
                        }
                    }
                }
            }
        } catch (Exception e2) {
            bl.removeAllElements();
            c("系统异常[7]");
        }
    }

    public final void N() {
        a.f.a(this.f, h, i, true, false, 1009050);
        this.e.j = this.e.k;
        this.k = (short) 0;
        this.j = (short) 0;
    }

    public final void O() {
        a.i.a(new w((short) 4177, bz.j((short) 4177, bt.ad, bt.bt ? 1 : 0)));
        this.e.a((String) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v44, types: [int[][]] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    public final void P() {
        short[][] sArr;
        if (cL && i()) {
            cL = false;
            if (bt.t != null) {
                ?? r0 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, bt.t.length, 2);
                for (int i2 = 0; i2 < bt.t.length; i2++) {
                    if (bt.t[i2] != null) {
                        r0[i2][0] = bt.t[i2].a;
                        r0[i2][1] = bt.t[i2].U;
                        bt.t[i2] = null;
                    }
                }
                bt.t = null;
                sArr = r0;
            } else {
                sArr = null;
            }
            if (bt.u.size() > 0) {
                bt.t = (az[]) bt.u.elementAt(bt.u.size() - 1);
                this.cV = 0;
                bt.u.removeAllElements();
            }
            if (bt.t != null && sArr != null && sArr.length > 0) {
                for (int i3 = 0; i3 < bt.t.length; i3++) {
                    for (int i4 = 0; i4 < sArr.length; i4++) {
                        if (sArr[i4] != null && bt.t[i3].a == sArr[i4][0]) {
                            bt.t[i3].U = (byte) sArr[i4][1];
                        }
                    }
                }
            }
            System.currentTimeMillis();
            if (this.cV == 0 && bt.t != null) {
                if (t.l == 2) {
                    a.ah.c();
                }
                this.bj.removeAllElements();
                short[] sArr2 = new short[bt.t.length];
                short[] sArr3 = new short[bt.t.length];
                short[] sArr4 = new short[bt.t.length];
                for (int i5 = 0; i5 < bt.t.length; i5++) {
                    this.bj.addElement(String.valueOf((int) bt.t[i5].u));
                    sArr2[i5] = bt.t[i5].y;
                    sArr3[i5] = bt.t[i5].z;
                    sArr4[i5] = bt.t[i5].A;
                }
                a.ah.a(this.bj, sArr2, sArr3, sArr4);
                this.bj.removeAllElements();
                for (int i6 = 0; i6 < bt.t.length; i6++) {
                    bt.t[i6].w = a.ah.a(bt.t[i6].v, bt.t[i6].y, bt.t[i6].z, bt.t[i6].A);
                }
                this.cV = 1;
            }
            if (this.f == null || this.f.i == null || !i() || this.k == 1) {
                return;
            }
            a.f.a(this.f, h, i, true, false, 1009050);
        }
    }

    public final void S() {
        a.i.a(new w((short) 4192, bz.t((short) 4192, bt.ad, bq.g)));
    }

    public final void T() {
        this.cT = (byte) 0;
        this.cU = (byte) 0;
        this.cS = (byte) 0;
        for (int i2 = 0; i2 < this.cN.length; i2++) {
            this.cN[i2] = "";
        }
        for (int i3 = 0; i3 < this.cO.length; i3++) {
            this.cO[i3] = "";
        }
        for (int i4 = 0; i4 < this.cP.length; i4++) {
            for (int i5 = 0; i5 < this.cP[i4].length; i5++) {
                this.cP[i4][i5] = 0;
            }
        }
        for (int i6 = 0; i6 < this.cQ.length; i6++) {
            this.cQ[i6] = "";
        }
        for (int i7 = 0; i7 < this.cR.length; i7++) {
            for (int i8 = 0; i8 < this.cR[i7].length; i8++) {
                this.cR[i7][i8] = 0;
            }
        }
    }

    public final void U() {
        if (bt.ij != null) {
            this.bj.removeAllElements();
            for (int i2 = 0; i2 < bt.ij.size(); i2++) {
                this.ba = (bv) bt.ij.elementAt(i2);
                this.bj.addElement(String.valueOf((int) this.ba.g));
            }
            a.ae.a(this.bj, (short[]) null, (short[]) null, (short[]) null);
            this.bj.removeAllElements();
            for (int i3 = 0; i3 < bt.ij.size(); i3++) {
                this.ba = (bv) bt.ij.elementAt(i3);
                this.ba.d = a.ae.c(this.ba.h);
            }
        }
    }

    public final void V() {
        if (this.e.b == 8 || this.e.b == 516) {
            this.ba.a((byte) 0);
        } else if (this.e.b == 2 || this.e.b == 518) {
            this.ba.a((byte) 2);
        } else if (this.e.b == 1 || this.e.b == 514) {
            this.ba.a((byte) 1);
        } else if (this.e.b == 4 || this.e.b == 520) {
            this.ba.a((byte) 3);
        } else {
            this.ba.a((byte) -1);
        }
        if (this.e.a == 268435456 || this.e.a == 517 || this.e.a == 1073741824) {
            if (this.ba != null) {
                byte bA = a(this.ba);
                if (bA == 0) {
                    this.e.b("布置失败，请检查是否覆盖地图元素");
                    return;
                }
                if (bA == 1) {
                    this.e.b("布置失败，请检查是否覆盖地图npc");
                    return;
                }
                if (bA == 2) {
                    this.e.b("布置失败，请检查是否覆盖传送点");
                    return;
                }
                if (bA == 3) {
                    this.e.b("布置失败，请检查是否覆盖其他材料");
                    return;
                }
                if (bA == 4) {
                    this.e.b("布置失败，请检查当前区域是否支持放置该类型材料");
                    return;
                }
                if (bA == 5) {
                    this.e.b("布置失败，请检查是否在合法区域内");
                    return;
                }
                if (bA == 6) {
                    this.e.b("布置失败，请检查是否与当前人物位置重叠");
                    return;
                }
                if (this.cX == 2) {
                    a((byte) 2, this.ba);
                } else if (this.cX == 3) {
                    a((byte) 3, this.ba);
                } else if (this.cX == 4) {
                    aq aqVar = this.M;
                    byte[] bArrA = bz.a((short) 4234, bt.ad, bt.jr[aqVar.b.ar.g()], aqVar.a.ba.e, aqVar.a.ba.f);
                    if (bArrA == null) {
                        aqVar.b.b("获取上传指令数据错误!");
                    } else {
                        a.i.a(new w((short) 4234, bArrA));
                    }
                } else {
                    if (this.cX != 5) {
                        this.e.b("材料类型不存在");
                        return;
                    }
                    int i2 = bt.hX[this.e.ar.g()];
                    bv bvVar = this.ba;
                    byte[] bArrB = bz.b((short) 4667, bt.ad, i2, this.ba.e + 2, (int) ((short) (this.ba.f + 28)));
                    if (bArrB == null) {
                        this.e.b("获取上传指令数据错误!");
                    } else {
                        a.i.a(new w((short) 4667, bArrB));
                    }
                }
                this.l = (short) 0;
                this.e.j = this.e.k;
                N();
            }
        } else if (this.e.a == 536870912) {
            this.l = (short) 0;
            this.e.j = this.e.k;
            N();
        }
        this.aE = 0;
        this.e.a = 0;
        if (this.f.i != null) {
            short s2 = t.b;
            short s3 = t.c;
            int i3 = t.b / 2;
            int i4 = t.c / 2;
            if (this.f.a < t.b) {
                s2 = this.f.a;
                i3 = this.f.a / 2;
            }
            if (this.f.b < t.c) {
                s3 = this.f.b;
                i4 = this.f.b / 2;
            }
            if (bt.bs != 0 || bt.s != 0) {
                h = this.ba.e - i3 < 0 ? 0 : this.ba.e + i3 > this.f.a ? this.f.a - s2 : this.ba.e - i3;
                i = this.ba.f - i4 < 0 ? 0 : this.ba.f + i4 > this.f.b ? this.f.b - s3 : this.ba.f - i4;
            } else if (bt.q != null) {
                short s4 = bt.q[0].j;
                short s5 = bt.q[0].k;
                h = s4 - i3 < 0 ? 0 : s4 + i3 > this.f.a ? this.f.a - s2 : s4 - i3;
                i = s5 - i4 < 0 ? 0 : s5 + i4 > this.f.b ? this.f.b - s3 : s5 - i4;
            }
        }
        M();
        if (a(this.ba) == -1) {
            this.cY = true;
        } else {
            this.cY = false;
        }
        bv bvVar2 = this.ba;
        aw awVar = this.f;
        if (bvVar2.d == null || awVar == null) {
            return;
        }
        if (bvVar2.a != 0 || bvVar2.b >= 0) {
            if (bvVar2.a >= 0 || bvVar2.b != 0) {
                if (bvVar2.a <= 0 || bvVar2.b != 0) {
                    if (bvVar2.a == 0 && bvVar2.b > 0 && bvVar2.f + bvVar2.b + bvVar2.d.h() > awVar.b) {
                        return;
                    }
                } else if (bvVar2.e + bvVar2.a + bvVar2.d.g() > awVar.a) {
                    return;
                }
            } else if (bvVar2.e + bvVar2.a < 0) {
                return;
            }
        } else if (bvVar2.f + bvVar2.b < 0) {
            return;
        }
        bvVar2.e = (short) (bvVar2.e + bvVar2.a);
        bvVar2.f = (short) (bvVar2.f + bvVar2.b);
    }

    public final void W() {
        String[] strArr;
        this.l = (short) 0;
        this.e.aq.b();
        this.e.aq.a("增值仓库");
        c cVar = this.e.ar;
        Image[] imageArrB = b(bt.jC);
        String[] strArr2 = bt.jA;
        int[] iArr = bt.jB;
        if (iArr == null || iArr.length <= 0 || iArr == null) {
            strArr = null;
        } else {
            String[] strArr3 = new String[iArr.length];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                strArr3[i2] = new StringBuffer().append(iArr[i2]).append("个").toString();
            }
            strArr = strArr3;
        }
        cVar.a(imageArrB, strArr2, strArr, (String[]) null);
        this.e.at.a(bt.jD != null ? bt.jD[0] : null, t.i, (byte) 1);
        this.e.at.a((byte) 1);
        this.e.au.a("取出");
        this.e.aq.a(this.e.ar);
        this.e.aq.a(this.e.at);
        this.e.aq.a(this.e.au);
        this.e.aq.a(t.f, t.g, t.d, t.e);
        this.e.j = this.e.k;
        this.k = (short) 53;
        this.j = (short) 53;
    }

    public final void X() {
        this.e.aq.b();
        this.e.aq.a("住宅列表");
        this.e.ar.a((Image[]) null, bt.hQ, (String[]) null, (String[]) null);
        this.e.au.a("进入");
        this.e.aq.a(this.e.ar);
        if (t.c > 220) {
            this.e.aq.a(this.e.au);
        }
        this.e.aq.a(t.f, t.g, t.d, t.e);
        this.l = (short) 0;
        this.e.j = this.e.k;
        this.k = (short) 57;
        this.j = (short) 57;
    }

    public final void Y() {
        this.l = (short) 0;
        this.e.aq.b();
        this.e.aq.a(bt.kI == 0 ? "金豆商城" : "万能果商城");
        this.e.ar.a((Image[]) null, bt.kH, (String[]) null, (String[]) null);
        this.e.au.a("确定");
        this.e.aq.a(this.e.ar);
        if (t.c > 220) {
            this.e.aq.a(this.e.au);
        }
        this.e.aq.a(t.f, t.g, t.d, t.e);
        this.e.j = this.e.k;
        this.k = (short) 68;
        this.j = (short) 68;
    }

    public final void Z() {
        this.aH = this.e.as.a;
        this.l = (short) 0;
        if (bt.kP == 0 || bt.kP == 3) {
            this.da = new StringBuffer().append("第").append((int) bt.kS).append("题:").append(bt.kQ).toString();
        } else {
            this.da = bt.kQ;
        }
        K = new bw(this.da, (short) (t.b - 20));
        this.am = bt.kR;
        ca.a(a.F, K, this.am, (String[]) null, true);
        a.f.a(this.f, h, i, true, false, 1009050);
        this.e.j = this.e.k;
        this.k = (short) 70;
        this.j = (short) 70;
    }

    public final int a(int i2, int i3) {
        if (this.bE != null) {
            for (int i4 = 0; i4 < this.bE.length; i4++) {
                if (i2 >= this.bE[i4][0] && i2 <= this.bE[i4][0] + this.bE[i4][2] && i3 >= this.bE[i4][1] && i3 <= this.bE[i4][1] + this.bE[i4][3]) {
                    c(i4);
                    return 268435456;
                }
            }
        }
        if (this.bF != null) {
            return (i2 < this.bF[0] || i2 > this.bF[0] + this.bF[2] || i3 < this.bF[1] || i3 > this.bF[1] + this.bF[3]) ? 536870912 : 0;
        }
        return 0;
    }

    public final int a(int i2, int i3, int i4) {
        if (this.bP == null) {
            return i2;
        }
        if (i3 >= this.bP[0][0] && i3 <= this.bP[0][0] + this.bP[0][2] && i4 >= this.bP[0][1] && i4 <= this.bP[0][1] + this.bP[0][3]) {
            return 8;
        }
        if (i3 < this.bP[1][0] || i3 > this.bP[1][0] + this.bP[1][2] || i4 < this.bP[1][1] || i4 > this.bP[1][1] + this.bP[1][3]) {
            return i2;
        }
        return 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:524:0x0a47  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x0a92  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 5012
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ao.a():void");
    }

    public final void a(byte b2) {
        String[] strArr;
        t.a(this.e.l);
        this.e.aq.j();
        this.e.aq.a(new StringBuffer().append("人物属性-战力").append(bt.ao).toString());
        this.e.aq.a(true);
        this.e.as.a(new String[]{"状态", "属性", "修炼", "声望", "加成", "记录"});
        this.e.aq.a(this.e.as);
        this.e.as.a = b2;
        switch (b2) {
            case 0:
                this.e.l.append(new StringBuffer().append("昵称：").append(bt.af).append('\t').toString());
                if (t.a == 0) {
                    this.e.l.append(new StringBuffer().append("ID：").append(bt.ad).append('\t').toString());
                }
                this.e.l.append(new StringBuffer().append("门派：").append(t.G[bt.ax]).append('\t').toString());
                this.e.l.append(new StringBuffer().append("级别：").append((int) bt.ak).append('\t').toString());
                this.e.l.append(new StringBuffer().append("称号：").append(bt.ah).append('\t').toString());
                this.e.l.append(new StringBuffer().append("配偶：").append(bt.bl).append('\t').toString());
                this.e.l.append(new StringBuffer().append("师傅：").append(bt.bm).append('\t').toString());
                this.e.l.append(new StringBuffer().append("帮派：").append(bt.az).append('\t').toString());
                this.e.l.append(new StringBuffer().append("职务：").append(bt.aA).append('\t').toString());
                this.e.l.append(new StringBuffer().append("功勋：").append(bt.aB).append('\t').toString());
                this.e.l.append(new StringBuffer().append("经验：").append(bt.al).append(bt.z == 0 ? "" : "<暂停>").append('\t').toString());
                this.e.l.append(new StringBuffer().append("修炼：").append(bt.am).append(bt.z == 1 ? "<开启>" : "<关闭>").append('\t').toString());
                aB();
                break;
            case 1:
                this.e.l.append(new StringBuffer().append("生命：").append(bt.aN).append("/").append(bt.aM).append('\t').toString());
                this.e.l.append(new StringBuffer().append("内力：").append(bt.aP).append("/").append(bt.aO).append('\t').toString());
                this.e.l.append(new StringBuffer().append("物攻：[").append(bt.aR).append(",").append(bt.aQ).append("]").append('\t').toString());
                this.e.l.append(new StringBuffer().append("法伤：").append(bt.aW).append('\t').toString());
                this.e.l.append(new StringBuffer().append("法攻：[").append(bt.aY).append(",").append(bt.aX).append("]").append('\t').toString());
                this.e.l.append(new StringBuffer().append("物防：[").append(bt.aT).append(",").append(bt.aS).append("]").append('\t').toString());
                this.e.l.append(new StringBuffer().append("速度：").append(bt.aZ).append('\t').toString());
                this.e.l.append(new StringBuffer().append("冰抗：").append(bt.bc).append('\t').toString());
                this.e.l.append(new StringBuffer().append("火抗：").append(bt.ba).append('\t').toString());
                this.e.l.append(new StringBuffer().append("雷抗：").append(bt.bb).append('\t').toString());
                this.e.l.append(bt.bd);
                aB();
                break;
            case 2:
                c cVar = this.e.ar;
                String[] strArr2 = {"经验", "上限", "开关"};
                String[] strArr3 = new String[3];
                strArr3[0] = String.valueOf(bt.am);
                strArr3[1] = String.valueOf(bt.an);
                strArr3[2] = bt.z == 1 ? "<开>" : "<关>";
                cVar.a((Image[]) null, strArr2, (String[]) null, strArr3);
                this.e.at.b("开启经验修炼模式后，杀怪、任务、使用道具获得的经验将会全部转入修炼经验，修炼经验可用于学习心法技能", t.i, (byte) 2);
                this.e.at.a((byte) 1);
                this.e.au.a("确定");
                this.e.aq.a(this.e.ar);
                this.e.aq.a(this.e.at);
                if (t.c > 220) {
                    this.e.aq.a(this.e.au);
                    break;
                }
                break;
            case 3:
                if (bt.jF == null || bt.jF.length <= 0) {
                    strArr = null;
                } else {
                    String[] strArr4 = new String[bt.jF.length];
                    for (int i2 = 0; i2 < strArr4.length; i2++) {
                        strArr4[i2] = new StringBuffer().append("").append(bt.jF[i2]).toString();
                    }
                    strArr = strArr4;
                }
                this.e.ar.a((Image[]) null, bt.jE, (String[]) null, strArr);
                this.e.aq.a(this.e.ar);
                break;
            case 4:
                this.e.l.append(new StringBuffer().append("住宅：").append(bt.bi).append('\t').toString());
                this.e.l.append(new StringBuffer().append("帮派：").append(bt.bj).append('\t').toString());
                this.e.l.append(new StringBuffer().append("称号：").append(bt.bB).append('\t').toString());
                this.e.l.append(new StringBuffer().append("装备：").append(bt.bk).append('\t').toString());
                this.e.l.append(new StringBuffer().append("祝福：\t").append(bt.bh).append('\t').toString());
                this.e.l.append(new StringBuffer().append("成就: ").append(bt.bo).append('\t').toString());
                if (bt.s == 1 && bt.bg >= 1) {
                    this.e.l.append(new StringBuffer().append("队伍加成：").append(bt.q != null ? new StringBuffer().append("属性+").append(bt.bg * 5).append("%\n").append("经验+").append(bt.bg * 5).append("%").toString() : "").append('\t').toString());
                }
                aB();
                break;
            case 5:
                this.e.l.append(new StringBuffer().append("").append(bt.bn).append('\t').toString());
                aB();
                break;
        }
        this.e.aq.a(t.f, t.g, t.d, t.e);
        this.e.j = this.e.k;
        this.k = (short) 3;
        this.j = (short) 3;
    }

    public final void a(byte b2, boolean z2) {
        if (bt.dv.length > 0) {
            a(bt.dB);
            int i2 = 0;
            for (int i3 = 0; i3 < bt.dx.length; i3++) {
                if (a(b2, bt.dx[i3])) {
                    i2++;
                }
            }
            if (i2 > 0) {
                bt.dl = new int[i2];
                bt.dm = new String[i2];
                bt.dn = new byte[i2];
                bt.f1do = new byte[i2];
                bt.dp = new byte[i2];
                bt.dq = new short[i2];
                bt.dr = new short[i2];
                bt.ds = new String[i2];
                bt.dt = new String[i2];
                int i4 = 0;
                for (int i5 = 0; i5 < bt.dx.length; i5++) {
                    if (i4 < i2 && a(b2, bt.dx[i5])) {
                        bt.dl[i4] = bt.dv[i5];
                        bt.dm[i4] = bt.dw[i5];
                        bt.dn[i4] = bt.dx[i5];
                        bt.f1do[i4] = bt.dy[i5];
                        bt.dp[i4] = bt.dz[i5];
                        bt.dq[i4] = bt.dA[i5];
                        bt.dr[i4] = bt.dB[i5];
                        bt.ds[i4] = bt.dD[i5];
                        bt.dt[i4] = bt.dC[i5];
                        i4++;
                    }
                }
            } else {
                bt.p();
            }
            this.e.aq.b();
            this.e.aq.a("人物技能");
            this.e.aq.a(true);
            if (this.as == 0) {
                if (this.j != 12) {
                    this.e.as.a(new String[]{" 技能   ", "  心法  ", "  附魔  "});
                }
                this.e.aq.a(this.e.as);
                this.e.ar.a(b(bt.dr), bt.dm, (String[]) null, b2 == 2 ? null : e(bt.dq));
                if (z2) {
                    this.e.ar.a(this.aA, this.aE);
                } else {
                    this.aA = 0;
                    this.aE = 0;
                }
                if (bt.dl == null) {
                    this.e.ar.a("没有技能,按3、9键可以上下翻滚此属性描述框", 2);
                    this.e.at.a("", t.i, (byte) 1);
                } else {
                    this.e.ar.a(bt.ds[this.e.ar.g()], 2);
                    this.e.at.a("".equals(bt.dt[this.e.ar.g()]) ? "<0>当前已经最高等级" : bt.dt[this.e.ar.g()], t.i, (byte) 1);
                    this.e.at.a((byte) 1);
                }
                if (b2 == 1) {
                    this.e.aq.a(this.e.at);
                } else if (b2 == 0) {
                    this.e.aq.a(this.e.at);
                    this.e.au.a("升级");
                    this.e.aq.a(this.e.au);
                }
                this.e.aq.a(this.e.ar);
            } else {
                this.e.as.a(new String[]{" 技能   "});
                this.e.aq.a(this.e.as);
                this.e.ar.a(b(bt.dr), bt.dm, (String[]) null, b2 == 2 ? null : e(bt.dq));
                if (bt.dl == null) {
                    this.e.ar.a("没有技能,按3、9键可以上下翻滚此属性描述框", 2);
                } else {
                    this.e.ar.a(bt.ds[0], 2);
                }
                this.e.aq.a(this.e.ar);
            }
            this.e.aq.a(t.f, t.g, t.d, t.e);
        }
    }

    public final void a(byte b2, byte[] bArr) {
        this.l = (short) 0;
        this.e.aw = 0;
        if (this.j != 126) {
            this.ar = 0;
            this.aq = 0;
        }
        this.bU.removeAllElements();
        if (b2 == 0) {
            for (byte b3 : bArr) {
                for (int i2 = 0; i2 < bt.bC.size(); i2++) {
                    bn bnVar = (bn) bt.bC.elementAt(i2);
                    if (bnVar != null && ((byte) ((bnVar.t >>> b3) & 1)) == 1 && bnVar.g - bnVar.v > 0) {
                        this.bU.addElement(bnVar);
                    }
                }
            }
        } else {
            for (byte b4 : bArr) {
                for (int i3 = 0; i3 < bt.bC.size(); i3++) {
                    bn bnVar2 = (bn) bt.bC.elementAt(i3);
                    if (bnVar2 != null && b4 == bnVar2.d && bnVar2.g - bnVar2.v > 0) {
                        this.bU.addElement(bnVar2);
                    }
                }
            }
        }
        ca.l = 0;
        this.e.aq.b();
        this.e.aq.a("可选物品");
        this.e.aq.a(true);
        this.e.as.a(new String[]{" 一 ", " 二 ", " 三 ", " 四 ", " 五 "});
        this.e.as.a((byte) 1);
        this.e.aq.a(t.e <= 240 ? 79 : 120);
        if (this.bU.size() > 0) {
            this.e.at.a(a((bn) this.bU.elementAt(0)), t.i, (byte) 1);
        } else {
            this.e.at.a("没有物品,按3、9键可以上下翻滚此属性描述框", t.i, (byte) 1);
        }
        this.e.at.a((byte) 1);
        ca.l = 0;
        this.e.au.a("");
        this.e.aq.a(this.e.as);
        this.e.aq.a(this.e.at);
        this.e.aq.a(this.e.au);
        this.e.aq.a(t.f, t.g, t.d, t.e);
        this.e.j = this.e.k;
        this.k = (short) 126;
    }

    public final void a(int i2) {
        int i3;
        byte b2;
        if (this.I.h()) {
            if (this.Y != bt.ar) {
                this.Y = bt.ar;
                e();
            } else {
                f();
            }
            this.I.i();
        }
        if (bt.bw == 2 && bt.kj > 0) {
            this.I.c.removeAllElements();
            this.e.b = 0;
            this.e.a = 0;
            aq aqVar = this.M;
            ao aoVar = aqVar.a;
            aqVar.a.k = (short) 61;
            aoVar.j = (short) 61;
            aqVar.s = h;
            aqVar.t = i;
            return;
        }
        bt.kj = (short) 0;
        if (bk.size() > 0) {
            a.ab.d((String) bk.elementAt(0));
            bk.removeElementAt(0);
        }
        if (bt.hb != null) {
            int i4 = 0;
            while (true) {
                int i5 = i4;
                if (i5 >= this.aO.size()) {
                    break;
                }
                s sVar = (s) this.aO.elementAt(i5);
                int i6 = sVar.a;
                if (bt.hb != null) {
                    for (int i7 = 0; i7 < bt.hb.length; i7++) {
                        if (i6 == bt.hb[i7]) {
                            b2 = (byte) i7;
                            break;
                        }
                    }
                    b2 = -1;
                } else {
                    b2 = -1;
                }
                if (b2 < 0) {
                    this.aO.removeElement(sVar);
                }
                i4 = i5 + 1;
            }
            bl.removeAllElements();
            int i8 = 0;
            while (true) {
                int i9 = i8;
                if (i9 >= bt.hb.length) {
                    break;
                }
                int i10 = 0;
                while (true) {
                    i3 = i10;
                    if (i3 >= this.aO.size() || ((s) this.aO.elementAt(i3)).a == bt.hb[i9]) {
                        break;
                    } else {
                        i10 = i3 + 1;
                    }
                }
                if (i3 == this.aO.size()) {
                    this.aO.addElement(new s(bt.hb[i9], bt.hd[i9], bt.he[i9], bt.hf[i9], bt.hc[i9], bt.hg[i9], bt.hh[i9], bt.hi[i9], bt.hj[i9], bt.hk[i9]));
                }
                i8 = i9 + 1;
            }
            bt.E();
        }
        c(bt.cb);
        c(bt.cx);
        c(bt.fs);
        c(bt.fl);
        aW();
        c(bt.dB);
        f((short) -1);
        aA();
        if (bt.H == null && this.e.b == 0) {
            if (this.J != null) {
                if (i2 == 268435456) {
                    this.J = null;
                    a((short) 5123, bz.e((short) 5123, bt.ad), (String) null);
                } else if (i2 == 536870912) {
                    this.J = null;
                    byte[] bArrC = bz.C((short) 4371, bt.ad);
                    if (bArrC != null) {
                        a.i.a(new w((short) 4371, bArrC));
                    } else {
                        this.e.b("获取上传指令数据错误!");
                    }
                }
            } else if (i2 == 268435456) {
                at();
            } else if (i2 == 536870912) {
                Vector vector = new Vector(6);
                vector.addElement("回城");
                vector.addElement(bt.bu ? "关闭自动" : "自动刷怪");
                if (bt.bf != 0) {
                    vector.addElement("属性配点");
                }
                if (bt.bs >= 0) {
                    vector.addElement(bt.bs == 0 ? "离开队伍" : "解散队伍");
                }
                vector.addElement("查看邮箱");
                vector.addElement("活动推荐");
                vector.addElement("传送");
                String[] strArr = new String[vector.size()];
                vector.copyInto(strArr);
                ca.a((t.d - t.i.stringWidth("操作")) / 2, (t.e - (t.j * strArr.length)) / 2, strArr, true);
                this.l = (short) 0;
                bt.gQ = (short) 1;
                this.e.j = this.e.k;
                this.k = (short) 100;
                this.j = (short) 100;
            } else if (i2 == 1024) {
                this.by = (byte) 1;
                K();
            } else if (i2 == 2048) {
                if (bt.bR == null && bt.bL == null) {
                    this.e.b("当前没有任务");
                } else {
                    this.by = (byte) 1;
                    x();
                }
            } else if (i2 == 1073741824 || i2 == 517) {
                this.af = (byte) -1;
                if (bt.t != null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= bt.t.length) {
                            break;
                        }
                        if (bt.t[i11] != null && bt.t[i11].x) {
                            this.af = (byte) i11;
                            break;
                        }
                        i11++;
                    }
                }
                if (this.af >= 0 && bt.t != null && this.af < bt.t.length && bt.t[this.af] != null && bt.t[this.af].e == 1) {
                    byte[] bArrC2 = bz.c((short) 4106, bt.ad, (int) bt.t[this.af].a);
                    if (bArrC2 == null) {
                        this.e.b("获取上传指令数据错误!");
                        return;
                    }
                    a.i.a(new w((short) 4106, bArrC2));
                    aj = true;
                    this.e.a((String) null);
                    return;
                }
                if (L != null) {
                    this.l = (short) 0;
                    this.ar = 0;
                    this.m = (short) 0;
                    this.an = L.k;
                    K = new bw("你想...", (short) (t.b - 20));
                    ca.a(a.F, K, this.an, (String[]) null, true);
                    ca.g = 0;
                    this.e.j = this.e.k;
                    a.f.a(this.f, h, i, false, false, 1009050);
                    this.k = (short) 40;
                    this.j = (short) 40;
                }
            } else if (i2 == 48) {
                if (bt.fA != null) {
                    this.by = (byte) 1;
                    j(0);
                } else {
                    this.e.b("您没有宠物！");
                }
            } else if (i2 == 513) {
                aS();
                this.by = (byte) 1;
            } else if (i2 == 515) {
                this.by = (byte) 1;
                e(0);
            } else if (i2 == 519) {
                if (bt.bw == 2) {
                    aW[6] = (byte) (aW[6] == 0 ? 1 : 0);
                } else {
                    this.by = (byte) 1;
                    if (this.f != null) {
                        if (t.b < 240) {
                            this.aD = 6;
                        } else {
                            this.aD = 7;
                        }
                        if (t.b >= 240) {
                            if ((this.f.b * this.aD) / 16 > t.c - 20) {
                                this.aD = ((t.c - 20) << 4) / this.f.b;
                            } else if ((this.f.a * this.aD) / 16 > t.b - 3) {
                                this.aD = ((t.b - 3) << 4) / this.f.a;
                            } else if ((this.f.b * this.aD) / 16 < (t.c * 5) / 7) {
                                this.aD = (((t.c * 5) / 7) << 4) / this.f.b;
                            } else if ((this.f.a * this.aD) / 16 < (t.b * 5) / 7) {
                                this.aD = (((t.b * 5) / 7) << 4) / this.f.a;
                            }
                        } else if ((this.f.b * this.aD) / 16 > t.c) {
                            this.aD = (t.c << 4) / this.f.b;
                        } else if ((this.f.a * this.aD) / 16 > t.b - 6) {
                            this.aD = ((t.b - 6) << 4) / this.f.a;
                        } else if ((this.f.b * this.aD) / 16 < (t.c * 6) / 7) {
                            this.aD = (((t.c * 6) / 7) << 4) / this.f.b;
                        } else if ((this.f.a * this.aD) / 16 < (t.b * 6) / 7) {
                            this.aD = (((t.b * 6) / 7) << 4) / this.f.a;
                        }
                        this.aB = (t.b - ((this.f.a * this.aD) / 16)) / 2;
                        this.aC = (t.c - ((this.f.b * this.aD) / 16)) / 2;
                        this.e.j = this.e.k;
                        a.f.a(this.f, h, i, false, false, 1009050);
                        this.k = (short) 30;
                        this.j = (short) 30;
                    }
                }
            } else if (i2 == 521) {
                byte[] bArrF = bz.f((short) 4168, bt.ad);
                if (bArrF != null) {
                    a.i.a(new w((short) 4168, bArrF));
                    this.by = (byte) 1;
                    this.e.a((String) null);
                } else {
                    this.e.b("获取上传指令数据错误!");
                }
            }
        }
        if (this.J == null) {
            if (bt.bu) {
                if (this.aO == null || this.aO.size() <= 0) {
                    this.I.c();
                } else if (this.e.ak - bq.r > 2200) {
                    this.X.a();
                } else {
                    if (this.I.c != null) {
                        this.I.c.removeAllElements();
                    }
                    this.I.c();
                }
            } else if (this.d != -1) {
                this.I.a(this.d);
            } else if (this.e.b == 8 || this.e.b == 516) {
                this.I.a((byte) 0);
            } else if (this.e.b == 2 || this.e.b == 518) {
                this.I.a((byte) 2);
            } else if (this.e.b == 1 || this.e.b == 514) {
                this.I.a((byte) 1);
            } else if (this.e.b == 4 || this.e.b == 520) {
                this.I.a((byte) 3);
            } else {
                this.I.c();
            }
        }
        this.aE = 0;
        L = this.I.b(bt.ij);
        M();
        as();
    }

    public final void a(int i2, int i3, int i4, int i5, int i6) {
        if (this.au == null || this.au.length <= i2) {
            return;
        }
        this.au[i2][0] = i3;
        this.au[i2][1] = i4;
        this.au[i2][2] = i5;
        this.au[i2][3] = i6;
    }

    public final void a(long j) {
        this.ah = j;
        this.ag = 1;
    }

    public final void a(String str) {
        byte[] bArrB = bz.b((short) 4122, bt.ad, str, this.k);
        if (bArrB != null) {
            a.i.a(new w((short) 4122, bArrB));
        } else {
            this.e.b("获取上传指令数据错误!");
        }
    }

    public final void a(String str, byte b2) {
        String string = this.e.aC.getString();
        if (string != null) {
            if (this.bG == null || !this.bG.equals(string)) {
                String str2 = bt.ad;
                if (str == null) {
                    str = "";
                }
                a.i.a(new w((short) 4184, bz.a((short) 4184, str2, b2, str, string)));
                if (b2 == 4) {
                    b(new ce(new StringBuffer().append("→").append(this.aQ).toString(), b2, string, (byte) 21));
                    a(new ce(new StringBuffer().append("→").append(this.aQ).toString(), b2, string, (byte) 21));
                    if (this.e.as.a == 6) {
                        o(b2);
                    } else {
                        aR();
                    }
                }
                this.e.b("聊天消息已发送!");
            } else {
                this.e.b("不能发送相同信息");
            }
            this.e.n();
            this.e.g = false;
            this.aR = false;
            this.bG = string;
            this.aS = null;
            this.aT = -1;
        }
    }

    public final void a(String str, int i2, short s2, byte b2, byte b3) {
        this.e.p = true;
        this.cX = b3;
        this.ba = new bv(i2, this.I.j, this.I.k, s2, b2);
        if (this.cX == 5) {
            a.ah.a(new String[]{String.valueOf((int) s2)}, (short[]) null, (short[]) null, (short[]) null);
            this.ba.d = a.ah.a(bu.a(bu.b(String.valueOf((int) s2), (byte) 2).toCharArray()), (short) 0, (short) 0, (short) 0);
        } else {
            a.ae.d(String.valueOf((int) this.ba.g));
            this.ba.d = a.ae.b(String.valueOf((int) this.ba.g));
        }
        this.l = (short) 0;
        this.e.j = this.e.k;
        a.f.a(this.f, h, i, false, false, 1009050);
        this.k = (short) 39;
        this.j = (short) 39;
        this.e.p = false;
    }

    public final void a(String str, String str2) {
        byte[] bArrC = bz.c((short) 4674, bt.ad, str2, str);
        if (bArrC == null) {
            this.e.b("获取上传指令数据错误!");
        } else {
            a.i.a(new w((short) 4674, bArrC));
            this.e.a((String) null);
        }
    }

    public final void a(String str, String str2, int i2) {
        byte[] bArrA = bz.a((short) 4670, bt.ad, str, str2, i2);
        if (bArrA == null) {
            this.e.b("获取上传指令数据错误!");
        } else {
            a.i.a(new w((short) 4670, bArrA));
            this.e.a((String) null);
        }
    }

    public final void a(String str, String str2, int i2, int i3) {
        byte[] bArrB = bz.b((short) 4153, bt.ad, str, str2, i2, i3);
        if (bArrB == null) {
            this.e.b("获取上传指令数据错误!");
        } else {
            a.i.a(new w((short) 4153, bArrB));
        }
    }

    public final void a(String str, String str2, String str3, int i2) {
        byte[] bArrA = bz.a((short) 4669, bt.ad, str, str2, i2, str3);
        if (bArrA == null) {
            this.e.b("获取上传指令数据错误!");
        } else {
            a.i.a(new w((short) 4669, bArrA));
            this.e.a((String) null);
        }
    }

    public final void a(String str, boolean z2) {
        byte[] bArrA = bz.a((short) 4628, bt.ad, str, z2);
        if (bArrA != null) {
            a.i.a(new w((short) 4628, bArrA));
        } else {
            this.e.b("获取上传指令数据错误!");
        }
    }

    public final void a(Graphics graphics) {
        Image imageC;
        Image imageD;
        Image imageC2;
        Image imageD2;
        if (!this.e.o) {
            graphics.setColor(0);
            graphics.fillRect(0, 0, t.b, t.c);
            this.e.o = true;
        } else if (this.f != null && (this.f.a < t.b || this.f.b < t.c)) {
            graphics.setColor(0);
            graphics.fillRect(0, 0, t.b, t.c);
        }
        if (this.f != null) {
            if (this.k == 1 || this.k == 18 || this.k == 5 || this.k == 25 || this.k == 7 || this.k == 130) {
                a.f.a(graphics, this.f, h, i);
            } else {
                a.f.a(graphics, this.f, h, i, 0, 0, true, true);
            }
        }
        if (this.k != 25 && this.k != 18 && !this.c) {
            if (L != null && L.d != null) {
                graphics.setColor(16776960);
                graphics.drawRect((L.e - h) + g(), (L.f - i) + h(), L.d.g(), L.d.h());
            }
            if (this.k != 5 && ((this.k != 7 || this.l != 10) && ((this.k != 7 || this.l != 4) && ((this.k != 7 || this.l != 12) && ((this.k != 21 || this.l != 5) && ((this.k != 47 || this.l != 4) && this.k != 13 && this.k != 32 && (this.k != 130 || this.l != 4))))))) {
                if (bt.ab != null && bn != null && this.f.i != null) {
                    int i2 = 0;
                    while (true) {
                        int i3 = i2;
                        if (i3 >= bt.ab.length) {
                            break;
                        }
                        a.f.a(graphics, bn, (int[]) null, h - g(), i - h(), bt.ab[i3], (bt.ac[i3] + 16) - bn.h(), 20, 0);
                        i2 = i3 + 1;
                    }
                }
                y(graphics);
            }
            if (aW[6] == 0 && !bt.G()) {
                if (this.f != null && this.k == 0) {
                    int i4 = t.j + 2;
                    a.f.a(graphics, this.I.j / this.e.m, this.I.k / this.e.m, 2, i4, 17 / this.e.m, 25 / this.e.m, 0, 0);
                    graphics.setColor(16711680);
                    ca.a(graphics, new StringBuffer().append(this.I.j / 16).append(",").append((this.I.k + 25) / 16).toString(), 2, i4 + a.f.f, 20, 16777215, 0);
                    if (bt.ab != null) {
                        graphics.setColor(16711680);
                        for (int i5 = 0; i5 < bt.ab.length; i5++) {
                            if (this.e.ak % 8 == 0) {
                                graphics.fillRect((bt.ab[i5] / this.e.m) + 2, (bt.ac[i5] / this.e.m) + i4, 2, 2);
                            }
                        }
                    }
                    if (bt.t != null) {
                        graphics.setColor(13883606);
                        for (int i6 = 0; i6 < bt.t.length && bt.t[i6] != null; i6++) {
                            if ((bt.t[i6].t != -1 && bt.t[i6].t != 1) || this.e.ak % 5 == 0) {
                                graphics.fillRect((bt.t[i6].c / this.e.m) + 2, (bt.t[i6].d / this.e.m) + i4, 2, 2);
                            }
                        }
                    }
                }
                if (bt.G()) {
                    graphics.setColor(16711680);
                    graphics.drawString(new StringBuffer().append((int) bt.id).append("/").append((int) bt.ic).toString(), t.b, (t.j << 1) + 2 + a.f.f + 30, 24);
                }
            } else if (bt.G()) {
                graphics.setColor(16711680);
                graphics.drawString(new StringBuffer().append((int) bt.id).append("/").append((int) bt.ic).toString(), t.b, t.j + 30, 24);
            }
            if (this.k != 1) {
                graphics.setClip(0, 0, t.b, t.c);
                A(graphics);
                graphics.setClip(0, 0, t.b, t.c);
                ca.a(graphics, bt.ae, 20, 2, 20, 0, bt.bw >= 1 ? 16711680 : 16777215);
            }
        }
        if ((this.k == 0 || this.k == 25) && (aW[5] == 0 || aW[11] == 0)) {
            x(graphics);
        }
        aq aqVar = this.M;
        int i7 = bt.kh;
        int i8 = bt.ki;
        if (aqVar.a.k == 0 && bt.bw == 2 && i7 != 0 && i8 != 0) {
            ca.a(graphics, "阵营", t.b >> 1, 2, 17, 1017663, 0);
            ca.a(graphics, new StringBuffer().append("").append(i7).toString(), (t.b / 2) - 4, t.j + 2, 24, 16776960, 0);
            ca.a(graphics, ":", t.b >> 1, t.j + 2, 17, 16776960, 0);
            ca.a(graphics, new StringBuffer().append("").append(i8).toString(), (t.b / 2) + 5, t.j + 2, 20, 16776960, 0);
        } else if (aqVar.a.k == 0 && bt.ke != -1 && bt.kf != -1 && bt.kg != -1) {
            ca.a(graphics, "阵营", t.b >> 1, 2, 17, 16776960, 0);
            ca.a(graphics, new StringBuffer().append("").append(bt.ke).toString(), (t.b / 2) - 4, t.j + 2, 24, 16776960, 0);
            ca.a(graphics, ":", t.b >> 1, t.j + 2, 17, 16776960, 0);
            ca.a(graphics, new StringBuffer().append("").append(bt.kf).toString(), (t.b / 2) + 5, t.j + 2, 20, 16776960, 0);
            ca.a(graphics, new StringBuffer().append("个人:").append(bt.kg).toString(), t.b >> 1, (t.j << 1) + 2, 17, 16776960, 0);
        }
        if (bt.bu) {
            ca.a(graphics, String.valueOf(bt.bv), t.b / 2, 0, 17, 0, 16711680);
        }
        if (this.k != 25) {
            if (bt.P.o || bt.O.u) {
                Image image = bo.g[0];
                if (bt.P.o) {
                    image = be.e[0];
                }
                graphics.drawImage(image, t.b - 10, 40, 24);
            } else if (this.n) {
                graphics.drawImage(a.aa, t.b - 10, 40, 24);
                if (this.k == 18) {
                    this.n = false;
                }
            }
        }
        if (this.k == 0 && this.J != null) {
            ca.a(graphics, this.J, new String[]{"确定", "取消"});
        }
        switch (this.k) {
            case 0:
                if (bt.k != null && this.dd != null && aW[18] == 0) {
                    ca.a(graphics, 873078, 191, 0, this.dc, t.b, t.j + 2);
                    this.dd.a(graphics, this.db, this.dc + 1, 20);
                    if (this.db <= (-t.i.stringWidth(bt.k))) {
                        if (bt.l <= 0) {
                            bt.k = null;
                            this.dd = null;
                        }
                        bt.l = (byte) (bt.l - 1);
                        this.db = t.b;
                    } else {
                        this.db -= 3;
                    }
                }
                if (bt.E == 1 && bt.F != null && bt.G != null) {
                    graphics.setClip(0, t.j + 40, 70, t.j << 1);
                    ca.a(graphics, bt.F, this.bs, t.j + 40, 20, 16776960, 0);
                    ca.a(graphics, bt.G, 5, (t.j << 1) + 40, 20, 16776960, 0);
                    if (t.i.stringWidth(bt.F) > 70) {
                        if ((this.bs + t.i.stringWidth(bt.F)) - 10 < 0 || this.bs > 75) {
                            this.bi = (byte) (this.bi == -1 ? 1 : -1);
                        }
                        this.bs = (short) (this.bs + this.bi);
                        break;
                    }
                }
                break;
            case 1:
                b(graphics);
                break;
            case 2:
                if (this.l == 0) {
                    ca.a(graphics, 0, t.c - ca.f, t.b, ca.f, K, this.am, (String[]) null);
                    break;
                } else if (this.l == 1 || this.l == 3 || this.l == 4 || this.l == 5 || this.l == 7 || this.l == 9 || this.l == 10) {
                    ca.a(graphics, 0, t.c - ca.f, t.b, ca.f, K, this.an, (String[]) null);
                    if (this.m != 1 && this.m != 2) {
                        if (this.m == 3) {
                            b(graphics, "请输入竞标银两");
                            break;
                        } else if (this.m == 4) {
                            a(graphics, "请输入竞标金豆");
                            break;
                        } else if (this.m == 5 || this.m == 6) {
                            ca.a(graphics, this.at, new String[]{"确定", "取消"});
                            break;
                        }
                    } else {
                        b(graphics, this.m == 1 ? "请输入取出银两" : "请输入存入银两");
                        break;
                    }
                }
                break;
            case 3:
                if (this.e.aq != null) {
                    this.e.aq.a(graphics);
                    if (this.e.as.a == 0 && this.e.at.a == 0) {
                        int iStringWidth = this.e.at.b + 5 + t.i.stringWidth(new StringBuffer().append("昵称：").append(bt.af).toString());
                        if (bt.aC == 1 && (imageD2 = a.d(bt.bA)) != null) {
                            graphics.drawImage(imageD2, iStringWidth, this.e.at.c + 5, 20);
                            iStringWidth += imageD2.getWidth();
                        }
                        if (bt.aH == 1 && (imageC2 = a.c(bt.aI)) != null) {
                            graphics.drawImage(imageC2, iStringWidth, this.e.at.c + 5, 20);
                            break;
                        }
                    }
                }
                break;
            case 4:
                if (this.c) {
                    t(graphics);
                }
                if (this.as == 15) {
                    c(graphics, "放入装备");
                    break;
                } else {
                    c(graphics, t.L[this.as]);
                    break;
                }
            case 5:
                e(graphics);
                break;
            case 6:
                if (bt.bR != null || bt.bL != null) {
                    if (this.e.aq != null) {
                        this.e.aq.a(graphics);
                    }
                    if (this.l == 1 || this.l == 2) {
                        ca.c(graphics);
                        break;
                    }
                }
                break;
            case 7:
                f(graphics);
                break;
            case 8:
                q(graphics);
                break;
            case 9:
                c(graphics, "卖东西");
                break;
            case 10:
                if (this.e.aq != null) {
                    this.e.aq.a(graphics);
                    break;
                }
                break;
            case 11:
                r(graphics);
                break;
            case 12:
                if (this.c) {
                    t(graphics);
                }
                k(graphics);
                break;
            case 13:
                o(graphics);
                break;
            case 14:
                if (this.e.aq != null) {
                    this.e.aq.a(graphics);
                    break;
                }
                break;
            case 15:
                if (this.e.aq != null) {
                    this.e.aq.a(graphics);
                    break;
                }
                break;
            case 18:
                if (this.c) {
                    t(graphics);
                }
                u(graphics);
                break;
            case 19:
                if (this.e.aq != null) {
                    this.e.aq.a(graphics);
                }
                if (this.l != 1 && this.l != 2 && this.l != 3 && this.l != 4 && this.l != 5 && this.l != 6 && this.l != 7 && this.l != 9) {
                    if (this.l == 8) {
                        ca.a(graphics, "删除好友将清空对该好友的好感度，确认删除？", new String[]{"确定", "取消"});
                        break;
                    } else if (this.l == 10) {
                        this.T.a(graphics);
                        break;
                    }
                } else {
                    ca.c(graphics);
                    break;
                }
                break;
            case 20:
                if (K != null) {
                    ca.a(graphics, 0, t.c - ca.f, t.b, ca.f, K, this.an, (String[]) null);
                    break;
                }
                break;
            case 21:
                if (bt.q != null) {
                    if (this.l != 5) {
                        this.e.aq.a(graphics);
                    }
                    if (this.l != 1 && this.l != 2 && this.l != 3) {
                        if (this.l == 4) {
                            this.T.a(graphics);
                            break;
                        } else if (this.l == 5 && bt.q != null && this.e.ar.g() < bt.q.length) {
                            a(graphics, bt.q[this.e.ar.g()].e, q);
                            break;
                        }
                    } else {
                        ca.c(graphics);
                        break;
                    }
                }
                break;
            case 22:
                v(graphics);
                break;
            case 23:
                if (bt.dY != null) {
                    this.e.aq.a(graphics);
                    if (this.l == 1) {
                        ca.c(graphics);
                        break;
                    } else if (this.l == 2) {
                        a(graphics, "购买个数");
                        break;
                    } else if (this.l == 3) {
                        ca.a(graphics, new StringBuffer().append("您确认以").append(bt.eg[this.e.ar.g()]).append("两的价格购买该物品").append((int) bt.eb[this.e.ar.g()]).append("个").toString(), new String[]{"确定", "取消"});
                        break;
                    } else if (this.l == 4) {
                        ca.a(graphics, new StringBuffer().append("您确认以").append(bt.a(bt.eg[this.e.ar.g()])).append("两的价格购买该物品").append(this.ag).append("个").toString(), new String[]{"确定", "取消"});
                        break;
                    }
                }
                break;
            case 24:
                s(graphics);
                break;
            case 25:
                t(graphics);
                break;
            case 28:
                if (this.e.aq != null) {
                    this.e.aq.a(graphics);
                    if (this.e.ar.h() == 0) {
                        int iA = ((this.e.ar.a() + this.e.ar.c()) - a.C.b) - 70;
                        int iB = this.e.ar.b() + 4;
                        ca.a(graphics, new StringBuffer().append("").append((int) aW[0]).toString(), iA, iB, 60);
                        ca.a(graphics, new StringBuffer().append("").append((int) aW[1]).toString(), iA, t.j + iB, 60);
                        b(0, iA, iB, 60);
                        b(1, iA, iB + t.j, 60);
                        break;
                    } else if (this.e.ar.h() == 1) {
                        int iA2 = ((this.e.ar.a() + this.e.ar.c()) - a.C.b) - 70;
                        int iB2 = this.e.ar.b() + 4;
                        ca.a(graphics, new StringBuffer().append("").append((int) aW[1]).toString(), iA2, iB2, 60);
                        b(1, iA2, iB2, 60);
                        break;
                    }
                }
                break;
            case 29:
                if (bt.dF != null && this.e.aq != null) {
                    this.e.aq.a(graphics);
                    break;
                }
                break;
            case 30:
                n(graphics);
                break;
            case 31:
                if (this.l != 3 && this.e.aq != null) {
                    this.e.aq.a(graphics);
                }
                if (this.l == 1) {
                    a(graphics, "兑换数量");
                    break;
                } else if (this.l == 2) {
                    ca.c(graphics);
                    break;
                }
                break;
            case 32:
                w(graphics);
                break;
            case 33:
                if (this.e.aq != null) {
                    this.e.aq.a(graphics);
                    ca.a(graphics, this.e.aq.a + 5, this.e.aq.b + 32, this.e.aq.c - 11, this.bQ, 1);
                    ca.c(graphics, this.e.aq.a + 62, this.e.aq.b + 35, this.e.aq.a + 62, this.e.aq.b + 29 + this.bQ);
                }
                if (bp != null) {
                    a.f.a(graphics, bp, (int[]) null, 0, 0, this.e.aq.a + 5 + 30, ((this.bQ + bp.j()) / 2) + this.e.aq.b + 35, 20, 0);
                }
                int width = this.e.aq.a + 8;
                if (bt.aC == 1 && (imageD = a.d(bt.kU)) != null) {
                    graphics.drawImage(imageD, width, this.e.aq.b + 35, 20);
                    width += imageD.getWidth();
                }
                if (bt.aH == 1 && (imageC = a.c(bt.aI)) != null) {
                    graphics.drawImage(imageC, width, this.e.aq.b + 34, 20);
                }
                graphics.setColor(1539988);
                graphics.fillRect(this.e.aq.a + 68, this.e.aq.b + 30 + (this.bQ / 2), this.e.aq.c - 80, t.j);
                graphics.setColor(16776960);
                graphics.drawString(new StringBuffer().append("超Q等级：").append((int) bt.kU).toString(), this.e.aq.a + 70, ((this.e.aq.b + 30) + (this.bQ / 2)) - t.j, 20);
                graphics.drawString(new StringBuffer().append("超Q特权礼包：").append(bt.kV == 1 ? "领取" : "未领取").toString(), this.e.aq.a + 70, this.e.aq.b + 30 + (this.bQ / 2), 20);
                if (this.l == 1) {
                    ca.c(graphics);
                    break;
                }
                break;
            case 34:
                l(graphics);
                break;
            case 35:
                m(graphics);
                break;
            case 36:
                g(graphics);
                break;
            case 37:
                a(graphics, 0);
                break;
            case 38:
                if (this.e.aq != null) {
                    this.e.aq.a(graphics);
                }
                if (this.l == 1 || this.l == 2 || this.l == 3 || this.l == 4 || this.l == 5 || this.l == 6 || this.l == 7 || this.l == 8 || this.l == 10) {
                    ca.c(graphics);
                }
                if (this.l == 9) {
                    ca.a(graphics, new StringBuffer().append("您确定招募").append(bt.hU[this.e.ar.g()]).append("？").toString(), new String[]{"确定", "返回"});
                    break;
                }
                break;
            case 39:
                z(graphics);
                if (this.cX == 5) {
                    this.ba.a(graphics, a.f, ((h - g()) - (this.ba.d.g() / 2)) - 2, (i - h()) - this.ba.d.h(), (byte) 0);
                } else {
                    this.ba.a(graphics, a.f, h - g(), i - h(), (byte) 0);
                }
                if (!this.cY) {
                    graphics.setColor(16711680);
                } else if (this.e.ak % 5 == 0) {
                    graphics.setColor(65280);
                } else {
                    graphics.setColor(2162687);
                }
                if (this.cX == 5) {
                    graphics.drawRect((((this.ba.e - h) + g()) - 1) + (this.ba.d.g() / 7), ((this.ba.f - i) + h()) - 1, this.ba.d.g() + 2, this.ba.d.h() + 2);
                    graphics.drawRect((this.ba.e - h) + g() + (this.ba.d.g() / 7), (this.ba.f - i) + h(), this.ba.d.g(), this.ba.d.h());
                    break;
                } else {
                    graphics.drawRect(((this.ba.e - h) + g()) - 1, ((this.ba.f - i) + h()) - 1, this.ba.d.g() + 2, this.ba.d.h() + 2);
                    graphics.drawRect((this.ba.e - h) + g(), (this.ba.f - i) + h(), this.ba.d.g(), this.ba.d.h());
                    break;
                }
            case 40:
                if (this.l == 0) {
                    ca.a(graphics, 0, t.c - ca.f, t.b, ca.f, K, this.an, (String[]) null);
                    break;
                } else if (this.l == 1 && this.e.aq != null) {
                    this.e.aq.a(graphics);
                    break;
                }
                break;
            case 41:
                aq aqVar2 = this.M;
                if (aqVar2.b.aq != null) {
                    aqVar2.b.aq.a(graphics);
                }
                if (aqVar2.a.l != 0) {
                    if (aqVar2.a.l == 1) {
                        ca.a(graphics, "您真的要退出帮派吗？", new String[]{"确定", "返回"});
                        break;
                    } else if (aqVar2.a.l == 2) {
                        ca.a(graphics, "您真的要解散帮派吗？", new String[]{"确定", "返回"});
                        break;
                    } else if (aqVar2.a.l == 3) {
                        ca.a(graphics, "您真的要发布招募吗？", new String[]{"确定", "返回"});
                        break;
                    }
                }
                break;
            case 42:
                aq aqVar3 = this.M;
                if (aqVar3.a.l == 0 || aqVar3.a.l == 1) {
                    if (aqVar3.b.aq != null) {
                        aqVar3.b.aq.a(graphics);
                    }
                    if (aqVar3.a.l == 1) {
                        ca.c(graphics);
                        break;
                    }
                }
                break;
            case 43:
                aq aqVar4 = this.M;
                if (aqVar4.a.l == 0 || aqVar4.a.l == 1) {
                    if (aqVar4.b.aq != null) {
                        aqVar4.b.aq.a(graphics);
                    }
                    if (aqVar4.a.l == 1) {
                        ca.c(graphics);
                        break;
                    }
                }
                break;
            case 45:
                aq aqVar5 = this.M;
                if (aqVar5.a.l == 0 && aqVar5.b.aq != null) {
                    aqVar5.b.aq.a(graphics);
                    break;
                }
                break;
            case 46:
                aq aqVar6 = this.M;
                if (aqVar6.a.l != 0 && aqVar6.a.l != 1) {
                    if (aqVar6.a.l == 2) {
                        aqVar6.a.T.a(graphics);
                        break;
                    }
                } else {
                    if (aqVar6.b.aq != null) {
                        aqVar6.b.aq.a(graphics);
                    }
                    if (aqVar6.a.l == 1) {
                        ca.c(graphics);
                        break;
                    }
                }
                break;
            case 47:
                aq aqVar7 = this.M;
                if (aqVar7.a.l != 4 && aqVar7.b.aq != null) {
                    aqVar7.b.aq.a(graphics);
                }
                if (aqVar7.a.l != 1 && aqVar7.a.l != 2 && aqVar7.a.l != 5 && aqVar7.a.l != 6 && aqVar7.a.l != 7 && aqVar7.a.l != 8) {
                    if (aqVar7.a.l == 3) {
                        aqVar7.a.T.a(graphics);
                        break;
                    } else if (aqVar7.a.l == 4) {
                        aqVar7.a.a(graphics, bt.iz[aqVar7.b.ar.g()], q);
                        break;
                    } else if (aqVar7.a.l == 9) {
                        ca.a(graphics, "需要消耗基金300万和20点军力，一旦宣战必须等到战争结束后才能再次宣战！", new String[]{"确定", "取消"});
                        break;
                    }
                } else {
                    ca.c(graphics);
                    break;
                }
                break;
            case 48:
                aq aqVar8 = this.M;
                if (aqVar8.a.l == 0 || aqVar8.a.l == 1 || aqVar8.a.l == 3) {
                    if (aqVar8.b.aq != null) {
                        aqVar8.b.aq.a(graphics);
                    }
                    if (aqVar8.a.l == 1) {
                        ca.c(graphics);
                        break;
                    } else if (aqVar8.a.l == 3) {
                        ca.a(graphics, new StringBuffer().append("要开除").append(bt.iz[aqVar8.b.ar.g()]).append("出帮派吗？").toString(), new String[]{"确定", "取消"});
                        break;
                    }
                } else if (aqVar8.a.l == 2 && aqVar8.b.aq != null) {
                    aqVar8.b.aq.a(graphics);
                    break;
                }
                break;
            case 49:
                aq aqVar9 = this.M;
                if (aqVar9.a.l == 0 && aqVar9.b.aq != null) {
                    aqVar9.b.aq.a(graphics);
                    break;
                }
                break;
            case 50:
                aq aqVar10 = this.M;
                if (aqVar10.b.aq != null) {
                    aqVar10.b.aq.a(graphics);
                }
                if (aqVar10.a.l == 1) {
                    aqVar10.a.b(graphics, "捐献银两数量");
                    break;
                } else if (aqVar10.a.l == 2) {
                    aqVar10.a.b(graphics, "捐献经验数量");
                    break;
                } else {
                    if (aqVar10.a.l == 3 || aqVar10.a.l == 4) {
                        aqVar10.a.a(graphics, "请选择发布天数");
                        if (aqVar10.a.m != 1) {
                        }
                    } else if (aqVar10.a.l == 5) {
                        aqVar10.a.b(graphics, "取出银两数量");
                        break;
                    } else if (aqVar10.a.l != 6 && aqVar10.a.l != 7) {
                    }
                    ca.a(graphics, aqVar10.a.at, new String[]{"确定", "取消"});
                    break;
                }
                break;
            case 51:
                this.M.c(graphics);
                break;
            case 52:
                aq aqVar11 = this.M;
                if (aqVar11.b.aq != null) {
                    aqVar11.b.aq.a(graphics);
                }
                if (aqVar11.a.l == 1 || aqVar11.a.l == 2) {
                    ca.c(graphics);
                    break;
                }
                break;
            case 53:
                if (this.e.aq != null) {
                    this.e.aq.a(graphics);
                }
                if (this.l == 1) {
                    ca.c(graphics);
                    break;
                } else if (this.l == 2) {
                    a(graphics, "取回个数");
                    break;
                }
                break;
            case 57:
                if (this.l == 0) {
                    this.e.aq.a(graphics);
                    break;
                }
                break;
            case 58:
                if (this.l == 0) {
                    this.e.aq.a(graphics);
                    break;
                }
                break;
            case 59:
                this.e.aq.a(graphics);
                if (this.l != 1 && this.l != 2) {
                    if (this.l == 3) {
                        if (ca.a(bt.jO[this.e.ar.g()]) != -1) {
                            ca.a(graphics, new StringBuffer().append("是否将").append(bt.jO[this.e.ar.g()].substring(3, bt.jO[this.e.ar.g()].length())).append("从拍卖场中撤下？").toString(), new String[]{"确定", "取消"});
                            break;
                        } else {
                            ca.a(graphics, new StringBuffer().append("是否将").append(bt.jO[this.e.ar.g()]).append("从拍卖场中撤下？").toString(), new String[]{"确定", "取消"});
                            break;
                        }
                    } else if (this.l == 5) {
                        ca.a(graphics, new StringBuffer().append("您确定以").append(this.bR).append("两的价格拍卖此物品?").toString(), new String[]{"确定", "取消"});
                        break;
                    } else if (this.l == 4) {
                        b(graphics, "拍卖价格");
                        break;
                    }
                } else {
                    ca.c(graphics);
                    break;
                }
                break;
            case 60:
                aq aqVar12 = this.M;
                if (aqVar12.b.aq != null) {
                    aqVar12.b.aq.a(graphics);
                }
                if (aqVar12.a.l != 1 && aqVar12.a.l != 2) {
                    if (aqVar12.a.l == 3) {
                        ca.a(graphics, "需要消耗基金300万和20点军力，一旦宣战必须等到战争结束后才能再次宣战！", new String[]{"确定", "取消"});
                        break;
                    }
                } else {
                    ca.c(graphics);
                    break;
                }
                break;
            case 61:
                String string = new StringBuffer().append("离复活还有").append((int) bt.kj).append("秒！").toString();
                ca.a(graphics, string, (t.b - t.i.stringWidth(string)) / 2, (t.c - t.j) / 2, 20, 16711680, 0);
                break;
            case 62:
                ca.a(graphics, bt.kC, new String[]{"确定", "取消"});
                break;
            case 63:
                aq aqVar13 = this.M;
                if (aqVar13.a.l == 0 && aqVar13.b.aq != null) {
                    ca.a(graphics, aqVar13.b.aq.a + 5, aqVar13.b.aq.a(), aqVar13.b.aq.c - 11, (t.j * 2) + 8, 1);
                    graphics.setColor(16711680);
                    graphics.drawString("处置战败方：", t.f + (t.d / 2), aqVar13.b.aq.a() + 2, 17);
                    graphics.drawString(new StringBuffer().append("（").append((int) bt.kD).append("分钟限时）").toString(), t.f + (t.d / 2), aqVar13.b.aq.a() + 2 + t.j + 4, 17);
                    aqVar13.b.aq.a(graphics);
                    break;
                }
                break;
            case 64:
                this.O.a(graphics);
                break;
            case 65:
                this.O.b(graphics);
                break;
            case 67:
                this.O.c(graphics);
                break;
            case 68:
                if (this.e.aq != null) {
                    this.e.aq.a(graphics);
                    break;
                }
                break;
            case 69:
                if (this.e.aq != null) {
                    this.e.aq.a(graphics);
                }
                if (this.l == 1) {
                    a(graphics, "兑换数量");
                    break;
                }
                break;
            case 70:
                B(graphics);
                break;
            case 71:
                E(graphics);
                break;
            case 72:
                F(graphics);
                break;
            case 75:
                if (this.e.aq != null) {
                    this.e.aq.a(graphics);
                    break;
                }
                break;
            case 76:
                D(graphics);
                break;
            case 77:
                C(graphics);
                break;
            case 90:
                this.S.a(graphics);
                break;
            case 91:
                this.S.b(graphics);
                break;
            case 92:
                this.S.c(graphics);
                break;
            case 93:
                this.S.d(graphics);
                break;
            case 94:
                c(graphics);
                break;
            case 95:
                p(graphics);
                break;
            case 96:
                a(graphics, 1);
                break;
            case 98:
                K(graphics);
                break;
            case 100:
                G(graphics);
                break;
            case 101:
                this.U.a(graphics);
                break;
            case 102:
                this.V.a(graphics);
                break;
            case 103:
                J(graphics);
                break;
            case 104:
                H(graphics);
                break;
            case 105:
                I(graphics);
                break;
            case 106:
                this.O.d(graphics);
                break;
            case 107:
                L(graphics);
                break;
            case 108:
            case 109:
                M(graphics);
                break;
            case 110:
                O(graphics);
                break;
            case 111:
                N(graphics);
                break;
            case 113:
                this.M.d(graphics);
                break;
            case 114:
                this.M.a(graphics);
                break;
            case 115:
                this.M.b(graphics);
                break;
            case 116:
                P(graphics);
                break;
            case 117:
                Q(graphics);
                break;
            case 118:
                R(graphics);
                break;
            case 119:
                S(graphics);
                break;
            case 120:
                T(graphics);
                break;
            case 121:
                i(graphics);
                break;
            case 122:
                j(graphics);
                break;
            case 123:
                h(graphics);
                break;
            case 125:
                U(graphics);
                break;
            case 126:
                d(graphics);
                break;
            case 127:
                V(graphics);
                break;
            case 128:
                W(graphics);
                break;
            case 130:
                this.N.a(graphics);
                break;
            case 131:
                this.W.a(graphics);
                break;
        }
    }

    public final void a(Graphics graphics, int i2, int i3, int i4) {
        short s2;
        short s3;
        if (bt.ej == null && i4 == 0) {
            return;
        }
        if (bt.ep == null && i4 == 1) {
            return;
        }
        a(graphics, i2, i3, 17, 17, bt.ej.length, 1);
        int i5 = 0;
        while (true) {
            int i6 = i5;
            if (i6 >= bt.ej.length) {
                return;
            }
            if (i4 == 0) {
                s2 = bt.en[i6];
                s3 = bt.ej[i6];
            } else {
                s2 = bt.et[i6];
                s3 = bt.ep[i6];
            }
            if (s2 != -1 && i6 >= 0 && i6 < 8) {
                a.f.a(graphics, b(s2), (int[]) null, (aj) null, 0, 0, (s3 * 17) + i2 + 3, i3 + 3, 0, 0);
            }
            if (i6 >= 8) {
                a.f.a(graphics, F, (int[]) null, i6 == 8 ? 0 : 2, 0, 0, (s3 * 17) + i2 + 3, i3 + 3, 0, 0);
            }
            i5 = i6 + 1;
        }
    }

    public final void a(Graphics graphics, int i2, int i3, int i4, int i5, int i6, int i7) {
        ca.l = 0;
        graphics.setColor(15975);
        graphics.drawRect(i2, i3, (i6 * 17) + 4, 21);
        this.cG[0] = i2;
        this.cG[1] = i3;
        this.cG[2] = (i6 * 17) + 4;
        this.cG[3] = 21;
        graphics.setColor(11267556);
        graphics.drawRect(i2 + 1, i3 + 1, (i6 * 17) + 2, 19);
        for (int i8 = 0; i8 < i6; i8++) {
            for (int i9 = 0; i9 < 1; i9++) {
                graphics.drawImage(x.a, i2 + 2 + (i8 * 17), i3 + 2 + (i9 * 17), 20);
                int i10 = i2 + 2 + (i8 * 17);
                int i11 = i3 + 2 + (i9 * 17);
                if (this.cF.length >= i8) {
                    this.cF[i8][0] = i10;
                    this.cF[i8][1] = i11;
                    this.cF[i8][2] = 17;
                    this.cF[i8][3] = 17;
                }
            }
        }
    }

    public final void a(Graphics graphics, String str) {
        ca.a(graphics, new StringBuffer().append(str).append("(").append(this.ah).append(")").toString(), this.ag, true);
    }

    public final void a(Graphics graphics, String str, bc bcVar) {
        int i2;
        int i3;
        if (this.m == 0) {
            if (bcVar == null || a.O == null || a.R == null) {
                i2 = 0;
                i3 = 0;
            } else {
                i3 = (t.b - a.O.b) / 2;
                int i4 = (t.c - a.O.c) / 2;
                graphics.drawImage(a.O.a, i3, i4, 20);
                a(i3, i4, a.O.b, a.O.c);
                for (int i5 = 0; i5 < this.bY.length; i5++) {
                    if (i5 < a.R.length) {
                        this.bZ = a.R[i5].a;
                    } else if (i5 == 8) {
                        this.bZ = a.R[1].a;
                    } else if (i5 == 9) {
                        this.bZ = a.R[7].a;
                    }
                    graphics.drawImage(this.bZ, this.bY[i5][0] + i3, this.bY[i5][1] + i4, 20);
                    c(i5, i3 + this.bY[i5][0], i4 + this.bY[i5][1], a.R[0].b, a.R[0].c);
                }
                a.f.a(graphics, bcVar, (int[]) null, 0, 0, i3 + (a.O.b / 2), ((a.O.c - bcVar.j()) / 2) + i4 + bcVar.j(), 20, 0);
                ca.a(graphics, str, i3 + (a.O.b / 2), i4 + 26, 17, 16776960, 0);
                i2 = i4;
            }
            graphics.setColor(10092544);
            graphics.drawRect(this.bY[this.aq][0] + i3, this.bY[this.aq][1] + i2, 17, 17);
            int[] iArr = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
            if (bt.cG != null) {
                int i6 = 0;
                while (true) {
                    int i7 = i6;
                    if (i7 >= bt.cG.length) {
                        break;
                    }
                    a.f.a(graphics, b(bt.cJ[i7]), (int[]) null, (aj) null, 0, 0, this.bY[bt.cI[i7]][0] + i3 + 1, this.bY[bt.cI[i7]][1] + i2 + 1, 0, 0);
                    iArr[bt.cI[i7]] = i7;
                    i6 = i7 + 1;
                }
            }
            if (iArr[this.aq] >= 0) {
                if (this.aq < 3) {
                    ca.a(graphics, bt.cH[iArr[this.aq]], a(this.aq, false), this.bY[this.aq][0] + i3 + 16, i2 + this.bY[this.aq][1], 40);
                    return;
                }
                if (this.aq < 5) {
                    ca.a(graphics, bt.cH[iArr[this.aq]], a(this.aq, false), this.bY[this.aq][0] + i3 + 16, this.bY[this.aq][1] + i2 + 16, 24);
                    return;
                } else if (this.aq < 7) {
                    ca.a(graphics, bt.cH[iArr[this.aq]], a(this.aq, false), i3 + this.bY[this.aq][0], this.bY[this.aq][1] + i2 + 16, 20);
                    return;
                } else {
                    ca.a(graphics, bt.cH[iArr[this.aq]], a(this.aq, false), i3 + this.bY[this.aq][0], i2 + this.bY[this.aq][1], 36);
                    return;
                }
            }
            if (this.aq < 3) {
                ca.a(graphics, t.M[this.aq], -1L, this.bY[this.aq][0] + i3 + 16, i2 + this.bY[this.aq][1], 40);
                return;
            }
            if (this.aq < 5) {
                ca.a(graphics, t.M[this.aq], -1L, this.bY[this.aq][0] + i3 + 16, this.bY[this.aq][1] + i2 + 16, 24);
                return;
            } else if (this.aq < 7) {
                ca.a(graphics, t.M[this.aq], -1L, i3 + this.bY[this.aq][0], this.bY[this.aq][1] + i2 + 16, 20);
                return;
            } else {
                ca.a(graphics, t.M[this.aq], -1L, i3 + this.bY[this.aq][0], i2 + this.bY[this.aq][1], 36);
                return;
            }
        }
        if (this.m != 1) {
            return;
        }
        this.T.a(graphics);
        ca.a(graphics, this.T.a + 5, this.T.b + 32, this.T.c - 11, 30, 1);
        ca.a(graphics, "宝石", this.T.a + 10, t.a(25) + this.T.b + 35, 20, 16776960, 0);
        if (bt.cQ == null) {
            return;
        }
        int i8 = 0;
        while (true) {
            int i9 = i8;
            if (i9 >= bt.cG.length) {
                return;
            }
            if (bt.cI[i9] == this.aq && bt.cQ[i9] != null) {
                a(graphics, this.T.a + 10 + t.i.stringWidth("宝石:"), this.T.b + 37, 17, 17, bt.cQ[i9].length, 1);
                byte b2 = 0;
                while (true) {
                    byte b3 = b2;
                    if (b3 < bt.cQ[i9].length) {
                        if (bt.cQ[i9][b3] > 0) {
                            a.f.a(graphics, b(bt.cQ[i9][b3]), (int[]) null, (aj) null, 0, 0, (b3 * 17) + this.T.a + 10 + t.i.stringWidth("宝石:") + 2, this.T.b + 39, 0, 0);
                        }
                        b2 = (byte) (b3 + 1);
                    }
                }
            }
            i8 = i9 + 1;
        }
    }

    public final void a(short s2) {
        this.bb = s2;
        this.e.d.a();
        bt.dS = bt.dT;
        bt.dU = bt.dV;
        bt.dW = bt.dX;
        this.an = new String[]{bt.dS[2], bt.dS[3]};
        K = new bw(bt.dS[0], (short) (t.b - 20));
        ca.a(a.F, K, this.an, (String[]) null, true);
        a.f.a(this.f, h, i, true, false, 1009050);
        this.e.az = false;
        this.e.j = this.e.k;
        this.k = (short) 20;
        this.j = (short) 20;
    }

    public final void a(short s2, byte b2) {
        this.bb = s2;
        this.l = (short) 0;
        this.cy = b2;
        this.e.aq.b();
        this.e.aq.a(true);
        this.e.aq.a(this.cy == 2 ? "锻造列表" : "兑换列表");
        this.e.ar.a((Image[]) null, bt.ex, (String[]) null, (String[]) null);
        this.e.au.a(this.cy == 2 ? "锻造" : "兑换");
        if (bt.ew == null || bt.ew.length <= 0) {
            this.e.at.a((String) null, t.i, (byte) 2);
        } else {
            this.e.at.a(ap(this.e.ar.g()), t.i, (byte) 2);
        }
        this.e.at.a((byte) 1);
        this.e.aq.a(this.e.ar);
        this.e.aq.a(this.e.at);
        if (t.c > 220) {
            this.e.aq.a(this.e.au);
        }
        this.e.aq.a(t.f, t.g, t.d, t.e);
        a aVar = this.e;
        this.e.k = (short) 7;
        aVar.j = (short) 7;
        this.k = (short) 31;
        this.j = (short) 31;
    }

    public final void a(short s2, String str) {
        if (bt.bs == 0) {
            this.e.b("队员不能发送组队邀请");
            return;
        }
        if (bt.bs == 1 && bt.q != null && bt.q.length >= 3) {
            this.e.b("队伍已满，无法邀请");
            return;
        }
        if (bt.G()) {
            this.e.b("住宅区域中，无法邀请");
            return;
        }
        byte[] bArrA = bz.a((short) 4112, bt.ad, str, s2);
        if (bArrA == null) {
            this.e.b("获取上传指令数据错误!");
            return;
        }
        a.i.a(new w((short) 4112, bArrA));
        this.l = (short) 0;
    }

    public final void a(boolean z2) {
        this.bJ = z2;
        this.e.a = 0;
        this.e.b = 0;
        this.l = (short) 0;
        this.e.aq.j();
        this.e.aq.a("传送目的地");
        String[] strArr = new String[bt.cs.length];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            strArr[i2] = "";
        }
        this.e.ar.a((Image[]) null, strArr, bt.cs, (String[]) null);
        this.e.aq.a(this.e.ar);
        this.e.aq.a(t.f, t.g, t.d, t.e);
        this.e.j = this.e.k;
        this.k = (short) 10;
        this.j = (short) 10;
    }

    public final void a(boolean z2, boolean z3) {
        this.cg = z2;
        this.l = (short) 0;
        b(z3);
        this.e.j = this.e.k;
        this.k = (short) 36;
        this.j = (short) 36;
    }

    public final void a(bp[] bpVarArr) {
        if (bpVarArr == null) {
            if (bt.q != null) {
                R();
                if (this.k == 21) {
                    this.e.b("没有队伍");
                    return;
                }
                return;
            }
            return;
        }
        if (bt.q == null) {
            for (int i2 = 0; i2 < bpVarArr.length; i2++) {
                bpVarArr[i2].j = this.I.j;
                bpVarArr[i2].k = this.I.k;
                bpVarArr[i2].l = this.I.j;
                bpVarArr[i2].m = this.I.k;
            }
            if (bt.bs == 0 && bt.s == 0) {
                this.I.a(1);
            }
            bt.q = bpVarArr;
            return;
        }
        for (int i3 = 0; i3 < bpVarArr.length; i3++) {
            if (bpVarArr[i3] != null) {
                int i4 = 0;
                while (true) {
                    if (i4 >= bt.q.length) {
                        break;
                    }
                    if (bt.q[i4] != null && bt.q[i4].b.equals(bpVarArr[i3].b)) {
                        bpVarArr[i3].j = bt.q[i4].j;
                        bpVarArr[i3].k = bt.q[i4].k;
                        break;
                    }
                    i4++;
                }
            }
        }
        bt.q = bpVarArr;
        if (this.k == 21) {
            aN();
        }
    }

    public final void a(ce[] ceVarArr) {
        for (ce ceVar : ceVarArr) {
            b(ceVar);
            if (this.k == 0 || !i()) {
                a(ceVar);
            }
            if (ceVar.b == 4) {
                this.n = true;
            }
        }
        this.cM = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(short[] r8) {
        /*
            r7 = this;
            r6 = 0
            r2 = 1
            r1 = 0
            if (r8 != 0) goto L6
        L5:
            return
        L6:
            short[] r3 = r7.cW
            if (r8 == 0) goto L40
            if (r3 != 0) goto L25
            r0 = r2
        Ld:
            if (r0 == 0) goto L5
            java.util.Vector r0 = r7.bj
            r0.removeAllElements()
        L14:
            int r0 = r8.length
            if (r1 >= r0) goto L42
            java.util.Vector r0 = r7.bj
            short r2 = r8[r1]
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.addElement(r2)
            int r1 = r1 + 1
            goto L14
        L25:
            if (r3 == 0) goto L40
            if (r8 == 0) goto L40
            if (r3 == r8) goto L40
            int r0 = r3.length
            int r4 = r8.length
            if (r0 == r4) goto L31
            r0 = r2
            goto Ld
        L31:
            r0 = r1
        L32:
            int r4 = r3.length
            if (r0 >= r4) goto L40
            short r4 = r3[r0]
            short r5 = r8[r0]
            if (r4 == r5) goto L3d
            r0 = r2
            goto Ld
        L3d:
            int r0 = r0 + 1
            goto L32
        L40:
            r0 = r1
            goto Ld
        L42:
            bu r0 = com.yinhan.kjava.main.a.af
            java.util.Vector r1 = r7.bj
            r0.b(r1, r6, r6, r6)
            r7.cW = r8
            java.util.Vector r0 = r7.bj
            r0.removeAllElements()
            goto L5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ao.a(short[]):void");
    }

    public final void aa() {
        this.l = (short) 0;
        this.e.aq.b();
        this.e.aq.a(bt.bz == null ? "" : bt.bz);
        this.e.at.a(bt.by, t.i, (byte) 2);
        this.e.at.a((byte) 0);
        this.e.au.a("确定");
        this.e.aq.a(this.e.at);
        if (t.c > 220) {
            this.e.aq.a(this.e.au);
        }
        this.e.aq.a(t.f, t.g, t.d, t.e);
        this.e.j = this.e.k;
        this.k = (short) 75;
        this.j = (short) 75;
    }

    public final void ab() {
        if (aW[18] == 0) {
            this.dd = new bw(bt.k, (short) t.i.stringWidth(bt.k));
            this.db = t.b;
            this.dc = 40;
        }
    }

    public final void ac() {
        this.e.aq.j();
        this.e.aq.a("称号列表");
        this.e.aq.a(true);
        this.e.as.a(new String[]{"活动", "成就", "职业", "特殊"});
        this.e.ar.a((Image[]) null, bt.ml, (String[]) null, bt.mn);
        this.e.ar.a(bt.mp);
        this.e.at.a(aN(0), t.i, (byte) 1);
        this.e.at.a((byte) 1);
        this.e.aq.a(this.e.as);
        this.e.aq.a(this.e.ar);
        this.e.aq.a(this.e.at);
        this.e.as.a = bt.mj;
        this.e.aq.a(t.f, t.g, t.d, t.e);
        this.l = (short) 0;
        this.e.j = this.e.k;
        this.k = (short) 103;
        this.j = (short) 103;
    }

    public final boolean ad() {
        return this.k == 71 || this.k == 72;
    }

    public final void ae() {
        this.e.aq.b();
        this.e.aq.a(bt.mr);
        this.e.aq.a(true);
        this.e.ar.a((Image[]) null, bt.mu, (String[]) null, (String[]) null);
        this.e.at.a(bt.mv != null ? bt.mv[0] : null, t.i, (byte) 1);
        this.e.at.a((byte) 1);
        this.e.au.a("确认");
        this.e.aq.a(this.e.ar);
        this.e.aq.a(this.e.at);
        if (t.c > 220) {
            this.e.aq.a(this.e.au);
        }
        this.e.aq.a(t.f, t.g, t.d, t.e);
        this.l = (short) 0;
        this.e.j = this.e.k;
        this.k = (short) 107;
        this.j = (short) 107;
    }

    public final void af() {
        a("开通超Q", bt.aD, (short) 108);
    }

    public final void ag() {
        a("开通魔钻", bt.aJ, (short) 109);
    }

    public final void ah() {
        a.ah.d("3762");
        bp = a.ah.b("3762");
        this.e.aq.j();
        this.e.aq.a("超Q精灵");
        this.e.aq.a(true);
        this.bQ = Math.max((t.j * 3) + 10, bp.j() + 10);
        this.e.aq.a(this.bQ);
        this.e.at.b(bt.kW, t.i, (byte) 1);
        this.e.au.a(new String[]{"领取", "返回"});
        this.e.aq.a(this.e.at);
        this.e.aq.a(this.e.au);
        this.e.aq.a(t.f, t.g, t.d, t.e);
        this.l = (short) 0;
        this.e.j = this.e.k;
        this.k = (short) 33;
        this.j = (short) 33;
    }

    public final void ai() {
        ca.g = 0;
        ca.h = 0;
        this.e.a = 0;
        this.e.b = 0;
        this.l = (short) 0;
        this.e.j = this.e.k;
        this.k = (short) 116;
    }

    public final void aj() {
        K = new bw(bt.eK, (short) (t.b - 20));
        ca.a((az) null, K, bt.eL, (String[]) null, true);
        ca.h = 0;
        ca.g = 0;
        this.e.a = 0;
        this.e.b = 0;
        this.l = (short) 0;
        this.e.j = this.e.k;
        this.k = (short) 117;
    }

    public final void ak() {
        this.dh = null;
        if (this.be != 0) {
            if (this.be != 1 || bt.mJ[this.bf] == -1) {
                return;
            }
            this.dh = new bh(bt.mL[this.bf], (short) 160);
            return;
        }
        if (this.bf == 0 && bt.mx != -1) {
            this.dh = new bh(bt.mC, (short) 160);
        } else {
            if (this.bf != 1 || bt.mD == -1) {
                return;
            }
            this.dh = new bh(bt.mI, (short) 160);
        }
    }

    public final void al() {
        this.di = new an();
        this.dj = new an();
        this.l = (short) 0;
        this.e.aq.b();
        this.e.aq.a("坐骑");
        this.e.aq.a(true);
        byte b2 = 0;
        while (true) {
            if (b2 >= bt.nu.length) {
                break;
            }
            if (bt.nu[b2] == bt.nm) {
                this.dl = b2;
                break;
            }
            b2 = (byte) (b2 + 1);
        }
        if (t.p) {
            be();
            t.i.stringWidth(t.G[0]);
            if (bt.nv != null) {
                this.dk = new bc[bt.nv.length];
                for (int i2 = 0; i2 < this.dk.length; i2++) {
                    bc[] bcVarArr = this.dk;
                    String str = bt.nv[i2];
                    int iA = bu.a(a.a(bt.ax, bt.aj, (byte) 0, bt.ay, false, str), (byte) 2);
                    a.ab.b(a.a(bt.ax, bt.aj, (byte) 0, bt.ay, false, str), (short) 0, (short) 0, (short) 0);
                    bcVarArr[i2] = a.ab.a(iA, (short) 0, (short) 0, (short) 0);
                }
            }
        } else {
            this.e.au.a(this.dr);
        }
        this.e.at.a(bt.nt, t.i, (byte) 2);
        this.di.a(bt.nr, t.i, (byte) 2);
        this.dj.b(bt.ns, t.i, (byte) 2);
        this.e.aq.a(this.e.at);
        if (t.c > 220) {
            this.e.aq.a(this.e.au);
        }
        this.e.aq.a(t.f, t.g, t.d, t.e);
        this.e.at.a(this.e.at.b, this.e.at.c, this.e.at.d, this.e.at.e / 3);
        this.di.a(this.e.at.b, this.e.at.c + this.e.at.e, this.e.at.d / 2, this.e.at.e << 1);
        this.dj.a(this.di.b + this.di.d, this.di.c, this.di.d, this.di.e);
        this.e.j = this.e.k;
        this.k = (short) 125;
        this.j = (short) 125;
    }

    public final void am() {
        this.l = (short) 0;
        this.aq = 0;
        this.dv = new bw(bt.nh, (short) 120);
        this.e.aq.b();
        this.e.aq.a("见钱开箱");
        this.e.aq.a(true);
        this.e.au.a("开启");
        this.e.at.b(bt.ni, t.i, (byte) 2);
        this.e.aq.a(this.e.at);
        if (t.c > 220) {
            this.e.aq.a(this.e.au);
        }
        this.e.aq.a(t.f, t.g, t.d, t.e);
        this.ds = this.e.at.b;
        this.dt = this.e.at.c;
        this.e.at.a(this.e.at.b, this.e.at.c + (this.e.at.e >> 1), this.e.at.d, this.e.at.e >> 1);
        this.e.j = this.e.k;
        this.k = (short) 127;
        this.j = (short) 127;
        ca.l = 0;
    }

    public final void an() {
        this.aU = this.e.ar.g();
        this.e.aq.b();
        this.e.aq.a("特效");
        this.e.ar.a(bt.ny, null, bt.nz);
        this.e.at.b(bt.nA[0], t.i, (byte) 2);
        this.e.aq.a(this.e.ar);
        this.e.aq.a(this.e.at);
        this.e.aq.a(0, 0, t.b, t.c);
        this.l = (short) 0;
        this.e.j = this.e.k;
        this.k = (short) 128;
        this.j = (short) 128;
    }

    public final int b(int i2, int i3) {
        if (this.bV != null) {
            for (int i4 = 0; i4 < this.bV.length; i4++) {
                if (i2 >= this.bV[i4][0] && i2 <= this.bV[i4][0] + this.bV[i4][2] && i3 >= this.bV[i4][1] && i3 <= this.bV[i4][1] + this.bV[i4][3]) {
                    if (this.av != i4) {
                        this.av = i4;
                        ca.l = 0;
                        return 0;
                    }
                    if (this.av == i4) {
                        return 268435456;
                    }
                }
            }
        }
        if (this.bW != null) {
            return (i2 < this.bW[0] || i2 > this.bW[0] + this.bW[2] || i3 < this.bW[1] || i3 > this.bW[1] + this.bW[3]) ? 536870912 : 0;
        }
        return 0;
    }

    public final int b(int i2, int i3, int i4) {
        if (this.au == null) {
            return i2;
        }
        for (int i5 = 0; i5 < this.au.length; i5++) {
            if (i3 >= this.au[i5][0] && i3 <= this.au[i5][0] + this.au[i5][2] && i4 >= this.au[i5][1] && i4 <= this.au[i5][1] + this.au[i5][3]) {
                byte b2 = (byte) (i5 % 8);
                byte b3 = (byte) (i5 / 8);
                if (b2 == this.aq && b3 == this.ar) {
                    return 268435456;
                }
                this.aq = b2;
                this.ar = (byte) (b3 - 1);
                return 4;
            }
        }
        return i2;
    }

    public final void b() {
        this.e.a();
        bt.f();
        bt.j();
        bt.d();
        bt.h();
        bt.i();
        bt.n();
        bt.q();
        bt.c();
        bt.b();
        bt.B();
        bt.F();
        a.af.c();
        bt.bs = (short) -1;
        bt.s = (short) -1;
        bt.k = null;
        this.dd = null;
        bt.F = null;
        bt.G = null;
        bt.ke = -1;
        bt.kf = -1;
        bt.kg = -1;
        if (this.I != null) {
            this.I = null;
        }
        if (this.f != null) {
            this.f.a();
            this.f = null;
        }
        if (q != null) {
            bc bcVar = q;
        }
        if (this.M != null) {
            this.M = null;
        }
        if (this.N != null) {
            this.N.a();
            this.N = null;
        }
        if (this.O != null) {
            this.O = null;
        }
        bl.removeAllElements();
        ck.removeAllElements();
        aP.removeAllElements();
        bH.removeAllElements();
        this.c = false;
        this.e.az = false;
        bt.H = null;
        bt.M = null;
        bt.as = (short) -1;
        bq.s = bq.a;
        bq.c = (short) 0;
        aW[15] = 1;
        System.gc();
    }

    public final void b(byte b2) {
        this.l = (short) 0;
        this.e.aq.b();
        this.e.aq.a(new StringBuffer().append("周围").append((bt.r == null || bt.r.trim().length() <= 0) ? "" : bt.r).toString());
        this.e.aq.a(true);
        if (this.j != 7) {
            this.e.as.a(new String[]{"全部", "空闲", "好友", "队伍"});
            this.e.as.a((byte) 0);
        }
        m(b2);
        this.e.au.a("操作");
        this.e.au.a(true);
        this.e.aq.a(this.e.as);
        this.e.aq.a(this.e.ar);
        if (t.c > 220) {
            this.e.aq.a(this.e.au);
        }
        this.e.aq.a(t.f, t.g, t.d, t.e);
        this.df = null;
        this.e.j = this.e.k;
        this.k = (short) 7;
        this.j = (short) 7;
    }

    public final void b(byte b2, boolean z2) {
        this.ct = b2;
        this.l = (short) 0;
        if (z2) {
            a aVar = this.e;
            int i2 = this.aF;
            aVar.ax = i2;
            this.aE = i2;
        } else {
            this.e.ax = 0;
            this.aV = 0;
            this.aE = 0;
        }
        this.ar = 1;
        this.aU = 1;
        aP();
        this.e.aq.b();
        this.e.au.a(new String[]{"交易", "取消"});
        this.e.aq.a(this.e.au);
        this.e.aq.a(t.f, t.g, t.d, t.e);
        this.e.aq.a(bt.ff);
        this.k = (short) 22;
        this.j = (short) 22;
        a aVar2 = this.e;
        this.e.k = (short) 7;
        aVar2.j = (short) 7;
    }

    public final void b(int i2) {
        int i3;
        int i4 = 1;
        if (i2 == 8 || i2 == 516) {
            if (this.ag > 1) {
                i4 = this.ag - 1;
                this.ag = i4;
            }
            this.ag = i4;
            return;
        }
        if (i2 == 2 || i2 == 518) {
            if (this.ag >= ((int) this.ah)) {
                i3 = (int) this.ah;
            } else {
                i3 = this.ag + 1;
                this.ag = i3;
            }
            this.ag = i3;
            return;
        }
        if (i2 == 514 || i2 == 1) {
            this.ag += 10;
            if (this.ag > ((int) this.ah)) {
                this.ag = (int) this.ah;
                return;
            }
            return;
        }
        if (i2 == 520 || i2 == 4) {
            this.ag -= 10;
            if (this.ag <= 1) {
                this.ag = 1;
            }
        }
    }

    public final void b(String str) {
        byte[] bArrC = bz.c((short) 4123, bt.ad, str, this.k);
        if (bArrC != null) {
            a.i.a(new w((short) 4123, bArrC));
        } else {
            this.e.b("获取上传指令数据错误!");
        }
    }

    public final void b(String str, byte b2) {
        byte[] bArrC = bz.c((short) 4113, bt.ad, str, b2);
        if (bArrC != null) {
            a.i.a(new w((short) 4113, bArrC));
        } else {
            this.e.b("获取上传指令数据错误!");
        }
    }

    public final void b(String str, String str2, int i2, int i3) {
        byte[] bArrA = bz.a((short) 4147, bt.ad, str, str2, i2, i3);
        if (bArrA == null) {
            this.e.b("获取上传指令数据错误!");
        } else {
            a.i.a(new w((short) 4147, bArrA));
        }
    }

    public final void b(Graphics graphics, String str) {
        ca.a(graphics, str, (int) n(), false);
    }

    public final void b(boolean z2) {
        String[] strArr;
        int length = this.cg ? bt.db.length : bt.cR.length;
        if (length >= 0) {
            this.e.aq.b();
            this.e.aq.a("宠物技能");
            if (length > 0) {
                bt.dl = new int[length];
                bt.dm = new String[length];
                bt.dn = new byte[length];
                bt.f1do = new byte[length];
                bt.dp = new byte[length];
                bt.dq = new short[length];
                bt.dr = new short[length];
                bt.ds = new String[length];
                bt.du = new byte[length];
                bt.dt = new String[length];
                for (int i2 = 0; i2 < length; i2++) {
                    bt.dl[i2] = this.cg ? bt.db[i2] : bt.cR[i2];
                    bt.dm[i2] = this.cg ? bt.dc[i2] : bt.cS[i2];
                    bt.dn[i2] = this.cg ? bt.dd[i2] : bt.cT[i2];
                    bt.f1do[i2] = this.cg ? bt.de[i2] : bt.cU[i2];
                    bt.dp[i2] = this.cg ? bt.df[i2] : bt.cV[i2];
                    bt.dq[i2] = this.cg ? bt.dg[i2] : bt.cW[i2];
                    bt.dr[i2] = this.cg ? bt.dh[i2] : bt.cX[i2];
                    bt.ds[i2] = this.cg ? bt.di[i2] : bt.cY[i2];
                    bt.du[i2] = this.cg ? bt.dj[i2] : bt.cZ[i2];
                    bt.dt[i2] = this.cg ? bt.dk[i2] : bt.da[i2];
                }
            } else {
                bt.p();
            }
            c cVar = this.e.ar;
            Image[] imageArrB = b(bt.dr);
            String[] strArr2 = bt.dm;
            byte[] bArr = bt.du;
            if (bArr != null) {
                String[] strArr3 = new String[strArr2.length];
                for (int i3 = 0; i3 < strArr2.length; i3++) {
                    if (bArr[i3] == 1) {
                        strArr3[i3] = new StringBuffer().append(strArr2[i3]).append(" ★").toString();
                    } else {
                        strArr3[i3] = strArr2[i3];
                    }
                }
                strArr = strArr3;
            } else {
                strArr = null;
            }
            cVar.a(imageArrB, strArr, (String[]) null, d(bt.dq));
            if (this.k == 36) {
                this.e.ar.a(this.aq, this.ar);
            } else {
                this.aq = 0;
                this.ar = 0;
            }
            if (bt.dl == null) {
                this.e.ar.a("没有技能,按3、9键可以上下翻滚此属性描述框", 2);
            } else {
                this.e.ar.a(bt.ds[this.e.ar.g()], 2);
            }
            if (!z2) {
                this.e.at.a("".equals(bt.dt[this.e.ar.g()]) ? "<0>当前已经最高等级" : bt.dt[this.e.ar.g()], t.i, (byte) 1);
                this.e.at.a((byte) 1);
                this.e.aq.a(this.e.at);
            }
            this.e.aq.a(this.e.ar);
            this.e.aq.a(t.f, t.g, t.d, t.e);
        }
    }

    public final int c(int i2, int i3) {
        if (this.bV != null) {
            for (int i4 = 0; i4 < this.bV.length; i4++) {
                if (i2 >= this.bV[i4][0] && i2 <= this.bV[i4][0] + this.bV[i4][2] && i3 >= this.bV[i4][1] && i3 <= this.bV[i4][1] + this.bV[i4][3]) {
                    if (this.aq != i4) {
                        this.aq = i4;
                        ca.l = 0;
                        return 0;
                    }
                    if (this.aq == i4) {
                        return 268435456;
                    }
                }
            }
        }
        if (this.bW != null) {
            return (i2 < this.bW[0] || i2 > this.bW[0] + this.bW[2] || i3 < this.bW[1] || i3 > this.bW[1] + this.bW[3]) ? 536870912 : 0;
        }
        return 0;
    }

    public final void c() {
        ai.a(bn, this.e.ak);
        P();
        if (this.cM) {
            aR();
            this.cM = false;
        }
        if (bt.g && System.currentTimeMillis() - bt.e >= 180000) {
            bt.h = (byte) 3;
        }
        if (!bt.g && System.currentTimeMillis() - bt.f > 60000) {
            bt.g = true;
            byte[] bArrA = bz.a((short) 4630);
            if (this.e != null) {
                if (a.i != null) {
                    a.i.a(new w((short) 4630, bArrA));
                } else {
                    this.e.b("获取上传指令数据错误!");
                }
            }
        }
        this.aX = false;
        if ((bt.bs == 0 && bt.s == 0) || bt.bu || !i()) {
            this.cK = -2;
        } else {
            this.cK = this.I.a(this.e);
        }
        if (this.cK < 0 || !this.I.e()) {
            if (this.e.ak - this.bt >= 4700) {
                if (!bt.a) {
                    a.i.a(new w((short) 4641, bz.d((short) 4641, bt.ad)));
                }
                this.bt = this.e.ak;
                if (this.aX) {
                    return;
                }
                byte[] bArrA2 = bz.a((short) 4101, bt.ad, (int) this.I.j, (int) this.I.k, this.k);
                if (this.e != null) {
                    if (a.i != null) {
                        a.i.a(new w((short) 4101, bArrA2));
                        return;
                    } else {
                        this.e.b("获取上传指令数据错误!");
                        return;
                    }
                }
                return;
            }
            return;
        }
        this.e.b = 0;
        ac acVar = this.I;
        this.I.b = (short) 0;
        acVar.a = (short) 0;
        if (bt.bs == 1 && bt.s == 0 && this.e.ak - this.aY < 5000) {
            if (!this.cJ) {
                this.cJ = this.cJ ? false : true;
                this.e.b("组队时的传送间隔为5秒!");
            }
        } else {
            if (this.k == 25) {
                return;
            }
            byte[] bArrA3 = bz.a((short) 4144, bt.ad, (int) bt.ab[this.cK], (int) bt.ac[this.cK], this.k, MainMidlet.c);
            if (bArrA3 != null) {
                a.i.a(new w((short) 4144, bArrA3));
            } else {
                this.e.b("获取上传指令数据错误!");
            }
            this.aX = true;
            this.cJ = false;
            this.aY = this.e.ak;
            this.e.a((String) null);
        }
        this.I.d();
    }

    public final void c(byte b2) {
        K = new bw(bt.lw, (short) (t.b - bt.ly));
        ca.a((az) null, K, bt.lz, (String[]) null, bt.lx);
        ca.h = 0;
        this.e.j = this.e.k;
        this.e.a = 0;
        this.e.b = 0;
        this.k = (short) 72;
        this.as = 0;
    }

    public final void c(int i2) {
        this.bC = t.b <= 240 ? 3 : 4;
        this.bD = 12 / this.bC;
        if (i2 >= this.bA.length || i2 < 0) {
            i2 = this.bB;
        }
        this.bB = i2;
    }

    public final void c(int i2, int i3, int i4) {
        if (i3 > bt.fA.length - 1) {
            i4 = 0;
            i3 = 0;
        }
        j(0);
        this.e.at.a(bt.fA == null ? "" : bt.e(this.e.l, i3), t.i, (byte) 2);
        this.e.at.a((byte) 1);
        if (bt.fE != null) {
            a(bt.fE[i3], bt.fF[i3], bt.fG[i3], bt.fH[i3]);
            this.aI = a.ah.a(String.valueOf(new StringBuffer().append((int) bt.fE[i3]).append("_0").toString()), bt.fF[i3], bt.fG[i3], bt.fH[i3]);
        }
        this.k = (short) 13;
        this.j = (short) 13;
        this.e.ar.a(i4, i3);
    }

    public final void c(String str) {
        ce ceVar = new ce("系统", (byte) 5, str, (byte) 0);
        ck.insertElementAt(ceVar, 0);
        a(ceVar);
    }

    public final void c(short s2) {
        this.bb = s2;
        this.l = (short) 0;
        this.e.aq.b();
        this.e.aq.a(ca.a(bt.kH[bt.kN]) == -1 ? bt.kH[bt.kN] : bt.kH[bt.kN].substring(3, bt.kH[bt.kN].length()));
        this.e.ar.a((Image[]) null, bt.kK, (String[]) null, (String[]) null);
        this.e.au.a("兑换");
        if (bt.kJ == null || bt.kJ.length <= 0) {
            this.e.at.a((String) null, t.i, (byte) 2);
        } else {
            this.e.at.a(aA(0), t.i, (byte) 2);
        }
        this.e.at.a((byte) 1);
        this.e.aq.a(this.e.ar);
        this.e.aq.a(this.e.at);
        if (t.c > 220) {
            this.e.aq.a(this.e.au);
        }
        this.e.aq.a(t.f, t.g, t.d, t.e);
        this.e.j = this.e.k;
        this.k = (short) 69;
        this.j = (short) 69;
    }

    public final void c(boolean z2) {
        this.bV = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 6, 4);
        this.aq = this.cj;
        if (bt.jH != null) {
            for (byte b2 = 0; b2 < bt.jH.length; b2 = (byte) (b2 + 1)) {
                a(bt.jM[b2]);
            }
        }
        this.e.j = this.e.k;
        a.f.a(this.f, h, i, false, true, 1009050);
        this.k = (short) 13;
        this.j = (short) 13;
        this.l = (short) 7;
        ca.l = 0;
    }

    public final int d(int i2, int i3) {
        if (this.cz != null) {
            for (int i4 = 0; i4 < this.cz.length; i4++) {
                if (i2 >= this.cz[i4][0] && i2 <= this.cz[i4][0] + this.cz[i4][2] && i3 >= this.cz[i4][1] && i3 <= this.cz[i4][1] + this.cz[i4][3]) {
                    byte b2 = (byte) (i4 % 6);
                    byte b3 = (byte) (i4 / 6);
                    if (b2 == this.aq && b3 == this.ar) {
                        return 268435456;
                    }
                    this.aq = b2;
                    this.ar = (byte) (b3 - 1);
                    return 4;
                }
            }
        }
        return (i2 < this.aB || i2 > this.aB + C.b || i3 < this.aC || i3 > this.aC + C.c) ? 536870912 : 0;
    }

    public final int d(int i2, int i3, int i4) {
        if (this.cs != null) {
            if (i3 >= this.cs[0][0] && i3 <= this.cs[0][0] + this.cs[0][2] && i4 >= this.cs[0][1] && i4 <= this.cs[0][1] + this.cs[0][3]) {
                return 1;
            }
            if (i3 >= this.cs[1][0] && i3 <= this.cs[1][0] + this.cs[1][2] && i4 >= this.cs[1][1] && i4 <= this.cs[1][1] + this.cs[1][3]) {
                return 4;
            }
        }
        if (this.cr == null) {
            return i2;
        }
        for (int i5 = 0; i5 < this.cr.length; i5++) {
            if (i3 >= this.cr[i5][0] && i3 <= this.cr[i5][0] + this.cr[i5][2] && i4 >= this.cr[i5][1] && i4 <= this.cr[i5][1] + this.cr[i5][3]) {
                if (ca.w == i5) {
                    return 1073741824;
                }
                ca.w = i5 - 1;
                return 4;
            }
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 745
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ao.d():void");
    }

    public final void d(byte b2) {
        if (bt.R != null) {
            this.e.b(bt.R);
            return;
        }
        this.l = (short) 0;
        this.e.aq.b();
        this.e.aq.a("邮件服务");
        this.e.aq.a(true);
        this.e.as.a(new String[]{"我的邮件", "系统邮件"});
        this.e.as.a((byte) 0);
        this.e.as.a = b2;
        if (b2 == 0) {
            if (bt.O.g == null) {
                bt.O.c();
            }
            this.e.ar.a(bt.O.k, bt.O.g, bt.O.h, bt.O.i);
            this.e.ar.a(bt.O.l);
            this.e.ar.b(false);
            this.e.ar.a((String) null, 1);
            this.e.at.a(bt.O.j[Math.min(this.e.ar.g(), bt.O.j.length)], t.i, (byte) 1);
            this.e.aq.a(this.e.as);
            this.e.aq.a(this.e.ar);
            this.e.aq.a(this.e.at);
            this.e.aq.a(t.f, t.g, t.d, t.e, 50, 100, false);
        } else {
            if (bt.P.d == null) {
                bt.P.d();
            }
            this.e.ar.a(bt.P.g, bt.P.d, bt.P.e, bt.P.f);
            this.e.ar.a(bt.P.h);
            this.e.ar.b(false);
            this.e.ar.a((String) null, 1);
            this.e.aq.a(this.e.as);
            this.e.aq.a(this.e.ar);
            this.e.aq.a(t.f, t.g, t.d, t.e, 0, 0, false);
        }
        this.e.j = this.e.k;
        this.j = this.k;
        this.k = (short) 76;
        this.as = b2;
    }

    public final void d(int i2) {
        if (i2 == 8 && this.ak.length() > 0) {
            this.ak.deleteCharAt(this.ak.length() - 1);
        }
        if (this.ak.length() < 9) {
            if (this.ak.length() == 0 && i2 == 48) {
                return;
            }
            switch (i2) {
                case 48:
                    this.ak.append('0');
                    break;
                case 513:
                    this.ak.append('1');
                    break;
                case 514:
                    this.ak.append('2');
                    break;
                case 515:
                    this.ak.append('3');
                    break;
                case 516:
                    this.ak.append('4');
                    break;
                case 517:
                    this.ak.append('5');
                    break;
                case 518:
                    this.ak.append('6');
                    break;
                case 519:
                    this.ak.append('7');
                    break;
                case 520:
                    this.ak.append('8');
                    break;
                case 521:
                    this.ak.append('9');
                    break;
            }
        }
    }

    public final void d(String str) {
        this.e.aq.j();
        this.e.aq.a("详细信息");
        this.e.aq.a(false);
        this.e.at.a(str, t.i, (byte) 2);
        this.e.au.a("确定");
        this.e.aq.a(this.e.at);
        this.e.aq.a(this.e.au);
        this.e.aq.a(t.f, t.g, t.d, t.e);
        this.k = (short) 40;
        this.e.j = this.e.k;
        this.l = (short) 1;
    }

    public final void d(short s2) {
        this.l = s2;
        this.e.aq.b();
        this.e.aq.a(new StringBuffer().append(bt.lg == 1 ? bt.lf : "帮派").append("的成就").toString());
        this.e.aq.a(true);
        this.e.ar.a((Image[]) null, bt.lb, (String[]) null, bt.lc);
        this.e.at.a(aK(0), t.i, (byte) 1);
        this.e.at.a((byte) 1);
        this.e.au.a("操作");
        this.e.au.a(true);
        this.e.aq.a(this.e.ar);
        this.e.aq.a(this.e.at);
        if (t.c > 220) {
            this.e.aq.a(this.e.au);
        }
        this.e.aq.a(t.f, t.g, t.d, t.e);
        this.e.j = this.e.k;
        this.j = this.k;
        this.k = (short) 104;
    }

    public final void d(boolean z2) {
        String[] strArr;
        String str;
        byte b2;
        if (this.k == 28 || z2) {
            this.al = new String[]{"玩家数量", "聊天记录", "玩家名字", "NPC名字", "队员名字", "弹出信息", "迷你地图", "世界频道", "区域频道", "玩家宠物", "动态NPC", "战斗信息", "界面样式", "组队开关", "交易开关", "自动打怪", "PK开关", "帮派频道", "滚动提示", "任务自动"};
            this.am = new String[aW.length];
            for (byte b3 = 0; b3 < aW.length; b3 = (byte) (b3 + 1)) {
                if (b3 == 0 || !(aW[b3] == 0 || aW[b3] == 1)) {
                    strArr = this.am;
                    str = "";
                    b2 = b3;
                } else if (b3 == 12) {
                    strArr = this.am;
                    str = "<无>";
                    b2 = b3;
                } else {
                    if (b3 == 13 || b3 == 14 || b3 == 15 || b3 == 16 || b3 == 19) {
                        if (b3 == 13) {
                            this.am[b3] = bt.B == 1 ? "<开>" : "<关>";
                        } else if (b3 == 16) {
                            this.am[b3] = bt.D == 1 ? "<开>" : "<关>";
                        } else if (b3 == 14) {
                            this.am[b3] = bt.A == 1 ? "<开>" : "<关>";
                        } else if (b3 == 15) {
                            this.am[b3] = bt.bt ? "<开>" : "<关>";
                        } else if (b3 == 19) {
                            this.am[b3] = bt.E == 1 ? "<开>" : "<关>";
                        }
                    } else if (b3 != 7 && b3 != 8 && b3 != 17) {
                        strArr = this.am;
                        if (aW[b3] == 0) {
                            str = "<开>";
                            b2 = b3;
                        } else {
                            str = "<关>";
                            b2 = b3;
                        }
                    } else if (b3 == 7) {
                        this.am[b3] = bt.C[0] == 0 ? "<开>" : "<关>";
                    } else if (b3 == 8) {
                        this.am[b3] = bt.C[1] == 0 ? "<开>" : "<关>";
                    } else if (b3 == 17) {
                        this.am[b3] = bt.C[3] == 0 ? "<开>" : "<关>";
                    }
                }
                strArr[b2] = str;
            }
            this.e.ar.a((Image[]) null, this.al, (String[]) null, this.am);
            this.e.ar.a(this.aA, this.cA);
        }
    }

    public final int e(int i2, int i3) {
        for (int i4 = 0; i4 < this.cF.length - 2; i4++) {
            if (i2 >= this.cF[i4][0] && i2 <= this.cF[i4][0] + this.cF[i4][2] && i3 >= this.cF[i4][1] && i3 <= this.cF[i4][1] + this.cF[i4][3]) {
                if (this.az == i4) {
                    return 1073741824;
                }
                this.az = (byte) (i4 - 1);
                return 2;
            }
        }
        return (i2 <= this.cG[0] || i2 >= this.cG[0] + this.cG[2] || i3 <= this.cG[1] || i3 >= this.cG[1] + this.cG[3]) ? 536870912 : 0;
    }

    public final int e(int i2, int i3, int i4) {
        if (this.cv != null) {
            for (int i5 = 0; i5 < this.cv.length; i5++) {
                if (i3 >= this.cv[i5][0] && i3 <= this.cv[i5][0] + this.cv[i5][2] && i4 >= this.cv[i5][1] && i4 <= this.cv[i5][1] + this.cv[i5][3]) {
                    if (this.e.ax != i5) {
                        this.ar = 0;
                        this.e.ax = i5;
                        this.aE = i5;
                        ca.l = 0;
                        return 0;
                    }
                    if (this.e.ax == i5 && this.ar == 0) {
                        return 1073741824;
                    }
                    this.ar = 0;
                    this.aE = this.e.ax;
                }
            }
        }
        if (this.cw != null) {
            for (int i6 = 0; i6 < this.cw.length; i6++) {
                if (i3 >= this.cw[i6][0] && i3 <= this.cw[i6][0] + this.cw[i6][2] && i4 >= this.cw[i6][1] && i4 <= this.cw[i6][1] + this.cw[i6][3]) {
                    if (this.e.ax != i6) {
                        this.ar = 1;
                        this.e.ax = i6;
                        this.aE = i6;
                        ca.l = 0;
                        return 0;
                    }
                    if (this.e.ax == i6 && this.ar == 1) {
                        return 1073741824;
                    }
                    this.aE = this.e.ax;
                }
            }
        }
        if (this.cx != null) {
            if (i3 >= this.cx[0][0] && i3 <= this.cx[0][0] + this.cx[0][2] && i4 >= this.cx[0][1] && i4 <= this.cx[0][1] + this.cx[0][3]) {
                return 1024;
            }
            if (i3 >= this.cx[1][0] && i3 <= this.cx[1][0] + this.cx[1][2] && i4 >= this.cx[1][1] && i4 <= this.cx[1][1] + this.cx[1][3]) {
                return 2048;
            }
        }
        return i2;
    }

    public final void e() {
        this.e.p = true;
        this.d = (byte) -1;
        aU();
        this.e.h();
        if (this.k != 25) {
            this.e.b();
            if (bt.aw == 1) {
                bt.d();
                bt.aw = (byte) 0;
            }
            ar();
            this.e.b();
            ao();
            this.e.b();
            U();
            this.e.b();
            this.I.a(bt.at, bt.au);
            ap();
            this.e.b();
            as();
            this.e.b();
            a.f.a(g(), h(), t.b, t.c);
            this.e.b();
            a.f.a(this.f, h, i, true, false, 1009050);
            this.e.b();
            bm.removeAllElements();
            bt.p.removeAllElements();
            bt.o = null;
            bt.E();
            this.aO.removeAllElements();
            bl.removeAllElements();
            this.M.s = h;
            this.M.t = i;
            this.m = (short) 0;
            this.l = (short) 0;
            this.e.a = 0;
            this.e.b = 0;
            N();
            a aVar = this.e;
            this.e.k = (short) 7;
            aVar.j = (short) 7;
        }
        this.e.p = false;
    }

    public final void e(byte b2) {
        int i2;
        int i3;
        if (bt.lF == null) {
            return;
        }
        this.l = (short) 0;
        this.e.aq.b();
        this.e.aq.a(bt.lF);
        this.e.aq.a(true);
        this.e.as.a(bt.lJ);
        this.e.as.a((byte) 0);
        this.e.as.a = b2;
        switch (b2) {
            case 0:
                boolean z2 = (bt.lK == null && bt.lL == null && bt.lM == null) ? false : true;
                boolean z3 = bt.lN != null;
                if (z2) {
                    this.e.ar.a((Image[]) null, bt.lK, bt.lL, bt.lM);
                    this.e.ar.a(bt.lR);
                    this.e.ar.b(false);
                }
                if (bt.lO != null) {
                    this.e.ar.a(bt.lO[this.e.ar.g()], 1);
                }
                if (z3) {
                    this.e.at.a(bt.lN[bt.lN.length == 1 ? 0 : this.e.ar.g()], t.i, (byte) 1);
                    if (z2) {
                        this.e.at.a((byte) 1);
                    }
                }
                this.e.aq.a(this.e.as);
                if (z2) {
                    this.e.aq.a(this.e.ar);
                }
                if (z3) {
                    this.e.aq.a(this.e.at);
                }
                m mVar = this.e.aq;
                short s2 = t.f;
                short s3 = t.g;
                short s4 = t.d;
                short s5 = t.e;
                i2 = bt.lG != null ? bt.lG[b2] : 66;
                i3 = bt.lH != null ? bt.lH[b2] : 100;
                if (bt.lI != null && bt.lI[b2] == 1) {
                    z = true;
                }
                mVar.a(s2, s3, s4, s5, i2, i3, z);
                break;
            case 1:
                boolean z4 = (bt.lS == null && bt.lT == null && bt.lU == null) ? false : true;
                boolean z5 = bt.lV != null;
                if (z4) {
                    this.e.ar.a((Image[]) null, bt.lS, bt.lT, bt.lU);
                    this.e.ar.a(bt.lZ);
                    this.e.ar.b(false);
                }
                if (z5) {
                    this.e.at.a(bt.lV[bt.lV.length == 1 ? 0 : this.e.ar.g()], t.i, (byte) 1);
                    if (z4) {
                        this.e.at.a((byte) 1);
                    }
                }
                if (bt.lW != null) {
                    this.e.ar.a(bt.lW[this.e.ar.g()], 1);
                }
                this.e.aq.a(this.e.as);
                if (z5) {
                    this.e.aq.a(this.e.at);
                }
                if (z4) {
                    this.e.aq.a(this.e.ar);
                }
                this.e.aq.a(t.f, t.g, t.d, t.e, bt.lG != null ? bt.lG[b2] : 66, bt.lH != null ? bt.lH[b2] : 100, bt.lI == null || bt.lI[b2] == 1);
                break;
            case 2:
                boolean z6 = (bt.ma == null && bt.mb == null && bt.mc == null) ? false : true;
                boolean z7 = bt.md != null;
                if (z6) {
                    this.e.ar.a((Image[]) null, bt.ma, bt.mb, bt.mc);
                    this.e.ar.a(bt.mh);
                    this.e.ar.b(false);
                }
                if (bt.me != null) {
                    this.e.ar.a(bt.me[this.e.ar.g()], 1);
                }
                if (z7) {
                    this.e.at.a(bt.md[bt.md.length == 1 ? 0 : this.e.ar.g()], t.i, (byte) 1);
                    if (z6) {
                        this.e.at.a((byte) 1);
                    }
                }
                this.e.aq.a(this.e.as);
                if (z6) {
                    this.e.aq.a(this.e.ar);
                }
                if (z7) {
                    this.e.aq.a(this.e.at);
                }
                m mVar2 = this.e.aq;
                short s6 = t.f;
                short s7 = t.g;
                short s8 = t.d;
                short s9 = t.e;
                i2 = bt.lG != null ? bt.lG[b2] : 66;
                i3 = bt.lH != null ? bt.lH[b2] : 100;
                if (bt.lI != null && bt.lI[b2] == 1) {
                    z = true;
                }
                mVar2.a(s6, s7, s8, s9, i2, i3, z);
                break;
        }
        this.e.j = this.e.k;
        this.k = (short) 71;
        this.as = b2;
    }

    public final void e(int i2) {
        this.l = (short) 0;
        this.e.aw = 0;
        this.as = i2;
        if (this.as >= t.L.length) {
            this.as = 0;
        }
        this.bS = false;
        if (this.j == 9) {
            this.aq = this.aF;
            this.ar = this.aG;
        } else if (this.j != 4) {
            this.ar = 0;
            this.aq = 0;
        }
        ca.l = 0;
        this.e.aq.b();
        this.e.aq.a("");
        this.e.aq.a(true);
        this.e.as.a(new String[]{" 一 ", " 二 ", " 三 ", " 四 ", " 五 "});
        this.e.as.a = this.aH;
        this.e.as.a((byte) 1);
        this.e.aq.a(t.e <= 240 ? 79 : 120);
        bn bnVarY = y(0);
        if (bnVarY == null || ((this.as == 4 || this.as == 15 || this.as == 16 || this.as == 20) && bnVarY.g - bnVarY.v <= 0)) {
            this.e.at.a("没有物品,按3、9键可以上下翻滚此属性描述框", t.i, (byte) 1);
        } else {
            q();
        }
        this.e.au.a("");
        if (this.as == 0) {
            this.am = new String[]{"使用", "查看", "丢弃", "设置", "整理"};
        } else if (this.as == 18) {
            this.e.au.a("操作");
            this.e.au.a(true);
        } else if (this.as == 5 || this.as == 8) {
            this.bR = 0L;
            this.ag = 1;
        }
        this.e.at.a((byte) 1);
        this.e.aq.a(this.e.as);
        this.e.aq.a(this.e.at);
        this.e.aq.a(this.e.au);
        this.e.aq.a(t.f, t.g, t.d, t.e);
        this.e.j = this.e.k;
        this.k = (short) 4;
        this.j = (short) 4;
    }

    public final void e(short s2) {
        this.l = s2;
        this.T.b();
        this.T.a(bt.lh);
        this.T.a(true);
        this.bu.a((Image[]) null, bt.li, (String[]) null, bt.lj);
        this.bu.a(bt.ln);
        this.bv.a(bt.lk[0], t.i, (byte) 1);
        this.bv.a((byte) 1);
        this.bw.a("操作");
        this.bw.a(true);
        this.T.a(this.bu);
        this.T.a(this.bv);
        if (t.c > 220) {
            this.T.a(this.bw);
        }
        this.T.a(t.f, t.g, t.d, t.e);
        this.e.j = this.e.k;
        this.j = this.k;
        this.k = (short) 105;
    }

    public final void e(boolean z2) {
        String strF;
        if (z2) {
            bt.T();
            bt.V();
            bt.N();
            this.bf = 0;
            this.be = 0;
            this.bc = new ba(this.e, this, a.f);
        }
        this.bc.a();
        if (bt.fA != null) {
            for (int i2 = 0; i2 < bt.fA.length; i2++) {
                if (bt.mx == bt.fA[i2]) {
                    strF = bt.f(this.e.l, i2);
                    break;
                }
            }
            strF = "";
        } else {
            strF = "";
        }
        if (bt.mN == null || bt.mN.equals("")) {
            this.e.at.a(new StringBuffer().append("").append(strF).toString(), t.i, (byte) 2);
        } else {
            this.e.at.a(new StringBuffer().append(bt.mN).append("\t").append(strF).toString(), t.i, (byte) 2);
        }
        if (bt.mx != -1 && bt.my != -1) {
            a(bt.my, bt.mz, bt.mA, bt.mB);
            this.aI = a.ah.a(String.valueOf(new StringBuffer().append((int) bt.my).append("_0").toString()), bt.mz, bt.mA, bt.mB);
        } else if (this.aI != null) {
            this.aI.a();
            this.aI = null;
        }
        if (bt.mD != -1 && bt.mE != -1) {
            a(bt.mE, bt.mF, bt.mG, bt.mH);
            this.bd = a.ah.a(String.valueOf(new StringBuffer().append((int) bt.mE).append("_0").toString()), bt.mF, bt.mG, bt.mH);
        } else if (this.bd != null) {
            this.bd.a();
            this.bd = null;
        }
        this.bj.removeAllElements();
        if (bt.mK != null) {
            for (int i3 = 0; i3 < 3; i3++) {
                if (bt.mK[i3] != -1) {
                    this.bj.addElement(String.valueOf((int) bt.mK[i3]));
                }
            }
        }
        if (this.bj.size() > 0) {
            a.af.b(this.bj, (short[]) null, (short[]) null, (short[]) null);
        }
        ak();
        ca.l = 0;
        this.l = (short) 0;
        a aVar = this.e;
        this.e.k = (short) 7;
        aVar.j = (short) 7;
        this.k = (short) 119;
        this.j = (short) 119;
    }

    public final int f(int i2, int i3) {
        return (i2 < this.e.aq.a + 68 || i2 > (this.e.aq.a + this.e.aq.c) + (-12) || i3 < (this.e.aq.b + 30) + (this.bQ / 2) || i3 >= ((this.e.aq.b + 30) + (this.bQ / 2)) + t.j) ? 0 : 268435456;
    }

    public final int f(int i2, int i3, int i4) {
        if (this.cB != null && this.cC != null && this.cB.length > i2 && this.cC.length > i2) {
            if (i3 >= this.cB[i2][0] && i3 <= this.cB[i2][0] + this.cB[i2][2] && i4 >= this.cB[i2][1] && i4 <= this.cB[i2][1] + this.cB[i2][3]) {
                return 8;
            }
            if (i3 >= this.cC[i2][0] && i3 <= this.cC[i2][0] + this.cC[i2][2] && i4 >= this.cC[i2][1] && i4 <= this.cC[i2][1] + this.cC[i2][3]) {
                return 2;
            }
        }
        return 0;
    }

    public final void f() {
        this.e.p = true;
        this.m = (short) 0;
        this.l = (short) 0;
        this.e.a = 0;
        this.e.b = 0;
        this.aO.removeAllElements();
        bl.removeAllElements();
        if (bt.t != null) {
            for (int i2 = 0; i2 < bt.t.length; i2++) {
                if (bt.t[i2] != null) {
                    bt.t[i2].x = false;
                }
            }
        }
        U();
        ap();
        a.f.a(g(), h(), t.b, t.c);
        as();
        a aVar = this.e;
        this.e.k = (short) 7;
        aVar.j = (short) 7;
        this.k = (short) 0;
        this.j = (short) 0;
        this.e.p = false;
    }

    public final void f(byte b2) {
        this.c = true;
        this.e.p = true;
        if (this.bA != null) {
            for (int i2 = 0; i2 < this.bA.length; i2++) {
                this.bA[i2] = null;
                this.bE[i2] = null;
            }
            this.bA = null;
            this.bE = null;
        }
        this.e.b();
        if (b2 == 2 || b2 == 1) {
            this.e.q.setCurrent(this.e);
        }
        aT();
        this.e.b();
        this.g = new bq(this.e, this, b2);
        this.e.b();
        if (bt.bu && ab.b) {
            if (!bt.bt) {
                O();
            }
            ab.b = false;
        }
        this.e.b();
        a.f.a(this.f, h, i, false);
        this.k = (short) 25;
        this.j = (short) 25;
        a aVar = this.e;
        this.e.k = (short) 7;
        aVar.j = (short) 7;
        this.e.p = false;
        byte[] bArrZ = bz.z((short) 4223, bt.ad);
        if (bArrZ != null) {
            a.i.a(new w((short) 4659, bArrZ));
        }
    }

    public final void f(int i2) {
        byte[] bArrA = bz.a((short) 4104, bt.ad, z((this.ar << 3) + this.aq), (byte) i2);
        if (bArrA == null) {
            this.e.b("获取上传指令数据错误!");
            return;
        }
        a.i.a(new w((short) 4104, bArrA));
        this.e.a((String) null);
    }

    public final int g(int i2, int i3) {
        int iB = this.e.aq.b(i2, i3);
        if (iB <= 0) {
            iB = this.di.b(i2, i3);
        }
        if (iB <= 0) {
            iB = this.dj.b(i2, i3);
        }
        if (iB <= 0) {
            if (t.b > 300) {
                if (i2 > this.dm - 170 && i2 < this.dm - 20 && i3 > this.dn - 80 && i3 < this.dn + 80) {
                    return 8;
                }
                if (i2 > this.dm + 20 && i2 < this.dm + 170 && i3 > this.dn - 80 && i3 < this.dn + 80) {
                    return 2;
                }
            } else {
                if (i2 > this.dm - 120 && i2 < this.dm - 20 && i3 > this.dn - 50 && i3 < this.dn + 50) {
                    return 8;
                }
                if (i2 > this.dm + 20 && i2 < this.dm + 120 && i3 > this.dn - 50 && i3 < this.dn + 50) {
                    return 2;
                }
            }
        }
        return iB;
    }

    public final short g() {
        if (this.f.a < t.b) {
            return (short) ((t.b - this.f.a) / 2);
        }
        return (short) 0;
    }

    public final void g(byte b2) {
        byte[] bArrF = bz.f((short) 4125, bt.ad, b2);
        if (bArrF != null) {
            a.i.a(new w((short) 4125, bArrF));
        } else {
            this.e.b("获取上传指令数据错误!");
        }
    }

    public final void g(int i2) {
        if (this.m == 1) {
            this.T.b(i2);
            return;
        }
        if (this.m == 0) {
            ai.a(q, this.e.ak);
            if (i2 == 8 || i2 == 516) {
                this.aq = this.aq + (-1) < 0 ? this.bY.length - 1 : this.aq - 1;
                ca.l = 0;
                return;
            }
            if (i2 == 2 || i2 == 518) {
                this.aq = this.aq + 1 > this.bY.length + (-1) ? 0 : this.aq + 1;
                ca.l = 0;
                return;
            }
            if (i2 == 1073741824 || i2 == 268435456 || i2 == 517) {
                this.T.j();
                this.T.a("装备属性");
                this.T.a(true);
                an anVar = new an();
                anVar.a(a(this.aq, true), t.i, (byte) 2);
                this.T.a(30);
                this.T.a(anVar);
                this.T.a(t.f, t.g, t.d, t.e);
                this.m = (short) 1;
            }
        }
    }

    public final int h(int i2, int i3) {
        this.du = false;
        int iB = this.e.aq.b(i2, i3);
        if (iB <= 0) {
            for (int i4 = 0; i4 < 4; i4++) {
                if (i2 > ((this.ds + (this.e.at.d / 2)) - 80) + (i4 * 40) && i2 < ((this.ds + (this.e.at.d / 2)) - 80) + (i4 * 40) + 17 && i3 > (this.dt + (this.e.at.e >> 1)) - 24 && i3 < ((this.dt + (this.e.at.e >> 1)) - 24) + 17) {
                    this.aq = i4;
                    ca.l = 0;
                    this.du = true;
                    return 0;
                }
            }
        }
        return iB;
    }

    public final short h() {
        if (this.f.b < t.c) {
            return (short) ((t.c - this.f.b) / 2);
        }
        return (short) 0;
    }

    public final void h(byte b2) {
        byte[] bArrA = bz.a((short) 4195, bt.ad, b2, this.I.j, this.I.k);
        if (bArrA == null) {
            this.e.b("获取上传指令数据错误!");
            return;
        }
        a.i.a(new w((short) 4195, bArrA));
        this.e.a((String) null);
    }

    public final void h(int i2) {
        this.as = i2;
        this.l = (short) 0;
        a((byte) 1, false);
        this.e.j = this.e.k;
        this.k = (short) 12;
        this.j = (short) 12;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(byte r9) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ao.i(byte):void");
    }

    public final void i(int i2) {
        String[] strArr;
        this.l = (short) 0;
        this.e.aq.b();
        this.e.aq.a("升级技能");
        this.e.aq.a(true);
        this.e.as.a(new String[]{"武功"});
        c cVar = this.e.ar;
        Image[] imageArrB = b(bt.dH);
        String[] strArr2 = bt.dF;
        short[] sArr = bt.dG;
        if (sArr != null) {
            String[] strArr3 = new String[sArr.length];
            for (int i3 = 0; i3 < sArr.length; i3++) {
                strArr3[i3] = new StringBuffer().append("").append((int) sArr[i3]).append("级").toString();
            }
            strArr = strArr3;
        } else {
            strArr = null;
        }
        cVar.a(imageArrB, strArr2, strArr, (String[]) null);
        if (bt.dI != null && bt.dI.length > 0) {
            this.e.ar.a(bt.dI[i2], 2);
        }
        this.e.ar.a(i2);
        this.e.au.a("升级");
        this.e.aq.a(this.e.as);
        this.e.aq.a(this.e.ar);
        if (t.c > 220) {
            this.e.aq.a(this.e.au);
        }
        this.e.aq.a(t.f, t.g, t.d, t.e);
        this.k = (short) 29;
        this.j = (short) 29;
    }

    public final void j() {
        this.bF = new int[4];
        a(new String[]{"人物", "商城", "道具", "任务", "帮派", "住宅", "坐骑", "宠物", "功能", "社交", "系统"});
    }

    public final void j(byte b2) {
        this.as = b2;
        if (bt.hL == null || bt.hL.length <= 0) {
            this.e.at.b("没有建筑材料，按3、9键可以上下翻滚此属性描述框", t.i, (byte) 1);
        } else {
            this.e.at.b(au(0), t.i, (byte) 1);
        }
        this.e.at.a((byte) 1);
        this.e.ar.a((Image[]) null, (this.as == 0 || this.as == 2 || this.as == 4 || this.as == 6) ? bt.hM : (this.as == 1 || this.as == 3 || this.as == 5) ? bt.hQ : null, (String[]) null, (String[]) null);
        if (this.aZ == 8 || this.aZ == 7 || this.aZ == 9 || this.aZ == 10) {
            this.e.aq.a(this.e.at);
            this.e.aq.a(t.f, t.g, t.d, t.e);
        }
    }

    public final void j(int i2) {
        this.l = (short) 0;
        this.as = i2;
        this.bR = 0L;
        this.e.aq.b();
        this.e.aq.a("宠物列表");
        if (this.as == 4 || this.as == 10 || this.as == 11) {
            if (bt.fw == null || bt.fw.length <= 0) {
                this.e.ar.a((Image[]) null, (String[]) null, (String[]) null, (String[]) null);
                this.e.at.a((String) null, t.i, (byte) 2);
                this.aI = null;
            } else {
                int i3 = bt.fw[0];
                this.am = new String[bt.fw.length];
                this.al = new String[bt.fw.length];
                this.bK = new String[bt.fw.length];
                for (int i4 = 0; i4 < bt.fw.length; i4++) {
                    this.am[i4] = new StringBuffer().append(bt.fB[bt.fw[i4]]).append("(").append((int) bt.ge[bt.fw[i4]]).append("灵)").toString();
                    this.al[i4] = new StringBuffer().append((int) bt.fD[bt.fw[i4]]).append("级").toString();
                    this.bK[i4] = bt.fz[bt.fw[i4]] == 0 ? "休息" : "出战";
                }
                this.e.ar.a((Image[]) null, this.am, this.al, this.bK);
                this.e.at.a(bt.e(this.e.l, i3), t.i, (byte) 2);
                if (bt.fE != null) {
                    a(bt.fE[i3], bt.fF[i3], bt.fG[i3], bt.fH[i3]);
                    this.aI = a.ah.a(String.valueOf(new StringBuffer().append((int) bt.fE[i3]).append("_0").toString()), bt.fF[i3], bt.fG[i3], bt.fH[i3]);
                }
            }
            this.e.at.a((byte) 1);
        } else {
            if (bt.fA == null || bt.fA.length <= 0) {
                this.e.ar.a((Image[]) null, (String[]) null, (String[]) null, (String[]) null);
            } else {
                this.am = new String[bt.fA.length];
                for (int i5 = 0; i5 < bt.fA.length; i5++) {
                    this.am[i5] = bt.fz[i5] == 0 ? "休息" : "出战";
                }
                String[] strArr = new String[bt.fB.length];
                for (int i6 = 0; i6 < strArr.length; i6++) {
                    strArr[i6] = new StringBuffer().append(bt.fB[i6]).append("(").append((int) bt.ge[i6]).append("灵)").toString();
                }
                this.e.ar.a((Image[]) null, strArr, e(bt.fD), this.am);
            }
            this.e.at.a(bt.fA == null ? "" : bt.e(this.e.l, 0), t.i, (byte) 2);
            this.e.at.a((byte) 1);
            if (bt.fE != null) {
                a(bt.fE[0], bt.fF[0], bt.fG[0], bt.fH[0]);
                this.aI = a.ah.a(String.valueOf(new StringBuffer().append((int) bt.fE[0]).append("_0").toString()), bt.fF[0], bt.fG[0], bt.fH[0]);
            }
        }
        this.e.au.a("确定");
        this.e.aq.a(this.e.ar);
        this.e.aq.a(this.e.at);
        if (t.c > 220) {
            this.e.aq.a(this.e.au);
        }
        this.e.aq.a(t.f, t.g, t.d, t.e);
        this.k = (short) 13;
        this.j = (short) 13;
    }

    public final void k() {
        a(new String[]{"进入", "查看", "邀请", "任免", "弃帮"});
        c(0);
        this.l = (short) 2;
        a.f.a(this.f, h, i, false, false, 1009050);
        this.k = (short) 1;
        this.j = (short) 1;
    }

    public final void k(byte b2) {
        this.as = b2;
        this.l = (short) 0;
        this.e.aw = 0;
        this.e.ar.a((Image[]) null, bt.hQ, (String[]) null, (String[]) null);
        if (bt.hP == null || bt.hP.length <= 0) {
            this.e.at.b("没有建筑材料，按3、9键可以上下翻滚此属性描述框", t.i, (byte) 1);
        } else {
            this.e.at.b(bt.hR[0], t.i, (byte) 1);
        }
        this.e.at.a((byte) 1);
        if (this.aZ == 7 || this.aZ == 8 || this.aZ == 9 || this.aZ == 10) {
            this.e.aq.a(this.e.at);
            this.e.aq.a(t.f, t.g, t.d, t.e);
        }
        this.e.j = this.e.k;
        this.k = (short) 38;
        this.j = (short) 38;
    }

    public final void k(int i2) {
        this.bL = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 9, 2);
        this.bM = new short[9];
        this.bO = new String[9];
        this.bL[0][0] = bt.fI[i2];
        this.bL[0][1] = bt.fJ[i2];
        this.bL[1][0] = bt.fK[i2];
        this.bL[1][1] = bt.fL[i2];
        this.bL[2][0] = bt.fM[i2];
        this.bL[2][1] = bt.fN[i2];
        this.bL[3][0] = bt.fO[i2];
        this.bL[3][1] = bt.fP[i2];
        this.bL[4][0] = bt.fQ[i2];
        this.bL[4][1] = bt.fR[i2];
        this.bL[5][0] = bt.fS[i2];
        this.bL[5][1] = -1;
        this.bL[6][0] = bt.fT[i2];
        this.bL[6][1] = -1;
        this.bL[7][0] = bt.fU[i2];
        this.bL[7][1] = -1;
        this.bL[8][0] = bt.fV[i2];
        this.bL[8][1] = -1;
        a(bt.fE[i2], bt.fF[i2], bt.fG[i2], bt.fH[i2]);
        this.aI = a.ah.a(new StringBuffer().append(String.valueOf((int) bt.fE[i2])).append("_0").toString(), bt.fF[i2], bt.fG[i2], bt.fH[i2]);
        for (byte b2 = 0; b2 < this.bO.length; b2 = (byte) (b2 + 1)) {
            this.bO[b2] = new StringBuffer().append(this.bL[b2][0]).append(this.bL[b2][1] != -1 ? new StringBuffer().append("/").append(this.bL[b2][1]).toString() : "").toString();
        }
        this.e.aq.b();
        this.e.aq.a("宠物属性分配");
        this.e.aq.a(false);
        this.e.ar.a((Image[]) null, this.bN, (String[]) null, this.bO);
        this.e.aq.f = a.L.c;
        this.e.au.a(new String[]{"确定", "取消"});
        this.e.aq.a(this.e.ar);
        this.e.aq.a(this.e.au);
        this.e.aq.a(t.f, t.g, t.d, t.e);
        this.k = (short) 96;
        this.j = (short) 96;
    }

    public final void l() {
        a(new String[]{"附魔", "升星-装", "洗炼-装", "传送", "升星-宠", "合成"});
        c(0);
        this.l = (short) 19;
        a.f.a(this.f, h, i, false, false, 1009050);
        this.k = (short) 1;
        this.j = (short) 1;
    }

    public final void l(byte b2) {
        this.l = (short) 0;
        this.cZ = b2;
        this.e.aq.b();
        this.e.aq.a("物品拍卖详情");
        if (b2 == 0) {
            if (this.j != 59) {
                this.aV = 0;
                this.e.as.a(new String[]{"拍卖中", "仓库", "记录"});
                this.e.as.a((byte) 0);
            }
            if (bt.jN != null) {
                a(bt.jR);
                this.e.ar.a(b(bt.jR), a(this.e.l, bt.jO, bt.jP), (String[]) null, (String[]) null);
                if (this.j == 64) {
                    this.e.ar.a(this.aA, this.aq);
                }
                this.e.ar.a(bt.h(this.e.l, this.e.ar.g()), 1);
            } else {
                this.e.ar.a((Image[]) null, (String[]) null, (String[]) null, (String[]) null);
            }
            this.e.au.a("下架");
        } else if (b2 == 1) {
            if (bt.ct != null) {
                a(bt.cx);
                this.e.ar.a(b(bt.cx), a(this.e.l, bt.cu, bt.cw), (String[]) null, (String[]) null);
                if (this.j == 64) {
                    this.e.ar.a(this.aA, this.aq);
                }
                this.e.ar.a(bt.a(this.k, this.e.l, this.e.ar.g()), 1);
            } else {
                this.e.ar.a((Image[]) null, (String[]) null, (String[]) null, (String[]) null);
            }
            this.e.au.a("取出");
        } else if (b2 == 2) {
            this.e.at.b(aY(), t.i, (byte) 2);
            this.e.au.a("确定");
        }
        this.e.au.a(true);
        this.e.aq.a(this.e.as);
        if (b2 == 2) {
            this.e.aq.a(this.e.at);
        } else {
            this.e.aq.a(this.e.ar);
        }
        this.e.aq.a(this.e.au);
        this.e.aq.a(t.f, t.g, t.d, t.e);
        this.e.aq.a(true);
        this.e.j = this.e.k;
        this.k = (short) 59;
        this.j = (short) 59;
    }

    public final void m() {
        if (i()) {
            a.F = bt.t[this.af];
            bH.removeAllElements();
            this.by = (byte) 0;
            if (bt.bI != null && bt.bI.length > 0) {
                for (int i2 = 0; i2 < bt.bI.length; i2++) {
                    bH.addElement(new StringBuffer().append(bt.bJ[i2]).append("(").append(t.J[bt.bK[i2] + 1]).append(")").toString());
                }
            }
            if (this.af < bt.t.length) {
                if (bt.t[this.af].q == 1) {
                    bH.addElement(t.I[16]);
                }
                if (bt.t[this.af].f == 1) {
                    bH.addElement(t.I[0]);
                }
                if (bt.t[this.af].g == 1) {
                    bH.addElement(t.I[1]);
                }
                if (bt.t[this.af].h == 1) {
                    bH.addElement(t.I[14]);
                }
                if (bt.t[this.af].i == 1) {
                    bH.addElement(t.I[13]);
                }
                if (bt.t[this.af].j == 1) {
                    bH.addElement(t.I[15]);
                }
                if (bt.t[this.af].j == 2) {
                    bH.addElement(t.I[39]);
                }
                if (bt.t[this.af].l == 1) {
                    bH.addElement(t.I[2]);
                }
                if (bt.t[this.af].k == 1) {
                    bH.addElement(t.I[3]);
                }
                if (bt.t[this.af].m == 1) {
                    bH.addElement(t.I[4]);
                    bH.addElement(t.I[5]);
                    bH.addElement(t.I[6]);
                }
                if (bt.t[this.af].n == 1 || bt.t[this.af].o == 1) {
                    if (bt.t[this.af].n == 1) {
                        bH.addElement(t.I[7]);
                        bH.addElement(t.I[9]);
                        bH.addElement(t.I[10]);
                    }
                    if (bt.t[this.af].o == 1) {
                        bH.addElement(t.I[8]);
                        bH.addElement(t.I[9]);
                        bH.addElement(t.I[10]);
                    }
                }
                if (bt.t[this.af].p == 1) {
                    bH.addElement(t.I[11]);
                }
                if (bt.t[this.af].D == 1) {
                    bH.addElement(t.I[17]);
                }
                if (bt.t[this.af].E == 1) {
                    bH.addElement(t.I[18]);
                }
                if (bt.t[this.af].H == 1) {
                    bH.addElement(t.I[19]);
                }
                if (bt.t[this.af].H == 2) {
                    bH.addElement(t.I[20]);
                    bH.addElement(t.I[21]);
                } else if (bt.t[this.af].H == 3) {
                    bH.addElement(t.I[22]);
                    bH.addElement(t.I[23]);
                }
                if (bt.t[this.af].I == 1) {
                    bH.addElement(t.I[24]);
                }
                if (bt.t[this.af].I == 2) {
                    bH.addElement(t.I[25]);
                }
                if (bt.t[this.af].I == 3) {
                    bH.addElement(t.I[26]);
                }
                if (bt.t[this.af].I == 4) {
                    bH.addElement(t.I[27]);
                }
                if (bt.t[this.af].I == 5) {
                    bH.addElement(t.I[28]);
                }
                if (bt.t[this.af].I == 6) {
                    bH.addElement(t.I[29]);
                    bH.addElement(t.I[32]);
                }
                if (bt.t[this.af].I == 100) {
                    bH.addElement(t.I[33]);
                    bH.addElement(t.I[26]);
                }
                if (bt.t[this.af].F == 1) {
                    bH.addElement(t.I[30]);
                }
                if (bt.t[this.af].G == 1) {
                    bH.addElement(t.I[31]);
                }
                if (bt.t[this.af].J == 1) {
                    bH.addElement(t.I[34]);
                    bH.addElement(t.I[35]);
                    bH.addElement(t.I[36]);
                    bH.addElement(t.I[37]);
                }
                if (bt.t[this.af].r == 1 && bt.t[this.af].s == 0) {
                    bH.addElement(t.I[38]);
                }
                if (bt.t[this.af].r == 1 && bt.t[this.af].s == 1) {
                    bH.addElement(t.I[40]);
                }
                if (bt.t[this.af].K == 1) {
                    bH.addElement(t.I[41]);
                }
                if (bt.t[this.af].L == 1) {
                    bH.addElement(t.I[42]);
                }
                if (bt.t[this.af].M == 1) {
                    bH.addElement(t.I[43]);
                }
                if (bt.t[this.af].Q == 1) {
                    bH.addElement(t.I[44]);
                }
                if (bt.t[this.af].R == 1) {
                    bH.addElement(t.I[45]);
                }
                if (bt.t[this.af].N == 1) {
                    bH.addElement(t.I[46]);
                }
                if (bt.t[this.af].O == 1) {
                    bH.addElement(t.I[47]);
                }
                if (bt.t[this.af].P == 1 && bt.aA != null && bt.aA.indexOf("帮主") != -1) {
                    bH.addElement(t.I[48]);
                }
                if (bt.t[this.af].T == 1) {
                    bH.addElement(t.I[49]);
                }
                if (bt.t[this.af].B != null) {
                    for (int i3 = 0; i3 < bt.t[this.af].B.length; i3++) {
                        bH.addElement(bt.t[this.af].B[i3]);
                    }
                }
            }
            if (a(bH, t.I[7])) {
                this.as = 256;
            } else {
                this.as = 257;
            }
            this.m = (short) 0;
            if (bH.size() > 0) {
                this.am = new String[bH.size()];
                for (int i4 = 0; i4 < bH.size(); i4++) {
                    this.am[i4] = bH.elementAt(i4).toString();
                }
            } else {
                this.am = null;
            }
            K = new bw(bt.bQ, (short) (t.b - 20));
            ca.a(a.F, K, this.am, (String[]) null, true);
            this.e.a = 0;
            this.e.b = 0;
            this.e.j = this.e.k;
            this.k = (short) 2;
            this.j = (short) 2;
        }
    }

    public final void m(int i2) {
        byte[] bArrD = bz.d((short) 4139, bt.ad, z((this.ar << 3) + this.aq), i2);
        if (bArrD == null) {
            this.e.b("获取上传指令数据错误!");
            return;
        }
        a.i.a(new w((short) 4139, bArrD));
        this.e.a((String) null);
    }

    public final long n() {
        if (this.ak.toString().equals("") || this.ak.toString().length() == 0 || this.ak.toString().substring(0, 1).equals("-")) {
            return -1L;
        }
        return Long.parseLong(this.ak.toString());
    }

    public final void n(int i2) {
        this.l = (short) 0;
        this.e.aw = 0;
        this.as = i2;
        ca.l = 0;
        this.e.aq.b();
        this.e.aq.a("");
        this.e.aq.a(true);
        this.e.as.a(new String[]{" 一 ", " 二 ", " 三 ", " 四 ", " 五 "});
        this.e.as.a((byte) 1);
        this.e.aq.a(t.e <= 240 ? 79 : 120);
        this.e.as.a = this.aH;
        this.aq = this.aF;
        this.ar = this.aG;
        if (bt.ct == null || bt.ct.length <= 0) {
            this.e.at.a("没有物品,按3、9键可以上下翻滚此属性描述框", t.i, (byte) 1);
        } else {
            this.e.at.a(bt.a(this.k, this.e.l, (this.ar << 3) + this.aq), t.i, (byte) 1);
        }
        this.e.at.a((byte) 1);
        this.e.au.a("");
        this.e.aq.a(this.e.as);
        this.e.aq.a(this.e.at);
        if (t.c > 220) {
            this.e.aq.a(this.e.au);
        }
        this.e.aq.a(t.f, t.g, t.d, t.e);
        this.e.j = this.e.k;
        this.k = (short) 11;
        this.j = (short) 11;
    }

    public final void o() {
        this.ak.delete(0, this.ak.length());
    }

    public final void o(int i2) {
        if (this.g == null || bt.H == null || bt.M == null) {
            return;
        }
        this.g.a(i2);
    }

    public final void p() {
        this.bL = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 9, 2);
        this.bM = new short[9];
        this.bO = new String[9];
        this.bL[0][0] = bt.aN;
        this.bL[0][1] = bt.aM;
        this.bL[1][0] = bt.aP;
        this.bL[1][1] = bt.aO;
        this.bL[2][0] = bt.aR;
        this.bL[2][1] = bt.aQ;
        this.bL[3][0] = bt.aV;
        this.bL[3][1] = bt.aU;
        this.bL[4][0] = bt.aT;
        this.bL[4][1] = bt.aS;
        this.bL[5][0] = bt.aZ;
        this.bL[5][1] = -1;
        this.bL[6][0] = bt.bc;
        this.bL[6][1] = -1;
        this.bL[7][0] = bt.ba;
        this.bL[7][1] = -1;
        this.bL[8][0] = bt.bb;
        this.bL[8][1] = -1;
        for (int i2 = 0; i2 < this.bO.length; i2++) {
            this.bO[i2] = new StringBuffer().append(this.bL[i2][0]).append(this.bL[i2][1] != -1 ? new StringBuffer().append("/").append(this.bL[i2][1]).toString() : "").toString();
        }
        this.e.aq.b();
        this.e.aq.a("属性分配");
        this.e.aq.a(false);
        this.e.ar.a((Image[]) null, this.bN, (String[]) null, this.bO);
        this.e.aq.f = a.L.c;
        this.e.au.a(new String[]{"确定", "取消"});
        this.e.aq.a(this.e.ar);
        this.e.aq.a(this.e.au);
        this.e.aq.a(t.f, t.g, t.d, t.e);
        this.j = this.k;
        this.k = (short) 37;
    }

    public final void p(int i2) {
        String[] strArr;
        if (i()) {
            this.l = (short) 0;
            this.e.aq.b();
            this.e.aq.a("社交关系");
            if (this.j != 19) {
                this.e.as.a(new String[]{"好友", "师徒", "黑名单"});
            }
            if (i2 == 1) {
                this.e.ar.a((Image[]) null, bt.dL, (String[]) null, bt.dQ);
            } else {
                if (bt.dK == null || bt.dK.length <= 0) {
                    strArr = null;
                } else {
                    String[] strArr2 = new String[bt.dK.length];
                    for (int i3 = 0; i3 < strArr2.length; i3++) {
                        strArr2[i3] = bt.dN[i3] == 0 ? "离线" : new StringBuffer().append((int) bt.dN[i3]).append("级").toString();
                    }
                    strArr = strArr2;
                }
                this.e.ar.a((Image[]) null, bt.dL, (String[]) null, strArr);
                if (i2 == 0) {
                    this.e.ar.a("添加好友");
                    this.e.ar.a(bt.aC == 1 ? bt.dO : null);
                    this.e.ar.b(bt.aH == 1 ? bt.dP : null);
                }
            }
            this.e.ar.a(bt.dR);
            this.e.au.a("确定");
            this.e.aq.a(this.e.as);
            this.e.aq.a(this.e.ar);
            if (t.c > 220) {
                this.e.aq.a(this.e.au);
            }
            this.e.aq.a(t.f, t.g, t.d, t.e);
            this.e.aq.a(true);
            this.de = null;
            this.e.j = this.e.k;
            this.k = (short) 19;
            this.j = (short) 19;
        }
    }

    public final void q() {
        if (bt.bC.size() <= 0 || A((this.ar << 3) + this.aq) == null) {
            this.e.at.a("没有物品,按3、9键可以上下翻滚此属性描述框", t.i, (byte) 1);
        } else {
            this.e.at.a(A((this.ar << 3) + this.aq), t.i, (byte) 1);
        }
        this.e.at.a((byte) 1);
        ca.l = 0;
    }

    public final void q(int i2) {
        if (this.e.ar.g() == 2) {
            if (i2 == 1073741824 || i2 == 517) {
                byte[] bArrA = bz.a((short) 4194, bt.ad, bt.z);
                if (bArrA != null) {
                    a.i.a(new w((short) 4194, bArrA));
                } else {
                    this.e.b("获取上传指令数据错误!");
                }
            }
        }
    }

    public final void r(int i2) {
        if (this.l == 0) {
            if (this.e.aq != null) {
                this.e.aq.b(i2);
            }
            if (i2 == 268435456 || i2 == 1073741824 || i2 == 517) {
                if (bt.hP != null) {
                    a((byte) 1, (short) bt.hP[this.e.ar.g()], bt.ad);
                }
            } else if (i2 == 536870912) {
                at();
                c(5);
            }
        }
    }

    public final void s() {
        if (bt.bC.size() <= 0 || A((this.ar << 3) + this.aq) == null) {
            this.e.at.a("没有物品，按3、9键可以上下翻滚此属性描述框", t.i, (byte) 1);
        } else {
            this.e.at.a(A((this.ar << 3) + this.aq), t.i, (byte) 1);
        }
        this.e.at.a((byte) 1);
        this.l = (short) 0;
        ca.l = 0;
    }

    public final void s(int i2) {
        this.bh = true;
        this.bg = i2;
        t.a(new StringBuffer().append("pet index=").append(i2).toString());
        this.l = (short) 0;
        this.e.aq.b();
        this.e.aq.a("宠物附魂");
        String[] strArr = new String[10];
        strArr[0] = "技能附魂";
        strArr[5] = "状态附魂";
        for (int i3 = 0; i3 < 4; i3++) {
            if (bt.gh[i2] == null || bt.gh[i2][i3] == null) {
                strArr[i3 + 1] = "宠魂栏";
            } else {
                strArr[i3 + 1] = bt.gh[i2][i3];
            }
            if (bt.gl[i2] == null || bt.gl[i2][i3] == null) {
                strArr[i3 + 6] = "宠魂栏";
            } else {
                strArr[i3 + 6] = bt.gl[i2][i3];
            }
        }
        this.e.ar.a((Image[]) null, strArr, (String[]) null, (String[]) null);
        this.e.aq.a(this.e.ar);
        this.e.at.a("", t.i, (byte) 2);
        this.e.at.a((byte) 1);
        this.e.aq.a(this.e.at);
        this.e.aq.a(t.f, t.g, t.d, t.e);
        this.e.j = this.e.k;
        this.k = (short) 120;
        this.j = (short) 120;
    }

    public final void t() {
        this.bV = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 10, 4);
        this.l = (short) 0;
        this.m = (short) 0;
        ca.l = 0;
        q = this.e.a(q, bt.ax, bt.aj, (byte) 3, (byte) 1, false);
        if (bt.cz != null) {
            for (byte b2 = 0; b2 < bt.cz.length; b2 = (byte) (b2 + 1)) {
                a(bt.cD[b2]);
            }
        }
        this.e.j = this.e.k;
        a.f.a(this.f, h, i, false, true, 1009050);
        this.k = (short) 5;
        this.j = (short) 5;
    }

    public final void t(int i2) {
        t.a(new StringBuffer().append("pet index=").append(this.bg).toString());
        this.l = (short) 0;
        String[] strArr = new String[10];
        strArr[0] = "技能附魂";
        strArr[5] = "状态附魂";
        for (int i3 = 0; i3 < 4; i3++) {
            if (bt.gh[this.bg] == null || bt.gh[this.bg][i3] == null) {
                strArr[i3 + 1] = "宠魂栏";
            } else {
                strArr[i3 + 1] = bt.gh[this.bg][i3];
            }
            if (bt.gl[this.bg] == null || bt.gl[this.bg][i3] == null) {
                strArr[i3 + 6] = "宠魂栏";
            } else {
                strArr[i3 + 6] = bt.gl[this.bg][i3];
            }
        }
        this.e.ar.a((Image[]) null, strArr, (String[]) null, (String[]) null);
        this.e.ar.a(i2);
        if (this.e.ar.g() == 0 || this.e.ar.g() == 5) {
            this.e.at.a("", t.i, (byte) 2);
            this.e.at.a((byte) 1);
            return;
        }
        if (this.e.ar.g() < 5) {
            if (bt.gh[this.bg] == null || bt.gh[this.bg][this.e.ar.g() - 1] == null) {
                this.e.at.a("可以嵌入符文", t.i, (byte) 2);
                this.e.at.a((byte) 1);
                return;
            } else {
                this.e.at.a(bt.gi[this.bg][this.e.ar.g() - 1], t.i, (byte) 2);
                this.e.at.a((byte) 1);
                return;
            }
        }
        if (bt.gl[this.bg] == null || bt.gl[this.bg][this.e.ar.g() - 6] == null) {
            this.e.at.a("可以嵌入符文", t.i, (byte) 2);
            this.e.at.a((byte) 1);
        } else {
            this.e.at.a(bt.gm[this.bg][this.e.ar.g() - 6], t.i, (byte) 2);
            this.e.at.a((byte) 1);
        }
    }

    public final void u() {
        this.l = (short) 0;
        this.e.aq.j();
        this.e.aq.a("定购服务");
        this.e.aq.a(true);
        this.e.ar.a((Image[]) null, bt.P.j, (String[]) null, (String[]) null);
        this.e.ar.a(bt.P.n);
        this.e.aq.a(this.e.ar);
        this.e.aq.a(t.f, t.g, t.d, t.e, 0, 0, false);
        this.e.j = this.e.k;
        this.j = this.k;
        this.k = (short) 77;
    }

    public final void v() {
        t.a(this.e.l);
        this.e.l.append(new StringBuffer().append("昵称：").append(bt.eS).append('\t').toString());
        this.e.l.append(new StringBuffer().append("门派：").append(t.G[bt.eV]).append('\t').toString());
        this.e.l.append(new StringBuffer().append("级别：").append((int) bt.eT).append('\t').toString());
        this.e.l.append(new StringBuffer().append("性别：").append(bt.eU == 0 ? "男" : "女").append('\t').toString());
        this.e.l.append(new StringBuffer().append("称号：").append(bt.eW).append('\t').toString());
        this.e.l.append(new StringBuffer().append("帮派：").append(bt.eX).toString());
        if (!"无".equals(bt.eX)) {
            this.e.l.append(new StringBuffer().append("(").append(bt.eY).append("级)").toString());
        }
        this.e.l.append('\t');
        this.e.l.append(new StringBuffer().append("职务：").append(bt.eZ).append('\t').toString());
        this.e.l.append(new StringBuffer().append("功勋：").append(bt.fa).append('\t').toString());
        this.e.l.append(new StringBuffer().append("配偶：").append(bt.fb).append('\t').toString());
        this.e.l.append(new StringBuffer().append("师傅：").append(bt.fc).append('\t').toString());
        this.e.l.append(new StringBuffer().append("好感度：").append(bt.fd).append('\t').toString());
        this.e.l.append(bt.fe);
        this.T.j();
        this.T.a("玩家详细");
        this.T.a(true);
        an anVar = new an();
        anVar.b(this.e.l.toString(), t.i, (byte) 2);
        this.T.a(anVar);
        this.T.a(t.f, t.g, t.d, t.e);
        this.e.j = this.e.k;
        if (this.k == 7) {
            if (this.l == 10) {
                this.l = (short) 11;
                return;
            } else {
                this.l = (short) 3;
                return;
            }
        }
        if (this.k == 21) {
            this.l = (short) 4;
            return;
        }
        if (this.k == 46) {
            this.l = (short) 2;
            return;
        }
        if (this.k == 47) {
            this.l = (short) 3;
        } else if (this.k == 19) {
            this.l = (short) 10;
        } else if (this.k == 130) {
            this.l = (short) 3;
        }
    }

    public final void w() {
        this.aq = 0;
        ca.l = 0;
        this.bV = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 10, 4);
        a.f.a(this.f, h, i, false, true, 1009050);
        if (bt.cG != null) {
            for (byte b2 = 0; b2 < bt.cQ.length; b2 = (byte) (b2 + 1)) {
                a(bt.cQ[b2]);
            }
        }
        this.e.j = this.e.k;
        if (this.k == 7) {
            q = this.e.a(q, bt.cE, bt.cF, (byte) 3, (byte) 1, false);
            if (this.l == 10) {
                this.l = (short) 12;
            } else {
                this.l = (short) 4;
            }
        } else if (this.k == 21) {
            if (this.e.ar.g() < bt.q.length) {
                q = this.e.a(q, bt.q[this.e.ar.g()].q, bt.q[this.e.ar.g()].p, (byte) 3, bt.q[this.e.ar.g()].r, false);
            }
            this.l = (short) 5;
        } else if (this.k == 47 || this.k == 130) {
            q = this.e.a(q, bt.cE, bt.cF, (byte) 3, (byte) 0, false);
            this.l = (short) 4;
        }
        if (this.l == 4 || this.l == 12) {
            a.f.a(this.f, h, i, false, true, 1009050);
        }
        this.m = (short) 0;
    }

    public final void x() {
        this.l = (short) 0;
        this.e.aq.b();
        this.e.aq.a("任务");
        this.e.aq.a(true);
        this.e.as.a(new String[]{"已接", "剧情", "活动", "增值", "其他"});
        I(0);
        this.e.ar.a((Image[]) null, this.cd, (String[]) null, this.ce);
        this.e.au.a("操作");
        this.e.aq.a(this.e.as);
        this.e.aq.a(this.e.ar);
        if (t.c > 220) {
            this.e.aq.a(this.e.au);
        }
        this.e.aq.a(t.f, t.g, t.d, t.e);
        if (bt.bV != null && bt.bV.length > 0) {
            this.e.ar.a(bt.bV[0], 1);
        }
        a aVar = this.e;
        this.e.k = (short) 7;
        aVar.j = (short) 7;
        this.k = (short) 6;
        this.j = (short) 6;
    }

    public final void y() {
        byte[] bArrM = bz.m((short) 4629, bt.ad, bt.fA[this.aE], bt.dl[this.e.ar.g()]);
        if (bArrM == null) {
            this.e.b("获取上传指令数据错误!");
        } else {
            a.i.a(new w((short) 4629, bArrM));
            this.e.a((String) null);
        }
    }

    public final void z() {
        if (bt.mO == null) {
            this.e.b("没有特效");
            return;
        }
        this.l = (short) 0;
        this.e.aq.j();
        this.e.aq.a("技能特效");
        this.e.aq.a(true);
        String[] strArr = new String[bt.mP.length];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            strArr[i2] = String.valueOf(bt.mQ[i2]);
        }
        this.e.ar.a((Image[]) null, bt.mP, (String[]) null, strArr);
        this.e.aq.a(this.e.ar);
        this.e.aq.a(t.f, t.g, t.d, t.e);
        this.e.ar.a((this.e.aq.a + (this.e.aq.c / 2)) - 2, this.e.ar.b(), (this.e.aq.c / 2) - 4, this.e.ar.d());
        this.ci = new int[]{this.e.aq.a, this.e.ar.b(), this.e.aq.c / 2, this.e.ar.d()};
        if (a.ad == null) {
            bu buVar = new bu("/", "skill");
            a.ad = buVar;
            buVar.d();
        }
        this.ch = a.ad.b(String.valueOf((int) bt.mR[this.e.ar.g()]));
        this.e.j = this.e.k;
        this.k = (short) 123;
        this.j = (short) 123;
    }
}

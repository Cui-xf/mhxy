package com.cc;

import com.yinhan.kjava.main.MainCanvas;
import com.yinhan.kjava.main.MainMidlet;
import com.yinhan.kjava.main.TouchController;
import com.yinhan.kjava.main.c_3;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import java.io.IOException;
import java.util.Vector;

public final class ao_1 {
    public static short a = 176;
    public static short b = 208;
    public boolean c = false;
    public byte d = -1;
    private byte bi = -1;
    public MainCanvas e;
    public aw f;
    public bq_1 g;
    private Vector bj = new Vector();
    private static Vector bk = new Vector();
    private static Vector bl = new Vector();
    private static Vector bm = new Vector();
    public static int h;
    public static int i;
    public short j;
    public short k;
    public short l;
    public short m;
    public boolean n = false;
    public static short o = 0;
    public static short p = 0;
    public static Frame1 q;
    private static Frame1 bn;
    public static Frame1 r;
    public static Frame1 s;
    public static Frame1 t_2;
    public static Frame1 u;
    private static Frame1 bo;
    private static Frame1 bp;
    public static Frame0 v;
    public static Frame0 w;
    public static Frame0 x;
    public static Frame0 y;
    public static Frame0 z;
    public static Image A;
    public static Frame0 B;
    private static Frame0 bq;
    private static Frame0 br;
    public static Frame0 C;
    public static Frame0 D;
    public static Frame0 E;
    public static Frame0 F;
    public static Frame0 G;
    public static Frame0 H;
    public ac I;
    public String J = null;
    private short bs = 0;
    private long bt;
    public static TextRender K;
    public static bv L;
    public aq M;
    public cc N;
    public o_1 O;
    public r P;
    public k Q;
    public bd R;
    public v_1 S;
    public m_1 T;
    private c_1 bu;
    private an_1 bv;
    private l_1 bw;
    public as U;
    public ch V;
    public cg_1 W;
    public ab_1 X;
    private short bx = 0;
    public int Y = -1;
    public static Frame0 Z;
    public static Frame1 aa;
    public static Frame1 ab;
    public static Frame1 ac;
    public static Frame1 ad;
    public static Frame1 ae;
    public byte af;
    private byte by = 0;
    public int ag;
    private int bz;
    public long ah;
    private String[] bA;
    private int bB = 0;
    private int bC;
    private int bD;
    private int[][] bE = null;
    private int[] bF = null;
    private String bG = null;
    private static Vector bH = new Vector();
    public int ai;
    public static boolean aj = false;
    private String bI;
    private boolean bJ = true;
    public StringBuffer ak = new StringBuffer();
    public String[] al;
    public String[] am;
    public String[] an;
    private String[] bK;
    private int[][] bL;
    private short[] bM;
    private String[] bN = new String[]{"生命", "内力", "物攻", "法攻", "防御", "速度", "冰抗", "火抗", "雷抗"};
    private String[] bO = null;
    public boolean ao;
    public boolean ap;
    private int[][] bP = new int[2][4];
    private int bQ = 0;
    public int aq;
    public int ar;
    public int as;
    private long bR;
    public String at = null;
    private boolean bS = false;
    public int[][] au = new int[32][4];
    private bn bT = null;
    private Vector bU = new Vector();
    private int[][] bV = null;
    private int[] bW = new int[4];
    public int av;
    public boolean aw = false;
    private byte bX;
    private int[][] bY = new int[][]{{39, 6}, {13, 24}, {3, 55}, {13, 87}, {39, 105}, {72, 105}, {97, 87}, {108, 55}, {97, 24}, {72, 6}};
    private Image bZ;
    public static byte ax = 0;
    private static byte ca = 1;
    private static byte cb = 2;
    private int[][] cc = new int[][]{{8, 32}, {8, 78}, {55, 108}, {102, 78}, {102, 32}, {55, 5}};
    private String[] cd = null;
    private String[] ce = null;
    private String[] cf = null;
    private boolean cg;
    public int ay;
    private Frame1 ch;
    private int[] ci = null;
    public byte az;
    public int aA;
    public int aB;
    public int aC;
    public int aD;
    public int aE;
    public int aF;
    public int aG;
    public byte aH;
    public Frame1 aI;
    public boolean aJ = false;
    private byte cj = 0;
    public String aK = " ";
    public String aL;
    public int aM;
    public int aN;
    public Vector aO = new Vector();
    private static Vector ck = new Vector();
    public static Vector aP = new Vector();
    public String aQ;
    private String cl;
    private byte cm;
    private int cn;
    private int co;
    private int cp;
    public boolean aR = false;
    public String aS = null;
    public int aT = -1;
    private b cq;
    private int[][] cr = null;
    private int[][] cs = new int[2][4];
    private byte ct = 0;
    public int aU;
    public int aV;
    private String cu = null;
    private int[][] cv = new int[8][4];
    private int[][] cw = new int[8][4];
    private int[][] cx = new int[2][4];
    private byte cy;
    private int[][] cz = null;
    public static byte[] aW = new byte[]{3, 10, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1};
    private int cA = -1;
    private int[][] cB;
    private int[][] cC;
    private Vector cD = new Vector();
    private long cE = 0L;
    private int[][] cF = new int[15][4];
    private int[] cG = new int[4];
    private int[] cH = new int[4];
    private int[] cI = new int[4];
    public boolean aX;
    private boolean cJ = false;
    public long aY = 0L;
    private int cK;
    private static volatile boolean cL;
    private boolean cM;
    private String[] resNames = new String[24];
    private String[] cO = new String[9];
    private short[][] cP = new short[3][9];
    private String[] cQ = new String[18];
    private short[][] cR = new short[3][18];
    private byte resLoadIndex = 0;
    private byte cT = 0;
    private byte cU = 0;
    private int cV = 0;
    private short[] cW;
    public byte aZ = -1;
    private byte cX;
    private boolean cY;
    public bv ba;
    private byte cZ;
    public short bb = 0;
    private String da = null;
    private int db;
    private int dc;
    private TextRender dd;
    private String de = null;
    private String df = null;
    private String[] dg = new String[]{"确定", "取消"};
    public ba bc;
    private bh dh;
    public Frame1 bd;
    public int be = 0;
    public int bf = 0;
    public int bg;
    public boolean bh;
    private an_1 di;
    private an_1 dj;
    private Frame1[] dk;
    private byte dl = 0;
    private int dm;
    private int dn;
    private String[] do_2 = new String[]{"休息", "骑术升级", "取消"};
    private String[] dp = new String[]{"骑乘", "骑术升级", "取消"};
    private String[] dq = new String[]{"购买", "骑术升级", "取消"};
    private String[] dr = new String[]{"", "骑术升级", ""};
    private int ds;
    private int dt;
    private boolean du;
    private TextRender dv;

    public ao_1(MainCanvas var1, PngUtil var2) {
        this.e = var1;
        this.M = new aq(this, this.e);
        this.O = new o_1(this, this.e, var2);
        this.S = new v_1(this, this.e);
        this.U = new as(this, this.e, var2);
        this.V = new ch(this, this.e, var2);
        this.W = new cg_1(this, this.e, var2);
        this.X = new ab_1(this);
        if (GlobalStatus.bu) {
            GlobalStatus.bu = false;
            GlobalStatus.bv = 0;
        }

        GlobalStatus.bt = false;
        this.T = new m_1();
        this.bu = new c_1();
        this.bv = new an_1();
        this.bw = new l_1();
        this.j();
        GlobalStatus.a = false;
        this.e.p = true;
        this.d = -1;
        this.e.clear();
        this.e.k();
        this.e.clear();
        this.aY = 0L;
        GlobalStatus.as = -1;
        this.ar();
        this.e.clear();
        this.ao();
        this.e.clear();
        MainCanvas.af.e("-1000");
        MainCanvas.af.e("103");
        this.e.clear();
        this.aq();
        this.e.clear();
        this.U();
        this.e.clear();
        GlobalConfig.a(GlobalStatus.ax, GlobalStatus.aj, (byte) 3, 1, false);
        this.I = new ac();
        this.I.a(GlobalStatus.at, GlobalStatus.au);
        MainCanvas.f.a(this.g(), this.h(), GlobalConfig.defaultWidth, GlobalConfig.defaultHigh);
        this.e.clear();
        this.as();
        if (this.I.d != null) {
            this.I.d.h = this.I.j;
            this.I.d.i = this.I.k;
        }

        this.e.clear();
        GlobalStatus.E();
        this.aO.removeAllElements();
        this.Y = GlobalStatus.ar;
        this.e.clear();
        this.N();
        this.e.touchPageCase = this.e.k = 7;
        this.e.p = false;
    }

    public final void a() {
        if (!this.e.p) {
            if (this.k == 25 && aW[5] != 0) {
                this.cE = 0L;
            } else if (this.k != 0 && this.k != 25) {
                this.cE = 0L;
            } else if (this.cE != 0L && this.cD.size() != 0) {
                if (System.currentTimeMillis() - this.cE > 1000L) {
                    this.cE = 0L;
                    if (this.cD.size() > 0) {
                        this.cD.removeElementAt(0);
                    }
                }
            } else {
                this.cE = System.currentTimeMillis();
            }

            if (this.k != 0) {
                this.d = -1;
            }

            if (this.k != this.bx) {
                this.bx = this.k;
            }

            label986:
            switch (this.k) {
                case 0:
                    if (this.J == null) {
                        if (GlobalConfig.o && this.e.touchController != null) {
                            this.e.touchController.a();
                            TouchController var12;
                            if ((var12 = this.e.touchController).d != 1 && var12.canvas.b == 0) {
                                if (!var12.a.I.c.isEmpty()) {
                                    var12.a.I.j();
                                }
                            } else if (!var12.a.I.c.isEmpty()) {
                                var12.a.I.c.removeAllElements();
                                var12.a.I.a(false);
                            }
                        } else if (GlobalStatus.E == 1) {
                            if (this.I != null && this.I.c != null && !this.I.c.isEmpty()) {
                                if (this.e.b != 0) {
                                    this.I.c.removeAllElements();
                                    this.I.a(false);
                                } else {
                                    this.I.j();
                                }
                            }
                        } else if (GlobalStatus.bu && this.I != null && this.I.c != null && !this.I.c.isEmpty()) {
                            this.I.j();
                        }

                        if (!GlobalStatus.bu) {
                            if (GlobalStatus.lt[0] != -1 && MainCanvas.e != null) {
                                MainCanvas.e.e((byte) 0);
                                GlobalStatus.lt[0] = -1;
                            }

                            if (GlobalStatus.lt[1] != -1 && MainCanvas.e != null) {
                                MainCanvas.e.c((byte) 0);
                                GlobalStatus.lt[1] = -1;
                            }

                            if (this.k != 18 && !this.c && GlobalStatus.Q != null && GlobalStatus.Q.b.length() > 0) {
                                this.e.av.b();
                                GlobalStatus.Q.a(this.e.av);
                                GlobalStatus.Q.a();
                                GlobalStatus.Q.b();
                                this.j = MainCanvas.e.k;
                                this.k = 111;
                                this.e.touchPageCase = this.e.k;
                            }

                            String var13;
                            if (GlobalStatus.P.o && (var13 = GlobalStatus.P.a()) != null) {
                                this.g(var13);
                            }
                        }
                    }

                    this.a(this.e.touchAction);
                    break;
                case 1:
                    int var20 = this.e.touchAction;
                    if (this.l != 0 && this.l != 2 && this.l != 3 && this.l != 4 && this.l != 5 && this.l != 9 && this.l != 19 && this.l != 20) {
                        if (this.l == 1) {
                            if (var20 == 8) {
                                this.c(this.bB - 1);
                            } else if (var20 == 2) {
                                this.c(this.bB + 1);
                            } else if (var20 != 268435456 && var20 != 1073741824) {
                                if (var20 == 536870912) {
                                    this.at();
                                }
                            } else {
                                switch (this.bB) {
                                    case 0:
                                        if (GlobalStatus.q != null) {
                                            this.aN();
                                        } else {
                                            this.e.processException("没有加入队伍");
                                        }
                                        break label986;
                                    case 1:
                                        this.aS();
                                }
                            }
                        } else if (this.l == 6) {
                            if (var20 != 268435456 && var20 != 1073741824) {
                                if (var20 == 536870912) {
                                    this.l = 2;
                                }
                            } else {
                                this.M.d();
                            }
                        } else if (this.l == 7) {
                            if (var20 != 268435456 && var20 != 1073741824) {
                                if (var20 == 536870912) {
                                    this.l = 5;
                                }
                            } else {
                                boolean var50 = true;
                                byte[] var25;
                                if ((var25 = NetPayloadBuilder.e((short) 4352, GlobalStatus.ad, (byte) 1)) != null) {
                                    MainCanvas.netUtils.sendPacket(new NetPacket((short) 4352, var25));
                                    this.N();
                                    this.e.a((String) null);
                                } else {
                                    this.e.processException("获取上传指令数据错误!");
                                }
                            }
                        } else if (this.l == 8) {
                            this.b(var20);
                            if (var20 != 268435456 && var20 != 1073741824 && var20 != 517) {
                                if (var20 == 536870912) {
                                    this.l = 9;
                                }
                            } else {
                                this.l = 9;
                            }
                        }
                    } else if (var20 != 1 && var20 != 514) {
                        if (var20 != 4 && var20 != 520) {
                            if (var20 != 8 && var20 != 516) {
                                if (var20 != 2 && var20 != 518) {
                                    if (var20 != 268435456 && var20 != 1073741824 && var20 != 517) {
                                        if (var20 == 536870912) {
                                            switch (this.l) {
                                                case 0:
                                                    this.N();
                                                case 1:
                                                case 6:
                                                case 7:
                                                case 8:
                                                case 10:
                                                case 11:
                                                case 12:
                                                case 13:
                                                case 14:
                                                case 15:
                                                case 16:
                                                case 17:
                                                case 18:
                                                default:
                                                    break label986;
                                                case 2:
                                                    this.at();
                                                    this.c((int) 4);
                                                    break label986;
                                                case 3:
                                                    this.at();
                                                    this.c((int) 0);
                                                    break label986;
                                                case 4:
                                                    this.at();
                                                    this.c((int) 1);
                                                    break label986;
                                                case 5:
                                                    this.at();
                                                    this.c((int) 10);
                                                    break label986;
                                                case 9:
                                                    this.aw();
                                                    this.c((int) 3);
                                                    break label986;
                                                case 19:
                                                    this.at();
                                                    this.c((int) 8);
                                                    break label986;
                                                case 20:
                                                    this.at();
                                                    this.c((int) 9);
                                            }
                                        }
                                    } else {
                                        switch (this.l) {
                                            case 0:
                                                int var49 = this.bB;
                                                if (this.l == 0) {
                                                    this.c(var49);
                                                    switch (var49) {
                                                        case 0:
                                                            this.av();
                                                            break label986;
                                                        case 1:
                                                            if (!GlobalStatus.jv) {
                                                                this.e.processException("商城暂时关闭");
                                                            } else {
                                                                this.aw();
                                                            }
                                                            break label986;
                                                        case 2:
                                                            this.e((int) 0);
                                                            break label986;
                                                        case 3:
                                                            if (GlobalStatus.bR == null && GlobalStatus.bL == null) {
                                                                this.e.processException("当前没有任务");
                                                            } else {
                                                                this.x();
                                                            }
                                                            break label986;
                                                        case 4:
                                                            this.k();
                                                            break label986;
                                                        case 5:
                                                            this.v((byte) 1);
                                                            break label986;
                                                        case 6:
                                                            this.a((byte) 0, (byte) 0, (short) 0);
                                                            break label986;
                                                        case 7:
                                                            if (GlobalStatus.fA != null) {
                                                                this.j((int) 0);
                                                            } else {
                                                                this.e.processException("您没有宠物！");
                                                            }
                                                            break label986;
                                                        case 8:
                                                            this.l();
                                                            break label986;
                                                        case 9:
                                                            this.au();
                                                            break label986;
                                                        case 10:
                                                            this.ax();
                                                    }
                                                }
                                            case 1:
                                            case 6:
                                            case 7:
                                            case 8:
                                            case 10:
                                            case 11:
                                            case 12:
                                            case 13:
                                            case 14:
                                            case 15:
                                            case 16:
                                            case 17:
                                            case 18:
                                            default:
                                                break label986;
                                            case 2:
                                                int var48 = this.bB;
                                                if (this.l == 2) {
                                                    this.c(var48);
                                                    switch (var48) {
                                                        case 0:
                                                            this.M.r();
                                                            break label986;
                                                        case 1:
                                                            GlobalStatus.gQ = 1;
                                                            this.M.g(0);
                                                            break label986;
                                                        case 2:
                                                            this.M.g();
                                                            break label986;
                                                        case 3:
                                                            GlobalStatus.gQ = 1;
                                                            this.M.j(0);
                                                            break label986;
                                                        case 4:
                                                            this.l = 6;
                                                            LoadingPage.h = 0;
                                                    }
                                                }
                                                break label986;
                                            case 3:
                                                int var47 = this.bB;
                                                if (this.l == 3) {
                                                    this.c(var47);
                                                    switch (var47) {
                                                        case 0:
                                                            this.a((byte) 0);
                                                            break label986;
                                                        case 1:
                                                            if (GlobalStatus.dv != null && GlobalStatus.dv.length > 0) {
                                                                this.h((int) 0);
                                                            } else {
                                                                this.e.processException("没有技能");
                                                            }
                                                            break label986;
                                                        case 2:
                                                            this.a((byte) 0, (String) null, (int) 0);
                                                            break label986;
                                                        case 3:
                                                            this.t();
                                                            break label986;
                                                        case 4:
                                                            this.p();
                                                            break label986;
                                                        case 5:
                                                            this.x((byte) 0);
                                                            break label986;
                                                        case 6:
                                                            this.a(GlobalStatus.ad, GlobalStatus.ad, (short) 0, (short) 1);
                                                            break label986;
                                                        case 7:
                                                            String var10 = GlobalStatus.ad;
                                                            byte[] var11;
                                                            if ((var11 = NetPayloadBuilder.A((short) 4254, var10)) != null) {
                                                                MainCanvas.netUtils.sendPacket(new NetPacket((short) 4254, var11));
                                                                this.e.a((String) null);
                                                            } else {
                                                                this.e.processException("获取上传指令数据错误!");
                                                            }
                                                            break label986;
                                                        case 8:
                                                            if (GlobalStatus.bA > 0) {
                                                                byte[] var9;
                                                                if ((var9 = NetPayloadBuilder.w((short) 4653, GlobalStatus.ad)) != null) {
                                                                    MainCanvas.netUtils.sendPacket(new NetPacket((short) 4653, var9));
                                                                    this.e.a((String) null);
                                                                } else {
                                                                    this.e.processException("获取上传指令数据错误!");
                                                                }
                                                            } else {
                                                                this.af();
                                                            }
                                                    }
                                                }
                                                break label986;
                                            case 4:
                                                int var46 = this.bB;
                                                if (this.l == 4) {
                                                    if (var46 == 0) {
                                                        this.c(var46);
                                                        byte[] var24;
                                                        if ((var24 = NetPayloadBuilder.a((short) 4648, (byte) ((byte) var46), GlobalStatus.ad)) != null) {
                                                            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4648, var24));
                                                            this.e.a((String) null);
                                                        } else {
                                                            this.e.processException("获取上传指令数据错误!");
                                                        }
                                                    } else if (GlobalConfig.channel == 0) {
                                                        this.c(var46);
                                                        switch (var46) {
                                                            case 1:
                                                                this.e.processException("此功能暂时不开放！");
                                                                break label986;
                                                            case 2:
                                                                this.aX();
                                                                break label986;
                                                            case 3:
                                                                if (GlobalConfig.channel == 0) {
                                                                    this.a(new String[]{"充值卡", "Q币", "Q卡", "短信"});
                                                                }

                                                                this.c((int) 0);
                                                                this.l = 9;
                                                                this.j = this.k = 1;
                                                                break label986;
                                                            case 4:
                                                                this.az();
                                                        }
                                                    } else {
                                                        this.c(var46);
                                                        switch (var46) {
                                                            case 1:
                                                                this.aX();
                                                                break label986;
                                                            case 2:
                                                                if (GlobalStatus.jy == 1) {
                                                                    c_3.g();
                                                                } else {
                                                                    this.e.processException("充值功能暂时关闭");
                                                                }
                                                                break label986;
                                                            case 3:
                                                                if (this.ay()) {
                                                                    if (GlobalStatus.jx == 1) {
                                                                        c_3.a(this.e, "1", (short) 101, 1);
                                                                    } else {
                                                                        this.e.processException("换豆功能暂时关闭");
                                                                    }
                                                                }
                                                                break label986;
                                                            case 4:
                                                                if (this.ay()) {
                                                                    c_3.h();
                                                                }
                                                                break label986;
                                                            case 5:
                                                                this.az();
                                                        }
                                                    }
                                                }
                                                break label986;
                                            case 5:
                                                int var45 = this.bB;
                                                if (this.l == 5) {
                                                    this.c(var45);
                                                    switch (var45) {
                                                        case 0:
                                                            this.aQ();
                                                        case 1:
                                                        default:
                                                            break label986;
                                                        case 2:
                                                            byte[] var23;
                                                            if ((var23 = NetPayloadBuilder.y((short) 4659, GlobalStatus.ad)) != null) {
                                                                NetPacket var8 = new NetPacket((short) 4659, var23);
                                                                MainCanvas.netUtils.sendPacket(var8);
                                                                this.e.a((String) null);
                                                            } else {
                                                                this.e.processException("获取上传指令数据错误!");
                                                            }
                                                            break label986;
                                                        case 3:
                                                            if (GlobalStatus.bs == 0) {
                                                                this.e.processException("队员不能使用");
                                                            } else {
                                                                boolean var20_t = true;
                                                                if (MainCanvas.f.a(this.f, this.I.j + 8, this.I.k + 16) == 0 && MainCanvas.f.a(this.f, this.I.j + 8, this.I.k + 16) == 0 && MainCanvas.f.a(this.f, this.I.j + 10, this.I.k + 16) == 0 && !MainCanvas.f.a(this.I.j + 8, this.I.k + 16) && !MainCanvas.f.a(this.I.j + 10, this.I.k + 16)) {
                                                                    var20_t = false;
                                                                }

                                                                if (MainCanvas.f.a(this.f, this.I.j + 2, this.I.k + 16) == 0 && MainCanvas.f.a(this.f, this.I.j + 2, this.I.k + 16) == 0 && !MainCanvas.f.a(this.I.j + 2, this.I.k + 16) && !MainCanvas.f.a(this.I.j + 2, this.I.k + 16)) {
                                                                    var20_t = false;
                                                                }

                                                                if (MainCanvas.f.a(this.f, this.I.j + 12, this.I.k + 16) == 0 && MainCanvas.f.a(this.f, this.I.j + 12, this.I.k + 16) == 0 && !MainCanvas.f.a(this.I.j + 12, this.I.k + 16) && !MainCanvas.f.a(this.I.j + 12, this.I.k + 16)) {
                                                                    var20_t = false;
                                                                }

                                                                if (MainCanvas.f.a(this.f, this.I.j + 8, this.I.k + 16) == 0 && MainCanvas.f.a(this.f, this.I.j + 8, this.I.k + 16) == 0 && MainCanvas.f.a(this.f, this.I.j + 10, this.I.k + 16) == 0 && !MainCanvas.f.a(this.I.j + 8, this.I.k + 16) && !MainCanvas.f.a(this.I.j + 10, this.I.k + 16)) {
                                                                    var20_t = false;
                                                                }

                                                                if (var20_t) {
                                                                    this.h((byte) 0);
                                                                } else {
                                                                    this.e.processException("您没有卡死");
                                                                }
                                                            }
                                                            break label986;
                                                        case 4:
                                                            byte[] var21;
                                                            if ((var21 = NetPayloadBuilder.e((short) 4352, GlobalStatus.ad, (byte) 0)) != null) {
                                                                MainCanvas.netUtils.sendPacket(new NetPacket((short) 4352, var21));
                                                                this.N();
                                                                this.e.a((String) null);
                                                            } else {
                                                                this.e.processException("获取上传指令数据错误!");
                                                            }
                                                            break label986;
                                                        case 5:
                                                            this.l = 7;
                                                            LoadingPage.h = 0;
                                                    }
                                                }
                                                break label986;
                                            case 9:
                                                int var44 = this.bB;
                                                if (this.l == 9 && GlobalConfig.channel == 0) {
                                                    this.c(var44);
                                                    switch (var44) {
                                                        case 0:
                                                            if (GlobalStatus.jy != 1) {
                                                                this.e.processException("充值卡充值暂时关闭");
                                                            }
                                                            break label986;
                                                        case 1:
                                                            if (GlobalStatus.jx == 1) {
                                                                this.a(99L);
                                                                this.l = 8;
                                                            } else {
                                                                this.e.processException("QB直充暂时关闭");
                                                            }
                                                            break label986;
                                                        case 2:
                                                            if (GlobalStatus.kG != 1) {
                                                                this.e.processException("QB卡直充暂时关闭");
                                                            }
                                                            break label986;
                                                        case 3:
                                                            if (!GlobalStatus.jw) {
                                                                this.e.processException("短信支付暂时关闭");
                                                            }
                                                    }
                                                }
                                                break label986;
                                            case 19:
                                                int var43 = this.bB;
                                                if (this.l == 19) {
                                                    this.c(var43);
                                                    switch (var43) {
                                                        case 0:
                                                            if (this.P == null) {
                                                                this.P = new r(this, this.e, MainCanvas.f);
                                                            }

                                                            this.aw = false;
                                                            this.aJ = false;
                                                            this.P.b();
                                                            this.P.a(true);
                                                            break label986;
                                                        case 1:
                                                            this.aw = false;
                                                            this.aJ = false;
                                                            ch.a();
                                                            this.V.a(true);
                                                            break label986;
                                                        case 2:
                                                            this.aw = false;
                                                            this.aJ = false;
                                                            this.O.d();
                                                            this.O.a(true);
                                                            break label986;
                                                        case 3:
                                                            this.aF(-1);
                                                            break label986;
                                                        case 4:
                                                            this.e(true);
                                                            break label986;
                                                        case 5:
                                                            if (this.Q == null) {
                                                                this.Q = new k(this, this.e, MainCanvas.f);
                                                            }

                                                            this.Q.a();
                                                            this.Q.a(true);
                                                    }
                                                }
                                                break label986;
                                            case 20:
                                                int var42 = this.bB;
                                                if (this.l == 20) {
                                                    this.c(var42);
                                                    switch (var42) {
                                                        case 0:
                                                            byte[] var6;
                                                            if ((var6 = NetPayloadBuilder.f((short) 4168, GlobalStatus.ad)) != null) {
                                                                NetPacket var7 = new NetPacket((short) 4168, var6);
                                                                MainCanvas.netUtils.sendPacket(var7);
                                                                this.e.a((String) null);
                                                            } else {
                                                                this.e.processException("获取上传指令数据错误!");
                                                            }
                                                            break label986;
                                                        case 1:
                                                            this.K();
                                                            break label986;
                                                        case 2:
                                                            this.aS();
                                                    }
                                                }
                                        }
                                    }
                                } else {
                                    this.c(this.bB >= this.bA.length - 1 ? 0 : this.bB + 1);
                                }
                            } else {
                                this.c(this.bB <= 0 ? this.bA.length - 1 : this.bB - 1);
                            }
                        } else {
                            this.c(this.bB + this.bC >= this.bA.length ? this.bB + this.bC - this.bA.length : this.bB + this.bC);
                        }
                    } else {
                        this.c(this.bB - this.bC < 0 ? this.bB - this.bC + this.bA.length : this.bB - this.bC);
                    }
                    break;
                case 2:
                    this.v(this.e.touchAction);
                    break;
                case 3:
                    int var18 = this.e.touchAction;
                    if (this.e.aq != null) {
                        this.e.aq.b(var18);
                    }

                    if (var18 != 8 && var18 != 2 && var18 != 518 && var18 != 516) {
                        if (var18 == 536870912) {
                            if (this.by == 1) {
                                this.N();
                                this.by = 0;
                            } else {
                                this.av();
                                this.c((int) 0);
                            }
                        } else if ((var18 == 1073741824 || var18 == 517 || var18 == 268435456) && this.e.ar.g() == 2) {
                            byte[] var31;
                            if ((var31 = NetPayloadBuilder.a((short) 4194, GlobalStatus.ad, (byte) GlobalStatus.z)) != null) {
                                MainCanvas.netUtils.sendPacket(new NetPacket((short) 4194, var31));
                            } else {
                                this.e.processException("获取上传指令数据错误!");
                            }
                        }
                    } else if (this.e.as.a == 3) {
                        byte[] var19;
                        if ((var19 = NetPayloadBuilder.u((short) 4612, GlobalStatus.ad)) != null) {
                            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4612, var19));
                            this.e.a((String) null);
                        } else {
                            this.e.processException("获取上传指令数据错误!");
                        }
                    } else {
                        this.a(this.e.as.a);
                    }
                    break;
                case 4:
                    if (this.c) {
                        this.o((int) -1);
                    }

                    this.B(this.e.touchAction);
                    break;
                case 5:
                    int var16 = this.e.touchAction;
                    ao_1 var5 = this;
                    if (q != null) {
                        if (GlobalStatus.ay != this.bX) {
                            q = this.e.a(q, GlobalStatus.ax, GlobalStatus.aj, (byte) 3, (byte) 1, false);
                            this.bX = GlobalStatus.ay;
                        }

                        PngUtil.a(q, this.e.ak);
                    }

                    if (this.l == 0) {
                        this.a(GlobalStatus.cC);
                        if (var16 != 8 && var16 != 516) {
                            if (var16 != 2 && var16 != 518) {
                                if (var16 != 268435456 && var16 != 1073741824 && var16 != 517) {
                                    if (var16 != 1024 && var16 == 536870912) {
                                        this.av();
                                        this.c((int) 3);
                                    }
                                } else {
                                    boolean var26 = false;
                                    if (GlobalStatus.cz != null) {
                                        for (int var32 = 0; var32 < GlobalStatus.cz.length; ++var32) {
                                            if (GlobalStatus.cB[var32] == var5.av) {
                                                var26 = true;
                                                break;
                                            }
                                        }
                                    }

                                    if (var26) {
                                        LoadingPage.a(28 + o + (0 + (var5.av >= 1 ? 1 : 0)) % 2 * 80, (GlobalConfig.defaultHigh - (GlobalConfig.j + 3) * 6) / 2, new String[]{"查看", "装备", "卸下", "升星", "洗炼", "附魔"}, true);
                                        var5.l = 1;
                                    } else {
                                        var5.e((int) 7);
                                    }
                                }
                            } else {
                                this.av = this.av >= this.bY.length - 1 ? 0 : ++this.av;
                                LoadingPage.l = 0;
                            }
                        } else {
                            this.av = this.av <= 0 ? this.bY.length - 1 : --this.av;
                            LoadingPage.l = 0;
                        }
                    } else if (this.l == 1) {
                        LoadingPage.b(var16);
                        if (var16 != 268435456 && var16 != 1073741824 && var16 != 517) {
                            if (var16 == 536870912) {
                                this.aw = false;
                                this.l = 0;
                            }
                        } else if (LoadingPage.o == 0) {
                            GlobalStatus.a(this.av);
                            this.O.a(0, (short) this.k, this.as);
                        } else if (LoadingPage.o == 1) {
                            this.e((int) 7);
                        } else if (LoadingPage.o == 2) {
                            int var27 = -1;

                            for (int var33 = 0; var33 < GlobalStatus.cz.length; ++var33) {
                                if (GlobalStatus.cB[var33] == var5.av) {
                                    var27 = GlobalStatus.cz[var33];
                                    break;
                                }
                            }

                            byte[] var34;
                            if ((var34 = NetPayloadBuilder.f((short) 4136, GlobalStatus.ad, (int) var27)) != null) {
                                MainCanvas.netUtils.sendPacket(new NetPacket((short) 4136, var34));
                                var5.e.a((String) null);
                            } else {
                                var5.e.processException("获取上传指令数据错误!");
                            }
                        } else if (LoadingPage.o == 3) {
                            this.aw = true;
                            ch.a();
                            int var28 = -1;

                            for (int var35 = 0; var35 < GlobalStatus.cz.length; ++var35) {
                                if (GlobalStatus.cB[var35] == var5.av) {
                                    var28 = GlobalStatus.cz[var35];
                                    break;
                                }
                            }

                            Object var36 = null;
                            byte[] var37;
                            if ((var37 = NetPayloadBuilder.a((short) 4689, var28, (byte) 0, (byte) -1, GlobalStatus.ad)) != null) {
                                NetPacket var17 = new NetPacket((short) 4689, var37);
                                MainCanvas.netUtils.sendPacket(var17);
                                var5.e.a((String) null);
                            } else {
                                var5.e.processException("获取上传指令数据错误!");
                            }
                        } else if (LoadingPage.o == 4) {
                            this.aw = true;
                            this.O.d();
                            int var29 = -1;

                            for (int var38 = 0; var38 < GlobalStatus.cz.length; ++var38) {
                                if (GlobalStatus.cB[var38] == var5.av) {
                                    var29 = GlobalStatus.cz[var38];
                                    break;
                                }
                            }

                            o_1.h = 1;
                            byte[] var39;
                            if ((var39 = NetPayloadBuilder.a((short) 4688, var29, -1L, (byte) 0, o_1.h, 0, (byte[]) null, GlobalStatus.ad)) != null) {
                                MainCanvas.netUtils.sendPacket(new NetPacket((short) 4688, var39));
                                var5.e.a((String) null);
                            } else {
                                var5.e.processException("获取上传指令数据错误!");
                            }
                        } else if (LoadingPage.o == 5) {
                            if (this.P == null) {
                                this.P = new r(this, this.e, MainCanvas.f);
                            }

                            this.P.b();
                            this.aw = true;
                            int var30 = -1;

                            for (int var40 = 0; var40 < GlobalStatus.cz.length; ++var40) {
                                if (GlobalStatus.cB[var40] == var5.av) {
                                    var30 = GlobalStatus.cz[var40];
                                    break;
                                }
                            }

                            byte[] var41;
                            if ((var41 = NetPayloadBuilder.a((short) 4262, var30, -1L, (byte) 0, (int[]) null, (byte[]) null, -1, (byte) 0, GlobalStatus.ad)) != null) {
                                MainCanvas.netUtils.sendPacket(new NetPacket((short) 4262, var41));
                                var5.e.a((String) null);
                            } else {
                                var5.e.processException("获取上传指令数据错误!");
                            }
                        }
                    } else if (this.l == 2) {
                        if (this.e.aq != null) {
                            this.e.aq.b(var16);
                        }

                        if (var16 == 536870912) {
                            this.l = 1;
                        }
                    }
                    break;
                case 6:
                    this.J(this.e.touchAction);
                    break;
                case 7:
                    this.H(this.e.touchAction);
                    break;
                case 8:
                    int var15 = this.e.touchAction;
                    if (this.l == 0) {
                        this.a(GlobalStatus.cb);
                        if (this.e.aq != null) {
                            this.e.aq.b(var15);
                        }

                        if (var15 != 268435456 && var15 != 1073741824 && var15 != 517) {
                            if (var15 != 268435456 && var15 != 536870912) {
                                if (var15 != 8 && var15 != 516) {
                                    if (var15 != 2 && var15 != 518) {
                                        if (var15 != 1 && var15 != 514) {
                                            if (var15 == 4 || var15 == 520) {
                                                this.ar = this.ar >= 3 ? 0 : ++this.ar;
                                                this.aG();
                                            }
                                        } else {
                                            this.ar = this.ar <= 0 ? 3 : --this.ar;
                                            this.aG();
                                        }
                                    } else {
                                        this.aq = this.aq >= 7 ? 0 : ++this.aq;
                                        this.aG();
                                    }
                                } else {
                                    this.aq = this.aq <= 0 ? 7 : --this.aq;
                                    this.aG();
                                }
                            } else {
                                this.al = null;
                                if (GlobalStatus.bW) {
                                    this.N();
                                    GlobalStatus.bW = false;
                                } else {
                                    this.m();
                                }
                            }
                        } else if (GlobalStatus.bY != null && (this.ar << 3) + this.aq < GlobalStatus.bY.length) {
                            if (GlobalStatus.ca[(this.ar << 3) + this.aq] == 1) {
                                this.a(99L);
                                this.l = 2;
                            } else {
                                this.Z(1);
                            }
                        }
                    } else if (this.l == 2) {
                        this.b(var15);
                        if (var15 != 268435456 && var15 != 1073741824 && var15 != 517) {
                            if (var15 == 536870912) {
                                this.l = 0;
                            }
                        } else {
                            this.Z(this.ag);
                        }
                    }
                    break;
                case 9:
                    this.aa(this.e.touchAction);
                    break;
                case 10:
                    this.w(this.e.touchAction);
                    break;
                case 11:
                    this.ab(this.e.touchAction);
                    break;
                case 12:
                    if (this.c) {
                        this.o((int) -1);
                    }

                    this.O(this.e.touchAction);
                    break;
                case 13:
                    this.T(this.e.touchAction);
                    break;
                case 14:
                    this.ae(this.e.touchAction);
                    break;
                case 15:
                    this.ah(this.e.touchAction);
                case 16:
                case 17:
                case 26:
                case 27:
                case 44:
                case 54:
                case 55:
                case 56:
                case 73:
                case 74:
                case 78:
                case 79:
                case 80:
                case 81:
                case 82:
                case 83:
                case 84:
                case 85:
                case 86:
                case 87:
                case 88:
                case 89:
                case 97:
                case 99:
                case 112:
                case 124:
                default:
                    break;
                case 18:
                    if (this.c) {
                        this.o((int) -1);
                    }

                    this.aj(this.e.touchAction);
                    break;
                case 19:
                    this.ak(this.e.touchAction);
                    break;
                case 20:
                    this.al(this.e.touchAction);
                    break;
                case 21:
                    this.am(this.e.touchAction);
                    break;
                case 22:
                    this.ao(this.e.touchAction);
                    break;
                case 23:
                    this.ag(this.e.touchAction);
                    break;
                case 24:
                    this.ai(this.e.touchAction);
                    break;
                case 25:
                    this.o(this.e.touchAction);
                    this.f((short) -1);
                    this.aA();
                    break;
                case 28:
                    this.as(this.e.touchAction);
                    break;
                case 29:
                    this.R(this.e.touchAction);
                    break;
                case 30:
                    int var14 = this.e.touchAction;
                    if (t_2 != null) {
                        PngUtil.a(t_2, this.e.ak);
                    }

                    if (s != null) {
                        PngUtil.a(s, this.e.ak);
                    }

                    if (var14 == 268435456 || var14 == 1073741824 || var14 == 536870912 || var14 == 517) {
                        if (this.by == 1) {
                            this.N();
                            this.by = 0;
                        } else {
                            this.at();
                            this.c((int) 7);
                        }
                    }
                    break;
                case 31:
                    this.aq(this.e.touchAction);
                    break;
                case 32:
                    this.ar(this.e.touchAction);
                    break;
                case 33:
                    this.aS(this.e.touchAction);
                    break;
                case 34:
                    this.P(this.e.touchAction);
                    break;
                case 35:
                    this.Q(this.e.touchAction);
                    break;
                case 36:
                    if (this.c) {
                        this.o((int) -1);
                    }

                    this.K(this.e.touchAction);
                    break;
                case 37:
                    this.x(this.e.touchAction);
                    break;
                case 38:
                    this.at(this.e.touchAction);
                    break;
                case 39:
                    if (GlobalConfig.o && this.e.touchController != null) {
                        this.e.touchController.a();
                    }

                    this.V();
                    break;
                case 40:
                    this.aw(this.e.touchAction);
                    break;
                case 41:
                    this.M.b(this.e.touchAction);
                    break;
                case 42:
                    this.M.c(this.e.touchAction);
                    break;
                case 43:
                    this.M.d(this.e.touchAction);
                    break;
                case 45:
                    this.M.e(this.e.touchAction);
                    break;
                case 46:
                    this.M.f(this.e.touchAction);
                    break;
                case 47:
                    this.M.i(this.e.touchAction);
                    break;
                case 48:
                    this.M.k(this.e.touchAction);
                    break;
                case 49:
                    this.M.l(this.e.touchAction);
                    break;
                case 50:
                    this.M.m(this.e.touchAction);
                    break;
                case 51:
                    this.M.n(this.e.touchAction);
                    break;
                case 52:
                    this.M.r(this.e.touchAction);
                    break;
                case 53:
                    this.ax(this.e.touchAction);
                    break;
                case 57:
                    this.r(this.e.touchAction);
                    break;
                case 58:
                    this.q(this.e.touchAction);
                    break;
                case 59:
                    this.ay(this.e.touchAction);
                    break;
                case 60:
                    this.M.s(this.e.touchAction);
                    break;
                case 61:
                    this.M.v();
                    break;
                case 62:
                    this.M.t(this.e.touchAction);
                    break;
                case 63:
                    this.M.u(this.e.touchAction);
                    break;
                case 64:
                    this.O.a(this.e.touchAction);
                    break;
                case 65:
                    this.O.b(this.e.touchAction);
                    break;
                case 66:
                    this.O.c(this.e.touchAction);
                    break;
                case 67:
                    this.O.d(this.e.touchAction);
                    break;
                case 68:
                    this.az(this.e.touchAction);
                    break;
                case 69:
                    this.aB(this.e.touchAction);
                    break;
                case 70:
                    this.aC(this.e.touchAction);
                    break;
                case 71:
                    this.aJ(this.e.touchAction);
                    break;
                case 72:
                    this.aG(this.e.touchAction);
                    break;
                case 75:
                    this.aD(this.e.touchAction);
                    break;
                case 76:
                    this.aI(this.e.touchAction);
                    break;
                case 77:
                    this.aH(this.e.touchAction);
                    break;
                case 90:
                    this.S.b(this.e.touchAction);
                    break;
                case 91:
                    this.S.c(this.e.touchAction);
                    break;
                case 92:
                    this.S.d(this.e.touchAction);
                    break;
                case 93:
                    this.S.e(this.e.touchAction);
                    break;
                case 94:
                    this.u(this.e.touchAction);
                    break;
                case 95:
                    this.X(this.e.touchAction);
                    break;
                case 96:
                    this.x(this.e.touchAction);
                    break;
                case 98:
                    this.aP(this.e.touchAction);
                    break;
                case 100:
                    this.aE(this.e.touchAction);
                    break;
                case 101:
                    this.U.a(this.e.touchAction);
                    break;
                case 102:
                    this.V.a(this.e.touchAction);
                    break;
                case 103:
                    this.aO(this.e.touchAction);
                    break;
                case 104:
                    this.aM(this.e.touchAction);
                    break;
                case 105:
                    this.aL(this.e.touchAction);
                    break;
                case 106:
                    this.O.e(this.e.touchAction);
                    break;
                case 107:
                    this.aQ(this.e.touchAction);
                    break;
                case 108:
                    this.aR(this.e.touchAction);
                    break;
                case 109:
                    this.aR(this.e.touchAction);
                    break;
                case 110:
                    this.aU(this.e.touchAction);
                    break;
                case 111:
                    this.aT(this.e.touchAction);
                    break;
                case 113:
                    this.M.v(this.e.touchAction);
                    break;
                case 114:
                    this.M.o(this.e.touchAction);
                    break;
                case 115:
                    this.M.p(this.e.touchAction);
                    break;
                case 116:
                    this.aW(this.e.touchAction);
                    break;
                case 117:
                    this.aX(this.e.touchAction);
                    break;
                case 118:
                    this.aV(this.e.touchAction);
                    break;
                case 119:
                    this.aY(this.e.touchAction);
                    break;
                case 120:
                    this.aZ(this.e.touchAction);
                    break;
                case 121:
                    this.M(this.e.touchAction);
                    break;
                case 122:
                    this.N(this.e.touchAction);
                    break;
                case 123:
                    this.L(this.e.touchAction);
                    break;
                case 125:
                    this.ba(this.e.touchAction);
                    break;
                case 126:
                    this.F(this.e.touchAction);
                    break;
                case 127:
                    this.bb(this.e.touchAction);
                    break;
                case 128:
                    this.bc(this.e.touchAction);
                    break;
                case 129:
                    if (this.R != null) {
                        bd var1;
                        if ((var1 = this.R).c == 1) {
                            var1.c = 0;
                            String var3 = var1.d.getString();
                            byte[] var4;
                            if ((var4 = var1.a((short) 4375, GlobalStatus.ad, var3)) != null) {
                                NetPacket var2 = new NetPacket((short) 4375, var4);
                                MainCanvas.netUtils.sendPacket(var2);
                            } else {
                                var1.b.processException("获取上传指令数据错误!");
                            }

                            var1.b.a((String) null);
                            var1.c();
                            var1.b();
                            var1.a.k = 0;
                        } else if (var1.c == 2) {
                            var1.c = 0;
                            var1.b();
                            var1.a.k = 0;
                        }
                    }
                    break;
                case 130:
                    this.N.a(this.e.touchAction);
                    break;
                case 131:
                    this.W.b(this.e.touchAction);
            }

            this.e.touchAction = 0;
        }
    }

    public final void a(Graphics var1) {
        if (!this.e.o) {
            var1.setColor(0);
            var1.fillRect(0, 0, GlobalConfig.defaultWidth, GlobalConfig.defaultHigh);
            this.e.o = true;
        } else if (this.f != null && (this.f.a < GlobalConfig.defaultWidth || this.f.b < GlobalConfig.defaultHigh)) {
            var1.setColor(0);
            var1.fillRect(0, 0, GlobalConfig.defaultWidth, GlobalConfig.defaultHigh);
        }

        if (this.f != null) {
            if (this.k != 1 && this.k != 18 && this.k != 5 && this.k != 25 && this.k != 7 && this.k != 130) {
                MainCanvas.f.a(var1, this.f, h, i, 0, 0, true, true);
            } else {
                MainCanvas.f.a(var1, this.f, h, i);
            }
        }

        if (this.k != 25 && this.k != 18 && !this.c) {
            if (L != null && L.d != null) {
                var1.setColor(16776960);
                var1.drawRect(L.e - h + this.g(), L.f - i + this.h(), L.d.g(), L.d.h());
            }

            if (this.k != 5 && (this.k != 7 || this.l != 10) && (this.k != 7 || this.l != 4) && (this.k != 7 || this.l != 12) && (this.k != 21 || this.l != 5) && (this.k != 47 || this.l != 4) && this.k != 13 && this.k != 32 && (this.k != 130 || this.l != 4)) {
                Graphics var4 = var1;
                ao_1 var5 = this;
                if (GlobalStatus.ab != null && bn != null && this.f.i != null) {
                    for (int var6 = 0; var6 < GlobalStatus.ab.length; ++var6) {
                        MainCanvas.f.a(var4, (Frame1) bn, (int[]) null, h - var5.g(), i - var5.h(), GlobalStatus.ab[var6], GlobalStatus.ac[var6] + 16 - bn.h(), 20, 0);
                    }
                }

                this.y(var1);
            }

            if (aW[6] == 0 && !GlobalStatus.G()) {
                Graphics var19 = var1;
                ao_1 var25 = this;
                if (this.f != null && this.k == 0) {
                    int var7 = 2 + GlobalConfig.j;
                    MainCanvas.f.a(var1, this.I.j / this.e.m, this.I.k / this.e.m, 2, var7, 17 / this.e.m, 25 / this.e.m, 0, 0);
                    var1.setColor(16711680);
                    LoadingPage.a(var1, (String) (this.I.j / 16 + "," + (this.I.k + 25) / 16), (int) 2, var7 + MainCanvas.f.f, 20, 16777215, 0);
                    if (GlobalStatus.ab != null) {
                        var1.setColor(16711680);

                        for (int var33 = 0; var33 < GlobalStatus.ab.length; ++var33) {
                            if (var25.e.ak % 8L == 0L) {
                                var19.fillRect(2 + GlobalStatus.ab[var33] / var25.e.m, var7 + GlobalStatus.ac[var33] / var25.e.m, 2, 2);
                            }
                        }
                    }

                    if (GlobalStatus.t != null) {
                        var19.setColor(13883606);

                        for (int var34 = 0; var34 < GlobalStatus.t.length && GlobalStatus.t[var34] != null; ++var34) {
                            if (GlobalStatus.t[var34].t != -1 && GlobalStatus.t[var34].t != 1 || var25.e.ak % 5L == 0L) {
                                var19.fillRect(2 + GlobalStatus.t[var34].c / var25.e.m, var7 + GlobalStatus.t[var34].d / var25.e.m, 2, 2);
                            }
                        }
                    }
                }

                if (GlobalStatus.G()) {
                    var1.setColor(16711680);
                    var1.drawString(GlobalStatus.id + "/" + GlobalStatus.ic, GlobalConfig.defaultWidth, (GlobalConfig.j << 1) + 2 + MainCanvas.f.f + 30, 24);
                }
            } else if (GlobalStatus.G()) {
                var1.setColor(16711680);
                var1.drawString(GlobalStatus.id + "/" + GlobalStatus.ic, GlobalConfig.defaultWidth, GlobalConfig.j + 30, 24);
            }

            if (this.k != 1) {
                var1.setClip(0, 0, GlobalConfig.defaultWidth, GlobalConfig.defaultHigh);
                this.A(var1);
                var1.setClip(0, 0, GlobalConfig.defaultWidth, GlobalConfig.defaultHigh);
                LoadingPage.a(var1, (String) GlobalStatus.ae, (int) 20, 2, 20, 0, GlobalStatus.bw >= 1 ? 16711680 : 16777215);
            }
        }

        if (this.k == 0 || this.k == 25) {
            if (aW[5] == 0) {
                this.x(var1);
            } else if (aW[11] == 0) {
                this.x(var1);
            }
        }

        aq var10000 = this.M;
        int var36 = GlobalStatus.ki;
        int var35 = GlobalStatus.kh;
        aq var26 = var10000;
        if (var10000.a.k == 0 && GlobalStatus.bw == 2 && var35 != 0 && var36 != 0) {
            LoadingPage.a(var1, (String) "阵营", (int) (GlobalConfig.defaultWidth >> 1), 2, 17, 1017663, 0);
            LoadingPage.a(var1, (String) ("" + var35), (int) (GlobalConfig.defaultWidth / 2 - 4), 2 + GlobalConfig.j, 24, 16776960, 0);
            LoadingPage.a(var1, (String) ":", (int) (GlobalConfig.defaultWidth >> 1), 2 + GlobalConfig.j, 17, 16776960, 0);
            LoadingPage.a(var1, (String) ("" + var36), (int) (GlobalConfig.defaultWidth / 2 + 5), 2 + GlobalConfig.j, 20, 16776960, 0);
        } else if (var26.a.k == 0 && GlobalStatus.ke != -1 && GlobalStatus.kf != -1 && GlobalStatus.kg != -1) {
            LoadingPage.a(var1, (String) "阵营", (int) (GlobalConfig.defaultWidth >> 1), 2, 17, 16776960, 0);
            LoadingPage.a(var1, (String) ("" + GlobalStatus.ke), (int) (GlobalConfig.defaultWidth / 2 - 4), 2 + GlobalConfig.j, 24, 16776960, 0);
            LoadingPage.a(var1, (String) ":", (int) (GlobalConfig.defaultWidth >> 1), 2 + GlobalConfig.j, 17, 16776960, 0);
            LoadingPage.a(var1, (String) ("" + GlobalStatus.kf), (int) (GlobalConfig.defaultWidth / 2 + 5), 2 + GlobalConfig.j, 20, 16776960, 0);
            LoadingPage.a(var1, (String) ("个人:" + GlobalStatus.kg), (int) (GlobalConfig.defaultWidth >> 1), 2 + (GlobalConfig.j << 1), 17, 16776960, 0);
        }

        if (GlobalStatus.bu) {
            LoadingPage.a(var1, (String) String.valueOf(GlobalStatus.bv), (int) (GlobalConfig.defaultWidth / 2), 0, 17, 0, 16711680);
        }

        if (this.k != 25) {
            if (!GlobalStatus.P.o && !GlobalStatus.O.u) {
                if (this.n) {
                    var1.drawImage(MainCanvas.aa, GlobalConfig.defaultWidth - 10, 40, 24);
                    if (this.k == 18) {
                        this.n = false;
                    }
                }
            } else {
                Image var20 = bo_1.g[0];
                if (GlobalStatus.P.o) {
                    var20 = be_1.e[0];
                }

                var1.drawImage(var20, GlobalConfig.defaultWidth - 10, 40, 24);
            }
        }

        if (this.k == 0 && this.J != null) {
            LoadingPage.a(var1, this.J, new String[]{"确定", "取消"});
        }

        switch (this.k) {
            case 0:
                if (GlobalStatus.k != null && this.dd != null && aW[18] == 0) {
                    LoadingPage.a(var1, 873078, 191, 0, this.dc, GlobalConfig.defaultWidth, GlobalConfig.j + 2);
                    this.dd.a(var1, this.db, this.dc + 1, 20);
                    if (this.db <= -GlobalConfig.i.stringWidth(GlobalStatus.k)) {
                        if (GlobalStatus.l <= 0) {
                            GlobalStatus.k = null;
                            this.dd = null;
                        }

                        --GlobalStatus.l;
                        this.db = GlobalConfig.defaultWidth;
                    } else {
                        this.db -= 3;
                    }
                }

                if (GlobalStatus.E == 1 && GlobalStatus.F != null && GlobalStatus.G != null) {
                    var1.setClip(0, 40 + GlobalConfig.j, 70, GlobalConfig.j << 1);
                    LoadingPage.a(var1, (String) GlobalStatus.F, (int) this.bs, 40 + GlobalConfig.j, 20, 16776960, 0);
                    LoadingPage.a(var1, (String) GlobalStatus.G, (int) 5, 40 + (GlobalConfig.j << 1), 20, 16776960, 0);
                    if (GlobalConfig.i.stringWidth(GlobalStatus.F) > 70) {
                        if (this.bs + GlobalConfig.i.stringWidth(GlobalStatus.F) - 10 < 0 || this.bs > 75) {
                            this.bi = (byte) (this.bi == -1 ? 1 : -1);
                        }

                        this.bs = (short) (this.bs + this.bi);
                    }
                }

                return;
            case 1:
                this.b(var1);
                return;
            case 2:
                if (this.l == 0) {
                    LoadingPage.a(var1, 0, GlobalConfig.defaultHigh - LoadingPage.f, GlobalConfig.defaultWidth, LoadingPage.f, K, this.am, (String[]) null);
                } else {
                    if (this.l != 1 && this.l != 3 && this.l != 4 && this.l != 5 && this.l != 7 && this.l != 9 && this.l != 10) {
                        return;
                    }

                    LoadingPage.a(var1, 0, GlobalConfig.defaultHigh - LoadingPage.f, GlobalConfig.defaultWidth, LoadingPage.f, K, this.an, (String[]) null);
                    if (this.m != 1 && this.m != 2) {
                        if (this.m == 3) {
                            this.b(var1, "请输入竞标银两");
                        } else {
                            if (this.m != 4) {
                                if (this.m == 5 || this.m == 6) {
                                    LoadingPage.a(var1, this.at, new String[]{"确定", "取消"});
                                }

                                return;
                            }

                            this.a(var1, "请输入竞标金豆");
                        }
                    } else {
                        this.b(var1, this.m == 1 ? "请输入取出银两" : "请输入存入银两");
                    }
                }
                break;
            case 3:
                if (this.e.aq != null) {
                    this.e.aq.a(var1);
                    if (this.e.as.a == 0 && this.e.at.a == 0) {
                        int var24 = this.e.at.b + 5 + GlobalConfig.i.stringWidth("昵称：" + GlobalStatus.af);
                        Image var31;
                        if (GlobalStatus.aC == 1 && (var31 = MainCanvas.d(GlobalStatus.bA)) != null) {
                            var1.drawImage(var31, var24, this.e.at.c + 5, 20);
                            var24 += var31.getWidth();
                        }

                        if (GlobalStatus.aH == 1 && (var31 = MainCanvas.c(GlobalStatus.aI)) != null) {
                            var1.drawImage(var31, var24, this.e.at.c + 5, 20);
                        }
                    }
                }

                return;
            case 4:
                if (this.c) {
                    this.t(var1);
                }

                if (this.as == 15) {
                    this.c(var1, "放入装备");
                    return;
                }

                this.c(var1, GlobalConfig.L[this.as]);
                return;
            case 5:
                this.e(var1);
                return;
            case 6:
                if (GlobalStatus.bR != null || GlobalStatus.bL != null) {
                    if (this.e.aq != null) {
                        this.e.aq.a(var1);
                    }

                    if (this.l == 1 || this.l == 2) {
                        LoadingPage.c(var1);
                    }
                }

                return;
            case 7:
                this.f(var1);
                return;
            case 8:
                this.q(var1);
                return;
            case 9:
                this.c(var1, "卖东西");
                return;
            case 10:
                if (this.e.aq != null) {
                    this.e.aq.a(var1);
                }

                return;
            case 11:
                this.r(var1);
                return;
            case 12:
                if (this.c) {
                    this.t(var1);
                }

                this.k(var1);
                return;
            case 13:
                this.o(var1);
                return;
            case 14:
                if (this.e.aq != null) {
                    this.e.aq.a(var1);
                }

                return;
            case 15:
                if (this.e.aq != null) {
                    this.e.aq.a(var1);
                }

                return;
            case 16:
            case 17:
            case 26:
            case 44:
            case 54:
            case 55:
            case 56:
            case 73:
            case 74:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 97:
            case 99:
            case 112:
            case 124:
            case 129:
            default:
                break;
            case 18:
                if (this.c) {
                    this.t(var1);
                }

                this.u(var1);
                return;
            case 19:
                if (this.e.aq != null) {
                    this.e.aq.a(var1);
                }

                if (this.l != 1 && this.l != 2 && this.l != 3 && this.l != 4 && this.l != 5 && this.l != 6 && this.l != 7 && this.l != 9) {
                    if (this.l != 8) {
                        if (this.l == 10) {
                            this.T.a(var1);
                        }

                        return;
                    }

                    LoadingPage.a(var1, "删除好友将清空对该好友的好感度，确认删除？", new String[]{"确定", "取消"});
                } else {
                    LoadingPage.c(var1);
                }
                break;
            case 20:
                if (K != null) {
                    LoadingPage.a(var1, 0, GlobalConfig.defaultHigh - LoadingPage.f, GlobalConfig.defaultWidth, LoadingPage.f, K, this.an, (String[]) null);
                }

                return;
            case 21:
                if (GlobalStatus.q == null) {
                    return;
                }

                if (this.l != 5) {
                    this.e.aq.a(var1);
                }

                if (this.l != 1 && this.l != 2 && this.l != 3) {
                    if (this.l != 4) {
                        if (this.l == 5 && GlobalStatus.q != null && this.e.ar.g() < GlobalStatus.q.length) {
                            this.a(var1, GlobalStatus.q[this.e.ar.g()].e, q);
                        }

                        return;
                    }

                    this.T.a(var1);
                    break;
                }

                LoadingPage.c(var1);
                break;
            case 22:
                this.v(var1);
                return;
            case 23:
                if (GlobalStatus.dY == null) {
                    return;
                }

                this.e.aq.a(var1);
                if (this.l == 1) {
                    LoadingPage.c(var1);
                } else if (this.l == 2) {
                    this.a(var1, "购买个数");
                } else {
                    if (this.l != 3) {
                        if (this.l == 4) {
                            LoadingPage.a(var1, "您确认以" + GlobalStatus.a(GlobalStatus.eg[this.e.ar.g()]) + "两的价格购买该物品" + this.ag + "个", new String[]{"确定", "取消"});
                        }

                        return;
                    }

                    LoadingPage.a(var1, "您确认以" + GlobalStatus.eg[this.e.ar.g()] + "两的价格购买该物品" + GlobalStatus.eb[this.e.ar.g()] + "个", new String[]{"确定", "取消"});
                }
                break;
            case 24:
                this.s(var1);
                return;
            case 25:
                this.t(var1);
                return;
            case 27:
                return;
            case 28:
                if (this.e.aq == null) {
                    return;
                }

                this.e.aq.a(var1);
                if (this.e.ar.h() != 0) {
                    if (this.e.ar.h() == 1) {
                        int var23 = this.e.ar.a() + this.e.ar.c() - MainCanvas.C.b - 70;
                        int var30 = this.e.ar.b() + 4;
                        LoadingPage.a(var1, "" + aW[1], var23, var30, 60);
                        this.b((int) 1, (int) var23, (int) var30, (int) 60);
                    }

                    return;
                }

                int var22 = this.e.ar.a() + this.e.ar.c() - MainCanvas.C.b - 70;
                int var29 = this.e.ar.b() + 4;
                LoadingPage.a(var1, "" + aW[0], var22, var29, 60);
                LoadingPage.a(var1, "" + aW[1], var22, var29 + GlobalConfig.j, 60);
                this.b((int) 0, (int) var22, (int) var29, (int) 60);
                this.b((int) 1, (int) var22, (int) (var29 + GlobalConfig.j), (int) 60);
                break;
            case 29:
                if (GlobalStatus.dF != null && this.e.aq != null) {
                    this.e.aq.a(var1);
                }

                return;
            case 30:
                this.n(var1);
                return;
            case 31:
                if (this.l != 3 && this.e.aq != null) {
                    this.e.aq.a(var1);
                }

                if (this.l != 1) {
                    if (this.l == 2) {
                        LoadingPage.c(var1);
                    }

                    return;
                }

                this.a(var1, "兑换数量");
                break;
            case 32:
                this.w(var1);
                return;
            case 33:
                if (this.e.aq != null) {
                    this.e.aq.a(var1);
                    LoadingPage.a(var1, this.e.aq.a + 5, this.e.aq.b + 32, this.e.aq.c - 11, this.bQ, 1);
                    LoadingPage.c(var1, this.e.aq.a + 62, this.e.aq.b + 35, this.e.aq.a + 62, this.e.aq.b + 29 + this.bQ);
                }

                if (bp != null) {
                    MainCanvas.f.a(var1, (Frame1) bp, (int[]) null, 0, 0, this.e.aq.a + 5 + 30, this.e.aq.b + 35 + (this.bQ + bp.j()) / 2, 20, 0);
                }

                int var21 = this.e.aq.a + 8;
                Image var27;
                if (GlobalStatus.aC == 1 && (var27 = MainCanvas.d(GlobalStatus.kU)) != null) {
                    var1.drawImage(var27, var21, this.e.aq.b + 35, 20);
                    var21 += var27.getWidth();
                }

                if (GlobalStatus.aH == 1 && (var27 = MainCanvas.c(GlobalStatus.aI)) != null) {
                    var1.drawImage(var27, var21, this.e.aq.b + 34, 20);
                }

                var1.setColor(1539988);
                var1.fillRect(this.e.aq.a + 68, this.e.aq.b + 30 + this.bQ / 2, this.e.aq.c - 80, GlobalConfig.j);
                var1.setColor(16776960);
                var1.drawString("超Q等级：" + GlobalStatus.kU, this.e.aq.a + 70, this.e.aq.b + 30 + this.bQ / 2 - GlobalConfig.j, 20);
                var1.drawString("超Q特权礼包：" + (GlobalStatus.kV == 1 ? "领取" : "未领取"), this.e.aq.a + 70, this.e.aq.b + 30 + this.bQ / 2, 20);
                if (this.l == 1) {
                    LoadingPage.c(var1);
                }

                return;
            case 34:
                this.l(var1);
                return;
            case 35:
                this.m(var1);
                return;
            case 36:
                this.g(var1);
                return;
            case 37:
                this.a((Graphics) var1, (int) 0);
                return;
            case 38:
                if (this.e.aq != null) {
                    this.e.aq.a(var1);
                }

                if (this.l == 1 || this.l == 2 || this.l == 3 || this.l == 4 || this.l == 5 || this.l == 6 || this.l == 7 || this.l == 8 || this.l == 10) {
                    LoadingPage.c(var1);
                }

                if (this.l == 9) {
                    LoadingPage.a(var1, "您确定招募" + GlobalStatus.hU[this.e.ar.g()] + "？", new String[]{"确定", "返回"});
                }

                return;
            case 39:
                this.z(var1);
                if (this.cX == 5) {
                    this.ba.a(var1, MainCanvas.f, h - this.g() - this.ba.d.g() / 2 - 2, i - this.h() - this.ba.d.h(), (byte) 0);
                } else {
                    this.ba.a(var1, MainCanvas.f, h - this.g(), i - this.h(), (byte) 0);
                }

                if (this.cY) {
                    if (this.e.ak % 5L == 0L) {
                        var1.setColor(65280);
                    } else {
                        var1.setColor(2162687);
                    }
                } else {
                    var1.setColor(16711680);
                }

                if (this.cX != 5) {
                    var1.drawRect(this.ba.e - h + this.g() - 1, this.ba.f - i + this.h() - 1, this.ba.d.g() + 2, this.ba.d.h() + 2);
                    var1.drawRect(this.ba.e - h + this.g(), this.ba.f - i + this.h(), this.ba.d.g(), this.ba.d.h());
                    return;
                }

                var1.drawRect(this.ba.e - h + this.g() - 1 + this.ba.d.g() / 7, this.ba.f - i + this.h() - 1, this.ba.d.g() + 2, this.ba.d.h() + 2);
                var1.drawRect(this.ba.e - h + this.g() + this.ba.d.g() / 7, this.ba.f - i + this.h(), this.ba.d.g(), this.ba.d.h());
                break;
            case 40:
                if (this.l != 0) {
                    if (this.l == 1 && this.e.aq != null) {
                        this.e.aq.a(var1);
                    }

                    return;
                }

                LoadingPage.a(var1, 0, GlobalConfig.defaultHigh - LoadingPage.f, GlobalConfig.defaultWidth, LoadingPage.f, K, this.an, (String[]) null);
                break;
            case 41:
                aq var18;
                if ((var18 = this.M).b.aq != null) {
                    var18.b.aq.a(var1);
                }

                if (var18.a.l == 0) {
                    return;
                }

                if (var18.a.l == 1) {
                    LoadingPage.a(var1, "您真的要退出帮派吗？", new String[]{"确定", "返回"});
                } else {
                    if (var18.a.l != 2) {
                        if (var18.a.l == 3) {
                            LoadingPage.a(var1, "您真的要发布招募吗？", new String[]{"确定", "返回"});
                        }

                        return;
                    }

                    LoadingPage.a(var1, "您真的要解散帮派吗？", new String[]{"确定", "返回"});
                }
                break;
            case 42:
                aq var17;
                if ((var17 = this.M).a.l == 0 || var17.a.l == 1) {
                    if (var17.b.aq != null) {
                        var17.b.aq.a(var1);
                    }

                    if (var17.a.l == 1) {
                        LoadingPage.c(var1);
                    }
                }

                return;
            case 43:
                aq var16;
                if ((var16 = this.M).a.l == 0 || var16.a.l == 1) {
                    if (var16.b.aq != null) {
                        var16.b.aq.a(var1);
                    }

                    if (var16.a.l == 1) {
                        LoadingPage.c(var1);
                    }
                }

                return;
            case 45:
                aq var15;
                if ((var15 = this.M).a.l == 0 && var15.b.aq != null) {
                    var15.b.aq.a(var1);
                }

                return;
            case 46:
                aq var14;
                if ((var14 = this.M).a.l != 0 && var14.a.l != 1) {
                    if (var14.a.l == 2) {
                        var14.a.T.a(var1);
                    }

                    return;
                }

                if (var14.b.aq != null) {
                    var14.b.aq.a(var1);
                }

                if (var14.a.l != 1) {
                    return;
                }

                LoadingPage.c(var1);
                break;
            case 47:
                aq var13;
                if ((var13 = this.M).a.l != 4 && var13.b.aq != null) {
                    var13.b.aq.a(var1);
                }

                if (var13.a.l != 1 && var13.a.l != 2 && var13.a.l != 5 && var13.a.l != 6 && var13.a.l != 7 && var13.a.l != 8) {
                    if (var13.a.l == 3) {
                        var13.a.T.a(var1);
                    } else {
                        if (var13.a.l != 4) {
                            if (var13.a.l == 9) {
                                LoadingPage.a(var1, "需要消耗基金300万和20点军力，一旦宣战必须等到战争结束后才能再次宣战！", new String[]{"确定", "取消"});
                            }

                            return;
                        }

                        var13.a.a(var1, GlobalStatus.iz[var13.b.ar.g()], q);
                    }
                } else {
                    LoadingPage.c(var1);
                }
                break;
            case 48:
                aq var12;
                if ((var12 = this.M).a.l != 0 && var12.a.l != 1 && var12.a.l != 3) {
                    if (var12.a.l == 2 && var12.b.aq != null) {
                        var12.b.aq.a(var1);
                    }

                    return;
                }

                if (var12.b.aq != null) {
                    var12.b.aq.a(var1);
                }

                if (var12.a.l == 1) {
                    LoadingPage.c(var1);
                } else {
                    if (var12.a.l != 3) {
                        return;
                    }

                    LoadingPage.a(var1, "要开除" + GlobalStatus.iz[var12.b.ar.g()] + "出帮派吗？", new String[]{"确定", "取消"});
                }
                break;
            case 49:
                aq var11;
                if ((var11 = this.M).a.l == 0 && var11.b.aq != null) {
                    var11.b.aq.a(var1);
                }

                return;
            case 50:
                aq var10;
                if ((var10 = this.M).b.aq != null) {
                    var10.b.aq.a(var1);
                }

                if (var10.a.l == 1) {
                    var10.a.b(var1, "捐献银两数量");
                } else if (var10.a.l == 2) {
                    var10.a.b(var1, "捐献经验数量");
                } else {
                    if (var10.a.l != 3 && var10.a.l != 4) {
                        if (var10.a.l == 5) {
                            var10.a.b(var1, "取出银两数量");
                            break;
                        }

                        if (var10.a.l != 6 && var10.a.l != 7) {
                            return;
                        }
                    } else {
                        var10.a.a(var1, "请选择发布天数");
                        if (var10.a.m != 1) {
                            return;
                        }
                    }

                    LoadingPage.a(var1, var10.a.at, new String[]{"确定", "取消"});
                    return;
                }
                break;
            case 51:
                this.M.c(var1);
                return;
            case 52:
                aq var9;
                if ((var9 = this.M).b.aq != null) {
                    var9.b.aq.a(var1);
                }

                if (var9.a.l == 1 || var9.a.l == 2) {
                    LoadingPage.c(var1);
                }

                return;
            case 53:
                if (this.e.aq != null) {
                    this.e.aq.a(var1);
                }

                if (this.l != 1) {
                    if (this.l == 2) {
                        this.a(var1, "取回个数");
                    }

                    return;
                }

                LoadingPage.c(var1);
                break;
            case 57:
                if (this.l == 0) {
                    this.e.aq.a(var1);
                }

                return;
            case 58:
                if (this.l == 0) {
                    this.e.aq.a(var1);
                }

                return;
            case 59:
                this.e.aq.a(var1);
                if (this.l != 1 && this.l != 2) {
                    if (this.l == 3) {
                        if (LoadingPage.a(GlobalStatus.jO[this.e.ar.g()]) != -1) {
                            LoadingPage.a(var1, "是否将" + GlobalStatus.jO[this.e.ar.g()].substring(3, GlobalStatus.jO[this.e.ar.g()].length()) + "从拍卖场中撤下？", new String[]{"确定", "取消"});
                        } else {
                            LoadingPage.a(var1, "是否将" + GlobalStatus.jO[this.e.ar.g()] + "从拍卖场中撤下？", new String[]{"确定", "取消"});
                        }
                    } else {
                        if (this.l != 5) {
                            if (this.l == 4) {
                                this.b(var1, "拍卖价格");
                            }

                            return;
                        }

                        LoadingPage.a(var1, "您确定以" + this.bR + "两的价格拍卖此物品?", new String[]{"确定", "取消"});
                    }
                } else {
                    LoadingPage.c(var1);
                }
                break;
            case 60:
                aq var8;
                if ((var8 = this.M).b.aq != null) {
                    var8.b.aq.a(var1);
                }

                if (var8.a.l != 1 && var8.a.l != 2) {
                    if (var8.a.l == 3) {
                        LoadingPage.a(var1, "需要消耗基金300万和20点军力，一旦宣战必须等到战争结束后才能再次宣战！", new String[]{"确定", "取消"});
                    }

                    return;
                }

                LoadingPage.c(var1);
                break;
            case 61:
                String var3 = "离复活还有" + GlobalStatus.kj + "秒！";
                LoadingPage.a(var1, (String) var3, (int) ((GlobalConfig.defaultWidth - GlobalConfig.i.stringWidth(var3)) / 2), (GlobalConfig.defaultHigh - GlobalConfig.j) / 2, 20, 16711680, 0);
                return;
            case 62:
                LoadingPage.a(var1, GlobalStatus.kC, new String[]{"确定", "取消"});
                return;
            case 63:
                aq var2;
                if ((var2 = this.M).a.l == 0 && var2.b.aq != null) {
                    LoadingPage.a(var1, var2.b.aq.a + 5, var2.b.aq.a(), var2.b.aq.c - 11, 2 * GlobalConfig.j + 8, 1);
                    var1.setColor(16711680);
                    var1.drawString("处置战败方：", GlobalConfig.f + GlobalConfig.realWidth / 2, var2.b.aq.a() + 2, 17);
                    var1.drawString("（" + GlobalStatus.kD + "分钟限时）", GlobalConfig.f + GlobalConfig.realWidth / 2, var2.b.aq.a() + 2 + GlobalConfig.j + 4, 17);
                    var2.b.aq.a(var1);
                }

                return;
            case 64:
                this.O.a(var1);
                return;
            case 65:
                this.O.b(var1);
                return;
            case 66:
                return;
            case 67:
                this.O.c(var1);
                return;
            case 68:
                if (this.e.aq != null) {
                    this.e.aq.a(var1);
                }

                return;
            case 69:
                if (this.e.aq != null) {
                    this.e.aq.a(var1);
                }

                if (this.l == 1) {
                    this.a(var1, "兑换数量");
                }

                return;
            case 70:
                this.B(var1);
                return;
            case 71:
                this.E(var1);
                return;
            case 72:
                this.F(var1);
                return;
            case 75:
                if (this.e.aq != null) {
                    this.e.aq.a(var1);
                }

                return;
            case 76:
                this.D(var1);
                return;
            case 77:
                this.C(var1);
                return;
            case 90:
                this.S.a(var1);
                return;
            case 91:
                this.S.b(var1);
                return;
            case 92:
                this.S.c(var1);
                return;
            case 93:
                this.S.d(var1);
                return;
            case 94:
                this.c(var1);
                return;
            case 95:
                this.p(var1);
                return;
            case 96:
                this.a((Graphics) var1, (int) 1);
                return;
            case 98:
                this.K(var1);
                return;
            case 100:
                this.G(var1);
                return;
            case 101:
                this.U.a(var1);
                return;
            case 102:
                this.V.a(var1);
                return;
            case 103:
                this.J(var1);
                return;
            case 104:
                this.H(var1);
                return;
            case 105:
                this.I(var1);
                return;
            case 106:
                this.O.d(var1);
                return;
            case 107:
                this.L(var1);
                return;
            case 108:
            case 109:
                this.M(var1);
                return;
            case 110:
                this.O(var1);
                return;
            case 111:
                N(var1);
                return;
            case 113:
                this.M.d(var1);
                return;
            case 114:
                this.M.a(var1);
                return;
            case 115:
                this.M.b(var1);
                return;
            case 116:
                P(var1);
                return;
            case 117:
                Q(var1);
                return;
            case 118:
                this.R(var1);
                return;
            case 119:
                this.S(var1);
                return;
            case 120:
                this.T(var1);
                return;
            case 121:
                this.i(var1);
                return;
            case 122:
                this.j(var1);
                return;
            case 123:
                this.h(var1);
                return;
            case 125:
                this.U(var1);
                return;
            case 126:
                this.d(var1);
                return;
            case 127:
                this.V(var1);
                return;
            case 128:
                this.W(var1);
                return;
            case 130:
                this.N.a(var1);
                return;
            case 131:
                this.W.a(var1);
        }

    }

    public final void b() {
        this.e.a();
        GlobalStatus.f();
        GlobalStatus.j();
        GlobalStatus.d();
        GlobalStatus.h();
        GlobalStatus.i();
        GlobalStatus.n();
        GlobalStatus.q();
        GlobalStatus.c();
        GlobalStatus.b();
        GlobalStatus.B();
        GlobalStatus.F();
        MainCanvas.af.c();
        GlobalStatus.bs = -1;
        GlobalStatus.s = -1;
        GlobalStatus.k = null;
        this.dd = null;
        GlobalStatus.F = null;
        GlobalStatus.G = null;
        GlobalStatus.ke = -1;
        GlobalStatus.kf = -1;
        GlobalStatus.kg = -1;
        if (this.I != null) {
            this.I = null;
        }

        if (this.f != null) {
            this.f.a();
            this.f = null;
        }

        if (q != null) {
            Frame1 var1 = q;
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
        GlobalStatus.H = null;
        GlobalStatus.M = null;
        GlobalStatus.as = -1;
        bq_1.s = (short) bq_1.a;
        bq.c = 0;
        aW[15] = 1;
        System.gc();
    }

    public final void c() {
        PngUtil.a(bn, this.e.ak);
        this.P();
        if (this.cM) {
            this.aR();
            this.cM = false;
        }

        ao_1 var1 = this;
        if (GlobalStatus.g && System.currentTimeMillis() - GlobalStatus.lastSyncTime >= 180000L) {
            GlobalStatus.h = 3;
        }

        if (!GlobalStatus.g && System.currentTimeMillis() - GlobalStatus.f > 60000L) {
            GlobalStatus.g = true;
            byte[] var2 = NetPayloadBuilder.a((short) 4630);
            if (this.e != null) {
                if (MainCanvas.netUtils != null) {
                    MainCanvas.netUtils.sendPacket(new NetPacket((short) 4630, var2));
                } else {
                    this.e.processException("获取上传指令数据错误!");
                }
            }
        }

        this.aX = false;
        if ((GlobalStatus.bs != 0 || GlobalStatus.s != 0) && !GlobalStatus.bu) {
            if (!i()) {
                this.cK = -2;
            } else {
                this.cK = this.I.a(this.e);
            }
        } else {
            this.cK = -2;
        }

        label95:
        {
            if (this.cK >= 0 && this.I.e()) {
                this.e.b = 0;
                this.I.a = this.I.b = 0;
                if (GlobalStatus.bs == 1 && GlobalStatus.s == 0 && this.e.ak - this.aY < 5000L) {
                    if (!this.cJ) {
                        this.cJ = !this.cJ;
                        this.e.processException("组队时的传送间隔为5秒!");
                    }
                    break label95;
                }

                if (this.k != 25) {
                    short var10001 = GlobalStatus.ab[this.cK];
                    short var10002 = GlobalStatus.ac[this.cK];
                    long var15 = MainMidlet.c;
                    short var14 = this.k;
                    short var13 = var10002;
                    short var11 = var10001;
                    byte[] var12;
                    if ((var12 = NetPayloadBuilder.a((short) 4144, GlobalStatus.ad, var11, var13, var14, var15)) != null) {
                        MainCanvas.netUtils.sendPacket(new NetPacket((short) 4144, var12));
                    } else {
                        this.e.processException("获取上传指令数据错误!");
                    }

                    this.aX = true;
                    this.cJ = false;
                    this.aY = this.e.ak;
                    this.e.a((String) null);
                    break label95;
                }
            } else if (this.e.ak - this.bt >= 4700L) {
                if (!GlobalStatus.a) {
                    byte[] var9 = NetPayloadBuilder.d((short) 4641, GlobalStatus.ad);
                    MainCanvas.netUtils.sendPacket(new NetPacket((short) 4641, var9));
                }

                var1.bt = var1.e.ak;
                if (!var1.aX) {
                    short var4 = var1.k;
                    short var3 = var1.I.k;
                    short var10 = var1.I.j;
                    byte[] var7 = NetPayloadBuilder.a((short) 4101, GlobalStatus.ad, (int) var10, (int) var3, (short) var4);
                    if (var1.e != null) {
                        if (MainCanvas.netUtils != null) {
                            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4101, var7));
                            return;
                        }

                        var1.e.processException("获取上传指令数据错误!");
                    }
                }
            }

            return;
        }

        this.I.d();
    }

    public final void d() {
        if (!i()) {
            if (this.g != null && GlobalStatus.L == 1) {
                if (GlobalStatus.K == 2) {
                    bq_1.e();
                    this.aT();
                    this.g.a();
                    return;
                }

                this.g.l();
                GlobalStatus.y = System.currentTimeMillis();
                return;
            }
        } else if (GlobalStatus.I != null && GlobalStatus.N != null) {
            if (!this.c && this.k != 25) {
                this.f((byte) 0);
                return;
            }
        } else if (this.k == 0 && i() && this.e.touchPageCase == 7 && !this.e.p) {
            s var2;
            if ((GlobalStatus.bs != 0 || GlobalStatus.s != 0) && this.I != null && (var2 = this.I.a(this.aO)) != null && this.I.g()) {
                this.e.b = 0;
                this.I.a = this.I.b = 0;
                s var3 = var2;
                if (var2 != null && var2.b != null && var2.b.length != 0 && GlobalStatus.hl != null) {
                    GlobalStatus.x = 0;
                    GlobalStatus.w = 0L;
                    GlobalStatus.N = new ck[var2.c];
                    int var4 = 0;

                    for (int var5 = 0; var5 < var3.b.length; ++var5) {
                        short var6 = var3.b[var5];

                        for (int var7 = 0; var7 < GlobalStatus.hl.length; ++var7) {
                            if (var6 == GlobalStatus.hl[var7]) {
                                GlobalStatus.N[var4] = new ck();
                                GlobalStatus.N[var4].b = 1;
                                GlobalStatus.N[var4].a = (byte) var5;
                                GlobalStatus.N[var4].c = String.valueOf(GlobalStatus.hl[var7]);
                                GlobalStatus.N[var4].d = GlobalStatus.hm[var7];
                                GlobalStatus.N[var4].e = GlobalStatus.hn[var7];
                                GlobalStatus.N[var4].f = GlobalStatus.ho[var7];
                                GlobalStatus.N[var4].i = GlobalStatus.hp[var7];
                                GlobalStatus.N[var4].g = 0;
                                GlobalStatus.N[var4].j = GlobalStatus.hs[var7];
                                GlobalStatus.N[var4].r = GlobalStatus.ht[var7];
                                GlobalStatus.N[var4].s = GlobalStatus.hu[var7];
                                GlobalStatus.N[var4].t = GlobalStatus.hv[var7];
                                GlobalStatus.N[var4].k = GlobalStatus.hq[var7];
                                GlobalStatus.N[var4].l = GlobalStatus.hr[var7];
                                break;
                            }
                        }

                        if (var6 != -1) {
                            ++var4;
                        }
                    }

                    int var13 = 0;
                    var4 = 1;
                    if ((GlobalStatus.bs == -1 || GlobalStatus.bs == 1 && GlobalStatus.s == 0 || GlobalStatus.s == 1) && GlobalStatus.be > 0) {
                        var4 = 2;
                    }

                    byte var14 = (byte) var4;
                    GlobalStatus.I = new p[var4];
                    if (GlobalStatus.bs == 1 && GlobalStatus.s == 0 || GlobalStatus.s == 1 || GlobalStatus.bs == -1) {
                        byte var10000;
                        label194:
                        {
                            if (GlobalStatus.fz != null) {
                                for (int var11 = 0; var11 < GlobalStatus.fz.length; ++var11) {
                                    if (GlobalStatus.fz[var11] == 1) {
                                        var10000 = (byte) var11;
                                        break label194;
                                    }
                                }
                            }

                            var10000 = -1;
                        }

                        byte var15 = var10000;

                        for (int var12 = 0; var12 < var14; ++var12) {
                            GlobalStatus.I[var13] = new p();
                            GlobalStatus.I[var13].b = (byte) (var12 == 0 ? 0 : 2);
                            GlobalStatus.I[var13].a = (byte) (var12 == 0 ? (GlobalStatus.bs == 1 && GlobalStatus.s == 0 ? 0 : 1) : (GlobalStatus.bs == 1 && GlobalStatus.s == 0 ? 3 : 4));
                            GlobalStatus.I[var13].c = var12 == 0 ? GlobalStatus.ad : String.valueOf(GlobalStatus.fA[var15]);
                            GlobalStatus.I[var13].d = var12 == 0 ? GlobalStatus.af : GlobalStatus.fB[var15];
                            GlobalStatus.I[var13].e = var12 == 0 ? GlobalStatus.aN : GlobalStatus.fI[var15];
                            GlobalStatus.I[var13].f = var12 == 0 ? GlobalStatus.aM : GlobalStatus.fJ[var15];
                            GlobalStatus.I[var13].g = var12 == 0 ? GlobalStatus.aP : GlobalStatus.fK[var15];
                            GlobalStatus.I[var13].h = var12 == 0 ? GlobalStatus.aO : GlobalStatus.fL[var15];
                            short var8 = 0;
                            if (var12 == 0) {
                                var8 = GlobalConfig.a(GlobalStatus.ax, GlobalStatus.aj);
                                GlobalStatus.I[var13].a(GlobalStatus.ay);
                            } else {
                                var8 = GlobalStatus.go;
                                GlobalStatus.I[var13].p = GlobalStatus.gp;
                                GlobalStatus.I[var13].q = GlobalStatus.gq;
                                GlobalStatus.I[var13].r = GlobalStatus.gr;
                            }

                            GlobalStatus.I[var13].i = var8;
                            ++var13;
                        }
                    }

                    if (GlobalStatus.bs == 1 && GlobalStatus.s == 0) {
                        GlobalStatus.L = 2;
                    }

                    this.d();
                    if (this.k == 25) {
                        bq_1.g = var3.a;
                        if (GlobalStatus.K == 2 && GlobalStatus.bs == 1) {
                            this.S();
                        }
                    }

                    if (GlobalStatus.bu) {
                        this.X.a = var3.a;
                    }
                }

                this.I.f();
            }

            aq var1 = this.M;
            bl var9;
            if ((GlobalStatus.bs != 0 || GlobalStatus.s != 0) && (var9 = var1.a.I.a(GlobalStatus.o)) != null && var1.a.I.l() && var9.v == 0 && System.currentTimeMillis() - GlobalStatus.y > (GlobalStatus.bw == 1 ? var1.q : (GlobalStatus.bw == 2 ? var1.r : 0L))) {
                var1.a(var9.a, (byte) 0);
                var1.a.I.k();
            }
        }

    }

    public final void e() {
        this.e.p = true;
        this.d = -1;
        this.aU();
        this.e.h();
        if (this.k != 25) {
            this.e.clear();
            if (GlobalStatus.aw == 1) {
                GlobalStatus.d();
                GlobalStatus.aw = 0;
            }

            this.ar();
            this.e.clear();
            this.ao();
            this.e.clear();
            this.U();
            this.e.clear();
            this.I.a(GlobalStatus.at, GlobalStatus.au);
            ap();
            this.e.clear();
            this.as();
            this.e.clear();
            MainCanvas.f.a(this.g(), this.h(), GlobalConfig.defaultWidth, GlobalConfig.defaultHigh);
            this.e.clear();
            MainCanvas.f.a(this.f, h, i, true, false, 1009050);
            this.e.clear();
            bm.removeAllElements();
            GlobalStatus.p.removeAllElements();
            GlobalStatus.o = null;
            GlobalStatus.E();
            this.aO.removeAllElements();
            bl.removeAllElements();
            this.M.s = h;
            this.M.t = i;
            this.m = 0;
            this.l = 0;
            this.e.touchAction = 0;
            this.e.b = 0;
            this.N();
            this.e.touchPageCase = this.e.k = 7;
        }

        this.e.p = false;
    }

    private void ao() {
        if (this.f.l == null) {
            this.f.n = null;
        } else {
            this.f.n = new int[this.f.l.length][2];

            for (int var1 = 0; var1 < this.f.l.length; ++var1) {
                if (this.f.l[var1] != null) {
                    MainCanvas.f.a(this.f.l[var1], this.f.n[var1]);
                }
            }

        }
    }

    public final void f() {
        this.e.p = true;
        this.m = 0;
        this.l = 0;
        this.e.touchAction = 0;
        this.e.b = 0;
        this.aO.removeAllElements();
        bl.removeAllElements();
        if (GlobalStatus.t != null) {
            for (int var1 = 0; var1 < GlobalStatus.t.length; ++var1) {
                if (GlobalStatus.t[var1] != null) {
                    GlobalStatus.t[var1].x = false;
                }
            }
        }

        this.U();
        ap();
        MainCanvas.f.a(this.g(), this.h(), GlobalConfig.defaultWidth, GlobalConfig.defaultHigh);
        this.as();
        this.e.touchPageCase = this.e.k = 7;
        this.j = this.k = 0;
        this.e.p = false;
    }

    private static void ap() {
        if (GlobalStatus.s == 0 && GlobalStatus.q != null) {
            for (int var0 = 0; var0 < GlobalStatus.q.length; ++var0) {
                if (GlobalStatus.q[var0] != null) {
                    GlobalStatus.q[var0].f.removeAllElements();
                    GlobalStatus.q[var0].j = GlobalStatus.at;
                    GlobalStatus.q[var0].k = GlobalStatus.au;
                }
            }
        }

    }

    private void aq() {
        try {
            A = Image.createImage("/images/fightBG.png");
        } catch (IOException var1) {
            ((Throwable) var1).printStackTrace();
        }

        y = MainCanvas.ui.getFrame("leader");
        z = MainCanvas.ui.getFrame("member");
        G = MainCanvas.ui.getFrame("hotkeyicon");
        F = MainCanvas.ui.getFrame("fighticon");
        E = MainCanvas.ui.getFrame("fightnum");
        bn = MainCanvas.ui.getFrame1("trans");
        u = MainCanvas.ui.getFrame1("dialog");
        s = MainCanvas.ui.getFrame1("?");
        t_2 = MainCanvas.ui.getFrame1("!");
        bo = MainCanvas.ui.getFrame1("mapnpc");
        H = MainCanvas.ui.getFrame("mystation");
        v = MainCanvas.publicUI.getFrame(GlobalConfig.N[GlobalStatus.ax][GlobalStatus.aj]);
        B = MainCanvas.publicUI.getFrame("lvl");
        bq = MainCanvas.publicUI.getFrame("board");
        br = MainCanvas.publicUI.getFrame("board+");
    }

    public static void a(short var0, short var1, short var2, short var3) {
        for (int var4 = 0; var4 < (var0 == 701 ? 1 : 4); ++var4) {
            MainCanvas.ah.b(var0 + "_" + var4, var1, var2, var3);
        }

    }

    public final short g() {
        return this.f.a < GlobalConfig.defaultWidth ? (short) ((GlobalConfig.defaultWidth - this.f.a) / 2) : 0;
    }

    public final short h() {
        return this.f.b < GlobalConfig.defaultHigh ? (short) ((GlobalConfig.defaultHigh - this.f.b) / 2) : 0;
    }

    private void ar() {
        if (GlobalStatus.as != GlobalStatus.ar) {
            this.e.o = false;
            GlobalStatus.as = GlobalStatus.ar;
            if (GlobalConfig.l == 2) {
                MainCanvas.ah.c();
                MainCanvas.ah.c();
            }

            this.f = null;
            byte[] var1;
            if ((var1 = GlobalStatus.a(GlobalStatus.ar)) != null) {
                this.f = MainCanvas.ae.a(var1);
            } else {
                this.f = MainCanvas.ae.c(String.valueOf(GlobalStatus.ar));
            }

            MainCanvas.f.a();
            MainCanvas.f.a(this.f, this.e.m);
        }

    }

    public final void a(int var1) {
        if (this.I.h()) {
            if (this.Y != GlobalStatus.ar) {
                this.Y = GlobalStatus.ar;
                this.e();
            } else {
                this.f();
            }

            this.I.i();
        }

        if (GlobalStatus.bw == 2 && GlobalStatus.kj > 0) {
            this.I.c.removeAllElements();
            this.e.b = 0;
            this.e.touchAction = 0;
            aq var12 = this.M;
            var12.a.j = var12.a.k = 61;
            var12.s = h;
            var12.t = i;
        } else {
            GlobalStatus.kj = 0;
            if (bk.size() > 0) {
                MainCanvas.ab.d((String) bk.elementAt(0));
                bk.removeElementAt(0);
            }

            ao_1 var2 = this;
            if (GlobalStatus.hb != null) {
                for (int var3 = 0; var3 < var2.aO.size(); ++var3) {
                    s var4;
                    byte var10000;
                    label284:
                    {
                        int var5 = (var4 = (s) var2.aO.elementAt(var3)).a;
                        if (GlobalStatus.hb != null) {
                            for (int var6 = 0; var6 < GlobalStatus.hb.length; ++var6) {
                                if (var5 == GlobalStatus.hb[var6]) {
                                    var10000 = (byte) var6;
                                    break label284;
                                }
                            }
                        }

                        var10000 = -1;
                    }

                    if (var10000 < 0) {
                        var2.aO.removeElement(var4);
                    }
                }

                bl.removeAllElements();

                for (int var13 = 0; var13 < GlobalStatus.hb.length; ++var13) {
                    int var15 = 0;

                    for (var15 = 0; var15 < var2.aO.size() && ((s) var2.aO.elementAt(var15)).a != GlobalStatus.hb[var13]; ++var15) {
                    }

                    if (var15 == var2.aO.size()) {
                        s var18 = new s(GlobalStatus.hb[var13], GlobalStatus.hd[var13], GlobalStatus.he[var13], GlobalStatus.hf[var13], GlobalStatus.hc[var13], GlobalStatus.hg[var13], GlobalStatus.hh[var13], GlobalStatus.hi[var13], GlobalStatus.hj[var13], GlobalStatus.hk[var13]);
                        var2.aO.addElement(var18);
                    }
                }

                GlobalStatus.E();
            }

            c(GlobalStatus.cb);
            c(GlobalStatus.cx);
            c(GlobalStatus.fs);
            c(GlobalStatus.fl);
            aW();
            c(GlobalStatus.dB);
            this.f((short) -1);
            this.aA();
            if (GlobalStatus.H == null && this.e.b == 0) {
                if (this.J != null) {
                    if (var1 == 268435456) {
                        this.J = null;
                        byte[] var7 = NetPayloadBuilder.e((short) 5123, GlobalStatus.ad);
                        this.a((short) 5123, var7, (String) null);
                    } else if (var1 == 536870912) {
                        this.J = null;
                        byte[] var8;
                        if ((var8 = NetPayloadBuilder.C((short) 4371, GlobalStatus.ad)) != null) {
                            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4371, var8));
                        } else {
                            this.e.processException("获取上传指令数据错误!");
                        }
                    }
                } else if (var1 == 268435456) {
                    this.at();
                } else if (var1 == 536870912) {
                    Vector var14;
                    (var14 = new Vector(6)).addElement("回城");
                    var14.addElement(GlobalStatus.bu ? "关闭自动" : "自动刷怪");
                    if (GlobalStatus.bf != 0) {
                        var14.addElement("属性配点");
                    }

                    if (GlobalStatus.bs >= 0) {
                        var14.addElement(GlobalStatus.bs == 0 ? "离开队伍" : "解散队伍");
                    }

                    var14.addElement("查看邮箱");
                    var14.addElement("活动推荐");
                    var14.addElement("传送");
                    String[] var17 = new String[var14.size()];
                    var14.copyInto(var17);
                    LoadingPage.a((GlobalConfig.realWidth - GlobalConfig.i.stringWidth("操作")) / 2, (GlobalConfig.realHigh - GlobalConfig.j * var17.length) / 2, var17, true);
                    this.l = 0;
                    GlobalStatus.gQ = 1;
                    this.e.touchPageCase = this.e.k;
                    this.j = this.k = 100;
                } else if (var1 == 1024) {
                    this.by = 1;
                    this.K();
                } else if (var1 == 2048) {
                    if (GlobalStatus.bR == null && GlobalStatus.bL == null) {
                        this.e.processException("当前没有任务");
                    } else {
                        this.by = 1;
                        this.x();
                    }
                } else if (var1 != 1073741824 && var1 != 517) {
                    if (var1 == 48) {
                        if (GlobalStatus.fA != null) {
                            this.by = 1;
                            this.j((int) 0);
                        } else {
                            this.e.processException("您没有宠物！");
                        }
                    } else if (var1 == 513) {
                        this.aS();
                        this.by = 1;
                    } else if (var1 == 515) {
                        this.by = 1;
                        this.e((int) 0);
                    } else if (var1 == 519) {
                        if (GlobalStatus.bw == 2) {
                            aW[6] = (byte) (aW[6] == 0 ? 1 : 0);
                        } else {
                            this.by = 1;
                            if (this.f != null) {
                                if (GlobalConfig.defaultWidth < 240) {
                                    this.aD = 6;
                                } else {
                                    this.aD = 7;
                                }

                                if (GlobalConfig.defaultWidth >= 240) {
                                    if (this.f.b * this.aD / 16 > GlobalConfig.defaultHigh - 20) {
                                        this.aD = (GlobalConfig.defaultHigh - 20 << 4) / this.f.b;
                                    } else if (this.f.a * this.aD / 16 > GlobalConfig.defaultWidth - 3) {
                                        this.aD = (GlobalConfig.defaultWidth - 3 << 4) / this.f.a;
                                    } else if (this.f.b * this.aD / 16 < GlobalConfig.defaultHigh * 5 / 7) {
                                        this.aD = (GlobalConfig.defaultHigh * 5 / 7 << 4) / this.f.b;
                                    } else if (this.f.a * this.aD / 16 < GlobalConfig.defaultWidth * 5 / 7) {
                                        this.aD = (GlobalConfig.defaultWidth * 5 / 7 << 4) / this.f.a;
                                    }
                                } else if (this.f.b * this.aD / 16 > GlobalConfig.defaultHigh) {
                                    this.aD = (GlobalConfig.defaultHigh << 4) / this.f.b;
                                } else if (this.f.a * this.aD / 16 > GlobalConfig.defaultWidth - 6) {
                                    this.aD = (GlobalConfig.defaultWidth - 6 << 4) / this.f.a;
                                } else if (this.f.b * this.aD / 16 < GlobalConfig.defaultHigh * 6 / 7) {
                                    this.aD = (GlobalConfig.defaultHigh * 6 / 7 << 4) / this.f.b;
                                } else if (this.f.a * this.aD / 16 < GlobalConfig.defaultWidth * 6 / 7) {
                                    this.aD = (GlobalConfig.defaultWidth * 6 / 7 << 4) / this.f.a;
                                }

                                this.aB = (GlobalConfig.defaultWidth - this.f.a * this.aD / 16) / 2;
                                this.aC = (GlobalConfig.defaultHigh - this.f.b * this.aD / 16) / 2;
                                this.e.touchPageCase = this.e.k;
                                MainCanvas.f.a(this.f, h, i, false, false, 1009050);
                                this.j = this.k = 30;
                            }
                        }
                    } else if (var1 == 521) {
                        byte[] var11;
                        if ((var11 = NetPayloadBuilder.f((short) 4168, GlobalStatus.ad)) != null) {
                            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4168, var11));
                            this.by = 1;
                            this.e.a((String) null);
                        } else {
                            this.e.processException("获取上传指令数据错误!");
                        }
                    }
                } else {
                    this.af = -1;
                    if (GlobalStatus.t != null) {
                        for (int var9 = 0; var9 < GlobalStatus.t.length; ++var9) {
                            if (GlobalStatus.t[var9] != null && GlobalStatus.t[var9].x) {
                                this.af = (byte) var9;
                                break;
                            }
                        }
                    }

                    if (this.af >= 0 && GlobalStatus.t != null && this.af < GlobalStatus.t.length && GlobalStatus.t[this.af] != null && GlobalStatus.t[this.af].e == 1) {
                        byte[] var10;
                        if ((var10 = NetPayloadBuilder.c((short) 4106, GlobalStatus.ad, (int) GlobalStatus.t[this.af].a)) != null) {
                            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4106, var10));
                            aj = true;
                            this.e.a((String) null);
                            return;
                        }

                        this.e.processException("获取上传指令数据错误!");
                        return;
                    }

                    if (L != null) {
                        this.l = 0;
                        this.ar = 0;
                        this.m = 0;
                        this.an = L.k;
                        K = new TextRender("你想...", (short) (GlobalConfig.defaultWidth - 20));
                        LoadingPage.a(MainCanvas.F, K, this.an, (String[]) null, true);
                        LoadingPage.g = 0;
                        this.e.touchPageCase = this.e.k;
                        MainCanvas.f.a(this.f, h, i, false, false, 1009050);
                        this.j = this.k = 40;
                    }
                }
            }

            if (this.J == null) {
                if (!GlobalStatus.bu) {
                    if (this.d != -1) {
                        this.I.a(this.d);
                    } else if (this.e.b != 8 && this.e.b != 516) {
                        if (this.e.b != 2 && this.e.b != 518) {
                            if (this.e.b != 1 && this.e.b != 514) {
                                if (this.e.b != 4 && this.e.b != 520) {
                                    this.I.c();
                                } else {
                                    this.I.a((byte) 3);
                                }
                            } else {
                                this.I.a((byte) 1);
                            }
                        } else {
                            this.I.a((byte) 2);
                        }
                    } else {
                        this.I.a((byte) 0);
                    }
                } else if (this.aO != null && this.aO.size() > 0) {
                    if (this.e.ak - bq_1.r > 2200L) {
                        this.X.a();
                    } else {
                        if (this.I.c != null) {
                            this.I.c.removeAllElements();
                        }

                        this.I.c();
                    }
                } else {
                    this.I.c();
                }
            }

            this.aE = 0;
            L = this.I.b(GlobalStatus.ij);
            this.M();
            this.as();
        }
    }

    public static boolean i() {
        return GlobalStatus.H == null;
    }

    private void as() {
        if (this.f.i != null) {
            short var1 = 0;
            short var2 = 0;
            int var3 = 0;
            int var4 = 0;
            var1 = GlobalConfig.defaultWidth;
            var2 = GlobalConfig.defaultHigh;
            var3 = GlobalConfig.defaultWidth / 2;
            var4 = GlobalConfig.defaultHigh / 2;
            if (this.f.a < GlobalConfig.defaultWidth) {
                var1 = this.f.a;
                var3 = this.f.a / 2;
            }

            if (this.f.b < GlobalConfig.defaultHigh) {
                var2 = this.f.b;
                var4 = this.f.b / 2;
            }

            if (GlobalStatus.bs == 0 && GlobalStatus.s == 0) {
                if (GlobalStatus.q != null) {
                    short var5 = GlobalStatus.q[0].j;
                    short var6 = GlobalStatus.q[0].k;
                    h = var5 - var3 < 0 ? 0 : (var5 + var3 > this.f.a ? this.f.a - var1 : var5 - var3);
                    i = var6 - var4 < 0 ? 0 : (var6 + var4 > this.f.b ? this.f.b - var2 : var6 - var4);
                }
            } else {
                h = this.I.j - var3 < 0 ? 0 : (this.I.j + var3 > this.f.a ? this.f.a - var1 : this.I.j - var3);
                i = this.I.k - var4 < 0 ? 0 : (this.I.k + var4 > this.f.b ? this.f.b - var2 : this.I.k - var4);
            }
        }
    }

    public final void a(long var1) {
        this.ah = var1;
        this.ag = 1;
    }

    public final void b(int var1) {
        if (var1 != 8 && var1 != 516) {
            if (var1 != 2 && var1 != 518) {
                if (var1 != 514 && var1 != 1) {
                    if (var1 == 520 || var1 == 4) {
                        this.ag -= 10;
                        if (this.ag <= 1) {
                            this.ag = 1;
                        }
                    }
                } else {
                    this.ag += 10;
                    if (this.ag > (int) this.ah) {
                        this.ag = (int) this.ah;
                        return;
                    }
                }

            } else {
                this.ag = this.ag >= (int) this.ah ? (int) this.ah : ++this.ag;
            }
        } else {
            this.ag = this.ag <= 1 ? 1 : --this.ag;
        }
    }

    public final void a(Graphics var1, String var2) {
        LoadingPage.a(var1, var2 + "(" + this.ah + ")", this.ag, true);
    }

    private void at() {
        this.j();
        this.c((int) 0);
        this.l = 0;
        MainCanvas.f.a(this.f, h, i, false, false, 1009050);
        this.j = this.k = 1;
    }

    public final void j() {
        this.bF = new int[4];
        this.a(new String[]{"人物", "商城", "道具", "任务", "帮派", "住宅", "坐骑", "宠物", "功能", "社交", "系统"});
    }

    public final void k() {
        this.a(new String[]{"进入", "查看", "邀请", "任免", "弃帮"});
        this.c((int) 0);
        this.l = 2;
        MainCanvas.f.a(this.f, h, i, false, false, 1009050);
        this.j = this.k = 1;
    }

    public final void l() {
        this.a(new String[]{"附魔", "升星-装", "洗炼-装", "传送", "升星-宠", "合成"});
        this.c((int) 0);
        this.l = 19;
        MainCanvas.f.a(this.f, h, i, false, false, 1009050);
        this.j = this.k = 1;
    }

    private void au() {
        this.a(new String[]{"好友", "聊天", "周围"});
        this.c((int) 0);
        this.l = 20;
        MainCanvas.f.a(this.f, h, i, false, false, 1009050);
        this.j = this.k = 1;
    }

    private void av() {
        if (GlobalConfig.channel == 0) {
            this.a(new String[]{"属性", "技能", "特效", "装备", "配点", "称号", "成就", "活跃", "超Q"});
        } else {
            this.a(new String[]{"属性", "技能", "特效", "装备", "配点", "称号", "成就", "活跃"});
        }

        this.c((int) 0);
        MainCanvas.f.a(this.f, h, i, false, false, 1009050);
        this.l = 3;
        this.j = this.k = 1;
    }

    private void aw() {
        if (GlobalConfig.channel == 0) {
            this.a(new String[]{"豆城", "果城", "仓库", "充值", "说明"});
        } else {
            this.a(new String[]{"豆城", "仓库", "充值", "换豆", "余额", "说明"});
        }

        this.c((int) 0);
        this.l = 4;
        MainCanvas.f.a(this.f, h, i, false, false, 1009050);
        this.j = this.k = 1;
    }

    private void ax() {
        this.a(new String[]{"设置", "帮助", "自动", "脱离", "角色", "退出"});
        this.c((int) 0);
        this.l = 5;
        this.j = this.k = 1;
    }

    private void a(String[] var1) {
        if (var1.length > 0) {
            this.bA = var1;
            this.bE = new int[var1.length][4];
        }

    }

    public final int a(int var1, int var2) {
        if (this.bE != null) {
            for (int var3 = 0; var3 < this.bE.length; ++var3) {
                if (var1 >= this.bE[var3][0] && var1 <= this.bE[var3][0] + this.bE[var3][2] && var2 >= this.bE[var3][1] && var2 <= this.bE[var3][1] + this.bE[var3][3]) {
                    this.c(var3);
                    return 268435456;
                }
            }
        }

        return this.bF == null || var1 >= this.bF[0] && var1 <= this.bF[0] + this.bF[2] && var2 >= this.bF[1] && var2 <= this.bF[1] + this.bF[3] ? 0 : 536870912;
    }

    public final void c(int var1) {
        this.bC = GlobalConfig.defaultWidth <= 240 ? 3 : 4;
        this.bD = 12 / this.bC;
        this.bB = var1 < this.bA.length && var1 >= 0 ? var1 : this.bB;
    }

    private boolean ay() {
        if (GlobalConfig.x) {
            this.e.processException("该功能暂不支持");
            return false;
        } else {
            return true;
        }
    }

    private void b(Graphics var1) {
        int var2 = Math.min(GlobalConfig.defaultWidth / this.bC - 2, GlobalConfig.i.stringWidth("字符长") + 12);
        int var3 = GlobalConfig.j + 10;
        int var4 = (GlobalConfig.defaultWidth - this.bC * var2) / 2;
        int var5 = (GlobalConfig.defaultHigh - this.bD * var3) / 2;
        var1.setColor(6732228);
        int var10003 = this.bC * var2;
        int var12 = this.bD * var3;
        int var11 = var10003;
        if (this.bF != null) {
            this.bF[0] = var4;
            this.bF[1] = var5;
            this.bF[2] = var11;
            this.bF[3] = var12;
        }

        var1.fillRect(var4, var5, this.bC * var2, this.bD * var3);

        for (int var6 = 0; var6 < this.bD; ++var6) {
            for (int var7 = 0; var7 < this.bC; ++var7) {
                LoadingPage.a(var1, 4);
                var1.drawRect(var4 + var7 * var2 + 1, var5 + var6 * var3, var2 - 2, var3);
                var1.drawRect(var4 + var7 * var2, var5 + var6 * var3 + 1, var2, var3 - 2);
                LoadingPage.a(var1, 3);
                var1.drawRect(var4 + var7 * var2 + 2, var5 + var6 * var3 + 2, var2 - 3, var3 - 3);
                if (this.bB == var6 * this.bC + var7) {
                    var1.setColor(2780801);
                    var1.fillRect(var4 + var7 * var2 + 3, var5 + var6 * var3 + 3, var2 - 4, var3 - 4);
                }

                if (var6 * this.bC + var7 < this.bA.length) {
                    var1.setColor(this.bB == var6 * this.bC + var7 ? 16777215 : 1855685);
                    int var10001 = var6 * this.bC + var7;
                    int var10002 = var4 + var7 * var2;
                    var11 = var5 + var6 * var3;
                    int var10 = var10002;
                    int var9 = var10001;
                    if (this.bE != null && this.bE.length > var9) {
                        this.bE[var9][0] = var10;
                        this.bE[var9][1] = var11;
                        this.bE[var9][2] = var2;
                        this.bE[var9][3] = var3;
                    }

                    var1.drawString(this.bA[var6 * this.bC + var7], var4 + var7 * var2 + var2 / 2, var5 + var6 * var3 + 5, 17);
                }
            }
        }

        LoadingPage.f(var1, var4, var5, this.bC * var2, this.bD * var3);
        if (this.l == 6) {
            LoadingPage.a(var1, "您真的要退出帮派吗？", new String[]{"确定", "返回"});
        } else if (this.l == 7) {
            LoadingPage.a(var1, "您确定要退出游戏吗？", new String[]{"确定", "返回"});
        }

        if (this.l == 8) {
            this.a(var1, "输入数量");
        }

    }

    private void az() {
        this.e.aq.b();
        this.e.aq.a("商城必看");
        if (GlobalStatus.n != null && !GlobalStatus.n.equals("")) {
            this.e.at.b(GlobalStatus.n, GlobalConfig.i, (byte) 2);
        } else {
            this.e.at.b("正在同步数据，请稍候！", GlobalConfig.i, (byte) 2);
        }

        this.e.aq.a((al) this.e.at);
        this.e.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
        this.j = this.k = 94;
    }

    private void u(int var1) {
        if (this.e.aq != null) {
            this.e.aq.b(var1);
        }

        if (var1 == 536870912) {
            this.aw();
            this.c(GlobalConfig.channel == 0 ? 4 : 5);
        }

    }

    private void c(Graphics var1) {
        if (this.e.aq != null) {
            this.e.aq.a(var1);
        }

    }

    private void aA() {
        if (this.e.aC != null && this.e.g) {
            if (this.aT == 4 || this.aR) {
                this.a((String) this.aS, (byte) 4);
                this.e.n();
                return;
            }

            this.a(this.aS, (byte) this.aT);
            this.e.n();
        }

    }

    private void f(short var1) {
        if (this.e.aC != null && this.e.aE != null && this.e.g) {
            if ((var1 = (byte) this.e.aE.getSelectedIndex()) == 0) {
                if (GlobalStatus.ak < 9) {
                    this.e.g = false;
                    this.e.n();
                    this.e.processException("需要九级才能使用世界频道!");
                    return;
                }

                this.a((String) null, (byte) var1);
                this.e.n();
                if (this.l >= 0) {
                    this.l = -1;
                    return;
                }
            } else if (var1 == 2) {
                if (GlobalStatus.bs == -1) {
                    this.e.g = false;
                    this.e.n();
                    this.e.processException("没有队伍,不能使用队伍频道!");
                    return;
                }

                this.a((String) null, (byte) var1);
                this.e.n();
                if (this.l >= 0) {
                    this.l = -1;
                    return;
                }
            } else if (var1 == 3) {
                if (GlobalStatus.az.equals("无")) {
                    this.e.g = false;
                    this.e.n();
                    this.e.processException("没有帮派,不能使用帮派频道!");
                    return;
                }

                this.a((String) null, (byte) var1);
                this.e.n();
                if (this.l >= 0) {
                    this.l = -1;
                    return;
                }
            } else if (var1 == 4) {
                var1 = (byte) (var1 + 2);
                this.a((String) null, (byte) var1);
                this.e.n();
                if (this.l >= 0) {
                    this.l = -1;
                    return;
                }
            } else {
                this.a((String) null, (byte) var1);
                this.e.n();
                if (this.l >= 0) {
                    this.l = -1;
                }
            }
        }

    }

    public final void a(String var1, byte var2) {
        String var3;
        if ((var3 = this.e.aC.getString()) != null) {
            if (this.bG != null && this.bG.equals(var3)) {
                this.e.processException("不能发送相同信息");
            } else {
                byte[] var4 = NetPayloadBuilder.a((short) 4184, GlobalStatus.ad, var2, var1 == null ? "" : var1, var3);
                NetPacket var5 = new NetPacket((short) 4184, var4);
                MainCanvas.netUtils.sendPacket(var5);
                if (var2 == 4) {
                    b(new ce("→" + this.aQ, var2, var3, (byte) 21));
                    this.a(new ce("→" + this.aQ, var2, var3, (byte) 21));
                    if (this.e.as.a == 6) {
                        o(var2);
                    } else {
                        this.aR();
                    }
                }

                this.e.processException("聊天消息已发送!");
            }

            this.e.n();
            this.e.g = false;
            this.aR = false;
            this.bG = var3;
            this.aS = null;
            this.aT = -1;
        }

    }

    public final void m() {
        if (i()) {
            MainCanvas.F = GlobalStatus.t[this.af];
            bH.removeAllElements();
            this.by = 0;
            if (GlobalStatus.bI != null && GlobalStatus.bI.length > 0) {
                for (int var1 = 0; var1 < GlobalStatus.bI.length; ++var1) {
                    bH.addElement(GlobalStatus.bJ[var1] + "(" + GlobalConfig.J[GlobalStatus.bK[var1] + 1] + ")");
                }
            }

            if (this.af < GlobalStatus.t.length) {
                if (GlobalStatus.t[this.af].q == 1) {
                    bH.addElement(GlobalConfig.I[16]);
                }

                if (GlobalStatus.t[this.af].f == 1) {
                    bH.addElement(GlobalConfig.I[0]);
                }

                if (GlobalStatus.t[this.af].g == 1) {
                    bH.addElement(GlobalConfig.I[1]);
                }

                if (GlobalStatus.t[this.af].h == 1) {
                    bH.addElement(GlobalConfig.I[14]);
                }

                if (GlobalStatus.t[this.af].i == 1) {
                    bH.addElement(GlobalConfig.I[13]);
                }

                if (GlobalStatus.t[this.af].j == 1) {
                    bH.addElement(GlobalConfig.I[15]);
                }

                if (GlobalStatus.t[this.af].j == 2) {
                    bH.addElement(GlobalConfig.I[39]);
                }

                if (GlobalStatus.t[this.af].l == 1) {
                    bH.addElement(GlobalConfig.I[2]);
                }

                if (GlobalStatus.t[this.af].k == 1) {
                    bH.addElement(GlobalConfig.I[3]);
                }

                if (GlobalStatus.t[this.af].m == 1) {
                    bH.addElement(GlobalConfig.I[4]);
                    bH.addElement(GlobalConfig.I[5]);
                    bH.addElement(GlobalConfig.I[6]);
                }

                if (GlobalStatus.t[this.af].n == 1 || GlobalStatus.t[this.af].o == 1) {
                    if (GlobalStatus.t[this.af].n == 1) {
                        bH.addElement(GlobalConfig.I[7]);
                        bH.addElement(GlobalConfig.I[9]);
                        bH.addElement(GlobalConfig.I[10]);
                    }

                    if (GlobalStatus.t[this.af].o == 1) {
                        bH.addElement(GlobalConfig.I[8]);
                        bH.addElement(GlobalConfig.I[9]);
                        bH.addElement(GlobalConfig.I[10]);
                    }
                }

                if (GlobalStatus.t[this.af].p == 1) {
                    bH.addElement(GlobalConfig.I[11]);
                }

                if (GlobalStatus.t[this.af].D == 1) {
                    bH.addElement(GlobalConfig.I[17]);
                }

                if (GlobalStatus.t[this.af].E == 1) {
                    bH.addElement(GlobalConfig.I[18]);
                }

                if (GlobalStatus.t[this.af].H == 1) {
                    bH.addElement(GlobalConfig.I[19]);
                }

                if (GlobalStatus.t[this.af].H == 2) {
                    bH.addElement(GlobalConfig.I[20]);
                    bH.addElement(GlobalConfig.I[21]);
                } else if (GlobalStatus.t[this.af].H == 3) {
                    bH.addElement(GlobalConfig.I[22]);
                    bH.addElement(GlobalConfig.I[23]);
                }

                if (GlobalStatus.t[this.af].I == 1) {
                    bH.addElement(GlobalConfig.I[24]);
                }

                if (GlobalStatus.t[this.af].I == 2) {
                    bH.addElement(GlobalConfig.I[25]);
                }

                if (GlobalStatus.t[this.af].I == 3) {
                    bH.addElement(GlobalConfig.I[26]);
                }

                if (GlobalStatus.t[this.af].I == 4) {
                    bH.addElement(GlobalConfig.I[27]);
                }

                if (GlobalStatus.t[this.af].I == 5) {
                    bH.addElement(GlobalConfig.I[28]);
                }

                if (GlobalStatus.t[this.af].I == 6) {
                    bH.addElement(GlobalConfig.I[29]);
                    bH.addElement(GlobalConfig.I[32]);
                }

                if (GlobalStatus.t[this.af].I == 100) {
                    bH.addElement(GlobalConfig.I[33]);
                    bH.addElement(GlobalConfig.I[26]);
                }

                if (GlobalStatus.t[this.af].F == 1) {
                    bH.addElement(GlobalConfig.I[30]);
                }

                if (GlobalStatus.t[this.af].G == 1) {
                    bH.addElement(GlobalConfig.I[31]);
                }

                if (GlobalStatus.t[this.af].J == 1) {
                    bH.addElement(GlobalConfig.I[34]);
                    bH.addElement(GlobalConfig.I[35]);
                    bH.addElement(GlobalConfig.I[36]);
                    bH.addElement(GlobalConfig.I[37]);
                }

                if (GlobalStatus.t[this.af].r == 1 && GlobalStatus.t[this.af].s == 0) {
                    bH.addElement(GlobalConfig.I[38]);
                }

                if (GlobalStatus.t[this.af].r == 1 && GlobalStatus.t[this.af].s == 1) {
                    bH.addElement(GlobalConfig.I[40]);
                }

                if (GlobalStatus.t[this.af].K == 1) {
                    bH.addElement(GlobalConfig.I[41]);
                }

                if (GlobalStatus.t[this.af].L == 1) {
                    bH.addElement(GlobalConfig.I[42]);
                }

                if (GlobalStatus.t[this.af].M == 1) {
                    bH.addElement(GlobalConfig.I[43]);
                }

                if (GlobalStatus.t[this.af].Q == 1) {
                    bH.addElement(GlobalConfig.I[44]);
                }

                if (GlobalStatus.t[this.af].R == 1) {
                    bH.addElement(GlobalConfig.I[45]);
                }

                if (GlobalStatus.t[this.af].N == 1) {
                    bH.addElement(GlobalConfig.I[46]);
                }

                if (GlobalStatus.t[this.af].O == 1) {
                    bH.addElement(GlobalConfig.I[47]);
                }

                if (GlobalStatus.t[this.af].P == 1 && GlobalStatus.aA != null && GlobalStatus.aA.indexOf("帮主") != -1) {
                    bH.addElement(GlobalConfig.I[48]);
                }

                if (GlobalStatus.t[this.af].T == 1) {
                    bH.addElement(GlobalConfig.I[49]);
                }

                if (GlobalStatus.t[this.af].B != null) {
                    for (int var2 = 0; var2 < GlobalStatus.t[this.af].B.length; ++var2) {
                        bH.addElement(GlobalStatus.t[this.af].B[var2]);
                    }
                }
            }

            if (a(bH, GlobalConfig.I[7])) {
                this.as = 256;
            } else {
                this.as = 257;
            }

            this.m = 0;
            if (bH.size() > 0) {
                this.am = new String[bH.size()];

                for (int var3 = 0; var3 < bH.size(); ++var3) {
                    this.am[var3] = bH.elementAt(var3).toString();
                }
            } else {
                this.am = null;
            }

            K = new TextRender(GlobalStatus.bQ, (short) (GlobalConfig.defaultWidth - 20));
            LoadingPage.a(MainCanvas.F, K, this.am, (String[]) null, true);
            this.e.touchAction = 0;
            this.e.b = 0;
            this.e.touchPageCase = this.e.k;
            this.j = this.k = 2;
        }
    }

    private static boolean a(Vector var0, String var1) {
        if (var1 != null && !var1.equals("")) {
            for (int var2 = 0; var2 < var0.size(); ++var2) {
                if (var0.elementAt(var2).toString().equals(var1)) {
                    return true;
                }
            }

            return false;
        } else {
            return false;
        }
    }

    private void v(int var1) {
        if (this.l == 0) {
            if (this.m == 0) {
                if ((bH.size() <= 0 || var1 != 536870912) && (bH.size() > 0 || var1 != 536870912 && var1 != 268435456 && var1 != 517 && var1 != 1073741824)) {
                    if (var1 != 8 && var1 != 516) {
                        if (var1 == 2 || var1 == 518) {
                            LoadingPage.e = LoadingPage.e + LoadingPage.d < K.a() ? LoadingPage.e + LoadingPage.d : LoadingPage.e;
                        }
                    } else {
                        LoadingPage.e = LoadingPage.e - LoadingPage.d >= 0 ? LoadingPage.e - LoadingPage.d : 0;
                    }

                    if (bH.size() <= 0) {
                        return;
                    }

                    if (var1 != 1 && var1 != 514) {
                        if (var1 != 4 && var1 != 520) {
                            if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
                                var1 = 0;
                                if (GlobalStatus.bI != null) {
                                    var1 = GlobalStatus.bI.length;
                                }

                                this.ai = LoadingPage.g;
                                this.bI = bH.elementAt(this.ai).toString();
                                int var2 = -1;

                                for (int var3 = 0; var3 < GlobalConfig.I.length; ++var3) {
                                    if (this.bI.equals(GlobalConfig.I[var3])) {
                                        var2 = var3;
                                        break;
                                    }
                                }

                                Object var31 = null;
                                label646:
                                switch (var2) {
                                    case 0:
                                        if (GlobalStatus.bY != null) {
                                            this.F();
                                        } else {
                                            this.e.processException("npc商店没有商品!");
                                        }
                                        break;
                                    case 1:
                                        if (this.am == null) {
                                            this.aE = 0;
                                            this.aG = 0;
                                            this.aH = 0;
                                        }

                                        this.e((int) 0);
                                        this.j = this.k = 9;
                                        break;
                                    case 2:
                                        if (GlobalStatus.aM > 0) {
                                            byte[] var36 = NetPayloadBuilder.c((short) 4118, GlobalStatus.ad, (short) GlobalStatus.t[this.af].a);
                                            this.a((short) 4118, var36, (String) null);
                                        } else {
                                            this.e.processException("生命值为0,不能战斗!");
                                        }
                                        break;
                                    case 3:
                                        if (GlobalStatus.cr != null && GlobalStatus.cr.length > 0) {
                                            this.a(true);
                                        } else {
                                            this.e.processException("传送列表为空!");
                                        }
                                        break;
                                    case 4:
                                        this.ar = 0;
                                        this.m = 0;
                                        this.an = new String[]{"取出物品", "存入物品"};
                                        K = new TextRender(GlobalStatus.t[this.af].b + ":物品仓库已打开", (short) (GlobalConfig.defaultWidth - 20));
                                        LoadingPage.a(MainCanvas.F, K, this.an, (String[]) null, true);
                                        this.l = 3;
                                        break;
                                    case 5:
                                        this.ar = 0;
                                        this.m = 0;
                                        this.an = new String[]{"取出银两", "存入银两"};
                                        String var10 = GlobalStatus.a(GlobalStatus.aq);
                                        GlobalConfig.a(this.e.l, GlobalStatus.ap);
                                        K = new TextRender(GlobalStatus.t[this.af].b + ":已存入银两" + var10 + ",现有银两" + this.e.l.toString(), (short) (GlobalConfig.defaultWidth - 20));
                                        LoadingPage.a(MainCanvas.F, K, this.an, (String[]) null, true);
                                        this.l = 4;
                                        break;
                                    case 6:
                                        this.ar = 0;
                                        this.m = 0;
                                        this.an = new String[]{"寄养宠物", "领回宠物"};
                                        K = new TextRender(GlobalStatus.t[this.af].b + ":宠物仓库已打开", (short) (GlobalConfig.defaultWidth - 20));
                                        LoadingPage.a(MainCanvas.F, K, this.an, (String[]) null, true);
                                        this.l = 5;
                                        break;
                                    case 7:
                                        this.e((int) 5);
                                        break;
                                    case 8:
                                        if (GlobalStatus.fA != null) {
                                            this.j((int) 1);
                                        } else {
                                            this.e.processException("您没有宠物!");
                                        }
                                        break;
                                    case 9:
                                        if (this.as == 256) {
                                            this.H();
                                        } else if (this.as == 257) {
                                            this.aI();
                                        }
                                        break;
                                    case 10:
                                        if (this.as != 256) {
                                            GlobalStatus.gQ = 1;
                                            this.a((byte) 1, (short) GlobalStatus.gQ);
                                        } else if (this.as == 256) {
                                            GlobalStatus.gQ = 1;
                                            this.a((byte) 0, (short) GlobalStatus.gQ);
                                        }
                                        break;
                                    case 11:
                                        if (GlobalStatus.dE != null) {
                                            this.i((int) 0);
                                        } else {
                                            this.e.processException("当前没有可升级技能");
                                        }
                                        break;
                                    case 12:
                                    default:
                                        if (GlobalStatus.t[this.af].B != null && GlobalStatus.t[this.af].B.length > 0 && this.ai >= var1) {
                                            for (int var11 = 0; var11 < GlobalStatus.t[this.af].B.length; ++var11) {
                                                if (this.bI.equals(GlobalStatus.t[this.af].B[var11])) {
                                                    this.N();
                                                    this.a((short) -1, -1, GlobalStatus.t[this.af].C[var11], (String) null);
                                                    break label646;
                                                }
                                            }
                                        } else if (GlobalStatus.bI != null && this.ai < GlobalStatus.bI.length) {
                                            byte[] var25;
                                            if ((var25 = NetPayloadBuilder.a((short) 4107, GlobalStatus.ad, (int) GlobalStatus.t[this.af].a, (int) GlobalStatus.bI[this.ai])) != null) {
                                                MainCanvas.netUtils.sendPacket(new NetPacket((short) 4107, var25));
                                                this.e.a((String) null);
                                            } else {
                                                this.e.processException("获取上传指令数据错误!");
                                            }
                                        }
                                        break;
                                    case 13:
                                        if (GlobalStatus.fA != null) {
                                            this.j((int) 5);
                                        } else {
                                            this.e.processException("您没有宠物");
                                        }
                                    case 14:
                                        break;
                                    case 15:
                                        if (GlobalStatus.ew != null && GlobalStatus.ew.length > 0) {
                                            this.a((short) this.k, (byte) 1);
                                        } else {
                                            this.e.processException("兑换列表为空");
                                        }
                                        break;
                                    case 16:
                                        byte[] var35;
                                        if ((var35 = NetPayloadBuilder.s((short) 4145, GlobalStatus.ad, GlobalStatus.t[this.af].a)) != null) {
                                            NetPacket var9 = new NetPacket((short) 4145, var35);
                                            MainCanvas.netUtils.sendPacket(var9);
                                            this.N();
                                            this.e.a((String) null);
                                        } else {
                                            this.e.processException("获取上传指令数据错误!");
                                        }
                                        break;
                                    case 17:
                                        byte[] var34 = NetPayloadBuilder.k((short) 4190, GlobalStatus.ad);
                                        this.a((short) 4190, var34, (String) null);
                                        break;
                                    case 18:
                                        if (GlobalStatus.fA == null) {
                                            this.e.processException("您没有宠物");
                                            return;
                                        }

                                        this.j((int) 6);
                                        break;
                                    case 19:
                                        this.b((short) 4353, (byte) this.af);
                                        break;
                                    case 20:
                                        if (GlobalStatus.bs != -1) {
                                            this.e.processException("队伍状态下不能进行住宅操作");
                                            return;
                                        }

                                        this.b((short) 4358, (byte) this.af);
                                        break;
                                    case 21:
                                        this.w((byte) 1);
                                        break;
                                    case 22:
                                        this.c((short) 4361, (byte) this.af, (byte) 1);
                                        break;
                                    case 23:
                                        this.w((byte) 2);
                                        break;
                                    case 24:
                                        this.M.a((int) 0);
                                        break;
                                    case 25:
                                        GlobalStatus.gQ = 1;
                                        this.M.q(0);
                                        break;
                                    case 26:
                                        this.ar = 0;
                                        this.m = 0;
                                        this.an = new String[]{"查看公告", "修改公告"};
                                        K = new TextRender("查看和修改公告", (short) (GlobalConfig.defaultWidth - 20));
                                        LoadingPage.a(MainCanvas.F, K, this.an, (String[]) null, true);
                                        LoadingPage.g = 0;
                                        this.l = 9;
                                        break;
                                    case 27:
                                        this.M.a(false);
                                        break;
                                    case 28:
                                        aq var8 = this.M;
                                        byte[] var24;
                                        if ((var24 = NetPayloadBuilder.B((short) 4222, GlobalStatus.ad)) != null) {
                                            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4222, var24));
                                            var8.b.a((String) null);
                                        } else {
                                            var8.b.processException("获取上传指令数据错误!");
                                        }
                                        break;
                                    case 29:
                                        GlobalStatus.gQ = 1;
                                        this.M.p = 0;
                                        this.M.o = "";
                                        this.M.a(this.M.o);
                                        break;
                                    case 30:
                                        this.O.a();
                                        break;
                                    case 31:
                                        if (GlobalStatus.kB != null) {
                                            this.O.b();
                                        } else {
                                            this.e.processException("无可开孔装备");
                                        }
                                        break;
                                    case 32:
                                        aq var7 = this.M;
                                        byte[] var23;
                                        if ((var23 = NetPayloadBuilder.v((short) 4870, GlobalStatus.ad)) != null) {
                                            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4870, var23));
                                            var7.b.a((String) null);
                                        } else {
                                            var7.b.processException("获取上传指令数据错误!");
                                        }
                                        break;
                                    case 33:
                                        aq var6 = this.M;
                                        byte[] var22;
                                        if ((var22 = NetPayloadBuilder.v((short) 4873, GlobalStatus.ad)) != null) {
                                            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4873, var22));
                                            var6.b.a((String) null);
                                        } else {
                                            var6.b.processException("获取上传指令数据错误!");
                                        }
                                        break;
                                    case 34:
                                        this.ar = 0;
                                        this.m = 0;
                                        this.an = new String[]{"查看", "发布"};
                                        K = new TextRender("查看、发布“求爱宣言”", (short) (GlobalConfig.defaultWidth - 20));
                                        LoadingPage.a(MainCanvas.F, K, this.an, (String[]) null, true);
                                        LoadingPage.g = 0;
                                        this.l = 7;
                                        break;
                                    case 35:
                                        this.S.a((byte) 0);
                                        break;
                                    case 36:
                                        this.S.b((byte) 0);
                                        break;
                                    case 37:
                                        GlobalStatus.gQ = 1;
                                        this.S.e();
                                        break;
                                    case 38:
                                    case 40:
                                        byte[] var33 = NetPayloadBuilder.p((short) 4651, GlobalStatus.ad, String.valueOf(GlobalStatus.t[this.af].a));
                                        this.a((short) 4651, var33, (String) null);
                                        break;
                                    case 39:
                                        if (GlobalStatus.ew != null && GlobalStatus.ew.length > 0) {
                                            this.a((short) this.k, (byte) 2);
                                        } else {
                                            this.e.processException("锻造列表为空");
                                        }
                                        break;
                                    case 41:
                                        byte[] var21;
                                        if ((var21 = NetPayloadBuilder.a((short) 4660, (short) GlobalStatus.t[this.af].a, GlobalStatus.ad)) != null) {
                                            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4660, var21));
                                            this.e.a((String) null);
                                        } else {
                                            this.e.processException("获取上传指令数据错误!");
                                        }
                                        break;
                                    case 42:
                                        byte[] var20;
                                        if ((var20 = NetPayloadBuilder.a((short) 4662, (short) GlobalStatus.t[this.af].a, GlobalStatus.ad)) != null) {
                                            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4662, var20));
                                            this.e.a((String) null);
                                        } else {
                                            this.e.processException("获取上传指令数据错误!");
                                        }
                                        break;
                                    case 43:
                                        this.e.a((String) "输入兑换码", (int) 0);
                                        break;
                                    case 44:
                                        this.U.a.processException("装备暂不能升星");
                                        break;
                                    case 45:
                                        this.a((short) 4665, String.valueOf(GlobalStatus.t[this.af].a), (byte) 2, "", GlobalStatus.t[this.af].S);
                                        this.j = this.k = 0;
                                        break;
                                    case 46:
                                        this.O.d();
                                        this.O.a(true);
                                        break;
                                    case 47:
                                        if (this.P == null) {
                                            this.P = new r(this, this.e, MainCanvas.f);
                                        }

                                        this.P.b();
                                        this.P.a(true);
                                        break;
                                    case 48:
                                        this.ar = 0;
                                        this.m = 0;
                                        this.an = new String[]{"银两竞标", "金豆竞标"};
                                        GlobalConfig.a(this.e.l, GlobalStatus.ap);
                                        K = new TextRender(GlobalStatus.t[this.af].b + ":选择银两竞标或金豆竞标，一金豆折合300万银两。", (short) (GlobalConfig.defaultWidth - 20));
                                        LoadingPage.a(MainCanvas.F, K, this.an, (String[]) null, true);
                                        this.l = 10;
                                        break;
                                    case 49:
                                        byte[] var32;
                                        if ((var32 = NetPayloadBuilder.a((byte) 0)) != null) {
                                            NetPacket var5 = new NetPacket((short) 4683, var32);
                                            MainCanvas.netUtils.sendPacket(var5);
                                            this.e.a((String) null);
                                        } else {
                                            this.e.processException("获取上传指令数据错误!");
                                        }
                                }
                            }
                        } else if (this.am != null) {
                            LoadingPage.g = LoadingPage.g + 1 < this.am.length ? LoadingPage.g + 1 : 0;
                        }
                    } else if (this.am != null) {
                        LoadingPage.g = LoadingPage.g - 1 >= 0 ? LoadingPage.g - 1 : this.am.length - 1;
                    }
                } else {
                    GlobalStatus.j();
                    GlobalStatus.l();
                    GlobalStatus.k();
                    GlobalStatus.m();
                    GlobalStatus.A();
                    GlobalStatus.u();
                    GlobalStatus.r();
                    GlobalStatus.bQ = null;
                    K = null;
                    this.am = null;
                    bH.removeAllElements();
                    this.N();
                }
            }
        } else if (this.l == 1) {
            if (var1 != 1 && var1 != 514) {
                if (var1 != 4 && var1 != 520) {
                    if (var1 != 8 && var1 != 516) {
                        if (var1 != 2 && var1 != 518) {
                            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                                if (var1 == 536870912) {
                                    GlobalStatus.bH = null;
                                    this.am = null;
                                    K = null;
                                    this.l = 0;
                                    this.m();
                                }
                            } else if (LoadingPage.g == 0) {
                                if (GlobalStatus.bE && GlobalStatus.bG != -1) {
                                    byte[] var14;
                                    if ((var14 = NetPayloadBuilder.b((short) 4108, GlobalStatus.ad, (int) GlobalStatus.bG, (int) GlobalStatus.bF)) != null) {
                                        MainCanvas.netUtils.sendPacket(new NetPacket((short) 4108, var14));
                                        GlobalStatus.j();
                                        this.N();
                                        this.e.a((String) null);
                                    } else {
                                        this.e.processException("获取上传指令数据错误!");
                                    }
                                } else if (GlobalStatus.bK[this.ai] == -1) {
                                    byte[] var12;
                                    if ((var12 = NetPayloadBuilder.b((short) 4108, GlobalStatus.ad, (int) GlobalStatus.bI[this.ai], (int) -1)) != null) {
                                        MainCanvas.netUtils.sendPacket(new NetPacket((short) 4108, var12));
                                        GlobalStatus.j();
                                        this.N();
                                        this.e.a((String) null);
                                    } else {
                                        this.e.processException("获取上传指令数据错误!");
                                    }
                                } else if (GlobalStatus.bK[this.ai] == 1) {
                                    this.N();
                                    byte[] var13;
                                    if ((var13 = NetPayloadBuilder.c((short) 4109, GlobalStatus.ad, (int) GlobalStatus.t[this.af].a, (int) GlobalStatus.bI[this.ai])) != null) {
                                        MainCanvas.netUtils.sendPacket(new NetPacket((short) 4109, var13));
                                        GlobalStatus.j();
                                        this.e.a((String) null);
                                    } else {
                                        this.e.processException("获取上传指令数据错误!");
                                    }
                                } else {
                                    GlobalStatus.bH = null;
                                    this.am = null;
                                    K = null;
                                    this.l = 0;
                                    this.m();
                                }

                                this.l = 0;
                            } else if (LoadingPage.g == 1) {
                                GlobalStatus.bH = null;
                                this.am = null;
                                K = null;
                                this.l = 0;
                                if (GlobalStatus.bE && GlobalStatus.bG != -1) {
                                    this.N();
                                    GlobalStatus.bE = false;
                                    GlobalStatus.bG = -1;
                                } else {
                                    this.m();
                                }
                            }
                        } else {
                            LoadingPage.e = LoadingPage.e + LoadingPage.d < K.a() ? LoadingPage.e + LoadingPage.d : LoadingPage.e;
                        }
                    } else {
                        LoadingPage.e = LoadingPage.e - LoadingPage.d >= 0 ? LoadingPage.e - LoadingPage.d : 0;
                    }
                } else if (this.an != null) {
                    LoadingPage.g = LoadingPage.g + 1 < this.an.length ? LoadingPage.g + 1 : 0;
                }
            } else if (this.an != null) {
                LoadingPage.g = LoadingPage.g - 1 >= 0 ? LoadingPage.g - 1 : this.an.length - 1;
            }
        } else if (this.l != 3 && this.l != 4 && this.l != 10) {
            if (this.l == 5) {
                if (var1 != 1 && var1 != 514) {
                    if (var1 != 4 && var1 != 520) {
                        if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                            if (var1 == 536870912) {
                                this.l = 0;
                                this.m();
                            }
                        } else if (LoadingPage.g == 0) {
                            if (GlobalStatus.fA != null) {
                                this.j((int) 2);
                            } else {
                                this.e.processException("您没有宠物!");
                            }
                        } else if (LoadingPage.g == 1) {
                            if (GlobalStatus.gs != null) {
                                this.aF();
                            } else {
                                this.e.processException("没有寄养宠物!");
                            }
                        }
                    } else if (this.an != null) {
                        LoadingPage.g = LoadingPage.g + 1 < this.an.length ? LoadingPage.g + 1 : 0;
                    }
                } else if (this.an != null) {
                    LoadingPage.g = LoadingPage.g - 1 >= 0 ? LoadingPage.g - 1 : this.an.length - 1;
                }
            } else if (this.l == 7) {
                if (var1 != 514 && var1 != 1) {
                    if (var1 != 520 && var1 != 4) {
                        if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                            if (var1 == 536870912) {
                                this.l = 0;
                                this.m();
                            }
                        } else if (LoadingPage.g == 0) {
                            GlobalStatus.gQ = 1;
                            this.S.a();
                        } else if (LoadingPage.g == 1) {
                            this.e.p();
                        }
                    } else {
                        LoadingPage.g = LoadingPage.g == 1 ? 0 : 1;
                    }
                } else {
                    LoadingPage.g = LoadingPage.g == 0 ? 1 : 0;
                }
            } else if (this.l == 9) {
                if (var1 != 514 && var1 != 1) {
                    if (var1 != 520 && var1 != 4) {
                        if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                            if (var1 == 536870912) {
                                this.l = 0;
                                this.m();
                            }
                        } else if (LoadingPage.g == 0) {
                            aq var19 = this.M;
                            byte[] var30;
                            if ((var30 = NetPayloadBuilder.q((short) 4219, GlobalStatus.ad)) != null) {
                                MainCanvas.netUtils.sendPacket(new NetPacket((short) 4219, var30));
                                var19.b.a((String) null);
                            } else {
                                var19.b.processException("获取上传指令数据错误!");
                            }
                        } else if (LoadingPage.g == 1) {
                            this.e.a((String) "输入公告", (int) 0);
                        }
                    } else {
                        LoadingPage.g = LoadingPage.g == 1 ? 0 : 1;
                    }
                } else {
                    LoadingPage.g = LoadingPage.g == 0 ? 1 : 0;
                }
            }
        } else if (this.m == 0) {
            if (var1 != 1 && var1 != 514) {
                if (var1 != 4 && var1 != 520) {
                    if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                        if (var1 == 536870912) {
                            this.l = 0;
                            this.m();
                        }
                    } else if (LoadingPage.g == 0) {
                        if (this.l == 3) {
                            if (GlobalStatus.ct != null) {
                                if (this.k == 2) {
                                    this.n((int) 0);
                                }
                            } else {
                                GlobalStatus.m();
                                this.e.processException("仓库中没有物品");
                            }
                        } else if (this.l == 4) {
                            if (GlobalStatus.aq > 0L) {
                                this.ah = GlobalStatus.aq;
                                this.m = 1;
                                this.o();
                            } else {
                                this.e.processException("银库中没有银两");
                            }
                        } else if (GlobalStatus.ap > 0L) {
                            this.a(GlobalStatus.ap);
                            this.m = 3;
                            this.o();
                        } else {
                            this.e.processException("身上没有银两");
                        }
                    } else if (LoadingPage.g == 1) {
                        if (this.l == 3) {
                            this.e((int) 2);
                        } else if (this.l == 4) {
                            if (GlobalStatus.ap > 0L) {
                                this.ah = GlobalStatus.ap;
                                this.m = 2;
                                this.o();
                            } else {
                                this.e.processException("身上没有银两");
                            }
                        } else {
                            this.o();
                            this.a(99L);
                            this.m = 4;
                        }
                    }
                } else if (this.an != null) {
                    LoadingPage.g = LoadingPage.g + 1 < this.an.length ? LoadingPage.g + 1 : 0;
                }
            } else if (this.an != null) {
                LoadingPage.g = LoadingPage.g - 1 >= 0 ? LoadingPage.g - 1 : this.an.length - 1;
            }
        } else if (this.m != 1 && this.m != 2 && this.m != 3) {
            if (this.m == 4) {
                this.b(var1);
                if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                    if (var1 == 536870912) {
                        this.m = 0;
                    }
                } else {
                    this.at = "确定消耗" + this.ag + "金豆进行攻城竞标？";
                    LoadingPage.h = 0;
                    this.m = 6;
                }
            } else if (this.m == 5) {
                if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                    if (var1 == 536870912) {
                        this.m = 0;
                        LoadingPage.h = 0;
                        this.at = null;
                    }
                } else {
                    byte[] var17;
                    if ((var17 = NetPayloadBuilder.a((short) 4676, (byte) 1, this.n(), GlobalStatus.ad)) != null) {
                        NetPacket var28 = new NetPacket((short) 4676, var17);
                        MainCanvas.netUtils.sendPacket(var28);
                        this.e.a((String) null);
                    } else {
                        this.e.processException("获取上传指令数据错误!");
                    }
                }
            } else if (this.m == 6) {
                if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                    if (var1 == 536870912) {
                        this.m = 0;
                        LoadingPage.h = 0;
                        this.at = null;
                    }
                } else {
                    byte[] var18;
                    if ((var18 = NetPayloadBuilder.a((short) 4676, (byte) 2, (long) this.ag, GlobalStatus.ad)) != null) {
                        NetPacket var29 = new NetPacket((short) 4676, var18);
                        MainCanvas.netUtils.sendPacket(var29);
                        this.e.a((String) null);
                    } else {
                        this.e.processException("获取上传指令数据错误!");
                    }
                }
            }
        } else if (var1 != 268435456 && var1 != 1073741824) {
            if (var1 == 536870912) {
                this.e.o();
                this.m = 0;
            } else {
                this.d(var1);
            }
        } else if (this.n() != -1L) {
            if (this.n() > this.ah) {
                if (this.m == 1) {
                    this.e.processException("超出最大值,请重新输入");
                } else {
                    this.e.processException("您的银两不足,请重新输入");
                }
            } else if (this.m == 1) {
                byte[] var15;
                if ((var15 = NetPayloadBuilder.a((short) 4159, GlobalStatus.ad, this.n(), (byte) 0)) != null) {
                    NetPacket var26 = new NetPacket((short) 4159, var15);
                    MainCanvas.netUtils.sendPacket(var26);
                    this.e.a((String) null);
                } else {
                    this.e.processException("获取上传指令数据错误!");
                }
            } else if (this.m == 2) {
                byte[] var16;
                if ((var16 = NetPayloadBuilder.a((short) 4159, GlobalStatus.ad, this.n(), (byte) 1)) != null) {
                    NetPacket var27 = new NetPacket((short) 4159, var16);
                    MainCanvas.netUtils.sendPacket(var27);
                    this.e.a((String) null);
                } else {
                    this.e.processException("获取上传指令数据错误!");
                }
            } else if (this.m == 3) {
                this.at = "确定消耗" + GlobalStatus.a(this.n()) + "进行攻城竞标？";
                LoadingPage.h = 0;
                this.m = 5;
            }
        } else {
            this.e.processException("输入有误,请重新输入");
        }

        this.e.b = 0;
    }

    public final void a(boolean var1) {
        this.bJ = var1;
        this.e.touchAction = 0;
        this.e.b = 0;
        this.l = 0;
        this.e.aq.j();
        this.e.aq.a("传送目的地");
        String[] var3 = new String[GlobalStatus.cs.length];

        for (int var2 = 0; var2 < var3.length; ++var2) {
            var3[var2] = "";
        }

        this.e.ar.a((Image[]) null, var3, GlobalStatus.cs, (String[]) null);
        this.e.aq.a((al) this.e.ar);
        this.e.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
        this.e.touchPageCase = this.e.k;
        this.j = this.k = 10;
    }

    private void w(int var1) {
        if (this.e.aq != null) {
            this.e.aq.b(var1);
            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    if (this.bJ) {
                        K = null;
                        this.m();
                        return;
                    }

                    if (this.by == 1) {
                        this.by = 0;
                        this.N();
                        return;
                    }

                    this.l();
                    this.c((int) 3);
                }
            } else {
                byte[] var2;
                if ((var2 = NetPayloadBuilder.a((short) 4142, GlobalStatus.ad, (int) (this.bJ ? GlobalStatus.t[this.af].a : -1), (short) GlobalStatus.cr[this.e.ar.g()])) == null) {
                    this.e.processException("获取上传指令数据错误!");
                    return;
                }

                NetPacket var3 = new NetPacket((short) 4142, var2);
                MainCanvas.netUtils.sendPacket(var3);
                this.e.a((String) null);
            }
        }

    }

    public final void d(int var1) {
        if (var1 == 8 && this.ak.length() > 0) {
            this.ak.deleteCharAt(this.ak.length() - 1);
        } else if (this.ak.length() < 9 && (this.ak.length() != 0 || var1 != 48)) {
            switch (var1) {
                case 48:
                    this.ak.append('0');
                    return;
                case 513:
                    this.ak.append('1');
                    return;
                case 514:
                    this.ak.append('2');
                    return;
                case 515:
                    this.ak.append('3');
                    return;
                case 516:
                    this.ak.append('4');
                    return;
                case 517:
                    this.ak.append('5');
                    return;
                case 518:
                    this.ak.append('6');
                    return;
                case 519:
                    this.ak.append('7');
                    return;
                case 520:
                    this.ak.append('8');
                    return;
                case 521:
                    this.ak.append('9');
                default:
            }
        }
    }

    public final long n() {
        return !this.ak.toString().equals("") && this.ak.toString().length() != 0 && !this.ak.toString().substring(0, 1).equals("-") ? Long.parseLong(this.ak.toString()) : -1L;
    }

    public final void o() {
        this.ak.delete(0, this.ak.length());
    }

    public final void b(Graphics var1, String var2) {
        LoadingPage.a(var1, var2, (int) this.n(), false);
    }

    public final void a(byte var1) {
        GlobalConfig.clearStr(this.e.l);
        this.e.aq.j();
        this.e.aq.a("人物属性-战力" + GlobalStatus.ao);
        this.e.aq.a(true);
        this.e.as.a(new String[]{"状态", "属性", "修炼", "声望", "加成", "记录"});
        this.e.aq.a((al) this.e.as);
        this.e.as.a = (byte) var1;
        switch (var1) {
            case 0:
                this.e.l.append("昵称：" + GlobalStatus.af + '\t');
                if (GlobalConfig.channel == 0) {
                    this.e.l.append("ID：" + GlobalStatus.ad + '\t');
                }

                this.e.l.append("门派：" + GlobalConfig.G[GlobalStatus.ax] + '\t');
                this.e.l.append("级别：" + GlobalStatus.ak + '\t');
                this.e.l.append("称号：" + GlobalStatus.ah + '\t');
                this.e.l.append("配偶：" + GlobalStatus.bl + '\t');
                this.e.l.append("师傅：" + GlobalStatus.bm + '\t');
                this.e.l.append("帮派：" + GlobalStatus.az + '\t');
                this.e.l.append("职务：" + GlobalStatus.aA + '\t');
                this.e.l.append("功勋：" + GlobalStatus.aB + '\t');
                this.e.l.append("经验：" + GlobalStatus.al + (GlobalStatus.z == 0 ? "" : "<暂停>") + '\t');
                this.e.l.append("修炼：" + GlobalStatus.am + (GlobalStatus.z == 1 ? "<开启>" : "<关闭>") + '\t');
                this.aB();
                break;
            case 1:
                this.e.l.append("生命：" + GlobalStatus.aN + "/" + GlobalStatus.aM + '\t');
                this.e.l.append("内力：" + GlobalStatus.aP + "/" + GlobalStatus.aO + '\t');
                this.e.l.append("物攻：[" + GlobalStatus.aR + "," + GlobalStatus.aQ + "]" + '\t');
                this.e.l.append("法伤：" + GlobalStatus.aW + '\t');
                this.e.l.append("法攻：[" + GlobalStatus.aY + "," + GlobalStatus.aX + "]" + '\t');
                this.e.l.append("物防：[" + GlobalStatus.aT + "," + GlobalStatus.aS + "]" + '\t');
                this.e.l.append("速度：" + GlobalStatus.aZ + '\t');
                this.e.l.append("冰抗：" + GlobalStatus.bc + '\t');
                this.e.l.append("火抗：" + GlobalStatus.ba + '\t');
                this.e.l.append("雷抗：" + GlobalStatus.bb + '\t');
                this.e.l.append(GlobalStatus.bd);
                this.aB();
                break;
            case 2:
                this.e.ar.a((Image[]) null, new String[]{"经验", "上限", "开关"}, (String[]) null, new String[]{String.valueOf(GlobalStatus.am), String.valueOf(GlobalStatus.an), GlobalStatus.z == 1 ? "<开>" : "<关>"});
                this.e.at.b("开启经验修炼模式后，杀怪、任务、使用道具获得的经验将会全部转入修炼经验，修炼经验可用于学习心法技能", GlobalConfig.i, (byte) 2);
                this.e.at.a((byte) 1);
                this.e.au.a("确定");
                this.e.aq.a((al) this.e.ar);
                this.e.aq.a((al) this.e.at);
                if (GlobalConfig.defaultHigh > 220) {
                    this.e.aq.a((al) this.e.au);
                }
                break;
            case 3:
                String[] var4 = null;
                if (GlobalStatus.jF != null && GlobalStatus.jF.length > 0) {
                    var4 = new String[GlobalStatus.jF.length];

                    for (int var5 = 0; var5 < var4.length; ++var5) {
                        var4[var5] = "" + GlobalStatus.jF[var5];
                    }
                }

                this.e.ar.a((Image[]) null, GlobalStatus.jE, (String[]) null, var4);
                this.e.aq.a((al) this.e.ar);
                break;
            case 4:
                this.e.l.append("住宅：" + GlobalStatus.bi + '\t');
                this.e.l.append("帮派：" + GlobalStatus.bj + '\t');
                this.e.l.append("称号：" + GlobalStatus.bB + '\t');
                this.e.l.append("装备：" + GlobalStatus.bk + '\t');
                this.e.l.append("祝福：\t" + GlobalStatus.bh + '\t');
                this.e.l.append("成就: " + GlobalStatus.bo + '\t');
                if (GlobalStatus.s == 1 && GlobalStatus.bg >= 1) {
                    this.e.l.append(new StringBuffer().append("队伍加成：").append(GlobalStatus.q != null ? new StringBuffer().append("属性+").append(GlobalStatus.bg * 5).append("%\n").append("经验+").append(GlobalStatus.bg * 5).append("%").toString() : "").append('\t').toString());
                }

                this.aB();
                break;
            case 5:
                this.e.l.append("" + GlobalStatus.bn + '\t');
                this.aB();
        }

        this.e.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
        this.e.touchPageCase = this.e.k;
        this.j = this.k = 3;
    }

    private void aB() {
        this.e.at.b(this.e.l.toString(), GlobalConfig.i, (byte) 2);
        this.e.aq.a((al) this.e.at);
    }

    public final void p() {
        this.bL = new int[9][2];
        this.bM = new short[9];
        this.bO = new String[9];
        this.bL[0][0] = GlobalStatus.aN;
        this.bL[0][1] = GlobalStatus.aM;
        this.bL[1][0] = GlobalStatus.aP;
        this.bL[1][1] = GlobalStatus.aO;
        this.bL[2][0] = GlobalStatus.aR;
        this.bL[2][1] = GlobalStatus.aQ;
        this.bL[3][0] = GlobalStatus.aV;
        this.bL[3][1] = GlobalStatus.aU;
        this.bL[4][0] = GlobalStatus.aT;
        this.bL[4][1] = GlobalStatus.aS;
        this.bL[5][0] = GlobalStatus.aZ;
        this.bL[5][1] = -1;
        this.bL[6][0] = GlobalStatus.bc;
        this.bL[6][1] = -1;
        this.bL[7][0] = GlobalStatus.ba;
        this.bL[7][1] = -1;
        this.bL[8][0] = GlobalStatus.bb;
        this.bL[8][1] = -1;

        for (int var1 = 0; var1 < this.bO.length; ++var1) {
            this.bO[var1] = this.bL[var1][0] + (this.bL[var1][1] != -1 ? "/" + this.bL[var1][1] : "");
        }

        this.e.aq.b();
        this.e.aq.a("属性分配");
        this.e.aq.a(false);
        this.e.ar.a((Image[]) null, this.bN, (String[]) null, this.bO);
        short var2 = MainCanvas.L.c;
        this.e.aq.f = var2;
        this.e.au.a(new String[]{"确定", "取消"});
        this.e.aq.a((al) this.e.ar);
        this.e.aq.a((al) this.e.au);
        this.e.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
        this.j = this.k;
        this.k = 37;
    }

    private short aC() {
        int var1 = 0;

        for (int var2 = 0; var2 < this.bM.length; ++var2) {
            var1 += this.bM[var2];
        }

        return (short) (GlobalStatus.bf - var1 < 0 ? 0 : GlobalStatus.bf - var1);
    }

    private void a(int var1, byte var2) {
        switch (var1) {
            case 0:
                this.bL[var1][0] += var2 * 20;
                if (this.bL[var1][1] != -1) {
                    this.bL[var1][1] += var2 * 20;
                }
                break;
            case 1:
                this.bL[var1][0] += var2 * 5;
                if (this.bL[var1][1] != -1) {
                    this.bL[var1][1] += var2 * 5;
                }
                break;
            case 2:
                this.bL[var1][0] = this.bL[var1][0] - (this.bM[var1] - var2) * 1250 / 1000 + this.bM[var1] * 1250 / 1000;
                if (this.bL[var1][1] != -1) {
                    this.bL[var1][1] = this.bL[var1][1] - (this.bM[var1] - var2) * 1250 / 1000 + this.bM[var1] * 1250 / 1000;
                }
                break;
            case 3:
                this.bL[var1][0] = this.bL[var1][0] - (this.bM[var1] - var2) * 400 / 1000 + this.bM[var1] * 400 / 1000;
                if (this.bL[var1][1] != -1) {
                    this.bL[var1][1] = this.bL[var1][1] - (this.bM[var1] - var2) * 400 / 1000 + this.bM[var1] * 400 / 1000;
                }
                break;
            case 4:
                this.bL[var1][0] = this.bL[var1][0] - (this.bM[var1] - var2) * 625 / 1000 + this.bM[var1] * 625 / 1000;
                if (this.bL[var1][1] != -1) {
                    this.bL[var1][1] = this.bL[var1][1] - (this.bM[var1] - var2) * 625 / 1000 + this.bM[var1] * 625 / 1000;
                }
                break;
            case 5:
                this.bL[var1][0] = this.bL[var1][0] - (this.bM[var1] - var2) * 1040 / 1000 + this.bM[var1] * 1040 / 1000;
                if (this.bL[var1][1] != -1) {
                    this.bL[var1][1] = this.bL[var1][1] - (this.bM[var1] - var2) * 1040 / 1000 + this.bM[var1] * 1040 / 1000;
                }
                break;
            default:
                this.bL[var1][0] = this.bL[var1][0] - (this.bM[var1] - var2) * 1875 / 1000 + this.bM[var1] * 1875 / 1000;
                if (this.bL[var1][1] != -1) {
                    this.bL[var1][1] = this.bL[var1][1] - (this.bM[var1] - var2) * 1875 / 1000 + this.bM[var1] * 1875 / 1000;
                }
        }

        this.bO[var1] = this.bL[var1][0] + (this.bL[var1][1] != -1 ? "/" + this.bL[var1][1] : "");
        int var2_ = this.e.ar.h();
        this.e.ar.a((Image[]) null, this.bN, (String[]) null, this.bO);
        this.e.ar.a(var2_, var1);
    }

    private void x(int var1) {
        if (this.e.aq != null) {
            this.e.aq.b(var1);
        }

        if (this.e.tempTouchStatus > 40) {
            if (this.e.b != 8 && this.e.b != 516) {
                if (this.e.b == 2 || this.e.b == 518) {
                    ++this.bM[this.e.ar.g()];
                    int var2 = 0;

                    for (int var3 = 0; var3 < this.bM.length; ++var3) {
                        var2 += this.bM[var3];
                    }

                    if (var2 > (this.k == 37 ? GlobalStatus.bf : GlobalStatus.fW[this.aE])) {
                        --this.bM[this.e.ar.g()];
                        return;
                    }

                    this.a((int) this.e.ar.g(), (byte) 1);
                }
            } else {
                --this.bM[this.e.ar.g()];
                if (this.bM[this.e.ar.g()] < 0) {
                    ++this.bM[this.e.ar.g()];
                    return;
                }

                this.a(this.e.ar.g(), (byte) -1);
            }
        } else {
            if (var1 != 8 && var1 != 516) {
                if (var1 == 2 || var1 == 518) {
                    ++this.bM[this.e.ar.g()];
                    int var4 = 0;

                    for (int var7 = 0; var7 < this.bM.length; ++var7) {
                        var4 += this.bM[var7];
                    }

                    if (var4 > (this.k == 37 ? GlobalStatus.bf : GlobalStatus.fW[this.aE])) {
                        --this.bM[this.e.ar.g()];
                        return;
                    }

                    this.a((int) this.e.ar.g(), (byte) 1);
                }
            } else {
                --this.bM[this.e.ar.g()];
                if (this.bM[this.e.ar.g()] < 0) {
                    ++this.bM[this.e.ar.g()];
                    return;
                }

                this.a(this.e.ar.g(), (byte) -1);
            }

            ++this.e.tempTouchStatus;
        }

        if (var1 == 268435456) {
            Object var5 = null;
            byte[] var6;
            if (this.k == 37) {
                this.ao = true;
                var6 = NetPayloadBuilder.a((short) 4186, (String) GlobalStatus.ad, (short[]) this.bM);
            } else {
                this.ap = true;
                var6 = NetPayloadBuilder.a((short) 4187, GlobalStatus.ad, (int) GlobalStatus.fA[this.aE], (short[]) this.bM);
            }

            NetPacket var8 = new NetPacket((short) 4186, var6);
            MainCanvas.netUtils.sendPacket(var8);
            this.e.a((String) null);
        } else {
            if (var1 == 536870912) {
                if (this.k == 37) {
                    this.al = null;
                    if (this.j == 1) {
                        this.av();
                        this.c((int) 4);
                        return;
                    }

                    this.N();
                    return;
                }

                this.c((int) 0, (int) this.aE, (int) this.aA);
                LoadingPage.o = 7;
                this.l = 1;
            }

        }
    }

    private void b(int var1, int var2, int var3, int var4, int var5) {
        if (this.bP != null && this.bP.length > var1) {
            this.bP[var1][0] = var2;
            this.bP[var1][1] = var3;
            this.bP[var1][2] = var4;
            this.bP[var1][3] = var5;
        }

    }

    public final int a(int var1, int var2, int var3) {
        if (this.bP != null) {
            if (var2 >= this.bP[0][0] && var2 <= this.bP[0][0] + this.bP[0][2] && var3 >= this.bP[0][1] && var3 <= this.bP[0][1] + this.bP[0][3]) {
                return 8;
            }

            if (var2 >= this.bP[1][0] && var2 <= this.bP[1][0] + this.bP[1][2] && var3 >= this.bP[1][1] && var3 <= this.bP[1][1] + this.bP[1][3]) {
                return 2;
            }
        }

        return var1;
    }

    private void a(Graphics var1, int var2) {
        if (this.e.aq != null) {
            this.e.aq.a(var1);
        }

        int var3 = 0;
        var1.drawImage(MainCanvas.L.pngImage, this.e.aq.a + 5, this.e.aq.b + this.e.aq.d - 53, 20);
        var1.drawImage(MainCanvas.L.pngImage, this.e.aq.a + this.e.aq.c - 5 - MainCanvas.L.b, this.e.aq.b + this.e.aq.d - 53, 20);
        int var4 = Math.max(this.e.aq.c - (MainCanvas.L.b << 1), GlobalConfig.i.stringWidth(String.valueOf(var2 == 0 ? this.aC() : this.S(this.aE))));
        var3 = this.e.aq.a + (this.e.aq.c - var4) / 2;
        var1.setColor(79948);
        var1.fillRect(var3, this.e.aq.b + this.e.aq.d - 53, var4, MainCanvas.L.c);
        if (var2 == 0) {
            var1.setColor(this.aC() < GlobalStatus.bf ? 16776960 : 16777215);
        } else {
            var1.setColor(this.S(this.aE) < GlobalStatus.fW[this.aE] ? 16776960 : 16777215);
        }

        var1.fillRect(var3 - 15, this.e.aq.b + this.e.aq.d - 42, 10, 2);
        this.b(0, var3 - MainCanvas.N.b, this.e.aq.b + this.e.aq.d - 51, MainCanvas.N.b, MainCanvas.N.c);
        var1.drawImage(MainCanvas.N.pngImage, this.bP[0][0], this.bP[0][1], 20);
        if (var2 == 0) {
            var1.setColor(this.aC() > 0 ? 16776960 : 16777215);
        } else {
            var1.setColor(this.S(this.aE) > 0 ? 16776960 : 16777215);
        }

        var1.fillRect(var3 + var4 + 5, this.e.aq.b + this.e.aq.d - 46, 10, 10);
        this.b(1, var3 + var4, this.e.aq.b + this.e.aq.d - 51, MainCanvas.M.b, MainCanvas.M.c);
        var1.drawImage(MainCanvas.M.pngImage, this.bP[1][0], this.bP[1][1], 20);
        var1.setColor(16776960);
        var1.drawString(String.valueOf(var2 == 0 ? this.aC() : this.S(this.aE)), GlobalConfig.defaultWidth >> 1, this.e.aq.b + this.e.aq.d - 51 + (MainCanvas.M.pngImage.getHeight() - GlobalConfig.j) / 2, 17);
    }

    public final void e(int var1) {
        this.l = 0;
        this.e.aw = 0;
        this.as = var1;
        if (this.as >= GlobalConfig.L.length) {
            this.as = 0;
        }

        this.bS = false;
        if (this.j == 9) {
            this.aq = this.aF;
            this.ar = this.aG;
        } else if (this.j != 4) {
            this.aq = this.ar = 0;
        }

        LoadingPage.l = 0;
        this.e.aq.b();
        this.e.aq.a("");
        this.e.aq.a(true);
        this.e.as.a(new String[]{" 一 ", " 二 ", " 三 ", " 四 ", " 五 "});
        this.e.as.a = this.aH;
        this.e.as.a((byte) 1);
        this.e.aq.a(GlobalConfig.realHigh <= 240 ? 79 : 120);
        bn var2;
        if ((var2 = this.y(0)) != null && (this.as != 4 && this.as != 15 && this.as != 16 && this.as != 20 || var2.g - var2.v > 0)) {
            this.q();
        } else {
            this.e.at.a("没有物品,按3、9键可以上下翻滚此属性描述框", GlobalConfig.i, (byte) 1);
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
        this.e.aq.a((al) this.e.as);
        this.e.aq.a((al) this.e.at);
        this.e.aq.a((al) this.e.au);
        this.e.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
        this.e.touchPageCase = this.e.k;
        this.j = this.k = 4;
    }

    public final void q() {
        if (GlobalStatus.bC.size() > 0 && this.A((this.ar << 3) + this.aq) != null) {
            this.e.at.a(this.A((this.ar << 3) + this.aq), GlobalConfig.i, (byte) 1);
        } else {
            this.e.at.a("没有物品,按3、9键可以上下翻滚此属性描述框", GlobalConfig.i, (byte) 1);
        }

        this.e.at.a((byte) 1);
        LoadingPage.l = 0;
    }

    private bn y(int var1) {
        var1 = (this.e.as.a << 5) + var1;
        bn var3 = null;

        for (int var2 = 0; var2 < GlobalStatus.bC.size(); ++var2) {
            if ((var3 = (bn) GlobalStatus.bC.elementAt(var2)) != null && var3.h == var1) {
                return var3;
            }
        }

        return null;
    }

    private int z(int var1) {
        var1 = (this.e.as.a << 5) + var1;
        Object var3 = null;

        for (int var2 = 0; var2 < GlobalStatus.bC.size(); ++var2) {
            bn var4;
            if ((var4 = (bn) GlobalStatus.bC.elementAt(var2)) != null && var4.h == var1) {
                return var4.a;
            }
        }

        return 0;
    }

    public static boolean r() {
        Object var0 = null;

        for (int var1 = 0; var1 < GlobalStatus.bC.size(); ++var1) {
            bn var2;
            if ((var2 = (bn) GlobalStatus.bC.elementAt(var1)) != null && var2.f == 2) {
                return true;
            }
        }

        return false;
    }

    private String A(int var1) {
        var1 = (this.e.as.a << 5) + var1;
        Object var2 = null;

        for (int var3 = 0; var3 < GlobalStatus.bC.size(); ++var3) {
            bn var5;
            if ((var5 = (bn) GlobalStatus.bC.elementAt(var3)) != null && var5.h == var1) {
                if (this.j == 4 && this.as == 4 && var5.g - var5.v <= 0) {
                    return null;
                }

                return a(var5);
            }
        }

        return null;
    }

    private static String a(bn var0) {
        StringBuffer var1;
        (var1 = new StringBuffer()).append(var0.b);
        var1.append('\t');
        if (var0.j != null && var0.j.length() > 0) {
            var1.append(var0.j);
            var1.append('\t');
        }

        if (var0.k != null && var0.k.length() > 0) {
            var1.append(var0.k);
            var1.append('\t');
        }

        if (var0.l != null && var0.l.length() > 0) {
            var1.append(var0.l);
            var1.append('\t');
        }

        if (var0.p > 0) {
            var1.append("等级:");
            var1.append(var0.p);
            var1.append('\t');
        }

        if (var0.e > 0) {
            var1.append("状态:");
            var1.append(var0.e == 1 ? "已绑定" : "装备绑定");
            var1.append('\t');
        }

        if (var0.s != null) {
            var1.append(var0.s);
            var1.append('\t');
        }

        return var1.toString();
    }

    private void B(int var1) {
        if (this.l == 0) {
            this.aV();
            if (this.e.aq != null) {
                this.e.aq.b(var1);
            }

            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 1024 || var1 == 2048) {
                    this.q();
                    return;
                }

                if (var1 != 8 && var1 != 516) {
                    if (var1 != 2 && var1 != 518) {
                        if (var1 != 1 && var1 != 514) {
                            if (var1 != 4 && var1 != 520) {
                                if (var1 == 536870912) {
                                    this.al = null;
                                    this.am = null;
                                    this.at = null;
                                    this.aF = 0;
                                    this.aG = 0;
                                    this.aH = 0;
                                    if (this.as == 0) {
                                        if (this.by == 1) {
                                            this.N();
                                            this.by = 0;
                                            return;
                                        }

                                        this.at();
                                        this.c((int) 2);
                                        return;
                                    }

                                    if (this.as == 1) {
                                        this.c((int) 0, (int) this.aE, (int) this.aA);
                                        this.E();
                                        LoadingPage.o = 0;
                                        this.l = 1;
                                        return;
                                    }

                                    if (this.as == 2) {
                                        this.m();
                                        this.aq = 0;
                                        this.an = new String[]{"取出物品", "存入物品"};
                                        K = new TextRender(GlobalStatus.t[this.af].b + ":物品仓库已打开", (short) (GlobalConfig.defaultWidth - 20));
                                        LoadingPage.a(MainCanvas.F, K, this.an, (String[]) null, true);
                                        this.l = 3;
                                        return;
                                    }

                                    if (this.as == 3) {
                                        this.c((int) 0, (int) this.aE, (int) this.aA);
                                        LoadingPage.o = 2;
                                        this.l = 1;
                                        return;
                                    }

                                    if (this.as == 4) {
                                        this.b((byte) 0, true);
                                        this.ar = this.aU;
                                        this.e.ax = this.aV;
                                        return;
                                    }

                                    if (this.as == 5 || this.as == 8) {
                                        this.m();
                                        LoadingPage.o = this.ai;
                                        return;
                                    }

                                    if (this.as == 6) {
                                        this.e.touchPageCase = this.e.k;
                                        this.j = this.k = 25;
                                        return;
                                    }

                                    if (this.as == 7) {
                                        this.t();
                                        return;
                                    }

                                    if (this.as == 9) {
                                        this.as = 0;
                                        this.c(false);
                                        return;
                                    }

                                    if (this.as == 10) {
                                        this.O.a();
                                        this.e.ar.a(0);
                                        return;
                                    }

                                    if (this.as == 11) {
                                        this.aH = this.e.as.a;
                                        this.O.a(this.O.a, (short) this.O.c, this.O.d);
                                        return;
                                    }

                                    if (this.as == 13) {
                                        this.p((int) 0);
                                        return;
                                    }

                                    if (this.as == 14) {
                                        this.c((int) 0, (int) this.aE, (int) this.aA);
                                        this.E();
                                        LoadingPage.o = 8;
                                        this.l = 1;
                                        return;
                                    }

                                    if (this.as == 18) {
                                        this.M.b(true);
                                        return;
                                    }

                                    if (this.as == 20) {
                                        this.e(false);
                                        return;
                                    }

                                    if (this.as == 21 || this.as == 22) {
                                        this.s(this.bg);
                                        return;
                                    }
                                }

                                return;
                            }

                            this.ar = this.ar >= 3 ? 0 : ++this.ar;
                            this.s();
                            return;
                        }

                        this.ar = this.ar <= 0 ? 3 : --this.ar;
                        this.s();
                        return;
                    }

                    this.aq = this.aq >= 7 ? 0 : ++this.aq;
                    this.s();
                    return;
                }

                this.aq = this.aq <= 0 ? 7 : --this.aq;
                this.s();
                return;
            } else {
                bn var22;
                if ((var22 = this.y((this.ar << 3) + this.aq)) == null || var22.a <= 0 || this.A((this.ar << 3) + this.aq) == null) {
                    return;
                }

                if (this.as == 0) {
                    LoadingPage.a(this.au[(this.ar << 3) + this.aq][0] - 17, this.au[(this.ar << 3) + this.aq][1] + 17, this.am, false);
                    this.l = 1;
                } else if (this.as == 1) {
                    byte[] var34;
                    if ((var34 = NetPayloadBuilder.g((short) 4173, GlobalStatus.ad, GlobalStatus.fA[this.e.ar.g()], (int) this.z((this.ar << 3) + this.aq))) != null) {
                        NetPacket var23 = new NetPacket((short) 4173, var34);
                        MainCanvas.netUtils.sendPacket(var23);
                        this.e.a((String) null);
                        return;
                    }

                    this.e.processException("获取上传指令数据错误!");
                } else if (this.as == 2) {
                    if (var22.g > 1) {
                        this.a((long) var22.g);
                        this.l = 2;
                    } else {
                        this.E(var22.g);
                    }
                } else if (this.as == 3) {
                    byte[] var35;
                    if ((var35 = NetPayloadBuilder.h((short) 4174, GlobalStatus.ad, GlobalStatus.fA[this.e.ar.g()], this.z((this.ar << 3) + this.aq))) != null) {
                        NetPacket var24 = new NetPacket((short) 4174, var35);
                        MainCanvas.netUtils.sendPacket(var24);
                        this.e.a((String) null);
                        return;
                    }

                    this.e.processException("获取上传指令数据错误!");
                } else if (this.as == 4) {
                    if (var22.g - var22.v <= 0) {
                        return;
                    }

                    if (GlobalStatus.a(var22.d)) {
                        LoadingPage.a(this.au[(this.ar << 3) + this.aq][0] - 17, this.au[(this.ar << 3) + this.aq][1] + 17, new String[]{"查看", "交易"}, false);
                        this.l = 15;
                    } else if (var22.g - var22.v <= 1) {
                        this.D(1);
                        this.b((byte) 0, true);
                        this.ar = this.aU;
                        this.e.ax = this.aV;
                        this.as = 0;
                        this.e.a((String) null);
                    } else {
                        if (var22.g - var22.v <= 1) {
                            return;
                        }

                        this.a((long) (var22.g - var22.v));
                        this.l = 4;
                    }
                } else if (this.as == 5) {
                    if (GlobalStatus.a(var22.d)) {
                        LoadingPage.a(this.au[(this.ar << 3) + this.aq][0] - 17, this.au[(this.ar << 3) + this.aq][1] + 17, new String[]{"查看", "拍卖"}, false);
                        this.l = 16;
                    } else if (var22.g > 1) {
                        this.a((long) var22.g);
                        this.l = 7;
                    } else {
                        this.ag = 1;
                        this.l = 6;
                        this.o();
                    }
                } else if (this.as == 6) {
                    if (var22.d != 10 && var22.d != 15 && var22.d != 16) {
                        this.e.processException("战斗中你不能使用该物品!");
                    } else {
                        if (this.g == null) {
                            return;
                        }

                        if (bq_1.h() && var22.f != 2) {
                            this.e.processException("你只能使用复活道具");
                            return;
                        }

                        if (var22.d == 16) {
                            if (var22.f == 3) {
                                if (this.g.j()) {
                                    this.g.a((byte) 2, var22.a, (byte) 0, bq_1.i(), (byte) 1, 1, (byte) 1, (byte) -1);
                                    this.g.f = -1;
                                    this.g.e = 5;
                                } else {
                                    this.g.j = 2;
                                    this.g.p = var22.a;
                                    this.g.n = 0;
                                    this.g.d = 4;
                                }
                            } else if (var22.f == 4) {
                                if (bq_1.b() <= 1) {
                                    this.g.a((byte) 2, var22.a, (byte) 0, bq_1.i(), (byte) 1, 1, (byte) 1, (byte) -1);
                                    this.g.f = -1;
                                    this.g.e = 5;
                                } else {
                                    this.g.j = 2;
                                    this.g.p = var22.a;
                                    this.g.n = 0;
                                    this.g.d = 4;
                                }
                            } else if (var22.f == 5) {
                                if (bq_1.c() <= 1) {
                                    this.g.a((byte) 2, var22.a, (byte) 1, GlobalStatus.M[this.g.h].a, (byte) 2, -1, (byte) -1, (byte) -1);
                                    this.g.f = -1;
                                    this.g.e = 5;
                                } else {
                                    this.g.j = 2;
                                    this.g.p = var22.a;
                                    this.g.n = 1;
                                    this.g.d = 9;
                                }
                            }
                        } else if (GlobalStatus.H.length > 1 && !bq_1.h()) {
                            this.g.j = 2;
                            this.g.p = var22.a;
                            this.g.n = 0;
                            this.g.d = 4;
                        } else {
                            if (bq_1.h()) {
                                this.g.m();
                            }

                            this.g.a((byte) 2, var22.a, (byte) 0, GlobalStatus.H[this.g.i].a, (byte) 2, -1, (byte) -1, (byte) -1);
                            this.g.f = -1;
                            this.g.e = 5;
                        }

                        this.j = this.k = 25;
                    }
                } else if (this.as == 7) {
                    if (!GlobalStatus.b(var22.d)) {
                        return;
                    }

                    byte[] var36;
                    if ((var36 = NetPayloadBuilder.b((short) 4135, GlobalStatus.ad, (int) var22.a, (byte) ((byte) (0 + this.av)))) != null) {
                        MainCanvas.netUtils.sendPacket(new NetPacket((short) 4135, var36));
                        this.e.a((String) null);
                        return;
                    }

                    this.e.processException("获取上传指令数据错误!");
                } else if (this.as == 8) {
                    if (var22.g > 1) {
                        this.a((long) var22.g);
                        this.l = 12;
                    } else {
                        this.ag = 1;
                        this.l = 11;
                        this.o();
                    }
                } else if (this.as == 9) {
                    if (!GlobalStatus.c(var22.d)) {
                        return;
                    }

                    if (var22.e == 2) {
                        this.l = 13;
                        LoadingPage.h = 0;
                    } else {
                        this.as = 0;
                        this.V(var22.a);
                    }
                } else if (this.as == 10) {
                    if (!GlobalStatus.a(var22.d)) {
                        return;
                    }

                    LoadingPage.a(this.au[(this.ar << 3) + this.aq][0] - 17, this.au[(this.ar << 3) + this.aq][1] + 17, new String[]{"查看", "打孔"}, false);
                    this.l = 14;
                } else if (this.as == 11) {
                    if (var22.d != 30) {
                        return;
                    }

                    o_1.e = 1;
                    if (this.O.c == 13) {
                        byte[] var37;
                        if ((var37 = NetPayloadBuilder.a((short) 4687, GlobalStatus.ko, (byte) 3, GlobalStatus.jG, var22.a, this.O.b, "", GlobalStatus.ad)) != null) {
                            NetPacket var25 = new NetPacket((short) 4687, var37);
                            MainCanvas.netUtils.sendPacket(var25);
                            this.e.a((String) null);
                            return;
                        }

                        this.e.processException("获取上传指令数据错误!");
                    } else {
                        byte[] var38;
                        if ((var38 = NetPayloadBuilder.c((short) 4645, GlobalStatus.ad, GlobalStatus.ko, var22.a, this.O.b)) != null) {
                            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4645, var38));
                            this.e.a((String) null);
                            return;
                        }

                        this.e.processException("获取上传指令数据错误!");
                    }
                } else if (this.as == 13) {
                    byte[] var26;
                    if ((var26 = NetPayloadBuilder.b((short) 4856, GlobalStatus.ad, GlobalStatus.dK[this.e.ar.g() - 1], (int) this.z((this.ar << 3) + this.aq))) != null) {
                        NetPacket var27 = new NetPacket((short) 4856, var26);
                        MainCanvas.netUtils.sendPacket(var27);
                        this.e.a((String) null);
                        return;
                    }

                    this.e.processException("获取上传指令数据错误!");
                } else if (this.as == 14) {
                    byte[] var39;
                    if ((var39 = NetPayloadBuilder.h((short) 4661, GlobalStatus.ad, GlobalStatus.fA[this.e.ar.g()], this.z((this.ar << 3) + this.aq))) != null) {
                        NetPacket var28 = new NetPacket((short) 4661, var39);
                        MainCanvas.netUtils.sendPacket(var28);
                        this.e.a((String) null);
                        return;
                    }

                    this.e.processException("获取上传指令数据错误!");
                } else if (this.as == 18) {
                    if (var22.g > 1) {
                        this.a((long) var22.g);
                        this.l = 2;
                    } else {
                        LoadingPage.h = 0;
                        int var40 = LoadingPage.a(var22.b) != -1 ? LoadingPage.a(var22.b) : 15138723;
                        this.at = "您确定向你的帮派捐献" + (var40 != 15138723 ? var22.b.substring(3, var22.b.length()) : var22.b) + "X" + var22.g + "？";
                        this.l = 18;
                    }
                } else if (this.as == 20) {
                    GlobalConfig.printStr("升星 选择物品");
                    if (var22.g - var22.v <= 0) {
                        return;
                    }

                    this.b((int) var22.a, (byte) 0);
                } else {
                    if (this.as != 21) {
                        if (this.as == 22) {
                            this.a((byte) 0, GlobalStatus.fA[this.bg], var22.a, (byte) 35, (byte) ((byte) (this.e.ar.g() - 5)));
                        }

                        return;
                    }

                    this.a((byte) 0, GlobalStatus.fA[this.bg], var22.a, (byte) 34, (byte) ((byte) this.e.ar.g()));
                }
            }
        } else if (this.l == 1) {
            this.a(GlobalStatus.en);
            LoadingPage.b(var1);
            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    this.l = 0;
                    return;
                }
            } else {
                bn var19;
                if ((var19 = this.y((this.ar << 3) + this.aq)) == null || var19.a <= 0 || var19.g <= 0) {
                    this.l = 0;
                    return;
                }

                switch (LoadingPage.o) {
                    case 0:
                        if (GlobalStatus.a(var19.d) && var19.e == 2) {
                            this.l = 10;
                            LoadingPage.h = 0;
                            return;
                        }

                        byte[] var33;
                        if ((var33 = NetPayloadBuilder.b((short) 4105, GlobalStatus.ad, (int) var19.a)) == null) {
                            this.e.processException("获取上传指令数据错误!");
                            return;
                        }

                        NetPacket var21 = new NetPacket((short) 4105, var33);
                        MainCanvas.netUtils.sendPacket(var21);
                        this.e.a((String) null);
                        break;
                    case 1:
                        this.aH = this.e.as.a;
                        if (GlobalStatus.a(var19.d)) {
                            GlobalStatus.a(var19);
                            this.O.a(0, (short) this.k, this.as);
                        } else {
                            this.e.aq.j();
                            this.e.aq.b();
                            this.e.aq.a("物品详情");
                            this.e.at.a(this.A((this.ar << 3) + this.aq), GlobalConfig.i, (byte) 1);
                            this.e.aq.a((al) this.e.at);
                            this.e.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
                            this.l = 17;
                        }

                        return;
                    case 2:
                        if (var19.g > 1) {
                            this.a((long) var19.g);
                            this.l = 2;
                        } else {
                            LoadingPage.a(this.au[(this.ar << 3) + this.aq][0] - 17, this.au[(this.ar << 3) + this.aq][1] + 17, new String[]{"取消", "确认"}, false);
                            this.l = 3;
                        }

                        return;
                    case 3:
                        if (this.e.touchPageCase != 2) {
                            this.e.touchPageCase = this.e.k;
                        }

                        this.az = 0;
                        this.l = 8;
                        return;
                    case 4:
                        byte[] var32;
                        if ((var32 = NetPayloadBuilder.j((short) 4143, GlobalStatus.ad)) != null) {
                            NetPacket var20 = new NetPacket((short) 4143, var32);
                            MainCanvas.netUtils.sendPacket(var20);
                            this.e.a((String) null);
                            return;
                        }

                        this.e.processException("获取上传指令数据错误!");
                }
            }
        } else if (this.l == 2) {
            this.b(var1);
            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    if (this.as == 0) {
                        LoadingPage.a(this.au[(this.ar << 3) + this.aq][0] - 17, this.au[(this.ar << 3) + this.aq][1] + 17, this.am, false);
                        this.l = 1;
                        return;
                    }

                    this.l = 0;
                    return;
                }
            } else {
                bn var18;
                if ((var18 = this.y((this.ar << 3) + this.aq)) == null || var18.a <= 0 || var18.g <= 0) {
                    return;
                }

                if (this.as == 0) {
                    LoadingPage.a(this.au[(this.ar << 3) + this.aq][0] - 17, this.au[(this.ar << 3) + this.aq][1] + 17, new String[]{"取消", "确认"}, false);
                    this.l = 3;
                } else {
                    if (this.as != 2) {
                        if (this.as == 18) {
                            LoadingPage.h = 0;
                            int var31 = LoadingPage.a(var18.b) != -1 ? LoadingPage.a(var18.b) : 15138723;
                            this.at = "您确定向你的帮派捐献" + (var31 != 15138723 ? var18.b.substring(3, var18.b.length()) : var18.b) + "X" + this.ag + "？";
                            this.l = 18;
                        }

                        return;
                    }

                    this.E(var18.g > 1 ? this.ag : 1);
                }
            }
        } else if (this.l == 3) {
            LoadingPage.b(var1);
            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    bn var17;
                    if ((var17 = this.y((this.ar << 3) + this.aq)) == null || var17.a <= 0 || var17.g <= 0) {
                        this.l = 0;
                        return;
                    }

                    LoadingPage.a(this.au[(this.ar << 3) + this.aq][0] - 17, this.au[(this.ar << 3) + this.aq][1] + 17, this.am, false);
                    this.l = 1;
                }
            } else {
                bn var16;
                if ((var16 = this.y((this.ar << 3) + this.aq)) == null || var16.a <= 0 || var16.g <= 0) {
                    this.l = 0;
                    return;
                }

                if (LoadingPage.o == 1) {
                    if (this.as == 0) {
                        if (var16.r != 0) {
                            this.e.a((String) "重要物品输入OK丢弃", (int) 0);
                            this.ag = var16.g > 1 ? this.ag : 1;
                        } else {
                            this.f(var16.g > 1 ? this.ag : 1);
                        }
                    } else if (this.as == 1 || this.as != 3) {
                        return;
                    }
                } else {
                    LoadingPage.a(this.au[(this.ar << 3) + this.aq][0] - 17, this.au[(this.ar << 3) + this.aq][1] + 17, this.am, false);
                    this.l = 1;
                }
            }
        } else if (this.l == 4) {
            this.b(var1);
            if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
                this.D(this.ag);
                this.b((byte) 0, true);
                this.ar = this.aU;
                this.e.ax = this.aV;
                this.as = 0;
                this.e.a((String) null);
                return;
            }

            if (var1 == 536870912) {
                this.l = 0;
                return;
            }
        } else if (this.l == 5) {
            if (var1 != 268435456 && var1 != 517 && var1 != 1073741824) {
                if (var1 == 536870912) {
                    this.at = null;
                    this.l = 6;
                    this.o();
                    return;
                }
            } else {
                bn var14;
                if ((var14 = this.y((this.ar << 3) + this.aq)) == null || var14.a <= 0 || var14.g <= 0) {
                    return;
                }

                byte[] var30;
                if ((var30 = NetPayloadBuilder.b((short) 4152, GlobalStatus.ad, var14.a, this.ag > var14.g ? var14.g : this.ag, this.bR)) == null) {
                    this.e.processException("获取上传指令数据错误!");
                    return;
                }

                NetPacket var15 = new NetPacket((short) 4152, var30);
                MainCanvas.netUtils.sendPacket(var15);
                this.e.a((String) null);
            }
        } else if (this.l == 6) {
            if (var1 == 268435456 || var1 == 1073741824) {
                if (this.n() != -1L) {
                    try {
                        bn var13;
                        if ((var13 = this.y((this.ar << 3) + this.aq)) != null && var13.a > 0 && var13.g > 0) {
                            this.bR = this.n();
                            this.at = "您确定以" + this.bR + "两的价格拍卖此物品" + (this.ag > var13.g ? var13.g : this.ag) + "个?";
                            this.l = 5;
                            LoadingPage.h = 0;
                        }

                        return;
                    } catch (Exception var3) {
                        this.e.processException("超出最大值,请重新输入");
                        return;
                    }
                }

                this.e.processException("输入有误,请重新输入");
                return;
            }

            if (var1 != 1073741824) {
                if (var1 != 536870912) {
                    this.d(var1);
                    return;
                }

                this.e.o();
                bn var12;
                if ((var12 = this.y((this.ar << 3) + this.aq)) == null || var12.g <= 1) {
                    this.l = 0;
                    return;
                }

                this.l = 7;
            }
        } else if (this.l == 7) {
            this.b(var1);
            if (var1 == 268435456 || var1 == 517 || var1 == 1073741824) {
                this.l = 6;
                this.o();
                return;
            }

            if (var1 == 536870912) {
                this.l = 0;
                return;
            }
        } else if (this.l == 8) {
            if (var1 != 516 && var1 != 8) {
                if (var1 != 518 && var1 != 2) {
                    if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                        if (var1 == 536870912) {
                            LoadingPage.a(this.au[(this.ar << 3) + this.aq][0] - 17, this.au[(this.ar << 3) + this.aq][1] + 17, this.am, false);
                            this.l = 1;
                            return;
                        }

                        return;
                    }

                    if (GlobalStatus.ek != null && GlobalStatus.ek[this.az] == -1) {
                        this.a(true, (byte) 2);
                        return;
                    }

                    LoadingPage.a(this.au[(this.ar << 3) + this.aq][0] - 17, this.au[(this.ar << 3) + this.aq][1] + 17, new String[]{"覆盖", "清空"}, false);
                    this.l = 9;
                    return;
                }

                this.az = this.az >= 7 ? 0 : ++this.az;
                return;
            }

            this.az = this.az <= 0 ? 7 : --this.az;
            return;
        } else if (this.l == 9) {
            LoadingPage.b(var1);
            if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
                if (LoadingPage.o == 0) {
                    this.a(true, (byte) 2);
                    return;
                }

                this.a(false, (byte) 2);
                return;
            }

            if (var1 == 536870912) {
                this.l = 8;
                return;
            }
        } else if (this.l == 10) {
            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    this.l = 1;
                    this.s();
                    return;
                }
            } else {
                byte[] var11;
                if ((var11 = NetPayloadBuilder.b((short) 4105, GlobalStatus.ad, (int) this.z((this.ar << 3) + this.aq))) == null) {
                    this.e.processException("获取上传指令数据错误!");
                    return;
                }

                NetPacket var29 = new NetPacket((short) 4105, var11);
                MainCanvas.netUtils.sendPacket(var29);
                this.e.a((String) null);
            }
        } else if (this.l == 11) {
            if (var1 == 268435456 || var1 == 1073741824) {
                if (this.n() != -1L) {
                    try {
                        bn var10;
                        if ((var10 = this.y((this.ar << 3) + this.aq)) != null && var10.a > 0 && var10.g > 0) {
                            this.bR = this.n();
                            this.at = "您确定以" + this.bR + "个金豆的价格拍卖此物品" + (this.ag > var10.g ? var10.g : this.ag) + "个?";
                            this.l = 5;
                            LoadingPage.h = 0;
                        }

                        return;
                    } catch (Exception var4) {
                        this.e.processException("超出最大值,请重新输入");
                        return;
                    }
                }

                this.e.processException("输入有误,请重新输入");
                return;
            }

            if (var1 != 536870912) {
                this.d(var1);
                return;
            }

            this.e.o();
            bn var9;
            if ((var9 = this.y((this.ar << 3) + this.aq)) == null || var9.g <= 1) {
                this.l = 0;
                return;
            }

            this.l = 12;
        } else if (this.l == 12) {
            this.b(var1);
            if (var1 == 268435456 || var1 == 517 || var1 == 1073741824) {
                this.l = 11;
                this.o();
                return;
            }

            if (var1 == 536870912) {
                this.l = 0;
                return;
            }
        } else if (this.l == 13) {
            if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
                this.as = 0;
                this.V(this.z((this.ar << 3) + this.aq));
                return;
            }

            if (var1 == 536870912) {
                this.l = 0;
                this.s();
                return;
            }
        } else if (this.l == 14) {
            LoadingPage.b(var1);
            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    this.l = 0;
                    return;
                }
            } else {
                if (LoadingPage.o == 0) {
                    this.aH = this.e.as.a;
                    GlobalStatus.a(this.y((this.ar << 3) + this.aq));
                    this.O.a(0, (short) this.k, this.as);
                    return;
                }

                if (LoadingPage.o == 1) {
                    o_1.e = 0;
                    bn var8 = this.y((this.ar << 3) + this.aq);
                    byte[] var2;
                    if ((var2 = NetPayloadBuilder.b((short) 4642, GlobalStatus.ad, GlobalStatus.km[this.e.ar.g()], var8.a, (short) GlobalStatus.t[this.af].a)) == null) {
                        this.e.processException("获取上传指令数据错误!");
                        return;
                    }

                    MainCanvas.netUtils.sendPacket(new NetPacket((short) 4642, var2));
                    this.e.a((String) null);
                }
            }
        } else if (this.l == 15) {
            LoadingPage.b(var1);
            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    this.l = 0;
                    return;
                }
            } else {
                bn var7 = this.y((this.ar << 3) + this.aq);
                if (LoadingPage.o == 0) {
                    this.aH = this.e.as.a;
                    GlobalStatus.a(var7);
                    this.O.a(0, (short) this.k, this.as);
                } else {
                    if (LoadingPage.o != 1) {
                        return;
                    }

                    if (var7.g - var7.v > 1) {
                        if (var7.g - var7.v > 1) {
                            this.a((long) (var7.g - var7.v));
                            this.l = 4;
                        }

                        return;
                    }

                    this.D(1);
                    this.b((byte) 0, true);
                    this.ar = this.aU;
                    this.e.ax = this.aV;
                    this.as = 0;
                    this.e.a((String) null);
                }
            }
        } else if (this.l == 16) {
            LoadingPage.b(var1);
            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    this.l = 0;
                    return;
                }
            } else {
                bn var6 = this.y((this.ar << 3) + this.aq);
                if (LoadingPage.o == 0) {
                    this.aH = this.e.as.a;
                    GlobalStatus.a(var6);
                    this.O.a(0, (short) this.k, this.as);
                } else {
                    if (var6.g <= 1) {
                        this.ag = 1;
                        this.l = 6;
                        this.o();
                        return;
                    }

                    this.a((long) var6.g);
                    this.l = 7;
                }
            }
        } else if (this.l == 17) {
            if (this.e.aq != null) {
                this.e.aq.b(var1);
            }

            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517 && var1 == 536870912) {
                this.e((int) 0);
                return;
            }
        } else if (this.l == 18) {
            if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
                bn var5;
                if ((var5 = this.y((this.ar << 3) + this.aq)).g > 1) {
                    this.C(this.ag);
                } else {
                    this.C(var5.g);
                }

                LoadingPage.h = 0;
                this.l = 0;
                return;
            }

            if (var1 == 536870912) {
                LoadingPage.h = 0;
                this.l = 0;
            }
        }

    }

    private void C(int var1) {
        byte[] var2;
        if ((var2 = NetPayloadBuilder.b((short) 4244, this.z((this.ar << 3) + this.aq), (int) var1, GlobalStatus.ad)) != null) {
            NetPacket var3 = new NetPacket((short) 4244, var2);
            MainCanvas.netUtils.sendPacket(var3);
            this.e.a((String) null);
        } else {
            this.e.processException("获取上传指令数据错误!");
        }
    }

    private void a(boolean var1, byte var2) {
        byte[] var3;
        if ((var3 = NetPayloadBuilder.a((short) 4117, GlobalStatus.ad, (byte) this.az, (byte) (var1 ? var2 : 0), (int) (var1 ? (var2 == 2 ? this.z((this.ar << 3) + this.aq) : GlobalStatus.dl[this.e.ar.g()]) : -1))) != null) {
            NetPacket var4 = new NetPacket((short) 4117, var3);
            MainCanvas.netUtils.sendPacket(var4);
            this.e.a((String) null);
        } else {
            this.e.processException("获取上传指令数据错误!");
        }
    }

    private void b(boolean var1, byte var2) {
        byte[] var3;
        if ((var3 = NetPayloadBuilder.a((short) 4193, GlobalStatus.ad, GlobalStatus.fA[this.ay], (byte) this.az, (byte) (var1 ? 1 : 0), (int) (var1 ? GlobalStatus.dl[this.e.ar.g()] : -1))) != null) {
            NetPacket var4 = new NetPacket((short) 4193, var3);
            MainCanvas.netUtils.sendPacket(var4);
            this.e.a((String) null);
        } else {
            this.e.processException("获取上传指令数据错误!");
        }
    }

    private void D(int var1) {
        if (this.bS) {
            if (GlobalStatus.fh.length >= 10) {
                this.e.processException("交易物品栏已满");
                return;
            }

            for (int var2 = 0; var2 < 10; ++var2) {
                boolean var3 = false;

                for (int var4 = 0; var4 < GlobalStatus.fk.length; ++var4) {
                    if (var2 == GlobalStatus.fk[var4]) {
                        var3 = true;
                    }
                }

                if (!var3) {
                    this.e.ax = var2;
                    break;
                }
            }
        }

        byte[] var5;
        if ((var5 = NetPayloadBuilder.a((short) 4126, GlobalStatus.ad, (int) this.z((this.ar << 3) + this.aq), (int) (this.e.ax % 10), (int) var1)) != null) {
            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4126, var5));
            this.bS = true;
        } else {
            this.e.processException("获取上传指令数据错误!");
        }
    }

    public final void s() {
        if (GlobalStatus.bC.size() > 0 && this.A((this.ar << 3) + this.aq) != null) {
            this.e.at.a(this.A((this.ar << 3) + this.aq), GlobalConfig.i, (byte) 1);
        } else {
            this.e.at.a("没有物品，按3、9键可以上下翻滚此属性描述框", GlobalConfig.i, (byte) 1);
        }

        this.e.at.a((byte) 1);
        this.l = 0;
        LoadingPage.l = 0;
    }

    public final void f(int var1) {
        byte[] var2;
        if ((var2 = NetPayloadBuilder.a((short) 4104, GlobalStatus.ad, (int) this.z((this.ar << 3) + this.aq), (byte) ((byte) var1))) != null) {
            NetPacket var3 = new NetPacket((short) 4104, var2);
            MainCanvas.netUtils.sendPacket(var3);
            this.e.a((String) null);
        } else {
            this.e.processException("获取上传指令数据错误!");
        }
    }

    private void E(int var1) {
        byte[] var2;
        if ((var2 = NetPayloadBuilder.e((short) 4157, GlobalStatus.ad, this.z((this.ar << 3) + this.aq), (int) var1)) != null) {
            NetPacket var3 = new NetPacket((short) 4157, var2);
            MainCanvas.netUtils.sendPacket(var3);
            this.e.a((String) null);
        } else {
            this.e.processException("获取上传指令数据错误!");
        }
    }

    public final void a(int var1, int var2, int var3, int var4, int var5) {
        if (this.au != null && this.au.length > var1) {
            this.au[var1][0] = var2;
            this.au[var1][1] = var3;
            this.au[var1][2] = var4;
            this.au[var1][3] = var5;
        }

    }

    public final int b(int var1, int var2, int var3) {
        if (this.au != null) {
            for (int var4 = 0; var4 < this.au.length; ++var4) {
                if (var2 >= this.au[var4][0] && var2 <= this.au[var4][0] + this.au[var4][2] && var3 >= this.au[var4][1] && var3 <= this.au[var4][1] + this.au[var4][3]) {
                    var1 = (byte) (var4 % 8);
                    var2 = (byte) (var4 / 8);
                    if (var1 == this.aq && var2 == this.ar) {
                        return 268435456;
                    }

                    this.aq = var1;
                    this.ar = (byte) (var2 - 1);
                    return 4;
                }
            }
        }

        return var1;
    }

    private void c(Graphics var1, String var2) {
        if (this.e.aq != null) {
            this.e.aq.a(var2);
            int var12 = GlobalConfig.realHigh <= 240 ? 79 : 120;
            this.e.aq.a(var1);
            LoadingPage.a(var1, this.e.aq.a + 5, this.e.aq.b + 29 + this.e.as.b, this.e.aq.c - 11, var12, 1);
            LoadingPage.a(var1);
            Graphics var3 = var1;
            ao_1 var13 = this;
            int var4 = (this.e.aq.c - 11 - (x.b << 3)) / 9;
            int var5 = ((GlobalConfig.realHigh <= 240 ? 79 : 120) - 6 - (x.b << 2)) / 5;
            int var6 = this.e.aq.a + 8 + var4;
            int var7 = this.e.aq.b + 33 + this.e.as.b + var5;

            for (int var8 = 0; var8 < 32; ++var8) {
                MainCanvas.f.a(var3, x, (int[]) null, (aj) null, 0, 0, var8 % 8 * (x.b + var4) + var6, var8 / 8 * (x.b + var5) + var7, 0, 0);
                var13.a((int) var8, var8 % 8 * (x.b + var4) + var6, var8 / 8 * (x.b + var5) + var7, (int) x.b, (int) x.c);
            }

            bn var15 = null;
            if (GlobalStatus.bC.size() > 0) {
                int var9 = 0;
                int var10 = 0;

                for (int var11 = 0; var11 < GlobalStatus.bC.size(); ++var11) {
                    var13.bT = (bn) GlobalStatus.bC.elementAt(var11);
                    if (var13.bT != null && var13.bT.a >= 0) {
                        if (var13.as != 4 && var13.as != 15 && var13.as != 16) {
                            var10 = var13.bT.g;
                        } else if ((var10 = var13.bT.g - var13.bT.v) <= 0) {
                            continue;
                        }

                        var9 = var13.bT.h % 32;
                        if (var13.bT.h / 32 == var13.e.as.a) {
                            MainCanvas.f.a(var3, b(var13.bT.i), (int[]) null, (aj) null, 0, 0, var9 % 8 * (x.b + var4) + var6 + 1, var9 / 8 * (x.b + var5) + var7 + 1, 0, 0);
                            if (var10 > 9) {
                                MainCanvas.f.a(var3, MainCanvas.num, (int[]) null, var10 / 10, 0, 0, 10 + var9 % 8 * (x.b + var4) + var6, 12 + var9 / 8 * (x.b + var5) + var7, 0, 0);
                                MainCanvas.f.a(var3, MainCanvas.num, (int[]) null, var10 % 10, 0, 0, 14 + var9 % 8 * (x.b + var4) + var6, 12 + var9 / 8 * (x.b + var5) + var7, 0, 0);
                            } else if (var10 > 1) {
                                MainCanvas.f.a(var3, MainCanvas.num, (int[]) null, var10 % 10, 0, 0, 14 + var9 % 8 * (x.b + var4) + var6, 12 + var9 / 8 * (x.b + var5) + var7, 0, 0);
                            }

                            if (var13.bT.h % 32 == (var13.ar << 3) + var13.aq) {
                                var15 = var13.bT;
                            }
                        }
                    }
                }
            }

            LoadingPage.d(var3, var6 + var13.aq * (x.b + var4), var7 + var13.ar * (x.b + var5), 17, 17);
            if (var15 != null && var15.a >= 0) {
                LoadingPage.a(var3, var15.b + "X" + (var15.g - var15.v), var15.q, var6 + var13.aq * (x.b + var4) + x.b / 2, var7 + var13.ar * (x.b + var5) + x.b / 2);
            }

            if (this.as != 18) {
                this.a(var1, GlobalStatus.ap, GlobalConfig.defaultWidth / 2 + x.b, this.e.au.a() + GlobalConfig.a(MainCanvas.E.c));
                MainCanvas.f.a(var1, w, (int[]) null, (aj) null, 0, 0, GlobalConfig.a(GlobalConfig.defaultWidth, this.e.l.toString()) - x.b, this.e.au.a() + 4, 0, 0);
            }
        }

        if (this.l != 1 && this.l != 3 && this.l != 9 && this.l != 14 && this.l != 15 && this.l != 16) {
            if (this.l != 2 && this.l != 4 && this.l != 7 && this.l != 12) {
                if (this.l != 6 && this.l != 11) {
                    if (this.l != 5 && this.l != 18) {
                        if (this.l == 8) {
                            this.a(var1, (GlobalConfig.defaultWidth - 176) / 2, (GlobalConfig.defaultHigh - 20) / 2, 0);
                            int var14 = 0;

                            while (true) {
                                if (var14 >= GlobalStatus.ej.length) {
                                    return;
                                }

                                if (var14 == this.az) {
                                    LoadingPage.d(var1, (GlobalConfig.defaultWidth - 176) / 2 + 2 + var14 * 17, (GlobalConfig.defaultHigh - 20) / 2 + 2, 17, 17);
                                    break;
                                }

                                ++var14;
                            }
                        } else {
                            if (this.l == 10 || this.l == 13) {
                                LoadingPage.a(var1, "使用该物品将与你绑定，是否确认使用？", new String[]{"确定", "取消"});
                                return;
                            }

                            if (this.l == 17 && this.e.aq != null) {
                                this.e.aq.a("物品详情");
                                this.e.aq.a(var1);
                            }
                        }

                    } else {
                        LoadingPage.a(var1, this.at, new String[]{"确定", "取消"});
                    }
                } else if (this.l == 6) {
                    this.b(var1, "拍卖价格");
                } else {
                    this.b(var1, "金豆数量");
                }
            } else {
                this.a(var1, "数量");
            }
        } else {
            LoadingPage.c(var1);
        }
    }

    public final void a(byte var1, byte[] var2) {
        this.l = 0;
        this.e.aw = 0;
        if (this.j != 126) {
            this.aq = this.ar = 0;
        }

        this.bU.removeAllElements();
        Object var3 = null;
        if (var1 == 0) {
            for (int var5 = 0; var5 < var2.length; ++var5) {
                for (int var4 = 0; var4 < GlobalStatus.bC.size(); ++var4) {
                    bn var7;
                    if ((var7 = (bn) GlobalStatus.bC.elementAt(var4)) != null && (byte) (var7.t >>> var2[var5] & 1) == 1 && var7.g - var7.v > 0) {
                        this.bU.addElement(var7);
                    }
                }
            }
        } else {
            for (int var6 = 0; var6 < var2.length; ++var6) {
                for (int var9 = 0; var9 < GlobalStatus.bC.size(); ++var9) {
                    bn var8;
                    if ((var8 = (bn) GlobalStatus.bC.elementAt(var9)) != null && var2[var6] == var8.d && var8.g - var8.v > 0) {
                        this.bU.addElement(var8);
                    }
                }
            }
        }

        LoadingPage.l = 0;
        this.e.aq.b();
        this.e.aq.a("可选物品");
        this.e.aq.a(true);
        this.e.as.a(new String[]{" 一 ", " 二 ", " 三 ", " 四 ", " 五 "});
        this.e.as.a((byte) 1);
        this.e.aq.a(GlobalConfig.realHigh <= 240 ? 79 : 120);
        if (this.bU.size() > 0) {
            this.e.at.a(a((bn) this.bU.elementAt(0)), GlobalConfig.i, (byte) 1);
        } else {
            this.e.at.a("没有物品,按3、9键可以上下翻滚此属性描述框", GlobalConfig.i, (byte) 1);
        }

        this.e.at.a((byte) 1);
        LoadingPage.l = 0;
        this.e.au.a("");
        this.e.aq.a((al) this.e.as);
        this.e.aq.a((al) this.e.at);
        this.e.aq.a((al) this.e.au);
        this.e.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
        this.e.touchPageCase = this.e.k;
        this.k = 126;
    }

    private void F(int var1) {
        if (this.l == 0) {
            this.aV();
            if (this.e.aq != null) {
                this.e.aq.b(var1);
            }

            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 1024 || var1 == 2048) {
                    this.G((this.ar << 3) + this.aq);
                    return;
                }

                if (var1 != 8 && var1 != 516) {
                    if (var1 != 2 && var1 != 518) {
                        if (var1 != 1 && var1 != 514) {
                            if (var1 != 4 && var1 != 520) {
                                if (var1 == 536870912) {
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
                                    }

                                    if (this.j == 118) {
                                        this.Q.a(false);
                                        return;
                                    }

                                    if (this.j == 64) {
                                        this.O.a(this.O.a, (short) this.O.c, this.O.d);
                                        return;
                                    }
                                }

                                return;
                            }

                            this.ar = this.ar >= 3 ? 0 : ++this.ar;
                            this.G((this.ar << 3) + this.aq);
                            return;
                        }

                        this.ar = this.ar <= 0 ? 3 : --this.ar;
                        this.G((this.ar << 3) + this.aq);
                        return;
                    }

                    this.aq = this.aq >= 7 ? 0 : ++this.aq;
                    this.G((this.ar << 3) + this.aq);
                    return;
                }

                this.aq = this.aq <= 0 ? 7 : --this.aq;
                this.G((this.ar << 3) + this.aq);
                return;
            } else {
                var1 = (this.e.as.a << 5) + (this.ar << 3) + this.aq;
                bn var2 = null;
                if (var1 < this.bU.size()) {
                    var2 = (bn) this.bU.elementAt(var1);
                }

                if (var2 == null) {
                    return;
                }

                if (this.j == 102) {
                    if (var2.g - var2.v <= 0 || this.V.b != 0) {
                        return;
                    }

                    Object var4 = null;
                    byte[] var5;
                    if ((var5 = NetPayloadBuilder.a((short) 4689, var2.a, (byte) 0, (byte) -1, GlobalStatus.ad)) != null) {
                        NetPacket var6 = new NetPacket((short) 4689, var5);
                        MainCanvas.netUtils.sendPacket(var6);
                        this.e.a((String) null);
                        return;
                    }

                    this.e.processException("获取上传指令数据错误!");
                } else if (this.j == 106) {
                    if (var2.g - var2.v <= 0) {
                        return;
                    }

                    byte[] var7 = null;
                    if (this.O.f == 0) {
                        var7 = NetPayloadBuilder.a((short) 4688, var2.a, -1L, (byte) 0, o_1.h, GlobalStatus.jG, (byte[]) null, GlobalStatus.ad);
                    } else if (this.O.f == 1) {
                        var7 = NetPayloadBuilder.a((short) 4688, o_1.g, (long) var2.a, (byte) 1, o_1.h, GlobalStatus.jG, (byte[]) null, GlobalStatus.ad);
                    }

                    if (var7 != null) {
                        NetPacket var8 = new NetPacket((short) 4688, var7);
                        MainCanvas.netUtils.sendPacket(var8);
                        this.e.a((String) null);
                        return;
                    }

                    this.e.processException("获取上传指令数据错误!");
                } else if (this.j == 110) {
                    if (var2.g - var2.v <= 0 || this.P.b != 0 && (this.P.b != 1 || this.P.c == -1)) {
                        return;
                    }

                    byte[] var9 = null;
                    if (this.P.b == 0) {
                        if (this.P.a == 0) {
                            var9 = NetPayloadBuilder.a((short) 4262, var2.a, -1L, (byte) this.P.b, (int[]) null, (byte[]) null, -1, (byte) this.P.a, GlobalStatus.ad);
                        } else if (this.P.a == 1) {
                            var9 = NetPayloadBuilder.a((short) 4262, this.P.c, (long) var2.a, (byte) 4, (int[]) null, (byte[]) null, -1, (byte) this.P.a, GlobalStatus.ad);
                        }
                    } else {
                        var9 = NetPayloadBuilder.a((short) 4262, this.P.c, this.P.d, (byte) this.P.b, this.P.e, this.P.f, var2.a, (byte) this.P.a, GlobalStatus.ad);
                    }

                    if (var9 != null) {
                        NetPacket var10 = new NetPacket((short) 4262, var9);
                        MainCanvas.netUtils.sendPacket(var10);
                        this.e.a((String) null);
                        return;
                    }

                    this.e.processException("获取上传指令数据错误!");
                } else if (this.j == 118) {
                    if (var2.g - var2.v <= 0 || this.Q.b != 0 && (this.Q.b != 1 || this.Q.c == -1)) {
                        return;
                    }

                    byte[] var11 = null;
                    if (this.Q.b == 0) {
                        if (this.Q.a == 0) {
                            var11 = NetPayloadBuilder.a((byte) 1, var2.a, -1, (int[]) null, (byte[]) null, -1, (byte) this.Q.a, GlobalStatus.ad);
                        } else if (this.Q.a == 1) {
                            var11 = NetPayloadBuilder.a((byte) 2, this.Q.c, var2.a, (int[]) null, (byte[]) null, -1, (byte) this.Q.a, GlobalStatus.ad);
                        }
                    } else {
                        var11 = NetPayloadBuilder.a((byte) 4, this.Q.c, this.Q.d, this.Q.e, this.Q.f, var2.a, (byte) this.Q.a, GlobalStatus.ad);
                    }

                    if (var11 != null) {
                        NetPacket var12 = new NetPacket((short) 4266, var11);
                        MainCanvas.netUtils.sendPacket(var12);
                        this.e.a((String) null);
                        return;
                    }

                    this.e.processException("获取上传指令数据错误!");
                } else {
                    if (this.j != 64 || var2.g - var2.v <= 0) {
                        return;
                    }

                    o_1.e = 1;
                    if (this.O.c == 13) {
                        byte[] var13;
                        if ((var13 = NetPayloadBuilder.a((short) 4687, GlobalStatus.ko, (byte) 3, GlobalStatus.jG, var2.a, this.O.b, "", GlobalStatus.ad)) != null) {
                            NetPacket var14 = new NetPacket((short) 4687, var13);
                            MainCanvas.netUtils.sendPacket(var14);
                            this.e.a((String) null);
                            return;
                        }

                        this.e.processException("获取上传指令数据错误!");
                    } else {
                        byte[] var15;
                        if ((var15 = NetPayloadBuilder.c((short) 4645, GlobalStatus.ad, GlobalStatus.ko, var2.a, this.O.b)) == null) {
                            this.e.processException("获取上传指令数据错误!");
                            return;
                        }

                        MainCanvas.netUtils.sendPacket(new NetPacket((short) 4645, var15));
                        this.e.a((String) null);
                    }
                }
            }
        }

    }

    private void d(Graphics var1) {
        if (this.e.aq != null) {
            this.e.aq.a(var1);
            int var2 = GlobalConfig.realHigh <= 240 ? 79 : 120;
            LoadingPage.a(var1, this.e.aq.a + 5, this.e.aq.b + 29 + this.e.as.b, this.e.aq.c - 11, var2, 1);
            LoadingPage.a(var1);
            Graphics var3 = var1;
            ao_1 var12 = this;
            int var4 = (this.e.aq.c - 11 - (x.b << 3)) / 9;
            int var5 = ((GlobalConfig.realHigh <= 240 ? 79 : 120) - 6 - (x.b << 2)) / 5;
            int var6 = this.e.aq.a + 8 + var4;
            int var7 = this.e.aq.b + 33 + this.e.as.b + var5;

            for (int var8 = 0; var8 < 32; ++var8) {
                MainCanvas.f.a(var3, x, (int[]) null, (aj) null, 0, 0, var8 % 8 * (x.b + var4) + var6, var8 / 8 * (x.b + var5) + var7, 0, 0);
                var12.a((int) var8, var8 % 8 * (x.b + var4) + var6, var8 / 8 * (x.b + var5) + var7, (int) x.b, (int) x.c);
            }

            bn var13 = null;
            if (var12.bU.size() > 0) {
                int var9 = 0;
                int var10 = 0;

                for (int var11 = 0; var11 < var12.bU.size(); ++var11) {
                    var12.bT = (bn) var12.bU.elementAt(var11);
                    if (var12.bT != null && var12.bT.a >= 0 && var12.bT.g - var12.bT.v >= 1) {
                        var10 = var12.bT.g - var12.bT.v;
                        var9 = var11 % 32;
                        if (var11 / 32 == var12.e.as.a) {
                            MainCanvas.f.a(var3, b(var12.bT.i), (int[]) null, (aj) null, 0, 0, var9 % 8 * (x.b + var4) + var6 + 1, var9 / 8 * (x.b + var5) + var7 + 1, 0, 0);
                            if (var10 > 9) {
                                MainCanvas.f.a(var3, MainCanvas.num, (int[]) null, var10 / 10, 0, 0, 10 + var9 % 8 * (x.b + var4) + var6, 12 + var9 / 8 * (x.b + var5) + var7, 0, 0);
                                MainCanvas.f.a(var3, MainCanvas.num, (int[]) null, var10 % 10, 0, 0, 14 + var9 % 8 * (x.b + var4) + var6, 12 + var9 / 8 * (x.b + var5) + var7, 0, 0);
                            } else if (var10 > 1) {
                                MainCanvas.f.a(var3, MainCanvas.num, (int[]) null, var10 % 10, 0, 0, 14 + var9 % 8 * (x.b + var4) + var6, 12 + var9 / 8 * (x.b + var5) + var7, 0, 0);
                            }

                            if (var11 % 32 == (var12.ar << 3) + var12.aq) {
                                var13 = var12.bT;
                            }
                        }
                    }
                }
            }

            LoadingPage.d(var3, var6 + var12.aq * (x.b + var4), var7 + var12.ar * (x.b + var5), 17, 17);
            if (var13 != null && var13.a >= 0) {
                LoadingPage.a(var3, var13.b + "X" + (var13.g - var13.v), var13.q, var6 + var12.aq * (x.b + var4) + x.b / 2, var7 + var12.ar * (x.b + var5) + x.b / 2);
            }

            this.a(var1, GlobalStatus.ap, GlobalConfig.defaultWidth / 2 + 15, this.e.au.a() + GlobalConfig.a(MainCanvas.E.c));
            MainCanvas.f.a(var1, w, (int[]) null, (aj) null, 0, 0, GlobalConfig.a(GlobalConfig.defaultWidth, this.e.l.toString()) - 15, this.e.au.a() + 4, 0, 0);
        }

    }

    private void G(int var1) {
        var1 = (this.e.as.a << 5) + var1;
        if (this.bU.size() > 0 && var1 < this.bU.size()) {
            this.e.at.a(a((bn) this.bU.elementAt(var1)), GlobalConfig.i, (byte) 1);
        } else {
            this.e.at.a("没有物品，按3、9键可以上下翻滚此属性描述框", GlobalConfig.i, (byte) 1);
        }

        this.e.at.a((byte) 1);
        this.l = 0;
        LoadingPage.l = 0;
    }

    private void c(int var1, int var2, int var3, int var4, int var5) {
        if (this.bV != null && this.bV.length > var1) {
            this.bV[var1][0] = var2;
            this.bV[var1][1] = var3;
            this.bV[var1][2] = var4;
            this.bV[var1][3] = var5;
        }

    }

    private void a(int var1, int var2, int var3, int var4) {
        if (this.bW != null) {
            this.bW[0] = var1;
            this.bW[1] = var2;
            this.bW[2] = var3;
            this.bW[3] = var4;
        }

    }

    public final int b(int var1, int var2) {
        if (this.bV != null) {
            for (int var3 = 0; var3 < this.bV.length; ++var3) {
                if (var1 >= this.bV[var3][0] && var1 <= this.bV[var3][0] + this.bV[var3][2] && var2 >= this.bV[var3][1] && var2 <= this.bV[var3][1] + this.bV[var3][3]) {
                    if (this.av != var3) {
                        this.av = var3;
                        LoadingPage.l = 0;
                        return 0;
                    }

                    if (this.av == var3) {
                        return 268435456;
                    }
                }
            }
        }

        return this.bW == null || var1 >= this.bW[0] && var1 <= this.bW[0] + this.bW[2] && var2 >= this.bW[1] && var2 <= this.bW[1] + this.bW[3] ? 0 : 536870912;
    }

    public final int c(int var1, int var2) {
        if (this.bV != null) {
            for (int var3 = 0; var3 < this.bV.length; ++var3) {
                if (var1 >= this.bV[var3][0] && var1 <= this.bV[var3][0] + this.bV[var3][2] && var2 >= this.bV[var3][1] && var2 <= this.bV[var3][1] + this.bV[var3][3]) {
                    if (this.aq != var3) {
                        this.aq = var3;
                        LoadingPage.l = 0;
                        return 0;
                    }

                    if (this.aq == var3) {
                        return 268435456;
                    }
                }
            }
        }

        return this.bW == null || var1 >= this.bW[0] && var1 <= this.bW[0] + this.bW[2] && var2 >= this.bW[1] && var2 <= this.bW[1] + this.bW[3] ? 0 : 536870912;
    }

    public final void t() {
        this.bV = new int[10][4];
        this.l = 0;
        this.m = 0;
        LoadingPage.l = 0;
        q = this.e.a(q, GlobalStatus.ax, GlobalStatus.aj, (byte) 3, (byte) 1, false);
        if (GlobalStatus.cz != null) {
            for (byte var1 = 0; var1 < GlobalStatus.cz.length; ++var1) {
                this.a(GlobalStatus.cD[var1]);
            }
        }

        this.e.touchPageCase = this.e.k;
        MainCanvas.f.a(this.f, h, i, false, true, 1009050);
        this.j = this.k = 5;
    }

    private void e(Graphics var1) {
        if (this.l != 2) {
            int var6 = 0;
            int var7 = 0;
            if (q != null && MainCanvas.O != null && MainCanvas.R != null) {
                var6 = (GlobalConfig.defaultWidth - MainCanvas.O.b) / 2;
                var7 = (GlobalConfig.defaultHigh - MainCanvas.O.c) / 2;
                var1.drawImage(MainCanvas.O.pngImage, var6, var7, 20);
                this.a((int) var6, (int) var7, (int) MainCanvas.O.b, (int) MainCanvas.O.c);

                for (int var4 = 0; var4 < this.bY.length; ++var4) {
                    if (var4 < MainCanvas.R.length) {
                        this.bZ = MainCanvas.R[var4].pngImage;
                    } else if (var4 == 8) {
                        this.bZ = MainCanvas.R[1].pngImage;
                    } else if (var4 == 9) {
                        this.bZ = MainCanvas.R[7].pngImage;
                    }

                    var1.drawImage(this.bZ, var6 + this.bY[var4][0], var7 + this.bY[var4][1], 20);
                    this.c(var4, var6 + this.bY[var4][0], var7 + this.bY[var4][1], MainCanvas.R[0].b, MainCanvas.R[0].c);
                }

                MainCanvas.f.a(var1, (Frame1) q, (int[]) null, 0, 0, var6 + MainCanvas.O.b / 2, var7 + (MainCanvas.O.c - q.j()) / 2 + q.j(), 20, 0);
            }

            var1.setColor(10092544);
            LoadingPage.d(var1, var6 + this.bY[this.av][0], var7 + this.bY[this.av][1], 17, 17);
            int[] var8 = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
            if (GlobalStatus.cz != null) {
                for (int var5 = 0; var5 < GlobalStatus.cz.length; var8[GlobalStatus.cB[var5]] = var5++) {
                    MainCanvas.f.a(var1, b(GlobalStatus.cC[var5]), (int[]) null, (aj) null, 0, 0, var6 + this.bY[GlobalStatus.cB[var5]][0] + 1, var7 + this.bY[GlobalStatus.cB[var5]][1] + 1, 0, 0);
                }
            }

            if (var8[this.av] >= 0) {
                if (this.av < 3) {
                    LoadingPage.a(var1, GlobalStatus.cA[var8[this.av]], GlobalStatus.a(this.e.l, this.av, false), var6 + this.bY[this.av][0] + 16, var7 + this.bY[this.av][1], 40);
                } else if (this.av < 5) {
                    LoadingPage.a(var1, GlobalStatus.cA[var8[this.av]], GlobalStatus.a(this.e.l, this.av, false), var6 + this.bY[this.av][0] + 16, var7 + this.bY[this.av][1] + 16, 24);
                } else if (this.av < 7) {
                    LoadingPage.a(var1, GlobalStatus.cA[var8[this.av]], GlobalStatus.a(this.e.l, this.av, false), var6 + this.bY[this.av][0], var7 + this.bY[this.av][1] + 16, 20);
                } else {
                    LoadingPage.a(var1, GlobalStatus.cA[var8[this.av]], GlobalStatus.a(this.e.l, this.av, false), var6 + this.bY[this.av][0], var7 + this.bY[this.av][1], 36);
                }
            } else if (this.av < 3) {
                LoadingPage.a(var1, GlobalConfig.M[this.av], "", var6 + this.bY[this.av][0] + 16, var7 + this.bY[this.av][1], 40);
            } else if (this.av < 5) {
                LoadingPage.a(var1, GlobalConfig.M[this.av], "", var6 + this.bY[this.av][0] + 16, var7 + this.bY[this.av][1] + 16, 24);
            } else if (this.av < 7) {
                LoadingPage.a(var1, GlobalConfig.M[this.av], "", var6 + this.bY[this.av][0], var7 + this.bY[this.av][1] + 16, 20);
            } else {
                LoadingPage.a(var1, GlobalConfig.M[this.av], "", var6 + this.bY[this.av][0], var7 + this.bY[this.av][1], 36);
            }

            if (this.l == 1) {
                LoadingPage.c(var1);
            }

        } else {
            if (this.l == 2) {
                if (this.e.aq != null) {
                    this.e.aq.a(30);
                    this.e.aq.a(var1);
                    LoadingPage.a(var1, this.e.aq.a + 5, this.e.aq.b + 32, this.e.aq.c - 11, 30, 1);
                    LoadingPage.a(var1, (String) "宝石", (int) (this.e.aq.a + 10), this.e.aq.b + 35 + GlobalConfig.a(25), 20, 16776960, 0);
                }

                if (GlobalStatus.cD != null) {
                    for (int var2 = 0; var2 < GlobalStatus.cD.length; ++var2) {
                        if (GlobalStatus.cB[var2] == this.av && GlobalStatus.cD[var2] != null) {
                            this.a(var1, this.e.aq.a + 10 + GlobalConfig.i.stringWidth("宝石:"), this.e.aq.b + 37, 17, 17, GlobalStatus.cD[var2].length, 1);

                            for (byte var3 = 0; var3 < GlobalStatus.cD[var2].length; ++var3) {
                                if (GlobalStatus.cD[var2][var3] <= -1) {
                                    LoadingPage.a(var1, 125269879, 207, this.e.aq.a + 10 + GlobalConfig.i.stringWidth("宝石:") + 2 + var3 * 17, this.e.aq.b + 39, 17, 17);
                                }

                                if (GlobalStatus.cD[var2][var3] > 0) {
                                    MainCanvas.f.a(var1, b(GlobalStatus.cD[var2][var3]), (int[]) null, (aj) null, 0, 0, this.e.aq.a + 10 + GlobalConfig.i.stringWidth("宝石:") + 2 + var3 * 17, this.e.aq.b + 39, 0, 0);
                                }
                            }
                        }
                    }
                }
            }

        }
    }

    public final void b(byte var1) {
        this.l = 0;
        this.e.aq.b();
        this.e.aq.a("周围" + (GlobalStatus.r != null && GlobalStatus.r.trim().length() > 0 ? GlobalStatus.r : ""));
        this.e.aq.a(true);
        if (this.j != 7) {
            this.e.as.a(new String[]{"全部", "空闲", "好友", "队伍"});
            this.e.as.a((byte) 0);
        }

        this.m(var1);
        this.e.au.a("操作");
        this.e.au.a(true);
        this.e.aq.a((al) this.e.as);
        this.e.aq.a((al) this.e.ar);
        if (GlobalConfig.defaultHigh > 220) {
            this.e.aq.a((al) this.e.au);
        }

        this.e.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
        this.df = null;
        this.e.touchPageCase = this.e.k;
        this.j = this.k = 7;
    }

    private static boolean aD() {
        return GlobalStatus.lA != null && GlobalStatus.lA.length == 2 && GlobalStatus.lA[0].equals("26") && GlobalStatus.lA[1].equals("27");
    }

    public final void c(byte var1) {
        K = new TextRender(GlobalStatus.lw, (short) (GlobalConfig.defaultWidth - GlobalStatus.ly));
        LoadingPage.a((az_1) null, K, GlobalStatus.lz, (String[]) null, GlobalStatus.lx);
        LoadingPage.h = 0;
        this.e.touchPageCase = this.e.k;
        this.e.touchAction = 0;
        this.e.b = 0;
        this.k = 72;
        this.as = 0;
    }

    public final void u() {
        this.l = 0;
        this.e.aq.j();
        this.e.aq.a("定购服务");
        this.e.aq.a(true);
        this.e.ar.a((Image[]) null, GlobalStatus.P.j, (String[]) null, (String[]) null);
        this.e.ar.a(GlobalStatus.P.n);
        this.e.aq.a((al) this.e.ar);
        this.e.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh, 0, 0, false);
        this.e.touchPageCase = this.e.k;
        this.j = this.k;
        this.k = 77;
    }

    public final void d(byte var1) {
        if (GlobalStatus.R != null) {
            this.e.processException(GlobalStatus.R);
        } else {
            this.l = 0;
            this.e.aq.b();
            this.e.aq.a("邮件服务");
            this.e.aq.a(true);
            this.e.as.a(new String[]{"我的邮件", "系统邮件"});
            this.e.as.a((byte) 0);
            this.e.as.a = var1;
            if (var1 == 0) {
                if (GlobalStatus.O.g == null) {
                    GlobalStatus.O.c();
                }

                this.e.ar.a(GlobalStatus.O.k, GlobalStatus.O.g, GlobalStatus.O.h, GlobalStatus.O.i);
                this.e.ar.a(GlobalStatus.O.l);
                this.e.ar.b(false);
                this.e.ar.a((String) null, 1);
                int var2 = Math.min(this.e.ar.g(), GlobalStatus.O.j.length);
                this.e.at.a(GlobalStatus.O.j[var2], GlobalConfig.i, (byte) 1);
                this.e.aq.a((al) this.e.as);
                this.e.aq.a((al) this.e.ar);
                this.e.aq.a((al) this.e.at);
                this.e.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh, 50, 100, false);
            } else {
                if (GlobalStatus.P.d == null) {
                    GlobalStatus.P.d();
                }

                this.e.ar.a(GlobalStatus.P.g, GlobalStatus.P.d, GlobalStatus.P.e, GlobalStatus.P.f);
                this.e.ar.a(GlobalStatus.P.h);
                this.e.ar.b(false);
                this.e.ar.a((String) null, 1);
                this.e.aq.a((al) this.e.as);
                this.e.aq.a((al) this.e.ar);
                this.e.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh, 0, 0, false);
            }

            this.e.touchPageCase = this.e.k;
            this.j = this.k;
            this.k = 76;
            this.as = var1;
        }
    }

    public final void e(byte var1) {
        if (GlobalStatus.lF != null) {
            this.l = 0;
            this.e.aq.b();
            this.e.aq.a(GlobalStatus.lF);
            this.e.aq.a(true);
            this.e.as.a(GlobalStatus.lJ);
            this.e.as.a((byte) 0);
            this.e.as.a = var1;
            boolean var2 = false;
            boolean var3 = false;
            int var4 = 0;
            switch (var1) {
                case 0:
                    var2 = GlobalStatus.lK != null || GlobalStatus.lL != null || GlobalStatus.lM != null;
                    var3 = GlobalStatus.lN != null;
                    if (var2) {
                        this.e.ar.a((Image[]) null, GlobalStatus.lK, GlobalStatus.lL, GlobalStatus.lM);
                        this.e.ar.a(GlobalStatus.lR);
                        this.e.ar.b(false);
                    }

                    if (GlobalStatus.lO != null) {
                        this.e.ar.a(GlobalStatus.lO[this.e.ar.g()], 1);
                    }

                    if (var3) {
                        if (GlobalStatus.lN.length == 1) {
                            var4 = 0;
                        } else {
                            var4 = this.e.ar.g();
                        }

                        this.e.at.a(GlobalStatus.lN[var4], GlobalConfig.i, (byte) 1);
                        if (var2) {
                            this.e.at.a((byte) 1);
                        }
                    }

                    this.e.aq.a((al) this.e.as);
                    if (var2) {
                        this.e.aq.a((al) this.e.ar);
                    }

                    if (var3) {
                        this.e.aq.a((al) this.e.at);
                    }

                    this.e.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh, GlobalStatus.lG != null ? GlobalStatus.lG[var1] : 66, GlobalStatus.lH != null ? GlobalStatus.lH[var1] : 100, GlobalStatus.lI != null ? GlobalStatus.lI[var1] == 1 : false);
                    break;
                case 1:
                    var2 = GlobalStatus.lS != null || GlobalStatus.lT != null || GlobalStatus.lU != null;
                    var3 = GlobalStatus.lV != null;
                    if (var2) {
                        this.e.ar.a((Image[]) null, GlobalStatus.lS, GlobalStatus.lT, GlobalStatus.lU);
                        this.e.ar.a(GlobalStatus.lZ);
                        this.e.ar.b(false);
                    }

                    if (var3) {
                        if (GlobalStatus.lV.length == 1) {
                            var4 = 0;
                        } else {
                            var4 = this.e.ar.g();
                        }

                        this.e.at.a(GlobalStatus.lV[var4], GlobalConfig.i, (byte) 1);
                        if (var2) {
                            this.e.at.a((byte) 1);
                        }
                    }

                    if (GlobalStatus.lW != null) {
                        this.e.ar.a(GlobalStatus.lW[this.e.ar.g()], 1);
                    }

                    this.e.aq.a((al) this.e.as);
                    if (var3) {
                        this.e.aq.a((al) this.e.at);
                    }

                    if (var2) {
                        this.e.aq.a((al) this.e.ar);
                    }

                    this.e.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh, GlobalStatus.lG != null ? GlobalStatus.lG[var1] : 66, GlobalStatus.lH != null ? GlobalStatus.lH[var1] : 100, GlobalStatus.lI == null || GlobalStatus.lI[var1] == 1);
                    break;
                case 2:
                    var2 = GlobalStatus.ma != null || GlobalStatus.mb != null || GlobalStatus.mc != null;
                    var3 = GlobalStatus.md != null;
                    if (var2) {
                        this.e.ar.a((Image[]) null, GlobalStatus.ma, GlobalStatus.mb, GlobalStatus.mc);
                        this.e.ar.a(GlobalStatus.mh);
                        this.e.ar.b(false);
                    }

                    if (GlobalStatus.me != null) {
                        this.e.ar.a(GlobalStatus.me[this.e.ar.g()], 1);
                    }

                    if (var3) {
                        if (GlobalStatus.md.length == 1) {
                            var4 = 0;
                        } else {
                            var4 = this.e.ar.g();
                        }

                        this.e.at.a(GlobalStatus.md[var4], GlobalConfig.i, (byte) 1);
                        if (var2) {
                            this.e.at.a((byte) 1);
                        }
                    }

                    this.e.aq.a((al) this.e.as);
                    if (var2) {
                        this.e.aq.a((al) this.e.ar);
                    }

                    if (var3) {
                        this.e.aq.a((al) this.e.at);
                    }

                    this.e.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh, GlobalStatus.lG != null ? GlobalStatus.lG[var1] : 66, GlobalStatus.lH != null ? GlobalStatus.lH[var1] : 100, GlobalStatus.lI != null ? GlobalStatus.lI[var1] == 1 : false);
            }

            this.e.touchPageCase = this.e.k;
            this.k = 71;
            this.as = var1;
        }
    }

    private void m(byte var1) {
        GlobalStatus.C();
        if (GlobalStatus.gS == null) {
            this.e.processException("周围没玩家");
        } else if (var1 != 3) {
            byte var9 = 0;
            byte var10 = 0;

            for (int var11 = 0; var11 < GlobalStatus.gS.length; ++var11) {
                if (var1 != 0) {
                    if ((GlobalStatus.gX[var11] == 2 || GlobalStatus.gX[var11] == 3) && var1 == cb) {
                        ++var9;
                    }

                    if (GlobalStatus.gX[var11] != 0 && GlobalStatus.gX[var11] != 3 || var1 != ca) {
                        continue;
                    }
                }

                ++var9;
            }

            if (var9 > 0) {
                GlobalStatus.gH = new String[var9];
                GlobalStatus.gI = new int[var9];
                GlobalStatus.gJ = new String[var9];
                GlobalStatus.gK = new short[var9];
                GlobalStatus.gL = new byte[var9];
                GlobalStatus.gM = new byte[var9];
                GlobalStatus.gN = new short[var9];
                GlobalStatus.gO = new short[var9];
                if (GlobalStatus.bw >= 1) {
                    GlobalStatus.gP = new byte[var9];
                }

                boolean var12 = false;

                for (int var14 = 0; var14 < GlobalStatus.gS.length; ++var14) {
                    label109:
                    {
                        if (var1 != 0) {
                            if ((GlobalStatus.gX[var14] == 2 || GlobalStatus.gX[var14] == 3) && var1 == cb) {
                                var12 = true;
                            }

                            if (GlobalStatus.gX[var14] != 0 && GlobalStatus.gX[var14] != 3 || var1 != ca) {
                                break label109;
                            }
                        }

                        var12 = true;
                    }

                    if (var12) {
                        GlobalStatus.gH[var10] = GlobalStatus.gS[var14];
                        GlobalStatus.gI[var10] = LoadingPage.a(GlobalStatus.gT[var14]);
                        GlobalStatus.gJ[var10] = GlobalStatus.gU[var14];
                        GlobalStatus.gK[var10] = GlobalStatus.gV[var14];
                        GlobalStatus.gL[var10] = GlobalStatus.gW[var14];
                        GlobalStatus.gM[var10] = GlobalStatus.gX[var14];
                        GlobalStatus.gN[var10] = GlobalStatus.gY[var14];
                        GlobalStatus.gO[var10] = GlobalStatus.gZ[var14];
                        if (GlobalStatus.bw >= 1) {
                            GlobalStatus.gP[var10] = GlobalStatus.ha[var14];
                        }

                        ++var10;
                        var12 = false;
                    }
                }
            }

            Image[] var13 = null;
            this.al = null;
            if (GlobalStatus.gH != null && GlobalStatus.gH.length > 0) {
                var13 = new Image[GlobalStatus.gH.length];
                this.al = new String[GlobalStatus.gH.length];

                for (int var15 = 0; var15 < GlobalStatus.gH.length; ++var15) {
                    this.al[var15] = GlobalStatus.gK[var15] + "级";
                    if (GlobalStatus.gL[var15] == 1) {
                        var13[var15] = y.pngImage;
                    } else if (GlobalStatus.gL[var15] == 0) {
                        var13[var15] = z.pngImage;
                    }
                }
            }

            this.e.ar.a(var13, GlobalStatus.gJ, (String[]) null, this.al);
            this.e.ar.a(GlobalStatus.aC == 1 ? GlobalStatus.gN : null);
            this.e.ar.b(GlobalStatus.aH == 1 ? GlobalStatus.gO : null);
            this.e.ar.a(GlobalStatus.gI);
            this.e.ar.b(false);
        } else {
            this.am = null;
            this.al = null;
            Object var2 = null;
            int[] var3 = null;
            short[] var4 = null;
            short[] var5 = null;
            Image[] var7 = null;
            if (GlobalStatus.q != null && GlobalStatus.q.length > 0) {
                var7 = new Image[GlobalStatus.q.length];
                this.al = new String[GlobalStatus.q.length];
                this.am = new String[GlobalStatus.q.length];
                var3 = new int[GlobalStatus.q.length];
                var4 = new short[GlobalStatus.q.length];
                var5 = new short[GlobalStatus.q.length];

                for (byte var6 = 0; var6 < GlobalStatus.q.length; ++var6) {
                    this.al[var6] = GlobalStatus.q[var6].o + "级";
                    String var8;
                    if (GlobalStatus.q[var6].c != null && !GlobalStatus.q[var6].c.equals("")) {
                        var8 = "(" + GlobalStatus.q[var6].c + ")";
                    } else {
                        var8 = "";
                    }

                    this.am[var6] = GlobalStatus.q[var6].e + var8;
                    if (GlobalStatus.q[var6].s == 1) {
                        var7[var6] = y.pngImage;
                    } else if (GlobalStatus.q[var6].s == 0) {
                        var7[var6] = z.pngImage;
                    }

                    var3[var6] = GlobalStatus.q[var6].n;
                    var4[var6] = GlobalStatus.q[var6].t;
                    var5[var6] = GlobalStatus.q[var6].u;
                }
            }

            this.e.ar.a(var7, this.am, (String[]) null, this.al);
            this.e.ar.a(var4);
            this.e.ar.b(var5);
            this.e.ar.a(var3);
            this.e.ar.b(false);
        }
    }

    private void H(int var1) {
        if (this.l == 0) {
            if (this.e.aq != null) {
                this.e.aq.b(var1);
            }

            this.aV = this.e.as.a;
            if (var1 == 8 || var1 == 2 || var1 == 518 || var1 == 516) {
                this.b(this.e.as.a);
            }

            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    if (this.by == 1) {
                        this.N();
                        this.by = 0;
                    } else {
                        this.au();
                        this.c((int) 2);
                    }

                    GlobalStatus.gQ = 1;
                    GlobalStatus.D();
                    return;
                }

                if (var1 == 1024) {
                    if (GlobalStatus.gQ > 1 && GlobalStatus.gR == 1) {
                        if (GlobalStatus.gQ - 1 <= 1) {
                            GlobalStatus.gQ = 1;
                        } else {
                            --GlobalStatus.gQ;
                        }

                        this.aS();
                        return;
                    }

                    if (GlobalStatus.gQ > 1 && GlobalStatus.gR == 0) {
                        if (GlobalStatus.gQ - 1 < 1) {
                            GlobalStatus.gQ = 1;
                        } else {
                            --GlobalStatus.gQ;
                        }

                        this.aS();
                        return;
                    }
                } else if (var1 == 2048) {
                    if (GlobalStatus.gQ <= 1 && GlobalStatus.gR == 1) {
                        ++GlobalStatus.gQ;
                        this.aS();
                        return;
                    }

                    if (GlobalStatus.gQ > 1 && GlobalStatus.gR == 1) {
                        ++GlobalStatus.gQ;
                        this.aS();
                        return;
                    }
                } else if (var1 == 513) {
                    this.e.as.a = 3;
                    this.b(this.e.as.a);
                    return;
                }
            } else if (this.e.as.a < 3) {
                if (GlobalStatus.gH != null) {
                    LoadingPage.a(65 + o, 2 * GlobalConfig.j + 10 + this.e.ar.g() * GlobalConfig.j + p, new String[]{"查看", "私聊", "组队", "交易", "好友", "黑名单", "PK", "参观住宅"}, false);
                    this.l = 1;
                    return;
                }
            } else if (this.e.as.a == 3) {
                if (GlobalStatus.q == null) {
                    return;
                }

                if (GlobalStatus.q[this.e.ar.g()].b.equals(GlobalStatus.ad)) {
                    return;
                }

                if (GlobalStatus.bs == 1) {
                    LoadingPage.a(0, (3 + this.e.ar.g()) * GlobalConfig.j + 10 + p, new String[]{"踢除", "任命", "解散", "群聊", "私聊", "查看", GlobalStatus.s == 0 ? "自由" : "跟随"}, true);
                } else {
                    LoadingPage.a(0, (3 + this.e.ar.g()) * GlobalConfig.j + p, new String[]{"群聊", "私聊", "离开", "查看"}, true);
                }

                this.l = 8;
                return;
            }
        } else if (this.l == 1) {
            if (this.e.aC != null && this.e.g) {
                this.aQ = GlobalStatus.gJ[this.e.ar.g()];
                this.a((String) GlobalStatus.gH[this.e.ar.g()], (byte) 4);
                this.l = 0;
            }

            LoadingPage.b(var1);
            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    this.l = 0;
                    return;
                }
            } else {
                if (LoadingPage.o == 0) {
                    LoadingPage.a(65 + o, (3 + this.e.ar.g()) * GlobalConfig.j + p, new String[]{"属性", "装备", "成就"}, false);
                    this.l = 2;
                    return;
                }

                if (LoadingPage.o == 1) {
                    this.aS = GlobalStatus.gH[this.e.ar.g()];
                    this.aT = 4;
                    this.e.a((String) "聊天", (int) 0);
                    return;
                }

                if (LoadingPage.o == 2) {
                    if (GlobalStatus.G()) {
                        this.e.processException("住宅中不能组队");
                        return;
                    }

                    if (GlobalStatus.bw < 1 || GlobalStatus.gP[this.e.ar.g()] != 2 && GlobalStatus.gP[this.e.ar.g()] != 3) {
                        if (GlobalStatus.bs == -1) {
                            LoadingPage.a(65 + o, (3 + this.e.ar.g()) * GlobalConfig.j + p, new String[]{"自由", "跟随"}, false);
                            this.l = 6;
                            return;
                        }

                        this.a(GlobalStatus.s, GlobalStatus.gH[this.e.ar.g()]);
                        return;
                    }

                    this.e.processException("敌对玩家不能组队！");
                    return;
                }

                if (LoadingPage.o == 3) {
                    if (GlobalStatus.bw < 1 || GlobalStatus.gP[this.e.ar.g()] != 2 && GlobalStatus.gP[this.e.ar.g()] != 3) {
                        LoadingPage.a(65 + o, (3 + this.e.ar.g()) * GlobalConfig.j + p, new String[]{"物品", "宠物"}, false);
                        this.l = 5;
                        return;
                    }

                    this.e.processException("敌对玩家不能交易！");
                    return;
                }

                if (LoadingPage.o == 4) {
                    this.a(GlobalStatus.gH[this.e.ar.g()]);
                    this.l = 0;
                    return;
                }

                if (LoadingPage.o == 5) {
                    this.b(GlobalStatus.gH[this.e.ar.g()]);
                    this.l = 0;
                    return;
                }

                if (LoadingPage.o != 6) {
                    if (LoadingPage.o == 7) {
                        if (GlobalStatus.G()) {
                            this.e.processException("住宅中不能参观别人住宅");
                            return;
                        }

                        if (GlobalStatus.bs != -1) {
                            this.e.processException("队伍中不能参看住宅！");
                            return;
                        }

                        this.a((byte) 1, -1, GlobalStatus.gH[this.e.ar.g()]);
                        return;
                    }
                } else {
                    boolean var10000;
                    label531:
                    {
                        String var13 = GlobalStatus.gH[this.e.ar.g()];
                        if (GlobalStatus.q != null) {
                            for (byte var2 = 0; var2 < GlobalStatus.q.length; ++var2) {
                                if (GlobalStatus.q[var2].b.equals(var13)) {
                                    var10000 = true;
                                    break label531;
                                }
                            }
                        }

                        var10000 = false;
                    }

                    if (var10000) {
                        this.e.processException("队友间不允许决斗!");
                        return;
                    }

                    if (GlobalStatus.gL[this.e.ar.g()] == 0 && GlobalStatus.s == 0) {
                        this.e.processException(GlobalStatus.gJ[this.e.ar.g()] + "不是队长!");
                        return;
                    }

                    if (GlobalStatus.bs == 0 && GlobalStatus.s == 0) {
                        this.e.processException("跟随模式下队员不能发出决斗邀请");
                        return;
                    }

                    if (GlobalStatus.bw < 1) {
                        this.o();
                        this.l = 7;
                        return;
                    }

                    if (GlobalStatus.gP[this.e.ar.g()] == 0 || GlobalStatus.gP[this.e.ar.g()] == 1) {
                        this.e.processException("非敌对玩家不能决斗！");
                        return;
                    }

                    if (GlobalStatus.gP[this.e.ar.g()] == 2 || GlobalStatus.gP[this.e.ar.g()] == 3) {
                        if (System.currentTimeMillis() - GlobalStatus.y > (GlobalStatus.bw == 1 ? this.M.q : (GlobalStatus.bw == 2 ? this.M.r : 0L))) {
                            this.M.a(GlobalStatus.gH[this.e.ar.g()], (byte) 1);
                            return;
                        }

                        this.e.processException("保护时间内玩家不能决斗！");
                        return;
                    }
                }
            }
        } else if (this.l != 2 && this.l != 6) {
            if (this.l == 3) {
                this.T.b(var1);
                if (var1 == 268435456 || var1 == 536870912) {
                    this.al = null;
                    this.T.j();
                    this.l = 2;
                    return;
                }
            } else if (this.l == 4) {
                this.a(GlobalStatus.cJ);
                this.g(var1);
                if (var1 == 536870912) {
                    if (this.m == 1) {
                        this.T.j();
                        this.m = 0;
                        return;
                    }

                    if (GlobalStatus.cJ != null) {
                        GlobalStatus.o();
                    }

                    q = null;
                    this.al = null;
                    MainCanvas.f.a(this.f, h, i, true, false, 1009050);
                    this.l = 2;
                    return;
                }
            } else if (this.l == 5) {
                LoadingPage.b(var1);
                if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
                    this.e(GlobalStatus.gH[this.e.ar.g()]);
                    return;
                }

                if (var1 == 536870912) {
                    LoadingPage.a(65 + o, 2 * GlobalConfig.j + 20 + this.e.ar.g() * GlobalConfig.j + p, new String[]{"查看", "私聊", "组队", "交易", "好友", "黑名单", "PK", "参观住宅"}, false);
                    LoadingPage.o = 3;
                    this.l = 1;
                    return;
                }
            } else if (this.l == 7) {
                this.d(var1);
                if (var1 == 268435456) {
                    if (this.n() <= 0L) {
                        this.e.processException("输入金钱必须大于0!");
                        return;
                    }

                    if (this.n() > GlobalStatus.ap) {
                        this.e.processException("输入金钱超出你支付能力!");
                        return;
                    }

                    byte[] var12;
                    if ((var12 = NetPayloadBuilder.a((short) 4185, GlobalStatus.ad, GlobalStatus.gH[this.e.ar.g()], this.n())) != null) {
                        MainCanvas.netUtils.sendPacket(new NetPacket((short) 4185, var12));
                    } else {
                        this.e.processException("获取上传指令数据错误!");
                    }

                    this.l = 0;
                    return;
                }

                if (var1 == 536870912) {
                    LoadingPage.a(65 + o, 2 * GlobalConfig.j + 20 + this.e.ar.g() * GlobalConfig.j + p, new String[]{"查看", "私聊", "组队", "交易", "好友", "黑名单", "PK", "参观住宅"}, false);
                    this.l = 1;
                    return;
                }
            } else if (this.l != 8) {
                if (this.l == 9) {
                    LoadingPage.b(var1);
                    if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                        if (var1 == 536870912) {
                            this.an(this.bz);
                            return;
                        }
                    } else if (LoadingPage.o == 0) {
                        if (this.bz == 0) {
                            byte[] var6;
                            if ((var6 = NetPayloadBuilder.e((short) 4114, GlobalStatus.ad, GlobalStatus.q[this.e.ar.g()].b)) == null) {
                                this.e.processException("获取上传指令数据错误!");
                                return;
                            }

                            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4114, var6));
                            this.e.processException("剔除队员" + GlobalStatus.q[this.e.ar.g()].e + "请求已发送!");
                        } else if (this.bz == 1) {
                            byte[] var7;
                            if ((var7 = NetPayloadBuilder.f((short) 4119, GlobalStatus.ad, GlobalStatus.q[this.e.ar.g()].b)) == null) {
                                this.e.processException("获取上传指令数据错误!");
                                return;
                            }

                            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4119, var7));
                            this.e.processException("任命" + GlobalStatus.q[this.e.ar.g()].e + "为队长请求已发送!");
                        } else if (this.bz == 2) {
                            if (GlobalStatus.bs == 1) {
                                byte[] var8;
                                if ((var8 = NetPayloadBuilder.h((short) 4120, GlobalStatus.ad)) == null) {
                                    this.e.processException("获取上传指令数据错误!");
                                    return;
                                }

                                MainCanvas.netUtils.sendPacket(new NetPacket((short) 4120, var8));
                                this.e.processException("解散队伍请求已发送!");
                            } else if (GlobalStatus.bs == 0) {
                                byte[] var9;
                                if ((var9 = NetPayloadBuilder.i((short) 4121, GlobalStatus.ad)) == null) {
                                    this.e.processException("获取上传指令数据错误!");
                                    return;
                                }

                                MainCanvas.netUtils.sendPacket(new NetPacket((short) 4121, var9));
                                this.e.processException("脱离队伍请求已发送!");
                            }
                        }
                    } else if (LoadingPage.o == 1) {
                        this.an(this.bz);
                        return;
                    }
                } else if (this.l == 10) {
                    LoadingPage.b(var1);
                    if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                        if (var1 == 536870912) {
                            this.bz = 3;
                            if (GlobalStatus.bs == 1) {
                                this.bz = 5;
                            }

                            this.an(this.bz);
                            return;
                        }
                    } else if (LoadingPage.o == 0) {
                        byte[] var10;
                        if ((var10 = NetPayloadBuilder.a((short) 4110, GlobalStatus.ad, GlobalStatus.q[this.e.ar.g()].b, (byte) 0)) == null) {
                            this.e.processException("获取上传指令数据错误!");
                            return;
                        }

                        MainCanvas.netUtils.sendPacket(new NetPacket((short) 4110, var10));
                        this.e.a((String) null);
                    } else if (LoadingPage.o == 1) {
                        byte[] var11;
                        if ((var11 = NetPayloadBuilder.b((short) 4111, GlobalStatus.ad, GlobalStatus.q[this.e.ar.g()].b)) == null) {
                            this.e.processException("获取上传指令数据错误!");
                            return;
                        }

                        MainCanvas.netUtils.sendPacket(new NetPacket((short) 4111, var11));
                        this.e.a((String) null);
                    }
                } else if (this.l == 11) {
                    this.T.b(var1);
                    if (var1 == 268435456 || var1 == 536870912) {
                        LoadingPage.a(0, (3 + this.e.ar.g()) * GlobalConfig.j + p, new String[]{"属性", "装备"}, true);
                        this.T.j();
                        this.l = 10;
                        return;
                    }
                } else if (this.l == 12) {
                    this.a(GlobalStatus.cJ);
                    this.g(var1);
                    if (var1 == 536870912) {
                        if (this.m == 1) {
                            this.T.j();
                            this.m = 0;
                            return;
                        }

                        LoadingPage.a(0, (3 + this.e.ar.g()) * GlobalConfig.j + p, new String[]{"属性", "装备"}, true);
                        if (GlobalStatus.cJ != null) {
                            GlobalStatus.o();
                        }

                        q = null;
                        this.al = null;
                        MainCanvas.f.a(this.f, h, i, true, false, 1009050);
                        this.l = 10;
                    }
                }
            } else {
                LoadingPage.b(var1);
                if (this.e.aC != null && this.e.g) {
                    if (this.bz != 0 && this.bz != 3) {
                        this.a((String) GlobalStatus.q[this.e.ar.g()].b, (byte) 4);
                    } else {
                        this.a((String) null, (byte) 2);
                    }
                }

                if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                    if (var1 == 536870912) {
                        this.l = 0;
                        return;
                    }
                } else if (GlobalStatus.bs == 1) {
                    if (LoadingPage.o == 0) {
                        LoadingPage.a(0, (3 + this.e.ar.g()) * GlobalConfig.j + p, new String[]{"确认", "取消"}, true);
                        this.bz = 0;
                        this.l = 9;
                        return;
                    }

                    if (LoadingPage.o == 1) {
                        LoadingPage.a(0, (3 + this.e.ar.g()) * GlobalConfig.j + p, new String[]{"确认", "取消"}, true);
                        this.bz = 1;
                        this.l = 9;
                        return;
                    }

                    if (LoadingPage.o == 2) {
                        LoadingPage.a(0, (3 + this.e.ar.g()) * GlobalConfig.j + p, new String[]{"确认", "取消"}, true);
                        this.bz = 2;
                        this.l = 9;
                        return;
                    }

                    if (LoadingPage.o == 3) {
                        this.aS = null;
                        this.aT = 2;
                        this.e.a((String) "聊天", (int) 0);
                        this.bz = 3;
                        this.aQ = GlobalStatus.q[this.e.ar.g()].e;
                        return;
                    }

                    if (LoadingPage.o == 4) {
                        this.aS = GlobalStatus.q[this.e.ar.g()].b;
                        this.aT = 4;
                        this.e.a((String) "聊天", (int) 0);
                        this.bz = 4;
                        this.aQ = GlobalStatus.q[this.e.ar.g()].e;
                        return;
                    }

                    if (LoadingPage.o == 5) {
                        LoadingPage.a(0, (3 + this.e.ar.g()) * GlobalConfig.j + p, new String[]{"属性", "装备"}, true);
                        this.l = 10;
                        return;
                    }

                    if (LoadingPage.o == 6) {
                        this.bz = 6;
                        byte[] var5;
                        if ((var5 = NetPayloadBuilder.b((short) 4115, GlobalStatus.ad, (short) GlobalStatus.s)) == null) {
                            this.e.processException("获取上传指令数据错误!");
                            return;
                        }

                        MainCanvas.netUtils.sendPacket(new NetPacket((short) 4115, var5));
                        if (GlobalStatus.s == 0) {
                            this.e.processException("队员自由活动请求已发送!");
                        } else {
                            if (GlobalStatus.s != 1) {
                                return;
                            }

                            this.e.processException("队伍集合请求已发送!");
                        }
                    }
                } else if (GlobalStatus.bs == 0) {
                    if (LoadingPage.o == 0) {
                        this.aS = null;
                        this.aT = 2;
                        this.e.a((String) "聊天", (int) 0);
                        this.bz = 0;
                        this.aQ = GlobalStatus.q[this.e.ar.g()].e;
                        return;
                    }

                    if (LoadingPage.o == 1) {
                        this.aS = GlobalStatus.q[this.e.ar.g()].b;
                        this.aT = 2;
                        this.e.a((String) "聊天", (int) 0);
                        this.bz = 1;
                        this.aQ = GlobalStatus.q[this.e.ar.g()].e;
                        return;
                    }

                    if (LoadingPage.o == 2) {
                        LoadingPage.a(0, (3 + this.e.ar.g()) * GlobalConfig.j + p, new String[]{"确认", "取消"}, true);
                        this.bz = 2;
                        this.l = 9;
                        return;
                    }

                    if (LoadingPage.o == 3) {
                        LoadingPage.a(0, (3 + this.e.ar.g()) * GlobalConfig.j + p, new String[]{"属性", "装备"}, true);
                        this.bz = 3;
                        this.l = 10;
                        return;
                    }
                }
            }
        } else {
            LoadingPage.b(var1);
            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    LoadingPage.a(65 + o, 2 * GlobalConfig.j + 20 + this.e.ar.g() * GlobalConfig.j + p, new String[]{"查看", "私聊", "组队", "交易", "好友", "黑名单", "PK", "参观住宅"}, false);
                    this.l = 1;
                    return;
                }
            } else {
                if (this.l == 6) {
                    this.a((short) (LoadingPage.o == 0 ? 1 : 0), (String) GlobalStatus.gH[this.e.ar.g()]);
                    return;
                }

                if (LoadingPage.o == 0) {
                    byte[] var3;
                    if ((var3 = NetPayloadBuilder.a((short) 4110, GlobalStatus.ad, GlobalStatus.gH[this.e.ar.g()], (byte) 0)) == null) {
                        this.e.processException("获取上传指令数据错误!");
                        return;
                    }

                    MainCanvas.netUtils.sendPacket(new NetPacket((short) 4110, var3));
                    this.e.a((String) null);
                } else if (LoadingPage.o == 1) {
                    byte[] var4;
                    if ((var4 = NetPayloadBuilder.b((short) 4111, GlobalStatus.ad, GlobalStatus.gH[this.e.ar.g()])) == null) {
                        this.e.processException("获取上传指令数据错误!");
                        return;
                    }

                    MainCanvas.netUtils.sendPacket(new NetPacket((short) 4111, var4));
                    this.e.a((String) null);
                } else if (LoadingPage.o == 2) {
                    this.df = GlobalStatus.gH[this.e.ar.g()];
                    this.a(GlobalStatus.gH[this.e.ar.g()], GlobalStatus.ad, (short) 2, (short) 1);
                    return;
                }
            }
        }

    }

    private void f(Graphics var1) {
        if (this.e.aq != null && this.l != 4 && this.l != 12) {
            this.e.aq.a(var1);
        }

        if (this.e.as.a != 3) {
            if (this.l == 1) {
                if (GlobalStatus.bw < 1) {
                    LoadingPage.c(var1);
                    return;
                }

                int[] var2 = new int[LoadingPage.p.length];

                for (int var3 = 0; var3 < var2.length; ++var3) {
                    if (var3 != 2 && var3 != 3) {
                        if (var3 == 6) {
                            if (GlobalStatus.gP[this.e.ar.g()] != 0 && GlobalStatus.gP[this.e.ar.g()] != 1) {
                                var2[var3] = 0;
                            } else {
                                var2[var3] = 1;
                            }
                        } else {
                            var2[var3] = 0;
                        }
                    } else if (GlobalStatus.gP[this.e.ar.g()] != 2 && GlobalStatus.gP[this.e.ar.g()] != 3) {
                        var2[var3] = 0;
                    } else {
                        var2[var3] = 1;
                    }
                }

                LoadingPage.a(var2);
                LoadingPage.c(var1);
                return;
            }

            if (this.l == 2 || this.l == 5 || this.l == 6) {
                LoadingPage.c(var1);
                return;
            }

            if (this.l == 3) {
                this.T.a(var1);
                return;
            }

            if (this.l == 4) {
                this.a(var1, GlobalStatus.gJ[this.e.ar.g()], q);
                return;
            }

            if (this.l == 7) {
                this.b(var1, "请输入决斗金额");
                return;
            }
        } else if (this.e.as.a == 3 && GlobalStatus.q != null) {
            if (this.l == 8 || this.l == 9 || this.l == 10) {
                LoadingPage.c(var1);
                return;
            }

            if (this.l == 11) {
                this.T.a(var1);
                return;
            }

            if (this.l == 12) {
                this.a(var1, GlobalStatus.q[this.e.ar.g()].e, q);
            }
        }

    }

    private void e(String var1) {
        byte[] var2;
        if ((var2 = NetPayloadBuilder.b((short) 4124, GlobalStatus.ad, var1, (byte) ((byte) LoadingPage.o))) != null) {
            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4124, var2));
            this.e.a((String) null);
        } else {
            this.e.processException("获取上传指令数据错误!");
        }
    }

    public final void v() {
        GlobalConfig.clearStr(this.e.l);
        this.e.l.append("昵称：" + GlobalStatus.eS + '\t');
        this.e.l.append("门派：" + GlobalConfig.G[GlobalStatus.eV] + '\t');
        this.e.l.append("级别：" + GlobalStatus.eT + '\t');
        this.e.l.append("性别：" + (GlobalStatus.eU == 0 ? "男" : "女") + '\t');
        this.e.l.append("称号：" + GlobalStatus.eW + '\t');
        this.e.l.append("帮派：" + GlobalStatus.eX);
        if (!"无".equals(GlobalStatus.eX)) {
            this.e.l.append("(" + GlobalStatus.eY + "级)");
        }

        this.e.l.append('\t');
        this.e.l.append("职务：" + GlobalStatus.eZ + '\t');
        this.e.l.append("功勋：" + GlobalStatus.fa + '\t');
        this.e.l.append("配偶：" + GlobalStatus.fb + '\t');
        this.e.l.append("师傅：" + GlobalStatus.fc + '\t');
        this.e.l.append("好感度：" + GlobalStatus.fd + '\t');
        this.e.l.append(GlobalStatus.fe);
        this.T.j();
        this.T.a("玩家详细");
        this.T.a(true);
        an_1 var1;
        (var1 = new an_1()).b(this.e.l.toString(), GlobalConfig.i, (byte) 2);
        this.T.a((al) var1);
        this.T.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
        this.e.touchPageCase = this.e.k;
        if (this.k == 7) {
            if (this.l == 10) {
                this.l = 11;
            } else {
                this.l = 3;
            }
        } else if (this.k == 21) {
            this.l = 4;
        } else if (this.k == 46) {
            this.l = 2;
        } else if (this.k == 47) {
            this.l = 3;
        } else if (this.k == 19) {
            this.l = 10;
        } else {
            if (this.k == 130) {
                this.l = 3;
            }

        }
    }

    public final void w() {
        this.aq = 0;
        LoadingPage.l = 0;
        this.bV = new int[10][4];
        MainCanvas.f.a(this.f, h, i, false, true, 1009050);
        if (GlobalStatus.cG != null) {
            for (byte var1 = 0; var1 < GlobalStatus.cQ.length; ++var1) {
                this.a(GlobalStatus.cQ[var1]);
            }
        }

        this.e.touchPageCase = this.e.k;
        if (this.k == 7) {
            q = this.e.a(q, GlobalStatus.cE, GlobalStatus.cF, (byte) 3, (byte) 1, false);
            if (this.l == 10) {
                this.l = 12;
            } else {
                this.l = 4;
            }
        } else if (this.k == 21) {
            if (this.e.ar.g() < GlobalStatus.q.length) {
                q = this.e.a(q, GlobalStatus.q[this.e.ar.g()].q, GlobalStatus.q[this.e.ar.g()].p, (byte) 3, GlobalStatus.q[this.e.ar.g()].r, false);
            }

            this.l = 5;
        } else if (this.k == 47) {
            q = this.e.a(q, GlobalStatus.cE, GlobalStatus.cF, (byte) 3, (byte) 0, false);
            this.l = 4;
        } else if (this.k == 130) {
            q = this.e.a(q, GlobalStatus.cE, GlobalStatus.cF, (byte) 3, (byte) 0, false);
            this.l = 4;
        }

        if (this.l == 4 || this.l == 12) {
            MainCanvas.f.a(this.f, h, i, false, true, 1009050);
        }

        this.m = 0;
    }

    private String a(int var1, boolean var2) {
        for (int var3 = 0; var3 < GlobalStatus.cG.length; ++var3) {
            if (GlobalStatus.cI[var3] == var1) {
                StringBuffer var4 = new StringBuffer();
                if (var2) {
                    var4.append(GlobalStatus.cH[var3]);
                    var4.append("（");
                    GlobalConfig.a(this.e.l, GlobalStatus.cO[var3]);
                    var4.append(this.e.l.toString() + "）");
                    var4.append('\t');
                }

                if (GlobalStatus.cK != null && GlobalStatus.cK.length > 0) {
                    var4.append(GlobalStatus.cK[var3]);
                    var4.append('\t');
                }

                if (GlobalStatus.cL != null && GlobalStatus.cL.length > 0) {
                    var4.append(GlobalStatus.cL[var3]);
                    var4.append('\t');
                }

                if (GlobalStatus.cM != null && GlobalStatus.cM.length > 0) {
                    var4.append(GlobalStatus.cM[var3]);
                    var4.append('\t');
                }

                if (GlobalStatus.cN[var3] > 0) {
                    var4.append("等级:");
                    var4.append(GlobalStatus.cN[var3]);
                    var4.append('\t');
                }

                if (var2 && GlobalStatus.cP[var3] != null) {
                    var4.append(GlobalStatus.cP[var3]);
                    var4.append('\t');
                }

                return var4.toString();
            }
        }

        return null;
    }

    public final void g(int var1) {
        if (this.m == 1) {
            this.T.b(var1);
        } else if (this.m == 0) {
            PngUtil.a(q, this.e.ak);
            if (var1 != 8 && var1 != 516) {
                if (var1 != 2 && var1 != 518) {
                    if (var1 == 1073741824 || var1 == 268435456 || var1 == 517) {
                        this.T.j();
                        this.T.a("装备属性");
                        this.T.a(true);
                        an_1 var2;
                        (var2 = new an_1()).a(this.a(this.aq, true), GlobalConfig.i, (byte) 2);
                        this.T.a(30);
                        this.T.a((al) var2);
                        this.T.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
                        this.m = 1;
                    }

                } else {
                    this.aq = this.aq + 1 > this.bY.length - 1 ? 0 : this.aq + 1;
                    LoadingPage.l = 0;
                }
            } else {
                this.aq = this.aq - 1 < 0 ? this.bY.length - 1 : this.aq - 1;
                LoadingPage.l = 0;
            }
        }
    }

    private void a(Graphics var1, Frame1 var2) {
        int var3 = 0;
        int var4 = 0;
        if (var2 != null && MainCanvas.O != null && MainCanvas.R != null) {
            var3 = (GlobalConfig.defaultWidth - MainCanvas.O.b) / 2;
            var4 = (GlobalConfig.defaultHigh - MainCanvas.O.c) / 2;
            var1.drawImage(MainCanvas.O.pngImage, var3, var4, 20);
            this.a((int) var3, (int) var4, (int) MainCanvas.O.b, (int) MainCanvas.O.c);
            var1.drawImage(MainCanvas.R[0].pngImage, var3 + this.cc[0][0], var4 + this.cc[0][1], 20);
            var1.drawImage(MainCanvas.R[1].pngImage, var3 + this.cc[1][0], var4 + this.cc[1][1], 20);
            var1.drawImage(MainCanvas.R[4].pngImage, var3 + this.cc[2][0], var4 + this.cc[2][1], 20);
            var1.drawImage(MainCanvas.R[3].pngImage, var3 + this.cc[3][0], var4 + this.cc[3][1], 20);
            var1.drawImage(MainCanvas.R[5].pngImage, var3 + this.cc[4][0], var4 + this.cc[4][1], 20);
            var1.drawImage(MainCanvas.R[6].pngImage, var3 + this.cc[5][0], var4 + this.cc[5][1], 20);

            for (int var5 = 0; var5 < 6; ++var5) {
                this.c(var5, var3 + this.cc[var5][0], var4 + this.cc[var5][1], MainCanvas.R[0].b, MainCanvas.R[0].c);
            }

            MainCanvas.f.a(var1, (Frame1) var2, (int[]) null, 0, 0, var3 + (MainCanvas.O.b - var2.i()) / 2, var4 + (MainCanvas.O.c - var2.j()) / 2, 20, 0);
        }

        LoadingPage.d(var1, var3 + this.cc[this.aq][0], var4 + this.cc[this.aq][1], 17, 17);
        int[] var7 = new int[]{-1, -1, -1, -1, -1, -1};
        if (GlobalStatus.jH != null) {
            for (int var6 = 0; var6 < GlobalStatus.jH.length; var7[n(GlobalStatus.jJ[var6])] = var6++) {
                MainCanvas.f.a(var1, b(GlobalStatus.jK[var6]), (int[]) null, (aj) null, 0, 0, var3 + this.cc[n(GlobalStatus.jJ[var6])][0] + 1, var4 + this.cc[n(GlobalStatus.jJ[var6])][1] + 1, 0, 0);
            }
        }

        if (var7[this.aq] >= 0) {
            if (this.aq == 0) {
                LoadingPage.a(var1, GlobalStatus.jI[var7[this.aq]], GlobalStatus.jL[var7[this.aq]], var3 + this.cc[this.aq][0] + 16, var4 + this.cc[this.aq][1], 40);
            } else if (this.aq == 1) {
                LoadingPage.a(var1, GlobalStatus.jI[var7[this.aq]], GlobalStatus.jL[var7[this.aq]], var3 + this.cc[this.aq][0] + 16, var4 + this.cc[this.aq][1] + 16, 24);
            } else if (this.aq == 2) {
                LoadingPage.a(var1, GlobalStatus.jI[var7[this.aq]], GlobalStatus.jL[var7[this.aq]], var3 + this.cc[this.aq][0], var4 + this.cc[this.aq][1] + 16, 20);
            } else {
                LoadingPage.a(var1, GlobalStatus.jI[var7[this.aq]], GlobalStatus.jL[var7[this.aq]], var3 + this.cc[this.aq][0], var4 + this.cc[this.aq][1], 36);
            }
        } else if (this.aq == 0) {
            LoadingPage.a(var1, "没有装备", -1L, var3 + this.cc[this.aq][0] + 16, var4 + this.cc[this.aq][1], 40);
        } else if (this.aq == 1) {
            LoadingPage.a(var1, "没有装备", -1L, var3 + this.cc[this.aq][0] + 16, var4 + this.cc[this.aq][1] + 16, 24);
        } else if (this.aq == 2) {
            LoadingPage.a(var1, "没有装备", -1L, var3 + this.cc[this.aq][0], var4 + this.cc[this.aq][1] + 16, 20);
        } else {
            LoadingPage.a(var1, "没有装备", -1L, var3 + this.cc[this.aq][0], var4 + this.cc[this.aq][1], 36);
        }
    }

    public final void a(Graphics var1, String var2, Frame1 var3) {
        if (this.m == 0) {
            int var4 = 0;
            int var5 = 0;
            if (var3 != null && MainCanvas.O != null && MainCanvas.R != null) {
                var4 = (GlobalConfig.defaultWidth - MainCanvas.O.b) / 2;
                var5 = (GlobalConfig.defaultHigh - MainCanvas.O.c) / 2;
                var1.drawImage(MainCanvas.O.pngImage, var4, var5, 20);
                this.a((int) var4, (int) var5, (int) MainCanvas.O.b, (int) MainCanvas.O.c);

                for (int var6 = 0; var6 < this.bY.length; ++var6) {
                    if (var6 < MainCanvas.R.length) {
                        this.bZ = MainCanvas.R[var6].pngImage;
                    } else if (var6 == 8) {
                        this.bZ = MainCanvas.R[1].pngImage;
                    } else if (var6 == 9) {
                        this.bZ = MainCanvas.R[7].pngImage;
                    }

                    var1.drawImage(this.bZ, var4 + this.bY[var6][0], var5 + this.bY[var6][1], 20);
                    this.c(var6, var4 + this.bY[var6][0], var5 + this.bY[var6][1], MainCanvas.R[0].b, MainCanvas.R[0].c);
                }

                MainCanvas.f.a(var1, (Frame1) var3, (int[]) null, 0, 0, var4 + MainCanvas.O.b / 2, var5 + (MainCanvas.O.c - var3.j()) / 2 + var3.j(), 20, 0);
                LoadingPage.a(var1, (String) var2, (int) (var4 + MainCanvas.O.b / 2), var5 + 26, 17, 16776960, 0);
            }

            var1.setColor(10092544);
            var1.drawRect(var4 + this.bY[this.aq][0], var5 + this.bY[this.aq][1], 17, 17);
            int[] var10 = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
            if (GlobalStatus.cG != null) {
                for (int var7 = 0; var7 < GlobalStatus.cG.length; var10[GlobalStatus.cI[var7]] = var7++) {
                    MainCanvas.f.a(var1, b(GlobalStatus.cJ[var7]), (int[]) null, (aj) null, 0, 0, var4 + this.bY[GlobalStatus.cI[var7]][0] + 1, var5 + this.bY[GlobalStatus.cI[var7]][1] + 1, 0, 0);
                }
            }

            if (var10[this.aq] >= 0) {
                if (this.aq < 3) {
                    LoadingPage.a(var1, GlobalStatus.cH[var10[this.aq]], this.a(this.aq, false), var4 + this.bY[this.aq][0] + 16, var5 + this.bY[this.aq][1], 40);
                } else if (this.aq < 5) {
                    LoadingPage.a(var1, GlobalStatus.cH[var10[this.aq]], this.a(this.aq, false), var4 + this.bY[this.aq][0] + 16, var5 + this.bY[this.aq][1] + 16, 24);
                } else if (this.aq < 7) {
                    LoadingPage.a(var1, GlobalStatus.cH[var10[this.aq]], this.a(this.aq, false), var4 + this.bY[this.aq][0], var5 + this.bY[this.aq][1] + 16, 20);
                } else {
                    LoadingPage.a(var1, GlobalStatus.cH[var10[this.aq]], this.a(this.aq, false), var4 + this.bY[this.aq][0], var5 + this.bY[this.aq][1], 36);
                }
            } else if (this.aq < 3) {
                LoadingPage.a(var1, GlobalConfig.M[this.aq], -1L, var4 + this.bY[this.aq][0] + 16, var5 + this.bY[this.aq][1], 40);
            } else if (this.aq < 5) {
                LoadingPage.a(var1, GlobalConfig.M[this.aq], -1L, var4 + this.bY[this.aq][0] + 16, var5 + this.bY[this.aq][1] + 16, 24);
            } else {
                if (this.aq >= 7) {
                    LoadingPage.a(var1, GlobalConfig.M[this.aq], -1L, var4 + this.bY[this.aq][0], var5 + this.bY[this.aq][1], 36);
                    return;
                }

                LoadingPage.a(var1, GlobalConfig.M[this.aq], -1L, var4 + this.bY[this.aq][0], var5 + this.bY[this.aq][1] + 16, 20);
            }
        } else if (this.m == 1) {
            this.T.a(var1);
            LoadingPage.a(var1, this.T.a + 5, this.T.b + 32, this.T.c - 11, 30, 1);
            LoadingPage.a(var1, (String) "宝石", (int) (this.T.a + 10), this.T.b + 35 + GlobalConfig.a(25), 20, 16776960, 0);
            if (GlobalStatus.cQ != null) {
                for (int var8 = 0; var8 < GlobalStatus.cG.length; ++var8) {
                    if (GlobalStatus.cI[var8] == this.aq && GlobalStatus.cQ[var8] != null) {
                        this.a(var1, this.T.a + 10 + GlobalConfig.i.stringWidth("宝石:"), this.T.b + 37, 17, 17, GlobalStatus.cQ[var8].length, 1);

                        for (byte var9 = 0; var9 < GlobalStatus.cQ[var8].length; ++var9) {
                            if (GlobalStatus.cQ[var8][var9] > 0) {
                                MainCanvas.f.a(var1, b(GlobalStatus.cQ[var8][var9]), (int[]) null, (aj) null, 0, 0, this.T.a + 10 + GlobalConfig.i.stringWidth("宝石:") + 2 + var9 * 17, this.T.b + 39, 0, 0);
                            }
                        }
                    }
                }
            }
        }

    }

    public final void x() {
        this.l = 0;
        this.e.aq.b();
        this.e.aq.a("任务");
        this.e.aq.a(true);
        this.e.as.a(new String[]{"已接", "剧情", "活动", "增值", "其他"});
        this.I(0);
        this.e.ar.a((Image[]) null, this.cd, (String[]) null, this.ce);
        this.e.au.a("操作");
        this.e.aq.a((al) this.e.as);
        this.e.aq.a((al) this.e.ar);
        if (GlobalConfig.defaultHigh > 220) {
            this.e.aq.a((al) this.e.au);
        }

        this.e.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
        if (GlobalStatus.bV != null && GlobalStatus.bV.length > 0) {
            this.e.ar.a(GlobalStatus.bV[0], 1);
        }

        this.e.touchPageCase = this.e.k = 7;
        this.j = this.k = 6;
    }

    private void I(int var1) {
        this.cd = null;
        this.ce = null;
        this.cf = null;
        if (var1 == 0) {
            if (GlobalStatus.bS == null) {
                this.cd = new String[1];
                this.cd[0] = "没有已经接任务";
            } else {
                this.cd = GlobalStatus.bS;
                short[] var8 = GlobalStatus.bT;
                this.ce = new String[var8.length];

                for (int var7 = 0; var7 < var8.length; ++var7) {
                    this.ce[var7] = var8[var7] + "级";
                }

                this.cf = GlobalStatus.bV;
            }
        } else {
            byte var2 = 0;
            switch (var1) {
                case 1:
                    var2 = 2;
                    break;
                case 2:
                    var2 = 1;
                    break;
                case 3:
                    var2 = 3;
                    break;
                case 4:
                    var2 = 0;
            }

            if (GlobalStatus.bM != null) {
                Vector var6 = new Vector();
                Vector var3 = new Vector();
                Vector var4 = new Vector();

                for (int var5 = 0; var5 < GlobalStatus.bO.length; ++var5) {
                    if (GlobalStatus.bO[var5] == var2) {
                        var6.addElement(GlobalStatus.bM[var5]);
                        var3.addElement(GlobalStatus.bN[var5] + "级");
                        var4.addElement(GlobalStatus.bP[var5]);
                    }
                }

                if (var6.size() > 0) {
                    this.cd = new String[var6.size()];
                    this.ce = new String[var3.size()];
                    this.cf = new String[var4.size()];
                    var6.copyInto(this.cd);
                    var3.copyInto(this.ce);
                    var4.copyInto(this.cf);
                    var6.removeAllElements();
                    var3.removeAllElements();
                    var4.removeAllElements();
                }
            }

        }
    }

    private void a(short var1, byte[] var2, String var3) {
        if (var2 != null) {
            MainCanvas.netUtils.sendPacket(new NetPacket(var1, var2));
            this.e.a((String) null);
        } else {
            this.e.processException("获取上传指令数据错误!");
        }
    }

    private void J(int var1) {
        if (this.l == 0) {
            if (this.e.aq != null) {
                this.e.aq.b(var1);
            }

            if (var1 != 8 && var1 != 516 && var1 != 2 && var1 != 518) {
                if (var1 != 536870912 && (GlobalStatus.bR != null || GlobalStatus.bL != null)) {
                    if (var1 != 1 && var1 != 4 && var1 != 514 && var1 != 520) {
                        if ((var1 == 268435456 || var1 == 1073741824 || var1 == 517) && this.e.as.a == 0 && GlobalStatus.bR != null && GlobalStatus.bU[this.e.ar.g()] == 0) {
                            this.aE();
                        }
                    } else if (this.cf != null && this.cf.length > 0) {
                        this.e.ar.a(this.cf[this.e.ar.g() < this.cf.length ? this.e.ar.g() : this.cf.length - 1], 1);
                    }
                } else if (this.by == 1) {
                    this.N();
                    this.by = 0;
                } else {
                    this.at();
                    this.c((int) 3);
                }
            } else {
                this.I(this.e.as.a);
                this.e.ar.a((Image[]) null, this.cd, (String[]) null, this.ce);
                if (this.cf != null && this.cf.length > 0) {
                    this.e.ar.a(this.cf[this.e.ar.g()], 1);
                } else {
                    this.e.ar.a("", 1);
                }
            }
        } else {
            if (this.l == 1) {
                LoadingPage.b(var1);
                if (var1 == 268435456 || var1 == 517 || var1 == 1073741824) {
                    Object var3 = null;
                    switch (LoadingPage.o) {
                        case 0:
                            byte[] var7 = NetPayloadBuilder.a((short) 5124, GlobalStatus.ad, (int) GlobalStatus.bR[this.e.ar.g()]);
                            this.a((short) 5124, var7, (String) null);
                            return;
                        case 1:
                            this.bs = 0;
                            byte[] var6 = NetPayloadBuilder.a((short) 5125, GlobalStatus.ad, (int) GlobalStatus.bR[this.e.ar.g()]);
                            this.a((short) 5125, var6, (String) null);
                            this.l = 0;
                            return;
                        case 2:
                            byte[] var5 = NetPayloadBuilder.d((short) 4132, GlobalStatus.ad, (int) GlobalStatus.bR[this.e.ar.g()]);
                            this.a((short) 4132, var5, (String) null);
                            this.aA = this.e.ar.h();
                            this.aE = this.e.ar.g();
                            return;
                        case 3:
                            String[] var4 = new String[]{"确认", "取消"};
                            LoadingPage.a(35 + o, (3 + this.e.ar.i()) * GlobalConfig.j + 12 + p, var4, false);
                            this.l = 2;
                        default:
                            return;
                    }
                }

                if (var1 != 536870912) {
                    return;
                }
            } else {
                if (this.l == 2) {
                    LoadingPage.b(var1);
                    if (var1 != 268435456 && var1 != 517 && var1 != 1073741824) {
                        if (var1 == 536870912) {
                            this.aE();
                            return;
                        }

                        if (GlobalStatus.bR == null && GlobalStatus.bL == null) {
                            if (this.by == 1) {
                                this.N();
                                this.by = 0;
                                return;
                            }

                            this.at();
                            this.e.ax = 1;
                            return;
                        }
                    } else {
                        if (LoadingPage.o == 0) {
                            byte[] var2 = NetPayloadBuilder.e((short) 4133, GlobalStatus.ad, (int) GlobalStatus.bR[this.e.ar.g()]);
                            this.a((short) 4133, var2, (String) null);
                            return;
                        }

                        if (LoadingPage.o == 1) {
                            this.aE();
                            return;
                        }
                    }

                    return;
                }

                if (this.l != 3) {
                    return;
                }

                if (this.e.aq != null) {
                    this.e.aq.b(var1);
                }

                if (var1 != 268435456 && var1 != 536870912 && var1 != 517 && var1 != 1073741824) {
                    return;
                }

                this.x();
                this.e.ar.a(this.aA, this.aE);
                if (GlobalStatus.bV != null && GlobalStatus.bV.length > 0) {
                    this.e.ar.a(GlobalStatus.bV[this.aE], 1);
                }
            }

            this.l = 0;
        }
    }

    private void aE() {
        String[] var1 = new String[]{"自动", "追踪", "详情", "放弃"};
        LoadingPage.a(35 + o, (3 + this.e.ar.i()) * GlobalConfig.j + 12 + p, var1, false);
        this.l = 1;
    }

    public final void a(boolean var1, boolean var2) {
        this.cg = var1;
        this.l = 0;
        this.b(var2);
        this.e.touchPageCase = this.e.k;
        this.j = this.k = 36;
    }

    public final void b(boolean var1) {
        int var2;
        if ((var2 = this.cg ? GlobalStatus.db.length : GlobalStatus.cR.length) >= 0) {
            this.e.aq.b();
            this.e.aq.a("宠物技能");
            if (var2 > 0) {
                GlobalStatus.dl = new int[var2];
                GlobalStatus.dm = new String[var2];
                GlobalStatus.dn = new byte[var2];
                GlobalStatus.do_2 = new byte[var2];
                GlobalStatus.dp = new byte[var2];
                GlobalStatus.dq = new short[var2];
                GlobalStatus.dr = new short[var2];
                GlobalStatus.ds = new String[var2];
                GlobalStatus.du = new byte[var2];
                GlobalStatus.dt = new String[var2];

                for (int var3 = 0; var3 < var2; ++var3) {
                    GlobalStatus.dl[var3] = this.cg ? GlobalStatus.db[var3] : GlobalStatus.cR[var3];
                    GlobalStatus.dm[var3] = this.cg ? GlobalStatus.dc[var3] : GlobalStatus.cS[var3];
                    GlobalStatus.dn[var3] = this.cg ? GlobalStatus.dd[var3] : GlobalStatus.cT[var3];
                    GlobalStatus.do_2[var3] = this.cg ? GlobalStatus.de[var3] : GlobalStatus.cU[var3];
                    GlobalStatus.dp[var3] = this.cg ? GlobalStatus.df[var3] : GlobalStatus.cV[var3];
                    GlobalStatus.dq[var3] = this.cg ? GlobalStatus.dg[var3] : GlobalStatus.cW[var3];
                    GlobalStatus.dr[var3] = this.cg ? GlobalStatus.dh[var3] : GlobalStatus.cX[var3];
                    GlobalStatus.ds[var3] = this.cg ? GlobalStatus.di[var3] : GlobalStatus.cY[var3];
                    GlobalStatus.du[var3] = this.cg ? GlobalStatus.dj[var3] : GlobalStatus.cZ[var3];
                    GlobalStatus.dt[var3] = this.cg ? GlobalStatus.dk[var3] : GlobalStatus.da[var3];
                }
            } else {
                GlobalStatus.p();
            }

            c_1 var10000 = this.e.ar;
            Image[] var10001 = b(GlobalStatus.dr);
            byte[] var7 = GlobalStatus.du;
            String[] var6 = GlobalStatus.dm;
            String[] var4 = null;
            if (var7 != null) {
                var4 = new String[var6.length];

                for (int var5 = 0; var5 < var6.length; ++var5) {
                    if (var7[var5] == 1) {
                        var4[var5] = var6[var5] + " ★";
                    } else {
                        var4[var5] = var6[var5];
                    }
                }
            }

            var10000.a(var10001, var4, (String[]) null, d(GlobalStatus.dq));
            if (this.k == 36) {
                this.e.ar.a(this.aq, this.ar);
            } else {
                this.aq = 0;
                this.ar = 0;
            }

            if (GlobalStatus.dl == null) {
                this.e.ar.a("没有技能,按3、9键可以上下翻滚此属性描述框", 2);
            } else {
                this.e.ar.a(GlobalStatus.ds[this.e.ar.g()], 2);
            }

            if (!var1) {
                this.e.at.a("".equals(GlobalStatus.dt[this.e.ar.g()]) ? "<0>当前已经最高等级" : GlobalStatus.dt[this.e.ar.g()], GlobalConfig.i, (byte) 1);
                this.e.at.a((byte) 1);
                this.e.aq.a((al) this.e.at);
            }

            this.e.aq.a((al) this.e.ar);
            this.e.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
        }

    }

    private static String[] d(short[] var0) {
        String[] var1 = null;
        if (var0 != null) {
            var1 = new String[var0.length];

            for (int var2 = 0; var2 < var1.length; ++var2) {
                var1[var2] = "" + var0[var2] + "级";
            }
        }

        return var1;
    }

    private void K(int var1) {
        if (this.l == 0) {
            if (this.e.aq != null) {
                this.e.aq.b(var1);
            }

            this.a(GlobalStatus.dr);
            if (var1 == 1 || var1 == 4 || var1 == 514 || var1 == 520) {
                if (GlobalStatus.dl != null && GlobalStatus.dl.length > 0) {
                    this.e.ar.a(GlobalStatus.ds[this.e.ar.g()], 2);
                    this.e.at.a("".equals(GlobalStatus.dt[this.e.ar.g()]) ? "<0>当前已经最高等级" : GlobalStatus.dt[this.e.ar.g()], GlobalConfig.i, (byte) 1);
                    this.e.at.a((byte) 1);
                    return;
                }

                this.e.touchAction = 0;
                return;
            }

            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    GlobalStatus.p();
                    if (this.g != null && !i()) {
                        this.g.e = 3;
                        this.j = this.k = 25;
                        return;
                    }

                    this.c((int) 0, (int) this.aE, (int) this.aA);
                    this.E();
                    LoadingPage.o = 8;
                    this.l = 1;
                    return;
                }
            } else {
                if (GlobalStatus.dl == null || GlobalStatus.dl.length <= 0) {
                    return;
                }

                if (i()) {
                    Object var6 = null;
                    if (GlobalStatus.dn[this.e.ar.g()] == 2 || GlobalStatus.du[this.e.ar.g()] != 1) {
                        String[] var8;
                        if ("".equals(GlobalStatus.dt[this.e.ar.g()])) {
                            var8 = new String[]{GlobalStatus.du[this.e.ar.g()] == 0 ? "激活技能" : "取消激活", "遗忘技能"};
                        } else {
                            var8 = new String[]{"升级", GlobalStatus.du[this.e.ar.g()] == 0 ? "激活技能" : "取消激活", "遗忘技能"};
                        }

                        LoadingPage.a(70 + GlobalConfig.f, 2 * GlobalConfig.j + 16 + this.e.ar.i() * GlobalConfig.j + GlobalConfig.g, var8, true);
                        this.l = 5;
                        return;
                    }

                    String[] var7;
                    if ("".equals(GlobalStatus.dt[this.e.ar.g()])) {
                        var7 = new String[]{"设置快捷", GlobalStatus.du[this.e.ar.g()] == 0 ? "激活技能" : "取消激活", "遗忘技能"};
                    } else {
                        var7 = new String[]{"升级", "设置快捷", GlobalStatus.du[this.e.ar.g()] == 0 ? "激活技能" : "取消激活", "遗忘技能"};
                    }

                    LoadingPage.a(70 + GlobalConfig.f, 2 * GlobalConfig.j + 16 + this.e.ar.i() * GlobalConfig.j + GlobalConfig.g, var7, true);
                    this.l = 1;
                } else if (this.g != null && GlobalStatus.dn[this.e.ar.g()] != 2 && !i() && GlobalStatus.du[this.e.ar.g()] == 1) {
                    if (GlobalStatus.do_2[this.e.ar.g()] == 2) {
                        if (bq_1.c() > 1 && bq_1.c() > GlobalStatus.dp[this.e.ar.g()]) {
                            this.g.k = 1;
                            this.g.q = GlobalStatus.dl[this.e.ar.g()];
                            this.g.d = 3;
                        } else {
                            this.g.a(this.g.j, this.g.p, this.g.n, this.g.o, (byte) 1, GlobalStatus.dl[this.e.ar.g()], (byte) 1, GlobalStatus.M[this.g.h].a);
                            this.g.f = -1;
                            this.g.e = 5;
                        }
                    } else if (GlobalStatus.do_2[this.e.ar.g()] == 1) {
                        this.g.k = 1;
                        this.g.q = GlobalStatus.dl[this.e.ar.g()];
                        if (bq_1.b() <= 1) {
                            this.g.m = (byte) (bq_1.i() + 3);
                            this.g.l = 0;
                            this.g.a(this.g.j, this.g.p, this.g.n, this.g.o, (byte) 1, GlobalStatus.dl[this.e.ar.g()], this.g.l, this.g.m);
                            this.g.f = -1;
                            this.g.e = 5;
                        } else {
                            this.g.k = 1;
                            this.g.q = GlobalStatus.dl[this.e.ar.g()];
                            this.g.d = 6;
                            this.g.i = this.g.g();
                        }
                    } else if (GlobalStatus.do_2[this.e.ar.g()] == 0) {
                        this.g.k = 1;
                        this.g.q = GlobalStatus.dl[this.e.ar.g()];
                        this.g.m = (byte) (bq_1.i() + 3);
                        this.g.l = 0;
                        this.g.a(this.g.j, this.g.p, this.g.n, this.g.o, (byte) 1, GlobalStatus.dl[this.e.ar.g()], this.g.l, this.g.m);
                        this.g.f = -1;
                        this.g.e = 5;
                    }

                    this.j = this.k = 25;
                    return;
                }
            }
        } else if (this.l == 1) {
            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    this.l = 0;
                    return;
                }

                LoadingPage.b(var1);
                return;
            }

            if (LoadingPage.p.length == 4 && LoadingPage.o == 0) {
                this.l = 0;
                this.aq = this.e.ar.h();
                this.ar = this.e.ar.g();
                byte[] var5;
                if ((var5 = NetPayloadBuilder.j((short) 4166, GlobalStatus.ad, GlobalStatus.fA[this.aE], GlobalStatus.dl[this.e.ar.g()])) == null) {
                    this.e.processException("获取上传指令数据错误!");
                    return;
                }

                MainCanvas.netUtils.sendPacket(new NetPacket((short) 4166, var5));
                this.e.a((String) null);
            } else {
                if (LoadingPage.p.length == 3 && LoadingPage.o == 0 || LoadingPage.p.length == 4 && LoadingPage.o == 1) {
                    this.az = 0;
                    if (GlobalStatus.eq == null) {
                        if (this.e.touchPageCase != 2) {
                            this.e.touchPageCase = this.e.k;
                        }

                        this.l = 2;
                        return;
                    }

                    this.l = 2;
                    return;
                }

                if ((LoadingPage.p.length != 3 || LoadingPage.o != 1) && (LoadingPage.p.length != 4 || LoadingPage.o != 2)) {
                    if (LoadingPage.p.length == 3 && LoadingPage.o == 2 || LoadingPage.p.length == 4 && LoadingPage.o == 3) {
                        if (GlobalStatus.dl[this.e.ar.g()] != 1) {
                            this.e.a((String) "输入OK确定遗忘宠物技能", (int) 0);
                        } else {
                            this.e.processException("普通技能不能被遗忘");
                        }

                        this.l = 0;
                        return;
                    }
                } else {
                    this.aq = this.e.ar.h();
                    this.ar = this.e.ar.g();
                    byte[] var4;
                    if ((var4 = NetPayloadBuilder.a((short) 4663, GlobalStatus.fA[this.aE], (int) GlobalStatus.dl[this.e.ar.g()], GlobalStatus.du[this.e.ar.g()], GlobalStatus.ad)) == null) {
                        this.e.processException("获取上传指令数据错误!");
                        return;
                    }

                    MainCanvas.netUtils.sendPacket(new NetPacket((short) 4663, var4));
                    this.e.a((String) null);
                }
            }
        } else if (this.l == 2) {
            this.a(GlobalStatus.et);
            if (var1 != 516 && var1 != 8) {
                if (var1 != 518 && var1 != 2) {
                    if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                        if (var1 == 536870912) {
                            this.l = 0;
                            return;
                        }

                        return;
                    }

                    if (GlobalStatus.eq != null && GlobalStatus.eq[this.az] == -1) {
                        this.b(true, (byte) 1);
                        return;
                    }

                    LoadingPage.a(70 + GlobalConfig.f, 2 * GlobalConfig.j + 16 + this.e.ar.i() * GlobalConfig.j + GlobalConfig.g, new String[]{"覆盖", "清空"}, true);
                    this.l = 3;
                    return;
                }

                this.az = this.az >= 7 ? 0 : ++this.az;
                return;
            }

            this.az = this.az <= 0 ? 7 : --this.az;
            return;
        } else {
            if (this.l == 3) {
                this.a(GlobalStatus.et);
                if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                    if (var1 == 536870912) {
                        this.l = 2;
                        return;
                    }

                    LoadingPage.b(var1);
                    return;
                }

                if (LoadingPage.o == 0) {
                    this.b(true, (byte) 1);
                    return;
                }

                this.b(false, (byte) 1);
                return;
            }

            if (this.l == 5) {
                LoadingPage.b(var1);
                if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                    if (var1 == 536870912) {
                        this.l = 0;
                    }
                } else if (LoadingPage.p.length == 3 && LoadingPage.o == 0) {
                    this.l = 0;
                    this.aq = this.e.ar.h();
                    this.ar = this.e.ar.g();
                    byte[] var3;
                    if ((var3 = NetPayloadBuilder.j((short) 4166, GlobalStatus.ad, GlobalStatus.fA[this.aE], GlobalStatus.dl[this.e.ar.g()])) == null) {
                        this.e.processException("获取上传指令数据错误!");
                        return;
                    }

                    MainCanvas.netUtils.sendPacket(new NetPacket((short) 4166, var3));
                    this.e.a((String) null);
                } else if ((LoadingPage.p.length != 3 || LoadingPage.o != 1) && (LoadingPage.p.length != 2 || LoadingPage.o != 0)) {
                    if (LoadingPage.p.length == 3 && LoadingPage.o == 2 || LoadingPage.p.length == 2 && LoadingPage.o == 1) {
                        if (GlobalStatus.dl[this.e.ar.g()] != 1) {
                            this.e.a((String) "输入OK确定遗忘宠物技能", (int) 0);
                        } else {
                            this.e.processException("普通技能不能被遗忘");
                        }

                        this.l = 0;
                        return;
                    }
                } else {
                    this.l = 0;
                    this.aq = this.e.ar.h();
                    this.ar = this.e.ar.g();
                    byte[] var2;
                    if ((var2 = NetPayloadBuilder.a((short) 4663, GlobalStatus.fA[this.aE], (int) GlobalStatus.dl[this.e.ar.g()], GlobalStatus.du[this.e.ar.g()], GlobalStatus.ad)) == null) {
                        this.e.processException("获取上传指令数据错误!");
                        return;
                    }

                    MainCanvas.netUtils.sendPacket(new NetPacket((short) 4663, var2));
                    this.e.a((String) null);
                }
            }
        }

    }

    public final void y() {
        byte[] var1;
        if ((var1 = NetPayloadBuilder.m((short) 4629, GlobalStatus.ad, GlobalStatus.fA[this.aE], GlobalStatus.dl[this.e.ar.g()])) != null) {
            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4629, var1));
            this.e.a((String) null);
        } else {
            this.e.processException("获取上传指令数据错误!");
        }
    }

    private void g(Graphics var1) {
        if (this.e.aq != null) {
            this.e.aq.a(var1);
        }

        if (this.l != 1 && this.l != 3 && this.l != 5) {
            if (this.l == 2) {
                this.a(var1, (GlobalConfig.defaultWidth - 176) / 2, (GlobalConfig.defaultHigh - 20) / 2, 1);

                for (int var2 = 0; var2 < GlobalStatus.ep.length; ++var2) {
                    if (var2 == this.az) {
                        LoadingPage.d(var1, (GlobalConfig.defaultWidth - 176) / 2 + 2 + var2 * 17, (GlobalConfig.defaultHigh - 20) / 2 + 2, 17, 17);
                        return;
                    }
                }
            }

        } else {
            LoadingPage.c(var1);
        }
    }

    public final void z() {
        if (GlobalStatus.mO == null) {
            this.e.processException("没有特效");
        } else {
            this.l = 0;
            this.e.aq.j();
            this.e.aq.a("技能特效");
            this.e.aq.a(true);
            String[] var1 = new String[GlobalStatus.mP.length];

            for (int var2 = 0; var2 < var1.length; ++var2) {
                var1[var2] = String.valueOf(GlobalStatus.mQ[var2]);
            }

            this.e.ar.a((Image[]) null, GlobalStatus.mP, (String[]) null, var1);
            this.e.aq.a((al) this.e.ar);
            this.e.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
            this.e.ar.a(this.e.aq.a + this.e.aq.c / 2 - 2, this.e.ar.b(), this.e.aq.c / 2 - 4, this.e.ar.d());
            this.ci = new int[]{this.e.aq.a, this.e.ar.b(), this.e.aq.c / 2, this.e.ar.d()};
            if (MainCanvas.ad == null) {
                (MainCanvas.ad = new Page("/", "skill")).loadRpg();
            }

            this.ch = MainCanvas.ad.getFrame1(String.valueOf(GlobalStatus.mR[this.e.ar.g()]));
            this.e.touchPageCase = this.e.k;
            this.j = this.k = 123;
        }
    }

    private void L(int var1) {
        if (this.l == 0) {
            this.e.aq.b(var1);
            if (var1 == 1 || var1 == 4) {
                this.ch = MainCanvas.ad.getFrame1("" + GlobalStatus.mR[this.e.ar.g()]);
                this.e.ar.a(GlobalStatus.mS[this.e.ar.g()], 1);
                return;
            }

            if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
                LoadingPage.a(70 + GlobalConfig.f, 2 * GlobalConfig.j + 28 + this.e.ar.i() * GlobalConfig.j + p, new String[]{"激活", "取消激活"}, true);
                this.l = 1;
                return;
            }

            if (var1 == 536870912) {
                this.av();
                this.c((int) 2);
                return;
            }
        } else if (this.l == 1) {
            LoadingPage.b(var1);
            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    this.l = 0;
                }
            } else {
                if (LoadingPage.o == 0) {
                    this.a((byte) 1, GlobalStatus.mO[this.e.ar.g()], (int) 0);
                    return;
                }

                if (LoadingPage.o == 1) {
                    this.a((byte) 3, GlobalStatus.mO[this.e.ar.g()], (int) 0);
                    return;
                }
            }
        }

    }

    private void h(Graphics var1) {
        this.e.aq.a(var1);
        if (this.l == 0) {
            if (this.ch != null) {
                PngUtil.a(this.ch, this.e.ak);
                MainCanvas.f.a(var1, (Frame1) this.ch, this.ci, 0, 0, this.e.aq.a + this.e.aq.c / 4, this.e.ar.b() + this.e.ar.d() / 2 + this.ch.h() / 2, 0, 0);
                return;
            }
        } else if (this.l == 1) {
            LoadingPage.c(var1);
        }

    }

    public final void A() {
        if (GlobalStatus.nb == null) {
            this.e.aq.j();
            this.e.aq.a("消除特效");
            this.e.aq.a(true);
            this.e.ar.a((Image[]) null, (String[]) null, (String[]) null, (String[]) null);
            this.e.au.a("");
            this.e.aq.a((al) this.e.ar);
            if (GlobalConfig.defaultHigh > 220) {
                this.e.aq.a((al) this.e.au);
            }

            this.e.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
        } else {
            this.e.aq.j();
            this.e.aq.a("消除特效");
            this.e.aq.a(true);
            String[] var1 = new String[GlobalStatus.nb.length];

            for (int var2 = 0; var2 < var1.length; ++var2) {
                var1[var2] = GlobalStatus.na;
            }

            this.e.ar.a((Image[]) null, var1, GlobalStatus.nc, GlobalStatus.nd);
            this.e.au.a("");
            this.e.aq.a((al) this.e.ar);
            if (GlobalConfig.defaultHigh > 220) {
                this.e.aq.a((al) this.e.au);
            }

            this.e.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
        }

        this.l = 0;
        this.e.touchPageCase = this.e.k;
        this.j = this.k = 121;
    }

    private void M(int var1) {
        this.e.aq.b(var1);
        if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
            if (var1 == 536870912) {
                this.z();
            }
        } else if (GlobalStatus.nb != null) {
            this.a((byte) 4, GlobalStatus.mZ, (int) GlobalStatus.nb[this.e.ar.g()]);
            return;
        }

    }

    private void i(Graphics var1) {
        this.e.aq.a(var1);
    }

    public final void B() {
        this.l = 0;
        this.e.aq.j();
        this.e.aq.a("激活特效");
        this.e.aq.a(true);
        this.a(GlobalStatus.mX);
        this.e.ar.a(b(GlobalStatus.mX), GlobalStatus.mW, (String[]) null, GlobalStatus.mY);
        this.e.at.b((String) null, GlobalConfig.i, (byte) 2);
        this.e.at.a((byte) 1);
        this.e.au.a("");
        this.e.aq.a((al) this.e.ar);
        this.e.aq.a((al) this.e.at);
        if (GlobalConfig.defaultHigh > 220) {
            this.e.aq.a((al) this.e.au);
        }

        this.e.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
        this.e.touchPageCase = this.e.k;
        this.j = this.k = 122;
    }

    private void N(int var1) {
        this.e.aq.b(var1);
        if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
            if (var1 == 536870912) {
                this.z();
            }

        } else {
            this.a((byte) 2, GlobalStatus.mT, (int) GlobalStatus.mV[this.e.ar.g()]);
        }
    }

    private void j(Graphics var1) {
        this.e.aq.a(var1);
    }

    private void a(byte var1, String var2, int var3) {
        byte[] var4;
        if ((var4 = NetPayloadBuilder.a(var1, var2, var3)) != null) {
            NetPacket var5 = new NetPacket((short) 4374, var4);
            MainCanvas.netUtils.sendPacket(var5);
            this.e.a((String) null);
        } else {
            this.e.processException("获取上传指令数据错误!");
        }
    }

    public final void h(int var1) {
        this.as = var1;
        this.l = 0;
        this.a((byte) 1, false);
        this.e.touchPageCase = this.e.k;
        this.j = this.k = 12;
    }

    private static boolean a(byte var0, byte var1) {
        switch (var0) {
            case 0:
                if (var1 == 2) {
                    return true;
                }

                return false;
            case 1:
                if (var1 != 0 && var1 != 1) {
                    return false;
                }

                return true;
            case 2:
                if (var1 == 3) {
                    return true;
                }

                return false;
            default:
                return false;
        }
    }

    public final void a(byte var1, boolean var2) {
        if (GlobalStatus.dv.length > 0) {
            this.a(GlobalStatus.dB);
            int var3 = 0;

            for (int var4 = 0; var4 < GlobalStatus.dx.length; ++var4) {
                if (a(var1, GlobalStatus.dx[var4])) {
                    ++var3;
                }
            }

            if (var3 > 0) {
                GlobalStatus.dl = new int[var3];
                GlobalStatus.dm = new String[var3];
                GlobalStatus.dn = new byte[var3];
                GlobalStatus.do_2 = new byte[var3];
                GlobalStatus.dp = new byte[var3];
                GlobalStatus.dq = new short[var3];
                GlobalStatus.dr = new short[var3];
                GlobalStatus.ds = new String[var3];
                GlobalStatus.dt = new String[var3];
                int var6 = 0;

                for (int var5 = 0; var5 < GlobalStatus.dx.length; ++var5) {
                    if (var6 < var3 && a(var1, GlobalStatus.dx[var5])) {
                        GlobalStatus.dl[var6] = GlobalStatus.dv[var5];
                        GlobalStatus.dm[var6] = GlobalStatus.dw[var5];
                        GlobalStatus.dn[var6] = GlobalStatus.dx[var5];
                        GlobalStatus.do_2[var6] = GlobalStatus.dy[var5];
                        GlobalStatus.dp[var6] = GlobalStatus.dz[var5];
                        GlobalStatus.dq[var6] = GlobalStatus.dA[var5];
                        GlobalStatus.dr[var6] = GlobalStatus.dB[var5];
                        GlobalStatus.ds[var6] = GlobalStatus.dD[var5];
                        GlobalStatus.dt[var6] = GlobalStatus.dC[var5];
                        ++var6;
                    }
                }
            } else {
                GlobalStatus.p();
            }

            this.e.aq.b();
            this.e.aq.a("人物技能");
            this.e.aq.a(true);
            if (this.as == 0) {
                if (this.j != 12) {
                    this.e.as.a(new String[]{" 技能   ", "  心法  ", "  附魔  "});
                }

                this.e.aq.a((al) this.e.as);
                this.e.ar.a(b(GlobalStatus.dr), GlobalStatus.dm, (String[]) null, var1 == 2 ? null : e(GlobalStatus.dq));
                if (var2) {
                    this.e.ar.a(this.aA, this.aE);
                } else {
                    this.aA = 0;
                    this.aE = 0;
                }

                if (GlobalStatus.dl == null) {
                    this.e.ar.a("没有技能,按3、9键可以上下翻滚此属性描述框", 2);
                    this.e.at.a("", GlobalConfig.i, (byte) 1);
                } else {
                    this.e.ar.a(GlobalStatus.ds[this.e.ar.g()], 2);
                    this.e.at.a("".equals(GlobalStatus.dt[this.e.ar.g()]) ? "<0>当前已经最高等级" : GlobalStatus.dt[this.e.ar.g()], GlobalConfig.i, (byte) 1);
                    this.e.at.a((byte) 1);
                }

                if (var1 == 1) {
                    this.e.aq.a((al) this.e.at);
                } else if (var1 == 0) {
                    this.e.aq.a((al) this.e.at);
                    this.e.au.a("升级");
                    this.e.aq.a((al) this.e.au);
                }

                this.e.aq.a((al) this.e.ar);
            } else {
                this.e.as.a(new String[]{" 技能   "});
                this.e.aq.a((al) this.e.as);
                this.e.ar.a(b(GlobalStatus.dr), GlobalStatus.dm, (String[]) null, var1 == 2 ? null : e(GlobalStatus.dq));
                if (GlobalStatus.dl == null) {
                    this.e.ar.a("没有技能,按3、9键可以上下翻滚此属性描述框", 2);
                } else {
                    this.e.ar.a(GlobalStatus.ds[0], 2);
                }

                this.e.aq.a((al) this.e.ar);
            }

            this.e.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
        }

    }

    private void O(int var1) {
        if (this.l == 0) {
            if (this.e.aq != null) {
                this.e.aq.b(var1);
            }

            if (var1 == 8 || var1 == 2 || var1 == 518 || var1 == 516) {
                if (this.e.as.a == 0) {
                    this.a((byte) 1, false);
                } else if (this.e.as.a == 1) {
                    this.a((byte) 0, false);
                } else {
                    this.a(this.e.as.a, false);
                }
            }

            if (var1 == 1 || var1 == 4 || var1 == 514 || var1 == 520) {
                if (GlobalStatus.dl != null && GlobalStatus.dl.length > 0) {
                    this.e.ar.a(GlobalStatus.ds[this.e.ar.g()], 2);
                    this.e.at.a("".equals(GlobalStatus.dt[this.e.ar.g()]) ? "<0>当前已经最高等级" : GlobalStatus.dt[this.e.ar.g()], GlobalConfig.i, (byte) 1);
                    this.e.at.a((byte) 1);
                    return;
                }

                return;
            }

            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    GlobalStatus.p();
                    if (this.as == 0) {
                        this.av();
                        this.c((int) 1);
                        return;
                    }

                    if (this.as != 2 && this.as == 3) {
                        this.j = this.k = 25;
                        return;
                    }
                }
            } else {
                if (GlobalStatus.dl == null || GlobalStatus.dl.length <= 0) {
                    return;
                }

                if (this.as == 0) {
                    if (this.e.as.a == 0) {
                        String[] var6 = "".equals(GlobalStatus.dt[this.e.ar.g()]) ? new String[]{"设置", "特效"} : new String[]{"升级", "设置", "特效"};
                        LoadingPage.a(GlobalConfig.realWidth / 3 - GlobalConfig.i.stringWidth("操作") / 2, 2 * GlobalConfig.j + 28 + this.e.ar.i() * GlobalConfig.j + p, var6, true);
                        this.l = 1;
                        return;
                    }

                    if (this.e.as.a == 1 && !"".equals(GlobalStatus.dt[this.e.ar.g()])) {
                        this.aE = this.e.ar.g();
                        this.aA = this.e.ar.h();
                        byte[] var4;
                        if ((var4 = NetPayloadBuilder.q((short) 4167, GlobalStatus.ad, GlobalStatus.dl[this.e.ar.g()])) == null) {
                            this.e.processException("获取上传指令数据错误!");
                            return;
                        }

                        NetPacket var5 = new NetPacket((short) 4167, var4);
                        MainCanvas.netUtils.sendPacket(var5);
                        this.e.a((String) null);
                    }
                } else if (this.as == 3 && this.g != null && this.e.as.a != 2) {
                    this.g.j = 1;
                    this.g.p = GlobalStatus.dl[this.e.ar.g()];
                    if (GlobalStatus.do_2[this.e.ar.g()] == 2) {
                        if (bq_1.c() > 1 && bq_1.c() > GlobalStatus.dp[this.e.ar.g()]) {
                            this.g.n = 1;
                            this.g.d = 1;
                        } else {
                            this.g.n = 1;
                            this.g.o = GlobalStatus.M[this.g.h].a;
                            if (this.g.j()) {
                                this.g.a((byte) 1, this.g.p, this.g.n, this.g.o, (byte) 1, 1, (byte) 1, (byte) -1);
                                this.g.f = -1;
                                this.g.e = 5;
                            } else {
                                this.g.d = 2;
                            }
                        }
                    } else if (GlobalStatus.do_2[this.e.ar.g()] == 1) {
                        this.g.n = 0;
                        this.g.d = 5;
                        this.g.i = bq_1.f() < 0 ? this.g.i : bq_1.f();
                    } else if (GlobalStatus.do_2[this.e.ar.g()] == 0) {
                        this.g.n = 0;
                        this.g.o = bq_1.i();
                        if (this.g.j()) {
                            this.g.a((byte) 1, this.g.p, this.g.n, this.g.o, (byte) 1, 1, (byte) 1, (byte) -1);
                            this.g.f = -1;
                            this.g.e = 5;
                        } else {
                            this.g.d = 2;
                        }
                    }

                    this.j = this.k = 25;
                    return;
                }
            }
        } else if (this.l == 1) {
            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    this.l = 0;
                    return;
                }

                LoadingPage.b(var1);
                return;
            }

            if (LoadingPage.p.length == 3 && LoadingPage.o == 0) {
                this.aE = this.e.ar.g();
                this.aA = this.e.ar.h();
                byte[] var2;
                if ((var2 = NetPayloadBuilder.q((short) 4167, GlobalStatus.ad, GlobalStatus.dl[this.e.ar.g()])) == null) {
                    this.e.processException("获取上传指令数据错误!");
                    return;
                }

                NetPacket var3 = new NetPacket((short) 4167, var2);
                MainCanvas.netUtils.sendPacket(var3);
                this.e.a((String) null);
            } else {
                if (LoadingPage.p.length == 3 && LoadingPage.o == 1 || LoadingPage.p.length == 2 && LoadingPage.o == 0) {
                    this.az = 0;
                    if (GlobalStatus.ek == null) {
                        if (this.e.touchPageCase != 2) {
                            this.e.touchPageCase = this.e.k;
                        }

                        this.l = 6;
                        return;
                    }

                    this.l = 6;
                    return;
                }

                if (LoadingPage.p.length == 2 && LoadingPage.o == 1 || LoadingPage.p.length == 3 && LoadingPage.o == 2) {
                    this.a((byte) 5, "", (int) GlobalStatus.dl[this.e.ar.g()]);
                    return;
                }
            }
        } else if (this.l == 6) {
            this.a(GlobalStatus.en);
            if (var1 != 516 && var1 != 8) {
                if (var1 != 518 && var1 != 2) {
                    if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                        if (var1 == 536870912) {
                            this.l = 0;
                            return;
                        }

                        return;
                    }

                    if (GlobalStatus.ek != null && GlobalStatus.ek[this.az] == -1) {
                        this.a(true, (byte) 1);
                        return;
                    }

                    LoadingPage.a(70 + GlobalConfig.f, 2 * GlobalConfig.j + 28 + this.e.ar.i() * GlobalConfig.j + p, new String[]{"覆盖", "清空"}, true);
                    this.l = 7;
                    return;
                }

                this.az = this.az >= 7 ? 0 : ++this.az;
                return;
            }

            this.az = this.az <= 0 ? 7 : --this.az;
            return;
        } else if (this.l == 7) {
            if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
                if (LoadingPage.o == 0) {
                    this.a(true, (byte) 1);
                    return;
                }

                this.a(false, (byte) 1);
                return;
            }

            if (var1 == 536870912) {
                this.l = 6;
                return;
            }

            LoadingPage.b(var1);
        }

    }

    private void k(Graphics var1) {
        if (this.e.aq != null) {
            this.e.aq.a(var1);
        }

        if (this.l != 1 && this.l != 7) {
            if (this.l == 6) {
                this.a(var1, (GlobalConfig.defaultWidth - 176) / 2, (GlobalConfig.defaultHigh - 20) / 2, 0);

                for (int var2 = 0; var2 < GlobalStatus.ej.length; ++var2) {
                    if (var2 == this.az) {
                        LoadingPage.d(var1, (GlobalConfig.defaultWidth - 176) / 2 + 2 + var2 * 17, (GlobalConfig.defaultHigh - 20) / 2 + 2, 17, 17);
                        return;
                    }
                }
            }

        } else {
            LoadingPage.c(var1);
        }
    }

    public final void C() {
        this.l = 0;
        if (this.j != 34) {
            this.aV = 0;
            this.e.as.a(new String[]{"拍卖中", "仓库", "记录"});
        }

        if (this.j != 34 || this.j == 34 && this.e.as.a != 2) {
            this.e.aq.b();
            this.e.aq.a("宠物拍卖详情");
            this.e.ar.a((Image[]) null, GlobalStatus.gt, e(GlobalStatus.gu), this.a(GlobalStatus.gv));
            if (this.e.as.a == 0) {
                this.e.au.a("下架");
            } else {
                this.e.au.a("取回");
            }

            this.e.au.a(true);
            this.e.at.a(GlobalStatus.a((StringBuffer) this.e.l, (int) 0, (byte) this.e.as.a), GlobalConfig.i, (byte) 2);
            this.e.at.a((byte) 1);
            this.e.aq.a((al) this.e.as);
            this.e.aq.a((al) this.e.ar);
            this.e.aq.a((al) this.e.at);
            this.e.aq.a((al) this.e.au);
            this.e.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
            this.e.aq.a(true);
            if (GlobalStatus.gw != null) {
                a(GlobalStatus.gw[0], GlobalStatus.gx[0], GlobalStatus.gy[0], GlobalStatus.gz[0]);
                this.aI = MainCanvas.ah.a(String.valueOf(GlobalStatus.gw[0] + "_0"), GlobalStatus.gx[0], GlobalStatus.gy[0], GlobalStatus.gz[0]);
            }

            this.e.touchPageCase = this.e.k;
            this.j = this.k = 34;
        } else {
            this.e.aq.b();
            this.e.aq.a("宠物拍卖详情");
            this.e.aq.a(true);
            this.e.au.a("确定");
            this.e.au.a(true);
            this.e.at.a(this.aY(), GlobalConfig.i, (byte) 2);
            this.e.at.a((byte) 0);
            this.e.aq.a((al) this.e.as);
            this.e.aq.a((al) this.e.at);
            if (GlobalConfig.defaultHigh > 220) {
                this.e.aq.a((al) this.e.au);
            }

            this.e.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
            this.e.touchPageCase = this.e.k;
            this.j = this.k = 34;
        }
    }

    private void P(int var1) {
        if (this.l == 0) {
            if (this.e.aq != null) {
                this.e.aq.b(var1);
            }

            if (var1 == 8 || var1 == 2) {
                if (this.e.as.a == 0 && this.aV != 0) {
                    GlobalStatus.gQ = 1;
                    this.a((byte) 1, (short) GlobalStatus.gQ);
                    this.aV = this.e.as.a;
                } else if (this.e.as.a == 1) {
                    GlobalStatus.gQ = 1;
                    this.c((byte) 1, (short) GlobalStatus.gQ);
                    this.aV = this.e.as.a;
                } else if (this.e.as.a == 2 && this.aV != 2) {
                    GlobalStatus.gQ = 1;
                    this.b((byte) 1, (short) GlobalStatus.gQ);
                    this.aV = this.e.as.a;
                }
            }

            if (var1 == 1024) {
                if (GlobalStatus.gQ > 1) {
                    if (this.e.as.a == 0) {
                        this.a((byte) 1, (short) ((short) (GlobalStatus.gQ - 1)));
                    } else if (this.e.as.a == 1) {
                        this.c((byte) 1, (short) ((short) (GlobalStatus.gQ - 1)));
                    } else {
                        this.b((byte) 1, (short) ((short) (GlobalStatus.gQ - 1)));
                    }
                }
            } else if (var1 == 2048) {
                if (GlobalStatus.gR == 1) {
                    if (this.e.as.a == 0) {
                        this.a((byte) 1, (short) ((short) (GlobalStatus.gQ + 1)));
                    } else if (this.e.as.a == 1) {
                        this.c((byte) 1, (short) ((short) (GlobalStatus.gQ + 1)));
                    } else {
                        this.b((byte) 1, (short) ((short) (GlobalStatus.gQ + 1)));
                    }
                }
            } else if (var1 == 536870912) {
                this.m();
            }

            if (this.e.as.a != 2 && GlobalStatus.gs != null) {
                if (GlobalStatus.gA != null && GlobalStatus.gA[this.e.ar.g()] != null && GlobalStatus.gA[this.e.ar.g()].length > 0) {
                    for (byte var4 = 0; var4 < GlobalStatus.gA[this.e.ar.g()].length; ++var4) {
                        this.a(GlobalStatus.gA[this.e.ar.g()]);
                    }
                }

                if (var1 == 1 || var1 == 514 || var1 == 520 || var1 == 4) {
                    this.e.at.a(GlobalStatus.a(this.e.l, this.e.ar.g(), this.e.as.a), GlobalConfig.i, (byte) 2);
                    this.e.at.a((byte) 1);
                    a(GlobalStatus.gw[this.e.ar.g()], GlobalStatus.gx[this.e.ar.g()], GlobalStatus.gy[this.e.ar.g()], GlobalStatus.gz[this.e.ar.g()]);
                    this.aI = MainCanvas.ah.a(String.valueOf(GlobalStatus.gw[this.e.ar.g()] + "_0"), GlobalStatus.gx[this.e.ar.g()], GlobalStatus.gy[this.e.ar.g()], GlobalStatus.gz[this.e.ar.g()]);
                }

                PngUtil.a(this.aI, this.e.ak);
                if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
                    if (this.e.as.a == 0 && GlobalStatus.gs != null) {
                        LoadingPage.a(35 + GlobalConfig.f, (3 + this.e.ar.i()) * GlobalConfig.j + GlobalConfig.g, new String[]{"取消拍卖"}, false);
                        this.l = 1;
                        return;
                    }

                    if (this.e.as.a == 1 && GlobalStatus.gs != null) {
                        LoadingPage.a(35 + GlobalConfig.f, (3 + this.e.ar.i()) * GlobalConfig.j + GlobalConfig.g, new String[]{"拍卖", "取回"}, false);
                        this.l = 2;
                        return;
                    }
                }
            }
        } else if (this.l == 1) {
            LoadingPage.b(var1);
            if (var1 != 1073741824 && var1 != 268435456 && var1 != 517) {
                if (var1 == 536870912) {
                    this.l = 0;
                    return;
                }
            } else if (LoadingPage.o == 0) {
                this.l = 3;
                LoadingPage.h = 0;
                return;
            }
        } else if (this.l == 2) {
            LoadingPage.b(var1);
            if (var1 != 1073741824 && var1 != 268435456 && var1 != 517) {
                if (var1 == 536870912) {
                    this.l = 0;
                    return;
                }
            } else {
                if (LoadingPage.o == 0) {
                    this.l = 4;
                    return;
                }

                if (LoadingPage.o == 1) {
                    byte[] var2;
                    if ((var2 = NetPayloadBuilder.n((short) 4151, GlobalStatus.ad, (int) GlobalStatus.gs[this.e.ar.g()])) == null) {
                        this.e.processException("获取上传指令数据错误!");
                        return;
                    }

                    NetPacket var3 = new NetPacket((short) 4151, var2);
                    MainCanvas.netUtils.sendPacket(var3);
                    this.e.a((String) null);
                }
            }
        } else if (this.l == 3) {
            if (var1 == 1073741824 || var1 == 268435456 || var1 == 517) {
                this.a((byte) 1, (int) GlobalStatus.gs[this.e.ar.g()]);
                return;
            }

            if (var1 == 536870912) {
                this.l = 1;
                return;
            }
        } else if (this.l == 4) {
            this.d(var1);
            this.bR = this.n();
            if (var1 == 1073741824 || var1 == 268435456) {
                if (this.n() <= 0L) {
                    this.e.processException("输入金钱必须大于0!");
                    return;
                }

                this.l = 5;
                LoadingPage.h = 0;
                this.o();
                return;
            }

            if (var1 == 536870912) {
                this.l = 2;
                this.o();
                return;
            }
        } else if (this.l == 5) {
            if (var1 == 1073741824 || var1 == 268435456 || var1 == 517) {
                this.a((byte) 1, GlobalStatus.gs[this.e.ar.g()], this.bR);
                return;
            }

            if (var1 == 536870912) {
                this.l = 2;
                this.o();
            }
        }

    }

    private void l(Graphics var1) {
        if (this.e.aq != null) {
            this.e.aq.a(var1);
        }

        Object var2 = null;
        if (this.e.as.a != 2) {
            if (GlobalStatus.gw != null && GlobalStatus.gA[this.e.ar.g()] != null && GlobalStatus.gA[this.e.ar.g()].length > 0 && this.e.at.a == 0) {
                Vector var4 = a(GlobalStatus.gA[this.e.ar.g()], GlobalStatus.gB[this.e.ar.g()]);
                if (GlobalStatus.gG[this.e.ar.g()] > 11) {
                    this.a(var1, GlobalConfig.defaultWidth - GlobalConfig.f - 187 - 26, this.e.at.c + 3, 17, 17, 11, 1);
                    this.a(var1, GlobalConfig.defaultWidth - GlobalConfig.f - (GlobalStatus.gG[this.e.ar.g()] - 11) * 17 - 26, this.e.at.c + 24, 17, 17, GlobalStatus.gG[this.e.ar.g()] - 11, 1);
                } else {
                    this.a(var1, GlobalConfig.defaultWidth - GlobalConfig.f - GlobalStatus.gG[this.e.ar.g()] * 17 - 26, this.e.at.c + 3, 17, 17, GlobalStatus.gG[this.e.ar.g()], 1);
                }

                for (byte var3 = 0; var3 < var4.size(); ++var3) {
                    if (GlobalStatus.gG[this.e.ar.g()] > 11) {
                        if (var3 < 11) {
                            MainCanvas.f.a(var1, b(((Short) var4.elementAt(var3)).shortValue()), (int[]) null, (aj) null, 0, 0, GlobalConfig.defaultWidth - GlobalConfig.f - (11 - var3) * 17 - 23, this.e.at.c + 4 + 2, 0, 0);
                        } else {
                            MainCanvas.f.a(var1, b(((Short) var4.elementAt(var3)).shortValue()), (int[]) null, (aj) null, 0, 0, GlobalConfig.defaultWidth - GlobalConfig.f - (GlobalStatus.gG[this.e.ar.g()] - var3) * 17 - 23, this.e.at.c + 4 + 2 + 21, 0, 0);
                        }
                    } else {
                        MainCanvas.f.a(var1, b(((Short) var4.elementAt(var3)).shortValue()), (int[]) null, (aj) null, 0, 0, GlobalConfig.defaultWidth - GlobalConfig.f - (GlobalStatus.gG[this.e.ar.g()] - var3) * 17 - 23, this.e.at.c + 4 + 2, 0, 0);
                    }
                }
            }

            if (GlobalStatus.gw != null && this.aI != null && this.l == 0) {
                int var5;
                var5 = (var5 = this.e.ar.b() + 2 + (this.e.ar.g() - this.e.ar.h() + 1) * GlobalConfig.j) + 50 > this.e.ar.b() + this.e.ar.d() ? this.e.ar.b() + this.e.ar.d() - 50 : var5;
                int var7 = this.e.ar.a() + this.e.ar.c() - 50 - 20;
                LoadingPage.a(var1, 1009050, 159, var7, var5, 50, 50);
                var1.setColor(16776960);
                var1.drawRect(var7 - 1, var5 - 1, 51, 51);
                var1.setColor(16777215);
                var1.fillRect(var7 + 9, var5 + 2, 31, 3);
                var1.setColor(0);
                var1.drawRect(var7 + 9, var5 + 2, 31, 3);
                var1.setColor(16711680);
                var1.fillRect(var7 + 1 + 9, var5 + 1 + 2, 30 * GlobalStatus.gD[this.e.ar.g()] / GlobalStatus.gC[this.e.ar.g()], 2);
                var1.setColor(16777215);
                var1.fillRect(var7 + 9, var5 + 7, 31, 3);
                var1.setColor(0);
                var1.drawRect(var7 + 9, var5 + 7, 31, 3);
                var1.setColor(48127);
                var1.fillRect(var7 + 1 + 9, var5 + 1 + 7, 30 * GlobalStatus.gF[this.e.ar.g()] / GlobalStatus.gE[this.e.ar.g()], 2);
                MainCanvas.f.a(var1, (Frame1) this.aI, (int[]) null, 0, 0, var7 + 25 - this.aI.g() / 2, var5 + 50 - this.aI.h() - 3, 20, 0);
            }
        }

        if (this.l != 1 && this.l != 2) {
            if (this.l == 3) {
                LoadingPage.a(var1, "是否将" + GlobalStatus.gt[this.e.ar.g()] + "从拍卖场中撤下？", new String[]{"确定", "取消"});
            } else if (this.l == 4) {
                this.b(var1, "拍卖价格");
            } else {
                if (this.l == 5) {
                    LoadingPage.a(var1, "您确定以" + this.bR + "两的价格拍卖此物品?", new String[]{"确定", "取消"});
                }

            }
        } else {
            LoadingPage.c(var1);
        }
    }

    private void aF() {
        this.l = 0;
        this.e.aq.b();
        this.e.aq.a("宠物仓库");
        if (GlobalStatus.gs != null && GlobalStatus.gs.length > 0) {
            this.e.ar.a((Image[]) null, GlobalStatus.gt, (String[]) null, e(GlobalStatus.gu));
            this.e.at.a(GlobalStatus.g(this.e.l, 0), GlobalConfig.i, (byte) 2);
        } else {
            this.e.ar.a((Image[]) null, (String[]) null, (String[]) null, (String[]) null);
            this.e.at.a((String) null, GlobalConfig.i, (byte) 2);
        }

        this.e.at.a((byte) 1);
        this.e.au.a("取回");
        this.e.aq.a((al) this.e.ar);
        this.e.aq.a((al) this.e.at);
        if (GlobalConfig.defaultHigh > 220) {
            this.e.aq.a((al) this.e.au);
        }

        this.e.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
        if (GlobalStatus.gw != null) {
            a(GlobalStatus.gw[0], GlobalStatus.gx[0], GlobalStatus.gy[0], GlobalStatus.gz[0]);
            this.aI = MainCanvas.ah.a(String.valueOf(GlobalStatus.gw[0] + "_0"), GlobalStatus.gx[0], GlobalStatus.gy[0], GlobalStatus.gz[0]);
        }

        this.j = this.k = 35;
    }

    public final void D() {
        this.aF();
        this.e.ar.a(this.aA, this.aE >= GlobalStatus.gs.length ? GlobalStatus.gs.length - 1 : this.aE);
        if (GlobalStatus.gw != null) {
            a(GlobalStatus.gw[this.e.ar.g()], GlobalStatus.gx[this.e.ar.g()], GlobalStatus.gy[this.e.ar.g()], GlobalStatus.gz[this.e.ar.g()]);
            this.aI = MainCanvas.ah.a(String.valueOf(GlobalStatus.gw[this.e.ar.g()] + "_0"), GlobalStatus.gx[this.e.ar.g()], GlobalStatus.gy[this.e.ar.g()], GlobalStatus.gz[this.e.ar.g()]);
        }

    }

    private void Q(int var1) {
        if (GlobalStatus.gs == null) {
            this.e.touchPageCase = this.e.k;
            this.N();
        } else {
            if (this.l == 0) {
                if (this.e.aq != null) {
                    this.e.aq.b(var1);
                }

                if (GlobalStatus.gA[this.e.ar.g()] != null && GlobalStatus.gA[this.e.ar.g()].length > 0 && this.e.at.a == 0) {
                    for (byte var2 = 0; var2 < GlobalStatus.gA[this.e.ar.g()].length; ++var2) {
                        this.a(GlobalStatus.gA[this.e.ar.g()]);
                    }
                }

                if ((var1 == 1 || var1 == 514 || var1 == 520 || var1 == 4) && GlobalStatus.gs != null && GlobalStatus.gs.length > 0) {
                    this.e.at.a(GlobalStatus.g(this.e.l, this.e.ar.g()), GlobalConfig.i, (byte) 2);
                    this.e.at.a((byte) 1);
                    a(GlobalStatus.gw[this.e.ar.g()], GlobalStatus.gx[this.e.ar.g()], GlobalStatus.gy[this.e.ar.g()], GlobalStatus.gz[this.e.ar.g()]);
                    this.aI = MainCanvas.ah.a(String.valueOf(GlobalStatus.gw[this.e.ar.g()] + "_0"), GlobalStatus.gx[this.e.ar.g()], GlobalStatus.gy[this.e.ar.g()], GlobalStatus.gz[this.e.ar.g()]);
                }

                PngUtil.a(this.aI, this.e.ak);
                if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                    if (var1 == 536870912) {
                        this.al = null;
                        this.aE = 0;
                        this.m();
                    }
                } else {
                    this.aE = this.e.ar.g();
                    this.aA = this.e.ar.h();
                    byte[] var4;
                    if ((var4 = NetPayloadBuilder.o((short) 4162, GlobalStatus.ad, GlobalStatus.gs[this.e.ar.g()])) == null) {
                        this.e.processException("获取上传指令数据错误!");
                        return;
                    }

                    NetPacket var3 = new NetPacket((short) 4162, var4);
                    MainCanvas.netUtils.sendPacket(var3);
                    this.e.a((String) null);
                }
            }

        }
    }

    private void m(Graphics var1) {
        if (GlobalStatus.gs != null) {
            if (this.e.aq != null) {
                this.e.aq.a(var1);
            }

            Object var2 = null;
            if (this.aI != null && this.l == 0 && GlobalStatus.gA[this.e.ar.g()] != null && GlobalStatus.gA[this.e.ar.g()].length > 0 && this.e.at.a == 0) {
                Vector var4 = a(GlobalStatus.gA[this.e.ar.g()], GlobalStatus.gB[this.e.ar.g()]);
                if (GlobalStatus.gG[this.e.ar.g()] > 11) {
                    this.a(var1, GlobalConfig.defaultWidth - GlobalConfig.f - 187 - 26, this.e.at.c + 3, 17, 17, 11, 1);
                    this.a(var1, GlobalConfig.defaultWidth - GlobalConfig.f - (GlobalStatus.gG[this.e.ar.g()] - 11) * 17 - 26, this.e.at.c + 24, 17, 17, GlobalStatus.gG[this.e.ar.g()] - 11, 1);
                } else {
                    this.a(var1, GlobalConfig.defaultWidth - GlobalConfig.f - GlobalStatus.gG[this.e.ar.g()] * 17 - 26, this.e.at.c + 3, 17, 17, GlobalStatus.gG[this.e.ar.g()], 1);
                }

                for (byte var3 = 0; var3 < var4.size(); ++var3) {
                    if (GlobalStatus.gG[this.e.ar.g()] > 11) {
                        if (var3 < 11) {
                            MainCanvas.f.a(var1, b(((Short) var4.elementAt(var3)).shortValue()), (int[]) null, (aj) null, 0, 0, GlobalConfig.defaultWidth - GlobalConfig.f - (11 - var3) * 17 - 23, this.e.at.c + 4 + 2, 0, 0);
                        } else {
                            MainCanvas.f.a(var1, b(((Short) var4.elementAt(var3)).shortValue()), (int[]) null, (aj) null, 0, 0, GlobalConfig.defaultWidth - GlobalConfig.f - (GlobalStatus.gG[this.e.ar.g()] - var3) * 17 - 23, this.e.at.c + 4 + 2 + 21, 0, 0);
                        }
                    } else {
                        MainCanvas.f.a(var1, b(((Short) var4.elementAt(var3)).shortValue()), (int[]) null, (aj) null, 0, 0, GlobalConfig.defaultWidth - GlobalConfig.f - (GlobalStatus.gG[this.e.ar.g()] - var3) * 17 - 23, this.e.at.c + 4 + 2, 0, 0);
                    }
                }
            }

            if (this.aI != null && this.l == 0) {
                int var5;
                var5 = (var5 = this.e.ar.b() + 2 + (this.e.ar.g() - this.e.ar.h()) * GlobalConfig.j) + 42 > this.e.ar.b() + this.e.ar.d() ? this.e.ar.b() + this.e.ar.d() - 42 : var5;
                int var7 = GlobalConfig.f + GlobalConfig.realWidth - 50 - 20;
                LoadingPage.a(var1, 1009050, 159, var7, var5, 50, 42);
                var1.setColor(16776960);
                var1.drawRect(var7 - 1, var5 - 1, 51, 43);
                var1.setColor(16777215);
                var1.fillRect(var7 + 4, var5 + 2, 31, 3);
                var1.setColor(0);
                var1.drawRect(var7 + 4, var5 + 2, 31, 3);
                var1.setColor(16711680);
                var1.fillRect(var7 + 1 + 4, var5 + 1 + 2, 30 * GlobalStatus.gD[this.e.ar.g()] / GlobalStatus.gC[this.e.ar.g()], 2);
                var1.setColor(16777215);
                var1.fillRect(var7 + 4, var5 + 7, 31, 3);
                var1.setColor(0);
                var1.drawRect(var7 + 4, var5 + 7, 31, 3);
                var1.setColor(48127);
                var1.fillRect(var7 + 1 + 4, var5 + 1 + 7, 30 * GlobalStatus.gF[this.e.ar.g()] / GlobalStatus.gE[this.e.ar.g()], 2);
                MainCanvas.f.a(var1, (Frame1) this.aI, (int[]) null, 0, 0, var7 + 25 - this.aI.g() / 2, var5 + 21 - this.aI.h() / 2 + 6, 20, 0);
            }

        }
    }

    public final void i(int var1) {
        this.l = 0;
        this.e.aq.b();
        this.e.aq.a("升级技能");
        this.e.aq.a(true);
        this.e.as.a(new String[]{"武功"});
        c_1 var10000 = this.e.ar;
        Image[] var10001 = b(GlobalStatus.dH);
        String[] var10002 = GlobalStatus.dF;
        short[] var2 = GlobalStatus.dG;
        String[] var3 = null;
        if (var2 != null) {
            var3 = new String[var2.length];

            for (int var4 = 0; var4 < var2.length; ++var4) {
                var3[var4] = "" + var2[var4] + "级";
            }
        }

        var10000.a(var10001, var10002, var3, (String[]) null);
        if (GlobalStatus.dI != null && GlobalStatus.dI.length > 0) {
            this.e.ar.a(GlobalStatus.dI[var1], 2);
        }

        this.e.ar.a(var1);
        this.e.au.a("升级");
        this.e.aq.a((al) this.e.as);
        this.e.aq.a((al) this.e.ar);
        if (GlobalConfig.defaultHigh > 220) {
            this.e.aq.a((al) this.e.au);
        }

        this.e.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
        this.j = this.k = 29;
    }

    private void R(int var1) {
        if (this.l == 0) {
            this.a(GlobalStatus.dH);
            if (this.e.aq != null) {
                this.e.ar.a(b(GlobalStatus.dH));
                this.e.aq.b(var1);
            }

            if ((var1 == 1 || var1 == 4 || var1 == 514 || var1 == 520) && GlobalStatus.dI != null) {
                this.e.ar.a(GlobalStatus.dI[this.e.ar.g()], 2);
            }

            if ((var1 == 268435456 || var1 == 1073741824 || var1 == 517) && GlobalStatus.dI != null) {
                this.aE = this.e.ar.g();
                this.aA = this.e.ar.h();
                byte[] var2;
                if ((var2 = NetPayloadBuilder.q((short) 4167, GlobalStatus.ad, GlobalStatus.dE[this.e.ar.g()])) == null) {
                    this.e.processException("获取上传指令数据错误!");
                    return;
                }

                NetPacket var3 = new NetPacket((short) 4167, var2);
                MainCanvas.netUtils.sendPacket(var3);
                this.e.a((String) null);
            } else if (var1 == 536870912 || GlobalStatus.dI == null) {
                this.m();
            }
        }

    }

    public final void a(Graphics var1, int var2, int var3, int var4) {
        if (GlobalStatus.ej != null || var4 != 0) {
            if (GlobalStatus.ep != null || var4 != 1) {
                this.a(var1, var2, var3, 17, 17, GlobalStatus.ej.length, 1);
                short var7 = 0;
                short var5 = 0;

                for (int var6 = 0; var6 < GlobalStatus.ej.length; ++var6) {
                    if (var4 == 0) {
                        var7 = GlobalStatus.en[var6];
                        var5 = (short) GlobalStatus.ej[var6];
                    } else {
                        var7 = GlobalStatus.et[var6];
                        var5 = (short) GlobalStatus.ep[var6];
                    }

                    if (var7 != -1 && var6 >= 0 && var6 < 8) {
                        MainCanvas.f.a(var1, b(var7), (int[]) null, (aj) null, 0, 0, var2 + 3 + var5 * 17, var3 + 3, 0, 0);
                    }

                    if (var6 >= 8) {
                        MainCanvas.f.a(var1, F, (int[]) null, var6 == 8 ? 0 : 2, 0, 0, var2 + 3 + var5 * 17, var3 + 3, 0, 0);
                    }
                }

            }
        }
    }

    private void n(Graphics var1) {
        if (this.f.i != null) {
            var1.setClip(this.aB - 4, this.aC - 4, this.f.a * this.aD / 16 + 7, this.f.b * this.aD / 16 + 7);
            var1.setColor(8947848);
            var1.fillRect(this.aB, this.aC, this.f.a * this.aD / 16, this.f.b * this.aD / 16);
            var1.setColor(14589486);
            var1.drawRect(this.aB - 1, this.aC - 1, this.f.a * this.aD / 16 + 1, this.f.b * this.aD / 16 + 1);
            var1.setColor(8804879);
            var1.drawRect(this.aB - 2, this.aC - 2, this.f.a * this.aD / 16 + 3, this.f.b * this.aD / 16 + 3);
            var1.setColor(7030278);
            var1.drawRect(this.aB - 3, this.aC - 3, this.f.a * this.aD / 16 + 5, this.f.b * this.aD / 16 + 5);
            var1.setColor(2118916);
            if (this.f.i != null) {
                for (int var2 = 0; var2 < this.f.i.length; ++var2) {
                    for (int var3 = 0; var3 < this.f.i[var2].length; ++var3) {
                        if (this.f.i[var2][var3] == 1) {
                            var1.fillRect(this.aB + var2 * this.f.e * this.aD / 16, this.aC + var3 * this.f.f * this.aD / 16, this.f.e * this.aD / 16, this.f.f * this.aD / 16);
                        }
                    }
                }
            }

            if (GlobalStatus.ab != null) {
                var1.setColor(16711680);

                for (int var4 = 0; var4 < GlobalStatus.ab.length; ++var4) {
                    var1.fillRect(this.aB + GlobalStatus.ab[var4] * this.aD / 16, this.aC + GlobalStatus.ac[var4] * this.aD / 16, this.aD, this.aD);
                }
            }

            if (GlobalStatus.t != null) {
                for (int var5 = 0; var5 < GlobalStatus.t.length; ++var5) {
                    if (GlobalStatus.t[var5] != null) {
                        if (GlobalStatus.t[var5].t == -1 && t_2 != null) {
                            MainCanvas.f.a(var1, (Frame1) t_2, (int[]) null, 0, 0, this.aB + GlobalStatus.t[var5].c * this.aD / 16 - 10, this.aC + GlobalStatus.t[var5].d * this.aD / 16 - t_2.j() - 5, 0, 0);
                        } else if (GlobalStatus.t[var5].t == 1 && s != null) {
                            MainCanvas.f.a(var1, (Frame1) s, (int[]) null, 0, 0, this.aB + GlobalStatus.t[var5].c * this.aD / 16 - 10, this.aC + GlobalStatus.t[var5].d * this.aD / 16 - s.j() - 5, 0, 0);
                        }

                        if (GlobalStatus.t[var5].b.length() <= 2) {
                            LoadingPage.a(var1, (String) GlobalStatus.t[var5].b, (int) (this.aB + GlobalStatus.t[var5].c * this.aD / 16), this.aC + GlobalStatus.t[var5].d * this.aD / 16 - GlobalConfig.j - 5, 17, 13883606, 0);
                        } else {
                            LoadingPage.a(var1, (String) (GlobalStatus.t[var5].b.substring(0, 1) + "~"), (int) (this.aB + GlobalStatus.t[var5].c * this.aD / 16), this.aC + GlobalStatus.t[var5].d * this.aD / 16 - GlobalConfig.j - 5, 17, 13883606, 0);
                        }

                        if (bo != null) {
                            MainCanvas.f.a(var1, (Frame1) bo, (int[]) null, 0, 0, this.aB + GlobalStatus.t[var5].c * this.aD / 16, this.aC + GlobalStatus.t[var5].d * this.aD / 16, 0, 0);
                        }
                    }
                }
            }

            var1.setClip(0, 0, GlobalConfig.defaultWidth, GlobalConfig.defaultHigh);
        }
    }

    public final void j(int var1) {
        this.l = 0;
        this.as = var1;
        this.bR = 0L;
        this.e.aq.b();
        this.e.aq.a("宠物列表");
        if (this.as != 4 && this.as != 10 && this.as != 11) {
            if (GlobalStatus.fA != null && GlobalStatus.fA.length > 0) {
                this.am = new String[GlobalStatus.fA.length];

                for (int var4 = 0; var4 < GlobalStatus.fA.length; ++var4) {
                    this.am[var4] = GlobalStatus.fz[var4] == 0 ? "休息" : "出战";
                }

                String[] var5 = new String[GlobalStatus.fB.length];

                for (int var6 = 0; var6 < var5.length; ++var6) {
                    var5[var6] = GlobalStatus.fB[var6] + "(" + GlobalStatus.ge[var6] + "灵)";
                }

                this.e.ar.a((Image[]) null, var5, e(GlobalStatus.fD), this.am);
            } else {
                this.e.ar.a((Image[]) null, (String[]) null, (String[]) null, (String[]) null);
            }

            this.e.at.a(GlobalStatus.fA == null ? "" : GlobalStatus.e((StringBuffer) this.e.l, (int) 0), GlobalConfig.i, (byte) 2);
            this.e.at.a((byte) 1);
            if (GlobalStatus.fE != null) {
                a(GlobalStatus.fE[0], GlobalStatus.fF[0], GlobalStatus.fG[0], GlobalStatus.fH[0]);
                this.aI = MainCanvas.ah.a(String.valueOf(GlobalStatus.fE[0] + "_0"), GlobalStatus.fF[0], GlobalStatus.fG[0], GlobalStatus.fH[0]);
            }
        } else {
            if (GlobalStatus.fw != null && GlobalStatus.fw.length > 0) {
                var1 = GlobalStatus.fw[0];
                this.am = new String[GlobalStatus.fw.length];
                this.al = new String[GlobalStatus.fw.length];
                this.bK = new String[GlobalStatus.fw.length];

                for (int var2 = 0; var2 < GlobalStatus.fw.length; ++var2) {
                    this.am[var2] = GlobalStatus.fB[GlobalStatus.fw[var2]] + "(" + GlobalStatus.ge[GlobalStatus.fw[var2]] + "灵)";
                    this.al[var2] = GlobalStatus.fD[GlobalStatus.fw[var2]] + "级";
                    this.bK[var2] = GlobalStatus.fz[GlobalStatus.fw[var2]] == 0 ? "休息" : "出战";
                }

                this.e.ar.a((Image[]) null, this.am, this.al, this.bK);
                this.e.at.a(GlobalStatus.e(this.e.l, var1), GlobalConfig.i, (byte) 2);
                if (GlobalStatus.fE != null) {
                    a(GlobalStatus.fE[var1], GlobalStatus.fF[var1], GlobalStatus.fG[var1], GlobalStatus.fH[var1]);
                    this.aI = MainCanvas.ah.a(String.valueOf(GlobalStatus.fE[var1] + "_0"), GlobalStatus.fF[var1], GlobalStatus.fG[var1], GlobalStatus.fH[var1]);
                }
            } else {
                this.e.ar.a((Image[]) null, (String[]) null, (String[]) null, (String[]) null);
                this.e.at.a((String) null, GlobalConfig.i, (byte) 2);
                this.aI = null;
            }

            this.e.at.a((byte) 1);
        }

        this.e.au.a("确定");
        this.e.aq.a((al) this.e.ar);
        this.e.aq.a((al) this.e.at);
        if (GlobalConfig.defaultHigh > 220) {
            this.e.aq.a((al) this.e.au);
        }

        this.e.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
        this.j = this.k = 13;
    }

    public final void c(int var1, int var2, int var3) {
        if (var2 > GlobalStatus.fA.length - 1) {
            var2 = 0;
            var3 = 0;
        }

        this.j((int) 0);
        this.e.at.a(GlobalStatus.fA == null ? "" : GlobalStatus.e(this.e.l, var2), GlobalConfig.i, (byte) 2);
        this.e.at.a((byte) 1);
        if (GlobalStatus.fE != null) {
            a(GlobalStatus.fE[var2], GlobalStatus.fF[var2], GlobalStatus.fG[var2], GlobalStatus.fH[var2]);
            this.aI = MainCanvas.ah.a(String.valueOf(GlobalStatus.fE[var2] + "_0"), GlobalStatus.fF[var2], GlobalStatus.fG[var2], GlobalStatus.fH[var2]);
        }

        this.j = this.k = 13;
        this.e.ar.a(var3, var2);
    }

    public final void k(int var1) {
        this.bL = new int[9][2];
        this.bM = new short[9];
        this.bO = new String[9];
        this.bL[0][0] = GlobalStatus.fI[var1];
        this.bL[0][1] = GlobalStatus.fJ[var1];
        this.bL[1][0] = GlobalStatus.fK[var1];
        this.bL[1][1] = GlobalStatus.fL[var1];
        this.bL[2][0] = GlobalStatus.fM[var1];
        this.bL[2][1] = GlobalStatus.fN[var1];
        this.bL[3][0] = GlobalStatus.fO[var1];
        this.bL[3][1] = GlobalStatus.fP[var1];
        this.bL[4][0] = GlobalStatus.fQ[var1];
        this.bL[4][1] = GlobalStatus.fR[var1];
        this.bL[5][0] = GlobalStatus.fS[var1];
        this.bL[5][1] = -1;
        this.bL[6][0] = GlobalStatus.fT[var1];
        this.bL[6][1] = -1;
        this.bL[7][0] = GlobalStatus.fU[var1];
        this.bL[7][1] = -1;
        this.bL[8][0] = GlobalStatus.fV[var1];
        this.bL[8][1] = -1;
        a(GlobalStatus.fE[var1], GlobalStatus.fF[var1], GlobalStatus.fG[var1], GlobalStatus.fH[var1]);
        this.aI = MainCanvas.ah.a(GlobalStatus.fE[var1] + "_0", GlobalStatus.fF[var1], GlobalStatus.fG[var1], GlobalStatus.fH[var1]);

        for (byte var3 = 0; var3 < this.bO.length; ++var3) {
            this.bO[var3] = this.bL[var3][0] + (this.bL[var3][1] != -1 ? "/" + this.bL[var3][1] : "");
        }

        this.e.aq.b();
        this.e.aq.a("宠物属性分配");
        this.e.aq.a(false);
        this.e.ar.a((Image[]) null, this.bN, (String[]) null, this.bO);
        short var2 = MainCanvas.L.c;
        this.e.aq.f = var2;
        this.e.au.a(new String[]{"确定", "取消"});
        this.e.aq.a((al) this.e.ar);
        this.e.aq.a((al) this.e.au);
        this.e.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
        this.j = this.k = 96;
    }

    private short S(int var1) {
        int var2 = 0;

        for (int var3 = 0; var3 < this.bM.length; ++var3) {
            var2 += this.bM[var3];
        }

        return (short) (GlobalStatus.fW[var1] - var2 < 0 ? 0 : GlobalStatus.fW[var1] - var2);
    }

    private void a(byte var1, short var2, int var3, short var4, String var5) {
        byte[] var7;
        if ((var7 = NetPayloadBuilder.a((short) 4253, GlobalStatus.ad, var1, var3, var2, var4, var5)) != null) {
            NetPacket var6 = new NetPacket((short) 4253, var7);
            MainCanvas.netUtils.sendPacket(var6);
        } else {
            this.e.processException("获取上传指令数据错误!");
        }
    }

    public final void c(boolean var1) {
        this.bV = new int[6][4];
        boolean var2 = false;
        ao_1 var3 = this;
        if (var2) {
            this.aq = this.ar = 0;
        } else {
            this.aq = this.cj;
        }

        if (GlobalStatus.jH != null) {
            for (byte var4 = 0; var4 < GlobalStatus.jH.length; ++var4) {
                var3.a(GlobalStatus.jM[var4]);
            }
        }

        this.e.touchPageCase = this.e.k;
        MainCanvas.f.a(this.f, h, i, false, true, 1009050);
        this.j = this.k = 13;
        this.l = 7;
        LoadingPage.l = 0;
    }

    private void T(int var1) {
        if (GlobalStatus.fA != null && GlobalStatus.fA.length > 0) {
            if (this.as != 4 && this.as != 10 && this.as != 11 || GlobalStatus.fw != null && GlobalStatus.fw.length > 0) {
                if (this.e.h) {
                    this.e.h = false;
                    String var4 = this.e.aC.getString();
                    byte[] var47;
                    if ((var47 = NetPayloadBuilder.a((short) 4188, GlobalStatus.ad, (int) GlobalStatus.fA[this.e.ar.g()], (String) var4)) != null) {
                        NetPacket var3 = new NetPacket((short) 4188, var47);
                        MainCanvas.netUtils.sendPacket(var3);
                    } else {
                        this.e.processException("获取上传指令数据错误!");
                    }

                    this.e.a((String) null);
                    this.e.m();
                }

                if (this.l == 0) {
                    if (this.e.aq != null) {
                        this.e.aq.b(var1);
                    }

                    int var22 = 0;
                    if (this.as != 4 && this.as != 10 && this.as != 11) {
                        var22 = this.e.ar.g();
                    } else {
                        var22 = GlobalStatus.fw[this.e.ar.g()];
                    }

                    if (GlobalStatus.gb[var22] != null && GlobalStatus.gb[var22].length > 0 && this.e.at.a == 0) {
                        for (byte var43 = 0; var43 < GlobalStatus.gb[var22].length; ++var43) {
                            this.a(GlobalStatus.gb[var22]);
                        }
                    }

                    if (var1 == 1 || var1 == 514 || var1 == 520 || var1 == 4) {
                        this.e.at.a(GlobalStatus.e(this.e.l, var22), GlobalConfig.i, (byte) 2);
                        this.e.at.a((byte) 1);
                        a(GlobalStatus.fE[var22], GlobalStatus.fF[var22], GlobalStatus.fG[var22], GlobalStatus.fH[var22]);
                        this.aI = MainCanvas.ah.a(String.valueOf(GlobalStatus.fE[var22] + "_0"), GlobalStatus.fF[var22], GlobalStatus.fG[var22], GlobalStatus.fH[var22]);
                    }

                    PngUtil.a(this.aI, this.e.ak);
                    if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                        if (var1 != 536870912 && GlobalStatus.fA != null) {
                            return;
                        }

                        this.al = null;
                        this.am = null;
                        this.bK = null;
                        if (this.as == 0) {
                            if (this.by == 1) {
                                this.N();
                                this.by = 0;
                            } else {
                                this.at();
                                this.c((int) 7);
                            }

                            this.aE = 0;
                        } else if (this.as != 1 && this.as != 6) {
                            if (this.as == 2) {
                                this.l = 5;
                                this.m();
                            } else if (this.as == 4) {
                                this.b((byte) 1, true);
                                this.ar = this.aU;
                                this.e.ax = this.aV;
                            } else if (this.as == 5) {
                                this.m();
                            } else {
                                if (this.as != 10) {
                                    if (this.as == 11) {
                                        this.W.b();
                                    }

                                    return;
                                }

                                this.e(false);
                            }
                        } else {
                            this.m();
                        }
                    } else {
                        this.aA = this.e.ar.h();
                        this.aE = this.e.ar.g();
                        if (this.as == 0) {
                            this.E();
                            this.aE = this.e.ar.g();
                        } else if (this.as == 1) {
                            LoadingPage.a(70 + o, 2 * GlobalConfig.j + 5 + this.e.ar.i() * GlobalConfig.j + p, new String[]{"拍卖"}, false);
                        } else if (this.as == 2) {
                            LoadingPage.a(70 + o, 2 * GlobalConfig.j + 5 + this.e.ar.i() * GlobalConfig.j + p, new String[]{"寄养"}, false);
                        } else if (this.as == 4) {
                            LoadingPage.a(70 + o, 2 * GlobalConfig.j + 5 + this.e.ar.i() * GlobalConfig.j + p, new String[]{"交易"}, false);
                        } else if (this.as == 5) {
                            LoadingPage.a(70 + o, 2 * GlobalConfig.j + 5 + this.e.ar.i() * GlobalConfig.j + p, new String[]{"出售", "取消"}, false);
                        }

                        this.l = 1;
                        if (this.as == 6) {
                            this.l = 0;
                            byte[] var44;
                            if ((var44 = NetPayloadBuilder.v((short) 4191, GlobalStatus.ad, GlobalStatus.fA[this.e.ar.g()])) != null) {
                                MainCanvas.netUtils.sendPacket(new NetPacket((short) 4191, var44));
                                this.e.a((String) null);
                                return;
                            }

                            this.e.processException("获取上传指令数据错误!");
                        } else if (this.as == 10) {
                            this.l = 0;
                            this.c((int) GlobalStatus.fA[GlobalStatus.fw[this.e.ar.g()]], (byte) 0);
                        } else {
                            if (this.as != 11) {
                                return;
                            }

                            this.l = 0;
                            if (cg_1.d) {
                                cg_1.c = var22;
                                byte[] var45;
                                if ((var45 = NetPayloadBuilder.b((byte) 1, cg_1.a, GlobalStatus.fA[var22], 0)) != null) {
                                    NetPacket var8 = new NetPacket((short) 4691, var45);
                                    MainCanvas.netUtils.sendPacket(var8);
                                    this.e.a((String) null);
                                    return;
                                }

                                this.e.processException("获取上传指令数据错误!");
                            } else {
                                cg_1.b = var22;
                                byte[] var46;
                                if ((var46 = NetPayloadBuilder.b((byte) 0, GlobalStatus.fA[var22], -1, 0)) != null) {
                                    NetPacket var9 = new NetPacket((short) 4691, var46);
                                    MainCanvas.netUtils.sendPacket(var9);
                                    this.e.a((String) null);
                                    return;
                                }

                                this.e.processException("获取上传指令数据错误!");
                            }
                        }
                    }
                } else if (this.l == 1) {
                    LoadingPage.b(var1);
                    if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                        if (var1 == 536870912) {
                            this.l = 0;
                            return;
                        }
                    } else if (this.as == 0) {
                        if (LoadingPage.o == 0) {
                            if (GlobalStatus.bC.size() > 0) {
                                this.e((int) 1);
                                return;
                            }

                            this.e.processException("背包中没有物品");
                            return;
                        }

                        if (LoadingPage.o == 1) {
                            this.s(this.e.ar.g());
                            return;
                        }

                        if (LoadingPage.o == 2) {
                            if (GlobalStatus.bC.size() > 0) {
                                this.e((int) 3);
                                return;
                            }

                            this.e.processException("背包中没有物品");
                            return;
                        }

                        if (LoadingPage.o == 3) {
                            if (!GlobalStatus.gf[this.e.ar.g()].equals("")) {
                                this.e.processException("该宠物已经自带星级了，星级为零的宠物才能做主宠。");
                                return;
                            }

                            cg_1.b = this.e.ar.g();
                            this.W.a();
                            byte[] var15;
                            if ((var15 = NetPayloadBuilder.b((byte) 0, GlobalStatus.fA[this.e.ar.g()], -1, 0)) == null) {
                                this.e.processException("获取上传指令数据错误!");
                                return;
                            }

                            NetPacket var36 = new NetPacket((short) 4691, var15);
                            MainCanvas.netUtils.sendPacket(var36);
                            this.e.a((String) null);
                        } else if (LoadingPage.o == 4) {
                            if (GlobalStatus.fz[this.e.ar.g()] == 0) {
                                byte[] var16;
                                if ((var16 = NetPayloadBuilder.h((short) 4163, GlobalStatus.ad, (int) GlobalStatus.fA[this.e.ar.g()])) == null) {
                                    this.e.processException("获取上传指令数据错误!");
                                    return;
                                }

                                NetPacket var37 = new NetPacket((short) 4163, var16);
                                MainCanvas.netUtils.sendPacket(var37);
                                this.e.a((String) null);
                            } else if (GlobalStatus.fz[this.e.ar.g()] == 1) {
                                byte[] var17;
                                if ((var17 = NetPayloadBuilder.i((short) 4164, GlobalStatus.ad, (int) GlobalStatus.fA[this.e.ar.g()])) == null) {
                                    this.e.processException("获取上传指令数据错误!");
                                    return;
                                }

                                NetPacket var38 = new NetPacket((short) 4164, var17);
                                MainCanvas.netUtils.sendPacket(var38);
                                this.e.a((String) null);
                            }
                        } else {
                            if (LoadingPage.o == 5) {
                                this.W(this.e.ar.g());
                                return;
                            }

                            if (LoadingPage.o == 6) {
                                this.e.f("宠物名称");
                                return;
                            }

                            if (LoadingPage.o == 7) {
                                this.aE = this.e.ar.g();
                                this.k(this.e.ar.g());
                                return;
                            }

                            if (LoadingPage.o == 8) {
                                LoadingPage.a(70 + o, 2 * GlobalConfig.j + 5 + this.e.ar.i() * GlobalConfig.j + p, new String[]{"列表", "开灵"}, false);
                                this.l = 9;
                                return;
                            }

                            if (LoadingPage.o == 9) {
                                byte[] var39;
                                if ((var39 = NetPayloadBuilder.z((short) 4613, GlobalStatus.ad, GlobalStatus.fA[this.e.ar.g()])) == null) {
                                    this.e.processException("获取上传指令数据错误!");
                                    return;
                                }

                                NetPacket var52 = new NetPacket((short) 4148, var39);
                                MainCanvas.netUtils.sendPacket(var52);
                                this.e.a((String) null);
                            } else if (LoadingPage.o == 10) {
                                byte[] var18;
                                if ((var18 = NetPayloadBuilder.b(GlobalStatus.fA[this.e.ar.g()])) == null) {
                                    this.e.processException("获取上传指令数据错误!");
                                    return;
                                }

                                NetPacket var40 = new NetPacket((short) 4686, var18);
                                MainCanvas.netUtils.sendPacket(var40);
                                this.e.a((String) null);
                            }
                        }
                    } else {
                        if (this.as == 1) {
                            if (GlobalStatus.fz[this.e.ar.g()] == 1) {
                                this.e.processException("出战宠物不能拍卖");
                                return;
                            }

                            this.l = 3;
                            this.o();
                            return;
                        }

                        if (this.as == 2) {
                            if (LoadingPage.o == 0) {
                                byte[] var19;
                                if ((var19 = NetPayloadBuilder.k((short) 4161, GlobalStatus.ad, (int) GlobalStatus.fA[this.e.ar.g()])) == null) {
                                    this.e.processException("获取上传指令数据错误!");
                                    return;
                                }

                                NetPacket var41 = new NetPacket((short) 4161, var19);
                                MainCanvas.netUtils.sendPacket(var41);
                                this.e.a((String) null);
                            }
                        } else if (this.as == 4) {
                            if (LoadingPage.o == 0) {
                                int var20 = GlobalStatus.fw[this.e.ar.g()];
                                if (GlobalStatus.fz[var20] == 0) {
                                    byte[] var53 = NetPayloadBuilder.i((short) 4172, GlobalStatus.ad, GlobalStatus.fA[var20], this.e.ax % 10);
                                    NetPacket var54 = new NetPacket((short) 4172, var53);
                                    MainCanvas.netUtils.sendPacket(var54);
                                    this.b((byte) 1, true);
                                    this.ar = this.aU;
                                    this.e.ax = this.aV;
                                    this.e.a((String) null);
                                    return;
                                }

                                this.e.processException("出战宠物不能交易");
                            }
                        } else if (this.as == 5) {
                            if (LoadingPage.o == 0) {
                                if (GlobalStatus.fz[this.e.ar.g()] != 0) {
                                    this.e.processException("出战宠物不能出售");
                                    return;
                                }

                                byte[] var21;
                                if ((var21 = NetPayloadBuilder.r((short) 4146, GlobalStatus.ad, GlobalStatus.fA[this.e.ar.g()])) == null) {
                                    this.e.processException("获取上传指令数据错误!");
                                    return;
                                }

                                NetPacket var42 = new NetPacket((short) 4146, var21);
                                MainCanvas.netUtils.sendPacket(var42);
                                this.e.a((String) null);
                            } else if (LoadingPage.o == 1) {
                                this.l = 0;
                                return;
                            }
                        }
                    }
                } else if (this.l == 2) {
                    LoadingPage.b(var1);
                    if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                        if (var1 == 536870912) {
                            this.E();
                            this.l = 1;
                            return;
                        }
                    } else if (LoadingPage.o == 1) {
                        byte[] var14;
                        if ((var14 = NetPayloadBuilder.g((short) 4165, GlobalStatus.ad, (int) GlobalStatus.fA[this.e.ar.g()])) == null) {
                            this.e.processException("获取上传指令数据错误!");
                            return;
                        }

                        NetPacket var35 = new NetPacket((short) 4165, var14);
                        MainCanvas.netUtils.sendPacket(var35);
                        this.e.a((String) null);
                    } else if (LoadingPage.o == 0) {
                        this.E();
                        this.l = 1;
                        return;
                    }
                } else if (this.l == 3) {
                    if (var1 != 268435456 && var1 != 1073741824) {
                        if (var1 != 1073741824) {
                            if (var1 == 536870912) {
                                this.e.o();
                                LoadingPage.a(70 + o, 2 * GlobalConfig.j + 5 + this.e.ar.i() * GlobalConfig.j + p, new String[]{"拍卖"}, false);
                                this.l = 1;
                                return;
                            }

                            this.d(var1);
                            return;
                        }
                    } else {
                        if (this.n() == -1L) {
                            this.e.processException("输入有误,请重新输入");
                            return;
                        }

                        try {
                            this.bR = this.n();
                            if (this.bR <= 999999999L) {
                                this.l = 4;
                                LoadingPage.h = 0;
                                return;
                            }

                            this.e.processException("价格太高,请重新输入!");
                        } catch (Exception var5) {
                            this.e.processException("输入有误,请重新输入");
                            return;
                        }
                    }
                } else if (this.l == 4) {
                    if (var1 != 268435456 && var1 != 1073741824) {
                        if (var1 == 536870912) {
                            this.l = 3;
                            this.o();
                            return;
                        }
                    } else {
                        byte[] var13;
                        if ((var13 = NetPayloadBuilder.a((short) 4148, GlobalStatus.ad, GlobalStatus.fA[this.e.ar.g()], (int) 1, this.bR)) == null) {
                            this.e.processException("获取上传指令数据错误!");
                            return;
                        }

                        NetPacket var34 = new NetPacket((short) 4148, var13);
                        MainCanvas.netUtils.sendPacket(var34);
                        this.e.a((String) null);
                    }
                } else if (this.l == 7) {
                    this.a(GlobalStatus.jK);
                    PngUtil.a(this.aI, this.e.ak);
                    if (var1 != 8 && var1 != 516) {
                        if (var1 != 2 && var1 != 518) {
                            if (var1 == 536870912) {
                                this.c((int) 0, (int) this.aE, (int) this.aA);
                                this.E();
                                LoadingPage.o = 9;
                                this.l = 1;
                            } else {
                                if (var1 != 268435456 && var1 != 517 && var1 != 1073741824) {
                                    return;
                                }

                                this.cj = (byte) this.aq;
                                if (this.U(this.aq) < 0) {
                                    this.e((int) 9);
                                    return;
                                }

                                LoadingPage.a((GlobalConfig.defaultWidth - GlobalConfig.i.stringWidth("操作") - 20) / 2, (GlobalConfig.defaultHigh - (GlobalConfig.j + 3) * 6) / 2, new String[]{"查看", "更换", "卸下", "升星", "洗炼", "附魔"}, true);
                                this.l = 8;
                            }
                        } else {
                            this.aq = this.aq + 1 > 5 ? 0 : this.aq + 1;
                            LoadingPage.l = 0;
                        }
                    } else {
                        this.aq = this.aq - 1 < 0 ? 5 : this.aq - 1;
                        LoadingPage.l = 0;
                    }
                } else if (this.l == 8) {
                    LoadingPage.b(var1);
                    if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                        if (var1 == 536870912) {
                            this.c(false);
                            return;
                        }
                    } else {
                        if (LoadingPage.o == 0) {
                            GlobalStatus.b((int) l(this.aq));
                            this.O.a(0, (short) this.k, this.as);
                            return;
                        }

                        if (LoadingPage.o == 1) {
                            this.e((int) 9);
                            return;
                        }

                        if (LoadingPage.o == 2) {
                            byte var24;
                            if ((var24 = l(this.aq)) >= 0 && var24 <= 6) {
                                byte[] var48;
                                if ((var48 = NetPayloadBuilder.d((short) 4615, GlobalStatus.ad, GlobalStatus.jG, (byte) var24)) == null) {
                                    this.e.processException("获取上传指令数据错误!");
                                    return;
                                }

                                NetPacket var49 = new NetPacket((short) 4614, var48);
                                MainCanvas.netUtils.sendPacket(var49);
                                this.e.a((String) null);
                            } else {
                                this.e.processException("卸下失败");
                            }
                        } else if (LoadingPage.o == 3) {
                            this.aJ = true;
                            ch.a();
                            int var2 = -1;

                            for (int var25 = 0; var25 < GlobalStatus.jH.length; ++var25) {
                                if (n(GlobalStatus.jJ[var25]) == this.aq) {
                                    var2 = GlobalStatus.jH[var25];
                                    break;
                                }
                            }

                            Object var26 = null;
                            byte[] var27;
                            if ((var27 = NetPayloadBuilder.a((short) 4689, var2, (byte) 0, (byte) -1, GlobalStatus.ad)) == null) {
                                this.e.processException("获取上传指令数据错误!");
                                return;
                            }

                            NetPacket var6 = new NetPacket((short) 4689, var27);
                            MainCanvas.netUtils.sendPacket(var6);
                            this.e.a((String) null);
                        } else if (LoadingPage.o == 4) {
                            this.aJ = true;
                            this.O.d();
                            int var10 = -1;

                            for (int var28 = 0; var28 < GlobalStatus.jH.length; ++var28) {
                                if (n(GlobalStatus.jJ[var28]) == this.aq) {
                                    var10 = GlobalStatus.jH[var28];
                                    break;
                                }
                            }

                            o_1.h = 2;
                            byte[] var29;
                            if ((var29 = NetPayloadBuilder.a((short) 4688, var10, -1L, (byte) 0, o_1.h, GlobalStatus.jG, (byte[]) null, GlobalStatus.ad)) == null) {
                                this.e.processException("获取上传指令数据错误!");
                                return;
                            }

                            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4688, var29));
                            this.e.a((String) null);
                        } else if (LoadingPage.o == 5) {
                            if (this.P == null) {
                                this.P = new r(this, this.e, MainCanvas.f);
                            }

                            this.P.b();
                            this.aJ = true;
                            int var11 = -1;

                            for (int var30 = 0; var30 < GlobalStatus.jH.length; ++var30) {
                                if (n(GlobalStatus.jJ[var30]) == this.aq) {
                                    var11 = GlobalStatus.jH[var30];
                                    break;
                                }
                            }

                            byte[] var31;
                            if ((var31 = NetPayloadBuilder.a((short) 4262, var11, -1L, (byte) 0, (int[]) null, (byte[]) null, -1, (byte) 0, GlobalStatus.ad)) == null) {
                                this.e.processException("获取上传指令数据错误!");
                                return;
                            }

                            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4262, var31));
                            this.e.a((String) null);
                        }
                    }
                } else if (this.l == 9) {
                    LoadingPage.b(var1);
                    if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                        if (var1 == 536870912) {
                            this.E();
                            LoadingPage.o = 8;
                            this.l = 1;
                            return;
                        }
                    } else if (LoadingPage.o == 0) {
                        int var12 = this.e.ar.g();
                        this.ay = var12;
                        if (GlobalStatus.fz[this.e.ar.g()] == 0) {
                            byte[] var32 = NetPayloadBuilder.u((short) 4189, GlobalStatus.ad, GlobalStatus.fA[this.e.ar.g()]);
                            NetPacket var7 = new NetPacket((short) 4189, var32);
                            MainCanvas.netUtils.sendPacket(var7);
                            this.e.a((String) null);
                        } else {
                            if (GlobalStatus.cR != null && GlobalStatus.cR.length > 0) {
                                this.a(false, false);
                                return;
                            }

                            this.e.processException("宠物没有技能!");
                        }
                    } else if (LoadingPage.o == 1) {
                        this.cj = (byte) this.aq;
                        this.e((int) 14);
                        return;
                    }
                } else if (this.l == 10) {
                    if (this.e.aq != null) {
                        this.e.aq.b(var1);
                    }

                    if (var1 == 536870912) {
                        this.l = 8;
                        return;
                    }
                } else if (this.l == 11) {
                    if (var1 == 268435456) {
                        int var33 = GlobalStatus.fA[this.e.ar.g()];
                        byte[] var50;
                        if ((var50 = NetPayloadBuilder.a(var33)) == null) {
                            this.e.processException("获取上传指令数据错误!");
                            return;
                        }

                        NetPacket var51 = new NetPacket((short) 4682, var50);
                        MainCanvas.netUtils.sendPacket(var51);
                        this.e.a((String) null);
                    } else if (var1 == 536870912) {
                        this.l = 0;
                    }
                }

            }
        } else {
            this.e.touchPageCase = this.e.k;
            this.N();
        }
    }

    private byte U(int var1) {
        if (GlobalStatus.jJ == null) {
            return -1;
        } else {
            for (byte var2 = 0; var2 < GlobalStatus.jJ.length; ++var2) {
                if (n(GlobalStatus.jJ[var2]) == var1) {
                    return var2;
                }
            }

            return -1;
        }
    }

    private static byte n(byte var0) {
        if (var0 == 0) {
            return 3;
        } else if (var0 == 1) {
            return 1;
        } else if (var0 == 2) {
            return 4;
        } else if (var0 == 3) {
            return 0;
        } else if (var0 == 4) {
            return 2;
        } else {
            return (byte) (var0 == 5 ? 5 : 0);
        }
    }

    public static byte l(int var0) {
        if (var0 == 3) {
            return 0;
        } else if (var0 == 1) {
            return 1;
        } else if (var0 == 4) {
            return 2;
        } else if (var0 == 0) {
            return 3;
        } else if (var0 == 2) {
            return 4;
        } else {
            return (byte) (var0 == 5 ? 5 : -1);
        }
    }

    private void V(int var1) {
        byte var2;
        if ((var2 = l((int) this.cj)) >= 0 && var2 <= 6) {
            byte[] var3;
            if ((var3 = NetPayloadBuilder.b((short) 4614, GlobalStatus.ad, GlobalStatus.jG, var1, (byte) var2)) != null) {
                NetPacket var4 = new NetPacket((short) 4614, var3);
                MainCanvas.netUtils.sendPacket(var4);
                this.e.a((String) null);
            } else {
                this.e.processException("获取上传指令数据错误!");
            }
        } else {
            this.e.processException("装备失败");
        }
    }

    public final void E() {
        if (GlobalStatus.fz[this.e.ar.g()] == 0) {
            LoadingPage.a(70 + o, 2 * GlobalConfig.j + 5 + this.e.ar.i() * GlobalConfig.j + p, new String[]{"喂养", "附魂", "学习", "继承", "出战", "状态", "改名", "配点", "技能", "装备", "炼化"}, false);
        } else {
            LoadingPage.a(70 + o, 2 * GlobalConfig.j + 5 + this.e.ar.i() * GlobalConfig.j + p, new String[]{"喂养", "附魂", "学习", "继承", "休息", "状态", "改名", "配点", "技能", "装备", "炼化"}, false);
        }
    }

    private void o(Graphics var1) {
        Object var2 = null;
        if (GlobalStatus.fA != null) {
            if (this.as != 4 || GlobalStatus.fw != null && GlobalStatus.fw.length > 0) {
                int var3 = 0;
                if (this.l != 7 && this.l != 8 && this.l != 10) {
                    if (this.e.aq != null) {
                        this.e.aq.a(var1);
                    }

                    if (this.as != 4 && this.as != 10 && this.as != 11) {
                        var3 = this.e.ar.g();
                    } else {
                        var3 = GlobalStatus.fw[this.e.ar.g()];
                    }

                    if (this.aI != null && this.l == 0 && GlobalStatus.gb[var3] != null && GlobalStatus.gb[var3].length > 0 && this.e.at.a == 0) {
                        Vector var5 = a(GlobalStatus.gb[var3], GlobalStatus.gd[var3]);
                        if (GlobalStatus.ge[var3] > 11) {
                            this.a(var1, GlobalConfig.defaultWidth - GlobalConfig.f - 187 - 26, this.e.at.c + 3, 17, 17, 11, 1);
                            this.a(var1, GlobalConfig.defaultWidth - GlobalConfig.f - (GlobalStatus.ge[var3] - 11) * 17 - 26, this.e.at.c + 24, 17, 17, GlobalStatus.ge[var3] - 11, 1);
                        } else {
                            this.a(var1, GlobalConfig.defaultWidth - GlobalConfig.f - GlobalStatus.ge[var3] * 17 - 26, this.e.at.c + 3, 17, 17, GlobalStatus.ge[var3], 1);
                        }

                        for (byte var4 = 0; var4 < var5.size(); ++var4) {
                            if (GlobalStatus.ge[var3] > 11) {
                                if (var4 < 11) {
                                    MainCanvas.f.a(var1, b(((Short) var5.elementAt(var4)).shortValue()), (int[]) null, (aj) null, 0, 0, GlobalConfig.defaultWidth - GlobalConfig.f - (11 - var4) * 17 - 23, this.e.at.c + 4 + 2, 0, 0);
                                } else {
                                    MainCanvas.f.a(var1, b(((Short) var5.elementAt(var4)).shortValue()), (int[]) null, (aj) null, 0, 0, GlobalConfig.defaultWidth - GlobalConfig.f - (GlobalStatus.ge[var3] - var4) * 17 - 23, this.e.at.c + 4 + 2 + 21, 0, 0);
                                }
                            } else {
                                MainCanvas.f.a(var1, b(((Short) var5.elementAt(var4)).shortValue()), (int[]) null, (aj) null, 0, 0, GlobalConfig.defaultWidth - GlobalConfig.f - (GlobalStatus.ge[var3] - var4) * 17 - 23, this.e.at.c + 4 + 2, 0, 0);
                            }
                        }
                    }
                }

                if (this.as == 4) {
                    var3 = GlobalStatus.fw[this.e.ar.g()];
                } else {
                    var3 = this.e.ar.g();
                }

                if (this.aI != null && this.l == 0) {
                    int var12 = 0;
                    int var6 = 0;
                    var6 = (var6 = this.e.ar.b() + 2 + (this.e.ar.g() - this.e.ar.h() + 1) * GlobalConfig.j) + 50 > this.e.ar.b() + this.e.ar.d() ? this.e.ar.b() + this.e.ar.d() - 50 : var6;
                    var12 = this.e.ar.a() + this.e.ar.c() - 50 - 20;
                    LoadingPage.a(var1, 1009050, 159, var12, var6, 50, 50);
                    var1.setColor(16776960);
                    var1.drawRect(var12 - 1, var6 - 1, 51, 51);
                    var1.setColor(16777215);
                    var1.fillRect(var12 + 9, var6 + 2, 31, 3);
                    var1.setColor(0);
                    var1.drawRect(var12 + 9, var6 + 2, 31, 3);
                    var1.setColor(16711680);
                    var1.fillRect(var12 + 1 + 9, var6 + 1 + 2, 30 * GlobalStatus.fI[var3] / GlobalStatus.fJ[var3], 2);
                    var1.setColor(16777215);
                    var1.fillRect(var12 + 9, var6 + 7, 31, 3);
                    var1.setColor(0);
                    var1.drawRect(var12 + 9, var6 + 7, 31, 3);
                    var1.setColor(48127);
                    var1.fillRect(var12 + 1 + 9, var6 + 1 + 7, 30 * GlobalStatus.fK[var3] / GlobalStatus.fL[var3], 2);
                    MainCanvas.f.a(var1, (Frame1) this.aI, (int[]) null, 0, 0, var12 + 25 - this.aI.g() / 2, var6 + 50 - this.aI.h() - 3, 20, 0);
                }

                if (this.l != 1 && this.l != 2 && this.l != 9) {
                    if (this.l == 3) {
                        this.b(var1, "请输入拍卖价格:");
                    } else if (this.l == 4) {
                        LoadingPage.a(var1, "您确定以" + this.bR + "两的价格拍卖此宠物1只?", new String[]{"确定", "取消"});
                    } else if (this.l == 6) {
                        this.a((Graphics) var1, (int) 1);
                    } else if (this.l == 7) {
                        this.a(var1, this.aI);
                    } else if (this.l == 8) {
                        this.a(var1, this.aI);
                        LoadingPage.c(var1);
                    } else {
                        if (this.l == 10) {
                            if (this.e.aq != null) {
                                this.e.aq.a(30);
                                this.e.aq.a(var1);
                                LoadingPage.a(var1, this.e.aq.a + 5, this.e.aq.b + 32, this.e.aq.c - 11, 30, 1);
                                LoadingPage.a(var1, (String) "宝石", (int) (this.e.aq.a + 10), this.e.aq.b + 35 + GlobalConfig.a(25), 20, 16776960, 0);
                            }

                            if (GlobalStatus.jM != null) {
                                for (int var14 = 0; var14 < GlobalStatus.jH.length; ++var14) {
                                    if (n(GlobalStatus.jJ[var14]) == this.aq && GlobalStatus.jM[var14] != null) {
                                        this.a(var1, this.e.aq.a + 10 + GlobalConfig.i.stringWidth("宝石:"), this.e.aq.b + 37, 17, 17, GlobalStatus.jM[var14].length, 1);

                                        for (byte var9 = 0; var9 < GlobalStatus.jM[var14].length; ++var9) {
                                            if (GlobalStatus.jM[var14][var9] <= -1) {
                                                LoadingPage.a(var1, 125269879, 207, this.e.aq.a + 10 + GlobalConfig.i.stringWidth("宝石:") + 2 + var9 * 17, this.e.aq.b + 39, 17, 17);
                                            }

                                            if (GlobalStatus.jM[var14][var9] > 0) {
                                                MainCanvas.f.a(var1, b(GlobalStatus.jM[var14][var9]), (int[]) null, (aj) null, 0, 0, this.e.aq.a + 10 + GlobalConfig.i.stringWidth("宝石:") + 2 + var9 * 17, this.e.aq.b + 39, 0, 0);
                                            }

                                            var1.setColor(16776960);
                                            var1.drawRect(this.e.aq.a + 10 + GlobalConfig.i.stringWidth("宝石:") + 2 + var9 * 17, this.e.aq.b + 39, 17, 17);
                                        }
                                    }
                                }

                                return;
                            }
                        } else if (this.l == 11) {
                            String var15 = "炼化条件:" + GlobalStatus.nC[0] + "\t";
                            var15 = var15 + "炼化所得:" + GlobalStatus.nC[2] + "\t";
                            var15 = var15 + "消耗:" + GlobalStatus.nC[1] + "\t";
                            LoadingPage.a(var1, var15, new String[]{"确定", "取消"});
                        }

                    }
                } else {
                    LoadingPage.c(var1);
                }
            }
        }
    }

    private static Vector a(short[] var0, byte[] var1) {
        Vector var2 = null;
        if (var0 != null) {
            var2 = new Vector();

            for (int var3 = 0; var3 < var0.length; ++var3) {
                if (var1[var3] == 1) {
                    var2.addElement(new Short(var0[var3]));
                }
            }
        }

        return var2;
    }

    private void W(int var1) {
        GlobalConfig.clearStr(this.e.l);
        this.e.l.append("名称：" + GlobalStatus.fB[var1] + '\t');
        this.e.l.append("星级:").append(GlobalStatus.gf[var1]).append('\t');
        this.e.l.append("种类：" + GlobalStatus.fC[var1] + '\t');
        this.e.l.append("级别：" + GlobalStatus.fD[var1] + '\t');
        this.e.l.append("经验：" + (GlobalStatus.fY[var1] - GlobalStatus.ga[var1]) + '/' + (GlobalStatus.fZ[var1] - GlobalStatus.ga[var1]) + '\t');
        this.e.l.append("生命：" + GlobalStatus.fI[var1] + '/' + GlobalStatus.fJ[var1] + '\t');
        this.e.l.append("内力：" + GlobalStatus.fK[var1] + '/' + GlobalStatus.fL[var1] + '\t');
        this.e.l.append("物攻：" + GlobalStatus.fM[var1] + '/' + GlobalStatus.fN[var1] + '\t');
        this.e.l.append("法攻：" + GlobalStatus.fO[var1] + '/' + GlobalStatus.fP[var1] + '\t');
        this.e.l.append("防御：" + GlobalStatus.fQ[var1] + '/' + GlobalStatus.fR[var1] + '\t');
        this.e.l.append("速度：" + GlobalStatus.fS[var1] + '\t');
        this.e.l.append("冰抗：" + GlobalStatus.fT[var1] + '\t');
        this.e.l.append("火抗：" + GlobalStatus.fU[var1] + '\t');
        this.e.l.append("雷抗：" + GlobalStatus.fV[var1] + '\t');
        this.e.l.append(GlobalStatus.fX[var1]);
        if (GlobalStatus.gc != null && GlobalStatus.gc[var1] != null && GlobalStatus.gc[var1].length > 0) {
            for (byte var2 = 0; var2 < GlobalStatus.gc[var1].length; ++var2) {
                this.e.l.append((var2 == 0 ? "技能：" : "，") + GlobalStatus.gc[var1][var2]);
                if (var2 == GlobalStatus.gc[var1].length - 1) {
                    this.e.l.append("\t");
                }
            }
        }

        if (GlobalStatus.gh[var1] != null) {
            this.e.l.append("技能附魂:");

            for (int var3 = 0; var3 < GlobalStatus.gh[var1].length; ++var3) {
                if (GlobalStatus.gh[var1][var3] != null) {
                    this.e.l.append(GlobalStatus.gh[var1][var3]);
                    this.e.l.append(",");
                }
            }

            this.e.l.append('\t');
        }

        if (GlobalStatus.gl[var1] != null) {
            this.e.l.append("状态附魂:");

            for (int var4 = 0; var4 < GlobalStatus.gl[var1].length; ++var4) {
                if (GlobalStatus.gl[var1][var4] != null) {
                    this.e.l.append(GlobalStatus.gl[var1][var4]);
                    this.e.l.append(",");
                }
            }

            this.e.l.append('\t');
        }

        this.e.aq.j();
        this.e.aq.a("宠物属性");
        this.e.aq.a(true);
        this.e.at.a(this.e.l.toString(), GlobalConfig.i, (byte) 2);
        this.e.aq.a((al) this.e.at);
        this.e.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
        this.j = this.k = 95;
    }

    private void X(int var1) {
        if (this.e.aq != null) {
            this.e.aq.b(var1);
        }

        if (var1 == 268435456 || var1 == 536870912) {
            this.c((int) 0, (int) this.aE, (int) this.aA);
            LoadingPage.o = 5;
            this.l = 1;
        }

    }

    private void p(Graphics var1) {
        if (this.e.aq != null) {
            this.e.aq.a(var1);
        }

    }

    public final void F() {
        this.l = 0;
        this.e.aw = 0;
        LoadingPage.l = 0;
        this.aq = this.ar = 0;
        this.e.aq.b();
        this.e.aq.a("买东西");
        this.e.aq.a(true);
        this.e.as.a(new String[]{"货柜一"});
        this.e.as.a((byte) 1);
        this.e.aq.a(GlobalConfig.realHigh <= 240 ? 79 : 120);
        if (GlobalStatus.bY != null && GlobalStatus.bY.length > 0) {
            this.e.at.a(Y((this.ar << 3) + this.aq), GlobalConfig.i, (byte) 1);
        } else {
            this.e.at.a("没有物品,按3、9键可以上下翻滚此属性描述框", GlobalConfig.i, (byte) 1);
        }

        this.e.at.a((byte) 1);
        this.e.au.a("");
        this.e.aq.a((al) this.e.as);
        this.e.aq.a((al) this.e.at);
        this.e.aq.a((al) this.e.au);
        this.e.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
        this.e.touchPageCase = this.e.k;
        this.j = this.k = 8;
    }

    private static String Y(int var0) {
        StringBuffer var1 = new StringBuffer();
        if (GlobalStatus.cc[var0] > 0 || GlobalStatus.cd[var0] > 0) {
            var1.append("攻击:");
            var1.append(GlobalStatus.cc[var0]);
            var1.append('-');
            var1.append(GlobalStatus.cd[var0]);
            var1.append('\t');
        }

        if (GlobalStatus.ce[var0] > 0 || GlobalStatus.cf[var0] > 0) {
            var1.append("法攻:");
            var1.append(GlobalStatus.ce[var0]);
            var1.append('-');
            var1.append(GlobalStatus.cf[var0]);
            var1.append('\t');
        }

        if (GlobalStatus.cg[var0] > 0 || GlobalStatus.ch[var0] > 0) {
            var1.append("防御:");
            var1.append(GlobalStatus.cg[var0]);
            var1.append('-');
            var1.append(GlobalStatus.ch[var0]);
            var1.append('\t');
        }

        if (GlobalStatus.ci[var0] > 0 && GlobalStatus.ci[var0] == GlobalStatus.cj[var0] && GlobalStatus.cj[var0] == GlobalStatus.ck[var0]) {
            var1.append("冰火雷抗:");
            var1.append(GlobalStatus.ci[var0]);
            var1.append('\t');
        } else {
            if (GlobalStatus.ci[var0] > 0) {
                var1.append("冰抗:");
                var1.append(GlobalStatus.ci[var0]);
                if (GlobalStatus.cj[var0] <= 0 && GlobalStatus.ck[var0] <= 0) {
                    var1.append('\t');
                } else {
                    var1.append(' ');
                }
            }

            if (GlobalStatus.cj[var0] > 0) {
                var1.append("火抗:");
                var1.append(GlobalStatus.cj[var0]);
                if (GlobalStatus.ck[var0] <= 0) {
                    var1.append('\t');
                } else {
                    var1.append(' ');
                }
            }

            if (GlobalStatus.ck[var0] > 0) {
                var1.append("雷抗:");
                var1.append(GlobalStatus.ck[var0]);
                var1.append('\t');
            }
        }

        if (GlobalStatus.cn[var0] > 0) {
            var1.append("速度:");
            var1.append(GlobalStatus.cn[var0]);
            var1.append('\t');
        }

        if (GlobalStatus.cl[var0] > 0) {
            var1.append("增加HP:");
            var1.append(GlobalStatus.cl[var0]);
            var1.append('\t');
        }

        if (GlobalStatus.cm[var0] > 0) {
            var1.append("增加MP:");
            var1.append(GlobalStatus.cm[var0]);
            var1.append('\t');
        }

        if (GlobalStatus.co[var0] > 0) {
            var1.append("等级:");
            var1.append(GlobalStatus.co[var0]);
            var1.append('\t');
        }

        if (GlobalStatus.cq[var0] != null) {
            var1.append(GlobalStatus.cq[var0]);
            var1.append('\t');
        }

        return var1.toString();
    }

    private void aG() {
        if (GlobalStatus.bY != null && (this.ar << 3) + this.aq < GlobalStatus.bY.length) {
            this.e.at.a(Y((this.ar << 3) + this.aq), GlobalConfig.i, (byte) 1);
        } else {
            this.e.at.a("没有商品,按3、9键可以上下翻滚此属性描述框", GlobalConfig.i, (byte) 1);
        }

        this.e.at.a((byte) 1);
        LoadingPage.l = 0;
    }

    private void Z(int var1) {
        int var2 = 0;
        if (GlobalStatus.bW) {
            var2 = GlobalStatus.bX;
        } else {
            var2 = GlobalStatus.t[this.af].a;
        }

        byte[] var3;
        if ((var3 = NetPayloadBuilder.a((short) 4138, GlobalStatus.ad, (int) var2, (int) GlobalStatus.bY[(this.ar << 3) + this.aq], (byte) ((byte) var1))) != null) {
            NetPacket var4 = new NetPacket((short) 4138, var3);
            MainCanvas.netUtils.sendPacket(var4);
            this.e.a((String) null);
        } else {
            this.e.processException("获取上传指令数据错误!");
        }
    }

    private void q(Graphics var1) {
        if (this.e.aq != null) {
            int var2 = GlobalConfig.realHigh <= 240 ? 79 : 120;
            this.e.aq.a(var2);
            this.e.aq.a(var1);
            LoadingPage.a(var1, this.e.aq.a + 5, this.e.aq.b + 29 + this.e.as.b, this.e.aq.c - 11, var2, 1);
            LoadingPage.a(var1);
            var2 = (this.e.aq.c - 11 - (x.b << 3)) / 9;
            int var3 = ((GlobalConfig.realHigh <= 240 ? 79 : 120) - 6 - (x.b << 2)) / 5;
            int var4 = this.e.aq.a + 8 + var2;
            int var5 = this.e.aq.b + 33 + this.e.as.b + var3;

            for (int var6 = 0; var6 < 32; ++var6) {
                MainCanvas.f.a(var1, x, (int[]) null, (aj) null, 0, 0, var6 % 8 * (x.b + var2) + var4, var6 / 8 * (x.b + var3) + var5, 0, 0);
                this.a((int) var6, var6 % 8 * (x.b + var2) + var4, var6 / 8 * (x.b + var3) + var5, (int) x.b, (int) x.c);
            }

            int var9 = -1;

            for (int var7 = 0; var7 < GlobalStatus.cb.length; ++var7) {
                MainCanvas.f.a(var1, b(GlobalStatus.cb[var7]), (int[]) null, (aj) null, 0, 0, var7 % 8 * (x.b + var2) + var4 + 1, var7 / 8 * (x.b + var3) + var5 + 1, 0, 0);
                if (var7 == (this.ar << 3) + this.aq) {
                    var9 = var7;
                }
            }

            var1.setColor(13172693);
            LoadingPage.d(var1, var4 + this.aq * (x.b + var2) - 1, var5 + this.ar * (x.b + var3) - 1, 19, 19);
            if (var9 >= 0 && var9 < GlobalStatus.cb.length) {
                LoadingPage.a(var1, GlobalStatus.bZ[var9], GlobalStatus.cp[var9], var4 + this.aq * (x.b + var2) + x.b / 2, var5 + this.ar * (x.b + var3) + x.b / 2);
            }

            this.a(var1, GlobalStatus.ap, GlobalConfig.defaultWidth / 2 + x.b, this.e.au.a() + GlobalConfig.a(MainCanvas.E.c));
            MainCanvas.f.a(var1, w, (int[]) null, (aj) null, 0, 0, GlobalConfig.a(GlobalConfig.defaultWidth, this.e.l.toString()) - x.b, this.e.au.a() + 4, 0, 0);
        }

        if (this.l == 2) {
            this.a(var1, "数量");
        }

    }

    private void a(Graphics var1, long var2, int var4, int var5) {
        GlobalConfig.a(this.e.l, var2);
        LoadingPage.a(var1, (String) this.e.l.toString(), (int) var4, var5, 17, 16776917, 0);
    }

    public static String a(StringBuffer var0, long var1) {
        var0.delete(0, var0.capacity());
        var0.append(GlobalStatus.a(var1));
        if (var0.length() > 5) {
            var0.delete(5, var0.length());
            var0.append("..");
        }

        return var0.toString();
    }

    private void aa(int var1) {
        if (this.l == 0) {
            this.aV();
            if (this.e.aq != null) {
                this.e.aq.b(var1);
            }

            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    this.al = null;
                    this.m();
                    return;
                }

                if (var1 == 1024 || var1 == 2048) {
                    this.q();
                    return;
                }

                if (var1 != 8 && var1 != 516) {
                    if (var1 != 2 && var1 != 518) {
                        if (var1 != 1 && var1 != 514) {
                            if (var1 != 4 && var1 != 520) {
                                return;
                            }

                            this.ar = this.ar >= 3 ? 0 : ++this.ar;
                            this.s();
                            return;
                        }

                        this.ar = this.ar <= 0 ? 3 : --this.ar;
                        this.s();
                        return;
                    }

                    this.aq = this.aq >= 7 ? 0 : ++this.aq;
                    this.s();
                    return;
                }

                this.aq = this.aq <= 0 ? 7 : --this.aq;
                this.s();
                return;
            } else {
                bn var2;
                if ((var2 = this.y((this.ar << 3) + this.aq)) == null || var2.a <= 0 || this.A((this.ar << 3) + this.aq) == null) {
                    return;
                }

                if (var2.g > 1) {
                    this.a((long) var2.g);
                    this.l = 2;
                } else {
                    this.aE = this.aq;
                    this.aG = this.ar;
                    if (var2.r == 0) {
                        this.m((int) 1);
                        return;
                    }

                    this.e.a((String) "重要物品输入OK卖出", (int) 0);
                    this.ag = 1;
                }
            }
        } else if (this.l == 2) {
            this.b(var1);
            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    this.l = 0;
                }
            } else {
                this.aE = this.aq;
                this.aG = this.ar;
                if (this.y((this.ar << 3) + this.aq).r == 0) {
                    this.m(this.ag);
                    return;
                }

                this.e.a((String) "重要物品输入OK卖出", (int) 0);
            }
        }

    }

    public final void m(int var1) {
        byte[] var2;
        if ((var2 = NetPayloadBuilder.d((short) 4139, GlobalStatus.ad, this.z((this.ar << 3) + this.aq), (int) var1)) != null) {
            NetPacket var3 = new NetPacket((short) 4139, var2);
            MainCanvas.netUtils.sendPacket(var3);
            this.e.a((String) null);
        } else {
            this.e.processException("获取上传指令数据错误!");
        }
    }

    public final void n(int var1) {
        this.l = 0;
        this.e.aw = 0;
        this.as = var1;
        LoadingPage.l = 0;
        this.e.aq.b();
        this.e.aq.a("");
        this.e.aq.a(true);
        this.e.as.a(new String[]{" 一 ", " 二 ", " 三 ", " 四 ", " 五 "});
        this.e.as.a((byte) 1);
        this.e.aq.a(GlobalConfig.realHigh <= 240 ? 79 : 120);
        this.e.as.a = this.aH;
        this.aq = this.aF;
        this.ar = this.aG;
        if (GlobalStatus.ct != null && GlobalStatus.ct.length > 0) {
            this.e.at.a(GlobalStatus.a(this.k, this.e.l, (this.ar << 3) + this.aq), GlobalConfig.i, (byte) 1);
        } else {
            this.e.at.a("没有物品,按3、9键可以上下翻滚此属性描述框", GlobalConfig.i, (byte) 1);
        }

        this.e.at.a((byte) 1);
        this.e.au.a("");
        this.e.aq.a((al) this.e.as);
        this.e.aq.a((al) this.e.at);
        if (GlobalConfig.defaultHigh > 220) {
            this.e.aq.a((al) this.e.au);
        }

        this.e.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
        this.e.touchPageCase = this.e.k;
        this.j = this.k = 11;
    }

    private void ab(int var1) {
        if (GlobalStatus.cx == null || GlobalStatus.ct.length <= 0) {
            if (GlobalStatus.cx != null) {
                GlobalStatus.m();
            }

            this.m();
            this.aq = 0;
            if (this.as == 0) {
                this.an = new String[]{"取出物品", "存入物品"};
                K = new TextRender(GlobalStatus.t[this.af].b + ":物品仓库已打开", (short) (GlobalConfig.defaultWidth - 20));
                LoadingPage.a(MainCanvas.F, K, this.an, (String[]) null, true);
                this.l = 3;
            } else if (this.as == 1) {
                this.an = new String[]{"拍卖物品", "拍卖场", "拍卖场仓库"};
                K = new TextRender(GlobalStatus.t[this.af].b + ":物品仓库已打开", (short) (GlobalConfig.defaultWidth - 20));
                LoadingPage.a(MainCanvas.F, K, this.an, (String[]) null, true);
            }
        }

        if (this.l == 0) {
            this.a(GlobalStatus.cx);
            if (this.e.aq != null) {
                this.e.aq.b(var1);
            }

            if (var1 == 1024 || var1 == 2048) {
                this.G();
            }

            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    this.m();
                    this.aF = 0;
                    this.aG = 0;
                    this.aH = 0;
                    if (this.as == 0) {
                        this.an = new String[]{"取出物品", "存入物品"};
                        K = new TextRender(GlobalStatus.t[this.af].b + ":物品仓库已打开", (short) (GlobalConfig.defaultWidth - 20));
                        LoadingPage.a(MainCanvas.F, K, this.an, (String[]) null, true);
                        this.l = 3;
                        return;
                    }

                    if (this.as == 1) {
                        this.an = new String[]{"拍卖物品", "拍卖场", "拍卖场仓库"};
                        K = new TextRender(GlobalStatus.t[this.af].b + ":物品仓库已打开", (short) (GlobalConfig.defaultWidth - 20));
                        LoadingPage.a(MainCanvas.F, K, this.an, (String[]) null, true);
                        return;
                    }
                } else {
                    if (var1 != 8 && var1 != 516) {
                        if (var1 != 2 && var1 != 518) {
                            if (var1 != 1 && var1 != 514) {
                                if (var1 != 4 && var1 != 520) {
                                    return;
                                }

                                this.ar = this.ar >= 3 ? 0 : ++this.ar;
                                this.G();
                                return;
                            }

                            this.ar = this.ar <= 0 ? 3 : --this.ar;
                            this.G();
                            return;
                        }

                        this.aq = this.aq >= 7 ? 0 : ++this.aq;
                        this.G();
                        return;
                    }

                    this.aq = this.aq <= 0 ? 7 : --this.aq;
                    this.G();
                    return;
                }
            } else if (GlobalStatus.ct != null && (this.e.as.a << 5) + (this.ar << 3) + this.aq < GlobalStatus.ct.length) {
                if (this.as == 0) {
                    if (GlobalStatus.a(GlobalStatus.cv[(this.e.as.a << 5) + (this.ar << 3) + this.aq])) {
                        LoadingPage.a(3 + this.aq * 17 + 8 + o, 2 * GlobalConfig.j + 13 + this.ar * 17 + 17 + p, new String[]{"查看", "取出"}, false);
                        this.l = 4;
                        return;
                    }

                    if (GlobalStatus.cw[(this.e.as.a << 5) + (this.ar << 3) + this.aq] > 1) {
                        this.a((long) GlobalStatus.cw[(this.e.as.a << 5) + (this.ar << 3) + this.aq]);
                        this.l = 2;
                        return;
                    }

                    if (GlobalStatus.ct == null || GlobalStatus.cw[(this.e.as.a << 5) + (this.ar << 3) + this.aq] <= 0) {
                        this.l = 0;
                        return;
                    }

                    if (this.as == 0) {
                        this.ac(1);
                        return;
                    }
                } else if (this.as == 1) {
                    if (GlobalStatus.ct != null && GlobalStatus.cw[(this.e.as.a << 5) + (this.ar << 3) + this.aq] > 0) {
                        this.ad(GlobalStatus.ct[(this.e.as.a << 5) + (this.ar << 3) + this.aq]);
                        return;
                    }

                    this.l = 0;
                    return;
                }
            }
        } else if (this.l == 2) {
            this.b(var1);
            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    this.l = 0;
                    return;
                }
            } else {
                if (GlobalStatus.ct == null || GlobalStatus.cw[(this.e.as.a << 5) + (this.ar << 3) + this.aq] <= 0) {
                    this.l = 0;
                    return;
                }

                if (this.as == 0) {
                    this.ac(this.ag);
                    return;
                }

                if (this.as == 1) {
                    this.ad(GlobalStatus.ct[(this.e.as.a << 5) + (this.ar << 3) + this.aq]);
                    return;
                }
            }
        } else if (this.l == 4) {
            LoadingPage.b(var1);
            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    this.l = 0;
                }
            } else {
                if (LoadingPage.o == 0) {
                    this.aH = this.e.as.a;
                    GlobalStatus.c((this.e.as.a << 5) + (this.ar << 3) + this.aq);
                    this.O.a(0, (short) this.k, this.as);
                    return;
                }

                if (LoadingPage.o == 1) {
                    if (GlobalStatus.cw[(this.e.as.a << 5) + (this.ar << 3) + this.aq] > 1) {
                        this.a((long) GlobalStatus.cw[(this.e.as.a << 5) + (this.ar << 3) + this.aq]);
                        this.l = 2;
                        return;
                    }

                    if (GlobalStatus.ct == null || GlobalStatus.cw[(this.e.as.a << 5) + (this.ar << 3) + this.aq] <= 0) {
                        this.l = 0;
                        return;
                    }

                    if (this.as == 0) {
                        this.ac(1);
                        return;
                    }
                }
            }
        }

    }

    public final void G() {
        if (GlobalStatus.ct != null && (this.e.as.a << 5) + (this.ar << 3) + this.aq < GlobalStatus.ct.length) {
            this.e.at.a(GlobalStatus.a(this.k, this.e.l, (this.e.as.a << 5) + (this.ar << 3) + this.aq), GlobalConfig.i, (byte) 1);
        } else {
            this.e.at.a("没有商品,按3、9键可以上下翻滚此属性描述框", GlobalConfig.i, (byte) 1);
        }

        this.e.at.a((byte) 1);
        LoadingPage.l = 0;
    }

    private void ac(int var1) {
        byte[] var2;
        if ((var2 = NetPayloadBuilder.f((short) 4158, GlobalStatus.ad, GlobalStatus.ct[(this.e.as.a << 5) + (this.ar << 3) + this.aq], (int) var1)) != null) {
            NetPacket var3 = new NetPacket((short) 4158, var2);
            MainCanvas.netUtils.sendPacket(var3);
            this.e.a((String) null);
        } else {
            this.e.processException("获取上传指令数据错误!");
        }
    }

    private void ad(int var1) {
        byte[] var2;
        if ((var2 = NetPayloadBuilder.p((short) 4155, GlobalStatus.ad, var1)) != null) {
            NetPacket var3 = new NetPacket((short) 4155, var2);
            MainCanvas.netUtils.sendPacket(var3);
            this.e.a((String) null);
        } else {
            this.e.processException("获取上传指令数据错误!");
        }
    }

    private void r(Graphics var1) {
        if (GlobalStatus.ct != null && GlobalStatus.ct.length > 0) {
            if (this.e.aq != null) {
                this.e.aq.a("仓库");
                int var2 = GlobalConfig.realHigh <= 240 ? 79 : 120;
                this.e.aq.a(var2);
                this.e.aq.a(var1);
                LoadingPage.a(var1, this.e.aq.a + 5, this.e.aq.b + 29 + this.e.as.b, this.e.aq.c - 11, var2, 1);
                LoadingPage.a(var1);
                var2 = (this.e.aq.c - 11 - (x.b << 3)) / 9;
                int var3 = ((GlobalConfig.realHigh <= 240 ? 79 : 120) - 6 - (x.b << 2)) / 5;
                int var4 = this.e.aq.a + 8 + var2;
                int var5 = this.e.aq.b + 33 + this.e.as.b + var3;

                for (int var6 = 0; var6 < 32; ++var6) {
                    MainCanvas.f.a(var1, x, (int[]) null, (aj) null, 0, 0, var6 % 8 * (x.b + var2) + var4, var6 / 8 * (x.b + var3) + var5, 0, 0);
                    this.a((int) var6, var6 % 8 * (x.b + var2) + var4, var6 / 8 * (x.b + var3) + var5, (int) x.b, (int) x.c);
                }

                int var10 = 0;

                for (int var7 = this.e.as.a << 5; var7 < (GlobalStatus.cx.length > this.e.as.a + 1 << 5 ? this.e.as.a + 1 << 5 : GlobalStatus.cx.length); ++var7) {
                    int var8 = var7 % 32;
                    MainCanvas.f.a(var1, b(GlobalStatus.cx[var7]), (int[]) null, (aj) null, 0, 0, var8 % 8 * (x.b + var2) + var4 + 1, var8 / 8 * (x.b + var3) + var5 + 1, 0, 0);
                    if (GlobalStatus.cw[var7] > 9) {
                        MainCanvas.f.a(var1, MainCanvas.num, (int[]) null, GlobalStatus.cw[var7] / 10, 0, 0, 10 + var8 % 8 * (x.b + var2) + var4, var8 / 8 * (x.b + var3) + var5 + 12, 0, 0);
                        MainCanvas.f.a(var1, MainCanvas.num, (int[]) null, GlobalStatus.cw[var7] % 10, 0, 0, 14 + var8 % 8 * (x.b + var2) + var4, var8 / 8 * (x.b + var3) + var5 + 12, 0, 0);
                    } else if (GlobalStatus.cw[var7] > 1) {
                        MainCanvas.f.a(var1, MainCanvas.num, (int[]) null, GlobalStatus.cw[var7] % 10, 0, 0, 14 + var8 % 8 * (x.b + var2) + var4, var8 / 8 * (x.b + var3) + var5 + 12, 0, 0);
                    }

                    if (var7 == (this.ar << 3) + this.aq + 32 * this.e.as.a) {
                        var10 = var7;
                    }
                }

                LoadingPage.d(var1, var4 + this.aq * (x.b + var2), var5 + this.ar * (x.b + var3), 17, 17);
                if (var10 >= 0 && var10 < GlobalStatus.cx.length && var10 == (this.ar << 3) + this.aq + 32 * this.e.as.a) {
                    LoadingPage.a(var1, GlobalStatus.cu[var10] + "X" + GlobalStatus.cw[var10], GlobalStatus.cy[var10], var4 + this.aq * (x.b + var2) + x.b / 2, var5 + this.ar * (x.b + var3) + x.b / 2);
                }
            }

            if (this.l != 1 && this.l != 4) {
                if (this.l == 2) {
                    this.a(var1, "数量");
                }

            } else {
                LoadingPage.c(var1);
            }
        }
    }

    public final void H() {
        this.e.aq.b();
        this.e.aq.a("物品拍卖场");
        this.e.ar.a((Image[]) null, new String[]{"关键字", "武器", "头盔", "衣甲", "鞋子", "饰品", "书籍", "材料", "打造"}, (String[]) null, (String[]) null);
        this.e.au.a("搜索");
        this.e.aq.a((al) this.e.ar);
        if (GlobalConfig.defaultHigh > 220) {
            this.e.aq.a((al) this.e.au);
        }

        this.e.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
        this.j = this.k = 14;
    }

    private void ae(int var1) {
        if (this.e.aq != null) {
            this.e.aq.b(var1);
        }

        if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
            if (var1 == 536870912) {
                this.al = null;
                this.m();
                this.e.ar.a(this.ai);
            }

        } else {
            this.aU = this.e.ar.g();
            if (this.e.ar.g() == 0) {
                this.e.e("物品关键字搜索");
            } else {
                this.aK = "";
                this.aL = GlobalConfig.P[this.aU - 1];
                this.aM = 1;
                this.aN = 0;
                this.a(this.aK, this.aL, this.aM, this.aN);
                this.e.a((String) null);
            }
        }
    }

    public final void a(String var1, String var2, int var3, int var4) {
        byte[] var6;
        if ((var6 = NetPayloadBuilder.b((short) 4153, GlobalStatus.ad, var1, var2, var3, var4)) != null) {
            NetPacket var5 = new NetPacket((short) 4153, var6);
            MainCanvas.netUtils.sendPacket(var5);
        } else {
            this.e.processException("获取上传指令数据错误!");
        }
    }

    public final void b(String var1, String var2, int var3, int var4) {
        byte[] var6;
        if ((var6 = NetPayloadBuilder.a((short) 4147, GlobalStatus.ad, var1, var2, var3, var4)) != null) {
            NetPacket var5 = new NetPacket((short) 4147, var6);
            MainCanvas.netUtils.sendPacket(var5);
        } else {
            this.e.processException("获取上传指令数据错误!");
        }
    }

    private void aH() {
        this.aK = "";
        this.aL = "";
        this.aM = 1;
        this.aN = 0;
        this.aV = 0;
    }

    public final void I() {
        this.a(GlobalStatus.ec);
        this.e.aq.b();
        if (this.k != 23) {
            this.e.as.a(new String[]{"低价", "高价"});
            this.e.as.a((byte) 0);
        }

        if (GlobalStatus.dY != null && GlobalStatus.dY.length > 0) {
            this.e.ar.a(b(GlobalStatus.ec), a(this.e.l, GlobalStatus.dZ, GlobalStatus.eb), this.a(GlobalStatus.eg), (String[]) null);
            if (this.j == 64) {
                this.e.ar.a(this.aA, this.aq);
                this.e.as.a = this.aH;
            }

            this.e.ar.a(this.af(this.e.ar.g()), 1);
        } else {
            this.e.ar.a((Image[]) null, (String[]) null, (String[]) null, (String[]) null);
        }

        this.e.aq.a("物品拍卖场");
        this.e.aq.a(true);
        this.e.au.a("购买");
        this.e.au.a(true);
        this.e.aq.a((al) this.e.as);
        this.e.aq.a((al) this.e.ar);
        if (GlobalConfig.defaultHigh > 220) {
            this.e.aq.a((al) this.e.au);
        }

        this.e.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
        this.l = 0;
        this.e.touchPageCase = this.e.k;
        this.j = this.k = 23;
    }

    private String af(int var1) {
        StringBuffer var2;
        (var2 = new StringBuffer()).append(GlobalStatus.dZ[var1]);
        var2.append("X" + GlobalStatus.eb[var1]);
        var2.append("（");
        GlobalConfig.a(this.e.l, GlobalStatus.eg[var1]);
        var2.append(this.e.l.toString() + "）");
        var2.append('\t');
        if (GlobalStatus.ed[var1] != null && GlobalStatus.ed[var1].length() > 0) {
            var2.append(GlobalStatus.ed[var1]);
            var2.append('\t');
        }

        if (GlobalStatus.ee[var1] != null && GlobalStatus.ee[var1].length() > 0) {
            var2.append(GlobalStatus.ee[var1]);
            var2.append('\t');
        }

        if (GlobalStatus.ef[var1] > 0) {
            var2.append("等级:");
            var2.append(GlobalStatus.ef[var1]);
            var2.append('\t');
        }

        if (GlobalStatus.eh[var1] != null) {
            var2.append(GlobalStatus.eh[var1]);
            var2.append('\t');
        }

        return var2.toString();
    }

    private void ag(int var1) {
        if (GlobalStatus.dY == null) {
            this.am = null;
            this.al = null;
            this.e.touchPageCase = this.e.k;
            this.N();
        } else {
            if (this.l != 0) {
                if (this.l == 1) {
                    LoadingPage.b(var1);
                    if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                        if (var1 == 536870912) {
                            this.l = 0;
                            return;
                        }
                    } else if (GlobalStatus.a(GlobalStatus.ea[this.e.ar.g()])) {
                        if (LoadingPage.o == 0) {
                            this.aq = this.e.ar.g();
                            this.aA = this.e.ar.h();
                            this.aH = this.e.as.a;
                            GlobalStatus.d(this.e.ar.g());
                            this.O.a(0, (short) this.k, this.as);
                            return;
                        }

                        if (LoadingPage.o == 1) {
                            this.ag = 1;
                            LoadingPage.h = 0;
                            this.l = 3;
                            return;
                        }
                    } else if (LoadingPage.o == 0) {
                        this.ag = 1;
                        this.l = 3;
                        LoadingPage.h = 0;
                        return;
                    }
                } else if (this.l == 2) {
                    this.b(var1);
                    if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
                        this.l = 4;
                        LoadingPage.h = 0;
                        return;
                    }

                    if (var1 == 536870912) {
                        this.l = 0;
                        return;
                    }
                } else if (this.l == 3 || this.l == 4) {
                    if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                        if (var1 == 536870912) {
                            this.l = 0;
                        }
                    } else {
                        GlobalConfig.clearStr(this.e.l);
                        byte[] var4;
                        if ((var4 = NetPayloadBuilder.l((short) 4154, GlobalStatus.ad, (int) GlobalStatus.dY[this.e.ar.g()])) == null) {
                            this.e.processException("获取上传指令数据错误!");
                            return;
                        }

                        NetPacket var5 = new NetPacket((short) 4154, var4);
                        MainCanvas.netUtils.sendPacket(var5);
                        this.e.a((String) null);
                    }
                }
            } else {
                this.e.aq.b(var1);
                if (var1 != 1 && var1 != 4 && var1 != 514 && var1 != 520) {
                    label173:
                    {
                        if (var1 != 8 && var1 != 2 && var1 != 516 && var1 != 518) {
                            if (var1 == 1024) {
                                this.aV = this.e.as.a;
                                this.aL = this.aL.equals("") ? this.aL : GlobalConfig.P[this.aU - 1];
                                --this.aM;
                                if (this.aM < 1) {
                                    this.aM = 1;
                                    return;
                                }

                                this.aN = this.e.as.a;
                                this.a(this.aK, this.aL, this.aM, this.aN);
                                this.e.a((String) null);
                                break label173;
                            }

                            if (var1 != 2048) {
                                break label173;
                            }

                            this.aV = this.e.as.a;
                            this.aL = this.aL.equals("") ? this.aL : GlobalConfig.P[this.aU - 1];
                            if (GlobalStatus.ei != 1) {
                                return;
                            }

                            ++this.aM;
                        } else {
                            this.aV = this.e.as.a;
                            this.aL = this.aL.equals("") ? this.aL : GlobalConfig.P[this.aU - 1];
                            this.aM = 1;
                        }

                        this.aN = this.e.as.a;
                        this.a(this.aK, this.aL, this.aM, this.aN);
                        this.e.a((String) null);
                    }
                } else {
                    this.e.ar.a(this.af(this.e.ar.g()), 1);
                }

                if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
                    Object var2 = null;
                    String[] var3;
                    if (GlobalStatus.a(GlobalStatus.ea[this.e.ar.g()])) {
                        var3 = new String[]{"查看", "购买"};
                    } else {
                        var3 = new String[]{"购买"};
                    }

                    LoadingPage.a(o + 50, 2 * GlobalConfig.j + 15 + p + this.e.ar.i() * GlobalConfig.j, var3, false);
                    this.l = 1;
                    return;
                }

                if (var1 == 536870912) {
                    this.H();
                    this.e.ar.a(this.aU);
                    this.aH();
                    return;
                }
            }

        }
    }

    private void aI() {
        this.e.aq.b();
        this.e.aq.a("宠物拍卖场");
        this.e.ar.a((Image[]) null, new String[]{"关键字", "雷属性", "火属性", "冰属性", "无属性"}, (String[]) null, (String[]) null);
        this.e.au.a("搜索");
        this.e.aq.a((al) this.e.ar);
        if (GlobalConfig.defaultHigh > 220) {
            this.e.aq.a((al) this.e.au);
        }

        this.e.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
        this.e.touchPageCase = this.e.k;
        this.j = this.k = 15;
    }

    private void ah(int var1) {
        this.e.aq.b(var1);
        if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
            if (var1 == 536870912) {
                this.al = null;
                this.m();
                LoadingPage.g = this.ai;
            }

        } else {
            this.aU = this.e.ar.g();
            if (this.e.ar.g() == 0) {
                this.e.e("宠物关键字搜索");
            } else {
                this.aK = "";
                this.aL = GlobalConfig.O[this.aU - 1];
                this.aM = 1;
                this.aN = 0;
                this.b(this.aK, this.aL, this.aM, this.aN);
                this.e.a((String) null);
            }
        }
    }

    public final void J() {
        if (GlobalStatus.gw != null) {
            a(GlobalStatus.gw[0], GlobalStatus.gx[0], GlobalStatus.gy[0], GlobalStatus.gz[0]);
            this.aI = MainCanvas.ah.a(String.valueOf(GlobalStatus.gw[0] + "_0"), GlobalStatus.gx[0], GlobalStatus.gy[0], GlobalStatus.gz[0]);
        }

        this.e.aq.b();
        this.e.aq.a("宠物拍卖场");
        if (this.j != 24) {
            this.e.as.a(new String[]{"低价", "高价"});
            this.e.as.a((byte) 0);
        }

        this.e.ar.a((Image[]) null, GlobalStatus.gt, (String[]) null, this.a(GlobalStatus.gv));
        this.e.at.a(GlobalStatus.g(this.e.l, 0), GlobalConfig.i, (byte) 2);
        this.e.at.a((byte) 1);
        this.e.au.a("购买");
        this.e.au.a(true);
        this.e.aq.a((al) this.e.as);
        this.e.aq.a((al) this.e.ar);
        this.e.aq.a((al) this.e.at);
        if (GlobalConfig.defaultHigh > 220) {
            this.e.aq.a((al) this.e.au);
        }

        this.e.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
        this.e.aq.a(true);
        this.l = 0;
        this.e.touchPageCase = this.e.k;
        this.j = this.k = 24;
    }

    private void ai(int var1) {
        if (GlobalStatus.gs == null) {
            this.am = null;
            this.al = null;
            this.e.touchPageCase = this.e.k;
            this.N();
        } else {
            if (this.l == 0) {
                this.e.aq.b(var1);
                if (GlobalStatus.gA[this.e.ar.g()] != null && GlobalStatus.gA[this.e.ar.g()].length > 0 && this.e.at.a == 0) {
                    for (byte var2 = 0; var2 < GlobalStatus.gA[this.e.ar.g()].length; ++var2) {
                        this.a(GlobalStatus.gA[this.e.ar.g()]);
                    }
                }

                PngUtil.a(this.aI, this.e.ak);
                if (var1 == 1 || var1 == 4 || var1 == 514 || var1 == 520) {
                    this.e.at.a(GlobalStatus.g(this.e.l, this.e.ar.g()), GlobalConfig.i, (byte) 2);
                    this.e.at.a((byte) 1);
                    a(GlobalStatus.gw[this.e.ar.g()], GlobalStatus.gx[this.e.ar.g()], GlobalStatus.gy[this.e.ar.g()], GlobalStatus.gz[this.e.ar.g()]);
                    this.aI = MainCanvas.ah.a(String.valueOf(GlobalStatus.gw[this.e.ar.g()] + "_0"), GlobalStatus.gx[this.e.ar.g()], GlobalStatus.gy[this.e.ar.g()], GlobalStatus.gz[this.e.ar.g()]);
                    return;
                }

                if (var1 == 8 || var1 == 2 || var1 == 516 || var1 == 518) {
                    this.aV = this.e.as.a;
                    this.aL = this.aL.equals("") ? this.aL : GlobalConfig.O[this.aU - 1];
                    this.aM = 1;
                    this.aN = this.e.as.a;
                    this.b(this.aK, this.aL, this.aM, this.aN);
                    this.e.a((String) null);
                    return;
                }

                if (var1 == 1024) {
                    this.aV = this.e.as.a;
                    this.aL = this.aL.equals("") ? this.aL : GlobalConfig.O[this.aU - 1];
                    --this.aM;
                    if (this.aM < 1) {
                        this.aM = 1;
                        return;
                    }

                    this.aN = this.e.as.a;
                    this.b(this.aK, this.aL, this.aM, this.aN);
                    this.e.a((String) null);
                    return;
                }

                if (var1 == 2048) {
                    this.aV = this.e.as.a;
                    this.aL = this.aL.equals("") ? this.aL : GlobalConfig.O[this.aU - 1];
                    if (GlobalStatus.ei == 1) {
                        ++this.aM;
                        this.aN = this.e.as.a;
                        this.b(this.aK, this.aL, this.aM, this.aN);
                        this.e.a((String) null);
                        return;
                    }

                    return;
                }

                if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
                    LoadingPage.a(o + 50, 2 * GlobalConfig.j + 15 + p + this.e.ar.i() * GlobalConfig.j, new String[]{"购买"}, false);
                    this.l = 1;
                    return;
                }

                if (var1 == 536870912) {
                    this.aI();
                    this.e.ar.a(this.aU);
                    this.aH();
                    return;
                }
            } else if (this.l == 1) {
                LoadingPage.b(var1);
                if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                    if (var1 == 536870912) {
                        this.l = 0;
                        return;
                    }
                } else if (LoadingPage.o == 0) {
                    this.l = 2;
                    LoadingPage.h = 0;
                    return;
                }
            } else if (this.l == 2) {
                if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                    if (var1 == 536870912) {
                        LoadingPage.a(o + 50, 2 * GlobalConfig.j + 15 + p + this.e.ar.i() * GlobalConfig.j, new String[]{"购买"}, false);
                        this.l = 1;
                    }
                } else {
                    byte[] var4;
                    if ((var4 = NetPayloadBuilder.m((short) 4149, GlobalStatus.ad, (int) GlobalStatus.gs[this.e.ar.g()])) == null) {
                        this.e.processException("获取上传指令数据错误!");
                        return;
                    }

                    NetPacket var3 = new NetPacket((short) 4149, var4);
                    MainCanvas.netUtils.sendPacket(var3);
                    this.e.a((String) null);
                }
            }

        }
    }

    private void s(Graphics var1) {
        Object var2 = null;
        if (GlobalStatus.gs != null) {
            if (this.e.aq != null) {
                this.e.aq.a(var1);
            }

            if (this.aI != null && this.l == 0 && GlobalStatus.gA[this.e.ar.g()] != null && GlobalStatus.gA[this.e.ar.g()].length > 0 && this.e.at.a == 0) {
                Vector var4 = a(GlobalStatus.gA[this.e.ar.g()], GlobalStatus.gB[this.e.ar.g()]);
                if (GlobalStatus.gG[this.e.ar.g()] > 11) {
                    this.a(var1, GlobalConfig.defaultWidth - GlobalConfig.f - 187 - 26, this.e.at.c + 3, 17, 17, 11, 1);
                    this.a(var1, GlobalConfig.defaultWidth - GlobalConfig.f - (GlobalStatus.gG[this.e.ar.g()] - 11) * 17 - 26, this.e.at.c + 24, 17, 17, GlobalStatus.gG[this.e.ar.g()] - 11, 1);
                } else {
                    this.a(var1, GlobalConfig.defaultWidth - GlobalConfig.f - GlobalStatus.gG[this.e.ar.g()] * 17 - 26, this.e.at.c + 3, 17, 17, GlobalStatus.gG[this.e.ar.g()], 1);
                }

                for (byte var3 = 0; var3 < var4.size(); ++var3) {
                    if (GlobalStatus.gG[this.e.ar.g()] > 11) {
                        if (var3 < 11) {
                            MainCanvas.f.a(var1, b(((Short) var4.elementAt(var3)).shortValue()), (int[]) null, (aj) null, 0, 0, GlobalConfig.defaultWidth - GlobalConfig.f - (11 - var3) * 17 - 23, this.e.at.c + 4 + 2, 0, 0);
                        } else {
                            MainCanvas.f.a(var1, b(((Short) var4.elementAt(var3)).shortValue()), (int[]) null, (aj) null, 0, 0, GlobalConfig.defaultWidth - GlobalConfig.f - (GlobalStatus.gG[this.e.ar.g()] - var3) * 17 - 23, this.e.at.c + 4 + 2 + 21, 0, 0);
                        }
                    } else {
                        MainCanvas.f.a(var1, b(((Short) var4.elementAt(var3)).shortValue()), (int[]) null, (aj) null, 0, 0, GlobalConfig.defaultWidth - GlobalConfig.f - (GlobalStatus.gG[this.e.ar.g()] - var3) * 17 - 23, this.e.at.c + 4 + 2, 0, 0);
                    }
                }
            }

            if (this.aI != null && this.l == 0) {
                int var5;
                var5 = (var5 = this.e.ar.b() + 2 + (this.e.ar.g() - this.e.ar.h() + 1) * GlobalConfig.j) + 50 > this.e.ar.b() + this.e.ar.d() ? this.e.ar.b() + this.e.ar.d() - 50 : var5;
                int var7 = this.e.ar.a() + this.e.ar.c() - 50 - 20;
                LoadingPage.a(var1, 1009050, 159, var7, var5, 50, 50);
                var1.setColor(16776960);
                var1.drawRect(var7 - 1, var5 - 1, 51, 51);
                var1.setColor(16777215);
                var1.fillRect(var7 + 9, var5 + 2, 31, 3);
                var1.setColor(0);
                var1.drawRect(var7 + 9, var5 + 2, 31, 3);
                var1.setColor(16711680);
                var1.fillRect(var7 + 1 + 9, var5 + 1 + 2, 30 * GlobalStatus.gD[this.e.ar.g()] / GlobalStatus.gC[this.e.ar.g()], 2);
                var1.setColor(16777215);
                var1.fillRect(var7 + 9, var5 + 7, 31, 3);
                var1.setColor(0);
                var1.drawRect(var7 + 9, var5 + 7, 31, 3);
                var1.setColor(48127);
                var1.fillRect(var7 + 1 + 9, var5 + 1 + 7, 30 * GlobalStatus.gF[this.e.ar.g()] / GlobalStatus.gE[this.e.ar.g()], 2);
                MainCanvas.f.a(var1, (Frame1) this.aI, (int[]) null, 0, 0, var7 + 25 - this.aI.g() / 2, var5 + 50 - this.aI.h() - 3, 20, 0);
            }

            if (this.l == 1) {
                LoadingPage.c(var1);
            } else {
                if (this.l == 2) {
                    LoadingPage.a(var1, "您确认以" + GlobalStatus.a(GlobalStatus.gv[this.e.ar.g()]) + "的价格购买该宠物1只", new String[]{"确定", "取消"});
                }

            }
        }
    }

    public final void f(byte var1) {
        this.c = true;
        this.e.p = true;
        ao_1 var2 = this;
        if (this.bA != null) {
            for (int var3 = 0; var3 < var2.bA.length; ++var3) {
                var2.bA[var3] = null;
                var2.bE[var3] = null;
            }

            var2.bA = null;
            var2.bE = null;
        }

        this.e.clear();
        if (var1 == 2 || var1 == 1) {
            this.e.q.setCurrent(this.e);
        }

        this.aT();
        this.e.clear();
        GlobalConfig.printStr("[FIGHT] f(" + var1 + ") 创建bq_1前: v=" + GlobalStatus.v + " w=" + GlobalStatus.w);
        this.g = new bq_1(this.e, this, var1);
        this.e.clear();
        if (GlobalStatus.bu && ab_1.b) {
            if (!GlobalStatus.bt) {
                this.O();
            }

            ab_1.b = false;
        }

        this.e.clear();
        MainCanvas.f.a(this.f, h, i, false);
        this.j = this.k = 25;
        this.e.touchPageCase = this.e.k = 7;
        this.e.p = false;
        byte[] var5;
        if ((var5 = NetPayloadBuilder.z((short) 4223, GlobalStatus.ad)) != null) {
            NetPacket var4 = new NetPacket((short) 4659, var5);
            MainCanvas.netUtils.sendPacket(var4);
        }

    }

    public final void o(int var1) {
        if (this.g != null && GlobalStatus.H != null && GlobalStatus.M != null) {
            this.g.a(var1);
        }

    }

    private void t(Graphics var1) {
        try {
            if (this.g != null && GlobalStatus.H != null && GlobalStatus.M != null) {
                if (this.k != 18 && GlobalConfig.defaultWidth >= 240) {
                    this.e.m = 8;
                }

                this.g.a(MainCanvas.f, var1);
                if (this.k == 18) {
                    LoadingPage.a(var1, 0, 159, 0, 0, GlobalConfig.defaultWidth, GlobalConfig.defaultHigh);
                }
            }

        } catch (Exception var2) {
            this.c("系统异常[10]");
            ((Throwable) var2).printStackTrace();
        }
    }

    public final void K() {
        this.l = 0;
        this.cp = -1;
        if (this.n) {
            this.n = false;
        }

        this.aR = false;
        this.aM();
        LoadingPage.a(aP.size(), 4, this.e.as.b + 6, GlobalConfig.defaultWidth - 8, GlobalConfig.defaultHigh - this.e.as.b - 6, (GlobalConfig.defaultHigh - this.e.as.b - 6) / GlobalConfig.j, false);
        this.cr = new int[aP.size()][4];
        this.l = 1;
        this.e.aq.j();
        this.e.aq.a(false);
        this.e.aq.b(false);
        this.e.aq.a((String) null);
        this.e.as.a(new String[]{"全", "系", "世", "帮", "区", "队", "私", "跨"});
        this.e.aq.a((al) this.e.as);
        this.e.aq.a(0, 0, GlobalConfig.defaultWidth, GlobalConfig.defaultHigh);
        MainCanvas.f.a(this.f, h, i, false, true, 2109231);
        this.j = this.k = 18;
    }

    private void aJ() {
        if (this.e.as.a == 0) {
            this.aM();
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

        this.cr = new int[aP.size()][4];
        LoadingPage.a(aP.size(), 4, this.e.as.b + 6, GlobalConfig.defaultWidth - 8, GlobalConfig.defaultHigh - this.e.as.b - 6, (GlobalConfig.defaultHigh - this.e.as.b - 6) / GlobalConfig.j, false);
        if (this.cp == this.e.as.a) {
            LoadingPage.w = this.cn;
            LoadingPage.z = this.co;
        }

    }

    private void aj(int var1) {
        if (this.e.aC != null && this.e.g) {
            if (this.e.aE == null) {
                if (this.e.as.a != 6 && !this.aR) {
                    if (this.e.as.a == 0) {
                        this.a(this.cl, (byte) this.aT);
                        this.e.n();
                    } else if (this.e.as.a != 1) {
                        if (this.e.as.a == 2) {
                            this.a((String) this.cl, (byte) 0);
                            this.e.n();
                        } else if (this.e.as.a == 3) {
                            this.a((String) this.cl, (byte) 3);
                            this.e.n();
                        } else if (this.e.as.a == 4) {
                            this.a((String) this.cl, (byte) 1);
                            this.e.n();
                        } else if (this.e.as.a == 5) {
                            this.a((String) this.cl, (byte) 2);
                            this.e.n();
                        }
                    }
                } else {
                    this.a((String) this.cl, (byte) 4);
                    this.e.n();
                }
            } else {
                this.f((short) -1);
            }

            this.l = 1;
        }

        if (this.l == 0) {
            this.e.aq.b(var1);
            if (this.e.as.a != this.cp) {
                this.aL();
                this.aJ();
                this.cp = this.e.as.a;
            }

            if (this.e.tempTouchStatus > 40) {
                LoadingPage.a(this.e.b, 1, 1);
            } else {
                LoadingPage.a(var1, 1, 1);
                ++this.e.tempTouchStatus;
            }

            this.cn = LoadingPage.w;
            this.co = LoadingPage.z;
            if (var1 != 1024) {
                if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
                    this.g((short) 2);
                    return;
                }

                if (var1 == 536870912) {
                    if (this.c) {
                        MainCanvas.f.a(this.f, h, i, false);
                        this.j = this.k = 25;
                    } else if (this.by == 1) {
                        this.N();
                        this.by = 0;
                    } else {
                        this.au();
                        this.c((int) 1);
                    }

                    this.cl = null;
                    this.aQ = null;
                    aP.removeAllElements();
                    return;
                }
            }
        } else if (this.l == 1) {
            this.e.aq.b(var1);
            if (this.e.as.a != this.cp) {
                this.aL();
                this.aJ();
                this.cp = this.e.as.a;
            }

            if (this.e.tempTouchStatus > 40) {
                LoadingPage.a(this.e.b, 1, 1);
            } else {
                LoadingPage.a(var1, 1, 1);
                ++this.e.tempTouchStatus;
            }

            this.cn = LoadingPage.w;
            this.co = LoadingPage.z;
            if (var1 != 1024) {
                if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
                    this.g((short) 3);
                    return;
                }

                if (var1 == 536870912) {
                    if (this.c) {
                        MainCanvas.f.a(this.f, h, i, false);
                        this.j = this.k = 25;
                    } else if (this.by == 1) {
                        this.N();
                        this.by = 0;
                    } else {
                        this.au();
                        this.c((int) 1);
                    }

                    aP.removeAllElements();
                    return;
                }
            }
        } else if (this.l != 2 && this.l != 3) {
            if (this.l == 4) {
                LoadingPage.b(var1);
                if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                    if (var1 == 536870912) {
                        if (this.e.as.a == 5) {
                            if (this.c) {
                                LoadingPage.a(0, this.m == 2 ? 150 : 40, new String[]{"私聊", "好友", "黑名单"}, true);
                            } else {
                                LoadingPage.a(0, this.m == 2 ? 150 : 40, new String[]{"私聊", "好友", "黑名单", "组队", "交易"}, true);
                            }

                            LoadingPage.o = 2;
                        } else {
                            if (this.c) {
                                LoadingPage.a(0, this.m == 2 ? 150 : 40, new String[]{"私聊", "频道聊天", "好友", "黑名单"}, true);
                            } else {
                                LoadingPage.a(0, this.m == 2 ? 150 : 40, new String[]{"私聊", "频道聊天", "好友", "黑名单", "组队", "交易"}, true);
                            }

                            LoadingPage.o = 3;
                        }

                        this.l = this.m;
                        return;
                    }
                } else {
                    if (LoadingPage.o == 0) {
                        this.b(this.cl);
                        this.l = 0;
                        return;
                    }

                    if (LoadingPage.o == 1) {
                        if (this.e.as.a == 5) {
                            if (this.c) {
                                LoadingPage.a(0, this.m == 2 ? 150 : 40, new String[]{"私聊", "好友", "黑名单"}, true);
                            } else {
                                LoadingPage.a(0, this.m == 2 ? 150 : 40, new String[]{"私聊", "好友", "黑名单", "组队", "交易"}, true);
                            }

                            LoadingPage.o = 2;
                        } else {
                            if (this.c) {
                                LoadingPage.a(0, this.m == 2 ? 150 : 40, new String[]{"私聊", "频道聊天", "好友", "黑名单"}, true);
                            } else {
                                LoadingPage.a(0, this.m == 2 ? 150 : 40, new String[]{"私聊", "频道聊天", "好友", "黑名单", "组队", "交易"}, true);
                            }

                            LoadingPage.o = 3;
                        }

                        this.l = this.m;
                        return;
                    }
                }
            } else if (this.l == 5) {
                LoadingPage.b(var1);
                if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
                    this.a((short) (LoadingPage.o == 0 ? 0 : 1), (String) this.cl);
                    return;
                }

                if (var1 == 536870912) {
                    this.l = 0;
                    return;
                }
            } else if (this.l == 6) {
                LoadingPage.b(var1);
                if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
                    this.e(this.cl);
                    return;
                }

                if (var1 == 536870912) {
                    this.l = 0;
                }
            }
        } else {
            LoadingPage.b(var1);
            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    if (this.l == 2) {
                        this.l = 0;
                        return;
                    }

                    this.l = 1;
                    return;
                }
            } else {
                this.aR = false;
                if (this.cl != null && !this.cl.equals("")) {
                    if (this.e.as.a == 6) {
                        if (LoadingPage.o == 0) {
                            this.aR = true;
                            this.aS = this.cl;
                            this.aT = 4;
                            this.e.a((String) "聊天", (int) 0);
                            return;
                        }

                        if (LoadingPage.o == 1) {
                            this.a(this.cl);
                            this.l = 0;
                            return;
                        }

                        if (LoadingPage.o == 2) {
                            LoadingPage.a(0, this.l == 2 ? 150 : 40, new String[]{"确认", "取消"}, true);
                            this.l = 4;
                            return;
                        }

                        if (LoadingPage.o == 3) {
                            if (GlobalStatus.bs == -1) {
                                LoadingPage.a(LoadingPage.r + 65 + o, 2 * GlobalConfig.j + 20 + LoadingPage.w * GlobalConfig.j + p, new String[]{"跟随", "自由"}, false);
                                this.l = 5;
                                return;
                            }

                            this.a(GlobalStatus.s, this.cl);
                            return;
                        }

                        if (LoadingPage.o == 4) {
                            LoadingPage.a(LoadingPage.r + 65 + o, 2 * GlobalConfig.j + 20 + LoadingPage.w * GlobalConfig.j + p, new String[]{"物品", "宠物"}, false);
                            this.l = 6;
                            return;
                        }
                    } else {
                        if (LoadingPage.o == 0) {
                            this.aR = true;
                            this.aS = this.cl;
                            this.aT = 4;
                            this.e.a((String) "聊天", (int) 0);
                            return;
                        }

                        if (LoadingPage.o == 1) {
                            if (this.e.as.a != 1) {
                                this.aS = this.cl;
                                this.aT = this.cm == 4 ? 0 : this.cm;
                                this.e.a((String) "聊天", (int) 0);
                                return;
                            }

                            if (this.e.as.a == 3) {
                                this.e.a((String) "聊天", (int) 0);
                                return;
                            }

                            if (this.e.as.a == 4) {
                                if (GlobalStatus.bs == -1) {
                                    this.e.processException("不在队伍中");
                                    return;
                                }

                                this.e.a((String) "聊天", (int) 0);
                                return;
                            }
                        } else {
                            if (LoadingPage.o == 2) {
                                this.a(this.cl);
                                this.l = 1;
                                return;
                            }

                            if (LoadingPage.o == 3) {
                                LoadingPage.a(0, this.l == 2 ? 150 : 40, new String[]{"确认", "取消"}, true);
                                this.l = 4;
                                return;
                            }

                            if (LoadingPage.o == 4) {
                                if (GlobalStatus.bs == -1) {
                                    LoadingPage.a(LoadingPage.r + 65 + o, 2 * GlobalConfig.j + 20 + LoadingPage.w * GlobalConfig.j + p, new String[]{"跟随", "自由"}, false);
                                    this.l = 5;
                                    return;
                                }

                                this.a(GlobalStatus.s, this.cl);
                                return;
                            }

                            if (LoadingPage.o == 5) {
                                LoadingPage.a(LoadingPage.r + 65 + o, 2 * GlobalConfig.j + 20 + LoadingPage.w * GlobalConfig.j + p, new String[]{"物品", "宠物"}, false);
                                this.l = 6;
                                return;
                            }
                        }
                    }
                }
            }
        }

    }

    public final void a(String var1, boolean var2) {
        byte[] var3;
        if ((var3 = NetPayloadBuilder.a((short) 4628, GlobalStatus.ad, var1, var2)) != null) {
            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4628, var3));
        } else {
            this.e.processException("获取上传指令数据错误!");
        }
    }

    public final void a(String var1) {
        byte[] var2;
        if ((var2 = NetPayloadBuilder.b((short) 4122, GlobalStatus.ad, var1, (short) this.k)) != null) {
            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4122, var2));
        } else {
            this.e.processException("获取上传指令数据错误!");
        }
    }

    public final void b(String var1) {
        byte[] var2;
        if ((var2 = NetPayloadBuilder.c((short) 4123, GlobalStatus.ad, var1, (short) this.k)) != null) {
            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4123, var2));
        } else {
            this.e.processException("获取上传指令数据错误!");
        }
    }

    private void g(short var1) {
        if (LoadingPage.v > 0 && this.e.as.a != 1) {
            if (LoadingPage.w >= aP.size() || aP.size() < 1) {
                this.aK();
                return;
            }

            if (this.e.as.a == 7) {
                this.aK();
                return;
            }

            this.cq = aP.size() > 0 ? (b) aP.elementAt(LoadingPage.w) : null;
            if (this.cq == null || this.cq.equals("")) {
                this.aK();
                return;
            }

            int var2;
            if ((var2 = this.cq.a.indexOf("[")) != 0) {
                return;
            }

            this.aQ = this.cq.a.substring(var2 + 1, this.cq.a.indexOf("]"));
            if (this.aQ == null || this.aQ.equals("") || this.aQ.equals(GlobalStatus.af) || this.aQ.equals("系统") || this.aQ.equals("系统提示")) {
                this.aK();
                return;
            }

            String var5 = this.aQ;
            ce var3 = null;
            int var4 = 0;

            String var10001;
            while (true) {
                if (var4 >= ck.size()) {
                    var10001 = null;
                    break;
                }

                if ((var3 = (ce) ck.elementAt(var4)).d.equals(var5)) {
                    var10001 = var3.c;
                    break;
                }

                ++var4;
            }

            this.cl = var10001;
            var5 = this.aQ;
            var3 = null;
            var4 = 0;

            while (true) {
                byte var11;
                if (var4 < ck.size()) {
                    if (!(var3 = (ce) ck.elementAt(var4)).d.equals(var5)) {
                        ++var4;
                        continue;
                    }

                    var11 = var3.b;
                } else {
                    var11 = 0;
                }

                this.cm = var11;
                if (this.cl == null || this.cl != null && this.cl.equals(GlobalStatus.ad)) {
                    this.e.processException("不能自言自语！");
                    return;
                }

                if (this.e.as.a != 6) {
                    if (this.c) {
                        LoadingPage.a(0, var1 == 2 ? 150 : 40, new String[]{"私聊", "频道聊天", "好友", "黑名单"}, true);
                    } else {
                        LoadingPage.a(0, var1 == 2 ? 150 : 40, new String[]{"私聊", "频道聊天", "好友", "黑名单", "组队", "交易"}, true);
                    }

                    this.m = this.l = var1;
                    return;
                }

                if (this.c) {
                    LoadingPage.a(0, var1 == 2 ? 150 : 40, new String[]{"私聊", "好友", "黑名单"}, true);
                } else {
                    LoadingPage.a(0, var1 == 2 ? 150 : 40, new String[]{"私聊", "好友", "黑名单", "组队", "交易"}, true);
                }

                this.m = this.l = var1;
                break;
            }
        } else if (this.e.as.a != 6) {
            this.aK();
        }

    }

    private void aK() {
        this.e.d("聊天");
        if (this.e.as.a == 2) {
            this.e.aE.setSelectedIndex(0, true);
        } else if (this.e.as.a == 3) {
            this.e.aE.setSelectedIndex(3, true);
        } else if (this.e.as.a == 4) {
            this.e.aE.setSelectedIndex(1, true);
        } else if (this.e.as.a == 5) {
            this.e.aE.setSelectedIndex(2, true);
        } else {
            if (this.e.as.a == 7) {
                this.e.aE.setSelectedIndex(4, true);
            }

        }
    }

    private void aL() {
        if (this.e.as.a != 0) {
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
                return;
            }

            if (this.e.as.a == 6) {
                o((byte) 4);
                return;
            }

            if (this.e.as.a == 7) {
                o((byte) 6);
                return;
            }
        } else {
            this.aM();
        }

    }

    private void aM() {
        try {
            Object var5 = null;
            aP.removeAllElements();

            for (int var2 = 0; var2 < ck.size(); ++var2) {
                ce var6 = (ce) ck.elementAt(var2);
                String[] var1;
                if ((var1 = LoadingPage.a("[" + var6.d + "]" + var6.e, GlobalConfig.i, GlobalConfig.defaultWidth - 20)) != null && var1.length > 0) {
                    for (int var3 = 0; var3 < var1.length; ++var3) {
                        aP.addElement(new b(var1[var3], LoadingPage.n[var6.a]));
                    }
                }
            }

        } catch (Exception var4) {
        }
    }

    private static void o(byte var0) {
        Object var1 = null;
        aP.removeAllElements();

        for (int var3 = 0; var3 < ck.size(); ++var3) {
            String[] var2;
            ce var5;
            if ((var5 = (ce) ck.elementAt(var3)).b == var0 && (var2 = LoadingPage.a("[" + var5.d + "]" + var5.e, GlobalConfig.i, GlobalConfig.defaultWidth - 20)) != null && var2.length > 0) {
                for (int var4 = 0; var4 < var2.length; ++var4) {
                    aP.addElement(new b(var2[var4], LoadingPage.n[var5.a]));
                }
            }
        }

    }

    private void u(Graphics var1) {
        try {
            for (int var2 = LoadingPage.z; var2 < aP.size() && var2 < LoadingPage.z + LoadingPage.x; ++var2) {
                if (LoadingPage.w == var2) {
                    LoadingPage.a(var1, 9);
                    if (LoadingPage.w >= LoadingPage.x) {
                        LoadingPage.a(var1, 873078, 191, LoadingPage.r + 2, LoadingPage.s + (LoadingPage.x - 1) * GlobalConfig.j, LoadingPage.t - 20, GlobalConfig.j);
                    } else {
                        LoadingPage.a(var1, 873078, 191, LoadingPage.r + 2, LoadingPage.s + LoadingPage.w * GlobalConfig.j, LoadingPage.t - 20, GlobalConfig.j);
                    }
                }

                this.cq = (b) aP.elementAt(var2);
                this.cq.a(var1, MainCanvas.f, C, LoadingPage.r + 2, LoadingPage.s + (var2 - LoadingPage.z) * var1.getFont().getHeight());
                int var10002 = LoadingPage.r + 2;
                int var10003 = LoadingPage.s + (var2 - LoadingPage.z) * var1.getFont().getHeight();
                int var10004 = LoadingPage.t - 20;
                int var8 = GlobalConfig.j;
                int var7 = var10004;
                int var6 = var10003;
                int var5 = var10002;
                if (this.cr != null && this.cr.length > var2) {
                    this.cr[var2][0] = var5;
                    this.cr[var2][1] = var6;
                    this.cr[var2][2] = var7;
                    this.cr[var2][3] = var8;
                }
            }

            LoadingPage.a(var1, GlobalConfig.defaultWidth - 5 - MainCanvas.C.b, GlobalConfig.j + 10, LoadingPage.u - 20, LoadingPage.y, LoadingPage.z, LoadingPage.v, LoadingPage.x);
            int var10001 = GlobalConfig.defaultWidth - 5 - MainCanvas.C.b;
            int var15 = GlobalConfig.j + 10;
            int var16 = GlobalConfig.defaultWidth - 5 - MainCanvas.C.b;
            int var17 = GlobalConfig.j - 10 + LoadingPage.u - MainCanvas.D.c;
            short var10 = MainCanvas.D.c;
            short var14 = MainCanvas.D.b;
            int var13 = var17;
            int var12 = var16;
            int var11 = var15;
            int var4 = var10001;
            this.cs[0][0] = var4;
            this.cs[0][1] = var11;
            this.cs[0][2] = var14;
            this.cs[0][3] = var10;
            this.cs[1][0] = var12;
            this.cs[1][1] = var13;
            this.cs[1][2] = var14;
            this.cs[1][3] = var10;
            this.e.aq.a(var1);
            if (this.l == 2 || this.l == 3 || this.l == 4 || this.l == 5 || this.l == 6) {
                LoadingPage.c(var1);
            }

            if (GlobalConfig.o && this.e.touchController != null && MainCanvas.u != null) {
                var1.drawImage(MainCanvas.u.pngImage, GlobalConfig.defaultWidth - MainCanvas.u.b - 5, 5, 20);
            }

        } catch (Exception var9) {
            this.K();
        }
    }

    public final int d(int var1, int var2, int var3) {
        if (this.cs != null) {
            if (var2 >= this.cs[0][0] && var2 <= this.cs[0][0] + this.cs[0][2] && var3 >= this.cs[0][1] && var3 <= this.cs[0][1] + this.cs[0][3]) {
                return 1;
            }

            if (var2 >= this.cs[1][0] && var2 <= this.cs[1][0] + this.cs[1][2] && var3 >= this.cs[1][1] && var3 <= this.cs[1][1] + this.cs[1][3]) {
                return 4;
            }
        }

        if (this.cr != null) {
            for (int var4 = 0; var4 < this.cr.length; ++var4) {
                if (var2 >= this.cr[var4][0] && var2 <= this.cr[var4][0] + this.cr[var4][2] && var3 >= this.cr[var4][1] && var3 <= this.cr[var4][1] + this.cr[var4][3]) {
                    if (LoadingPage.w != var4) {
                        LoadingPage.w = var4 - 1;
                        return 4;
                    }

                    return 1073741824;
                }
            }
        }

        return var1;
    }

    public final void p(int var1) {
        if (i()) {
            this.l = 0;
            this.e.aq.b();
            this.e.aq.a("社交关系");
            if (this.j != 19) {
                this.e.as.a(new String[]{"好友", "师徒", "黑名单"});
            }

            if (var1 == 1) {
                this.e.ar.a((Image[]) null, GlobalStatus.dL, (String[]) null, GlobalStatus.dQ);
            } else {
                String[] var2 = null;
                if (GlobalStatus.dK != null && GlobalStatus.dK.length > 0) {
                    var2 = new String[GlobalStatus.dK.length];

                    for (int var3 = 0; var3 < var2.length; ++var3) {
                        var2[var3] = GlobalStatus.dN[var3] == 0 ? "离线" : GlobalStatus.dN[var3] + "级";
                    }
                }

                this.e.ar.a((Image[]) null, GlobalStatus.dL, (String[]) null, var2);
                if (var1 == 0) {
                    this.e.ar.a("添加好友");
                    this.e.ar.a(GlobalStatus.aC == 1 ? GlobalStatus.dO : null);
                    this.e.ar.b(GlobalStatus.aH == 1 ? GlobalStatus.dP : null);
                }
            }

            this.e.ar.a(GlobalStatus.dR);
            this.e.au.a("确定");
            this.e.aq.a((al) this.e.as);
            this.e.aq.a((al) this.e.ar);
            if (GlobalConfig.defaultHigh > 220) {
                this.e.aq.a((al) this.e.au);
            }

            this.e.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
            this.e.aq.a(true);
            this.de = null;
            this.e.touchPageCase = this.e.k;
            this.j = this.k = 19;
        }
    }

    private void ak(int var1) {
        if (this.e.aC != null && this.e.g && this.e.ar.g() - 1 >= 0) {
            this.a((String) GlobalStatus.dK[this.e.ar.g() - 1], (byte) 4);
        }

        if (this.l == 0) {
            if (this.e.aq != null) {
                this.e.aq.b(var1);
            }

            if (var1 == 8 || var1 == 2 || var1 == 516 || var1 == 518) {
                if (this.e.as.a == 0) {
                    byte[] var8;
                    if ((var8 = NetPayloadBuilder.f((short) 4168, GlobalStatus.ad)) != null) {
                        NetPacket var9 = new NetPacket((short) 4168, var8);
                        MainCanvas.netUtils.sendPacket(var9);
                        this.e.a((String) null);
                    } else {
                        this.e.processException("获取上传指令数据错误!");
                    }
                } else if (this.e.as.a == 1) {
                    byte[] var10;
                    if ((var10 = NetPayloadBuilder.C((short) 4202, GlobalStatus.ad)) != null) {
                        NetPacket var11 = new NetPacket((short) 4202, var10);
                        MainCanvas.netUtils.sendPacket(var11);
                    } else {
                        this.e.processException("获取上传指令数据错误!");
                    }
                } else if (this.e.as.a == 2) {
                    byte[] var12;
                    if ((var12 = NetPayloadBuilder.g((short) 4169, GlobalStatus.ad)) != null) {
                        NetPacket var13 = new NetPacket((short) 4169, var12);
                        MainCanvas.netUtils.sendPacket(var13);
                        this.e.a((String) null);
                    } else {
                        this.e.processException("获取上传指令数据错误!");
                    }
                }
            }

            if (this.e.as.a == 0) {
                if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
                    if (this.e.ar.g() == this.e.ar.h()) {
                        this.e.a((String) "请输入好友昵称", (int) 0);
                    } else if (GlobalStatus.dK != null) {
                        if (GlobalStatus.dM[this.e.ar.g() - 1] == 0) {
                            LoadingPage.a(GlobalConfig.f, 2 * GlobalConfig.j + 11 + this.e.ar.i() * GlobalConfig.j + GlobalConfig.g, new String[]{"聊天", "状态", "删除", "黑名单"}, true);
                        } else if (GlobalStatus.dM[this.e.ar.g() - 1] == 1) {
                            LoadingPage.a(GlobalConfig.f, 2 * GlobalConfig.j + 11 + this.e.ar.i() * GlobalConfig.j + GlobalConfig.g, new String[]{"聊天", "状态", "删除", "黑名单", "组队", "交易", "参观住宅", "邀请入帮"}, true);
                        }

                        this.l = 1;
                    }
                }
            } else if (this.e.as.a == 2 && (var1 == 268435456 || var1 == 1073741824 || var1 == 517) && GlobalStatus.dK != null) {
                if (GlobalStatus.dM[this.e.ar.g()] == 0 || GlobalStatus.dM[this.e.ar.g()] == 1) {
                    LoadingPage.a(0 + GlobalConfig.f, 2 * GlobalConfig.j + 11 + this.e.ar.i() * GlobalConfig.j + GlobalConfig.g, new String[]{"删除", "加为好友"}, true);
                }

                this.l = 4;
            }

            if (var1 == 536870912) {
                GlobalStatus.s();
                if (this.by == 1) {
                    this.N();
                    this.by = 0;
                    return;
                }

                this.au();
                this.c((int) 0);
                return;
            }
        } else if (this.l == 1) {
            LoadingPage.b(var1);
            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    this.l = 0;
                    return;
                }
            } else {
                this.e.aw = LoadingPage.o;
                if (LoadingPage.o == 0) {
                    this.aQ = GlobalStatus.dL[this.e.ar.g() - 1];
                    this.aS = GlobalStatus.dK[this.e.ar.g() - 1];
                    this.aT = 4;
                    this.e.a((String) "聊天", (int) 0);
                    return;
                }

                if (LoadingPage.o == 1) {
                    LoadingPage.a(0, 2 * GlobalConfig.j + 11 + this.e.ar.i() * GlobalConfig.j + GlobalConfig.g, new String[]{"查看", "道具", "成就"}, true);
                    this.l = 9;
                    return;
                }

                if (LoadingPage.o == 2) {
                    LoadingPage.a(0, 2 * GlobalConfig.j + 11 + this.e.ar.i() * GlobalConfig.j + GlobalConfig.g, new String[]{"确认", "取消"}, true);
                    this.l = 2;
                    return;
                }

                if (LoadingPage.o == 3) {
                    LoadingPage.a(0, 2 * GlobalConfig.j + 11 + this.e.ar.i() * GlobalConfig.j + GlobalConfig.g, new String[]{"确认", "取消"}, true);
                    this.l = 3;
                    return;
                }

                if (LoadingPage.o == 4) {
                    if (GlobalStatus.bs == -1) {
                        LoadingPage.a(65 + GlobalConfig.f, 2 * GlobalConfig.j + 20 + this.e.ar.g() * GlobalConfig.j + GlobalConfig.g, new String[]{"自由", "跟随"}, false);
                        this.l = 6;
                        return;
                    }

                    this.a(GlobalStatus.s, GlobalStatus.dK[this.e.ar.g() - 1]);
                    return;
                }

                if (LoadingPage.o == 5) {
                    LoadingPage.a(65 + GlobalConfig.f, 2 * GlobalConfig.j + 20 + this.e.ar.g() * GlobalConfig.j + GlobalConfig.g, new String[]{"物品", "宠物"}, false);
                    this.l = 7;
                    return;
                }

                if (LoadingPage.o == 6) {
                    if (GlobalStatus.G()) {
                        this.e.processException("住宅中不能参观别人住宅");
                        return;
                    }

                    if (GlobalStatus.bs != -1) {
                        this.e.processException("队伍中不能参看住宅！");
                        return;
                    }

                    this.a((byte) 1, -1, GlobalStatus.dK[this.e.ar.g() - 1]);
                    return;
                }

                if (LoadingPage.o == 7) {
                    aq var10000 = this.M;
                    String var7 = GlobalStatus.dL[this.e.ar.g() - 1];
                    var10000.f = var7;
                    this.M.h();
                    return;
                }
            }
        } else if (this.l != 2 && this.l != 3) {
            if (this.l == 4) {
                LoadingPage.b(var1);
                if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                    if (var1 == 536870912) {
                        this.l = 0;
                        return;
                    }
                } else {
                    if (LoadingPage.o == 0) {
                        LoadingPage.a(0, 2 * GlobalConfig.j + 11 + this.e.ar.i() * GlobalConfig.j + GlobalConfig.g, new String[]{"确认", "取消"}, true);
                        this.l = 5;
                        return;
                    }

                    if (LoadingPage.o == 1) {
                        this.a(GlobalStatus.dK[this.e.ar.g()]);
                        return;
                    }
                }
            } else if (this.l == 5) {
                LoadingPage.b(var1);
                if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                    if (var1 == 536870912 && (GlobalStatus.dM[this.e.ar.g()] == 0 || GlobalStatus.dM[this.e.ar.g()] == 1)) {
                        LoadingPage.a(0 + GlobalConfig.f, 2 * GlobalConfig.j + 11 + this.e.ar.i() * GlobalConfig.j + GlobalConfig.g, new String[]{"删除", "加为好友"}, true);
                        this.l = 4;
                        return;
                    }
                } else if (LoadingPage.o == 0) {
                    byte[] var5;
                    if ((var5 = NetPayloadBuilder.d((short) 4171, GlobalStatus.ad, GlobalStatus.dK[this.e.ar.g()])) == null) {
                        this.e.processException("获取上传指令数据错误!");
                        return;
                    }

                    NetPacket var6 = new NetPacket((short) 4171, var5);
                    MainCanvas.netUtils.sendPacket(var6);
                    this.e.a((String) null);
                } else if (LoadingPage.o == 1 && (GlobalStatus.dM[this.e.ar.g()] == 0 || GlobalStatus.dM[this.e.ar.g()] == 1)) {
                    LoadingPage.a(0 + GlobalConfig.f, 2 * GlobalConfig.j + 11 + this.e.ar.i() * GlobalConfig.j + GlobalConfig.g, new String[]{"删除", "加为好友"}, true);
                    this.l = 4;
                    return;
                }
            } else if (this.l == 6) {
                LoadingPage.b(var1);
                if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
                    this.a((short) (LoadingPage.o == 0 ? 1 : 0), (String) GlobalStatus.dK[this.e.ar.g() - 1]);
                    return;
                }

                if (var1 == 536870912) {
                    this.l = 0;
                    return;
                }
            } else if (this.l == 7) {
                LoadingPage.b(var1);
                if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
                    this.e(GlobalStatus.dK[this.e.ar.g() - 1]);
                    return;
                }

                if (var1 == 536870912) {
                    this.l = 0;
                    return;
                }
            } else if (this.l == 8) {
                if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                    if (var1 == 536870912) {
                        this.l = 0;
                        return;
                    }
                } else {
                    byte[] var2;
                    if ((var2 = NetPayloadBuilder.c((short) 4170, GlobalStatus.ad, GlobalStatus.dK[this.e.ar.g() - 1])) == null) {
                        this.e.processException("获取上传指令数据错误!");
                        return;
                    }

                    NetPacket var3 = new NetPacket((short) 4170, var2);
                    MainCanvas.netUtils.sendPacket(var3);
                }
            } else if (this.l == 9) {
                LoadingPage.b(var1);
                if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                    if (var1 == 536870912) {
                        this.l = 0;
                        return;
                    }
                } else if (LoadingPage.o == 0) {
                    byte[] var4;
                    if ((var4 = NetPayloadBuilder.a((short) 4110, GlobalStatus.ad, GlobalStatus.dK[this.e.ar.g() - 1], (byte) 0)) == null) {
                        this.e.processException("获取上传指令数据错误!");
                        return;
                    }

                    MainCanvas.netUtils.sendPacket(new NetPacket((short) 4110, var4));
                    this.e.a((String) null);
                } else {
                    if (LoadingPage.o == 1) {
                        if (GlobalStatus.bC.size() > 0) {
                            this.e((int) 13);
                            return;
                        }

                        this.e.processException("背包中没有物品");
                        return;
                    }

                    if (LoadingPage.o == 2) {
                        this.de = GlobalStatus.dK[this.e.ar.g() - 1];
                        this.a(GlobalStatus.dK[this.e.ar.g() - 1], GlobalStatus.ad, (short) 3, (short) 1);
                        return;
                    }
                }
            } else if (this.l == 10) {
                this.T.b(var1);
                if (var1 == 268435456 || var1 == 536870912) {
                    this.T.j();
                    this.p((int) 0);
                }
            }
        } else {
            LoadingPage.b(var1);
            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    if (GlobalStatus.dM[this.e.ar.g() - 1] == 0) {
                        LoadingPage.a(GlobalConfig.f, 2 * GlobalConfig.j + 11 + this.e.ar.i() * GlobalConfig.j + GlobalConfig.g, new String[]{"聊天", "状态", "删除", "黑名单"}, true);
                    } else if (GlobalStatus.dM[this.e.ar.g() - 1] == 1) {
                        LoadingPage.a(GlobalConfig.f, 2 * GlobalConfig.j + 11 + this.e.ar.i() * GlobalConfig.j + GlobalConfig.g, new String[]{"聊天", "状态", "删除", "黑名单", "组队", "交易", "参观住宅", "邀请入帮"}, true);
                    }

                    LoadingPage.o = this.e.aw;
                    this.l = 1;
                    return;
                }
            } else if (LoadingPage.o == 0) {
                if (this.e.aw == 2) {
                    this.l = 8;
                    LoadingPage.h = 0;
                    return;
                }

                if (this.e.aw == 3) {
                    if (GlobalStatus.dM[this.e.ar.g() - 1] == 1) {
                        this.b(GlobalStatus.dK[this.e.ar.g() - 1]);
                        return;
                    }

                    this.e.processException("对方不在线");
                    return;
                }
            } else if (LoadingPage.o == 1) {
                if (GlobalStatus.dM[this.e.ar.g() - 1] == 0) {
                    LoadingPage.a(GlobalConfig.f, 2 * GlobalConfig.j + 11 + this.e.ar.i() * GlobalConfig.j + GlobalConfig.g, new String[]{"聊天", "状态", "删除", "黑名单"}, true);
                } else if (GlobalStatus.dM[this.e.ar.g() - 1] == 1) {
                    LoadingPage.a(GlobalConfig.f, 2 * GlobalConfig.j + 11 + this.e.ar.i() * GlobalConfig.j + GlobalConfig.g, new String[]{"聊天", "状态", "删除", "黑名单", "组队", "交易", "参观住宅", "邀请入帮"}, true);
                }

                LoadingPage.o = this.e.aw;
                this.l = 1;
                return;
            }
        }

    }

    public final void a(short var1) {
        this.bb = var1;
        this.e.mainMidlet.start();
        GlobalStatus.dS = GlobalStatus.dT;
        GlobalStatus.dU = GlobalStatus.dV;
        GlobalStatus.dW = GlobalStatus.dX;
        this.an = new String[]{GlobalStatus.dS[2], GlobalStatus.dS[3]};
        K = new TextRender(GlobalStatus.dS[0], (short) (GlobalConfig.defaultWidth - 20));
        LoadingPage.a(MainCanvas.F, K, this.an, (String[]) null, true);
        MainCanvas.f.a(this.f, h, i, true, false, 1009050);
        this.e.az = false;
        this.e.touchPageCase = this.e.k;
        this.j = this.k = 20;
    }

    private void al(int var1) {
        if (var1 != 1 && var1 != 514) {
            if (var1 != 4 && var1 != 520) {
                if (var1 != 8 && var1 != 516) {
                    if (var1 != 2 && var1 != 518) {
                        if (var1 != 268435456 && var1 != 517 && var1 != 1073741824) {
                            if (var1 == 536870912) {
                                this.b(GlobalStatus.dS[1], GlobalStatus.dW);
                                this.N();
                            }
                        } else {
                            if (LoadingPage.g == 0) {
                                this.N();
                                this.b(GlobalStatus.dS[1], GlobalStatus.dU);
                                if (GlobalStatus.dU == 26 && GlobalStatus.dS[2].equals("注册")) {
                                    c_3.a(true);
                                } else if (GlobalStatus.dU == 28 && GlobalStatus.dS[2].equals("下载")) {
                                    this.e.c(GlobalStatus.dS[1]);
                                } else {
                                    this.e.a((String) null);
                                }
                            } else if (LoadingPage.g == 1) {
                                this.b(GlobalStatus.dS[1], GlobalStatus.dW);
                                this.N();
                            }

                            if (this.bb == 64) {
                                this.bb = 0;
                                this.O.a(MainCanvas.e.O.a, (short) this.O.c, this.O.d);
                            }
                        }
                    } else {
                        LoadingPage.e = LoadingPage.e + LoadingPage.d < K.a() ? LoadingPage.e + LoadingPage.d : LoadingPage.e;
                    }
                } else {
                    LoadingPage.e = LoadingPage.e - LoadingPage.d >= 0 ? LoadingPage.e - LoadingPage.d : 0;
                }
            } else if (this.an != null) {
                LoadingPage.g = LoadingPage.g + 1 < this.an.length ? LoadingPage.g + 1 : 0;
            }
        } else if (this.an != null) {
            LoadingPage.g = LoadingPage.g - 1 >= 0 ? LoadingPage.g - 1 : this.an.length - 1;
        }

        this.e.b = 0;
    }

    private void aN() {
        Image[] var1 = new Image[GlobalStatus.q.length];
        this.am = new String[GlobalStatus.q.length];
        this.al = new String[GlobalStatus.q.length];

        for (byte var2 = 0; var2 < GlobalStatus.q.length; ++var2) {
            this.am[var2] = GlobalStatus.q[var2].e;
            this.al[var2] = GlobalStatus.q[var2].o + "级";
            if (GlobalStatus.q[var2].s == 1) {
                var1[var2] = y.pngImage;
            } else if (GlobalStatus.q[var2].s == 0) {
                var1[var2] = z.pngImage;
            }
        }

        if (this.j != 21) {
            this.l = 0;
            this.e.aq.j();
            this.e.aq.a("队伍(" + (GlobalStatus.s == 0 ? "跟随" : "自由") + ")信息");
            this.e.ar.a(var1, this.am, (String[]) null, this.al);
            this.e.aq.a((al) this.e.ar);
            this.e.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
            this.e.touchPageCase = this.e.k;
            this.j = this.k = 21;
        } else {
            this.e.aq.a("队伍(" + (GlobalStatus.s == 0 ? "跟随" : "自由") + ")信息");
            this.e.ar.a(var1, this.am, (String[]) null, this.al);
        }
    }

    private void am(int var1) {
        if (GlobalStatus.q == null) {
            this.al = null;
            this.N();
        } else {
            if (this.e.aC != null && this.e.g) {
                if (this.bz != 0 && this.bz != 3) {
                    this.a((String) GlobalStatus.q[this.e.ar.g()].b, (byte) 4);
                } else {
                    this.a((String) null, (byte) 2);
                }
            }

            if (this.l == 0) {
                this.e.aq.b(var1);
                if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
                    if (GlobalStatus.q[this.e.ar.g()].b.equals(GlobalStatus.ad)) {
                        return;
                    }

                    if (GlobalStatus.bs == 1) {
                        LoadingPage.a(0, 2 * GlobalConfig.j + 10 + p, new String[]{"踢除", "任命", "解散", "群聊", "私聊", "查看", GlobalStatus.s == 0 ? "自由" : "跟随"}, true);
                    } else {
                        LoadingPage.a(0, 2 * GlobalConfig.j + 10 + p, new String[]{"群聊", "私聊", "离开", "查看"}, true);
                    }

                    this.l = 1;
                    return;
                }

                if (var1 == 536870912) {
                    this.e.aq.j();
                    this.c((int) 0);
                    this.l = 1;
                    MainCanvas.f.a(this.f, h, i, false, false, 1009050);
                    this.j = this.k = 1;
                    return;
                }
            } else if (this.l == 1) {
                LoadingPage.b(var1);
                if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                    if (var1 == 536870912) {
                        this.l = 0;
                        return;
                    }
                } else if (GlobalStatus.bs == 1) {
                    if (LoadingPage.o == 0) {
                        LoadingPage.a(0, 2 * GlobalConfig.j + 10 + p, new String[]{"确认", "取消"}, true);
                        this.bz = 0;
                        this.l = 2;
                        return;
                    }

                    if (LoadingPage.o == 1) {
                        LoadingPage.a(0, 2 * GlobalConfig.j + 10 + p, new String[]{"确认", "取消"}, true);
                        this.bz = 1;
                        this.l = 2;
                        return;
                    }

                    if (LoadingPage.o == 2) {
                        LoadingPage.a(0, 2 * GlobalConfig.j + 10 + p, new String[]{"确认", "取消"}, true);
                        this.bz = 2;
                        this.l = 2;
                        return;
                    }

                    if (LoadingPage.o == 3) {
                        this.e.a((String) "聊天", (int) 0);
                        this.bz = 3;
                        this.aQ = GlobalStatus.q[this.e.ar.g()].e;
                        return;
                    }

                    if (LoadingPage.o == 4) {
                        this.e.a((String) "聊天", (int) 0);
                        this.bz = 4;
                        this.aQ = GlobalStatus.q[this.e.ar.g()].e;
                        return;
                    }

                    if (LoadingPage.o == 5) {
                        LoadingPage.a(0, 2 * GlobalConfig.j + 10 + p, new String[]{"属性", "装备"}, true);
                        this.l = 3;
                        return;
                    }

                    if (LoadingPage.o == 6) {
                        this.bz = 6;
                        byte[] var8;
                        if ((var8 = NetPayloadBuilder.b((short) 4115, GlobalStatus.ad, (short) GlobalStatus.s)) == null) {
                            this.e.processException("获取上传指令数据错误!");
                            return;
                        }

                        MainCanvas.netUtils.sendPacket(new NetPacket((short) 4115, var8));
                        if (GlobalStatus.s == 0) {
                            this.e.processException("队员自由活动请求已发送!");
                        } else {
                            if (GlobalStatus.s != 1) {
                                return;
                            }

                            this.e.processException("队伍集合请求已发送!");
                        }
                    }
                } else if (GlobalStatus.bs == 0) {
                    if (LoadingPage.o == 0) {
                        this.e.a((String) "聊天", (int) 0);
                        this.bz = 0;
                        this.aQ = GlobalStatus.q[this.e.ar.g()].e;
                        return;
                    }

                    if (LoadingPage.o == 1) {
                        this.e.a((String) "聊天", (int) 0);
                        this.bz = 1;
                        this.aQ = GlobalStatus.q[this.e.ar.g()].e;
                        return;
                    }

                    if (LoadingPage.o == 2) {
                        LoadingPage.a(0, 2 * GlobalConfig.j + 10 + p, new String[]{"确认", "取消"}, true);
                        this.bz = 2;
                        this.l = 2;
                        return;
                    }

                    if (LoadingPage.o == 3) {
                        LoadingPage.a(0, 2 * GlobalConfig.j + 10 + p, new String[]{"属性", "装备"}, true);
                        this.bz = 3;
                        this.l = 3;
                        return;
                    }
                }
            } else if (this.l == 2) {
                LoadingPage.b(var1);
                if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                    if (var1 == 536870912) {
                        this.an(this.bz);
                        return;
                    }
                } else if (LoadingPage.o == 0) {
                    if (this.bz == 0) {
                        byte[] var2;
                        if ((var2 = NetPayloadBuilder.e((short) 4114, GlobalStatus.ad, GlobalStatus.q[this.e.ar.g()].b)) == null) {
                            this.e.processException("获取上传指令数据错误!");
                            return;
                        }

                        MainCanvas.netUtils.sendPacket(new NetPacket((short) 4114, var2));
                        this.e.processException("剔除队员" + GlobalStatus.q[this.e.ar.g()].e + "请求已发送!");
                    } else if (this.bz == 1) {
                        byte[] var3;
                        if ((var3 = NetPayloadBuilder.f((short) 4119, GlobalStatus.ad, GlobalStatus.q[this.e.ar.g()].b)) == null) {
                            this.e.processException("获取上传指令数据错误!");
                            return;
                        }

                        MainCanvas.netUtils.sendPacket(new NetPacket((short) 4119, var3));
                        this.e.processException("任命" + GlobalStatus.q[this.e.ar.g()].e + "为队长请求已发送!");
                    } else if (this.bz == 2) {
                        if (GlobalStatus.bs == 1) {
                            byte[] var4;
                            if ((var4 = NetPayloadBuilder.h((short) 4120, GlobalStatus.ad)) == null) {
                                this.e.processException("获取上传指令数据错误!");
                                return;
                            }

                            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4120, var4));
                            this.e.processException("解散队伍请求已发送!");
                        } else if (GlobalStatus.bs == 0) {
                            byte[] var5;
                            if ((var5 = NetPayloadBuilder.i((short) 4121, GlobalStatus.ad)) == null) {
                                this.e.processException("获取上传指令数据错误!");
                                return;
                            }

                            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4121, var5));
                            this.e.processException("脱离队伍请求已发送!");
                        }
                    }
                } else if (LoadingPage.o == 1) {
                    this.an(this.bz);
                    return;
                }
            } else if (this.l == 3) {
                LoadingPage.b(var1);
                if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                    if (var1 == 536870912) {
                        this.bz = 3;
                        if (GlobalStatus.bs == 1) {
                            this.bz = 5;
                        }

                        this.an(this.bz);
                        return;
                    }
                } else if (LoadingPage.o == 0) {
                    byte[] var6;
                    if ((var6 = NetPayloadBuilder.a((short) 4110, GlobalStatus.ad, GlobalStatus.q[this.e.ar.g()].b, (byte) 0)) == null) {
                        this.e.processException("获取上传指令数据错误!");
                        return;
                    }

                    MainCanvas.netUtils.sendPacket(new NetPacket((short) 4110, var6));
                    this.e.a((String) null);
                } else if (LoadingPage.o == 1) {
                    byte[] var7;
                    if ((var7 = NetPayloadBuilder.b((short) 4111, GlobalStatus.ad, GlobalStatus.q[this.e.ar.g()].b)) == null) {
                        this.e.processException("获取上传指令数据错误!");
                        return;
                    }

                    MainCanvas.netUtils.sendPacket(new NetPacket((short) 4111, var7));
                    this.e.a((String) null);
                }
            } else if (this.l == 4) {
                this.T.b(var1);
                if (var1 == 268435456 || var1 == 536870912) {
                    LoadingPage.a(0, 2 * GlobalConfig.j + 10 + p, new String[]{"属性", "装备"}, true);
                    this.al = null;
                    this.T.j();
                    this.l = 3;
                    return;
                }
            } else if (this.l == 5) {
                this.a(GlobalStatus.cJ);
                this.g(var1);
                if (var1 == 536870912) {
                    LoadingPage.a(0, 2 * GlobalConfig.j + 10 + p, new String[]{"属性", "装备"}, true);
                    if (GlobalStatus.cJ != null) {
                        GlobalStatus.o();
                    }

                    q = null;
                    this.al = null;
                    this.l = 3;
                }
            }

        }
    }

    private void an(int var1) {
        if (GlobalStatus.bs == 1) {
            LoadingPage.a(0, 2 * GlobalConfig.j + 10 + p, new String[]{"踢除", "任命", "解散", "群聊", "私聊", "查看", GlobalStatus.s == 0 ? "自由" : "跟随"}, true);
        } else {
            LoadingPage.a(0, 2 * GlobalConfig.j + 10 + p, new String[]{"群聊", "私聊", "离开", "查看"}, true);
        }

        LoadingPage.o = var1;
        if (this.k == 21) {
            this.l = 1;
        } else {
            if (this.k == 7) {
                this.l = 8;
            }

        }
    }

    public final void b(byte var1, boolean var2) {
        this.ct = var1;
        this.l = 0;
        if (var2) {
            this.aE = this.e.ax = this.aF;
        } else {
            this.aE = this.aV = this.e.ax = 0;
        }

        this.aU = this.ar = 1;
        this.aP();
        this.e.aq.b();
        this.e.au.a(new String[]{"交易", "取消"});
        this.e.aq.a((al) this.e.au);
        this.e.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
        this.e.aq.a(GlobalStatus.ff);
        this.j = this.k = 22;
        this.e.touchPageCase = this.e.k = 7;
    }

    private void ao(int var1) {
        if (this.aE == this.e.ax) {
            this.aP();
            this.aE = -1;
        }

        if (this.l == 0) {
            if (this.ct == 0) {
                this.a(GlobalStatus.fs);
                this.aV();
            } else if (this.ct == 1) {
                this.a(new short[]{1920});
            }

            if (var1 != 516 && var1 != 8) {
                if (var1 != 518 && var1 != 2) {
                    if (var1 != 514 && var1 != 1) {
                        if (var1 != 520 && var1 != 4) {
                            if (var1 == 1073741824) {
                                if (this.ar == 0) {
                                    if (GlobalStatus.fp != null && GlobalStatus.a((byte) 1, this.e.ax)) {
                                        LoadingPage.a(GlobalConfig.f + 20 + this.e.ax * 17, GlobalConfig.g + 41, new String[]{"查看"}, false);
                                        this.l = 3;
                                    }
                                } else if (this.ar <= 1) {
                                    var1 = 0;
                                    if (this.ct == 0) {
                                        if (this.ar == 1) {
                                            if (GlobalStatus.fh == null || GlobalStatus.fh != null && this.aO()) {
                                                if (GlobalStatus.fi != null && GlobalStatus.a((byte) 0, this.e.ax)) {
                                                    LoadingPage.a(GlobalConfig.f + 20 + this.e.ax * 17, GlobalConfig.g + 4 * GlobalConfig.j + 35, new String[]{"查看", "放入", "金钱", "锁定", "交易", "退出"}, false);
                                                } else {
                                                    LoadingPage.a(GlobalConfig.f + 20 + this.e.ax * 17, GlobalConfig.g + 4 * GlobalConfig.j + 35, new String[]{"放入", "金钱", "锁定", "交易", "退出"}, false);
                                                }

                                                LoadingPage.o = 0;
                                                this.l = 1;
                                            } else {
                                                if (GlobalStatus.fi != null && GlobalStatus.a((byte) 0, this.e.ax)) {
                                                    LoadingPage.a(GlobalConfig.f + 20 + this.e.ax * 17, GlobalConfig.g + 4 * GlobalConfig.j + 35, new String[]{"查看", "取出", "金钱", "锁定", "交易", "退出"}, false);
                                                } else {
                                                    LoadingPage.a(GlobalConfig.f + 20 + this.e.ax * 17, GlobalConfig.g + 4 * GlobalConfig.j + 35, new String[]{"取出", "金钱", "锁定", "交易", "退出"}, false);
                                                }

                                                LoadingPage.o = 0;
                                                this.l = 2;
                                            }
                                        }
                                    } else if (this.ct == 1 && this.ar == 1) {
                                        if (GlobalStatus.fu != null && (GlobalStatus.fu == null || !this.aO())) {
                                            LoadingPage.a(GlobalConfig.f + 20 + this.e.ax * 17, GlobalConfig.g + 4 * GlobalConfig.j + 35, new String[]{"取出", "金钱", "锁定", "交易", "退出"}, false);
                                            LoadingPage.o = 0;
                                            this.l = 2;
                                        } else {
                                            LoadingPage.a(GlobalConfig.f + 20 + this.e.ax * 17, GlobalConfig.g + 4 * GlobalConfig.j + 35, new String[]{"放入", "金钱", "锁定", "交易", "退出"}, false);
                                            LoadingPage.o = 0;
                                            this.l = 1;
                                        }
                                    }
                                }

                                this.aF = this.e.ax;
                                return;
                            }

                            if (var1 == 536870912) {
                                LoadingPage.h = 0;
                                this.l = 5;
                                return;
                            }

                            if (var1 == 1024) {
                                if (GlobalStatus.i == 0) {
                                    this.e.processException("交易已锁定");
                                    return;
                                }

                                byte[] var7;
                                if ((var7 = NetPayloadBuilder.g((short) 4128, GlobalStatus.ad, (byte) this.ct)) == null) {
                                    this.e.processException("获取上传指令数据错误!");
                                    return;
                                }

                                MainCanvas.netUtils.sendPacket(new NetPacket((short) 4128, var7));
                                this.e.a((String) null);
                            } else {
                                if (var1 == 2048) {
                                    if (GlobalStatus.i == 0) {
                                        this.e.processException("交易已锁定");
                                        return;
                                    }

                                    if (GlobalStatus.ap > 0L) {
                                        this.ah = GlobalStatus.ap;
                                        this.l = 6;
                                        this.o();
                                        return;
                                    }

                                    this.e.processException("身上没有银两");
                                    return;
                                }

                                if (var1 == 268435456) {
                                    byte[] var8;
                                    if ((var8 = NetPayloadBuilder.h((short) 4129, GlobalStatus.ad, (byte) this.ct)) == null) {
                                        this.e.processException("获取上传指令数据错误!");
                                        return;
                                    }

                                    MainCanvas.netUtils.sendPacket(new NetPacket((short) 4129, var8));
                                    this.e.a((String) null);
                                    return;
                                }
                            }

                            return;
                        }

                        ++this.ar;
                        if (this.ar > 1) {
                            --this.ar;
                        }

                        this.aE = this.aU = this.ar;
                        this.aP();
                        return;
                    }

                    if (this.ar - 1 == 1) {
                        this.aV = this.e.ax = 0;
                    }

                    --this.ar;
                    if (this.ar < 0) {
                        ++this.ar;
                    }

                    this.aE = this.aU = this.ar;
                    this.aP();
                    return;
                }

                if (this.ar == 3) {
                    this.aV = this.e.ax = this.e.ax == 0 ? 1 : 0;
                    this.aP();
                    return;
                }

                this.aE = this.aV = this.e.ax = this.e.ax >= 7 ? 0 : ++this.e.ax;
                this.aP();
                return;
            }

            if (this.ar == 3) {
                this.aV = this.e.ax = this.e.ax == 0 ? 1 : 0;
                this.aP();
                return;
            }

            this.aE = this.aV = this.e.ax = this.e.ax <= 0 ? 7 : --this.e.ax;
            this.aP();
            return;
        } else if (this.l != 1 && this.l != 2) {
            if (this.l == 3) {
                if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
                    this.aH = this.e.as.a;
                    GlobalStatus.a((int) this.e.ax, 1);
                    this.O.a(0, (short) this.k, this.ct);
                    return;
                }

                if (var1 == 536870912) {
                    this.l = 0;
                    return;
                }
            } else if (this.l == 5) {
                if (var1 == 268435456) {
                    this.g(this.ct);
                    this.e.a((String) null);
                    return;
                }

                if (var1 == 536870912) {
                    this.l = 0;
                    return;
                }
            } else if (this.l == 6) {
                if (var1 != 268435456 && var1 != 1073741824) {
                    if (var1 != 1073741824) {
                        if (var1 == 536870912) {
                            this.l = 0;
                            return;
                        }

                        this.d(var1);
                    }
                } else if (this.n() != -1L) {
                    if (this.n() > this.ah) {
                        this.e.processException("超出最大值，请重新输入");
                        return;
                    }

                    byte[] var6;
                    if ((var6 = NetPayloadBuilder.a((short) 4127, GlobalStatus.ad, this.n(), (int) this.ct)) != null) {
                        MainCanvas.netUtils.sendPacket(new NetPacket((short) 4127, var6));
                        this.e.a((String) null);
                    } else {
                        this.e.processException("获取上传指令数据错误!");
                    }

                    this.l = 0;
                    return;
                }
            }
        } else {
            LoadingPage.b(var1);
            if (var1 != 268435456 && var1 != 517 && var1 != 1073741824) {
                if (var1 == 536870912) {
                    this.l = 0;
                    return;
                }
            } else if (GlobalStatus.fi != null && GlobalStatus.a((byte) 0, this.e.ax)) {
                if (LoadingPage.o == 0) {
                    this.aH = this.e.as.a;
                    GlobalStatus.a((int) this.e.ax, 0);
                    this.O.a(0, (short) this.k, this.ct);
                    return;
                }

                if (LoadingPage.o == 1) {
                    if (GlobalStatus.i == 0) {
                        this.e.processException("交易已锁定");
                        return;
                    }

                    if (this.l == 1) {
                        if (this.ct == 0) {
                            if (GlobalStatus.fh != null && GlobalStatus.fh.length >= 10) {
                                this.e.processException("交易物品栏已满!");
                                return;
                            }

                            this.e((int) 4);
                            return;
                        }

                        if (this.ct == 1) {
                            if (GlobalStatus.gs != null && GlobalStatus.gs.length >= 10) {
                                this.e.processException("交易宠物栏已满!");
                                return;
                            }

                            if (GlobalStatus.fw != null && GlobalStatus.fw.length > 0) {
                                this.j((int) 4);
                                return;
                            }

                            this.e.processException("您没有宠物!");
                            return;
                        }
                    } else if (this.l == 2) {
                        if (this.ct == 0) {
                            this.b(this.ct, (byte) this.e.ax);
                            this.b((byte) 0, true);
                            this.ar = this.aU;
                            this.e.ax = this.aF;
                            this.as = 0;
                            this.e.a((String) null);
                            return;
                        }

                        if (this.ct == 1) {
                            this.b(this.ct, (byte) this.e.ax);
                            this.b((byte) 1, true);
                            this.ar = this.aU;
                            this.e.ax = this.aF;
                            this.e.a((String) null);
                            return;
                        }
                    }
                } else {
                    if (LoadingPage.o == 2) {
                        if (GlobalStatus.i == 0) {
                            this.e.processException("交易已锁定");
                            return;
                        }

                        if (GlobalStatus.ap > 0L) {
                            this.ah = GlobalStatus.ap;
                            this.l = 6;
                            this.o();
                            return;
                        }

                        this.e.processException("身上没有银两");
                        return;
                    }

                    if (LoadingPage.o == 3) {
                        if (GlobalStatus.i == 0) {
                            this.e.processException("交易已锁定");
                            return;
                        }

                        byte[] var4;
                        if ((var4 = NetPayloadBuilder.g((short) 4128, GlobalStatus.ad, (byte) this.ct)) == null) {
                            this.e.processException("获取上传指令数据错误!");
                            return;
                        }

                        MainCanvas.netUtils.sendPacket(new NetPacket((short) 4128, var4));
                        this.e.a((String) null);
                    } else if (LoadingPage.o == 4) {
                        byte[] var5;
                        if ((var5 = NetPayloadBuilder.h((short) 4129, GlobalStatus.ad, (byte) this.ct)) == null) {
                            this.e.processException("获取上传指令数据错误!");
                            return;
                        }

                        MainCanvas.netUtils.sendPacket(new NetPacket((short) 4129, var5));
                        this.e.a((String) null);
                    } else if (LoadingPage.o == 5) {
                        LoadingPage.h = 0;
                        this.l = 5;
                        return;
                    }
                }
            } else if (LoadingPage.o == 0) {
                if (GlobalStatus.i == 0) {
                    this.e.processException("交易已锁定");
                    return;
                }

                if (this.l == 1) {
                    if (this.ct == 0) {
                        if (GlobalStatus.fh != null && GlobalStatus.fh.length >= 10) {
                            this.e.processException("交易物品栏已满!");
                            return;
                        }

                        this.e((int) 4);
                        return;
                    }

                    if (this.ct == 1) {
                        if (GlobalStatus.gs != null && GlobalStatus.gs.length >= 10) {
                            this.e.processException("交易宠物栏已满!");
                            return;
                        }

                        if (GlobalStatus.fw != null && GlobalStatus.fw.length > 0) {
                            this.j((int) 4);
                            return;
                        }

                        this.e.processException("您没有宠物!");
                        return;
                    }
                } else if (this.l == 2) {
                    if (this.ct == 0) {
                        this.b(this.ct, (byte) this.e.ax);
                        this.b((byte) 0, true);
                        this.ar = this.aU;
                        this.e.ax = this.aF;
                        this.as = 0;
                        this.e.a((String) null);
                        return;
                    }

                    if (this.ct == 1) {
                        this.b(this.ct, (byte) this.e.ax);
                        this.b((byte) 1, true);
                        this.ar = this.aU;
                        this.e.ax = this.aF;
                        this.e.a((String) null);
                        return;
                    }
                }
            } else {
                if (LoadingPage.o == 1) {
                    if (GlobalStatus.i == 0) {
                        this.e.processException("交易已锁定");
                        return;
                    }

                    if (GlobalStatus.ap > 0L) {
                        this.ah = GlobalStatus.ap;
                        this.l = 6;
                        this.o();
                        return;
                    }

                    this.e.processException("身上没有银两");
                    return;
                }

                if (LoadingPage.o == 2) {
                    if (GlobalStatus.i == 0) {
                        this.e.processException("交易已锁定");
                        return;
                    }

                    byte[] var2;
                    if ((var2 = NetPayloadBuilder.g((short) 4128, GlobalStatus.ad, (byte) this.ct)) == null) {
                        this.e.processException("获取上传指令数据错误!");
                        return;
                    }

                    MainCanvas.netUtils.sendPacket(new NetPacket((short) 4128, var2));
                    this.e.a((String) null);
                } else if (LoadingPage.o == 3) {
                    byte[] var3;
                    if ((var3 = NetPayloadBuilder.h((short) 4129, GlobalStatus.ad, (byte) this.ct)) == null) {
                        this.e.processException("获取上传指令数据错误!");
                        return;
                    }

                    MainCanvas.netUtils.sendPacket(new NetPacket((short) 4129, var3));
                    this.e.a((String) null);
                } else if (LoadingPage.o == 4) {
                    LoadingPage.h = 0;
                    this.l = 5;
                    return;
                }
            }
        }

    }

    private void b(byte var1, byte var2) {
        byte[] var3;
        if ((var3 = NetPayloadBuilder.c((short) 4134, GlobalStatus.ad, (byte) var1, (byte) var2)) != null) {
            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4134, var3));
        } else {
            this.e.processException("获取上传指令数据错误!");
        }
    }

    public final void g(byte var1) {
        byte[] var2;
        if ((var2 = NetPayloadBuilder.f((short) 4125, GlobalStatus.ad, (byte) var1)) != null) {
            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4125, var2));
        } else {
            this.e.processException("获取上传指令数据错误!");
        }
    }

    private boolean aO() {
        if (this.ct == 0) {
            if (this.ar == 1 && GlobalStatus.fh != null) {
                for (int var1 = 0; var1 < GlobalStatus.fm.length; ++var1) {
                    if (this.e.ax == GlobalStatus.fk[var1]) {
                        return false;
                    }
                }
            }
        } else if (this.ct == 1 && this.ar == 1 && GlobalStatus.fu != null) {
            for (int var2 = 0; var2 < GlobalStatus.fu.length; ++var2) {
                if (this.e.ax == GlobalStatus.fv[var2]) {
                    return false;
                }
            }
        }

        return true;
    }

    private void aP() {
        int var1 = this.e.ax;
        LoadingPage.l = 0;
        this.cu = this.ct == 0 ? "没有物品" : "没有宠物";
        if (this.ct == 0) {
            if (this.ar == 0 && GlobalStatus.fo != null) {
                int var3 = 0;

                while (true) {
                    if (var3 >= GlobalStatus.ft.length) {
                        return;
                    }

                    if (var1 == GlobalStatus.fr[var3]) {
                        this.cu = GlobalStatus.b(this.e.l, var3);
                        break;
                    }

                    ++var3;
                }
            } else if (this.ar == 1 && GlobalStatus.fh != null) {
                int var2 = 0;

                while (true) {
                    if (var2 >= GlobalStatus.fm.length) {
                        return;
                    }

                    if (var1 == GlobalStatus.fk[var2]) {
                        this.cu = GlobalStatus.a(this.e.l, var2);
                        break;
                    }

                    ++var2;
                }
            }
        } else if (this.ct == 1) {
            if (this.ar == 0 && GlobalStatus.fx != null) {
                int var5 = 0;

                while (true) {
                    if (var5 >= GlobalStatus.fx.length) {
                        return;
                    }

                    if (var1 == GlobalStatus.fy[var5]) {
                        this.cu = GlobalStatus.d(this.e.l, var5);
                        break;
                    }

                    ++var5;
                }
            } else if (this.ar == 1 && GlobalStatus.fu != null) {
                for (int var4 = 0; var4 < GlobalStatus.fu.length; ++var4) {
                    if (var1 == GlobalStatus.fv[var4]) {
                        this.cu = GlobalStatus.c(this.e.l, var4);
                        return;
                    }
                }
            }
        }

    }

    private static void a(Graphics var0, int var1, int var2, int var3, int var4) {
        var0.setColor(20871);
        var0.drawLine(var1, var2, var3, var4);
        ++var2;
        ++var4;
        var0.setColor(1286064);
        var0.drawLine(var1, var2, var3, var4);
        ++var2;
        ++var4;
        var0.setColor(9820642);
        var0.drawLine(var1, var2, var3, var4);
        ++var2;
        ++var4;
        var0.setColor(1286064);
        var0.drawLine(var1, var2, var3, var4);
        ++var2;
        ++var4;
        var0.setColor(20871);
        var0.drawLine(var1, var2, var3, var4);
    }

    private void a(Graphics var1, int var2, int var3, int var4, byte var5) {
        MainCanvas.f.a(var1, MainCanvas.L, (int[]) null, (aj) null, 0, 0, var2, var3, 0, 0);
        MainCanvas.f.a(var1, MainCanvas.L, (int[]) null, (aj) null, 0, 0, var2 + var4 - MainCanvas.L.b, var3, 0, 0);
        var1.setColor(79948);
        int var6 = 0;
        if (var5 == 0 && GlobalStatus.fn > 0L && GlobalConfig.i.stringWidth(GlobalConfig.a(this.e.l, GlobalStatus.fn)) > var4 - (MainCanvas.L.b << 1)) {
            var6 = GlobalConfig.i.stringWidth(GlobalConfig.a(this.e.l, GlobalStatus.fn));
            var1.fillRect(var2 + (var4 - var6) / 2, var3, var6, MainCanvas.L.c);
        } else if (var5 == 1 && GlobalStatus.fg > 0L && GlobalConfig.i.stringWidth(GlobalConfig.a(this.e.l, GlobalStatus.fg)) > var4 - (MainCanvas.L.b << 1)) {
            var6 = GlobalConfig.i.stringWidth(GlobalConfig.a(this.e.l, GlobalStatus.fg));
            var1.fillRect(var2 + (var4 - var6) / 2, var3, var6, MainCanvas.L.c);
        } else {
            var6 = var4 - (MainCanvas.L.b << 1);
            var1.fillRect(var2 + MainCanvas.L.b, var3, var4 - (MainCanvas.L.b << 1), MainCanvas.L.c);
        }

        var1.setColor(16776917);
        if (var5 == 0 && GlobalStatus.fn > 0L) {
            var1.drawString(GlobalConfig.a(this.e.l, GlobalStatus.fn), var2 + var4 / 2 + 2, var3, 17);
        } else if (var5 == 1 && GlobalStatus.fg > 0L) {
            var1.drawString(GlobalConfig.a(this.e.l, GlobalStatus.fg), var2 + var4 / 2 + 2, var3, 17);
        }

        MainCanvas.f.a(var1, w, (int[]) null, (aj) null, 0, 0, var2 + (var4 - var6) / 2 - w.b - 2, var3 + 2, 0, 0);
    }

    private void d(int var1, int var2, int var3, int var4, int var5) {
        if (this.cx != null && this.cx.length > var1) {
            this.cx[var1][0] = var2;
            this.cx[var1][1] = var3;
            this.cx[var1][2] = var4;
            this.cx[var1][3] = var5;
        }

    }

    public final int e(int var1, int var2, int var3) {
        if (this.cv != null) {
            for (int var4 = 0; var4 < this.cv.length; ++var4) {
                if (var2 >= this.cv[var4][0] && var2 <= this.cv[var4][0] + this.cv[var4][2] && var3 >= this.cv[var4][1] && var3 <= this.cv[var4][1] + this.cv[var4][3]) {
                    if (this.e.ax != var4) {
                        this.ar = 0;
                        this.aE = this.e.ax = var4;
                        LoadingPage.l = 0;
                        return 0;
                    }

                    if (this.e.ax == var4 && this.ar == 0) {
                        return 1073741824;
                    }

                    this.ar = 0;
                    this.aE = this.e.ax;
                }
            }
        }

        if (this.cw != null) {
            for (int var5 = 0; var5 < this.cw.length; ++var5) {
                if (var2 >= this.cw[var5][0] && var2 <= this.cw[var5][0] + this.cw[var5][2] && var3 >= this.cw[var5][1] && var3 <= this.cw[var5][1] + this.cw[var5][3]) {
                    if (this.e.ax != var5) {
                        this.ar = 1;
                        this.aE = this.e.ax = var5;
                        LoadingPage.l = 0;
                        return 0;
                    }

                    if (this.e.ax == var5 && this.ar == 1) {
                        return 1073741824;
                    }

                    this.aE = this.e.ax;
                }
            }
        }

        if (this.cx != null) {
            if (var2 >= this.cx[0][0] && var2 <= this.cx[0][0] + this.cx[0][2] && var3 >= this.cx[0][1] && var3 <= this.cx[0][1] + this.cx[0][3]) {
                return 1024;
            }

            if (var2 >= this.cx[1][0] && var2 <= this.cx[1][0] + this.cx[1][2] && var3 >= this.cx[1][1] && var3 <= this.cx[1][1] + this.cx[1][3]) {
                return 2048;
            }
        }

        return var1;
    }

    private void v(Graphics var1) {
        this.e.aq.a(var1);
        LoadingPage.a(var1, this.e.aq.a + 5, this.e.aq.b + 29, this.e.aq.c - 11, this.e.aq.d - 30 - l_1.b(), 1);
        int var2 = this.e.aq.a + 8;
        int var3 = this.e.aq.b + 32;
        int var4 = this.e.aq.c - 16;
        int var5;
        int var6 = ((var5 = this.e.aq.d - 29 - 24 - 10) - (MainCanvas.L.c << 1) - MainCanvas.H.c - MainCanvas.G.c - (x.c << 1)) / 7;
        int var7 = 0;
        var3 = var3 + (var5 - (MainCanvas.L.c << 1) - MainCanvas.H.c - MainCanvas.G.c - (x.c << 1)) % 7 / 2 + var6;

        for (int var8 = 0; var8 < 8; ++var8) {
            int var10002 = var2 + (var4 - 144) % 9 / 2 + (var4 - 144) / 9 * (var8 + 1) + var8 * 18;
            short var14 = x.c;
            short var13 = x.b;
            int var11 = var10002;
            if (this.cv != null && this.cv.length > var8) {
                this.cv[var8][0] = var11;
                this.cv[var8][1] = var3;
                this.cv[var8][2] = var13;
                this.cv[var8][3] = var14;
            }

            MainCanvas.f.a(var1, x, (int[]) null, (aj) null, 0, 0, this.cv[var8][0], this.cv[var8][1], 0, 0);
        }

        if (this.ct == 0) {
            if (GlobalStatus.fs != null && GlobalStatus.fs.length > 0) {
                for (int var27 = 0; var27 < GlobalStatus.fs.length; ++var27) {
                    MainCanvas.f.a(var1, b(GlobalStatus.fs[var27]), (int[]) null, (aj) null, 0, 0, var2 + (var4 - 144) % 9 / 2 + (var4 - 144) / 9 * (GlobalStatus.fr[var27] + 1) + GlobalStatus.fr[var27] * 18 + 1, var3 + 1, 0, 0);
                    if (GlobalStatus.fq[var27] > 9) {
                        MainCanvas.f.a(var1, MainCanvas.num, (int[]) null, GlobalStatus.fq[var27] / 10, 0, 0, var2 + (var4 - 144) % 9 / 2 + (var4 - 144) / 9 * (GlobalStatus.fr[var27] + 1) + GlobalStatus.fr[var27] * 18 + 1, var3 + 1, 0, 0);
                        MainCanvas.f.a(var1, MainCanvas.num, (int[]) null, GlobalStatus.fq[var27] % 10, 0, 0, var2 + (var4 - 144) % 9 / 2 + (var4 - 144) / 9 * (GlobalStatus.fr[var27] + 1) + GlobalStatus.fr[var27] * 18 + 5, var3 + 1, 0, 0);
                    } else if (GlobalStatus.fq[var27] > 1) {
                        MainCanvas.f.a(var1, MainCanvas.num, (int[]) null, GlobalStatus.fq[var27] % 10, 0, 0, var2 + (var4 - 144) % 9 / 2 + (var4 - 144) / 9 * (GlobalStatus.fr[var27] + 1) + GlobalStatus.fr[var27] * 18 + 1, var3 + 1, 0, 0);
                    }
                }
            }
        } else if (this.ct == 1 && GlobalStatus.fx != null) {
            Image var28 = b((short) 1920).pngImage;

            for (int var9 = 0; var9 < GlobalStatus.fx.length; ++var9) {
                var1.drawImage(var28, var2 + (var4 - 144) % 9 / 2 + (var4 - 144) / 9 * (GlobalStatus.fy[var9] + 1) + GlobalStatus.fy[var9] * 18 + 1, var3 + 1, 0);
            }
        }

        if (this.ar == 0) {
            LoadingPage.d(var1, var2 + (var4 - 144) % 9 / 2 + (var4 - 144) / 9 * (this.e.ax + 1) + this.e.ax * 18, var3, 18, 18);
            var7 = var3;
        }

        var3 = var3 + x.c + var6;
        this.a((Graphics) var1, var2, (int) var3, (int) var4, (byte) 0);
        var3 += MainCanvas.K.c;
        a(var1, var2, var3, var2 + var4, var3);
        var3 += 5;
        var3 += var6;
        MainCanvas.f.a(var1, MainCanvas.G, (int[]) null, (aj) null, 0, 0, var2 + var4 / 2 - MainCanvas.G.b / 2, var3, 0, 0);
        var3 = var3 + MainCanvas.G.c + var6;

        for (int var29 = 0; var29 < 8; ++var29) {
            int var36 = var2 + (var4 - 144) % 9 / 2 + (var4 - 144) / 9 * (var29 + 1) + var29 * 18;
            short var35 = x.c;
            short var34 = x.b;
            int var33 = var36;
            if (this.cw != null && this.cw.length > var29) {
                this.cw[var29][0] = var33;
                this.cw[var29][1] = var3;
                this.cw[var29][2] = var34;
                this.cw[var29][3] = var35;
            }

            MainCanvas.f.a(var1, x, (int[]) null, (aj) null, 0, 0, this.cw[var29][0], this.cw[var29][1], 0, 0);
        }

        if (this.ct == 0) {
            if (GlobalStatus.fl != null && GlobalStatus.fl.length > 0) {
                for (int var30 = 0; var30 < GlobalStatus.fl.length; ++var30) {
                    MainCanvas.f.a(var1, b(GlobalStatus.fl[var30]), (int[]) null, (aj) null, 0, 0, var2 + (var4 - 144) % 9 / 2 + (var4 - 144) / 9 * (GlobalStatus.fk[var30] + 1) + GlobalStatus.fk[var30] * 18 + 1, var3 + 1, 0, 0);
                    if (GlobalStatus.fj[var30] > 9) {
                        MainCanvas.f.a(var1, MainCanvas.num, (int[]) null, GlobalStatus.fj[var30] / 10, 0, 0, var2 + (var4 - 144) % 9 / 2 + (var4 - 144) / 9 * (GlobalStatus.fk[var30] + 1) + GlobalStatus.fk[var30] * 18 + 1, var3 + 1, 0, 0);
                        MainCanvas.f.a(var1, MainCanvas.num, (int[]) null, GlobalStatus.fj[var30] % 10, 0, 0, var2 + (var4 - 144) % 9 / 2 + (var4 - 144) / 9 * (GlobalStatus.fk[var30] + 1) + GlobalStatus.fk[var30] * 18 + 5, var3 + 1, 0, 0);
                    } else if (GlobalStatus.fj[var30] > 1) {
                        MainCanvas.f.a(var1, MainCanvas.num, (int[]) null, GlobalStatus.fj[var30] % 10, 0, 0, var2 + (var4 - 144) % 9 / 2 + (var4 - 144) / 9 * (GlobalStatus.fk[var30] + 1) + GlobalStatus.fk[var30] * 18 + 1, var3 + 1, 0, 0);
                    }
                }
            }
        } else if (this.ct == 1 && GlobalStatus.fu != null) {
            Image var31 = b((short) 1920).pngImage;

            for (int var32 = 0; var32 < GlobalStatus.fu.length; ++var32) {
                var1.drawImage(var31, var2 + (var4 - 144) % 9 / 2 + (var4 - 144) / 9 * (GlobalStatus.fv[var32] + 1) + GlobalStatus.fv[var32] * 18 + 1, var3 + 1, 0);
            }
        }

        if (this.ar == 1) {
            LoadingPage.d(var1, var2 + (var4 - 144) % 9 / 2 + (var4 - 144) / 9 * (this.e.ax + 1) + this.e.ax * 18, var3, 18, 18);
            var7 = var3;
        }

        var3 += 18;
        var3 += var6;
        this.a((Graphics) var1, var2, (int) var3, (int) var4, (byte) 1);
        var3 += MainCanvas.K.c;
        a(var1, var2, var3, var2 + var4, var3);
        var3 += 5;
        var3 = var3 + var6 + (var5 - (MainCanvas.L.c << 1) - MainCanvas.H.c - MainCanvas.G.c - (x.c << 1)) % 7 / 2;
        this.d(0, var2 + var4 / 4 - MainCanvas.K.b / 2, var3, MainCanvas.H.b, MainCanvas.H.c);
        if (GlobalStatus.i == 0 && GlobalStatus.j == -1) {
            MainCanvas.f.a(var1, MainCanvas.I, (int[]) null, (aj) null, 0, 0, this.cx[0][0], this.cx[0][1], 0, 0);
        } else if (GlobalStatus.j == 0 && GlobalStatus.i == -1) {
            MainCanvas.f.a(var1, MainCanvas.I, (int[]) null, (aj) null, 0, 0, this.cx[0][0], this.cx[0][1], 0, 0);
        } else if (GlobalStatus.i == 0 && GlobalStatus.j == 0) {
            MainCanvas.f.a(var1, MainCanvas.J, (int[]) null, (aj) null, 0, 0, this.cx[0][0], this.cx[0][1], 0, 0);
        } else {
            MainCanvas.f.a(var1, MainCanvas.H, (int[]) null, (aj) null, 0, 0, this.cx[0][0], this.cx[0][1], 0, 0);
        }

        this.d(1, var2 + var4 * 3 / 4 - MainCanvas.K.b / 2, var3, MainCanvas.K.b, MainCanvas.K.c);
        MainCanvas.f.a(var1, MainCanvas.K, (int[]) null, (aj) null, 0, 0, this.cx[1][0], this.cx[1][1], 0, 0);
        if (this.cu != null) {
            var2 = var2 + (var4 - 144) % 9 / 2 + (var4 - 144) / 9 * (this.e.ax + 1) + this.e.ax * 18 + 16;
            LoadingPage.b(var1, this.cu, var2, var7 + 16, GlobalConfig.g + GlobalConfig.realHigh, 1);
        }

        if ((this.ar != 1 || this.l != 1 && this.l != 2) && (this.ar != 0 || this.l != 3)) {
            if (this.l == 5) {
                LoadingPage.a(var1, "确定放弃该次交易?", new String[]{"确定", "取消"});
            } else {
                if (this.l == 6) {
                    this.b(var1, "输入交易银两");
                }

            }
        } else {
            LoadingPage.c(var1);
        }
    }

    public final void a(short var1, byte var2) {
        this.bb = var1;
        this.l = 0;
        this.cy = var2;
        this.e.aq.b();
        this.e.aq.a(true);
        this.e.aq.a(this.cy == 2 ? "锻造列表" : "兑换列表");
        this.e.ar.a((Image[]) null, GlobalStatus.ex, (String[]) null, (String[]) null);
        this.e.au.a(this.cy == 2 ? "锻造" : "兑换");
        if (GlobalStatus.ew != null && GlobalStatus.ew.length > 0) {
            this.e.at.a(ap(this.e.ar.g()), GlobalConfig.i, (byte) 2);
        } else {
            this.e.at.a((String) null, GlobalConfig.i, (byte) 2);
        }

        this.e.at.a((byte) 1);
        this.e.aq.a((al) this.e.ar);
        this.e.aq.a((al) this.e.at);
        if (GlobalConfig.defaultHigh > 220) {
            this.e.aq.a((al) this.e.au);
        }

        this.e.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
        this.e.touchPageCase = this.e.k = 7;
        this.j = this.k = 31;
    }

    private static String ap(int var0) {
        StringBuffer var1;
        (var1 = new StringBuffer()).append("<6>需求：<1>");
        var1.append(GlobalStatus.ey[var0]);
        if (GlobalStatus.ez[var0].length() > 0) {
            var1.append("<6>不满足：<0>");
            var1.append(GlobalStatus.ez[var0]);
        }

        var1.append("<6>获得：");
        var1.append(GlobalStatus.eA[var0]);
        return var1.toString();
    }

    private void aq(int var1) {
        if (this.l == 0) {
            if (this.e.aq != null) {
                this.e.aq.b(var1);
            }

            if (var1 != 514 && var1 != 520 && var1 != 1 && var1 != 4) {
                if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                    if (var1 == 536870912) {
                        if (this.bb == 130) {
                            this.N.a(this.N.a);
                            return;
                        }

                        this.N();
                        return;
                    }
                } else if (GlobalStatus.ew != null && GlobalStatus.ew.length > 0) {
                    if (this.cy == 2) {
                        LoadingPage.a(this.e.ar.a() + 65 + GlobalConfig.f, GlobalConfig.j + 20 + this.e.ar.g() * GlobalConfig.j + GlobalConfig.g, new String[]{"锻造", "查看"}, true);
                        this.l = 2;
                        return;
                    }

                    this.a(99L);
                    this.l = 1;
                    return;
                }
            } else if (GlobalStatus.ew != null && GlobalStatus.ew.length > 0) {
                this.e.at.a(ap(this.e.ar.g()), GlobalConfig.i, (byte) 2);
                this.e.at.a((byte) 1);
                return;
            }
        } else if (this.l == 1) {
            this.b(var1);
            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    this.l = 0;
                    return;
                }
            } else {
                Object var2 = null;
                byte[] var3;
                if (!aj && !GlobalStatus.ev) {
                    var3 = NetPayloadBuilder.k((short) 4365, GlobalStatus.ad, GlobalStatus.ew[this.e.ar.g()], this.ag);
                } else {
                    var3 = NetPayloadBuilder.k((short) 4178, GlobalStatus.ad, GlobalStatus.ew[this.e.ar.g()], this.ag);
                }

                if (var3 == null) {
                    this.e.processException("获取上传指令数据错误!");
                    return;
                }

                NetPacket var4 = new NetPacket((short) 4178, var3);
                MainCanvas.netUtils.sendPacket(var4);
                this.e.a((String) null);
            }
        } else if (this.l == 2) {
            LoadingPage.b(var1);
            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    this.l = 0;
                }
            } else if (LoadingPage.o == 0) {
                Object var5 = null;
                byte[] var6;
                if (aj) {
                    var6 = NetPayloadBuilder.k((short) 4178, GlobalStatus.ad, GlobalStatus.ew[this.e.ar.g()], 1);
                } else {
                    var6 = NetPayloadBuilder.k((short) 4365, GlobalStatus.ad, GlobalStatus.ew[this.e.ar.g()], 1);
                }

                if (var6 == null) {
                    this.e.processException("获取上传指令数据错误!");
                    return;
                }

                NetPacket var7 = new NetPacket((short) 4178, var6);
                MainCanvas.netUtils.sendPacket(var7);
                this.e.a((String) null);
            } else if (LoadingPage.o == 1) {
                this.e.processException("没有此功能!");
                return;
            }
        }

    }

    public final void L() {
        this.cz = new int[42][4];
        this.aq = this.ar = 0;
        this.aB = (GlobalConfig.defaultWidth - C.b) / 2;
        this.aC = (GlobalConfig.defaultHigh - C.c) / 2;
        MainCanvas.f.a(this.f, h, i, false, true, 2109231);
        this.e.touchPageCase = this.e.k = 7;
        this.k = 32;
    }

    private void ar(int var1) {
        if (var1 != 1 && var1 != 514) {
            if (var1 != 520 && var1 != 4) {
                if (var1 != 8 && var1 != 516) {
                    if (var1 != 518 && var1 != 2) {
                        if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                            if (var1 == 536870912) {
                                if (GlobalConfig.defaultWidth >= 240) {
                                    this.e.m = 8;
                                    o = 35;
                                    p = 50;
                                }

                                this.e.q.setCurrent(this.e.aD);
                            }
                        } else {
                            String var2;
                            if ((var2 = this.e.aC.getString() + "<" + (this.ar * 6 + this.aq + 1) + ">").toCharArray().length <= 30) {
                                MainCanvas.a(this.e.aC, var2);
                                this.e.q.setCurrent(this.e.aD);
                                return;
                            }

                            this.e.processException("表情插入失败，聊天内容过长");
                        }

                    } else {
                        this.aq = this.aq >= 5 ? 0 : ++this.aq;
                    }
                } else {
                    this.aq = this.aq <= 0 ? 5 : --this.aq;
                }
            } else {
                this.ar = this.ar >= 6 ? 0 : ++this.ar;
            }
        } else {
            this.ar = this.ar <= 0 ? 6 : --this.ar;
        }
    }

    public final int d(int var1, int var2) {
        if (this.cz != null) {
            for (int var3 = 0; var3 < this.cz.length; ++var3) {
                if (var1 >= this.cz[var3][0] && var1 <= this.cz[var3][0] + this.cz[var3][2] && var2 >= this.cz[var3][1] && var2 <= this.cz[var3][1] + this.cz[var3][3]) {
                    var1 = (byte) (var3 % 6);
                    var2 = (byte) (var3 / 6);
                    if (var1 == this.aq && var2 == this.ar) {
                        return 268435456;
                    }

                    this.aq = var1;
                    this.ar = (byte) (var2 - 1);
                    return 4;
                }
            }
        }

        return var1 >= this.aB && var1 <= this.aB + C.b && var2 >= this.aC && var2 <= this.aC + C.c ? 0 : 536870912;
    }

    private void w(Graphics var1) {
        for (int var2 = 1; var2 < 7; ++var2) {
            for (int var3 = 0; var3 < 8; ++var3) {
                MainCanvas.f.a(var1, C, (int[]) null, var3 * 6 + var2, 0, 0, this.aB - 6 + (var2 - 1) * 19, this.aC + 2 + var3 * 19, 0, 0);
                int var10001 = var3 * 6 + var2 - 1;
                int var10002 = this.aB - 6 + (var2 - 1) * 19;
                int var10003 = this.aC + 2 + var3 * 19;
                boolean var4 = true;
                var4 = true;
                int var7 = var10003;
                int var6 = var10002;
                int var5 = var10001;
                if (this.cz != null && this.cz.length > var5) {
                    this.cz[var5][0] = var6;
                    this.cz[var5][1] = var7;
                    this.cz[var5][2] = 17;
                    this.cz[var5][3] = 17;
                }
            }
        }

        LoadingPage.d(var1, this.aB - 7 + this.aq * 19, this.aC + 1 + this.ar * 19, 17, 17);
        var1.setClip(0, 0, GlobalConfig.defaultWidth, GlobalConfig.defaultHigh);
    }

    private void p(byte var1) {
        byte[] var2;
        if ((var2 = NetPayloadBuilder.b((short) 4610, GlobalStatus.ad, (byte) var1, (byte) GlobalStatus.C[var1])) != null) {
            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4610, var2));
        } else {
            this.e.processException("获取上传指令数据错误!");
        }
    }

    private void q(byte var1) {
        byte[] var2;
        if ((var2 = NetPayloadBuilder.c((short) 4611, GlobalStatus.ad, (byte) var1)) != null) {
            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4611, var2));
            this.e.a((String) null);
        } else {
            this.e.processException("获取上传指令数据错误!");
        }
    }

    private void r(byte var1) {
        byte[] var2;
        if ((var2 = NetPayloadBuilder.c((short) 4609, GlobalStatus.ad, (byte) var1)) != null) {
            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4609, var2));
            this.e.a((String) null);
        } else {
            this.e.processException("获取上传指令数据错误!");
        }
    }

    private void s(byte var1) {
        byte[] var2;
        if ((var2 = NetPayloadBuilder.b((short) 4608, GlobalStatus.ad, (byte) var1)) != null) {
            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4608, var2));
            this.e.a((String) null);
        } else {
            this.e.processException("获取上传指令数据错误!");
        }
    }

    private void t(byte var1) {
        byte[] var2 = NetPayloadBuilder.d((short) 5120, GlobalStatus.ad, (byte) var1);
        this.a((short) 5120, var2, (String) null);
    }

    private void aQ() {
        if (this.j != 28) {
            this.cA = 0;
            this.cB = new int[2][4];
            this.cC = new int[2][4];
            this.e.k();
            this.d(true);
            this.e.aq.j();
            this.e.aq.a("游戏设置");
            this.e.ar.a((Image[]) null, this.al, (String[]) null, this.am);
            this.e.aq.a((al) this.e.ar);
            this.e.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
            this.e.touchPageCase = this.e.k;
            this.j = this.k = 28;
        } else {
            this.d(false);
        }
    }

    public final void d(boolean var1) {
        if (this.k == 28 || var1) {
            this.al = new String[]{"玩家数量", "聊天记录", "玩家名字", "NPC名字", "队员名字", "弹出信息", "迷你地图", "世界频道", "区域频道", "玩家宠物", "动态NPC", "战斗信息", "界面样式", "组队开关", "交易开关", "自动打怪", "PK开关", "帮派频道", "滚动提示", "任务自动"};
            this.am = new String[aW.length];

            for (byte var2 = 0; var2 < aW.length; ++var2) {
                String[] var10000;
                byte var10001;
                String var10002;
                if (var2 == 0 || aW[var2] != 0 && aW[var2] != 1) {
                    var10000 = this.am;
                    var10001 = var2;
                    var10002 = "";
                } else if (var2 == 12) {
                    var10000 = this.am;
                    var10001 = var2;
                    var10002 = "<无>";
                } else {
                    label132:
                    {
                        if (var2 != 13 && var2 != 14 && var2 != 15 && var2 != 16 && var2 != 19) {
                            if (var2 != 7 && var2 != 8 && var2 != 17) {
                                var10000 = this.am;
                                var10001 = var2;
                                var10002 = aW[var2] == 0 ? "<开>" : "<关>";
                                break label132;
                            }

                            if (var2 == 7) {
                                this.am[var2] = GlobalStatus.C[0] == 0 ? "<开>" : "<关>";
                            } else if (var2 == 8) {
                                this.am[var2] = GlobalStatus.C[1] == 0 ? "<开>" : "<关>";
                            } else if (var2 == 17) {
                                this.am[var2] = GlobalStatus.C[3] == 0 ? "<开>" : "<关>";
                            }
                            continue;
                        }

                        if (var2 == 13) {
                            this.am[var2] = GlobalStatus.B == 1 ? "<开>" : "<关>";
                        } else if (var2 == 16) {
                            this.am[var2] = GlobalStatus.D == 1 ? "<开>" : "<关>";
                        } else if (var2 == 14) {
                            this.am[var2] = GlobalStatus.A == 1 ? "<开>" : "<关>";
                        } else if (var2 == 15) {
                            this.am[var2] = GlobalStatus.bt ? "<开>" : "<关>";
                        } else if (var2 == 19) {
                            this.am[var2] = GlobalStatus.E == 1 ? "<开>" : "<关>";
                        }
                        continue;
                    }
                }

                var10000[var10001] = var10002;
            }

            this.e.ar.a((Image[]) null, this.al, (String[]) null, this.am);
            this.e.ar.a(this.aA, this.cA);
        }

    }

    private void as(int var1) {
        if (this.f.i != null) {
            this.e.aq.b(var1);
            if (var1 != 516 && var1 != 8) {
                if (var1 != 518 && var1 != 2) {
                    if (var1 == 536870912) {
                        this.e.j();
                        this.e.aq.j();
                        this.ax();
                        this.cB = null;
                        this.cC = null;
                    }
                } else {
                    this.aA = this.e.ar.h();
                    this.cA = this.e.ar.g();
                    if (this.e.ar.g() == 0) {
                        aW[0] = aW[0] >= 50 ? 50 : ++aW[0];
                        this.aQ();
                        return;
                    }

                    if (this.e.ar.g() == 1) {
                        aW[1] = aW[1] >= 50 ? 50 : ++aW[1];
                        this.aQ();
                        return;
                    }

                    if (this.e.ar.g() == 3) {
                        aW[3] = (byte) (aW[3] == 0 ? 1 : 0);
                        MainCanvas.f.a(this.f, h, i, true, true, 1009050);
                        this.aQ();
                        return;
                    }

                    if (this.e.ar.g() != 7 && this.e.ar.g() != 8 && this.e.ar.g() != 17) {
                        if (this.e.ar.g() == 13) {
                            this.r(GlobalStatus.B);
                            return;
                        }

                        if (this.e.ar.g() == 14) {
                            this.s(GlobalStatus.A);
                            return;
                        }

                        if (this.e.ar.g() == 15) {
                            this.O();
                            return;
                        }

                        if (this.e.ar.g() == 16) {
                            this.q(GlobalStatus.D);
                            return;
                        }

                        if (this.e.ar.g() == 19) {
                            this.t(GlobalStatus.E);
                            return;
                        }

                        aW[this.e.ar.g()] = (byte) (aW[this.e.ar.g()] == 1 ? 0 : 1);
                        this.aQ();
                        return;
                    }

                    if (this.e.ar.g() == 7) {
                        this.p((byte) 0);
                        return;
                    }

                    if (this.e.ar.g() == 8) {
                        this.p((byte) 1);
                        return;
                    }

                    if (this.e.ar.g() == 17) {
                        this.p((byte) 3);
                        return;
                    }
                }
            } else {
                this.aA = this.e.ar.h();
                this.cA = this.e.ar.g();
                if (this.e.ar.g() == 0 || this.e.ar.g() == 12) {
                    aW[this.e.ar.g()] = aW[this.e.ar.g()] <= 0 ? 0 : --aW[this.e.ar.g()];
                    return;
                }

                if (this.e.ar.g() == 1) {
                    aW[this.e.ar.g()] = aW[this.e.ar.g()] <= 10 ? 10 : --aW[this.e.ar.g()];
                    return;
                }

                if (this.e.ar.g() == 3) {
                    aW[3] = (byte) (aW[3] == 0 ? 1 : 0);
                    MainCanvas.f.a(this.f, h, i, true, true, 1009050);
                    this.aQ();
                    return;
                }

                if (this.e.ar.g() != 7 && this.e.ar.g() != 8 && this.e.ar.g() != 17) {
                    if (this.e.ar.g() == 13) {
                        this.r(GlobalStatus.B);
                        return;
                    }

                    if (this.e.ar.g() == 14) {
                        this.s(GlobalStatus.A);
                        return;
                    }

                    if (this.e.ar.g() == 15) {
                        this.O();
                        return;
                    }

                    if (this.e.ar.g() == 16) {
                        this.q(GlobalStatus.D);
                        return;
                    }

                    if (this.e.ar.g() == 18) {
                        aW[18] = (byte) (aW[18] == 0 ? 1 : 0);
                        this.d(true);
                        GlobalStatus.k = null;
                        this.dd = null;
                        return;
                    }

                    if (this.e.ar.g() == 19) {
                        this.t(GlobalStatus.E);
                        return;
                    }

                    aW[this.e.ar.g()] = (byte) (aW[this.e.ar.g()] == 0 ? 1 : 0);
                    this.aQ();
                    return;
                }

                if (this.e.ar.g() == 7) {
                    this.p((byte) 0);
                    return;
                }

                if (this.e.ar.g() == 8) {
                    this.p((byte) 1);
                    return;
                }

                if (this.e.ar.g() == 17) {
                    this.p((byte) 3);
                    return;
                }
            }

        }
    }

    private void b(int var1, int var2, int var3, int var4) {
        if (this.cB != null && this.cB.length > var1) {
            this.cB[var1][0] = var2;
            this.cB[var1][1] = var3;
            this.cB[var1][2] = 12;
            this.cB[var1][3] = GlobalConfig.j;
        }

        if (this.cC != null && this.cC.length > var1) {
            this.cC[var1][0] = var2 + 60 - 12;
            this.cC[var1][1] = var3;
            this.cC[var1][2] = 12;
            this.cC[var1][3] = GlobalConfig.j;
        }

    }

    public final int f(int var1, int var2, int var3) {
        if (this.cB != null && this.cC != null && this.cB.length > var1 && this.cC.length > var1) {
            if (var2 >= this.cB[var1][0] && var2 <= this.cB[var1][0] + this.cB[var1][2] && var3 >= this.cB[var1][1] && var3 <= this.cB[var1][1] + this.cB[var1][3]) {
                return 8;
            }

            if (var2 >= this.cC[var1][0] && var2 <= this.cC[var1][0] + this.cC[var1][2] && var3 >= this.cC[var1][1] && var3 <= this.cC[var1][1] + this.cC[var1][3]) {
                return 2;
            }
        }

        return 0;
    }

    public final void b(String var1, byte var2) {
        byte[] var3;
        if ((var3 = NetPayloadBuilder.c((short) 4113, GlobalStatus.ad, var1, (byte) var2)) != null) {
            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4113, var3));
        } else {
            this.e.processException("获取上传指令数据错误!");
        }
    }

    private void a(ce var1) {
        if (this.k != 18 && (aW[5] != 1 || var1.b == 5) && (aW[7] != 1 || var1.b != 0) && (aW[8] != 1 || var1.b != 1) && (aW[17] != 1 || var1.b != 3) && (aW[7] != 1 || var1.b != 6)) {
            String[] var2;
            if ((var2 = LoadingPage.a("[" + var1.d + "]" + var1.e, GlobalConfig.i, GlobalConfig.defaultWidth - 5)) != null && var2.length > 0) {
                this.u((byte) var2.length);

                for (int var3 = 0; var3 < var2.length; ++var3) {
                    this.cD.insertElementAt(new b(var2[var3], LoadingPage.n[var1.a]), this.cD.size());
                }
            }

        }
    }

    private void u(byte var1) {
        while (this.cD.size() > 20 - var1) {
            this.cD.removeElementAt(this.cD.size() - 1);
        }

    }

    private void x(Graphics var1) {
        b var2 = null;
        int var3 = 0;
        int var4;
        var4 = (var4 = this.cD.size()) < 3 ? var4 : 3;
        int var5;
        var5 = (var5 = GlobalConfig.j) > 16 ? var5 : 16;

        for (int var6 = 0; var6 < 3; ++var6) {
            var2 = null;
            if (var6 < this.cD.size()) {
                var2 = (b) this.cD.elementAt(var3);
            }

            if (var2 != null) {
                LoadingPage.a(var1, 2109231, 175, 0, GlobalConfig.defaultHigh - (var4 - var3) * var5, GlobalConfig.defaultWidth, var5);
                var2.a(var1, MainCanvas.f, C, 2, GlobalConfig.defaultHigh - (var4 - var3) * var5);
                ++var3;
            }
        }

    }

    public final int e(int var1, int var2) {
        for (int var3 = 0; var3 < this.cF.length - 2; ++var3) {
            if (var1 >= this.cF[var3][0] && var1 <= this.cF[var3][0] + this.cF[var3][2] && var2 >= this.cF[var3][1] && var2 <= this.cF[var3][1] + this.cF[var3][3]) {
                if (this.az != var3) {
                    this.az = (byte) (var3 - 1);
                    return 2;
                }

                return 1073741824;
            }
        }

        if (var1 > this.cG[0] && var1 < this.cG[0] + this.cG[2] && var2 > this.cG[1] && var2 < this.cG[1] + this.cG[3]) {
            return 0;
        } else {
            return 536870912;
        }
    }

    public final void a(Graphics var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        LoadingPage.l = 0;
        var1.setColor(15975);
        var1.drawRect(var2, var3, var6 * 17 + 4, 21);
        int var10003 = var6 * 17 + 4;
        byte var11 = 21;
        int var10 = var10003;
        this.cG[0] = var2;
        this.cG[1] = var3;
        this.cG[2] = var10;
        this.cG[3] = var11;
        var1.setColor(11267556);
        var1.drawRect(var2 + 1, var3 + 1, var6 * 17 + 2, 19);

        for (int var13 = 0; var13 < var6; ++var13) {
            for (int var14 = 0; var14 < 1; ++var14) {
                var1.drawImage(x.pngImage, var2 + 2 + var13 * 17, var3 + 2 + var14 * 17, 20);
                int var10002 = var2 + 2 + var13 * 17;
                var10003 = var3 + 2 + var14 * 17;
                byte var12 = 17;
                var11 = 17;
                var10 = var10003;
                int var9 = var10002;
                if (this.cF.length >= var13) {
                    this.cF[var13][0] = var9;
                    this.cF[var13][1] = var10;
                    this.cF[var13][2] = var11;
                    this.cF[var13][3] = var12;
                }
            }
        }

    }

    private void y(Graphics var1) {
        try {
            by var2 = null;
            int var3 = h - this.g();
            int var4 = i - this.h();

            for (int var5 = 0; var5 < bl.size(); ++var5) {
                if ((var2 = (by) bl.elementAt(var5)).a && var2 != null) {
                    if (var2.b == 6) {
                        bx var6 = (bx) var2.c;
                        MainCanvas.f.a(var1, var6, ((cb) var2).d, var3, var4, var6.e, var6.f, 0);
                    } else if (var2.b == 1) {
                        this.I.a(var1, MainCanvas.f, var3, var4, (byte) 0);
                    } else if (var2.b == 2) {
                        bl var10000 = (bl) var2.c;
                        boolean var12 = false;
                        PngUtil var7 = MainCanvas.f;
                        bl var13 = var10000;
                        if (var10000.g != null) {
                            var7.a(var1, (Frame1) var13.g, (int[]) null, var3, var4, var13.j + 8, var13.k + 16, 20, 0);
                            if (var13.e != null && aW[2] == 0) {
                                if (var13.b != null && !var13.b.equals("")) {
                                    LoadingPage.a(var1, var13.b, var13.j - var3 + 8, var13.k - var4 - (GlobalConfig.j << 1) - var13.g.j() + 16, 17, var13.a(var13.u, var13.p));
                                }

                                LoadingPage.a(var1, (String) var13.e, (int) (var13.j - var3 + 8), var13.k - var4 - GlobalConfig.j - var13.g.j() + 16, 17, var13.a(var13.u, var13.p), 0);
                            }

                            if (var13.p == 1 && y != null) {
                                var7.a(var1, y, (int[]) null, (aj) null, var3, var4, var13.j + 8 - (aW[2] == 0 ? GlobalConfig.i.stringWidth(var13.e) / 2 + y.b : y.b / 2), var13.k - GlobalConfig.j - 18, 20, 0);
                            } else if (var13.p == 0 && z != null) {
                                var7.a(var1, z, (int[]) null, (aj) null, var3, var4, var13.j + 8 - (aW[2] == 0 ? GlobalConfig.i.stringWidth(var13.e) / 2 + z.b : z.b / 2), var13.k - GlobalConfig.j - 18, 20, 0);
                            }
                        }
                    } else if (var2.b == 3) {
                        bp_1 var27 = (bp_1) var2.c;
                        boolean var14 = false;
                        PngUtil var22 = MainCanvas.f;
                        bp_1 var15 = var27;
                        if (var27.g != null) {
                            var22.a(var1, (Frame1) var15.g, (int[]) null, var3, var4, var15.j + 8, var15.k + 16, 20, 0);
                            if (var15.e != null && (var15.b.equals(GlobalStatus.ad) || aW[4] == 0)) {
                                if (var15.c != null && !var15.c.equals("")) {
                                    LoadingPage.a(var1, var15.c, var15.j - var3 + 8, var15.k - var4 - (GlobalConfig.j << 1) - var15.g.j() + 16, 17, 65280);
                                }

                                LoadingPage.a(var1, (String) var15.e, (int) (var15.j - var3 + 8), var15.k - var4 - GlobalConfig.j - var15.g.j() + 16, 17, 65280, 0);
                            }

                            if (var15.s == 1) {
                                var22.a(var1, y, (int[]) null, (aj) null, var3, var4, var15.j + 8 - (aW[4] == 0 ? GlobalConfig.i.stringWidth(var15.e) / 2 + y.b : y.b / 2), var15.k - GlobalConfig.j - 18, 20, 0);
                            } else if (var15.s == 0) {
                                var22.a(var1, z, (int[]) null, (aj) null, var3, var4, var15.j + 8 - (aW[4] == 0 ? GlobalConfig.i.stringWidth(var15.e) / 2 + z.b : z.b / 2), var15.k - GlobalConfig.j - 18, 20, 0);
                            }
                        }
                    } else if (var2.b == 5) {
                        az_1 var20 = (az_1) var2.c;
                        if (aW[10] == 0) {
                            int var16 = var20.c / 16;
                            int var23 = var20.d / 16;
                            int var8 = (this.I.j + 8) / 16;
                            int var9 = (this.I.k + 8) / 16;
                            if ((var16 != var8 || var23 != var9) && (var16 - 1 != var8 || var23 != var9) && (var16 + 1 != var8 || var23 != var9) && (var16 - 1 != var8 || var23 - 1 != var9) && (var16 != var8 || var23 - 1 != var9) && (var16 + 1 != var8 || var23 - 1 != var9) && (var16 - 1 != var8 || var23 + 1 != var9) && (var16 != var8 || var23 + 1 != var9) && (var16 + 1 != var8 || var23 + 1 != var9)) {
                                var20.x = false;
                                var20.e();
                            } else {
                                var20.x = true;
                            }
                        }

                        boolean var17 = false;
                        PngUtil var24 = MainCanvas.f;
                        if (aW[10] == 1) {
                            if (var20.w != null && var20.w.k != null) {
                                var24.a(var1, var20.w.k[var20.w.f], var20.w.g(), var20.w.h(), (int[]) null, var3, var4, var20.c, var20.d, 20, 0);
                            }
                        } else if (var20.w != null && var20.w.k != null) {
                            var24.a(var1, (Frame1) var20.w, (int[]) null, var3, var4, var20.c, var20.d, 20, 0);
                        }

                        if (var20.b != null && var20.x && aW[3] == 1) {
                            LoadingPage.a(var1, (String) var20.b, (int) (var20.c - var3), var20.d - (var20.w == null ? 30 : var20.w.j()) - GlobalConfig.j - var4, 17, 255, 16777215);
                        }

                        var20.a(var1, var24, var3, var4, (byte) 0);
                    } else if (var2.b == 4) {
                        ((au) var2.c).a(var1, MainCanvas.f, var3, var4, (byte) 0);
                    } else if (var2.b == 7) {
                        ((s) var2.c).a(var1, MainCanvas.f, var3, var4, (byte) 0);
                    } else if (var2.b == 8) {
                        ((bv) var2.c).a(var1, MainCanvas.f, var3, var4, (byte) 0);
                    }
                }
            }

            if (aW[10] == 1 && GlobalStatus.t != null) {
                for (int var19 = 0; var19 < GlobalStatus.t.length; ++var19) {
                    if (GlobalStatus.t[var19] != null) {
                        int var21 = GlobalStatus.t[var19].c / 16;
                        int var18 = GlobalStatus.t[var19].d / 16;
                        int var25 = (this.I.j + 8) / 16;
                        int var26 = (this.I.k + 8) / 16;
                        if ((var21 != var25 || var18 != var26) && (var21 - 1 != var25 || var18 != var26) && (var21 + 1 != var25 || var18 != var26) && (var21 - 1 != var25 || var18 - 1 != var26) && (var21 != var25 || var18 - 1 != var26) && (var21 + 1 != var25 || var18 - 1 != var26) && (var21 - 1 != var25 || var18 + 1 != var26) && (var21 != var25 || var18 + 1 != var26) && (var21 + 1 != var25 || var18 + 1 != var26)) {
                            GlobalStatus.t[var19].x = false;
                            GlobalStatus.t[var19].e();
                        } else {
                            GlobalStatus.t[var19].x = true;
                        }

                        GlobalStatus.t[var19].a(var1, MainCanvas.f, var3, var4, (byte) 0);
                    }
                }
            }

        } catch (Exception var10) {
            this.c("系统异常[9]");
            ((Throwable) var10).printStackTrace();
        }
    }

    private void z(Graphics var1) {
        if (GlobalStatus.G() && GlobalStatus.ih != null) {
            for (int var2 = 0; var2 < GlobalStatus.ih.length; ++var2) {
                this.cI[0] = GlobalStatus.ie[var2];
                this.cI[1] = GlobalStatus.if_2[var2];
                this.cI[2] = GlobalStatus.ig[var2];
                this.cI[3] = GlobalStatus.ih[var2];
                var1.setColor(3781962);
                var1.drawRect(this.cI[0] - h + this.g(), this.cI[1] - i + this.h(), this.cI[2], this.cI[3]);
                var1.drawRect(this.cI[0] - h + this.g() - 1, this.cI[1] - i - 1 + this.h(), this.cI[2] + 2, this.cI[3] + 2);
            }
        }

    }

    private void A(Graphics var1) {
        if (B != null && v.pngImage != null && bq != null) {
            int var2 = GlobalConfig.defaultWidth - 67;
            var1.drawImage(bq.pngImage, var2, 5, 20);
            var1.drawImage(v.pngImage, var2 + 37, 8, 20);
            if (GlobalStatus.ak < 10) {
                MainCanvas.f.a(var1, B, (int[]) null, GlobalStatus.ak % 10 + 1, 0, 0, var2 + 23, 25, 0, 0);
            } else if (GlobalStatus.ak >= 10 && GlobalStatus.ak <= 99) {
                MainCanvas.f.a(var1, B, (int[]) null, GlobalStatus.ak / 10 + 1, 0, 0, var2 + 20, 25, 0, 0);
                MainCanvas.f.a(var1, B, (int[]) null, GlobalStatus.ak % 10 + 1, 0, 0, var2 + 25, 25, 0, 0);
            } else {
                MainCanvas.f.a(var1, B, (int[]) null, GlobalStatus.ak % 10 + 1, 0, 0, var2 + 28, 25, 0, 0);
                MainCanvas.f.a(var1, B, (int[]) null, (GlobalStatus.ak - GlobalStatus.ak / 100 * 100) / 10 + 1, 0, 0, var2 + 23, 25, 0, 0);
                MainCanvas.f.a(var1, B, (int[]) null, GlobalStatus.ak / 100 + 1, 0, 0, var2 + 18, 25, 0, 0);
            }

            int var3 = GlobalStatus.aN * 30 / GlobalStatus.aM;
            var1.setColor(16472935);
            var1.drawLine(var2 + 32 - var3, 7, var2 + 32, 7);
            var1.setColor(16717352);
            var1.drawLine(var2 + 32 - var3, 8, var2 + 32, 8);
            var1.setColor(11731460);
            var1.drawLine(var2 + 32 - var3, 9, var2 + 32, 9);
            var3 = GlobalStatus.aP * 30 / GlobalStatus.aO;
            var1.setColor(1937134);
            var1.drawLine(var2 + 32 - var3, 13, var2 + 32, 13);
            var1.setColor(881618);
            var1.drawLine(var2 + 32 - var3, 14, var2 + 32, 14);
            var1.setColor(21145);
            var1.drawLine(var2 + 32 - var3, 15, var2 + 32, 15);
            var3 = 0;
            switch (GlobalStatus.h) {
                case 0:
                    var3 = 30;
                    break;
                case 1:
                    var3 = 20;
                    break;
                case 2:
                    var3 = 10;
                    break;
                default:
                    var3 = 0;
            }

            var1.setColor(14811050);
            var1.drawLine(var2 + 32 - var3, 19, var2 + 32, 19);
            var1.setColor(10873387);
            var1.drawLine(var2 + 32 - var3, 20, var2 + 32, 20);
            var1.setColor(7252485);
            var1.drawLine(var2 + 32 - var3, 21, var2 + 32, 21);
            if (GlobalStatus.bf != 0) {
                var1.setColor(this.e.al++ % 8L / 4L == 0L ? 15984780 : 15953687);
                var1.fillRect(var2 + 2, 24, br.b - 2, br.c);
                var1.drawImage(br.pngImage, var2, 24, 20);
            }

            int var4 = 0;
            if (GlobalStatus.bs >= 0 && GlobalStatus.q != null) {
                for (int var5 = 0; var5 < GlobalStatus.q.length; ++var5) {
                    if (GlobalStatus.q[var5] != null && !GlobalStatus.q[var5].b.equals(GlobalStatus.ad)) {
                        LoadingPage.a(var1, (String) GlobalStatus.q[var5].e, (int) (GlobalConfig.defaultWidth - 2 - GlobalConfig.i.stringWidth(GlobalStatus.q[var5].e)), 60 + GlobalConfig.j * var4, 0, 65280, 0);
                        ++var4;
                    }
                }
            }

        }
    }

    public final void M() {
        if (!this.c) {
            try {
                this.I.a(this.f, MainCanvas.f, this.e.ak);
                bl.removeAllElements();
                PngUtil.a(u, this.e.ak);
                PngUtil.a(t_2, this.e.ak);
                PngUtil.a(s, this.e.ak);
                if (GlobalStatus.s != 0 && this.I.d != null && this.I.d.f != null) {
                    if (c((int) this.I.d.h, (int) this.I.d.i, (int) this.I.d.f.g(), (int) this.I.d.f.h())) {
                        bl.addElement(new by((byte) 4, this.I.d, true));
                    } else {
                        bl.addElement(new by((byte) 4, this.I.d, false));
                    }
                }

                for (int var3 = 0; var3 < bm.size(); ++var3) {
                    au var5;
                    if ((var5 = (au) bm.elementAt(var3)).f != null) {
                        if (c((int) var5.h, (int) var5.i, (int) var5.f.g(), (int) var5.f.h())) {
                            bl.addElement(new by((byte) 4, var5, true));
                        } else {
                            bl.addElement(new by((byte) 4, var5, false));
                        }
                    }
                }

                if (GlobalStatus.t != null) {
                    for (int var1 = 0; var1 < GlobalStatus.t.length; ++var1) {
                        if (GlobalStatus.t[var1] != null) {
                            if (c((int) GlobalStatus.t[var1].c, (int) (GlobalStatus.t[var1].d - GlobalStatus.t[var1].d()), (int) (GlobalStatus.t[var1].c() / 2), (int) GlobalStatus.t[var1].d())) {
                                bl.addElement(new by((byte) 5, GlobalStatus.t[var1], true));
                            } else {
                                bl.addElement(new by((byte) 5, GlobalStatus.t[var1], false));
                            }
                        }
                    }
                }

                if (GlobalStatus.o != null) {
                    for (int var10 = 0; var10 < GlobalStatus.o.length; ++var10) {
                        if (GlobalStatus.o[var10] != null && GlobalStatus.o[var10].g != null) {
                            if (c((int) GlobalStatus.o[var10].j, (int) GlobalStatus.o[var10].k, (int) GlobalStatus.o[var10].g.g(), (int) GlobalStatus.o[var10].g.h())) {
                                bl.addElement(new by((byte) 2, GlobalStatus.o[var10], true));
                            } else {
                                bl.addElement(new by((byte) 2, GlobalStatus.o[var10], false));
                            }
                        }
                    }
                }

                if (GlobalStatus.bs != -1 && GlobalStatus.s == 0 && GlobalStatus.q != null) {
                    for (int var11 = 0; var11 < GlobalStatus.q.length; ++var11) {
                        if (GlobalStatus.q[var11] != null && GlobalStatus.q[var11].g != null && (GlobalStatus.bs != 1 || !GlobalStatus.q[var11].b.equals(GlobalStatus.ad))) {
                            if (c((int) GlobalStatus.q[var11].j, (int) GlobalStatus.q[var11].k, (int) GlobalStatus.q[var11].g.g(), (int) GlobalStatus.q[var11].g.h())) {
                                bl.addElement(new by((byte) 3, GlobalStatus.q[var11], true));
                            } else {
                                bl.addElement(new by((byte) 3, GlobalStatus.q[var11], false));
                            }
                        }
                    }
                }

                if (GlobalStatus.bs != 0 || GlobalStatus.s == 1 && GlobalStatus.bs == 0) {
                    bl.addElement(new by((byte) 1, this.I, true));
                }

                ao_1 var12 = this;

                for (int var20 = 0; var20 < var12.aO.size(); ++var20) {
                    s var25;
                    if (c((int) (var25 = (s) var12.aO.elementAt(var20)).h, (int) var25.i, (int) ((au) var25).d(), (int) ((au) var25).e())) {
                        bl.addElement(new by((byte) 7, var25, true));
                    } else {
                        bl.addElement(new by((byte) 7, var25, false));
                    }
                }

                if (GlobalStatus.ij != null) {
                    for (int var13 = 0; var13 < GlobalStatus.ij.size(); ++var13) {
                        bv var21;
                        if (c((int) (var21 = (bv) GlobalStatus.ij.elementAt(var13)).e, (int) var21.f, (int) var21.a(), (int) var21.b())) {
                            bl.addElement(new by((byte) 8, var21, true));
                        }
                    }
                }

                var12 = this;
                if (this.f != null && this.f.l != null) {
                    int var22 = bl.size();

                    for (int var26 = 0; var26 < var22; ++var26) {
                        by var6;
                        if ((var6 = (by) bl.elementAt(var26)).a) {
                            by var4 = var6;
                            ao_1 var2 = var12;
                            if (var12.f.l != null) {
                                int[] var10000 = var12.cH;
                                short var10002;
                                switch ((var6 = var6).b) {
                                    case 1:
                                        var10002 = ((ar) var6.c).o();
                                        break;
                                    case 2:
                                        var10002 = ((bl) var6.c).o();
                                        break;
                                    case 3:
                                        var10002 = ((bp_1) var6.c).o();
                                        break;
                                    case 4:
                                        var10002 = ((au) var6.c).c();
                                        break;
                                    case 5:
                                        var10002 = ((az_1) var6.c).a();
                                        break;
                                    case 6:
                                    default:
                                        var10002 = 0;
                                        break;
                                    case 7:
                                        var10002 = ((s) var6.c).c();
                                        break;
                                    case 8:
                                        var10002 = ((bv) var6.c).e;
                                }

                                var10000[0] = var10002;
                                var10000 = var12.cH;
                                switch (var6.b) {
                                    case 1:
                                        var10002 = ((ar) var6.c).n();
                                        break;
                                    case 2:
                                        var10002 = ((bl) var6.c).n();
                                        break;
                                    case 3:
                                        var10002 = ((bp_1) var6.c).n();
                                        break;
                                    case 4:
                                        var10002 = ((au) var6.c).b();
                                        break;
                                    case 5:
                                        var10002 = ((az_1) var6.c).b();
                                        break;
                                    case 6:
                                    default:
                                        var10002 = 0;
                                        break;
                                    case 7:
                                        var10002 = ((s) var6.c).b();
                                        break;
                                    case 8:
                                        var10002 = ((bv) var6.c).f;
                                }

                                var10000[1] = var10002;
                                var10000 = var12.cH;
                                switch (var6.b) {
                                    case 1:
                                        var10002 = ((ar) var6.c).p();
                                        break;
                                    case 2:
                                        var10002 = ((bl) var6.c).p();
                                        break;
                                    case 3:
                                        var10002 = ((bp_1) var6.c).p();
                                        break;
                                    case 4:
                                        var10002 = ((au) var6.c).d();
                                        break;
                                    case 5:
                                        var10002 = ((az_1) var6.c).c();
                                        break;
                                    case 6:
                                    default:
                                        var10002 = 0;
                                        break;
                                    case 7:
                                        var10002 = ((s) var6.c).d();
                                        break;
                                    case 8:
                                        var10002 = ((bv) var6.c).a();
                                }

                                var10000[2] = var10002;
                                var10000 = var12.cH;
                                switch (var6.b) {
                                    case 1:
                                        var10002 = ((ar) var6.c).q();
                                        break;
                                    case 2:
                                        var10002 = ((bl) var6.c).q();
                                        break;
                                    case 3:
                                        var10002 = ((bp_1) var6.c).q();
                                        break;
                                    case 4:
                                        var10002 = ((au) var6.c).e();
                                        break;
                                    case 5:
                                        var10002 = ((az_1) var6.c).d();
                                        break;
                                    case 6:
                                    default:
                                        var10002 = 0;
                                        break;
                                    case 7:
                                        var10002 = ((s) var6.c).e();
                                        break;
                                    case 8:
                                        var10002 = ((bv) var6.c).b();
                                }

                                var10000[3] = var10002;
                                int var30 = 0;

                                for (int var7 = 0; var7 < var2.f.l.length; ++var7) {
                                    var2.cI[2] = var2.f.n[var7][0];
                                    var2.cI[3] = var2.f.n[var7][1];
                                    var2.cI[0] = var2.f.l[var7].e;
                                    var2.cI[1] = var2.f.l[var7].f;
                                    var30 = var2.cI[1] + var2.f.n[var7][1];
                                    if (c(var2.cI[0], var2.cI[1], var2.cI[2], var2.cI[3]) && var4.a() < var30 && PngUtil.a(var2.cH, var2.cI)) {
                                        int[] var32 = new int[4];
                                        MainCanvas.f.a(var2.cH, var2.cI, var32);
                                        bl.addElement(new cb((byte) 6, var2.f.l[var7], (short) var2.f.n[var7][1], (short) var2.f.n[var7][0], var32));
                                    }
                                }
                            }
                        }
                    }
                }

                try {
                    if (!bl.isEmpty() && bl.size() > 1) {
                        for (int var33 = 0; var33 < bl.size() - 1; ++var33) {
                            for (int var18 = 0; var18 < bl.size(); ++var18) {
                                if (var18 < bl.size() - 1) {
                                    by var23 = (by) bl.elementAt(var18);
                                    by var27;
                                    if (var18 + 1 <= bl.size()) {
                                        var27 = (by) bl.elementAt(var18 + 1);
                                    } else {
                                        var27 = null;
                                    }

                                    if (var23 != null && var27 != null && var23.a() > var27.a()) {
                                        bl.setElementAt(var23, var18 + 1);
                                        bl.setElementAt(var27, var18);
                                    }
                                }
                            }
                        }
                    }
                } catch (Exception var8) {
                }

                var12 = null;
                if (bl != null) {
                    for (int var19 = 0; var19 < bl.size(); ++var19) {
                        by var16;
                        if ((var16 = (by) bl.elementAt(var19)) != null && var16.c != null && (var16.b != 1 || this.cK >= 0)) {
                            if (var16.b == 2) {
                                ((bl) var16.c).a(this.f, MainCanvas.f, this.e.ak);
                            } else if (var16.b == 3) {
                                ((bp_1) var16.c).a(MainCanvas.f, this.e.ak);
                            } else if (var16.b == 5) {
                                az_1 var37 = (az_1) var16.c;
                                long var28 = this.e.ak;
                                PngUtil var24 = MainCanvas.f;
                                az_1 var17 = var37;
                                if (var37.w != null && aW[10] == 0) {
                                    PngUtil.a(var17.w, var28);
                                }
                            } else if (var16.b == 4) {
                                ((au) var16.c).a(this.f, MainCanvas.f, this.e.ak);
                            } else if (var16.b == 7) {
                                ((s) var16.c).a(this.f, MainCanvas.f, this.e.ak);
                            }
                        }
                    }
                }

            } catch (Exception var9) {
                bl.removeAllElements();
                this.c("系统异常[7]");
            }
        }
    }

    private static boolean c(int var0, int var1, int var2, int var3) {
        int var4 = h;
        int var5 = i;
        return var0 - var4 + var2 >= 0 && var0 - var4 <= GlobalConfig.defaultWidth && var1 - var5 + var3 >= 0 && var1 - var5 <= GlobalConfig.defaultHigh;
    }

    private void aR() {
        if (this.k == 18) {
            this.aL();
            this.aJ();
        }

    }

    private static void b(ce var0) {
        int var1 = 0;
        ck.insertElementAt(var0, 0);

        for (int var3 = 0; var3 < ck.size(); ++var3) {
            if (((ce) ck.elementAt(var3)).b == var0.b) {
                ++var1;
                if (var1 >= aW[1]) {
                    ck.removeElementAt(var3);
                    return;
                }
            }
        }

    }

    public final void N() {
        MainCanvas.f.a(this.f, h, i, true, false, 1009050);
        this.e.touchPageCase = this.e.k;
        this.j = this.k = 0;
    }

    public final void c(String var1) {
        ce var2 = new ce("系统", (byte) 5, var1, (byte) 0);
        ck.insertElementAt(var2, 0);
        this.a(var2);
    }

    public final void h(byte var1) {
        byte[] var2;
        if ((var2 = NetPayloadBuilder.a((short) 4195, GlobalStatus.ad, (byte) var1, (short) this.I.j, (short) this.I.k)) != null) {
            NetPacket var3 = new NetPacket((short) 4195, var2);
            MainCanvas.netUtils.sendPacket(var3);
            this.e.a((String) null);
        } else {
            this.e.processException("获取上传指令数据错误!");
        }
    }

    private void aS() {
        byte[] var1;
        if ((var1 = NetPayloadBuilder.a((short) 4140, GlobalStatus.ad, (short) GlobalStatus.gQ)) != null) {
            NetPacket var2 = new NetPacket((short) 4140, var1);
            MainCanvas.netUtils.sendPacket(var2);
            this.e.a((String) null);
        } else {
            this.e.processException("获取上传指令数据错误!");
        }
    }

    public final void O() {
        byte[] var1 = NetPayloadBuilder.j((short) 4177, GlobalStatus.ad, (int) (GlobalStatus.bt ? 1 : 0));
        NetPacket var2 = new NetPacket((short) 4177, var1);
        MainCanvas.netUtils.sendPacket(var2);
        this.e.a((String) null);
    }

    public final void P() {
        if (cL && i()) {
            cL = false;
            int[][] var1 = null;
            if (GlobalStatus.t != null) {
                var1 = new int[GlobalStatus.t.length][2];

                for (int var2 = 0; var2 < GlobalStatus.t.length; ++var2) {
                    if (GlobalStatus.t[var2] != null) {
                        var1[var2][0] = GlobalStatus.t[var2].a;
                        var1[var2][1] = GlobalStatus.t[var2].U;
                        GlobalStatus.t[var2] = null;
                    }
                }

                GlobalStatus.t = null;
            }

            if (GlobalStatus.u.size() > 0) {
                GlobalStatus.t = (az_1[]) GlobalStatus.u.elementAt(GlobalStatus.u.size() - 1);
                this.cV = 0;
                GlobalStatus.u.removeAllElements();
            }

            if (GlobalStatus.t != null && var1 != null && var1.length > 0) {
                for (int var7 = 0; var7 < GlobalStatus.t.length; ++var7) {
                    for (int var3 = 0; var3 < var1.length; ++var3) {
                        if (var1[var3] != null && GlobalStatus.t[var7].a == var1[var3][0]) {
                            GlobalStatus.t[var7].U = (byte) var1[var3][1];
                        }
                    }
                }
            }

            System.currentTimeMillis();
            ao_1 var6 = this;
            if (this.cV == 0 && GlobalStatus.t != null) {
                if (GlobalConfig.l == 2) {
                    MainCanvas.ah.c();
                }

                this.bj.removeAllElements();
                short[] var8 = new short[GlobalStatus.t.length];
                short[] var9 = new short[GlobalStatus.t.length];
                short[] var4 = new short[GlobalStatus.t.length];

                for (int var5 = 0; var5 < GlobalStatus.t.length; ++var5) {
                    var6.bj.addElement(String.valueOf(GlobalStatus.t[var5].u));
                    var8[var5] = GlobalStatus.t[var5].y;
                    var9[var5] = GlobalStatus.t[var5].z;
                    var4[var5] = GlobalStatus.t[var5].A;
                }

                MainCanvas.ah.a(var6.bj, var8, var9, var4);
                var6.bj.removeAllElements();

                for (int var10 = 0; var10 < GlobalStatus.t.length; ++var10) {
                    GlobalStatus.t[var10].w = MainCanvas.ah.a(GlobalStatus.t[var10].v, GlobalStatus.t[var10].y, GlobalStatus.t[var10].z, GlobalStatus.t[var10].A);
                }

                var6.cV = 1;
            }

            if (this.f != null && this.f.i != null && i() && this.k != 1) {
                MainCanvas.f.a(this.f, h, i, true, false, 1009050);
            }
        }

    }

    public static void Q() {
        cL = true;
    }

    public static void a(bl[] var0) {
        bm.removeAllElements();

        for (int var1 = 0; var1 < var0.length; ++var1) {
            if (aW[9] == 0 && var1 < (GlobalStatus.bw == 0 ? aW[0] : var0.length)) {
                if (var0[var1].q != -1) {
                    var0[var1].d = new au((byte) 2, var0[var1].q, var0[var1].r, var0[var1].s, var0[var1].t);
                    var0[var1].d.h = var0[var1].j;
                    var0[var1].d.i = var0[var1].k;
                }

                if (var0[var1].d != null) {
                    bl var10000;
                    label53:
                    {
                        String var2 = var0[var1].a;
                        if (GlobalStatus.o != null) {
                            for (int var3 = 0; var3 < GlobalStatus.o.length; ++var3) {
                                if (GlobalStatus.o[var3] != null && GlobalStatus.o[var3].a.equals(var2)) {
                                    var10000 = GlobalStatus.o[var3];
                                    break label53;
                                }
                            }
                        }

                        var10000 = null;
                    }

                    bl var4 = var10000;
                    if (var10000 != null && var4.d != null) {
                        var0[var1].d.h = var4.d.h;
                        var0[var1].d.i = var4.d.i;
                        var0[var1].d.a(var4.h);
                    }

                    bm.addElement(var0[var1].d);
                }
            }
        }

        GlobalStatus.o = var0;
    }

    public final void a(bp_1[] var1) {
        if (var1 != null) {
            if (GlobalStatus.q == null) {
                for (int var4 = 0; var4 < var1.length; ++var4) {
                    var1[var4].j = this.I.j;
                    var1[var4].k = this.I.k;
                    var1[var4].l = this.I.j;
                    var1[var4].m = this.I.k;
                }

                if (GlobalStatus.bs == 0 && GlobalStatus.s == 0) {
                    this.I.a((int) 1);
                }

                GlobalStatus.q = var1;
                return;
            }

            for (int var2 = 0; var2 < var1.length; ++var2) {
                boolean var3 = false;
                if (var1[var2] != null) {
                    for (int var5 = 0; var5 < GlobalStatus.q.length; ++var5) {
                        if (GlobalStatus.q[var5] != null && GlobalStatus.q[var5].b.equals(var1[var2].b)) {
                            var1[var2].j = GlobalStatus.q[var5].j;
                            var1[var2].k = GlobalStatus.q[var5].k;
                            break;
                        }
                    }
                }
            }

            GlobalStatus.q = var1;
            if (this.k == 21) {
                this.aN();
                return;
            }
        } else if (GlobalStatus.q != null) {
            R();
            if (this.k == 21) {
                this.e.processException("没有队伍");
            }
        }

    }

    public static void R() {
        GlobalStatus.q = null;
        GlobalStatus.bs = -1;
        GlobalStatus.s = -1;
    }

    public final void a(short var1, String var2) {
        if (GlobalStatus.bs == 0) {
            this.e.processException("队员不能发送组队邀请");
        } else if (GlobalStatus.bs == 1 && GlobalStatus.q != null && GlobalStatus.q.length >= 3) {
            this.e.processException("队伍已满，无法邀请");
        } else if (GlobalStatus.G()) {
            this.e.processException("住宅区域中，无法邀请");
        } else {
            byte[] var3;
            if ((var3 = NetPayloadBuilder.a((short) 4112, GlobalStatus.ad, var2, (short) var1)) != null) {
                NetPacket var4 = new NetPacket((short) 4112, var3);
                MainCanvas.netUtils.sendPacket(var4);
                this.l = 0;
            } else {
                this.e.processException("获取上传指令数据错误!");
            }
        }
    }

    public final void a(ce[] var1) {
        Object var2 = null;

        for (int var3 = 0; var3 < var1.length; ++var3) {
            ce var4;
            b(var4 = var1[var3]);
            if (this.k == 0 || !i()) {
                this.a(var4);
            }

            if (var4.b == 4) {
                this.n = true;
            }
        }

        this.cM = true;
    }

    public final void S() {
        byte[] var1 = NetPayloadBuilder.t((short) 4192, GlobalStatus.ad, bq.g);
        NetPacket var2 = new NetPacket((short) 4192, var1);
        MainCanvas.netUtils.sendPacket(var2);
    }

    private void aT() {
        this.aU();
        this.T();
        if (MainCanvas.ad == null) {
            (MainCanvas.ad = new Page("/", "skill")).loadRpg();
        }

        if (ab == null) {
            ab = MainCanvas.ad.getFrame1("27");
        }

        if (aa == null) {
            aa = MainCanvas.ad.getFrame1("quit");
        }

        if (ac == null) {
            ac = MainCanvas.ad.getFrame1("dead");
        }

        if (ad == null) {
            ad = MainCanvas.ad.getFrame1("dead2");
        }

        if (ae == null) {
            ae = MainCanvas.ad.getFrame1("defence");
        }

        c(GlobalStatus.cb);
        c(GlobalStatus.cx);
        c(GlobalStatus.fs);
        c(GlobalStatus.fl);
        aW();
        c(GlobalStatus.dB);
        this.a(GlobalStatus.en);
        this.a(GlobalStatus.et);
        this.a(GlobalStatus.cX);
        if (Z == null) {
            Z = MainCanvas.publicUI.getFrame("fightmenu");
        }

        if (GlobalStatus.N != null) {
            for (int var1 = 0; var1 < GlobalStatus.N.length; ++var1) {
                if (GlobalStatus.N[var1] != null) {
                    if (GlobalStatus.N[var1].b == 1) {
                        this.c(GlobalStatus.N[var1].j, GlobalStatus.N[var1].r, GlobalStatus.N[var1].s, GlobalStatus.N[var1].t);
                    } else if (GlobalStatus.N[var1].b == 2) {
                        this.b(GlobalStatus.N[var1].j, GlobalStatus.N[var1].r, GlobalStatus.N[var1].s, GlobalStatus.N[var1].t);
                    }
                }
            }
        } else if (GlobalStatus.J != null) {
            for (int var2 = 0; var2 < GlobalStatus.J.length; ++var2) {
                if (GlobalStatus.J[var2] != null) {
                    if (GlobalStatus.J[var2].b == 0) {
                        this.a((short) GlobalStatus.J[var2].i, (byte) GlobalStatus.J[var2].a(), (byte) 1);
                    } else if (GlobalStatus.J[var2].b == 2) {
                        this.b(GlobalStatus.J[var2].i, GlobalStatus.J[var2].p, GlobalStatus.J[var2].q, GlobalStatus.J[var2].r);
                    } else if (GlobalStatus.J[var2].b == 1) {
                        this.c(GlobalStatus.J[var2].i, GlobalStatus.J[var2].p, GlobalStatus.J[var2].q, GlobalStatus.J[var2].r);
                    }
                }
            }
        }

        if (GlobalStatus.I != null) {
            for (int var3 = 0; var3 < GlobalStatus.I.length; ++var3) {
                if (GlobalStatus.I[var3] != null) {
                    if (GlobalStatus.I[var3].b == 0) {
                        this.a((short) GlobalStatus.I[var3].i, (byte) GlobalStatus.I[var3].a(), (byte) 0);
                    } else if (GlobalStatus.I[var3].b == 2) {
                        this.b(GlobalStatus.I[var3].i, GlobalStatus.I[var3].p, GlobalStatus.I[var3].q, GlobalStatus.I[var3].r);
                    }
                }
            }
        }

        MainCanvas.ab.loadFrame(this.resNames);
        MainCanvas.ah.loadFrame(this.cO, this.cP[0], this.cP[1], this.cP[2]);
        MainCanvas.ah.loadFrame(this.cQ, this.cR[0], this.cR[1], this.cR[2]);
    }

    private void a(short var1, byte var2, byte var3) {
        if (GlobalConfig.m == 2) {
            var2 = 1;
        }

        for (int i = 1; i <= 4; ++i) {
            GlobalConfig.sbTemp.delete(0, GlobalConfig.sbTemp.length());
            if (i == 4) {
                GlobalConfig.sbTemp.append("f").append(var1).append(var3).append(i);
            } else {
                GlobalConfig.sbTemp.append("f").append(var1).append(var3).append(var2).append(i);
            }

            this.resNames[this.resLoadIndex] = GlobalConfig.sbTemp.toString();
            ++this.resLoadIndex;
        }

    }

    private void b(short var1, short var2, short var3, short var4) {
        for (int var5 = 1; var5 <= 3; ++var5) {
            GlobalConfig.sbTemp.delete(0, GlobalConfig.sbTemp.length());
            GlobalConfig.sbTemp.append(var1).append(var5);
            this.cO[this.cT] = GlobalConfig.sbTemp.toString();
            this.cP[0][this.cT] = var2;
            this.cP[1][this.cT] = var3;
            this.cP[2][this.cT] = var4;
            ++this.cT;
        }

    }

    private void c(short var1, short var2, short var3, short var4) {
        for (int var5 = 1; var5 <= 3; ++var5) {
            GlobalConfig.sbTemp.delete(0, GlobalConfig.sbTemp.length());
            GlobalConfig.sbTemp.append(var1).append(var5);
            this.cQ[this.cU] = GlobalConfig.sbTemp.toString();
            this.cR[0][this.cU] = var2;
            this.cR[1][this.cU] = var3;
            this.cR[2][this.cU] = var4;
            ++this.cU;
        }

    }

    public final void T() {
        this.resLoadIndex = this.cU = this.cT = 0;

        for (int var1 = 0; var1 < this.resNames.length; ++var1) {
            this.resNames[var1] = "";
        }

        for (int var3 = 0; var3 < this.cO.length; ++var3) {
            this.cO[var3] = "";
        }

        for (int var4 = 0; var4 < this.cP.length; ++var4) {
            for (int var2 = 0; var2 < this.cP[var4].length; ++var2) {
                this.cP[var4][var2] = 0;
            }
        }

        for (int var5 = 0; var5 < this.cQ.length; ++var5) {
            this.cQ[var5] = "";
        }

        for (int var6 = 0; var6 < this.cR.length; ++var6) {
            for (int var7 = 0; var7 < this.cR[var6].length; ++var7) {
                this.cR[var6][var7] = 0;
            }
        }

    }

    public static void a(byte var0, byte var1, byte var2, String var3, short var4, short var5, short var6) {
        bk.removeAllElements();
        bk.addElement(MainCanvas.a(var0, var1, (byte) 1, var2, false, var3));
        bk.addElement(MainCanvas.a(var0, var1, (byte) 3, var2, false, var3));
        bk.addElement(MainCanvas.a(var0, var1, (byte) 3, var2, true, var3));
        bk.addElement(MainCanvas.a(var0, var1, (byte) 0, var2, false, var3));
        bk.addElement(MainCanvas.a(var0, var1, (byte) 0, var2, true, var3));
        bk.addElement(MainCanvas.a(var0, var1, (byte) 2, var2, false, var3));
        bk.addElement(MainCanvas.a(var0, var1, (byte) 2, var2, true, var3));

        for (int var7 = 0; var7 < bk.size(); ++var7) {
            MainCanvas.ab.b((String) bk.elementAt(var7), var4, var5, var6);
        }

        bk.removeAllElements();
    }

    private void aU() {
        Frame var1 = null;

        for (int var2 = 0; var2 < MainCanvas.ab.a().size(); ++var2) {
            if ((var1 = (Frame) MainCanvas.ab.a().elementAt(var2)).info != null && var1.type == 2 && !a(var1.info.key, GlobalStatus.ax, GlobalStatus.aj, GlobalStatus.ay)) {
                boolean var10000;
                label63:
                {
                    int var4 = var1.info.key;
                    if (GlobalStatus.o != null) {
                        for (int var3 = 0; var3 < GlobalStatus.o.length; ++var3) {
                            if (GlobalStatus.o[var3] != null && a(var4, GlobalStatus.o[var3].c, GlobalStatus.o[var3].n, GlobalStatus.o[var3].o)) {
                                var10000 = true;
                                break label63;
                            }
                        }
                    }

                    var10000 = false;
                }

                if (!var10000) {
                    label50:
                    {
                        int var7 = var1.info.key;
                        if (GlobalStatus.q != null) {
                            for (int var6 = 0; var6 < GlobalStatus.q.length; ++var6) {
                                if (GlobalStatus.q[var6] != null && a(var7, GlobalStatus.q[var6].q, GlobalStatus.q[var6].p, GlobalStatus.q[var6].r)) {
                                    var10000 = true;
                                    break label50;
                                }
                            }
                        }

                        var10000 = false;
                    }

                    if (!var10000) {
                        var1.a();
                        MainCanvas.ab.a().removeElementAt(0);
                        return;
                    }
                }
            }
        }

    }

    private static boolean a(int var0, byte var1, byte var2, byte var3) {
        int var4 = Page.buildResourceId((String) MainCanvas.a(var1, var2, (byte) 1, var3, false), (byte) 2);
        if (var0 == var4) {
            return true;
        } else {
            var4 = Page.buildResourceId((String) MainCanvas.a(var1, var2, (byte) 3, var3, false), (byte) 2);
            if (var0 == var4) {
                return true;
            } else {
                var4 = Page.buildResourceId((String) MainCanvas.a(var1, var2, (byte) 3, var3, true), (byte) 2);
                if (var0 == var4) {
                    return true;
                } else {
                    var4 = Page.buildResourceId((String) MainCanvas.a(var1, var2, (byte) 0, var3, false), (byte) 2);
                    if (var0 == var4) {
                        return true;
                    } else {
                        var4 = Page.buildResourceId((String) MainCanvas.a(var1, var2, (byte) 0, var3, true), (byte) 2);
                        if (var0 == var4) {
                            return true;
                        } else {
                            var4 = Page.buildResourceId((String) MainCanvas.a(var1, var2, (byte) 2, var3, false), (byte) 2);
                            if (var0 == var4) {
                                return true;
                            } else {
                                var4 = Page.buildResourceId((String) MainCanvas.a(var1, var2, (byte) 2, var3, true), (byte) 2);
                                return var0 == var4;
                            }
                        }
                    }
                }
            }
        }
    }

    public final void a(short[] var1) {
        if (var1 != null) {
            boolean var10000;
            label51:
            {
                short[] var3 = var1;
                short[] var2 = this.cW;
                if (var1 != null) {
                    if (var2 == null) {
                        var10000 = true;
                        break label51;
                    }

                    if (var2 != null && var1 != null && var2 != var1) {
                        if (var2.length != var1.length) {
                            var10000 = true;
                            break label51;
                        }

                        for (int var4 = 0; var4 < var2.length; ++var4) {
                            if (var2[var4] != var3[var4]) {
                                var10000 = true;
                                break label51;
                            }
                        }
                    }
                }

                var10000 = false;
            }

            if (var10000) {
                this.bj.removeAllElements();

                for (int var5 = 0; var5 < var1.length; ++var5) {
                    this.bj.addElement(String.valueOf(var1[var5]));
                }

                MainCanvas.af.batchLoadFrame0(this.bj, (short[]) null, (short[]) null, (short[]) null);
                this.cW = var1;
                this.bj.removeAllElements();
            }

        }
    }

    private void aV() {
        if (GlobalStatus.bC.size() > 0 && GlobalStatus.bD) {
            this.bj.removeAllElements();

            for (int var1 = 0; var1 < GlobalStatus.bC.size(); ++var1) {
                this.bT = (bn) GlobalStatus.bC.elementAt(var1);
                if (this.bT != null && this.bT.i >= 1000) {
                    this.bj.addElement(String.valueOf(this.bT.i));
                }
            }

            MainCanvas.af.batchLoadFrame0(this.bj, (short[]) null, (short[]) null, (short[]) null);
            this.bj.removeAllElements();
            GlobalStatus.bD = false;
        }
    }

    public static Frame0 b(short var0) {
        Frame0 var1;
        if ((var1 = MainCanvas.af.getFrame(String.valueOf(var0))) == null) {
            var1 = MainCanvas.af.getFrame(String.valueOf(-1000));
        }

        return var1;
    }

    public static Image[] b(short[] var0) {
        if (var0 != null && var0.length > 0) {
            Image[] var1 = null;
            if (var0 != null) {
                var1 = new Image[var0.length];

                for (int var2 = 0; var2 < var0.length; ++var2) {
                    Frame0 var3;
                    if ((var3 = b(var0[var2])) != null) {
                        var1[var2] = var3.pngImage;
                    } else {
                        var1[var2] = null;
                    }
                }
            }

            return var1;
        } else {
            return null;
        }
    }

    private String[] a(long[] var1) {
        if (var1 != null && var1.length > 0) {
            Object var2 = null;
            String[] var4 = new String[var1.length];

            for (int var3 = 0; var3 < var1.length; ++var3) {
                var4[var3] = GlobalConfig.a(this.e.l, var1[var3]);
            }

            return var4;
        } else {
            return null;
        }
    }

    private static String[] e(short[] var0) {
        if (var0 != null && var0.length > 0) {
            String[] var1 = new String[var0.length];

            for (int var2 = 0; var2 < var0.length; ++var2) {
                var1[var2] = var0[var2] + "级";
            }

            return var1;
        } else {
            return null;
        }
    }

    public static void c(short[] var0) {
        if (MainCanvas.af.framesNum() > 70 && var0 != null) {
            Object var1 = null;
            int var3 = 0;

            for (int var2 = 0; var2 < var0.length; ++var2) {
                if (var0[var2] != -1) {
                    var3 = Page.hashKey(String.valueOf(var0[var2]).toCharArray());
                    if (MainCanvas.af.b(var3)) {
                        MainCanvas.af.a(var3);
                    }

                    if (MainCanvas.af.framesNum() <= 70) {
                        break;
                    }
                }
            }

        }
    }

    private static void aW() {
        if (MainCanvas.af.framesNum() > 70 && GlobalStatus.bC.size() > 0) {
            Object var0 = null;
            var0 = null;
            boolean var3 = false;

            for (int var1 = 0; var1 < GlobalStatus.bC.size(); ++var1) {
                bn var4;
                if ((var4 = (bn) GlobalStatus.bC.elementAt(var1)) != null && var4.i != -1) {
                    int var5 = Page.hashKey(String.valueOf(var4.i).toCharArray());
                    if (MainCanvas.af.b(var5)) {
                        MainCanvas.af.a(var5);
                    }

                    if (MainCanvas.af.framesNum() <= 70) {
                        break;
                    }
                }
            }

        }
    }

    public final void i(byte var1) {
        this.as = var1;
        String var2 = GlobalStatus.ib == 1 ? "房屋管理" : (GlobalStatus.ib == 2 ? "家具管理" : "住宅管理");
        String[] var3 = null;
        if (var1 == 0) {
            var3 = new String[]{"购买", "查看", "拍卖"};
        } else if (var1 != 2 && this.as != 7 && this.as != 8) {
            if (var1 == 4 || this.as == 9 || this.as == 10) {
                var3 = new String[]{"购买", "仓库", "升级", "招募", "家属"};
            }
        } else {
            var3 = new String[]{"购买", "仓库", "招募", "家属"};
        }

        this.e.aq.b();
        this.e.aq.a(var2);
        this.e.aq.a(true);
        this.e.as.a(var3);
        this.e.aq.a((al) this.e.as);
        if (this.as != 7 && this.as != 8 && this.as != 9 && this.as != 10) {
            this.j((byte) this.as);
            this.e.aq.a((al) this.e.ar);
            this.e.aq.a((al) this.e.at);
        } else {
            int var4 = this.as;
            this.as = var4;
            String[] var5 = null;
            String var3_t = null;
            if (this.as != 7 && this.as != 9) {
                if ((this.as == 8 || this.as == 10) && GlobalStatus.hX != null) {
                    var5 = GlobalStatus.hY;
                    var3_t = GlobalStatus.hZ[0];
                }
            } else if (GlobalStatus.hU != null) {
                var5 = GlobalStatus.hU;
                var3_t = GlobalStatus.hW[0];
            }

            this.e.ar.a((Image[]) null, var5, (String[]) null, (String[]) null);
            if (var3_t != null && !((String) var3_t).equals("")) {
                this.e.ar.a(var3_t, 1);
            }

            this.e.as.a = (byte) this.aU;
            this.e.aq.a((al) this.e.ar);
        }

        this.e.au.a("确定");
        if (GlobalConfig.defaultHigh > 220) {
            this.e.aq.a((al) this.e.au);
        }

        this.e.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
        this.e.aw = 0;
        this.l = 0;
        this.e.touchPageCase = this.e.k;
        this.j = this.k = 38;
    }

    public final void j(byte var1) {
        this.as = var1;
        if (GlobalStatus.hL != null && GlobalStatus.hL.length > 0) {
            this.e.at.b(this.au(0), GlobalConfig.i, (byte) 1);
        } else {
            this.e.at.b("没有建筑材料，按3、9键可以上下翻滚此属性描述框", GlobalConfig.i, (byte) 1);
        }

        this.e.at.a((byte) 1);
        String[] var2 = null;
        if (this.as != 0 && this.as != 2 && this.as != 4 && this.as != 6) {
            if (this.as == 1 || this.as == 3 || this.as == 5) {
                var2 = GlobalStatus.hQ;
            }
        } else {
            var2 = GlobalStatus.hM;
        }

        this.e.ar.a((Image[]) null, var2, (String[]) null, (String[]) null);
        if (this.aZ == 8 || this.aZ == 7 || this.aZ == 9 || this.aZ == 10) {
            this.e.aq.a((al) this.e.at);
            this.e.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
        }

    }

    private void at(int var1) {
        if (this.l == 0) {
            if (this.e.aq != null) {
                this.e.aq.b(var1);
            }

            if (var1 == 8 || var1 == 2 || var1 == 518 || var1 == 516) {
                if (this.e.as.a == 0) {
                    if (this.as == 1) {
                        this.j((byte) 0);
                    } else if (this.as != 3 && this.as != 8 && this.as != 7) {
                        if (this.as == 5 || this.as == 6 || this.as == 10 || this.as == 9) {
                            this.aZ = (byte) this.as;
                            this.as = 4;
                            this.c((short) 4361, (byte) this.af, (byte) 1);
                        }
                    } else {
                        this.aZ = (byte) this.as;
                        this.j((byte) 2);
                    }
                } else if (this.e.as.a == 1) {
                    if (this.as == 0) {
                        this.v((byte) 1);
                    } else if (this.as != 2 && this.as != 7 && this.as != 8) {
                        if (this.as == 4 || this.as == 6 || this.as == 9 || this.as == 10) {
                            this.aZ = (byte) this.as;
                            this.v((byte) 3);
                        }
                    } else {
                        this.v((byte) 2);
                        this.aZ = (byte) this.as;
                    }
                } else if (this.e.as.a == 2) {
                    if (this.as != 5 && this.as != 4 && this.as != 9 && this.as != 10) {
                        if (this.as != 3 && this.as != 8 && this.as != 2) {
                            if (this.as == 0) {
                                this.v((byte) 1);
                            }
                        } else {
                            this.aU = this.e.as.a;
                            this.c((short) 4664, (byte) this.af);
                        }
                    } else {
                        this.aZ = (byte) this.as;
                        this.c((short) 4361, (byte) this.af, (byte) 2);
                    }
                } else if (this.e.as.a == 3) {
                    this.aU = this.e.as.a;
                    if (this.as != 7 && this.as != 2 && this.as != 3) {
                        if (this.as == 4 || this.as == 5 || this.as == 6 || this.as == 10) {
                            this.c((short) 4664, (byte) this.af);
                        }
                    } else {
                        this.d((short) 4666, (byte) this.af);
                    }
                } else if (this.e.as.a == 4) {
                    this.aU = this.e.as.a;
                    if (this.as == 9 || this.as == 4 || this.as == 5 || this.as == 6) {
                        this.d((short) 4666, (byte) this.af);
                    }
                }
            }

            if (var1 == 1 || var1 == 4 || var1 == 514 || var1 == 520) {
                if (this.as != 0 && this.as != 2 && this.as != 4 && this.as != 6) {
                    if (this.as != 1 && this.as != 3 && this.as != 5) {
                        if (this.as != 7 && this.as != 9) {
                            if ((this.as == 8 || this.as == 10) && GlobalStatus.hZ != null) {
                                this.e.ar.a(GlobalStatus.hZ[this.e.ar.g()], 1);
                            }
                        } else if (GlobalStatus.hW != null) {
                            this.e.ar.a(GlobalStatus.hW[this.e.ar.g()], 1);
                        }
                    } else {
                        if (GlobalStatus.hP == null || GlobalStatus.hP.length <= 0) {
                            return;
                        }

                        this.e.at.b(GlobalStatus.hR[this.e.ar.g()], GlobalConfig.i, (byte) 1);
                        this.e.at.a((byte) 1);
                    }
                } else {
                    if (GlobalStatus.hN == null || GlobalStatus.hN.length <= 0) {
                        return;
                    }

                    this.e.at.b(this.au(this.e.ar.g()), GlobalConfig.i, (byte) 1);
                    this.e.at.a((byte) 1);
                }
            }

            if (var1 != 1073741824 && var1 != 517 && var1 != 268435456) {
                if (var1 == 536870912) {
                    this.as = -1;
                    this.aZ = -1;
                    this.m();
                    return;
                }
            } else if (this.as == 0 && this.e.as.a == 0) {
                if (GlobalStatus.hL != null) {
                    LoadingPage.a(70 + GlobalConfig.f, 2 * GlobalConfig.j + 16 + this.e.ar.i() * GlobalConfig.j + GlobalConfig.g, new String[]{"购买", "取消"}, true);
                    this.l = 1;
                    return;
                }
            } else if (this.as == 1 && this.e.as.a == 1) {
                if (GlobalStatus.hP != null) {
                    LoadingPage.a(70 + GlobalConfig.f, 2 * GlobalConfig.j + 16 + this.e.ar.i() * GlobalConfig.j + GlobalConfig.g, new String[]{"进入", "拍卖", "消拍", "卖出"}, true);
                    this.l = 2;
                    return;
                }
            } else if (this.as == 2 && this.e.as.a == 0) {
                if (GlobalStatus.hL != null) {
                    LoadingPage.a(70 + GlobalConfig.f, 2 * GlobalConfig.j + 16 + this.e.ar.i() * GlobalConfig.j + GlobalConfig.g, new String[]{"购买"}, true);
                    this.l = 3;
                    return;
                }
            } else if (this.as == 3 && this.e.as.a == 1) {
                if (GlobalStatus.hP != null) {
                    LoadingPage.a(70 + GlobalConfig.f, 2 * GlobalConfig.j + 16 + this.e.ar.i() * GlobalConfig.j + GlobalConfig.g, new String[]{"布置", "卖出"}, true);
                    this.l = 4;
                    return;
                }
            } else if (this.as == 4 && this.e.as.a == 0) {
                if (GlobalStatus.hL != null) {
                    LoadingPage.a(70 + GlobalConfig.f, 2 * GlobalConfig.j + 16 + this.e.ar.i() * GlobalConfig.j + GlobalConfig.g, new String[]{"购买", "取消"}, true);
                    this.l = 5;
                    return;
                }
            } else if (this.as == 5 && this.e.as.a == 1) {
                if (GlobalStatus.hP != null) {
                    LoadingPage.a(70 + GlobalConfig.f, 2 * GlobalConfig.j + 16 + this.e.ar.i() * GlobalConfig.j + GlobalConfig.g, new String[]{"布置", "卖出"}, true);
                    this.l = 6;
                    return;
                }
            } else if (this.as == 6 && this.e.as.a == 2) {
                if (GlobalStatus.hL != null) {
                    LoadingPage.a(70 + GlobalConfig.f, 2 * GlobalConfig.j + 16 + this.e.ar.i() * GlobalConfig.j + GlobalConfig.g, new String[]{"升级", "取消"}, true);
                    this.l = 8;
                    return;
                }
            } else if ((this.as != 7 || this.e.as.a != 2) && (this.as != 9 || this.e.as.a != 3)) {
                if ((this.as == 8 && this.e.as.a == 3 || this.as == 10 && this.e.as.a == 4) && GlobalStatus.hX != null) {
                    LoadingPage.a(70 + GlobalConfig.f, 2 * GlobalConfig.j + 16 + this.e.ar.i() * GlobalConfig.j + GlobalConfig.g, new String[]{"安排", "解约"}, true);
                    this.l = 10;
                    return;
                }
            } else if (GlobalStatus.hV != null) {
                this.l = 9;
                LoadingPage.h = 0;
                return;
            }
        } else if (this.l != 1 && this.l != 2 && this.l != 3 && this.l != 4 && this.l != 5 && this.l != 6 && this.l != 8 && this.l != 10) {
            if (this.l == 7) {
                LoadingPage.b(var1);
                if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                    if (var1 == 536870912) {
                        this.l = 0;
                        return;
                    }
                } else {
                    if (LoadingPage.o == 0) {
                        this.l = 0;
                        return;
                    }

                    if (LoadingPage.o == 1) {
                        if (this.as == 3) {
                            this.a((byte) 2, (int) GlobalStatus.hP[this.e.ar.g()], (byte) 3);
                            return;
                        }

                        if (this.as == 5) {
                            this.a((byte) 3, (int) GlobalStatus.hP[this.e.ar.g()], (byte) 3);
                            return;
                        }

                        if (this.as == 1) {
                            this.a((byte) 1, (int) GlobalStatus.hP[this.e.ar.g()], (byte) 1);
                            return;
                        }

                        if (this.as == 8 || this.as == 10) {
                            this.a((short) 4665, String.valueOf(GlobalStatus.t[this.af].a), (byte) 1, "", GlobalStatus.hX[this.e.ar.g()]);
                            return;
                        }
                    }
                }
            } else if (this.l == 9) {
                if (var1 == 268435456 || var1 == 1073741824) {
                    this.a((short) 4665, String.valueOf(GlobalStatus.t[this.af].a), (byte) 0, GlobalStatus.hV[this.e.ar.g()], 0);
                    return;
                }

                if (var1 == 536870912) {
                    this.l = 0;
                }
            }
        } else if (this.as == 0) {
            LoadingPage.b(var1);
            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    this.l = 0;
                    return;
                }
            } else {
                if (LoadingPage.o == 0) {
                    this.b((short) 4354, (byte) ((byte) this.e.ar.g()), (byte) this.af);
                    return;
                }

                if (LoadingPage.o == 1) {
                    this.l = 0;
                    return;
                }
            }
        } else if (this.as == 1) {
            LoadingPage.b(var1);
            if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
                if (LoadingPage.o == 0) {
                    this.a((byte) 1, (short) GlobalStatus.hP[this.e.ar.g()], GlobalStatus.ad);
                    return;
                }

                if (LoadingPage.o == 3) {
                    LoadingPage.a(40 + GlobalConfig.f, 2 * GlobalConfig.j + 16 + this.e.ar.i() * GlobalConfig.j + GlobalConfig.g, new String[]{"取消", "确认"}, false);
                    this.l = 7;
                    return;
                }

                this.e.processException("该功能稍后开放");
                return;
            }

            if (var1 == 536870912) {
                this.l = 0;
                return;
            }
        } else if (this.as == 2) {
            LoadingPage.b(var1);
            if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
                if (LoadingPage.o == 0) {
                    this.b((short) 4359, (byte) ((byte) this.e.ar.g()), (byte) this.af);
                    return;
                }

                this.e.processException("该功能稍后开放");
                return;
            }

            if (var1 == 536870912) {
                this.l = 0;
                return;
            }
        } else if (this.as == 3) {
            LoadingPage.b(var1);
            if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
                if (LoadingPage.o == 0) {
                    this.as = -1;
                    this.aZ = -1;
                    this.a((String) GlobalStatus.hQ[this.e.ar.g()], GlobalStatus.hP[this.e.ar.g()], (short) GlobalStatus.hS[this.e.ar.g()], (byte) GlobalStatus.hT[this.e.ar.g()], (byte) 2);
                    return;
                }

                if (LoadingPage.o == 1) {
                    LoadingPage.a(40 + GlobalConfig.f, 2 * GlobalConfig.j + 16 + this.e.ar.i() * GlobalConfig.j + GlobalConfig.g, new String[]{"取消", "确认"}, false);
                    this.l = 7;
                    return;
                }

                this.e.processException("该功能稍后开放");
                return;
            }

            if (var1 == 536870912) {
                this.l = 0;
                return;
            }
        } else if (this.as == 4) {
            LoadingPage.b(var1);
            if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
                if (LoadingPage.o == 0) {
                    this.b((short) 4362, (byte) ((byte) this.e.ar.g()), (byte) this.af);
                    return;
                }

                this.l = 0;
                return;
            }

            if (var1 == 536870912) {
                this.l = 0;
                return;
            }
        } else if (this.as == 5) {
            LoadingPage.b(var1);
            if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
                if (LoadingPage.o == 0) {
                    this.as = -1;
                    this.aZ = -1;
                    this.a((String) GlobalStatus.hQ[this.e.ar.g()], GlobalStatus.hP[this.e.ar.g()], (short) GlobalStatus.hS[this.e.ar.g()], (byte) GlobalStatus.hT[this.e.ar.g()], (byte) 3);
                    return;
                }

                if (LoadingPage.o == 1) {
                    LoadingPage.a(40 + GlobalConfig.f, 2 * GlobalConfig.j + 16 + this.e.ar.i() * GlobalConfig.j + GlobalConfig.g, new String[]{"取消", "确认"}, false);
                    this.l = 7;
                    return;
                }

                this.l = 0;
                return;
            }

            if (var1 == 536870912) {
                this.l = 0;
                return;
            }
        } else if (this.as == 6) {
            LoadingPage.b(var1);
            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    this.l = 0;
                    return;
                }
            } else {
                if (LoadingPage.o == 0) {
                    this.b((short) 4362, (byte) ((byte) this.e.ar.g()), (byte) this.af);
                    return;
                }

                if (LoadingPage.o == 1) {
                    this.l = 0;
                    return;
                }
            }
        } else if (this.as == 8 || this.as == 10) {
            LoadingPage.b(var1);
            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    this.l = 0;
                    return;
                }
            } else {
                if (LoadingPage.o == 0) {
                    this.as = -1;
                    this.aZ = -1;
                    this.a((String) "", -1, (short) Short.parseShort(GlobalStatus.ia[this.e.ar.g()]), (byte) 0, (byte) 5);
                    return;
                }

                if (LoadingPage.o == 1) {
                    LoadingPage.a(40 + GlobalConfig.f, 2 * GlobalConfig.j + 16 + this.e.ar.i() * GlobalConfig.j + GlobalConfig.g, new String[]{"取消", "确认"}, false);
                    this.l = 7;
                    return;
                }
            }
        }

    }

    private String au(int var1) {
        this.e.l.delete(0, this.e.l.length());
        int var2 = GlobalStatus.hO[var1] >> 16;
        short var3 = (short) GlobalStatus.hO[var1];
        this.e.l.append(GlobalStatus.hN[var1]);
        this.e.l.append("\t");
        this.e.l.append("公共剩余:");
        if (var2 >= 0) {
            this.e.l.append(var2);
        } else {
            this.e.l.append("无限制");
        }

        this.e.l.append("\t");
        this.e.l.append("个人剩余:");
        if (var3 >= 0) {
            this.e.l.append(var3);
        } else {
            this.e.l.append("无限制");
        }

        return this.e.l.toString();
    }

    private void b(short var1, byte var2, byte var3) {
        byte[] var4;
        if ((var4 = NetPayloadBuilder.a(var1, GlobalStatus.ad, (short) GlobalStatus.hL[var2], (int) GlobalStatus.t[var3].a)) == null) {
            this.e.processException("获取上传指令数据错误!");
        } else {
            MainCanvas.netUtils.sendPacket(new NetPacket(var1, var4));
            this.e.a((String) null);
        }
    }

    private void b(short var1, byte var2) {
        byte[] var3;
        if ((var3 = NetPayloadBuilder.d(var1, GlobalStatus.ad, GlobalStatus.t[var2].a)) != null) {
            MainCanvas.netUtils.sendPacket(new NetPacket(var1, var3));
            this.e.a((String) null);
        } else {
            this.e.processException("获取上传指令数据错误!");
        }
    }

    private void c(short var1, byte var2, byte var3) {
        byte[] var4;
        if ((var4 = NetPayloadBuilder.a((short) 4361, GlobalStatus.ad, (short) GlobalStatus.t[var2].a, (byte) var3)) != null) {
            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4361, var4));
            this.e.a((String) null);
        } else {
            this.e.processException("获取上传指令数据错误!");
        }
    }

    private void c(short var1, byte var2) {
        byte[] var3;
        if ((var3 = NetPayloadBuilder.e((short) 4664, GlobalStatus.ad, (short) GlobalStatus.t[var2].a)) != null) {
            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4664, var3));
            this.e.a((String) null);
        } else {
            this.e.processException("获取上传指令数据错误!");
        }
    }

    private void d(short var1, byte var2) {
        byte[] var3;
        if ((var3 = NetPayloadBuilder.f((short) 4666, GlobalStatus.ad, (short) GlobalStatus.t[var2].a)) != null) {
            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4666, var3));
            this.e.a((String) null);
        } else {
            this.e.processException("获取上传指令数据错误!");
        }
    }

    private void a(short var1, String var2, byte var3, String var4, int var5) {
        byte[] var6;
        if ((var6 = NetPayloadBuilder.a((short) 4665, GlobalStatus.ad, var2, var3, var4, var5)) != null) {
            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4665, var6));
            this.e.a((String) null);
        } else {
            this.e.processException("获取上传指令数据错误!");
        }
    }

    private void v(byte var1) {
        byte[] var2;
        if ((var2 = NetPayloadBuilder.i((short) 4355, GlobalStatus.ad, (byte) var1)) == null) {
            this.e.processException("获取上传指令数据错误!");
        } else {
            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4354, var2));
            this.e.a((String) null);
        }
    }

    private void a(short var1, int var2, String var3, String var4) {
        byte[] var5;
        if ((var5 = NetPayloadBuilder.a((short) 4256, GlobalStatus.ad, var1, var2, var3, var4)) == null) {
            this.e.processException("获取上传指令数据错误!");
        } else {
            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4256, var5));
            this.e.a((String) null);
        }
    }

    private void a(byte var1, int var2, String var3) {
        byte[] var4;
        if ((var4 = NetPayloadBuilder.a((short) 4356, GlobalStatus.ad, (byte) 1, var2, var3, this.I.j, this.I.k)) == null) {
            this.e.processException("获取上传指令数据错误!");
        } else {
            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4356, var4));
            this.e.a((String) null);
        }
    }

    private void w(byte var1) {
        byte[] var2;
        if ((var2 = NetPayloadBuilder.j((short) 4357, GlobalStatus.ad, (byte) var1)) == null) {
            this.e.processException("获取上传指令数据错误!");
        } else {
            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4357, var2));
            this.e.a((String) null);
        }
    }

    private void a(byte var1, bv var2) {
        byte[] var3;
        if ((var3 = NetPayloadBuilder.a((short) 4360, GlobalStatus.ad, (byte) var1, (bv) var2)) == null) {
            this.e.processException("获取上传指令数据错误!");
        } else {
            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4360, var3));
        }
    }

    private void f(String var1) {
        byte[] var2;
        if ((var2 = NetPayloadBuilder.a((short) 4671, GlobalStatus.ad, var1, (int) GlobalStatus.O.d)) == null) {
            this.e.processException("获取上传指令数据错误!");
        } else {
            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4671, var2));
            this.e.a((String) null);
        }
    }

    private void av(int var1) {
        byte[] var2;
        if ((var2 = NetPayloadBuilder.w((short) 4668, GlobalStatus.ad, var1)) == null) {
            this.e.processException("获取上传指令数据错误!");
        } else {
            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4668, var2));
            this.e.a((String) null);
        }
    }

    public final void a(String var1, String var2, int var3) {
        byte[] var4;
        if ((var4 = NetPayloadBuilder.a((short) 4670, GlobalStatus.ad, var1, var2, var3)) == null) {
            this.e.processException("获取上传指令数据错误!");
        } else {
            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4670, var4));
            this.e.a((String) null);
        }
    }

    public final void a(String var1, String var2, String var3, int var4) {
        byte[] var5;
        if ((var5 = NetPayloadBuilder.a((short) 4669, GlobalStatus.ad, var1, var2, var4, var3)) == null) {
            this.e.processException("获取上传指令数据错误!");
        } else {
            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4669, var5));
            this.e.a((String) null);
        }
    }

    public final void k(byte var1) {
        this.as = var1;
        this.l = 0;
        this.e.aw = 0;
        this.e.ar.a((Image[]) null, GlobalStatus.hQ, (String[]) null, (String[]) null);
        if (GlobalStatus.hP != null && GlobalStatus.hP.length > 0) {
            this.e.at.b(GlobalStatus.hR[0], GlobalConfig.i, (byte) 1);
        } else {
            this.e.at.b("没有建筑材料，按3、9键可以上下翻滚此属性描述框", GlobalConfig.i, (byte) 1);
        }

        this.e.at.a((byte) 1);
        if (this.aZ == 7 || this.aZ == 8 || this.aZ == 9 || this.aZ == 10) {
            this.e.aq.a((al) this.e.at);
            this.e.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
        }

        this.e.touchPageCase = this.e.k;
        this.j = this.k = 38;
    }

    public final void a(String var1, int var2, short var3, byte var4, byte var5) {
        this.e.p = true;
        this.cX = var5;
        this.ba = new bv(var2, this.I.j, this.I.k, var3, var4);
        if (this.cX == 5) {
            MainCanvas.ah.loadFrame((String[]) (new String[]{String.valueOf(var3)}), (short[]) null, (short[]) null, (short[]) null);
            bv var10000 = this.ba;
            Frame1 var6 = MainCanvas.ah.a((int) Page.hashKey(Page.wrapName(String.valueOf(var3), (byte) 2).toCharArray()), (short) 0, (short) 0, (short) 0);
            var10000.d = var6;
        } else {
            MainCanvas.ae.d(String.valueOf(this.ba.g));
            bv var8 = this.ba;
            Frame1 var7 = MainCanvas.ae.getFrame1(String.valueOf(this.ba.g));
            var8.d = var7;
        }

        this.l = 0;
        this.e.touchPageCase = this.e.k;
        MainCanvas.f.a(this.f, h, i, false, false, 1009050);
        this.j = this.k = 39;
        this.e.p = false;
    }

    public final void U() {
        if (GlobalStatus.ij != null) {
            this.bj.removeAllElements();

            for (int var1 = 0; var1 < GlobalStatus.ij.size(); ++var1) {
                this.ba = (bv) GlobalStatus.ij.elementAt(var1);
                this.bj.addElement(String.valueOf(this.ba.g));
            }

            MainCanvas.ae.a((Vector) this.bj, (short[]) null, (short[]) null, (short[]) null);
            this.bj.removeAllElements();

            for (int var4 = 0; var4 < GlobalStatus.ij.size(); ++var4) {
                this.ba = (bv) GlobalStatus.ij.elementAt(var4);
                bv var10000 = this.ba;
                Frame1 var3 = MainCanvas.ae.c(this.ba.h);
                var10000.d = var3;
            }
        }

    }

    public final void V() {
        if (this.e.b != 8 && this.e.b != 516) {
            if (this.e.b != 2 && this.e.b != 518) {
                if (this.e.b != 1 && this.e.b != 514) {
                    if (this.e.b != 4 && this.e.b != 520) {
                        this.ba.a((byte) -1);
                    } else {
                        this.ba.a((byte) 3);
                    }
                } else {
                    this.ba.a((byte) 1);
                }
            } else {
                this.ba.a((byte) 2);
            }
        } else {
            this.ba.a((byte) 0);
        }

        if (this.e.touchAction != 268435456 && this.e.touchAction != 517 && this.e.touchAction != 1073741824) {
            if (this.e.touchAction == 536870912) {
                this.l = 0;
                this.e.touchPageCase = this.e.k;
                this.N();
            }
        } else if (this.ba != null) {
            byte var1;
            if ((var1 = this.a(this.ba)) == 0) {
                this.e.processException("布置失败，请检查是否覆盖地图元素");
                return;
            }

            if (var1 == 1) {
                this.e.processException("布置失败，请检查是否覆盖地图npc");
                return;
            }

            if (var1 == 2) {
                this.e.processException("布置失败，请检查是否覆盖传送点");
                return;
            }

            if (var1 == 3) {
                this.e.processException("布置失败，请检查是否覆盖其他材料");
                return;
            }

            if (var1 == 4) {
                this.e.processException("布置失败，请检查当前区域是否支持放置该类型材料");
                return;
            }

            if (var1 == 5) {
                this.e.processException("布置失败，请检查是否在合法区域内");
                return;
            }

            if (var1 == 6) {
                this.e.processException("布置失败，请检查是否与当前人物位置重叠");
                return;
            }

            if (this.cX == 2) {
                this.a((byte) 2, (bv) this.ba);
            } else if (this.cX == 3) {
                this.a((byte) 3, (bv) this.ba);
            } else if (this.cX == 4) {
                aq var8 = this.M;
                byte[] var2;
                if ((var2 = NetPayloadBuilder.a((short) 4234, GlobalStatus.ad, (int) GlobalStatus.jr[var8.b.ar.g()], (short) var8.a.ba.e, (short) var8.a.ba.f)) == null) {
                    var8.b.processException("获取上传指令数据错误!");
                } else {
                    MainCanvas.netUtils.sendPacket(new NetPacket((short) 4234, var2));
                }
            } else {
                if (this.cX != 5) {
                    this.e.processException("材料类型不存在");
                    return;
                }

                int var10001 = GlobalStatus.hX[this.e.ar.g()];
                int var10003 = this.ba.e + 2;
                short var5 = (short) (this.ba.f + 28);
                int var4 = var10003;
                bv var3 = this.ba;
                int var10 = var10001;
                byte[] var6;
                if ((var6 = NetPayloadBuilder.b((short) 4667, GlobalStatus.ad, var10, var4, (int) var5)) == null) {
                    this.e.processException("获取上传指令数据错误!");
                } else {
                    MainCanvas.netUtils.sendPacket(new NetPacket((short) 4667, var6));
                }
            }

            this.l = 0;
            this.e.touchPageCase = this.e.k;
            this.N();
        }

        this.aE = 0;
        this.e.touchAction = 0;
        if (this.f.i != null) {
            short var11 = 0;
            short var14 = 0;
            int var16 = 0;
            int var18 = 0;
            var11 = GlobalConfig.defaultWidth;
            var14 = GlobalConfig.defaultHigh;
            var16 = GlobalConfig.defaultWidth / 2;
            var18 = GlobalConfig.defaultHigh / 2;
            if (this.f.a < GlobalConfig.defaultWidth) {
                var11 = this.f.a;
                var16 = this.f.a / 2;
            }

            if (this.f.b < GlobalConfig.defaultHigh) {
                var14 = this.f.b;
                var18 = this.f.b / 2;
            }

            if (GlobalStatus.bs == 0 && GlobalStatus.s == 0) {
                if (GlobalStatus.q != null) {
                    short var20 = GlobalStatus.q[0].j;
                    short var7 = GlobalStatus.q[0].k;
                    h = var20 - var16 < 0 ? 0 : (var20 + var16 > this.f.a ? this.f.a - var11 : var20 - var16);
                    i = var7 - var18 < 0 ? 0 : (var7 + var18 > this.f.b ? this.f.b - var14 : var7 - var18);
                }
            } else {
                h = this.ba.e - var16 < 0 ? 0 : (this.ba.e + var16 > this.f.a ? this.f.a - var11 : this.ba.e - var16);
                i = this.ba.f - var18 < 0 ? 0 : (this.ba.f + var18 > this.f.b ? this.f.b - var14 : this.ba.f - var18);
            }
        }

        this.M();
        if (this.a(this.ba) == -1) {
            this.cY = true;
        } else {
            this.cY = false;
        }

        bv var10000 = this.ba;
        aw var13 = this.f;
        bv var9 = var10000;
        if (var10000.d != null && var13 != null) {
            if (var9.a == 0 && var9.b < 0) {
                if (var9.f + var9.b < 0) {
                    return;
                }
            } else if (var9.a < 0 && var9.b == 0) {
                if (var9.e + var9.a < 0) {
                    return;
                }
            } else if (var9.a > 0 && var9.b == 0) {
                if (var9.e + var9.a + var9.d.g() > var13.a) {
                    return;
                }
            } else if (var9.a == 0 && var9.b > 0 && var9.f + var9.b + var9.d.h() > var13.b) {
                return;
            }

            var9.e += var9.a;
            var9.f += var9.b;
        }

    }

    private byte a(bv var1) {
        if (var1 == null) {
            return -1;
        } else {
            if (this.cX == 5) {
                this.cH[0] = var1.e;
                this.cH[1] = var1.f;
                this.cH[2] = var1.d == null ? 0 : var1.d.g();
                this.cH[3] = var1.d == null ? 0 : var1.d.h();
            } else {
                this.cH[0] = var1.e + (var1.d == null ? 0 : var1.d.c());
                this.cH[1] = var1.f + (var1.d == null ? 0 : var1.d.d());
                this.cH[2] = var1.d == null ? 0 : var1.d.e();
                this.cH[3] = var1.d == null ? 0 : var1.d.f();
            }

            if (GlobalStatus.G() && this.cX != 5) {
                boolean var2 = false;
                boolean var3 = false;
                if (GlobalStatus.ih != null) {
                    for (int var4 = 0; var4 < GlobalStatus.ih.length; ++var4) {
                        if (!var2) {
                            this.cI[0] = GlobalStatus.ie[var4];
                            this.cI[1] = GlobalStatus.if_2[var4];
                            this.cI[2] = GlobalStatus.ig[var4];
                            this.cI[3] = GlobalStatus.ih[var4];
                            if (this.cH[0] >= this.cI[0] && this.cH[0] + this.cH[2] <= this.cI[0] + this.cI[2] && this.cH[1] >= this.cI[1] && this.cH[1] + this.cH[3] <= this.cI[1] + this.cI[3]) {
                                var2 = true;
                            } else {
                                var2 = false;
                            }
                        }

                        if (var2 && !var3 && GlobalStatus.ii[var4] != null) {
                            for (int var5 = 0; var5 < GlobalStatus.ii[var4].length; ++var5) {
                                if (GlobalStatus.ii[var4][var5] == var1.i) {
                                    var3 = true;
                                    break;
                                }

                                var3 = false;
                            }

                            if (!var3) {
                                var2 = false;
                            }
                        }
                    }

                    if (!var3) {
                        return 4;
                    }

                    if (!var2) {
                        return 5;
                    }
                }
            }

            byte var11 = (byte) (this.cH[1] / 16);
            byte var16 = (byte) (this.cH[0] / 16);
            byte var17;
            var17 = (byte) ((var17 = (byte) ((this.cH[1] + this.cH[3] - 1) / 16)) >= this.f.i[0].length ? this.f.i[0].length - 1 : var17);
            byte var19;
            var19 = (byte) ((var19 = (byte) ((this.cH[0] + this.cH[2] - 1) / 16)) >= this.f.i.length ? this.f.i.length - 1 : var19);
            if (this.f.i != null) {
                for (int var6 = var11; var6 <= var17; ++var6) {
                    for (int var12 = var16; var12 <= var19; ++var12) {
                        if (this.f.i[var12][var6] == 1) {
                            return 0;
                        }
                    }
                }
            }

            if (GlobalStatus.t != null) {
                for (int var7 = 0; var7 < GlobalStatus.t.length; ++var7) {
                    if (GlobalStatus.t[var7] != null && GlobalStatus.t[var7].w != null) {
                        this.cI[0] = GlobalStatus.t[var7].a();
                        this.cI[1] = GlobalStatus.t[var7].b();
                        this.cI[2] = GlobalStatus.t[var7].w.g();
                        this.cI[3] = GlobalStatus.t[var7].w.h();
                        if (PngUtil.a(this.cH, this.cI)) {
                            return 1;
                        }
                    }
                }
            }

            if (GlobalStatus.ab != null) {
                for (int var8 = 0; var8 < GlobalStatus.ab.length; ++var8) {
                    if (bn != null) {
                        Frame1 var13;
                        this.cI[0] = GlobalStatus.ab[var8] + 8 - ((var13 = bn).k != null ? (short) var13.i : 0) / 2;
                        this.cI[1] = GlobalStatus.ac[var8] + 16 - ((var13 = bn).k != null ? (short) var13.j : 0);
                        this.cI[2] = 16;
                        this.cI[3] = 16;
                        if (PngUtil.a(this.cH, this.cI)) {
                            return 2;
                        }
                    }
                }
            }

            bv var9 = null;
            if (GlobalStatus.ij != null) {
                for (int var15 = 0; var15 < GlobalStatus.ij.size(); ++var15) {
                    var9 = (bv) GlobalStatus.ij.elementAt(var15);
                    this.cI[0] = var9.e + (var9.d == null ? 0 : var9.d.c());
                    this.cI[1] = var9.f + (var9.d == null ? 0 : var9.d.d());
                    this.cI[2] = var9.d == null ? 0 : var9.d.e();
                    this.cI[3] = var9.d == null ? 0 : var9.d.f();
                    if (PngUtil.a(this.cH, this.cI)) {
                        return 3;
                    }
                }
            }

            if (this.I != null && this.I.g != null) {
                this.cI[0] = this.I.j + (8 - this.I.g.i() / 2);
                this.cI[1] = this.I.k - (this.I.g.j() - 16);
                this.cI[2] = this.I.g.g();
                this.cI[3] = this.I.g.h();
                if (PngUtil.a(this.cH, this.cI)) {
                    return 6;
                }
            }

            return -1;
        }
    }

    private void aw(int var1) {
        if (this.l == 0) {
            if (var1 != 514 && var1 != 1) {
                if (var1 != 520 && var1 != 4) {
                    if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                        if (var1 == 536870912) {
                            this.l = 0;
                            this.j = this.k = 0;
                            this.e.touchPageCase = this.e.k = 7;
                            return;
                        }

                        return;
                    }

                    if (GlobalStatus.ib == 1) {
                        this.a((byte) 2, (int) L.c, (int) LoadingPage.g);
                    } else if (GlobalStatus.ib == 2) {
                        this.a((byte) 3, (int) L.c, (int) LoadingPage.g);
                    } else if (GlobalStatus.ib == 4) {
                        int var3 = LoadingPage.g;
                        int var2 = L.c;
                        aq var4 = this.M;
                        if (L.j != null && L.j.length > var3) {
                            byte[] var5;
                            if ((var5 = NetPayloadBuilder.l((short) 4238, GlobalStatus.ad, var2, L.j[var3])) == null) {
                                var4.b.processException("获取上传指令数据错误!");
                            } else {
                                MainCanvas.netUtils.sendPacket(new NetPacket((short) 4238, var5));
                                var4.b.a((String) null);
                            }
                        } else {
                            var4.b.processException("获取上传指令数据错误!");
                        }
                    }

                    aj = false;
                    this.N();
                    this.e.touchPageCase = this.e.k = 7;
                    return;
                }

                LoadingPage.g = LoadingPage.g == this.an.length - 1 ? 0 : LoadingPage.g + 1;
                return;
            }

            LoadingPage.g = LoadingPage.g == 0 ? this.an.length - 1 : LoadingPage.g - 1;
            return;
        } else if (this.l == 1) {
            if (this.e.aq != null) {
                this.e.aq.b(var1);
            }

            if (var1 == 268435456 || var1 == 536870912 || var1 == 517 || var1 == 1073741824) {
                this.l = 0;
            }
        }

    }

    public final void d(String var1) {
        this.e.aq.j();
        this.e.aq.a("详细信息");
        this.e.aq.a(false);
        this.e.at.a(var1, GlobalConfig.i, (byte) 2);
        this.e.au.a("确定");
        this.e.aq.a((al) this.e.at);
        this.e.aq.a((al) this.e.au);
        this.e.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
        this.k = 40;
        this.e.touchPageCase = this.e.k;
        this.l = 1;
    }

    private void a(byte var1, int var2, byte var3) {
        byte[] var4;
        if ((var4 = NetPayloadBuilder.a((short) 4363, GlobalStatus.ad, (byte) var1, (int) var2, (byte) var3)) == null) {
            this.e.processException("获取上传指令数据错误!");
        } else {
            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4363, var4));
            this.e.a((String) null);
        }
    }

    private void a(byte var1, int var2, int var3) {
        if (L.j != null && L.j.length > var3) {
            byte[] var4;
            if ((var4 = NetPayloadBuilder.a((short) 4364, GlobalStatus.ad, (byte) var1, (int) var2, (int) L.j[var3])) == null) {
                this.e.processException("获取上传指令数据错误!");
            } else {
                MainCanvas.netUtils.sendPacket(new NetPacket((short) 4364, var4));
                this.e.a((String) null);
            }
        } else {
            this.e.processException("获取上传指令数据错误!");
        }
    }

    private void aX() {
        byte[] var1;
        if ((var1 = NetPayloadBuilder.t((short) 4248, GlobalStatus.ad)) != null) {
            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4248, var1));
            this.e.a((String) null);
        } else {
            this.e.processException("获取上传指令数据错误!");
        }
    }

    public final void W() {
        this.l = 0;
        this.e.aq.b();
        this.e.aq.a("增值仓库");
        c_1 var10000 = this.e.ar;
        Image[] var10001 = b(GlobalStatus.jC);
        String[] var10002 = GlobalStatus.jA;
        int[] var1;
        String[] var10003;
        if ((var1 = GlobalStatus.jB) != null && var1.length > 0) {
            String[] var2 = null;
            if (var1 != null) {
                var2 = new String[var1.length];

                for (int var3 = 0; var3 < var1.length; ++var3) {
                    var2[var3] = var1[var3] + "个";
                }
            }

            var10003 = var2;
        } else {
            var10003 = null;
        }

        var10000.a(var10001, var10002, var10003, (String[]) null);
        this.e.at.a(GlobalStatus.jD != null ? GlobalStatus.jD[0] : null, GlobalConfig.i, (byte) 1);
        this.e.at.a((byte) 1);
        this.e.au.a("取出");
        this.e.aq.a((al) this.e.ar);
        this.e.aq.a((al) this.e.at);
        this.e.aq.a((al) this.e.au);
        this.e.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
        this.e.touchPageCase = this.e.k;
        this.j = this.k = 53;
    }

    private void ax(int var1) {
        if (this.l == 0) {
            if (this.e.aq != null) {
                this.e.aq.b(var1);
            }

            if (GlobalStatus.jz != null) {
                this.a(GlobalStatus.jC);
                if ((var1 == 1 || var1 == 514 || var1 == 520 || var1 == 4) && GlobalStatus.jD != null) {
                    this.e.at.b(GlobalStatus.jD != null ? GlobalStatus.jD[this.e.ar.g()] : null, GlobalConfig.i, (byte) 1);
                    this.e.at.a((byte) 1);
                }

                if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
                    LoadingPage.a(65 + o, GlobalConfig.j + 20 + this.e.ar.g() * GlobalConfig.j + p, new String[]{"取回"}, true);
                    this.l = 1;
                }
            }

            if (var1 == 536870912) {
                this.al = null;
                this.N();
                return;
            }
        } else if (this.l == 1) {
            LoadingPage.b(var1);
            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    this.l = 0;
                    return;
                }
            } else if (LoadingPage.o == 0) {
                this.a(GlobalStatus.jB[this.e.ar.g()] > 99 ? 99L : (long) GlobalStatus.jB[this.e.ar.g()]);
                this.l = 2;
                return;
            }
        } else if (this.l == 2) {
            this.b(var1);
            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    this.l = 0;
                }
            } else {
                int var10001 = GlobalStatus.jz[this.e.ar.g()];
                byte var2 = (byte) this.ag;
                var1 = var10001;
                byte[] var4;
                if ((var4 = NetPayloadBuilder.c((short) 4249, GlobalStatus.ad, (int) var1, (byte) var2)) == null) {
                    this.e.processException("获取上传指令数据错误!");
                    return;
                }

                MainCanvas.netUtils.sendPacket(new NetPacket((short) 4249, var4));
                this.e.a((String) null);
            }
        }

    }

    public final void q(int var1) {
        if (this.e.ar.g() == 2 && (var1 == 1073741824 || var1 == 517)) {
            byte[] var2;
            if ((var2 = NetPayloadBuilder.a((short) 4194, GlobalStatus.ad, (byte) GlobalStatus.z)) != null) {
                MainCanvas.netUtils.sendPacket(new NetPacket((short) 4194, var2));
                return;
            }

            this.e.processException("获取上传指令数据错误!");
        }

    }

    public final void X() {
        this.e.aq.b();
        this.e.aq.a("住宅列表");
        this.e.ar.a((Image[]) null, GlobalStatus.hQ, (String[]) null, (String[]) null);
        this.e.au.a("进入");
        this.e.aq.a((al) this.e.ar);
        if (GlobalConfig.defaultHigh > 220) {
            this.e.aq.a((al) this.e.au);
        }

        this.e.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
        this.l = 0;
        this.e.touchPageCase = this.e.k;
        this.j = this.k = 57;
    }

    public final void r(int var1) {
        if (this.l == 0) {
            if (this.e.aq != null) {
                this.e.aq.b(var1);
            }

            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    this.at();
                    this.c((int) 5);
                }
            } else if (GlobalStatus.hP != null) {
                this.a((byte) 1, (short) GlobalStatus.hP[this.e.ar.g()], GlobalStatus.ad);
                return;
            }
        }

    }

    private String aY() {
        StringBuffer var1 = new StringBuffer();
        if (this.j == 59) {
            if (GlobalStatus.jT == null || GlobalStatus.jT.length <= 0) {
                return null;
            }

            for (int var3 = 0; var3 < GlobalStatus.jT.length; ++var3) {
                String[] var2 = LoadingPage.a("<" + GlobalStatus.jS[var3] + ">以" + GlobalConfig.a(this.e.l, GlobalStatus.jU[var3]) + "购买了您的" + GlobalStatus.jT[var3], GlobalConfig.i, 155, "\t");

                for (int var4 = 0; var4 < var2.length; ++var4) {
                    var1.append(var2[var4]);
                    var1.append('\t');
                }
            }
        } else {
            if (GlobalStatus.jW == null || GlobalStatus.jW.length <= 0) {
                return null;
            }

            for (int var6 = 0; var6 < GlobalStatus.jW.length; ++var6) {
                String[] var5 = LoadingPage.a("<" + GlobalStatus.jV[var6] + ">以" + GlobalConfig.a(this.e.l, GlobalStatus.jX[var6]) + "购买了您的" + GlobalStatus.jW[var6], GlobalConfig.i, 160, "\t");

                for (int var7 = 0; var7 < var5.length; ++var7) {
                    var1.append(var5[var7]);
                    var1.append('\t');
                }
            }
        }

        return var1.toString();
    }

    private void a(byte var1, short var2) {
        byte[] var3;
        if ((var3 = NetPayloadBuilder.a((short) 4631, GlobalStatus.ad, (byte) var1, (short) var2)) != null) {
            NetPacket var4 = new NetPacket((short) 4631, var3);
            MainCanvas.netUtils.sendPacket(var4);
            this.e.a((String) null);
        } else {
            this.e.processException("获取上传指令数据错误!");
        }
    }

    private void b(byte var1, short var2) {
        byte[] var3;
        if ((var3 = NetPayloadBuilder.b((short) 4632, GlobalStatus.ad, (byte) var1, (short) var2)) != null) {
            NetPacket var4 = new NetPacket((short) 4632, var3);
            MainCanvas.netUtils.sendPacket(var4);
            this.e.a((String) null);
        } else {
            this.e.processException("获取上传指令数据错误!");
        }
    }

    private void c(byte var1, short var2) {
        byte[] var3;
        if ((var3 = NetPayloadBuilder.c((short) 4150, GlobalStatus.ad, (byte) var1, (short) var2)) != null) {
            NetPacket var4 = new NetPacket((short) 4150, var3);
            MainCanvas.netUtils.sendPacket(var4);
            this.e.a((String) null);
        } else {
            this.e.processException("获取上传指令数据错误!");
        }
    }

    private void a(byte var1, int var2) {
        byte[] var3;
        if ((var3 = NetPayloadBuilder.e((short) 4633, GlobalStatus.ad, var2, (byte) var1)) != null) {
            NetPacket var4 = new NetPacket((short) 4633, var3);
            MainCanvas.netUtils.sendPacket(var4);
            this.e.a((String) null);
        } else {
            this.e.processException("获取上传指令数据错误!");
        }
    }

    private void a(byte var1, int var2, long var3) {
        byte[] var5;
        if ((var5 = NetPayloadBuilder.a((short) 4640, GlobalStatus.ad, var2, (byte) var1, var3)) != null) {
            NetPacket var6 = new NetPacket((short) 4640, var5);
            MainCanvas.netUtils.sendPacket(var6);
            this.e.a((String) null);
        } else {
            this.e.processException("获取上传指令数据错误!");
        }
    }

    public final void l(byte var1) {
        this.l = 0;
        this.cZ = var1;
        this.e.aq.b();
        this.e.aq.a("物品拍卖详情");
        if (var1 == 0) {
            if (this.j != 59) {
                this.aV = 0;
                this.e.as.a(new String[]{"拍卖中", "仓库", "记录"});
                this.e.as.a((byte) 0);
            }

            if (GlobalStatus.jN != null) {
                this.a(GlobalStatus.jR);
                this.e.ar.a(b(GlobalStatus.jR), a(this.e.l, GlobalStatus.jO, GlobalStatus.jP), (String[]) null, (String[]) null);
                if (this.j == 64) {
                    this.e.ar.a(this.aA, this.aq);
                }

                this.e.ar.a(GlobalStatus.h(this.e.l, this.e.ar.g()), 1);
            } else {
                this.e.ar.a((Image[]) null, (String[]) null, (String[]) null, (String[]) null);
            }

            this.e.au.a("下架");
        } else if (var1 == 1) {
            if (GlobalStatus.ct != null) {
                this.a(GlobalStatus.cx);
                this.e.ar.a(b(GlobalStatus.cx), a(this.e.l, GlobalStatus.cu, GlobalStatus.cw), (String[]) null, (String[]) null);
                if (this.j == 64) {
                    this.e.ar.a(this.aA, this.aq);
                }

                this.e.ar.a(GlobalStatus.a(this.k, this.e.l, this.e.ar.g()), 1);
            } else {
                this.e.ar.a((Image[]) null, (String[]) null, (String[]) null, (String[]) null);
            }

            this.e.au.a("取出");
        } else if (var1 == 2) {
            this.e.at.b(this.aY(), GlobalConfig.i, (byte) 2);
            this.e.au.a("确定");
        }

        this.e.au.a(true);
        this.e.aq.a((al) this.e.as);
        if (var1 == 2) {
            this.e.aq.a((al) this.e.at);
        } else {
            this.e.aq.a((al) this.e.ar);
        }

        this.e.aq.a((al) this.e.au);
        this.e.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
        this.e.aq.a(true);
        this.e.touchPageCase = this.e.k;
        this.j = this.k = 59;
    }

    private void ay(int var1) {
        if (this.l == 0) {
            this.e.aq.b(var1);
            if (var1 != 4 && var1 != 1) {
                if (var1 != 8 && var1 != 2) {
                    if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                        if (var1 == 536870912) {
                            this.m();
                            LoadingPage.g = this.ai;
                            return;
                        }

                        if (var1 == 1024) {
                            if (GlobalStatus.gQ > 1) {
                                if (this.e.as.a == 0) {
                                    this.a((byte) 0, (short) ((short) (GlobalStatus.gQ - 1 <= 1 ? 1 : GlobalStatus.gQ - 1)));
                                    return;
                                }

                                if (this.e.as.a == 1) {
                                    this.c((byte) 0, (short) ((short) (GlobalStatus.gQ - 1 <= 1 ? 1 : GlobalStatus.gQ - 1)));
                                    return;
                                }

                                this.b((byte) 0, (short) ((short) (GlobalStatus.gQ - 1 <= 1 ? 1 : GlobalStatus.gQ - 1)));
                                return;
                            }
                        } else if (var1 == 2048 && GlobalStatus.gR == 1) {
                            if (this.e.as.a == 0) {
                                this.a((byte) 0, (short) ((short) (GlobalStatus.gQ + 1)));
                                return;
                            }

                            if (this.e.as.a == 1) {
                                this.c((byte) 0, (short) ((short) (GlobalStatus.gQ + 1)));
                                return;
                            }

                            this.b((byte) 0, (short) ((short) (GlobalStatus.gQ + 1)));
                            return;
                        }
                    } else {
                        Object var2 = null;
                        if (this.e.as.a != 0 || GlobalStatus.jN == null) {
                            if (this.e.as.a == 1 && GlobalStatus.ct != null) {
                                String[] var4;
                                if (GlobalStatus.a(GlobalStatus.cv[this.e.ar.g()])) {
                                    var4 = new String[]{"查看", "拍卖", "取回"};
                                } else {
                                    var4 = new String[]{"拍卖", "取回"};
                                }

                                LoadingPage.a(35 + o, (3 + this.e.ar.i()) * GlobalConfig.j + p, var4, false);
                                this.l = 2;
                            }

                            return;
                        }

                        String[] var3;
                        if (GlobalStatus.a(GlobalStatus.jQ[this.e.ar.g()])) {
                            var3 = new String[]{"查看", "取消拍卖"};
                        } else {
                            var3 = new String[]{"取消拍卖"};
                        }

                        LoadingPage.a(35 + o, (3 + this.e.ar.i()) * GlobalConfig.j + p, var3, false);
                        this.l = 1;
                    }
                } else {
                    if (this.e.as.a == 0 && this.aV != 0) {
                        GlobalStatus.gQ = 1;
                        this.a((byte) 0, (short) GlobalStatus.gQ);
                        this.aV = this.e.as.a;
                        return;
                    }

                    if (this.e.as.a == 1) {
                        GlobalStatus.gQ = 1;
                        this.c((byte) 0, (short) GlobalStatus.gQ);
                        this.aV = this.e.as.a;
                        return;
                    }

                    if (this.e.as.a == 2 && this.aV != 2) {
                        GlobalStatus.gQ = 1;
                        this.b((byte) 0, (short) GlobalStatus.gQ);
                        this.aV = this.e.as.a;
                        return;
                    }
                }
            } else if (this.e.as.a == 0) {
                if (GlobalStatus.jN != null) {
                    this.e.ar.a(GlobalStatus.h(this.e.l, this.e.ar.g()), 1);
                    return;
                }
            } else if (this.e.as.a == 1 && GlobalStatus.ct != null) {
                this.e.ar.a(GlobalStatus.a(this.k, this.e.l, this.e.ar.g()), 1);
                return;
            }
        } else if (this.l == 1) {
            LoadingPage.b(var1);
            if (var1 != 1073741824 && var1 != 268435456 && var1 != 517) {
                if (var1 == 536870912) {
                    this.l = 0;
                    return;
                }
            } else if (GlobalStatus.a(GlobalStatus.jQ[this.e.ar.g()])) {
                if (LoadingPage.o == 0) {
                    if (this.e.as.a == 0) {
                        GlobalStatus.e(this.e.ar.g());
                    } else {
                        GlobalStatus.c(this.e.ar.g());
                    }

                    this.aq = this.e.ar.g();
                    this.aA = this.e.ar.h();
                    this.O.a(0, (short) this.k, this.cZ);
                    return;
                }

                if (LoadingPage.o == 1) {
                    this.l = 3;
                    LoadingPage.h = 0;
                    return;
                }
            } else if (LoadingPage.o == 0) {
                this.l = 3;
                LoadingPage.h = 0;
                return;
            }
        } else if (this.l == 2) {
            LoadingPage.b(var1);
            if (var1 != 1073741824 && var1 != 268435456 && var1 != 517) {
                if (var1 == 536870912) {
                    this.l = 0;
                    return;
                }
            } else if (GlobalStatus.a(GlobalStatus.cv[this.e.ar.g()])) {
                if (LoadingPage.o == 0) {
                    if (this.e.as.a == 0) {
                        GlobalStatus.e(this.e.ar.g());
                    } else {
                        GlobalStatus.c(this.e.ar.g());
                    }

                    this.aq = this.e.ar.g();
                    this.aA = this.e.ar.h();
                    this.O.a(0, (short) this.k, this.cZ);
                    return;
                }

                if (LoadingPage.o == 1) {
                    this.l = 4;
                    return;
                }

                if (LoadingPage.o == 2) {
                    this.ad(GlobalStatus.ct[this.e.ar.g()]);
                    return;
                }
            } else {
                if (LoadingPage.o == 0) {
                    this.l = 4;
                    return;
                }

                if (LoadingPage.o == 1) {
                    this.ad(GlobalStatus.ct[this.e.ar.g()]);
                    return;
                }
            }
        } else if (this.l == 3) {
            if (var1 == 1073741824 || var1 == 268435456 || var1 == 517) {
                this.a((byte) 0, (int) GlobalStatus.jN[this.e.ar.g()]);
                return;
            }

            if (var1 == 536870912) {
                this.l = 1;
                return;
            }
        } else if (this.l == 4) {
            this.d(var1);
            this.bR = this.n();
            if (var1 == 1073741824 || var1 == 268435456) {
                if (this.n() <= 0L) {
                    this.e.processException("输入金钱必须大于0!");
                    return;
                }

                this.l = 5;
                LoadingPage.h = 0;
                this.o();
                return;
            }

            if (var1 == 536870912) {
                this.l = 2;
                this.o();
                return;
            }
        } else if (this.l == 5) {
            if (var1 == 1073741824 || var1 == 268435456 || var1 == 517) {
                this.a((byte) 0, GlobalStatus.ct[this.e.ar.g()], this.bR);
                return;
            }

            if (var1 == 536870912) {
                this.l = 2;
                this.o();
            }
        }

    }

    private static String[] a(StringBuffer var0, String[] var1, byte[] var2) {
        if (var1 != null && var1.length > 0) {
            String[] var3 = new String[var1.length];

            for (int var4 = 0; var4 < var1.length; ++var4) {
                var0.delete(0, var0.capacity());
                if (var1[var4].startsWith("<")) {
                    var0.append(var1[var4].substring(3));
                } else {
                    var0.append(var1[var4]);
                }

                if (var0.length() > 3) {
                    var0.delete(3, var0.length());
                    var0.append("..");
                }

                if (var2 != null && var2.length == var1.length) {
                    var0.append("com.cc.x");
                    var0.append(var2[var4]);
                }

                var3[var4] = var0.toString();
            }

            return var3;
        } else {
            return null;
        }
    }

    public final void Y() {
        this.l = 0;
        this.e.aq.b();
        this.e.aq.a(GlobalStatus.kI == 0 ? "金豆商城" : "万能果商城");
        this.e.ar.a((Image[]) null, GlobalStatus.kH, (String[]) null, (String[]) null);
        this.e.au.a("确定");
        this.e.aq.a((al) this.e.ar);
        if (GlobalConfig.defaultHigh > 220) {
            this.e.aq.a((al) this.e.au);
        }

        this.e.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
        this.e.touchPageCase = this.e.k;
        this.j = this.k = 68;
    }

    private void az(int var1) {
        if (this.e.aq != null) {
            this.e.aq.b(var1);
        }

        if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
            if (var1 == 536870912) {
                GlobalStatus.L();
                this.aw();
                this.c(GlobalStatus.kI == 0 ? 0 : 1);
            }
        } else {
            this.aA = this.e.ar.h();
            this.aU = this.e.ar.g();
            byte[] var2;
            if ((var2 = NetPayloadBuilder.a((short) 4649, (byte) GlobalStatus.kI, (short) ((short) this.e.ar.g()), GlobalStatus.ad)) == null) {
                this.e.processException("获取上传指令数据错误!");
                return;
            }

            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4649, var2));
            this.e.a((String) null);
        }

    }

    public final void c(short var1) {
        this.bb = var1;
        this.l = 0;
        this.e.aq.b();
        this.e.aq.a(LoadingPage.a(GlobalStatus.kH[GlobalStatus.kN]) == -1 ? GlobalStatus.kH[GlobalStatus.kN] : GlobalStatus.kH[GlobalStatus.kN].substring(3, GlobalStatus.kH[GlobalStatus.kN].length()));
        this.e.ar.a((Image[]) null, GlobalStatus.kK, (String[]) null, (String[]) null);
        this.e.au.a("兑换");
        if (GlobalStatus.kJ != null && GlobalStatus.kJ.length > 0) {
            this.e.at.a(aA(0), GlobalConfig.i, (byte) 2);
        } else {
            this.e.at.a((String) null, GlobalConfig.i, (byte) 2);
        }

        this.e.at.a((byte) 1);
        this.e.aq.a((al) this.e.ar);
        this.e.aq.a((al) this.e.at);
        if (GlobalConfig.defaultHigh > 220) {
            this.e.aq.a((al) this.e.au);
        }

        this.e.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
        this.e.touchPageCase = this.e.k;
        this.j = this.k = 69;
    }

    private static String aA(int var0) {
        StringBuffer var1;
        (var1 = new StringBuffer()).append("<0>需求:");
        var1.append(GlobalStatus.kL[var0]);
        var1.append("<1>获得:");
        var1.append(GlobalStatus.kM[var0]);
        return var1.toString();
    }

    private void aB(int var1) {
        if (this.l == 0) {
            if (this.e.aq != null) {
                this.e.aq.b(var1);
            }

            if (var1 == 536870912) {
                if (this.bb == 68) {
                    this.al = null;
                    GlobalStatus.M();
                    this.Y();
                    this.e.ar.a(this.aA, this.aU);
                } else {
                    this.N();
                }
            }

            if (GlobalStatus.kJ == null || GlobalStatus.kJ.length <= 0) {
                return;
            }

            if (var1 == 514 || var1 == 520 || var1 == 1 || var1 == 4) {
                this.e.at.a(aA(this.e.ar.g()), GlobalConfig.i, (byte) 2);
                this.e.at.a((byte) 1);
                return;
            }

            if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
                this.a(99L);
                this.l = 1;
                return;
            }
        } else if (this.l == 1) {
            this.b(var1);
            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    this.l = 0;
                }
            } else {
                byte[] var2;
                if ((var2 = NetPayloadBuilder.a((short) 4650, (int) GlobalStatus.kJ[this.e.ar.g()], (int) this.ag, GlobalStatus.ad)) == null) {
                    this.e.processException("获取上传指令数据错误!");
                    return;
                }

                NetPacket var3 = new NetPacket((short) 4650, var2);
                MainCanvas.netUtils.sendPacket(var3);
                this.e.a((String) null);
            }
        }

    }

    public final void Z() {
        this.aH = this.e.as.a;
        this.l = 0;
        if (GlobalStatus.kP != 0 && GlobalStatus.kP != 3) {
            this.da = GlobalStatus.kQ;
        } else {
            this.da = "第" + GlobalStatus.kS + "题:" + GlobalStatus.kQ;
        }

        K = new TextRender(this.da, (short) (GlobalConfig.defaultWidth - 20));
        this.am = GlobalStatus.kR;
        LoadingPage.a(MainCanvas.F, K, this.am, (String[]) null, true);
        MainCanvas.f.a(this.f, h, i, true, false, 1009050);
        this.e.touchPageCase = this.e.k;
        this.j = this.k = 70;
    }

    private void aC(int var1) {
        if (this.l == 0) {
            if (var1 != 8 && var1 != 516) {
                if (var1 == 2 || var1 == 518) {
                    LoadingPage.e = LoadingPage.e + LoadingPage.d < K.a() ? LoadingPage.e + LoadingPage.d : LoadingPage.e;
                }
            } else {
                LoadingPage.e = LoadingPage.e - LoadingPage.d >= 0 ? LoadingPage.e - LoadingPage.d : 0;
            }

            if (GlobalStatus.kR.length <= 0) {
                return;
            }

            if (var1 != 1 && var1 != 514) {
                if (var1 != 4 && var1 != 520) {
                    if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
                        byte[] var2;
                        if ((var2 = NetPayloadBuilder.a((short) 4652, GlobalStatus.ad, (int) GlobalStatus.kO, (byte) GlobalStatus.kP, (byte) ((byte) LoadingPage.g))) != null) {
                            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4652, var2));
                            this.e.a((String) null);
                        } else {
                            this.e.processException("获取上传指令数据错误!");
                        }

                        GlobalStatus.kT = false;
                        this.l = 0;
                    }
                } else if (this.am != null) {
                    LoadingPage.g = LoadingPage.g + 1 < this.am.length ? LoadingPage.g + 1 : 0;
                    return;
                }
            } else if (this.am != null) {
                LoadingPage.g = LoadingPage.g - 1 >= 0 ? LoadingPage.g - 1 : this.am.length - 1;
                return;
            }
        }

    }

    private void B(Graphics var1) {
        if (this.l == 0) {
            LoadingPage.a(var1, 0, GlobalConfig.defaultHigh - LoadingPage.f, GlobalConfig.defaultWidth, LoadingPage.f, K, this.am, (String[]) null);
        }

    }

    public final void aa() {
        this.l = 0;
        this.e.aq.b();
        this.e.aq.a(GlobalStatus.bz == null ? "" : GlobalStatus.bz);
        this.e.at.a(GlobalStatus.by, GlobalConfig.i, (byte) 2);
        this.e.at.a((byte) 0);
        this.e.au.a("确定");
        this.e.aq.a((al) this.e.at);
        if (GlobalConfig.defaultHigh > 220) {
            this.e.aq.a((al) this.e.au);
        }

        this.e.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
        this.e.touchPageCase = this.e.k;
        this.j = this.k = 75;
    }

    private void aD(int var1) {
        if (this.e.aq != null) {
            this.e.aq.b(var1);
        }

        if (var1 == 268435456 || var1 == 536870912) {
            GlobalStatus.by = null;
            GlobalStatus.bz = null;
            this.N();
        }

    }

    private void aE(int var1) {
        if (this.l == 0) {
            LoadingPage.b(var1);
            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    this.j = this.k = 0;
                }
            } else if (GlobalStatus.bf != 0) {
                if (GlobalStatus.bs >= 0) {
                    if (LoadingPage.o == 0) {
                        this.aZ();
                        return;
                    }

                    if (LoadingPage.o == 1) {
                        this.ba();
                        return;
                    }

                    if (LoadingPage.o == 3) {
                        if (GlobalStatus.bs == 0) {
                            this.bd();
                            return;
                        }

                        if (GlobalStatus.bs == 1) {
                            this.bc();
                            return;
                        }
                    } else {
                        if (LoadingPage.o == 2) {
                            this.p();
                            return;
                        }

                        if (LoadingPage.o == 4) {
                            this.d((byte) 0);
                            return;
                        }

                        if (LoadingPage.o == 5) {
                            this.bb();
                            return;
                        }

                        if (LoadingPage.o == 6) {
                            this.by = 1;
                            this.aF(-1);
                            return;
                        }
                    }
                } else {
                    if (LoadingPage.o == 0) {
                        this.aZ();
                        return;
                    }

                    if (LoadingPage.o == 1) {
                        this.ba();
                        return;
                    }

                    if (LoadingPage.o == 2) {
                        this.p();
                        return;
                    }

                    if (LoadingPage.o == 3) {
                        this.d((byte) 0);
                        return;
                    }

                    if (LoadingPage.o == 4) {
                        this.bb();
                        return;
                    }

                    if (LoadingPage.o == 5) {
                        this.by = 1;
                        this.aF(-1);
                        return;
                    }
                }
            } else if (GlobalStatus.bs >= 0) {
                if (LoadingPage.o == 0) {
                    this.aZ();
                    return;
                }

                if (LoadingPage.o == 1) {
                    this.ba();
                    return;
                }

                if (LoadingPage.o == 2) {
                    if (GlobalStatus.bs == 0) {
                        this.bd();
                        return;
                    }

                    if (GlobalStatus.bs == 1) {
                        this.bc();
                        return;
                    }
                } else {
                    if (LoadingPage.o == 3) {
                        this.d((byte) 0);
                        return;
                    }

                    if (LoadingPage.o == 4) {
                        this.bb();
                        return;
                    }

                    if (LoadingPage.o == 5) {
                        this.by = 1;
                        this.aF(-1);
                        return;
                    }
                }
            } else {
                if (LoadingPage.o == 0) {
                    this.aZ();
                    return;
                }

                if (LoadingPage.o == 1) {
                    this.ba();
                    return;
                }

                if (LoadingPage.o == 2) {
                    this.d((byte) 0);
                    return;
                }

                if (LoadingPage.o == 3) {
                    this.bb();
                    return;
                }

                if (LoadingPage.o == 4) {
                    this.by = 1;
                    this.aF(-1);
                    return;
                }
            }
        }

    }

    private void aF(int var1) {
        byte[] var2;
        if ((var2 = NetPayloadBuilder.c((short) 4106, GlobalStatus.ad, (int) -1)) != null) {
            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4106, var2));
            this.e.a((String) null);
        } else {
            this.e.processException("获取上传指令数据错误!");
        }
    }

    private void aZ() {
        byte[] var1;
        if ((var1 = NetPayloadBuilder.C((short) 4680, GlobalStatus.ad)) != null) {
            NetPacket var2 = new NetPacket((short) 4680, var1);
            MainCanvas.netUtils.sendPacket(var2);
            this.e.a((String) null);
        } else {
            this.e.processException("获取上传指令数据错误!");
        }
    }

    private void aG(int var1) {
        if (this.l == 0) {
            if (var1 != 8 && var1 != 516) {
                if (var1 == 2 || var1 == 518) {
                    LoadingPage.e = LoadingPage.e + LoadingPage.d < K.a() ? LoadingPage.e + LoadingPage.d : LoadingPage.e;
                }
            } else {
                LoadingPage.e = LoadingPage.e - LoadingPage.d >= 0 ? LoadingPage.e - LoadingPage.d : 0;
            }

            if (GlobalStatus.lz == null || GlobalStatus.lz.length <= 0) {
                return;
            }

            if (var1 != 1 && var1 != 514) {
                if (var1 != 4 && var1 != 520) {
                    if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
                        if (GlobalStatus.lB[LoadingPage.g] != null) {
                            this.l = 1;
                        } else {
                            short var2 = this.j;
                            this.N();
                            if (aD()) {
                                if (LoadingPage.g == 0) {
                                    this.e.b("游客注册 第1步: ", "修改角色昵称");
                                }
                            } else if (var2 == 76) {
                                this.a((byte) 1, GlobalStatus.lu, GlobalStatus.lv, Short.parseShort(GlobalStatus.lA[LoadingPage.g]), GlobalStatus.lC);
                            } else {
                                this.a((byte) 1, GlobalStatus.lu, GlobalStatus.lv, Short.parseShort(GlobalStatus.lA[LoadingPage.g]), GlobalStatus.lz[LoadingPage.g]);
                            }
                        }
                    }
                } else if (GlobalStatus.lz != null) {
                    LoadingPage.g = LoadingPage.g + 1 < GlobalStatus.lz.length ? LoadingPage.g + 1 : 0;
                    LoadingPage.h = 0;
                }
            } else if (GlobalStatus.lz != null) {
                LoadingPage.g = LoadingPage.g - 1 >= 0 ? LoadingPage.g - 1 : GlobalStatus.lz.length - 1;
                LoadingPage.h = 0;
            }

            if (var1 == 536870912) {
                this.as = 0;
                if (aD()) {
                    this.N();
                } else if (this.j == 76) {
                    this.a((byte) 1, GlobalStatus.lu, GlobalStatus.lv, (short) -1, GlobalStatus.lC);
                    this.d((byte) 1);
                    int var3 = 0;
                    if (GlobalStatus.lv == 2 && GlobalStatus.lC != null && (var3 = GlobalStatus.P.a(GlobalStatus.lC)) != -1) {
                        this.e.ar.a(var3 + 1);
                    }
                } else {
                    this.a((byte) 1, GlobalStatus.lu, GlobalStatus.lv, (short) -1, "");
                    this.N();
                }

                K = null;
                return;
            }
        } else if (this.l == 1) {
            if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
                this.N();
                this.a((byte) 1, GlobalStatus.lu, GlobalStatus.lv, Short.parseShort(GlobalStatus.lA[LoadingPage.g]), GlobalStatus.lz[LoadingPage.g]);
                this.l = 0;
            }

            if (var1 == 536870912) {
                this.l = 0;
            }
        }

    }

    private void aH(int var1) {
        if (this.l == 0) {
            if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
                GlobalStatus.P.i = this.e.ar.g();
                ak var2 = GlobalStatus.P.c[GlobalStatus.P.i];
                this.l = 1;
                this.e.av.b();
                this.e.av.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
                this.e.av.a(var2.b);
                this.e.av.a((bk) (new bi(var2.c)));
                u var4;
                (var4 = new u()).b(var2.d);
                this.e.av.a((bk) var4);
                this.e.av.d();
                return;
            }

            if (this.e.aq != null) {
                this.e.aq.b(var1);
            }

            if (var1 == 536870912) {
                this.d((byte) 0);
                return;
            }
        } else if (this.l == 1) {
            if (this.e.av != null) {
                this.e.av.a(var1);
            }

            if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
                this.l = 2;
                LoadingPage.h = 0;
            }

            if (var1 == 536870912) {
                this.e.av.b();
                this.u();
                this.e.ar.a(GlobalStatus.P.i);
                GlobalStatus.P.i = -1;
                this.l = 0;
                return;
            }
        } else if (this.l == 2) {
            if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
                ak var5 = GlobalStatus.P.c[GlobalStatus.P.i];
                String var3 = var5.f;
                byte[] var6;
                if ((var6 = NetPayloadBuilder.r((short) 4678, GlobalStatus.ad, var3)) == null) {
                    this.e.processException("获取上传指令数据错误!");
                } else {
                    MainCanvas.netUtils.sendPacket(new NetPacket((short) 4678, var6));
                    this.e.a((String) null);
                }
            }

            if (var1 == 536870912) {
                this.l = 1;
            }
        }

    }

    private void aI(int var1) {
        if (this.l == 0) {
            if (this.e.aq != null) {
                this.e.aq.b(var1);
            }

            if ((var1 == 8 || var1 == 2 || var1 == 516 || var1 == 518) && this.e.as.a != this.as) {
                this.d(this.e.as.a);
            }

            if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
                int var8 = this.e.ar.g();
                if (this.as == 0) {
                    if (var8 == 0) {
                        LoadingPage.a(80 + GlobalConfig.f, 2 * GlobalConfig.j + 26 + this.e.ar.i() * GlobalConfig.j + GlobalConfig.g, f_1.a, false);
                        this.l = 1;
                    } else {
                        bo_1 var9;
                        boolean var11 = (var9 = GlobalStatus.O.f[var8 - 1]) != null && var9.f;
                        LoadingPage.a(80 + GlobalConfig.f, 2 * GlobalConfig.j + 26 + this.e.ar.i() * GlobalConfig.j + GlobalConfig.g, var11 ? f_1.c : f_1.b, false);
                        this.l = 1;
                    }
                } else if (var8 == 0) {
                    if (GlobalStatus.V != null) {
                        this.e.processException(GlobalStatus.V);
                    } else {
                        this.e.l();
                    }
                } else {
                    be_1 var10 = GlobalStatus.P.b[var8 - 1];
                    this.g(var10.a);
                }
            }

            if ((var1 == 1 || var1 == 4 || var1 == 514 || var1 == 520) && this.as == 0) {
                this.e.at.a(GlobalStatus.O.j[this.e.ar.g()], GlobalConfig.i, (byte) 2);
                this.e.at.a((byte) 1);
            }

            if (var1 == 536870912) {
                int var10000 = this.as;
                this.N();
            }

        } else {
            if (this.l == 1) {
                if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                    if (var1 == 1 || var1 == 4 || var1 == 514 || var1 == 520) {
                        LoadingPage.b(var1);
                        return;
                    }

                    if (var1 == 536870912 && this.as == 0) {
                        this.l = 0;
                    }
                } else if (this.as == 0) {
                    int var2 = this.e.ar.g();
                    String var3 = LoadingPage.p[LoadingPage.o];
                    if (var2 == 0) {
                        if (f_1.a[0].equals(var3)) {
                            this.av(GlobalStatus.O.d - 1);
                        } else if (f_1.a[1].equals(var3)) {
                            this.av(GlobalStatus.O.d + 1);
                        } else if (f_1.a[2].equals(var3)) {
                            if (GlobalStatus.S != null) {
                                this.l = 0;
                                this.e.processException(GlobalStatus.S);
                            } else {
                                this.e.a((byte) 0, "发送邮件", GlobalStatus.O.n, GlobalStatus.O.o, GlobalStatus.O.p == null ? "" : GlobalStatus.O.p, GlobalStatus.O.q, GlobalStatus.O.r);
                            }
                        } else if (f_1.a[3].equals(var3)) {
                            this.f("all");
                        } else {
                            if (!f_1.a[4].equals(var3)) {
                                return;
                            }

                            if (GlobalStatus.U != null) {
                                this.e.processException(GlobalStatus.U);
                            } else {
                                byte[] var5;
                                if ((var5 = NetPayloadBuilder.l((short) 4672, GlobalStatus.ad)) == null) {
                                    this.e.processException("获取上传指令数据错误!");
                                    return;
                                }

                                MainCanvas.netUtils.sendPacket(new NetPacket((short) 4668, var5));
                                this.e.a((String) null);
                            }
                        }
                    } else {
                        bo_1 var4 = GlobalStatus.O.f[var2 - 1];
                        if (f_1.b[0].equals(var3)) {
                            var4.f = true;
                            GlobalStatus.O.c();
                            this.d((byte) 0);
                            this.e.ar.a(var2);
                            this.e.at.a(GlobalStatus.O.j[var2], GlobalConfig.i, (byte) 1);
                            this.e.at.a((byte) 1);
                            this.l = 0;
                            String var6 = var4.a;
                            byte[] var7;
                            if ((var7 = NetPayloadBuilder.h((short) 4673, GlobalStatus.ad, var6)) == null) {
                                this.e.processException("获取上传指令数据错误!");
                                return;
                            }

                            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4673, var7));
                        } else if (f_1.b[1].equals(var3)) {
                            if (GlobalStatus.S != null) {
                                this.e.processException(GlobalStatus.S);
                            } else if (!var4.f) {
                                this.e.processException("未读邮件，请查看后再进行回复");
                            } else {
                                GlobalStatus.O.a();
                                GlobalStatus.O.q = var4.a;
                                GlobalStatus.O.r = var4.d;
                                GlobalStatus.O.o = var4.e;
                                this.e.a((byte) 0, "回复邮件", GlobalStatus.O.n, GlobalStatus.O.o, GlobalStatus.O.p == null ? "" : GlobalStatus.O.p, GlobalStatus.O.q, GlobalStatus.O.r);
                            }
                        } else if (f_1.b[2].equals(var3)) {
                            this.f(var4.a);
                        } else if (f_1.b[3].equals(var3)) {
                            this.a(var4.e, false);
                        } else if (f_1.b[4].equals(var3)) {
                            this.b(var4.e);
                        } else {
                            if (!f_1.b[5].equals(var3)) {
                                return;
                            }

                            if (GlobalStatus.T != null) {
                                this.e.processException(GlobalStatus.T);
                            } else {
                                if (var4.f) {
                                    this.e.a(var4.a, var4.e, var4.b, var4.c);
                                    return;
                                }

                                this.e.processException("未读邮件，请先查看");
                            }
                        }
                    }
                }
            }

        }
    }

    private void aJ(int var1) {
        if (this.l == 0) {
            if (this.e.aq != null) {
                this.e.aq.b(var1);
            }

            if ((var1 == 8 || var1 == 2 || var1 == 516 || var1 == 518) && this.e.as.a != this.as) {
                this.e(this.e.as.a);
            }

            if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
                Object var4 = null;
                String var5;
                if (this.as == 0) {
                    if (GlobalStatus.lP == null) {
                        return;
                    }

                    var5 = GlobalStatus.lP[this.e.ar.g()];
                } else if (this.as == 1) {
                    if (GlobalStatus.lX == null) {
                        return;
                    }

                    var5 = GlobalStatus.lX[this.e.ar.g()];
                } else {
                    if (this.as != 2) {
                        return;
                    }

                    if (GlobalStatus.mf == null) {
                        return;
                    }

                    var5 = GlobalStatus.mf[this.e.ar.g()];
                }

                if (var5 != null) {
                    LoadingPage.a(80 + GlobalConfig.f, 2 * GlobalConfig.j + 26 + this.e.ar.i() * GlobalConfig.j + GlobalConfig.g, new String[]{var5}, false);
                    this.l = 1;
                }
            }

            if (var1 == 1 || var1 == 4 || var1 == 514 || var1 == 520) {
                int var6 = 0;
                if (this.as == 0) {
                    if (GlobalStatus.lO != null) {
                        this.e.ar.a(GlobalStatus.lO[this.e.ar.g()], 1);
                    }

                    if (GlobalStatus.lN != null && GlobalStatus.lN.length != 1) {
                        var6 = this.e.ar.g();
                        this.e.at.a(GlobalStatus.lN[var6], GlobalConfig.i, (byte) 2);
                        if (GlobalStatus.lK != null) {
                            this.e.at.a((byte) 1);
                        }
                    }
                }

                if (this.as == 1) {
                    if (GlobalStatus.lW != null) {
                        this.e.ar.a(GlobalStatus.lW[this.e.ar.g()], 1);
                    }

                    if (GlobalStatus.lV != null && GlobalStatus.lV.length != 1) {
                        var6 = this.e.ar.g();
                        this.e.at.a(GlobalStatus.lV[var6], GlobalConfig.i, (byte) 2);
                        if (GlobalStatus.lS != null) {
                            this.e.at.a((byte) 1);
                        }
                    }
                }

                if (this.as == 2) {
                    if (GlobalStatus.me != null) {
                        this.e.ar.a(GlobalStatus.me[this.e.ar.g()], 1);
                    }

                    if (GlobalStatus.md != null && GlobalStatus.md.length != 1) {
                        var6 = this.e.ar.g();
                        this.e.at.a(GlobalStatus.md[var6], GlobalConfig.i, (byte) 2);
                        if (GlobalStatus.ma != null) {
                            this.e.at.a((byte) 1);
                        }
                    }
                }
            }

            if (var1 != 536870912) {
                return;
            }

            this.as = 0;
            this.a((byte) 0, GlobalStatus.lD, GlobalStatus.lE, (short) -1, GlobalStatus.lF);
            if (this.j == 1) {
                this.av();
                this.c((int) 7);
            } else {
                if (this.j != 76) {
                    this.N();
                    return;
                }

                this.d((byte) 1);
                int var10 = 0;
                if (GlobalStatus.lE == 2 && GlobalStatus.mi != null && (var10 = GlobalStatus.P.a(GlobalStatus.mi)) != -1) {
                    this.e.ar.a(var10 + 1);
                }
            }
        } else if (this.l == 1) {
            if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
                String var2 = null;
                var1 = 0;
                if (this.as == 0) {
                    var1 = GlobalStatus.lQ[this.e.ar.g()];
                } else if (this.as == 1) {
                    var1 = GlobalStatus.lY[this.e.ar.g()];
                } else if (this.as == 2) {
                    var1 = GlobalStatus.mg[this.e.ar.g()];
                }

                if (var1 != 0) {
                    var2 = String.valueOf(var1);
                }

                if (var2 != null) {
                    this.aE = this.e.ar.g();
                    this.a(GlobalStatus.lD, GlobalStatus.lE, var2, GlobalStatus.mi);
                }

                this.l = 0;
                return;
            }

            if (var1 == 536870912) {
                this.l = 0;
            }
        }

    }

    private void C(Graphics var1) {
        if (this.l == 0 && this.e.aq != null) {
            this.e.aq.a(var1);
        } else if (this.l == 1 && this.e.av != null) {
            this.e.av.a(var1);
        } else {
            if (this.l == 2 && this.e.av != null) {
                this.e.av.a(var1);
                ak var2 = GlobalStatus.P.c[GlobalStatus.P.i];
                LoadingPage.a(var1, var2.e, new String[]{"确定", "取消"});
            }

        }
    }

    private void D(Graphics var1) {
        if (this.e.aq != null) {
            this.e.aq.a(var1);
        }

        if (this.l == 1) {
            LoadingPage.c(var1);
        }

    }

    private void E(Graphics var1) {
        if (this.e.aq != null) {
            this.e.aq.a(var1);
        }

        if (this.l == 1) {
            LoadingPage.c(var1);
        }

    }

    private void F(Graphics var1) {
        LoadingPage.a(var1, 0, GlobalConfig.defaultHigh - LoadingPage.f, GlobalConfig.defaultWidth, LoadingPage.f, K, GlobalStatus.lz, (String[]) null);
        if (this.l == 1) {
            LoadingPage.a(var1, GlobalStatus.lB[LoadingPage.g], new String[]{"确定", "取消"});
        }

    }

    private void ba() {
        byte[] var1;
        if ((var1 = NetPayloadBuilder.y((short) 4659, GlobalStatus.ad)) != null) {
            NetPacket var2 = new NetPacket((short) 4659, var1);
            MainCanvas.netUtils.sendPacket(var2);
            this.e.a((String) null);
        } else {
            this.e.processException("获取上传指令数据错误!");
        }
    }

    private void bb() {
        byte[] var1;
        if ((var1 = NetPayloadBuilder.b((short) 4267)) != null) {
            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4267, var1));
        } else {
            this.e.processException("获取上传指令数据错误!");
        }
    }

    private void a(byte var1, byte var2, byte var3, byte var4) {
        if (GlobalStatus.bs == 0) {
            this.e.processException("队员不能发随机送组队邀请");
        } else if (GlobalStatus.bs == 1 && GlobalStatus.q != null && GlobalStatus.q.length >= 3) {
            this.e.processException("队伍已满，无法邀请");
        } else if (GlobalStatus.G()) {
            this.e.processException("住宅区域中，无法邀请");
        } else {
            byte[] var5;
            if ((var5 = NetPayloadBuilder.a((short) 4259, var1, var2, var3, var4, GlobalStatus.ad)) != null) {
                NetPacket var6 = new NetPacket((short) 4659, var5);
                MainCanvas.netUtils.sendPacket(var6);
                this.e.a((String) null);
            } else {
                this.e.processException("获取上传指令数据错误!");
            }
        }
    }

    private void bc() {
        byte[] var1;
        if ((var1 = NetPayloadBuilder.h((short) 4120, GlobalStatus.ad)) != null) {
            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4120, var1));
            this.e.processException("解散队伍请求已发送!");
        } else {
            this.e.processException("获取上传指令数据错误!");
        }
    }

    private void bd() {
        byte[] var1;
        if ((var1 = NetPayloadBuilder.i((short) 4121, GlobalStatus.ad)) != null) {
            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4121, var1));
            this.e.processException("脱离队伍请求已发送!");
        } else {
            this.e.processException("获取上传指令数据错误!");
        }
    }

    private void G(Graphics var1) {
        if (this.l == 0) {
            LoadingPage.c(var1);
        }

    }

    public final void ab() {
        if (aW[18] == 0) {
            this.dd = new TextRender(GlobalStatus.k, (short) GlobalConfig.i.stringWidth(GlobalStatus.k));
            this.db = GlobalConfig.defaultWidth;
            this.dc = 40;
        }

    }

    public final void d(short var1) {
        this.l = var1;
        this.e.aq.b();
        this.e.aq.a((GlobalStatus.lg == 1 ? GlobalStatus.lf : "帮派") + "的成就");
        this.e.aq.a(true);
        this.e.ar.a((Image[]) null, GlobalStatus.lb, (String[]) null, GlobalStatus.lc);
        this.e.at.a(aK(0), GlobalConfig.i, (byte) 1);
        this.e.at.a((byte) 1);
        this.e.au.a("操作");
        this.e.au.a(true);
        this.e.aq.a((al) this.e.ar);
        this.e.aq.a((al) this.e.at);
        if (GlobalConfig.defaultHigh > 220) {
            this.e.aq.a((al) this.e.au);
        }

        this.e.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
        this.e.touchPageCase = this.e.k;
        this.j = this.k;
        this.k = 104;
    }

    private static String aK(int var0) {
        String var1 = null;
        if (GlobalStatus.ld != null && GlobalStatus.ld.length > var0) {
            var1 = GlobalStatus.ld[var0];
        }

        return var1;
    }

    public final void e(short var1) {
        this.l = var1;
        this.T.b();
        this.T.a(GlobalStatus.lh);
        this.T.a(true);
        this.bu.a((Image[]) null, GlobalStatus.li, (String[]) null, GlobalStatus.lj);
        this.bu.a(GlobalStatus.ln);
        this.bv.a(GlobalStatus.lk[0], GlobalConfig.i, (byte) 1);
        this.bv.a((byte) 1);
        this.bw.a("操作");
        this.bw.a(true);
        this.T.a((al) this.bu);
        this.T.a((al) this.bv);
        if (GlobalConfig.defaultHigh > 220) {
            this.T.a((al) this.bw);
        }

        this.T.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
        this.e.touchPageCase = this.e.k;
        this.j = this.k;
        this.k = 105;
    }

    private void H(Graphics var1) {
        if (this.e.aq != null) {
            this.e.aq.a(var1);
        }

    }

    private void I(Graphics var1) {
        if (this.T != null) {
            this.T.a(var1);
        }

    }

    private void aL(int var1) {
        if (this.l != 0 && this.l != 4) {
            if (this.l == 2) {
                if (this.T != null) {
                    this.T.b(var1);
                }

                if (var1 == 514 || var1 == 520 || var1 == 1 || var1 == 4) {
                    this.bv.a(GlobalStatus.lk[this.bu.g()], GlobalConfig.i, (byte) 1);
                    this.bv.a((byte) 1);
                    return;
                }

                if (var1 == 536870912) {
                    this.k = 104;
                    GlobalStatus.lr = 1;
                    GlobalStatus.Q();
                    return;
                }

                if (var1 == 1024) {
                    if (GlobalStatus.lr > 1 && GlobalStatus.ls == 1) {
                        if (GlobalStatus.lr - 1 <= 1) {
                            GlobalStatus.lr = 1;
                        } else {
                            --GlobalStatus.lr;
                        }

                        this.a(GlobalStatus.lo, (short) 2, GlobalStatus.lr);
                        return;
                    }

                    if (GlobalStatus.lr > 1 && GlobalStatus.ls == 0) {
                        if (GlobalStatus.lr - 1 < 1) {
                            GlobalStatus.lr = 1;
                        } else {
                            --GlobalStatus.lr;
                        }

                        this.a(GlobalStatus.lo, (short) 2, GlobalStatus.lr);
                        return;
                    }
                } else if (var1 == 2048) {
                    if (GlobalStatus.lr <= 1 && GlobalStatus.ls == 1) {
                        ++GlobalStatus.lr;
                        this.a(GlobalStatus.lo, (short) 2, GlobalStatus.lr);
                        return;
                    }

                    if (GlobalStatus.lr > 1 && GlobalStatus.ls == 1) {
                        ++GlobalStatus.lr;
                        this.a(GlobalStatus.lo, (short) 2, GlobalStatus.lr);
                        return;
                    }
                }
            } else if (this.l == 3) {
                if (this.T != null) {
                    this.T.b(var1);
                }

                if (var1 == 514 || var1 == 520 || var1 == 1 || var1 == 4) {
                    this.bv.a(GlobalStatus.lk[this.bu.g()], GlobalConfig.i, (byte) 1);
                    this.bv.a((byte) 1);
                    return;
                }

                if (var1 == 536870912) {
                    this.k = 104;
                    GlobalStatus.lr = 1;
                    GlobalStatus.Q();
                    return;
                }

                if (var1 == 1024) {
                    if (GlobalStatus.lr > 1 && GlobalStatus.ls == 1) {
                        if (GlobalStatus.lr - 1 <= 1) {
                            GlobalStatus.lr = 1;
                        } else {
                            --GlobalStatus.lr;
                        }

                        this.a(GlobalStatus.lo, (short) 3, GlobalStatus.lr);
                        return;
                    }

                    if (GlobalStatus.lr > 1 && GlobalStatus.ls == 0) {
                        if (GlobalStatus.lr - 1 < 1) {
                            GlobalStatus.lr = 1;
                        } else {
                            --GlobalStatus.lr;
                        }

                        this.a(GlobalStatus.lo, (short) 3, GlobalStatus.lr);
                        return;
                    }
                } else if (var1 == 2048) {
                    if (GlobalStatus.lr <= 1 && GlobalStatus.ls == 1) {
                        ++GlobalStatus.lr;
                        this.a(GlobalStatus.lo, (short) 3, GlobalStatus.lr);
                        return;
                    }

                    if (GlobalStatus.lr > 1 && GlobalStatus.ls == 1) {
                        ++GlobalStatus.lr;
                        this.a(GlobalStatus.lo, (short) 3, GlobalStatus.lr);
                    }
                }
            }
        } else {
            if (this.T != null) {
                this.T.b(var1);
            }

            if (var1 == 514 || var1 == 520 || var1 == 1 || var1 == 4) {
                this.bv.a(GlobalStatus.lk[this.bu.g()], GlobalConfig.i, (byte) 1);
                this.bv.a((byte) 1);
                return;
            }

            if (var1 == 536870912) {
                this.k = 104;
                GlobalStatus.lr = 1;
                GlobalStatus.Q();
                return;
            }

            if (var1 == 1024) {
                if (GlobalStatus.lr > 1 && GlobalStatus.ls == 1) {
                    if (GlobalStatus.lr - 1 <= 1) {
                        GlobalStatus.lr = 1;
                    } else {
                        --GlobalStatus.lr;
                    }

                    this.a(GlobalStatus.ad, this.l, GlobalStatus.lr);
                    return;
                }

                if (GlobalStatus.lr > 1 && GlobalStatus.ls == 0) {
                    if (GlobalStatus.lr - 1 < 1) {
                        GlobalStatus.lr = 1;
                    } else {
                        --GlobalStatus.lr;
                    }

                    this.a(GlobalStatus.ad, this.l, GlobalStatus.lr);
                    return;
                }
            } else if (var1 == 2048) {
                if (GlobalStatus.lr <= 1 && GlobalStatus.ls == 1) {
                    ++GlobalStatus.lr;
                    this.a(GlobalStatus.ad, this.l, GlobalStatus.lr);
                    return;
                }

                if (GlobalStatus.lr > 1 && GlobalStatus.ls == 1) {
                    ++GlobalStatus.lr;
                    this.a(GlobalStatus.ad, this.l, GlobalStatus.lr);
                    return;
                }
            }
        }

    }

    private void aM(int var1) {
        if (this.l != 0 && this.l != 4) {
            if (this.l == 2) {
                if (this.e.aq != null) {
                    this.e.aq.b(var1);
                }

                if (var1 == 1 || var1 == 514 || var1 == 520 || var1 == 4) {
                    this.e.at.a(aK(this.e.ar.g()), GlobalConfig.i, (byte) 1);
                    this.e.at.a((byte) 1);
                    return;
                }

                if (var1 == 268435456 || var1 == 1073741824) {
                    this.a(GlobalStatus.lo, (short) 2, (short) 1);
                    return;
                }

                if (var1 == 536870912) {
                    GlobalStatus.lp = 1;
                    this.b((byte) 0);
                    GlobalStatus.P();
                    return;
                }

                if (var1 == 1024) {
                    if (GlobalStatus.lp > 1 && GlobalStatus.lq == 1) {
                        if (GlobalStatus.lp - 1 <= 1) {
                            GlobalStatus.lp = 1;
                        } else {
                            --GlobalStatus.lp;
                        }

                        this.a(this.df, GlobalStatus.ad, (short) 2, (short) GlobalStatus.lp);
                        return;
                    }

                    if (GlobalStatus.lp > 1 && GlobalStatus.lq == 0) {
                        if (GlobalStatus.lp - 1 < 1) {
                            GlobalStatus.lp = 1;
                        } else {
                            --GlobalStatus.lp;
                        }

                        this.a(this.df, GlobalStatus.ad, (short) 2, (short) GlobalStatus.lp);
                        return;
                    }
                } else if (var1 == 2048) {
                    if (GlobalStatus.lp <= 1 && GlobalStatus.lq == 1) {
                        ++GlobalStatus.lp;
                        this.a(this.df, GlobalStatus.ad, (short) 2, (short) GlobalStatus.lp);
                        return;
                    }

                    if (GlobalStatus.lp > 1 && GlobalStatus.lq == 1) {
                        ++GlobalStatus.lp;
                        this.a(this.df, GlobalStatus.ad, (short) 2, (short) GlobalStatus.lp);
                        return;
                    }
                }
            } else if (this.l == 3) {
                if (this.e.aq != null) {
                    this.e.aq.b(var1);
                }

                if (var1 == 1 || var1 == 514 || var1 == 520 || var1 == 4) {
                    this.e.at.a(aK(this.e.ar.g()), GlobalConfig.i, (byte) 1);
                    this.e.at.a((byte) 1);
                    return;
                }

                if (var1 == 268435456 || var1 == 1073741824) {
                    this.a(GlobalStatus.lo, (short) 3, (short) 1);
                    return;
                }

                if (var1 == 536870912) {
                    this.p((int) 0);
                    GlobalStatus.lp = 1;
                    GlobalStatus.P();
                    return;
                }

                if (var1 == 1024) {
                    if (GlobalStatus.lp > 1 && GlobalStatus.lq == 1) {
                        if (GlobalStatus.lp - 1 <= 1) {
                            GlobalStatus.lp = 1;
                        } else {
                            --GlobalStatus.lp;
                        }

                        this.a(this.de, GlobalStatus.ad, (short) 3, (short) GlobalStatus.lp);
                        return;
                    }

                    if (GlobalStatus.lp > 1 && GlobalStatus.lq == 0) {
                        if (GlobalStatus.lp - 1 < 1) {
                            GlobalStatus.lp = 1;
                        } else {
                            --GlobalStatus.lp;
                        }

                        this.a(this.de, GlobalStatus.ad, (short) 3, (short) GlobalStatus.lp);
                        return;
                    }
                } else if (var1 == 2048) {
                    if (GlobalStatus.lp <= 1 && GlobalStatus.lq == 1) {
                        ++GlobalStatus.lp;
                        this.a(this.de, GlobalStatus.ad, (short) 3, (short) GlobalStatus.lp);
                        return;
                    }

                    if (GlobalStatus.lp > 1 && GlobalStatus.lq == 1) {
                        ++GlobalStatus.lp;
                        this.a(this.de, GlobalStatus.ad, (short) 3, (short) GlobalStatus.lp);
                    }
                }
            }
        } else {
            if (this.e.aq != null) {
                this.e.aq.b(var1);
            }

            if (var1 == 1 || var1 == 514 || var1 == 520 || var1 == 4) {
                this.e.at.a(aK(this.e.ar.g()), GlobalConfig.i, (byte) 1);
                this.e.at.a((byte) 1);
                return;
            }

            if (var1 == 268435456 || var1 == 1073741824) {
                this.a(GlobalStatus.ad, this.l, (short) 1);
                return;
            }

            if (var1 == 536870912) {
                if (this.l == 0) {
                    GlobalStatus.lp = 1;
                    this.av();
                    this.c((int) 6);
                } else if (this.l == 4) {
                    this.j = this.k = 0;
                    this.e.touchPageCase = this.e.k = 7;
                }

                GlobalStatus.P();
                return;
            }

            if (var1 == 1024) {
                if (GlobalStatus.lp > 1 && GlobalStatus.lq == 1) {
                    if (GlobalStatus.lp - 1 <= 1) {
                        GlobalStatus.lp = 1;
                    } else {
                        --GlobalStatus.lp;
                    }

                    this.a(GlobalStatus.ad, GlobalStatus.ad, this.l, GlobalStatus.lp);
                    return;
                }

                if (GlobalStatus.lp > 1 && GlobalStatus.lq == 0) {
                    if (GlobalStatus.lp - 1 < 1) {
                        GlobalStatus.lp = 1;
                    } else {
                        --GlobalStatus.lp;
                    }

                    this.a(GlobalStatus.ad, GlobalStatus.ad, this.l, GlobalStatus.lp);
                    return;
                }
            } else if (var1 == 2048) {
                if (GlobalStatus.lp <= 1 && GlobalStatus.lq == 1) {
                    ++GlobalStatus.lp;
                    this.a(GlobalStatus.ad, GlobalStatus.ad, this.l, GlobalStatus.lp);
                    return;
                }

                if (GlobalStatus.lp > 1 && GlobalStatus.lq == 1) {
                    ++GlobalStatus.lp;
                    this.a(GlobalStatus.ad, GlobalStatus.ad, this.l, GlobalStatus.lp);
                    return;
                }
            }
        }

    }

    private void a(String var1, String var2, short var3, short var4) {
        byte[] var5 = NetPayloadBuilder.a((short) 5121, var1, var2, (byte) 1, var4, var3);
        GlobalStatus.lo = var1;
        if (var5 != null) {
            MainCanvas.netUtils.sendPacket(new NetPacket((short) 5121, var5));
            this.e.a((String) null);
        } else {
            this.e.processException("获取上传指令数据错误!");
        }
    }

    private void a(String var1, short var2, short var3) {
        byte[] var4;
        if ((var4 = NetPayloadBuilder.a((short) 5122, var1, GlobalStatus.la[this.e.ar.g()], var3, var2)) != null) {
            MainCanvas.netUtils.sendPacket(new NetPacket((short) 5122, var4));
            this.e.a((String) null);
        } else {
            this.e.processException("获取上传指令数据错误!");
        }
    }

    private void x(byte var1) {
        byte[] var2;
        if ((var2 = NetPayloadBuilder.b((short) 4881, var1, GlobalStatus.ad)) != null) {
            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4881, var2));
            this.e.a((String) null);
        } else {
            this.e.processException("获取上传指令数据错误!");
        }
    }

    public final void ac() {
        this.e.aq.j();
        this.e.aq.a("称号列表");
        this.e.aq.a(true);
        this.e.as.a(new String[]{"活动", "成就", "职业", "特殊"});
        this.e.ar.a((Image[]) null, GlobalStatus.ml, (String[]) null, GlobalStatus.mn);
        this.e.ar.a(GlobalStatus.mp);
        this.e.at.a(aN(0), GlobalConfig.i, (byte) 1);
        this.e.at.a((byte) 1);
        this.e.aq.a((al) this.e.as);
        this.e.aq.a((al) this.e.ar);
        this.e.aq.a((al) this.e.at);
        this.e.as.a = GlobalStatus.mj;
        this.e.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
        this.l = 0;
        this.e.touchPageCase = this.e.k;
        this.j = this.k = 103;
    }

    private static String aN(int var0) {
        String var1 = null;
        if (GlobalStatus.mo != null && GlobalStatus.mo.length > var0) {
            var1 = GlobalStatus.mo[var0];
        }

        return var1;
    }

    private void aO(int var1) {
        if (this.l == 0) {
            if (this.e.aq != null) {
                this.e.aq.b(var1);
            }

            if (var1 == 1 || var1 == 514 || var1 == 520 || var1 == 4) {
                this.e.at.a(aN(this.e.ar.g()), GlobalConfig.i, (byte) 1);
                this.e.at.a((byte) 1);
                return;
            }

            if (var1 == 8 || var1 == 2 || var1 == 518 || var1 == 516) {
                this.x(this.e.as.a);
                return;
            }

            if (var1 != 268435456 && var1 != 517 && var1 != 1073741824) {
                if (var1 == 536870912) {
                    this.av();
                    this.c((int) 5);
                    return;
                }
            } else if (GlobalStatus.ml != null && GlobalStatus.mk != null) {
                if (GlobalStatus.mm[this.e.ar.g()] == 1) {
                    this.am = new String[]{"取消激活"};
                    this.l = 1;
                } else {
                    this.am = new String[]{"激活"};
                    this.l = 2;
                }

                LoadingPage.a(GlobalConfig.f, 3 * GlobalConfig.j + 11 + this.e.ar.i() * GlobalConfig.j + GlobalConfig.g, this.am, true);
                return;
            }
        } else if (this.l == 1) {
            LoadingPage.b(var1);
            if (var1 != 268435456 && var1 != 517 && var1 != 1073741824) {
                if (var1 == 536870912) {
                    this.l = 0;
                    return;
                }
            } else if (LoadingPage.o == 0) {
                this.a(this.e.as.a, GlobalStatus.mk[this.e.ar.g()], (byte) 2);
                return;
            }
        } else if (this.l == 2) {
            LoadingPage.b(var1);
            if (var1 == 268435456 || var1 == 517 || var1 == 1073741824) {
                this.a(this.e.as.a, GlobalStatus.mk[this.e.ar.g()], (byte) 1);
                return;
            }

            if (var1 == 536870912) {
                this.l = 0;
            }
        }

    }

    private void a(byte var1, String var2, byte var3) {
        byte[] var4;
        if ((var4 = NetPayloadBuilder.a((short) 4882, var1, var2, var3, GlobalStatus.ad)) != null) {
            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4882, var4));
            this.e.a((String) null);
        } else {
            this.e.processException("获取上传指令数据错误!");
        }
    }

    private void J(Graphics var1) {
        this.e.aq.a(var1);
        if (this.l == 1 || this.l == 2) {
            LoadingPage.c(var1);
        }

    }

    public final boolean ad() {
        return this.k == 71 || this.k == 72;
    }

    private void aP(int var1) {
        if (var1 != 1 && var1 != 514) {
            if (var1 != 4 && var1 != 520) {
                if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
                    if (LoadingPage.g == 0) {
                        this.e.b("游客注册 第1步: ", "修改角色昵称");
                    }

                    K = null;
                    this.j = this.k = 0;
                    return;
                }

                if (var1 == 536870912) {
                    K = null;
                    this.j = this.k = 0;
                }
            } else if (this.dg != null) {
                LoadingPage.g = LoadingPage.g + 1 < this.dg.length ? LoadingPage.g + 1 : 0;
                return;
            }
        } else if (this.dg != null) {
            LoadingPage.g = LoadingPage.g - 1 >= 0 ? LoadingPage.g - 1 : this.dg.length - 1;
            return;
        }

    }

    private void K(Graphics var1) {
        LoadingPage.a(var1, 0, GlobalConfig.defaultHigh - LoadingPage.f, GlobalConfig.defaultWidth, LoadingPage.f, K, this.dg, (String[]) null);
    }

    public final void ae() {
        this.e.aq.b();
        this.e.aq.a(GlobalStatus.mr);
        this.e.aq.a(true);
        this.e.ar.a((Image[]) null, GlobalStatus.mu, (String[]) null, (String[]) null);
        this.e.at.a(GlobalStatus.mv == null ? null : GlobalStatus.mv[0], GlobalConfig.i, (byte) 1);
        this.e.at.a((byte) 1);
        this.e.au.a("确认");
        this.e.aq.a((al) this.e.ar);
        this.e.aq.a((al) this.e.at);
        if (GlobalConfig.defaultHigh > 220) {
            this.e.aq.a((al) this.e.au);
        }

        this.e.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
        this.l = 0;
        this.e.touchPageCase = this.e.k;
        this.j = this.k = 107;
    }

    private void aQ(int var1) {
        if (this.l == 0) {
            if (this.e.aq != null) {
                this.e.aq.b(var1);
            }

            if (var1 != 268435456 && var1 != 517 && var1 != 1073741824) {
                if (var1 == 1 || var1 == 514 || var1 == 520 || var1 == 4) {
                    this.e.at.a(GlobalStatus.mv == null ? null : GlobalStatus.mv[this.e.ar.g()], GlobalConfig.i, (byte) 1);
                    this.e.at.a((byte) 1);
                    return;
                }

                if (var1 == 536870912) {
                    if (GlobalStatus.mq == 1) {
                        GlobalStatus.S();
                        GlobalStatus.R();
                        this.l = 0;
                        this.j = this.k = 0;
                        return;
                    }

                    if (GlobalStatus.mq == 2) {
                        this.a((byte) (GlobalStatus.mq - 2), GlobalStatus.ms, (byte) -1, (byte) -1);
                        return;
                    }

                    if (GlobalStatus.mq == 3) {
                        this.a((byte) (GlobalStatus.mq - 2), GlobalStatus.ms, GlobalStatus.mt, (byte) -1);
                    }
                }
            } else {
                if (GlobalStatus.mq == 1) {
                    this.a(GlobalStatus.mq, (byte) this.e.ar.g(), (byte) -1, (byte) -1);
                    return;
                }

                if (GlobalStatus.mq == 2) {
                    this.a(GlobalStatus.mq, GlobalStatus.ms, (byte) this.e.ar.g(), (byte) -1);
                    return;
                }

                if (GlobalStatus.mq == 3) {
                    this.a(GlobalStatus.mq, GlobalStatus.ms, GlobalStatus.mt, (byte) this.e.ar.g());
                    return;
                }
            }
        }

    }

    private void L(Graphics var1) {
        if (this.l == 0 && this.e.aq != null) {
            this.e.aq.a(var1);
        }

    }

    public final void af() {
        this.a("开通超Q", GlobalStatus.aD, (short) 108);
    }

    public final void ag() {
        this.a("开通魔钻", GlobalStatus.aJ, (short) 109);
    }

    private void a(String var1, String var2, short var3) {
        this.e.aq.j();
        this.e.aq.a(var1);
        this.e.aq.a(false);
        this.e.at.a(var2, GlobalConfig.i, (byte) 2);
        this.e.au.a(new String[]{"开 通", "取 消"});
        this.e.aq.a((al) this.e.at);
        this.e.aq.a((al) this.e.au);
        this.e.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
        this.l = 0;
        this.e.touchPageCase = this.e.k;
        this.j = this.k = var3;
    }

    private void aR(int var1) {
        if (this.l == 0) {
            this.e.aq.b(var1);
            if (var1 != 268435456 && var1 != 1073741824) {
                if (var1 == 536870912) {
                    this.N();
                    return;
                }
            } else {
                LoadingPage.h = 0;
                this.l = 2;
                if (this.k == 108) {
                    this.l = 1;
                    this.e.aq.j();
                    this.e.aq.a("开通超Q");
                    this.e.aq.a(false);
                    this.e.ar.a(new String[]{"中国移动", "中国联通"}, (String[]) null, (String[]) null);
                    this.e.at.b(GlobalConfig.ah[0], GlobalConfig.i, (byte) 2);
                    this.e.au.a(new String[]{"开通", "取消"});
                    this.e.aq.a((al) this.e.ar);
                    this.e.aq.a((al) this.e.at);
                    this.e.aq.a((al) this.e.au);
                    this.e.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
                    return;
                }
            }
        } else if (this.l == 1) {
            this.e.aq.b(var1);
            if (var1 == 268435456 || var1 == 1073741824) {
                LoadingPage.h = 0;
                this.l = (short) (this.e.ar.g() == 0 ? 2 : 3);
                return;
            }

            if (var1 == 1 || var1 == 4) {
                this.e.at.b(GlobalConfig.ah[this.e.ar.g()], GlobalConfig.i, (byte) 2);
                return;
            }

            if (var1 == 536870912) {
                this.N();
                return;
            }
        } else if (this.l == 2) {
            if (var1 == 268435456 || var1 == 1073741824) {
                String var3 = this.k == 108 ? GlobalStatus.aE : GlobalStatus.aK;
                String var2 = this.k == 108 ? GlobalStatus.aF : GlobalStatus.aL;
                this.e.c(var3, var2);
                this.N();
                return;
            }

            if (var1 == 536870912) {
                this.l = (short) (this.k == 108 ? 1 : 0);
                return;
            }
        } else if (this.l == 3) {
            if (var1 == 268435456 || var1 == 1073741824) {
                this.e.c(GlobalStatus.aG);
                return;
            }

            if (var1 == 536870912) {
                this.l = 1;
            }
        }

    }

    private void M(Graphics var1) {
        if (this.e.aq != null) {
            this.e.aq.a(var1);
        }

        if (this.l == 2) {
            String var2 = this.k == 108 ? "确认以发送短信方式开通超Q？ " : "确认以发送短信方式开通魔钻？";
            LoadingPage.a(var1, var2, new String[]{"确 认", "取 消"});
        }

        if (this.l == 3) {
            LoadingPage.a(var1, "进入超Q官网开通超Q？", new String[]{"进入", "返回"});
        }

    }

    public final void ah() {
        MainCanvas.ah.d("3762");
        bp = MainCanvas.ah.getFrame1("3762");
        this.e.aq.j();
        this.e.aq.a("超Q精灵");
        this.e.aq.a(true);
        this.bQ = Math.max(GlobalConfig.j * 3 + 10, bp.j() + 10);
        this.e.aq.a(this.bQ);
        this.e.at.b(GlobalStatus.kW, GlobalConfig.i, (byte) 1);
        this.e.au.a(new String[]{"领取", "返回"});
        this.e.aq.a((al) this.e.at);
        this.e.aq.a((al) this.e.au);
        this.e.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
        this.l = 0;
        this.e.touchPageCase = this.e.k;
        this.j = this.k = 33;
    }

    private void aS(int var1) {
        this.e.aq.b(var1);
        if (var1 != 268435456 && var1 != 1073741824) {
            if (var1 == 536870912) {
                if (this.l == 0) {
                    this.av();
                    this.c((int) 8);
                    return;
                }

                --this.l;
            }
        } else {
            switch (this.l) {
                case 0:
                    this.l = 1;
                    LoadingPage.a(this.e.aq.a + this.e.aq.c / 2, this.e.aq.b + 45 + this.bQ / 2, new String[]{"领取"}, false);
                    break;
                case 1:
                    byte[] var2;
                    if ((var2 = NetPayloadBuilder.x((short) 4658, GlobalStatus.ad)) != null) {
                        MainCanvas.netUtils.sendPacket(new NetPacket((short) 4658, var2));
                        this.e.a((String) null);
                        break;
                    } else {
                        this.e.processException("获取上传指令数据错误!");
                        return;
                    }
                default:
                    return;
            }
        }

    }

    public final int f(int var1, int var2) {
        return var1 >= this.e.aq.a + 68 && var1 <= this.e.aq.a + this.e.aq.c - 12 && var2 >= this.e.aq.b + 30 + this.bQ / 2 && var2 < this.e.aq.b + 30 + this.bQ / 2 + GlobalConfig.j ? 268435456 : 0;
    }

    private void aT(int var1) {
        if (this.e.av != null) {
            this.e.av.a(var1);
        }

        if (var1 == 536870912) {
            var1 = this.j;
            if (this.j == 76) {
                int var8 = this.e.ar.g();
                this.d((byte) 1);
                this.e.ar.a(var8);
            } else {
                this.N();
            }

            this.a((byte) 3, (short) var1, GlobalStatus.Q.a, (short) -1, GlobalStatus.Q.b);
            GlobalStatus.Q = null;
        } else if (GlobalStatus.Q.i == null) {
            GlobalStatus.Q = null;
        } else {
            byte var10000;
            label79:
            {
                int var2 = var1;
                cd var5 = GlobalStatus.Q;
                boolean var3 = false;
                if (var5.j != null) {
                    for (int var4 = 0; var4 < var5.j.length; ++var4) {
                        if (var5.j[var4] == var2) {
                            var10000 = 0;
                            break label79;
                        }
                    }
                }

                if (var5.k != null) {
                    for (int var9 = 0; var9 < var5.k.length; ++var9) {
                        if (var5.k[var9] == var2) {
                            var10000 = 1;
                            break label79;
                        }
                    }
                }

                if (var5.l != null) {
                    for (int var10 = 0; var10 < var5.l.length; ++var10) {
                        if (var5.l[var10] == var2) {
                            var10000 = 2;
                            break label79;
                        }
                    }
                }

                var10000 = -1;
            }

            var1 = var10000;
            if (var10000 != -1 && GlobalStatus.Q.i[var1] != null) {
                this.a((byte) 3, this.j, GlobalStatus.Q.a, (short) var1, GlobalStatus.Q.b);
                this.e.a((String) null);
                GlobalStatus.Q = null;
            }

        }
    }

    private void aU(int var1) {
        if (this.P != null) {
            this.P.a(var1);
        }

        if (this.l == 0 && this.k == 0) {
            this.P = null;
        }

    }

    private void aV(int var1) {
        if (this.Q != null) {
            this.Q.a(var1);
        }

        if (this.l == 0 && this.k == 0) {
            this.Q = null;
        }

    }

    private static void N(Graphics var0) {
        if (GlobalStatus.Q != null) {
            GlobalStatus.Q.m.a(var0);
        }

    }

    private void O(Graphics var1) {
        if (this.P != null) {
            this.P.a(var1);
        }

    }

    private void g(String var1) {
        byte[] var2;
        if ((var2 = NetPayloadBuilder.s((short) 4675, GlobalStatus.ad, var1)) == null) {
            this.e.processException("获取上传指令数据错误!");
        } else {
            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4675, var2));
            this.e.a((String) null);
        }
    }

    public final void a(String var1, String var2) {
        byte[] var3;
        if ((var3 = NetPayloadBuilder.c((short) 4674, GlobalStatus.ad, var2, var1)) == null) {
            this.e.processException("获取上传指令数据错误!");
        } else {
            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4674, var3));
            this.e.a((String) null);
        }
    }

    public final void ai() {
        LoadingPage.g = 0;
        LoadingPage.h = 0;
        this.e.touchAction = 0;
        this.e.b = 0;
        this.l = 0;
        this.e.touchPageCase = this.e.k;
        this.k = 116;
    }

    private void aW(int var1) {
        if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
            if (var1 == 536870912) {
                this.k = this.j;
                this.l = 0;
                this.m = 0;
                LoadingPage.h = 0;
            }

        } else {
            byte[] var2;
            if ((var2 = NetPayloadBuilder.D((short) 4369, GlobalStatus.ad)) != null) {
                MainCanvas.netUtils.sendPacket(new NetPacket((short) 4369, var2));
            }

            this.k = this.j;
            this.l = 0;
            this.m = 0;
            LoadingPage.h = 0;
        }
    }

    private static void P(Graphics var0) {
        LoadingPage.a(var0, GlobalStatus.eD, new String[]{"确定", "取消"});
    }

    public final void aj() {
        K = new TextRender(GlobalStatus.eK, (short) (GlobalConfig.defaultWidth - 20));
        LoadingPage.a((az_1) null, K, GlobalStatus.eL, (String[]) null, true);
        LoadingPage.h = 0;
        LoadingPage.g = 0;
        this.e.touchAction = 0;
        this.e.b = 0;
        this.l = 0;
        this.e.touchPageCase = this.e.k;
        this.k = 117;
    }

    private void aX(int var1) {
        if (GlobalStatus.eL.length > 0 && var1 == 536870912 || GlobalStatus.eL.length <= 0 && (var1 == 536870912 || var1 == 268435456 || var1 == 517 || var1 == 1073741824)) {
            this.k = this.j;
            this.l = 0;
            this.m = 0;
            LoadingPage.g = 0;
            LoadingPage.h = 0;
        }

        if (var1 != 8 && var1 != 516) {
            if (var1 == 2 || var1 == 518) {
                LoadingPage.e = LoadingPage.e + LoadingPage.d < K.a() ? LoadingPage.e + LoadingPage.d : LoadingPage.e;
            }
        } else {
            LoadingPage.e = LoadingPage.e - LoadingPage.d >= 0 ? LoadingPage.e - LoadingPage.d : 0;
        }

        if (GlobalStatus.eL.length > 0) {
            if (var1 != 1 && var1 != 514) {
                if (var1 != 4 && var1 != 520) {
                    if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
                        byte[] var2;
                        if ((var2 = NetPayloadBuilder.c((short) 4370, (byte) LoadingPage.g, GlobalStatus.ad)) != null) {
                            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4370, var2));
                            this.e.a((String) null);
                        } else {
                            this.e.processException("获取上传指令数据错误!");
                        }

                        LoadingPage.g = 0;
                    }
                } else if (GlobalStatus.eL != null) {
                    LoadingPage.g = LoadingPage.g + 1 < GlobalStatus.eL.length ? LoadingPage.g + 1 : 0;
                    return;
                }
            } else if (GlobalStatus.eL != null) {
                LoadingPage.g = LoadingPage.g - 1 >= 0 ? LoadingPage.g - 1 : GlobalStatus.eL.length - 1;
                return;
            }

        }
    }

    private static void Q(Graphics var0) {
        LoadingPage.a(var0, 0, GlobalConfig.defaultHigh - LoadingPage.f, GlobalConfig.defaultWidth, LoadingPage.f, K, GlobalStatus.eL, (String[]) null);
    }

    private void R(Graphics var1) {
        if (this.Q != null) {
            this.Q.a(var1);
        }

    }

    public final void ak() {
        this.dh = null;
        if (this.be == 0) {
            if (this.bf == 0 && GlobalStatus.mx != -1) {
                this.dh = new bh(GlobalStatus.mC, (short) 160);
                return;
            }

            if (this.bf == 1 && GlobalStatus.mD != -1) {
                this.dh = new bh(GlobalStatus.mI, (short) 160);
                return;
            }
        } else if (this.be == 1 && GlobalStatus.mJ[this.bf] != -1) {
            this.dh = new bh(GlobalStatus.mL[this.bf], (short) 160);
        }

    }

    public final void e(boolean var1) {
        if (var1) {
            GlobalStatus.T();
            GlobalStatus.V();
            GlobalStatus.N();
            this.bf = 0;
            this.be = 0;
            this.bc = new ba(this.e, this, MainCanvas.f);
        }

        this.bc.a();
        String var2 = "";
        if (GlobalStatus.fA != null) {
            for (int var3 = 0; var3 < GlobalStatus.fA.length; ++var3) {
                if (GlobalStatus.mx == GlobalStatus.fA[var3]) {
                    var2 = GlobalStatus.f(this.e.l, var3);
                    break;
                }
            }
        }

        if (GlobalStatus.mN != null && !GlobalStatus.mN.equals("")) {
            this.e.at.a(GlobalStatus.mN + "\t" + var2, GlobalConfig.i, (byte) 2);
        } else {
            this.e.at.a("" + var2, GlobalConfig.i, (byte) 2);
        }

        if (GlobalStatus.mx != -1 && GlobalStatus.my != -1) {
            a(GlobalStatus.my, GlobalStatus.mz, GlobalStatus.mA, GlobalStatus.mB);
            this.aI = MainCanvas.ah.a(String.valueOf(GlobalStatus.my + "_0"), GlobalStatus.mz, GlobalStatus.mA, GlobalStatus.mB);
        } else if (this.aI != null) {
            this.aI.a();
            this.aI = null;
        }

        if (GlobalStatus.mD != -1 && GlobalStatus.mE != -1) {
            a(GlobalStatus.mE, GlobalStatus.mF, GlobalStatus.mG, GlobalStatus.mH);
            this.bd = MainCanvas.ah.a(String.valueOf(GlobalStatus.mE + "_0"), GlobalStatus.mF, GlobalStatus.mG, GlobalStatus.mH);
        } else if (this.bd != null) {
            this.bd.a();
            this.bd = null;
        }

        this.bj.removeAllElements();
        if (GlobalStatus.mK != null) {
            for (int var4 = 0; var4 < 3; ++var4) {
                if (GlobalStatus.mK[var4] != -1) {
                    this.bj.addElement(String.valueOf(GlobalStatus.mK[var4]));
                }
            }
        }

        if (this.bj.size() > 0) {
            MainCanvas.af.batchLoadFrame0(this.bj, (short[]) null, (short[]) null, (short[]) null);
        }

        this.ak();
        LoadingPage.l = 0;
        this.l = 0;
        this.e.touchPageCase = this.e.k = 7;
        this.j = this.k = 119;
    }

    private void aY(int var1) {
        if (this.l == 0) {
            if (GlobalStatus.mx != -1 && this.aI != null) {
                PngUtil.a(this.aI, this.e.ak);
            }

            if (GlobalStatus.mD != -1 && this.bd != null) {
                PngUtil.a(this.bd, this.e.ak);
            }

            this.e.at.b(var1);
            if (var1 == 2) {
                if (this.be == 0 && this.bf == 0) {
                    this.be = 1;
                    LoadingPage.l = 0;
                    this.ak();
                } else if (this.be == 1) {
                    this.be = 0;
                    this.bf = 1;
                    LoadingPage.l = 0;
                    this.ak();
                }
            } else if (var1 == 8) {
                if (this.be == 0 && this.bf == 1) {
                    this.be = 1;
                    this.bf = 0;
                    LoadingPage.l = 0;
                    this.ak();
                } else if (this.be == 1) {
                    this.be = 0;
                    this.bf = 0;
                    LoadingPage.l = 0;
                    this.ak();
                }
            } else if (var1 == 268435456 || var1 == 1073741824) {
                if (this.be == 0) {
                    if (this.bf == 0) {
                        if (GlobalStatus.mx == -1) {
                            if (GlobalStatus.fw != null && GlobalStatus.fw.length > 0) {
                                this.j((int) 10);
                            } else {
                                this.e.processException("您没有宠物可选择");
                            }
                        } else {
                            LoadingPage.a(GlobalConfig.defaultWidth / 2, GlobalConfig.defaultHigh / 2, new String[]{"升星", "取出"}, true);
                            this.l = 1;
                        }
                    } else if (this.bf == 1) {
                        if (GlobalStatus.mD == -1) {
                            if (GlobalStatus.mx != -1) {
                                if (GlobalStatus.fw != null && GlobalStatus.fw.length > 0) {
                                    this.j((int) 10);
                                } else {
                                    this.e.processException("您没有宠物可选择");
                                }
                            } else {
                                this.e.processException("请先放入要升星的宠物");
                            }
                        } else {
                            LoadingPage.a(GlobalConfig.defaultWidth / 2, GlobalConfig.defaultHigh / 2, new String[]{"取出"}, true);
                            this.l = 1;
                        }
                    }
                } else if (this.be == 1) {
                    if (GlobalStatus.mJ[this.bf] != -1) {
                        LoadingPage.a(GlobalConfig.defaultWidth / 2, GlobalConfig.defaultHigh / 2, new String[]{"取出"}, true);
                        this.l = 1;
                    } else if (GlobalStatus.mx != -1) {
                        this.e((int) 20);
                    } else {
                        this.e.processException("请先放入要升星的宠物");
                    }
                }
            }

            if (var1 == 536870912) {
                this.dh = null;
                if (this.aI != null) {
                    this.aI = null;
                }

                if (this.bd != null) {
                    this.bd = null;
                }

                GlobalStatus.U();
                this.l();
                this.c((int) 4);
            }
        } else if (this.l == 1) {
            LoadingPage.b(var1);
            if (var1 == 536870912) {
                this.l = 0;
            } else if (var1 == 268435456 || var1 == 1073741824) {
                if (LoadingPage.o == 0) {
                    if (this.be == 0 && this.bf == 1) {
                        this.c((int) 0, (byte) 1);
                    } else if (this.be == 0 && this.bf == 0) {
                        byte[] var2;
                        if ((var2 = NetPayloadBuilder.a((byte) 6, GlobalStatus.mx, GlobalStatus.mD, GlobalStatus.mJ, -1, (byte) this.bf)) != null) {
                            NetPacket var3 = new NetPacket((short) 4681, var2);
                            MainCanvas.netUtils.sendPacket(var3);
                            this.e.a((String) null);
                        } else {
                            this.e.processException("获取上传指令数据错误!");
                        }
                    } else if (this.be == 1) {
                        this.b((int) 0, (byte) 1);
                    }
                } else if (LoadingPage.o == 1) {
                    this.c((int) 0, (byte) 1);
                }
            }
        }

        this.e.touchAction = 0;
    }

    private void S(Graphics var1) {
        this.bc.a(var1);
    }

    private void b(int var1, byte var2) {
        Object var3 = null;
        byte[] var5;
        if (var2 == 0) {
            var5 = NetPayloadBuilder.a((byte) 2, GlobalStatus.mx, GlobalStatus.mD, GlobalStatus.mJ, var1, (byte) this.bf);
        } else {
            var5 = NetPayloadBuilder.a((byte) 5, GlobalStatus.mx, GlobalStatus.mD, GlobalStatus.mJ, var1, (byte) this.bf);
        }

        if (var5 != null) {
            NetPacket var4 = new NetPacket((short) 4681, var5);
            MainCanvas.netUtils.sendPacket(var4);
            this.e.a((String) null);
        } else {
            this.e.processException("获取上传指令数据错误!");
        }
    }

    private void c(int var1, byte var2) {
        Object var3 = null;
        byte[] var5;
        if (this.bf == 0) {
            if (var2 == 0) {
                var5 = NetPayloadBuilder.a((byte) 0, var1, GlobalStatus.mD, GlobalStatus.mJ, -1, (byte) this.bf);
            } else {
                var5 = NetPayloadBuilder.a((byte) 3, var1, GlobalStatus.mD, GlobalStatus.mJ, -1, (byte) this.bf);
            }
        } else if (var2 == 0) {
            var5 = NetPayloadBuilder.a((byte) 1, GlobalStatus.mx, var1, GlobalStatus.mJ, -1, (byte) this.bf);
        } else {
            var5 = NetPayloadBuilder.a((byte) 4, GlobalStatus.mx, var1, GlobalStatus.mJ, -1, (byte) this.bf);
        }

        if (var5 != null) {
            NetPacket var4 = new NetPacket((short) 4681, var5);
            MainCanvas.netUtils.sendPacket(var4);
            this.e.a((String) null);
        } else {
            this.e.processException("获取上传指令数据错误!");
        }
    }

    public final void s(int var1) {
        this.bh = true;
        this.bg = var1;
        GlobalConfig.printStr("pet index=" + var1);
        this.l = 0;
        this.e.aq.b();
        this.e.aq.a("宠物附魂");
        String[] var2;
        (var2 = new String[10])[0] = "技能附魂";
        var2[5] = "状态附魂";

        for (int var3 = 0; var3 < 4; ++var3) {
            if (GlobalStatus.gh[var1] != null && GlobalStatus.gh[var1][var3] != null) {
                var2[var3 + 1] = GlobalStatus.gh[var1][var3];
            } else {
                var2[var3 + 1] = "宠魂栏";
            }

            if (GlobalStatus.gl[var1] != null && GlobalStatus.gl[var1][var3] != null) {
                var2[var3 + 6] = GlobalStatus.gl[var1][var3];
            } else {
                var2[var3 + 6] = "宠魂栏";
            }
        }

        this.e.ar.a((Image[]) null, var2, (String[]) null, (String[]) null);
        this.e.aq.a((al) this.e.ar);
        this.e.at.a("", GlobalConfig.i, (byte) 2);
        this.e.at.a((byte) 1);
        this.e.aq.a((al) this.e.at);
        this.e.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
        this.e.touchPageCase = this.e.k;
        this.j = this.k = 120;
    }

    public final void t(int var1) {
        GlobalConfig.printStr("pet index=" + this.bg);
        this.l = 0;
        String[] var2;
        (var2 = new String[10])[0] = "技能附魂";
        var2[5] = "状态附魂";

        for (int var3 = 0; var3 < 4; ++var3) {
            if (GlobalStatus.gh[this.bg] != null && GlobalStatus.gh[this.bg][var3] != null) {
                var2[var3 + 1] = GlobalStatus.gh[this.bg][var3];
            } else {
                var2[var3 + 1] = "宠魂栏";
            }

            if (GlobalStatus.gl[this.bg] != null && GlobalStatus.gl[this.bg][var3] != null) {
                var2[var3 + 6] = GlobalStatus.gl[this.bg][var3];
            } else {
                var2[var3 + 6] = "宠魂栏";
            }
        }

        this.e.ar.a((Image[]) null, var2, (String[]) null, (String[]) null);
        this.e.ar.a(var1);
        if (this.e.ar.g() != 0 && this.e.ar.g() != 5) {
            if (this.e.ar.g() < 5) {
                if (GlobalStatus.gh[this.bg] != null && GlobalStatus.gh[this.bg][this.e.ar.g() - 1] != null) {
                    this.e.at.a(GlobalStatus.gi[this.bg][this.e.ar.g() - 1], GlobalConfig.i, (byte) 2);
                    this.e.at.a((byte) 1);
                } else {
                    this.e.at.a("可以嵌入符文", GlobalConfig.i, (byte) 2);
                    this.e.at.a((byte) 1);
                }
            } else if (GlobalStatus.gl[this.bg] != null && GlobalStatus.gl[this.bg][this.e.ar.g() - 6] != null) {
                this.e.at.a(GlobalStatus.gm[this.bg][this.e.ar.g() - 6], GlobalConfig.i, (byte) 2);
                this.e.at.a((byte) 1);
            } else {
                this.e.at.a("可以嵌入符文", GlobalConfig.i, (byte) 2);
                this.e.at.a((byte) 1);
            }
        } else {
            this.e.at.a("", GlobalConfig.i, (byte) 2);
            this.e.at.a((byte) 1);
        }
    }

    private void aZ(int var1) {
        if (this.l == 0) {
            this.e.aq.b(var1);
            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    this.bh = false;
                    this.bg = 0;
                    this.j((int) 0);
                    return;
                }

                if (var1 == 1 || var1 == 4 || var1 == 514 || var1 == 520) {
                    if (this.e.ar.g() != 0 && this.e.ar.g() != 5) {
                        if (this.e.ar.g() < 5) {
                            if (GlobalStatus.gh[this.bg] != null && GlobalStatus.gh[this.bg][this.e.ar.g() - 1] != null) {
                                this.e.at.a(GlobalStatus.gi[this.bg][this.e.ar.g() - 1], GlobalConfig.i, (byte) 2);
                                this.e.at.a((byte) 1);
                                return;
                            }

                            this.e.at.a("可以嵌入符文", GlobalConfig.i, (byte) 2);
                            this.e.at.a((byte) 1);
                            return;
                        }

                        if (GlobalStatus.gl[this.bg] != null && GlobalStatus.gl[this.bg][this.e.ar.g() - 6] != null) {
                            this.e.at.a(GlobalStatus.gm[this.bg][this.e.ar.g() - 6], GlobalConfig.i, (byte) 2);
                            this.e.at.a((byte) 1);
                            return;
                        }

                        this.e.at.a("可以嵌入符文", GlobalConfig.i, (byte) 2);
                        this.e.at.a((byte) 1);
                        return;
                    }

                    this.e.at.a("", GlobalConfig.i, (byte) 2);
                    this.e.at.a((byte) 1);
                    return;
                }
            } else if (this.e.ar.g() != 0 && this.e.ar.g() != 5) {
                if (this.e.ar.g() < 5) {
                    if (GlobalStatus.gh[this.bg] != null && GlobalStatus.gh[this.bg][this.e.ar.g() - 1] != null) {
                        LoadingPage.a(GlobalConfig.defaultWidth >> 1, GlobalConfig.defaultHigh >> 1, new String[]{"挖出"}, true);
                        this.l = 1;
                        return;
                    }

                    LoadingPage.a(GlobalConfig.defaultWidth >> 1, GlobalConfig.defaultHigh >> 1, new String[]{"嵌入"}, true);
                    this.l = 1;
                    return;
                }

                if (GlobalStatus.gl[this.bg] != null && GlobalStatus.gl[this.bg][this.e.ar.g() - 6] != null) {
                    LoadingPage.a(GlobalConfig.defaultWidth >> 1, GlobalConfig.defaultHigh >> 1, new String[]{"挖出"}, true);
                    this.l = 1;
                    return;
                }

                LoadingPage.a(GlobalConfig.defaultWidth >> 1, GlobalConfig.defaultHigh >> 1, new String[]{"嵌入"}, true);
                this.l = 1;
                return;
            }
        } else if (this.l == 1) {
            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    this.l = 0;
                }
            } else if (LoadingPage.o == 0) {
                if (this.e.ar.g() < 5) {
                    if (GlobalStatus.gh[this.bg] != null && GlobalStatus.gh[this.bg][this.e.ar.g() - 1] != null) {
                        this.a((byte) 1, GlobalStatus.fA[this.bg], GlobalStatus.gg[this.bg][this.e.ar.g() - 1], (byte) 34, (byte) GlobalStatus.gj[this.bg][this.e.ar.g() - 1]);
                        return;
                    }

                    this.e((int) 21);
                    return;
                }

                if (GlobalStatus.gl[this.bg] != null && GlobalStatus.gl[this.bg][this.e.ar.g() - 6] != null) {
                    this.a((byte) 1, GlobalStatus.fA[this.bg], GlobalStatus.gk[this.bg][this.e.ar.g() - 6], (byte) 35, (byte) GlobalStatus.gn[this.bg][this.e.ar.g() - 6]);
                    return;
                }

                this.e((int) 22);
                return;
            }
        }

    }

    private void T(Graphics var1) {
        this.e.aq.a(var1);
        if (this.l == 1) {
            LoadingPage.c(var1);
        }

    }

    private void a(byte var1, int var2, int var3, byte var4, byte var5) {
        byte[] var6;
        if ((var6 = NetPayloadBuilder.a(var1, var2, var3, var4, var5)) != null) {
            NetPacket var7 = new NetPacket((short) 4684, var6);
            MainCanvas.netUtils.sendPacket(var7);
            this.e.a((String) null);
        } else {
            this.e.processException("获取上传指令数据错误!");
        }
    }

    public final void al() {
        this.di = new an_1();
        this.dj = new an_1();
        this.l = 0;
        this.e.aq.b();
        this.e.aq.a("坐骑");
        this.e.aq.a(true);

        for (byte var1 = 0; var1 < GlobalStatus.nu.length; ++var1) {
            if (GlobalStatus.nu[var1] == GlobalStatus.nm) {
                this.dl = var1;
                break;
            }
        }

        if (GlobalConfig.hasRideRes) {
            this.be();
            GlobalConfig.i.stringWidth(GlobalConfig.G[0]);
            if (GlobalStatus.nv != null) {
                this.dk = new Frame1[GlobalStatus.nv.length];

                for (int var4 = 0; var4 < this.dk.length; ++var4) {
                    Frame1[] var10000 = this.dk;
                    String var10002 = GlobalStatus.nv[var4];
                    boolean var2 = false;
                    var2 = false;
                    var2 = false;
                    String var7 = var10002;
                    Object var3 = null;
                    int var8 = Page.buildResourceId((String) MainCanvas.a(GlobalStatus.ax, GlobalStatus.aj, (byte) 0, GlobalStatus.ay, false, var7), (byte) 2);
                    MainCanvas.ab.b((String) MainCanvas.a(GlobalStatus.ax, GlobalStatus.aj, (byte) 0, GlobalStatus.ay, false, var7), (short) 0, (short) 0, (short) 0);
                    var10000[var4] = MainCanvas.ab.a((int) var8, (short) 0, (short) 0, (short) 0);
                }
            }
        } else {
            this.e.au.a(this.dr);
        }

        this.e.at.a(GlobalStatus.nt, GlobalConfig.i, (byte) 2);
        this.di.a(GlobalStatus.nr, GlobalConfig.i, (byte) 2);
        this.dj.b(GlobalStatus.ns, GlobalConfig.i, (byte) 2);
        this.e.aq.a((al) this.e.at);
        if (GlobalConfig.defaultHigh > 220) {
            this.e.aq.a((al) this.e.au);
        }

        this.e.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
        this.e.at.a(this.e.at.b, this.e.at.c, this.e.at.d, this.e.at.e / 3);
        this.di.a(this.e.at.b, this.e.at.c + this.e.at.e, this.e.at.d / 2, this.e.at.e << 1);
        this.dj.a(this.di.b + this.di.d, this.di.c, this.di.d, this.di.e);
        this.e.touchPageCase = this.e.k;
        this.j = this.k = 125;
    }

    private void be() {
        if (GlobalStatus.nu[this.dl] == GlobalStatus.nm) {
            if (!GlobalStatus.nn.equals("")) {
                this.e.au.a(this.do_2);
                return;
            }
        } else if (GlobalStatus.nw[this.dl] == 0) {
            this.e.au.a(this.dq);
            return;
        }

        this.e.au.a(this.dp);
    }

    private void ba(int var1) {
        this.e.aq.b(var1);
        this.di.b(var1);
        this.dj.b(var1);
        if (this.dk != null && this.dk.length > 0) {
            for (int var2 = 0; var2 < this.dk.length; ++var2) {
                PngUtil.a(this.dk[var2], this.e.ak);
            }
        }

        if (var1 != 1073741824 && var1 != 517 && var1 != -7) {
            if (var1 == 268435456) {
                if (this.dk != null && this.dk.length > 0) {
                    if (GlobalStatus.nu[this.dl] == GlobalStatus.nm) {
                        if (GlobalStatus.nn.equals("")) {
                            this.a((byte) 2, (byte) GlobalStatus.nu[this.dl], (short) 0);
                            return;
                        }

                        this.a((byte) 4, (byte) GlobalStatus.nu[this.dl], (short) 0);
                        return;
                    }

                    if (GlobalStatus.nw[this.dl] == 0) {
                        this.a((byte) 5, (byte) GlobalStatus.nu[this.dl], (short) 0);
                        return;
                    }

                    this.a((byte) 2, (byte) GlobalStatus.nu[this.dl], (short) 0);
                    return;
                }
            } else if (var1 == 8) {
                if (this.dk != null && this.dk.length > 0 && this.dl > 0) {
                    --this.dl;
                    this.be();
                    return;
                }
            } else if (var1 == 2) {
                if (this.dk != null && this.dk.length > 0 && this.dl < this.dk.length - 1) {
                    ++this.dl;
                    this.be();
                    return;
                }
            } else if (var1 == 536870912) {
                this.di.j();
                this.di = null;
                this.dj.j();
                this.dj = null;
                this.at();
                this.c((int) 6);
            }

        } else {
            this.a((byte) 1, (byte) this.dl, (short) 0);
        }
    }

    private void U(Graphics var1) {
        this.e.aq.a(var1);
        this.di.a(var1);
        this.dj.a(var1);
        if (this.dk != null && this.dk.length > 0) {
            var1.setColor(2176196);
            int var2 = this.e.aq.b + 45 + 15;
            int var3 = this.e.aq.a + this.e.aq.c * 3 / 4;
            int var4 = this.e.aq.b + 45 + this.dk[0].j();
            if (this.dl == 2) {
                var4 += 30;
            }

            MainCanvas.f.a(var1, (Frame1) this.dk[this.dl], (int[]) null, 0, 0, var3, var4, 20, 0);
            if (this.dm == 0) {
                this.dm = var3;
                this.dn = var2 + GlobalConfig.j + 10;
            }

            var1.drawImage(MainCanvas.X.pngImage, this.dm - 30, this.dn, 20);
            var1.drawImage(MainCanvas.Y.pngImage, this.dm + 20, this.dn, 20);
        }

    }

    public final int g(int var1, int var2) {
        int var3 = 0;
        if ((var3 = this.e.aq.b(var1, var2)) <= 0) {
            var3 = this.di.b(var1, var2);
        }

        if (var3 <= 0) {
            var3 = this.dj.b(var1, var2);
        }

        if (var3 <= 0) {
            if (GlobalConfig.defaultWidth > 300) {
                if (var1 > this.dm - 170 && var1 < this.dm - 20 && var2 > this.dn - 80 && var2 < this.dn + 80) {
                    var3 = 8;
                } else if (var1 > this.dm + 20 && var1 < this.dm + 170 && var2 > this.dn - 80 && var2 < this.dn + 80) {
                    var3 = 2;
                }
            } else if (var1 > this.dm - 120 && var1 < this.dm - 20 && var2 > this.dn - 50 && var2 < this.dn + 50) {
                var3 = 8;
            } else if (var1 > this.dm + 20 && var1 < this.dm + 120 && var2 > this.dn - 50 && var2 < this.dn + 50) {
                var3 = 2;
            }
        }

        return var3;
    }

    private void a(byte var1, byte var2, short var3) {
        byte[] var4;
        if ((var4 = NetPayloadBuilder.a(var1, var2, (short) 0)) != null) {
            NetPacket var5 = new NetPacket((short) 4685, var4);
            MainCanvas.netUtils.sendPacket(var5);
            this.e.a("");
        } else {
            this.e.processException("获取上传指令数据错误!");
        }
    }

    public final void am() {
        this.l = 0;
        this.aq = 0;
        this.dv = new TextRender(GlobalStatus.nh, (short) 120);
        this.e.aq.b();
        this.e.aq.a("见钱开箱");
        this.e.aq.a(true);
        this.e.au.a("开启");
        this.e.at.b(GlobalStatus.ni, GlobalConfig.i, (byte) 2);
        this.e.aq.a((al) this.e.at);
        if (GlobalConfig.defaultHigh > 220) {
            this.e.aq.a((al) this.e.au);
        }

        this.e.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
        this.ds = this.e.at.b;
        this.dt = this.e.at.c;
        this.e.at.a(this.e.at.b, this.e.at.c + (this.e.at.e >> 1), this.e.at.d, this.e.at.e >> 1);
        this.e.touchPageCase = this.e.k;
        this.j = this.k = 127;
        LoadingPage.l = 0;
    }

    private void bb(int var1) {
        this.e.aq.b(var1);
        if (var1 == 536870912) {
            if (this.du) {
                this.du = false;
            } else {
                GlobalStatus.W();
                this.dv = null;
                this.j = this.k = 2;
            }
        } else if (var1 != 8 && var1 != 516) {
            if (var1 != 2 && var1 != 518) {
                if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
                    byte[] var2;
                    if ((var2 = NetPayloadBuilder.a((byte) 1)) != null) {
                        NetPacket var3 = new NetPacket((short) 4683, var2);
                        MainCanvas.netUtils.sendPacket(var3);
                        this.e.a((String) null);
                        return;
                    }

                    this.e.processException("获取上传指令数据错误!");
                }

            } else {
                this.aq = this.aq >= 3 ? this.aq : this.aq + 1;
                this.du = true;
                LoadingPage.l = 0;
            }
        } else {
            this.aq = this.aq <= 0 ? this.aq : this.aq - 1;
            this.du = true;
            LoadingPage.l = 0;
        }
    }

    private void V(Graphics var1) {
        this.e.aq.a(var1);
        LoadingPage.a(var1, this.ds, this.dt, this.e.at.d, this.e.at.e >> 1, 1);
        var1.setColor(255);
        var1.drawString("可开出的珍贵物品", this.ds + 32, this.dt + 8, 0);

        for (int var2 = 0; var2 < 4; ++var2) {
            MainCanvas.f.a(var1, x, (int[]) null, (aj) null, 0, 0, this.ds + this.e.at.d / 2 - 76 + var2 * 40, this.dt + (this.e.at.e >> 1) - 24, 0, 0);
            if (var2 < GlobalStatus.ng.length) {
                if (!GlobalStatus.ne[var2].equals("MONEY")) {
                    short var3 = (short) Integer.parseInt(GlobalStatus.ng[var2]);
                    MainCanvas.af.e(GlobalStatus.ng[var2]);
                    MainCanvas.f.a(var1, b(var3), (int[]) null, (aj) null, 0, 0, this.ds + this.e.at.d / 2 - 76 + var2 * 40, this.dt + (this.e.at.e >> 1) - 24, 0, 0);
                }

                if (var2 == this.aq) {
                    LoadingPage.d(var1, this.ds + this.e.at.d / 2 - 76 + var2 * 40, this.dt + (this.e.at.e >> 1) - 24, 17, 17);
                }
            }
        }

        LoadingPage.a(var1, this.ds, this.dt + (this.e.at.e >> 1), this.e.at.d, this.e.at.e >> 1, 1);
        var1.setColor(2917024);
        var1.fillRect(this.ds + -70 + (this.e.at.d >> 1) - 20, this.dt + (this.e.at.e >> 1) + (this.e.at.e >> 2) - 20, 40, 40);
        var1.setColor(9360850);
        var1.drawRect(this.ds + -70 + (this.e.at.d >> 1) - 20, this.dt + (this.e.at.e >> 1) + (this.e.at.e >> 2) - 20, 39, 39);
        if (GlobalStatus.nl != null) {
            MainCanvas.af.e(GlobalStatus.nl);
            short var5 = (short) Integer.parseInt(GlobalStatus.nl);
            MainCanvas.f.a(var1, b(var5), (int[]) null, (aj) null, 0, 0, this.ds + -70 + (this.e.at.d >> 1) - 8, this.dt + (this.e.at.e >> 1) + (this.e.at.e >> 2) - 8, 0, 0);
        }

        this.dv.a(var1, this.ds + 40 + (this.e.at.d >> 1) - 40, this.dt + (this.e.at.e >> 1) + (this.e.at.e >> 2) - 20, 0);
        if (this.du) {
            for (int var6 = 0; var6 < 4; ++var6) {
                if (var6 == this.aq) {
                    String var4 = GlobalStatus.nf[var6];
                    if (GlobalStatus.ne[var6].equals("MONEY")) {
                        var4 = "金钱";
                    }

                    LoadingPage.a(var1, GlobalStatus.ne[var6], var4, this.ds + this.e.at.d / 2 - 76 + var6 * 40, this.dt + (this.e.at.e >> 1) - 24, 40);
                }
            }
        }

    }

    public final int h(int var1, int var2) {
        int var3 = 0;
        this.du = false;
        if ((var3 = this.e.aq.b(var1, var2)) <= 0) {
            for (int var4 = 0; var4 < 4; ++var4) {
                if (var1 > this.ds + this.e.at.d / 2 - 80 + var4 * 40 && var1 < this.ds + this.e.at.d / 2 - 80 + var4 * 40 + 17 && var2 > this.dt + (this.e.at.e >> 1) - 24 && var2 < this.dt + (this.e.at.e >> 1) - 24 + 17) {
                    this.aq = var4;
                    LoadingPage.l = 0;
                    this.du = true;
                    return 0;
                }
            }
        }

        return var3;
    }

    public final void an() {
        this.aU = this.e.ar.g();
        this.e.aq.b();
        this.e.aq.a("特效");
        this.e.ar.a(GlobalStatus.ny, (String[]) null, GlobalStatus.nz);
        this.e.at.b(GlobalStatus.nA[0], GlobalConfig.i, (byte) 2);
        this.e.aq.a((al) this.e.ar);
        this.e.aq.a((al) this.e.at);
        this.e.aq.a(0, 0, GlobalConfig.defaultWidth, GlobalConfig.defaultHigh);
        this.l = 0;
        this.e.touchPageCase = this.e.k;
        this.j = this.k = 128;
    }

    private void bc(int var1) {
        this.e.aq.b(var1);
        if (this.l == 0) {
            if (var1 == 536870912) {
                GlobalStatus.X();
                this.h((int) 0);
                return;
            }

            if (GlobalStatus.nx == null || GlobalStatus.nx.length <= 0) {
                return;
            }

            if (var1 == 1 || var1 == 4) {
                this.e.at.b(GlobalStatus.nA[this.e.ar.g()], GlobalConfig.i, (byte) 2);
                return;
            }

            if (var1 == 268435456 || var1 == 1073741824) {
                LoadingPage.a(GlobalConfig.realWidth / 3 - GlobalConfig.i.stringWidth("操作") / 2, 3 * GlobalConfig.j + 11 + this.e.ar.i() * GlobalConfig.j + GlobalConfig.g, new String[]{"激活"}, true);
                this.l = 1;
                return;
            }
        } else if (this.l == 1) {
            LoadingPage.b(var1);
            if (var1 == 268435456 || var1 == 1073741824) {
                this.a((byte) 6, GlobalStatus.nx[this.e.ar.g()], (int) GlobalStatus.dl[this.aU]);
                return;
            }

            if (var1 == 536870912) {
                this.l = 0;
            }
        }

    }

    private void W(Graphics var1) {
        this.e.aq.a(var1);
        if (this.l == 1) {
            LoadingPage.c(var1);
        }

    }
}

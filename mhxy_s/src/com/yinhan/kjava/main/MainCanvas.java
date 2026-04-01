package com.yinhan.kjava.main;

import com.cc.Frame0;
import com.cc.Frame1;
import com.cc.GlobalConfig;
import com.cc.GlobalStatus;
import com.cc.LoadingPage;
import com.cc.NetPacket;
import com.cc.NetPayloadBuilder;
import com.cc.NetUtils;
import com.cc.Page;
import com.cc.PngUtil;
import com.cc.TextRender;
import com.cc.ag_1;
import com.cc.aj;
import com.cc.al;
import com.cc.an_1;
import com.cc.ao_1;
import com.cc.aq;
import com.cc.az_1;
import com.cc.bb_1;
import com.cc.be_1;
import com.cc.bo_1;
import com.cc.bs;
import com.cc.c_1;
import com.cc.l_1;
import com.cc.m_1;
import com.cc.n_1;
import com.cc.v_1;
import com.cc.y_1;

import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.StringItem;
import javax.microedition.lcdui.TextField;
import javax.microedition.midlet.MIDlet;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreNotOpenException;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Vector;

//public final class a_MainCanvas extends Canvas implements Runnable, CommandListener {
public final class MainCanvas extends Canvas implements Runnable, CommandListener {
    public int touchAction;
    public int b;
    public short touch4Status = 0;
    public MainMidlet mainMidlet;
    public static ao_1 e;
    public static PngUtil f;
    private boolean aJ;
    public boolean g = false;
    public boolean h = false;
    public static NetUtils netUtils;
    public short touchPageCase;
    public short k;
    public StringBuffer l;
    public int m;
    public static Frame0 n;
    private String aK;
    public boolean o;
    public boolean p;
    public Display q;
    public static Frame0 r;
    public static Frame0 s;
    public static Frame0 t;
    public static Frame0 u;
    public static Frame0 v;
    public static Frame0 w;
    public static Frame0 x;
    public static Frame0 y;
    public static Frame0 z;
    public static Frame1 A;
    public static Frame1 B;
    public static Frame0 C;
    public static Frame0 D;
    public static Frame0 E;
    public static az_1 F;
    public static Frame0 G;
    public static Frame0 H;
    public static Frame0 I;
    public static Frame0 J;
    public static Frame0 K;
    public static Frame0 L;
    public static Frame0 M;
    public static Frame0 N;
    public static Frame0 O;
    public static Frame0 P;
    public static Frame0 Q;
    public static Frame0[] R;
    public static Frame0[] S;
    public static Frame0 T;
    public static Frame0 U;
    public static Frame0 V;
    public static Frame0 W;
    public static Frame0 X;
    public static Frame0 Y;
    public static Frame0 Z;
    private static Image[] aL = null;
    private static Image aM = null;
    public static Image aa = null;
    public static Page ab;
    public static Page ui;
    public static Page ad;
    public static Page ae;
    public static Page af;
    public static Page publicUI;
    public static Page ah;
    public static c_3 ai = null;
    public TouchController touchController;
    public long ak;
    public long al;
    private static Vector aN = new Vector();
    private static StringBuffer aO = new StringBuffer();
    private long aP;
    private long aQ;
    private boolean aR;
    private String aS;
    private TextRender aT;
    private boolean aU;
    private int aV;
    private int aW;
    private int aX;
    private int aY;
    private boolean aZ;
    private int ba;
    private ChoiceGroup bb;
    private ChoiceGroup bc;
    private ChoiceGroup bd;
    private Image be;
    private Image bf;
    private Image bg;
    private Image bh;
    private Image bi;
    private Image bj;
    private Image bk;
    private static Page bl = null;
    private static Frame1 bm;
    private static Frame1 bn;
    private String[] bo;
    private int[][] bp;
    private int[] bq;
    private int br;
    private int bs;
    private int bt;
    private int bu;
    private static boolean bv = false;
    public static String am = null;
    public static String an = null;
    public static byte ao = 0;
    public static boolean ap = true;
    private int bw;
    public m_1 aq;
    public c_1 ar;
    public n_1 as;
    public an_1 at;
    public l_1 au;
    public y_1 av;
    public int aw;
    private Frame1[] bx;
    private Frame1[] by;

    private byte selectActorClo;
    private byte selectActorRow;
    private int bB;
    private int[][] actorList;
    public int ax;
    public String ay;
    private Image bD;
    private byte bE;
    private byte bF;
    private int bG;
    private int bH;
    public boolean az;
    public int tempTouchStatus;
    private int bI;
    private long bJ;
    private static byte bK = 1;
    public static byte aB = 2;
    public TextField aC;
    private TextField bL;
    private TextField bM;
    private TextField bN;
    private TextField bO;
    private Command bP;
    private Command bQ;
    private Command bR;
    public Form aD;
    private StringItem bS;
    private StringItem bT;
    private StringItem bU;
    private StringItem bV;
    private String bW;
    private ChoiceGroup bX;
    private byte bY;
    public ChoiceGroup aE;
    private String bZ;
    public int aF;
    public int aG;
    private int ca;
    private int cb;
    private int cc;
    private int cd;
    private short ce;
    public static String aH;
    public static String aI;

    public MainCanvas(MainMidlet midlet, Display display) {
        this.aK = "mhxy.zyy" + GlobalConfig.r + "_" + GlobalConfig.s;
        this.o = false;
        this.p = false;
        this.al = 0L;
        this.aP = 0L;
        this.aS = null;
        this.aU = false;
        this.aZ = false;
        this.be = null;
        this.bf = null;
        this.bg = null;
        this.bh = null;
        this.bi = null;
        this.bo = null;
        this.bs = 0;
        this.bw = -1;
        this.aq = null;
        this.ar = null;
        this.as = null;
        this.at = null;
        this.au = null;
        this.av = null;
        this.aw = 0;
        this.bB = 0;
        this.actorList = null;
        this.ay = "";
        this.bD = null;
        this.bG = 0;
        this.bH = 0;
        this.tempTouchStatus = 0;
        this.bI = -1;
        this.bJ = 0L;
        this.bY = -1;
        GlobalConfig.init((MIDlet) midlet);
        ((Canvas) this).setFullScreenMode(true);
        this.q = display;
        this.mainMidlet = midlet;
        ai = new c_3(midlet, display);
        this.aJ = true;
        GlobalConfig.defaultWidth = (short) ((Displayable) this).getWidth();
        GlobalConfig.defaultHigh = (short) ((Displayable) this).getHeight();
        ao_1.a = GlobalConfig.realWidth = GlobalConfig.defaultWidth;
        ao_1.b = GlobalConfig.realHigh = GlobalConfig.defaultHigh;
        this.m = 10;
        if (GlobalConfig.defaultWidth >= 240) {
            this.m = 8;
            ao_1.a = GlobalConfig.realWidth = (short) (GlobalConfig.defaultWidth * 95 / 100);
            ao_1.b = GlobalConfig.realHigh = (short) (GlobalConfig.defaultHigh * (GlobalConfig.defaultHigh > 320 ? 80 : 95) / 100);
            GlobalConfig.f = ao_1.o = (short) ((GlobalConfig.defaultWidth - ao_1.a) / 2);
            GlobalConfig.g = ao_1.p = (short) ((GlobalConfig.defaultHigh - ao_1.b) / 2);
        }

        y_1.c().a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
        this.y();
        (new Thread(this)).start();
    }

    public final void a() {
        ab.c();
        ae.c();
        af.c();
        ah.c();
        this.l = new StringBuffer();
        this.aq = new m_1();
        this.ar = new c_1();
        this.au = new l_1();
        this.as = new n_1();
        this.at = new an_1();
    }

    public void init(String socket, String http) {
        if (netUtils == null) {
            netUtils = new NetUtils();
        } else {
            setUrl(socket, (byte) 2);
            netUtils.b();
        }

        netUtils.setMainCanvas(this);
    }

    private static void s() {
        if (netUtils != null) {
            netUtils.d();
            netUtils = null;
        }

    }

    public final void run() {
        while (this.aJ) {
            this.ak = System.currentTimeMillis();

            try {
                if (netUtils != null) {
                    netUtils.c();
                }

                if (this.aJ) {
                    switch (this.touchPageCase) {
                        case 0:
                        case 8:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 18:
                        case 19:
                        default:
                            break;
                        case 1:
                            ++this.al;
                            if (this.ak - this.aP >= 60000L) {
                                this.b("响应超时");
                            }
                            break;
                        case 2:
                            if ((this.ak - this.aQ >= 6600L || this.k == 7 && e.g != null && e.k == 25 && this.ak - this.aQ >= 2000L) && this.aR || this.touchAction == 1073741824 || this.touchAction == 517 || this.touchAction == 536870912 || this.touchAction == 268435456 || u()) {
                                if (this.aS != null && this.aS.startsWith("系统异常")) {
                                    this.t();
                                    break;
                                }

                                if (GlobalStatus.eC.startsWith("异常离线") || GlobalStatus.eB == 0 || this.k == 9) {
                                    this.G();
                                    break;
                                }

                                if (GlobalStatus.eC != null && (GlobalStatus.eC.startsWith("连接超时") || GlobalStatus.eC.startsWith("响应超时"))) {
                                    if (netUtils != null) {
                                        netUtils.d();
                                        netUtils = null;
                                    }

                                    this.y();
                                    break;
                                }

                                if (GlobalStatus.eC != null && e != null) {
                                    if (GlobalStatus.aC == 1 && (GlobalStatus.eC.endsWith("超Q用户才可兑换") || GlobalStatus.eC.endsWith("超Q用户才可接取"))) {
                                        e.af();
                                    }

                                    if (GlobalStatus.aH == 1 && (GlobalStatus.eC.endsWith("魔钻用户才可兑换") || GlobalStatus.eC.endsWith("魔钻用户才可接取"))) {
                                        e.ag();
                                    }
                                }

                                if (GlobalStatus.eC != null && GlobalStatus.eC.equals("您已短信申请开通VIP服务")) {
                                    this.touchPageCase = this.k = 7;
                                }

                                if (this.k != 3 && GlobalStatus.eB != -4) {
                                    if (this.k == 4) {
                                        if (GlobalConfig.channel == 1) {
                                            if (GlobalStatus.hw) {
                                                this.c();
                                            } else {
                                                this.d();
                                            }
                                        } else {
                                            this.d();
                                        }
                                    } else if (this.k == 5) {
                                        this.b(GlobalStatus.Y.length);
                                    } else if (this.k == 6) {
                                        this.C();
                                    } else if (this.k == 10) {
                                        this.G();
                                    } else if (this.k == 7) {
                                        if (e.k == 71) {
                                            e.e(this.as.a);
                                            this.ar.a(e.aE);
                                        } else if (e.k == 76) {
                                            byte var10 = this.as.a;
                                            int var17 = this.ar.g();
                                            e.d((byte) var10);
                                            int var22 = var10 == 0 ? GlobalStatus.O.f.length : GlobalStatus.P.b.length;
                                            this.ar.a(Math.min(var17, var22));
                                        } else if (e.k == 77) {
                                            e.u();
                                            this.ar.a(GlobalStatus.P.i);
                                        } else {
                                            this.i();
                                        }
                                    } else if (this.k == 9) {
                                        this.G();
                                    } else if (this.k == 14) {
                                        this.c();
                                    }
                                } else if (GlobalConfig.channel == 1) {
                                    if (bb_1.g != null) {
                                        this.aJ = false;
                                    } else {
                                        this.b((String) null, NetUtils.h);
                                    }
                                } else {
                                    this.b((String) null, NetUtils.h);
                                }
                            }

                            this.b = 0;
                            this.touchAction = 0;
                            if (GlobalConfig.o && this.touchController != null) {
                                this.touchController.c = 0;
                                this.touchController.d = 0;
                            }
                            break;
                        case 3:
                            if (this.aZ) {
                                this.init("socket://120.78.151.213:20008", "http://117.135.138.130:7099");
                                GlobalConfig.clearStr(this.l);
                                GlobalStatus.b = this.bN.getString();
                                GlobalStatus.c = this.bO.getString();
                                this.F();
                                byte[] var16;
                                if ((var16 = NetPayloadBuilder.buildLogin((short) 5379, GlobalStatus.b, GlobalStatus.c, GlobalConfig.PopularizeChannel)) != null) {
                                    NetPacket var21;
                                    (var21 = new NetPacket((short) 5379, var16)).firstPacket = true;
                                    netUtils.sendPacket(var21);
                                    this.aZ = false;
                                    this.a((String) null);
                                } else {
                                    this.b("获取上传指令数据错误!");
                                }
                            }

                            this.touchAction = 0;
                            break;
                        case 4:
                            if (this.touch4Status == 0) {
                                if (GlobalConfig.channel == 1 && this.bw != bb_1.d) {
                                    this.bw = bb_1.d;
                                    this.d();
                                }

                                if (this.aq != null) {
                                    this.aq.b(this.touchAction);
                                }

                                if (this.touchAction != 268435456 && this.touchAction != 1073741824 && this.touchAction != 517) {
                                    if (this.touchAction == 536870912) {
                                        this.c();
                                    }
                                } else if (GlobalStatus.hA != null || GlobalStatus.hA.length > 0) {
                                    if (GlobalConfig.channel == 0) {
                                        int var13 = this.ar.g();
                                        s();
                                        String var20 = null;
                                        if (NetUtils.h == 1) {
                                            if (GlobalStatus.hB[var13].equals("")) {
                                                this.b(GlobalStatus.hA[var13] + "繁忙,请选择其他服!");
                                            } else {
                                                var20 = GlobalStatus.hB[var13];
                                                setUrl((String) "http://117.135.138.130:7099", (byte) 1);
                                                NetPayloadBuilder.channelFlag = GlobalStatus.hE[var13];
                                                this.a(GlobalStatus.hE[var13]);
                                            }
                                        } else if (GlobalStatus.hC[var13].equals("")) {
                                            this.b(GlobalStatus.hA[var13] + "繁忙,请选择其他服!");
                                        } else {
                                            setUrl((String) (var20 = GlobalStatus.hC[var13]), (byte) 2);
                                            this.a(GlobalStatus.hE[var13]);
                                        }

                                        this.init(var20, "http://117.135.138.130:7099");
                                        NetPayloadBuilder.channelFlag = GlobalStatus.hE[var13];
                                        byte[] var14;
                                        if ((var14 = NetPayloadBuilder.g((short) 4196, GlobalStatus.hy, GlobalStatus.hz)) != null) {
                                            NetPacket var15;
                                            (var15 = new NetPacket((short) 4196, var14)).firstPacket = true;
                                            netUtils.sendPacket(var15);
                                            this.aZ = false;
                                            this.a((String) null);
                                        } else {
                                            this.b("获取上传指令数据错误!");
                                        }
                                    } else if (GlobalConfig.w) {
                                        this.a(this.ar.g());
                                    } else if (!GlobalStatus.hw) {
                                        this.a(this.ar.g());
                                    }
                                }
                            }

                            this.touchAction = 0;
                            break;
                        case 5:
                            this.B();
                            break;
                        case 6:
                            if (this.aq != null) {
                                this.aq.b(this.touchAction);
                            }

                            if (this.touchAction != 1 && this.touchAction != 514) {
                                if (this.touchAction != 4 && this.touchAction != 520) {
                                    if (this.touchAction != 8 && this.touchAction != 516) {
                                        if (this.touchAction != 2 && this.touchAction != 518) {
                                            if (this.touchAction == 268435456) {
                                                boolean var12 = false;
                                                String var18 = this.ay;
                                                Object var3 = null;
                                                byte[] var8;
                                                if ((var8 = NetPayloadBuilder.a((short) 4099, var18, (byte) this.bF, (byte) this.bE)) != null) {
                                                    netUtils.sendPacket(new NetPacket((short) 4099, var8));
                                                    this.a((String) null);
                                                } else {
                                                    this.b("获取上传指令数据错误!");
                                                }
                                            } else if (this.touchAction == 536870912) {
                                                if (GlobalStatus.W != null) {
                                                    this.b(GlobalStatus.W.length);
                                                    break;
                                                }

                                                byte[] var19;
                                                if ((var19 = NetPayloadBuilder.a((short) 4098, (String) GlobalStatus.d, (String) GlobalStatus.b)) != null) {
                                                    netUtils.sendPacket(new NetPacket((short) 4098, var19));
                                                    this.a((String) null);
                                                } else {
                                                    this.b("获取上传指令数据错误!");
                                                }
                                            } else if ((this.touchAction == 1073741824 || this.touchAction == 517) && this.bH == 2) {
                                                if (this.bG == 0) {
                                                    this.b((String) null, (String) null);
                                                } else {
                                                    byte[] var9;
                                                    if ((var9 = NetPayloadBuilder.a((short) 4372, this.bF)) != null) {
                                                        netUtils.sendPacket(new NetPacket((short) 4372, var9));
                                                        this.a((String) null);
                                                    } else {
                                                        this.b("获取上传指令数据错误!");
                                                    }
                                                }
                                            }
                                        } else if (this.bH == 0) {
                                            this.bE = (byte) (this.bE + 1 > 2 ? 0 : this.bE + 1);
                                            this.at.b(GlobalConfig.H[this.bE], GlobalConfig.i, (byte) 1);
                                            this.at.a((byte) 1);
                                        } else if (this.bH == 1) {
                                            this.bF = (byte) (this.bF + 1 > 1 ? 0 : 1);
                                        } else {
                                            this.bG = this.bG + 1 > 1 ? 0 : 1;
                                        }
                                    } else if (this.bH == 0) {
                                        this.bE = (byte) (this.bE - 1 < 0 ? 2 : this.bE - 1);
                                        this.at.b(GlobalConfig.H[this.bE], GlobalConfig.i, (byte) 1);
                                        this.at.a((byte) 1);
                                    } else if (this.bH == 1) {
                                        this.bF = (byte) (this.bF - 1 < 0 ? 1 : 0);
                                    } else {
                                        this.bG = this.bG - 1 < 0 ? 1 : 0;
                                    }
                                } else {
                                    this.bH = this.bH + 1 > 2 ? 0 : this.bH + 1;
                                }
                            } else {
                                this.bH = this.bH - 1 < 0 ? 2 : this.bH - 1;
                            }

                            if (this.bx != null && this.bF * 3 + this.bE < this.bx.length) {
                                PngUtil.a(this.bx[this.bF * 3 + this.bE], this.ak);
                            }

                            this.touchAction = 0;
                            break;
                        case 7:
                            this.E();
                            break;
                        case 9:
                            if (this.al >= 520L) {
                                this.al = 0L;
                                this.be = null;
                                LoadingPage.a();
                                this.k = this.touchPageCase = 0;
                                new b_3(this, bK);
                            }
                            break;
                        case 14:
                            if (this.touch4Status == 0) {
                                if (this.touchAction != 1 && this.touchAction != 50 && this.touchAction != 8 && this.touchAction != 516) {
                                    if (this.touchAction != 4 && this.touchAction != 520 && this.touchAction != 2 && this.touchAction != 518) {
                                        if (this.touchAction != 268435456 && this.touchAction != 1073741824 && this.touchAction != 517) {
                                            if (this.touchAction == 536870912 && GlobalConfig.channel == 1) {
                                                LoadingPage.h = 0;
                                                this.k = this.touchPageCase = 16;
                                            }
                                        } else if (GlobalConfig.channel == 0) {
                                            switch (this.bs) {
                                                case 0:
                                                    if (GlobalConfig.channel == 0) {
                                                        Object var4 = null;
                                                        this.init("socket://120.78.151.213:20008", "http://117.135.138.130:7099");
                                                        int var5 = (int) Runtime.getRuntime().totalMemory();
                                                        byte[] var11;
                                                        if ((var11 = NetPayloadBuilder.a((short) 5383, (byte) 0, (String) null, (String) null, false, GlobalConfig.PopularizeChannel, GlobalConfig.F, var5, "")) != null) {
                                                            netUtils.sendPacket(new NetPacket((short) 5383, var11));
                                                            this.aZ = false;
                                                            this.a("服务器列表");
                                                        } else {
                                                            this.b("获取上传指令数据错误!");
                                                        }
                                                    }
                                                case 1:
                                                default:
                                                    break;
                                                case 2:
                                                    this.G();
                                            }
                                        } else {
                                            switch (this.bs) {
                                                case 0:
                                                    if (GlobalConfig.x) {
                                                        this.v();
                                                    } else {
                                                        c_3.c();
                                                    }
                                                    break;
                                                case 1:
                                                    c_3.e();
                                                    break;
                                                case 2:
                                                    c_3.f();
                                            }
                                        }
                                    } else {
                                        this.bs = this.bs < this.bo.length - 1 ? ++this.bs : 0;
                                    }
                                } else {
                                    this.bs = this.bs > 0 ? --this.bs : this.bo.length - 1;
                                }
                            } else if (this.touch4Status == 1) {
                                if (this.touchAction != 268435456 && this.touchAction != 1073741824) {
                                    if (this.touchAction == 536870912) {
                                        this.touch4Status = 0;
                                    }
                                } else {
                                    this.touch4Status = 0;
                                    GlobalConfig.w = false;
                                    ai.d();
                                }
                            }

                            this.touchAction = 0;
                            break;
                        case 15:
                            if (this.touchAction == 268435456) {
                                this.c("http://3g.01234.com.cn/game/gameAction.do?m=gameIndex&sId=");
                                this.aJ = false;
                            } else if (this.touchAction == 536870912) {
                                this.c();
                                this.bs = 1;
                            }

                            this.touchAction = 0;
                            break;
                        case 16:
                            if (this.touchAction == 268435456) {
                                if (!GlobalConfig.y && !GlobalConfig.B && !GlobalConfig.D) {
                                    LoadingPage.h = 0;
                                    this.k = this.touchPageCase = 17;
                                } else {
                                    this.aJ = false;
                                }
                            } else if (this.touchAction == 536870912) {
                                this.k = this.touchPageCase = 14;
                            }

                            this.touchAction = 0;
                            break;
                        case 17:
                            if (this.touchAction == 268435456) {
                                if (GlobalConfig.x) {
                                    this.c("http://zt.d.cn/a091111_netgame_forum_promotion/index.pih?fid=6724&cid=269");
                                } else if (GlobalConfig.z) {
                                    this.c("http://9Game.CN/Url.Aspx?id=219");
                                } else if (GlobalConfig.A) {
                                    this.c("http://g.uc.cn");
                                } else if (GlobalConfig.C) {
                                    this.c("http://haxiang.cn");
                                } else {
                                    this.c("http://3g.01234.com.cn/game/gameAction.do?m=gameIndex&sId=");
                                }

                                this.aJ = false;
                            } else if (this.touchAction == 536870912) {
                                this.touch4Status = 0;
                                this.G();
                            }

                            this.touchAction = 0;
                            break;
                        case 20:
                            if (this.touchAction != 8 && this.touchAction != 516) {
                                if (this.touchAction != 2 && this.touchAction != 518) {
                                    if (this.touchAction != 268435456 && this.touchAction != 1073741824) {
                                        if (this.touchAction == 536870912) {
                                            this.c();
                                            this.bs = 0;
                                        }
                                    } else {
                                        this.c(aI);
                                    }
                                } else {
                                    LoadingPage.e = LoadingPage.e + LoadingPage.d < ao_1.K.a() ? LoadingPage.e + LoadingPage.d : LoadingPage.e;
                                }
                            } else {
                                LoadingPage.e = LoadingPage.e - LoadingPage.d >= 0 ? LoadingPage.e - LoadingPage.d : 0;
                            }

                            this.touchAction = 0;
                    }

                    if (e != null) {
                        e.d();
                        if (this.touchPageCase == 7) {
                            e.c();
                        }
                    }
                }
            } catch (Exception var7) {
                this.a((Exception) var7, (byte) 1);
                ((Throwable) var7).printStackTrace();
            }

            ((Canvas) this).repaint();
            ((Canvas) this).serviceRepaints();
            long var1 = 35L - (System.currentTimeMillis() - this.ak);

            try {
                if (var1 > 0L) {
                    Thread.sleep(var1);
                } else {
                    Thread.sleep(1L);
                }
            } catch (Exception var6) {
                ((Throwable) var6).printStackTrace();
            }
        }

        if (netUtils != null) {
            netUtils.d();
        }

        e = null;
        this.J();
    }

    protected final void paint(Graphics var1) {
        try {
            if (this.touchPageCase == 9) {
                var1.setColor(0);
                var1.fillRect(0, 0, GlobalConfig.defaultWidth, GlobalConfig.defaultHigh);
            }

            var1.setClip(0, 0, GlobalConfig.defaultWidth, GlobalConfig.defaultHigh);
            var1.setFont(GlobalConfig.i);
            if (this.p) {
                LoadingPage.b(var1);
            } else {
                if (this.aJ) {
                    switch (this.touchPageCase) {
                        case 0:  // 加载阶段：绘制加载画面（提示文字 + "正在载入资源..." + 进度条）
                            LoadingPage.a(var1, this.bf);
                            return;
                        case 1:
                            if (e != null) {
                                e.a(var1);
                            } else if (this.k == 9) {
                                this.b(var1);
                            } else if (this.k != 14 && this.k != 3) {
                                if (this.k == 4) {
                                    this.e(var1);
                                } else if (this.k == 5) {
                                    this.f(var1);
                                }
                            } else {
                                this.d(var1);
                            }

                            LoadingPage.b(var1);
                            return;
                        case 2:
                            if (this.aS != null && this.aS.startsWith("系统异常")) {
                                this.a(var1);
                            } else {
                                if (e != null) {
                                    e.a(var1);
                                }

                                this.a(var1);
                            }

                            return;
                        case 3:
                            this.d(var1);
                            return;
                        case 4:
                            this.e(var1);
                            return;
                        case 5:
                            this.f(var1);
                            return;
                        case 6:
                            this.c(var1);
                            if (this.aq != null) {
                                this.aq.a(var1);
                                LoadingPage.a(var1, this.aq.a + 5, this.aq.b + 32, this.aq.c - 11, this.aq.a(GlobalConfig.realHigh <= 240 ? this.bB * 3 + 6 : 150), 1);
                                LoadingPage.b(var1, this.aq.a + 80, this.aq.b + 35, this.aq.a + 80, this.aq.b + 35 + this.aq.a(GlobalConfig.realHigh <= 240 ? this.bB * 3 + 6 : 150) - 5);
                                var1.setColor(2176196);
                                int var2 = GlobalConfig.i.stringWidth(GlobalConfig.G[0]);
                                int var3 = this.aq.b + 45;
                                int var4 = this.aq.a + 5 + 80 + (this.aq.c - 80 - 13 - var2) / 2;
                                var1.drawString(GlobalConfig.G[this.bE], this.bE == 2 ? var4 + GlobalConfig.k / 2 : var4, var3, 20);
                                var1.drawImage(X.pngImage, var4 - 20, var3, 20);
                                this.a(0, var4 - 20, var3, X.b, X.c);
                                var1.drawImage(Y.pngImage, var4 + var2 + 15, var3, 20);
                                this.a(1, var4 + var2 + 15, var3, Y.b, Y.c);
                                var1.drawString(this.bF == 0 ? "男" : "女", this.aq.a + 5 + 80 + (this.aq.c - 80 - 13 - GlobalConfig.k) / 2, var3 + GlobalConfig.j + 10, 20);
                                var1.drawImage(X.pngImage, var4 - 20, var3 + GlobalConfig.j + 10, 20);
                                this.a(2, var4 - 20, var3 + GlobalConfig.j + 10, X.b, X.c);
                                var1.drawImage(Y.pngImage, var4 + var2 + 15, var3 + GlobalConfig.j + 10, 20);
                                this.a(3, var4 + var2 + 15, var3 + GlobalConfig.j + 10, X.b, X.c);
                                var1.drawString("昵称：", this.aq.a + 5 + 80 + 5, var3 + (GlobalConfig.j + 10 << 1), 20);
                                LoadingPage.c(var1, this.aq.a + 5 + 80 + 5, var3 + (GlobalConfig.j + 10) * 3 - 1, this.aq.c - 80 - this.bD.getWidth() - 20, GlobalConfig.j, 0);
                                LoadingPage.a(var1, this.ay, this.aq.a + 5 + 80 + 5 + 2, var3 + (GlobalConfig.j + 10) * 3, 20, 16711639);
                                var1.drawImage(this.bD, this.aq.a + this.aq.c - 8, var3 + (GlobalConfig.j + 10) * 3, 24);
                                this.a(4, this.aq.a + 5 + 80 + 5, var3 + (GlobalConfig.j + 10) * 3, this.aq.c - 80 - this.bD.getWidth() - 20, GlobalConfig.j);
                                this.a(5, this.aq.a + this.aq.c - 8 - this.bD.getWidth(), var3 + (GlobalConfig.j + 10) * 3, this.bD.getWidth(), this.bD.getHeight());
                                var1.setColor(16711680);
                                if (this.bH == 0) {
                                    var1.drawRect(var4, var3, var2, GlobalConfig.j);
                                } else if (this.bH == 1) {
                                    var1.drawRect(this.aq.a + 5 + 80 + (this.aq.c - 80 - 13 - GlobalConfig.k) / 2, var3 + GlobalConfig.j + 10, GlobalConfig.k, GlobalConfig.j);
                                } else if (this.bG == 0) {
                                    var1.drawRect(this.aq.a + 5 + 80 + 5, var3 + (GlobalConfig.j + 10) * 3 - 1, this.aq.c - 80 - this.bD.getWidth() - 20, GlobalConfig.j);
                                } else {
                                    var1.drawRect(this.aq.a + this.aq.c - 8 - this.bD.getWidth(), var3 + (GlobalConfig.j + 10) * 3, this.bD.getWidth(), this.bD.getHeight());
                                }

                                if (this.bx != null && this.bx[this.bF * 3 + this.bE] != null) {
                                    f.a(var1, (Frame1) this.bx[this.bF * 3 + this.bE], (int[]) null, 0, 0, this.aq.a + 40 + 5, this.aq.b + 32 + this.bx[this.bF * 3 + this.bE].j() + (this.aq.a(GlobalConfig.realHigh <= 240 ? (this.bB << 1) + 6 : 120) - this.bx[this.bF * 3 + this.bE].j()) / 2, 20, 0);
                                }
                            }

                            return;
                        case 7:
                            e.a(var1);
                            return;
                        case 8:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 18:
                        case 19:
                        default:
                            break;
                        case 9:
                            this.b(var1);
                            return;
                        case 14:
                            this.d(var1);
                            return;
                        case 15:
                            this.c(var1);
                            if (GlobalConfig.channel == 0) {
                                LoadingPage.a(var1, "更多精彩游戏尽在腾讯游戏频道\t(3g.qq.com)", new String[]{"更多", "退出"});
                            } else {
                                if (GlobalConfig.channel != 1) {
                                    LoadingPage.a(var1, "更多精彩游戏尽在当乐网\t(com.cc.d.cn)", new String[]{"更多", "返回"});
                                    return;
                                }

                                LoadingPage.a(var1, "更多精彩游戏尽在一哥哥网游戏频道\t(3g.01234.com.cn)", new String[]{"更多", "返回"});
                            }
                            break;
                        case 16:
                            this.d(var1);
                            LoadingPage.a(var1, "确认退出？", new String[]{"确认", "返回"});
                            return;
                        case 17:
                            this.d(var1);
                            if (GlobalConfig.x) {
                                LoadingPage.a(var1, "是否进入当乐梦回西游论坛\t(http://zt.d.cn/a091111_netgame_forum_promotion/index.pih?fid=6724&cid=269)", new String[]{"进入", "退出"});
                            } else if (GlobalConfig.z) {
                                LoadingPage.a(var1, "更多精彩游戏尽在九游网游戏频道\t(http://9Game.CN/Url.Aspx?id=219)", new String[]{"更多", "退出"});
                            } else if (GlobalConfig.A) {
                                LoadingPage.a(var1, "更多精彩游戏尽在http://g.uc.cn", new String[]{"更多", "退出"});
                            } else {
                                if (!GlobalConfig.C) {
                                    LoadingPage.a(var1, "更多精彩游戏尽在一哥哥网游戏频道\t(3g.01234.com.cn)", new String[]{"更多", "退出"});
                                    return;
                                }

                                LoadingPage.a(var1, "更多精彩游戏尽在http://haxiang.cn", new String[]{"更多", "退出"});
                            }
                            break;
                        case 20:
                            this.c(var1);
                            LoadingPage.a(var1, aH, new String[]{"下载", "取消"});
                    }
                }

                return;
            }
        } catch (Exception var5) {
            ((Throwable) var5).printStackTrace();
        }

    }

    public final void a(Exception var1, byte var2) {
        ((Throwable) var1).printStackTrace();
        if (e != null) {
            e.c = false;
            e.Y = -1;
            ao_1.R();
            if (e.g != null) {
                e.g.l();
            }

            e.j = e.k = 0;
            this.touchPageCase = this.k = 7;
        }

        GlobalStatus.H = null;
        GlobalStatus.M = null;
        GlobalStatus.I = null;
        GlobalStatus.N = null;
        GlobalStatus.as = -1;
        this.p = false;
        if (var2 == 1) {
            this.b("系统异常<" + var2 + ">");
        }

    }

    public final void b() {
        ((Canvas) this).repaint();
        ((Canvas) this).serviceRepaints();
    }

    public static void a(byte var0, byte var1, byte var2, byte var3, String var4, short var5, short var6, short var7) {
        aN.removeAllElements();
        if (var2 == 5) {
            aN.addElement(a(var0, var1, (byte) 1, var3, false, var4));
            aN.addElement(a(var0, var1, (byte) 3, var3, false, var4));
            aN.addElement(a(var0, var1, (byte) 3, var3, true, var4));
            aN.addElement(a(var0, var1, (byte) 0, var3, false, var4));
            aN.addElement(a(var0, var1, (byte) 0, var3, true, var4));
            aN.addElement(a(var0, var1, (byte) 2, var3, false, var4));
            aN.addElement(a(var0, var1, (byte) 2, var3, true, var4));
        } else {
            aN.addElement(a(var0, var1, var2, var3, false, var4));
        }

        for (int var8 = 0; var8 < aN.size(); ++var8) {
            ab.b((String) aN.elementAt(var8), var5, var6, var7);
        }

        aN.removeAllElements();
    }

    public static String a(byte var0, byte var1, byte var2, byte var3, boolean var4) {
        if (GlobalConfig.m == 2) {
            var3 = 0;
        }

        return "" + GlobalConfig.V[var0] + GlobalConfig.W[var1] + var3 + GlobalConfig.X[var2] + (var4 ? "4" : "");
    }

    public static String a(byte var0, byte var1, byte var2, byte var3, boolean var4, String var5) {
        if (GlobalConfig.m == 2) {
            var3 = 0;
        }

        if (GlobalConfig.hasRideRes) {
            aO.delete(0, aO.length());
            aO.append("");
            aO.append(var5);
            aO.append(GlobalConfig.V[var0]);
            aO.append(GlobalConfig.W[var1]);
            aO.append(var3);
            aO.append(GlobalConfig.X[var2]);
            aO.append(var4 ? "4" : "");
            return aO.toString();
        } else {
            return "" + GlobalConfig.V[var0] + GlobalConfig.W[var1] + var3 + GlobalConfig.X[var2] + (var4 ? "4" : "");
        }
    }

    public final void a(String var1) {
        int var2;
        if ((var2 = GlobalConfig.defaultWidth * 6 / 11) < 110) {
            var2 = 110;
        } else if (var2 > 160) {
            var2 = 160;
        }

        LoadingPage.a((GlobalConfig.defaultWidth - var2) / 2, GlobalConfig.defaultHigh / 2 + 15, var2, 20, var1);
        this.aP = this.ak;
        this.touchPageCase = 1;
    }

    public final void b(String var1) {
        if (this.aS != null && this.aS.startsWith("系统异常")) {
            this.t();
        }

        if (var1 != null && var1.startsWith("系统异常")) {
            this.aS = var1;
        }

        if (GlobalStatus.bs == 1 && GlobalStatus.s == 0 && GlobalStatus.eC != null && GlobalStatus.eC.startsWith("队伍成员位置信息不一致")) {
            e.S();
            GlobalStatus.eC = null;
            this.i();
        } else {
            GlobalStatus.eC = var1;
            this.aT = new TextRender(GlobalStatus.eC, (short) (GlobalConfig.defaultWidth - 20));
            if (e == null || e.k != 25) {
                ((Canvas) this).setFullScreenMode(true);
                this.mainMidlet.display.setCurrent(this);
            }

            this.aQ = this.ak;
            this.aR = true;
            if (this.aT != null) {
                this.aX = 0;
                this.aX = this.aT.a;
                this.aX = this.aX + 20 > GlobalConfig.defaultWidth ? GlobalConfig.defaultWidth : this.aX + 20;
                if (this.aX < GlobalConfig.defaultWidth * 5 / 7) {
                    this.aX = GlobalConfig.defaultWidth * 5 / 7;
                }

                this.aV = (GlobalConfig.defaultWidth - this.aX) / 2;
                this.aY = this.aT.a() * GlobalConfig.j + 14;
                this.aW = (GlobalConfig.defaultHigh - this.aY) / 2;
            }

            this.touchPageCase = 2;
            if (GlobalConfig.o && this.touchController != null) {
                this.touchController.pointX = -1;
                this.touchController.pointY = -1;
            }

        }
    }

    public final void a(boolean var1) {
        this.aR = false;
    }

    private void t() {
        if (e == null) {
            this.y();
        } else {
            e.h((byte) 1);
            this.a((String) null);
        }

        this.aS = null;
    }

    public final int buildTouchAction(int var1, int var2) {
        return var1 >= this.aV && var1 <= this.aV + this.aX && var2 >= this.aW && var2 <= this.aW + this.aY ? 0 : 536870912;
    }

    private void a(Graphics var1) {
        if (!u()) {
            LoadingPage.a(var1, this.aV, this.aW, this.aX, this.aY);
            if (this.aT != null) {
                this.aT.a(var1, GlobalConfig.defaultWidth / 2, this.aW + 7);
            }
        }

    }

    private static boolean u() {
        return GlobalStatus.eC != null && GlobalStatus.eC.equals("数据更新失败:");
    }

    public static void setUrl(String url, byte type) {
        NetUtils.xieyiType = type;
        if (type == 2) {
            NetUtils.socketUrl = url;
        } else {
            NetUtils.httpUrl = url;
        }
    }

    private void b(String var1, byte var2) {
        setUrl(var1 == null ? (var2 == 2 ? "socket://120.78.151.213:20008" : "http://117.135.138.130:7099") : var1, var2);
        if (GlobalConfig.w) {
            this.v();
        } else {
            this.aD = new Form("登陆游戏");
            this.bP = new Command("登陆", 4, 1);
            this.bQ = new Command("返回", 2, 1);
            this.bN = new TextField("帐号:", GlobalStatus.b, 20, 0);
            this.bO = new TextField("密码:", GlobalStatus.c, 20, 65536);
            this.aD.addCommand(this.bP);
            this.aD.addCommand(this.bQ);
            this.aD.append(this.bN);
            this.aD.append(this.bO);
            this.aD.setCommandListener(this);
            this.q.setCurrent(this.aD);
        }

        this.k = this.touchPageCase = 3;
    }

    private void v() {
        MainCanvas var1 = this;
        GlobalConfig.w = false;
        if (j("dcn_user_info.db")) {
            try {
                RecordStore var2;
                DataInputStream var3;
                if ((var3 = a(var2 = a("dcn_user_info.db", false))) != null) {
                    GlobalConfig.w = var3.readBoolean();
                    var1.ba = var3.readByte();
                    bb_1.k = var3.readBoolean();
                    GlobalStatus.b = var3.readUTF();
                    GlobalStatus.c = var3.readUTF();
                    var3.close();
                }

                if (var2 != null) {
                    var2.closeRecordStore();
                }
            } catch (RecordStoreException var4) {
                ((Throwable) var4).printStackTrace();
            } catch (Exception var5) {
                ((Throwable) var5).printStackTrace();
            }
        }

        this.aD = new Form(GlobalConfig.w ? "登录当乐通行证" : "登录一哥哥通行证");
        this.bb = new ChoiceGroup((String) null, 1);
        this.bb.append("官方帐号登录", (Image) null);
        this.bb.append("当乐帐号登录", (Image) null);
        this.bc = e(GlobalConfig.w ? 1 : 0);
        this.bd = new ChoiceGroup((String) null, 2, new String[]{"记住密码"}, (Image[]) null);
        this.bN = new TextField("帐  号:", (String) null, 16, 0);
        this.bO = new TextField("密  码:", (String) null, 16, 65536);
        if (bb_1.k) {
            this.bb.setSelectedIndex(GlobalConfig.w ? 1 : 0, true);
            this.bc.setSelectedIndex(this.ba, true);
            this.bd.setSelectedIndex(0, true);
            this.bN.setString(GlobalStatus.b);
            this.bO.setString(GlobalStatus.c);
        }

        this.aD.setItemStateListener(new d_3(this));
        this.aD.append(this.bb);
        this.aD.append(this.bc);
        this.aD.append(this.bN);
        this.aD.append(this.bO);
        this.aD.append(this.bd);
        this.aD.append("温馨提示：如果有当乐帐号的用户可以在帐号选择使用当乐帐号进行登录游戏！");
        this.bP = new Command("登陆", 4, 1);
        this.bQ = new Command("返回", 2, 1);
        this.aD.addCommand(this.bP);
        this.aD.addCommand(this.bQ);
        this.aD.setCommandListener(this);
        this.q.setCurrent(this.aD);
    }

    private static ChoiceGroup e(int var0) {
        Object var1 = null;
        String[] var2;
        if (var0 == 1) {
            var2 = new String[]{"乐乐号", "用户名"};
        } else {
            var2 = new String[]{"用户名", "手机号", "ID"};
        }

        return new ChoiceGroup("方式", 4, var2, (Image[]) null);
    }

    private void w() {
        if (!bv) {
            this.x();
            MainCanvas var1 = this;
            this.bj = k("/images/light_0.png");
            this.bk = k("/images/light_1.png");
            int var2 = GlobalConfig.defaultWidth / 9;
            this.bq = new int[8];

            for (int var3 = 0; var3 < var1.bq.length; ++var3) {
                var1.bq[var3] = var2 * (var3 + 1);
            }

            var1.bp = new int[8][5];

            for (int var5 = 0; var5 < var1.bp.length; ++var5) {
                for (int var4 = 0; var4 < var1.bp[var5].length; ++var4) {
                    var1.bp[var5] = var1.z();
                }
            }

            if (bl == null) {
                (bl = new Page("/", "cartoon")).loadRpg();
                if (bl.framesNum() != 0) {
                    bm = bl.b("hudie");
                    bn = bl.b("hudie_2");
                }
            }

            this.bh = k("/images/" + (GlobalConfig.defaultHigh <= 220 ? "logoTitle_M.png" : "logoTitle_B.png"));
            this.bg = k("/images/menuBG.png");
            this.bi = k("/images/menuItem.png");
            bv = true;
        }
    }

    private void x() {
        this.bj = null;
        this.bk = null;
        bm = null;
        bn = null;
        bl = null;
        this.bh = null;
        this.bg = null;
        this.bi = null;
        bv = false;
    }

    private void y() {
        if ("mhxy060".equals(GlobalConfig.PopularizeChannel)) {
            this.be = k("/jy_logo.png");
        } else {
            this.be = k("/logo.png");
        }

        this.bf = k("/images/loading.png");
        this.al = 0L;
        this.k = this.touchPageCase = 9;
        this.b();
    }

    private void b(Graphics var1) {
        if (this.al < 260L) {
            this.al = 260L;
        }

        if (this.al >= 260L) {
            var1.setColor(0);
            var1.fillRect(0, 0, GlobalConfig.defaultWidth, GlobalConfig.defaultHigh);
            var1.drawImage(this.be, GlobalConfig.defaultWidth - this.be.getWidth() >> 1, GlobalConfig.defaultHigh - this.be.getHeight() >> 1, 20);
            this.bu = (int) (515L - this.al > 0L ? 515L - this.al : 0L);
            LoadingPage.a(var1, 0, this.bu, GlobalConfig.defaultWidth - this.be.getWidth() >> 1, GlobalConfig.defaultHigh - this.be.getHeight() >> 1, this.be.getWidth(), this.be.getHeight());
            this.al += 5L;
        }

    }

    public final void c() {
        NetPayloadBuilder.hands1 = 90;
        this.w();
        if (GlobalConfig.channel == 0) {
            this.bo = new String[]{"进入游戏", "更多游戏", "退出游戏"};
        } else if (GlobalConfig.channel == 1) {
            this.bo = new String[]{"登陆游戏", "注册游戏", "修改密码"};
        }

        this.touch4Status = 0;
        this.bu = 0;
        LoadingPage.l = 0;
        LoadingPage.h = 0;
        if (GlobalConfig.channel != 0) {
            if (am == null && bb_1.m != null) {
                am = bb_1.m;
                an = bb_1.n;
                ao = bb_1.l;
                ap = bb_1.k;
            }

            if (am == null) {
                am = "";
                if ("mhxy011".equals(GlobalConfig.PopularizeChannel) || "mhxy278".equals(GlobalConfig.PopularizeChannel)) {
                    this.touch4Status = 1;
                }
            }

            if (an == null) {
                an = "";
            }

            if (NetPayloadBuilder.hands2 != 72) {
                s();
                netUtils = null;
            }
        } else if (NetPayloadBuilder.channelFlag != 162) {
            NetPayloadBuilder.channelFlag = 162;
            s();
        }

        GlobalStatus.O();
        this.A();
        this.al = 8L;
        this.bs = 0;
        this.k = this.touchPageCase = 14;
    }

    private void c(Graphics var1) {
        this.bt = GlobalConfig.defaultHigh <= 240 ? 2 : (GlobalConfig.defaultHigh - this.bh.getHeight() - this.bi.getHeight() * 7) / 3;
        if (this.bg != null) {
            var1.drawImage(this.bg, GlobalConfig.defaultWidth - this.bg.getWidth() >> 1, GlobalConfig.defaultHigh - this.bg.getHeight() >> 1, 20);
        }

        if (this.bh != null) {
            var1.drawImage(this.bh, GlobalConfig.defaultWidth - this.bh.getWidth() >> 1, this.bt, 20);
        }

        if (bm != null) {
            PngUtil.a(bm, this.ak);
            f.a(var1, (Frame1) bm, (int[]) null, 0, 0, GlobalConfig.defaultWidth - 100, GlobalConfig.defaultHigh - 100, 0, 0);
        }

        if (bn != null) {
            PngUtil.a(bn, this.ak);
            f.a(var1, (Frame1) bn, (int[]) null, 0, 0, GlobalConfig.defaultWidth - 100, GlobalConfig.defaultHigh - 100, 0, 0);
        }

        var1 = var1;
        if (this.bj != null && this.bk != null && this.bp != null) {
            for (int var2 = 0; var2 < this.bp.length; ++var2) {
                for (int var3 = 0; var3 < this.bp[var2].length; ++var3) {
                    if (this.bp[var2][0] >= 0 && this.bp[var2][0] <= GlobalConfig.defaultWidth && this.bp[var2][1] >= 0) {
                        if ((this.br & 1) == 0) {
                            this.bp[var2][0] += LoadingPage.f(10, 40) % 2 == 0 ? -this.bp[var2][2] : this.bp[var2][2];
                            this.bp[var2][1] -= this.bp[var2][3];
                        }
                    } else {
                        this.bp[var2] = this.z();
                    }

                    var1.drawImage(this.bp[var2][4] == 0 ? this.bj : this.bk, this.bp[var2][0], this.bp[var2][1], 20);
                }
            }

            ++this.br;
        }
    }

    private int[] z() {
        int[] var1;
        (var1 = new int[5])[0] = this.bq[LoadingPage.f(1, 100) % 8];
        var1[1] = GlobalConfig.defaultHigh + LoadingPage.f(1, 200);
        var1[2] = 1;
        var1[3] = 1;
        var1[4] = LoadingPage.f(1, 100) % 2;
        return var1;
    }

    private void d(Graphics var1) {
        this.c(var1);
        LoadingPage.a(var1, (String) GlobalConfig.t, (int) 5, GlobalConfig.defaultHigh - 3, 36, 6160358, 335925);
        if (GlobalConfig.channel == 1) {
            LoadingPage.a(var1, (String) "退出", (int) (GlobalConfig.defaultWidth - 5), GlobalConfig.defaultHigh - 3, 40, 16777215, 335925);
        }

        for (int var2 = 0; var2 < this.bo.length; ++var2) {
            if (var2 == this.bs) {
                var1.drawImage(this.bi, GlobalConfig.defaultWidth - this.bi.getWidth() >> 1, (this.bt << 1) + this.bh.getHeight() + var2 * this.bi.getHeight(), 20);
            }

            LoadingPage.a(var1, (String) this.bo[var2], (int) (GlobalConfig.defaultWidth >> 1), (this.bt << 1) + this.bh.getHeight() + var2 * this.bi.getHeight() + (this.bi.getHeight() - GlobalConfig.j) / 2, 17, 16777215, 335925);
        }

        if (this.touch4Status == 1) {
            LoadingPage.a(var1, "当前没有账号信息，是否自动注册？", new String[]{"确定", "返回"});
        }

    }

    public final void c(String var1) {
        try {
            this.mainMidlet.platformRequest(var1);
            this.G();
        } catch (ConnectionNotFoundException var2) {
            ((Throwable) var2).printStackTrace();
        }
    }

    public final void d() {
        if (this.aD != null) {
            this.aD.removeCommand(this.bP);
            this.aD.removeCommand(this.bQ);
            this.aD.deleteAll();
        }

        this.bP = null;
        this.bQ = null;
        this.bN = null;
        this.bO = null;
        this.aD = null;
        this.mainMidlet.start();
        MainCanvas var1 = this;
        if (GlobalStatus.hE != null) {
            this.K();

            for (int var2 = 0; var2 < GlobalStatus.hE.length; ++var2) {
                if (GlobalStatus.hE[var2] == var1.ce && var2 != 0) {
                    String var3 = GlobalStatus.hA[var2];
                    String var4 = GlobalStatus.hB[var2];
                    String var5 = GlobalStatus.hC[var2];
                    short var6 = GlobalStatus.hE[var2];
                    String var7 = GlobalStatus.hF[var2];

                    for (int var8 = var2; var8 > 0; --var8) {
                        GlobalStatus.hA[var8] = GlobalStatus.hA[var8 - 1];
                        GlobalStatus.hB[var8] = GlobalStatus.hB[var8 - 1];
                        GlobalStatus.hC[var8] = GlobalStatus.hC[var8 - 1];
                        GlobalStatus.hE[var8] = GlobalStatus.hE[var8 - 1];
                        GlobalStatus.hF[var8] = GlobalStatus.hF[var8 - 1];
                    }

                    GlobalStatus.hA[0] = var3;
                    GlobalStatus.hB[0] = var4;
                    GlobalStatus.hC[0] = var5;
                    GlobalStatus.hE[0] = var6;
                    GlobalStatus.hF[0] = var7;
                }
            }
        }

        this.aq.b();
        this.aq.a("服务器列表");
        int[] var9 = null;
        if (GlobalConfig.channel == 1 && GlobalStatus.hx >= 0 && GlobalStatus.hx < GlobalStatus.hA.length) {
            var9 = new int[GlobalStatus.hA.length];

            for (int var10 = 0; var10 < var9.length; ++var10) {
                if (var10 == GlobalStatus.hx) {
                    var9[var10] = LoadingPage.a(0);
                } else {
                    var9[var10] = LoadingPage.a(6);
                }
            }
        }

        this.ar.a((Image[]) null, GlobalStatus.hA, (String[]) null, GlobalStatus.hF);
        this.ar.a(var9);
        this.aq.a((al) this.ar);
        this.au.a(new String[]{"进入选区", ""});
        this.aq.a((al) this.au);
        this.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
        this.k = this.touchPageCase = 4;
        this.touch4Status = 0;
        this.touchAction = 0;
        this.b = 0;
    }

    public final void a(int var1) {
        s();
        String var2 = null;
        if (NetUtils.h == 1) {
            if (GlobalStatus.hB[var1].equals("")) {
                this.b(GlobalStatus.hA[var1] + "繁忙,请选择其他服!");
            } else {
                var2 = GlobalStatus.hB[var1];
                setUrl((String) "http://117.135.138.130:7099", (byte) 1);
                NetPayloadBuilder.hands1 = (byte) GlobalStatus.hD[var1];
                NetPayloadBuilder.hands2 = (byte) GlobalStatus.hE[var1];
                this.a(GlobalStatus.hE[var1]);
            }
        } else if (GlobalStatus.hC[var1].equals("")) {
            this.b(GlobalStatus.hA[var1] + "繁忙,请选择其他服!");
        } else {
            setUrl((String) (var2 = GlobalStatus.hC[var1]), (byte) 2);
            NetPayloadBuilder.hands1 = (byte) GlobalStatus.hD[var1];
            NetPayloadBuilder.hands2 = (byte) GlobalStatus.hE[var1];
            this.a(GlobalStatus.hE[var1]);
        }

        this.init(var2, "http://117.135.138.130:7099");
        byte[] var3;
        if ((var3 = NetPayloadBuilder.a((short) 4096, GlobalStatus.hy, GlobalStatus.hz, GlobalConfig.PopularizeChannel, GlobalStatus.hw)) != null) {
            NetPacket var4;
            (var4 = new NetPacket((short) 4096, var3)).firstPacket = true;
            netUtils.sendPacket(var4);
            this.aZ = false;
            this.a((String) null);
        } else {
            this.b("获取上传指令数据错误!");
        }
    }

    private void e(Graphics var1) {
        if (GlobalConfig.channel != 1 || GlobalConfig.w || !GlobalStatus.hw) {
            this.c(var1);
            if (this.aq != null) {
                this.aq.a(var1);
            }

            if (this.touch4Status == 2) {
                this.a(var1);
            }

        }
    }

    public final void e() {
        if (GlobalStatus.m != null && GlobalStatus.m.length() > 0) {
            this.h(GlobalStatus.m);
        } else {
            if (GlobalStatus.W != null) {
                this.h(GlobalStatus.W[(this.selectActorRow << 1) + this.selectActorClo]);
            }

        }
    }

    public final void f() {
        if (GlobalStatus.m != null && GlobalStatus.m.length() > 0) {
            this.i(GlobalStatus.m);
        } else {
            if (e == null && GlobalStatus.W != null) {
                this.i(GlobalStatus.W[(this.selectActorRow << 1) + this.selectActorClo]);
            }

        }
    }

    private void A() {
        if (e != null) {
            e.b();
            e = null;
            if (GlobalConfig.o && this.touchController != null) {
                Object var1 = null;
                this.touchController.a = (ao_1) var1;
            }
        }

    }

    public final Frame1 a(Frame1 var1, byte var2, byte var3, byte var4, byte var5, boolean var6) {
        GlobalConfig.sbTemp.delete(0, GlobalConfig.sbTemp.length());
        GlobalConfig.sbTemp.append("f").append(GlobalConfig.V[var2]).append(GlobalConfig.W[var3]).append(var5).append(GlobalConfig.X[3]).append(var6 ? 1 : 2);
        String var8 = GlobalConfig.sbTemp.toString();
        ab.d(var8);
        if ((var1 = ab.b(var8)) != null) {
            var1 = var1.b();
        }

        return var1;
    }

    public final void b(int var1) {
        this.w();
        this.actorList = new int[6][4];
        LoadingPage.l = 0;
        LoadingPage.h = 0;
        LoadingPage.o = 0;
        this.touch4Status = 0;
        this.touchAction = 0;
        this.b = 0;
        GlobalStatus.O();
        this.A();
        if (var1 <= 0 && this.k != 6) {
            this.bx = null;
            this.by = null;
            this.bB = 45;
            this.C();
        } else {
            this.bx = new Frame1[var1];
            this.by = new Frame1[var1];

            for (int var2 = 0; var2 < var1; ++var2) {
                this.bx[var2] = this.a(this.bx[var2], GlobalStatus.Z[var2], GlobalStatus.Y[var2], (byte) 3, (byte) 1, false);
                this.by[var2] = this.a(this.by[var2], GlobalStatus.Z[var2], GlobalStatus.Y[var2], (byte) 3, (byte) 1, true);
            }

            this.bB = 55;
            this.selectActorClo = 0;
            this.selectActorRow = 0;
            this.aq.b();
            this.aq.a("角色列表");
            this.aq.a((this.bB << 1) + 6);
            this.at.b(this.f(0), GlobalConfig.i, (byte) 1);
            this.at.a((byte) 1);
            this.aq.a((al) this.at);
            if (GlobalConfig.defaultHigh > 220) {
                this.au.a(new String[]{"进入游戏", ""});
                this.aq.a((al) this.au);
            }

            this.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
            this.w();
            this.k = this.touchPageCase = 5;
        }
    }

    private String f(int var1) {
        if (GlobalStatus.aa != null && var1 < GlobalStatus.aa.length) {
            GlobalConfig.clearStr(this.l);
            this.l.append("昵称：" + GlobalStatus.aa[var1] + '\t');
            if (GlobalConfig.channel == 0) {
                this.l.append("ID：" + GlobalStatus.W[var1] + '\t');
            }

            this.l.append("等级：" + GlobalStatus.X[var1] + '\t');
            this.au.a(new String[]{"进入游戏", ""});
            return this.l.toString();
        } else {
            this.au.a(new String[]{"创 建", ""});
            return "创建角色";
        }
    }

    private void B() {
        if (this.touch4Status == 0) {
            if (this.aq != null) {
                this.aq.b(this.touchAction);
            }

            if (this.touchAction != 1 && this.touchAction != 514) {
                if (this.touchAction != 4 && this.touchAction != 520) {
                    if (this.touchAction != 8 && this.touchAction != 516) {
                        if (this.touchAction != 2 && this.touchAction != 518) {
                            if (this.touchAction == 268435456) {
                                if (GlobalStatus.W != null && (this.selectActorRow << 1) + this.selectActorClo < GlobalStatus.W.length) {
                                    this.g(GlobalStatus.W[(this.selectActorRow << 1) + this.selectActorClo]);
                                } else {
                                    this.C();
                                }
                            } else if (this.touchAction != 1073741824 && this.touchAction != 517) {
                                if (this.touchAction == 536870912) {
                                    this.c();
                                }
                            } else if (GlobalStatus.W != null && (this.selectActorRow << 1) + this.selectActorClo < GlobalStatus.W.length) {
                                if (GlobalStatus.W.length >= 4) {
                                    String[] var1 = new String[]{"进入", "删除"};
                                    LoadingPage.a(this.actorList[(this.selectActorRow << 1) + this.selectActorClo][0] + this.bB / 2, this.actorList[(this.selectActorRow << 1) + this.selectActorClo][1] + this.bB / 2, var1, false);
                                    this.touch4Status = 1;
                                } else {
                                    this.g(GlobalStatus.W[(this.selectActorRow << 1) + this.selectActorClo]);
                                }
                            } else {
                                this.C();
                            }
                        } else {
                            this.selectActorClo = (byte) (this.selectActorClo >= 1 ? 0 : this.selectActorClo + 1);
                            this.at.b(this.f((this.selectActorRow << 1) + this.selectActorClo), GlobalConfig.i, (byte) 1);
                        }
                    } else {
                        this.selectActorClo = (byte) (this.selectActorClo <= 0 ? 1 : this.selectActorClo - 1);
                        this.at.b(this.f((this.selectActorRow << 1) + this.selectActorClo), GlobalConfig.i, (byte) 1);
                    }
                } else {
                    this.selectActorRow = (byte) (this.selectActorRow >= 1 ? 0 : this.selectActorRow + 1);
                    this.at.b(this.f((this.selectActorRow << 1) + this.selectActorClo), GlobalConfig.i, (byte) 1);
                }
            } else {
                this.selectActorRow = (byte) (this.selectActorRow <= 0 ? 1 : this.selectActorRow - 1);
                this.at.b(this.f((this.selectActorRow << 1) + this.selectActorClo), GlobalConfig.i, (byte) 1);
            }

            if (this.bx != null) {
                for (int var2 = 0; var2 < this.bx.length; ++var2) {
                    PngUtil.a(this.bx[var2], this.ak);
                }
            }

            if (this.by != null) {
                for (int var3 = 0; var3 < this.by.length; ++var3) {
                    PngUtil.a(this.by[var3], this.ak);
                }
            }

            this.touchAction = 0;
        } else if (this.touch4Status != 1) {
            if (this.touch4Status == 2) {
                if (this.touchAction == 268435456) {
                    this.a((String) "输入“OK” 删除角色", (int) 0);
                    this.touch4Status = 0;
                } else if (this.touchAction == 536870912) {
                    this.touch4Status = 1;
                }

                this.touchAction = 0;
            }

        } else {
            LoadingPage.b(this.touchAction);
            if (this.touchAction != 268435456 && this.touchAction != 1073741824 && this.touchAction != 517) {
                if (this.touchAction == 536870912) {
                    this.b(GlobalStatus.W.length);
                    this.touch4Status = 0;
                }
            } else if (LoadingPage.o == 0) {
                this.g(GlobalStatus.W[(this.selectActorRow << 1) + this.selectActorClo]);
            } else if (LoadingPage.o == 1) {
                this.aw = (this.selectActorRow << 1) + this.selectActorClo;
                this.touch4Status = 2;
            }

            this.touchAction = 0;
        }
    }

    private void a(int var1, int var2, int var3, int var4, int var5) {
        if (this.actorList != null && this.actorList.length > var1) {
            this.actorList[var1][0] = var2;
            this.actorList[var1][1] = var3;
            this.actorList[var1][2] = var4;
            this.actorList[var1][3] = var5;
        }

    }

    private void f(Graphics var1) {
        this.c(var1);
        if (this.aq != null) {
            this.aq.a(var1);
            LoadingPage.a(var1, this.aq.a + 5, this.aq.b + 32, this.aq.c - 11, this.aq.a((this.bB << 1) + 6), 1);
            int var2 = (this.aq.c - (this.bB << 1) - 16) / 3;
            int var3 = (this.aq.a(GlobalConfig.realHigh <= 240 ? (this.bB << 1) + 6 : 111) - (this.bB << 1) - 6) / 3;

            for (int var4 = 0; var4 < 2; ++var4) {
                for (int var5 = 0; var5 < 2; ++var5) {
                    this.a((var4 << 1) + var5, this.aq.a + 8 + var2 + (var2 + this.bB) * var5, this.aq.b + 35 + var3 + (var3 + this.bB) * var4, this.bB, this.bB);
                    LoadingPage.a(var1, (Image) null, this.actorList[(var4 << 1) + var5][0], this.actorList[(var4 << 1) + var5][1], this.bB, this.bB, var4 == this.selectActorRow && var5 == this.selectActorClo);
                }
            }

            if (this.bx != null && GlobalStatus.aa != null && GlobalStatus.aa.length > 0) {
                for (int var6 = 0; var6 < GlobalStatus.aa.length; ++var6) {
                    if (this.bx[var6] != null && var6 == (this.selectActorRow << 1) + this.selectActorClo) {
                        if (GlobalStatus.Z[var6] == 0) {
                            if (GlobalStatus.Y[var6] == 0) {
                                f.a(var1, (Frame1) this.bx[var6], (int[]) null, 0, 0, this.actorList[var6][0] + 40 + 6, this.actorList[var6][1] + 45 + 1, 20, 0);
                            } else {
                                f.a(var1, (Frame1) this.bx[var6], (int[]) null, 0, 0, this.actorList[var6][0] + 40 + 9, this.actorList[var6][1] + 45 + 16, 20, 0);
                            }
                        } else if (GlobalStatus.Z[var6] == 1) {
                            if (GlobalStatus.Y[var6] == 0) {
                                f.a(var1, (Frame1) this.bx[var6], (int[]) null, 0, 0, this.actorList[var6][0] + 40 + 8, this.actorList[var6][1] + 45 + 14, 20, 0);
                            } else {
                                f.a(var1, (Frame1) this.bx[var6], (int[]) null, 0, 0, this.actorList[var6][0] + 40 - 1, this.actorList[var6][1] + 45 + 9, 20, 0);
                            }
                        } else if (GlobalStatus.Y[var6] == 0) {
                            f.a(var1, (Frame1) this.bx[var6], (int[]) null, 0, 0, this.actorList[var6][0] + 40 - 9, this.actorList[var6][1] + 45 + 10, 20, 0);
                        } else {
                            f.a(var1, (Frame1) this.bx[var6], (int[]) null, 0, 0, this.actorList[var6][0] + 40 - 3, this.actorList[var6][1] + 45 + 12, 20, 0);
                        }
                    } else if (this.by != null && var6 != (this.selectActorRow << 1) + this.selectActorClo) {
                        f.a(var1, (Frame1) this.by[var6], (int[]) null, 0, 0, this.actorList[var6][0] + 40 - 18, this.actorList[var6][1] + 45, 20, 0);
                    }
                }
            }
        }

        if (this.touch4Status == 1) {
            LoadingPage.c(var1);
        } else {
            if (this.touch4Status == 2) {
                LoadingPage.a(var1, "确认删除？", new String[]{"确认", "返回"});
            }

        }
    }

    private void g(String var1) {
        byte[] var2;
        if ((var2 = NetPayloadBuilder.c((short) 4250, var1)) != null) {
            NetPacket var3 = new NetPacket((short) 4250, var2);
            netUtils.sendPacket(var3);
            this.a((String) null);
        } else {
            this.b("获取上传指令数据错误!");
        }
    }

    private void h(String var1) {
        byte[] var2;
        if ((var2 = NetPayloadBuilder.c((short) 4251, var1)) != null) {
            NetPacket var3 = new NetPacket((short) 4251, var2);
            netUtils.sendPacket(var3);
            this.a((String) null);
        } else {
            this.b("获取上传指令数据错误!");
        }
    }

    private void i(String var1) {
        GlobalStatus.gQ = 1;
        byte[] var2;
        if ((var2 = NetPayloadBuilder.b((short) 4103, var1)) != null) {
            NetPacket var3 = new NetPacket((short) 4103, var2);
            netUtils.sendPacket(var3);
            this.a((String) null);
        } else {
            this.b("获取上传指令数据错误!");
        }
    }

    private void C() {
        this.w();
        this.bD = k("/images/logo_btn_random.png");
        this.bx = new Frame1[6];

        for (int var1 = 0; var1 < this.bx.length; ++var1) {
            this.bx[var1] = this.a(this.bx[var1], (byte) (var1 % 3), (byte) (var1 < 3 ? 0 : 1), (byte) 3, (byte) 1, false);
        }

        this.bB = 35;
        this.bG = 0;
        this.bE = 0;
        this.bF = 0;
        this.aq.b();
        this.aq.a("创建角色");
        this.aq.a(GlobalConfig.realHigh <= 240 ? this.bB * 3 + 6 : 150);
        this.at.b(GlobalConfig.H[0], GlobalConfig.i, (byte) 1);
        this.at.a((byte) 1);
        this.au.a(new String[]{"创 建", ""});
        this.aq.a((al) this.at);
        if (GlobalConfig.defaultHigh > 220) {
            this.aq.a((al) this.au);
        }

        this.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
        this.touchAction = 0;
        this.b = 0;
        this.k = this.touchPageCase = 6;
    }

    public final void b(String var1, String var2) {
        this.D();
        if (var1 != null) {
            this.bS = new StringItem(var1, var2);
        }

        this.aD = new Form("角色昵称");
        this.aC = new TextField("角色昵称", (String) null, 5, 0);
        this.bQ = new Command("返回", 8, 1);
        this.bP = new Command("确定", 2, 1);
        this.aD.addCommand(this.bP);
        this.aD.addCommand(this.bQ);
        this.aD.append(this.aC);
        if (var1 != null) {
            this.aD.append(this.bS);
        }

        this.aD.setCommandListener(this);
        this.q.setCurrent(this.aD);
    }

    private void D() {
        if (this.aD != null) {
            this.aD.deleteAll();
        }

        this.bS = null;
        this.bP = null;
        this.bQ = null;
        this.aC = null;
        this.aD = null;
    }

    public final void g() {
        this.x();
        this.h();
        e = new ao_1(this, f);
        if (this.touchController != null) {
            ao_1 var2 = e;
            this.touchController.a = var2;
        }

        e.c("欢迎来到<梦回西游>世界");
        this.k = this.touchPageCase = 7;
    }

    public final void h() {
        GlobalStatus.e();
        GlobalConfig.clearStr(this.l);
        if (this.bx != null) {
            for (int var1 = 0; var1 < this.bx.length; ++var1) {
                if (this.bx[var1] != null) {
                    this.bx[var1] = null;
                }
            }

            this.bx = null;
        }

        if (this.by != null) {
            for (int var2 = 0; var2 < this.by.length; ++var2) {
                if (this.by[var2] != null) {
                    this.by[var2] = null;
                }
            }

            this.by = null;
        }

    }

    public final void i() {
        short var1 = e.l;
        e.l = 0;
        e.m = 0;
        if (e.g != null && (e.g.d != 2 || e.g.e != 2)) {
            e.g.d = 0;
            e.g.f = e.g.f == -1 ? (e.g.f = 0) : e.g.f;
        }

        if (this.az && ao_1.i()) {
            e.a(e.bb);
        } else if (e.k == 18) {
            e.l = 1;
            e.k = e.j;
        } else if (e.k == 13) {
            if (var1 == 6) {
                e.k(e.aE);
            } else if (var1 == 7) {
                e.l = var1;
            } else if (var1 == 8) {
                e.l = var1;
            } else {
                e.j(e.as);
            }
        } else if (e.k == 2) {
            if (var1 == 1) {
                e.l = 1;
            } else {
                e.m();
            }
        } else if (e.k == 42) {
            e.M.a(e.aE);
        } else if (e.k == 48) {
            if (var1 == 2) {
                e.l = var1;
            }
        } else if (e.k == 46) {
            if (var1 == 1) {
                e.M.a(true);
                e.M.e();
            }
        } else if (e.k == 45) {
            e.M.a(true);
        } else if (e.k == 51) {
            e.M.q();
            e.M.m();
        } else if (e.k == 52) {
            if (var1 == 0 && this.as.a == 1) {
                e.M.t();
            } else if (var1 == 2 && LoadingPage.o == 1) {
                e.M.q(1);
            }
        } else if (e.k == 70 && !GlobalStatus.kT) {
            if (GlobalStatus.kP == 2) {
                var1 = (byte) e.aq;
                byte var2 = (byte) e.ar;
                e.e(e.as);
                e.aq = var1;
                e.ar = var2;
                e.q();
            }

            if (GlobalStatus.kP == 0 || GlobalStatus.kP == 1) {
                e.m();
            }

            if (GlobalStatus.kP == 3) {
                e.N();
            }
        } else if (e.k == 1) {
            e.l = var1;
        } else if (e.k == 104) {
            e.l = var1;
        } else if (e.k == 115) {
            e.l = var1;
        } else if (e.k == 126) {
            e.l = var1;
        } else if (e.k == 128) {
            e.l = var1;
        } else if (e.k == 130) {
            e.l = var1;
        } else if (e.j == 4 && e.as == 7) {
            e.t();
        } else if (e.j == 14) {
            if (e.k != 14) {
                e.H();
            }
        } else if (e.j != 32) {
            e.k = e.j;
        }

        this.k = this.touchPageCase = 7;
    }

    private void E() {
        try {
            if (e != null) {
                e.a();
                if (e.k != 0) {
                    this.touchAction = 0;
                }

            }
        } catch (Exception var2) {
            ((Throwable) var2).printStackTrace();
            this.a((Exception) var2, (byte) 4);
        }
    }

    private void F() {
        if (GlobalStatus.b != null && GlobalStatus.c != null) {
            ByteArrayOutputStream var1 = new ByteArrayOutputStream();
            DataOutputStream var2 = new DataOutputStream(var1);

            try {
                var2.writeUTF(GlobalStatus.b == null ? "" : GlobalStatus.b);
                var2.writeUTF(GlobalStatus.c == null ? "" : GlobalStatus.c);
                this.a(var1.toByteArray(), this.aK);
                var1.close();
                var2.close();
            } catch (IOException var3) {
            } catch (Exception var4) {
            }
        }
    }

    public final void j() {
        ByteArrayOutputStream var1 = new ByteArrayOutputStream();
        DataOutputStream var2 = new DataOutputStream(var1);

        try {
            for (int var3 = 0; var3 < ao_1.aW.length; ++var3) {
                if (var3 != 15) {
                    var2.writeByte(ao_1.aW[var3]);
                }
            }

            this.a(var1.toByteArray(), GlobalStatus.ad);
            var1.close();
            var2.close();
        } catch (IOException var4) {
        }
    }

    public final void k() {
        if (j(GlobalStatus.ad)) {
            RecordStore var15 = null;

            try {
                DataInputStream var1 = a(var15 = a(GlobalStatus.ad, false));

                for (int var2 = 0; var2 < ao_1.aW.length; ++var2) {
                    if (var2 != 15) {
                        ao_1.aW[var2] = var1.readByte();
                    }
                }
            } catch (Exception var13) {
                return;
            } finally {
                if (var15 != null) {
                    try {
                        var15.closeRecordStore();
                    } catch (RecordStoreNotOpenException var11) {
                    } catch (RecordStoreException var12) {
                    }
                }

            }

        }
    }

    private static DataInputStream a(RecordStore var0) throws RecordStoreException {
        Object var1 = null;
        if (1 < var0.getNumRecords() + 1) {
            byte[] var2 = var0.getRecord(1);
            return new DataInputStream(new ByteArrayInputStream(var2));
        } else {
            return null;
        }
    }

    private static boolean j(String var0) {
        String[] var1;
        if ((var1 = RecordStore.listRecordStores()) == null) {
            return false;
        } else {
            for (int var2 = var1.length - 1; var2 >= 0; --var2) {
                if (var1[var2].equals(var0)) {
                    return true;
                }
            }

            return false;
        }
    }

    private static RecordStore a(String var0, boolean var1) throws RecordStoreException {
        Object var2 = null;
        if (var1) {
            RecordStore.deleteRecordStore(var0);
            return RecordStore.openRecordStore(var0, var1);
        } else {
            return RecordStore.openRecordStore(var0, !var1);
        }
    }

    private void a(byte[] var1, String var2) {
        RecordStore var21 = null;
        boolean var3 = j(var2);
        boolean var12 = false;

        label97:
        {
            try {
                var12 = true;
                (var21 = a(var2, var3)).addRecord(var1, 0, var1.length);
                var12 = false;
                break label97;
            } catch (RecordStoreException var19) {
                ((Throwable) var19).printStackTrace();
                var12 = false;
            } finally {
                if (var12) {
                    if (var21 != null) {
                        try {
                            var21.closeRecordStore();
                        } catch (RecordStoreNotOpenException var13) {
                        } catch (RecordStoreException var14) {
                        }
                    }

                }
            }

            if (var21 != null) {
                try {
                    var21.closeRecordStore();
                    return;
                } catch (RecordStoreNotOpenException var15) {
                    return;
                } catch (RecordStoreException var16) {
                    return;
                }
            }

            return;
        }

        if (var21 != null) {
            try {
                var21.closeRecordStore();
            } catch (RecordStoreNotOpenException var17) {
            } catch (RecordStoreException var18) {
            }
        }
    }

    protected void keyPressed(int code) {
        int var10001 = this.touchAction;
        int var4 = 0;
        switch (code) {
            case -22:
            case -11:
            case -7:
                var4 = 536870912;
                break;
            case -21:
            case -6:
                var4 = 268435456;
                break;
            case 35:
                var4 = 2048;
                break;
            case 42:
                var4 = 1024;
                break;
            case 48:
                var4 = 48;
                break;
            case 49:
                var4 = 513;
                break;
            case 50:
                var4 = 514;
                break;
            case 51:
                var4 = 515;
                break;
            case 52:
                var4 = 516;
                break;
            case 53:
                var4 = 517;
                break;
            case 54:
                var4 = 518;
                break;
            case 55:
                var4 = 519;
                break;
            case 56:
                var4 = 520;
                break;
            case 57:
                var4 = 521;
                break;
            default:
                switch (((Canvas) this).getGameAction(code)) {
                    case 1:
                        var4 = 1;
                        break;
                    case 2:
                        var4 = 8;
                    case 3:
                    case 4:
                    case 7:
                    default:
                        break;
                    case 5:
                        var4 = 2;
                        break;
                    case 6:
                        var4 = 4;
                        break;
                    case 8:
                        var4 = 1073741824;
                }
        }

        this.touchAction = var10001 | var4;
        if (this.bI == this.touchAction && System.currentTimeMillis() - this.bJ <= 600L) {
            if (e != null && e.k == 0) {
                if (this.bI != 1 && this.bI != 514) {
                    if (this.bI != 8 && this.bI != 516) {
                        if (this.bI != 4 && this.bI != 520) {
                            if (this.bI != 2 && this.bI != 518) {
                                e.d = -1;
                            } else {
                                e.d = 2;
                            }
                        } else {
                            e.d = 3;
                        }
                    } else {
                        e.d = 0;
                    }
                } else {
                    e.d = 1;
                }
            }
        } else {
            if (e != null) {
                e.d = -1;
            }

            this.bI = this.touchAction;
        }

        this.bJ = System.currentTimeMillis();
        var10001 = this.b;
        var4 = 0;
        label58:
        switch (((Canvas) this).getGameAction(code)) {
            case 1:
                var4 = 1;
                break;
            case 2:
                var4 = 8;
                break;
            case 3:
            case 4:
            case 7:
            case 8:
            default:
                switch (code) {
                    case 50:
                        var4 = 514;
                        break label58;
                    case 51:
                    case 53:
                    case 55:
                    default:
                        var4 = 0;
                        break label58;
                    case 52:
                        var4 = 516;
                        break label58;
                    case 54:
                        var4 = 518;
                        break label58;
                    case 56:
                        var4 = 520;
                        break label58;
                }
            case 5:
                var4 = 2;
                break;
            case 6:
                var4 = 4;
        }

        this.b = var10001 | var4;
        this.tempTouchStatus = 0;
    }

    protected void keyReleased(int code) {
        this.touchAction = 0;
        this.b = 0;
        this.tempTouchStatus = 0;
    }

    private void G() {
        this.aJ = false;
        this.x();
    }

    private void H() {
        this.aD = null;
        this.bP = null;
        this.bP = null;
        this.aC = null;
        this.bX = null;
    }

    public final void a(String var1, int var2) {
        this.aD = new Form(var1);
        if (var2 == 2) {
            this.aC = new TextField(var1, (String) null, 9, var2);
        } else if (var1.equals("聊天")) {
            if (e.k == 18) {
                if (e.aR) {
                    this.aC = new TextField("与" + e.aQ + "私聊", (String) null, 30, var2);
                } else {
                    this.aC = new TextField(GlobalConfig.E[e.aT], (String) null, 30, var2);
                }
            } else if (e.k == 7) {
                if (this.as.a < 3) {
                    this.aC = new TextField("与" + GlobalStatus.gJ[this.ar.g()] + "私聊", (String) null, 30, var2);
                } else if (GlobalStatus.bs == 1) {
                    if (LoadingPage.o == 3) {
                        this.aC = new TextField("群聊", (String) null, 30, var2);
                    } else if (LoadingPage.o == 4) {
                        this.aC = new TextField("与" + GlobalStatus.q[this.ar.g()].e + "私聊", (String) null, 30, var2);
                    }
                } else if (GlobalStatus.bs == 0) {
                    if (LoadingPage.o == 0) {
                        this.aC = new TextField("群聊", (String) null, 30, var2);
                    } else if (LoadingPage.o == 1) {
                        this.aC = new TextField("与" + GlobalStatus.q[this.ar.g()].e + "私聊", (String) null, 30, var2);
                    }
                }
            } else if (e.k == 19) {
                this.aC = new TextField("与" + GlobalStatus.dL[this.ar.g() - 1] + "私聊", (String) null, 30, var2);
            } else if (e.k == 47) {
                this.aC = new TextField("与" + GlobalStatus.iz[this.ar.g()] + "私聊", (String) null, 30, var2);
            } else {
                this.aC = new TextField("聊天", (String) null, 30, var2);
            }
        } else if (!var1.equals("输入帮派宗旨") && !var1.equals("输入帮派新宗旨") && !var1.equals("输入公告")) {
            if (var1.equals("输入帮派名称")) {
                this.aC = new TextField(var1, (String) null, 6, var2);
            } else if (var1.equals("请输入要搜索的帮派名称")) {
                this.aC = new TextField(var1, (String) null, 6, var2);
            } else if (var1.equals("请输入警告语（30个字符内）")) {
                this.aC = new TextField(var1, (String) null, 30, var2);
            } else if (var1.equals("输入兑换码")) {
                this.aC = new TextField(var1, (String) null, 30, var2);
            } else {
                this.aC = new TextField(var1, (String) null, 5, var2);
            }
        } else {
            this.aC = new TextField(var1, (String) null, 100, var2);
        }

        this.bQ = new Command("返回", 8, 1);
        this.bP = new Command("确定", 2, 1);
        if (var1.equals("聊天")) {
            this.bR = new Command("表情", 8, 1);
            this.aD.addCommand(this.bR);
        }

        this.aD.addCommand(this.bP);
        this.aD.addCommand(this.bQ);
        this.aD.append(this.aC);
        this.aD.setCommandListener(this);
        this.q.setCurrent(this.aD);
        if (var1.equals("聊天")) {
            a(this.aC, this.bZ);
        }

    }

    public static void a(TextField var0, String var1) {
        try {
            if (var1 != null && var0.getMaxSize() > var1.length()) {
                var0.setString(var1);
            }

        } catch (Exception var2) {
            var0.setString("");
        }
    }

    public final void a(String var1, String var2, String var3, String var4) {
        this.aD = new Form("邮件举报");
        this.aC = new TextField("举报理由: ", "", 100, 0);
        this.bS = new StringItem("举报邮件：", "");
        this.bT = new StringItem("发件人：", var2);
        this.bU = new StringItem("标    题：", var3);
        this.bV = new StringItem("正    文：", var4);
        this.bW = var1;
        this.bP = new Command("举报", 3, 0);
        this.bQ = new Command("返回", 1, 5);
        this.aD.addCommand(this.bP);
        this.aD.addCommand(this.bQ);
        this.aD.append(this.aC);
        this.aD.append(this.bS);
        this.aD.append(this.bT);
        this.aD.append(this.bU);
        this.aD.append(this.bV);
        this.q.setCurrent(this.aD);
        this.aD.setCommandListener(this);
        this.q.setCurrent(this.aD);
    }

    public final void l() {
        this.aD = new Form("联系客服");
        this.bX = new ChoiceGroup("类型: ", 1, ag_1.a, (Image[]) null);
        this.aC = new TextField("内容: ", "", 100, 0);
        this.bP = new Command("确定", 3, 0);
        this.bQ = new Command("返回", 1, 5);
        this.aD.addCommand(this.bP);
        this.aD.addCommand(this.bQ);
        this.aD.append(this.aC);
        this.aD.append(this.bX);
        this.q.setCurrent(this.aD);
        this.aD.setCommandListener(this);
    }

    public final void a(byte _t, String var2, String var3, String var4, String var5, String var6, String var7) {
        this.bY = 0;
        GlobalStatus.O.q = var6;
        GlobalStatus.O.r = var7;
        boolean var1 = var2.equals("回复邮件");
        if (this.bY == 0) {
            this.aD = new Form(var2);
            if (!var1) {
                this.bL = new TextField("收件人: ", var4, 10, 0);
            } else {
                this.bU = new StringItem("收件人: ", var4);
            }

            this.aC = new TextField("标    题: ", var3, 10, 0);
            this.bM = new TextField("正    文: ", var5, 100, 0);
            this.bP = new Command("发送", 3, 0);
            this.bQ = new Command("返回", 1, 5);
            if (!var1) {
                this.bR = new Command("选择收件人", 1, 5);
            }

            this.bS = new StringItem("温馨提示", "★请保护好个人帐号，勿在邮件内容中泄漏任何与财产相关的信息，后果需自负。");
            this.bT = new StringItem((String) null, "★官方与玩家联系使用系统邮件形式，慎访私人邮件冒用官方名义行骗。");
            this.aD.addCommand(this.bP);
            if (!var1) {
                this.aD.addCommand(this.bR);
            }

            this.aD.addCommand(this.bQ);
            this.aD.append(this.aC);
            if (!var1) {
                this.aD.append(this.bL);
            } else {
                this.aD.append(this.bU);
            }

            this.aD.append(this.bM);
            this.aD.append(this.bS);
            this.aD.append(this.bT);
            this.aD.setCommandListener(this);
            this.q.setCurrent(this.aD);
        }

    }

    public final void d(String var1) {
        this.aD = new Form(var1);
        this.aE = new ChoiceGroup("", 1, new String[]{"世界聊", "区域聊", "队伍聊", "帮派聊", "跨服聊"}, (Image[]) null);
        this.aE.setSelectedIndex(1, true);
        this.aC = new TextField(var1, (String) null, 30, 0);
        this.bQ = new Command("返回", 8, 1);
        this.bR = new Command("表情", 8, 1);
        this.bP = new Command("确定", 2, 1);
        this.aD.addCommand(this.bP);
        this.aD.addCommand(this.bR);
        this.aD.addCommand(this.bQ);
        this.aD.append(this.aC);
        this.aD.append(this.aE);
        this.aD.setCommandListener(this);
        this.q.setCurrent(this.aD);
        a(this.aC, this.bZ);
    }

    public final void e(String var1) {
        this.aD = new Form(var1);
        this.bP = new Command("确定", 4, 2);
        this.bQ = new Command("返回", 2, 1);
        this.aD.addCommand(this.bQ);
        this.aD.addCommand(this.bP);
        this.aD.setCommandListener(this);
        this.aC = new TextField("请输入搜索关键字:", "", 10, 0);
        this.aD.append(this.aC);
        this.q.setCurrent(this.aD);
    }

    public final void f(String var1) {
        this.aD = new Form(var1);
        this.bP = new Command("更改", 4, 2);
        this.bQ = new Command("返回", 2, 1);
        this.aD.addCommand(this.bQ);
        this.aD.addCommand(this.bP);
        this.aD.setCommandListener(this);
        this.aC = new TextField("新名称:", "", 5, 0);
        this.aD.append(this.aC);
        this.q.setCurrent(this.aD);
        this.h = false;
    }

    public final void m() {
        if (this.aD != null) {
            this.aD.removeCommand(this.bP);
            this.aD.removeCommand(this.bQ);
            this.aD.deleteAll();
        }

        this.bP = null;
        this.bQ = null;
        this.aC = null;
        this.aD = null;
        this.h = false;
    }

    public final void n() {
        if (this.aC != null && this.aC.getString() != null) {
            this.bZ = this.aC.getString();
        }

        if (this.aD != null) {
            this.aD.removeCommand(this.bP);
            this.aD.removeCommand(this.bQ);
            this.aD.deleteAll();
        }

        if (this.aE != null) {
            this.aE.deleteAll();
        }

        this.aE = null;
        this.bP = null;
        this.bQ = null;
        this.aC = null;
        this.aD = null;
    }

    public final void o() {
        if (this.aD != null) {
            this.aD.removeCommand(this.bP);
            this.aD.removeCommand(this.bQ);
            this.aD.deleteAll();
        }

        this.bP = null;
        this.bQ = null;
        this.aC = null;
        this.aD = null;
    }

    private void I() {
        if (this.aD != null) {
            this.aD.removeCommand(this.bP);
            this.aD.removeCommand(this.bQ);
            this.aD.deleteAll();
        }

        this.bP = null;
        this.bQ = null;
        this.aD = null;
    }

    public final void commandAction(Command var1, Displayable var2) {
        if (this.aD != null) {
            String var51;
            if (!(var51 = this.aD.getTitle()).equals("登录当乐通行证") && !var51.equals("登录一哥哥通行证")) {
                if (var51.equals("登陆游戏")) {
                    String var50;
                    if (!(var50 = var1.getLabel()).equals("登陆")) {
                        if (var50.equals("返回")) {
                            this.c();
                            this.touchAction = 0;
                            this.b = 0;
                            this.mainMidlet.start();
                        }

                        return;
                    }

                    if (!this.bN.getString().equals("") && !this.bO.getString().equals("")) {
                        this.aZ = true;
                        this.mainMidlet.start();
                    } else if (this.bN.getString().equals("")) {
                        this.b("帐号不能为空!");
                    } else {
                        if (!this.bO.getString().equals("")) {
                            return;
                        }

                        this.b("密码不能为空!");
                    }
                } else if (var51.equals("角色昵称")) {
                    String var49;
                    if (!(var49 = var1.getLabel()).equals("确定")) {
                        if (var49.equals("返回")) {
                            this.touchAction = 0;
                            this.b = 0;
                            this.mainMidlet.start();
                        }

                        return;
                    }

                    if (!this.aC.getString().equals("")) {
                        this.ay = this.aC.getString().trim();
                        this.D();
                        this.mainMidlet.start();
                    } else {
                        this.b("昵称不能为空！");
                    }
                } else if (var51.equals("聊天")) {
                    String var48;
                    if ((var48 = var1.getLabel()).equals("确定")) {
                        if (this.aC.getString() == null || this.aC.getString().equals("")) {
                            this.mainMidlet.start();
                            this.b("不能发送空消息");
                            return;
                        }

                        if (e.j == 1) {
                            e.j = e.k = 0;
                        } else {
                            e.k = e.j;
                        }

                        this.touchAction = 0;
                        this.b = 0;
                        this.mainMidlet.start();
                        if (e.k == 0) {
                            f.a(e.f, ao_1.h, ao_1.i, true, false, 1009050);
                        }

                        this.g = true;
                    } else {
                        if (!var48.equals("返回")) {
                            if (var48.equals("表情")) {
                                e.L();
                                this.mainMidlet.start();
                            }

                            return;
                        }

                        this.n();
                        if (e.j == 1) {
                            e.j = 0;
                            e.k = 0;
                        } else {
                            e.k = e.j;
                        }

                        this.touchAction = 0;
                        this.b = 0;
                        this.mainMidlet.start();
                        if (e.k != 0) {
                            return;
                        }

                        f.a(e.f, ao_1.h, ao_1.i, true, false, 1009050);
                    }
                } else if (var51.equals("物品关键字搜索")) {
                    String var47 = var1.getLabel();
                    String var78 = this.aC.getString();
                    if (!var47.equals("确定") || var78 == null) {
                        if (var47.equals("返回")) {
                            this.aD = null;
                            this.aC = null;
                            this.touchAction = 0;
                            this.b = 0;
                            this.mainMidlet.start();
                        }

                        return;
                    }

                    e.aU = this.ar.g();
                    e.aK = var78;
                    e.aL = "";
                    e.aM = 1;
                    e.aN = 0;
                    e.a(e.aK, e.aL, e.aM, e.aN);
                    this.mainMidlet.start();
                    this.a((String) null);
                } else if (var51.equals("宠物关键字搜索")) {
                    String var46 = var1.getLabel();
                    String var77 = this.aC.getString();
                    if (!var46.equals("确定") || var77 == null) {
                        if (var46.equals("返回")) {
                            this.aD = null;
                            this.aC = null;
                            this.touchAction = 0;
                            this.b = 0;
                            this.mainMidlet.start();
                        }

                        return;
                    }

                    e.aU = this.ar.g();
                    e.aK = var77;
                    e.aL = "";
                    e.aM = 1;
                    e.aN = 0;
                    e.b(e.aK, e.aL, e.aM, e.aN);
                    this.mainMidlet.start();
                    this.a((String) null);
                } else if (var51.equals("宠物名称")) {
                    String var45 = var1.getLabel();
                    String var76 = this.aC.getString();
                    if (!var45.equals("更改") || var76 == null) {
                        if (var45.equals("返回")) {
                            this.mainMidlet.start();
                            this.m();
                        }

                        return;
                    }

                    if (var76.length() == 0) {
                        this.b("名称为空！");
                    } else {
                        this.h = true;
                        this.mainMidlet.start();
                    }
                } else if (var51.equals("服务地址")) {
                    String var44;
                    if (!(var44 = var1.getLabel()).equals("确定")) {
                        if (var44.equals("返回")) {
                            this.H();
                            this.y();
                            this.mainMidlet.start();
                            this.touchAction = 0;
                            this.b = 0;
                        }

                        return;
                    }

                    String var75 = this.aC.getString();
                    int var88 = this.bX.getSelectedIndex();
                    this.H();
                    this.b(var75, (byte) (var88 == 1 ? 1 : 2));
                } else if (!var51.equals("请输入拍卖价格") && !var51.equals("请输入取出银两") && !var51.equals("请输入存入银两") && !var51.equals("拍卖价格") && !var51.equals("输入交易银两") && !var51.equals("请输入决斗金额") && !var51.equals("捐献银两数量") && !var51.equals("取出银两数量") && !var51.equals("捐献经验数量") && !var51.equals("请输入决斗金额") && !var51.equals("请输入竞标银两")) {
                    if (var51.equals("输入帮派名称")) {
                        String var43 = var1.getLabel();
                        String var74 = this.aC.getString();
                        if (!var43.equals("确定") || var74 == null) {
                            if (var43.equals("返回")) {
                                Object var56 = null;
                                e.M.c = (String) var56;
                                this.I();
                                this.mainMidlet.start();
                            }

                            return;
                        }

                        if (var74.length() == 0) {
                            this.b("名字输入错误！");
                        } else {
                            e.M.c = var74;
                            this.I();
                            this.a((String) "输入帮派宗旨", (int) 0);
                        }
                    } else if (var51.equals("输入帮派宗旨")) {
                        String var41 = var1.getLabel();
                        String var73 = this.aC.getString();
                        if (!var41.equals("确定") || var73 == null) {
                            if (var41.equals("返回")) {
                                Object var54 = null;
                                e.M.c = (String) var54;
                                var54 = null;
                                e.M.d = (String) var54;
                                this.I();
                                this.mainMidlet.start();
                            }

                            return;
                        }

                        if (var73.length() == 0) {
                            this.b("请输入帮派宗旨！");
                        } else {
                            e.M.d = var73;
                            this.I();
                            aq var42;
                            if ((var42 = e.M).c != null && var42.d != null) {
                                byte[] var87;
                                if ((var87 = NetPayloadBuilder.b((short) 4197, GlobalStatus.ad, var42.c, var42.d)) != null) {
                                    NetPacket var92 = new NetPacket((short) 4197, var87);
                                    netUtils.sendPacket(var92);
                                } else {
                                    var42.a.e.b("获取上传指令数据错误!");
                                }

                                var42.a.e.a((String) null);
                            }

                            this.mainMidlet.start();
                        }
                    } else if (var51.equals("输入帮派新宗旨")) {
                        String var39 = var1.getLabel();
                        String var72 = this.aC.getString();
                        if (!var39.equals("确定") || var72 == null) {
                            if (var39.equals("返回")) {
                                Object var53 = null;
                                e.M.e = (String) var53;
                                this.I();
                                this.mainMidlet.start();
                            }

                            return;
                        }

                        if (var72.length() == 0) {
                            this.b("请输入帮派宗旨！");
                        } else {
                            e.M.e = var72;
                            this.I();
                            aq var40;
                            if ((var40 = e.M).e != null) {
                                byte[] var86;
                                if ((var86 = NetPayloadBuilder.i((short) 4216, GlobalStatus.ad, var40.e)) != null) {
                                    NetPacket var91 = new NetPacket((short) 4216, var86);
                                    netUtils.sendPacket(var91);
                                } else {
                                    var40.b.b("获取上传指令数据错误!");
                                }

                                var40.b.a((String) null);
                            }

                            this.mainMidlet.start();
                        }
                    } else if (var51.equals("输入玩家名称")) {
                        String var38 = var1.getLabel();
                        String var71 = this.aC.getString();
                        if (!var38.equals("确定") || var71 == null) {
                            if (var38.equals("返回")) {
                                this.mainMidlet.start();
                                this.I();
                            }

                            return;
                        }

                        if (var71.length() == 0) {
                            this.b("名称不能为空！");
                        } else {
                            e.M.f = var71;
                            this.I();
                            e.M.h();
                            this.mainMidlet.start();
                        }
                    } else if (var51.equals("输入招募金额")) {
                        String var37;
                        if (!(var37 = var1.getLabel()).equals("确定")) {
                            if (var37.equals("返回")) {
                                this.aD = null;
                                this.aC = null;
                                this.mainMidlet.start();
                            }

                            return;
                        }

                        if (this.aC.getString() == "") {
                            return;
                        }

                        e.o();
                        e.ak.append(this.aC.getString());
                        if (e.n() >= 0L) {
                            e.M.a(e.n());
                            e.M.a();
                            this.mainMidlet.start();
                        } else {
                            this.b("输入有误,请重新输入");
                        }
                    } else if (var51.equals("请输入贡献金额")) {
                        String var36;
                        if (!(var36 = var1.getLabel()).equals("确定")) {
                            if (var36.equals("返回")) {
                                this.aD = null;
                                this.aC = null;
                                this.mainMidlet.start();
                            }

                            return;
                        }

                        if (this.aC.getString() != "") {
                            e.o();
                            e.ak.append(this.aC.getString());
                            if (e.n() >= 0L) {
                                if (e.n() > GlobalStatus.ap) {
                                    this.b("您没有这么多银两,请重新输入！");
                                } else {
                                    e.M.k[0] = (int) (e.M.j = e.n());
                                    this.mainMidlet.start();
                                }
                            } else {
                                this.b("输入有误,请重新输入");
                            }
                        } else {
                            this.b("请输入金额");
                        }
                    } else if (var51.equals("请输入银两奖励")) {
                        String var35;
                        if (!(var35 = var1.getLabel()).equals("确定")) {
                            if (var35.equals("返回")) {
                                this.aD = null;
                                this.aC = null;
                                this.mainMidlet.start();
                            }

                            return;
                        }

                        if (this.aC.getString() != "") {
                            e.o();
                            e.ak.append(this.aC.getString());
                            if (e.n() >= 0L) {
                                if (e.n() > (long) GlobalStatus.iM[1]) {
                                    this.b("最多只能配置" + GlobalStatus.a((long) GlobalStatus.iM[1]) + ",请重新输入！");
                                } else {
                                    e.M.i[1] = GlobalStatus.iM[0] = (int) e.n();
                                    this.mainMidlet.start();
                                }
                            } else {
                                this.b("输入有误,请重新输入");
                            }
                        } else {
                            this.b("请输入银两");
                        }
                    } else if (var51.equals("请输入物品掉率")) {
                        String var34;
                        if (!(var34 = var1.getLabel()).equals("确定")) {
                            if (var34.equals("返回")) {
                                this.aD = null;
                                this.aC = null;
                                this.mainMidlet.start();
                            }

                            return;
                        }

                        if (this.aC.getString() != "") {
                            e.o();
                            e.ak.append(this.aC.getString());
                            if (e.n() >= 0L) {
                                if (e.n() > (long) GlobalStatus.iK[1]) {
                                    this.b("最多只能配置" + GlobalStatus.iK[1] + "%,请重新输入！");
                                } else {
                                    e.M.i[0] = GlobalStatus.iK[0] = (byte) ((int) e.n());
                                    this.mainMidlet.start();
                                }
                            } else {
                                this.b("输入有误,请重新输入");
                            }
                        } else {
                            this.b("请输入掉率");
                        }
                    } else if (var51.equals("请输入经验加成")) {
                        String var33;
                        if (!(var33 = var1.getLabel()).equals("确定")) {
                            if (var33.equals("返回")) {
                                this.aD = null;
                                this.aC = null;
                                this.mainMidlet.start();
                            }

                            return;
                        }

                        if (this.aC.getString() != "") {
                            e.o();
                            e.ak.append(this.aC.getString());
                            if (e.n() >= 0L) {
                                if (e.n() > (long) GlobalStatus.iL[1]) {
                                    this.b("最多只能配置" + GlobalStatus.iL[1] + "%,请重新输入！");
                                } else {
                                    e.M.i[2] = GlobalStatus.iL[0] = (byte) ((int) e.n());
                                    this.mainMidlet.start();
                                }
                            } else {
                                this.b("输入有误,请重新输入");
                            }
                        } else {
                            this.b("请输入加成");
                        }
                    } else if (var51.equals("输入公告")) {
                        String var31 = var1.getLabel();
                        String var70 = this.aC.getString();
                        if (!var31.equals("确定") || var70 == null) {
                            if (var31.equals("返回")) {
                                Object var52 = null;
                                e.M.h = (String) var52;
                                this.I();
                                this.mainMidlet.start();
                            }

                            return;
                        }

                        if (var70.length() == 0) {
                            this.b("请输入公告！");
                        } else {
                            e.M.h = var70;
                            this.I();
                            aq var32 = e.M;
                            byte[] var85;
                            if ((var85 = NetPayloadBuilder.n((short) 4218, GlobalStatus.ad, var32.h)) != null) {
                                netUtils.sendPacket(new NetPacket((short) 4218, var85));
                                var32.b.a((String) null);
                            } else {
                                var32.b.b("获取上传指令数据错误!");
                            }

                            this.mainMidlet.start();
                        }
                    } else if (var51.equals("输入“OK” 删除角色")) {
                        String var30 = var1.getLabel();
                        String var69 = this.aC.getString();
                        if (!var30.equals("确定") || var69 == null) {
                            if (var30.equals("返回")) {
                                this.aD = null;
                                this.mainMidlet.start();
                            }

                            return;
                        }

                        if (var69.equals("OK")) {
                            byte[] var84;
                            if ((var84 = NetPayloadBuilder.a((short) 4100, GlobalStatus.W[this.aw])) != null) {
                                netUtils.sendPacket(new NetPacket((short) 4100, var84));
                                this.a((String) null);
                            } else {
                                this.b("获取上传指令数据错误!");
                            }

                            this.mainMidlet.start();
                        } else {
                            this.b("请输入“OK” ！");
                        }
                    } else if (var51.equals("请输入好友昵称")) {
                        String var29;
                        if (!(var29 = var1.getLabel()).equals("确定")) {
                            if (var29.equals("返回")) {
                                this.aD = null;
                                this.aC = null;
                                this.touchAction = 0;
                                this.b = 0;
                                this.mainMidlet.start();
                            }

                            return;
                        }

                        if (this.aC.getString().equals("")) {
                            this.b("昵称不能为空！");
                        } else {
                            e.a(this.aC.getString(), true);
                            this.touchAction = 0;
                            this.b = 0;
                            this.mainMidlet.start();
                        }
                    } else if (var51.equals("重要物品输入OK丢弃")) {
                        String var28 = var1.getLabel();
                        String var68 = this.aC.getString();
                        if (!var28.equals("确定") || var68 == null) {
                            if (var28.equals("返回")) {
                                this.aD = null;
                                this.aC = null;
                                this.touchAction = 0;
                                this.b = 0;
                                this.mainMidlet.start();
                            }

                            return;
                        }

                        if (var68.equals("OK")) {
                            e.f(e.ag);
                            this.touchAction = 0;
                            this.b = 0;
                            this.mainMidlet.start();
                        } else {
                            this.b("请输入“OK” ！");
                        }
                    } else if (var51.equals("输入OK确认解散帮派")) {
                        String var26 = var1.getLabel();
                        String var67 = this.aC.getString();
                        if (!var26.equals("确定") || var67 == null) {
                            if (var26.equals("返回")) {
                                this.aD = null;
                                this.aC = null;
                                this.touchAction = 0;
                                this.b = 0;
                                e.l = 0;
                                this.mainMidlet.start();
                            }

                            return;
                        }

                        if (var67.equals("OK")) {
                            aq var27 = e.M;
                            byte[] var83;
                            if ((var83 = NetPayloadBuilder.n((short) 4214, GlobalStatus.ad)) != null) {
                                netUtils.sendPacket(new NetPacket((short) 4214, var83));
                                var27.b.a((String) null);
                            } else {
                                var27.b.b("获取上传指令数据错误!");
                            }

                            this.touchAction = 0;
                            this.b = 0;
                            this.mainMidlet.start();
                        } else {
                            this.b("如需要解散帮派，请输入“OK”！");
                        }
                    } else if (var51.equals("请输入要搜索的帮派名称")) {
                        String var25 = var1.getLabel();
                        String var66 = this.aC.getString();
                        if (!var25.equals("确定") || var66 == null) {
                            if (var25.equals("返回")) {
                                this.I();
                                this.touchAction = 0;
                                this.b = 0;
                                this.mainMidlet.start();
                            }

                            return;
                        }

                        GlobalStatus.gQ = 1;
                        if (var66.length() == 0) {
                            e.M.o = "";
                            e.M.a(e.M.o);
                        } else {
                            e.M.o = var66;
                            e.M.a(e.M.o);
                        }

                        this.I();
                        this.touchAction = 0;
                        this.b = 0;
                        this.mainMidlet.start();
                    } else if (var51.equals("输入OK确认宣战")) {
                        String var24 = var1.getLabel();
                        String var65 = this.aC.getString();
                        if (!var24.equals("确定") || var65 == null) {
                            if (var24.equals("返回")) {
                                this.aD = null;
                                this.aC = null;
                                this.touchAction = 0;
                                this.b = 0;
                                e.l = 0;
                                this.mainMidlet.start();
                            }

                            return;
                        }

                        if (var65.equals("OK")) {
                            e.M.a((byte) 3, GlobalStatus.jY[this.ar.g() - 1]);
                            this.touchAction = 0;
                            this.b = 0;
                            this.mainMidlet.start();
                        } else {
                            this.b("确定宣战，请输入“OK”！");
                        }
                    } else if (var51.equals("重要物品输入OK卖出")) {
                        String var23 = var1.getLabel();
                        String var64 = this.aC.getString();
                        if (!var23.equals("确定") || var64 == null) {
                            if (var23.equals("返回")) {
                                this.aD = null;
                                this.aC = null;
                                this.touchAction = 0;
                                this.b = 0;
                                this.mainMidlet.start();
                            }

                            return;
                        }

                        if (var64.equals("OK")) {
                            e.m(e.ag);
                            this.touchAction = 0;
                            this.b = 0;
                            this.mainMidlet.start();
                        } else {
                            this.b("请输入“OK” ！");
                        }
                    } else if (var51.equals("请输入警告语（30个字符内）")) {
                        String var22 = var1.getLabel();
                        String var63 = this.aC.getString();
                        if (!var22.equals("确定") || var63 == null) {
                            if (var22.equals("返回")) {
                                this.aD = null;
                                this.aC = null;
                                this.touchAction = 0;
                                this.b = 0;
                                this.mainMidlet.start();
                            }

                            return;
                        }

                        e.M.b((byte) 0, var63);
                        this.touchAction = 0;
                        this.b = 0;
                        this.mainMidlet.start();
                    } else if (var51.equals("输入OK确定遗忘宠物技能")) {
                        String var21 = var1.getLabel();
                        String var62 = this.aC.getString();
                        if (!var21.equals("确定") || var62 == null) {
                            if (var21.equals("返回")) {
                                this.aD = null;
                                this.aC = null;
                                this.touchAction = 0;
                                this.b = 0;
                                this.mainMidlet.start();
                            }

                            return;
                        }

                        if (var62.equals("OK")) {
                            e.y();
                            this.touchAction = 0;
                            this.b = 0;
                            this.mainMidlet.start();
                        } else {
                            this.b("请输入“OK” ！");
                        }
                    } else if (var51.equals("发布求爱宣言")) {
                        String var19 = var1.getLabel();
                        String var61 = this.aC.getString();
                        String var82 = this.bL.getString();
                        String var89 = this.bM.getString();
                        if (!var19.equals("确定")) {
                            if (var19.equals("返回")) {
                                this.aD = null;
                                this.aC = null;
                                this.bL = null;
                                this.bM = null;
                                this.touchAction = 0;
                                this.b = 0;
                                this.mainMidlet.start();
                            }

                            return;
                        }

                        if (!var61.equals("") && !var82.equals("") && !var89.equals("")) {
                            e.o();
                            e.ak.append(var89);
                            long var96;
                            if ((var96 = e.n()) > 0L) {
                                e.S.a(var61, var82, var96);
                                this.touchAction = 0;
                                this.b = 0;
                                this.mainMidlet.start();
                                return;
                            }

                            Alert var20;
                            (var20 = new Alert("银两输入有误", "请重新输入银两！", (Image) null, AlertType.ERROR)).setTimeout(-2);
                            this.q.setCurrent(var20);
                        } else if (var61.equals("")) {
                            Alert var93;
                            (var93 = new Alert("昵称为空", "请输入求爱人昵称！", (Image) null, AlertType.ERROR)).setTimeout(-2);
                            this.q.setCurrent(var93);
                        } else if (var82.equals("")) {
                            Alert var94;
                            (var94 = new Alert("求爱宣言为空", "请输入求爱宣言！", (Image) null, AlertType.ERROR)).setTimeout(-2);
                            this.q.setCurrent(var94);
                        } else {
                            if (!var89.equals("")) {
                                return;
                            }

                            Alert var95;
                            (var95 = new Alert("银两为空", "请输入银两！", (Image) null, AlertType.ERROR)).setTimeout(-2);
                            this.q.setCurrent(var95);
                        }
                    } else if (var51.equals("输入OK确定离婚")) {
                        String var18 = var1.getLabel();
                        String var60 = this.aC.getString();
                        if (!var18.equals("确定") || var60 == null) {
                            if (var18.equals("返回")) {
                                this.aD = null;
                                this.mainMidlet.start();
                            }

                            return;
                        }

                        if (var60.equals("OK")) {
                            if (v_1.e == 1) {
                                return;
                            }

                            e.S.b((byte) 1);
                        } else {
                            this.b("请输入“OK” ！");
                        }
                    } else if (var51.equals("输入兑换码")) {
                        String var17 = var1.getLabel();
                        String var59 = this.aC.getString();
                        if (!var17.equals("确定") || var59 == null) {
                            if (var17.equals("返回")) {
                                this.aD = null;
                                this.mainMidlet.start();
                            }

                            return;
                        }

                        byte[] var81;
                        if ((var81 = NetPayloadBuilder.q((short) 4880, GlobalStatus.ad, this.aC.getString())) != null) {
                            netUtils.sendPacket(new NetPacket((short) 4880, var81));
                            this.a((String) null);
                            return;
                        }

                        this.b("获取上传指令数据错误!");
                    } else if (!var51.equals("发送邮件") && !var51.equals("回复邮件")) {
                        if (var51.equals("选择收件人")) {
                            if (var1.getLabel().equals("确定")) {
                                GlobalStatus.O.o = GlobalStatus.O.s[this.bX.getSelectedIndex()];
                                GlobalStatus.O.r = GlobalStatus.O.t[this.bX.getSelectedIndex()];
                            }

                            this.a((byte) 0, GlobalStatus.O.m, GlobalStatus.O.n, GlobalStatus.O.o, GlobalStatus.O.p == null ? "" : GlobalStatus.O.p, GlobalStatus.O.q, GlobalStatus.O.r);
                            return;
                        }

                        if (var51.equals("邮件举报")) {
                            if (var1.getLabel().equals("举报")) {
                                e.a(this.bW, this.aC.getString().trim(), GlobalStatus.O.d);
                                this.mainMidlet.start();
                                return;
                            }

                            this.aD = null;
                            this.mainMidlet.start();
                            return;
                        }

                        if (var51.equals("联系客服")) {
                            if (!var1.getLabel().equals("确定")) {
                                this.aD = null;
                                this.mainMidlet.start();
                                return;
                            }

                            String var16;
                            if ((var16 = this.aC.getString().trim()).length() >= 5) {
                                e.a(var16, ag_1.a[this.bX.getSelectedIndex()]);
                                this.mainMidlet.start();
                                return;
                            }

                            this.b("信息长度不足，不能少于5字，请重新输入");
                        } else {
                            this.aD = null;
                            this.mainMidlet.start();
                        }
                    } else {
                        String var15 = var1.getLabel();
                        if (this.bY != 0) {
                            return;
                        }

                        GlobalStatus.O.a();
                        GlobalStatus.O.m = this.aD.getTitle();
                        GlobalStatus.O.n = this.aC == null ? "" : this.aC.getString().trim();
                        GlobalStatus.O.o = this.bL == null ? "" : this.bL.getString().trim();
                        GlobalStatus.O.p = this.bM == null ? "" : this.bM.getString().trim();
                        if (var15.equals("发送")) {
                            Object var57 = null;
                            String var58;
                            if (var51.equals("回复邮件")) {
                                var58 = this.bU.getText();
                            } else {
                                var58 = GlobalStatus.O.o;
                            }

                            e.a(GlobalStatus.O.n, var58, GlobalStatus.O.p, GlobalStatus.O.d);
                            this.mainMidlet.start();
                        } else {
                            if (!var15.equals("选择收件人")) {
                                this.aD = null;
                                this.mainMidlet.start();
                                return;
                            }

                            if (this.bY == 0) {
                                this.aD = new Form("选择收件人");
                                if (GlobalStatus.O.s != null && GlobalStatus.O.s.length > 0) {
                                    this.bX = new ChoiceGroup("从好友列表中选择收件人", 1, GlobalStatus.O.s, (Image[]) null);
                                    this.bP = new Command("确定", 3, 0);
                                    this.bQ = new Command("返回", 1, 5);
                                    this.aD.addCommand(this.bP);
                                    this.aD.addCommand(this.bQ);
                                    this.aD.append(this.bX);
                                } else {
                                    this.bS = new StringItem((String) null, "您的好友名单为空，请直接输入收件人昵称，或添加为好友后从列表中选择！");
                                    this.bQ = new Command("返回", 1, 5);
                                    this.aD.addCommand(this.bQ);
                                    this.aD.append(this.bS);
                                }

                                this.q.setCurrent(this.aD);
                                this.aD.setCommandListener(this);
                            }
                        }
                    }
                } else {
                    String var14;
                    if (!(var14 = var1.getLabel()).equals("确定")) {
                        if (var14.equals("返回")) {
                            this.aD = null;
                            this.aC = null;
                            this.mainMidlet.start();
                            this.touchAction = 0;
                            this.b = 0;
                        }

                        return;
                    }

                    if (this.aC.getString() != "" && !this.aC.getString().substring(0, 1).equals("-")) {
                        e.o();
                        e.ak.append(this.aC.getString());
                        this.mainMidlet.start();
                        this.touchAction = 0;
                        this.b = 0;
                    } else {
                        this.b("输入有误,请重新输入");
                    }
                }
            } else {
                if (!var1.getLabel().equals("登陆")) {
                    this.c();
                    this.mainMidlet.start();
                    return;
                }

                byte var3 = (byte) this.bc.getSelectedIndex();
                boolean zIsSelected = this.bd.isSelected(0);
                String var5 = this.bN.getString().trim();
                String var8 = this.bO.getString().trim();
                if (zIsSelected) {
                    byte var10001 = (byte) (var51.equals("登录当乐通行证") ? 0 : 1);
                    String var9 = var8;
                    String var7 = var5;
                    byte var6 = var3;
                    MainCanvas var13 = this;
                    ByteArrayOutputStream var10 = new ByteArrayOutputStream();
                    DataOutputStream var11 = new DataOutputStream(var10);

                    try {
                        var11.writeBoolean(var10001 == 0);
                        var11.writeByte(var6);
                        var11.writeBoolean(true);
                        var11.writeUTF(var7 == null ? "" : var7);
                        var11.writeUTF(var9 == null ? "" : var9);
                        var13.a(var10.toByteArray(), "dcn_user_info.db");
                        var10.close();
                        var11.close();
                    } catch (IOException var12) {
                        ((Throwable) var12).printStackTrace();
                    }
                }

                if (var51.equals("登录当乐通行证")) {
                    GlobalConfig.w = true;
                    c_3.b();
                    String var98 = var3 == 0 ? var5 : "";
                    String var90 = var3 == 1 ? var5 : "";
                    String var80 = var98;
                    byte[] var97 = NetPayloadBuilder.a((short) 5392, GlobalConfig.s, bb_1.a, bb_1.b, var80, var90, var8, GlobalConfig.PopularizeChannel, GlobalConfig.F, (int) Runtime.getRuntime().totalMemory(), GlobalConfig.u);
                    this.init("socket://120.78.151.213:20008", "http://117.135.138.130:7099");
                    if (var97 == null) {
                        this.b("获取上传指令数据错误!");
                        return;
                    }

                    netUtils.sendPacket(new NetPacket((short) 5392, var97));
                    this.mainMidlet.start();
                    this.a("正在登录...");
                } else {
                    GlobalConfig.w = false;
                    ai.a((byte) (var3 + 1), var5, var8);
                    this.mainMidlet.start();
                    this.a("请求中...");
                }
            }

        }
    }

    private void J() {
        this.aJ = false;
        netUtils = null;

        this.mainMidlet.destroyApp(true);
        this.mainMidlet.notifyDestroyed();
    }

    /**
     * 手工梳理后的触屏按下逻辑。
     * 保留原始 pointerPressed 不动，后续如果需要替换，可直接把本方法改名。
     * <p>
     * 已修正的反编译问题：
     * 1. case 5 命中角色格子后，结果不应在循环结束后被默认值覆盖。
     * 2. case 6 最后两个按钮是确认动作，命中后不应再落回左右切换。
     * 3. case 14 实际是遍历主菜单项；未命中时再检查右下角“退出”区域。
     */
    protected final void pointerPressed(int x, int y) {
        if (!GlobalConfig.o || this.touchController == null) {
            return;
        }
        // aj: 触屏输入控制器，负责保存当前触点坐标、拖动状态，并把点击分发到当前画面。
        this.touchController.pointX = x;
        this.touchController.pointY = y;
        // aA: 当前触摸附带的临时状态位，这里按下时先清零。
        this.tempTouchStatus = 0;
        this.touchController.a(this.touchController.pointX, this.touchController.pointY);
        // canvas: 实际处理这次点击的主画布对象，也就是当前 this。
//        MainCanvas canvas = this.touchController.canvas;
        int touchX = this.touchController.pointX;
        int touchY = this.touchController.pointY;
        // j: 当前主画布所处的大界面状态。
        switch (this.touchPageCase) {
            case 2:
                // case 2: 游戏主场景，点击地图/场景对象后直接换算成场景命令。
                // a: 当前输入转换出的“命令码”，后续主循环会按这个值执行动作。
                this.touchAction = this.buildTouchAction(touchX, touchY);
                return;
            case 4:
                // case 4: 服务器/分线/登录前选择类界面。
                // c: 当前大界面下的子状态。
                if (this.touch4Status == 0) {
                    if (this.aq != null) {
                        // aq: 通用弹窗/面板命中检测对象，负责把坐标转换成按钮/列表命令。
                        this.touchAction = this.aq.b(touchX, touchY);
                    }
                    return;
                }
                if (this.touch4Status == 2) {
                    this.touchAction = this.buildTouchAction(touchX, touchY);
                }
                return;
            case 5:
                // case 5: 角色列表界面。
                if (this.aq != null) {
                    // 先让通用面板逻辑处理一次，再叠加角色列表自己的格子命中逻辑。
                    this.touchAction = this.aq.b(touchX, touchY);
                    int action = this.touchAction;
                    if (this.actorList != null) {
                        // bC: 角色列表 6 个格子的点击区域 [x, y, width, height]
                        for (int slotIndex = 0; slotIndex < this.actorList.length; slotIndex++) {
                            int[] rect = this.actorList[slotIndex];
                            if (touchX >= rect[0] && touchX <= rect[0] + rect[2] && touchY >= rect[1] && touchY <= rect[1] + rect[3]) {
                                byte col = (byte) (slotIndex % 2);
                                byte row = (byte) (slotIndex / 2);
                                // bz / bA: 当前角色列表选中的列、行
                                if (col == this.selectActorClo && row == this.selectActorRow) {
                                    // 再次点击当前已选角色，触发确认进入。
                                    action = 1073741824;
                                } else {
                                    // 第一次点击只切换高亮，不直接进入。
                                    this.selectActorClo = col;
                                    this.selectActorRow = (byte) (row == 0 ? 1 : 0);
                                    action = 4;
                                }
                                break;
                            }
                        }
                    }
                    this.touchAction = action;
                }
                if (this.touch4Status == 1) {
                    this.touchAction = LoadingPage.c(touchX, touchY);
                    return;
                }
                if (this.touch4Status != 2) {
                    return;
                }
                break;
            case 6:
                // case 6: 创建角色界面。
                if (this.aq != null) {
                    // 创建角色界面同样先走通用面板命中，再补自己的热点区域判断。
                    this.touchAction = this.aq.b(touchX, touchY);
                    int action = this.touchAction;
                    if (this.actorList != null) {
                        // bC: 创建角色界面的 6 个热点区域
                        for (int hotAreaIndex = 0; hotAreaIndex < this.actorList.length; hotAreaIndex++) {
                            int[] rect = this.actorList[hotAreaIndex];
                            if (touchX >= rect[0] && touchX <= rect[0] + rect[2] && touchY >= rect[1] && touchY <= rect[1] + rect[3]) {
                                if (hotAreaIndex < 2) {
                                    // 第一组：头像/形象左右切换。
                                    // bH: 当前创建角色界面的焦点组
                                    this.bH = 0;
                                    action = hotAreaIndex % 2 == 0 ? 8 : 2;
                                } else if (hotAreaIndex < 4) {
                                    // 第二组：性别左右切换。
                                    this.bH = 1;
                                    action = hotAreaIndex % 2 == 0 ? 8 : 2;
                                } else {
                                    // 第三组：名字输入框 / 随机名按钮，点击后是确认选中。
                                    // bG: 第三组中的子选项，0=输入框，1=随机名按钮
                                    this.bH = 2;
                                    this.bG = hotAreaIndex % 2;
                                    action = 1073741824;
                                }
                                break;
                            }
                        }
                    }
                    this.touchAction = action;
                    return;
                }
                return;
            case 10:
                // case 10: 只依赖通用面板命中的功能页。
                if (this.aq != null) {
                    // aq: 这里仅依赖通用面板返回命令，不额外叠加界面专属逻辑。
                    this.touchAction = this.aq.b(touchX, touchY);
                }
                return;
            case 14:
                // case 14: 标题/启动主菜单界面。
                if (this.touch4Status != 0) {
                    this.touchAction = LoadingPage.b(touchX, touchY);
                    return;
                }
                int action = 0;
                // bo: 标题界面的主菜单文案数组；bs: 当前命中的菜单项索引
                for (int menuIndex = 0; menuIndex < this.bo.length; menuIndex++) {
                    int left = (GlobalConfig.defaultWidth - this.bi.getWidth()) >> 1;
                    int right = left + this.bi.getWidth();
                    int top = (this.bt << 1) + this.bh.getHeight() + (this.bi.getHeight() * menuIndex);
                    int bottom = (this.bt << 1) + this.bh.getHeight() + (this.bi.getHeight() * (menuIndex + 1));
                    if (touchX > left && touchX < right && touchY > top && touchY < bottom) {
                        this.bs = menuIndex;
                        // al: 菜单项选中后的计时/节奏控制字段，点中后清零以便立即触发
                        this.al = 0L;
                        action = 1073741824;
                        break;
                    }
                }
                if (action == 0 && GlobalConfig.channel == 1) {
                    int left = (GlobalConfig.defaultWidth - GlobalConfig.i.stringWidth("退出")) - 4;
                    int right = GlobalConfig.defaultWidth - 4;
                    int top = (GlobalConfig.defaultHigh - GlobalConfig.j) - 4;
                    int bottom = GlobalConfig.defaultHigh - 4;
                    if (touchX >= left && touchX <= right && touchY >= top && touchY <= bottom) {
                        action = 536870912;
                    }
                }
                this.touchAction = action;
                return;
            case 15:
            case 16:
            case 17:
                // case 15/16/17: 使用 ca.b() 的通用确认/取消类界面。
                this.touchAction = LoadingPage.b(touchX, touchY);
                return;
            case 18:
            case 19:
                // case 18/19: 使用 ca.a() 的另一组通用弹框/菜单界面。
                this.touchAction = LoadingPage.a(touchX, touchY);
                return;
            case 20:
                // case 20: 下载/提示类界面，走 switch 末尾的 ca.b() 默认处理。
                break;
            case 3:
            case 7:
            case 8:
            case 9:
            case 11:
            case 12:
            case 13:
            default:
                // 这些状态当前没有额外的 pointerPressed 逻辑，直接返回。
                return;
        }
        this.touchAction = LoadingPage.b(touchX, touchY);
    }


    protected final void pointerReleased(int var1, int var2) {
        if (GlobalConfig.o && this.touchController != null) {
            this.touchController.c = 0;
            this.touchController.d = 0;
            this.b = 0;
            this.touchAction = 0;
            this.tempTouchStatus = 0;
        }

    }

    protected final void pointerDragged(int var1, int var2) {
        if (GlobalConfig.o && this.touchController != null && e != null) {
            if (e.k == 0 && e.J != null) {
                return;
            }

            switch (e.k) {
                case 0:
                    this.touchController.d = 1;
                    this.aF = var1;
                    this.aG = var2;
                    return;
                case 39:
                    if (this.touchController.c == 1) {
                        this.touchController.d = 1;
                        this.aF = var1;
                        this.aG = var2;
                    }
            }
        }

    }

    public final void b(int var1, int var2) {
        var1 -= 8;
        var2 -= 16;
        Vector var3 = new Vector();
        this.ca = e.I.j / 16 + (e.I.j % 16 == 0 ? 0 : 1);
        this.cb = e.I.k / 16 + (e.I.k % 16 == 0 ? 0 : 1);
        this.cc = var1 / 16 + (var1 % 16 == 0 ? 0 : 1);
        this.cd = var2 / 16 + (var2 % 16 == 0 ? 0 : 1);
        if (this.ca != this.cc || this.cb != this.cd) {
            for (int var4 = 0; var4 < e.f.i.length; ++var4) {
                for (int var5 = 0; var5 < e.f.i[var4].length; ++var5) {
                    if (e.f.i[var4][var5] == 1 && var1 >= var4 * e.f.e - 15 && var1 < var4 * e.f.e + e.f.e - 15 && var2 >= var5 * e.f.f - e.f.f && var2 < var5 * e.f.f) {
                        return;
                    }
                }
            }

            if ((var3 = netUtils.a().a(e.f, var3, new bs(this.ca, this.cb), new bs(this.cc, this.cd))).isEmpty()) {
                return;
            }

            int var6 = var3.size();
            e.I.c.removeAllElements();

            for (int var8 = 0; var8 < var6; ++var8) {
                bs var15 = (bs) var3.elementAt(var8);
                bs var16;
                if (var8 < var6 - 1) {
                    var16 = (bs) var3.elementAt(var8 + 1);
                } else {
                    var16 = var15;
                }

                if (var15.a != var16.a) {
                    if (var15.a > var16.a) {
                        for (int var13 = 0; var13 < 4; ++var13) {
                            e.I.c.addElement(new short[]{(short) ((var15.a << 4) - (var13 << 2)), (short) (var15.b << 4)});
                        }
                    } else {
                        for (int var12 = 0; var12 < 4; ++var12) {
                            e.I.c.addElement(new short[]{(short) ((var15.a << 4) + (var12 << 2)), (short) (var15.b << 4)});
                        }
                    }
                } else if (var15.b != var16.b) {
                    if (var15.b > var16.b) {
                        for (int var11 = 0; var11 < 4; ++var11) {
                            e.I.c.addElement(new short[]{(short) (var15.a << 4), (short) ((var15.b << 4) - (var11 << 2))});
                        }
                    } else {
                        for (int var10 = 0; var10 < 4; ++var10) {
                            e.I.c.addElement(new short[]{(short) (var15.a << 4), (short) ((var15.b << 4) + (var10 << 2))});
                        }
                    }
                }
            }
        }

    }

    private void a(short var1) {
        ByteArrayOutputStream var2 = new ByteArrayOutputStream();
        DataOutputStream var3 = new DataOutputStream(var2);

        try {
            var3.writeShort(var1);
            this.a(var2.toByteArray(), "S");
            var2.close();
            var3.close();
        } catch (IOException var4) {
        } catch (Exception var5) {
        }
    }

    private void K() {
        RecordStore var1 = null;

        try {
            DataInputStream var2;
            if (j("S") && (var2 = a(var1 = a("S", false))) != null) {
                this.ce = 0;
                this.ce = var2.readShort();
                var2.close();
            }

            return;
        } catch (Exception var13) {
        } finally {
            if (var1 != null) {
                try {
                    var1.closeRecordStore();
                } catch (RecordStoreNotOpenException var11) {
                } catch (RecordStoreException var12) {
                }
            }

        }

    }

    public final void p() {
        this.aD = new Form("发布求爱宣言");
        this.aC = new TextField("求爱宣言保留48小时，请输入求爱人昵称：", (String) null, 5, 0);
        this.bL = new TextField("请输入求爱宣言，不超过100字：", (String) null, 100, 0);
        this.bM = new TextField("银两不可低于10万两，银两越多排位越靠前，请输入银两：", (String) null, 9, 2);
        this.bQ = new Command("返回", 8, 1);
        this.bP = new Command("确定", 2, 1);
        this.aD.addCommand(this.bP);
        this.aD.addCommand(this.bQ);
        this.aD.append(this.aC);
        this.aD.append(this.bL);
        this.aD.append(this.bM);
        this.aD.setCommandListener(this);
        this.q.setCurrent(this.aD);
    }

    public final void q() {
        LoadingPage.h = 0;
        this.k = this.touchPageCase = 20;
    }

    public final void c(String var1, String var2) {
        new e_3(this, var1, var2);
    }

    public static final Image c(int var0) {
        return var0 == 1 ? aM : null;
    }

    public static final Image d(int var0) {
        return var0 > 0 && var0 < 8 ? aL[var0 - 1] : null;
    }

    private static Image k(String var0) {
        try {
            return Image.createImage(var0);
        } catch (IOException var1) {
            ((Throwable) var1).printStackTrace();
            return null;
        }
    }

    public final void r() {
        LoadingPage.A = 100;
        this.b();
        this.mainMidlet.start();
    }

    static ChoiceGroup a(MainCanvas var0) {
        return var0.bb;
    }

    static ChoiceGroup a(MainCanvas var0, ChoiceGroup var1) {
        return var0.bc = var1;
    }

    static ChoiceGroup a(MainCanvas var0, int var1) {
        return e(var1);
    }

    static ChoiceGroup b(MainCanvas var0) {
        return var0.bc;
    }

    static void c(MainCanvas var0) {
        ui = new Page("/", "ui");
        ui.loadRpg();

        publicUI = new Page("/", "publicUI");
        publicUI.loadRpg();
        if (publicUI.framesNum() != 0) {
            ao_1.w = publicUI.getFrame("money");
            ao_1.x = publicUI.getFrame("goods");
            ao_1.C = publicUI.getFrame("chat");
            ao_1.D = publicUI.getFrame("elite");
            n = publicUI.getFrame("num");
            publicUI.b("email");
            Frame0 var2 = publicUI.getFrame("mail_2");
            aj[] var1 = var2.d;

            for (int var3 = 1; var3 < var1.length; ++var3) {
                Image var4 = Image.createImage(var2.pngImage, var1[var3].a, var1[var3].b, var1[var3].c, var1[var3].d, 0);
                if ((var3 & 1) == 0) {
                    be_1.e[var3 >> 2] = var4;
                } else {
                    bo_1.g[var3 >> 1] = var4;
                }
            }

            aa = publicUI.getFrame("talk_01").pngImage;
            u = publicUI.getFrame("close");
            v = publicUI.getFrame("title");
            E = publicUI.getFrame("button1");
            r = publicUI.getFrame("lu");
            s = publicUI.getFrame("ld");
            t = publicUI.getFrame("rd");
            x = publicUI.getFrame("rd0");
            w = publicUI.getFrame("ru0");
            y = publicUI.getFrame("lu0");
            z = publicUI.getFrame("ld0");
            C = publicUI.getFrame("up");
            D = publicUI.getFrame("down");
            A = publicUI.b("go-left");
            B = publicUI.b("go-right");
            y_1.a = v;
            y_1.b = u;
            y_1.c = r;
            y_1.d = z;
            y_1.e = x;
            G = publicUI.getFrame("tradetitle");
            L = publicUI.getFrame("tradebottom");
            K = publicUI.getFrame("moneybutton");
            H = publicUI.getFrame("tradelock01");
            I = publicUI.getFrame("tradelock_02");
            J = publicUI.getFrame("tradelock_03");
            M = publicUI.getFrame("plus");
            N = publicUI.getFrame("subtraction");
            O = publicUI.getFrame("equip");
            P = publicUI.getFrame("nextpage");
            Q = publicUI.getFrame("backpage");
            R = new Frame0[8];

            for (int var20 = 0; var20 < R.length; ++var20) {
                R[var20] = publicUI.getFrame("equip_" + var20);
            }

            S = new Frame0[4];

            for (int var21 = 0; var21 < S.length; ++var21) {
                S[var21] = publicUI.getFrame("submenu_" + var21);
            }

            T = publicUI.getFrame("button_ok");
            U = publicUI.getFrame("button_back");
            V = publicUI.getFrame("trigon_u");
            W = publicUI.getFrame("trigon_d");
            X = publicUI.getFrame("trigon_l");
            Y = publicUI.getFrame("trigon_r");
            ao_1.r = publicUI.b("select");
            Z = publicUI.getFrame("rim");
            publicUI.getFrame("cursor");
            publicUI.getFrame("scorebar");
            aL = new Image[7];

            for (int var22 = 0; var22 < aL.length; ++var22) {
                aL[var22] = publicUI.getFrame("chq-" + (var22 + 1)).pngImage;
            }

            aM = k("/images/mz_1.png");
        }

        ab = new Page("/role/", "role");
        ah = new Page("/petfight/", "petfight");
        af = new Page("/icon/", "icon");
        MainCanvas var17 = var0;
        RecordStore var19 = null;

        try {
            DataInputStream var18;
            if (j(var17.aK) && (var18 = a(var19 = a(var17.aK, false))) != null) {
                GlobalStatus.b = var18.readUTF();
                GlobalStatus.c = var18.readUTF();
                var18.close();
            }
        } catch (Exception var15) {
        } finally {
            if (var19 != null) {
                try {
                    var19.closeRecordStore();
                } catch (RecordStoreNotOpenException var13) {
                } catch (RecordStoreException var14) {
                }
            }

        }

        var0.l = new StringBuffer();
        var0.aq = new m_1();
        var0.av = y_1.c();
        var0.ar = new c_1();
        var0.au = new l_1();
        var0.as = new n_1();
        var0.at = new an_1();
        f = new PngUtil();
        if (GlobalConfig.o) {
            var0.touchController = new TouchController(var0, f);
        }

        ai.a();
        var0.c();
    }
}

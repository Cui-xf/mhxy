package com.yinhan.kjava.main;

import com.cc.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Vector;
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
import javax.microedition.midlet.MIDletStateChangeException;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreNotOpenException;

public final class a_MainCanvas extends Canvas implements Runnable, CommandListener {
   public int a;
   public int b;
   public short c = 0;
   public MainMidlet d;
   public static ao_1 e;
   public static ai_1 f;
   private boolean aJ;
   public boolean g = false;
   public boolean h = false;
   public static av_1 i;
   public short j;
   public short k;
   public StringBuffer l;
   public int m;
   public static bf_1 n;
   private String aK;
   public boolean o;
   public boolean p;
   public Display q;
   public static bf_1 r;
   public static bf_1 s;
   public static bf_1 t;
   public static bf_1 u;
   public static bf_1 v;
   public static bf_1 w;
   public static bf_1 x;
   public static bf_1 y;
   public static bf_1 z;
   public static bc_1 A;
   public static bc_1 B;
   public static bf_1 C;
   public static bf_1 D;
   public static bf_1 E;
   public static az_1 F;
   public static bf_1 G;
   public static bf_1 H;
   public static bf_1 I;
   public static bf_1 J;
   public static bf_1 K;
   public static bf_1 L;
   public static bf_1 M;
   public static bf_1 N;
   public static bf_1 O;
   public static bf_1 P;
   public static bf_1 Q;
   public static bf_1[] R;
   public static bf_1[] S;
   public static bf_1 T;
   public static bf_1 U;
   public static bf_1 V;
   public static bf_1 W;
   public static bf_1 X;
   public static bf_1 Y;
   public static bf_1 Z;
   private static Image[] aL = null;
   private static Image aM = null;
   public static Image aa = null;
   public static bu_1 ab;
   public static bu_1 ac;
   public static bu_1 ad;
   public static bu_1 ae;
   public static bu_1 af;
   public static bu_1 ag;
   public static bu_1 ah;
   public static com.yinhan.kjava.main.c ai = null;
   public com.yinhan.kjava.main.f aj;
   public long ak;
   public long al;
   private static Vector aN = new Vector();
   private static StringBuffer aO = new StringBuffer();
   private long aP;
   private long aQ;
   private boolean aR;
   private String aS;
   private bw_1 aT;
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
   private static bu_1 bl = null;
   private static bc_1 bm;
   private static bc_1 bn;
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
   private bc_1[] bx;
   private bc_1[] by;
   private byte bz;
   private byte bA;
   private int bB;
   private int[][] bC;
   public int ax;
   public String ay;
   private Image bD;
   private byte bE;
   private byte bF;
   private int bG;
   private int bH;
   public boolean az;
   public int aA;
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

   public a_MainCanvas(MainMidlet var1, Display var2) {
      this.aK = "mhxy.zyy" + t_1.r + "_" + t_1.s;
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
      this.bC = null;
      this.ay = "";
      this.bD = null;
      this.bG = 0;
      this.bH = 0;
      this.aA = 0;
      this.bI = -1;
      this.bJ = 0L;
      this.bY = -1;
      t_1.a((MIDlet)var1);
      ((Canvas)this).setFullScreenMode(true);
      this.q = var2;
      this.d = var1;
      ai = new com.yinhan.kjava.main.c(var1, var2);
      this.aJ = true;
      t_1.b = (short)((Displayable)this).getWidth();
      t_1.c = (short)((Displayable)this).getHeight();
      ao_1.a = t_1.d = t_1.b;
      ao_1.b = t_1.e = t_1.c;
      this.m = 10;
      if (t_1.b >= 240) {
         this.m = 8;
         ao_1.a = t_1.d = (short)(t_1.b * 95 / 100);
         ao_1.b = t_1.e = (short)(t_1.c * (t_1.c > 320 ? 80 : 95) / 100);
         t_1.f = ao_1.o = (short)((t_1.b - ao_1.a) / 2);
         t_1.g = ao_1.p = (short)((t_1.c - ao_1.b) / 2);
      }

      y_1.c().a(t_1.f, t_1.g, t_1.d, t_1.e);
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

   public final void a(String var1, String var2) {
      if (i == null) {
         i = new av_1();
      } else {
         a((String)var1, (byte)2);
         i.b();
      }

      i.a(this);
   }

   private static void s() {
      if (i != null) {
         i.d();
         i = null;
      }

   }

   public final void run() {
      while(this.aJ) {
         this.ak = System.currentTimeMillis();

         try {
            if (i != null) {
               i.c();
            }

            if (this.aJ) {
               switch (this.j) {
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
                     if ((this.ak - this.aQ >= 6600L || this.k == 7 && e.g != null && e.k == 25 && this.ak - this.aQ >= 2000L) && this.aR || this.a == 1073741824 || this.a == 517 || this.a == 536870912 || this.a == 268435456 || u()) {
                        if (this.aS != null && this.aS.startsWith("系统异常")) {
                           this.t();
                           break;
                        }

                        if (bt_1.eC.startsWith("异常离线") || bt_1.eB == 0 || this.k == 9) {
                           this.G();
                           break;
                        }

                        if (bt_1.eC != null && (bt_1.eC.startsWith("连接超时") || bt_1.eC.startsWith("响应超时"))) {
                           if (i != null) {
                              i.d();
                              i = null;
                           }

                           this.y();
                           break;
                        }

                        if (bt_1.eC != null && e != null) {
                           if (bt_1.aC == 1 && (bt_1.eC.endsWith("超Q用户才可兑换") || bt_1.eC.endsWith("超Q用户才可接取"))) {
                              e.af();
                           }

                           if (bt_1.aH == 1 && (bt_1.eC.endsWith("魔钻用户才可兑换") || bt_1.eC.endsWith("魔钻用户才可接取"))) {
                              e.ag();
                           }
                        }

                        if (bt_1.eC != null && bt_1.eC.equals("您已短信申请开通VIP服务")) {
                           this.j = this.k = 7;
                        }

                        if (this.k != 3 && bt_1.eB != -4) {
                           if (this.k == 4) {
                              if (t_1.a == 1) {
                                 if (bt_1.hw) {
                                    this.c();
                                 } else {
                                    this.d();
                                 }
                              } else {
                                 this.d();
                              }
                           } else if (this.k == 5) {
                              this.b(bt_1.Y.length);
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
                                 e.d((byte)var10);
                                 int var22 = var10 == 0 ? bt_1.O.f.length : bt_1.P.b.length;
                                 this.ar.a(Math.min(var17, var22));
                              } else if (e.k == 77) {
                                 e.u();
                                 this.ar.a(bt_1.P.i);
                              } else {
                                 this.i();
                              }
                           } else if (this.k == 9) {
                              this.G();
                           } else if (this.k == 14) {
                              this.c();
                           }
                        } else if (t_1.a == 1) {
                           if (bb_1.g != null) {
                              this.aJ = false;
                           } else {
                              this.b((String)null, av_1.h);
                           }
                        } else {
                           this.b((String)null, av_1.h);
                        }
                     }

                     this.b = 0;
                     this.a = 0;
                     if (t_1.o && this.aj != null) {
                        this.aj.c = 0;
                        this.aj.d = 0;
                     }
                     break;
                  case 3:
                     if (this.aZ) {
                        this.a("socket://120.78.151.213:20008", "http://117.135.138.130:7099");
                        t_1.a(this.l);
                        bt_1.b = this.bN.getString();
                        bt_1.c = this.bO.getString();
                        this.F();
                        byte[] var16;
                        if ((var16 = bz_1.a((short)5379, bt_1.b, bt_1.c, t_1.v)) != null) {
                           w var21;
                           (var21 = new w((short)5379, var16)).a = true;
                           i.a(var21);
                           this.aZ = false;
                           this.a((String)null);
                        } else {
                           this.b("获取上传指令数据错误!");
                        }
                     }

                     this.a = 0;
                     break;
                  case 4:
                     if (this.c == 0) {
                        if (t_1.a == 1 && this.bw != bb_1.d) {
                           this.bw = bb_1.d;
                           this.d();
                        }

                        if (this.aq != null) {
                           this.aq.b(this.a);
                        }

                        if (this.a != 268435456 && this.a != 1073741824 && this.a != 517) {
                           if (this.a == 536870912) {
                              this.c();
                           }
                        } else if (bt_1.hA != null || bt_1.hA.length > 0) {
                           if (t_1.a == 0) {
                              int var13 = this.ar.g();
                              s();
                              String var20 = null;
                              if (av_1.h == 1) {
                                 if (bt_1.hB[var13].equals("")) {
                                    this.b(bt_1.hA[var13] + "繁忙,请选择其他服!");
                                 } else {
                                    var20 = bt_1.hB[var13];
                                    a((String)"http://117.135.138.130:7099", (byte)1);
                                    bz_1.c = bt_1.hE[var13];
                                    this.a(bt_1.hE[var13]);
                                 }
                              } else if (bt_1.hC[var13].equals("")) {
                                 this.b(bt_1.hA[var13] + "繁忙,请选择其他服!");
                              } else {
                                 a((String)(var20 = bt_1.hC[var13]), (byte)2);
                                 this.a(bt_1.hE[var13]);
                              }

                              this.a(var20, "http://117.135.138.130:7099");
                              bz_1.c = bt_1.hE[var13];
                              byte[] var14;
                              if ((var14 = bz_1.g((short)4196, bt_1.hy, bt_1.hz)) != null) {
                                 w var15;
                                 (var15 = new w((short)4196, var14)).a = true;
                                 i.a(var15);
                                 this.aZ = false;
                                 this.a((String)null);
                              } else {
                                 this.b("获取上传指令数据错误!");
                              }
                           } else if (t_1.w) {
                              this.a(this.ar.g());
                           } else if (!bt_1.hw) {
                              this.a(this.ar.g());
                           }
                        }
                     }

                     this.a = 0;
                     break;
                  case 5:
                     this.B();
                     break;
                  case 6:
                     if (this.aq != null) {
                        this.aq.b(this.a);
                     }

                     if (this.a != 1 && this.a != 514) {
                        if (this.a != 4 && this.a != 520) {
                           if (this.a != 8 && this.a != 516) {
                              if (this.a != 2 && this.a != 518) {
                                 if (this.a == 268435456) {
                                    boolean var12 = false;
                                    String var18 = this.ay;
                                    Object var3 = null;
                                    byte[] var8;
                                    if ((var8 = bz_1.a((short)4099, var18, (byte)this.bF, (byte)this.bE)) != null) {
                                       i.a(new w((short)4099, var8));
                                       this.a((String)null);
                                    } else {
                                       this.b("获取上传指令数据错误!");
                                    }
                                 } else if (this.a == 536870912) {
                                    if (bt_1.W != null) {
                                       this.b(bt_1.W.length);
                                       break;
                                    }

                                    byte[] var19;
                                    if ((var19 = bz_1.a((short)4098, (String)bt_1.d, (String)bt_1.b)) != null) {
                                       i.a(new w((short)4098, var19));
                                       this.a((String)null);
                                    } else {
                                       this.b("获取上传指令数据错误!");
                                    }
                                 } else if ((this.a == 1073741824 || this.a == 517) && this.bH == 2) {
                                    if (this.bG == 0) {
                                       this.b((String)null, (String)null);
                                    } else {
                                       byte[] var9;
                                       if ((var9 = bz_1.a((short)4372, this.bF)) != null) {
                                          i.a(new w((short)4372, var9));
                                          this.a((String)null);
                                       } else {
                                          this.b("获取上传指令数据错误!");
                                       }
                                    }
                                 }
                              } else if (this.bH == 0) {
                                 this.bE = (byte)(this.bE + 1 > 2 ? 0 : this.bE + 1);
                                 this.at.b(t_1.H[this.bE], t_1.i, (byte)1);
                                 this.at.a((byte)1);
                              } else if (this.bH == 1) {
                                 this.bF = (byte)(this.bF + 1 > 1 ? 0 : 1);
                              } else {
                                 this.bG = this.bG + 1 > 1 ? 0 : 1;
                              }
                           } else if (this.bH == 0) {
                              this.bE = (byte)(this.bE - 1 < 0 ? 2 : this.bE - 1);
                              this.at.b(t_1.H[this.bE], t_1.i, (byte)1);
                              this.at.a((byte)1);
                           } else if (this.bH == 1) {
                              this.bF = (byte)(this.bF - 1 < 0 ? 1 : 0);
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
                        ai_1.a(this.bx[this.bF * 3 + this.bE], this.ak);
                     }

                     this.a = 0;
                     break;
                  case 7:
                     this.E();
                     break;
                  case 9:
                     if (this.al >= 520L) {
                        this.al = 0L;
                        this.be = null;
                        ca_1.a();
                        this.k = this.j = 0;
                        new com.yinhan.kjava.main.b(this, bK);
                     }
                     break;
                  case 14:
                     if (this.c == 0) {
                        if (this.a != 1 && this.a != 50 && this.a != 8 && this.a != 516) {
                           if (this.a != 4 && this.a != 520 && this.a != 2 && this.a != 518) {
                              if (this.a != 268435456 && this.a != 1073741824 && this.a != 517) {
                                 if (this.a == 536870912 && t_1.a == 1) {
                                    ca_1.h = 0;
                                    this.k = this.j = 16;
                                 }
                              } else if (t_1.a == 0) {
                                 switch (this.bs) {
                                    case 0:
                                       if (t_1.a == 0) {
                                          Object var4 = null;
                                          this.a("socket://120.78.151.213:20008", "http://117.135.138.130:7099");
                                          int var5 = (int)Runtime.getRuntime().totalMemory();
                                          byte[] var11;
                                          if ((var11 = bz_1.a((short)5383, (byte)0, (String)null, (String)null, false, t_1.v, t_1.F, var5, "")) != null) {
                                             i.a(new w((short)5383, var11));
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
                                       if (t_1.x) {
                                          this.v();
                                       } else {
                                          com.yinhan.kjava.main.c.c();
                                       }
                                       break;
                                    case 1:
                                       com.yinhan.kjava.main.c.e();
                                       break;
                                    case 2:
                                       com.yinhan.kjava.main.c.f();
                                 }
                              }
                           } else {
                              this.bs = this.bs < this.bo.length - 1 ? ++this.bs : 0;
                           }
                        } else {
                           this.bs = this.bs > 0 ? --this.bs : this.bo.length - 1;
                        }
                     } else if (this.c == 1) {
                        if (this.a != 268435456 && this.a != 1073741824) {
                           if (this.a == 536870912) {
                              this.c = 0;
                           }
                        } else {
                           this.c = 0;
                           t_1.w = false;
                           ai.d();
                        }
                     }

                     this.a = 0;
                     break;
                  case 15:
                     if (this.a == 268435456) {
                        this.c("http://3g.01234.com.cn/game/gameAction.do?m=gameIndex&sId=");
                        this.aJ = false;
                     } else if (this.a == 536870912) {
                        this.c();
                        this.bs = 1;
                     }

                     this.a = 0;
                     break;
                  case 16:
                     if (this.a == 268435456) {
                        if (!t_1.y && !t_1.B && !t_1.D) {
                           ca_1.h = 0;
                           this.k = this.j = 17;
                        } else {
                           this.aJ = false;
                        }
                     } else if (this.a == 536870912) {
                        this.k = this.j = 14;
                     }

                     this.a = 0;
                     break;
                  case 17:
                     if (this.a == 268435456) {
                        if (t_1.x) {
                           this.c("http://zt.d.cn/a091111_netgame_forum_promotion/index.pih?fid=6724&cid=269");
                        } else if (t_1.z) {
                           this.c("http://9Game.CN/Url.Aspx?id=219");
                        } else if (t_1.A) {
                           this.c("http://g.uc.cn");
                        } else if (t_1.C) {
                           this.c("http://haxiang.cn");
                        } else {
                           this.c("http://3g.01234.com.cn/game/gameAction.do?m=gameIndex&sId=");
                        }

                        this.aJ = false;
                     } else if (this.a == 536870912) {
                        this.c = 0;
                        this.G();
                     }

                     this.a = 0;
                     break;
                  case 20:
                     if (this.a != 8 && this.a != 516) {
                        if (this.a != 2 && this.a != 518) {
                           if (this.a != 268435456 && this.a != 1073741824) {
                              if (this.a == 536870912) {
                                 this.c();
                                 this.bs = 0;
                              }
                           } else {
                              this.c(aI);
                           }
                        } else {
                           ca_1.e = ca_1.e + ca_1.d < ao_1.K.a() ? ca_1.e + ca_1.d : ca_1.e;
                        }
                     } else {
                        ca_1.e = ca_1.e - ca_1.d >= 0 ? ca_1.e - ca_1.d : 0;
                     }

                     this.a = 0;
               }

               if (e != null) {
                  e.d();
                  if (this.j == 7) {
                     e.c();
                  }
               }
            }
         } catch (Exception var7) {
            this.a((Exception)var7, (byte)1);
            ((Throwable)var7).printStackTrace();
         }

         ((Canvas)this).repaint();
         ((Canvas)this).serviceRepaints();
         long var1 = 35L - (System.currentTimeMillis() - this.ak);

         try {
            if (var1 > 0L) {
               Thread.sleep(var1);
            } else {
               Thread.sleep(1L);
            }
         } catch (Exception var6) {
            ((Throwable)var6).printStackTrace();
         }
      }

      if (i != null) {
         i.d();
      }

      e = null;
      this.J();
   }

   protected final void paint(Graphics var1) {
      try {
         if (this.j == 9) {
            var1.setColor(0);
            var1.fillRect(0, 0, t_1.b, t_1.c);
         }

         var1.setClip(0, 0, t_1.b, t_1.c);
         var1.setFont(t_1.i);
         if (this.p) {
            ca_1.b(var1);
         } else {
            if ((this = this).aJ) {
               switch (this.j) {
                  case 0:
                     ca_1.a(var1, this.bf);
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

                     ca_1.b(var1);
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
                        ca_1.a(var1, this.aq.a + 5, this.aq.b + 32, this.aq.c - 11, this.aq.a(t_1.e <= 240 ? this.bB * 3 + 6 : 150), 1);
                        ca_1.b(var1, this.aq.a + 80, this.aq.b + 35, this.aq.a + 80, this.aq.b + 35 + this.aq.a(t_1.e <= 240 ? this.bB * 3 + 6 : 150) - 5);
                        var1.setColor(2176196);
                        int var2 = t_1.i.stringWidth(t_1.G[0]);
                        int var3 = this.aq.b + 45;
                        int var4 = this.aq.a + 5 + 80 + (this.aq.c - 80 - 13 - var2) / 2;
                        var1.drawString(t_1.G[this.bE], this.bE == 2 ? var4 + t_1.k / 2 : var4, var3, 20);
                        var1.drawImage(X.a, var4 - 20, var3, 20);
                        this.a(0, var4 - 20, var3, X.b, X.c);
                        var1.drawImage(Y.a, var4 + var2 + 15, var3, 20);
                        this.a(1, var4 + var2 + 15, var3, Y.b, Y.c);
                        var1.drawString(this.bF == 0 ? "男" : "女", this.aq.a + 5 + 80 + (this.aq.c - 80 - 13 - t_1.k) / 2, var3 + t_1.j + 10, 20);
                        var1.drawImage(X.a, var4 - 20, var3 + t_1.j + 10, 20);
                        this.a(2, var4 - 20, var3 + t_1.j + 10, X.b, X.c);
                        var1.drawImage(Y.a, var4 + var2 + 15, var3 + t_1.j + 10, 20);
                        this.a(3, var4 + var2 + 15, var3 + t_1.j + 10, X.b, X.c);
                        var1.drawString("昵称：", this.aq.a + 5 + 80 + 5, var3 + (t_1.j + 10 << 1), 20);
                        ca_1.c(var1, this.aq.a + 5 + 80 + 5, var3 + (t_1.j + 10) * 3 - 1, this.aq.c - 80 - this.bD.getWidth() - 20, t_1.j, 0);
                        ca_1.a(var1, this.ay, this.aq.a + 5 + 80 + 5 + 2, var3 + (t_1.j + 10) * 3, 20, 16711639);
                        var1.drawImage(this.bD, this.aq.a + this.aq.c - 8, var3 + (t_1.j + 10) * 3, 24);
                        this.a(4, this.aq.a + 5 + 80 + 5, var3 + (t_1.j + 10) * 3, this.aq.c - 80 - this.bD.getWidth() - 20, t_1.j);
                        this.a(5, this.aq.a + this.aq.c - 8 - this.bD.getWidth(), var3 + (t_1.j + 10) * 3, this.bD.getWidth(), this.bD.getHeight());
                        var1.setColor(16711680);
                        if (this.bH == 0) {
                           var1.drawRect(var4, var3, var2, t_1.j);
                        } else if (this.bH == 1) {
                           var1.drawRect(this.aq.a + 5 + 80 + (this.aq.c - 80 - 13 - t_1.k) / 2, var3 + t_1.j + 10, t_1.k, t_1.j);
                        } else if (this.bG == 0) {
                           var1.drawRect(this.aq.a + 5 + 80 + 5, var3 + (t_1.j + 10) * 3 - 1, this.aq.c - 80 - this.bD.getWidth() - 20, t_1.j);
                        } else {
                           var1.drawRect(this.aq.a + this.aq.c - 8 - this.bD.getWidth(), var3 + (t_1.j + 10) * 3, this.bD.getWidth(), this.bD.getHeight());
                        }

                        if (this.bx != null && this.bx[this.bF * 3 + this.bE] != null) {
                           f.a(var1, (bc_1)this.bx[this.bF * 3 + this.bE], (int[])null, 0, 0, this.aq.a + 40 + 5, this.aq.b + 32 + this.bx[this.bF * 3 + this.bE].j() + (this.aq.a(t_1.e <= 240 ? (this.bB << 1) + 6 : 120) - this.bx[this.bF * 3 + this.bE].j()) / 2, 20, 0);
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
                     if (t_1.a == 0) {
                        ca_1.a(var1, "更多精彩游戏尽在腾讯游戏频道\t(3g.qq.com)", new String[]{"更多", "退出"});
                     } else {
                        if (t_1.a != 1) {
                           ca_1.a(var1, "更多精彩游戏尽在当乐网\t(com.cc.d.cn)", new String[]{"更多", "返回"});
                           return;
                        }

                        ca_1.a(var1, "更多精彩游戏尽在一哥哥网游戏频道\t(3g.01234.com.cn)", new String[]{"更多", "返回"});
                     }
                     break;
                  case 16:
                     this.d(var1);
                     ca_1.a(var1, "确认退出？", new String[]{"确认", "返回"});
                     return;
                  case 17:
                     this.d(var1);
                     if (t_1.x) {
                        ca_1.a(var1, "是否进入当乐梦回西游论坛\t(http://zt.d.cn/a091111_netgame_forum_promotion/index.pih?fid=6724&cid=269)", new String[]{"进入", "退出"});
                     } else if (t_1.z) {
                        ca_1.a(var1, "更多精彩游戏尽在九游网游戏频道\t(http://9Game.CN/Url.Aspx?id=219)", new String[]{"更多", "退出"});
                     } else if (t_1.A) {
                        ca_1.a(var1, "更多精彩游戏尽在http://g.uc.cn", new String[]{"更多", "退出"});
                     } else {
                        if (!t_1.C) {
                           ca_1.a(var1, "更多精彩游戏尽在一哥哥网游戏频道\t(3g.01234.com.cn)", new String[]{"更多", "退出"});
                           return;
                        }

                        ca_1.a(var1, "更多精彩游戏尽在http://haxiang.cn", new String[]{"更多", "退出"});
                     }
                     break;
                  case 20:
                     this.c(var1);
                     ca_1.a(var1, aH, new String[]{"下载", "取消"});
               }
            }

            return;
         }
      } catch (Exception var5) {
         ((Throwable)var5).printStackTrace();
      }

   }

   public final void a(Exception var1, byte var2) {
      ((Throwable)var1).printStackTrace();
      if (e != null) {
         e.c = false;
         e.Y = -1;
         ao_1.R();
         if (e.g != null) {
            e.g.l();
         }

         e.j = e.k = 0;
         this.j = this.k = 7;
      }

      bt_1.H = null;
      bt_1.M = null;
      bt_1.I = null;
      bt_1.N = null;
      bt_1.as = -1;
      this.p = false;
      if (var2 == 1) {
         this.b("系统异常<" + var2 + ">");
      }

   }

   public final void b() {
      ((Canvas)this).repaint();
      ((Canvas)this).serviceRepaints();
   }

   public static void a(byte var0, byte var1, byte var2, byte var3, String var4, short var5, short var6, short var7) {
      aN.removeAllElements();
      if (var2 == 5) {
         aN.addElement(a(var0, var1, (byte)1, var3, false, var4));
         aN.addElement(a(var0, var1, (byte)3, var3, false, var4));
         aN.addElement(a(var0, var1, (byte)3, var3, true, var4));
         aN.addElement(a(var0, var1, (byte)0, var3, false, var4));
         aN.addElement(a(var0, var1, (byte)0, var3, true, var4));
         aN.addElement(a(var0, var1, (byte)2, var3, false, var4));
         aN.addElement(a(var0, var1, (byte)2, var3, true, var4));
      } else {
         aN.addElement(a(var0, var1, var2, var3, false, var4));
      }

      for(int var8 = 0; var8 < aN.size(); ++var8) {
         ab.b((String)aN.elementAt(var8), var5, var6, var7);
      }

      aN.removeAllElements();
   }

   public static String a(byte var0, byte var1, byte var2, byte var3, boolean var4) {
      if (t_1.m == 2) {
         var3 = 0;
      }

      return "" + t_1.V[var0] + t_1.W[var1] + var3 + t_1.X[var2] + (var4 ? "4" : "");
   }

   public static String a(byte var0, byte var1, byte var2, byte var3, boolean var4, String var5) {
      if (t_1.m == 2) {
         var3 = 0;
      }

      if (t_1.p) {
         aO.delete(0, aO.length());
         aO.append("");
         aO.append(var5);
         aO.append(t_1.V[var0]);
         aO.append(t_1.W[var1]);
         aO.append(var3);
         aO.append(t_1.X[var2]);
         aO.append(var4 ? "4" : "");
         return aO.toString();
      } else {
         return "" + t_1.V[var0] + t_1.W[var1] + var3 + t_1.X[var2] + (var4 ? "4" : "");
      }
   }

   public final void a(String var1) {
      int var2;
      if ((var2 = t_1.b * 6 / 11) < 110) {
         var2 = 110;
      } else if (var2 > 160) {
         var2 = 160;
      }

      ca_1.a((t_1.b - var2) / 2, t_1.c / 2 + 15, var2, 20, var1);
      this.aP = this.ak;
      this.j = 1;
   }

   public final void b(String var1) {
      if (this.aS != null && this.aS.startsWith("系统异常")) {
         this.t();
      }

      if (var1 != null && var1.startsWith("系统异常")) {
         this.aS = var1;
      }

      if (bt_1.bs == 1 && bt_1.s == 0 && bt_1.eC != null && bt_1.eC.startsWith("队伍成员位置信息不一致")) {
         e.S();
         bt_1.eC = null;
         this.i();
      } else {
         bt_1.eC = var1;
         this.aT = new bw_1(bt_1.eC, (short)(t_1.b - 20));
         if (e == null || e.k != 25) {
            ((Canvas)this).setFullScreenMode(true);
            this.d.b.setCurrent(this);
         }

         this.aQ = this.ak;
         this.aR = true;
         if (this.aT != null) {
            this.aX = 0;
            this.aX = this.aT.a;
            this.aX = this.aX + 20 > t_1.b ? t_1.b : this.aX + 20;
            if (this.aX < t_1.b * 5 / 7) {
               this.aX = t_1.b * 5 / 7;
            }

            this.aV = (t_1.b - this.aX) / 2;
            this.aY = this.aT.a() * t_1.j + 14;
            this.aW = (t_1.c - this.aY) / 2;
         }

         this.j = 2;
         if (t_1.o && this.aj != null) {
            this.aj.e = -1;
            this.aj.f = -1;
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
         e.h((byte)1);
         this.a((String)null);
      }

      this.aS = null;
   }

   public final int a(int var1, int var2) {
      return var1 >= this.aV && var1 <= this.aV + this.aX && var2 >= this.aW && var2 <= this.aW + this.aY ? 0 : 536870912;
   }

   private void a(Graphics var1) {
      if (!u()) {
         ca_1.a(var1, this.aV, this.aW, this.aX, this.aY);
         if (this.aT != null) {
            this.aT.a(var1, t_1.b / 2, this.aW + 7);
         }
      }

   }

   private static boolean u() {
      return bt_1.eC != null && bt_1.eC.equals("数据更新失败:");
   }

   public static void a(String var0, byte var1) {
      av_1.i = var1;
      if (var1 == 2) {
         av_1.b = var0;
      } else {
         av_1.a = var0;
      }
   }

   private void b(String var1, byte var2) {
      a(var1 == null ? (var2 == 2 ? "socket://120.78.151.213:20008" : "http://117.135.138.130:7099") : var1, var2);
      if (t_1.w) {
         this.v();
      } else {
         this.aD = new Form("登陆游戏");
         this.bP = new Command("登陆", 4, 1);
         this.bQ = new Command("返回", 2, 1);
         this.bN = new TextField("帐号:", bt_1.b, 20, 0);
         this.bO = new TextField("密码:", bt_1.c, 20, 65536);
         this.aD.addCommand(this.bP);
         this.aD.addCommand(this.bQ);
         this.aD.append(this.bN);
         this.aD.append(this.bO);
         this.aD.setCommandListener(this);
         this.q.setCurrent(this.aD);
      }

      this.k = this.j = 3;
   }

   private void v() {
      a_MainCanvas var1 = this;
      t_1.w = false;
      if (j("dcn_user_info.db")) {
         try {
            RecordStore var2;
            DataInputStream var3;
            if ((var3 = a(var2 = a("dcn_user_info.db", false))) != null) {
               t_1.w = var3.readBoolean();
               var1.ba = var3.readByte();
               bb_1.k = var3.readBoolean();
               bt_1.b = var3.readUTF();
               bt_1.c = var3.readUTF();
               var3.close();
            }

            if (var2 != null) {
               var2.closeRecordStore();
            }
         } catch (RecordStoreException var4) {
            ((Throwable)var4).printStackTrace();
         } catch (Exception var5) {
            ((Throwable)var5).printStackTrace();
         }
      }

      this.aD = new Form(t_1.w ? "登录当乐通行证" : "登录一哥哥通行证");
      this.bb = new ChoiceGroup((String)null, 1);
      this.bb.append("官方帐号登录", (Image)null);
      this.bb.append("当乐帐号登录", (Image)null);
      this.bc = e(t_1.w ? 1 : 0);
      this.bd = new ChoiceGroup((String)null, 2, new String[]{"记住密码"}, (Image[])null);
      this.bN = new TextField("帐  号:", (String)null, 16, 0);
      this.bO = new TextField("密  码:", (String)null, 16, 65536);
      if (bb_1.k) {
         this.bb.setSelectedIndex(t_1.w ? 1 : 0, true);
         this.bc.setSelectedIndex(this.ba, true);
         this.bd.setSelectedIndex(0, true);
         this.bN.setString(bt_1.b);
         this.bO.setString(bt_1.c);
      }

      this.aD.setItemStateListener(new com.yinhan.kjava.main.d(this));
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

      return new ChoiceGroup("方式", 4, var2, (Image[])null);
   }

   private void w() {
      if (!bv) {
         this.x();
         a_MainCanvas var1 = this;
         this.bj = k("/images/light_0.png");
         this.bk = k("/images/light_1.png");
         int var2 = t_1.b / 9;
         this.bq = new int[8];

         for(int var3 = 0; var3 < var1.bq.length; ++var3) {
            var1.bq[var3] = var2 * (var3 + 1);
         }

         var1.bp = new int[8][5];

         for(int var5 = 0; var5 < var1.bp.length; ++var5) {
            for(int var4 = 0; var4 < var1.bp[var5].length; ++var4) {
               var1.bp[var5] = var1.z();
            }
         }

         if (bl == null) {
            (bl = new bu_1("/", "cartoon")).d();
            if (bl.b() != 0) {
               bm = bl.b("hudie");
               bn = bl.b("hudie_2");
            }
         }

         this.bh = k("/images/" + (t_1.c <= 220 ? "logoTitle_M.png" : "logoTitle_B.png"));
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
      if ("mhxy060".equals(t_1.v)) {
         this.be = k("/jy_logo.png");
      } else {
         this.be = k("/logo.png");
      }

      this.bf = k("/images/loading.png");
      this.al = 0L;
      this.k = this.j = 9;
      this.b();
   }

   private void b(Graphics var1) {
      if (this.al < 260L) {
         this.al = 260L;
      }

      if (this.al >= 260L) {
         var1.setColor(0);
         var1.fillRect(0, 0, t_1.b, t_1.c);
         var1.drawImage(this.be, t_1.b - this.be.getWidth() >> 1, t_1.c - this.be.getHeight() >> 1, 20);
         this.bu = (int)(515L - this.al > 0L ? 515L - this.al : 0L);
         ca_1.a(var1, 0, this.bu, t_1.b - this.be.getWidth() >> 1, t_1.c - this.be.getHeight() >> 1, this.be.getWidth(), this.be.getHeight());
         this.al += 5L;
      }

   }

   public final void c() {
      bz_1.a = 90;
      this.w();
      if (t_1.a == 0) {
         this.bo = new String[]{"进入游戏", "更多游戏", "退出游戏"};
      } else if (t_1.a == 1) {
         this.bo = new String[]{"登陆游戏", "注册游戏", "修改密码"};
      }

      this.c = 0;
      this.bu = 0;
      ca_1.l = 0;
      ca_1.h = 0;
      if (t_1.a != 0) {
         if (am == null && bb_1.m != null) {
            am = bb_1.m;
            an = bb_1.n;
            ao = bb_1.l;
            ap = bb_1.k;
         }

         if (am == null) {
            am = "";
            if ("mhxy011".equals(t_1.v) || "mhxy278".equals(t_1.v)) {
               this.c = 1;
            }
         }

         if (an == null) {
            an = "";
         }

         if (bz_1.b != 72) {
            s();
            i = null;
         }
      } else if (bz_1.c != 162) {
         bz_1.c = 162;
         s();
      }

      bt_1.O();
      this.A();
      this.al = 8L;
      this.bs = 0;
      this.k = this.j = 14;
   }

   private void c(Graphics var1) {
      this.bt = t_1.c <= 240 ? 2 : (t_1.c - this.bh.getHeight() - this.bi.getHeight() * 7) / 3;
      if (this.bg != null) {
         var1.drawImage(this.bg, t_1.b - this.bg.getWidth() >> 1, t_1.c - this.bg.getHeight() >> 1, 20);
      }

      if (this.bh != null) {
         var1.drawImage(this.bh, t_1.b - this.bh.getWidth() >> 1, this.bt, 20);
      }

      if (bm != null) {
         ai_1.a(bm, this.ak);
         f.a(var1, (bc_1)bm, (int[])null, 0, 0, t_1.b - 100, t_1.c - 100, 0, 0);
      }

      if (bn != null) {
         ai_1.a(bn, this.ak);
         f.a(var1, (bc_1)bn, (int[])null, 0, 0, t_1.b - 100, t_1.c - 100, 0, 0);
      }

      var1 = var1;
      this = this;
      if (this.bj != null && this.bk != null && this.bp != null) {
         for(int var2 = 0; var2 < this.bp.length; ++var2) {
            for(int var3 = 0; var3 < this.bp[var2].length; ++var3) {
               if (this.bp[var2][0] >= 0 && this.bp[var2][0] <= t_1.b && this.bp[var2][1] >= 0) {
                  if ((this.br & 1) == 0) {
                     this.bp[var2][0] += ca_1.f(10, 40) % 2 == 0 ? -this.bp[var2][2] : this.bp[var2][2];
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
      (var1 = new int[5])[0] = this.bq[ca_1.f(1, 100) % 8];
      var1[1] = t_1.c + ca_1.f(1, 200);
      var1[2] = 1;
      var1[3] = 1;
      var1[4] = ca_1.f(1, 100) % 2;
      return var1;
   }

   private void d(Graphics var1) {
      this.c(var1);
      ca_1.a(var1, (String)t_1.t, (int)5, t_1.c - 3, 36, 6160358, 335925);
      if (t_1.a == 1) {
         ca_1.a(var1, (String)"退出", (int)(t_1.b - 5), t_1.c - 3, 40, 16777215, 335925);
      }

      for(int var2 = 0; var2 < this.bo.length; ++var2) {
         if (var2 == this.bs) {
            var1.drawImage(this.bi, t_1.b - this.bi.getWidth() >> 1, (this.bt << 1) + this.bh.getHeight() + var2 * this.bi.getHeight(), 20);
         }

         ca_1.a(var1, (String)this.bo[var2], (int)(t_1.b >> 1), (this.bt << 1) + this.bh.getHeight() + var2 * this.bi.getHeight() + (this.bi.getHeight() - t_1.j) / 2, 17, 16777215, 335925);
      }

      if (this.c == 1) {
         ca_1.a(var1, "当前没有账号信息，是否自动注册？", new String[]{"确定", "返回"});
      }

   }

   public final void c(String var1) {
      try {
         this.d.platformRequest(var1);
         this.G();
      } catch (ConnectionNotFoundException var2) {
         ((Throwable)var2).printStackTrace();
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
      this.d.a();
      a_MainCanvas var1 = this;
      if (bt_1.hE != null) {
         this.K();

         for(int var2 = 0; var2 < bt_1.hE.length; ++var2) {
            if (bt_1.hE[var2] == var1.ce && var2 != 0) {
               String var3 = bt_1.hA[var2];
               String var4 = bt_1.hB[var2];
               String var5 = bt_1.hC[var2];
               short var6 = bt_1.hE[var2];
               String var7 = bt_1.hF[var2];

               for(int var8 = var2; var8 > 0; --var8) {
                  bt_1.hA[var8] = bt_1.hA[var8 - 1];
                  bt_1.hB[var8] = bt_1.hB[var8 - 1];
                  bt_1.hC[var8] = bt_1.hC[var8 - 1];
                  bt_1.hE[var8] = bt_1.hE[var8 - 1];
                  bt_1.hF[var8] = bt_1.hF[var8 - 1];
               }

               bt_1.hA[0] = var3;
               bt_1.hB[0] = var4;
               bt_1.hC[0] = var5;
               bt_1.hE[0] = var6;
               bt_1.hF[0] = var7;
            }
         }
      }

      this.aq.b();
      this.aq.a("服务器列表");
      int[] var9 = null;
      if (t_1.a == 1 && bt_1.hx >= 0 && bt_1.hx < bt_1.hA.length) {
         var9 = new int[bt_1.hA.length];

         for(int var10 = 0; var10 < var9.length; ++var10) {
            if (var10 == bt_1.hx) {
               var9[var10] = ca_1.a(0);
            } else {
               var9[var10] = ca_1.a(6);
            }
         }
      }

      this.ar.a((Image[])null, bt_1.hA, (String[])null, bt_1.hF);
      this.ar.a(var9);
      this.aq.a((al)this.ar);
      this.au.a(new String[]{"进入选区", ""});
      this.aq.a((al)this.au);
      this.aq.a(t_1.f, t_1.g, t_1.d, t_1.e);
      this.k = this.j = 4;
      this.c = 0;
      this.a = 0;
      this.b = 0;
   }

   public final void a(int var1) {
      s();
      String var2 = null;
      if (av_1.h == 1) {
         if (bt_1.hB[var1].equals("")) {
            this.b(bt_1.hA[var1] + "繁忙,请选择其他服!");
         } else {
            var2 = bt_1.hB[var1];
            a((String)"http://117.135.138.130:7099", (byte)1);
            bz_1.a = (byte)bt_1.hD[var1];
            bz_1.b = (byte)bt_1.hE[var1];
            this.a(bt_1.hE[var1]);
         }
      } else if (bt_1.hC[var1].equals("")) {
         this.b(bt_1.hA[var1] + "繁忙,请选择其他服!");
      } else {
         a((String)(var2 = bt_1.hC[var1]), (byte)2);
         bz_1.a = (byte)bt_1.hD[var1];
         bz_1.b = (byte)bt_1.hE[var1];
         this.a(bt_1.hE[var1]);
      }

      this.a(var2, "http://117.135.138.130:7099");
      byte[] var3;
      if ((var3 = bz_1.a((short)4096, bt_1.hy, bt_1.hz, t_1.v, bt_1.hw)) != null) {
         w var4;
         (var4 = new w((short)4096, var3)).a = true;
         i.a(var4);
         this.aZ = false;
         this.a((String)null);
      } else {
         this.b("获取上传指令数据错误!");
      }
   }

   private void e(Graphics var1) {
      if (t_1.a != 1 || t_1.w || !bt_1.hw) {
         this.c(var1);
         if (this.aq != null) {
            this.aq.a(var1);
         }

         if (this.c == 2) {
            this.a(var1);
         }

      }
   }

   public final void e() {
      if (bt_1.m != null && bt_1.m.length() > 0) {
         this.h(bt_1.m);
      } else {
         if (bt_1.W != null) {
            this.h(bt_1.W[(this.bA << 1) + this.bz]);
         }

      }
   }

   public final void f() {
      if (bt_1.m != null && bt_1.m.length() > 0) {
         this.i(bt_1.m);
      } else {
         if (e == null && bt_1.W != null) {
            this.i(bt_1.W[(this.bA << 1) + this.bz]);
         }

      }
   }

   private void A() {
      if (e != null) {
         e.b();
         e = null;
         if (t_1.o && this.aj != null) {
            Object var1 = null;
            this.aj.a = (ao_1)var1;
         }
      }

   }

   public final bc_1 a(bc_1 var1, byte var2, byte var3, byte var4, byte var5, boolean var6) {
      byte var10000 = var2;
      var2 = 3;
      byte var7 = var10000;
      t_1.ag.delete(0, t_1.ag.length());
      t_1.ag.append("com.cc.f").append(t_1.V[var7]).append(t_1.W[var3]).append(var5).append(t_1.X[var2]).append(var6 ? 1 : 2);
      String var8 = t_1.ag.toString();
      ab.d(var8);
      if ((var1 = ab.b(var8)) != null) {
         var1 = var1.b();
      }

      return var1;
   }

   public final void b(int var1) {
      this.w();
      this.bC = new int[6][4];
      ca_1.l = 0;
      ca_1.h = 0;
      ca_1.o = 0;
      this.c = 0;
      this.a = 0;
      this.b = 0;
      bt_1.O();
      this.A();
      if (var1 <= 0 && this.k != 6) {
         this.bx = null;
         this.by = null;
         this.bB = 45;
         this.C();
      } else {
         this.bx = new bc_1[var1];
         this.by = new bc_1[var1];

         for(int var2 = 0; var2 < var1; ++var2) {
            this.bx[var2] = this.a(this.bx[var2], bt_1.Z[var2], bt_1.Y[var2], (byte)3, (byte)1, false);
            this.by[var2] = this.a(this.by[var2], bt_1.Z[var2], bt_1.Y[var2], (byte)3, (byte)1, true);
         }

         this.bB = 55;
         this.bz = 0;
         this.bA = 0;
         this.aq.b();
         this.aq.a("角色列表");
         this.aq.a((this.bB << 1) + 6);
         this.at.b(this.f(0), t_1.i, (byte)1);
         this.at.a((byte)1);
         this.aq.a((al)this.at);
         if (t_1.c > 220) {
            this.au.a(new String[]{"进入游戏", ""});
            this.aq.a((al)this.au);
         }

         this.aq.a(t_1.f, t_1.g, t_1.d, t_1.e);
         this.w();
         this.k = this.j = 5;
      }
   }

   private String f(int var1) {
      if (bt_1.aa != null && var1 < bt_1.aa.length) {
         t_1.a(this.l);
         this.l.append("昵称：" + bt_1.aa[var1] + '\t');
         if (t_1.a == 0) {
            this.l.append("ID：" + bt_1.W[var1] + '\t');
         }

         this.l.append("等级：" + bt_1.X[var1] + '\t');
         this.au.a(new String[]{"进入游戏", ""});
         return this.l.toString();
      } else {
         this.au.a(new String[]{"创 建", ""});
         return "创建角色";
      }
   }

   private void B() {
      if (this.c == 0) {
         if (this.aq != null) {
            this.aq.b(this.a);
         }

         if (this.a != 1 && this.a != 514) {
            if (this.a != 4 && this.a != 520) {
               if (this.a != 8 && this.a != 516) {
                  if (this.a != 2 && this.a != 518) {
                     if (this.a == 268435456) {
                        if (bt_1.W != null && (this.bA << 1) + this.bz < bt_1.W.length) {
                           this.g(bt_1.W[(this.bA << 1) + this.bz]);
                        } else {
                           this.C();
                        }
                     } else if (this.a != 1073741824 && this.a != 517) {
                        if (this.a == 536870912) {
                           this.c();
                        }
                     } else if (bt_1.W != null && (this.bA << 1) + this.bz < bt_1.W.length) {
                        if (bt_1.W.length >= 4) {
                           String[] var1 = new String[]{"进入", "删除"};
                           ca_1.a(this.bC[(this.bA << 1) + this.bz][0] + this.bB / 2, this.bC[(this.bA << 1) + this.bz][1] + this.bB / 2, var1, false);
                           this.c = 1;
                        } else {
                           this.g(bt_1.W[(this.bA << 1) + this.bz]);
                        }
                     } else {
                        this.C();
                     }
                  } else {
                     this.bz = (byte)(this.bz >= 1 ? 0 : this.bz + 1);
                     this.at.b(this.f((this.bA << 1) + this.bz), t_1.i, (byte)1);
                  }
               } else {
                  this.bz = (byte)(this.bz <= 0 ? 1 : this.bz - 1);
                  this.at.b(this.f((this.bA << 1) + this.bz), t_1.i, (byte)1);
               }
            } else {
               this.bA = (byte)(this.bA >= 1 ? 0 : this.bA + 1);
               this.at.b(this.f((this.bA << 1) + this.bz), t_1.i, (byte)1);
            }
         } else {
            this.bA = (byte)(this.bA <= 0 ? 1 : this.bA - 1);
            this.at.b(this.f((this.bA << 1) + this.bz), t_1.i, (byte)1);
         }

         if (this.bx != null) {
            for(int var2 = 0; var2 < this.bx.length; ++var2) {
               ai_1.a(this.bx[var2], this.ak);
            }
         }

         if (this.by != null) {
            for(int var3 = 0; var3 < this.by.length; ++var3) {
               ai_1.a(this.by[var3], this.ak);
            }
         }

         this.a = 0;
      } else if (this.c != 1) {
         if (this.c == 2) {
            if (this.a == 268435456) {
               this.a((String)"输入“OK” 删除角色", (int)0);
               this.c = 0;
            } else if (this.a == 536870912) {
               this.c = 1;
            }

            this.a = 0;
         }

      } else {
         ca_1.b(this.a);
         if (this.a != 268435456 && this.a != 1073741824 && this.a != 517) {
            if (this.a == 536870912) {
               this.b(bt_1.W.length);
               this.c = 0;
            }
         } else if (ca_1.o == 0) {
            this.g(bt_1.W[(this.bA << 1) + this.bz]);
         } else if (ca_1.o == 1) {
            this.aw = (this.bA << 1) + this.bz;
            this.c = 2;
         }

         this.a = 0;
      }
   }

   private void a(int var1, int var2, int var3, int var4, int var5) {
      if (this.bC != null && this.bC.length > var1) {
         this.bC[var1][0] = var2;
         this.bC[var1][1] = var3;
         this.bC[var1][2] = var4;
         this.bC[var1][3] = var5;
      }

   }

   private void f(Graphics var1) {
      this.c(var1);
      if (this.aq != null) {
         this.aq.a(var1);
         ca_1.a(var1, this.aq.a + 5, this.aq.b + 32, this.aq.c - 11, this.aq.a((this.bB << 1) + 6), 1);
         int var2 = (this.aq.c - (this.bB << 1) - 16) / 3;
         int var3 = (this.aq.a(t_1.e <= 240 ? (this.bB << 1) + 6 : 111) - (this.bB << 1) - 6) / 3;

         for(int var4 = 0; var4 < 2; ++var4) {
            for(int var5 = 0; var5 < 2; ++var5) {
               this.a((var4 << 1) + var5, this.aq.a + 8 + var2 + (var2 + this.bB) * var5, this.aq.b + 35 + var3 + (var3 + this.bB) * var4, this.bB, this.bB);
               ca_1.a(var1, (Image)null, this.bC[(var4 << 1) + var5][0], this.bC[(var4 << 1) + var5][1], this.bB, this.bB, var4 == this.bA && var5 == this.bz);
            }
         }

         if (this.bx != null && bt_1.aa != null && bt_1.aa.length > 0) {
            for(int var6 = 0; var6 < bt_1.aa.length; ++var6) {
               if (this.bx[var6] != null && var6 == (this.bA << 1) + this.bz) {
                  if (bt_1.Z[var6] == 0) {
                     if (bt_1.Y[var6] == 0) {
                        f.a(var1, (bc_1)this.bx[var6], (int[])null, 0, 0, this.bC[var6][0] + 40 + 6, this.bC[var6][1] + 45 + 1, 20, 0);
                     } else {
                        f.a(var1, (bc_1)this.bx[var6], (int[])null, 0, 0, this.bC[var6][0] + 40 + 9, this.bC[var6][1] + 45 + 16, 20, 0);
                     }
                  } else if (bt_1.Z[var6] == 1) {
                     if (bt_1.Y[var6] == 0) {
                        f.a(var1, (bc_1)this.bx[var6], (int[])null, 0, 0, this.bC[var6][0] + 40 + 8, this.bC[var6][1] + 45 + 14, 20, 0);
                     } else {
                        f.a(var1, (bc_1)this.bx[var6], (int[])null, 0, 0, this.bC[var6][0] + 40 - 1, this.bC[var6][1] + 45 + 9, 20, 0);
                     }
                  } else if (bt_1.Y[var6] == 0) {
                     f.a(var1, (bc_1)this.bx[var6], (int[])null, 0, 0, this.bC[var6][0] + 40 - 9, this.bC[var6][1] + 45 + 10, 20, 0);
                  } else {
                     f.a(var1, (bc_1)this.bx[var6], (int[])null, 0, 0, this.bC[var6][0] + 40 - 3, this.bC[var6][1] + 45 + 12, 20, 0);
                  }
               } else if (this.by != null && var6 != (this.bA << 1) + this.bz) {
                  f.a(var1, (bc_1)this.by[var6], (int[])null, 0, 0, this.bC[var6][0] + 40 - 18, this.bC[var6][1] + 45, 20, 0);
               }
            }
         }
      }

      if (this.c == 1) {
         ca_1.c(var1);
      } else {
         if (this.c == 2) {
            ca_1.a(var1, "确认删除？", new String[]{"确认", "返回"});
         }

      }
   }

   private void g(String var1) {
      byte[] var2;
      if ((var2 = bz_1.c((short)4250, var1)) != null) {
         w var3 = new w((short)4250, var2);
         i.a(var3);
         this.a((String)null);
      } else {
         this.b("获取上传指令数据错误!");
      }
   }

   private void h(String var1) {
      byte[] var2;
      if ((var2 = bz_1.c((short)4251, var1)) != null) {
         w var3 = new w((short)4251, var2);
         i.a(var3);
         this.a((String)null);
      } else {
         this.b("获取上传指令数据错误!");
      }
   }

   private void i(String var1) {
      bt_1.gQ = 1;
      byte[] var2;
      if ((var2 = bz_1.b((short)4103, var1)) != null) {
         w var3 = new w((short)4103, var2);
         i.a(var3);
         this.a((String)null);
      } else {
         this.b("获取上传指令数据错误!");
      }
   }

   private void C() {
      this.w();
      this.bD = k("/images/logo_btn_random.png");
      this.bx = new bc_1[6];

      for(int var1 = 0; var1 < this.bx.length; ++var1) {
         this.bx[var1] = this.a(this.bx[var1], (byte)(var1 % 3), (byte)(var1 < 3 ? 0 : 1), (byte)3, (byte)1, false);
      }

      this.bB = 35;
      this.bG = 0;
      this.bE = 0;
      this.bF = 0;
      this.aq.b();
      this.aq.a("创建角色");
      this.aq.a(t_1.e <= 240 ? this.bB * 3 + 6 : 150);
      this.at.b(t_1.H[0], t_1.i, (byte)1);
      this.at.a((byte)1);
      this.au.a(new String[]{"创 建", ""});
      this.aq.a((al)this.at);
      if (t_1.c > 220) {
         this.aq.a((al)this.au);
      }

      this.aq.a(t_1.f, t_1.g, t_1.d, t_1.e);
      this.a = 0;
      this.b = 0;
      this.k = this.j = 6;
   }

   public final void b(String var1, String var2) {
      this.D();
      if (var1 != null) {
         this.bS = new StringItem(var1, var2);
      }

      this.aD = new Form("角色昵称");
      this.aC = new TextField("角色昵称", (String)null, 5, 0);
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
      if (this.aj != null) {
         ao_1 var2 = e;
         this.aj.a = var2;
      }

      e.c("欢迎来到<梦回西游>世界");
      this.k = this.j = 7;
   }

   public final void h() {
      bt_1.e();
      t_1.a(this.l);
      if (this.bx != null) {
         for(int var1 = 0; var1 < this.bx.length; ++var1) {
            if (this.bx[var1] != null) {
               this.bx[var1] = null;
            }
         }

         this.bx = null;
      }

      if (this.by != null) {
         for(int var2 = 0; var2 < this.by.length; ++var2) {
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
         } else if (var1 == 2 && ca_1.o == 1) {
            e.M.q(1);
         }
      } else if (e.k == 70 && !bt_1.kT) {
         if (bt_1.kP == 2) {
            var1 = (byte)e.aq;
            byte var2 = (byte)e.ar;
            e.e(e.as);
            e.aq = var1;
            e.ar = var2;
            e.q();
         }

         if (bt_1.kP == 0 || bt_1.kP == 1) {
            e.m();
         }

         if (bt_1.kP == 3) {
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

      this.k = this.j = 7;
   }

   private void E() {
      try {
         if (e != null) {
            e.a();
            if (e.k != 0) {
               this.a = 0;
            }

         }
      } catch (Exception var2) {
         ((Throwable)var2).printStackTrace();
         this.a((Exception)var2, (byte)4);
      }
   }

   private void F() {
      if (bt_1.b != null && bt_1.c != null) {
         ByteArrayOutputStream var1 = new ByteArrayOutputStream();
         DataOutputStream var2 = new DataOutputStream(var1);

         try {
            var2.writeUTF(bt_1.b == null ? "" : bt_1.b);
            var2.writeUTF(bt_1.c == null ? "" : bt_1.c);
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
         for(int var3 = 0; var3 < ao_1.aW.length; ++var3) {
            if (var3 != 15) {
               var2.writeByte(ao_1.aW[var3]);
            }
         }

         this.a(var1.toByteArray(), bt_1.ad);
         var1.close();
         var2.close();
      } catch (IOException var4) {
      }
   }

   public final void k() {
      if (j(bt_1.ad)) {
         RecordStore var15 = null;

         try {
            DataInputStream var1 = a(var15 = a(bt_1.ad, false));

            for(int var2 = 0; var2 < ao_1.aW.length; ++var2) {
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

   private static DataInputStream a(RecordStore var0) {
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
         for(int var2 = var1.length - 1; var2 >= 0; --var2) {
            if (var1[var2].equals(var0)) {
               return true;
            }
         }

         return false;
      }
   }

   private static RecordStore a(String var0, boolean var1) {
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

      label97: {
         try {
            var12 = true;
            (var21 = a(var2, var3)).addRecord(var1, 0, var1.length);
            var12 = false;
            break label97;
         } catch (RecordStoreException var19) {
            ((Throwable)var19).printStackTrace();
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

   protected final void keyPressed(int var1) {
      int var10001 = this.a;
      int var4 = 0;
      switch (var1) {
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
            switch (((Canvas)this).getGameAction(var1)) {
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

      this.a = var10001 | var4;
      if (this.bI == this.a && System.currentTimeMillis() - this.bJ <= 600L) {
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

         this.bI = this.a;
      }

      this.bJ = System.currentTimeMillis();
      var10001 = this.b;
      var4 = 0;
      label58:
      switch (((Canvas)this).getGameAction(var1)) {
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
            switch (var1) {
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
      this.aA = 0;
   }

   protected final void keyReleased(int var1) {
      this.a = 0;
      this.b = 0;
      this.aA = 0;
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
         this.aC = new TextField(var1, (String)null, 9, var2);
      } else if (var1.equals("聊天")) {
         if (e.k == 18) {
            if (e.aR) {
               this.aC = new TextField("与" + e.aQ + "私聊", (String)null, 30, var2);
            } else {
               this.aC = new TextField(t_1.E[e.aT], (String)null, 30, var2);
            }
         } else if (e.k == 7) {
            if (this.as.a < 3) {
               this.aC = new TextField("与" + bt_1.gJ[this.ar.g()] + "私聊", (String)null, 30, var2);
            } else if (bt_1.bs == 1) {
               if (ca_1.o == 3) {
                  this.aC = new TextField("群聊", (String)null, 30, var2);
               } else if (ca_1.o == 4) {
                  this.aC = new TextField("与" + bt_1.q[this.ar.g()].e + "私聊", (String)null, 30, var2);
               }
            } else if (bt_1.bs == 0) {
               if (ca_1.o == 0) {
                  this.aC = new TextField("群聊", (String)null, 30, var2);
               } else if (ca_1.o == 1) {
                  this.aC = new TextField("与" + bt_1.q[this.ar.g()].e + "私聊", (String)null, 30, var2);
               }
            }
         } else if (e.k == 19) {
            this.aC = new TextField("与" + bt_1.dL[this.ar.g() - 1] + "私聊", (String)null, 30, var2);
         } else if (e.k == 47) {
            this.aC = new TextField("与" + bt_1.iz[this.ar.g()] + "私聊", (String)null, 30, var2);
         } else {
            this.aC = new TextField("聊天", (String)null, 30, var2);
         }
      } else if (!var1.equals("输入帮派宗旨") && !var1.equals("输入帮派新宗旨") && !var1.equals("输入公告")) {
         if (var1.equals("输入帮派名称")) {
            this.aC = new TextField(var1, (String)null, 6, var2);
         } else if (var1.equals("请输入要搜索的帮派名称")) {
            this.aC = new TextField(var1, (String)null, 6, var2);
         } else if (var1.equals("请输入警告语（30个字符内）")) {
            this.aC = new TextField(var1, (String)null, 30, var2);
         } else if (var1.equals("输入兑换码")) {
            this.aC = new TextField(var1, (String)null, 30, var2);
         } else {
            this.aC = new TextField(var1, (String)null, 5, var2);
         }
      } else {
         this.aC = new TextField(var1, (String)null, 100, var2);
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
      this.bX = new ChoiceGroup("类型: ", 1, .ag.a, (Image[])null);
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

   public final void a(byte var1, String var2, String var3, String var4, String var5, String var6, String var7) {
      this.bY = 0;
      bt_1.O.q = var6;
      bt_1.O.r = var7;
      var1 = var2.equals("回复邮件");
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
         this.bT = new StringItem((String)null, "★官方与玩家联系使用系统邮件形式，慎访私人邮件冒用官方名义行骗。");
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
      this.aE = new ChoiceGroup("", 1, new String[]{"世界聊", "区域聊", "队伍聊", "帮派聊", "跨服聊"}, (Image[])null);
      this.aE.setSelectedIndex(1, true);
      this.aC = new TextField(var1, (String)null, 30, 0);
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
                     this.a = 0;
                     this.b = 0;
                     this.d.a();
                  }

                  return;
               }

               if (!this.bN.getString().equals("") && !this.bO.getString().equals("")) {
                  this.aZ = true;
                  this.d.a();
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
                     this.a = 0;
                     this.b = 0;
                     this.d.a();
                  }

                  return;
               }

               if (!this.aC.getString().equals("")) {
                  this.ay = this.aC.getString().trim();
                  this.D();
                  this.d.a();
               } else {
                  this.b("昵称不能为空！");
               }
            } else if (var51.equals("聊天")) {
               String var48;
               if ((var48 = var1.getLabel()).equals("确定")) {
                  if (this.aC.getString() == null || this.aC.getString().equals("")) {
                     this.d.a();
                     this.b("不能发送空消息");
                     return;
                  }

                  if (e.j == 1) {
                     e.j = e.k = 0;
                  } else {
                     e.k = e.j;
                  }

                  this.a = 0;
                  this.b = 0;
                  this.d.a();
                  if (e.k == 0) {
                     f.a(e.f, ao_1.h, ao_1.i, true, false, 1009050);
                  }

                  this.g = true;
               } else {
                  if (!var48.equals("返回")) {
                     if (var48.equals("表情")) {
                        e.L();
                        this.d.a();
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

                  this.a = 0;
                  this.b = 0;
                  this.d.a();
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
                     this.a = 0;
                     this.b = 0;
                     this.d.a();
                  }

                  return;
               }

               e.aU = this.ar.g();
               e.aK = var78;
               e.aL = "";
               e.aM = 1;
               e.aN = 0;
               e.a(e.aK, e.aL, e.aM, e.aN);
               this.d.a();
               this.a((String)null);
            } else if (var51.equals("宠物关键字搜索")) {
               String var46 = var1.getLabel();
               String var77 = this.aC.getString();
               if (!var46.equals("确定") || var77 == null) {
                  if (var46.equals("返回")) {
                     this.aD = null;
                     this.aC = null;
                     this.a = 0;
                     this.b = 0;
                     this.d.a();
                  }

                  return;
               }

               e.aU = this.ar.g();
               e.aK = var77;
               e.aL = "";
               e.aM = 1;
               e.aN = 0;
               e.b(e.aK, e.aL, e.aM, e.aN);
               this.d.a();
               this.a((String)null);
            } else if (var51.equals("宠物名称")) {
               String var45 = var1.getLabel();
               String var76 = this.aC.getString();
               if (!var45.equals("更改") || var76 == null) {
                  if (var45.equals("返回")) {
                     this.d.a();
                     this.m();
                  }

                  return;
               }

               if (var76.length() == 0) {
                  this.b("名称为空！");
               } else {
                  this.h = true;
                  this.d.a();
               }
            } else if (var51.equals("服务地址")) {
               String var44;
               if (!(var44 = var1.getLabel()).equals("确定")) {
                  if (var44.equals("返回")) {
                     this.H();
                     this.y();
                     this.d.a();
                     this.a = 0;
                     this.b = 0;
                  }

                  return;
               }

               String var75 = this.aC.getString();
               int var88 = this.bX.getSelectedIndex();
               this.H();
               this.b(var75, (byte)(var88 == 1 ? 1 : 2));
            } else if (!var51.equals("请输入拍卖价格") && !var51.equals("请输入取出银两") && !var51.equals("请输入存入银两") && !var51.equals("拍卖价格") && !var51.equals("输入交易银两") && !var51.equals("请输入决斗金额") && !var51.equals("捐献银两数量") && !var51.equals("取出银两数量") && !var51.equals("捐献经验数量") && !var51.equals("请输入决斗金额") && !var51.equals("请输入竞标银两")) {
               if (var51.equals("输入帮派名称")) {
                  String var43 = var1.getLabel();
                  String var74 = this.aC.getString();
                  if (!var43.equals("确定") || var74 == null) {
                     if (var43.equals("返回")) {
                        Object var56 = null;
                        e.M.c = (String)var56;
                        this.I();
                        this.d.a();
                     }

                     return;
                  }

                  if (var74.length() == 0) {
                     this.b("名字输入错误！");
                  } else {
                     e.M.c = var74;
                     this.I();
                     this.a((String)"输入帮派宗旨", (int)0);
                  }
               } else if (var51.equals("输入帮派宗旨")) {
                  String var41 = var1.getLabel();
                  String var73 = this.aC.getString();
                  if (!var41.equals("确定") || var73 == null) {
                     if (var41.equals("返回")) {
                        Object var54 = null;
                        e.M.c = (String)var54;
                        var54 = null;
                        e.M.d = (String)var54;
                        this.I();
                        this.d.a();
                     }

                     return;
                  }

                  if (var73.length() == 0) {
                     this.b("请输入帮派宗旨！");
                  } else {
                     e.M.d = var73;
                     this.I();
                     .aq var42;
                     if ((var42 = e.M).c != null && var42.d != null) {
                        byte[] var87;
                        if ((var87 = bz_1.b((short)4197, bt_1.ad, var42.c, var42.d)) != null) {
                           w var92 = new w((short)4197, var87);
                           i.a(var92);
                        } else {
                           var42.a.e.b("获取上传指令数据错误!");
                        }

                        var42.a.e.a((String)null);
                     }

                     this.d.a();
                  }
               } else if (var51.equals("输入帮派新宗旨")) {
                  String var39 = var1.getLabel();
                  String var72 = this.aC.getString();
                  if (!var39.equals("确定") || var72 == null) {
                     if (var39.equals("返回")) {
                        Object var53 = null;
                        e.M.e = (String)var53;
                        this.I();
                        this.d.a();
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
                        if ((var86 = bz_1.i((short)4216, bt_1.ad, var40.e)) != null) {
                           w var91 = new w((short)4216, var86);
                           i.a(var91);
                        } else {
                           var40.b.b("获取上传指令数据错误!");
                        }

                        var40.b.a((String)null);
                     }

                     this.d.a();
                  }
               } else if (var51.equals("输入玩家名称")) {
                  String var38 = var1.getLabel();
                  String var71 = this.aC.getString();
                  if (!var38.equals("确定") || var71 == null) {
                     if (var38.equals("返回")) {
                        this.d.a();
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
                     this.d.a();
                  }
               } else if (var51.equals("输入招募金额")) {
                  String var37;
                  if (!(var37 = var1.getLabel()).equals("确定")) {
                     if (var37.equals("返回")) {
                        this.aD = null;
                        this.aC = null;
                        this.d.a();
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
                     this.d.a();
                  } else {
                     this.b("输入有误,请重新输入");
                  }
               } else if (var51.equals("请输入贡献金额")) {
                  String var36;
                  if (!(var36 = var1.getLabel()).equals("确定")) {
                     if (var36.equals("返回")) {
                        this.aD = null;
                        this.aC = null;
                        this.d.a();
                     }

                     return;
                  }

                  if (this.aC.getString() != "") {
                     e.o();
                     e.ak.append(this.aC.getString());
                     if (e.n() >= 0L) {
                        if (e.n() > bt_1.ap) {
                           this.b("您没有这么多银两,请重新输入！");
                        } else {
                           e.M.k[0] = (int)(e.M.j = e.n());
                           this.d.a();
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
                        this.d.a();
                     }

                     return;
                  }

                  if (this.aC.getString() != "") {
                     e.o();
                     e.ak.append(this.aC.getString());
                     if (e.n() >= 0L) {
                        if (e.n() > (long)bt_1.iM[1]) {
                           this.b("最多只能配置" + bt_1.a((long)bt_1.iM[1]) + ",请重新输入！");
                        } else {
                           e.M.i[1] = bt_1.iM[0] = (int)e.n();
                           this.d.a();
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
                        this.d.a();
                     }

                     return;
                  }

                  if (this.aC.getString() != "") {
                     e.o();
                     e.ak.append(this.aC.getString());
                     if (e.n() >= 0L) {
                        if (e.n() > (long)bt_1.iK[1]) {
                           this.b("最多只能配置" + bt_1.iK[1] + "%,请重新输入！");
                        } else {
                           e.M.i[0] = bt_1.iK[0] = (byte)((int)e.n());
                           this.d.a();
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
                        this.d.a();
                     }

                     return;
                  }

                  if (this.aC.getString() != "") {
                     e.o();
                     e.ak.append(this.aC.getString());
                     if (e.n() >= 0L) {
                        if (e.n() > (long)bt_1.iL[1]) {
                           this.b("最多只能配置" + bt_1.iL[1] + "%,请重新输入！");
                        } else {
                           e.M.i[2] = bt_1.iL[0] = (byte)((int)e.n());
                           this.d.a();
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
                        e.M.h = (String)var52;
                        this.I();
                        this.d.a();
                     }

                     return;
                  }

                  if (var70.length() == 0) {
                     this.b("请输入公告！");
                  } else {
                     e.M.h = var70;
                     this.I();
                     .aq var32 = e.M;
                     byte[] var85;
                     if ((var85 = bz_1.n((short)4218, bt_1.ad, var32.h)) != null) {
                        i.a(new w((short)4218, var85));
                        var32.b.a((String)null);
                     } else {
                        var32.b.b("获取上传指令数据错误!");
                     }

                     this.d.a();
                  }
               } else if (var51.equals("输入“OK” 删除角色")) {
                  String var30 = var1.getLabel();
                  String var69 = this.aC.getString();
                  if (!var30.equals("确定") || var69 == null) {
                     if (var30.equals("返回")) {
                        this.aD = null;
                        this.d.a();
                     }

                     return;
                  }

                  if (var69.equals("OK")) {
                     byte[] var84;
                     if ((var84 = bz_1.a((short)4100, bt_1.W[this.aw])) != null) {
                        i.a(new w((short)4100, var84));
                        this.a((String)null);
                     } else {
                        this.b("获取上传指令数据错误!");
                     }

                     this.d.a();
                  } else {
                     this.b("请输入“OK” ！");
                  }
               } else if (var51.equals("请输入好友昵称")) {
                  String var29;
                  if (!(var29 = var1.getLabel()).equals("确定")) {
                     if (var29.equals("返回")) {
                        this.aD = null;
                        this.aC = null;
                        this.a = 0;
                        this.b = 0;
                        this.d.a();
                     }

                     return;
                  }

                  if (this.aC.getString().equals("")) {
                     this.b("昵称不能为空！");
                  } else {
                     e.a(this.aC.getString(), true);
                     this.a = 0;
                     this.b = 0;
                     this.d.a();
                  }
               } else if (var51.equals("重要物品输入OK丢弃")) {
                  String var28 = var1.getLabel();
                  String var68 = this.aC.getString();
                  if (!var28.equals("确定") || var68 == null) {
                     if (var28.equals("返回")) {
                        this.aD = null;
                        this.aC = null;
                        this.a = 0;
                        this.b = 0;
                        this.d.a();
                     }

                     return;
                  }

                  if (var68.equals("OK")) {
                     e.f(e.ag);
                     this.a = 0;
                     this.b = 0;
                     this.d.a();
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
                        this.a = 0;
                        this.b = 0;
                        e.l = 0;
                        this.d.a();
                     }

                     return;
                  }

                  if (var67.equals("OK")) {
                     .aq var27 = e.M;
                     byte[] var83;
                     if ((var83 = bz_1.n((short)4214, bt_1.ad)) != null) {
                        i.a(new w((short)4214, var83));
                        var27.b.a((String)null);
                     } else {
                        var27.b.b("获取上传指令数据错误!");
                     }

                     this.a = 0;
                     this.b = 0;
                     this.d.a();
                  } else {
                     this.b("如需要解散帮派，请输入“OK”！");
                  }
               } else if (var51.equals("请输入要搜索的帮派名称")) {
                  String var25 = var1.getLabel();
                  String var66 = this.aC.getString();
                  if (!var25.equals("确定") || var66 == null) {
                     if (var25.equals("返回")) {
                        this.I();
                        this.a = 0;
                        this.b = 0;
                        this.d.a();
                     }

                     return;
                  }

                  bt_1.gQ = 1;
                  if (var66.length() == 0) {
                     e.M.o = "";
                     e.M.a(e.M.o);
                  } else {
                     e.M.o = var66;
                     e.M.a(e.M.o);
                  }

                  this.I();
                  this.a = 0;
                  this.b = 0;
                  this.d.a();
               } else if (var51.equals("输入OK确认宣战")) {
                  String var24 = var1.getLabel();
                  String var65 = this.aC.getString();
                  if (!var24.equals("确定") || var65 == null) {
                     if (var24.equals("返回")) {
                        this.aD = null;
                        this.aC = null;
                        this.a = 0;
                        this.b = 0;
                        e.l = 0;
                        this.d.a();
                     }

                     return;
                  }

                  if (var65.equals("OK")) {
                     e.M.a((byte)3, bt_1.jY[this.ar.g() - 1]);
                     this.a = 0;
                     this.b = 0;
                     this.d.a();
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
                        this.a = 0;
                        this.b = 0;
                        this.d.a();
                     }

                     return;
                  }

                  if (var64.equals("OK")) {
                     e.m(e.ag);
                     this.a = 0;
                     this.b = 0;
                     this.d.a();
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
                        this.a = 0;
                        this.b = 0;
                        this.d.a();
                     }

                     return;
                  }

                  e.M.b((byte)0, var63);
                  this.a = 0;
                  this.b = 0;
                  this.d.a();
               } else if (var51.equals("输入OK确定遗忘宠物技能")) {
                  String var21 = var1.getLabel();
                  String var62 = this.aC.getString();
                  if (!var21.equals("确定") || var62 == null) {
                     if (var21.equals("返回")) {
                        this.aD = null;
                        this.aC = null;
                        this.a = 0;
                        this.b = 0;
                        this.d.a();
                     }

                     return;
                  }

                  if (var62.equals("OK")) {
                     e.y();
                     this.a = 0;
                     this.b = 0;
                     this.d.a();
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
                        this.a = 0;
                        this.b = 0;
                        this.d.a();
                     }

                     return;
                  }

                  if (!var61.equals("") && !var82.equals("") && !var89.equals("")) {
                     e.o();
                     e.ak.append(var89);
                     long var96;
                     if ((var96 = e.n()) > 0L) {
                        e.S.a(var61, var82, var96);
                        this.a = 0;
                        this.b = 0;
                        this.d.a();
                        return;
                     }

                     Alert var20;
                     (var20 = new Alert("银两输入有误", "请重新输入银两！", (Image)null, AlertType.ERROR)).setTimeout(-2);
                     this.q.setCurrent(var20);
                  } else if (var61.equals("")) {
                     Alert var93;
                     (var93 = new Alert("昵称为空", "请输入求爱人昵称！", (Image)null, AlertType.ERROR)).setTimeout(-2);
                     this.q.setCurrent(var93);
                  } else if (var82.equals("")) {
                     Alert var94;
                     (var94 = new Alert("求爱宣言为空", "请输入求爱宣言！", (Image)null, AlertType.ERROR)).setTimeout(-2);
                     this.q.setCurrent(var94);
                  } else {
                     if (!var89.equals("")) {
                        return;
                     }

                     Alert var95;
                     (var95 = new Alert("银两为空", "请输入银两！", (Image)null, AlertType.ERROR)).setTimeout(-2);
                     this.q.setCurrent(var95);
                  }
               } else if (var51.equals("输入OK确定离婚")) {
                  String var18 = var1.getLabel();
                  String var60 = this.aC.getString();
                  if (!var18.equals("确定") || var60 == null) {
                     if (var18.equals("返回")) {
                        this.aD = null;
                        this.d.a();
                     }

                     return;
                  }

                  if (var60.equals("OK")) {
                     if (.v.e == 1) {
                        return;
                     }

                     e.S.b((byte)1);
                  } else {
                     this.b("请输入“OK” ！");
                  }
               } else if (var51.equals("输入兑换码")) {
                  String var17 = var1.getLabel();
                  String var59 = this.aC.getString();
                  if (!var17.equals("确定") || var59 == null) {
                     if (var17.equals("返回")) {
                        this.aD = null;
                        this.d.a();
                     }

                     return;
                  }

                  byte[] var81;
                  if ((var81 = bz_1.q((short)4880, bt_1.ad, this.aC.getString())) != null) {
                     i.a(new w((short)4880, var81));
                     this.a((String)null);
                     return;
                  }

                  this.b("获取上传指令数据错误!");
               } else if (!var51.equals("发送邮件") && !var51.equals("回复邮件")) {
                  if (var51.equals("选择收件人")) {
                     if (var1.getLabel().equals("确定")) {
                        bt_1.O.o = bt_1.O.s[this.bX.getSelectedIndex()];
                        bt_1.O.r = bt_1.O.t[this.bX.getSelectedIndex()];
                     }

                     this.a((byte)0, bt_1.O.m, bt_1.O.n, bt_1.O.o, bt_1.O.p == null ? "" : bt_1.O.p, bt_1.O.q, bt_1.O.r);
                     return;
                  }

                  if (var51.equals("邮件举报")) {
                     if (var1.getLabel().equals("举报")) {
                        e.a(this.bW, this.aC.getString().trim(), bt_1.O.d);
                        this.d.a();
                        return;
                     }

                     this.aD = null;
                     this.d.a();
                     return;
                  }

                  if (var51.equals("联系客服")) {
                     if (!var1.getLabel().equals("确定")) {
                        this.aD = null;
                        this.d.a();
                        return;
                     }

                     String var16;
                     if ((var16 = this.aC.getString().trim()).length() >= 5) {
                        e.a(var16, .ag.a[this.bX.getSelectedIndex()]);
                        this.d.a();
                        return;
                     }

                     this.b("信息长度不足，不能少于5字，请重新输入");
                  } else {
                     this.aD = null;
                     this.d.a();
                  }
               } else {
                  String var15 = var1.getLabel();
                  if (this.bY != 0) {
                     return;
                  }

                  bt_1.O.a();
                  bt_1.O.m = this.aD.getTitle();
                  bt_1.O.n = this.aC == null ? "" : this.aC.getString().trim();
                  bt_1.O.o = this.bL == null ? "" : this.bL.getString().trim();
                  bt_1.O.p = this.bM == null ? "" : this.bM.getString().trim();
                  if (var15.equals("发送")) {
                     Object var57 = null;
                     String var58;
                     if (var51.equals("回复邮件")) {
                        var58 = this.bU.getText();
                     } else {
                        var58 = bt_1.O.o;
                     }

                     e.a(bt_1.O.n, var58, bt_1.O.p, bt_1.O.d);
                     this.d.a();
                  } else {
                     if (!var15.equals("选择收件人")) {
                        this.aD = null;
                        this.d.a();
                        return;
                     }

                     if (this.bY == 0) {
                        this.aD = new Form("选择收件人");
                        if (bt_1.O.s != null && bt_1.O.s.length > 0) {
                           this.bX = new ChoiceGroup("从好友列表中选择收件人", 1, bt_1.O.s, (Image[])null);
                           this.bP = new Command("确定", 3, 0);
                           this.bQ = new Command("返回", 1, 5);
                           this.aD.addCommand(this.bP);
                           this.aD.addCommand(this.bQ);
                           this.aD.append(this.bX);
                        } else {
                           this.bS = new StringItem((String)null, "您的好友名单为空，请直接输入收件人昵称，或添加为好友后从列表中选择！");
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
                     this.d.a();
                     this.a = 0;
                     this.b = 0;
                  }

                  return;
               }

               if (this.aC.getString() != "" && !this.aC.getString().substring(0, 1).equals("-")) {
                  e.o();
                  e.ak.append(this.aC.getString());
                  this.d.a();
                  this.a = 0;
                  this.b = 0;
               } else {
                  this.b("输入有误,请重新输入");
               }
            }
         } else {
            if (!var1.getLabel().equals("登陆")) {
               this.c();
               this.d.a();
               return;
            }

            byte var3 = (byte)this.bc.getSelectedIndex();
            byte var4 = this.bd.isSelected(0);
            String var5 = this.bN.getString().trim();
            String var8 = this.bO.getString().trim();
            if (var4) {
               byte var10001 = (byte)(var51.equals("登录当乐通行证") ? 0 : 1);
               String var9 = var8;
               String var7 = var5;
               byte var6 = var3;
               var4 = var10001;
               a_MainCanvas var13 = this;
               ByteArrayOutputStream var10 = new ByteArrayOutputStream();
               DataOutputStream var11 = new DataOutputStream(var10);

               try {
                  var11.writeBoolean(var4 == 0);
                  var11.writeByte(var6);
                  var11.writeBoolean(true);
                  var11.writeUTF(var7 == null ? "" : var7);
                  var11.writeUTF(var9 == null ? "" : var9);
                  var13.a(var10.toByteArray(), "dcn_user_info.db");
                  var10.close();
                  var11.close();
               } catch (IOException var12) {
                  ((Throwable)var12).printStackTrace();
               }
            }

            if (var51.equals("登录当乐通行证")) {
               t_1.w = true;
               com.yinhan.kjava.main.c.b();
               String var98 = var3 == 0 ? var5 : "";
               String var90 = var3 == 1 ? var5 : "";
               String var80 = var98;
               byte[] var97 = bz_1.a((short)5392, t_1.s, bb_1.a, bb_1.b, var80, var90, var8, t_1.v, t_1.F, (int)Runtime.getRuntime().totalMemory(), t_1.u);
               this.a("socket://120.78.151.213:20008", "http://117.135.138.130:7099");
               if (var97 == null) {
                  this.b("获取上传指令数据错误!");
                  return;
               }

               i.a(new w((short)5392, var97));
               this.d.a();
               this.a("正在登录...");
            } else {
               t_1.w = false;
               ai.a((byte)(var3 + 1), var5, var8);
               this.d.a();
               this.a("请求中...");
            }
         }

      }
   }

   private void J() {
      this.aJ = false;
      i = null;

      try {
         this.d.destroyApp(true);
      } catch (MIDletStateChangeException var1) {
      }

      this.d.notifyDestroyed();
   }

   protected final void pointerPressed(int var1, int var2) {
      if (t_1.o && this.aj != null) {
         this.aj.e = var1;
         this.aj.f = var2;
         this.aA = 0;
         this.aj.a(this.aj.e, this.aj.f);
         com.yinhan.kjava.main.f var10000 = this.aj;
         var2 = this.aj.f;
         var1 = this.aj.e;
         com.yinhan.kjava.main.f var8 = var10000;
         switch (var10000.b.j) {
            case 2:
               var8.b.a = var8.b.a(var1, var2);
               return;
            case 3:
            case 7:
            case 8:
            case 9:
            case 11:
            case 12:
            case 13:
            default:
               break;
            case 4:
               if (var8.b.c == 0) {
                  if (var8.b.aq != null) {
                     var8.b.a = var8.b.aq.b(var1, var2);
                     return;
                  }
               } else if (var8.b.c == 2) {
                  var8.b.a = var8.b.a(var1, var2);
                  return;
               }
               break;
            case 5:
               if (var8.b.aq != null) {
                  int var28;
                  label158: {
                     var8.b.a = var8.b.aq.b(var1, var2);
                     var24 = var8.b;
                     a_MainCanvas var27 = var8.b;
                     int var20 = var2;
                     int var17 = var1;
                     int var14 = var8.b.a;
                     a_MainCanvas var12 = var27;
                     if (var27.bC != null) {
                        for(int var21 = 0; var21 < var12.bC.length; ++var21) {
                           if (var17 >= var12.bC[var21][0] && var17 <= var12.bC[var21][0] + var12.bC[var21][2] && var20 >= var12.bC[var21][1] && var20 <= var12.bC[var21][1] + var12.bC[var21][3]) {
                              var14 = (byte)(var21 % 2);
                              var17 = (byte)(var21 / 2);
                              if (var14 == var12.bz && var17 == var12.bA) {
                                 var28 = 1073741824;
                              } else {
                                 var12.bz = (byte)var14;
                                 var12.bA = (byte)(var17 == 0 ? 1 : 0);
                                 var28 = 4;
                              }
                              break label158;
                           }
                        }
                     }

                     var28 = var14;
                  }

                  var24.a = var28;
               }

               if (var8.b.c == 1) {
                  var8.b.a = ca_1.c(var1, var2);
                  return;
               }

               if (var8.b.c != 2) {
                  break;
               }
            case 20:
               var8.b.a = ca_1.b(var1, var2);
               break;
            case 6:
               if (var8.b.aq != null) {
                  int var26;
                  label126: {
                     var8.b.a = var8.b.aq.b(var1, var2);
                     var23 = var8.b;
                     a_MainCanvas var25 = var8.b;
                     int var19 = var2;
                     int var16 = var1;
                     int var13 = var8.b.a;
                     a_MainCanvas var11 = var25;
                     if (var25.bC != null) {
                        for(int var7 = 0; var7 < var11.bC.length; ++var7) {
                           if (var16 >= var11.bC[var7][0] && var16 <= var11.bC[var7][0] + var11.bC[var7][2] && var19 >= var11.bC[var7][1] && var19 <= var11.bC[var7][1] + var11.bC[var7][3]) {
                              if (var7 < 2) {
                                 var11.bH = 0;
                              } else {
                                 if (var7 >= 4) {
                                    var11.bH = 2;
                                    var11.bG = var7 % 2;
                                    var26 = 1073741824;
                                    break label126;
                                 }

                                 var11.bH = 1;
                              }

                              var26 = var7 % 2 == 0 ? 8 : 2;
                              break label126;
                           }
                        }
                     }

                     var26 = var13;
                  }

                  var23.a = var26;
                  return;
               }
               break;
            case 10:
               if (var8.b.aq != null) {
                  var8.b.a = var8.b.aq.b(var1, var2);
                  return;
               }
               break;
            case 14:
               if (var8.b.c != 0) {
                  var8.b.a = ca_1.b(var1, var2);
                  return;
               }

               a_MainCanvas var22 = var8.b;
               int var5 = var2;
               int var4 = var1;
               a_MainCanvas var3 = var8.b;
               int var6 = 0;

               int var10001;
               while(true) {
                  if (var6 >= var3.bo.length) {
                     if (t_1.a == 1 && var4 >= t_1.b - t_1.i.stringWidth("退出") - 4 && var4 <= t_1.b - 4 && var5 >= t_1.c - t_1.j - 4 && var5 <= t_1.c - 4) {
                        var10001 = 536870912;
                        break;
                     }

                     var10001 = 0;
                     break;
                  }

                  if (var4 > t_1.b - var3.bi.getWidth() >> 1 && var4 < (t_1.b - var3.bi.getWidth() >> 1) + var3.bi.getWidth() && var5 > (var3.bt << 1) + var3.bh.getHeight() + var6 * var3.bi.getHeight() && var5 < (var3.bt << 1) + var3.bh.getHeight() + (var6 + 1) * var3.bi.getHeight()) {
                     var3.bs = var6;
                     var3.al = 0L;
                     var10001 = 1073741824;
                     break;
                  }

                  ++var6;
               }

               var22.a = var10001;
               return;
            case 15:
               var8.b.a = ca_1.b(var1, var2);
               return;
            case 16:
               var8.b.a = ca_1.b(var1, var2);
               return;
            case 17:
               var8.b.a = ca_1.b(var1, var2);
               return;
            case 18:
               var8.b.a = ca_1.a(var1, var2);
               return;
            case 19:
               var8.b.a = ca_1.a(var1, var2);
               return;
         }
      }

   }

   protected final void pointerReleased(int var1, int var2) {
      if (t_1.o && this.aj != null) {
         this.aj.c = 0;
         this.aj.d = 0;
         this.b = 0;
         this.a = 0;
         this.aA = 0;
      }

   }

   protected final void pointerDragged(int var1, int var2) {
      if (t_1.o && this.aj != null && e != null) {
         if (e.k == 0 && e.J != null) {
            return;
         }

         switch (e.k) {
            case 0:
               this.aj.d = 1;
               this.aF = var1;
               this.aG = var2;
               return;
            case 39:
               if (this.aj.c == 1) {
                  this.aj.d = 1;
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
         for(int var4 = 0; var4 < e.f.i.length; ++var4) {
            for(int var5 = 0; var5 < e.f.i[var4].length; ++var5) {
               if (e.f.i[var4][var5] == 1 && var1 >= var4 * e.f.e - 15 && var1 < var4 * e.f.e + e.f.e - 15 && var2 >= var5 * e.f.f - e.f.f && var2 < var5 * e.f.f) {
                  return;
               }
            }
         }

         if ((var3 = i.a().a(e.f, var3, new .bs(this.ca, this.cb), new .bs(this.cc, this.cd))).isEmpty()) {
            return;
         }

         int var6 = var3.size();
         e.I.c.removeAllElements();

         for(int var8 = 0; var8 < var6; ++var8) {
            .bs var15 = (.bs)var3.elementAt(var8);
            .bs var16;
            if (var8 < var6 - 1) {
               var16 = (.bs)var3.elementAt(var8 + 1);
            } else {
               var16 = var15;
            }

            if (var15.a != var16.a) {
               if (var15.a > var16.a) {
                  for(int var13 = 0; var13 < 4; ++var13) {
                     e.I.c.addElement(new short[]{(short)((var15.a << 4) - (var13 << 2)), (short)(var15.b << 4)});
                  }
               } else {
                  for(int var12 = 0; var12 < 4; ++var12) {
                     e.I.c.addElement(new short[]{(short)((var15.a << 4) + (var12 << 2)), (short)(var15.b << 4)});
                  }
               }
            } else if (var15.b != var16.b) {
               if (var15.b > var16.b) {
                  for(int var11 = 0; var11 < 4; ++var11) {
                     e.I.c.addElement(new short[]{(short)(var15.a << 4), (short)((var15.b << 4) - (var11 << 2))});
                  }
               } else {
                  for(int var10 = 0; var10 < 4; ++var10) {
                     e.I.c.addElement(new short[]{(short)(var15.a << 4), (short)((var15.b << 4) + (var10 << 2))});
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
      this.aC = new TextField("求爱宣言保留48小时，请输入求爱人昵称：", (String)null, 5, 0);
      this.bL = new TextField("请输入求爱宣言，不超过100字：", (String)null, 100, 0);
      this.bM = new TextField("银两不可低于10万两，银两越多排位越靠前，请输入银两：", (String)null, 9, 2);
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
      ca_1.h = 0;
      this.k = this.j = 20;
   }

   public final void c(String var1, String var2) {
      new com.yinhan.kjava.main.e(this, var1, var2);
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
         ((Throwable)var1).printStackTrace();
         return null;
      }
   }

   public final void r() {
      ca_1.A = 100;
      this.b();
      this.d.a();
   }

   static ChoiceGroup a(a_MainCanvas var0) {
      return var0.bb;
   }

   static ChoiceGroup a(a_MainCanvas var0, ChoiceGroup var1) {
      return var0.bc = var1;
   }

   static ChoiceGroup a(a_MainCanvas var0, int var1) {
      return e(var1);
   }

   static ChoiceGroup b(a_MainCanvas var0) {
      return var0.bc;
   }

   static void c(a_MainCanvas var0) {
      (ac = new bu_1("/", "ui")).d();
      if (ac.b() == 0) {
      }

      (ag = new bu_1("/", "publicUI")).d();
      if (ag.b() != 0) {
         ao_1.w = ag.a("money");
         ao_1.x = ag.a("goods");
         ao_1.C = ag.a("chat");
         ao_1.D = ag.a("elite");
         n = ag.a("num");
         ag.b("email");
         .bf var2;
         .aj[] var1 = (var2 = ag.a("mail_2")).d;

         for(int var3 = 1; var3 < var1.length; ++var3) {
            Image var4 = Image.createImage(var2.a, var1[var3].a, var1[var3].b, var1[var3].c, var1[var3].d, 0);
            if ((var3 & 1) == 0) {
               .be.e[var3 >> 2] = var4;
            } else {
               .bo.g[var3 >> 1] = var4;
            }
         }

         aa = ag.a("talk_01").a;
         u = ag.a("close");
         v = ag.a("title");
         E = ag.a("button1");
         r = ag.a("lu");
         s = ag.a("ld");
         t = ag.a("rd");
         x = ag.a("rd0");
         w = ag.a("ru0");
         y = ag.a("lu0");
         z = ag.a("ld0");
         C = ag.a("up");
         D = ag.a("down");
         A = ag.b("go-left");
         B = ag.b("go-right");
         .y.a = v;
         .y.b = u;
         .y.c = r;
         .y.d = z;
         .y.e = x;
         G = ag.a("tradetitle");
         L = ag.a("tradebottom");
         K = ag.a("moneybutton");
         H = ag.a("tradelock01");
         I = ag.a("tradelock_02");
         J = ag.a("tradelock_03");
         M = ag.a("plus");
         N = ag.a("subtraction");
         O = ag.a("equip");
         P = ag.a("nextpage");
         Q = ag.a("backpage");
         R = new .bf[8];

         for(int var20 = 0; var20 < R.length; ++var20) {
            R[var20] = ag.a("equip_" + var20);
         }

         S = new .bf[4];

         for(int var21 = 0; var21 < S.length; ++var21) {
            S[var21] = ag.a("submenu_" + var21);
         }

         T = ag.a("button_ok");
         U = ag.a("button_back");
         V = ag.a("trigon_u");
         W = ag.a("trigon_d");
         X = ag.a("trigon_l");
         Y = ag.a("trigon_r");
         ao_1.r = ag.b("select");
         Z = ag.a("rim");
         ag.a("cursor");
         ag.a("scorebar");
         aL = new Image[7];

         for(int var22 = 0; var22 < aL.length; ++var22) {
            aL[var22] = ag.a("chq-" + (var22 + 1)).a;
         }

         aM = k("/images/mz_1.png");
      }

      ab = new bu_1("/role/", "role");
      ah = new bu_1("/petfight/", "petfight");
      af = new bu_1("/icon/", "icon");
      a_MainCanvas var17 = var0;
      RecordStore var19 = null;

      try {
         DataInputStream var18;
         if (j(var17.aK) && (var18 = a(var19 = a(var17.aK, false))) != null) {
            bt_1.b = var18.readUTF();
            bt_1.c = var18.readUTF();
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
      var0.aq = new .m();
      var0.av = .y.c();
      var0.ar = new .c();
      var0.au = new .l();
      var0.as = new .n();
      var0.at = new .an();
      f = new .ai();
      if (t_1.o) {
         var0.aj = new com.yinhan.kjava.main.f(var0, f);
      }

      ai.a();
      var0.c();
   }
}

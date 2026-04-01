package com.cc;

import com.yinhan.kjava.main.MainCanvas;
import com.yinhan.kjava.main.c_3;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Vector;

public final class q {
   private MainCanvas a;
   private DataInputStream b;
   private ByteArrayInputStream c;
   private short d = -1;
   private int e;
   private int f;
   private int g;
   private int h;
   private Vector i = new Vector();
   private bl[] j;

   public final void a(MainCanvas var1) {
      this.a = var1;
   }

   public final void a(NetPacket var1) {
      if (var1 != null) {
         try {
            this.d = var1.getCode();
            if (this.d != 8192) {
               if (var1.payload == null) {
                  return;
               }

               this.c = new ByteArrayInputStream(var1.payload);
               this.b = new DataInputStream(this.c);
            }

            switch (this.d) {
               case 8192:
                  if (var1.child == null) {
                     return;
                  }

                  while(var1.child.size() > 0) {
                     this.a((NetPacket)var1.child.elementAt(0));
                     var1.child.removeElementAt(0);
                  }

                  return;
               case 8193:
                  GlobalStatus.w(this.b);
                  if (GlobalStatus.eB == 53) {
                     if (MainCanvas.e.g != null) {
                        MainCanvas.e.g.d();
                        MainCanvas.e.j = MainCanvas.e.k = 0;
                        this.a.b(GlobalConfig.Y[GlobalStatus.eB]);
                     }

                     return;
                  }

                  if (GlobalStatus.eB == 48) {
                     if (MainCanvas.e.g != null) {
                        MainCanvas.e.g.f = -2;
                     } else {
                        this.a.b(GlobalConfig.Y[GlobalStatus.eB]);
                     }

                     return;
                  }

                  if (GlobalStatus.eB != -2) {
                     if (MainCanvas.e == null || MainCanvas.e.g == null || MainCanvas.e.g.f != -1 || GlobalStatus.eC == null || !GlobalStatus.eC.startsWith("等待他人操作")) {
                        if (GlobalStatus.eC != null) {
                           this.a.b(GlobalStatus.eC);
                        } else {
                           this.a.b(GlobalConfig.Y[GlobalStatus.eB < 0 ? 0 : GlobalStatus.eB]);
                        }
                        break;
                     }

                     return;
                  }

                  if (MainCanvas.e.k == 111 && MainCanvas.e.j == 0) {
                     MainCanvas.e.k = MainCanvas.e.j;
                  }

                  return;
               case 8194:
                  GlobalStatus.b = this.b.readUTF();
                  GlobalStatus.d = this.b.readUTF();
                  return;
               case 8195:
                  GlobalConfig.printStr("exec角色列表:");
                  GlobalStatus.a(this.b);
                  this.a.b(GlobalStatus.W == null ? 0 : GlobalStatus.W.length);
                  return;
               case 8197:
                  GlobalStatus.d(this.b);
                  if (MainCanvas.e == null) {
                     return;
                  }

                  MainCanvas.e.aX = false;
                  if (MainCanvas.e.k == 2 && MainCanvas.e.l == 4) {
                     String var48 = GlobalConfig.a(this.a.l, GlobalStatus.aq);
                     GlobalConfig.a(this.a.l, GlobalStatus.ap);
                     MainCanvas.e.am = LoadingPage.a(GlobalStatus.t[MainCanvas.e.af].b + ":已存入银两" + var48 + "，现有银两" + this.a.l.toString(), GlobalConfig.i, GlobalConfig.defaultWidth == 176 ? 118 : 152, "\t");
                     MainCanvas.e.ah = MainCanvas.e.m == 1 ? GlobalStatus.aq : GlobalStatus.ap;
                  } else if (MainCanvas.e.k == 37 && MainCanvas.e.ao) {
                     MainCanvas.e.p();
                     MainCanvas.e.ao = false;
                  }

                  MainCanvas.e.I.a();
                  return;
               case 8198:
                  byte var47;
                  if ((var47 = this.b.readByte()) > 0) {
                     az_1[] var57 = new az_1[var47];

                     for(int var64 = 0; var64 < var47; ++var64) {
                        var57[var64] = new az_1();
                        var57[var64].a(this.b);
                     }

                     GlobalStatus.u.addElement(var57);
                  }

                  ao_1.Q();
                  if (MainCanvas.e != null) {
                     MainCanvas.e.P();
                  }

                  return;
               case 8199:
                  this.b();
                  return;
               case 8200:
                  GlobalStatus.b(this.b);
                  return;
               case 8201:
                  byte var56 = this.b.readByte();
                  GlobalStatus.e(this.b);
                  if (var56 == 1) {
                     this.a.i();
                  } else if (var56 == 2 && MainCanvas.e != null) {
                     MainCanvas.e.e((int)0);
                  }

                  if (MainCanvas.e != null && MainCanvas.e.j == 4) {
                     MainCanvas.e.s();
                     return;
                  }

                  if (MainCanvas.e != null && MainCanvas.e.k == 9) {
                     MainCanvas.e.s();
                  }

                  return;
               case 8202:
                  GlobalStatus.l(this.b);
                  if (MainCanvas.e != null && MainCanvas.e.k == 5) {
                     MainCanvas.e.l = 0;
                     this.a.touchPageCase = this.a.k = 7;
                  }

                  return;
               case 8203:
                  this.b.readByte();
                  GlobalStatus.n(this.b);
                  if (MainCanvas.e.k == 12) {
                     if (this.a.as.a == 0) {
                        MainCanvas.e.a((byte)1, true);
                     } else if (this.a.as.a == 1) {
                        MainCanvas.e.a((byte)0, true);
                     }
                     break;
                  }

                  return;
               case 8204:
                  this.a(this.b);
                  return;
               case 8205:
                  GlobalStatus.A(this.b);
                  return;
               case 8206:
                  b(this.b);
                  return;
               case 8207:
                  if (ao_1.i()) {
                     GlobalStatus.g(this.b);
                     MainCanvas.e.l = 0;
                     MainCanvas.e.m();
                     return;
                  }

                  return;
               case 8208:
                  byte var46 = this.b.readByte();
                  GlobalStatus.b(this.b, var46);
                  if (var46 == 1) {
                     MainCanvas.e.M.y();
                  } else {
                     MainCanvas.e.N();
                  }

                  return;
               case 8209:
                  this.c();
                  if (MainCanvas.e.k == 0) {
                     MainCanvas.e.l = 0;
                     MainCanvas.e.m();
                  }

                  return;
               case 8210:
                  GlobalStatus.t(this.b);
                  if (MainCanvas.e != null) {
                     if (MainCanvas.e.k == 12 && MainCanvas.e.l >= 6) {
                        if (this.a.touchPageCase != 2) {
                           this.a.touchPageCase = this.a.k;
                        }

                        MainCanvas.e.l = 6;
                        MainCanvas.e.a(GlobalStatus.en);
                        return;
                     }

                     if (MainCanvas.e.k == 4 && MainCanvas.e.l >= 8) {
                        if (this.a.touchPageCase != 2) {
                           this.a.touchPageCase = this.a.k;
                        }

                        MainCanvas.e.a(GlobalStatus.en);
                        MainCanvas.e.l = 8;
                     }

                     return;
                  }

                  return;
               case 8211:
                  GlobalStatus.D(this.b);
                  MainCanvas.e.a(GlobalStatus.fs);
                  MainCanvas.e.a(GlobalStatus.fl);
                  if (this.a.touchPageCase == 1) {
                     this.a.touchPageCase = this.a.k;
                  }

                  return;
               case 8212:
                  GlobalStatus.E(this.b);
                  if (this.a.touchPageCase == 1) {
                     this.a.touchPageCase = this.a.k;
                  }

                  return;
               case 8213:
                  GlobalStatus.q(this.b);
                  if (MainCanvas.e == null) {
                     return;
                  }

                  if (ao_1.i() && MainCanvas.e.k != 20) {
                     if (this.a.touchPageCase != 2) {
                        MainCanvas.e.a(MainCanvas.e.k);
                     } else {
                        this.a.az = true;
                     }

                     return;
                  }

                  this.a.az = false;
                  MainCanvas.e.b(GlobalStatus.dT[1], GlobalStatus.dX);
                  return;
               case 8214:
                  byte var45;
                  if ((var45 = this.b.readByte()) <= 0) {
                     return;
                  }

                  ce[] var55 = new ce[var45];

                  for(int var63 = 0; var63 < var45; ++var63) {
                     var55[var63] = new ce();
                     var55[var63].a(this.b);
                  }

                  if (MainCanvas.e != null) {
                     MainCanvas.e.a(var55);
                  }

                  return;
               case 8215:
                  GlobalStatus.B(this.b);
                  if (ao_1.i()) {
                     MainCanvas.e.v();
                     return;
                  }

                  this.a.b("战斗中不能进行该操作");
                  return;
               case 8216:
                  GlobalStatus.m(this.b);
                  if (GlobalStatus.cG == null || GlobalStatus.cG.length <= 0) {
                     this.a.b("该玩家没有武器装备!");
                     return;
                  }

                  if (ao_1.i()) {
                     MainCanvas.e.w();
                     return;
                  }

                  this.a.b("战斗中不能进行该操作");
                  return;
               case 8217:
                  this.e();
                  if (MainCanvas.e.k == 100) {
                     MainCanvas.e.N();
                  } else if (MainCanvas.e.k == 7) {
                     MainCanvas.e.b((byte) MainCanvas.e.aV);
                     break;
                  }

                  return;
               case 8218:
                  long var6 = this.b.readLong();
                  byte var44 = this.b.readByte();
                  if (var6 == -1L) {
                     if (MainCanvas.e.g != null) {
                        GlobalStatus.v = -1L;
                        GlobalStatus.x = -1;
                        MainCanvas.e.g.l();
                     }
                  } else if (bq_1.g <= 0 && var6 != GlobalStatus.v) {
                     if (MainCanvas.e.g != null) {
                        GlobalStatus.v = -1L;
                        GlobalStatus.x = -1;
                        MainCanvas.e.g.l();
                     }
                  } else if (var44 == 0) {
                     MainCanvas.e.g.f = 7;
                     GlobalStatus.v = -1L;
                     GlobalStatus.x = -1;
                  } else {
                     GlobalStatus.v = -1L;
                     GlobalStatus.x = -1;
                  }

                  GlobalStatus.a();
                  if (GlobalStatus.bu) {
                     MainCanvas.e.X.b();
                  }

                  return;
               case 8219:
                  byte var54 = this.b.readByte();
                  this.b.readLong();
                  GlobalStatus.C(this.b);
                  if (ao_1.i()) {
                     if (var54 == 0) {
                        GlobalStatus.N();
                     } else if (var54 == 1) {
                        GlobalStatus.x();
                     }

                     MainCanvas.e.b(var54, false);
                  } else {
                     MainCanvas.e.g(var54);
                  }

                  return;
               case 8220:
                  this.f();
                  return;
               case 8221:
                  GlobalStatus.F(this.b);
                  return;
               case 8222:
                  GlobalConfig.printStr("exec宠物列表:");
                  this.d();
                  return;
               case 8223:
                  if (ao_1.i()) {
                     if (!ao_1.i()) {
                        return;
                     }

                     GlobalStatus.h(this.b);
                     if (MainCanvas.e.k != 6) {
                        return;
                     }

                     if (GlobalStatus.bR == null && GlobalStatus.bL == null) {
                        this.a.b("当前没有任务");
                        return;
                     }

                     MainCanvas.e.x();
                     return;
                  }

                  GlobalStatus.h(this.b);
                  return;
               case 8224:
                  GlobalStatus.bH = this.b.readUTF();
                  if (MainCanvas.e.k == 6) {
                     this.a.aq.b();
                     this.a.aq.a("任务详细");
                     this.a.at.a(GlobalStatus.bH, GlobalConfig.i, (byte)2);
                     this.a.at.a((byte)0);
                     this.a.au.a("确定");
                     this.a.aq.a((al)this.a.at);
                     this.a.aq.a((al)this.a.au);
                     this.a.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
                     this.a.touchPageCase = this.a.k;
                     MainCanvas.e.l = 3;
                  }

                  return;
               case 8225:
                  GlobalStatus.i(this.b);
                  if (GlobalStatus.bW) {
                     MainCanvas.e.F();
                  }

                  return;
               case 8226:
                  GlobalStatus.J(this.b);
                  if (GlobalStatus.gS == null) {
                     this.a.b("附近没有玩家!");
                     return;
                  }

                  if (ao_1.i()) {
                     if (MainCanvas.e.j != 7) {
                        MainCanvas.e.b((byte)0);
                     } else {
                        MainCanvas.e.b((byte) MainCanvas.e.aV);
                     }

                     return;
                  }

                  this.a.b("战斗中不能查看周围玩家");
                  return;
               case 8227:
                  GlobalStatus.j(this.b);
                  if (GlobalStatus.cs == null) {
                     this.a.b("没有可传送的目的地!");
                     return;
                  }

                  if (MainCanvas.e.k == 1 || MainCanvas.e.k == 100) {
                     MainCanvas.e.a(false);
                  }

                  return;
               case 8228:
                  GlobalStatus.s(this.b);
                  if (GlobalStatus.gs != null) {
                     boolean var62 = false;
                     MainCanvas.e.J();
                  } else {
                     if (MainCanvas.e.aM > 1) {
                        --MainCanvas.e.aM;
                        this.a.b("没有更多的宠物了！");
                     } else {
                        GlobalStatus.t();
                     }

                     this.a.touchPageCase = this.a.k;
                     this.a.b("找不到您搜索的宠物!");
                  }

                  return;
               case 8229:
                  c(this.b);
                  return;
               case 8230:
                  GlobalStatus.H(this.b);
                  MainCanvas.e.C();
                  return;
               case 8231:
                  GlobalStatus.r(this.b);
                  if (GlobalStatus.dY != null) {
                     boolean var61 = false;
                     MainCanvas.e.I();
                     return;
                  } else {
                     if (MainCanvas.e.aM > 1) {
                        --MainCanvas.e.aM;
                        this.a.b("没有更多的物品了！");
                        this.a.touchPageCase = this.a.k;
                     } else {
                        this.a.b("拍卖场没有对应物品!");
                        MainCanvas.e.j = 14;
                     }
                     break;
                  }
               case 8232:
                  GlobalStatus.k(this.b);
                  if (MainCanvas.e.k == 11) {
                     if (GlobalStatus.ct == null) {
                        this.a.b("仓库没有物品");
                     } else {
                        MainCanvas.e.G();
                     }
                     break;
                  }

                  return;
               case 8233:
                  GlobalStatus.G(this.b);
                  if (MainCanvas.e.j == 35) {
                     if (GlobalStatus.gs != null) {
                        MainCanvas.e.D();
                        if (this.a.touchPageCase != 2) {
                           this.a.touchPageCase = this.a.k;
                        }
                     } else {
                        this.a.b("没有寄养宠物!");
                     }
                     break;
                  }

                  return;
               case 8234:
                  GlobalStatus.o(this.b);
                  if (MainCanvas.e.k == 29 && GlobalStatus.dE != null) {
                     MainCanvas.e.i(MainCanvas.e.aE > GlobalStatus.dE.length - 1 ? GlobalStatus.dE.length - 1 : MainCanvas.e.aE);
                  }

                  return;
               case 8235:
                  if (ao_1.i()) {
                     GlobalStatus.p(this.b);
                  } else {
                     GlobalStatus.s();
                  }

                  if (GlobalStatus.dJ) {
                     if (!ao_1.i()) {
                        return;
                     }

                     MainCanvas.e.p((int)0);
                     return;
                  }

                  return;
               case 8236:
                  GlobalStatus.p(this.b);
                  if (MainCanvas.e.k != 7) {
                     MainCanvas.e.p((int)2);
                  }

                  return;
               case 8238:
                  GlobalStatus.v(this.b);
                  if (!ao_1.aj || GlobalStatus.ev) {
                     if (GlobalStatus.ew != null) {
                        MainCanvas.e.a((short) MainCanvas.e.k, (byte)1);
                     } else {
                        GlobalStatus.u();
                     }
                     break;
                  }

                  return;
               case 8239:
                  if (this.b.readByte() == 0) {
                     GlobalStatus.bt = false;
                  } else {
                     GlobalStatus.bt = true;
                  }

                  bq_1.k();
                  if (MainCanvas.e != null) {
                     MainCanvas.e.d(false);
                  }

                  return;
               case 8240:
                  GlobalStatus.z(this.b);
                  MainCanvas.e.f((byte)1);
                  return;
               case 8241:
                  GlobalStatus.L(this.b);
                  return;
               case 8242:
                  GlobalStatus.K(this.b);
                  return;
               case 8243:
                  byte var60 = this.b.readByte();
                  GlobalStatus.a(this.b, var60);
                  if (GlobalStatus.db != null && GlobalStatus.db.length > 0) {
                     MainCanvas.e.a(GlobalStatus.fz[MainCanvas.e.ay] == 0, false);
                     return;
                  }

                  this.a.b("宠物没有技能!");
                  return;
               case 8244:
                  GlobalStatus.u(this.b);
                  if (MainCanvas.e != null) {
                     if (MainCanvas.e.k == 36 && MainCanvas.e.l >= 2) {
                        if (this.a.touchPageCase != 2) {
                           this.a.touchPageCase = this.a.k;
                        }

                        MainCanvas.e.l = 2;
                        MainCanvas.e.a(GlobalStatus.et);
                     }

                     return;
                  }

                  return;
               case 8245:
                  GlobalStatus.aI(this.b);
                  if (this.b.readByte() == 1) {
                     this.a.e();
                  }

                  return;
               case 8246:
                  GlobalStatus.N(this.b);
                  return;
               case 8247:
                  GlobalStatus.z = this.b.readByte();
                  if (MainCanvas.e != null) {
                     if (MainCanvas.e.k == 3) {
                        MainCanvas.e.a((byte)2);
                     }

                     if (MainCanvas.e.k == 100) {
                        MainCanvas.e.N();
                        break;
                     }
                  }

                  return;
               case 8248:
                  GlobalStatus.A = this.b.readByte();
                  if (MainCanvas.e != null) {
                     MainCanvas.e.d(false);
                  }

                  return;
               case 8249:
                  GlobalStatus.B = this.b.readByte();
                  if (MainCanvas.e != null) {
                     MainCanvas.e.d(false);
                  }

                  return;
               case 8250:
                  this.a();
                  if (MainCanvas.e != null) {
                     MainCanvas.e.d(false);
                  }

                  return;
               case 8251:
                  GlobalStatus.D = this.b.readByte();
                  if (MainCanvas.e != null) {
                     MainCanvas.e.d(false);
                  }

                  return;
               case 8252:
                  byte var59 = this.b.readByte();
                  GlobalStatus.f(this.b);
                  if (var59 == 1) {
                     this.a.i();
                  }

                  if (MainCanvas.e != null && MainCanvas.e.j == 4) {
                     MainCanvas.e.s();
                     return;
                  }

                  if (MainCanvas.e != null && MainCanvas.e.k == 9) {
                     MainCanvas.e.s();
                  }

                  return;
               case 8253:
                  GlobalStatus.aD(this.b);
                  if (MainCanvas.e.k != 20) {
                     MainCanvas.e.Y();
                  }

                  return;
               case 8254:
                  GlobalStatus.aE(this.b);
                  MainCanvas.e.c(MainCanvas.e.k);
                  return;
               case 8255:
                  GlobalStatus.aG(this.b);
                  MainCanvas.e.Z();
                  return;
               case 8257:
                  GlobalStatus.E = this.b.readByte();
                  if (MainCanvas.e != null) {
                     MainCanvas.e.d(false);
                  }

                  return;
               case 8258:
                  GlobalStatus.aH(this.b);
                  if (MainCanvas.e.j != 4 && MainCanvas.e.j != 33) {
                     MainCanvas.e.ah();
                  }

                  return;
               case 8259:
                  GlobalStatus.Y(this.b);
                  if (MainCanvas.e.k == 2) {
                     MainCanvas.e.M.b(false);
                  } else if (MainCanvas.e.k == 50) {
                     this.a.at.b(GlobalStatus.iI[this.a.ar.g()], GlobalConfig.i, (byte)2);
                     this.a.at.a((byte)1);
                     break;
                  }

                  return;
               case 8260:
                  int var42;
                  if ((var42 = this.b.readInt()) > 0) {
                     byte[] var43 = new byte[var42];
                     GlobalStatus.kX = this.b.readUTF();
                     this.b.read(var43);
                     MainCanvas.ae = new Page(GlobalStatus.kX, var43);
                  }

                  GlobalStatus.aJ(this.b);
                  return;
               case 8261:
                  GlobalStatus.aK(this.b);
                  if (this.b.readByte() == 1) {
                     this.a.f();
                  }

                  if (GlobalStatus.bs == 0) {
                     this.a.n();
                     this.a.touchAction = 0;
                     this.a.b = 0;
                     this.a.mainMidlet.start();
                  }
                  break;
               case 8262:
               case 8263:
               case 8266:
               case 8268:
               case 8276:
               case 8287:
               default:
                  return;
               case 8264:
                  if (GlobalStatus.bu = this.b.readByte() != 0) {
                     ab_1.b = true;
                  }

                  if (MainCanvas.e != null && MainCanvas.e.X != null) {
                     MainCanvas.e.X.b();
                  }

                  if (MainCanvas.e.k == 100) {
                     MainCanvas.e.N();
                  }

                  return;
               case 8265:
                  GlobalStatus.bv = this.b.readInt();
                  return;
               case 8267:
                  GlobalStatus.bz = this.b.readUTF();
                  GlobalStatus.by = this.b.readUTF();
                  if (MainCanvas.e != null) {
                     MainCanvas.e.aa();
                  }

                  return;
               case 8269:
                  if (MainCanvas.e != null) {
                     MainCanvas.e.U.a(this.b);
                     MainCanvas.e.U.a(false);
                  }

                  return;
               case 8270:
                  if (MainCanvas.e != null) {
                     MainCanvas.e.O.b(this.b);
                     MainCanvas.e.O.a(false);
                  }

                  return;
               case 8271:
                  GlobalStatus.aR(this.b);
                  if (MainCanvas.e != null) {
                     if (GlobalStatus.mq < 4) {
                        MainCanvas.e.ae();
                     } else if (GlobalStatus.mq == 4) {
                        MainCanvas.e.N();
                     } else if (GlobalStatus.mq == 5) {
                        MainCanvas.e.N();
                     } else if (GlobalStatus.mq == 6) {
                        this.a.touchPageCase = this.a.k;
                     }
                     break;
                  }

                  return;
               case 8272:
                  if (MainCanvas.e != null) {
                     MainCanvas.e.N();
                  }

                  return;
               case 8273:
                  MainCanvas.e.J = this.b.readUTF();
                  LoadingPage.h = 0;
                  if (!MainCanvas.e.c && MainCanvas.e.k != 0 && MainCanvas.e.k != 25) {
                     this.a.touchPageCase = this.a.k = 7;
                     MainCanvas.e.N();
                  }

                  return;
               case 8274:
                  int var41 = this.b.readInt();
                  int var53 = this.b.readInt();
                  if (MainCanvas.e.k != 0 && MainCanvas.e.k != 25 && GlobalStatus.H == null) {
                     this.a.touchPageCase = this.a.k = 7;
                     MainCanvas.e.N();
                  }

                  this.a.b(var41 + 8, var53 + 16);
                  return;
               case 8275:
                  byte var40 = this.b.readByte();
                  GlobalStatus.F = null;
                  GlobalStatus.G = null;
                  if (var40 == 1) {
                     GlobalStatus.F = this.b.readUTF();
                     GlobalStatus.G = this.b.readUTF();
                  }

                  this.a.touchPageCase = this.a.k = 7;
                  return;
               case 8277:
                  if (MainCanvas.e != null && MainCanvas.e.P != null) {
                     MainCanvas.e.P.a(this.b);
                     MainCanvas.e.P.a(false);
                  }

                  return;
               case 8278:
                  GlobalStatus.Z(this.b);
                  MainCanvas.e.M.n();
                  return;
               case 8280:
                  GlobalStatus.p(this.b);
                  if (MainCanvas.e.k != 7) {
                     MainCanvas.e.p((int)1);
                  }

                  return;
               case 8286:
                  GlobalStatus.l = this.b.readByte();
                  if ((GlobalStatus.k = this.b.readUTF()) != null) {
                     MainCanvas.e.ab();
                  }

                  return;
               case 8288:
                  MainCanvas.aH = this.b.readUTF();
                  MainCanvas.aI = this.b.readUTF();
                  this.a.q();
                  return;
               case 8290:
                  GlobalStatus.b = this.b.readUTF();
                  GlobalStatus.d = this.b.readUTF();
                  if (GlobalConfig.channel == 1) {
                     this.b.readUTF();
                     GlobalStatus.m = this.b.readUTF();
                  }

                  return;
               case 8291:
                  byte var39 = this.b.readByte();
                  GlobalStatus.aa(this.b);
                  if (MainCanvas.e.k != 115) {
                     return;
                  }

                  MainCanvas.e.M.p();
                  if (var39 == 3 || var39 == 4) {
                     this.a.at.a((byte)1);
                  }

                  if (var39 == 5) {
                     this.a.i();
                  }

                  return;
               case 8293:
                  if (MainCanvas.e != null && MainCanvas.e.Q != null) {
                     MainCanvas.e.Q.a(this.b);
                     MainCanvas.e.Q.a(false);
                  }

                  return;
               case 8294:
                  if (MainCanvas.e != null) {
                     if (GlobalConfig.channel == 0) {
                        if (GlobalStatus.jy != 1) {
                           this.a.b("充值卡充值暂时关闭");
                        }
                     } else if (GlobalStatus.jy == 1) {
                        c_3.g();
                     } else {
                        this.a.b("充值功能暂时关闭");
                     }
                     break;
                  }

                  return;
               case 8295:
                  GlobalConfig.printStr("exec宠物升星");
                  GlobalStatus.aS(this.b);
                  if (MainCanvas.e != null) {
                     MainCanvas.e.e(false);
                  }

                  return;
               case 8296:
                  GlobalConfig.printStr("exec抽奖");
                  GlobalStatus.aW(this.b);
                  MainCanvas.e.am();
                  return;
               case 8297:
                  GlobalConfig.printStr("exec抽奖结果");
                  GlobalStatus.aX(this.b);
                  if (MainCanvas.e.k == 127) {
                     MainCanvas.e.am();
                     this.a.b("恭喜您，抽中了" + GlobalStatus.nj + "×" + GlobalStatus.nk);
                  }

                  return;
               case 8298:
                  GlobalConfig.printStr("exec宠物升星结果");
                  GlobalStatus.bc(this.b);
                  if (GlobalStatus.nB == 1) {
                     this.a.b("升星成功");
                  } else {
                     this.a.b("升星失败");
                  }

                  return;
               case 8300:
                  if (MainCanvas.e != null) {
                     MainCanvas.e.O.b(this.b);
                     MainCanvas.e.O.a(false);
                  }

                  return;
               case 8301:
                  if (MainCanvas.e != null) {
                     MainCanvas.e.V.a(this.b);
                     MainCanvas.e.V.a(false);
                  }

                  return;
               case 8302:
                  if (MainCanvas.e.N == null) {
                     MainCanvas.e.N = new cc(MainCanvas.e, this.a);
                  }

                  MainCanvas.e.N.a(this.b);
                  MainCanvas.e.N.a((short)0);
                  return;
               case 8303:
                  GlobalConfig.printStr("宠物继承");
                  cg_1.a(cg_1.b);
                  cg_1.a(this.b);
                  MainCanvas.e.W.b();
                  return;
               case 8304:
                  if (this.b.readInt() == 1) {
                     if (MainCanvas.e.N == null) {
                        MainCanvas.e.N = new cc(MainCanvas.e, this.a);
                     }

                     MainCanvas.e.N.b(this.b);
                     MainCanvas.e.N.a((short)2);
                  }

                  return;
               case 8448:
                  if (this.b.readByte() == 1) {
                     this.a.c();
                  }

                  return;
               case 8449:
                  GlobalStatus.O(this.b);
                  MainCanvas.e.i((byte)0);
                  return;
               case 8450:
                  GlobalStatus.P(this.b);
                  if (MainCanvas.e.k == 1) {
                     MainCanvas.e.X();
                  } else {
                     MainCanvas.e.k((byte)1);
                  }

                  return;
               case 8451:
                  GlobalStatus.O(this.b);
                  MainCanvas.e.i((byte)2);
                  return;
               case 8452:
                  GlobalStatus.P(this.b);
                  MainCanvas.e.k((byte)3);
                  return;
               case 8453:
                  GlobalStatus.S(this.b);
                  if (MainCanvas.e != null) {
                     MainCanvas.e.U();
                  }

                  return;
               case 8454:
                  GlobalStatus.O(this.b);
                  if (MainCanvas.e.as != 5 && MainCanvas.e.aZ != 4 && MainCanvas.e.as != 9 && MainCanvas.e.as != 10) {
                     MainCanvas.e.i((byte)4);
                     return;
                  }

                  if (MainCanvas.e.aZ == 4) {
                     MainCanvas.e.aZ = -1;
                  }

                  MainCanvas.e.j((byte)6);
                  this.a.touchPageCase = this.a.k;
                  MainCanvas.e.j = MainCanvas.e.k = 38;
                  return;
               case 8455:
                  GlobalStatus.P(this.b);
                  MainCanvas.e.k((byte)5);
                  return;
               case 8456:
                  String var38 = this.b.readUTF();
                  if (MainCanvas.e != null) {
                     MainCanvas.e.d(var38);
                  }

                  return;
               case 8704:
                  GlobalStatus.T(this.b);
                  if (GlobalStatus.ik != null && GlobalStatus.ik.length > 0) {
                     MainCanvas.e.M.b();
                     return;
                  }

                  this.a.b("没有等待响应的帮派!");
                  return;
               case 8705:
                  GlobalStatus.W(this.b);
                  MainCanvas.e.M.h(0);
                  return;
               case 8706:
                  GlobalStatus.X(this.b);
                  MainCanvas.e.M.h(1);
                  return;
               case 8708:
                  GlobalStatus.U(this.b);
                  if (GlobalStatus.ip != null) {
                     MainCanvas.e.M.c();
                  } else {
                     this.a.b("没有帮派发布招募!");
                  }

                  return;
               case 8709:
                  GlobalStatus.V(this.b);
                  if (GlobalStatus.it != null) {
                     MainCanvas.e.M.f();
                  } else {
                     this.a.b("没有申请入帮玩家!");
                  }

                  return;
               case 8710:
                  GlobalStatus.W(this.b);
                  if (GlobalStatus.iy != null) {
                     MainCanvas.e.M.i();
                     return;
                  } else {
                     if (MainCanvas.e.M.g == 1) {
                        MainCanvas.e.M.a(true);
                     } else if (MainCanvas.e.M.g == 0) {
                        MainCanvas.e.k();
                        MainCanvas.e.c((int)4);
                     }
                     break;
                  }
               case 8711:
                  GlobalStatus.ab(this.b);
                  MainCanvas.e.M.j();
                  return;
               case 8712:
                  GlobalStatus.ac(this.b);
                  MainCanvas.e.M.k();
                  return;
               case 8713:
                  GlobalStatus.ad(this.b);
                  MainCanvas.e.M.l();
                  return;
               case 8714:
                  GlobalStatus.ae(this.b);
                  if (GlobalStatus.jo != null) {
                     MainCanvas.e.M.s();
                  } else {
                     this.a.b("没有可购买的设施!");
                  }

                  return;
               case 8715:
                  GlobalStatus.ag(this.b);
                  if (MainCanvas.e != null) {
                     MainCanvas.e.U();
                  }

                  return;
               case 8716:
                  GlobalStatus.af(this.b);
                  MainCanvas.e.M.t();
                  return;
               case 8717:
                  GlobalStatus.ah(this.b);
                  if (GlobalStatus.jz != null) {
                     MainCanvas.e.W();
                  } else {
                     this.a.b("增值仓库没有物品!");
                  }

                  return;
               case 8718:
                  GlobalStatus.ai(this.b);
                  MainCanvas.e.a((byte)3);
                  return;
               case 8722:
                  GlobalStatus.jv = this.b.readByte() == 1;
                  GlobalStatus.jw = this.b.readByte() == 1;
                  GlobalStatus.jx = this.b.readByte();
                  GlobalStatus.jy = this.b.readByte();
                  return;
               case 8723:
                  GlobalStatus.f = System.currentTimeMillis();
                  GlobalStatus.g = false;
                  if (GlobalStatus.f - GlobalStatus.lastSyncTime <= 800L) {
                     GlobalStatus.h = 0;
                     return;
                  } else {
                     if (GlobalStatus.f - GlobalStatus.lastSyncTime <= 2000L) {
                        GlobalStatus.h = 1;
                     } else {
                        GlobalStatus.h = 2;
                     }
                     break;
                  }
               case 8724:
                  GlobalStatus.aj(this.b);
                  if (!ao_1.i()) {
                     this.a.b("战斗中不能进行该操作");
                     return;
                  }

                  if (MainCanvas.e == null) {
                     return;
                  }

                  MainCanvas.e.c(false);
                  return;
               case 8725:
                  GlobalStatus.ak(this.b);
                  MainCanvas.e.l((byte)0);
                  return;
               case 8726:
                  GlobalStatus.H(this.b);
                  MainCanvas.e.C();
                  return;
               case 8727:
                  GlobalStatus.al(this.b);
                  MainCanvas.e.l((byte)2);
                  return;
               case 8728:
                  GlobalStatus.an(this.b);
                  MainCanvas.e.C();
                  return;
               case 8729:
                  GlobalStatus.aF(this.b);
                  return;
               case 8730:
                  GlobalStatus.at(this.b);
                  return;
               case 8731:
                  GlobalStatus.aw(this.b);
                  return;
               case 8732:
                  GlobalStatus.av(this.b);
                  if (o_1.e == 1) {
                     MainCanvas.e.O.a(MainCanvas.e.O.a, (short) MainCanvas.e.O.c, MainCanvas.e.O.d);
                  } else {
                     MainCanvas.e.O.a(0, (short)-1, -1);
                  }

                  return;
               case 8733:
                  o_1.a(this.b);
                  MainCanvas.e.O.c();
                  return;
               case 8734:
                  GlobalStatus.Q(this.b);
                  if (MainCanvas.e.as != 3 && MainCanvas.e.as != 8 && MainCanvas.e.as != 7 && MainCanvas.e.as != 2) {
                     if (MainCanvas.e.as == 4 || MainCanvas.e.as == 5 || MainCanvas.e.as == 6 || MainCanvas.e.as == 10) {
                        MainCanvas.e.i((byte)9);
                     }

                     return;
                  }

                  MainCanvas.e.i((byte)7);
                  return;
               case 8735:
                  GlobalStatus.R(this.b);
                  if (MainCanvas.e.as != 7 && MainCanvas.e.as != 2 && MainCanvas.e.as != 3 && MainCanvas.e.as != 8) {
                     if (MainCanvas.e.as == 9 || MainCanvas.e.as == 4 || MainCanvas.e.as == 5 || MainCanvas.e.as == 6) {
                        MainCanvas.e.i((byte)10);
                     }

                     return;
                  }

                  MainCanvas.e.i((byte)8);
                  return;
               case 8736:
                  GlobalStatus.aP(this.b);
                  if (MainCanvas.e != null && MainCanvas.e.ad()) {
                     MainCanvas.e.e((byte)0);
                     GlobalStatus.lt[0] = -1;
                     return;
                  }

                  if (MainCanvas.e != null && (GlobalStatus.lt[0] == 0 || GlobalStatus.lt[0] == 1 || GlobalStatus.lt[0] == 2)) {
                     MainCanvas.e.e((byte)0);
                     GlobalStatus.lt[0] = -1;
                  }

                  return;
               case 8737:
                  if (MainCanvas.e != null) {
                     byte[] var36;
                     if ((var36 = NetPayloadBuilder.a((short)4255, (short[]) GlobalStatus.lt, (String) GlobalStatus.ad)) != null) {
                        NetPacket var37 = new NetPacket((short)4255, var36);
                        MainCanvas.i.sendPacket(var37);
                     } else {
                        this.a.b("获取上传指令数据错误!");
                     }
                     break;
                  }

                  return;
               case 8738:
                  GlobalStatus.aO(this.b);
                  if (MainCanvas.e != null && MainCanvas.e.ad()) {
                     MainCanvas.e.l = 0;
                     MainCanvas.e.c((byte)0);
                     GlobalStatus.lt[1] = -1;
                     return;
                  }

                  if (MainCanvas.e != null && GlobalStatus.lt[1] == 1) {
                     MainCanvas.e.l = 0;
                     MainCanvas.e.c((byte)0);
                     GlobalStatus.lt[1] = -1;
                     return;
                  }

                  if (MainCanvas.e.e.touchPageCase == 1) {
                     MainCanvas.e.e.touchPageCase = this.a.k;
                  }

                  return;
               case 8739:
                  GlobalStatus.aN(this.b);
                  c_3.a("游客注册 第2步: ", "创建一哥哥通行证密码");
                  this.a.touchPageCase = 7;
                  return;
               case 8960:
                  GlobalStatus.ao(this.b);
                  if (MainCanvas.e.M.p == 0) {
                     MainCanvas.e.M.u();
                  } else {
                     MainCanvas.e.M.h(2);
                  }

                  return;
               case 8961:
                  GlobalStatus.ap(this.b);
                  MainCanvas.e.f((byte)2);
                  return;
               case 8962:
                  GlobalStatus.aq(this.b);
                  return;
               case 8963:
                  GlobalStatus.kj = this.b.readShort();
                  return;
               case 8964:
                  GlobalStatus.ar(this.b);
                  if (GlobalStatus.kk != null) {
                     this.a.b(GlobalStatus.kk);
                     this.a.a(false);
                  }

                  return;
               case 8965:
                  GlobalStatus.as(this.b);
                  MainCanvas.e.M.h(3);
                  return;
               case 8966:
                  GlobalStatus.ax(this.b);
                  MainCanvas.e.M.w();
                  return;
               case 8967:
                  GlobalStatus.ay(this.b);
                  MainCanvas.e.M.x();
                  return;
               case 8968:
                  GlobalStatus.aC(this.b);
                  GlobalStatus.O.a();
                  return;
               case 8969:
                  GlobalStatus.aB(this.b);
                  if (MainCanvas.e.k == 76) {
                     int var34 = this.a.as.a;
                     int var52 = this.a.ar.g();
                     MainCanvas.e.d((byte)var34);
                     var34 = var34 == 0 ? GlobalStatus.O.f.length : GlobalStatus.P.b.length;
                     this.a.ar.a(Math.min(var52, var34));
                  }

                  return;
               case 8970:
                  GlobalStatus.a(this.b.readByte(), this.b);
                  return;
               case 8971:
                  if (MainCanvas.e.k != 111) {
                     GlobalStatus.au(this.b);
                     if (GlobalStatus.Q.b != null && GlobalStatus.Q.b.length() > 0) {
                        this.a.av.b();
                        GlobalStatus.Q.a(this.a.av);
                        GlobalStatus.Q.a();
                        GlobalStatus.Q.b();
                        MainCanvas.e.j = MainCanvas.e.k;
                        MainCanvas.e.k = 111;
                        this.a.touchPageCase = this.a.k;
                     }

                     return;
                  }

                  return;
               case 8972:
                  GlobalStatus.aA(this.b);
                  if (MainCanvas.e.k == 76) {
                     byte var50 = this.a.as.a;
                     int var32 = this.a.ar.g();
                     MainCanvas.e.d((byte)var50);
                     this.a.ar.a(var32);
                  }

                  if (MainCanvas.e.k == 111) {
                     if (this.a.touchPageCase == 1) {
                        this.a.touchPageCase = 7;
                     }

                     if (MainCanvas.e.j == 76) {
                        byte var51 = this.a.as.a;
                        int var33 = this.a.ar.g();
                        MainCanvas.e.d((byte)var51);
                        this.a.ar.a(var33);
                        break;
                     }
                  }

                  return;
               case 8973:
                  GlobalStatus.az(this.b);
                  GlobalStatus.P.c();
                  MainCanvas.e.u();
                  return;
               case 8974:
                  GlobalConfig.printStr("exec特效查看");
                  GlobalStatus.aT(this.b);
                  MainCanvas.e.z();
                  return;
               case 8975:
                  GlobalConfig.printStr("exec特效激活");
                  GlobalStatus.aU(this.b);
                  MainCanvas.e.B();
                  return;
               case 8976:
                  GlobalConfig.printStr("exec特效消除");
                  GlobalStatus.aV(this.b);
                  MainCanvas.e.A();
                  return;
               case 8977:
                  GlobalConfig.printStr("exec查看坐骑");
                  GlobalStatus.aY(this.b);
                  MainCanvas.e.al();
                  MainCanvas.e.I.a(true);
                  return;
               case 8978:
                  GlobalConfig.printStr("exec坐骑升星");
                  GlobalStatus.aZ(this.b);
                  MainCanvas.e.al();
                  return;
               case 8979:
                  GlobalConfig.printStr("exec更换坐骑");
                  GlobalStatus.ba(this.b);
                  MainCanvas.e.al();
                  MainCanvas.e.I.a(true);
                  return;
               case 8981:
                  GlobalConfig.printStr("exec特效技能");
                  GlobalStatus.bb(this.b);
                  MainCanvas.e.an();
                  return;
               case 8982:
                  GlobalConfig.printStr("exec宠物炼化需 求");
                  (GlobalStatus.nC = new String[3])[0] = this.b.readUTF();
                  GlobalStatus.nC[1] = this.b.readUTF();
                  GlobalStatus.nC[2] = this.b.readUTF();
                  MainCanvas.e.l = 11;
                  LoadingPage.h = 0;
                  this.a.touchPageCase = this.a.k;
                  return;
               case 9216:
                  v_1.a(this.b);
                  if (v_1.a != null) {
                     MainCanvas.e.S.a((int)0);
                  } else {
                     this.a.b("暂无求爱信息!");
                  }

                  return;
               case 9217:
                  v_1.b(this.b);
                  if (v_1.b != null) {
                     MainCanvas.e.S.b();
                  } else {
                     this.a.b("求爱信息不存在!");
                  }

                  return;
               case 9218:
                  v_1.c(this.b);
                  MainCanvas.e.S.c();
                  return;
               case 9219:
                  v_1.d(this.b);
                  MainCanvas.e.S.d();
                  return;
               case 9220:
                  v_1.e(this.b);
                  MainCanvas.e.S.f();
                  return;
               case 9221:
                  if (ao_1.i()) {
                     this.a.touchPageCase = this.a.k = 7;
                     MainCanvas.e.j = MainCanvas.e.k = 0;
                  }

                  this.a.b(this.b.readUTF());
                  return;
               case 9222:
                  GlobalStatus.aQ(this.b);
                  if (MainCanvas.e != null) {
                     MainCanvas.e.ac();
                  }

                  return;
               case 9223:
                  byte var31 = this.b.readByte();
                  if (MainCanvas.e != null) {
                     if (var31 == 1) {
                        MainCanvas.e.af();
                     } else if (var31 == 2) {
                        MainCanvas.e.ag();
                     }
                     break;
                  }

                  return;
               case 9472:
                  GlobalStatus.M(this.b);
                  if (GlobalConfig.channel != 0 && !GlobalConfig.w) {
                     if (GlobalStatus.hw) {
                        if (GlobalStatus.hw && GlobalStatus.hA.length <= 0) {
                           this.a.b("服务维护中，暂无可以进入的服务器");
                           return;
                        }

                        this.a.k = this.a.touchPageCase = 4;
                        this.a.touchAction = 0;
                        this.a.b = 0;
                        this.a.a((int)0);
                        this.a.touchAction = 0;
                        return;
                     }

                     if (GlobalStatus.hA != null && GlobalStatus.hA.length > 0) {
                        this.a.d();
                        return;
                     }

                     this.a.b("服务维护中，暂无可以进入的服务器");
                     return;
                  }

                  this.a.d();
                  return;
               case 9473:
                  GlobalStatus.lq = this.b.readByte();
                  GlobalStatus.lp = this.b.readShort();
                  GlobalStatus.kZ = this.b.readShort();
                  GlobalStatus.lf = this.b.readUTF();
                  GlobalStatus.lg = this.b.readByte();
                  if ((GlobalStatus.le = this.b.readShort()) > 0) {
                     GlobalStatus.aL(this.b);
                     MainCanvas.e.d(GlobalStatus.kZ);
                  } else {
                     this.a.b("没有更多的成就!");
                  }

                  return;
               case 9474:
                  GlobalStatus.ls = this.b.readByte();
                  GlobalStatus.lr = this.b.readShort();
                  GlobalStatus.kZ = this.b.readShort();
                  this.b.readUTF();
                  this.b.readByte();
                  GlobalStatus.lm = this.b.readByte();
                  GlobalStatus.lh = this.b.readUTF();
                  if ((GlobalStatus.ll = this.b.readShort()) > 0) {
                     GlobalStatus.aM(this.b);
                     MainCanvas.e.e(GlobalStatus.kZ);
                  } else {
                     this.a.b("没有更多的成就!");
                  }

                  return;
               case 9488:
                  GlobalStatus.x(this.b);
                  MainCanvas.e.ai();
                  return;
               case 9489:
                  GlobalStatus.y(this.b);
                  MainCanvas.e.aj();
                  return;
               case 9491:
                  GlobalConfig.printStr("exec 随机名称");
                  this.a.ay = this.b.readUTF();
                  if (this.a.k == 6) {
                     this.a.touchPageCase = this.a.k;
                  }

                  return;
               case 9494:
                  if (MainCanvas.e != null) {
                     if (MainCanvas.e.R == null) {
                        MainCanvas.e.R = new bd(MainCanvas.e, MainCanvas.e.e, MainCanvas.f);
                     }

                     MainCanvas.e.R.a(this.b);
                     MainCanvas.e.R.a();
                  }

                  return;
               case 10496:
                  byte var30 = this.b.readByte();
                  this.b.readByte();
                  if (var30 == 4) {
                     String[] var3;
                     bb_1.j = (var3 = z_1.a(this.b.readUTF(), ':'))[0].trim();
                     bb_1.i = var3[1].trim();
                     bb_1.m = bb_1.j;
                     bb_1.n = bb_1.i;
                     bb_1.b();
                     String var4 = this.b.readUTF();
                     this.a.b(var4);
                  } else if (var30 == 2) {
                     String[] var49;
                     bb_1.j = (var49 = z_1.a(this.b.readUTF(), ':'))[0].trim();
                     bb_1.i = var49[1].trim();
                     bb_1.m = bb_1.j;
                     bb_1.n = bb_1.i;
                     bb_1.b();
                     String var58 = this.b.readUTF();
                     this.a.b(var58);
                     break;
                  }

                  return;
               case 12289:
                  byte var2 = this.b.readByte();
                  GlobalStatus.ke = -1;
                  GlobalStatus.kf = -1;
                  GlobalStatus.kg = -1;
                  if (var2 == 0) {
                     GlobalStatus.ke = this.b.readInt();
                     GlobalStatus.kf = this.b.readInt();
                     GlobalStatus.kg = this.b.readInt();
                  }

                  return;
            }
         } catch (Exception var28) {
            ((Throwable)var28).printStackTrace();
            this.a.a((Exception)var28, (byte)5);
            return;
         } finally {
            if (var1 != null) {
               this.d = var1.getCode();
            }

            try {
               if (this.b != null) {
                  this.b.close();
               }

               if (this.c != null) {
                  this.c.close();
               }
            } catch (IOException var27) {
               ((Throwable)var27).printStackTrace();
            }

         }

      }
   }

   private void a() throws IOException {
      GlobalStatus.C = new byte[this.b.readByte()];

      for(byte var1 = 0; var1 < GlobalStatus.C.length; ++var1) {
         GlobalStatus.C[var1] = this.b.readByte();
      }

   }

   private void a(DataInputStream var1) {
      try {
         if (MainCanvas.e != null && MainCanvas.e.k != 25 && MainCanvas.e.k != 18) {
            byte var2;
            if ((var2 = var1.readByte()) > ao_1.aW[0] && GlobalStatus.bw == 0) {
               var2 = ao_1.aW[0];
            }

            bl[] var3 = new bl[var2];

            for(int var4 = 0; var4 < var2; ++var4) {
               var3[var4] = new bl();
               var3[var4].a(var1);
            }

            if (GlobalStatus.o != null) {
               MainCanvas var5 = this.a;
               q var14 = this;
               this.i.removeAllElements();
               bl[] var21 = var3;
               q var16 = this;
               if (this.j == null) {
                  this.j = new bl[3];
               }

               if (var3 != null && MainCanvas.e != null && MainCanvas.e.I != null) {
                  for(int var6 = 0; var6 < var16.j.length; ++var6) {
                     var16.j[var6] = null;
                  }

                  boolean var23 = false;
                  if (var3.length <= 3) {
                     var23 = true;
                  }

                  byte var7 = (byte)(MainCanvas.e.I.k / 16);
                  byte var8 = (byte)(MainCanvas.e.I.j / 16);
                  byte var9 = 0;
                  byte var10 = 0;
                  byte var11 = 0;

                  for(int var12 = 0; var12 < var21.length; ++var12) {
                     if (var21[var12] != null) {
                        boolean var35;
                        label234: {
                           bl var31;
                           if ((var31 = var21[var12]) != null) {
                              for(int var33 = 0; var33 < GlobalStatus.o.length; ++var33) {
                                 if (GlobalStatus.o[var33] != null && GlobalStatus.o[var33].a.equals(var31.a)) {
                                    var31.j = GlobalStatus.o[var33].j;
                                    var31.k = GlobalStatus.o[var33].k;
                                    var31.h = GlobalStatus.o[var33].h;
                                    var35 = true;
                                    break label234;
                                 }
                              }
                           }

                           var35 = false;
                        }

                        if (var35) {
                           var9 = (byte)(var21[var12].k / 16);
                           if (((var10 = (byte)(var21[var12].j / 16)) >= var8 - 4 && var10 <= var8 + 4 && var9 >= var7 - 4 && var9 <= var7 + 4 || var23) && (Math.abs(var21[var12].l - var21[var12].j) >= 32 || Math.abs(var21[var12].m - var21[var12].k) >= 32 || var23) && var11 < var16.j.length) {
                              var16.j[var11] = var21[var12];
                              ++var11;
                           }
                        }
                     }
                  }
               }

               if (this.j != null) {
                  for(int var17 = 0; var17 < var14.j.length; ++var17) {
                     if (var14.j[var17] != null) {
                        var14.e = var14.j[var17].j / 16 + (var14.j[var17].j % 16 == 0 ? 0 : 1);
                        var14.f = var14.j[var17].k / 16 + (var14.j[var17].k % 16 == 0 ? 0 : 1);
                        var14.g = var14.j[var17].l / 16 + (var14.j[var17].l % 16 == 0 ? 0 : 1);
                        var14.h = var14.j[var17].m / 16 + (var14.j[var17].m % 16 == 0 ? 0 : 1);
                        if (var14.e != var14.g || var14.f != var14.h) {
                           var14.i = var14.a(MainCanvas.e.f, var14.i, new bs(var14.e, var14.f), new bs(var14.g, var14.h));
                           if (var14.i != null) {
                              var14.j[var17].f.removeAllElements();
                              int var29 = var14.i.size();

                              for(int var30 = 0; var30 < var29; ++var30) {
                                 bs var22 = (bs)var14.i.elementAt(var30);
                                 bs var24;
                                 if (var30 < var29 - 1) {
                                    var24 = (bs)var14.i.elementAt(var30 + 1);
                                 } else {
                                    var24 = var22;
                                 }

                                 if (var22.a != var24.a) {
                                    if (var22.a > var24.a) {
                                       for(int var28 = 0; var28 < 4; ++var28) {
                                          var14.j[var17].f.addElement(new short[]{(short)((var22.a << 4) - (var28 << 2)), (short)(var22.b << 4)});
                                       }
                                    } else {
                                       for(int var27 = 0; var27 < 4; ++var27) {
                                          var14.j[var17].f.addElement(new short[]{(short)((var22.a << 4) + (var27 << 2)), (short)(var22.b << 4)});
                                       }
                                    }
                                 } else if (var22.b != var24.b) {
                                    if (var22.b > var24.b) {
                                       for(int var26 = 0; var26 < 4; ++var26) {
                                          var14.j[var17].f.addElement(new short[]{(short)(var22.a << 4), (short)((var22.b << 4) - (var26 << 2))});
                                       }
                                    } else {
                                       for(int var25 = 0; var25 < 4; ++var25) {
                                          var14.j[var17].f.addElement(new short[]{(short)(var22.a << 4), (short)((var22.b << 4) + (var25 << 2))});
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            } else {
               for(int var18 = 0; var18 < var3.length; ++var18) {
                  var3[var18].j = var3[var18].l;
                  var3[var18].k = var3[var18].m;
               }
            }

            if (var2 > 0) {
               if (GlobalStatus.bw >= 1) {
                  for(int var19 = 0; var19 < var3.length; ++var19) {
                     bl var15;
                     (var15 = var3[var19]).u = var1.readByte();
                     var15.v = var1.readByte();
                  }
               } else {
                  for(int var20 = 0; var20 < var3.length; ++var20) {
                     var3[var20].u = 0;
                  }
               }
            }

            ao_1.a(var3);
         }
      } catch (Exception var13) {
         if (MainCanvas.e != null) {
            MainCanvas.e.c("系统异常[8]");
         }

      }
   }

   private void b() throws IOException {
      GlobalStatus.c(this.b);
      if (MainCanvas.e != null && MainCanvas.e.I != null) {
         if (GlobalConfig.o && this.a.touchController != null) {
            if (!MainCanvas.e.I.c.isEmpty()) {
               MainCanvas.e.I.c.removeAllElements();
               MainCanvas.e.I.b();
            }

            if (this.a.touchController != null) {
               this.a.touchController.c = 0;
               this.a.touchController.d = 0;
            }

            this.a.b = 0;
            this.a.touchAction = 0;
         }

         MainCanvas.e.I.j = GlobalStatus.at;
         MainCanvas.e.I.k = GlobalStatus.au;
      }

      if (GlobalStatus.bs == 0 && GlobalStatus.q != null && GlobalStatus.s == 0) {
         for(int var1 = 0; var1 < GlobalStatus.q.length; ++var1) {
            GlobalStatus.q[var1].f.removeAllElements();
            if (GlobalStatus.q[var1].j == -1 && GlobalStatus.q[var1].k == -1) {
               GlobalStatus.q[var1].j = GlobalStatus.at;
               GlobalStatus.q[var1].k = GlobalStatus.au;
            }

            GlobalStatus.q[var1].l = GlobalStatus.at;
            GlobalStatus.q[var1].m = GlobalStatus.au;
         }
      }

      if (MainCanvas.e == null) {
         this.a.g();
         MainCanvas.e.I.d();
      } else {
         if (MainCanvas.e != null) {
            MainCanvas.e.I.a((int) GlobalStatus.av);
         }

         if (MainCanvas.e.Y == GlobalStatus.ar && !MainCanvas.e.I.h()) {
            if (GlobalStatus.bs == 0 && GlobalStatus.q != null && GlobalStatus.s == 0) {
               MainCanvas var6 = this.a;
               Vector var9 = new Vector();
               this.e = GlobalStatus.q[0].j / 16 + (GlobalStatus.q[0].j % 16 == 0 ? 0 : 1);
               this.f = GlobalStatus.q[0].k / 16 + (GlobalStatus.q[0].k % 16 == 0 ? 0 : 1);
               this.g = GlobalStatus.q[0].l / 16 + (GlobalStatus.q[0].l % 16 == 0 ? 0 : 1);
               this.h = GlobalStatus.q[0].m / 16 + (GlobalStatus.q[0].m % 16 == 0 ? 0 : 1);
               if (this.e != this.g || this.f != this.h) {
                  if (GlobalStatus.q[0].f == null) {
                     GlobalStatus.q[0].f = new Vector();
                  }

                  Vector var10;
                  int var3 = (var10 = this.a(MainCanvas.e.f, var9, new bs(this.e, this.f), new bs(this.g, this.h))).size();

                  for(int var4 = 0; var4 < GlobalStatus.q.length; ++var4) {
                     GlobalStatus.q[var4].f.removeAllElements();

                     for(int var5 = 0; var5 < var3; ++var5) {
                        bs var8 = (bs)var10.elementAt(var5);
                        bs var2;
                        if (var5 < var3 - 1) {
                           var2 = (bs)var10.elementAt(var5 + 1);
                        } else {
                           var2 = var8;
                        }

                        if (var8.a != var2.a) {
                           if (var8.a > var2.a) {
                              for(int var14 = 0; var14 < 4; ++var14) {
                                 GlobalStatus.q[var4].f.addElement(new short[]{(short)((var8.a << 4) - (var14 << 2)), (short)(var8.b << 4)});
                              }
                           } else {
                              for(int var13 = 0; var13 < 4; ++var13) {
                                 GlobalStatus.q[var4].f.addElement(new short[]{(short)((var8.a << 4) + (var13 << 2)), (short)(var8.b << 4)});
                              }
                           }
                        } else if (var8.b != var2.b) {
                           if (var8.b > var2.b) {
                              for(int var12 = 0; var12 < 4; ++var12) {
                                 GlobalStatus.q[var4].f.addElement(new short[]{(short)(var8.a << 4), (short)((var8.b << 4) - (var12 << 2))});
                              }
                           } else {
                              for(int var11 = 0; var11 < 4; ++var11) {
                                 GlobalStatus.q[var4].f.addElement(new short[]{(short)(var8.a << 4), (short)((var8.b << 4) + (var11 << 2))});
                              }
                           }
                        }
                     }
                  }
               }
            }

         } else {
            if (GlobalStatus.bs == -1) {
               MainCanvas.e.aY = 0L;
            }

            if (MainCanvas.e.I.d != null) {
               MainCanvas.e.I.d.e.removeAllElements();
               MainCanvas.e.I.d.h = GlobalStatus.at;
               MainCanvas.e.I.d.i = GlobalStatus.au;
               MainCanvas.e.I.d.j = MainCanvas.e.I.h;
               MainCanvas.e.I.d.a(MainCanvas.e.I.h);
            }

            if (ao_1.i()) {
               if (MainCanvas.e.Y != GlobalStatus.ar) {
                  MainCanvas.e.e();
               } else {
                  MainCanvas.e.f();
               }

               MainCanvas.e.I.i();
               MainCanvas.e.Y = GlobalStatus.ar;
            }

            MainCanvas.e.I.d();
         }
      }
   }

   private void c() throws IOException {
      if (GlobalStatus.bE = this.b.readByte() == 1) {
         GlobalStatus.bF = this.b.readInt();
      } else {
         GlobalStatus.bF = -1;
      }

      GlobalStatus.bG = this.b.readInt();
      GlobalStatus.bH = this.b.readUTF();
      if (GlobalStatus.bE) {
         MainCanvas.e.k = 2;
      }

      if (MainCanvas.e.k == 2) {
         ao_1.K = new TextRender(GlobalStatus.bH, (short)(GlobalConfig.defaultWidth - 20));
         if (GlobalStatus.bE) {
            MainCanvas.e.an = new String[]{"接受", "返回"};
         } else if (GlobalStatus.bK[MainCanvas.e.ai] == -1) {
            MainCanvas.e.an = new String[]{"接受", "返回"};
         } else if (GlobalStatus.bK[MainCanvas.e.ai] == 0) {
            MainCanvas.e.an = new String[]{"确定", "返回"};
         } else if (GlobalStatus.bK[MainCanvas.e.ai] == 1) {
            MainCanvas.e.an = new String[]{"提交", "返回"};
         }

         LoadingPage.a(MainCanvas.F, ao_1.K, MainCanvas.e.an, (String[])null, true);
         this.a.touchPageCase = this.a.k;
         MainCanvas.e.l = 1;
      } else {
         if (MainCanvas.e.k == 6) {
            this.a.b("不处理");
         }

      }
   }

   private void d() throws IOException {
      GlobalStatus.I(this.b);
      if (MainCanvas.e != null) {
         if (!ao_1.i()) {
            return;
         }

         if (MainCanvas.e.k == 13) {
            if (GlobalStatus.fA == null) {
               GlobalStatus.B();
               this.a.b("您没有宠物！");
               return;
            }

            if (MainCanvas.e.l == 6) {
               MainCanvas.e.k(MainCanvas.e.aE);
               return;
            }

            if (MainCanvas.e.l == 8) {
               if (this.a.touchPageCase != 2) {
                  this.a.touchPageCase = this.a.k;
                  return;
               }
            } else if (o_1.e == 1) {
               if (this.a.touchPageCase != 2) {
                  this.a.touchPageCase = this.a.k;
                  return;
               }
            } else {
               MainCanvas.e.j(MainCanvas.e.as);
               if (this.a.touchPageCase != 2) {
                  this.a.touchPageCase = this.a.k;
                  return;
               }
            }
         } else {
            if (MainCanvas.e.k == 36) {
               MainCanvas.e.b(false);
               return;
            }

            if (MainCanvas.e.k == 96 && MainCanvas.e.ap) {
               MainCanvas.e.k(MainCanvas.e.aE);
               MainCanvas.e.ap = false;
               return;
            }

            if (MainCanvas.e.k == 4 && MainCanvas.e.bh) {
               MainCanvas.e.s(MainCanvas.e.bg);
               return;
            }

            if (MainCanvas.e.k == 120) {
               MainCanvas.e.t(this.a.ar.g());
            }
         }
      }

   }

   private static void b(DataInputStream var0) throws IOException {
      long var1 = var0.readLong();
      if (bq_1.g > 0 && GlobalStatus.v <= 0L) {
         GlobalStatus.v = var1;
         bq_1.g = -1;
      }

      short var8;
      if ((var8 = var0.readShort()) > 0) {
         boolean var2 = false;
         short var3 = 0;

         for(int var9 = 0; var9 < var8; ++var9) {
            if ((var3 = var0.readShort()) > 0) {
               i[] var4 = new i[var3];

               for(int var5 = 0; var5 < var3; ++var5) {
                  var4[var5] = new i();
                  i var6;
                  (var6 = var4[var5]).a = var0.readByte();
                  var6.b = var0.readByte();
                  var0.readByte();
                  var6.c = var0.readByte();
                  var6.d = var0.readByte();
                  var6.e = var0.readShort();
                  var6.f = var0.readUTF();
               }

               MainCanvas.e.g.a(var4);
            }
         }

         Object var15 = null;

         for(int var10 = 0; var10 < var8; ++var10) {
            if ((var3 = var0.readShort()) > 0) {
               ae[] var16 = new ae[var3];

               for(int var14 = 0; var14 < var3; ++var14) {
                  var16[var14] = new ae();
                  ae var17;
                  (var17 = var16[var14]).f = 0;
                  var17.a = var0.readByte();
                  var17.b = var0.readByte();
                  var17.c = var0.readByte();
                  var17.d = var0.readInt();
                  var17.g = var0.readInt();
                  var17.i = var0.readInt();
                  var17.e = var0.readInt();
                  var17.h = var0.readInt();
                  var17.j = var0.readInt();
                  var17.k = var0.readByte();
               }

               MainCanvas.e.g.a(var16);
            }
         }

         for(int var11 = 0; var11 < var8; ++var11) {
            MainCanvas.e.g.a(var0.readUTF());
         }

         if (MainCanvas.e.k == 25 || MainCanvas.e.k == 18 || !ao_1.i()) {
            MainCanvas.e.g.f = 1;
         }
      }

   }

   private void e() throws IOException {
      byte var1;
      if ((var1 = this.b.readByte()) <= 0) {
         if (MainCanvas.e != null) {
            MainCanvas.e.a((bp_1[])null);
         }

      } else {
         GlobalStatus.s = (short)this.b.readByte();
         bp_1[] var2 = new bp_1[var1];
         byte var3 = 1;

         for(int var4 = 0; var4 < var1; ++var4) {
            var2[var4] = new bp_1();
            var2[var4].a(MainCanvas.e, this.b);
            if (var2[var4].s == 1) {
               var2[var4].a = 0;
            } else {
               var2[var4].a = var3++;
            }
         }

         bp_1[] var6 = var2;

         for(int var7 = 0; var7 < var6.length - 1; ++var7) {
            for(int var8 = 0; var8 < var6.length - 1; ++var8) {
               bp_1 var9 = var6[var8];
               bp_1 var5;
               if ((var5 = var6[var8 + 1]).a < var9.a) {
                  var6[var8] = var5;
                  var6[var8 + 1] = var9;
               }
            }
         }

         if (MainCanvas.e != null) {
            MainCanvas.e.a(var2);
         }

      }
   }

   private void f() throws IOException {
      byte var1 = this.b.readByte();
      if (GlobalStatus.fl != null) {
         GlobalStatus.v();
      }

      if (GlobalStatus.fs != null) {
         GlobalStatus.w();
      }

      GlobalStatus.fw = null;
      GlobalStatus.y();
      GlobalStatus.z();
      GlobalStatus.fg = 0L;
      GlobalStatus.fn = 0L;
      MainCanvas.e.am = null;
      MainCanvas.e.al = null;
      if (ao_1.i()) {
         MainCanvas.f.a(MainCanvas.e.f, ao_1.h, ao_1.i, true, false, 2109231);
         this.a.touchPageCase = this.a.k = 7;
         MainCanvas.e.j = MainCanvas.e.k = 0;
      }

      if (var1 == 1) {
         this.a.b("交易成功!");
      } else if (var1 == 0) {
         this.a.b("交易取消!");
      } else {
         if (var1 == -1) {
            this.a.b(this.b.readUTF());
         }

      }
   }

   private static void c(DataInputStream var0) throws IOException {
      GlobalStatus.am(var0);
      MainCanvas.e.l((byte)1);
   }

   public final Vector a(aw var1, Vector var2, bs var3, bs var4) {
      try {
         if (var1 == null || var2 == null || var1.i == null) {
            return new Vector();
         }

         Vector var10 = new Vector();
         boolean var5 = false;
         var2.removeAllElements();
         var2.addElement(var3);

         while(!var2.isEmpty()) {
            bs var6;
            if ((var6 = a(var2, var4)).b(var4)) {
               var5 = true;
            }

            if (var5) {
               var10.removeAllElements();
               var10.addElement(var4);
               var6 = a(var2, var4);

               while(!var6.b(var3)) {
                  var6 = var6.c;
                  var10.addElement(var6);
               }

               return var10;
            }

            var2.removeElement(var6);
            var10.addElement(var6);
            bs[] var7 = new bs[]{new bs(var6.a, var6.b - 1), new bs(var6.a, var6.b + 1), new bs(var6.a - 1, var6.b), new bs(var6.a + 1, var6.b)};

            for(int var8 = 0; var8 < var7.length; ++var8) {
               if ((var7[var8].a != var6.a || var7[var8].b != var6.b) && var7[var8].a >= 0 && var7[var8].a < var1.a / 16 + (var1.a % 16 == 0 ? 0 : 1) + 1 && var7[var8].b >= 0 && var7[var8].b < var1.b / 16 + (var1.b % 16 == 0 ? 0 : 1) + 1 && !a(var2, var7[var8].a, var7[var8].b) && !b(var10, var7[var8].a, var7[var8].b) && MainCanvas.f.a(var1, (var7[var8].a << 4) + 8, var7[var8].b << 4) == 0 && !MainCanvas.f.a((var7[var8].a << 4) + 8, var7[var8].b << 4)) {
                  var2.addElement(new bs(var7[var8].a, var7[var8].b, var6));
               }
            }
         }
      } catch (Exception var9) {
      }

      return new Vector();
   }

   private static boolean a(Vector var0, int var1, int var2) {
      for(int var3 = 0; var3 < var0.size(); ++var3) {
         if (var1 == ((bs)var0.elementAt(var3)).a && var2 == ((bs)var0.elementAt(var3)).b) {
            return true;
         }
      }

      return false;
   }

   private static boolean b(Vector var0, int var1, int var2) {
      for(int var3 = 0; var3 < var0.size(); ++var3) {
         if (var1 == ((bs)var0.elementAt(var3)).a && var2 == ((bs)var0.elementAt(var3)).b) {
            return true;
         }
      }

      return false;
   }

   private static bs a(Vector var0, bs var1) {
      bs var2 = null;

      for(int var3 = 0; var3 < var0.size(); ++var3) {
         bs var4 = (bs)var0.elementAt(var3);
         if (var2 == null || var2.a(var1) > var4.a(var1)) {
            var2 = var4;
         }
      }

      return var2;
   }
}

package com.cc;

import com.yinhan.kjava.main.MainCanvas;
import com.yinhan.kjava.main.c_3;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Vector;

public final class NetworkPacketProcessors {
    private MainCanvas mainCanvas;
    private DataInputStream b;
    private ByteArrayInputStream bis;
    private short d = -1;
    private int e;
    private int f;
    private int g;
    private int h;
    private Vector i = new Vector();
    private bl[] j;

    public void setMainCanvas(MainCanvas var1) {
        this.mainCanvas = var1;
    }

    public void process(NetPacket var1) {
        if (var1 != null) {
            try {
                this.d = var1.getCode();
                if (this.d != 8192) {
                    if (var1.payload == null) {
                        return;
                    }

                    this.bis = new ByteArrayInputStream(var1.payload);
                    this.b = new DataInputStream(this.bis);
                }

                switch (this.d) {
                    case 8192:
                        if (var1.child == null) {
                            return;
                        }

                        while (var1.child.size() > 0) {
                            this.process((NetPacket) var1.child.elementAt(0));
                            var1.child.removeElementAt(0);
                        }

                        return;
                    case 8193:
                        GlobalStatus.w(this.b);
                        if (GlobalStatus.eB == 53) {
                            if (MainCanvas.uiSceneController.overlayDialogController != null) {
                                MainCanvas.uiSceneController.overlayDialogController.d();
                                MainCanvas.uiSceneController.sceneStateShadow = MainCanvas.uiSceneController.currentSceneModeId = 0;
                                this.mainCanvas.processException(GlobalConfig.YiChangTiShi[GlobalStatus.eB]);
                            }

                            return;
                        }

                        if (GlobalStatus.eB == 48) {
                            if (MainCanvas.uiSceneController.overlayDialogController != null) {
                                MainCanvas.uiSceneController.overlayDialogController.f = -2;
                            } else {
                                this.mainCanvas.processException(GlobalConfig.YiChangTiShi[GlobalStatus.eB]);
                            }

                            return;
                        }

                        if (GlobalStatus.eB != -2) {
                            if (MainCanvas.uiSceneController == null || MainCanvas.uiSceneController.overlayDialogController == null || MainCanvas.uiSceneController.overlayDialogController.f != -1 || GlobalStatus.eC == null || !GlobalStatus.eC.startsWith("等待他人操作")) {
                                if (GlobalStatus.eC != null) {
                                    this.mainCanvas.processException(GlobalStatus.eC);
                                } else {
                                    this.mainCanvas.processException(GlobalConfig.YiChangTiShi[GlobalStatus.eB < 0 ? 0 : GlobalStatus.eB]);
                                }
                                break;
                            }

                            return;
                        }

                        if (MainCanvas.uiSceneController.currentSceneModeId == 111 && MainCanvas.uiSceneController.sceneStateShadow == 0) {
                            MainCanvas.uiSceneController.currentSceneModeId = MainCanvas.uiSceneController.sceneStateShadow;
                        }

                        return;
                    case 8194:
                        GlobalStatus.zhangHao = this.b.readUTF();
                        GlobalStatus.d = this.b.readUTF();
                        return;
                    case 8195:
                        GlobalConfig.printStr("exec角色列表:");
                        GlobalStatus.a(this.b);
                        this.mainCanvas.b(GlobalStatus.W == null ? 0 : GlobalStatus.W.length);
                        return;
                    case 8197:
                        GlobalStatus.d(this.b);
                        if (MainCanvas.uiSceneController == null) {
                            return;
                        }

                        MainCanvas.uiSceneController.aX = false;
                        if (MainCanvas.uiSceneController.currentSceneModeId == 2 && MainCanvas.uiSceneController.sceneSubState == 4) {
                            String var48 = GlobalConfig.yinLiangFormat(this.mainCanvas.shareSb, GlobalStatus.aq);
                            GlobalConfig.yinLiangFormat(this.mainCanvas.shareSb, GlobalStatus.ap);
                            MainCanvas.uiSceneController.am = LoadingPage.parseText(GlobalStatus.t[MainCanvas.uiSceneController.af].b + ":已存入银两" + var48 + "，现有银两" + this.mainCanvas.shareSb.toString(), GlobalConfig.font2, GlobalConfig.defaultWidth == 176 ? 118 : 152, "\t");
                            MainCanvas.uiSceneController.ah = MainCanvas.uiSceneController.sceneSubMode == 1 ? GlobalStatus.aq : GlobalStatus.ap;
                        } else if (MainCanvas.uiSceneController.currentSceneModeId == 37 && MainCanvas.uiSceneController.ao) {
                            MainCanvas.uiSceneController.p();
                            MainCanvas.uiSceneController.ao = false;
                        }

                        MainCanvas.uiSceneController.sceneRefreshCoordinator.a();
                        return;
                    case 8198:
                        byte var47;
                        if ((var47 = this.b.readByte()) > 0) {
                            az_1[] var57 = new az_1[var47];

                            for (int var64 = 0; var64 < var47; ++var64) {
                                var57[var64] = new az_1();
                                var57[var64].a(this.b);
                            }

                            GlobalStatus.u.addElement(var57);
                        }

                        UISceneController.Q();
                        if (MainCanvas.uiSceneController != null) {
                            MainCanvas.uiSceneController.P();
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
                            this.mainCanvas.i();
                        } else if (var56 == 2 && MainCanvas.uiSceneController != null) {
                            MainCanvas.uiSceneController.e((int) 0);
                        }

                        if (MainCanvas.uiSceneController != null && MainCanvas.uiSceneController.sceneStateShadow == 4) {
                            MainCanvas.uiSceneController.s();
                            return;
                        }

                        if (MainCanvas.uiSceneController != null && MainCanvas.uiSceneController.currentSceneModeId == 9) {
                            MainCanvas.uiSceneController.s();
                        }

                        return;
                    case 8202:
                        GlobalStatus.l(this.b);
                        if (MainCanvas.uiSceneController != null && MainCanvas.uiSceneController.currentSceneModeId == 5) {
                            MainCanvas.uiSceneController.sceneSubState = 0;
                            this.mainCanvas.touchPageCase = this.mainCanvas.k = 7;
                        }

                        return;
                    case 8203:
                        this.b.readByte();
                        GlobalStatus.n(this.b);
                        if (MainCanvas.uiSceneController.currentSceneModeId == 12) {
                            if (this.mainCanvas.topUi.a == 0) {
                                MainCanvas.uiSceneController.a((byte) 1, true);
                            } else if (this.mainCanvas.topUi.a == 1) {
                                MainCanvas.uiSceneController.a((byte) 0, true);
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
                        if (UISceneController.i()) {
                            GlobalStatus.g(this.b);
                            MainCanvas.uiSceneController.sceneSubState = 0;
                            MainCanvas.uiSceneController.m();
                            return;
                        }

                        return;
                    case 8208:
                        byte var46 = this.b.readByte();
                        GlobalStatus.b(this.b, var46);
                        if (var46 == 1) {
                            MainCanvas.uiSceneController.M.y();
                        } else {
                            MainCanvas.uiSceneController.N();
                        }

                        return;
                    case 8209:
                        this.c();
                        if (MainCanvas.uiSceneController.currentSceneModeId == 0) {
                            MainCanvas.uiSceneController.sceneSubState = 0;
                            MainCanvas.uiSceneController.m();
                        }

                        return;
                    case 8210:
                        GlobalStatus.t(this.b);
                        if (MainCanvas.uiSceneController != null) {
                            if (MainCanvas.uiSceneController.currentSceneModeId == 12 && MainCanvas.uiSceneController.sceneSubState >= 6) {
                                if (this.mainCanvas.touchPageCase != 2) {
                                    this.mainCanvas.touchPageCase = this.mainCanvas.k;
                                }

                                MainCanvas.uiSceneController.sceneSubState = 6;
                                MainCanvas.uiSceneController.a(GlobalStatus.en);
                                return;
                            }

                            if (MainCanvas.uiSceneController.currentSceneModeId == 4 && MainCanvas.uiSceneController.sceneSubState >= 8) {
                                if (this.mainCanvas.touchPageCase != 2) {
                                    this.mainCanvas.touchPageCase = this.mainCanvas.k;
                                }

                                MainCanvas.uiSceneController.a(GlobalStatus.en);
                                MainCanvas.uiSceneController.sceneSubState = 8;
                            }

                            return;
                        }

                        return;
                    case 8211:
                        GlobalStatus.D(this.b);
                        MainCanvas.uiSceneController.a(GlobalStatus.fs);
                        MainCanvas.uiSceneController.a(GlobalStatus.fl);
                        if (this.mainCanvas.touchPageCase == 1) {
                            this.mainCanvas.touchPageCase = this.mainCanvas.k;
                        }

                        return;
                    case 8212:
                        GlobalStatus.E(this.b);
                        if (this.mainCanvas.touchPageCase == 1) {
                            this.mainCanvas.touchPageCase = this.mainCanvas.k;
                        }

                        return;
                    case 8213:
                        GlobalStatus.q(this.b);
                        if (MainCanvas.uiSceneController == null) {
                            return;
                        }

                        if (UISceneController.i() && MainCanvas.uiSceneController.currentSceneModeId != 20) {
                            if (this.mainCanvas.touchPageCase != 2) {
                                MainCanvas.uiSceneController.a(MainCanvas.uiSceneController.currentSceneModeId);
                            } else {
                                this.mainCanvas.az = true;
                            }

                            return;
                        }

                        this.mainCanvas.az = false;
                        MainCanvas.uiSceneController.b(GlobalStatus.dT[1], GlobalStatus.dX);
                        return;
                    case 8214:
                        byte var45;
                        if ((var45 = this.b.readByte()) <= 0) {
                            return;
                        }

                        ce[] var55 = new ce[var45];

                        for (int var63 = 0; var63 < var45; ++var63) {
                            var55[var63] = new ce();
                            var55[var63].a(this.b);
                        }

                        if (MainCanvas.uiSceneController != null) {
                            MainCanvas.uiSceneController.a(var55);
                        }

                        return;
                    case 8215:
                        GlobalStatus.B(this.b);
                        if (UISceneController.i()) {
                            MainCanvas.uiSceneController.v();
                            return;
                        }

                        this.mainCanvas.processException("战斗中不能进行该操作");
                        return;
                    case 8216:
                        GlobalStatus.m(this.b);
                        if (GlobalStatus.cG == null || GlobalStatus.cG.length <= 0) {
                            this.mainCanvas.processException("该玩家没有武器装备!");
                            return;
                        }

                        if (UISceneController.i()) {
                            MainCanvas.uiSceneController.w();
                            return;
                        }

                        this.mainCanvas.processException("战斗中不能进行该操作");
                        return;
                    case 8217:
                        this.e();
                        if (MainCanvas.uiSceneController.currentSceneModeId == 100) {
                            MainCanvas.uiSceneController.N();
                        } else if (MainCanvas.uiSceneController.currentSceneModeId == 7) {
                            MainCanvas.uiSceneController.b((byte) MainCanvas.uiSceneController.aV);
                            break;
                        }

                        return;
                    case 8218:
                        long var6 = this.b.readLong();
                        byte var44 = this.b.readByte();
                        GlobalConfig.printStr("[FIGHT] 8218包: 服务器fightId=" + var6 + " 本地v=" + GlobalStatus.v + " bq_1.g=" + bq_1.g);
                        if (var6 == -1L) {
                            if (MainCanvas.uiSceneController.overlayDialogController != null) {
                                GlobalStatus.v = -1L;
                                GlobalStatus.x = -1;
                                MainCanvas.uiSceneController.overlayDialogController.l();
                            }
                        } else if (bq_1.g <= 0 && var6 != GlobalStatus.v) {
                            if (MainCanvas.uiSceneController.overlayDialogController != null) {
                                GlobalStatus.v = -1L;
                                GlobalStatus.x = -1;
                                MainCanvas.uiSceneController.overlayDialogController.l();
                            }
                        } else if (var44 == 0) {
                            MainCanvas.uiSceneController.overlayDialogController.f = 7;
                            GlobalStatus.v = -1L;
                            GlobalStatus.x = -1;
                        } else {
                            GlobalStatus.v = -1L;
                            GlobalStatus.x = -1;
                        }

                        GlobalStatus.a();
                        if (GlobalStatus.bu) {
                            MainCanvas.uiSceneController.X.b();
                        }

                        return;
                    case 8219:
                        byte var54 = this.b.readByte();
                        this.b.readLong();
                        GlobalStatus.C(this.b);
                        if (UISceneController.i()) {
                            if (var54 == 0) {
                                GlobalStatus.N();
                            } else if (var54 == 1) {
                                GlobalStatus.x();
                            }

                            MainCanvas.uiSceneController.b(var54, false);
                        } else {
                            MainCanvas.uiSceneController.g(var54);
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
                        if (UISceneController.i()) {
                            if (!UISceneController.i()) {
                                return;
                            }

                            GlobalStatus.h(this.b);
                            if (MainCanvas.uiSceneController.currentSceneModeId != 6) {
                                return;
                            }

                            if (GlobalStatus.bR == null && GlobalStatus.bL == null) {
                                this.mainCanvas.processException("当前没有任务");
                                return;
                            }

                            MainCanvas.uiSceneController.x();
                            return;
                        }

                        GlobalStatus.h(this.b);
                        return;
                    case 8224:
                        GlobalStatus.bH = this.b.readUTF();
                        if (MainCanvas.uiSceneController.currentSceneModeId == 6) {
                            this.mainCanvas.mixedUi.b();
                            this.mainCanvas.mixedUi.a("任务详细");
                            this.mainCanvas.textPanel.setFWBText(GlobalStatus.bH, GlobalConfig.font2, (byte) 2);
                            this.mainCanvas.textPanel.setShuRuMoShi((byte) 0);
                            this.mainCanvas.bottomUi.a("确定");
                            this.mainCanvas.mixedUi.a((BaseUi) this.mainCanvas.textPanel);
                            this.mainCanvas.mixedUi.a((BaseUi) this.mainCanvas.bottomUi);
                            this.mainCanvas.mixedUi.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
                            this.mainCanvas.touchPageCase = this.mainCanvas.k;
                            MainCanvas.uiSceneController.sceneSubState = 3;
                        }

                        return;
                    case 8225:
                        GlobalStatus.i(this.b);
                        if (GlobalStatus.bW) {
                            MainCanvas.uiSceneController.F();
                        }

                        return;
                    case 8226:
                        GlobalStatus.J(this.b);
                        if (GlobalStatus.gS == null) {
                            this.mainCanvas.processException("附近没有玩家!");
                            return;
                        }

                        if (UISceneController.i()) {
                            if (MainCanvas.uiSceneController.sceneStateShadow != 7) {
                                MainCanvas.uiSceneController.b((byte) 0);
                            } else {
                                MainCanvas.uiSceneController.b((byte) MainCanvas.uiSceneController.aV);
                            }

                            return;
                        }

                        this.mainCanvas.processException("战斗中不能查看周围玩家");
                        return;
                    case 8227:
                        GlobalStatus.j(this.b);
                        if (GlobalStatus.cs == null) {
                            this.mainCanvas.processException("没有可传送的目的地!");
                            return;
                        }

                        if (MainCanvas.uiSceneController.currentSceneModeId == 1 || MainCanvas.uiSceneController.currentSceneModeId == 100) {
                            MainCanvas.uiSceneController.a(false);
                        }

                        return;
                    case 8228:
                        GlobalStatus.s(this.b);
                        if (GlobalStatus.gs != null) {
                            boolean var62 = false;
                            MainCanvas.uiSceneController.J();
                        } else {
                            if (MainCanvas.uiSceneController.aM > 1) {
                                --MainCanvas.uiSceneController.aM;
                                this.mainCanvas.processException("没有更多的宠物了！");
                            } else {
                                GlobalStatus.t();
                            }

                            this.mainCanvas.touchPageCase = this.mainCanvas.k;
                            this.mainCanvas.processException("找不到您搜索的宠物!");
                        }

                        return;
                    case 8229:
                        c(this.b);
                        return;
                    case 8230:
                        GlobalStatus.H(this.b);
                        MainCanvas.uiSceneController.C();
                        return;
                    case 8231:
                        GlobalStatus.r(this.b);
                        if (GlobalStatus.dY != null) {
                            boolean var61 = false;
                            MainCanvas.uiSceneController.I();
                            return;
                        } else {
                            if (MainCanvas.uiSceneController.aM > 1) {
                                --MainCanvas.uiSceneController.aM;
                                this.mainCanvas.processException("没有更多的物品了！");
                                this.mainCanvas.touchPageCase = this.mainCanvas.k;
                            } else {
                                this.mainCanvas.processException("拍卖场没有对应物品!");
                                MainCanvas.uiSceneController.sceneStateShadow = 14;
                            }
                            break;
                        }
                    case 8232:
                        GlobalStatus.k(this.b);
                        if (MainCanvas.uiSceneController.currentSceneModeId == 11) {
                            if (GlobalStatus.ct == null) {
                                this.mainCanvas.processException("仓库没有物品");
                            } else {
                                MainCanvas.uiSceneController.G();
                            }
                            break;
                        }

                        return;
                    case 8233:
                        GlobalStatus.G(this.b);
                        if (MainCanvas.uiSceneController.sceneStateShadow == 35) {
                            if (GlobalStatus.gs != null) {
                                MainCanvas.uiSceneController.D();
                                if (this.mainCanvas.touchPageCase != 2) {
                                    this.mainCanvas.touchPageCase = this.mainCanvas.k;
                                }
                            } else {
                                this.mainCanvas.processException("没有寄养宠物!");
                            }
                            break;
                        }

                        return;
                    case 8234:
                        GlobalStatus.o(this.b);
                        if (MainCanvas.uiSceneController.currentSceneModeId == 29 && GlobalStatus.dE != null) {
                            MainCanvas.uiSceneController.i(MainCanvas.uiSceneController.aE > GlobalStatus.dE.length - 1 ? GlobalStatus.dE.length - 1 : MainCanvas.uiSceneController.aE);
                        }

                        return;
                    case 8235:
                        if (UISceneController.i()) {
                            GlobalStatus.p(this.b);
                        } else {
                            GlobalStatus.s();
                        }

                        if (GlobalStatus.dJ) {
                            if (!UISceneController.i()) {
                                return;
                            }

                            MainCanvas.uiSceneController.p((int) 0);
                            return;
                        }

                        return;
                    case 8236:
                        GlobalStatus.p(this.b);
                        if (MainCanvas.uiSceneController.currentSceneModeId != 7) {
                            MainCanvas.uiSceneController.p((int) 2);
                        }

                        return;
                    case 8238:
                        GlobalStatus.v(this.b);
                        if (!UISceneController.aj || GlobalStatus.ev) {
                            if (GlobalStatus.ew != null) {
                                MainCanvas.uiSceneController.a((short) MainCanvas.uiSceneController.currentSceneModeId, (byte) 1);
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
                        if (MainCanvas.uiSceneController != null) {
                            MainCanvas.uiSceneController.d(false);
                        }

                        return;
                    case 8240:
                        GlobalStatus.z(this.b);
                        MainCanvas.uiSceneController.f((byte) 1);
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
                            MainCanvas.uiSceneController.a(GlobalStatus.fz[MainCanvas.uiSceneController.ay] == 0, false);
                            return;
                        }

                        this.mainCanvas.processException("宠物没有技能!");
                        return;
                    case 8244:
                        GlobalStatus.u(this.b);
                        if (MainCanvas.uiSceneController != null) {
                            if (MainCanvas.uiSceneController.currentSceneModeId == 36 && MainCanvas.uiSceneController.sceneSubState >= 2) {
                                if (this.mainCanvas.touchPageCase != 2) {
                                    this.mainCanvas.touchPageCase = this.mainCanvas.k;
                                }

                                MainCanvas.uiSceneController.sceneSubState = 2;
                                MainCanvas.uiSceneController.a(GlobalStatus.et);
                            }

                            return;
                        }

                        return;
                    case 8245:
                        GlobalStatus.aI(this.b);
                        if (this.b.readByte() == 1) {
                            this.mainCanvas.e();
                        }

                        return;
                    case 8246:
                        GlobalStatus.N(this.b);
                        return;
                    case 8247:
                        GlobalStatus.z = this.b.readByte();
                        if (MainCanvas.uiSceneController != null) {
                            if (MainCanvas.uiSceneController.currentSceneModeId == 3) {
                                MainCanvas.uiSceneController.a((byte) 2);
                            }

                            if (MainCanvas.uiSceneController.currentSceneModeId == 100) {
                                MainCanvas.uiSceneController.N();
                                break;
                            }
                        }

                        return;
                    case 8248:
                        GlobalStatus.A = this.b.readByte();
                        if (MainCanvas.uiSceneController != null) {
                            MainCanvas.uiSceneController.d(false);
                        }

                        return;
                    case 8249:
                        GlobalStatus.B = this.b.readByte();
                        if (MainCanvas.uiSceneController != null) {
                            MainCanvas.uiSceneController.d(false);
                        }

                        return;
                    case 8250:
                        this.a();
                        if (MainCanvas.uiSceneController != null) {
                            MainCanvas.uiSceneController.d(false);
                        }

                        return;
                    case 8251:
                        GlobalStatus.D = this.b.readByte();
                        if (MainCanvas.uiSceneController != null) {
                            MainCanvas.uiSceneController.d(false);
                        }

                        return;
                    case 8252:
                        byte var59 = this.b.readByte();
                        GlobalStatus.f(this.b);
                        if (var59 == 1) {
                            this.mainCanvas.i();
                        }

                        if (MainCanvas.uiSceneController != null && MainCanvas.uiSceneController.sceneStateShadow == 4) {
                            MainCanvas.uiSceneController.s();
                            return;
                        }

                        if (MainCanvas.uiSceneController != null && MainCanvas.uiSceneController.currentSceneModeId == 9) {
                            MainCanvas.uiSceneController.s();
                        }

                        return;
                    case 8253:
                        GlobalStatus.aD(this.b);
                        if (MainCanvas.uiSceneController.currentSceneModeId != 20) {
                            MainCanvas.uiSceneController.Y();
                        }

                        return;
                    case 8254:
                        GlobalStatus.aE(this.b);
                        MainCanvas.uiSceneController.c(MainCanvas.uiSceneController.currentSceneModeId);
                        return;
                    case 8255:
                        GlobalStatus.aG(this.b);
                        MainCanvas.uiSceneController.Z();
                        return;
                    case 8257:
                        GlobalStatus.E = this.b.readByte();
                        if (MainCanvas.uiSceneController != null) {
                            MainCanvas.uiSceneController.d(false);
                        }

                        return;
                    case 8258:
                        GlobalStatus.aH(this.b);
                        if (MainCanvas.uiSceneController.sceneStateShadow != 4 && MainCanvas.uiSceneController.sceneStateShadow != 33) {
                            MainCanvas.uiSceneController.ah();
                        }

                        return;
                    case 8259:
                        GlobalStatus.Y(this.b);
                        if (MainCanvas.uiSceneController.currentSceneModeId == 2) {
                            MainCanvas.uiSceneController.M.b(false);
                        } else if (MainCanvas.uiSceneController.currentSceneModeId == 50) {
                            this.mainCanvas.textPanel.setText(GlobalStatus.iI[this.mainCanvas.gunDongListUi.g()], GlobalConfig.font2, (byte) 2);
                            this.mainCanvas.textPanel.setShuRuMoShi((byte) 1);
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
                            this.mainCanvas.f();
                        }

                        if (GlobalStatus.bs == 0) {
                            this.mainCanvas.n();
                            this.mainCanvas.touchAction = 0;
                            this.mainCanvas.b = 0;
                            this.mainCanvas.mainMidlet.start();
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

                        if (MainCanvas.uiSceneController != null && MainCanvas.uiSceneController.X != null) {
                            MainCanvas.uiSceneController.X.b();
                        }

                        if (MainCanvas.uiSceneController.currentSceneModeId == 100) {
                            MainCanvas.uiSceneController.N();
                        }

                        return;
                    case 8265:
                        GlobalStatus.bv = this.b.readInt();
                        return;
                    case 8267:
                        GlobalStatus.bz = this.b.readUTF();
                        GlobalStatus.by = this.b.readUTF();
                        if (MainCanvas.uiSceneController != null) {
                            MainCanvas.uiSceneController.aa();
                        }

                        return;
                    case 8269:
                        if (MainCanvas.uiSceneController != null) {
                            MainCanvas.uiSceneController.U.a(this.b);
                            MainCanvas.uiSceneController.U.a(false);
                        }

                        return;
                    case 8270:
                        if (MainCanvas.uiSceneController != null) {
                            MainCanvas.uiSceneController.O.b(this.b);
                            MainCanvas.uiSceneController.O.a(false);
                        }

                        return;
                    case 8271:
                        GlobalStatus.aR(this.b);
                        if (MainCanvas.uiSceneController != null) {
                            if (GlobalStatus.mq < 4) {
                                MainCanvas.uiSceneController.ae();
                            } else if (GlobalStatus.mq == 4) {
                                MainCanvas.uiSceneController.N();
                            } else if (GlobalStatus.mq == 5) {
                                MainCanvas.uiSceneController.N();
                            } else if (GlobalStatus.mq == 6) {
                                this.mainCanvas.touchPageCase = this.mainCanvas.k;
                            }
                            break;
                        }

                        return;
                    case 8272:
                        if (MainCanvas.uiSceneController != null) {
                            MainCanvas.uiSceneController.N();
                        }

                        return;
                    case 8273:
                        MainCanvas.uiSceneController.J = this.b.readUTF();
                        LoadingPage.h = 0;
                        if (!MainCanvas.uiSceneController.c && MainCanvas.uiSceneController.currentSceneModeId != 0 && MainCanvas.uiSceneController.currentSceneModeId != 25) {
                            this.mainCanvas.touchPageCase = this.mainCanvas.k = 7;
                            MainCanvas.uiSceneController.N();
                        }

                        return;
                    case 8274:
                        int var41 = this.b.readInt();
                        int var53 = this.b.readInt();
                        if (MainCanvas.uiSceneController.currentSceneModeId != 0 && MainCanvas.uiSceneController.currentSceneModeId != 25 && GlobalStatus.H == null) {
                            this.mainCanvas.touchPageCase = this.mainCanvas.k = 7;
                            MainCanvas.uiSceneController.N();
                        }

                        this.mainCanvas.b(var41 + 8, var53 + 16);
                        return;
                    case 8275:
                        byte var40 = this.b.readByte();
                        GlobalStatus.F = null;
                        GlobalStatus.G = null;
                        if (var40 == 1) {
                            GlobalStatus.F = this.b.readUTF();
                            GlobalStatus.G = this.b.readUTF();
                        }

                        this.mainCanvas.touchPageCase = this.mainCanvas.k = 7;
                        return;
                    case 8277:
                        if (MainCanvas.uiSceneController != null && MainCanvas.uiSceneController.P != null) {
                            MainCanvas.uiSceneController.P.a(this.b);
                            MainCanvas.uiSceneController.P.a(false);
                        }

                        return;
                    case 8278:
                        GlobalStatus.Z(this.b);
                        MainCanvas.uiSceneController.M.n();
                        return;
                    case 8280:
                        GlobalStatus.p(this.b);
                        if (MainCanvas.uiSceneController.currentSceneModeId != 7) {
                            MainCanvas.uiSceneController.p((int) 1);
                        }

                        return;
                    case 8286:
                        GlobalStatus.l = this.b.readByte();
                        if ((GlobalStatus.k = this.b.readUTF()) != null) {
                            MainCanvas.uiSceneController.ab();
                        }

                        return;
                    case 8288:
                        MainCanvas.aH = this.b.readUTF();
                        MainCanvas.aI = this.b.readUTF();
                        this.mainCanvas.q();
                        return;
                    case 8290:
                        GlobalStatus.zhangHao = this.b.readUTF();
                        GlobalStatus.d = this.b.readUTF();
                        if (GlobalConfig.channel == 1) {
                            this.b.readUTF();
                            GlobalStatus.m = this.b.readUTF();
                        }

                        return;
                    case 8291:
                        byte var39 = this.b.readByte();
                        GlobalStatus.aa(this.b);
                        if (MainCanvas.uiSceneController.currentSceneModeId != 115) {
                            return;
                        }

                        MainCanvas.uiSceneController.M.p();
                        if (var39 == 3 || var39 == 4) {
                            this.mainCanvas.textPanel.setShuRuMoShi((byte) 1);
                        }

                        if (var39 == 5) {
                            this.mainCanvas.i();
                        }

                        return;
                    case 8293:
                        if (MainCanvas.uiSceneController != null && MainCanvas.uiSceneController.Q != null) {
                            MainCanvas.uiSceneController.Q.a(this.b);
                            MainCanvas.uiSceneController.Q.a(false);
                        }

                        return;
                    case 8294:
                        if (MainCanvas.uiSceneController != null) {
                            if (GlobalConfig.channel == 0) {
                                if (GlobalStatus.jy != 1) {
                                    this.mainCanvas.processException("充值卡充值暂时关闭");
                                }
                            } else if (GlobalStatus.jy == 1) {
                                c_3.g();
                            } else {
                                this.mainCanvas.processException("充值功能暂时关闭");
                            }
                            break;
                        }

                        return;
                    case 8295:
                        GlobalConfig.printStr("exec宠物升星");
                        GlobalStatus.aS(this.b);
                        if (MainCanvas.uiSceneController != null) {
                            MainCanvas.uiSceneController.e(false);
                        }

                        return;
                    case 8296:
                        GlobalConfig.printStr("exec抽奖");
                        GlobalStatus.aW(this.b);
                        MainCanvas.uiSceneController.am();
                        return;
                    case 8297:
                        GlobalConfig.printStr("exec抽奖结果");
                        GlobalStatus.aX(this.b);
                        if (MainCanvas.uiSceneController.currentSceneModeId == 127) {
                            MainCanvas.uiSceneController.am();
                            this.mainCanvas.processException("恭喜您，抽中了" + GlobalStatus.nj + "×" + GlobalStatus.nk);
                        }

                        return;
                    case 8298:
                        GlobalConfig.printStr("exec宠物升星结果");
                        GlobalStatus.bc(this.b);
                        if (GlobalStatus.nB == 1) {
                            this.mainCanvas.processException("升星成功");
                        } else {
                            this.mainCanvas.processException("升星失败");
                        }

                        return;
                    case 8300:
                        if (MainCanvas.uiSceneController != null) {
                            MainCanvas.uiSceneController.O.b(this.b);
                            MainCanvas.uiSceneController.O.a(false);
                        }

                        return;
                    case 8301:
                        if (MainCanvas.uiSceneController != null) {
                            MainCanvas.uiSceneController.V.a(this.b);
                            MainCanvas.uiSceneController.V.a(false);
                        }

                        return;
                    case 8302:
                        if (MainCanvas.uiSceneController.N == null) {
                            MainCanvas.uiSceneController.N = new cc(MainCanvas.uiSceneController, this.mainCanvas);
                        }

                        MainCanvas.uiSceneController.N.a(this.b);
                        MainCanvas.uiSceneController.N.a((short) 0);
                        return;
                    case 8303:
                        GlobalConfig.printStr("宠物继承");
                        cg_1.a(cg_1.b);
                        cg_1.a(this.b);
                        MainCanvas.uiSceneController.W.b();
                        return;
                    case 8304:
                        if (this.b.readInt() == 1) {
                            if (MainCanvas.uiSceneController.N == null) {
                                MainCanvas.uiSceneController.N = new cc(MainCanvas.uiSceneController, this.mainCanvas);
                            }

                            MainCanvas.uiSceneController.N.b(this.b);
                            MainCanvas.uiSceneController.N.a((short) 2);
                        }

                        return;
                    case 8448:
                        if (this.b.readByte() == 1) {
                            this.mainCanvas.c();
                        }

                        return;
                    case 8449:
                        GlobalStatus.O(this.b);
                        MainCanvas.uiSceneController.i((byte) 0);
                        return;
                    case 8450:
                        GlobalStatus.P(this.b);
                        if (MainCanvas.uiSceneController.currentSceneModeId == 1) {
                            MainCanvas.uiSceneController.X();
                        } else {
                            MainCanvas.uiSceneController.k((byte) 1);
                        }

                        return;
                    case 8451:
                        GlobalStatus.O(this.b);
                        MainCanvas.uiSceneController.i((byte) 2);
                        return;
                    case 8452:
                        GlobalStatus.P(this.b);
                        MainCanvas.uiSceneController.k((byte) 3);
                        return;
                    case 8453:
                        GlobalStatus.S(this.b);
                        if (MainCanvas.uiSceneController != null) {
                            MainCanvas.uiSceneController.U();
                        }

                        return;
                    case 8454:
                        GlobalStatus.O(this.b);
                        if (MainCanvas.uiSceneController.as != 5 && MainCanvas.uiSceneController.aZ != 4 && MainCanvas.uiSceneController.as != 9 && MainCanvas.uiSceneController.as != 10) {
                            MainCanvas.uiSceneController.i((byte) 4);
                            return;
                        }

                        if (MainCanvas.uiSceneController.aZ == 4) {
                            MainCanvas.uiSceneController.aZ = -1;
                        }

                        MainCanvas.uiSceneController.j((byte) 6);
                        this.mainCanvas.touchPageCase = this.mainCanvas.k;
                        MainCanvas.uiSceneController.sceneStateShadow = MainCanvas.uiSceneController.currentSceneModeId = 38;
                        return;
                    case 8455:
                        GlobalStatus.P(this.b);
                        MainCanvas.uiSceneController.k((byte) 5);
                        return;
                    case 8456:
                        String var38 = this.b.readUTF();
                        if (MainCanvas.uiSceneController != null) {
                            MainCanvas.uiSceneController.d(var38);
                        }

                        return;
                    case 8704:
                        GlobalStatus.T(this.b);
                        if (GlobalStatus.ik != null && GlobalStatus.ik.length > 0) {
                            MainCanvas.uiSceneController.M.b();
                            return;
                        }

                        this.mainCanvas.processException("没有等待响应的帮派!");
                        return;
                    case 8705:
                        GlobalStatus.W(this.b);
                        MainCanvas.uiSceneController.M.h(0);
                        return;
                    case 8706:
                        GlobalStatus.X(this.b);
                        MainCanvas.uiSceneController.M.h(1);
                        return;
                    case 8708:
                        GlobalStatus.U(this.b);
                        if (GlobalStatus.ip != null) {
                            MainCanvas.uiSceneController.M.c();
                        } else {
                            this.mainCanvas.processException("没有帮派发布招募!");
                        }

                        return;
                    case 8709:
                        GlobalStatus.V(this.b);
                        if (GlobalStatus.it != null) {
                            MainCanvas.uiSceneController.M.f();
                        } else {
                            this.mainCanvas.processException("没有申请入帮玩家!");
                        }

                        return;
                    case 8710:
                        GlobalStatus.W(this.b);
                        if (GlobalStatus.iy != null) {
                            MainCanvas.uiSceneController.M.i();
                            return;
                        } else {
                            if (MainCanvas.uiSceneController.M.g == 1) {
                                MainCanvas.uiSceneController.M.a(true);
                            } else if (MainCanvas.uiSceneController.M.g == 0) {
                                MainCanvas.uiSceneController.k();
                                MainCanvas.uiSceneController.c((int) 4);
                            }
                            break;
                        }
                    case 8711:
                        GlobalStatus.ab(this.b);
                        MainCanvas.uiSceneController.M.j();
                        return;
                    case 8712:
                        GlobalStatus.ac(this.b);
                        MainCanvas.uiSceneController.M.k();
                        return;
                    case 8713:
                        GlobalStatus.ad(this.b);
                        MainCanvas.uiSceneController.M.l();
                        return;
                    case 8714:
                        GlobalStatus.ae(this.b);
                        if (GlobalStatus.jo != null) {
                            MainCanvas.uiSceneController.M.s();
                        } else {
                            this.mainCanvas.processException("没有可购买的设施!");
                        }

                        return;
                    case 8715:
                        GlobalStatus.ag(this.b);
                        if (MainCanvas.uiSceneController != null) {
                            MainCanvas.uiSceneController.U();
                        }

                        return;
                    case 8716:
                        GlobalStatus.af(this.b);
                        MainCanvas.uiSceneController.M.t();
                        return;
                    case 8717:
                        GlobalStatus.ah(this.b);
                        if (GlobalStatus.jz != null) {
                            MainCanvas.uiSceneController.W();
                        } else {
                            this.mainCanvas.processException("增值仓库没有物品!");
                        }

                        return;
                    case 8718:
                        GlobalStatus.ai(this.b);
                        MainCanvas.uiSceneController.a((byte) 3);
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
                        if (!UISceneController.i()) {
                            this.mainCanvas.processException("战斗中不能进行该操作");
                            return;
                        }

                        if (MainCanvas.uiSceneController == null) {
                            return;
                        }

                        MainCanvas.uiSceneController.c(false);
                        return;
                    case 8725:
                        GlobalStatus.ak(this.b);
                        MainCanvas.uiSceneController.l((byte) 0);
                        return;
                    case 8726:
                        GlobalStatus.H(this.b);
                        MainCanvas.uiSceneController.C();
                        return;
                    case 8727:
                        GlobalStatus.al(this.b);
                        MainCanvas.uiSceneController.l((byte) 2);
                        return;
                    case 8728:
                        GlobalStatus.an(this.b);
                        MainCanvas.uiSceneController.C();
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
                            MainCanvas.uiSceneController.O.a(MainCanvas.uiSceneController.O.a, (short) MainCanvas.uiSceneController.O.c, MainCanvas.uiSceneController.O.d);
                        } else {
                            MainCanvas.uiSceneController.O.a(0, (short) -1, -1);
                        }

                        return;
                    case 8733:
                        o_1.a(this.b);
                        MainCanvas.uiSceneController.O.c();
                        return;
                    case 8734:
                        GlobalStatus.Q(this.b);
                        if (MainCanvas.uiSceneController.as != 3 && MainCanvas.uiSceneController.as != 8 && MainCanvas.uiSceneController.as != 7 && MainCanvas.uiSceneController.as != 2) {
                            if (MainCanvas.uiSceneController.as == 4 || MainCanvas.uiSceneController.as == 5 || MainCanvas.uiSceneController.as == 6 || MainCanvas.uiSceneController.as == 10) {
                                MainCanvas.uiSceneController.i((byte) 9);
                            }

                            return;
                        }

                        MainCanvas.uiSceneController.i((byte) 7);
                        return;
                    case 8735:
                        GlobalStatus.R(this.b);
                        if (MainCanvas.uiSceneController.as != 7 && MainCanvas.uiSceneController.as != 2 && MainCanvas.uiSceneController.as != 3 && MainCanvas.uiSceneController.as != 8) {
                            if (MainCanvas.uiSceneController.as == 9 || MainCanvas.uiSceneController.as == 4 || MainCanvas.uiSceneController.as == 5 || MainCanvas.uiSceneController.as == 6) {
                                MainCanvas.uiSceneController.i((byte) 10);
                            }

                            return;
                        }

                        MainCanvas.uiSceneController.i((byte) 8);
                        return;
                    case 8736:
                        GlobalStatus.aP(this.b);
                        if (MainCanvas.uiSceneController != null && MainCanvas.uiSceneController.ad()) {
                            MainCanvas.uiSceneController.e((byte) 0);
                            GlobalStatus.lt[0] = -1;
                            return;
                        }

                        if (MainCanvas.uiSceneController != null && (GlobalStatus.lt[0] == 0 || GlobalStatus.lt[0] == 1 || GlobalStatus.lt[0] == 2)) {
                            MainCanvas.uiSceneController.e((byte) 0);
                            GlobalStatus.lt[0] = -1;
                        }

                        return;
                    case 8737:
                        if (MainCanvas.uiSceneController != null) {
                            byte[] var36;
                            if ((var36 = NetPayloadBuilder.a((short) 4255, (short[]) GlobalStatus.lt, (String) GlobalStatus.ad)) != null) {
                                NetPacket var37 = new NetPacket((short) 4255, var36);
                                MainCanvas.netUtils.sendPacket(var37);
                            } else {
                                this.mainCanvas.processException("获取上传指令数据错误!");
                            }
                            break;
                        }

                        return;
                    case 8738:
                        GlobalStatus.aO(this.b);
                        if (MainCanvas.uiSceneController != null && MainCanvas.uiSceneController.ad()) {
                            MainCanvas.uiSceneController.sceneSubState = 0;
                            MainCanvas.uiSceneController.c((byte) 0);
                            GlobalStatus.lt[1] = -1;
                            return;
                        }

                        if (MainCanvas.uiSceneController != null && GlobalStatus.lt[1] == 1) {
                            MainCanvas.uiSceneController.sceneSubState = 0;
                            MainCanvas.uiSceneController.c((byte) 0);
                            GlobalStatus.lt[1] = -1;
                            return;
                        }

                        if (MainCanvas.uiSceneController.mainCanvasRef.touchPageCase == 1) {
                            MainCanvas.uiSceneController.mainCanvasRef.touchPageCase = this.mainCanvas.k;
                        }

                        return;
                    case 8739:
                        GlobalStatus.aN(this.b);
                        c_3.a("游客注册 第2步: ", "创建一哥哥通行证密码");
                        this.mainCanvas.touchPageCase = 7;
                        return;
                    case 8960:
                        GlobalStatus.ao(this.b);
                        if (MainCanvas.uiSceneController.M.p == 0) {
                            MainCanvas.uiSceneController.M.u();
                        } else {
                            MainCanvas.uiSceneController.M.h(2);
                        }

                        return;
                    case 8961:
                        GlobalStatus.ap(this.b);
                        MainCanvas.uiSceneController.f((byte) 2);
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
                            this.mainCanvas.processException(GlobalStatus.kk);
                            this.mainCanvas.a(false);
                        }

                        return;
                    case 8965:
                        GlobalStatus.as(this.b);
                        MainCanvas.uiSceneController.M.h(3);
                        return;
                    case 8966:
                        GlobalStatus.ax(this.b);
                        MainCanvas.uiSceneController.M.w();
                        return;
                    case 8967:
                        GlobalStatus.ay(this.b);
                        MainCanvas.uiSceneController.M.x();
                        return;
                    case 8968:
                        GlobalStatus.aC(this.b);
                        GlobalStatus.O.a();
                        return;
                    case 8969:
                        GlobalStatus.aB(this.b);
                        if (MainCanvas.uiSceneController.currentSceneModeId == 76) {
                            int var34 = this.mainCanvas.topUi.a;
                            int var52 = this.mainCanvas.gunDongListUi.g();
                            MainCanvas.uiSceneController.d((byte) var34);
                            var34 = var34 == 0 ? GlobalStatus.O.f.length : GlobalStatus.P.b.length;
                            this.mainCanvas.gunDongListUi.a(Math.min(var52, var34));
                        }

                        return;
                    case 8970:
                        GlobalStatus.a(this.b.readByte(), this.b);
                        return;
                    case 8971:
                        if (MainCanvas.uiSceneController.currentSceneModeId != 111) {
                            GlobalStatus.au(this.b);
                            if (GlobalStatus.Q.b != null && GlobalStatus.Q.b.length() > 0) {
                                this.mainCanvas.av.b();
                                GlobalStatus.Q.a(this.mainCanvas.av);
                                GlobalStatus.Q.a();
                                GlobalStatus.Q.b();
                                MainCanvas.uiSceneController.sceneStateShadow = MainCanvas.uiSceneController.currentSceneModeId;
                                MainCanvas.uiSceneController.currentSceneModeId = 111;
                                this.mainCanvas.touchPageCase = this.mainCanvas.k;
                            }

                            return;
                        }

                        return;
                    case 8972:
                        GlobalStatus.aA(this.b);
                        if (MainCanvas.uiSceneController.currentSceneModeId == 76) {
                            byte var50 = this.mainCanvas.topUi.a;
                            int var32 = this.mainCanvas.gunDongListUi.g();
                            MainCanvas.uiSceneController.d((byte) var50);
                            this.mainCanvas.gunDongListUi.a(var32);
                        }

                        if (MainCanvas.uiSceneController.currentSceneModeId == 111) {
                            if (this.mainCanvas.touchPageCase == 1) {
                                this.mainCanvas.touchPageCase = 7;
                            }

                            if (MainCanvas.uiSceneController.sceneStateShadow == 76) {
                                byte var51 = this.mainCanvas.topUi.a;
                                int var33 = this.mainCanvas.gunDongListUi.g();
                                MainCanvas.uiSceneController.d((byte) var51);
                                this.mainCanvas.gunDongListUi.a(var33);
                                break;
                            }
                        }

                        return;
                    case 8973:
                        GlobalStatus.az(this.b);
                        GlobalStatus.P.c();
                        MainCanvas.uiSceneController.u();
                        return;
                    case 8974:
                        GlobalConfig.printStr("exec特效查看");
                        GlobalStatus.aT(this.b);
                        MainCanvas.uiSceneController.z();
                        return;
                    case 8975:
                        GlobalConfig.printStr("exec特效激活");
                        GlobalStatus.aU(this.b);
                        MainCanvas.uiSceneController.B();
                        return;
                    case 8976:
                        GlobalConfig.printStr("exec特效消除");
                        GlobalStatus.aV(this.b);
                        MainCanvas.uiSceneController.A();
                        return;
                    case 8977:
                        GlobalConfig.printStr("exec查看坐骑");
                        GlobalStatus.aY(this.b);
                        MainCanvas.uiSceneController.al();
                        MainCanvas.uiSceneController.sceneRefreshCoordinator.a(true);
                        return;
                    case 8978:
                        GlobalConfig.printStr("exec坐骑升星");
                        GlobalStatus.aZ(this.b);
                        MainCanvas.uiSceneController.al();
                        return;
                    case 8979:
                        GlobalConfig.printStr("exec更换坐骑");
                        GlobalStatus.ba(this.b);
                        MainCanvas.uiSceneController.al();
                        MainCanvas.uiSceneController.sceneRefreshCoordinator.a(true);
                        return;
                    case 8981:
                        GlobalConfig.printStr("exec特效技能");
                        GlobalStatus.bb(this.b);
                        MainCanvas.uiSceneController.an();
                        return;
                    case 8982:
                        GlobalConfig.printStr("exec宠物炼化需 求");
                        (GlobalStatus.nC = new String[3])[0] = this.b.readUTF();
                        GlobalStatus.nC[1] = this.b.readUTF();
                        GlobalStatus.nC[2] = this.b.readUTF();
                        MainCanvas.uiSceneController.sceneSubState = 11;
                        LoadingPage.h = 0;
                        this.mainCanvas.touchPageCase = this.mainCanvas.k;
                        return;
                    case 9216:
                        v_1.a(this.b);
                        if (v_1.a != null) {
                            MainCanvas.uiSceneController.S.a((int) 0);
                        } else {
                            this.mainCanvas.processException("暂无求爱信息!");
                        }

                        return;
                    case 9217:
                        v_1.b(this.b);
                        if (v_1.b != null) {
                            MainCanvas.uiSceneController.S.b();
                        } else {
                            this.mainCanvas.processException("求爱信息不存在!");
                        }

                        return;
                    case 9218:
                        v_1.c(this.b);
                        MainCanvas.uiSceneController.S.c();
                        return;
                    case 9219:
                        v_1.d(this.b);
                        MainCanvas.uiSceneController.S.d();
                        return;
                    case 9220:
                        v_1.e(this.b);
                        MainCanvas.uiSceneController.S.f();
                        return;
                    case 9221:
                        if (UISceneController.i()) {
                            this.mainCanvas.touchPageCase = this.mainCanvas.k = 7;
                            MainCanvas.uiSceneController.sceneStateShadow = MainCanvas.uiSceneController.currentSceneModeId = 0;
                        }

                        this.mainCanvas.processException(this.b.readUTF());
                        return;
                    case 9222:
                        GlobalStatus.aQ(this.b);
                        if (MainCanvas.uiSceneController != null) {
                            MainCanvas.uiSceneController.ac();
                        }

                        return;
                    case 9223:
                        byte var31 = this.b.readByte();
                        if (MainCanvas.uiSceneController != null) {
                            if (var31 == 1) {
                                MainCanvas.uiSceneController.af();
                            } else if (var31 == 2) {
                                MainCanvas.uiSceneController.ag();
                            }
                            break;
                        }

                        return;
                    case 9472:
                        GlobalStatus.M(this.b);
                        if (GlobalConfig.channel != 0 && !GlobalConfig.logined) {
                            if (GlobalStatus.hw) {
                                if (GlobalStatus.hw && GlobalStatus.hA.length <= 0) {
                                    this.mainCanvas.processException("服务维护中，暂无可以进入的服务器");
                                    return;
                                }

                                this.mainCanvas.k = this.mainCanvas.touchPageCase = 4;
                                this.mainCanvas.touchAction = 0;
                                this.mainCanvas.b = 0;
                                this.mainCanvas.a((int) 0);
                                this.mainCanvas.touchAction = 0;
                                return;
                            }

                            if (GlobalStatus.hA != null && GlobalStatus.hA.length > 0) {
                                this.mainCanvas.d();
                                return;
                            }

                            this.mainCanvas.processException("服务维护中，暂无可以进入的服务器");
                            return;
                        }

                        this.mainCanvas.d();
                        return;
                    case 9473:
                        GlobalStatus.lq = this.b.readByte();
                        GlobalStatus.lp = this.b.readShort();
                        GlobalStatus.kZ = this.b.readShort();
                        GlobalStatus.lf = this.b.readUTF();
                        GlobalStatus.lg = this.b.readByte();
                        if ((GlobalStatus.le = this.b.readShort()) > 0) {
                            GlobalStatus.aL(this.b);
                            MainCanvas.uiSceneController.d(GlobalStatus.kZ);
                        } else {
                            this.mainCanvas.processException("没有更多的成就!");
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
                            MainCanvas.uiSceneController.e(GlobalStatus.kZ);
                        } else {
                            this.mainCanvas.processException("没有更多的成就!");
                        }

                        return;
                    case 9488:
                        GlobalStatus.x(this.b);
                        MainCanvas.uiSceneController.ai();
                        return;
                    case 9489:
                        GlobalStatus.y(this.b);
                        MainCanvas.uiSceneController.aj();
                        return;
                    case 9491:
                        GlobalConfig.printStr("exec 随机名称");
                        this.mainCanvas.ay = this.b.readUTF();
                        if (this.mainCanvas.k == 6) {
                            this.mainCanvas.touchPageCase = this.mainCanvas.k;
                        }

                        return;
                    case 9494:
                        if (MainCanvas.uiSceneController != null) {
                            if (MainCanvas.uiSceneController.R == null) {
                                MainCanvas.uiSceneController.R = new bd(MainCanvas.uiSceneController, MainCanvas.uiSceneController.mainCanvasRef, MainCanvas.pngUtil);
                            }

                            MainCanvas.uiSceneController.R.a(this.b);
                            MainCanvas.uiSceneController.R.a();
                        }

                        return;
                    case 10496:
                        byte var30 = this.b.readByte();
                        this.b.readByte();
                        if (var30 == 4) {
                            String[] var3;
                            bb_1.j = (var3 = ZhangHaoUtils.a(this.b.readUTF(), ':'))[0].trim();
                            bb_1.i = var3[1].trim();
                            bb_1.m = bb_1.j;
                            bb_1.n = bb_1.i;
                            bb_1.b();
                            String var4 = this.b.readUTF();
                            this.mainCanvas.processException(var4);
                        } else if (var30 == 2) {
                            String[] var49;
                            bb_1.j = (var49 = ZhangHaoUtils.a(this.b.readUTF(), ':'))[0].trim();
                            bb_1.i = var49[1].trim();
                            bb_1.m = bb_1.j;
                            bb_1.n = bb_1.i;
                            bb_1.b();
                            String var58 = this.b.readUTF();
                            this.mainCanvas.processException(var58);
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
                ((Throwable) var28).printStackTrace();
                this.mainCanvas.a((Exception) var28, (byte) 5);
                return;
            } finally {
                if (var1 != null) {
                    this.d = var1.getCode();
                }

                try {
                    if (this.b != null) {
                        this.b.close();
                    }

                    if (this.bis != null) {
                        this.bis.close();
                    }
                } catch (IOException var27) {
                    ((Throwable) var27).printStackTrace();
                }

            }

        }
    }

    private void a() throws IOException {
        GlobalStatus.C = new byte[this.b.readByte()];

        for (byte var1 = 0; var1 < GlobalStatus.C.length; ++var1) {
            GlobalStatus.C[var1] = this.b.readByte();
        }

    }

    private void a(DataInputStream var1) {
        try {
            if (MainCanvas.uiSceneController != null && MainCanvas.uiSceneController.currentSceneModeId != 25 && MainCanvas.uiSceneController.currentSceneModeId != 18) {
                byte var2;
                if ((var2 = var1.readByte()) > UISceneController.aW[0] && GlobalStatus.bw == 0) {
                    var2 = UISceneController.aW[0];
                }

                bl[] var3 = new bl[var2];

                for (int var4 = 0; var4 < var2; ++var4) {
                    var3[var4] = new bl();
                    var3[var4].a(var1);
                }

                if (GlobalStatus.o != null) {
                    MainCanvas var5 = this.mainCanvas;
                    NetworkPacketProcessors var14 = this;
                    this.i.removeAllElements();
                    bl[] var21 = var3;
                    NetworkPacketProcessors var16 = this;
                    if (this.j == null) {
                        this.j = new bl[3];
                    }

                    if (var3 != null && MainCanvas.uiSceneController != null && MainCanvas.uiSceneController.sceneRefreshCoordinator != null) {
                        for (int var6 = 0; var6 < var16.j.length; ++var6) {
                            var16.j[var6] = null;
                        }

                        boolean var23 = false;
                        if (var3.length <= 3) {
                            var23 = true;
                        }

                        byte var7 = (byte) (MainCanvas.uiSceneController.sceneRefreshCoordinator.k / 16);
                        byte var8 = (byte) (MainCanvas.uiSceneController.sceneRefreshCoordinator.j / 16);
                        byte var9 = 0;
                        byte var10 = 0;
                        byte var11 = 0;

                        for (int var12 = 0; var12 < var21.length; ++var12) {
                            if (var21[var12] != null) {
                                boolean var35;
                                label234:
                                {
                                    bl var31;
                                    if ((var31 = var21[var12]) != null) {
                                        for (int var33 = 0; var33 < GlobalStatus.o.length; ++var33) {
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
                                    var9 = (byte) (var21[var12].k / 16);
                                    if (((var10 = (byte) (var21[var12].j / 16)) >= var8 - 4 && var10 <= var8 + 4 && var9 >= var7 - 4 && var9 <= var7 + 4 || var23) && (Math.abs(var21[var12].l - var21[var12].j) >= 32 || Math.abs(var21[var12].m - var21[var12].k) >= 32 || var23) && var11 < var16.j.length) {
                                        var16.j[var11] = var21[var12];
                                        ++var11;
                                    }
                                }
                            }
                        }
                    }

                    if (this.j != null) {
                        for (int var17 = 0; var17 < var14.j.length; ++var17) {
                            if (var14.j[var17] != null) {
                                var14.e = var14.j[var17].j / 16 + (var14.j[var17].j % 16 == 0 ? 0 : 1);
                                var14.f = var14.j[var17].k / 16 + (var14.j[var17].k % 16 == 0 ? 0 : 1);
                                var14.g = var14.j[var17].l / 16 + (var14.j[var17].l % 16 == 0 ? 0 : 1);
                                var14.h = var14.j[var17].m / 16 + (var14.j[var17].m % 16 == 0 ? 0 : 1);
                                if (var14.e != var14.g || var14.f != var14.h) {
                                    var14.i = var14.a(MainCanvas.uiSceneController.f, var14.i, new bs(var14.e, var14.f), new bs(var14.g, var14.h));
                                    if (var14.i != null) {
                                        var14.j[var17].f.removeAllElements();
                                        int var29 = var14.i.size();

                                        for (int var30 = 0; var30 < var29; ++var30) {
                                            bs var22 = (bs) var14.i.elementAt(var30);
                                            bs var24;
                                            if (var30 < var29 - 1) {
                                                var24 = (bs) var14.i.elementAt(var30 + 1);
                                            } else {
                                                var24 = var22;
                                            }

                                            if (var22.a != var24.a) {
                                                if (var22.a > var24.a) {
                                                    for (int var28 = 0; var28 < 4; ++var28) {
                                                        var14.j[var17].f.addElement(new short[]{(short) ((var22.a << 4) - (var28 << 2)), (short) (var22.b << 4)});
                                                    }
                                                } else {
                                                    for (int var27 = 0; var27 < 4; ++var27) {
                                                        var14.j[var17].f.addElement(new short[]{(short) ((var22.a << 4) + (var27 << 2)), (short) (var22.b << 4)});
                                                    }
                                                }
                                            } else if (var22.b != var24.b) {
                                                if (var22.b > var24.b) {
                                                    for (int var26 = 0; var26 < 4; ++var26) {
                                                        var14.j[var17].f.addElement(new short[]{(short) (var22.a << 4), (short) ((var22.b << 4) - (var26 << 2))});
                                                    }
                                                } else {
                                                    for (int var25 = 0; var25 < 4; ++var25) {
                                                        var14.j[var17].f.addElement(new short[]{(short) (var22.a << 4), (short) ((var22.b << 4) + (var25 << 2))});
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
                    for (int var18 = 0; var18 < var3.length; ++var18) {
                        var3[var18].j = var3[var18].l;
                        var3[var18].k = var3[var18].m;
                    }
                }

                if (var2 > 0) {
                    if (GlobalStatus.bw >= 1) {
                        for (int var19 = 0; var19 < var3.length; ++var19) {
                            bl var15;
                            (var15 = var3[var19]).u = var1.readByte();
                            var15.v = var1.readByte();
                        }
                    } else {
                        for (int var20 = 0; var20 < var3.length; ++var20) {
                            var3[var20].u = 0;
                        }
                    }
                }

                UISceneController.a(var3);
            }
        } catch (Exception var13) {
            if (MainCanvas.uiSceneController != null) {
                MainCanvas.uiSceneController.c("系统异常[8]");
            }

        }
    }

    private void b() throws IOException {
        GlobalStatus.c(this.b);
        if (MainCanvas.uiSceneController != null && MainCanvas.uiSceneController.sceneRefreshCoordinator != null) {
            if (GlobalConfig.o && this.mainCanvas.touchController != null) {
                if (!MainCanvas.uiSceneController.sceneRefreshCoordinator.c.isEmpty()) {
                    MainCanvas.uiSceneController.sceneRefreshCoordinator.c.removeAllElements();
                    MainCanvas.uiSceneController.sceneRefreshCoordinator.b();
                }

                if (this.mainCanvas.touchController != null) {
                    this.mainCanvas.touchController.c = 0;
                    this.mainCanvas.touchController.d = 0;
                }

                this.mainCanvas.b = 0;
                this.mainCanvas.touchAction = 0;
            }

            MainCanvas.uiSceneController.sceneRefreshCoordinator.j = GlobalStatus.at;
            MainCanvas.uiSceneController.sceneRefreshCoordinator.k = GlobalStatus.au;
        }

        if (GlobalStatus.bs == 0 && GlobalStatus.q != null && GlobalStatus.s == 0) {
            for (int var1 = 0; var1 < GlobalStatus.q.length; ++var1) {
                GlobalStatus.q[var1].f.removeAllElements();
                if (GlobalStatus.q[var1].j == -1 && GlobalStatus.q[var1].k == -1) {
                    GlobalStatus.q[var1].j = GlobalStatus.at;
                    GlobalStatus.q[var1].k = GlobalStatus.au;
                }

                GlobalStatus.q[var1].l = GlobalStatus.at;
                GlobalStatus.q[var1].m = GlobalStatus.au;
            }
        }

        if (MainCanvas.uiSceneController == null) {
            this.mainCanvas.g();
            MainCanvas.uiSceneController.sceneRefreshCoordinator.d();
        } else {
            if (MainCanvas.uiSceneController != null) {
                MainCanvas.uiSceneController.sceneRefreshCoordinator.a((int) GlobalStatus.av);
            }

            if (MainCanvas.uiSceneController.Y == GlobalStatus.ar && !MainCanvas.uiSceneController.sceneRefreshCoordinator.h()) {
                if (GlobalStatus.bs == 0 && GlobalStatus.q != null && GlobalStatus.s == 0) {
                    MainCanvas var6 = this.mainCanvas;
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
                        int var3 = (var10 = this.a(MainCanvas.uiSceneController.f, var9, new bs(this.e, this.f), new bs(this.g, this.h))).size();

                        for (int var4 = 0; var4 < GlobalStatus.q.length; ++var4) {
                            GlobalStatus.q[var4].f.removeAllElements();

                            for (int var5 = 0; var5 < var3; ++var5) {
                                bs var8 = (bs) var10.elementAt(var5);
                                bs var2;
                                if (var5 < var3 - 1) {
                                    var2 = (bs) var10.elementAt(var5 + 1);
                                } else {
                                    var2 = var8;
                                }

                                if (var8.a != var2.a) {
                                    if (var8.a > var2.a) {
                                        for (int var14 = 0; var14 < 4; ++var14) {
                                            GlobalStatus.q[var4].f.addElement(new short[]{(short) ((var8.a << 4) - (var14 << 2)), (short) (var8.b << 4)});
                                        }
                                    } else {
                                        for (int var13 = 0; var13 < 4; ++var13) {
                                            GlobalStatus.q[var4].f.addElement(new short[]{(short) ((var8.a << 4) + (var13 << 2)), (short) (var8.b << 4)});
                                        }
                                    }
                                } else if (var8.b != var2.b) {
                                    if (var8.b > var2.b) {
                                        for (int var12 = 0; var12 < 4; ++var12) {
                                            GlobalStatus.q[var4].f.addElement(new short[]{(short) (var8.a << 4), (short) ((var8.b << 4) - (var12 << 2))});
                                        }
                                    } else {
                                        for (int var11 = 0; var11 < 4; ++var11) {
                                            GlobalStatus.q[var4].f.addElement(new short[]{(short) (var8.a << 4), (short) ((var8.b << 4) + (var11 << 2))});
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

            } else {
                if (GlobalStatus.bs == -1) {
                    MainCanvas.uiSceneController.aY = 0L;
                }

                if (MainCanvas.uiSceneController.sceneRefreshCoordinator.d != null) {
                    MainCanvas.uiSceneController.sceneRefreshCoordinator.d.e.removeAllElements();
                    MainCanvas.uiSceneController.sceneRefreshCoordinator.d.h = GlobalStatus.at;
                    MainCanvas.uiSceneController.sceneRefreshCoordinator.d.i = GlobalStatus.au;
                    MainCanvas.uiSceneController.sceneRefreshCoordinator.d.j = MainCanvas.uiSceneController.sceneRefreshCoordinator.h;
                    MainCanvas.uiSceneController.sceneRefreshCoordinator.d.a(MainCanvas.uiSceneController.sceneRefreshCoordinator.h);
                }

                if (UISceneController.i()) {
                    if (MainCanvas.uiSceneController.Y != GlobalStatus.ar) {
                        MainCanvas.uiSceneController.e();
                    } else {
                        MainCanvas.uiSceneController.f();
                    }

                    MainCanvas.uiSceneController.sceneRefreshCoordinator.i();
                    MainCanvas.uiSceneController.Y = GlobalStatus.ar;
                }

                MainCanvas.uiSceneController.sceneRefreshCoordinator.d();
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
            MainCanvas.uiSceneController.currentSceneModeId = 2;
        }

        if (MainCanvas.uiSceneController.currentSceneModeId == 2) {
            UISceneController.K = new FWBRender(GlobalStatus.bH, (short) (GlobalConfig.defaultWidth - 20));
            if (GlobalStatus.bE) {
                MainCanvas.uiSceneController.an = new String[]{"接受", "返回"};
            } else if (GlobalStatus.bK[MainCanvas.uiSceneController.ai] == -1) {
                MainCanvas.uiSceneController.an = new String[]{"接受", "返回"};
            } else if (GlobalStatus.bK[MainCanvas.uiSceneController.ai] == 0) {
                MainCanvas.uiSceneController.an = new String[]{"确定", "返回"};
            } else if (GlobalStatus.bK[MainCanvas.uiSceneController.ai] == 1) {
                MainCanvas.uiSceneController.an = new String[]{"提交", "返回"};
            }

            LoadingPage.a(MainCanvas.F, UISceneController.K, MainCanvas.uiSceneController.an, (String[]) null, true);
            this.mainCanvas.touchPageCase = this.mainCanvas.k;
            MainCanvas.uiSceneController.sceneSubState = 1;
        } else {
            if (MainCanvas.uiSceneController.currentSceneModeId == 6) {
                this.mainCanvas.processException("不处理");
            }

        }
    }

    private void d() throws IOException {
        GlobalStatus.I(this.b);
        if (MainCanvas.uiSceneController != null) {
            if (!UISceneController.i()) {
                return;
            }

            if (MainCanvas.uiSceneController.currentSceneModeId == 13) {
                if (GlobalStatus.fA == null) {
                    GlobalStatus.B();
                    this.mainCanvas.processException("您没有宠物！");
                    return;
                }

                if (MainCanvas.uiSceneController.sceneSubState == 6) {
                    MainCanvas.uiSceneController.k(MainCanvas.uiSceneController.aE);
                    return;
                }

                if (MainCanvas.uiSceneController.sceneSubState == 8) {
                    if (this.mainCanvas.touchPageCase != 2) {
                        this.mainCanvas.touchPageCase = this.mainCanvas.k;
                        return;
                    }
                } else if (o_1.e == 1) {
                    if (this.mainCanvas.touchPageCase != 2) {
                        this.mainCanvas.touchPageCase = this.mainCanvas.k;
                        return;
                    }
                } else {
                    MainCanvas.uiSceneController.j(MainCanvas.uiSceneController.as);
                    if (this.mainCanvas.touchPageCase != 2) {
                        this.mainCanvas.touchPageCase = this.mainCanvas.k;
                        return;
                    }
                }
            } else {
                if (MainCanvas.uiSceneController.currentSceneModeId == 36) {
                    MainCanvas.uiSceneController.b(false);
                    return;
                }

                if (MainCanvas.uiSceneController.currentSceneModeId == 96 && MainCanvas.uiSceneController.ap) {
                    MainCanvas.uiSceneController.k(MainCanvas.uiSceneController.aE);
                    MainCanvas.uiSceneController.ap = false;
                    return;
                }

                if (MainCanvas.uiSceneController.currentSceneModeId == 4 && MainCanvas.uiSceneController.bh) {
                    MainCanvas.uiSceneController.s(MainCanvas.uiSceneController.bg);
                    return;
                }

                if (MainCanvas.uiSceneController.currentSceneModeId == 120) {
                    MainCanvas.uiSceneController.t(this.mainCanvas.gunDongListUi.g());
                }
            }
        }

    }

    private static void b(DataInputStream var0) throws IOException {
        long var1 = var0.readLong();
        GlobalConfig.printStr("[FIGHT] 8206包 b(): 服务器fightId=" + var1 + " 本地v=" + GlobalStatus.v + " bq_1.g=" + bq_1.g);
        if (bq_1.g > 0 && GlobalStatus.v <= 0L) {
            GlobalStatus.v = var1;
            bq_1.g = -1;
        }

        short var8;
        if ((var8 = var0.readShort()) > 0) {
            boolean var2 = false;
            short var3 = 0;

            for (int var9 = 0; var9 < var8; ++var9) {
                if ((var3 = var0.readShort()) > 0) {
                    i[] var4 = new i[var3];

                    for (int var5 = 0; var5 < var3; ++var5) {
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

                    MainCanvas.uiSceneController.overlayDialogController.a(var4);
                }
            }

            Object var15 = null;

            for (int var10 = 0; var10 < var8; ++var10) {
                if ((var3 = var0.readShort()) > 0) {
                    ae[] var16 = new ae[var3];

                    for (int var14 = 0; var14 < var3; ++var14) {
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

                    MainCanvas.uiSceneController.overlayDialogController.a(var16);
                }
            }

            for (int var11 = 0; var11 < var8; ++var11) {
                MainCanvas.uiSceneController.overlayDialogController.a(var0.readUTF());
            }

            if (MainCanvas.uiSceneController.currentSceneModeId == 25 || MainCanvas.uiSceneController.currentSceneModeId == 18 || !UISceneController.i()) {
                MainCanvas.uiSceneController.overlayDialogController.f = 1;
            }
        }

    }

    private void e() throws IOException {
        byte var1;
        if ((var1 = this.b.readByte()) <= 0) {
            if (MainCanvas.uiSceneController != null) {
                MainCanvas.uiSceneController.a((bp_1[]) null);
            }

        } else {
            GlobalStatus.s = (short) this.b.readByte();
            bp_1[] var2 = new bp_1[var1];
            byte var3 = 1;

            for (int var4 = 0; var4 < var1; ++var4) {
                var2[var4] = new bp_1();
                var2[var4].a(MainCanvas.uiSceneController, this.b);
                if (var2[var4].s == 1) {
                    var2[var4].a = 0;
                } else {
                    var2[var4].a = var3++;
                }
            }

            bp_1[] var6 = var2;

            for (int var7 = 0; var7 < var6.length - 1; ++var7) {
                for (int var8 = 0; var8 < var6.length - 1; ++var8) {
                    bp_1 var9 = var6[var8];
                    bp_1 var5;
                    if ((var5 = var6[var8 + 1]).a < var9.a) {
                        var6[var8] = var5;
                        var6[var8 + 1] = var9;
                    }
                }
            }

            if (MainCanvas.uiSceneController != null) {
                MainCanvas.uiSceneController.a(var2);
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
        MainCanvas.uiSceneController.am = null;
        MainCanvas.uiSceneController.al = null;
        if (UISceneController.i()) {
            MainCanvas.pngUtil.a(MainCanvas.uiSceneController.f, UISceneController.h, UISceneController.i, true, false, 2109231);
            this.mainCanvas.touchPageCase = this.mainCanvas.k = 7;
            MainCanvas.uiSceneController.sceneStateShadow = MainCanvas.uiSceneController.currentSceneModeId = 0;
        }

        if (var1 == 1) {
            this.mainCanvas.processException("交易成功!");
        } else if (var1 == 0) {
            this.mainCanvas.processException("交易取消!");
        } else {
            if (var1 == -1) {
                this.mainCanvas.processException(this.b.readUTF());
            }

        }
    }

    private static void c(DataInputStream var0) throws IOException {
        GlobalStatus.am(var0);
        MainCanvas.uiSceneController.l((byte) 1);
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

            while (!var2.isEmpty()) {
                bs var6;
                if ((var6 = a(var2, var4)).b(var4)) {
                    var5 = true;
                }

                if (var5) {
                    var10.removeAllElements();
                    var10.addElement(var4);
                    var6 = a(var2, var4);

                    while (!var6.b(var3)) {
                        var6 = var6.c;
                        var10.addElement(var6);
                    }

                    return var10;
                }

                var2.removeElement(var6);
                var10.addElement(var6);
                bs[] var7 = new bs[]{new bs(var6.a, var6.b - 1), new bs(var6.a, var6.b + 1), new bs(var6.a - 1, var6.b), new bs(var6.a + 1, var6.b)};

                for (int var8 = 0; var8 < var7.length; ++var8) {
                    if ((var7[var8].a != var6.a || var7[var8].b != var6.b) && var7[var8].a >= 0 && var7[var8].a < var1.a / 16 + (var1.a % 16 == 0 ? 0 : 1) + 1 && var7[var8].b >= 0 && var7[var8].b < var1.b / 16 + (var1.b % 16 == 0 ? 0 : 1) + 1 && !a(var2, var7[var8].a, var7[var8].b) && !b(var10, var7[var8].a, var7[var8].b) && MainCanvas.pngUtil.a(var1, (var7[var8].a << 4) + 8, var7[var8].b << 4) == 0 && !MainCanvas.pngUtil.a((var7[var8].a << 4) + 8, var7[var8].b << 4)) {
                        var2.addElement(new bs(var7[var8].a, var7[var8].b, var6));
                    }
                }
            }
        } catch (Exception var9) {
        }

        return new Vector();
    }

    private static boolean a(Vector var0, int var1, int var2) {
        for (int var3 = 0; var3 < var0.size(); ++var3) {
            if (var1 == ((bs) var0.elementAt(var3)).a && var2 == ((bs) var0.elementAt(var3)).b) {
                return true;
            }
        }

        return false;
    }

    private static boolean b(Vector var0, int var1, int var2) {
        for (int var3 = 0; var3 < var0.size(); ++var3) {
            if (var1 == ((bs) var0.elementAt(var3)).a && var2 == ((bs) var0.elementAt(var3)).b) {
                return true;
            }
        }

        return false;
    }

    private static bs a(Vector var0, bs var1) {
        bs var2 = null;

        for (int var3 = 0; var3 < var0.size(); ++var3) {
            bs var4 = (bs) var0.elementAt(var3);
            if (var2 == null || var2.a(var1) > var4.a(var1)) {
                var2 = var4;
            }
        }

        return var2;
    }
}

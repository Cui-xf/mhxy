package com.cc;

import com.yinhan.kjava.main.MainCanvas;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Vector;

/**
 * 服务器数据包处理器，负责解析所有服务器下发的数据包并驱动对应的游戏逻辑。
 */
public final class NetworkPacketProcessors {
    private MainCanvas mainCanvas;
    /**
     * 当前数据包的字节流输入，用于逐字段读取包体
     */
    private DataInputStream dis;
    /**
     * 当前数据包 payload 的字节数组源
     */
    private ByteArrayInputStream bis;
    private int e;
    private int f;
    private int g;
    private int h;
    private Vector i_1 = new Vector();
    /**
     * 场景中最多3个移动实体（NPC/角色），用于路径计算
     */
    private bl[] j;

    public void setMainCanvas(MainCanvas var1) {
        this.mainCanvas = var1;
    }

    /**
     * 分发处理服务器下发的数据包。
     * 若为多包容器(8192)则递归处理其子包；否则根据包码路由到对应逻辑。
     */
    public void process(NetPacket code) {
        if (code != null) {
            try {
                short packetCode = code.getCode();
                // 非多包容器时，将 payload 包装成流供后续 dis.readXxx() 使用
                if (packetCode != NetPacketCode.MultiPackContainer) {
                    if (code.payload == null) {
                        return;
                    }

                    this.bis = new ByteArrayInputStream(code.payload);
                    this.dis = new DataInputStream(this.bis);
                }

                switch (packetCode) {
                    case NetPacketCode.MultiPackContainer: {// 8192 多包容器：递归处理所有子包
                        if (code.child == null) {
                            return;
                        }
                        while (!code.child.isEmpty()) {
                            this.process((NetPacket) code.child.elementAt(0));
                            code.child.removeElementAt(0);
                        }
                        return;
                    }
                    case NetPacketCode.LoginFail: {// 8193 登录/操作失败：解析异常码和异常消息，按异常类型显示对应提示
                        GlobalStatus.parseLoginFail(this.dis);
                        if (GlobalStatus.exceptionCode == 53) {
                            if (MainCanvas.gameSceneController.overlayDialogController != null) {
                                MainCanvas.gameSceneController.overlayDialogController.d();
                                MainCanvas.gameSceneController.sceneStateShadow = MainCanvas.gameSceneController.currentSceneModeId = 0;
                                this.mainCanvas.showTips(GlobalConfig.YiChangTiShi[GlobalStatus.exceptionCode]);
                            }
                            return;
                        }

                        if (GlobalStatus.exceptionCode == 48) {
                            if (MainCanvas.gameSceneController.overlayDialogController != null) {
                                MainCanvas.gameSceneController.overlayDialogController.f = -2;
                            } else {
                                this.mainCanvas.showTips(GlobalConfig.YiChangTiShi[GlobalStatus.exceptionCode]);
                            }

                            return;
                        }

                        if (GlobalStatus.exceptionCode != -2) {
                            if (MainCanvas.gameSceneController == null || MainCanvas.gameSceneController.overlayDialogController == null || MainCanvas.gameSceneController.overlayDialogController.f != -1 || GlobalStatus.exceptionMsg == null || !GlobalStatus.exceptionMsg.startsWith("等待他人操作")) {
                                if (GlobalStatus.exceptionMsg != null) {
                                    this.mainCanvas.showTips(GlobalStatus.exceptionMsg);
                                } else {
                                    this.mainCanvas.showTips(GlobalConfig.YiChangTiShi[GlobalStatus.exceptionCode < 0 ? 0 : GlobalStatus.exceptionCode]);
                                }
                                break;
                            }

                            return;
                        }

                        if (MainCanvas.gameSceneController.currentSceneModeId == 111 && MainCanvas.gameSceneController.sceneStateShadow == 0) {
                            MainCanvas.gameSceneController.currentSceneModeId = MainCanvas.gameSceneController.sceneStateShadow;
                        }

                        return;
                    }
                    case NetPacketCode.LoginSuccess: {// 8194 登录成功：读取账号(zhangHao)和会话令牌(token)
                        GlobalStatus.zhangHao = this.dis.readUTF();
                        GlobalStatus.token = this.dis.readUTF();
                        return;
                    }
                    case NetPacketCode.RoleList: {// 8195 角色列表：解析所有角色信息并跳转角色选择页
                        GlobalStatus.parseRoleList(this.dis);
                        this.mainCanvas.startRoleListPage(GlobalStatus.roleIdList == null ? 0 : GlobalStatus.roleIdList.length);
                        return;
                    }
                    case NetPacketCode.Inventory: {// 背包物品数据：解析背包物品列表(GlobalStatus.p[])，更新UI刷新标志
                        GlobalStatus.parseBackPack(this.dis);
                        if (MainCanvas.gameSceneController == null) {
                            return;
                        }

                        MainCanvas.gameSceneController.aX = false;
                        if (MainCanvas.gameSceneController.currentSceneModeId == 2 && MainCanvas.gameSceneController.sceneSubState == 4) {
                            String var48 = GlobalConfig.yinLiangFormat(this.mainCanvas.shareSb, GlobalStatus.aq);
                            GlobalConfig.yinLiangFormat(this.mainCanvas.shareSb, GlobalStatus.ap);
                            MainCanvas.gameSceneController.am = LoadingPage.parseText(GlobalStatus.npcObjects[MainCanvas.gameSceneController.af].b + ":已存入银两" + var48 + "，现有银两" + this.mainCanvas.shareSb.toString(), GlobalConfig.font2, GlobalConfig.defaultWidth == 176 ? 118 : 152, "\t");
                            MainCanvas.gameSceneController.ah = MainCanvas.gameSceneController.sceneSubMode == 1 ? GlobalStatus.aq : GlobalStatus.ap;
                        } else if (MainCanvas.gameSceneController.currentSceneModeId == 37 && MainCanvas.gameSceneController.ao) {
                            MainCanvas.gameSceneController.p();
                            MainCanvas.gameSceneController.ao = false;
                        }

                        MainCanvas.gameSceneController.sceneRefreshCoordinator.a();
                        return;
                    }
                    case NetPacketCode.MapObjects: {// 地图动态对象：读取 az_1[] 数组（场景可交互对象），加入 GlobalStatus.u 列表并刷新场景
                        byte num = this.dis.readByte();
                        if (num > 0) {
                            NpcObject[] npcObjects = new NpcObject[num];
                            for (int i = 0; i < num; ++i) {
                                npcObjects[i] = new NpcObject();
                                npcObjects[i].parseNpcObject(this.dis);
                            }
                            GlobalStatus.npcArrayList.addElement(npcObjects);
                        }
                        GameSceneController.markReflushMap();
                        if (MainCanvas.gameSceneController != null) {
                            MainCanvas.gameSceneController.updateNpcObject();
                        }
                        return;
                    }
                    case NetPacketCode.RoleMove: { // 角色移动/位置：更新角色坐标及移动路径（委托 b() 处理）
                        this.processRoleMove();
                        return;
                    }
                    case 8200: {// 装备数据：解析装备栏数据（GlobalStatus.b(dis)）
                        GlobalStatus.b(this.dis);
                        return;
                    }
                    case 8201: {// 装备槽数据：读取更新类型(byte)后解析装备槽(GlobalStatus.e(dis))，完成后刷新主界面
                        byte var56 = this.dis.readByte();
                        GlobalStatus.e(this.dis);
                        if (var56 == 1) {
                            this.mainCanvas.i();
                        } else if (var56 == 2 && MainCanvas.gameSceneController != null) {
                            MainCanvas.gameSceneController.e((int) 0);
                        }

                        if (MainCanvas.gameSceneController != null && MainCanvas.gameSceneController.sceneStateShadow == 4) {
                            MainCanvas.gameSceneController.s();
                            return;
                        }

                        if (MainCanvas.gameSceneController != null && MainCanvas.gameSceneController.currentSceneModeId == 9) {
                            MainCanvas.gameSceneController.s();
                        }

                        return;
                    }
                    case 8202: {// 宠物详细数据：解析当前宠物完整属性(GlobalStatus.l(dis))，scene=5时重置子状态
                        GlobalStatus.l(this.dis);
                        if (MainCanvas.gameSceneController != null && MainCanvas.gameSceneController.currentSceneModeId == 5) {
                            MainCanvas.gameSceneController.sceneSubState = 0;
                            this.mainCanvas.pageStatus = this.mainCanvas.lastPageStatus = 7;
                        }

                        return;
                    }
                    case 8203: {// 技能数据：跳过1字节后解析技能列表(GlobalStatus.n(dis))，scene=12时切换技能标签页
                        this.dis.readByte();
                        GlobalStatus.n(this.dis);
                        if (MainCanvas.gameSceneController.currentSceneModeId == 12) {
                            if (this.mainCanvas.topUi.a == 0) {
                                MainCanvas.gameSceneController.a((byte) 1, true);
                            } else if (this.mainCanvas.topUi.a == 1) {
                                MainCanvas.gameSceneController.a((byte) 0, true);
                            }
                            break;
                        }

                        return;
                    }
                    case 8204:
                        this.a(this.dis);
                        return;
                    case 8205:
                        GlobalStatus.A(this.dis);
                        return;
                    case 8206:
                        b(this.dis);
                        return;
                    case 8207:
                        if (GameSceneController.notInFighting()) {
                            GlobalStatus.g(this.dis);
                            MainCanvas.gameSceneController.sceneSubState = 0;
                            MainCanvas.gameSceneController.m();
                            return;
                        }

                        return;
                    case 8208:
                        byte var46 = this.dis.readByte();
                        GlobalStatus.b(this.dis, var46);
                        if (var46 == 1) {
                            MainCanvas.gameSceneController.M.y();
                        } else {
                            MainCanvas.gameSceneController.N();
                        }

                        return;
                    case 8209:
                        this.c();
                        if (MainCanvas.gameSceneController.currentSceneModeId == 0) {
                            MainCanvas.gameSceneController.sceneSubState = 0;
                            MainCanvas.gameSceneController.m();
                        }

                        return;
                    case 8210: // 外观/时装数据：解析角色装扮配置(GlobalStatus.t(dis))，scene=12/4时刷新外观UI
                        GlobalStatus.t(this.dis);
                        if (MainCanvas.gameSceneController != null) {
                            if (MainCanvas.gameSceneController.currentSceneModeId == 12 && MainCanvas.gameSceneController.sceneSubState >= 6) {
                                if (this.mainCanvas.pageStatus != 2) {
                                    this.mainCanvas.pageStatus = this.mainCanvas.lastPageStatus;
                                }

                                MainCanvas.gameSceneController.sceneSubState = 6;
                                MainCanvas.gameSceneController.a(GlobalStatus.en);
                                return;
                            }

                            if (MainCanvas.gameSceneController.currentSceneModeId == 4 && MainCanvas.gameSceneController.sceneSubState >= 8) {
                                if (this.mainCanvas.pageStatus != 2) {
                                    this.mainCanvas.pageStatus = this.mainCanvas.lastPageStatus;
                                }

                                MainCanvas.gameSceneController.a(GlobalStatus.en);
                                MainCanvas.gameSceneController.sceneSubState = 8;
                            }

                            return;
                        }

                        return;
                    case 8211:
                        GlobalStatus.D(this.dis);
                        MainCanvas.gameSceneController.a(GlobalStatus.fs);
                        MainCanvas.gameSceneController.a(GlobalStatus.fl);
                        if (this.mainCanvas.pageStatus == 1) {
                            this.mainCanvas.pageStatus = this.mainCanvas.lastPageStatus;
                        }

                        return;
                    case 8212:
                        GlobalStatus.E(this.dis);
                        if (this.mainCanvas.pageStatus == 1) {
                            this.mainCanvas.pageStatus = this.mainCanvas.lastPageStatus;
                        }

                        return;
                    case 8213:
                        GlobalStatus.q(this.dis);
                        if (MainCanvas.gameSceneController == null) {
                            return;
                        }

                        if (GameSceneController.notInFighting() && MainCanvas.gameSceneController.currentSceneModeId != 20) {
                            if (this.mainCanvas.pageStatus != 2) {
                                MainCanvas.gameSceneController.a(MainCanvas.gameSceneController.currentSceneModeId);
                            } else {
                                this.mainCanvas.az = true;
                            }

                            return;
                        }

                        this.mainCanvas.az = false;
                        MainCanvas.gameSceneController.b(GlobalStatus.dT[1], GlobalStatus.dX);
                        return;
                    case 8214:
                        byte var45;
                        if ((var45 = this.dis.readByte()) <= 0) {
                            return;
                        }

                        ce[] var55 = new ce[var45];

                        for (int var63 = 0; var63 < var45; ++var63) {
                            var55[var63] = new ce();
                            var55[var63].a(this.dis);
                        }

                        if (MainCanvas.gameSceneController != null) {
                            MainCanvas.gameSceneController.a(var55);
                        }

                        return;
                    case 8215:
                        GlobalStatus.B(this.dis);
                        if (GameSceneController.notInFighting()) {
                            MainCanvas.gameSceneController.v();
                            return;
                        }

                        this.mainCanvas.showTips("战斗中不能进行该操作");
                        return;
                    case 8216:
                        GlobalStatus.m(this.dis);
                        if (GlobalStatus.cG == null || GlobalStatus.cG.length <= 0) {
                            this.mainCanvas.showTips("该玩家没有武器装备!");
                            return;
                        }

                        if (GameSceneController.notInFighting()) {
                            MainCanvas.gameSceneController.w();
                            return;
                        }

                        this.mainCanvas.showTips("战斗中不能进行该操作");
                        return;
                    case 8217:
                        this.e();
                        if (MainCanvas.gameSceneController.currentSceneModeId == 100) {
                            MainCanvas.gameSceneController.N();
                        } else if (MainCanvas.gameSceneController.currentSceneModeId == 7) {
                            MainCanvas.gameSceneController.b((byte) MainCanvas.gameSceneController.aV);
                            break;
                        }

                        return;
                    case 8218:
                        long var6 = this.dis.readLong();
                        byte var44 = this.dis.readByte();
                        GlobalConfig.printStr("[FIGHT] 8218包: 服务器fightId=" + var6 + " 本地v=" + GlobalStatus.v + " bq_1.g=" + FightModel.g);
                        if (var6 == -1L) {
                            if (MainCanvas.gameSceneController.overlayDialogController != null) {
                                GlobalStatus.v = -1L;
                                GlobalStatus.x = -1;
                                MainCanvas.gameSceneController.overlayDialogController.l();
                            }
                        } else if (FightModel.g <= 0 && var6 != GlobalStatus.v) {
                            if (MainCanvas.gameSceneController.overlayDialogController != null) {
                                GlobalStatus.v = -1L;
                                GlobalStatus.x = -1;
                                MainCanvas.gameSceneController.overlayDialogController.l();
                            }
                        } else if (var44 == 0) {
                            MainCanvas.gameSceneController.overlayDialogController.f = 7;
                            GlobalStatus.v = -1L;
                            GlobalStatus.x = -1;
                        } else {
                            GlobalStatus.v = -1L;
                            GlobalStatus.x = -1;
                        }

                        GlobalStatus.a();
                        if (GlobalStatus.bu) {
                            MainCanvas.gameSceneController.X.b();
                        }

                        return;
                    case 8219:
                        byte var54 = this.dis.readByte();
                        this.dis.readLong();
                        GlobalStatus.C(this.dis);
                        if (GameSceneController.notInFighting()) {
                            if (var54 == 0) {
                                GlobalStatus.N();
                            } else if (var54 == 1) {
                                GlobalStatus.x();
                            }

                            MainCanvas.gameSceneController.b(var54, false);
                        } else {
                            MainCanvas.gameSceneController.g(var54);
                        }

                        return;
                    case 8220:
                        this.f();
                        return;
                    case 8221:
                        GlobalStatus.F(this.dis);
                        return;
                    case 8222: // 宠物列表：解析并显示角色所有宠物(委托 d() 处理)
                        GlobalConfig.printStr("exec宠物列表:");
                        this.d();
                        return;
                    case 8223: // 任务数据：解析进行中/可接取任务列表(GlobalStatus.h(dis))，场外显示任务UI
                        if (GameSceneController.notInFighting()) {
                            if (!GameSceneController.notInFighting()) {
                                return;
                            }

                            GlobalStatus.h(this.dis);
                            if (MainCanvas.gameSceneController.currentSceneModeId != 6) {
                                return;
                            }

                            if (GlobalStatus.bR == null && GlobalStatus.bL == null) {
                                this.mainCanvas.showTips("当前没有任务");
                                return;
                            }

                            MainCanvas.gameSceneController.x();
                            return;
                        }

                        GlobalStatus.h(this.dis);
                        return;
                    case 8224:
                        GlobalStatus.bH = this.dis.readUTF();
                        if (MainCanvas.gameSceneController.currentSceneModeId == 6) {
                            this.mainCanvas.mixedUi.clean();
                            this.mainCanvas.mixedUi.setTitle("任务详细");
                            this.mainCanvas.textPanel.setFWBText(GlobalStatus.bH, GlobalConfig.font2, (byte) 2);
                            this.mainCanvas.textPanel.setShuRuMoShi((byte) 0);
                            this.mainCanvas.bottomUi.a("确定");
                            this.mainCanvas.mixedUi.addChild((BaseUi) this.mainCanvas.textPanel);
                            this.mainCanvas.mixedUi.addChild((BaseUi) this.mainCanvas.bottomUi);
                            this.mainCanvas.mixedUi.layout(GlobalConfig.gameX, GlobalConfig.gameY, GlobalConfig.realWidth, GlobalConfig.realHigh);
                            this.mainCanvas.pageStatus = this.mainCanvas.lastPageStatus;
                            MainCanvas.gameSceneController.sceneSubState = 3;
                        }

                        return;
                    case 8225:
                        GlobalStatus.i(this.dis);
                        if (GlobalStatus.bW) {
                            MainCanvas.gameSceneController.F();
                        }

                        return;
                    case 8226:
                        GlobalStatus.J(this.dis);
                        if (GlobalStatus.gS == null) {
                            this.mainCanvas.showTips("附近没有玩家!");
                            return;
                        }

                        if (GameSceneController.notInFighting()) {
                            if (MainCanvas.gameSceneController.sceneStateShadow != 7) {
                                MainCanvas.gameSceneController.b((byte) 0);
                            } else {
                                MainCanvas.gameSceneController.b((byte) MainCanvas.gameSceneController.aV);
                            }

                            return;
                        }

                        this.mainCanvas.showTips("战斗中不能查看周围玩家");
                        return;
                    case 8227:
                        GlobalStatus.j(this.dis);
                        if (GlobalStatus.cs == null) {
                            this.mainCanvas.showTips("没有可传送的目的地!");
                            return;
                        }

                        if (MainCanvas.gameSceneController.currentSceneModeId == 1 || MainCanvas.gameSceneController.currentSceneModeId == 100) {
                            MainCanvas.gameSceneController.a(false);
                        }

                        return;
                    case 8228:
                        GlobalStatus.s(this.dis);
                        if (GlobalStatus.gs != null) {
                            boolean var62 = false;
                            MainCanvas.gameSceneController.J();
                        } else {
                            if (MainCanvas.gameSceneController.aM > 1) {
                                --MainCanvas.gameSceneController.aM;
                                this.mainCanvas.showTips("没有更多的宠物了！");
                            } else {
                                GlobalStatus.t();
                            }

                            this.mainCanvas.pageStatus = this.mainCanvas.lastPageStatus;
                            this.mainCanvas.showTips("找不到您搜索的宠物!");
                        }

                        return;
                    case 8229:
                        c(this.dis);
                        return;
                    case 8230:
                        GlobalStatus.H(this.dis);
                        MainCanvas.gameSceneController.C();
                        return;
                    case 8231:
                        GlobalStatus.r(this.dis);
                        if (GlobalStatus.dY != null) {
                            boolean var61 = false;
                            MainCanvas.gameSceneController.I();
                            return;
                        } else {
                            if (MainCanvas.gameSceneController.aM > 1) {
                                --MainCanvas.gameSceneController.aM;
                                this.mainCanvas.showTips("没有更多的物品了！");
                                this.mainCanvas.pageStatus = this.mainCanvas.lastPageStatus;
                            } else {
                                this.mainCanvas.showTips("拍卖场没有对应物品!");
                                MainCanvas.gameSceneController.sceneStateShadow = 14;
                            }
                            break;
                        }
                    case 8232:
                        GlobalStatus.k(this.dis);
                        if (MainCanvas.gameSceneController.currentSceneModeId == 11) {
                            if (GlobalStatus.ct == null) {
                                this.mainCanvas.showTips("仓库没有物品");
                            } else {
                                MainCanvas.gameSceneController.G();
                            }
                            break;
                        }

                        return;
                    case 8233:
                        GlobalStatus.G(this.dis);
                        if (MainCanvas.gameSceneController.sceneStateShadow == 35) {
                            if (GlobalStatus.gs != null) {
                                MainCanvas.gameSceneController.D();
                                if (this.mainCanvas.pageStatus != 2) {
                                    this.mainCanvas.pageStatus = this.mainCanvas.lastPageStatus;
                                }
                            } else {
                                this.mainCanvas.showTips("没有寄养宠物!");
                            }
                            break;
                        }

                        return;
                    case 8234:
                        GlobalStatus.o(this.dis);
                        if (MainCanvas.gameSceneController.currentSceneModeId == 29 && GlobalStatus.dE != null) {
                            MainCanvas.gameSceneController.i(MainCanvas.gameSceneController.aE > GlobalStatus.dE.length - 1 ? GlobalStatus.dE.length - 1 : MainCanvas.gameSceneController.aE);
                        }

                        return;
                    case 8235:
                        if (GameSceneController.notInFighting()) {
                            GlobalStatus.p(this.dis);
                        } else {
                            GlobalStatus.s();
                        }

                        if (GlobalStatus.dJ) {
                            if (!GameSceneController.notInFighting()) {
                                return;
                            }

                            MainCanvas.gameSceneController.p((int) 0);
                            return;
                        }

                        return;
                    case 8236:
                        GlobalStatus.p(this.dis);
                        if (MainCanvas.gameSceneController.currentSceneModeId != 7) {
                            MainCanvas.gameSceneController.p((int) 2);
                        }

                        return;
                    case 8238:
                        GlobalStatus.v(this.dis);
                        if (!GameSceneController.aj || GlobalStatus.ev) {
                            if (GlobalStatus.ew != null) {
                                MainCanvas.gameSceneController.a((short) MainCanvas.gameSceneController.currentSceneModeId, (byte) 1);
                            } else {
                                GlobalStatus.u();
                            }
                            break;
                        }

                        return;
                    case 8239:
                        if (this.dis.readByte() == 0) {
                            GlobalStatus.bt = false;
                        } else {
                            GlobalStatus.bt = true;
                        }

                        FightModel.k();
                        if (MainCanvas.gameSceneController != null) {
                            MainCanvas.gameSceneController.d(false);
                        }

                        return;
                    case 8240:
                        GlobalStatus.z(this.dis);
                        MainCanvas.gameSceneController.f((byte) 1);
                        return;
                    case 8241:
                        GlobalStatus.L(this.dis);
                        return;
                    case 8242:
                        GlobalStatus.K(this.dis);
                        return;
                    case 8243:
                        byte var60 = this.dis.readByte();
                        GlobalStatus.a(this.dis, var60);
                        if (GlobalStatus.db != null && GlobalStatus.db.length > 0) {
                            MainCanvas.gameSceneController.a(GlobalStatus.fz[MainCanvas.gameSceneController.ay] == 0, false);
                            return;
                        }

                        this.mainCanvas.showTips("宠物没有技能!");
                        return;
                    case 8244: // 次要外观数据：解析第二套装扮配置(GlobalStatus.u(dis))，scene=36时刷新外观UI
                        GlobalStatus.u(this.dis);
                        if (MainCanvas.gameSceneController != null) {
                            if (MainCanvas.gameSceneController.currentSceneModeId == 36 && MainCanvas.gameSceneController.sceneSubState >= 2) {
                                if (this.mainCanvas.pageStatus != 2) {
                                    this.mainCanvas.pageStatus = this.mainCanvas.lastPageStatus;
                                }

                                MainCanvas.gameSceneController.sceneSubState = 2;
                                MainCanvas.gameSceneController.a(GlobalStatus.et);
                            }

                            return;
                        }

                        return;
                    case NetPacketCode.ResourcePack: {// 资源包数据：解析并缓存UI/资源压缩包(GlobalStatus.aI(dis))，byte=1时触发资源加载回调
                        GlobalStatus.parseServerRes(this.dis);
                        if (this.dis.readByte() == 1) {
                            this.mainCanvas.reportRoleSelect();
                        }
                        return;
                    }
                    case 8246:
                        GlobalStatus.N(this.dis);
                        return;
                    case 8247: // 战斗状态标志：读取byte存入 GlobalStatus.z，scene=3/100时刷新相关UI
                        GlobalStatus.z = this.dis.readByte();
                        if (MainCanvas.gameSceneController != null) {
                            if (MainCanvas.gameSceneController.currentSceneModeId == 3) {
                                MainCanvas.gameSceneController.a((byte) 2);
                            }

                            if (MainCanvas.gameSceneController.currentSceneModeId == 100) {
                                MainCanvas.gameSceneController.N();
                                break;
                            }
                        }

                        return;
                    case 8248: // 状态标志A：读取byte存入 GlobalStatus.A，刷新UI
                        GlobalStatus.A = this.dis.readByte();
                        if (MainCanvas.gameSceneController != null) {
                            MainCanvas.gameSceneController.d(false);
                        }

                        return;
                    case 8249: // 状态标志B：读取byte存入 GlobalStatus.B，刷新UI
                        GlobalStatus.B = this.dis.readByte();
                        if (MainCanvas.gameSceneController != null) {
                            MainCanvas.gameSceneController.d(false);
                        }

                        return;
                    case 8250:
                        this.a();
                        if (MainCanvas.gameSceneController != null) {
                            MainCanvas.gameSceneController.d(false);
                        }

                        return;
                    case 8251: // 状态标志D：读取byte存入 GlobalStatus.D，刷新UI
                        GlobalStatus.D = this.dis.readByte();
                        if (MainCanvas.gameSceneController != null) {
                            MainCanvas.gameSceneController.d(false);
                        }

                        return;
                    case 8252:
                        byte var59 = this.dis.readByte();
                        GlobalStatus.f(this.dis);
                        if (var59 == 1) {
                            this.mainCanvas.i();
                        }

                        if (MainCanvas.gameSceneController != null && MainCanvas.gameSceneController.sceneStateShadow == 4) {
                            MainCanvas.gameSceneController.s();
                            return;
                        }

                        if (MainCanvas.gameSceneController != null && MainCanvas.gameSceneController.currentSceneModeId == 9) {
                            MainCanvas.gameSceneController.s();
                        }

                        return;
                    case 8253:
                        GlobalStatus.aD(this.dis);
                        if (MainCanvas.gameSceneController.currentSceneModeId != 20) {
                            MainCanvas.gameSceneController.Y();
                        }

                        return;
                    case 8254:
                        GlobalStatus.aE(this.dis);
                        MainCanvas.gameSceneController.c(MainCanvas.gameSceneController.currentSceneModeId);
                        return;
                    case 8255:
                        GlobalStatus.aG(this.dis);
                        MainCanvas.gameSceneController.Z();
                        return;
                    case 8257:
                        GlobalStatus.E = this.dis.readByte();
                        if (MainCanvas.gameSceneController != null) {
                            MainCanvas.gameSceneController.d(false);
                        }

                        return;
                    case 8258:
                        GlobalStatus.aH(this.dis);
                        if (MainCanvas.gameSceneController.sceneStateShadow != 4 && MainCanvas.gameSceneController.sceneStateShadow != 33) {
                            MainCanvas.gameSceneController.ah();
                        }

                        return;
                    case 8259:
                        GlobalStatus.Y(this.dis);
                        if (MainCanvas.gameSceneController.currentSceneModeId == 2) {
                            MainCanvas.gameSceneController.M.b(false);
                        } else if (MainCanvas.gameSceneController.currentSceneModeId == 50) {
                            this.mainCanvas.textPanel.setText(GlobalStatus.iI[this.mainCanvas.gunDongListUi.g()], GlobalConfig.font2, (byte) 2);
                            this.mainCanvas.textPanel.setShuRuMoShi((byte) 1);
                            break;
                        }

                        return;
                    case NetPacketCode.LoadMap: { // 8260 加载地图：读取帧数据大小，解析地图名称和帧数据创建 Page，跳过附加资源
                        int var42 = this.dis.readInt();
                        if (var42 > 0) {
                            byte[] frameInfo = new byte[var42];
                            GlobalStatus.currentMapName = this.dis.readUTF();
                            this.dis.read(frameInfo);
                            MainCanvas.ae = new Page(GlobalStatus.currentMapName, frameInfo);
                        }
                        GlobalStatus.skip(this.dis);
                        return;
                    }
                    case 8261:
                        GlobalStatus.aK(this.dis);
                        if (this.dis.readByte() == 1) {
                            this.mainCanvas.f();
                        }

                        if (GlobalStatus.bs == 0) {
                            this.mainCanvas.n();
                            this.mainCanvas.inputAction = 0;
                            this.mainCanvas.keyCombination = 0;
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
                        if (GlobalStatus.bu = this.dis.readByte() != 0) {
                            ab_1.b = true;
                        }

                        if (MainCanvas.gameSceneController != null && MainCanvas.gameSceneController.X != null) {
                            MainCanvas.gameSceneController.X.b();
                        }

                        if (MainCanvas.gameSceneController.currentSceneModeId == 100) {
                            MainCanvas.gameSceneController.N();
                        }

                        return;
                    case 8265:
                        GlobalStatus.bv = this.dis.readInt();
                        return;
                    case 8267:
                        GlobalStatus.bz = this.dis.readUTF();
                        GlobalStatus.by = this.dis.readUTF();
                        if (MainCanvas.gameSceneController != null) {
                            MainCanvas.gameSceneController.aa();
                        }

                        return;
                    case 8269:
                        if (MainCanvas.gameSceneController != null) {
                            MainCanvas.gameSceneController.U.a(this.dis);
                            MainCanvas.gameSceneController.U.a(false);
                        }

                        return;
                    case 8270:
                        if (MainCanvas.gameSceneController != null) {
                            MainCanvas.gameSceneController.O.b(this.dis);
                            MainCanvas.gameSceneController.O.a(false);
                        }

                        return;
                    case 8271:
                        GlobalStatus.aR(this.dis);
                        if (MainCanvas.gameSceneController != null) {
                            if (GlobalStatus.mq < 4) {
                                MainCanvas.gameSceneController.ae();
                            } else if (GlobalStatus.mq == 4) {
                                MainCanvas.gameSceneController.N();
                            } else if (GlobalStatus.mq == 5) {
                                MainCanvas.gameSceneController.N();
                            } else if (GlobalStatus.mq == 6) {
                                this.mainCanvas.pageStatus = this.mainCanvas.lastPageStatus;
                            }
                            break;
                        }

                        return;
                    case 8272:
                        if (MainCanvas.gameSceneController != null) {
                            MainCanvas.gameSceneController.N();
                        }

                        return;
                    case 8273:
                        MainCanvas.gameSceneController.J = this.dis.readUTF();
                        LoadingPage.h = 0;
                        if (!MainCanvas.gameSceneController.c && MainCanvas.gameSceneController.currentSceneModeId != 0 && MainCanvas.gameSceneController.currentSceneModeId != 25) {
                            this.mainCanvas.pageStatus = this.mainCanvas.lastPageStatus = 7;
                            MainCanvas.gameSceneController.N();
                        }

                        return;
                    case 8274:
                        int var41 = this.dis.readInt();
                        int var53 = this.dis.readInt();
                        if (MainCanvas.gameSceneController.currentSceneModeId != 0 && MainCanvas.gameSceneController.currentSceneModeId != 25 && GlobalStatus.fightData == null) {
                            this.mainCanvas.pageStatus = this.mainCanvas.lastPageStatus = 7;
                            MainCanvas.gameSceneController.N();
                        }

                        this.mainCanvas.b(var41 + 8, var53 + 16);
                        return;
                    case 8275:
                        byte var40 = this.dis.readByte();
                        GlobalStatus.F = null;
                        GlobalStatus.G = null;
                        if (var40 == 1) {
                            GlobalStatus.F = this.dis.readUTF();
                            GlobalStatus.G = this.dis.readUTF();
                        }

                        this.mainCanvas.pageStatus = this.mainCanvas.lastPageStatus = 7;
                        return;
                    case 8277:
                        if (MainCanvas.gameSceneController != null && MainCanvas.gameSceneController.P != null) {
                            MainCanvas.gameSceneController.P.a(this.dis);
                            MainCanvas.gameSceneController.P.a(false);
                        }

                        return;
                    case 8278:
                        GlobalStatus.Z(this.dis);
                        MainCanvas.gameSceneController.M.n();
                        return;
                    case 8280:
                        GlobalStatus.p(this.dis);
                        if (MainCanvas.gameSceneController.currentSceneModeId != 7) {
                            MainCanvas.gameSceneController.p((int) 1);
                        }

                        return;
                    case 8286: { // 服务器公告/提示：读取类型(GlobalStatus.l)和内容字符串(GlobalStatus.k)，触发公告显示
                        GlobalStatus.l = this.dis.readByte();
                        GlobalStatus.k = this.dis.readUTF();
                        MainCanvas.gameSceneController.ab();
                        return;
                    }
                    case 8288:
                        MainCanvas.aH = this.dis.readUTF();
                        MainCanvas.aI = this.dis.readUTF();
                        this.mainCanvas.q();
                        return;
                    case 8290:
                        GlobalStatus.zhangHao = this.dis.readUTF();
                        GlobalStatus.token = this.dis.readUTF();
                        if (GlobalConfig.channel == 1) {
                            this.dis.readUTF();
                            GlobalStatus.roleId = this.dis.readUTF();
                        }

                        return;
                    case 8291:
                        byte var39 = this.dis.readByte();
                        GlobalStatus.aa(this.dis);
                        if (MainCanvas.gameSceneController.currentSceneModeId != 115) {
                            return;
                        }

                        MainCanvas.gameSceneController.M.p();
                        if (var39 == 3 || var39 == 4) {
                            this.mainCanvas.textPanel.setShuRuMoShi((byte) 1);
                        }

                        if (var39 == 5) {
                            this.mainCanvas.i();
                        }

                        return;
                    case 8293:
                        if (MainCanvas.gameSceneController != null && MainCanvas.gameSceneController.Q != null) {
                            MainCanvas.gameSceneController.Q.a(this.dis);
                            MainCanvas.gameSceneController.Q.a(false);
                        }

                        return;
                    case 8294:
                        if (MainCanvas.gameSceneController != null) {
                            if (GlobalConfig.channel == 0) {
                                if (GlobalStatus.jy != 1) {
                                    this.mainCanvas.showTips("充值卡充值暂时关闭");
                                }
                            } else if (GlobalStatus.jy == 1) {
//                                LoginController.ggggggggggggggggggg();
                            } else {
                                this.mainCanvas.showTips("充值功能暂时关闭");
                            }
                            break;
                        }

                        return;
                    case 8295:
                        GlobalConfig.printStr("exec宠物升星");
                        GlobalStatus.aS(this.dis);
                        if (MainCanvas.gameSceneController != null) {
                            MainCanvas.gameSceneController.e(false);
                        }

                        return;
                    case 8296:
                        GlobalConfig.printStr("exec抽奖");
                        GlobalStatus.aW(this.dis);
                        MainCanvas.gameSceneController.am();
                        return;
                    case 8297:
                        GlobalConfig.printStr("exec抽奖结果");
                        GlobalStatus.aX(this.dis);
                        if (MainCanvas.gameSceneController.currentSceneModeId == 127) {
                            MainCanvas.gameSceneController.am();
                            this.mainCanvas.showTips("恭喜您，抽中了" + GlobalStatus.nj + "×" + GlobalStatus.nk);
                        }

                        return;
                    case 8298:
                        GlobalConfig.printStr("exec宠物升星结果");
                        GlobalStatus.bc(this.dis);
                        if (GlobalStatus.nB == 1) {
                            this.mainCanvas.showTips("升星成功");
                        } else {
                            this.mainCanvas.showTips("升星失败");
                        }

                        return;
                    case 8300:
                        if (MainCanvas.gameSceneController != null) {
                            MainCanvas.gameSceneController.O.b(this.dis);
                            MainCanvas.gameSceneController.O.a(false);
                        }

                        return;
                    case 8301:
                        if (MainCanvas.gameSceneController != null) {
                            MainCanvas.gameSceneController.V.a(this.dis);
                            MainCanvas.gameSceneController.V.a(false);
                        }

                        return;
                    case 8302:
                        if (MainCanvas.gameSceneController.N == null) {
                            MainCanvas.gameSceneController.N = new cc(MainCanvas.gameSceneController, this.mainCanvas);
                        }

                        MainCanvas.gameSceneController.N.a(this.dis);
                        MainCanvas.gameSceneController.N.a((short) 0);
                        return;
                    case 8303:
                        GlobalConfig.printStr("宠物继承");
                        cg_1.a(cg_1.b);
                        cg_1.a(this.dis);
                        MainCanvas.gameSceneController.W.b();
                        return;
                    case 8304:
                        if (this.dis.readInt() == 1) {
                            if (MainCanvas.gameSceneController.N == null) {
                                MainCanvas.gameSceneController.N = new cc(MainCanvas.gameSceneController, this.mainCanvas);
                            }

                            MainCanvas.gameSceneController.N.b(this.dis);
                            MainCanvas.gameSceneController.N.a((short) 2);
                        }

                        return;
                    case 8448:
                        if (this.dis.readByte() == 1) {
                            this.mainCanvas.startMainPage();
                        }

                        return;
                    case 8449:
                        GlobalStatus.O(this.dis);
                        MainCanvas.gameSceneController.i((byte) 0);
                        return;
                    case 8450:
                        GlobalStatus.P(this.dis);
                        if (MainCanvas.gameSceneController.currentSceneModeId == 1) {
                            MainCanvas.gameSceneController.X();
                        } else {
                            MainCanvas.gameSceneController.k((byte) 1);
                        }

                        return;
                    case 8451:
                        GlobalStatus.O(this.dis);
                        MainCanvas.gameSceneController.i((byte) 2);
                        return;
                    case 8452:
                        GlobalStatus.P(this.dis);
                        MainCanvas.gameSceneController.k((byte) 3);
                        return;
                    case 8453:
                        GlobalStatus.S(this.dis);
                        if (MainCanvas.gameSceneController != null) {
                            MainCanvas.gameSceneController.U();
                        }

                        return;
                    case 8454:
                        GlobalStatus.O(this.dis);
                        if (MainCanvas.gameSceneController.as != 5 && MainCanvas.gameSceneController.aZ != 4 && MainCanvas.gameSceneController.as != 9 && MainCanvas.gameSceneController.as != 10) {
                            MainCanvas.gameSceneController.i((byte) 4);
                            return;
                        }

                        if (MainCanvas.gameSceneController.aZ == 4) {
                            MainCanvas.gameSceneController.aZ = -1;
                        }

                        MainCanvas.gameSceneController.j((byte) 6);
                        this.mainCanvas.pageStatus = this.mainCanvas.lastPageStatus;
                        MainCanvas.gameSceneController.sceneStateShadow = MainCanvas.gameSceneController.currentSceneModeId = 38;
                        return;
                    case 8455:
                        GlobalStatus.P(this.dis);
                        MainCanvas.gameSceneController.k((byte) 5);
                        return;
                    case 8456:
                        String var38 = this.dis.readUTF();
                        if (MainCanvas.gameSceneController != null) {
                            MainCanvas.gameSceneController.d(var38);
                        }

                        return;
                    case 8704:
                        GlobalStatus.T(this.dis);
                        if (GlobalStatus.ik != null && GlobalStatus.ik.length > 0) {
                            MainCanvas.gameSceneController.M.b();
                            return;
                        }

                        this.mainCanvas.showTips("没有等待响应的帮派!");
                        return;
                    case 8705:
                        GlobalStatus.W(this.dis);
                        MainCanvas.gameSceneController.M.h(0);
                        return;
                    case 8706:
                        GlobalStatus.X(this.dis);
                        MainCanvas.gameSceneController.M.h(1);
                        return;
                    case 8708:
                        GlobalStatus.U(this.dis);
                        if (GlobalStatus.ip != null) {
                            MainCanvas.gameSceneController.M.c();
                        } else {
                            this.mainCanvas.showTips("没有帮派发布招募!");
                        }

                        return;
                    case 8709:
                        GlobalStatus.V(this.dis);
                        if (GlobalStatus.it != null) {
                            MainCanvas.gameSceneController.M.f();
                        } else {
                            this.mainCanvas.showTips("没有申请入帮玩家!");
                        }

                        return;
                    case 8710:
                        GlobalStatus.W(this.dis);
                        if (GlobalStatus.iy != null) {
                            MainCanvas.gameSceneController.M.i();
                            return;
                        } else {
                            if (MainCanvas.gameSceneController.M.g == 1) {
                                MainCanvas.gameSceneController.M.a(true);
                            } else if (MainCanvas.gameSceneController.M.g == 0) {
                                MainCanvas.gameSceneController.k();
                                MainCanvas.gameSceneController.c((int) 4);
                            }
                            break;
                        }
                    case 8711:
                        GlobalStatus.ab(this.dis);
                        MainCanvas.gameSceneController.M.j();
                        return;
                    case 8712:
                        GlobalStatus.ac(this.dis);
                        MainCanvas.gameSceneController.M.k();
                        return;
                    case 8713:
                        GlobalStatus.ad(this.dis);
                        MainCanvas.gameSceneController.M.l();
                        return;
                    case 8714:
                        GlobalStatus.ae(this.dis);
                        if (GlobalStatus.jo != null) {
                            MainCanvas.gameSceneController.M.s();
                        } else {
                            this.mainCanvas.showTips("没有可购买的设施!");
                        }

                        return;
                    case 8715:
                        GlobalStatus.ag(this.dis);
                        if (MainCanvas.gameSceneController != null) {
                            MainCanvas.gameSceneController.U();
                        }

                        return;
                    case 8716:
                        GlobalStatus.af(this.dis);
                        MainCanvas.gameSceneController.M.t();
                        return;
                    case 8717:
                        GlobalStatus.ah(this.dis);
                        if (GlobalStatus.jz != null) {
                            MainCanvas.gameSceneController.W();
                        } else {
                            this.mainCanvas.showTips("增值仓库没有物品!");
                        }

                        return;
                    case 8718:
                        GlobalStatus.ai(this.dis);
                        MainCanvas.gameSceneController.a((byte) 3);
                        return;
                    case 8722: {// 充值/功能开关状态：读取jv(充值开关)、jw(功能开关)、jx、jy(充值渠道状态)等标志
                        GlobalStatus.jv = this.dis.readByte() == 1;
                        GlobalStatus.jw = this.dis.readByte() == 1;
                        GlobalStatus.jx = this.dis.readByte();
                        GlobalStatus.jy = this.dis.readByte();
                        return;
                    }
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
                        GlobalStatus.aj(this.dis);
                        if (!GameSceneController.notInFighting()) {
                            this.mainCanvas.showTips("战斗中不能进行该操作");
                            return;
                        }

                        if (MainCanvas.gameSceneController == null) {
                            return;
                        }

                        MainCanvas.gameSceneController.c(false);
                        return;
                    case 8725:
                        GlobalStatus.ak(this.dis);
                        MainCanvas.gameSceneController.l((byte) 0);
                        return;
                    case 8726:
                        GlobalStatus.H(this.dis);
                        MainCanvas.gameSceneController.C();
                        return;
                    case 8727:
                        GlobalStatus.al(this.dis);
                        MainCanvas.gameSceneController.l((byte) 2);
                        return;
                    case 8728:
                        GlobalStatus.an(this.dis);
                        MainCanvas.gameSceneController.C();
                        return;
                    case NetPacketCode.ServerConfig: { // 服务器配置：解析界面颜色、loading文字、服务器名称、公告URL等配置(GlobalStatus.aF(dis))
                        GlobalStatus.parseServerConfig(this.dis);
                        return;
                    }
                    case 8730:
                        GlobalStatus.at(this.dis);
                        return;
                    case 8731:
                        GlobalStatus.aw(this.dis);
                        return;
                    case 8732:
                        GlobalStatus.av(this.dis);
                        if (o_1.e == 1) {
                            MainCanvas.gameSceneController.O.a(MainCanvas.gameSceneController.O.a, (short) MainCanvas.gameSceneController.O.c, MainCanvas.gameSceneController.O.d);
                        } else {
                            MainCanvas.gameSceneController.O.a(0, (short) -1, -1);
                        }

                        return;
                    case 8733:
                        o_1.a(this.dis);
                        MainCanvas.gameSceneController.O.c();
                        return;
                    case 8734:
                        GlobalStatus.Q(this.dis);
                        if (MainCanvas.gameSceneController.as != 3 && MainCanvas.gameSceneController.as != 8 && MainCanvas.gameSceneController.as != 7 && MainCanvas.gameSceneController.as != 2) {
                            if (MainCanvas.gameSceneController.as == 4 || MainCanvas.gameSceneController.as == 5 || MainCanvas.gameSceneController.as == 6 || MainCanvas.gameSceneController.as == 10) {
                                MainCanvas.gameSceneController.i((byte) 9);
                            }

                            return;
                        }

                        MainCanvas.gameSceneController.i((byte) 7);
                        return;
                    case 8735:
                        GlobalStatus.R(this.dis);
                        if (MainCanvas.gameSceneController.as != 7 && MainCanvas.gameSceneController.as != 2 && MainCanvas.gameSceneController.as != 3 && MainCanvas.gameSceneController.as != 8) {
                            if (MainCanvas.gameSceneController.as == 9 || MainCanvas.gameSceneController.as == 4 || MainCanvas.gameSceneController.as == 5 || MainCanvas.gameSceneController.as == 6) {
                                MainCanvas.gameSceneController.i((byte) 10);
                            }

                            return;
                        }

                        MainCanvas.gameSceneController.i((byte) 8);
                        return;
                    case 8736:
                        GlobalStatus.aP(this.dis);
                        if (MainCanvas.gameSceneController != null && MainCanvas.gameSceneController.ad()) {
                            MainCanvas.gameSceneController.e((byte) 0);
                            GlobalStatus.lt[0] = -1;
                            return;
                        }

                        if (MainCanvas.gameSceneController != null && (GlobalStatus.lt[0] == 0 || GlobalStatus.lt[0] == 1 || GlobalStatus.lt[0] == 2)) {
                            MainCanvas.gameSceneController.e((byte) 0);
                            GlobalStatus.lt[0] = -1;
                        }

                        return;
                    case 8737:
                        if (MainCanvas.gameSceneController != null) {
                            byte[] var36;
                            if ((var36 = NetPayloadBuilder.a((short) 4255, (short[]) GlobalStatus.lt, (String) GlobalStatus.roleId_2)) != null) {
                                NetPacket var37 = new NetPacket((short) 4255, var36);
                                MainCanvas.netUtils.sendPacket(var37);
                            } else {
                                this.mainCanvas.showTips("获取上传指令数据错误!");
                            }
                            break;
                        }

                        return;
                    case 8738:
                        GlobalStatus.aO(this.dis);
                        if (MainCanvas.gameSceneController != null && MainCanvas.gameSceneController.ad()) {
                            MainCanvas.gameSceneController.sceneSubState = 0;
                            MainCanvas.gameSceneController.c((byte) 0);
                            GlobalStatus.lt[1] = -1;
                            return;
                        }

                        if (MainCanvas.gameSceneController != null && GlobalStatus.lt[1] == 1) {
                            MainCanvas.gameSceneController.sceneSubState = 0;
                            MainCanvas.gameSceneController.c((byte) 0);
                            GlobalStatus.lt[1] = -1;
                            return;
                        }

                        if (MainCanvas.gameSceneController.mainCanvasRef.pageStatus == 1) {
                            MainCanvas.gameSceneController.mainCanvasRef.pageStatus = this.mainCanvas.lastPageStatus;
                        }

                        return;
                    case 8739:
                        GlobalStatus.aN(this.dis);
//                        LoginController.aaaaa("游客注册 第2步: ", "创建一哥哥通行证密码");
                        this.mainCanvas.pageStatus = 7;
                        return;
                    case 8960:
                        GlobalStatus.ao(this.dis);
                        if (MainCanvas.gameSceneController.M.p == 0) {
                            MainCanvas.gameSceneController.M.u();
                        } else {
                            MainCanvas.gameSceneController.M.h(2);
                        }

                        return;
                    case 8961:
                        GlobalStatus.ap(this.dis);
                        MainCanvas.gameSceneController.f((byte) 2);
                        return;
                    case 8962:
                        GlobalStatus.aq(this.dis);
                        return;
                    case 8963:
                        GlobalStatus.kj = this.dis.readShort();
                        return;
                    case 8964:
                        GlobalStatus.ar(this.dis);
                        if (GlobalStatus.kk != null) {
                            this.mainCanvas.showTips(GlobalStatus.kk);
                            this.mainCanvas.a(false);
                        }

                        return;
                    case 8965:
                        GlobalStatus.as(this.dis);
                        MainCanvas.gameSceneController.M.h(3);
                        return;
                    case 8966:
                        GlobalStatus.ax(this.dis);
                        MainCanvas.gameSceneController.M.w();
                        return;
                    case 8967:
                        GlobalStatus.ay(this.dis);
                        MainCanvas.gameSceneController.M.x();
                        return;
                    case 8968:
                        GlobalStatus.aC(this.dis);
                        GlobalStatus.O.a();
                        return;
                    case 8969:
                        GlobalStatus.aB(this.dis);
                        if (MainCanvas.gameSceneController.currentSceneModeId == 76) {
                            int var34 = this.mainCanvas.topUi.a;
                            int var52 = this.mainCanvas.gunDongListUi.g();
                            MainCanvas.gameSceneController.d((byte) var34);
                            var34 = var34 == 0 ? GlobalStatus.O.f.length : GlobalStatus.P.b.length;
                            this.mainCanvas.gunDongListUi.a(Math.min(var52, var34));
                        }

                        return;
                    case 8970:
                        GlobalStatus.a(this.dis.readByte(), this.dis);
                        return;
                    case 8971:
                        if (MainCanvas.gameSceneController.currentSceneModeId != 111) {
                            GlobalStatus.au(this.dis);
                            if (GlobalStatus.Q.b != null && GlobalStatus.Q.b.length() > 0) {
                                this.mainCanvas.popUpWindow.destroy();
                                GlobalStatus.Q.a(this.mainCanvas.popUpWindow);
                                GlobalStatus.Q.a();
                                GlobalStatus.Q.b();
                                MainCanvas.gameSceneController.sceneStateShadow = MainCanvas.gameSceneController.currentSceneModeId;
                                MainCanvas.gameSceneController.currentSceneModeId = 111;
                                this.mainCanvas.pageStatus = this.mainCanvas.lastPageStatus;
                            }

                            return;
                        }

                        return;
                    case 8972: // 活动/节日事件列表：解析活动对象(ag_1)及活动条目(be_1[])，scene=76/111时刷新活动UI
                        GlobalStatus.aA(this.dis);
                        if (MainCanvas.gameSceneController.currentSceneModeId == 76) {
                            byte var50 = this.mainCanvas.topUi.a;
                            int var32 = this.mainCanvas.gunDongListUi.g();
                            MainCanvas.gameSceneController.d((byte) var50);
                            this.mainCanvas.gunDongListUi.a(var32);
                        }

                        if (MainCanvas.gameSceneController.currentSceneModeId == 111) {
                            if (this.mainCanvas.pageStatus == 1) {
                                this.mainCanvas.pageStatus = 7;
                            }

                            if (MainCanvas.gameSceneController.sceneStateShadow == 76) {
                                byte var51 = this.mainCanvas.topUi.a;
                                int var33 = this.mainCanvas.gunDongListUi.g();
                                MainCanvas.gameSceneController.d((byte) var51);
                                this.mainCanvas.gunDongListUi.a(var33);
                                break;
                            }
                        }

                        return;
                    case 8973:
                        GlobalStatus.az(this.dis);
                        GlobalStatus.P.c();
                        MainCanvas.gameSceneController.u();
                        return;
                    case 8974:
                        GlobalConfig.printStr("exec特效查看");
                        GlobalStatus.aT(this.dis);
                        MainCanvas.gameSceneController.z();
                        return;
                    case 8975:
                        GlobalConfig.printStr("exec特效激活");
                        GlobalStatus.aU(this.dis);
                        MainCanvas.gameSceneController.B();
                        return;
                    case 8976:
                        GlobalConfig.printStr("exec特效消除");
                        GlobalStatus.aV(this.dis);
                        MainCanvas.gameSceneController.A();
                        return;
                    case 8977:
                        GlobalConfig.printStr("exec查看坐骑");
                        GlobalStatus.aY(this.dis);
                        MainCanvas.gameSceneController.al();
                        MainCanvas.gameSceneController.sceneRefreshCoordinator.a(true);
                        return;
                    case 8978:
                        GlobalConfig.printStr("exec坐骑升星");
                        GlobalStatus.aZ(this.dis);
                        MainCanvas.gameSceneController.al();
                        return;
                    case 8979:
                        GlobalConfig.printStr("exec更换坐骑");
                        GlobalStatus.ba(this.dis);
                        MainCanvas.gameSceneController.al();
                        MainCanvas.gameSceneController.sceneRefreshCoordinator.a(true);
                        return;
                    case 8981:
                        GlobalConfig.printStr("exec特效技能");
                        GlobalStatus.bb(this.dis);
                        MainCanvas.gameSceneController.an();
                        return;
                    case 8982:
                        GlobalConfig.printStr("exec宠物炼化需 求");
                        (GlobalStatus.nC = new String[3])[0] = this.dis.readUTF();
                        GlobalStatus.nC[1] = this.dis.readUTF();
                        GlobalStatus.nC[2] = this.dis.readUTF();
                        MainCanvas.gameSceneController.sceneSubState = 11;
                        LoadingPage.h = 0;
                        this.mainCanvas.pageStatus = this.mainCanvas.lastPageStatus;
                        return;
                    case 9216:
                        MarriageModel.a(this.dis);
                        if (MarriageModel.a != null) {
                            MainCanvas.gameSceneController.S.a((int) 0);
                        } else {
                            this.mainCanvas.showTips("暂无求爱信息!");
                        }

                        return;
                    case 9217:
                        MarriageModel.b(this.dis);
                        if (MarriageModel.b != null) {
                            MainCanvas.gameSceneController.S.b();
                        } else {
                            this.mainCanvas.showTips("求爱信息不存在!");
                        }

                        return;
                    case 9218:
                        MarriageModel.c(this.dis);
                        MainCanvas.gameSceneController.S.c();
                        return;
                    case 9219:
                        MarriageModel.d(this.dis);
                        MainCanvas.gameSceneController.S.d();
                        return;
                    case 9220:
                        MarriageModel.e(this.dis);
                        MainCanvas.gameSceneController.S.f();
                        return;
                    case 9221:
                        if (GameSceneController.notInFighting()) {
                            this.mainCanvas.pageStatus = this.mainCanvas.lastPageStatus = 7;
                            MainCanvas.gameSceneController.sceneStateShadow = MainCanvas.gameSceneController.currentSceneModeId = 0;
                        }

                        this.mainCanvas.showTips(this.dis.readUTF());
                        return;
                    case 9222:
                        GlobalStatus.aQ(this.dis);
                        if (MainCanvas.gameSceneController != null) {
                            MainCanvas.gameSceneController.ac();
                        }

                        return;
                    case 9223: //超Q相关
                        byte var31 = this.dis.readByte();
                        if (MainCanvas.gameSceneController != null) {
                            break;
                        }
                        return;
                    case 9472:
                        GlobalStatus.M(this.dis);
                        if (GlobalConfig.channel != 0 && !GlobalConfig.logined) {
                            if (GlobalStatus.hw) {
                                if (GlobalStatus.hw && GlobalStatus.hA.length <= 0) {
                                    this.mainCanvas.showTips("服务维护中，暂无可以进入的服务器");
                                    return;
                                }

                                this.mainCanvas.lastPageStatus = this.mainCanvas.pageStatus = 4;
                                this.mainCanvas.inputAction = 0;
                                this.mainCanvas.keyCombination = 0;
                                this.mainCanvas.a((int) 0);
                                this.mainCanvas.inputAction = 0;
                                return;
                            }

                            if (GlobalStatus.hA != null && GlobalStatus.hA.length > 0) {
                                this.mainCanvas.d();
                                return;
                            }

                            this.mainCanvas.showTips("服务维护中，暂无可以进入的服务器");
                            return;
                        }

                        this.mainCanvas.d();
                        return;
                    case 9473:
                        GlobalStatus.lq = this.dis.readByte();
                        GlobalStatus.lp = this.dis.readShort();
                        GlobalStatus.kZ = this.dis.readShort();
                        GlobalStatus.lf = this.dis.readUTF();
                        GlobalStatus.lg = this.dis.readByte();
                        if ((GlobalStatus.le = this.dis.readShort()) > 0) {
                            GlobalStatus.aL(this.dis);
                            MainCanvas.gameSceneController.d(GlobalStatus.kZ);
                        } else {
                            this.mainCanvas.showTips("没有更多的成就!");
                        }

                        return;
                    case 9474:
                        GlobalStatus.ls = this.dis.readByte();
                        GlobalStatus.lr = this.dis.readShort();
                        GlobalStatus.kZ = this.dis.readShort();
                        this.dis.readUTF();
                        this.dis.readByte();
                        GlobalStatus.lm = this.dis.readByte();
                        GlobalStatus.lh = this.dis.readUTF();
                        if ((GlobalStatus.ll = this.dis.readShort()) > 0) {
                            GlobalStatus.aM(this.dis);
                            MainCanvas.gameSceneController.e(GlobalStatus.kZ);
                        } else {
                            this.mainCanvas.showTips("没有更多的成就!");
                        }

                        return;
                    case 9488:
                        GlobalStatus.x(this.dis);
                        MainCanvas.gameSceneController.ai();
                        return;
                    case 9489:
                        GlobalStatus.y(this.dis);
                        MainCanvas.gameSceneController.aj();
                        return;
                    case 9491:
                        GlobalConfig.printStr("exec 随机名称");
                        this.mainCanvas.ay = this.dis.readUTF();
                        if (this.mainCanvas.lastPageStatus == 6) {
                            this.mainCanvas.pageStatus = this.mainCanvas.lastPageStatus;
                        }

                        return;
                    case 9494:
                        if (MainCanvas.gameSceneController != null) {
                            if (MainCanvas.gameSceneController.R == null) {
                                MainCanvas.gameSceneController.R = new bd(MainCanvas.gameSceneController, MainCanvas.gameSceneController.mainCanvasRef, MainCanvas.pngUtil);
                            }

                            MainCanvas.gameSceneController.R.a(this.dis);
                            MainCanvas.gameSceneController.R.a();
                        }

                        return;
                    case 10496:
                        byte var30 = this.dis.readByte();
                        this.dis.readByte();
                        if (var30 == 4) {
                            String[] var3;
                            ChongZhiModel.j = (var3 = ZhangHaoUtils.a(this.dis.readUTF(), ':'))[0].trim();
                            ChongZhiModel.i = var3[1].trim();
                            ChongZhiModel.zhanghao = ChongZhiModel.j;
                            ChongZhiModel.pwd = ChongZhiModel.i;
                            ChongZhiModel.saveZhangHaoPwd();
                            String var4 = this.dis.readUTF();
                            this.mainCanvas.showTips(var4);
                        } else if (var30 == 2) {
                            String[] var49;
                            ChongZhiModel.j = (var49 = ZhangHaoUtils.a(this.dis.readUTF(), ':'))[0].trim();
                            ChongZhiModel.i = var49[1].trim();
                            ChongZhiModel.zhanghao = ChongZhiModel.j;
                            ChongZhiModel.pwd = ChongZhiModel.i;
                            ChongZhiModel.saveZhangHaoPwd();
                            String var58 = this.dis.readUTF();
                            this.mainCanvas.showTips(var58);
                            break;
                        }

                        return;
                    case 12289:
                        byte var2 = this.dis.readByte();
                        GlobalStatus.ke = -1;
                        GlobalStatus.kf = -1;
                        GlobalStatus.kg = -1;
                        if (var2 == 0) {
                            GlobalStatus.ke = this.dis.readInt();
                            GlobalStatus.kf = this.dis.readInt();
                            GlobalStatus.kg = this.dis.readInt();
                        }

                        return;
                }
            } catch (Exception e) {
                e.printStackTrace();
                this.mainCanvas.showException(e, (byte) 5);
            } finally {
                try {
                    if (this.dis != null) {
                        this.dis.close();
                    }

                    if (this.bis != null) {
                        this.bis.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }

    private void a() throws IOException {
        GlobalStatus.C = new byte[this.dis.readByte()];

        for (byte var1 = 0; var1 < GlobalStatus.C.length; ++var1) {
            GlobalStatus.C[var1] = this.dis.readByte();
        }

    }

    private void a(DataInputStream var1) {
        try {
            if (MainCanvas.gameSceneController != null && MainCanvas.gameSceneController.currentSceneModeId != 25 && MainCanvas.gameSceneController.currentSceneModeId != 18) {
                byte var2;
                if ((var2 = var1.readByte()) > GameSceneController.aW[0] && GlobalStatus.bw == 0) {
                    var2 = GameSceneController.aW[0];
                }

                bl[] var3 = new bl[var2];

                for (int var4 = 0; var4 < var2; ++var4) {
                    var3[var4] = new bl();
                    var3[var4].a(var1);
                }

                if (GlobalStatus.o != null) {
                    MainCanvas var5 = this.mainCanvas;
                    NetworkPacketProcessors var14 = this;
                    this.i_1.removeAllElements();
                    bl[] var21 = var3;
                    NetworkPacketProcessors var16 = this;
                    if (this.j == null) {
                        this.j = new bl[3];
                    }

                    if (var3 != null && MainCanvas.gameSceneController != null && MainCanvas.gameSceneController.sceneRefreshCoordinator != null) {
                        for (int var6 = 0; var6 < var16.j.length; ++var6) {
                            var16.j[var6] = null;
                        }

                        boolean var23 = false;
                        if (var3.length <= 3) {
                            var23 = true;
                        }

                        byte var7 = (byte) (MainCanvas.gameSceneController.sceneRefreshCoordinator.k / 16);
                        byte var8 = (byte) (MainCanvas.gameSceneController.sceneRefreshCoordinator.j / 16);
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
                                    var14.i_1 = var14.a(MainCanvas.gameSceneController.f, var14.i_1, new bs(var14.e, var14.f), new bs(var14.g, var14.h));
                                    if (var14.i_1 != null) {
                                        var14.j[var17].f.removeAllElements();
                                        int var29 = var14.i_1.size();

                                        for (int var30 = 0; var30 < var29; ++var30) {
                                            bs var22 = (bs) var14.i_1.elementAt(var30);
                                            bs var24;
                                            if (var30 < var29 - 1) {
                                                var24 = (bs) var14.i_1.elementAt(var30 + 1);
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

                GameSceneController.a(var3);
            }
        } catch (Exception var13) {
            if (MainCanvas.gameSceneController != null) {
                MainCanvas.gameSceneController.c("系统异常[8]");
            }

        }
    }

    /**
     * 处理角色移动/位置包(8199)：解析角色坐标和移动路径，重置触控输入并更新场景刷新器的目标坐标。
     */
    private void processRoleMove() throws IOException {
        GlobalStatus.c(this.dis);
        if (MainCanvas.gameSceneController != null && MainCanvas.gameSceneController.sceneRefreshCoordinator != null) {
            if (GlobalConfig.supportTouch && this.mainCanvas.touchController != null) {
                if (!MainCanvas.gameSceneController.sceneRefreshCoordinator.c.isEmpty()) {
                    MainCanvas.gameSceneController.sceneRefreshCoordinator.c.removeAllElements();
                    MainCanvas.gameSceneController.sceneRefreshCoordinator.b();
                }

                if (this.mainCanvas.touchController != null) {
                    this.mainCanvas.touchController.c = 0;
                    this.mainCanvas.touchController.d = 0;
                }

                this.mainCanvas.keyCombination = 0;
                this.mainCanvas.inputAction = 0;
            }

            MainCanvas.gameSceneController.sceneRefreshCoordinator.j = GlobalStatus.at;
            MainCanvas.gameSceneController.sceneRefreshCoordinator.k = GlobalStatus.au;
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

        if (MainCanvas.gameSceneController == null) {
            this.mainCanvas.startGameScene();
            MainCanvas.gameSceneController.sceneRefreshCoordinator.d();
        } else {
            MainCanvas.gameSceneController.sceneRefreshCoordinator.a((int) GlobalStatus.av);

            if (MainCanvas.gameSceneController.Y == GlobalStatus.ar && !MainCanvas.gameSceneController.sceneRefreshCoordinator.h()) {
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
                        int var3 = (var10 = this.a(MainCanvas.gameSceneController.f, var9, new bs(this.e, this.f), new bs(this.g, this.h))).size();

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
                    MainCanvas.gameSceneController.aY = 0L;
                }

                if (MainCanvas.gameSceneController.sceneRefreshCoordinator.d != null) {
                    MainCanvas.gameSceneController.sceneRefreshCoordinator.d.e.removeAllElements();
                    MainCanvas.gameSceneController.sceneRefreshCoordinator.d.h = GlobalStatus.at;
                    MainCanvas.gameSceneController.sceneRefreshCoordinator.d.i = GlobalStatus.au;
                    MainCanvas.gameSceneController.sceneRefreshCoordinator.d.j = MainCanvas.gameSceneController.sceneRefreshCoordinator.h;
                    MainCanvas.gameSceneController.sceneRefreshCoordinator.d.a(MainCanvas.gameSceneController.sceneRefreshCoordinator.h);
                }

                if (GameSceneController.notInFighting()) {
                    if (MainCanvas.gameSceneController.Y != GlobalStatus.ar) {
                        MainCanvas.gameSceneController.e();
                    } else {
                        MainCanvas.gameSceneController.f();
                    }

                    MainCanvas.gameSceneController.sceneRefreshCoordinator.i();
                    MainCanvas.gameSceneController.Y = GlobalStatus.ar;
                }

                MainCanvas.gameSceneController.sceneRefreshCoordinator.d();
            }
        }
    }

    private void c() throws IOException {
        if (GlobalStatus.bE = this.dis.readByte() == 1) {
            GlobalStatus.bF = this.dis.readInt();
        } else {
            GlobalStatus.bF = -1;
        }

        GlobalStatus.bG = this.dis.readInt();
        GlobalStatus.bH = this.dis.readUTF();
        if (GlobalStatus.bE) {
            MainCanvas.gameSceneController.currentSceneModeId = 2;
        }

        if (MainCanvas.gameSceneController.currentSceneModeId == 2) {
            GameSceneController.K = new FWBRender(GlobalStatus.bH, (short) (GlobalConfig.defaultWidth - 20));
            if (GlobalStatus.bE) {
                MainCanvas.gameSceneController.an = new String[]{"接受", "返回"};
            } else if (GlobalStatus.bK[MainCanvas.gameSceneController.ai] == -1) {
                MainCanvas.gameSceneController.an = new String[]{"接受", "返回"};
            } else if (GlobalStatus.bK[MainCanvas.gameSceneController.ai] == 0) {
                MainCanvas.gameSceneController.an = new String[]{"确定", "返回"};
            } else if (GlobalStatus.bK[MainCanvas.gameSceneController.ai] == 1) {
                MainCanvas.gameSceneController.an = new String[]{"提交", "返回"};
            }

            LoadingPage.a(MainCanvas.F, GameSceneController.K, MainCanvas.gameSceneController.an, (String[]) null, true);
            this.mainCanvas.pageStatus = this.mainCanvas.lastPageStatus;
            MainCanvas.gameSceneController.sceneSubState = 1;
        } else {
            if (MainCanvas.gameSceneController.currentSceneModeId == 6) {
                this.mainCanvas.showTips("不处理");
            }

        }
    }

    /**
     * 处理宠物列表包(8222)：解析所有宠物数据(GlobalStatus.I(dis))，根据当前场景模式显示宠物UI。
     */
    private void d() throws IOException {
        GlobalStatus.I(this.dis);
        if (MainCanvas.gameSceneController != null) {
            if (!GameSceneController.notInFighting()) {
                return;
            }

            if (MainCanvas.gameSceneController.currentSceneModeId == 13) {
                if (GlobalStatus.fA == null) {
                    GlobalStatus.B();
                    this.mainCanvas.showTips("您没有宠物！");
                    return;
                }

                if (MainCanvas.gameSceneController.sceneSubState == 6) {
                    MainCanvas.gameSceneController.k(MainCanvas.gameSceneController.aE);
                    return;
                }

                if (MainCanvas.gameSceneController.sceneSubState == 8) {
                    if (this.mainCanvas.pageStatus != 2) {
                        this.mainCanvas.pageStatus = this.mainCanvas.lastPageStatus;
                        return;
                    }
                } else if (o_1.e == 1) {
                    if (this.mainCanvas.pageStatus != 2) {
                        this.mainCanvas.pageStatus = this.mainCanvas.lastPageStatus;
                        return;
                    }
                } else {
                    MainCanvas.gameSceneController.j(MainCanvas.gameSceneController.as);
                    if (this.mainCanvas.pageStatus != 2) {
                        this.mainCanvas.pageStatus = this.mainCanvas.lastPageStatus;
                        return;
                    }
                }
            } else {
                if (MainCanvas.gameSceneController.currentSceneModeId == 36) {
                    MainCanvas.gameSceneController.b(false);
                    return;
                }

                if (MainCanvas.gameSceneController.currentSceneModeId == 96 && MainCanvas.gameSceneController.ap) {
                    MainCanvas.gameSceneController.k(MainCanvas.gameSceneController.aE);
                    MainCanvas.gameSceneController.ap = false;
                    return;
                }

                if (MainCanvas.gameSceneController.currentSceneModeId == 4 && MainCanvas.gameSceneController.bh) {
                    MainCanvas.gameSceneController.s(MainCanvas.gameSceneController.bg);
                    return;
                }

                if (MainCanvas.gameSceneController.currentSceneModeId == 120) {
                    MainCanvas.gameSceneController.t(this.mainCanvas.gunDongListUi.g());
                }
            }
        }

    }

    private static void b(DataInputStream var0) throws IOException {
        long var1 = var0.readLong();
        GlobalConfig.printStr("[FIGHT] 8206包 b(): 服务器fightId=" + var1 + " 本地v=" + GlobalStatus.v + " bq_1.g=" + FightModel.g);
        if (FightModel.g > 0 && GlobalStatus.v <= 0L) {
            GlobalStatus.v = var1;
            FightModel.g = -1;
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

                    MainCanvas.gameSceneController.overlayDialogController.a(var4);
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

                    MainCanvas.gameSceneController.overlayDialogController.a(var16);
                }
            }

            for (int var11 = 0; var11 < var8; ++var11) {
                MainCanvas.gameSceneController.overlayDialogController.a(var0.readUTF());
            }

            if (MainCanvas.gameSceneController.currentSceneModeId == 25 || MainCanvas.gameSceneController.currentSceneModeId == 18 || !GameSceneController.notInFighting()) {
                MainCanvas.gameSceneController.overlayDialogController.f = 1;
            }
        }

    }

    private void e() throws IOException {
        byte var1;
        if ((var1 = this.dis.readByte()) <= 0) {
            if (MainCanvas.gameSceneController != null) {
                MainCanvas.gameSceneController.a((bp_1[]) null);
            }

        } else {
            GlobalStatus.s = (short) this.dis.readByte();
            bp_1[] var2 = new bp_1[var1];
            byte var3 = 1;

            for (int var4 = 0; var4 < var1; ++var4) {
                var2[var4] = new bp_1();
                var2[var4].a(MainCanvas.gameSceneController, this.dis);
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

            if (MainCanvas.gameSceneController != null) {
                MainCanvas.gameSceneController.a(var2);
            }

        }
    }

    private void f() throws IOException {
        byte var1 = this.dis.readByte();
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
        MainCanvas.gameSceneController.am = null;
        MainCanvas.gameSceneController.al = null;
        if (GameSceneController.notInFighting()) {
            MainCanvas.pngUtil.a(MainCanvas.gameSceneController.f, GameSceneController.h, GameSceneController.i_1, true, false, 2109231);
            this.mainCanvas.pageStatus = this.mainCanvas.lastPageStatus = 7;
            MainCanvas.gameSceneController.sceneStateShadow = MainCanvas.gameSceneController.currentSceneModeId = 0;
        }

        if (var1 == 1) {
            this.mainCanvas.showTips("交易成功!");
        } else if (var1 == 0) {
            this.mainCanvas.showTips("交易取消!");
        } else {
            if (var1 == -1) {
                this.mainCanvas.showTips(this.dis.readUTF());
            }

        }
    }

    private static void c(DataInputStream var0) throws IOException {
        GlobalStatus.am(var0);
        MainCanvas.gameSceneController.l((byte) 1);
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

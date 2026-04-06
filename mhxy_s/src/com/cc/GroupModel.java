package com.cc;

import com.yinhan.kjava.main.MainCanvas;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class GroupModel {
    public GameSceneController a;
    public MainCanvas b;
    public String c;
    public String d;
    private long u;
    public String e;
    public String f;
    public int g;
    private int v = 0;
    public String h;
    private short[] w = new short[]{1919, 2147, 2150, 2149, 2148};
    private int[][] x;
    private int[][] y;
    private int[][] z;
    private short[] A = new short[]{1919, 2147, 2148};
    public int[] i = new int[3];
    public long j = 0L;
    private short B = 0;
    private short C = 0;
    private short D = 0;
    private short E = 0;
    public int[] k = null;
    public int[][] l;
    public int[][] m;
    public int[] n;
    public String o = "";
    public int p;
    public long q = 1000L;
    public long r = 1000L;
    public int s;
    public int t;

    public GroupModel(GameSceneController var1, MainCanvas var2) {
        this.a = var1;
        this.b = var2;
    }

    public final void a(int var1) {
        this.b.mixedUi.clear();
        this.b.mixedUi.setTitle("帮派");
        this.b.mixedUi.setDrawBackground(false);
        this.b.gunDongListUi.setValue((Image[]) null, GlobalConfig.BangPaiCaoZuo, (String[]) null, (String[]) null);
        this.b.gunDongListUi.a(var1);
        this.b.textPanel.setText(GlobalConfig.BangPaiShuoMing[var1], GlobalConfig.font2, (byte) 2);
        this.b.textPanel.setShuRuMoShi((byte) 1);
        this.b.bottomUi.a("选择");
        this.b.mixedUi.addChild((BaseUi) this.b.gunDongListUi);
        this.b.mixedUi.addChild((BaseUi) this.b.textPanel);
        this.b.mixedUi.addChild((BaseUi) this.b.bottomUi);
        this.b.mixedUi.layout(GlobalConfig.gameX, GlobalConfig.gameY, GlobalConfig.realWidth, GlobalConfig.realHigh);
        this.a.sceneSubState = 0;
        this.a.mainCanvasRef.pageStatus = this.a.mainCanvasRef.lastPageStatus;
        this.a.lastSceneModeId = this.a.currentSceneModeId = 41;
    }

    public final void b(int var1) {
        if (this.a.sceneSubState == 0) {
            if (this.b.mixedUi != null) {
                this.b.mixedUi.onClick(var1);
            }

            if (var1 == 1 || var1 == 514 || var1 == 4 || var1 == 520) {
                this.b.textPanel.setText(GlobalConfig.BangPaiShuoMing[this.b.gunDongListUi.g()], GlobalConfig.font2, (byte) 2);
                this.b.textPanel.setShuRuMoShi((byte) 1);
            }

            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    this.a.lastSceneModeId = this.a.currentSceneModeId = 0;
                    return;
                }
            } else {
                this.a.aA = this.b.gunDongListUi.h();
                this.a.aE = this.b.gunDongListUi.g();
                switch (this.a.aE) {
                    case 0:
                        this.a.mainCanvasRef.a((String) "输入帮派名称", (int) 0);
                        break;
                    case 1:
                        GlobalStatus.gQ = 1;
                        this.z();
                        break;
                    case 2:
                        this.a.mainCanvasRef.a((String) "输入招募金额", (int) 2);
                        break;
                    case 3:
                        GlobalStatus.gQ = 1;
                        this.A();
                        break;
                    case 4:
                        this.r();
                        break;
                    case 5:
                        this.a.sceneSubState = 1;
                        LoadingPage.h = 0;
                        break;
                    case 6:
                        this.a.sceneSubState = 2;
                        LoadingPage.h = 0;
                    default:
                        return;
                }
            }
        } else if (this.a.sceneSubState == 1) {
            if (var1 == 268435456 || var1 == 1073741824) {
                this.d();
                return;
            }

            if (var1 == 536870912) {
                this.a.sceneSubState = 0;
                return;
            }
        } else if (this.a.sceneSubState == 2) {
            if (var1 == 268435456 || var1 == 1073741824) {
                this.a.mainCanvasRef.a((String) "输入OK确认解散帮派", (int) 0);
                return;
            }

            if (var1 == 536870912) {
                this.a.sceneSubState = 0;
                return;
            }
        } else if (this.a.sceneSubState == 3) {
            if (var1 != 268435456 && var1 != 1073741824) {
                if (var1 == 536870912) {
                    this.a.sceneSubState = 0;
                }
            } else {
                byte[] var2;
                if ((var2 = NetPayloadBuilder.a((short) 4224, GlobalStatus.roleId_2, this.u)) == null) {
                    this.a.mainCanvasRef.showTips("获取上传指令数据错误!");
                    return;
                }

                MainCanvas.netUtils.sendPacket(new NetPacket((short) 4224, var2));
                this.a.mainCanvasRef.showPending((String) null);
            }
        }

    }

    private void z() {
        byte[] var1;
        if ((var1 = NetPayloadBuilder.g((short) 4198, GlobalStatus.roleId_2, (short) GlobalStatus.gQ)) != null) {
            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4198, var1));
            this.a.mainCanvasRef.showPending((String) null);
        } else {
            this.a.mainCanvasRef.showTips("获取上传指令数据错误!");
        }
    }

    public final void a(long var1) {
        this.u = var1;
        this.a.o();
    }

    public final void a() {
        this.a.npcActionList = LoadingPage.parseText("将交付" + this.u + "帮派基金作为招募费用，持续一周？", GlobalConfig.font2, 140, "\t");
        this.a.sceneSubState = 3;
        LoadingPage.h = 0;
    }

    private void A() {
        byte[] var1;
        if ((var1 = NetPayloadBuilder.j((short) 4225, GlobalStatus.roleId_2, (short) GlobalStatus.gQ)) != null) {
            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4225, var1));
            this.a.mainCanvasRef.showPending((String) null);
        } else {
            this.a.mainCanvasRef.showTips("获取上传指令数据错误!");
        }
    }

    public final void b() {
        this.b.mixedUi.clear();
        this.b.mixedUi.setTitle("等待响应");
        this.b.mixedUi.setDrawBackground(false);
        GunDongListUi var10000 = this.b.gunDongListUi;
        String[] var10002 = GlobalStatus.il;
        byte[] var1;
        String[] var2 = new String[(var1 = GlobalStatus.in).length];

        for (int var3 = 0; var3 < var2.length; ++var3) {
            var2[var3] = new String(var1[var3] + "人响应");
        }

        var10000.setValue((Image[]) null, var10002, (String[]) null, var2);
        this.b.textPanel.setText(GlobalStatus.im == null ? null : GlobalStatus.im[0], GlobalConfig.font2, (byte) 2);
        this.b.textPanel.setShuRuMoShi((byte) 1);
        this.b.bottomUi.a("响应");
        this.b.bottomUi.a(true);
        this.b.mixedUi.addChild((BaseUi) this.b.gunDongListUi);
        this.b.mixedUi.addChild((BaseUi) this.b.textPanel);
        this.b.mixedUi.addChild((BaseUi) this.b.bottomUi);
        this.b.mixedUi.layout(GlobalConfig.gameX, GlobalConfig.gameY, GlobalConfig.realWidth, GlobalConfig.realHigh);
        this.a.sceneSubState = 0;
        this.b.pageStatus = this.b.lastPageStatus;
        this.a.lastSceneModeId = this.a.currentSceneModeId = 42;
    }

    public final void c(int var1) {
        if (this.a.sceneSubState == 0) {
            if (this.b.mixedUi != null) {
                this.b.mixedUi.onClick(var1);
            }

            if (var1 == 1 || var1 == 514 || var1 == 520 || var1 == 4) {
                this.b.textPanel.setText(GlobalStatus.im == null ? null : GlobalStatus.im[this.b.gunDongListUi.g()], GlobalConfig.font2, (byte) 2);
                this.b.textPanel.setShuRuMoShi((byte) 1);
            }

            if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
                LoadingPage.a(80 + GlobalConfig.gameX, GlobalConfig.font2_h + 20 + this.b.gunDongListUi.i() * GlobalConfig.font2_h + GlobalConfig.gameY, GlobalStatus.io[this.b.gunDongListUi.g()] == 1 ? new String[]{"取消响应"} : new String[]{"响应"}, false);
                this.a.sceneSubState = 1;
                return;
            }

            if (var1 == 536870912) {
                GlobalStatus.gQ = 1;
                this.a(this.a.aE);
                return;
            }

            if (var1 == 1024) {
                if (GlobalStatus.gQ > 1 && GlobalStatus.gR == 1) {
                    if (GlobalStatus.gQ - 1 <= 1) {
                        GlobalStatus.gQ = 1;
                    } else {
                        --GlobalStatus.gQ;
                    }

                    this.z();
                    return;
                }

                if (GlobalStatus.gQ > 1 && GlobalStatus.gR == 0) {
                    if (GlobalStatus.gQ - 1 < 1) {
                        GlobalStatus.gQ = 1;
                    } else {
                        --GlobalStatus.gQ;
                    }

                    this.z();
                    return;
                }
            } else if (var1 == 2048) {
                if (GlobalStatus.gQ <= 1 && GlobalStatus.gR == 1) {
                    ++GlobalStatus.gQ;
                    this.z();
                    return;
                }

                if (GlobalStatus.gQ > 1 && GlobalStatus.gR == 1) {
                    ++GlobalStatus.gQ;
                    this.z();
                    return;
                }
            }
        } else if (this.a.sceneSubState == 1) {
            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    this.a.sceneSubState = 0;
                }
            } else if (LoadingPage.o == 0) {
                if (GlobalStatus.io[this.b.gunDongListUi.g()] == 1) {
                    byte[] var4;
                    if ((var4 = NetPayloadBuilder.x((short) 4243, GlobalStatus.roleId_2, GlobalStatus.ik[this.b.gunDongListUi.g()])) != null) {
                        NetPacket var5 = new NetPacket((short) 4243, var4);
                        MainCanvas.netUtils.sendPacket(var5);
                    } else {
                        this.b.showTips("获取上传指令数据错误!");
                    }

                    this.b.showPending((String) null);
                    return;
                }

                byte[] var2;
                if ((var2 = NetPayloadBuilder.x((short) 4199, GlobalStatus.roleId_2, GlobalStatus.ik[this.b.gunDongListUi.g()])) != null) {
                    NetPacket var3 = new NetPacket((short) 4199, var2);
                    MainCanvas.netUtils.sendPacket(var3);
                } else {
                    this.b.showTips("获取上传指令数据错误!");
                }

                this.b.showPending((String) null);
                return;
            }
        }

    }

    public final void c() {
        this.b.mixedUi.clear();
        this.b.mixedUi.setTitle("帮派招募");
        this.b.mixedUi.setDrawBackground(false);
        this.b.gunDongListUi.setValue((Image[]) null, GlobalStatus.iq, (String[]) null, (String[]) null);
        this.b.textPanel.setText(GlobalStatus.ir == null ? null : GlobalStatus.ir[0], GlobalConfig.font2, (byte) 2);
        this.b.textPanel.setShuRuMoShi((byte) 1);
        this.b.bottomUi.a("申请");
        this.b.bottomUi.a(true);
        this.b.mixedUi.addChild((BaseUi) this.b.gunDongListUi);
        this.b.mixedUi.addChild((BaseUi) this.b.textPanel);
        this.b.mixedUi.addChild((BaseUi) this.b.bottomUi);
        this.b.mixedUi.layout(GlobalConfig.gameX, GlobalConfig.gameY, GlobalConfig.realWidth, GlobalConfig.realHigh);
        this.a.sceneSubState = 0;
        this.b.pageStatus = this.b.lastPageStatus;
        this.a.lastSceneModeId = this.a.currentSceneModeId = 43;
    }

    public final void d(int var1) {
        if (this.a.sceneSubState == 0) {
            if (GlobalStatus.ip != null) {
                if (this.b.mixedUi == null) {
                    return;
                }

                this.b.mixedUi.onClick(var1);
                if (var1 == 1 || var1 == 514 || var1 == 520 || var1 == 4) {
                    this.b.textPanel.setText(GlobalStatus.ir == null ? null : GlobalStatus.ir[this.b.gunDongListUi.g()], GlobalConfig.font2, (byte) 2);
                    this.b.textPanel.setShuRuMoShi((byte) 1);
                }

                if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
                    LoadingPage.a(80 + GlobalConfig.gameX, GlobalConfig.font2_h + 20 + this.b.gunDongListUi.i() * GlobalConfig.font2_h + GlobalConfig.gameY, GlobalStatus.is[this.b.gunDongListUi.g()] == 1 ? new String[]{"取消申请"} : new String[]{"申请"}, false);
                    this.a.sceneSubState = 1;
                }
            }

            if (var1 == 536870912) {
                this.a(this.a.aE);
                return;
            }

            if (var1 == 1024) {
                if (GlobalStatus.gQ > 1 && GlobalStatus.gR == 1) {
                    if (GlobalStatus.gQ - 1 <= 1) {
                        GlobalStatus.gQ = 1;
                    } else {
                        --GlobalStatus.gQ;
                    }

                    this.A();
                    return;
                }

                if (GlobalStatus.gQ > 1 && GlobalStatus.gR == 0) {
                    if (GlobalStatus.gQ - 1 < 1) {
                        GlobalStatus.gQ = 1;
                    } else {
                        --GlobalStatus.gQ;
                    }

                    this.A();
                    return;
                }
            } else if (var1 == 2048) {
                if (GlobalStatus.gQ <= 1 && GlobalStatus.gR == 1) {
                    ++GlobalStatus.gQ;
                    this.A();
                    return;
                }

                if (GlobalStatus.gQ > 1 && GlobalStatus.gR == 1) {
                    ++GlobalStatus.gQ;
                    this.A();
                    return;
                }
            }
        } else if (this.a.sceneSubState == 1) {
            LoadingPage.b(var1);
            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    this.a.sceneSubState = 0;
                }
            } else if (LoadingPage.o == 0) {
                if (GlobalStatus.is[this.b.gunDongListUi.g()] == 1) {
                    String var2 = GlobalStatus.ip[this.b.gunDongListUi.g()];
                    byte[] var3;
                    if ((var3 = NetPayloadBuilder.l((short) 4242, GlobalStatus.roleId_2, var2)) == null) {
                        this.b.showTips("获取上传指令数据错误!");
                        return;
                    }

                    MainCanvas.netUtils.sendPacket(new NetPacket((short) 4242, var3));
                    this.b.showPending((String) null);
                } else {
                    String var4 = GlobalStatus.ip[this.b.gunDongListUi.g()];
                    byte[] var5;
                    if ((var5 = NetPayloadBuilder.l((short) 4226, GlobalStatus.roleId_2, var4)) == null) {
                        this.b.showTips("获取上传指令数据错误!");
                        return;
                    }

                    MainCanvas.netUtils.sendPacket(new NetPacket((short) 4226, var5));
                    this.b.showPending((String) null);
                }
            }
        }

    }

    public final void d() {
        byte[] var1;
        if ((var1 = NetPayloadBuilder.m((short) 4209, GlobalStatus.roleId_2)) != null) {
            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4209, var1));
            this.b.showPending((String) null);
        } else {
            this.b.showTips("获取上传指令数据错误!");
        }
    }

    public final void a(boolean var1) {
        this.b.mixedUi.clear();
        this.b.mixedUi.setTitle("帮派管理");
        this.b.mixedUi.setDrawBackground(false);
        this.b.gunDongListUi.setValue((Image[]) null, GlobalConfig.BangPaiGuanLi, (String[]) null, (String[]) null);
        if (var1) {
            this.b.gunDongListUi.a(this.a.aA, this.a.aE);
            this.b.textPanel.setText(GlobalConfig.BangPaiGuanLiCaoZuo[this.a.aE], GlobalConfig.font2, (byte) 2);
        } else {
            this.b.textPanel.setText(GlobalConfig.BangPaiGuanLiCaoZuo[0], GlobalConfig.font2, (byte) 2);
        }

        this.b.textPanel.setShuRuMoShi((byte) 1);
        this.b.bottomUi.a("确定");
        this.b.mixedUi.addChild((BaseUi) this.b.gunDongListUi);
        this.b.mixedUi.addChild((BaseUi) this.b.textPanel);
        this.b.mixedUi.addChild((BaseUi) this.b.bottomUi);
        this.b.mixedUi.layout(GlobalConfig.gameX, GlobalConfig.gameY, GlobalConfig.realWidth, GlobalConfig.realHigh);
        this.a.sceneSubState = 0;
        this.b.pageStatus = this.b.lastPageStatus;
        this.a.lastSceneModeId = this.a.currentSceneModeId = 45;
    }

    public final void e(int var1) {
        if (this.a.sceneSubState == 0) {
            if (this.b.mixedUi != null) {
                this.b.mixedUi.onClick(var1);
            }

            if (var1 == 1 || var1 == 514 || var1 == 520 || var1 == 4) {
                this.b.textPanel.setText(GlobalConfig.BangPaiGuanLiCaoZuo[this.b.gunDongListUi.g()], GlobalConfig.font2, (byte) 2);
                this.b.textPanel.setShuRuMoShi((byte) 1);
            }

            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    this.a.aA = 0;
                    this.a.aE = 0;
                    this.a.lastSceneModeId = this.a.currentSceneModeId = 0;
                }
            } else {
                this.a.aA = this.b.gunDongListUi.h();
                this.a.aE = this.b.gunDongListUi.g();
                switch (this.a.aE) {
                    case 0:
                        this.b.a((String) "输入帮派新宗旨", (int) 0);
                        break;
                    case 1:
                        GlobalStatus.gQ = 1;
                        this.e();
                        break;
                    case 2:
                        this.g();
                        break;
                    case 3:
                        GlobalStatus.gQ = 1;
                        this.j(1);
                        break;
                    case 4:
                        GlobalStatus.gQ = 1;
                        this.g(1);
                        break;
                    case 5:
                        this.a((byte) 1);
                    default:
                        return;
                }
            }
        }

    }

    public final void e() {
        byte[] var1;
        if ((var1 = NetPayloadBuilder.i((short) 4227, GlobalStatus.roleId_2, (short) GlobalStatus.gQ)) != null) {
            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4227, var1));
            this.b.showPending((String) null);
        } else {
            this.b.showTips("获取上传指令数据错误!");
        }
    }

    public final void f() {
        this.b.mixedUi.clear();
        this.b.mixedUi.setTitle("申请列表");
        this.b.mixedUi.setDrawBackground(false);
        GunDongListUi var10000 = this.b.gunDongListUi;
        String[] var10002 = GlobalStatus.iu;
        short[] var1 = GlobalStatus.iv;
        String[] var2 = null;
        if (var1 != null) {
            var2 = new String[var1.length];

            for (int var3 = 0; var3 < var1.length; ++var3) {
                var2[var3] = new String(var1[var3] + "级");
            }
        }

        var10000.setValue((Image[]) null, var10002, var2, GlobalStatus.iw);
        this.b.bottomUi.a("确定");
        this.b.bottomUi.a(true);
        this.b.mixedUi.addChild((BaseUi) this.b.gunDongListUi);
        this.b.mixedUi.addChild((BaseUi) this.b.bottomUi);
        this.b.mixedUi.layout(GlobalConfig.gameX, GlobalConfig.gameY, GlobalConfig.realWidth, GlobalConfig.realHigh);
        this.a.sceneSubState = 0;
        this.b.pageStatus = this.b.lastPageStatus;
        this.a.lastSceneModeId = this.a.currentSceneModeId = 46;
    }

    public final void f(int var1) {
        if (this.a.sceneSubState == 0) {
            if (this.b.mixedUi != null) {
                this.b.mixedUi.onClick(var1);
            }

            if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
                LoadingPage.a(80 + GlobalConfig.gameX, GlobalConfig.font2_h + 20 + this.b.gunDongListUi.i() * GlobalConfig.font2_h + GlobalConfig.gameY, new String[]{"详情", "接纳", "拒绝"}, false);
                this.a.sceneSubState = 1;
                return;
            }

            if (var1 == 536870912) {
                this.a(true);
                return;
            }

            if (var1 == 1024) {
                if (GlobalStatus.gQ > 1 && GlobalStatus.gR == 1) {
                    if (GlobalStatus.gQ - 1 <= 1) {
                        GlobalStatus.gQ = 1;
                    } else {
                        --GlobalStatus.gQ;
                    }

                    this.e();
                    return;
                }

                if (GlobalStatus.gQ > 1 && GlobalStatus.gR == 0) {
                    if (GlobalStatus.gQ - 1 < 1) {
                        GlobalStatus.gQ = 1;
                    } else {
                        --GlobalStatus.gQ;
                    }

                    this.e();
                    return;
                }
            } else if (var1 == 2048) {
                if (GlobalStatus.gQ <= 1 && GlobalStatus.gR == 1) {
                    ++GlobalStatus.gQ;
                    this.e();
                    return;
                }

                if (GlobalStatus.gQ > 1 && GlobalStatus.gR == 1) {
                    ++GlobalStatus.gQ;
                    this.e();
                    return;
                }
            }
        } else if (this.a.sceneSubState == 1) {
            LoadingPage.b(var1);
            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    this.a.sceneSubState = 0;
                    return;
                }
            } else if (LoadingPage.o == 0) {
                if (GlobalStatus.ix[this.b.gunDongListUi.g()] != 1) {
                    this.b.showTips("对方不在线");
                    return;
                }

                byte[] var2;
                if ((var2 = NetPayloadBuilder.a((short) 4110, GlobalStatus.roleId_2, GlobalStatus.it[this.b.gunDongListUi.g()], (byte) 0)) == null) {
                    this.b.showTips("获取上传指令数据错误!");
                    return;
                }

                MainCanvas.netUtils.sendPacket(new NetPacket((short) 4110, var2));
                this.b.showPending((String) null);
            } else if (LoadingPage.o == 1) {
                byte[] var3;
                if ((var3 = NetPayloadBuilder.m((short) 4228, GlobalStatus.roleId_2, GlobalStatus.it[this.b.gunDongListUi.g()])) == null) {
                    this.b.showTips("获取上传指令数据错误!");
                    return;
                }

                MainCanvas.netUtils.sendPacket(new NetPacket((short) 4228, var3));
                this.b.showPending((String) null);
            } else if (LoadingPage.o == 2) {
                byte[] var4;
                if ((var4 = NetPayloadBuilder.m((short) 4229, GlobalStatus.roleId_2, GlobalStatus.it[this.b.gunDongListUi.g()])) == null) {
                    this.b.showTips("获取上传指令数据错误!");
                    return;
                }

                MainCanvas.netUtils.sendPacket(new NetPacket((short) 4229, var4));
                this.b.showPending((String) null);
            }
        } else if (this.a.sceneSubState == 2) {
            this.a.T.onClick(var1);
            if (var1 == 268435456 || var1 == 536870912 || var1 == 1073741824 || var1 == 517) {
                this.a.T.clear();
                this.f();
            }
        }

    }

    public final void g() {
        this.b.a((String) "输入玩家名称", (int) 0);
    }

    public final void h() {
        if (this.f != null) {
            byte[] var1;
            if ((var1 = NetPayloadBuilder.j((short) 4201, GlobalStatus.roleId_2, this.f)) != null) {
                NetPacket var2 = new NetPacket((short) 4201, var1);
                MainCanvas.netUtils.sendPacket(var2);
            } else {
                this.b.showTips("获取上传指令数据错误!");
            }

            this.b.showPending((String) null);
        }

    }

    public final void g(int var1) {
        this.g = var1;
        byte[] var2;
        if ((var2 = NetPayloadBuilder.h((short) 4212, GlobalStatus.roleId_2, (short) GlobalStatus.gQ)) != null) {
            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4212, var2));
            this.b.showPending((String) null);
        } else {
            this.b.showTips("获取上传指令数据错误!");
        }
    }

    private void B() {
        byte[] var1;
        if ((var1 = NetPayloadBuilder.o((short) 4211, GlobalStatus.roleId_2)) != null) {
            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4211, var1));
            this.b.showPending((String) null);
        } else {
            this.b.showTips("获取上传指令数据错误!");
        }
    }

    private void a(byte var1) {
        byte[] var2;
        if ((var2 = NetPayloadBuilder.k((short) 4263, GlobalStatus.roleId_2, (byte) var1)) != null) {
            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4263, var2));
            this.b.showPending((String) null);
        } else {
            this.b.showTips("获取上传指令数据错误!");
        }
    }

    public final void h(int var1) {
        this.b.mixedUi.clear();
        this.b.mixedUi.setTitle("帮派信息");
        this.b.mixedUi.setDrawBackground(true);
        this.b.topUi.a(new String[]{"成员", "帮派", "外交", "帮战"});
        this.b.mixedUi.addChild((BaseUi) this.b.topUi);
        if (var1 == 0) {
            this.b.topUi.a = 0;
            this.b.gunDongListUi.setValue((Image[]) null, GlobalStatus.iz, GlobalStatus.iA, a(GlobalStatus.iC, "战力"));
            this.b.gunDongListUi.setIcon(null);
            this.b.gunDongListUi.setIcon2(null);
            this.b.gunDongListUi.a(GlobalStatus.iG);
            this.b.bottomUi.a("确定");
            this.b.bottomUi.a(true);
            this.b.mixedUi.addChild((BaseUi) this.b.gunDongListUi);
            this.b.mixedUi.addChild((BaseUi) this.b.bottomUi);
            this.b.mixedUi.layout(GlobalConfig.gameX, GlobalConfig.gameY, GlobalConfig.realWidth, GlobalConfig.realHigh);
        } else if (var1 == 1) {
            this.b.topUi.a = 1;
            this.b.textPanel.setText(GlobalStatus.iH, GlobalConfig.font2, (byte) 2);
            this.b.mixedUi.addChild((BaseUi) this.b.textPanel);
            this.b.mixedUi.layout(GlobalConfig.gameX, GlobalConfig.gameY, GlobalConfig.realWidth, GlobalConfig.realHigh);
        } else if (var1 == 2) {
            this.b.topUi.a = 2;
            String[] var4 = null;
            int[] var2 = null;
            if (GlobalStatus.jY != null && GlobalStatus.jY.length > 0) {
                var4 = new String[GlobalStatus.jY.length];
                var2 = new int[GlobalStatus.jY.length];

                for (int var3 = 0; var3 < var4.length; ++var3) {
                    var4[var3] = GlobalStatus.d(GlobalStatus.ka[var3]);
                    if (GlobalStatus.ka[var3] == 2) {
                        var2[var3] = 12845056;
                    } else if (GlobalStatus.ka[var3] == 3) {
                        var2[var3] = 16711680;
                    } else {
                        var2[var3] = 16776960;
                    }
                }
            }

            this.b.gunDongListUi.setValue((Image[]) null, GlobalStatus.jZ, (String[]) null, var4);
            this.b.gunDongListUi.setTopTips("搜索...");
            this.b.gunDongListUi.a(var2);
            this.b.gunDongListUi.a("帮派搜索", 1);
            this.b.bottomUi.a("确定");
            this.b.bottomUi.a(true);
            this.b.mixedUi.addChild((BaseUi) this.b.gunDongListUi);
            this.b.mixedUi.addChild((BaseUi) this.b.bottomUi);
            this.b.mixedUi.layout(GlobalConfig.gameX, GlobalConfig.gameY, GlobalConfig.realWidth, GlobalConfig.realHigh);
            LoadingPage.l = 0;
        } else if (var1 == 3) {
            this.b.topUi.a = 3;
            this.b.textPanel.setText(GlobalStatus.kl, GlobalConfig.font2, (byte) 2);
            this.b.bottomUi.a("确定");
            this.b.bottomUi.a(true);
            this.b.mixedUi.addChild((BaseUi) this.b.textPanel);
            this.b.mixedUi.addChild((BaseUi) this.b.bottomUi);
            this.b.mixedUi.layout(GlobalConfig.gameX, GlobalConfig.gameY, GlobalConfig.realWidth, GlobalConfig.realHigh);
        }

        this.a.sceneSubState = 0;
        this.b.pageStatus = this.b.lastPageStatus;
        this.a.lastSceneModeId = this.a.currentSceneModeId = 47;
    }

    public final void i(int var1) {
        if (this.a.sceneSubState == 0) {
            if (this.b.topUi.a == 0) {
                if (this.b.mixedUi != null) {
                    this.b.mixedUi.onClick(var1);
                }

                if (GlobalStatus.iy != null) {
                    if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                        if (var1 == 1024) {
                            if (GlobalStatus.gQ > 1 && GlobalStatus.gR == 1) {
                                if (GlobalStatus.gQ - 1 <= 1) {
                                    GlobalStatus.gQ = 1;
                                } else {
                                    --GlobalStatus.gQ;
                                }

                                this.g(this.g);
                            } else if (GlobalStatus.gQ > 1 && GlobalStatus.gR == 0) {
                                if (GlobalStatus.gQ - 1 < 1) {
                                    GlobalStatus.gQ = 1;
                                } else {
                                    --GlobalStatus.gQ;
                                }

                                this.g(this.g);
                            }
                        } else if (var1 == 2048) {
                            if (GlobalStatus.gQ <= 1 && GlobalStatus.gR == 1) {
                                ++GlobalStatus.gQ;
                                this.g(this.g);
                            } else if (GlobalStatus.gQ > 1 && GlobalStatus.gR == 1) {
                                ++GlobalStatus.gQ;
                                this.g(this.g);
                            }
                        }
                    } else if (GlobalStatus.iD[this.b.gunDongListUi.g()] == 1) {
                        if (!GlobalStatus.iy[this.b.gunDongListUi.g()].equals(GlobalStatus.roleId_2)) {
                            LoadingPage.a(80 + GlobalConfig.gameX, 2 * GlobalConfig.font2_h + 20 + this.b.gunDongListUi.i() * GlobalConfig.font2_h + GlobalConfig.gameY, new String[]{"查看", "私聊", "组队", "交易", "好友", "黑名单"}, false);
                            this.a.sceneSubState = 1;
                            this.a.aE = this.b.gunDongListUi.g();
                            this.a.aA = this.b.gunDongListUi.h();
                        }
                    } else if (!GlobalStatus.iy[this.b.gunDongListUi.g()].equals(GlobalStatus.roleId_2)) {
                        LoadingPage.a(80 + GlobalConfig.gameX, 2 * GlobalConfig.font2_h + 20 + this.b.gunDongListUi.i() * GlobalConfig.font2_h + GlobalConfig.gameY, new String[]{"查看"}, false);
                        this.a.sceneSubState = 1;
                        this.a.aE = this.b.gunDongListUi.g();
                        this.a.aA = this.b.gunDongListUi.h();
                    }
                }

                if (var1 != 2 && var1 != 518) {
                    if (var1 == 8 || var1 == 516) {
                        GlobalStatus.gQ = 1;
                        this.C();
                    }
                } else {
                    this.B();
                }
            } else if (this.b.topUi.a == 1) {
                if (this.b.mixedUi != null) {
                    this.b.mixedUi.onClick(var1);
                }

                if (var1 != 8 && var1 != 516) {
                    if (var1 == 2 || var1 == 518) {
                        GlobalStatus.gQ = 1;
                        this.p = 1;
                        this.o = "";
                        this.a(this.o);
                    }
                } else {
                    GlobalStatus.gQ = 1;
                    this.g(this.g);
                }
            } else if (this.b.topUi.a == 2) {
                if (this.b.mixedUi != null) {
                    this.b.mixedUi.onClick(var1);
                }

                if (var1 != 8 && var1 != 516) {
                    if (var1 == 2 || var1 == 518) {
                        GlobalStatus.gQ = 1;
                        this.C();
                        this.h(3);
                    }
                } else {
                    this.B();
                }

                if (var1 == 1 || var1 == 514 || var1 == 520 || var1 == 4) {
                    boolean var2 = this.b.gunDongListUi.g() == this.b.gunDongListUi.h();
                    this.b.gunDongListUi.a(var2 ? "帮派搜索" : w(this.b.gunDongListUi.g() - 1), 1);
                }

                if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                    if (var1 == 1024) {
                        if (GlobalStatus.gQ > 1 && GlobalStatus.gR == 1) {
                            if (GlobalStatus.gQ - 1 <= 1) {
                                GlobalStatus.gQ = 1;
                            } else {
                                --GlobalStatus.gQ;
                            }

                            this.a(this.o);
                        } else if (GlobalStatus.gQ > 1 && GlobalStatus.gR == 0) {
                            if (GlobalStatus.gQ - 1 < 1) {
                                GlobalStatus.gQ = 1;
                            } else {
                                --GlobalStatus.gQ;
                            }

                            this.a(this.o);
                        }
                    } else if (var1 == 2048) {
                        if (GlobalStatus.gQ <= 1 && GlobalStatus.gR == 1) {
                            ++GlobalStatus.gQ;
                            this.a(this.o);
                        } else if (GlobalStatus.gQ > 1 && GlobalStatus.gR == 1) {
                            ++GlobalStatus.gQ;
                            this.a(this.o);
                        }
                    }
                } else {
                    this.a.aA = this.b.gunDongListUi.h();
                    this.a.aE = this.b.gunDongListUi.g();
                    if (this.b.gunDongListUi.g() == this.b.gunDongListUi.h()) {
                        this.b.a((String) "请输入要搜索的帮派名称", (int) 0);
                    } else if (GlobalStatus.jY != null) {
                        LoadingPage.a(80 + GlobalConfig.gameX, 2 * GlobalConfig.font2_h + 20 + this.b.gunDongListUi.i() * GlobalConfig.font2_h + GlobalConfig.gameY, new String[]{"查看", "外交", "宣战"}, true);
                        this.a.sceneSubState = 7;
                    }
                }
            } else if (this.b.topUi.a == 3) {
                if (this.b.mixedUi != null) {
                    this.b.mixedUi.onClick(var1);
                }

                if (var1 != 8 && var1 != 516) {
                    if (var1 != 2 && var1 != 518) {
                        if (var1 == 1024) {
                            if (GlobalStatus.gQ > 1 && GlobalStatus.gR == 1) {
                                if (GlobalStatus.gQ - 1 <= 1) {
                                    GlobalStatus.gQ = 1;
                                } else {
                                    --GlobalStatus.gQ;
                                }

                                this.C();
                            } else if (GlobalStatus.gQ > 1 && GlobalStatus.gR == 0) {
                                if (GlobalStatus.gQ - 1 < 1) {
                                    GlobalStatus.gQ = 1;
                                } else {
                                    --GlobalStatus.gQ;
                                }

                                this.C();
                            }
                        } else if (var1 == 2048) {
                            if (GlobalStatus.gQ <= 1 && GlobalStatus.gR == 1) {
                                ++GlobalStatus.gQ;
                                this.C();
                            } else if (GlobalStatus.gQ > 1 && GlobalStatus.gR == 1) {
                                ++GlobalStatus.gQ;
                                this.C();
                            }
                        }
                    } else {
                        GlobalStatus.gQ = 1;
                        this.g(this.g);
                    }
                } else {
                    GlobalStatus.gQ = 1;
                    this.p = 1;
                    this.o = "";
                    this.a(this.o);
                }
            } else if (this.b.topUi.a == 4) {
                if (this.b.mixedUi != null) {
                    this.b.mixedUi.onClick(var1);
                }

                if (var1 == 8 || var1 == 516) {
                    GlobalStatus.gQ = 1;
                    this.C();
                }
            }

            if (var1 == 536870912) {
                this.o = "";
                GlobalStatus.gQ = 1;
                if (this.g == 1) {
                    this.a(true);
                    return;
                }

                if (this.g == 0) {
                    this.a.k();
                    this.a.c((int) 1);
                    return;
                }
            }
        } else if (this.a.sceneSubState == 1) {
            if (this.b.liaoTian != null && this.b.resourceLoaded) {
                this.a.aQ = GlobalStatus.iz[this.b.gunDongListUi.g()];
                this.a.a((String) GlobalStatus.iy[this.b.gunDongListUi.g()], (byte) 4);
                this.a.sceneSubState = 0;
                this.b.showTips("聊天消息已发送!");
            }

            LoadingPage.b(var1);
            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    this.a.sceneSubState = 0;
                    return;
                }
            } else {
                if (LoadingPage.o == 0) {
                    LoadingPage.a(80 + GlobalConfig.gameX, 2 * GlobalConfig.font2_h + 20 + this.b.gunDongListUi.i() * GlobalConfig.font2_h + GlobalConfig.gameY, new String[]{"属性", "装备"}, false);
                    this.a.sceneSubState = 2;
                    return;
                }

                if (LoadingPage.o == 1) {
                    this.a.aS = GlobalStatus.iy[this.b.gunDongListUi.g()];
                    this.a.aT = 4;
                    this.b.a((String) "聊天", (int) 0);
                    return;
                }

                if (LoadingPage.o == 2) {
                    if (GlobalStatus.bs == -1) {
                        LoadingPage.a(80 + GlobalConfig.gameX, 2 * GlobalConfig.font2_h + 20 + this.b.gunDongListUi.i() * GlobalConfig.font2_h + GlobalConfig.gameY, new String[]{"自由", "跟随"}, false);
                        this.a.sceneSubState = 6;
                        return;
                    }

                    this.a.a(GlobalStatus.followStatus, GlobalStatus.iy[this.b.gunDongListUi.g()]);
                    return;
                }

                if (LoadingPage.o == 3) {
                    LoadingPage.a(80 + GlobalConfig.gameX, 2 * GlobalConfig.font2_h + 20 + this.b.gunDongListUi.i() * GlobalConfig.font2_h + GlobalConfig.gameY, new String[]{"物品", "宠物"}, false);
                    this.a.sceneSubState = 5;
                    return;
                }

                if (LoadingPage.o == 4) {
                    this.a.a(GlobalStatus.iy[this.b.gunDongListUi.g()]);
                    this.a.sceneSubState = 0;
                    return;
                }

                if (LoadingPage.o == 5) {
                    this.a.b(GlobalStatus.iy[this.b.gunDongListUi.g()]);
                    this.a.sceneSubState = 0;
                    return;
                }
            }
        } else if (this.a.sceneSubState == 2) {
            LoadingPage.b(var1);
            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    if (GlobalStatus.iD[this.b.gunDongListUi.g()] == 1) {
                        LoadingPage.a(80 + GlobalConfig.gameX, 2 * GlobalConfig.font2_h + 20 + this.b.gunDongListUi.i() * GlobalConfig.font2_h + GlobalConfig.gameY, new String[]{"查看", "私聊", "组队", "交易", "好友", "黑名单"}, false);
                    } else {
                        LoadingPage.a(80 + GlobalConfig.gameX, 2 * GlobalConfig.font2_h + 20 + this.b.gunDongListUi.i() * GlobalConfig.font2_h + GlobalConfig.gameY, new String[]{"查看"}, false);
                    }

                    this.a.sceneSubState = 1;
                    return;
                }
            } else if (LoadingPage.o == 0) {
                byte[] var6;
                if ((var6 = NetPayloadBuilder.a((short) 4110, GlobalStatus.roleId_2, GlobalStatus.iy[this.b.gunDongListUi.g()], (byte) 1)) == null) {
                    this.b.showTips("获取上传指令数据错误!");
                    return;
                }

                MainCanvas.netUtils.sendPacket(new NetPacket((short) 4110, var6));
                this.b.showPending((String) null);
            } else if (LoadingPage.o == 1) {
                byte[] var7;
                if ((var7 = NetPayloadBuilder.b((short) 4111, GlobalStatus.roleId_2, GlobalStatus.iy[this.b.gunDongListUi.g()])) == null) {
                    this.b.showTips("获取上传指令数据错误!");
                    return;
                }

                MainCanvas.netUtils.sendPacket(new NetPacket((short) 4111, var7));
                this.b.showPending((String) null);
            }
        } else if (this.a.sceneSubState == 3) {
            this.a.T.onClick(var1);
            if (var1 == 268435456 || var1 == 536870912) {
                this.a.T.clear();
                this.a.sceneSubState = 2;
                return;
            }
        } else if (this.a.sceneSubState == 4) {
            this.a.a(GlobalStatus.cJ);
            this.a.g(var1);
            if (var1 == 536870912) {
                if (this.a.sceneSubMode == 1) {
                    this.a.T.clear();
                    this.a.sceneSubMode = 0;
                    return;
                }

                if (GlobalStatus.cJ != null) {
                    GlobalStatus.o();
                }

                GameSceneController.q = null;
                this.a.al = null;
                this.a.sceneSubState = 2;
                MainCanvas.pngUtil.a(this.a.f, GameSceneController.h, GameSceneController.i_1, true, false, 1009050);
                return;
            }
        } else if (this.a.sceneSubState == 5) {
            LoadingPage.b(var1);
            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    LoadingPage.a(80 + GlobalConfig.gameX, 2 * GlobalConfig.font2_h + 20 + this.b.gunDongListUi.i() * GlobalConfig.font2_h + GlobalConfig.gameY, new String[]{"查看", "私聊", "组队", "交易", "好友", "黑名单"}, false);
                    LoadingPage.o = 3;
                    this.a.sceneSubState = 1;
                    return;
                }
            } else {
                byte[] var8;
                if ((var8 = NetPayloadBuilder.b((short) 4124, GlobalStatus.roleId_2, GlobalStatus.iy[this.b.gunDongListUi.g()], (byte) ((byte) LoadingPage.o))) == null) {
                    this.b.showTips("获取上传指令数据错误!");
                    return;
                }

                MainCanvas.netUtils.sendPacket(new NetPacket((short) 4124, var8));
                this.b.showPending((String) null);
            }
        } else if (this.a.sceneSubState == 6) {
            LoadingPage.b(var1);
            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    LoadingPage.a(80 + GlobalConfig.gameX, 2 * GlobalConfig.font2_h + 20 + this.b.gunDongListUi.i() * GlobalConfig.font2_h + GlobalConfig.gameY, new String[]{"查看", "私聊", "组队", "交易", "好友", "黑名单"}, false);
                    LoadingPage.o = 2;
                    this.a.sceneSubState = 1;
                    return;
                }
            } else {
                var1 = LoadingPage.o == 0 ? 1 : 0;
                if (GlobalStatus.bs == 0) {
                    this.b.showTips("队员不能发送组队邀请！");
                } else if (GlobalStatus.bs == 1 && GlobalStatus.teamBonus != null && GlobalStatus.teamBonus.length >= 3) {
                    this.b.showTips("队伍已满，无法邀请！");
                } else {
                    byte[] var4;
                    if ((var4 = NetPayloadBuilder.a((short) 4112, GlobalStatus.roleId_2, GlobalStatus.iy[this.b.gunDongListUi.g()], (short) ((short) var1))) == null) {
                        this.b.showTips("获取上传指令数据错误!");
                        return;
                    }

                    NetPacket var5 = new NetPacket((short) 4112, var4);
                    MainCanvas.netUtils.sendPacket(var5);
                    this.a.sceneSubState = 0;
                }
            }
        } else if (this.a.sceneSubState == 7) {
            LoadingPage.b(var1);
            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    this.a.sceneSubState = 0;
                    return;
                }
            } else {
                this.b.aw = LoadingPage.o;
                if (LoadingPage.o == 0) {
                    this.b(GlobalStatus.jY[this.b.gunDongListUi.g() - 1]);
                    return;
                }

                if (LoadingPage.o == 1) {
                    LoadingPage.a(80 + GlobalConfig.gameX, 2 * GlobalConfig.font2_h + 20 + this.b.gunDongListUi.i() * GlobalConfig.font2_h + GlobalConfig.gameY, new String[]{"中立", "敌对"}, true);
                    this.a.sceneSubState = 8;
                    return;
                }

                if (LoadingPage.o == 2) {
                    this.a.sceneSubState = 9;
                    LoadingPage.h = 0;
                    return;
                }
            }
        } else if (this.a.sceneSubState == 8) {
            LoadingPage.b(var1);
            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    this.a.sceneSubState = 0;
                    return;
                }
            } else {
                if (LoadingPage.o == 0) {
                    this.a((byte) 1, GlobalStatus.jY[this.b.gunDongListUi.g() - 1]);
                    return;
                }

                if (LoadingPage.o == 1) {
                    this.a((byte) 2, GlobalStatus.jY[this.b.gunDongListUi.g() - 1]);
                    return;
                }
            }
        } else if (this.a.sceneSubState == 9) {
            if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
                this.b.a((String) "输入OK确认宣战", (int) 0);
                return;
            }

            if (var1 == 536870912) {
                this.a.sceneSubState = 0;
            }
        }

    }

    public final void j(int var1) {
        this.g = var1;
        byte[] var2;
        if ((var2 = NetPayloadBuilder.h((short) 4240, GlobalStatus.roleId_2, (short) GlobalStatus.gQ)) != null) {
            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4240, var2));
        } else {
            this.b.showTips("获取上传指令数据错误!");
        }
    }

    public final void i() {
        this.b.mixedUi.clear();
        this.b.mixedUi.setTitle("成员列表");
        this.b.mixedUi.setDrawBackground(false);
        this.b.gunDongListUi.setValue((Image[]) null, GlobalStatus.iz, GlobalStatus.iA, a(GlobalStatus.iB, "功勋"));
        //展示超Q？
//      this.b.gunDongListUi.setIcon(GlobalStatus.aC == 1 ? GlobalStatus.iE : null);
        this.b.gunDongListUi.setIcon((short[]) null);
        this.b.gunDongListUi.setIcon2(null);
        this.b.gunDongListUi.a(GlobalStatus.iG);
        this.b.bottomUi.a("任免");
        this.b.bottomUi.a(true);
        this.b.mixedUi.addChild((BaseUi) this.b.gunDongListUi);
        this.b.mixedUi.addChild((BaseUi) this.b.bottomUi);
        this.b.mixedUi.layout(GlobalConfig.gameX, GlobalConfig.gameY, GlobalConfig.realWidth, GlobalConfig.realHigh);
        this.a.sceneSubState = 0;
        this.b.pageStatus = this.b.lastPageStatus;
        this.a.lastSceneModeId = this.a.currentSceneModeId = 48;
    }

    private static String[] a(int[] var0, String var1) {
        String[] var2 = null;
        if (var0 != null) {
            var2 = new String[var0.length];

            for (int var3 = 0; var3 < var0.length; ++var3) {
                var2[var3] = new String("" + var0[var3] + var1);
            }
        }

        return var2;
    }

    public final void k(int var1) {
        if (this.a.sceneSubState == 0) {
            if (GlobalStatus.iy != null) {
                if (this.b.mixedUi != null) {
                    this.b.mixedUi.onClick(var1);
                }

                if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
                    LoadingPage.a(80 + GlobalConfig.gameX, GlobalConfig.font2_h + 20 + this.b.gunDongListUi.i() * GlobalConfig.font2_h + GlobalConfig.gameY, new String[]{"任免", "开除"}, false);
                    this.a.sceneSubState = 1;
                    this.v = this.b.gunDongListUi.g();
                }
            }

            if (var1 == 536870912) {
                if (this.g == 1) {
                    this.a(true);
                    return;
                }

                if (this.g == 0) {
                    this.a.k();
                    this.a.c((int) 1);
                    return;
                }
            } else if (var1 == 1024) {
                if (GlobalStatus.gQ > 1 && GlobalStatus.gR == 1) {
                    if (GlobalStatus.gQ - 1 <= 1) {
                        GlobalStatus.gQ = 1;
                    } else {
                        --GlobalStatus.gQ;
                    }

                    this.j(this.g);
                    return;
                }

                if (GlobalStatus.gQ > 1 && GlobalStatus.gR == 0) {
                    if (GlobalStatus.gQ - 1 < 1) {
                        GlobalStatus.gQ = 1;
                    } else {
                        --GlobalStatus.gQ;
                    }

                    this.j(this.g);
                    return;
                }
            } else if (var1 == 2048) {
                if (GlobalStatus.gQ <= 1 && GlobalStatus.gR == 1) {
                    ++GlobalStatus.gQ;
                    this.j(this.g);
                    return;
                }

                if (GlobalStatus.gQ > 1 && GlobalStatus.gR == 1) {
                    ++GlobalStatus.gQ;
                    this.j(this.g);
                    return;
                }
            }
        } else if (this.a.sceneSubState == 1) {
            LoadingPage.b(var1);
            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    this.a.sceneSubState = 0;
                    return;
                }
            } else if (LoadingPage.o == 0) {
                byte[] var3;
                if ((var3 = NetPayloadBuilder.p((short) 4241, GlobalStatus.roleId_2)) == null) {
                    this.b.showTips("获取上传指令数据错误!");
                    return;
                }

                MainCanvas.netUtils.sendPacket(new NetPacket((short) 4241, var3));
                this.b.showPending((String) null);
            } else if (LoadingPage.o == 1) {
                this.a.sceneSubState = 3;
                LoadingPage.h = 0;
                return;
            }
        } else if (this.a.sceneSubState == 2) {
            if (this.b.mixedUi != null) {
                this.b.mixedUi.onClick(var1);
            }

            if (var1 == 1 || var1 == 514 || var1 == 520 || var1 == 4) {
                this.b.textPanel.setText(GlobalStatus.je[this.b.gunDongListUi.g()], GlobalConfig.font2, (byte) 2);
                this.b.textPanel.setShuRuMoShi((byte) 1);
            }

            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    this.i();
                    return;
                }
            } else {
                String var10001 = GlobalStatus.iy[this.v];
                byte var2 = GlobalStatus.jc[this.b.gunDongListUi.g()];
                String var4 = var10001;
                byte[] var5;
                if ((var5 = NetPayloadBuilder.d((short) 4217, GlobalStatus.roleId_2, var4, (byte) var2)) == null) {
                    this.b.showTips("获取上传指令数据错误!");
                    return;
                }

                MainCanvas.netUtils.sendPacket(new NetPacket((short) 4217, var5));
                this.b.showPending((String) null);
            }
        } else if (this.a.sceneSubState == 3) {
            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    this.a.sceneSubState = 0;
                }
            } else {
                String var6 = GlobalStatus.iy[this.b.gunDongListUi.g()];
                byte[] var7;
                if ((var7 = NetPayloadBuilder.k((short) 4208, GlobalStatus.roleId_2, var6)) == null) {
                    this.b.showTips("获取上传指令数据错误!");
                    return;
                }

                MainCanvas.netUtils.sendPacket(new NetPacket((short) 4208, var7));
                this.b.showPending((String) null);
            }
        }

    }

    public final void j() {
        this.b.mixedUi.clear();
        this.b.mixedUi.setTitle("职务列表");
        this.b.mixedUi.setDrawBackground(true);
        this.b.gunDongListUi.setValue((Image[]) null, GlobalStatus.jd, (String[]) null, (String[]) null);
        this.b.textPanel.setText(GlobalStatus.je[this.b.gunDongListUi.g()], GlobalConfig.font2, (byte) 2);
        this.b.textPanel.setShuRuMoShi((byte) 1);
        this.b.bottomUi.a("确定");
        this.b.mixedUi.addChild((BaseUi) this.b.gunDongListUi);
        this.b.mixedUi.addChild((BaseUi) this.b.textPanel);
        this.b.mixedUi.addChild((BaseUi) this.b.bottomUi);
        this.b.mixedUi.layout(GlobalConfig.gameX, GlobalConfig.gameY, GlobalConfig.realWidth, GlobalConfig.realHigh);
        this.a.sceneSubState = 2;
        this.b.pageStatus = this.b.lastPageStatus;
        this.a.lastSceneModeId = this.a.currentSceneModeId = 48;
    }

    public final void l(int var1) {
        if (this.a.sceneSubState == 0) {
            if (this.b.mixedUi != null) {
                this.b.mixedUi.onClick(var1);
            }

            if (var1 == 268435456 || var1 == 536870912 || var1 == 1073741824 || var1 == 517) {
                this.a.m();
            }
        }

    }

    public final void k() {
        this.b.mixedUi.clear();
        this.b.mixedUi.setTitle("帮派公告");
        this.b.mixedUi.setDrawBackground(false);
        this.b.textPanel.setText(GlobalStatus.jf, GlobalConfig.font2, (byte) 2);
        this.b.bottomUi.a("确定");
        this.b.mixedUi.addChild((BaseUi) this.b.textPanel);
        this.b.mixedUi.addChild((BaseUi) this.b.bottomUi);
        this.b.mixedUi.layout(GlobalConfig.gameX, GlobalConfig.gameY, GlobalConfig.realWidth, GlobalConfig.realHigh);
        this.a.sceneSubState = 0;
        this.b.pageStatus = this.b.lastPageStatus;
        this.a.lastSceneModeId = this.a.currentSceneModeId = 49;
    }

    public final void b(boolean var1) {
        this.b.mixedUi.clear();
        this.b.mixedUi.setTitle("宝库管理");
        this.b.mixedUi.setDrawBackground(false);
        this.b.gunDongListUi.setValue((Image[]) null, GlobalConfig.BaoKuCaoZuo, (String[]) null, (String[]) null);
        if (var1) {
            this.b.gunDongListUi.a(this.a.aA, this.a.aE);
            this.b.textPanel.setText(GlobalStatus.iI[this.a.aE], GlobalConfig.font2, (byte) 2);
        } else {
            this.b.textPanel.setText(GlobalStatus.iI[0], GlobalConfig.font2, (byte) 2);
        }

        this.b.textPanel.setShuRuMoShi((byte) 1);
        this.b.bottomUi.a("确定");
        this.b.mixedUi.addChild((BaseUi) this.b.gunDongListUi);
        this.b.mixedUi.addChild((BaseUi) this.b.textPanel);
        this.b.mixedUi.addChild((BaseUi) this.b.bottomUi);
        this.b.mixedUi.layout(GlobalConfig.gameX, GlobalConfig.gameY, GlobalConfig.realWidth, GlobalConfig.realHigh);
        LoadingPage.h = 0;
        LoadingPage.g = 0;
        this.b.inputAction = 0;
        this.a.sceneSubState = 0;
        this.b.pageStatus = this.b.lastPageStatus;
        this.a.lastSceneModeId = this.a.currentSceneModeId = 50;
    }

    public final void m(int var1) {
        if (this.a.sceneSubState == 0) {
            if (this.b.mixedUi != null) {
                this.b.mixedUi.onClick(var1);
            }

            if (var1 == 514 || var1 == 520 || var1 == 1 || var1 == 4) {
                this.b.textPanel.setText(GlobalStatus.iI[this.b.gunDongListUi.g()], GlobalConfig.font2, (byte) 2);
                this.b.textPanel.setShuRuMoShi((byte) 1);
            }

            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    GlobalStatus.H();
                    this.a.lastSceneModeId = this.a.currentSceneModeId = 0;
                    return;
                }
            } else {
                this.a.aA = this.b.gunDongListUi.h();
                this.a.aE = this.b.gunDongListUi.g();
                switch (this.a.aE) {
                    case 0:
                        this.o();
                        break;
                    case 1:
                        this.a.e((int) 18);
                        break;
                    case 2:
                        this.a.o();
                        this.a.sceneSubState = 1;
                        this.a.a(GlobalStatus.versus);
                        break;
                    case 3:
                        this.a.o();
                        this.a.sceneSubState = 5;
                        this.a.a(999999999L);
                        break;
                    case 4:
                        this.a.o();
                        this.a.sceneSubState = 2;
                        this.a.a(GlobalStatus.xiulian);
                        break;
                    case 5:
                        this.m();
                        break;
                    case 6:
                        this.a.a(99L);
                        this.a.sceneSubState = 3;
                        break;
                    case 7:
                        this.a.a(99L);
                        this.a.sceneSubState = 4;
                        break;
                    case 8:
                        this.b((byte) 1);
                        break;
                    case 9:
                        this.a.sceneSubState = 6;
                        this.a.at = "您确定要消耗一定物品提升帮派人气吗？";
                        LoadingPage.h = 0;
                        break;
                    case 10:
                        this.a.sceneSubState = 7;
                        this.a.at = "您确定要消耗一定物品扩容帮派宝库吗？";
                        LoadingPage.h = 0;
                    default:
                        return;
                }
            }
        } else {
            if (this.a.sceneSubState != 1 && this.a.sceneSubState != 2) {
                if (this.a.sceneSubState != 3 && this.a.sceneSubState != 4) {
                    if (this.a.sceneSubState == 5) {
                        if (var1 != 268435456 && var1 != 1073741824) {
                            if (var1 == 536870912) {
                                this.a.sceneSubState = 0;
                                return;
                            }

                            this.a.d(var1);
                            return;
                        }

                        if (this.a.n() != -1L) {
                            if (this.a.n() > this.a.actionLimit) {
                                this.b.showTips("超出最大值,请重新输入");
                                return;
                            }

                            byte[] var4;
                            if ((var4 = NetPayloadBuilder.b((short) 4264, (byte) 2, this.a.n(), GlobalStatus.roleId_2)) != null) {
                                MainCanvas.netUtils.sendPacket(new NetPacket((short) 4264, var4));
                                this.b.showPending((String) null);
                            } else {
                                this.b.showTips("获取上传指令数据错误!");
                            }

                            this.a.sceneSubState = 0;
                            return;
                        }

                        this.b.showTips("输入有误,请重新输入");
                        return;
                    }

                    if (this.a.sceneSubState == 6) {
                        if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
                            this.a.sceneSubState = 0;
                            this.a((short) 4677);
                            return;
                        }

                        if (var1 == 536870912) {
                            LoadingPage.l = 0;
                            LoadingPage.h = 0;
                            this.a.sceneSubState = 0;
                            return;
                        }
                    } else if (this.a.sceneSubState == 7) {
                        if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
                            this.a.sceneSubState = 0;
                            this.a((short) 4265);
                            return;
                        }

                        if (var1 == 536870912) {
                            LoadingPage.l = 0;
                            LoadingPage.h = 0;
                            this.a.sceneSubState = 0;
                        }

                        return;
                    }

                    return;
                }

                if (this.a.sceneSubMode == 0) {
                    if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                        if (var1 == 536870912) {
                            this.a.sceneSubState = 0;
                            return;
                        }

                        this.a.b(var1);
                        return;
                    }

                    this.a.at = "发布" + this.a.ag + "天帮派任务\t是否确认？";
                    this.a.sceneSubMode = 1;
                    LoadingPage.h = 0;
                    return;
                }

                if (this.a.sceneSubMode != 1) {
                    return;
                }

                if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                    if (var1 == 536870912) {
                        this.a.at = null;
                        this.a.sceneSubMode = 0;
                        LoadingPage.h = 0;
                        return;
                    }

                    return;
                }

                byte[] var3;
                if ((var3 = NetPayloadBuilder.a((short) 4368, (int) this.a.ag, (byte) ((byte) (this.a.sceneSubState == 3 ? 1 : 2)), GlobalStatus.roleId_2)) != null) {
                    MainCanvas.netUtils.sendPacket(new NetPacket((short) 4368, var3));
                    this.b.showPending((String) null);
                } else {
                    this.b.showTips("获取上传指令数据错误!");
                }

                LoadingPage.h = 0;
                this.a.sceneSubMode = 0;
                return;
            }

            if (var1 != 268435456 && var1 != 1073741824) {
                if (var1 == 536870912) {
                    this.a.sceneSubState = 0;
                    return;
                }

                this.a.d(var1);
                return;
            }

            if (this.a.n() != -1L) {
                if (this.a.n() > this.a.actionLimit) {
                    this.b.showTips("超出最大值,请重新输入");
                    return;
                }

                byte[] var2;
                if ((var2 = NetPayloadBuilder.b((short) 4264, (byte) (this.a.sceneSubState == 1 ? 1 : 3), this.a.n(), GlobalStatus.roleId_2)) != null) {
                    MainCanvas.netUtils.sendPacket(new NetPacket((short) 4264, var2));
                    this.b.showPending((String) null);
                } else {
                    this.b.showTips("获取上传指令数据错误!");
                }

                this.a.sceneSubState = 0;
                return;
            }

            this.b.showTips("输入有误,请重新输入");
            return;
        }

    }

    private void a(short var1) {
        byte[] var2;
        if ((var2 = NetPayloadBuilder.C(var1, GlobalStatus.roleId_2)) != null) {
            MainCanvas.netUtils.sendPacket(new NetPacket(var1, var2));
            this.b.showPending((String) null);
        } else {
            this.b.showTips("获取上传指令数据错误!");
        }
    }

    private void b(byte var1) {
        byte[] var2;
        if ((var2 = NetPayloadBuilder.a((short) 4239, var1, this.i, GlobalStatus.roleId_2)) != null) {
            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4239, var2));
            this.b.showPending((String) null);
        } else {
            this.b.showTips("获取上传指令数据错误!");
        }
    }

    public final void l() {
        this.a.a(this.w);
        this.k = new int[5];
        this.l = new int[5][4];
        this.m = new int[5][4];
        this.n = new int[4];
        this.b.mixedUi.clear();
        this.b.mixedUi.setTitle("贡献物品");
        this.b.mixedUi.setDrawBackground(false);
        String[] var1 = GlobalConfig.defaultWidth <= 176 ? new String[]{"", "", "", "", ""} : GlobalConfig.HuoBiType;
        this.b.gunDongListUi.setValue(GameSceneController.b(this.w), var1, (String[]) null, (String[]) null);
        short var2 = MainCanvas.tradebottom.c;
        this.b.mixedUi.f = var2;
        this.b.gunDongListUi.b(false);
        this.b.bottomUi.setButtonText(new String[]{"确定", "返回"});
        this.b.mixedUi.addChild((BaseUi) this.b.gunDongListUi);
        this.b.mixedUi.addChild((BaseUi) this.b.bottomUi);
        this.b.mixedUi.layout(GlobalConfig.gameX, GlobalConfig.gameY, GlobalConfig.realWidth, GlobalConfig.realHigh);
        this.a.sceneSubState = 0;
        this.b.pageStatus = this.b.lastPageStatus;
        this.a.lastSceneModeId = this.a.currentSceneModeId = 51;
    }

    public final void m() {
        byte[] var1;
        if ((var1 = NetPayloadBuilder.r((short) 4221, GlobalStatus.roleId_2)) != null) {
            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4221, var1));
            this.b.showPending((String) null);
        } else {
            this.b.showTips("获取上传指令数据错误!");
        }
    }

    public final void n(int var1) {
        if (this.a.sceneSubState == 0) {
            if (this.b.mixedUi != null) {
                this.b.mixedUi.onClick(var1);
            }

            if (this.b.tempTouchStatus > 40) {
                if (this.b.keyCombination != 2 && this.b.keyCombination != 518) {
                    if (this.b.keyCombination == 8 || this.b.keyCombination == 516) {
                        switch (this.b.gunDongListUi.g()) {
                            case 0:
                                this.k[0] = (int) (this.j = this.j - 100L <= 0L ? 0L : this.j - 100L);
                                break;
                            case 1:
                                int[] var18 = this.k;
                                short var63 = this.B;
                                this.B = (short) (var63 - 1);
                                short var33;
                                if (var63 <= 0) {
                                    var33 = 0;
                                } else {
                                    var63 = this.B;
                                    var33 = var63;
                                    this.B = (short) (var63 - 1);
                                }

                                var18[1] = this.B = var33;
                                break;
                            case 2:
                                int[] var17 = this.k;
                                short var61 = this.C;
                                this.C = (short) (var61 - 1);
                                short var32;
                                if (var61 <= 0) {
                                    var32 = 0;
                                } else {
                                    var61 = this.C;
                                    var32 = var61;
                                    this.C = (short) (var61 - 1);
                                }

                                var17[2] = this.C = var32;
                                break;
                            case 3:
                                int[] var16 = this.k;
                                short var59 = this.D;
                                this.D = (short) (var59 - 1);
                                short var31;
                                if (var59 <= 0) {
                                    var31 = 0;
                                } else {
                                    var59 = this.D;
                                    var31 = var59;
                                    this.D = (short) (var59 - 1);
                                }

                                var16[3] = this.D = var31;
                                break;
                            case 4:
                                int[] var15 = this.k;
                                short var57 = this.E;
                                this.E = (short) (var57 - 1);
                                short var30;
                                if (var57 <= 0) {
                                    var30 = 0;
                                } else {
                                    var57 = this.E;
                                    var30 = var57;
                                    this.E = (short) (var57 - 1);
                                }

                                var15[4] = this.E = var30;
                        }
                    }
                } else {
                    switch (this.b.gunDongListUi.g()) {
                        case 0:
                            this.k[0] = (int) (this.j = this.j + 100L <= GlobalStatus.versus ? this.j + 100L : GlobalStatus.versus);
                            break;
                        case 1:
                            int[] var14 = this.k;
                            short var55 = this.B;
                            this.B = (short) (var55 + 1);
                            short var29;
                            if (var55 >= GlobalStatus.jh) {
                                var29 = GlobalStatus.jh;
                            } else {
                                var55 = this.B;
                                var29 = var55;
                                this.B = (short) (var55 + 1);
                            }

                            var14[1] = this.B = var29;
                            break;
                        case 2:
                            int[] var13 = this.k;
                            short var53 = this.C;
                            this.C = (short) (var53 + 1);
                            short var28;
                            if (var53 >= GlobalStatus.jj) {
                                var28 = GlobalStatus.jj;
                            } else {
                                var53 = this.C;
                                var28 = var53;
                                this.C = (short) (var53 + 1);
                            }

                            var13[2] = this.C = var28;
                            break;
                        case 3:
                            int[] var12 = this.k;
                            short var51 = this.D;
                            this.D = (short) (var51 + 1);
                            short var27;
                            if (var51 >= GlobalStatus.jl) {
                                var27 = GlobalStatus.jl;
                            } else {
                                var51 = this.D;
                                var27 = var51;
                                this.D = (short) (var51 + 1);
                            }

                            var12[3] = this.D = var27;
                            break;
                        case 4:
                            int[] var11 = this.k;
                            short var49 = this.E;
                            this.E = (short) (var49 + 1);
                            short var26;
                            if (var49 >= GlobalStatus.jn) {
                                var26 = GlobalStatus.jn;
                            } else {
                                var49 = this.E;
                                var26 = var49;
                                this.E = (short) (var49 + 1);
                            }

                            var11[4] = this.E = var26;
                    }
                }
            } else {
                if (var1 != 2 && var1 != 518) {
                    if (var1 == 8 || var1 == 516) {
                        switch (this.b.gunDongListUi.g()) {
                            case 0:
                                this.k[0] = (int) (this.j = this.j - 100L <= 0L ? 0L : this.j - 100L);
                                break;
                            case 1:
                                int[] var9 = this.k;
                                short var47 = this.B;
                                this.B = (short) (var47 - 1);
                                short var25;
                                if (var47 <= 0) {
                                    var25 = 0;
                                } else {
                                    var47 = this.B;
                                    var25 = var47;
                                    this.B = (short) (var47 - 1);
                                }

                                var9[1] = this.B = var25;
                                break;
                            case 2:
                                int[] var8 = this.k;
                                short var45 = this.C;
                                this.C = (short) (var45 - 1);
                                short var24;
                                if (var45 <= 0) {
                                    var24 = 0;
                                } else {
                                    var45 = this.C;
                                    var24 = var45;
                                    this.C = (short) (var45 - 1);
                                }

                                var8[2] = this.C = var24;
                                break;
                            case 3:
                                int[] var7 = this.k;
                                short var43 = this.D;
                                this.D = (short) (var43 - 1);
                                short var23;
                                if (var43 <= 0) {
                                    var23 = 0;
                                } else {
                                    var43 = this.D;
                                    var23 = var43;
                                    this.D = (short) (var43 - 1);
                                }

                                var7[3] = this.D = var23;
                                break;
                            case 4:
                                int[] var6 = this.k;
                                short var41 = this.E;
                                this.E = (short) (var41 - 1);
                                short var22;
                                if (var41 <= 0) {
                                    var22 = 0;
                                } else {
                                    var41 = this.E;
                                    var22 = var41;
                                    this.E = (short) (var41 - 1);
                                }

                                var6[4] = this.E = var22;
                        }
                    }
                } else {
                    switch (this.b.gunDongListUi.g()) {
                        case 0:
                            this.k[0] = (int) (this.j = this.j + 100L <= GlobalStatus.versus ? this.j + 100L : GlobalStatus.versus);
                            break;
                        case 1:
                            int[] var5 = this.k;
                            short var39 = this.B;
                            this.B = (short) (var39 + 1);
                            short var21;
                            if (var39 >= GlobalStatus.jh) {
                                var21 = GlobalStatus.jh;
                            } else {
                                var39 = this.B;
                                var21 = var39;
                                this.B = (short) (var39 + 1);
                            }

                            var5[1] = this.B = var21;
                            break;
                        case 2:
                            int[] var4 = this.k;
                            short var37 = this.C;
                            this.C = (short) (var37 + 1);
                            short var20;
                            if (var37 >= GlobalStatus.jj) {
                                var20 = GlobalStatus.jj;
                            } else {
                                var37 = this.C;
                                var20 = var37;
                                this.C = (short) (var37 + 1);
                            }

                            var4[2] = this.C = var20;
                            break;
                        case 3:
                            int[] var3 = this.k;
                            short var35 = this.D;
                            this.D = (short) (var35 + 1);
                            short var19;
                            if (var35 >= GlobalStatus.jl) {
                                var19 = GlobalStatus.jl;
                            } else {
                                var35 = this.D;
                                var19 = var35;
                                this.D = (short) (var35 + 1);
                            }

                            var3[3] = this.D = var19;
                            break;
                        case 4:
                            int[] var10000 = this.k;
                            short var10005 = this.E;
                            this.E = (short) (var10005 + 1);
                            short var10003;
                            if (var10005 >= GlobalStatus.jn) {
                                var10003 = GlobalStatus.jn;
                            } else {
                                var10005 = this.E;
                                var10003 = var10005;
                                this.E = (short) (var10005 + 1);
                            }

                            var10000[4] = this.E = var10003;
                    }
                }

                ++this.b.tempTouchStatus;
            }

            if (var1 != 1073741824 && var1 != 517) {
                if (var1 == 268435456) {
                    if (this.j == 0L && this.B == 0 && this.C == 0 && this.D == 0 && this.E == 0) {
                        this.b.showTips("请输入贡献基金的数目！");
                        return;
                    }

                    byte[] var2;
                    if ((var2 = NetPayloadBuilder.a((short) 4220, GlobalStatus.roleId_2, this.j, this.B, this.C, this.D, this.E)) == null) {
                        this.b.showTips("获取上传指令数据错误!");
                        return;
                    }

                    MainCanvas.netUtils.sendPacket(new NetPacket((short) 4220, var2));
                    this.b.showPending((String) null);
                } else if (var1 == 536870912) {
                    this.q();
                    this.b(true);
                }
            } else if (this.b.gunDongListUi.g() == 0) {
                this.b.a((String) "请输入贡献金额", (int) 2);
                return;
            }
        }

    }

    public final void n() {
        this.a.a(this.A);
        this.i[0] = GlobalStatus.iK[0];
        this.i[1] = GlobalStatus.iM[0];
        this.i[2] = GlobalStatus.iL[0];
        this.x = new int[3][4];
        this.y = new int[3][4];
        this.z = new int[3][4];
        this.b.mixedUi.clear();
        this.b.mixedUi.setTitle("宝库配置");
        this.b.mixedUi.setDrawBackground(false);
        this.b.gunDongListUi.setValue(GameSceneController.b(this.A), GlobalConfig.JiangLiType, (String[]) null, (String[]) null);
        this.b.bottomUi.setButtonText(new String[]{"确定", "返回"});
        this.b.mixedUi.addChild((BaseUi) this.b.gunDongListUi);
        this.b.mixedUi.addChild((BaseUi) this.b.bottomUi);
        this.b.mixedUi.layout(GlobalConfig.gameX, GlobalConfig.gameY, GlobalConfig.realWidth, GlobalConfig.realHigh);
        this.a.sceneSubState = 0;
        this.b.pageStatus = this.b.lastPageStatus;
        this.a.lastSceneModeId = this.a.currentSceneModeId = 114;
    }

    public final void o(int var1) {
        if (this.b.mixedUi != null) {
            this.b.mixedUi.onClick(var1);
        }

        if (this.b.tempTouchStatus > 40) {
            if (this.b.keyCombination != 2 && this.b.keyCombination != 518) {
                if (this.b.keyCombination == 8 || this.b.keyCombination == 516) {
                    switch (this.b.gunDongListUi.g()) {
                        case 0:
                            int[] var4 = this.i;
                            byte[] var12 = GlobalStatus.iK;
                            byte var26;
                            if (GlobalStatus.iK[0]-- <= 0) {
                                var26 = 0;
                            } else {
                                byte[] var27 = GlobalStatus.iK;
                                byte var53 = var27[0];
                                var26 = var27[0];
                                var27[0] = (byte) (var53 - 1);
                            }

                            var4[0] = var12[0] = var26;
                            break;
                        case 1:
                            this.i[1] = GlobalStatus.iM[0] = GlobalStatus.iM[0] - 10000 <= 0 ? 0 : GlobalStatus.iM[0] - 10000;
                            break;
                        case 2:
                            int[] var3 = this.i;
                            byte[] var11 = GlobalStatus.iL;
                            byte var23;
                            if (GlobalStatus.iL[0]-- <= 0) {
                                var23 = 0;
                            } else {
                                byte[] var24 = GlobalStatus.iL;
                                byte var51 = var24[0];
                                var23 = var24[0];
                                var24[0] = (byte) (var51 - 1);
                            }

                            var3[2] = var11[0] = var23;
                    }
                }
            } else {
                switch (this.b.gunDongListUi.g()) {
                    case 0:
                        int[] var2 = this.i;
                        byte[] var10 = GlobalStatus.iK;
                        byte var20;
                        if (GlobalStatus.iK[0]++ >= GlobalStatus.iK[1]) {
                            var20 = GlobalStatus.iK[1];
                        } else {
                            byte[] var21 = GlobalStatus.iK;
                            byte var49 = var21[0];
                            var20 = var21[0];
                            var21[0] = (byte) (var49 + 1);
                        }

                        var2[0] = var10[0] = var20;
                        break;
                    case 1:
                        this.i[1] = GlobalStatus.iM[0] = GlobalStatus.iM[0] + 10000 >= GlobalStatus.iM[1] ? GlobalStatus.iM[1] : GlobalStatus.iM[0] + 10000;
                        break;
                    case 2:
                        int[] var10000 = this.i;
                        byte[] var10002 = GlobalStatus.iL;
                        byte var17;
                        if (GlobalStatus.iL[0]++ >= GlobalStatus.iL[1]) {
                            var17 = GlobalStatus.iL[1];
                        } else {
                            byte[] var18 = GlobalStatus.iL;
                            byte var47 = var18[0];
                            var17 = var18[0];
                            var18[0] = (byte) (var47 + 1);
                        }

                        var10000[2] = var10002[0] = var17;
                }
            }
        } else {
            if (var1 != 2 && var1 != 518) {
                if (var1 == 8 || var1 == 516) {
                    switch (this.b.gunDongListUi.g()) {
                        case 0:
                            int[] var8 = this.i;
                            byte[] var16 = GlobalStatus.iK;
                            byte var38;
                            if (GlobalStatus.iK[0]-- <= 0) {
                                var38 = 0;
                            } else {
                                byte[] var39 = GlobalStatus.iK;
                                byte var61 = var39[0];
                                var38 = var39[0];
                                var39[0] = (byte) (var61 - 1);
                            }

                            var8[0] = var16[0] = var38;
                            break;
                        case 1:
                            this.i[1] = GlobalStatus.iM[0] = GlobalStatus.iM[0] - 10000 <= 0 ? 0 : GlobalStatus.iM[0] - 10000;
                            break;
                        case 2:
                            int[] var7 = this.i;
                            byte[] var15 = GlobalStatus.iL;
                            byte var35;
                            if (GlobalStatus.iL[0]-- <= 0) {
                                var35 = 0;
                            } else {
                                byte[] var36 = GlobalStatus.iL;
                                byte var59 = var36[0];
                                var35 = var36[0];
                                var36[0] = (byte) (var59 - 1);
                            }

                            var7[2] = var15[0] = var35;
                    }
                }
            } else {
                switch (this.b.gunDongListUi.g()) {
                    case 0:
                        int[] var6 = this.i;
                        byte[] var14 = GlobalStatus.iK;
                        byte var32;
                        if (GlobalStatus.iK[0]++ >= GlobalStatus.iK[1]) {
                            var32 = GlobalStatus.iK[1];
                        } else {
                            byte[] var33 = GlobalStatus.iK;
                            byte var57 = var33[0];
                            var32 = var33[0];
                            var33[0] = (byte) (var57 + 1);
                        }

                        var6[0] = var14[0] = var32;
                        break;
                    case 1:
                        this.i[1] = GlobalStatus.iM[0] = GlobalStatus.iM[0] + 10000 >= GlobalStatus.iM[1] ? GlobalStatus.iM[1] : GlobalStatus.iM[0] + 10000;
                        break;
                    case 2:
                        int[] var5 = this.i;
                        byte[] var13 = GlobalStatus.iL;
                        byte var29;
                        if (GlobalStatus.iL[0]++ >= GlobalStatus.iL[1]) {
                            var29 = GlobalStatus.iL[1];
                        } else {
                            byte[] var30 = GlobalStatus.iL;
                            byte var55 = var30[0];
                            var29 = var30[0];
                            var30[0] = (byte) (var55 + 1);
                        }

                        var5[2] = var13[0] = var29;
                }
            }

            ++this.b.tempTouchStatus;
        }

        if (var1 != 1073741824 && var1 != 517) {
            if (var1 == 268435456) {
                if (GlobalStatus.iK[1] == 0 && GlobalStatus.iM[1] == 0 && GlobalStatus.iL[1] == 0) {
                    this.b.showTips("请输入正确的数目！");
                    return;
                }

                this.b((byte) 2);
                this.b.inputAction = 0;
                return;
            }

            if (var1 == 536870912) {
                this.b(true);
            }
        } else {
            if (this.b.gunDongListUi.g() == 0) {
                this.b.a((String) "请输入物品掉率", (int) 2);
                return;
            }

            if (this.b.gunDongListUi.g() == 1) {
                this.b.a((String) "请输入银两奖励", (int) 2);
                return;
            }

            if (this.b.gunDongListUi.g() == 2) {
                this.b.a((String) "请输入经验加成", (int) 2);
                return;
            }
        }

    }

    public final void a(Graphics var1) {
        if (this.b.mixedUi != null) {
            this.b.mixedUi.draw(var1);

            for (int var2 = 0; var2 < this.b.gunDongListUi.f(); ++var2) {
                int var3 = this.b.gunDongListUi.a() + this.b.gunDongListUi.c() - MainCanvas.up.b - 126;
                int var4 = this.b.gunDongListUi.b() + 4 + var2 * this.b.gunDongListUi.e();
                LoadingPage.a(var1, var2 == 1 ? GameSceneController.a(this.b.shareSb, (long) this.i[var2]) : this.i[var2] + "%", var3, var4, 122);
                var3 = 122;
                if (this.x != null && this.x.length > var2) {
                    this.x[var2][0] = var3;
                    this.x[var2][1] = var4;
                    this.x[var2][2] = 12;
                    this.x[var2][3] = GlobalConfig.font2_h;
                }

                if (this.y != null && this.y.length > var2) {
                    this.y[var2][0] = var3 + 122 - 12;
                    this.y[var2][1] = var4;
                    this.y[var2][2] = 12;
                    this.y[var2][3] = GlobalConfig.font2_h;
                }

                if (this.z != null) {
                    this.z[var2][0] = var3 + 12;
                    this.z[var2][1] = var4;
                    this.z[var2][2] = 98;
                    this.z[var2][3] = GlobalConfig.font2_h;
                }
            }
        }

    }

    public final int a(int var1, int var2, int var3) {
        if (var1 == 0) {
            for (int var4 = 0; var4 < this.x.length; ++var4) {
                if (var2 >= this.x[var4][0] && var2 <= this.x[var4][0] + this.x[var4][2] && var3 >= this.x[var4][1] && var3 <= this.x[var4][1] + this.x[var4][3]) {
                    return 8;
                }

                if (var2 >= this.y[var4][0] && var2 <= this.y[var4][0] + this.y[var4][2] && var3 >= this.y[var4][1] && var3 <= this.y[var4][1] + this.y[var4][3]) {
                    return 2;
                }

                if (var2 >= this.z[var4][0] && var2 <= this.z[var4][0] + this.z[var4][2] && var3 >= this.z[var4][1] && var3 <= this.z[var4][1] + this.z[var4][3]) {
                    return 1073741824;
                }
            }
        }

        return var1;
    }

    public final void o() {
        this.a.sceneSubState = 0;
        this.b.aw = 0;
        LoadingPage.l = 0;
        this.b.mixedUi.clean();
        this.b.mixedUi.setTitle("帮派宝库");
        this.b.mixedUi.setDrawBackground(true);
        this.b.topUi.a(new String[]{"宝库一", "宝库二", "宝库三"});
        this.b.topUi.a((byte) 1);
        this.b.mixedUi.setR(GlobalConfig.realHigh <= 240 ? 79 : 120);
        if (this.a.lastSceneModeId != 115 && this.a.lastSceneModeId != 64) {
            this.a.aq = this.a.ar = 0;
        } else {
            this.a.aq = this.a.aF;
            this.a.ar = this.a.aG;
            this.b.topUi.a = this.a.aH;
        }

        int var1 = (this.b.topUi.a << 5) + (this.a.ar << 3) + this.a.aq;
        if (GlobalStatus.iN != null && var1 < GlobalStatus.iN.length) {
            this.b.textPanel.setFWBText(GlobalStatus.ja[var1], GlobalConfig.font2, (byte) 1);
        } else {
            this.b.textPanel.setFWBText("没有物品,按3、9键可以上下翻滚此属性描述框", GlobalConfig.font2, (byte) 1);
        }

        this.b.bottomUi.a("操作");
        this.b.bottomUi.a(true);
        this.b.textPanel.setShuRuMoShi((byte) 1);
        this.b.mixedUi.addChild((BaseUi) this.b.topUi);
        this.b.mixedUi.addChild((BaseUi) this.b.textPanel);
        this.b.mixedUi.addChild((BaseUi) this.b.bottomUi);
        this.b.mixedUi.layout(GlobalConfig.gameX, GlobalConfig.gameY, GlobalConfig.realWidth, GlobalConfig.realHigh);
        this.b.pageStatus = this.b.lastPageStatus;
        this.a.lastSceneModeId = this.a.currentSceneModeId = 115;
    }

    public final void p() {
        int var1 = (this.b.topUi.a << 5) + (this.a.ar << 3) + this.a.aq;
        if (GlobalStatus.iN != null && var1 < GlobalStatus.iN.length) {
            this.b.textPanel.setFWBText(GlobalStatus.ja[var1], GlobalConfig.font2, (byte) 1);
        } else {
            this.b.textPanel.setFWBText("没有物品，按3、9键可以上下翻滚此属性描述框", GlobalConfig.font2, (byte) 1);
        }

        this.b.textPanel.setShuRuMoShi((byte) 1);
        LoadingPage.l = 0;
    }

    public final void p(int var1) {
        int var2 = (this.b.topUi.a << 5) + (this.a.ar << 3) + this.a.aq;
        if (this.a.sceneSubState == 0) {
            this.a.a(GlobalStatus.iR);
            if (this.b.mixedUi != null) {
                this.b.mixedUi.onClick(var1);
            }

            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 1024 || var1 == 2048) {
                    this.p();
                    return;
                }

                if (var1 != 8 && var1 != 516) {
                    if (var1 != 2 && var1 != 518) {
                        if (var1 != 1 && var1 != 514) {
                            if (var1 != 4 && var1 != 520) {
                                if (var1 == 536870912) {
                                    this.a.npcActionList = null;
                                    this.b(true);
                                    return;
                                }

                                return;
                            }

                            this.a.ar = this.a.ar >= 3 ? 0 : ++this.a.ar;
                            this.p();
                            return;
                        }

                        this.a.ar = this.a.ar <= 0 ? 3 : --this.a.ar;
                        this.p();
                        return;
                    }

                    this.a.aq = this.a.aq >= 7 ? 0 : ++this.a.aq;
                    this.p();
                    return;
                }

                this.a.aq = this.a.aq <= 0 ? 7 : --this.a.aq;
                this.p();
                return;
            } else if (GlobalStatus.iN != null && var2 < GlobalStatus.iN.length) {
                String[] var10 = new String[]{"查看", "取出", "丢弃", "整理"};
                LoadingPage.a(this.a.au[(this.a.ar << 3) + this.a.aq][0] - 17, this.a.au[(this.a.ar << 3) + this.a.aq][1] + 17, var10, false);
                this.a.sceneSubState = 1;
                return;
            }
        } else if (this.a.sceneSubState == 1) {
            LoadingPage.b(var1);
            if (var1 != 268435456 && var1 != 517 && var1 != 1073741824) {
                if (var1 == 536870912) {
                    this.a.sceneSubState = 0;
                    return;
                }
            } else if (GlobalStatus.iN != null && var2 < GlobalStatus.iN.length && GlobalStatus.iQ[var2] > 0) {
                switch (LoadingPage.o) {
                    case 0:
                        if (!GlobalStatus.a(GlobalStatus.iP[var2])) {
                            this.b.mixedUi.clear();
                            this.b.mixedUi.clean();
                            this.b.mixedUi.setTitle("宝物详情");
                            if (GlobalStatus.ja != null && var2 < GlobalStatus.ja.length && GlobalStatus.ja[var2] != null) {
                                this.b.textPanel.setFWBText(GlobalStatus.iO[var2] + "：\t" + GlobalStatus.ja[var2], GlobalConfig.font2, (byte) 1);
                            }

                            this.b.mixedUi.addChild((BaseUi) this.b.textPanel);
                            this.b.mixedUi.layout(GlobalConfig.gameX, GlobalConfig.gameY, GlobalConfig.realWidth, GlobalConfig.realHigh);
                            this.a.sceneSubState = 2;
                        } else {
                            var1 = var2;
                            GlobalStatus.ko = GlobalStatus.iN[var2];
                            GlobalStatus.kp = GlobalStatus.iO[var2];
                            GlobalStatus.kq = GlobalStatus.iO[var2];
                            GlobalStatus.ks = GlobalStatus.iS[var2];
                            GlobalStatus.kt = GlobalStatus.iT[var2];
                            GlobalStatus.ku = GlobalStatus.iU[var2];
                            GlobalStatus.kv = GlobalStatus.iV[var2];
                            GlobalStatus.kw = GlobalStatus.iW[var2];
                            GlobalStatus.kx = GlobalStatus.iX[var2];
                            var2 = 0;
                            if (GlobalStatus.jb[var2] != null) {
                                if ((var2 = (byte) GlobalStatus.jb[var2].length) > 0) {
                                    GlobalStatus.kr = new short[var2];

                                    for (byte var16 = 0; var16 < var2; ++var16) {
                                        GlobalStatus.kr[var16] = GlobalStatus.jb[var1][var16];
                                    }
                                }
                            } else {
                                GlobalStatus.kr = null;
                            }

                            GlobalStatus.ky = GlobalStatus.iY[var1];
                            GlobalStatus.kz = -1;
                            GlobalStatus.kA = GlobalStatus.ja[var1];
                            this.a.O.a(0, (short) this.a.currentSceneModeId, -1);
                        }

                        this.a.aF = this.a.aq;
                        this.a.aG = this.a.ar;
                        this.a.aH = this.b.topUi.a;
                        break;
                    case 1:
                        if (GlobalStatus.iQ[var2] > 1) {
                            this.a.a((long) GlobalStatus.iQ[var2]);
                            this.a.sceneSubState = 3;
                        } else {
                            LoadingPage.h = 0;
                            String var8;
                            int var15 = LoadingPage.parseColor(var8 = GlobalStatus.iO[var2]) != -1 ? LoadingPage.parseColor(var8) : 15138723;
                            this.a.at = "您确定取出" + (var15 != 15138723 ? var8.substring(3, var8.length()) : var8) + "X" + GlobalStatus.iQ[var2] + "？";
                            this.a.sceneSubState = 5;
                        }
                        break;
                    case 2:
                        if (GlobalStatus.iQ[var2] > 1) {
                            this.a.a((long) GlobalStatus.iQ[var2]);
                            this.a.sceneSubState = 6;
                        } else {
                            LoadingPage.h = 0;
                            String var7;
                            int var14 = LoadingPage.parseColor(var7 = GlobalStatus.iO[var2]) != -1 ? LoadingPage.parseColor(var7) : 15138723;
                            this.a.at = "您确定丢弃" + (var14 != 15138723 ? var7.substring(3, var7.length()) : var7) + "X" + GlobalStatus.iQ[var2] + "？";
                            this.a.sceneSubState = 4;
                        }
                        break;
                    case 3:
                        byte[] var6;
                        if ((var6 = NetPayloadBuilder.C((short) 4366, GlobalStatus.roleId_2)) != null) {
                            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4366, var6));
                            this.a.mainCanvasRef.showPending((String) null);
                        } else {
                            this.a.mainCanvasRef.showTips("获取上传指令数据错误!");
                        }

                        this.a.sceneSubState = 0;
                    default:
                        return;
                }
            }
        } else if (this.a.sceneSubState == 2) {
            if (this.b.mixedUi != null) {
                this.b.mixedUi.onClick(var1);
            }

            if (var1 == 536870912) {
                this.o();
                return;
            }
        } else if (this.a.sceneSubState != 3 && this.a.sceneSubState != 6) {
            if (this.a.sceneSubState == 4) {
                if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
                    if (GlobalStatus.iQ[var2] > 1) {
                        this.c((byte) this.a.ag);
                    } else {
                        this.c(GlobalStatus.iQ[var2]);
                    }

                    this.a.sceneSubState = 0;
                    LoadingPage.h = 0;
                    return;
                }

                if (var1 == 536870912) {
                    LoadingPage.h = 0;
                    this.a.sceneSubState = 0;
                    return;
                }
            } else if (this.a.sceneSubState == 5) {
                if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
                    if (GlobalStatus.iQ[var2] > 1) {
                        this.d((byte) this.a.ag);
                    } else {
                        this.d(GlobalStatus.iQ[var2]);
                    }

                    LoadingPage.h = 0;
                    this.a.sceneSubState = 0;
                    return;
                }

                if (var1 == 536870912) {
                    LoadingPage.h = 0;
                    this.a.sceneSubState = 0;
                }
            }
        } else {
            this.a.b(var1);
            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    this.a.sceneSubState = 1;
                    return;
                }
            } else if (GlobalStatus.iN != null && var2 < GlobalStatus.iN.length && GlobalStatus.iQ[var2] > 0) {
                LoadingPage.h = 0;
                if (this.a.sceneSubState == 3) {
                    LoadingPage.h = 0;
                    String var5;
                    int var13 = LoadingPage.parseColor(var5 = GlobalStatus.iO[var2]) != -1 ? LoadingPage.parseColor(var5) : 15138723;
                    this.a.at = "您确定取出" + (var13 != 15138723 ? var5.substring(3, var5.length()) : var5) + "X" + this.a.ag + "？";
                    this.a.sceneSubState = 5;
                    return;
                }

                LoadingPage.h = 0;
                String var4;
                int var3 = LoadingPage.parseColor(var4 = GlobalStatus.iO[var2]) != -1 ? LoadingPage.parseColor(var4) : 15138723;
                this.a.at = "您确定丢弃" + (var3 != 15138723 ? var4.substring(3, var4.length()) : var4) + "X" + this.a.ag + "？";
                this.a.sceneSubState = 4;
                return;
            }
        }

    }

    private void c(byte var1) {
        byte[] var2;
        if ((var2 = NetPayloadBuilder.b((short) 4246, GlobalStatus.iN[(this.b.topUi.a << 5) + (this.a.ar << 3) + this.a.aq], (byte) var1, GlobalStatus.roleId_2)) != null) {
            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4246, var2));
            this.a.mainCanvasRef.showPending((String) null);
        } else {
            this.a.mainCanvasRef.showTips("获取上传指令数据错误!");
        }
    }

    public final void b(Graphics var1) {
        if (this.b.mixedUi != null) {
            int var2 = GlobalConfig.realHigh <= 240 ? 79 : 120;
            this.b.mixedUi.draw(var1);
            LoadingPage.draw(var1, this.b.mixedUi.X + 5, this.b.mixedUi.Y + 29 + this.b.topUi.b, this.b.mixedUi.W - 11, var2, 1);
            LoadingPage.draw(var1);
            Graphics var3 = var1;
            GroupModel var11 = this;
            int var4 = (this.b.mixedUi.W - 11 - (GameSceneController.goods.b << 3)) / 9;
            int var5 = ((GlobalConfig.realHigh <= 240 ? 79 : 120) - 6 - (GameSceneController.goods.b << 2)) / 5;
            int var6 = this.b.mixedUi.X + 8 + var4;
            int var7 = this.b.mixedUi.Y + 33 + this.b.topUi.b + var5;

            for (int var8 = 0; var8 < 32; ++var8) {
                MainCanvas.pngUtil.a(var3, GameSceneController.goods, (int[]) null, (aj) null, 0, 0, var8 % 8 * (GameSceneController.goods.b + var4) + var6, var8 / 8 * (GameSceneController.goods.b + var5) + var7, 0, 0);
                var11.a.a((int) var8, var8 % 8 * (GameSceneController.goods.b + var4) + var6, var8 / 8 * (GameSceneController.goods.b + var5) + var7, (int) GameSceneController.goods.b, (int) GameSceneController.goods.c);
            }

            int var12 = 0;
            LoadingPage.d(var3, var6 + var11.a.aq * (GameSceneController.goods.b + var4), var7 + var11.a.ar * (GameSceneController.goods.b + var5), 17, 17);
            if (GlobalStatus.iR != null) {
                for (int var9 = var11.b.topUi.a << 5; var9 < (GlobalStatus.iR.length > var11.b.topUi.a + 1 << 5 ? var11.b.topUi.a + 1 << 5 : GlobalStatus.iR.length); ++var9) {
                    int var10 = var9 % 32;
                    MainCanvas.pngUtil.a(var3, GameSceneController.b(GlobalStatus.iR[var9]), (int[]) null, (aj) null, 0, 0, var10 % 8 * (GameSceneController.goods.b + var4) + var6 + 1, var10 / 8 * (GameSceneController.goods.b + var5) + var7 + 1, 0, 0);
                    if (GlobalStatus.iQ[var9] > 9) {
                        MainCanvas.pngUtil.a(var3, MainCanvas.num, (int[]) null, GlobalStatus.iQ[var9] / 10, 0, 0, 10 + var10 % 8 * (GameSceneController.goods.b + var4) + var6, var10 / 8 * (GameSceneController.goods.b + var5) + var7 + 12, 0, 0);
                        MainCanvas.pngUtil.a(var3, MainCanvas.num, (int[]) null, GlobalStatus.iQ[var9] % 10, 0, 0, 14 + var10 % 8 * (GameSceneController.goods.b + var4) + var6, var10 / 8 * (GameSceneController.goods.b + var5) + var7 + 12, 0, 0);
                    } else if (GlobalStatus.iQ[var9] > 1) {
                        MainCanvas.pngUtil.a(var3, MainCanvas.num, (int[]) null, GlobalStatus.iQ[var9] % 10, 0, 0, 14 + var10 % 8 * (GameSceneController.goods.b + var4) + var6, var10 / 8 * (GameSceneController.goods.b + var5) + var7 + 12, 0, 0);
                    }

                    if (var9 == (var11.a.ar << 3) + var11.a.aq + 32 * var11.b.topUi.a) {
                        var12 = var9;
                    }
                }

                if (var12 >= 0 && var12 < GlobalStatus.iR.length && var12 == (var11.a.ar << 3) + var11.a.aq + 32 * var11.b.topUi.a) {
                    LoadingPage.a(var3, GlobalStatus.iO[var12] + "X" + GlobalStatus.iQ[var12], GlobalStatus.iZ[var12], var6 + var11.a.aq * (GameSceneController.goods.b + var4) + GameSceneController.goods.b / 2, var7 + var11.a.ar * (GameSceneController.goods.b + var5) + GameSceneController.goods.b / 2);
                } else if ((var11.b.topUi.a << 5) + (var11.a.ar << 3) + var11.a.aq >= GlobalStatus.iJ) {
                    LoadingPage.a(var3, "未开启", -1L, var6 + var11.a.aq * (GameSceneController.goods.b + var4) + GameSceneController.goods.b / 2, var7 + var11.a.ar * (GameSceneController.goods.b + var5) + GameSceneController.goods.b / 2);
                }
            }
        }

        if (this.a.sceneSubState == 1) {
            LoadingPage.c(var1);
        } else {
            if (this.a.sceneSubState == 2) {
                if (this.b.mixedUi != null) {
                    this.b.mixedUi.draw(var1);
                    return;
                }
            } else {
                if (this.a.sceneSubState == 3 || this.a.sceneSubState == 6) {
                    this.a.a(var1, "数量");
                    return;
                }

                if (this.a.sceneSubState == 5 || this.a.sceneSubState == 4) {
                    LoadingPage.drawDialog(var1, this.a.at, new String[]{"确定", "取消"});
                }
            }

        }
    }

    private void d(byte var1) {
        byte[] var2;
        if ((var2 = NetPayloadBuilder.b((short) 4245, GlobalStatus.iN[(this.b.topUi.a << 5) + (this.a.ar << 3) + this.a.aq], (byte) var1, GlobalStatus.roleId_2)) != null) {
            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4245, var2));
            this.a.mainCanvasRef.showPending((String) null);
        } else {
            this.a.mainCanvasRef.showTips("获取上传指令数据错误!");
        }
    }

    public final void q() {
        this.j = 0L;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = 0;
    }

    public final void c(Graphics var1) {
        if (this.a.sceneSubState == 0 && this.b.mixedUi != null) {
            LoadingPage.a(var1, (Image) MainCanvas.tradebottom.pngImage, (short) MainCanvas.tradebottom.b, this.b.mixedUi.X + 5, this.b.mixedUi.Y + this.b.mixedUi.H - 53, this.b.mixedUi.W - 10, MainCanvas.tradebottom.c);
            this.b.mixedUi.draw(var1);

            for (int var2 = 0; var2 < this.b.gunDongListUi.f(); ++var2) {
                int var3 = this.b.gunDongListUi.a() + this.b.gunDongListUi.c() - MainCanvas.up.b - 130;
                int var4 = this.b.gunDongListUi.b() + 4 + var2 * this.b.gunDongListUi.e();
                LoadingPage.a(var1, var2 == 0 ? GameSceneController.a(this.b.shareSb, this.j) : "" + this.k[var2], var3, var4, 124);
                var3 = 124;
                if (this.l != null && this.l.length > var2) {
                    this.l[var2][0] = var3;
                    this.l[var2][1] = var4;
                    this.l[var2][2] = 12;
                    this.l[var2][3] = GlobalConfig.font2_h;
                }

                if (this.m != null && this.m.length > var2) {
                    this.m[var2][0] = var3 + 124 - 12;
                    this.m[var2][1] = var4;
                    this.m[var2][2] = 12;
                    this.m[var2][3] = GlobalConfig.font2_h;
                }

                if (this.n != null && var2 == 0) {
                    this.n[0] = var3 + 12;
                    this.n[1] = var4;
                    this.n[2] = 100;
                    this.n[3] = GlobalConfig.font2_h;
                }
            }

            long var7 = (this.j + (long) this.B * GlobalStatus.jg + (long) this.C * GlobalStatus.ji + (long) this.D * GlobalStatus.jk + (long) this.E * GlobalStatus.jm) / 300L;
            LoadingPage.drawString(var1, (String) ("得到功勋：" + var7), (int) (this.b.mixedUi.X + this.b.mixedUi.W / 2), this.b.mixedUi.Y + this.b.mixedUi.H - 51 + (MainCanvas.plus.pngImage.getHeight() - GlobalConfig.font2_h) / 2, 17, 16776666, 0);
        }

    }

    public final void r() {
        byte[] var1;
        if ((var1 = NetPayloadBuilder.s((short) 4236, GlobalStatus.roleId_2)) != null) {
            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4236, var1));
            this.b.showPending((String) null);
        } else {
            this.b.showTips("获取上传指令数据错误!");
        }
    }

    public final void q(int var1) {
        byte[] var2;
        if ((var2 = NetPayloadBuilder.k((short) (var1 == 0 ? 4230 : 4232), GlobalStatus.roleId_2, (short) GlobalStatus.gQ)) != null) {
            MainCanvas.netUtils.sendPacket(new NetPacket((short) (var1 == 0 ? 4230 : 4232), var2));
            this.b.showPending((String) null);
        } else {
            this.b.showTips("获取上传指令数据错误!");
        }
    }

    public final void s() {
        this.b.mixedUi.clear();
        this.b.mixedUi.setTitle("区域建设");
        this.b.mixedUi.setDrawBackground(true);
        this.b.topUi.a(new String[]{"购买", "仓库"});
        this.b.gunDongListUi.setValue((Image[]) null, GlobalStatus.jp, (String[]) null, (String[]) null);
        this.b.textPanel.setText(GlobalStatus.jq == null ? null : GlobalStatus.jq[this.b.gunDongListUi.g()], GlobalConfig.font2, (byte) 2);
        this.b.textPanel.setShuRuMoShi((byte) 1);
        this.b.bottomUi.a("购买");
        this.b.bottomUi.a(true);
        this.b.mixedUi.addChild((BaseUi) this.b.topUi);
        this.b.mixedUi.addChild((BaseUi) this.b.gunDongListUi);
        this.b.mixedUi.addChild((BaseUi) this.b.textPanel);
        this.b.mixedUi.addChild((BaseUi) this.b.bottomUi);
        this.b.mixedUi.layout(GlobalConfig.gameX, GlobalConfig.gameY, GlobalConfig.realWidth, GlobalConfig.realHigh);
        this.a.sceneSubState = 0;
        this.b.pageStatus = this.b.lastPageStatus;
        this.a.lastSceneModeId = this.a.currentSceneModeId = 52;
    }

    public final void t() {
        this.b.gunDongListUi.setValue((Image[]) null, GlobalStatus.js, (String[]) null, (String[]) null);
        this.b.textPanel.setText(GlobalStatus.jt == null ? null : GlobalStatus.jt[this.b.gunDongListUi.g()], GlobalConfig.font2, (byte) 2);
        this.b.textPanel.setShuRuMoShi((byte) 1);
        this.b.bottomUi.a("选择");
        this.b.bottomUi.a(true);
        this.a.sceneSubState = 0;
        this.b.pageStatus = this.b.lastPageStatus;
        this.a.lastSceneModeId = this.a.currentSceneModeId = 52;
    }

    public final void r(int var1) {
        if (this.a.sceneSubState == 0) {
            if (this.b.mixedUi != null) {
                this.b.mixedUi.onClick(var1);
            }

            if (var1 == 8 || var1 == 516 || var1 == 2 || var1 == 518) {
                GlobalStatus.gQ = 1;
                this.q(this.b.topUi.a);
                if (this.b.topUi.a == 0) {
                    this.b.bottomUi.a("选择");
                    this.b.bottomUi.a(true);
                } else if (this.b.topUi.a == 1) {
                    this.b.bottomUi.a("购买");
                    this.b.bottomUi.a(true);
                }
            }

            if (var1 == 1 || var1 == 514 || var1 == 4 || var1 == 520) {
                label159:
                {
                    if (this.b.topUi.a == 0) {
                        if (GlobalStatus.jq == null) {
                            break label159;
                        }
                    } else if (GlobalStatus.jt == null) {
                        break label159;
                    }

                    this.b.textPanel.setText(this.b.topUi.a == 0 ? GlobalStatus.jq[this.b.gunDongListUi.g()] : GlobalStatus.jt[this.b.gunDongListUi.g()], GlobalConfig.font2, (byte) 2);
                    this.b.textPanel.setShuRuMoShi((byte) 1);
                }
            }

            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    GlobalStatus.I();
                    GlobalStatus.J();
                    this.a.lastSceneModeId = this.a.currentSceneModeId = 0;
                    return;
                }

                if (var1 == 1024) {
                    if (GlobalStatus.gQ > 1 && GlobalStatus.gR == 1) {
                        if (GlobalStatus.gQ - 1 <= 1) {
                            GlobalStatus.gQ = 1;
                        } else {
                            --GlobalStatus.gQ;
                        }

                        this.q(this.b.topUi.a);
                        return;
                    }

                    if (GlobalStatus.gQ > 1 && GlobalStatus.gR == 0) {
                        if (GlobalStatus.gQ - 1 < 1) {
                            GlobalStatus.gQ = 1;
                        } else {
                            --GlobalStatus.gQ;
                        }

                        this.q(this.b.topUi.a);
                        return;
                    }
                } else if (var1 == 2048) {
                    if (GlobalStatus.gQ <= 1 && GlobalStatus.gR == 1) {
                        ++GlobalStatus.gQ;
                        this.q(this.b.topUi.a);
                        return;
                    }

                    if (GlobalStatus.gQ > 1 && GlobalStatus.gR == 1) {
                        ++GlobalStatus.gQ;
                        this.q(this.b.topUi.a);
                        return;
                    }
                }
            } else {
                if (this.b.topUi.a == 0 && GlobalStatus.jo != null) {
                    LoadingPage.a(0 + GlobalConfig.gameX, 2 * GlobalConfig.font2_h + 11 + this.b.gunDongListUi.i() * GlobalConfig.font2_h + GlobalConfig.gameY, new String[]{"购买"}, true);
                    this.a.sceneSubState = 1;
                    return;
                }

                if (this.b.topUi.a == 1 && GlobalStatus.jr != null) {
                    LoadingPage.a(0 + GlobalConfig.gameX, 2 * GlobalConfig.font2_h + 11 + this.b.gunDongListUi.i() * GlobalConfig.font2_h + GlobalConfig.gameY, new String[]{"布置", "卖出"}, true);
                    this.a.sceneSubState = 2;
                    return;
                }
            }
        } else if (this.a.sceneSubState == 1) {
            LoadingPage.b(var1);
            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    this.a.sceneSubState = 0;
                    return;
                }
            } else {
                byte[] var2;
                if ((var2 = NetPayloadBuilder.l((short) 4233, GlobalStatus.roleId_2, (byte) GlobalStatus.jo[this.b.gunDongListUi.g()])) == null) {
                    this.b.showTips("获取上传指令数据错误!");
                    return;
                }

                MainCanvas.netUtils.sendPacket(new NetPacket((short) 4233, var2));
                this.b.showPending((String) null);
            }
        } else if (this.a.sceneSubState == 2) {
            LoadingPage.b(var1);
            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    this.a.sceneSubState = 0;
                }
            } else {
                if (LoadingPage.o == 0) {
                    this.a.a((String) GlobalStatus.js[this.b.gunDongListUi.g()], GlobalStatus.jr[this.b.gunDongListUi.g()], (short) GlobalStatus.ju[this.b.gunDongListUi.g()], (byte) 0, (byte) 4);
                    return;
                }

                if (LoadingPage.o == 1) {
                    byte[] var3;
                    if ((var3 = NetPayloadBuilder.y((short) 4237, GlobalStatus.roleId_2, GlobalStatus.jr[this.b.gunDongListUi.g()])) == null) {
                        this.b.showTips("获取上传指令数据错误!");
                        return;
                    }

                    MainCanvas.netUtils.sendPacket(new NetPacket((short) 4237, var3));
                    this.b.showPending((String) null);
                }
            }
        }

    }

    public final void a(String var1) {
        byte[] var2;
        if ((var2 = NetPayloadBuilder.d((short) 4864, var1, GlobalStatus.roleId_2, (short) GlobalStatus.gQ)) != null) {
            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4864, var2));
            this.b.showPending((String) null);
        } else {
            this.b.showTips("获取上传指令数据错误!");
        }
    }

    public final void a(byte var1, String var2) {
        byte[] var3;
        if ((var3 = NetPayloadBuilder.a((short) 4865, var2, (byte) var1, (String) GlobalStatus.roleId_2)) != null) {
            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4865, var3));
            this.b.showPending((String) null);
        } else {
            this.b.showTips("获取上传指令数据错误!");
        }
    }

    public final void u() {
        this.b.mixedUi.clear();
        this.b.mixedUi.setTitle("帮派外交");
        this.b.mixedUi.setDrawBackground(false);
        String[] var1 = null;
        int[] var2 = null;
        if (GlobalStatus.jY != null && GlobalStatus.jY.length > 0) {
            var1 = new String[GlobalStatus.jY.length];
            var2 = new int[GlobalStatus.jY.length];

            for (int var3 = 0; var3 < var1.length; ++var3) {
                var1[var3] = GlobalStatus.d(GlobalStatus.ka[var3]);
                if (GlobalStatus.ka[var3] == 2) {
                    var2[var3] = 12845056;
                } else if (GlobalStatus.ka[var3] == 3) {
                    var2[var3] = 16711680;
                } else {
                    var2[var3] = 16776960;
                }
            }
        }

        this.b.gunDongListUi.setValue((Image[]) null, GlobalStatus.jZ, (String[]) null, var1);
        this.b.gunDongListUi.setTopTips("搜索...");
        this.b.gunDongListUi.a(var2);
        this.b.gunDongListUi.a("帮派搜索", 1);
        this.b.bottomUi.a("确定");
        this.b.bottomUi.a(true);
        this.b.mixedUi.addChild((BaseUi) this.b.gunDongListUi);
        this.b.mixedUi.addChild((BaseUi) this.b.bottomUi);
        this.b.mixedUi.layout(GlobalConfig.gameX, GlobalConfig.gameY, GlobalConfig.realWidth, GlobalConfig.realHigh);
        LoadingPage.l = 0;
        this.a.sceneSubState = 0;
        this.b.pageStatus = this.b.lastPageStatus;
        this.a.lastSceneModeId = this.a.currentSceneModeId = 60;
    }

    private static String w(int var0) {
        if (var0 < 0) {
            return null;
        } else if (GlobalStatus.jY != null && GlobalStatus.jY.length != 0) {
            StringBuffer var1 = new StringBuffer();
            if (GlobalStatus.kb != null) {
                var1.append("对方状态：" + (GlobalStatus.kb[var0] == 0 ? "保护" : (GlobalStatus.kb[var0] == 1 ? "和平" : "战争")));
                var1.append('\t');
            }

            if (GlobalStatus.kc != null) {
                var1.append("对方态度：" + (GlobalStatus.kc[var0] == 0 ? "中立" : "敌对"));
                var1.append('\t');
            }

            if (GlobalStatus.kd != null) {
                var1.append("你的态度：" + (GlobalStatus.kd[var0] == 0 ? "中立" : "敌对"));
                var1.append('\t');
            }

            return var1.toString();
        } else {
            return null;
        }
    }

    public final void s(int var1) {
        if (this.a.sceneSubState == 0) {
            if (this.b.mixedUi != null) {
                this.b.mixedUi.onClick(var1);
            }

            if (var1 == 1 || var1 == 514 || var1 == 520 || var1 == 4) {
                boolean var2 = this.b.gunDongListUi.g() == this.b.gunDongListUi.h();
                this.b.gunDongListUi.a(var2 ? "帮派搜索" : w(this.b.gunDongListUi.g() - 1), 1);
            }

            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    this.a.lastSceneModeId = this.a.currentSceneModeId = 0;
                    return;
                }

                if (var1 == 1024) {
                    if (GlobalStatus.gQ > 1 && GlobalStatus.gR == 1) {
                        if (GlobalStatus.gQ - 1 <= 1) {
                            GlobalStatus.gQ = 1;
                        } else {
                            --GlobalStatus.gQ;
                        }

                        this.a(this.o);
                        return;
                    }

                    if (GlobalStatus.gQ > 1 && GlobalStatus.gR == 0) {
                        if (GlobalStatus.gQ - 1 < 1) {
                            GlobalStatus.gQ = 1;
                        } else {
                            --GlobalStatus.gQ;
                        }

                        this.a(this.o);
                        return;
                    }
                } else if (var1 == 2048) {
                    if (GlobalStatus.gQ <= 1 && GlobalStatus.gR == 1) {
                        ++GlobalStatus.gQ;
                        this.a(this.o);
                        return;
                    }

                    if (GlobalStatus.gQ > 1 && GlobalStatus.gR == 1) {
                        ++GlobalStatus.gQ;
                        this.a(this.o);
                        return;
                    }
                }
            } else {
                this.a.aA = this.b.gunDongListUi.h();
                this.a.aE = this.b.gunDongListUi.g();
                if (this.b.gunDongListUi.g() == this.b.gunDongListUi.h()) {
                    this.b.a((String) "请输入要搜索的帮派名称", (int) 0);
                    return;
                }

                if (GlobalStatus.jY != null) {
                    LoadingPage.a(GlobalConfig.gameX, GlobalConfig.font2_h + 11 + this.b.gunDongListUi.i() * GlobalConfig.font2_h + GlobalConfig.gameY, new String[]{"查看", "外交", "宣战"}, true);
                    this.a.sceneSubState = 1;
                    return;
                }
            }
        } else if (this.a.sceneSubState == 1) {
            LoadingPage.b(var1);
            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    this.a.sceneSubState = 0;
                    return;
                }
            } else {
                this.b.aw = LoadingPage.o;
                if (LoadingPage.o == 0) {
                    this.b(GlobalStatus.jY[this.b.gunDongListUi.g() - 1]);
                    return;
                }

                if (LoadingPage.o == 1) {
                    LoadingPage.a(0, GlobalConfig.font2_h + 11 + this.b.gunDongListUi.i() * GlobalConfig.font2_h + GlobalConfig.gameY, new String[]{"中立", "敌对"}, true);
                    this.a.sceneSubState = 2;
                    return;
                }

                if (LoadingPage.o == 2) {
                    LoadingPage.h = 0;
                    this.a.sceneSubState = 3;
                    return;
                }
            }
        } else if (this.a.sceneSubState == 2) {
            LoadingPage.b(var1);
            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    this.a.sceneSubState = 0;
                    return;
                }
            } else {
                if (LoadingPage.o == 0) {
                    this.a((byte) 1, GlobalStatus.jY[this.b.gunDongListUi.g() - 1]);
                    return;
                }

                if (LoadingPage.o == 1) {
                    this.a((byte) 2, GlobalStatus.jY[this.b.gunDongListUi.g() - 1]);
                    return;
                }
            }
        } else if (this.a.sceneSubState == 3) {
            if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
                this.b.a((String) "输入OK确认宣战", (int) 0);
                return;
            }

            if (var1 == 536870912) {
                this.a.sceneSubState = 0;
            }
        }

    }

    public final void a(String var1, byte var2) {
        byte[] var3;
        if ((var3 = NetPayloadBuilder.b((short) 4866, var1, var2, GlobalStatus.roleId_2)) != null) {
            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4866, var3));
            this.b.showPending((String) null);
        } else {
            this.b.showTips("获取上传指令数据错误!");
        }
    }

    public final void v() {
        this.a.M();
        if (this.b.keyCombination != 8 && this.b.keyCombination != 516) {
            if (this.b.keyCombination != 2 && this.b.keyCombination != 518) {
                if (this.b.keyCombination != 1 && this.b.keyCombination != 514) {
                    if (this.b.keyCombination == 4 || this.b.keyCombination == 520) {
                        GameSceneController.i_1 = GameSceneController.i_1 + 4 > this.a.f.b - GlobalConfig.defaultHigh ? this.a.f.b - GlobalConfig.defaultHigh : GameSceneController.i_1 + 4;
                    }
                } else {
                    GameSceneController.i_1 = GameSceneController.i_1 - 4 < 0 ? 0 : GameSceneController.i_1 - 4;
                }
            } else {
                GameSceneController.h = GameSceneController.h + 4 > this.a.f.a - GlobalConfig.defaultWidth ? this.a.f.a - GlobalConfig.defaultWidth : GameSceneController.h + 4;
            }
        } else {
            GameSceneController.h = GameSceneController.h - 4 < 0 ? 0 : GameSceneController.h - 4;
        }

        if (GlobalStatus.bw != 2 || GlobalStatus.kj == 0) {
            GlobalStatus.kj = 0;
            GameSceneController.h = this.s;
            GameSceneController.i_1 = this.t;
            this.a.sceneSubState = 0;
            this.a.lastSceneModeId = this.a.currentSceneModeId = 0;
            this.b.keyCombination = 0;
            this.b.inputAction = 0;
        }

    }

    private void b(String var1) {
        byte[] var2;
        if ((var2 = NetPayloadBuilder.o((short) 4868, var1, GlobalStatus.roleId_2)) != null) {
            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4868, var2));
        } else {
            this.b.showTips("获取上传指令数据错误!");
        }
    }

    private void C() {
        byte[] var1;
        if ((var1 = NetPayloadBuilder.l((short) 4869, GlobalStatus.roleId_2, (short) GlobalStatus.gQ)) != null) {
            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4869, var1));
            this.b.showPending((String) null);
        } else {
            this.b.showTips("获取上传指令数据错误!");
        }
    }

    public final void w() {
        LoadingPage.h = 0;
        this.a.sceneSubState = 0;
        this.b.pageStatus = this.b.lastPageStatus;
        this.a.lastSceneModeId = this.a.currentSceneModeId = 62;
    }

    public final void t(int var1) {
        if (this.a.sceneSubState == 0) {
            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    this.a.al = null;
                    this.a.lastSceneModeId = this.a.currentSceneModeId = 0;
                }
            } else {
                byte[] var2;
                if ((var2 = NetPayloadBuilder.v((short) 4871, GlobalStatus.roleId_2)) == null) {
                    this.b.showTips("获取上传指令数据错误!");
                    return;
                }

                MainCanvas.netUtils.sendPacket(new NetPacket((short) 4871, var2));
                this.b.showPending((String) null);
            }
        }

    }

    public final void x() {
        if (GlobalStatus.kE != null) {
            this.b.mixedUi.clear();
            this.b.mixedUi.setTitle("战争捷报");
            this.b.mixedUi.setDrawBackground(false);
            this.b.gunDongListUi.setValue((Image[]) null, GlobalStatus.kE, (String[]) null, (String[]) null);
            this.b.textPanel.setText(GlobalStatus.kF[0], GlobalConfig.font2, (byte) 2);
            this.b.textPanel.setShuRuMoShi((byte) 1);
            this.b.bottomUi.a("确定");
            this.b.mixedUi.addChild((BaseUi) this.b.gunDongListUi);
            this.b.mixedUi.addChild((BaseUi) this.b.textPanel);
            this.b.mixedUi.addChild((BaseUi) this.b.bottomUi);
            MixedUi var10000 = this.b.mixedUi;
            int var2 = 2 * GlobalConfig.font2_h + 8;
            MixedUi var1 = var10000;
            var10000.e = var2;
            int var3 = var1.e;
            this.b.mixedUi.layout(GlobalConfig.gameX, GlobalConfig.gameY, GlobalConfig.realWidth, GlobalConfig.realHigh);
            this.a.sceneSubState = 0;
            this.b.pageStatus = this.b.lastPageStatus;
            this.a.lastSceneModeId = this.a.currentSceneModeId = 63;
        }

    }

    public final void u(int var1) {
        if (this.a.sceneSubState == 0 && GlobalStatus.kE != null) {
            if (this.b.mixedUi != null) {
                this.b.mixedUi.onClick(var1);
            }

            if (var1 == 1 || var1 == 514 || var1 == 520 || var1 == 4) {
                this.b.textPanel.setText(GlobalStatus.kF[this.b.gunDongListUi.g()], GlobalConfig.font2, (byte) 2);
                this.b.textPanel.setShuRuMoShi((byte) 1);
            }

            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    this.a.sceneSubState = 0;
                    this.a.lastSceneModeId = this.a.currentSceneModeId = 0;
                }
            } else {
                this.a.aA = this.b.gunDongListUi.h();
                this.a.aE = this.b.gunDongListUi.g();
                switch (this.a.aE) {
                    case 0:
                        this.b.a((String) "请输入警告语（30个字符内）", (int) 0);
                        break;
                    case 1:
                    case 2:
                    case 3:
                        this.b((byte) this.b.gunDongListUi.g(), (String) null);
                    default:
                        return;
                }
            }
        }

    }

    public final void b(byte var1, String var2) {
        byte[] var3;
        if ((var3 = NetPayloadBuilder.c((short) 4872, GlobalStatus.roleId_2, var1, var2)) != null) {
            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4872, var3));
        } else {
            this.b.showTips("获取上传指令数据错误!");
        }
    }

    public final void y() {
        this.b.mixedUi.clean();
        this.b.mixedUi.setTitle("帮派升级");
        this.b.mixedUi.setDrawBackground(false);
        this.b.textPanel.setText(GlobalStatus.mw == null ? "暂无帮派升级信息" : GlobalStatus.mw, GlobalConfig.font2, (byte) 0);
        this.b.mixedUi.addChild((BaseUi) this.b.textPanel);
        this.b.bottomUi.a("升级");
        this.b.mixedUi.addChild((BaseUi) this.b.textPanel);
        if (GlobalConfig.defaultHigh > 220) {
            this.b.mixedUi.addChild((BaseUi) this.b.bottomUi);
        }

        this.b.mixedUi.layout(GlobalConfig.gameX, GlobalConfig.gameY, GlobalConfig.realWidth, GlobalConfig.realHigh);
        this.a.sceneSubState = 0;
        this.b.pageStatus = this.b.lastPageStatus;
        this.a.lastSceneModeId = this.a.currentSceneModeId = 113;
    }

    public final void v(int var1) {
        if (this.a.sceneSubState == 0) {
            if (this.b.mixedUi != null) {
                this.b.mixedUi.onClick(var1);
            }

            if (var1 == 268435456 || var1 == 1073741824 || var1 == 517) {
                this.a((byte) 2);
                return;
            }

            if (var1 == 536870912) {
                this.a(true);
            }
        }

    }

    public final void d(Graphics var1) {
        if (this.a.sceneSubState == 0 && this.b.mixedUi != null) {
            this.b.mixedUi.draw(var1);
        }

    }
}

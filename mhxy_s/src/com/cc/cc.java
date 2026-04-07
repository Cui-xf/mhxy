package com.cc;

import com.cc.resource.Animation;
import com.cc.resource.ResourceManager;
import com.yinhan.kjava.main.MainCanvas;

import java.io.DataInputStream;
import java.io.IOException;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class cc {
    private GameSceneController uiSceneController;
    private MainCanvas mainCanvas;
    private int[][] d = null;
    private int e;
    private Animation[] f = null;
    private int g = 0;
    public short a = 0;
    private short h = 0;
    private short i = 0;
    private int j = 0;
    private String[] k = null;
    private String[] l = null;
    private short[] m = null;
    private int[] n = null;
    private String[] o = null;
    private String[] p = null;
    private int[] q = null;
    private byte[] r = null;
    private String[] s = null;
    private byte[] t = null;
    private byte[] u = null;
    private int[] v = null;
    private String[] w = null;
    private String[] x = null;
    private String[] y = null;
    private String[] z = null;
    private String[] A = null;
    private int[] B = null;
    private String C = null;

    public cc(GameSceneController var1, MainCanvas var2) {
        this.uiSceneController = var1;
        this.mainCanvas = var2;
    }

    public final void a(short var1) {
        if (this.d == null) {
            this.d = new int[4][4];
            this.f = new Animation[4];
        }

        if (this.p != null) {
            for (int var2 = 0; var2 < this.f.length && var2 < this.p.length; ++var2) {
                this.f[var2] = MainCanvas.role.getAnimationByNameFromCache((String) this.s[var2], (short) 0, (short) 0, (short) 0);
                if (this.f[var2] == null) {
                    MainCanvas.a(this.t[var2], this.u[var2], (byte) 0, (byte) 0, this.s[var2], (short) 0, (short) 0, (short) 0);
                    this.f[var2] = MainCanvas.role.getAnimationByKeyFromCache((int) this.v[var2], (short) 0, (short) 0, (short) 0);
                }
            }
        }

        this.uiSceneController.sceneSubState = 0;
        this.mainCanvas.mixedUi.clear();
        this.mainCanvas.mixedUi.setTitle("仙位排位赛");
        this.mainCanvas.topUi.a(new String[]{"风云榜", "斗法场", "斗法记录"});
        this.mainCanvas.topUi.a = (byte) var1;
        this.a = (short) var1;
        this.mainCanvas.mixedUi.addChild((BaseUi) this.mainCanvas.topUi);
        this.mainCanvas.mixedUi.setDrawBackground(true);
        if (this.a == 0) {
            this.mainCanvas.textPanel.setText("", GlobalConfig.font2, (byte) 1);
            this.mainCanvas.mixedUi.addChild((BaseUi) this.mainCanvas.textPanel);
            this.mainCanvas.bottomUi.setButtonText(new String[]{"操作", "返回"});
            this.mainCanvas.mixedUi.addChild((BaseUi) this.mainCanvas.bottomUi);
            this.mainCanvas.mixedUi.layout(GlobalConfig.gameX, GlobalConfig.gameY, GlobalConfig.realWidth, GlobalConfig.realHigh);
            this.e = this.mainCanvas.textPanel.textH;
            int var5 = (this.mainCanvas.mixedUi.W - 16 - 2) / 2;
            int var1_t = (this.mainCanvas.textPanel.textH - 6) / 2;

            for (int var3 = 0; var3 < this.d.length; ++var3) {
                this.d[var3][0] = this.mainCanvas.textPanel.textX + 2 + var3 % 2 * (var5 + 2);
                this.d[var3][1] = this.mainCanvas.textPanel.textY + 2 + var3 / 2 * (var1_t + 2);
                this.d[var3][2] = var5;
                this.d[var3][3] = var1_t;
            }
        } else if (this.a == 1) {
            this.mainCanvas.gunDongListUi.setValue((Image[]) null, this.w, this.x, this.y);
            this.mainCanvas.gunDongListUi.a(this.B);
            this.mainCanvas.mixedUi.addChild((BaseUi) this.mainCanvas.gunDongListUi);
            this.mainCanvas.mixedUi.layout(GlobalConfig.gameX, GlobalConfig.gameY, GlobalConfig.realWidth, GlobalConfig.realHigh);
        } else if (this.a == 2) {
            this.mainCanvas.textPanel.setText(this.C, GlobalConfig.font2, (byte) 1);
            this.mainCanvas.mixedUi.addChild((BaseUi) this.mainCanvas.textPanel);
            this.mainCanvas.bottomUi.setButtonText(new String[]{"购买次数", "返回"});
            this.mainCanvas.mixedUi.addChild((BaseUi) this.mainCanvas.bottomUi);
            this.mainCanvas.mixedUi.layout(GlobalConfig.gameX, GlobalConfig.gameY, GlobalConfig.realWidth, GlobalConfig.realHigh);
            this.e = GlobalConfig.font2_h * 3 + 4;
            this.mainCanvas.textPanel.setTextRect(this.mainCanvas.textPanel.textX, this.mainCanvas.textPanel.textY, this.mainCanvas.textPanel.textW, this.mainCanvas.textPanel.textH - this.e - 2);
            GameSceneController.K = new FWBRender("当前排名：" + (this.h <= 0 ? "无" : "第" + this.h + "名") + "\t剩余挑战：" + this.i + "次\t当前积分：" + this.j, (short) (this.mainCanvas.textPanel.textW - 20));
        }

        this.mainCanvas.pageStatus = this.mainCanvas.lastPageStatus;
        this.uiSceneController.lastSceneModeId = this.uiSceneController.currentSceneModeId = 130;
    }

    public final void a(int var1) {
        if (this.uiSceneController.sceneSubState == 0) {
            if (this.mainCanvas.mixedUi != null) {
                this.mainCanvas.mixedUi.onClick(var1);
            }

            if (var1 == 536870912) {
                this.uiSceneController.N();
                this.a();
                return;
            }

            if (var1 == 8 || var1 == 2 || var1 == 516 || var1 == 518) {
                this.a((short) this.mainCanvas.topUi.a);
                return;
            }

            if (var1 == 1 || var1 == 514) {
                --this.g;
                this.g = this.g < 0 ? 3 : this.g;
                return;
            }

            if (var1 == 4 || var1 == 520) {
                ++this.g;
                this.g %= 4;
                return;
            }

            if (this.a == 0) {
                for (int var10 = 0; var10 < this.f.length; ++var10) {
                    PngUtil.animate(this.f[var10], this.mainCanvas.frameStartTs);
                }

                if ((var1 == 1073741824 || var1 == 517 || var1 == 268435456) && this.g >= 0 && this.g <= 3 && this.p != null && this.g < this.p.length) {
                    LoadingPage.a(this.d[this.g][0] + 30, this.d[this.g][1] + 20, new String[]{"属性", "装备"}, false);
                    this.uiSceneController.sceneSubState = 1;
                    return;
                }
            } else if (this.a == 1) {
                if ((var1 == 268435456 || var1 == 1073741824 || var1 == 517) && this.mainCanvas.gunDongListUi.g() > 0) {
                    LoadingPage.a(GlobalConfig.realWidth / 3, this.mainCanvas.gunDongListUi.b() + 40, new String[]{"挑战", "属性", "装备"}, false);
                    this.uiSceneController.sceneSubState = 1;
                    return;
                }
            } else if (this.a == 2 && (var1 == 268435456 || var1 == 1073741824 || var1 == 517)) {
                this.a = (short) this.mainCanvas.topUi.a;
                byte[] var11;
                if ((var11 = NetPayloadBuilder.d((short) 4690, (byte) 2, "")) == null) {
                    this.mainCanvas.showTips("获取上传指令数据错误!");
                    return;
                }

                NetPacket var7 = new NetPacket((short) 4690, var11);
                MainCanvas.netUtils.sendPacket(var7);
                this.mainCanvas.showPending((String) null);
            }
        } else if (this.uiSceneController.sceneSubState == 1) {
            LoadingPage.b(var1);
            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    this.uiSceneController.sceneSubState = 0;
                    return;
                }
            } else {
                this.a = (short) this.mainCanvas.topUi.a;
                if (LoadingPage.o == 0 && this.a == 1) {
                    LoadingPage.h = 0;
                    this.uiSceneController.sceneSubState = 2;
                    return;
                }

                if (LoadingPage.o == 1 && this.a == 1 || LoadingPage.o == 0 && this.a == 0) {
                    this.a = (short) this.mainCanvas.topUi.a;
                    String var8 = this.a == 0 ? this.p[this.g] : this.A[this.mainCanvas.gunDongListUi.g() - 1];
                    byte[] var4;
                    if ((var4 = NetPayloadBuilder.a((short) 4110, GlobalStatus.roleId_2, var8, (byte) 0)) == null) {
                        this.mainCanvas.showTips("获取上传指令数据错误!");
                        return;
                    }

                    MainCanvas.netUtils.sendPacket(new NetPacket((short) 4110, var4));
                    this.mainCanvas.showPending((String) null);
                } else {
                    this.a = (short) this.mainCanvas.topUi.a;
                    String var2 = this.a == 0 ? this.p[this.g] : this.A[this.mainCanvas.gunDongListUi.g() - 1];
                    byte[] var3;
                    if ((var3 = NetPayloadBuilder.b((short) 4111, GlobalStatus.roleId_2, var2)) == null) {
                        this.mainCanvas.showTips("获取上传指令数据错误!");
                        return;
                    }

                    MainCanvas.netUtils.sendPacket(new NetPacket((short) 4111, var3));
                    this.mainCanvas.showPending((String) null);
                }
            }
        } else if (this.uiSceneController.sceneSubState == 2) {
            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    this.uiSceneController.sceneSubState = 1;
                    return;
                }
            } else {
                String var9 = this.a == 0 ? this.o[this.g] : this.z[this.mainCanvas.gunDongListUi.g() - 1];
                byte[] var5;
                if ((var5 = NetPayloadBuilder.d((short) 4690, (byte) 1, var9)) == null) {
                    this.mainCanvas.showTips("获取上传指令数据错误!");
                    return;
                }

                NetPacket var6 = new NetPacket((short) 4690, var5);
                MainCanvas.netUtils.sendPacket(var6);
                this.mainCanvas.showPending((String) null);
            }
        } else if (this.uiSceneController.sceneSubState == 3) {
            this.uiSceneController.T.onClick(var1);
            if (var1 == 536870912) {
                this.uiSceneController.T.clear();
                this.uiSceneController.sceneSubState = 1;
                return;
            }
        } else if (this.uiSceneController.sceneSubState == 4) {
            this.uiSceneController.a(GlobalStatus.cJ);
            this.uiSceneController.g(var1);
            if (var1 == 536870912) {
                if (this.uiSceneController.sceneSubMode == 0) {
                    if (GlobalStatus.cJ != null) {
                        GlobalStatus.o();
                    }

                    this.uiSceneController.T.clear();
                    this.uiSceneController.sceneSubState = 1;
                    return;
                }

                if (this.uiSceneController.sceneSubMode == 1) {
                    this.uiSceneController.sceneSubMode = 0;
                }
            }
        }

    }

    public final void a(Graphics var1) {
        if (this.mainCanvas.mixedUi != null) {
            if (this.uiSceneController.sceneSubState == 4) {
                this.uiSceneController.a(var1, "", GameSceneController.q);
                return;
            }

            this.mainCanvas.mixedUi.draw(var1);
            if (this.a == 0) {
                for (int var2 = 0; var2 < this.d.length; ++var2) {
                    LoadingPage.a(var1, (Image) null, this.d[var2][0], this.d[var2][1], this.d[var2][2], this.d[var2][3], var2 == this.g);
                    if (this.p != null && var2 < this.p.length) {
                        var1.setColor(65535);
                        var1.drawString(this.l[var2], this.d[var2][0] + (this.d[var2][2] - GlobalConfig.font2.stringWidth(this.l[var2])) / 2, this.d[var2][1] + 4, 20);
                        var1.setColor(16777215);
                        var1.drawString(this.k[var2], this.d[var2][0] + (this.d[var2][2] - GlobalConfig.font2.stringWidth(this.k[var2])) / 2, this.d[var2][1] + this.d[var2][3] - GlobalConfig.font2_h - 4, 20);
                        MainCanvas.pngUtil.a(var1, (Animation) this.f[var2], (int[]) null, 0, 0, this.d[var2][0] + this.d[var2][2] / 2, this.d[var2][1] + this.d[var2][3] / 4 * 3, 20, 0);
                    }
                }
            } else if (this.a != 1 && this.a == 2) {
                LoadingPage.draw(var1, this.mainCanvas.textPanel.textX, this.mainCanvas.textPanel.textY + this.mainCanvas.textPanel.textH + 1, this.mainCanvas.textPanel.textW, this.e + 1, 1);
                GameSceneController.K.a(var1, this.mainCanvas.textPanel.textX + 10, this.mainCanvas.textPanel.textY + this.mainCanvas.textPanel.textH + 4, 0);
            }

            if (this.uiSceneController.sceneSubState == 1) {
                LoadingPage.c(var1);
                return;
            }

            if (this.uiSceneController.sceneSubState == 2) {
                LoadingPage.drawDialog(var1, "确定挑战该玩家?", new String[]{"确定", "取消"});
                return;
            }

            if (this.uiSceneController.sceneSubState == 3) {
                this.uiSceneController.T.draw(var1);
            }
        }

    }

    public final int a(int var1, int var2, int var3) {
        if (this.a == 0 && this.p != null) {
            for (int var4 = 0; var4 < this.d.length && var4 < this.p.length; ++var4) {
                if (var2 >= this.d[var4][0] && var2 <= this.d[var4][0] + this.d[var4][2] && var3 >= this.d[var4][1] && var3 <= this.d[var4][1] + this.d[var4][3]) {
                    if (this.g == var4) {
                        return 1073741824;
                    }

                    this.g = (byte) var4;
                }
            }
        }

        return var1;
    }

    public final void a(DataInputStream var1) throws IOException {
        this.h = var1.readShort();
        this.i = var1.readShort();
        this.j = var1.readInt();
        short var2;
        if ((var2 = var1.readShort()) > 0) {
            this.k = new String[var2];
            this.l = new String[var2];
            this.m = new short[var2];
            this.n = new int[var2];
            this.o = new String[var2];
            this.p = new String[var2];
            this.q = new int[var2];
            this.r = new byte[var2];
            this.s = new String[var2];
            this.t = new byte[var2];
            this.u = new byte[var2];
            this.v = new int[var2];

            for (int var3 = 0; var3 < var2; ++var3) {
                this.k[var3] = "第" + var1.readShort() + "名";
                this.l[var3] = var1.readUTF();
                this.m[var3] = var1.readShort();
                this.n[var3] = var1.readInt();
                this.o[var3] = var1.readUTF();
                this.p[var3] = var1.readUTF();
                this.q[var3] = LoadingPage.pickColor(var1.readInt());
                this.r[var3] = var1.readByte();
                this.s[var3] = var1.readUTF();
                this.t[var3] = var1.readByte();
                this.u[var3] = var1.readByte();
                this.v[var3] = ResourceManager.buildResourceId((String) MainCanvas.a(this.t[var3], this.u[var3], (byte) 0, (byte) 0, false, this.s[var3]), (byte) 2);
            }
        } else {
            this.k = null;
            this.l = null;
            this.m = null;
            this.n = null;
            this.o = null;
            this.p = null;
            this.q = null;
            this.r = null;
            this.s = null;
            this.t = null;
            this.u = null;
            this.v = null;
        }

        short var6;
        if ((var6 = var1.readShort()) > 0) {
            this.w = new String[var6 + 1];
            this.x = new String[var6 + 1];
            this.y = new String[var6 + 1];
            this.z = new String[var6];
            this.A = new String[var6];
            this.B = new int[var6 + 1];
            this.w[0] = "排行";
            this.x[0] = "昵称";
            this.y[0] = "战力";
            this.B[0] = LoadingPage.pickColor(0);

            for (int var5 = 0; var5 < var6; ++var5) {
                this.w[var5 + 1] = var1.readShort() + "";
                this.x[var5 + 1] = var1.readUTF() + "(" + var1.readShort() + "级)";
                this.y[var5 + 1] = var1.readInt() + "";
                this.z[var5] = var1.readUTF();
                this.A[var5] = var1.readUTF();
                int var4 = var1.readInt();
                this.B[var5 + 1] = LoadingPage.pickColor(var4 == 0 ? 15 : 5);
            }
        } else {
            this.w = null;
            this.x = null;
            this.y = null;
            this.z = null;
            this.A = null;
        }

        this.C = var1.readUTF();
    }

    public final void b(DataInputStream var1) throws IOException {
        this.i = var1.readShort();
    }

    public final void a() {
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = null;
        this.B = null;
        if (this.d != null) {
            for (int var1 = 0; var1 < this.d.length; ++var1) {
                this.d[var1] = null;
            }
        }

        this.d = null;
        if (this.f != null) {
            for (int var2 = 0; var2 < this.f.length; ++var2) {
                this.f[var2] = null;
            }
        }

        this.f = null;
    }
}

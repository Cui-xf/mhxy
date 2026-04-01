package com.cc;

import com.yinhan.kjava.main.MainCanvas;

import java.io.DataInputStream;
import java.io.IOException;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class cc {
    private ao_1 b;
    private MainCanvas c;
    private int[][] d = null;
    private int e;
    private Frame1[] f = null;
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

    public cc(ao_1 var1, MainCanvas var2) {
        this.b = var1;
        this.c = var2;
    }

    public final void a(short var1) {
        if (this.d == null) {
            this.d = new int[4][4];
            this.f = new Frame1[4];
        }

        if (this.p != null) {
            for (int var2 = 0; var2 < this.f.length && var2 < this.p.length; ++var2) {
                this.f[var2] = MainCanvas.ab.a((String) this.s[var2], (short) 0, (short) 0, (short) 0);
                if (this.f[var2] == null) {
                    MainCanvas.a(this.t[var2], this.u[var2], (byte) 0, (byte) 0, this.s[var2], (short) 0, (short) 0, (short) 0);
                    this.f[var2] = MainCanvas.ab.a((int) this.v[var2], (short) 0, (short) 0, (short) 0);
                }
            }
        }

        this.b.l = 0;
        this.c.aq.j();
        this.c.aq.a("仙位排位赛");
        this.c.as.a(new String[]{"风云榜", "斗法场", "斗法记录"});
        this.c.as.a = (byte) var1;
        this.a = (short) var1;
        this.c.aq.a((al) this.c.as);
        this.c.aq.a(true);
        if (this.a == 0) {
            this.c.at.b("", GlobalConfig.i, (byte) 1);
            this.c.aq.a((al) this.c.at);
            this.c.au.a(new String[]{"操作", "返回"});
            this.c.aq.a((al) this.c.au);
            this.c.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
            this.e = this.c.at.e;
            int var5 = (this.c.aq.c - 16 - 2) / 2;
            int var1_t = (this.c.at.e - 6) / 2;

            for (int var3 = 0; var3 < this.d.length; ++var3) {
                this.d[var3][0] = this.c.at.b + 2 + var3 % 2 * (var5 + 2);
                this.d[var3][1] = this.c.at.c + 2 + var3 / 2 * (var1_t + 2);
                this.d[var3][2] = var5;
                this.d[var3][3] = var1_t;
            }
        } else if (this.a == 1) {
            this.c.ar.a((Image[]) null, this.w, this.x, this.y);
            this.c.ar.a(this.B);
            this.c.aq.a((al) this.c.ar);
            this.c.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
        } else if (this.a == 2) {
            this.c.at.b(this.C, GlobalConfig.i, (byte) 1);
            this.c.aq.a((al) this.c.at);
            this.c.au.a(new String[]{"购买次数", "返回"});
            this.c.aq.a((al) this.c.au);
            this.c.aq.a(GlobalConfig.f, GlobalConfig.g, GlobalConfig.realWidth, GlobalConfig.realHigh);
            this.e = GlobalConfig.j * 3 + 4;
            this.c.at.a(this.c.at.b, this.c.at.c, this.c.at.d, this.c.at.e - this.e - 2);
            ao_1.K = new TextRender("当前排名：" + (this.h <= 0 ? "无" : "第" + this.h + "名") + "\t剩余挑战：" + this.i + "次\t当前积分：" + this.j, (short) (this.c.at.d - 20));
        }

        this.c.touchPageCase = this.c.k;
        this.b.j = this.b.k = 130;
    }

    public final void a(int var1) {
        if (this.b.l == 0) {
            if (this.c.aq != null) {
                this.c.aq.b(var1);
            }

            if (var1 == 536870912) {
                this.b.N();
                this.a();
                return;
            }

            if (var1 == 8 || var1 == 2 || var1 == 516 || var1 == 518) {
                this.a((short) this.c.as.a);
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
                    PngUtil.a(this.f[var10], this.c.ak);
                }

                if ((var1 == 1073741824 || var1 == 517 || var1 == 268435456) && this.g >= 0 && this.g <= 3 && this.p != null && this.g < this.p.length) {
                    LoadingPage.a(this.d[this.g][0] + 30, this.d[this.g][1] + 20, new String[]{"属性", "装备"}, false);
                    this.b.l = 1;
                    return;
                }
            } else if (this.a == 1) {
                if ((var1 == 268435456 || var1 == 1073741824 || var1 == 517) && this.c.ar.g() > 0) {
                    LoadingPage.a(GlobalConfig.realWidth / 3, this.c.ar.b() + 40, new String[]{"挑战", "属性", "装备"}, false);
                    this.b.l = 1;
                    return;
                }
            } else if (this.a == 2 && (var1 == 268435456 || var1 == 1073741824 || var1 == 517)) {
                this.a = (short) this.c.as.a;
                byte[] var11;
                if ((var11 = NetPayloadBuilder.d((short) 4690, (byte) 2, "")) == null) {
                    this.c.b("获取上传指令数据错误!");
                    return;
                }

                NetPacket var7 = new NetPacket((short) 4690, var11);
                MainCanvas.netUtils.sendPacket(var7);
                this.c.a((String) null);
            }
        } else if (this.b.l == 1) {
            LoadingPage.b(var1);
            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    this.b.l = 0;
                    return;
                }
            } else {
                this.a = (short) this.c.as.a;
                if (LoadingPage.o == 0 && this.a == 1) {
                    LoadingPage.h = 0;
                    this.b.l = 2;
                    return;
                }

                if (LoadingPage.o == 1 && this.a == 1 || LoadingPage.o == 0 && this.a == 0) {
                    this.a = (short) this.c.as.a;
                    String var8 = this.a == 0 ? this.p[this.g] : this.A[this.c.ar.g() - 1];
                    byte[] var4;
                    if ((var4 = NetPayloadBuilder.a((short) 4110, GlobalStatus.ad, var8, (byte) 0)) == null) {
                        this.c.b("获取上传指令数据错误!");
                        return;
                    }

                    MainCanvas.netUtils.sendPacket(new NetPacket((short) 4110, var4));
                    this.c.a((String) null);
                } else {
                    this.a = (short) this.c.as.a;
                    String var2 = this.a == 0 ? this.p[this.g] : this.A[this.c.ar.g() - 1];
                    byte[] var3;
                    if ((var3 = NetPayloadBuilder.b((short) 4111, GlobalStatus.ad, var2)) == null) {
                        this.c.b("获取上传指令数据错误!");
                        return;
                    }

                    MainCanvas.netUtils.sendPacket(new NetPacket((short) 4111, var3));
                    this.c.a((String) null);
                }
            }
        } else if (this.b.l == 2) {
            if (var1 != 268435456 && var1 != 1073741824 && var1 != 517) {
                if (var1 == 536870912) {
                    this.b.l = 1;
                    return;
                }
            } else {
                String var9 = this.a == 0 ? this.o[this.g] : this.z[this.c.ar.g() - 1];
                byte[] var5;
                if ((var5 = NetPayloadBuilder.d((short) 4690, (byte) 1, var9)) == null) {
                    this.c.b("获取上传指令数据错误!");
                    return;
                }

                NetPacket var6 = new NetPacket((short) 4690, var5);
                MainCanvas.netUtils.sendPacket(var6);
                this.c.a((String) null);
            }
        } else if (this.b.l == 3) {
            this.b.T.b(var1);
            if (var1 == 536870912) {
                this.b.T.j();
                this.b.l = 1;
                return;
            }
        } else if (this.b.l == 4) {
            this.b.a(GlobalStatus.cJ);
            this.b.g(var1);
            if (var1 == 536870912) {
                if (this.b.m == 0) {
                    if (GlobalStatus.cJ != null) {
                        GlobalStatus.o();
                    }

                    this.b.T.j();
                    this.b.l = 1;
                    return;
                }

                if (this.b.m == 1) {
                    this.b.m = 0;
                }
            }
        }

    }

    public final void a(Graphics var1) {
        if (this.c.aq != null) {
            if (this.b.l == 4) {
                this.b.a(var1, "", ao_1.q);
                return;
            }

            this.c.aq.a(var1);
            if (this.a == 0) {
                for (int var2 = 0; var2 < this.d.length; ++var2) {
                    LoadingPage.a(var1, (Image) null, this.d[var2][0], this.d[var2][1], this.d[var2][2], this.d[var2][3], var2 == this.g);
                    if (this.p != null && var2 < this.p.length) {
                        var1.setColor(65535);
                        var1.drawString(this.l[var2], this.d[var2][0] + (this.d[var2][2] - GlobalConfig.i.stringWidth(this.l[var2])) / 2, this.d[var2][1] + 4, 20);
                        var1.setColor(16777215);
                        var1.drawString(this.k[var2], this.d[var2][0] + (this.d[var2][2] - GlobalConfig.i.stringWidth(this.k[var2])) / 2, this.d[var2][1] + this.d[var2][3] - GlobalConfig.j - 4, 20);
                        MainCanvas.f.a(var1, (Frame1) this.f[var2], (int[]) null, 0, 0, this.d[var2][0] + this.d[var2][2] / 2, this.d[var2][1] + this.d[var2][3] / 4 * 3, 20, 0);
                    }
                }
            } else if (this.a != 1 && this.a == 2) {
                LoadingPage.a(var1, this.c.at.b, this.c.at.c + this.c.at.e + 1, this.c.at.d, this.e + 1, 1);
                ao_1.K.a(var1, this.c.at.b + 10, this.c.at.c + this.c.at.e + 4, 0);
            }

            if (this.b.l == 1) {
                LoadingPage.c(var1);
                return;
            }

            if (this.b.l == 2) {
                LoadingPage.a(var1, "确定挑战该玩家?", new String[]{"确定", "取消"});
                return;
            }

            if (this.b.l == 3) {
                this.b.T.a(var1);
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
                this.q[var3] = LoadingPage.a(var1.readInt());
                this.r[var3] = var1.readByte();
                this.s[var3] = var1.readUTF();
                this.t[var3] = var1.readByte();
                this.u[var3] = var1.readByte();
                this.v[var3] = Page.a((String) MainCanvas.a(this.t[var3], this.u[var3], (byte) 0, (byte) 0, false, this.s[var3]), (byte) 2);
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
            this.B[0] = LoadingPage.a(0);

            for (int var5 = 0; var5 < var6; ++var5) {
                this.w[var5 + 1] = var1.readShort() + "";
                this.x[var5 + 1] = var1.readUTF() + "(" + var1.readShort() + "级)";
                this.y[var5 + 1] = var1.readInt() + "";
                this.z[var5] = var1.readUTF();
                this.A[var5] = var1.readUTF();
                int var4 = var1.readInt();
                this.B[var5 + 1] = LoadingPage.a(var4 == 0 ? 15 : 5);
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

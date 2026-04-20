package com.cc;

import com.cc.resource.Animation;
import com.yinhan.kjava.main.MainCanvas;

import javax.microedition.lcdui.Graphics;
import java.util.Vector;

public final class FightModel {
    /**
     * 对话/战斗文字滚动速度（帧间隔），由服务器配置包8729写入，进入战斗时同步到 s
     */
    public static byte serverFightTextSpeed = 25;
    /**
     * 对话文字滚动速度的 short 副本，与 a 保持同步（parseServerConfig 末尾赋值）
     */
    public static short serverFightTextSpeed_2 = (short) 25;
    public static short c;
    private static short t;
    private String[] u;
    private Vector v = new Vector();
    private Vector w = new Vector();
    private Vector x = new Vector();
    private MainCanvas y;
    private GameSceneController gameSceneController;
    private SkillAnim skillAnim;
    public int d;
    public int e;
    private long B;
    private long C;
    private long D = -1L;
    private i[] E;
    private ae[] F;
    public short f;
    public static int g = -1;
    private Sprite G = null;
    private Vector H = new Vector();
    private long I = 0L;
    public byte h;
    public byte i;
    private boolean J = false;
    public byte j;
    public byte k;
    public byte l;
    public byte m;
    public byte n;
    public byte o;
    public int p;
    public int q;
    private String[] K;
    public static long r = 0L;
    private int[][] L = new int[5][4];
    public static short s;
    private int[][] M = new int[3][4];
    private int[][] N = new int[10][4];
    private int[] O = new int[]{513, 514, 515, 516, 517, 518, 519, 520, 1024, 2048};
    private static short P;
    private boolean Q = true;

    public FightModel(MainCanvas var1, GameSceneController var2, byte var3) {
        this.y = var1;
        this.gameSceneController = var2;
        t = (short) var3;
        var1.doRepaint();
        GlobalConfig.printStr("[FIGHT] bq_1构造: w=" + GlobalStatus.w + " -> 设置v=w");
        GlobalStatus.v = GlobalStatus.w;
        GlobalConfig.printStr("[FIGHT] bq_1构造后: v=" + GlobalStatus.v);
        this.a();
        var1.doRepaint();
    }

    public final void a() {
        int var2 = (GlobalConfig.defaultWidth - 176) / 4;
        int var3 = (GlobalConfig.defaultHigh - 208) / 6;
        GlobalConfig.Q = new short[6][2];
        (GlobalConfig.R = new short[6][2])[0][0] = (short) (GlobalConfig.ZhanDouZuoBiao2[0][0] + var2);
        GlobalConfig.R[0][1] = (short) (GlobalConfig.ZhanDouZuoBiao2[0][1] + (var3 << 1));
        GlobalConfig.R[1][0] = (short) (GlobalConfig.ZhanDouZuoBiao2[1][0] + (var2 << 1));
        GlobalConfig.R[1][1] = (short) (GlobalConfig.ZhanDouZuoBiao2[1][1] + (var3 << 1));
        GlobalConfig.R[2][0] = (short) (GlobalConfig.ZhanDouZuoBiao2[2][0] + var2 * 3);
        GlobalConfig.R[2][1] = (short) (GlobalConfig.ZhanDouZuoBiao2[2][1] + (var3 << 1));
        GlobalConfig.R[3][0] = (short) (GlobalConfig.ZhanDouZuoBiao2[3][0] + var2);
        GlobalConfig.R[3][1] = (short) (GlobalConfig.ZhanDouZuoBiao2[3][1] + var3);
        GlobalConfig.R[4][0] = (short) (GlobalConfig.ZhanDouZuoBiao2[4][0] + (var2 << 1));
        GlobalConfig.R[4][1] = (short) (GlobalConfig.ZhanDouZuoBiao2[4][1] + var3);
        GlobalConfig.R[5][0] = (short) (GlobalConfig.ZhanDouZuoBiao2[5][0] + var2 * 3);
        GlobalConfig.R[5][1] = (short) (GlobalConfig.ZhanDouZuoBiao2[5][1] + var3);
        GlobalConfig.Q[0][0] = (short) (GlobalConfig.ZhanDouZuoBiao1[0][0] + var2);
        GlobalConfig.Q[0][1] = (short) (GlobalConfig.ZhanDouZuoBiao1[0][1] + var3 * 5);
        GlobalConfig.Q[1][0] = (short) (GlobalConfig.ZhanDouZuoBiao1[1][0] + (var2 << 1));
        GlobalConfig.Q[1][1] = (short) (GlobalConfig.ZhanDouZuoBiao1[1][1] + var3 * 5);
        GlobalConfig.Q[2][0] = (short) (GlobalConfig.ZhanDouZuoBiao1[2][0] + var2 * 3);
        GlobalConfig.Q[2][1] = (short) (GlobalConfig.ZhanDouZuoBiao1[2][1] + var3 * 5);
        GlobalConfig.Q[3][0] = (short) (GlobalConfig.ZhanDouZuoBiao1[3][0] + var2);
        GlobalConfig.Q[3][1] = (short) (GlobalConfig.ZhanDouZuoBiao1[3][1] + (var3 << 2));
        GlobalConfig.Q[4][0] = (short) (GlobalConfig.ZhanDouZuoBiao1[4][0] + (var2 << 1));
        GlobalConfig.Q[4][1] = (short) (GlobalConfig.ZhanDouZuoBiao1[4][1] + (var3 << 2));
        GlobalConfig.Q[5][0] = (short) (GlobalConfig.ZhanDouZuoBiao1[5][0] + var2 * 3);
        GlobalConfig.Q[5][1] = (short) (GlobalConfig.ZhanDouZuoBiao1[5][1] + (var3 << 2));
        GlobalStatus.fightData = new FightRoleData[GlobalStatus.fightRoleData1.length];
        if (t == 0) {
            GlobalStatus.M = new ck[GlobalStatus.N.length];
        } else if (t == 1 || t == 2) {
            GlobalStatus.M = new ck[GlobalStatus.fightRoleData2.length];
        }

        for (int var1 = 0; var1 < GlobalStatus.fightRoleData1.length; ++var1) {
            GlobalStatus.fightData[var1] = GlobalStatus.fightRoleData1[var1].c();
            GlobalStatus.fightData[var1].b((byte) 1);
        }

        if (t == 0) {
            for (byte var4 = 0; var4 < GlobalStatus.N.length; ++var4) {
                ck[] var10000 = GlobalStatus.M;
                ck var9 = GlobalStatus.N[var4];
                ck var10;
                (var10 = new ck()).a = var9.a;
                var10.b = var9.b;
                var10.c = var9.c;
                var10.d = var9.d;
                var10.e = var9.e;
                var10.f = var9.f;
                var10.g = var9.g;
                var10.h = var9.h;
                var10.j = var9.j;
                var10.n = var9.n;
                var10.m = var9.m;
                var10.r = var9.r;
                var10.s = var9.s;
                var10.t = var9.t;
                var10.i = var9.i;
                var10.k = var9.k;
                var10.l = var9.l;
                var10000[var4] = var10;
                GlobalStatus.M[var4].b((byte) 1);
            }
        } else if (t == 1 || t == 2) {
            for (byte var5 = 0; var5 < GlobalStatus.fightRoleData2.length; ++var5) {
                GlobalStatus.M[var5] = GlobalStatus.fightRoleData2[var5].b();
                GlobalStatus.M[var5].b((byte) 1);
            }
        }

        if (GlobalStatus.fightRoleData1 != null) {
            for (byte var6 = 0; var6 < GlobalStatus.fightRoleData1.length; ++var6) {
                if (GlobalStatus.fightRoleData1[var6] != null) {
                    GlobalStatus.fightRoleData1[var6].e();
                    GlobalStatus.fightRoleData1[var6] = null;
                }
            }

            GlobalStatus.fightRoleData1 = null;
        }

        if (t == 0) {
            if (GlobalStatus.N != null) {
                for (byte var7 = 0; var7 < GlobalStatus.N.length; ++var7) {
                    if (GlobalStatus.N[var7] != null) {
                        GlobalStatus.N[var7].b();
                        GlobalStatus.N[var7] = null;
                    }
                }

                GlobalStatus.N = null;
            }
        } else if (GlobalStatus.fightRoleData2 != null) {
            for (byte var8 = 0; var8 < GlobalStatus.fightRoleData2.length; ++var8) {
                if (GlobalStatus.fightRoleData2[var8] != null) {
                    GlobalStatus.fightRoleData2[var8].e();
                    GlobalStatus.fightRoleData2[var8] = null;
                }
            }

            GlobalStatus.fightRoleData2 = null;
        }

        GlobalStatus.K = GlobalStatus.L;
        GlobalStatus.L = -1;
        if (GlobalStatus.K == 2 && GlobalStatus.bs != -1 && GlobalStatus.followStatus == 0) {
            this.f = 9;
        } else {
            this.f = 0;
        }

        this.d = 0;
        this.h = 0;
        this.e = 5;
        this.gameSceneController.az = 0;
        if (GlobalStatus.bt) {
            serverFightTextSpeed_2 = 1;
            s = 1;
            P = (short) serverFightTextSpeed;
        } else {
            P = s = serverFightTextSpeed_2 = (short) serverFightTextSpeed;
        }

        this.C = System.currentTimeMillis();
    }

    public final void a(int var1) {
        if (GlobalStatus.bs == 0 && GlobalStatus.followStatus == 0 && g > 0) {
            this.d();
        } else {
            if (this.f != 10) {
                FightModel var2 = this;
                if (GameSceneController.dead != null) {
                    PngUtil.animate(GameSceneController.dead, this.y.frameStartTs);
                }

                if (GameSceneController.dead2 != null) {
                    PngUtil.animate(GameSceneController.dead2, this.y.frameStartTs);
                }

                if (GameSceneController.defence != null) {
                    PngUtil.animate(GameSceneController.defence, this.y.frameStartTs);
                }

                if (GlobalStatus.fightData != null) {
                    for (byte var3 = 0; var3 < GlobalStatus.fightData.length; ++var3) {
                        if (GlobalStatus.fightData[var3].k == 1) {
                            FightRoleData var10000 = GlobalStatus.fightData[var3];
                            long var10 = var2.y.frameStartTs;
                            PngUtil var7 = MainCanvas.pngUtil;
                            FightRoleData var6 = var10000;
                            if (var10000.j != null && !var6.d()) {
                                PngUtil.animate(var6.j, var10);
                            } else {
                                boolean var50 = true;
                            }

                            if (var2.F != null) {
                                for (byte var31 = 0; var31 < var2.F.length; ++var31) {
                                    if (var2.F[var31].b == 0 && var2.F[var31].c == GlobalStatus.fightData[var3].a) {
                                        a(GlobalStatus.fightData[var3], var2.F[var31]);
                                    }
                                }
                            }
                        } else if (GlobalStatus.fightData[var3].k == 2) {
                            if (GlobalStatus.fightData[var3].j == null || PngUtil.animate(GlobalStatus.fightData[var3].j, var2.y.frameStartTs) == 2) {
                                GlobalStatus.fightData[var3].b((byte) 1);
                                if (var2.F != null) {
                                    for (byte var28 = 0; var28 < var2.F.length; ++var28) {
                                        if (var2.F[var28].b == 0 && var2.F[var28].c == GlobalStatus.fightData[var3].a) {
                                            a(GlobalStatus.fightData[var3], var2.F[var28]);
                                        }
                                    }
                                }

                                if (var2.skillAnim != null) {
                                    var2.f = 5;
                                } else {
                                    for (byte var29 = 0; var29 < GlobalStatus.M.length; ++var29) {
                                        if (var2.F != null) {
                                            for (byte var5 = 0; var5 < var2.F.length; ++var5) {
                                                if (var2.F[var5].b == 1 && GlobalStatus.M[var29].a == var2.F[var5].c) {
                                                    GlobalStatus.M[var29].b((byte) 4);
                                                    break;
                                                }
                                            }
                                        }
                                    }

                                    for (byte var30 = 0; var30 < GlobalStatus.fightData.length; ++var30) {
                                        if (var2.F != null) {
                                            for (byte var38 = 0; var38 < var2.F.length; ++var38) {
                                                if (var2.F[var38].b == 0 && GlobalStatus.fightData[var30].a == var2.F[var38].c) {
                                                    GlobalStatus.fightData[var30].b((byte) 4);
                                                    break;
                                                }
                                            }
                                        }
                                    }

                                    var2.B = var2.y.frameStartTs;
                                    var2.f = 3;
                                }
                            }
                        } else if (GlobalStatus.fightData[var3].k == 4 && (GlobalStatus.fightData[var3].j == null || PngUtil.animate(GlobalStatus.fightData[var3].j, var2.y.frameStartTs) == 2)) {
                            if (var2.F != null) {
                                for (byte var4 = 0; var4 < var2.F.length; ++var4) {
                                    if (var2.F[var4].b == 0 && var2.F[var4].c == GlobalStatus.fightData[var3].a) {
                                        a(GlobalStatus.fightData[var3], var2.F[var4]);
                                    }
                                }
                            }

                            GlobalStatus.fightData[var3].b((byte) 1);
                        }
                    }
                }

                if (GlobalStatus.M != null) {
                    for (byte var24 = 0; var24 < GlobalStatus.M.length; ++var24) {
                        if (GlobalStatus.M[var24].n == 1) {
                            GlobalStatus.M[var24].a(MainCanvas.pngUtil, var2.y.frameStartTs);
                        } else if (GlobalStatus.M[var24].n == 2) {
                            if (GlobalStatus.M[var24].m == null || PngUtil.animate(GlobalStatus.M[var24].m, var2.y.frameStartTs) == 2) {
                                GlobalStatus.M[var24].b((byte) 1);
                                if (var2.skillAnim != null) {
                                    var2.f = 5;
                                } else {
                                    for (byte var33 = 0; var33 < GlobalStatus.fightData.length; ++var33) {
                                        if (var2.F != null) {
                                            for (byte var39 = 0; var39 < var2.F.length; ++var39) {
                                                if (var2.F[var39].b == 0 && GlobalStatus.fightData[var33].a == var2.F[var39].c) {
                                                    GlobalStatus.fightData[var33].b((byte) 4);
                                                    break;
                                                }
                                            }
                                        }
                                    }

                                    for (byte var34 = 0; var34 < GlobalStatus.M.length; ++var34) {
                                        if (var2.F != null) {
                                            for (byte var40 = 0; var40 < var2.F.length; ++var40) {
                                                if (var2.F[var40].b == 1 && GlobalStatus.M[var34].a == var2.F[var40].c) {
                                                    GlobalStatus.M[var34].b((byte) 4);
                                                    break;
                                                }
                                            }
                                        }
                                    }

                                    var2.B = var2.y.frameStartTs;
                                    var2.f = 3;
                                }
                            }
                        } else if (GlobalStatus.M[var24].n != 3 && GlobalStatus.M[var24].n == 4 && (GlobalStatus.M[var24].m == null || PngUtil.animate(GlobalStatus.M[var24].m, var2.y.frameStartTs) == 2)) {
                            if (var2.F != null) {
                                for (byte var32 = 0; var32 < var2.F.length; ++var32) {
                                    if (var2.F[var32].b == 1 && var2.F[var32].c == GlobalStatus.M[var24].a) {
                                        GlobalStatus.M[var24].e = var2.F[var32].g;
                                        GlobalStatus.M[var24].g = var2.F[var32].h;
                                        GlobalStatus.M[var24].f = var2.F[var32].i;
                                        GlobalStatus.M[var24].h = var2.F[var32].j;
                                        if (GlobalStatus.M[var24].e <= 0) {
                                            byte var45 = 0;

                                            byte var10001;
                                            while (true) {
                                                if (var45 >= GlobalStatus.M.length) {
                                                    var10001 = -1;
                                                    break;
                                                }

                                                if (t != 1 && t != 2) {
                                                    if (GlobalStatus.M[var45].e > 0) {
                                                        var10001 = var45;
                                                        break;
                                                    }
                                                } else if (GlobalStatus.M[var45].e > 0 && GlobalStatus.M[var45].b == 0) {
                                                    var10001 = var45;
                                                    break;
                                                }

                                                ++var45;
                                            }

                                            var2.h = var10001;
                                            var2.h = var2.h < 0 ? 0 : var2.h;
                                        }
                                    }
                                }
                            }

                            GlobalStatus.M[var24].b((byte) 1);
                        }
                    }
                }
            }

            if (this.d == 0 || this.d == 2 || this.f > 1) {
                if (var1 == 8) {
                    if (this.e == 5 || this.e == 3 && this.d > 1) {
                        this.gameSceneController.az = this.gameSceneController.az <= 0 ? 9 : --this.gameSceneController.az;
                    }
                } else if (var1 == 2) {
                    if (this.e == 5 || this.e == 3 && this.d > 1) {
                        this.gameSceneController.az = this.gameSceneController.az >= 9 ? 0 : ++this.gameSceneController.az;
                    }
                } else if (var1 == 1073741824) {
                    if (this.e == 5 || this.e == 3 && this.d > 1) {
                        if (this.gameSceneController.az == 8) {
                            this.gameSceneController.K();
                        } else if (this.gameSceneController.az == 9) {
                            this.gameSceneController.O();
                            this.e = 5;
                        }
                    }
                } else if (var1 == 1024) {
                    this.gameSceneController.K();
                } else if (var1 == 2048) {
                    this.gameSceneController.O();
                    if (this.d <= 1) {
                        this.e = 5;
                    } else if (this.d > 1) {
                        this.e = 3;
                    }
                }
            }

            if (this.f == 0) {
                this.I = System.currentTimeMillis();
                if (h() && this.f != -1 && !GameSceneController.r()) {
                    this.j = 0;
                    this.p = GlobalStatus.ej[this.gameSceneController.az];
                    this.n = 1;
                    int var60 = GlobalStatus.bt ? 0 : 1;
                    int var10002 = GlobalStatus.bt ? 0 : 1;
                    boolean var10005 = GlobalStatus.bt;
                    this.a((byte) var60, var10002, (byte) 1, GlobalStatus.M[this.h].a, (byte) 1, GlobalStatus.bt ? 0 : 1, (byte) 1, GlobalStatus.M[this.h].a);
                    this.f = -1;
                    this.e = 5;
                    this.d = 0;
                }

                if (this.d == 0) {
                    if (y() && !h()) {
                        this.j = 1;
                        this.p = 1;
                        this.n = 1;
                        if (this.j()) {
                            this.a(this.j, this.p, this.n, this.o, (byte) 1, 1, (byte) 1, GlobalStatus.M[this.h].a);
                            this.f = -1;
                            this.e = 5;
                        } else {
                            this.d = 2;
                            this.e = 3;
                        }
                    } else if (var1 == 1) {
                        this.e = this.e <= 0 ? 5 : --this.e;
                    } else if (var1 == 4) {
                        this.e = this.e >= 5 ? 0 : ++this.e;
                    } else if (var1 == 1073741824) {
                        this.J = false;
                        if (this.e == 0 && !h()) {
                            if (c() <= 1) {
                                this.j = 1;
                                this.p = 1;
                                this.n = 1;
                                this.o = GlobalStatus.M[this.h].a;
                                if (this.j()) {
                                    this.a(this.j, this.p, this.n, this.o, (byte) 1, 1, (byte) 1, GlobalStatus.M[this.h].a);
                                    this.f = -1;
                                    this.e = 5;
                                } else {
                                    this.d = 2;
                                    this.e = 3;
                                }
                            } else {
                                this.d = 1;
                            }
                        } else if (this.e == 1 && !h()) {
                            this.j = 3;
                            this.p = 1;
                            this.n = 1;
                            this.o = GlobalStatus.M[this.h].a;
                            if (this.j()) {
                                this.a(this.j, this.p, this.n, this.o, (byte) 1, 1, (byte) 1, GlobalStatus.M[this.h].a);
                                this.f = -1;
                                this.e = 5;
                            } else {
                                this.d = 2;
                                this.e = 3;
                            }
                        } else if (this.e == 2 && !h()) {
                            if (GlobalStatus.skillCD2 != null && GlobalStatus.skillCD2.length > 0) {
                                this.gameSceneController.h((int) 3);
                            } else {
                                this.y.showTips("没有可用技能");
                            }
                        } else if (this.e == 3) {
                            this.gameSceneController.e((int) 6);
                        } else if (this.e == 4 && !h()) {
                            if (this.j()) {
                                this.k = 1;
                                this.q = 1;
                                if (t == 1) {
                                    this.y.showTips("决斗时不能逃跑!");
                                } else if (GlobalStatus.bs == 0 && GlobalStatus.followStatus == 0) {
                                    this.y.showTips("队员不能逃跑");
                                } else {
                                    this.a((byte) 4, -1, (byte) 0, this.o, this.k, this.q, (byte) 1, GlobalStatus.M[this.h].a);
                                    this.f = -1;
                                    this.e = 5;
                                }
                            } else if (t == 1) {
                                this.y.showTips("决斗时不能逃跑!");
                            } else {
                                this.j = 4;
                                this.p = 1;
                                this.n = 0;
                                this.o = 1;
                                this.d = 2;
                                this.e = 3;
                            }
                        } else if (this.e == 5 && GlobalStatus.npcResName1[this.gameSceneController.az] != -1 && this.gameSceneController.az >= 0 && this.gameSceneController.az < 8) {
                            this.q();
                        }
                    } else if (var1 == 513 && !GlobalStatus.bt) {
                        if (GlobalStatus.npcResName1[0] != -1) {
                            this.gameSceneController.az = 0;
                            if (GlobalStatus.el[this.gameSceneController.az] < 2) {
                                this.q();
                            } else if (this.b((int) 0)) {
                                this.j = 0;
                                this.p = GlobalStatus.ej[this.gameSceneController.az];
                                this.n = 1;
                                this.o = GlobalStatus.M[this.h].a;
                                if (this.j()) {
                                    this.a(this.j, this.p, this.n, this.o, (byte) 1, 1, (byte) 1, GlobalStatus.M[this.h].a);
                                    this.f = -1;
                                    this.e = 5;
                                } else {
                                    this.d = 2;
                                    this.e = 3;
                                }
                            } else {
                                this.J = true;
                                this.d = 1;
                            }
                        }
                    } else if (var1 == 514 && !GlobalStatus.bt) {
                        if (GlobalStatus.npcResName1[1] != -1) {
                            this.gameSceneController.az = 1;
                            if (GlobalStatus.el[this.gameSceneController.az] < 2) {
                                this.q();
                            } else if (this.b((int) 0)) {
                                this.j = 0;
                                this.p = GlobalStatus.ej[this.gameSceneController.az];
                                this.n = 1;
                                this.o = GlobalStatus.M[this.h].a;
                                if (this.j()) {
                                    this.a(this.j, this.p, this.n, this.o, (byte) 1, 1, (byte) 1, GlobalStatus.M[this.h].a);
                                    this.f = -1;
                                    this.e = 5;
                                } else {
                                    this.d = 2;
                                    this.e = 3;
                                }
                            } else {
                                this.J = true;
                                this.d = 1;
                            }
                        }
                    } else if (var1 == 515 && !GlobalStatus.bt) {
                        if (GlobalStatus.npcResName1[2] != -1) {
                            this.gameSceneController.az = 2;
                            if (GlobalStatus.el[this.gameSceneController.az] < 2) {
                                this.q();
                            } else if (this.b((int) 0)) {
                                this.j = 0;
                                this.p = GlobalStatus.ej[this.gameSceneController.az];
                                this.n = 1;
                                this.o = GlobalStatus.M[this.h].a;
                                if (this.j()) {
                                    this.a(this.j, this.p, this.n, this.o, (byte) 1, 1, (byte) 1, GlobalStatus.M[this.h].a);
                                    this.f = -1;
                                    this.e = 5;
                                } else {
                                    this.d = 2;
                                    this.e = 3;
                                }
                            } else {
                                this.J = true;
                                this.d = 1;
                            }
                        }
                    } else if (var1 == 516 && !GlobalStatus.bt) {
                        if (GlobalStatus.npcResName1[3] != -1) {
                            this.gameSceneController.az = 3;
                            if (GlobalStatus.el[this.gameSceneController.az] < 2) {
                                this.q();
                            } else if (this.b((int) 0)) {
                                this.j = 0;
                                this.p = GlobalStatus.ej[this.gameSceneController.az];
                                this.n = 1;
                                this.o = GlobalStatus.M[this.h].a;
                                if (this.j()) {
                                    this.a(this.j, this.p, this.n, this.o, (byte) 1, 1, (byte) 1, GlobalStatus.M[this.h].a);
                                    this.f = -1;
                                    this.e = 5;
                                } else {
                                    this.d = 2;
                                    this.e = 3;
                                }
                            } else {
                                this.J = true;
                                this.d = 1;
                            }
                        }
                    } else if (var1 == 517 && !GlobalStatus.bt) {
                        if (GlobalStatus.npcResName1[4] != -1) {
                            this.gameSceneController.az = 4;
                            if (GlobalStatus.el[this.gameSceneController.az] < 2) {
                                this.q();
                            } else if (this.b((int) 0)) {
                                this.j = 0;
                                this.p = GlobalStatus.ej[this.gameSceneController.az];
                                this.n = 1;
                                this.o = GlobalStatus.M[this.h].a;
                                if (this.j()) {
                                    this.a(this.j, this.p, this.n, this.o, (byte) 1, 1, (byte) 1, GlobalStatus.M[this.h].a);
                                    this.f = -1;
                                    this.e = 5;
                                } else {
                                    this.d = 2;
                                    this.e = 3;
                                }
                            } else {
                                this.J = true;
                                this.d = 1;
                            }
                        }
                    } else if (var1 == 518 && !GlobalStatus.bt) {
                        if (GlobalStatus.npcResName1[5] != -1) {
                            this.gameSceneController.az = 5;
                            if (GlobalStatus.el[this.gameSceneController.az] < 2) {
                                this.q();
                            } else if (this.b((int) 0)) {
                                this.j = 0;
                                this.p = GlobalStatus.ej[this.gameSceneController.az];
                                this.n = 1;
                                this.o = GlobalStatus.M[this.h].a;
                                if (this.j()) {
                                    this.a(this.j, this.p, this.n, this.o, (byte) 1, 1, (byte) 1, GlobalStatus.M[this.h].a);
                                    this.f = -1;
                                    this.e = 5;
                                } else {
                                    this.d = 2;
                                    this.e = 3;
                                }
                            } else {
                                this.J = true;
                                this.d = 1;
                            }
                        }
                    } else if (var1 == 519 && !GlobalStatus.bt) {
                        if (GlobalStatus.npcResName1[6] != -1) {
                            this.gameSceneController.az = 6;
                            if (GlobalStatus.el[this.gameSceneController.az] < 2) {
                                this.q();
                            } else if (this.b((int) 0)) {
                                this.j = 0;
                                this.p = GlobalStatus.ej[this.gameSceneController.az];
                                this.n = 1;
                                this.o = GlobalStatus.M[this.h].a;
                                if (this.j()) {
                                    this.a(this.j, this.p, this.n, this.o, (byte) 1, 1, (byte) 1, GlobalStatus.M[this.h].a);
                                    this.f = -1;
                                    this.e = 5;
                                } else {
                                    this.d = 2;
                                    this.e = 3;
                                }
                            } else {
                                this.J = true;
                                this.d = 1;
                            }
                        }
                    } else if (var1 == 520 && !GlobalStatus.bt && GlobalStatus.npcResName1[7] != -1) {
                        this.gameSceneController.az = 7;
                        if (GlobalStatus.el[this.gameSceneController.az] < 2) {
                            this.q();
                        } else if (this.b((int) 0)) {
                            this.j = 0;
                            this.p = GlobalStatus.ej[this.gameSceneController.az];
                            this.n = 1;
                            this.o = GlobalStatus.M[this.h].a;
                            if (this.j()) {
                                this.a(this.j, this.p, this.n, this.o, (byte) 1, 1, (byte) 1, GlobalStatus.M[this.h].a);
                                this.f = -1;
                                this.e = 5;
                            } else {
                                this.d = 2;
                                this.e = 3;
                            }
                        } else {
                            this.J = true;
                            this.d = 1;
                        }
                    }
                } else if (this.d == 1) {
                    if (var1 != 8 && var1 != 2 && var1 != 1 && var1 != 4) {
                        if (var1 == 1073741824) {
                            label1626:
                            {
                                if (this.e != 5 && !this.J) {
                                    if (this.e == 0) {
                                        this.j = 1;
                                        this.p = 1;
                                        this.n = 1;
                                        this.o = GlobalStatus.M[this.h].a;
                                    } else if (this.e == 2) {
                                        this.j = 1;
                                        this.p = GlobalStatus.dl[this.y.gunDongListUi.g()];
                                        this.n = 1;
                                        this.o = GlobalStatus.M[this.h].a;
                                    }
                                } else {
                                    if (this.gameSceneController.az >= 0 && this.gameSceneController.az <= 7 && GlobalStatus.bt) {
                                        break label1626;
                                    }

                                    this.j = 0;
                                    this.p = GlobalStatus.ej[this.gameSceneController.az];
                                    this.n = 1;
                                    this.o = GlobalStatus.M[this.h].a;
                                }

                                if (this.j()) {
                                    this.a(this.j, this.p, this.n, this.o, (byte) 1, 1, (byte) 1, (byte) -1);
                                    this.f = -1;
                                    this.e = 5;
                                } else {
                                    this.d = 2;
                                    this.e = 3;
                                }
                            }
                        } else if (var1 == 536870912) {
                            this.d = 0;
                        }
                    } else {
                        this.h = b(this.h);
                    }
                } else if (this.d == 2) {
                    byte var41 = 0;

                    boolean var53;
                    while (true) {
                        if (var41 >= GlobalStatus.fightData.length) {
                            var53 = false;
                            break;
                        }

                        if (GlobalStatus.fightData[var41].b != 0 && GlobalStatus.fightData[var41].a == i() + 3 && GlobalStatus.fightData[var41].o) {
                            var53 = true;
                            break;
                        }

                        ++var41;
                    }

                    if (var53) {
                        this.a(this.j, this.p, this.n, this.o, (byte) 1, 1, (byte) 1, GlobalStatus.M[this.h].a);
                        this.f = -1;
                        this.e = 5;
                    } else {
                        if (var1 == 1) {
                            this.e = this.e <= 0 ? 3 : --this.e;
                        } else if (var1 == 4) {
                            this.e = this.e >= 3 ? 0 : ++this.e;
                        } else if (var1 == 1073741824) {
                            if (this.e == 0) {
                                if (c() <= 1) {
                                    this.a(this.j, this.p, this.n, this.o, (byte) 1, 1, (byte) 1, GlobalStatus.M[this.h].a);
                                    this.f = -1;
                                    this.e = 5;
                                } else {
                                    this.k = 1;
                                    this.q = 1;
                                    this.d = 3;
                                }
                            } else if (this.e == 1) {
                                this.a(this.j, this.p, this.n, this.o, (byte) 3, 1, (byte) 1, GlobalStatus.M[this.h].a);
                                this.f = -1;
                                this.e = 5;
                            } else if (this.e == 2) {
                                if (GlobalStatus.cR != null && GlobalStatus.cR.length > 0) {
                                    this.gameSceneController.a(false, true);
                                } else {
                                    this.y.showTips("宠物没有技能!");
                                }
                            } else if (this.e == 3 && GlobalStatus.npcResName2[this.gameSceneController.az] != -1) {
                                this.r();
                            }
                        }

                        if (var1 == 513 && !GlobalStatus.bt) {
                            if (GlobalStatus.npcResName2[0] != -1) {
                                this.gameSceneController.az = 0;
                                this.r();
                            }
                        } else if (var1 == 514 && !GlobalStatus.bt) {
                            if (GlobalStatus.npcResName2[1] != -1) {
                                this.gameSceneController.az = 1;
                                this.r();
                            }
                        } else if (var1 == 515 && !GlobalStatus.bt) {
                            if (GlobalStatus.npcResName2[2] != -1) {
                                this.gameSceneController.az = 2;
                                this.r();
                            }
                        } else if (var1 == 516 && !GlobalStatus.bt) {
                            if (GlobalStatus.npcResName2[3] != -1) {
                                this.gameSceneController.az = 3;
                                this.r();
                            }
                        } else if (var1 == 517 && !GlobalStatus.bt) {
                            if (GlobalStatus.npcResName2[4] != -1) {
                                this.gameSceneController.az = 4;
                                this.r();
                            }
                        } else if (var1 == 518 && !GlobalStatus.bt) {
                            if (GlobalStatus.npcResName2[5] != -1) {
                                this.gameSceneController.az = 5;
                                this.r();
                            }
                        } else if (var1 == 519 && !GlobalStatus.bt) {
                            if (GlobalStatus.npcResName2[6] != -1) {
                                this.gameSceneController.az = 6;
                                this.r();
                            }
                        } else if (var1 == 520 && !GlobalStatus.bt) {
                            if (GlobalStatus.npcResName2[7] != -1) {
                                this.gameSceneController.az = 7;
                                this.r();
                            }
                        } else if (var1 == 536870912) {
                            if (y()) {
                                this.y.showTips("你已被锁定\t无法进行该操作");
                            } else {
                                this.d = 0;
                            }
                        }
                    }
                } else if (this.d == 3) {
                    if (var1 != 8 && var1 != 2 && var1 != 1 && var1 != 4) {
                        if (var1 != 1073741824 && var1 != 517) {
                            if (var1 == 536870912) {
                                this.d = 2;
                                this.e = 3;
                            }
                        } else {
                            this.a(this.j, this.p, this.n, this.o, this.k, this.q, (byte) 1, GlobalStatus.M[this.h].a);
                            this.f = -1;
                            this.e = 5;
                        }
                    } else {
                        this.h = b(this.h);
                    }
                } else if (this.d == 4) {
                    if (var1 != 8 && var1 != 2 && var1 != 1 && var1 != 4) {
                        if (var1 != 1073741824 && var1 != 517) {
                            if (var1 == 536870912) {
                                this.d = 0;
                            }
                        } else {
                            this.o = GlobalStatus.fightData[this.i].a;
                            if (!this.j()) {
                                this.d = 2;
                                this.e = 3;
                            } else {
                                this.a(this.j, this.p, this.n, this.o, (byte) 1, 1, (byte) 1, GlobalStatus.M[this.h].a);
                                this.f = -1;
                                this.e = 5;
                            }
                        }
                    } else if (h()) {
                        this.y.showTips("只能对自己使用复活道具");
                    } else {
                        this.i = c(this.i);
                    }
                } else if (this.d == 5) {
                    if (var1 != 8 && var1 != 2 && var1 != 1 && var1 != 4) {
                        if (var1 != 1073741824 && var1 != 517) {
                            if (var1 == 536870912) {
                                this.d = 0;
                            }
                        } else {
                            this.o = GlobalStatus.fightData[this.i].a;
                            this.j = 1;
                            this.p = GlobalStatus.dl[this.y.gunDongListUi.g()];
                            this.n = 0;
                            if (!this.j()) {
                                this.d = 2;
                                this.e = 3;
                            } else {
                                this.a(this.j, this.p, this.n, this.o, (byte) 1, 1, (byte) 1, (byte) -1);
                                this.f = -1;
                                this.e = 5;
                            }
                        }
                    } else {
                        this.i = c(this.i);
                    }
                } else if (this.d == 6) {
                    if (var1 != 8 && var1 != 2 && var1 != 1 && var1 != 4) {
                        if (var1 != 1073741824 && var1 != 517) {
                            if (var1 == 536870912) {
                                this.d = 2;
                                this.e = 3;
                            }
                        } else {
                            this.k = 1;
                            this.q = GlobalStatus.dl[this.y.gunDongListUi.g()];
                            this.l = 0;
                            this.a(this.j, this.p, this.n, this.o, this.k, this.q, this.l, GlobalStatus.fightData[this.i].a);
                            this.f = -1;
                            this.e = 5;
                        }
                    } else {
                        this.i = c(this.i);
                    }
                } else if (this.d == 7) {
                    if (var1 != 8 && var1 != 2 && var1 != 1 && var1 != 4) {
                        if (var1 != 1073741824 && var1 != 517) {
                            if (var1 == 536870912) {
                                this.d = 0;
                            }
                        } else {
                            this.o = GlobalStatus.fightData[this.i].a;
                            if (!this.j()) {
                                this.d = 2;
                                this.e = 3;
                            } else {
                                this.a(this.j, this.p, this.n, this.o, (byte) 1, 1, (byte) 1, (byte) -1);
                                this.f = -1;
                                this.e = 5;
                            }
                        }
                    } else {
                        this.i = c(this.i);
                    }
                } else if (this.d == 8) {
                    if (var1 != 8 && var1 != 2 && var1 != 1 && var1 != 4) {
                        if (var1 != 1073741824 && var1 != 517) {
                            if (var1 == 536870912) {
                                this.d = 2;
                                this.e = 3;
                            }
                        } else {
                            this.a(this.j, this.p, this.n, this.o, this.k, this.q, this.l, GlobalStatus.fightData[this.i].a);
                            this.f = -1;
                            this.e = 5;
                        }
                    } else {
                        this.i = c(this.i);
                    }
                } else if (this.d == 9) {
                    if (var1 != 8 && var1 != 2 && var1 != 1 && var1 != 4) {
                        if (var1 != 1073741824 && var1 != 517) {
                            if (var1 == 536870912) {
                                this.d = 0;
                            }
                        } else {
                            this.o = GlobalStatus.M[this.h].a;
                            if (!this.j()) {
                                this.d = 2;
                                this.e = 3;
                            } else {
                                this.a(this.j, this.p, this.n, this.o, (byte) 1, 1, (byte) 1, (byte) -1);
                                this.f = -1;
                                this.e = 5;
                            }
                        }
                    } else {
                        this.h = b(this.h);
                    }
                }
            } else if (this.f == 1) {
                FightModel var20 = this;
                if (this.Q) {
                    this.Q = false;
                    boolean var25 = false;
                    boolean var35 = false;
                    var1 = 0;

                    byte var54;
                    while (true) {
                        if (var1 >= GlobalStatus.fightData.length) {
                            var54 = -1;
                            break;
                        }

                        if (GlobalStatus.fightData[var1].b == 0 && GlobalStatus.fightData[var1].c.equals(GlobalStatus.roleId_2)) {
                            var54 = (byte) var1;
                            break;
                        }

                        ++var1;
                    }

                    byte var42 = var54;
                    var1 = 0;

                    while (true) {
                        if (var1 >= GlobalStatus.fightData.length) {
                            var54 = -1;
                            break;
                        }

                        if (GlobalStatus.fightData[var1].b != 0 && GlobalStatus.fightData[var1].a == i() + 3) {
                            var54 = (byte) var1;
                            break;
                        }

                        ++var1;
                    }

                    byte var46 = var54;

                    for (int var49 = 0; var49 < var20.v.size(); ++var49) {
                        if (((i[]) ((i[]) var20.v.elementAt(var49)))[0].d == 9) {
                            ae[] var11 = (ae[]) var20.w.elementAt(var49);

                            for (int var14 = 0; var14 < var11.length; ++var14) {
                                if (var11[var14].b == 0 && GlobalStatus.fightData[var42].a == var11[var14].c && d(var11[var14].k)) {
                                    GlobalStatus.fightData[var42].o = true;
                                    var25 = true;
                                }

                                if (GlobalStatus.selectedMount > 0 && var11[var14].b == 0 && GlobalStatus.fightData[var46].a == var11[var14].c && d(var11[var14].k)) {
                                    GlobalStatus.fightData[var46].o = true;
                                    var35 = true;
                                }
                            }
                        }
                    }

                    if (!var25) {
                        GlobalStatus.fightData[var42].o = false;
                    }

                    if (!var35 && GlobalStatus.selectedMount > 0) {
                        GlobalStatus.fightData[var46].o = false;
                    }
                }

                if (this.v.size() > 0) {
                    var1 = 0;
                    if (0 < this.v.size()) {
                        this.E = (i[]) this.v.elementAt(0);
                        if (this.w.size() > 0) {
                            this.F = (ae[]) this.w.elementAt(0);
                        } else {
                            this.F = null;
                        }

                        if (this.x.size() > 0) {
                            this.u = (String[]) this.x.elementAt(0);
                        } else {
                            this.u = null;
                        }

                        var20 = this;
                        if (this.E[0].d == 7 || this.E[0].d == 5 || this.E[0].d == 9 || this.E[0].d == 1 || this.E[0].d == 2 || this.E[0].d == 3) {
                            for (byte var26 = 0; var26 < GlobalStatus.fightData.length; ++var26) {
                                if (GlobalStatus.fightData[var26] != null && !GlobalStatus.fightData[var26].d()) {
                                    for (byte var36 = 0; var36 < var20.F.length; ++var36) {
                                        if (var20.F[var36].k >= 0 && var20.F[var36].b == 0 && var20.F[var36].c == GlobalStatus.fightData[var26].a) {
                                            var20.G = MainCanvas.ui.getSpriteByNameFromCache(String.valueOf(var20.F[var36].k));
                                            if (var20.G != null && !var20.H.contains(var20.G)) {
                                                boolean var43 = true;

                                                for (int var47 = 0; var47 < var20.H.size(); ++var47) {
                                                    if (var20.H.elementAt(var47).equals(var20.G)) {
                                                        var43 = false;
                                                    }
                                                }

                                                if (var43) {
                                                    var20.H.addElement(var20.G);
                                                }
                                            }
                                        }
                                    }
                                }

                                a(GlobalStatus.fightData[var26].s, var20.H);
                                var20.H.removeAllElements();
                            }

                            for (byte var27 = 0; var27 < GlobalStatus.M.length; ++var27) {
                                if (GlobalStatus.M[var27] != null && !GlobalStatus.M[var27].a()) {
                                    for (byte var37 = 0; var37 < var20.F.length; ++var37) {
                                        if (var20.F[var37].k >= 0 && var20.F[var37].b == 1 && var20.F[var37].c == GlobalStatus.M[var27].a) {
                                            var20.G = MainCanvas.ui.getSpriteByNameFromCache(String.valueOf(var20.F[var37].k));
                                            if (var20.G != null && !var20.H.contains(var20.G)) {
                                                boolean var44 = true;

                                                for (int var48 = 0; var48 < var20.H.size(); ++var48) {
                                                    if (var20.H.elementAt(var48) != var20.G) {
                                                        var44 = false;
                                                    }
                                                }

                                                if (var44) {
                                                    var20.H.addElement(var20.G);
                                                }
                                            }
                                        }
                                    }

                                    a(GlobalStatus.M[var27].u, var20.H);
                                    var20.H.removeAllElements();
                                }
                            }
                        }

                        if (var20.E[0].d == 7) {
                            var20.n();
                        } else {
                            var20.o();
                        }

                        if (this.v.size() > 0) {
                            this.v.removeElementAt(0);
                        }

                        if (this.w.size() > 0) {
                            this.w.removeElementAt(0);
                        }

                        if (this.x.size() > 0) {
                            this.x.removeElementAt(0);
                        }
                    }
                } else {
                    this.E = null;
                    if (h()) {
                        if (GameSceneController.r()) {
                            this.f = 0;
                            s = serverFightTextSpeed_2;
                        } else {
                            this.j = 0;
                            this.p = GlobalStatus.ej[this.gameSceneController.az];
                            this.n = 1;
                            int var61 = GlobalStatus.bt ? 0 : 1;
                            int var62 = GlobalStatus.bt ? 0 : 1;
                            boolean var63 = GlobalStatus.bt;
                            this.a((byte) var61, var62, (byte) 1, GlobalStatus.M[this.h].a, (byte) 1, GlobalStatus.bt ? 0 : 1, (byte) 1, GlobalStatus.M[this.h].a);
                            this.f = -1;
                            this.e = 5;
                        }

                        this.d = 0;
                    } else if (this.f != 0) {
                        this.d = 0;
                        s = serverFightTextSpeed_2;
                        this.f = 0;
                    }

                    for (byte var16 = 0; var16 < GlobalStatus.fightData.length; ++var16) {
                        GlobalStatus.fightData[var16].m = false;
                        GlobalStatus.fightData[var16].l = false;
                        GlobalStatus.fightData[var16].n = false;
                    }

                    for (byte var17 = 0; var17 < GlobalStatus.M.length; ++var17) {
                        GlobalStatus.M[var17].p = false;
                        GlobalStatus.M[var17].o = false;
                        GlobalStatus.M[var17].q = false;
                    }

                    this.Q = true;
                }
            } else if (this.f == 2) {
                if (this.D == -1L) {
                    this.D = this.y.frameStartTs;
                }
            } else if (this.f == 3 && x()) {
                if (this.u != null && this.y.frameStartTs - this.B >= 1450L) {
                    this.f = 1;
                } else if (this.u == null) {
                    this.f = 1;
                }
            }

            if (this.f == 4) {
                if (u()) {
                    this.y.mainMidlet.start();
                }

                this.d();
                this.gameSceneController.lastSceneModeId = this.gameSceneController.currentSceneModeId = 0;
            } else if (this.f == 5) {
                if (this.s() == 2) {
                    for (byte var18 = 0; var18 < GlobalStatus.fightData.length; ++var18) {
                        if (this.F != null) {
                            for (byte var22 = 0; var22 < this.F.length; ++var22) {
                                if (this.F[var22].b == 0 && GlobalStatus.fightData[var18].a == this.F[var22].c) {
                                    GlobalStatus.fightData[var18].b((byte) 4);
                                    break;
                                }
                            }
                        }
                    }

                    for (byte var19 = 0; var19 < GlobalStatus.M.length; ++var19) {
                        if (this.F != null) {
                            for (byte var23 = 0; var23 < this.F.length; ++var23) {
                                if (this.F[var23].b == 1 && GlobalStatus.M[var19].a == this.F[var23].c) {
                                    GlobalStatus.M[var19].b((byte) 4);
                                    break;
                                }
                            }
                        }
                    }

                    this.B = this.y.frameStartTs;
                    this.f = 3;
                }
            } else if (this.f == 6) {
                if (PngUtil.animate(GameSceneController._27, this.y.frameStartTs) == 2) {
                    this.f = 1;
                }
            } else if (this.f == 7) {
                if (PngUtil.animate(GameSceneController.quit, this.y.frameStartTs) == 2) {
                    this.f = 8;
                }
            } else if (this.f == 8) {
                this.y.mainMidlet.start();
                this.d();
                this.gameSceneController.lastSceneModeId = this.gameSceneController.currentSceneModeId = 0;
            }

            if (this.f == 0 || this.f == 1) {
                if (this.v.size() <= 0 && GlobalStatus.x == -1) {
                    if (t() || u() || this.f == 1) {
                        this.f = 4;
                        return;
                    }
                } else if (this.f != 9 && (GlobalStatus.bs >= 0 && GlobalStatus.followStatus == 0 || t == 1 || t == 2 || GlobalStatus.bt) && s > 0) {
                    this.p();
                }
            }

        }
    }

    public final void a(PngUtil pngUtil, Graphics graphics) {
        graphics.setClip(0, 0, GlobalConfig.defaultWidth, GlobalConfig.defaultHigh);
        if ((this.f == 2 || this.f == 3 || this.f == 6) && this.E != null && this.E[0].f != null && !this.E[0].f.equals("")) {
            LoadingPage.drawString(graphics, (String) this.E[0].f, (int) (GlobalConfig.defaultWidth / 2), GlobalConfig.defaultHigh - 22 - GlobalConfig.font2_h, 17, 0, 16777215);
        }

        if (this.f != 4 && this.f != 8) {
            Graphics var5 = graphics;
            FightModel var4 = this;
            if (GlobalStatus.fightData != null) {
                for (byte var6 = (byte) (GlobalStatus.fightData.length - 1); var6 >= 0; --var6) {
                    if (GlobalStatus.fightData[var6].j != null) {
                        if (GlobalStatus.fightData[var6].d()) {
                            MainCanvas.pngUtil.roleSelectedAnimation(var5, (Animation) GameSceneController.dead2, (int[]) null, 0, 0, GlobalConfig.Q[GlobalStatus.fightData[var6].a][0], GlobalConfig.Q[GlobalStatus.fightData[var6].a][1], 0, 0);
                        } else if (GlobalStatus.fightData[var6].b != 0 && GlobalStatus.fightData[var6].j != null) {
                            if (GlobalStatus.fightData[var6].k == 1 || GlobalStatus.fightData[var6].k == 4) {
                                GlobalStatus.fightData[var6].a(var5, MainCanvas.pngUtil, GlobalConfig.Q[GlobalStatus.fightData[var6].a][0], GlobalConfig.Q[GlobalStatus.fightData[var6].a][1], (byte) 0);
                            }

                            if (var4.f != -1 && var4.f != 0 && var4.f != 7 && GlobalStatus.fightData[var6].m) {
                                MainCanvas.pngUtil.roleSelectedAnimation(var5, (Animation) GameSceneController.defence, (int[]) null, 0, 0, GlobalConfig.Q[GlobalStatus.fightData[var6].a][0], GlobalConfig.Q[GlobalStatus.fightData[var6].a][1], 0, 0);
                            } else if (var4.f == 6 && GlobalStatus.fightData[var6].l) {
                                MainCanvas.pngUtil.roleSelectedAnimation(var5, (Animation) GameSceneController._27, (int[]) null, 0, 0, GlobalConfig.Q[GlobalStatus.fightData[var6].a][0], GlobalConfig.Q[GlobalStatus.fightData[var6].a][1], 0, 0);
                            }
                        }
                    }
                }

                for (byte var17 = 0; var17 < GlobalStatus.fightData.length; ++var17) {
                    if (GlobalStatus.fightData[var17].b == 0 && GlobalStatus.fightData[var17].j != null) {
                        if (GlobalStatus.fightData[var17].c.equals(GlobalStatus.roleId_2)) {
                            var5.drawImage(GameSceneController.mystation.image, GlobalConfig.Q[GlobalStatus.fightData[var17].a][0] - GameSceneController.mystation.w / 2, GlobalConfig.Q[GlobalStatus.fightData[var17].a][1] - GameSceneController.mystation.h / 2, 20);
                            if ((var4.f != 7 || GlobalStatus.bs != 1) && (var4.f != 7 || GlobalStatus.bs != -1) && (var4.f != 7 || GlobalStatus.followStatus != 1)) {
                                if (!GlobalStatus.fightData[var17].d()) {
                                    if (GlobalStatus.fightData[var17].k == 1 || GlobalStatus.fightData[var17].k == 4) {
                                        GlobalStatus.fightData[var17].a(var5, MainCanvas.pngUtil, GlobalConfig.Q[GlobalStatus.fightData[var17].a][0], GlobalConfig.Q[GlobalStatus.fightData[var17].a][1], (byte) 0);
                                    }

                                    if (var4.f != -1 && var4.f != 0 && GlobalStatus.fightData[var17].m) {
                                        MainCanvas.pngUtil.roleSelectedAnimation(var5, (Animation) GameSceneController.defence, (int[]) null, 0, 0, GlobalConfig.Q[GlobalStatus.fightData[var17].a][0], GlobalConfig.Q[GlobalStatus.fightData[var17].a][1], 0, 0);
                                    } else if (var4.f == 6 && GlobalStatus.fightData[var17].l) {
                                        MainCanvas.pngUtil.roleSelectedAnimation(var5, (Animation) GameSceneController._27, (int[]) null, 0, 0, GlobalConfig.Q[GlobalStatus.fightData[var17].a][0], GlobalConfig.Q[GlobalStatus.fightData[var17].a][1], 0, 0);
                                    }
                                }
                            } else {
                                MainCanvas.pngUtil.roleSelectedAnimation(var5, (Animation) GameSceneController.quit, (int[]) null, 0, 0, GlobalConfig.Q[GlobalStatus.fightData[var17].a][0], GlobalConfig.Q[GlobalStatus.fightData[var17].a][1], 0, 0);
                            }
                        } else if (var4.f == 7) {
                            for (int var7 = 0; var7 < GlobalStatus.teamBonus.length; ++var7) {
                                if (GlobalStatus.teamBonus[var7].name.equals(GlobalStatus.fightData[var17].d) && GlobalStatus.teamBonus[var7].s_1 == 1) {
                                    MainCanvas.pngUtil.roleSelectedAnimation(var5, (Animation) GameSceneController.quit, (int[]) null, 0, 0, GlobalConfig.Q[GlobalStatus.fightData[var17].a][0], GlobalConfig.Q[GlobalStatus.fightData[var17].a][1], 0, 0);
                                } else if (GlobalStatus.teamBonus[var7].name.equals(GlobalStatus.fightData[var17].d) && GlobalStatus.teamBonus[var7].s_1 == 0 && !GlobalStatus.fightData[var17].d()) {
                                    if (GlobalStatus.fightData[var17].k == 1 || GlobalStatus.fightData[var17].k == 4) {
                                        GlobalStatus.fightData[var17].a(var5, MainCanvas.pngUtil, GlobalConfig.Q[GlobalStatus.fightData[var17].a][0], GlobalConfig.Q[GlobalStatus.fightData[var17].a][1], (byte) 0);
                                    }

                                    if (var4.f != -1 && var4.f != 0 && GlobalStatus.fightData[var17].m) {
                                        MainCanvas.pngUtil.roleSelectedAnimation(var5, (Animation) GameSceneController.defence, (int[]) null, 0, 0, GlobalConfig.Q[GlobalStatus.fightData[var17].a][0], GlobalConfig.Q[GlobalStatus.fightData[var17].a][1], 0, 0);
                                    } else if (var4.f == 6 && GlobalStatus.fightData[var17].l) {
                                        MainCanvas.pngUtil.roleSelectedAnimation(var5, (Animation) GameSceneController._27, (int[]) null, 0, 0, GlobalConfig.Q[GlobalStatus.fightData[var17].a][0], GlobalConfig.Q[GlobalStatus.fightData[var17].a][1], 0, 0);
                                    }
                                }
                            }
                        } else if (!GlobalStatus.fightData[var17].d()) {
                            if (GlobalStatus.fightData[var17].k == 1 || GlobalStatus.fightData[var17].k == 4) {
                                GlobalStatus.fightData[var17].a(var5, MainCanvas.pngUtil, GlobalConfig.Q[GlobalStatus.fightData[var17].a][0], GlobalConfig.Q[GlobalStatus.fightData[var17].a][1], (byte) 0);
                            }

                            if (var4.f != -1 && var4.f != 0 && GlobalStatus.fightData[var17].m) {
                                MainCanvas.pngUtil.roleSelectedAnimation(var5, (Animation) GameSceneController.defence, (int[]) null, 0, 0, GlobalConfig.Q[GlobalStatus.fightData[var17].a][0], GlobalConfig.Q[GlobalStatus.fightData[var17].a][1], 0, 0);
                            } else if (var4.f == 6 && GlobalStatus.fightData[var17].l) {
                                MainCanvas.pngUtil.roleSelectedAnimation(var5, (Animation) GameSceneController._27, (int[]) null, 0, 0, GlobalConfig.Q[GlobalStatus.fightData[var17].a][0], GlobalConfig.Q[GlobalStatus.fightData[var17].a][1], 0, 0);
                            }
                        }
                    }

                    if (GlobalStatus.fightData[var17].s.size() > 0 && GlobalStatus.fightData[var17].j != null) {
                        for (byte var22 = 0; var22 < GlobalStatus.fightData[var17].s.size(); ++var22) {
                            MainCanvas.pngUtil.a(var5, (Sprite) GlobalStatus.fightData[var17].s.elementAt(var22), (int[]) null, 0, 0, 0, GlobalConfig.Q[GlobalStatus.fightData[var17].a][0] - GlobalStatus.fightData[var17].h() / 2, GlobalConfig.Q[GlobalStatus.fightData[var17].a][1] + var22 * 11 - GlobalStatus.fightData[var17].i(), 0, 0);
                        }
                    }
                }
            }

            var5 = graphics;
            var4 = this;
            if (GlobalStatus.M != null) {
                for (byte var18 = 0; var18 < GlobalStatus.M.length; ++var18) {
                    if (GlobalStatus.M[var18].m != null) {
                        if (GlobalStatus.M[var18].a()) {
                            if (t == 1 || t == 2) {
                                MainCanvas.pngUtil.roleSelectedAnimation(var5, (Animation) GameSceneController.dead, (int[]) null, 0, 0, GlobalConfig.R[GlobalStatus.M[var18].a][0], GlobalConfig.R[GlobalStatus.M[var18].a][1], 0, 0);
                            }
                        } else {
                            if (GlobalStatus.M[var18].n != 1 && GlobalStatus.M[var18].n != 4) {
                                if (GlobalStatus.M[var18].n == 2) {
                                    if (var4.skillAnim != null && var4.skillAnim.framW.length > 0) {
                                        GlobalStatus.M[var18].a(var5, MainCanvas.pngUtil, GlobalConfig.R[GlobalStatus.M[var18].a][0], GlobalConfig.R[GlobalStatus.M[var18].a][1], (byte) 0);
                                    } else if (GlobalStatus.M[var18].q) {
                                        if (c((int) var4.E[0].c) >= 0 && c((int) var4.E[0].c) < GlobalStatus.M.length) {
                                            GlobalStatus.M[var18].a(var5, MainCanvas.pngUtil, GlobalConfig.R[GlobalStatus.M[c((int) var4.E[0].c)].a][0], GlobalConfig.R[GlobalStatus.M[c((int) var4.E[0].c)].a][1], (byte) 0);
                                        }
                                    } else if (a(var4.E[0].c) >= 0 && a(var4.E[0].c) < GlobalStatus.fightData.length) {
                                        GlobalStatus.M[var18].a(var5, MainCanvas.pngUtil, GlobalConfig.Q[GlobalStatus.fightData[a(var4.E[0].c)].a][0] - GlobalStatus.fightData[a(var4.E[0].c)].h() / 2, GlobalConfig.Q[GlobalStatus.fightData[a(var4.E[0].c)].a][1], (byte) 0);
                                    }
                                }
                            } else {
                                GlobalStatus.M[var18].a(var5, MainCanvas.pngUtil, GlobalConfig.R[GlobalStatus.M[var18].a][0], GlobalConfig.R[GlobalStatus.M[var18].a][1], (byte) 0);
                                if (var4.f != -1 && var4.f != 0 && GlobalStatus.M[var18].p) {
                                    MainCanvas.pngUtil.roleSelectedAnimation(var5, (Animation) GameSceneController.defence, (int[]) null, 0, 0, GlobalConfig.R[GlobalStatus.M[var18].a][0], GlobalConfig.R[GlobalStatus.M[var18].a][1], 0, 0);
                                } else if (var4.f == 6 && GlobalStatus.M[var18].o) {
                                    MainCanvas.pngUtil.roleSelectedAnimation(var5, (Animation) GameSceneController._27, (int[]) null, 0, 0, GlobalConfig.R[GlobalStatus.M[var18].a][0], GlobalConfig.R[GlobalStatus.M[var18].a][1], 0, 0);
                                }
                            }

                            if (GlobalStatus.M[var18].u.size() > 0) {
                                for (byte var23 = 0; var23 < GlobalStatus.M[var18].u.size(); ++var23) {
                                    ck var8;
                                    MainCanvas.pngUtil.a(var5, (Sprite) GlobalStatus.M[var18].u.elementAt(var23), (int[]) null, 0, 0, 0, GlobalConfig.R[GlobalStatus.M[var18].a][0] - ((var8 = GlobalStatus.M[var18]).m != null && var8.m.frameW != null ? var8.m.frameW[0] : 0) / 2, GlobalConfig.R[GlobalStatus.M[var18].a][1] + var23 * 11 - GlobalStatus.M[var18].d(), 0, 0);
                                }
                            }
                        }
                    }
                }
            }

            var5 = graphics;
            var4 = this;
            if (GlobalStatus.fightData != null && this.f != 7) {
                for (byte var19 = 0; var19 < GlobalStatus.fightData.length; ++var19) {
                    if (!GlobalStatus.fightData[var19].d() && GlobalStatus.fightData[var19].k == 2 && var4.E[0].c >= 0) {
                        if (var4.skillAnim != null && var4.skillAnim.framW.length > 0) {
                            GlobalStatus.fightData[var19].a(var5, MainCanvas.pngUtil, GlobalConfig.Q[GlobalStatus.fightData[var19].a][0], GlobalConfig.Q[GlobalStatus.fightData[var19].a][1], (byte) 0);
                        } else {
                            byte var24 = 0;
                            if (GlobalStatus.fightData[var19].n) {
                                if ((var24 = (byte) a(var4.E[0].c)) >= 0 && var24 <= GlobalStatus.fightData.length - 1) {
                                    GlobalStatus.fightData[var19].a(var5, MainCanvas.pngUtil, GlobalConfig.Q[GlobalStatus.fightData[a(var4.E[0].c)].a][0], GlobalConfig.Q[GlobalStatus.fightData[a(var4.E[0].c)].a][1], (byte) 0);
                                }
                            } else if ((var24 = (byte) c((int) var4.E[0].c)) >= 0 && var24 <= GlobalStatus.M.length - 1) {
                                GlobalStatus.fightData[var19].a(var5, MainCanvas.pngUtil, GlobalConfig.R[GlobalStatus.M[c((int) var4.E[0].c)].a][0] + GlobalStatus.M[c((int) var4.E[0].c)].c() / 2, GlobalConfig.R[GlobalStatus.M[c((int) var4.E[0].c)].a][1], (byte) 0);
                            }
                        }
                    }
                }
            }

            Graphics var3 = graphics;
            FightModel var9 = this;
            if (this.d != 4 && this.d != 5 && this.d != 6) {
                if (this.d != 0 && this.d != 1) {
                    if (this.d == 2 || this.d == 3) {
                        Graphics var21 = graphics;

                        for (byte var27 = 0; var27 < GlobalStatus.fightData.length; ++var27) {
                            if (GlobalStatus.fightData[var27].e > 0 && GlobalStatus.fightData[var27].b != 0 && GlobalStatus.fightData[var27].a == i() + 3) {
                                LoadingPage.drawHpBar(var21, GlobalConfig.Q[GlobalStatus.fightData[var27].a][0] - 10, GlobalConfig.Q[GlobalStatus.fightData[var27].a][1] - 9 - GlobalStatus.fightData[var27].i(), GlobalStatus.fightData[var27].e * 19 / (GlobalStatus.fightData[var27].f <= 0 ? 1 : GlobalStatus.fightData[var27].f), 0);
                                LoadingPage.drawHpBar(var21, GlobalConfig.Q[GlobalStatus.fightData[var27].a][0] - 10, GlobalConfig.Q[GlobalStatus.fightData[var27].a][1] - 4 - GlobalStatus.fightData[var27].i(), GlobalStatus.fightData[var27].g * 19 / (GlobalStatus.fightData[var27].h <= 0 ? 1 : GlobalStatus.fightData[var27].h), 1);
                            }
                        }
                    }
                } else {
                    var5 = graphics;

                    for (byte var20 = 0; var20 < GlobalStatus.fightData.length; ++var20) {
                        if (GlobalStatus.fightData[var20].e > 0 && GlobalStatus.fightData[var20].b == 0 && GlobalStatus.fightData[var20].c.equals(GlobalStatus.roleId_2)) {
                            if (GlobalStatus.fightData[var20].i == 291) {
                                LoadingPage.drawHpBar(var5, GlobalConfig.Q[GlobalStatus.fightData[var20].a][0] - 10, GlobalConfig.Q[GlobalStatus.fightData[var20].a][1] - 2 - GlobalStatus.fightData[var20].i(), GlobalStatus.fightData[var20].e * 19 / (GlobalStatus.fightData[var20].f <= 0 ? 1 : GlobalStatus.fightData[var20].f), 0);
                                LoadingPage.drawHpBar(var5, GlobalConfig.Q[GlobalStatus.fightData[var20].a][0] - 10, GlobalConfig.Q[GlobalStatus.fightData[var20].a][1] + 3 - GlobalStatus.fightData[var20].i(), GlobalStatus.fightData[var20].g * 19 / (GlobalStatus.fightData[var20].h <= 0 ? 1 : GlobalStatus.fightData[var20].h), 1);
                            } else {
                                LoadingPage.drawHpBar(var5, GlobalConfig.Q[GlobalStatus.fightData[var20].a][0] - 10, GlobalConfig.Q[GlobalStatus.fightData[var20].a][1] - 9 - GlobalStatus.fightData[var20].i(), GlobalStatus.fightData[var20].e * 19 / (GlobalStatus.fightData[var20].f <= 0 ? 1 : GlobalStatus.fightData[var20].f), 0);
                                LoadingPage.drawHpBar(var5, GlobalConfig.Q[GlobalStatus.fightData[var20].a][0] - 10, GlobalConfig.Q[GlobalStatus.fightData[var20].a][1] - 4 - GlobalStatus.fightData[var20].i(), GlobalStatus.fightData[var20].g * 19 / (GlobalStatus.fightData[var20].h <= 0 ? 1 : GlobalStatus.fightData[var20].h), 1);
                            }
                        }
                    }
                }
            }

            for (byte var12 = 0; var12 < GlobalStatus.fightData.length; ++var12) {
                if (GlobalStatus.fightData != null && var12 >= 0 && var12 <= GlobalStatus.fightData.length - 1 && var12 >= 0 && !GlobalStatus.fightData[var12].d()) {
                    if (var9.i == var12 && (var9.d == 4 || var9.d == 5)) {
                        LoadingPage.drawString(var3, (String) GlobalStatus.fightData[var9.i].d, (int) 2, 2, 20, 14337302, 0);
                    }

                    if (GlobalStatus.fightData[var12].b == 0) {
                        if (GlobalStatus.fightData[var12].i == 291) {
                            LoadingPage.drawHpBar(var3, GlobalConfig.Q[GlobalStatus.fightData[var12].a][0] - 10, GlobalConfig.Q[GlobalStatus.fightData[var12].a][1] - 2 - GlobalStatus.fightData[var12].i(), GlobalStatus.fightData[var12].e * 19 / GlobalStatus.fightData[var12].f, 0);
                            LoadingPage.drawHpBar(var3, GlobalConfig.Q[GlobalStatus.fightData[var12].a][0] - 10, GlobalConfig.Q[GlobalStatus.fightData[var12].a][1] + 3 - GlobalStatus.fightData[var12].i(), GlobalStatus.fightData[var12].g * 19 / GlobalStatus.fightData[var12].h, 1);
                        } else {
                            LoadingPage.drawHpBar(var3, GlobalConfig.Q[GlobalStatus.fightData[var12].a][0] - 10, GlobalConfig.Q[GlobalStatus.fightData[var12].a][1] - 9 - GlobalStatus.fightData[var12].i(), GlobalStatus.fightData[var12].e * 19 / GlobalStatus.fightData[var12].f, 0);
                            LoadingPage.drawHpBar(var3, GlobalConfig.Q[GlobalStatus.fightData[var12].a][0] - 10, GlobalConfig.Q[GlobalStatus.fightData[var12].a][1] - 4 - GlobalStatus.fightData[var12].i(), GlobalStatus.fightData[var12].g * 19 / GlobalStatus.fightData[var12].h, 1);
                        }
                    } else if (GlobalStatus.fightData[var12].b == 2) {
                        LoadingPage.drawHpBar(var3, GlobalConfig.Q[GlobalStatus.fightData[var12].a][0] - 10, GlobalConfig.Q[GlobalStatus.fightData[var12].a][1] - 9 - GlobalStatus.fightData[var12].i(), GlobalStatus.fightData[var12].e * 19 / GlobalStatus.fightData[var12].f, 0);
                        LoadingPage.drawHpBar(var3, GlobalConfig.Q[GlobalStatus.fightData[var12].a][0] - 10, GlobalConfig.Q[GlobalStatus.fightData[var12].a][1] - 4 - GlobalStatus.fightData[var12].i(), GlobalStatus.fightData[var12].g * 19 / GlobalStatus.fightData[var12].h, 1);
                    }
                }
            }

            for (byte var13 = 0; var13 < GlobalStatus.M.length; ++var13) {
                if (var13 >= 0 && !GlobalStatus.M[var13].a()) {
                    LoadingPage.drawHpBar(var3, GlobalConfig.R[GlobalStatus.M[var13].a][0] - 11, GlobalConfig.R[GlobalStatus.M[var13].a][1] - 4 - GlobalStatus.M[var13].d(), GlobalStatus.M[var13].e * 19 / GlobalStatus.M[var13].f, 0);
                    if (var9.h == var13 && (var9.d == 1 || var9.d == 0 || var9.d == 2 || var9.d == 3 || var9.d == 9)) {
                        LoadingPage.drawString(var3, (String) GlobalStatus.M[var13].d, (int) 2, 2, 20, 14337302, 0);
                        LoadingPage.drawString(var3, (String) ("" + GlobalConfig.ShangHaiLeiXing[GlobalStatus.M[var13].k]), (int) (GlobalConfig.defaultWidth - 2), 2, 24, 14337302, 0);
                    }

                    if (GlobalStatus.M[var13].i > 99) {
                        MainCanvas.pngUtil.a(var3, GameSceneController.lvl, (int[]) null, GlobalStatus.M[var13].i / 100 + 1, 0, 0, GlobalConfig.R[GlobalStatus.M[var13].a][0] - 15, GlobalConfig.R[GlobalStatus.M[var13].a][1] - 11 - GlobalStatus.M[var13].d(), 0, 0);
                        MainCanvas.pngUtil.a(var3, GameSceneController.lvl, (int[]) null, (GlobalStatus.M[var13].i - 100) / 10 + 1, 0, 0, GlobalConfig.R[GlobalStatus.M[var13].a][0] - 11, GlobalConfig.R[GlobalStatus.M[var13].a][1] - 11 - GlobalStatus.M[var13].d(), 0, 0);
                        MainCanvas.pngUtil.a(var3, GameSceneController.lvl, (int[]) null, GlobalStatus.M[var13].i % 10 + 1, 0, 0, GlobalConfig.R[GlobalStatus.M[var13].a][0] - 7, GlobalConfig.R[GlobalStatus.M[var13].a][1] - 11 - GlobalStatus.M[var13].d(), 0, 0);
                    } else if (GlobalStatus.M[var13].i > 9) {
                        MainCanvas.pngUtil.a(var3, GameSceneController.lvl, (int[]) null, GlobalStatus.M[var13].i / 10 + 1, 0, 0, GlobalConfig.R[GlobalStatus.M[var13].a][0] - 11, GlobalConfig.R[GlobalStatus.M[var13].a][1] - 11 - GlobalStatus.M[var13].d(), 0, 0);
                        MainCanvas.pngUtil.a(var3, GameSceneController.lvl, (int[]) null, GlobalStatus.M[var13].i % 10 + 1, 0, 0, GlobalConfig.R[GlobalStatus.M[var13].a][0] - 7, GlobalConfig.R[GlobalStatus.M[var13].a][1] - 11 - GlobalStatus.M[var13].d(), 0, 0);
                    } else if (GlobalStatus.M[var13].i > 1) {
                        MainCanvas.pngUtil.a(var3, GameSceneController.lvl, (int[]) null, GlobalStatus.M[var13].i % 10 + 1, 0, 0, GlobalConfig.R[GlobalStatus.M[var13].a][0] - 11, GlobalConfig.R[GlobalStatus.M[var13].a][1] - 11 - GlobalStatus.M[var13].d(), 0, 0);
                    }

                    if (var9.h == var13 && GlobalStatus.M[var13].l == 1) {
                        MainCanvas.pngUtil.a(var3, GameSceneController.elite, (int[]) null, -1, 0, 0, 4 + GlobalConfig.font2.stringWidth(GlobalStatus.M[var13].d), 6, 0, 0);
                    }
                }
            }
        }

        if (this.f == 0 || this.f == 1) {
            if (this.d != 4 && this.d != 5 && this.d != 6 && this.d != 7 && this.d != 8) {
                if (this.h >= 0 && this.h <= GlobalStatus.M.length - 1) {
                    PngUtil.animate(GameSceneController.select, this.y.frameStartTs);
                    MainCanvas.pngUtil.roleSelectedAnimation(graphics, (Animation) GameSceneController.select, (int[]) null, 0, 0, GlobalConfig.R[GlobalStatus.M[this.h].a][0], GlobalConfig.R[GlobalStatus.M[this.h].a][1] - 10 - GlobalStatus.M[this.h].d(), 20, 0);
                }
            } else if (this.i >= 0 && this.i <= GlobalStatus.fightData.length - 1 && GlobalStatus.fightData[this.i].j != null) {
                PngUtil.animate(GameSceneController.select, this.y.frameStartTs);
                MainCanvas.pngUtil.roleSelectedAnimation(graphics, (Animation) GameSceneController.select, (int[]) null, 0, 0, GlobalConfig.Q[GlobalStatus.fightData[this.i].a][0], GlobalConfig.Q[GlobalStatus.fightData[this.i].a][1] - 10 - GlobalStatus.fightData[this.i].i(), 20, 0);
            }
        }

        if (this.f == 0) {
            if (this.d == 0) {
                this.b(graphics);
            } else if (this.d == 2) {
                this.c(graphics);
            }

            if ((GlobalStatus.bs >= 0 && GlobalStatus.followStatus == 0 || t == 1 || t == 2) && s >= 0) {
                LoadingPage.drawString(graphics, (String) String.valueOf(s), (int) (GlobalConfig.defaultWidth / 2), GlobalConfig.defaultHigh / 2 - (GlobalConfig.defaultHigh <= 240 ? GlobalConfig.font2_h : GlobalConfig.font2_h / 2), 17, 16711680, 0);
            }
        } else if (this.f == 3) {
            this.a(graphics);
            this.e(graphics);
        } else if (this.f != 4) {
            if (this.f == 5) {
                if (this.F != null && this.skillAnim != null) {
                    this.skillAnim.a(graphics, MainCanvas.pngUtil, 0, 0);
                }
            } else if (this.f == 6) {
                this.a(graphics);
            } else if (this.f == -1) {
                this.drawTips(graphics, "请等待......");
            } else if (this.f == 9) {
                this.drawTips(graphics, "等待队友......");
            }
        }

        this.d(graphics);
        if (GlobalStatus.bt && c > 0) {
            LoadingPage.drawString(graphics, (String) ("自动回合:" + c), (int) (GlobalConfig.defaultWidth - GlobalConfig.font2.stringWidth("自动回合:" + c) / 2 - 45), 2, 17, 16777215, 0);
        }

        if (GlobalConfig.supportTouch) {
            graphics.drawImage(MainCanvas.button_back.image, GlobalConfig.defaultWidth - MainCanvas.button_back.w, GlobalConfig.defaultHigh - MainCanvas.button_back.h, 20);
        }

        graphics.setClip(0, 0, GlobalConfig.defaultWidth, GlobalConfig.defaultHigh);
    }

    private void n() {
        for (byte var1 = 0; var1 < this.F.length; ++var1) {
            if (this.F[var1].k >= 0 && this.F[var1].b == 1) {
                for (byte var2 = 0; var2 < GlobalStatus.M.length; ++var2) {
                    if (GlobalStatus.M[var2] != null && !GlobalStatus.M[var2].a() && this.F[var1].c == GlobalStatus.M[var2].a) {
                        GlobalStatus.M[var2].b((byte) 4);
                    }
                }
            }
        }

        this.B = this.y.frameStartTs;
        this.f = 3;
    }

    private void o() {
        if (this.E[0].a == 0) {
            byte var4 = 0;

            while (true) {
                if (var4 >= GlobalStatus.fightData.length) {
                    return;
                }

                GlobalStatus.fightData[var4].l = false;
                if (GlobalStatus.fightData[var4].a == this.E[0].b) {
                    if (this.E[0].d != 1 && this.E[0].d != 5 && this.E[0].d != 8 && this.E[0].d != 10) {
                        if (this.E[0].d == 2) {
                            GlobalStatus.fightData[var4].l = true;
                            this.f = 6;
                        } else if (this.E[0].d == 3) {
                            GlobalStatus.fightData[var4].m = true;
                        } else {
                            if (this.E[0].d != -1) {
                                return;
                            }

                            this.B = this.y.frameStartTs;
                            this.f = 3;
                        }
                        break;
                    }

                    if (this.E[0].d == 8) {
                        GlobalStatus.fightData[var4].n = true;
                    }

                    this.skillAnim = null;
                    if (this.E[0].d == 5) {
                        if (this.E[0].e >= 10) {
                            this.skillAnim = new SkillAnim(this.E[0].e, this.v());

                            for (byte var9 = 0; var9 < this.skillAnim.framW.length; ++var9) {
                                if (this.F != null) {
                                    for (byte var12 = 0; var12 < this.F.length; ++var12) {
                                        if (this.F[var12].b == 1 && this.F[var12].l == 0) {
                                            this.F[var12].l = 1;
                                            if (c((int) this.F[var12].c) >= 0 && c((int) this.F[var12].c) < GlobalStatus.M.length && GlobalStatus.M[c((int) this.F[var12].c)].m != null) {
                                                this.skillAnim.a(var9, GlobalConfig.R[this.F[var12].c][0], GlobalConfig.R[this.F[var12].c][1]);
                                            }
                                            break;
                                        }

                                        if (this.F[var12].b == 0 && this.F[var12].l == 0) {
                                            this.F[var12].l = 1;
                                            if (GlobalStatus.fightData[a(this.F[var12].c)].j != null) {
                                                this.skillAnim.a(var9, GlobalConfig.Q[this.F[var12].c][0], GlobalConfig.Q[this.F[var12].c][1]);
                                            }
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (this.E[0].d == 10) {
                        if (this.E[0].e >= 10) {
                            this.skillAnim = new SkillAnim(this.E[0].e, 1);
                            if (this.F != null) {
                                for (byte var8 = 0; var8 < this.F.length; ++var8) {
                                    if (this.F[var8].b >= 0) {
                                        if (this.F[var8].b == 1) {
                                            this.skillAnim.a(0, GlobalConfig.R[1][0], GlobalConfig.R[1][1]);
                                        } else if (this.F[var8].b == 0) {
                                            this.skillAnim.a(0, GlobalConfig.Q[1][0], GlobalConfig.Q[1][1]);
                                        }
                                        break;
                                    }
                                }
                            }
                        }
                    } else if (this.E[0].e >= 10) {
                        this.skillAnim = new SkillAnim(this.E[0].e, this.E[0].e == 22 ? 1 : this.w());

                        for (byte var7 = 0; var7 < this.skillAnim.framW.length; ++var7) {
                            if (this.F != null) {
                                for (byte var11 = 0; var11 < this.F.length; ++var11) {
                                    if (this.F[var11].b == 1 && this.F[var11].l == 0 || this.E[0].e == 22) {
                                        this.F[var11].l = 1;
                                        if (c((int) this.F[var11].c) >= 0 && c((int) this.F[var11].c) < GlobalStatus.M.length && GlobalStatus.M[c((int) this.F[var11].c)].m != null) {
                                            this.skillAnim.a(var7, GlobalConfig.R[this.F[var11].c][0], GlobalConfig.R[this.F[var11].c][1]);
                                        }
                                        break;
                                    }
                                }
                            }
                        }
                    }

                    GlobalStatus.fightData[var4].b((byte) 2);
                    this.f = 2;
                    this.D = this.y.frameStartTs;
                    break;
                }

                ++var4;
            }
        } else if (this.E[0].a == 1) {
            for (byte var1 = 0; var1 < GlobalStatus.M.length; ++var1) {
                GlobalStatus.M[var1].o = false;
                if (GlobalStatus.M[var1].a == this.E[0].b) {
                    if (this.E[0].d == 6) {
                        break;
                    }

                    if (t == 0 || this.E[0].d == 8 || t == 1 && (this.E[0].d == 1 || this.E[0].d == 5) || t == 2 && (this.E[0].d == 1 || this.E[0].d == 5) || t == 1 && (this.E[0].d == 1 || this.E[0].d == 10) || t == 2 && (this.E[0].d == 1 || this.E[0].d == 10)) {
                        if (this.E[0].d == 8) {
                            GlobalStatus.M[var1].q = true;
                        }

                        GlobalStatus.M[var1].b((byte) 2);
                        this.skillAnim = null;
                        if (this.E[0].d == 5) {
                            if (this.E[0].e >= 10) {
                                this.skillAnim = new SkillAnim(this.E[0].e, this.v());

                                for (byte var2 = 0; var2 < this.skillAnim.framW.length; ++var2) {
                                    if (this.F != null) {
                                        for (byte var3 = 0; var3 < this.F.length; ++var3) {
                                            if (this.F[var3].b == 0 && this.F[var3].l == 0) {
                                                this.F[var3].l = 1;
                                                if (a(this.F[var3].c) >= 0 && a(this.F[var3].c) <= GlobalStatus.fightData.length - 1 && GlobalStatus.fightData[a(this.F[var3].c)].j != null) {
                                                    this.skillAnim.a(var2, GlobalConfig.Q[this.F[var3].c][0], GlobalConfig.Q[this.F[var3].c][1]);
                                                    break;
                                                }
                                            } else if (this.F[var3].b == 1 && this.F[var3].l == 0) {
                                                this.F[var3].l = 1;
                                                if (c((int) this.F[var3].c) >= 0 && c((int) this.F[var3].c) <= GlobalStatus.M.length - 1 && GlobalStatus.M[c((int) this.F[var3].c)].m != null) {
                                                    this.skillAnim.a(var2, GlobalConfig.R[this.F[var3].c][0], GlobalConfig.R[this.F[var3].c][1]);
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (this.E[0].d == 10) {
                            if (this.E[0].e >= 10) {
                                this.skillAnim = new SkillAnim(this.E[0].e, 1);
                                if (this.F != null) {
                                    for (byte var5 = 0; var5 < this.F.length; ++var5) {
                                        if (this.F[var5].b >= 0) {
                                            if (this.F[var5].b == 1) {
                                                this.skillAnim.a(0, GlobalConfig.R[1][0], GlobalConfig.R[1][1]);
                                            } else if (this.F[var5].b == 0) {
                                                this.skillAnim.a(0, GlobalConfig.Q[1][0], GlobalConfig.Q[1][1]);
                                            }
                                            break;
                                        }
                                    }
                                }
                            }
                        } else if (this.E[0].e >= 10) {
                            this.skillAnim = new SkillAnim(this.E[0].e, this.w());

                            for (byte var6 = 0; var6 < this.skillAnim.framW.length; ++var6) {
                                if (this.F != null) {
                                    for (byte var10 = 0; var10 < this.F.length; ++var10) {
                                        if (this.F[var10].b == 0 && this.F[var10].l == 0 && a(this.F[var10].c) >= 0 && a(this.F[var10].c) <= GlobalStatus.fightData.length - 1 && GlobalStatus.fightData[a(this.F[var10].c)].j != null) {
                                            this.F[var10].l = 1;
                                            this.skillAnim.a(var6, GlobalConfig.Q[this.F[var10].c][0], GlobalConfig.Q[this.F[var10].c][1]);
                                            break;
                                        }
                                    }
                                }
                            }
                        }

                        this.f = 2;
                        this.D = this.y.frameStartTs;
                        return;
                    }

                    if (this.E[0].d == 2) {
                        GlobalStatus.M[var1].o = true;
                        this.f = 6;
                        return;
                    }

                    if (this.E[0].d == 3) {
                        GlobalStatus.M[var1].p = true;
                        return;
                    }

                    if (this.E[0].d == -1) {
                        this.B = this.y.frameStartTs;
                        this.f = 3;
                        return;
                    }
                    break;
                }
            }
        }

    }

    private static void a(Vector var0, Vector var1) {
        Object var2 = null;

        for (int var3 = 0; var3 < var0.size(); ++var3) {
            Sprite var4 = (Sprite) var0.elementAt(var3);
            if (!var1.contains(var4)) {
                var0.removeElementAt(var3);
                var3 = 0;
            }
        }

        for (int var6 = 0; var6 < var1.size(); ++var6) {
            Sprite var5 = (Sprite) var1.elementAt(var6);
            if (!var0.contains(var5)) {
                var0.addElement(var5);
            }
        }

    }

    private void p() {
        if (this.I - this.C >= 1000L) {
            this.C = this.y.frameStartTs;
            if (--s <= 0) {
                if (GlobalStatus.bt && c <= 0) {
                    this.gameSceneController.O();
                    c = 0;
                    this.e = 5;
                    return;
                }

                this.j = 0;
                this.gameSceneController.az = this.gameSceneController.az <= GlobalStatus.ej.length - 1 && this.gameSceneController.az >= 0 ? this.gameSceneController.az : 0;
                this.p = GlobalStatus.ej[this.gameSceneController.az];
                this.n = 1;
                this.h = this.h <= GlobalStatus.M.length - 1 && this.h >= 0 ? this.h : 0;
                this.a((byte) (GlobalStatus.bt ? 0 : 1), GlobalStatus.bt ? 0 : 1, (byte) 1, GlobalStatus.M[this.h].a, (byte) (GlobalStatus.bt ? 0 : 1), GlobalStatus.bt ? 0 : 1, (byte) 1, GlobalStatus.M[this.h].a);
                this.f = -1;
                this.e = 5;
                if (!ab_1.c()) {
                    c = (byte) (GlobalStatus.bt ? c - 1 : 0);
                }
            }
        }

    }

    private void q() {
        if (GlobalStatus.npcResName1[this.gameSceneController.az] != -1 && this.gameSceneController.az >= 0 && this.gameSceneController.az < 8) {
            this.j = 0;
            this.p = GlobalStatus.ej[this.gameSceneController.az];
            if (h() && GlobalStatus.ek[this.gameSceneController.az] != 2) {
                this.y.showTips("只能使用复活道具");
                return;
            }

            if (GlobalStatus.el[this.gameSceneController.az] == 2) {
                this.n = 1;
                this.o = GlobalStatus.M[this.h].a;
                if (c() > 1 && c() > GlobalStatus.em[this.gameSceneController.az]) {
                    this.d = 1;
                    return;
                }

                if (this.j()) {
                    this.a(this.j, this.p, this.n, this.o, (byte) 1, 1, (byte) 1, GlobalStatus.M[this.h].a);
                    this.f = -1;
                    this.e = 5;
                    return;
                }

                this.d = 2;
                this.e = 3;
                return;
            }

            if (GlobalStatus.el[this.gameSceneController.az] == 1) {
                this.n = 0;
                this.i = f() < 0 ? this.i : f();
                this.d = 7;
                return;
            }

            if (GlobalStatus.el[this.gameSceneController.az] == 0) {
                this.n = 0;
                this.o = this.i = i();
                if (this.j()) {
                    this.a(this.j, this.p, this.n, this.o, (byte) 1, 1, (byte) 1, (byte) -1);
                    this.f = -1;
                    this.e = 5;
                    return;
                }

                this.d = 2;
                this.e = 3;
            }
        }

    }

    private void r() {
        if (GlobalStatus.er[this.gameSceneController.az] == 2) {
            this.l = 1;
            if (c() > 1 && c() > GlobalStatus.es[this.gameSceneController.az]) {
                this.k = 0;
                this.q = GlobalStatus.ep[this.gameSceneController.az];
                this.d = 3;
            } else {
                this.a(this.j, this.p, this.n, this.o, (byte) 0, this.gameSceneController.az, (byte) 1, GlobalStatus.M[this.h].a);
                this.f = -1;
                this.e = 5;
            }
        } else if (GlobalStatus.er[this.gameSceneController.az] == 1) {
            this.l = 0;
            this.k = 0;
            this.q = GlobalStatus.ep[this.gameSceneController.az];
            if (b() > 1 && b() > GlobalStatus.es[this.gameSceneController.az]) {
                this.i = this.g();
                this.d = 8;
            } else {
                this.m = this.i = (byte) (i() + 3);
                this.l = 0;
                this.a(this.j, this.p, this.n, this.o, this.k, this.q, this.l, this.m);
                this.f = -1;
                this.e = 5;
            }
        } else {
            if (GlobalStatus.er[this.gameSceneController.az] == 0) {
                this.k = 0;
                this.q = GlobalStatus.ep[this.gameSceneController.az];
                this.m = (byte) (i() + 3);
                this.l = 0;
                this.i = this.g();
                this.a(this.j, this.p, this.n, this.o, this.k, this.q, this.l, this.m);
                this.f = -1;
                this.e = 5;
            }

        }
    }

    private boolean b(int var1) {
        return c() <= 1 || GlobalStatus.ek != null && c() <= GlobalStatus.em[this.gameSceneController.az];
    }

    public static int b() {
        byte var0 = 0;

        for (byte var1 = 0; var1 < GlobalStatus.fightData.length; ++var1) {
            if (GlobalStatus.fightData[var1].e > 0) {
                ++var0;
            }
        }

        return var0;
    }

    public static int c() {
        int var0 = 0;

        for (byte var1 = 0; var1 < GlobalStatus.M.length; ++var1) {
            if (GlobalStatus.M[var1].e > 0) {
                ++var0;
            }
        }

        return var0;
    }

    public final void a(byte var1, int var2, byte var3, byte var4, byte var5, int var6, byte var7, byte var8) {
        if (var1 != 4 && a(var3, var4) && var3 == 0) {
            boolean var10000;
            label104:
            {
                int var10 = var2;
                if (var1 == 2) {
                    Object var9 = null;

                    for (int var11 = 0; var11 < GlobalStatus.equipmentSlot.size(); ++var11) {
                        EquipmentSlot var13;
                        if ((var13 = (EquipmentSlot) GlobalStatus.equipmentSlot.elementAt(var11)) != null && var10 == var13.a && var13.f == 2) {
                            var10000 = true;
                            break label104;
                        }
                    }
                } else if (var1 == 0) {
                    if (GlobalStatus.ek[var2] == 2) {
                        var10000 = true;
                        break label104;
                    }

                    if (GlobalStatus.ek[var2] == 6 && GlobalStatus.el[var2] == 1) {
                        var10000 = true;
                        break label104;
                    }
                } else if (var1 == 1) {
                    for (int var14 = 0; var14 < GlobalStatus.skillSubTypes.length; ++var14) {
                        if (var10 == GlobalStatus.skillIds[var14] && GlobalStatus.skillSubTypes[var14] == 1) {
                            var10000 = true;
                            break label104;
                        }
                    }
                }

                var10000 = false;
            }

            if (!var10000) {
                this.y.showTips("不能对死亡目标使用");
                return;
            }
        }

        if (var5 != 4 && a(var7, var8) && var3 == 0) {
            boolean var17;
            label73:
            {
                int var16 = var6;
                if (var5 != 2) {
                    if (var5 == 0) {
                        if (GlobalStatus.eq != null && GlobalStatus.eq[var6] == 2) {
                            var17 = true;
                            break label73;
                        }
                    } else if (var5 == 1 && GlobalStatus.cU != null) {
                        for (int var15 = 0; var15 < GlobalStatus.cU.length; ++var15) {
                            if (var16 == GlobalStatus.cR[var15] && GlobalStatus.cU[var15] == 1) {
                                var17 = true;
                                break label73;
                            }
                        }
                    }
                }

                var17 = false;
            }

            if (!var17) {
                this.y.showTips("不能对死亡目标使用");
                return;
            }
        }

        byte[] var12;
        GlobalConfig.printStr("[FIGHT] 发送攻击包4180: v(fightId)=" + GlobalStatus.v + " g=" + g + " t=" + t);
        if ((var12 = NetPayloadBuilder.a((short) 4180, GlobalStatus.roleId_2, GlobalStatus.v, g, t, var1, var2, var3, var4, (short) var5, var6, var7, var8)) != null) {
            MainCanvas.netUtils.sendPacket(new NetPacket((short) 4180, var12));
            this.J = false;
            this.d = 0;
        } else {
            this.y.showTips("获取上传指令数据错误!");
        }
    }

    private static boolean a(byte var0, byte var1) {
        if (var0 == 0) {
            for (int var2 = 0; var2 < GlobalStatus.fightData.length; ++var2) {
                if (GlobalStatus.fightData[var2].a == var1 && GlobalStatus.fightData[var2].e <= 0) {
                    return true;
                }
            }
        } else if (var0 == 1) {
            for (int var3 = 0; var3 < GlobalStatus.M.length; ++var3) {
                if (GlobalStatus.M[var3].a == var1 && GlobalStatus.M[var3].e <= 0) {
                    return true;
                }
            }
        }

        return false;
    }

    private void a(Graphics var1) {
        if (this.F != null && this.F.length > 0) {
            byte var2 = 0;
            byte var3 = 0;
            byte var4 = 0;
            byte var5 = 0;

            for (byte var6 = 0; var6 < this.F.length; ++var6) {
                if (this.F[var6].b == 1 && this.F[var6].d != 0 && c((int) this.F[var6].c) >= 0 && c((int) this.F[var6].c) < GlobalStatus.M.length) {
                    int var10002 = this.F[var6].d;
                    short var10003 = GlobalConfig.R[this.F[var6].c][0];
                    int var10004 = GlobalConfig.R[this.F[var6].c][1] - GlobalStatus.M[c((int) this.F[var6].c)].d();
                    int var16;
                    if (this.F[var6].f <= 24) {
                        ae var10005 = this.F[var6];
                        var16 = var10005.f += 4;
                    } else {
                        var16 = 24;
                    }

                    this.a(var1, var10002, var10003, var10004 - var16 + var2 * 10, 1, 0, 0);
                    ++var2;
                }

                if (this.F[var6].b == 1 && this.F[var6].e != 0 && c((int) this.F[var6].c) >= 0 && c((int) this.F[var6].c) < GlobalStatus.M.length) {
                    int var7 = this.F[var6].e;
                    short var10 = GlobalConfig.R[this.F[var6].c][0];
                    int var13 = GlobalConfig.R[this.F[var6].c][1] - GlobalStatus.M[c((int) this.F[var6].c)].d();
                    int var18;
                    if (this.F[var6].f <= 24) {
                        ae var17 = this.F[var6];
                        var18 = var17.f += 4;
                    } else {
                        var18 = 24;
                    }

                    this.a(var1, var7, var10, var13 - var18 + var3 * 10, 0, 0, 0);
                    ++var3;
                }

                if (this.F[var6].b == 0 && this.F[var6].d != 0 && a(this.F[var6].c) >= 0 && a(this.F[var6].c) < GlobalStatus.fightData.length) {
                    int var8 = this.F[var6].d;
                    int var11 = GlobalConfig.Q[this.F[var6].c][0] + 10;
                    int var14 = GlobalConfig.Q[this.F[var6].c][1] - GlobalStatus.fightData[a(this.F[var6].c)].i();
                    int var20;
                    if (this.F[var6].f <= 24) {
                        ae var19 = this.F[var6];
                        var20 = var19.f += 4;
                    } else {
                        var20 = 24;
                    }

                    this.a(var1, var8, var11, var14 - var20 + var4 * 10, 1, 0, 1);
                    ++var4;
                }

                if (this.F[var6].b == 0 && this.F[var6].e != 0 && a(this.F[var6].c) >= 0 && a(this.F[var6].c) < GlobalStatus.fightData.length) {
                    int var9 = this.F[var6].e;
                    int var12 = GlobalConfig.Q[this.F[var6].c][0] + 10;
                    int var15 = GlobalConfig.Q[this.F[var6].c][1] - GlobalStatus.fightData[a(this.F[var6].c)].i();
                    int var22;
                    if (this.F[var6].f <= 24) {
                        ae var21 = this.F[var6];
                        var22 = var21.f += 4;
                    } else {
                        var22 = 24;
                    }

                    this.a(var1, var9, var12, var15 - var22 + var5 * 10, 0, 0, 1);
                    ++var5;
                }
            }

        }
    }

    private void drawTips(Graphics var1, String var2) {
        if (this.y.pageStatus != 2) {
            if (this.K == null) {
                this.K = LoadingPage.parseText(var2, GlobalConfig.font2, GlobalConfig.defaultWidth / 2 - 20, "/t");
            }

            if (this.K != null) {
                LoadingPage.a(var1, (GlobalConfig.defaultWidth - GlobalConfig.font2_w * 10) / 2, (GlobalConfig.defaultHigh - GlobalConfig.font2_h * this.K.length - 20) / 2, GlobalConfig.font2_w * 10, GlobalConfig.font2_h * this.K.length + 20);

                for (int var3 = 0; var3 < this.K.length; ++var3) {
                    LoadingPage.drawString(var1, (String) this.K[var3], (int) (GlobalConfig.defaultWidth / 2), (GlobalConfig.defaultHigh - GlobalConfig.font2_h * this.K.length - 20) / 2 + 10 + var3 * GlobalConfig.font2_h, 17, LoadingPage.a, 0);
                }
            }
        }

    }

    public final void d() {
        this.y.globalLoadingMask = true;
        this.y.doRepaint();
        if (this.v != null) {
            this.v.removeAllElements();
            this.v = null;
        }

        if (this.w != null) {
            this.w.removeAllElements();
            this.w = null;
        }

        if (this.skillAnim != null) {
            this.skillAnim = null;
        }

        e();
        this.y.doRepaint();
        GlobalStatus.p();
        this.y.doRepaint();
        this.gameSceneController.c = false;
        this.y.doRepaint();
        this.u = null;
        this.gameSceneController.setRoleResNames();
        this.y.doRepaint();
        GlobalStatus.g();
        this.y.doRepaint();
        MainCanvas.pngUtil.drawMap(this.gameSceneController.currentMap, GameSceneController.h, GameSceneController.i_1, true, false, 1283472);
        this.y.doRepaint();
        this.gameSceneController.j();
        this.y.doRepaint();
        this.y.globalLoadingMask = false;
        r = System.currentTimeMillis();
        g = -1;
    }

    public static void e() {
        if (GlobalStatus.M != null) {
            for (byte var0 = 0; var0 < GlobalStatus.M.length; ++var0) {
                if (GlobalStatus.M[var0] != null) {
                    GlobalStatus.M[var0].b();
                    GlobalStatus.M[var0] = null;
                }
            }

            GlobalStatus.M = null;
        }

        if (GlobalStatus.fightData != null) {
            for (byte var1 = 0; var1 < GlobalStatus.fightData.length; ++var1) {
                if (GlobalStatus.fightData[var1] != null) {
                    GlobalStatus.fightData[var1].e();
                    GlobalStatus.fightData[var1] = null;
                }
            }

            GlobalStatus.fightData = null;
        }

    }

    private static void a(FightRoleData var0, ae var1) {
        var0.e = var1.g;
        var0.g = var1.h;
        var0.f = var1.i;
        var0.h = var1.j;
        if (var0.c.equals(GlobalStatus.roleId_2) && GlobalStatus.x != -1) {
            GlobalStatus.currentHealth = var0.e;
            GlobalStatus.totalMana = var0.g;
            GlobalStatus.totalHealth = var0.f;
            GlobalStatus.currentMana = var0.h;
        }

    }

    public final int a(int var1, int var2) {
        if (this.L != null) {
            for (int var3 = 0; var3 < this.L.length; ++var3) {
                if (var1 >= this.L[var3][0] && var1 <= this.L[var3][0] + this.L[var3][2] && var2 >= this.L[var3][1] && var2 <= this.L[var3][1] + this.L[var3][3]) {
                    this.e = var3;
                    return 1073741824;
                }
            }
        }

        return 0;
    }

    private void b(Graphics var1) {
        if (GameSceneController.fightmenu != null) {
            for (byte var2 = 0; var2 < 5; ++var2) {
                int var10003 = GlobalConfig.defaultHigh - 102 + (var2 << 4);
                short var6 = GameSceneController.fightmenu.h;
                boolean var3 = true;
                int var5 = var10003;
                var3 = true;
                if (this.L != null && this.L.length > var2) {
                    this.L[var2][0] = 1;
                    this.L[var2][1] = var5;
                    this.L[var2][2] = 25;
                    this.L[var2][3] = var6;
                }

                MainCanvas.pngUtil.a(var1, GameSceneController.fightmenu, (int[]) null, var2 + 1, 0, 0, 1, GlobalConfig.defaultHigh - 102 + (var2 << 4), 0, 0);
                if (var2 == this.e) {
                    var1.setColor(16711680);
                    LoadingPage.d(var1, 1, GlobalConfig.defaultHigh - 102 + (this.e << 4), 25, 15);
                    switch (this.e) {
                        case 0:
                            LoadingPage.drawString(var1, (String) "攻击", (int) (GlobalConfig.defaultWidth / 2), GlobalConfig.defaultHigh - 22 - GlobalConfig.font2_h, 17, 16776960, 0);
                            break;
                        case 1:
                            LoadingPage.drawString(var1, (String) "防御", (int) (GlobalConfig.defaultWidth / 2), GlobalConfig.defaultHigh - 22 - GlobalConfig.font2_h, 17, 16776960, 0);
                            break;
                        case 2:
                            LoadingPage.drawString(var1, (String) "技能", (int) (GlobalConfig.defaultWidth / 2), GlobalConfig.defaultHigh - 22 - GlobalConfig.font2_h, 17, 16776960, 0);
                            break;
                        case 3:
                            LoadingPage.drawString(var1, (String) "道具", (int) (GlobalConfig.defaultWidth / 2), GlobalConfig.defaultHigh - 22 - GlobalConfig.font2_h, 17, 16776960, 0);
                            break;
                        case 4:
                            LoadingPage.drawString(var1, (String) "逃跑", (int) (GlobalConfig.defaultWidth / 2), GlobalConfig.defaultHigh - 22 - GlobalConfig.font2_h, 17, 16776960, 0);
                    }
                }
            }
        }

    }

    public final int b(int var1, int var2) {
        if (this.M != null) {
            for (int var3 = 0; var3 < this.M.length; ++var3) {
                if (var1 >= this.M[var3][0] && var1 <= this.M[var3][0] + this.M[var3][2] && var2 >= this.M[var3][1] && var2 <= this.M[var3][1] + this.M[var3][3]) {
                    this.e = var3;
                    return 1073741824;
                }
            }
        }

        return 0;
    }

    private void c(Graphics var1) {
        if (GameSceneController.fightmenu != null) {
            for (byte var2 = 0; var2 < 3; ++var2) {
                int var10003 = GlobalConfig.defaultHigh - 70 + (var2 << 4);
                short var6 = GameSceneController.fightmenu.h;
                boolean var3 = true;
                int var5 = var10003;
                var3 = true;
                if (this.M != null && this.M.length > var2) {
                    this.M[var2][0] = 1;
                    this.M[var2][1] = var5;
                    this.M[var2][2] = 25;
                    this.M[var2][3] = var6;
                }

                MainCanvas.pngUtil.a(var1, GameSceneController.fightmenu, (int[]) null, var2 + 1, 0, 0, 1, GlobalConfig.defaultHigh - 70 + (var2 << 4), 0, 0);
                if (var2 == this.e) {
                    var1.setColor(16711680);
                    LoadingPage.d(var1, 1, GlobalConfig.defaultHigh - 70 + (var2 << 4), 25, 15);
                    switch (this.e) {
                        case 0:
                            LoadingPage.drawString(var1, (String) "攻击", (int) (GlobalConfig.defaultWidth / 2), GlobalConfig.defaultHigh - 22 - GlobalConfig.font2_h, 17, 16776960, 0);
                            break;
                        case 1:
                            LoadingPage.drawString(var1, (String) "防御", (int) (GlobalConfig.defaultWidth / 2), GlobalConfig.defaultHigh - 22 - GlobalConfig.font2_h, 17, 16776960, 0);
                            break;
                        case 2:
                            LoadingPage.drawString(var1, (String) "技能", (int) (GlobalConfig.defaultWidth / 2), GlobalConfig.defaultHigh - 22 - GlobalConfig.font2_h, 17, 16776960, 0);
                    }
                }
            }
        }

    }

    public final int a(int var1, int var2, int var3) {
        if (this.N != null) {
            if ((var1 = var1 == 0 ? 5 : (var1 == 2 ? 3 : 0)) == 0) {
                return 0;
            }

            for (int var4 = 0; var4 < this.N.length; ++var4) {
                if (var2 >= this.N[var4][0] && var2 <= this.N[var4][0] + this.N[var4][2] && var3 >= this.N[var4][1] && var3 <= this.N[var4][1] + this.N[var4][3]) {
                    if (this.gameSceneController.az != var4 || this.e != var1) {
                        this.e = var1;
                        this.gameSceneController.az = (byte) (var4 - 1);
                        return 2;
                    }

                    if (this.gameSceneController.az == var4 && this.e == var1) {
                        return this.O[var4];
                    }
                }
            }
        }

        return 0;
    }

    private void d(Graphics var1) {
        if (GlobalStatus.ej != null) {
            if (this.d != 0 && this.d != 1 && this.d != 4) {
                this.gameSceneController.a(var1, 0, GlobalConfig.defaultHigh - 22, 1);
            } else {
                this.gameSceneController.a(var1, 0, GlobalConfig.defaultHigh - 22, 0);
            }

            for (byte var2 = 0; var2 < GlobalStatus.ej.length; ++var2) {
                PngUtil var10000;
                Graphics var10001;
                Sprite var10002;
                Object var10003;
                int var10004;
                if (var2 >= 0 && var2 < 8) {
                    var10000 = MainCanvas.pngUtil;
                    var10001 = var1;
                    var10002 = MainCanvas.num;
                    var10003 = null;
                    var10004 = var2 + 1;
                } else {
                    MainCanvas.pngUtil.a(var1, GameSceneController.fighticon, (int[]) null, var2 == 8 ? 0 : 2, 0, 0, 3 + GlobalStatus.ej[var2] * 17, GlobalConfig.defaultHigh - 19, 0, 0);
                    var10000 = MainCanvas.pngUtil;
                    var10001 = var1;
                    var10002 = GameSceneController.hotkeyicon;
                    var10003 = null;
                    var10004 = var2 == 8 ? 0 : 1;
                }

                var10000.a(var10001, var10002, (int[]) var10003, var10004, 0, 0, 3 + GlobalStatus.ej[var2] * 17, GlobalConfig.defaultHigh - 19, 0, 0);
                int var9 = 3 + var2 * 17;
                int var10 = GlobalConfig.defaultHigh - 19;
                boolean var3 = true;
                var3 = true;
                int var6 = var10;
                int var5 = var9;
                if (this.N != null && this.N.length > var2) {
                    this.N[var2][0] = var5;
                    this.N[var2][1] = var6;
                    this.N[var2][2] = 17;
                    this.N[var2][3] = 17;
                }
            }

            if (this.e == 5 && GlobalStatus.ej != null || this.e == 3 && GlobalStatus.ej != null && this.d > 1) {
                for (byte var7 = 0; var7 < GlobalStatus.ej.length; ++var7) {
                    if (var7 == this.gameSceneController.az) {
                        var1.setColor(16711680);
                        LoadingPage.d(var1, 2 + var7 * 17, GlobalConfig.defaultHigh - 20, 17, 17);
                        if (this.f == 0) {
                            switch (this.gameSceneController.az) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                    if (this.d == 0) {
                                        if (GlobalStatus.npcResName1[this.gameSceneController.az] == -1) {
                                            return;
                                        }

                                        LoadingPage.drawString(var1, (String) GlobalStatus.appearanceResName[this.gameSceneController.az], (int) (GlobalConfig.defaultWidth / 2), GlobalConfig.defaultHigh - 22 - GlobalConfig.font2_h, 17, 16776960, 0);
                                    } else {
                                        if (this.d != 2 || GlobalStatus.npcResName2[this.gameSceneController.az] == -1) {
                                            return;
                                        }

                                        LoadingPage.drawString(var1, (String) GlobalStatus.eu[this.gameSceneController.az], (int) (GlobalConfig.defaultWidth / 2), GlobalConfig.defaultHigh - 22 - GlobalConfig.font2_h, 17, 16776960, 0);
                                    }

                                    return;
                                case 8:
                                    LoadingPage.drawString(var1, (String) "聊天记录", (int) (GlobalConfig.defaultWidth / 2), GlobalConfig.defaultHigh - 22 - GlobalConfig.font2_h, 17, 16776960, 0);
                                    return;
                                case 9:
                                    LoadingPage.drawString(var1, (String) "自动打怪", (int) (GlobalConfig.defaultWidth / 2), GlobalConfig.defaultHigh - 22 - GlobalConfig.font2_h, 17, 16776960, 0);
                                    return;
                                default:
                                    return;
                            }
                        }
                        break;
                    }
                }
            }

        }
    }

    private void e(Graphics var1) {
        if (this.u != null) {
            for (byte var2 = 0; var2 < this.u.length; ++var2) {
                LoadingPage.drawString(var1, (String) this.u[var2], (int) (GlobalConfig.defaultWidth / 2), (GlobalConfig.defaultHigh - this.u.length * GlobalConfig.font2_h) / 2 + var2 * GlobalConfig.font2_h, 17, 15849739, 0);
            }
        }

    }

    private int s() {
        if (this.skillAnim != null) {
            SkillAnim var10000 = this.skillAnim;
            long var3 = this.y.frameStartTs;
            PngUtil var5 = MainCanvas.pngUtil;
            return PngUtil.animate(var10000.animation, var3);
        } else {
            return 0;
        }
    }

    public final void a(i[] var1) {
        if (this.v != null) {
            for (int var2 = 0; var2 < GlobalStatus.fightData.length; ++var2) {
                if (GlobalStatus.fightData[var2] != null) {
                    GlobalStatus.fightData[var2].m = false;
                    GlobalStatus.fightData[var2].l = false;
                }
            }

            synchronized (this.v) {
                this.v.addElement(var1);
            }
        }
    }

    public final void a(ae[] var1) {
        if (this.w != null) {
            synchronized (this.w) {
                this.w.addElement(var1);
            }
        }
    }

    public final void a(String var1) {
        if (this.x != null) {
            synchronized (this.x) {
                this.x.addElement(LoadingPage.parseText(var1, GlobalConfig.font2, GlobalConfig.defaultWidth * 5 / 7, "\t"));
            }
        }
    }

    public static byte f() {
        for (byte var0 = 0; var0 < GlobalStatus.fightData.length; ++var0) {
            if (GlobalStatus.fightData[var0].c.equals(GlobalStatus.roleId_2)) {
                return var0;
            }
        }

        return -1;
    }

    public final byte g() {
        for (byte var1 = 0; var1 < GlobalStatus.fightData.length; ++var1) {
            if (GlobalStatus.fightData[var1].b != 0 && GlobalStatus.fightData[var1].a == i() + 3) {
                return var1;
            }
        }

        return -1;
    }

    private static boolean t() {
        if (GlobalStatus.M != null) {
            for (byte var0 = 0; var0 < GlobalStatus.M.length; ++var0) {
                if (GlobalStatus.M[var0] != null && GlobalStatus.M[var0].e > 0) {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean u() {
        if (GlobalStatus.fightData != null) {
            for (byte var0 = 0; var0 < GlobalStatus.fightData.length; ++var0) {
                if (GlobalStatus.fightData[var0] != null && GlobalStatus.fightData[var0].e > 0 && GlobalStatus.fightData[var0].b != 2) {
                    return false;
                }
            }
        }

        return true;
    }

    private static int a(byte var0) {
        for (byte var1 = 0; var1 < GlobalStatus.fightData.length; ++var1) {
            if (GlobalStatus.fightData[var1].a == var0) {
                return var1;
            }
        }

        return -1;
    }

    private static int c(int var0) {
        for (byte var1 = 0; var1 < GlobalStatus.M.length; ++var1) {
            if (GlobalStatus.M[var1].a == var0) {
                return var1;
            }
        }

        return -1;
    }

    public static boolean h() {
        for (byte var0 = 0; var0 < GlobalStatus.fightData.length; ++var0) {
            if (GlobalStatus.fightData[var0].b == 0 && GlobalStatus.fightData[var0].c.equals(GlobalStatus.roleId_2) && GlobalStatus.fightData[var0].e <= 0) {
                return true;
            }
        }

        return false;
    }

    public static byte i() {
        for (byte var0 = 0; var0 < GlobalStatus.fightData.length; ++var0) {
            if (GlobalStatus.fightData[var0].b == 0 && GlobalStatus.fightData[var0].c.equals(GlobalStatus.roleId_2)) {
                return GlobalStatus.fightData[var0].a;
            }
        }

        return -1;
    }

    public final boolean j() {
        for (byte var1 = 0; var1 < GlobalStatus.fightData.length; ++var1) {
            if (GlobalStatus.fightData[var1].b != 0 && GlobalStatus.fightData[var1].a == i() + 3 && GlobalStatus.fightData[var1].e > 0) {
                return false;
            }
        }

        return true;
    }

    private static byte b(byte var0) {
        if (--var0 < 0) {
            var0 = (byte) (GlobalStatus.M.length - 1);
        }

        while (GlobalStatus.M[var0].a()) {
            if (--var0 < 0) {
                var0 = (byte) (GlobalStatus.M.length - 1);
            }
        }

        return var0;
    }

    private static byte c(byte var0) {
        if (--var0 < 0) {
            var0 = (byte) (GlobalStatus.fightData.length - 1);
        }

        return var0;
    }

    private byte v() {
        byte var1 = 0;
        if (this.F != null) {
            for (byte var2 = 0; var2 < this.F.length; ++var2) {
                if (this.F[var2].a >= 5) {
                    ++var1;
                }
            }
        }

        return var1;
    }

    private int w() {
        int var1 = 0;
        if (this.F != null) {
            for (byte i = 0; i < this.F.length; ++i) {
                if (this.F[i].b != this.E[0].a) {
                    ++var1;
                }
            }
        }

        return var1;
    }

    private static boolean x() {
        for (byte var0 = 0; var0 < GlobalStatus.fightData.length; ++var0) {
            if (!GlobalStatus.fightData[var0].d() && GlobalStatus.fightData[var0].k != 1) {
                return false;
            }
        }

        for (byte var1 = 0; var1 < GlobalStatus.M.length; ++var1) {
            if (!GlobalStatus.M[var1].a() && GlobalStatus.M[var1].n != 1) {
                return false;
            }
        }

        return true;
    }

    public static void k() {
        if (GlobalStatus.bt) {
            if ((P = s) <= 0) {
                P = 1;
            }

            serverFightTextSpeed_2 = 1;
            s = 1;
        } else {
            s = P;
        }

        short var10000 = GlobalStatus.bt ? 1 : (short) serverFightTextSpeed;
        serverFightTextSpeed_2 = var10000;
        s = var10000;
        c = (short) (GlobalStatus.bt ? 25 : 0);
        GameSceneController.roleConfig[15] = (byte) (GlobalStatus.bt ? 0 : 1);
    }

    public final void l() {
        this.d();
        this.gameSceneController.lastSceneModeId = this.gameSceneController.currentSceneModeId = 0;
    }

    public final void m() {
        for (int var1 = 0; var1 < GlobalStatus.fightData.length; ++var1) {
            if (GlobalStatus.fightData[var1].c.equals(GlobalStatus.roleId_2)) {
                this.i = (byte) var1;
                return;
            }
        }

    }

    private static boolean y() {
        for (int var0 = 0; var0 < GlobalStatus.fightData.length; ++var0) {
            if (GlobalStatus.fightData[var0].c.equals(GlobalStatus.roleId_2) && GlobalStatus.fightData[var0].o) {
                return true;
            }
        }

        return false;
    }

    private static boolean d(byte var0) {
        return var0 == 4 || var0 == 6 || var0 == 7 || var0 == 5;
    }

    private void a(Graphics var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        int var9 = 0;
        var6 = var2 >= 0 ? var2 : -var2;

        for (int var8 = 0; var6 > 0; var9 = var8++) {
            var6 /= 10;
        }

        int var13;
        if (var7 == 0) {
            var13 = (var9 + 2) / 2 * 7;
        } else {
            var13 = (var9 + 2) * 7;
        }

        var1.drawRegion(GameSceneController.fightnum.image, var2 >= 0 ? 8 : 0, var5 == 0 ? 0 : 10, 8, 10, 0, var3 - var13, var4, 0);
        var6 = var2 >= 0 ? var2 : -var2;

        for (int var10 = var9; var10 >= 0; --var10) {
            var1.drawRegion(GameSceneController.fightnum.image, 16 + var6 / d(var10) * 7, var5 == 0 ? 0 : 10, 7, 10, 0, var3 + 8 + (var9 - var10) * 7 - var13, var4, 0);
            var6 %= d(var10);
        }

    }

    private static int d(int var0) {
        int var1 = 1;

        for (int var2 = 0; var2 < var0; ++var2) {
            var1 *= 10;
        }

        return var1;
    }

    static {
        s = serverFightTextSpeed_2;
        P = (short) serverFightTextSpeed;
    }
}

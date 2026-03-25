/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.io.ConnectionNotFoundException
 *  javax.microedition.lcdui.Alert
 *  javax.microedition.lcdui.AlertType
 *  javax.microedition.lcdui.Canvas
 *  javax.microedition.lcdui.ChoiceGroup
 *  javax.microedition.lcdui.Command
 *  javax.microedition.lcdui.CommandListener
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.lcdui.Form
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 *  javax.microedition.lcdui.Item
 *  javax.microedition.lcdui.ItemStateListener
 *  javax.microedition.lcdui.StringItem
 *  javax.microedition.lcdui.TextField
 *  javax.microedition.midlet.MIDletStateChangeException
 *  javax.microedition.rms.RecordStore
 *  javax.microedition.rms.RecordStoreException
 *  javax.microedition.rms.RecordStoreNotOpenException
 */
package com.yinhan.kjava.main;

import com.yinhan.kjava.main.MainMidlet;
import com.yinhan.kjava.main.b;
import com.yinhan.kjava.main.d;
import com.yinhan.kjava.main.e;
import com.yinhan.kjava.main.f;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
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
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.ItemStateListener;
import javax.microedition.lcdui.StringItem;
import javax.microedition.lcdui.TextField;
import javax.microedition.midlet.MIDletStateChangeException;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreNotOpenException;

public final class a
extends Canvas
implements Runnable,
CommandListener {
    public int a;
    public int b;
    public short c = 0;
    public MainMidlet d;
    public static ao e;
    public static ai f;
    private boolean aJ;
    public boolean g = false;
    public boolean h = false;
    public static av i;
    public short j;
    public short k;
    public StringBuffer l;
    public int m;
    public static bf n;
    private String aK = "mhxy.zyy" + t.r + "_" + t.s;
    public boolean o = false;
    public boolean p = false;
    public Display q;
    public static bf r;
    public static bf s;
    public static bf t;
    public static bf u;
    public static bf v;
    public static bf w;
    public static bf x;
    public static bf y;
    public static bf z;
    public static bc A;
    public static bc B;
    public static bf C;
    public static bf D;
    public static bf E;
    public static az F;
    public static bf G;
    public static bf H;
    public static bf I;
    public static bf J;
    public static bf K;
    public static bf L;
    public static bf M;
    public static bf N;
    public static bf O;
    public static bf P;
    public static bf Q;
    public static bf[] R;
    public static bf[] S;
    public static bf T;
    public static bf U;
    public static bf V;
    public static bf W;
    public static bf X;
    public static bf Y;
    public static bf Z;
    private static Image[] aL;
    private static Image aM;
    public static Image aa;
    public static bu ab;
    public static bu ac;
    public static bu ad;
    public static bu ae;
    public static bu af;
    public static bu ag;
    public static bu ah;
    public static com.yinhan.kjava.main.c ai;
    public f aj;
    public long ak;
    public long al = 0L;
    private static Vector aN;
    private static StringBuffer aO;
    private long aP = 0L;
    private long aQ;
    private boolean aR;
    private String aS = null;
    private bw aT;
    private boolean aU = false;
    private int aV;
    private int aW;
    private int aX;
    private int aY;
    private boolean aZ = false;
    private int ba;
    private ChoiceGroup bb;
    private ChoiceGroup bc;
    private ChoiceGroup bd;
    private Image be = null;
    private Image bf = null;
    private Image bg = null;
    private Image bh = null;
    private Image bi = null;
    private Image bj;
    private Image bk;
    private static bu bl;
    private static bc bm;
    private static bc bn;
    private String[] bo = null;
    private int[][] bp;
    private int[] bq;
    private int br;
    private int bs = 0;
    private int bt;
    private int bu;
    private static boolean bv;
    public static String am;
    public static String an;
    public static byte ao;
    public static boolean ap;
    private int bw = -1;
    public m aq = null;
    public c ar = null;
    public n as = null;
    public an at = null;
    public l au = null;
    public y av = null;
    public int aw = 0;
    private bc[] bx;
    private bc[] by;
    private byte bz;
    private byte bA;
    private int bB = 0;
    private int[][] bC = null;
    public int ax;
    public String ay = "";
    private Image bD = null;
    private byte bE;
    private byte bF;
    private int bG = 0;
    private int bH = 0;
    public boolean az;
    public int aA = 0;
    private int bI = -1;
    private long bJ = 0L;
    private static byte bK;
    public static byte aB;
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
    private byte bY = (byte)-1;
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

    public a(MainMidlet mainMidlet, Display display) {
        t.a(mainMidlet);
        runnable.setFullScreenMode(true);
        runnable.q = display;
        runnable.d = mainMidlet;
        ai = new com.yinhan.kjava.main.c(mainMidlet, display);
        runnable.aJ = true;
        t.b = (short)runnable.getWidth();
        t.c = (short)runnable.getHeight();
        ao.a = t.d = t.b;
        ao.b = t.e = t.c;
        runnable.m = 10;
        if (t.b >= 240) {
            runnable.m = 8;
            ao.a = t.d = (short)(t.b * 95 / 100);
            ao.b = t.e = (short)(t.c * (t.c > 320 ? 80 : 95) / 100);
            t.f = ao.o = (short)((t.b - ao.a) / 2);
            t.g = ao.p = (short)((t.c - ao.b) / 2);
        }
        y.c().a(t.f, t.g, t.d, t.e);
        runnable.y();
        Runnable runnable = new Thread(runnable);
        ((Thread)runnable).start();
    }

    public final void a() {
        ab.c();
        ae.c();
        af.c();
        ah.c();
        this.l = new StringBuffer();
        this.aq = new m();
        this.ar = new c();
        this.au = new l();
        this.as = new n();
        this.at = new an();
    }

    public final void a(String string, String string2) {
        if (i == null) {
            i = new av();
        } else {
            com.yinhan.kjava.main.a.a(string, (byte)2);
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

    /*
     * Unable to fully structure code
     */
    public final void run() {
        while (this.aJ) {
            block172: {
                this.ak = System.currentTimeMillis();
                try {
                    var1_1 = this;
                    if (com.yinhan.kjava.main.a.i != null) {
                        com.yinhan.kjava.main.a.i.c();
                    }
                    if (!var1_1.aJ) break block172;
                    switch (var1_1.j) {
                        case 0: {
                            break;
                        }
                        case 1: {
                            var2_6 = var1_1;
                            ++var2_6.al;
                            if (var2_6.ak - var2_6.aP < 60000L) break;
                            var2_6.b("\u54cd\u5e94\u8d85\u65f6");
                            break;
                        }
                        case 2: {
                            var2_6 = var1_1;
                            if (var2_6.ak - var2_6.aQ >= 6600L) ** GOTO lbl22
                            var4_16 = var2_6;
                            if (!(var4_16.k == 7 && com.yinhan.kjava.main.a.e.g != null && com.yinhan.kjava.main.a.e.k == 25) || var2_6.ak - var2_6.aQ < 2000L) ** GOTO lbl23
lbl22:
                            // 2 sources

                            if (var2_6.aR) ** GOTO lbl24
lbl23:
                            // 2 sources

                            if (var2_6.a != 0x40000000 && var2_6.a != 517 && var2_6.a != 0x20000000 && var2_6.a != 0x10000000 && !com.yinhan.kjava.main.a.u()) ** GOTO lbl94
lbl24:
                            // 2 sources

                            if (var2_6.aS != null && var2_6.aS.startsWith("\u7cfb\u7edf\u5f02\u5e38")) {
                                var2_6.t();
                                break;
                            }
                            if (bt.eC.startsWith("\u5f02\u5e38\u79bb\u7ebf") || bt.eB == 0 || var2_6.k == 9) {
                                var2_6.G();
                                break;
                            }
                            if (bt.eC != null && (bt.eC.startsWith("\u8fde\u63a5\u8d85\u65f6") || bt.eC.startsWith("\u54cd\u5e94\u8d85\u65f6"))) {
                                if (com.yinhan.kjava.main.a.i != null) {
                                    com.yinhan.kjava.main.a.i.d();
                                    com.yinhan.kjava.main.a.i = null;
                                }
                                var2_6.y();
                                break;
                            }
                            if (bt.eC != null && com.yinhan.kjava.main.a.e != null) {
                                if (bt.aC == 1 && (bt.eC.endsWith("\u8d85Q\u7528\u6237\u624d\u53ef\u5151\u6362") || bt.eC.endsWith("\u8d85Q\u7528\u6237\u624d\u53ef\u63a5\u53d6"))) {
                                    com.yinhan.kjava.main.a.e.af();
                                }
                                if (bt.aH == 1 && (bt.eC.endsWith("\u9b54\u94bb\u7528\u6237\u624d\u53ef\u5151\u6362") || bt.eC.endsWith("\u9b54\u94bb\u7528\u6237\u624d\u53ef\u63a5\u53d6"))) {
                                    com.yinhan.kjava.main.a.e.ag();
                                }
                            }
                            if (bt.eC != null && bt.eC.equals("\u60a8\u5df2\u77ed\u4fe1\u7533\u8bf7\u5f00\u901aVIP\u670d\u52a1")) {
                                var2_6.k = (short)7;
                                var2_6.j = (short)7;
                            }
                            if (var2_6.k == 3 || bt.eB == -4) {
                                if (t.a == 1) {
                                    if (bb.g != null) {
                                        var2_6.aJ = false;
                                    } else {
                                        var2_6.b(null, av.h);
                                    }
                                } else {
                                    var2_6.b(null, av.h);
                                }
                            } else if (var2_6.k == 4) {
                                if (t.a == 1) {
                                    if (bt.hw) {
                                        var2_6.c();
                                    } else {
                                        var2_6.d();
                                    }
                                } else {
                                    var2_6.d();
                                }
                            } else if (var2_6.k == 5) {
                                var2_6.b(bt.Y.length);
                            } else if (var2_6.k == 6) {
                                var2_6.C();
                            } else if (var2_6.k == 10) {
                                var2_6.G();
                            } else if (var2_6.k == 7) {
                                if (com.yinhan.kjava.main.a.e.k == 71) {
                                    com.yinhan.kjava.main.a.e.e(var2_6.as.a);
                                    var2_6.ar.a(com.yinhan.kjava.main.a.e.aE);
                                } else if (com.yinhan.kjava.main.a.e.k == 76) {
                                    var3_7 = var2_6.as.a;
                                    var4_17 = var2_6.ar.g();
                                    com.yinhan.kjava.main.a.e.d(var3_7);
                                    var5_20 = var3_7 == 0 ? bt.O.f.length : bt.P.b.length;
                                    var2_6.ar.a(Math.min(var4_17, var5_20));
                                } else if (com.yinhan.kjava.main.a.e.k == 77) {
                                    com.yinhan.kjava.main.a.e.u();
                                    var2_6.ar.a(bt.P.i);
                                } else {
                                    var2_6.i();
                                }
                            } else if (var2_6.k == 9) {
                                var2_6.G();
                            } else if (var2_6.k == 14) {
                                var2_6.c();
                            }
lbl94:
                            // 18 sources

                            var2_6.b = 0;
                            var2_6.a = 0;
                            if (!t.o || var2_6.aj == null) break;
                            var2_6.aj.c = 0;
                            var2_6.aj.d = 0;
                            break;
                        }
                        case 3: {
                            var2_6 = var1_1;
                            if (var2_6.aZ) {
                                var2_6.a("socket://120.78.151.213:20008", "http://117.135.138.130:7099");
                                t.a(var2_6.l);
                                var3_8 = var2_6;
                                bt.b = var3_8.bN.getString();
                                var3_8 = var2_6;
                                bt.c = var3_8.bO.getString();
                                var2_6.F();
                                v0 = bz.a((short)5379, bt.b, bt.c, t.v);
                                var4_16 = v0;
                                if (v0 != null) {
                                    var5_21 = new w(5379, (byte[])var4_16);
                                    new w(5379, (byte[])var4_16).a = true;
                                    com.yinhan.kjava.main.a.i.a(var5_21);
                                    var2_6.aZ = false;
                                    var2_6.a((String)null);
                                } else {
                                    var2_6.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
                                }
                            }
                            var2_6.a = 0;
                            break;
                        }
                        case 4: {
                            var2_6 = var1_1;
                            if (var2_6.c == 0) {
                                if (t.a == 1 && var2_6.bw != bb.d) {
                                    var2_6.bw = bb.d;
                                    var2_6.d();
                                }
                                if (var2_6.aq != null) {
                                    var2_6.aq.b(var2_6.a);
                                }
                                if (var2_6.a == 0x10000000 || var2_6.a == 0x40000000 || var2_6.a == 517) {
                                    if (bt.hA != null || bt.hA.length > 0) {
                                        if (t.a == 0) {
                                            var4_18 = var2_6.ar.g();
                                            var3_9 = var2_6;
                                            com.yinhan.kjava.main.a.s();
                                            var5_22 = null;
                                            if (av.h == 1) {
                                                if (bt.hB[var4_18].equals("")) {
                                                    var3_9.b(bt.hA[var4_18] + "\u7e41\u5fd9,\u8bf7\u9009\u62e9\u5176\u4ed6\u670d!");
                                                } else {
                                                    var5_22 = bt.hB[var4_18];
                                                    com.yinhan.kjava.main.a.a("http://117.135.138.130:7099", (byte)1);
                                                    bz.c = bt.hE[var4_18];
                                                    var3_9.a(bt.hE[var4_18]);
                                                }
                                            } else if (bt.hC[var4_18].equals("")) {
                                                var3_9.b(bt.hA[var4_18] + "\u7e41\u5fd9,\u8bf7\u9009\u62e9\u5176\u4ed6\u670d!");
                                            } else {
                                                var5_22 = bt.hC[var4_18];
                                                com.yinhan.kjava.main.a.a(var5_22, (byte)2);
                                                var3_9.a(bt.hE[var4_18]);
                                            }
                                            var3_9.a(var5_22, "http://117.135.138.130:7099");
                                            bz.c = bt.hE[var4_18];
                                            v1 = bz.g((short)4196, bt.hy, bt.hz);
                                            var4_16 = v1;
                                            if (v1 != null) {
                                                var4_16 = new w(4196, (byte[])var4_16);
                                                v2.a = true;
                                                com.yinhan.kjava.main.a.i.a((w)var4_16);
                                                var3_9.aZ = false;
                                                var3_9.a((String)null);
                                            } else {
                                                var3_9.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
                                            }
                                        } else if (t.w) {
                                            var2_6.a(var2_6.ar.g());
                                        } else if (!bt.hw) {
                                            var2_6.a(var2_6.ar.g());
                                        }
                                    }
                                } else if (var2_6.a == 0x20000000) {
                                    var2_6.c();
                                }
                            }
                            var2_6.a = 0;
                            break;
                        }
                        case 5: {
                            var1_1.B();
                            break;
                        }
                        case 6: {
                            var2_6 = var1_1;
                            if (var2_6.aq != null) {
                                var2_6.aq.b(var2_6.a);
                            }
                            if (var2_6.a == 1 || var2_6.a == 514) {
                                var2_6.bH = var2_6.bH - 1 < 0 ? 2 : var2_6.bH - 1;
                            } else if (var2_6.a == 4 || var2_6.a == 520) {
                                var2_6.bH = var2_6.bH + 1 > 2 ? 0 : var2_6.bH + 1;
                            } else if (var2_6.a == 8 || var2_6.a == 516) {
                                if (var2_6.bH == 0) {
                                    var2_6.bE = (byte)(var2_6.bE - 1 < 0 ? 2 : var2_6.bE - 1);
                                    var2_6.at.b(t.H[var2_6.bE], t.i, (byte)1);
                                    var2_6.at.a((byte)1);
                                } else if (var2_6.bH == 1) {
                                    var2_6.bF = (byte)(var2_6.bF - 1 < 0);
                                } else {
                                    var2_6.bG = var2_6.bG - 1 < 0 ? 1 : 0;
                                }
                            } else if (var2_6.a == 2 || var2_6.a == 518) {
                                if (var2_6.bH == 0) {
                                    var2_6.bE = (byte)(var2_6.bE + 1 > 2 ? 0 : var2_6.bE + 1);
                                    var2_6.at.b(t.H[var2_6.bE], t.i, (byte)1);
                                    var2_6.at.a((byte)1);
                                } else if (var2_6.bH == 1) {
                                    var2_6.bF = (byte)(var2_6.bF + 1 <= 1);
                                } else {
                                    var2_6.bG = var2_6.bG + 1 > 1 ? 0 : 1;
                                }
                            } else if (var2_6.a == 0x10000000) {
                                var4_19 = false;
                                var5_23 = var2_6.ay;
                                var4_16 = var2_6;
                                var3_10 = null;
                                var3_10 = bz.a((short)4099, var5_23, var4_16.bF, var4_16.bE);
                                if (var3_10 != null) {
                                    com.yinhan.kjava.main.a.i.a(new w(4099, var3_10));
                                    var4_16.a((String)null);
                                } else {
                                    var4_16.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
                                }
                            } else if (var2_6.a == 0x20000000) {
                                if (bt.W != null) {
                                    var2_6.b(bt.W.length);
                                    break;
                                }
                                var4_16 = var2_6;
                                var5_24 = bz.a((short)4098, bt.d, bt.b);
                                if (var5_24 != null) {
                                    com.yinhan.kjava.main.a.i.a(new w(4098, var5_24));
                                    var4_16.a((String)null);
                                } else {
                                    var4_16.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
                                }
                            } else if ((var2_6.a == 0x40000000 || var2_6.a == 517) && var2_6.bH == 2) {
                                if (var2_6.bG == 0) {
                                    var2_6.b(null, null);
                                } else {
                                    var3_11 = bz.a((short)4372, var2_6.bF);
                                    if (var3_11 != null) {
                                        com.yinhan.kjava.main.a.i.a(new w(4372, var3_11));
                                        var2_6.a((String)null);
                                    } else {
                                        var2_6.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
                                    }
                                }
                            }
                            if (var2_6.bx != null && var2_6.bF * 3 + var2_6.bE < var2_6.bx.length) {
                                ai.a(var2_6.bx[var2_6.bF * 3 + var2_6.bE], var2_6.ak);
                            }
                            var2_6.a = 0;
                            break;
                        }
                        case 7: {
                            var1_1.E();
                            break;
                        }
                        case 9: {
                            var2_6 = var1_1;
                            if (var2_6.al < 520L) break;
                            var2_6.al = 0L;
                            var3_12 = var2_6;
                            var2_6.be = null;
                            var3_12 = var2_6;
                            ca.a();
                            var3_12.j = 0;
                            var3_12.k = 0;
                            var4_16 = var3_12;
                            new b((a)var4_16, com.yinhan.kjava.main.a.bK);
                            break;
                        }
                        case 14: {
                            var2_6 = var1_1;
                            if (var2_6.c != 0) ** GOTO lbl327
                            if (var2_6.a != 1 && var2_6.a != 50 && var2_6.a != 8 && var2_6.a != 516) ** GOTO lbl276
                            if (var2_6.bs > 0) {
                                v3 = var2_6.bs - 1;
                                var2_6.bs = var2_6.bs;
                            } else {
                                v3 = var2_6.bo.length - 1;
                            }
                            var2_6.bs = v3;
                            ** GOTO lbl335
lbl276:
                            // 1 sources

                            if (var2_6.a != 4 && var2_6.a != 520 && var2_6.a != 2 && var2_6.a != 518) ** GOTO lbl284
                            if (var2_6.bs < var2_6.bo.length - 1) {
                                v4 = var2_6.bs + 1;
                                var2_6.bs = var2_6.bs;
                            } else {
                                v4 = 0;
                            }
                            var2_6.bs = v4;
                            ** GOTO lbl335
lbl284:
                            // 1 sources

                            if (var2_6.a != 0x10000000 && var2_6.a != 0x40000000 && var2_6.a != 517) ** GOTO lbl321
                            if (t.a != 0) ** GOTO lbl308
                            switch (var2_6.bs) {
                                case 0: {
                                    var3_13 = var2_6;
                                    if (t.a == 0) {
                                        var4_16 = null;
                                        var3_13.a("socket://120.78.151.213:20008", "http://117.135.138.130:7099");
                                        var5_20 = (int)Runtime.getRuntime().totalMemory();
                                        v5 = bz.a((short)5383, (byte)0, null, null, false, t.v, t.F, var5_20, "");
                                        var4_16 = v5;
                                        if (v5 != null) {
                                            com.yinhan.kjava.main.a.i.a(new w(5383, (byte[])var4_16));
                                            var3_13.aZ = false;
                                            var3_13.a("\u670d\u52a1\u5668\u5217\u8868");
                                            break;
                                        }
                                        var3_13.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
                                        break;
                                    }
                                    ** GOTO lbl335
                                }
                                case 1: {
                                    break;
                                }
                                case 2: {
                                    var2_6.G();
                                }
                            }
                            ** GOTO lbl335
lbl308:
                            // 1 sources

                            switch (var2_6.bs) {
                                case 0: {
                                    if (t.x) {
                                        var2_6.v();
                                        break;
                                    }
                                    com.yinhan.kjava.main.c.c();
                                    break;
                                }
                                case 1: {
                                    com.yinhan.kjava.main.c.e();
                                    break;
                                }
                                case 2: {
                                    com.yinhan.kjava.main.c.f();
                                }
                            }
                            ** GOTO lbl335
lbl321:
                            // 1 sources

                            if (var2_6.a == 0x20000000 && t.a == 1) {
                                var3_14 = var2_6;
                                ca.h = 0;
                                var3_14.j = (short)16;
                                var3_14.k = (short)16;
                            }
                            ** GOTO lbl335
lbl327:
                            // 1 sources

                            if (var2_6.c == 1) {
                                if (var2_6.a == 0x10000000 || var2_6.a == 0x40000000) {
                                    var2_6.c = 0;
                                    t.w = false;
                                    com.yinhan.kjava.main.a.ai.d();
                                } else if (var2_6.a == 0x20000000) {
                                    var2_6.c = 0;
                                }
                            }
lbl335:
                            // 12 sources

                            var2_6.a = 0;
                            break;
                        }
                        case 15: {
                            var2_6 = var1_1;
                            if (var2_6.a == 0x10000000) {
                                var2_6.c("http://3g.01234.com.cn/game/gameAction.do?m=gameIndex&sId=");
                                var2_6.aJ = false;
                            } else if (var2_6.a == 0x20000000) {
                                var2_6.c();
                                var2_6.bs = 1;
                            }
                            var2_6.a = 0;
                            break;
                        }
                        case 16: {
                            var2_6 = var1_1;
                            if (var2_6.a == 0x10000000) {
                                if (t.y || t.B || t.D) {
                                    var2_6.aJ = false;
                                } else {
                                    var3_15 = var2_6;
                                    ca.h = 0;
                                    var3_15.j = (short)17;
                                    var3_15.k = (short)17;
                                }
                            } else if (var2_6.a == 0x20000000) {
                                var2_6.j = (short)14;
                                var2_6.k = (short)14;
                            }
                            var2_6.a = 0;
                            break;
                        }
                        case 17: {
                            var2_6 = var1_1;
                            if (var2_6.a == 0x10000000) {
                                if (t.x) {
                                    var2_6.c("http://zt.d.cn/a091111_netgame_forum_promotion/index.pih?fid=6724&cid=269");
                                } else if (t.z) {
                                    var2_6.c("http://9Game.CN/Url.Aspx?id=219");
                                } else if (t.A) {
                                    var2_6.c("http://g.uc.cn");
                                } else if (t.C) {
                                    var2_6.c("http://haxiang.cn");
                                } else {
                                    var2_6.c("http://3g.01234.com.cn/game/gameAction.do?m=gameIndex&sId=");
                                }
                                var2_6.aJ = false;
                            } else if (var2_6.a == 0x20000000) {
                                var2_6.c = 0;
                                var2_6.G();
                            }
                            var2_6.a = 0;
                            break;
                        }
                        case 20: {
                            var2_6 = var1_1;
                            if (var2_6.a == 8 || var2_6.a == 516) {
                                ca.e = ca.e - ca.d >= 0 ? ca.e - ca.d : 0;
                            } else if (var2_6.a == 2 || var2_6.a == 518) {
                                ca.e = ca.e + ca.d < ao.K.a() ? ca.e + ca.d : ca.e;
                            } else if (var2_6.a == 0x10000000 || var2_6.a == 0x40000000) {
                                var2_6.c(com.yinhan.kjava.main.a.aI);
                            } else if (var2_6.a == 0x20000000) {
                                var2_6.c();
                                var2_6.bs = 0;
                            }
                            var2_6.a = 0;
                        }
                    }
                    if (com.yinhan.kjava.main.a.e != null) {
                        com.yinhan.kjava.main.a.e.d();
                        if (var1_1.j == 7) {
                            com.yinhan.kjava.main.a.e.c();
                        }
                    }
                }
                catch (Exception var1_2) {
                    this.a(var1_2, (byte)1);
                    var1_2.printStackTrace();
                }
            }
            this.repaint();
            this.serviceRepaints();
            var1_3 = 35L - (System.currentTimeMillis() - this.ak);
            try {
                if (var1_3 > 0L) {
                    Thread.sleep(var1_3);
                    continue;
                }
                Thread.sleep(1L);
            }
            catch (Exception v6) {
                var1_4 = v6;
                v6.printStackTrace();
            }
        }
        var1_5 = this;
        if (com.yinhan.kjava.main.a.i != null) {
            com.yinhan.kjava.main.a.i.d();
        }
        com.yinhan.kjava.main.a.e = null;
        var1_5.J();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected final void paint(Graphics graphics) {
        try {
            if (((a)((Object)exception2)).j == 9) {
                graphics.setColor(0);
                graphics.fillRect(0, 0, (int)t.b, (int)t.c);
            }
            graphics.setClip(0, 0, (int)t.b, (int)t.c);
            graphics.setFont(t.i);
            if (((a)((Object)exception2)).p) {
                ca.b(graphics);
                return;
            }
            if (!((a)((Object)exception2)).aJ) return;
            switch (((a)((Object)exception2)).j) {
                case 0: {
                    ca.a(graphics, ((a)((Object)exception2)).bf);
                    return;
                }
                case 1: {
                    if (e != null) {
                        Graphics graphics2 = graphics;
                        e.a(graphics2);
                    } else if (((a)((Object)exception2)).k == 9) {
                        super.b(graphics);
                    } else if (((a)((Object)exception2)).k == 14 || ((a)((Object)exception2)).k == 3) {
                        super.d(graphics);
                    } else if (((a)((Object)exception2)).k == 4) {
                        super.e(graphics);
                    } else if (((a)((Object)exception2)).k == 5) {
                        super.f(graphics);
                    }
                    ca.b(graphics);
                    return;
                }
                case 2: {
                    if (((a)((Object)exception2)).aS != null && ((a)((Object)exception2)).aS.startsWith("\u7cfb\u7edf\u5f02\u5e38")) {
                        super.a(graphics);
                        return;
                    }
                    if (e != null) {
                        Graphics graphics3 = graphics;
                        e.a(graphics3);
                    }
                    super.a(graphics);
                    return;
                }
                case 3: {
                    super.d(graphics);
                    return;
                }
                case 4: {
                    super.e(graphics);
                    return;
                }
                case 5: {
                    super.f(graphics);
                    return;
                }
                case 6: {
                    super.c(graphics);
                    if (((a)((Object)exception2)).aq == null) return;
                    ((a)((Object)exception2)).aq.a(graphics);
                    ca.a(graphics, ((a)((Object)exception2)).aq.a + 5, ((a)((Object)exception2)).aq.b + 32, ((a)((Object)exception2)).aq.c - 11, ((a)((Object)exception2)).aq.a(t.e <= 240 ? ((a)((Object)exception2)).bB * 3 + 6 : 150), 1);
                    ca.b(graphics, ((a)((Object)exception2)).aq.a + 80, ((a)((Object)exception2)).aq.b + 35, ((a)((Object)exception2)).aq.a + 80, ((a)((Object)exception2)).aq.b + 35 + ((a)((Object)exception2)).aq.a(t.e <= 240 ? ((a)((Object)exception2)).bB * 3 + 6 : 150) - 5);
                    graphics.setColor(2176196);
                    int n2 = t.i.stringWidth(t.G[0]);
                    int n3 = ((a)((Object)exception2)).aq.b + 45;
                    int n4 = ((a)((Object)exception2)).aq.a + 5 + 80 + (((a)((Object)exception2)).aq.c - 80 - 13 - n2) / 2;
                    graphics.drawString(t.G[((a)((Object)exception2)).bE], ((a)((Object)exception2)).bE == 2 ? n4 + t.k / 2 : n4, n3, 20);
                    graphics.drawImage(com.yinhan.kjava.main.a.X.a, n4 - 20, n3, 20);
                    super.a(0, n4 - 20, n3, com.yinhan.kjava.main.a.X.b, com.yinhan.kjava.main.a.X.c);
                    graphics.drawImage(com.yinhan.kjava.main.a.Y.a, n4 + n2 + 15, n3, 20);
                    super.a(1, n4 + n2 + 15, n3, com.yinhan.kjava.main.a.Y.b, com.yinhan.kjava.main.a.Y.c);
                    graphics.drawString(((a)((Object)exception2)).bF == 0 ? "\u7537" : "\u5973", ((a)((Object)exception2)).aq.a + 5 + 80 + (((a)((Object)exception2)).aq.c - 80 - 13 - t.k) / 2, n3 + (t.j + 10), 20);
                    graphics.drawImage(com.yinhan.kjava.main.a.X.a, n4 - 20, n3 + (t.j + 10), 20);
                    super.a(2, n4 - 20, n3 + (t.j + 10), com.yinhan.kjava.main.a.X.b, com.yinhan.kjava.main.a.X.c);
                    graphics.drawImage(com.yinhan.kjava.main.a.Y.a, n4 + n2 + 15, n3 + (t.j + 10), 20);
                    super.a(3, n4 + n2 + 15, n3 + (t.j + 10), com.yinhan.kjava.main.a.X.b, com.yinhan.kjava.main.a.X.c);
                    graphics.drawString("\u6635\u79f0\uff1a", ((a)((Object)exception2)).aq.a + 5 + 80 + 5, n3 + (t.j + 10 << 1), 20);
                    ca.c(graphics, ((a)((Object)exception2)).aq.a + 5 + 80 + 5, n3 + (t.j + 10) * 3 - 1, ((a)((Object)exception2)).aq.c - 80 - ((a)((Object)exception2)).bD.getWidth() - 20, t.j, 0);
                    ca.a(graphics, ((a)((Object)exception2)).ay, ((a)((Object)exception2)).aq.a + 5 + 80 + 5 + 2, n3 + (t.j + 10) * 3, 20, 16711639);
                    graphics.drawImage(((a)((Object)exception2)).bD, ((a)((Object)exception2)).aq.a + ((a)((Object)exception2)).aq.c - 8, n3 + (t.j + 10) * 3, 24);
                    super.a(4, ((a)((Object)exception2)).aq.a + 5 + 80 + 5, n3 + (t.j + 10) * 3, ((a)((Object)exception2)).aq.c - 80 - ((a)((Object)exception2)).bD.getWidth() - 20, t.j);
                    super.a(5, ((a)((Object)exception2)).aq.a + ((a)((Object)exception2)).aq.c - 8 - ((a)((Object)exception2)).bD.getWidth(), n3 + (t.j + 10) * 3, ((a)((Object)exception2)).bD.getWidth(), ((a)((Object)exception2)).bD.getHeight());
                    graphics.setColor(0xFF0000);
                    if (((a)((Object)exception2)).bH == 0) {
                        graphics.drawRect(n4, n3, n2, t.j);
                    } else if (((a)((Object)exception2)).bH == 1) {
                        graphics.drawRect(((a)((Object)exception2)).aq.a + 5 + 80 + (((a)((Object)exception2)).aq.c - 80 - 13 - t.k) / 2, n3 + (t.j + 10), t.k, t.j);
                    } else if (((a)((Object)exception2)).bG == 0) {
                        graphics.drawRect(((a)((Object)exception2)).aq.a + 5 + 80 + 5, n3 + (t.j + 10) * 3 - 1, ((a)((Object)exception2)).aq.c - 80 - ((a)((Object)exception2)).bD.getWidth() - 20, t.j);
                    } else {
                        graphics.drawRect(((a)((Object)exception2)).aq.a + ((a)((Object)exception2)).aq.c - 8 - ((a)((Object)exception2)).bD.getWidth(), n3 + (t.j + 10) * 3, ((a)((Object)exception2)).bD.getWidth(), ((a)((Object)exception2)).bD.getHeight());
                    }
                    if (((a)((Object)exception2)).bx == null) return;
                    if (((a)((Object)exception2)).bx[((a)((Object)exception2)).bF * 3 + ((a)((Object)exception2)).bE] == null) return;
                    f.a(graphics, ((a)((Object)exception2)).bx[((a)((Object)exception2)).bF * 3 + ((a)((Object)exception2)).bE], null, 0, 0, ((a)((Object)exception2)).aq.a + 40 + 5, ((a)((Object)exception2)).aq.b + 32 + ((a)((Object)exception2)).bx[((a)((Object)exception2)).bF * 3 + ((a)((Object)exception2)).bE].j() + (((a)((Object)exception2)).aq.a(t.e <= 240 ? (((a)((Object)exception2)).bB << 1) + 6 : 120) - ((a)((Object)exception2)).bx[((a)((Object)exception2)).bF * 3 + ((a)((Object)exception2)).bE].j()) / 2, 20, 0);
                    return;
                }
                case 7: {
                    Graphics graphics4 = graphics;
                    e.a(graphics4);
                    return;
                }
                case 9: {
                    super.b(graphics);
                    return;
                }
                case 14: {
                    super.d(graphics);
                    return;
                }
                case 15: {
                    super.c(graphics);
                    if (t.a == 0) {
                        ca.a(graphics, "\u66f4\u591a\u7cbe\u5f69\u6e38\u620f\u5c3d\u5728\u817e\u8baf\u6e38\u620f\u9891\u9053\t(3g.qq.com)", new String[]{"\u66f4\u591a", "\u9000\u51fa"});
                        break;
                    }
                    if (t.a != 1) {
                        ca.a(graphics, "\u66f4\u591a\u7cbe\u5f69\u6e38\u620f\u5c3d\u5728\u5f53\u4e50\u7f51\t(d.cn)", new String[]{"\u66f4\u591a", "\u8fd4\u56de"});
                        return;
                    }
                    ca.a(graphics, "\u66f4\u591a\u7cbe\u5f69\u6e38\u620f\u5c3d\u5728\u4e00\u54e5\u54e5\u7f51\u6e38\u620f\u9891\u9053\t(3g.01234.com.cn)", new String[]{"\u66f4\u591a", "\u8fd4\u56de"});
                    break;
                }
                case 16: {
                    super.d(graphics);
                    ca.a(graphics, "\u786e\u8ba4\u9000\u51fa\uff1f", new String[]{"\u786e\u8ba4", "\u8fd4\u56de"});
                    return;
                }
                case 17: {
                    super.d(graphics);
                    if (t.x) {
                        ca.a(graphics, "\u662f\u5426\u8fdb\u5165\u5f53\u4e50\u68a6\u56de\u897f\u6e38\u8bba\u575b\t(http://zt.d.cn/a091111_netgame_forum_promotion/index.pih?fid=6724&cid=269)", new String[]{"\u8fdb\u5165", "\u9000\u51fa"});
                        break;
                    }
                    if (t.z) {
                        ca.a(graphics, "\u66f4\u591a\u7cbe\u5f69\u6e38\u620f\u5c3d\u5728\u4e5d\u6e38\u7f51\u6e38\u620f\u9891\u9053\t(http://9Game.CN/Url.Aspx?id=219)", new String[]{"\u66f4\u591a", "\u9000\u51fa"});
                        break;
                    }
                    if (t.A) {
                        ca.a(graphics, "\u66f4\u591a\u7cbe\u5f69\u6e38\u620f\u5c3d\u5728http://g.uc.cn", new String[]{"\u66f4\u591a", "\u9000\u51fa"});
                        break;
                    }
                    if (!t.C) {
                        ca.a(graphics, "\u66f4\u591a\u7cbe\u5f69\u6e38\u620f\u5c3d\u5728\u4e00\u54e5\u54e5\u7f51\u6e38\u620f\u9891\u9053\t(3g.01234.com.cn)", new String[]{"\u66f4\u591a", "\u9000\u51fa"});
                        return;
                    }
                    ca.a(graphics, "\u66f4\u591a\u7cbe\u5f69\u6e38\u620f\u5c3d\u5728http://haxiang.cn", new String[]{"\u66f4\u591a", "\u9000\u51fa"});
                    break;
                }
                case 20: {
                    super.c(graphics);
                    ca.a(graphics, aH, new String[]{"\u4e0b\u8f7d", "\u53d6\u6d88"});
                }
            }
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
        }
    }

    public final void a(Exception exception, byte by2) {
        exception.printStackTrace();
        if (e != null) {
            com.yinhan.kjava.main.a.e.c = false;
            com.yinhan.kjava.main.a.e.Y = -1;
            ao.R();
            if (com.yinhan.kjava.main.a.e.g != null) {
                com.yinhan.kjava.main.a.e.g.l();
            }
            com.yinhan.kjava.main.a.e.k = 0;
            com.yinhan.kjava.main.a.e.j = 0;
            this.k = (short)7;
            this.j = (short)7;
        }
        bt.H = null;
        bt.M = null;
        bt.I = null;
        bt.N = null;
        bt.as = (short)-1;
        this.p = false;
        if (by2 == 1) {
            this.b("\u7cfb\u7edf\u5f02\u5e38<" + by2 + ">");
        }
    }

    public final void b() {
        this.repaint();
        this.serviceRepaints();
    }

    public static void a(byte by2, byte by3, byte by4, byte by5, String string, short s2, short s3, short s4) {
        aN.removeAllElements();
        if (by4 == 5) {
            aN.addElement(com.yinhan.kjava.main.a.a(by2, by3, (byte)1, by5, false, string));
            aN.addElement(com.yinhan.kjava.main.a.a(by2, by3, (byte)3, by5, false, string));
            aN.addElement(com.yinhan.kjava.main.a.a(by2, by3, (byte)3, by5, true, string));
            aN.addElement(com.yinhan.kjava.main.a.a(by2, by3, (byte)0, by5, false, string));
            aN.addElement(com.yinhan.kjava.main.a.a(by2, by3, (byte)0, by5, true, string));
            aN.addElement(com.yinhan.kjava.main.a.a(by2, by3, (byte)2, by5, false, string));
            aN.addElement(com.yinhan.kjava.main.a.a(by2, by3, (byte)2, by5, true, string));
        } else {
            aN.addElement(com.yinhan.kjava.main.a.a(by2, by3, by4, by5, false, string));
        }
        for (by2 = 0; by2 < aN.size(); by2 = (byte)(by2 + 1)) {
            ab.b((String)aN.elementAt(by2), s2, s3, s4);
        }
        aN.removeAllElements();
    }

    public static String a(byte by2, byte by3, byte by4, byte by5, boolean bl2) {
        if (t.m == 2) {
            by5 = 0;
        }
        return "" + t.V[by2] + t.W[by3] + by5 + t.X[by4] + (bl2 ? "4" : "");
    }

    public static String a(byte by2, byte by3, byte by4, byte by5, boolean bl2, String string) {
        if (t.m == 2) {
            by5 = 0;
        }
        if (t.p) {
            aO.delete(0, aO.length());
            aO.append("");
            aO.append(string);
            aO.append(t.V[by2]);
            aO.append(t.W[by3]);
            aO.append(by5);
            aO.append(t.X[by4]);
            aO.append(bl2 ? "4" : "");
            return aO.toString();
        }
        return "" + t.V[by2] + t.W[by3] + by5 + t.X[by4] + (bl2 ? "4" : "");
    }

    public final void a(String string) {
        int n2 = t.b * 6 / 11;
        if (n2 < 110) {
            n2 = 110;
        } else if (n2 > 160) {
            n2 = 160;
        }
        ca.a((t.b - n2) / 2, t.c / 2 + 15, n2, 20, string);
        this.aP = this.ak;
        this.j = 1;
    }

    public final void b(String object) {
        if (this.aS != null && this.aS.startsWith("\u7cfb\u7edf\u5f02\u5e38")) {
            this.t();
        }
        if (object != null && ((String)object).startsWith("\u7cfb\u7edf\u5f02\u5e38")) {
            this.aS = object;
        }
        if (bt.bs == 1 && bt.s == 0 && bt.eC != null && bt.eC.startsWith("\u961f\u4f0d\u6210\u5458\u4f4d\u7f6e\u4fe1\u606f\u4e0d\u4e00\u81f4")) {
            e.S();
            bt.eC = null;
            this.i();
            return;
        }
        bt.eC = object;
        this.aT = new bw(bt.eC, (short)(t.b - 20));
        if (e == null || com.yinhan.kjava.main.a.e.k != 25) {
            this.setFullScreenMode(true);
            this.d.b.setCurrent((Displayable)this);
        }
        this.aQ = this.ak;
        this.aR = true;
        object = this;
        if (((a)object).aT != null) {
            ((a)object).aX = 0;
            ((a)object).aX = ((a)object).aT.a;
            ((a)object).aX = ((a)object).aX + 20 > t.b ? t.b : ((a)object).aX + 20;
            if (((a)object).aX < t.b * 5 / 7) {
                ((a)object).aX = t.b * 5 / 7;
            }
            ((a)object).aV = (t.b - ((a)object).aX) / 2;
            ((a)object).aY = ((a)object).aT.a() * t.j + 14;
            ((a)object).aW = (t.c - ((a)object).aY) / 2;
        }
        this.j = (short)2;
        if (t.o && this.aj != null) {
            this.aj.e = -1;
            this.aj.f = -1;
        }
    }

    public final void a(boolean bl2) {
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

    public final int a(int n2, int n3) {
        if (n2 < this.aV || n2 > this.aV + this.aX || n3 < this.aW || n3 > this.aW + this.aY) {
            return 0x20000000;
        }
        return 0;
    }

    private void a(Graphics graphics) {
        if (!com.yinhan.kjava.main.a.u()) {
            ca.a(graphics, this.aV, this.aW, this.aX, this.aY);
            if (this.aT != null) {
                this.aT.a(graphics, t.b / 2, this.aW + 7);
            }
        }
    }

    private static boolean u() {
        return bt.eC != null && bt.eC.equals("\u6570\u636e\u66f4\u65b0\u5931\u8d25:");
    }

    public static void a(String string, byte by2) {
        av.i = by2;
        if (av.i == 2) {
            av.b = string;
            return;
        }
        av.a = string;
    }

    private void b(String object, byte by2) {
        com.yinhan.kjava.main.a.a((String)(object == null ? (by2 == 2 ? "socket://120.78.151.213:20008" : "http://117.135.138.130:7099") : object), by2);
        if (t.w) {
            this.v();
        } else {
            object = this;
            this.aD = new Form("\u767b\u9646\u6e38\u620f");
            ((a)object).bP = new Command("\u767b\u9646", 4, 1);
            ((a)object).bQ = new Command("\u8fd4\u56de", 2, 1);
            ((a)object).bN = new TextField("\u5e10\u53f7:", bt.b, 20, 0);
            ((a)object).bO = new TextField("\u5bc6\u7801:", bt.c, 20, 65536);
            ((a)object).aD.addCommand(((a)object).bP);
            ((a)object).aD.addCommand(((a)object).bQ);
            ((a)object).aD.append((Item)((a)object).bN);
            ((a)object).aD.append((Item)((a)object).bO);
            ((a)object).aD.setCommandListener((CommandListener)object);
            ((a)object).q.setCurrent((Displayable)((a)object).aD);
        }
        this.j = (short)3;
        this.k = (short)3;
    }

    private void v() {
        a a2 = this;
        t.w = false;
        if (com.yinhan.kjava.main.a.j("dcn_user_info.db")) {
            try {
                RecordStore recordStore = com.yinhan.kjava.main.a.a("dcn_user_info.db", false);
                DataInputStream dataInputStream = com.yinhan.kjava.main.a.a(recordStore);
                if (dataInputStream != null) {
                    t.w = dataInputStream.readBoolean();
                    a2.ba = dataInputStream.readByte();
                    bb.k = dataInputStream.readBoolean();
                    bt.b = dataInputStream.readUTF();
                    bt.c = dataInputStream.readUTF();
                    dataInputStream.close();
                }
                if (recordStore != null) {
                    recordStore.closeRecordStore();
                }
            }
            catch (RecordStoreException recordStoreException) {
                RecordStoreException recordStoreException2 = recordStoreException;
                recordStoreException.printStackTrace();
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        this.aD = new Form(t.w ? "\u767b\u5f55\u5f53\u4e50\u901a\u884c\u8bc1" : "\u767b\u5f55\u4e00\u54e5\u54e5\u901a\u884c\u8bc1");
        this.bb = new ChoiceGroup(null, 1);
        this.bb.append("\u5b98\u65b9\u5e10\u53f7\u767b\u5f55", null);
        this.bb.append("\u5f53\u4e50\u5e10\u53f7\u767b\u5f55", null);
        this.bc = com.yinhan.kjava.main.a.e(t.w ? 1 : 0);
        this.bd = new ChoiceGroup(null, 2, new String[]{"\u8bb0\u4f4f\u5bc6\u7801"}, null);
        this.bN = new TextField("\u5e10  \u53f7:", null, 16, 0);
        this.bO = new TextField("\u5bc6  \u7801:", null, 16, 65536);
        if (bb.k) {
            this.bb.setSelectedIndex(t.w ? 1 : 0, true);
            this.bc.setSelectedIndex(this.ba, true);
            this.bd.setSelectedIndex(0, true);
            this.bN.setString(bt.b);
            this.bO.setString(bt.c);
        }
        this.aD.setItemStateListener((ItemStateListener)new d(this));
        this.aD.append((Item)this.bb);
        this.aD.append((Item)this.bc);
        this.aD.append((Item)this.bN);
        this.aD.append((Item)this.bO);
        this.aD.append((Item)this.bd);
        this.aD.append("\u6e29\u99a8\u63d0\u793a\uff1a\u5982\u679c\u6709\u5f53\u4e50\u5e10\u53f7\u7684\u7528\u6237\u53ef\u4ee5\u5728\u5e10\u53f7\u9009\u62e9\u4f7f\u7528\u5f53\u4e50\u5e10\u53f7\u8fdb\u884c\u767b\u5f55\u6e38\u620f\uff01");
        this.bP = new Command("\u767b\u9646", 4, 1);
        this.bQ = new Command("\u8fd4\u56de", 2, 1);
        this.aD.addCommand(this.bP);
        this.aD.addCommand(this.bQ);
        this.aD.setCommandListener((CommandListener)this);
        this.q.setCurrent((Displayable)this.aD);
    }

    private static ChoiceGroup e(int n2) {
        String[] stringArray = null;
        stringArray = n2 == 1 ? new String[]{"\u4e50\u4e50\u53f7", "\u7528\u6237\u540d"} : new String[]{"\u7528\u6237\u540d", "\u624b\u673a\u53f7", "ID"};
        return new ChoiceGroup("\u65b9\u5f0f", 4, stringArray, null);
    }

    private void w() {
        int n2;
        if (bv) {
            return;
        }
        this.x();
        a a2 = this;
        this.bj = com.yinhan.kjava.main.a.k("/images/light_0.png");
        a2.bk = com.yinhan.kjava.main.a.k("/images/light_1.png");
        int n3 = t.b / 9;
        a2.bq = new int[8];
        for (n2 = 0; n2 < a2.bq.length; ++n2) {
            a2.bq[n2] = n3 * (n2 + 1);
        }
        a2.bp = new int[8][5];
        for (n2 = 0; n2 < a2.bp.length; ++n2) {
            for (n3 = 0; n3 < a2.bp[n2].length; ++n3) {
                a2.bp[n2] = a2.z();
            }
        }
        if (bl == null) {
            bl = new bu("/", "cartoon");
            bl.d();
            if (bl.b() != 0) {
                bm = bl.b("hudie");
                bn = bl.b("hudie_2");
            }
        }
        this.bh = com.yinhan.kjava.main.a.k("/images/" + (t.c <= 220 ? "logoTitle_M.png" : "logoTitle_B.png"));
        this.bg = com.yinhan.kjava.main.a.k("/images/menuBG.png");
        this.bi = com.yinhan.kjava.main.a.k("/images/menuItem.png");
        bv = true;
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
        a a2 = this;
        a2.be = "mhxy060".equals(t.v) ? com.yinhan.kjava.main.a.k("/jy_logo.png") : com.yinhan.kjava.main.a.k("/logo.png");
        a2.bf = com.yinhan.kjava.main.a.k("/images/loading.png");
        this.al = 0L;
        this.j = (short)9;
        this.k = (short)9;
        this.b();
    }

    private void b(Graphics graphics) {
        if (this.al < 260L) {
            this.al = 260L;
        }
        if (this.al >= 260L) {
            graphics.setColor(0);
            graphics.fillRect(0, 0, (int)t.b, (int)t.c);
            graphics.drawImage(this.be, t.b - this.be.getWidth() >> 1, t.c - this.be.getHeight() >> 1, 20);
            this.bu = (int)(515L - this.al > 0L ? 515L - this.al : 0L);
            ca.a(graphics, 0, this.bu, t.b - this.be.getWidth() >> 1, t.c - this.be.getHeight() >> 1, this.be.getWidth(), this.be.getHeight());
            this.al += 5L;
        }
    }

    public final void c() {
        bz.a = (byte)90;
        this.w();
        if (t.a == 0) {
            this.bo = new String[]{"\u8fdb\u5165\u6e38\u620f", "\u66f4\u591a\u6e38\u620f", "\u9000\u51fa\u6e38\u620f"};
        } else if (t.a == 1) {
            this.bo = new String[]{"\u767b\u9646\u6e38\u620f", "\u6ce8\u518c\u6e38\u620f", "\u4fee\u6539\u5bc6\u7801"};
        }
        this.c = 0;
        this.bu = 0;
        ca.l = 0;
        ca.h = 0;
        if (t.a != 0) {
            if (am == null && bb.m != null) {
                am = bb.m;
                an = bb.n;
                ao = bb.l;
                ap = bb.k;
            }
            if (am == null) {
                am = "";
                if ("mhxy011".equals(t.v) || "mhxy278".equals(t.v)) {
                    this.c = 1;
                }
            }
            if (an == null) {
                an = "";
            }
            if (bz.b != 72) {
                com.yinhan.kjava.main.a.s();
                i = null;
            }
        } else if (bz.c != 162) {
            bz.c = 162;
            com.yinhan.kjava.main.a.s();
        }
        bt.O();
        this.A();
        this.al = 8L;
        this.bs = 0;
        this.j = (short)14;
        this.k = (short)14;
    }

    private void c(Graphics graphics) {
        int n2 = this.bt = t.c <= 240 ? 2 : (t.c - this.bh.getHeight() - this.bi.getHeight() * 7) / 3;
        if (this.bg != null) {
            graphics.drawImage(this.bg, t.b - this.bg.getWidth() >> 1, t.c - this.bg.getHeight() >> 1, 20);
        }
        if (this.bh != null) {
            graphics.drawImage(this.bh, t.b - this.bh.getWidth() >> 1, this.bt, 20);
        }
        if (bm != null) {
            ai.a(bm, this.ak);
            f.a(graphics, bm, null, 0, 0, t.b - 100, t.c - 100, 0, 0);
        }
        if (bn != null) {
            ai.a(bn, this.ak);
            f.a(graphics, bn, null, 0, 0, t.b - 100, t.c - 100, 0, 0);
        }
        if (this.bj == null || this.bk == null || this.bp == null) {
            return;
        }
        for (int i2 = 0; i2 < this.bp.length; ++i2) {
            for (int i3 = 0; i3 < this.bp[i2].length; ++i3) {
                if (this.bp[i2][0] < 0 || this.bp[i2][0] > t.b || this.bp[i2][1] < 0) {
                    this.bp[i2] = this.z();
                } else if ((this.br & 1) == 0) {
                    this.bp[i2][0] = this.bp[i2][0] + (ca.f(10, 40) % 2 == 0 ? -this.bp[i2][2] : this.bp[i2][2]);
                    this.bp[i2][1] = this.bp[i2][1] - this.bp[i2][3];
                }
                graphics.drawImage(this.bp[i2][4] == 0 ? this.bj : this.bk, this.bp[i2][0], this.bp[i2][1], 20);
            }
        }
        ++this.br;
    }

    private int[] z() {
        int[] nArray = new int[5];
        int[] nArray2 = nArray;
        nArray[0] = this.bq[ca.f(1, 100) % 8];
        nArray2[1] = t.c + ca.f(1, 200);
        nArray2[2] = 1;
        nArray2[3] = 1;
        nArray2[4] = ca.f(1, 100) % 2;
        return nArray2;
    }

    private void d(Graphics graphics) {
        this.c(graphics);
        ca.a(graphics, t.t, 5, t.c - 3, 36, 6160358, 335925);
        if (t.a == 1) {
            ca.a(graphics, "\u9000\u51fa", t.b - 5, t.c - 3, 40, 0xFFFFFF, 335925);
        }
        for (int i2 = 0; i2 < this.bo.length; ++i2) {
            if (i2 == this.bs) {
                graphics.drawImage(this.bi, t.b - this.bi.getWidth() >> 1, (this.bt << 1) + this.bh.getHeight() + i2 * this.bi.getHeight(), 20);
            }
            ca.a(graphics, this.bo[i2], t.b >> 1, (this.bt << 1) + this.bh.getHeight() + i2 * this.bi.getHeight() + (this.bi.getHeight() - t.j) / 2, 17, 0xFFFFFF, 335925);
        }
        if (this.c == 1) {
            ca.a(graphics, "\u5f53\u524d\u6ca1\u6709\u8d26\u53f7\u4fe1\u606f\uff0c\u662f\u5426\u81ea\u52a8\u6ce8\u518c\uff1f", new String[]{"\u786e\u5b9a", "\u8fd4\u56de"});
        }
    }

    public final void c(String string) {
        try {
            ((a)((Object)connectionNotFoundException2)).d.platformRequest(string);
            ((a)((Object)connectionNotFoundException2)).G();
            return;
        }
        catch (ConnectionNotFoundException connectionNotFoundException) {
            ConnectionNotFoundException connectionNotFoundException2 = connectionNotFoundException;
            connectionNotFoundException.printStackTrace();
            return;
        }
    }

    public final void d() {
        int n2;
        Object object = this;
        if (((a)object).aD != null) {
            ((a)object).aD.removeCommand(((a)object).bP);
            ((a)object).aD.removeCommand(((a)object).bQ);
            ((a)object).aD.deleteAll();
        }
        ((a)object).bP = null;
        ((a)object).bQ = null;
        ((a)object).bN = null;
        ((a)object).bO = null;
        ((a)object).aD = null;
        this.d.a();
        object = this;
        if (bt.hE != null) {
            ((a)object).K();
            for (n2 = 0; n2 < bt.hE.length; ++n2) {
                if (bt.hE[n2] != ((a)object).ce || n2 == 0) continue;
                String string = bt.hA[n2];
                String string2 = bt.hB[n2];
                String string3 = bt.hC[n2];
                short s2 = bt.hE[n2];
                String string4 = bt.hF[n2];
                for (int i2 = n2; i2 > 0; --i2) {
                    bt.hA[i2] = bt.hA[i2 - 1];
                    bt.hB[i2] = bt.hB[i2 - 1];
                    bt.hC[i2] = bt.hC[i2 - 1];
                    bt.hE[i2] = bt.hE[i2 - 1];
                    bt.hF[i2] = bt.hF[i2 - 1];
                }
                bt.hA[0] = string;
                bt.hB[0] = string2;
                bt.hC[0] = string3;
                bt.hE[0] = s2;
                bt.hF[0] = string4;
            }
        }
        this.aq.b();
        this.aq.a("\u670d\u52a1\u5668\u5217\u8868");
        object = null;
        if (t.a == 1 && bt.hx >= 0 && bt.hx < bt.hA.length) {
            object = new int[bt.hA.length];
            for (n2 = 0; n2 < ((Object)object).length; ++n2) {
                object[n2] = n2 == bt.hx ? (Object)ca.a(0) : (Object)ca.a(6);
            }
        }
        this.ar.a(null, bt.hA, null, bt.hF);
        this.ar.a((int[])object);
        this.aq.a(this.ar);
        this.au.a(new String[]{"\u8fdb\u5165\u9009\u533a", ""});
        this.aq.a(this.au);
        this.aq.a(t.f, t.g, t.d, t.e);
        this.j = (short)4;
        this.k = (short)4;
        this.c = 0;
        this.a = 0;
        this.b = 0;
    }

    public final void a(int n2) {
        com.yinhan.kjava.main.a.s();
        String string = null;
        if (av.h == 1) {
            if (bt.hB[n2].equals("")) {
                this.b(bt.hA[n2] + "\u7e41\u5fd9,\u8bf7\u9009\u62e9\u5176\u4ed6\u670d!");
            } else {
                string = bt.hB[n2];
                com.yinhan.kjava.main.a.a("http://117.135.138.130:7099", (byte)1);
                bz.a = (byte)bt.hD[n2];
                bz.b = (byte)bt.hE[n2];
                this.a(bt.hE[n2]);
            }
        } else if (bt.hC[n2].equals("")) {
            this.b(bt.hA[n2] + "\u7e41\u5fd9,\u8bf7\u9009\u62e9\u5176\u4ed6\u670d!");
        } else {
            string = bt.hC[n2];
            com.yinhan.kjava.main.a.a(string, (byte)2);
            bz.a = (byte)bt.hD[n2];
            bz.b = (byte)bt.hE[n2];
            this.a(bt.hE[n2]);
        }
        this.a(string, "http://117.135.138.130:7099");
        Object object = bz.a((short)4096, bt.hy, bt.hz, t.v, bt.hw);
        if (object != null) {
            object = new w(4096, (byte[])object);
            v0.a = true;
            i.a((w)object);
            this.aZ = false;
            this.a((String)null);
            return;
        }
        this.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
    }

    private void e(Graphics graphics) {
        if (t.a == 1 && !t.w && bt.hw) {
            return;
        }
        this.c(graphics);
        if (this.aq != null) {
            this.aq.a(graphics);
        }
        if (this.c == 2) {
            this.a(graphics);
        }
    }

    public final void e() {
        if (bt.m != null && bt.m.length() > 0) {
            this.h(bt.m);
            return;
        }
        if (bt.W != null) {
            this.h(bt.W[(this.bA << 1) + this.bz]);
        }
    }

    public final void f() {
        if (bt.m != null && bt.m.length() > 0) {
            this.i(bt.m);
            return;
        }
        if (e == null && bt.W != null) {
            this.i(bt.W[(this.bA << 1) + this.bz]);
        }
    }

    private void A() {
        if (e != null) {
            e.b();
            e = null;
            if (t.o && ((a)((Object)f2)).aj != null) {
                Object var1_1 = null;
                f f2 = ((a)((Object)f2)).aj;
                ((a)((Object)f2)).aj.a = var1_1;
            }
        }
    }

    public final bc a(bc bc2, byte by2, byte by3, byte by4, byte by5, boolean bl2) {
        byte by6 = by2;
        byte by7 = by3;
        by4 = (byte)(bl2 ? 1 : 0);
        by3 = by5;
        by2 = (byte)3;
        byte by8 = by7;
        byte by9 = by6;
        t.ag.delete(0, t.ag.length());
        t.ag.append("f").append(t.V[by9]).append(t.W[by8]).append(by3).append(t.X[by2]).append(by4 != 0 ? 1 : 2);
        String string = t.ag.toString();
        ab.d(string);
        bc bc3 = ab.b(string);
        if (bc3 != null) {
            bc3 = bc3.b();
        }
        return bc3;
    }

    public final void b(int n2) {
        this.w();
        this.bC = new int[6][4];
        ca.l = 0;
        ca.h = 0;
        ca.o = 0;
        this.c = 0;
        this.a = 0;
        this.b = 0;
        bt.O();
        this.A();
        if (n2 <= 0 && this.k != 6) {
            this.bx = null;
            this.by = null;
            this.bB = 45;
            this.C();
            return;
        }
        this.bx = new bc[n2];
        this.by = new bc[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            this.bx[i2] = this.a(this.bx[i2], bt.Z[i2], bt.Y[i2], (byte)3, (byte)1, false);
            this.by[i2] = this.a(this.by[i2], bt.Z[i2], bt.Y[i2], (byte)3, (byte)1, true);
        }
        this.bB = 55;
        this.bz = 0;
        this.bA = 0;
        this.aq.b();
        this.aq.a("\u89d2\u8272\u5217\u8868");
        this.aq.a((this.bB << 1) + 6);
        this.at.b(this.f(0), t.i, (byte)1);
        this.at.a((byte)1);
        this.aq.a(this.at);
        if (t.c > 220) {
            this.au.a(new String[]{"\u8fdb\u5165\u6e38\u620f", ""});
            this.aq.a(this.au);
        }
        this.aq.a(t.f, t.g, t.d, t.e);
        this.w();
        this.j = (short)5;
        this.k = (short)5;
    }

    private String f(int n2) {
        if (bt.aa != null && n2 < bt.aa.length) {
            t.a(this.l);
            this.l.append("\u6635\u79f0\uff1a" + bt.aa[n2] + '\t');
            if (t.a == 0) {
                this.l.append("ID\uff1a" + bt.W[n2] + '\t');
            }
            this.l.append("\u7b49\u7ea7\uff1a" + bt.X[n2] + '\t');
            this.au.a(new String[]{"\u8fdb\u5165\u6e38\u620f", ""});
            return this.l.toString();
        }
        this.au.a(new String[]{"\u521b \u5efa", ""});
        return "\u521b\u5efa\u89d2\u8272";
    }

    private void B() {
        if (this.c == 0) {
            if (this.aq != null) {
                this.aq.b(this.a);
            }
            if (this.a == 1 || this.a == 514) {
                this.bA = (byte)(this.bA <= 0 ? 1 : this.bA - 1);
                this.at.b(this.f((this.bA << 1) + this.bz), t.i, (byte)1);
            } else if (this.a == 4 || this.a == 520) {
                this.bA = (byte)(this.bA >= 1 ? 0 : this.bA + 1);
                this.at.b(this.f((this.bA << 1) + this.bz), t.i, (byte)1);
            } else if (this.a == 8 || this.a == 516) {
                this.bz = (byte)(this.bz <= 0 ? 1 : this.bz - 1);
                this.at.b(this.f((this.bA << 1) + this.bz), t.i, (byte)1);
            } else if (this.a == 2 || this.a == 518) {
                this.bz = (byte)(this.bz >= 1 ? 0 : this.bz + 1);
                this.at.b(this.f((this.bA << 1) + this.bz), t.i, (byte)1);
            } else if (this.a == 0x10000000) {
                if (bt.W != null && (this.bA << 1) + this.bz < bt.W.length) {
                    this.g(bt.W[(this.bA << 1) + this.bz]);
                } else {
                    this.C();
                }
            } else if (this.a == 0x40000000 || this.a == 517) {
                if (bt.W != null && (this.bA << 1) + this.bz < bt.W.length) {
                    if (bt.W.length >= 4) {
                        String[] stringArray = new String[]{"\u8fdb\u5165", "\u5220\u9664"};
                        ca.a(this.bC[(this.bA << 1) + this.bz][0] + this.bB / 2, this.bC[(this.bA << 1) + this.bz][1] + this.bB / 2, stringArray, false);
                        this.c = 1;
                    } else {
                        this.g(bt.W[(this.bA << 1) + this.bz]);
                    }
                } else {
                    this.C();
                }
            } else if (this.a == 0x20000000) {
                this.c();
            }
            if (this.bx != null) {
                for (int i2 = 0; i2 < this.bx.length; ++i2) {
                    ai.a(this.bx[i2], this.ak);
                }
            }
            if (this.by != null) {
                for (int i3 = 0; i3 < this.by.length; ++i3) {
                    ai.a(this.by[i3], this.ak);
                }
            }
            this.a = 0;
            return;
        }
        if (this.c == 1) {
            ca.b(this.a);
            if (this.a == 0x10000000 || this.a == 0x40000000 || this.a == 517) {
                if (ca.o == 0) {
                    this.g(bt.W[(this.bA << 1) + this.bz]);
                } else if (ca.o == 1) {
                    this.aw = (this.bA << 1) + this.bz;
                    this.c = (short)2;
                }
            } else if (this.a == 0x20000000) {
                this.b(bt.W.length);
                this.c = 0;
            }
            this.a = 0;
            return;
        }
        if (this.c == 2) {
            if (this.a == 0x10000000) {
                this.a("\u8f93\u5165\u201cOK\u201d \u5220\u9664\u89d2\u8272", 0);
                this.c = 0;
            } else if (this.a == 0x20000000) {
                this.c = 1;
            }
            this.a = 0;
        }
    }

    private void a(int n2, int n3, int n4, int n5, int n6) {
        if (this.bC != null && this.bC.length > n2) {
            this.bC[n2][0] = n3;
            this.bC[n2][1] = n4;
            this.bC[n2][2] = n5;
            this.bC[n2][3] = n6;
        }
    }

    private void f(Graphics graphics) {
        this.c(graphics);
        if (this.aq != null) {
            int n2;
            this.aq.a(graphics);
            ca.a(graphics, this.aq.a + 5, this.aq.b + 32, this.aq.c - 11, this.aq.a((this.bB << 1) + 6), 1);
            int n3 = (this.aq.c - (this.bB << 1) - 16) / 3;
            int n4 = (this.aq.a(t.e <= 240 ? (this.bB << 1) + 6 : 111) - (this.bB << 1) - 6) / 3;
            for (n2 = 0; n2 < 2; ++n2) {
                for (byte by2 = 0; by2 < 2; ++by2) {
                    this.a((n2 << 1) + by2, this.aq.a + 8 + n3 + (n3 + this.bB) * by2, this.aq.b + 35 + n4 + (n4 + this.bB) * n2, this.bB, this.bB);
                    ca.a(graphics, null, this.bC[(n2 << 1) + by2][0], this.bC[(n2 << 1) + by2][1], this.bB, this.bB, n2 == this.bA && by2 == this.bz);
                }
            }
            if (this.bx != null && bt.aa != null && bt.aa.length > 0) {
                for (n2 = 0; n2 < bt.aa.length; ++n2) {
                    if (this.bx[n2] != null && n2 == (this.bA << 1) + this.bz) {
                        if (bt.Z[n2] == 0) {
                            if (bt.Y[n2] == 0) {
                                f.a(graphics, this.bx[n2], null, 0, 0, this.bC[n2][0] + 40 + 6, this.bC[n2][1] + 45 + 1, 20, 0);
                                continue;
                            }
                            f.a(graphics, this.bx[n2], null, 0, 0, this.bC[n2][0] + 40 + 9, this.bC[n2][1] + 45 + 16, 20, 0);
                            continue;
                        }
                        if (bt.Z[n2] == 1) {
                            if (bt.Y[n2] == 0) {
                                f.a(graphics, this.bx[n2], null, 0, 0, this.bC[n2][0] + 40 + 8, this.bC[n2][1] + 45 + 14, 20, 0);
                                continue;
                            }
                            f.a(graphics, this.bx[n2], null, 0, 0, this.bC[n2][0] + 40 - 1, this.bC[n2][1] + 45 + 9, 20, 0);
                            continue;
                        }
                        if (bt.Y[n2] == 0) {
                            f.a(graphics, this.bx[n2], null, 0, 0, this.bC[n2][0] + 40 - 9, this.bC[n2][1] + 45 + 10, 20, 0);
                            continue;
                        }
                        f.a(graphics, this.bx[n2], null, 0, 0, this.bC[n2][0] + 40 - 3, this.bC[n2][1] + 45 + 12, 20, 0);
                        continue;
                    }
                    if (this.by == null || n2 == (this.bA << 1) + this.bz) continue;
                    f.a(graphics, this.by[n2], null, 0, 0, this.bC[n2][0] + 40 - 18, this.bC[n2][1] + 45, 20, 0);
                }
            }
        }
        if (this.c == 1) {
            ca.c(graphics);
            return;
        }
        if (this.c == 2) {
            ca.a(graphics, "\u786e\u8ba4\u5220\u9664\uff1f", new String[]{"\u786e\u8ba4", "\u8fd4\u56de"});
        }
    }

    private void g(String object) {
        byte[] byArray = bz.c((short)4250, (String)object);
        object = byArray;
        if (byArray != null) {
            object = new w(4250, (byte[])object);
            i.a((w)object);
            this.a((String)null);
            return;
        }
        this.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
    }

    private void h(String object) {
        byte[] byArray = bz.c((short)4251, (String)object);
        object = byArray;
        if (byArray != null) {
            object = new w(4251, (byte[])object);
            i.a((w)object);
            this.a((String)null);
            return;
        }
        this.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
    }

    private void i(String object) {
        bt.gQ = 1;
        byte[] byArray = bz.b((short)4103, (String)object);
        object = byArray;
        if (byArray != null) {
            object = new w(4103, (byte[])object);
            i.a((w)object);
            this.a((String)null);
            return;
        }
        this.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
    }

    private void C() {
        this.w();
        this.bD = com.yinhan.kjava.main.a.k("/images/logo_btn_random.png");
        this.bx = new bc[6];
        for (int i2 = 0; i2 < this.bx.length; ++i2) {
            this.bx[i2] = this.a(this.bx[i2], (byte)(i2 % 3), i2 < 3 ? (byte)0 : 1, (byte)3, (byte)1, false);
        }
        this.bB = 35;
        this.bG = 0;
        this.bE = 0;
        this.bF = 0;
        this.aq.b();
        this.aq.a("\u521b\u5efa\u89d2\u8272");
        this.aq.a(t.e <= 240 ? this.bB * 3 + 6 : 150);
        this.at.b(t.H[0], t.i, (byte)1);
        this.at.a((byte)1);
        this.au.a(new String[]{"\u521b \u5efa", ""});
        this.aq.a(this.at);
        if (t.c > 220) {
            this.aq.a(this.au);
        }
        this.aq.a(t.f, t.g, t.d, t.e);
        this.a = 0;
        this.b = 0;
        this.j = (short)6;
        this.k = (short)6;
    }

    public final void b(String string, String string2) {
        this.D();
        if (string != null) {
            this.bS = new StringItem(string, string2);
        }
        this.aD = new Form("\u89d2\u8272\u6635\u79f0");
        this.aC = new TextField("\u89d2\u8272\u6635\u79f0", null, 5, 0);
        this.bQ = new Command("\u8fd4\u56de", 8, 1);
        this.bP = new Command("\u786e\u5b9a", 2, 1);
        this.aD.addCommand(this.bP);
        this.aD.addCommand(this.bQ);
        this.aD.append((Item)this.aC);
        if (string != null) {
            this.aD.append((Item)this.bS);
        }
        this.aD.setCommandListener((CommandListener)this);
        this.q.setCurrent((Displayable)this.aD);
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
        e = new ao(this, f);
        if (this.aj != null) {
            ao ao2 = e;
            f f2 = this.aj;
            this.aj.a = ao2;
        }
        e.c("\u6b22\u8fce\u6765\u5230<\u68a6\u56de\u897f\u6e38>\u4e16\u754c");
        this.j = (short)7;
        this.k = (short)7;
    }

    public final void h() {
        int n2;
        bt.e();
        t.a(this.l);
        if (this.bx != null) {
            for (n2 = 0; n2 < this.bx.length; ++n2) {
                if (this.bx[n2] == null) continue;
                this.bx[n2] = null;
            }
            this.bx = null;
        }
        if (this.by != null) {
            for (n2 = 0; n2 < this.by.length; ++n2) {
                if (this.by[n2] == null) continue;
                this.by[n2] = null;
            }
            this.by = null;
        }
    }

    public final void i() {
        short s2 = com.yinhan.kjava.main.a.e.l;
        com.yinhan.kjava.main.a.e.l = 0;
        com.yinhan.kjava.main.a.e.m = 0;
        if (com.yinhan.kjava.main.a.e.g != null && (com.yinhan.kjava.main.a.e.g.d != 2 || com.yinhan.kjava.main.a.e.g.e != 2)) {
            com.yinhan.kjava.main.a.e.g.d = 0;
            short s3 = com.yinhan.kjava.main.a.e.g.f = com.yinhan.kjava.main.a.e.g.f == -1 ? (com.yinhan.kjava.main.a.e.g.f = 0) : com.yinhan.kjava.main.a.e.g.f;
        }
        if (this.az && ao.i()) {
            e.a(com.yinhan.kjava.main.a.e.bb);
        } else if (com.yinhan.kjava.main.a.e.k == 18) {
            com.yinhan.kjava.main.a.e.l = 1;
            com.yinhan.kjava.main.a.e.k = com.yinhan.kjava.main.a.e.j;
        } else if (com.yinhan.kjava.main.a.e.k == 13) {
            if (s2 == 6) {
                e.k(com.yinhan.kjava.main.a.e.aE);
            } else if (s2 == 7) {
                com.yinhan.kjava.main.a.e.l = s2;
            } else if (s2 == 8) {
                com.yinhan.kjava.main.a.e.l = s2;
            } else {
                e.j(com.yinhan.kjava.main.a.e.as);
            }
        } else if (com.yinhan.kjava.main.a.e.k == 2) {
            if (s2 == 1) {
                com.yinhan.kjava.main.a.e.l = 1;
            } else {
                e.m();
            }
        } else if (com.yinhan.kjava.main.a.e.k == 42) {
            com.yinhan.kjava.main.a.e.M.a(com.yinhan.kjava.main.a.e.aE);
        } else if (com.yinhan.kjava.main.a.e.k == 48) {
            if (s2 == 2) {
                com.yinhan.kjava.main.a.e.l = s2;
            }
        } else if (com.yinhan.kjava.main.a.e.k == 46) {
            if (s2 == 1) {
                com.yinhan.kjava.main.a.e.M.a(true);
                com.yinhan.kjava.main.a.e.M.e();
            }
        } else if (com.yinhan.kjava.main.a.e.k == 45) {
            com.yinhan.kjava.main.a.e.M.a(true);
        } else if (com.yinhan.kjava.main.a.e.k == 51) {
            com.yinhan.kjava.main.a.e.M.q();
            com.yinhan.kjava.main.a.e.M.m();
        } else if (com.yinhan.kjava.main.a.e.k == 52) {
            if (s2 == 0 && this.as.a == 1) {
                com.yinhan.kjava.main.a.e.M.t();
            } else if (s2 == 2 && ca.o == 1) {
                com.yinhan.kjava.main.a.e.M.q(1);
            }
        } else if (com.yinhan.kjava.main.a.e.k == 70 && !bt.kT) {
            if (bt.kP == 2) {
                s2 = (byte)com.yinhan.kjava.main.a.e.aq;
                byte by2 = (byte)com.yinhan.kjava.main.a.e.ar;
                e.e(com.yinhan.kjava.main.a.e.as);
                com.yinhan.kjava.main.a.e.aq = s2;
                com.yinhan.kjava.main.a.e.ar = by2;
                e.q();
            }
            if (bt.kP == 0 || bt.kP == 1) {
                e.m();
            }
            if (bt.kP == 3) {
                e.N();
            }
        } else if (com.yinhan.kjava.main.a.e.k == 1) {
            com.yinhan.kjava.main.a.e.l = s2;
        } else if (com.yinhan.kjava.main.a.e.k == 104) {
            com.yinhan.kjava.main.a.e.l = s2;
        } else if (com.yinhan.kjava.main.a.e.k == 115) {
            com.yinhan.kjava.main.a.e.l = s2;
        } else if (com.yinhan.kjava.main.a.e.k == 126) {
            com.yinhan.kjava.main.a.e.l = s2;
        } else if (com.yinhan.kjava.main.a.e.k == 128) {
            com.yinhan.kjava.main.a.e.l = s2;
        } else if (com.yinhan.kjava.main.a.e.k == 130) {
            com.yinhan.kjava.main.a.e.l = s2;
        } else if (com.yinhan.kjava.main.a.e.j == 4 && com.yinhan.kjava.main.a.e.as == 7) {
            e.t();
        } else if (com.yinhan.kjava.main.a.e.j == 14) {
            if (com.yinhan.kjava.main.a.e.k != 14) {
                e.H();
            }
        } else if (com.yinhan.kjava.main.a.e.j != 32) {
            com.yinhan.kjava.main.a.e.k = com.yinhan.kjava.main.a.e.j;
        }
        this.j = (short)7;
        this.k = (short)7;
    }

    private void E() {
        try {
            if (e == null) {
                return;
            }
            e.a();
            if (com.yinhan.kjava.main.a.e.k != 0) {
                this.a = 0;
            }
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            this.a(exception2, (byte)4);
            return;
        }
    }

    private void F() {
        if (bt.b == null || bt.c == null) {
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeUTF(bt.b == null ? "" : bt.b);
            dataOutputStream.writeUTF(bt.c == null ? "" : bt.c);
            this.a(byteArrayOutputStream.toByteArray(), this.aK);
            byteArrayOutputStream.close();
            dataOutputStream.close();
            return;
        }
        catch (IOException iOException) {
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void j() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            for (int i2 = 0; i2 < ao.aW.length; ++i2) {
                if (i2 == 15) continue;
                dataOutputStream.writeByte(ao.aW[i2]);
            }
            this.a(byteArrayOutputStream.toByteArray(), bt.ad);
            byteArrayOutputStream.close();
            dataOutputStream.close();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void k() {
        if (!com.yinhan.kjava.main.a.j(bt.ad)) return;
        a a2 = null;
        try {
            a2 = com.yinhan.kjava.main.a.a(bt.ad, false);
            DataInputStream dataInputStream = com.yinhan.kjava.main.a.a((RecordStore)a2);
            for (int i2 = 0; i2 < ao.aW.length; ++i2) {
                if (i2 == 15) continue;
                ao.aW[i2] = dataInputStream.readByte();
            }
            if (a2 == null) return;
        }
        catch (Exception exception) {
            if (a2 == null) return;
            try {
                a2.closeRecordStore();
                return;
            }
            catch (RecordStoreNotOpenException recordStoreNotOpenException) {
                return;
            }
            catch (RecordStoreException recordStoreException) {
                return;
            }
        }
        catch (Throwable throwable) {
            if (a2 == null) throw throwable;
            try {
                a2.closeRecordStore();
                throw throwable;
            }
            catch (RecordStoreNotOpenException recordStoreNotOpenException) {
                throw throwable;
            }
            catch (RecordStoreException recordStoreException) {}
            throw throwable;
        }
        try {
            a2.closeRecordStore();
            return;
        }
        catch (RecordStoreNotOpenException recordStoreNotOpenException) {
            return;
        }
        catch (RecordStoreException recordStoreException) {
            return;
        }
    }

    private static DataInputStream a(RecordStore object) {
        DataInputStream dataInputStream = null;
        if (1 < object.getNumRecords() + 1) {
            object = object.getRecord(1);
            dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[])object));
            return dataInputStream;
        }
        return null;
    }

    private static boolean j(String string) {
        String[] stringArray = RecordStore.listRecordStores();
        if (stringArray == null) {
            return false;
        }
        for (int i2 = stringArray.length - 1; i2 >= 0; --i2) {
            if (!stringArray[i2].equals(string)) continue;
            return true;
        }
        return false;
    }

    private static RecordStore a(String string, boolean bl2) {
        RecordStore recordStore = null;
        if (bl2) {
            RecordStore.deleteRecordStore((String)string);
            recordStore = RecordStore.openRecordStore((String)string, (boolean)bl2);
            return recordStore;
        }
        recordStore = RecordStore.openRecordStore((String)string, (!bl2 ? 1 : 0) != 0);
        return recordStore;
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void a(byte[] object, String string) {
        void var2_6;
        a a2 = null;
        boolean bl2 = com.yinhan.kjava.main.a.j((String)var2_6);
        a2 = com.yinhan.kjava.main.a.a((String)var2_6, bl2);
        a2.addRecord((byte[])object, 0, ((byte[])object).length);
        if (a2 == null) return;
        try {
            a2.closeRecordStore();
            return;
        }
        catch (RecordStoreNotOpenException recordStoreNotOpenException) {
            return;
        }
        catch (RecordStoreException recordStoreException) {
            return;
        }
        catch (RecordStoreException recordStoreException) {
            try {
                RecordStoreException recordStoreException2 = recordStoreException;
                recordStoreException.printStackTrace();
                if (a2 == null) return;
            }
            catch (Throwable throwable) {
                if (a2 == null) throw throwable;
                try {
                    a2.closeRecordStore();
                    throw throwable;
                }
                catch (RecordStoreNotOpenException recordStoreNotOpenException) {
                    throw throwable;
                }
                catch (RecordStoreException recordStoreException3) {}
                throw throwable;
            }
            try {
                a2.closeRecordStore();
                return;
            }
            catch (RecordStoreNotOpenException recordStoreNotOpenException) {
                return;
            }
            catch (RecordStoreException recordStoreException4) {
                return;
            }
        }
    }

    protected final void keyPressed(int n2) {
        int n3 = n2;
        a a2 = this;
        int n4 = 0;
        block0 : switch (n3) {
            case 49: {
                n4 = 513;
                break;
            }
            case 50: {
                n4 = 514;
                break;
            }
            case 51: {
                n4 = 515;
                break;
            }
            case 52: {
                n4 = 516;
                break;
            }
            case 53: {
                n4 = 517;
                break;
            }
            case 54: {
                n4 = 518;
                break;
            }
            case 55: {
                n4 = 519;
                break;
            }
            case 56: {
                n4 = 520;
                break;
            }
            case 57: {
                n4 = 521;
                break;
            }
            case 48: {
                n4 = 48;
                break;
            }
            case -21: 
            case -6: {
                n4 = 0x10000000;
                break;
            }
            case -22: 
            case -11: 
            case -7: {
                n4 = 0x20000000;
                break;
            }
            case 42: {
                n4 = 1024;
                break;
            }
            case 35: {
                n4 = 2048;
                break;
            }
            default: {
                int n5 = a2.getGameAction(n3);
                switch (n5) {
                    case 6: {
                        n4 = 4;
                        break block0;
                    }
                    case 1: {
                        n4 = 1;
                        break block0;
                    }
                    case 2: {
                        n4 = 8;
                        break block0;
                    }
                    case 5: {
                        n4 = 2;
                        break block0;
                    }
                    case 8: {
                        n4 = 0x40000000;
                    }
                }
            }
        }
        this.a |= n4;
        a2 = this;
        if (a2.bI == a2.a && System.currentTimeMillis() - a2.bJ <= 600L) {
            if (e != null && com.yinhan.kjava.main.a.e.k == 0) {
                com.yinhan.kjava.main.a.e.d = a2.bI == 1 || a2.bI == 514 ? (byte)1 : (a2.bI == 8 || a2.bI == 516 ? (byte)0 : (a2.bI == 4 || a2.bI == 520 ? (byte)3 : (a2.bI == 2 || a2.bI == 518 ? (byte)2 : (byte)-1)));
            }
        } else {
            if (e != null) {
                com.yinhan.kjava.main.a.e.d = (byte)-1;
            }
            a2.bI = a2.a;
        }
        a2.bJ = System.currentTimeMillis();
        n3 = n2;
        a2 = this;
        n4 = 0;
        block23 : switch (a2.getGameAction(n3)) {
            case 6: {
                n4 = 4;
                break;
            }
            case 1: {
                n4 = 1;
                break;
            }
            case 2: {
                n4 = 8;
                break;
            }
            case 5: {
                n4 = 2;
                break;
            }
            default: {
                switch (n3) {
                    case 50: {
                        n4 = 514;
                        break block23;
                    }
                    case 52: {
                        n4 = 516;
                        break block23;
                    }
                    case 54: {
                        n4 = 518;
                        break block23;
                    }
                    case 56: {
                        n4 = 520;
                        break block23;
                    }
                }
                n4 = 0;
            }
        }
        this.b |= n4;
        this.aA = 0;
    }

    protected final void keyReleased(int n2) {
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

    public final void a(String string, int n2) {
        this.aD = new Form(string);
        if (n2 == 2) {
            this.aC = new TextField(string, null, 9, n2);
        } else if (string.equals("\u804a\u5929")) {
            if (com.yinhan.kjava.main.a.e.k == 18) {
                this.aC = com.yinhan.kjava.main.a.e.aR ? new TextField("\u4e0e" + com.yinhan.kjava.main.a.e.aQ + "\u79c1\u804a", null, 30, n2) : new TextField(t.E[com.yinhan.kjava.main.a.e.aT], null, 30, n2);
            } else if (com.yinhan.kjava.main.a.e.k == 7) {
                if (this.as.a < 3) {
                    this.aC = new TextField("\u4e0e" + bt.gJ[this.ar.g()] + "\u79c1\u804a", null, 30, n2);
                } else if (bt.bs == 1) {
                    if (ca.o == 3) {
                        this.aC = new TextField("\u7fa4\u804a", null, 30, n2);
                    } else if (ca.o == 4) {
                        this.aC = new TextField("\u4e0e" + bt.q[this.ar.g()].e + "\u79c1\u804a", null, 30, n2);
                    }
                } else if (bt.bs == 0) {
                    if (ca.o == 0) {
                        this.aC = new TextField("\u7fa4\u804a", null, 30, n2);
                    } else if (ca.o == 1) {
                        this.aC = new TextField("\u4e0e" + bt.q[this.ar.g()].e + "\u79c1\u804a", null, 30, n2);
                    }
                }
            } else {
                this.aC = com.yinhan.kjava.main.a.e.k == 19 ? new TextField("\u4e0e" + bt.dL[this.ar.g() - 1] + "\u79c1\u804a", null, 30, n2) : (com.yinhan.kjava.main.a.e.k == 47 ? new TextField("\u4e0e" + bt.iz[this.ar.g()] + "\u79c1\u804a", null, 30, n2) : new TextField("\u804a\u5929", null, 30, n2));
            }
        } else {
            this.aC = string.equals("\u8f93\u5165\u5e2e\u6d3e\u5b97\u65e8") || string.equals("\u8f93\u5165\u5e2e\u6d3e\u65b0\u5b97\u65e8") || string.equals("\u8f93\u5165\u516c\u544a") ? new TextField(string, null, 100, n2) : (string.equals("\u8f93\u5165\u5e2e\u6d3e\u540d\u79f0") ? new TextField(string, null, 6, n2) : (string.equals("\u8bf7\u8f93\u5165\u8981\u641c\u7d22\u7684\u5e2e\u6d3e\u540d\u79f0") ? new TextField(string, null, 6, n2) : (string.equals("\u8bf7\u8f93\u5165\u8b66\u544a\u8bed\uff0830\u4e2a\u5b57\u7b26\u5185\uff09") ? new TextField(string, null, 30, n2) : (string.equals("\u8f93\u5165\u5151\u6362\u7801") ? new TextField(string, null, 30, n2) : new TextField(string, null, 5, n2)))));
        }
        this.bQ = new Command("\u8fd4\u56de", 8, 1);
        this.bP = new Command("\u786e\u5b9a", 2, 1);
        if (string.equals("\u804a\u5929")) {
            this.bR = new Command("\u8868\u60c5", 8, 1);
            this.aD.addCommand(this.bR);
        }
        this.aD.addCommand(this.bP);
        this.aD.addCommand(this.bQ);
        this.aD.append((Item)this.aC);
        this.aD.setCommandListener((CommandListener)this);
        this.q.setCurrent((Displayable)this.aD);
        if (string.equals("\u804a\u5929")) {
            com.yinhan.kjava.main.a.a(this.aC, this.bZ);
        }
    }

    public static void a(TextField textField, String string) {
        try {
            if (string != null && textField.getMaxSize() > string.length()) {
                textField.setString(string);
            }
            return;
        }
        catch (Exception exception) {
            textField.setString("");
            return;
        }
    }

    public final void a(String string, String string2, String string3, String string4) {
        this.aD = new Form("\u90ae\u4ef6\u4e3e\u62a5");
        this.aC = new TextField("\u4e3e\u62a5\u7406\u7531: ", "", 100, 0);
        this.bS = new StringItem("\u4e3e\u62a5\u90ae\u4ef6\uff1a", "");
        this.bT = new StringItem("\u53d1\u4ef6\u4eba\uff1a", string2);
        this.bU = new StringItem("\u6807    \u9898\uff1a", string3);
        this.bV = new StringItem("\u6b63    \u6587\uff1a", string4);
        this.bW = string;
        this.bP = new Command("\u4e3e\u62a5", 3, 0);
        this.bQ = new Command("\u8fd4\u56de", 1, 5);
        this.aD.addCommand(this.bP);
        this.aD.addCommand(this.bQ);
        this.aD.append((Item)this.aC);
        this.aD.append((Item)this.bS);
        this.aD.append((Item)this.bT);
        this.aD.append((Item)this.bU);
        this.aD.append((Item)this.bV);
        this.q.setCurrent((Displayable)this.aD);
        this.aD.setCommandListener((CommandListener)this);
        this.q.setCurrent((Displayable)this.aD);
    }

    public final void l() {
        this.aD = new Form("\u8054\u7cfb\u5ba2\u670d");
        this.bX = new ChoiceGroup("\u7c7b\u578b: ", 1, ag.a, null);
        this.aC = new TextField("\u5185\u5bb9: ", "", 100, 0);
        this.bP = new Command("\u786e\u5b9a", 3, 0);
        this.bQ = new Command("\u8fd4\u56de", 1, 5);
        this.aD.addCommand(this.bP);
        this.aD.addCommand(this.bQ);
        this.aD.append((Item)this.aC);
        this.aD.append((Item)this.bX);
        this.q.setCurrent((Displayable)this.aD);
        this.aD.setCommandListener((CommandListener)this);
    }

    public final void a(byte by2, String string, String string2, String string3, String string4, String string5, String string6) {
        this.bY = 0;
        bt.O.q = string5;
        bt.O.r = string6;
        by2 = (byte)(string.equals("\u56de\u590d\u90ae\u4ef6") ? 1 : 0);
        if (this.bY == 0) {
            this.aD = new Form(string);
            if (by2 == 0) {
                this.bL = new TextField("\u6536\u4ef6\u4eba: ", string3, 10, 0);
            } else {
                this.bU = new StringItem("\u6536\u4ef6\u4eba: ", string3);
            }
            this.aC = new TextField("\u6807    \u9898: ", string2, 10, 0);
            this.bM = new TextField("\u6b63    \u6587: ", string4, 100, 0);
            this.bP = new Command("\u53d1\u9001", 3, 0);
            this.bQ = new Command("\u8fd4\u56de", 1, 5);
            if (by2 == 0) {
                this.bR = new Command("\u9009\u62e9\u6536\u4ef6\u4eba", 1, 5);
            }
            this.bS = new StringItem("\u6e29\u99a8\u63d0\u793a", "\u2605\u8bf7\u4fdd\u62a4\u597d\u4e2a\u4eba\u5e10\u53f7\uff0c\u52ff\u5728\u90ae\u4ef6\u5185\u5bb9\u4e2d\u6cc4\u6f0f\u4efb\u4f55\u4e0e\u8d22\u4ea7\u76f8\u5173\u7684\u4fe1\u606f\uff0c\u540e\u679c\u9700\u81ea\u8d1f\u3002");
            this.bT = new StringItem(null, "\u2605\u5b98\u65b9\u4e0e\u73a9\u5bb6\u8054\u7cfb\u4f7f\u7528\u7cfb\u7edf\u90ae\u4ef6\u5f62\u5f0f\uff0c\u614e\u8bbf\u79c1\u4eba\u90ae\u4ef6\u5192\u7528\u5b98\u65b9\u540d\u4e49\u884c\u9a97\u3002");
            this.aD.addCommand(this.bP);
            if (by2 == 0) {
                this.aD.addCommand(this.bR);
            }
            this.aD.addCommand(this.bQ);
            this.aD.append((Item)this.aC);
            if (by2 == 0) {
                this.aD.append((Item)this.bL);
            } else {
                this.aD.append((Item)this.bU);
            }
            this.aD.append((Item)this.bM);
            this.aD.append((Item)this.bS);
            this.aD.append((Item)this.bT);
            this.aD.setCommandListener((CommandListener)this);
            this.q.setCurrent((Displayable)this.aD);
        }
    }

    public final void d(String string) {
        this.aD = new Form(string);
        this.aE = new ChoiceGroup("", 1, new String[]{"\u4e16\u754c\u804a", "\u533a\u57df\u804a", "\u961f\u4f0d\u804a", "\u5e2e\u6d3e\u804a", "\u8de8\u670d\u804a"}, null);
        this.aE.setSelectedIndex(1, true);
        this.aC = new TextField(string, null, 30, 0);
        this.bQ = new Command("\u8fd4\u56de", 8, 1);
        this.bR = new Command("\u8868\u60c5", 8, 1);
        this.bP = new Command("\u786e\u5b9a", 2, 1);
        this.aD.addCommand(this.bP);
        this.aD.addCommand(this.bR);
        this.aD.addCommand(this.bQ);
        this.aD.append((Item)this.aC);
        this.aD.append((Item)this.aE);
        this.aD.setCommandListener((CommandListener)this);
        this.q.setCurrent((Displayable)this.aD);
        com.yinhan.kjava.main.a.a(this.aC, this.bZ);
    }

    public final void e(String string) {
        this.aD = new Form(string);
        this.bP = new Command("\u786e\u5b9a", 4, 2);
        this.bQ = new Command("\u8fd4\u56de", 2, 1);
        this.aD.addCommand(this.bQ);
        this.aD.addCommand(this.bP);
        this.aD.setCommandListener((CommandListener)this);
        this.aC = new TextField("\u8bf7\u8f93\u5165\u641c\u7d22\u5173\u952e\u5b57:", "", 10, 0);
        this.aD.append((Item)this.aC);
        this.q.setCurrent((Displayable)this.aD);
    }

    public final void f(String string) {
        this.aD = new Form(string);
        this.bP = new Command("\u66f4\u6539", 4, 2);
        this.bQ = new Command("\u8fd4\u56de", 2, 1);
        this.aD.addCommand(this.bQ);
        this.aD.addCommand(this.bP);
        this.aD.setCommandListener((CommandListener)this);
        this.aC = new TextField("\u65b0\u540d\u79f0:", "", 5, 0);
        this.aD.append((Item)this.aC);
        this.q.setCurrent((Displayable)this.aD);
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void commandAction(Command object, Displayable object2) {
        if (this.aD == null) {
            return;
        }
        object2 = this.aD.getTitle();
        if (((String)object2).equals("\u767b\u5f55\u5f53\u4e50\u901a\u884c\u8bc1") || ((String)object2).equals("\u767b\u5f55\u4e00\u54e5\u54e5\u901a\u884c\u8bc1")) {
            String string;
            Object object3;
            if (!((String)(object = object.getLabel())).equals("\u767b\u9646")) {
                this.c();
                this.d.a();
                return;
            }
            byte by2 = (byte)this.bc.getSelectedIndex();
            byte by3 = this.bd.isSelected(0);
            String string2 = this.bN.getString().trim();
            String string3 = this.bO.getString().trim();
            if (by3 != 0) {
                object3 = string3;
                string = string2;
                byte by4 = by2;
                by3 = (byte)(!((String)object2).equals("\u767b\u5f55\u5f53\u4e50\u901a\u884c\u8bc1") ? 1 : 0);
                object = this;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                try {
                    dataOutputStream.writeBoolean(by3 == 0);
                    dataOutputStream.writeByte(by4);
                    dataOutputStream.writeBoolean(true);
                    dataOutputStream.writeUTF(string == null ? "" : string);
                    dataOutputStream.writeUTF((String)(object3 == null ? "" : object3));
                    super.a(byteArrayOutputStream.toByteArray(), "dcn_user_info.db");
                    byteArrayOutputStream.close();
                    dataOutputStream.close();
                }
                catch (IOException iOException) {
                    object = iOException;
                    iOException.printStackTrace();
                }
            }
            if (!((String)object2).equals("\u767b\u5f55\u5f53\u4e50\u901a\u884c\u8bc1")) {
                t.w = false;
                ai.a((byte)(by2 + 1), string2, string3);
                this.d.a();
                this.a("\u8bf7\u6c42\u4e2d...");
                return;
            }
            t.w = true;
            com.yinhan.kjava.main.c.b();
            string = string3;
            String string4 = by2 == 1 ? string2 : "";
            String string5 = by2 == 0 ? string2 : "";
            object = this;
            object3 = bz.a((short)5392, t.s, bb.a, bb.b, string5, string4, string, t.v, t.F, (int)Runtime.getRuntime().totalMemory(), t.u);
            ((a)object).a("socket://120.78.151.213:20008", "http://117.135.138.130:7099");
            if (object3 != null) {
                i.a(new w(5392, (byte[])object3));
                ((a)object).d.a();
                ((a)object).a("\u6b63\u5728\u767b\u5f55...");
                return;
            }
            ((a)object).b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
            return;
        }
        if (((String)object2).equals("\u767b\u9646\u6e38\u620f")) {
            if (!((String)(object = object.getLabel())).equals("\u767b\u9646")) {
                if (!((String)object).equals("\u8fd4\u56de")) return;
                this.c();
                this.a = 0;
                this.b = 0;
                this.d.a();
                return;
            }
            object = this;
            if (!((a)object).bN.getString().equals("")) {
                object = this;
                if (!((a)object).bO.getString().equals("")) {
                    this.aZ = true;
                    this.d.a();
                    return;
                }
            }
            object = this;
            if (((a)object).bN.getString().equals("")) {
                this.b("\u5e10\u53f7\u4e0d\u80fd\u4e3a\u7a7a!");
                return;
            }
            object = this;
            if (!((a)object).bO.getString().equals("")) return;
            this.b("\u5bc6\u7801\u4e0d\u80fd\u4e3a\u7a7a!");
            return;
        }
        if (((String)object2).equals("\u89d2\u8272\u6635\u79f0")) {
            if (!((String)(object = object.getLabel())).equals("\u786e\u5b9a")) {
                if (!((String)object).equals("\u8fd4\u56de")) return;
                this.a = 0;
                this.b = 0;
                this.d.a();
                return;
            }
            if (!this.aC.getString().equals("")) {
                this.ay = this.aC.getString().trim();
                this.D();
                this.d.a();
                return;
            }
            this.b("\u6635\u79f0\u4e0d\u80fd\u4e3a\u7a7a\uff01");
            return;
        }
        if (((String)object2).equals("\u804a\u5929")) {
            if (((String)(object = object.getLabel())).equals("\u786e\u5b9a")) {
                if (this.aC.getString() == null || this.aC.getString().equals("")) {
                    this.d.a();
                    this.b("\u4e0d\u80fd\u53d1\u9001\u7a7a\u6d88\u606f");
                    return;
                }
                if (com.yinhan.kjava.main.a.e.j == 1) {
                    com.yinhan.kjava.main.a.e.k = 0;
                    com.yinhan.kjava.main.a.e.j = 0;
                } else {
                    com.yinhan.kjava.main.a.e.k = com.yinhan.kjava.main.a.e.j;
                }
                this.a = 0;
                this.b = 0;
                this.d.a();
                if (com.yinhan.kjava.main.a.e.k == 0) {
                    f.a(com.yinhan.kjava.main.a.e.f, ao.h, ao.i, true, false, 1009050);
                }
                this.g = true;
                return;
            }
            if (!((String)object).equals("\u8fd4\u56de")) {
                if (!((String)object).equals("\u8868\u60c5")) return;
                e.L();
                this.d.a();
                return;
            }
            this.n();
            if (com.yinhan.kjava.main.a.e.j == 1) {
                com.yinhan.kjava.main.a.e.j = 0;
                com.yinhan.kjava.main.a.e.k = 0;
            } else {
                com.yinhan.kjava.main.a.e.k = com.yinhan.kjava.main.a.e.j;
            }
            this.a = 0;
            this.b = 0;
            this.d.a();
            if (com.yinhan.kjava.main.a.e.k != 0) return;
            f.a(com.yinhan.kjava.main.a.e.f, ao.h, ao.i, true, false, 1009050);
            return;
        }
        if (((String)object2).equals("\u7269\u54c1\u5173\u952e\u5b57\u641c\u7d22")) {
            object = object.getLabel();
            String string = this.aC.getString();
            if (((String)object).equals("\u786e\u5b9a") && string != null) {
                com.yinhan.kjava.main.a.e.aU = this.ar.g();
                com.yinhan.kjava.main.a.e.aK = string;
                com.yinhan.kjava.main.a.e.aL = "";
                com.yinhan.kjava.main.a.e.aM = 1;
                com.yinhan.kjava.main.a.e.aN = 0;
                e.a(com.yinhan.kjava.main.a.e.aK, com.yinhan.kjava.main.a.e.aL, com.yinhan.kjava.main.a.e.aM, com.yinhan.kjava.main.a.e.aN);
                this.d.a();
                this.a((String)null);
                return;
            }
            if (!((String)object).equals("\u8fd4\u56de")) return;
            this.aD = null;
            this.aC = null;
            this.a = 0;
            this.b = 0;
            this.d.a();
            return;
        }
        if (((String)object2).equals("\u5ba0\u7269\u5173\u952e\u5b57\u641c\u7d22")) {
            object = object.getLabel();
            String string = this.aC.getString();
            if (((String)object).equals("\u786e\u5b9a") && string != null) {
                com.yinhan.kjava.main.a.e.aU = this.ar.g();
                com.yinhan.kjava.main.a.e.aK = string;
                com.yinhan.kjava.main.a.e.aL = "";
                com.yinhan.kjava.main.a.e.aM = 1;
                com.yinhan.kjava.main.a.e.aN = 0;
                e.b(com.yinhan.kjava.main.a.e.aK, com.yinhan.kjava.main.a.e.aL, com.yinhan.kjava.main.a.e.aM, com.yinhan.kjava.main.a.e.aN);
                this.d.a();
                this.a((String)null);
                return;
            }
            if (!((String)object).equals("\u8fd4\u56de")) return;
            this.aD = null;
            this.aC = null;
            this.a = 0;
            this.b = 0;
            this.d.a();
            return;
        }
        if (((String)object2).equals("\u5ba0\u7269\u540d\u79f0")) {
            object = object.getLabel();
            String string = this.aC.getString();
            if (((String)object).equals("\u66f4\u6539") && string != null) {
                if (string.length() == 0) {
                    this.b("\u540d\u79f0\u4e3a\u7a7a\uff01");
                    return;
                }
                this.h = true;
                this.d.a();
                return;
            }
            if (!((String)object).equals("\u8fd4\u56de")) return;
            this.d.a();
            this.m();
            return;
        }
        if (((String)object2).equals("\u670d\u52a1\u5730\u5740")) {
            if (!((String)(object = object.getLabel())).equals("\u786e\u5b9a")) {
                if (!((String)object).equals("\u8fd4\u56de")) return;
                this.H();
                this.y();
                this.d.a();
                this.a = 0;
                this.b = 0;
                return;
            }
            String string = this.aC.getString();
            int n2 = this.bX.getSelectedIndex();
            this.H();
            this.b(string, n2 == 1 ? (byte)1 : 2);
            return;
        }
        if (((String)object2).equals("\u8bf7\u8f93\u5165\u62cd\u5356\u4ef7\u683c") || ((String)object2).equals("\u8bf7\u8f93\u5165\u53d6\u51fa\u94f6\u4e24") || ((String)object2).equals("\u8bf7\u8f93\u5165\u5b58\u5165\u94f6\u4e24") || ((String)object2).equals("\u62cd\u5356\u4ef7\u683c") || ((String)object2).equals("\u8f93\u5165\u4ea4\u6613\u94f6\u4e24") || ((String)object2).equals("\u8bf7\u8f93\u5165\u51b3\u6597\u91d1\u989d") || ((String)object2).equals("\u6350\u732e\u94f6\u4e24\u6570\u91cf") || ((String)object2).equals("\u53d6\u51fa\u94f6\u4e24\u6570\u91cf") || ((String)object2).equals("\u6350\u732e\u7ecf\u9a8c\u6570\u91cf") || ((String)object2).equals("\u8bf7\u8f93\u5165\u51b3\u6597\u91d1\u989d") || ((String)object2).equals("\u8bf7\u8f93\u5165\u7ade\u6807\u94f6\u4e24")) {
            if (!((String)(object = object.getLabel())).equals("\u786e\u5b9a")) {
                if (!((String)object).equals("\u8fd4\u56de")) return;
                this.aD = null;
                this.aC = null;
                this.d.a();
                this.a = 0;
                this.b = 0;
                return;
            }
            if (this.aC.getString() != "" && !this.aC.getString().substring(0, 1).equals("-")) {
                e.o();
                com.yinhan.kjava.main.a.e.ak.append(this.aC.getString());
                this.d.a();
                this.a = 0;
                this.b = 0;
                return;
            }
            this.b("\u8f93\u5165\u6709\u8bef,\u8bf7\u91cd\u65b0\u8f93\u5165");
            return;
        }
        if (((String)object2).equals("\u8f93\u5165\u5e2e\u6d3e\u540d\u79f0")) {
            object = object.getLabel();
            String string = this.aC.getString();
            if (((String)object).equals("\u786e\u5b9a") && string != null) {
                if (string.length() == 0) {
                    this.b("\u540d\u5b57\u8f93\u5165\u9519\u8bef\uff01");
                    return;
                }
                object2 = string;
                object = com.yinhan.kjava.main.a.e.M;
                com.yinhan.kjava.main.a.e.M.c = object2;
                this.I();
                this.a("\u8f93\u5165\u5e2e\u6d3e\u5b97\u65e8", 0);
                return;
            }
            if (!((String)object).equals("\u8fd4\u56de")) return;
            object2 = null;
            object = com.yinhan.kjava.main.a.e.M;
            com.yinhan.kjava.main.a.e.M.c = object2;
            this.I();
            this.d.a();
            return;
        }
        if (((String)object2).equals("\u8f93\u5165\u5e2e\u6d3e\u5b97\u65e8")) {
            object = object.getLabel();
            String string = this.aC.getString();
            if (((String)object).equals("\u786e\u5b9a") && string != null) {
                if (string.length() == 0) {
                    this.b("\u8bf7\u8f93\u5165\u5e2e\u6d3e\u5b97\u65e8\uff01");
                    return;
                }
                object2 = string;
                object = com.yinhan.kjava.main.a.e.M;
                com.yinhan.kjava.main.a.e.M.d = object2;
                this.I();
                object = com.yinhan.kjava.main.a.e.M;
                if (((aq)object).c != null && ((aq)object).d != null) {
                    byte[] byArray = bz.b((short)4197, bt.ad, ((aq)object).c, ((aq)object).d);
                    if (byArray != null) {
                        w w2 = new w(4197, byArray);
                        i.a(w2);
                    } else {
                        ((aq)object).a.e.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
                    }
                    ((aq)object).a.e.a((String)null);
                }
                this.d.a();
                return;
            }
            if (!((String)object).equals("\u8fd4\u56de")) return;
            object2 = null;
            object = com.yinhan.kjava.main.a.e.M;
            com.yinhan.kjava.main.a.e.M.c = object2;
            object2 = null;
            object = com.yinhan.kjava.main.a.e.M;
            com.yinhan.kjava.main.a.e.M.d = object2;
            this.I();
            this.d.a();
            return;
        }
        if (((String)object2).equals("\u8f93\u5165\u5e2e\u6d3e\u65b0\u5b97\u65e8")) {
            object = object.getLabel();
            String string = this.aC.getString();
            if (((String)object).equals("\u786e\u5b9a") && string != null) {
                if (string.length() == 0) {
                    this.b("\u8bf7\u8f93\u5165\u5e2e\u6d3e\u5b97\u65e8\uff01");
                    return;
                }
                object2 = string;
                object = com.yinhan.kjava.main.a.e.M;
                com.yinhan.kjava.main.a.e.M.e = object2;
                this.I();
                object = com.yinhan.kjava.main.a.e.M;
                if (((aq)object).e != null) {
                    byte[] byArray = bz.i((short)4216, bt.ad, ((aq)object).e);
                    if (byArray != null) {
                        w w3 = new w(4216, byArray);
                        i.a(w3);
                    } else {
                        ((aq)object).b.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
                    }
                    ((aq)object).b.a((String)null);
                }
                this.d.a();
                return;
            }
            if (!((String)object).equals("\u8fd4\u56de")) return;
            object2 = null;
            object = com.yinhan.kjava.main.a.e.M;
            com.yinhan.kjava.main.a.e.M.e = object2;
            this.I();
            this.d.a();
            return;
        }
        if (((String)object2).equals("\u8f93\u5165\u73a9\u5bb6\u540d\u79f0")) {
            object = object.getLabel();
            String string = this.aC.getString();
            if (((String)object).equals("\u786e\u5b9a") && string != null) {
                if (string.length() == 0) {
                    this.b("\u540d\u79f0\u4e0d\u80fd\u4e3a\u7a7a\uff01");
                    return;
                }
                object2 = string;
                object = com.yinhan.kjava.main.a.e.M;
                com.yinhan.kjava.main.a.e.M.f = object2;
                this.I();
                com.yinhan.kjava.main.a.e.M.h();
                this.d.a();
                return;
            }
            if (!((String)object).equals("\u8fd4\u56de")) return;
            this.d.a();
            this.I();
            return;
        }
        if (((String)object2).equals("\u8f93\u5165\u62db\u52df\u91d1\u989d")) {
            if (!((String)(object = object.getLabel())).equals("\u786e\u5b9a")) {
                if (!((String)object).equals("\u8fd4\u56de")) return;
                this.aD = null;
                this.aC = null;
                this.d.a();
                return;
            }
            if (this.aC.getString() == "") return;
            e.o();
            com.yinhan.kjava.main.a.e.ak.append(this.aC.getString());
            if (e.n() >= 0L) {
                com.yinhan.kjava.main.a.e.M.a(e.n());
                com.yinhan.kjava.main.a.e.M.a();
                this.d.a();
                return;
            }
            this.b("\u8f93\u5165\u6709\u8bef,\u8bf7\u91cd\u65b0\u8f93\u5165");
            return;
        }
        if (((String)object2).equals("\u8bf7\u8f93\u5165\u8d21\u732e\u91d1\u989d")) {
            if (!((String)(object = object.getLabel())).equals("\u786e\u5b9a")) {
                if (!((String)object).equals("\u8fd4\u56de")) return;
                this.aD = null;
                this.aC = null;
                this.d.a();
                return;
            }
            if (this.aC.getString() == "") {
                this.b("\u8bf7\u8f93\u5165\u91d1\u989d");
                return;
            }
            e.o();
            com.yinhan.kjava.main.a.e.ak.append(this.aC.getString());
            if (e.n() < 0L) {
                this.b("\u8f93\u5165\u6709\u8bef,\u8bf7\u91cd\u65b0\u8f93\u5165");
                return;
            }
            if (e.n() > bt.ap) {
                this.b("\u60a8\u6ca1\u6709\u8fd9\u4e48\u591a\u94f6\u4e24,\u8bf7\u91cd\u65b0\u8f93\u5165\uff01");
                return;
            }
            com.yinhan.kjava.main.a.e.M.j = e.n();
            com.yinhan.kjava.main.a.e.M.k[0] = (int)com.yinhan.kjava.main.a.e.M.j;
            this.d.a();
            return;
        }
        if (((String)object2).equals("\u8bf7\u8f93\u5165\u94f6\u4e24\u5956\u52b1")) {
            if (!((String)(object = object.getLabel())).equals("\u786e\u5b9a")) {
                if (!((String)object).equals("\u8fd4\u56de")) return;
                this.aD = null;
                this.aC = null;
                this.d.a();
                return;
            }
            if (this.aC.getString() == "") {
                this.b("\u8bf7\u8f93\u5165\u94f6\u4e24");
                return;
            }
            e.o();
            com.yinhan.kjava.main.a.e.ak.append(this.aC.getString());
            if (e.n() < 0L) {
                this.b("\u8f93\u5165\u6709\u8bef,\u8bf7\u91cd\u65b0\u8f93\u5165");
                return;
            }
            if (e.n() > (long)bt.iM[1]) {
                this.b("\u6700\u591a\u53ea\u80fd\u914d\u7f6e" + bt.a((long)bt.iM[1]) + ",\u8bf7\u91cd\u65b0\u8f93\u5165\uff01");
                return;
            }
            com.yinhan.kjava.main.a.e.M.i[1] = bt.iM[0] = (int)e.n();
            this.d.a();
            return;
        }
        if (((String)object2).equals("\u8bf7\u8f93\u5165\u7269\u54c1\u6389\u7387")) {
            if (!((String)(object = object.getLabel())).equals("\u786e\u5b9a")) {
                if (!((String)object).equals("\u8fd4\u56de")) return;
                this.aD = null;
                this.aC = null;
                this.d.a();
                return;
            }
            if (this.aC.getString() == "") {
                this.b("\u8bf7\u8f93\u5165\u6389\u7387");
                return;
            }
            e.o();
            com.yinhan.kjava.main.a.e.ak.append(this.aC.getString());
            if (e.n() < 0L) {
                this.b("\u8f93\u5165\u6709\u8bef,\u8bf7\u91cd\u65b0\u8f93\u5165");
                return;
            }
            if (e.n() > (long)bt.iK[1]) {
                this.b("\u6700\u591a\u53ea\u80fd\u914d\u7f6e" + bt.iK[1] + "%,\u8bf7\u91cd\u65b0\u8f93\u5165\uff01");
                return;
            }
            bt.iK[0] = (byte)e.n();
            com.yinhan.kjava.main.a.e.M.i[0] = bt.iK[0];
            this.d.a();
            return;
        }
        if (((String)object2).equals("\u8bf7\u8f93\u5165\u7ecf\u9a8c\u52a0\u6210")) {
            if (!((String)(object = object.getLabel())).equals("\u786e\u5b9a")) {
                if (!((String)object).equals("\u8fd4\u56de")) return;
                this.aD = null;
                this.aC = null;
                this.d.a();
                return;
            }
            if (this.aC.getString() == "") {
                this.b("\u8bf7\u8f93\u5165\u52a0\u6210");
                return;
            }
            e.o();
            com.yinhan.kjava.main.a.e.ak.append(this.aC.getString());
            if (e.n() < 0L) {
                this.b("\u8f93\u5165\u6709\u8bef,\u8bf7\u91cd\u65b0\u8f93\u5165");
                return;
            }
            if (e.n() > (long)bt.iL[1]) {
                this.b("\u6700\u591a\u53ea\u80fd\u914d\u7f6e" + bt.iL[1] + "%,\u8bf7\u91cd\u65b0\u8f93\u5165\uff01");
                return;
            }
            bt.iL[0] = (byte)e.n();
            com.yinhan.kjava.main.a.e.M.i[2] = bt.iL[0];
            this.d.a();
            return;
        }
        if (((String)object2).equals("\u8f93\u5165\u516c\u544a")) {
            object = object.getLabel();
            String string = this.aC.getString();
            if (((String)object).equals("\u786e\u5b9a") && string != null) {
                if (string.length() == 0) {
                    this.b("\u8bf7\u8f93\u5165\u516c\u544a\uff01");
                    return;
                }
                object2 = string;
                object = com.yinhan.kjava.main.a.e.M;
                com.yinhan.kjava.main.a.e.M.h = object2;
                this.I();
                object = com.yinhan.kjava.main.a.e.M;
                byte[] byArray = bz.n((short)4218, bt.ad, ((aq)object).h);
                if (byArray != null) {
                    i.a(new w(4218, byArray));
                    ((aq)object).b.a((String)null);
                } else {
                    ((aq)object).b.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
                }
                this.d.a();
                return;
            }
            if (!((String)object).equals("\u8fd4\u56de")) return;
            object2 = null;
            object = com.yinhan.kjava.main.a.e.M;
            com.yinhan.kjava.main.a.e.M.h = object2;
            this.I();
            this.d.a();
            return;
        }
        if (((String)object2).equals("\u8f93\u5165\u201cOK\u201d \u5220\u9664\u89d2\u8272")) {
            object = object.getLabel();
            String string = this.aC.getString();
            if (((String)object).equals("\u786e\u5b9a") && string != null) {
                if (!string.equals("OK")) {
                    this.b("\u8bf7\u8f93\u5165\u201cOK\u201d \uff01");
                    return;
                }
                object = this;
                byte[] byArray = bz.a((short)4100, bt.W[((a)object).aw]);
                if (byArray != null) {
                    i.a(new w(4100, byArray));
                    ((a)object).a((String)null);
                } else {
                    ((a)object).b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
                }
                this.d.a();
                return;
            }
            if (!((String)object).equals("\u8fd4\u56de")) return;
            this.aD = null;
            this.d.a();
            return;
        }
        if (((String)object2).equals("\u8bf7\u8f93\u5165\u597d\u53cb\u6635\u79f0")) {
            if (!((String)(object = object.getLabel())).equals("\u786e\u5b9a")) {
                if (!((String)object).equals("\u8fd4\u56de")) return;
                this.aD = null;
                this.aC = null;
                this.a = 0;
                this.b = 0;
                this.d.a();
                return;
            }
            if (this.aC.getString().equals("")) {
                this.b("\u6635\u79f0\u4e0d\u80fd\u4e3a\u7a7a\uff01");
                return;
            }
            e.a(this.aC.getString(), true);
            this.a = 0;
            this.b = 0;
            this.d.a();
            return;
        }
        if (((String)object2).equals("\u91cd\u8981\u7269\u54c1\u8f93\u5165OK\u4e22\u5f03")) {
            object = object.getLabel();
            String string = this.aC.getString();
            if (((String)object).equals("\u786e\u5b9a") && string != null) {
                if (string.equals("OK")) {
                    e.f(com.yinhan.kjava.main.a.e.ag);
                    this.a = 0;
                    this.b = 0;
                    this.d.a();
                    return;
                }
                this.b("\u8bf7\u8f93\u5165\u201cOK\u201d \uff01");
                return;
            }
            if (!((String)object).equals("\u8fd4\u56de")) return;
            this.aD = null;
            this.aC = null;
            this.a = 0;
            this.b = 0;
            this.d.a();
            return;
        }
        if (((String)object2).equals("\u8f93\u5165OK\u786e\u8ba4\u89e3\u6563\u5e2e\u6d3e")) {
            object = object.getLabel();
            String string = this.aC.getString();
            if (((String)object).equals("\u786e\u5b9a") && string != null) {
                if (!string.equals("OK")) {
                    this.b("\u5982\u9700\u8981\u89e3\u6563\u5e2e\u6d3e\uff0c\u8bf7\u8f93\u5165\u201cOK\u201d\uff01");
                    return;
                }
                object = com.yinhan.kjava.main.a.e.M;
                byte[] byArray = bz.n((short)4214, bt.ad);
                if (byArray != null) {
                    i.a(new w(4214, byArray));
                    ((aq)object).b.a((String)null);
                } else {
                    ((aq)object).b.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
                }
                this.a = 0;
                this.b = 0;
                this.d.a();
                return;
            }
            if (!((String)object).equals("\u8fd4\u56de")) return;
            this.aD = null;
            this.aC = null;
            this.a = 0;
            this.b = 0;
            com.yinhan.kjava.main.a.e.l = 0;
            this.d.a();
            return;
        }
        if (((String)object2).equals("\u8bf7\u8f93\u5165\u8981\u641c\u7d22\u7684\u5e2e\u6d3e\u540d\u79f0")) {
            object = object.getLabel();
            String string = this.aC.getString();
            if (((String)object).equals("\u786e\u5b9a") && string != null) {
                bt.gQ = 1;
                if (string.length() == 0) {
                    com.yinhan.kjava.main.a.e.M.o = "";
                    com.yinhan.kjava.main.a.e.M.a(com.yinhan.kjava.main.a.e.M.o);
                } else {
                    com.yinhan.kjava.main.a.e.M.o = string;
                    com.yinhan.kjava.main.a.e.M.a(com.yinhan.kjava.main.a.e.M.o);
                }
                this.I();
                this.a = 0;
                this.b = 0;
                this.d.a();
                return;
            }
            if (!((String)object).equals("\u8fd4\u56de")) return;
            this.I();
            this.a = 0;
            this.b = 0;
            this.d.a();
            return;
        }
        if (((String)object2).equals("\u8f93\u5165OK\u786e\u8ba4\u5ba3\u6218")) {
            object = object.getLabel();
            String string = this.aC.getString();
            if (((String)object).equals("\u786e\u5b9a") && string != null) {
                if (string.equals("OK")) {
                    com.yinhan.kjava.main.a.e.M.a((byte)3, bt.jY[this.ar.g() - 1]);
                    this.a = 0;
                    this.b = 0;
                    this.d.a();
                    return;
                }
                this.b("\u786e\u5b9a\u5ba3\u6218\uff0c\u8bf7\u8f93\u5165\u201cOK\u201d\uff01");
                return;
            }
            if (!((String)object).equals("\u8fd4\u56de")) return;
            this.aD = null;
            this.aC = null;
            this.a = 0;
            this.b = 0;
            com.yinhan.kjava.main.a.e.l = 0;
            this.d.a();
            return;
        }
        if (((String)object2).equals("\u91cd\u8981\u7269\u54c1\u8f93\u5165OK\u5356\u51fa")) {
            object = object.getLabel();
            String string = this.aC.getString();
            if (((String)object).equals("\u786e\u5b9a") && string != null) {
                if (string.equals("OK")) {
                    e.m(com.yinhan.kjava.main.a.e.ag);
                    this.a = 0;
                    this.b = 0;
                    this.d.a();
                    return;
                }
                this.b("\u8bf7\u8f93\u5165\u201cOK\u201d \uff01");
                return;
            }
            if (!((String)object).equals("\u8fd4\u56de")) return;
            this.aD = null;
            this.aC = null;
            this.a = 0;
            this.b = 0;
            this.d.a();
            return;
        }
        if (((String)object2).equals("\u8bf7\u8f93\u5165\u8b66\u544a\u8bed\uff0830\u4e2a\u5b57\u7b26\u5185\uff09")) {
            object = object.getLabel();
            String string = this.aC.getString();
            if (((String)object).equals("\u786e\u5b9a") && string != null) {
                com.yinhan.kjava.main.a.e.M.b((byte)0, string);
                this.a = 0;
                this.b = 0;
                this.d.a();
                return;
            }
            if (!((String)object).equals("\u8fd4\u56de")) return;
            this.aD = null;
            this.aC = null;
            this.a = 0;
            this.b = 0;
            this.d.a();
            return;
        }
        if (((String)object2).equals("\u8f93\u5165OK\u786e\u5b9a\u9057\u5fd8\u5ba0\u7269\u6280\u80fd")) {
            object = object.getLabel();
            String string = this.aC.getString();
            if (((String)object).equals("\u786e\u5b9a") && string != null) {
                if (string.equals("OK")) {
                    e.y();
                    this.a = 0;
                    this.b = 0;
                    this.d.a();
                    return;
                }
                this.b("\u8bf7\u8f93\u5165\u201cOK\u201d \uff01");
                return;
            }
            if (!((String)object).equals("\u8fd4\u56de")) return;
            this.aD = null;
            this.aC = null;
            this.a = 0;
            this.b = 0;
            this.d.a();
            return;
        }
        if (((String)object2).equals("\u53d1\u5e03\u6c42\u7231\u5ba3\u8a00")) {
            object = object.getLabel();
            String string = this.aC.getString();
            String string6 = this.bL.getString();
            String string7 = this.bM.getString();
            if (!((String)object).equals("\u786e\u5b9a")) {
                if (!((String)object).equals("\u8fd4\u56de")) return;
                this.aD = null;
                this.aC = null;
                this.bL = null;
                this.bM = null;
                this.a = 0;
                this.b = 0;
                this.d.a();
                return;
            }
            if (!(string.equals("") || string6.equals("") || string7.equals(""))) {
                e.o();
                com.yinhan.kjava.main.a.e.ak.append(string7);
                long l2 = e.n();
                if (l2 > 0L) {
                    com.yinhan.kjava.main.a.e.S.a(string, string6, l2);
                    this.a = 0;
                    this.b = 0;
                    this.d.a();
                    return;
                }
                object = new Alert("\u94f6\u4e24\u8f93\u5165\u6709\u8bef", "\u8bf7\u91cd\u65b0\u8f93\u5165\u94f6\u4e24\uff01", null, AlertType.ERROR);
                object.setTimeout(-2);
                this.q.setCurrent((Displayable)object);
                return;
            }
            if (string.equals("")) {
                Alert alert = new Alert("\u6635\u79f0\u4e3a\u7a7a", "\u8bf7\u8f93\u5165\u6c42\u7231\u4eba\u6635\u79f0\uff01", null, AlertType.ERROR);
                alert.setTimeout(-2);
                this.q.setCurrent((Displayable)alert);
                return;
            }
            if (string6.equals("")) {
                Alert alert = new Alert("\u6c42\u7231\u5ba3\u8a00\u4e3a\u7a7a", "\u8bf7\u8f93\u5165\u6c42\u7231\u5ba3\u8a00\uff01", null, AlertType.ERROR);
                alert.setTimeout(-2);
                this.q.setCurrent((Displayable)alert);
                return;
            }
            if (!string7.equals("")) return;
            Alert alert = new Alert("\u94f6\u4e24\u4e3a\u7a7a", "\u8bf7\u8f93\u5165\u94f6\u4e24\uff01", null, AlertType.ERROR);
            alert.setTimeout(-2);
            this.q.setCurrent((Displayable)alert);
            return;
        }
        if (((String)object2).equals("\u8f93\u5165OK\u786e\u5b9a\u79bb\u5a5a")) {
            object = object.getLabel();
            String string = this.aC.getString();
            if (((String)object).equals("\u786e\u5b9a") && string != null) {
                if (string.equals("OK")) {
                    if (v.e == 1) return;
                    com.yinhan.kjava.main.a.e.S.b((byte)1);
                    return;
                }
                this.b("\u8bf7\u8f93\u5165\u201cOK\u201d \uff01");
                return;
            }
            if (!((String)object).equals("\u8fd4\u56de")) return;
            this.aD = null;
            this.d.a();
            return;
        }
        if (((String)object2).equals("\u8f93\u5165\u5151\u6362\u7801")) {
            object = object.getLabel();
            String string = this.aC.getString();
            if (((String)object).equals("\u786e\u5b9a") && string != null) {
                byte[] byArray = bz.q((short)4880, bt.ad, this.aC.getString());
                if (byArray != null) {
                    i.a(new w(4880, byArray));
                    this.a((String)null);
                    return;
                }
                this.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
                return;
            }
            if (!((String)object).equals("\u8fd4\u56de")) return;
            this.aD = null;
            this.d.a();
            return;
        }
        if (((String)object2).equals("\u53d1\u9001\u90ae\u4ef6") || ((String)object2).equals("\u56de\u590d\u90ae\u4ef6")) {
            object = object.getLabel();
            if (this.bY != 0) return;
            bt.O.a();
            bt.O.m = this.aD.getTitle();
            bt.O.n = this.aC == null ? "" : this.aC.getString().trim();
            bt.O.o = this.bL == null ? "" : this.bL.getString().trim();
            String string = bt.O.p = this.bM == null ? "" : this.bM.getString().trim();
            if (((String)object).equals("\u53d1\u9001")) {
                String string8 = null;
                string8 = ((String)object2).equals("\u56de\u590d\u90ae\u4ef6") ? this.bU.getText() : bt.O.o;
                e.a(bt.O.n, string8, bt.O.p, bt.O.d);
                this.d.a();
                return;
            }
            if (!((String)object).equals("\u9009\u62e9\u6536\u4ef6\u4eba")) {
                this.aD = null;
                this.d.a();
                return;
            }
            object = this;
            if (((a)object).bY != 0) return;
            ((a)object).aD = new Form("\u9009\u62e9\u6536\u4ef6\u4eba");
            if (bt.O.s == null || bt.O.s.length <= 0) {
                ((a)object).bS = new StringItem(null, "\u60a8\u7684\u597d\u53cb\u540d\u5355\u4e3a\u7a7a\uff0c\u8bf7\u76f4\u63a5\u8f93\u5165\u6536\u4ef6\u4eba\u6635\u79f0\uff0c\u6216\u6dfb\u52a0\u4e3a\u597d\u53cb\u540e\u4ece\u5217\u8868\u4e2d\u9009\u62e9\uff01");
                ((a)object).bQ = new Command("\u8fd4\u56de", 1, 5);
                ((a)object).aD.addCommand(((a)object).bQ);
                ((a)object).aD.append((Item)((a)object).bS);
            } else {
                ((a)object).bX = new ChoiceGroup("\u4ece\u597d\u53cb\u5217\u8868\u4e2d\u9009\u62e9\u6536\u4ef6\u4eba", 1, bt.O.s, null);
                ((a)object).bP = new Command("\u786e\u5b9a", 3, 0);
                ((a)object).bQ = new Command("\u8fd4\u56de", 1, 5);
                ((a)object).aD.addCommand(((a)object).bP);
                ((a)object).aD.addCommand(((a)object).bQ);
                ((a)object).aD.append((Item)((a)object).bX);
            }
            ((a)object).q.setCurrent((Displayable)((a)object).aD);
            ((a)object).aD.setCommandListener((CommandListener)object);
            return;
        }
        if (((String)object2).equals("\u9009\u62e9\u6536\u4ef6\u4eba")) {
            if (((String)(object = object.getLabel())).equals("\u786e\u5b9a")) {
                bt.O.o = bt.O.s[this.bX.getSelectedIndex()];
                bt.O.r = bt.O.t[this.bX.getSelectedIndex()];
            }
            this.a((byte)0, bt.O.m, bt.O.n, bt.O.o, bt.O.p == null ? "" : bt.O.p, bt.O.q, bt.O.r);
            return;
        }
        if (((String)object2).equals("\u90ae\u4ef6\u4e3e\u62a5")) {
            if (object.getLabel().equals("\u4e3e\u62a5")) {
                e.a(this.bW, this.aC.getString().trim(), bt.O.d);
                this.d.a();
                return;
            }
            this.aD = null;
            this.d.a();
            return;
        }
        if (!((String)object2).equals("\u8054\u7cfb\u5ba2\u670d")) {
            this.aD = null;
            this.d.a();
            return;
        }
        if (!object.getLabel().equals("\u786e\u5b9a")) {
            this.aD = null;
            this.d.a();
            return;
        }
        object = this.aC.getString().trim();
        if (((String)object).length() < 5) {
            this.b("\u4fe1\u606f\u957f\u5ea6\u4e0d\u8db3\uff0c\u4e0d\u80fd\u5c11\u4e8e5\u5b57\uff0c\u8bf7\u91cd\u65b0\u8f93\u5165");
            return;
        }
        e.a((String)object, ag.a[this.bX.getSelectedIndex()]);
        this.d.a();
    }

    private void J() {
        this.aJ = false;
        i = null;
        try {
            this.d.destroyApp(true);
        }
        catch (MIDletStateChangeException mIDletStateChangeException) {}
        this.d.notifyDestroyed();
    }

    /*
     * Unable to fully structure code
     */
    protected final void pointerPressed(int var1_1, int var2_2) {
        block26: {
            if (!t.o || this.aj == null) break block26;
            this.aj.e = var1_1;
            this.aj.f = var2_2;
            this.aA = 0;
            this.aj.a(this.aj.e, this.aj.f);
            var2_2 = this.aj.f;
            var1_1 = this.aj.e;
            this = this.aj;
            switch (this.b.j) {
                case 14: {
                    if (this.b.c != 0) ** GOTO lbl24
                    var5_3 = var2_2;
                    var4_6 = var1_1;
                    var3_9 = this.b;
                    for (var6_12 = 0; var6_12 < var3_9.bo.length; ++var6_12) {
                        if (var4_6 <= t.b - var3_9.bi.getWidth() >> 1 || var4_6 >= (t.b - var3_9.bi.getWidth() >> 1) + var3_9.bi.getWidth() || var5_3 <= (var3_9.bt << 1) + var3_9.bh.getHeight() + var6_12 * var3_9.bi.getHeight() || var5_3 >= (var3_9.bt << 1) + var3_9.bh.getHeight() + (var6_12 + 1) * var3_9.bi.getHeight()) continue;
                        var3_9.bs = var6_12;
                        var3_9.al = 0L;
                        v0 = 0x40000000;
                        ** GOTO lbl22
                    }
                    v0 = t.a == 1 && var4_6 >= t.b - t.i.stringWidth("\u9000\u51fa") - 4 && var4_6 <= t.b - 4 && var5_3 >= t.c - t.j - 4 && var5_3 <= t.c - 4 ? 0x20000000 : 0;
lbl22:
                    // 2 sources

                    this.b.a = v0;
                    return;
lbl24:
                    // 1 sources

                    this.b.a = ca.b(var1_1, var2_2);
                    return;
                }
                case 15: {
                    this.b.a = ca.b(var1_1, var2_2);
                    return;
                }
                case 19: {
                    this.b.a = ca.a(var1_1, var2_2);
                    return;
                }
                case 18: {
                    this.b.a = ca.a(var1_1, var2_2);
                    return;
                }
                case 16: {
                    this.b.a = ca.b(var1_1, var2_2);
                    return;
                }
                case 17: {
                    this.b.a = ca.b(var1_1, var2_2);
                    return;
                }
                case 10: {
                    if (this.b.aq == null) break;
                    this.b.a = this.b.aq.b(var1_1, var2_2);
                    return;
                }
                case 4: {
                    if (this.b.c == 0) {
                        if (this.b.aq == null) break;
                        this.b.a = this.b.aq.b(var1_1, var2_2);
                        return;
                    }
                    if (this.b.c != 2) break;
                    this.b.a = this.b.a(var1_1, var2_2);
                    return;
                }
                case 5: {
                    if (this.b.aq != null) {
                        this.b.a = this.b.aq.b(var1_1, var2_2);
                        var6_13 = var2_2;
                        var5_4 = var1_1;
                        var4_7 = this.b.a;
                        var3_10 = this.b;
                        if (var3_10.bC != null) {
                            for (var7_15 = 0; var7_15 < var3_10.bC.length; ++var7_15) {
                                if (var5_4 < var3_10.bC[var7_15][0] || var5_4 > var3_10.bC[var7_15][0] + var3_10.bC[var7_15][2] || var6_13 < var3_10.bC[var7_15][1] || var6_13 > var3_10.bC[var7_15][1] + var3_10.bC[var7_15][3]) continue;
                                var4_7 = (byte)(var7_15 % 2);
                                var5_4 = (byte)(var7_15 / 2);
                                if (var4_7 == var3_10.bz && var5_4 == var3_10.bA) {
                                    v1 = 0x40000000;
                                } else {
                                    var3_10.bz = (byte)var4_7;
                                    var3_10.bA = (byte)(var5_4 == 0);
                                    v1 = 4;
                                }
                                break;
                            }
                        } else {
                            v1 = this.b.a = var4_7;
                        }
                    }
                    if (this.b.c == 1) {
                        this.b.a = ca.c(var1_1, var2_2);
                        return;
                    }
                    if (this.b.c != 2) break;
                    ** GOTO lbl105
                }
                case 6: {
                    if (this.b.aq == null) break;
                    this.b.a = this.b.aq.b(var1_1, var2_2);
                    var6_14 = var2_2;
                    var5_5 = var1_1;
                    var4_8 = this.b.a;
                    var3_11 = this.b;
                    if (var3_11.bC == null) ** GOTO lbl99
                    for (var7_16 = 0; var7_16 < var3_11.bC.length; ++var7_16) {
                        if (var5_5 < var3_11.bC[var7_16][0] || var5_5 > var3_11.bC[var7_16][0] + var3_11.bC[var7_16][2] || var6_14 < var3_11.bC[var7_16][1] || var6_14 > var3_11.bC[var7_16][1] + var3_11.bC[var7_16][3]) continue;
                        if (var7_16 >= 2) ** GOTO lbl91
                        var3_11.bH = 0;
                        ** GOTO lbl97
lbl91:
                        // 1 sources

                        if (var7_16 >= 4) {
                            var3_11.bH = 2;
                            var3_11.bG = var7_16 % 2;
                            v2 = 0x40000000;
                        } else {
                            var3_11.bH = 1;
lbl97:
                            // 2 sources

                            v2 = var7_16 % 2 == 0 ? 8 : 2;
                        }
                        ** GOTO lbl100
                    }
lbl99:
                    // 2 sources

                    v2 = var4_8;
lbl100:
                    // 3 sources

                    this.b.a = v2;
                    return;
                }
                case 2: {
                    this.b.a = this.b.a(var1_1, var2_2);
                    return;
                }
lbl105:
                // 2 sources

                case 20: {
                    this.b.a = ca.b(var1_1, var2_2);
                }
            }
        }
    }

    protected final void pointerReleased(int n2, int n3) {
        if (t.o && this.aj != null) {
            this.aj.c = 0;
            this.aj.d = 0;
            this.b = 0;
            this.a = 0;
            this.aA = 0;
        }
    }

    protected final void pointerDragged(int n2, int n3) {
        if (t.o && this.aj != null && e != null) {
            if (com.yinhan.kjava.main.a.e.k == 0 && com.yinhan.kjava.main.a.e.J != null) {
                return;
            }
            switch (com.yinhan.kjava.main.a.e.k) {
                case 0: {
                    this.aj.d = 1;
                    this.aF = n2;
                    this.aG = n3;
                    return;
                }
                case 39: {
                    if (this.aj.c != 1) break;
                    this.aj.d = 1;
                    this.aF = n2;
                    this.aG = n3;
                }
            }
        }
    }

    public final void b(int n2, int n3) {
        Vector vector = new Vector();
        this.ca = com.yinhan.kjava.main.a.e.I.j / 16 + (com.yinhan.kjava.main.a.e.I.j % 16 == 0 ? 0 : 1);
        this.cb = com.yinhan.kjava.main.a.e.I.k / 16 + (com.yinhan.kjava.main.a.e.I.k % 16 == 0 ? 0 : 1);
        this.cc = (n2 -= 8) / 16 + (n2 % 16 == 0 ? 0 : 1);
        this.cd = (n3 -= 16) / 16 + (n3 % 16 == 0 ? 0 : 1);
        if (this.ca != this.cc || this.cb != this.cd) {
            for (int i2 = 0; i2 < com.yinhan.kjava.main.a.e.f.i.length; ++i2) {
                for (int i3 = 0; i3 < com.yinhan.kjava.main.a.e.f.i[i2].length; ++i3) {
                    if (com.yinhan.kjava.main.a.e.f.i[i2][i3] != 1 || n2 < i2 * com.yinhan.kjava.main.a.e.f.e - 15 || n2 >= i2 * com.yinhan.kjava.main.a.e.f.e + com.yinhan.kjava.main.a.e.f.e - 15 || n3 < i3 * com.yinhan.kjava.main.a.e.f.f - com.yinhan.kjava.main.a.e.f.f || n3 >= i3 * com.yinhan.kjava.main.a.e.f.f) continue;
                    return;
                }
            }
            vector = i.a().a(com.yinhan.kjava.main.a.e.f, vector, new bs(this.ca, this.cb), new bs(this.cc, this.cd));
            if (vector.isEmpty()) {
                return;
            }
            int n4 = vector.size();
            com.yinhan.kjava.main.a.e.I.c.removeAllElements();
            for (n2 = 0; n2 < n4; ++n2) {
                bs bs2 = (bs)vector.elementAt(n2);
                bs bs3 = n2 < n4 - 1 ? (bs)vector.elementAt(n2 + 1) : bs2;
                if (bs2.a != bs3.a) {
                    if (bs2.a > bs3.a) {
                        for (n3 = 0; n3 < 4; ++n3) {
                            com.yinhan.kjava.main.a.e.I.c.addElement(new short[]{(short)((bs2.a << 4) - (n3 << 2)), (short)(bs2.b << 4)});
                        }
                        continue;
                    }
                    for (n3 = 0; n3 < 4; ++n3) {
                        com.yinhan.kjava.main.a.e.I.c.addElement(new short[]{(short)((bs2.a << 4) + (n3 << 2)), (short)(bs2.b << 4)});
                    }
                    continue;
                }
                if (bs2.b == bs3.b) continue;
                if (bs2.b > bs3.b) {
                    for (n3 = 0; n3 < 4; ++n3) {
                        com.yinhan.kjava.main.a.e.I.c.addElement(new short[]{(short)(bs2.a << 4), (short)((bs2.b << 4) - (n3 << 2))});
                    }
                    continue;
                }
                for (n3 = 0; n3 < 4; ++n3) {
                    com.yinhan.kjava.main.a.e.I.c.addElement(new short[]{(short)(bs2.a << 4), (short)((bs2.b << 4) + (n3 << 2))});
                }
            }
        }
    }

    private void a(short s2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeShort(s2);
            this.a(byteArrayOutputStream.toByteArray(), "S");
            byteArrayOutputStream.close();
            dataOutputStream.close();
            return;
        }
        catch (IOException iOException) {
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void K() {
        RecordStore recordStore = null;
        try {
            DataInputStream dataInputStream;
            if (com.yinhan.kjava.main.a.j("S") && (dataInputStream = com.yinhan.kjava.main.a.a(recordStore = com.yinhan.kjava.main.a.a("S", false))) != null) {
                this.ce = 0;
                this.ce = dataInputStream.readShort();
                dataInputStream.close();
            }
            if (recordStore == null) return;
        }
        catch (Exception exception) {
            if (recordStore == null) return;
            try {
                recordStore.closeRecordStore();
                return;
            }
            catch (RecordStoreNotOpenException recordStoreNotOpenException) {
                return;
            }
            catch (RecordStoreException recordStoreException) {
                return;
            }
        }
        catch (Throwable throwable) {
            if (recordStore == null) throw throwable;
            try {
                recordStore.closeRecordStore();
                throw throwable;
            }
            catch (RecordStoreNotOpenException recordStoreNotOpenException) {
                throw throwable;
            }
            catch (RecordStoreException recordStoreException) {}
            throw throwable;
        }
        try {
            recordStore.closeRecordStore();
            return;
        }
        catch (RecordStoreNotOpenException recordStoreNotOpenException) {
            return;
        }
        catch (RecordStoreException recordStoreException) {
            return;
        }
    }

    public final void p() {
        this.aD = new Form("\u53d1\u5e03\u6c42\u7231\u5ba3\u8a00");
        this.aC = new TextField("\u6c42\u7231\u5ba3\u8a00\u4fdd\u755948\u5c0f\u65f6\uff0c\u8bf7\u8f93\u5165\u6c42\u7231\u4eba\u6635\u79f0\uff1a", null, 5, 0);
        this.bL = new TextField("\u8bf7\u8f93\u5165\u6c42\u7231\u5ba3\u8a00\uff0c\u4e0d\u8d85\u8fc7100\u5b57\uff1a", null, 100, 0);
        this.bM = new TextField("\u94f6\u4e24\u4e0d\u53ef\u4f4e\u4e8e10\u4e07\u4e24\uff0c\u94f6\u4e24\u8d8a\u591a\u6392\u4f4d\u8d8a\u9760\u524d\uff0c\u8bf7\u8f93\u5165\u94f6\u4e24\uff1a", null, 9, 2);
        this.bQ = new Command("\u8fd4\u56de", 8, 1);
        this.bP = new Command("\u786e\u5b9a", 2, 1);
        this.aD.addCommand(this.bP);
        this.aD.addCommand(this.bQ);
        this.aD.append((Item)this.aC);
        this.aD.append((Item)this.bL);
        this.aD.append((Item)this.bM);
        this.aD.setCommandListener((CommandListener)this);
        this.q.setCurrent((Displayable)this.aD);
    }

    public final void q() {
        ca.h = 0;
        this.j = (short)20;
        this.k = (short)20;
    }

    public final void c(String string, String string2) {
        new e(this, string, string2);
    }

    public static final Image c(int n2) {
        if (n2 == 1) {
            return aM;
        }
        return null;
    }

    public static final Image d(int n2) {
        if (n2 > 0 && n2 < 8) {
            return aL[n2 - 1];
        }
        return null;
    }

    private static Image k(String object) {
        try {
            return Image.createImage((String)object);
        }
        catch (IOException iOException) {
            object = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public final void r() {
        ca.A = 100;
        this.b();
        this.d.a();
    }

    static ChoiceGroup a(a a2) {
        return a2.bb;
    }

    static ChoiceGroup a(a a2, ChoiceGroup choiceGroup) {
        a2.bc = choiceGroup;
        return a2.bc;
    }

    static ChoiceGroup a(a a2, int n2) {
        return com.yinhan.kjava.main.a.e(n2);
    }

    static ChoiceGroup b(a a2) {
        return a2.bc;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static void c(a ajArray) {
        block22: {
            bf bf2;
            ac = new bu("/", "ui");
            ac.d();
            if (ac.b() == 0) {
                // empty if block
            }
            Object object = ajArray;
            ag = new bu("/", "publicUI");
            ag.d();
            if (ag.b() != 0) {
                int n2;
                ao.w = ag.a("money");
                ao.x = ag.a("goods");
                ao.C = ag.a("chat");
                ao.D = ag.a("elite");
                n = ag.a("num");
                ag.b("email");
                bf2 = ag.a("mail_2");
                object = bf2.d;
                for (n2 = 1; n2 < ((aj[])object).length; ++n2) {
                    Image image = Image.createImage((Image)bf2.a, (int)((aj)object[n2]).a, (int)((aj)object[n2]).b, (int)((aj)object[n2]).c, (int)((aj)object[n2]).d, (int)0);
                    if ((n2 & 1) == 0) {
                        be.e[n2 >> 2] = image;
                        continue;
                    }
                    bo.g[n2 >> 1] = image;
                }
                aa = com.yinhan.kjava.main.a.ag.a((String)"talk_01").a;
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
                y.a = v;
                y.b = u;
                y.c = r;
                y.d = z;
                y.e = x;
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
                R = new bf[8];
                for (n2 = 0; n2 < R.length; ++n2) {
                    com.yinhan.kjava.main.a.R[n2] = ag.a("equip_" + n2);
                }
                S = new bf[4];
                for (n2 = 0; n2 < S.length; ++n2) {
                    com.yinhan.kjava.main.a.S[n2] = ag.a("submenu_" + n2);
                }
                T = ag.a("button_ok");
                U = ag.a("button_back");
                V = ag.a("trigon_u");
                W = ag.a("trigon_d");
                X = ag.a("trigon_l");
                Y = ag.a("trigon_r");
                ao.r = ag.b("select");
                Z = ag.a("rim");
                ag.a("cursor");
                ag.a("scorebar");
                aL = new Image[7];
                for (n2 = 0; n2 < aL.length; ++n2) {
                    com.yinhan.kjava.main.a.aL[n2] = com.yinhan.kjava.main.a.ag.a((String)new StringBuffer().append((String)"chq-").append((int)(n2 + 1)).toString()).a;
                }
                aM = com.yinhan.kjava.main.a.k("/images/mz_1.png");
            }
            ab = new bu("/role/", "role");
            ah = new bu("/petfight/", "petfight");
            af = new bu("/icon/", "icon");
            object = ajArray;
            bf2 = null;
            try {
                if (com.yinhan.kjava.main.a.j(((a)object).aK) && (object = com.yinhan.kjava.main.a.a((RecordStore)(bf2 = com.yinhan.kjava.main.a.a(((a)object).aK, false)))) != null) {
                    bt.b = ((DataInputStream)object).readUTF();
                    bt.c = ((DataInputStream)object).readUTF();
                    ((FilterInputStream)object).close();
                }
                if (bf2 == null) break block22;
            }
            catch (Exception exception) {
                if (bf2 != null) {
                    try {
                        bf2.closeRecordStore();
                    }
                    catch (RecordStoreNotOpenException recordStoreNotOpenException) {
                    }
                    catch (RecordStoreException recordStoreException) {}
                }
                break block22;
            }
            catch (Throwable throwable) {
                if (bf2 == null) throw throwable;
                try {
                    bf2.closeRecordStore();
                    throw throwable;
                }
                catch (RecordStoreNotOpenException recordStoreNotOpenException) {
                    throw throwable;
                }
                catch (RecordStoreException recordStoreException) {}
                throw throwable;
            }
            try {
                bf2.closeRecordStore();
            }
            catch (RecordStoreNotOpenException recordStoreNotOpenException) {
            }
            catch (RecordStoreException recordStoreException) {}
        }
        ajArray.l = new StringBuffer();
        ajArray.aq = new m();
        ajArray.av = y.c();
        ajArray.ar = new c();
        ajArray.au = new l();
        ajArray.as = new n();
        ajArray.at = new an();
        f = new ai();
        if (t.o) {
            ajArray.aj = new f((a)ajArray, f);
        }
        ai.a();
        ajArray.c();
    }

    static {
        aL = null;
        aM = null;
        aa = null;
        ai = null;
        aN = new Vector();
        aO = new StringBuffer();
        bl = null;
        bv = false;
        am = null;
        an = null;
        ao = 0;
        ap = true;
        bK = 1;
        aB = (byte)2;
    }
}


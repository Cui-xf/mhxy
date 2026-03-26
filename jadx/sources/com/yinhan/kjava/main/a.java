package com.yinhan.kjava.main;

import defpackage.ag;
import defpackage.ai;
import defpackage.aj;
import defpackage.an;
import defpackage.ao;
import defpackage.av;
import defpackage.az;
import defpackage.bb;
import defpackage.bc;
import defpackage.be;
import defpackage.bf;
import defpackage.bo;
import defpackage.bq;
import defpackage.bs;
import defpackage.bt;
import defpackage.bu;
import defpackage.bw;
import defpackage.bz;
import defpackage.ca;
import defpackage.l;
import defpackage.m;
import defpackage.n;
import defpackage.t;
import defpackage.w;
import defpackage.y;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Vector;
import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.StringItem;
import javax.microedition.lcdui.TextField;
import javax.microedition.midlet.MIDletStateChangeException;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreNotOpenException;

/* loaded from: java版梦回西游3区251011.jar:com/yinhan/kjava/main/a.class */
public final class a extends Canvas implements Runnable, CommandListener {
    public int a;
    public int b;
    public MainMidlet d;
    public static ao e;
    public static ai f;
    private boolean aJ;
    public static av i;
    public short j;
    public short k;
    public StringBuffer l;
    public int m;
    public static bf n;
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
    public static bu ab;
    public static bu ac;
    public static bu ad;
    public static bu ae;
    public static bu af;
    public static bu ag;
    public static bu ah;
    public f aj;
    public long ak;
    private long aQ;
    private boolean aR;
    private bw aT;
    private int aV;
    private int aW;
    private int aX;
    private int aY;
    private int ba;
    private ChoiceGroup bb;
    private ChoiceGroup bc;
    private ChoiceGroup bd;
    private Image bj;
    private Image bk;
    private static bc bm;
    private static bc bn;
    private int[][] bp;
    private int[] bq;
    private int br;
    private int bt;
    private int bu;
    private bc[] bx;
    private bc[] by;
    private byte bz;
    private byte bA;
    public int ax;
    private byte bE;
    private byte bF;
    public boolean az;
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
    private static Image[] aL = null;
    private static Image aM = null;
    public static Image aa = null;
    public static c ai = null;
    private static Vector aN = new Vector();
    private static StringBuffer aO = new StringBuffer();
    private static bu bl = null;
    private static boolean bv = false;
    public static String am = null;
    public static String an = null;
    public static byte ao = 0;
    public static boolean ap = true;
    private static byte bK = 1;
    public static byte aB = 2;
    public short c = 0;
    public boolean g = false;
    public boolean h = false;
    private String aK = new StringBuffer().append("mhxy.zyy").append((int) t.r).append("_").append((int) t.s).toString();
    public boolean o = false;
    public boolean p = false;
    public long al = 0;
    private long aP = 0;
    private String aS = null;
    private boolean aU = false;
    private boolean aZ = false;
    private Image be = null;
    private Image bf = null;
    private Image bg = null;
    private Image bh = null;
    private Image bi = null;
    private String[] bo = null;
    private int bs = 0;
    private int bw = -1;
    public m aq = null;
    public defpackage.c ar = null;
    public n as = null;
    public an at = null;
    public l au = null;
    public y av = null;
    public int aw = 0;
    private int bB = 0;
    private int[][] bC = null;
    public String ay = "";
    private Image bD = null;
    private int bG = 0;
    private int bH = 0;
    public int aA = 0;
    private int bI = -1;
    private long bJ = 0;
    private byte bY = -1;

    public a(MainMidlet mainMidlet, Display display) {
        t.a(mainMidlet);
        setFullScreenMode(true);
        this.q = display;
        this.d = mainMidlet;
        ai = new c(mainMidlet, display);
        this.aJ = true;
        t.b = (short) getWidth();
        t.c = (short) getHeight();
        short s2 = t.b;
        t.d = s2;
        ao.a = s2;
        short s3 = t.c;
        t.e = s3;
        ao.b = s3;
        this.m = 10;
        if (t.b >= 240) {
            this.m = 8;
            short s4 = (short) ((t.b * 95) / 100);
            t.d = s4;
            ao.a = s4;
            short s5 = (short) ((t.c * (t.c > 320 ? (short) 80 : (short) 95)) / 100);
            t.e = s5;
            ao.b = s5;
            short s6 = (short) ((t.b - ao.a) / 2);
            ao.o = s6;
            t.f = s6;
            short s7 = (short) ((t.c - ao.b) / 2);
            ao.p = s7;
            t.g = s7;
        }
        y.c().a(t.f, t.g, t.d, t.e);
        y();
        new Thread(this).start();
    }

    public final void a() {
        ab.c();
        ae.c();
        af.c();
        ah.c();
        this.l = new StringBuffer();
        this.aq = new m();
        this.ar = new defpackage.c();
        this.au = new l();
        this.as = new n();
        this.at = new an();
    }

    public final void a(String str, String str2) {
        if (i == null) {
            i = new av();
        } else {
            a(str, (byte) 2);
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fb A[Catch: Exception -> 0x0c71, TryCatch #1 {Exception -> 0x0c71, blocks: (B:5:0x000e, B:7:0x0016, B:8:0x001c, B:10:0x0023, B:11:0x0027, B:13:0x008b, B:15:0x00a7, B:17:0x00b1, B:19:0x00c3, B:21:0x00cf, B:23:0x00d8, B:28:0x00eb, B:32:0x0102, B:34:0x010c, B:36:0x0116, B:38:0x0120, B:40:0x012a, B:138:0x036f, B:140:0x037f, B:142:0x0386, B:42:0x0130, B:44:0x0137, B:46:0x0144, B:47:0x014b, B:49:0x0157, B:51:0x015d, B:54:0x016d, B:56:0x0173, B:58:0x017f, B:60:0x018b, B:62:0x0191, B:63:0x019b, B:64:0x01a2, B:66:0x01a8, B:68:0x01ae, B:70:0x01b5, B:72:0x01c1, B:74:0x01cd, B:75:0x01d3, B:77:0x01da, B:79:0x01e6, B:81:0x01f2, B:82:0x01f8, B:84:0x01fe, B:86:0x020a, B:87:0x0215, B:89:0x021d, B:98:0x0250, B:100:0x0258, B:102:0x025f, B:104:0x0265, B:105:0x026c, B:106:0x0273, B:107:0x027a, B:109:0x0282, B:110:0x028d, B:112:0x0296, B:113:0x029d, B:115:0x02a6, B:116:0x02ad, B:118:0x02b6, B:120:0x02c1, B:121:0x02de, B:123:0x02e9, B:125:0x0306, B:127:0x0317, B:126:0x0310, B:128:0x032a, B:130:0x0335, B:131:0x034b, B:132:0x0352, B:134:0x035b, B:135:0x0362, B:137:0x036b, B:91:0x0225, B:93:0x022c, B:95:0x0232, B:96:0x023a, B:97:0x0245, B:53:0x0166, B:30:0x00fb, B:144:0x0399, B:146:0x03a2, B:148:0x03e4, B:149:0x040c, B:150:0x0413, B:151:0x041b, B:153:0x0424, B:155:0x042b, B:157:0x0435, B:158:0x0440, B:160:0x0447, B:161:0x0452, B:163:0x045c, B:165:0x0466, B:193:0x05b3, B:195:0x05bd, B:167:0x0470, B:169:0x0476, B:171:0x047d, B:173:0x0483, B:175:0x049b, B:177:0x04aa, B:183:0x0535, B:185:0x0559, B:186:0x0581, B:178:0x04ca, B:179:0x04ef, B:181:0x04fe, B:182:0x051e, B:187:0x058b, B:189:0x0591, B:190:0x059f, B:192:0x05a5, B:196:0x05c1, B:197:0x05c9, B:198:0x05d0, B:200:0x05d9, B:201:0x05e4, B:203:0x05ec, B:210:0x0610, B:212:0x0618, B:219:0x063d, B:221:0x0646, B:242:0x06c0, B:244:0x06c8, B:265:0x0745, B:267:0x074f, B:269:0x0774, B:293:0x084a, B:295:0x0851, B:297:0x0864, B:298:0x087c, B:270:0x078e, B:271:0x0799, B:273:0x07a3, B:275:0x07a9, B:276:0x07b4, B:278:0x07c9, B:279:0x07e4, B:280:0x07ef, B:282:0x07f9, B:284:0x0803, B:286:0x080b, B:288:0x0812, B:289:0x081b, B:291:0x082a, B:292:0x0843, B:246:0x06d2, B:248:0x06d9, B:252:0x06ee, B:251:0x06e8, B:253:0x0710, B:255:0x0718, B:259:0x0728, B:260:0x072f, B:264:0x073f, B:223:0x0650, B:225:0x0657, B:229:0x066b, B:228:0x0665, B:230:0x068d, B:232:0x0695, B:236:0x06a4, B:237:0x06ab, B:241:0x06ba, B:214:0x0622, B:218:0x0637, B:217:0x0631, B:205:0x05f6, B:209:0x060a, B:208:0x0604, B:299:0x0884, B:300:0x088b, B:302:0x0898, B:304:0x08c4, B:306:0x08cd, B:308:0x08d5, B:310:0x08de, B:312:0x08e7, B:319:0x0914, B:321:0x091c, B:323:0x0926, B:325:0x092e, B:332:0x095c, B:334:0x0966, B:336:0x0970, B:361:0x0a4b, B:363:0x0a55, B:365:0x0a5c, B:376:0x0aad, B:338:0x097a, B:340:0x0980, B:341:0x0984, B:342:0x09a0, B:344:0x09a8, B:346:0x09d9, B:347:0x09fa, B:350:0x0a07, B:352:0x0a0e, B:353:0x0a12, B:354:0x0a2c, B:356:0x0a32, B:357:0x0a39, B:358:0x0a3f, B:359:0x0a45, B:327:0x0938, B:329:0x0947, B:331:0x0956, B:314:0x08f1, B:316:0x08f9, B:318:0x090e, B:317:0x0907, B:366:0x0a70, B:368:0x0a78, B:370:0x0a82, B:373:0x0a9e, B:375:0x0aa8, B:372:0x0a8c, B:377:0x0ab5, B:379:0x0ac1, B:383:0x0ae3, B:380:0x0ad0, B:382:0x0ada, B:384:0x0aeb, B:386:0x0af7, B:388:0x0afd, B:390:0x0b03, B:393:0x0b11, B:397:0x0b3a, B:392:0x0b09, B:394:0x0b25, B:396:0x0b2f, B:398:0x0b42, B:400:0x0b4e, B:402:0x0b54, B:413:0x0b95, B:417:0x0bb0, B:403:0x0b5e, B:405:0x0b64, B:406:0x0b6e, B:408:0x0b74, B:409:0x0b7e, B:411:0x0b84, B:412:0x0b8e, B:414:0x0b9d, B:416:0x0ba7, B:418:0x0bb8, B:420:0x0bc3, B:427:0x0be8, B:429:0x0bf0, B:436:0x0c1d, B:438:0x0c27, B:441:0x0c3b, B:443:0x0c45, B:444:0x0c4e, B:440:0x0c31, B:431:0x0bfa, B:433:0x0c0a, B:435:0x0c17, B:434:0x0c14, B:422:0x0bcd, B:424:0x0bd7, B:426:0x0be2, B:445:0x0c53, B:447:0x0c59, B:449:0x0c68), top: B:467:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0102 A[Catch: Exception -> 0x0c71, TryCatch #1 {Exception -> 0x0c71, blocks: (B:5:0x000e, B:7:0x0016, B:8:0x001c, B:10:0x0023, B:11:0x0027, B:13:0x008b, B:15:0x00a7, B:17:0x00b1, B:19:0x00c3, B:21:0x00cf, B:23:0x00d8, B:28:0x00eb, B:32:0x0102, B:34:0x010c, B:36:0x0116, B:38:0x0120, B:40:0x012a, B:138:0x036f, B:140:0x037f, B:142:0x0386, B:42:0x0130, B:44:0x0137, B:46:0x0144, B:47:0x014b, B:49:0x0157, B:51:0x015d, B:54:0x016d, B:56:0x0173, B:58:0x017f, B:60:0x018b, B:62:0x0191, B:63:0x019b, B:64:0x01a2, B:66:0x01a8, B:68:0x01ae, B:70:0x01b5, B:72:0x01c1, B:74:0x01cd, B:75:0x01d3, B:77:0x01da, B:79:0x01e6, B:81:0x01f2, B:82:0x01f8, B:84:0x01fe, B:86:0x020a, B:87:0x0215, B:89:0x021d, B:98:0x0250, B:100:0x0258, B:102:0x025f, B:104:0x0265, B:105:0x026c, B:106:0x0273, B:107:0x027a, B:109:0x0282, B:110:0x028d, B:112:0x0296, B:113:0x029d, B:115:0x02a6, B:116:0x02ad, B:118:0x02b6, B:120:0x02c1, B:121:0x02de, B:123:0x02e9, B:125:0x0306, B:127:0x0317, B:126:0x0310, B:128:0x032a, B:130:0x0335, B:131:0x034b, B:132:0x0352, B:134:0x035b, B:135:0x0362, B:137:0x036b, B:91:0x0225, B:93:0x022c, B:95:0x0232, B:96:0x023a, B:97:0x0245, B:53:0x0166, B:30:0x00fb, B:144:0x0399, B:146:0x03a2, B:148:0x03e4, B:149:0x040c, B:150:0x0413, B:151:0x041b, B:153:0x0424, B:155:0x042b, B:157:0x0435, B:158:0x0440, B:160:0x0447, B:161:0x0452, B:163:0x045c, B:165:0x0466, B:193:0x05b3, B:195:0x05bd, B:167:0x0470, B:169:0x0476, B:171:0x047d, B:173:0x0483, B:175:0x049b, B:177:0x04aa, B:183:0x0535, B:185:0x0559, B:186:0x0581, B:178:0x04ca, B:179:0x04ef, B:181:0x04fe, B:182:0x051e, B:187:0x058b, B:189:0x0591, B:190:0x059f, B:192:0x05a5, B:196:0x05c1, B:197:0x05c9, B:198:0x05d0, B:200:0x05d9, B:201:0x05e4, B:203:0x05ec, B:210:0x0610, B:212:0x0618, B:219:0x063d, B:221:0x0646, B:242:0x06c0, B:244:0x06c8, B:265:0x0745, B:267:0x074f, B:269:0x0774, B:293:0x084a, B:295:0x0851, B:297:0x0864, B:298:0x087c, B:270:0x078e, B:271:0x0799, B:273:0x07a3, B:275:0x07a9, B:276:0x07b4, B:278:0x07c9, B:279:0x07e4, B:280:0x07ef, B:282:0x07f9, B:284:0x0803, B:286:0x080b, B:288:0x0812, B:289:0x081b, B:291:0x082a, B:292:0x0843, B:246:0x06d2, B:248:0x06d9, B:252:0x06ee, B:251:0x06e8, B:253:0x0710, B:255:0x0718, B:259:0x0728, B:260:0x072f, B:264:0x073f, B:223:0x0650, B:225:0x0657, B:229:0x066b, B:228:0x0665, B:230:0x068d, B:232:0x0695, B:236:0x06a4, B:237:0x06ab, B:241:0x06ba, B:214:0x0622, B:218:0x0637, B:217:0x0631, B:205:0x05f6, B:209:0x060a, B:208:0x0604, B:299:0x0884, B:300:0x088b, B:302:0x0898, B:304:0x08c4, B:306:0x08cd, B:308:0x08d5, B:310:0x08de, B:312:0x08e7, B:319:0x0914, B:321:0x091c, B:323:0x0926, B:325:0x092e, B:332:0x095c, B:334:0x0966, B:336:0x0970, B:361:0x0a4b, B:363:0x0a55, B:365:0x0a5c, B:376:0x0aad, B:338:0x097a, B:340:0x0980, B:341:0x0984, B:342:0x09a0, B:344:0x09a8, B:346:0x09d9, B:347:0x09fa, B:350:0x0a07, B:352:0x0a0e, B:353:0x0a12, B:354:0x0a2c, B:356:0x0a32, B:357:0x0a39, B:358:0x0a3f, B:359:0x0a45, B:327:0x0938, B:329:0x0947, B:331:0x0956, B:314:0x08f1, B:316:0x08f9, B:318:0x090e, B:317:0x0907, B:366:0x0a70, B:368:0x0a78, B:370:0x0a82, B:373:0x0a9e, B:375:0x0aa8, B:372:0x0a8c, B:377:0x0ab5, B:379:0x0ac1, B:383:0x0ae3, B:380:0x0ad0, B:382:0x0ada, B:384:0x0aeb, B:386:0x0af7, B:388:0x0afd, B:390:0x0b03, B:393:0x0b11, B:397:0x0b3a, B:392:0x0b09, B:394:0x0b25, B:396:0x0b2f, B:398:0x0b42, B:400:0x0b4e, B:402:0x0b54, B:413:0x0b95, B:417:0x0bb0, B:403:0x0b5e, B:405:0x0b64, B:406:0x0b6e, B:408:0x0b74, B:409:0x0b7e, B:411:0x0b84, B:412:0x0b8e, B:414:0x0b9d, B:416:0x0ba7, B:418:0x0bb8, B:420:0x0bc3, B:427:0x0be8, B:429:0x0bf0, B:436:0x0c1d, B:438:0x0c27, B:441:0x0c3b, B:443:0x0c45, B:444:0x0c4e, B:440:0x0c31, B:431:0x0bfa, B:433:0x0c0a, B:435:0x0c17, B:434:0x0c14, B:422:0x0bcd, B:424:0x0bd7, B:426:0x0be2, B:445:0x0c53, B:447:0x0c59, B:449:0x0c68), top: B:467:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0130 A[Catch: Exception -> 0x0c71, TryCatch #1 {Exception -> 0x0c71, blocks: (B:5:0x000e, B:7:0x0016, B:8:0x001c, B:10:0x0023, B:11:0x0027, B:13:0x008b, B:15:0x00a7, B:17:0x00b1, B:19:0x00c3, B:21:0x00cf, B:23:0x00d8, B:28:0x00eb, B:32:0x0102, B:34:0x010c, B:36:0x0116, B:38:0x0120, B:40:0x012a, B:138:0x036f, B:140:0x037f, B:142:0x0386, B:42:0x0130, B:44:0x0137, B:46:0x0144, B:47:0x014b, B:49:0x0157, B:51:0x015d, B:54:0x016d, B:56:0x0173, B:58:0x017f, B:60:0x018b, B:62:0x0191, B:63:0x019b, B:64:0x01a2, B:66:0x01a8, B:68:0x01ae, B:70:0x01b5, B:72:0x01c1, B:74:0x01cd, B:75:0x01d3, B:77:0x01da, B:79:0x01e6, B:81:0x01f2, B:82:0x01f8, B:84:0x01fe, B:86:0x020a, B:87:0x0215, B:89:0x021d, B:98:0x0250, B:100:0x0258, B:102:0x025f, B:104:0x0265, B:105:0x026c, B:106:0x0273, B:107:0x027a, B:109:0x0282, B:110:0x028d, B:112:0x0296, B:113:0x029d, B:115:0x02a6, B:116:0x02ad, B:118:0x02b6, B:120:0x02c1, B:121:0x02de, B:123:0x02e9, B:125:0x0306, B:127:0x0317, B:126:0x0310, B:128:0x032a, B:130:0x0335, B:131:0x034b, B:132:0x0352, B:134:0x035b, B:135:0x0362, B:137:0x036b, B:91:0x0225, B:93:0x022c, B:95:0x0232, B:96:0x023a, B:97:0x0245, B:53:0x0166, B:30:0x00fb, B:144:0x0399, B:146:0x03a2, B:148:0x03e4, B:149:0x040c, B:150:0x0413, B:151:0x041b, B:153:0x0424, B:155:0x042b, B:157:0x0435, B:158:0x0440, B:160:0x0447, B:161:0x0452, B:163:0x045c, B:165:0x0466, B:193:0x05b3, B:195:0x05bd, B:167:0x0470, B:169:0x0476, B:171:0x047d, B:173:0x0483, B:175:0x049b, B:177:0x04aa, B:183:0x0535, B:185:0x0559, B:186:0x0581, B:178:0x04ca, B:179:0x04ef, B:181:0x04fe, B:182:0x051e, B:187:0x058b, B:189:0x0591, B:190:0x059f, B:192:0x05a5, B:196:0x05c1, B:197:0x05c9, B:198:0x05d0, B:200:0x05d9, B:201:0x05e4, B:203:0x05ec, B:210:0x0610, B:212:0x0618, B:219:0x063d, B:221:0x0646, B:242:0x06c0, B:244:0x06c8, B:265:0x0745, B:267:0x074f, B:269:0x0774, B:293:0x084a, B:295:0x0851, B:297:0x0864, B:298:0x087c, B:270:0x078e, B:271:0x0799, B:273:0x07a3, B:275:0x07a9, B:276:0x07b4, B:278:0x07c9, B:279:0x07e4, B:280:0x07ef, B:282:0x07f9, B:284:0x0803, B:286:0x080b, B:288:0x0812, B:289:0x081b, B:291:0x082a, B:292:0x0843, B:246:0x06d2, B:248:0x06d9, B:252:0x06ee, B:251:0x06e8, B:253:0x0710, B:255:0x0718, B:259:0x0728, B:260:0x072f, B:264:0x073f, B:223:0x0650, B:225:0x0657, B:229:0x066b, B:228:0x0665, B:230:0x068d, B:232:0x0695, B:236:0x06a4, B:237:0x06ab, B:241:0x06ba, B:214:0x0622, B:218:0x0637, B:217:0x0631, B:205:0x05f6, B:209:0x060a, B:208:0x0604, B:299:0x0884, B:300:0x088b, B:302:0x0898, B:304:0x08c4, B:306:0x08cd, B:308:0x08d5, B:310:0x08de, B:312:0x08e7, B:319:0x0914, B:321:0x091c, B:323:0x0926, B:325:0x092e, B:332:0x095c, B:334:0x0966, B:336:0x0970, B:361:0x0a4b, B:363:0x0a55, B:365:0x0a5c, B:376:0x0aad, B:338:0x097a, B:340:0x0980, B:341:0x0984, B:342:0x09a0, B:344:0x09a8, B:346:0x09d9, B:347:0x09fa, B:350:0x0a07, B:352:0x0a0e, B:353:0x0a12, B:354:0x0a2c, B:356:0x0a32, B:357:0x0a39, B:358:0x0a3f, B:359:0x0a45, B:327:0x0938, B:329:0x0947, B:331:0x0956, B:314:0x08f1, B:316:0x08f9, B:318:0x090e, B:317:0x0907, B:366:0x0a70, B:368:0x0a78, B:370:0x0a82, B:373:0x0a9e, B:375:0x0aa8, B:372:0x0a8c, B:377:0x0ab5, B:379:0x0ac1, B:383:0x0ae3, B:380:0x0ad0, B:382:0x0ada, B:384:0x0aeb, B:386:0x0af7, B:388:0x0afd, B:390:0x0b03, B:393:0x0b11, B:397:0x0b3a, B:392:0x0b09, B:394:0x0b25, B:396:0x0b2f, B:398:0x0b42, B:400:0x0b4e, B:402:0x0b54, B:413:0x0b95, B:417:0x0bb0, B:403:0x0b5e, B:405:0x0b64, B:406:0x0b6e, B:408:0x0b74, B:409:0x0b7e, B:411:0x0b84, B:412:0x0b8e, B:414:0x0b9d, B:416:0x0ba7, B:418:0x0bb8, B:420:0x0bc3, B:427:0x0be8, B:429:0x0bf0, B:436:0x0c1d, B:438:0x0c27, B:441:0x0c3b, B:443:0x0c45, B:444:0x0c4e, B:440:0x0c31, B:431:0x0bfa, B:433:0x0c0a, B:435:0x0c17, B:434:0x0c14, B:422:0x0bcd, B:424:0x0bd7, B:426:0x0be2, B:445:0x0c53, B:447:0x0c59, B:449:0x0c68), top: B:467:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0c97 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:470:0x0c9e A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v18, types: [long] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 3268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yinhan.kjava.main.a.run():void");
    }

    /* JADX WARN: Not initialized variable reg: 0, insn: 0x075b: INVOKE (r0 I:java.lang.Throwable) VIRTUAL call: java.lang.Throwable.printStackTrace():void A[MD:():void (c)], block:B:108:0x075a */
    protected final void paint(Graphics graphics) {
        Throwable thPrintStackTrace;
        try {
            if (this.j == 9) {
                graphics.setColor(0);
                graphics.fillRect(0, 0, t.b, t.c);
            }
            graphics.setClip(0, 0, t.b, t.c);
            graphics.setFont(t.i);
        } catch (Exception e2) {
            thPrintStackTrace.printStackTrace();
        }
        if (this.p) {
            ca.b(graphics);
            return;
        }
        if (this.aJ) {
            switch (this.j) {
                case 0:
                    ca.a(graphics, this.bf);
                    break;
                case 1:
                    if (e != null) {
                        e.a(graphics);
                    } else if (this.k == 9) {
                        b(graphics);
                    } else if (this.k == 14 || this.k == 3) {
                        d(graphics);
                    } else if (this.k == 4) {
                        e(graphics);
                    } else if (this.k == 5) {
                        f(graphics);
                    }
                    ca.b(graphics);
                    break;
                case 2:
                    if (this.aS != null && this.aS.startsWith("系统异常")) {
                        a(graphics);
                        break;
                    } else {
                        if (e != null) {
                            e.a(graphics);
                        }
                        a(graphics);
                        break;
                    }
                    break;
                case 3:
                    d(graphics);
                    break;
                case 4:
                    e(graphics);
                    break;
                case 5:
                    f(graphics);
                    break;
                case 6:
                    c(graphics);
                    if (this.aq != null) {
                        this.aq.a(graphics);
                        ca.a(graphics, this.aq.a + 5, this.aq.b + 32, this.aq.c - 11, this.aq.a(t.e <= 240 ? (this.bB * 3) + 6 : 150), 1);
                        ca.b(graphics, this.aq.a + 80, this.aq.b + 35, this.aq.a + 80, ((this.aq.b + 35) + this.aq.a(t.e <= 240 ? (this.bB * 3) + 6 : 150)) - 5);
                        graphics.setColor(2176196);
                        int iStringWidth = t.i.stringWidth(t.G[0]);
                        int i2 = this.aq.b + 45;
                        int i3 = this.aq.a + 5 + 80 + ((((this.aq.c - 80) - 13) - iStringWidth) / 2);
                        graphics.drawString(t.G[this.bE], this.bE == 2 ? i3 + (t.k / 2) : i3, i2, 20);
                        graphics.drawImage(X.a, i3 - 20, i2, 20);
                        a(0, i3 - 20, i2, X.b, X.c);
                        graphics.drawImage(Y.a, i3 + iStringWidth + 15, i2, 20);
                        a(1, i3 + iStringWidth + 15, i2, Y.b, Y.c);
                        graphics.drawString(this.bF == 0 ? "男" : "女", this.aq.a + 5 + 80 + ((((this.aq.c - 80) - 13) - t.k) / 2), i2 + t.j + 10, 20);
                        graphics.drawImage(X.a, i3 - 20, i2 + t.j + 10, 20);
                        a(2, i3 - 20, i2 + t.j + 10, X.b, X.c);
                        graphics.drawImage(Y.a, i3 + iStringWidth + 15, i2 + t.j + 10, 20);
                        a(3, i3 + iStringWidth + 15, i2 + t.j + 10, X.b, X.c);
                        graphics.drawString("昵称：", this.aq.a + 5 + 80 + 5, i2 + ((t.j + 10) << 1), 20);
                        ca.c(graphics, this.aq.a + 5 + 80 + 5, (i2 + ((t.j + 10) * 3)) - 1, ((this.aq.c - 80) - this.bD.getWidth()) - 20, t.j, 0);
                        ca.a(graphics, this.ay, this.aq.a + 5 + 80 + 5 + 2, i2 + ((t.j + 10) * 3), 20, 16711639);
                        graphics.drawImage(this.bD, (this.aq.a + this.aq.c) - 8, i2 + ((t.j + 10) * 3), 24);
                        a(4, this.aq.a + 5 + 80 + 5, i2 + ((t.j + 10) * 3), ((this.aq.c - 80) - this.bD.getWidth()) - 20, t.j);
                        a(5, ((this.aq.a + this.aq.c) - 8) - this.bD.getWidth(), i2 + ((t.j + 10) * 3), this.bD.getWidth(), this.bD.getHeight());
                        graphics.setColor(16711680);
                        if (this.bH == 0) {
                            graphics.drawRect(i3, i2, iStringWidth, t.j);
                        } else if (this.bH == 1) {
                            graphics.drawRect(this.aq.a + 5 + 80 + ((((this.aq.c - 80) - 13) - t.k) / 2), i2 + t.j + 10, t.k, t.j);
                        } else if (this.bG == 0) {
                            graphics.drawRect(this.aq.a + 5 + 80 + 5, (i2 + ((t.j + 10) * 3)) - 1, ((this.aq.c - 80) - this.bD.getWidth()) - 20, t.j);
                        } else {
                            graphics.drawRect(((this.aq.a + this.aq.c) - 8) - this.bD.getWidth(), i2 + ((t.j + 10) * 3), this.bD.getWidth(), this.bD.getHeight());
                        }
                        if (this.bx != null && this.bx[(this.bF * 3) + this.bE] != null) {
                            f.a(graphics, this.bx[(this.bF * 3) + this.bE], (int[]) null, 0, 0, this.aq.a + 40 + 5, this.aq.b + 32 + this.bx[(this.bF * 3) + this.bE].j() + ((this.aq.a(t.e <= 240 ? (this.bB << 1) + 6 : 120) - this.bx[(this.bF * 3) + this.bE].j()) / 2), 20, 0);
                        }
                    }
                    break;
                case 7:
                    e.a(graphics);
                    break;
                case 9:
                    b(graphics);
                    break;
                case 14:
                    d(graphics);
                    break;
                case 15:
                    c(graphics);
                    if (t.a != 0) {
                        if (t.a != 1) {
                            ca.a(graphics, "更多精彩游戏尽在当乐网\t(d.cn)", new String[]{"更多", "返回"});
                            break;
                        } else {
                            ca.a(graphics, "更多精彩游戏尽在一哥哥网游戏频道\t(3g.01234.com.cn)", new String[]{"更多", "返回"});
                            break;
                        }
                    } else {
                        ca.a(graphics, "更多精彩游戏尽在腾讯游戏频道\t(3g.qq.com)", new String[]{"更多", "退出"});
                        break;
                    }
                case 16:
                    d(graphics);
                    ca.a(graphics, "确认退出？", new String[]{"确认", "返回"});
                    break;
                case 17:
                    d(graphics);
                    if (!t.x) {
                        if (!t.z) {
                            if (!t.A) {
                                if (!t.C) {
                                    ca.a(graphics, "更多精彩游戏尽在一哥哥网游戏频道\t(3g.01234.com.cn)", new String[]{"更多", "退出"});
                                    break;
                                } else {
                                    ca.a(graphics, "更多精彩游戏尽在http://haxiang.cn", new String[]{"更多", "退出"});
                                    break;
                                }
                            } else {
                                ca.a(graphics, "更多精彩游戏尽在http://g.uc.cn", new String[]{"更多", "退出"});
                                break;
                            }
                        } else {
                            ca.a(graphics, "更多精彩游戏尽在九游网游戏频道\t(http://9Game.CN/Url.Aspx?id=219)", new String[]{"更多", "退出"});
                            break;
                        }
                    } else {
                        ca.a(graphics, "是否进入当乐梦回西游论坛\t(http://zt.d.cn/a091111_netgame_forum_promotion/index.pih?fid=6724&cid=269)", new String[]{"进入", "退出"});
                        break;
                    }
                case 20:
                    c(graphics);
                    ca.a(graphics, aH, new String[]{"下载", "取消"});
                    break;
            }
        }
    }

    public final void a(Exception exc, byte b) {
        exc.printStackTrace();
        if (e != null) {
            e.c = false;
            e.Y = -1;
            ao.R();
            if (e.g != null) {
                e.g.l();
            }
            ao aoVar = e;
            e.k = (short) 0;
            aoVar.j = (short) 0;
            this.k = (short) 7;
            this.j = (short) 7;
        }
        bt.H = null;
        bt.M = null;
        bt.I = null;
        bt.N = null;
        bt.as = (short) -1;
        this.p = false;
        if (b == 1) {
            b(new StringBuffer().append("系统异常<").append((int) b).append(">").toString());
        }
    }

    public final void b() {
        repaint();
        serviceRepaints();
    }

    public static void a(byte b, byte b2, byte b3, byte b4, String str, short s2, short s3, short s4) {
        aN.removeAllElements();
        if (b3 == 5) {
            aN.addElement(a(b, b2, (byte) 1, b4, false, str));
            aN.addElement(a(b, b2, (byte) 3, b4, false, str));
            aN.addElement(a(b, b2, (byte) 3, b4, true, str));
            aN.addElement(a(b, b2, (byte) 0, b4, false, str));
            aN.addElement(a(b, b2, (byte) 0, b4, true, str));
            aN.addElement(a(b, b2, (byte) 2, b4, false, str));
            aN.addElement(a(b, b2, (byte) 2, b4, true, str));
        } else {
            aN.addElement(a(b, b2, b3, b4, false, str));
        }
        for (int i2 = 0; i2 < aN.size(); i2++) {
            ab.b((String) aN.elementAt(i2), s2, s3, s4);
        }
        aN.removeAllElements();
    }

    public static String a(byte b, byte b2, byte b3, byte b4, boolean z2) {
        if (t.m == 2) {
            b4 = 0;
        }
        return new StringBuffer().append("").append(t.V[b]).append(t.W[b2]).append((int) b4).append(t.X[b3]).append(z2 ? "4" : "").toString();
    }

    public static String a(byte b, byte b2, byte b3, byte b4, boolean z2, String str) {
        if (t.m == 2) {
            b4 = 0;
        }
        if (!t.p) {
            return new StringBuffer().append("").append(t.V[b]).append(t.W[b2]).append((int) b4).append(t.X[b3]).append(z2 ? "4" : "").toString();
        }
        aO.delete(0, aO.length());
        aO.append("");
        aO.append(str);
        aO.append(t.V[b]);
        aO.append(t.W[b2]);
        aO.append((int) b4);
        aO.append(t.X[b3]);
        aO.append(z2 ? "4" : "");
        return aO.toString();
    }

    public final void a(String str) {
        int i2 = (t.b * 6) / 11;
        int i3 = i2;
        if (i2 < 110) {
            i3 = 110;
        } else if (i3 > 160) {
            i3 = 160;
        }
        ca.a((t.b - i3) / 2, (t.c / 2) + 15, i3, 20, str);
        this.aP = this.ak;
        this.j = (short) 1;
    }

    public final void b(String str) {
        if (this.aS != null && this.aS.startsWith("系统异常")) {
            t();
        }
        if (str != null && str.startsWith("系统异常")) {
            this.aS = str;
        }
        if (bt.bs == 1 && bt.s == 0 && bt.eC != null && bt.eC.startsWith("队伍成员位置信息不一致")) {
            e.S();
            bt.eC = null;
            i();
            return;
        }
        bt.eC = str;
        this.aT = new bw(bt.eC, (short) (t.b - 20));
        if (e == null || e.k != 25) {
            setFullScreenMode(true);
            this.d.b.setCurrent(this);
        }
        this.aQ = this.ak;
        this.aR = true;
        if (this.aT != null) {
            this.aX = 0;
            this.aX = this.aT.a;
            this.aX = this.aX + 20 > t.b ? t.b : this.aX + 20;
            if (this.aX < (t.b * 5) / 7) {
                this.aX = (t.b * 5) / 7;
            }
            this.aV = (t.b - this.aX) / 2;
            this.aY = (this.aT.a() * t.j) + 14;
            this.aW = (t.c - this.aY) / 2;
        }
        this.j = (short) 2;
        if (!t.o || this.aj == null) {
            return;
        }
        this.aj.e = -1;
        this.aj.f = -1;
    }

    public final void a(boolean z2) {
        this.aR = false;
    }

    private void t() {
        if (e == null) {
            y();
        } else {
            e.h((byte) 1);
            a((String) null);
        }
        this.aS = null;
    }

    public final int a(int i2, int i3) {
        return (i2 < this.aV || i2 > this.aV + this.aX || i3 < this.aW || i3 > this.aW + this.aY) ? 536870912 : 0;
    }

    private void a(Graphics graphics) {
        if (u()) {
            return;
        }
        ca.a(graphics, this.aV, this.aW, this.aX, this.aY);
        if (this.aT != null) {
            this.aT.a(graphics, t.b / 2, this.aW + 7);
        }
    }

    private static boolean u() {
        return bt.eC != null && bt.eC.equals("数据更新失败:");
    }

    public static void a(String str, byte b) {
        av.i = b;
        if (b == 2) {
            av.b = str;
        } else {
            av.a = str;
        }
    }

    private void b(String str, byte b) {
        a(str == null ? b == 2 ? "socket://120.78.151.213:20008" : "http://117.135.138.130:7099" : str, b);
        if (t.w) {
            v();
        } else {
            this.aD = new Form("登陆游戏");
            this.bP = new Command("登陆", 4, 1);
            this.bQ = new Command("返回", 2, 1);
            this.bN = new TextField("帐号:", bt.b, 20, 0);
            this.bO = new TextField("密码:", bt.c, 20, 65536);
            this.aD.addCommand(this.bP);
            this.aD.addCommand(this.bQ);
            this.aD.append(this.bN);
            this.aD.append(this.bO);
            this.aD.setCommandListener(this);
            this.q.setCurrent(this.aD);
        }
        this.j = (short) 3;
        this.k = (short) 3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [javax.microedition.rms.RecordStore] */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Throwable] */
    private void v() {
        t.w = false;
        ?? J2 = j("dcn_user_info.db");
        if (J2 != 0) {
            try {
                RecordStore recordStoreA = a("dcn_user_info.db", false);
                DataInputStream dataInputStreamA = a(recordStoreA);
                if (dataInputStreamA != null) {
                    t.w = dataInputStreamA.readBoolean();
                    this.ba = dataInputStreamA.readByte();
                    bb.k = dataInputStreamA.readBoolean();
                    bt.b = dataInputStreamA.readUTF();
                    bt.c = dataInputStreamA.readUTF();
                    dataInputStreamA.close();
                }
                if (recordStoreA != null) {
                    J2 = recordStoreA;
                    J2.closeRecordStore();
                }
            } catch (Exception e2) {
                J2.printStackTrace();
            } catch (RecordStoreException e3) {
                J2.printStackTrace();
            }
        }
        this.aD = new Form(t.w ? "登录当乐通行证" : "登录一哥哥通行证");
        this.bb = new ChoiceGroup((String) null, 1);
        this.bb.append("官方帐号登录", (Image) null);
        this.bb.append("当乐帐号登录", (Image) null);
        this.bc = e(t.w ? 1 : 0);
        this.bd = new ChoiceGroup((String) null, 2, new String[]{"记住密码"}, (Image[]) null);
        this.bN = new TextField("帐  号:", (String) null, 16, 0);
        this.bO = new TextField("密  码:", (String) null, 16, 65536);
        if (bb.k) {
            this.bb.setSelectedIndex(t.w ? 1 : 0, true);
            this.bc.setSelectedIndex(this.ba, true);
            this.bd.setSelectedIndex(0, true);
            this.bN.setString(bt.b);
            this.bO.setString(bt.c);
        }
        this.aD.setItemStateListener(new d(this));
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

    private static ChoiceGroup e(int i2) {
        return new ChoiceGroup("方式", 4, i2 == 1 ? new String[]{"乐乐号", "用户名"} : new String[]{"用户名", "手机号", "ID"}, (Image[]) null);
    }

    private void w() {
        if (bv) {
            return;
        }
        x();
        this.bj = k("/images/light_0.png");
        this.bk = k("/images/light_1.png");
        int i2 = t.b / 9;
        this.bq = new int[8];
        for (int i3 = 0; i3 < this.bq.length; i3++) {
            this.bq[i3] = i2 * (i3 + 1);
        }
        this.bp = new int[8][5];
        for (int i4 = 0; i4 < this.bp.length; i4++) {
            for (int i5 = 0; i5 < this.bp[i4].length; i5++) {
                this.bp[i4] = z();
            }
        }
        if (bl == null) {
            bu buVar = new bu("/", "cartoon");
            bl = buVar;
            buVar.d();
            if (bl.b() != 0) {
                bm = bl.b("hudie");
                bn = bl.b("hudie_2");
            }
        }
        this.bh = k(new StringBuffer().append("/images/").append(t.c <= 220 ? "logoTitle_M.png" : "logoTitle_B.png").toString());
        this.bg = k("/images/menuBG.png");
        this.bi = k("/images/menuItem.png");
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
        if ("mhxy060".equals(t.v)) {
            this.be = k("/jy_logo.png");
        } else {
            this.be = k("/logo.png");
        }
        this.bf = k("/images/loading.png");
        this.al = 0L;
        this.j = (short) 9;
        this.k = (short) 9;
        b();
    }

    private void b(Graphics graphics) {
        if (this.al < 260) {
            this.al = 260L;
        }
        if (this.al >= 260) {
            graphics.setColor(0);
            graphics.fillRect(0, 0, t.b, t.c);
            graphics.drawImage(this.be, (t.b - this.be.getWidth()) >> 1, (t.c - this.be.getHeight()) >> 1, 20);
            this.bu = (int) (515 - this.al > 0 ? 515 - this.al : 0L);
            ca.a(graphics, 0, this.bu, (t.b - this.be.getWidth()) >> 1, (t.c - this.be.getHeight()) >> 1, this.be.getWidth(), this.be.getHeight());
            this.al += 5;
        }
    }

    public final void c() {
        bz.a = (byte) 90;
        w();
        if (t.a == 0) {
            this.bo = new String[]{"进入游戏", "更多游戏", "退出游戏"};
        } else if (t.a == 1) {
            this.bo = new String[]{"登陆游戏", "注册游戏", "修改密码"};
        }
        this.c = (short) 0;
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
                    this.c = (short) 1;
                }
            }
            if (an == null) {
                an = "";
            }
            if (bz.b != 72) {
                s();
                i = null;
            }
        } else if (bz.c != 162) {
            bz.c = 162;
            s();
        }
        bt.O();
        A();
        this.al = 8L;
        this.bs = 0;
        this.j = (short) 14;
        this.k = (short) 14;
    }

    private void c(Graphics graphics) {
        this.bt = t.c <= 240 ? 2 : ((t.c - this.bh.getHeight()) - (this.bi.getHeight() * 7)) / 3;
        if (this.bg != null) {
            graphics.drawImage(this.bg, (t.b - this.bg.getWidth()) >> 1, (t.c - this.bg.getHeight()) >> 1, 20);
        }
        if (this.bh != null) {
            graphics.drawImage(this.bh, (t.b - this.bh.getWidth()) >> 1, this.bt, 20);
        }
        if (bm != null) {
            ai.a(bm, this.ak);
            f.a(graphics, bm, (int[]) null, 0, 0, t.b - 100, t.c - 100, 0, 0);
        }
        if (bn != null) {
            ai.a(bn, this.ak);
            f.a(graphics, bn, (int[]) null, 0, 0, t.b - 100, t.c - 100, 0, 0);
        }
        if (this.bj == null || this.bk == null || this.bp == null) {
            return;
        }
        for (int i2 = 0; i2 < this.bp.length; i2++) {
            for (int i3 = 0; i3 < this.bp[i2].length; i3++) {
                if (this.bp[i2][0] < 0 || this.bp[i2][0] > t.b || this.bp[i2][1] < 0) {
                    this.bp[i2] = z();
                } else if ((this.br & 1) == 0) {
                    this.bp[i2][0] = this.bp[i2][0] + (ca.f(10, 40) % 2 == 0 ? -this.bp[i2][2] : this.bp[i2][2]);
                    this.bp[i2][1] = this.bp[i2][1] - this.bp[i2][3];
                }
                graphics.drawImage(this.bp[i2][4] == 0 ? this.bj : this.bk, this.bp[i2][0], this.bp[i2][1], 20);
            }
        }
        this.br++;
    }

    private int[] z() {
        return new int[]{this.bq[ca.f(1, 100) % 8], t.c + ca.f(1, 200), 1, 1, ca.f(1, 100) % 2};
    }

    private void d(Graphics graphics) {
        c(graphics);
        ca.a(graphics, t.t, 5, t.c - 3, 36, 6160358, 335925);
        if (t.a == 1) {
            ca.a(graphics, "退出", t.b - 5, t.c - 3, 40, 16777215, 335925);
        }
        for (int i2 = 0; i2 < this.bo.length; i2++) {
            if (i2 == this.bs) {
                graphics.drawImage(this.bi, (t.b - this.bi.getWidth()) >> 1, (this.bt << 1) + this.bh.getHeight() + (i2 * this.bi.getHeight()), 20);
            }
            ca.a(graphics, this.bo[i2], t.b >> 1, (this.bt << 1) + this.bh.getHeight() + (i2 * this.bi.getHeight()) + ((this.bi.getHeight() - t.j) / 2), 17, 16777215, 335925);
        }
        if (this.c == 1) {
            ca.a(graphics, "当前没有账号信息，是否自动注册？", new String[]{"确定", "返回"});
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(String str) {
        try {
            this.d.platformRequest(str);
            G();
        } catch (ConnectionNotFoundException e2) {
            printStackTrace();
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
        if (bt.hE != null) {
            K();
            for (int i2 = 0; i2 < bt.hE.length; i2++) {
                if (bt.hE[i2] == this.ce && i2 != 0) {
                    String str = bt.hA[i2];
                    String str2 = bt.hB[i2];
                    String str3 = bt.hC[i2];
                    short s2 = bt.hE[i2];
                    String str4 = bt.hF[i2];
                    for (int i3 = i2; i3 > 0; i3--) {
                        bt.hA[i3] = bt.hA[i3 - 1];
                        bt.hB[i3] = bt.hB[i3 - 1];
                        bt.hC[i3] = bt.hC[i3 - 1];
                        bt.hE[i3] = bt.hE[i3 - 1];
                        bt.hF[i3] = bt.hF[i3 - 1];
                    }
                    bt.hA[0] = str;
                    bt.hB[0] = str2;
                    bt.hC[0] = str3;
                    bt.hE[0] = s2;
                    bt.hF[0] = str4;
                }
            }
        }
        this.aq.b();
        this.aq.a("服务器列表");
        int[] iArr = null;
        if (t.a == 1 && bt.hx >= 0 && bt.hx < bt.hA.length) {
            iArr = new int[bt.hA.length];
            for (int i4 = 0; i4 < iArr.length; i4++) {
                if (i4 == bt.hx) {
                    iArr[i4] = ca.a(0);
                } else {
                    iArr[i4] = ca.a(6);
                }
            }
        }
        this.ar.a((Image[]) null, bt.hA, (String[]) null, bt.hF);
        this.ar.a(iArr);
        this.aq.a(this.ar);
        this.au.a(new String[]{"进入选区", ""});
        this.aq.a(this.au);
        this.aq.a(t.f, t.g, t.d, t.e);
        this.j = (short) 4;
        this.k = (short) 4;
        this.c = (short) 0;
        this.a = 0;
        this.b = 0;
    }

    public final void a(int i2) throws IOException {
        s();
        String str = null;
        if (av.h == 1) {
            if (bt.hB[i2].equals("")) {
                b(new StringBuffer().append(bt.hA[i2]).append("繁忙,请选择其他服!").toString());
            } else {
                str = bt.hB[i2];
                a("http://117.135.138.130:7099", (byte) 1);
                bz.a = (byte) bt.hD[i2];
                bz.b = (byte) bt.hE[i2];
                a(bt.hE[i2]);
            }
        } else if (bt.hC[i2].equals("")) {
            b(new StringBuffer().append(bt.hA[i2]).append("繁忙,请选择其他服!").toString());
        } else {
            String str2 = bt.hC[i2];
            str = str2;
            a(str2, (byte) 2);
            bz.a = (byte) bt.hD[i2];
            bz.b = (byte) bt.hE[i2];
            a(bt.hE[i2]);
        }
        a(str, "http://117.135.138.130:7099");
        byte[] bArrA = bz.a((short) 4096, bt.hy, bt.hz, t.v, bt.hw);
        if (bArrA == null) {
            b("获取上传指令数据错误!");
            return;
        }
        w wVar = new w((short) 4096, bArrA);
        wVar.a = true;
        i.a(wVar);
        this.aZ = false;
        a((String) null);
    }

    private void e(Graphics graphics) {
        if (t.a == 1 && !t.w && bt.hw) {
            return;
        }
        c(graphics);
        if (this.aq != null) {
            this.aq.a(graphics);
        }
        if (this.c == 2) {
            a(graphics);
        }
    }

    public final void e() throws IOException {
        if (bt.m != null && bt.m.length() > 0) {
            h(bt.m);
        } else if (bt.W != null) {
            h(bt.W[(this.bA << 1) + this.bz]);
        }
    }

    public final void f() throws IOException {
        if (bt.m != null && bt.m.length() > 0) {
            i(bt.m);
        } else {
            if (e != null || bt.W == null) {
                return;
            }
            i(bt.W[(this.bA << 1) + this.bz]);
        }
    }

    private void A() {
        if (e != null) {
            e.b();
            e = null;
            if (!t.o || this.aj == null) {
                return;
            }
            this.aj.a = null;
        }
    }

    public final bc a(bc bcVar, byte b, byte b2, byte b3, byte b4, boolean z2) {
        t.ag.delete(0, t.ag.length());
        t.ag.append("f").append(t.V[b]).append(t.W[b2]).append((int) b4).append(t.X[3]).append(z2 ? 1 : 2);
        String string = t.ag.toString();
        ab.d(string);
        bc bcVarB = ab.b(string);
        bc bcVarB2 = bcVarB;
        if (bcVarB != null) {
            bcVarB2 = bcVarB2.b();
        }
        return bcVarB2;
    }

    public final void b(int i2) {
        w();
        this.bC = new int[6][4];
        ca.l = 0;
        ca.h = 0;
        ca.o = 0;
        this.c = (short) 0;
        this.a = 0;
        this.b = 0;
        bt.O();
        A();
        if (i2 <= 0 && this.k != 6) {
            this.bx = null;
            this.by = null;
            this.bB = 45;
            C();
            return;
        }
        this.bx = new bc[i2];
        this.by = new bc[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.bx[i3] = a(this.bx[i3], bt.Z[i3], bt.Y[i3], (byte) 3, (byte) 1, false);
            this.by[i3] = a(this.by[i3], bt.Z[i3], bt.Y[i3], (byte) 3, (byte) 1, true);
        }
        this.bB = 55;
        this.bz = (byte) 0;
        this.bA = (byte) 0;
        this.aq.b();
        this.aq.a("角色列表");
        this.aq.a((this.bB << 1) + 6);
        this.at.b(f(0), t.i, (byte) 1);
        this.at.a((byte) 1);
        this.aq.a(this.at);
        if (t.c > 220) {
            this.au.a(new String[]{"进入游戏", ""});
            this.aq.a(this.au);
        }
        this.aq.a(t.f, t.g, t.d, t.e);
        w();
        this.j = (short) 5;
        this.k = (short) 5;
    }

    private String f(int i2) {
        if (bt.aa == null || i2 >= bt.aa.length) {
            this.au.a(new String[]{"创 建", ""});
            return "创建角色";
        }
        t.a(this.l);
        this.l.append(new StringBuffer().append("昵称：").append(bt.aa[i2]).append('\t').toString());
        if (t.a == 0) {
            this.l.append(new StringBuffer().append("ID：").append(bt.W[i2]).append('\t').toString());
        }
        this.l.append(new StringBuffer().append("等级：").append((int) bt.X[i2]).append('\t').toString());
        this.au.a(new String[]{"进入游戏", ""});
        return this.l.toString();
    }

    private void B() throws IOException {
        if (this.c != 0) {
            if (this.c != 1) {
                if (this.c == 2) {
                    if (this.a == 268435456) {
                        a("输入“OK” 删除角色", 0);
                        this.c = (short) 0;
                    } else if (this.a == 536870912) {
                        this.c = (short) 1;
                    }
                    this.a = 0;
                    return;
                }
                return;
            }
            ca.b(this.a);
            if (this.a == 268435456 || this.a == 1073741824 || this.a == 517) {
                if (ca.o == 0) {
                    g(bt.W[(this.bA << 1) + this.bz]);
                } else if (ca.o == 1) {
                    this.aw = (this.bA << 1) + this.bz;
                    this.c = (short) 2;
                }
            } else if (this.a == 536870912) {
                b(bt.W.length);
                this.c = (short) 0;
            }
            this.a = 0;
            return;
        }
        if (this.aq != null) {
            this.aq.b(this.a);
        }
        if (this.a == 1 || this.a == 514) {
            this.bA = (byte) (this.bA <= 0 ? 1 : this.bA - 1);
            this.at.b(f((this.bA << 1) + this.bz), t.i, (byte) 1);
        } else if (this.a == 4 || this.a == 520) {
            this.bA = (byte) (this.bA >= 1 ? 0 : this.bA + 1);
            this.at.b(f((this.bA << 1) + this.bz), t.i, (byte) 1);
        } else if (this.a == 8 || this.a == 516) {
            this.bz = (byte) (this.bz <= 0 ? 1 : this.bz - 1);
            this.at.b(f((this.bA << 1) + this.bz), t.i, (byte) 1);
        } else if (this.a == 2 || this.a == 518) {
            this.bz = (byte) (this.bz >= 1 ? 0 : this.bz + 1);
            this.at.b(f((this.bA << 1) + this.bz), t.i, (byte) 1);
        } else if (this.a == 268435456) {
            if (bt.W == null || (this.bA << 1) + this.bz >= bt.W.length) {
                C();
            } else {
                g(bt.W[(this.bA << 1) + this.bz]);
            }
        } else if (this.a == 1073741824 || this.a == 517) {
            if (bt.W == null || (this.bA << 1) + this.bz >= bt.W.length) {
                C();
            } else if (bt.W.length >= 4) {
                ca.a(this.bC[(this.bA << 1) + this.bz][0] + (this.bB / 2), this.bC[(this.bA << 1) + this.bz][1] + (this.bB / 2), new String[]{"进入", "删除"}, false);
                this.c = (short) 1;
            } else {
                g(bt.W[(this.bA << 1) + this.bz]);
            }
        } else if (this.a == 536870912) {
            c();
        }
        if (this.bx != null) {
            for (int i2 = 0; i2 < this.bx.length; i2++) {
                ai.a(this.bx[i2], this.ak);
            }
        }
        if (this.by != null) {
            for (int i3 = 0; i3 < this.by.length; i3++) {
                ai.a(this.by[i3], this.ak);
            }
        }
        this.a = 0;
    }

    private void a(int i2, int i3, int i4, int i5, int i6) {
        if (this.bC == null || this.bC.length <= i2) {
            return;
        }
        this.bC[i2][0] = i3;
        this.bC[i2][1] = i4;
        this.bC[i2][2] = i5;
        this.bC[i2][3] = i6;
    }

    private void f(Graphics graphics) {
        c(graphics);
        if (this.aq != null) {
            this.aq.a(graphics);
            ca.a(graphics, this.aq.a + 5, this.aq.b + 32, this.aq.c - 11, this.aq.a((this.bB << 1) + 6), 1);
            int i2 = ((this.aq.c - (this.bB << 1)) - 16) / 3;
            int iA = ((this.aq.a(t.e <= 240 ? (this.bB << 1) + 6 : 111) - (this.bB << 1)) - 6) / 3;
            int i3 = 0;
            while (i3 < 2) {
                int i4 = 0;
                while (i4 < 2) {
                    a((i3 << 1) + i4, this.aq.a + 8 + i2 + ((i2 + this.bB) * i4), this.aq.b + 35 + iA + ((iA + this.bB) * i3), this.bB, this.bB);
                    ca.a(graphics, (Image) null, this.bC[(i3 << 1) + i4][0], this.bC[(i3 << 1) + i4][1], this.bB, this.bB, i3 == this.bA && i4 == this.bz);
                    i4++;
                }
                i3++;
            }
            if (this.bx != null && bt.aa != null && bt.aa.length > 0) {
                for (int i5 = 0; i5 < bt.aa.length; i5++) {
                    if (this.bx[i5] == null || i5 != (this.bA << 1) + this.bz) {
                        if (this.by != null && i5 != (this.bA << 1) + this.bz) {
                            f.a(graphics, this.by[i5], (int[]) null, 0, 0, (this.bC[i5][0] + 40) - 18, this.bC[i5][1] + 45, 20, 0);
                        }
                    } else if (bt.Z[i5] == 0) {
                        if (bt.Y[i5] == 0) {
                            f.a(graphics, this.bx[i5], (int[]) null, 0, 0, this.bC[i5][0] + 40 + 6, this.bC[i5][1] + 45 + 1, 20, 0);
                        } else {
                            f.a(graphics, this.bx[i5], (int[]) null, 0, 0, this.bC[i5][0] + 40 + 9, this.bC[i5][1] + 45 + 16, 20, 0);
                        }
                    } else if (bt.Z[i5] == 1) {
                        if (bt.Y[i5] == 0) {
                            f.a(graphics, this.bx[i5], (int[]) null, 0, 0, this.bC[i5][0] + 40 + 8, this.bC[i5][1] + 45 + 14, 20, 0);
                        } else {
                            f.a(graphics, this.bx[i5], (int[]) null, 0, 0, (this.bC[i5][0] + 40) - 1, this.bC[i5][1] + 45 + 9, 20, 0);
                        }
                    } else if (bt.Y[i5] == 0) {
                        f.a(graphics, this.bx[i5], (int[]) null, 0, 0, (this.bC[i5][0] + 40) - 9, this.bC[i5][1] + 45 + 10, 20, 0);
                    } else {
                        f.a(graphics, this.bx[i5], (int[]) null, 0, 0, (this.bC[i5][0] + 40) - 3, this.bC[i5][1] + 45 + 12, 20, 0);
                    }
                }
            }
        }
        if (this.c == 1) {
            ca.c(graphics);
        } else if (this.c == 2) {
            ca.a(graphics, "确认删除？", new String[]{"确认", "返回"});
        }
    }

    private void g(String str) throws IOException {
        byte[] bArrC = bz.c((short) 4250, str);
        if (bArrC == null) {
            b("获取上传指令数据错误!");
            return;
        }
        i.a(new w((short) 4250, bArrC));
        a((String) null);
    }

    private void h(String str) throws IOException {
        byte[] bArrC = bz.c((short) 4251, str);
        if (bArrC == null) {
            b("获取上传指令数据错误!");
            return;
        }
        i.a(new w((short) 4251, bArrC));
        a((String) null);
    }

    private void i(String str) throws IOException {
        bt.gQ = (short) 1;
        byte[] bArrB = bz.b((short) 4103, str);
        if (bArrB == null) {
            b("获取上传指令数据错误!");
            return;
        }
        i.a(new w((short) 4103, bArrB));
        a((String) null);
    }

    private void C() {
        w();
        this.bD = k("/images/logo_btn_random.png");
        this.bx = new bc[6];
        int i2 = 0;
        while (i2 < this.bx.length) {
            this.bx[i2] = a(this.bx[i2], (byte) (i2 % 3), i2 < 3 ? (byte) 0 : (byte) 1, (byte) 3, (byte) 1, false);
            i2++;
        }
        this.bB = 35;
        this.bG = 0;
        this.bE = (byte) 0;
        this.bF = (byte) 0;
        this.aq.b();
        this.aq.a("创建角色");
        this.aq.a(t.e <= 240 ? (this.bB * 3) + 6 : 150);
        this.at.b(t.H[0], t.i, (byte) 1);
        this.at.a((byte) 1);
        this.au.a(new String[]{"创 建", ""});
        this.aq.a(this.at);
        if (t.c > 220) {
            this.aq.a(this.au);
        }
        this.aq.a(t.f, t.g, t.d, t.e);
        this.a = 0;
        this.b = 0;
        this.j = (short) 6;
        this.k = (short) 6;
    }

    public final void b(String str, String str2) {
        D();
        if (str != null) {
            this.bS = new StringItem(str, str2);
        }
        this.aD = new Form("角色昵称");
        this.aC = new TextField("角色昵称", (String) null, 5, 0);
        this.bQ = new Command("返回", 8, 1);
        this.bP = new Command("确定", 2, 1);
        this.aD.addCommand(this.bP);
        this.aD.addCommand(this.bQ);
        this.aD.append(this.aC);
        if (str != null) {
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
        x();
        h();
        e = new ao(this, f);
        if (this.aj != null) {
            this.aj.a = e;
        }
        e.c("欢迎来到<梦回西游>世界");
        this.j = (short) 7;
        this.k = (short) 7;
    }

    public final void h() {
        bt.e();
        t.a(this.l);
        if (this.bx != null) {
            for (int i2 = 0; i2 < this.bx.length; i2++) {
                if (this.bx[i2] != null) {
                    this.bx[i2] = null;
                }
            }
            this.bx = null;
        }
        if (this.by != null) {
            for (int i3 = 0; i3 < this.by.length; i3++) {
                if (this.by[i3] != null) {
                    this.by[i3] = null;
                }
            }
            this.by = null;
        }
    }

    public final void i() {
        short s2;
        short s3 = e.l;
        e.l = (short) 0;
        e.m = (short) 0;
        if (e.g != null && (e.g.d != 2 || e.g.e != 2)) {
            e.g.d = 0;
            bq bqVar = e.g;
            if (e.g.f == -1) {
                s2 = 0;
                e.g.f = (short) 0;
            } else {
                s2 = e.g.f;
            }
            bqVar.f = s2;
        }
        if (this.az && ao.i()) {
            e.a(e.bb);
        } else if (e.k == 18) {
            e.l = (short) 1;
            e.k = e.j;
        } else if (e.k == 13) {
            if (s3 == 6) {
                e.k(e.aE);
            } else if (s3 == 7 || s3 == 8) {
                e.l = s3;
            } else {
                e.j(e.as);
            }
        } else if (e.k == 2) {
            if (s3 == 1) {
                e.l = (short) 1;
            } else {
                e.m();
            }
        } else if (e.k == 42) {
            e.M.a(e.aE);
        } else if (e.k == 48) {
            if (s3 == 2) {
                e.l = s3;
            }
        } else if (e.k == 46) {
            if (s3 == 1) {
                e.M.a(true);
                e.M.e();
            }
        } else if (e.k == 45) {
            e.M.a(true);
        } else if (e.k == 51) {
            e.M.q();
            e.M.m();
        } else if (e.k == 52) {
            if (s3 == 0 && this.as.a == 1) {
                e.M.t();
            } else if (s3 == 2 && ca.o == 1) {
                e.M.q(1);
            }
        } else if (e.k == 70 && !bt.kT) {
            if (bt.kP == 2) {
                byte b = (byte) e.aq;
                byte b2 = (byte) e.ar;
                e.e(e.as);
                e.aq = b;
                e.ar = b2;
                e.q();
            }
            if (bt.kP == 0 || bt.kP == 1) {
                e.m();
            }
            if (bt.kP == 3) {
                e.N();
            }
        } else if (e.k == 1 || e.k == 104 || e.k == 115 || e.k == 126 || e.k == 128 || e.k == 130) {
            e.l = s3;
        } else if (e.j == 4 && e.as == 7) {
            e.t();
        } else if (e.j == 14) {
            if (e.k != 14) {
                e.H();
            }
        } else if (e.j != 32) {
            e.k = e.j;
        }
        this.j = (short) 7;
        this.k = (short) 7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void E() {
        try {
            if (e == null) {
                return;
            }
            e.a();
            if (e.k != 0) {
                this.a = 0;
            }
        } catch (Exception e2) {
            printStackTrace();
            a(e2, (byte) 4);
        }
    }

    private void F() throws IOException {
        if (bt.b == null || bt.c == null) {
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeUTF(bt.b == null ? "" : bt.b);
            dataOutputStream.writeUTF(bt.c == null ? "" : bt.c);
            a(byteArrayOutputStream.toByteArray(), this.aK);
            byteArrayOutputStream.close();
            dataOutputStream.close();
        } catch (IOException unused) {
        } catch (Exception unused2) {
        }
    }

    public final void j() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        for (int i2 = 0; i2 < ao.aW.length; i2++) {
            try {
                if (i2 != 15) {
                    dataOutputStream.writeByte(ao.aW[i2]);
                }
            } catch (IOException unused) {
                return;
            }
        }
        a(byteArrayOutputStream.toByteArray(), bt.ad);
        byteArrayOutputStream.close();
        dataOutputStream.close();
    }

    public final void k() {
        if (j(bt.ad)) {
            RecordStore recordStore = null;
            try {
                RecordStore recordStoreA = a(bt.ad, false);
                recordStore = recordStoreA;
                DataInputStream dataInputStreamA = a(recordStoreA);
                for (int i2 = 0; i2 < ao.aW.length; i2++) {
                    if (i2 != 15) {
                        ao.aW[i2] = dataInputStreamA.readByte();
                    }
                }
                if (recordStore != null) {
                    try {
                        recordStore.closeRecordStore();
                    } catch (RecordStoreNotOpenException unused) {
                    } catch (RecordStoreException unused2) {
                    }
                }
            } catch (Exception unused3) {
                if (recordStore != null) {
                    try {
                        recordStore.closeRecordStore();
                    } catch (RecordStoreNotOpenException unused4) {
                    } catch (RecordStoreException unused5) {
                    }
                }
            } catch (Throwable th) {
                if (recordStore != null) {
                    try {
                        recordStore.closeRecordStore();
                    } catch (RecordStoreNotOpenException unused6) {
                    } catch (RecordStoreException unused7) {
                    }
                }
                throw th;
            }
        }
    }

    private static DataInputStream a(RecordStore recordStore) {
        if (1 < recordStore.getNumRecords() + 1) {
            return new DataInputStream(new ByteArrayInputStream(recordStore.getRecord(1)));
        }
        return null;
    }

    private static boolean j(String str) {
        String[] strArrListRecordStores = RecordStore.listRecordStores();
        if (strArrListRecordStores == null) {
            return false;
        }
        for (int length = strArrListRecordStores.length - 1; length >= 0; length--) {
            if (strArrListRecordStores[length].equals(str)) {
                return true;
            }
        }
        return false;
    }

    private static RecordStore a(String str, boolean z2) {
        if (!z2) {
            return RecordStore.openRecordStore(str, !z2);
        }
        RecordStore.deleteRecordStore(str);
        return RecordStore.openRecordStore(str, z2);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [boolean, java.lang.Throwable] */
    private void a(byte[] bArr, String str) {
        RecordStore recordStore = null;
        ?? J2 = j(str);
        try {
            try {
                RecordStore recordStoreA = a(str, (boolean) J2);
                recordStore = recordStoreA;
                recordStoreA.addRecord(bArr, 0, bArr.length);
                if (recordStore != null) {
                    try {
                        recordStore.closeRecordStore();
                    } catch (RecordStoreNotOpenException e2) {
                    } catch (RecordStoreException e3) {
                    }
                }
            } catch (RecordStoreException e4) {
                J2.printStackTrace();
                if (recordStore != null) {
                    try {
                        recordStore.closeRecordStore();
                    } catch (RecordStoreNotOpenException unused) {
                    } catch (RecordStoreException unused2) {
                    }
                }
            }
        } catch (Throwable th) {
            if (recordStore != null) {
                try {
                    recordStore.closeRecordStore();
                } catch (RecordStoreNotOpenException unused3) {
                } catch (RecordStoreException unused4) {
                }
            }
            throw th;
        }
    }

    protected final void keyPressed(int i2) {
        int i3;
        int i4 = this.a;
        int i5 = 0;
        switch (i2) {
            case -22:
            case -11:
            case -7:
                i5 = 536870912;
                break;
            case -21:
            case -6:
                i5 = 268435456;
                break;
            case 35:
                i5 = 2048;
                break;
            case 42:
                i5 = 1024;
                break;
            case 48:
                i5 = 48;
                break;
            case 49:
                i5 = 513;
                break;
            case 50:
                i5 = 514;
                break;
            case 51:
                i5 = 515;
                break;
            case 52:
                i5 = 516;
                break;
            case 53:
                i5 = 517;
                break;
            case 54:
                i5 = 518;
                break;
            case 55:
                i5 = 519;
                break;
            case 56:
                i5 = 520;
                break;
            case 57:
                i5 = 521;
                break;
            default:
                switch (getGameAction(i2)) {
                    case 1:
                        i5 = 1;
                        break;
                    case 2:
                        i5 = 8;
                        break;
                    case 5:
                        i5 = 2;
                        break;
                    case 6:
                        i5 = 4;
                        break;
                    case 8:
                        i5 = 1073741824;
                        break;
                }
        }
        this.a = i4 | i5;
        if (this.bI != this.a || System.currentTimeMillis() - this.bJ > 600) {
            if (e != null) {
                e.d = (byte) -1;
            }
            this.bI = this.a;
        } else if (e != null && e.k == 0) {
            if (this.bI == 1 || this.bI == 514) {
                e.d = (byte) 1;
            } else if (this.bI == 8 || this.bI == 516) {
                e.d = (byte) 0;
            } else if (this.bI == 4 || this.bI == 520) {
                e.d = (byte) 3;
            } else if (this.bI == 2 || this.bI == 518) {
                e.d = (byte) 2;
            } else {
                e.d = (byte) -1;
            }
        }
        this.bJ = System.currentTimeMillis();
        int i6 = this.b;
        switch (getGameAction(i2)) {
            case 1:
                i3 = 1;
                break;
            case 2:
                i3 = 8;
                break;
            case 3:
            case 4:
            case 7:
            case 8:
            default:
                switch (i2) {
                    case 50:
                        i3 = 514;
                        break;
                    case 51:
                    case 53:
                    case 55:
                    default:
                        i3 = 0;
                        break;
                    case 52:
                        i3 = 516;
                        break;
                    case 54:
                        i3 = 518;
                        break;
                    case 56:
                        i3 = 520;
                        break;
                }
            case 5:
                i3 = 2;
                break;
            case 6:
                i3 = 4;
                break;
        }
        this.b = i6 | i3;
        this.aA = 0;
    }

    protected final void keyReleased(int i2) {
        this.a = 0;
        this.b = 0;
        this.aA = 0;
    }

    private void G() {
        this.aJ = false;
        x();
    }

    private void H() {
        this.aD = null;
        this.bP = null;
        this.bP = null;
        this.aC = null;
        this.bX = null;
    }

    public final void a(String str, int i2) {
        this.aD = new Form(str);
        if (i2 == 2) {
            this.aC = new TextField(str, (String) null, 9, i2);
        } else if (str.equals("聊天")) {
            if (e.k == 18) {
                if (e.aR) {
                    this.aC = new TextField(new StringBuffer().append("与").append(e.aQ).append("私聊").toString(), (String) null, 30, i2);
                } else {
                    this.aC = new TextField(t.E[e.aT], (String) null, 30, i2);
                }
            } else if (e.k == 7) {
                if (this.as.a < 3) {
                    this.aC = new TextField(new StringBuffer().append("与").append(bt.gJ[this.ar.g()]).append("私聊").toString(), (String) null, 30, i2);
                } else if (bt.bs == 1) {
                    if (ca.o == 3) {
                        this.aC = new TextField("群聊", (String) null, 30, i2);
                    } else if (ca.o == 4) {
                        this.aC = new TextField(new StringBuffer().append("与").append(bt.q[this.ar.g()].e).append("私聊").toString(), (String) null, 30, i2);
                    }
                } else if (bt.bs == 0) {
                    if (ca.o == 0) {
                        this.aC = new TextField("群聊", (String) null, 30, i2);
                    } else if (ca.o == 1) {
                        this.aC = new TextField(new StringBuffer().append("与").append(bt.q[this.ar.g()].e).append("私聊").toString(), (String) null, 30, i2);
                    }
                }
            } else if (e.k == 19) {
                this.aC = new TextField(new StringBuffer().append("与").append(bt.dL[this.ar.g() - 1]).append("私聊").toString(), (String) null, 30, i2);
            } else if (e.k == 47) {
                this.aC = new TextField(new StringBuffer().append("与").append(bt.iz[this.ar.g()]).append("私聊").toString(), (String) null, 30, i2);
            } else {
                this.aC = new TextField("聊天", (String) null, 30, i2);
            }
        } else if (str.equals("输入帮派宗旨") || str.equals("输入帮派新宗旨") || str.equals("输入公告")) {
            this.aC = new TextField(str, (String) null, 100, i2);
        } else if (str.equals("输入帮派名称") || str.equals("请输入要搜索的帮派名称")) {
            this.aC = new TextField(str, (String) null, 6, i2);
        } else if (str.equals("请输入警告语（30个字符内）") || str.equals("输入兑换码")) {
            this.aC = new TextField(str, (String) null, 30, i2);
        } else {
            this.aC = new TextField(str, (String) null, 5, i2);
        }
        this.bQ = new Command("返回", 8, 1);
        this.bP = new Command("确定", 2, 1);
        if (str.equals("聊天")) {
            this.bR = new Command("表情", 8, 1);
            this.aD.addCommand(this.bR);
        }
        this.aD.addCommand(this.bP);
        this.aD.addCommand(this.bQ);
        this.aD.append(this.aC);
        this.aD.setCommandListener(this);
        this.q.setCurrent(this.aD);
        if (str.equals("聊天")) {
            a(this.aC, this.bZ);
        }
    }

    public static void a(TextField textField, String str) {
        if (str != null) {
            try {
                if (textField.getMaxSize() > str.length()) {
                    textField.setString(str);
                }
            } catch (Exception unused) {
                textField.setString("");
            }
        }
    }

    public final void a(String str, String str2, String str3, String str4) {
        this.aD = new Form("邮件举报");
        this.aC = new TextField("举报理由: ", "", 100, 0);
        this.bS = new StringItem("举报邮件：", "");
        this.bT = new StringItem("发件人：", str2);
        this.bU = new StringItem("标    题：", str3);
        this.bV = new StringItem("正    文：", str4);
        this.bW = str;
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
        this.bX = new ChoiceGroup("类型: ", 1, ag.a, (Image[]) null);
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

    public final void a(byte b, String str, String str2, String str3, String str4, String str5, String str6) {
        this.bY = (byte) 0;
        bt.O.q = str5;
        bt.O.r = str6;
        boolean zEquals = str.equals("回复邮件");
        if (this.bY == 0) {
            this.aD = new Form(str);
            if (zEquals) {
                this.bU = new StringItem("收件人: ", str3);
            } else {
                this.bL = new TextField("收件人: ", str3, 10, 0);
            }
            this.aC = new TextField("标    题: ", str2, 10, 0);
            this.bM = new TextField("正    文: ", str4, 100, 0);
            this.bP = new Command("发送", 3, 0);
            this.bQ = new Command("返回", 1, 5);
            if (!zEquals) {
                this.bR = new Command("选择收件人", 1, 5);
            }
            this.bS = new StringItem("温馨提示", "★请保护好个人帐号，勿在邮件内容中泄漏任何与财产相关的信息，后果需自负。");
            this.bT = new StringItem((String) null, "★官方与玩家联系使用系统邮件形式，慎访私人邮件冒用官方名义行骗。");
            this.aD.addCommand(this.bP);
            if (!zEquals) {
                this.aD.addCommand(this.bR);
            }
            this.aD.addCommand(this.bQ);
            this.aD.append(this.aC);
            if (zEquals) {
                this.aD.append(this.bU);
            } else {
                this.aD.append(this.bL);
            }
            this.aD.append(this.bM);
            this.aD.append(this.bS);
            this.aD.append(this.bT);
            this.aD.setCommandListener(this);
            this.q.setCurrent(this.aD);
        }
    }

    public final void d(String str) {
        this.aD = new Form(str);
        this.aE = new ChoiceGroup("", 1, new String[]{"世界聊", "区域聊", "队伍聊", "帮派聊", "跨服聊"}, (Image[]) null);
        this.aE.setSelectedIndex(1, true);
        this.aC = new TextField(str, (String) null, 30, 0);
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

    public final void e(String str) {
        this.aD = new Form(str);
        this.bP = new Command("确定", 4, 2);
        this.bQ = new Command("返回", 2, 1);
        this.aD.addCommand(this.bQ);
        this.aD.addCommand(this.bP);
        this.aD.setCommandListener(this);
        this.aC = new TextField("请输入搜索关键字:", "", 10, 0);
        this.aD.append(this.aC);
        this.q.setCurrent(this.aD);
    }

    public final void f(String str) {
        this.aD = new Form(str);
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

    /*  JADX ERROR: Types fix failed
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
        */
    /* JADX WARN: Not initialized variable reg: 3, insn: MOVE (r2 I:??) = (r3 I:??), block:B:512:0x1313 */
    public final void commandAction(javax.microedition.lcdui.Command r13, javax.microedition.lcdui.Displayable r14) {
        /*
            Method dump skipped, instructions count: 6134
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yinhan.kjava.main.a.commandAction(javax.microedition.lcdui.Command, javax.microedition.lcdui.Displayable):void");
    }

    private void J() {
        this.aJ = false;
        i = null;
        try {
            this.d.destroyApp(true);
        } catch (MIDletStateChangeException unused) {
        }
        this.d.notifyDestroyed();
    }

    protected final void pointerPressed(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        if (!t.o || this.aj == null) {
            return;
        }
        this.aj.e = i2;
        this.aj.f = i3;
        this.aA = 0;
        this.aj.a(this.aj.e, this.aj.f);
        f fVar = this.aj;
        int i7 = this.aj.e;
        int i8 = this.aj.f;
        switch (fVar.b.j) {
            case 2:
                fVar.b.a = fVar.b.a(i7, i8);
                return;
            case 3:
            case 7:
            case 8:
            case 9:
            case 11:
            case 12:
            case 13:
            default:
                return;
            case 4:
                if (fVar.b.c == 0) {
                    if (fVar.b.aq != null) {
                        fVar.b.a = fVar.b.aq.b(i7, i8);
                        return;
                    }
                    return;
                } else {
                    if (fVar.b.c == 2) {
                        fVar.b.a = fVar.b.a(i7, i8);
                        return;
                    }
                    return;
                }
            case 5:
                if (fVar.b.aq != null) {
                    fVar.b.a = fVar.b.aq.b(i7, i8);
                    a aVar = fVar.b;
                    a aVar2 = fVar.b;
                    int i9 = fVar.b.a;
                    if (aVar2.bC != null) {
                        for (int i10 = 0; i10 < aVar2.bC.length; i10++) {
                            if (i7 >= aVar2.bC[i10][0] && i7 <= aVar2.bC[i10][0] + aVar2.bC[i10][2] && i8 >= aVar2.bC[i10][1] && i8 <= aVar2.bC[i10][1] + aVar2.bC[i10][3]) {
                                byte b = (byte) (i10 % 2);
                                byte b2 = (byte) (i10 / 2);
                                if (b == aVar2.bz && b2 == aVar2.bA) {
                                    i5 = 1073741824;
                                } else {
                                    aVar2.bz = b;
                                    aVar2.bA = (byte) (b2 == 0 ? 1 : 0);
                                    i5 = 4;
                                }
                                aVar.a = i5;
                            }
                        }
                        i5 = i9;
                        aVar.a = i5;
                    } else {
                        i5 = i9;
                        aVar.a = i5;
                    }
                }
                if (fVar.b.c == 1) {
                    fVar.b.a = ca.c(i7, i8);
                    return;
                } else if (fVar.b.c != 2) {
                    return;
                }
                break;
            case 6:
                if (fVar.b.aq != null) {
                    fVar.b.a = fVar.b.aq.b(i7, i8);
                    a aVar3 = fVar.b;
                    a aVar4 = fVar.b;
                    int i11 = fVar.b.a;
                    if (aVar4.bC != null) {
                        for (int i12 = 0; i12 < aVar4.bC.length; i12++) {
                            if (i7 >= aVar4.bC[i12][0] && i7 <= aVar4.bC[i12][0] + aVar4.bC[i12][2] && i8 >= aVar4.bC[i12][1] && i8 <= aVar4.bC[i12][1] + aVar4.bC[i12][3]) {
                                if (i12 < 2) {
                                    aVar4.bH = 0;
                                } else if (i12 < 4) {
                                    aVar4.bH = 1;
                                } else {
                                    aVar4.bH = 2;
                                    aVar4.bG = i12 % 2;
                                    i4 = 1073741824;
                                }
                                i4 = i12 % 2 == 0 ? 8 : 2;
                            }
                        }
                        i4 = i11;
                    } else {
                        i4 = i11;
                    }
                    aVar3.a = i4;
                    return;
                }
                return;
            case 10:
                if (fVar.b.aq != null) {
                    fVar.b.a = fVar.b.aq.b(i7, i8);
                    return;
                }
                return;
            case 14:
                if (fVar.b.c != 0) {
                    fVar.b.a = ca.b(i7, i8);
                    return;
                }
                a aVar5 = fVar.b;
                a aVar6 = fVar.b;
                int i13 = 0;
                while (true) {
                    if (i13 >= aVar6.bo.length) {
                        i6 = (t.a != 1 || i7 < (t.b - t.i.stringWidth("退出")) - 4 || i7 > t.b - 4 || i8 < (t.c - t.j) - 4 || i8 > t.c - 4) ? 0 : 536870912;
                    } else if (i7 <= ((t.b - aVar6.bi.getWidth()) >> 1) || i7 >= ((t.b - aVar6.bi.getWidth()) >> 1) + aVar6.bi.getWidth() || i8 <= (aVar6.bt << 1) + aVar6.bh.getHeight() + (i13 * aVar6.bi.getHeight()) || i8 >= (aVar6.bt << 1) + aVar6.bh.getHeight() + ((i13 + 1) * aVar6.bi.getHeight())) {
                        i13++;
                    } else {
                        aVar6.bs = i13;
                        aVar6.al = 0L;
                        i6 = 1073741824;
                    }
                }
                aVar5.a = i6;
                return;
            case 15:
                fVar.b.a = ca.b(i7, i8);
                return;
            case 16:
                fVar.b.a = ca.b(i7, i8);
                return;
            case 17:
                fVar.b.a = ca.b(i7, i8);
                return;
            case 18:
                fVar.b.a = ca.a(i7, i8);
                return;
            case 19:
                fVar.b.a = ca.a(i7, i8);
                return;
            case 20:
                break;
        }
        fVar.b.a = ca.b(i7, i8);
    }

    protected final void pointerReleased(int i2, int i3) {
        if (!t.o || this.aj == null) {
            return;
        }
        this.aj.c = 0;
        this.aj.d = 0;
        this.b = 0;
        this.a = 0;
        this.aA = 0;
    }

    protected final void pointerDragged(int i2, int i3) {
        if (!t.o || this.aj == null || e == null) {
            return;
        }
        if (e.k != 0 || e.J == null) {
            switch (e.k) {
                case 0:
                    this.aj.d = 1;
                    this.aF = i2;
                    this.aG = i3;
                    break;
                case 39:
                    if (this.aj.c == 1) {
                        this.aj.d = 1;
                        this.aF = i2;
                        this.aG = i3;
                        break;
                    }
                    break;
            }
        }
    }

    public final void b(int i2, int i3) {
        int i4 = i2 - 8;
        int i5 = i3 - 16;
        Vector vector = new Vector();
        this.ca = (e.I.j / 16) + (e.I.j % 16 == 0 ? 0 : 1);
        this.cb = (e.I.k / 16) + (e.I.k % 16 == 0 ? 0 : 1);
        this.cc = (i4 / 16) + (i4 % 16 == 0 ? 0 : 1);
        this.cd = (i5 / 16) + (i5 % 16 == 0 ? 0 : 1);
        if (this.ca == this.cc && this.cb == this.cd) {
            return;
        }
        for (int i6 = 0; i6 < e.f.i.length; i6++) {
            for (int i7 = 0; i7 < e.f.i[i6].length; i7++) {
                if (e.f.i[i6][i7] == 1 && i4 >= (i6 * e.f.e) - 15 && i4 < ((i6 * e.f.e) + e.f.e) - 15 && i5 >= (i7 * e.f.f) - e.f.f && i5 < i7 * e.f.f) {
                    return;
                }
            }
        }
        Vector vectorA = i.a().a(e.f, vector, new bs(this.ca, this.cb), new bs(this.cc, this.cd));
        if (vectorA.isEmpty()) {
            return;
        }
        int size = vectorA.size();
        e.I.c.removeAllElements();
        int i8 = 0;
        while (i8 < size) {
            bs bsVar = (bs) vectorA.elementAt(i8);
            bs bsVar2 = i8 < size - 1 ? (bs) vectorA.elementAt(i8 + 1) : bsVar;
            if (bsVar.a != bsVar2.a) {
                if (bsVar.a > bsVar2.a) {
                    for (int i9 = 0; i9 < 4; i9++) {
                        e.I.c.addElement(new short[]{(short) ((bsVar.a << 4) - (i9 << 2)), (short) (bsVar.b << 4)});
                    }
                } else {
                    for (int i10 = 0; i10 < 4; i10++) {
                        e.I.c.addElement(new short[]{(short) ((bsVar.a << 4) + (i10 << 2)), (short) (bsVar.b << 4)});
                    }
                }
            } else if (bsVar.b != bsVar2.b) {
                if (bsVar.b > bsVar2.b) {
                    for (int i11 = 0; i11 < 4; i11++) {
                        e.I.c.addElement(new short[]{(short) (bsVar.a << 4), (short) ((bsVar.b << 4) - (i11 << 2))});
                    }
                } else {
                    for (int i12 = 0; i12 < 4; i12++) {
                        e.I.c.addElement(new short[]{(short) (bsVar.a << 4), (short) ((bsVar.b << 4) + (i12 << 2))});
                    }
                }
            }
            i8++;
        }
    }

    private void a(short s2) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeShort(s2);
            a(byteArrayOutputStream.toByteArray(), "S");
            byteArrayOutputStream.close();
            dataOutputStream.close();
        } catch (IOException unused) {
        } catch (Exception unused2) {
        }
    }

    private void K() {
        RecordStore recordStore = null;
        try {
            if (j("S")) {
                RecordStore recordStoreA = a("S", false);
                recordStore = recordStoreA;
                DataInputStream dataInputStreamA = a(recordStoreA);
                if (dataInputStreamA != null) {
                    this.ce = (short) 0;
                    this.ce = dataInputStreamA.readShort();
                    dataInputStreamA.close();
                }
            }
            if (recordStore != null) {
                try {
                    recordStore.closeRecordStore();
                } catch (RecordStoreException unused) {
                } catch (RecordStoreNotOpenException unused2) {
                }
            }
        } catch (Exception unused3) {
            if (recordStore != null) {
                try {
                    recordStore.closeRecordStore();
                } catch (RecordStoreNotOpenException unused4) {
                } catch (RecordStoreException unused5) {
                }
            }
        } catch (Throwable th) {
            if (recordStore != null) {
                try {
                    recordStore.closeRecordStore();
                } catch (RecordStoreNotOpenException unused6) {
                } catch (RecordStoreException unused7) {
                }
            }
            throw th;
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
        ca.h = 0;
        this.j = (short) 20;
        this.k = (short) 20;
    }

    public final void c(String str, String str2) {
        new e(this, str, str2);
    }

    public static final Image c(int i2) {
        if (i2 == 1) {
            return aM;
        }
        return null;
    }

    public static final Image d(int i2) {
        if (i2 <= 0 || i2 >= 8) {
            return null;
        }
        return aL[i2 - 1];
    }

    private static Image k(String str) {
        Image imageCreateImage;
        try {
            imageCreateImage = Image.createImage(str);
            return imageCreateImage;
        } catch (IOException e2) {
            imageCreateImage.printStackTrace();
            return null;
        }
    }

    public final void r() {
        ca.A = 100;
        b();
        this.d.a();
    }

    static ChoiceGroup a(a aVar) {
        return aVar.bb;
    }

    static ChoiceGroup a(a aVar, ChoiceGroup choiceGroup) {
        aVar.bc = choiceGroup;
        return choiceGroup;
    }

    static ChoiceGroup a(a aVar, int i2) {
        return e(i2);
    }

    static ChoiceGroup b(a aVar) {
        return aVar.bc;
    }

    static void c(a aVar) {
        bu buVar = new bu("/", "ui");
        ac = buVar;
        buVar.d();
        if (ac.b() == 0) {
        }
        bu buVar2 = new bu("/", "publicUI");
        ag = buVar2;
        buVar2.d();
        if (ag.b() != 0) {
            ao.w = ag.a("money");
            ao.x = ag.a("goods");
            ao.C = ag.a("chat");
            ao.D = ag.a("elite");
            n = ag.a("num");
            ag.b("email");
            bf bfVarA = ag.a("mail_2");
            aj[] ajVarArr = bfVarA.d;
            for (int i2 = 1; i2 < ajVarArr.length; i2++) {
                Image imageCreateImage = Image.createImage(bfVarA.a, ajVarArr[i2].a, ajVarArr[i2].b, ajVarArr[i2].c, ajVarArr[i2].d, 0);
                if ((i2 & 1) == 0) {
                    be.e[i2 >> 2] = imageCreateImage;
                } else {
                    bo.g[i2 >> 1] = imageCreateImage;
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
            for (int i3 = 0; i3 < R.length; i3++) {
                R[i3] = ag.a(new StringBuffer().append("equip_").append(i3).toString());
            }
            S = new bf[4];
            for (int i4 = 0; i4 < S.length; i4++) {
                S[i4] = ag.a(new StringBuffer().append("submenu_").append(i4).toString());
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
            for (int i5 = 0; i5 < aL.length; i5++) {
                aL[i5] = ag.a(new StringBuffer().append("chq-").append(i5 + 1).toString()).a;
            }
            aM = k("/images/mz_1.png");
        }
        ab = new bu("/role/", "role");
        ah = new bu("/petfight/", "petfight");
        af = new bu("/icon/", "icon");
        RecordStore recordStore = null;
        try {
            if (j(aVar.aK)) {
                RecordStore recordStoreA = a(aVar.aK, false);
                recordStore = recordStoreA;
                DataInputStream dataInputStreamA = a(recordStoreA);
                if (dataInputStreamA != null) {
                    bt.b = dataInputStreamA.readUTF();
                    bt.c = dataInputStreamA.readUTF();
                    dataInputStreamA.close();
                }
            }
            if (recordStore != null) {
                try {
                    recordStore.closeRecordStore();
                } catch (RecordStoreException unused) {
                } catch (RecordStoreNotOpenException unused2) {
                }
            }
        } catch (Exception unused3) {
            if (recordStore != null) {
                try {
                    recordStore.closeRecordStore();
                } catch (RecordStoreNotOpenException unused4) {
                } catch (RecordStoreException unused5) {
                }
            }
        } catch (Throwable th) {
            if (recordStore != null) {
                try {
                    recordStore.closeRecordStore();
                } catch (RecordStoreNotOpenException unused6) {
                } catch (RecordStoreException unused7) {
                }
            }
            throw th;
        }
        aVar.l = new StringBuffer();
        aVar.aq = new m();
        aVar.av = y.c();
        aVar.ar = new defpackage.c();
        aVar.au = new l();
        aVar.as = new n();
        aVar.at = new an();
        f = new ai();
        if (t.o) {
            aVar.aj = new f(aVar, f);
        }
        ai.a();
        aVar.c();
    }
}

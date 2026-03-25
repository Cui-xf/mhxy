/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import com.yinhan.kjava.main.a;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class bq {
    public static byte a = (byte)25;
    public static short b = (short)25;
    public static short c;
    private static short t;
    private String[] u;
    private Vector v = new Vector();
    private Vector w = new Vector();
    private Vector x = new Vector();
    private a y;
    private ao z;
    private cj A;
    public int d;
    public int e;
    private long B;
    private long C;
    private long D = -1L;
    private i[] E;
    private ae[] F;
    public short f;
    public static int g;
    private bf G = null;
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
    public static long r;
    private int[][] L = new int[5][4];
    public static short s;
    private int[][] M = new int[3][4];
    private int[][] N = new int[10][4];
    private int[] O = new int[]{513, 514, 515, 516, 517, 518, 519, 520, 1024, 2048};
    private static short P;
    private boolean Q = true;

    public bq(a a2, ao ao2, byte by2) {
        this.y = a2;
        this.z = ao2;
        t = by2;
        a2.b();
        bt.v = bt.w;
        this.a();
        a2.b();
    }

    public final void a() {
        int n2;
        int n3 = (t.b - 176) / 4;
        int n4 = (t.c - 208) / 6;
        t.Q = new short[6][2];
        t.R = new short[6][2];
        t.R[0][0] = (short)(t.T[0][0] + n3);
        t.R[0][1] = (short)(t.T[0][1] + (n4 << 1));
        t.R[1][0] = (short)(t.T[1][0] + (n3 << 1));
        t.R[1][1] = (short)(t.T[1][1] + (n4 << 1));
        t.R[2][0] = (short)(t.T[2][0] + n3 * 3);
        t.R[2][1] = (short)(t.T[2][1] + (n4 << 1));
        t.R[3][0] = (short)(t.T[3][0] + n3);
        t.R[3][1] = (short)(t.T[3][1] + n4);
        t.R[4][0] = (short)(t.T[4][0] + (n3 << 1));
        t.R[4][1] = (short)(t.T[4][1] + n4);
        t.R[5][0] = (short)(t.T[5][0] + n3 * 3);
        t.R[5][1] = (short)(t.T[5][1] + n4);
        t.Q[0][0] = (short)(t.S[0][0] + n3);
        t.Q[0][1] = (short)(t.S[0][1] + n4 * 5);
        t.Q[1][0] = (short)(t.S[1][0] + (n3 << 1));
        t.Q[1][1] = (short)(t.S[1][1] + n4 * 5);
        t.Q[2][0] = (short)(t.S[2][0] + n3 * 3);
        t.Q[2][1] = (short)(t.S[2][1] + n4 * 5);
        t.Q[3][0] = (short)(t.S[3][0] + n3);
        t.Q[3][1] = (short)(t.S[3][1] + (n4 << 2));
        t.Q[4][0] = (short)(t.S[4][0] + (n3 << 1));
        t.Q[4][1] = (short)(t.S[4][1] + (n4 << 2));
        t.Q[5][0] = (short)(t.S[5][0] + n3 * 3);
        t.Q[5][1] = (short)(t.S[5][1] + (n4 << 2));
        bt.H = new p[bt.I.length];
        if (t == 0) {
            bt.M = new ck[bt.N.length];
        } else if (t == 1 || t == 2) {
            bt.M = new ck[bt.J.length];
        }
        for (n2 = 0; n2 < bt.I.length; ++n2) {
            bt.H[n2] = bt.I[n2].c();
            bt.H[n2].b((byte)1);
        }
        if (t == 0) {
            for (n2 = 0; n2 < bt.N.length; n2 = (int)((byte)(n2 + 1))) {
                ck ck2 = bt.N[n2];
                ck ck3 = new ck();
                new ck().a = ck2.a;
                ck3.b = ck2.b;
                ck3.c = ck2.c;
                ck3.d = ck2.d;
                ck3.e = ck2.e;
                ck3.f = ck2.f;
                ck3.g = ck2.g;
                ck3.h = ck2.h;
                ck3.j = ck2.j;
                ck3.n = ck2.n;
                ck3.m = ck2.m;
                ck3.r = ck2.r;
                ck3.s = ck2.s;
                ck3.t = ck2.t;
                ck3.i = ck2.i;
                ck3.k = ck2.k;
                ck3.l = ck2.l;
                bt.M[n2] = ck3;
                bt.M[n2].b((byte)1);
            }
        } else if (t == 1 || t == 2) {
            for (n2 = 0; n2 < bt.J.length; n2 = (int)((byte)(n2 + 1))) {
                bt.M[n2] = bt.J[n2].b();
                bt.M[n2].b((byte)1);
            }
        }
        if (bt.I != null) {
            for (n2 = 0; n2 < bt.I.length; n2 = (int)((byte)(n2 + 1))) {
                if (bt.I[n2] == null) continue;
                bt.I[n2].e();
                bt.I[n2] = null;
            }
            bt.I = null;
        }
        if (t == 0) {
            if (bt.N != null) {
                for (n2 = 0; n2 < bt.N.length; n2 = (int)((byte)(n2 + 1))) {
                    if (bt.N[n2] == null) continue;
                    bt.N[n2].b();
                    bt.N[n2] = null;
                }
                bt.N = null;
            }
        } else if (bt.J != null) {
            for (n2 = 0; n2 < bt.J.length; n2 = (int)((byte)(n2 + 1))) {
                if (bt.J[n2] == null) continue;
                bt.J[n2].e();
                bt.J[n2] = null;
            }
            bt.J = null;
        }
        bt.K = bt.L;
        bt.L = (short)-1;
        this.f = bt.K == 2 && bt.bs != -1 && bt.s == 0 ? (short)9 : (short)0;
        this.d = 0;
        this.h = 0;
        this.e = 5;
        this.z.az = 0;
        if (bt.bt) {
            b = 1;
            s = 1;
            P = a;
        } else {
            s = b = (short)a;
            P = b;
        }
        this.C = System.currentTimeMillis();
    }

    public final void a(int n2) {
        bq bq2;
        block342: {
            int n3;
            int n4;
            int n5;
            block340: {
                block343: {
                    block345: {
                        block347: {
                            block346: {
                                block344: {
                                    block341: {
                                        if (bt.bs == 0 && bt.s == 0 && g > 0) {
                                            this.d();
                                            return;
                                        }
                                        if (this.f != 10) {
                                            bq2 = this;
                                            if (ao.ac != null) {
                                                ai.a(ao.ac, bq2.y.ak);
                                            }
                                            if (ao.ad != null) {
                                                ai.a(ao.ad, bq2.y.ak);
                                            }
                                            if (ao.ae != null) {
                                                ai.a(ao.ae, bq2.y.ak);
                                            }
                                            if (bt.H != null) {
                                                for (n5 = 0; n5 < bt.H.length; n5 = (int)((byte)(n5 + 1))) {
                                                    if (bt.H[n5].k == 1) {
                                                        long l2 = bq2.y.ak;
                                                        ai ai2 = com.yinhan.kjava.main.a.f;
                                                        p p2 = bt.H[n5];
                                                        int n6 = p2.j != null && !p2.d() ? ai.a(p2.j, l2) : -1;
                                                        if (bq2.F == null) continue;
                                                        for (n4 = 0; n4 < bq2.F.length; n4 = (int)((byte)(n4 + 1))) {
                                                            if (bq2.F[n4].b != 0 || bq2.F[n4].c != bt.H[n5].a) continue;
                                                            bq.a(bt.H[n5], bq2.F[n4]);
                                                        }
                                                        continue;
                                                    }
                                                    if (bt.H[n5].k == 2) {
                                                        if (bt.H[n5].j != null && ai.a(bt.H[n5].j, bq2.y.ak) != 2) continue;
                                                        bt.H[n5].b((byte)1);
                                                        if (bq2.F != null) {
                                                            for (n4 = 0; n4 < bq2.F.length; n4 = (int)((byte)(n4 + 1))) {
                                                                if (bq2.F[n4].b != 0 || bq2.F[n4].c != bt.H[n5].a) continue;
                                                                bq.a(bt.H[n5], bq2.F[n4]);
                                                            }
                                                        }
                                                        if (bq2.A == null) {
                                                            block3: for (n4 = 0; n4 < bt.M.length; n4 = (int)((byte)(n4 + 1))) {
                                                                if (bq2.F == null) continue;
                                                                for (n3 = 0; n3 < bq2.F.length; n3 = (int)((byte)(n3 + 1))) {
                                                                    if (bq2.F[n3].b != 1 || bt.M[n4].a != bq2.F[n3].c) continue;
                                                                    bt.M[n4].b((byte)4);
                                                                    continue block3;
                                                                }
                                                            }
                                                            block5: for (n4 = 0; n4 < bt.H.length; n4 = (int)((byte)(n4 + 1))) {
                                                                if (bq2.F == null) continue;
                                                                for (n3 = 0; n3 < bq2.F.length; n3 = (int)((byte)(n3 + 1))) {
                                                                    if (bq2.F[n3].b != 0 || bt.H[n4].a != bq2.F[n3].c) continue;
                                                                    bt.H[n4].b((byte)4);
                                                                    continue block5;
                                                                }
                                                            }
                                                            bq2.B = bq2.y.ak;
                                                            bq2.f = (short)3;
                                                            continue;
                                                        }
                                                        bq2.f = (short)5;
                                                        continue;
                                                    }
                                                    if (bt.H[n5].k != 4 || bt.H[n5].j != null && ai.a(bt.H[n5].j, bq2.y.ak) != 2) continue;
                                                    if (bq2.F != null) {
                                                        for (n4 = 0; n4 < bq2.F.length; n4 = (int)((byte)(n4 + 1))) {
                                                            if (bq2.F[n4].b != 0 || bq2.F[n4].c != bt.H[n5].a) continue;
                                                            bq.a(bt.H[n5], bq2.F[n4]);
                                                        }
                                                    }
                                                    bt.H[n5].b((byte)1);
                                                }
                                            }
                                            if (bt.M != null) {
                                                for (n5 = 0; n5 < bt.M.length; n5 = (int)((byte)(n5 + 1))) {
                                                    if (bt.M[n5].n == 1) {
                                                        bt.M[n5].a(com.yinhan.kjava.main.a.f, bq2.y.ak);
                                                        continue;
                                                    }
                                                    if (bt.M[n5].n == 2) {
                                                        if (bt.M[n5].m != null && ai.a(bt.M[n5].m, bq2.y.ak) != 2) continue;
                                                        bt.M[n5].b((byte)1);
                                                        if (bq2.A == null) {
                                                            block9: for (n4 = 0; n4 < bt.H.length; n4 = (int)((byte)(n4 + 1))) {
                                                                if (bq2.F == null) continue;
                                                                for (n3 = 0; n3 < bq2.F.length; n3 = (int)((byte)(n3 + 1))) {
                                                                    if (bq2.F[n3].b != 0 || bt.H[n4].a != bq2.F[n3].c) continue;
                                                                    bt.H[n4].b((byte)4);
                                                                    continue block9;
                                                                }
                                                            }
                                                            block11: for (n4 = 0; n4 < bt.M.length; n4 = (int)((byte)(n4 + 1))) {
                                                                if (bq2.F == null) continue;
                                                                for (n3 = 0; n3 < bq2.F.length; n3 = (int)((byte)(n3 + 1))) {
                                                                    if (bq2.F[n3].b != 1 || bt.M[n4].a != bq2.F[n3].c) continue;
                                                                    bt.M[n4].b((byte)4);
                                                                    continue block11;
                                                                }
                                                            }
                                                            bq2.B = bq2.y.ak;
                                                            bq2.f = (short)3;
                                                            continue;
                                                        }
                                                        bq2.f = (short)5;
                                                        continue;
                                                    }
                                                    if (bt.M[n5].n == 3 || bt.M[n5].n != 4 || bt.M[n5].m != null && ai.a(bt.M[n5].m, bq2.y.ak) != 2) continue;
                                                    if (bq2.F != null) {
                                                        for (n4 = 0; n4 < bq2.F.length; n4 = (int)((byte)(n4 + 1))) {
                                                            int n7;
                                                            block336: {
                                                                if (bq2.F[n4].b != 1 || bq2.F[n4].c != bt.M[n5].a) continue;
                                                                bt.M[n5].e = bq2.F[n4].g;
                                                                bt.M[n5].g = bq2.F[n4].h;
                                                                bt.M[n5].f = bq2.F[n4].i;
                                                                bt.M[n5].h = bq2.F[n4].j;
                                                                if (bt.M[n5].e > 0) continue;
                                                                for (int n8 = 0; n8 < bt.M.length; n8 = (int)((byte)(n8 + 1))) {
                                                                    if (t == 1 || t == 2) {
                                                                        if (bt.M[n8].e <= 0 || bt.M[n8].b != 0) continue;
                                                                        n7 = n8;
                                                                    } else {
                                                                        if (bt.M[n8].e <= 0) continue;
                                                                        n7 = n8;
                                                                    }
                                                                    break block336;
                                                                }
                                                                n7 = -1;
                                                            }
                                                            bq2.h = (byte)n7;
                                                            bq2.h = bq2.h < 0 ? (byte)0 : bq2.h;
                                                        }
                                                    }
                                                    bt.M[n5].b((byte)1);
                                                }
                                            }
                                        }
                                        if (this.d == 0 || this.d == 2 || this.f > 1) {
                                            n5 = n2;
                                            bq2 = this;
                                            if (n5 == 8) {
                                                if (bq2.e == 5 || bq2.e == 3 && bq2.d > 1) {
                                                    int n9;
                                                    ao ao2 = bq2.z;
                                                    if (bq2.z.az <= 0) {
                                                        n9 = 9;
                                                    } else {
                                                        byte by2 = (byte)(bq2.z.az - 1);
                                                        n9 = by2;
                                                        bq2.z.az = by2;
                                                    }
                                                    ao2.az = (byte)n9;
                                                }
                                            } else if (n5 == 2) {
                                                if (bq2.e == 5 || bq2.e == 3 && bq2.d > 1) {
                                                    bq2.z.az = bq2.z.az >= 9 ? (byte)0 : (bq2.z.az = (byte)(bq2.z.az + 1));
                                                }
                                            } else if (n5 == 0x40000000) {
                                                if (bq2.e == 5 || bq2.e == 3 && bq2.d > 1) {
                                                    if (bq2.z.az == 8) {
                                                        bq2.z.K();
                                                    } else if (bq2.z.az == 9) {
                                                        bq2.z.O();
                                                        bq2.e = 5;
                                                    }
                                                }
                                            } else if (n5 == 1024) {
                                                bq2.z.K();
                                            } else if (n5 == 2048) {
                                                bq2.z.O();
                                                if (bq2.d <= 1) {
                                                    bq2.e = 5;
                                                } else if (bq2.d > 1) {
                                                    bq2.e = 3;
                                                }
                                            }
                                        }
                                        if (this.f != 0) break block340;
                                        this.I = System.currentTimeMillis();
                                        bq2 = this;
                                        if (bq.h() && bq2.f != -1 && !ao.r()) {
                                            bq2.j = 0;
                                            bq2.p = bt.ej[bq2.z.az];
                                            bq2.n = 1;
                                            bq2.a(bt.bt ? (byte)0 : 1, bt.bt ? 0 : 1, (byte)1, bt.M[bq2.h].a, (byte)1, bt.bt ? 0 : 1, (byte)1, bt.M[bq2.h].a);
                                            bq2.f = (short)-1;
                                            bq2.e = 5;
                                            bq2.d = 0;
                                        }
                                        n5 = n2;
                                        bq2 = this;
                                        if (bq2.d != 0) break block341;
                                        if (bq.y() && !bq.h()) {
                                            bq2.j = 1;
                                            bq2.p = 1;
                                            bq2.n = 1;
                                            if (bq2.j()) {
                                                bq2.a(bq2.j, bq2.p, bq2.n, bq2.o, (byte)1, 1, (byte)1, bt.M[bq2.h].a);
                                                bq2.f = (short)-1;
                                                bq2.e = 5;
                                            } else {
                                                bq2.d = 2;
                                                bq2.e = 3;
                                            }
                                        } else if (n5 == 1) {
                                            bq2.e = bq2.e <= 0 ? 5 : (bq2.e = bq2.e - 1);
                                        } else if (n5 == 4) {
                                            bq2.e = bq2.e >= 5 ? 0 : (bq2.e = bq2.e + 1);
                                        } else if (n5 == 0x40000000) {
                                            bq2.J = false;
                                            if (bq2.e == 0 && !bq.h()) {
                                                if (bq.c() <= 1) {
                                                    bq2.j = 1;
                                                    bq2.p = 1;
                                                    bq2.n = 1;
                                                    bq2.o = bt.M[bq2.h].a;
                                                    if (bq2.j()) {
                                                        bq2.a(bq2.j, bq2.p, bq2.n, bq2.o, (byte)1, 1, (byte)1, bt.M[bq2.h].a);
                                                        bq2.f = (short)-1;
                                                        bq2.e = 5;
                                                    } else {
                                                        bq2.d = 2;
                                                        bq2.e = 3;
                                                    }
                                                } else {
                                                    bq2.d = 1;
                                                }
                                            } else if (bq2.e == 1 && !bq.h()) {
                                                bq2.j = (byte)3;
                                                bq2.p = 1;
                                                bq2.n = 1;
                                                bq2.o = bt.M[bq2.h].a;
                                                if (bq2.j()) {
                                                    bq2.a(bq2.j, bq2.p, bq2.n, bq2.o, (byte)1, 1, (byte)1, bt.M[bq2.h].a);
                                                    bq2.f = (short)-1;
                                                    bq2.e = 5;
                                                } else {
                                                    bq2.d = 2;
                                                    bq2.e = 3;
                                                }
                                            } else if (bq2.e == 2 && !bq.h()) {
                                                if (bt.dB == null || bt.dB.length <= 0) {
                                                    bq2.y.b("\u6ca1\u6709\u53ef\u7528\u6280\u80fd");
                                                } else {
                                                    bq2.z.h(3);
                                                }
                                            } else if (bq2.e == 3) {
                                                bq2.z.e(6);
                                            } else if (bq2.e == 4 && !bq.h()) {
                                                if (bq2.j()) {
                                                    bq2.k = 1;
                                                    bq2.q = 1;
                                                    bq bq3 = bq2;
                                                    if (t == 1) {
                                                        bq3.y.b("\u51b3\u6597\u65f6\u4e0d\u80fd\u9003\u8dd1!");
                                                    } else if (bt.bs == 0 && bt.s == 0) {
                                                        bq3.y.b("\u961f\u5458\u4e0d\u80fd\u9003\u8dd1");
                                                    } else {
                                                        bq3.a((byte)4, -1, (byte)0, bq3.o, bq3.k, bq3.q, (byte)1, bt.M[bq3.h].a);
                                                        bq3.f = (short)-1;
                                                        bq3.e = 5;
                                                    }
                                                } else if (t == 1) {
                                                    bq2.y.b("\u51b3\u6597\u65f6\u4e0d\u80fd\u9003\u8dd1!");
                                                } else {
                                                    bq2.j = (byte)4;
                                                    bq2.p = 1;
                                                    bq2.n = 0;
                                                    bq2.o = 1;
                                                    bq2.d = 2;
                                                    bq2.e = 3;
                                                }
                                            } else if (bq2.e == 5 && bt.en[bq2.z.az] != -1 && bq2.z.az >= 0 && bq2.z.az < 8) {
                                                bq2.q();
                                            }
                                        } else if (n5 == 513 && !bt.bt) {
                                            if (bt.en[0] != -1) {
                                                bq2.z.az = 0;
                                                if (bt.el[bq2.z.az] < 2) {
                                                    bq2.q();
                                                } else if (bq2.b(0)) {
                                                    bq2.j = 0;
                                                    bq2.p = bt.ej[bq2.z.az];
                                                    bq2.n = 1;
                                                    bq2.o = bt.M[bq2.h].a;
                                                    if (bq2.j()) {
                                                        bq2.a(bq2.j, bq2.p, bq2.n, bq2.o, (byte)1, 1, (byte)1, bt.M[bq2.h].a);
                                                        bq2.f = (short)-1;
                                                        bq2.e = 5;
                                                    } else {
                                                        bq2.d = 2;
                                                        bq2.e = 3;
                                                    }
                                                } else {
                                                    bq2.J = true;
                                                    bq2.d = 1;
                                                }
                                            }
                                        } else if (n5 == 514 && !bt.bt) {
                                            if (bt.en[1] != -1) {
                                                bq2.z.az = 1;
                                                if (bt.el[bq2.z.az] < 2) {
                                                    bq2.q();
                                                } else if (bq2.b(0)) {
                                                    bq2.j = 0;
                                                    bq2.p = bt.ej[bq2.z.az];
                                                    bq2.n = 1;
                                                    bq2.o = bt.M[bq2.h].a;
                                                    if (bq2.j()) {
                                                        bq2.a(bq2.j, bq2.p, bq2.n, bq2.o, (byte)1, 1, (byte)1, bt.M[bq2.h].a);
                                                        bq2.f = (short)-1;
                                                        bq2.e = 5;
                                                    } else {
                                                        bq2.d = 2;
                                                        bq2.e = 3;
                                                    }
                                                } else {
                                                    bq2.J = true;
                                                    bq2.d = 1;
                                                }
                                            }
                                        } else if (n5 == 515 && !bt.bt) {
                                            if (bt.en[2] != -1) {
                                                bq2.z.az = (byte)2;
                                                if (bt.el[bq2.z.az] < 2) {
                                                    bq2.q();
                                                } else if (bq2.b(0)) {
                                                    bq2.j = 0;
                                                    bq2.p = bt.ej[bq2.z.az];
                                                    bq2.n = 1;
                                                    bq2.o = bt.M[bq2.h].a;
                                                    if (bq2.j()) {
                                                        bq2.a(bq2.j, bq2.p, bq2.n, bq2.o, (byte)1, 1, (byte)1, bt.M[bq2.h].a);
                                                        bq2.f = (short)-1;
                                                        bq2.e = 5;
                                                    } else {
                                                        bq2.d = 2;
                                                        bq2.e = 3;
                                                    }
                                                } else {
                                                    bq2.J = true;
                                                    bq2.d = 1;
                                                }
                                            }
                                        } else if (n5 == 516 && !bt.bt) {
                                            if (bt.en[3] != -1) {
                                                bq2.z.az = (byte)3;
                                                if (bt.el[bq2.z.az] < 2) {
                                                    bq2.q();
                                                } else if (bq2.b(0)) {
                                                    bq2.j = 0;
                                                    bq2.p = bt.ej[bq2.z.az];
                                                    bq2.n = 1;
                                                    bq2.o = bt.M[bq2.h].a;
                                                    if (bq2.j()) {
                                                        bq2.a(bq2.j, bq2.p, bq2.n, bq2.o, (byte)1, 1, (byte)1, bt.M[bq2.h].a);
                                                        bq2.f = (short)-1;
                                                        bq2.e = 5;
                                                    } else {
                                                        bq2.d = 2;
                                                        bq2.e = 3;
                                                    }
                                                } else {
                                                    bq2.J = true;
                                                    bq2.d = 1;
                                                }
                                            }
                                        } else if (n5 == 517 && !bt.bt) {
                                            if (bt.en[4] != -1) {
                                                bq2.z.az = (byte)4;
                                                if (bt.el[bq2.z.az] < 2) {
                                                    bq2.q();
                                                } else if (bq2.b(0)) {
                                                    bq2.j = 0;
                                                    bq2.p = bt.ej[bq2.z.az];
                                                    bq2.n = 1;
                                                    bq2.o = bt.M[bq2.h].a;
                                                    if (bq2.j()) {
                                                        bq2.a(bq2.j, bq2.p, bq2.n, bq2.o, (byte)1, 1, (byte)1, bt.M[bq2.h].a);
                                                        bq2.f = (short)-1;
                                                        bq2.e = 5;
                                                    } else {
                                                        bq2.d = 2;
                                                        bq2.e = 3;
                                                    }
                                                } else {
                                                    bq2.J = true;
                                                    bq2.d = 1;
                                                }
                                            }
                                        } else if (n5 == 518 && !bt.bt) {
                                            if (bt.en[5] != -1) {
                                                bq2.z.az = (byte)5;
                                                if (bt.el[bq2.z.az] < 2) {
                                                    bq2.q();
                                                } else if (bq2.b(0)) {
                                                    bq2.j = 0;
                                                    bq2.p = bt.ej[bq2.z.az];
                                                    bq2.n = 1;
                                                    bq2.o = bt.M[bq2.h].a;
                                                    if (bq2.j()) {
                                                        bq2.a(bq2.j, bq2.p, bq2.n, bq2.o, (byte)1, 1, (byte)1, bt.M[bq2.h].a);
                                                        bq2.f = (short)-1;
                                                        bq2.e = 5;
                                                    } else {
                                                        bq2.d = 2;
                                                        bq2.e = 3;
                                                    }
                                                } else {
                                                    bq2.J = true;
                                                    bq2.d = 1;
                                                }
                                            }
                                        } else if (n5 == 519 && !bt.bt) {
                                            if (bt.en[6] != -1) {
                                                bq2.z.az = (byte)6;
                                                if (bt.el[bq2.z.az] < 2) {
                                                    bq2.q();
                                                } else if (bq2.b(0)) {
                                                    bq2.j = 0;
                                                    bq2.p = bt.ej[bq2.z.az];
                                                    bq2.n = 1;
                                                    bq2.o = bt.M[bq2.h].a;
                                                    if (bq2.j()) {
                                                        bq2.a(bq2.j, bq2.p, bq2.n, bq2.o, (byte)1, 1, (byte)1, bt.M[bq2.h].a);
                                                        bq2.f = (short)-1;
                                                        bq2.e = 5;
                                                    } else {
                                                        bq2.d = 2;
                                                        bq2.e = 3;
                                                    }
                                                } else {
                                                    bq2.J = true;
                                                    bq2.d = 1;
                                                }
                                            }
                                        } else if (n5 == 520 && !bt.bt && bt.en[7] != -1) {
                                            bq2.z.az = (byte)7;
                                            if (bt.el[bq2.z.az] < 2) {
                                                bq2.q();
                                            } else if (bq2.b(0)) {
                                                bq2.j = 0;
                                                bq2.p = bt.ej[bq2.z.az];
                                                bq2.n = 1;
                                                bq2.o = bt.M[bq2.h].a;
                                                if (bq2.j()) {
                                                    bq2.a(bq2.j, bq2.p, bq2.n, bq2.o, (byte)1, 1, (byte)1, bt.M[bq2.h].a);
                                                    bq2.f = (short)-1;
                                                    bq2.e = 5;
                                                } else {
                                                    bq2.d = 2;
                                                    bq2.e = 3;
                                                }
                                            } else {
                                                bq2.J = true;
                                                bq2.d = 1;
                                            }
                                        }
                                        break block342;
                                    }
                                    if (bq2.d != 1) break block343;
                                    if (n5 != 8 && n5 != 2 && n5 != 1 && n5 != 4) break block344;
                                    bq2.h = bq.b(bq2.h);
                                    break block342;
                                }
                                if (n5 != 0x40000000) break block345;
                                if (bq2.e != 5 && !bq2.J) break block346;
                                if (bq2.z.az >= 0 && bq2.z.az <= 7 && bt.bt) break block342;
                                bq2.j = 0;
                                bq2.p = bt.ej[bq2.z.az];
                                bq2.n = 1;
                                bq2.o = bt.M[bq2.h].a;
                                break block347;
                            }
                            if (bq2.e == 0) {
                                bq2.j = 1;
                                bq2.p = 1;
                                bq2.n = 1;
                                bq2.o = bt.M[bq2.h].a;
                            } else if (bq2.e == 2) {
                                bq2.j = 1;
                                bq2.p = bt.dl[bq2.y.ar.g()];
                                bq2.n = 1;
                                bq2.o = bt.M[bq2.h].a;
                            }
                        }
                        if (bq2.j()) {
                            bq2.a(bq2.j, bq2.p, bq2.n, bq2.o, (byte)1, 1, (byte)1, (byte)-1);
                            bq2.f = (short)-1;
                            bq2.e = 5;
                        } else {
                            bq2.d = 2;
                            bq2.e = 3;
                        }
                        break block342;
                    }
                    if (n5 == 0x20000000) {
                        bq2.d = 0;
                    }
                    break block342;
                }
                if (bq2.d == 2) {
                    boolean bl2;
                    block337: {
                        bq bq4 = bq2;
                        for (n3 = 0; n3 < bt.H.length; n3 = (int)((byte)(n3 + 1))) {
                            if (bt.H[n3].b == 0 || bt.H[n3].a != bq.i() + 3 || !bt.H[n3].o) continue;
                            bl2 = true;
                            break block337;
                        }
                        bl2 = false;
                    }
                    if (bl2) {
                        bq2.a(bq2.j, bq2.p, bq2.n, bq2.o, (byte)1, 1, (byte)1, bt.M[bq2.h].a);
                        bq2.f = (short)-1;
                        bq2.e = 5;
                    } else {
                        if (n5 == 1) {
                            bq2.e = bq2.e <= 0 ? 3 : (bq2.e = bq2.e - 1);
                        } else if (n5 == 4) {
                            bq2.e = bq2.e >= 3 ? 0 : (bq2.e = bq2.e + 1);
                        } else if (n5 == 0x40000000) {
                            if (bq2.e == 0) {
                                if (bq.c() <= 1) {
                                    bq2.a(bq2.j, bq2.p, bq2.n, bq2.o, (byte)1, 1, (byte)1, bt.M[bq2.h].a);
                                    bq2.f = (short)-1;
                                    bq2.e = 5;
                                } else {
                                    bq2.k = 1;
                                    bq2.q = 1;
                                    bq2.d = 3;
                                }
                            } else if (bq2.e == 1) {
                                bq2.a(bq2.j, bq2.p, bq2.n, bq2.o, (byte)3, 1, (byte)1, bt.M[bq2.h].a);
                                bq2.f = (short)-1;
                                bq2.e = 5;
                            } else if (bq2.e == 2) {
                                if (bt.cR == null || bt.cR.length <= 0) {
                                    bq2.y.b("\u5ba0\u7269\u6ca1\u6709\u6280\u80fd!");
                                } else {
                                    bq2.z.a(false, true);
                                }
                            } else if (bq2.e == 3 && bt.et[bq2.z.az] != -1) {
                                bq2.r();
                            }
                        }
                        if (n5 == 513 && !bt.bt) {
                            if (bt.et[0] != -1) {
                                bq2.z.az = 0;
                                bq2.r();
                            }
                        } else if (n5 == 514 && !bt.bt) {
                            if (bt.et[1] != -1) {
                                bq2.z.az = 1;
                                bq2.r();
                            }
                        } else if (n5 == 515 && !bt.bt) {
                            if (bt.et[2] != -1) {
                                bq2.z.az = (byte)2;
                                bq2.r();
                            }
                        } else if (n5 == 516 && !bt.bt) {
                            if (bt.et[3] != -1) {
                                bq2.z.az = (byte)3;
                                bq2.r();
                            }
                        } else if (n5 == 517 && !bt.bt) {
                            if (bt.et[4] != -1) {
                                bq2.z.az = (byte)4;
                                bq2.r();
                            }
                        } else if (n5 == 518 && !bt.bt) {
                            if (bt.et[5] != -1) {
                                bq2.z.az = (byte)5;
                                bq2.r();
                            }
                        } else if (n5 == 519 && !bt.bt) {
                            if (bt.et[6] != -1) {
                                bq2.z.az = (byte)6;
                                bq2.r();
                            }
                        } else if (n5 == 520 && !bt.bt) {
                            if (bt.et[7] != -1) {
                                bq2.z.az = (byte)7;
                                bq2.r();
                            }
                        } else if (n5 == 0x20000000) {
                            if (bq.y()) {
                                bq2.y.b("\u4f60\u5df2\u88ab\u9501\u5b9a\t\u65e0\u6cd5\u8fdb\u884c\u8be5\u64cd\u4f5c");
                            } else {
                                bq2.d = 0;
                            }
                        }
                    }
                } else if (bq2.d == 3) {
                    if (n5 == 8 || n5 == 2 || n5 == 1 || n5 == 4) {
                        bq2.h = bq.b(bq2.h);
                    } else if (n5 == 0x40000000 || n5 == 517) {
                        bq2.a(bq2.j, bq2.p, bq2.n, bq2.o, bq2.k, bq2.q, (byte)1, bt.M[bq2.h].a);
                        bq2.f = (short)-1;
                        bq2.e = 5;
                    } else if (n5 == 0x20000000) {
                        bq2.d = 2;
                        bq2.e = 3;
                    }
                } else if (bq2.d == 4) {
                    if (n5 == 8 || n5 == 2 || n5 == 1 || n5 == 4) {
                        if (bq.h()) {
                            bq2.y.b("\u53ea\u80fd\u5bf9\u81ea\u5df1\u4f7f\u7528\u590d\u6d3b\u9053\u5177");
                        } else {
                            bq2.i = bq.c(bq2.i);
                        }
                    } else if (n5 == 0x40000000 || n5 == 517) {
                        bq2.o = bt.H[bq2.i].a;
                        if (!bq2.j()) {
                            bq2.d = 2;
                            bq2.e = 3;
                        } else {
                            bq2.a(bq2.j, bq2.p, bq2.n, bq2.o, (byte)1, 1, (byte)1, bt.M[bq2.h].a);
                            bq2.f = (short)-1;
                            bq2.e = 5;
                        }
                    } else if (n5 == 0x20000000) {
                        bq2.d = 0;
                    }
                } else if (bq2.d == 5) {
                    if (n5 == 8 || n5 == 2 || n5 == 1 || n5 == 4) {
                        bq2.i = bq.c(bq2.i);
                    } else if (n5 == 0x40000000 || n5 == 517) {
                        bq2.o = bt.H[bq2.i].a;
                        bq2.j = 1;
                        bq2.p = bt.dl[bq2.y.ar.g()];
                        bq2.n = 0;
                        if (!bq2.j()) {
                            bq2.d = 2;
                            bq2.e = 3;
                        } else {
                            bq2.a(bq2.j, bq2.p, bq2.n, bq2.o, (byte)1, 1, (byte)1, (byte)-1);
                            bq2.f = (short)-1;
                            bq2.e = 5;
                        }
                    } else if (n5 == 0x20000000) {
                        bq2.d = 0;
                    }
                } else if (bq2.d == 6) {
                    if (n5 == 8 || n5 == 2 || n5 == 1 || n5 == 4) {
                        bq2.i = bq.c(bq2.i);
                    } else if (n5 == 0x40000000 || n5 == 517) {
                        bq2.k = 1;
                        bq2.q = bt.dl[bq2.y.ar.g()];
                        bq2.l = 0;
                        bq2.a(bq2.j, bq2.p, bq2.n, bq2.o, bq2.k, bq2.q, bq2.l, bt.H[bq2.i].a);
                        bq2.f = (short)-1;
                        bq2.e = 5;
                    } else if (n5 == 0x20000000) {
                        bq2.d = 2;
                        bq2.e = 3;
                    }
                } else if (bq2.d == 7) {
                    if (n5 == 8 || n5 == 2 || n5 == 1 || n5 == 4) {
                        bq2.i = bq.c(bq2.i);
                    } else if (n5 == 0x40000000 || n5 == 517) {
                        bq2.o = bt.H[bq2.i].a;
                        if (!bq2.j()) {
                            bq2.d = 2;
                            bq2.e = 3;
                        } else {
                            bq2.a(bq2.j, bq2.p, bq2.n, bq2.o, (byte)1, 1, (byte)1, (byte)-1);
                            bq2.f = (short)-1;
                            bq2.e = 5;
                        }
                    } else if (n5 == 0x20000000) {
                        bq2.d = 0;
                    }
                } else if (bq2.d == 8) {
                    if (n5 == 8 || n5 == 2 || n5 == 1 || n5 == 4) {
                        bq2.i = bq.c(bq2.i);
                    } else if (n5 == 0x40000000 || n5 == 517) {
                        bq2.a(bq2.j, bq2.p, bq2.n, bq2.o, bq2.k, bq2.q, bq2.l, bt.H[bq2.i].a);
                        bq2.f = (short)-1;
                        bq2.e = 5;
                    } else if (n5 == 0x20000000) {
                        bq2.d = 2;
                        bq2.e = 3;
                    }
                } else if (bq2.d == 9) {
                    if (n5 == 8 || n5 == 2 || n5 == 1 || n5 == 4) {
                        bq2.h = bq.b(bq2.h);
                    } else if (n5 == 0x40000000 || n5 == 517) {
                        bq2.o = bt.M[bq2.h].a;
                        if (!bq2.j()) {
                            bq2.d = 2;
                            bq2.e = 3;
                        } else {
                            bq2.a(bq2.j, bq2.p, bq2.n, bq2.o, (byte)1, 1, (byte)1, (byte)-1);
                            bq2.f = (short)-1;
                            bq2.e = 5;
                        }
                    } else if (n5 == 0x20000000) {
                        bq2.d = 0;
                    }
                }
                break block342;
            }
            if (this.f == 1) {
                bq2 = this;
                if (bq2.Q) {
                    int n10;
                    block339: {
                        int n11;
                        block338: {
                            bq2.Q = false;
                            n5 = 0;
                            n4 = 0;
                            for (n2 = 0; n2 < bt.H.length; n2 = (int)((byte)(n2 + 1))) {
                                if (bt.H[n2].b != 0 || !bt.H[n2].c.equals(bt.ad)) continue;
                                n11 = n2;
                                break block338;
                            }
                            n11 = -1;
                        }
                        n3 = n11;
                        bq bq5 = bq2;
                        for (n2 = 0; n2 < bt.H.length; n2 = (int)((byte)(n2 + 1))) {
                            if (bt.H[n2].b == 0 || bt.H[n2].a != bq.i() + 3) continue;
                            n10 = n2;
                            break block339;
                        }
                        n10 = -1;
                    }
                    int n12 = n10;
                    for (int i2 = 0; i2 < bq2.v.size(); ++i2) {
                        i[] iArray = (i[])bq2.v.elementAt(i2);
                        if (iArray[0].d != 9) continue;
                        ae[] aeArray = (ae[])bq2.w.elementAt(i2);
                        for (n2 = 0; n2 < aeArray.length; ++n2) {
                            if (aeArray[n2].b == 0 && bt.H[n3].a == aeArray[n2].c && bq.d(aeArray[n2].k)) {
                                bt.H[n3].o = true;
                                n5 = 1;
                            }
                            if (bt.be <= 0 || aeArray[n2].b != 0 || bt.H[n12].a != aeArray[n2].c || !bq.d(aeArray[n2].k)) continue;
                            bt.H[n12].o = true;
                            n4 = 1;
                        }
                    }
                    if (n5 == 0) {
                        bt.H[n3].o = false;
                    }
                    if (n4 == 0 && bt.be > 0) {
                        bt.H[n12].o = false;
                    }
                }
                if (this.v.size() > 0) {
                    n2 = 0;
                    if (0 < this.v.size()) {
                        this.E = (i[])this.v.elementAt(0);
                        this.F = this.w.size() > 0 ? (ae[])this.w.elementAt(0) : null;
                        this.u = this.x.size() > 0 ? (String[])this.x.elementAt(0) : null;
                        bq2 = this;
                        if (bq2.E[0].d == 7 || bq2.E[0].d == 5 || bq2.E[0].d == 9 || bq2.E[0].d == 1 || bq2.E[0].d == 2 || bq2.E[0].d == 3) {
                            for (n5 = 0; n5 < bt.H.length; n5 = (int)((byte)(n5 + 1))) {
                                if (bt.H[n5] != null && !bt.H[n5].d()) {
                                    for (n4 = 0; n4 < bq2.F.length; n4 = (int)((byte)(n4 + 1))) {
                                        if (bq2.F[n4].k < 0 || bq2.F[n4].b != 0 || bq2.F[n4].c != bt.H[n5].a) continue;
                                        bq2.G = com.yinhan.kjava.main.a.ac.a(String.valueOf(bq2.F[n4].k));
                                        if (bq2.G == null || bq2.H.contains(bq2.G)) continue;
                                        n3 = 1;
                                        for (int i3 = 0; i3 < bq2.H.size(); ++i3) {
                                            if (!bq2.H.elementAt(i3).equals(bq2.G)) continue;
                                            n3 = 0;
                                        }
                                        if (n3 == 0) continue;
                                        bq2.H.addElement(bq2.G);
                                    }
                                }
                                bq.a(bt.H[n5].s, bq2.H);
                                bq2.H.removeAllElements();
                            }
                            for (n5 = 0; n5 < bt.M.length; n5 = (int)((byte)(n5 + 1))) {
                                if (bt.M[n5] == null || bt.M[n5].a()) continue;
                                for (n4 = 0; n4 < bq2.F.length; n4 = (int)((byte)(n4 + 1))) {
                                    if (bq2.F[n4].k < 0 || bq2.F[n4].b != 1 || bq2.F[n4].c != bt.M[n5].a) continue;
                                    bq2.G = com.yinhan.kjava.main.a.ac.a(String.valueOf(bq2.F[n4].k));
                                    if (bq2.G == null || bq2.H.contains(bq2.G)) continue;
                                    n3 = 1;
                                    for (int i4 = 0; i4 < bq2.H.size(); ++i4) {
                                        if (bq2.H.elementAt(i4) == bq2.G) continue;
                                        n3 = 0;
                                    }
                                    if (n3 == 0) continue;
                                    bq2.H.addElement(bq2.G);
                                }
                                bq.a(bt.M[n5].u, bq2.H);
                                bq2.H.removeAllElements();
                            }
                        }
                        if (bq2.E[0].d == 7) {
                            bq2.n();
                        } else {
                            bq2.o();
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
                    if (bq.h()) {
                        if (ao.r()) {
                            this.f = 0;
                            s = b;
                        } else {
                            this.j = 0;
                            this.p = bt.ej[this.z.az];
                            this.n = 1;
                            this.a(bt.bt ? (byte)0 : 1, bt.bt ? 0 : 1, (byte)1, bt.M[this.h].a, (byte)1, bt.bt ? 0 : 1, (byte)1, bt.M[this.h].a);
                            this.f = (short)-1;
                            this.e = 5;
                        }
                        this.d = 0;
                    } else if (this.f != 0) {
                        this.d = 0;
                        s = b;
                        this.f = 0;
                    }
                    for (n2 = 0; n2 < bt.H.length; n2 = (int)((byte)(n2 + 1))) {
                        bt.H[n2].m = false;
                        bt.H[n2].l = false;
                        bt.H[n2].n = false;
                    }
                    for (n2 = 0; n2 < bt.M.length; n2 = (int)((byte)(n2 + 1))) {
                        bt.M[n2].p = false;
                        bt.M[n2].o = false;
                        bt.M[n2].q = false;
                    }
                    this.Q = true;
                }
            } else if (this.f == 2) {
                if (this.D == -1L) {
                    this.D = this.y.ak;
                }
            } else if (this.f == 3 && bq.x()) {
                if (this.u != null && this.y.ak - this.B >= 1450L) {
                    this.f = 1;
                } else if (this.u == null) {
                    this.f = 1;
                }
            }
        }
        if (this.f == 4) {
            if (bq.u()) {
                this.y.d.a();
            }
            this.d();
            this.z.k = 0;
            this.z.j = 0;
        } else if (this.f == 5) {
            if (this.s() == 2) {
                block28: for (n2 = 0; n2 < bt.H.length; n2 = (int)((byte)(n2 + 1))) {
                    if (this.F == null) continue;
                    for (int n13 = 0; n13 < this.F.length; n13 = (int)((byte)(n13 + 1))) {
                        if (this.F[n13].b != 0 || bt.H[n2].a != this.F[n13].c) continue;
                        bt.H[n2].b((byte)4);
                        continue block28;
                    }
                }
                block30: for (n2 = 0; n2 < bt.M.length; n2 = (int)((byte)(n2 + 1))) {
                    if (this.F == null) continue;
                    for (int n14 = 0; n14 < this.F.length; n14 = (int)((byte)(n14 + 1))) {
                        if (this.F[n14].b != 1 || bt.M[n2].a != this.F[n14].c) continue;
                        bt.M[n2].b((byte)4);
                        continue block30;
                    }
                }
                this.B = this.y.ak;
                this.f = (short)3;
            }
        } else if (this.f == 6) {
            if (ai.a(ao.ab, this.y.ak) == 2) {
                this.f = 1;
            }
        } else if (this.f == 7) {
            if (ai.a(ao.aa, this.y.ak) == 2) {
                this.f = (short)8;
            }
        } else if (this.f == 8) {
            this.y.d.a();
            this.d();
            this.z.k = 0;
            this.z.j = 0;
        }
        if (this.f == 0 || this.f == 1) {
            if (this.v.size() <= 0 && bt.x == -1) {
                bq2 = this;
                if (bq.t() || bq.u() || this.f == 1) {
                    this.f = (short)4;
                    return;
                }
            } else if (this.f != 9 && (bt.bs >= 0 && bt.s == 0 || t == 1 || t == 2 || bt.bt) && s > 0) {
                this.p();
            }
        }
    }

    public final void a(ai object, Graphics graphics) {
        Graphics graphics2;
        graphics.setClip(0, 0, (int)t.b, (int)t.c);
        if ((this.f == 2 || this.f == 3 || this.f == 6) && this.E != null) {
            graphics2 = graphics;
            object = this;
            if (((bq)object).E[0].f != null && !((bq)object).E[0].f.equals("")) {
                ca.a(graphics2, ((bq)object).E[0].f, t.b / 2, t.c - 22 - t.j, 17, 0, 0xFFFFFF);
            }
        }
        if (this.f != 4 && this.f != 8) {
            int n2;
            int n3;
            byte by2;
            graphics2 = graphics;
            object = this;
            Object object2 = graphics2;
            Object object3 = object;
            if (bt.H != null) {
                for (by2 = (byte)(bt.H.length - 1); by2 >= 0; by2 = (byte)(by2 - 1)) {
                    if (bt.H[by2].j == null) continue;
                    if (bt.H[by2].d()) {
                        com.yinhan.kjava.main.a.f.a((Graphics)object2, ao.ad, null, 0, 0, (int)t.Q[bt.H[by2].a][0], (int)t.Q[bt.H[by2].a][1], 0, 0);
                        continue;
                    }
                    if (bt.H[by2].b == 0 || bt.H[by2].j == null) continue;
                    if (bt.H[by2].k == 1 || bt.H[by2].k == 4) {
                        bt.H[by2].a((Graphics)object2, com.yinhan.kjava.main.a.f, t.Q[bt.H[by2].a][0], t.Q[bt.H[by2].a][1], (byte)0);
                    }
                    if (((bq)object3).f != -1 && ((bq)object3).f != 0 && ((bq)object3).f != 7 && bt.H[by2].m) {
                        com.yinhan.kjava.main.a.f.a((Graphics)object2, ao.ae, null, 0, 0, (int)t.Q[bt.H[by2].a][0], (int)t.Q[bt.H[by2].a][1], 0, 0);
                        continue;
                    }
                    if (((bq)object3).f != 6 || !bt.H[by2].l) continue;
                    com.yinhan.kjava.main.a.f.a((Graphics)object2, ao.ab, null, 0, 0, (int)t.Q[bt.H[by2].a][0], (int)t.Q[bt.H[by2].a][1], 0, 0);
                }
                for (by2 = 0; by2 < bt.H.length; by2 = (byte)(by2 + 1)) {
                    if (bt.H[by2].b == 0 && bt.H[by2].j != null) {
                        if (bt.H[by2].c.equals(bt.ad)) {
                            object2.drawImage(ao.H.a, t.Q[bt.H[by2].a][0] - ao.H.b / 2, t.Q[bt.H[by2].a][1] - ao.H.c / 2, 20);
                            if (((bq)object3).f == 7 && bt.bs == 1 || ((bq)object3).f == 7 && bt.bs == -1 || ((bq)object3).f == 7 && bt.s == 1) {
                                com.yinhan.kjava.main.a.f.a((Graphics)object2, ao.aa, null, 0, 0, (int)t.Q[bt.H[by2].a][0], (int)t.Q[bt.H[by2].a][1], 0, 0);
                            } else if (!bt.H[by2].d()) {
                                if (bt.H[by2].k == 1 || bt.H[by2].k == 4) {
                                    bt.H[by2].a((Graphics)object2, com.yinhan.kjava.main.a.f, t.Q[bt.H[by2].a][0], t.Q[bt.H[by2].a][1], (byte)0);
                                }
                                if (((bq)object3).f != -1 && ((bq)object3).f != 0 && bt.H[by2].m) {
                                    com.yinhan.kjava.main.a.f.a((Graphics)object2, ao.ae, null, 0, 0, (int)t.Q[bt.H[by2].a][0], (int)t.Q[bt.H[by2].a][1], 0, 0);
                                } else if (((bq)object3).f == 6 && bt.H[by2].l) {
                                    com.yinhan.kjava.main.a.f.a((Graphics)object2, ao.ab, null, 0, 0, (int)t.Q[bt.H[by2].a][0], (int)t.Q[bt.H[by2].a][1], 0, 0);
                                }
                            }
                        } else if (((bq)object3).f == 7) {
                            for (n3 = 0; n3 < bt.q.length; ++n3) {
                                if (bt.q[n3].e.equals(bt.H[by2].d) && bt.q[n3].s == 1) {
                                    com.yinhan.kjava.main.a.f.a((Graphics)object2, ao.aa, null, 0, 0, (int)t.Q[bt.H[by2].a][0], (int)t.Q[bt.H[by2].a][1], 0, 0);
                                    continue;
                                }
                                if (!bt.q[n3].e.equals(bt.H[by2].d) || bt.q[n3].s != 0 || bt.H[by2].d()) continue;
                                if (bt.H[by2].k == 1 || bt.H[by2].k == 4) {
                                    bt.H[by2].a((Graphics)object2, com.yinhan.kjava.main.a.f, t.Q[bt.H[by2].a][0], t.Q[bt.H[by2].a][1], (byte)0);
                                }
                                if (((bq)object3).f != -1 && ((bq)object3).f != 0 && bt.H[by2].m) {
                                    com.yinhan.kjava.main.a.f.a((Graphics)object2, ao.ae, null, 0, 0, (int)t.Q[bt.H[by2].a][0], (int)t.Q[bt.H[by2].a][1], 0, 0);
                                    continue;
                                }
                                if (((bq)object3).f != 6 || !bt.H[by2].l) continue;
                                com.yinhan.kjava.main.a.f.a((Graphics)object2, ao.ab, null, 0, 0, (int)t.Q[bt.H[by2].a][0], (int)t.Q[bt.H[by2].a][1], 0, 0);
                            }
                        } else if (!bt.H[by2].d()) {
                            if (bt.H[by2].k == 1 || bt.H[by2].k == 4) {
                                bt.H[by2].a((Graphics)object2, com.yinhan.kjava.main.a.f, t.Q[bt.H[by2].a][0], t.Q[bt.H[by2].a][1], (byte)0);
                            }
                            if (((bq)object3).f != -1 && ((bq)object3).f != 0 && bt.H[by2].m) {
                                com.yinhan.kjava.main.a.f.a((Graphics)object2, ao.ae, null, 0, 0, (int)t.Q[bt.H[by2].a][0], (int)t.Q[bt.H[by2].a][1], 0, 0);
                            } else if (((bq)object3).f == 6 && bt.H[by2].l) {
                                com.yinhan.kjava.main.a.f.a((Graphics)object2, ao.ab, null, 0, 0, (int)t.Q[bt.H[by2].a][0], (int)t.Q[bt.H[by2].a][1], 0, 0);
                            }
                        }
                    }
                    if (bt.H[by2].s.size() <= 0 || bt.H[by2].j == null) continue;
                    for (n3 = 0; n3 < bt.H[by2].s.size(); n3 = (int)((byte)(n3 + 1))) {
                        com.yinhan.kjava.main.a.f.a((Graphics)object2, (bf)bt.H[by2].s.elementAt(n3), null, 0, 0, 0, t.Q[bt.H[by2].a][0] - bt.H[by2].h() / 2, t.Q[bt.H[by2].a][1] + n3 * 11 - bt.H[by2].i(), 0, 0);
                    }
                }
            }
            object2 = graphics2;
            object3 = object;
            if (bt.M != null) {
                for (by2 = 0; by2 < bt.M.length; by2 = (byte)(by2 + 1)) {
                    if (bt.M[by2].m == null) continue;
                    if (!bt.M[by2].a()) {
                        if (bt.M[by2].n == 1 || bt.M[by2].n == 4) {
                            bt.M[by2].a((Graphics)object2, com.yinhan.kjava.main.a.f, t.R[bt.M[by2].a][0], t.R[bt.M[by2].a][1], (byte)0);
                            if (((bq)object3).f != -1 && ((bq)object3).f != 0 && bt.M[by2].p) {
                                com.yinhan.kjava.main.a.f.a((Graphics)object2, ao.ae, null, 0, 0, (int)t.R[bt.M[by2].a][0], (int)t.R[bt.M[by2].a][1], 0, 0);
                            } else if (((bq)object3).f == 6 && bt.M[by2].o) {
                                com.yinhan.kjava.main.a.f.a((Graphics)object2, ao.ab, null, 0, 0, (int)t.R[bt.M[by2].a][0], (int)t.R[bt.M[by2].a][1], 0, 0);
                            }
                        } else if (bt.M[by2].n == 2) {
                            if (((bq)object3).A == null || ((bq)object3).A.b.length <= 0) {
                                if (bt.M[by2].q) {
                                    if (bq.c((int)((bq)object3).E[0].c) >= 0 && bq.c((int)((bq)object3).E[0].c) < bt.M.length) {
                                        bt.M[by2].a((Graphics)object2, com.yinhan.kjava.main.a.f, t.R[bt.M[bq.c((int)((bq)object3).E[0].c)].a][0], t.R[bt.M[bq.c((int)((bq)object3).E[0].c)].a][1], (byte)0);
                                    }
                                } else if (bq.a(((bq)object3).E[0].c) >= 0 && bq.a(((bq)object3).E[0].c) < bt.H.length) {
                                    bt.M[by2].a((Graphics)object2, com.yinhan.kjava.main.a.f, t.Q[bt.H[bq.a((byte)((bq)object3).E[0].c)].a][0] - bt.H[bq.a(((bq)object3).E[0].c)].h() / 2, t.Q[bt.H[bq.a((byte)((bq)object3).E[0].c)].a][1], (byte)0);
                                }
                            } else {
                                bt.M[by2].a((Graphics)object2, com.yinhan.kjava.main.a.f, t.R[bt.M[by2].a][0], t.R[bt.M[by2].a][1], (byte)0);
                            }
                        }
                        if (bt.M[by2].u.size() <= 0) continue;
                        for (n3 = 0; n3 < bt.M[by2].u.size(); n3 = (int)((byte)(n3 + 1))) {
                            ck ck2 = bt.M[by2];
                            com.yinhan.kjava.main.a.f.a((Graphics)object2, (bf)bt.M[by2].u.elementAt(n3), null, 0, 0, 0, t.R[bt.M[by2].a][0] - (ck2.m != null && ck2.m.g != null ? ck2.m.g[0] : 0) / 2, t.R[bt.M[by2].a][1] + n3 * 11 - bt.M[by2].d(), 0, 0);
                        }
                        continue;
                    }
                    if (t != 1 && t != 2) continue;
                    com.yinhan.kjava.main.a.f.a((Graphics)object2, ao.ac, null, 0, 0, (int)t.R[bt.M[by2].a][0], (int)t.R[bt.M[by2].a][1], 0, 0);
                }
            }
            object2 = graphics2;
            object3 = object;
            if (bt.H != null && ((bq)object3).f != 7) {
                for (by2 = 0; by2 < bt.H.length; by2 = (byte)(by2 + 1)) {
                    if (bt.H[by2].d() || bt.H[by2].k != 2 || ((bq)object3).E[0].c < 0) continue;
                    if (((bq)object3).A == null || ((bq)object3).A.b.length <= 0) {
                        n3 = 0;
                        if (bt.H[by2].n) {
                            byte by3 = (byte)bq.a(((bq)object3).E[0].c);
                            n3 = by3;
                            if (by3 < 0 || n3 > bt.H.length - 1) continue;
                            bt.H[by2].a((Graphics)object2, com.yinhan.kjava.main.a.f, t.Q[bt.H[bq.a((byte)((bq)object3).E[0].c)].a][0], t.Q[bt.H[bq.a((byte)((bq)object3).E[0].c)].a][1], (byte)0);
                            continue;
                        }
                        byte by4 = (byte)bq.c((int)((bq)object3).E[0].c);
                        n3 = by4;
                        if (by4 < 0 || n3 > bt.M.length - 1) continue;
                        bt.H[by2].a((Graphics)object2, com.yinhan.kjava.main.a.f, t.R[bt.M[bq.c((int)((bq)object3).E[0].c)].a][0] + bt.M[bq.c((int)((bq)object3).E[0].c)].c() / 2, t.R[bt.M[bq.c((int)((bq)object3).E[0].c)].a][1], (byte)0);
                        continue;
                    }
                    bt.H[by2].a((Graphics)object2, com.yinhan.kjava.main.a.f, t.Q[bt.H[by2].a][0], t.Q[bt.H[by2].a][1], (byte)0);
                }
            }
            graphics2 = graphics;
            object = this;
            if (((bq)object).d != 4 && ((bq)object).d != 5 && ((bq)object).d != 6) {
                if (((bq)object).d == 0 || ((bq)object).d == 1) {
                    object2 = graphics2;
                    for (by2 = 0; by2 < bt.H.length; by2 = (byte)(by2 + 1)) {
                        if (bt.H[by2].e <= 0 || bt.H[by2].b != 0 || !bt.H[by2].c.equals(bt.ad)) continue;
                        if (bt.H[by2].i == 291) {
                            ca.e(object2, t.Q[bt.H[by2].a][0] - 10, t.Q[bt.H[by2].a][1] - 2 - bt.H[by2].i(), bt.H[by2].e * 19 / (bt.H[by2].f <= 0 ? 1 : bt.H[by2].f), 0);
                            ca.e(object2, t.Q[bt.H[by2].a][0] - 10, t.Q[bt.H[by2].a][1] + 3 - bt.H[by2].i(), bt.H[by2].g * 19 / (bt.H[by2].h <= 0 ? 1 : bt.H[by2].h), 1);
                            continue;
                        }
                        ca.e(object2, t.Q[bt.H[by2].a][0] - 10, t.Q[bt.H[by2].a][1] - 9 - bt.H[by2].i(), bt.H[by2].e * 19 / (bt.H[by2].f <= 0 ? 1 : bt.H[by2].f), 0);
                        ca.e(object2, t.Q[bt.H[by2].a][0] - 10, t.Q[bt.H[by2].a][1] - 4 - bt.H[by2].i(), bt.H[by2].g * 19 / (bt.H[by2].h <= 0 ? 1 : bt.H[by2].h), 1);
                    }
                } else if (((bq)object).d == 2 || ((bq)object).d == 3) {
                    Graphics graphics3 = graphics2;
                    object2 = object;
                    for (n3 = 0; n3 < bt.H.length; n3 = (int)((byte)(n3 + 1))) {
                        if (bt.H[n3].e <= 0 || bt.H[n3].b == 0 || bt.H[n3].a != bq.i() + 3) continue;
                        ca.e(graphics3, t.Q[bt.H[n3].a][0] - 10, t.Q[bt.H[n3].a][1] - 9 - bt.H[n3].i(), bt.H[n3].e * 19 / (bt.H[n3].f <= 0 ? 1 : bt.H[n3].f), 0);
                        ca.e(graphics3, t.Q[bt.H[n3].a][0] - 10, t.Q[bt.H[n3].a][1] - 4 - bt.H[n3].i(), bt.H[n3].g * 19 / (bt.H[n3].h <= 0 ? 1 : bt.H[n3].h), 1);
                    }
                }
            }
            for (n2 = 0; n2 < bt.H.length; n2 = (int)((byte)(n2 + 1))) {
                n3 = n2;
                Graphics graphics4 = graphics2;
                object2 = object;
                if (bt.H == null || n3 < 0 || n3 > bt.H.length - 1 || n3 < 0 || bt.H[n3].d()) continue;
                if (object2.i == n3 && (object2.d == 4 || object2.d == 5)) {
                    ca.a(graphics4, bt.H[object2.i].d, 2, 2, 20, 14337302, 0);
                }
                if (bt.H[n3].b == 0) {
                    if (bt.H[n3].i == 291) {
                        ca.e(graphics4, t.Q[bt.H[n3].a][0] - 10, t.Q[bt.H[n3].a][1] - 2 - bt.H[n3].i(), bt.H[n3].e * 19 / bt.H[n3].f, 0);
                        ca.e(graphics4, t.Q[bt.H[n3].a][0] - 10, t.Q[bt.H[n3].a][1] + 3 - bt.H[n3].i(), bt.H[n3].g * 19 / bt.H[n3].h, 1);
                        continue;
                    }
                    ca.e(graphics4, t.Q[bt.H[n3].a][0] - 10, t.Q[bt.H[n3].a][1] - 9 - bt.H[n3].i(), bt.H[n3].e * 19 / bt.H[n3].f, 0);
                    ca.e(graphics4, t.Q[bt.H[n3].a][0] - 10, t.Q[bt.H[n3].a][1] - 4 - bt.H[n3].i(), bt.H[n3].g * 19 / bt.H[n3].h, 1);
                    continue;
                }
                if (bt.H[n3].b != 2) continue;
                ca.e(graphics4, t.Q[bt.H[n3].a][0] - 10, t.Q[bt.H[n3].a][1] - 9 - bt.H[n3].i(), bt.H[n3].e * 19 / bt.H[n3].f, 0);
                ca.e(graphics4, t.Q[bt.H[n3].a][0] - 10, t.Q[bt.H[n3].a][1] - 4 - bt.H[n3].i(), bt.H[n3].g * 19 / bt.H[n3].h, 1);
            }
            for (n2 = 0; n2 < bt.M.length; n2 = (int)((byte)(n2 + 1))) {
                n3 = n2;
                Graphics graphics5 = graphics2;
                object2 = object;
                if (n3 < 0 || bt.M[n3].a()) continue;
                ca.e(graphics5, t.R[bt.M[n3].a][0] - 11, t.R[bt.M[n3].a][1] - 4 - bt.M[n3].d(), bt.M[n3].e * 19 / bt.M[n3].f, 0);
                if (object2.h == n3 && (object2.d == 1 || object2.d == 0 || object2.d == 2 || object2.d == 3 || object2.d == 9)) {
                    ca.a(graphics5, bt.M[n3].d, 2, 2, 20, 14337302, 0);
                    ca.a(graphics5, "" + t.K[bt.M[n3].k], t.b - 2, 2, 24, 14337302, 0);
                }
                if (bt.M[n3].i > 99) {
                    com.yinhan.kjava.main.a.f.a(graphics5, ao.B, null, bt.M[n3].i / 100 + 1, 0, 0, t.R[bt.M[n3].a][0] - 15, t.R[bt.M[n3].a][1] - 11 - bt.M[n3].d(), 0, 0);
                    com.yinhan.kjava.main.a.f.a(graphics5, ao.B, null, (bt.M[n3].i - 100) / 10 + 1, 0, 0, t.R[bt.M[n3].a][0] - 11, t.R[bt.M[n3].a][1] - 11 - bt.M[n3].d(), 0, 0);
                    com.yinhan.kjava.main.a.f.a(graphics5, ao.B, null, bt.M[n3].i % 10 + 1, 0, 0, t.R[bt.M[n3].a][0] - 7, t.R[bt.M[n3].a][1] - 11 - bt.M[n3].d(), 0, 0);
                } else if (bt.M[n3].i > 9) {
                    com.yinhan.kjava.main.a.f.a(graphics5, ao.B, null, bt.M[n3].i / 10 + 1, 0, 0, t.R[bt.M[n3].a][0] - 11, t.R[bt.M[n3].a][1] - 11 - bt.M[n3].d(), 0, 0);
                    com.yinhan.kjava.main.a.f.a(graphics5, ao.B, null, bt.M[n3].i % 10 + 1, 0, 0, t.R[bt.M[n3].a][0] - 7, t.R[bt.M[n3].a][1] - 11 - bt.M[n3].d(), 0, 0);
                } else if (bt.M[n3].i > 1) {
                    com.yinhan.kjava.main.a.f.a(graphics5, ao.B, null, bt.M[n3].i % 10 + 1, 0, 0, t.R[bt.M[n3].a][0] - 11, t.R[bt.M[n3].a][1] - 11 - bt.M[n3].d(), 0, 0);
                }
                if (object2.h != n3 || bt.M[n3].l != 1) continue;
                com.yinhan.kjava.main.a.f.a(graphics5, ao.D, null, -1, 0, 0, 4 + t.i.stringWidth(bt.M[n3].d), 6, 0, 0);
            }
        }
        if (this.f == 0 || this.f == 1) {
            graphics2 = graphics;
            object = this;
            if (((bq)object).d == 4 || ((bq)object).d == 5 || ((bq)object).d == 6 || ((bq)object).d == 7 || ((bq)object).d == 8) {
                if (((bq)object).i >= 0 && ((bq)object).i <= bt.H.length - 1 && bt.H[((bq)object).i].j != null) {
                    ai.a(ao.r, ((bq)object).y.ak);
                    com.yinhan.kjava.main.a.f.a(graphics2, ao.r, null, 0, 0, (int)t.Q[bt.H[((bq)object).i].a][0], t.Q[bt.H[((bq)object).i].a][1] - 10 - bt.H[((bq)object).i].i(), 20, 0);
                }
            } else if (((bq)object).h >= 0 && ((bq)object).h <= bt.M.length - 1) {
                ai.a(ao.r, ((bq)object).y.ak);
                com.yinhan.kjava.main.a.f.a(graphics2, ao.r, null, 0, 0, (int)t.R[bt.M[((bq)object).h].a][0], t.R[bt.M[((bq)object).h].a][1] - 10 - bt.M[((bq)object).h].d(), 20, 0);
            }
        }
        if (this.f == 0) {
            if (this.d == 0) {
                this.b(graphics);
            } else if (this.d == 2) {
                this.c(graphics);
            }
            if (bt.bs >= 0 && bt.s == 0 || t == 1 || t == 2) {
                object = graphics;
                if (s >= 0) {
                    ca.a((Graphics)object, String.valueOf(s), t.b / 2, t.c / 2 - (t.c <= 240 ? t.j : t.j / 2), 17, 0xFF0000, 0);
                }
            }
        } else if (this.f == 3) {
            this.a(graphics);
            this.e(graphics);
        } else if (this.f != 4) {
            if (this.f == 5) {
                graphics2 = graphics;
                object = this;
                if (((bq)object).F != null && ((bq)object).A != null) {
                    ((bq)object).A.a(graphics2, com.yinhan.kjava.main.a.f, 0, 0);
                }
            } else if (this.f == 6) {
                this.a(graphics);
            } else if (this.f == -1) {
                this.a(graphics, "\u8bf7\u7b49\u5f85......");
            } else if (this.f == 9) {
                this.a(graphics, "\u7b49\u5f85\u961f\u53cb......");
            }
        }
        this.d(graphics);
        if (bt.bt && c > 0) {
            ca.a(graphics, "\u81ea\u52a8\u56de\u5408:" + c, t.b - t.i.stringWidth("\u81ea\u52a8\u56de\u5408:" + c) / 2 - 45, 2, 17, 0xFFFFFF, 0);
        }
        if (t.o) {
            graphics.drawImage(com.yinhan.kjava.main.a.U.a, t.b - com.yinhan.kjava.main.a.U.b, t.c - com.yinhan.kjava.main.a.U.c, 20);
        }
        graphics.setClip(0, 0, (int)t.b, (int)t.c);
    }

    private void n() {
        for (int n2 = 0; n2 < this.F.length; n2 = (int)((byte)(n2 + 1))) {
            if (this.F[n2].k < 0 || this.F[n2].b != 1) continue;
            for (int n3 = 0; n3 < bt.M.length; n3 = (int)((byte)(n3 + 1))) {
                if (bt.M[n3] == null || bt.M[n3].a() || this.F[n2].c != bt.M[n3].a) continue;
                bt.M[n3].b((byte)4);
            }
        }
        this.B = this.y.ak;
        this.f = (short)3;
    }

    private void o() {
        block45: {
            if (this.E[0].a == 0) {
                for (int n2 = 0; n2 < bt.H.length; n2 = (int)((byte)(n2 + 1))) {
                    bt.H[n2].l = false;
                    if (bt.H[n2].a != this.E[0].b) continue;
                    if (this.E[0].d == 1 || this.E[0].d == 5 || this.E[0].d == 8 || this.E[0].d == 10) {
                        if (this.E[0].d == 8) {
                            bt.H[n2].n = true;
                        }
                        this.A = null;
                        if (this.E[0].d == 5) {
                            if (this.E[0].e >= 10) {
                                this.A = new cj(this.E[0].e, this.v());
                                block1: for (int n3 = 0; n3 < this.A.b.length; n3 = (int)((byte)(n3 + 1))) {
                                    if (this.F == null) continue;
                                    for (int n4 = 0; n4 < this.F.length; n4 = (int)((byte)(n4 + 1))) {
                                        if (this.F[n4].b == 1 && this.F[n4].l == 0) {
                                            this.F[n4].l = 1;
                                            if (bq.c((int)this.F[n4].c) < 0 || bq.c((int)this.F[n4].c) >= bt.M.length || bt.M[bq.c((int)this.F[n4].c)].m == null) continue block1;
                                            this.A.a(n3, t.R[this.F[n4].c][0], t.R[this.F[n4].c][1]);
                                            continue block1;
                                        }
                                        if (this.F[n4].b != 0 || this.F[n4].l != 0) continue;
                                        this.F[n4].l = 1;
                                        if (bt.H[bq.a((byte)this.F[n4].c)].j == null) continue block1;
                                        this.A.a(n3, t.Q[this.F[n4].c][0], t.Q[this.F[n4].c][1]);
                                        continue block1;
                                    }
                                }
                            }
                        } else if (this.E[0].d == 10) {
                            if (this.E[0].e >= 10) {
                                this.A = new cj(this.E[0].e, 1);
                                if (this.F != null) {
                                    for (int n5 = 0; n5 < this.F.length; n5 = (int)((byte)(n5 + 1))) {
                                        if (this.F[n5].b < 0) continue;
                                        if (this.F[n5].b == 1) {
                                            this.A.a(0, t.R[1][0], t.R[1][1]);
                                            break;
                                        }
                                        if (this.F[n5].b != 0) break;
                                        this.A.a(0, t.Q[1][0], t.Q[1][1]);
                                        break;
                                    }
                                }
                            }
                        } else if (this.E[0].e >= 10) {
                            this.A = new cj(this.E[0].e, this.E[0].e == 22 ? 1 : this.w());
                            block4: for (int n6 = 0; n6 < this.A.b.length; n6 = (int)((byte)(n6 + 1))) {
                                if (this.F == null) continue;
                                for (int n7 = 0; n7 < this.F.length; n7 = (int)((byte)(n7 + 1))) {
                                    if ((this.F[n7].b != 1 || this.F[n7].l != 0) && this.E[0].e != 22) continue;
                                    this.F[n7].l = 1;
                                    if (bq.c((int)this.F[n7].c) < 0 || bq.c((int)this.F[n7].c) >= bt.M.length || bt.M[bq.c((int)this.F[n7].c)].m == null) continue block4;
                                    this.A.a(n6, t.R[this.F[n7].c][0], t.R[this.F[n7].c][1]);
                                    continue block4;
                                }
                            }
                        }
                        bt.H[n2].b((byte)2);
                        this.f = (short)2;
                        this.D = this.y.ak;
                        break block45;
                    }
                    if (this.E[0].d == 2) {
                        bt.H[n2].l = true;
                        this.f = (short)6;
                    } else if (this.E[0].d == 3) {
                        bt.H[n2].m = true;
                    } else {
                        if (this.E[0].d != -1) break;
                        this.B = this.y.ak;
                        this.f = (short)3;
                    }
                    break block45;
                }
                return;
            }
            if (this.E[0].a == 1) {
                for (int n8 = 0; n8 < bt.M.length; n8 = (int)((byte)(n8 + 1))) {
                    bt.M[n8].o = false;
                    if (bt.M[n8].a != this.E[0].b) continue;
                    if (this.E[0].d == 6) break;
                    if (t == 0 || this.E[0].d == 8 || t == 1 && (this.E[0].d == 1 || this.E[0].d == 5) || t == 2 && (this.E[0].d == 1 || this.E[0].d == 5) || t == 1 && (this.E[0].d == 1 || this.E[0].d == 10) || t == 2 && (this.E[0].d == 1 || this.E[0].d == 10)) {
                        if (this.E[0].d == 8) {
                            bt.M[n8].q = true;
                        }
                        bt.M[n8].b((byte)2);
                        this.A = null;
                        if (this.E[0].d == 5) {
                            if (this.E[0].e >= 10) {
                                this.A = new cj(this.E[0].e, this.v());
                                block7: for (int n9 = 0; n9 < this.A.b.length; n9 = (int)((byte)(n9 + 1))) {
                                    if (this.F == null) continue;
                                    for (int n10 = 0; n10 < this.F.length; n10 = (int)((byte)(n10 + 1))) {
                                        if (this.F[n10].b == 0 && this.F[n10].l == 0) {
                                            this.F[n10].l = 1;
                                            if (bq.a(this.F[n10].c) < 0 || bq.a(this.F[n10].c) > bt.H.length - 1 || bt.H[bq.a((byte)this.F[n10].c)].j == null) continue;
                                            this.A.a(n9, t.Q[this.F[n10].c][0], t.Q[this.F[n10].c][1]);
                                            continue block7;
                                        }
                                        if (this.F[n10].b != 1 || this.F[n10].l != 0) continue;
                                        this.F[n10].l = 1;
                                        if (bq.c((int)this.F[n10].c) < 0 || bq.c((int)this.F[n10].c) > bt.M.length - 1 || bt.M[bq.c((int)this.F[n10].c)].m == null) continue;
                                        this.A.a(n9, t.R[this.F[n10].c][0], t.R[this.F[n10].c][1]);
                                        continue block7;
                                    }
                                }
                            }
                        } else if (this.E[0].d == 10) {
                            if (this.E[0].e >= 10) {
                                this.A = new cj(this.E[0].e, 1);
                                if (this.F != null) {
                                    for (int n11 = 0; n11 < this.F.length; n11 = (int)((byte)(n11 + 1))) {
                                        if (this.F[n11].b < 0) continue;
                                        if (this.F[n11].b == 1) {
                                            this.A.a(0, t.R[1][0], t.R[1][1]);
                                            break;
                                        }
                                        if (this.F[n11].b != 0) break;
                                        this.A.a(0, t.Q[1][0], t.Q[1][1]);
                                        break;
                                    }
                                }
                            }
                        } else if (this.E[0].e >= 10) {
                            this.A = new cj(this.E[0].e, this.w());
                            block10: for (int n12 = 0; n12 < this.A.b.length; n12 = (int)((byte)(n12 + 1))) {
                                if (this.F == null) continue;
                                for (int n13 = 0; n13 < this.F.length; n13 = (int)((byte)(n13 + 1))) {
                                    if (this.F[n13].b != 0 || this.F[n13].l != 0 || bq.a(this.F[n13].c) < 0 || bq.a(this.F[n13].c) > bt.H.length - 1 || bt.H[bq.a((byte)this.F[n13].c)].j == null) continue;
                                    this.F[n13].l = 1;
                                    this.A.a(n12, t.Q[this.F[n13].c][0], t.Q[this.F[n13].c][1]);
                                    continue block10;
                                }
                            }
                        }
                        this.f = (short)2;
                        this.D = this.y.ak;
                        return;
                    }
                    if (this.E[0].d == 2) {
                        bt.M[n8].o = true;
                        this.f = (short)6;
                        return;
                    }
                    if (this.E[0].d == 3) {
                        bt.M[n8].p = true;
                        return;
                    }
                    if (this.E[0].d != -1) break;
                    this.B = this.y.ak;
                    this.f = (short)3;
                    return;
                }
            }
        }
    }

    private static void a(Vector vector, Vector vector2) {
        int n2;
        bf bf2 = null;
        for (n2 = 0; n2 < vector.size(); ++n2) {
            bf2 = (bf)vector.elementAt(n2);
            if (vector2.contains(bf2)) continue;
            vector.removeElementAt(n2);
            n2 = 0;
        }
        for (n2 = 0; n2 < vector2.size(); ++n2) {
            bf2 = (bf)vector2.elementAt(n2);
            if (vector.contains(bf2)) continue;
            vector.addElement(bf2);
        }
    }

    private void p() {
        if (this.I - this.C >= 1000L) {
            this.C = this.y.ak;
            if ((s = (short)(s - 1)) <= 0) {
                if (bt.bt && c <= 0) {
                    this.z.O();
                    c = 0;
                    this.e = 5;
                    return;
                }
                this.j = 0;
                this.z.az = this.z.az > bt.ej.length - 1 || this.z.az < 0 ? (byte)0 : this.z.az;
                this.p = bt.ej[this.z.az];
                this.n = 1;
                this.h = this.h > bt.M.length - 1 || this.h < 0 ? (byte)0 : this.h;
                this.a(bt.bt ? (byte)0 : 1, bt.bt ? 0 : 1, (byte)1, bt.M[this.h].a, bt.bt ? (byte)0 : 1, bt.bt ? 0 : 1, (byte)1, bt.M[this.h].a);
                this.f = (short)-1;
                this.e = 5;
                if (!ab.c()) {
                    c = (byte)(bt.bt ? c - 1 : 0);
                }
            }
        }
    }

    private void q() {
        if (bt.en[this.z.az] != -1 && this.z.az >= 0 && this.z.az < 8) {
            this.j = 0;
            this.p = bt.ej[this.z.az];
            if (bq.h() && bt.ek[this.z.az] != 2) {
                this.y.b("\u53ea\u80fd\u4f7f\u7528\u590d\u6d3b\u9053\u5177");
                return;
            }
            if (bt.el[this.z.az] == 2) {
                this.n = 1;
                this.o = bt.M[this.h].a;
                if (bq.c() <= 1 || bq.c() <= bt.em[this.z.az]) {
                    if (this.j()) {
                        this.a(this.j, this.p, this.n, this.o, (byte)1, 1, (byte)1, bt.M[this.h].a);
                        this.f = (short)-1;
                        this.e = 5;
                        return;
                    }
                    this.d = 2;
                    this.e = 3;
                    return;
                }
                this.d = 1;
                return;
            }
            if (bt.el[this.z.az] == 1) {
                this.n = 0;
                this.i = bq.f() < 0 ? this.i : bq.f();
                this.d = 7;
                return;
            }
            if (bt.el[this.z.az] == 0) {
                this.n = 0;
                this.o = this.i = bq.i();
                if (this.j()) {
                    this.a(this.j, this.p, this.n, this.o, (byte)1, 1, (byte)1, (byte)-1);
                    this.f = (short)-1;
                    this.e = 5;
                    return;
                }
                this.d = 2;
                this.e = 3;
            }
        }
    }

    private void r() {
        if (bt.er[this.z.az] == 2) {
            this.l = 1;
            if (bq.c() <= 1 || bq.c() <= bt.es[this.z.az]) {
                this.a(this.j, this.p, this.n, this.o, (byte)0, this.z.az, (byte)1, bt.M[this.h].a);
                this.f = (short)-1;
                this.e = 5;
                return;
            }
            this.k = 0;
            this.q = bt.ep[this.z.az];
            this.d = 3;
            return;
        }
        if (bt.er[this.z.az] == 1) {
            this.l = 0;
            this.k = 0;
            this.q = bt.ep[this.z.az];
            if (bq.b() <= 1 || bq.b() <= bt.es[this.z.az]) {
                this.m = this.i = (byte)(bq.i() + 3);
                this.l = 0;
                this.a(this.j, this.p, this.n, this.o, this.k, this.q, this.l, this.m);
                this.f = (short)-1;
                this.e = 5;
                return;
            }
            this.i = this.g();
            this.d = 8;
            return;
        }
        if (bt.er[this.z.az] == 0) {
            this.k = 0;
            this.q = bt.ep[this.z.az];
            this.m = (byte)(bq.i() + 3);
            this.l = 0;
            this.i = this.g();
            this.a(this.j, this.p, this.n, this.o, this.k, this.q, this.l, this.m);
            this.f = (short)-1;
            this.e = 5;
        }
    }

    private boolean b(int n2) {
        return bq.c() <= 1 || bt.ek != null && bq.c() <= bt.em[this.z.az];
    }

    public static int b() {
        int n2 = 0;
        for (int n3 = 0; n3 < bt.H.length; n3 = (int)((byte)(n3 + 1))) {
            if (bt.H[n3].e <= 0) continue;
            n2 = (byte)(n2 + 1);
        }
        return n2;
    }

    public static int c() {
        int n2 = 0;
        for (int n3 = 0; n3 < bt.M.length; n3 = (int)((byte)(n3 + 1))) {
            if (bt.M[n3].e <= 0) continue;
            ++n2;
        }
        return n2;
    }

    /*
     * Unable to fully structure code
     */
    public final void a(byte var1_1, int var2_3, byte var3_4, byte var4_5, byte var5_6, int var6_7, byte var7_8, byte var8_9) {
        block15: {
            block17: {
                block16: {
                    block10: {
                        block9: {
                            block12: {
                                block13: {
                                    block14: {
                                        block11: {
                                            if (var1_1 == 4 || !bq.a(var3_4, var4_5) || var3_4 != 0) break block10;
                                            var10_10 = var2_3;
                                            var9_11 = var1_1;
                                            if (var9_11 != 2) break block11;
                                            var9_12 = null;
                                            for (var11_14 = 0; var11_14 < bt.bC.size(); ++var11_14) {
                                                var9_12 = (bn)bt.bC.elementAt(var11_14);
                                                if (var9_12 == null || var10_10 != var9_12.a || var9_12.f != 2) continue;
                                                v0 = true;
                                                break block9;
                                            }
                                            break block12;
                                        }
                                        if (var9_11 != 0) break block13;
                                        if (bt.ek[var10_10] != 2) break block14;
                                        v0 = true;
                                        break block9;
                                    }
                                    if (bt.ek[var10_10] != 6 || bt.el[var10_10] != 1) break block12;
                                    v0 = true;
                                    break block9;
                                }
                                if (var9_11 == 1) {
                                    for (var9_11 = 0; var9_11 < bt.dy.length; ++var9_11) {
                                        if (var10_10 != bt.dv[var9_11] || bt.dy[var9_11] != 1) continue;
                                        v0 = true;
                                        break block9;
                                    }
                                }
                            }
                            v0 = false;
                        }
                        if (!v0) {
                            this.y.b("\u4e0d\u80fd\u5bf9\u6b7b\u4ea1\u76ee\u6807\u4f7f\u7528");
                            return;
                        }
                    }
                    if (var5_6 == 4 || !bq.a(var7_8, var8_9) || var3_4 != 0) break block15;
                    var10_10 = var6_7;
                    var9_13 = var5_6;
                    if (var9_13 == 2) ** GOTO lbl-1000
                    if (var9_13 != 0) break block16;
                    if (bt.eq == null || bt.eq[var10_10] != 2) ** GOTO lbl-1000
                    v1 = true;
                    break block17;
                }
                if (var9_13 == 1 && bt.cU != null) {
                    for (var9_13 = 0; var9_13 < bt.cU.length; ++var9_13) {
                        if (var10_10 != bt.cR[var9_13] || bt.cU[var9_13] != 1) continue;
                        v1 = true;
                        break;
                    }
                } else lbl-1000:
                // 4 sources

                {
                    v1 = false;
                }
            }
            if (!v1) {
                this.y.b("\u4e0d\u80fd\u5bf9\u6b7b\u4ea1\u76ee\u6807\u4f7f\u7528");
                return;
            }
        }
        if ((var1_2 = bz.a((short)4180, bt.ad, bt.v, bq.g, bq.t, (byte)var1_1, var2_3, var3_4, var4_5, (short)var5_6, var6_7, var7_8, var8_9)) != null) {
            com.yinhan.kjava.main.a.i.a(new w(4180, var1_2));
            this.J = false;
            this.d = 0;
            return;
        }
        this.y.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
    }

    private static boolean a(byte by2, byte by3) {
        block3: {
            block2: {
                if (by2 != 0) break block2;
                for (by2 = 0; by2 < bt.H.length; by2 = (byte)(by2 + 1)) {
                    if (bt.H[by2].a != by3 || bt.H[by2].e > 0) continue;
                    return true;
                }
                break block3;
            }
            if (by2 != 1) break block3;
            for (by2 = 0; by2 < bt.M.length; by2 = (byte)(by2 + 1)) {
                if (bt.M[by2].a != by3 || bt.M[by2].e > 0) continue;
                return true;
            }
        }
        return false;
    }

    private void a(Graphics graphics) {
        if (this.F == null || this.F.length <= 0) {
            return;
        }
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        for (int n6 = 0; n6 < this.F.length; n6 = (int)((byte)(n6 + 1))) {
            int n7;
            if (this.F[n6].b == 1 && this.F[n6].d != 0 && bq.c((int)this.F[n6].c) >= 0 && bq.c((int)this.F[n6].c) < bt.M.length) {
                int n8;
                int n9 = this.F[n6].d;
                short s2 = t.R[this.F[n6].c][0];
                int n10 = t.R[this.F[n6].c][1] - bt.M[bq.c((int)this.F[n6].c)].d();
                if (this.F[n6].f <= 24) {
                    n8 = this.F[n6].f + 4;
                    this.F[n6].f = this.F[n6].f;
                } else {
                    n8 = 24;
                }
                this.a(graphics, n9, s2, n10 - n8 + n2 * 10, 1, 0, 0);
                n2 = (byte)(n2 + 1);
            }
            if (this.F[n6].b == 1 && this.F[n6].e != 0 && bq.c((int)this.F[n6].c) >= 0 && bq.c((int)this.F[n6].c) < bt.M.length) {
                int n11;
                int n12 = this.F[n6].e;
                short s3 = t.R[this.F[n6].c][0];
                int n13 = t.R[this.F[n6].c][1] - bt.M[bq.c((int)this.F[n6].c)].d();
                if (this.F[n6].f <= 24) {
                    n11 = this.F[n6].f + 4;
                    this.F[n6].f = this.F[n6].f;
                } else {
                    n11 = 24;
                }
                this.a(graphics, n12, s3, n13 - n11 + n3 * 10, 0, 0, 0);
                n3 = (byte)(n3 + 1);
            }
            if (this.F[n6].b == 0 && this.F[n6].d != 0 && bq.a(this.F[n6].c) >= 0 && bq.a(this.F[n6].c) < bt.H.length) {
                int n14;
                int n15 = this.F[n6].d;
                int n16 = t.Q[this.F[n6].c][0] + 10;
                int n17 = t.Q[this.F[n6].c][1] - bt.H[bq.a(this.F[n6].c)].i();
                if (this.F[n6].f <= 24) {
                    n14 = this.F[n6].f + 4;
                    this.F[n6].f = this.F[n6].f;
                } else {
                    n14 = 24;
                }
                this.a(graphics, n15, n16, n17 - n14 + n4 * 10, 1, 0, 1);
                n4 = (byte)(n4 + 1);
            }
            if (this.F[n6].b != 0 || this.F[n6].e == 0 || bq.a(this.F[n6].c) < 0 || bq.a(this.F[n6].c) >= bt.H.length) continue;
            int n18 = this.F[n6].e;
            int n19 = t.Q[this.F[n6].c][0] + 10;
            int n20 = t.Q[this.F[n6].c][1] - bt.H[bq.a(this.F[n6].c)].i();
            if (this.F[n6].f <= 24) {
                n7 = this.F[n6].f + 4;
                this.F[n6].f = this.F[n6].f;
            } else {
                n7 = 24;
            }
            this.a(graphics, n18, n19, n20 - n7 + n5 * 10, 0, 0, 1);
            n5 = (byte)(n5 + 1);
        }
    }

    private void a(Graphics graphics, String string) {
        if (this.y.j != 2) {
            if (this.K == null) {
                this.K = ca.a(string, t.i, t.b / 2 - 20, "/t");
            }
            if (this.K != null) {
                ca.a(graphics, (t.b - t.k * 10) / 2, (t.c - t.j * this.K.length - 20) / 2, t.k * 10, t.j * this.K.length + 20);
                for (int i2 = 0; i2 < this.K.length; ++i2) {
                    ca.a(graphics, this.K[i2], t.b / 2, (t.c - t.j * this.K.length - 20) / 2 + 10 + i2 * t.j, 17, ca.a, 0);
                }
            }
        }
    }

    public final void d() {
        this.y.p = true;
        this.y.b();
        if (this.v != null) {
            this.v.removeAllElements();
            this.v = null;
        }
        if (this.w != null) {
            this.w.removeAllElements();
            this.w = null;
        }
        if (this.A != null) {
            this.A = null;
        }
        bq.e();
        this.y.b();
        bt.p();
        this.y.b();
        this.z.c = false;
        this.y.b();
        this.u = null;
        this.z.T();
        this.y.b();
        bt.g();
        this.y.b();
        com.yinhan.kjava.main.a.f.a(this.z.f, ao.h, ao.i, true, false, 1283472);
        this.y.b();
        this.z.j();
        this.y.b();
        this.y.p = false;
        r = System.currentTimeMillis();
        g = -1;
    }

    public static void e() {
        int n2;
        if (bt.M != null) {
            for (n2 = 0; n2 < bt.M.length; n2 = (int)((byte)(n2 + 1))) {
                if (bt.M[n2] == null) continue;
                bt.M[n2].b();
                bt.M[n2] = null;
            }
            bt.M = null;
        }
        if (bt.H != null) {
            for (n2 = 0; n2 < bt.H.length; n2 = (int)((byte)(n2 + 1))) {
                if (bt.H[n2] == null) continue;
                bt.H[n2].e();
                bt.H[n2] = null;
            }
            bt.H = null;
        }
    }

    private static void a(p p2, ae ae2) {
        p2.e = ae2.g;
        p2.g = ae2.h;
        p2.f = ae2.i;
        p2.h = ae2.j;
        if (p2.c.equals(bt.ad) && bt.x != -1) {
            bt.aN = p2.e;
            bt.aP = p2.g;
            bt.aM = p2.f;
            bt.aO = p2.h;
        }
    }

    public final int a(int n2, int n3) {
        if (this.L != null) {
            for (int i2 = 0; i2 < this.L.length; ++i2) {
                if (n2 < this.L[i2][0] || n2 > this.L[i2][0] + this.L[i2][2] || n3 < this.L[i2][1] || n3 > this.L[i2][1] + this.L[i2][3]) continue;
                this.e = i2;
                return 0x40000000;
            }
        }
        return 0;
    }

    private void b(Graphics graphics) {
        if (ao.Z != null) {
            block7: for (int n2 = 0; n2 < 5; n2 = (int)((byte)(n2 + 1))) {
                short s2 = ao.Z.c;
                int n3 = 25;
                int n4 = t.c - 102 + (n2 << 4);
                n3 = 1;
                int n5 = n2;
                bq bq2 = this;
                if (bq2.L != null && bq2.L.length > n5) {
                    bq2.L[n5][0] = 1;
                    bq2.L[n5][1] = n4;
                    bq2.L[n5][2] = 25;
                    bq2.L[n5][3] = s2;
                }
                com.yinhan.kjava.main.a.f.a(graphics, ao.Z, null, n2 + 1, 0, 0, 1, t.c - 102 + (n2 << 4), 0, 0);
                if (n2 != this.e) continue;
                graphics.setColor(0xFF0000);
                ca.d(graphics, 1, t.c - 102 + (this.e << 4), 25, 15);
                switch (this.e) {
                    case 0: {
                        ca.a(graphics, "\u653b\u51fb", t.b / 2, t.c - 22 - t.j, 17, 0xFFFF00, 0);
                        continue block7;
                    }
                    case 1: {
                        ca.a(graphics, "\u9632\u5fa1", t.b / 2, t.c - 22 - t.j, 17, 0xFFFF00, 0);
                        continue block7;
                    }
                    case 2: {
                        ca.a(graphics, "\u6280\u80fd", t.b / 2, t.c - 22 - t.j, 17, 0xFFFF00, 0);
                        continue block7;
                    }
                    case 3: {
                        ca.a(graphics, "\u9053\u5177", t.b / 2, t.c - 22 - t.j, 17, 0xFFFF00, 0);
                        continue block7;
                    }
                    case 4: {
                        ca.a(graphics, "\u9003\u8dd1", t.b / 2, t.c - 22 - t.j, 17, 0xFFFF00, 0);
                    }
                }
            }
        }
    }

    public final int b(int n2, int n3) {
        if (this.M != null) {
            for (int i2 = 0; i2 < this.M.length; ++i2) {
                if (n2 < this.M[i2][0] || n2 > this.M[i2][0] + this.M[i2][2] || n3 < this.M[i2][1] || n3 > this.M[i2][1] + this.M[i2][3]) continue;
                this.e = i2;
                return 0x40000000;
            }
        }
        return 0;
    }

    private void c(Graphics graphics) {
        if (ao.Z != null) {
            block5: for (int n2 = 0; n2 < 3; n2 = (int)((byte)(n2 + 1))) {
                short s2 = ao.Z.c;
                int n3 = 25;
                int n4 = t.c - 70 + (n2 << 4);
                n3 = 1;
                int n5 = n2;
                bq bq2 = this;
                if (bq2.M != null && bq2.M.length > n5) {
                    bq2.M[n5][0] = 1;
                    bq2.M[n5][1] = n4;
                    bq2.M[n5][2] = 25;
                    bq2.M[n5][3] = s2;
                }
                com.yinhan.kjava.main.a.f.a(graphics, ao.Z, null, n2 + 1, 0, 0, 1, t.c - 70 + (n2 << 4), 0, 0);
                if (n2 != this.e) continue;
                graphics.setColor(0xFF0000);
                ca.d(graphics, 1, t.c - 70 + (n2 << 4), 25, 15);
                switch (this.e) {
                    case 0: {
                        ca.a(graphics, "\u653b\u51fb", t.b / 2, t.c - 22 - t.j, 17, 0xFFFF00, 0);
                        continue block5;
                    }
                    case 1: {
                        ca.a(graphics, "\u9632\u5fa1", t.b / 2, t.c - 22 - t.j, 17, 0xFFFF00, 0);
                        continue block5;
                    }
                    case 2: {
                        ca.a(graphics, "\u6280\u80fd", t.b / 2, t.c - 22 - t.j, 17, 0xFFFF00, 0);
                    }
                }
            }
        }
    }

    public final int a(int n2, int n3, int n4) {
        if (this.N != null) {
            if ((n2 == 0 ? 5 : (n2 = n2 == 2 ? 3 : 0)) == 0) {
                return 0;
            }
            for (int i2 = 0; i2 < this.N.length; ++i2) {
                if (n3 < this.N[i2][0] || n3 > this.N[i2][0] + this.N[i2][2] || n4 < this.N[i2][1] || n4 > this.N[i2][1] + this.N[i2][3]) continue;
                if (this.z.az != i2 || this.e != n2) {
                    this.e = n2;
                    this.z.az = (byte)(i2 - 1);
                    return 2;
                }
                if (this.z.az != i2 || this.e != n2) continue;
                return this.O[i2];
            }
        }
        return 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void d(Graphics graphics) {
        int n2;
        if (bt.ej == null) {
            return;
        }
        if (this.d == 0 || this.d == 1 || this.d == 4) {
            this.z.a(graphics, 0, t.c - 22, 0);
        } else {
            this.z.a(graphics, 0, t.c - 22, 1);
        }
        for (n2 = 0; n2 < bt.ej.length; n2 = (int)((byte)(n2 + 1))) {
            int n3;
            Object v3;
            bf bf2;
            Graphics graphics2;
            ai ai2;
            if (n2 >= 0 && n2 < 8) {
                ai2 = com.yinhan.kjava.main.a.f;
                graphics2 = graphics;
                bf2 = com.yinhan.kjava.main.a.n;
                v3 = null;
                n3 = n2 + 1;
            } else {
                com.yinhan.kjava.main.a.f.a(graphics, ao.F, null, n2 == 8 ? 0 : 2, 0, 0, 3 + bt.ej[n2] * 17, t.c - 19, 0, 0);
                ai2 = com.yinhan.kjava.main.a.f;
                graphics2 = graphics;
                bf2 = ao.G;
                v3 = null;
                n3 = n2 == 8 ? 0 : 1;
            }
            ai2.a(graphics2, bf2, v3, n3, 0, 0, 3 + bt.ej[n2] * 17, t.c - 19, 0, 0);
            int n4 = 17;
            n4 = 17;
            int n5 = t.c - 19;
            int n6 = 3 + n2 * 17;
            int n7 = n2;
            bq bq2 = this;
            if (bq2.N == null || bq2.N.length <= n7) continue;
            bq2.N[n7][0] = n6;
            bq2.N[n7][1] = n5;
            bq2.N[n7][2] = 17;
            bq2.N[n7][3] = 17;
        }
        if ((this.e != 5 || bt.ej == null) && (this.e != 3 || bt.ej == null || this.d <= 1)) return;
        for (n2 = 0; n2 < bt.ej.length; n2 = (int)((byte)(n2 + 1))) {
            if (n2 != this.z.az) continue;
            graphics.setColor(0xFF0000);
            ca.d(graphics, 2 + n2 * 17, t.c - 20, 17, 17);
            if (this.f != 0) return;
            switch (this.z.az) {
                case 0: 
                case 1: 
                case 2: 
                case 3: 
                case 4: 
                case 5: 
                case 6: 
                case 7: {
                    if (this.d == 0) {
                        if (bt.en[this.z.az] == -1) return;
                        ca.a(graphics, bt.eo[this.z.az], t.b / 2, t.c - 22 - t.j, 17, 0xFFFF00, 0);
                        return;
                    } else {
                        if (this.d != 2 || bt.et[this.z.az] == -1) return;
                        ca.a(graphics, bt.eu[this.z.az], t.b / 2, t.c - 22 - t.j, 17, 0xFFFF00, 0);
                        return;
                    }
                }
                case 8: {
                    ca.a(graphics, "\u804a\u5929\u8bb0\u5f55", t.b / 2, t.c - 22 - t.j, 17, 0xFFFF00, 0);
                    return;
                }
                case 9: {
                    ca.a(graphics, "\u81ea\u52a8\u6253\u602a", t.b / 2, t.c - 22 - t.j, 17, 0xFFFF00, 0);
                }
                default: {
                    return;
                }
            }
        }
    }

    private void e(Graphics graphics) {
        if (this.u != null) {
            for (int n2 = 0; n2 < this.u.length; n2 = (int)((byte)(n2 + 1))) {
                ca.a(graphics, this.u[n2], t.b / 2, (t.c - this.u.length * t.j) / 2 + n2 * t.j, 17, 15849739, 0);
            }
        }
    }

    private int s() {
        if (((bq)object).A != null) {
            long l2 = ((bq)object).y.ak;
            Object object = com.yinhan.kjava.main.a.f;
            object = ((bq)object).A;
            return ai.a(((cj)object).a, l2);
        }
        return 0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void a(i[] iArray) {
        if (this.v == null) {
            return;
        }
        for (int i2 = 0; i2 < bt.H.length; ++i2) {
            if (bt.H[i2] == null) continue;
            bt.H[i2].m = false;
            bt.H[i2].l = false;
        }
        Vector vector = this.v;
        synchronized (vector) {
            this.v.addElement(iArray);
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void a(ae[] aeArray) {
        if (this.w == null) {
            return;
        }
        Vector vector = this.w;
        synchronized (vector) {
            this.w.addElement(aeArray);
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void a(String string) {
        if (this.x == null) {
            return;
        }
        Vector vector = this.x;
        synchronized (vector) {
            this.x.addElement(ca.a(string, t.i, t.b * 5 / 7, "\t"));
            return;
        }
    }

    public static byte f() {
        for (byte by2 = 0; by2 < bt.H.length; by2 = (byte)(by2 + 1)) {
            if (!bt.H[by2].c.equals(bt.ad)) continue;
            return by2;
        }
        return -1;
    }

    public final byte g() {
        for (byte by2 = 0; by2 < bt.H.length; by2 = (byte)((byte)(by2 + 1))) {
            if (bt.H[by2].b == 0 || bt.H[by2].a != bq.i() + 3) continue;
            return by2;
        }
        return -1;
    }

    private static boolean t() {
        if (bt.M != null) {
            for (int n2 = 0; n2 < bt.M.length; n2 = (int)((byte)(n2 + 1))) {
                if (bt.M[n2] == null || bt.M[n2].e <= 0) continue;
                return false;
            }
        }
        return true;
    }

    private static boolean u() {
        if (bt.H != null) {
            for (int n2 = 0; n2 < bt.H.length; n2 = (int)((byte)(n2 + 1))) {
                if (bt.H[n2] == null || bt.H[n2].e <= 0 || bt.H[n2].b == 2) continue;
                return false;
            }
        }
        return true;
    }

    private static int a(byte by2) {
        for (int n2 = 0; n2 < bt.H.length; n2 = (int)((byte)(n2 + 1))) {
            if (bt.H[n2].a != by2) continue;
            return n2;
        }
        return -1;
    }

    private static int c(int n2) {
        for (int n3 = 0; n3 < bt.M.length; n3 = (int)((byte)(n3 + 1))) {
            if (bt.M[n3].a != n2) continue;
            return n3;
        }
        return -1;
    }

    public static boolean h() {
        for (int n2 = 0; n2 < bt.H.length; n2 = (int)((byte)(n2 + 1))) {
            if (bt.H[n2].b != 0 || !bt.H[n2].c.equals(bt.ad) || bt.H[n2].e > 0) continue;
            return true;
        }
        return false;
    }

    public static byte i() {
        for (int n2 = 0; n2 < bt.H.length; n2 = (int)((byte)(n2 + 1))) {
            if (bt.H[n2].b != 0 || !bt.H[n2].c.equals(bt.ad)) continue;
            return bt.H[n2].a;
        }
        return -1;
    }

    public final boolean j() {
        for (int n2 = 0; n2 < bt.H.length; n2 = (int)((byte)(n2 + 1))) {
            if (bt.H[n2].b == 0 || bt.H[n2].a != bq.i() + 3 || bt.H[n2].e <= 0) continue;
            return false;
        }
        return true;
    }

    private static byte b(byte by2) {
        if ((by2 = (byte)(by2 - 1)) < 0) {
            by2 = (byte)(bt.M.length - 1);
        }
        while (bt.M[by2].a()) {
            if ((by2 = (byte)(by2 - 1)) >= 0) continue;
            by2 = (byte)(bt.M.length - 1);
        }
        return by2;
    }

    private static byte c(byte by2) {
        if ((by2 = (byte)(by2 - 1)) < 0) {
            by2 = (byte)(bt.H.length - 1);
        }
        return by2;
    }

    private byte v() {
        byte by2 = 0;
        if (this.F != null) {
            for (int n2 = 0; n2 < this.F.length; n2 = (int)((byte)(n2 + 1))) {
                if (this.F[n2].a < 5) continue;
                by2 = (byte)(by2 + 1);
            }
        }
        return by2;
    }

    private int w() {
        int n2 = 0;
        if (this.F != null) {
            for (int n3 = 0; n3 < this.F.length; n3 = (int)((byte)(n3 + 1))) {
                if (this.F[n3].b == this.E[0].a) continue;
                ++n2;
            }
        }
        return n2;
    }

    private static boolean x() {
        int n2;
        for (n2 = 0; n2 < bt.H.length; n2 = (int)((byte)(n2 + 1))) {
            if (bt.H[n2].d() || bt.H[n2].k == 1) continue;
            return false;
        }
        for (n2 = 0; n2 < bt.M.length; n2 = (int)((byte)(n2 + 1))) {
            if (bt.M[n2].a() || bt.M[n2].n == 1) continue;
            return false;
        }
        return true;
    }

    public static void k() {
        if (bt.bt) {
            P = s;
            if (P <= 0) {
                P = 1;
            }
            b = 1;
            s = 1;
        } else {
            s = P;
        }
        b = bt.bt ? (short)1 : (short)a;
        s = b;
        c = (short)(bt.bt ? 25 : 0);
        ao.aW[15] = (byte)(!bt.bt ? 1 : 0);
    }

    public final void l() {
        this.d();
        this.z.k = 0;
        this.z.j = 0;
    }

    public final void m() {
        for (int i2 = 0; i2 < bt.H.length; ++i2) {
            if (!bt.H[i2].c.equals(bt.ad)) continue;
            this.i = (byte)i2;
            return;
        }
    }

    private static boolean y() {
        for (int i2 = 0; i2 < bt.H.length; ++i2) {
            if (!bt.H[i2].c.equals(bt.ad) || !bt.H[i2].o) continue;
            return true;
        }
        return false;
    }

    private static boolean d(byte by2) {
        return by2 == 4 || by2 == 6 || by2 == 7 || by2 == 5;
    }

    private void a(Graphics graphics, int n2, int n3, int n4, int n5, int n6, int n7) {
        int n8 = 0;
        int n9 = 0;
        for (n6 = n2 >= 0 ? n2 : -n2; n6 > 0; n6 /= 10) {
            n8 = n9++;
        }
        n9 = n7 == 0 ? (n8 + 2) / 2 * 7 : (n8 + 2) * 7;
        graphics.drawRegion(ao.E.a, n2 >= 0 ? 8 : 0, n5 == 0 ? 0 : 10, 8, 10, 0, n3 - n9, n4, 0);
        n6 = n2 >= 0 ? n2 : -n2;
        for (n2 = n8; n2 >= 0; --n2) {
            graphics.drawRegion(ao.E.a, 16 + n6 / bq.d(n2) * 7, n5 == 0 ? 0 : 10, 7, 10, 0, n3 + 8 + (n8 - n2) * 7 - n9, n4, 0);
            n6 %= bq.d(n2);
        }
    }

    private static int d(int n2) {
        int n3 = 1;
        for (int i2 = 0; i2 < n2; ++i2) {
            n3 *= 10;
        }
        return n3;
    }

    static {
        g = -1;
        r = 0L;
        s = b;
        P = a;
    }
}


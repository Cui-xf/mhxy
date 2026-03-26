package defpackage;

import com.yinhan.kjava.main.a;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

/* loaded from: java版梦回西游3区251011.jar:bq.class */
public final class bq {
    public static short c;
    private static short t;
    private String[] u;
    private a y;
    private ao z;
    private cj A;
    public int d;
    public int e;
    private long B;
    private long C;
    private i[] E;
    private ae[] F;
    public short f;
    public byte h;
    public byte i;
    public byte j;
    public byte k;
    public byte l;
    public byte m;
    public byte n;
    public byte o;
    public int p;
    public int q;
    private String[] K;
    public static byte a = 25;
    public static short b = (short) 25;
    public static int g = -1;
    public static long r = 0;
    public static short s = b;
    private static short P = a;
    private Vector v = new Vector();
    private Vector w = new Vector();
    private Vector x = new Vector();
    private long D = -1;
    private bf G = null;
    private Vector H = new Vector();
    private long I = 0;
    private boolean J = false;
    private int[][] L = new int[5][4];
    private int[][] M = new int[3][4];
    private int[][] N = new int[10][4];
    private int[] O = {513, 514, 515, 516, 517, 518, 519, 520, 1024, 2048};
    private boolean Q = true;

    public bq(a aVar, ao aoVar, byte b2) {
        this.y = aVar;
        this.z = aoVar;
        t = b2;
        aVar.b();
        bt.v = bt.w;
        a();
        aVar.b();
    }

    public final void a() {
        int i = (t.b - 176) / 4;
        int i2 = (t.c - 208) / 6;
        t.Q = new short[6][2];
        short[][] sArr = new short[6][2];
        t.R = sArr;
        sArr[0][0] = (short) (t.T[0][0] + i);
        t.R[0][1] = (short) (t.T[0][1] + (i2 << 1));
        t.R[1][0] = (short) (t.T[1][0] + (i << 1));
        t.R[1][1] = (short) (t.T[1][1] + (i2 << 1));
        t.R[2][0] = (short) (t.T[2][0] + (i * 3));
        t.R[2][1] = (short) (t.T[2][1] + (i2 << 1));
        t.R[3][0] = (short) (t.T[3][0] + i);
        t.R[3][1] = (short) (t.T[3][1] + i2);
        t.R[4][0] = (short) (t.T[4][0] + (i << 1));
        t.R[4][1] = (short) (t.T[4][1] + i2);
        t.R[5][0] = (short) (t.T[5][0] + (i * 3));
        t.R[5][1] = (short) (t.T[5][1] + i2);
        t.Q[0][0] = (short) (t.S[0][0] + i);
        t.Q[0][1] = (short) (t.S[0][1] + (i2 * 5));
        t.Q[1][0] = (short) (t.S[1][0] + (i << 1));
        t.Q[1][1] = (short) (t.S[1][1] + (i2 * 5));
        t.Q[2][0] = (short) (t.S[2][0] + (i * 3));
        t.Q[2][1] = (short) (t.S[2][1] + (i2 * 5));
        t.Q[3][0] = (short) (t.S[3][0] + i);
        t.Q[3][1] = (short) (t.S[3][1] + (i2 << 2));
        t.Q[4][0] = (short) (t.S[4][0] + (i << 1));
        t.Q[4][1] = (short) (t.S[4][1] + (i2 << 2));
        t.Q[5][0] = (short) (t.S[5][0] + (i * 3));
        t.Q[5][1] = (short) (t.S[5][1] + (i2 << 2));
        bt.H = new p[bt.I.length];
        if (t == 0) {
            bt.M = new ck[bt.N.length];
        } else if (t == 1 || t == 2) {
            bt.M = new ck[bt.J.length];
        }
        for (int i3 = 0; i3 < bt.I.length; i3++) {
            bt.H[i3] = bt.I[i3].c();
            bt.H[i3].b((byte) 1);
        }
        if (t == 0) {
            byte b2 = 0;
            while (true) {
                byte b3 = b2;
                if (b3 >= bt.N.length) {
                    break;
                }
                ck[] ckVarArr = bt.M;
                ck ckVar = bt.N[b3];
                ck ckVar2 = new ck();
                ckVar2.a = ckVar.a;
                ckVar2.b = ckVar.b;
                ckVar2.c = ckVar.c;
                ckVar2.d = ckVar.d;
                ckVar2.e = ckVar.e;
                ckVar2.f = ckVar.f;
                ckVar2.g = ckVar.g;
                ckVar2.h = ckVar.h;
                ckVar2.j = ckVar.j;
                ckVar2.n = ckVar.n;
                ckVar2.m = ckVar.m;
                ckVar2.r = ckVar.r;
                ckVar2.s = ckVar.s;
                ckVar2.t = ckVar.t;
                ckVar2.i = ckVar.i;
                ckVar2.k = ckVar.k;
                ckVar2.l = ckVar.l;
                ckVarArr[b3] = ckVar2;
                bt.M[b3].b((byte) 1);
                b2 = (byte) (b3 + 1);
            }
        } else if (t == 1 || t == 2) {
            byte b4 = 0;
            while (true) {
                byte b5 = b4;
                if (b5 >= bt.J.length) {
                    break;
                }
                bt.M[b5] = bt.J[b5].b();
                bt.M[b5].b((byte) 1);
                b4 = (byte) (b5 + 1);
            }
        }
        if (bt.I != null) {
            byte b6 = 0;
            while (true) {
                byte b7 = b6;
                if (b7 >= bt.I.length) {
                    break;
                }
                if (bt.I[b7] != null) {
                    bt.I[b7].e();
                    bt.I[b7] = null;
                }
                b6 = (byte) (b7 + 1);
            }
            bt.I = null;
        }
        if (t == 0) {
            if (bt.N != null) {
                byte b8 = 0;
                while (true) {
                    byte b9 = b8;
                    if (b9 >= bt.N.length) {
                        break;
                    }
                    if (bt.N[b9] != null) {
                        bt.N[b9].b();
                        bt.N[b9] = null;
                    }
                    b8 = (byte) (b9 + 1);
                }
                bt.N = null;
            }
        } else if (bt.J != null) {
            byte b10 = 0;
            while (true) {
                byte b11 = b10;
                if (b11 >= bt.J.length) {
                    break;
                }
                if (bt.J[b11] != null) {
                    bt.J[b11].e();
                    bt.J[b11] = null;
                }
                b10 = (byte) (b11 + 1);
            }
            bt.J = null;
        }
        bt.K = bt.L;
        bt.L = (short) -1;
        if (bt.K == 2 && bt.bs != -1 && bt.s == 0) {
            this.f = (short) 9;
        } else {
            this.f = (short) 0;
        }
        this.d = 0;
        this.h = (byte) 0;
        this.e = 5;
        this.z.az = (byte) 0;
        if (bt.bt) {
            b = (short) 1;
            s = (short) 1;
            P = a;
        } else {
            short s2 = a;
            b = s2;
            s = s2;
            P = s2;
        }
        this.C = System.currentTimeMillis();
    }

    public final void a(int i) {
        byte b2;
        byte b3;
        byte b4;
        byte b5;
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        byte b6;
        if (bt.bs == 0 && bt.s == 0 && g > 0) {
            d();
            return;
        }
        if (this.f != 10) {
            if (ao.ac != null) {
                ai.a(ao.ac, this.y.ak);
            }
            if (ao.ad != null) {
                ai.a(ao.ad, this.y.ak);
            }
            if (ao.ae != null) {
                ai.a(ao.ae, this.y.ak);
            }
            if (bt.H != null) {
                byte b7 = 0;
                while (true) {
                    byte b8 = b7;
                    if (b8 >= bt.H.length) {
                        break;
                    }
                    if (bt.H[b8].k == 1) {
                        p pVar = bt.H[b8];
                        ai aiVar = a.f;
                        long j = this.y.ak;
                        if (pVar.j != null && !pVar.d()) {
                            ai.a(pVar.j, j);
                        }
                        if (this.F != null) {
                            byte b9 = 0;
                            while (true) {
                                byte b10 = b9;
                                if (b10 < this.F.length) {
                                    if (this.F[b10].b == 0 && this.F[b10].c == bt.H[b8].a) {
                                        a(bt.H[b8], this.F[b10]);
                                    }
                                    b9 = (byte) (b10 + 1);
                                }
                            }
                        }
                    } else if (bt.H[b8].k == 2) {
                        if (bt.H[b8].j == null || ai.a(bt.H[b8].j, this.y.ak) == 2) {
                            bt.H[b8].b((byte) 1);
                            if (this.F != null) {
                                byte b11 = 0;
                                while (true) {
                                    byte b12 = b11;
                                    if (b12 >= this.F.length) {
                                        break;
                                    }
                                    if (this.F[b12].b == 0 && this.F[b12].c == bt.H[b8].a) {
                                        a(bt.H[b8], this.F[b12]);
                                    }
                                    b11 = (byte) (b12 + 1);
                                }
                            }
                            if (this.A == null) {
                                byte b13 = 0;
                                while (true) {
                                    byte b14 = b13;
                                    if (b14 >= bt.M.length) {
                                        break;
                                    }
                                    if (this.F != null) {
                                        byte b15 = 0;
                                        while (true) {
                                            byte b16 = b15;
                                            if (b16 >= this.F.length) {
                                                break;
                                            }
                                            if (this.F[b16].b == 1 && bt.M[b14].a == this.F[b16].c) {
                                                bt.M[b14].b((byte) 4);
                                                break;
                                            }
                                            b15 = (byte) (b16 + 1);
                                        }
                                    }
                                    b13 = (byte) (b14 + 1);
                                }
                                byte b17 = 0;
                                while (true) {
                                    byte b18 = b17;
                                    if (b18 >= bt.H.length) {
                                        break;
                                    }
                                    if (this.F != null) {
                                        byte b19 = 0;
                                        while (true) {
                                            byte b20 = b19;
                                            if (b20 >= this.F.length) {
                                                break;
                                            }
                                            if (this.F[b20].b == 0 && bt.H[b18].a == this.F[b20].c) {
                                                bt.H[b18].b((byte) 4);
                                                break;
                                            }
                                            b19 = (byte) (b20 + 1);
                                        }
                                    }
                                    b17 = (byte) (b18 + 1);
                                }
                                this.B = this.y.ak;
                                this.f = (short) 3;
                            } else {
                                this.f = (short) 5;
                            }
                        }
                    } else if (bt.H[b8].k == 4 && (bt.H[b8].j == null || ai.a(bt.H[b8].j, this.y.ak) == 2)) {
                        if (this.F != null) {
                            byte b21 = 0;
                            while (true) {
                                byte b22 = b21;
                                if (b22 >= this.F.length) {
                                    break;
                                }
                                if (this.F[b22].b == 0 && this.F[b22].c == bt.H[b8].a) {
                                    a(bt.H[b8], this.F[b22]);
                                }
                                b21 = (byte) (b22 + 1);
                            }
                        }
                        bt.H[b8].b((byte) 1);
                    }
                    b7 = (byte) (b8 + 1);
                }
            }
            if (bt.M != null) {
                byte b23 = 0;
                while (true) {
                    byte b24 = b23;
                    if (b24 >= bt.M.length) {
                        break;
                    }
                    if (bt.M[b24].n == 1) {
                        bt.M[b24].a(a.f, this.y.ak);
                    } else if (bt.M[b24].n == 2) {
                        if (bt.M[b24].m == null || ai.a(bt.M[b24].m, this.y.ak) == 2) {
                            bt.M[b24].b((byte) 1);
                            if (this.A == null) {
                                byte b25 = 0;
                                while (true) {
                                    byte b26 = b25;
                                    if (b26 >= bt.H.length) {
                                        break;
                                    }
                                    if (this.F != null) {
                                        byte b27 = 0;
                                        while (true) {
                                            byte b28 = b27;
                                            if (b28 >= this.F.length) {
                                                break;
                                            }
                                            if (this.F[b28].b == 0 && bt.H[b26].a == this.F[b28].c) {
                                                bt.H[b26].b((byte) 4);
                                                break;
                                            }
                                            b27 = (byte) (b28 + 1);
                                        }
                                    }
                                    b25 = (byte) (b26 + 1);
                                }
                                byte b29 = 0;
                                while (true) {
                                    byte b30 = b29;
                                    if (b30 >= bt.M.length) {
                                        break;
                                    }
                                    if (this.F != null) {
                                        byte b31 = 0;
                                        while (true) {
                                            byte b32 = b31;
                                            if (b32 >= this.F.length) {
                                                break;
                                            }
                                            if (this.F[b32].b == 1 && bt.M[b30].a == this.F[b32].c) {
                                                bt.M[b30].b((byte) 4);
                                                break;
                                            }
                                            b31 = (byte) (b32 + 1);
                                        }
                                    }
                                    b29 = (byte) (b30 + 1);
                                }
                                this.B = this.y.ak;
                                this.f = (short) 3;
                            } else {
                                this.f = (short) 5;
                            }
                        }
                    } else if (bt.M[b24].n != 3 && bt.M[b24].n == 4 && (bt.M[b24].m == null || ai.a(bt.M[b24].m, this.y.ak) == 2)) {
                        if (this.F != null) {
                            byte b33 = 0;
                            while (true) {
                                byte b34 = b33;
                                if (b34 >= this.F.length) {
                                    break;
                                }
                                if (this.F[b34].b == 1 && this.F[b34].c == bt.M[b24].a) {
                                    bt.M[b24].e = this.F[b34].g;
                                    bt.M[b24].g = this.F[b34].h;
                                    bt.M[b24].f = this.F[b34].i;
                                    bt.M[b24].h = this.F[b34].j;
                                    if (bt.M[b24].e <= 0) {
                                        byte b35 = 0;
                                        while (true) {
                                            byte b36 = b35;
                                            if (b36 >= bt.M.length) {
                                                b6 = -1;
                                                break;
                                            }
                                            if (t == 1 || t == 2) {
                                                if (bt.M[b36].e > 0 && bt.M[b36].b == 0) {
                                                    b6 = b36;
                                                    break;
                                                }
                                                b35 = (byte) (b36 + 1);
                                            } else {
                                                if (bt.M[b36].e > 0) {
                                                    b6 = b36;
                                                    break;
                                                }
                                                b35 = (byte) (b36 + 1);
                                            }
                                        }
                                        this.h = b6;
                                        this.h = this.h < 0 ? (byte) 0 : this.h;
                                    }
                                }
                                b33 = (byte) (b34 + 1);
                            }
                        }
                        bt.M[b24].b((byte) 1);
                    }
                    b23 = (byte) (b24 + 1);
                }
            }
        }
        if (this.d == 0 || this.d == 2 || this.f > 1) {
            if (i == 8) {
                if (this.e == 5 || (this.e == 3 && this.d > 1)) {
                    ao aoVar = this.z;
                    if (this.z.az <= 0) {
                        b3 = 9;
                    } else {
                        ao aoVar2 = this.z;
                        byte b37 = (byte) (aoVar2.az - 1);
                        b3 = b37;
                        aoVar2.az = b37;
                    }
                    aoVar.az = b3;
                }
            } else if (i == 2) {
                if (this.e == 5 || (this.e == 3 && this.d > 1)) {
                    ao aoVar3 = this.z;
                    if (this.z.az >= 9) {
                        b2 = 0;
                    } else {
                        ao aoVar4 = this.z;
                        byte b38 = (byte) (aoVar4.az + 1);
                        b2 = b38;
                        aoVar4.az = b38;
                    }
                    aoVar3.az = b2;
                }
            } else if (i == 1073741824) {
                if (this.e == 5 || (this.e == 3 && this.d > 1)) {
                    if (this.z.az == 8) {
                        this.z.K();
                    } else if (this.z.az == 9) {
                        this.z.O();
                        this.e = 5;
                    }
                }
            } else if (i == 1024) {
                this.z.K();
            } else if (i == 2048) {
                this.z.O();
                if (this.d <= 1) {
                    this.e = 5;
                } else if (this.d > 1) {
                    this.e = 3;
                }
            }
        }
        if (this.f == 0) {
            this.I = System.currentTimeMillis();
            if (h() && this.f != -1 && !ao.r()) {
                this.j = (byte) 0;
                this.p = bt.ej[this.z.az];
                this.n = (byte) 1;
                byte b39 = bt.bt ? (byte) 0 : (byte) 1;
                int i6 = bt.bt ? 0 : 1;
                byte b40 = bt.M[this.h].a;
                boolean z2 = bt.bt;
                a(b39, i6, (byte) 1, b40, (byte) 1, bt.bt ? 0 : 1, (byte) 1, bt.M[this.h].a);
                this.f = (short) -1;
                this.e = 5;
                this.d = 0;
            }
            if (this.d == 0) {
                if (y() && !h()) {
                    this.j = (byte) 1;
                    this.p = 1;
                    this.n = (byte) 1;
                    if (j()) {
                        a(this.j, this.p, this.n, this.o, (byte) 1, 1, (byte) 1, bt.M[this.h].a);
                        this.f = (short) -1;
                        this.e = 5;
                    } else {
                        this.d = 2;
                        this.e = 3;
                    }
                } else if (i == 1) {
                    if (this.e <= 0) {
                        i5 = 5;
                    } else {
                        int i7 = this.e - 1;
                        i5 = i7;
                        this.e = i7;
                    }
                    this.e = i5;
                } else if (i == 4) {
                    if (this.e >= 5) {
                        i4 = 0;
                    } else {
                        int i8 = this.e + 1;
                        i4 = i8;
                        this.e = i8;
                    }
                    this.e = i4;
                } else if (i == 1073741824) {
                    this.J = false;
                    if (this.e != 0 || h()) {
                        if (this.e == 1 && !h()) {
                            this.j = (byte) 3;
                            this.p = 1;
                            this.n = (byte) 1;
                            this.o = bt.M[this.h].a;
                            if (j()) {
                                a(this.j, this.p, this.n, this.o, (byte) 1, 1, (byte) 1, bt.M[this.h].a);
                                this.f = (short) -1;
                                this.e = 5;
                            } else {
                                this.d = 2;
                                this.e = 3;
                            }
                        } else if (this.e != 2 || h()) {
                            if (this.e == 3) {
                                this.z.e(6);
                            } else if (this.e != 4 || h()) {
                                if (this.e == 5 && bt.en[this.z.az] != -1 && this.z.az >= 0 && this.z.az < 8) {
                                    q();
                                }
                            } else if (j()) {
                                this.k = (byte) 1;
                                this.q = 1;
                                if (t == 1) {
                                    this.y.b("决斗时不能逃跑!");
                                } else if (bt.bs == 0 && bt.s == 0) {
                                    this.y.b("队员不能逃跑");
                                } else {
                                    a((byte) 4, -1, (byte) 0, this.o, this.k, this.q, (byte) 1, bt.M[this.h].a);
                                    this.f = (short) -1;
                                    this.e = 5;
                                }
                            } else if (t == 1) {
                                this.y.b("决斗时不能逃跑!");
                            } else {
                                this.j = (byte) 4;
                                this.p = 1;
                                this.n = (byte) 0;
                                this.o = (byte) 1;
                                this.d = 2;
                                this.e = 3;
                            }
                        } else if (bt.dB == null || bt.dB.length <= 0) {
                            this.y.b("没有可用技能");
                        } else {
                            this.z.h(3);
                        }
                    } else if (c() <= 1) {
                        this.j = (byte) 1;
                        this.p = 1;
                        this.n = (byte) 1;
                        this.o = bt.M[this.h].a;
                        if (j()) {
                            a(this.j, this.p, this.n, this.o, (byte) 1, 1, (byte) 1, bt.M[this.h].a);
                            this.f = (short) -1;
                            this.e = 5;
                        } else {
                            this.d = 2;
                            this.e = 3;
                        }
                    } else {
                        this.d = 1;
                    }
                } else if (i != 513 || bt.bt) {
                    if (i != 514 || bt.bt) {
                        if (i != 515 || bt.bt) {
                            if (i != 516 || bt.bt) {
                                if (i != 517 || bt.bt) {
                                    if (i != 518 || bt.bt) {
                                        if (i != 519 || bt.bt) {
                                            if (i == 520 && !bt.bt && bt.en[7] != -1) {
                                                this.z.az = (byte) 7;
                                                if (bt.el[this.z.az] < 2) {
                                                    q();
                                                } else if (b(0)) {
                                                    this.j = (byte) 0;
                                                    this.p = bt.ej[this.z.az];
                                                    this.n = (byte) 1;
                                                    this.o = bt.M[this.h].a;
                                                    if (j()) {
                                                        a(this.j, this.p, this.n, this.o, (byte) 1, 1, (byte) 1, bt.M[this.h].a);
                                                        this.f = (short) -1;
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
                                        } else if (bt.en[6] != -1) {
                                            this.z.az = (byte) 6;
                                            if (bt.el[this.z.az] < 2) {
                                                q();
                                            } else if (b(0)) {
                                                this.j = (byte) 0;
                                                this.p = bt.ej[this.z.az];
                                                this.n = (byte) 1;
                                                this.o = bt.M[this.h].a;
                                                if (j()) {
                                                    a(this.j, this.p, this.n, this.o, (byte) 1, 1, (byte) 1, bt.M[this.h].a);
                                                    this.f = (short) -1;
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
                                    } else if (bt.en[5] != -1) {
                                        this.z.az = (byte) 5;
                                        if (bt.el[this.z.az] < 2) {
                                            q();
                                        } else if (b(0)) {
                                            this.j = (byte) 0;
                                            this.p = bt.ej[this.z.az];
                                            this.n = (byte) 1;
                                            this.o = bt.M[this.h].a;
                                            if (j()) {
                                                a(this.j, this.p, this.n, this.o, (byte) 1, 1, (byte) 1, bt.M[this.h].a);
                                                this.f = (short) -1;
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
                                } else if (bt.en[4] != -1) {
                                    this.z.az = (byte) 4;
                                    if (bt.el[this.z.az] < 2) {
                                        q();
                                    } else if (b(0)) {
                                        this.j = (byte) 0;
                                        this.p = bt.ej[this.z.az];
                                        this.n = (byte) 1;
                                        this.o = bt.M[this.h].a;
                                        if (j()) {
                                            a(this.j, this.p, this.n, this.o, (byte) 1, 1, (byte) 1, bt.M[this.h].a);
                                            this.f = (short) -1;
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
                            } else if (bt.en[3] != -1) {
                                this.z.az = (byte) 3;
                                if (bt.el[this.z.az] < 2) {
                                    q();
                                } else if (b(0)) {
                                    this.j = (byte) 0;
                                    this.p = bt.ej[this.z.az];
                                    this.n = (byte) 1;
                                    this.o = bt.M[this.h].a;
                                    if (j()) {
                                        a(this.j, this.p, this.n, this.o, (byte) 1, 1, (byte) 1, bt.M[this.h].a);
                                        this.f = (short) -1;
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
                        } else if (bt.en[2] != -1) {
                            this.z.az = (byte) 2;
                            if (bt.el[this.z.az] < 2) {
                                q();
                            } else if (b(0)) {
                                this.j = (byte) 0;
                                this.p = bt.ej[this.z.az];
                                this.n = (byte) 1;
                                this.o = bt.M[this.h].a;
                                if (j()) {
                                    a(this.j, this.p, this.n, this.o, (byte) 1, 1, (byte) 1, bt.M[this.h].a);
                                    this.f = (short) -1;
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
                    } else if (bt.en[1] != -1) {
                        this.z.az = (byte) 1;
                        if (bt.el[this.z.az] < 2) {
                            q();
                        } else if (b(0)) {
                            this.j = (byte) 0;
                            this.p = bt.ej[this.z.az];
                            this.n = (byte) 1;
                            this.o = bt.M[this.h].a;
                            if (j()) {
                                a(this.j, this.p, this.n, this.o, (byte) 1, 1, (byte) 1, bt.M[this.h].a);
                                this.f = (short) -1;
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
                } else if (bt.en[0] != -1) {
                    this.z.az = (byte) 0;
                    if (bt.el[this.z.az] < 2) {
                        q();
                    } else if (b(0)) {
                        this.j = (byte) 0;
                        this.p = bt.ej[this.z.az];
                        this.n = (byte) 1;
                        this.o = bt.M[this.h].a;
                        if (j()) {
                            a(this.j, this.p, this.n, this.o, (byte) 1, 1, (byte) 1, bt.M[this.h].a);
                            this.f = (short) -1;
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
                if (i == 8 || i == 2 || i == 1 || i == 4) {
                    this.h = b(this.h);
                } else if (i == 1073741824) {
                    if (this.e == 5 || this.J) {
                        if (this.z.az < 0 || this.z.az > 7 || !bt.bt) {
                            this.j = (byte) 0;
                            this.p = bt.ej[this.z.az];
                            this.n = (byte) 1;
                            this.o = bt.M[this.h].a;
                        }
                    } else if (this.e == 0) {
                        this.j = (byte) 1;
                        this.p = 1;
                        this.n = (byte) 1;
                        this.o = bt.M[this.h].a;
                    } else if (this.e == 2) {
                        this.j = (byte) 1;
                        this.p = bt.dl[this.y.ar.g()];
                        this.n = (byte) 1;
                        this.o = bt.M[this.h].a;
                    }
                    if (j()) {
                        a(this.j, this.p, this.n, this.o, (byte) 1, 1, (byte) 1, (byte) -1);
                        this.f = (short) -1;
                        this.e = 5;
                    } else {
                        this.d = 2;
                        this.e = 3;
                    }
                } else if (i == 536870912) {
                    this.d = 0;
                }
            } else if (this.d == 2) {
                byte b41 = 0;
                while (true) {
                    byte b42 = b41;
                    if (b42 >= bt.H.length) {
                        z = false;
                        break;
                    } else {
                        if (bt.H[b42].b != 0 && bt.H[b42].a == i() + 3 && bt.H[b42].o) {
                            z = true;
                            break;
                        }
                        b41 = (byte) (b42 + 1);
                    }
                }
                if (z) {
                    a(this.j, this.p, this.n, this.o, (byte) 1, 1, (byte) 1, bt.M[this.h].a);
                    this.f = (short) -1;
                    this.e = 5;
                } else {
                    if (i == 1) {
                        if (this.e <= 0) {
                            i3 = 3;
                        } else {
                            int i9 = this.e - 1;
                            i3 = i9;
                            this.e = i9;
                        }
                        this.e = i3;
                    } else if (i == 4) {
                        if (this.e >= 3) {
                            i2 = 0;
                        } else {
                            int i10 = this.e + 1;
                            i2 = i10;
                            this.e = i10;
                        }
                        this.e = i2;
                    } else if (i == 1073741824) {
                        if (this.e == 0) {
                            if (c() <= 1) {
                                a(this.j, this.p, this.n, this.o, (byte) 1, 1, (byte) 1, bt.M[this.h].a);
                                this.f = (short) -1;
                                this.e = 5;
                            } else {
                                this.k = (byte) 1;
                                this.q = 1;
                                this.d = 3;
                            }
                        } else if (this.e == 1) {
                            a(this.j, this.p, this.n, this.o, (byte) 3, 1, (byte) 1, bt.M[this.h].a);
                            this.f = (short) -1;
                            this.e = 5;
                        } else if (this.e == 2) {
                            if (bt.cR == null || bt.cR.length <= 0) {
                                this.y.b("宠物没有技能!");
                            } else {
                                this.z.a(false, true);
                            }
                        } else if (this.e == 3 && bt.et[this.z.az] != -1) {
                            r();
                        }
                    }
                    if (i != 513 || bt.bt) {
                        if (i != 514 || bt.bt) {
                            if (i != 515 || bt.bt) {
                                if (i != 516 || bt.bt) {
                                    if (i != 517 || bt.bt) {
                                        if (i != 518 || bt.bt) {
                                            if (i != 519 || bt.bt) {
                                                if (i != 520 || bt.bt) {
                                                    if (i == 536870912) {
                                                        if (y()) {
                                                            this.y.b("你已被锁定\t无法进行该操作");
                                                        } else {
                                                            this.d = 0;
                                                        }
                                                    }
                                                } else if (bt.et[7] != -1) {
                                                    this.z.az = (byte) 7;
                                                    r();
                                                }
                                            } else if (bt.et[6] != -1) {
                                                this.z.az = (byte) 6;
                                                r();
                                            }
                                        } else if (bt.et[5] != -1) {
                                            this.z.az = (byte) 5;
                                            r();
                                        }
                                    } else if (bt.et[4] != -1) {
                                        this.z.az = (byte) 4;
                                        r();
                                    }
                                } else if (bt.et[3] != -1) {
                                    this.z.az = (byte) 3;
                                    r();
                                }
                            } else if (bt.et[2] != -1) {
                                this.z.az = (byte) 2;
                                r();
                            }
                        } else if (bt.et[1] != -1) {
                            this.z.az = (byte) 1;
                            r();
                        }
                    } else if (bt.et[0] != -1) {
                        this.z.az = (byte) 0;
                        r();
                    }
                }
            } else if (this.d == 3) {
                if (i == 8 || i == 2 || i == 1 || i == 4) {
                    this.h = b(this.h);
                } else if (i == 1073741824 || i == 517) {
                    a(this.j, this.p, this.n, this.o, this.k, this.q, (byte) 1, bt.M[this.h].a);
                    this.f = (short) -1;
                    this.e = 5;
                } else if (i == 536870912) {
                    this.d = 2;
                    this.e = 3;
                }
            } else if (this.d == 4) {
                if (i == 8 || i == 2 || i == 1 || i == 4) {
                    if (h()) {
                        this.y.b("只能对自己使用复活道具");
                    } else {
                        this.i = c(this.i);
                    }
                } else if (i == 1073741824 || i == 517) {
                    this.o = bt.H[this.i].a;
                    if (j()) {
                        a(this.j, this.p, this.n, this.o, (byte) 1, 1, (byte) 1, bt.M[this.h].a);
                        this.f = (short) -1;
                        this.e = 5;
                    } else {
                        this.d = 2;
                        this.e = 3;
                    }
                } else if (i == 536870912) {
                    this.d = 0;
                }
            } else if (this.d == 5) {
                if (i == 8 || i == 2 || i == 1 || i == 4) {
                    this.i = c(this.i);
                } else if (i == 1073741824 || i == 517) {
                    this.o = bt.H[this.i].a;
                    this.j = (byte) 1;
                    this.p = bt.dl[this.y.ar.g()];
                    this.n = (byte) 0;
                    if (j()) {
                        a(this.j, this.p, this.n, this.o, (byte) 1, 1, (byte) 1, (byte) -1);
                        this.f = (short) -1;
                        this.e = 5;
                    } else {
                        this.d = 2;
                        this.e = 3;
                    }
                } else if (i == 536870912) {
                    this.d = 0;
                }
            } else if (this.d == 6) {
                if (i == 8 || i == 2 || i == 1 || i == 4) {
                    this.i = c(this.i);
                } else if (i == 1073741824 || i == 517) {
                    this.k = (byte) 1;
                    this.q = bt.dl[this.y.ar.g()];
                    this.l = (byte) 0;
                    a(this.j, this.p, this.n, this.o, this.k, this.q, this.l, bt.H[this.i].a);
                    this.f = (short) -1;
                    this.e = 5;
                } else if (i == 536870912) {
                    this.d = 2;
                    this.e = 3;
                }
            } else if (this.d == 7) {
                if (i == 8 || i == 2 || i == 1 || i == 4) {
                    this.i = c(this.i);
                } else if (i == 1073741824 || i == 517) {
                    this.o = bt.H[this.i].a;
                    if (j()) {
                        a(this.j, this.p, this.n, this.o, (byte) 1, 1, (byte) 1, (byte) -1);
                        this.f = (short) -1;
                        this.e = 5;
                    } else {
                        this.d = 2;
                        this.e = 3;
                    }
                } else if (i == 536870912) {
                    this.d = 0;
                }
            } else if (this.d == 8) {
                if (i == 8 || i == 2 || i == 1 || i == 4) {
                    this.i = c(this.i);
                } else if (i == 1073741824 || i == 517) {
                    a(this.j, this.p, this.n, this.o, this.k, this.q, this.l, bt.H[this.i].a);
                    this.f = (short) -1;
                    this.e = 5;
                } else if (i == 536870912) {
                    this.d = 2;
                    this.e = 3;
                }
            } else if (this.d == 9) {
                if (i == 8 || i == 2 || i == 1 || i == 4) {
                    this.h = b(this.h);
                } else if (i == 1073741824 || i == 517) {
                    this.o = bt.M[this.h].a;
                    if (j()) {
                        a(this.j, this.p, this.n, this.o, (byte) 1, 1, (byte) 1, (byte) -1);
                        this.f = (short) -1;
                        this.e = 5;
                    } else {
                        this.d = 2;
                        this.e = 3;
                    }
                } else if (i == 536870912) {
                    this.d = 0;
                }
            }
        } else if (this.f == 1) {
            if (this.Q) {
                this.Q = false;
                boolean z3 = false;
                boolean z4 = false;
                byte b43 = 0;
                while (true) {
                    byte b44 = b43;
                    if (b44 >= bt.H.length) {
                        b4 = -1;
                        break;
                    } else {
                        if (bt.H[b44].b == 0 && bt.H[b44].c.equals(bt.ad)) {
                            b4 = b44;
                            break;
                        }
                        b43 = (byte) (b44 + 1);
                    }
                }
                byte b45 = b4;
                byte b46 = 0;
                while (true) {
                    byte b47 = b46;
                    if (b47 >= bt.H.length) {
                        b5 = -1;
                        break;
                    } else {
                        if (bt.H[b47].b != 0 && bt.H[b47].a == i() + 3) {
                            b5 = b47;
                            break;
                        }
                        b46 = (byte) (b47 + 1);
                    }
                }
                byte b48 = b5;
                for (int i11 = 0; i11 < this.v.size(); i11++) {
                    if (((i[]) this.v.elementAt(i11))[0].d == 9) {
                        ae[] aeVarArr = (ae[]) this.w.elementAt(i11);
                        for (int i12 = 0; i12 < aeVarArr.length; i12++) {
                            if (aeVarArr[i12].b == 0 && bt.H[b45].a == aeVarArr[i12].c && d(aeVarArr[i12].k)) {
                                bt.H[b45].o = true;
                                z3 = true;
                            }
                            if (bt.be > 0 && aeVarArr[i12].b == 0 && bt.H[b48].a == aeVarArr[i12].c && d(aeVarArr[i12].k)) {
                                bt.H[b48].o = true;
                                z4 = true;
                            }
                        }
                    }
                }
                if (!z3) {
                    bt.H[b45].o = false;
                }
                if (!z4 && bt.be > 0) {
                    bt.H[b48].o = false;
                }
            }
            if (this.v.size() <= 0) {
                this.E = null;
                if (h()) {
                    if (ao.r()) {
                        this.f = (short) 0;
                        s = b;
                    } else {
                        this.j = (byte) 0;
                        this.p = bt.ej[this.z.az];
                        this.n = (byte) 1;
                        byte b49 = bt.bt ? (byte) 0 : (byte) 1;
                        int i13 = bt.bt ? 0 : 1;
                        byte b50 = bt.M[this.h].a;
                        boolean z5 = bt.bt;
                        a(b49, i13, (byte) 1, b50, (byte) 1, bt.bt ? 0 : 1, (byte) 1, bt.M[this.h].a);
                        this.f = (short) -1;
                        this.e = 5;
                    }
                    this.d = 0;
                } else if (this.f != 0) {
                    this.d = 0;
                    s = b;
                    this.f = (short) 0;
                }
                byte b51 = 0;
                while (true) {
                    byte b52 = b51;
                    if (b52 >= bt.H.length) {
                        break;
                    }
                    bt.H[b52].m = false;
                    bt.H[b52].l = false;
                    bt.H[b52].n = false;
                    b51 = (byte) (b52 + 1);
                }
                byte b53 = 0;
                while (true) {
                    byte b54 = b53;
                    if (b54 >= bt.M.length) {
                        break;
                    }
                    bt.M[b54].p = false;
                    bt.M[b54].o = false;
                    bt.M[b54].q = false;
                    b53 = (byte) (b54 + 1);
                }
                this.Q = true;
            } else if (0 < this.v.size()) {
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
                if (this.E[0].d == 7 || this.E[0].d == 5 || this.E[0].d == 9 || this.E[0].d == 1 || this.E[0].d == 2 || this.E[0].d == 3) {
                    byte b55 = 0;
                    while (true) {
                        byte b56 = b55;
                        if (b56 >= bt.H.length) {
                            break;
                        }
                        if (bt.H[b56] != null && !bt.H[b56].d()) {
                            byte b57 = 0;
                            while (true) {
                                byte b58 = b57;
                                if (b58 < this.F.length) {
                                    if (this.F[b58].k >= 0 && this.F[b58].b == 0 && this.F[b58].c == bt.H[b56].a) {
                                        this.G = a.ac.a(String.valueOf((int) this.F[b58].k));
                                        if (this.G != null && !this.H.contains(this.G)) {
                                            boolean z6 = true;
                                            for (int i14 = 0; i14 < this.H.size(); i14++) {
                                                if (this.H.elementAt(i14).equals(this.G)) {
                                                    z6 = false;
                                                }
                                            }
                                            if (z6) {
                                                this.H.addElement(this.G);
                                            }
                                        }
                                    }
                                    b57 = (byte) (b58 + 1);
                                }
                            }
                        }
                        a(bt.H[b56].s, this.H);
                        this.H.removeAllElements();
                        b55 = (byte) (b56 + 1);
                    }
                    byte b59 = 0;
                    while (true) {
                        byte b60 = b59;
                        if (b60 >= bt.M.length) {
                            break;
                        }
                        if (bt.M[b60] != null && !bt.M[b60].a()) {
                            byte b61 = 0;
                            while (true) {
                                byte b62 = b61;
                                if (b62 >= this.F.length) {
                                    break;
                                }
                                if (this.F[b62].k >= 0 && this.F[b62].b == 1 && this.F[b62].c == bt.M[b60].a) {
                                    this.G = a.ac.a(String.valueOf((int) this.F[b62].k));
                                    if (this.G != null && !this.H.contains(this.G)) {
                                        boolean z7 = true;
                                        for (int i15 = 0; i15 < this.H.size(); i15++) {
                                            if (this.H.elementAt(i15) != this.G) {
                                                z7 = false;
                                            }
                                        }
                                        if (z7) {
                                            this.H.addElement(this.G);
                                        }
                                    }
                                }
                                b61 = (byte) (b62 + 1);
                            }
                            a(bt.M[b60].u, this.H);
                            this.H.removeAllElements();
                        }
                        b59 = (byte) (b60 + 1);
                    }
                }
                if (this.E[0].d == 7) {
                    n();
                } else {
                    o();
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
        } else if (this.f == 2) {
            if (this.D == -1) {
                this.D = this.y.ak;
            }
        } else if (this.f == 3 && x() && ((this.u != null && this.y.ak - this.B >= 1450) || this.u == null)) {
            this.f = (short) 1;
        }
        if (this.f == 4) {
            if (u()) {
                this.y.d.a();
            }
            d();
            ao aoVar5 = this.z;
            this.z.k = (short) 0;
            aoVar5.j = (short) 0;
        } else if (this.f == 5) {
            if (s() == 2) {
                byte b63 = 0;
                while (true) {
                    byte b64 = b63;
                    if (b64 >= bt.H.length) {
                        break;
                    }
                    if (this.F != null) {
                        byte b65 = 0;
                        while (true) {
                            byte b66 = b65;
                            if (b66 >= this.F.length) {
                                break;
                            }
                            if (this.F[b66].b == 0 && bt.H[b64].a == this.F[b66].c) {
                                bt.H[b64].b((byte) 4);
                                break;
                            }
                            b65 = (byte) (b66 + 1);
                        }
                    }
                    b63 = (byte) (b64 + 1);
                }
                byte b67 = 0;
                while (true) {
                    byte b68 = b67;
                    if (b68 >= bt.M.length) {
                        break;
                    }
                    if (this.F != null) {
                        byte b69 = 0;
                        while (true) {
                            byte b70 = b69;
                            if (b70 >= this.F.length) {
                                break;
                            }
                            if (this.F[b70].b == 1 && bt.M[b68].a == this.F[b70].c) {
                                bt.M[b68].b((byte) 4);
                                break;
                            }
                            b69 = (byte) (b70 + 1);
                        }
                    }
                    b67 = (byte) (b68 + 1);
                }
                this.B = this.y.ak;
                this.f = (short) 3;
            }
        } else if (this.f == 6) {
            if (ai.a(ao.ab, this.y.ak) == 2) {
                this.f = (short) 1;
            }
        } else if (this.f == 7) {
            if (ai.a(ao.aa, this.y.ak) == 2) {
                this.f = (short) 8;
            }
        } else if (this.f == 8) {
            this.y.d.a();
            d();
            ao aoVar6 = this.z;
            this.z.k = (short) 0;
            aoVar6.j = (short) 0;
        }
        if (this.f == 0 || this.f == 1) {
            if (this.v.size() <= 0 && bt.x == -1) {
                if ((t() || u()) || this.f == 1) {
                    this.f = (short) 4;
                    return;
                }
                return;
            }
            if (this.f != 9) {
                if (!((bt.bs >= 0 && bt.s == 0) || t == 1 || t == 2 || bt.bt) || s <= 0) {
                    return;
                }
                p();
            }
        }
    }

    public final void a(ai aiVar, Graphics graphics) {
        graphics.setClip(0, 0, t.b, t.c);
        if ((this.f == 2 || this.f == 3 || this.f == 6) && this.E != null && this.E[0].f != null && !this.E[0].f.equals("")) {
            ca.a(graphics, this.E[0].f, t.b / 2, (t.c - 22) - t.j, 17, 0, 16777215);
        }
        if (this.f != 4 && this.f != 8) {
            if (bt.H != null) {
                int length = bt.H.length;
                while (true) {
                    byte b2 = (byte) (length - 1);
                    if (b2 < 0) {
                        break;
                    }
                    if (bt.H[b2].j != null) {
                        if (bt.H[b2].d()) {
                            a.f.a(graphics, ao.ad, (int[]) null, 0, 0, t.Q[bt.H[b2].a][0], t.Q[bt.H[b2].a][1], 0, 0);
                        } else if (bt.H[b2].b != 0 && bt.H[b2].j != null) {
                            if (bt.H[b2].k == 1 || bt.H[b2].k == 4) {
                                bt.H[b2].a(graphics, a.f, t.Q[bt.H[b2].a][0], t.Q[bt.H[b2].a][1], (byte) 0);
                            }
                            if (this.f != -1 && this.f != 0 && this.f != 7 && bt.H[b2].m) {
                                a.f.a(graphics, ao.ae, (int[]) null, 0, 0, t.Q[bt.H[b2].a][0], t.Q[bt.H[b2].a][1], 0, 0);
                            } else if (this.f == 6 && bt.H[b2].l) {
                                a.f.a(graphics, ao.ab, (int[]) null, 0, 0, t.Q[bt.H[b2].a][0], t.Q[bt.H[b2].a][1], 0, 0);
                            }
                        }
                    }
                    length = b2;
                }
                byte b3 = 0;
                while (true) {
                    byte b4 = b3;
                    if (b4 >= bt.H.length) {
                        break;
                    }
                    if (bt.H[b4].b == 0 && bt.H[b4].j != null) {
                        if (bt.H[b4].c.equals(bt.ad)) {
                            graphics.drawImage(ao.H.a, t.Q[bt.H[b4].a][0] - (ao.H.b / 2), t.Q[bt.H[b4].a][1] - (ao.H.c / 2), 20);
                            if ((this.f == 7 && bt.bs == 1) || ((this.f == 7 && bt.bs == -1) || (this.f == 7 && bt.s == 1))) {
                                a.f.a(graphics, ao.aa, (int[]) null, 0, 0, t.Q[bt.H[b4].a][0], t.Q[bt.H[b4].a][1], 0, 0);
                            } else if (!bt.H[b4].d()) {
                                if (bt.H[b4].k == 1 || bt.H[b4].k == 4) {
                                    bt.H[b4].a(graphics, a.f, t.Q[bt.H[b4].a][0], t.Q[bt.H[b4].a][1], (byte) 0);
                                }
                                if (this.f != -1 && this.f != 0 && bt.H[b4].m) {
                                    a.f.a(graphics, ao.ae, (int[]) null, 0, 0, t.Q[bt.H[b4].a][0], t.Q[bt.H[b4].a][1], 0, 0);
                                } else if (this.f == 6 && bt.H[b4].l) {
                                    a.f.a(graphics, ao.ab, (int[]) null, 0, 0, t.Q[bt.H[b4].a][0], t.Q[bt.H[b4].a][1], 0, 0);
                                }
                            }
                        } else if (this.f == 7) {
                            for (int i = 0; i < bt.q.length; i++) {
                                if (bt.q[i].e.equals(bt.H[b4].d) && bt.q[i].s == 1) {
                                    a.f.a(graphics, ao.aa, (int[]) null, 0, 0, t.Q[bt.H[b4].a][0], t.Q[bt.H[b4].a][1], 0, 0);
                                } else if (bt.q[i].e.equals(bt.H[b4].d) && bt.q[i].s == 0 && !bt.H[b4].d()) {
                                    if (bt.H[b4].k == 1 || bt.H[b4].k == 4) {
                                        bt.H[b4].a(graphics, a.f, t.Q[bt.H[b4].a][0], t.Q[bt.H[b4].a][1], (byte) 0);
                                    }
                                    if (this.f != -1 && this.f != 0 && bt.H[b4].m) {
                                        a.f.a(graphics, ao.ae, (int[]) null, 0, 0, t.Q[bt.H[b4].a][0], t.Q[bt.H[b4].a][1], 0, 0);
                                    } else if (this.f == 6 && bt.H[b4].l) {
                                        a.f.a(graphics, ao.ab, (int[]) null, 0, 0, t.Q[bt.H[b4].a][0], t.Q[bt.H[b4].a][1], 0, 0);
                                    }
                                }
                            }
                        } else if (!bt.H[b4].d()) {
                            if (bt.H[b4].k == 1 || bt.H[b4].k == 4) {
                                bt.H[b4].a(graphics, a.f, t.Q[bt.H[b4].a][0], t.Q[bt.H[b4].a][1], (byte) 0);
                            }
                            if (this.f != -1 && this.f != 0 && bt.H[b4].m) {
                                a.f.a(graphics, ao.ae, (int[]) null, 0, 0, t.Q[bt.H[b4].a][0], t.Q[bt.H[b4].a][1], 0, 0);
                            } else if (this.f == 6 && bt.H[b4].l) {
                                a.f.a(graphics, ao.ab, (int[]) null, 0, 0, t.Q[bt.H[b4].a][0], t.Q[bt.H[b4].a][1], 0, 0);
                            }
                        }
                    }
                    if (bt.H[b4].s.size() > 0 && bt.H[b4].j != null) {
                        byte b5 = 0;
                        while (true) {
                            byte b6 = b5;
                            if (b6 < bt.H[b4].s.size()) {
                                a.f.a(graphics, (bf) bt.H[b4].s.elementAt(b6), (int[]) null, 0, 0, 0, t.Q[bt.H[b4].a][0] - (bt.H[b4].h() / 2), (t.Q[bt.H[b4].a][1] + (b6 * 11)) - bt.H[b4].i(), 0, 0);
                                b5 = (byte) (b6 + 1);
                            }
                        }
                    }
                    b3 = (byte) (b4 + 1);
                }
            }
            if (bt.M != null) {
                byte b7 = 0;
                while (true) {
                    byte b8 = b7;
                    if (b8 >= bt.M.length) {
                        break;
                    }
                    if (bt.M[b8].m != null) {
                        if (!bt.M[b8].a()) {
                            if (bt.M[b8].n == 1 || bt.M[b8].n == 4) {
                                bt.M[b8].a(graphics, a.f, t.R[bt.M[b8].a][0], t.R[bt.M[b8].a][1], (byte) 0);
                                if (this.f != -1 && this.f != 0 && bt.M[b8].p) {
                                    a.f.a(graphics, ao.ae, (int[]) null, 0, 0, t.R[bt.M[b8].a][0], t.R[bt.M[b8].a][1], 0, 0);
                                } else if (this.f == 6 && bt.M[b8].o) {
                                    a.f.a(graphics, ao.ab, (int[]) null, 0, 0, t.R[bt.M[b8].a][0], t.R[bt.M[b8].a][1], 0, 0);
                                }
                            } else if (bt.M[b8].n == 2) {
                                if (this.A != null && this.A.b.length > 0) {
                                    bt.M[b8].a(graphics, a.f, t.R[bt.M[b8].a][0], t.R[bt.M[b8].a][1], (byte) 0);
                                } else if (bt.M[b8].q) {
                                    if (c((int) this.E[0].c) >= 0 && c((int) this.E[0].c) < bt.M.length) {
                                        bt.M[b8].a(graphics, a.f, t.R[bt.M[c((int) this.E[0].c)].a][0], t.R[bt.M[c((int) this.E[0].c)].a][1], (byte) 0);
                                    }
                                } else if (a(this.E[0].c) >= 0 && a(this.E[0].c) < bt.H.length) {
                                    bt.M[b8].a(graphics, a.f, t.Q[bt.H[a(this.E[0].c)].a][0] - (bt.H[a(this.E[0].c)].h() / 2), t.Q[bt.H[a(this.E[0].c)].a][1], (byte) 0);
                                }
                            }
                            if (bt.M[b8].u.size() > 0) {
                                byte b9 = 0;
                                while (true) {
                                    byte b10 = b9;
                                    if (b10 < bt.M[b8].u.size()) {
                                        ai aiVar2 = a.f;
                                        bf bfVar = (bf) bt.M[b8].u.elementAt(b10);
                                        short s2 = t.R[bt.M[b8].a][0];
                                        ck ckVar = bt.M[b8];
                                        aiVar2.a(graphics, bfVar, (int[]) null, 0, 0, 0, s2 - (((ckVar.m == null || ckVar.m.g == null) ? (short) 0 : ckVar.m.g[0]) / 2), (t.R[bt.M[b8].a][1] + (b10 * 11)) - bt.M[b8].d(), 0, 0);
                                        b9 = (byte) (b10 + 1);
                                    }
                                }
                            }
                        } else if (t == 1 || t == 2) {
                            a.f.a(graphics, ao.ac, (int[]) null, 0, 0, t.R[bt.M[b8].a][0], t.R[bt.M[b8].a][1], 0, 0);
                        }
                    }
                    b7 = (byte) (b8 + 1);
                }
            }
            if (bt.H != null && this.f != 7) {
                byte b11 = 0;
                while (true) {
                    byte b12 = b11;
                    if (b12 >= bt.H.length) {
                        break;
                    }
                    if (!bt.H[b12].d() && bt.H[b12].k == 2 && this.E[0].c >= 0) {
                        if (this.A != null && this.A.b.length > 0) {
                            bt.H[b12].a(graphics, a.f, t.Q[bt.H[b12].a][0], t.Q[bt.H[b12].a][1], (byte) 0);
                        } else if (bt.H[b12].n) {
                            byte bA = (byte) a(this.E[0].c);
                            if (bA >= 0 && bA <= bt.H.length - 1) {
                                bt.H[b12].a(graphics, a.f, t.Q[bt.H[a(this.E[0].c)].a][0], t.Q[bt.H[a(this.E[0].c)].a][1], (byte) 0);
                            }
                        } else {
                            byte bC = (byte) c((int) this.E[0].c);
                            if (bC >= 0 && bC <= bt.M.length - 1) {
                                bt.H[b12].a(graphics, a.f, t.R[bt.M[c((int) this.E[0].c)].a][0] + (bt.M[c((int) this.E[0].c)].c() / 2), t.R[bt.M[c((int) this.E[0].c)].a][1], (byte) 0);
                            }
                        }
                    }
                    b11 = (byte) (b12 + 1);
                }
            }
            if (this.d != 4 && this.d != 5 && this.d != 6) {
                if (this.d == 0 || this.d == 1) {
                    byte b13 = 0;
                    while (true) {
                        byte b14 = b13;
                        if (b14 >= bt.H.length) {
                            break;
                        }
                        if (bt.H[b14].e > 0 && bt.H[b14].b == 0 && bt.H[b14].c.equals(bt.ad)) {
                            if (bt.H[b14].i == 291) {
                                ca.e(graphics, t.Q[bt.H[b14].a][0] - 10, (t.Q[bt.H[b14].a][1] - 2) - bt.H[b14].i(), (bt.H[b14].e * 19) / (bt.H[b14].f <= 0 ? 1 : bt.H[b14].f), 0);
                                ca.e(graphics, t.Q[bt.H[b14].a][0] - 10, (t.Q[bt.H[b14].a][1] + 3) - bt.H[b14].i(), (bt.H[b14].g * 19) / (bt.H[b14].h <= 0 ? 1 : bt.H[b14].h), 1);
                            } else {
                                ca.e(graphics, t.Q[bt.H[b14].a][0] - 10, (t.Q[bt.H[b14].a][1] - 9) - bt.H[b14].i(), (bt.H[b14].e * 19) / (bt.H[b14].f <= 0 ? 1 : bt.H[b14].f), 0);
                                ca.e(graphics, t.Q[bt.H[b14].a][0] - 10, (t.Q[bt.H[b14].a][1] - 4) - bt.H[b14].i(), (bt.H[b14].g * 19) / (bt.H[b14].h <= 0 ? 1 : bt.H[b14].h), 1);
                            }
                        }
                        b13 = (byte) (b14 + 1);
                    }
                } else if (this.d == 2 || this.d == 3) {
                    byte b15 = 0;
                    while (true) {
                        byte b16 = b15;
                        if (b16 >= bt.H.length) {
                            break;
                        }
                        if (bt.H[b16].e > 0 && bt.H[b16].b != 0 && bt.H[b16].a == i() + 3) {
                            ca.e(graphics, t.Q[bt.H[b16].a][0] - 10, (t.Q[bt.H[b16].a][1] - 9) - bt.H[b16].i(), (bt.H[b16].e * 19) / (bt.H[b16].f <= 0 ? 1 : bt.H[b16].f), 0);
                            ca.e(graphics, t.Q[bt.H[b16].a][0] - 10, (t.Q[bt.H[b16].a][1] - 4) - bt.H[b16].i(), (bt.H[b16].g * 19) / (bt.H[b16].h <= 0 ? 1 : bt.H[b16].h), 1);
                        }
                        b15 = (byte) (b16 + 1);
                    }
                }
            }
            byte b17 = 0;
            while (true) {
                byte b18 = b17;
                if (b18 >= bt.H.length) {
                    break;
                }
                if (bt.H != null && b18 >= 0 && b18 <= bt.H.length - 1 && b18 >= 0 && !bt.H[b18].d()) {
                    if (this.i == b18 && (this.d == 4 || this.d == 5)) {
                        ca.a(graphics, bt.H[this.i].d, 2, 2, 20, 14337302, 0);
                    }
                    if (bt.H[b18].b == 0) {
                        if (bt.H[b18].i == 291) {
                            ca.e(graphics, t.Q[bt.H[b18].a][0] - 10, (t.Q[bt.H[b18].a][1] - 2) - bt.H[b18].i(), (bt.H[b18].e * 19) / bt.H[b18].f, 0);
                            ca.e(graphics, t.Q[bt.H[b18].a][0] - 10, (t.Q[bt.H[b18].a][1] + 3) - bt.H[b18].i(), (bt.H[b18].g * 19) / bt.H[b18].h, 1);
                        } else {
                            ca.e(graphics, t.Q[bt.H[b18].a][0] - 10, (t.Q[bt.H[b18].a][1] - 9) - bt.H[b18].i(), (bt.H[b18].e * 19) / bt.H[b18].f, 0);
                            ca.e(graphics, t.Q[bt.H[b18].a][0] - 10, (t.Q[bt.H[b18].a][1] - 4) - bt.H[b18].i(), (bt.H[b18].g * 19) / bt.H[b18].h, 1);
                        }
                    } else if (bt.H[b18].b == 2) {
                        ca.e(graphics, t.Q[bt.H[b18].a][0] - 10, (t.Q[bt.H[b18].a][1] - 9) - bt.H[b18].i(), (bt.H[b18].e * 19) / bt.H[b18].f, 0);
                        ca.e(graphics, t.Q[bt.H[b18].a][0] - 10, (t.Q[bt.H[b18].a][1] - 4) - bt.H[b18].i(), (bt.H[b18].g * 19) / bt.H[b18].h, 1);
                    }
                }
                b17 = (byte) (b18 + 1);
            }
            byte b19 = 0;
            while (true) {
                byte b20 = b19;
                if (b20 >= bt.M.length) {
                    break;
                }
                if (b20 >= 0 && !bt.M[b20].a()) {
                    ca.e(graphics, t.R[bt.M[b20].a][0] - 11, (t.R[bt.M[b20].a][1] - 4) - bt.M[b20].d(), (bt.M[b20].e * 19) / bt.M[b20].f, 0);
                    if (this.h == b20 && (this.d == 1 || this.d == 0 || this.d == 2 || this.d == 3 || this.d == 9)) {
                        ca.a(graphics, bt.M[b20].d, 2, 2, 20, 14337302, 0);
                        ca.a(graphics, new StringBuffer().append("").append(t.K[bt.M[b20].k]).toString(), t.b - 2, 2, 24, 14337302, 0);
                    }
                    if (bt.M[b20].i > 99) {
                        a.f.a(graphics, ao.B, (int[]) null, (bt.M[b20].i / 100) + 1, 0, 0, t.R[bt.M[b20].a][0] - 15, (t.R[bt.M[b20].a][1] - 11) - bt.M[b20].d(), 0, 0);
                        a.f.a(graphics, ao.B, (int[]) null, ((bt.M[b20].i - 100) / 10) + 1, 0, 0, t.R[bt.M[b20].a][0] - 11, (t.R[bt.M[b20].a][1] - 11) - bt.M[b20].d(), 0, 0);
                        a.f.a(graphics, ao.B, (int[]) null, (bt.M[b20].i % 10) + 1, 0, 0, t.R[bt.M[b20].a][0] - 7, (t.R[bt.M[b20].a][1] - 11) - bt.M[b20].d(), 0, 0);
                    } else if (bt.M[b20].i > 9) {
                        a.f.a(graphics, ao.B, (int[]) null, (bt.M[b20].i / 10) + 1, 0, 0, t.R[bt.M[b20].a][0] - 11, (t.R[bt.M[b20].a][1] - 11) - bt.M[b20].d(), 0, 0);
                        a.f.a(graphics, ao.B, (int[]) null, (bt.M[b20].i % 10) + 1, 0, 0, t.R[bt.M[b20].a][0] - 7, (t.R[bt.M[b20].a][1] - 11) - bt.M[b20].d(), 0, 0);
                    } else if (bt.M[b20].i > 1) {
                        a.f.a(graphics, ao.B, (int[]) null, (bt.M[b20].i % 10) + 1, 0, 0, t.R[bt.M[b20].a][0] - 11, (t.R[bt.M[b20].a][1] - 11) - bt.M[b20].d(), 0, 0);
                    }
                    if (this.h == b20 && bt.M[b20].l == 1) {
                        a.f.a(graphics, ao.D, (int[]) null, -1, 0, 0, 4 + t.i.stringWidth(bt.M[b20].d), 6, 0, 0);
                    }
                }
                b19 = (byte) (b20 + 1);
            }
        }
        if (this.f == 0 || this.f == 1) {
            if (this.d == 4 || this.d == 5 || this.d == 6 || this.d == 7 || this.d == 8) {
                if (this.i >= 0 && this.i <= bt.H.length - 1 && bt.H[this.i].j != null) {
                    ai.a(ao.r, this.y.ak);
                    a.f.a(graphics, ao.r, (int[]) null, 0, 0, t.Q[bt.H[this.i].a][0], (t.Q[bt.H[this.i].a][1] - 10) - bt.H[this.i].i(), 20, 0);
                }
            } else if (this.h >= 0 && this.h <= bt.M.length - 1) {
                ai.a(ao.r, this.y.ak);
                a.f.a(graphics, ao.r, (int[]) null, 0, 0, t.R[bt.M[this.h].a][0], (t.R[bt.M[this.h].a][1] - 10) - bt.M[this.h].d(), 20, 0);
            }
        }
        if (this.f == 0) {
            if (this.d == 0) {
                b(graphics);
            } else if (this.d == 2) {
                c(graphics);
            }
            if (((bt.bs >= 0 && bt.s == 0) || t == 1 || t == 2) && s >= 0) {
                ca.a(graphics, String.valueOf((int) s), t.b / 2, (t.c / 2) - (t.c <= 240 ? t.j : t.j / 2), 17, 16711680, 0);
            }
        } else if (this.f == 3) {
            a(graphics);
            e(graphics);
        } else if (this.f != 4) {
            if (this.f == 5) {
                if (this.F != null && this.A != null) {
                    this.A.a(graphics, a.f, 0, 0);
                }
            } else if (this.f == 6) {
                a(graphics);
            } else if (this.f == -1) {
                a(graphics, "请等待......");
            } else if (this.f == 9) {
                a(graphics, "等待队友......");
            }
        }
        d(graphics);
        if (bt.bt && c > 0) {
            ca.a(graphics, new StringBuffer().append("自动回合:").append((int) c).toString(), (t.b - (t.i.stringWidth(new StringBuffer().append("自动回合:").append((int) c).toString()) / 2)) - 45, 2, 17, 16777215, 0);
        }
        if (t.o) {
            graphics.drawImage(a.U.a, t.b - a.U.b, t.c - a.U.c, 20);
        }
        graphics.setClip(0, 0, t.b, t.c);
    }

    private void n() {
        byte b2 = 0;
        while (true) {
            byte b3 = b2;
            if (b3 >= this.F.length) {
                this.B = this.y.ak;
                this.f = (short) 3;
                return;
            }
            if (this.F[b3].k >= 0 && this.F[b3].b == 1) {
                byte b4 = 0;
                while (true) {
                    byte b5 = b4;
                    if (b5 < bt.M.length) {
                        if (bt.M[b5] != null && !bt.M[b5].a() && this.F[b3].c == bt.M[b5].a) {
                            bt.M[b5].b((byte) 4);
                        }
                        b4 = (byte) (b5 + 1);
                    }
                }
            }
            b2 = (byte) (b3 + 1);
        }
    }

    private void o() {
        byte b2;
        if (this.E[0].a == 0) {
            byte b3 = 0;
            while (true) {
                byte b4 = b3;
                if (b4 >= bt.H.length) {
                    return;
                }
                bt.H[b4].l = false;
                if (bt.H[b4].a == this.E[0].b) {
                    if (this.E[0].d != 1 && this.E[0].d != 5 && this.E[0].d != 8 && this.E[0].d != 10) {
                        if (this.E[0].d == 2) {
                            bt.H[b4].l = true;
                            this.f = (short) 6;
                            return;
                        } else if (this.E[0].d == 3) {
                            bt.H[b4].m = true;
                            return;
                        } else {
                            if (this.E[0].d == -1) {
                                this.B = this.y.ak;
                                this.f = (short) 3;
                                return;
                            }
                            return;
                        }
                    }
                    if (this.E[0].d == 8) {
                        bt.H[b4].n = true;
                    }
                    this.A = null;
                    if (this.E[0].d == 5) {
                        if (this.E[0].e >= 10) {
                            this.A = new cj(this.E[0].e, v());
                            byte b5 = 0;
                            while (true) {
                                byte b6 = b5;
                                if (b6 >= this.A.b.length) {
                                    break;
                                }
                                if (this.F != null) {
                                    byte b7 = 0;
                                    while (true) {
                                        byte b8 = b7;
                                        if (b8 >= this.F.length) {
                                            break;
                                        }
                                        if (this.F[b8].b == 1 && this.F[b8].l == 0) {
                                            this.F[b8].l = (byte) 1;
                                            if (c((int) this.F[b8].c) >= 0 && c((int) this.F[b8].c) < bt.M.length && bt.M[c((int) this.F[b8].c)].m != null) {
                                                this.A.a(b6, t.R[this.F[b8].c][0], t.R[this.F[b8].c][1]);
                                            }
                                        } else if (this.F[b8].b == 0 && this.F[b8].l == 0) {
                                            this.F[b8].l = (byte) 1;
                                            if (bt.H[a(this.F[b8].c)].j != null) {
                                                this.A.a(b6, t.Q[this.F[b8].c][0], t.Q[this.F[b8].c][1]);
                                            }
                                        } else {
                                            b7 = (byte) (b8 + 1);
                                        }
                                    }
                                }
                                b5 = (byte) (b6 + 1);
                            }
                        }
                    } else if (this.E[0].d == 10) {
                        if (this.E[0].e >= 10) {
                            this.A = new cj(this.E[0].e, 1);
                            if (this.F != null) {
                                byte b9 = 0;
                                while (true) {
                                    byte b10 = b9;
                                    if (b10 >= this.F.length) {
                                        break;
                                    }
                                    if (this.F[b10].b < 0) {
                                        b9 = (byte) (b10 + 1);
                                    } else if (this.F[b10].b == 1) {
                                        this.A.a(0, t.R[1][0], t.R[1][1]);
                                    } else if (this.F[b10].b == 0) {
                                        this.A.a(0, t.Q[1][0], t.Q[1][1]);
                                    }
                                }
                            }
                        }
                    } else if (this.E[0].e >= 10) {
                        this.A = new cj(this.E[0].e, this.E[0].e == 22 ? 1 : w());
                        byte b11 = 0;
                        while (true) {
                            byte b12 = b11;
                            if (b12 >= this.A.b.length) {
                                break;
                            }
                            if (this.F != null) {
                                byte b13 = 0;
                                while (true) {
                                    b2 = b13;
                                    if (b2 < this.F.length) {
                                        if ((this.F[b2].b == 1 && this.F[b2].l == 0) || this.E[0].e == 22) {
                                            break;
                                        } else {
                                            b13 = (byte) (b2 + 1);
                                        }
                                    } else {
                                        break;
                                    }
                                }
                                this.F[b2].l = (byte) 1;
                                if (c((int) this.F[b2].c) >= 0 && c((int) this.F[b2].c) < bt.M.length && bt.M[c((int) this.F[b2].c)].m != null) {
                                    this.A.a(b12, t.R[this.F[b2].c][0], t.R[this.F[b2].c][1]);
                                }
                            }
                            b11 = (byte) (b12 + 1);
                        }
                    }
                    bt.H[b4].b((byte) 2);
                    this.f = (short) 2;
                    this.D = this.y.ak;
                    return;
                }
                b3 = (byte) (b4 + 1);
            }
        } else {
            if (this.E[0].a != 1) {
                return;
            }
            byte b14 = 0;
            while (true) {
                byte b15 = b14;
                if (b15 >= bt.M.length) {
                    return;
                }
                bt.M[b15].o = false;
                if (bt.M[b15].a == this.E[0].b) {
                    if (this.E[0].d != 6) {
                        if (t != 0 && this.E[0].d != 8 && ((t != 1 || (this.E[0].d != 1 && this.E[0].d != 5)) && ((t != 2 || (this.E[0].d != 1 && this.E[0].d != 5)) && ((t != 1 || (this.E[0].d != 1 && this.E[0].d != 10)) && (t != 2 || (this.E[0].d != 1 && this.E[0].d != 10)))))) {
                            if (this.E[0].d == 2) {
                                bt.M[b15].o = true;
                                this.f = (short) 6;
                                return;
                            } else if (this.E[0].d == 3) {
                                bt.M[b15].p = true;
                                return;
                            } else {
                                if (this.E[0].d == -1) {
                                    this.B = this.y.ak;
                                    this.f = (short) 3;
                                    return;
                                }
                                return;
                            }
                        }
                        if (this.E[0].d == 8) {
                            bt.M[b15].q = true;
                        }
                        bt.M[b15].b((byte) 2);
                        this.A = null;
                        if (this.E[0].d == 5) {
                            if (this.E[0].e >= 10) {
                                this.A = new cj(this.E[0].e, v());
                                byte b16 = 0;
                                while (true) {
                                    byte b17 = b16;
                                    if (b17 >= this.A.b.length) {
                                        break;
                                    }
                                    if (this.F != null) {
                                        byte b18 = 0;
                                        while (true) {
                                            byte b19 = b18;
                                            if (b19 < this.F.length) {
                                                if (this.F[b19].b == 0 && this.F[b19].l == 0) {
                                                    this.F[b19].l = (byte) 1;
                                                    if (a(this.F[b19].c) >= 0 && a(this.F[b19].c) <= bt.H.length - 1 && bt.H[a(this.F[b19].c)].j != null) {
                                                        this.A.a(b17, t.Q[this.F[b19].c][0], t.Q[this.F[b19].c][1]);
                                                        break;
                                                    }
                                                    b18 = (byte) (b19 + 1);
                                                } else {
                                                    if (this.F[b19].b == 1 && this.F[b19].l == 0) {
                                                        this.F[b19].l = (byte) 1;
                                                        if (c((int) this.F[b19].c) >= 0 && c((int) this.F[b19].c) <= bt.M.length - 1 && bt.M[c((int) this.F[b19].c)].m != null) {
                                                            this.A.a(b17, t.R[this.F[b19].c][0], t.R[this.F[b19].c][1]);
                                                            break;
                                                        }
                                                    }
                                                    b18 = (byte) (b19 + 1);
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                    }
                                    b16 = (byte) (b17 + 1);
                                }
                            }
                        } else if (this.E[0].d == 10) {
                            if (this.E[0].e >= 10) {
                                this.A = new cj(this.E[0].e, 1);
                                if (this.F != null) {
                                    byte b20 = 0;
                                    while (true) {
                                        byte b21 = b20;
                                        if (b21 >= this.F.length) {
                                            break;
                                        }
                                        if (this.F[b21].b < 0) {
                                            b20 = (byte) (b21 + 1);
                                        } else if (this.F[b21].b == 1) {
                                            this.A.a(0, t.R[1][0], t.R[1][1]);
                                        } else if (this.F[b21].b == 0) {
                                            this.A.a(0, t.Q[1][0], t.Q[1][1]);
                                        }
                                    }
                                }
                            }
                        } else if (this.E[0].e >= 10) {
                            this.A = new cj(this.E[0].e, w());
                            byte b22 = 0;
                            while (true) {
                                byte b23 = b22;
                                if (b23 >= this.A.b.length) {
                                    break;
                                }
                                if (this.F != null) {
                                    byte b24 = 0;
                                    while (true) {
                                        byte b25 = b24;
                                        if (b25 < this.F.length) {
                                            if (this.F[b25].b == 0 && this.F[b25].l == 0 && a(this.F[b25].c) >= 0 && a(this.F[b25].c) <= bt.H.length - 1 && bt.H[a(this.F[b25].c)].j != null) {
                                                this.F[b25].l = (byte) 1;
                                                this.A.a(b23, t.Q[this.F[b25].c][0], t.Q[this.F[b25].c][1]);
                                                break;
                                            }
                                            b24 = (byte) (b25 + 1);
                                        } else {
                                            break;
                                        }
                                    }
                                }
                                b22 = (byte) (b23 + 1);
                            }
                        }
                        this.f = (short) 2;
                        this.D = this.y.ak;
                        return;
                    }
                    return;
                }
                b14 = (byte) (b15 + 1);
            }
        }
    }

    private static void a(Vector vector, Vector vector2) {
        int i = 0;
        while (i < vector.size()) {
            if (!vector2.contains((bf) vector.elementAt(i))) {
                vector.removeElementAt(i);
                i = 0;
            }
            i++;
        }
        for (int i2 = 0; i2 < vector2.size(); i2++) {
            bf bfVar = (bf) vector2.elementAt(i2);
            if (!vector.contains(bfVar)) {
                vector.addElement(bfVar);
            }
        }
    }

    private void p() {
        if (this.I - this.C >= 1000) {
            this.C = this.y.ak;
            short s2 = (short) (s - 1);
            s = s2;
            if (s2 <= 0) {
                if (bt.bt && c <= 0) {
                    this.z.O();
                    c = (short) 0;
                    this.e = 5;
                    return;
                }
                this.j = (byte) 0;
                this.z.az = (this.z.az > bt.ej.length - 1 || this.z.az < 0) ? (byte) 0 : this.z.az;
                this.p = bt.ej[this.z.az];
                this.n = (byte) 1;
                this.h = (this.h > bt.M.length - 1 || this.h < 0) ? (byte) 0 : this.h;
                a(bt.bt ? (byte) 0 : (byte) 1, bt.bt ? 0 : 1, (byte) 1, bt.M[this.h].a, bt.bt ? (byte) 0 : (byte) 1, bt.bt ? 0 : 1, (byte) 1, bt.M[this.h].a);
                this.f = (short) -1;
                this.e = 5;
                if (ab.c()) {
                    return;
                }
                c = (byte) (bt.bt ? c - 1 : 0);
            }
        }
    }

    private void q() {
        if (bt.en[this.z.az] == -1 || this.z.az < 0 || this.z.az >= 8) {
            return;
        }
        this.j = (byte) 0;
        this.p = bt.ej[this.z.az];
        if (h() && bt.ek[this.z.az] != 2) {
            this.y.b("只能使用复活道具");
            return;
        }
        if (bt.el[this.z.az] == 2) {
            this.n = (byte) 1;
            this.o = bt.M[this.h].a;
            if (c() > 1 && c() > bt.em[this.z.az]) {
                this.d = 1;
                return;
            }
            if (!j()) {
                this.d = 2;
                this.e = 3;
                return;
            } else {
                a(this.j, this.p, this.n, this.o, (byte) 1, 1, (byte) 1, bt.M[this.h].a);
                this.f = (short) -1;
                this.e = 5;
                return;
            }
        }
        if (bt.el[this.z.az] == 1) {
            this.n = (byte) 0;
            this.i = f() < 0 ? this.i : f();
            this.d = 7;
        } else if (bt.el[this.z.az] == 0) {
            this.n = (byte) 0;
            byte bI = i();
            this.i = bI;
            this.o = bI;
            if (!j()) {
                this.d = 2;
                this.e = 3;
            } else {
                a(this.j, this.p, this.n, this.o, (byte) 1, 1, (byte) 1, (byte) -1);
                this.f = (short) -1;
                this.e = 5;
            }
        }
    }

    private void r() {
        if (bt.er[this.z.az] == 2) {
            this.l = (byte) 1;
            if (c() <= 1 || c() <= bt.es[this.z.az]) {
                a(this.j, this.p, this.n, this.o, (byte) 0, this.z.az, (byte) 1, bt.M[this.h].a);
                this.f = (short) -1;
                this.e = 5;
                return;
            } else {
                this.k = (byte) 0;
                this.q = bt.ep[this.z.az];
                this.d = 3;
                return;
            }
        }
        if (bt.er[this.z.az] != 1) {
            if (bt.er[this.z.az] == 0) {
                this.k = (byte) 0;
                this.q = bt.ep[this.z.az];
                this.m = (byte) (i() + 3);
                this.l = (byte) 0;
                this.i = g();
                a(this.j, this.p, this.n, this.o, this.k, this.q, this.l, this.m);
                this.f = (short) -1;
                this.e = 5;
                return;
            }
            return;
        }
        this.l = (byte) 0;
        this.k = (byte) 0;
        this.q = bt.ep[this.z.az];
        if (b() > 1 && b() > bt.es[this.z.az]) {
            this.i = g();
            this.d = 8;
            return;
        }
        byte bI = (byte) (i() + 3);
        this.i = bI;
        this.m = bI;
        this.l = (byte) 0;
        a(this.j, this.p, this.n, this.o, this.k, this.q, this.l, this.m);
        this.f = (short) -1;
        this.e = 5;
    }

    private boolean b(int i) {
        if (c() > 1) {
            return bt.ek != null && c() <= bt.em[this.z.az];
        }
        return true;
    }

    public static int b() {
        byte b2 = 0;
        byte b3 = 0;
        while (true) {
            byte b4 = b3;
            if (b4 >= bt.H.length) {
                return b2;
            }
            if (bt.H[b4].e > 0) {
                b2 = (byte) (b2 + 1);
            }
            b3 = (byte) (b4 + 1);
        }
    }

    public static int c() {
        int i = 0;
        byte b2 = 0;
        while (true) {
            byte b3 = b2;
            if (b3 >= bt.M.length) {
                return i;
            }
            if (bt.M[b3].e > 0) {
                i++;
            }
            b2 = (byte) (b3 + 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(byte r16, int r17, byte r18, byte r19, byte r20, int r21, byte r22, byte r23) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bq.a(byte, int, byte, byte, byte, int, byte, byte):void");
    }

    private static boolean a(byte b2, byte b3) {
        if (b2 == 0) {
            for (int i = 0; i < bt.H.length; i++) {
                if (bt.H[i].a == b3 && bt.H[i].e <= 0) {
                    return true;
                }
            }
            return false;
        }
        if (b2 != 1) {
            return false;
        }
        for (int i2 = 0; i2 < bt.M.length; i2++) {
            if (bt.M[i2].a == b3 && bt.M[i2].e <= 0) {
                return true;
            }
        }
        return false;
    }

    private void a(Graphics graphics) {
        int i;
        int i2;
        int i3;
        int i4;
        if (this.F == null || this.F.length <= 0) {
            return;
        }
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        byte b6 = 0;
        while (true) {
            byte b7 = b6;
            if (b7 >= this.F.length) {
                return;
            }
            if (this.F[b7].b == 1 && this.F[b7].d != 0 && c((int) this.F[b7].c) >= 0 && c((int) this.F[b7].c) < bt.M.length) {
                int i5 = this.F[b7].d;
                short s2 = t.R[this.F[b7].c][0];
                int iD = t.R[this.F[b7].c][1] - bt.M[c((int) this.F[b7].c)].d();
                if (this.F[b7].f <= 24) {
                    ae aeVar = this.F[b7];
                    int i6 = aeVar.f + 4;
                    i4 = i6;
                    aeVar.f = i6;
                } else {
                    i4 = 24;
                }
                a(graphics, i5, s2, (iD - i4) + (b2 * 10), 1, 0, 0);
                b2 = (byte) (b2 + 1);
            }
            if (this.F[b7].b == 1 && this.F[b7].e != 0 && c((int) this.F[b7].c) >= 0 && c((int) this.F[b7].c) < bt.M.length) {
                int i7 = this.F[b7].e;
                short s3 = t.R[this.F[b7].c][0];
                int iD2 = t.R[this.F[b7].c][1] - bt.M[c((int) this.F[b7].c)].d();
                if (this.F[b7].f <= 24) {
                    ae aeVar2 = this.F[b7];
                    int i8 = aeVar2.f + 4;
                    i3 = i8;
                    aeVar2.f = i8;
                } else {
                    i3 = 24;
                }
                a(graphics, i7, s3, (iD2 - i3) + (b3 * 10), 0, 0, 0);
                b3 = (byte) (b3 + 1);
            }
            if (this.F[b7].b == 0 && this.F[b7].d != 0 && a(this.F[b7].c) >= 0 && a(this.F[b7].c) < bt.H.length) {
                int i9 = this.F[b7].d;
                int i10 = t.Q[this.F[b7].c][0] + 10;
                int i11 = t.Q[this.F[b7].c][1] - bt.H[a(this.F[b7].c)].i();
                if (this.F[b7].f <= 24) {
                    ae aeVar3 = this.F[b7];
                    int i12 = aeVar3.f + 4;
                    i2 = i12;
                    aeVar3.f = i12;
                } else {
                    i2 = 24;
                }
                a(graphics, i9, i10, (i11 - i2) + (b4 * 10), 1, 0, 1);
                b4 = (byte) (b4 + 1);
            }
            if (this.F[b7].b == 0 && this.F[b7].e != 0 && a(this.F[b7].c) >= 0 && a(this.F[b7].c) < bt.H.length) {
                int i13 = this.F[b7].e;
                int i14 = t.Q[this.F[b7].c][0] + 10;
                int i15 = t.Q[this.F[b7].c][1] - bt.H[a(this.F[b7].c)].i();
                if (this.F[b7].f <= 24) {
                    ae aeVar4 = this.F[b7];
                    int i16 = aeVar4.f + 4;
                    i = i16;
                    aeVar4.f = i16;
                } else {
                    i = 24;
                }
                a(graphics, i13, i14, (i15 - i) + (b5 * 10), 0, 0, 1);
                b5 = (byte) (b5 + 1);
            }
            b6 = (byte) (b7 + 1);
        }
    }

    private void a(Graphics graphics, String str) {
        if (this.y.j != 2) {
            if (this.K == null) {
                this.K = ca.a(str, t.i, (t.b / 2) - 20, "/t");
            }
            if (this.K != null) {
                ca.a(graphics, (t.b - (t.k * 10)) / 2, ((t.c - (t.j * this.K.length)) - 20) / 2, t.k * 10, (t.j * this.K.length) + 20);
                for (int i = 0; i < this.K.length; i++) {
                    ca.a(graphics, this.K[i], t.b / 2, (((t.c - (t.j * this.K.length)) - 20) / 2) + 10 + (i * t.j), 17, ca.a, 0);
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
        e();
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
        a.f.a(this.z.f, ao.h, ao.i, true, false, 1283472);
        this.y.b();
        this.z.j();
        this.y.b();
        this.y.p = false;
        r = System.currentTimeMillis();
        g = -1;
    }

    public static void e() {
        if (bt.M != null) {
            byte b2 = 0;
            while (true) {
                byte b3 = b2;
                if (b3 >= bt.M.length) {
                    break;
                }
                if (bt.M[b3] != null) {
                    bt.M[b3].b();
                    bt.M[b3] = null;
                }
                b2 = (byte) (b3 + 1);
            }
            bt.M = null;
        }
        if (bt.H == null) {
            return;
        }
        byte b4 = 0;
        while (true) {
            byte b5 = b4;
            if (b5 >= bt.H.length) {
                bt.H = null;
                return;
            }
            if (bt.H[b5] != null) {
                bt.H[b5].e();
                bt.H[b5] = null;
            }
            b4 = (byte) (b5 + 1);
        }
    }

    private static void a(p pVar, ae aeVar) {
        pVar.e = aeVar.g;
        pVar.g = aeVar.h;
        pVar.f = aeVar.i;
        pVar.h = aeVar.j;
        if (!pVar.c.equals(bt.ad) || bt.x == -1) {
            return;
        }
        bt.aN = pVar.e;
        bt.aP = pVar.g;
        bt.aM = pVar.f;
        bt.aO = pVar.h;
    }

    public final int a(int i, int i2) {
        if (this.L == null) {
            return 0;
        }
        for (int i3 = 0; i3 < this.L.length; i3++) {
            if (i >= this.L[i3][0] && i <= this.L[i3][0] + this.L[i3][2] && i2 >= this.L[i3][1] && i2 <= this.L[i3][1] + this.L[i3][3]) {
                this.e = i3;
                return 1073741824;
            }
        }
        return 0;
    }

    private void b(Graphics graphics) {
        if (ao.Z == null) {
            return;
        }
        byte b2 = 0;
        while (true) {
            byte b3 = b2;
            if (b3 >= 5) {
                return;
            }
            int i = (t.c - 102) + (b3 << 4);
            short s2 = ao.Z.c;
            if (this.L != null && this.L.length > b3) {
                this.L[b3][0] = 1;
                this.L[b3][1] = i;
                this.L[b3][2] = 25;
                this.L[b3][3] = s2;
            }
            a.f.a(graphics, ao.Z, (int[]) null, b3 + 1, 0, 0, 1, (t.c - 102) + (b3 << 4), 0, 0);
            if (b3 == this.e) {
                graphics.setColor(16711680);
                ca.d(graphics, 1, (t.c - 102) + (this.e << 4), 25, 15);
                switch (this.e) {
                    case 0:
                        ca.a(graphics, "攻击", t.b / 2, (t.c - 22) - t.j, 17, 16776960, 0);
                        break;
                    case 1:
                        ca.a(graphics, "防御", t.b / 2, (t.c - 22) - t.j, 17, 16776960, 0);
                        break;
                    case 2:
                        ca.a(graphics, "技能", t.b / 2, (t.c - 22) - t.j, 17, 16776960, 0);
                        break;
                    case 3:
                        ca.a(graphics, "道具", t.b / 2, (t.c - 22) - t.j, 17, 16776960, 0);
                        break;
                    case 4:
                        ca.a(graphics, "逃跑", t.b / 2, (t.c - 22) - t.j, 17, 16776960, 0);
                        break;
                }
            }
            b2 = (byte) (b3 + 1);
        }
    }

    public final int b(int i, int i2) {
        if (this.M == null) {
            return 0;
        }
        for (int i3 = 0; i3 < this.M.length; i3++) {
            if (i >= this.M[i3][0] && i <= this.M[i3][0] + this.M[i3][2] && i2 >= this.M[i3][1] && i2 <= this.M[i3][1] + this.M[i3][3]) {
                this.e = i3;
                return 1073741824;
            }
        }
        return 0;
    }

    private void c(Graphics graphics) {
        if (ao.Z == null) {
            return;
        }
        byte b2 = 0;
        while (true) {
            byte b3 = b2;
            if (b3 >= 3) {
                return;
            }
            int i = (t.c - 70) + (b3 << 4);
            short s2 = ao.Z.c;
            if (this.M != null && this.M.length > b3) {
                this.M[b3][0] = 1;
                this.M[b3][1] = i;
                this.M[b3][2] = 25;
                this.M[b3][3] = s2;
            }
            a.f.a(graphics, ao.Z, (int[]) null, b3 + 1, 0, 0, 1, (t.c - 70) + (b3 << 4), 0, 0);
            if (b3 == this.e) {
                graphics.setColor(16711680);
                ca.d(graphics, 1, (t.c - 70) + (b3 << 4), 25, 15);
                switch (this.e) {
                    case 0:
                        ca.a(graphics, "攻击", t.b / 2, (t.c - 22) - t.j, 17, 16776960, 0);
                        break;
                    case 1:
                        ca.a(graphics, "防御", t.b / 2, (t.c - 22) - t.j, 17, 16776960, 0);
                        break;
                    case 2:
                        ca.a(graphics, "技能", t.b / 2, (t.c - 22) - t.j, 17, 16776960, 0);
                        break;
                }
            }
            b2 = (byte) (b3 + 1);
        }
    }

    public final int a(int i, int i2, int i3) {
        if (this.N == null) {
            return 0;
        }
        int i4 = i == 0 ? 5 : i == 2 ? 3 : 0;
        int i5 = i4;
        if (i4 == 0) {
            return 0;
        }
        for (int i6 = 0; i6 < this.N.length; i6++) {
            if (i2 >= this.N[i6][0] && i2 <= this.N[i6][0] + this.N[i6][2] && i3 >= this.N[i6][1] && i3 <= this.N[i6][1] + this.N[i6][3]) {
                if (this.z.az != i6 || this.e != i5) {
                    this.e = i5;
                    this.z.az = (byte) (i6 - 1);
                    return 2;
                }
                if (this.z.az == i6 && this.e == i5) {
                    return this.O[i6];
                }
            }
        }
        return 0;
    }

    private void d(Graphics graphics) {
        ai aiVar;
        Graphics graphics2;
        bf bfVar;
        int[] iArr;
        int i;
        if (bt.ej == null) {
            return;
        }
        if (this.d == 0 || this.d == 1 || this.d == 4) {
            this.z.a(graphics, 0, t.c - 22, 0);
        } else {
            this.z.a(graphics, 0, t.c - 22, 1);
        }
        byte b2 = 0;
        while (true) {
            byte b3 = b2;
            if (b3 >= bt.ej.length) {
                break;
            }
            if (b3 < 0 || b3 >= 8) {
                a.f.a(graphics, ao.F, (int[]) null, b3 == 8 ? 0 : 2, 0, 0, 3 + (bt.ej[b3] * 17), t.c - 19, 0, 0);
                aiVar = a.f;
                graphics2 = graphics;
                bfVar = ao.G;
                iArr = null;
                i = b3 == 8 ? 0 : 1;
            } else {
                aiVar = a.f;
                graphics2 = graphics;
                bfVar = a.n;
                iArr = null;
                i = b3 + 1;
            }
            aiVar.a(graphics2, bfVar, iArr, i, 0, 0, 3 + (bt.ej[b3] * 17), t.c - 19, 0, 0);
            int i2 = 3 + (b3 * 17);
            int i3 = t.c - 19;
            if (this.N != null && this.N.length > b3) {
                this.N[b3][0] = i2;
                this.N[b3][1] = i3;
                this.N[b3][2] = 17;
                this.N[b3][3] = 17;
            }
            b2 = (byte) (b3 + 1);
        }
        if ((this.e != 5 || bt.ej == null) && (this.e != 3 || bt.ej == null || this.d <= 1)) {
            return;
        }
        byte b4 = 0;
        while (true) {
            byte b5 = b4;
            if (b5 >= bt.ej.length) {
                return;
            }
            if (b5 == this.z.az) {
                graphics.setColor(16711680);
                ca.d(graphics, 2 + (b5 * 17), t.c - 20, 17, 17);
                if (this.f == 0) {
                    switch (this.z.az) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            if (this.d != 0) {
                                if (this.d == 2 && bt.et[this.z.az] != -1) {
                                    ca.a(graphics, bt.eu[this.z.az], t.b / 2, (t.c - 22) - t.j, 17, 16776960, 0);
                                    break;
                                }
                            } else if (bt.en[this.z.az] != -1) {
                                ca.a(graphics, bt.eo[this.z.az], t.b / 2, (t.c - 22) - t.j, 17, 16776960, 0);
                                break;
                            }
                            break;
                        case 8:
                            ca.a(graphics, "聊天记录", t.b / 2, (t.c - 22) - t.j, 17, 16776960, 0);
                            break;
                        case 9:
                            ca.a(graphics, "自动打怪", t.b / 2, (t.c - 22) - t.j, 17, 16776960, 0);
                            break;
                    }
                    return;
                }
                return;
            }
            b4 = (byte) (b5 + 1);
        }
    }

    private void e(Graphics graphics) {
        if (this.u == null) {
            return;
        }
        byte b2 = 0;
        while (true) {
            byte b3 = b2;
            if (b3 >= this.u.length) {
                return;
            }
            ca.a(graphics, this.u[b3], t.b / 2, ((t.c - (this.u.length * t.j)) / 2) + (b3 * t.j), 17, 15849739, 0);
            b2 = (byte) (b3 + 1);
        }
    }

    private int s() {
        if (this.A == null) {
            return 0;
        }
        cj cjVar = this.A;
        ai aiVar = a.f;
        return ai.a(cjVar.a, this.y.ak);
    }

    public final void a(i[] iVarArr) {
        if (this.v == null) {
            return;
        }
        for (int i = 0; i < bt.H.length; i++) {
            if (bt.H[i] != null) {
                bt.H[i].m = false;
                bt.H[i].l = false;
            }
        }
        synchronized (this.v) {
            this.v.addElement(iVarArr);
        }
    }

    public final void a(ae[] aeVarArr) {
        if (this.w == null) {
            return;
        }
        synchronized (this.w) {
            this.w.addElement(aeVarArr);
        }
    }

    public final void a(String str) {
        if (this.x == null) {
            return;
        }
        synchronized (this.x) {
            this.x.addElement(ca.a(str, t.i, (t.b * 5) / 7, "\t"));
        }
    }

    public static byte f() {
        byte b2 = 0;
        while (true) {
            byte b3 = b2;
            if (b3 >= bt.H.length) {
                return (byte) -1;
            }
            if (bt.H[b3].c.equals(bt.ad)) {
                return b3;
            }
            b2 = (byte) (b3 + 1);
        }
    }

    public final byte g() {
        byte b2 = 0;
        while (true) {
            byte b3 = b2;
            if (b3 >= bt.H.length) {
                return (byte) -1;
            }
            if (bt.H[b3].b != 0 && bt.H[b3].a == i() + 3) {
                return b3;
            }
            b2 = (byte) (b3 + 1);
        }
    }

    private static boolean t() {
        if (bt.M == null) {
            return true;
        }
        byte b2 = 0;
        while (true) {
            byte b3 = b2;
            if (b3 >= bt.M.length) {
                return true;
            }
            if (bt.M[b3] != null && bt.M[b3].e > 0) {
                return false;
            }
            b2 = (byte) (b3 + 1);
        }
    }

    private static boolean u() {
        if (bt.H == null) {
            return true;
        }
        byte b2 = 0;
        while (true) {
            byte b3 = b2;
            if (b3 >= bt.H.length) {
                return true;
            }
            if (bt.H[b3] != null && bt.H[b3].e > 0 && bt.H[b3].b != 2) {
                return false;
            }
            b2 = (byte) (b3 + 1);
        }
    }

    private static int a(byte b2) {
        byte b3 = 0;
        while (true) {
            byte b4 = b3;
            if (b4 >= bt.H.length) {
                return -1;
            }
            if (bt.H[b4].a == b2) {
                return b4;
            }
            b3 = (byte) (b4 + 1);
        }
    }

    private static int c(int i) {
        byte b2 = 0;
        while (true) {
            byte b3 = b2;
            if (b3 >= bt.M.length) {
                return -1;
            }
            if (bt.M[b3].a == i) {
                return b3;
            }
            b2 = (byte) (b3 + 1);
        }
    }

    public static boolean h() {
        byte b2 = 0;
        while (true) {
            byte b3 = b2;
            if (b3 >= bt.H.length) {
                return false;
            }
            if (bt.H[b3].b == 0 && bt.H[b3].c.equals(bt.ad) && bt.H[b3].e <= 0) {
                return true;
            }
            b2 = (byte) (b3 + 1);
        }
    }

    public static byte i() {
        byte b2 = 0;
        while (true) {
            byte b3 = b2;
            if (b3 >= bt.H.length) {
                return (byte) -1;
            }
            if (bt.H[b3].b == 0 && bt.H[b3].c.equals(bt.ad)) {
                return bt.H[b3].a;
            }
            b2 = (byte) (b3 + 1);
        }
    }

    public final boolean j() {
        byte b2 = 0;
        while (true) {
            byte b3 = b2;
            if (b3 >= bt.H.length) {
                return true;
            }
            if (bt.H[b3].b != 0 && bt.H[b3].a == i() + 3 && bt.H[b3].e > 0) {
                return false;
            }
            b2 = (byte) (b3 + 1);
        }
    }

    private static byte b(byte b2) {
        byte b3 = (byte) (b2 - 1);
        byte length = b3;
        if (b3 < 0) {
            length = (byte) (bt.M.length - 1);
        }
        while (bt.M[length].a()) {
            byte b4 = (byte) (length - 1);
            length = b4;
            if (b4 < 0) {
                length = (byte) (bt.M.length - 1);
            }
        }
        return length;
    }

    private static byte c(byte b2) {
        byte b3 = (byte) (b2 - 1);
        byte length = b3;
        if (b3 < 0) {
            length = (byte) (bt.H.length - 1);
        }
        return length;
    }

    private byte v() {
        byte b2 = 0;
        if (this.F != null) {
            byte b3 = 0;
            while (true) {
                byte b4 = b3;
                if (b4 >= this.F.length) {
                    break;
                }
                if (this.F[b4].a >= 5) {
                    b2 = (byte) (b2 + 1);
                }
                b3 = (byte) (b4 + 1);
            }
        }
        return b2;
    }

    private int w() {
        int i = 0;
        if (this.F != null) {
            byte b2 = 0;
            while (true) {
                byte b3 = b2;
                if (b3 >= this.F.length) {
                    break;
                }
                if (this.F[b3].b != this.E[0].a) {
                    i++;
                }
                b2 = (byte) (b3 + 1);
            }
        }
        return i;
    }

    private static boolean x() {
        byte b2 = 0;
        while (true) {
            byte b3 = b2;
            if (b3 >= bt.H.length) {
                byte b4 = 0;
                while (true) {
                    byte b5 = b4;
                    if (b5 >= bt.M.length) {
                        return true;
                    }
                    if (!bt.M[b5].a() && bt.M[b5].n != 1) {
                        return false;
                    }
                    b4 = (byte) (b5 + 1);
                }
            } else {
                if (!bt.H[b3].d() && bt.H[b3].k != 1) {
                    return false;
                }
                b2 = (byte) (b3 + 1);
            }
        }
    }

    public static void k() {
        if (bt.bt) {
            short s2 = s;
            P = s2;
            if (s2 <= 0) {
                P = (short) 1;
            }
            b = (short) 1;
            s = (short) 1;
        } else {
            s = P;
        }
        short s3 = bt.bt ? (short) 1 : a;
        b = s3;
        s = s3;
        c = bt.bt ? (short) 25 : (short) 0;
        ao.aW[15] = (byte) (bt.bt ? 0 : 1);
    }

    public final void l() {
        d();
        ao aoVar = this.z;
        this.z.k = (short) 0;
        aoVar.j = (short) 0;
    }

    public final void m() {
        for (int i = 0; i < bt.H.length; i++) {
            if (bt.H[i].c.equals(bt.ad)) {
                this.i = (byte) i;
                return;
            }
        }
    }

    private static boolean y() {
        for (int i = 0; i < bt.H.length; i++) {
            if (bt.H[i].c.equals(bt.ad) && bt.H[i].o) {
                return true;
            }
        }
        return false;
    }

    private static boolean d(byte b2) {
        return b2 == 4 || b2 == 6 || b2 == 7 || b2 == 5;
    }

    private void a(Graphics graphics, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = 0;
        int i8 = i >= 0 ? i : -i;
        int i9 = 0;
        while (i8 > 0) {
            i8 /= 10;
            i7 = i9;
            i9++;
        }
        int i10 = i6 == 0 ? ((i7 + 2) / 2) * 7 : (i7 + 2) * 7;
        graphics.drawRegion(ao.E.a, i >= 0 ? 8 : 0, i4 == 0 ? 0 : 10, 8, 10, 0, i2 - i10, i3, 0);
        int iD = i >= 0 ? i : -i;
        for (int i11 = i7; i11 >= 0; i11--) {
            graphics.drawRegion(ao.E.a, 16 + ((iD / d(i11)) * 7), i4 == 0 ? 0 : 10, 7, 10, 0, ((i2 + 8) + ((i7 - i11) * 7)) - i10, i3, 0);
            iD %= d(i11);
        }
    }

    private static int d(int i) {
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            i2 *= 10;
        }
        return i2;
    }
}

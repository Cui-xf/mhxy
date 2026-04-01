package com.yinhan.kjava.main;

import p000.C0009ai;
import p000.C0015ao;
import p000.C0017aq;
import p000.C0055ca;
import p000.C0062ch;
import p000.C0079k;
import p000.C0086r;
import p000.C0088t;

/* renamed from: com.yinhan.kjava.main.f */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-5080095226433994817/classes.dex */
public final class C0071f {

    /* renamed from: a */
    public C0015ao f2231a;

    /* renamed from: b */
    public RunnableC0066a f2232b;

    /* renamed from: c */
    public int f2233c;

    /* renamed from: d */
    public int f2234d;

    /* renamed from: e */
    public int f2235e;

    /* renamed from: f */
    public int f2236f;

    /* renamed from: g */
    private int f2237g;

    /* renamed from: h */
    private int f2238h;

    /* renamed from: i */
    private int f2239i = 0;

    /* renamed from: j */
    private int f2240j = 0;

    /* renamed from: k */
    private int f2241k = 0;

    public C0071f(RunnableC0066a runnableC0066a, C0009ai c0009ai) {
        this.f2232b = runnableC0066a;
    }

    /* renamed from: A */
    private void m1477A(int i, int i2) {
        if (this.f2231a.f359l == 0) {
            if (this.f2232b.f2149aq != null) {
                this.f2232b.f2126a = this.f2232b.f2149aq.mo69b(i, i2);
                return;
            }
            return;
        }
        if (this.f2231a.f359l == 1 || this.f2231a.f359l == 2 || this.f2231a.f359l == 3) {
            this.f2232b.f2126a = C0055ca.m1314b(i, i2);
        }
    }

    /* renamed from: B */
    private void m1478B(int i, int i2) {
        if (this.f2231a.f359l == 0) {
            if (this.f2232b.f2149aq != null) {
                this.f2232b.f2126a = this.f2232b.f2149aq.mo69b(i, i2);
                return;
            }
            return;
        }
        if (this.f2231a.f359l == 1) {
            this.f2232b.f2126a = C0055ca.m1322c(i, i2);
        }
    }

    /* renamed from: C */
    private void m1479C(int i, int i2) {
        if (this.f2231a.f359l == 0) {
            if (this.f2232b.f2149aq != null) {
                this.f2232b.f2126a = this.f2232b.f2149aq.mo69b(i, i2);
                return;
            }
            return;
        }
        if (this.f2231a.f359l == 1) {
            this.f2232b.f2126a = C0055ca.m1322c(i, i2);
        }
    }

    /* renamed from: D */
    private void m1480D(int i, int i2) {
        if (this.f2231a.f359l != 0 || this.f2232b.f2149aq == null) {
            return;
        }
        this.f2232b.f2126a = this.f2232b.f2149aq.mo69b(i, i2);
    }

    /* renamed from: E */
    private void m1481E(int i, int i2) {
        if (this.f2231a.f359l == 0) {
            if (this.f2232b.f2149aq != null) {
                this.f2232b.f2126a = this.f2232b.f2149aq.mo69b(i, i2);
                return;
            }
            return;
        }
        if (this.f2231a.f359l == 1) {
            this.f2232b.f2126a = C0055ca.m1322c(i, i2);
        } else {
            if (this.f2231a.f359l != 2 || this.f2231a.f190T == null) {
                return;
            }
            this.f2232b.f2126a = this.f2231a.f190T.mo69b(i, i2);
        }
    }

    /* renamed from: F */
    private void m1482F(int i, int i2) {
        if (this.f2231a.f359l == 0) {
            if (this.f2232b.f2149aq != null) {
                this.f2232b.f2126a = this.f2232b.f2149aq.mo69b(i, i2);
                return;
            }
            return;
        }
        if (this.f2231a.f359l == 1 || this.f2231a.f359l == 2 || this.f2231a.f359l == 5 || this.f2231a.f359l == 6 || this.f2231a.f359l == 7 || this.f2231a.f359l == 8) {
            this.f2232b.f2126a = C0055ca.m1322c(i, i2);
            return;
        }
        if (this.f2231a.f359l == 3) {
            this.f2232b.f2126a = this.f2231a.f190T.mo69b(i, i2);
            return;
        }
        if (this.f2231a.f359l != 4) {
            if (this.f2231a.f359l == 9) {
                this.f2232b.f2126a = C0055ca.m1314b(i, i2);
                return;
            }
            return;
        }
        if (this.f2231a.f360m == 0) {
            this.f2232b.f2126a = this.f2231a.m427c(i, i2);
        } else if (this.f2231a.f360m == 1) {
            this.f2232b.f2126a = this.f2231a.f190T.mo69b(i, i2);
        }
    }

    /* renamed from: G */
    private void m1483G(int i, int i2) {
        if (this.f2231a.f359l == 0) {
            if (this.f2232b.f2149aq != null) {
                this.f2232b.f2126a = this.f2232b.f2149aq.mo69b(i, i2);
                return;
            }
            return;
        }
        if (this.f2231a.f359l == 1) {
            this.f2232b.f2126a = C0055ca.m1322c(i, i2);
        } else {
            if (this.f2231a.f359l == 2) {
                if (this.f2232b.f2149aq != null) {
                    this.f2232b.f2126a = this.f2232b.f2149aq.mo69b(i, i2);
                    return;
                }
                return;
            }
            if (this.f2231a.f359l == 3) {
                this.f2232b.f2126a = C0055ca.m1314b(i, i2);
            }
        }
    }

    /* renamed from: H */
    private void m1484H(int i, int i2) {
        if (this.f2231a.f359l != 0 || this.f2232b.f2149aq == null) {
            return;
        }
        this.f2232b.f2126a = this.f2232b.f2149aq.mo69b(i, i2);
    }

    /* renamed from: I */
    private void m1485I(int i, int i2) {
        if (this.f2231a.f359l == 0) {
            if (this.f2232b.f2149aq != null) {
                this.f2232b.f2126a = this.f2232b.f2149aq.mo69b(i, i2);
                return;
            }
            return;
        }
        if (this.f2231a.f359l == 1) {
            this.f2232b.f2126a = C0055ca.m1327d(i, i2);
            if (C0055ca.m1330e(i, i2)) {
                this.f2232b.m1435a("捐献银两数量", 2);
                return;
            }
            return;
        }
        if (this.f2231a.f359l == 2) {
            this.f2232b.f2126a = C0055ca.m1327d(i, i2);
            if (C0055ca.m1330e(i, i2)) {
                this.f2232b.m1435a("捐献经验数量", 2);
                return;
            }
            return;
        }
        if (this.f2231a.f359l == 5) {
            this.f2232b.f2126a = C0055ca.m1327d(i, i2);
            if (C0055ca.m1330e(i, i2)) {
                this.f2232b.m1435a("取出银两数量", 2);
                return;
            }
            return;
        }
        if (this.f2231a.f359l == 3 || this.f2231a.f359l == 4) {
            if (this.f2231a.f360m == 0) {
                this.f2232b.f2126a = C0055ca.m1327d(i, i2);
                return;
            } else if (this.f2231a.f360m != 1) {
                return;
            }
        } else if (this.f2231a.f359l != 6 && this.f2231a.f359l != 7) {
            return;
        }
        this.f2232b.f2126a = C0055ca.m1314b(i, i2);
    }

    /* renamed from: J */
    private void m1486J(int i, int i2) {
        int i3;
        if (this.f2231a.f359l != 0 || this.f2232b.f2149aq == null) {
            return;
        }
        int iMo69b = this.f2232b.f2149aq.mo69b(i, i2);
        RunnableC0066a runnableC0066a = this.f2232b;
        if (iMo69b == 1073741824) {
            iMo69b = 0;
        }
        runnableC0066a.f2126a = iMo69b;
        RunnableC0066a runnableC0066a2 = this.f2232b;
        C0017aq c0017aq = this.f2231a.f183M;
        int i4 = this.f2232b.f2126a;
        if (i4 == 0) {
            int i5 = 0;
            while (true) {
                if (i5 < c0017aq.f381l.length) {
                    if (i >= c0017aq.f381l[i5][0] && i <= c0017aq.f381l[i5][0] + c0017aq.f381l[i5][2] && i2 >= c0017aq.f381l[i5][1] && i2 <= c0017aq.f381l[i5][1] + c0017aq.f381l[i5][3]) {
                        i3 = 8;
                        break;
                    } else {
                        if (i >= c0017aq.f382m[i5][0] && i <= c0017aq.f382m[i5][0] + c0017aq.f382m[i5][2] && i2 >= c0017aq.f382m[i5][1] && i2 <= c0017aq.f382m[i5][1] + c0017aq.f382m[i5][3]) {
                            i3 = 2;
                            break;
                        }
                        i5++;
                    }
                } else if (i >= c0017aq.f383n[0] && i <= c0017aq.f383n[0] + c0017aq.f383n[2] && i2 >= c0017aq.f383n[1] && i2 <= c0017aq.f383n[1] + c0017aq.f383n[3]) {
                    i3 = 1073741824;
                }
            }
        } else {
            i3 = i4;
        }
        runnableC0066a2.f2126a = i3;
    }

    /* renamed from: K */
    private void m1487K(int i, int i2) {
        if (this.f2231a.f359l == 0) {
            if (this.f2232b.f2149aq != null) {
                this.f2232b.f2126a = this.f2232b.f2149aq.mo69b(i, i2);
                return;
            }
            return;
        }
        if (this.f2231a.f359l == 1 || this.f2231a.f359l == 2) {
            this.f2232b.f2126a = C0055ca.m1322c(i, i2);
        }
    }

    /* renamed from: L */
    private void m1488L(int i, int i2) {
        if (this.f2231a.f359l == 0) {
            if (this.f2232b.f2149aq != null) {
                this.f2232b.f2126a = this.f2232b.f2149aq.mo69b(i, i2);
                return;
            }
            return;
        }
        if (this.f2231a.f359l == 1) {
            this.f2232b.f2126a = C0055ca.m1322c(i, i2);
        } else if (this.f2231a.f359l == 2) {
            this.f2232b.f2126a = C0055ca.m1327d(i, i2);
        }
    }

    /* renamed from: M */
    private void m1489M(int i, int i2) {
        if (this.f2231a.f359l != 0 || this.f2232b.f2149aq == null) {
            return;
        }
        this.f2232b.f2126a = this.f2232b.f2149aq.mo69b(i, i2);
    }

    /* renamed from: N */
    private void m1490N(int i, int i2) {
        if (this.f2231a.f359l != 0 || this.f2232b.f2149aq == null) {
            return;
        }
        this.f2232b.f2126a = this.f2232b.f2149aq.mo69b(i, i2);
        this.f2231a.m483r(this.f2232b.f2126a);
        this.f2232b.f2126a = 0;
    }

    /* renamed from: O */
    private void m1491O(int i, int i2) {
        if (this.f2231a.f359l != 0 || this.f2232b.f2149aq == null) {
            return;
        }
        this.f2232b.f2126a = this.f2232b.f2149aq.mo69b(i, i2);
        this.f2231a.m482q(this.f2232b.f2126a);
        this.f2232b.f2126a = 0;
    }

    /* renamed from: P */
    private void m1492P(int i, int i2) {
        if (this.f2231a.f359l == 0) {
            if (this.f2232b.f2149aq != null) {
                this.f2232b.f2126a = this.f2232b.f2149aq.mo69b(i, i2);
                return;
            }
            return;
        }
        if (this.f2231a.f359l == 1 || this.f2231a.f359l == 2) {
            this.f2232b.f2126a = C0055ca.m1322c(i, i2);
            return;
        }
        if (this.f2231a.f359l == 3 || this.f2231a.f359l == 5) {
            this.f2232b.f2126a = C0055ca.m1314b(i, i2);
        } else if (this.f2231a.f359l == 4) {
            this.f2232b.f2126a = C0055ca.m1327d(i, i2);
            if (C0055ca.m1330e(i, i2)) {
                this.f2232b.m1435a("拍卖价格", 2);
            }
        }
    }

    /* renamed from: Q */
    private void m1493Q(int i, int i2) {
        if (this.f2231a.f359l == 0) {
            if (this.f2232b.f2149aq != null) {
                this.f2232b.f2126a = this.f2232b.f2149aq.mo69b(i, i2);
                return;
            }
            return;
        }
        if (this.f2231a.f359l == 1 || this.f2231a.f359l == 2) {
            this.f2232b.f2126a = C0055ca.m1322c(i, i2);
        } else if (this.f2231a.f359l == 3) {
            this.f2232b.f2126a = C0055ca.m1314b(i, i2);
        }
    }

    /* renamed from: R */
    private void m1494R(int i, int i2) {
        if (this.f2231a.f359l == 0) {
            this.f2232b.f2126a = C0055ca.m1314b(i, i2);
        }
    }

    /* renamed from: S */
    private void m1495S(int i, int i2) {
        if (this.f2231a.f359l != 0 || this.f2232b.f2149aq == null) {
            return;
        }
        this.f2232b.f2126a = this.f2232b.f2149aq.mo69b(i, i2);
    }

    /* renamed from: T */
    private void m1496T(int i, int i2) {
        if (this.f2231a.f359l != 0 || this.f2232b.f2149aq == null) {
            return;
        }
        this.f2232b.f2126a = this.f2232b.f2149aq.mo69b(i, i2);
    }

    /* renamed from: U */
    private void m1497U(int i, int i2) {
        if (this.f2231a.f359l == 0) {
            if (this.f2232b.f2149aq != null) {
                this.f2232b.f2126a = this.f2232b.f2149aq.mo69b(i, i2);
                this.f2232b.f2126a = this.f2231a.f185O.m1617a(this.f2232b.f2126a, i, i2);
                return;
            }
            return;
        }
        if (this.f2231a.f359l == 1 || this.f2231a.f359l == 2) {
            this.f2232b.f2126a = C0055ca.m1322c(i, i2);
        } else if (this.f2231a.f359l == 3) {
            this.f2232b.f2126a = C0055ca.m1314b(i, i2);
        }
    }

    /* renamed from: V */
    private void m1498V(int i, int i2) {
        if (this.f2232b.f2149aq != null) {
            this.f2232b.f2126a = this.f2232b.f2149aq.mo69b(i, i2);
        }
    }

    /* renamed from: W */
    private void m1499W(int i, int i2) {
        if (this.f2231a.f359l != 0 || this.f2232b.f2149aq == null) {
            return;
        }
        this.f2232b.f2126a = this.f2232b.f2149aq.mo69b(i, i2);
    }

    /* renamed from: X */
    private void m1500X(int i, int i2) {
        int i3;
        if (this.f2231a.f359l != 0) {
            if (this.f2231a.f359l == 1) {
                this.f2232b.f2126a = C0055ca.m1322c(i, i2);
                return;
            }
            return;
        }
        if (this.f2232b.f2149aq != null) {
            this.f2232b.f2126a = this.f2232b.f2149aq.mo69b(i, i2);
            RunnableC0066a runnableC0066a = this.f2232b;
            C0062ch c0062ch = this.f2231a.f192V;
            int i4 = this.f2232b.f2126a;
            if (c0062ch.f2012a != null) {
                int i5 = 0;
                while (true) {
                    if (i5 >= c0062ch.f2012a.length - 3) {
                        break;
                    }
                    if (i < c0062ch.f2012a[i5][0] || i > c0062ch.f2012a[i5][0] + c0062ch.f2012a[i5][2] || i2 < c0062ch.f2012a[i5][1] || i2 > c0062ch.f2012a[i5][1] + c0062ch.f2012a[i5][3]) {
                        i5++;
                    } else if (c0062ch.f2013b == i5) {
                        i3 = 268435456;
                    } else {
                        c0062ch.f2013b = i5;
                        C0055ca.f1892l = 0;
                        c0062ch.m1361b();
                    }
                }
                i3 = i4;
            } else {
                i3 = i4;
            }
            runnableC0066a.f2126a = i3;
        }
    }

    /* renamed from: Y */
    private void m1501Y(int i, int i2) {
        if (this.f2231a.f359l != 0) {
            if (this.f2231a.f359l == 1) {
                this.f2232b.f2126a = C0055ca.m1322c(i, i2);
                return;
            }
            return;
        }
        if (this.f2232b.f2149aq != null) {
            this.f2232b.f2126a = this.f2232b.f2149aq.mo69b(i, i2);
            this.f2232b.f2126a = this.f2231a.f185O.m1623b(this.f2232b.f2126a, i, i2);
        }
    }

    /* renamed from: Z */
    private void m1502Z(int i, int i2) {
        int i3;
        if (this.f2231a.f359l != 0) {
            if (this.f2231a.f359l == 1) {
                this.f2232b.f2126a = C0055ca.m1322c(i, i2);
                return;
            }
            return;
        }
        if (this.f2232b.f2149aq != null) {
            this.f2232b.f2126a = this.f2232b.f2149aq.mo69b(i, i2);
            RunnableC0066a runnableC0066a = this.f2232b;
            C0086r c0086r = this.f2231a.f186P;
            int i4 = this.f2232b.f2126a;
            if (c0086r.f2454g != null) {
                int i5 = 0;
                while (true) {
                    if (i5 >= c0086r.f2454g.length) {
                        break;
                    }
                    if (i < c0086r.f2454g[i5][0] || i > c0086r.f2454g[i5][0] + c0086r.f2454g[i5][2] || i2 < c0086r.f2454g[i5][1] || i2 > c0086r.f2454g[i5][1] + c0086r.f2454g[i5][3]) {
                        i5++;
                    } else if (i5 < 2) {
                        c0086r.f2449b = 0;
                        if (c0086r.f2448a == i5) {
                            i3 = 268435456;
                        } else {
                            c0086r.f2448a = (byte) i5;
                            C0055ca.f1892l = 0;
                            c0086r.m1668a();
                        }
                    } else {
                        c0086r.f2449b = 1;
                        if (c0086r.f2448a == i5 - 2) {
                            i3 = 268435456;
                        } else {
                            c0086r.f2448a = (byte) (i5 - 2);
                            C0055ca.f1892l = 0;
                            c0086r.m1668a();
                        }
                    }
                }
                i3 = i4;
            } else {
                i3 = i4;
            }
            runnableC0066a.f2126a = i3;
        }
    }

    /* renamed from: aa */
    private void m1503aa(int i, int i2) {
        int i3;
        if (this.f2231a.f359l != 0) {
            if (this.f2231a.f359l == 1) {
                this.f2232b.f2126a = C0055ca.m1322c(i, i2);
                return;
            }
            return;
        }
        if (this.f2232b.f2149aq != null) {
            this.f2232b.f2126a = this.f2232b.f2149aq.mo69b(i, i2);
            RunnableC0066a runnableC0066a = this.f2232b;
            C0079k c0079k = this.f2231a.f187Q;
            int i4 = this.f2232b.f2126a;
            if (c0079k.f2288g != null) {
                for (int i5 = 0; i5 < c0079k.f2288g.length; i5++) {
                    if (i >= c0079k.f2288g[i5][0] && i <= c0079k.f2288g[i5][0] + c0079k.f2288g[i5][2] && i2 >= c0079k.f2288g[i5][1] && i2 <= c0079k.f2288g[i5][1] + c0079k.f2288g[i5][3]) {
                        if (i5 < 2) {
                            c0079k.f2283b = 0;
                            if (c0079k.f2282a == i5) {
                                i3 = 268435456;
                            } else {
                                c0079k.f2282a = (byte) (i5 - 1);
                                i3 = 2;
                            }
                        } else {
                            c0079k.f2283b = 1;
                            if (c0079k.f2282a == i5 - 2) {
                                i3 = 268435456;
                            } else {
                                c0079k.f2282a = (byte) (i5 - 3);
                                i3 = 2;
                            }
                        }
                    }
                }
                i3 = i4;
            } else {
                i3 = i4;
            }
            runnableC0066a.f2126a = i3;
        }
    }

    /* renamed from: ab */
    private void m1504ab(int i, int i2) {
        if (this.f2231a.f359l != 0 || this.f2232b.f2149aq == null) {
            return;
        }
        this.f2232b.f2126a = this.f2232b.f2149aq.mo69b(i, i2);
    }

    /* renamed from: ac */
    private void m1505ac(int i, int i2) {
        if (this.f2231a.f359l == 0) {
            if (this.f2232b.f2149aq != null) {
                this.f2232b.f2126a = this.f2232b.f2149aq.mo69b(i, i2);
                return;
            }
            return;
        }
        if (this.f2231a.f359l == 1) {
            this.f2232b.f2126a = C0055ca.m1327d(i, i2);
        }
    }

    /* renamed from: ad */
    private void m1506ad(int i, int i2) {
        if (this.f2232b.f2149aq != null) {
            this.f2232b.f2126a = this.f2232b.f2149aq.mo69b(i, i2);
        }
    }

    /* renamed from: ae */
    private void m1507ae(int i, int i2) {
        if (this.f2231a.f359l == 0) {
            if (this.f2232b.f2149aq != null) {
                this.f2232b.f2126a = this.f2232b.f2149aq.mo69b(i, i2);
                return;
            }
            return;
        }
        if (this.f2231a.f359l == 1) {
            this.f2232b.f2126a = C0055ca.m1322c(i, i2);
        } else {
            if (this.f2231a.f359l != 2 || this.f2232b.f2149aq == null) {
                return;
            }
            this.f2232b.f2126a = this.f2232b.f2149aq.mo69b(i, i2);
        }
    }

    /* renamed from: af */
    private void m1508af(int i, int i2) {
        if (this.f2231a.f359l != 0 || this.f2232b.f2149aq == null) {
            return;
        }
        this.f2232b.f2126a = this.f2232b.f2149aq.mo69b(i, i2);
        int i3 = this.f2232b.f2149aq.f2328a + 5;
        int i4 = ((this.f2232b.f2149aq.f2329b + this.f2232b.f2149aq.f2331d) - ((C0088t.f2524j * 2) + 16)) - 6;
        int iStringWidth = C0088t.f2523i.stringWidth("同意(点击申请结婚)");
        int iStringWidth2 = C0088t.f2523i.stringWidth("拒绝");
        if (i >= i3 + 4 && i2 >= i4 + 5 && i <= iStringWidth + i3 + 4 && i2 <= i4 + 5 + C0088t.f2524j) {
            this.f2232b.f2126a = this.f2231a.f189S.f2557d == 0 ? 1073741824 : this.f2232b.f2126a;
            this.f2231a.f189S.f2557d = 0;
        }
        if (i < i3 + 4 || i2 < i4 + 5 + C0088t.f2524j + 5 || i > i3 + 4 + iStringWidth2 || i2 > i4 + 5 + C0088t.f2524j + 5 + C0088t.f2524j) {
            return;
        }
        this.f2232b.f2126a = this.f2231a.f189S.f2557d != 1 ? this.f2232b.f2126a : 1073741824;
        this.f2231a.f189S.f2557d = 1;
    }

    /* renamed from: ag */
    private void m1509ag(int i, int i2) {
        if (this.f2231a.f359l != 0 || this.f2232b.f2149aq == null) {
            return;
        }
        this.f2232b.f2126a = this.f2232b.f2149aq.mo69b(i, i2);
        int i3 = this.f2232b.f2149aq.f2328a + 5;
        int i4 = ((this.f2232b.f2149aq.f2329b + this.f2232b.f2149aq.f2331d) - ((C0088t.f2524j * 2) + 16)) - 6;
        int iStringWidth = C0088t.f2523i.stringWidth("离婚(点击申请离婚)");
        int iStringWidth2 = C0088t.f2523i.stringWidth("取消离婚");
        if (i >= i3 + 4 && i2 >= i4 + 5 && i <= iStringWidth + i3 + 4 && i2 <= i4 + 5 + C0088t.f2524j) {
            this.f2232b.f2126a = this.f2231a.f189S.f2558g == 0 ? 1073741824 : this.f2232b.f2126a;
            this.f2231a.f189S.f2558g = 0;
        }
        if (i < i3 + 4 || i2 < i4 + 5 + C0088t.f2524j + 5 || i > i3 + 4 + iStringWidth2 || i2 > i4 + 5 + C0088t.f2524j + 5 + C0088t.f2524j) {
            return;
        }
        this.f2232b.f2126a = this.f2231a.f189S.f2558g != 1 ? this.f2232b.f2126a : 1073741824;
        this.f2231a.f189S.f2558g = 1;
    }

    /* renamed from: ah */
    private void m1510ah(int i, int i2) {
        if (this.f2231a.f359l != 0 || this.f2232b.f2149aq == null) {
            return;
        }
        this.f2232b.f2126a = this.f2232b.f2149aq.mo69b(i, i2);
    }

    /* renamed from: ai */
    private void m1511ai(int i, int i2) {
        if (this.f2231a.f359l == 0) {
            this.f2232b.f2126a = C0055ca.m1279a(i, i2);
        }
    }

    /* renamed from: aj */
    private void m1512aj(int i, int i2) {
        if (this.f2232b.f2149aq != null) {
            this.f2232b.f2126a = this.f2232b.f2149aq.mo69b(i, i2);
        }
    }

    /* renamed from: ak */
    private void m1513ak(int i, int i2) {
        if (this.f2232b.f2149aq != null) {
            this.f2232b.f2126a = this.f2232b.f2149aq.mo69b(i, i2);
        }
    }

    /* renamed from: al */
    private void m1514al(int i, int i2) {
        if (this.f2231a.f359l == 0) {
            this.f2232b.f2126a = C0055ca.m1322c(i, i2);
        } else if (this.f2231a.f359l == 1) {
            this.f2232b.f2126a = C0055ca.m1322c(i, i2);
        }
    }

    /* renamed from: am */
    private void m1515am(int i, int i2) {
        if (this.f2231a.f359l == 0) {
            if (this.f2232b.f2149aq != null) {
                this.f2232b.f2126a = this.f2232b.f2149aq.mo69b(i, i2);
                return;
            }
            return;
        }
        if (this.f2231a.f359l == 1 || this.f2231a.f359l == 2) {
            this.f2232b.f2126a = C0055ca.m1322c(i, i2);
        }
    }

    /* renamed from: an */
    private void m1516an(int i, int i2) {
        if (this.f2232b.f2149aq != null) {
            this.f2232b.f2126a = this.f2232b.f2149aq.mo69b(i, i2);
        }
    }

    /* renamed from: ao */
    private void m1517ao(int i, int i2) {
        if (this.f2231a.f190T != null) {
            this.f2232b.f2126a = this.f2231a.f190T.mo69b(i, i2);
        }
    }

    /* renamed from: ap */
    private void m1518ap(int i, int i2) {
        if (this.f2231a.f359l != 0) {
            this.f2232b.f2126a = C0055ca.m1322c(i, i2);
            return;
        }
        this.f2232b.f2126a = this.f2231a.m450f(i, i2);
        if (this.f2232b.f2126a == 0) {
            this.f2232b.f2126a = this.f2232b.f2149aq.mo69b(i, i2);
        }
    }

    /* renamed from: aq */
    private void m1519aq(int i, int i2) {
        if (this.f2231a.f359l == 0 || this.f2231a.f359l == 1) {
            if (this.f2232b.f2149aq != null) {
                this.f2232b.f2126a = this.f2232b.f2149aq.mo69b(i, i2);
                return;
            }
            return;
        }
        if (this.f2231a.f359l == 2 || this.f2231a.f359l == 3) {
            this.f2232b.f2126a = C0055ca.m1314b(i, i2);
        }
    }

    /* renamed from: ar */
    private void m1520ar(int i, int i2) {
        this.f2232b.f2126a = C0055ca.m1279a(i, i2);
    }

    /* renamed from: as */
    private void m1521as(int i, int i2) {
        this.f2232b.f2126a = C0055ca.m1314b(i, i2);
    }

    /* renamed from: at */
    private void m1522at(int i, int i2) {
        if (this.f2231a.f359l == 0) {
            if (this.f2232b.f2149aq != null) {
                this.f2232b.f2126a = this.f2232b.f2149aq.mo69b(i, i2);
                return;
            }
            return;
        }
        if (this.f2231a.f359l == 1) {
            this.f2232b.f2126a = C0055ca.m1322c(i, i2);
        }
    }

    /* renamed from: au */
    private void m1523au(int i, int i2) {
        if (this.f2232b.f2149aq != null) {
            if (this.f2231a.f359l == 0) {
                this.f2232b.f2126a = this.f2232b.f2149aq.mo69b(i, i2);
                if (this.f2231a.f184N.f1912a == 0) {
                    this.f2232b.f2126a = this.f2231a.f184N.m1333a(this.f2232b.f2126a, i, i2);
                    return;
                } else {
                    if (this.f2231a.f184N.f1912a == 1 || this.f2231a.f184N.f1912a != 2) {
                        return;
                    }
                    this.f2232b.f2126a = this.f2231a.f184N.m1333a(this.f2232b.f2126a, i, i2);
                    return;
                }
            }
            if (this.f2231a.f359l == 1) {
                this.f2232b.f2126a = C0055ca.m1322c(i, i2);
            } else if (this.f2231a.f359l == 2) {
                this.f2232b.f2126a = C0055ca.m1314b(i, i2);
            } else if (this.f2231a.f359l == 3) {
                this.f2232b.f2126a = this.f2231a.f190T.mo69b(i, i2);
            }
        }
    }

    /* renamed from: b */
    private void m1524b(int i, int i2) {
        if (this.f2231a.f359l == 0) {
            this.f2232b.f2126a = this.f2232b.f2149aq.mo69b(i, i2);
        } else if (this.f2231a.f359l == 1) {
            this.f2232b.f2126a = C0055ca.m1322c(i, i2);
        }
    }

    /* renamed from: c */
    private void m1525c(int i, int i2) {
        if (this.f2231a.f359l == 0) {
            this.f2232b.f2126a = this.f2232b.f2149aq.mo69b(i, i2);
        }
    }

    /* renamed from: d */
    private void m1526d(int i, int i2) {
        if (this.f2231a.f359l == 0) {
            this.f2232b.f2126a = this.f2232b.f2149aq.mo69b(i, i2);
        }
    }

    /* renamed from: e */
    private void m1527e(int i, int i2) {
        if (this.f2231a.f359l != 0 || this.f2232b.f2149aq == null) {
            return;
        }
        this.f2232b.f2126a = this.f2232b.f2149aq.mo69b(i, i2);
    }

    /* renamed from: f */
    private void m1528f(int i, int i2) {
        if (this.f2231a.f359l == 0) {
            if (this.f2232b.f2149aq != null) {
                this.f2232b.f2126a = this.f2232b.f2149aq.mo69b(i, i2);
                this.f2232b.f2126a = this.f2231a.m417b(this.f2232b.f2126a, i, i2);
                return;
            }
            return;
        }
        if (this.f2231a.f359l == 1) {
            this.f2232b.f2126a = C0055ca.m1322c(i, i2);
            return;
        }
        if (this.f2231a.f359l == 2) {
            if (this.f2232b.f2149aq != null) {
                this.f2232b.f2126a = this.f2232b.f2149aq.mo69b(i, i2);
                return;
            }
            return;
        }
        if (this.f2231a.f359l == 3 || this.f2231a.f359l == 6) {
            this.f2232b.f2126a = C0055ca.m1327d(i, i2);
        } else if (this.f2231a.f359l == 5 || this.f2231a.f359l == 4) {
            this.f2232b.f2126a = C0055ca.m1314b(i, i2);
        }
    }

    /* renamed from: g */
    private void m1529g(int i, int i2) {
        if (this.f2232b.f2149aq != null) {
            int iMo69b = this.f2232b.f2149aq.mo69b(i, i2);
            RunnableC0066a runnableC0066a = this.f2232b;
            if (iMo69b == 1073741824) {
                iMo69b = 0;
            }
            runnableC0066a.f2126a = iMo69b;
            this.f2232b.f2126a = this.f2231a.f183M.m506a(this.f2232b.f2126a, i, i2);
        }
    }

    /* renamed from: h */
    private void m1530h(int i, int i2) {
        if (this.f2231a.f359l == 0 && this.f2232b.f2149aq != null) {
            this.f2232b.f2126a = this.f2232b.f2149aq.mo69b(i, i2);
        } else if (this.f2231a.f359l == 1 && this.f2232b.f2154av != null) {
            this.f2232b.f2126a = this.f2232b.f2154av.mo30a(i, i2);
        } else if (this.f2231a.f359l == 2) {
            this.f2232b.f2126a = C0055ca.m1314b(i, i2);
        }
    }

    /* renamed from: i */
    private void m1531i(int i, int i2) {
        if (this.f2231a.f359l == 0) {
            if (this.f2232b.f2149aq != null) {
                this.f2232b.f2126a = this.f2232b.f2149aq.mo69b(i, i2);
                return;
            }
            return;
        }
        if (this.f2231a.f359l == 1) {
            this.f2232b.f2126a = C0055ca.m1322c(i, i2);
        }
    }

    /* renamed from: j */
    private void m1532j(int i, int i2) {
        if (this.f2231a.f359l == 0) {
            if (this.f2232b.f2149aq != null) {
                this.f2232b.f2126a = this.f2232b.f2149aq.mo69b(i, i2);
                return;
            }
            return;
        }
        if (this.f2231a.f359l == 1) {
            this.f2232b.f2126a = C0055ca.m1322c(i, i2);
        }
    }

    /* renamed from: k */
    private void m1533k(int i, int i2) {
        if (this.f2231a.f359l == 0) {
            this.f2232b.f2126a = C0055ca.m1279a(i, i2);
        } else if (this.f2231a.f359l == 1) {
            this.f2232b.f2126a = C0055ca.m1314b(i, i2);
        }
    }

    /* renamed from: l */
    private void m1534l(int i, int i2) {
        if (this.f2231a.f359l != 0 || this.f2232b.f2149aq == null) {
            return;
        }
        this.f2232b.f2126a = this.f2232b.f2149aq.mo69b(i, i2);
        if (this.f2232b.f2126a == 0) {
            this.f2232b.f2126a = this.f2231a.m417b(this.f2232b.f2126a, i, i2);
        }
    }

    /* renamed from: m */
    private void m1535m(int i, int i2) {
        if (this.f2231a.f359l == 0) {
            if (this.f2232b.f2149aq != null) {
                this.f2232b.f2126a = this.f2232b.f2149aq.mo69b(i, i2);
                return;
            }
            return;
        }
        if (this.f2231a.f359l == 6) {
            this.f2232b.f2126a = this.f2231a.m443e(i, i2);
        } else if (this.f2231a.f359l == 1 || this.f2231a.f359l == 7) {
            this.f2232b.f2126a = C0055ca.m1322c(i, i2);
        }
    }

    /* renamed from: n */
    private void m1536n(int i, int i2) {
        if (this.f2232b.f2149aq != null) {
            this.f2232b.f2126a = this.f2232b.f2149aq.mo69b(i, i2);
            RunnableC0066a runnableC0066a = this.f2232b;
            RunnableC0066a runnableC0066a2 = this.f2232b;
            int iM373a = this.f2231a.m373a(this.f2232b.f2126a, i, i2);
            runnableC0066a2.f2126a = iM373a;
            runnableC0066a.f2159b = iM373a;
        }
    }

    /* renamed from: o */
    private void m1537o(int i, int i2) {
        if (this.f2231a.f359l == 0) {
            if (this.f2232b.f2149aq != null) {
                this.f2232b.f2126a = this.f2232b.f2149aq.mo69b(i, i2);
                return;
            }
            return;
        }
        if (this.f2231a.f359l == 1 || this.f2231a.f359l == 2 || this.f2231a.f359l == 3) {
            this.f2232b.f2126a = C0055ca.m1322c(i, i2);
        } else {
            if (this.f2231a.f359l == 4) {
                if (this.f2232b.f2149aq != null) {
                    this.f2232b.f2126a = this.f2232b.f2149aq.mo69b(i, i2);
                    return;
                }
                return;
            }
            if (this.f2231a.f359l == 5) {
                this.f2232b.f2126a = this.f2231a.m427c(i, i2);
            }
        }
    }

    /* renamed from: p */
    private void m1538p(int i, int i2) {
        if (this.f2231a.f359l == 0 || this.f2231a.f359l == 10) {
            if (this.f2232b.f2149aq != null) {
                this.f2232b.f2126a = this.f2232b.f2149aq.mo69b(i, i2);
                return;
            }
            return;
        }
        if (this.f2231a.f359l == 1 || this.f2231a.f359l == 2 || this.f2231a.f359l == 3 || this.f2231a.f359l == 4 || this.f2231a.f359l == 5 || this.f2231a.f359l == 6 || this.f2231a.f359l == 7 || this.f2231a.f359l == 9) {
            this.f2232b.f2126a = C0055ca.m1322c(i, i2);
        } else if (this.f2231a.f359l == 8) {
            this.f2232b.f2126a = C0055ca.m1314b(i, i2);
        }
    }

    /* renamed from: q */
    private void m1539q(int i, int i2) {
        if (this.f2231a.f359l == 0 || this.f2231a.f359l == 1) {
            if (this.f2232b.f2149aq != null) {
                this.f2232b.f2126a = this.f2232b.f2149aq.mo69b(i, i2);
                this.f2232b.f2155aw = this.f2232b.f2151as.f2353a;
                this.f2232b.f2126a = this.f2231a.m436d(this.f2232b.f2126a, i, i2);
                if (this.f2232b.f2126a == 0 && C0015ao.f144aP.size() == 0) {
                    this.f2232b.f2126a = 1073741824;
                }
            }
        } else if (this.f2231a.f359l == 2 || this.f2231a.f359l == 3 || this.f2231a.f359l == 4 || this.f2231a.f359l == 5 || this.f2231a.f359l == 6) {
            this.f2232b.f2126a = C0055ca.m1322c(i, i2);
        }
        if (RunnableC0066a.f2120u == null || i < (C0088t.f2516b - 4) - RunnableC0066a.f2120u.f598a.getWidth() || i >= C0088t.f2516b - 4 || i2 < 4 || i2 > RunnableC0066a.f2120u.f598a.getHeight() + 4) {
            return;
        }
        this.f2232b.f2126a = 536870912;
    }

    /* renamed from: r */
    private void m1540r(int i, int i2) {
        if (this.f2231a.f359l == 6 || this.f2231a.f359l == 7) {
            this.f2232b.f2126a = C0055ca.m1314b(i, i2);
        } else if (this.f2231a.f359l == 8) {
            this.f2232b.f2126a = C0055ca.m1327d(i, i2);
        } else {
            this.f2232b.f2126a = this.f2231a.m372a(i, i2);
        }
    }

    /* renamed from: s */
    private void m1541s(int i, int i2) {
        if (this.f2231a.f359l != 0) {
            if (this.f2231a.f359l != 1 && this.f2231a.f359l != 3 && this.f2231a.f359l != 4 && this.f2231a.f359l != 5 && this.f2231a.f359l != 7 && this.f2231a.f359l != 9 && this.f2231a.f359l != 10) {
                return;
            }
            if (this.f2231a.f360m == 1 || this.f2231a.f360m == 2) {
                this.f2232b.f2126a = C0055ca.m1327d(i, i2);
                if (C0055ca.m1330e(i, i2)) {
                    this.f2232b.m1435a(this.f2231a.f360m == 1 ? "请输入取出银两" : "请输入存入银两", 2);
                    return;
                }
                return;
            }
            if (this.f2231a.f360m == 3) {
                this.f2232b.f2126a = C0055ca.m1327d(i, i2);
                if (C0055ca.m1330e(i, i2)) {
                    this.f2232b.m1435a("请输入竞标银两", 2);
                    return;
                }
                return;
            }
            if (this.f2231a.f360m == 4) {
                this.f2232b.f2126a = C0055ca.m1327d(i, i2);
                return;
            } else if (this.f2231a.f360m == 5 || this.f2231a.f360m == 6) {
                this.f2232b.f2126a = C0055ca.m1314b(i, i2);
                return;
            }
        }
        this.f2232b.f2126a = C0055ca.m1279a(i, i2);
    }

    /* renamed from: t */
    private void m1542t(int i, int i2) {
        if (this.f2232b.f2149aq != null) {
            int iMo69b = this.f2232b.f2149aq.mo69b(i, i2);
            if (iMo69b == 1073741824) {
                iMo69b = (this.f2232b.f2150ar.m1275g() == 0 || this.f2232b.f2150ar.m1275g() == 1) ? this.f2231a.m451f(this.f2232b.f2150ar.m1275g(), i, i2) : 8;
            }
            this.f2232b.f2126a = iMo69b;
        }
    }

    /* renamed from: u */
    private void m1543u(int i, int i2) {
        if ((this.f2231a.f359l == 0 || this.f2231a.f359l == 1) && this.f2232b.f2149aq != null) {
            this.f2232b.f2126a = this.f2232b.f2149aq.mo69b(i, i2);
        }
    }

    /* renamed from: v */
    private void m1544v(int i, int i2) {
        if (this.f2231a.f359l == 0) {
            if (this.f2232b.f2149aq != null) {
                this.f2232b.f2126a = this.f2232b.f2149aq.mo69b(i, i2);
                return;
            }
            return;
        }
        if (this.f2231a.f359l == 3 || this.f2231a.f359l == 11) {
            if (this.f2231a.f190T != null) {
                this.f2232b.f2126a = this.f2231a.f190T.mo69b(i, i2);
                return;
            }
            return;
        }
        if (this.f2231a.f359l == 1 || this.f2231a.f359l == 2 || this.f2231a.f359l == 5 || this.f2231a.f359l == 6 || this.f2231a.f359l == 8 || this.f2231a.f359l == 9 || this.f2231a.f359l == 10) {
            this.f2232b.f2126a = C0055ca.m1322c(i, i2);
            return;
        }
        if (this.f2231a.f359l == 4 || this.f2231a.f359l == 12) {
            if (this.f2231a.f360m == 1) {
                this.f2232b.f2126a = this.f2231a.f190T.mo69b(i, i2);
                return;
            } else {
                this.f2232b.f2126a = this.f2231a.m427c(i, i2);
                return;
            }
        }
        if (this.f2231a.f359l == 7) {
            this.f2232b.f2126a = C0055ca.m1327d(i, i2);
            if (C0055ca.m1330e(i, i2)) {
                this.f2232b.m1435a("请输入决斗金额", 2);
            }
        }
    }

    /* renamed from: w */
    private void m1545w(int i, int i2) {
        if (i < this.f2231a.f197aB || i > this.f2231a.f197aB + ((this.f2231a.f355f.f456a * this.f2231a.f199aD) / 16) || i2 < this.f2231a.f198aC || i2 > this.f2231a.f198aC + ((this.f2231a.f355f.f457b * this.f2231a.f199aD) / 16)) {
            this.f2232b.f2126a = 536870912;
        }
    }

    /* renamed from: x */
    private void m1546x(int i, int i2) {
        if (this.f2231a.f359l == 0) {
            if (this.f2232b.f2149aq != null) {
                this.f2232b.f2126a = this.f2232b.f2149aq.mo69b(i, i2);
                return;
            }
            return;
        }
        if (this.f2231a.f359l == 1 || this.f2231a.f359l == 2 || this.f2231a.f359l == 3 || this.f2231a.f359l == 4 || this.f2231a.f359l == 5 || this.f2231a.f359l == 6 || this.f2231a.f359l == 7 || this.f2231a.f359l == 8 || this.f2231a.f359l == 10) {
            this.f2232b.f2126a = C0055ca.m1322c(i, i2);
        } else if (this.f2231a.f359l == 9) {
            this.f2232b.f2126a = C0055ca.m1314b(i, i2);
        }
    }

    /* renamed from: y */
    private void m1547y(int i, int i2) {
        if (this.f2231a.f359l == 0) {
            this.f2232b.f2126a = C0055ca.m1279a(i, i2);
        } else if (this.f2231a.f359l == 1) {
            this.f2232b.f2126a = this.f2232b.f2149aq.mo69b(i, i2);
        }
    }

    /* renamed from: z */
    private void m1548z(int i, int i2) {
        if (i < (this.f2231a.f264ba.f1782e - C0015ao.f167h) + this.f2231a.m456g() || i > (this.f2231a.f264ba.f1782e - C0015ao.f167h) + this.f2231a.m456g() + this.f2231a.f264ba.m1002a() || i2 < (this.f2231a.f264ba.f1783f - C0015ao.f168i) + this.f2231a.m460h() || i2 > (this.f2231a.f264ba.f1783f - C0015ao.f168i) + this.f2231a.m460h() + this.f2231a.f264ba.m1006b()) {
            this.f2240j++;
            if (this.f2240j >= 2 && this.f2241k <= 30) {
                this.f2240j = 0;
                this.f2232b.f2126a = 536870912;
                this.f2231a.m367V();
                this.f2232b.f2126a = 0;
            }
            this.f2241k = 0;
            this.f2239i = 0;
            return;
        }
        this.f2233c = 1;
        this.f2239i++;
        if (this.f2239i >= 2 && this.f2241k <= 30) {
            this.f2239i = 0;
            this.f2232b.f2126a = 1073741824;
            this.f2231a.m367V();
            this.f2232b.f2126a = 0;
        }
        this.f2241k = 0;
        this.f2240j = 0;
    }

    /* renamed from: a */
    public final void m1549a() {
        if (this.f2231a != null) {
            switch (this.f2231a.f358k) {
                case 0:
                    if (this.f2234d != 0) {
                        this.f2237g = (this.f2231a.f181I.f402j - C0015ao.f167h) + this.f2231a.m456g() + 8;
                        this.f2238h = (this.f2231a.f181I.f403k - C0015ao.f168i) + this.f2231a.m460h() + 16;
                        if ((this.f2232b.f2131aF > this.f2237g ? this.f2232b.f2131aF - this.f2237g : this.f2237g - this.f2232b.f2131aF) <= 4) {
                            if ((this.f2232b.f2132aG > this.f2238h ? this.f2232b.f2132aG - this.f2238h : this.f2238h - this.f2232b.f2132aG) > (this.f2232b.f2131aF > this.f2237g ? this.f2232b.f2131aF - this.f2237g : this.f2237g - this.f2232b.f2131aF)) {
                                if (this.f2232b.f2132aG >= this.f2238h) {
                                    this.f2232b.f2159b = 4;
                                } else if (this.f2232b.f2132aG < this.f2238h) {
                                    this.f2232b.f2159b = 1;
                                }
                            }
                        } else if (this.f2232b.f2131aF >= this.f2237g) {
                            this.f2232b.f2159b = 2;
                        } else if (this.f2232b.f2131aF < this.f2237g) {
                            this.f2232b.f2159b = 8;
                        }
                        if (this.f2232b.f2131aF <= this.f2237g + 5 && this.f2232b.f2131aF >= this.f2237g - 5) {
                            if ((this.f2232b.f2132aG <= this.f2238h + 5) & (this.f2232b.f2132aG >= this.f2238h + (-5))) {
                                this.f2232b.f2159b = 0;
                                break;
                            }
                        }
                    }
                    break;
                case 39:
                    if (this.f2234d != 1) {
                        this.f2241k++;
                        if (this.f2241k > 30) {
                            this.f2240j = 0;
                            break;
                        }
                    } else {
                        this.f2237g = (this.f2231a.f264ba.f1782e - C0015ao.f167h) + this.f2231a.m456g() + (this.f2231a.f264ba.m1002a() / 2);
                        this.f2238h = (this.f2231a.f264ba.f1783f - C0015ao.f168i) + this.f2231a.m460h() + (this.f2231a.f264ba.m1006b() / 2);
                        if ((this.f2232b.f2131aF > this.f2237g ? this.f2232b.f2131aF - this.f2237g : this.f2237g - this.f2232b.f2131aF) > 4) {
                            if (this.f2232b.f2131aF >= this.f2237g) {
                                this.f2232b.f2159b = 2;
                            } else if (this.f2232b.f2131aF < this.f2237g) {
                                this.f2232b.f2159b = 8;
                            }
                            this.f2239i = 0;
                        } else {
                            if ((this.f2232b.f2132aG > this.f2238h ? this.f2232b.f2132aG - this.f2238h : this.f2238h - this.f2232b.f2132aG) > (this.f2232b.f2131aF > this.f2237g ? this.f2232b.f2131aF - this.f2237g : this.f2237g - this.f2232b.f2131aF)) {
                                if (this.f2232b.f2132aG >= this.f2238h) {
                                    this.f2232b.f2159b = 4;
                                } else if (this.f2232b.f2132aG < this.f2238h) {
                                    this.f2232b.f2159b = 1;
                                }
                                this.f2239i = 0;
                            }
                        }
                        if (this.f2232b.f2131aF <= this.f2237g + 5 && this.f2232b.f2131aF >= this.f2237g - 5) {
                            if ((this.f2232b.f2132aG <= this.f2238h + 5) & (this.f2232b.f2132aG >= this.f2238h + (-5))) {
                                this.f2232b.f2159b = 0;
                            }
                        }
                        this.f2241k = 0;
                        this.f2240j = 0;
                        break;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:735:0x0218, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e7  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1550a(int r9, int r10) {
        /*
            Method dump skipped, instructions count: 5120
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yinhan.kjava.main.C0071f.m1550a(int, int):void");
    }
}

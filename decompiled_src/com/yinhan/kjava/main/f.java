/*
 * Decompiled with CFR 0.152.
 */
package com.yinhan.kjava.main;

import com.yinhan.kjava.main.a;

public final class f {
    public ao a;
    public a b;
    public int c;
    public int d;
    private int g;
    private int h;
    public int e;
    public int f;
    private int i = 0;
    private int j = 0;
    private int k = 0;

    public f(a a2, ai ai2) {
        this.b = a2;
    }

    /*
     * Unable to fully structure code
     */
    public final void a(int var1_1, int var2_2) {
        block256: {
            if (this.a == null || this.b.j != 7) break block256;
            block0 : switch (this.a.k) {
                case 0: {
                    if (this.a.k == 0 && this.a.J != null) {
                        this.b.a = ca.b(var1_1, var2_2);
                        break;
                    }
                    if (bt.t != null) {
                        for (var3_3 = 0; var3_3 < bt.t.length; ++var3_3) {
                            if (bt.t[var3_3] == null || !bt.t[var3_3].x || ao.u == null || !(var1_1 >= bt.t[var3_3].c - ao.h + this.a.g() - bt.t[var3_3].c() / 2 && var1_1 <= bt.t[var3_3].c - ao.h + this.a.g() + bt.t[var3_3].c() / 2 && var2_2 >= bt.t[var3_3].d - ao.i + this.a.h() - bt.t[var3_3].d() && var2_2 <= bt.t[var3_3].d - ao.i + this.a.h() || var1_1 >= bt.t[var3_3].c - ao.h + this.a.g() + bt.t[var3_3].c() / 2 && var1_1 <= bt.t[var3_3].c - ao.h + this.a.g() + bt.t[var3_3].c() / 2 + ao.u.i() && var2_2 >= bt.t[var3_3].d - ao.i + this.a.h() - bt.t[var3_3].d() && var2_2 <= bt.t[var3_3].d - ao.i + this.a.h() - bt.t[var3_3].d() + ao.u.j()) && (var1_1 < bt.t[var3_3].c - ao.h + this.a.g() - ao.s.i() / 2 || var1_1 > bt.t[var3_3].c - ao.h + this.a.g() + ao.s.i() / 2 || var2_2 < bt.t[var3_3].d - ao.i + this.a.h() - bt.t[var3_3].d() - t.j - ao.s.j() || var2_2 > bt.t[var3_3].d - ao.i + this.a.h() - bt.t[var3_3].d() - t.j)) continue;
                            this.a.a(0x40000000);
                            if (this.a.I.c.isEmpty()) break block0;
                            this.a.I.c.removeAllElements();
                            this.a.I.a(true);
                            break block0;
                        }
                    }
                    var5_7 = var2_2;
                    var3_3 = var1_1;
                    var4_8 = this;
                    if (!ao.i() || var4_8.a.I.g == null) ** GOTO lbl-1000
                    switch (var4_8.a.I.h) {
                        case 1: {
                            if (var3_3 >= var4_8.a.I.j + 8 - var4_8.a.I.g.g() / 2 - (ao.h - var4_8.a.g()) && var3_3 <= var4_8.a.I.j + 8 + var4_8.a.I.g.g() / 2 - (ao.h - var4_8.a.g()) && var5_7 >= var4_8.a.I.k - (ao.i - var4_8.a.h()) - 12 && var5_7 <= var4_8.a.I.k + var4_8.a.I.g.h() - (ao.i - var4_8.a.h()) - 5) {
                                var4_8.b.a = 0x20000000;
                                var4_8.a.I.c.removeAllElements();
                                var4_8.a.I.a(true);
                                v0 = true;
                                break;
                            }
                            ** GOTO lbl51
                        }
                        case 3: {
                            if (var3_3 >= var4_8.a.I.j + 8 - var4_8.a.I.g.g() / 2 - (ao.h - var4_8.a.g()) && var3_3 <= var4_8.a.I.j + 8 + var4_8.a.I.g.g() / 2 - (ao.h - var4_8.a.g()) && var5_7 >= var4_8.a.I.k + 8 - var4_8.a.I.g.h() - (ao.i - var4_8.a.h()) - 4 && var5_7 <= var4_8.a.I.k + 8 - (ao.i - var4_8.a.h()) + 4) {
                                var4_8.b.a = 0x20000000;
                                var4_8.a.I.c.removeAllElements();
                                var4_8.a.I.a(true);
                                v0 = true;
                                break;
                            }
                            ** GOTO lbl51
                        }
                        case 0: {
                            if (var3_3 >= var4_8.a.I.j + 16 - var4_8.a.I.g.g() / 2 - (ao.h - var4_8.a.g()) - 3 && var3_3 <= var4_8.a.I.j + 16 + var4_8.a.I.g.g() / 2 - (ao.h - var4_8.a.g()) - 5 && var5_7 >= var4_8.a.I.k + 16 - var4_8.a.I.g.h() - (ao.i - var4_8.a.h()) && var5_7 <= var4_8.a.I.k + 16 - (ao.i - var4_8.a.h())) {
                                var4_8.b.a = 0x20000000;
                                var4_8.a.I.c.removeAllElements();
                                var4_8.a.I.a(true);
                                v0 = true;
                                break;
                            }
                            ** GOTO lbl51
                        }
                        case 2: {
                            if (var3_3 >= var4_8.a.I.j - var4_8.a.I.g.g() / 2 - (ao.h - var4_8.a.g()) + 4 && var3_3 <= var4_8.a.I.j + var4_8.a.I.g.g() / 2 - (ao.h - var4_8.a.g()) + 4 && var5_7 >= var4_8.a.I.k + 16 - var4_8.a.I.g.h() - (ao.i - var4_8.a.h()) && var5_7 <= var4_8.a.I.k + 16 - (ao.i - var4_8.a.h())) {
                                var4_8.b.a = 0x20000000;
                                var4_8.a.I.c.removeAllElements();
                                var4_8.a.I.a(true);
                                v0 = true;
                                break;
                            }
                        }
lbl51:
                        // 6 sources

                        default: lbl-1000:
                        // 2 sources

                        {
                            v0 = false;
                        }
                    }
                    if (v0) ** GOTO lbl139
                    var5_7 = var2_2;
                    var3_3 = var1_1;
                    var4_8 = this;
                    if (bt.fz == null || bt.fz.length <= 0 || bt.s == 0) ** GOTO lbl90
                    block120: for (var6_10 = 0; var6_10 < bt.fz.length; ++var6_10) {
                        if (bt.fz[var6_10] != 1 || var4_8.a.I.d.f == null) continue;
                        switch (var4_8.a.I.d.j) {
                            case 1: {
                                if (var3_3 >= var4_8.a.I.d.h + 8 - var4_8.a.I.d.f.g() / 2 - (ao.h - var4_8.a.g()) && var3_3 <= var4_8.a.I.d.h + 8 + var4_8.a.I.d.f.g() / 2 - (ao.h - var4_8.a.g()) && var5_7 >= var4_8.a.I.d.i - (ao.i - var4_8.a.h()) && var5_7 <= var4_8.a.I.d.i + var4_8.a.I.d.f.h() - (ao.i - var4_8.a.h())) {
                                    var4_8.b.a = 48;
                                    var4_8.a.I.c.removeAllElements();
                                    var4_8.a.I.a(true);
                                    break block120;
                                }
                                ** GOTO lbl88
                            }
                            case 3: {
                                if (var3_3 >= var4_8.a.I.d.h + 8 - var4_8.a.I.d.f.g() / 2 - (ao.h - var4_8.a.g()) && var3_3 <= var4_8.a.I.d.h + 8 + var4_8.a.I.d.f.g() / 2 - (ao.h - var4_8.a.g()) && var5_7 >= var4_8.a.I.d.i + 8 - var4_8.a.I.d.f.h() - (ao.i - var4_8.a.h()) && var5_7 <= var4_8.a.I.d.i + 8 - (ao.i - var4_8.a.h())) {
                                    var4_8.b.a = 48;
                                    var4_8.a.I.c.removeAllElements();
                                    var4_8.a.I.a(true);
                                    break block120;
                                }
                                ** GOTO lbl88
                            }
                            case 0: {
                                if (var3_3 >= var4_8.a.I.d.h + 16 - var4_8.a.I.d.f.g() / 2 - (ao.h - var4_8.a.g()) && var3_3 <= var4_8.a.I.d.h + 16 + var4_8.a.I.d.f.g() / 2 - (ao.h - var4_8.a.g()) && var5_7 >= var4_8.a.I.d.i + 16 - var4_8.a.I.d.f.h() - (ao.i - var4_8.a.h()) && var5_7 <= var4_8.a.I.d.i + 16 - (ao.i - var4_8.a.h())) {
                                    var4_8.b.a = 48;
                                    var4_8.a.I.c.removeAllElements();
                                    var4_8.a.I.a(true);
                                    break block120;
                                }
                                ** GOTO lbl88
                            }
                            case 2: {
                                if (var3_3 >= var4_8.a.I.d.h - var4_8.a.I.d.f.g() / 2 - (ao.h - var4_8.a.g()) && var3_3 <= var4_8.a.I.d.h + var4_8.a.I.d.f.g() / 2 - (ao.h - var4_8.a.g()) && var5_7 >= var4_8.a.I.d.i + 16 - var4_8.a.I.d.f.h() - (ao.i - var4_8.a.h()) && var5_7 <= var4_8.a.I.d.i + 16 - (ao.i - var4_8.a.h())) {
                                    var4_8.b.a = 48;
                                    var4_8.a.I.c.removeAllElements();
                                    var4_8.a.I.a(true);
                                    break block120;
                                }
                            }
lbl88:
                            // 6 sources

                            default: {
                                continue block120;
                            }
                        }
                    }
lbl90:
                    // 6 sources

                    if (ao.aW[6] == 0 && var1_1 >= 2 && var1_1 <= 2 + com.yinhan.kjava.main.a.f.e && var2_2 >= 2 + t.j && var2_2 <= 2 + t.j + com.yinhan.kjava.main.a.f.f) {
                        this.b.a = 519;
                        if (this.a.I.c.isEmpty()) break;
                        this.a.I.c.removeAllElements();
                        this.a.I.a(true);
                        break;
                    }
                    if (this.a.k == 25) ** GOTO lbl110
                    var3_3 = 0;
                    if (var1_1 >= t.b - bo.g[0].getWidth() - 10 && var1_1 <= t.b - 10 && var2_2 >= 40 && var2_2 <= 40 + bo.g[0].getHeight()) {
                        var3_3 = 1;
                    }
                    if (var3_3 == 0) ** GOTO lbl110
                    if (bt.P.o) {
                        this.a.d((byte)1);
                    } else if (bt.O.u) {
                        this.a.d((byte)0);
                    } else {
                        if (!this.a.n || !ao.i()) break;
                        this.b.a = 1024;
                        break;
lbl110:
                        // 2 sources

                        if (ao.L != null && var1_1 >= ao.L.e - ao.h && var1_1 <= ao.L.e - ao.h + ao.L.d.g() && var2_2 >= ao.L.f - ao.i && var2_2 <= ao.L.f - ao.i + ao.L.d.h()) {
                            this.b.a = 0x40000000;
                            if (this.a.I.c.isEmpty()) break;
                            this.a.I.c.removeAllElements();
                            this.a.I.a(true);
                            break;
                        }
                        if (var1_1 >= t.b - 67 + 37 && var1_1 <= t.b - 67 + 37 + ao.v.a.getWidth() && var2_2 >= 8 && var2_2 <= ao.v.a.getHeight() + 8) {
                            this.b.a = 2048;
                            break;
                        }
                        if (var1_1 >= t.b - 67 && var1_1 <= t.b - 67 + 33 && var2_2 >= 5 && var2_2 <= 18) {
                            this.b.a = 515;
                            break;
                        }
                        if (var1_1 >= 20 && var1_1 <= 20 + t.i.stringWidth(bt.ae) && var2_2 >= 2 && var2_2 <= 2 + t.j) {
                            this.b.a = 513;
                            break;
                        }
                        if (var1_1 >= t.b - 67 && var1_1 <= t.b - 67 + 16 && var2_2 >= 24 && var2_2 <= 34) {
                            if (bt.bf != 0) {
                                this.a.p();
                                break;
                            }
                        } else {
                            if (var1_1 >= 1 && var1_1 <= 1 + t.i.stringWidth("\u83dc\u5355") && var2_2 >= t.c - t.j - 1 && var2_2 <= t.c - 1) {
                                this.b.a = 0x10000000;
                                break;
                            }
                            if (var1_1 >= t.b - t.i.stringWidth("\u804a\u5929") && var1_1 <= t.b && var2_2 >= t.c - t.j - 1 && var2_2 <= t.c - 1) {
                                this.b.a = 1024;
                                break;
                            }
                            if (!bt.bu) {
                                this.a.d = (byte)-1;
                                this.b.b(var1_1 + ao.h - this.a.g(), var2_2 + ao.i - this.a.h());
                            }
                        }
                    }
lbl139:
                    // 7 sources

                    return;
                }
                case 25: {
                    if (this.a.g.d != 0 && this.a.g.d != 2 && this.a.g.f <= 1) ** GOTO lbl144
                    this.b.a = this.a.g.a(this.a.g.d, var1_1, var2_2);
                    if (this.b.a != 0) ** GOTO lbl191
lbl144:
                    // 2 sources

                    if (this.a.g.f != 0) ** GOTO lbl151
                    if (this.a.g.d == 0) {
                        this.b.a = this.a.g.a(var1_1, var2_2);
                    } else if (this.a.g.d == 2) {
                        this.b.a = this.a.g.b(var1_1, var2_2);
                    }
                    if (this.b.a != 0) ** GOTO lbl191
lbl151:
                    // 2 sources

                    if (this.a.g.d == 1 || this.a.g.d == 3) {
                        if (bt.M != null) {
                            for (var3_4 = (byte)(bt.M.length - 1); var3_4 >= 0; var3_4 = (byte)(var3_4 - 1)) {
                                if (bt.M[var3_4].m == null || bt.M[var3_4].a() || bt.M[var3_4].n != 1 && bt.M[var3_4].n != 4 || var1_1 < t.R[bt.M[var3_4].a][0] - bt.M[var3_4].c() / 2 || var1_1 > t.R[bt.M[var3_4].a][0] + bt.M[var3_4].c() / 2) continue;
                                var4_9 = bt.M[var3_4];
                                if (var2_2 < t.R[bt.M[var3_4].a][1] - (var4_9.m != null && var4_9.m.h != null ? var4_9.m.h[var4_9.m.f] : 0) || var2_2 > t.R[bt.M[var3_4].a][1]) continue;
                                if (this.a.g.h != var3_4) {
                                    this.a.g.h = var3_4;
                                    continue;
                                }
                                this.b.a = 0x40000000;
                            }
                        }
                    } else if (this.a.g.d == 4) {
                        if (bt.H != null) {
                            for (var3_5 = (byte)(bt.H.length - 1); var3_5 >= 0; var3_5 = (byte)(var3_5 - 1)) {
                                if (bt.H[var3_5].j == null || var1_1 < t.Q[bt.H[var3_5].a][0] - bt.H[var3_5].f() / 2 || var1_1 > t.Q[bt.H[var3_5].a][0] + bt.H[var3_5].f() / 2 || var2_2 < t.Q[bt.H[var3_5].a][1] - bt.H[var3_5].g() || var2_2 > t.Q[bt.H[var3_5].a][1]) continue;
                                if (bq.h()) {
                                    this.b.b("\u53ea\u80fd\u5bf9\u81ea\u5df1\u4f7f\u7528\u590d\u6d3b\u9053\u5177");
                                    continue;
                                }
                                if (this.a.g.i != var3_5) {
                                    this.a.g.i = var3_5;
                                    continue;
                                }
                                this.b.a = 0x40000000;
                            }
                        }
                    } else if ((this.a.g.d == 5 || this.a.g.d == 6 || this.a.g.d == 7 || this.a.g.d == 8) && bt.H != null) {
                        for (var3_6 = (byte)(bt.H.length - 1); var3_6 >= 0; var3_6 = (byte)(var3_6 - 1)) {
                            if (bt.H[var3_6].j == null || var1_1 < t.Q[bt.H[var3_6].a][0] - bt.H[var3_6].f() / 2 || var1_1 > t.Q[bt.H[var3_6].a][0] + bt.H[var3_6].f() / 2 || var2_2 < t.Q[bt.H[var3_6].a][1] - bt.H[var3_6].g() || var2_2 > t.Q[bt.H[var3_6].a][1]) continue;
                            if (bq.h()) {
                                this.b.b("\u53ea\u80fd\u5bf9\u81ea\u5df1\u4f7f\u7528\u590d\u6d3b\u9053\u5177");
                                continue;
                            }
                            if (this.a.g.i != var3_6) {
                                this.a.g.i = var3_6;
                                continue;
                            }
                            this.b.a = 0x40000000;
                        }
                    }
                    if (var1_1 >= t.b - com.yinhan.kjava.main.a.U.b && var1_1 <= t.b && var2_2 >= t.c - com.yinhan.kjava.main.a.U.c && var2_2 <= t.c) {
                        this.b.a = 0x20000000;
                    }
lbl191:
                    // 5 sources

                    return;
                }
                case 8: {
                    if (this.a.l == 0) {
                        if (this.b.aq != null) {
                            this.b.a = this.b.aq.b(var1_1, var2_2);
                            this.b.a = this.a.b(this.b.a, var1_1, var2_2);
                            break;
                        }
                    } else if (this.a.l == 2) {
                        this.b.a = ca.d(var1_1, var2_2);
                    }
                    return;
                }
                case 11: {
                    if (this.a.l == 0) {
                        if (this.b.aq != null) {
                            this.b.a = this.b.aq.b(var1_1, var2_2);
                            this.b.a = this.a.b(this.b.a, var1_1, var2_2);
                            break;
                        }
                    } else {
                        if (this.a.l == 2) {
                            this.b.a = ca.d(var1_1, var2_2);
                            break;
                        }
                        if (this.a.l == 4) {
                            this.b.a = ca.c(var1_1, var2_2);
                        }
                    }
                    return;
                }
                case 23: {
                    if (this.a.l == 0) {
                        if (this.b.aq != null) {
                            this.b.a = this.b.aq.b(var1_1, var2_2);
                            break;
                        }
                    } else {
                        if (this.a.l == 1) {
                            this.b.a = ca.c(var1_1, var2_2);
                            break;
                        }
                        if (this.a.l == 2) {
                            this.b.a = ca.d(var1_1, var2_2);
                            break;
                        }
                        if (this.a.l == 3 || this.a.l == 4) {
                            this.b.a = ca.b(var1_1, var2_2);
                        }
                    }
                    return;
                }
                case 24: {
                    if (this.a.l == 0) {
                        if (this.b.aq != null) {
                            this.b.a = this.b.aq.b(var1_1, var2_2);
                            break;
                        }
                    } else {
                        if (this.a.l == 1) {
                            this.b.a = ca.c(var1_1, var2_2);
                            break;
                        }
                        if (this.a.l == 2) {
                            this.b.a = ca.b(var1_1, var2_2);
                        }
                    }
                    return;
                }
                case 10: {
                    if (this.b.aq != null) {
                        this.b.a = this.b.aq.b(var1_1, var2_2);
                    }
                    return;
                }
                case 15: {
                    if (this.b.aq != null) {
                        this.b.a = this.b.aq.b(var1_1, var2_2);
                    }
                    return;
                }
                case 14: {
                    if (this.b.aq != null) {
                        this.b.a = this.b.aq.b(var1_1, var2_2);
                    }
                    return;
                }
                case 31: {
                    if (this.a.l == 0) {
                        if (this.b.aq != null) {
                            this.b.a = this.b.aq.b(var1_1, var2_2);
                            break;
                        }
                    } else {
                        if (this.a.l == 1) {
                            this.b.a = ca.d(var1_1, var2_2);
                            break;
                        }
                        if (this.a.l == 2) {
                            this.b.a = ca.c(var1_1, var2_2);
                        }
                    }
                    return;
                }
                case 6: {
                    if (this.a.l == 0 || this.a.l == 3) {
                        if (this.b.aq != null) {
                            this.b.a = this.b.aq.b(var1_1, var2_2);
                            break;
                        }
                    } else if (this.a.l == 1 || this.a.l == 2) {
                        this.b.a = ca.c(var1_1, var2_2);
                    }
                    return;
                }
                case 22: {
                    if (this.a.l == 0) {
                        if (this.b.aq != null) {
                            this.b.a = this.b.aq.b(var1_1, var2_2);
                            this.b.a = this.a.e(this.b.a, var1_1, var2_2);
                            break;
                        }
                    } else if (this.a.l == 6) {
                        this.b.a = ca.d(var1_1, var2_2);
                        if (ca.e(var1_1, var2_2)) {
                            this.b.a("\u8f93\u5165\u4ea4\u6613\u94f6\u4e24", 2);
                            break;
                        }
                    } else {
                        if (this.a.l == 1 || this.a.l == 2 || this.a.l == 3) {
                            this.b.a = ca.c(var1_1, var2_2);
                            break;
                        }
                        if (this.a.l == 5) {
                            this.b.a = ca.b(var1_1, var2_2);
                        }
                    }
                    return;
                }
                case 29: {
                    if (this.a.l == 0 && this.b.aq != null) {
                        this.b.a = this.b.aq.b(var1_1, var2_2);
                    }
                    return;
                }
                case 35: {
                    if (this.a.l == 0 && this.b.aq != null) {
                        this.b.a = this.b.aq.b(var1_1, var2_2);
                    }
                    return;
                }
                case 34: {
                    if (this.a.l == 0) {
                        if (this.b.aq != null) {
                            this.b.a = this.b.aq.b(var1_1, var2_2);
                            break;
                        }
                    } else {
                        if (this.a.l == 1 || this.a.l == 2) {
                            this.b.a = ca.c(var1_1, var2_2);
                            break;
                        }
                        if (this.a.l == 3 || this.a.l == 5) {
                            this.b.a = ca.b(var1_1, var2_2);
                            break;
                        }
                        if (this.a.l == 4) {
                            this.b.a = ca.d(var1_1, var2_2);
                            if (ca.e(var1_1, var2_2)) {
                                this.b.a("\u8bf7\u8f93\u5165\u62cd\u5356\u4ef7\u683c", 2);
                            }
                        }
                    }
                    return;
                }
                case 13: {
                    if (this.a.l == 0 || this.a.l == 10 || this.a.l == 5 || this.a.l == 6) {
                        if (this.b.aq != null) {
                            this.b.a = this.b.aq.b(var1_1, var2_2);
                            break;
                        }
                    } else {
                        if (this.a.l == 1 || this.a.l == 2 || this.a.l == 8 || this.a.l == 9) {
                            this.b.a = ca.c(var1_1, var2_2);
                            break;
                        }
                        if (this.a.l == 3) {
                            this.b.a = ca.d(var1_1, var2_2);
                            if (ca.e(var1_1, var2_2)) {
                                this.b.a("\u8bf7\u8f93\u5165\u62cd\u5356\u4ef7\u683c", 2);
                                break;
                            }
                        } else {
                            if (this.a.l == 4) {
                                this.b.a = ca.b(var1_1, var2_2);
                                break;
                            }
                            if (this.a.l == 7) {
                                this.b.a = this.a.c(var1_1, var2_2);
                                break;
                            }
                            if (this.a.l == 11) {
                                this.b.a = ca.b(var1_1, var2_2);
                            }
                        }
                    }
                    return;
                }
                case 9: {
                    if (this.a.l == 0) {
                        if (this.b.aq != null) {
                            this.b.a = this.b.aq.b(var1_1, var2_2);
                            this.b.a = this.a.b(this.b.a, var1_1, var2_2);
                            break;
                        }
                    } else if (this.a.l == 2) {
                        this.b.a = ca.d(var1_1, var2_2);
                    }
                    return;
                }
                case 4: {
                    if (this.a.l == 0) {
                        if (this.b.aq != null) {
                            this.b.a = this.b.aq.b(var1_1, var2_2);
                            this.b.a = this.a.b(this.b.a, var1_1, var2_2);
                            break;
                        }
                    } else {
                        if (this.a.l == 1 || this.a.l == 3 || this.a.l == 9 || this.a.l == 14 || this.a.l == 15 || this.a.l == 16) {
                            this.b.a = ca.c(var1_1, var2_2);
                            break;
                        }
                        if (this.a.l == 2 || this.a.l == 4 || this.a.l == 7 || this.a.l == 12) {
                            this.b.a = ca.d(var1_1, var2_2);
                            break;
                        }
                        if (this.a.l == 6 || this.a.l == 11) {
                            this.b.a = ca.d(var1_1, var2_2);
                            if (ca.e(var1_1, var2_2)) {
                                this.b.a("\u62cd\u5356\u4ef7\u683c", 2);
                                break;
                            }
                        } else {
                            if (this.a.l == 5 || this.a.l == 18) {
                                this.b.a = ca.b(var1_1, var2_2);
                                break;
                            }
                            if (this.a.l == 8) {
                                this.b.a = this.a.e(var1_1, var2_2);
                                break;
                            }
                            if (this.a.l == 10 || this.a.l == 13) {
                                this.b.a = ca.b(var1_1, var2_2);
                                break;
                            }
                            if (this.a.l == 17) {
                                this.b.a = this.b.aq.b(var1_1, var2_2);
                            }
                        }
                    }
                    return;
                }
                case 3: {
                    if (this.b.aq != null) {
                        this.b.a = this.b.aq.b(var1_1, var2_2);
                    }
                    return;
                }
                case 5: {
                    if (this.a.l == 0) {
                        this.b.a = this.a.b(var1_1, var2_2);
                        break;
                    }
                    if (this.a.l == 1) {
                        this.b.a = ca.c(var1_1, var2_2);
                        break;
                    }
                    if (this.a.l == 2 && this.b.aq != null) {
                        this.b.a = this.b.aq.b(var1_1, var2_2);
                    }
                    return;
                }
                case 36: {
                    if (this.a.l == 0) {
                        if (this.b.aq != null) {
                            this.b.a = this.b.aq.b(var1_1, var2_2);
                            break;
                        }
                    } else {
                        if (this.a.l == 2) {
                            this.b.a = this.a.e(var1_1, var2_2);
                            break;
                        }
                        if (this.a.l == 1 || this.a.l == 3 || this.a.l == 5) {
                            this.b.a = ca.c(var1_1, var2_2);
                            break;
                        }
                        if (this.a.l == 4) {
                            this.b.a = ca.b(var1_1, var2_2);
                        }
                    }
                    return;
                }
                case 95: {
                    if (this.b.aq != null) {
                        this.b.a = this.b.aq.b(var1_1, var2_2);
                    }
                    return;
                }
                case 96: {
                    if (this.b.aq != null) {
                        this.b.a = this.b.aq.b(var1_1, var2_2);
                        this.b.a = this.a.a(this.b.a, var1_1, var2_2);
                    }
                    return;
                }
                case 12: {
                    this.m(var1_1, var2_2);
                    return;
                }
                case 37: {
                    this.n(var1_1, var2_2);
                    return;
                }
                case 21: {
                    this.o(var1_1, var2_2);
                    return;
                }
                case 19: {
                    this.p(var1_1, var2_2);
                    return;
                }
                case 18: {
                    this.q(var1_1, var2_2);
                    return;
                }
                case 1: {
                    this.r(var1_1, var2_2);
                    return;
                }
                case 32: {
                    v1.b.a = this.a.d(var1_1, var2_2);
                    return;
                }
                case 20: {
                    v2.b.a = ca.a(var1_1, var2_2);
                    return;
                }
                case 2: {
                    this.s(var1_1, var2_2);
                    return;
                }
                case 28: {
                    this.t(var1_1, var2_2);
                    return;
                }
                case 27: {
                    this.u(var1_1, var2_2);
                    return;
                }
                case 7: {
                    this.v(var1_1, var2_2);
                    return;
                }
                case 30: {
                    this.w(var1_1, var2_2);
                    return;
                }
                case 33: {
                    this.ap(var1_1, var2_2);
                    return;
                }
                case 38: {
                    this.x(var1_1, var2_2);
                    return;
                }
                case 40: {
                    this.y(var1_1, var2_2);
                    return;
                }
                case 39: {
                    this.z(var1_1, var2_2);
                    return;
                }
                case 41: {
                    this.A(var1_1, var2_2);
                    return;
                }
                case 42: {
                    this.B(var1_1, var2_2);
                    return;
                }
                case 43: {
                    this.C(var1_1, var2_2);
                    return;
                }
                case 45: {
                    this.D(var1_1, var2_2);
                    return;
                }
                case 46: {
                    this.E(var1_1, var2_2);
                    return;
                }
                case 47: {
                    this.F(var1_1, var2_2);
                    return;
                }
                case 48: {
                    this.G(var1_1, var2_2);
                    return;
                }
                case 49: {
                    this.H(var1_1, var2_2);
                    return;
                }
                case 50: {
                    this.I(var1_1, var2_2);
                    return;
                }
                case 51: {
                    this.J(var1_1, var2_2);
                    return;
                }
                case 52: {
                    this.K(var1_1, var2_2);
                    return;
                }
                case 60: {
                    this.Q(var1_1, var2_2);
                    return;
                }
                case 62: {
                    this.R(var1_1, var2_2);
                    return;
                }
                case 63: {
                    this.S(var1_1, var2_2);
                    return;
                }
                case 53: {
                    this.L(var1_1, var2_2);
                    return;
                }
                case 54: {
                    this.M(var1_1, var2_2);
                    return;
                }
                case 57: {
                    this.N(var1_1, var2_2);
                    return;
                }
                case 58: {
                    this.O(var1_1, var2_2);
                    return;
                }
                case 59: {
                    this.P(var1_1, var2_2);
                    return;
                }
                case 64: {
                    this.U(var1_1, var2_2);
                    return;
                }
                case 65: {
                    this.T(var1_1, var2_2);
                    return;
                }
                case 66: {
                    return;
                }
                case 67: {
                    this.V(var1_1, var2_2);
                    return;
                }
                case 101: {
                    this.W(var1_1, var2_2);
                    return;
                }
                case 102: {
                    this.X(var1_1, var2_2);
                    return;
                }
                case 106: {
                    this.Y(var1_1, var2_2);
                    return;
                }
                case 107: {
                    this.ab(var1_1, var2_2);
                    return;
                }
                case 110: {
                    this.Z(var1_1, var2_2);
                    return;
                }
                case 118: {
                    this.aa(var1_1, var2_2);
                    return;
                }
                case 113: {
                    this.e(var1_1, var2_2);
                    return;
                }
                case 114: {
                    this.g(var1_1, var2_2);
                    return;
                }
                case 115: {
                    this.f(var1_1, var2_2);
                    return;
                }
                case 68: {
                    this.ad(var1_1, var2_2);
                    return;
                }
                case 69: {
                    this.ac(var1_1, var2_2);
                    return;
                }
                case 90: {
                    this.ae(var1_1, var2_2);
                    return;
                }
                case 91: {
                    this.af(var1_1, var2_2);
                    return;
                }
                case 92: {
                    this.ag(var1_1, var2_2);
                    return;
                }
                case 93: {
                    this.ah(var1_1, var2_2);
                    return;
                }
                case 70: {
                    this.ai(var1_1, var2_2);
                    return;
                }
                case 75: {
                    this.aj(var1_1, var2_2);
                    return;
                }
                case 94: {
                    this.ak(var1_1, var2_2);
                    return;
                }
                case 100: {
                    this.al(var1_1, var2_2);
                    return;
                }
                case 103: {
                    this.am(var1_1, var2_2);
                    return;
                }
                case 104: {
                    this.an(var1_1, var2_2);
                    return;
                }
                case 105: {
                    this.ao(var1_1, var2_2);
                    return;
                }
                case 71: {
                    this.j(var1_1, var2_2);
                    return;
                }
                case 72: {
                    this.k(var1_1, var2_2);
                    return;
                }
                case 98: {
                    v3.b.a = ca.a(var1_1, var2_2);
                    return;
                }
                case 108: 
                case 109: {
                    this.aq(var1_1, var2_2);
                    return;
                }
                case 111: {
                    if (this.b.av == null) break;
                    this.b.a = this.b.av.a(var1_1, var2_2);
                    return;
                }
                case 76: {
                    this.i(var1_1, var2_2);
                    return;
                }
                case 77: {
                    this.h(var1_1, var2_2);
                    return;
                }
                case 116: {
                    this.as(var1_1, var2_2);
                    return;
                }
                case 117: {
                    this.ar(var1_1, var2_2);
                    return;
                }
                case 123: {
                    this.b(var1_1, var2_2);
                    return;
                }
                case 121: {
                    this.c(var1_1, var2_2);
                    return;
                }
                case 122: {
                    this.d(var1_1, var2_2);
                    return;
                }
                case 126: {
                    this.l(var1_1, var2_2);
                    return;
                }
                case 127: {
                    this.b.a = com.yinhan.kjava.main.a.e.h(var1_1, var2_2);
                    return;
                }
                case 119: {
                    this.b.a = com.yinhan.kjava.main.a.e.bc.a((byte)0, var1_1, var2_2);
                    return;
                }
                case 120: {
                    if (this.a.l == 0) {
                        this.b.a = this.b.aq.b(var1_1, var2_2);
                        return;
                    }
                    if (this.a.l != 1) break;
                    this.b.a = ca.c(var1_1, var2_2);
                    return;
                }
                case 128: {
                    this.at(var1_1, var2_2);
                    return;
                }
                case 125: {
                    this.b.a = com.yinhan.kjava.main.a.e.g(var1_1, var2_2);
                    return;
                }
                case 130: {
                    this.au(var1_1, var2_2);
                    return;
                }
                case 131: {
                    this.b.a = com.yinhan.kjava.main.a.e.W.a(var1_1, var2_2);
                }
            }
        }
    }

    private void b(int n2, int n3) {
        if (this.a.l == 0) {
            this.b.a = this.b.aq.b(n2, n3);
            return;
        }
        if (this.a.l == 1) {
            this.b.a = ca.c(n2, n3);
        }
    }

    private void c(int n2, int n3) {
        if (this.a.l == 0) {
            this.b.a = this.b.aq.b(n2, n3);
        }
    }

    private void d(int n2, int n3) {
        if (this.a.l == 0) {
            this.b.a = this.b.aq.b(n2, n3);
        }
    }

    private void e(int n2, int n3) {
        if (this.a.l == 0 && this.b.aq != null) {
            this.b.a = this.b.aq.b(n2, n3);
        }
    }

    private void f(int n2, int n3) {
        if (this.a.l == 0) {
            if (this.b.aq != null) {
                this.b.a = this.b.aq.b(n2, n3);
                this.b.a = this.a.b(this.b.a, n2, n3);
                return;
            }
        } else {
            if (this.a.l == 1) {
                this.b.a = ca.c(n2, n3);
                return;
            }
            if (this.a.l == 2) {
                if (this.b.aq != null) {
                    this.b.a = this.b.aq.b(n2, n3);
                    return;
                }
            } else {
                if (this.a.l == 3 || this.a.l == 6) {
                    this.b.a = ca.d(n2, n3);
                    return;
                }
                if (this.a.l == 5 || this.a.l == 4) {
                    this.b.a = ca.b(n2, n3);
                }
            }
        }
    }

    private void g(int n2, int n3) {
        if (this.b.aq != null) {
            int n4 = this.b.aq.b(n2, n3);
            this.b.a = n4 == 0x40000000 ? 0 : n4;
            this.b.a = this.a.M.a(this.b.a, n2, n3);
        }
    }

    private void h(int n2, int n3) {
        if (this.a.l == 0 && this.b.aq != null) {
            this.b.a = this.b.aq.b(n2, n3);
            return;
        }
        if (this.a.l == 1 && this.b.av != null) {
            this.b.a = this.b.av.a(n2, n3);
            return;
        }
        if (this.a.l == 2) {
            this.b.a = ca.b(n2, n3);
        }
    }

    private void i(int n2, int n3) {
        if (this.a.l == 0) {
            if (this.b.aq != null) {
                this.b.a = this.b.aq.b(n2, n3);
                return;
            }
        } else if (this.a.l == 1) {
            this.b.a = ca.c(n2, n3);
        }
    }

    private void j(int n2, int n3) {
        if (this.a.l == 0) {
            if (this.b.aq != null) {
                this.b.a = this.b.aq.b(n2, n3);
                return;
            }
        } else if (this.a.l == 1) {
            this.b.a = ca.c(n2, n3);
        }
    }

    private void k(int n2, int n3) {
        if (this.a.l == 0) {
            this.b.a = ca.a(n2, n3);
            return;
        }
        if (this.a.l == 1) {
            this.b.a = ca.b(n2, n3);
        }
    }

    private void l(int n2, int n3) {
        if (this.a.l == 0 && this.b.aq != null) {
            this.b.a = this.b.aq.b(n2, n3);
            if (this.b.a == 0) {
                this.b.a = this.a.b(this.b.a, n2, n3);
            }
        }
    }

    private void m(int n2, int n3) {
        if (this.a.l == 0) {
            if (this.b.aq != null) {
                this.b.a = this.b.aq.b(n2, n3);
                return;
            }
        } else {
            if (this.a.l == 6) {
                this.b.a = this.a.e(n2, n3);
                return;
            }
            if (this.a.l == 1 || this.a.l == 7) {
                this.b.a = ca.c(n2, n3);
            }
        }
    }

    private void n(int n2, int n3) {
        if (this.b.aq != null) {
            this.b.a = this.b.aq.b(n2, n3);
            this.b.b = this.b.a = this.a.a(this.b.a, n2, n3);
        }
    }

    private void o(int n2, int n3) {
        if (this.a.l == 0) {
            if (this.b.aq != null) {
                this.b.a = this.b.aq.b(n2, n3);
                return;
            }
        } else {
            if (this.a.l == 1 || this.a.l == 2 || this.a.l == 3) {
                this.b.a = ca.c(n2, n3);
                return;
            }
            if (this.a.l == 4) {
                if (this.b.aq != null) {
                    this.b.a = this.b.aq.b(n2, n3);
                    return;
                }
            } else if (this.a.l == 5) {
                this.b.a = this.a.c(n2, n3);
            }
        }
    }

    private void p(int n2, int n3) {
        if (this.a.l == 0 || this.a.l == 10) {
            if (this.b.aq != null) {
                this.b.a = this.b.aq.b(n2, n3);
                return;
            }
        } else {
            if (this.a.l == 1 || this.a.l == 2 || this.a.l == 3 || this.a.l == 4 || this.a.l == 5 || this.a.l == 6 || this.a.l == 7 || this.a.l == 9) {
                this.b.a = ca.c(n2, n3);
                return;
            }
            if (this.a.l == 8) {
                this.b.a = ca.b(n2, n3);
            }
        }
    }

    private void q(int n2, int n3) {
        if (this.a.l == 0 || this.a.l == 1) {
            if (this.b.aq != null) {
                this.b.a = this.b.aq.b(n2, n3);
                this.b.aw = this.b.as.a;
                this.b.a = this.a.d(this.b.a, n2, n3);
                if (this.b.a == 0 && ao.aP.size() == 0) {
                    this.b.a = 0x40000000;
                }
            }
        } else if (this.a.l == 2 || this.a.l == 3 || this.a.l == 4 || this.a.l == 5 || this.a.l == 6) {
            this.b.a = ca.c(n2, n3);
        }
        if (com.yinhan.kjava.main.a.u != null && n2 >= t.b - 4 - com.yinhan.kjava.main.a.u.a.getWidth() && n2 < t.b - 4 && n3 >= 4 && n3 <= com.yinhan.kjava.main.a.u.a.getHeight() + 4) {
            this.b.a = 0x20000000;
        }
    }

    private void r(int n2, int n3) {
        if (this.a.l == 6 || this.a.l == 7) {
            this.b.a = ca.b(n2, n3);
            return;
        }
        if (this.a.l == 8) {
            this.b.a = ca.d(n2, n3);
            return;
        }
        this.b.a = this.a.a(n2, n3);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void s(int n2, int n3) {
        if (this.a.l != 0) {
            if (this.a.l != 1 && this.a.l != 3 && this.a.l != 4 && this.a.l != 5 && this.a.l != 7 && this.a.l != 9 && this.a.l != 10) return;
            if (this.a.m == 1 || this.a.m == 2) {
                this.b.a = ca.d(n2, n3);
                if (!ca.e(n2, n3)) return;
                this.b.a(this.a.m == 1 ? "\u8bf7\u8f93\u5165\u53d6\u51fa\u94f6\u4e24" : "\u8bf7\u8f93\u5165\u5b58\u5165\u94f6\u4e24", 2);
                return;
            }
            if (this.a.m == 3) {
                this.b.a = ca.d(n2, n3);
                if (!ca.e(n2, n3)) return;
                this.b.a("\u8bf7\u8f93\u5165\u7ade\u6807\u94f6\u4e24", 2);
                return;
            }
            if (this.a.m == 4) {
                this.b.a = ca.d(n2, n3);
                return;
            }
            if (this.a.m == 5 || this.a.m == 6) {
                this.b.a = ca.b(n2, n3);
                return;
            }
        }
        this.b.a = ca.a(n2, n3);
    }

    private void t(int n2, int n3) {
        if (this.b.aq != null) {
            int n4 = this.b.aq.b(n2, n3);
            if (n4 == 0x40000000) {
                n4 = this.b.ar.g() == 0 || this.b.ar.g() == 1 ? this.a.f(this.b.ar.g(), n2, n3) : 8;
            }
            this.b.a = n4;
        }
    }

    private void u(int n2, int n3) {
        if ((this.a.l == 0 || this.a.l == 1) && this.b.aq != null) {
            this.b.a = this.b.aq.b(n2, n3);
        }
    }

    private void v(int n2, int n3) {
        if (this.a.l == 0) {
            if (this.b.aq != null) {
                this.b.a = this.b.aq.b(n2, n3);
                return;
            }
        } else if (this.a.l == 3 || this.a.l == 11) {
            if (this.a.T != null) {
                this.b.a = this.a.T.b(n2, n3);
                return;
            }
        } else {
            if (this.a.l == 1 || this.a.l == 2 || this.a.l == 5 || this.a.l == 6 || this.a.l == 8 || this.a.l == 9 || this.a.l == 10) {
                this.b.a = ca.c(n2, n3);
                return;
            }
            if (this.a.l == 4 || this.a.l == 12) {
                if (this.a.m == 1) {
                    this.b.a = this.a.T.b(n2, n3);
                    return;
                }
                this.b.a = this.a.c(n2, n3);
                return;
            }
            if (this.a.l == 7) {
                this.b.a = ca.d(n2, n3);
                if (ca.e(n2, n3)) {
                    this.b.a("\u8bf7\u8f93\u5165\u51b3\u6597\u91d1\u989d", 2);
                }
            }
        }
    }

    private void w(int n2, int n3) {
        if (n2 < this.a.aB || n2 > this.a.aB + this.a.f.a * this.a.aD / 16 || n3 < this.a.aC || n3 > this.a.aC + this.a.f.b * this.a.aD / 16) {
            this.b.a = 0x20000000;
        }
    }

    private void x(int n2, int n3) {
        if (this.a.l == 0) {
            if (this.b.aq != null) {
                this.b.a = this.b.aq.b(n2, n3);
                return;
            }
        } else {
            if (this.a.l == 1 || this.a.l == 2 || this.a.l == 3 || this.a.l == 4 || this.a.l == 5 || this.a.l == 6 || this.a.l == 7 || this.a.l == 8 || this.a.l == 10) {
                this.b.a = ca.c(n2, n3);
                return;
            }
            if (this.a.l == 9) {
                this.b.a = ca.b(n2, n3);
            }
        }
    }

    private void y(int n2, int n3) {
        if (this.a.l == 0) {
            this.b.a = ca.a(n2, n3);
            return;
        }
        if (this.a.l == 1) {
            this.b.a = this.b.aq.b(n2, n3);
        }
    }

    private void z(int n2, int n3) {
        if (n2 >= this.a.ba.e - ao.h + this.a.g() && n2 <= this.a.ba.e - ao.h + this.a.g() + this.a.ba.a() && n3 >= this.a.ba.f - ao.i + this.a.h() && n3 <= this.a.ba.f - ao.i + this.a.h() + this.a.ba.b()) {
            this.c = 1;
            ++this.i;
            if (this.i >= 2 && this.k <= 30) {
                this.i = 0;
                this.b.a = 0x40000000;
                this.a.V();
                this.b.a = 0;
            }
            this.k = 0;
            this.j = 0;
            return;
        }
        ++this.j;
        if (this.j >= 2 && this.k <= 30) {
            this.j = 0;
            this.b.a = 0x20000000;
            this.a.V();
            this.b.a = 0;
        }
        this.k = 0;
        this.i = 0;
    }

    private void A(int n2, int n3) {
        if (this.a.l == 0) {
            if (this.b.aq != null) {
                this.b.a = this.b.aq.b(n2, n3);
                return;
            }
        } else if (this.a.l == 1 || this.a.l == 2 || this.a.l == 3) {
            this.b.a = ca.b(n2, n3);
        }
    }

    private void B(int n2, int n3) {
        if (this.a.l == 0) {
            if (this.b.aq != null) {
                this.b.a = this.b.aq.b(n2, n3);
                return;
            }
        } else if (this.a.l == 1) {
            this.b.a = ca.c(n2, n3);
        }
    }

    private void C(int n2, int n3) {
        if (this.a.l == 0) {
            if (this.b.aq != null) {
                this.b.a = this.b.aq.b(n2, n3);
                return;
            }
        } else if (this.a.l == 1) {
            this.b.a = ca.c(n2, n3);
        }
    }

    private void D(int n2, int n3) {
        if (this.a.l == 0 && this.b.aq != null) {
            this.b.a = this.b.aq.b(n2, n3);
        }
    }

    private void E(int n2, int n3) {
        if (this.a.l == 0) {
            if (this.b.aq != null) {
                this.b.a = this.b.aq.b(n2, n3);
                return;
            }
        } else {
            if (this.a.l == 1) {
                this.b.a = ca.c(n2, n3);
                return;
            }
            if (this.a.l == 2 && this.a.T != null) {
                this.b.a = this.a.T.b(n2, n3);
            }
        }
    }

    private void F(int n2, int n3) {
        if (this.a.l == 0) {
            if (this.b.aq != null) {
                this.b.a = this.b.aq.b(n2, n3);
                return;
            }
        } else {
            if (this.a.l == 1 || this.a.l == 2 || this.a.l == 5 || this.a.l == 6 || this.a.l == 7 || this.a.l == 8) {
                this.b.a = ca.c(n2, n3);
                return;
            }
            if (this.a.l == 3) {
                this.b.a = this.a.T.b(n2, n3);
                return;
            }
            if (this.a.l == 4) {
                if (this.a.m == 0) {
                    this.b.a = this.a.c(n2, n3);
                    return;
                }
                if (this.a.m == 1) {
                    this.b.a = this.a.T.b(n2, n3);
                    return;
                }
            } else if (this.a.l == 9) {
                this.b.a = ca.b(n2, n3);
            }
        }
    }

    private void G(int n2, int n3) {
        if (this.a.l == 0) {
            if (this.b.aq != null) {
                this.b.a = this.b.aq.b(n2, n3);
                return;
            }
        } else {
            if (this.a.l == 1) {
                this.b.a = ca.c(n2, n3);
                return;
            }
            if (this.a.l == 2) {
                if (this.b.aq != null) {
                    this.b.a = this.b.aq.b(n2, n3);
                    return;
                }
            } else if (this.a.l == 3) {
                this.b.a = ca.b(n2, n3);
            }
        }
    }

    private void H(int n2, int n3) {
        if (this.a.l == 0 && this.b.aq != null) {
            this.b.a = this.b.aq.b(n2, n3);
        }
    }

    private void I(int n2, int n3) {
        block10: {
            block15: {
                block14: {
                    block13: {
                        block12: {
                            block11: {
                                block9: {
                                    if (this.a.l != 0) break block9;
                                    if (this.b.aq != null) {
                                        this.b.a = this.b.aq.b(n2, n3);
                                        return;
                                    }
                                    break block10;
                                }
                                if (this.a.l != 1) break block11;
                                this.b.a = ca.d(n2, n3);
                                if (ca.e(n2, n3)) {
                                    this.b.a("\u6350\u732e\u94f6\u4e24\u6570\u91cf", 2);
                                    return;
                                }
                                break block10;
                            }
                            if (this.a.l != 2) break block12;
                            this.b.a = ca.d(n2, n3);
                            if (ca.e(n2, n3)) {
                                this.b.a("\u6350\u732e\u7ecf\u9a8c\u6570\u91cf", 2);
                                return;
                            }
                            break block10;
                        }
                        if (this.a.l != 5) break block13;
                        this.b.a = ca.d(n2, n3);
                        if (ca.e(n2, n3)) {
                            this.b.a("\u53d6\u51fa\u94f6\u4e24\u6570\u91cf", 2);
                            return;
                        }
                        break block10;
                    }
                    if (this.a.l != 3 && this.a.l != 4) break block14;
                    if (this.a.m == 0) {
                        this.b.a = ca.d(n2, n3);
                        return;
                    }
                    if (this.a.m != 1) break block10;
                    break block15;
                }
                if (this.a.l != 6 && this.a.l != 7) break block10;
            }
            this.b.a = ca.b(n2, n3);
        }
    }

    /*
     * Unable to fully structure code
     */
    private void J(int var1_1, int var2_2) {
        block6: {
            block5: {
                if (this.a.l != 0 || this.b.aq == null) break block6;
                var3_3 = this.b.aq.b(var1_1, var2_2);
                this.b.a = var3_3 == 0x40000000 ? 0 : var3_3;
                var3_3 = var2_2;
                var2_2 = var1_1;
                var1_1 = this.b.a;
                this = this.a.M;
                if (var1_1 != 0) ** GOTO lbl-1000
                for (var4_4 = 0; var4_4 < this.l.length; ++var4_4) {
                    if (var2_2 >= this.l[var4_4][0] && var2_2 <= this.l[var4_4][0] + this.l[var4_4][2] && var3_3 >= this.l[var4_4][1] && var3_3 <= this.l[var4_4][1] + this.l[var4_4][3]) {
                        v0 = 8;
                    } else {
                        if (var2_2 < this.m[var4_4][0] || var2_2 > this.m[var4_4][0] + this.m[var4_4][2] || var3_3 < this.m[var4_4][1] || var3_3 > this.m[var4_4][1] + this.m[var4_4][3]) continue;
                        v0 = 2;
                    }
                    break block5;
                }
                if (var2_2 >= this.n[0] && var2_2 <= this.n[0] + this.n[2] && var3_3 >= this.n[1] && var3_3 <= this.n[1] + this.n[3]) {
                    v0 = 0x40000000;
                } else lbl-1000:
                // 2 sources

                {
                    v0 = var1_1;
                }
            }
            this.b.a = v0;
        }
    }

    private void K(int n2, int n3) {
        if (this.a.l == 0) {
            if (this.b.aq != null) {
                this.b.a = this.b.aq.b(n2, n3);
                return;
            }
        } else if (this.a.l == 1 || this.a.l == 2) {
            this.b.a = ca.c(n2, n3);
        }
    }

    private void L(int n2, int n3) {
        if (this.a.l == 0) {
            if (this.b.aq != null) {
                this.b.a = this.b.aq.b(n2, n3);
                return;
            }
        } else {
            if (this.a.l == 1) {
                this.b.a = ca.c(n2, n3);
                return;
            }
            if (this.a.l == 2) {
                this.b.a = ca.d(n2, n3);
            }
        }
    }

    private void M(int n2, int n3) {
        if (this.a.l == 0 && this.b.aq != null) {
            this.b.a = this.b.aq.b(n2, n3);
        }
    }

    private void N(int n2, int n3) {
        if (this.a.l == 0 && this.b.aq != null) {
            this.b.a = this.b.aq.b(n2, n3);
            this.a.r(this.b.a);
            this.b.a = 0;
        }
    }

    private void O(int n2, int n3) {
        if (this.a.l == 0 && this.b.aq != null) {
            this.b.a = this.b.aq.b(n2, n3);
            this.a.q(this.b.a);
            this.b.a = 0;
        }
    }

    private void P(int n2, int n3) {
        if (this.a.l == 0) {
            if (this.b.aq != null) {
                this.b.a = this.b.aq.b(n2, n3);
                return;
            }
        } else {
            if (this.a.l == 1 || this.a.l == 2) {
                this.b.a = ca.c(n2, n3);
                return;
            }
            if (this.a.l == 3 || this.a.l == 5) {
                this.b.a = ca.b(n2, n3);
                return;
            }
            if (this.a.l == 4) {
                this.b.a = ca.d(n2, n3);
                if (ca.e(n2, n3)) {
                    this.b.a("\u62cd\u5356\u4ef7\u683c", 2);
                }
            }
        }
    }

    private void Q(int n2, int n3) {
        if (this.a.l == 0) {
            if (this.b.aq != null) {
                this.b.a = this.b.aq.b(n2, n3);
                return;
            }
        } else {
            if (this.a.l == 1 || this.a.l == 2) {
                this.b.a = ca.c(n2, n3);
                return;
            }
            if (this.a.l == 3) {
                this.b.a = ca.b(n2, n3);
            }
        }
    }

    private void R(int n2, int n3) {
        if (this.a.l == 0) {
            this.b.a = ca.b(n2, n3);
        }
    }

    private void S(int n2, int n3) {
        if (this.a.l == 0 && this.b.aq != null) {
            this.b.a = this.b.aq.b(n2, n3);
        }
    }

    public final void a() {
        if (this.a != null) {
            switch (this.a.k) {
                case 0: {
                    if (this.d == 0) break;
                    this.g = this.a.I.j - ao.h + this.a.g() + 8;
                    this.h = this.a.I.k - ao.i + this.a.h() + 16;
                    if ((this.b.aF > this.g ? this.b.aF - this.g : this.g - this.b.aF) > 4) {
                        if (this.b.aF >= this.g) {
                            this.b.b = 2;
                        } else if (this.b.aF < this.g) {
                            this.b.b = 8;
                        }
                    } else if ((this.b.aG > this.h ? this.b.aG - this.h : this.h - this.b.aG) > (this.b.aF > this.g ? this.b.aF - this.g : this.g - this.b.aF)) {
                        if (this.b.aG >= this.h) {
                            this.b.b = 4;
                        } else if (this.b.aG < this.h) {
                            this.b.b = 1;
                        }
                    }
                    if (this.b.aF > this.g + 5 || this.b.aF < this.g - 5 || !(this.b.aG <= this.h + 5 & this.b.aG >= this.h - 5)) break;
                    this.b.b = 0;
                    return;
                }
                case 39: {
                    if (this.d == 1) {
                        this.g = this.a.ba.e - ao.h + this.a.g() + this.a.ba.a() / 2;
                        this.h = this.a.ba.f - ao.i + this.a.h() + this.a.ba.b() / 2;
                        if ((this.b.aF > this.g ? this.b.aF - this.g : this.g - this.b.aF) > 4) {
                            if (this.b.aF >= this.g) {
                                this.b.b = 2;
                            } else if (this.b.aF < this.g) {
                                this.b.b = 8;
                            }
                            this.i = 0;
                        } else if ((this.b.aG > this.h ? this.b.aG - this.h : this.h - this.b.aG) > (this.b.aF > this.g ? this.b.aF - this.g : this.g - this.b.aF)) {
                            if (this.b.aG >= this.h) {
                                this.b.b = 4;
                            } else if (this.b.aG < this.h) {
                                this.b.b = 1;
                            }
                            this.i = 0;
                        }
                        if (this.b.aF <= this.g + 5 && this.b.aF >= this.g - 5 && this.b.aG <= this.h + 5 & this.b.aG >= this.h - 5) {
                            this.b.b = 0;
                        }
                        this.k = 0;
                        this.j = 0;
                        return;
                    }
                    ++this.k;
                    if (this.k <= 30) break;
                    this.j = 0;
                }
            }
        }
    }

    private void T(int n2, int n3) {
        if (this.a.l == 0 && this.b.aq != null) {
            this.b.a = this.b.aq.b(n2, n3);
        }
    }

    private void U(int n2, int n3) {
        if (this.a.l == 0) {
            if (this.b.aq != null) {
                this.b.a = this.b.aq.b(n2, n3);
                this.b.a = this.a.O.a(this.b.a, n2, n3);
                return;
            }
        } else {
            if (this.a.l == 1 || this.a.l == 2) {
                this.b.a = ca.c(n2, n3);
                return;
            }
            if (this.a.l == 3) {
                this.b.a = ca.b(n2, n3);
            }
        }
    }

    private void V(int n2, int n3) {
        if (this.b.aq != null) {
            this.b.a = this.b.aq.b(n2, n3);
        }
    }

    private void W(int n2, int n3) {
        if (this.a.l == 0 && this.b.aq != null) {
            this.b.a = this.b.aq.b(n2, n3);
        }
    }

    private void X(int n2, int n3) {
        if (((f)((Object)ch2)).a.l == 0) {
            if (((f)((Object)ch2)).b.aq != null) {
                int n4;
                block7: {
                    ((f)((Object)ch2)).b.a = ((f)((Object)ch2)).b.aq.b(n2, n3);
                    int n5 = n3;
                    n3 = n2;
                    n2 = ((f)((Object)ch2)).b.a;
                    ch ch2 = ((f)((Object)ch2)).a.V;
                    if (ch2.a != null) {
                        for (int i2 = 0; i2 < ch2.a.length - 3; ++i2) {
                            if (n3 < ch2.a[i2][0] || n3 > ch2.a[i2][0] + ch2.a[i2][2] || n5 < ch2.a[i2][1] || n5 > ch2.a[i2][1] + ch2.a[i2][3]) continue;
                            if (ch2.b == i2) {
                                n4 = 0x10000000;
                                break block7;
                            }
                            ch2.b = i2;
                            ca.l = 0;
                            ch2.b();
                            break;
                        }
                    }
                    n4 = n2;
                }
                ((f)((Object)ch2)).b.a = n4;
                return;
            }
        } else if (((f)((Object)ch2)).a.l == 1) {
            ((f)((Object)ch2)).b.a = ca.c(n2, n3);
        }
    }

    private void Y(int n2, int n3) {
        if (this.a.l == 0) {
            if (this.b.aq != null) {
                this.b.a = this.b.aq.b(n2, n3);
                this.b.a = this.a.O.b(this.b.a, n2, n3);
                return;
            }
        } else if (this.a.l == 1) {
            this.b.a = ca.c(n2, n3);
        }
    }

    private void Z(int n2, int n3) {
        if (((f)((Object)r2)).a.l == 0) {
            if (((f)((Object)r2)).b.aq != null) {
                int n4;
                block9: {
                    ((f)((Object)r2)).b.a = ((f)((Object)r2)).b.aq.b(n2, n3);
                    int n5 = n3;
                    n3 = n2;
                    n2 = ((f)((Object)r2)).b.a;
                    r r2 = ((f)((Object)r2)).a.P;
                    if (r2.g != null) {
                        for (int i2 = 0; i2 < r2.g.length; ++i2) {
                            if (n3 < r2.g[i2][0] || n3 > r2.g[i2][0] + r2.g[i2][2] || n5 < r2.g[i2][1] || n5 > r2.g[i2][1] + r2.g[i2][3]) continue;
                            if (i2 < 2) {
                                r2.b = 0;
                                if (r2.a == i2) {
                                    n4 = 0x10000000;
                                    break block9;
                                }
                                r2.a = (byte)i2;
                                ca.l = 0;
                                r2.a();
                                break;
                            }
                            r2.b = 1;
                            if (r2.a == i2 - 2) {
                                n4 = 0x10000000;
                                break block9;
                            }
                            r2.a = (byte)(i2 - 2);
                            ca.l = 0;
                            r2.a();
                            break;
                        }
                    }
                    n4 = n2;
                }
                ((f)((Object)r2)).b.a = n4;
                return;
            }
        } else if (((f)((Object)r2)).a.l == 1) {
            ((f)((Object)r2)).b.a = ca.c(n2, n3);
        }
    }

    private void aa(int n2, int n3) {
        if (((f)((Object)k2)).a.l == 0) {
            if (((f)((Object)k2)).b.aq != null) {
                int n4;
                ((f)((Object)k2)).b.a = ((f)((Object)k2)).b.aq.b(n2, n3);
                int n5 = n3;
                n3 = n2;
                n2 = ((f)((Object)k2)).b.a;
                k k2 = ((f)((Object)k2)).a.Q;
                if (k2.g != null) {
                    for (int i2 = 0; i2 < k2.g.length; ++i2) {
                        if (n3 < k2.g[i2][0] || n3 > k2.g[i2][0] + k2.g[i2][2] || n5 < k2.g[i2][1] || n5 > k2.g[i2][1] + k2.g[i2][3]) continue;
                        if (i2 < 2) {
                            k2.b = 0;
                            if (k2.a == i2) {
                                n4 = 0x10000000;
                            } else {
                                k2.a = (byte)(i2 - 1);
                                n4 = 2;
                            }
                        } else {
                            k2.b = 1;
                            if (k2.a == i2 - 2) {
                                n4 = 0x10000000;
                            } else {
                                k2.a = (byte)(i2 - 3);
                                n4 = 2;
                            }
                        }
                        break;
                    }
                } else {
                    n4 = n2;
                }
                ((f)((Object)k2)).b.a = n4;
                return;
            }
        } else if (((f)((Object)k2)).a.l == 1) {
            ((f)((Object)k2)).b.a = ca.c(n2, n3);
        }
    }

    private void ab(int n2, int n3) {
        if (this.a.l == 0 && this.b.aq != null) {
            this.b.a = this.b.aq.b(n2, n3);
        }
    }

    private void ac(int n2, int n3) {
        if (this.a.l == 0) {
            if (this.b.aq != null) {
                this.b.a = this.b.aq.b(n2, n3);
                return;
            }
        } else if (this.a.l == 1) {
            this.b.a = ca.d(n2, n3);
        }
    }

    private void ad(int n2, int n3) {
        if (this.b.aq != null) {
            this.b.a = this.b.aq.b(n2, n3);
        }
    }

    private void ae(int n2, int n3) {
        if (this.a.l == 0) {
            if (this.b.aq != null) {
                this.b.a = this.b.aq.b(n2, n3);
                return;
            }
        } else {
            if (this.a.l == 1) {
                this.b.a = ca.c(n2, n3);
                return;
            }
            if (this.a.l == 2 && this.b.aq != null) {
                this.b.a = this.b.aq.b(n2, n3);
            }
        }
    }

    private void af(int n2, int n3) {
        if (this.a.l == 0 && this.b.aq != null) {
            this.b.a = this.b.aq.b(n2, n3);
            int n4 = this.b.aq.a + 5;
            int n5 = this.b.aq.b + this.b.aq.d - (2 * t.j + 16) - 6;
            int n6 = t.i.stringWidth("\u540c\u610f(\u70b9\u51fb\u7533\u8bf7\u7ed3\u5a5a)");
            int n7 = t.i.stringWidth("\u62d2\u7edd");
            if (n2 >= n4 + 4 && n3 >= n5 + 5 && n2 <= n4 + 4 + n6 && n3 <= n5 + 5 + t.j) {
                this.b.a = this.a.S.d == 0 ? 0x40000000 : this.b.a;
                this.a.S.d = 0;
            }
            if (n2 >= n4 + 4 && n3 >= n5 + 5 + (t.j + 5) && n2 <= n4 + 4 + n7 && n3 <= n5 + 5 + (t.j + 5) + t.j) {
                this.b.a = this.a.S.d == 1 ? 0x40000000 : this.b.a;
                this.a.S.d = 1;
            }
        }
    }

    private void ag(int n2, int n3) {
        if (this.a.l == 0 && this.b.aq != null) {
            this.b.a = this.b.aq.b(n2, n3);
            int n4 = this.b.aq.a + 5;
            int n5 = this.b.aq.b + this.b.aq.d - (2 * t.j + 16) - 6;
            int n6 = t.i.stringWidth("\u79bb\u5a5a(\u70b9\u51fb\u7533\u8bf7\u79bb\u5a5a)");
            int n7 = t.i.stringWidth("\u53d6\u6d88\u79bb\u5a5a");
            if (n2 >= n4 + 4 && n3 >= n5 + 5 && n2 <= n4 + 4 + n6 && n3 <= n5 + 5 + t.j) {
                this.b.a = this.a.S.g == 0 ? 0x40000000 : this.b.a;
                this.a.S.g = 0;
            }
            if (n2 >= n4 + 4 && n3 >= n5 + 5 + (t.j + 5) && n2 <= n4 + 4 + n7 && n3 <= n5 + 5 + (t.j + 5) + t.j) {
                this.b.a = this.a.S.g == 1 ? 0x40000000 : this.b.a;
                this.a.S.g = 1;
            }
        }
    }

    private void ah(int n2, int n3) {
        if (this.a.l == 0 && this.b.aq != null) {
            this.b.a = this.b.aq.b(n2, n3);
        }
    }

    private void ai(int n2, int n3) {
        if (this.a.l == 0) {
            this.b.a = ca.a(n2, n3);
        }
    }

    private void aj(int n2, int n3) {
        if (this.b.aq != null) {
            this.b.a = this.b.aq.b(n2, n3);
        }
    }

    private void ak(int n2, int n3) {
        if (this.b.aq != null) {
            this.b.a = this.b.aq.b(n2, n3);
        }
    }

    private void al(int n2, int n3) {
        if (this.a.l == 0) {
            this.b.a = ca.c(n2, n3);
            return;
        }
        if (this.a.l == 1) {
            this.b.a = ca.c(n2, n3);
        }
    }

    private void am(int n2, int n3) {
        if (this.a.l == 0) {
            if (this.b.aq != null) {
                this.b.a = this.b.aq.b(n2, n3);
                return;
            }
        } else if (this.a.l == 1 || this.a.l == 2) {
            this.b.a = ca.c(n2, n3);
        }
    }

    private void an(int n2, int n3) {
        if (this.b.aq != null) {
            this.b.a = this.b.aq.b(n2, n3);
        }
    }

    private void ao(int n2, int n3) {
        if (this.a.T != null) {
            this.b.a = this.a.T.b(n2, n3);
        }
    }

    private void ap(int n2, int n3) {
        if (this.a.l == 0) {
            this.b.a = this.a.f(n2, n3);
            if (this.b.a == 0) {
                this.b.a = this.b.aq.b(n2, n3);
                return;
            }
        } else {
            this.b.a = ca.c(n2, n3);
        }
    }

    private void aq(int n2, int n3) {
        if (this.a.l == 0 || this.a.l == 1) {
            if (this.b.aq != null) {
                this.b.a = this.b.aq.b(n2, n3);
                return;
            }
        } else if (this.a.l == 2 || this.a.l == 3) {
            this.b.a = ca.b(n2, n3);
        }
    }

    private void ar(int n2, int n3) {
        this.b.a = ca.a(n2, n3);
    }

    private void as(int n2, int n3) {
        this.b.a = ca.b(n2, n3);
    }

    private void at(int n2, int n3) {
        if (this.a.l == 0) {
            if (this.b.aq != null) {
                this.b.a = this.b.aq.b(n2, n3);
                return;
            }
        } else if (this.a.l == 1) {
            this.b.a = ca.c(n2, n3);
        }
    }

    private void au(int n2, int n3) {
        if (this.b.aq != null) {
            if (this.a.l == 0) {
                this.b.a = this.b.aq.b(n2, n3);
                if (this.a.N.a == 0) {
                    this.b.a = this.a.N.a(this.b.a, n2, n3);
                    return;
                }
                if (this.a.N.a != 1 && this.a.N.a == 2) {
                    this.b.a = this.a.N.a(this.b.a, n2, n3);
                    return;
                }
            } else {
                if (this.a.l == 1) {
                    this.b.a = ca.c(n2, n3);
                    return;
                }
                if (this.a.l == 2) {
                    this.b.a = ca.b(n2, n3);
                    return;
                }
                if (this.a.l == 3) {
                    this.b.a = this.a.T.b(n2, n3);
                }
            }
        }
    }
}


package defpackage;

import com.yinhan.kjava.main.a;
import java.io.IOException;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* loaded from: java版梦回西游3区251011.jar:aq.class */
public final class aq {
    public ao a;
    public a b;
    public String c;
    public String d;
    private long u;
    public String e;
    public String f;
    public int g;
    public String h;
    private int[][] x;
    private int[][] y;
    private int[][] z;
    public int[][] l;
    public int[][] m;
    public int[] n;
    public int p;
    public int s;
    public int t;
    private int v = 0;
    private short[] w = {1919, 2147, 2150, 2149, 2148};
    private short[] A = {1919, 2147, 2148};
    public int[] i = new int[3];
    public long j = 0;
    private short B = 0;
    private short C = 0;
    private short D = 0;
    private short E = 0;
    public int[] k = null;
    public String o = "";
    public long q = 1000;
    public long r = 1000;

    public aq(ao aoVar, a aVar) {
        this.a = aoVar;
        this.b = aVar;
    }

    public final void a(int i) {
        this.b.aq.j();
        this.b.aq.a("帮派");
        this.b.aq.a(false);
        this.b.ar.a((Image[]) null, t.Z, (String[]) null, (String[]) null);
        this.b.ar.a(i);
        this.b.at.b(t.aa[i], t.i, (byte) 2);
        this.b.at.a((byte) 1);
        this.b.au.a("选择");
        this.b.aq.a(this.b.ar);
        this.b.aq.a(this.b.at);
        this.b.aq.a(this.b.au);
        this.b.aq.a(t.f, t.g, t.d, t.e);
        this.a.l = (short) 0;
        this.a.e.j = this.a.e.k;
        ao aoVar = this.a;
        this.a.k = (short) 41;
        aoVar.j = (short) 41;
    }

    public final void b(int i) throws IOException {
        if (this.a.l != 0) {
            if (this.a.l == 1) {
                if (i == 268435456 || i == 1073741824) {
                    d();
                    return;
                } else {
                    if (i == 536870912) {
                        this.a.l = (short) 0;
                        return;
                    }
                    return;
                }
            }
            if (this.a.l == 2) {
                if (i == 268435456 || i == 1073741824) {
                    this.a.e.a("输入OK确认解散帮派", 0);
                    return;
                } else {
                    if (i == 536870912) {
                        this.a.l = (short) 0;
                        return;
                    }
                    return;
                }
            }
            if (this.a.l == 3) {
                if (i != 268435456 && i != 1073741824) {
                    if (i == 536870912) {
                        this.a.l = (short) 0;
                        return;
                    }
                    return;
                } else {
                    byte[] bArrA = bz.a((short) 4224, bt.ad, this.u);
                    if (bArrA == null) {
                        this.a.e.b("获取上传指令数据错误!");
                        return;
                    } else {
                        a.i.a(new w((short) 4224, bArrA));
                        this.a.e.a((String) null);
                        return;
                    }
                }
            }
            return;
        }
        if (this.b.aq != null) {
            this.b.aq.b(i);
        }
        if (i == 1 || i == 514 || i == 4 || i == 520) {
            this.b.at.b(t.aa[this.b.ar.g()], t.i, (byte) 2);
            this.b.at.a((byte) 1);
        }
        if (i != 268435456 && i != 1073741824 && i != 517) {
            if (i == 536870912) {
                ao aoVar = this.a;
                this.a.k = (short) 0;
                aoVar.j = (short) 0;
            }
            return;
        }
        this.a.aA = this.b.ar.h();
        this.a.aE = this.b.ar.g();
        switch (this.a.aE) {
            case 0:
                this.a.e.a("输入帮派名称", 0);
                break;
            case 1:
                bt.gQ = (short) 1;
                z();
                break;
            case 2:
                this.a.e.a("输入招募金额", 2);
                break;
            case 3:
                bt.gQ = (short) 1;
                A();
                break;
            case 4:
                r();
                break;
            case 5:
                this.a.l = (short) 1;
                ca.h = 0;
                break;
            case 6:
                this.a.l = (short) 2;
                ca.h = 0;
                break;
        }
    }

    private void z() throws IOException {
        byte[] bArrG = bz.g((short) 4198, bt.ad, bt.gQ);
        if (bArrG == null) {
            this.a.e.b("获取上传指令数据错误!");
        } else {
            a.i.a(new w((short) 4198, bArrG));
            this.a.e.a((String) null);
        }
    }

    public final void a(long j) {
        this.u = j;
        this.a.o();
    }

    public final void a() {
        this.a.am = ca.a(new StringBuffer().append("将交付").append(this.u).append("帮派基金作为招募费用，持续一周？").toString(), t.i, 140, "\t");
        this.a.l = (short) 3;
        ca.h = 0;
    }

    private void A() throws IOException {
        byte[] bArrJ = bz.j((short) 4225, bt.ad, bt.gQ);
        if (bArrJ == null) {
            this.a.e.b("获取上传指令数据错误!");
        } else {
            a.i.a(new w((short) 4225, bArrJ));
            this.a.e.a((String) null);
        }
    }

    public final void b() {
        this.b.aq.j();
        this.b.aq.a("等待响应");
        this.b.aq.a(false);
        c cVar = this.b.ar;
        String[] strArr = bt.il;
        byte[] bArr = bt.in;
        String[] strArr2 = new String[bArr.length];
        for (int i = 0; i < strArr2.length; i++) {
            strArr2[i] = new String(new StringBuffer().append((int) bArr[i]).append("人响应").toString());
        }
        cVar.a((Image[]) null, strArr, (String[]) null, strArr2);
        this.b.at.b(bt.im == null ? null : bt.im[0], t.i, (byte) 2);
        this.b.at.a((byte) 1);
        this.b.au.a("响应");
        this.b.au.a(true);
        this.b.aq.a(this.b.ar);
        this.b.aq.a(this.b.at);
        this.b.aq.a(this.b.au);
        this.b.aq.a(t.f, t.g, t.d, t.e);
        this.a.l = (short) 0;
        this.b.j = this.b.k;
        ao aoVar = this.a;
        this.a.k = (short) 42;
        aoVar.j = (short) 42;
    }

    public final void c(int i) throws IOException {
        if (this.a.l != 0) {
            if (this.a.l == 1) {
                if (i != 268435456 && i != 1073741824 && i != 517) {
                    if (i == 536870912) {
                        this.a.l = (short) 0;
                        return;
                    }
                    return;
                } else {
                    if (ca.o == 0) {
                        if (bt.io[this.b.ar.g()] == 1) {
                            byte[] bArrX = bz.x((short) 4243, bt.ad, bt.ik[this.b.ar.g()]);
                            if (bArrX != null) {
                                a.i.a(new w((short) 4243, bArrX));
                            } else {
                                this.b.b("获取上传指令数据错误!");
                            }
                            this.b.a((String) null);
                            return;
                        }
                        byte[] bArrX2 = bz.x((short) 4199, bt.ad, bt.ik[this.b.ar.g()]);
                        if (bArrX2 != null) {
                            a.i.a(new w((short) 4199, bArrX2));
                        } else {
                            this.b.b("获取上传指令数据错误!");
                        }
                        this.b.a((String) null);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (this.b.aq != null) {
            this.b.aq.b(i);
        }
        if (i == 1 || i == 514 || i == 520 || i == 4) {
            this.b.at.b(bt.im == null ? null : bt.im[this.b.ar.g()], t.i, (byte) 2);
            this.b.at.a((byte) 1);
        }
        if (i == 268435456 || i == 1073741824 || i == 517) {
            ca.a(80 + t.f, t.j + 20 + (this.b.ar.i() * t.j) + t.g, bt.io[this.b.ar.g()] == 1 ? new String[]{"取消响应"} : new String[]{"响应"}, false);
            this.a.l = (short) 1;
            return;
        }
        if (i == 536870912) {
            bt.gQ = (short) 1;
            a(this.a.aE);
            return;
        }
        if (i != 1024) {
            if (i == 2048) {
                if (bt.gQ <= 1 && bt.gR == 1) {
                    bt.gQ = (short) (bt.gQ + 1);
                    z();
                    return;
                } else {
                    if (bt.gQ <= 1 || bt.gR != 1) {
                        return;
                    }
                    bt.gQ = (short) (bt.gQ + 1);
                    z();
                    return;
                }
            }
            return;
        }
        if (bt.gQ > 1 && bt.gR == 1) {
            if (bt.gQ - 1 <= 1) {
                bt.gQ = (short) 1;
            } else {
                bt.gQ = (short) (bt.gQ - 1);
            }
            z();
            return;
        }
        if (bt.gQ <= 1 || bt.gR != 0) {
            return;
        }
        if (bt.gQ - 1 < 1) {
            bt.gQ = (short) 1;
        } else {
            bt.gQ = (short) (bt.gQ - 1);
        }
        z();
    }

    public final void c() {
        this.b.aq.j();
        this.b.aq.a("帮派招募");
        this.b.aq.a(false);
        this.b.ar.a((Image[]) null, bt.iq, (String[]) null, (String[]) null);
        this.b.at.b(bt.ir == null ? null : bt.ir[0], t.i, (byte) 2);
        this.b.at.a((byte) 1);
        this.b.au.a("申请");
        this.b.au.a(true);
        this.b.aq.a(this.b.ar);
        this.b.aq.a(this.b.at);
        this.b.aq.a(this.b.au);
        this.b.aq.a(t.f, t.g, t.d, t.e);
        this.a.l = (short) 0;
        this.b.j = this.b.k;
        ao aoVar = this.a;
        this.a.k = (short) 43;
        aoVar.j = (short) 43;
    }

    public final void d(int i) throws IOException {
        if (this.a.l != 0) {
            if (this.a.l == 1) {
                ca.b(i);
                if (i != 268435456 && i != 1073741824 && i != 517) {
                    if (i == 536870912) {
                        this.a.l = (short) 0;
                        return;
                    }
                    return;
                }
                if (ca.o == 0) {
                    if (bt.is[this.b.ar.g()] == 1) {
                        byte[] bArrL = bz.l((short) 4242, bt.ad, bt.ip[this.b.ar.g()]);
                        if (bArrL == null) {
                            this.b.b("获取上传指令数据错误!");
                            return;
                        } else {
                            a.i.a(new w((short) 4242, bArrL));
                            this.b.a((String) null);
                            return;
                        }
                    }
                    byte[] bArrL2 = bz.l((short) 4226, bt.ad, bt.ip[this.b.ar.g()]);
                    if (bArrL2 == null) {
                        this.b.b("获取上传指令数据错误!");
                        return;
                    } else {
                        a.i.a(new w((short) 4226, bArrL2));
                        this.b.a((String) null);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (bt.ip != null) {
            if (this.b.aq == null) {
                return;
            }
            this.b.aq.b(i);
            if (i == 1 || i == 514 || i == 520 || i == 4) {
                this.b.at.b(bt.ir == null ? null : bt.ir[this.b.ar.g()], t.i, (byte) 2);
                this.b.at.a((byte) 1);
            }
            if (i == 268435456 || i == 1073741824 || i == 517) {
                ca.a(80 + t.f, t.j + 20 + (this.b.ar.i() * t.j) + t.g, bt.is[this.b.ar.g()] == 1 ? new String[]{"取消申请"} : new String[]{"申请"}, false);
                this.a.l = (short) 1;
            }
        }
        if (i == 536870912) {
            a(this.a.aE);
            return;
        }
        if (i != 1024) {
            if (i == 2048) {
                if (bt.gQ <= 1 && bt.gR == 1) {
                    bt.gQ = (short) (bt.gQ + 1);
                    A();
                    return;
                } else {
                    if (bt.gQ <= 1 || bt.gR != 1) {
                        return;
                    }
                    bt.gQ = (short) (bt.gQ + 1);
                    A();
                    return;
                }
            }
            return;
        }
        if (bt.gQ > 1 && bt.gR == 1) {
            if (bt.gQ - 1 <= 1) {
                bt.gQ = (short) 1;
            } else {
                bt.gQ = (short) (bt.gQ - 1);
            }
            A();
            return;
        }
        if (bt.gQ <= 1 || bt.gR != 0) {
            return;
        }
        if (bt.gQ - 1 < 1) {
            bt.gQ = (short) 1;
        } else {
            bt.gQ = (short) (bt.gQ - 1);
        }
        A();
    }

    public final void d() throws IOException {
        byte[] bArrM = bz.m((short) 4209, bt.ad);
        if (bArrM == null) {
            this.b.b("获取上传指令数据错误!");
        } else {
            a.i.a(new w((short) 4209, bArrM));
            this.b.a((String) null);
        }
    }

    public final void a(boolean z) {
        this.b.aq.j();
        this.b.aq.a("帮派管理");
        this.b.aq.a(false);
        this.b.ar.a((Image[]) null, t.ab, (String[]) null, (String[]) null);
        if (z) {
            this.b.ar.a(this.a.aA, this.a.aE);
            this.b.at.b(t.ac[this.a.aE], t.i, (byte) 2);
        } else {
            this.b.at.b(t.ac[0], t.i, (byte) 2);
        }
        this.b.at.a((byte) 1);
        this.b.au.a("确定");
        this.b.aq.a(this.b.ar);
        this.b.aq.a(this.b.at);
        this.b.aq.a(this.b.au);
        this.b.aq.a(t.f, t.g, t.d, t.e);
        this.a.l = (short) 0;
        this.b.j = this.b.k;
        ao aoVar = this.a;
        this.a.k = (short) 45;
        aoVar.j = (short) 45;
    }

    public final void e(int i) throws IOException {
        if (this.a.l == 0) {
            if (this.b.aq != null) {
                this.b.aq.b(i);
            }
            if (i == 1 || i == 514 || i == 520 || i == 4) {
                this.b.at.b(t.ac[this.b.ar.g()], t.i, (byte) 2);
                this.b.at.a((byte) 1);
            }
            if (i != 268435456 && i != 1073741824 && i != 517) {
                if (i == 536870912) {
                    this.a.aA = 0;
                    this.a.aE = 0;
                    ao aoVar = this.a;
                    this.a.k = (short) 0;
                    aoVar.j = (short) 0;
                    return;
                }
                return;
            }
            this.a.aA = this.b.ar.h();
            this.a.aE = this.b.ar.g();
            switch (this.a.aE) {
                case 0:
                    this.b.a("输入帮派新宗旨", 0);
                    break;
                case 1:
                    bt.gQ = (short) 1;
                    e();
                    break;
                case 2:
                    g();
                    break;
                case 3:
                    bt.gQ = (short) 1;
                    j(1);
                    break;
                case 4:
                    bt.gQ = (short) 1;
                    g(1);
                    break;
                case 5:
                    a((byte) 1);
                    break;
            }
        }
    }

    public final void e() {
        byte[] bArrI = bz.i((short) 4227, bt.ad, bt.gQ);
        if (bArrI == null) {
            this.b.b("获取上传指令数据错误!");
        } else {
            a.i.a(new w((short) 4227, bArrI));
            this.b.a((String) null);
        }
    }

    public final void f() {
        this.b.aq.j();
        this.b.aq.a("申请列表");
        this.b.aq.a(false);
        c cVar = this.b.ar;
        String[] strArr = bt.iu;
        short[] sArr = bt.iv;
        String[] strArr2 = null;
        if (sArr != null) {
            strArr2 = new String[sArr.length];
            for (int i = 0; i < sArr.length; i++) {
                strArr2[i] = new String(new StringBuffer().append((int) sArr[i]).append("级").toString());
            }
        }
        cVar.a((Image[]) null, strArr, strArr2, bt.iw);
        this.b.au.a("确定");
        this.b.au.a(true);
        this.b.aq.a(this.b.ar);
        this.b.aq.a(this.b.au);
        this.b.aq.a(t.f, t.g, t.d, t.e);
        this.a.l = (short) 0;
        this.b.j = this.b.k;
        ao aoVar = this.a;
        this.a.k = (short) 46;
        aoVar.j = (short) 46;
    }

    public final void f(int i) throws IOException {
        if (this.a.l == 0) {
            if (this.b.aq != null) {
                this.b.aq.b(i);
            }
            if (i == 268435456 || i == 1073741824 || i == 517) {
                ca.a(80 + t.f, t.j + 20 + (this.b.ar.i() * t.j) + t.g, new String[]{"详情", "接纳", "拒绝"}, false);
                this.a.l = (short) 1;
                return;
            }
            if (i == 536870912) {
                a(true);
                return;
            }
            if (i != 1024) {
                if (i == 2048) {
                    if (bt.gQ <= 1 && bt.gR == 1) {
                        bt.gQ = (short) (bt.gQ + 1);
                        e();
                        return;
                    } else {
                        if (bt.gQ <= 1 || bt.gR != 1) {
                            return;
                        }
                        bt.gQ = (short) (bt.gQ + 1);
                        e();
                        return;
                    }
                }
                return;
            }
            if (bt.gQ > 1 && bt.gR == 1) {
                if (bt.gQ - 1 <= 1) {
                    bt.gQ = (short) 1;
                } else {
                    bt.gQ = (short) (bt.gQ - 1);
                }
                e();
                return;
            }
            if (bt.gQ <= 1 || bt.gR != 0) {
                return;
            }
            if (bt.gQ - 1 < 1) {
                bt.gQ = (short) 1;
            } else {
                bt.gQ = (short) (bt.gQ - 1);
            }
            e();
            return;
        }
        if (this.a.l != 1) {
            if (this.a.l == 2) {
                this.a.T.b(i);
                if (i == 268435456 || i == 536870912 || i == 1073741824 || i == 517) {
                    this.a.T.j();
                    f();
                    return;
                }
                return;
            }
            return;
        }
        ca.b(i);
        if (i != 268435456 && i != 1073741824 && i != 517) {
            if (i == 536870912) {
                this.a.l = (short) 0;
                return;
            }
            return;
        }
        if (ca.o == 0) {
            if (bt.ix[this.b.ar.g()] != 1) {
                this.b.b("对方不在线");
                return;
            }
            byte[] bArrA = bz.a((short) 4110, bt.ad, bt.it[this.b.ar.g()], (byte) 0);
            if (bArrA == null) {
                this.b.b("获取上传指令数据错误!");
                return;
            } else {
                a.i.a(new w((short) 4110, bArrA));
                this.b.a((String) null);
                return;
            }
        }
        if (ca.o == 1) {
            byte[] bArrM = bz.m((short) 4228, bt.ad, bt.it[this.b.ar.g()]);
            if (bArrM == null) {
                this.b.b("获取上传指令数据错误!");
                return;
            } else {
                a.i.a(new w((short) 4228, bArrM));
                this.b.a((String) null);
                return;
            }
        }
        if (ca.o == 2) {
            byte[] bArrM2 = bz.m((short) 4229, bt.ad, bt.it[this.b.ar.g()]);
            if (bArrM2 == null) {
                this.b.b("获取上传指令数据错误!");
            } else {
                a.i.a(new w((short) 4229, bArrM2));
                this.b.a((String) null);
            }
        }
    }

    public final void g() {
        this.b.a("输入玩家名称", 0);
    }

    public final void h() {
        if (this.f != null) {
            byte[] bArrJ = bz.j((short) 4201, bt.ad, this.f);
            if (bArrJ != null) {
                a.i.a(new w((short) 4201, bArrJ));
            } else {
                this.b.b("获取上传指令数据错误!");
            }
            this.b.a((String) null);
        }
    }

    public final void g(int i) throws IOException {
        this.g = i;
        byte[] bArrH = bz.h((short) 4212, bt.ad, bt.gQ);
        if (bArrH == null) {
            this.b.b("获取上传指令数据错误!");
        } else {
            a.i.a(new w((short) 4212, bArrH));
            this.b.a((String) null);
        }
    }

    private void B() throws IOException {
        byte[] bArrO = bz.o((short) 4211, bt.ad);
        if (bArrO == null) {
            this.b.b("获取上传指令数据错误!");
        } else {
            a.i.a(new w((short) 4211, bArrO));
            this.b.a((String) null);
        }
    }

    private void a(byte b) throws IOException {
        byte[] bArrK = bz.k((short) 4263, bt.ad, b);
        if (bArrK == null) {
            this.b.b("获取上传指令数据错误!");
        } else {
            a.i.a(new w((short) 4263, bArrK));
            this.b.a((String) null);
        }
    }

    public final void h(int i) {
        this.b.aq.j();
        this.b.aq.a("帮派信息");
        this.b.aq.a(true);
        this.b.as.a(new String[]{"成员", "帮派", "外交", "帮战"});
        this.b.aq.a(this.b.as);
        if (i == 0) {
            this.b.as.a = (byte) 0;
            this.b.ar.a((Image[]) null, bt.iz, bt.iA, a(bt.iC, "战力"));
            this.b.ar.a(bt.aC == 1 ? bt.iE : null);
            this.b.ar.b(bt.aH == 1 ? bt.iF : null);
            this.b.ar.a(bt.iG);
            this.b.au.a("确定");
            this.b.au.a(true);
            this.b.aq.a(this.b.ar);
            this.b.aq.a(this.b.au);
            this.b.aq.a(t.f, t.g, t.d, t.e);
        } else if (i == 1) {
            this.b.as.a = (byte) 1;
            this.b.at.b(bt.iH, t.i, (byte) 2);
            this.b.aq.a(this.b.at);
            this.b.aq.a(t.f, t.g, t.d, t.e);
        } else if (i == 2) {
            this.b.as.a = (byte) 2;
            String[] strArr = null;
            int[] iArr = null;
            if (bt.jY != null && bt.jY.length > 0) {
                strArr = new String[bt.jY.length];
                iArr = new int[bt.jY.length];
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    strArr[i2] = bt.d(bt.ka[i2]);
                    if (bt.ka[i2] == 2) {
                        iArr[i2] = 12845056;
                    } else if (bt.ka[i2] == 3) {
                        iArr[i2] = 16711680;
                    } else {
                        iArr[i2] = 16776960;
                    }
                }
            }
            this.b.ar.a((Image[]) null, bt.jZ, (String[]) null, strArr);
            this.b.ar.a("搜索...");
            this.b.ar.a(iArr);
            this.b.ar.a("帮派搜索", 1);
            this.b.au.a("确定");
            this.b.au.a(true);
            this.b.aq.a(this.b.ar);
            this.b.aq.a(this.b.au);
            this.b.aq.a(t.f, t.g, t.d, t.e);
            ca.l = 0;
        } else if (i == 3) {
            this.b.as.a = (byte) 3;
            this.b.at.b(bt.kl, t.i, (byte) 2);
            this.b.au.a("确定");
            this.b.au.a(true);
            this.b.aq.a(this.b.at);
            this.b.aq.a(this.b.au);
            this.b.aq.a(t.f, t.g, t.d, t.e);
        }
        this.a.l = (short) 0;
        this.b.j = this.b.k;
        ao aoVar = this.a;
        this.a.k = (short) 47;
        aoVar.j = (short) 47;
    }

    public final void i(int i) throws IOException {
        if (this.a.l == 0) {
            if (this.b.as.a == 0) {
                if (this.b.aq != null) {
                    this.b.aq.b(i);
                }
                if (bt.iy != null) {
                    if (i == 268435456 || i == 1073741824 || i == 517) {
                        if (bt.iD[this.b.ar.g()] == 1) {
                            if (!bt.iy[this.b.ar.g()].equals(bt.ad)) {
                                ca.a(80 + t.f, (2 * t.j) + 20 + (this.b.ar.i() * t.j) + t.g, new String[]{"查看", "私聊", "组队", "交易", "好友", "黑名单"}, false);
                                this.a.l = (short) 1;
                                this.a.aE = this.b.ar.g();
                                this.a.aA = this.b.ar.h();
                            }
                        } else if (!bt.iy[this.b.ar.g()].equals(bt.ad)) {
                            ca.a(80 + t.f, (2 * t.j) + 20 + (this.b.ar.i() * t.j) + t.g, new String[]{"查看"}, false);
                            this.a.l = (short) 1;
                            this.a.aE = this.b.ar.g();
                            this.a.aA = this.b.ar.h();
                        }
                    } else if (i == 1024) {
                        if (bt.gQ > 1 && bt.gR == 1) {
                            if (bt.gQ - 1 <= 1) {
                                bt.gQ = (short) 1;
                            } else {
                                bt.gQ = (short) (bt.gQ - 1);
                            }
                            g(this.g);
                        } else if (bt.gQ > 1 && bt.gR == 0) {
                            if (bt.gQ - 1 < 1) {
                                bt.gQ = (short) 1;
                            } else {
                                bt.gQ = (short) (bt.gQ - 1);
                            }
                            g(this.g);
                        }
                    } else if (i == 2048) {
                        if (bt.gQ <= 1 && bt.gR == 1) {
                            bt.gQ = (short) (bt.gQ + 1);
                            g(this.g);
                        } else if (bt.gQ > 1 && bt.gR == 1) {
                            bt.gQ = (short) (bt.gQ + 1);
                            g(this.g);
                        }
                    }
                }
                if (i == 2 || i == 518) {
                    B();
                } else if (i == 8 || i == 516) {
                    bt.gQ = (short) 1;
                    C();
                }
            } else if (this.b.as.a == 1) {
                if (this.b.aq != null) {
                    this.b.aq.b(i);
                }
                if (i == 8 || i == 516) {
                    bt.gQ = (short) 1;
                    g(this.g);
                } else if (i == 2 || i == 518) {
                    bt.gQ = (short) 1;
                    this.p = 1;
                    this.o = "";
                    a(this.o);
                }
            } else if (this.b.as.a == 2) {
                if (this.b.aq != null) {
                    this.b.aq.b(i);
                }
                if (i == 8 || i == 516) {
                    B();
                } else if (i == 2 || i == 518) {
                    bt.gQ = (short) 1;
                    C();
                    h(3);
                }
                if (i == 1 || i == 514 || i == 520 || i == 4) {
                    this.b.ar.a(this.b.ar.g() == this.b.ar.h() ? "帮派搜索" : w(this.b.ar.g() - 1), 1);
                }
                if (i == 268435456 || i == 1073741824 || i == 517) {
                    this.a.aA = this.b.ar.h();
                    this.a.aE = this.b.ar.g();
                    if (this.b.ar.g() == this.b.ar.h()) {
                        this.b.a("请输入要搜索的帮派名称", 0);
                    } else if (bt.jY != null) {
                        ca.a(80 + t.f, (2 * t.j) + 20 + (this.b.ar.i() * t.j) + t.g, new String[]{"查看", "外交", "宣战"}, true);
                        this.a.l = (short) 7;
                    }
                } else if (i == 1024) {
                    if (bt.gQ > 1 && bt.gR == 1) {
                        if (bt.gQ - 1 <= 1) {
                            bt.gQ = (short) 1;
                        } else {
                            bt.gQ = (short) (bt.gQ - 1);
                        }
                        a(this.o);
                    } else if (bt.gQ > 1 && bt.gR == 0) {
                        if (bt.gQ - 1 < 1) {
                            bt.gQ = (short) 1;
                        } else {
                            bt.gQ = (short) (bt.gQ - 1);
                        }
                        a(this.o);
                    }
                } else if (i == 2048) {
                    if (bt.gQ <= 1 && bt.gR == 1) {
                        bt.gQ = (short) (bt.gQ + 1);
                        a(this.o);
                    } else if (bt.gQ > 1 && bt.gR == 1) {
                        bt.gQ = (short) (bt.gQ + 1);
                        a(this.o);
                    }
                }
            } else if (this.b.as.a == 3) {
                if (this.b.aq != null) {
                    this.b.aq.b(i);
                }
                if (i == 8 || i == 516) {
                    bt.gQ = (short) 1;
                    this.p = 1;
                    this.o = "";
                    a(this.o);
                } else if (i == 2 || i == 518) {
                    bt.gQ = (short) 1;
                    g(this.g);
                } else if (i == 1024) {
                    if (bt.gQ > 1 && bt.gR == 1) {
                        if (bt.gQ - 1 <= 1) {
                            bt.gQ = (short) 1;
                        } else {
                            bt.gQ = (short) (bt.gQ - 1);
                        }
                        C();
                    } else if (bt.gQ > 1 && bt.gR == 0) {
                        if (bt.gQ - 1 < 1) {
                            bt.gQ = (short) 1;
                        } else {
                            bt.gQ = (short) (bt.gQ - 1);
                        }
                        C();
                    }
                } else if (i == 2048) {
                    if (bt.gQ <= 1 && bt.gR == 1) {
                        bt.gQ = (short) (bt.gQ + 1);
                        C();
                    } else if (bt.gQ > 1 && bt.gR == 1) {
                        bt.gQ = (short) (bt.gQ + 1);
                        C();
                    }
                }
            } else if (this.b.as.a == 4) {
                if (this.b.aq != null) {
                    this.b.aq.b(i);
                }
                if (i == 8 || i == 516) {
                    bt.gQ = (short) 1;
                    C();
                }
            }
            if (i == 536870912) {
                this.o = "";
                bt.gQ = (short) 1;
                if (this.g == 1) {
                    a(true);
                    return;
                } else {
                    if (this.g == 0) {
                        this.a.k();
                        this.a.c(1);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (this.a.l == 1) {
            if (this.b.aC != null && this.b.g) {
                this.a.aQ = bt.iz[this.b.ar.g()];
                this.a.a(bt.iy[this.b.ar.g()], (byte) 4);
                this.a.l = (short) 0;
                this.b.b("聊天消息已发送!");
            }
            ca.b(i);
            if (i != 268435456 && i != 1073741824 && i != 517) {
                if (i == 536870912) {
                    this.a.l = (short) 0;
                    return;
                }
                return;
            }
            if (ca.o == 0) {
                ca.a(80 + t.f, (2 * t.j) + 20 + (this.b.ar.i() * t.j) + t.g, new String[]{"属性", "装备"}, false);
                this.a.l = (short) 2;
                return;
            }
            if (ca.o == 1) {
                this.a.aS = bt.iy[this.b.ar.g()];
                this.a.aT = 4;
                this.b.a("聊天", 0);
                return;
            }
            if (ca.o == 2) {
                if (bt.bs != -1) {
                    this.a.a(bt.s, bt.iy[this.b.ar.g()]);
                    return;
                } else {
                    ca.a(80 + t.f, (2 * t.j) + 20 + (this.b.ar.i() * t.j) + t.g, new String[]{"自由", "跟随"}, false);
                    this.a.l = (short) 6;
                    return;
                }
            }
            if (ca.o == 3) {
                ca.a(80 + t.f, (2 * t.j) + 20 + (this.b.ar.i() * t.j) + t.g, new String[]{"物品", "宠物"}, false);
                this.a.l = (short) 5;
                return;
            } else if (ca.o == 4) {
                this.a.a(bt.iy[this.b.ar.g()]);
                this.a.l = (short) 0;
                return;
            } else {
                if (ca.o == 5) {
                    this.a.b(bt.iy[this.b.ar.g()]);
                    this.a.l = (short) 0;
                    return;
                }
                return;
            }
        }
        if (this.a.l == 2) {
            ca.b(i);
            if (i != 268435456 && i != 1073741824 && i != 517) {
                if (i == 536870912) {
                    if (bt.iD[this.b.ar.g()] == 1) {
                        ca.a(80 + t.f, (2 * t.j) + 20 + (this.b.ar.i() * t.j) + t.g, new String[]{"查看", "私聊", "组队", "交易", "好友", "黑名单"}, false);
                    } else {
                        ca.a(80 + t.f, (2 * t.j) + 20 + (this.b.ar.i() * t.j) + t.g, new String[]{"查看"}, false);
                    }
                    this.a.l = (short) 1;
                    return;
                }
                return;
            }
            if (ca.o == 0) {
                byte[] bArrA = bz.a((short) 4110, bt.ad, bt.iy[this.b.ar.g()], (byte) 1);
                if (bArrA == null) {
                    this.b.b("获取上传指令数据错误!");
                    return;
                } else {
                    a.i.a(new w((short) 4110, bArrA));
                    this.b.a((String) null);
                    return;
                }
            }
            if (ca.o == 1) {
                byte[] bArrB = bz.b((short) 4111, bt.ad, bt.iy[this.b.ar.g()]);
                if (bArrB == null) {
                    this.b.b("获取上传指令数据错误!");
                    return;
                } else {
                    a.i.a(new w((short) 4111, bArrB));
                    this.b.a((String) null);
                    return;
                }
            }
            return;
        }
        if (this.a.l == 3) {
            this.a.T.b(i);
            if (i == 268435456 || i == 536870912) {
                this.a.T.j();
                this.a.l = (short) 2;
                return;
            }
            return;
        }
        if (this.a.l == 4) {
            this.a.a(bt.cJ);
            this.a.g(i);
            if (i == 536870912) {
                if (this.a.m == 1) {
                    this.a.T.j();
                    this.a.m = (short) 0;
                    return;
                }
                if (bt.cJ != null) {
                    bt.o();
                }
                ao.q = null;
                this.a.al = null;
                this.a.l = (short) 2;
                a.f.a(this.a.f, ao.h, ao.i, true, false, 1009050);
                return;
            }
            return;
        }
        if (this.a.l == 5) {
            ca.b(i);
            if (i != 268435456 && i != 1073741824 && i != 517) {
                if (i == 536870912) {
                    ca.a(80 + t.f, (2 * t.j) + 20 + (this.b.ar.i() * t.j) + t.g, new String[]{"查看", "私聊", "组队", "交易", "好友", "黑名单"}, false);
                    ca.o = 3;
                    this.a.l = (short) 1;
                    return;
                }
                return;
            }
            byte[] bArrB2 = bz.b((short) 4124, bt.ad, bt.iy[this.b.ar.g()], (byte) ca.o);
            if (bArrB2 == null) {
                this.b.b("获取上传指令数据错误!");
                return;
            } else {
                a.i.a(new w((short) 4124, bArrB2));
                this.b.a((String) null);
                return;
            }
        }
        if (this.a.l == 6) {
            ca.b(i);
            if (i != 268435456 && i != 1073741824 && i != 517) {
                if (i == 536870912) {
                    ca.a(80 + t.f, (2 * t.j) + 20 + (this.b.ar.i() * t.j) + t.g, new String[]{"查看", "私聊", "组队", "交易", "好友", "黑名单"}, false);
                    ca.o = 2;
                    this.a.l = (short) 1;
                    return;
                }
                return;
            }
            int i2 = ca.o == 0 ? 1 : 0;
            if (bt.bs == 0) {
                this.b.b("队员不能发送组队邀请！");
                return;
            }
            if (bt.bs == 1 && bt.q != null && bt.q.length >= 3) {
                this.b.b("队伍已满，无法邀请！");
                return;
            }
            byte[] bArrA2 = bz.a((short) 4112, bt.ad, bt.iy[this.b.ar.g()], (short) i2);
            if (bArrA2 == null) {
                this.b.b("获取上传指令数据错误!");
                return;
            } else {
                a.i.a(new w((short) 4112, bArrA2));
                this.a.l = (short) 0;
                return;
            }
        }
        if (this.a.l == 7) {
            ca.b(i);
            if (i != 268435456 && i != 1073741824 && i != 517) {
                if (i == 536870912) {
                    this.a.l = (short) 0;
                    return;
                }
                return;
            }
            this.b.aw = ca.o;
            if (ca.o == 0) {
                b(bt.jY[this.b.ar.g() - 1]);
                return;
            }
            if (ca.o == 1) {
                ca.a(80 + t.f, (2 * t.j) + 20 + (this.b.ar.i() * t.j) + t.g, new String[]{"中立", "敌对"}, true);
                this.a.l = (short) 8;
                return;
            } else {
                if (ca.o == 2) {
                    this.a.l = (short) 9;
                    ca.h = 0;
                    return;
                }
                return;
            }
        }
        if (this.a.l != 8) {
            if (this.a.l == 9) {
                if (i == 268435456 || i == 1073741824 || i == 517) {
                    this.b.a("输入OK确认宣战", 0);
                    return;
                } else {
                    if (i == 536870912) {
                        this.a.l = (short) 0;
                        return;
                    }
                    return;
                }
            }
            return;
        }
        ca.b(i);
        if (i != 268435456 && i != 1073741824 && i != 517) {
            if (i == 536870912) {
                this.a.l = (short) 0;
            }
        } else if (ca.o == 0) {
            a((byte) 1, bt.jY[this.b.ar.g() - 1]);
        } else if (ca.o == 1) {
            a((byte) 2, bt.jY[this.b.ar.g() - 1]);
        }
    }

    public final void j(int i) throws IOException {
        this.g = i;
        byte[] bArrH = bz.h((short) 4240, bt.ad, bt.gQ);
        if (bArrH != null) {
            a.i.a(new w((short) 4240, bArrH));
        } else {
            this.b.b("获取上传指令数据错误!");
        }
    }

    public final void i() {
        this.b.aq.j();
        this.b.aq.a("成员列表");
        this.b.aq.a(false);
        this.b.ar.a((Image[]) null, bt.iz, bt.iA, a(bt.iB, "功勋"));
        this.b.ar.a(bt.aC == 1 ? bt.iE : null);
        this.b.ar.b(bt.aH == 1 ? bt.iF : null);
        this.b.ar.a(bt.iG);
        this.b.au.a("任免");
        this.b.au.a(true);
        this.b.aq.a(this.b.ar);
        this.b.aq.a(this.b.au);
        this.b.aq.a(t.f, t.g, t.d, t.e);
        this.a.l = (short) 0;
        this.b.j = this.b.k;
        ao aoVar = this.a;
        this.a.k = (short) 48;
        aoVar.j = (short) 48;
    }

    private static String[] a(int[] iArr, String str) {
        String[] strArr = null;
        if (iArr != null) {
            strArr = new String[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                strArr[i] = new String(new StringBuffer().append("").append(iArr[i]).append(str).toString());
            }
        }
        return strArr;
    }

    public final void k(int i) throws IOException {
        if (this.a.l == 0) {
            if (bt.iy != null) {
                if (this.b.aq != null) {
                    this.b.aq.b(i);
                }
                if (i == 268435456 || i == 1073741824 || i == 517) {
                    ca.a(80 + t.f, t.j + 20 + (this.b.ar.i() * t.j) + t.g, new String[]{"任免", "开除"}, false);
                    this.a.l = (short) 1;
                    this.v = this.b.ar.g();
                }
            }
            if (i == 536870912) {
                if (this.g == 1) {
                    a(true);
                    return;
                } else {
                    if (this.g == 0) {
                        this.a.k();
                        this.a.c(1);
                        return;
                    }
                    return;
                }
            }
            if (i != 1024) {
                if (i == 2048) {
                    if (bt.gQ <= 1 && bt.gR == 1) {
                        bt.gQ = (short) (bt.gQ + 1);
                        j(this.g);
                        return;
                    } else {
                        if (bt.gQ <= 1 || bt.gR != 1) {
                            return;
                        }
                        bt.gQ = (short) (bt.gQ + 1);
                        j(this.g);
                        return;
                    }
                }
                return;
            }
            if (bt.gQ > 1 && bt.gR == 1) {
                if (bt.gQ - 1 <= 1) {
                    bt.gQ = (short) 1;
                } else {
                    bt.gQ = (short) (bt.gQ - 1);
                }
                j(this.g);
                return;
            }
            if (bt.gQ <= 1 || bt.gR != 0) {
                return;
            }
            if (bt.gQ - 1 < 1) {
                bt.gQ = (short) 1;
            } else {
                bt.gQ = (short) (bt.gQ - 1);
            }
            j(this.g);
            return;
        }
        if (this.a.l == 1) {
            ca.b(i);
            if (i != 268435456 && i != 1073741824 && i != 517) {
                if (i == 536870912) {
                    this.a.l = (short) 0;
                    return;
                }
                return;
            } else {
                if (ca.o != 0) {
                    if (ca.o == 1) {
                        this.a.l = (short) 3;
                        ca.h = 0;
                        return;
                    }
                    return;
                }
                byte[] bArrP = bz.p((short) 4241, bt.ad);
                if (bArrP == null) {
                    this.b.b("获取上传指令数据错误!");
                    return;
                } else {
                    a.i.a(new w((short) 4241, bArrP));
                    this.b.a((String) null);
                    return;
                }
            }
        }
        if (this.a.l != 2) {
            if (this.a.l == 3) {
                if (i != 268435456 && i != 1073741824 && i != 517) {
                    if (i == 536870912) {
                        this.a.l = (short) 0;
                        return;
                    }
                    return;
                } else {
                    byte[] bArrK = bz.k((short) 4208, bt.ad, bt.iy[this.b.ar.g()]);
                    if (bArrK == null) {
                        this.b.b("获取上传指令数据错误!");
                        return;
                    } else {
                        a.i.a(new w((short) 4208, bArrK));
                        this.b.a((String) null);
                        return;
                    }
                }
            }
            return;
        }
        if (this.b.aq != null) {
            this.b.aq.b(i);
        }
        if (i == 1 || i == 514 || i == 520 || i == 4) {
            this.b.at.b(bt.je[this.b.ar.g()], t.i, (byte) 2);
            this.b.at.a((byte) 1);
        }
        if (i != 268435456 && i != 1073741824 && i != 517) {
            if (i == 536870912) {
                i();
            }
        } else {
            byte[] bArrD = bz.d((short) 4217, bt.ad, bt.iy[this.v], bt.jc[this.b.ar.g()]);
            if (bArrD == null) {
                this.b.b("获取上传指令数据错误!");
            } else {
                a.i.a(new w((short) 4217, bArrD));
                this.b.a((String) null);
            }
        }
    }

    public final void j() {
        this.b.aq.j();
        this.b.aq.a("职务列表");
        this.b.aq.a(true);
        this.b.ar.a((Image[]) null, bt.jd, (String[]) null, (String[]) null);
        this.b.at.b(bt.je[this.b.ar.g()], t.i, (byte) 2);
        this.b.at.a((byte) 1);
        this.b.au.a("确定");
        this.b.aq.a(this.b.ar);
        this.b.aq.a(this.b.at);
        this.b.aq.a(this.b.au);
        this.b.aq.a(t.f, t.g, t.d, t.e);
        this.a.l = (short) 2;
        this.b.j = this.b.k;
        ao aoVar = this.a;
        this.a.k = (short) 48;
        aoVar.j = (short) 48;
    }

    public final void l(int i) {
        if (this.a.l == 0) {
            if (this.b.aq != null) {
                this.b.aq.b(i);
            }
            if (i == 268435456 || i == 536870912 || i == 1073741824 || i == 517) {
                this.a.m();
            }
        }
    }

    public final void k() {
        this.b.aq.j();
        this.b.aq.a("帮派公告");
        this.b.aq.a(false);
        this.b.at.b(bt.jf, t.i, (byte) 2);
        this.b.au.a("确定");
        this.b.aq.a(this.b.at);
        this.b.aq.a(this.b.au);
        this.b.aq.a(t.f, t.g, t.d, t.e);
        this.a.l = (short) 0;
        this.b.j = this.b.k;
        ao aoVar = this.a;
        this.a.k = (short) 49;
        aoVar.j = (short) 49;
    }

    public final void b(boolean z) {
        this.b.aq.j();
        this.b.aq.a("宝库管理");
        this.b.aq.a(false);
        this.b.ar.a((Image[]) null, t.ad, (String[]) null, (String[]) null);
        if (z) {
            this.b.ar.a(this.a.aA, this.a.aE);
            this.b.at.b(bt.iI[this.a.aE], t.i, (byte) 2);
        } else {
            this.b.at.b(bt.iI[0], t.i, (byte) 2);
        }
        this.b.at.a((byte) 1);
        this.b.au.a("确定");
        this.b.aq.a(this.b.ar);
        this.b.aq.a(this.b.at);
        this.b.aq.a(this.b.au);
        this.b.aq.a(t.f, t.g, t.d, t.e);
        ca.h = 0;
        ca.g = 0;
        this.b.a = 0;
        this.a.l = (short) 0;
        this.b.j = this.b.k;
        ao aoVar = this.a;
        this.a.k = (short) 50;
        aoVar.j = (short) 50;
    }

    public final void m(int i) throws IOException {
        if (this.a.l == 0) {
            if (this.b.aq != null) {
                this.b.aq.b(i);
            }
            if (i == 514 || i == 520 || i == 1 || i == 4) {
                this.b.at.b(bt.iI[this.b.ar.g()], t.i, (byte) 2);
                this.b.at.a((byte) 1);
            }
            if (i != 268435456 && i != 1073741824 && i != 517) {
                if (i == 536870912) {
                    bt.H();
                    ao aoVar = this.a;
                    this.a.k = (short) 0;
                    aoVar.j = (short) 0;
                    return;
                }
                return;
            }
            this.a.aA = this.b.ar.h();
            this.a.aE = this.b.ar.g();
            switch (this.a.aE) {
                case 0:
                    o();
                    break;
                case 1:
                    this.a.e(18);
                    break;
                case 2:
                    this.a.o();
                    this.a.l = (short) 1;
                    this.a.a(bt.ap);
                    break;
                case 3:
                    this.a.o();
                    this.a.l = (short) 5;
                    this.a.a(999999999L);
                    break;
                case 4:
                    this.a.o();
                    this.a.l = (short) 2;
                    this.a.a(bt.am);
                    break;
                case 5:
                    m();
                    break;
                case 6:
                    this.a.a(99L);
                    this.a.l = (short) 3;
                    break;
                case 7:
                    this.a.a(99L);
                    this.a.l = (short) 4;
                    break;
                case 8:
                    b((byte) 1);
                    break;
                case 9:
                    this.a.l = (short) 6;
                    this.a.at = "您确定要消耗一定物品提升帮派人气吗？";
                    ca.h = 0;
                    break;
                case 10:
                    this.a.l = (short) 7;
                    this.a.at = "您确定要消耗一定物品扩容帮派宝库吗？";
                    ca.h = 0;
                    break;
            }
            return;
        }
        if (this.a.l == 1 || this.a.l == 2) {
            if (i != 268435456 && i != 1073741824) {
                if (i == 536870912) {
                    this.a.l = (short) 0;
                    return;
                } else {
                    this.a.d(i);
                    return;
                }
            }
            if (this.a.n() == -1) {
                this.b.b("输入有误,请重新输入");
                return;
            }
            if (this.a.n() > this.a.ah) {
                this.b.b("超出最大值,请重新输入");
                return;
            }
            byte[] bArrB = bz.b((short) 4264, (byte) (this.a.l == 1 ? 1 : 3), this.a.n(), bt.ad);
            if (bArrB != null) {
                a.i.a(new w((short) 4264, bArrB));
                this.b.a((String) null);
            } else {
                this.b.b("获取上传指令数据错误!");
            }
            this.a.l = (short) 0;
            return;
        }
        if (this.a.l == 3 || this.a.l == 4) {
            if (this.a.m == 0) {
                if (i == 268435456 || i == 1073741824 || i == 517) {
                    this.a.at = new StringBuffer().append("发布").append(this.a.ag).append("天帮派任务\t是否确认？").toString();
                    this.a.m = (short) 1;
                    ca.h = 0;
                    return;
                } else if (i == 536870912) {
                    this.a.l = (short) 0;
                    return;
                } else {
                    this.a.b(i);
                    return;
                }
            }
            if (this.a.m == 1) {
                if (i != 268435456 && i != 1073741824 && i != 517) {
                    if (i == 536870912) {
                        this.a.at = null;
                        this.a.m = (short) 0;
                        ca.h = 0;
                        return;
                    }
                    return;
                }
                byte[] bArrA = bz.a((short) 4368, this.a.ag, (byte) (this.a.l == 3 ? 1 : 2), bt.ad);
                if (bArrA != null) {
                    a.i.a(new w((short) 4368, bArrA));
                    this.b.a((String) null);
                } else {
                    this.b.b("获取上传指令数据错误!");
                }
                ca.h = 0;
                this.a.m = (short) 0;
                return;
            }
            return;
        }
        if (this.a.l == 5) {
            if (i != 268435456 && i != 1073741824) {
                if (i == 536870912) {
                    this.a.l = (short) 0;
                    return;
                } else {
                    this.a.d(i);
                    return;
                }
            }
            if (this.a.n() == -1) {
                this.b.b("输入有误,请重新输入");
                return;
            }
            if (this.a.n() > this.a.ah) {
                this.b.b("超出最大值,请重新输入");
                return;
            }
            byte[] bArrB2 = bz.b((short) 4264, (byte) 2, this.a.n(), bt.ad);
            if (bArrB2 != null) {
                a.i.a(new w((short) 4264, bArrB2));
                this.b.a((String) null);
            } else {
                this.b.b("获取上传指令数据错误!");
            }
            this.a.l = (short) 0;
            return;
        }
        if (this.a.l == 6) {
            if (i == 268435456 || i == 1073741824 || i == 517) {
                this.a.l = (short) 0;
                a((short) 4677);
                return;
            } else {
                if (i == 536870912) {
                    ca.l = 0;
                    ca.h = 0;
                    this.a.l = (short) 0;
                    return;
                }
                return;
            }
        }
        if (this.a.l == 7) {
            if (i == 268435456 || i == 1073741824 || i == 517) {
                this.a.l = (short) 0;
                a((short) 4265);
            } else if (i == 536870912) {
                ca.l = 0;
                ca.h = 0;
                this.a.l = (short) 0;
            }
        }
    }

    private void a(short s) throws IOException {
        byte[] bArrC = bz.C(s, bt.ad);
        if (bArrC == null) {
            this.b.b("获取上传指令数据错误!");
        } else {
            a.i.a(new w(s, bArrC));
            this.b.a((String) null);
        }
    }

    private void b(byte b) throws IOException {
        byte[] bArrA = bz.a((short) 4239, b, this.i, bt.ad);
        if (bArrA == null) {
            this.b.b("获取上传指令数据错误!");
        } else {
            a.i.a(new w((short) 4239, bArrA));
            this.b.a((String) null);
        }
    }

    public final void l() {
        this.a.a(this.w);
        this.k = new int[5];
        this.l = new int[5][4];
        this.m = new int[5][4];
        this.n = new int[4];
        this.b.aq.j();
        this.b.aq.a("贡献物品");
        this.b.aq.a(false);
        this.b.ar.a(ao.b(this.w), t.b <= 176 ? new String[]{"", "", "", "", ""} : t.ae, (String[]) null, (String[]) null);
        this.b.aq.f = a.L.c;
        this.b.ar.b(false);
        this.b.au.a(new String[]{"确定", "返回"});
        this.b.aq.a(this.b.ar);
        this.b.aq.a(this.b.au);
        this.b.aq.a(t.f, t.g, t.d, t.e);
        this.a.l = (short) 0;
        this.b.j = this.b.k;
        ao aoVar = this.a;
        this.a.k = (short) 51;
        aoVar.j = (short) 51;
    }

    public final void m() {
        byte[] bArrR = bz.r((short) 4221, bt.ad);
        if (bArrR == null) {
            this.b.b("获取上传指令数据错误!");
        } else {
            a.i.a(new w((short) 4221, bArrR));
            this.b.a((String) null);
        }
    }

    public final void n(int i) throws IOException {
        short s;
        short s2;
        short s3;
        short s4;
        short s5;
        short s6;
        short s7;
        short s8;
        short s9;
        short s10;
        short s11;
        short s12;
        short s13;
        short s14;
        short s15;
        short s16;
        if (this.a.l == 0) {
            if (this.b.aq != null) {
                this.b.aq.b(i);
            }
            if (this.b.aA <= 40) {
                if (i != 2 && i != 518) {
                    if (i == 8 || i == 516) {
                        switch (this.b.ar.g()) {
                            case 0:
                                int[] iArr = this.k;
                                long j = this.j - 100 <= 0 ? 0L : this.j - 100;
                                this.j = j;
                                iArr[0] = (int) j;
                                break;
                            case 1:
                                int[] iArr2 = this.k;
                                short s17 = this.B;
                                this.B = (short) (s17 - 1);
                                if (s17 <= 0) {
                                    s8 = 0;
                                } else {
                                    short s18 = this.B;
                                    s8 = s18;
                                    this.B = (short) (s18 - 1);
                                }
                                short s19 = s8;
                                this.B = s19;
                                iArr2[1] = s19;
                                break;
                            case 2:
                                int[] iArr3 = this.k;
                                short s20 = this.C;
                                this.C = (short) (s20 - 1);
                                if (s20 <= 0) {
                                    s7 = 0;
                                } else {
                                    short s21 = this.C;
                                    s7 = s21;
                                    this.C = (short) (s21 - 1);
                                }
                                short s22 = s7;
                                this.C = s22;
                                iArr3[2] = s22;
                                break;
                            case 3:
                                int[] iArr4 = this.k;
                                short s23 = this.D;
                                this.D = (short) (s23 - 1);
                                if (s23 <= 0) {
                                    s6 = 0;
                                } else {
                                    short s24 = this.D;
                                    s6 = s24;
                                    this.D = (short) (s24 - 1);
                                }
                                short s25 = s6;
                                this.D = s25;
                                iArr4[3] = s25;
                                break;
                            case 4:
                                int[] iArr5 = this.k;
                                short s26 = this.E;
                                this.E = (short) (s26 - 1);
                                if (s26 <= 0) {
                                    s5 = 0;
                                } else {
                                    short s27 = this.E;
                                    s5 = s27;
                                    this.E = (short) (s27 - 1);
                                }
                                short s28 = s5;
                                this.E = s28;
                                iArr5[4] = s28;
                                break;
                        }
                    }
                } else {
                    switch (this.b.ar.g()) {
                        case 0:
                            int[] iArr6 = this.k;
                            long j2 = this.j + 100 <= bt.ap ? this.j + 100 : bt.ap;
                            this.j = j2;
                            iArr6[0] = (int) j2;
                            break;
                        case 1:
                            int[] iArr7 = this.k;
                            short s29 = this.B;
                            this.B = (short) (s29 + 1);
                            if (s29 >= bt.jh) {
                                s4 = bt.jh;
                            } else {
                                short s30 = this.B;
                                s4 = s30;
                                this.B = (short) (s30 + 1);
                            }
                            short s31 = s4;
                            this.B = s31;
                            iArr7[1] = s31;
                            break;
                        case 2:
                            int[] iArr8 = this.k;
                            short s32 = this.C;
                            this.C = (short) (s32 + 1);
                            if (s32 >= bt.jj) {
                                s3 = bt.jj;
                            } else {
                                short s33 = this.C;
                                s3 = s33;
                                this.C = (short) (s33 + 1);
                            }
                            short s34 = s3;
                            this.C = s34;
                            iArr8[2] = s34;
                            break;
                        case 3:
                            int[] iArr9 = this.k;
                            short s35 = this.D;
                            this.D = (short) (s35 + 1);
                            if (s35 >= bt.jl) {
                                s2 = bt.jl;
                            } else {
                                short s36 = this.D;
                                s2 = s36;
                                this.D = (short) (s36 + 1);
                            }
                            short s37 = s2;
                            this.D = s37;
                            iArr9[3] = s37;
                            break;
                        case 4:
                            int[] iArr10 = this.k;
                            short s38 = this.E;
                            this.E = (short) (s38 + 1);
                            if (s38 >= bt.jn) {
                                s = bt.jn;
                            } else {
                                short s39 = this.E;
                                s = s39;
                                this.E = (short) (s39 + 1);
                            }
                            short s40 = s;
                            this.E = s40;
                            iArr10[4] = s40;
                            break;
                    }
                }
                this.b.aA++;
            } else if (this.b.b != 2 && this.b.b != 518) {
                if (this.b.b == 8 || this.b.b == 516) {
                    switch (this.b.ar.g()) {
                        case 0:
                            int[] iArr11 = this.k;
                            long j3 = this.j - 100 <= 0 ? 0L : this.j - 100;
                            this.j = j3;
                            iArr11[0] = (int) j3;
                            break;
                        case 1:
                            int[] iArr12 = this.k;
                            short s41 = this.B;
                            this.B = (short) (s41 - 1);
                            if (s41 <= 0) {
                                s16 = 0;
                            } else {
                                short s42 = this.B;
                                s16 = s42;
                                this.B = (short) (s42 - 1);
                            }
                            short s43 = s16;
                            this.B = s43;
                            iArr12[1] = s43;
                            break;
                        case 2:
                            int[] iArr13 = this.k;
                            short s44 = this.C;
                            this.C = (short) (s44 - 1);
                            if (s44 <= 0) {
                                s15 = 0;
                            } else {
                                short s45 = this.C;
                                s15 = s45;
                                this.C = (short) (s45 - 1);
                            }
                            short s46 = s15;
                            this.C = s46;
                            iArr13[2] = s46;
                            break;
                        case 3:
                            int[] iArr14 = this.k;
                            short s47 = this.D;
                            this.D = (short) (s47 - 1);
                            if (s47 <= 0) {
                                s14 = 0;
                            } else {
                                short s48 = this.D;
                                s14 = s48;
                                this.D = (short) (s48 - 1);
                            }
                            short s49 = s14;
                            this.D = s49;
                            iArr14[3] = s49;
                            break;
                        case 4:
                            int[] iArr15 = this.k;
                            short s50 = this.E;
                            this.E = (short) (s50 - 1);
                            if (s50 <= 0) {
                                s13 = 0;
                            } else {
                                short s51 = this.E;
                                s13 = s51;
                                this.E = (short) (s51 - 1);
                            }
                            short s52 = s13;
                            this.E = s52;
                            iArr15[4] = s52;
                            break;
                    }
                }
            } else {
                switch (this.b.ar.g()) {
                    case 0:
                        int[] iArr16 = this.k;
                        long j4 = this.j + 100 <= bt.ap ? this.j + 100 : bt.ap;
                        this.j = j4;
                        iArr16[0] = (int) j4;
                        break;
                    case 1:
                        int[] iArr17 = this.k;
                        short s53 = this.B;
                        this.B = (short) (s53 + 1);
                        if (s53 >= bt.jh) {
                            s12 = bt.jh;
                        } else {
                            short s54 = this.B;
                            s12 = s54;
                            this.B = (short) (s54 + 1);
                        }
                        short s55 = s12;
                        this.B = s55;
                        iArr17[1] = s55;
                        break;
                    case 2:
                        int[] iArr18 = this.k;
                        short s56 = this.C;
                        this.C = (short) (s56 + 1);
                        if (s56 >= bt.jj) {
                            s11 = bt.jj;
                        } else {
                            short s57 = this.C;
                            s11 = s57;
                            this.C = (short) (s57 + 1);
                        }
                        short s58 = s11;
                        this.C = s58;
                        iArr18[2] = s58;
                        break;
                    case 3:
                        int[] iArr19 = this.k;
                        short s59 = this.D;
                        this.D = (short) (s59 + 1);
                        if (s59 >= bt.jl) {
                            s10 = bt.jl;
                        } else {
                            short s60 = this.D;
                            s10 = s60;
                            this.D = (short) (s60 + 1);
                        }
                        short s61 = s10;
                        this.D = s61;
                        iArr19[3] = s61;
                        break;
                    case 4:
                        int[] iArr20 = this.k;
                        short s62 = this.E;
                        this.E = (short) (s62 + 1);
                        if (s62 >= bt.jn) {
                            s9 = bt.jn;
                        } else {
                            short s63 = this.E;
                            s9 = s63;
                            this.E = (short) (s63 + 1);
                        }
                        short s64 = s9;
                        this.E = s64;
                        iArr20[4] = s64;
                        break;
                }
            }
            if (i == 1073741824 || i == 517) {
                if (this.b.ar.g() == 0) {
                    this.b.a("请输入贡献金额", 2);
                    return;
                }
                return;
            }
            if (i != 268435456) {
                if (i == 536870912) {
                    q();
                    b(true);
                    return;
                }
                return;
            }
            if (this.j == 0 && this.B == 0 && this.C == 0 && this.D == 0 && this.E == 0) {
                this.b.b("请输入贡献基金的数目！");
                return;
            }
            byte[] bArrA = bz.a((short) 4220, bt.ad, this.j, this.B, this.C, this.D, this.E);
            if (bArrA == null) {
                this.b.b("获取上传指令数据错误!");
            } else {
                a.i.a(new w((short) 4220, bArrA));
                this.b.a((String) null);
            }
        }
    }

    public final void n() {
        this.a.a(this.A);
        this.i[0] = bt.iK[0];
        this.i[1] = bt.iM[0];
        this.i[2] = bt.iL[0];
        this.x = new int[3][4];
        this.y = new int[3][4];
        this.z = new int[3][4];
        this.b.aq.j();
        this.b.aq.a("宝库配置");
        this.b.aq.a(false);
        this.b.ar.a(ao.b(this.A), t.af, (String[]) null, (String[]) null);
        this.b.au.a(new String[]{"确定", "返回"});
        this.b.aq.a(this.b.ar);
        this.b.aq.a(this.b.au);
        this.b.aq.a(t.f, t.g, t.d, t.e);
        this.a.l = (short) 0;
        this.b.j = this.b.k;
        ao aoVar = this.a;
        this.a.k = (short) 114;
        aoVar.j = (short) 114;
    }

    public final void o(int i) throws IOException {
        byte b;
        byte b2;
        byte b3;
        byte b4;
        byte b5;
        byte b6;
        byte b7;
        byte b8;
        if (this.b.aq != null) {
            this.b.aq.b(i);
        }
        if (this.b.aA <= 40) {
            if (i != 2 && i != 518) {
                if (i == 8 || i == 516) {
                    switch (this.b.ar.g()) {
                        case 0:
                            int[] iArr = this.i;
                            byte[] bArr = bt.iK;
                            byte[] bArr2 = bt.iK;
                            byte b9 = bArr2[0];
                            bArr2[0] = (byte) (b9 - 1);
                            if (b9 <= 0) {
                                b4 = 0;
                            } else {
                                byte[] bArr3 = bt.iK;
                                byte b10 = bArr3[0];
                                b4 = b10;
                                bArr3[0] = (byte) (b10 - 1);
                            }
                            byte b11 = b4;
                            bArr[0] = b11;
                            iArr[0] = b11;
                            break;
                        case 1:
                            int[] iArr2 = this.i;
                            int[] iArr3 = bt.iM;
                            int i2 = bt.iM[0] - 10000 <= 0 ? 0 : bt.iM[0] - 10000;
                            iArr3[0] = i2;
                            iArr2[1] = i2;
                            break;
                        case 2:
                            int[] iArr4 = this.i;
                            byte[] bArr4 = bt.iL;
                            byte[] bArr5 = bt.iL;
                            byte b12 = bArr5[0];
                            bArr5[0] = (byte) (b12 - 1);
                            if (b12 <= 0) {
                                b3 = 0;
                            } else {
                                byte[] bArr6 = bt.iL;
                                byte b13 = bArr6[0];
                                b3 = b13;
                                bArr6[0] = (byte) (b13 - 1);
                            }
                            byte b14 = b3;
                            bArr4[0] = b14;
                            iArr4[2] = b14;
                            break;
                    }
                }
            } else {
                switch (this.b.ar.g()) {
                    case 0:
                        int[] iArr5 = this.i;
                        byte[] bArr7 = bt.iK;
                        byte[] bArr8 = bt.iK;
                        byte b15 = bArr8[0];
                        bArr8[0] = (byte) (b15 + 1);
                        if (b15 >= bt.iK[1]) {
                            b2 = bt.iK[1];
                        } else {
                            byte[] bArr9 = bt.iK;
                            byte b16 = bArr9[0];
                            b2 = b16;
                            bArr9[0] = (byte) (b16 + 1);
                        }
                        byte b17 = b2;
                        bArr7[0] = b17;
                        iArr5[0] = b17;
                        break;
                    case 1:
                        int[] iArr6 = this.i;
                        int[] iArr7 = bt.iM;
                        int i3 = bt.iM[0] + 10000 >= bt.iM[1] ? bt.iM[1] : bt.iM[0] + 10000;
                        iArr7[0] = i3;
                        iArr6[1] = i3;
                        break;
                    case 2:
                        int[] iArr8 = this.i;
                        byte[] bArr10 = bt.iL;
                        byte[] bArr11 = bt.iL;
                        byte b18 = bArr11[0];
                        bArr11[0] = (byte) (b18 + 1);
                        if (b18 >= bt.iL[1]) {
                            b = bt.iL[1];
                        } else {
                            byte[] bArr12 = bt.iL;
                            byte b19 = bArr12[0];
                            b = b19;
                            bArr12[0] = (byte) (b19 + 1);
                        }
                        byte b20 = b;
                        bArr10[0] = b20;
                        iArr8[2] = b20;
                        break;
                }
            }
            this.b.aA++;
        } else if (this.b.b != 2 && this.b.b != 518) {
            if (this.b.b == 8 || this.b.b == 516) {
                switch (this.b.ar.g()) {
                    case 0:
                        int[] iArr9 = this.i;
                        byte[] bArr13 = bt.iK;
                        byte[] bArr14 = bt.iK;
                        byte b21 = bArr14[0];
                        bArr14[0] = (byte) (b21 - 1);
                        if (b21 <= 0) {
                            b8 = 0;
                        } else {
                            byte[] bArr15 = bt.iK;
                            byte b22 = bArr15[0];
                            b8 = b22;
                            bArr15[0] = (byte) (b22 - 1);
                        }
                        byte b23 = b8;
                        bArr13[0] = b23;
                        iArr9[0] = b23;
                        break;
                    case 1:
                        int[] iArr10 = this.i;
                        int[] iArr11 = bt.iM;
                        int i4 = bt.iM[0] - 10000 <= 0 ? 0 : bt.iM[0] - 10000;
                        iArr11[0] = i4;
                        iArr10[1] = i4;
                        break;
                    case 2:
                        int[] iArr12 = this.i;
                        byte[] bArr16 = bt.iL;
                        byte[] bArr17 = bt.iL;
                        byte b24 = bArr17[0];
                        bArr17[0] = (byte) (b24 - 1);
                        if (b24 <= 0) {
                            b7 = 0;
                        } else {
                            byte[] bArr18 = bt.iL;
                            byte b25 = bArr18[0];
                            b7 = b25;
                            bArr18[0] = (byte) (b25 - 1);
                        }
                        byte b26 = b7;
                        bArr16[0] = b26;
                        iArr12[2] = b26;
                        break;
                }
            }
        } else {
            switch (this.b.ar.g()) {
                case 0:
                    int[] iArr13 = this.i;
                    byte[] bArr19 = bt.iK;
                    byte[] bArr20 = bt.iK;
                    byte b27 = bArr20[0];
                    bArr20[0] = (byte) (b27 + 1);
                    if (b27 >= bt.iK[1]) {
                        b6 = bt.iK[1];
                    } else {
                        byte[] bArr21 = bt.iK;
                        byte b28 = bArr21[0];
                        b6 = b28;
                        bArr21[0] = (byte) (b28 + 1);
                    }
                    byte b29 = b6;
                    bArr19[0] = b29;
                    iArr13[0] = b29;
                    break;
                case 1:
                    int[] iArr14 = this.i;
                    int[] iArr15 = bt.iM;
                    int i5 = bt.iM[0] + 10000 >= bt.iM[1] ? bt.iM[1] : bt.iM[0] + 10000;
                    iArr15[0] = i5;
                    iArr14[1] = i5;
                    break;
                case 2:
                    int[] iArr16 = this.i;
                    byte[] bArr22 = bt.iL;
                    byte[] bArr23 = bt.iL;
                    byte b30 = bArr23[0];
                    bArr23[0] = (byte) (b30 + 1);
                    if (b30 >= bt.iL[1]) {
                        b5 = bt.iL[1];
                    } else {
                        byte[] bArr24 = bt.iL;
                        byte b31 = bArr24[0];
                        b5 = b31;
                        bArr24[0] = (byte) (b31 + 1);
                    }
                    byte b32 = b5;
                    bArr22[0] = b32;
                    iArr16[2] = b32;
                    break;
            }
        }
        if (i == 1073741824 || i == 517) {
            if (this.b.ar.g() == 0) {
                this.b.a("请输入物品掉率", 2);
                return;
            } else if (this.b.ar.g() == 1) {
                this.b.a("请输入银两奖励", 2);
                return;
            } else {
                if (this.b.ar.g() == 2) {
                    this.b.a("请输入经验加成", 2);
                    return;
                }
                return;
            }
        }
        if (i != 268435456) {
            if (i == 536870912) {
                b(true);
            }
        } else if (bt.iK[1] == 0 && bt.iM[1] == 0 && bt.iL[1] == 0) {
            this.b.b("请输入正确的数目！");
        } else {
            b((byte) 2);
            this.b.a = 0;
        }
    }

    public final void a(Graphics graphics) {
        if (this.b.aq != null) {
            this.b.aq.a(graphics);
            int i = 0;
            while (i < this.b.ar.f()) {
                int iA = ((this.b.ar.a() + this.b.ar.c()) - a.C.b) - 126;
                int iB = this.b.ar.b() + 4 + (i * this.b.ar.e());
                ca.a(graphics, i == 1 ? ao.a(this.b.l, this.i[i]) : new StringBuffer().append(this.i[i]).append("%").toString(), iA, iB, 122);
                int i2 = i;
                if (this.x != null && this.x.length > i2) {
                    this.x[i2][0] = iA;
                    this.x[i2][1] = iB;
                    this.x[i2][2] = 12;
                    this.x[i2][3] = t.j;
                }
                if (this.y != null && this.y.length > i2) {
                    this.y[i2][0] = (iA + 122) - 12;
                    this.y[i2][1] = iB;
                    this.y[i2][2] = 12;
                    this.y[i2][3] = t.j;
                }
                if (this.z != null) {
                    this.z[i2][0] = iA + 12;
                    this.z[i2][1] = iB;
                    this.z[i2][2] = 98;
                    this.z[i2][3] = t.j;
                }
                i++;
            }
        }
    }

    public final int a(int i, int i2, int i3) {
        if (i == 0) {
            for (int i4 = 0; i4 < this.x.length; i4++) {
                if (i2 >= this.x[i4][0] && i2 <= this.x[i4][0] + this.x[i4][2] && i3 >= this.x[i4][1] && i3 <= this.x[i4][1] + this.x[i4][3]) {
                    return 8;
                }
                if (i2 >= this.y[i4][0] && i2 <= this.y[i4][0] + this.y[i4][2] && i3 >= this.y[i4][1] && i3 <= this.y[i4][1] + this.y[i4][3]) {
                    return 2;
                }
                if (i2 >= this.z[i4][0] && i2 <= this.z[i4][0] + this.z[i4][2] && i3 >= this.z[i4][1] && i3 <= this.z[i4][1] + this.z[i4][3]) {
                    return 1073741824;
                }
            }
        }
        return i;
    }

    public final void o() {
        this.a.l = (short) 0;
        this.b.aw = 0;
        ca.l = 0;
        this.b.aq.b();
        this.b.aq.a("帮派宝库");
        this.b.aq.a(true);
        this.b.as.a(new String[]{"宝库一", "宝库二", "宝库三"});
        this.b.as.a((byte) 1);
        this.b.aq.a(t.e <= 240 ? 79 : 120);
        if (this.a.j == 115 || this.a.j == 64) {
            this.a.aq = this.a.aF;
            this.a.ar = this.a.aG;
            this.b.as.a = this.a.aH;
        } else {
            ao aoVar = this.a;
            this.a.ar = 0;
            aoVar.aq = 0;
        }
        int i = (this.b.as.a << 5) + (this.a.ar << 3) + this.a.aq;
        if (bt.iN == null || i >= bt.iN.length) {
            this.b.at.a("没有物品,按3、9键可以上下翻滚此属性描述框", t.i, (byte) 1);
        } else {
            this.b.at.a(bt.ja[i], t.i, (byte) 1);
        }
        this.b.au.a("操作");
        this.b.au.a(true);
        this.b.at.a((byte) 1);
        this.b.aq.a(this.b.as);
        this.b.aq.a(this.b.at);
        this.b.aq.a(this.b.au);
        this.b.aq.a(t.f, t.g, t.d, t.e);
        this.b.j = this.b.k;
        ao aoVar2 = this.a;
        this.a.k = (short) 115;
        aoVar2.j = (short) 115;
    }

    public final void p() {
        int i = (this.b.as.a << 5) + (this.a.ar << 3) + this.a.aq;
        if (bt.iN == null || i >= bt.iN.length) {
            this.b.at.a("没有物品，按3、9键可以上下翻滚此属性描述框", t.i, (byte) 1);
        } else {
            this.b.at.a(bt.ja[i], t.i, (byte) 1);
        }
        this.b.at.a((byte) 1);
        ca.l = 0;
    }

    public final void p(int i) throws IOException {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = (this.b.as.a << 5) + (this.a.ar << 3) + this.a.aq;
        if (this.a.l == 0) {
            this.a.a(bt.iR);
            if (this.b.aq != null) {
                this.b.aq.b(i);
            }
            if (i == 268435456 || i == 1073741824 || i == 517) {
                if (bt.iN == null || i6 >= bt.iN.length) {
                    return;
                }
                ca.a(this.a.au[(this.a.ar << 3) + this.a.aq][0] - 17, this.a.au[(this.a.ar << 3) + this.a.aq][1] + 17, new String[]{"查看", "取出", "丢弃", "整理"}, false);
                this.a.l = (short) 1;
                return;
            }
            if (i == 1024 || i == 2048) {
                p();
                return;
            }
            if (i == 8 || i == 516) {
                ao aoVar = this.a;
                if (this.a.aq <= 0) {
                    i2 = 7;
                } else {
                    ao aoVar2 = this.a;
                    int i7 = aoVar2.aq - 1;
                    i2 = i7;
                    aoVar2.aq = i7;
                }
                aoVar.aq = i2;
                p();
                return;
            }
            if (i == 2 || i == 518) {
                ao aoVar3 = this.a;
                if (this.a.aq >= 7) {
                    i3 = 0;
                } else {
                    ao aoVar4 = this.a;
                    int i8 = aoVar4.aq + 1;
                    i3 = i8;
                    aoVar4.aq = i8;
                }
                aoVar3.aq = i3;
                p();
                return;
            }
            if (i == 1 || i == 514) {
                ao aoVar5 = this.a;
                if (this.a.ar <= 0) {
                    i4 = 3;
                } else {
                    ao aoVar6 = this.a;
                    int i9 = aoVar6.ar - 1;
                    i4 = i9;
                    aoVar6.ar = i9;
                }
                aoVar5.ar = i4;
                p();
                return;
            }
            if (i != 4 && i != 520) {
                if (i == 536870912) {
                    this.a.am = null;
                    b(true);
                }
                return;
            }
            ao aoVar7 = this.a;
            if (this.a.ar >= 3) {
                i5 = 0;
            } else {
                ao aoVar8 = this.a;
                int i10 = aoVar8.ar + 1;
                i5 = i10;
                aoVar8.ar = i10;
            }
            aoVar7.ar = i5;
            p();
            return;
        }
        if (this.a.l != 1) {
            if (this.a.l == 2) {
                if (this.b.aq != null) {
                    this.b.aq.b(i);
                }
                if (i == 536870912) {
                    o();
                    return;
                }
                return;
            }
            if (this.a.l == 3 || this.a.l == 6) {
                this.a.b(i);
                if (i != 268435456 && i != 1073741824 && i != 517) {
                    if (i == 536870912) {
                        this.a.l = (short) 1;
                        return;
                    }
                    return;
                }
                if (bt.iN == null || i6 >= bt.iN.length || bt.iQ[i6] <= 0) {
                    return;
                }
                ca.h = 0;
                if (this.a.l == 3) {
                    ca.h = 0;
                    String str = bt.iO[i6];
                    this.a.at = new StringBuffer().append("您确定取出").append((ca.a(str) != -1 ? ca.a(str) : 15138723) != 15138723 ? str.substring(3, str.length()) : str).append("X").append(this.a.ag).append("？").toString();
                    this.a.l = (short) 5;
                    return;
                }
                ca.h = 0;
                String str2 = bt.iO[i6];
                this.a.at = new StringBuffer().append("您确定丢弃").append((ca.a(str2) != -1 ? ca.a(str2) : 15138723) != 15138723 ? str2.substring(3, str2.length()) : str2).append("X").append(this.a.ag).append("？").toString();
                this.a.l = (short) 4;
                return;
            }
            if (this.a.l == 4) {
                if (i != 268435456 && i != 1073741824 && i != 517) {
                    if (i == 536870912) {
                        ca.h = 0;
                        this.a.l = (short) 0;
                        return;
                    }
                    return;
                }
                if (bt.iQ[i6] > 1) {
                    c((byte) this.a.ag);
                } else {
                    c(bt.iQ[i6]);
                }
                this.a.l = (short) 0;
                ca.h = 0;
                return;
            }
            if (this.a.l == 5) {
                if (i != 268435456 && i != 1073741824 && i != 517) {
                    if (i == 536870912) {
                        ca.h = 0;
                        this.a.l = (short) 0;
                        return;
                    }
                    return;
                }
                if (bt.iQ[i6] > 1) {
                    d((byte) this.a.ag);
                } else {
                    d(bt.iQ[i6]);
                }
                ca.h = 0;
                this.a.l = (short) 0;
                return;
            }
            return;
        }
        ca.b(i);
        if (i != 268435456 && i != 517 && i != 1073741824) {
            if (i == 536870912) {
                this.a.l = (short) 0;
                return;
            }
            return;
        }
        if (bt.iN == null || i6 >= bt.iN.length || bt.iQ[i6] <= 0) {
            return;
        }
        switch (ca.o) {
            case 0:
                if (bt.a(bt.iP[i6])) {
                    bt.ko = bt.iN[i6];
                    bt.kp = bt.iO[i6];
                    bt.kq = bt.iO[i6];
                    bt.ks = bt.iS[i6];
                    bt.kt = bt.iT[i6];
                    bt.ku = bt.iU[i6];
                    bt.kv = bt.iV[i6];
                    bt.kw = bt.iW[i6];
                    bt.kx = bt.iX[i6];
                    if (bt.jb[i6] != null) {
                        int length = (byte) bt.jb[i6].length;
                        if (length > 0) {
                            bt.kr = new short[length];
                            byte b = 0;
                            while (true) {
                                byte b2 = b;
                                if (b2 < length) {
                                    bt.kr[b2] = bt.jb[i6][b2];
                                    b = (byte) (b2 + 1);
                                }
                            }
                        }
                    } else {
                        bt.kr = null;
                    }
                    bt.ky = bt.iY[i6];
                    bt.kz = (byte) -1;
                    bt.kA = bt.ja[i6];
                    this.a.O.a(0, this.a.k, -1);
                } else {
                    this.b.aq.j();
                    this.b.aq.b();
                    this.b.aq.a("宝物详情");
                    if (bt.ja != null && i6 < bt.ja.length && bt.ja[i6] != null) {
                        this.b.at.a(new StringBuffer().append(bt.iO[i6]).append("：\t").append(bt.ja[i6]).toString(), t.i, (byte) 1);
                    }
                    this.b.aq.a(this.b.at);
                    this.b.aq.a(t.f, t.g, t.d, t.e);
                    this.a.l = (short) 2;
                }
                this.a.aF = this.a.aq;
                this.a.aG = this.a.ar;
                this.a.aH = this.b.as.a;
                break;
            case 1:
                if (bt.iQ[i6] <= 1) {
                    ca.h = 0;
                    String str3 = bt.iO[i6];
                    this.a.at = new StringBuffer().append("您确定取出").append((ca.a(str3) != -1 ? ca.a(str3) : 15138723) != 15138723 ? str3.substring(3, str3.length()) : str3).append("X").append((int) bt.iQ[i6]).append("？").toString();
                    this.a.l = (short) 5;
                    break;
                } else {
                    this.a.a(bt.iQ[i6]);
                    this.a.l = (short) 3;
                    break;
                }
            case 2:
                if (bt.iQ[i6] <= 1) {
                    ca.h = 0;
                    String str4 = bt.iO[i6];
                    this.a.at = new StringBuffer().append("您确定丢弃").append((ca.a(str4) != -1 ? ca.a(str4) : 15138723) != 15138723 ? str4.substring(3, str4.length()) : str4).append("X").append((int) bt.iQ[i6]).append("？").toString();
                    this.a.l = (short) 4;
                    break;
                } else {
                    this.a.a(bt.iQ[i6]);
                    this.a.l = (short) 6;
                    break;
                }
            case 3:
                byte[] bArrC = bz.C((short) 4366, bt.ad);
                if (bArrC != null) {
                    a.i.a(new w((short) 4366, bArrC));
                    this.a.e.a((String) null);
                } else {
                    this.a.e.b("获取上传指令数据错误!");
                }
                this.a.l = (short) 0;
                break;
        }
    }

    private void c(byte b) throws IOException {
        byte[] bArrB = bz.b((short) 4246, bt.iN[(this.b.as.a << 5) + (this.a.ar << 3) + this.a.aq], b, bt.ad);
        if (bArrB == null) {
            this.a.e.b("获取上传指令数据错误!");
        } else {
            a.i.a(new w((short) 4246, bArrB));
            this.a.e.a((String) null);
        }
    }

    public final void b(Graphics graphics) {
        if (this.b.aq != null) {
            int i = t.e <= 240 ? 79 : 120;
            this.b.aq.a(graphics);
            ca.a(graphics, this.b.aq.a + 5, this.b.aq.b + 29 + this.b.as.b, this.b.aq.c - 11, i, 1);
            ca.a(graphics);
            int i2 = ((this.b.aq.c - 11) - (ao.x.b << 3)) / 9;
            int i3 = (((t.e <= 240 ? 79 : 120) - 6) - (ao.x.b << 2)) / 5;
            int i4 = this.b.aq.a + 8 + i2;
            int i5 = this.b.aq.b + 33 + this.b.as.b + i3;
            for (int i6 = 0; i6 < 32; i6++) {
                a.f.a(graphics, ao.x, (int[]) null, (aj) null, 0, 0, ((i6 % 8) * (ao.x.b + i2)) + i4, ((i6 / 8) * (ao.x.b + i3)) + i5, 0, 0);
                this.a.a(i6, ((i6 % 8) * (ao.x.b + i2)) + i4, ((i6 / 8) * (ao.x.b + i3)) + i5, ao.x.b, ao.x.c);
            }
            int i7 = 0;
            ca.d(graphics, i4 + (this.a.aq * (ao.x.b + i2)), i5 + (this.a.ar * (ao.x.b + i3)), 17, 17);
            if (bt.iR != null) {
                int i8 = this.b.as.a << 5;
                while (true) {
                    if (i8 >= (bt.iR.length > ((this.b.as.a + 1) << 5) ? (this.b.as.a + 1) << 5 : bt.iR.length)) {
                        break;
                    }
                    int i9 = i8 % 32;
                    a.f.a(graphics, ao.b(bt.iR[i8]), (int[]) null, (aj) null, 0, 0, ((i9 % 8) * (ao.x.b + i2)) + i4 + 1, ((i9 / 8) * (ao.x.b + i3)) + i5 + 1, 0, 0);
                    if (bt.iQ[i8] > 9) {
                        a.f.a(graphics, a.n, (int[]) null, bt.iQ[i8] / 10, 0, 0, 10 + ((i9 % 8) * (ao.x.b + i2)) + i4, ((i9 / 8) * (ao.x.b + i3)) + i5 + 12, 0, 0);
                        a.f.a(graphics, a.n, (int[]) null, bt.iQ[i8] % 10, 0, 0, 14 + ((i9 % 8) * (ao.x.b + i2)) + i4, ((i9 / 8) * (ao.x.b + i3)) + i5 + 12, 0, 0);
                    } else if (bt.iQ[i8] > 1) {
                        a.f.a(graphics, a.n, (int[]) null, bt.iQ[i8] % 10, 0, 0, 14 + ((i9 % 8) * (ao.x.b + i2)) + i4, ((i9 / 8) * (ao.x.b + i3)) + i5 + 12, 0, 0);
                    }
                    if (i8 == (this.a.ar << 3) + this.a.aq + (32 * this.b.as.a)) {
                        i7 = i8;
                    }
                    i8++;
                }
                if (i7 >= 0 && i7 < bt.iR.length && i7 == (this.a.ar << 3) + this.a.aq + (32 * this.b.as.a)) {
                    ca.a(graphics, new StringBuffer().append(bt.iO[i7]).append("X").append((int) bt.iQ[i7]).toString(), bt.iZ[i7], i4 + (this.a.aq * (ao.x.b + i2)) + (ao.x.b / 2), i5 + (this.a.ar * (ao.x.b + i3)) + (ao.x.b / 2));
                } else if ((this.b.as.a << 5) + (this.a.ar << 3) + this.a.aq >= bt.iJ) {
                    ca.a(graphics, "未开启", -1L, i4 + (this.a.aq * (ao.x.b + i2)) + (ao.x.b / 2), i5 + (this.a.ar * (ao.x.b + i3)) + (ao.x.b / 2));
                }
            }
        }
        if (this.a.l == 1) {
            ca.c(graphics);
            return;
        }
        if (this.a.l == 2) {
            if (this.b.aq != null) {
                this.b.aq.a(graphics);
            }
        } else if (this.a.l == 3 || this.a.l == 6) {
            this.a.a(graphics, "数量");
        } else if (this.a.l == 5 || this.a.l == 4) {
            ca.a(graphics, this.a.at, new String[]{"确定", "取消"});
        }
    }

    private void d(byte b) throws IOException {
        byte[] bArrB = bz.b((short) 4245, bt.iN[(this.b.as.a << 5) + (this.a.ar << 3) + this.a.aq], b, bt.ad);
        if (bArrB == null) {
            this.a.e.b("获取上传指令数据错误!");
        } else {
            a.i.a(new w((short) 4245, bArrB));
            this.a.e.a((String) null);
        }
    }

    public final void q() {
        this.j = 0L;
        this.B = (short) 0;
        this.C = (short) 0;
        this.D = (short) 0;
        this.E = (short) 0;
    }

    public final void c(Graphics graphics) {
        if (this.a.l != 0 || this.b.aq == null) {
            return;
        }
        ca.a(graphics, a.L.a, a.L.b, this.b.aq.a + 5, (this.b.aq.b + this.b.aq.d) - 53, this.b.aq.c - 10, a.L.c);
        this.b.aq.a(graphics);
        int i = 0;
        while (i < this.b.ar.f()) {
            int iA = ((this.b.ar.a() + this.b.ar.c()) - a.C.b) - 130;
            int iB = this.b.ar.b() + 4 + (i * this.b.ar.e());
            ca.a(graphics, i == 0 ? ao.a(this.b.l, this.j) : new StringBuffer().append("").append(this.k[i]).toString(), iA, iB, 124);
            int i2 = i;
            if (this.l != null && this.l.length > i2) {
                this.l[i2][0] = iA;
                this.l[i2][1] = iB;
                this.l[i2][2] = 12;
                this.l[i2][3] = t.j;
            }
            if (this.m != null && this.m.length > i2) {
                this.m[i2][0] = (iA + 124) - 12;
                this.m[i2][1] = iB;
                this.m[i2][2] = 12;
                this.m[i2][3] = t.j;
            }
            if (this.n != null && i2 == 0) {
                this.n[0] = iA + 12;
                this.n[1] = iB;
                this.n[2] = 100;
                this.n[3] = t.j;
            }
            i++;
        }
        ca.a(graphics, new StringBuffer().append("得到功勋：").append(((((this.j + (this.B * bt.jg)) + (this.C * bt.ji)) + (this.D * bt.jk)) + (this.E * bt.jm)) / 300).toString(), this.b.aq.a + (this.b.aq.c / 2), ((this.b.aq.b + this.b.aq.d) - 51) + ((a.M.a.getHeight() - t.j) / 2), 17, 16776666, 0);
    }

    public final void r() throws IOException {
        byte[] bArrS = bz.s((short) 4236, bt.ad);
        if (bArrS == null) {
            this.b.b("获取上传指令数据错误!");
        } else {
            a.i.a(new w((short) 4236, bArrS));
            this.b.a((String) null);
        }
    }

    public final void q(int i) {
        byte[] bArrK = bz.k(i == 0 ? (short) 4230 : (short) 4232, bt.ad, bt.gQ);
        if (bArrK == null) {
            this.b.b("获取上传指令数据错误!");
        } else {
            a.i.a(new w(i == 0 ? (short) 4230 : (short) 4232, bArrK));
            this.b.a((String) null);
        }
    }

    public final void s() {
        this.b.aq.j();
        this.b.aq.a("区域建设");
        this.b.aq.a(true);
        this.b.as.a(new String[]{"购买", "仓库"});
        this.b.ar.a((Image[]) null, bt.jp, (String[]) null, (String[]) null);
        this.b.at.b(bt.jq == null ? null : bt.jq[this.b.ar.g()], t.i, (byte) 2);
        this.b.at.a((byte) 1);
        this.b.au.a("购买");
        this.b.au.a(true);
        this.b.aq.a(this.b.as);
        this.b.aq.a(this.b.ar);
        this.b.aq.a(this.b.at);
        this.b.aq.a(this.b.au);
        this.b.aq.a(t.f, t.g, t.d, t.e);
        this.a.l = (short) 0;
        this.b.j = this.b.k;
        ao aoVar = this.a;
        this.a.k = (short) 52;
        aoVar.j = (short) 52;
    }

    public final void t() {
        this.b.ar.a((Image[]) null, bt.js, (String[]) null, (String[]) null);
        this.b.at.b(bt.jt == null ? null : bt.jt[this.b.ar.g()], t.i, (byte) 2);
        this.b.at.a((byte) 1);
        this.b.au.a("选择");
        this.b.au.a(true);
        this.a.l = (short) 0;
        this.b.j = this.b.k;
        ao aoVar = this.a;
        this.a.k = (short) 52;
        aoVar.j = (short) 52;
    }

    public final void r(int i) throws IOException {
        if (this.a.l != 0) {
            if (this.a.l == 1) {
                ca.b(i);
                if (i != 268435456 && i != 1073741824 && i != 517) {
                    if (i == 536870912) {
                        this.a.l = (short) 0;
                        return;
                    }
                    return;
                } else {
                    byte[] bArrL = bz.l((short) 4233, bt.ad, bt.jo[this.b.ar.g()]);
                    if (bArrL == null) {
                        this.b.b("获取上传指令数据错误!");
                        return;
                    } else {
                        a.i.a(new w((short) 4233, bArrL));
                        this.b.a((String) null);
                        return;
                    }
                }
            }
            if (this.a.l == 2) {
                ca.b(i);
                if (i != 268435456 && i != 1073741824 && i != 517) {
                    if (i == 536870912) {
                        this.a.l = (short) 0;
                        return;
                    }
                    return;
                } else {
                    if (ca.o == 0) {
                        this.a.a(bt.js[this.b.ar.g()], bt.jr[this.b.ar.g()], bt.ju[this.b.ar.g()], (byte) 0, (byte) 4);
                        return;
                    }
                    if (ca.o == 1) {
                        byte[] bArrY = bz.y((short) 4237, bt.ad, bt.jr[this.b.ar.g()]);
                        if (bArrY == null) {
                            this.b.b("获取上传指令数据错误!");
                            return;
                        } else {
                            a.i.a(new w((short) 4237, bArrY));
                            this.b.a((String) null);
                            return;
                        }
                    }
                    return;
                }
            }
            return;
        }
        if (this.b.aq != null) {
            this.b.aq.b(i);
        }
        if (i == 8 || i == 516 || i == 2 || i == 518) {
            bt.gQ = (short) 1;
            q(this.b.as.a);
            if (this.b.as.a == 0) {
                this.b.au.a("选择");
                this.b.au.a(true);
            } else if (this.b.as.a == 1) {
                this.b.au.a("购买");
                this.b.au.a(true);
            }
        }
        if ((i == 1 || i == 514 || i == 4 || i == 520) && (this.b.as.a != 0 ? bt.jt != null : bt.jq != null)) {
            this.b.at.b(this.b.as.a == 0 ? bt.jq[this.b.ar.g()] : bt.jt[this.b.ar.g()], t.i, (byte) 2);
            this.b.at.a((byte) 1);
        }
        if (i == 268435456 || i == 1073741824 || i == 517) {
            if (this.b.as.a == 0 && bt.jo != null) {
                ca.a(0 + t.f, (2 * t.j) + 11 + (this.b.ar.i() * t.j) + t.g, new String[]{"购买"}, true);
                this.a.l = (short) 1;
                return;
            } else {
                if (this.b.as.a != 1 || bt.jr == null) {
                    return;
                }
                ca.a(0 + t.f, (2 * t.j) + 11 + (this.b.ar.i() * t.j) + t.g, new String[]{"布置", "卖出"}, true);
                this.a.l = (short) 2;
                return;
            }
        }
        if (i == 536870912) {
            bt.I();
            bt.J();
            ao aoVar = this.a;
            this.a.k = (short) 0;
            aoVar.j = (short) 0;
            return;
        }
        if (i != 1024) {
            if (i == 2048) {
                if (bt.gQ <= 1 && bt.gR == 1) {
                    bt.gQ = (short) (bt.gQ + 1);
                    q(this.b.as.a);
                    return;
                } else {
                    if (bt.gQ <= 1 || bt.gR != 1) {
                        return;
                    }
                    bt.gQ = (short) (bt.gQ + 1);
                    q(this.b.as.a);
                    return;
                }
            }
            return;
        }
        if (bt.gQ > 1 && bt.gR == 1) {
            if (bt.gQ - 1 <= 1) {
                bt.gQ = (short) 1;
            } else {
                bt.gQ = (short) (bt.gQ - 1);
            }
            q(this.b.as.a);
            return;
        }
        if (bt.gQ <= 1 || bt.gR != 0) {
            return;
        }
        if (bt.gQ - 1 < 1) {
            bt.gQ = (short) 1;
        } else {
            bt.gQ = (short) (bt.gQ - 1);
        }
        q(this.b.as.a);
    }

    public final void a(String str) {
        byte[] bArrD = bz.d((short) 4864, str, bt.ad, bt.gQ);
        if (bArrD == null) {
            this.b.b("获取上传指令数据错误!");
        } else {
            a.i.a(new w((short) 4864, bArrD));
            this.b.a((String) null);
        }
    }

    public final void a(byte b, String str) throws IOException {
        byte[] bArrA = bz.a((short) 4865, str, b, bt.ad);
        if (bArrA == null) {
            this.b.b("获取上传指令数据错误!");
        } else {
            a.i.a(new w((short) 4865, bArrA));
            this.b.a((String) null);
        }
    }

    public final void u() {
        this.b.aq.j();
        this.b.aq.a("帮派外交");
        this.b.aq.a(false);
        String[] strArr = null;
        int[] iArr = null;
        if (bt.jY != null && bt.jY.length > 0) {
            strArr = new String[bt.jY.length];
            iArr = new int[bt.jY.length];
            for (int i = 0; i < strArr.length; i++) {
                strArr[i] = bt.d(bt.ka[i]);
                if (bt.ka[i] == 2) {
                    iArr[i] = 12845056;
                } else if (bt.ka[i] == 3) {
                    iArr[i] = 16711680;
                } else {
                    iArr[i] = 16776960;
                }
            }
        }
        this.b.ar.a((Image[]) null, bt.jZ, (String[]) null, strArr);
        this.b.ar.a("搜索...");
        this.b.ar.a(iArr);
        this.b.ar.a("帮派搜索", 1);
        this.b.au.a("确定");
        this.b.au.a(true);
        this.b.aq.a(this.b.ar);
        this.b.aq.a(this.b.au);
        this.b.aq.a(t.f, t.g, t.d, t.e);
        ca.l = 0;
        this.a.l = (short) 0;
        this.b.j = this.b.k;
        ao aoVar = this.a;
        this.a.k = (short) 60;
        aoVar.j = (short) 60;
    }

    private static String w(int i) {
        if (i < 0 || bt.jY == null || bt.jY.length == 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        if (bt.kb != null) {
            stringBuffer.append(new StringBuffer().append("对方状态：").append(bt.kb[i] == 0 ? "保护" : bt.kb[i] == 1 ? "和平" : "战争").toString());
            stringBuffer.append('\t');
        }
        if (bt.kc != null) {
            stringBuffer.append(new StringBuffer().append("对方态度：").append(bt.kc[i] == 0 ? "中立" : "敌对").toString());
            stringBuffer.append('\t');
        }
        if (bt.kd != null) {
            stringBuffer.append(new StringBuffer().append("你的态度：").append(bt.kd[i] == 0 ? "中立" : "敌对").toString());
            stringBuffer.append('\t');
        }
        return stringBuffer.toString();
    }

    public final void s(int i) throws IOException {
        if (this.a.l != 0) {
            if (this.a.l == 1) {
                ca.b(i);
                if (i != 268435456 && i != 1073741824 && i != 517) {
                    if (i == 536870912) {
                        this.a.l = (short) 0;
                        return;
                    }
                    return;
                }
                this.b.aw = ca.o;
                if (ca.o == 0) {
                    b(bt.jY[this.b.ar.g() - 1]);
                    return;
                }
                if (ca.o == 1) {
                    ca.a(0, t.j + 11 + (this.b.ar.i() * t.j) + t.g, new String[]{"中立", "敌对"}, true);
                    this.a.l = (short) 2;
                    return;
                } else {
                    if (ca.o == 2) {
                        ca.h = 0;
                        this.a.l = (short) 3;
                        return;
                    }
                    return;
                }
            }
            if (this.a.l != 2) {
                if (this.a.l == 3) {
                    if (i == 268435456 || i == 1073741824 || i == 517) {
                        this.b.a("输入OK确认宣战", 0);
                        return;
                    } else {
                        if (i == 536870912) {
                            this.a.l = (short) 0;
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            ca.b(i);
            if (i != 268435456 && i != 1073741824 && i != 517) {
                if (i == 536870912) {
                    this.a.l = (short) 0;
                    return;
                }
                return;
            } else if (ca.o == 0) {
                a((byte) 1, bt.jY[this.b.ar.g() - 1]);
                return;
            } else {
                if (ca.o == 1) {
                    a((byte) 2, bt.jY[this.b.ar.g() - 1]);
                    return;
                }
                return;
            }
        }
        if (this.b.aq != null) {
            this.b.aq.b(i);
        }
        if (i == 1 || i == 514 || i == 520 || i == 4) {
            this.b.ar.a(this.b.ar.g() == this.b.ar.h() ? "帮派搜索" : w(this.b.ar.g() - 1), 1);
        }
        if (i == 268435456 || i == 1073741824 || i == 517) {
            this.a.aA = this.b.ar.h();
            this.a.aE = this.b.ar.g();
            if (this.b.ar.g() == this.b.ar.h()) {
                this.b.a("请输入要搜索的帮派名称", 0);
                return;
            } else {
                if (bt.jY != null) {
                    ca.a((int) t.f, t.j + 11 + (this.b.ar.i() * t.j) + t.g, new String[]{"查看", "外交", "宣战"}, true);
                    this.a.l = (short) 1;
                    return;
                }
                return;
            }
        }
        if (i == 536870912) {
            ao aoVar = this.a;
            this.a.k = (short) 0;
            aoVar.j = (short) 0;
            return;
        }
        if (i != 1024) {
            if (i == 2048) {
                if (bt.gQ <= 1 && bt.gR == 1) {
                    bt.gQ = (short) (bt.gQ + 1);
                    a(this.o);
                    return;
                } else {
                    if (bt.gQ <= 1 || bt.gR != 1) {
                        return;
                    }
                    bt.gQ = (short) (bt.gQ + 1);
                    a(this.o);
                    return;
                }
            }
            return;
        }
        if (bt.gQ > 1 && bt.gR == 1) {
            if (bt.gQ - 1 <= 1) {
                bt.gQ = (short) 1;
            } else {
                bt.gQ = (short) (bt.gQ - 1);
            }
            a(this.o);
            return;
        }
        if (bt.gQ <= 1 || bt.gR != 0) {
            return;
        }
        if (bt.gQ - 1 < 1) {
            bt.gQ = (short) 1;
        } else {
            bt.gQ = (short) (bt.gQ - 1);
        }
        a(this.o);
    }

    public final void a(String str, byte b) {
        byte[] bArrB = bz.b((short) 4866, str, b, bt.ad);
        if (bArrB == null) {
            this.b.b("获取上传指令数据错误!");
        } else {
            a.i.a(new w((short) 4866, bArrB));
            this.b.a((String) null);
        }
    }

    public final void v() {
        this.a.M();
        if (this.b.b == 8 || this.b.b == 516) {
            ao.h = ao.h - 4 < 0 ? 0 : ao.h - 4;
        } else if (this.b.b == 2 || this.b.b == 518) {
            ao.h = ao.h + 4 > this.a.f.a - t.b ? this.a.f.a - t.b : ao.h + 4;
        } else if (this.b.b == 1 || this.b.b == 514) {
            ao.i = ao.i - 4 < 0 ? 0 : ao.i - 4;
        } else if (this.b.b == 4 || this.b.b == 520) {
            ao.i = ao.i + 4 > this.a.f.b - t.c ? this.a.f.b - t.c : ao.i + 4;
        }
        if (bt.bw != 2 || bt.kj == 0) {
            bt.kj = (short) 0;
            ao.h = this.s;
            ao.i = this.t;
            this.a.l = (short) 0;
            ao aoVar = this.a;
            this.a.k = (short) 0;
            aoVar.j = (short) 0;
            this.b.b = 0;
            this.b.a = 0;
        }
    }

    private void b(String str) throws IOException {
        byte[] bArrO = bz.o((short) 4868, str, bt.ad);
        if (bArrO != null) {
            a.i.a(new w((short) 4868, bArrO));
        } else {
            this.b.b("获取上传指令数据错误!");
        }
    }

    private void C() throws IOException {
        byte[] bArrL = bz.l((short) 4869, bt.ad, bt.gQ);
        if (bArrL == null) {
            this.b.b("获取上传指令数据错误!");
        } else {
            a.i.a(new w((short) 4869, bArrL));
            this.b.a((String) null);
        }
    }

    public final void w() {
        ca.h = 0;
        this.a.l = (short) 0;
        this.b.j = this.b.k;
        ao aoVar = this.a;
        this.a.k = (short) 62;
        aoVar.j = (short) 62;
    }

    public final void t(int i) throws IOException {
        if (this.a.l == 0) {
            if (i == 268435456 || i == 1073741824 || i == 517) {
                byte[] bArrV = bz.v((short) 4871, bt.ad);
                if (bArrV == null) {
                    this.b.b("获取上传指令数据错误!");
                    return;
                } else {
                    a.i.a(new w((short) 4871, bArrV));
                    this.b.a((String) null);
                    return;
                }
            }
            if (i == 536870912) {
                this.a.al = null;
                ao aoVar = this.a;
                this.a.k = (short) 0;
                aoVar.j = (short) 0;
            }
        }
    }

    public final void x() {
        if (bt.kE != null) {
            this.b.aq.j();
            this.b.aq.a("战争捷报");
            this.b.aq.a(false);
            this.b.ar.a((Image[]) null, bt.kE, (String[]) null, (String[]) null);
            this.b.at.b(bt.kF[0], t.i, (byte) 2);
            this.b.at.a((byte) 1);
            this.b.au.a("确定");
            this.b.aq.a(this.b.ar);
            this.b.aq.a(this.b.at);
            this.b.aq.a(this.b.au);
            m mVar = this.b.aq;
            mVar.e = (2 * t.j) + 8;
            int i = mVar.e;
            this.b.aq.a(t.f, t.g, t.d, t.e);
            this.a.l = (short) 0;
            this.b.j = this.b.k;
            ao aoVar = this.a;
            this.a.k = (short) 63;
            aoVar.j = (short) 63;
        }
    }

    public final void u(int i) throws IOException {
        if (this.a.l != 0 || bt.kE == null) {
            return;
        }
        if (this.b.aq != null) {
            this.b.aq.b(i);
        }
        if (i == 1 || i == 514 || i == 520 || i == 4) {
            this.b.at.b(bt.kF[this.b.ar.g()], t.i, (byte) 2);
            this.b.at.a((byte) 1);
        }
        if (i != 268435456 && i != 1073741824 && i != 517) {
            if (i == 536870912) {
                this.a.l = (short) 0;
                ao aoVar = this.a;
                this.a.k = (short) 0;
                aoVar.j = (short) 0;
                return;
            }
            return;
        }
        this.a.aA = this.b.ar.h();
        this.a.aE = this.b.ar.g();
        switch (this.a.aE) {
            case 0:
                this.b.a("请输入警告语（30个字符内）", 0);
                break;
            case 1:
            case 2:
            case 3:
                b((byte) this.b.ar.g(), null);
                break;
        }
    }

    public final void b(byte b, String str) throws IOException {
        byte[] bArrC = bz.c((short) 4872, bt.ad, b, str);
        if (bArrC != null) {
            a.i.a(new w((short) 4872, bArrC));
        } else {
            this.b.b("获取上传指令数据错误!");
        }
    }

    public final void y() {
        this.b.aq.b();
        this.b.aq.a("帮派升级");
        this.b.aq.a(false);
        this.b.at.b(bt.mw == null ? "暂无帮派升级信息" : bt.mw, t.i, (byte) 0);
        this.b.aq.a(this.b.at);
        this.b.au.a("升级");
        this.b.aq.a(this.b.at);
        if (t.c > 220) {
            this.b.aq.a(this.b.au);
        }
        this.b.aq.a(t.f, t.g, t.d, t.e);
        this.a.l = (short) 0;
        this.b.j = this.b.k;
        ao aoVar = this.a;
        this.a.k = (short) 113;
        aoVar.j = (short) 113;
    }

    public final void v(int i) throws IOException {
        if (this.a.l == 0) {
            if (this.b.aq != null) {
                this.b.aq.b(i);
            }
            if (i == 268435456 || i == 1073741824 || i == 517) {
                a((byte) 2);
            } else if (i == 536870912) {
                a(true);
            }
        }
    }

    public final void d(Graphics graphics) {
        if (this.a.l != 0 || this.b.aq == null) {
            return;
        }
        this.b.aq.a(graphics);
    }
}

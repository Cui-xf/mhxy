package defpackage;

import com.yinhan.kjava.main.a;
import java.io.DataInputStream;
import java.io.IOException;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-8105993946875401281/classes.dex */
public final class v {
    public static int[] a;
    public static String b;
    private static String[] j;
    private static String[] k;
    private static int[] o;
    private static String[] p;
    private ao h;
    private a i;
    private static byte l = 0;
    public static String c = "结婚守则：\t1.游戏中未婚状态的一对异性玩家可申请结婚\t2.双方好感度均需达到1000点或以上\t3.双方等级需达到40级或以上\t4.双方需各自支付100万两的结婚申请费用";
    public static byte e = 0;
    public static String f = "离婚守则：\t1.离婚后夫妻双方好感度降低为0\t2.离婚后不可使用夫妻饰物、接取夫妻任务和获得夫妻声望\t3.一方申请离婚，在对方同意离婚后，离婚效果即时生效\t4.一方申请离婚，如对方不进行确认，则离婚效果在申请离婚后72时自动生效";
    public int d = 0;
    private String[] m = {"同意(点击申请结婚)", "拒绝"};
    public int g = 0;
    private String[] n = {"离婚(点击申请离婚)", "取消离婚"};

    public v(ao aoVar, a aVar) {
        this.h = aoVar;
        this.i = aVar;
    }

    public static void a(DataInputStream dataInputStream) throws IOException {
        bt.gQ = dataInputStream.readShort();
        int i = dataInputStream.readShort();
        bt.gR = dataInputStream.readByte();
        if (i <= 0) {
            g();
            return;
        }
        a = new int[i];
        j = new String[i];
        k = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            a[i2] = dataInputStream.readInt();
            j[i2] = dataInputStream.readUTF();
            k[i2] = dataInputStream.readUTF();
        }
    }

    public static void b(DataInputStream dataInputStream) {
        b = dataInputStream.readUTF();
    }

    public static void c(DataInputStream dataInputStream) {
        l = dataInputStream.readByte();
    }

    public static void d(DataInputStream dataInputStream) {
        e = dataInputStream.readByte();
    }

    public static void e(DataInputStream dataInputStream) throws IOException {
        bt.gQ = dataInputStream.readShort();
        int i = dataInputStream.readShort();
        bt.gR = dataInputStream.readByte();
        if (i <= 0) {
            g();
            return;
        }
        o = new int[i];
        p = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            o[i2] = dataInputStream.readInt();
            p[i2] = dataInputStream.readUTF();
        }
    }

    private static void g() {
        a = null;
        j = null;
        k = null;
    }

    public final void a() {
        byte[] bArrM = bz.m((short) 4858, bt.ad, bt.gQ);
        if (bArrM == null) {
            this.i.b("获取上传指令数据错误!");
            return;
        }
        a.i.a(new w((short) 4858, bArrM));
        ao aoVar = this.h;
        this.h.k = (short) 0;
        aoVar.j = (short) 0;
        this.i.a((String) null);
    }

    public final void a(byte b2) {
        byte[] bArrM = bz.m((short) 4860, bt.ad, b2);
        if (bArrM == null) {
            this.i.b("获取上传指令数据错误!");
            return;
        }
        a.i.a(new w((short) 4860, bArrM));
        ao aoVar = this.h;
        this.h.k = (short) 0;
        aoVar.j = (short) 0;
        this.i.a((String) null);
    }

    public final void a(int i) {
        this.i.aq.j();
        this.i.aq.a("求爱宣言");
        this.i.aq.a(false);
        this.i.ar.a((Image[]) null, k, (String[]) null, j);
        this.i.ar.a(i);
        this.i.au.a("查看");
        this.i.au.a(true);
        this.i.aq.a(this.i.ar);
        this.i.aq.a(this.i.au);
        this.i.aq.a(t.f, t.g, t.d, t.e);
        this.h.l = (short) 0;
        this.i.j = this.i.k;
        ao aoVar = this.h;
        this.h.k = (short) 90;
        aoVar.j = (short) 90;
    }

    public final void a(String str, String str2, long j2) throws IOException {
        byte[] bArrA = bz.a((short) 4857, bt.ad, str, str2, j2);
        if (bArrA == null) {
            this.i.b("获取上传指令数据错误!");
            return;
        }
        a.i.a(new w((short) 4857, bArrA));
        ao aoVar = this.h;
        this.h.k = (short) 0;
        aoVar.j = (short) 0;
        this.i.a((String) null);
    }

    public final void a(Graphics graphics) {
        if (this.h.l != 0 && this.h.l != 1) {
            if (this.h.l != 2 || this.i.aq == null) {
                return;
            }
            this.i.aq.a(graphics);
            return;
        }
        if (this.i.aq != null) {
            this.i.aq.a(graphics);
        }
        if (this.h.l == 1) {
            ca.c(graphics);
        }
    }

    public final void b() {
        this.i.aq.j();
        this.i.aq.a("求爱宣言");
        this.i.aq.a(false);
        this.i.at.a(b, t.i, (byte) 2);
        this.i.au.a("确定");
        this.i.aq.a(this.i.at);
        this.i.aq.a(this.i.au);
        this.i.aq.a(t.f, t.g, t.d, t.e);
        this.h.l = (short) 2;
        this.i.j = this.i.k;
        ao aoVar = this.h;
        this.h.k = (short) 90;
        aoVar.j = (short) 90;
    }

    public final void b(byte b2) {
        byte[] bArrN = bz.n((short) 4861, bt.ad, b2);
        if (bArrN == null) {
            this.i.b("获取上传指令数据错误!");
            return;
        }
        a.i.a(new w((short) 4861, bArrN));
        ao aoVar = this.h;
        this.h.k = (short) 0;
        aoVar.j = (short) 0;
        this.i.a((String) null);
    }

    public final void b(int i) {
        if (this.h.l != 0) {
            if (this.h.l != 1) {
                if (this.h.l == 2) {
                    if (this.i.aq != null) {
                        this.i.aq.b(i);
                    }
                    if (i == 268435456 || i == 1073741824 || i == 517 || i == 536870912) {
                        a(this.h.aE);
                        b = null;
                        return;
                    }
                    return;
                }
                return;
            }
            ca.b(i);
            if (i != 268435456 && i != 1073741824 && i != 517) {
                if (i == 536870912) {
                    this.h.l = (short) 0;
                    return;
                }
                return;
            } else {
                if (ca.o == 0) {
                    byte[] bArrA = bz.A((short) 4859, bt.ad, a[this.i.ar.g()]);
                    if (bArrA == null) {
                        this.i.b("获取上传指令数据错误!");
                        return;
                    }
                    a.i.a(new w((short) 4859, bArrA));
                    ao aoVar = this.h;
                    this.h.k = (short) 0;
                    aoVar.j = (short) 0;
                    this.i.a((String) null);
                    return;
                }
                return;
            }
        }
        if (this.i.aq != null) {
            this.i.aq.b(i);
        }
        if (a != null && (i == 268435456 || i == 1073741824 || i == 517)) {
            ca.a(t.f + 80, t.j + 20 + (this.i.ar.i() * t.j) + t.g, new String[]{"查看"}, false);
            this.h.l = (short) 1;
            this.h.aA = this.i.ar.h();
            this.h.aE = this.i.ar.g();
        }
        if (i == 536870912) {
            this.h.l = (short) 0;
            ao aoVar2 = this.h;
            this.h.k = (short) 0;
            aoVar2.j = (short) 0;
            return;
        }
        if (i != 1024) {
            if (i == 2048) {
                if (bt.gQ <= 1 && bt.gR == 1) {
                    bt.gQ = (short) (bt.gQ + 1);
                    a();
                    return;
                } else {
                    if (bt.gQ <= 1 || bt.gR != 1) {
                        return;
                    }
                    bt.gQ = (short) (bt.gQ + 1);
                    a();
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
            a();
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
        a();
    }

    public final void b(Graphics graphics) {
        int i;
        int i2;
        int i3;
        if (this.h.l == 0) {
            if (this.i.aq != null) {
                i2 = this.i.aq.a + 5;
                i = ((this.i.aq.b + this.i.aq.d) - ((t.j * 2) + 16)) - 6;
                ca.a(graphics, i2, i, this.i.aq.c - 11, (t.j * 2) + 16, 1);
                this.i.aq.a(graphics);
            } else {
                i = 0;
                i2 = 0;
            }
            int i4 = 0;
            while (i4 < 2) {
                if (l != 0) {
                    i3 = (this.d == 1 && l == 1) ? 8750469 : 16777215;
                    this.m[0] = l == 1 ? "同意(等待对方确认)" : "同意(对方已确认)";
                } else {
                    this.m[0] = "同意(点击申请结婚)";
                    i3 = 16777215;
                }
                ca.a(graphics, this.m[i4], i2 + 4, i + 5 + ((t.j + 5) * i4), 20, this.d == i4 ? 16711680 : i3, 0);
                i4++;
            }
        }
    }

    public final void c() {
        this.i.d.a();
        this.i.aq.j();
        this.i.aq.a("申请结婚");
        this.i.aq.a(false);
        this.i.at.b(c, t.i, (byte) 2);
        this.i.at.a((byte) 1);
        this.i.aq.a(this.i.at);
        this.i.aq.g = (t.j * 2) + 16;
        this.i.aq.a(t.f, t.g, t.d, t.e);
        this.h.l = (short) 0;
        this.i.j = this.i.k;
        ao aoVar = this.h;
        this.h.k = (short) 91;
        aoVar.j = (short) 91;
    }

    public final void c(int i) {
        if (this.h.l == 0) {
            if (this.i.aq != null) {
                this.i.aq.b(i);
            }
            if (i == 514 || i == 1) {
                this.d = this.d != 0 ? 0 : 1;
                return;
            }
            if (i == 520 || i == 4) {
                this.d = this.d != 1 ? 1 : 0;
                return;
            }
            if (i != 1073741824 && i != 517 && i != 268435456) {
                if (i == 536870912) {
                    this.d = 0;
                    a((byte) 2);
                    this.h.l = (short) 0;
                    ao aoVar = this.h;
                    this.h.k = (short) 0;
                    aoVar.j = (short) 0;
                    return;
                }
                return;
            }
            if (this.d == 0) {
                if (l != 1) {
                    a((byte) 1);
                }
            } else if (this.d == 1) {
                this.d = 0;
                a((byte) 2);
            }
        }
    }

    public final void c(Graphics graphics) {
        int i;
        int i2;
        int i3;
        if (this.h.l == 0) {
            if (this.i.aq != null) {
                i2 = this.i.aq.a + 5;
                i = ((this.i.aq.b + this.i.aq.d) - ((t.j * 2) + 16)) - 6;
                ca.a(graphics, i2, i, this.i.aq.c - 11, (t.j * 2) + 16, 1);
                this.i.aq.a(graphics);
            } else {
                i = 0;
                i2 = 0;
            }
            int i4 = 0;
            while (i4 < 2) {
                if (e != 0) {
                    i3 = (this.g == 1 && e == 1) ? 8750469 : 16777215;
                    this.n[0] = e == 1 ? "离婚(等待对方确认)" : "离婚(对方已确认)";
                } else {
                    this.n[0] = "离婚(点击申请离婚)";
                    i3 = 16777215;
                }
                ca.a(graphics, this.n[i4], i2 + 4, i + 5 + ((t.j + 5) * i4), 20, this.g == i4 ? 16711680 : i3, 0);
                i4++;
            }
        }
    }

    public final void d() {
        this.i.aq.j();
        this.i.aq.a("申请离婚");
        this.i.aq.a(false);
        this.i.at.b(f, t.i, (byte) 2);
        this.i.at.a((byte) 1);
        this.i.aq.a(this.i.at);
        this.i.aq.g = (t.j * 2) + 16;
        this.i.aq.a(t.f, t.g, t.d, t.e);
        this.h.l = (short) 0;
        this.i.j = this.i.k;
        ao aoVar = this.h;
        this.h.k = (short) 92;
        aoVar.j = (short) 92;
    }

    public final void d(int i) {
        if (this.h.l == 0) {
            if (this.i.aq != null) {
                this.i.aq.b(i);
            }
            if (i == 514 || i == 1) {
                this.g = this.g != 0 ? 0 : 1;
                return;
            }
            if (i == 520 || i == 4) {
                this.g = this.g != 1 ? 1 : 0;
                return;
            }
            if (i != 1073741824 && i != 517 && i != 268435456) {
                if (i == 536870912) {
                    this.g = 0;
                    this.h.l = (short) 0;
                    ao aoVar = this.h;
                    this.h.k = (short) 0;
                    aoVar.j = (short) 0;
                    return;
                }
                return;
            }
            if (this.g == 0) {
                if (e != 1) {
                    this.i.a("输入OK确定离婚", 0);
                }
            } else if (this.g == 1) {
                this.g = 0;
                if (e == 1) {
                    b((byte) 2);
                    return;
                }
                this.h.l = (short) 0;
                ao aoVar2 = this.h;
                this.h.k = (short) 0;
                aoVar2.j = (short) 0;
            }
        }
    }

    public final void d(Graphics graphics) {
        if (this.h.l != 0 || this.i.aq == null) {
            return;
        }
        this.i.aq.a(graphics);
    }

    public final void e() {
        byte[] bArrN = bz.n((short) 4862, bt.ad, bt.gQ);
        if (bArrN == null) {
            this.i.b("获取上传指令数据错误!");
            return;
        }
        a.i.a(new w((short) 4862, bArrN));
        ao aoVar = this.h;
        this.h.k = (short) 0;
        aoVar.j = (short) 0;
        this.i.a((String) null);
    }

    public final void e(int i) {
        if (this.h.l == 0) {
            if (this.i.aq != null) {
                this.i.aq.b(i);
            }
            if (o != null && (i == 268435456 || i == 1073741824 || i == 517)) {
                byte[] bArrA = bz.a((short) 4863, bt.ad, (int) bt.t[this.h.af].a, o[this.i.ar.g()], this.h.I.j, this.h.I.k);
                if (bArrA != null) {
                    a.i.a(new w((short) 4863, bArrA));
                    ao aoVar = this.h;
                    this.h.k = (short) 0;
                    aoVar.j = (short) 0;
                    this.i.a((String) null);
                } else {
                    this.i.b("获取上传指令数据错误!");
                }
            }
            if (i == 536870912) {
                this.h.l = (short) 0;
                ao aoVar2 = this.h;
                this.h.k = (short) 0;
                aoVar2.j = (short) 0;
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
        }
    }

    public final void f() {
        this.i.aq.j();
        this.i.aq.a("新人礼堂");
        this.i.aq.a(false);
        this.i.ar.a((Image[]) null, p, (String[]) null, (String[]) null);
        this.i.au.a("进入");
        this.i.au.a(true);
        this.i.aq.a(this.i.ar);
        this.i.aq.a(this.i.au);
        this.i.aq.a(t.f, t.g, t.d, t.e);
        this.h.l = (short) 0;
        this.i.j = this.i.k;
        ao aoVar = this.h;
        this.h.k = (short) 93;
        aoVar.j = (short) 93;
    }
}

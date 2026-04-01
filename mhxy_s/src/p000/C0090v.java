package p000;

import com.yinhan.kjava.main.RunnableC0066a;
import java.io.DataInputStream;
import java.io.IOException;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* renamed from: v */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-5080095226433994817/classes.dex */
public final class C0090v {

    /* renamed from: a */
    public static int[] f2547a;

    /* renamed from: b */
    public static String f2548b;

    /* renamed from: j */
    private static String[] f2552j;

    /* renamed from: k */
    private static String[] f2553k;

    /* renamed from: o */
    private static int[] f2555o;

    /* renamed from: p */
    private static String[] f2556p;

    /* renamed from: h */
    private C0015ao f2559h;

    /* renamed from: i */
    private RunnableC0066a f2560i;

    /* renamed from: l */
    private static byte f2554l = 0;

    /* renamed from: c */
    public static String f2549c = "结婚守则：\t1.游戏中未婚状态的一对异性玩家可申请结婚\t2.双方好感度均需达到1000点或以上\t3.双方等级需达到40级或以上\t4.双方需各自支付100万两的结婚申请费用";

    /* renamed from: e */
    public static byte f2550e = 0;

    /* renamed from: f */
    public static String f2551f = "离婚守则：\t1.离婚后夫妻双方好感度降低为0\t2.离婚后不可使用夫妻饰物、接取夫妻任务和获得夫妻声望\t3.一方申请离婚，在对方同意离婚后，离婚效果即时生效\t4.一方申请离婚，如对方不进行确认，则离婚效果在申请离婚后72时自动生效";

    /* renamed from: d */
    public int f2557d = 0;

    /* renamed from: m */
    private String[] f2561m = {"同意(点击申请结婚)", "拒绝"};

    /* renamed from: g */
    public int f2558g = 0;

    /* renamed from: n */
    private String[] f2562n = {"离婚(点击申请离婚)", "取消离婚"};

    public C0090v(C0015ao c0015ao, RunnableC0066a runnableC0066a) {
        this.f2559h = c0015ao;
        this.f2560i = runnableC0066a;
    }

    /* renamed from: a */
    public static void m1685a(DataInputStream dataInputStream) throws IOException {
        C0047bt.f1170gQ = dataInputStream.readShort();
        int i = dataInputStream.readShort();
        C0047bt.f1171gR = dataInputStream.readByte();
        if (i <= 0) {
            m1690g();
            return;
        }
        f2547a = new int[i];
        f2552j = new String[i];
        f2553k = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            f2547a[i2] = dataInputStream.readInt();
            f2552j[i2] = dataInputStream.readUTF();
            f2553k[i2] = dataInputStream.readUTF();
        }
    }

    /* renamed from: b */
    public static void m1686b(DataInputStream dataInputStream) {
        f2548b = dataInputStream.readUTF();
    }

    /* renamed from: c */
    public static void m1687c(DataInputStream dataInputStream) {
        f2554l = dataInputStream.readByte();
    }

    /* renamed from: d */
    public static void m1688d(DataInputStream dataInputStream) {
        f2550e = dataInputStream.readByte();
    }

    /* renamed from: e */
    public static void m1689e(DataInputStream dataInputStream) throws IOException {
        C0047bt.f1170gQ = dataInputStream.readShort();
        int i = dataInputStream.readShort();
        C0047bt.f1171gR = dataInputStream.readByte();
        if (i <= 0) {
            m1690g();
            return;
        }
        f2555o = new int[i];
        f2556p = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            f2555o[i2] = dataInputStream.readInt();
            f2556p[i2] = dataInputStream.readUTF();
        }
    }

    /* renamed from: g */
    private static void m1690g() {
        f2547a = null;
        f2552j = null;
        f2553k = null;
    }

    /* renamed from: a */
    public final void m1691a() throws IOException {
        byte[] bArrM1217m = C0053bz.m1217m((short) 4858, C0047bt.f865ad, C0047bt.f1170gQ);
        if (bArrM1217m == null) {
            this.f2560i.m1442b("获取上传指令数据错误!");
            return;
        }
        RunnableC0066a.f2115i.m600a(new C0091w((short) 4858, bArrM1217m));
        C0015ao c0015ao = this.f2559h;
        this.f2559h.f358k = (short) 0;
        c0015ao.f357j = (short) 0;
        this.f2560i.m1434a((String) null);
    }

    /* renamed from: a */
    public final void m1692a(byte b) throws IOException {
        byte[] bArrM1213m = C0053bz.m1213m((short) 4860, C0047bt.f865ad, b);
        if (bArrM1213m == null) {
            this.f2560i.m1442b("获取上传指令数据错误!");
            return;
        }
        RunnableC0066a.f2115i.m600a(new C0091w((short) 4860, bArrM1213m));
        C0015ao c0015ao = this.f2559h;
        this.f2559h.f358k = (short) 0;
        c0015ao.f357j = (short) 0;
        this.f2560i.m1434a((String) null);
    }

    /* renamed from: a */
    public final void m1693a(int i) {
        this.f2560i.f2149aq.mo71j();
        this.f2560i.f2149aq.m1601a("求爱宣言");
        this.f2560i.f2149aq.m1603a(false);
        this.f2560i.f2150ar.m1266a((Image[]) null, f2553k, (String[]) null, f2552j);
        this.f2560i.f2150ar.m1256a(i);
        this.f2560i.f2153au.m1590a("查看");
        this.f2560i.f2153au.m1592a(true);
        this.f2560i.f2149aq.m1600a(this.f2560i.f2150ar);
        this.f2560i.f2149aq.m1600a(this.f2560i.f2153au);
        this.f2560i.f2149aq.m1598a(C0088t.f2520f, C0088t.f2521g, C0088t.f2518d, C0088t.f2519e);
        this.f2559h.f359l = (short) 0;
        this.f2560i.f2216j = this.f2560i.f2217k;
        C0015ao c0015ao = this.f2559h;
        this.f2559h.f358k = (short) 90;
        c0015ao.f357j = (short) 90;
    }

    /* renamed from: a */
    public final void m1694a(String str, String str2, long j) {
        byte[] bArrM1098a = C0053bz.m1098a((short) 4857, C0047bt.f865ad, str, str2, j);
        if (bArrM1098a == null) {
            this.f2560i.m1442b("获取上传指令数据错误!");
            return;
        }
        RunnableC0066a.f2115i.m600a(new C0091w((short) 4857, bArrM1098a));
        C0015ao c0015ao = this.f2559h;
        this.f2559h.f358k = (short) 0;
        c0015ao.f357j = (short) 0;
        this.f2560i.m1434a((String) null);
    }

    /* renamed from: a */
    public final void m1695a(Graphics graphics) {
        if (this.f2559h.f359l != 0 && this.f2559h.f359l != 1) {
            if (this.f2559h.f359l != 2 || this.f2560i.f2149aq == null) {
                return;
            }
            this.f2560i.f2149aq.m1602a(graphics);
            return;
        }
        if (this.f2560i.f2149aq != null) {
            this.f2560i.f2149aq.m1602a(graphics);
        }
        if (this.f2559h.f359l == 1) {
            C0055ca.m1324c(graphics);
        }
    }

    /* renamed from: b */
    public final void m1696b() {
        this.f2560i.f2149aq.mo71j();
        this.f2560i.f2149aq.m1601a("求爱宣言");
        this.f2560i.f2149aq.m1603a(false);
        this.f2560i.f2152at.m77a(f2548b, C0088t.f2523i, (byte) 2);
        this.f2560i.f2153au.m1590a("确定");
        this.f2560i.f2149aq.m1600a(this.f2560i.f2152at);
        this.f2560i.f2149aq.m1600a(this.f2560i.f2153au);
        this.f2560i.f2149aq.m1598a(C0088t.f2520f, C0088t.f2521g, C0088t.f2518d, C0088t.f2519e);
        this.f2559h.f359l = (short) 2;
        this.f2560i.f2216j = this.f2560i.f2217k;
        C0015ao c0015ao = this.f2559h;
        this.f2559h.f358k = (short) 90;
        c0015ao.f357j = (short) 90;
    }

    /* renamed from: b */
    public final void m1697b(byte b) {
        byte[] bArrM1219n = C0053bz.m1219n((short) 4861, C0047bt.f865ad, b);
        if (bArrM1219n == null) {
            this.f2560i.m1442b("获取上传指令数据错误!");
            return;
        }
        RunnableC0066a.f2115i.m600a(new C0091w((short) 4861, bArrM1219n));
        C0015ao c0015ao = this.f2559h;
        this.f2559h.f358k = (short) 0;
        c0015ao.f357j = (short) 0;
        this.f2560i.m1434a((String) null);
    }

    /* renamed from: b */
    public final void m1698b(int i) throws IOException {
        if (this.f2559h.f359l != 0) {
            if (this.f2559h.f359l != 1) {
                if (this.f2559h.f359l == 2) {
                    if (this.f2560i.f2149aq != null) {
                        this.f2560i.f2149aq.mo70b(i);
                    }
                    if (i == 268435456 || i == 1073741824 || i == 517 || i == 536870912) {
                        m1693a(this.f2559h.f200aE);
                        f2548b = null;
                        return;
                    }
                    return;
                }
                return;
            }
            C0055ca.m1317b(i);
            if (i != 268435456 && i != 1073741824 && i != 517) {
                if (i == 536870912) {
                    this.f2559h.f359l = (short) 0;
                    return;
                }
                return;
            } else {
                if (C0055ca.f1895o == 0) {
                    byte[] bArrM1023A = C0053bz.m1023A((short) 4859, C0047bt.f865ad, f2547a[this.f2560i.f2150ar.m1275g()]);
                    if (bArrM1023A == null) {
                        this.f2560i.m1442b("获取上传指令数据错误!");
                        return;
                    }
                    RunnableC0066a.f2115i.m600a(new C0091w((short) 4859, bArrM1023A));
                    C0015ao c0015ao = this.f2559h;
                    this.f2559h.f358k = (short) 0;
                    c0015ao.f357j = (short) 0;
                    this.f2560i.m1434a((String) null);
                    return;
                }
                return;
            }
        }
        if (this.f2560i.f2149aq != null) {
            this.f2560i.f2149aq.mo70b(i);
        }
        if (f2547a != null && (i == 268435456 || i == 1073741824 || i == 517)) {
            C0055ca.m1285a(C0088t.f2520f + 80, C0088t.f2524j + 20 + (this.f2560i.f2150ar.m1277i() * C0088t.f2524j) + C0088t.f2521g, new String[]{"查看"}, false);
            this.f2559h.f359l = (short) 1;
            this.f2559h.f196aA = this.f2560i.f2150ar.m1276h();
            this.f2559h.f200aE = this.f2560i.f2150ar.m1275g();
        }
        if (i == 536870912) {
            this.f2559h.f359l = (short) 0;
            C0015ao c0015ao2 = this.f2559h;
            this.f2559h.f358k = (short) 0;
            c0015ao2.f357j = (short) 0;
            return;
        }
        if (i != 1024) {
            if (i == 2048) {
                if (C0047bt.f1170gQ <= 1 && C0047bt.f1171gR == 1) {
                    C0047bt.f1170gQ = (short) (C0047bt.f1170gQ + 1);
                    m1691a();
                    return;
                } else {
                    if (C0047bt.f1170gQ <= 1 || C0047bt.f1171gR != 1) {
                        return;
                    }
                    C0047bt.f1170gQ = (short) (C0047bt.f1170gQ + 1);
                    m1691a();
                    return;
                }
            }
            return;
        }
        if (C0047bt.f1170gQ > 1 && C0047bt.f1171gR == 1) {
            if (C0047bt.f1170gQ - 1 <= 1) {
                C0047bt.f1170gQ = (short) 1;
            } else {
                C0047bt.f1170gQ = (short) (C0047bt.f1170gQ - 1);
            }
            m1691a();
            return;
        }
        if (C0047bt.f1170gQ <= 1 || C0047bt.f1171gR != 0) {
            return;
        }
        if (C0047bt.f1170gQ - 1 < 1) {
            C0047bt.f1170gQ = (short) 1;
        } else {
            C0047bt.f1170gQ = (short) (C0047bt.f1170gQ - 1);
        }
        m1691a();
    }

    /* renamed from: b */
    public final void m1699b(Graphics graphics) {
        int i;
        int i2;
        int i3;
        if (this.f2559h.f359l == 0) {
            if (this.f2560i.f2149aq != null) {
                i2 = this.f2560i.f2149aq.f2328a + 5;
                i = ((this.f2560i.f2149aq.f2329b + this.f2560i.f2149aq.f2331d) - ((C0088t.f2524j * 2) + 16)) - 6;
                C0055ca.m1292a(graphics, i2, i, this.f2560i.f2149aq.f2330c - 11, (C0088t.f2524j * 2) + 16, 1);
                this.f2560i.f2149aq.m1602a(graphics);
            } else {
                i = 0;
                i2 = 0;
            }
            int i4 = 0;
            while (i4 < 2) {
                if (f2554l != 0) {
                    i3 = (this.f2557d == 1 && f2554l == 1) ? 8750469 : 16777215;
                    this.f2561m[0] = f2554l == 1 ? "同意(等待对方确认)" : "同意(对方已确认)";
                } else {
                    this.f2561m[0] = "同意(点击申请结婚)";
                    i3 = 16777215;
                }
                C0055ca.m1298a(graphics, this.f2561m[i4], i2 + 4, i + 5 + ((C0088t.f2524j + 5) * i4), 20, this.f2557d == i4 ? 16711680 : i3, 0);
                i4++;
            }
        }
    }

    /* renamed from: c */
    public final void m1700c() {
        this.f2560i.f2213d.m1377a();
        this.f2560i.f2149aq.mo71j();
        this.f2560i.f2149aq.m1601a("申请结婚");
        this.f2560i.f2149aq.m1603a(false);
        this.f2560i.f2152at.m79b(f2549c, C0088t.f2523i, (byte) 2);
        this.f2560i.f2152at.m75a((byte) 1);
        this.f2560i.f2149aq.m1600a(this.f2560i.f2152at);
        this.f2560i.f2149aq.f2334g = (C0088t.f2524j * 2) + 16;
        this.f2560i.f2149aq.m1598a(C0088t.f2520f, C0088t.f2521g, C0088t.f2518d, C0088t.f2519e);
        this.f2559h.f359l = (short) 0;
        this.f2560i.f2216j = this.f2560i.f2217k;
        C0015ao c0015ao = this.f2559h;
        this.f2559h.f358k = (short) 91;
        c0015ao.f357j = (short) 91;
    }

    /* renamed from: c */
    public final void m1701c(int i) throws IOException {
        if (this.f2559h.f359l == 0) {
            if (this.f2560i.f2149aq != null) {
                this.f2560i.f2149aq.mo70b(i);
            }
            if (i == 514 || i == 1) {
                this.f2557d = this.f2557d != 0 ? 0 : 1;
                return;
            }
            if (i == 520 || i == 4) {
                this.f2557d = this.f2557d != 1 ? 1 : 0;
                return;
            }
            if (i != 1073741824 && i != 517 && i != 268435456) {
                if (i == 536870912) {
                    this.f2557d = 0;
                    m1692a((byte) 2);
                    this.f2559h.f359l = (short) 0;
                    C0015ao c0015ao = this.f2559h;
                    this.f2559h.f358k = (short) 0;
                    c0015ao.f357j = (short) 0;
                    return;
                }
                return;
            }
            if (this.f2557d == 0) {
                if (f2554l != 1) {
                    m1692a((byte) 1);
                }
            } else if (this.f2557d == 1) {
                this.f2557d = 0;
                m1692a((byte) 2);
            }
        }
    }

    /* renamed from: c */
    public final void m1702c(Graphics graphics) {
        int i;
        int i2;
        int i3;
        if (this.f2559h.f359l == 0) {
            if (this.f2560i.f2149aq != null) {
                i2 = this.f2560i.f2149aq.f2328a + 5;
                i = ((this.f2560i.f2149aq.f2329b + this.f2560i.f2149aq.f2331d) - ((C0088t.f2524j * 2) + 16)) - 6;
                C0055ca.m1292a(graphics, i2, i, this.f2560i.f2149aq.f2330c - 11, (C0088t.f2524j * 2) + 16, 1);
                this.f2560i.f2149aq.m1602a(graphics);
            } else {
                i = 0;
                i2 = 0;
            }
            int i4 = 0;
            while (i4 < 2) {
                if (f2550e != 0) {
                    i3 = (this.f2558g == 1 && f2550e == 1) ? 8750469 : 16777215;
                    this.f2562n[0] = f2550e == 1 ? "离婚(等待对方确认)" : "离婚(对方已确认)";
                } else {
                    this.f2562n[0] = "离婚(点击申请离婚)";
                    i3 = 16777215;
                }
                C0055ca.m1298a(graphics, this.f2562n[i4], i2 + 4, i + 5 + ((C0088t.f2524j + 5) * i4), 20, this.f2558g == i4 ? 16711680 : i3, 0);
                i4++;
            }
        }
    }

    /* renamed from: d */
    public final void m1703d() {
        this.f2560i.f2149aq.mo71j();
        this.f2560i.f2149aq.m1601a("申请离婚");
        this.f2560i.f2149aq.m1603a(false);
        this.f2560i.f2152at.m79b(f2551f, C0088t.f2523i, (byte) 2);
        this.f2560i.f2152at.m75a((byte) 1);
        this.f2560i.f2149aq.m1600a(this.f2560i.f2152at);
        this.f2560i.f2149aq.f2334g = (C0088t.f2524j * 2) + 16;
        this.f2560i.f2149aq.m1598a(C0088t.f2520f, C0088t.f2521g, C0088t.f2518d, C0088t.f2519e);
        this.f2559h.f359l = (short) 0;
        this.f2560i.f2216j = this.f2560i.f2217k;
        C0015ao c0015ao = this.f2559h;
        this.f2559h.f358k = (short) 92;
        c0015ao.f357j = (short) 92;
    }

    /* renamed from: d */
    public final void m1704d(int i) {
        if (this.f2559h.f359l == 0) {
            if (this.f2560i.f2149aq != null) {
                this.f2560i.f2149aq.mo70b(i);
            }
            if (i == 514 || i == 1) {
                this.f2558g = this.f2558g != 0 ? 0 : 1;
                return;
            }
            if (i == 520 || i == 4) {
                this.f2558g = this.f2558g != 1 ? 1 : 0;
                return;
            }
            if (i != 1073741824 && i != 517 && i != 268435456) {
                if (i == 536870912) {
                    this.f2558g = 0;
                    this.f2559h.f359l = (short) 0;
                    C0015ao c0015ao = this.f2559h;
                    this.f2559h.f358k = (short) 0;
                    c0015ao.f357j = (short) 0;
                    return;
                }
                return;
            }
            if (this.f2558g == 0) {
                if (f2550e != 1) {
                    this.f2560i.m1435a("输入OK确定离婚", 0);
                }
            } else if (this.f2558g == 1) {
                this.f2558g = 0;
                if (f2550e == 1) {
                    m1697b((byte) 2);
                    return;
                }
                this.f2559h.f359l = (short) 0;
                C0015ao c0015ao2 = this.f2559h;
                this.f2559h.f358k = (short) 0;
                c0015ao2.f357j = (short) 0;
            }
        }
    }

    /* renamed from: d */
    public final void m1705d(Graphics graphics) {
        if (this.f2559h.f359l != 0 || this.f2560i.f2149aq == null) {
            return;
        }
        this.f2560i.f2149aq.m1602a(graphics);
    }

    /* renamed from: e */
    public final void m1706e() throws IOException {
        byte[] bArrM1222n = C0053bz.m1222n((short) 4862, C0047bt.f865ad, C0047bt.f1170gQ);
        if (bArrM1222n == null) {
            this.f2560i.m1442b("获取上传指令数据错误!");
            return;
        }
        RunnableC0066a.f2115i.m600a(new C0091w((short) 4862, bArrM1222n));
        C0015ao c0015ao = this.f2559h;
        this.f2559h.f358k = (short) 0;
        c0015ao.f357j = (short) 0;
        this.f2560i.m1434a((String) null);
    }

    /* renamed from: e */
    public final void m1707e(int i) throws IOException {
        if (this.f2559h.f359l == 0) {
            if (this.f2560i.f2149aq != null) {
                this.f2560i.f2149aq.mo70b(i);
            }
            if (f2555o != null && (i == 268435456 || i == 1073741824 || i == 517)) {
                byte[] bArrM1078a = C0053bz.m1078a((short) 4863, C0047bt.f865ad, (int) C0047bt.f1766t[this.f2559h.f220af].f508a, f2555o[this.f2560i.f2150ar.m1275g()], this.f2559h.f181I.f402j, this.f2559h.f181I.f403k);
                if (bArrM1078a != null) {
                    RunnableC0066a.f2115i.m600a(new C0091w((short) 4863, bArrM1078a));
                    C0015ao c0015ao = this.f2559h;
                    this.f2559h.f358k = (short) 0;
                    c0015ao.f357j = (short) 0;
                    this.f2560i.m1434a((String) null);
                } else {
                    this.f2560i.m1442b("获取上传指令数据错误!");
                }
            }
            if (i == 536870912) {
                this.f2559h.f359l = (short) 0;
                C0015ao c0015ao2 = this.f2559h;
                this.f2559h.f358k = (short) 0;
                c0015ao2.f357j = (short) 0;
                return;
            }
            if (i != 1024) {
                if (i == 2048) {
                    if (C0047bt.f1170gQ <= 1 && C0047bt.f1171gR == 1) {
                        C0047bt.f1170gQ = (short) (C0047bt.f1170gQ + 1);
                        m1706e();
                        return;
                    } else {
                        if (C0047bt.f1170gQ <= 1 || C0047bt.f1171gR != 1) {
                            return;
                        }
                        C0047bt.f1170gQ = (short) (C0047bt.f1170gQ + 1);
                        m1706e();
                        return;
                    }
                }
                return;
            }
            if (C0047bt.f1170gQ > 1 && C0047bt.f1171gR == 1) {
                if (C0047bt.f1170gQ - 1 <= 1) {
                    C0047bt.f1170gQ = (short) 1;
                } else {
                    C0047bt.f1170gQ = (short) (C0047bt.f1170gQ - 1);
                }
                m1706e();
                return;
            }
            if (C0047bt.f1170gQ <= 1 || C0047bt.f1171gR != 0) {
                return;
            }
            if (C0047bt.f1170gQ - 1 < 1) {
                C0047bt.f1170gQ = (short) 1;
            } else {
                C0047bt.f1170gQ = (short) (C0047bt.f1170gQ - 1);
            }
            m1706e();
        }
    }

    /* renamed from: f */
    public final void m1708f() {
        this.f2560i.f2149aq.mo71j();
        this.f2560i.f2149aq.m1601a("新人礼堂");
        this.f2560i.f2149aq.m1603a(false);
        this.f2560i.f2150ar.m1266a((Image[]) null, f2556p, (String[]) null, (String[]) null);
        this.f2560i.f2153au.m1590a("进入");
        this.f2560i.f2153au.m1592a(true);
        this.f2560i.f2149aq.m1600a(this.f2560i.f2150ar);
        this.f2560i.f2149aq.m1600a(this.f2560i.f2153au);
        this.f2560i.f2149aq.m1598a(C0088t.f2520f, C0088t.f2521g, C0088t.f2518d, C0088t.f2519e);
        this.f2559h.f359l = (short) 0;
        this.f2560i.f2216j = this.f2560i.f2217k;
        C0015ao c0015ao = this.f2559h;
        this.f2559h.f358k = (short) 93;
        c0015ao.f357j = (short) 93;
    }
}

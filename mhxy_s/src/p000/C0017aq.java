package p000;

import com.yinhan.kjava.main.RunnableC0066a;
import java.lang.reflect.Array;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* renamed from: aq */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-4234804660425969496/classes.dex */
public final class C0017aq {

    /* renamed from: a */
    public C0015ao f370a;

    /* renamed from: b */
    public RunnableC0066a f371b;

    /* renamed from: c */
    public String f372c;

    /* renamed from: d */
    public String f373d;

    /* renamed from: e */
    public String f374e;

    /* renamed from: f */
    public String f375f;

    /* renamed from: g */
    public int f376g;

    /* renamed from: h */
    public String f377h;

    /* renamed from: l */
    public int[][] f381l;

    /* renamed from: m */
    public int[][] f382m;

    /* renamed from: n */
    public int[] f383n;

    /* renamed from: p */
    public int f385p;

    /* renamed from: s */
    public int f388s;

    /* renamed from: t */
    public int f389t;

    /* renamed from: u */
    private long f390u;

    /* renamed from: x */
    private int[][] f393x;

    /* renamed from: y */
    private int[][] f394y;

    /* renamed from: z */
    private int[][] f395z;

    /* renamed from: v */
    private int f391v = 0;

    /* renamed from: w */
    private short[] f392w = {1919, 2147, 2150, 2149, 2148};

    /* renamed from: A */
    private short[] f365A = {1919, 2147, 2148};

    /* renamed from: i */
    public int[] f378i = new int[3];

    /* renamed from: j */
    public long f379j = 0;

    /* renamed from: B */
    private short f366B = 0;

    /* renamed from: C */
    private short f367C = 0;

    /* renamed from: D */
    private short f368D = 0;

    /* renamed from: E */
    private short f369E = 0;

    /* renamed from: k */
    public int[] f380k = null;

    /* renamed from: o */
    public String f384o = "";

    /* renamed from: q */
    public long f386q = 1000;

    /* renamed from: r */
    public long f387r = 1000;

    public C0017aq(C0015ao c0015ao, RunnableC0066a runnableC0066a) {
        this.f370a = c0015ao;
        this.f371b = runnableC0066a;
    }

    /* renamed from: A */
    private void m494A() {
        byte[] bArrM1199j = C0053bz.m1199j((short) 4225, C0047bt.f865ad, C0047bt.f1170gQ);
        if (bArrM1199j == null) {
            this.f370a.f354e.m1442b("获取上传指令数据错误!");
        } else {
            RunnableC0066a.f2115i.m600a(new C0091w((short) 4225, bArrM1199j));
            this.f370a.f354e.m1434a((String) null);
        }
    }

    /* renamed from: B */
    private void m495B() {
        byte[] bArrM1223o = C0053bz.m1223o((short) 4211, C0047bt.f865ad);
        if (bArrM1223o == null) {
            this.f371b.m1442b("获取上传指令数据错误!");
        } else {
            RunnableC0066a.f2115i.m600a(new C0091w((short) 4211, bArrM1223o));
            this.f371b.m1434a((String) null);
        }
    }

    /* renamed from: C */
    private void m496C() {
        byte[] bArrM1211l = C0053bz.m1211l((short) 4869, C0047bt.f865ad, C0047bt.f1170gQ);
        if (bArrM1211l == null) {
            this.f371b.m1442b("获取上传指令数据错误!");
        } else {
            RunnableC0066a.f2115i.m600a(new C0091w((short) 4869, bArrM1211l));
            this.f371b.m1434a((String) null);
        }
    }

    /* renamed from: a */
    private void m497a(byte b) {
        byte[] bArrM1201k = C0053bz.m1201k((short) 4263, C0047bt.f865ad, b);
        if (bArrM1201k == null) {
            this.f371b.m1442b("获取上传指令数据错误!");
        } else {
            RunnableC0066a.f2115i.m600a(new C0091w((short) 4263, bArrM1201k));
            this.f371b.m1434a((String) null);
        }
    }

    /* renamed from: a */
    private void m498a(short s) {
        byte[] bArrM1025C = C0053bz.m1025C(s, C0047bt.f865ad);
        if (bArrM1025C == null) {
            this.f371b.m1442b("获取上传指令数据错误!");
        } else {
            RunnableC0066a.f2115i.m600a(new C0091w(s, bArrM1025C));
            this.f371b.m1434a((String) null);
        }
    }

    /* renamed from: a */
    private static String[] m499a(int[] iArr, String str) {
        if (iArr == null) {
            return null;
        }
        String[] strArr = new String[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            strArr[i] = new String(new StringBuffer().append("").append(iArr[i]).append(str).toString());
        }
        return strArr;
    }

    /* renamed from: b */
    private void m500b(byte b) {
        byte[] bArrM1046a = C0053bz.m1046a((short) 4239, b, this.f378i, C0047bt.f865ad);
        if (bArrM1046a == null) {
            this.f371b.m1442b("获取上传指令数据错误!");
        } else {
            RunnableC0066a.f2115i.m600a(new C0091w((short) 4239, bArrM1046a));
            this.f371b.m1434a((String) null);
        }
    }

    /* renamed from: b */
    private void m501b(String str) {
        byte[] bArrM1225o = C0053bz.m1225o((short) 4868, str, C0047bt.f865ad);
        if (bArrM1225o != null) {
            RunnableC0066a.f2115i.m600a(new C0091w((short) 4868, bArrM1225o));
        } else {
            this.f371b.m1442b("获取上传指令数据错误!");
        }
    }

    /* renamed from: c */
    private void m502c(byte b) {
        byte[] bArrM1115b = C0053bz.m1115b((short) 4246, C0047bt.f1273iN[(this.f371b.f2151as.f2353a << 5) + (this.f370a.f231ar << 3) + this.f370a.f230aq], b, C0047bt.f865ad);
        if (bArrM1115b == null) {
            this.f370a.f354e.m1442b("获取上传指令数据错误!");
        } else {
            RunnableC0066a.f2115i.m600a(new C0091w((short) 4246, bArrM1115b));
            this.f370a.f354e.m1434a((String) null);
        }
    }

    /* renamed from: d */
    private void m503d(byte b) {
        byte[] bArrM1115b = C0053bz.m1115b((short) 4245, C0047bt.f1273iN[(this.f371b.f2151as.f2353a << 5) + (this.f370a.f231ar << 3) + this.f370a.f230aq], b, C0047bt.f865ad);
        if (bArrM1115b == null) {
            this.f370a.f354e.m1442b("获取上传指令数据错误!");
        } else {
            RunnableC0066a.f2115i.m600a(new C0091w((short) 4245, bArrM1115b));
            this.f370a.f354e.m1434a((String) null);
        }
    }

    /* renamed from: w */
    private static String m504w(int i) {
        if (i < 0 || C0047bt.f1337jY == null || C0047bt.f1337jY.length == 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        if (C0047bt.f1393kb != null) {
            stringBuffer.append(new StringBuffer().append("对方状态：").append(C0047bt.f1393kb[i] == 0 ? "保护" : C0047bt.f1393kb[i] == 1 ? "和平" : "战争").toString());
            stringBuffer.append('\t');
        }
        if (C0047bt.f1394kc != null) {
            stringBuffer.append(new StringBuffer().append("对方态度：").append(C0047bt.f1394kc[i] == 0 ? "中立" : "敌对").toString());
            stringBuffer.append('\t');
        }
        if (C0047bt.f1395kd != null) {
            stringBuffer.append(new StringBuffer().append("你的态度：").append(C0047bt.f1395kd[i] == 0 ? "中立" : "敌对").toString());
            stringBuffer.append('\t');
        }
        return stringBuffer.toString();
    }

    /* renamed from: z */
    private void m505z() {
        byte[] bArrM1181g = C0053bz.m1181g((short) 4198, C0047bt.f865ad, C0047bt.f1170gQ);
        if (bArrM1181g == null) {
            this.f370a.f354e.m1442b("获取上传指令数据错误!");
        } else {
            RunnableC0066a.f2115i.m600a(new C0091w((short) 4198, bArrM1181g));
            this.f370a.f354e.m1434a((String) null);
        }
    }

    /* renamed from: a */
    public final int m506a(int i, int i2, int i3) {
        if (i != 0) {
            return i;
        }
        for (int i4 = 0; i4 < this.f393x.length; i4++) {
            if (i2 >= this.f393x[i4][0] && i2 <= this.f393x[i4][0] + this.f393x[i4][2] && i3 >= this.f393x[i4][1] && i3 <= this.f393x[i4][1] + this.f393x[i4][3]) {
                return 8;
            }
            if (i2 >= this.f394y[i4][0] && i2 <= this.f394y[i4][0] + this.f394y[i4][2] && i3 >= this.f394y[i4][1] && i3 <= this.f394y[i4][1] + this.f394y[i4][3]) {
                return 2;
            }
            if (i2 >= this.f395z[i4][0] && i2 <= this.f395z[i4][0] + this.f395z[i4][2] && i3 >= this.f395z[i4][1] && i3 <= this.f395z[i4][1] + this.f395z[i4][3]) {
                return 1073741824;
            }
        }
        return i;
    }

    /* renamed from: a */
    public final void m507a() {
        this.f370a.f226am = C0055ca.m1311a(new StringBuffer().append("将交付").append(this.f390u).append("帮派基金作为招募费用，持续一周？").toString(), C0088t.f2523i, 140, "\t");
        this.f370a.f359l = (short) 3;
        C0055ca.f1888h = 0;
    }

    /* renamed from: a */
    public final void m508a(byte b, String str) {
        byte[] bArrM1063a = C0053bz.m1063a((short) 4865, str, b, C0047bt.f865ad);
        if (bArrM1063a == null) {
            this.f371b.m1442b("获取上传指令数据错误!");
        } else {
            RunnableC0066a.f2115i.m600a(new C0091w((short) 4865, bArrM1063a));
            this.f371b.m1434a((String) null);
        }
    }

    /* renamed from: a */
    public final void m509a(int i) {
        this.f371b.f2149aq.mo71j();
        this.f371b.f2149aq.m1601a("帮派");
        this.f371b.f2149aq.m1603a(false);
        this.f371b.f2150ar.m1266a((Image[]) null, C0088t.f2505Z, (String[]) null, (String[]) null);
        this.f371b.f2150ar.m1256a(i);
        this.f371b.f2152at.m79b(C0088t.f2507aa[i], C0088t.f2523i, (byte) 2);
        this.f371b.f2152at.m75a((byte) 1);
        this.f371b.f2153au.m1590a("选择");
        this.f371b.f2149aq.m1600a(this.f371b.f2150ar);
        this.f371b.f2149aq.m1600a(this.f371b.f2152at);
        this.f371b.f2149aq.m1600a(this.f371b.f2153au);
        this.f371b.f2149aq.m1598a(C0088t.f2520f, C0088t.f2521g, C0088t.f2518d, C0088t.f2519e);
        this.f370a.f359l = (short) 0;
        this.f370a.f354e.f2216j = this.f370a.f354e.f2217k;
        C0015ao c0015ao = this.f370a;
        this.f370a.f358k = (short) 41;
        c0015ao.f357j = (short) 41;
    }

    /* renamed from: a */
    public final void m510a(long j) {
        this.f390u = j;
        this.f370a.m477o();
    }

    /* renamed from: a */
    public final void m511a(String str) {
        byte[] bArrM1159d = C0053bz.m1159d((short) 4864, str, C0047bt.f865ad, C0047bt.f1170gQ);
        if (bArrM1159d == null) {
            this.f371b.m1442b("获取上传指令数据错误!");
        } else {
            RunnableC0066a.f2115i.m600a(new C0091w((short) 4864, bArrM1159d));
            this.f371b.m1434a((String) null);
        }
    }

    /* renamed from: a */
    public final void m512a(String str, byte b) {
        byte[] bArrM1120b = C0053bz.m1120b((short) 4866, str, b, C0047bt.f865ad);
        if (bArrM1120b == null) {
            this.f371b.m1442b("获取上传指令数据错误!");
        } else {
            RunnableC0066a.f2115i.m600a(new C0091w((short) 4866, bArrM1120b));
            this.f371b.m1434a((String) null);
        }
    }

    /* renamed from: a */
    public final void m513a(Graphics graphics) {
        if (this.f371b.f2149aq != null) {
            this.f371b.f2149aq.m1602a(graphics);
            int i = 0;
            while (i < this.f371b.f2150ar.m1274f()) {
                int iM1255a = ((this.f371b.f2150ar.m1255a() + this.f371b.f2150ar.m1271c()) - RunnableC0066a.f2064C.f599b) - 126;
                int iM1273e = (this.f371b.f2150ar.m1273e() * i) + this.f371b.f2150ar.m1268b() + 4;
                C0055ca.m1296a(graphics, i == 1 ? C0015ao.m134a(this.f371b.f2218l, this.f378i[i]) : new StringBuffer().append(this.f378i[i]).append("%").toString(), iM1255a, iM1273e, 122);
                if (this.f393x != null && this.f393x.length > i) {
                    this.f393x[i][0] = iM1255a;
                    this.f393x[i][1] = iM1273e;
                    this.f393x[i][2] = 12;
                    this.f393x[i][3] = C0088t.f2524j;
                }
                if (this.f394y != null && this.f394y.length > i) {
                    this.f394y[i][0] = (iM1255a + 122) - 12;
                    this.f394y[i][1] = iM1273e;
                    this.f394y[i][2] = 12;
                    this.f394y[i][3] = C0088t.f2524j;
                }
                if (this.f395z != null) {
                    this.f395z[i][0] = iM1255a + 12;
                    this.f395z[i][1] = iM1273e;
                    this.f395z[i][2] = 98;
                    this.f395z[i][3] = C0088t.f2524j;
                }
                i++;
            }
        }
    }

    /* renamed from: a */
    public final void m514a(boolean z) {
        this.f371b.f2149aq.mo71j();
        this.f371b.f2149aq.m1601a("帮派管理");
        this.f371b.f2149aq.m1603a(false);
        this.f371b.f2150ar.m1266a((Image[]) null, C0088t.f2508ab, (String[]) null, (String[]) null);
        if (z) {
            this.f371b.f2150ar.m1257a(this.f370a.f196aA, this.f370a.f200aE);
            this.f371b.f2152at.m79b(C0088t.f2509ac[this.f370a.f200aE], C0088t.f2523i, (byte) 2);
        } else {
            this.f371b.f2152at.m79b(C0088t.f2509ac[0], C0088t.f2523i, (byte) 2);
        }
        this.f371b.f2152at.m75a((byte) 1);
        this.f371b.f2153au.m1590a("确定");
        this.f371b.f2149aq.m1600a(this.f371b.f2150ar);
        this.f371b.f2149aq.m1600a(this.f371b.f2152at);
        this.f371b.f2149aq.m1600a(this.f371b.f2153au);
        this.f371b.f2149aq.m1598a(C0088t.f2520f, C0088t.f2521g, C0088t.f2518d, C0088t.f2519e);
        this.f370a.f359l = (short) 0;
        this.f371b.f2216j = this.f371b.f2217k;
        C0015ao c0015ao = this.f370a;
        this.f370a.f358k = (short) 45;
        c0015ao.f357j = (short) 45;
    }

    /* renamed from: b */
    public final void m515b() {
        this.f371b.f2149aq.mo71j();
        this.f371b.f2149aq.m1601a("等待响应");
        this.f371b.f2149aq.m1603a(false);
        C0054c c0054c = this.f371b.f2150ar;
        String[] strArr = C0047bt.f1297il;
        byte[] bArr = C0047bt.f1299in;
        String[] strArr2 = new String[bArr.length];
        for (int i = 0; i < strArr2.length; i++) {
            strArr2[i] = new String(new StringBuffer().append((int) bArr[i]).append("人响应").toString());
        }
        c0054c.m1266a((Image[]) null, strArr, (String[]) null, strArr2);
        this.f371b.f2152at.m79b(C0047bt.f1298im == null ? null : C0047bt.f1298im[0], C0088t.f2523i, (byte) 2);
        this.f371b.f2152at.m75a((byte) 1);
        this.f371b.f2153au.m1590a("响应");
        this.f371b.f2153au.m1592a(true);
        this.f371b.f2149aq.m1600a(this.f371b.f2150ar);
        this.f371b.f2149aq.m1600a(this.f371b.f2152at);
        this.f371b.f2149aq.m1600a(this.f371b.f2153au);
        this.f371b.f2149aq.m1598a(C0088t.f2520f, C0088t.f2521g, C0088t.f2518d, C0088t.f2519e);
        this.f370a.f359l = (short) 0;
        this.f371b.f2216j = this.f371b.f2217k;
        C0015ao c0015ao = this.f370a;
        this.f370a.f358k = (short) 42;
        c0015ao.f357j = (short) 42;
    }

    /* renamed from: b */
    public final void m516b(byte b, String str) {
        byte[] bArrM1140c = C0053bz.m1140c((short) 4872, C0047bt.f865ad, b, str);
        if (bArrM1140c != null) {
            RunnableC0066a.f2115i.m600a(new C0091w((short) 4872, bArrM1140c));
        } else {
            this.f371b.m1442b("获取上传指令数据错误!");
        }
    }

    /* renamed from: b */
    public final void m517b(int i) {
        if (this.f370a.f359l != 0) {
            if (this.f370a.f359l == 1) {
                if (i == 268435456 || i == 1073741824) {
                    m523d();
                    return;
                } else {
                    if (i == 536870912) {
                        this.f370a.f359l = (short) 0;
                        return;
                    }
                    return;
                }
            }
            if (this.f370a.f359l == 2) {
                if (i == 268435456 || i == 1073741824) {
                    this.f370a.f354e.m1435a("输入OK确认解散帮派", 0);
                    return;
                } else {
                    if (i == 536870912) {
                        this.f370a.f359l = (short) 0;
                        return;
                    }
                    return;
                }
            }
            if (this.f370a.f359l == 3) {
                if (i != 268435456 && i != 1073741824) {
                    if (i == 536870912) {
                        this.f370a.f359l = (short) 0;
                        return;
                    }
                    return;
                } else {
                    byte[] bArrM1083a = C0053bz.m1083a((short) 4224, C0047bt.f865ad, this.f390u);
                    if (bArrM1083a == null) {
                        this.f370a.f354e.m1442b("获取上传指令数据错误!");
                        return;
                    } else {
                        RunnableC0066a.f2115i.m600a(new C0091w((short) 4224, bArrM1083a));
                        this.f370a.f354e.m1434a((String) null);
                        return;
                    }
                }
            }
            return;
        }
        if (this.f371b.f2149aq != null) {
            this.f371b.f2149aq.mo70b(i);
        }
        if (i == 1 || i == 514 || i == 4 || i == 520) {
            this.f371b.f2152at.m79b(C0088t.f2507aa[this.f371b.f2150ar.m1275g()], C0088t.f2523i, (byte) 2);
            this.f371b.f2152at.m75a((byte) 1);
        }
        if (i != 268435456 && i != 1073741824 && i != 517) {
            if (i == 536870912) {
                C0015ao c0015ao = this.f370a;
                this.f370a.f358k = (short) 0;
                c0015ao.f357j = (short) 0;
                return;
            }
            return;
        }
        this.f370a.f196aA = this.f371b.f2150ar.m1276h();
        this.f370a.f200aE = this.f371b.f2150ar.m1275g();
        switch (this.f370a.f200aE) {
            case 0:
                this.f370a.f354e.m1435a("输入帮派名称", 0);
                break;
            case 1:
                C0047bt.f1170gQ = (short) 1;
                m505z();
                break;
            case 2:
                this.f370a.f354e.m1435a("输入招募金额", 2);
                break;
            case 3:
                C0047bt.f1170gQ = (short) 1;
                m494A();
                break;
            case 4:
                m552r();
                break;
            case 5:
                this.f370a.f359l = (short) 1;
                C0055ca.f1888h = 0;
                break;
            case 6:
                this.f370a.f359l = (short) 2;
                C0055ca.f1888h = 0;
                break;
        }
    }

    /* renamed from: b */
    public final void m518b(Graphics graphics) {
        int i;
        if (this.f371b.f2149aq != null) {
            int i2 = C0088t.f2519e <= 240 ? 79 : 120;
            this.f371b.f2149aq.m1602a(graphics);
            C0055ca.m1292a(graphics, this.f371b.f2149aq.f2328a + 5, this.f371b.f2151as.f2354b + this.f371b.f2149aq.f2329b + 29, this.f371b.f2149aq.f2330c - 11, i2, 1);
            C0055ca.m1288a(graphics);
            int i3 = ((this.f371b.f2149aq.f2330c - 11) - (C0015ao.f178x.f599b << 3)) / 9;
            int i4 = (((C0088t.f2519e <= 240 ? 79 : 120) - 6) - (C0015ao.f178x.f599b << 2)) / 5;
            int i5 = this.f371b.f2149aq.f2328a + 8 + i3;
            int i6 = this.f371b.f2149aq.f2329b + 33 + this.f371b.f2151as.f2354b + i4;
            int i7 = 0;
            while (true) {
                int i8 = i7;
                if (i8 >= 32) {
                    break;
                }
                RunnableC0066a.f2114f.m64a(graphics, C0015ao.f178x, (int[]) null, (C0010aj) null, 0, 0, ((i8 % 8) * (C0015ao.f178x.f599b + i3)) + i5, ((i8 / 8) * (C0015ao.f178x.f599b + i4)) + i6, 0, 0);
                this.f370a.m379a(i8, ((i8 % 8) * (C0015ao.f178x.f599b + i3)) + i5, ((i8 / 8) * (C0015ao.f178x.f599b + i4)) + i6, C0015ao.f178x.f599b, C0015ao.f178x.f600c);
                i7 = i8 + 1;
            }
            int i9 = 0;
            C0055ca.m1328d(graphics, (this.f370a.f230aq * (C0015ao.f178x.f599b + i3)) + i5, (this.f370a.f231ar * (C0015ao.f178x.f599b + i4)) + i6, 17, 17);
            if (C0047bt.f1277iR != null) {
                int i10 = this.f371b.f2151as.f2353a << 5;
                while (true) {
                    int i11 = i10;
                    i = i9;
                    if (i11 >= (C0047bt.f1277iR.length > ((this.f371b.f2151as.f2353a + 1) << 5) ? (this.f371b.f2151as.f2353a + 1) << 5 : C0047bt.f1277iR.length)) {
                        break;
                    }
                    int i12 = i11 % 32;
                    RunnableC0066a.f2114f.m64a(graphics, C0015ao.m264b(C0047bt.f1277iR[i11]), (int[]) null, (C0010aj) null, 0, 0, ((i12 % 8) * (C0015ao.f178x.f599b + i3)) + i5 + 1, ((i12 / 8) * (C0015ao.f178x.f599b + i4)) + i6 + 1, 0, 0);
                    if (C0047bt.f1276iQ[i11] > 9) {
                        RunnableC0066a.f2114f.m63a(graphics, RunnableC0066a.f2116n, (int[]) null, C0047bt.f1276iQ[i11] / 10, 0, 0, ((i12 % 8) * (C0015ao.f178x.f599b + i3)) + 10 + i5, ((i12 / 8) * (C0015ao.f178x.f599b + i4)) + i6 + 12, 0, 0);
                        RunnableC0066a.f2114f.m63a(graphics, RunnableC0066a.f2116n, (int[]) null, C0047bt.f1276iQ[i11] % 10, 0, 0, ((i12 % 8) * (C0015ao.f178x.f599b + i3)) + 14 + i5, ((i12 / 8) * (C0015ao.f178x.f599b + i4)) + i6 + 12, 0, 0);
                    } else if (C0047bt.f1276iQ[i11] > 1) {
                        RunnableC0066a.f2114f.m63a(graphics, RunnableC0066a.f2116n, (int[]) null, C0047bt.f1276iQ[i11] % 10, 0, 0, ((i12 % 8) * (C0015ao.f178x.f599b + i3)) + 14 + i5, ((i12 / 8) * (C0015ao.f178x.f599b + i4)) + i6 + 12, 0, 0);
                    }
                    i9 = i11 == ((this.f370a.f231ar << 3) + this.f370a.f230aq) + (this.f371b.f2151as.f2353a * 32) ? i11 : i;
                    i10 = i11 + 1;
                }
                if (i >= 0 && i < C0047bt.f1277iR.length && i == (this.f370a.f231ar << 3) + this.f370a.f230aq + (this.f371b.f2151as.f2353a * 32)) {
                    C0055ca.m1300a(graphics, new StringBuffer().append(C0047bt.f1274iO[i]).append("X").append((int) C0047bt.f1276iQ[i]).toString(), C0047bt.f1285iZ[i], (C0015ao.f178x.f599b / 2) + (this.f370a.f230aq * (C0015ao.f178x.f599b + i3)) + i5, (C0015ao.f178x.f599b / 2) + (this.f370a.f231ar * (C0015ao.f178x.f599b + i4)) + i6);
                } else if ((this.f371b.f2151as.f2353a << 5) + (this.f370a.f231ar << 3) + this.f370a.f230aq >= C0047bt.f1269iJ) {
                    C0055ca.m1300a(graphics, "未开启", -1L, (C0015ao.f178x.f599b / 2) + (this.f370a.f230aq * (C0015ao.f178x.f599b + i3)) + i5, (C0015ao.f178x.f599b / 2) + (this.f370a.f231ar * (C0015ao.f178x.f599b + i4)) + i6);
                }
            }
        }
        if (this.f370a.f359l == 1) {
            C0055ca.m1324c(graphics);
            return;
        }
        if (this.f370a.f359l == 2) {
            if (this.f371b.f2149aq != null) {
                this.f371b.f2149aq.m1602a(graphics);
            }
        } else if (this.f370a.f359l == 3 || this.f370a.f359l == 6) {
            this.f370a.m392a(graphics, "数量");
        } else if (this.f370a.f359l == 5 || this.f370a.f359l == 4) {
            C0055ca.m1303a(graphics, this.f370a.f233at, new String[]{"确定", "取消"});
        }
    }

    /* renamed from: b */
    public final void m519b(boolean z) {
        this.f371b.f2149aq.mo71j();
        this.f371b.f2149aq.m1601a("宝库管理");
        this.f371b.f2149aq.m1603a(false);
        this.f371b.f2150ar.m1266a((Image[]) null, C0088t.f2510ad, (String[]) null, (String[]) null);
        if (z) {
            this.f371b.f2150ar.m1257a(this.f370a.f196aA, this.f370a.f200aE);
            this.f371b.f2152at.m79b(C0047bt.f1268iI[this.f370a.f200aE], C0088t.f2523i, (byte) 2);
        } else {
            this.f371b.f2152at.m79b(C0047bt.f1268iI[0], C0088t.f2523i, (byte) 2);
        }
        this.f371b.f2152at.m75a((byte) 1);
        this.f371b.f2153au.m1590a("确定");
        this.f371b.f2149aq.m1600a(this.f371b.f2150ar);
        this.f371b.f2149aq.m1600a(this.f371b.f2152at);
        this.f371b.f2149aq.m1600a(this.f371b.f2153au);
        this.f371b.f2149aq.m1598a(C0088t.f2520f, C0088t.f2521g, C0088t.f2518d, C0088t.f2519e);
        C0055ca.f1888h = 0;
        C0055ca.f1887g = 0;
        this.f371b.f2126a = 0;
        this.f370a.f359l = (short) 0;
        this.f371b.f2216j = this.f371b.f2217k;
        C0015ao c0015ao = this.f370a;
        this.f370a.f358k = (short) 50;
        c0015ao.f357j = (short) 50;
    }

    /* renamed from: c */
    public final void m520c() {
        this.f371b.f2149aq.mo71j();
        this.f371b.f2149aq.m1601a("帮派招募");
        this.f371b.f2149aq.m1603a(false);
        this.f371b.f2150ar.m1266a((Image[]) null, C0047bt.f1302iq, (String[]) null, (String[]) null);
        this.f371b.f2152at.m79b(C0047bt.f1303ir != null ? C0047bt.f1303ir[0] : null, C0088t.f2523i, (byte) 2);
        this.f371b.f2152at.m75a((byte) 1);
        this.f371b.f2153au.m1590a("申请");
        this.f371b.f2153au.m1592a(true);
        this.f371b.f2149aq.m1600a(this.f371b.f2150ar);
        this.f371b.f2149aq.m1600a(this.f371b.f2152at);
        this.f371b.f2149aq.m1600a(this.f371b.f2153au);
        this.f371b.f2149aq.m1598a(C0088t.f2520f, C0088t.f2521g, C0088t.f2518d, C0088t.f2519e);
        this.f370a.f359l = (short) 0;
        this.f371b.f2216j = this.f371b.f2217k;
        C0015ao c0015ao = this.f370a;
        this.f370a.f358k = (short) 43;
        c0015ao.f357j = (short) 43;
    }

    /* renamed from: c */
    public final void m521c(int i) {
        if (this.f370a.f359l != 0) {
            if (this.f370a.f359l == 1) {
                if (i != 268435456 && i != 1073741824 && i != 517) {
                    if (i == 536870912) {
                        this.f370a.f359l = (short) 0;
                        return;
                    }
                    return;
                } else {
                    if (C0055ca.f1895o == 0) {
                        if (C0047bt.f1300io[this.f371b.f2150ar.m1275g()] == 1) {
                            byte[] bArrM1247x = C0053bz.m1247x((short) 4243, C0047bt.f865ad, C0047bt.f1296ik[this.f371b.f2150ar.m1275g()]);
                            if (bArrM1247x != null) {
                                RunnableC0066a.f2115i.m600a(new C0091w((short) 4243, bArrM1247x));
                            } else {
                                this.f371b.m1442b("获取上传指令数据错误!");
                            }
                            this.f371b.m1434a((String) null);
                            return;
                        }
                        byte[] bArrM1247x2 = C0053bz.m1247x((short) 4199, C0047bt.f865ad, C0047bt.f1296ik[this.f371b.f2150ar.m1275g()]);
                        if (bArrM1247x2 != null) {
                            RunnableC0066a.f2115i.m600a(new C0091w((short) 4199, bArrM1247x2));
                        } else {
                            this.f371b.m1442b("获取上传指令数据错误!");
                        }
                        this.f371b.m1434a((String) null);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (this.f371b.f2149aq != null) {
            this.f371b.f2149aq.mo70b(i);
        }
        if (i == 1 || i == 514 || i == 520 || i == 4) {
            this.f371b.f2152at.m79b(C0047bt.f1298im != null ? C0047bt.f1298im[this.f371b.f2150ar.m1275g()] : null, C0088t.f2523i, (byte) 2);
            this.f371b.f2152at.m75a((byte) 1);
        }
        if (i == 268435456 || i == 1073741824 || i == 517) {
            C0055ca.m1285a(C0088t.f2520f + 80, C0088t.f2521g + C0088t.f2524j + 20 + (this.f371b.f2150ar.m1277i() * C0088t.f2524j), C0047bt.f1300io[this.f371b.f2150ar.m1275g()] == 1 ? new String[]{"取消响应"} : new String[]{"响应"}, false);
            this.f370a.f359l = (short) 1;
            return;
        }
        if (i == 536870912) {
            C0047bt.f1170gQ = (short) 1;
            m509a(this.f370a.f200aE);
            return;
        }
        if (i != 1024) {
            if (i == 2048) {
                if (C0047bt.f1170gQ <= 1 && C0047bt.f1171gR == 1) {
                    C0047bt.f1170gQ = (short) (C0047bt.f1170gQ + 1);
                    m505z();
                    return;
                } else {
                    if (C0047bt.f1170gQ <= 1 || C0047bt.f1171gR != 1) {
                        return;
                    }
                    C0047bt.f1170gQ = (short) (C0047bt.f1170gQ + 1);
                    m505z();
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
            m505z();
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
        m505z();
    }

    /* renamed from: c */
    public final void m522c(Graphics graphics) {
        if (this.f370a.f359l != 0 || this.f371b.f2149aq == null) {
            return;
        }
        C0055ca.m1306a(graphics, RunnableC0066a.f2073L.f598a, RunnableC0066a.f2073L.f599b, this.f371b.f2149aq.f2328a + 5, (this.f371b.f2149aq.f2329b + this.f371b.f2149aq.f2331d) - 53, this.f371b.f2149aq.f2330c - 10, RunnableC0066a.f2073L.f600c);
        this.f371b.f2149aq.m1602a(graphics);
        int i = 0;
        while (i < this.f371b.f2150ar.m1274f()) {
            int iM1255a = ((this.f371b.f2150ar.m1255a() + this.f371b.f2150ar.m1271c()) - RunnableC0066a.f2064C.f599b) - 130;
            int iM1273e = (this.f371b.f2150ar.m1273e() * i) + this.f371b.f2150ar.m1268b() + 4;
            C0055ca.m1296a(graphics, i == 0 ? C0015ao.m134a(this.f371b.f2218l, this.f379j) : new StringBuffer().append("").append(this.f380k[i]).toString(), iM1255a, iM1273e, 124);
            if (this.f381l != null && this.f381l.length > i) {
                this.f381l[i][0] = iM1255a;
                this.f381l[i][1] = iM1273e;
                this.f381l[i][2] = 12;
                this.f381l[i][3] = C0088t.f2524j;
            }
            if (this.f382m != null && this.f382m.length > i) {
                this.f382m[i][0] = (iM1255a + 124) - 12;
                this.f382m[i][1] = iM1273e;
                this.f382m[i][2] = 12;
                this.f382m[i][3] = C0088t.f2524j;
            }
            if (this.f383n != null && i == 0) {
                this.f383n[0] = iM1255a + 12;
                this.f383n[1] = iM1273e;
                this.f383n[2] = 100;
                this.f383n[3] = C0088t.f2524j;
            }
            i++;
        }
        C0055ca.m1298a(graphics, new StringBuffer().append("得到功勋：").append(((((this.f379j + (this.f366B * C0047bt.f1345jg)) + (this.f367C * C0047bt.f1347ji)) + (this.f368D * C0047bt.f1349jk)) + (this.f369E * C0047bt.f1351jm)) / 300).toString(), (this.f371b.f2149aq.f2330c / 2) + this.f371b.f2149aq.f2328a, ((RunnableC0066a.f2074M.f598a.getHeight() - C0088t.f2524j) / 2) + ((this.f371b.f2149aq.f2329b + this.f371b.f2149aq.f2331d) - 51), 17, 16776666, 0);
    }

    /* renamed from: d */
    public final void m523d() {
        byte[] bArrM1212m = C0053bz.m1212m((short) 4209, C0047bt.f865ad);
        if (bArrM1212m == null) {
            this.f371b.m1442b("获取上传指令数据错误!");
        } else {
            RunnableC0066a.f2115i.m600a(new C0091w((short) 4209, bArrM1212m));
            this.f371b.m1434a((String) null);
        }
    }

    /* renamed from: d */
    public final void m524d(int i) {
        if (this.f370a.f359l != 0) {
            if (this.f370a.f359l == 1) {
                C0055ca.m1317b(i);
                if (i != 268435456 && i != 1073741824 && i != 517) {
                    if (i == 536870912) {
                        this.f370a.f359l = (short) 0;
                        return;
                    }
                    return;
                }
                if (C0055ca.f1895o == 0) {
                    if (C0047bt.f1304is[this.f371b.f2150ar.m1275g()] == 1) {
                        byte[] bArrM1210l = C0053bz.m1210l((short) 4242, C0047bt.f865ad, C0047bt.f1301ip[this.f371b.f2150ar.m1275g()]);
                        if (bArrM1210l == null) {
                            this.f371b.m1442b("获取上传指令数据错误!");
                            return;
                        } else {
                            RunnableC0066a.f2115i.m600a(new C0091w((short) 4242, bArrM1210l));
                            this.f371b.m1434a((String) null);
                            return;
                        }
                    }
                    byte[] bArrM1210l2 = C0053bz.m1210l((short) 4226, C0047bt.f865ad, C0047bt.f1301ip[this.f371b.f2150ar.m1275g()]);
                    if (bArrM1210l2 == null) {
                        this.f371b.m1442b("获取上传指令数据错误!");
                        return;
                    } else {
                        RunnableC0066a.f2115i.m600a(new C0091w((short) 4226, bArrM1210l2));
                        this.f371b.m1434a((String) null);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (C0047bt.f1301ip != null) {
            if (this.f371b.f2149aq == null) {
                return;
            }
            this.f371b.f2149aq.mo70b(i);
            if (i == 1 || i == 514 || i == 520 || i == 4) {
                this.f371b.f2152at.m79b(C0047bt.f1303ir != null ? C0047bt.f1303ir[this.f371b.f2150ar.m1275g()] : null, C0088t.f2523i, (byte) 2);
                this.f371b.f2152at.m75a((byte) 1);
            }
            if (i == 268435456 || i == 1073741824 || i == 517) {
                C0055ca.m1285a(C0088t.f2520f + 80, C0088t.f2521g + C0088t.f2524j + 20 + (this.f371b.f2150ar.m1277i() * C0088t.f2524j), C0047bt.f1304is[this.f371b.f2150ar.m1275g()] == 1 ? new String[]{"取消申请"} : new String[]{"申请"}, false);
                this.f370a.f359l = (short) 1;
            }
        }
        if (i == 536870912) {
            m509a(this.f370a.f200aE);
            return;
        }
        if (i != 1024) {
            if (i == 2048) {
                if (C0047bt.f1170gQ <= 1 && C0047bt.f1171gR == 1) {
                    C0047bt.f1170gQ = (short) (C0047bt.f1170gQ + 1);
                    m494A();
                    return;
                } else {
                    if (C0047bt.f1170gQ <= 1 || C0047bt.f1171gR != 1) {
                        return;
                    }
                    C0047bt.f1170gQ = (short) (C0047bt.f1170gQ + 1);
                    m494A();
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
            m494A();
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
        m494A();
    }

    /* renamed from: d */
    public final void m525d(Graphics graphics) {
        if (this.f370a.f359l != 0 || this.f371b.f2149aq == null) {
            return;
        }
        this.f371b.f2149aq.m1602a(graphics);
    }

    /* renamed from: e */
    public final void m526e() {
        byte[] bArrM1193i = C0053bz.m1193i((short) 4227, C0047bt.f865ad, C0047bt.f1170gQ);
        if (bArrM1193i == null) {
            this.f371b.m1442b("获取上传指令数据错误!");
        } else {
            RunnableC0066a.f2115i.m600a(new C0091w((short) 4227, bArrM1193i));
            this.f371b.m1434a((String) null);
        }
    }

    /* renamed from: e */
    public final void m527e(int i) {
        if (this.f370a.f359l == 0) {
            if (this.f371b.f2149aq != null) {
                this.f371b.f2149aq.mo70b(i);
            }
            if (i == 1 || i == 514 || i == 520 || i == 4) {
                this.f371b.f2152at.m79b(C0088t.f2509ac[this.f371b.f2150ar.m1275g()], C0088t.f2523i, (byte) 2);
                this.f371b.f2152at.m75a((byte) 1);
            }
            if (i != 268435456 && i != 1073741824 && i != 517) {
                if (i == 536870912) {
                    this.f370a.f196aA = 0;
                    this.f370a.f200aE = 0;
                    C0015ao c0015ao = this.f370a;
                    this.f370a.f358k = (short) 0;
                    c0015ao.f357j = (short) 0;
                    return;
                }
                return;
            }
            this.f370a.f196aA = this.f371b.f2150ar.m1276h();
            this.f370a.f200aE = this.f371b.f2150ar.m1275g();
            switch (this.f370a.f200aE) {
                case 0:
                    this.f371b.m1435a("输入帮派新宗旨", 0);
                    break;
                case 1:
                    C0047bt.f1170gQ = (short) 1;
                    m526e();
                    break;
                case 2:
                    m530g();
                    break;
                case 3:
                    C0047bt.f1170gQ = (short) 1;
                    m537j(1);
                    break;
                case 4:
                    C0047bt.f1170gQ = (short) 1;
                    m531g(1);
                    break;
                case 5:
                    m497a((byte) 1);
                    break;
            }
        }
    }

    /* renamed from: f */
    public final void m528f() {
        String[] strArr;
        this.f371b.f2149aq.mo71j();
        this.f371b.f2149aq.m1601a("申请列表");
        this.f371b.f2149aq.m1603a(false);
        C0054c c0054c = this.f371b.f2150ar;
        String[] strArr2 = C0047bt.f1306iu;
        short[] sArr = C0047bt.f1307iv;
        if (sArr != null) {
            String[] strArr3 = new String[sArr.length];
            for (int i = 0; i < sArr.length; i++) {
                strArr3[i] = new String(new StringBuffer().append((int) sArr[i]).append("级").toString());
            }
            strArr = strArr3;
        } else {
            strArr = null;
        }
        c0054c.m1266a((Image[]) null, strArr2, strArr, C0047bt.f1308iw);
        this.f371b.f2153au.m1590a("确定");
        this.f371b.f2153au.m1592a(true);
        this.f371b.f2149aq.m1600a(this.f371b.f2150ar);
        this.f371b.f2149aq.m1600a(this.f371b.f2153au);
        this.f371b.f2149aq.m1598a(C0088t.f2520f, C0088t.f2521g, C0088t.f2518d, C0088t.f2519e);
        this.f370a.f359l = (short) 0;
        this.f371b.f2216j = this.f371b.f2217k;
        C0015ao c0015ao = this.f370a;
        this.f370a.f358k = (short) 46;
        c0015ao.f357j = (short) 46;
    }

    /* renamed from: f */
    public final void m529f(int i) {
        if (this.f370a.f359l == 0) {
            if (this.f371b.f2149aq != null) {
                this.f371b.f2149aq.mo70b(i);
            }
            if (i == 268435456 || i == 1073741824 || i == 517) {
                C0055ca.m1285a(C0088t.f2520f + 80, C0088t.f2524j + 20 + (this.f371b.f2150ar.m1277i() * C0088t.f2524j) + C0088t.f2521g, new String[]{"详情", "接纳", "拒绝"}, false);
                this.f370a.f359l = (short) 1;
                return;
            }
            if (i == 536870912) {
                m514a(true);
                return;
            }
            if (i != 1024) {
                if (i == 2048) {
                    if (C0047bt.f1170gQ <= 1 && C0047bt.f1171gR == 1) {
                        C0047bt.f1170gQ = (short) (C0047bt.f1170gQ + 1);
                        m526e();
                        return;
                    } else {
                        if (C0047bt.f1170gQ <= 1 || C0047bt.f1171gR != 1) {
                            return;
                        }
                        C0047bt.f1170gQ = (short) (C0047bt.f1170gQ + 1);
                        m526e();
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
                m526e();
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
            m526e();
            return;
        }
        if (this.f370a.f359l != 1) {
            if (this.f370a.f359l == 2) {
                this.f370a.f190T.mo70b(i);
                if (i == 268435456 || i == 536870912 || i == 1073741824 || i == 517) {
                    this.f370a.f190T.mo71j();
                    m528f();
                    return;
                }
                return;
            }
            return;
        }
        C0055ca.m1317b(i);
        if (i != 268435456 && i != 1073741824 && i != 517) {
            if (i == 536870912) {
                this.f370a.f359l = (short) 0;
                return;
            }
            return;
        }
        if (C0055ca.f1895o == 0) {
            if (C0047bt.f1309ix[this.f371b.f2150ar.m1275g()] != 1) {
                this.f371b.m1442b("对方不在线");
                return;
            }
            byte[] bArrM1089a = C0053bz.m1089a((short) 4110, C0047bt.f865ad, C0047bt.f1305it[this.f371b.f2150ar.m1275g()], (byte) 0);
            if (bArrM1089a == null) {
                this.f371b.m1442b("获取上传指令数据错误!");
                return;
            } else {
                RunnableC0066a.f2115i.m600a(new C0091w((short) 4110, bArrM1089a));
                this.f371b.m1434a((String) null);
                return;
            }
        }
        if (C0055ca.f1895o == 1) {
            byte[] bArrM1216m = C0053bz.m1216m((short) 4228, C0047bt.f865ad, C0047bt.f1305it[this.f371b.f2150ar.m1275g()]);
            if (bArrM1216m == null) {
                this.f371b.m1442b("获取上传指令数据错误!");
                return;
            } else {
                RunnableC0066a.f2115i.m600a(new C0091w((short) 4228, bArrM1216m));
                this.f371b.m1434a((String) null);
                return;
            }
        }
        if (C0055ca.f1895o == 2) {
            byte[] bArrM1216m2 = C0053bz.m1216m((short) 4229, C0047bt.f865ad, C0047bt.f1305it[this.f371b.f2150ar.m1275g()]);
            if (bArrM1216m2 == null) {
                this.f371b.m1442b("获取上传指令数据错误!");
            } else {
                RunnableC0066a.f2115i.m600a(new C0091w((short) 4229, bArrM1216m2));
                this.f371b.m1434a((String) null);
            }
        }
    }

    /* renamed from: g */
    public final void m530g() {
        this.f371b.m1435a("输入玩家名称", 0);
    }

    /* renamed from: g */
    public final void m531g(int i) {
        this.f376g = i;
        byte[] bArrM1187h = C0053bz.m1187h((short) 4212, C0047bt.f865ad, C0047bt.f1170gQ);
        if (bArrM1187h == null) {
            this.f371b.m1442b("获取上传指令数据错误!");
        } else {
            RunnableC0066a.f2115i.m600a(new C0091w((short) 4212, bArrM1187h));
            this.f371b.m1434a((String) null);
        }
    }

    /* renamed from: h */
    public final void m532h() {
        if (this.f375f != null) {
            byte[] bArrM1198j = C0053bz.m1198j((short) 4201, C0047bt.f865ad, this.f375f);
            if (bArrM1198j != null) {
                RunnableC0066a.f2115i.m600a(new C0091w((short) 4201, bArrM1198j));
            } else {
                this.f371b.m1442b("获取上传指令数据错误!");
            }
            this.f371b.m1434a((String) null);
        }
    }

    /* renamed from: h */
    public final void m533h(int i) {
        int[] iArr;
        String[] strArr;
        this.f371b.f2149aq.mo71j();
        this.f371b.f2149aq.m1601a("帮派信息");
        this.f371b.f2149aq.m1603a(true);
        this.f371b.f2151as.m1610a(new String[]{"成员", "帮派", "外交", "帮战"});
        this.f371b.f2149aq.m1600a(this.f371b.f2151as);
        if (i == 0) {
            this.f371b.f2151as.f2353a = (byte) 0;
            this.f371b.f2150ar.m1266a((Image[]) null, C0047bt.f1311iz, C0047bt.f1260iA, m499a(C0047bt.f1262iC, "战力"));
            this.f371b.f2150ar.m1267a(C0047bt.f838aC == 1 ? C0047bt.f1264iE : null);
            this.f371b.f2150ar.m1270b(C0047bt.f843aH == 1 ? C0047bt.f1265iF : null);
            this.f371b.f2150ar.m1263a(C0047bt.f1266iG);
            this.f371b.f2153au.m1590a("确定");
            this.f371b.f2153au.m1592a(true);
            this.f371b.f2149aq.m1600a(this.f371b.f2150ar);
            this.f371b.f2149aq.m1600a(this.f371b.f2153au);
            this.f371b.f2149aq.m1598a(C0088t.f2520f, C0088t.f2521g, C0088t.f2518d, C0088t.f2519e);
        } else if (i == 1) {
            this.f371b.f2151as.f2353a = (byte) 1;
            this.f371b.f2152at.m79b(C0047bt.f1267iH, C0088t.f2523i, (byte) 2);
            this.f371b.f2149aq.m1600a(this.f371b.f2152at);
            this.f371b.f2149aq.m1598a(C0088t.f2520f, C0088t.f2521g, C0088t.f2518d, C0088t.f2519e);
        } else if (i == 2) {
            this.f371b.f2151as.f2353a = (byte) 2;
            if (C0047bt.f1337jY == null || C0047bt.f1337jY.length <= 0) {
                iArr = null;
                strArr = null;
            } else {
                strArr = new String[C0047bt.f1337jY.length];
                int[] iArr2 = new int[C0047bt.f1337jY.length];
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    strArr[i2] = C0047bt.m897d(C0047bt.f1392ka[i2]);
                    if (C0047bt.f1392ka[i2] == 2) {
                        iArr2[i2] = 12845056;
                    } else if (C0047bt.f1392ka[i2] == 3) {
                        iArr2[i2] = 16711680;
                    } else {
                        iArr2[i2] = 16776960;
                    }
                }
                iArr = iArr2;
            }
            this.f371b.f2150ar.m1266a((Image[]) null, C0047bt.f1338jZ, (String[]) null, strArr);
            this.f371b.f2150ar.m1259a("搜索...");
            this.f371b.f2150ar.m1263a(iArr);
            this.f371b.f2150ar.m1260a("帮派搜索", 1);
            this.f371b.f2153au.m1590a("确定");
            this.f371b.f2153au.m1592a(true);
            this.f371b.f2149aq.m1600a(this.f371b.f2150ar);
            this.f371b.f2149aq.m1600a(this.f371b.f2153au);
            this.f371b.f2149aq.m1598a(C0088t.f2520f, C0088t.f2521g, C0088t.f2518d, C0088t.f2519e);
            C0055ca.f1892l = 0;
        } else if (i == 3) {
            this.f371b.f2151as.f2353a = (byte) 3;
            this.f371b.f2152at.m79b(C0047bt.f1403kl, C0088t.f2523i, (byte) 2);
            this.f371b.f2153au.m1590a("确定");
            this.f371b.f2153au.m1592a(true);
            this.f371b.f2149aq.m1600a(this.f371b.f2152at);
            this.f371b.f2149aq.m1600a(this.f371b.f2153au);
            this.f371b.f2149aq.m1598a(C0088t.f2520f, C0088t.f2521g, C0088t.f2518d, C0088t.f2519e);
        }
        this.f370a.f359l = (short) 0;
        this.f371b.f2216j = this.f371b.f2217k;
        C0015ao c0015ao = this.f370a;
        this.f370a.f358k = (short) 47;
        c0015ao.f357j = (short) 47;
    }

    /* renamed from: i */
    public final void m534i() {
        this.f371b.f2149aq.mo71j();
        this.f371b.f2149aq.m1601a("成员列表");
        this.f371b.f2149aq.m1603a(false);
        this.f371b.f2150ar.m1266a((Image[]) null, C0047bt.f1311iz, C0047bt.f1260iA, m499a(C0047bt.f1261iB, "功勋"));
        this.f371b.f2150ar.m1267a(C0047bt.f838aC == 1 ? C0047bt.f1264iE : null);
        this.f371b.f2150ar.m1270b(C0047bt.f843aH == 1 ? C0047bt.f1265iF : null);
        this.f371b.f2150ar.m1263a(C0047bt.f1266iG);
        this.f371b.f2153au.m1590a("任免");
        this.f371b.f2153au.m1592a(true);
        this.f371b.f2149aq.m1600a(this.f371b.f2150ar);
        this.f371b.f2149aq.m1600a(this.f371b.f2153au);
        this.f371b.f2149aq.m1598a(C0088t.f2520f, C0088t.f2521g, C0088t.f2518d, C0088t.f2519e);
        this.f370a.f359l = (short) 0;
        this.f371b.f2216j = this.f371b.f2217k;
        C0015ao c0015ao = this.f370a;
        this.f370a.f358k = (short) 48;
        c0015ao.f357j = (short) 48;
    }

    /* renamed from: i */
    public final void m535i(int i) {
        if (this.f370a.f359l == 0) {
            if (this.f371b.f2151as.f2353a == 0) {
                if (this.f371b.f2149aq != null) {
                    this.f371b.f2149aq.mo70b(i);
                }
                if (C0047bt.f1310iy != null) {
                    if (i == 268435456 || i == 1073741824 || i == 517) {
                        if (C0047bt.f1263iD[this.f371b.f2150ar.m1275g()] == 1) {
                            if (!C0047bt.f1310iy[this.f371b.f2150ar.m1275g()].equals(C0047bt.f865ad)) {
                                C0055ca.m1285a(C0088t.f2520f + 80, (C0088t.f2524j * 2) + 20 + (this.f371b.f2150ar.m1277i() * C0088t.f2524j) + C0088t.f2521g, new String[]{"查看", "私聊", "组队", "交易", "好友", "黑名单"}, false);
                                this.f370a.f359l = (short) 1;
                                this.f370a.f200aE = this.f371b.f2150ar.m1275g();
                                this.f370a.f196aA = this.f371b.f2150ar.m1276h();
                            }
                        } else if (!C0047bt.f1310iy[this.f371b.f2150ar.m1275g()].equals(C0047bt.f865ad)) {
                            C0055ca.m1285a(C0088t.f2520f + 80, (C0088t.f2524j * 2) + 20 + (this.f371b.f2150ar.m1277i() * C0088t.f2524j) + C0088t.f2521g, new String[]{"查看"}, false);
                            this.f370a.f359l = (short) 1;
                            this.f370a.f200aE = this.f371b.f2150ar.m1275g();
                            this.f370a.f196aA = this.f371b.f2150ar.m1276h();
                        }
                    } else if (i == 1024) {
                        if (C0047bt.f1170gQ > 1 && C0047bt.f1171gR == 1) {
                            if (C0047bt.f1170gQ - 1 <= 1) {
                                C0047bt.f1170gQ = (short) 1;
                            } else {
                                C0047bt.f1170gQ = (short) (C0047bt.f1170gQ - 1);
                            }
                            m531g(this.f376g);
                        } else if (C0047bt.f1170gQ > 1 && C0047bt.f1171gR == 0) {
                            if (C0047bt.f1170gQ - 1 < 1) {
                                C0047bt.f1170gQ = (short) 1;
                            } else {
                                C0047bt.f1170gQ = (short) (C0047bt.f1170gQ - 1);
                            }
                            m531g(this.f376g);
                        }
                    } else if (i == 2048) {
                        if (C0047bt.f1170gQ <= 1 && C0047bt.f1171gR == 1) {
                            C0047bt.f1170gQ = (short) (C0047bt.f1170gQ + 1);
                            m531g(this.f376g);
                        } else if (C0047bt.f1170gQ > 1 && C0047bt.f1171gR == 1) {
                            C0047bt.f1170gQ = (short) (C0047bt.f1170gQ + 1);
                            m531g(this.f376g);
                        }
                    }
                }
                if (i == 2 || i == 518) {
                    m495B();
                } else if (i == 8 || i == 516) {
                    C0047bt.f1170gQ = (short) 1;
                    m496C();
                }
            } else if (this.f371b.f2151as.f2353a == 1) {
                if (this.f371b.f2149aq != null) {
                    this.f371b.f2149aq.mo70b(i);
                }
                if (i == 8 || i == 516) {
                    C0047bt.f1170gQ = (short) 1;
                    m531g(this.f376g);
                } else if (i == 2 || i == 518) {
                    C0047bt.f1170gQ = (short) 1;
                    this.f385p = 1;
                    this.f384o = "";
                    m511a(this.f384o);
                }
            } else if (this.f371b.f2151as.f2353a == 2) {
                if (this.f371b.f2149aq != null) {
                    this.f371b.f2149aq.mo70b(i);
                }
                if (i == 8 || i == 516) {
                    m495B();
                } else if (i == 2 || i == 518) {
                    C0047bt.f1170gQ = (short) 1;
                    m496C();
                    m533h(3);
                }
                if (i == 1 || i == 514 || i == 520 || i == 4) {
                    this.f371b.f2150ar.m1260a(this.f371b.f2150ar.m1275g() == this.f371b.f2150ar.m1276h() ? "帮派搜索" : m504w(this.f371b.f2150ar.m1275g() - 1), 1);
                }
                if (i == 268435456 || i == 1073741824 || i == 517) {
                    this.f370a.f196aA = this.f371b.f2150ar.m1276h();
                    this.f370a.f200aE = this.f371b.f2150ar.m1275g();
                    if (this.f371b.f2150ar.m1275g() == this.f371b.f2150ar.m1276h()) {
                        this.f371b.m1435a("请输入要搜索的帮派名称", 0);
                    } else if (C0047bt.f1337jY != null) {
                        C0055ca.m1285a(C0088t.f2520f + 80, (C0088t.f2524j * 2) + 20 + (this.f371b.f2150ar.m1277i() * C0088t.f2524j) + C0088t.f2521g, new String[]{"查看", "外交", "宣战"}, true);
                        this.f370a.f359l = (short) 7;
                    }
                } else if (i == 1024) {
                    if (C0047bt.f1170gQ > 1 && C0047bt.f1171gR == 1) {
                        if (C0047bt.f1170gQ - 1 <= 1) {
                            C0047bt.f1170gQ = (short) 1;
                        } else {
                            C0047bt.f1170gQ = (short) (C0047bt.f1170gQ - 1);
                        }
                        m511a(this.f384o);
                    } else if (C0047bt.f1170gQ > 1 && C0047bt.f1171gR == 0) {
                        if (C0047bt.f1170gQ - 1 < 1) {
                            C0047bt.f1170gQ = (short) 1;
                        } else {
                            C0047bt.f1170gQ = (short) (C0047bt.f1170gQ - 1);
                        }
                        m511a(this.f384o);
                    }
                } else if (i == 2048) {
                    if (C0047bt.f1170gQ <= 1 && C0047bt.f1171gR == 1) {
                        C0047bt.f1170gQ = (short) (C0047bt.f1170gQ + 1);
                        m511a(this.f384o);
                    } else if (C0047bt.f1170gQ > 1 && C0047bt.f1171gR == 1) {
                        C0047bt.f1170gQ = (short) (C0047bt.f1170gQ + 1);
                        m511a(this.f384o);
                    }
                }
            } else if (this.f371b.f2151as.f2353a == 3) {
                if (this.f371b.f2149aq != null) {
                    this.f371b.f2149aq.mo70b(i);
                }
                if (i == 8 || i == 516) {
                    C0047bt.f1170gQ = (short) 1;
                    this.f385p = 1;
                    this.f384o = "";
                    m511a(this.f384o);
                } else if (i == 2 || i == 518) {
                    C0047bt.f1170gQ = (short) 1;
                    m531g(this.f376g);
                } else if (i == 1024) {
                    if (C0047bt.f1170gQ > 1 && C0047bt.f1171gR == 1) {
                        if (C0047bt.f1170gQ - 1 <= 1) {
                            C0047bt.f1170gQ = (short) 1;
                        } else {
                            C0047bt.f1170gQ = (short) (C0047bt.f1170gQ - 1);
                        }
                        m496C();
                    } else if (C0047bt.f1170gQ > 1 && C0047bt.f1171gR == 0) {
                        if (C0047bt.f1170gQ - 1 < 1) {
                            C0047bt.f1170gQ = (short) 1;
                        } else {
                            C0047bt.f1170gQ = (short) (C0047bt.f1170gQ - 1);
                        }
                        m496C();
                    }
                } else if (i == 2048) {
                    if (C0047bt.f1170gQ <= 1 && C0047bt.f1171gR == 1) {
                        C0047bt.f1170gQ = (short) (C0047bt.f1170gQ + 1);
                        m496C();
                    } else if (C0047bt.f1170gQ > 1 && C0047bt.f1171gR == 1) {
                        C0047bt.f1170gQ = (short) (C0047bt.f1170gQ + 1);
                        m496C();
                    }
                }
            } else if (this.f371b.f2151as.f2353a == 4) {
                if (this.f371b.f2149aq != null) {
                    this.f371b.f2149aq.mo70b(i);
                }
                if (i == 8 || i == 516) {
                    C0047bt.f1170gQ = (short) 1;
                    m496C();
                }
            }
            if (i == 536870912) {
                this.f384o = "";
                C0047bt.f1170gQ = (short) 1;
                if (this.f376g == 1) {
                    m514a(true);
                    return;
                } else {
                    if (this.f376g == 0) {
                        this.f370a.m468k();
                        this.f370a.m430c(1);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (this.f370a.f359l == 1) {
            if (this.f371b.f2128aC != null && this.f371b.f2214g) {
                this.f370a.f211aQ = C0047bt.f1311iz[this.f371b.f2150ar.m1275g()];
                this.f370a.m382a(C0047bt.f1310iy[this.f371b.f2150ar.m1275g()], (byte) 4);
                this.f370a.f359l = (short) 0;
                this.f371b.m1442b("聊天消息已发送!");
            }
            C0055ca.m1317b(i);
            if (i != 268435456 && i != 1073741824 && i != 517) {
                if (i == 536870912) {
                    this.f370a.f359l = (short) 0;
                    return;
                }
                return;
            }
            if (C0055ca.f1895o == 0) {
                C0055ca.m1285a(C0088t.f2520f + 80, (C0088t.f2524j * 2) + 20 + (this.f371b.f2150ar.m1277i() * C0088t.f2524j) + C0088t.f2521g, new String[]{"属性", "装备"}, false);
                this.f370a.f359l = (short) 2;
                return;
            }
            if (C0055ca.f1895o == 1) {
                this.f370a.f213aS = C0047bt.f1310iy[this.f371b.f2150ar.m1275g()];
                this.f370a.f214aT = 4;
                this.f371b.m1435a("聊天", 0);
                return;
            }
            if (C0055ca.f1895o == 2) {
                if (C0047bt.f933bs != -1) {
                    this.f370a.m396a(C0047bt.f1765s, C0047bt.f1310iy[this.f371b.f2150ar.m1275g()]);
                    return;
                } else {
                    C0055ca.m1285a(C0088t.f2520f + 80, (C0088t.f2524j * 2) + 20 + (this.f371b.f2150ar.m1277i() * C0088t.f2524j) + C0088t.f2521g, new String[]{"自由", "跟随"}, false);
                    this.f370a.f359l = (short) 6;
                    return;
                }
            }
            if (C0055ca.f1895o == 3) {
                C0055ca.m1285a(C0088t.f2520f + 80, (C0088t.f2524j * 2) + 20 + (this.f371b.f2150ar.m1277i() * C0088t.f2524j) + C0088t.f2521g, new String[]{"物品", "宠物"}, false);
                this.f370a.f359l = (short) 5;
                return;
            } else if (C0055ca.f1895o == 4) {
                this.f370a.m381a(C0047bt.f1310iy[this.f371b.f2150ar.m1275g()]);
                this.f370a.f359l = (short) 0;
                return;
            } else {
                if (C0055ca.f1895o == 5) {
                    this.f370a.m422b(C0047bt.f1310iy[this.f371b.f2150ar.m1275g()]);
                    this.f370a.f359l = (short) 0;
                    return;
                }
                return;
            }
        }
        if (this.f370a.f359l == 2) {
            C0055ca.m1317b(i);
            if (i != 268435456 && i != 1073741824 && i != 517) {
                if (i == 536870912) {
                    if (C0047bt.f1263iD[this.f371b.f2150ar.m1275g()] == 1) {
                        C0055ca.m1285a(C0088t.f2520f + 80, (C0088t.f2524j * 2) + 20 + (this.f371b.f2150ar.m1277i() * C0088t.f2524j) + C0088t.f2521g, new String[]{"查看", "私聊", "组队", "交易", "好友", "黑名单"}, false);
                    } else {
                        C0055ca.m1285a(C0088t.f2520f + 80, (C0088t.f2524j * 2) + 20 + (this.f371b.f2150ar.m1277i() * C0088t.f2524j) + C0088t.f2521g, new String[]{"查看"}, false);
                    }
                    this.f370a.f359l = (short) 1;
                    return;
                }
                return;
            }
            if (C0055ca.f1895o == 0) {
                byte[] bArrM1089a = C0053bz.m1089a((short) 4110, C0047bt.f865ad, C0047bt.f1310iy[this.f371b.f2150ar.m1275g()], (byte) 1);
                if (bArrM1089a == null) {
                    this.f371b.m1442b("获取上传指令数据错误!");
                    return;
                } else {
                    RunnableC0066a.f2115i.m600a(new C0091w((short) 4110, bArrM1089a));
                    this.f371b.m1434a((String) null);
                    return;
                }
            }
            if (C0055ca.f1895o == 1) {
                byte[] bArrM1129b = C0053bz.m1129b((short) 4111, C0047bt.f865ad, C0047bt.f1310iy[this.f371b.f2150ar.m1275g()]);
                if (bArrM1129b == null) {
                    this.f371b.m1442b("获取上传指令数据错误!");
                    return;
                } else {
                    RunnableC0066a.f2115i.m600a(new C0091w((short) 4111, bArrM1129b));
                    this.f371b.m1434a((String) null);
                    return;
                }
            }
            return;
        }
        if (this.f370a.f359l == 3) {
            this.f370a.f190T.mo70b(i);
            if (i == 268435456 || i == 536870912) {
                this.f370a.f190T.mo71j();
                this.f370a.f359l = (short) 2;
                return;
            }
            return;
        }
        if (this.f370a.f359l == 4) {
            this.f370a.m401a(C0047bt.f951cJ);
            this.f370a.m458g(i);
            if (i == 536870912) {
                if (this.f370a.f360m == 1) {
                    this.f370a.f190T.mo71j();
                    this.f370a.f360m = (short) 0;
                    return;
                }
                if (C0047bt.f951cJ != null) {
                    C0047bt.m931o();
                }
                C0015ao.f171q = null;
                this.f370a.f225al = null;
                this.f370a.f359l = (short) 2;
                RunnableC0066a.f2114f.m57a(this.f370a.f355f, C0015ao.f167h, C0015ao.f168i, true, false, 1009050);
                return;
            }
            return;
        }
        if (this.f370a.f359l == 5) {
            C0055ca.m1317b(i);
            if (i != 268435456 && i != 1073741824 && i != 517) {
                if (i == 536870912) {
                    C0055ca.m1285a(C0088t.f2520f + 80, (C0088t.f2524j * 2) + 20 + (this.f371b.f2150ar.m1277i() * C0088t.f2524j) + C0088t.f2521g, new String[]{"查看", "私聊", "组队", "交易", "好友", "黑名单"}, false);
                    C0055ca.f1895o = 3;
                    this.f370a.f359l = (short) 1;
                    return;
                }
                return;
            }
            byte[] bArrM1130b = C0053bz.m1130b((short) 4124, C0047bt.f865ad, C0047bt.f1310iy[this.f371b.f2150ar.m1275g()], (byte) C0055ca.f1895o);
            if (bArrM1130b == null) {
                this.f371b.m1442b("获取上传指令数据错误!");
                return;
            } else {
                RunnableC0066a.f2115i.m600a(new C0091w((short) 4124, bArrM1130b));
                this.f371b.m1434a((String) null);
                return;
            }
        }
        if (this.f370a.f359l == 6) {
            C0055ca.m1317b(i);
            if (i != 268435456 && i != 1073741824 && i != 517) {
                if (i == 536870912) {
                    C0055ca.m1285a(C0088t.f2520f + 80, (C0088t.f2524j * 2) + 20 + (this.f371b.f2150ar.m1277i() * C0088t.f2524j) + C0088t.f2521g, new String[]{"查看", "私聊", "组队", "交易", "好友", "黑名单"}, false);
                    C0055ca.f1895o = 2;
                    this.f370a.f359l = (short) 1;
                    return;
                }
                return;
            }
            int i2 = C0055ca.f1895o == 0 ? 1 : 0;
            if (C0047bt.f933bs == 0) {
                this.f371b.m1442b("队员不能发送组队邀请！");
                return;
            }
            if (C0047bt.f933bs == 1 && C0047bt.f1683q != null && C0047bt.f1683q.length >= 3) {
                this.f371b.m1442b("队伍已满，无法邀请！");
                return;
            }
            byte[] bArrM1100a = C0053bz.m1100a((short) 4112, C0047bt.f865ad, C0047bt.f1310iy[this.f371b.f2150ar.m1275g()], (short) i2);
            if (bArrM1100a == null) {
                this.f371b.m1442b("获取上传指令数据错误!");
                return;
            } else {
                RunnableC0066a.f2115i.m600a(new C0091w((short) 4112, bArrM1100a));
                this.f370a.f359l = (short) 0;
                return;
            }
        }
        if (this.f370a.f359l == 7) {
            C0055ca.m1317b(i);
            if (i != 268435456 && i != 1073741824 && i != 517) {
                if (i == 536870912) {
                    this.f370a.f359l = (short) 0;
                    return;
                }
                return;
            }
            this.f371b.f2155aw = C0055ca.f1895o;
            if (C0055ca.f1895o == 0) {
                m501b(C0047bt.f1337jY[this.f371b.f2150ar.m1275g() - 1]);
                return;
            }
            if (C0055ca.f1895o == 1) {
                C0055ca.m1285a(C0088t.f2520f + 80, (C0088t.f2524j * 2) + 20 + (this.f371b.f2150ar.m1277i() * C0088t.f2524j) + C0088t.f2521g, new String[]{"中立", "敌对"}, true);
                this.f370a.f359l = (short) 8;
                return;
            } else {
                if (C0055ca.f1895o == 2) {
                    this.f370a.f359l = (short) 9;
                    C0055ca.f1888h = 0;
                    return;
                }
                return;
            }
        }
        if (this.f370a.f359l != 8) {
            if (this.f370a.f359l == 9) {
                if (i == 268435456 || i == 1073741824 || i == 517) {
                    this.f371b.m1435a("输入OK确认宣战", 0);
                    return;
                } else {
                    if (i == 536870912) {
                        this.f370a.f359l = (short) 0;
                        return;
                    }
                    return;
                }
            }
            return;
        }
        C0055ca.m1317b(i);
        if (i != 268435456 && i != 1073741824 && i != 517) {
            if (i == 536870912) {
                this.f370a.f359l = (short) 0;
            }
        } else if (C0055ca.f1895o == 0) {
            m508a((byte) 1, C0047bt.f1337jY[this.f371b.f2150ar.m1275g() - 1]);
        } else if (C0055ca.f1895o == 1) {
            m508a((byte) 2, C0047bt.f1337jY[this.f371b.f2150ar.m1275g() - 1]);
        }
    }

    /* renamed from: j */
    public final void m536j() {
        this.f371b.f2149aq.mo71j();
        this.f371b.f2149aq.m1601a("职务列表");
        this.f371b.f2149aq.m1603a(true);
        this.f371b.f2150ar.m1266a((Image[]) null, C0047bt.f1342jd, (String[]) null, (String[]) null);
        this.f371b.f2152at.m79b(C0047bt.f1343je[this.f371b.f2150ar.m1275g()], C0088t.f2523i, (byte) 2);
        this.f371b.f2152at.m75a((byte) 1);
        this.f371b.f2153au.m1590a("确定");
        this.f371b.f2149aq.m1600a(this.f371b.f2150ar);
        this.f371b.f2149aq.m1600a(this.f371b.f2152at);
        this.f371b.f2149aq.m1600a(this.f371b.f2153au);
        this.f371b.f2149aq.m1598a(C0088t.f2520f, C0088t.f2521g, C0088t.f2518d, C0088t.f2519e);
        this.f370a.f359l = (short) 2;
        this.f371b.f2216j = this.f371b.f2217k;
        C0015ao c0015ao = this.f370a;
        this.f370a.f358k = (short) 48;
        c0015ao.f357j = (short) 48;
    }

    /* renamed from: j */
    public final void m537j(int i) {
        this.f376g = i;
        byte[] bArrM1187h = C0053bz.m1187h((short) 4240, C0047bt.f865ad, C0047bt.f1170gQ);
        if (bArrM1187h != null) {
            RunnableC0066a.f2115i.m600a(new C0091w((short) 4240, bArrM1187h));
        } else {
            this.f371b.m1442b("获取上传指令数据错误!");
        }
    }

    /* renamed from: k */
    public final void m538k() {
        this.f371b.f2149aq.mo71j();
        this.f371b.f2149aq.m1601a("帮派公告");
        this.f371b.f2149aq.m1603a(false);
        this.f371b.f2152at.m79b(C0047bt.f1344jf, C0088t.f2523i, (byte) 2);
        this.f371b.f2153au.m1590a("确定");
        this.f371b.f2149aq.m1600a(this.f371b.f2152at);
        this.f371b.f2149aq.m1600a(this.f371b.f2153au);
        this.f371b.f2149aq.m1598a(C0088t.f2520f, C0088t.f2521g, C0088t.f2518d, C0088t.f2519e);
        this.f370a.f359l = (short) 0;
        this.f371b.f2216j = this.f371b.f2217k;
        C0015ao c0015ao = this.f370a;
        this.f370a.f358k = (short) 49;
        c0015ao.f357j = (short) 49;
    }

    /* renamed from: k */
    public final void m539k(int i) {
        if (this.f370a.f359l == 0) {
            if (C0047bt.f1310iy != null) {
                if (this.f371b.f2149aq != null) {
                    this.f371b.f2149aq.mo70b(i);
                }
                if (i == 268435456 || i == 1073741824 || i == 517) {
                    C0055ca.m1285a(C0088t.f2520f + 80, C0088t.f2524j + 20 + (this.f371b.f2150ar.m1277i() * C0088t.f2524j) + C0088t.f2521g, new String[]{"任免", "开除"}, false);
                    this.f370a.f359l = (short) 1;
                    this.f391v = this.f371b.f2150ar.m1275g();
                }
            }
            if (i == 536870912) {
                if (this.f376g == 1) {
                    m514a(true);
                    return;
                } else {
                    if (this.f376g == 0) {
                        this.f370a.m468k();
                        this.f370a.m430c(1);
                        return;
                    }
                    return;
                }
            }
            if (i != 1024) {
                if (i == 2048) {
                    if (C0047bt.f1170gQ <= 1 && C0047bt.f1171gR == 1) {
                        C0047bt.f1170gQ = (short) (C0047bt.f1170gQ + 1);
                        m537j(this.f376g);
                        return;
                    } else {
                        if (C0047bt.f1170gQ <= 1 || C0047bt.f1171gR != 1) {
                            return;
                        }
                        C0047bt.f1170gQ = (short) (C0047bt.f1170gQ + 1);
                        m537j(this.f376g);
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
                m537j(this.f376g);
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
            m537j(this.f376g);
            return;
        }
        if (this.f370a.f359l == 1) {
            C0055ca.m1317b(i);
            if (i != 268435456 && i != 1073741824 && i != 517) {
                if (i == 536870912) {
                    this.f370a.f359l = (short) 0;
                    return;
                }
                return;
            } else {
                if (C0055ca.f1895o != 0) {
                    if (C0055ca.f1895o == 1) {
                        this.f370a.f359l = (short) 3;
                        C0055ca.f1888h = 0;
                        return;
                    }
                    return;
                }
                byte[] bArrM1226p = C0053bz.m1226p((short) 4241, C0047bt.f865ad);
                if (bArrM1226p == null) {
                    this.f371b.m1442b("获取上传指令数据错误!");
                    return;
                } else {
                    RunnableC0066a.f2115i.m600a(new C0091w((short) 4241, bArrM1226p));
                    this.f371b.m1434a((String) null);
                    return;
                }
            }
        }
        if (this.f370a.f359l != 2) {
            if (this.f370a.f359l == 3) {
                if (i != 268435456 && i != 1073741824 && i != 517) {
                    if (i == 536870912) {
                        this.f370a.f359l = (short) 0;
                        return;
                    }
                    return;
                } else {
                    byte[] bArrM1204k = C0053bz.m1204k((short) 4208, C0047bt.f865ad, C0047bt.f1310iy[this.f371b.f2150ar.m1275g()]);
                    if (bArrM1204k == null) {
                        this.f371b.m1442b("获取上传指令数据错误!");
                        return;
                    } else {
                        RunnableC0066a.f2115i.m600a(new C0091w((short) 4208, bArrM1204k));
                        this.f371b.m1434a((String) null);
                        return;
                    }
                }
            }
            return;
        }
        if (this.f371b.f2149aq != null) {
            this.f371b.f2149aq.mo70b(i);
        }
        if (i == 1 || i == 514 || i == 520 || i == 4) {
            this.f371b.f2152at.m79b(C0047bt.f1343je[this.f371b.f2150ar.m1275g()], C0088t.f2523i, (byte) 2);
            this.f371b.f2152at.m75a((byte) 1);
        }
        if (i != 268435456 && i != 1073741824 && i != 517) {
            if (i == 536870912) {
                m534i();
            }
        } else {
            byte[] bArrM1158d = C0053bz.m1158d((short) 4217, C0047bt.f865ad, C0047bt.f1310iy[this.f391v], C0047bt.f1341jc[this.f371b.f2150ar.m1275g()]);
            if (bArrM1158d == null) {
                this.f371b.m1442b("获取上传指令数据错误!");
            } else {
                RunnableC0066a.f2115i.m600a(new C0091w((short) 4217, bArrM1158d));
                this.f371b.m1434a((String) null);
            }
        }
    }

    /* renamed from: l */
    public final void m540l() {
        this.f370a.m401a(this.f392w);
        this.f380k = new int[5];
        this.f381l = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 5, 4);
        this.f382m = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 5, 4);
        this.f383n = new int[4];
        this.f371b.f2149aq.mo71j();
        this.f371b.f2149aq.m1601a("贡献物品");
        this.f371b.f2149aq.m1603a(false);
        this.f371b.f2150ar.m1266a(C0015ao.m276b(this.f392w), C0088t.f2516b <= 176 ? new String[]{"", "", "", "", ""} : C0088t.f2511ae, (String[]) null, (String[]) null);
        this.f371b.f2149aq.f2333f = RunnableC0066a.f2073L.f600c;
        this.f371b.f2150ar.m1269b(false);
        this.f371b.f2153au.m1593a(new String[]{"确定", "返回"});
        this.f371b.f2149aq.m1600a(this.f371b.f2150ar);
        this.f371b.f2149aq.m1600a(this.f371b.f2153au);
        this.f371b.f2149aq.m1598a(C0088t.f2520f, C0088t.f2521g, C0088t.f2518d, C0088t.f2519e);
        this.f370a.f359l = (short) 0;
        this.f371b.f2216j = this.f371b.f2217k;
        C0015ao c0015ao = this.f370a;
        this.f370a.f358k = (short) 51;
        c0015ao.f357j = (short) 51;
    }

    /* renamed from: l */
    public final void m541l(int i) {
        if (this.f370a.f359l == 0) {
            if (this.f371b.f2149aq != null) {
                this.f371b.f2149aq.mo70b(i);
            }
            if (i == 268435456 || i == 536870912 || i == 1073741824 || i == 517) {
                this.f370a.m473m();
            }
        }
    }

    /* renamed from: m */
    public final void m542m() {
        byte[] bArrM1232r = C0053bz.m1232r((short) 4221, C0047bt.f865ad);
        if (bArrM1232r == null) {
            this.f371b.m1442b("获取上传指令数据错误!");
        } else {
            RunnableC0066a.f2115i.m600a(new C0091w((short) 4221, bArrM1232r));
            this.f371b.m1434a((String) null);
        }
    }

    /* renamed from: m */
    public final void m543m(int i) {
        if (this.f370a.f359l == 0) {
            if (this.f371b.f2149aq != null) {
                this.f371b.f2149aq.mo70b(i);
            }
            if (i == 514 || i == 520 || i == 1 || i == 4) {
                this.f371b.f2152at.m79b(C0047bt.f1268iI[this.f371b.f2150ar.m1275g()], C0088t.f2523i, (byte) 2);
                this.f371b.f2152at.m75a((byte) 1);
            }
            if (i != 268435456 && i != 1073741824 && i != 517) {
                if (i == 536870912) {
                    C0047bt.m772H();
                    C0015ao c0015ao = this.f370a;
                    this.f370a.f358k = (short) 0;
                    c0015ao.f357j = (short) 0;
                    return;
                }
                return;
            }
            this.f370a.f196aA = this.f371b.f2150ar.m1276h();
            this.f370a.f200aE = this.f371b.f2150ar.m1275g();
            switch (this.f370a.f200aE) {
                case 0:
                    m546o();
                    break;
                case 1:
                    this.f370a.m447e(18);
                    break;
                case 2:
                    this.f370a.m477o();
                    this.f370a.f359l = (short) 1;
                    this.f370a.m380a(C0047bt.f877ap);
                    break;
                case 3:
                    this.f370a.m477o();
                    this.f370a.f359l = (short) 5;
                    this.f370a.m380a(999999999L);
                    break;
                case 4:
                    this.f370a.m477o();
                    this.f370a.f359l = (short) 2;
                    this.f370a.m380a(C0047bt.f874am);
                    break;
                case 5:
                    m542m();
                    break;
                case 6:
                    this.f370a.m380a(99L);
                    this.f370a.f359l = (short) 3;
                    break;
                case 7:
                    this.f370a.m380a(99L);
                    this.f370a.f359l = (short) 4;
                    break;
                case 8:
                    m500b((byte) 1);
                    break;
                case 9:
                    this.f370a.f359l = (short) 6;
                    this.f370a.f233at = "您确定要消耗一定物品提升帮派人气吗？";
                    C0055ca.f1888h = 0;
                    break;
                case 10:
                    this.f370a.f359l = (short) 7;
                    this.f370a.f233at = "您确定要消耗一定物品扩容帮派宝库吗？";
                    C0055ca.f1888h = 0;
                    break;
            }
            return;
        }
        if (this.f370a.f359l == 1 || this.f370a.f359l == 2) {
            if (i != 268435456 && i != 1073741824) {
                if (i == 536870912) {
                    this.f370a.f359l = (short) 0;
                    return;
                } else {
                    this.f370a.m439d(i);
                    return;
                }
            }
            if (this.f370a.m475n() == -1) {
                this.f371b.m1442b("输入有误,请重新输入");
                return;
            }
            if (this.f370a.m475n() > this.f370a.f222ah) {
                this.f371b.m1442b("超出最大值,请重新输入");
                return;
            }
            byte[] bArrM1113b = C0053bz.m1113b((short) 4264, (byte) (this.f370a.f359l != 1 ? 3 : 1), this.f370a.m475n(), C0047bt.f865ad);
            if (bArrM1113b != null) {
                RunnableC0066a.f2115i.m600a(new C0091w((short) 4264, bArrM1113b));
                this.f371b.m1434a((String) null);
            } else {
                this.f371b.m1442b("获取上传指令数据错误!");
            }
            this.f370a.f359l = (short) 0;
            return;
        }
        if (this.f370a.f359l == 3 || this.f370a.f359l == 4) {
            if (this.f370a.f360m == 0) {
                if (i == 268435456 || i == 1073741824 || i == 517) {
                    this.f370a.f233at = new StringBuffer().append("发布").append(this.f370a.f221ag).append("天帮派任务\t是否确认？").toString();
                    this.f370a.f360m = (short) 1;
                    C0055ca.f1888h = 0;
                    return;
                } else if (i == 536870912) {
                    this.f370a.f359l = (short) 0;
                    return;
                } else {
                    this.f370a.m421b(i);
                    return;
                }
            }
            if (this.f370a.f360m == 1) {
                if (i != 268435456 && i != 1073741824 && i != 517) {
                    if (i == 536870912) {
                        this.f370a.f233at = null;
                        this.f370a.f360m = (short) 0;
                        C0055ca.f1888h = 0;
                        return;
                    }
                    return;
                }
                byte[] bArrM1049a = C0053bz.m1049a((short) 4368, this.f370a.f221ag, (byte) (this.f370a.f359l != 3 ? 2 : 1), C0047bt.f865ad);
                if (bArrM1049a != null) {
                    RunnableC0066a.f2115i.m600a(new C0091w((short) 4368, bArrM1049a));
                    this.f371b.m1434a((String) null);
                } else {
                    this.f371b.m1442b("获取上传指令数据错误!");
                }
                C0055ca.f1888h = 0;
                this.f370a.f360m = (short) 0;
                return;
            }
            return;
        }
        if (this.f370a.f359l == 5) {
            if (i != 268435456 && i != 1073741824) {
                if (i == 536870912) {
                    this.f370a.f359l = (short) 0;
                    return;
                } else {
                    this.f370a.m439d(i);
                    return;
                }
            }
            if (this.f370a.m475n() == -1) {
                this.f371b.m1442b("输入有误,请重新输入");
                return;
            }
            if (this.f370a.m475n() > this.f370a.f222ah) {
                this.f371b.m1442b("超出最大值,请重新输入");
                return;
            }
            byte[] bArrM1113b2 = C0053bz.m1113b((short) 4264, (byte) 2, this.f370a.m475n(), C0047bt.f865ad);
            if (bArrM1113b2 != null) {
                RunnableC0066a.f2115i.m600a(new C0091w((short) 4264, bArrM1113b2));
                this.f371b.m1434a((String) null);
            } else {
                this.f371b.m1442b("获取上传指令数据错误!");
            }
            this.f370a.f359l = (short) 0;
            return;
        }
        if (this.f370a.f359l == 6) {
            if (i == 268435456 || i == 1073741824 || i == 517) {
                this.f370a.f359l = (short) 0;
                m498a((short) 4677);
                return;
            } else {
                if (i == 536870912) {
                    C0055ca.f1892l = 0;
                    C0055ca.f1888h = 0;
                    this.f370a.f359l = (short) 0;
                    return;
                }
                return;
            }
        }
        if (this.f370a.f359l == 7) {
            if (i == 268435456 || i == 1073741824 || i == 517) {
                this.f370a.f359l = (short) 0;
                m498a((short) 4265);
            } else if (i == 536870912) {
                C0055ca.f1892l = 0;
                C0055ca.f1888h = 0;
                this.f370a.f359l = (short) 0;
            }
        }
    }

    /* renamed from: n */
    public final void m544n() {
        this.f370a.m401a(this.f365A);
        this.f378i[0] = C0047bt.f1270iK[0];
        this.f378i[1] = C0047bt.f1272iM[0];
        this.f378i[2] = C0047bt.f1271iL[0];
        this.f393x = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 3, 4);
        this.f394y = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 3, 4);
        this.f395z = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 3, 4);
        this.f371b.f2149aq.mo71j();
        this.f371b.f2149aq.m1601a("宝库配置");
        this.f371b.f2149aq.m1603a(false);
        this.f371b.f2150ar.m1266a(C0015ao.m276b(this.f365A), C0088t.f2512af, (String[]) null, (String[]) null);
        this.f371b.f2153au.m1593a(new String[]{"确定", "返回"});
        this.f371b.f2149aq.m1600a(this.f371b.f2150ar);
        this.f371b.f2149aq.m1600a(this.f371b.f2153au);
        this.f371b.f2149aq.m1598a(C0088t.f2520f, C0088t.f2521g, C0088t.f2518d, C0088t.f2519e);
        this.f370a.f359l = (short) 0;
        this.f371b.f2216j = this.f371b.f2217k;
        C0015ao c0015ao = this.f370a;
        this.f370a.f358k = (short) 114;
        c0015ao.f357j = (short) 114;
    }

    /* renamed from: n */
    public final void m545n(int i) {
        short s;
        short s2;
        short s3;
        short s4;
        short s5;
        short s6;
        short s7;
        short s8;
        short s9;
        short s10 = 0;
        if (this.f370a.f359l == 0) {
            if (this.f371b.f2149aq != null) {
                this.f371b.f2149aq.mo70b(i);
            }
            if (this.f371b.f2127aA <= 40) {
                if (i != 2 && i != 518) {
                    if (i == 8 || i == 516) {
                        switch (this.f371b.f2150ar.m1275g()) {
                            case 0:
                                int[] iArr = this.f380k;
                                long j = this.f379j - 100 <= 0 ? 0L : this.f379j - 100;
                                this.f379j = j;
                                iArr[0] = (int) j;
                                break;
                            case 1:
                                int[] iArr2 = this.f380k;
                                short s11 = this.f366B;
                                this.f366B = (short) (s11 - 1);
                                if (s11 > 0) {
                                    s10 = this.f366B;
                                    this.f366B = (short) (s10 - 1);
                                }
                                this.f366B = s10;
                                iArr2[1] = s10;
                                break;
                            case 2:
                                int[] iArr3 = this.f380k;
                                short s12 = this.f367C;
                                this.f367C = (short) (s12 - 1);
                                if (s12 > 0) {
                                    s10 = this.f367C;
                                    this.f367C = (short) (s10 - 1);
                                }
                                this.f367C = s10;
                                iArr3[2] = s10;
                                break;
                            case 3:
                                int[] iArr4 = this.f380k;
                                short s13 = this.f368D;
                                this.f368D = (short) (s13 - 1);
                                if (s13 > 0) {
                                    s10 = this.f368D;
                                    this.f368D = (short) (s10 - 1);
                                }
                                this.f368D = s10;
                                iArr4[3] = s10;
                                break;
                            case 4:
                                int[] iArr5 = this.f380k;
                                short s14 = this.f369E;
                                this.f369E = (short) (s14 - 1);
                                if (s14 > 0) {
                                    s10 = this.f369E;
                                    this.f369E = (short) (s10 - 1);
                                }
                                this.f369E = s10;
                                iArr5[4] = s10;
                                break;
                        }
                    }
                } else {
                    switch (this.f371b.f2150ar.m1275g()) {
                        case 0:
                            int[] iArr6 = this.f380k;
                            long j2 = this.f379j + 100 <= C0047bt.f877ap ? this.f379j + 100 : C0047bt.f877ap;
                            this.f379j = j2;
                            iArr6[0] = (int) j2;
                            break;
                        case 1:
                            int[] iArr7 = this.f380k;
                            short s15 = this.f366B;
                            this.f366B = (short) (s15 + 1);
                            if (s15 >= C0047bt.f1346jh) {
                                s4 = C0047bt.f1346jh;
                            } else {
                                s4 = this.f366B;
                                this.f366B = (short) (s4 + 1);
                            }
                            this.f366B = s4;
                            iArr7[1] = s4;
                            break;
                        case 2:
                            int[] iArr8 = this.f380k;
                            short s16 = this.f367C;
                            this.f367C = (short) (s16 + 1);
                            if (s16 >= C0047bt.f1348jj) {
                                s3 = C0047bt.f1348jj;
                            } else {
                                s3 = this.f367C;
                                this.f367C = (short) (s3 + 1);
                            }
                            this.f367C = s3;
                            iArr8[2] = s3;
                            break;
                        case 3:
                            int[] iArr9 = this.f380k;
                            short s17 = this.f368D;
                            this.f368D = (short) (s17 + 1);
                            if (s17 >= C0047bt.f1350jl) {
                                s2 = C0047bt.f1350jl;
                            } else {
                                s2 = this.f368D;
                                this.f368D = (short) (s2 + 1);
                            }
                            this.f368D = s2;
                            iArr9[3] = s2;
                            break;
                        case 4:
                            int[] iArr10 = this.f380k;
                            short s18 = this.f369E;
                            this.f369E = (short) (s18 + 1);
                            if (s18 >= C0047bt.f1352jn) {
                                s = C0047bt.f1352jn;
                            } else {
                                s = this.f369E;
                                this.f369E = (short) (s + 1);
                            }
                            this.f369E = s;
                            iArr10[4] = s;
                            break;
                    }
                }
                this.f371b.f2127aA++;
            } else if (this.f371b.f2159b != 2 && this.f371b.f2159b != 518) {
                if (this.f371b.f2159b == 8 || this.f371b.f2159b == 516) {
                    switch (this.f371b.f2150ar.m1275g()) {
                        case 0:
                            int[] iArr11 = this.f380k;
                            long j3 = this.f379j - 100 <= 0 ? 0L : this.f379j - 100;
                            this.f379j = j3;
                            iArr11[0] = (int) j3;
                            break;
                        case 1:
                            int[] iArr12 = this.f380k;
                            short s19 = this.f366B;
                            this.f366B = (short) (s19 - 1);
                            if (s19 <= 0) {
                                s9 = 0;
                            } else {
                                s9 = this.f366B;
                                this.f366B = (short) (s9 - 1);
                            }
                            this.f366B = s9;
                            iArr12[1] = s9;
                            break;
                        case 2:
                            int[] iArr13 = this.f380k;
                            short s20 = this.f367C;
                            this.f367C = (short) (s20 - 1);
                            if (s20 > 0) {
                                s10 = this.f367C;
                                this.f367C = (short) (s10 - 1);
                            }
                            this.f367C = s10;
                            iArr13[2] = s10;
                            break;
                        case 3:
                            int[] iArr14 = this.f380k;
                            short s21 = this.f368D;
                            this.f368D = (short) (s21 - 1);
                            if (s21 > 0) {
                                s10 = this.f368D;
                                this.f368D = (short) (s10 - 1);
                            }
                            this.f368D = s10;
                            iArr14[3] = s10;
                            break;
                        case 4:
                            int[] iArr15 = this.f380k;
                            short s22 = this.f369E;
                            this.f369E = (short) (s22 - 1);
                            if (s22 > 0) {
                                s10 = this.f369E;
                                this.f369E = (short) (s10 - 1);
                            }
                            this.f369E = s10;
                            iArr15[4] = s10;
                            break;
                    }
                }
            } else {
                switch (this.f371b.f2150ar.m1275g()) {
                    case 0:
                        int[] iArr16 = this.f380k;
                        long j4 = this.f379j + 100 <= C0047bt.f877ap ? this.f379j + 100 : C0047bt.f877ap;
                        this.f379j = j4;
                        iArr16[0] = (int) j4;
                        break;
                    case 1:
                        int[] iArr17 = this.f380k;
                        short s23 = this.f366B;
                        this.f366B = (short) (s23 + 1);
                        if (s23 >= C0047bt.f1346jh) {
                            s8 = C0047bt.f1346jh;
                        } else {
                            s8 = this.f366B;
                            this.f366B = (short) (s8 + 1);
                        }
                        this.f366B = s8;
                        iArr17[1] = s8;
                        break;
                    case 2:
                        int[] iArr18 = this.f380k;
                        short s24 = this.f367C;
                        this.f367C = (short) (s24 + 1);
                        if (s24 >= C0047bt.f1348jj) {
                            s7 = C0047bt.f1348jj;
                        } else {
                            s7 = this.f367C;
                            this.f367C = (short) (s7 + 1);
                        }
                        this.f367C = s7;
                        iArr18[2] = s7;
                        break;
                    case 3:
                        int[] iArr19 = this.f380k;
                        short s25 = this.f368D;
                        this.f368D = (short) (s25 + 1);
                        if (s25 >= C0047bt.f1350jl) {
                            s6 = C0047bt.f1350jl;
                        } else {
                            s6 = this.f368D;
                            this.f368D = (short) (s6 + 1);
                        }
                        this.f368D = s6;
                        iArr19[3] = s6;
                        break;
                    case 4:
                        int[] iArr20 = this.f380k;
                        short s26 = this.f369E;
                        this.f369E = (short) (s26 + 1);
                        if (s26 >= C0047bt.f1352jn) {
                            s5 = C0047bt.f1352jn;
                        } else {
                            s5 = this.f369E;
                            this.f369E = (short) (s5 + 1);
                        }
                        this.f369E = s5;
                        iArr20[4] = s5;
                        break;
                }
            }
            if (i == 1073741824 || i == 517) {
                if (this.f371b.f2150ar.m1275g() == 0) {
                    this.f371b.m1435a("请输入贡献金额", 2);
                    return;
                }
                return;
            }
            if (i != 268435456) {
                if (i == 536870912) {
                    m550q();
                    m519b(true);
                    return;
                }
                return;
            }
            if (this.f379j == 0 && this.f366B == 0 && this.f367C == 0 && this.f368D == 0 && this.f369E == 0) {
                this.f371b.m1442b("请输入贡献基金的数目！");
                return;
            }
            byte[] bArrM1087a = C0053bz.m1087a((short) 4220, C0047bt.f865ad, this.f379j, this.f366B, this.f367C, this.f368D, this.f369E);
            if (bArrM1087a == null) {
                this.f371b.m1442b("获取上传指令数据错误!");
            } else {
                RunnableC0066a.f2115i.m600a(new C0091w((short) 4220, bArrM1087a));
                this.f371b.m1434a((String) null);
            }
        }
    }

    /* renamed from: o */
    public final void m546o() {
        this.f370a.f359l = (short) 0;
        this.f371b.f2155aw = 0;
        C0055ca.f1892l = 0;
        this.f371b.f2149aq.m1604b();
        this.f371b.f2149aq.m1601a("帮派宝库");
        this.f371b.f2149aq.m1603a(true);
        this.f371b.f2151as.m1610a(new String[]{"宝库一", "宝库二", "宝库三"});
        this.f371b.f2151as.m1607a((byte) 1);
        this.f371b.f2149aq.m1597a(C0088t.f2519e <= 240 ? 79 : 120);
        if (this.f370a.f357j == 115 || this.f370a.f357j == 64) {
            this.f370a.f230aq = this.f370a.f201aF;
            this.f370a.f231ar = this.f370a.f202aG;
            this.f371b.f2151as.f2353a = this.f370a.f203aH;
        } else {
            C0015ao c0015ao = this.f370a;
            this.f370a.f231ar = 0;
            c0015ao.f230aq = 0;
        }
        int i = (this.f371b.f2151as.f2353a << 5) + (this.f370a.f231ar << 3) + this.f370a.f230aq;
        if (C0047bt.f1273iN == null || i >= C0047bt.f1273iN.length) {
            this.f371b.f2152at.m77a("没有物品,按3、9键可以上下翻滚此属性描述框", C0088t.f2523i, (byte) 1);
        } else {
            this.f371b.f2152at.m77a(C0047bt.f1339ja[i], C0088t.f2523i, (byte) 1);
        }
        this.f371b.f2153au.m1590a("操作");
        this.f371b.f2153au.m1592a(true);
        this.f371b.f2152at.m75a((byte) 1);
        this.f371b.f2149aq.m1600a(this.f371b.f2151as);
        this.f371b.f2149aq.m1600a(this.f371b.f2152at);
        this.f371b.f2149aq.m1600a(this.f371b.f2153au);
        this.f371b.f2149aq.m1598a(C0088t.f2520f, C0088t.f2521g, C0088t.f2518d, C0088t.f2519e);
        this.f371b.f2216j = this.f371b.f2217k;
        C0015ao c0015ao2 = this.f370a;
        this.f370a.f358k = (short) 115;
        c0015ao2.f357j = (short) 115;
    }

    /* renamed from: o */
    public final void m547o(int i) {
        byte b;
        byte b2;
        byte b3;
        byte b4;
        byte b5;
        byte b6;
        byte b7;
        byte b8;
        if (this.f371b.f2149aq != null) {
            this.f371b.f2149aq.mo70b(i);
        }
        if (this.f371b.f2127aA <= 40) {
            if (i != 2 && i != 518) {
                if (i == 8 || i == 516) {
                    switch (this.f371b.f2150ar.m1275g()) {
                        case 0:
                            int[] iArr = this.f378i;
                            byte[] bArr = C0047bt.f1270iK;
                            byte[] bArr2 = C0047bt.f1270iK;
                            byte b9 = bArr2[0];
                            bArr2[0] = (byte) (b9 - 1);
                            if (b9 <= 0) {
                                b4 = 0;
                            } else {
                                byte[] bArr3 = C0047bt.f1270iK;
                                b4 = bArr3[0];
                                bArr3[0] = (byte) (b4 - 1);
                            }
                            bArr[0] = b4;
                            iArr[0] = b4;
                            break;
                        case 1:
                            int[] iArr2 = this.f378i;
                            int[] iArr3 = C0047bt.f1272iM;
                            int i2 = C0047bt.f1272iM[0] + (-10000) <= 0 ? 0 : C0047bt.f1272iM[0] - 10000;
                            iArr3[0] = i2;
                            iArr2[1] = i2;
                            break;
                        case 2:
                            int[] iArr4 = this.f378i;
                            byte[] bArr4 = C0047bt.f1271iL;
                            byte[] bArr5 = C0047bt.f1271iL;
                            byte b10 = bArr5[0];
                            bArr5[0] = (byte) (b10 - 1);
                            if (b10 <= 0) {
                                b3 = 0;
                            } else {
                                byte[] bArr6 = C0047bt.f1271iL;
                                b3 = bArr6[0];
                                bArr6[0] = (byte) (b3 - 1);
                            }
                            bArr4[0] = b3;
                            iArr4[2] = b3;
                            break;
                    }
                }
            } else {
                switch (this.f371b.f2150ar.m1275g()) {
                    case 0:
                        int[] iArr5 = this.f378i;
                        byte[] bArr7 = C0047bt.f1270iK;
                        byte[] bArr8 = C0047bt.f1270iK;
                        byte b11 = bArr8[0];
                        bArr8[0] = (byte) (b11 + 1);
                        if (b11 >= C0047bt.f1270iK[1]) {
                            b2 = C0047bt.f1270iK[1];
                        } else {
                            byte[] bArr9 = C0047bt.f1270iK;
                            b2 = bArr9[0];
                            bArr9[0] = (byte) (b2 + 1);
                        }
                        bArr7[0] = b2;
                        iArr5[0] = b2;
                        break;
                    case 1:
                        int[] iArr6 = this.f378i;
                        int[] iArr7 = C0047bt.f1272iM;
                        int i3 = C0047bt.f1272iM[0] + 10000 >= C0047bt.f1272iM[1] ? C0047bt.f1272iM[1] : C0047bt.f1272iM[0] + 10000;
                        iArr7[0] = i3;
                        iArr6[1] = i3;
                        break;
                    case 2:
                        int[] iArr8 = this.f378i;
                        byte[] bArr10 = C0047bt.f1271iL;
                        byte[] bArr11 = C0047bt.f1271iL;
                        byte b12 = bArr11[0];
                        bArr11[0] = (byte) (b12 + 1);
                        if (b12 >= C0047bt.f1271iL[1]) {
                            b = C0047bt.f1271iL[1];
                        } else {
                            byte[] bArr12 = C0047bt.f1271iL;
                            b = bArr12[0];
                            bArr12[0] = (byte) (b + 1);
                        }
                        bArr10[0] = b;
                        iArr8[2] = b;
                        break;
                }
            }
            this.f371b.f2127aA++;
        } else if (this.f371b.f2159b != 2 && this.f371b.f2159b != 518) {
            if (this.f371b.f2159b == 8 || this.f371b.f2159b == 516) {
                switch (this.f371b.f2150ar.m1275g()) {
                    case 0:
                        int[] iArr9 = this.f378i;
                        byte[] bArr13 = C0047bt.f1270iK;
                        byte[] bArr14 = C0047bt.f1270iK;
                        byte b13 = bArr14[0];
                        bArr14[0] = (byte) (b13 - 1);
                        if (b13 <= 0) {
                            b8 = 0;
                        } else {
                            byte[] bArr15 = C0047bt.f1270iK;
                            b8 = bArr15[0];
                            bArr15[0] = (byte) (b8 - 1);
                        }
                        bArr13[0] = b8;
                        iArr9[0] = b8;
                        break;
                    case 1:
                        int[] iArr10 = this.f378i;
                        int[] iArr11 = C0047bt.f1272iM;
                        int i4 = C0047bt.f1272iM[0] + (-10000) <= 0 ? 0 : C0047bt.f1272iM[0] - 10000;
                        iArr11[0] = i4;
                        iArr10[1] = i4;
                        break;
                    case 2:
                        int[] iArr12 = this.f378i;
                        byte[] bArr16 = C0047bt.f1271iL;
                        byte[] bArr17 = C0047bt.f1271iL;
                        byte b14 = bArr17[0];
                        bArr17[0] = (byte) (b14 - 1);
                        if (b14 <= 0) {
                            b7 = 0;
                        } else {
                            byte[] bArr18 = C0047bt.f1271iL;
                            b7 = bArr18[0];
                            bArr18[0] = (byte) (b7 - 1);
                        }
                        bArr16[0] = b7;
                        iArr12[2] = b7;
                        break;
                }
            }
        } else {
            switch (this.f371b.f2150ar.m1275g()) {
                case 0:
                    int[] iArr13 = this.f378i;
                    byte[] bArr19 = C0047bt.f1270iK;
                    byte[] bArr20 = C0047bt.f1270iK;
                    byte b15 = bArr20[0];
                    bArr20[0] = (byte) (b15 + 1);
                    if (b15 >= C0047bt.f1270iK[1]) {
                        b6 = C0047bt.f1270iK[1];
                    } else {
                        byte[] bArr21 = C0047bt.f1270iK;
                        b6 = bArr21[0];
                        bArr21[0] = (byte) (b6 + 1);
                    }
                    bArr19[0] = b6;
                    iArr13[0] = b6;
                    break;
                case 1:
                    int[] iArr14 = this.f378i;
                    int[] iArr15 = C0047bt.f1272iM;
                    int i5 = C0047bt.f1272iM[0] + 10000 >= C0047bt.f1272iM[1] ? C0047bt.f1272iM[1] : C0047bt.f1272iM[0] + 10000;
                    iArr15[0] = i5;
                    iArr14[1] = i5;
                    break;
                case 2:
                    int[] iArr16 = this.f378i;
                    byte[] bArr22 = C0047bt.f1271iL;
                    byte[] bArr23 = C0047bt.f1271iL;
                    byte b16 = bArr23[0];
                    bArr23[0] = (byte) (b16 + 1);
                    if (b16 >= C0047bt.f1271iL[1]) {
                        b5 = C0047bt.f1271iL[1];
                    } else {
                        byte[] bArr24 = C0047bt.f1271iL;
                        b5 = bArr24[0];
                        bArr24[0] = (byte) (b5 + 1);
                    }
                    bArr22[0] = b5;
                    iArr16[2] = b5;
                    break;
            }
        }
        if (i == 1073741824 || i == 517) {
            if (this.f371b.f2150ar.m1275g() == 0) {
                this.f371b.m1435a("请输入物品掉率", 2);
                return;
            } else if (this.f371b.f2150ar.m1275g() == 1) {
                this.f371b.m1435a("请输入银两奖励", 2);
                return;
            } else {
                if (this.f371b.f2150ar.m1275g() == 2) {
                    this.f371b.m1435a("请输入经验加成", 2);
                    return;
                }
                return;
            }
        }
        if (i != 268435456) {
            if (i == 536870912) {
                m519b(true);
            }
        } else if (C0047bt.f1270iK[1] == 0 && C0047bt.f1272iM[1] == 0 && C0047bt.f1271iL[1] == 0) {
            this.f371b.m1442b("请输入正确的数目！");
        } else {
            m500b((byte) 2);
            this.f371b.f2126a = 0;
        }
    }

    /* renamed from: p */
    public final void m548p() {
        int i = (this.f371b.f2151as.f2353a << 5) + (this.f370a.f231ar << 3) + this.f370a.f230aq;
        if (C0047bt.f1273iN == null || i >= C0047bt.f1273iN.length) {
            this.f371b.f2152at.m77a("没有物品，按3、9键可以上下翻滚此属性描述框", C0088t.f2523i, (byte) 1);
        } else {
            this.f371b.f2152at.m77a(C0047bt.f1339ja[i], C0088t.f2523i, (byte) 1);
        }
        this.f371b.f2152at.m75a((byte) 1);
        C0055ca.f1892l = 0;
    }

    /* renamed from: p */
    public final void m549p(int i) {
        int i2;
        int i3;
        int i4 = 0;
        int i5 = this.f370a.f230aq + (this.f371b.f2151as.f2353a << 5) + (this.f370a.f231ar << 3);
        if (this.f370a.f359l == 0) {
            this.f370a.m401a(C0047bt.f1277iR);
            if (this.f371b.f2149aq != null) {
                this.f371b.f2149aq.mo70b(i);
            }
            if (i == 268435456 || i == 1073741824 || i == 517) {
                if (C0047bt.f1273iN == null || i5 >= C0047bt.f1273iN.length) {
                    return;
                }
                C0055ca.m1285a(this.f370a.f234au[(this.f370a.f231ar << 3) + this.f370a.f230aq][0] - 17, this.f370a.f234au[(this.f370a.f231ar << 3) + this.f370a.f230aq][1] + 17, new String[]{"查看", "取出", "丢弃", "整理"}, false);
                this.f370a.f359l = (short) 1;
            }
            if (i == 1024 || i == 2048) {
                m548p();
                return;
            }
            if (i == 8 || i == 516) {
                C0015ao c0015ao = this.f370a;
                if (this.f370a.f230aq <= 0) {
                    i2 = 7;
                } else {
                    C0015ao c0015ao2 = this.f370a;
                    i2 = c0015ao2.f230aq - 1;
                    c0015ao2.f230aq = i2;
                }
                c0015ao.f230aq = i2;
                m548p();
                return;
            }
            if (i == 2 || i == 518) {
                C0015ao c0015ao3 = this.f370a;
                if (this.f370a.f230aq < 7) {
                    C0015ao c0015ao4 = this.f370a;
                    i4 = c0015ao4.f230aq + 1;
                    c0015ao4.f230aq = i4;
                }
                c0015ao3.f230aq = i4;
                m548p();
                return;
            }
            if (i == 1 || i == 514) {
                C0015ao c0015ao5 = this.f370a;
                if (this.f370a.f231ar <= 0) {
                    i3 = 3;
                } else {
                    C0015ao c0015ao6 = this.f370a;
                    i3 = c0015ao6.f231ar - 1;
                    c0015ao6.f231ar = i3;
                }
                c0015ao5.f231ar = i3;
                m548p();
                return;
            }
            if (i != 4 && i != 520) {
                if (i == 536870912) {
                    this.f370a.f226am = null;
                    m519b(true);
                    return;
                }
                return;
            }
            C0015ao c0015ao7 = this.f370a;
            if (this.f370a.f231ar < 3) {
                C0015ao c0015ao8 = this.f370a;
                i4 = c0015ao8.f231ar + 1;
                c0015ao8.f231ar = i4;
            }
            c0015ao7.f231ar = i4;
            m548p();
            return;
        }
        if (this.f370a.f359l != 1) {
            if (this.f370a.f359l == 2) {
                if (this.f371b.f2149aq != null) {
                    this.f371b.f2149aq.mo70b(i);
                }
                if (i == 536870912) {
                    m546o();
                    return;
                }
                return;
            }
            if (this.f370a.f359l == 3 || this.f370a.f359l == 6) {
                this.f370a.m421b(i);
                if (i != 268435456 && i != 1073741824 && i != 517) {
                    if (i == 536870912) {
                        this.f370a.f359l = (short) 1;
                        return;
                    }
                    return;
                }
                if (C0047bt.f1273iN == null || i5 >= C0047bt.f1273iN.length || C0047bt.f1276iQ[i5] <= 0) {
                    return;
                }
                C0055ca.f1888h = 0;
                if (this.f370a.f359l == 3) {
                    C0055ca.f1888h = 0;
                    String str = C0047bt.f1274iO[i5];
                    this.f370a.f233at = new StringBuffer().append("您确定取出").append((C0055ca.m1280a(str) != -1 ? C0055ca.m1280a(str) : 15138723) != 15138723 ? str.substring(3, str.length()) : str).append("X").append(this.f370a.f221ag).append("？").toString();
                    this.f370a.f359l = (short) 5;
                    return;
                }
                C0055ca.f1888h = 0;
                String str2 = C0047bt.f1274iO[i5];
                this.f370a.f233at = new StringBuffer().append("您确定丢弃").append((C0055ca.m1280a(str2) != -1 ? C0055ca.m1280a(str2) : 15138723) != 15138723 ? str2.substring(3, str2.length()) : str2).append("X").append(this.f370a.f221ag).append("？").toString();
                this.f370a.f359l = (short) 4;
                return;
            }
            if (this.f370a.f359l == 4) {
                if (i != 268435456 && i != 1073741824 && i != 517) {
                    if (i == 536870912) {
                        C0055ca.f1888h = 0;
                        this.f370a.f359l = (short) 0;
                        return;
                    }
                    return;
                }
                if (C0047bt.f1276iQ[i5] > 1) {
                    m502c((byte) this.f370a.f221ag);
                } else {
                    m502c(C0047bt.f1276iQ[i5]);
                }
                this.f370a.f359l = (short) 0;
                C0055ca.f1888h = 0;
                return;
            }
            if (this.f370a.f359l == 5) {
                if (i != 268435456 && i != 1073741824 && i != 517) {
                    if (i == 536870912) {
                        C0055ca.f1888h = 0;
                        this.f370a.f359l = (short) 0;
                        return;
                    }
                    return;
                }
                if (C0047bt.f1276iQ[i5] > 1) {
                    m503d((byte) this.f370a.f221ag);
                } else {
                    m503d(C0047bt.f1276iQ[i5]);
                }
                C0055ca.f1888h = 0;
                this.f370a.f359l = (short) 0;
                return;
            }
            return;
        }
        C0055ca.m1317b(i);
        if (i != 268435456 && i != 517 && i != 1073741824) {
            if (i == 536870912) {
                this.f370a.f359l = (short) 0;
                return;
            }
            return;
        }
        if (C0047bt.f1273iN == null || i5 >= C0047bt.f1273iN.length || C0047bt.f1276iQ[i5] <= 0) {
            return;
        }
        switch (C0055ca.f1895o) {
            case 0:
                if (C0047bt.m825a(C0047bt.f1275iP[i5])) {
                    C0047bt.f1406ko = C0047bt.f1273iN[i5];
                    C0047bt.f1407kp = C0047bt.f1274iO[i5];
                    C0047bt.f1408kq = C0047bt.f1274iO[i5];
                    C0047bt.f1410ks = C0047bt.f1278iS[i5];
                    C0047bt.f1411kt = C0047bt.f1279iT[i5];
                    C0047bt.f1412ku = C0047bt.f1280iU[i5];
                    C0047bt.f1413kv = C0047bt.f1281iV[i5];
                    C0047bt.f1414kw = C0047bt.f1282iW[i5];
                    C0047bt.f1415kx = C0047bt.f1283iX[i5];
                    if (C0047bt.f1340jb[i5] != null) {
                        int length = (byte) C0047bt.f1340jb[i5].length;
                        if (length > 0) {
                            C0047bt.f1409kr = new short[length];
                            for (byte b = 0; b < length; b = (byte) (b + 1)) {
                                C0047bt.f1409kr[b] = C0047bt.f1340jb[i5][b];
                            }
                        }
                    } else {
                        C0047bt.f1409kr = null;
                    }
                    C0047bt.f1416ky = C0047bt.f1284iY[i5];
                    C0047bt.f1417kz = (byte) -1;
                    C0047bt.f1366kA = C0047bt.f1339ja[i5];
                    this.f370a.f185O.m1620a(0, this.f370a.f358k, -1);
                } else {
                    this.f371b.f2149aq.mo71j();
                    this.f371b.f2149aq.m1604b();
                    this.f371b.f2149aq.m1601a("宝物详情");
                    if (C0047bt.f1339ja != null && i5 < C0047bt.f1339ja.length && C0047bt.f1339ja[i5] != null) {
                        this.f371b.f2152at.m77a(new StringBuffer().append(C0047bt.f1274iO[i5]).append("：\t").append(C0047bt.f1339ja[i5]).toString(), C0088t.f2523i, (byte) 1);
                    }
                    this.f371b.f2149aq.m1600a(this.f371b.f2152at);
                    this.f371b.f2149aq.m1598a(C0088t.f2520f, C0088t.f2521g, C0088t.f2518d, C0088t.f2519e);
                    this.f370a.f359l = (short) 2;
                }
                this.f370a.f201aF = this.f370a.f230aq;
                this.f370a.f202aG = this.f370a.f231ar;
                this.f370a.f203aH = this.f371b.f2151as.f2353a;
                break;
            case 1:
                if (C0047bt.f1276iQ[i5] > 1) {
                    this.f370a.m380a(C0047bt.f1276iQ[i5]);
                    this.f370a.f359l = (short) 3;
                    break;
                } else {
                    C0055ca.f1888h = 0;
                    String str3 = C0047bt.f1274iO[i5];
                    this.f370a.f233at = new StringBuffer().append("您确定取出").append((C0055ca.m1280a(str3) != -1 ? C0055ca.m1280a(str3) : 15138723) != 15138723 ? str3.substring(3, str3.length()) : str3).append("X").append((int) C0047bt.f1276iQ[i5]).append("？").toString();
                    this.f370a.f359l = (short) 5;
                    break;
                }
            case 2:
                if (C0047bt.f1276iQ[i5] > 1) {
                    this.f370a.m380a(C0047bt.f1276iQ[i5]);
                    this.f370a.f359l = (short) 6;
                    break;
                } else {
                    C0055ca.f1888h = 0;
                    String str4 = C0047bt.f1274iO[i5];
                    this.f370a.f233at = new StringBuffer().append("您确定丢弃").append((C0055ca.m1280a(str4) != -1 ? C0055ca.m1280a(str4) : 15138723) != 15138723 ? str4.substring(3, str4.length()) : str4).append("X").append((int) C0047bt.f1276iQ[i5]).append("？").toString();
                    this.f370a.f359l = (short) 4;
                    break;
                }
            case 3:
                byte[] bArrM1025C = C0053bz.m1025C((short) 4366, C0047bt.f865ad);
                if (bArrM1025C != null) {
                    RunnableC0066a.f2115i.m600a(new C0091w((short) 4366, bArrM1025C));
                    this.f370a.f354e.m1434a((String) null);
                } else {
                    this.f370a.f354e.m1442b("获取上传指令数据错误!");
                }
                this.f370a.f359l = (short) 0;
                break;
        }
    }

    /* renamed from: q */
    public final void m550q() {
        this.f379j = 0L;
        this.f366B = (short) 0;
        this.f367C = (short) 0;
        this.f368D = (short) 0;
        this.f369E = (short) 0;
    }

    /* renamed from: q */
    public final void m551q(int i) {
        byte[] bArrM1205k = C0053bz.m1205k(i == 0 ? (short) 4230 : (short) 4232, C0047bt.f865ad, C0047bt.f1170gQ);
        if (bArrM1205k == null) {
            this.f371b.m1442b("获取上传指令数据错误!");
        } else {
            RunnableC0066a.f2115i.m600a(new C0091w(i != 0 ? (short) 4232 : (short) 4230, bArrM1205k));
            this.f371b.m1434a((String) null);
        }
    }

    /* renamed from: r */
    public final void m552r() {
        byte[] bArrM1235s = C0053bz.m1235s((short) 4236, C0047bt.f865ad);
        if (bArrM1235s == null) {
            this.f371b.m1442b("获取上传指令数据错误!");
        } else {
            RunnableC0066a.f2115i.m600a(new C0091w((short) 4236, bArrM1235s));
            this.f371b.m1434a((String) null);
        }
    }

    /* renamed from: r */
    public final void m553r(int i) {
        if (this.f370a.f359l != 0) {
            if (this.f370a.f359l == 1) {
                C0055ca.m1317b(i);
                if (i != 268435456 && i != 1073741824 && i != 517) {
                    if (i == 536870912) {
                        this.f370a.f359l = (short) 0;
                        return;
                    }
                    return;
                } else {
                    byte[] bArrM1207l = C0053bz.m1207l((short) 4233, C0047bt.f865ad, C0047bt.f1353jo[this.f371b.f2150ar.m1275g()]);
                    if (bArrM1207l == null) {
                        this.f371b.m1442b("获取上传指令数据错误!");
                        return;
                    } else {
                        RunnableC0066a.f2115i.m600a(new C0091w((short) 4233, bArrM1207l));
                        this.f371b.m1434a((String) null);
                        return;
                    }
                }
            }
            if (this.f370a.f359l == 2) {
                C0055ca.m1317b(i);
                if (i != 268435456 && i != 1073741824 && i != 517) {
                    if (i == 536870912) {
                        this.f370a.f359l = (short) 0;
                        return;
                    }
                    return;
                } else {
                    if (C0055ca.f1895o == 0) {
                        this.f370a.m383a(C0047bt.f1357js[this.f371b.f2150ar.m1275g()], C0047bt.f1356jr[this.f371b.f2150ar.m1275g()], C0047bt.f1359ju[this.f371b.f2150ar.m1275g()], (byte) 0, (byte) 4);
                        return;
                    }
                    if (C0055ca.f1895o == 1) {
                        byte[] bArrM1249y = C0053bz.m1249y((short) 4237, C0047bt.f865ad, C0047bt.f1356jr[this.f371b.f2150ar.m1275g()]);
                        if (bArrM1249y == null) {
                            this.f371b.m1442b("获取上传指令数据错误!");
                            return;
                        } else {
                            RunnableC0066a.f2115i.m600a(new C0091w((short) 4237, bArrM1249y));
                            this.f371b.m1434a((String) null);
                            return;
                        }
                    }
                    return;
                }
            }
            return;
        }
        if (this.f371b.f2149aq != null) {
            this.f371b.f2149aq.mo70b(i);
        }
        if (i == 8 || i == 516 || i == 2 || i == 518) {
            C0047bt.f1170gQ = (short) 1;
            m551q(this.f371b.f2151as.f2353a);
            if (this.f371b.f2151as.f2353a == 0) {
                this.f371b.f2153au.m1590a("选择");
                this.f371b.f2153au.m1592a(true);
            } else if (this.f371b.f2151as.f2353a == 1) {
                this.f371b.f2153au.m1590a("购买");
                this.f371b.f2153au.m1592a(true);
            }
        }
        if ((i == 1 || i == 514 || i == 4 || i == 520) && (this.f371b.f2151as.f2353a != 0 ? C0047bt.f1358jt != null : C0047bt.f1355jq != null)) {
            this.f371b.f2152at.m79b(this.f371b.f2151as.f2353a == 0 ? C0047bt.f1355jq[this.f371b.f2150ar.m1275g()] : C0047bt.f1358jt[this.f371b.f2150ar.m1275g()], C0088t.f2523i, (byte) 2);
            this.f371b.f2152at.m75a((byte) 1);
        }
        if (i == 268435456 || i == 1073741824 || i == 517) {
            if (this.f371b.f2151as.f2353a == 0 && C0047bt.f1353jo != null) {
                C0055ca.m1285a(C0088t.f2520f + 0, (C0088t.f2524j * 2) + 11 + (this.f371b.f2150ar.m1277i() * C0088t.f2524j) + C0088t.f2521g, new String[]{"购买"}, true);
                this.f370a.f359l = (short) 1;
                return;
            } else {
                if (this.f371b.f2151as.f2353a != 1 || C0047bt.f1356jr == null) {
                    return;
                }
                C0055ca.m1285a(C0088t.f2520f + 0, (C0088t.f2524j * 2) + 11 + (this.f371b.f2150ar.m1277i() * C0088t.f2524j) + C0088t.f2521g, new String[]{"布置", "卖出"}, true);
                this.f370a.f359l = (short) 2;
                return;
            }
        }
        if (i == 536870912) {
            C0047bt.m774I();
            C0047bt.m776J();
            C0015ao c0015ao = this.f370a;
            this.f370a.f358k = (short) 0;
            c0015ao.f357j = (short) 0;
            return;
        }
        if (i != 1024) {
            if (i == 2048) {
                if (C0047bt.f1170gQ <= 1 && C0047bt.f1171gR == 1) {
                    C0047bt.f1170gQ = (short) (C0047bt.f1170gQ + 1);
                    m551q(this.f371b.f2151as.f2353a);
                    return;
                } else {
                    if (C0047bt.f1170gQ <= 1 || C0047bt.f1171gR != 1) {
                        return;
                    }
                    C0047bt.f1170gQ = (short) (C0047bt.f1170gQ + 1);
                    m551q(this.f371b.f2151as.f2353a);
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
            m551q(this.f371b.f2151as.f2353a);
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
        m551q(this.f371b.f2151as.f2353a);
    }

    /* renamed from: s */
    public final void m554s() {
        this.f371b.f2149aq.mo71j();
        this.f371b.f2149aq.m1601a("区域建设");
        this.f371b.f2149aq.m1603a(true);
        this.f371b.f2151as.m1610a(new String[]{"购买", "仓库"});
        this.f371b.f2150ar.m1266a((Image[]) null, C0047bt.f1354jp, (String[]) null, (String[]) null);
        this.f371b.f2152at.m79b(C0047bt.f1355jq != null ? C0047bt.f1355jq[this.f371b.f2150ar.m1275g()] : null, C0088t.f2523i, (byte) 2);
        this.f371b.f2152at.m75a((byte) 1);
        this.f371b.f2153au.m1590a("购买");
        this.f371b.f2153au.m1592a(true);
        this.f371b.f2149aq.m1600a(this.f371b.f2151as);
        this.f371b.f2149aq.m1600a(this.f371b.f2150ar);
        this.f371b.f2149aq.m1600a(this.f371b.f2152at);
        this.f371b.f2149aq.m1600a(this.f371b.f2153au);
        this.f371b.f2149aq.m1598a(C0088t.f2520f, C0088t.f2521g, C0088t.f2518d, C0088t.f2519e);
        this.f370a.f359l = (short) 0;
        this.f371b.f2216j = this.f371b.f2217k;
        C0015ao c0015ao = this.f370a;
        this.f370a.f358k = (short) 52;
        c0015ao.f357j = (short) 52;
    }

    /* renamed from: s */
    public final void m555s(int i) {
        if (this.f370a.f359l != 0) {
            if (this.f370a.f359l == 1) {
                C0055ca.m1317b(i);
                if (i != 268435456 && i != 1073741824 && i != 517) {
                    if (i == 536870912) {
                        this.f370a.f359l = (short) 0;
                        return;
                    }
                    return;
                }
                this.f371b.f2155aw = C0055ca.f1895o;
                if (C0055ca.f1895o == 0) {
                    m501b(C0047bt.f1337jY[this.f371b.f2150ar.m1275g() - 1]);
                    return;
                }
                if (C0055ca.f1895o == 1) {
                    C0055ca.m1285a(0, C0088t.f2524j + 11 + (this.f371b.f2150ar.m1277i() * C0088t.f2524j) + C0088t.f2521g, new String[]{"中立", "敌对"}, true);
                    this.f370a.f359l = (short) 2;
                    return;
                } else {
                    if (C0055ca.f1895o == 2) {
                        C0055ca.f1888h = 0;
                        this.f370a.f359l = (short) 3;
                        return;
                    }
                    return;
                }
            }
            if (this.f370a.f359l != 2) {
                if (this.f370a.f359l == 3) {
                    if (i == 268435456 || i == 1073741824 || i == 517) {
                        this.f371b.m1435a("输入OK确认宣战", 0);
                        return;
                    } else {
                        if (i == 536870912) {
                            this.f370a.f359l = (short) 0;
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            C0055ca.m1317b(i);
            if (i != 268435456 && i != 1073741824 && i != 517) {
                if (i == 536870912) {
                    this.f370a.f359l = (short) 0;
                    return;
                }
                return;
            } else if (C0055ca.f1895o == 0) {
                m508a((byte) 1, C0047bt.f1337jY[this.f371b.f2150ar.m1275g() - 1]);
                return;
            } else {
                if (C0055ca.f1895o == 1) {
                    m508a((byte) 2, C0047bt.f1337jY[this.f371b.f2150ar.m1275g() - 1]);
                    return;
                }
                return;
            }
        }
        if (this.f371b.f2149aq != null) {
            this.f371b.f2149aq.mo70b(i);
        }
        if (i == 1 || i == 514 || i == 520 || i == 4) {
            this.f371b.f2150ar.m1260a(this.f371b.f2150ar.m1275g() == this.f371b.f2150ar.m1276h() ? "帮派搜索" : m504w(this.f371b.f2150ar.m1275g() - 1), 1);
        }
        if (i == 268435456 || i == 1073741824 || i == 517) {
            this.f370a.f196aA = this.f371b.f2150ar.m1276h();
            this.f370a.f200aE = this.f371b.f2150ar.m1275g();
            if (this.f371b.f2150ar.m1275g() == this.f371b.f2150ar.m1276h()) {
                this.f371b.m1435a("请输入要搜索的帮派名称", 0);
                return;
            } else {
                if (C0047bt.f1337jY != null) {
                    C0055ca.m1285a((int) C0088t.f2520f, C0088t.f2524j + 11 + (this.f371b.f2150ar.m1277i() * C0088t.f2524j) + C0088t.f2521g, new String[]{"查看", "外交", "宣战"}, true);
                    this.f370a.f359l = (short) 1;
                    return;
                }
                return;
            }
        }
        if (i == 536870912) {
            C0015ao c0015ao = this.f370a;
            this.f370a.f358k = (short) 0;
            c0015ao.f357j = (short) 0;
            return;
        }
        if (i != 1024) {
            if (i == 2048) {
                if (C0047bt.f1170gQ <= 1 && C0047bt.f1171gR == 1) {
                    C0047bt.f1170gQ = (short) (C0047bt.f1170gQ + 1);
                    m511a(this.f384o);
                    return;
                } else {
                    if (C0047bt.f1170gQ <= 1 || C0047bt.f1171gR != 1) {
                        return;
                    }
                    C0047bt.f1170gQ = (short) (C0047bt.f1170gQ + 1);
                    m511a(this.f384o);
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
            m511a(this.f384o);
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
        m511a(this.f384o);
    }

    /* renamed from: t */
    public final void m556t() {
        this.f371b.f2150ar.m1266a((Image[]) null, C0047bt.f1357js, (String[]) null, (String[]) null);
        this.f371b.f2152at.m79b(C0047bt.f1358jt != null ? C0047bt.f1358jt[this.f371b.f2150ar.m1275g()] : null, C0088t.f2523i, (byte) 2);
        this.f371b.f2152at.m75a((byte) 1);
        this.f371b.f2153au.m1590a("选择");
        this.f371b.f2153au.m1592a(true);
        this.f370a.f359l = (short) 0;
        this.f371b.f2216j = this.f371b.f2217k;
        C0015ao c0015ao = this.f370a;
        this.f370a.f358k = (short) 52;
        c0015ao.f357j = (short) 52;
    }

    /* renamed from: t */
    public final void m557t(int i) {
        if (this.f370a.f359l == 0) {
            if (i == 268435456 || i == 1073741824 || i == 517) {
                byte[] bArrM1242v = C0053bz.m1242v((short) 4871, C0047bt.f865ad);
                if (bArrM1242v == null) {
                    this.f371b.m1442b("获取上传指令数据错误!");
                    return;
                } else {
                    RunnableC0066a.f2115i.m600a(new C0091w((short) 4871, bArrM1242v));
                    this.f371b.m1434a((String) null);
                    return;
                }
            }
            if (i == 536870912) {
                this.f370a.f225al = null;
                C0015ao c0015ao = this.f370a;
                this.f370a.f358k = (short) 0;
                c0015ao.f357j = (short) 0;
            }
        }
    }

    /* renamed from: u */
    public final void m558u() {
        int[] iArr;
        String[] strArr;
        this.f371b.f2149aq.mo71j();
        this.f371b.f2149aq.m1601a("帮派外交");
        this.f371b.f2149aq.m1603a(false);
        if (C0047bt.f1337jY == null || C0047bt.f1337jY.length <= 0) {
            iArr = null;
            strArr = null;
        } else {
            strArr = new String[C0047bt.f1337jY.length];
            int[] iArr2 = new int[C0047bt.f1337jY.length];
            for (int i = 0; i < strArr.length; i++) {
                strArr[i] = C0047bt.m897d(C0047bt.f1392ka[i]);
                if (C0047bt.f1392ka[i] == 2) {
                    iArr2[i] = 12845056;
                } else if (C0047bt.f1392ka[i] == 3) {
                    iArr2[i] = 16711680;
                } else {
                    iArr2[i] = 16776960;
                }
            }
            iArr = iArr2;
        }
        this.f371b.f2150ar.m1266a((Image[]) null, C0047bt.f1338jZ, (String[]) null, strArr);
        this.f371b.f2150ar.m1259a("搜索...");
        this.f371b.f2150ar.m1263a(iArr);
        this.f371b.f2150ar.m1260a("帮派搜索", 1);
        this.f371b.f2153au.m1590a("确定");
        this.f371b.f2153au.m1592a(true);
        this.f371b.f2149aq.m1600a(this.f371b.f2150ar);
        this.f371b.f2149aq.m1600a(this.f371b.f2153au);
        this.f371b.f2149aq.m1598a(C0088t.f2520f, C0088t.f2521g, C0088t.f2518d, C0088t.f2519e);
        C0055ca.f1892l = 0;
        this.f370a.f359l = (short) 0;
        this.f371b.f2216j = this.f371b.f2217k;
        C0015ao c0015ao = this.f370a;
        this.f370a.f358k = (short) 60;
        c0015ao.f357j = (short) 60;
    }

    /* renamed from: u */
    public final void m559u(int i) {
        if (this.f370a.f359l != 0 || C0047bt.f1370kE == null) {
            return;
        }
        if (this.f371b.f2149aq != null) {
            this.f371b.f2149aq.mo70b(i);
        }
        if (i == 1 || i == 514 || i == 520 || i == 4) {
            this.f371b.f2152at.m79b(C0047bt.f1371kF[this.f371b.f2150ar.m1275g()], C0088t.f2523i, (byte) 2);
            this.f371b.f2152at.m75a((byte) 1);
        }
        if (i != 268435456 && i != 1073741824 && i != 517) {
            if (i == 536870912) {
                this.f370a.f359l = (short) 0;
                C0015ao c0015ao = this.f370a;
                this.f370a.f358k = (short) 0;
                c0015ao.f357j = (short) 0;
                return;
            }
            return;
        }
        this.f370a.f196aA = this.f371b.f2150ar.m1276h();
        this.f370a.f200aE = this.f371b.f2150ar.m1275g();
        switch (this.f370a.f200aE) {
            case 0:
                this.f371b.m1435a("请输入警告语（30个字符内）", 0);
                break;
            case 1:
            case 2:
            case 3:
                m516b((byte) this.f371b.f2150ar.m1275g(), null);
                break;
        }
    }

    /* renamed from: v */
    public final void m560v() {
        this.f370a.m360M();
        if (this.f371b.f2159b == 8 || this.f371b.f2159b == 516) {
            C0015ao.f167h = C0015ao.f167h + (-4) < 0 ? 0 : C0015ao.f167h - 4;
        } else if (this.f371b.f2159b == 2 || this.f371b.f2159b == 518) {
            C0015ao.f167h = C0015ao.f167h + 4 > this.f370a.f355f.f456a - C0088t.f2516b ? this.f370a.f355f.f456a - C0088t.f2516b : C0015ao.f167h + 4;
        } else if (this.f371b.f2159b == 1 || this.f371b.f2159b == 514) {
            C0015ao.f168i = C0015ao.f168i + (-4) < 0 ? 0 : C0015ao.f168i - 4;
        } else if (this.f371b.f2159b == 4 || this.f371b.f2159b == 520) {
            C0015ao.f168i = C0015ao.f168i + 4 > this.f370a.f355f.f457b - C0088t.f2517c ? this.f370a.f355f.f457b - C0088t.f2517c : C0015ao.f168i + 4;
        }
        if (C0047bt.f937bw != 2 || C0047bt.f1401kj == 0) {
            C0047bt.f1401kj = (short) 0;
            C0015ao.f167h = this.f388s;
            C0015ao.f168i = this.f389t;
            this.f370a.f359l = (short) 0;
            C0015ao c0015ao = this.f370a;
            this.f370a.f358k = (short) 0;
            c0015ao.f357j = (short) 0;
            this.f371b.f2159b = 0;
            this.f371b.f2126a = 0;
        }
    }

    /* renamed from: v */
    public final void m561v(int i) {
        if (this.f370a.f359l == 0) {
            if (this.f371b.f2149aq != null) {
                this.f371b.f2149aq.mo70b(i);
            }
            if (i == 268435456 || i == 1073741824 || i == 517) {
                m497a((byte) 2);
            } else if (i == 536870912) {
                m514a(true);
            }
        }
    }

    /* renamed from: w */
    public final void m562w() {
        C0055ca.f1888h = 0;
        this.f370a.f359l = (short) 0;
        this.f371b.f2216j = this.f371b.f2217k;
        C0015ao c0015ao = this.f370a;
        this.f370a.f358k = (short) 62;
        c0015ao.f357j = (short) 62;
    }

    /* renamed from: x */
    public final void m563x() {
        if (C0047bt.f1370kE != null) {
            this.f371b.f2149aq.mo71j();
            this.f371b.f2149aq.m1601a("战争捷报");
            this.f371b.f2149aq.m1603a(false);
            this.f371b.f2150ar.m1266a((Image[]) null, C0047bt.f1370kE, (String[]) null, (String[]) null);
            this.f371b.f2152at.m79b(C0047bt.f1371kF[0], C0088t.f2523i, (byte) 2);
            this.f371b.f2152at.m75a((byte) 1);
            this.f371b.f2153au.m1590a("确定");
            this.f371b.f2149aq.m1600a(this.f371b.f2150ar);
            this.f371b.f2149aq.m1600a(this.f371b.f2152at);
            this.f371b.f2149aq.m1600a(this.f371b.f2153au);
            C0081m c0081m = this.f371b.f2149aq;
            c0081m.f2332e = (C0088t.f2524j * 2) + 8;
            int i = c0081m.f2332e;
            this.f371b.f2149aq.m1598a(C0088t.f2520f, C0088t.f2521g, C0088t.f2518d, C0088t.f2519e);
            this.f370a.f359l = (short) 0;
            this.f371b.f2216j = this.f371b.f2217k;
            C0015ao c0015ao = this.f370a;
            this.f370a.f358k = (short) 63;
            c0015ao.f357j = (short) 63;
        }
    }

    /* renamed from: y */
    public final void m564y() {
        this.f371b.f2149aq.m1604b();
        this.f371b.f2149aq.m1601a("帮派升级");
        this.f371b.f2149aq.m1603a(false);
        this.f371b.f2152at.m79b(C0047bt.f1520mw == null ? "暂无帮派升级信息" : C0047bt.f1520mw, C0088t.f2523i, (byte) 0);
        this.f371b.f2149aq.m1600a(this.f371b.f2152at);
        this.f371b.f2153au.m1590a("升级");
        this.f371b.f2149aq.m1600a(this.f371b.f2152at);
        if (C0088t.f2517c > 220) {
            this.f371b.f2149aq.m1600a(this.f371b.f2153au);
        }
        this.f371b.f2149aq.m1598a(C0088t.f2520f, C0088t.f2521g, C0088t.f2518d, C0088t.f2519e);
        this.f370a.f359l = (short) 0;
        this.f371b.f2216j = this.f371b.f2217k;
        C0015ao c0015ao = this.f370a;
        this.f370a.f358k = (short) 113;
        c0015ao.f357j = (short) 113;
    }
}

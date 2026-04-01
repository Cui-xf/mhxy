package p000;

import com.yinhan.kjava.main.RunnableC0066a;
import java.io.DataInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import javax.microedition.lcdui.Graphics;

/* renamed from: ch */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-4234804660425969496/classes.dex */
public final class C0062ch {

    /* renamed from: h */
    private static int f1997h;

    /* renamed from: i */
    private static String f1998i;

    /* renamed from: j */
    private static short f1999j;

    /* renamed from: k */
    private static String f2000k;

    /* renamed from: l */
    private static double f2001l;

    /* renamed from: m */
    private static String f2002m;

    /* renamed from: n */
    private static int[] f2003n;

    /* renamed from: o */
    private static byte f2004o;

    /* renamed from: p */
    private static byte f2005p;

    /* renamed from: q */
    private static boolean[] f2006q;

    /* renamed from: r */
    private static String f2007r;

    /* renamed from: s */
    private static String f2008s;

    /* renamed from: t */
    private static byte f2009t;

    /* renamed from: u */
    private static String f2010u;

    /* renamed from: A */
    private boolean f2011A = false;

    /* renamed from: a */
    public int[][] f2012a;

    /* renamed from: b */
    public int f2013b;

    /* renamed from: c */
    private C0015ao f2014c;

    /* renamed from: d */
    private RunnableC0066a f2015d;

    /* renamed from: e */
    private C0009ai f2016e;

    /* renamed from: f */
    private String f2017f;

    /* renamed from: g */
    private C0050bw f2018g;

    /* renamed from: v */
    private int f2019v;

    /* renamed from: w */
    private int f2020w;

    /* renamed from: x */
    private int f2021x;

    /* renamed from: y */
    private C0033bf f2022y;

    /* renamed from: z */
    private C0033bf f2023z;

    public C0062ch(C0015ao c0015ao, RunnableC0066a runnableC0066a, C0009ai c0009ai) {
        this.f2014c = c0015ao;
        this.f2015d = runnableC0066a;
        this.f2016e = c0009ai;
    }

    /* renamed from: a */
    public static void m1353a() {
        f1997h = -1;
        f1999j = (short) -1;
        f2000k = "";
        f2001l = 0.0d;
        f2002m = "";
        f2003n = new int[3];
        f2006q = new boolean[3];
        for (int i = 0; i < 3; i++) {
            f2003n[i] = 0;
            f2006q[i] = false;
        }
        f2005p = (byte) -1;
        f2009t = (byte) 0;
        f1998i = "";
        f2008s = "";
        f2007r = "";
        C0047bt.m784N();
    }

    /* renamed from: c */
    private void m1354c() {
        if (this.f2012a != null) {
            for (int i = 0; i < this.f2012a.length; i++) {
                if (this.f2012a[i] != null) {
                    this.f2012a[i] = null;
                }
            }
            this.f2012a = null;
        }
    }

    /* renamed from: d */
    private void m1355d() {
        if (f2007r == null || f2007r.equals("")) {
            this.f2015d.f2152at.m77a((String) null, C0088t.f2523i, (byte) 1);
        } else {
            this.f2015d.f2152at.m77a(new StringBuffer().append(f2002m).append("\t").append(f1998i).append("\t").append(f2008s).append("\t").append(f2007r).toString(), C0088t.f2523i, (byte) 1);
        }
    }

    /* renamed from: e */
    private void m1356e() {
        this.f2018g = null;
        if (f2010u != null) {
            this.f2018g = new C0050bw(f2010u, (short) C0088t.f2523i.stringWidth(f2010u));
        }
    }

    /* renamed from: a */
    public final void m1357a(int i) throws IOException {
        C0041bn c0041bn;
        byte b = 2;
        if (f2009t == 1) {
            f2009t = (byte) 0;
            this.f2015d.m1442b("升星成功");
        }
        if (this.f2014c.f359l != 0) {
            if (this.f2014c.f359l == 1) {
                C0055ca.m1317b(i);
                if (i != 268435456 && i != 1073741824) {
                    if (i == 536870912) {
                        this.f2014c.f359l = (short) 0;
                        return;
                    }
                    return;
                }
                if (C0055ca.f1895o == 0) {
                    if (f2006q[0]) {
                        b = 0;
                    } else if (f2006q[1]) {
                        b = 1;
                    } else if (!f2006q[2]) {
                        b = -1;
                    }
                    f2005p = b;
                    if (f1997h == -1) {
                        this.f2015d.m1442b("请先放入装备");
                    } else if (f2002m.equals("不能升级")) {
                        this.f2015d.m1442b("该装备不能升星，请选择其它装备");
                    } else {
                        byte[] bArrM1047a = C0053bz.m1047a((short) 4689, f1997h, (byte) 1, f2005p, C0047bt.f865ad);
                        if (bArrM1047a != null) {
                            RunnableC0066a.f2115i.m600a(new C0091w((short) 4689, bArrM1047a));
                            this.f2015d.m1434a((String) null);
                        } else {
                            this.f2015d.m1442b("获取上传指令数据错误!");
                        }
                    }
                    byte[] bArrM1047a2 = C0053bz.m1047a((short) 4689, f1997h, (byte) 1, f2005p, C0047bt.f865ad);
                    if (bArrM1047a2 == null) {
                        this.f2015d.m1442b("获取上传指令数据错误!");
                        return;
                    } else {
                        RunnableC0066a.f2115i.m600a(new C0091w((short) 4689, bArrM1047a2));
                        this.f2015d.m1434a((String) null);
                        return;
                    }
                }
                if (C0055ca.f1895o != 1) {
                    if (C0055ca.f1895o == 2) {
                        m1353a();
                        m1355d();
                        m1361b();
                        m1356e();
                        this.f2014c.f359l = (short) 0;
                        return;
                    }
                    return;
                }
                if (this.f2014c.f236aw && !this.f2011A) {
                    C0047bt.m817a(this.f2014c.f235av);
                } else if (!this.f2014c.f205aJ || this.f2011A) {
                    int i2 = f1997h;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= C0047bt.f891bC.size()) {
                            c0041bn = null;
                            break;
                        }
                        c0041bn = (C0041bn) C0047bt.f891bC.elementAt(i3);
                        if (c0041bn != null && c0041bn.f714a == i2) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    if (c0041bn != null) {
                        C0047bt.m819a(c0041bn);
                    } else {
                        this.f2015d.m1442b("装备不存在");
                    }
                } else {
                    C0047bt.m883b((int) C0015ao.m313l(this.f2014c.f230aq));
                }
                this.f2014c.f358k = (short) 102;
                this.f2014c.f185O.m1620a(0, this.f2014c.f358k, -1);
                return;
            }
            return;
        }
        if (this.f2015d.f2149aq != null) {
            this.f2015d.f2149aq.mo70b(i);
        }
        if (i == 8) {
            this.f2013b--;
            if (this.f2013b < 0) {
                this.f2013b = this.f2012a.length - 4;
            }
            if (this.f2013b == 0) {
                m1361b();
            }
            C0055ca.f1892l = 0;
            return;
        }
        if (i == 2) {
            this.f2013b++;
            if (this.f2013b >= this.f2012a.length - 3) {
                this.f2013b = 0;
                m1361b();
            }
            C0055ca.f1892l = 0;
            return;
        }
        if (i != 268435456 && i != 1073741824) {
            if (i == 536870912) {
                m1354c();
                this.f2017f = null;
                this.f2018g = null;
                if (this.f2014c.f236aw) {
                    this.f2014c.f236aw = false;
                    this.f2014c.m486t();
                    return;
                } else if (this.f2014c.f205aJ) {
                    this.f2014c.f205aJ = false;
                    this.f2014c.m434c(false);
                    return;
                } else {
                    this.f2014c.m471l();
                    this.f2014c.m430c(1);
                    return;
                }
            }
            return;
        }
        if (this.f2013b == 0) {
            if (f1997h == -1) {
                this.f2011A = true;
                this.f2014c.m377a((byte) 0, new byte[]{1});
                return;
            } else {
                C0055ca.m1285a(this.f2015d.f2149aq.f2328a + 24, this.f2015d.f2149aq.f2329b + 49, new String[]{"升星", "查看", "取出"}, false);
                this.f2014c.f359l = (short) 1;
                return;
            }
        }
        if (this.f2013b != 0) {
            int i4 = this.f2013b - 1;
            if (f2006q[i4]) {
                f2006q[i4] = false;
                f2001l -= 0.2d + ((i4 + 2) * (i4 * 0.1d));
                return;
            }
            if (f1997h == -1) {
                this.f2015d.m1442b("请先放入装备");
                return;
            }
            if (f2002m.equals("不能升级")) {
                this.f2015d.m1442b("该装备不能升星，请选择其它装备");
                return;
            }
            if (f2003n[i4] < 1) {
                this.f2015d.m1442b("该材料已经消耗完，请选择其它材料");
                return;
            }
            for (int i5 = 0; i5 < 3; i5++) {
                if (i4 == i5) {
                    f2006q[i4] = true;
                    f2001l += 0.2d + (i4 * 0.1d * (i4 + 2));
                } else if (f2006q[i5]) {
                    f2006q[i5] = false;
                    f2001l -= 0.2d + ((i5 * 0.1d) * (i5 + 2));
                }
            }
        }
    }

    /* renamed from: a */
    public final void m1358a(DataInputStream dataInputStream) {
        f1997h = dataInputStream.readInt();
        f1999j = dataInputStream.readShort();
        f2000k = dataInputStream.readUTF();
        f2002m = dataInputStream.readUTF();
        f2001l = dataInputStream.readDouble();
        f2003n[0] = dataInputStream.readInt();
        f2003n[1] = dataInputStream.readInt();
        f2003n[2] = dataInputStream.readInt();
        f2004o = dataInputStream.readByte();
        f2009t = dataInputStream.readByte();
        f1998i = dataInputStream.readUTF();
        f2008s = dataInputStream.readUTF();
        f2007r = dataInputStream.readUTF();
        switch (f2004o) {
            case 0:
                if (f2003n[0] >= 1) {
                    f2006q[0] = true;
                    f2001l += 0.2d;
                    break;
                } else {
                    f2006q[0] = false;
                    break;
                }
            case 1:
                if (f2003n[1] >= 1) {
                    f2006q[1] = true;
                    f2001l += 0.5d;
                    break;
                } else {
                    f2006q[1] = false;
                    break;
                }
            case 2:
                if (f2003n[2] >= 1) {
                    f2006q[2] = true;
                    f2001l += 1.0d;
                    break;
                } else {
                    f2006q[2] = false;
                    break;
                }
        }
    }

    /* renamed from: a */
    public final void m1359a(Graphics graphics) {
        if (this.f2015d.f2149aq != null) {
            this.f2015d.f2149aq.m1602a(graphics);
            C0055ca.m1292a(graphics, this.f2015d.f2149aq.f2328a + 5, this.f2015d.f2149aq.f2329b + 32, (this.f2015d.f2149aq.f2330c - 11) / 2, this.f2020w, 1);
            C0055ca.m1292a(graphics, this.f2015d.f2149aq.f2328a + 5, this.f2015d.f2149aq.f2329b + 32 + this.f2020w + 1, (this.f2015d.f2149aq.f2330c - 11) / 2, this.f2021x - 2, 1);
            C0055ca.m1292a(graphics, ((this.f2015d.f2149aq.f2330c - 11) / 2) + this.f2015d.f2149aq.f2328a + 5, this.f2015d.f2149aq.f2329b + 32, (this.f2015d.f2149aq.f2330c - 10) / 2, this.f2015d.f2149aq.f2331d - 62, 1);
        }
        if (this.f2012a != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= this.f2012a.length) {
                    break;
                }
                if (i2 == 0) {
                    this.f2016e.m64a(graphics, C0015ao.f178x, (int[]) null, (C0010aj) null, 0, 0, this.f2012a[i2][0], this.f2012a[i2][1], 0, 0);
                } else if (i2 < 4) {
                    this.f2016e.m64a(graphics, f2006q[i2 + (-1)] ? this.f2022y : this.f2023z, (int[]) null, (C0010aj) null, 0, 0, this.f2012a[i2][0], this.f2012a[i2][1], 0, 0);
                } else {
                    RunnableC0066a.f2100af.m1001e(String.valueOf(1702));
                    RunnableC0066a.f2114f.m64a(graphics, C0015ao.m264b((short) 1702), (int[]) null, (C0010aj) null, 0, 0, this.f2012a[i2][0], this.f2012a[i2][1], 0, 0);
                    if (f2003n[i2 - 4] > 99) {
                        RunnableC0066a.f2114f.m63a(graphics, RunnableC0066a.f2116n, (int[]) null, f2003n[i2 - 4] / 100, 0, 0, (this.f2012a[i2][0] + 13) - 8, this.f2012a[i2][1] + 11, 0, 0);
                        RunnableC0066a.f2114f.m63a(graphics, RunnableC0066a.f2116n, (int[]) null, (f2003n[i2 - 4] % 100) / 10, 0, 0, (this.f2012a[i2][0] + 13) - 4, this.f2012a[i2][1] + 11, 0, 0);
                        RunnableC0066a.f2114f.m63a(graphics, RunnableC0066a.f2116n, (int[]) null, f2003n[i2 - 4] % 100, 0, 0, this.f2012a[i2][0] + 13, this.f2012a[i2][1] + 11, 0, 0);
                    }
                    if (f2003n[i2 - 4] > 9) {
                        RunnableC0066a.f2114f.m63a(graphics, RunnableC0066a.f2116n, (int[]) null, f2003n[i2 - 4] / 10, 0, 0, (this.f2012a[i2][0] + 13) - 4, this.f2012a[i2][1] + 11, 0, 0);
                        RunnableC0066a.f2114f.m63a(graphics, RunnableC0066a.f2116n, (int[]) null, f2003n[i2 - 4] % 10, 0, 0, this.f2012a[i2][0] + 13, this.f2012a[i2][1] + 11, 0, 0);
                    } else if (f2003n[i2 - 4] >= 0) {
                        RunnableC0066a.f2114f.m63a(graphics, RunnableC0066a.f2116n, (int[]) null, f2003n[i2 - 4] % 10, 0, 0, this.f2012a[i2][0] + 13, this.f2012a[i2][1] + 11, 0, 0);
                    }
                }
                i = i2 + 1;
            }
        }
        graphics.setColor(255);
        graphics.drawString("装备孔", this.f2012a[0][0] + 8, this.f2012a[0][1] - 2, 33);
        graphics.drawString("幸运材料", this.f2012a[4][0] + 13, this.f2012a[4][1] - 12, 33);
        graphics.drawString("+20%", this.f2012a[4][0] + 42, this.f2012a[4][1] + 18, 33);
        graphics.drawString("+50%", this.f2012a[5][0] + 42, this.f2012a[5][1] + 18, 33);
        graphics.drawString("+100%", this.f2012a[6][0] + 42, this.f2012a[6][1] + 18, 33);
        if (f1997h != -1) {
            this.f2016e.m64a(graphics, C0015ao.m264b(f1999j), (int[]) null, (C0010aj) null, 0, 0, this.f2012a[0][0], this.f2012a[0][1], 0, 0);
        }
        C0055ca.m1328d(graphics, this.f2012a[this.f2013b][0], this.f2012a[this.f2013b][1], 17, 17);
        if (f1997h != -1) {
            double d = f2001l + 0.001d;
            if (d > 1.0d) {
                d = 1.0d;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("成功率：");
            stringBuffer.append((int) (d * 100.0d));
            stringBuffer.append("%");
            f2010u = stringBuffer.toString();
            m1356e();
            if (f2010u != null) {
                this.f2018g.m1017a(graphics, this.f2015d.f2149aq.f2328a + 5 + 6, this.f2015d.f2149aq.f2329b + 32 + this.f2020w + 6, 0);
            }
        }
        if (this.f2014c.f359l != 0) {
            if (this.f2014c.f359l == 1) {
                C0055ca.m1324c(graphics);
            }
        } else if (this.f2013b == 0) {
            if (this.f2017f == null && this.f2017f == "") {
                return;
            }
            C0055ca.m1321b(graphics, this.f2017f, this.f2015d.f2149aq.f2328a + 5 + 2, C0015ao.f178x.f600c + this.f2015d.f2149aq.f2329b + 32 + 8, C0088t.f2517c - 5, 1);
        }
    }

    /* renamed from: a */
    public final void m1360a(boolean z) {
        int i;
        int i2;
        if (z) {
            this.f2013b = 0;
            this.f2019v = 0;
        }
        if (f1997h != -1) {
            this.f2014c.m401a(new short[]{f1999j});
        }
        if (this.f2022y == null) {
            this.f2022y = RunnableC0066a.f2101ag.m985a("jianding_02");
            this.f2023z = RunnableC0066a.f2101ag.m985a("jianding_01");
        }
        m1354c();
        this.f2012a = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 7, 4);
        this.f2015d.f2149aq.m1604b();
        this.f2015d.f2149aq.m1601a("装备升星");
        this.f2015d.f2149aq.m1603a(false);
        this.f2020w = Math.max((C0088t.f2524j << 1) + 25, 59);
        this.f2021x = C0088t.f2524j + 13;
        this.f2015d.f2149aq.m1597a(this.f2020w + this.f2021x);
        m1355d();
        m1361b();
        this.f2015d.f2149aq.m1600a(this.f2015d.f2152at);
        this.f2015d.f2153au.m1590a("确定");
        if (C0088t.f2517c > 220) {
            this.f2015d.f2149aq.m1600a(this.f2015d.f2153au);
        }
        this.f2015d.f2149aq.m1598a(C0088t.f2520f, C0088t.f2521g, C0088t.f2518d, C0088t.f2519e);
        this.f2015d.f2152at.m76a(this.f2015d.f2152at.f108b, this.f2015d.f2152at.f109c, (this.f2015d.f2149aq.f2330c / 2) - 6, this.f2015d.f2152at.f111e);
        if (this.f2012a != null) {
            for (int i3 = 0; i3 < this.f2012a.length; i3++) {
                if (i3 == 0) {
                    i = (this.f2015d.f2149aq.f2328a + (this.f2015d.f2149aq.f2330c / 4)) - 8;
                    i2 = ((this.f2015d.f2149aq.f2329b + 32) + this.f2020w) - 30;
                } else if (i3 < 4) {
                    i = this.f2015d.f2149aq.f2328a + (this.f2015d.f2149aq.f2330c / 2) + 13;
                    i2 = (((this.f2015d.f2149aq.f2329b + 32) + (this.f2015d.f2149aq.f2331d / 4)) + ((i3 - 1) * 40)) - 20;
                } else {
                    i = (this.f2015d.f2149aq.f2328a + ((this.f2015d.f2149aq.f2330c * 3) / 4)) - 18;
                    i2 = (((this.f2015d.f2149aq.f2329b + 32) + (this.f2015d.f2149aq.f2331d / 4)) + ((i3 - 4) * 40)) - 20;
                }
                if (this.f2012a != null && this.f2012a.length > i3) {
                    this.f2012a[i3][0] = i;
                    this.f2012a[i3][1] = i2;
                    this.f2012a[i3][2] = 17;
                    this.f2012a[i3][3] = 17;
                }
            }
        }
        C0055ca.f1892l = 0;
        this.f2014c.f359l = (short) 0;
        this.f2015d.f2216j = this.f2015d.f2217k;
        C0015ao c0015ao = this.f2014c;
        this.f2014c.f358k = (short) 102;
        c0015ao.f357j = (short) 102;
    }

    /* renamed from: b */
    public final void m1361b() {
        this.f2017f = null;
        if (f2000k != null) {
            this.f2017f = f2000k;
        }
    }
}

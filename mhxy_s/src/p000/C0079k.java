package p000;

import com.yinhan.kjava.main.RunnableC0066a;
import java.io.DataInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import javax.microedition.lcdui.Graphics;

/* renamed from: k */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-4234804660425969496/classes.dex */
public final class C0079k {

    /* renamed from: a */
    public int f2282a;

    /* renamed from: b */
    public int f2283b;

    /* renamed from: c */
    public int f2284c;

    /* renamed from: d */
    public int f2285d;

    /* renamed from: e */
    public int[] f2286e;

    /* renamed from: f */
    public byte[] f2287f;

    /* renamed from: g */
    public int[][] f2288g;

    /* renamed from: i */
    private C0015ao f2290i;

    /* renamed from: j */
    private RunnableC0066a f2291j;

    /* renamed from: k */
    private short f2292k;

    /* renamed from: l */
    private String f2293l;

    /* renamed from: m */
    private String f2294m;

    /* renamed from: n */
    private short f2295n;

    /* renamed from: o */
    private String f2296o;

    /* renamed from: p */
    private short[] f2297p;

    /* renamed from: q */
    private String[] f2298q;

    /* renamed from: r */
    private String f2299r;

    /* renamed from: s */
    private String f2300s;

    /* renamed from: v */
    private String f2303v;

    /* renamed from: w */
    private int f2304w;

    /* renamed from: x */
    private int f2305x;

    /* renamed from: h */
    private final String[] f2289h = {"主材料", "主材料二", "辅助材料"};

    /* renamed from: t */
    private C0050bw f2301t = null;

    /* renamed from: u */
    private C0050bw f2302u = null;

    public C0079k(C0015ao c0015ao, RunnableC0066a runnableC0066a, C0009ai c0009ai) {
        this.f2290i = c0015ao;
        this.f2291j = runnableC0066a;
    }

    /* renamed from: b */
    private void m1570b() {
        if (this.f2288g != null) {
            for (int i = 0; i < this.f2288g.length; i++) {
                if (this.f2288g[i] != null) {
                    this.f2288g[i] = null;
                }
            }
            this.f2288g = null;
        }
    }

    /* renamed from: b */
    private static void m1571b(int i) {
        if (C0047bt.f891bC == null || C0047bt.f891bC.size() <= 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= C0047bt.f891bC.size()) {
                return;
            }
            C0041bn c0041bn = (C0041bn) C0047bt.f891bC.elementAt(i3);
            if (c0041bn != null && c0041bn.f714a == i) {
                c0041bn.f735v = (byte) (c0041bn.f735v + 1);
            }
            i2 = i3 + 1;
        }
    }

    /* renamed from: c */
    private String m1572c(int i) {
        if (this.f2286e == null || this.f2286e.length <= 0) {
            return null;
        }
        for (int i2 = 0; i2 < this.f2287f.length; i2++) {
            if (this.f2287f[i2] == i) {
                return this.f2298q[i2];
            }
        }
        return null;
    }

    /* renamed from: c */
    private void m1573c() {
        if (this.f2300s == null || this.f2300s.equals("")) {
            this.f2291j.f2152at.m77a((String) null, C0088t.f2523i, (byte) 1);
        } else {
            this.f2291j.f2152at.m77a(this.f2300s, C0088t.f2523i, (byte) 1);
        }
    }

    /* renamed from: d */
    private int m1574d(int i) {
        if (this.f2286e == null || this.f2286e.length < 0) {
            return -1;
        }
        for (int i2 = 0; i2 < this.f2286e.length; i2++) {
            if (this.f2287f[i2] == i) {
                return this.f2286e[i2];
            }
        }
        return -1;
    }

    /* renamed from: d */
    private void m1575d() {
        this.f2303v = null;
        if (this.f2283b != 0) {
            if (this.f2283b != 1 || this.f2298q == null || this.f2298q.length <= 0 || m1572c(this.f2282a) == null) {
                return;
            }
            this.f2303v = m1572c(this.f2282a);
            return;
        }
        if (this.f2282a == 0) {
            if (this.f2293l != null) {
                this.f2303v = this.f2293l;
            }
        } else {
            if (this.f2282a != 1 || this.f2296o == null) {
                return;
            }
            this.f2303v = this.f2294m;
        }
    }

    /* renamed from: e */
    private static C0041bn m1576e(int i) {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= C0047bt.f891bC.size()) {
                return null;
            }
            C0041bn c0041bn = (C0041bn) C0047bt.f891bC.elementAt(i3);
            if (c0041bn != null && c0041bn.f714a == i) {
                return c0041bn;
            }
            i2 = i3 + 1;
        }
    }

    /* renamed from: e */
    private void m1577e() {
        this.f2301t = null;
        if (this.f2296o == null || this.f2296o.equals("")) {
            return;
        }
        this.f2301t = new C0050bw(new StringBuffer().append("<0>银两：</0><5></5>").append(this.f2296o).append(this.f2296o.equals("0") ? "" : "万").toString(), (short) (C0088t.f2518d - 20));
    }

    /* renamed from: f */
    private void m1578f() {
        this.f2302u = null;
        if (this.f2299r != null) {
            this.f2302u = new C0050bw(this.f2299r, (short) (C0088t.f2518d - 20));
        }
    }

    /* renamed from: a */
    public final void m1579a() {
        this.f2284c = -1;
        this.f2292k = (short) -1;
        this.f2293l = null;
        this.f2285d = -1;
        this.f2295n = (short) -1;
        this.f2294m = null;
        this.f2296o = null;
        this.f2286e = null;
        this.f2297p = null;
        if (this.f2298q != null) {
            for (int i = 0; i < this.f2298q.length; i++) {
                this.f2298q[i] = null;
            }
        }
        this.f2298q = null;
        this.f2287f = null;
        this.f2299r = null;
        this.f2300s = null;
        C0047bt.m784N();
    }

    /* renamed from: a */
    public final void m1580a(int i)  {
        if (this.f2290i.f359l == 0) {
            if (this.f2291j.f2149aq != null) {
                this.f2291j.f2149aq.mo70b(i);
            }
            if (i == 4 || i == 1) {
                this.f2283b = this.f2283b == 0 ? 1 : 0;
                this.f2282a = this.f2283b != 0 ? 0 : 1;
                C0055ca.f1892l = 0;
                m1575d();
                m1577e();
                m1578f();
            } else if (i == 2) {
                if (this.f2283b == 0) {
                    this.f2282a = this.f2282a != 0 ? 0 : 1;
                } else if (this.f2283b == 1) {
                    this.f2282a = this.f2282a == 2 ? 0 : this.f2282a + 1;
                }
                C0055ca.f1892l = 0;
                m1575d();
                m1577e();
                m1578f();
            } else if (i == 8) {
                if (this.f2283b == 0) {
                    this.f2282a = this.f2282a != 0 ? 0 : 1;
                } else if (this.f2283b == 1) {
                    this.f2282a = this.f2282a != 0 ? this.f2282a - 1 : 2;
                }
                C0055ca.f1892l = 0;
                m1575d();
                m1577e();
                m1578f();
            } else if (i == 268435456 || i == 1073741824) {
                if (this.f2283b == 0) {
                    if (this.f2282a == 0) {
                        if (this.f2284c == -1) {
                            this.f2290i.m377a((byte) 0, new byte[]{7});
                        } else {
                            C0055ca.m1285a(this.f2288g[this.f2282a][0] + (C0015ao.f178x.f599b / 2), this.f2288g[this.f2282a][1] + (C0015ao.f178x.f599b / 2), new String[]{"合成", "查看", "取消"}, false);
                            this.f2290i.f359l = (short) 1;
                        }
                    } else if (this.f2282a == 1) {
                        if (this.f2284c == -1) {
                            this.f2291j.m1442b("请先放入主材料一");
                        } else if (this.f2285d == -1) {
                            this.f2290i.m377a((byte) 0, new byte[]{7});
                        } else {
                            C0055ca.m1285a(this.f2288g[this.f2282a][0] + (C0015ao.f178x.f599b / 2), this.f2288g[this.f2282a][1] + (C0015ao.f178x.f599b / 2), new String[]{"取出"}, false);
                            System.out.println(new StringBuffer().append("GameSys.goods.width:").append((int) C0015ao.f178x.f599b).toString());
                            this.f2290i.f359l = (short) 1;
                        }
                    }
                } else if (this.f2283b == 1) {
                    if (m1574d(this.f2282a) != -1) {
                        C0055ca.m1285a(this.f2288g[this.f2282a + 2][0] + (C0015ao.f178x.f599b / 2), this.f2288g[this.f2282a + 2][1] + (C0015ao.f178x.f599b / 2), new String[]{"取出"}, false);
                        this.f2290i.f359l = (short) 1;
                    } else if (this.f2284c == -1 || this.f2285d == -1) {
                        this.f2291j.m1442b("请先放满主材料");
                    } else {
                        this.f2290i.m377a((byte) 0, new byte[]{8});
                    }
                }
            }
            if (i == 536870912) {
                m1579a();
                m1570b();
                this.f2303v = null;
                this.f2302u = null;
                this.f2290i.m471l();
                this.f2290i.m430c(5);
            }
        } else if (this.f2290i.f359l == 1) {
            C0055ca.m1317b(i);
            if (i == 268435456 || i == 1073741824) {
                if (C0055ca.f1895o == 0) {
                    if (this.f2283b == 1) {
                        byte[] bArrM1034a = C0053bz.m1034a((byte) 5, this.f2284c, this.f2285d, this.f2286e, this.f2287f, m1574d(this.f2282a), (byte) this.f2282a, C0047bt.f865ad);
                        if (bArrM1034a != null) {
                            RunnableC0066a.f2115i.m600a(new C0091w((short) 4266, bArrM1034a));
                            this.f2291j.m1434a((String) null);
                        } else {
                            this.f2291j.m1442b("获取上传指令数据错误!");
                        }
                    } else {
                        byte[] bArrM1034a2 = this.f2282a == 0 ? C0053bz.m1034a((byte) 0, this.f2284c, this.f2285d, this.f2286e, this.f2287f, -1, (byte) -1, C0047bt.f865ad) : this.f2282a == 1 ? C0053bz.m1034a((byte) 3, this.f2284c, this.f2285d, this.f2286e, this.f2287f, -1, (byte) -1, C0047bt.f865ad) : null;
                        if (bArrM1034a2 != null) {
                            RunnableC0066a.f2115i.m600a(new C0091w((short) 4266, bArrM1034a2));
                            this.f2291j.m1434a((String) null);
                        } else {
                            this.f2291j.m1442b("获取上传指令数据错误!");
                        }
                    }
                } else if (C0055ca.f1895o == 1) {
                    C0047bt.m819a(m1576e(this.f2284c));
                    this.f2290i.f185O.m1620a(0, this.f2290i.f358k, -1);
                } else if (C0055ca.f1895o == 2) {
                    m1579a();
                    m1573c();
                    m1575d();
                    m1577e();
                    m1578f();
                    this.f2290i.f359l = (short) 0;
                }
            } else if (i == 536870912) {
                C0055ca.f1892l = 0;
                m1575d();
                m1577e();
                m1578f();
                this.f2290i.f359l = (short) 0;
            }
        }
        this.f2291j.f2126a = 0;
    }

    /* renamed from: a */
    public final void m1581a(DataInputStream dataInputStream) throws IOException {
        boolean z = this.f2284c > 0;
        this.f2284c = dataInputStream.readInt();
        this.f2292k = dataInputStream.readShort();
        this.f2293l = dataInputStream.readUTF();
        this.f2285d = dataInputStream.readInt();
        this.f2294m = dataInputStream.readUTF();
        this.f2295n = dataInputStream.readShort();
        this.f2296o = dataInputStream.readUTF();
        int i = dataInputStream.readByte();
        if (i > 0) {
            this.f2286e = new int[i];
            this.f2297p = new short[i];
            this.f2287f = new byte[i];
            this.f2298q = new String[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.f2286e[i2] = dataInputStream.readInt();
                this.f2297p[i2] = dataInputStream.readShort();
                this.f2298q[i2] = dataInputStream.readUTF();
                this.f2287f[i2] = dataInputStream.readByte();
            }
        } else {
            this.f2286e = null;
            this.f2297p = null;
            this.f2287f = null;
        }
        this.f2299r = dataInputStream.readUTF();
        this.f2300s = dataInputStream.readUTF();
        C0047bt.m784N();
        m1571b(this.f2284c);
        m1571b(this.f2285d);
        if (this.f2286e != null && this.f2286e.length > 0) {
            for (int i3 = 0; i3 < this.f2286e.length; i3++) {
                m1571b(this.f2286e[i3]);
            }
        }
        if (z) {
            if (this.f2300s == null || this.f2300s.equals("")) {
                this.f2291j.f2152at.m77a((String) null, C0088t.f2523i, (byte) 1);
            } else {
                this.f2291j.f2152at.m77a(this.f2300s, C0088t.f2523i, (byte) 1);
            }
        }
        m1575d();
        m1577e();
        m1578f();
    }

    /* renamed from: a */
    public final void m1582a(Graphics graphics) {
        C0033bf c0033bfM264b;
        C0033bf c0033bfM264b2;
        short s = C0015ao.f178x.f599b;
        if (this.f2291j.f2149aq != null) {
            this.f2291j.f2149aq.m1602a(graphics);
            C0055ca.m1292a(graphics, this.f2291j.f2149aq.f2328a + 5, this.f2291j.f2149aq.f2329b + 32, this.f2291j.f2149aq.f2330c - 11, this.f2304w, 1);
            C0055ca.m1292a(graphics, this.f2291j.f2149aq.f2328a + 5, this.f2291j.f2149aq.f2329b + 32 + this.f2304w + 1, this.f2291j.f2149aq.f2330c - 11, this.f2305x - 2, 1);
        }
        int iStringWidth = this.f2291j.f2149aq.f2328a + C0088t.f2523i.stringWidth(this.f2289h[0]) + 10;
        int i = this.f2291j.f2149aq.f2329b + 40;
        if (this.f2288g == null) {
            this.f2288g = new int[5][4];
        }
        int i2 = 0;
        while (i2 < this.f2288g.length) {
            if (i2 > 1) {
                iStringWidth = ((this.f2291j.f2149aq.f2328a + this.f2291j.f2149aq.f2330c) - ((s + 5) * 3)) - 8;
            }
            int i3 = iStringWidth + 2 + (i2 < 2 ? i2 == 0 ? 0 : s + 5 : (i2 - 2) * (s + 5));
            int i4 = (i2 > 1 ? s : (short) 0) + i;
            if (this.f2288g != null && this.f2288g.length > i2) {
                this.f2288g[i2][0] = i3;
                this.f2288g[i2][1] = i4;
                this.f2288g[i2][2] = 17;
                this.f2288g[i2][3] = 17;
            }
            graphics.drawImage(C0015ao.f178x.f598a, this.f2288g[i2][0], this.f2288g[i2][1], 20);
            i2++;
        }
        graphics.setColor(255);
        graphics.drawString(this.f2289h[0], this.f2288g[0][0] - 2, this.f2288g[0][1] + ((s - C0088t.f2524j) / 2), 24);
        graphics.drawString(this.f2289h[2], this.f2288g[2][0] - 2, (this.f2288g[2][1] - s) + ((s - C0088t.f2524j) / 2), 20);
        if (this.f2284c != -1 && (c0033bfM264b2 = C0015ao.m264b(this.f2292k)) != null) {
            graphics.drawImage(c0033bfM264b2.f598a, this.f2288g[0][0] + 1, this.f2288g[0][1] + 1, 20);
        }
        if (this.f2285d != -1 && (c0033bfM264b = C0015ao.m264b(this.f2295n)) != null) {
            graphics.drawImage(c0033bfM264b.f598a, this.f2288g[1][0] + 1, this.f2288g[1][1] + 1, 20);
        }
        if (this.f2297p != null && this.f2297p.length > 0) {
            for (int i5 = 0; i5 < this.f2297p.length; i5++) {
                C0033bf c0033bfM264b3 = C0015ao.m264b(this.f2297p[i5]);
                if (c0033bfM264b3 != null) {
                    graphics.drawImage(c0033bfM264b3.f598a, this.f2288g[this.f2287f[i5] + 2][0] + 1, this.f2288g[this.f2287f[i5] + 2][1] + 1, 20);
                }
            }
        }
        int i6 = this.f2282a + (this.f2283b << 1);
        C0055ca.m1328d(graphics, this.f2288g[i6][0], this.f2288g[i6][1], 17, 17);
        if (this.f2301t != null) {
            try {
                this.f2301t.m1017a(graphics, this.f2291j.f2149aq.f2328a + 5 + 6, this.f2291j.f2149aq.f2329b + this.f2304w + 8, 0);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (this.f2299r != null) {
            try {
                this.f2302u.m1017a(graphics, this.f2291j.f2149aq.f2328a + 5 + 6, this.f2291j.f2149aq.f2329b + 32 + this.f2304w + 1 + 3, 0);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        if (this.f2290i.f359l == 0 && (this.f2303v != null || this.f2303v != "")) {
            if (!(this.f2283b == 0 && this.f2282a == 1) && this.f2283b == 1) {
                C0055ca.m1321b(graphics, this.f2303v, (C0015ao.f178x.f599b / 2) + this.f2288g[this.f2282a + 2][0], (C0015ao.f178x.f599b / 2) + this.f2288g[this.f2282a + 2][1], C0088t.f2517c - 5, 1);
            } else {
                C0055ca.m1321b(graphics, this.f2303v, (C0015ao.f178x.f599b / 2) + this.f2288g[this.f2282a][0], (C0015ao.f178x.f599b / 2) + this.f2288g[this.f2282a][1], C0088t.f2517c - 5, 1);
            }
        }
        if (this.f2290i.f359l == 1) {
            C0055ca.m1324c(graphics);
        }
    }

    /* renamed from: a */
    public final void m1583a(boolean z) {
        if (z) {
            this.f2282a = 0;
            this.f2283b = 0;
        }
        if (this.f2284c != -1) {
            this.f2290i.m401a(new short[]{this.f2292k});
        }
        if (this.f2285d != -1) {
            this.f2290i.m401a(new short[]{this.f2295n});
        }
        if (this.f2297p != null) {
            this.f2290i.m401a(this.f2297p);
        }
        m1570b();
        this.f2288g = new int[5][4];
        this.f2291j.f2149aq.m1604b();
        this.f2291j.f2149aq.m1601a("物品合成");
        this.f2291j.f2149aq.m1603a(false);
        this.f2304w = (Math.max(C0088t.f2524j, 17) << 1) + 10;
        this.f2305x = C0088t.f2524j + 26 + 5;
        this.f2291j.f2149aq.m1597a(this.f2304w + this.f2305x);
        m1573c();
        this.f2291j.f2149aq.m1600a(this.f2291j.f2152at);
        this.f2291j.f2152at.m75a((byte) 1);
        this.f2291j.f2153au.m1590a("确定");
        if (C0088t.f2517c > 220) {
            this.f2291j.f2149aq.m1600a(this.f2291j.f2153au);
        }
        this.f2291j.f2149aq.m1598a(C0088t.f2520f, C0088t.f2521g, C0088t.f2518d, C0088t.f2519e);
        m1575d();
        m1577e();
        m1578f();
        C0055ca.f1892l = 0;
        this.f2290i.f359l = (short) 0;
        this.f2291j.f2216j = this.f2291j.f2217k;
        C0015ao c0015ao = this.f2290i;
        this.f2290i.f358k = (short) 118;
        c0015ao.f357j = (short) 118;
    }
}

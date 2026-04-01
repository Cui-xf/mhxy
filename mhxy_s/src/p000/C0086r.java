package p000;

import com.yinhan.kjava.main.RunnableC0066a;
import java.io.DataInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import javax.microedition.lcdui.Graphics;

/* renamed from: r */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-4234804660425969496/classes.dex */
public final class C0086r {

    /* renamed from: a */
    public int f2448a;

    /* renamed from: b */
    public int f2449b;

    /* renamed from: c */
    public int f2450c;

    /* renamed from: d */
    public long f2451d;

    /* renamed from: e */
    public int[] f2452e;

    /* renamed from: f */
    public byte[] f2453f;

    /* renamed from: g */
    public int[][] f2454g;

    /* renamed from: i */
    private C0015ao f2456i;

    /* renamed from: j */
    private RunnableC0066a f2457j;

    /* renamed from: k */
    private short f2458k;

    /* renamed from: l */
    private String f2459l;

    /* renamed from: m */
    private String f2460m;

    /* renamed from: n */
    private short f2461n;

    /* renamed from: o */
    private String f2462o;

    /* renamed from: p */
    private short[] f2463p;

    /* renamed from: q */
    private String[] f2464q;

    /* renamed from: r */
    private String f2465r;

    /* renamed from: s */
    private String f2466s;

    /* renamed from: u */
    private String f2468u;

    /* renamed from: v */
    private int f2469v;

    /* renamed from: w */
    private int f2470w;

    /* renamed from: h */
    private final String[] f2455h = {"装备孔", "附魔符", "幸运材料"};

    /* renamed from: t */
    private C0050bw f2467t = null;

    /* renamed from: x */
    private boolean f2471x = false;

    public C0086r(C0015ao c0015ao, RunnableC0066a runnableC0066a, C0009ai c0009ai) {
        this.f2456i = c0015ao;
        this.f2457j = runnableC0066a;
    }

    /* renamed from: b */
    private static void m1662b(int i) {
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
    private String m1663c(int i) {
        if (this.f2452e == null || this.f2452e.length <= 0) {
            return null;
        }
        for (int i2 = 0; i2 < this.f2453f.length; i2++) {
            if (this.f2453f[i2] == i) {
                return this.f2464q[i2];
            }
        }
        return null;
    }

    /* renamed from: c */
    private void m1664c() {
        if (this.f2454g != null) {
            for (int i = 0; i < this.f2454g.length; i++) {
                if (this.f2454g[i] != null) {
                    this.f2454g[i] = null;
                }
            }
            this.f2454g = null;
        }
    }

    /* renamed from: d */
    private int m1665d(int i) {
        if (this.f2452e == null || this.f2452e.length < 0) {
            return -1;
        }
        for (int i2 = 0; i2 < this.f2452e.length; i2++) {
            if (this.f2453f[i2] == i) {
                return this.f2452e[i2];
            }
        }
        return -1;
    }

    /* renamed from: d */
    private void m1666d() {
        if (this.f2466s == null || this.f2466s.equals("")) {
            this.f2457j.f2152at.m77a((String) null, C0088t.f2523i, (byte) 1);
        } else {
            this.f2457j.f2152at.m77a(this.f2466s, C0088t.f2523i, (byte) 1);
        }
    }

    /* renamed from: e */
    private void m1667e() {
        this.f2467t = null;
        StringBuffer stringBuffer = new StringBuffer();
        if (this.f2465r == null && this.f2462o == null) {
            return;
        }
        stringBuffer.append(this.f2462o == null ? "" : this.f2462o);
        stringBuffer.append("\t");
        stringBuffer.append(this.f2465r == null ? "无幸运加成" : this.f2465r);
        this.f2467t = new C0050bw(stringBuffer.toString(), (short) (C0088t.f2518d - 20));
    }

    /* renamed from: a */
    public final void m1668a() {
        this.f2468u = null;
        if (this.f2449b != 0) {
            if (this.f2449b != 1 || this.f2464q == null || this.f2464q.length <= 0 || m1663c(this.f2448a) == null) {
                return;
            }
            this.f2468u = m1663c(this.f2448a);
            return;
        }
        if (this.f2448a == 0) {
            if (this.f2459l != null) {
                this.f2468u = this.f2459l;
            }
        } else {
            if (this.f2448a != 1 || this.f2462o == null) {
                return;
            }
            this.f2468u = this.f2460m;
        }
    }

    /* renamed from: a */
    public final void m1669a(int i) throws IOException {
        C0041bn c0041bn;
        if (this.f2456i.f359l == 0) {
            if (this.f2457j.f2149aq != null) {
                this.f2457j.f2149aq.mo70b(i);
            }
            if (i == 4 || i == 1) {
                this.f2449b = this.f2449b == 0 ? 1 : 0;
                this.f2448a = this.f2449b != 0 ? 0 : 1;
                C0055ca.f1892l = 0;
                m1668a();
                m1667e();
            } else if (i == 2) {
                if (this.f2449b == 0) {
                    this.f2448a = this.f2448a != 0 ? 0 : 1;
                } else if (this.f2449b == 1) {
                    this.f2448a = this.f2448a == 2 ? 0 : this.f2448a + 1;
                }
                C0055ca.f1892l = 0;
                m1668a();
                m1667e();
            } else if (i == 8) {
                if (this.f2449b == 0) {
                    this.f2448a = this.f2448a != 0 ? 0 : 1;
                } else if (this.f2449b == 1) {
                    this.f2448a = this.f2448a != 0 ? this.f2448a - 1 : 2;
                }
                C0055ca.f1892l = 0;
                m1668a();
                m1667e();
            } else if (i == 268435456 || i == 1073741824) {
                if (this.f2449b == 0) {
                    if (this.f2448a == 0) {
                        if (this.f2450c == -1) {
                            this.f2471x = true;
                            this.f2456i.m377a((byte) 0, new byte[]{0});
                        } else {
                            C0055ca.m1285a(this.f2457j.f2149aq.f2328a + (C0088t.f2525k * 3) + 29, this.f2457j.f2149aq.f2329b + 49, new String[]{"附魔", "查看", "取出"}, false);
                            this.f2456i.f359l = (short) 1;
                        }
                    } else if (this.f2448a == 1) {
                        if (this.f2450c == -1) {
                            this.f2457j.m1442b("请先放入需要附魔的装备");
                        } else if (this.f2451d == -1) {
                            this.f2456i.m377a((byte) 0, new byte[]{3});
                        } else {
                            C0055ca.m1285a((this.f2457j.f2149aq.f2330c - (C0015ao.f178x.f599b * 3)) - 21, this.f2457j.f2149aq.f2329b + 49, new String[]{"取出"}, false);
                            this.f2456i.f359l = (short) 1;
                        }
                    }
                } else if (this.f2449b == 1) {
                    if (m1665d(this.f2448a) != -1) {
                        C0055ca.m1285a(((((this.f2457j.f2149aq.f2330c - 10) - C0015ao.f178x.f599b) - ((this.f2448a + ((1 - this.f2448a) * 2)) * (C0015ao.f178x.f599b + 10))) - (C0055ca.f1897q / 2)) + 9, this.f2457j.f2149aq.f2329b + C0015ao.f178x.f600c + 69, new String[]{"取出"}, false);
                        this.f2456i.f359l = (short) 1;
                    } else if (this.f2450c == -1 || this.f2451d == -1) {
                        this.f2457j.m1442b("请先放入附魔装备与附魔符");
                    } else {
                        this.f2456i.m377a((byte) 0, new byte[]{4});
                    }
                }
            } else if (i == 536870912) {
                m1673b();
                m1664c();
                this.f2468u = null;
                this.f2467t = null;
                if (this.f2456i.f236aw) {
                    this.f2456i.f236aw = false;
                    this.f2456i.m486t();
                } else if (this.f2456i.f205aJ) {
                    this.f2456i.f205aJ = false;
                    this.f2456i.m434c(false);
                } else {
                    this.f2456i.m471l();
                    this.f2456i.m430c(0);
                }
            }
        } else if (this.f2456i.f359l == 1) {
            C0055ca.m1317b(i);
            if (i == 268435456 || i == 1073741824) {
                if (C0055ca.f1895o == 0) {
                    if (this.f2449b == 1) {
                        byte[] bArrM1053a = C0053bz.m1053a((short) 4262, this.f2450c, this.f2451d, (byte) 2, this.f2452e, this.f2453f, m1665d(this.f2448a), (byte) this.f2448a, C0047bt.f865ad);
                        if (bArrM1053a != null) {
                            RunnableC0066a.f2115i.m600a(new C0091w((short) 4262, bArrM1053a));
                            this.f2457j.m1434a((String) null);
                        } else {
                            this.f2457j.m1442b("获取上传指令数据错误!");
                        }
                    } else {
                        byte[] bArrM1053a2 = this.f2448a == 0 ? C0053bz.m1053a((short) 4262, this.f2450c, this.f2451d, (byte) 3, this.f2452e, this.f2453f, -1, (byte) -1, C0047bt.f865ad) : this.f2448a == 1 ? C0053bz.m1053a((short) 4262, this.f2450c, this.f2451d, (byte) 5, this.f2452e, this.f2453f, -1, (byte) -1, C0047bt.f865ad) : null;
                        if (bArrM1053a2 != null) {
                            RunnableC0066a.f2115i.m600a(new C0091w((short) 4262, bArrM1053a2));
                            this.f2457j.m1434a((String) null);
                        } else {
                            this.f2457j.m1442b("获取上传指令数据错误!");
                        }
                    }
                } else if (C0055ca.f1895o == 1) {
                    if (this.f2456i.f236aw && !this.f2471x) {
                        C0047bt.m817a(this.f2456i.f235av);
                    } else if (!this.f2456i.f205aJ || this.f2471x) {
                        int i2 = this.f2450c;
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
                            this.f2457j.m1442b("装备不存在");
                        }
                    } else {
                        C0047bt.m883b((int) C0015ao.m313l(this.f2456i.f230aq));
                    }
                    this.f2456i.f185O.m1620a(0, this.f2456i.f358k, -1);
                } else if (C0055ca.f1895o == 2) {
                    m1673b();
                    m1668a();
                    m1666d();
                    m1667e();
                    this.f2456i.f359l = (short) 0;
                }
            } else if (i == 536870912) {
                C0055ca.f1892l = 0;
                m1668a();
                m1667e();
                this.f2456i.f359l = (short) 0;
            }
        }
        this.f2457j.f2126a = 0;
    }

    /* renamed from: a */
    public final void m1670a(DataInputStream dataInputStream) throws IOException {
        boolean z = this.f2450c > 0;
        this.f2450c = dataInputStream.readInt();
        this.f2458k = dataInputStream.readShort();
        this.f2459l = dataInputStream.readUTF();
        this.f2451d = dataInputStream.readLong();
        this.f2460m = dataInputStream.readUTF();
        this.f2461n = dataInputStream.readShort();
        this.f2462o = dataInputStream.readUTF();
        int i = dataInputStream.readByte();
        if (i > 0) {
            this.f2452e = new int[i];
            this.f2463p = new short[i];
            this.f2453f = new byte[i];
            this.f2464q = new String[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.f2452e[i2] = dataInputStream.readInt();
                this.f2463p[i2] = dataInputStream.readShort();
                this.f2464q[i2] = dataInputStream.readUTF();
                this.f2453f[i2] = dataInputStream.readByte();
            }
        } else {
            this.f2452e = null;
            this.f2463p = null;
            this.f2453f = null;
        }
        this.f2465r = dataInputStream.readUTF();
        this.f2466s = dataInputStream.readUTF();
        C0047bt.m784N();
        m1662b(this.f2450c);
        m1662b((int) this.f2451d);
        if (this.f2452e != null && this.f2452e.length > 0) {
            for (int i3 = 0; i3 < this.f2452e.length; i3++) {
                m1662b(this.f2452e[i3]);
            }
        }
        if (z) {
            if (this.f2466s == null || this.f2466s.equals("")) {
                this.f2457j.f2152at.m77a((String) null, C0088t.f2523i, (byte) 1);
            } else {
                this.f2457j.f2152at.m77a(this.f2466s, C0088t.f2523i, (byte) 1);
            }
        }
        m1668a();
        m1667e();
    }

    /* renamed from: a */
    public final void m1671a(Graphics graphics) {
        C0033bf c0033bfM264b;
        C0033bf c0033bfM264b2;
        short s = C0015ao.f178x.f599b;
        if (this.f2457j.f2149aq != null) {
            this.f2457j.f2149aq.m1602a(graphics);
            C0055ca.m1292a(graphics, this.f2457j.f2149aq.f2328a + 5, this.f2457j.f2149aq.f2329b + 32, this.f2457j.f2149aq.f2330c - 11, this.f2469v, 1);
            C0055ca.m1292a(graphics, this.f2457j.f2149aq.f2328a + 5, this.f2457j.f2149aq.f2329b + 32 + this.f2469v + 1, this.f2457j.f2149aq.f2330c - 11, this.f2470w - 2, 1);
        }
        int iStringWidth = this.f2457j.f2149aq.f2328a + C0088t.f2523i.stringWidth("装备孔") + 10;
        int i = this.f2457j.f2149aq.f2329b + 40;
        int i2 = 0;
        while (i2 < this.f2454g.length) {
            if (i2 > 0) {
                iStringWidth = ((this.f2457j.f2149aq.f2328a + this.f2457j.f2149aq.f2330c) - ((s + 5) * 3)) - 8;
            }
            int i3 = iStringWidth + 2 + (i2 < 2 ? 0 : (i2 - 2) * (s + 5));
            int i4 = (i2 > 1 ? s + 8 : 0) + i;
            if (this.f2454g != null && this.f2454g.length > i2) {
                this.f2454g[i2][0] = i3;
                this.f2454g[i2][1] = i4;
                this.f2454g[i2][2] = 17;
                this.f2454g[i2][3] = 17;
            }
            graphics.drawImage(C0015ao.f178x.f598a, this.f2454g[i2][0], this.f2454g[i2][1], 20);
            i2++;
        }
        graphics.setColor(255);
        graphics.drawString(this.f2455h[0], this.f2454g[0][0] - 2, this.f2454g[0][1] + ((s - C0088t.f2524j) / 2), 24);
        graphics.drawString(this.f2455h[1], this.f2454g[1][0] - 2, this.f2454g[1][1] + ((s - C0088t.f2524j) / 2), 24);
        graphics.drawString(this.f2455h[2], this.f2454g[2][0] - 2, this.f2454g[2][1] + ((s - C0088t.f2524j) / 2), 24);
        if (this.f2450c != -1 && (c0033bfM264b2 = C0015ao.m264b(this.f2458k)) != null) {
            graphics.drawImage(c0033bfM264b2.f598a, this.f2454g[0][0], this.f2454g[0][1], 20);
        }
        if (this.f2451d != -1 && (c0033bfM264b = C0015ao.m264b(this.f2461n)) != null) {
            graphics.drawImage(c0033bfM264b.f598a, this.f2454g[1][0], this.f2454g[1][1], 20);
        }
        if (this.f2463p != null && this.f2463p.length > 0) {
            for (int i5 = 0; i5 < this.f2463p.length; i5++) {
                C0033bf c0033bfM264b3 = C0015ao.m264b(this.f2463p[i5]);
                if (c0033bfM264b3 != null) {
                    graphics.drawImage(c0033bfM264b3.f598a, this.f2454g[this.f2453f[i5] + 2][0], this.f2454g[this.f2453f[i5] + 2][1], 20);
                }
            }
        }
        int i6 = this.f2448a + (this.f2449b << 1);
        C0055ca.m1328d(graphics, this.f2454g[i6][0], this.f2454g[i6][1], 17, 17);
        if (this.f2465r != null || this.f2462o != null) {
            this.f2467t.m1017a(graphics, this.f2457j.f2149aq.f2328a + 5 + 6, this.f2457j.f2149aq.f2329b + 32 + this.f2469v + 1 + 3, 0);
        }
        if (this.f2456i.f359l != 0) {
            if (this.f2456i.f359l == 1) {
                C0055ca.m1324c(graphics);
            }
        } else {
            if (this.f2468u == null && this.f2468u == "") {
                return;
            }
            if (this.f2449b == 0 && this.f2448a == 1) {
                C0055ca.m1321b(graphics, this.f2468u, ((((this.f2457j.f2149aq.f2330c - 10) - C0015ao.f178x.f599b) - ((C0015ao.f178x.f599b + 10) * 2)) - 6) - C0088t.f2523i.stringWidth("装备孔"), C0015ao.f178x.f600c + this.f2457j.f2149aq.f2329b + 32 + 8, C0088t.f2517c - 5, 1);
            } else if (this.f2449b == 1) {
                C0055ca.m1321b(graphics, this.f2468u, this.f2457j.f2149aq.f2330c - ((C0015ao.f178x.f599b + 10) * 3), (C0015ao.f178x.f600c << 1) + this.f2457j.f2149aq.f2329b + 32 + 8 + 10, C0088t.f2517c - 5, 1);
            } else {
                C0055ca.m1321b(graphics, this.f2468u, this.f2457j.f2149aq.f2328a + 5 + 2, C0015ao.f178x.f600c + this.f2457j.f2149aq.f2329b + 32 + 8, C0088t.f2517c - 5, 1);
            }
        }
    }

    /* renamed from: a */
    public final void m1672a(boolean z) {
        if (z) {
            this.f2448a = 0;
            this.f2449b = 0;
        }
        if (this.f2450c != -1) {
            this.f2456i.m401a(new short[]{this.f2458k});
        }
        if (this.f2451d != -1) {
            this.f2456i.m401a(new short[]{this.f2461n});
        }
        if (this.f2463p != null) {
            this.f2456i.m401a(this.f2463p);
        }
        m1664c();
        this.f2454g = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 5, 4);
        this.f2457j.f2149aq.m1604b();
        this.f2457j.f2149aq.m1601a("装备附魔");
        this.f2457j.f2149aq.m1603a(false);
        this.f2469v = Math.max((C0088t.f2524j << 1) + 25, 59);
        this.f2470w = C0088t.f2524j + 26 + 5;
        this.f2457j.f2149aq.m1597a(this.f2469v + this.f2470w);
        m1666d();
        this.f2457j.f2149aq.m1600a(this.f2457j.f2152at);
        this.f2457j.f2152at.m75a((byte) 1);
        this.f2457j.f2153au.m1590a("确定");
        if (C0088t.f2517c > 220) {
            this.f2457j.f2149aq.m1600a(this.f2457j.f2153au);
        }
        this.f2457j.f2149aq.m1598a(C0088t.f2520f, C0088t.f2521g, C0088t.f2518d, C0088t.f2519e);
        m1668a();
        m1667e();
        C0055ca.f1892l = 0;
        this.f2456i.f359l = (short) 0;
        this.f2457j.f2216j = this.f2457j.f2217k;
        C0015ao c0015ao = this.f2456i;
        this.f2456i.f358k = (short) 110;
        c0015ao.f357j = (short) 110;
    }

    /* renamed from: b */
    public final void m1673b() {
        this.f2450c = -1;
        this.f2458k = (short) -1;
        this.f2459l = null;
        this.f2451d = -1L;
        this.f2461n = (short) -1;
        this.f2460m = null;
        this.f2462o = null;
        this.f2452e = null;
        this.f2463p = null;
        if (this.f2464q != null) {
            for (int i = 0; i < this.f2464q.length; i++) {
                this.f2464q[i] = null;
            }
        }
        this.f2464q = null;
        this.f2453f = null;
        this.f2465r = null;
        this.f2466s = null;
        this.f2471x = false;
        C0047bt.m784N();
    }
}

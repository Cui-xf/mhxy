package p000;

import com.yinhan.kjava.main.RunnableC0066a;
import java.io.DataInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* renamed from: cc */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-5080095226433994817/classes.dex */
public final class C0057cc {

    /* renamed from: b */
    private C0015ao f1913b;

    /* renamed from: c */
    private RunnableC0066a f1914c;

    /* renamed from: e */
    private int f1916e;

    /* renamed from: d */
    private int[][] f1915d = null;

    /* renamed from: f */
    private C0030bc[] f1917f = null;

    /* renamed from: g */
    private int f1918g = 0;

    /* renamed from: a */
    public short f1912a = 0;

    /* renamed from: h */
    private short f1919h = 0;

    /* renamed from: i */
    private short f1920i = 0;

    /* renamed from: j */
    private int f1921j = 0;

    /* renamed from: k */
    private String[] f1922k = null;

    /* renamed from: l */
    private String[] f1923l = null;

    /* renamed from: m */
    private short[] f1924m = null;

    /* renamed from: n */
    private int[] f1925n = null;

    /* renamed from: o */
    private String[] f1926o = null;

    /* renamed from: p */
    private String[] f1927p = null;

    /* renamed from: q */
    private int[] f1928q = null;

    /* renamed from: r */
    private byte[] f1929r = null;

    /* renamed from: s */
    private String[] f1930s = null;

    /* renamed from: t */
    private byte[] f1931t = null;

    /* renamed from: u */
    private byte[] f1932u = null;

    /* renamed from: v */
    private int[] f1933v = null;

    /* renamed from: w */
    private String[] f1934w = null;

    /* renamed from: x */
    private String[] f1935x = null;

    /* renamed from: y */
    private String[] f1936y = null;

    /* renamed from: z */
    private String[] f1937z = null;

    /* renamed from: A */
    private String[] f1909A = null;

    /* renamed from: B */
    private int[] f1910B = null;

    /* renamed from: C */
    private String f1911C = null;

    public C0057cc(C0015ao c0015ao, RunnableC0066a runnableC0066a) {
        this.f1913b = c0015ao;
        this.f1914c = runnableC0066a;
    }

    /* renamed from: a */
    public final int m1333a(int i, int i2, int i3) {
        if (this.f1912a != 0 || this.f1927p == null) {
            return i;
        }
        for (int i4 = 0; i4 < this.f1915d.length && i4 < this.f1927p.length; i4++) {
            if (i2 >= this.f1915d[i4][0] && i2 <= this.f1915d[i4][0] + this.f1915d[i4][2] && i3 >= this.f1915d[i4][1] && i3 <= this.f1915d[i4][1] + this.f1915d[i4][3]) {
                if (this.f1918g == i4) {
                    return 1073741824;
                }
                this.f1918g = (byte) i4;
            }
        }
        return i;
    }

    /* renamed from: a */
    public final void m1334a() {
        this.f1922k = null;
        this.f1923l = null;
        this.f1924m = null;
        this.f1925n = null;
        this.f1926o = null;
        this.f1927p = null;
        this.f1928q = null;
        this.f1929r = null;
        this.f1930s = null;
        this.f1931t = null;
        this.f1932u = null;
        this.f1933v = null;
        this.f1934w = null;
        this.f1935x = null;
        this.f1936y = null;
        this.f1937z = null;
        this.f1909A = null;
        this.f1910B = null;
        if (this.f1915d != null) {
            for (int i = 0; i < this.f1915d.length; i++) {
                this.f1915d[i] = null;
            }
        }
        this.f1915d = null;
        if (this.f1917f != null) {
            for (int i2 = 0; i2 < this.f1917f.length; i2++) {
                this.f1917f[i2] = null;
            }
        }
        this.f1917f = null;
    }

    /* renamed from: a */
    public final void m1335a(int i) throws IOException {
        if (this.f1913b.f359l == 0) {
            if (this.f1914c.f2149aq != null) {
                this.f1914c.f2149aq.mo70b(i);
            }
            if (i == 536870912) {
                this.f1913b.m361N();
                m1334a();
                return;
            }
            if (i == 8 || i == 2 || i == 516 || i == 518) {
                m1338a(this.f1914c.f2151as.f2353a);
                return;
            }
            if (i == 1 || i == 514) {
                this.f1918g--;
                this.f1918g = this.f1918g < 0 ? 3 : this.f1918g;
                return;
            }
            if (i == 4 || i == 520) {
                this.f1918g++;
                this.f1918g %= 4;
                return;
            }
            if (this.f1912a == 0) {
                for (int i2 = 0; i2 < this.f1917f.length; i2++) {
                    C0009ai.m43a(this.f1917f[i2], this.f1914c.f2147ak);
                }
                if ((i == 1073741824 || i == 517 || i == 268435456) && this.f1918g >= 0 && this.f1918g <= 3 && this.f1927p != null && this.f1918g < this.f1927p.length) {
                    C0055ca.m1285a(this.f1915d[this.f1918g][0] + 30, this.f1915d[this.f1918g][1] + 20, new String[]{"属性", "装备"}, false);
                    this.f1913b.f359l = (short) 1;
                    return;
                }
                return;
            }
            if (this.f1912a == 1) {
                if ((i == 268435456 || i == 1073741824 || i == 517) && this.f1914c.f2150ar.m1275g() > 0) {
                    C0055ca.m1285a(C0088t.f2518d / 3, this.f1914c.f2150ar.m1268b() + 40, new String[]{"挑战", "属性", "装备"}, false);
                    this.f1913b.f359l = (short) 1;
                    return;
                }
                return;
            }
            if (this.f1912a == 2) {
                if (i == 268435456 || i == 1073741824 || i == 517) {
                    this.f1912a = this.f1914c.f2151as.f2353a;
                    byte[] bArrM1151d = C0053bz.m1151d((short) 4690, (byte) 2, "");
                    if (bArrM1151d == null) {
                        this.f1914c.m1442b("获取上传指令数据错误!");
                        return;
                    } else {
                        RunnableC0066a.f2115i.m600a(new C0091w((short) 4690, bArrM1151d));
                        this.f1914c.m1434a((String) null);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (this.f1913b.f359l == 1) {
            C0055ca.m1317b(i);
            if (i != 268435456 && i != 1073741824 && i != 517) {
                if (i == 536870912) {
                    this.f1913b.f359l = (short) 0;
                    return;
                }
                return;
            }
            this.f1912a = this.f1914c.f2151as.f2353a;
            if (C0055ca.f1895o == 0 && this.f1912a == 1) {
                C0055ca.f1888h = 0;
                this.f1913b.f359l = (short) 2;
                return;
            }
            if ((C0055ca.f1895o == 1 && this.f1912a == 1) || (C0055ca.f1895o == 0 && this.f1912a == 0)) {
                this.f1912a = this.f1914c.f2151as.f2353a;
                byte[] bArrM1089a = C0053bz.m1089a((short) 4110, C0047bt.f865ad, this.f1912a == 0 ? this.f1927p[this.f1918g] : this.f1909A[this.f1914c.f2150ar.m1275g() - 1], (byte) 0);
                if (bArrM1089a == null) {
                    this.f1914c.m1442b("获取上传指令数据错误!");
                    return;
                } else {
                    RunnableC0066a.f2115i.m600a(new C0091w((short) 4110, bArrM1089a));
                    this.f1914c.m1434a((String) null);
                    return;
                }
            }
            this.f1912a = this.f1914c.f2151as.f2353a;
            byte[] bArrM1129b = C0053bz.m1129b((short) 4111, C0047bt.f865ad, this.f1912a == 0 ? this.f1927p[this.f1918g] : this.f1909A[this.f1914c.f2150ar.m1275g() - 1]);
            if (bArrM1129b == null) {
                this.f1914c.m1442b("获取上传指令数据错误!");
                return;
            } else {
                RunnableC0066a.f2115i.m600a(new C0091w((short) 4111, bArrM1129b));
                this.f1914c.m1434a((String) null);
                return;
            }
        }
        if (this.f1913b.f359l == 2) {
            if (i != 268435456 && i != 1073741824 && i != 517) {
                if (i == 536870912) {
                    this.f1913b.f359l = (short) 1;
                    return;
                }
                return;
            } else {
                byte[] bArrM1151d2 = C0053bz.m1151d((short) 4690, (byte) 1, this.f1912a == 0 ? this.f1926o[this.f1918g] : this.f1937z[this.f1914c.f2150ar.m1275g() - 1]);
                if (bArrM1151d2 == null) {
                    this.f1914c.m1442b("获取上传指令数据错误!");
                    return;
                } else {
                    RunnableC0066a.f2115i.m600a(new C0091w((short) 4690, bArrM1151d2));
                    this.f1914c.m1434a((String) null);
                    return;
                }
            }
        }
        if (this.f1913b.f359l == 3) {
            this.f1913b.f190T.mo70b(i);
            if (i == 536870912) {
                this.f1913b.f190T.mo71j();
                this.f1913b.f359l = (short) 1;
                return;
            }
            return;
        }
        if (this.f1913b.f359l == 4) {
            this.f1913b.m401a(C0047bt.f951cJ);
            this.f1913b.m458g(i);
            if (i == 536870912) {
                if (this.f1913b.f360m != 0) {
                    if (this.f1913b.f360m == 1) {
                        this.f1913b.f360m = (short) 0;
                    }
                } else {
                    if (C0047bt.f951cJ != null) {
                        C0047bt.m931o();
                    }
                    this.f1913b.f190T.mo71j();
                    this.f1913b.f359l = (short) 1;
                }
            }
        }
    }

    /* renamed from: a */
    public final void m1336a(DataInputStream dataInputStream) throws IOException {
        this.f1919h = dataInputStream.readShort();
        this.f1920i = dataInputStream.readShort();
        this.f1921j = dataInputStream.readInt();
        int i = dataInputStream.readShort();
        if (i > 0) {
            this.f1922k = new String[i];
            this.f1923l = new String[i];
            this.f1924m = new short[i];
            this.f1925n = new int[i];
            this.f1926o = new String[i];
            this.f1927p = new String[i];
            this.f1928q = new int[i];
            this.f1929r = new byte[i];
            this.f1930s = new String[i];
            this.f1931t = new byte[i];
            this.f1932u = new byte[i];
            this.f1933v = new int[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.f1922k[i2] = new StringBuffer().append("第").append((int) dataInputStream.readShort()).append("名").toString();
                this.f1923l[i2] = dataInputStream.readUTF();
                this.f1924m[i2] = dataInputStream.readShort();
                this.f1925n[i2] = dataInputStream.readInt();
                this.f1926o[i2] = dataInputStream.readUTF();
                this.f1927p[i2] = dataInputStream.readUTF();
                this.f1928q[i2] = C0055ca.m1278a(dataInputStream.readInt());
                this.f1929r[i2] = dataInputStream.readByte();
                this.f1930s[i2] = dataInputStream.readUTF();
                this.f1931t[i2] = dataInputStream.readByte();
                this.f1932u[i2] = dataInputStream.readByte();
                this.f1933v[i2] = C0048bu.m955a(RunnableC0066a.m1391a(this.f1931t[i2], this.f1932u[i2], (byte) 0, (byte) 0, false, this.f1930s[i2]), (byte) 2);
            }
        } else {
            this.f1922k = null;
            this.f1923l = null;
            this.f1924m = null;
            this.f1925n = null;
            this.f1926o = null;
            this.f1927p = null;
            this.f1928q = null;
            this.f1929r = null;
            this.f1930s = null;
            this.f1931t = null;
            this.f1932u = null;
            this.f1933v = null;
        }
        int i3 = dataInputStream.readShort();
        if (i3 > 0) {
            this.f1934w = new String[i3 + 1];
            this.f1935x = new String[i3 + 1];
            this.f1936y = new String[i3 + 1];
            this.f1937z = new String[i3];
            this.f1909A = new String[i3];
            this.f1910B = new int[i3 + 1];
            this.f1934w[0] = "排行";
            this.f1935x[0] = "昵称";
            this.f1936y[0] = "战力";
            this.f1910B[0] = C0055ca.m1278a(0);
            for (int i4 = 0; i4 < i3; i4++) {
                this.f1934w[i4 + 1] = new StringBuffer().append((int) dataInputStream.readShort()).append("").toString();
                this.f1935x[i4 + 1] = new StringBuffer().append(dataInputStream.readUTF()).append("(").append((int) dataInputStream.readShort()).append("级)").toString();
                this.f1936y[i4 + 1] = new StringBuffer().append(dataInputStream.readInt()).append("").toString();
                this.f1937z[i4] = dataInputStream.readUTF();
                this.f1909A[i4] = dataInputStream.readUTF();
                this.f1910B[i4 + 1] = C0055ca.m1278a(dataInputStream.readInt() == 0 ? 15 : 5);
            }
        } else {
            this.f1934w = null;
            this.f1935x = null;
            this.f1936y = null;
            this.f1937z = null;
            this.f1909A = null;
        }
        this.f1911C = dataInputStream.readUTF();
    }

    /* renamed from: a */
    public final void m1337a(Graphics graphics) {
        if (this.f1914c.f2149aq != null) {
            if (this.f1913b.f359l == 4) {
                this.f1913b.m393a(graphics, "", C0015ao.f171q);
                return;
            }
            this.f1914c.f2149aq.m1602a(graphics);
            if (this.f1912a == 0) {
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 >= this.f1915d.length) {
                        break;
                    }
                    C0055ca.m1305a(graphics, (Image) null, this.f1915d[i2][0], this.f1915d[i2][1], this.f1915d[i2][2], this.f1915d[i2][3], i2 == this.f1918g);
                    if (this.f1927p != null && i2 < this.f1927p.length) {
                        graphics.setColor(65535);
                        graphics.drawString(this.f1923l[i2], this.f1915d[i2][0] + ((this.f1915d[i2][2] - C0088t.f2523i.stringWidth(this.f1923l[i2])) / 2), this.f1915d[i2][1] + 4, 20);
                        graphics.setColor(16777215);
                        graphics.drawString(this.f1922k[i2], this.f1915d[i2][0] + ((this.f1915d[i2][2] - C0088t.f2523i.stringWidth(this.f1922k[i2])) / 2), ((this.f1915d[i2][1] + this.f1915d[i2][3]) - C0088t.f2524j) - 4, 20);
                        RunnableC0066a.f2114f.m62a(graphics, this.f1917f[i2], (int[]) null, 0, 0, (this.f1915d[i2][2] / 2) + this.f1915d[i2][0], ((this.f1915d[i2][3] / 4) * 3) + this.f1915d[i2][1], 20, 0);
                    }
                    i = i2 + 1;
                }
            } else if (this.f1912a != 1 && this.f1912a == 2) {
                C0055ca.m1292a(graphics, this.f1914c.f2152at.f108b, this.f1914c.f2152at.f109c + this.f1914c.f2152at.f111e + 1, this.f1914c.f2152at.f110d, this.f1916e + 1, 1);
                C0015ao.f140K.m1017a(graphics, this.f1914c.f2152at.f108b + 10, this.f1914c.f2152at.f109c + this.f1914c.f2152at.f111e + 4, 0);
            }
            if (this.f1913b.f359l == 1) {
                C0055ca.m1324c(graphics);
            } else if (this.f1913b.f359l == 2) {
                C0055ca.m1303a(graphics, "确定挑战该玩家?", new String[]{"确定", "取消"});
            } else if (this.f1913b.f359l == 3) {
                this.f1913b.f190T.m1602a(graphics);
            }
        }
    }

    /* renamed from: a */
    public final void m1338a(short s) {
        if (this.f1915d == null) {
            this.f1915d = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 4, 4);
            this.f1917f = new C0030bc[4];
        }
        if (this.f1927p != null) {
            for (int i = 0; i < this.f1917f.length && i < this.f1927p.length; i++) {
                this.f1917f[i] = RunnableC0066a.f2096ab.m984a(this.f1930s[i], (short) 0, (short) 0, (short) 0);
                if (this.f1917f[i] == null) {
                    RunnableC0066a.m1396a(this.f1931t[i], this.f1932u[i], (byte) 0, (byte) 0, this.f1930s[i], (short) 0, (short) 0, (short) 0);
                    this.f1917f[i] = RunnableC0066a.f2096ab.m983a(this.f1933v[i], (short) 0, (short) 0, (short) 0);
                }
            }
        }
        this.f1913b.f359l = (short) 0;
        this.f1914c.f2149aq.mo71j();
        this.f1914c.f2149aq.m1601a("仙位排位赛");
        this.f1914c.f2151as.m1610a(new String[]{"风云榜", "斗法场", "斗法记录"});
        this.f1914c.f2151as.f2353a = (byte) s;
        this.f1912a = s;
        this.f1914c.f2149aq.m1600a(this.f1914c.f2151as);
        this.f1914c.f2149aq.m1603a(true);
        if (this.f1912a == 0) {
            this.f1914c.f2152at.m79b("", C0088t.f2523i, (byte) 1);
            this.f1914c.f2149aq.m1600a(this.f1914c.f2152at);
            this.f1914c.f2153au.m1593a(new String[]{"操作", "返回"});
            this.f1914c.f2149aq.m1600a(this.f1914c.f2153au);
            this.f1914c.f2149aq.m1598a(C0088t.f2520f, C0088t.f2521g, C0088t.f2518d, C0088t.f2519e);
            this.f1916e = this.f1914c.f2152at.f111e;
            int i2 = ((this.f1914c.f2149aq.f2330c - 16) - 2) / 2;
            int i3 = (this.f1914c.f2152at.f111e - 6) / 2;
            for (int i4 = 0; i4 < this.f1915d.length; i4++) {
                this.f1915d[i4][0] = this.f1914c.f2152at.f108b + 2 + ((i4 % 2) * (i2 + 2));
                this.f1915d[i4][1] = this.f1914c.f2152at.f109c + 2 + ((i4 / 2) * (i3 + 2));
                this.f1915d[i4][2] = i2;
                this.f1915d[i4][3] = i3;
            }
        } else if (this.f1912a == 1) {
            this.f1914c.f2150ar.m1266a((Image[]) null, this.f1934w, this.f1935x, this.f1936y);
            this.f1914c.f2150ar.m1263a(this.f1910B);
            this.f1914c.f2149aq.m1600a(this.f1914c.f2150ar);
            this.f1914c.f2149aq.m1598a(C0088t.f2520f, C0088t.f2521g, C0088t.f2518d, C0088t.f2519e);
        } else if (this.f1912a == 2) {
            this.f1914c.f2152at.m79b(this.f1911C, C0088t.f2523i, (byte) 1);
            this.f1914c.f2149aq.m1600a(this.f1914c.f2152at);
            this.f1914c.f2153au.m1593a(new String[]{"购买次数", "返回"});
            this.f1914c.f2149aq.m1600a(this.f1914c.f2153au);
            this.f1914c.f2149aq.m1598a(C0088t.f2520f, C0088t.f2521g, C0088t.f2518d, C0088t.f2519e);
            this.f1916e = (C0088t.f2524j * 3) + 4;
            this.f1914c.f2152at.m76a(this.f1914c.f2152at.f108b, this.f1914c.f2152at.f109c, this.f1914c.f2152at.f110d, (this.f1914c.f2152at.f111e - this.f1916e) - 2);
            C0015ao.f140K = new C0050bw(new StringBuffer().append("当前排名：").append(this.f1919h <= 0 ? "无" : new StringBuffer().append("第").append((int) this.f1919h).append("名").toString()).append("\t剩余挑战：").append((int) this.f1920i).append("次\t当前积分：").append(this.f1921j).toString(), (short) (this.f1914c.f2152at.f110d - 20));
        }
        this.f1914c.f2216j = this.f1914c.f2217k;
        C0015ao c0015ao = this.f1913b;
        this.f1913b.f358k = (short) 130;
        c0015ao.f357j = (short) 130;
    }

    /* renamed from: b */
    public final void m1339b(DataInputStream dataInputStream) {
        this.f1920i = dataInputStream.readShort();
    }
}

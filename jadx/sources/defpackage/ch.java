package defpackage;

import com.yinhan.kjava.main.a;
import java.io.DataInputStream;
import java.io.IOException;
import javax.microedition.lcdui.Graphics;

/* loaded from: java版梦回西游3区251011.jar:ch.class */
public final class ch {
    private ao c;
    private a d;
    private ai e;
    private String f;
    private bw g;
    private static int h;
    private static String i;
    private static short j;
    private static String k;
    private static double l;
    private static String m;
    private static int[] n;
    private static byte o;
    private static byte p;
    private static boolean[] q;
    private static String r;
    private static String s;
    private static byte t;
    private static String u;
    public int[][] a;
    public int b;
    private int v;
    private int w;
    private int x;
    private bf y;
    private bf z;
    private boolean A = false;

    public ch(ao aoVar, a aVar, ai aiVar) {
        this.c = aoVar;
        this.d = aVar;
        this.e = aiVar;
    }

    public static void a() {
        h = -1;
        j = (short) -1;
        k = "";
        l = 0.0d;
        m = "";
        n = new int[3];
        q = new boolean[3];
        for (int i2 = 0; i2 < 3; i2++) {
            n[i2] = 0;
            q[i2] = false;
        }
        p = (byte) -1;
        t = (byte) 0;
        i = "";
        s = "";
        r = "";
        bt.N();
    }

    public final void a(DataInputStream dataInputStream) {
        h = dataInputStream.readInt();
        j = dataInputStream.readShort();
        k = dataInputStream.readUTF();
        m = dataInputStream.readUTF();
        l = dataInputStream.readDouble();
        n[0] = dataInputStream.readInt();
        n[1] = dataInputStream.readInt();
        n[2] = dataInputStream.readInt();
        o = dataInputStream.readByte();
        t = dataInputStream.readByte();
        i = dataInputStream.readUTF();
        s = dataInputStream.readUTF();
        r = dataInputStream.readUTF();
        switch (o) {
            case 0:
                if (n[0] >= 1) {
                    q[0] = true;
                    l += 0.2d;
                    break;
                } else {
                    q[0] = false;
                    break;
                }
            case 1:
                if (n[1] >= 1) {
                    q[1] = true;
                    l += 0.5d;
                    break;
                } else {
                    q[1] = false;
                    break;
                }
            case 2:
                if (n[2] >= 1) {
                    q[2] = true;
                    l += 1.0d;
                    break;
                } else {
                    q[2] = false;
                    break;
                }
        }
    }

    private void c() {
        if (this.a != null) {
            for (int i2 = 0; i2 < this.a.length; i2++) {
                if (this.a[i2] != null) {
                    this.a[i2] = null;
                }
            }
            this.a = null;
        }
    }

    private void d() {
        if (r == null || r.equals("")) {
            this.d.at.a((String) null, t.i, (byte) 1);
        } else {
            this.d.at.a(new StringBuffer().append(m).append("\t").append(i).append("\t").append(s).append("\t").append(r).toString(), t.i, (byte) 1);
        }
    }

    public final void b() {
        this.f = null;
        if (k != null) {
            this.f = k;
        }
    }

    private void e() {
        this.g = null;
        if (u != null) {
            this.g = new bw(u, (short) t.i.stringWidth(u));
        }
    }

    public final void a(boolean z) {
        int i2;
        int i3;
        if (z) {
            this.b = 0;
            this.v = 0;
        }
        if (h != -1) {
            this.c.a(new short[]{j});
        }
        if (this.y == null) {
            this.y = a.ag.a("jianding_02");
            this.z = a.ag.a("jianding_01");
        }
        c();
        this.a = new int[7][4];
        this.d.aq.b();
        this.d.aq.a("装备升星");
        this.d.aq.a(false);
        this.w = Math.max((t.j << 1) + 25, 59);
        this.x = t.j + 13;
        this.d.aq.a(this.w + this.x);
        d();
        b();
        this.d.aq.a(this.d.at);
        this.d.au.a("确定");
        if (t.c > 220) {
            this.d.aq.a(this.d.au);
        }
        this.d.aq.a(t.f, t.g, t.d, t.e);
        this.d.at.a(this.d.at.b, this.d.at.c, (this.d.aq.c / 2) - 6, this.d.at.e);
        if (this.a != null) {
            for (int i4 = 0; i4 < this.a.length; i4++) {
                if (i4 == 0) {
                    i2 = (this.d.aq.a + (this.d.aq.c / 4)) - 8;
                    i3 = ((this.d.aq.b + 32) + this.w) - 30;
                } else if (i4 < 4) {
                    i2 = this.d.aq.a + (this.d.aq.c / 2) + 13;
                    i3 = (((this.d.aq.b + 32) + (this.d.aq.d / 4)) + ((i4 - 1) * 40)) - 20;
                } else {
                    i2 = (this.d.aq.a + ((this.d.aq.c * 3) / 4)) - 18;
                    i3 = (((this.d.aq.b + 32) + (this.d.aq.d / 4)) + ((i4 - 4) * 40)) - 20;
                }
                int i5 = i4;
                int i6 = i2;
                int i7 = i3;
                if (this.a != null && this.a.length > i5) {
                    this.a[i5][0] = i6;
                    this.a[i5][1] = i7;
                    this.a[i5][2] = 17;
                    this.a[i5][3] = 17;
                }
            }
        }
        ca.l = 0;
        this.c.l = (short) 0;
        this.d.j = this.d.k;
        ao aoVar = this.c;
        this.c.k = (short) 102;
        aoVar.j = (short) 102;
    }

    public final void a(int i2) throws IOException {
        bn bnVar;
        if (t == 1) {
            t = (byte) 0;
            this.d.b("升星成功");
        }
        if (this.c.l != 0) {
            if (this.c.l == 1) {
                ca.b(i2);
                if (i2 != 268435456 && i2 != 1073741824) {
                    if (i2 == 536870912) {
                        this.c.l = (short) 0;
                        return;
                    }
                    return;
                }
                if (ca.o == 0) {
                    p = q[0] ? (byte) 0 : q[1] ? (byte) 1 : q[2] ? (byte) 2 : (byte) -1;
                    if (h == -1) {
                        this.d.b("请先放入装备");
                    } else if (m.equals("不能升级")) {
                        this.d.b("该装备不能升星，请选择其它装备");
                    } else {
                        byte[] bArrA = bz.a((short) 4689, h, (byte) 1, p, bt.ad);
                        if (bArrA != null) {
                            a.i.a(new w((short) 4689, bArrA));
                            this.d.a((String) null);
                        } else {
                            this.d.b("获取上传指令数据错误!");
                        }
                    }
                    byte[] bArrA2 = bz.a((short) 4689, h, (byte) 1, p, bt.ad);
                    if (bArrA2 == null) {
                        this.d.b("获取上传指令数据错误!");
                        return;
                    } else {
                        a.i.a(new w((short) 4689, bArrA2));
                        this.d.a((String) null);
                        return;
                    }
                }
                if (ca.o != 1) {
                    if (ca.o == 2) {
                        a();
                        d();
                        b();
                        e();
                        this.c.l = (short) 0;
                        return;
                    }
                    return;
                }
                if (this.c.aw && !this.A) {
                    bt.a(this.c.av);
                } else if (!this.c.aJ || this.A) {
                    int i3 = h;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= bt.bC.size()) {
                            bnVar = null;
                            break;
                        }
                        bn bnVar2 = (bn) bt.bC.elementAt(i4);
                        if (bnVar2 != null && bnVar2.a == i3) {
                            bnVar = bnVar2;
                            break;
                        }
                        i4++;
                    }
                    bn bnVar3 = bnVar;
                    if (bnVar != null) {
                        bt.a(bnVar3);
                    } else {
                        this.d.b("装备不存在");
                    }
                } else {
                    bt.b((int) ao.l(this.c.aq));
                }
                this.c.k = (short) 102;
                this.c.O.a(0, this.c.k, -1);
                return;
            }
            return;
        }
        if (this.d.aq != null) {
            this.d.aq.b(i2);
        }
        if (i2 == 8) {
            this.b--;
            if (this.b < 0) {
                this.b = this.a.length - 4;
            }
            if (this.b == 0) {
                b();
            }
            ca.l = 0;
            return;
        }
        if (i2 == 2) {
            this.b++;
            if (this.b >= this.a.length - 3) {
                this.b = 0;
                b();
            }
            ca.l = 0;
            return;
        }
        if (i2 != 268435456 && i2 != 1073741824) {
            if (i2 == 536870912) {
                c();
                this.f = null;
                this.g = null;
                if (this.c.aw) {
                    this.c.aw = false;
                    this.c.t();
                    return;
                } else if (this.c.aJ) {
                    this.c.aJ = false;
                    this.c.c(false);
                    return;
                } else {
                    this.c.l();
                    this.c.c(1);
                    return;
                }
            }
            return;
        }
        if (this.b == 0) {
            if (h == -1) {
                this.A = true;
                this.c.a((byte) 0, new byte[]{1});
                return;
            } else {
                ca.a(this.d.aq.a + 24, this.d.aq.b + 49, new String[]{"升星", "查看", "取出"}, false);
                this.c.l = (short) 1;
                return;
            }
        }
        if (this.b != 0) {
            int i5 = this.b - 1;
            if (q[i5]) {
                q[i5] = false;
                l -= 0.2d + ((i5 * 0.1d) * (i5 + 2));
                return;
            }
            if (h == -1) {
                this.d.b("请先放入装备");
                return;
            }
            if (m.equals("不能升级")) {
                this.d.b("该装备不能升星，请选择其它装备");
                return;
            }
            if (n[i5] < 1) {
                this.d.b("该材料已经消耗完，请选择其它材料");
                return;
            }
            for (int i6 = 0; i6 < 3; i6++) {
                if (i5 == i6) {
                    q[i5] = true;
                    l += 0.2d + (i5 * 0.1d * (i5 + 2));
                } else if (q[i6]) {
                    q[i6] = false;
                    l -= 0.2d + ((i6 * 0.1d) * (i6 + 2));
                }
            }
        }
    }

    public final void a(Graphics graphics) {
        if (this.d.aq != null) {
            this.d.aq.a(graphics);
            ca.a(graphics, this.d.aq.a + 5, this.d.aq.b + 32, (this.d.aq.c - 11) / 2, this.w, 1);
            ca.a(graphics, this.d.aq.a + 5, this.d.aq.b + 32 + this.w + 1, (this.d.aq.c - 11) / 2, this.x - 2, 1);
            ca.a(graphics, this.d.aq.a + 5 + ((this.d.aq.c - 11) / 2), this.d.aq.b + 32, (this.d.aq.c - 10) / 2, this.d.aq.d - 62, 1);
        }
        if (this.a != null) {
            for (int i2 = 0; i2 < this.a.length; i2++) {
                if (i2 == 0) {
                    this.e.a(graphics, ao.x, (int[]) null, (aj) null, 0, 0, this.a[i2][0], this.a[i2][1], 0, 0);
                } else if (i2 < 4) {
                    this.e.a(graphics, q[i2 - 1] ? this.y : this.z, (int[]) null, (aj) null, 0, 0, this.a[i2][0], this.a[i2][1], 0, 0);
                } else {
                    a.af.e(String.valueOf(1702));
                    a.f.a(graphics, ao.b((short) 1702), (int[]) null, (aj) null, 0, 0, this.a[i2][0], this.a[i2][1], 0, 0);
                    if (n[i2 - 4] > 99) {
                        a.f.a(graphics, a.n, (int[]) null, n[i2 - 4] / 100, 0, 0, (this.a[i2][0] + 13) - 8, this.a[i2][1] + 11, 0, 0);
                        a.f.a(graphics, a.n, (int[]) null, (n[i2 - 4] % 100) / 10, 0, 0, (this.a[i2][0] + 13) - 4, this.a[i2][1] + 11, 0, 0);
                        a.f.a(graphics, a.n, (int[]) null, n[i2 - 4] % 100, 0, 0, this.a[i2][0] + 13, this.a[i2][1] + 11, 0, 0);
                    }
                    if (n[i2 - 4] > 9) {
                        a.f.a(graphics, a.n, (int[]) null, n[i2 - 4] / 10, 0, 0, (this.a[i2][0] + 13) - 4, this.a[i2][1] + 11, 0, 0);
                        a.f.a(graphics, a.n, (int[]) null, n[i2 - 4] % 10, 0, 0, this.a[i2][0] + 13, this.a[i2][1] + 11, 0, 0);
                    } else if (n[i2 - 4] >= 0) {
                        a.f.a(graphics, a.n, (int[]) null, n[i2 - 4] % 10, 0, 0, this.a[i2][0] + 13, this.a[i2][1] + 11, 0, 0);
                    }
                }
            }
        }
        graphics.setColor(255);
        graphics.drawString("装备孔", this.a[0][0] + 8, this.a[0][1] - 2, 33);
        graphics.drawString("幸运材料", this.a[4][0] + 13, this.a[4][1] - 12, 33);
        graphics.drawString("+20%", this.a[4][0] + 42, this.a[4][1] + 18, 33);
        graphics.drawString("+50%", this.a[5][0] + 42, this.a[5][1] + 18, 33);
        graphics.drawString("+100%", this.a[6][0] + 42, this.a[6][1] + 18, 33);
        if (h != -1) {
            this.e.a(graphics, ao.b(j), (int[]) null, (aj) null, 0, 0, this.a[0][0], this.a[0][1], 0, 0);
        }
        ca.d(graphics, this.a[this.b][0], this.a[this.b][1], 17, 17);
        if (h != -1) {
            double d = l + 0.001d > 1.0d ? 1.0d : 8.4E-323d;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("成功率：");
            stringBuffer.append((int) (d * 100.0d));
            stringBuffer.append("%");
            u = stringBuffer.toString();
            e();
            if (u != null) {
                this.g.a(graphics, this.d.aq.a + 5 + 6, this.d.aq.b + 32 + this.w + 6, 0);
            }
        }
        if (this.c.l != 0) {
            if (this.c.l == 1) {
                ca.c(graphics);
            }
        } else if (this.b == 0) {
            if (this.f == null && this.f == "") {
                return;
            }
            ca.b(graphics, this.f, this.d.aq.a + 5 + 2, this.d.aq.b + 32 + 8 + ao.x.c, t.c - 5, 1);
        }
    }
}

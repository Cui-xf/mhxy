/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import com.yinhan.kjava.main.a;
import java.io.DataInputStream;
import javax.microedition.lcdui.Graphics;

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

    public ch(ao ao2, a a2, ai ai2) {
        this.c = ao2;
        this.d = a2;
        this.e = ai2;
    }

    public static void a() {
        h = -1;
        j = (short)-1;
        k = "";
        l = 0.0;
        m = "";
        n = new int[3];
        q = new boolean[3];
        for (int i2 = 0; i2 < 3; ++i2) {
            ch.n[i2] = 0;
            ch.q[i2] = false;
        }
        p = (byte)-1;
        t = 0;
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
        ch.n[0] = dataInputStream.readInt();
        ch.n[1] = dataInputStream.readInt();
        ch.n[2] = dataInputStream.readInt();
        o = dataInputStream.readByte();
        t = dataInputStream.readByte();
        i = dataInputStream.readUTF();
        s = dataInputStream.readUTF();
        r = dataInputStream.readUTF();
        byte by2 = o;
        switch (by2) {
            case 0: {
                if (n[0] < 1) {
                    ch.q[0] = false;
                    return;
                }
                ch.q[0] = true;
                l += 0.2;
                return;
            }
            case 1: {
                if (n[1] < 1) {
                    ch.q[1] = false;
                    return;
                }
                ch.q[1] = true;
                l += 0.5;
                return;
            }
            case 2: {
                if (n[2] < 1) {
                    ch.q[2] = false;
                    return;
                }
                ch.q[2] = true;
                l += 1.0;
            }
        }
    }

    private void c() {
        if (this.a != null) {
            for (int i2 = 0; i2 < this.a.length; ++i2) {
                if (this.a[i2] == null) continue;
                this.a[i2] = null;
            }
            this.a = null;
        }
    }

    private void d() {
        if (r != null && !r.equals("")) {
            this.d.at.a(m + "\t" + i + "\t" + s + "\t" + r, t.i, (byte)1);
            return;
        }
        this.d.at.a(null, t.i, (byte)1);
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
            this.g = new bw(u, (short)t.i.stringWidth(u));
        }
    }

    /*
     * WARNING - void declaration
     */
    public final void a(boolean bl2) {
        if (bl2) {
            this.b = 0;
            this.v = 0;
        }
        if (h != -1) {
            this.c.a(new short[]{j});
        }
        if (this.y == null) {
            this.y = com.yinhan.kjava.main.a.ag.a("jianding_02");
            this.z = com.yinhan.kjava.main.a.ag.a("jianding_01");
        }
        this.c();
        this.a = new int[7][4];
        this.d.aq.b();
        this.d.aq.a("\u88c5\u5907\u5347\u661f");
        this.d.aq.a(false);
        this.w = Math.max((t.j << 1) + 25, 59);
        this.x = t.j + 13;
        this.d.aq.a(this.w + this.x);
        this.d();
        this.b();
        this.d.aq.a(this.d.at);
        this.d.au.a("\u786e\u5b9a");
        if (t.c > 220) {
            this.d.aq.a(this.d.au);
        }
        this.d.aq.a(t.f, t.g, t.d, t.e);
        this.d.at.a(this.d.at.b, this.d.at.c, this.d.aq.c / 2 - 6, this.d.at.e);
        boolean ch2 = false;
        int n2 = 0;
        if (this.a != null) {
            for (int i2 = 0; i2 < this.a.length; ++i2) {
                void var1_6;
                if (i2 == 0) {
                    int n3 = this.d.aq.a + this.d.aq.c / 4 - 8;
                    n2 = this.d.aq.b + 32 + this.w - 30;
                } else if (i2 < 4) {
                    int n4 = this.d.aq.a + this.d.aq.c / 2 + 13;
                    n2 = this.d.aq.b + 32 + this.d.aq.d / 4 + (i2 - 1) * 40 - 20;
                } else {
                    int n5 = this.d.aq.a + this.d.aq.c * 3 / 4 - 18;
                    n2 = this.d.aq.b + 32 + this.d.aq.d / 4 + (i2 - 4) * 40 - 20;
                }
                int n7 = 17;
                n7 = 17;
                int n8 = n2;
                void var4_12 = var1_6;
                n2 = i2;
                ch ch3 = this;
                if (ch3.a == null || ch3.a.length <= n2) continue;
                ch3.a[n2][0] = var4_12;
                ch3.a[n2][1] = n8;
                ch3.a[n2][2] = 17;
                ch3.a[n2][3] = 17;
            }
        }
        ca.l = 0;
        this.c.l = 0;
        this.d.j = this.d.k;
        this.c.k = (short)102;
        this.c.j = (short)102;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void a(int n2) {
        if (t == 1) {
            t = 0;
            this.d.b("\u5347\u661f\u6210\u529f");
        }
        if (this.c.l == 0) {
            if (this.d.aq != null) {
                this.d.aq.b(n2);
            }
            if (n2 == 8) {
                --this.b;
                if (this.b < 0) {
                    this.b = this.a.length - 4;
                }
                if (this.b == 0) {
                    this.b();
                }
                ca.l = 0;
                return;
            }
            if (n2 == 2) {
                ++this.b;
                if (this.b >= this.a.length - 3) {
                    this.b = 0;
                    this.b();
                }
                ca.l = 0;
                return;
            }
            if (n2 == 0x10000000 || n2 == 0x40000000) {
                if (this.b == 0) {
                    if (h == -1) {
                        this.A = true;
                        this.c.a((byte)0, new byte[]{1});
                        return;
                    }
                    ca.a(this.d.aq.a + 24, this.d.aq.b + 49, new String[]{"\u5347\u661f", "\u67e5\u770b", "\u53d6\u51fa"}, false);
                    this.c.l = 1;
                    return;
                }
                if (this.b == 0) return;
                n2 = this.b - 1;
                if (q[n2]) {
                    ch.q[n2] = false;
                    l -= 0.2 + (double)n2 * 0.1 * (double)(n2 + 2);
                    return;
                }
                if (h == -1) {
                    this.d.b("\u8bf7\u5148\u653e\u5165\u88c5\u5907");
                    return;
                }
                if (m.equals("\u4e0d\u80fd\u5347\u7ea7")) {
                    this.d.b("\u8be5\u88c5\u5907\u4e0d\u80fd\u5347\u661f\uff0c\u8bf7\u9009\u62e9\u5176\u5b83\u88c5\u5907");
                    return;
                }
                if (n[n2] < 1) {
                    this.d.b("\u8be5\u6750\u6599\u5df2\u7ecf\u6d88\u8017\u5b8c\uff0c\u8bf7\u9009\u62e9\u5176\u5b83\u6750\u6599");
                    return;
                }
                for (int i2 = 0; i2 < 3; ++i2) {
                    if (n2 == i2) {
                        ch.q[n2] = true;
                        l += 0.2 + (double)n2 * 0.1 * (double)(n2 + 2);
                        continue;
                    }
                    if (!q[i2]) continue;
                    ch.q[i2] = false;
                    l -= 0.2 + (double)i2 * 0.1 * (double)(i2 + 2);
                }
                return;
            }
            if (n2 != 0x20000000) return;
            this.c();
            this.f = null;
            this.g = null;
            if (this.c.aw) {
                this.c.aw = false;
                this.c.t();
                return;
            }
            if (this.c.aJ) {
                this.c.aJ = false;
                this.c.c(false);
                return;
            }
            this.c.l();
            this.c.c(1);
            return;
        }
        if (this.c.l != 1) return;
        ca.b(n2);
        if (n2 == 0x10000000 || n2 == 0x40000000) {
            if (ca.o == 0) {
                w w2;
                n2 = q[0] ? 0 : (q[1] ? 1 : (q[2] ? 2 : -1));
                p = (byte)n2;
                if (h == -1) {
                    this.d.b("\u8bf7\u5148\u653e\u5165\u88c5\u5907");
                } else if (m.equals("\u4e0d\u80fd\u5347\u7ea7")) {
                    this.d.b("\u8be5\u88c5\u5907\u4e0d\u80fd\u5347\u661f\uff0c\u8bf7\u9009\u62e9\u5176\u5b83\u88c5\u5907");
                } else {
                    byte[] byArray = null;
                    byArray = bz.a((short)4689, h, (byte)1, p, bt.ad);
                    if (byArray != null) {
                        w2 = new w(4689, byArray);
                        com.yinhan.kjava.main.a.i.a(w2);
                        this.d.a((String)null);
                    } else {
                        this.d.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
                    }
                }
                byte[] byArray = null;
                byArray = bz.a((short)4689, h, (byte)1, p, bt.ad);
                if (byArray != null) {
                    w2 = new w(4689, byArray);
                    com.yinhan.kjava.main.a.i.a(w2);
                    this.d.a((String)null);
                    return;
                }
                this.d.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
                return;
            }
            if (ca.o == 1) {
                if (this.c.aw && !this.A) {
                    bt.a(this.c.av);
                } else if (this.c.aJ && !this.A) {
                    bt.b((int)ao.l(this.c.aq));
                } else {
                    bn bn2;
                    bn bn3;
                    block36: {
                        n2 = h;
                        bn bn4 = null;
                        for (int i3 = 0; i3 < bt.bC.size(); ++i3) {
                            bn4 = (bn)bt.bC.elementAt(i3);
                            if (bn4 == null || bn4.a != n2) continue;
                            bn3 = bn4;
                            break block36;
                        }
                        bn3 = bn2 = null;
                    }
                    if (bn3 != null) {
                        bt.a(bn2);
                    } else {
                        this.d.b("\u88c5\u5907\u4e0d\u5b58\u5728");
                    }
                }
                this.c.k = (short)102;
                this.c.O.a(0, this.c.k, -1);
                return;
            }
            if (ca.o != 2) return;
            ch.a();
            this.d();
            this.b();
            this.e();
            this.c.l = 0;
            return;
        }
        if (n2 != 0x20000000) return;
        this.c.l = 0;
    }

    public final void a(Graphics graphics) {
        int n2;
        if (this.d.aq != null) {
            this.d.aq.a(graphics);
            ca.a(graphics, this.d.aq.a + 5, this.d.aq.b + 32, (this.d.aq.c - 11) / 2, this.w, 1);
            ca.a(graphics, this.d.aq.a + 5, this.d.aq.b + 32 + this.w + 1, (this.d.aq.c - 11) / 2, this.x - 2, 1);
            ca.a(graphics, this.d.aq.a + 5 + (this.d.aq.c - 11) / 2, this.d.aq.b + 32, (this.d.aq.c - 10) / 2, this.d.aq.d - 62, 1);
        }
        if (this.a != null) {
            for (n2 = 0; n2 < this.a.length; ++n2) {
                if (n2 == 0) {
                    this.e.a(graphics, ao.x, null, null, 0, 0, this.a[n2][0], this.a[n2][1], 0, 0);
                    continue;
                }
                if (n2 < 4) {
                    this.e.a(graphics, q[n2 - 1] ? this.y : this.z, null, null, 0, 0, this.a[n2][0], this.a[n2][1], 0, 0);
                    continue;
                }
                com.yinhan.kjava.main.a.af.e(String.valueOf(1702));
                com.yinhan.kjava.main.a.f.a(graphics, ao.b((short)1702), null, null, 0, 0, this.a[n2][0], this.a[n2][1], 0, 0);
                if (n[n2 - 4] > 99) {
                    com.yinhan.kjava.main.a.f.a(graphics, com.yinhan.kjava.main.a.n, null, n[n2 - 4] / 100, 0, 0, this.a[n2][0] + 13 - 8, this.a[n2][1] + 11, 0, 0);
                    com.yinhan.kjava.main.a.f.a(graphics, com.yinhan.kjava.main.a.n, null, n[n2 - 4] % 100 / 10, 0, 0, this.a[n2][0] + 13 - 4, this.a[n2][1] + 11, 0, 0);
                    com.yinhan.kjava.main.a.f.a(graphics, com.yinhan.kjava.main.a.n, null, n[n2 - 4] % 100, 0, 0, this.a[n2][0] + 13, this.a[n2][1] + 11, 0, 0);
                }
                if (n[n2 - 4] > 9) {
                    com.yinhan.kjava.main.a.f.a(graphics, com.yinhan.kjava.main.a.n, null, n[n2 - 4] / 10, 0, 0, this.a[n2][0] + 13 - 4, this.a[n2][1] + 11, 0, 0);
                    com.yinhan.kjava.main.a.f.a(graphics, com.yinhan.kjava.main.a.n, null, n[n2 - 4] % 10, 0, 0, this.a[n2][0] + 13, this.a[n2][1] + 11, 0, 0);
                    continue;
                }
                if (n[n2 - 4] < 0) continue;
                com.yinhan.kjava.main.a.f.a(graphics, com.yinhan.kjava.main.a.n, null, n[n2 - 4] % 10, 0, 0, this.a[n2][0] + 13, this.a[n2][1] + 11, 0, 0);
            }
        }
        graphics.setColor(255);
        graphics.drawString("\u88c5\u5907\u5b54", this.a[0][0] + 8, this.a[0][1] - 2, 33);
        graphics.drawString("\u5e78\u8fd0\u6750\u6599", this.a[4][0] + 13, this.a[4][1] - 12, 33);
        graphics.drawString("+20%", this.a[4][0] + 42, this.a[4][1] + 18, 33);
        graphics.drawString("+50%", this.a[5][0] + 42, this.a[5][1] + 18, 33);
        graphics.drawString("+100%", this.a[6][0] + 42, this.a[6][1] + 18, 33);
        if (h != -1) {
            this.e.a(graphics, ao.b(j), null, null, 0, 0, this.a[0][0], this.a[0][1], 0, 0);
        }
        ca.d(graphics, this.a[this.b][0], this.a[this.b][1], 17, 17);
        if (h != -1) {
            double d2;
            double d3 = l + 0.001;
            if (d2 > 1.0) {
                d3 = 1.0;
            }
            n2 = (int)(d3 * 100.0);
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("\u6210\u529f\u7387\uff1a");
            stringBuffer.append(n2);
            stringBuffer.append("%");
            u = stringBuffer.toString();
            this.e();
            if (u != null) {
                this.g.a(graphics, this.d.aq.a + 5 + 6, this.d.aq.b + 32 + this.w + 6, 0);
            }
        }
        if (this.c.l == 0) {
            if (this.b == 0 && (this.f != null || this.f != "")) {
                ca.b(graphics, this.f, this.d.aq.a + 5 + 2, this.d.aq.b + 32 + 8 + ao.x.c, t.c - 5, 1);
                return;
            }
        } else if (this.c.l == 1) {
            ca.c(graphics);
        }
    }
}


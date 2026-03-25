/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import com.yinhan.kjava.main.a;
import java.io.DataInputStream;
import javax.microedition.lcdui.Graphics;

public final class k {
    private final String[] h = new String[]{"\u4e3b\u6750\u6599", "\u4e3b\u6750\u6599\u4e8c", "\u8f85\u52a9\u6750\u6599"};
    private ao i;
    private a j;
    public int a;
    public int b;
    public int c;
    private short k;
    private String l;
    public int d;
    private String m;
    private short n;
    private String o;
    public int[] e;
    private short[] p;
    private String[] q;
    public byte[] f;
    private String r;
    private String s;
    private bw t = null;
    private bw u = null;
    private String v;
    public int[][] g;
    private int w;
    private int x;

    public k(ao ao2, a a2, ai ai2) {
        this.i = ao2;
        this.j = a2;
    }

    public final void a(DataInputStream object) {
        int n2;
        boolean bl2 = false;
        if (this.c > 0) {
            bl2 = true;
        }
        this.c = ((DataInputStream)object).readInt();
        this.k = ((DataInputStream)object).readShort();
        this.l = ((DataInputStream)object).readUTF();
        this.d = ((DataInputStream)object).readInt();
        this.m = ((DataInputStream)object).readUTF();
        this.n = ((DataInputStream)object).readShort();
        this.o = ((DataInputStream)object).readUTF();
        int n3 = ((DataInputStream)object).readByte();
        if (n3 > 0) {
            this.e = new int[n3];
            this.p = new short[n3];
            this.f = new byte[n3];
            this.q = new String[n3];
            for (n2 = 0; n2 < n3; ++n2) {
                this.e[n2] = ((DataInputStream)object).readInt();
                this.p[n2] = ((DataInputStream)object).readShort();
                this.q[n2] = ((DataInputStream)object).readUTF();
                this.f[n2] = ((DataInputStream)object).readByte();
            }
        } else {
            this.e = null;
            this.p = null;
            this.f = null;
        }
        this.r = ((DataInputStream)object).readUTF();
        this.s = ((DataInputStream)object).readUTF();
        bt.N();
        k.b(this.c);
        k.b(this.d);
        if (this.e != null && this.e.length > 0) {
            for (n2 = 0; n2 < this.e.length; ++n2) {
                k.b(this.e[n2]);
            }
        }
        if (bl2) {
            object = this;
            if (((k)object).s != null && !((k)object).s.equals("")) {
                ((k)object).j.at.a(((k)object).s, t.i, (byte)1);
            } else {
                ((k)object).j.at.a(null, t.i, (byte)1);
            }
        }
        this.d();
        this.e();
        this.f();
    }

    private static void b(int n2) {
        if (bt.bC == null || bt.bC.size() <= 0) {
            return;
        }
        bn bn2 = null;
        for (int i2 = 0; i2 < bt.bC.size(); ++i2) {
            bn2 = (bn)bt.bC.elementAt(i2);
            if (bn2 == null || bn2.a != n2) continue;
            bn2.v = (byte)(bn2.v + 1);
        }
    }

    private void b() {
        if (this.g != null) {
            for (int i2 = 0; i2 < this.g.length; ++i2) {
                if (this.g[i2] == null) continue;
                this.g[i2] = null;
            }
            this.g = null;
        }
    }

    private void c() {
        if (this.s != null && !this.s.equals("")) {
            this.j.at.a(this.s, t.i, (byte)1);
            return;
        }
        this.j.at.a(null, t.i, (byte)1);
    }

    private String c(int n2) {
        if (this.e == null || this.e.length <= 0) {
            return null;
        }
        for (int i2 = 0; i2 < this.f.length; ++i2) {
            if (this.f[i2] != n2) continue;
            return this.q[i2];
        }
        return null;
    }

    private void d() {
        this.v = null;
        if (this.b == 0) {
            if (this.a == 0) {
                if (this.l != null) {
                    this.v = this.l;
                    return;
                }
            } else if (this.a == 1 && this.o != null) {
                this.v = this.m;
                return;
            }
        } else if (this.b == 1 && this.q != null && this.q.length > 0 && this.c(this.a) != null) {
            this.v = this.c(this.a);
        }
    }

    private void e() {
        this.t = null;
        if (this.o != null && !this.o.equals("")) {
            this.t = new bw("<0>\u94f6\u4e24\uff1a</0><5></5>" + this.o + (this.o.equals("0") ? "" : "\u4e07"), (short)(t.d - 20));
        }
    }

    private void f() {
        this.u = null;
        if (this.r != null) {
            this.u = new bw(this.r, (short)(t.d - 20));
        }
    }

    private int d(int n2) {
        if (this.e == null || this.e.length < 0) {
            return -1;
        }
        for (int i2 = 0; i2 < this.e.length; ++i2) {
            if (this.f[i2] != n2) continue;
            return this.e[i2];
        }
        return -1;
    }

    private static bn e(int n2) {
        bn bn2 = null;
        for (int i2 = 0; i2 < bt.bC.size(); ++i2) {
            bn2 = (bn)bt.bC.elementAt(i2);
            if (bn2 == null || bn2.a != n2) continue;
            return bn2;
        }
        return null;
    }

    public final void a() {
        this.c = -1;
        this.k = (short)-1;
        this.l = null;
        this.d = -1;
        this.n = (short)-1;
        this.m = null;
        this.o = null;
        this.e = null;
        this.p = null;
        if (this.q != null) {
            for (int i2 = 0; i2 < this.q.length; ++i2) {
                this.q[i2] = null;
            }
        }
        this.q = null;
        this.f = null;
        this.r = null;
        this.s = null;
        bt.N();
    }

    public final void a(boolean bl2) {
        if (bl2) {
            this.a = 0;
            this.b = 0;
        }
        if (this.c != -1) {
            this.i.a(new short[]{this.k});
        }
        if (this.d != -1) {
            this.i.a(new short[]{this.n});
        }
        if (this.p != null) {
            this.i.a(this.p);
        }
        this.b();
        this.g = new int[5][4];
        this.j.aq.b();
        this.j.aq.a("\u7269\u54c1\u5408\u6210");
        this.j.aq.a(false);
        this.w = (Math.max(t.j, 17) << 1) + 10;
        this.x = t.j + 26 + 5;
        this.j.aq.a(this.w + this.x);
        this.c();
        this.j.aq.a(this.j.at);
        this.j.at.a((byte)1);
        this.j.au.a("\u786e\u5b9a");
        if (t.c > 220) {
            this.j.aq.a(this.j.au);
        }
        this.j.aq.a(t.f, t.g, t.d, t.e);
        this.d();
        this.e();
        this.f();
        ca.l = 0;
        this.i.l = 0;
        this.j.j = this.j.k;
        this.i.k = (short)118;
        this.i.j = (short)118;
    }

    public final void a(int n2) {
        if (this.i.l == 0) {
            if (this.j.aq != null) {
                this.j.aq.b(n2);
            }
            if (n2 == 4 || n2 == 1) {
                this.b = this.b == 0 ? 1 : 0;
                this.a = this.b == 0 ? 1 : 0;
                ca.l = 0;
                this.d();
                this.e();
                this.f();
            } else if (n2 == 2) {
                if (this.b == 0) {
                    this.a = this.a == 0 ? 1 : 0;
                } else if (this.b == 1) {
                    this.a = this.a == 2 ? 0 : this.a + 1;
                }
                ca.l = 0;
                this.d();
                this.e();
                this.f();
            } else if (n2 == 8) {
                if (this.b == 0) {
                    this.a = this.a == 0 ? 1 : 0;
                } else if (this.b == 1) {
                    this.a = this.a == 0 ? 2 : this.a - 1;
                }
                ca.l = 0;
                this.d();
                this.e();
                this.f();
            } else if (n2 == 0x10000000 || n2 == 0x40000000) {
                if (this.b == 0) {
                    if (this.a == 0) {
                        if (this.c == -1) {
                            this.i.a((byte)0, new byte[]{7});
                        } else {
                            ca.a(this.g[this.a][0] + ao.x.b / 2, this.g[this.a][1] + ao.x.b / 2, new String[]{"\u5408\u6210", "\u67e5\u770b", "\u53d6\u6d88"}, false);
                            this.i.l = 1;
                        }
                    } else if (this.a == 1) {
                        if (this.c == -1) {
                            this.j.b("\u8bf7\u5148\u653e\u5165\u4e3b\u6750\u6599\u4e00");
                        } else if (this.d == -1) {
                            this.i.a((byte)0, new byte[]{7});
                        } else {
                            ca.a(this.g[this.a][0] + ao.x.b / 2, this.g[this.a][1] + ao.x.b / 2, new String[]{"\u53d6\u51fa"}, false);
                            System.out.println("GameSys.goods.width:" + ao.x.b);
                            this.i.l = 1;
                        }
                    }
                } else if (this.b == 1) {
                    if (this.d(this.a) != -1) {
                        ca.a(this.g[this.a + 2][0] + ao.x.b / 2, this.g[this.a + 2][1] + ao.x.b / 2, new String[]{"\u53d6\u51fa"}, false);
                        this.i.l = 1;
                    } else if (this.c != -1 && this.d != -1) {
                        this.i.a((byte)0, new byte[]{8});
                    } else {
                        this.j.b("\u8bf7\u5148\u653e\u6ee1\u4e3b\u6750\u6599");
                    }
                }
            }
            if (n2 == 0x20000000) {
                this.a();
                this.b();
                this.v = null;
                this.u = null;
                this.i.l();
                this.i.c(5);
            }
        } else if (this.i.l == 1) {
            ca.b(n2);
            if (n2 == 0x10000000 || n2 == 0x40000000) {
                if (ca.o == 0) {
                    if (this.b == 1) {
                        Object object = bz.a((byte)5, this.c, this.d, this.e, this.f, this.d(this.a), (byte)this.a, bt.ad);
                        if (object != null) {
                            object = new w(4266, (byte[])object);
                            com.yinhan.kjava.main.a.i.a((w)object);
                            this.j.a((String)null);
                        } else {
                            this.j.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
                        }
                    } else {
                        Object object = null;
                        if (this.a == 0) {
                            object = bz.a((byte)0, this.c, this.d, this.e, this.f, -1, (byte)-1, bt.ad);
                        } else if (this.a == 1) {
                            object = bz.a((byte)3, this.c, this.d, this.e, this.f, -1, (byte)-1, bt.ad);
                        }
                        if (object != null) {
                            object = new w(4266, (byte[])object);
                            com.yinhan.kjava.main.a.i.a((w)object);
                            this.j.a((String)null);
                        } else {
                            this.j.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
                        }
                    }
                } else if (ca.o == 1) {
                    bt.a(k.e(this.c));
                    this.i.O.a(0, this.i.k, -1);
                } else if (ca.o == 2) {
                    this.a();
                    this.c();
                    this.d();
                    this.e();
                    this.f();
                    this.i.l = 0;
                }
            } else if (n2 == 0x20000000) {
                ca.l = 0;
                this.d();
                this.e();
                this.f();
                this.i.l = 0;
            }
        }
        this.j.a = 0;
    }

    public final void a(Graphics graphics) {
        bf bf2;
        bf bf3;
        int n2;
        int n3 = ao.x.b;
        if (this.j.aq != null) {
            this.j.aq.a(graphics);
            ca.a(graphics, this.j.aq.a + 5, this.j.aq.b + 32, this.j.aq.c - 11, this.w, 1);
            ca.a(graphics, this.j.aq.a + 5, this.j.aq.b + 32 + this.w + 1, this.j.aq.c - 11, this.x - 2, 1);
        }
        int n4 = this.j.aq.a + t.i.stringWidth(this.h[0]) + 10;
        int n5 = this.j.aq.b + 40;
        if (this.g == null) {
            this.g = new int[5][4];
        }
        for (n2 = 0; n2 < this.g.length; ++n2) {
            if (n2 > 1) {
                n4 = this.j.aq.a + this.j.aq.c - 3 * (n3 + 5) - 8;
            }
            int n6 = 17;
            n6 = 17;
            int n7 = n5 + (n2 > 1 ? n3 : 0);
            int n8 = n4 + 2 + (n2 < 2 ? (n2 == 0 ? 0 : n3 + 5) : (n2 - 2) * (n3 + 5));
            int n9 = n2;
            k k2 = this;
            if (k2.g != null && k2.g.length > n9) {
                k2.g[n9][0] = n8;
                k2.g[n9][1] = n7;
                k2.g[n9][2] = 17;
                k2.g[n9][3] = 17;
            }
            graphics.drawImage(ao.x.a, this.g[n2][0], this.g[n2][1], 20);
        }
        graphics.setColor(255);
        graphics.drawString(this.h[0], this.g[0][0] - 2, this.g[0][1] + (n3 - t.j) / 2, 24);
        graphics.drawString(this.h[2], this.g[2][0] - 2, this.g[2][1] - n3 + (n3 - t.j) / 2, 20);
        if (this.c != -1 && (bf3 = ao.b(this.k)) != null) {
            graphics.drawImage(bf3.a, this.g[0][0] + 1, this.g[0][1] + 1, 20);
        }
        if (this.d != -1 && (bf2 = ao.b(this.n)) != null) {
            graphics.drawImage(bf2.a, this.g[1][0] + 1, this.g[1][1] + 1, 20);
        }
        if (this.p != null && this.p.length > 0) {
            bf bf4 = null;
            for (n3 = 0; n3 < this.p.length; ++n3) {
                bf4 = ao.b(this.p[n3]);
                if (bf4 == null) continue;
                graphics.drawImage(bf4.a, this.g[2 + this.f[n3]][0] + 1, this.g[2 + this.f[n3]][1] + 1, 20);
            }
        }
        n2 = this.a + (this.b << 1);
        ca.d(graphics, this.g[n2][0], this.g[n2][1], 17, 17);
        if (this.t != null) {
            try {
                this.t.a(graphics, this.j.aq.a + 5 + 6, this.j.aq.b + this.w + 8, 0);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        if (this.r != null) {
            try {
                this.u.a(graphics, this.j.aq.a + 5 + 6, this.j.aq.b + 32 + this.w + 1 + 3, 0);
            }
            catch (Exception exception) {
                Exception exception3 = exception;
                exception.printStackTrace();
            }
        }
        if (this.i.l == 0 && (this.v != null || this.v != "")) {
            if ((this.b != 0 || this.a != 1) && this.b == 1) {
                ca.b(graphics, this.v, this.g[this.a + 2][0] + ao.x.b / 2, this.g[this.a + 2][1] + ao.x.b / 2, t.c - 5, 1);
            } else {
                ca.b(graphics, this.v, this.g[this.a][0] + ao.x.b / 2, this.g[this.a][1] + ao.x.b / 2, t.c - 5, 1);
            }
        }
        if (this.i.l == 1) {
            ca.c(graphics);
        }
    }
}


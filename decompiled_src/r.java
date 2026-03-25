/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import com.yinhan.kjava.main.a;
import java.io.DataInputStream;
import javax.microedition.lcdui.Graphics;

public final class r {
    private final String[] h = new String[]{"\u88c5\u5907\u5b54", "\u9644\u9b54\u7b26", "\u5e78\u8fd0\u6750\u6599"};
    private ao i;
    private a j;
    public int a;
    public int b;
    public int c;
    private short k;
    private String l;
    public long d;
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
    private String u;
    public int[][] g;
    private int v;
    private int w;
    private boolean x = false;

    public r(ao ao2, a a2, ai ai2) {
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
        this.d = ((DataInputStream)object).readLong();
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
        r.b(this.c);
        r.b((int)this.d);
        if (this.e != null && this.e.length > 0) {
            for (n2 = 0; n2 < this.e.length; ++n2) {
                r.b(this.e[n2]);
            }
        }
        if (bl2) {
            object = this;
            if (((r)object).s != null && !((r)object).s.equals("")) {
                ((r)object).j.at.a(((r)object).s, t.i, (byte)1);
            } else {
                ((r)object).j.at.a(null, t.i, (byte)1);
            }
        }
        this.a();
        this.e();
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

    private void c() {
        if (this.g != null) {
            for (int i2 = 0; i2 < this.g.length; ++i2) {
                if (this.g[i2] == null) continue;
                this.g[i2] = null;
            }
            this.g = null;
        }
    }

    private void d() {
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

    public final void a() {
        this.u = null;
        if (this.b == 0) {
            if (this.a == 0) {
                if (this.l != null) {
                    this.u = this.l;
                    return;
                }
            } else if (this.a == 1 && this.o != null) {
                this.u = this.m;
                return;
            }
        } else if (this.b == 1 && this.q != null && this.q.length > 0 && this.c(this.a) != null) {
            this.u = this.c(this.a);
        }
    }

    private void e() {
        this.t = null;
        StringBuffer stringBuffer = new StringBuffer();
        if (this.r != null || this.o != null) {
            stringBuffer.append(this.o == null ? "" : this.o);
            stringBuffer.append("\t");
            stringBuffer.append(this.r == null ? "\u65e0\u5e78\u8fd0\u52a0\u6210" : this.r);
            this.t = new bw(stringBuffer.toString(), (short)(t.d - 20));
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

    public final void b() {
        this.c = -1;
        this.k = (short)-1;
        this.l = null;
        this.d = -1L;
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
        this.x = false;
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
        if (this.d != -1L) {
            this.i.a(new short[]{this.n});
        }
        if (this.p != null) {
            this.i.a(this.p);
        }
        this.c();
        this.g = new int[5][4];
        this.j.aq.b();
        this.j.aq.a("\u88c5\u5907\u9644\u9b54");
        this.j.aq.a(false);
        this.v = Math.max((t.j << 1) + 25, 59);
        this.w = t.j + 26 + 5;
        this.j.aq.a(this.v + this.w);
        this.d();
        this.j.aq.a(this.j.at);
        this.j.at.a((byte)1);
        this.j.au.a("\u786e\u5b9a");
        if (t.c > 220) {
            this.j.aq.a(this.j.au);
        }
        this.j.aq.a(t.f, t.g, t.d, t.e);
        this.a();
        this.e();
        ca.l = 0;
        this.i.l = 0;
        this.j.j = this.j.k;
        this.i.k = (short)110;
        this.i.j = (short)110;
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
                this.a();
                this.e();
            } else if (n2 == 2) {
                if (this.b == 0) {
                    this.a = this.a == 0 ? 1 : 0;
                } else if (this.b == 1) {
                    this.a = this.a == 2 ? 0 : this.a + 1;
                }
                ca.l = 0;
                this.a();
                this.e();
            } else if (n2 == 8) {
                if (this.b == 0) {
                    this.a = this.a == 0 ? 1 : 0;
                } else if (this.b == 1) {
                    this.a = this.a == 0 ? 2 : this.a - 1;
                }
                ca.l = 0;
                this.a();
                this.e();
            } else if (n2 == 0x10000000 || n2 == 0x40000000) {
                if (this.b == 0) {
                    if (this.a == 0) {
                        if (this.c == -1) {
                            this.x = true;
                            this.i.a((byte)0, new byte[]{0});
                        } else {
                            ca.a(this.j.aq.a + t.k * 3 + 29, this.j.aq.b + 49, new String[]{"\u9644\u9b54", "\u67e5\u770b", "\u53d6\u51fa"}, false);
                            this.i.l = 1;
                        }
                    } else if (this.a == 1) {
                        if (this.c == -1) {
                            this.j.b("\u8bf7\u5148\u653e\u5165\u9700\u8981\u9644\u9b54\u7684\u88c5\u5907");
                        } else if (this.d == -1L) {
                            this.i.a((byte)0, new byte[]{3});
                        } else {
                            ca.a(this.j.aq.c - 3 * ao.x.b - 21, this.j.aq.b + 49, new String[]{"\u53d6\u51fa"}, false);
                            this.i.l = 1;
                        }
                    }
                } else if (this.b == 1) {
                    if (this.d(this.a) != -1) {
                        ca.a(this.j.aq.c - 10 - ao.x.b - (this.a + 2 * (1 - this.a)) * (ao.x.b + 10) - ca.q / 2 + 9, this.j.aq.b + ao.x.c + 69, new String[]{"\u53d6\u51fa"}, false);
                        this.i.l = 1;
                    } else if (this.c != -1 && this.d != -1L) {
                        this.i.a((byte)0, new byte[]{4});
                    } else {
                        this.j.b("\u8bf7\u5148\u653e\u5165\u9644\u9b54\u88c5\u5907\u4e0e\u9644\u9b54\u7b26");
                    }
                }
            } else if (n2 == 0x20000000) {
                this.b();
                this.c();
                this.u = null;
                this.t = null;
                if (this.i.aw) {
                    this.i.aw = false;
                    this.i.t();
                } else if (this.i.aJ) {
                    this.i.aJ = false;
                    this.i.c(false);
                } else {
                    this.i.l();
                    this.i.c(0);
                }
            }
        } else if (this.i.l == 1) {
            ca.b(n2);
            if (n2 == 0x10000000 || n2 == 0x40000000) {
                if (ca.o == 0) {
                    if (this.b == 1) {
                        Object object = bz.a((short)4262, this.c, this.d, (byte)2, this.e, this.f, this.d(this.a), (byte)this.a, bt.ad);
                        if (object != null) {
                            object = new w(4262, (byte[])object);
                            com.yinhan.kjava.main.a.i.a((w)object);
                            this.j.a((String)null);
                        } else {
                            this.j.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
                        }
                    } else {
                        Object object = null;
                        if (this.a == 0) {
                            object = bz.a((short)4262, this.c, this.d, (byte)3, this.e, this.f, -1, (byte)-1, bt.ad);
                        } else if (this.a == 1) {
                            object = bz.a((short)4262, this.c, this.d, (byte)5, this.e, this.f, -1, (byte)-1, bt.ad);
                        }
                        if (object != null) {
                            object = new w(4262, (byte[])object);
                            com.yinhan.kjava.main.a.i.a((w)object);
                            this.j.a((String)null);
                        } else {
                            this.j.b("\u83b7\u53d6\u4e0a\u4f20\u6307\u4ee4\u6570\u636e\u9519\u8bef!");
                        }
                    }
                } else if (ca.o == 1) {
                    if (this.i.aw && !this.x) {
                        bt.a(this.i.av);
                    } else if (this.i.aJ && !this.x) {
                        bt.b((int)ao.l(this.i.aq));
                    } else {
                        bn bn2;
                        bn bn3;
                        block63: {
                            n2 = this.c;
                            bn bn4 = null;
                            for (int i2 = 0; i2 < bt.bC.size(); ++i2) {
                                bn4 = (bn)bt.bC.elementAt(i2);
                                if (bn4 == null || bn4.a != n2) continue;
                                bn3 = bn4;
                                break block63;
                            }
                            bn3 = bn2 = null;
                        }
                        if (bn3 != null) {
                            bt.a(bn2);
                        } else {
                            this.j.b("\u88c5\u5907\u4e0d\u5b58\u5728");
                        }
                    }
                    this.i.O.a(0, this.i.k, -1);
                } else if (ca.o == 2) {
                    this.b();
                    this.a();
                    this.d();
                    this.e();
                    this.i.l = 0;
                }
            } else if (n2 == 0x20000000) {
                ca.l = 0;
                this.a();
                this.e();
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
            ca.a(graphics, this.j.aq.a + 5, this.j.aq.b + 32, this.j.aq.c - 11, this.v, 1);
            ca.a(graphics, this.j.aq.a + 5, this.j.aq.b + 32 + this.v + 1, this.j.aq.c - 11, this.w - 2, 1);
        }
        int n4 = this.j.aq.a + t.i.stringWidth("\u88c5\u5907\u5b54") + 10;
        int n5 = this.j.aq.b + 40;
        for (n2 = 0; n2 < this.g.length; ++n2) {
            if (n2 > 0) {
                n4 = this.j.aq.a + this.j.aq.c - 3 * (n3 + 5) - 8;
            }
            int n6 = 17;
            n6 = 17;
            int n7 = n5 + (n2 > 1 ? n3 + 8 : 0);
            int n8 = n4 + 2 + (n2 < 2 ? 0 : (n2 - 2) * (n3 + 5));
            int n9 = n2;
            r r2 = this;
            if (r2.g != null && r2.g.length > n9) {
                r2.g[n9][0] = n8;
                r2.g[n9][1] = n7;
                r2.g[n9][2] = 17;
                r2.g[n9][3] = 17;
            }
            graphics.drawImage(ao.x.a, this.g[n2][0], this.g[n2][1], 20);
        }
        graphics.setColor(255);
        graphics.drawString(this.h[0], this.g[0][0] - 2, this.g[0][1] + (n3 - t.j) / 2, 24);
        graphics.drawString(this.h[1], this.g[1][0] - 2, this.g[1][1] + (n3 - t.j) / 2, 24);
        graphics.drawString(this.h[2], this.g[2][0] - 2, this.g[2][1] + (n3 - t.j) / 2, 24);
        if (this.c != -1 && (bf3 = ao.b(this.k)) != null) {
            graphics.drawImage(bf3.a, this.g[0][0], this.g[0][1], 20);
        }
        if (this.d != -1L && (bf2 = ao.b(this.n)) != null) {
            graphics.drawImage(bf2.a, this.g[1][0], this.g[1][1], 20);
        }
        if (this.p != null && this.p.length > 0) {
            bf bf4 = null;
            for (n3 = 0; n3 < this.p.length; ++n3) {
                bf4 = ao.b(this.p[n3]);
                if (bf4 == null) continue;
                graphics.drawImage(bf4.a, this.g[2 + this.f[n3]][0], this.g[2 + this.f[n3]][1], 20);
            }
        }
        n2 = this.a + (this.b << 1);
        ca.d(graphics, this.g[n2][0], this.g[n2][1], 17, 17);
        if (this.r != null || this.o != null) {
            this.t.a(graphics, this.j.aq.a + 5 + 6, this.j.aq.b + 32 + this.v + 1 + 3, 0);
        }
        if (this.i.l == 0) {
            if (this.u != null || this.u != "") {
                if (this.b == 0 && this.a == 1) {
                    ca.b(graphics, this.u, this.j.aq.c - 10 - ao.x.b - 2 * (ao.x.b + 10) - 6 - t.i.stringWidth("\u88c5\u5907\u5b54"), this.j.aq.b + 32 + 8 + ao.x.c, t.c - 5, 1);
                    return;
                }
                if (this.b == 1) {
                    ca.b(graphics, this.u, this.j.aq.c - (ao.x.b + 10) * 3, this.j.aq.b + 32 + 8 + 10 + (ao.x.c << 1), t.c - 5, 1);
                    return;
                }
                ca.b(graphics, this.u, this.j.aq.a + 5 + 2, this.j.aq.b + 32 + 8 + ao.x.c, t.c - 5, 1);
                return;
            }
        } else if (this.i.l == 1) {
            ca.c(graphics);
        }
    }
}


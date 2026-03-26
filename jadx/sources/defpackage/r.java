package defpackage;

import com.yinhan.kjava.main.a;
import java.io.DataInputStream;
import java.io.IOException;
import javax.microedition.lcdui.Graphics;

/* loaded from: java版梦回西游3区251011.jar:r.class */
public final class r {
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
    private String u;
    public int[][] g;
    private int v;
    private int w;
    private final String[] h = {"装备孔", "附魔符", "幸运材料"};
    private bw t = null;
    private boolean x = false;

    public r(ao aoVar, a aVar, ai aiVar) {
        this.i = aoVar;
        this.j = aVar;
    }

    public final void a(DataInputStream dataInputStream) throws IOException {
        boolean z = this.c > 0;
        this.c = dataInputStream.readInt();
        this.k = dataInputStream.readShort();
        this.l = dataInputStream.readUTF();
        this.d = dataInputStream.readLong();
        this.m = dataInputStream.readUTF();
        this.n = dataInputStream.readShort();
        this.o = dataInputStream.readUTF();
        int i = dataInputStream.readByte();
        if (i > 0) {
            this.e = new int[i];
            this.p = new short[i];
            this.f = new byte[i];
            this.q = new String[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.e[i2] = dataInputStream.readInt();
                this.p[i2] = dataInputStream.readShort();
                this.q[i2] = dataInputStream.readUTF();
                this.f[i2] = dataInputStream.readByte();
            }
        } else {
            this.e = null;
            this.p = null;
            this.f = null;
        }
        this.r = dataInputStream.readUTF();
        this.s = dataInputStream.readUTF();
        bt.N();
        b(this.c);
        b((int) this.d);
        if (this.e != null && this.e.length > 0) {
            for (int i3 = 0; i3 < this.e.length; i3++) {
                b(this.e[i3]);
            }
        }
        if (z) {
            if (this.s == null || this.s.equals("")) {
                this.j.at.a((String) null, t.i, (byte) 1);
            } else {
                this.j.at.a(this.s, t.i, (byte) 1);
            }
        }
        a();
        e();
    }

    private static void b(int i) {
        if (bt.bC == null || bt.bC.size() <= 0) {
            return;
        }
        for (int i2 = 0; i2 < bt.bC.size(); i2++) {
            bn bnVar = (bn) bt.bC.elementAt(i2);
            if (bnVar != null && bnVar.a == i) {
                bnVar.v = (byte) (bnVar.v + 1);
            }
        }
    }

    private void c() {
        if (this.g != null) {
            for (int i = 0; i < this.g.length; i++) {
                if (this.g[i] != null) {
                    this.g[i] = null;
                }
            }
            this.g = null;
        }
    }

    private void d() {
        if (this.s == null || this.s.equals("")) {
            this.j.at.a((String) null, t.i, (byte) 1);
        } else {
            this.j.at.a(this.s, t.i, (byte) 1);
        }
    }

    private String c(int i) {
        if (this.e == null || this.e.length <= 0) {
            return null;
        }
        for (int i2 = 0; i2 < this.f.length; i2++) {
            if (this.f[i2] == i) {
                return this.q[i2];
            }
        }
        return null;
    }

    public final void a() {
        this.u = null;
        if (this.b != 0) {
            if (this.b != 1 || this.q == null || this.q.length <= 0 || c(this.a) == null) {
                return;
            }
            this.u = c(this.a);
            return;
        }
        if (this.a == 0) {
            if (this.l != null) {
                this.u = this.l;
            }
        } else {
            if (this.a != 1 || this.o == null) {
                return;
            }
            this.u = this.m;
        }
    }

    private void e() {
        this.t = null;
        StringBuffer stringBuffer = new StringBuffer();
        if (this.r == null && this.o == null) {
            return;
        }
        stringBuffer.append(this.o == null ? "" : this.o);
        stringBuffer.append("\t");
        stringBuffer.append(this.r == null ? "无幸运加成" : this.r);
        this.t = new bw(stringBuffer.toString(), (short) (t.d - 20));
    }

    private int d(int i) {
        if (this.e == null || this.e.length < 0) {
            return -1;
        }
        for (int i2 = 0; i2 < this.e.length; i2++) {
            if (this.f[i2] == i) {
                return this.e[i2];
            }
        }
        return -1;
    }

    public final void b() {
        this.c = -1;
        this.k = (short) -1;
        this.l = null;
        this.d = -1L;
        this.n = (short) -1;
        this.m = null;
        this.o = null;
        this.e = null;
        this.p = null;
        if (this.q != null) {
            for (int i = 0; i < this.q.length; i++) {
                this.q[i] = null;
            }
        }
        this.q = null;
        this.f = null;
        this.r = null;
        this.s = null;
        this.x = false;
        bt.N();
    }

    public final void a(boolean z) {
        if (z) {
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
        c();
        this.g = new int[5][4];
        this.j.aq.b();
        this.j.aq.a("装备附魔");
        this.j.aq.a(false);
        this.v = Math.max((t.j << 1) + 25, 59);
        this.w = t.j + 26 + 5;
        this.j.aq.a(this.v + this.w);
        d();
        this.j.aq.a(this.j.at);
        this.j.at.a((byte) 1);
        this.j.au.a("确定");
        if (t.c > 220) {
            this.j.aq.a(this.j.au);
        }
        this.j.aq.a(t.f, t.g, t.d, t.e);
        a();
        e();
        ca.l = 0;
        this.i.l = (short) 0;
        this.j.j = this.j.k;
        ao aoVar = this.i;
        this.i.k = (short) 110;
        aoVar.j = (short) 110;
    }

    public final void a(int i) {
        bn bnVar;
        if (this.i.l == 0) {
            if (this.j.aq != null) {
                this.j.aq.b(i);
            }
            if (i == 4 || i == 1) {
                this.b = this.b == 0 ? 1 : 0;
                this.a = this.b == 0 ? 1 : 0;
                ca.l = 0;
                a();
                e();
            } else if (i == 2) {
                if (this.b == 0) {
                    this.a = this.a == 0 ? 1 : 0;
                } else if (this.b == 1) {
                    this.a = this.a == 2 ? 0 : this.a + 1;
                }
                ca.l = 0;
                a();
                e();
            } else if (i == 8) {
                if (this.b == 0) {
                    this.a = this.a == 0 ? 1 : 0;
                } else if (this.b == 1) {
                    this.a = this.a == 0 ? 2 : this.a - 1;
                }
                ca.l = 0;
                a();
                e();
            } else if (i == 268435456 || i == 1073741824) {
                if (this.b == 0) {
                    if (this.a == 0) {
                        if (this.c == -1) {
                            this.x = true;
                            this.i.a((byte) 0, new byte[]{0});
                        } else {
                            ca.a(this.j.aq.a + (t.k * 3) + 29, this.j.aq.b + 49, new String[]{"附魔", "查看", "取出"}, false);
                            this.i.l = (short) 1;
                        }
                    } else if (this.a == 1) {
                        if (this.c == -1) {
                            this.j.b("请先放入需要附魔的装备");
                        } else if (this.d == -1) {
                            this.i.a((byte) 0, new byte[]{3});
                        } else {
                            ca.a((this.j.aq.c - (3 * ao.x.b)) - 21, this.j.aq.b + 49, new String[]{"取出"}, false);
                            this.i.l = (short) 1;
                        }
                    }
                } else if (this.b == 1) {
                    if (d(this.a) != -1) {
                        ca.a(((((this.j.aq.c - 10) - ao.x.b) - ((this.a + (2 * (1 - this.a))) * (ao.x.b + 10))) - (ca.q / 2)) + 9, this.j.aq.b + ao.x.c + 69, new String[]{"取出"}, false);
                        this.i.l = (short) 1;
                    } else if (this.c == -1 || this.d == -1) {
                        this.j.b("请先放入附魔装备与附魔符");
                    } else {
                        this.i.a((byte) 0, new byte[]{4});
                    }
                }
            } else if (i == 536870912) {
                b();
                c();
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
            ca.b(i);
            if (i == 268435456 || i == 1073741824) {
                if (ca.o == 0) {
                    if (this.b == 1) {
                        byte[] bArrA = bz.a((short) 4262, this.c, this.d, (byte) 2, this.e, this.f, d(this.a), (byte) this.a, bt.ad);
                        if (bArrA != null) {
                            a.i.a(new w((short) 4262, bArrA));
                            this.j.a((String) null);
                        } else {
                            this.j.b("获取上传指令数据错误!");
                        }
                    } else {
                        byte[] bArrA2 = null;
                        if (this.a == 0) {
                            bArrA2 = bz.a((short) 4262, this.c, this.d, (byte) 3, this.e, this.f, -1, (byte) -1, bt.ad);
                        } else if (this.a == 1) {
                            bArrA2 = bz.a((short) 4262, this.c, this.d, (byte) 5, this.e, this.f, -1, (byte) -1, bt.ad);
                        }
                        if (bArrA2 != null) {
                            a.i.a(new w((short) 4262, bArrA2));
                            this.j.a((String) null);
                        } else {
                            this.j.b("获取上传指令数据错误!");
                        }
                    }
                } else if (ca.o == 1) {
                    if (this.i.aw && !this.x) {
                        bt.a(this.i.av);
                    } else if (!this.i.aJ || this.x) {
                        int i2 = this.c;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= bt.bC.size()) {
                                bnVar = null;
                                break;
                            }
                            bn bnVar2 = (bn) bt.bC.elementAt(i3);
                            if (bnVar2 != null && bnVar2.a == i2) {
                                bnVar = bnVar2;
                                break;
                            }
                            i3++;
                        }
                        bn bnVar3 = bnVar;
                        if (bnVar != null) {
                            bt.a(bnVar3);
                        } else {
                            this.j.b("装备不存在");
                        }
                    } else {
                        bt.b((int) ao.l(this.i.aq));
                    }
                    this.i.O.a(0, this.i.k, -1);
                } else if (ca.o == 2) {
                    b();
                    a();
                    d();
                    e();
                    this.i.l = (short) 0;
                }
            } else if (i == 536870912) {
                ca.l = 0;
                a();
                e();
                this.i.l = (short) 0;
            }
        }
        this.j.a = 0;
    }

    public final void a(Graphics graphics) {
        bf bfVarB;
        bf bfVarB2;
        short s = ao.x.b;
        if (this.j.aq != null) {
            this.j.aq.a(graphics);
            ca.a(graphics, this.j.aq.a + 5, this.j.aq.b + 32, this.j.aq.c - 11, this.v, 1);
            ca.a(graphics, this.j.aq.a + 5, this.j.aq.b + 32 + this.v + 1, this.j.aq.c - 11, this.w - 2, 1);
        }
        int iStringWidth = this.j.aq.a + t.i.stringWidth("装备孔") + 10;
        int i = this.j.aq.b + 40;
        int i2 = 0;
        while (i2 < this.g.length) {
            if (i2 > 0) {
                iStringWidth = ((this.j.aq.a + this.j.aq.c) - (3 * (s + 5))) - 8;
            }
            int i3 = i2;
            int i4 = iStringWidth + 2 + (i2 < 2 ? 0 : (i2 - 2) * (s + 5));
            int i5 = i + (i2 > 1 ? s + 8 : 0);
            if (this.g != null && this.g.length > i3) {
                this.g[i3][0] = i4;
                this.g[i3][1] = i5;
                this.g[i3][2] = 17;
                this.g[i3][3] = 17;
            }
            graphics.drawImage(ao.x.a, this.g[i2][0], this.g[i2][1], 20);
            i2++;
        }
        graphics.setColor(255);
        graphics.drawString(this.h[0], this.g[0][0] - 2, this.g[0][1] + ((s - t.j) / 2), 24);
        graphics.drawString(this.h[1], this.g[1][0] - 2, this.g[1][1] + ((s - t.j) / 2), 24);
        graphics.drawString(this.h[2], this.g[2][0] - 2, this.g[2][1] + ((s - t.j) / 2), 24);
        if (this.c != -1 && (bfVarB2 = ao.b(this.k)) != null) {
            graphics.drawImage(bfVarB2.a, this.g[0][0], this.g[0][1], 20);
        }
        if (this.d != -1 && (bfVarB = ao.b(this.n)) != null) {
            graphics.drawImage(bfVarB.a, this.g[1][0], this.g[1][1], 20);
        }
        if (this.p != null && this.p.length > 0) {
            for (int i6 = 0; i6 < this.p.length; i6++) {
                bf bfVarB3 = ao.b(this.p[i6]);
                if (bfVarB3 != null) {
                    graphics.drawImage(bfVarB3.a, this.g[2 + this.f[i6]][0], this.g[2 + this.f[i6]][1], 20);
                }
            }
        }
        int i7 = this.a + (this.b << 1);
        ca.d(graphics, this.g[i7][0], this.g[i7][1], 17, 17);
        if (this.r != null || this.o != null) {
            this.t.a(graphics, this.j.aq.a + 5 + 6, this.j.aq.b + 32 + this.v + 1 + 3, 0);
        }
        if (this.i.l != 0) {
            if (this.i.l == 1) {
                ca.c(graphics);
            }
        } else {
            if (this.u == null && this.u == "") {
                return;
            }
            if (this.b == 0 && this.a == 1) {
                ca.b(graphics, this.u, ((((this.j.aq.c - 10) - ao.x.b) - (2 * (ao.x.b + 10))) - 6) - t.i.stringWidth("装备孔"), this.j.aq.b + 32 + 8 + ao.x.c, t.c - 5, 1);
            } else if (this.b == 1) {
                ca.b(graphics, this.u, this.j.aq.c - ((ao.x.b + 10) * 3), this.j.aq.b + 32 + 8 + 10 + (ao.x.c << 1), t.c - 5, 1);
            } else {
                ca.b(graphics, this.u, this.j.aq.a + 5 + 2, this.j.aq.b + 32 + 8 + ao.x.c, t.c - 5, 1);
            }
        }
    }
}

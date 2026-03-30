package defpackage;

import com.yinhan.kjava.main.a;
import java.io.DataInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import javax.microedition.lcdui.Graphics;

/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-8105993946875401281/classes.dex */
public final class k {
    public int a;
    public int b;
    public int c;
    public int d;
    public int[] e;
    public byte[] f;
    public int[][] g;
    private ao i;
    private a j;
    private short k;
    private String l;
    private String m;
    private short n;
    private String o;
    private short[] p;
    private String[] q;
    private String r;
    private String s;
    private String v;
    private int w;
    private int x;
    private final String[] h = {"主材料", "主材料二", "辅助材料"};
    private bw t = null;
    private bw u = null;

    public k(ao aoVar, a aVar, ai aiVar) {
        this.i = aoVar;
        this.j = aVar;
    }

    private void b() {
        if (this.g != null) {
            for (int i = 0; i < this.g.length; i++) {
                if (this.g[i] != null) {
                    this.g[i] = null;
                }
            }
            this.g = null;
        }
    }

    private static void b(int i) {
        if (bt.bC == null || bt.bC.size() <= 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bt.bC.size()) {
                return;
            }
            bn bnVar = (bn) bt.bC.elementAt(i3);
            if (bnVar != null && bnVar.a == i) {
                bnVar.v = (byte) (bnVar.v + 1);
            }
            i2 = i3 + 1;
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

    private void c() {
        if (this.s == null || this.s.equals("")) {
            this.j.at.a((String) null, t.i, (byte) 1);
        } else {
            this.j.at.a(this.s, t.i, (byte) 1);
        }
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

    private void d() {
        this.v = null;
        if (this.b != 0) {
            if (this.b != 1 || this.q == null || this.q.length <= 0 || c(this.a) == null) {
                return;
            }
            this.v = c(this.a);
            return;
        }
        if (this.a == 0) {
            if (this.l != null) {
                this.v = this.l;
            }
        } else {
            if (this.a != 1 || this.o == null) {
                return;
            }
            this.v = this.m;
        }
    }

    private static bn e(int i) {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= bt.bC.size()) {
                return null;
            }
            bn bnVar = (bn) bt.bC.elementAt(i3);
            if (bnVar != null && bnVar.a == i) {
                return bnVar;
            }
            i2 = i3 + 1;
        }
    }

    private void e() {
        this.t = null;
        if (this.o == null || this.o.equals("")) {
            return;
        }
        this.t = new bw(new StringBuffer().append("<0>银两：</0><5></5>").append(this.o).append(this.o.equals("0") ? "" : "万").toString(), (short) (t.d - 20));
    }

    private void f() {
        this.u = null;
        if (this.r != null) {
            this.u = new bw(this.r, (short) (t.d - 20));
        }
    }

    public final void a() {
        this.c = -1;
        this.k = (short) -1;
        this.l = null;
        this.d = -1;
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
        bt.N();
    }

    public final void a(int i) {
        if (this.i.l == 0) {
            if (this.j.aq != null) {
                this.j.aq.b(i);
            }
            if (i == 4 || i == 1) {
                this.b = this.b == 0 ? 1 : 0;
                this.a = this.b != 0 ? 0 : 1;
                ca.l = 0;
                d();
                e();
                f();
            } else if (i == 2) {
                if (this.b == 0) {
                    this.a = this.a != 0 ? 0 : 1;
                } else if (this.b == 1) {
                    this.a = this.a == 2 ? 0 : this.a + 1;
                }
                ca.l = 0;
                d();
                e();
                f();
            } else if (i == 8) {
                if (this.b == 0) {
                    this.a = this.a != 0 ? 0 : 1;
                } else if (this.b == 1) {
                    this.a = this.a != 0 ? this.a - 1 : 2;
                }
                ca.l = 0;
                d();
                e();
                f();
            } else if (i == 268435456 || i == 1073741824) {
                if (this.b == 0) {
                    if (this.a == 0) {
                        if (this.c == -1) {
                            this.i.a((byte) 0, new byte[]{7});
                        } else {
                            ca.a(this.g[this.a][0] + (ao.x.b / 2), this.g[this.a][1] + (ao.x.b / 2), new String[]{"合成", "查看", "取消"}, false);
                            this.i.l = (short) 1;
                        }
                    } else if (this.a == 1) {
                        if (this.c == -1) {
                            this.j.b("请先放入主材料一");
                        } else if (this.d == -1) {
                            this.i.a((byte) 0, new byte[]{7});
                        } else {
                            ca.a(this.g[this.a][0] + (ao.x.b / 2), this.g[this.a][1] + (ao.x.b / 2), new String[]{"取出"}, false);
                            System.out.println(new StringBuffer().append("GameSys.goods.width:").append((int) ao.x.b).toString());
                            this.i.l = (short) 1;
                        }
                    }
                } else if (this.b == 1) {
                    if (d(this.a) != -1) {
                        ca.a(this.g[this.a + 2][0] + (ao.x.b / 2), this.g[this.a + 2][1] + (ao.x.b / 2), new String[]{"取出"}, false);
                        this.i.l = (short) 1;
                    } else if (this.c == -1 || this.d == -1) {
                        this.j.b("请先放满主材料");
                    } else {
                        this.i.a((byte) 0, new byte[]{8});
                    }
                }
            }
            if (i == 536870912) {
                a();
                b();
                this.v = null;
                this.u = null;
                this.i.l();
                this.i.c(5);
            }
        } else if (this.i.l == 1) {
            ca.b(i);
            if (i == 268435456 || i == 1073741824) {
                if (ca.o == 0) {
                    if (this.b == 1) {
                        byte[] bArrA = bz.a((byte) 5, this.c, this.d, this.e, this.f, d(this.a), (byte) this.a, bt.ad);
                        if (bArrA != null) {
                            a.i.a(new w((short) 4266, bArrA));
                            this.j.a((String) null);
                        } else {
                            this.j.b("获取上传指令数据错误!");
                        }
                    } else {
                        byte[] bArrA2 = this.a == 0 ? bz.a((byte) 0, this.c, this.d, this.e, this.f, -1, (byte) -1, bt.ad) : this.a == 1 ? bz.a((byte) 3, this.c, this.d, this.e, this.f, -1, (byte) -1, bt.ad) : null;
                        if (bArrA2 != null) {
                            a.i.a(new w((short) 4266, bArrA2));
                            this.j.a((String) null);
                        } else {
                            this.j.b("获取上传指令数据错误!");
                        }
                    }
                } else if (ca.o == 1) {
                    bt.a(e(this.c));
                    this.i.O.a(0, this.i.k, -1);
                } else if (ca.o == 2) {
                    a();
                    c();
                    d();
                    e();
                    f();
                    this.i.l = (short) 0;
                }
            } else if (i == 536870912) {
                ca.l = 0;
                d();
                e();
                f();
                this.i.l = (short) 0;
            }
        }
        this.j.a = 0;
    }

    public final void a(DataInputStream dataInputStream) throws IOException {
        boolean z = this.c > 0;
        this.c = dataInputStream.readInt();
        this.k = dataInputStream.readShort();
        this.l = dataInputStream.readUTF();
        this.d = dataInputStream.readInt();
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
        b(this.d);
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
        d();
        e();
        f();
    }

    public final void a(Graphics graphics) {
        bf bfVarB;
        bf bfVarB2;
        short s = ao.x.b;
        if (this.j.aq != null) {
            this.j.aq.a(graphics);
            ca.a(graphics, this.j.aq.a + 5, this.j.aq.b + 32, this.j.aq.c - 11, this.w, 1);
            ca.a(graphics, this.j.aq.a + 5, this.j.aq.b + 32 + this.w + 1, this.j.aq.c - 11, this.x - 2, 1);
        }
        int iStringWidth = this.j.aq.a + t.i.stringWidth(this.h[0]) + 10;
        int i = this.j.aq.b + 40;
        if (this.g == null) {
            this.g = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 5, 4);
        }
        int i2 = 0;
        while (i2 < this.g.length) {
            if (i2 > 1) {
                iStringWidth = ((this.j.aq.a + this.j.aq.c) - ((s + 5) * 3)) - 8;
            }
            int i3 = iStringWidth + 2 + (i2 < 2 ? i2 == 0 ? 0 : s + 5 : (i2 - 2) * (s + 5));
            int i4 = (i2 > 1 ? s : (short) 0) + i;
            if (this.g != null && this.g.length > i2) {
                this.g[i2][0] = i3;
                this.g[i2][1] = i4;
                this.g[i2][2] = 17;
                this.g[i2][3] = 17;
            }
            graphics.drawImage(ao.x.a, this.g[i2][0], this.g[i2][1], 20);
            i2++;
        }
        graphics.setColor(255);
        graphics.drawString(this.h[0], this.g[0][0] - 2, this.g[0][1] + ((s - t.j) / 2), 24);
        graphics.drawString(this.h[2], this.g[2][0] - 2, (this.g[2][1] - s) + ((s - t.j) / 2), 20);
        if (this.c != -1 && (bfVarB2 = ao.b(this.k)) != null) {
            graphics.drawImage(bfVarB2.a, this.g[0][0] + 1, this.g[0][1] + 1, 20);
        }
        if (this.d != -1 && (bfVarB = ao.b(this.n)) != null) {
            graphics.drawImage(bfVarB.a, this.g[1][0] + 1, this.g[1][1] + 1, 20);
        }
        if (this.p != null && this.p.length > 0) {
            for (int i5 = 0; i5 < this.p.length; i5++) {
                bf bfVarB3 = ao.b(this.p[i5]);
                if (bfVarB3 != null) {
                    graphics.drawImage(bfVarB3.a, this.g[this.f[i5] + 2][0] + 1, this.g[this.f[i5] + 2][1] + 1, 20);
                }
            }
        }
        int i6 = this.a + (this.b << 1);
        ca.d(graphics, this.g[i6][0], this.g[i6][1], 17, 17);
        if (this.t != null) {
            try {
                this.t.a(graphics, this.j.aq.a + 5 + 6, this.j.aq.b + this.w + 8, 0);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (this.r != null) {
            try {
                this.u.a(graphics, this.j.aq.a + 5 + 6, this.j.aq.b + 32 + this.w + 1 + 3, 0);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        if (this.i.l == 0 && (this.v != null || this.v != "")) {
            if (!(this.b == 0 && this.a == 1) && this.b == 1) {
                ca.b(graphics, this.v, (ao.x.b / 2) + this.g[this.a + 2][0], (ao.x.b / 2) + this.g[this.a + 2][1], t.c - 5, 1);
            } else {
                ca.b(graphics, this.v, (ao.x.b / 2) + this.g[this.a][0], (ao.x.b / 2) + this.g[this.a][1], t.c - 5, 1);
            }
        }
        if (this.i.l == 1) {
            ca.c(graphics);
        }
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
        b();
        this.g = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 5, 4);
        this.j.aq.b();
        this.j.aq.a("物品合成");
        this.j.aq.a(false);
        this.w = (Math.max(t.j, 17) << 1) + 10;
        this.x = t.j + 26 + 5;
        this.j.aq.a(this.w + this.x);
        c();
        this.j.aq.a(this.j.at);
        this.j.at.a((byte) 1);
        this.j.au.a("确定");
        if (t.c > 220) {
            this.j.aq.a(this.j.au);
        }
        this.j.aq.a(t.f, t.g, t.d, t.e);
        d();
        e();
        f();
        ca.l = 0;
        this.i.l = (short) 0;
        this.j.j = this.j.k;
        ao aoVar = this.i;
        this.i.k = (short) 118;
        aoVar.j = (short) 118;
    }
}

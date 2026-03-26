package defpackage;

import com.yinhan.kjava.main.a;
import java.io.DataInputStream;
import java.io.IOException;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* loaded from: java版梦回西游3区251011.jar:cc.class */
public final class cc {
    private ao b;
    private a c;
    private int e;
    private int[][] d = null;
    private bc[] f = null;
    private int g = 0;
    public short a = 0;
    private short h = 0;
    private short i = 0;
    private int j = 0;
    private String[] k = null;
    private String[] l = null;
    private short[] m = null;
    private int[] n = null;
    private String[] o = null;
    private String[] p = null;
    private int[] q = null;
    private byte[] r = null;
    private String[] s = null;
    private byte[] t = null;
    private byte[] u = null;
    private int[] v = null;
    private String[] w = null;
    private String[] x = null;
    private String[] y = null;
    private String[] z = null;
    private String[] A = null;
    private int[] B = null;
    private String C = null;

    public cc(ao aoVar, a aVar) {
        this.b = aoVar;
        this.c = aVar;
    }

    public final void a(short s) {
        if (this.d == null) {
            this.d = new int[4][4];
            this.f = new bc[4];
        }
        if (this.p != null) {
            for (int i = 0; i < this.f.length && i < this.p.length; i++) {
                this.f[i] = a.ab.a(this.s[i], (short) 0, (short) 0, (short) 0);
                if (this.f[i] == null) {
                    a.a(this.t[i], this.u[i], (byte) 0, (byte) 0, this.s[i], (short) 0, (short) 0, (short) 0);
                    this.f[i] = a.ab.a(this.v[i], (short) 0, (short) 0, (short) 0);
                }
            }
        }
        this.b.l = (short) 0;
        this.c.aq.j();
        this.c.aq.a("仙位排位赛");
        this.c.as.a(new String[]{"风云榜", "斗法场", "斗法记录"});
        this.c.as.a = (byte) s;
        this.a = s;
        this.c.aq.a(this.c.as);
        this.c.aq.a(true);
        if (this.a == 0) {
            this.c.at.b("", t.i, (byte) 1);
            this.c.aq.a(this.c.at);
            this.c.au.a(new String[]{"操作", "返回"});
            this.c.aq.a(this.c.au);
            this.c.aq.a(t.f, t.g, t.d, t.e);
            this.e = this.c.at.e;
            int i2 = ((this.c.aq.c - 16) - 2) / 2;
            int i3 = (this.c.at.e - 6) / 2;
            for (int i4 = 0; i4 < this.d.length; i4++) {
                this.d[i4][0] = this.c.at.b + 2 + ((i4 % 2) * (i2 + 2));
                this.d[i4][1] = this.c.at.c + 2 + ((i4 / 2) * (i3 + 2));
                this.d[i4][2] = i2;
                this.d[i4][3] = i3;
            }
        } else if (this.a == 1) {
            this.c.ar.a((Image[]) null, this.w, this.x, this.y);
            this.c.ar.a(this.B);
            this.c.aq.a(this.c.ar);
            this.c.aq.a(t.f, t.g, t.d, t.e);
        } else if (this.a == 2) {
            this.c.at.b(this.C, t.i, (byte) 1);
            this.c.aq.a(this.c.at);
            this.c.au.a(new String[]{"购买次数", "返回"});
            this.c.aq.a(this.c.au);
            this.c.aq.a(t.f, t.g, t.d, t.e);
            this.e = (t.j * 3) + 4;
            this.c.at.a(this.c.at.b, this.c.at.c, this.c.at.d, (this.c.at.e - this.e) - 2);
            ao.K = new bw(new StringBuffer().append("当前排名：").append(this.h <= 0 ? "无" : new StringBuffer().append("第").append((int) this.h).append("名").toString()).append("\t剩余挑战：").append((int) this.i).append("次\t当前积分：").append(this.j).toString(), (short) (this.c.at.d - 20));
        }
        this.c.j = this.c.k;
        ao aoVar = this.b;
        this.b.k = (short) 130;
        aoVar.j = (short) 130;
    }

    public final void a(int i) throws IOException {
        if (this.b.l == 0) {
            if (this.c.aq != null) {
                this.c.aq.b(i);
            }
            if (i == 536870912) {
                this.b.N();
                a();
                return;
            }
            if (i == 8 || i == 2 || i == 516 || i == 518) {
                a(this.c.as.a);
                return;
            }
            if (i == 1 || i == 514) {
                this.g--;
                this.g = this.g < 0 ? 3 : this.g;
                return;
            }
            if (i == 4 || i == 520) {
                this.g++;
                this.g %= 4;
                return;
            }
            if (this.a == 0) {
                for (int i2 = 0; i2 < this.f.length; i2++) {
                    ai.a(this.f[i2], this.c.ak);
                }
                if ((i == 1073741824 || i == 517 || i == 268435456) && this.g >= 0 && this.g <= 3 && this.p != null && this.g < this.p.length) {
                    ca.a(this.d[this.g][0] + 30, this.d[this.g][1] + 20, new String[]{"属性", "装备"}, false);
                    this.b.l = (short) 1;
                    return;
                }
                return;
            }
            if (this.a == 1) {
                if ((i == 268435456 || i == 1073741824 || i == 517) && this.c.ar.g() > 0) {
                    ca.a(t.d / 3, this.c.ar.b() + 40, new String[]{"挑战", "属性", "装备"}, false);
                    this.b.l = (short) 1;
                    return;
                }
                return;
            }
            if (this.a == 2) {
                if (i == 268435456 || i == 1073741824 || i == 517) {
                    this.a = this.c.as.a;
                    byte[] bArrD = bz.d((short) 4690, (byte) 2, "");
                    if (bArrD == null) {
                        this.c.b("获取上传指令数据错误!");
                        return;
                    } else {
                        a.i.a(new w((short) 4690, bArrD));
                        this.c.a((String) null);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (this.b.l == 1) {
            ca.b(i);
            if (i != 268435456 && i != 1073741824 && i != 517) {
                if (i == 536870912) {
                    this.b.l = (short) 0;
                    return;
                }
                return;
            }
            this.a = this.c.as.a;
            if (ca.o == 0 && this.a == 1) {
                ca.h = 0;
                this.b.l = (short) 2;
                return;
            }
            if ((ca.o == 1 && this.a == 1) || (ca.o == 0 && this.a == 0)) {
                this.a = this.c.as.a;
                byte[] bArrA = bz.a((short) 4110, bt.ad, this.a == 0 ? this.p[this.g] : this.A[this.c.ar.g() - 1], (byte) 0);
                if (bArrA == null) {
                    this.c.b("获取上传指令数据错误!");
                    return;
                } else {
                    a.i.a(new w((short) 4110, bArrA));
                    this.c.a((String) null);
                    return;
                }
            }
            this.a = this.c.as.a;
            byte[] bArrB = bz.b((short) 4111, bt.ad, this.a == 0 ? this.p[this.g] : this.A[this.c.ar.g() - 1]);
            if (bArrB == null) {
                this.c.b("获取上传指令数据错误!");
                return;
            } else {
                a.i.a(new w((short) 4111, bArrB));
                this.c.a((String) null);
                return;
            }
        }
        if (this.b.l == 2) {
            if (i != 268435456 && i != 1073741824 && i != 517) {
                if (i == 536870912) {
                    this.b.l = (short) 1;
                    return;
                }
                return;
            } else {
                byte[] bArrD2 = bz.d((short) 4690, (byte) 1, this.a == 0 ? this.o[this.g] : this.z[this.c.ar.g() - 1]);
                if (bArrD2 == null) {
                    this.c.b("获取上传指令数据错误!");
                    return;
                } else {
                    a.i.a(new w((short) 4690, bArrD2));
                    this.c.a((String) null);
                    return;
                }
            }
        }
        if (this.b.l == 3) {
            this.b.T.b(i);
            if (i == 536870912) {
                this.b.T.j();
                this.b.l = (short) 1;
                return;
            }
            return;
        }
        if (this.b.l == 4) {
            this.b.a(bt.cJ);
            this.b.g(i);
            if (i == 536870912) {
                if (this.b.m != 0) {
                    if (this.b.m == 1) {
                        this.b.m = (short) 0;
                    }
                } else {
                    if (bt.cJ != null) {
                        bt.o();
                    }
                    this.b.T.j();
                    this.b.l = (short) 1;
                }
            }
        }
    }

    public final void a(Graphics graphics) {
        if (this.c.aq != null) {
            if (this.b.l == 4) {
                this.b.a(graphics, "", ao.q);
                return;
            }
            this.c.aq.a(graphics);
            if (this.a == 0) {
                int i = 0;
                while (i < this.d.length) {
                    ca.a(graphics, (Image) null, this.d[i][0], this.d[i][1], this.d[i][2], this.d[i][3], i == this.g);
                    if (this.p != null && i < this.p.length) {
                        graphics.setColor(65535);
                        graphics.drawString(this.l[i], this.d[i][0] + ((this.d[i][2] - t.i.stringWidth(this.l[i])) / 2), this.d[i][1] + 4, 20);
                        graphics.setColor(16777215);
                        graphics.drawString(this.k[i], this.d[i][0] + ((this.d[i][2] - t.i.stringWidth(this.k[i])) / 2), ((this.d[i][1] + this.d[i][3]) - t.j) - 4, 20);
                        a.f.a(graphics, this.f[i], (int[]) null, 0, 0, this.d[i][0] + (this.d[i][2] / 2), this.d[i][1] + ((this.d[i][3] / 4) * 3), 20, 0);
                    }
                    i++;
                }
            } else if (this.a != 1 && this.a == 2) {
                ca.a(graphics, this.c.at.b, this.c.at.c + this.c.at.e + 1, this.c.at.d, this.e + 1, 1);
                ao.K.a(graphics, this.c.at.b + 10, this.c.at.c + this.c.at.e + 4, 0);
            }
            if (this.b.l == 1) {
                ca.c(graphics);
            } else if (this.b.l == 2) {
                ca.a(graphics, "确定挑战该玩家?", new String[]{"确定", "取消"});
            } else if (this.b.l == 3) {
                this.b.T.a(graphics);
            }
        }
    }

    public final int a(int i, int i2, int i3) {
        if (this.a == 0 && this.p != null) {
            for (int i4 = 0; i4 < this.d.length && i4 < this.p.length; i4++) {
                if (i2 >= this.d[i4][0] && i2 <= this.d[i4][0] + this.d[i4][2] && i3 >= this.d[i4][1] && i3 <= this.d[i4][1] + this.d[i4][3]) {
                    if (this.g == i4) {
                        return 1073741824;
                    }
                    this.g = (byte) i4;
                }
            }
        }
        return i;
    }

    public final void a(DataInputStream dataInputStream) throws IOException {
        this.h = dataInputStream.readShort();
        this.i = dataInputStream.readShort();
        this.j = dataInputStream.readInt();
        int i = dataInputStream.readShort();
        if (i > 0) {
            this.k = new String[i];
            this.l = new String[i];
            this.m = new short[i];
            this.n = new int[i];
            this.o = new String[i];
            this.p = new String[i];
            this.q = new int[i];
            this.r = new byte[i];
            this.s = new String[i];
            this.t = new byte[i];
            this.u = new byte[i];
            this.v = new int[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.k[i2] = new StringBuffer().append("第").append((int) dataInputStream.readShort()).append("名").toString();
                this.l[i2] = dataInputStream.readUTF();
                this.m[i2] = dataInputStream.readShort();
                this.n[i2] = dataInputStream.readInt();
                this.o[i2] = dataInputStream.readUTF();
                this.p[i2] = dataInputStream.readUTF();
                this.q[i2] = ca.a(dataInputStream.readInt());
                this.r[i2] = dataInputStream.readByte();
                this.s[i2] = dataInputStream.readUTF();
                this.t[i2] = dataInputStream.readByte();
                this.u[i2] = dataInputStream.readByte();
                this.v[i2] = bu.a(a.a(this.t[i2], this.u[i2], (byte) 0, (byte) 0, false, this.s[i2]), (byte) 2);
            }
        } else {
            this.k = null;
            this.l = null;
            this.m = null;
            this.n = null;
            this.o = null;
            this.p = null;
            this.q = null;
            this.r = null;
            this.s = null;
            this.t = null;
            this.u = null;
            this.v = null;
        }
        int i3 = dataInputStream.readShort();
        if (i3 > 0) {
            this.w = new String[i3 + 1];
            this.x = new String[i3 + 1];
            this.y = new String[i3 + 1];
            this.z = new String[i3];
            this.A = new String[i3];
            this.B = new int[i3 + 1];
            this.w[0] = "排行";
            this.x[0] = "昵称";
            this.y[0] = "战力";
            this.B[0] = ca.a(0);
            for (int i4 = 0; i4 < i3; i4++) {
                this.w[i4 + 1] = new StringBuffer().append((int) dataInputStream.readShort()).append("").toString();
                this.x[i4 + 1] = new StringBuffer().append(dataInputStream.readUTF()).append("(").append((int) dataInputStream.readShort()).append("级)").toString();
                this.y[i4 + 1] = new StringBuffer().append(dataInputStream.readInt()).append("").toString();
                this.z[i4] = dataInputStream.readUTF();
                this.A[i4] = dataInputStream.readUTF();
                this.B[i4 + 1] = ca.a(dataInputStream.readInt() == 0 ? 15 : 5);
            }
        } else {
            this.w = null;
            this.x = null;
            this.y = null;
            this.z = null;
            this.A = null;
        }
        this.C = dataInputStream.readUTF();
    }

    public final void b(DataInputStream dataInputStream) {
        this.i = dataInputStream.readShort();
    }

    public final void a() {
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = null;
        this.B = null;
        if (this.d != null) {
            for (int i = 0; i < this.d.length; i++) {
                this.d[i] = null;
            }
        }
        this.d = null;
        if (this.f != null) {
            for (int i2 = 0; i2 < this.f.length; i2++) {
                this.f[i2] = null;
            }
        }
        this.f = null;
    }
}

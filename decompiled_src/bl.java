/*
 * Decompiled with CFR 0.152.
 */
import com.yinhan.kjava.main.a;
import java.io.DataInputStream;

public final class bl
extends ar {
    public String a = "";
    public String b;
    private int w;
    public byte c;
    public byte n;
    public byte o;
    private String x;
    private short y;
    private short z;
    private short A;
    public byte p;
    public short q;
    public short r;
    public short s;
    public short t;
    private boolean B = false;
    private int[] C = new int[4];
    private int[] D = new int[4];
    public byte u;
    public byte v;

    public final void a(DataInputStream object) {
        this.a = ((DataInputStream)object).readUTF();
        this.e = ((DataInputStream)object).readUTF();
        this.b = ((DataInputStream)object).readUTF();
        this.w = ca.a(((DataInputStream)object).readByte());
        ((DataInputStream)object).readShort();
        this.c = ((DataInputStream)object).readByte();
        this.n = ((DataInputStream)object).readByte();
        this.l = this.j = ((DataInputStream)object).readShort();
        this.m = this.k = ((DataInputStream)object).readShort();
        this.p = ((DataInputStream)object).readByte();
        this.q = ((DataInputStream)object).readShort();
        this.o = ((DataInputStream)object).readByte();
        this.x = ((DataInputStream)object).readUTF();
        if (this.q > 0) {
            this.r = ((DataInputStream)object).readShort();
            this.s = ((DataInputStream)object).readShort();
            this.t = ((DataInputStream)object).readShort();
        }
        if (!this.x.equals("")) {
            this.y = ((DataInputStream)object).readShort();
            this.z = ((DataInputStream)object).readShort();
            this.A = ((DataInputStream)object).readShort();
        }
        object = this;
        ((bl)object).C[1] = bu.a(com.yinhan.kjava.main.a.a(((bl)object).c, ((bl)object).n, (byte)1, ((bl)object).o, false, ((bl)object).x), (byte)2);
        ((bl)object).D[1] = bu.a(com.yinhan.kjava.main.a.a(((bl)object).c, ((bl)object).n, (byte)1, ((bl)object).o, true, ((bl)object).x), (byte)2);
        ((bl)object).C[3] = bu.a(com.yinhan.kjava.main.a.a(((bl)object).c, ((bl)object).n, (byte)3, ((bl)object).o, false, ((bl)object).x), (byte)2);
        ((bl)object).D[3] = bu.a(com.yinhan.kjava.main.a.a(((bl)object).c, ((bl)object).n, (byte)3, ((bl)object).o, true, ((bl)object).x), (byte)2);
        ((bl)object).C[0] = bu.a(com.yinhan.kjava.main.a.a(((bl)object).c, ((bl)object).n, (byte)0, ((bl)object).o, false, ((bl)object).x), (byte)2);
        ((bl)object).D[0] = bu.a(com.yinhan.kjava.main.a.a(((bl)object).c, ((bl)object).n, (byte)0, ((bl)object).o, true, ((bl)object).x), (byte)2);
        ((bl)object).C[2] = bu.a(com.yinhan.kjava.main.a.a(((bl)object).c, ((bl)object).n, (byte)2, ((bl)object).o, false, ((bl)object).x), (byte)2);
        ((bl)object).D[2] = bu.a(com.yinhan.kjava.main.a.a(((bl)object).c, ((bl)object).n, (byte)2, ((bl)object).o, true, ((bl)object).x), (byte)2);
        this.a(true);
    }

    private void a(boolean bl2) {
        this.g = !this.x.equals("") ? com.yinhan.kjava.main.a.ab.a(bl2 ? this.D[this.h] : this.C[this.h], this.y, this.z, this.A) : com.yinhan.kjava.main.a.ab.c(bl2 ? this.D[this.h] : this.C[this.h]);
        if (this.g == null && !this.B) {
            if (!this.x.equals("")) {
                ao.a(this.c, this.n, this.o, this.x, this.y, this.z, this.A);
            } else {
                ao.a(this.c, this.n, this.o, "", (short)0, (short)0, (short)0);
            }
            this.g = !this.x.equals("") ? com.yinhan.kjava.main.a.ab.a(bl2 ? this.D[this.h] : this.C[this.h], this.y, this.z, this.A) : com.yinhan.kjava.main.a.ab.c(bl2 ? this.D[this.h] : this.C[this.h]);
            this.B = true;
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void a(aw var1_1, ai var2_2, long var3_3) {
        try {
            block9: {
                block11: {
                    block10: {
                        if (this.g == null) break block9;
                        if (this.f == null || this.f.size() <= 3) break block10;
                        var7_6 = var5_4 = (short[])this.f.elementAt(this.f.size() - 1);
                        var6_7 = this;
                        if (var6_7.i == null) ** GOTO lbl-1000
                        if (var6_7.i[0] == var7_6[0]) {
                            var6_7.h = var7_6[1] > var6_7.i[1] ? (byte)3 : 1;
                            var6_7.i = var7_6;
                            v0 = var6_7.h;
                        } else if (var6_7.i[1] == var7_6[1]) {
                            var6_7.h = var7_6[0] > var6_7.i[0] ? (byte)2 : 0;
                            var6_7.i = var7_6;
                            v0 = var6_7.h;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var6_7.i = var7_6;
                            v0 = var6_8 = -1;
                        }
                        if (v0 != -1) {
                            this.a(false);
                            this.j = var5_4[0];
                            this.k = var5_4[1];
                            this.r();
                            this.f.removeElementAt(this.f.size() - 1);
                        } else {
                            this.a(false);
                        }
                        ai.a(this.g, var3_3);
                        break block11;
                    }
                    this.a(true);
                    ai.a(this.g, var3_3);
                }
                if (this.d != null) {
                    this.d.a(var1_1, var2_2, var3_3);
                }
            }
            return;
        }
        catch (Exception v1) {
            var5_5 = v1;
            v1.printStackTrace();
            return;
        }
    }

    public final int a(byte by2, byte by3) {
        if (bt.bw >= 1) {
            if (by2 == 2 || by2 == 3) {
                return 0xFF0000;
            }
            if (by3 >= 0) {
                return 65280;
            }
            if (this.b != null && !this.b.equals("")) {
                return this.w;
            }
            if (by2 == 0) {
                return 0xFFFFFF;
            }
            if (by2 == 1) {
                return 0xFFFF00;
            }
        }
        if (by3 >= 0) {
            return 65280;
        }
        if (this.b != null && !this.b.equals("")) {
            return this.w;
        }
        return 0xFFFF00;
    }
}


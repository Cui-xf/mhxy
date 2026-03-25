/*
 * Decompiled with CFR 0.152.
 */
import com.yinhan.kjava.main.a;
import java.io.DataInputStream;

public final class bp
extends ar {
    public byte a;
    public String b = "";
    public String c;
    public int n;
    public short o;
    public byte p;
    public byte q;
    public byte r;
    public byte s;
    public short t;
    public short u;
    private String v = "";
    private short w = 0;
    private short x = 0;
    private short y = 0;
    private int[] z = new int[4];
    private int[] A = new int[4];

    public final void a(ao ao2, DataInputStream dataInputStream) {
        dataInputStream.readByte();
        this.b = dataInputStream.readUTF();
        this.e = dataInputStream.readUTF();
        this.c = dataInputStream.readUTF();
        this.n = ca.a(dataInputStream.readByte());
        this.o = dataInputStream.readShort();
        this.p = dataInputStream.readByte();
        this.q = dataInputStream.readByte();
        this.s = dataInputStream.readByte();
        this.r = dataInputStream.readByte();
        this.t = dataInputStream.readShort();
        this.u = dataInputStream.readShort();
        this.v = dataInputStream.readUTF();
        if (!this.v.equals("")) {
            this.w = dataInputStream.readShort();
            this.x = dataInputStream.readShort();
            this.y = dataInputStream.readShort();
        }
        if (this.b.equals(bt.ad)) {
            bt.bs = this.s;
        }
        this.l = ao2.I.j;
        this.m = ao2.I.k;
        this.j = ao2.I.j;
        this.k = ao2.I.k;
        this.a();
        this.a(true);
    }

    private void a() {
        this.z[1] = bu.a(com.yinhan.kjava.main.a.a(this.q, this.p, (byte)1, this.r, false, this.v), (byte)2);
        this.A[1] = bu.a(com.yinhan.kjava.main.a.a(this.q, this.p, (byte)1, this.r, true, this.v), (byte)2);
        this.z[3] = bu.a(com.yinhan.kjava.main.a.a(this.q, this.p, (byte)3, this.r, false, this.v), (byte)2);
        this.A[3] = bu.a(com.yinhan.kjava.main.a.a(this.q, this.p, (byte)3, this.r, true, this.v), (byte)2);
        this.z[0] = bu.a(com.yinhan.kjava.main.a.a(this.q, this.p, (byte)0, this.r, false, this.v), (byte)2);
        this.A[0] = bu.a(com.yinhan.kjava.main.a.a(this.q, this.p, (byte)0, this.r, true, this.v), (byte)2);
        this.z[2] = bu.a(com.yinhan.kjava.main.a.a(this.q, this.p, (byte)2, this.r, false, this.v), (byte)2);
        this.A[2] = bu.a(com.yinhan.kjava.main.a.a(this.q, this.p, (byte)2, this.r, true, this.v), (byte)2);
    }

    private void a(boolean bl2) {
        this.g = com.yinhan.kjava.main.a.ab.a(bl2 ? this.A[this.h] : this.z[this.h], this.w, this.x, this.y);
        if (this.g == null) {
            com.yinhan.kjava.main.a.a(this.q, this.p, (byte)5, this.r, this.v, this.w, this.x, this.y);
            this.g = com.yinhan.kjava.main.a.ab.a(bl2 ? this.A[this.h] : this.z[this.h], this.w, this.x, this.y);
            if (this.g == null) {
                this.r = 0;
                this.a();
                this.g = com.yinhan.kjava.main.a.ab.c(bl2 ? this.A[this.h] : this.z[this.h]);
                if (this.g == null) {
                    com.yinhan.kjava.main.a.a(this.q, this.p, this.h, this.r, this.v, this.w, this.x, this.y);
                    this.g = com.yinhan.kjava.main.a.ab.c(bl2 ? this.A[this.h] : this.z[this.h]);
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(ai object, long l2) {
        if (this.g == null) return;
        if (bt.bs == 0) {
            if (!this.a(this.a, 0)) {
                this.a(true);
                ai.a(this.g, l2);
                return;
            }
            if (this.f != null && this.f.size() >= 1) {
                object = this;
                int n2 = ((ar)object).f.size();
                if (n2 > 1) {
                    int n3 = ((ar)object).f.size() - 1;
                    if (n3 >= 0) {
                        short[] sArray;
                        short[] sArray2 = n3 - 1 > 0 ? (short[])((ar)object).f.elementAt(n3 - 1) : (short[])((ar)object).f.elementAt(0);
                        if (sArray2[0] != (sArray = (short[])((ar)object).f.elementAt(n3))[0]) {
                            ((ar)object).h = sArray2[0] > sArray[0] ? (byte)2 : (byte)0;
                            super.a(false);
                        } else if (sArray2[1] != sArray[1]) {
                            ((ar)object).h = sArray2[1] > sArray[1] ? (byte)3 : (byte)1;
                            super.a(false);
                        } else {
                            super.a(true);
                        }
                        ((ar)object).j = sArray2[0];
                        ((ar)object).k = sArray2[1];
                        ((ar)object).f.removeElementAt(n3);
                    }
                } else {
                    super.a(true);
                }
                ai.a(this.g, l2);
                return;
            }
            this.a(true);
            ai.a(this.g, l2);
            return;
        }
        if (!this.a(this.a, 1)) {
            this.a(true);
            ai.a(this.g, l2);
            return;
        }
        ai.a(this.g, l2);
        object = this;
        int n4 = ((ar)object).f.size();
        if (n4 < 7) {
            super.a(true);
            return;
        }
        if (0 >= n4) return;
        short[] sArray = (short[])((ar)object).f.elementAt(0);
        short[] sArray3 = 1 < n4 ? (short[])((ar)object).f.elementAt(1) : (short[])((ar)object).f.elementAt(n4 - 1);
        if (sArray3[0] != sArray[0]) {
            ((ar)object).h = sArray3[0] > sArray[0] ? (byte)2 : (byte)0;
            super.a(false);
        } else if (sArray3[1] != sArray[1]) {
            ((ar)object).h = sArray3[1] > sArray[1] ? (byte)3 : (byte)1;
            super.a(false);
        } else {
            super.a(true);
        }
        ((ar)object).j = sArray[0];
        ((ar)object).k = sArray[1];
        ((ar)object).f.removeElementAt(0);
    }

    private boolean a(byte by2, int n2) {
        bp bp2;
        if (this.s == 1) {
            return true;
        }
        if (bt.q != null) {
            for (int i2 = 0; i2 < bt.q.length; ++i2) {
                if (bt.q[i2].s != 1) continue;
                bp2 = bt.q[i2];
                break;
            }
        } else {
            bp2 = this = null;
        }
        return n2 == 0 ? (this.a == 0 ? (by2 == 1 ? this.f.size() <= 0 || Math.abs(bt.q[by2].f.size() - bt.q[0].f.size()) > 7 : by2 == 2 && (bt.q[1].f.size() <= 0 || Math.abs(bt.q[by2].f.size() - bt.q[1].f.size()) > 7)) : (this.a == 1 ? (by2 == 0 ? bt.q[1].f.size() <= 0 || Math.abs(bt.q[by2].f.size() - bt.q[1].f.size()) > 7 : by2 == 2 && (bt.q[0].f.size() <= 0 || Math.abs(bt.q[by2].f.size() - bt.q[0].f.size()) > 7)) : this.a == 2 && (by2 == 0 ? bt.q[2].f.size() <= 0 || Math.abs(bt.q[by2].f.size() - bt.q[2].f.size()) > 7 : by2 == 1 && (bt.q[0].f.size() <= 0 || Math.abs(bt.q[by2].f.size() - bt.q[0].f.size()) > 7)))) : n2 == 1 && (this.a == 0 ? (by2 == 1 ? bt.q[by2].f.size() > 2 : by2 == 2 && (bt.q[1].f.size() <= 2 || Math.abs(bt.q[by2].f.size() - bt.q[1].f.size()) > 5)) : (this.a == 1 ? (by2 == 0 ? bt.q[by2].f.size() > 2 : by2 == 2 && (bt.q[0].f.size() <= 2 || Math.abs(bt.q[by2].f.size() - bt.q[0].f.size()) > 5)) : this.a == 2 && (by2 == 0 ? bt.q[by2].f.size() > 2 : by2 == 1 && (bt.q[0].f.size() <= 2 || Math.abs(bt.q[by2].f.size() - bt.q[0].f.size()) > 5))));
    }
}


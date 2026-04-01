package p000;

import com.yinhan.kjava.main.RunnableC0066a;
import java.io.DataInputStream;
import java.io.IOException;

/* renamed from: bp */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-5080095226433994817/classes.dex */
public final class C0043bp extends AbstractC0018ar {

    /* renamed from: a */
    public byte f745a;

    /* renamed from: c */
    public String f747c;

    /* renamed from: n */
    public int f748n;

    /* renamed from: o */
    public short f749o;

    /* renamed from: p */
    public byte f750p;

    /* renamed from: q */
    public byte f751q;

    /* renamed from: r */
    public byte f752r;

    /* renamed from: s */
    public byte f753s;

    /* renamed from: t */
    public short f754t;

    /* renamed from: u */
    public short f755u;

    /* renamed from: b */
    public String f746b = "";

    /* renamed from: v */
    private String f756v = "";

    /* renamed from: w */
    private short f757w = 0;

    /* renamed from: x */
    private short f758x = 0;

    /* renamed from: y */
    private short f759y = 0;

    /* renamed from: z */
    private int[] f760z = new int[4];

    /* renamed from: A */
    private int[] f744A = new int[4];

    /* renamed from: a */
    private void m700a() {
        this.f760z[1] = C0048bu.m955a(RunnableC0066a.m1391a(this.f751q, this.f750p, (byte) 1, this.f752r, false, this.f756v), (byte) 2);
        this.f744A[1] = C0048bu.m955a(RunnableC0066a.m1391a(this.f751q, this.f750p, (byte) 1, this.f752r, true, this.f756v), (byte) 2);
        this.f760z[3] = C0048bu.m955a(RunnableC0066a.m1391a(this.f751q, this.f750p, (byte) 3, this.f752r, false, this.f756v), (byte) 2);
        this.f744A[3] = C0048bu.m955a(RunnableC0066a.m1391a(this.f751q, this.f750p, (byte) 3, this.f752r, true, this.f756v), (byte) 2);
        this.f760z[0] = C0048bu.m955a(RunnableC0066a.m1391a(this.f751q, this.f750p, (byte) 0, this.f752r, false, this.f756v), (byte) 2);
        this.f744A[0] = C0048bu.m955a(RunnableC0066a.m1391a(this.f751q, this.f750p, (byte) 0, this.f752r, true, this.f756v), (byte) 2);
        this.f760z[2] = C0048bu.m955a(RunnableC0066a.m1391a(this.f751q, this.f750p, (byte) 2, this.f752r, false, this.f756v), (byte) 2);
        this.f744A[2] = C0048bu.m955a(RunnableC0066a.m1391a(this.f751q, this.f750p, (byte) 2, this.f752r, true, this.f756v), (byte) 2);
    }

    /* renamed from: a */
    private void m701a(boolean z) {
        this.f399g = RunnableC0066a.f2096ab.m983a(z ? this.f744A[this.f400h] : this.f760z[this.f400h], this.f757w, this.f758x, this.f759y);
        if (this.f399g == null) {
            RunnableC0066a.m1396a(this.f751q, this.f750p, (byte) 5, this.f752r, this.f756v, this.f757w, this.f758x, this.f759y);
            this.f399g = RunnableC0066a.f2096ab.m983a(z ? this.f744A[this.f400h] : this.f760z[this.f400h], this.f757w, this.f758x, this.f759y);
            if (this.f399g == null) {
                this.f752r = (byte) 0;
                m700a();
                this.f399g = RunnableC0066a.f2096ab.m997c(z ? this.f744A[this.f400h] : this.f760z[this.f400h]);
                if (this.f399g == null) {
                    RunnableC0066a.m1396a(this.f751q, this.f750p, this.f400h, this.f752r, this.f756v, this.f757w, this.f758x, this.f759y);
                    this.f399g = RunnableC0066a.f2096ab.m997c(z ? this.f744A[this.f400h] : this.f760z[this.f400h]);
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m702a(byte b, int i) {
        C0043bp c0043bp;
        if (this.f753s == 1) {
            return true;
        }
        if (C0047bt.f1683q != null) {
            for (int i2 = 0; i2 < C0047bt.f1683q.length; i2++) {
                if (C0047bt.f1683q[i2].f753s == 1) {
                    c0043bp = C0047bt.f1683q[i2];
                    break;
                }
            }
            c0043bp = null;
        } else {
            c0043bp = null;
        }
        if (i == 0) {
            if (c0043bp.f745a == 0) {
                if (b == 1) {
                    return c0043bp.f398f.size() <= 0 || Math.abs(C0047bt.f1683q[b].f398f.size() - C0047bt.f1683q[0].f398f.size()) > 7;
                }
                if (b == 2) {
                    return C0047bt.f1683q[1].f398f.size() <= 0 || Math.abs(C0047bt.f1683q[b].f398f.size() - C0047bt.f1683q[1].f398f.size()) > 7;
                }
                return false;
            }
            if (c0043bp.f745a == 1) {
                if (b == 0) {
                    return C0047bt.f1683q[1].f398f.size() <= 0 || Math.abs(C0047bt.f1683q[b].f398f.size() - C0047bt.f1683q[1].f398f.size()) > 7;
                }
                if (b == 2) {
                    return C0047bt.f1683q[0].f398f.size() <= 0 || Math.abs(C0047bt.f1683q[b].f398f.size() - C0047bt.f1683q[0].f398f.size()) > 7;
                }
                return false;
            }
            if (c0043bp.f745a != 2) {
                return false;
            }
            if (b == 0) {
                return C0047bt.f1683q[2].f398f.size() <= 0 || Math.abs(C0047bt.f1683q[b].f398f.size() - C0047bt.f1683q[2].f398f.size()) > 7;
            }
            if (b == 1) {
                return C0047bt.f1683q[0].f398f.size() <= 0 || Math.abs(C0047bt.f1683q[b].f398f.size() - C0047bt.f1683q[0].f398f.size()) > 7;
            }
            return false;
        }
        if (i != 1) {
            return false;
        }
        if (c0043bp.f745a == 0) {
            if (b == 1) {
                return C0047bt.f1683q[b].f398f.size() > 2;
            }
            if (b == 2) {
                return C0047bt.f1683q[1].f398f.size() <= 2 || Math.abs(C0047bt.f1683q[b].f398f.size() - C0047bt.f1683q[1].f398f.size()) > 5;
            }
            return false;
        }
        if (c0043bp.f745a == 1) {
            if (b == 0) {
                return C0047bt.f1683q[b].f398f.size() > 2;
            }
            if (b == 2) {
                return C0047bt.f1683q[0].f398f.size() <= 2 || Math.abs(C0047bt.f1683q[b].f398f.size() - C0047bt.f1683q[0].f398f.size()) > 5;
            }
            return false;
        }
        if (c0043bp.f745a != 2) {
            return false;
        }
        if (b == 0) {
            return C0047bt.f1683q[b].f398f.size() > 2;
        }
        if (b == 1) {
            return C0047bt.f1683q[0].f398f.size() <= 2 || Math.abs(C0047bt.f1683q[b].f398f.size() - C0047bt.f1683q[0].f398f.size()) > 5;
        }
        return false;
    }

    /* renamed from: a */
    public final void m703a(C0009ai c0009ai, long j) {
        if (this.f399g != null) {
            if (C0047bt.f933bs != 0) {
                if (!m702a(this.f745a, 1)) {
                    m701a(true);
                    C0009ai.m43a(this.f399g, j);
                    return;
                }
                C0009ai.m43a(this.f399g, j);
                int size = this.f398f.size();
                if (size < 7) {
                    m701a(true);
                    return;
                }
                if (size > 0) {
                    short[] sArr = (short[]) this.f398f.elementAt(0);
                    short[] sArr2 = 1 < size ? (short[]) this.f398f.elementAt(1) : (short[]) this.f398f.elementAt(size - 1);
                    if (sArr2[0] != sArr[0]) {
                        if (sArr2[0] > sArr[0]) {
                            this.f400h = (byte) 2;
                        } else {
                            this.f400h = (byte) 0;
                        }
                        m701a(false);
                    } else if (sArr2[1] != sArr[1]) {
                        if (sArr2[1] > sArr[1]) {
                            this.f400h = (byte) 3;
                        } else {
                            this.f400h = (byte) 1;
                        }
                        m701a(false);
                    } else {
                        m701a(true);
                    }
                    this.f402j = sArr[0];
                    this.f403k = sArr[1];
                    this.f398f.removeElementAt(0);
                    return;
                }
                return;
            }
            if (!m702a(this.f745a, 0)) {
                m701a(true);
                C0009ai.m43a(this.f399g, j);
                return;
            }
            if (this.f398f == null || this.f398f.size() < 1) {
                m701a(true);
                C0009ai.m43a(this.f399g, j);
                return;
            }
            if (this.f398f.size() > 1) {
                int size2 = this.f398f.size() - 1;
                if (size2 >= 0) {
                    short[] sArr3 = (short[]) this.f398f.elementAt(size2);
                    short[] sArr4 = size2 + (-1) > 0 ? (short[]) this.f398f.elementAt(size2 - 1) : (short[]) this.f398f.elementAt(0);
                    if (sArr4[0] != sArr3[0]) {
                        if (sArr4[0] > sArr3[0]) {
                            this.f400h = (byte) 2;
                        } else {
                            this.f400h = (byte) 0;
                        }
                        m701a(false);
                    } else if (sArr4[1] != sArr3[1]) {
                        if (sArr4[1] > sArr3[1]) {
                            this.f400h = (byte) 3;
                        } else {
                            this.f400h = (byte) 1;
                        }
                        m701a(false);
                    } else {
                        m701a(true);
                    }
                    this.f402j = sArr4[0];
                    this.f403k = sArr4[1];
                    this.f398f.removeElementAt(size2);
                }
            } else {
                m701a(true);
            }
            C0009ai.m43a(this.f399g, j);
        }
    }

    /* renamed from: a */
    public final void m704a(C0015ao c0015ao, DataInputStream dataInputStream) throws IOException {
        dataInputStream.readByte();
        this.f746b = dataInputStream.readUTF();
        this.f397e = dataInputStream.readUTF();
        this.f747c = dataInputStream.readUTF();
        this.f748n = C0055ca.m1278a(dataInputStream.readByte());
        this.f749o = dataInputStream.readShort();
        this.f750p = dataInputStream.readByte();
        this.f751q = dataInputStream.readByte();
        this.f753s = dataInputStream.readByte();
        this.f752r = dataInputStream.readByte();
        this.f754t = dataInputStream.readShort();
        this.f755u = dataInputStream.readShort();
        this.f756v = dataInputStream.readUTF();
        if (!this.f756v.equals("")) {
            this.f757w = dataInputStream.readShort();
            this.f758x = dataInputStream.readShort();
            this.f759y = dataInputStream.readShort();
        }
        if (this.f746b.equals(C0047bt.f865ad)) {
            C0047bt.f933bs = this.f753s;
        }
        this.f404l = c0015ao.f181I.f402j;
        this.f405m = c0015ao.f181I.f403k;
        this.f402j = c0015ao.f181I.f402j;
        this.f403k = c0015ao.f181I.f403k;
        m700a();
        m701a(true);
    }
}

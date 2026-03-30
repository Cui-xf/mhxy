package defpackage;

import com.yinhan.kjava.main.a;
import java.io.DataInputStream;
import java.io.IOException;

/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-8105993946875401281/classes.dex */
public final class bp extends ar {
    public byte a;
    public String c;
    public int n;
    public short o;
    public byte p;
    public byte q;
    public byte r;
    public byte s;
    public short t;
    public short u;
    public String b = "";
    private String v = "";
    private short w = 0;
    private short x = 0;
    private short y = 0;
    private int[] z = new int[4];
    private int[] A = new int[4];

    private void a() {
        this.z[1] = bu.a(a.a(this.q, this.p, (byte) 1, this.r, false, this.v), (byte) 2);
        this.A[1] = bu.a(a.a(this.q, this.p, (byte) 1, this.r, true, this.v), (byte) 2);
        this.z[3] = bu.a(a.a(this.q, this.p, (byte) 3, this.r, false, this.v), (byte) 2);
        this.A[3] = bu.a(a.a(this.q, this.p, (byte) 3, this.r, true, this.v), (byte) 2);
        this.z[0] = bu.a(a.a(this.q, this.p, (byte) 0, this.r, false, this.v), (byte) 2);
        this.A[0] = bu.a(a.a(this.q, this.p, (byte) 0, this.r, true, this.v), (byte) 2);
        this.z[2] = bu.a(a.a(this.q, this.p, (byte) 2, this.r, false, this.v), (byte) 2);
        this.A[2] = bu.a(a.a(this.q, this.p, (byte) 2, this.r, true, this.v), (byte) 2);
    }

    private void a(boolean z) {
        this.g = a.ab.a(z ? this.A[this.h] : this.z[this.h], this.w, this.x, this.y);
        if (this.g == null) {
            a.a(this.q, this.p, (byte) 5, this.r, this.v, this.w, this.x, this.y);
            this.g = a.ab.a(z ? this.A[this.h] : this.z[this.h], this.w, this.x, this.y);
            if (this.g == null) {
                this.r = (byte) 0;
                a();
                this.g = a.ab.c(z ? this.A[this.h] : this.z[this.h]);
                if (this.g == null) {
                    a.a(this.q, this.p, this.h, this.r, this.v, this.w, this.x, this.y);
                    this.g = a.ab.c(z ? this.A[this.h] : this.z[this.h]);
                }
            }
        }
    }

    private boolean a(byte b, int i) {
        bp bpVar;
        if (this.s == 1) {
            return true;
        }
        if (bt.q != null) {
            for (int i2 = 0; i2 < bt.q.length; i2++) {
                if (bt.q[i2].s == 1) {
                    bpVar = bt.q[i2];
                    break;
                }
            }
            bpVar = null;
        } else {
            bpVar = null;
        }
        if (i == 0) {
            if (bpVar.a == 0) {
                if (b == 1) {
                    return bpVar.f.size() <= 0 || Math.abs(bt.q[b].f.size() - bt.q[0].f.size()) > 7;
                }
                if (b == 2) {
                    return bt.q[1].f.size() <= 0 || Math.abs(bt.q[b].f.size() - bt.q[1].f.size()) > 7;
                }
                return false;
            }
            if (bpVar.a == 1) {
                if (b == 0) {
                    return bt.q[1].f.size() <= 0 || Math.abs(bt.q[b].f.size() - bt.q[1].f.size()) > 7;
                }
                if (b == 2) {
                    return bt.q[0].f.size() <= 0 || Math.abs(bt.q[b].f.size() - bt.q[0].f.size()) > 7;
                }
                return false;
            }
            if (bpVar.a != 2) {
                return false;
            }
            if (b == 0) {
                return bt.q[2].f.size() <= 0 || Math.abs(bt.q[b].f.size() - bt.q[2].f.size()) > 7;
            }
            if (b == 1) {
                return bt.q[0].f.size() <= 0 || Math.abs(bt.q[b].f.size() - bt.q[0].f.size()) > 7;
            }
            return false;
        }
        if (i != 1) {
            return false;
        }
        if (bpVar.a == 0) {
            if (b == 1) {
                return bt.q[b].f.size() > 2;
            }
            if (b == 2) {
                return bt.q[1].f.size() <= 2 || Math.abs(bt.q[b].f.size() - bt.q[1].f.size()) > 5;
            }
            return false;
        }
        if (bpVar.a == 1) {
            if (b == 0) {
                return bt.q[b].f.size() > 2;
            }
            if (b == 2) {
                return bt.q[0].f.size() <= 2 || Math.abs(bt.q[b].f.size() - bt.q[0].f.size()) > 5;
            }
            return false;
        }
        if (bpVar.a != 2) {
            return false;
        }
        if (b == 0) {
            return bt.q[b].f.size() > 2;
        }
        if (b == 1) {
            return bt.q[0].f.size() <= 2 || Math.abs(bt.q[b].f.size() - bt.q[0].f.size()) > 5;
        }
        return false;
    }

    public final void a(ai aiVar, long j) {
        if (this.g != null) {
            if (bt.bs != 0) {
                if (!a(this.a, 1)) {
                    a(true);
                    ai.a(this.g, j);
                    return;
                }
                ai.a(this.g, j);
                int size = this.f.size();
                if (size < 7) {
                    a(true);
                    return;
                }
                if (size > 0) {
                    short[] sArr = (short[]) this.f.elementAt(0);
                    short[] sArr2 = 1 < size ? (short[]) this.f.elementAt(1) : (short[]) this.f.elementAt(size - 1);
                    if (sArr2[0] != sArr[0]) {
                        if (sArr2[0] > sArr[0]) {
                            this.h = (byte) 2;
                        } else {
                            this.h = (byte) 0;
                        }
                        a(false);
                    } else if (sArr2[1] != sArr[1]) {
                        if (sArr2[1] > sArr[1]) {
                            this.h = (byte) 3;
                        } else {
                            this.h = (byte) 1;
                        }
                        a(false);
                    } else {
                        a(true);
                    }
                    this.j = sArr[0];
                    this.k = sArr[1];
                    this.f.removeElementAt(0);
                    return;
                }
                return;
            }
            if (!a(this.a, 0)) {
                a(true);
                ai.a(this.g, j);
                return;
            }
            if (this.f == null || this.f.size() < 1) {
                a(true);
                ai.a(this.g, j);
                return;
            }
            if (this.f.size() > 1) {
                int size2 = this.f.size() - 1;
                if (size2 >= 0) {
                    short[] sArr3 = (short[]) this.f.elementAt(size2);
                    short[] sArr4 = size2 + (-1) > 0 ? (short[]) this.f.elementAt(size2 - 1) : (short[]) this.f.elementAt(0);
                    if (sArr4[0] != sArr3[0]) {
                        if (sArr4[0] > sArr3[0]) {
                            this.h = (byte) 2;
                        } else {
                            this.h = (byte) 0;
                        }
                        a(false);
                    } else if (sArr4[1] != sArr3[1]) {
                        if (sArr4[1] > sArr3[1]) {
                            this.h = (byte) 3;
                        } else {
                            this.h = (byte) 1;
                        }
                        a(false);
                    } else {
                        a(true);
                    }
                    this.j = sArr4[0];
                    this.k = sArr4[1];
                    this.f.removeElementAt(size2);
                }
            } else {
                a(true);
            }
            ai.a(this.g, j);
        }
    }

    public final void a(ao aoVar, DataInputStream dataInputStream) throws IOException {
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
        this.l = aoVar.I.j;
        this.m = aoVar.I.k;
        this.j = aoVar.I.j;
        this.k = aoVar.I.k;
        a();
        a(true);
    }
}

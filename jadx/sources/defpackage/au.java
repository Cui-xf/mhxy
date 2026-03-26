package defpackage;

import com.yinhan.kjava.main.a;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

/* loaded from: java版梦回西游3区251011.jar:au.class */
public class au {
    public Vector e = new Vector();
    public bc f;
    public short g;
    public short h;
    public short i;
    public byte j;
    private short a;
    private short b;
    private short c;
    private int[] d;
    private short[] k;

    public au(short s, short s2, short s3, short s4) {
        this.g = s == 0 ? (short) 701 : s;
        this.a = s2;
        this.b = s3;
        this.c = s4;
        f();
        a((byte) 3);
    }

    public au(byte b, short s, short s2, short s3, short s4) {
        this.g = s;
        this.a = s2;
        this.b = s3;
        this.c = s4;
        f();
        a((byte) 3);
    }

    private void f() {
        if (this.g == 701) {
            this.d = new int[1];
            this.d[0] = bu.a(new StringBuffer().append((int) this.g).append("_").append(0).toString(), (byte) 2);
            return;
        }
        this.d = new int[4];
        for (int i = 0; i < 4; i++) {
            this.d[i] = bu.a(new StringBuffer().append((int) this.g).append("_").append((i / 2) << 1).toString(), (byte) 2);
        }
    }

    public final short a() {
        switch (this.j) {
            case 1:
                if (this.f == null) {
                    return (short) 0;
                }
                return (short) (this.i + this.f.h());
            case 3:
                return (short) (this.i + 8);
            default:
                return (short) (this.i + 16);
        }
    }

    public final short b() {
        if (this.f == null) {
            return (short) 0;
        }
        switch (this.j) {
            case 0:
                return (short) (this.i - (this.f.h() - 16));
            case 1:
                return this.i;
            case 2:
                return (short) (this.i - (this.f.h() - 16));
            case 3:
                return (short) (this.i - (this.f.h() - 8));
            default:
                return (short) (this.i - (this.f.h() - 16));
        }
    }

    public final short c() {
        if (this.f == null) {
            return (short) 0;
        }
        switch (this.j) {
        }
        return (short) ((this.h + 8) - (this.f.g() / 2));
    }

    public final short d() {
        if (this.f == null) {
            return (short) 0;
        }
        return this.f.g();
    }

    public final short e() {
        if (this.f == null) {
            return (short) 0;
        }
        return this.f.h();
    }

    public final void a(byte b) {
        this.j = b;
        if (this.g == 701) {
            this.f = a.ah.a(this.d[0], this.a, this.b, this.c);
            if (this.f == null) {
                ao.a(this.g, this.a, this.b, this.c);
                this.f = a.ah.a(this.d[0], this.a, this.b, this.c);
                return;
            }
            return;
        }
        this.f = a.ah.a(this.d[b], this.a, this.b, this.c);
        if (this.f == null) {
            ao.a(this.g, this.a, this.b, this.c);
            this.f = a.ah.a(this.d[b], this.a, this.b, this.c);
        }
    }

    public void a(aw awVar, ai aiVar, long j) {
        if (this.f == null || this.e.size() < 6) {
            return;
        }
        short[] sArr = (short[]) this.e.elementAt(0);
        a(sArr);
        this.h = sArr[0];
        this.i = sArr[1];
        ai.a(this.f, j);
        this.e.removeElementAt(0);
    }

    protected final void a(short[] sArr) {
        if (this.k == null) {
            this.k = sArr;
            return;
        }
        if (this.k[0] == sArr[0]) {
            if (sArr[1] > this.k[1]) {
                this.j = (byte) 3;
            } else {
                this.j = (byte) 1;
            }
        }
        if (this.k[1] == sArr[1]) {
            if (sArr[0] > this.k[0]) {
                this.j = (byte) 2;
            } else {
                this.j = (byte) 0;
            }
        }
        this.k = sArr;
        a(this.j);
    }

    public void a(Graphics graphics, ai aiVar, int i, int i2, byte b) {
        if (this.f != null) {
            switch (this.j) {
                case 0:
                    aiVar.a(graphics, this.f, (int[]) null, i, i2, (this.h + 16) - (this.f.i() / 2), (this.i + 16) - this.f.h(), 20, 0);
                    break;
                case 1:
                    aiVar.a(graphics, this.f, (int[]) null, i, i2, (this.h + 8) - (this.f.i() / 2), this.i, 20, 0);
                    break;
                case 2:
                    aiVar.a(graphics, this.f, (int[]) null, i, i2, this.h - (this.f.i() / 2), (this.i + 16) - this.f.h(), 20, 0);
                    break;
                case 3:
                    aiVar.a(graphics, this.f, (int[]) null, i, i2, (this.h + 8) - (this.f.i() / 2), (this.i + 8) - this.f.h(), 20, 0);
                    break;
            }
        }
    }
}

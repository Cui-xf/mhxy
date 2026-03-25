/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import com.yinhan.kjava.main.a;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

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

    public au(short s2, short s3, short s4, short s5) {
        if (s2 == 0) {
            s2 = (short)701;
        }
        this.g = s2;
        this.a = s3;
        this.b = s4;
        this.c = s5;
        this.f();
        this.a((byte)3);
    }

    public au(byte by2, short s2, short s3, short s4, short s5) {
        this.g = s2;
        this.a = s3;
        this.b = s4;
        this.c = s5;
        this.f();
        this.a((byte)3);
    }

    private void f() {
        if (this.g == 701) {
            this.d = new int[1];
            this.d[0] = bu.a(this.g + "_" + 0, (byte)2);
            return;
        }
        this.d = new int[4];
        for (int i2 = 0; i2 < 4; ++i2) {
            this.d[i2] = bu.a(this.g + "_" + (i2 / 2 << 1), (byte)2);
        }
    }

    public final short a() {
        switch (this.j) {
            case 1: {
                if (this.f == null) {
                    return 0;
                }
                return (short)(this.i + this.f.h());
            }
            case 3: {
                return (short)(this.i + 8);
            }
        }
        return (short)(this.i + 16);
    }

    public final short b() {
        if (this.f == null) {
            return 0;
        }
        switch (this.j) {
            case 1: {
                return this.i;
            }
            case 3: {
                return (short)(this.i - (this.f.h() - 8));
            }
            case 0: {
                return (short)(this.i - (this.f.h() - 16));
            }
            case 2: {
                return (short)(this.i - (this.f.h() - 16));
            }
        }
        return (short)(this.i - (this.f.h() - 16));
    }

    public final short c() {
        if (this.f == null) {
            return 0;
        }
        switch (this.j) {
            case 1: {
                return (short)(this.h + 8 - this.f.g() / 2);
            }
            case 3: {
                return (short)(this.h + 8 - this.f.g() / 2);
            }
            case 0: {
                return (short)(this.h + 16 - this.f.g() / 2);
            }
            case 2: {
                return (short)(this.h - this.f.g() / 2);
            }
        }
        return (short)(this.h + 16 - this.f.g() / 2);
    }

    public final short d() {
        if (this.f == null) {
            return 0;
        }
        return this.f.g();
    }

    public final short e() {
        if (this.f == null) {
            return 0;
        }
        return this.f.h();
    }

    public final void a(byte by2) {
        this.j = by2;
        if (this.g == 701) {
            this.f = com.yinhan.kjava.main.a.ah.a(this.d[0], this.a, this.b, this.c);
            if (this.f == null) {
                ao.a(this.g, this.a, this.b, this.c);
                this.f = com.yinhan.kjava.main.a.ah.a(this.d[0], this.a, this.b, this.c);
                return;
            }
        } else {
            this.f = com.yinhan.kjava.main.a.ah.a(this.d[by2], this.a, this.b, this.c);
            if (this.f == null) {
                ao.a(this.g, this.a, this.b, this.c);
                this.f = com.yinhan.kjava.main.a.ah.a(this.d[by2], this.a, this.b, this.c);
            }
        }
    }

    public void a(aw aw2, ai ai2, long l2) {
        int n2;
        if (this.f != null && (n2 = this.e.size()) >= 6) {
            short[] sArray = (short[])this.e.elementAt(0);
            this.a(sArray);
            this.h = sArray[0];
            this.i = sArray[1];
            ai.a(this.f, l2);
            this.e.removeElementAt(0);
        }
    }

    protected final void a(short[] sArray) {
        if (this.k == null) {
            this.k = sArray;
            return;
        }
        if (this.k[0] == sArray[0]) {
            this.j = sArray[1] > this.k[1] ? (byte)3 : (byte)1;
        }
        if (this.k[1] == sArray[1]) {
            this.j = sArray[0] > this.k[0] ? (byte)2 : (byte)0;
        }
        this.k = sArray;
        this.a(this.j);
    }

    public void a(Graphics graphics, ai ai2, int n2, int n3, byte by2) {
        if (this.f != null) {
            switch (this.j) {
                case 1: {
                    ai2.a(graphics, this.f, null, n2, n3, this.h + 8 - this.f.i() / 2, (int)this.i, 20, 0);
                    return;
                }
                case 3: {
                    ai2.a(graphics, this.f, null, n2, n3, this.h + 8 - this.f.i() / 2, this.i + 8 - this.f.h(), 20, 0);
                    return;
                }
                case 0: {
                    ai2.a(graphics, this.f, null, n2, n3, this.h + 16 - this.f.i() / 2, this.i + 16 - this.f.h(), 20, 0);
                    return;
                }
                case 2: {
                    ai2.a(graphics, this.f, null, n2, n3, this.h - this.f.i() / 2, this.i + 16 - this.f.h(), 20, 0);
                }
            }
        }
    }
}


package defpackage;

import java.util.Random;
import javax.microedition.lcdui.Graphics;

/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-8105993946875401281/classes.dex */
public final class s extends au {
    public int a;
    public short[] b;
    public byte c;
    public byte d;
    private short k;
    private short l;
    private short m;
    private long n;

    public s(int i, short s, short s2, short s3, short[] sArr, short s4, short s5, short s6, short s7, byte b) {
        super(s4, s5, s6, s7);
        this.a = i;
        this.k = s;
        this.l = s2;
        this.m = s3;
        this.b = sArr;
        this.d = b;
        if (this.b != null) {
            for (int i2 = 0; i2 < this.b.length; i2++) {
                if (this.b[i2] != -1) {
                    this.c = (byte) (this.c + 1);
                }
            }
        }
        this.h = this.k;
        this.i = this.l;
    }

    @Override // defpackage.au
    public final void a(aw awVar, ai aiVar, long j) {
        int iNextInt;
        int iNextInt2;
        if (this.f != null) {
            if (this.e.size() == 0) {
                if (this.m != 0) {
                    Random random = new Random();
                    short s = (short) (this.l - this.m);
                    short s2 = (short) (this.k - this.m);
                    while (true) {
                        iNextInt = random.nextInt() % (this.k + this.m);
                        if (iNextInt >= s2 && iNextInt <= (this.m << 1) + s2) {
                            break;
                        }
                    }
                    while (true) {
                        iNextInt2 = random.nextInt() % (this.l + this.m);
                        if (iNextInt2 >= s && iNextInt2 <= (this.m << 1) + s) {
                            break;
                        }
                    }
                    short s3 = iNextInt - this.h >= 0 ? (short) 4 : (short) -4;
                    int i = (iNextInt - this.h) / s3;
                    int i2 = 0;
                    short s4 = this.h;
                    while (i2 < i && aiVar.a(awVar, s4 + s3, this.i) == 0) {
                        short s5 = (short) (s4 + s3);
                        this.e.addElement(new short[]{s5, this.i});
                        i2++;
                        s4 = s5;
                    }
                    short s6 = iNextInt2 - this.i >= 0 ? (short) 4 : (short) -4;
                    int i3 = (iNextInt2 - this.i) / s6;
                    short s7 = this.i;
                    for (int i4 = 0; i4 < i3 && aiVar.a(awVar, s4, s7 + s6) == 0; i4++) {
                        s7 = (short) (s7 + s6);
                        this.e.addElement(new short[]{s4, s7});
                    }
                }
                this.n = j;
            } else if (this.e.size() > 0 && j - this.n > 200) {
                short[] sArr = (short[]) this.e.elementAt(0);
                if (this.g != 701) {
                    a(sArr);
                }
                this.h = sArr[0];
                this.i = sArr[1];
                this.e.removeElement(sArr);
                this.n = j;
            }
            ai.a(this.f, j);
        }
    }

    @Override // defpackage.au
    public final void a(Graphics graphics, ai aiVar, int i, int i2, byte b) {
        if (this.f != null) {
            aiVar.a(graphics, this.f, (int[]) null, i, i2, this.h - (this.f.g() / 2), this.i - this.f.h(), 20, 0);
        }
    }
}

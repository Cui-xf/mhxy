package p000;

import java.util.Random;
import javax.microedition.lcdui.Graphics;

/* renamed from: s */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-5080095226433994817/classes.dex */
public final class C0087s extends C0021au {

    /* renamed from: a */
    public int f2472a;

    /* renamed from: b */
    public short[] f2473b;

    /* renamed from: c */
    public byte f2474c;

    /* renamed from: d */
    public byte f2475d;

    /* renamed from: k */
    private short f2476k;

    /* renamed from: l */
    private short f2477l;

    /* renamed from: m */
    private short f2478m;

    /* renamed from: n */
    private long f2479n;

    public C0087s(int i, short s, short s2, short s3, short[] sArr, short s4, short s5, short s6, short s7, byte b) {
        super(s4, s5, s6, s7);
        this.f2472a = i;
        this.f2476k = s;
        this.f2477l = s2;
        this.f2478m = s3;
        this.f2473b = sArr;
        this.f2475d = b;
        if (this.f2473b != null) {
            for (int i2 = 0; i2 < this.f2473b.length; i2++) {
                if (this.f2473b[i2] != -1) {
                    this.f2474c = (byte) (this.f2474c + 1);
                }
            }
        }
        this.f438h = this.f2476k;
        this.f439i = this.f2477l;
    }

    @Override // p000.C0021au
    /* renamed from: a */
    public final void mo584a(C0023aw c0023aw, C0009ai c0009ai, long j) {
        int iNextInt;
        int iNextInt2;
        if (this.f436f != null) {
            if (this.f435e.size() == 0) {
                if (this.f2478m != 0) {
                    Random random = new Random();
                    short s = (short) (this.f2477l - this.f2478m);
                    short s2 = (short) (this.f2476k - this.f2478m);
                    while (true) {
                        iNextInt = random.nextInt() % (this.f2476k + this.f2478m);
                        if (iNextInt >= s2 && iNextInt <= (this.f2478m << 1) + s2) {
                            break;
                        }
                    }
                    while (true) {
                        iNextInt2 = random.nextInt() % (this.f2477l + this.f2478m);
                        if (iNextInt2 >= s && iNextInt2 <= (this.f2478m << 1) + s) {
                            break;
                        }
                    }
                    short s3 = iNextInt - this.f438h >= 0 ? (short) 4 : (short) -4;
                    int i = (iNextInt - this.f438h) / s3;
                    int i2 = 0;
                    short s4 = this.f438h;
                    while (i2 < i && c0009ai.m52a(c0023aw, s4 + s3, this.f439i) == 0) {
                        short s5 = (short) (s4 + s3);
                        this.f435e.addElement(new short[]{s5, this.f439i});
                        i2++;
                        s4 = s5;
                    }
                    short s6 = iNextInt2 - this.f439i >= 0 ? (short) 4 : (short) -4;
                    int i3 = (iNextInt2 - this.f439i) / s6;
                    short s7 = this.f439i;
                    for (int i4 = 0; i4 < i3 && c0009ai.m52a(c0023aw, s4, s7 + s6) == 0; i4++) {
                        s7 = (short) (s7 + s6);
                        this.f435e.addElement(new short[]{s4, s7});
                    }
                }
                this.f2479n = j;
            } else if (this.f435e.size() > 0 && j - this.f2479n > 200) {
                short[] sArr = (short[]) this.f435e.elementAt(0);
                if (this.f437g != 701) {
                    m586a(sArr);
                }
                this.f438h = sArr[0];
                this.f439i = sArr[1];
                this.f435e.removeElement(sArr);
                this.f2479n = j;
            }
            C0009ai.m43a(this.f436f, j);
        }
    }

    @Override // p000.C0021au
    /* renamed from: a */
    public final void mo585a(Graphics graphics, C0009ai c0009ai, int i, int i2, byte b) {
        if (this.f436f != null) {
            c0009ai.m62a(graphics, this.f436f, (int[]) null, i, i2, this.f438h - (this.f436f.m633g() / 2), this.f439i - this.f436f.m634h(), 20, 0);
        }
    }
}

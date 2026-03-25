/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import java.util.Random;
import javax.microedition.lcdui.Graphics;

public final class s
extends au {
    public int a;
    private short k;
    private short l;
    private short m;
    public short[] b;
    public byte c;
    private long n;
    public byte d;

    public s(int n2, short s2, short s3, short s4, short[] sArray, short s5, short s6, short s7, short s8, byte by2) {
        super(s5, s6, s7, s8);
        this.a = n2;
        this.k = s2;
        this.l = s3;
        this.m = s4;
        this.b = sArray;
        this.d = by2;
        if (this.b != null) {
            for (n2 = 0; n2 < this.b.length; ++n2) {
                if (this.b[n2] == -1) continue;
                this.c = (byte)(this.c + 1);
            }
        }
        this.h = this.k;
        this.i = this.l;
    }

    public final void a(Graphics graphics, ai ai2, int n2, int n3, byte by2) {
        if (this.f != null) {
            ai2.a(graphics, this.f, null, n2, n3, this.h - this.f.g() / 2, this.i - this.f.h(), 20, 0);
        }
    }

    public final void a(aw object, ai object2, long l2) {
        if (this.f != null) {
            long l3 = l2;
            Object object3 = object2;
            object2 = object;
            object = this;
            if (((au)object).e.size() == 0) {
                ai ai2 = object3;
                object3 = object2;
                object2 = object;
                if (((s)object2).m != 0) {
                    Random random = new Random();
                    int n2 = ((s)object2).l - ((s)object2).m;
                    short s2 = (short)(((s)object2).k - ((s)object2).m);
                    short s3 = 0;
                    int n3 = 0;
                    while ((s3 = random.nextInt() % (((s)object2).k + ((s)object2).m)) < s2 || s3 > s2 + (((s)object2).m << 1)) {
                    }
                    while ((n3 = random.nextInt() % (((s)object2).l + ((s)object2).m)) < n2 || n3 > n2 + (((s)object2).m << 1)) {
                    }
                    int n4 = s3 - ((au)object2).h >= 0 ? 4 : -4;
                    n2 = (s3 - ((au)object2).h) / n4;
                    s2 = ((au)object2).h;
                    for (s3 = 0; s3 < n2 && ai2.a((aw)object3, s2 + n4, ((au)object2).i) == 0; ++s3) {
                        s2 = (short)(s2 + n4);
                        ((au)object2).e.addElement(new short[]{s2, ((au)object2).i});
                    }
                    n4 = n3 - ((au)object2).i >= 0 ? 4 : -4;
                    n2 = (n3 - ((au)object2).i) / n4;
                    s3 = ((au)object2).i;
                    for (n3 = 0; n3 < n2 && ai2.a((aw)object3, s2, s3 + n4) == 0; ++n3) {
                        s3 = (short)(s3 + n4);
                        ((au)object2).e.addElement(new short[]{s2, s3});
                    }
                }
                ((s)object).n = l3;
            } else if (((au)object).e.size() > 0 && l3 - ((s)object).n > 200L) {
                object2 = (short[])((au)object).e.elementAt(0);
                if (((au)object).g != 701) {
                    ((au)object).a((short[])object2);
                }
                ((au)object).h = (short)object2[0];
                ((au)object).i = (short)object2[1];
                ((au)object).e.removeElement(object2);
                ((s)object).n = l3;
            }
            ai.a(this.f, l2);
        }
    }
}


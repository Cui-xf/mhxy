package p000;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;

/* renamed from: d */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-5080095226433994817/classes.dex */
public final class C0072d {

    /* renamed from: a */
    private int f2242a;

    /* renamed from: b */
    private C0008ah[] f2243b;

    private C0072d(Vector vector) {
        this.f2243b = new C0008ah[vector.size()];
        vector.copyInto(this.f2243b);
        for (int i = 0; i < this.f2243b.length; i++) {
            if (i == 0 || this.f2242a < this.f2243b[i].m42b()) {
                this.f2242a = this.f2243b[i].m42b();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x018b, code lost:
    
        r5 = r1;
        r2 = r6;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p000.C0072d[] m1551a(java.lang.String r15, int r16, javax.microedition.lcdui.Font r17, char r18) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0072d.m1551a(java.lang.String, int, javax.microedition.lcdui.Font, char):d[]");
    }

    /* renamed from: a */
    public final int m1552a() {
        return this.f2242a;
    }

    /* renamed from: a */
    public final void m1553a(Graphics graphics, int i, int i2, int i3) {
        int iM40a = i;
        for (int i4 = 0; i4 < this.f2243b.length; i4++) {
            this.f2243b[i4].m41a(graphics, iM40a, i2, this.f2242a, 20);
            iM40a += this.f2243b[i4].m40a();
        }
    }
}

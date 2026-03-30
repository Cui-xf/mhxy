package defpackage;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;

/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-8105993946875401281/classes.dex */
public final class d {
    private int a;
    private ah[] b;

    private d(Vector vector) {
        this.b = new ah[vector.size()];
        vector.copyInto(this.b);
        for (int i = 0; i < this.b.length; i++) {
            if (i == 0 || this.a < this.b[i].b()) {
                this.a = this.b[i].b();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x018b, code lost:
    
        r5 = r1;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.d[] a(java.lang.String r15, int r16, javax.microedition.lcdui.Font r17, char r18) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d.a(java.lang.String, int, javax.microedition.lcdui.Font, char):d[]");
    }

    public final int a() {
        return this.a;
    }

    public final void a(Graphics graphics, int i, int i2, int i3) {
        int iA = i;
        for (int i4 = 0; i4 < this.b.length; i4++) {
            this.b[i4].a(graphics, iA, i2, this.a, 20);
            iA += this.b[i4].a();
        }
    }
}

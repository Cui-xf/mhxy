package defpackage;

import java.util.Vector;

/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-8105993946875401281/classes.dex */
public final class ab {
    public static boolean b;
    private ao c;
    private long d = 0;
    public int a = -1;

    static {
        new Vector();
        b = true;
    }

    public ab(ao aoVar) {
        this.c = aoVar;
    }

    public static boolean c() {
        if (bt.q == null || bt.q.length <= 0) {
            return bt.bu;
        }
        if (bt.s == 1) {
            return bt.bu;
        }
        for (int i = 0; i < bt.q.length; i++) {
            if (bt.q[i].b.equals(bt.ad)) {
                return bt.q[i].s == 1 ? bt.bu : bt.bx == 1;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ab.a():void");
    }

    public final void b() {
        if (this.c == null || this.c.I == null || this.c.I.c == null || this.c.I.c.size() <= 0) {
            return;
        }
        this.c.I.c.removeAllElements();
    }
}

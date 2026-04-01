package p000;

import java.util.Vector;

/* renamed from: ab */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-5080095226433994817/classes.dex */
public final class C0002ab {

    /* renamed from: b */
    public static boolean f2b;

    /* renamed from: c */
    private C0015ao f4c;

    /* renamed from: d */
    private long f5d = 0;

    /* renamed from: a */
    public int f3a = -1;

    static {
        new Vector();
        f2b = true;
    }

    public C0002ab(C0015ao c0015ao) {
        this.f4c = c0015ao;
    }

    /* renamed from: c */
    public static boolean m0c() {
        if (C0047bt.f1683q == null || C0047bt.f1683q.length <= 0) {
            return C0047bt.f935bu;
        }
        if (C0047bt.f1765s == 1) {
            return C0047bt.f935bu;
        }
        for (int i = 0; i < C0047bt.f1683q.length; i++) {
            if (C0047bt.f1683q[i].f746b.equals(C0047bt.f865ad)) {
                return C0047bt.f1683q[i].f753s == 1 ? C0047bt.f935bu : C0047bt.f938bx == 1;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0119  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1a() {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0002ab.m1a():void");
    }

    /* renamed from: b */
    public final void m2b() {
        if (this.f4c == null || this.f4c.f181I == null || this.f4c.f181I.f17c == null || this.f4c.f181I.f17c.size() <= 0) {
            return;
        }
        this.f4c.f181I.f17c.removeAllElements();
    }
}

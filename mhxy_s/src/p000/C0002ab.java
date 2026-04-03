package p000;

import com.yinhan.kjava.main.RunnableC0066a;
import java.util.Vector;

/* renamed from: ab */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-4234804660425969496/classes.dex */
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

    /* renamed from: a */
    public final void m1a() {
        if (this.f4c == null || this.f4c.f181I == null || !C0047bt.f935bu || C0047bt.f936bv <= 0) {
            return;
        }
        if (this.f4c.f181I.f17c != null && this.f4c.f181I.f17c.size() > 0) {
            if (this.f4c.f354e.f2147ak - this.f5d < 2500) {
                return;
            }
            this.f4c.f181I.f17c.removeAllElements();
        }
        this.f5d = this.f4c.f354e.f2147ak;
        C0087s c0087s;
        if (this.f4c.f210aO == null || this.f4c.f210aO.size() <= 0) {
            c0087s = null;
        } else {
            int minDist = 0;
            int bestIdx = -1;
            for (int i = 0; i < this.f4c.f210aO.size(); i++) {
                C0087s c0087s2 = (C0087s) this.f4c.f210aO.elementAt(i);
                if (c0087s2.f2472a == this.f3a || c0087s2 == null || c0087s2.f436f == null || RunnableC0066a.f2114f.m52a(this.f4c.f355f, c0087s2.f438h, c0087s2.f439i) == 1) {
                    continue;
                }
                int dx2 = (c0087s2.f438h - this.f4c.f181I.f402j) * (c0087s2.f438h - this.f4c.f181I.f402j);
                int dy2 = (c0087s2.f439i - this.f4c.f181I.f403k) * (c0087s2.f439i - this.f4c.f181I.f403k);
                if (i == 0 || minDist == 0 || minDist > dx2 + dy2) {
                    minDist = dx2 + dy2;
                    bestIdx = i;
                }
            }
            c0087s = bestIdx == -1 ? null : (C0087s) this.f4c.f210aO.elementAt(bestIdx);
        }
        if (c0087s != null && (c0087s == null || c0087s.f436f != null)) {
            int iM633g = c0087s.f438h - (c0087s.f436f.m633g() / 2);
            int iM634h = c0087s.f439i - c0087s.f436f.m634h();
            if (RunnableC0066a.f2114f.m52a(this.f4c.f355f, iM633g, iM634h) != 1) {
                this.f4c.f354e.m1441b(iM633g, iM634h);
            }
        }
    }

    /* renamed from: b */
    public final void m2b() {
        if (this.f4c == null || this.f4c.f181I == null || this.f4c.f181I.f17c == null || this.f4c.f181I.f17c.size() <= 0) {
            return;
        }
        this.f4c.f181I.f17c.removeAllElements();
    }
}

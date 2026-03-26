package defpackage;

import com.yinhan.kjava.main.a;
import java.util.Vector;

/* loaded from: java版梦回西游3区251011.jar:ab.class */
public final class ab {
    private ao c;
    private long d = 0;
    public int a = -1;
    public static boolean b;

    public ab(ao aoVar) {
        this.c = aoVar;
    }

    public final void a() {
        s sVar;
        if (this.c == null || this.c.I == null || !bt.bu || bt.bv <= 0) {
            return;
        }
        if (this.c.I.c != null && this.c.I.c.size() > 0) {
            if (this.c.e.ak - this.d < 2500) {
                return;
            } else {
                this.c.I.c.removeAllElements();
            }
        }
        this.d = this.c.e.ak;
        if (this.c == null || this.c.aO == null || this.c.aO.size() <= 0) {
            sVar = null;
        } else {
            int i = 0;
            int i2 = -1;
            for (int i3 = 0; i3 < this.c.aO.size(); i3++) {
                s sVar2 = (s) this.c.aO.elementAt(i3);
                if (sVar2.a != this.a && sVar2 != null && ((sVar2 == null || sVar2.f != null) && a.f.a(this.c.f, sVar2.h, sVar2.i) != 1)) {
                    int i4 = (sVar2.h - this.c.I.j) * (sVar2.h - this.c.I.j);
                    int i5 = (sVar2.i - this.c.I.k) * (sVar2.i - this.c.I.k);
                    if (i3 == 0) {
                        i = i4 + i5;
                        i2 = i3;
                    } else if (i == 0) {
                        i = i4 + i5;
                        i2 = i3;
                    } else if (i > i4 + i5) {
                        i = i4 + i5;
                        i2 = i3;
                    }
                }
            }
            sVar = i2 == -1 ? null : (s) this.c.aO.elementAt(i2);
        }
        s sVar3 = sVar;
        if (sVar != null) {
            if (sVar3 == null || sVar3.f != null) {
                int iG = sVar3.h - (sVar3.f.g() / 2);
                int iH = sVar3.i - sVar3.f.h();
                if (a.f.a(this.c.f, iG, iH) == 1) {
                    return;
                }
                this.c.e.b(iG, iH);
            }
        }
    }

    public final void b() {
        if (this.c == null || this.c.I == null || this.c.I.c == null || this.c.I.c.size() <= 0) {
            return;
        }
        this.c.I.c.removeAllElements();
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

    static {
        new Vector();
        b = true;
    }
}

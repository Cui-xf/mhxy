/*
 * Decompiled with CFR 0.152.
 */
import com.yinhan.kjava.main.a;
import java.util.Vector;

public final class ab {
    private ao c;
    private long d = 0L;
    public int a = -1;
    public static boolean b;

    public ab(ao ao2) {
        this.c = ao2;
    }

    public final void a() {
        int n2;
        int n3;
        Object object;
        if (this.c == null || this.c.I == null) {
            return;
        }
        if (!bt.bu || bt.bv <= 0) {
            return;
        }
        if (this.c.I.c != null && this.c.I.c.size() > 0) {
            if (this.c.e.ak - this.d < 2500L) {
                return;
            }
            this.c.I.c.removeAllElements();
        }
        this.d = this.c.e.ak;
        ab ab2 = this;
        if (ab2.c == null) {
            object = null;
        } else if (ab2.c.aO == null || ab2.c.aO.size() <= 0) {
            object = null;
        } else {
            n3 = 0;
            int n4 = 0;
            boolean bl2 = false;
            Object var4_6 = null;
            int n5 = -1;
            for (int i2 = 0; i2 < ab2.c.aO.size(); ++i2) {
                s s2 = (s)ab2.c.aO.elementAt(i2);
                if (s2.a == ab2.a || s2 == null || s2 != null && s2.f == null || com.yinhan.kjava.main.a.f.a(ab2.c.f, s2.h, s2.i) == 1) continue;
                n4 = (s2.h - ab2.c.I.j) * (s2.h - ab2.c.I.j);
                int n6 = (s2.i - ab2.c.I.k) * (s2.i - ab2.c.I.k);
                if (i2 == 0) {
                    n3 = n4 + n6;
                    n5 = i2;
                    continue;
                }
                if (n3 == 0) {
                    n3 = n4 + n6;
                    n5 = i2;
                    continue;
                }
                if (n3 <= n4 + n6) continue;
                n3 = n4 + n6;
                n5 = i2;
            }
            object = ab2 = n5 == -1 ? null : (s)ab2.c.aO.elementAt(n5);
        }
        if (object == null || ab2 != null && ((au)((Object)ab2)).f == null) {
            return;
        }
        n3 = ((au)((Object)ab2)).h - ((au)((Object)ab2)).f.g() / 2;
        if (com.yinhan.kjava.main.a.f.a(this.c.f, n3, n2 = ((au)((Object)ab2)).i - ((au)((Object)ab2)).f.h()) == 1) {
            return;
        }
        this.c.e.b(n3, n2);
    }

    public final void b() {
        if (this.c == null || this.c.I == null || this.c.I.c == null) {
            return;
        }
        if (this.c.I.c.size() > 0) {
            this.c.I.c.removeAllElements();
        }
    }

    public static boolean c() {
        if (bt.q == null || bt.q.length <= 0) {
            return bt.bu;
        }
        if (bt.s == 1) {
            return bt.bu;
        }
        for (int i2 = 0; i2 < bt.q.length; ++i2) {
            if (!bt.q[i2].b.equals(bt.ad)) continue;
            if (bt.q[i2].s == 1) {
                return bt.bu;
            }
            return bt.bx == 1;
        }
        return false;
    }

    static {
        new Vector();
        b = true;
    }
}


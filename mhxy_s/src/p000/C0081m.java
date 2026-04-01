package p000;

import com.yinhan.kjava.main.RunnableC0066a;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

/* renamed from: m */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-4234804660425969496/classes.dex */
public final class C0081m extends AbstractC0012al {

    /* renamed from: c */
    public int f2330c;

    /* renamed from: d */
    public int f2331d;

    /* renamed from: i */
    private String f2336i;

    /* renamed from: m */
    private int f2340m;

    /* renamed from: n */
    private int f2341n;

    /* renamed from: o */
    private int f2342o;

    /* renamed from: p */
    private int f2343p;

    /* renamed from: h */
    private int f2335h = 16776917;

    /* renamed from: j */
    private boolean f2337j = false;

    /* renamed from: k */
    private boolean f2338k = true;

    /* renamed from: a */
    public int f2328a = 0;

    /* renamed from: b */
    public int f2329b = 0;

    /* renamed from: l */
    private Vector f2339l = new Vector();

    /* renamed from: q */
    private int[] f2344q = null;

    /* renamed from: e */
    public int f2332e = 0;

    /* renamed from: f */
    public int f2333f = 0;

    /* renamed from: g */
    public int f2334g = 0;

    /* renamed from: r */
    private int f2345r = 0;

    /* renamed from: s */
    private int f2346s = 0;

    /* renamed from: t */
    private int f2347t = -1;

    /* renamed from: u */
    private int f2348u = -1;

    /* renamed from: v */
    private int f2349v = -1;

    /* renamed from: w */
    private int f2350w = -1;

    /* renamed from: x */
    private int f2351x = -1;

    /* renamed from: y */
    private boolean f2352y = false;

    /* renamed from: b */
    private void m1594b(int i, int i2, int i3, int i4) {
        this.f2328a = i;
        this.f2329b = i2;
        this.f2330c = i3;
        this.f2331d = i4;
        this.f2346s = this.f2329b + 5;
        if (this.f2336i == null || RunnableC0066a.f2121v == null) {
            return;
        }
        int i5 = this.f2328a;
        int i6 = this.f2346s;
        int i7 = this.f2330c;
        short s = RunnableC0066a.f2121v.f600c;
        if (this.f2336i != null) {
            this.f2340m = i5;
            this.f2341n = i6;
            this.f2342o = i7;
            this.f2343p = s;
            this.f2346s = this.f2346s + this.f2343p + 3;
        }
    }

    /* renamed from: c */
    private void m1595c() {
        this.f2347t = -1;
        this.f2348u = -1;
        this.f2349v = -1;
        this.f2350w = -1;
        this.f2351x = -1;
        for (int i = 0; i < this.f2339l.size(); i++) {
            Object objElementAt = this.f2339l.elementAt(i);
            if (objElementAt instanceof C0082n) {
                this.f2347t = i;
            } else if (objElementAt instanceof C0054c) {
                this.f2348u = i;
            } else if (objElementAt instanceof C0014an) {
                this.f2349v = i;
            } else if (objElementAt instanceof C0040bm) {
                this.f2350w = i;
            } else if (objElementAt instanceof C0080l) {
                this.f2351x = i;
            }
        }
    }

    /* renamed from: a */
    public final int m1596a() {
        return this.f2341n + this.f2343p + 3;
    }

    /* renamed from: a */
    public final int m1597a(int i) {
        this.f2345r = i;
        return this.f2345r;
    }

    /* renamed from: a */
    public final void m1598a(int i, int i2, int i3, int i4) {
        m1594b(i, i2, i3, i4);
        m1595c();
        if (this.f2347t != -1) {
            ((C0082n) this.f2339l.elementAt(this.f2347t)).m1608a(this.f2328a + 5, this.f2346s, this.f2330c - 20, C0088t.f2524j + 3);
            this.f2346s += C0088t.f2524j;
        }
        if (this.f2348u != -1 && this.f2349v == -1) {
            int i5 = (((((this.f2329b + this.f2331d) - this.f2346s) - 6) - (this.f2350w != -1 ? C0088t.f2524j + 4 : 0)) - (this.f2351x != -1 ? RunnableC0066a.f2066E.f600c : (short) 0)) - this.f2332e;
            ((C0054c) this.f2339l.elementAt(this.f2348u)).m1258a(this.f2328a + 5, this.f2346s + this.f2332e, this.f2330c - 11, i5 - this.f2333f);
            this.f2346s += i5;
        } else if (this.f2348u == -1 && this.f2349v != -1) {
            int i6 = (((((this.f2329b + this.f2331d) - this.f2346s) - 6) - (this.f2350w != -1 ? C0088t.f2524j + 4 : 0)) - (this.f2351x != -1 ? RunnableC0066a.f2066E.f600c : (short) 0)) - this.f2345r;
            ((C0014an) this.f2339l.elementAt(this.f2349v)).m76a(this.f2328a + 5, this.f2346s + this.f2345r, this.f2330c - 11, i6 - this.f2334g);
            this.f2346s += i6;
        } else if (this.f2348u != -1 && this.f2349v != -1) {
            int i7 = (((((this.f2329b + this.f2331d) - this.f2346s) - 6) - (this.f2350w != -1 ? C0088t.f2524j + 4 : 0)) - (this.f2351x != -1 ? RunnableC0066a.f2066E.f600c : (short) 0)) - this.f2332e;
            int i8 = i7 / 2;
            this.f2346s += this.f2332e;
            ((C0054c) this.f2339l.elementAt(this.f2348u)).m1258a(this.f2328a + 5, this.f2346s, this.f2330c - 11, i8);
            this.f2346s += i8;
            ((C0014an) this.f2339l.elementAt(this.f2349v)).m76a(this.f2328a + 5, this.f2346s, this.f2330c - 11, i7 - i8);
        }
        if (this.f2350w == -1) {
            if (this.f2351x != -1) {
                ((C0080l) this.f2339l.elementAt(this.f2351x)).m1589a(this.f2328a, this.f2329b, this.f2330c, this.f2331d - 5);
            }
        } else {
            int i9 = this.f2328a + 6;
            int i10 = this.f2329b;
            int i11 = this.f2330c - 13;
            int i12 = this.f2331d - 6;
        }
    }

    /* renamed from: a */
    public final void m1599a(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        m1594b(i, i2, i3, i4);
        m1595c();
        if (this.f2347t != -1) {
            ((C0082n) this.f2339l.elementAt(this.f2347t)).m1608a(this.f2328a + 5, this.f2346s, this.f2330c - 20, C0088t.f2524j + 3);
            this.f2346s += C0088t.f2524j;
        }
        if (this.f2348u != -1 && this.f2349v == -1) {
            int i7 = (((((this.f2329b + this.f2331d) - this.f2346s) - 6) - (this.f2350w != -1 ? C0088t.f2524j + 4 : 0)) - (this.f2351x != -1 ? RunnableC0066a.f2066E.f600c : (short) 0)) - this.f2332e;
            ((C0054c) this.f2339l.elementAt(this.f2348u)).m1258a(this.f2328a + 5, this.f2346s + this.f2332e, this.f2330c - 11, i7 - this.f2333f);
            this.f2346s += i7;
        } else if (this.f2348u == -1 && this.f2349v != -1) {
            int i8 = (((((this.f2329b + this.f2331d) - this.f2346s) - 6) - (this.f2350w != -1 ? C0088t.f2524j + 4 : 0)) - (this.f2351x != -1 ? RunnableC0066a.f2066E.f600c : (short) 0)) - this.f2345r;
            ((C0014an) this.f2339l.elementAt(this.f2349v)).m76a(this.f2328a + 5, this.f2346s + this.f2345r, this.f2330c - 11, i8 - this.f2334g);
            this.f2346s += i8;
        } else if (this.f2348u != -1 && this.f2349v != -1) {
            int i9 = (((((this.f2329b + this.f2331d) - this.f2346s) - 6) - (this.f2350w != -1 ? C0088t.f2524j + 4 : 0)) - (this.f2351x != -1 ? RunnableC0066a.f2066E.f600c : (short) 0)) - this.f2332e;
            int i10 = (i9 * i5) / i6;
            this.f2346s += this.f2332e;
            if (z) {
                ((C0014an) this.f2339l.elementAt(this.f2349v)).m76a(this.f2328a + 5, this.f2346s, this.f2330c - 11, i10);
                this.f2346s += i10;
                ((C0054c) this.f2339l.elementAt(this.f2348u)).m1258a(this.f2328a + 5, this.f2346s, this.f2330c - 11, i9 - i10);
            } else {
                ((C0054c) this.f2339l.elementAt(this.f2348u)).m1258a(this.f2328a + 5, this.f2346s, this.f2330c - 11, i10);
                this.f2346s += i10;
                ((C0014an) this.f2339l.elementAt(this.f2349v)).m76a(this.f2328a + 5, this.f2346s, this.f2330c - 11, i9 - i10);
            }
        }
        if (this.f2350w == -1) {
            if (this.f2351x != -1) {
                ((C0080l) this.f2339l.elementAt(this.f2351x)).m1589a(this.f2328a, this.f2329b, this.f2330c, this.f2331d - 5);
            }
        } else {
            int i11 = this.f2328a + 6;
            int i12 = this.f2329b;
            int i13 = this.f2330c - 13;
            int i14 = this.f2331d - 6;
        }
    }

    /* renamed from: a */
    public final void m1600a(AbstractC0012al abstractC0012al) {
        this.f2339l.addElement(abstractC0012al);
    }

    /* renamed from: a */
    public final void m1601a(String str) {
        this.f2336i = str;
        if (str == null) {
            this.f2344q = null;
        } else {
            this.f2344q = new int[4];
        }
        this.f2345r = 0;
        this.f2346s = 0;
    }

    /* renamed from: a */
    public final void m1602a(Graphics graphics) {
        graphics.setClip(this.f2328a, this.f2329b, this.f2330c, this.f2331d);
        if (this.f2337j) {
            graphics.setColor(2780801);
            graphics.fillRect(this.f2328a, this.f2329b, this.f2330c, this.f2331d);
        }
        this.f2352y = false;
        if (this.f2336i != null && this.f2336i != null) {
            C0055ca.m1306a(graphics, RunnableC0066a.f2121v.f598a, RunnableC0066a.f2121v.f599b, this.f2340m, this.f2341n, this.f2342o, this.f2343p);
            graphics.drawImage(RunnableC0066a.f2120u.f598a, ((this.f2340m + this.f2342o) - 5) - RunnableC0066a.f2120u.f599b, this.f2341n + 1, 20);
            int i = ((this.f2340m + this.f2342o) - 5) - RunnableC0066a.f2120u.f599b;
            int i2 = this.f2341n + 1;
            short s = RunnableC0066a.f2120u.f599b;
            short s2 = RunnableC0066a.f2120u.f600c;
            if (this.f2344q != null) {
                this.f2344q[0] = i;
                this.f2344q[1] = i2;
                this.f2344q[2] = s;
                this.f2344q[3] = s2;
            }
            int iM1280a = C0055ca.m1280a(this.f2336i) != -1 ? C0055ca.m1280a(this.f2336i) : this.f2335h;
            String strSubstring = this.f2336i;
            if (iM1280a != this.f2335h) {
                strSubstring = C0055ca.f1893m == 2 ? this.f2336i.substring(4, this.f2336i.length()) : this.f2336i.substring(3, this.f2336i.length());
            }
            C0055ca.m1298a(graphics, strSubstring, (this.f2342o / 2) + this.f2340m, C0088t.m1674a(RunnableC0066a.f2121v.f600c) + this.f2341n, 17, iM1280a, 0);
            C0055ca.m1290a(graphics, this.f2340m, this.f2341n + this.f2343p, this.f2342o);
        }
        for (int i3 = 0; i3 < this.f2339l.size(); i3++) {
            Object objElementAt = this.f2339l.elementAt(i3);
            if (objElementAt instanceof C0082n) {
                ((C0082n) objElementAt).m1609a(graphics);
                this.f2352y = true;
            } else if (objElementAt instanceof C0054c) {
                ((C0054c) objElementAt).m1261a(graphics);
                ((C0054c) objElementAt).m1262a(this.f2352y);
            } else if (objElementAt instanceof C0014an) {
                ((C0014an) objElementAt).m78a(graphics);
                ((C0014an) objElementAt).f112f = this.f2352y;
            } else if (objElementAt instanceof C0040bm) {
            } else if (objElementAt instanceof C0080l) {
                ((C0080l) objElementAt).m1591a(graphics);
            }
        }
        C0055ca.m1289a(graphics, 2);
        graphics.drawRect(this.f2328a, this.f2329b, this.f2330c - 1, this.f2331d - 1);
        graphics.drawRect(this.f2328a + 4, this.f2329b + 4, this.f2330c - 9, this.f2331d - 9);
        C0055ca.m1289a(graphics, 3);
        graphics.drawRect(this.f2328a + 1, this.f2329b + 1, this.f2330c - 3, this.f2331d - 3);
        graphics.drawRect(this.f2328a + 3, this.f2329b + 3, this.f2330c - 7, this.f2331d - 7);
        C0055ca.m1289a(graphics, 4);
        graphics.drawRect(this.f2328a + 2, this.f2329b + 2, this.f2330c - 5, this.f2331d - 5);
        if (RunnableC0066a.f2117r.f598a != null && this.f2338k) {
            graphics.drawImage(RunnableC0066a.f2117r.f598a, this.f2328a, this.f2329b, 20);
        }
        if (RunnableC0066a.f2118s.f598a != null) {
            graphics.drawImage(RunnableC0066a.f2118s.f598a, this.f2328a, (this.f2329b + this.f2331d) - RunnableC0066a.f2118s.f600c, 20);
        }
        if (RunnableC0066a.f2119t.f598a != null) {
            graphics.drawImage(RunnableC0066a.f2119t.f598a, (this.f2328a + this.f2330c) - RunnableC0066a.f2119t.f599b, (this.f2329b + this.f2331d) - RunnableC0066a.f2119t.f600c, 20);
        }
        graphics.setClip(this.f2328a, this.f2329b, this.f2330c, this.f2331d);
    }

    /* renamed from: a */
    public final void m1603a(boolean z) {
        this.f2337j = z;
    }

    @Override // p000.AbstractC0012al
    /* renamed from: b */
    public final int mo69b(int i, int i2) {
        if (this.f2344q != null && i >= this.f2344q[0] && i <= this.f2344q[0] + this.f2344q[2] && i2 >= this.f2344q[1] && i2 <= this.f2344q[1] + this.f2344q[3]) {
            return 536870912;
        }
        for (int i3 = 0; i3 < this.f2339l.size(); i3++) {
            if (((AbstractC0012al) this.f2339l.elementAt(i3)).mo69b(i, i2) != 0) {
                return ((AbstractC0012al) this.f2339l.elementAt(i3)).mo69b(i, i2);
            }
        }
        return 0;
    }

    /* renamed from: b */
    public final void m1604b() {
        this.f2336i = null;
        this.f2337j = false;
        this.f2345r = 0;
        this.f2332e = 0;
        this.f2333f = 0;
        this.f2334g = 0;
        this.f2339l.removeAllElements();
    }

    @Override // p000.AbstractC0012al
    /* renamed from: b */
    public final void mo70b(int i) {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= this.f2339l.size()) {
                return;
            }
            ((AbstractC0012al) this.f2339l.elementAt(i3)).mo70b(i);
            i2 = i3 + 1;
        }
    }

    /* renamed from: b */
    public final void m1605b(boolean z) {
        this.f2338k = false;
    }

    @Override // p000.AbstractC0012al
    /* renamed from: j */
    public final void mo71j() {
        int i = 0;
        this.f2336i = null;
        this.f2337j = false;
        this.f2345r = 0;
        this.f2332e = 0;
        this.f2333f = 0;
        this.f2334g = 0;
        this.f2338k = true;
        while (true) {
            int i2 = i;
            if (i2 >= this.f2339l.size()) {
                this.f2339l.removeAllElements();
                return;
            } else {
                ((AbstractC0012al) this.f2339l.elementAt(i2)).mo71j();
                i = i2 + 1;
            }
        }
    }
}

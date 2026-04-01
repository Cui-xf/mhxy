package p000;

import com.yinhan.kjava.main.RunnableC0066a;
import java.lang.reflect.Array;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

/* renamed from: an */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-5080095226433994817/classes.dex */
public final class C0014an extends AbstractC0012al {

    /* renamed from: b */
    public int f108b;

    /* renamed from: c */
    public int f109c;

    /* renamed from: d */
    public int f110d;

    /* renamed from: e */
    public int f111e;

    /* renamed from: l */
    private Font f118l;

    /* renamed from: m */
    private String f119m;

    /* renamed from: n */
    private String[] f120n;

    /* renamed from: o */
    private int f121o;

    /* renamed from: p */
    private int f122p;

    /* renamed from: q */
    private int f123q;

    /* renamed from: r */
    private boolean f124r;

    /* renamed from: s */
    private String f125s;

    /* renamed from: t */
    private C0050bw f126t;

    /* renamed from: x */
    private byte f130x;

    /* renamed from: y */
    private int f131y;

    /* renamed from: g */
    private byte f113g = 1;

    /* renamed from: h */
    private int f114h = 0;

    /* renamed from: a */
    public int f107a = 0;

    /* renamed from: u */
    private String f127u = "\t";

    /* renamed from: v */
    private int f128v = 2176196;

    /* renamed from: w */
    private int[][] f129w = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 2, 4);

    /* renamed from: f */
    public boolean f112f = false;

    /* renamed from: i */
    private boolean f115i = false;

    /* renamed from: j */
    private boolean f116j = true;

    /* renamed from: k */
    private boolean f117k = false;

    public C0014an() {
        this.f124r = false;
        m74b((byte) 1);
        this.f124r = false;
    }

    /* renamed from: a */
    private void m72a(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f129w[0][0] = i;
        this.f129w[0][1] = i2;
        this.f129w[0][2] = i5;
        this.f129w[0][3] = i6;
        this.f129w[1][0] = i3;
        this.f129w[1][1] = i4;
        this.f129w[1][2] = i5;
        this.f129w[1][3] = i6;
    }

    /* renamed from: a */
    private boolean m73a(int i, int i2, int i3) {
        if (i3 == 0) {
            if (i >= this.f129w[0][0] && i <= this.f129w[0][0] + this.f129w[0][2] && i2 >= this.f129w[0][1] && i2 <= this.f129w[0][1] + this.f129w[0][3]) {
                return true;
            }
        } else if (i3 == 1 && i >= this.f129w[1][0] && i <= this.f129w[1][0] + this.f129w[1][2] && i2 >= this.f129w[1][1] && i2 <= this.f129w[1][1] + this.f129w[1][3]) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private void m74b(byte b) {
        this.f113g = b;
        if (b == 1) {
            this.f117k = false;
        }
    }

    /* renamed from: a */
    public final void m75a(byte b) {
        this.f130x = b;
    }

    /* renamed from: a */
    public final void m76a(int i, int i2, int i3, int i4) {
        this.f108b = i;
        this.f109c = i2;
        this.f110d = i3;
        this.f111e = i4;
    }

    /* renamed from: a */
    public final void m77a(String str, Font font, byte b) {
        this.f131y = font.getHeight();
        this.f114h = 0;
        this.f107a = 0;
        this.f118l = font;
        this.f125s = str;
        this.f126t = null;
        m74b(b);
        this.f130x = (byte) 0;
        this.f124r = true;
        this.f127u = "\t";
        this.f119m = null;
        this.f120n = null;
    }

    /* renamed from: a */
    public final void m78a(Graphics graphics) {
        if (this.f115i) {
            C0055ca.m1289a(graphics, 6014420);
            graphics.fillRect(this.f108b, this.f109c, this.f110d, this.f111e);
        }
        if (this.f116j) {
            C0055ca.m1292a(graphics, this.f108b, this.f109c, this.f110d, this.f111e, 1);
            if (this.f112f) {
                C0055ca.m1288a(graphics);
            }
        }
        if (this.f124r || this.f120n == null) {
            if (!this.f124r || this.f126t == null) {
                return;
            }
            for (int i = this.f107a; i < this.f126t.m1015a() && i < this.f107a + this.f122p; i++) {
                this.f126t.m1018a(graphics, this.f108b + 4, ((i - this.f107a) * this.f131y) + this.f109c + 4, i, 0);
            }
            if (this.f123q > 0) {
                C0055ca.m1294a(graphics, ((this.f108b + this.f110d) - 2) - RunnableC0066a.f2064C.f599b, this.f109c + 3, this.f111e - 5, this.f123q, this.f107a, this.f121o, this.f122p);
                m72a(((this.f108b + this.f110d) - 2) - RunnableC0066a.f2064C.f599b, this.f109c + 3, ((this.f108b + this.f110d) - 2) - RunnableC0066a.f2064C.f599b, (((this.f109c + 3) + this.f111e) - 5) - RunnableC0066a.f2065D.f600c, RunnableC0066a.f2065D.f599b, RunnableC0066a.f2065D.f600c);
                return;
            }
            return;
        }
        int i2 = this.f107a;
        while (true) {
            int i3 = i2;
            if (i3 >= this.f120n.length || i3 >= this.f107a + this.f122p) {
                break;
            }
            if (i3 == this.f114h && this.f117k) {
                C0055ca.m1289a(graphics, 9);
                if (this.f114h >= this.f122p) {
                    graphics.fillRect(this.f108b + 4, this.f109c + 4 + ((this.f122p - 1) * this.f131y), (this.f110d - RunnableC0066a.f2064C.f599b) - 8, this.f131y);
                } else {
                    graphics.fillRect(this.f108b + 4, this.f109c + 4 + (this.f114h * this.f131y), (this.f110d - RunnableC0066a.f2064C.f599b) - 8, this.f131y);
                }
            }
            if (i3 == this.f114h && this.f113g == 0) {
                C0055ca.m1297a(graphics, this.f120n[i3], this.f108b + 4, ((i3 - this.f107a) * this.f131y) + this.f109c + 4, 20, 13500379);
            } else {
                C0055ca.m1297a(graphics, this.f120n[i3], this.f108b + 4, ((i3 - this.f107a) * this.f131y) + this.f109c + 4, 20, this.f128v);
            }
            i2 = i3 + 1;
        }
        if (this.f123q > 0) {
            C0055ca.m1294a(graphics, ((this.f108b + this.f110d) - 2) - RunnableC0066a.f2064C.f599b, this.f109c + 3, this.f111e - 5, this.f123q, this.f107a, this.f121o, this.f122p);
            m72a(((this.f108b + this.f110d) - 2) - RunnableC0066a.f2064C.f599b, this.f109c + 3, ((this.f108b + this.f110d) - 2) - RunnableC0066a.f2064C.f599b, (((this.f109c + 3) + this.f111e) - 5) - RunnableC0066a.f2065D.f600c, RunnableC0066a.f2065D.f599b, RunnableC0066a.f2065D.f600c);
        }
    }

    @Override // p000.AbstractC0012al
    /* renamed from: b */
    public final int mo69b(int i, int i2) {
        if (m73a(i, i2, 0)) {
            return this.f130x == 0 ? 1 : 515;
        }
        if (m73a(i, i2, 1)) {
            return this.f130x == 0 ? 4 : 521;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x019c A[LOOP:1: B:93:0x0194->B:95:0x019c, LOOP_END] */
    @Override // p000.AbstractC0012al
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo70b(int r10) {
        /*
            Method dump skipped, instructions count: 758
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0014an.mo70b(int):void");
    }

    /* renamed from: b */
    public final void m79b(String str, Font font, byte b) {
        this.f131y = font.getHeight();
        this.f114h = 0;
        this.f107a = 0;
        this.f118l = font;
        this.f119m = str;
        m74b(b);
        this.f130x = (byte) 0;
        this.f127u = "\t";
        this.f124r = false;
        this.f125s = null;
        this.f126t = null;
    }

    @Override // p000.AbstractC0012al
    /* renamed from: j */
    public final void mo71j() {
        if (this.f120n != null) {
            for (short s = 0; s < this.f120n.length; s = (short) (s + 1)) {
                this.f120n[s] = null;
            }
            this.f120n = null;
        }
        this.f125s = null;
        this.f126t = null;
    }
}

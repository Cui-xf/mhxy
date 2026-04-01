package p000;

import com.yinhan.kjava.main.RunnableC0066a;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

/* renamed from: au */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-5080095226433994817/classes.dex */
public class C0021au {

    /* renamed from: a */
    private short f431a;

    /* renamed from: b */
    private short f432b;

    /* renamed from: c */
    private short f433c;

    /* renamed from: d */
    private int[] f434d;

    /* renamed from: e */
    public Vector f435e = new Vector();

    /* renamed from: f */
    public C0030bc f436f;

    /* renamed from: g */
    public short f437g;

    /* renamed from: h */
    public short f438h;

    /* renamed from: i */
    public short f439i;

    /* renamed from: j */
    public byte f440j;

    /* renamed from: k */
    private short[] f441k;

    public C0021au(byte b, short s, short s2, short s3, short s4) {
        this.f437g = s;
        this.f431a = s2;
        this.f432b = s3;
        this.f433c = s4;
        m581f();
        m583a((byte) 3);
    }

    public C0021au(short s, short s2, short s3, short s4) {
        this.f437g = s == 0 ? (short) 701 : s;
        this.f431a = s2;
        this.f432b = s3;
        this.f433c = s4;
        m581f();
        m583a((byte) 3);
    }

    /* renamed from: f */
    private void m581f() {
        if (this.f437g == 701) {
            this.f434d = new int[1];
            this.f434d[0] = C0048bu.m955a(new StringBuffer().append((int) this.f437g).append("_").append(0).toString(), (byte) 2);
        } else {
            this.f434d = new int[4];
            for (int i = 0; i < 4; i++) {
                this.f434d[i] = C0048bu.m955a(new StringBuffer().append((int) this.f437g).append("_").append((i / 2) << 1).toString(), (byte) 2);
            }
        }
    }

    /* renamed from: a */
    public final short m582a() {
        switch (this.f440j) {
            case 1:
                if (this.f436f == null) {
                    return (short) 0;
                }
                return (short) (this.f439i + this.f436f.m634h());
            case 2:
            default:
                return (short) (this.f439i + 16);
            case 3:
                return (short) (this.f439i + 8);
        }
    }

    /* renamed from: a */
    public final void m583a(byte b) {
        this.f440j = b;
        if (this.f437g == 701) {
            this.f436f = RunnableC0066a.f2102ah.m983a(this.f434d[0], this.f431a, this.f432b, this.f433c);
            if (this.f436f == null) {
                C0015ao.m164a(this.f437g, this.f431a, this.f432b, this.f433c);
                this.f436f = RunnableC0066a.f2102ah.m983a(this.f434d[0], this.f431a, this.f432b, this.f433c);
                return;
            }
            return;
        }
        this.f436f = RunnableC0066a.f2102ah.m983a(this.f434d[b], this.f431a, this.f432b, this.f433c);
        if (this.f436f == null) {
            C0015ao.m164a(this.f437g, this.f431a, this.f432b, this.f433c);
            this.f436f = RunnableC0066a.f2102ah.m983a(this.f434d[b], this.f431a, this.f432b, this.f433c);
        }
    }

    /* renamed from: a */
    public void mo584a(C0023aw c0023aw, C0009ai c0009ai, long j) {
        if (this.f436f == null || this.f435e.size() < 6) {
            return;
        }
        short[] sArr = (short[]) this.f435e.elementAt(0);
        m586a(sArr);
        this.f438h = sArr[0];
        this.f439i = sArr[1];
        C0009ai.m43a(this.f436f, j);
        this.f435e.removeElementAt(0);
    }

    /* renamed from: a */
    public void mo585a(Graphics graphics, C0009ai c0009ai, int i, int i2, byte b) {
        if (this.f436f != null) {
            switch (this.f440j) {
                case 0:
                    c0009ai.m62a(graphics, this.f436f, (int[]) null, i, i2, (this.f438h + 16) - (this.f436f.m635i() / 2), (this.f439i + 16) - this.f436f.m634h(), 20, 0);
                    break;
                case 1:
                    c0009ai.m62a(graphics, this.f436f, (int[]) null, i, i2, (this.f438h + 8) - (this.f436f.m635i() / 2), this.f439i, 20, 0);
                    break;
                case 2:
                    c0009ai.m62a(graphics, this.f436f, (int[]) null, i, i2, this.f438h - (this.f436f.m635i() / 2), (this.f439i + 16) - this.f436f.m634h(), 20, 0);
                    break;
                case 3:
                    c0009ai.m62a(graphics, this.f436f, (int[]) null, i, i2, (this.f438h + 8) - (this.f436f.m635i() / 2), (this.f439i + 8) - this.f436f.m634h(), 20, 0);
                    break;
            }
        }
    }

    /* renamed from: a */
    protected final void m586a(short[] sArr) {
        if (this.f441k == null) {
            this.f441k = sArr;
            return;
        }
        if (this.f441k[0] == sArr[0]) {
            if (sArr[1] > this.f441k[1]) {
                this.f440j = (byte) 3;
            } else {
                this.f440j = (byte) 1;
            }
        }
        if (this.f441k[1] == sArr[1]) {
            if (sArr[0] > this.f441k[0]) {
                this.f440j = (byte) 2;
            } else {
                this.f440j = (byte) 0;
            }
        }
        this.f441k = sArr;
        m583a(this.f440j);
    }

    /* renamed from: b */
    public final short m587b() {
        if (this.f436f == null) {
            return (short) 0;
        }
        switch (this.f440j) {
            case 0:
                return (short) (this.f439i - (this.f436f.m634h() - 16));
            case 1:
                return this.f439i;
            case 2:
                return (short) (this.f439i - (this.f436f.m634h() - 16));
            case 3:
                return (short) (this.f439i - (this.f436f.m634h() - 8));
            default:
                return (short) (this.f439i - (this.f436f.m634h() - 16));
        }
    }

    /* renamed from: c */
    public final short m588c() {
        if (this.f436f == null) {
            return (short) 0;
        }
        switch (this.f440j) {
            case 0:
                return (short) ((this.f438h + 16) - (this.f436f.m633g() / 2));
            case 1:
                return (short) ((this.f438h + 8) - (this.f436f.m633g() / 2));
            case 2:
                return (short) (this.f438h - (this.f436f.m633g() / 2));
            case 3:
                return (short) ((this.f438h + 8) - (this.f436f.m633g() / 2));
            default:
                return (short) ((this.f438h + 16) - (this.f436f.m633g() / 2));
        }
    }

    /* renamed from: d */
    public final short m589d() {
        if (this.f436f == null) {
            return (short) 0;
        }
        return this.f436f.m633g();
    }

    /* renamed from: e */
    public final short m590e() {
        if (this.f436f == null) {
            return (short) 0;
        }
        return this.f436f.m634h();
    }
}

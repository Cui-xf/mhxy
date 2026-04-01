package p000;

import java.util.Vector;

/* renamed from: ar */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-4234804660425969496/classes.dex */
public abstract class AbstractC0018ar {

    /* renamed from: d */
    public C0021au f396d;

    /* renamed from: e */
    public String f397e;

    /* renamed from: g */
    public C0030bc f399g;

    /* renamed from: i */
    short[] f401i;

    /* renamed from: f */
    public Vector f398f = new Vector();

    /* renamed from: h */
    public byte f400h = 3;

    /* renamed from: j */
    public short f402j = -1;

    /* renamed from: k */
    public short f403k = -1;

    /* renamed from: l */
    public short f404l = -1;

    /* renamed from: m */
    public short f405m = -1;

    /* renamed from: m */
    public final short m565m() {
        return (short) (this.f403k + 16);
    }

    /* renamed from: n */
    public final short m566n() {
        if (this.f399g == null) {
            return (short) 0;
        }
        return (short) (this.f403k - (this.f399g.m634h() - 16));
    }

    /* renamed from: o */
    public final short m567o() {
        if (this.f399g == null) {
            return (short) 0;
        }
        return (short) ((this.f402j + 8) - (this.f399g.m633g() / 2));
    }

    /* renamed from: p */
    public final short m568p() {
        if (this.f399g == null) {
            return (short) 0;
        }
        return this.f399g.m633g();
    }

    /* renamed from: q */
    public final short m569q() {
        if (this.f399g == null) {
            return (short) 0;
        }
        return this.f399g.m634h();
    }

    /* renamed from: r */
    public final void m570r() {
        if (this.f396d != null) {
            this.f396d.f435e.addElement(new short[]{this.f402j, this.f403k});
        }
    }
}

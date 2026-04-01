package p000;

import javax.microedition.lcdui.Font;

/* renamed from: bm */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-5080095226433994817/classes.dex */
public final class C0040bm extends AbstractC0012al {

    /* renamed from: a */
    private String f700a;

    /* renamed from: b */
    private String f701b;

    /* renamed from: c */
    private int f702c;

    /* renamed from: d */
    private int f703d;

    /* renamed from: e */
    private int f704e;

    /* renamed from: f */
    private int f705f;

    /* renamed from: g */
    private int f706g;

    /* renamed from: h */
    private int f707h;

    /* renamed from: i */
    private int f708i;

    /* renamed from: j */
    private int f709j;

    /* renamed from: k */
    private int f710k = 268435200;

    /* renamed from: l */
    private int f711l = 268435200;

    /* renamed from: m */
    private Font f712m = C0088t.f2523i;

    /* renamed from: n */
    private Font f713n = C0088t.f2523i;

    @Override // p000.AbstractC0012al
    /* renamed from: b */
    public final int mo69b(int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i < this.f702c || i > this.f702c + this.f704e || i2 < this.f703d || i2 > this.f703d + this.f705f) {
            this.f712m = C0088t.f2523i;
            this.f710k = 16776960;
            z = false;
        } else {
            this.f710k = 16711680;
            this.f712m = C0088t.f2522h;
            z = true;
        }
        if (z) {
            return 268435456;
        }
        if (i < this.f706g || i > this.f706g + this.f708i || i2 < this.f707h || i2 > this.f707h + this.f709j) {
            this.f713n = C0088t.f2523i;
            this.f711l = 16776960;
            z2 = false;
        } else {
            this.f711l = 16711680;
            this.f713n = C0088t.f2522h;
        }
        return z2 ? 536870912 : 0;
    }

    @Override // p000.AbstractC0012al
    /* renamed from: b */
    public final void mo70b(int i) {
    }

    @Override // p000.AbstractC0012al
    /* renamed from: j */
    public final void mo71j() {
        this.f700a = null;
        this.f701b = null;
        this.f712m = null;
        this.f713n = null;
    }
}

package p000;

import java.io.DataInputStream;
import java.io.IOException;
import javax.microedition.lcdui.Graphics;

/* renamed from: az */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-4234804660425969496/classes.dex */
public final class C0026az {

    /* renamed from: A */
    public short f482A;

    /* renamed from: D */
    public byte f485D;

    /* renamed from: E */
    public byte f486E;

    /* renamed from: F */
    public byte f487F;

    /* renamed from: G */
    public byte f488G;

    /* renamed from: H */
    public byte f489H;

    /* renamed from: I */
    public byte f490I;

    /* renamed from: J */
    public byte f491J;

    /* renamed from: K */
    public byte f492K;

    /* renamed from: L */
    public byte f493L;

    /* renamed from: M */
    public byte f494M;

    /* renamed from: N */
    public byte f495N;

    /* renamed from: O */
    public byte f496O;

    /* renamed from: P */
    public byte f497P;

    /* renamed from: Q */
    public byte f498Q;

    /* renamed from: R */
    public byte f499R;

    /* renamed from: S */
    public int f500S;

    /* renamed from: T */
    public byte f501T;

    /* renamed from: W */
    private String f504W;

    /* renamed from: X */
    private C0050bw f505X;

    /* renamed from: a */
    public short f508a;

    /* renamed from: b */
    public String f510b;

    /* renamed from: c */
    public short f511c;

    /* renamed from: d */
    public short f512d;

    /* renamed from: e */
    public byte f513e;

    /* renamed from: f */
    public byte f514f;

    /* renamed from: g */
    public byte f515g;

    /* renamed from: h */
    public byte f516h;

    /* renamed from: i */
    public byte f517i;

    /* renamed from: j */
    public byte f518j;

    /* renamed from: k */
    public byte f519k;

    /* renamed from: l */
    public byte f520l;

    /* renamed from: m */
    public byte f521m;

    /* renamed from: n */
    public byte f522n;

    /* renamed from: o */
    public byte f523o;

    /* renamed from: p */
    public byte f524p;

    /* renamed from: q */
    public byte f525q;

    /* renamed from: r */
    public byte f526r;

    /* renamed from: s */
    public byte f527s;

    /* renamed from: t */
    public byte f528t;

    /* renamed from: u */
    public short f529u;

    /* renamed from: v */
    public int f530v;

    /* renamed from: y */
    public short f533y;

    /* renamed from: z */
    public short f534z;

    /* renamed from: w */
    public C0030bc f531w = null;

    /* renamed from: x */
    public boolean f532x = false;

    /* renamed from: B */
    public String[] f483B = null;

    /* renamed from: C */
    public String[] f484C = null;

    /* renamed from: V */
    private byte f503V = 0;

    /* renamed from: U */
    public byte f502U = 0;

    /* renamed from: Y */
    private int[] f506Y = null;

    /* renamed from: Z */
    private int f507Z = 0;

    /* renamed from: aa */
    private boolean f509aa = false;

    /* renamed from: a */
    public final short m612a() {
        return this.f531w == null ? (short) (this.f511c - 8) : (short) (this.f511c - (this.f531w.m633g() / 2));
    }

    /* renamed from: a */
    public final void m613a(DataInputStream dataInputStream) throws IOException {
        this.f508a = dataInputStream.readShort();
        this.f510b = dataInputStream.readUTF();
        dataInputStream.readShort();
        this.f511c = (short) (dataInputStream.readShort() + 8);
        this.f512d = (short) (dataInputStream.readShort() + 8);
        dataInputStream.readShort();
        byte b = dataInputStream.readByte();
        this.f513e = (byte) (b & 1);
        this.f514f = (byte) ((b >>> 1) & 1);
        this.f515g = (byte) ((b >>> 2) & 1);
        this.f516h = (byte) ((b >>> 3) & 1);
        this.f517i = (byte) ((b >>> 4) & 1);
        this.f519k = (byte) ((b >>> 5) & 1);
        this.f520l = (byte) ((b >>> 6) & 1);
        byte b2 = dataInputStream.readByte();
        this.f521m = (byte) (b2 & 1);
        this.f522n = (byte) ((b2 >>> 1) & 1);
        this.f523o = (byte) ((b2 >>> 2) & 1);
        this.f524p = (byte) ((b2 >>> 3) & 1);
        this.f525q = (byte) ((b2 >>> 4) & 1);
        this.f485D = (byte) ((b2 >>> 5) & 1);
        this.f486E = (byte) ((b2 >>> 6) & 1);
        this.f487F = (byte) ((b2 >>> 7) & 1);
        byte b3 = dataInputStream.readByte();
        this.f488G = (byte) (b3 & 1);
        this.f491J = (byte) ((b3 >>> 1) & 1);
        this.f526r = (byte) ((b3 >>> 2) & 1);
        this.f527s = (byte) ((b3 >>> 3) & 1);
        this.f492K = (byte) ((b3 >>> 4) & 1);
        this.f493L = (byte) ((b3 >>> 5) & 1);
        this.f494M = (byte) ((b3 >>> 6) & 1);
        this.f498Q = (byte) ((b3 >>> 7) & 1);
        byte b4 = dataInputStream.readByte();
        this.f499R = (byte) (b4 & 1);
        this.f495N = (byte) ((b4 >>> 1) & 1);
        this.f496O = (byte) ((b4 >>> 2) & 1);
        this.f497P = (byte) ((b4 >>> 3) & 1);
        this.f501T = (byte) ((b4 >>> 4) & 1);
        this.f518j = dataInputStream.readByte();
        this.f489H = dataInputStream.readByte();
        this.f490I = dataInputStream.readByte();
        this.f528t = dataInputStream.readByte();
        this.f529u = dataInputStream.readShort();
        this.f533y = dataInputStream.readShort();
        this.f534z = dataInputStream.readShort();
        this.f482A = dataInputStream.readShort();
        this.f503V = dataInputStream.readByte();
        if (this.f503V == 1) {
            this.f504W = dataInputStream.readUTF();
            this.f502U = dataInputStream.readByte();
        }
        int i = dataInputStream.readByte();
        if (i > 0) {
            this.f483B = new String[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.f483B[i2] = dataInputStream.readUTF();
            }
            this.f484C = new String[i];
            for (int i3 = 0; i3 < i; i3++) {
                this.f484C[i3] = dataInputStream.readUTF();
            }
        }
        if (this.f499R == 1) {
            this.f500S = dataInputStream.readInt();
        }
        this.f530v = C0048bu.m956a(C0048bu.m971b(String.valueOf((int) this.f529u), (byte) 2).toCharArray());
        this.f503V = (byte) 1;
        if (this.f503V != 1 || this.f502U <= 0) {
            return;
        }
        String str = this.f504W;
        int i4 = C0088t.f2516b - 40;
        short s = this.f512d;
        byte b5 = this.f502U;
        if (str == null || this.f502U == 0) {
            this.f505X = null;
            this.f502U = (byte) 0;
            return;
        }
        this.f502U = b5;
        this.f509aa = false;
        this.f507Z = 0;
        this.f505X = new C0050bw(str, (short) (i4 - 10));
        if (this.f505X == null || this.f505X.m1015a() == 0) {
            this.f506Y = null;
            return;
        }
        int i5 = C0088t.f2524j;
        this.f506Y = new int[4];
        this.f506Y[2] = i4;
        this.f506Y[3] = (i5 * this.f505X.m1015a()) + 10;
        this.f506Y[0] = (C0088t.f2516b - this.f506Y[2]) / 2;
        this.f506Y[1] = s;
    }

    /* renamed from: a */
    public final void m614a(Graphics graphics, C0009ai c0009ai, int i, int i2, byte b) {
        if ((this.f528t == -1 && C0015ao.f174t != null) || (this.f490I == 100 && C0015ao.f174t != null)) {
            c0009ai.m62a(graphics, C0015ao.f174t, (int[]) null, i, i2, this.f511c - (C0015ao.f174t.m635i() / 2), ((this.f512d - (this.f531w == null ? (short) 30 : this.f531w.m636j())) - C0088t.f2524j) - C0015ao.f174t.m636j(), 20, b);
        } else if (this.f528t == 1 && C0015ao.f173s != null) {
            c0009ai.m62a(graphics, C0015ao.f173s, (int[]) null, i, i2, this.f511c - (C0015ao.f173s.m635i() / 2), ((this.f512d - (this.f531w == null ? (short) 30 : this.f531w.m636j())) - C0088t.f2524j) - C0015ao.f173s.m636j(), 20, b);
        }
        if (!this.f532x || C0015ao.f175u == null) {
            this.f507Z = 0;
            return;
        }
        c0009ai.m62a(graphics, C0015ao.f175u, (int[]) null, i, i2, this.f511c + (this.f531w == null ? 8 : this.f531w.m635i() / 2), this.f512d - (this.f531w == null ? (short) 30 : this.f531w.m636j()), 20, b);
        if (this.f505X == null || this.f506Y == null || this.f502U == 0) {
            return;
        }
        graphics.setClip(0, 0, C0088t.f2516b, C0088t.f2517c);
        if (this.f507Z >= 0) {
            int i3 = this.f506Y[1] - i2;
            if (this.f506Y[3] + i3 > C0088t.f2517c) {
                i3 = (C0088t.f2517c - this.f506Y[3]) - 4;
            }
            C0055ca.m1293a(graphics, 1009050, 150, this.f506Y[0], i3, this.f506Y[2], this.f506Y[3]);
            if (this.f507Z >= 3) {
                this.f505X.m1017a(graphics, this.f506Y[0] + 5, i3 + 5, 20);
            }
        }
        this.f509aa = true;
        this.f507Z++;
    }

    /* renamed from: b */
    public final short m615b() {
        if (this.f531w == null) {
            return (short) (this.f512d - 30);
        }
        return (short) (this.f512d - (this.f531w.m634h() == 0 ? (short) 30 : this.f531w.m634h()));
    }

    /* renamed from: c */
    public final short m616c() {
        if (this.f531w == null || this.f531w == null || this.f531w.m633g() == 0) {
            return (short) 16;
        }
        return this.f531w.m633g();
    }

    /* renamed from: d */
    public final short m617d() {
        if (this.f531w == null || this.f531w.m634h() == 0) {
            return (short) 30;
        }
        return this.f531w.m634h();
    }

    /* renamed from: e */
    public final void m618e() {
        if (this.f502U < 0) {
            return;
        }
        if (this.f502U <= 0) {
            this.f505X = null;
            this.f507Z = 0;
            this.f506Y = null;
        } else if (this.f509aa) {
            this.f509aa = false;
            this.f502U = (byte) (this.f502U - 1);
        }
    }
}

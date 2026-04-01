package p000;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

/* renamed from: bc */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-5080095226433994817/classes.dex */
public final class C0030bc extends AbstractC0060cf {

    /* renamed from: a */
    public short f561a;

    /* renamed from: b */
    public short f562b;

    /* renamed from: c */
    public short f563c;

    /* renamed from: d */
    public short f564d;

    /* renamed from: e */
    public long f565e;

    /* renamed from: f */
    public byte f566f;

    /* renamed from: g */
    public short[] f567g;

    /* renamed from: h */
    public short[] f568h;

    /* renamed from: i */
    public byte f569i;

    /* renamed from: j */
    public byte f570j;

    /* renamed from: k */
    public C0051bx[][] f571k;

    /* renamed from: l */
    private short f572l;

    /* renamed from: m */
    private short f573m;

    /* renamed from: n */
    private short f574n;

    /* renamed from: q */
    private short f575q;

    public C0030bc(short s, short s2, short s3) {
        super((byte) 2);
        this.f561a = s;
        this.f562b = s2;
        this.f563c = s3;
    }

    /* renamed from: a */
    public final C0030bc m626a(short s, short s2, short s3) {
        C0030bc c0030bc = new C0030bc(s, s2, s3);
        c0030bc.f1957p = this.f1957p;
        c0030bc.f564d = this.f564d;
        c0030bc.f565e = System.currentTimeMillis();
        c0030bc.f571k = new C0051bx[this.f571k.length][];
        for (int i = 0; i < this.f571k.length; i++) {
            c0030bc.f571k[i] = new C0051bx[this.f571k[i].length];
            for (int i2 = 0; i2 < this.f571k[i].length; i2++) {
                C0051bx[] c0051bxArr = c0030bc.f571k[i];
                C0051bx c0051bx = this.f571k[i][i2];
                C0051bx c0051bx2 = new C0051bx();
                c0051bx2.f1794b = c0051bx.f1794b;
                c0051bx2.f1795c = c0051bx.f1795c;
                c0051bx2.f1796d = c0051bx.f1796d;
                c0051bx2.f1797e = c0051bx.f1797e;
                c0051bx2.f1798f = c0051bx.f1798f;
                c0051bxArr[i2] = c0051bx2;
            }
        }
        c0030bc.f567g = this.f567g;
        c0030bc.f568h = this.f568h;
        c0030bc.f572l = this.f572l;
        c0030bc.f573m = this.f573m;
        c0030bc.f574n = this.f574n;
        c0030bc.f575q = this.f575q;
        c0030bc.f569i = this.f569i;
        c0030bc.f570j = this.f570j;
        return c0030bc;
    }

    @Override // p000.AbstractC0060cf
    /* renamed from: a */
    public final void mo606a() {
    }

    /* renamed from: a */
    protected final void m627a(byte[][] bArr) {
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr[0]));
        try {
            try {
                int i = dataInputStream.readByte();
                if (i > 0) {
                    this.f572l = dataInputStream.readShort();
                    this.f573m = dataInputStream.readShort();
                    this.f574n = dataInputStream.readShort();
                    this.f575q = dataInputStream.readShort();
                    this.f571k = new C0051bx[i][];
                    for (int i2 = 0; i2 < i; i2++) {
                        int i3 = dataInputStream.readByte();
                        if (i3 > 0) {
                            this.f571k[i2] = new C0051bx[i3];
                            for (int i4 = 0; i4 < i3; i4++) {
                                C0051bx c0051bx = new C0051bx();
                                c0051bx.m1020a(dataInputStream, true);
                                this.f571k[i2][i4] = c0051bx;
                            }
                        }
                    }
                    this.f564d = dataInputStream.readShort();
                    this.f566f = (byte) 0;
                    this.f565e = System.currentTimeMillis();
                }
                try {
                    dataInputStream.close();
                } catch (IOException e) {
                }
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                } catch (IOException e2) {
                }
                throw th;
            }
        } catch (IOException e3) {
            e3.printStackTrace();
            try {
                dataInputStream.close();
            } catch (IOException e4) {
            }
        }
    }

    /* renamed from: b */
    public final C0030bc m628b() {
        C0030bc c0030bc = new C0030bc((short) 0, (short) 0, (short) 0);
        c0030bc.f1957p = this.f1957p;
        c0030bc.f564d = this.f564d;
        c0030bc.f565e = System.currentTimeMillis();
        c0030bc.f571k = this.f571k;
        c0030bc.f567g = this.f567g;
        c0030bc.f568h = this.f568h;
        c0030bc.f572l = this.f572l;
        c0030bc.f573m = this.f573m;
        c0030bc.f574n = this.f574n;
        c0030bc.f575q = this.f575q;
        c0030bc.f569i = this.f569i;
        c0030bc.f570j = this.f570j;
        return c0030bc;
    }

    /* renamed from: c */
    public final short m629c() {
        if (this.f571k == null || this.f566f >= this.f571k.length) {
            return (short) 0;
        }
        return this.f572l;
    }

    /* renamed from: d */
    public final short m630d() {
        if (this.f571k == null || this.f566f >= this.f571k.length) {
            return (short) 0;
        }
        return this.f573m;
    }

    /* renamed from: e */
    public final short m631e() {
        if (this.f571k == null || this.f566f >= this.f571k.length) {
            return (short) 0;
        }
        return this.f574n;
    }

    /* renamed from: f */
    public final short m632f() {
        if (this.f571k == null || this.f566f >= this.f571k.length) {
            return (short) 0;
        }
        return this.f575q;
    }

    /* renamed from: g */
    public final short m633g() {
        if (this.f567g != null) {
            return this.f567g[this.f566f];
        }
        return (short) 0;
    }

    /* renamed from: h */
    public final short m634h() {
        if (this.f568h != null) {
            return this.f568h[this.f566f];
        }
        return (short) 0;
    }

    /* renamed from: i */
    public final short m635i() {
        if (this.f567g != null) {
            return this.f567g[0];
        }
        return (short) 0;
    }

    /* renamed from: j */
    public final short m636j() {
        if (this.f568h != null) {
            return this.f568h[0];
        }
        return (short) 0;
    }
}

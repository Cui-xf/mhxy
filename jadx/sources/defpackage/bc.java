package defpackage;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

/* loaded from: java版梦回西游3区251011.jar:bc.class */
public final class bc extends cf {
    public short a;
    public short b;
    public short c;
    public short d;
    public long e;
    public byte f;
    public short[] g;
    public short[] h;
    private short l;
    private short m;
    private short n;
    private short q;
    public byte i;
    public byte j;
    public bx[][] k;

    public bc(short s, short s2, short s3) {
        super((byte) 2);
        this.a = s;
        this.b = s2;
        this.c = s3;
    }

    public final bc b() {
        bc bcVar = new bc((short) 0, (short) 0, (short) 0);
        bcVar.p = this.p;
        bcVar.d = this.d;
        bcVar.e = System.currentTimeMillis();
        bcVar.k = this.k;
        bcVar.g = this.g;
        bcVar.h = this.h;
        bcVar.l = this.l;
        bcVar.m = this.m;
        bcVar.n = this.n;
        bcVar.q = this.q;
        bcVar.i = this.i;
        bcVar.j = this.j;
        return bcVar;
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [bx[], bx[][]] */
    public final bc a(short s, short s2, short s3) {
        bc bcVar = new bc(s, s2, s3);
        bcVar.p = this.p;
        bcVar.d = this.d;
        bcVar.e = System.currentTimeMillis();
        bcVar.k = new bx[this.k.length];
        for (int i = 0; i < this.k.length; i++) {
            bcVar.k[i] = new bx[this.k[i].length];
            for (int i2 = 0; i2 < this.k[i].length; i2++) {
                bx bxVar = this.k[i][i2];
                bx bxVar2 = new bx();
                bxVar2.b = bxVar.b;
                bxVar2.c = bxVar.c;
                bxVar2.d = bxVar.d;
                bxVar2.e = bxVar.e;
                bxVar2.f = bxVar.f;
                bcVar.k[i][i2] = bxVar2;
            }
        }
        bcVar.g = this.g;
        bcVar.h = this.h;
        bcVar.l = this.l;
        bcVar.m = this.m;
        bcVar.n = this.n;
        bcVar.q = this.q;
        bcVar.i = this.i;
        bcVar.j = this.j;
        return bcVar;
    }

    public final short c() {
        if (this.k == null || this.f >= this.k.length) {
            return (short) 0;
        }
        return this.l;
    }

    public final short d() {
        if (this.k == null || this.f >= this.k.length) {
            return (short) 0;
        }
        return this.m;
    }

    public final short e() {
        if (this.k == null || this.f >= this.k.length) {
            return (short) 0;
        }
        return this.n;
    }

    public final short f() {
        if (this.k == null || this.f >= this.k.length) {
            return (short) 0;
        }
        return this.q;
    }

    public final short g() {
        if (this.g != null) {
            return this.g[this.f];
        }
        return (short) 0;
    }

    public final short h() {
        if (this.h != null) {
            return this.h[this.f];
        }
        return (short) 0;
    }

    public final short i() {
        if (this.g != null) {
            return this.g[0];
        }
        return (short) 0;
    }

    public final short j() {
        if (this.h != null) {
            return this.h[0];
        }
        return (short) 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.DataInputStream] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v18, types: [bc] */
    /* JADX WARN: Type inference failed for: r0v25, types: [bx] */
    /* JADX WARN: Type inference failed for: r0v27, types: [bx[][]] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r1v12, types: [bx[], bx[][]] */
    protected final void a(byte[][] bArr) {
        ?? dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr[0]));
        try {
            try {
                int i = dataInputStream.readByte();
                if (i > 0) {
                    this.l = dataInputStream.readShort();
                    this.m = dataInputStream.readShort();
                    this.n = dataInputStream.readShort();
                    this.q = dataInputStream.readShort();
                    this.k = new bx[i];
                    for (int i2 = 0; i2 < i; i2++) {
                        int i3 = dataInputStream.readByte();
                        if (i3 > 0) {
                            this.k[i2] = new bx[i3];
                            for (int i4 = 0; i4 < i3; i4++) {
                                ?? bxVar = new bx();
                                bxVar.a(dataInputStream, true);
                                this.k[i2][i4] = bxVar;
                            }
                        }
                    }
                    this.d = dataInputStream.readShort();
                    this.f = (byte) 0;
                    dataInputStream = this;
                    dataInputStream.e = System.currentTimeMillis();
                }
                try {
                    dataInputStream.close();
                } catch (IOException unused) {
                }
            } catch (IOException e) {
                dataInputStream.printStackTrace();
                try {
                    dataInputStream.close();
                } catch (IOException unused2) {
                }
            }
        } catch (Throwable th) {
            try {
                dataInputStream.close();
            } catch (IOException unused3) {
            }
            throw th;
        }
    }

    @Override // defpackage.cf
    public final void a() {
    }
}

/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

public final class bc
extends cf {
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

    public bc(short s2, short s3, short s4) {
        super((byte)2);
        this.a = s2;
        this.b = s3;
        this.c = s4;
    }

    public final bc b() {
        bc bc2 = new bc(0, 0, 0);
        new bc(0, 0, 0).p = this.p;
        bc2.d = this.d;
        bc2.e = System.currentTimeMillis();
        bc2.k = this.k;
        bc2.g = this.g;
        bc2.h = this.h;
        bc2.l = this.l;
        bc2.m = this.m;
        bc2.n = this.n;
        bc2.q = this.q;
        bc2.i = this.i;
        bc2.j = this.j;
        return bc2;
    }

    public final bc a(short s2, short s3, short s4) {
        bc bc2 = new bc(s2, s3, s4);
        new bc(s2, s3, s4).p = this.p;
        bc2.d = this.d;
        bc2.e = System.currentTimeMillis();
        bc2.k = new bx[this.k.length][];
        for (s3 = 0; s3 < this.k.length; s3 = (short)(s3 + 1)) {
            bc2.k[s3] = new bx[this.k[s3].length];
            for (s4 = 0; s4 < this.k[s3].length; s4 = (short)(s4 + 1)) {
                bx bx2 = this.k[s3][s4];
                bx bx3 = new bx();
                new bx().b = bx2.b;
                bx3.c = bx2.c;
                bx3.d = bx2.d;
                bx3.e = bx2.e;
                bx3.f = bx2.f;
                bc2.k[s3][s4] = bx3;
            }
        }
        bc2.g = this.g;
        bc2.h = this.h;
        bc2.l = this.l;
        bc2.m = this.m;
        bc2.n = this.n;
        bc2.q = this.q;
        bc2.i = this.i;
        bc2.j = this.j;
        return bc2;
    }

    public final short c() {
        if (this.k != null && this.f < this.k.length) {
            return this.l;
        }
        return 0;
    }

    public final short d() {
        if (this.k != null && this.f < this.k.length) {
            return this.m;
        }
        return 0;
    }

    public final short e() {
        if (this.k != null && this.f < this.k.length) {
            return this.n;
        }
        return 0;
    }

    public final short f() {
        if (this.k != null && this.f < this.k.length) {
            return this.q;
        }
        return 0;
    }

    public final short g() {
        if (this.g != null) {
            return this.g[this.f];
        }
        return 0;
    }

    public final short h() {
        if (this.h != null) {
            return this.h[this.f];
        }
        return 0;
    }

    public final short i() {
        if (this.g != null) {
            return this.g[0];
        }
        return 0;
    }

    public final short j() {
        if (this.h != null) {
            return this.h[0];
        }
        return 0;
    }

    /*
     * Loose catch block
     */
    protected final void a(byte[][] object) {
        block12: {
            object = new DataInputStream(new ByteArrayInputStream(object[0]));
            bx bx2 = null;
            int n2 = ((DataInputStream)object).readByte();
            if (n2 <= 0) break block12;
            this.l = ((DataInputStream)object).readShort();
            this.m = ((DataInputStream)object).readShort();
            this.n = ((DataInputStream)object).readShort();
            this.q = ((DataInputStream)object).readShort();
            this.k = new bx[n2][];
            for (int i2 = 0; i2 < n2; ++i2) {
                int n3 = ((DataInputStream)object).readByte();
                if (n3 <= 0) continue;
                this.k[i2] = new bx[n3];
                for (int i3 = 0; i3 < n3; ++i3) {
                    bx2 = new bx();
                    bx2.a((DataInputStream)object, true);
                    this.k[i2][i3] = bx2;
                }
            }
            this.d = ((DataInputStream)object).readShort();
            this.f = 0;
            this.e = System.currentTimeMillis();
        }
        try {
            ((FilterInputStream)object).close();
            return;
        }
        catch (IOException iOException) {
            return;
        }
        catch (IOException iOException) {
            try {
                IOException iOException2 = iOException;
                iOException.printStackTrace();
            }
            catch (Throwable throwable) {
                try {
                    ((FilterInputStream)object).close();
                }
                catch (IOException iOException3) {}
                throw throwable;
            }
            try {
                ((FilterInputStream)object).close();
                return;
            }
            catch (IOException iOException4) {
                return;
            }
        }
    }

    public final void a() {
    }
}


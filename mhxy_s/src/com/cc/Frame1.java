package com.cc;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

//bc
public final class Frame1 extends Frame {
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

    public Frame1(short var1, short var2, short var3) {
        super((byte) 2);
        this.a = var1;
        this.b = var2;
        this.c = var3;
    }

    public Frame1 copy() {
        Frame1 var1 = new Frame1((short) 0, (short) 0, (short) 0);
        var1.info = super.info;
        var1.d = this.d;
        var1.e = System.currentTimeMillis();
        var1.k = this.k;
        var1.g = this.g;
        var1.h = this.h;
        var1.l = this.l;
        var1.m = this.m;
        var1.n = this.n;
        var1.q = this.q;
        var1.i = this.i;
        var1.j = this.j;
        return var1;
    }

    public final Frame1 a(short var1, short var2, short var3) {
        Frame1 var6;
        (var6 = new Frame1(var1, var2, var3)).info = super.info;
        var6.d = this.d;
        var6.e = System.currentTimeMillis();
        var6.k = new bx[this.k.length][];

        for (int var7 = 0; var7 < this.k.length; ++var7) {
            var6.k[var7] = new bx[this.k[var7].length];

            for (int var8 = 0; var8 < this.k[var7].length; ++var8) {
                bx[] var10000 = var6.k[var7];
                bx var4 = this.k[var7][var8];
                bx var5;
                (var5 = new bx()).b = var4.b;
                var5.c = var4.c;
                var5.d = var4.d;
                var5.e = var4.e;
                var5.f = var4.f;
                var10000[var8] = var5;
            }
        }

        var6.g = this.g;
        var6.h = this.h;
        var6.l = this.l;
        var6.m = this.m;
        var6.n = this.n;
        var6.q = this.q;
        var6.i = this.i;
        var6.j = this.j;
        return var6;
    }

    public final short c() {
        return this.k != null && this.f < this.k.length ? this.l : 0;
    }

    public final short d() {
        return this.k != null && this.f < this.k.length ? this.m : 0;
    }

    public final short e() {
        return this.k != null && this.f < this.k.length ? this.n : 0;
    }

    public final short f() {
        return this.k != null && this.f < this.k.length ? this.q : 0;
    }

    public final short g() {
        return this.g != null ? this.g[this.f] : 0;
    }

    public final short h() {
        return this.h != null ? this.h[this.f] : 0;
    }

    public final short i() {
        return this.g != null ? this.g[0] : 0;
    }

    public final short j() {
        return this.h != null ? this.h[0] : 0;
    }

    protected final void a(byte[][] var1) {
        DataInputStream var15 = new DataInputStream(new ByteArrayInputStream(var1[0]));

        try {
            Object var2 = null;
            byte var3;
            if ((var3 = var15.readByte()) > 0) {
                this.l = var15.readShort();
                this.m = var15.readShort();
                this.n = var15.readShort();
                this.q = var15.readShort();
                this.k = new bx[var3][];

                for (int var4 = 0; var4 < var3; ++var4) {
                    byte var5;
                    if ((var5 = var15.readByte()) > 0) {
                        this.k[var4] = new bx[var5];

                        for (int var6 = 0; var6 < var5; ++var6) {
                            bx var16;
                            (var16 = new bx()).a(var15, true);
                            this.k[var4][var6] = var16;
                        }
                    }
                }

                this.d = var15.readShort();
                this.f = 0;
                this.e = System.currentTimeMillis();
            }

            return;
        } catch (IOException var13) {
            ((Throwable) var13).printStackTrace();
        } finally {
            try {
                var15.close();
            } catch (IOException var12) {
            }

        }

    }

    public final void a() {
    }
}

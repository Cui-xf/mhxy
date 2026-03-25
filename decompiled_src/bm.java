/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Font
 */
import javax.microedition.lcdui.Font;

public final class bm
extends al {
    private String a;
    private String b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k = 0xFFFFF00;
    private int l = 0xFFFFF00;
    private Font m = t.i;
    private Font n = t.i;

    public final void b(int n2) {
    }

    public final int b(int n2, int n3) {
        boolean bl2;
        boolean bl3;
        int n4 = n3;
        int n5 = n2;
        bm bm2 = this;
        if (n5 >= bm2.c && n5 <= bm2.c + bm2.e && n4 >= bm2.d && n4 <= bm2.d + bm2.f) {
            bm2.k = 0xFF0000;
            bm2.m = t.h;
            bl3 = true;
        } else {
            bm2.m = t.i;
            bm2.k = 0xFFFF00;
            bl3 = false;
        }
        if (bl3) {
            return 0x10000000;
        }
        n4 = n3;
        n5 = n2;
        bm2 = this;
        if (n5 >= bm2.g && n5 <= bm2.g + bm2.i && n4 >= bm2.h && n4 <= bm2.h + bm2.j) {
            bm2.l = 0xFF0000;
            bm2.n = t.h;
            bl2 = true;
        } else {
            bm2.n = t.i;
            bm2.l = 0xFFFF00;
            bl2 = false;
        }
        if (bl2) {
            return 0x20000000;
        }
        return 0;
    }

    public final void j() {
        this.a = null;
        this.b = null;
        this.m = null;
        this.n = null;
    }
}


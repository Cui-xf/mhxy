package defpackage;

import com.yinhan.kjava.main.a;
import java.io.DataInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import javax.microedition.lcdui.Graphics;

/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-8105993946875401281/classes.dex */
public final class as {
    private static int c;
    private static short d;
    private static String e;
    private static int[] f;
    private static short[] g;
    private static String[] h;
    private static byte[] i;
    private static String j;
    private static String k;
    public a a;
    private ao b;
    private int l;
    private int m;
    private int n;
    private int o;
    private int[][] p;

    public as(ao aoVar, a aVar, ai aiVar) {
        this.b = aoVar;
        this.a = aVar;
    }

    private void a() {
        if (k == null || k.equals("")) {
            this.a.at.a((String) null, t.i, (byte) 1);
        } else {
            this.a.at.a(k, t.i, (byte) 1);
        }
    }

    private void b() {
        if (j != null) {
            new bw(j, (short) t.i.stringWidth(j));
        }
    }

    private static void b(int i2) {
        if (bt.bC == null || bt.bC.size() <= 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= bt.bC.size()) {
                return;
            }
            bn bnVar = (bn) bt.bC.elementAt(i4);
            if (bnVar != null && bnVar.a == i2) {
                bnVar.v = (byte) (bnVar.v + 1);
            }
            i3 = i4 + 1;
        }
    }

    public final void a(int i2) {
        if (this.b.l == 0 && this.a.aq != null) {
            this.a.aq.b(i2);
        }
        if (i2 == 514 || i2 == 520 || i2 == 1 || i2 == 4) {
            return;
        }
        if (i2 != 268435456 && i2 != 1073741824 && i2 != 517) {
            if (i2 == 536870912) {
                this.b.m();
                return;
            }
            return;
        }
        c = -1;
        d = (short) -1;
        e = null;
        f = null;
        g = null;
        j = null;
        k = null;
        h = null;
        bt.N();
        a(true);
    }

    public final void a(DataInputStream dataInputStream) throws IOException {
        boolean z = c > 0;
        c = dataInputStream.readInt();
        dataInputStream.readUTF();
        d = dataInputStream.readShort();
        e = dataInputStream.readUTF();
        int i2 = dataInputStream.readByte();
        if (i2 > 0) {
            f = new int[i2];
            g = new short[i2];
            i = new byte[i2];
            h = new String[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                f[i3] = dataInputStream.readInt();
                g[i3] = dataInputStream.readShort();
                h[i3] = dataInputStream.readUTF();
                i[i3] = dataInputStream.readByte();
            }
        } else {
            f = null;
            g = null;
            i = null;
        }
        j = dataInputStream.readUTF();
        k = dataInputStream.readUTF();
        bt.N();
        b(c);
        if (f != null && f.length > 0) {
            for (int i4 = 0; i4 < f.length; i4++) {
                b(f[i4]);
            }
        }
        if (z) {
            a();
        }
        b();
    }

    public final void a(Graphics graphics) {
        if (this.b.l != 0 || this.a.aq == null) {
            return;
        }
        this.a.aq.a(graphics);
    }

    public final void a(boolean z) {
        if (z) {
            this.n = 0;
            this.o = 0;
        }
        if (c != -1) {
            this.b.a(new short[]{d});
        }
        if (g != null) {
            this.b.a(g);
        }
        if (this.p != null) {
            for (int i2 = 0; i2 < this.p.length; i2++) {
                if (this.p[i2] != null) {
                    this.p[i2] = null;
                }
            }
            this.p = null;
        }
        this.p = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 4, 4);
        this.a.aq.b();
        this.a.aq.a("装备升星");
        this.a.aq.a(false);
        this.l = Math.max((t.j << 1) + 25, 59);
        this.m = t.j + 13;
        this.a.aq.a(this.l + this.m);
        a();
        this.a.aq.a(this.a.at);
        this.a.au.a("确定");
        if (t.c > 220) {
            this.a.aq.a(this.a.au);
        }
        this.a.aq.a(t.f, t.g, t.d, t.e);
        b();
        ca.l = 0;
        this.b.l = (short) 0;
        this.a.j = this.a.k;
        ao aoVar = this.b;
        this.b.k = (short) 102;
        aoVar.j = (short) 102;
    }
}

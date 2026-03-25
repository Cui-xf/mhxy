/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import com.yinhan.kjava.main.a;
import java.io.DataInputStream;
import javax.microedition.lcdui.Graphics;

public final class as {
    private ao b;
    public a a;
    private static int c;
    private static short d;
    private static String e;
    private static int[] f;
    private static short[] g;
    private static String[] h;
    private static byte[] i;
    private static String j;
    private static String k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int[][] p;

    public as(ao ao2, a a2, ai ai2) {
        this.b = ao2;
        this.a = a2;
    }

    public final void a(DataInputStream dataInputStream) {
        int n2;
        boolean bl2 = false;
        if (c > 0) {
            bl2 = true;
        }
        c = dataInputStream.readInt();
        dataInputStream.readUTF();
        d = dataInputStream.readShort();
        e = dataInputStream.readUTF();
        int n3 = dataInputStream.readByte();
        if (n3 > 0) {
            f = new int[n3];
            g = new short[n3];
            i = new byte[n3];
            h = new String[n3];
            for (n2 = 0; n2 < n3; ++n2) {
                as.f[n2] = dataInputStream.readInt();
                as.g[n2] = dataInputStream.readShort();
                as.h[n2] = dataInputStream.readUTF();
                as.i[n2] = dataInputStream.readByte();
            }
        } else {
            f = null;
            g = null;
            i = null;
        }
        j = dataInputStream.readUTF();
        k = dataInputStream.readUTF();
        bt.N();
        as.b(c);
        if (f != null && f.length > 0) {
            for (n2 = 0; n2 < f.length; ++n2) {
                as.b(f[n2]);
            }
        }
        if (bl2) {
            this.a();
        }
        this.b();
    }

    public final void a(boolean bl2) {
        if (bl2) {
            this.n = 0;
            this.o = 0;
        }
        if (c != -1) {
            this.b.a(new short[]{d});
        }
        if (g != null) {
            this.b.a(g);
        }
        as as2 = this;
        if (as2.p != null) {
            for (int i2 = 0; i2 < as2.p.length; ++i2) {
                if (as2.p[i2] == null) continue;
                as2.p[i2] = null;
            }
            as2.p = null;
        }
        this.p = new int[4][4];
        this.a.aq.b();
        this.a.aq.a("\u88c5\u5907\u5347\u661f");
        this.a.aq.a(false);
        this.l = Math.max((t.j << 1) + 25, 59);
        this.m = t.j + 13;
        this.a.aq.a(this.l + this.m);
        this.a();
        this.a.aq.a(this.a.at);
        this.a.au.a("\u786e\u5b9a");
        if (t.c > 220) {
            this.a.aq.a(this.a.au);
        }
        this.a.aq.a(t.f, t.g, t.d, t.e);
        this.b();
        ca.l = 0;
        this.b.l = 0;
        this.a.j = this.a.k;
        this.b.k = (short)102;
        this.b.j = (short)102;
    }

    private void a() {
        if (k != null && !k.equals("")) {
            this.a.at.a(k, t.i, (byte)1);
            return;
        }
        this.a.at.a(null, t.i, (byte)1);
    }

    private void b() {
        if (j != null) {
            new bw(j, (short)t.i.stringWidth(j));
        }
    }

    public final void a(int n2) {
        if (this.b.l == 0 && this.a.aq != null) {
            this.a.aq.b(n2);
        }
        if (n2 == 514 || n2 == 520 || n2 == 1 || n2 == 4) {
            return;
        }
        if (n2 == 0x10000000 || n2 == 0x40000000 || n2 == 517) {
            as as2 = this;
            c = -1;
            d = (short)-1;
            e = null;
            f = null;
            g = null;
            j = null;
            k = null;
            h = null;
            bt.N();
            this.a(true);
            return;
        }
        if (n2 == 0x20000000) {
            this.b.m();
        }
    }

    public final void a(Graphics graphics) {
        if (this.b.l == 0 && this.a.aq != null) {
            this.a.aq.a(graphics);
        }
    }

    private static void b(int n2) {
        if (bt.bC == null || bt.bC.size() <= 0) {
            return;
        }
        bn bn2 = null;
        for (int i2 = 0; i2 < bt.bC.size(); ++i2) {
            bn2 = (bn)bt.bC.elementAt(i2);
            if (bn2 == null || bn2.a != n2) continue;
            bn2.v = (byte)(bn2.v + 1);
        }
    }
}


package p000;

import com.yinhan.kjava.main.RunnableC0066a;
import java.io.DataInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import javax.microedition.lcdui.Graphics;

/* renamed from: as */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-5080095226433994817/classes.dex */
public final class C0019as {

    /* renamed from: c */
    private static int f406c;

    /* renamed from: d */
    private static short f407d;

    /* renamed from: e */
    private static String f408e;

    /* renamed from: f */
    private static int[] f409f;

    /* renamed from: g */
    private static short[] f410g;

    /* renamed from: h */
    private static String[] f411h;

    /* renamed from: i */
    private static byte[] f412i;

    /* renamed from: j */
    private static String f413j;

    /* renamed from: k */
    private static String f414k;

    /* renamed from: a */
    public RunnableC0066a f415a;

    /* renamed from: b */
    private C0015ao f416b;

    /* renamed from: l */
    private int f417l;

    /* renamed from: m */
    private int f418m;

    /* renamed from: n */
    private int f419n;

    /* renamed from: o */
    private int f420o;

    /* renamed from: p */
    private int[][] f421p;

    public C0019as(C0015ao c0015ao, RunnableC0066a runnableC0066a, C0009ai c0009ai) {
        this.f416b = c0015ao;
        this.f415a = runnableC0066a;
    }

    /* renamed from: a */
    private void m571a() {
        if (f414k == null || f414k.equals("")) {
            this.f415a.f2152at.m77a((String) null, C0088t.f2523i, (byte) 1);
        } else {
            this.f415a.f2152at.m77a(f414k, C0088t.f2523i, (byte) 1);
        }
    }

    /* renamed from: b */
    private void m572b() {
        if (f413j != null) {
            new C0050bw(f413j, (short) C0088t.f2523i.stringWidth(f413j));
        }
    }

    /* renamed from: b */
    private static void m573b(int i) {
        if (C0047bt.f891bC == null || C0047bt.f891bC.size() <= 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= C0047bt.f891bC.size()) {
                return;
            }
            C0041bn c0041bn = (C0041bn) C0047bt.f891bC.elementAt(i3);
            if (c0041bn != null && c0041bn.f714a == i) {
                c0041bn.f735v = (byte) (c0041bn.f735v + 1);
            }
            i2 = i3 + 1;
        }
    }

    /* renamed from: a */
    public final void m574a(int i) {
        if (this.f416b.f359l == 0 && this.f415a.f2149aq != null) {
            this.f415a.f2149aq.mo70b(i);
        }
        if (i == 514 || i == 520 || i == 1 || i == 4) {
            return;
        }
        if (i != 268435456 && i != 1073741824 && i != 517) {
            if (i == 536870912) {
                this.f416b.m473m();
                return;
            }
            return;
        }
        f406c = -1;
        f407d = (short) -1;
        f408e = null;
        f409f = null;
        f410g = null;
        f413j = null;
        f414k = null;
        f411h = null;
        C0047bt.m784N();
        m577a(true);
    }

    /* renamed from: a */
    public final void m575a(DataInputStream dataInputStream) throws IOException {
        boolean z = f406c > 0;
        f406c = dataInputStream.readInt();
        dataInputStream.readUTF();
        f407d = dataInputStream.readShort();
        f408e = dataInputStream.readUTF();
        int i = dataInputStream.readByte();
        if (i > 0) {
            f409f = new int[i];
            f410g = new short[i];
            f412i = new byte[i];
            f411h = new String[i];
            for (int i2 = 0; i2 < i; i2++) {
                f409f[i2] = dataInputStream.readInt();
                f410g[i2] = dataInputStream.readShort();
                f411h[i2] = dataInputStream.readUTF();
                f412i[i2] = dataInputStream.readByte();
            }
        } else {
            f409f = null;
            f410g = null;
            f412i = null;
        }
        f413j = dataInputStream.readUTF();
        f414k = dataInputStream.readUTF();
        C0047bt.m784N();
        m573b(f406c);
        if (f409f != null && f409f.length > 0) {
            for (int i3 = 0; i3 < f409f.length; i3++) {
                m573b(f409f[i3]);
            }
        }
        if (z) {
            m571a();
        }
        m572b();
    }

    /* renamed from: a */
    public final void m576a(Graphics graphics) {
        if (this.f416b.f359l != 0 || this.f415a.f2149aq == null) {
            return;
        }
        this.f415a.f2149aq.m1602a(graphics);
    }

    /* renamed from: a */
    public final void m577a(boolean z) {
        if (z) {
            this.f419n = 0;
            this.f420o = 0;
        }
        if (f406c != -1) {
            this.f416b.m401a(new short[]{f407d});
        }
        if (f410g != null) {
            this.f416b.m401a(f410g);
        }
        if (this.f421p != null) {
            for (int i = 0; i < this.f421p.length; i++) {
                if (this.f421p[i] != null) {
                    this.f421p[i] = null;
                }
            }
            this.f421p = null;
        }
        this.f421p = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 4, 4);
        this.f415a.f2149aq.m1604b();
        this.f415a.f2149aq.m1601a("装备升星");
        this.f415a.f2149aq.m1603a(false);
        this.f417l = Math.max((C0088t.f2524j << 1) + 25, 59);
        this.f418m = C0088t.f2524j + 13;
        this.f415a.f2149aq.m1597a(this.f417l + this.f418m);
        m571a();
        this.f415a.f2149aq.m1600a(this.f415a.f2152at);
        this.f415a.f2153au.m1590a("确定");
        if (C0088t.f2517c > 220) {
            this.f415a.f2149aq.m1600a(this.f415a.f2153au);
        }
        this.f415a.f2149aq.m1598a(C0088t.f2520f, C0088t.f2521g, C0088t.f2518d, C0088t.f2519e);
        m572b();
        C0055ca.f1892l = 0;
        this.f416b.f359l = (short) 0;
        this.f415a.f2216j = this.f415a.f2217k;
        C0015ao c0015ao = this.f416b;
        this.f416b.f358k = (short) 102;
        c0015ao.f357j = (short) 102;
    }
}

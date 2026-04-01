package p000;

import com.yinhan.kjava.main.C0068c;
import com.yinhan.kjava.main.RunnableC0066a;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Vector;

/* renamed from: q */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-5080095226433994817/classes.dex */
public final class C0085q {

    /* renamed from: a */
    private RunnableC0066a f2438a;

    /* renamed from: b */
    private DataInputStream f2439b;

    /* renamed from: c */
    private ByteArrayInputStream f2440c;

    /* renamed from: e */
    private int f2442e;

    /* renamed from: f */
    private int f2443f;

    /* renamed from: g */
    private int f2444g;

    /* renamed from: h */
    private int f2445h;

    /* renamed from: j */
    private C0039bl[] f2447j;

    /* renamed from: d */
    private short f2441d = -1;

    /* renamed from: i */
    private Vector f2446i = new Vector();

    /* renamed from: a */
    private static C0046bs m1647a(Vector vector, C0046bs c0046bs) {
        C0046bs c0046bs2 = null;
        int i = 0;
        while (i < vector.size()) {
            C0046bs c0046bs3 = (C0046bs) vector.elementAt(i);
            if (c0046bs2 != null && c0046bs2.m756a(c0046bs) <= c0046bs3.m756a(c0046bs)) {
                c0046bs3 = c0046bs2;
            }
            i++;
            c0046bs2 = c0046bs3;
        }
        return c0046bs2;
    }

    /* renamed from: a */
    private void m1648a() {
        C0047bt.f811C = new byte[this.f2439b.readByte()];
        for (byte b = 0; b < C0047bt.f811C.length; b = (byte) (b + 1)) {
            C0047bt.f811C[b] = this.f2439b.readByte();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:161:0x020d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01bb A[Catch: Exception -> 0x02f2, TryCatch #0 {Exception -> 0x02f2, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x000c, B:9:0x0015, B:11:0x0020, B:13:0x0024, B:14:0x002a, B:16:0x002f, B:17:0x003e, B:19:0x0042, B:21:0x004d, B:23:0x0054, B:25:0x0058, B:66:0x0153, B:68:0x0158, B:69:0x0160, B:72:0x0167, B:73:0x017b, B:75:0x017e, B:77:0x0182, B:80:0x0187, B:82:0x018c, B:84:0x0192, B:86:0x01a0, B:88:0x01bb, B:90:0x01cd, B:92:0x01d1, B:94:0x01d5, B:97:0x01db, B:99:0x01ec, B:102:0x01ff, B:104:0x0204, B:106:0x0211, B:105:0x020d, B:27:0x005e, B:30:0x0064, B:32:0x0069, B:34:0x006f, B:37:0x0082, B:40:0x0098, B:43:0x00ae, B:46:0x00c4, B:48:0x00cd, B:50:0x00d3, B:52:0x00f5, B:54:0x0108, B:56:0x0116, B:57:0x0120, B:59:0x0126, B:64:0x0130, B:129:0x02a4, B:116:0x022a, B:117:0x024c, B:119:0x0252, B:124:0x025c, B:128:0x0282, B:130:0x02a9, B:136:0x02c7, B:139:0x02cd, B:141:0x02d0, B:143:0x02e2, B:145:0x02e5, B:146:0x02ed, B:132:0x02af, B:134:0x02b2), top: B:154:0x0000 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m1649a(java.io.DataInputStream r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 774
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0085q.m1649a(java.io.DataInputStream):void");
    }

    /* renamed from: a */
    private static boolean m1650a(Vector vector, int i, int i2) {
        for (int i3 = 0; i3 < vector.size(); i3++) {
            if (i == ((C0046bs) vector.elementAt(i3)).f806a && i2 == ((C0046bs) vector.elementAt(i3)).f807b) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m1651b() {
        C0047bt.m894c(this.f2439b);
        if (RunnableC0066a.f2113e != null && RunnableC0066a.f2113e.f181I != null) {
            if (C0088t.f2529o && this.f2438a.f2146aj != null) {
                if (!RunnableC0066a.f2113e.f181I.f17c.isEmpty()) {
                    RunnableC0066a.f2113e.f181I.f17c.removeAllElements();
                    RunnableC0066a.f2113e.f181I.m19b();
                }
                if (this.f2438a.f2146aj != null) {
                    this.f2438a.f2146aj.f2233c = 0;
                    this.f2438a.f2146aj.f2234d = 0;
                }
                this.f2438a.f2159b = 0;
                this.f2438a.f2126a = 0;
            }
            RunnableC0066a.f2113e.f181I.f402j = C0047bt.f881at;
            RunnableC0066a.f2113e.f181I.f403k = C0047bt.f882au;
        }
        if (C0047bt.f933bs == 0 && C0047bt.f1683q != null && C0047bt.f1765s == 0) {
            for (int i = 0; i < C0047bt.f1683q.length; i++) {
                C0047bt.f1683q[i].f398f.removeAllElements();
                if (C0047bt.f1683q[i].f402j == -1 && C0047bt.f1683q[i].f403k == -1) {
                    C0047bt.f1683q[i].f402j = C0047bt.f881at;
                    C0047bt.f1683q[i].f403k = C0047bt.f882au;
                }
                C0047bt.f1683q[i].f404l = C0047bt.f881at;
                C0047bt.f1683q[i].f405m = C0047bt.f882au;
            }
        }
        if (RunnableC0066a.f2113e == null) {
            this.f2438a.m1453g();
            RunnableC0066a.f2113e.f181I.m21d();
            return;
        }
        if (RunnableC0066a.f2113e != null) {
            RunnableC0066a.f2113e.f181I.m13a((int) C0047bt.f883av);
        }
        if (RunnableC0066a.f2113e.f195Y != C0047bt.f879ar || RunnableC0066a.f2113e.f181I.m25h()) {
            if (C0047bt.f933bs == -1) {
                RunnableC0066a.f2113e.f218aY = 0L;
            }
            if (RunnableC0066a.f2113e.f181I.f396d != null) {
                RunnableC0066a.f2113e.f181I.f396d.f435e.removeAllElements();
                RunnableC0066a.f2113e.f181I.f396d.f438h = C0047bt.f881at;
                RunnableC0066a.f2113e.f181I.f396d.f439i = C0047bt.f882au;
                RunnableC0066a.f2113e.f181I.f396d.f440j = RunnableC0066a.f2113e.f181I.f400h;
                RunnableC0066a.f2113e.f181I.f396d.m583a(RunnableC0066a.f2113e.f181I.f400h);
            }
            if (C0015ao.m310i()) {
                if (RunnableC0066a.f2113e.f195Y != C0047bt.f879ar) {
                    RunnableC0066a.f2113e.m445e();
                } else {
                    RunnableC0066a.f2113e.m452f();
                }
                RunnableC0066a.f2113e.f181I.m26i();
                RunnableC0066a.f2113e.f195Y = C0047bt.f879ar;
            }
            RunnableC0066a.f2113e.f181I.m21d();
            return;
        }
        if (C0047bt.f933bs == 0 && C0047bt.f1683q != null && C0047bt.f1765s == 0) {
            RunnableC0066a runnableC0066a = this.f2438a;
            Vector vector = new Vector();
            this.f2442e = (C0047bt.f1683q[0].f402j % 16 == 0 ? 0 : 1) + (C0047bt.f1683q[0].f402j / 16);
            this.f2443f = (C0047bt.f1683q[0].f403k % 16 == 0 ? 0 : 1) + (C0047bt.f1683q[0].f403k / 16);
            this.f2444g = (C0047bt.f1683q[0].f404l % 16 == 0 ? 0 : 1) + (C0047bt.f1683q[0].f404l / 16);
            this.f2445h = (C0047bt.f1683q[0].f405m % 16 == 0 ? 0 : 1) + (C0047bt.f1683q[0].f405m / 16);
            if (this.f2442e == this.f2444g && this.f2443f == this.f2445h) {
                return;
            }
            if (C0047bt.f1683q[0].f398f == null) {
                C0047bt.f1683q[0].f398f = new Vector();
            }
            Vector vectorM1659a = m1659a(RunnableC0066a.f2113e.f355f, vector, new C0046bs(this.f2442e, this.f2443f), new C0046bs(this.f2444g, this.f2445h));
            int size = vectorM1659a.size();
            for (int i2 = 0; i2 < C0047bt.f1683q.length; i2++) {
                C0047bt.f1683q[i2].f398f.removeAllElements();
                int i3 = 0;
                while (i3 < size) {
                    C0046bs c0046bs = (C0046bs) vectorM1659a.elementAt(i3);
                    C0046bs c0046bs2 = i3 < size + (-1) ? (C0046bs) vectorM1659a.elementAt(i3 + 1) : c0046bs;
                    if (c0046bs.f806a != c0046bs2.f806a) {
                        if (c0046bs.f806a > c0046bs2.f806a) {
                            for (int i4 = 0; i4 < 4; i4++) {
                                C0047bt.f1683q[i2].f398f.addElement(new short[]{(short) ((c0046bs.f806a << 4) - (i4 << 2)), (short) (c0046bs.f807b << 4)});
                            }
                        } else {
                            for (int i5 = 0; i5 < 4; i5++) {
                                C0047bt.f1683q[i2].f398f.addElement(new short[]{(short) ((c0046bs.f806a << 4) + (i5 << 2)), (short) (c0046bs.f807b << 4)});
                            }
                        }
                    } else if (c0046bs.f807b != c0046bs2.f807b) {
                        if (c0046bs.f807b > c0046bs2.f807b) {
                            for (int i6 = 0; i6 < 4; i6++) {
                                C0047bt.f1683q[i2].f398f.addElement(new short[]{(short) (c0046bs.f806a << 4), (short) ((c0046bs.f807b << 4) - (i6 << 2))});
                            }
                        } else {
                            for (int i7 = 0; i7 < 4; i7++) {
                                C0047bt.f1683q[i2].f398f.addElement(new short[]{(short) (c0046bs.f806a << 4), (short) ((c0046bs.f807b << 4) + (i7 << 2))});
                            }
                        }
                    }
                    i3++;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /* renamed from: b */
    private static void m1652b(DataInputStream dataInputStream) throws IOException {
        long j = dataInputStream.readLong();
        if (C0044bq.f765g > 0 && C0047bt.f1768v <= 0) {
            C0047bt.f1768v = j;
            C0044bq.f765g = -1;
        }
        short s = dataInputStream.readShort();
        if (s > 0) {
            for (short s2 = 0; s2 < s; s2++) {
                int i = dataInputStream.readShort();
                if (i > 0) {
                    C0077i[] c0077iArr = new C0077i[i];
                    for (int i2 = 0; i2 < i; i2++) {
                        c0077iArr[i2] = new C0077i();
                        C0077i c0077i = c0077iArr[i2];
                        c0077i.f2275a = dataInputStream.readByte();
                        c0077i.f2276b = dataInputStream.readByte();
                        dataInputStream.readByte();
                        c0077i.f2277c = dataInputStream.readByte();
                        c0077i.f2278d = dataInputStream.readByte();
                        c0077i.f2279e = dataInputStream.readShort();
                        c0077i.f2280f = dataInputStream.readUTF();
                    }
                    RunnableC0066a.f2113e.f356g.m749a(c0077iArr);
                }
            }
            for (int i3 = 0; i3 < s; i3++) {
                int i4 = dataInputStream.readShort();
                if (i4 > 0) {
                    C0005ae[] c0005aeArr = new C0005ae[i4];
                    for (int i5 = 0; i5 < i4; i5++) {
                        c0005aeArr[i5] = new C0005ae();
                        C0005ae c0005ae = c0005aeArr[i5];
                        c0005ae.f39f = 0;
                        c0005ae.f34a = dataInputStream.readByte();
                        c0005ae.f35b = dataInputStream.readByte();
                        c0005ae.f36c = dataInputStream.readByte();
                        c0005ae.f37d = dataInputStream.readInt();
                        c0005ae.f40g = dataInputStream.readInt();
                        c0005ae.f42i = dataInputStream.readInt();
                        c0005ae.f38e = dataInputStream.readInt();
                        c0005ae.f41h = dataInputStream.readInt();
                        c0005ae.f43j = dataInputStream.readInt();
                        c0005ae.f44k = dataInputStream.readByte();
                    }
                    RunnableC0066a.f2113e.f356g.m748a(c0005aeArr);
                }
            }
            for (int i6 = 0; i6 < s; i6++) {
                RunnableC0066a.f2113e.f356g.m747a(dataInputStream.readUTF());
            }
            if (RunnableC0066a.f2113e.f358k == 25 || RunnableC0066a.f2113e.f358k == 18 || !C0015ao.m310i()) {
                RunnableC0066a.f2113e.f356g.f787f = (short) 1;
            }
        }
    }

    /* renamed from: b */
    private static boolean m1653b(Vector vector, int i, int i2) {
        for (int i3 = 0; i3 < vector.size(); i3++) {
            if (i == ((C0046bs) vector.elementAt(i3)).f806a && i2 == ((C0046bs) vector.elementAt(i3)).f807b) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private void m1654c() {
        boolean z = this.f2439b.readByte() == 1;
        C0047bt.f893bE = z;
        if (z) {
            C0047bt.f894bF = this.f2439b.readInt();
        } else {
            C0047bt.f894bF = -1;
        }
        C0047bt.f895bG = this.f2439b.readInt();
        C0047bt.f896bH = this.f2439b.readUTF();
        if (C0047bt.f893bE) {
            RunnableC0066a.f2113e.f358k = (short) 2;
        }
        if (RunnableC0066a.f2113e.f358k != 2) {
            if (RunnableC0066a.f2113e.f358k == 6) {
                this.f2438a.m1442b("不处理");
                return;
            }
            return;
        }
        C0015ao.f140K = new C0050bw(C0047bt.f896bH, (short) (C0088t.f2516b - 20));
        if (C0047bt.f893bE) {
            RunnableC0066a.f2113e.f227an = new String[]{"接受", "返回"};
        } else if (C0047bt.f899bK[RunnableC0066a.f2113e.f223ai] == -1) {
            RunnableC0066a.f2113e.f227an = new String[]{"接受", "返回"};
        } else if (C0047bt.f899bK[RunnableC0066a.f2113e.f223ai] == 0) {
            RunnableC0066a.f2113e.f227an = new String[]{"确定", "返回"};
        } else if (C0047bt.f899bK[RunnableC0066a.f2113e.f223ai] == 1) {
            RunnableC0066a.f2113e.f227an = new String[]{"提交", "返回"};
        }
        C0055ca.m1286a(RunnableC0066a.f2067F, C0015ao.f140K, RunnableC0066a.f2113e.f227an, (String[]) null, true);
        this.f2438a.f2216j = this.f2438a.f2217k;
        RunnableC0066a.f2113e.f359l = (short) 1;
    }

    /* renamed from: c */
    private static void m1655c(DataInputStream dataInputStream) throws IOException {
        C0047bt.m866am(dataInputStream);
        RunnableC0066a.f2113e.m472l((byte) 1);
    }

    /* renamed from: d */
    private void m1656d() throws IOException {
        C0047bt.m775I(this.f2439b);
        if (RunnableC0066a.f2113e == null || !C0015ao.m310i()) {
            return;
        }
        if (RunnableC0066a.f2113e.f358k != 13) {
            if (RunnableC0066a.f2113e.f358k == 36) {
                RunnableC0066a.f2113e.m426b(false);
                return;
            }
            if (RunnableC0066a.f2113e.f358k == 96 && RunnableC0066a.f2113e.f229ap) {
                RunnableC0066a.f2113e.m470k(RunnableC0066a.f2113e.f200aE);
                RunnableC0066a.f2113e.f229ap = false;
                return;
            } else if (RunnableC0066a.f2113e.f358k == 4 && RunnableC0066a.f2113e.f271bh) {
                RunnableC0066a.f2113e.m485s(RunnableC0066a.f2113e.f270bg);
                return;
            } else {
                if (RunnableC0066a.f2113e.f358k == 120) {
                    RunnableC0066a.f2113e.m487t(this.f2438a.f2150ar.m1275g());
                    return;
                }
                return;
            }
        }
        if (C0047bt.f1101fA == null) {
            C0047bt.m760B();
            this.f2438a.m1442b("您没有宠物！");
            return;
        }
        if (RunnableC0066a.f2113e.f359l == 6) {
            RunnableC0066a.f2113e.m470k(RunnableC0066a.f2113e.f200aE);
            return;
        }
        if (RunnableC0066a.f2113e.f359l == 8) {
            if (this.f2438a.f2216j != 2) {
                this.f2438a.f2216j = this.f2438a.f2217k;
                return;
            }
            return;
        }
        if (C0083o.f2381e == 1) {
            if (this.f2438a.f2216j != 2) {
                this.f2438a.f2216j = this.f2438a.f2217k;
                return;
            }
            return;
        }
        RunnableC0066a.f2113e.m467j(RunnableC0066a.f2113e.f232as);
        if (this.f2438a.f2216j != 2) {
            this.f2438a.f2216j = this.f2438a.f2217k;
        }
    }

    /* renamed from: e */
    private void m1657e() throws IOException {
        int i = this.f2439b.readByte();
        if (i <= 0) {
            if (RunnableC0066a.f2113e != null) {
                RunnableC0066a.f2113e.m399a((C0043bp[]) null);
                return;
            }
            return;
        }
        C0047bt.f1765s = this.f2439b.readByte();
        C0043bp[] c0043bpArr = new C0043bp[i];
        byte b = 1;
        for (int i2 = 0; i2 < i; i2++) {
            c0043bpArr[i2] = new C0043bp();
            c0043bpArr[i2].m704a(RunnableC0066a.f2113e, this.f2439b);
            if (c0043bpArr[i2].f753s == 1) {
                c0043bpArr[i2].f745a = (byte) 0;
            } else {
                c0043bpArr[i2].f745a = b;
                b = (byte) (b + 1);
            }
        }
        for (int i3 = 0; i3 < c0043bpArr.length - 1; i3++) {
            for (int i4 = 0; i4 < c0043bpArr.length - 1; i4++) {
                C0043bp c0043bp = c0043bpArr[i4];
                C0043bp c0043bp2 = c0043bpArr[i4 + 1];
                if (c0043bp2.f745a < c0043bp.f745a) {
                    c0043bpArr[i4] = c0043bp2;
                    c0043bpArr[i4 + 1] = c0043bp;
                }
            }
        }
        if (RunnableC0066a.f2113e != null) {
            RunnableC0066a.f2113e.m399a(c0043bpArr);
        }
    }

    /* renamed from: f */
    private void m1658f() throws IOException {
        byte b = this.f2439b.readByte();
        if (C0047bt.f1138fl != null) {
            C0047bt.m945v();
        }
        if (C0047bt.f1145fs != null) {
            C0047bt.m947w();
        }
        C0047bt.f1149fw = null;
        C0047bt.m951y();
        C0047bt.m953z();
        C0047bt.f1133fg = 0L;
        C0047bt.f1140fn = 0L;
        RunnableC0066a.f2113e.f226am = null;
        RunnableC0066a.f2113e.f225al = null;
        if (C0015ao.m310i()) {
            RunnableC0066a.f2114f.m57a(RunnableC0066a.f2113e.f355f, C0015ao.f167h, C0015ao.f168i, true, false, 2109231);
            RunnableC0066a runnableC0066a = this.f2438a;
            this.f2438a.f2217k = (short) 7;
            runnableC0066a.f2216j = (short) 7;
            C0015ao c0015ao = RunnableC0066a.f2113e;
            RunnableC0066a.f2113e.f358k = (short) 0;
            c0015ao.f357j = (short) 0;
        }
        if (b == 1) {
            this.f2438a.m1442b("交易成功!");
        } else if (b == 0) {
            this.f2438a.m1442b("交易取消!");
        } else if (b == -1) {
            this.f2438a.m1442b(this.f2439b.readUTF());
        }
    }

    /* renamed from: a */
    public final Vector m1659a(C0023aw c0023aw, Vector vector, C0046bs c0046bs, C0046bs c0046bs2) {
        if (c0023aw != null && vector != null) {
            if (c0023aw.f464i != null) {
                Vector vector2 = new Vector();
                vector.removeAllElements();
                vector.addElement(c0046bs);
                boolean z = false;
                while (!vector.isEmpty()) {
                    C0046bs c0046bsM1647a = m1647a(vector, c0046bs2);
                    boolean z2 = c0046bsM1647a.m757b(c0046bs2) ? true : z;
                    if (z2) {
                        vector2.removeAllElements();
                        vector2.addElement(c0046bs2);
                        C0046bs c0046bsM1647a2 = m1647a(vector, c0046bs2);
                        while (!c0046bsM1647a2.m757b(c0046bs)) {
                            c0046bsM1647a2 = c0046bsM1647a2.f808c;
                            vector2.addElement(c0046bsM1647a2);
                        }
                        return vector2;
                    }
                    vector.removeElement(c0046bsM1647a);
                    vector2.addElement(c0046bsM1647a);
                    C0046bs[] c0046bsArr = {new C0046bs(c0046bsM1647a.f806a, c0046bsM1647a.f807b - 1), new C0046bs(c0046bsM1647a.f806a, c0046bsM1647a.f807b + 1), new C0046bs(c0046bsM1647a.f806a - 1, c0046bsM1647a.f807b), new C0046bs(c0046bsM1647a.f806a + 1, c0046bsM1647a.f807b)};
                    for (int i = 0; i < c0046bsArr.length; i++) {
                        if ((c0046bsArr[i].f806a != c0046bsM1647a.f806a || c0046bsArr[i].f807b != c0046bsM1647a.f807b) && c0046bsArr[i].f806a >= 0) {
                            if (c0046bsArr[i].f806a < (c0023aw.f456a % 16 == 0 ? 0 : 1) + (c0023aw.f456a / 16) + 1 && c0046bsArr[i].f807b >= 0) {
                                if (c0046bsArr[i].f807b < (c0023aw.f457b % 16 == 0 ? 0 : 1) + (c0023aw.f457b / 16) + 1 && !m1650a(vector, c0046bsArr[i].f806a, c0046bsArr[i].f807b) && !m1653b(vector2, c0046bsArr[i].f806a, c0046bsArr[i].f807b) && RunnableC0066a.f2114f.m52a(c0023aw, (c0046bsArr[i].f806a << 4) + 8, c0046bsArr[i].f807b << 4) == 0 && !RunnableC0066a.f2114f.m68a((c0046bsArr[i].f806a << 4) + 8, c0046bsArr[i].f807b << 4)) {
                                    vector.addElement(new C0046bs(c0046bsArr[i].f806a, c0046bsArr[i].f807b, c0046bsM1647a));
                                }
                            }
                        }
                    }
                    z = z2;
                }
                return new Vector();
            }
        }
        return new Vector();
    }

    /* renamed from: a */
    public final void m1660a(RunnableC0066a runnableC0066a) {
        this.f2438a = runnableC0066a;
    }

    /* renamed from: a */
    public final void m1661a(C0091w c0091w) {
        try {
            if (c0091w == null) {
                return;
            }
            try {
                this.f2441d = c0091w.m1709a();
                if (this.f2441d != 8192) {
                    if (c0091w.f2564b == null) {
                        if (c0091w != null) {
                            this.f2441d = c0091w.m1709a();
                        }
                        try {
                            if (this.f2439b != null) {
                                this.f2439b.close();
                            }
                            if (this.f2440c != null) {
                                this.f2440c.close();
                                return;
                            }
                            return;
                        } catch (IOException e) {
                            e.printStackTrace();
                            return;
                        }
                    }
                    this.f2440c = new ByteArrayInputStream(c0091w.f2564b);
                    this.f2439b = new DataInputStream(this.f2440c);
                }
                switch (this.f2441d) {
                    case 8192:
                        if (c0091w.f2565c != null) {
                            while (c0091w.f2565c.size() > 0) {
                                m1661a((C0091w) c0091w.f2565c.elementAt(0));
                                c0091w.f2565c.removeElementAt(0);
                            }
                            break;
                        }
                        break;
                    case 8193:
                        C0047bt.m948w(this.f2439b);
                        if (C0047bt.f1049eB == 53) {
                            if (RunnableC0066a.f2113e.f356g != null) {
                                RunnableC0066a.f2113e.f356g.m751d();
                                C0015ao c0015ao = RunnableC0066a.f2113e;
                                RunnableC0066a.f2113e.f358k = (short) 0;
                                c0015ao.f357j = (short) 0;
                                this.f2438a.m1442b(C0088t.f2504Y[C0047bt.f1049eB]);
                                break;
                            }
                        } else if (C0047bt.f1049eB == 48) {
                            if (RunnableC0066a.f2113e.f356g != null) {
                                RunnableC0066a.f2113e.f356g.f787f = (short) -2;
                                break;
                            } else {
                                this.f2438a.m1442b(C0088t.f2504Y[C0047bt.f1049eB]);
                                break;
                            }
                        } else if (C0047bt.f1049eB != -2) {
                            if (RunnableC0066a.f2113e == null || RunnableC0066a.f2113e.f356g == null || RunnableC0066a.f2113e.f356g.f787f != -1 || C0047bt.f1050eC == null || !C0047bt.f1050eC.startsWith("等待他人操作")) {
                                if (C0047bt.f1050eC != null) {
                                    this.f2438a.m1442b(C0047bt.f1050eC);
                                    break;
                                } else {
                                    this.f2438a.m1442b(C0088t.f2504Y[C0047bt.f1049eB >= 0 ? C0047bt.f1049eB : (byte) 0]);
                                    break;
                                }
                            }
                        } else if (RunnableC0066a.f2113e.f358k == 111 && RunnableC0066a.f2113e.f357j == 0) {
                            RunnableC0066a.f2113e.f358k = RunnableC0066a.f2113e.f357j;
                            break;
                        }
                        break;
                    case 8194:
                        C0047bt.f888b = this.f2439b.readUTF();
                        C0047bt.f994d = this.f2439b.readUTF();
                        break;
                    case 8195:
                        C0088t.m1679a("exec角色列表:");
                        C0047bt.m821a(this.f2439b);
                        this.f2438a.m1440b(C0047bt.f831W != null ? C0047bt.f831W.length : 0);
                        break;
                    case 8197:
                        C0047bt.m901d(this.f2439b);
                        if (RunnableC0066a.f2113e != null) {
                            RunnableC0066a.f2113e.f217aX = false;
                            if (RunnableC0066a.f2113e.f358k == 2 && RunnableC0066a.f2113e.f359l == 4) {
                                String strM1677a = C0088t.m1677a(this.f2438a.f2218l, C0047bt.f878aq);
                                C0088t.m1677a(this.f2438a.f2218l, C0047bt.f877ap);
                                RunnableC0066a.f2113e.f226am = C0055ca.m1311a(new StringBuffer().append(C0047bt.f1766t[RunnableC0066a.f2113e.f220af].f510b).append(":已存入银两").append(strM1677a).append("，现有银两").append(this.f2438a.f2218l.toString()).toString(), C0088t.f2523i, C0088t.f2516b == 176 ? 118 : 152, "\t");
                                RunnableC0066a.f2113e.f222ah = RunnableC0066a.f2113e.f360m == 1 ? C0047bt.f878aq : C0047bt.f877ap;
                            } else if (RunnableC0066a.f2113e.f358k == 37 && RunnableC0066a.f2113e.f228ao) {
                                RunnableC0066a.f2113e.m479p();
                                RunnableC0066a.f2113e.f228ao = false;
                            }
                            RunnableC0066a.f2113e.f181I.m11a();
                            break;
                        }
                        break;
                    case 8198:
                        int i = this.f2439b.readByte();
                        if (i > 0) {
                            C0026az[] c0026azArr = new C0026az[i];
                            for (int i2 = 0; i2 < i; i2++) {
                                c0026azArr[i2] = new C0026az();
                                c0026azArr[i2].m613a(this.f2439b);
                            }
                            C0047bt.f1767u.addElement(c0026azArr);
                        }
                        C0015ao.m112Q();
                        if (RunnableC0066a.f2113e != null) {
                            RunnableC0066a.f2113e.m363P();
                            break;
                        }
                        break;
                    case 8199:
                        m1651b();
                        break;
                    case 8200:
                        C0047bt.m884b(this.f2439b);
                        break;
                    case 8201:
                        byte b = this.f2439b.readByte();
                        C0047bt.m906e(this.f2439b);
                        if (b == 1) {
                            this.f2438a.m1455i();
                        } else if (b == 2 && RunnableC0066a.f2113e != null) {
                            RunnableC0066a.f2113e.m447e(0);
                        }
                        if (RunnableC0066a.f2113e == null || RunnableC0066a.f2113e.f357j != 4) {
                            if (RunnableC0066a.f2113e != null && RunnableC0066a.f2113e.f358k == 9) {
                                RunnableC0066a.f2113e.m484s();
                                break;
                            }
                        } else {
                            RunnableC0066a.f2113e.m484s();
                            break;
                        }
                        break;
                    case 8202:
                        C0047bt.m926l(this.f2439b);
                        if (RunnableC0066a.f2113e != null && RunnableC0066a.f2113e.f358k == 5) {
                            RunnableC0066a.f2113e.f359l = (short) 0;
                            RunnableC0066a runnableC0066a = this.f2438a;
                            this.f2438a.f2217k = (short) 7;
                            runnableC0066a.f2216j = (short) 7;
                            break;
                        }
                        break;
                    case 8203:
                        this.f2439b.readByte();
                        C0047bt.m930n(this.f2439b);
                        if (RunnableC0066a.f2113e.f358k == 12) {
                            if (this.f2438a.f2151as.f2353a == 0) {
                                RunnableC0066a.f2113e.m376a((byte) 1, true);
                                break;
                            } else if (this.f2438a.f2151as.f2353a == 1) {
                                RunnableC0066a.f2113e.m376a((byte) 0, true);
                                break;
                            }
                        }
                        break;
                    case 8204:
                        m1649a(this.f2439b);
                        break;
                    case 8205:
                        C0047bt.m759A(this.f2439b);
                        break;
                    case 8206:
                        m1652b(this.f2439b);
                        break;
                    case 8207:
                        if (!C0015ao.m310i()) {
                            if (c0091w != null) {
                                this.f2441d = c0091w.m1709a();
                            }
                            try {
                                if (this.f2439b != null) {
                                    this.f2439b.close();
                                }
                                if (this.f2440c != null) {
                                    this.f2440c.close();
                                    return;
                                }
                                return;
                            } catch (IOException e2) {
                                e2.printStackTrace();
                                return;
                            }
                        }
                        C0047bt.m914g(this.f2439b);
                        RunnableC0066a.f2113e.f359l = (short) 0;
                        RunnableC0066a.f2113e.m473m();
                        break;
                    case 8208:
                        byte b2 = this.f2439b.readByte();
                        C0047bt.m885b(this.f2439b, b2);
                        if (b2 == 1) {
                            RunnableC0066a.f2113e.f183M.m564y();
                            break;
                        } else {
                            RunnableC0066a.f2113e.m361N();
                            break;
                        }
                    case 8209:
                        m1654c();
                        if (RunnableC0066a.f2113e.f358k == 0) {
                            RunnableC0066a.f2113e.f359l = (short) 0;
                            RunnableC0066a.f2113e.m473m();
                            break;
                        }
                        break;
                    case 8210:
                        C0047bt.m942t(this.f2439b);
                        if (RunnableC0066a.f2113e == null) {
                            if (c0091w != null) {
                                this.f2441d = c0091w.m1709a();
                            }
                            try {
                                if (this.f2439b != null) {
                                    this.f2439b.close();
                                }
                                if (this.f2440c != null) {
                                    this.f2440c.close();
                                    return;
                                }
                                return;
                            } catch (IOException e3) {
                                e3.printStackTrace();
                                return;
                            }
                        }
                        if (RunnableC0066a.f2113e.f358k != 12 || RunnableC0066a.f2113e.f359l < 6) {
                            if (RunnableC0066a.f2113e.f358k == 4 && RunnableC0066a.f2113e.f359l >= 8) {
                                if (this.f2438a.f2216j != 2) {
                                    this.f2438a.f2216j = this.f2438a.f2217k;
                                }
                                RunnableC0066a.f2113e.m401a(C0047bt.f1087en);
                                RunnableC0066a.f2113e.f359l = (short) 8;
                                break;
                            }
                        } else {
                            if (this.f2438a.f2216j != 2) {
                                this.f2438a.f2216j = this.f2438a.f2217k;
                            }
                            RunnableC0066a.f2113e.f359l = (short) 6;
                            RunnableC0066a.f2113e.m401a(C0047bt.f1087en);
                            break;
                        }
                        break;
                    case 8211:
                        C0047bt.m765D(this.f2439b);
                        RunnableC0066a.f2113e.m401a(C0047bt.f1145fs);
                        RunnableC0066a.f2113e.m401a(C0047bt.f1138fl);
                        if (this.f2438a.f2216j == 1) {
                            this.f2438a.f2216j = this.f2438a.f2217k;
                            break;
                        }
                        break;
                    case 8212:
                        C0047bt.m767E(this.f2439b);
                        if (this.f2438a.f2216j == 1) {
                            this.f2438a.f2216j = this.f2438a.f2217k;
                            break;
                        }
                        break;
                    case 8213:
                        C0047bt.m936q(this.f2439b);
                        if (RunnableC0066a.f2113e != null) {
                            if (!C0015ao.m310i() || RunnableC0066a.f2113e.f358k == 20) {
                                this.f2438a.f2158az = false;
                                RunnableC0066a.f2113e.m423b(C0047bt.f1014dT[1], C0047bt.f1018dX);
                                if (c0091w != null) {
                                    this.f2441d = c0091w.m1709a();
                                }
                                try {
                                    if (this.f2439b != null) {
                                        this.f2439b.close();
                                    }
                                    if (this.f2440c != null) {
                                        this.f2440c.close();
                                        return;
                                    }
                                    return;
                                } catch (IOException e4) {
                                    e4.printStackTrace();
                                    return;
                                }
                            }
                            if (this.f2438a.f2216j != 2) {
                                RunnableC0066a.f2113e.m394a(RunnableC0066a.f2113e.f358k);
                                break;
                            } else {
                                this.f2438a.f2158az = true;
                                break;
                            }
                        }
                        break;
                    case 8214:
                        int i3 = this.f2439b.readByte();
                        if (i3 > 0) {
                            C0059ce[] c0059ceArr = new C0059ce[i3];
                            for (int i4 = 0; i4 < i3; i4++) {
                                c0059ceArr[i4] = new C0059ce();
                                c0059ceArr[i4].m1343a(this.f2439b);
                            }
                            if (RunnableC0066a.f2113e != null) {
                                RunnableC0066a.f2113e.m400a(c0059ceArr);
                                break;
                            }
                        }
                        break;
                    case 8215:
                        C0047bt.m761B(this.f2439b);
                        if (!C0015ao.m310i()) {
                            this.f2438a.m1442b("战斗中不能进行该操作");
                            if (c0091w != null) {
                                this.f2441d = c0091w.m1709a();
                            }
                            try {
                                if (this.f2439b != null) {
                                    this.f2439b.close();
                                }
                                if (this.f2440c != null) {
                                    this.f2440c.close();
                                    return;
                                }
                                return;
                            } catch (IOException e5) {
                                e5.printStackTrace();
                                return;
                            }
                        }
                        RunnableC0066a.f2113e.m489v();
                        break;
                    case 8216:
                        C0047bt.m928m(this.f2439b);
                        if (C0047bt.f948cG == null || C0047bt.f948cG.length <= 0) {
                            this.f2438a.m1442b("该玩家没有武器装备!");
                            break;
                        } else {
                            if (!C0015ao.m310i()) {
                                this.f2438a.m1442b("战斗中不能进行该操作");
                                if (c0091w != null) {
                                    this.f2441d = c0091w.m1709a();
                                }
                                try {
                                    if (this.f2439b != null) {
                                        this.f2439b.close();
                                    }
                                    if (this.f2440c != null) {
                                        this.f2440c.close();
                                        return;
                                    }
                                    return;
                                } catch (IOException e6) {
                                    e6.printStackTrace();
                                    return;
                                }
                            }
                            RunnableC0066a.f2113e.m490w();
                            break;
                        }
                    case 8217:
                        m1657e();
                        if (RunnableC0066a.f2113e.f358k == 100) {
                            RunnableC0066a.f2113e.m361N();
                            break;
                        } else if (RunnableC0066a.f2113e.f358k == 7) {
                            RunnableC0066a.f2113e.m419b((byte) RunnableC0066a.f2113e.f216aV);
                            break;
                        }
                        break;
                    case 8218:
                        long j = this.f2439b.readLong();
                        byte b3 = this.f2439b.readByte();
                        if (j == -1) {
                            if (RunnableC0066a.f2113e.f356g != null) {
                                C0047bt.f1768v = -1L;
                                C0047bt.f1770x = (short) -1;
                                RunnableC0066a.f2113e.f356g.m754l();
                            }
                        } else if (C0044bq.f765g > 0 || j == C0047bt.f1768v) {
                            if (b3 == 0) {
                                RunnableC0066a.f2113e.f356g.f787f = (short) 7;
                                C0047bt.f1768v = -1L;
                                C0047bt.f1770x = (short) -1;
                            } else {
                                C0047bt.f1768v = -1L;
                                C0047bt.f1770x = (short) -1;
                            }
                        } else if (RunnableC0066a.f2113e.f356g != null) {
                            C0047bt.f1768v = -1L;
                            C0047bt.f1770x = (short) -1;
                            RunnableC0066a.f2113e.f356g.m754l();
                        }
                        C0047bt.m815a();
                        if (C0047bt.f935bu) {
                            RunnableC0066a.f2113e.f194X.m2b();
                            break;
                        }
                        break;
                    case 8219:
                        byte b4 = this.f2439b.readByte();
                        this.f2439b.readLong();
                        C0047bt.m763C(this.f2439b);
                        if (C0015ao.m310i()) {
                            if (b4 == 0) {
                                C0047bt.m784N();
                            } else if (b4 == 1) {
                                C0047bt.m949x();
                            }
                            RunnableC0066a.f2113e.m420b(b4, false);
                            break;
                        } else {
                            RunnableC0066a.f2113e.m457g(b4);
                            break;
                        }
                    case 8220:
                        m1658f();
                        break;
                    case 8221:
                        C0047bt.m769F(this.f2439b);
                        break;
                    case 8222:
                        C0088t.m1679a("exec宠物列表:");
                        m1656d();
                        break;
                    case 8223:
                        if (!C0015ao.m310i()) {
                            C0047bt.m917h(this.f2439b);
                            if (c0091w != null) {
                                this.f2441d = c0091w.m1709a();
                            }
                            try {
                                if (this.f2439b != null) {
                                    this.f2439b.close();
                                }
                                if (this.f2440c != null) {
                                    this.f2440c.close();
                                    return;
                                }
                                return;
                            } catch (IOException e7) {
                                e7.printStackTrace();
                                return;
                            }
                        }
                        if (C0015ao.m310i()) {
                            C0047bt.m917h(this.f2439b);
                            if (RunnableC0066a.f2113e.f358k == 6) {
                                if (C0047bt.f906bR != null || C0047bt.f900bL != null) {
                                    RunnableC0066a.f2113e.m491x();
                                    break;
                                } else {
                                    this.f2438a.m1442b("当前没有任务");
                                    break;
                                }
                            }
                        }
                        break;
                    case 8224:
                        C0047bt.f896bH = this.f2439b.readUTF();
                        if (RunnableC0066a.f2113e.f358k == 6) {
                            this.f2438a.f2149aq.m1604b();
                            this.f2438a.f2149aq.m1601a("任务详细");
                            this.f2438a.f2152at.m77a(C0047bt.f896bH, C0088t.f2523i, (byte) 2);
                            this.f2438a.f2152at.m75a((byte) 0);
                            this.f2438a.f2153au.m1590a("确定");
                            this.f2438a.f2149aq.m1600a(this.f2438a.f2152at);
                            this.f2438a.f2149aq.m1600a(this.f2438a.f2153au);
                            this.f2438a.f2149aq.m1598a(C0088t.f2520f, C0088t.f2521g, C0088t.f2518d, C0088t.f2519e);
                            this.f2438a.f2216j = this.f2438a.f2217k;
                            RunnableC0066a.f2113e.f359l = (short) 3;
                            break;
                        }
                        break;
                    case 8225:
                        C0047bt.m920i(this.f2439b);
                        if (C0047bt.f911bW) {
                            RunnableC0066a.f2113e.m353F();
                            break;
                        }
                        break;
                    case 8226:
                        C0047bt.m777J(this.f2439b);
                        if (C0047bt.f1172gS != null) {
                            if (!C0015ao.m310i()) {
                                this.f2438a.m1442b("战斗中不能查看周围玩家");
                                if (c0091w != null) {
                                    this.f2441d = c0091w.m1709a();
                                }
                                try {
                                    if (this.f2439b != null) {
                                        this.f2439b.close();
                                    }
                                    if (this.f2440c != null) {
                                        this.f2440c.close();
                                        return;
                                    }
                                    return;
                                } catch (IOException e8) {
                                    e8.printStackTrace();
                                    return;
                                }
                            }
                            if (RunnableC0066a.f2113e.f357j != 7) {
                                RunnableC0066a.f2113e.m419b((byte) 0);
                                break;
                            } else {
                                RunnableC0066a.f2113e.m419b((byte) RunnableC0066a.f2113e.f216aV);
                                break;
                            }
                        } else {
                            this.f2438a.m1442b("附近没有玩家!");
                            break;
                        }
                    case 8227:
                        C0047bt.m922j(this.f2439b);
                        if (C0047bt.f986cs == null) {
                            this.f2438a.m1442b("没有可传送的目的地!");
                            break;
                        } else if (RunnableC0066a.f2113e.f358k == 1 || RunnableC0066a.f2113e.f358k == 100) {
                            RunnableC0066a.f2113e.m397a(false);
                            break;
                        }
                        break;
                    case 8228:
                        C0047bt.m940s(this.f2439b);
                        if (C0047bt.f1198gs != null) {
                            RunnableC0066a.f2113e.m357J();
                            break;
                        } else {
                            if (RunnableC0066a.f2113e.f208aM > 1) {
                                C0015ao c0015ao2 = RunnableC0066a.f2113e;
                                c0015ao2.f208aM--;
                                this.f2438a.m1442b("没有更多的宠物了！");
                            } else {
                                C0047bt.m941t();
                            }
                            this.f2438a.f2216j = this.f2438a.f2217k;
                            this.f2438a.m1442b("找不到您搜索的宠物!");
                            break;
                        }
                    case 8229:
                        m1655c(this.f2439b);
                        break;
                    case 8230:
                        C0047bt.m773H(this.f2439b);
                        RunnableC0066a.f2113e.m350C();
                        break;
                    case 8231:
                        C0047bt.m938r(this.f2439b);
                        if (C0047bt.f1019dY != null) {
                            RunnableC0066a.f2113e.m356I();
                            break;
                        } else if (RunnableC0066a.f2113e.f208aM > 1) {
                            C0015ao c0015ao3 = RunnableC0066a.f2113e;
                            c0015ao3.f208aM--;
                            this.f2438a.m1442b("没有更多的物品了！");
                            this.f2438a.f2216j = this.f2438a.f2217k;
                            break;
                        } else {
                            this.f2438a.m1442b("拍卖场没有对应物品!");
                            RunnableC0066a.f2113e.f357j = (short) 14;
                            break;
                        }
                    case 8232:
                        C0047bt.m924k(this.f2439b);
                        if (RunnableC0066a.f2113e.f358k == 11) {
                            if (C0047bt.f987ct == null) {
                                this.f2438a.m1442b("仓库没有物品");
                                break;
                            } else {
                                RunnableC0066a.f2113e.m354G();
                                break;
                            }
                        }
                        break;
                    case 8233:
                        C0047bt.m770G(this.f2439b);
                        if (RunnableC0066a.f2113e.f357j == 35) {
                            if (C0047bt.f1198gs != null) {
                                RunnableC0066a.f2113e.m351D();
                                if (this.f2438a.f2216j != 2) {
                                    this.f2438a.f2216j = this.f2438a.f2217k;
                                    break;
                                }
                            } else {
                                this.f2438a.m1442b("没有寄养宠物!");
                                break;
                            }
                        }
                        break;
                    case 8234:
                        C0047bt.m932o(this.f2439b);
                        if (RunnableC0066a.f2113e.f358k == 29 && C0047bt.f999dE != null) {
                            RunnableC0066a.f2113e.m464i(RunnableC0066a.f2113e.f200aE > C0047bt.f999dE.length + (-1) ? C0047bt.f999dE.length - 1 : RunnableC0066a.f2113e.f200aE);
                            break;
                        }
                        break;
                    case 8235:
                        if (C0015ao.m310i()) {
                            C0047bt.m934p(this.f2439b);
                        } else {
                            C0047bt.m939s();
                        }
                        if (!C0047bt.f1004dJ) {
                            if (c0091w != null) {
                                this.f2441d = c0091w.m1709a();
                            }
                            try {
                                if (this.f2439b != null) {
                                    this.f2439b.close();
                                }
                                if (this.f2440c != null) {
                                    this.f2440c.close();
                                    return;
                                }
                                return;
                            } catch (IOException e9) {
                                e9.printStackTrace();
                                return;
                            }
                        }
                        if (!C0015ao.m310i()) {
                            if (c0091w != null) {
                                this.f2441d = c0091w.m1709a();
                            }
                            try {
                                if (this.f2439b != null) {
                                    this.f2439b.close();
                                }
                                if (this.f2440c != null) {
                                    this.f2440c.close();
                                    return;
                                }
                                return;
                            } catch (IOException e10) {
                                e10.printStackTrace();
                                return;
                            }
                        }
                        RunnableC0066a.f2113e.m480p(0);
                        break;
                    case 8236:
                        C0047bt.m934p(this.f2439b);
                        if (RunnableC0066a.f2113e.f358k != 7) {
                            RunnableC0066a.f2113e.m480p(2);
                            break;
                        }
                        break;
                    case 8238:
                        C0047bt.m946v(this.f2439b);
                        if (!C0015ao.f151aj || C0047bt.f1095ev) {
                            if (C0047bt.f1096ew != null) {
                                RunnableC0066a.f2113e.m395a(RunnableC0066a.f2113e.f358k, (byte) 1);
                                break;
                            } else {
                                C0047bt.m943u();
                                break;
                            }
                        }
                        break;
                    case 8239:
                        if (this.f2439b.readByte() == 0) {
                            C0047bt.f934bt = false;
                        } else {
                            C0047bt.f934bt = true;
                        }
                        C0044bq.m728k();
                        if (RunnableC0066a.f2113e != null) {
                            RunnableC0066a.f2113e.m442d(false);
                            break;
                        }
                        break;
                    case 8240:
                        C0047bt.m954z(this.f2439b);
                        RunnableC0066a.f2113e.m453f((byte) 1);
                        break;
                    case 8241:
                        C0047bt.m781L(this.f2439b);
                        break;
                    case 8242:
                        C0047bt.m779K(this.f2439b);
                        break;
                    case 8243:
                        C0047bt.m822a(this.f2439b, this.f2439b.readByte());
                        if (C0047bt.f1022db == null || C0047bt.f1022db.length <= 0) {
                            this.f2438a.m1442b("宠物没有技能!");
                            break;
                        } else {
                            RunnableC0066a.f2113e.m398a(C0047bt.f1152fz[RunnableC0066a.f2113e.f237ay] == 0, false);
                            break;
                        }
                    case 8244:
                        C0047bt.m944u(this.f2439b);
                        if (RunnableC0066a.f2113e == null) {
                            if (c0091w != null) {
                                this.f2441d = c0091w.m1709a();
                            }
                            try {
                                if (this.f2439b != null) {
                                    this.f2439b.close();
                                }
                                if (this.f2440c != null) {
                                    this.f2440c.close();
                                    return;
                                }
                                return;
                            } catch (IOException e11) {
                                e11.printStackTrace();
                                return;
                            }
                        }
                        if (RunnableC0066a.f2113e.f358k == 36 && RunnableC0066a.f2113e.f359l >= 2) {
                            if (this.f2438a.f2216j != 2) {
                                this.f2438a.f2216j = this.f2438a.f2217k;
                            }
                            RunnableC0066a.f2113e.f359l = (short) 2;
                            RunnableC0066a.f2113e.m401a(C0047bt.f1093et);
                            break;
                        }
                        break;
                    case 8245:
                        C0047bt.m836aI(this.f2439b);
                        if (this.f2439b.readByte() == 1) {
                            this.f2438a.m1449e();
                            break;
                        }
                        break;
                    case 8246:
                        C0047bt.m785N(this.f2439b);
                        break;
                    case 8247:
                        C0047bt.f1772z = this.f2439b.readByte();
                        if (RunnableC0066a.f2113e != null) {
                            if (RunnableC0066a.f2113e.f358k == 3) {
                                RunnableC0066a.f2113e.m375a((byte) 2);
                            }
                            if (RunnableC0066a.f2113e.f358k == 100) {
                                RunnableC0066a.f2113e.m361N();
                                break;
                            }
                        }
                        break;
                    case 8248:
                        C0047bt.f809A = this.f2439b.readByte();
                        if (RunnableC0066a.f2113e != null) {
                            RunnableC0066a.f2113e.m442d(false);
                            break;
                        }
                        break;
                    case 8249:
                        C0047bt.f810B = this.f2439b.readByte();
                        if (RunnableC0066a.f2113e != null) {
                            RunnableC0066a.f2113e.m442d(false);
                            break;
                        }
                        break;
                    case 8250:
                        m1648a();
                        if (RunnableC0066a.f2113e != null) {
                            RunnableC0066a.f2113e.m442d(false);
                            break;
                        }
                        break;
                    case 8251:
                        C0047bt.f812D = this.f2439b.readByte();
                        if (RunnableC0066a.f2113e != null) {
                            RunnableC0066a.f2113e.m442d(false);
                            break;
                        }
                        break;
                    case 8252:
                        byte b5 = this.f2439b.readByte();
                        C0047bt.m911f(this.f2439b);
                        if (b5 == 1) {
                            this.f2438a.m1455i();
                        }
                        if (RunnableC0066a.f2113e == null || RunnableC0066a.f2113e.f357j != 4) {
                            if (RunnableC0066a.f2113e != null && RunnableC0066a.f2113e.f358k == 9) {
                                RunnableC0066a.f2113e.m484s();
                                break;
                            }
                        } else {
                            RunnableC0066a.f2113e.m484s();
                            break;
                        }
                        break;
                    case 8253:
                        C0047bt.m831aD(this.f2439b);
                        if (RunnableC0066a.f2113e.f358k != 20) {
                            RunnableC0066a.f2113e.m370Y();
                            break;
                        }
                        break;
                    case 8254:
                        C0047bt.m832aE(this.f2439b);
                        RunnableC0066a.f2113e.m433c(RunnableC0066a.f2113e.f358k);
                        break;
                    case 8255:
                        C0047bt.m834aG(this.f2439b);
                        RunnableC0066a.f2113e.m371Z();
                        break;
                    case 8257:
                        C0047bt.f813E = this.f2439b.readByte();
                        if (RunnableC0066a.f2113e != null) {
                            RunnableC0066a.f2113e.m442d(false);
                            break;
                        }
                        break;
                    case 8258:
                        C0047bt.m835aH(this.f2439b);
                        if (RunnableC0066a.f2113e.f357j != 4 && RunnableC0066a.f2113e.f357j != 33) {
                            RunnableC0066a.f2113e.m409ah();
                            break;
                        }
                        break;
                    case 8259:
                        C0047bt.m807Y(this.f2439b);
                        if (RunnableC0066a.f2113e.f358k == 2) {
                            RunnableC0066a.f2113e.f183M.m519b(false);
                            break;
                        } else if (RunnableC0066a.f2113e.f358k == 50) {
                            this.f2438a.f2152at.m79b(C0047bt.f1268iI[this.f2438a.f2150ar.m1275g()], C0088t.f2523i, (byte) 2);
                            this.f2438a.f2152at.m75a((byte) 1);
                            break;
                        }
                        break;
                    case 8260:
                        int i5 = this.f2439b.readInt();
                        if (i5 > 0) {
                            byte[] bArr = new byte[i5];
                            C0047bt.f1389kX = this.f2439b.readUTF();
                            this.f2439b.read(bArr);
                            RunnableC0066a.f2099ae = new C0048bu(C0047bt.f1389kX, bArr);
                        }
                        C0047bt.m837aJ(this.f2439b);
                        break;
                    case 8261:
                        C0047bt.m838aK(this.f2439b);
                        if (this.f2439b.readByte() == 1) {
                            this.f2438a.m1451f();
                        }
                        if (C0047bt.f933bs == 0) {
                            this.f2438a.m1460n();
                            this.f2438a.f2126a = 0;
                            this.f2438a.f2159b = 0;
                            this.f2438a.f2213d.m1377a();
                            break;
                        }
                        break;
                    case 8264:
                        boolean z = this.f2439b.readByte() != 0;
                        C0047bt.f935bu = z;
                        if (z) {
                            C0002ab.f2b = true;
                        }
                        if (RunnableC0066a.f2113e != null && RunnableC0066a.f2113e.f194X != null) {
                            RunnableC0066a.f2113e.f194X.m2b();
                        }
                        if (RunnableC0066a.f2113e.f358k == 100) {
                            RunnableC0066a.f2113e.m361N();
                            break;
                        }
                        break;
                    case 8265:
                        C0047bt.f936bv = this.f2439b.readInt();
                        break;
                    case 8267:
                        C0047bt.f940bz = this.f2439b.readUTF();
                        C0047bt.f939by = this.f2439b.readUTF();
                        if (RunnableC0066a.f2113e != null) {
                            RunnableC0066a.f2113e.m402aa();
                            break;
                        }
                        break;
                    case 8269:
                        if (RunnableC0066a.f2113e != null) {
                            RunnableC0066a.f2113e.f191U.m575a(this.f2439b);
                            RunnableC0066a.f2113e.f191U.m577a(false);
                            break;
                        }
                        break;
                    case 8270:
                        if (RunnableC0066a.f2113e != null) {
                            RunnableC0066a.f2113e.f185O.m1626b(this.f2439b);
                            RunnableC0066a.f2113e.f185O.m1622a(false);
                            break;
                        }
                        break;
                    case 8271:
                        C0047bt.m845aR(this.f2439b);
                        if (RunnableC0066a.f2113e != null) {
                            if (C0047bt.f1514mq < 4) {
                                RunnableC0066a.f2113e.m406ae();
                                break;
                            } else if (C0047bt.f1514mq != 4 && C0047bt.f1514mq != 5) {
                                if (C0047bt.f1514mq == 6) {
                                    this.f2438a.f2216j = this.f2438a.f2217k;
                                    break;
                                }
                            } else {
                                RunnableC0066a.f2113e.m361N();
                                break;
                            }
                        }
                        break;
                    case 8272:
                        if (RunnableC0066a.f2113e != null) {
                            RunnableC0066a.f2113e.m361N();
                            break;
                        }
                        break;
                    case 8273:
                        RunnableC0066a.f2113e.f182J = this.f2439b.readUTF();
                        C0055ca.f1888h = 0;
                        if (!RunnableC0066a.f2113e.f282c && RunnableC0066a.f2113e.f358k != 0 && RunnableC0066a.f2113e.f358k != 25) {
                            RunnableC0066a runnableC0066a2 = this.f2438a;
                            this.f2438a.f2217k = (short) 7;
                            runnableC0066a2.f2216j = (short) 7;
                            RunnableC0066a.f2113e.m361N();
                            break;
                        }
                        break;
                    case 8274:
                        int i6 = this.f2439b.readInt();
                        int i7 = this.f2439b.readInt();
                        if (RunnableC0066a.f2113e.f358k != 0 && RunnableC0066a.f2113e.f358k != 25 && C0047bt.f816H == null) {
                            RunnableC0066a runnableC0066a3 = this.f2438a;
                            this.f2438a.f2217k = (short) 7;
                            runnableC0066a3.f2216j = (short) 7;
                            RunnableC0066a.f2113e.m361N();
                        }
                        this.f2438a.m1441b(i6 + 8, i7 + 16);
                        break;
                    case 8275:
                        byte b6 = this.f2439b.readByte();
                        C0047bt.f814F = null;
                        C0047bt.f815G = null;
                        if (b6 == 1) {
                            C0047bt.f814F = this.f2439b.readUTF();
                            C0047bt.f815G = this.f2439b.readUTF();
                        }
                        RunnableC0066a runnableC0066a4 = this.f2438a;
                        this.f2438a.f2217k = (short) 7;
                        runnableC0066a4.f2216j = (short) 7;
                        break;
                    case 8277:
                        if (RunnableC0066a.f2113e != null && RunnableC0066a.f2113e.f186P != null) {
                            RunnableC0066a.f2113e.f186P.m1670a(this.f2439b);
                            RunnableC0066a.f2113e.f186P.m1672a(false);
                            break;
                        }
                        break;
                    case 8278:
                        C0047bt.m808Z(this.f2439b);
                        RunnableC0066a.f2113e.f183M.m544n();
                        break;
                    case 8280:
                        C0047bt.m934p(this.f2439b);
                        if (RunnableC0066a.f2113e.f358k != 7) {
                            RunnableC0066a.f2113e.m480p(1);
                            break;
                        }
                        break;
                    case 8286:
                        C0047bt.f1418l = this.f2439b.readByte();
                        String utf = this.f2439b.readUTF();
                        C0047bt.f1365k = utf;
                        if (utf != null) {
                            RunnableC0066a.f2113e.m403ab();
                            break;
                        }
                        break;
                    case 8288:
                        RunnableC0066a.f2089aH = this.f2439b.readUTF();
                        RunnableC0066a.f2090aI = this.f2439b.readUTF();
                        this.f2438a.m1463q();
                        break;
                    case 8290:
                        C0047bt.f888b = this.f2439b.readUTF();
                        C0047bt.f994d = this.f2439b.readUTF();
                        if (C0088t.f2506a == 1) {
                            this.f2439b.readUTF();
                            C0047bt.f1471m = this.f2439b.readUTF();
                            break;
                        }
                        break;
                    case 8291:
                        byte b7 = this.f2439b.readByte();
                        C0047bt.m854aa(this.f2439b);
                        if (RunnableC0066a.f2113e.f358k == 115) {
                            RunnableC0066a.f2113e.f183M.m548p();
                            if (b7 == 3 || b7 == 4) {
                                this.f2438a.f2152at.m75a((byte) 1);
                            }
                            if (b7 == 5) {
                                this.f2438a.m1455i();
                                break;
                            }
                        }
                        break;
                    case 8293:
                        if (RunnableC0066a.f2113e != null && RunnableC0066a.f2113e.f187Q != null) {
                            RunnableC0066a.f2113e.f187Q.m1581a(this.f2439b);
                            RunnableC0066a.f2113e.f187Q.m1583a(false);
                            break;
                        }
                        break;
                    case 8294:
                        if (RunnableC0066a.f2113e != null) {
                            if (C0088t.f2506a == 0) {
                                if (C0047bt.f1363jy != 1) {
                                    this.f2438a.m1442b("充值卡充值暂时关闭");
                                    break;
                                }
                            } else if (C0047bt.f1363jy == 1) {
                                C0068c.m1472g();
                                break;
                            } else {
                                this.f2438a.m1442b("充值功能暂时关闭");
                                break;
                            }
                        }
                        break;
                    case 8295:
                        C0088t.m1679a("exec宠物升星");
                        C0047bt.m846aS(this.f2439b);
                        if (RunnableC0066a.f2113e != null) {
                            RunnableC0066a.f2113e.m449e(false);
                            break;
                        }
                        break;
                    case 8296:
                        C0088t.m1679a("exec抽奖");
                        C0047bt.m850aW(this.f2439b);
                        RunnableC0066a.f2113e.m414am();
                        break;
                    case 8297:
                        C0088t.m1679a("exec抽奖结果");
                        C0047bt.m851aX(this.f2439b);
                        if (RunnableC0066a.f2113e.f358k == 127) {
                            RunnableC0066a.f2113e.m414am();
                            this.f2438a.m1442b(new StringBuffer().append("恭喜您，抽中了").append(C0047bt.f1560nj).append("×").append(C0047bt.f1561nk).toString());
                            break;
                        }
                        break;
                    case 8298:
                        C0088t.m1679a("exec宠物升星结果");
                        C0047bt.m890bc(this.f2439b);
                        if (C0047bt.f1526nB == 1) {
                            this.f2438a.m1442b("升星成功");
                            break;
                        } else {
                            this.f2438a.m1442b("升星失败");
                            break;
                        }
                    case 8300:
                        if (RunnableC0066a.f2113e != null) {
                            RunnableC0066a.f2113e.f185O.m1626b(this.f2439b);
                            RunnableC0066a.f2113e.f185O.m1622a(false);
                            break;
                        }
                        break;
                    case 8301:
                        if (RunnableC0066a.f2113e != null) {
                            RunnableC0066a.f2113e.f192V.m1358a(this.f2439b);
                            RunnableC0066a.f2113e.f192V.m1360a(false);
                            break;
                        }
                        break;
                    case 8302:
                        if (RunnableC0066a.f2113e.f184N == null) {
                            RunnableC0066a.f2113e.f184N = new C0057cc(RunnableC0066a.f2113e, this.f2438a);
                        }
                        RunnableC0066a.f2113e.f184N.m1336a(this.f2439b);
                        RunnableC0066a.f2113e.f184N.m1338a((short) 0);
                        break;
                    case 8303:
                        C0088t.m1679a("宠物继承");
                        C0061cg.m1344a(C0061cg.f1965b);
                        C0061cg.m1346a(this.f2439b);
                        RunnableC0066a.f2113e.f193W.m1351b();
                        break;
                    case 8304:
                        if (this.f2439b.readInt() == 1) {
                            if (RunnableC0066a.f2113e.f184N == null) {
                                RunnableC0066a.f2113e.f184N = new C0057cc(RunnableC0066a.f2113e, this.f2438a);
                            }
                            RunnableC0066a.f2113e.f184N.m1339b(this.f2439b);
                            RunnableC0066a.f2113e.f184N.m1338a((short) 2);
                            break;
                        }
                        break;
                    case 8448:
                        if (this.f2439b.readByte() == 1) {
                            this.f2438a.m1444c();
                            break;
                        }
                        break;
                    case 8449:
                        C0047bt.m787O(this.f2439b);
                        RunnableC0066a.f2113e.m463i((byte) 0);
                        break;
                    case 8450:
                        C0047bt.m789P(this.f2439b);
                        if (RunnableC0066a.f2113e.f358k == 1) {
                            RunnableC0066a.f2113e.m369X();
                            break;
                        } else {
                            RunnableC0066a.f2113e.m469k((byte) 1);
                            break;
                        }
                    case 8451:
                        C0047bt.m787O(this.f2439b);
                        RunnableC0066a.f2113e.m463i((byte) 2);
                        break;
                    case 8452:
                        C0047bt.m789P(this.f2439b);
                        RunnableC0066a.f2113e.m469k((byte) 3);
                        break;
                    case 8453:
                        C0047bt.m795S(this.f2439b);
                        if (RunnableC0066a.f2113e != null) {
                            RunnableC0066a.f2113e.m366U();
                            break;
                        }
                        break;
                    case 8454:
                        C0047bt.m787O(this.f2439b);
                        if (RunnableC0066a.f2113e.f232as != 5 && RunnableC0066a.f2113e.f219aZ != 4 && RunnableC0066a.f2113e.f232as != 9 && RunnableC0066a.f2113e.f232as != 10) {
                            RunnableC0066a.f2113e.m463i((byte) 4);
                            break;
                        } else {
                            if (RunnableC0066a.f2113e.f219aZ == 4) {
                                RunnableC0066a.f2113e.f219aZ = (byte) -1;
                            }
                            RunnableC0066a.f2113e.m466j((byte) 6);
                            this.f2438a.f2216j = this.f2438a.f2217k;
                            C0015ao c0015ao4 = RunnableC0066a.f2113e;
                            RunnableC0066a.f2113e.f358k = (short) 38;
                            c0015ao4.f357j = (short) 38;
                            break;
                        }
                        break;
                    case 8455:
                        C0047bt.m789P(this.f2439b);
                        RunnableC0066a.f2113e.m469k((byte) 5);
                        break;
                    case 8456:
                        String utf2 = this.f2439b.readUTF();
                        if (RunnableC0066a.f2113e != null) {
                            RunnableC0066a.f2113e.m440d(utf2);
                            break;
                        }
                        break;
                    case 8704:
                        C0047bt.m797T(this.f2439b);
                        if (C0047bt.f1296ik == null || C0047bt.f1296ik.length <= 0) {
                            this.f2438a.m1442b("没有等待响应的帮派!");
                            break;
                        } else {
                            RunnableC0066a.f2113e.f183M.m515b();
                            break;
                        }
                        break;
                    case 8705:
                        C0047bt.m803W(this.f2439b);
                        RunnableC0066a.f2113e.f183M.m533h(0);
                        break;
                    case 8706:
                        C0047bt.m805X(this.f2439b);
                        RunnableC0066a.f2113e.f183M.m533h(1);
                        break;
                    case 8708:
                        C0047bt.m799U(this.f2439b);
                        if (C0047bt.f1301ip != null) {
                            RunnableC0066a.f2113e.f183M.m520c();
                            break;
                        } else {
                            this.f2438a.m1442b("没有帮派发布招募!");
                            break;
                        }
                    case 8709:
                        C0047bt.m801V(this.f2439b);
                        if (C0047bt.f1305it != null) {
                            RunnableC0066a.f2113e.f183M.m528f();
                            break;
                        } else {
                            this.f2438a.m1442b("没有申请入帮玩家!");
                            break;
                        }
                    case 8710:
                        C0047bt.m803W(this.f2439b);
                        if (C0047bt.f1310iy != null) {
                            RunnableC0066a.f2113e.f183M.m534i();
                            break;
                        } else if (RunnableC0066a.f2113e.f183M.f376g == 1) {
                            RunnableC0066a.f2113e.f183M.m514a(true);
                            break;
                        } else if (RunnableC0066a.f2113e.f183M.f376g == 0) {
                            RunnableC0066a.f2113e.m468k();
                            RunnableC0066a.f2113e.m430c(4);
                            break;
                        }
                        break;
                    case 8711:
                        C0047bt.m855ab(this.f2439b);
                        RunnableC0066a.f2113e.f183M.m536j();
                        break;
                    case 8712:
                        C0047bt.m856ac(this.f2439b);
                        RunnableC0066a.f2113e.f183M.m538k();
                        break;
                    case 8713:
                        C0047bt.m857ad(this.f2439b);
                        RunnableC0066a.f2113e.f183M.m540l();
                        break;
                    case 8714:
                        C0047bt.m858ae(this.f2439b);
                        if (C0047bt.f1353jo != null) {
                            RunnableC0066a.f2113e.f183M.m554s();
                            break;
                        } else {
                            this.f2438a.m1442b("没有可购买的设施!");
                            break;
                        }
                    case 8715:
                        C0047bt.m860ag(this.f2439b);
                        if (RunnableC0066a.f2113e != null) {
                            RunnableC0066a.f2113e.m366U();
                            break;
                        }
                        break;
                    case 8716:
                        C0047bt.m859af(this.f2439b);
                        RunnableC0066a.f2113e.f183M.m556t();
                        break;
                    case 8717:
                        C0047bt.m861ah(this.f2439b);
                        if (C0047bt.f1364jz != null) {
                            RunnableC0066a.f2113e.m368W();
                            break;
                        } else {
                            this.f2438a.m1442b("增值仓库没有物品!");
                            break;
                        }
                    case 8718:
                        C0047bt.m862ai(this.f2439b);
                        RunnableC0066a.f2113e.m375a((byte) 3);
                        break;
                    case 8722:
                        C0047bt.f1360jv = this.f2439b.readByte() == 1;
                        C0047bt.f1361jw = this.f2439b.readByte() == 1;
                        C0047bt.f1362jx = this.f2439b.readByte();
                        C0047bt.f1363jy = this.f2439b.readByte();
                        break;
                    case 8723:
                        C0047bt.f1100f = System.currentTimeMillis();
                        C0047bt.f1153g = false;
                        if (C0047bt.f1100f - C0047bt.f1047e <= 800) {
                            C0047bt.f1206h = (byte) 0;
                            break;
                        } else if (C0047bt.f1100f - C0047bt.f1047e <= 2000) {
                            C0047bt.f1206h = (byte) 1;
                            break;
                        } else {
                            C0047bt.f1206h = (byte) 2;
                            break;
                        }
                    case 8724:
                        C0047bt.m863aj(this.f2439b);
                        if (!C0015ao.m310i()) {
                            this.f2438a.m1442b("战斗中不能进行该操作");
                            if (c0091w != null) {
                                this.f2441d = c0091w.m1709a();
                            }
                            try {
                                if (this.f2439b != null) {
                                    this.f2439b.close();
                                }
                                if (this.f2440c != null) {
                                    this.f2440c.close();
                                    return;
                                }
                                return;
                            } catch (IOException e12) {
                                e12.printStackTrace();
                                return;
                            }
                        }
                        if (RunnableC0066a.f2113e == null) {
                            if (c0091w != null) {
                                this.f2441d = c0091w.m1709a();
                            }
                            try {
                                if (this.f2439b != null) {
                                    this.f2439b.close();
                                }
                                if (this.f2440c != null) {
                                    this.f2440c.close();
                                    return;
                                }
                                return;
                            } catch (IOException e13) {
                                e13.printStackTrace();
                                return;
                            }
                        }
                        RunnableC0066a.f2113e.m434c(false);
                        break;
                    case 8725:
                        C0047bt.m864ak(this.f2439b);
                        RunnableC0066a.f2113e.m472l((byte) 0);
                        break;
                    case 8726:
                        C0047bt.m773H(this.f2439b);
                        RunnableC0066a.f2113e.m350C();
                        break;
                    case 8727:
                        C0047bt.m865al(this.f2439b);
                        RunnableC0066a.f2113e.m472l((byte) 2);
                        break;
                    case 8728:
                        C0047bt.m867an(this.f2439b);
                        RunnableC0066a.f2113e.m350C();
                        break;
                    case 8729:
                        C0047bt.m833aF(this.f2439b);
                        break;
                    case 8730:
                        C0047bt.m873at(this.f2439b);
                        break;
                    case 8731:
                        C0047bt.m876aw(this.f2439b);
                        break;
                    case 8732:
                        C0047bt.m875av(this.f2439b);
                        if (C0083o.f2381e == 1) {
                            RunnableC0066a.f2113e.f185O.m1620a((int) RunnableC0066a.f2113e.f185O.f2409a, RunnableC0066a.f2113e.f185O.f2411c, RunnableC0066a.f2113e.f185O.f2412d);
                            break;
                        } else {
                            RunnableC0066a.f2113e.f185O.m1620a(0, (short) -1, -1);
                            break;
                        }
                    case 8733:
                        C0083o.m1612a(this.f2439b);
                        RunnableC0066a.f2113e.f185O.m1628c();
                        break;
                    case 8734:
                        C0047bt.m791Q(this.f2439b);
                        if (RunnableC0066a.f2113e.f232as != 3 && RunnableC0066a.f2113e.f232as != 8 && RunnableC0066a.f2113e.f232as != 7 && RunnableC0066a.f2113e.f232as != 2) {
                            if (RunnableC0066a.f2113e.f232as == 4 || RunnableC0066a.f2113e.f232as == 5 || RunnableC0066a.f2113e.f232as == 6 || RunnableC0066a.f2113e.f232as == 10) {
                                RunnableC0066a.f2113e.m463i((byte) 9);
                                break;
                            }
                        } else {
                            RunnableC0066a.f2113e.m463i((byte) 7);
                            break;
                        }
                        break;
                    case 8735:
                        C0047bt.m793R(this.f2439b);
                        if (RunnableC0066a.f2113e.f232as != 7 && RunnableC0066a.f2113e.f232as != 2 && RunnableC0066a.f2113e.f232as != 3 && RunnableC0066a.f2113e.f232as != 8) {
                            if (RunnableC0066a.f2113e.f232as == 9 || RunnableC0066a.f2113e.f232as == 4 || RunnableC0066a.f2113e.f232as == 5 || RunnableC0066a.f2113e.f232as == 6) {
                                RunnableC0066a.f2113e.m463i((byte) 10);
                                break;
                            }
                        } else {
                            RunnableC0066a.f2113e.m463i((byte) 8);
                            break;
                        }
                        break;
                    case 8736:
                        C0047bt.m843aP(this.f2439b);
                        if (RunnableC0066a.f2113e == null || !RunnableC0066a.f2113e.m405ad()) {
                            if (RunnableC0066a.f2113e != null && (C0047bt.f1464lt[0] == 0 || C0047bt.f1464lt[0] == 1 || C0047bt.f1464lt[0] == 2)) {
                                RunnableC0066a.f2113e.m446e((byte) 0);
                                C0047bt.f1464lt[0] = -1;
                                break;
                            }
                        } else {
                            RunnableC0066a.f2113e.m446e((byte) 0);
                            C0047bt.f1464lt[0] = -1;
                            break;
                        }
                        break;
                    case 8737:
                        if (RunnableC0066a.f2113e != null) {
                            byte[] bArrM1109a = C0053bz.m1109a((short) 4255, C0047bt.f1464lt, C0047bt.f865ad);
                            if (bArrM1109a != null) {
                                RunnableC0066a.f2115i.m600a(new C0091w((short) 4255, bArrM1109a));
                                break;
                            } else {
                                this.f2438a.m1442b("获取上传指令数据错误!");
                                break;
                            }
                        }
                        break;
                    case 8738:
                        C0047bt.m842aO(this.f2439b);
                        if (RunnableC0066a.f2113e == null || !RunnableC0066a.f2113e.m405ad()) {
                            if (RunnableC0066a.f2113e == null || C0047bt.f1464lt[1] != 1) {
                                if (RunnableC0066a.f2113e.f354e.f2216j == 1) {
                                    RunnableC0066a.f2113e.f354e.f2216j = this.f2438a.f2217k;
                                    break;
                                }
                            } else {
                                RunnableC0066a.f2113e.f359l = (short) 0;
                                RunnableC0066a.f2113e.m429c((byte) 0);
                                C0047bt.f1464lt[1] = -1;
                                break;
                            }
                        } else {
                            RunnableC0066a.f2113e.f359l = (short) 0;
                            RunnableC0066a.f2113e.m429c((byte) 0);
                            C0047bt.f1464lt[1] = -1;
                            break;
                        }
                        break;
                    case 8739:
                        C0047bt.m841aN(this.f2439b);
                        C0068c.m1465a("游客注册 第2步: ", "创建一哥哥通行证密码");
                        this.f2438a.f2216j = (short) 7;
                        break;
                    case 8960:
                        C0047bt.m868ao(this.f2439b);
                        if (RunnableC0066a.f2113e.f183M.f385p == 0) {
                            RunnableC0066a.f2113e.f183M.m558u();
                            break;
                        } else {
                            RunnableC0066a.f2113e.f183M.m533h(2);
                            break;
                        }
                    case 8961:
                        C0047bt.m869ap(this.f2439b);
                        RunnableC0066a.f2113e.m453f((byte) 2);
                        break;
                    case 8962:
                        C0047bt.m870aq(this.f2439b);
                        break;
                    case 8963:
                        C0047bt.f1401kj = this.f2439b.readShort();
                        break;
                    case 8964:
                        C0047bt.m871ar(this.f2439b);
                        if (C0047bt.f1402kk != null) {
                            this.f2438a.m1442b(C0047bt.f1402kk);
                            this.f2438a.m1438a(false);
                            break;
                        }
                        break;
                    case 8965:
                        C0047bt.m872as(this.f2439b);
                        RunnableC0066a.f2113e.f183M.m533h(3);
                        break;
                    case 8966:
                        C0047bt.m877ax(this.f2439b);
                        RunnableC0066a.f2113e.f183M.m562w();
                        break;
                    case 8967:
                        C0047bt.m878ay(this.f2439b);
                        RunnableC0066a.f2113e.f183M.m563x();
                        break;
                    case 8968:
                        C0047bt.m830aC(this.f2439b);
                        C0047bt.f823O.m1556a();
                        break;
                    case 8969:
                        C0047bt.m829aB(this.f2439b);
                        if (RunnableC0066a.f2113e.f358k == 76) {
                            byte b8 = this.f2438a.f2151as.f2353a;
                            int iM1275g = this.f2438a.f2150ar.m1275g();
                            RunnableC0066a.f2113e.m438d(b8);
                            this.f2438a.f2150ar.m1256a(Math.min(iM1275g, b8 == 0 ? C0047bt.f823O.f2252f.length : C0047bt.f824P.f48b.length));
                            break;
                        }
                        break;
                    case 8970:
                        C0047bt.m816a(this.f2439b.readByte(), this.f2439b);
                        break;
                    case 8971:
                        if (RunnableC0066a.f2113e.f358k == 111) {
                            if (c0091w != null) {
                                this.f2441d = c0091w.m1709a();
                            }
                            try {
                                if (this.f2439b != null) {
                                    this.f2439b.close();
                                }
                                if (this.f2440c != null) {
                                    this.f2440c.close();
                                    return;
                                }
                                return;
                            } catch (IOException e14) {
                                e14.printStackTrace();
                                return;
                            }
                        }
                        C0047bt.m874au(this.f2439b);
                        if (C0047bt.f825Q.f1939b != null && C0047bt.f825Q.f1939b.length() > 0) {
                            this.f2438a.f2154av.mo34b();
                            C0047bt.f825Q.m1341a(this.f2438a.f2154av);
                            C0047bt.f825Q.m1340a();
                            C0047bt.f825Q.m1342b();
                            RunnableC0066a.f2113e.f357j = RunnableC0066a.f2113e.f358k;
                            RunnableC0066a.f2113e.f358k = (short) 111;
                            this.f2438a.f2216j = this.f2438a.f2217k;
                            break;
                        }
                        break;
                    case 8972:
                        C0047bt.m828aA(this.f2439b);
                        if (RunnableC0066a.f2113e.f358k == 76) {
                            byte b9 = this.f2438a.f2151as.f2353a;
                            int iM1275g2 = this.f2438a.f2150ar.m1275g();
                            RunnableC0066a.f2113e.m438d(b9);
                            this.f2438a.f2150ar.m1256a(iM1275g2);
                        }
                        if (RunnableC0066a.f2113e.f358k == 111) {
                            if (this.f2438a.f2216j == 1) {
                                this.f2438a.f2216j = (short) 7;
                            }
                            if (RunnableC0066a.f2113e.f357j == 76) {
                                byte b10 = this.f2438a.f2151as.f2353a;
                                int iM1275g3 = this.f2438a.f2150ar.m1275g();
                                RunnableC0066a.f2113e.m438d(b10);
                                this.f2438a.f2150ar.m1256a(iM1275g3);
                                break;
                            }
                        }
                        break;
                    case 8973:
                        C0047bt.m879az(this.f2439b);
                        C0047bt.f824P.m38c();
                        RunnableC0066a.f2113e.m488u();
                        break;
                    case 8974:
                        C0088t.m1679a("exec特效查看");
                        C0047bt.m847aT(this.f2439b);
                        RunnableC0066a.f2113e.m493z();
                        break;
                    case 8975:
                        C0088t.m1679a("exec特效激活");
                        C0047bt.m848aU(this.f2439b);
                        RunnableC0066a.f2113e.m349B();
                        break;
                    case 8976:
                        C0088t.m1679a("exec特效消除");
                        C0047bt.m849aV(this.f2439b);
                        RunnableC0066a.f2113e.m348A();
                        break;
                    case 8977:
                        C0088t.m1679a("exec查看坐骑");
                        C0047bt.m852aY(this.f2439b);
                        RunnableC0066a.f2113e.m413al();
                        RunnableC0066a.f2113e.f181I.m17a(true);
                        break;
                    case 8978:
                        C0088t.m1679a("exec坐骑升星");
                        C0047bt.m853aZ(this.f2439b);
                        RunnableC0066a.f2113e.m413al();
                        break;
                    case 8979:
                        C0088t.m1679a("exec更换坐骑");
                        C0047bt.m888ba(this.f2439b);
                        RunnableC0066a.f2113e.m413al();
                        RunnableC0066a.f2113e.f181I.m17a(true);
                        break;
                    case 8981:
                        C0088t.m1679a("exec特效技能");
                        C0047bt.m889bb(this.f2439b);
                        RunnableC0066a.f2113e.m415an();
                        break;
                    case 8982:
                        C0088t.m1679a("exec宠物炼化需 求");
                        String[] strArr = new String[3];
                        C0047bt.f1527nC = strArr;
                        strArr[0] = this.f2439b.readUTF();
                        C0047bt.f1527nC[1] = this.f2439b.readUTF();
                        C0047bt.f1527nC[2] = this.f2439b.readUTF();
                        RunnableC0066a.f2113e.f359l = (short) 11;
                        C0055ca.f1888h = 0;
                        this.f2438a.f2216j = this.f2438a.f2217k;
                        break;
                    case 9216:
                        C0090v.m1685a(this.f2439b);
                        if (C0090v.f2547a != null) {
                            RunnableC0066a.f2113e.f189S.m1693a(0);
                            break;
                        } else {
                            this.f2438a.m1442b("暂无求爱信息!");
                            break;
                        }
                    case 9217:
                        C0090v.m1686b(this.f2439b);
                        if (C0090v.f2548b != null) {
                            RunnableC0066a.f2113e.f189S.m1696b();
                            break;
                        } else {
                            this.f2438a.m1442b("求爱信息不存在!");
                            break;
                        }
                    case 9218:
                        C0090v.m1687c(this.f2439b);
                        RunnableC0066a.f2113e.f189S.m1700c();
                        break;
                    case 9219:
                        C0090v.m1688d(this.f2439b);
                        RunnableC0066a.f2113e.f189S.m1703d();
                        break;
                    case 9220:
                        C0090v.m1689e(this.f2439b);
                        RunnableC0066a.f2113e.f189S.m1708f();
                        break;
                    case 9221:
                        if (C0015ao.m310i()) {
                            RunnableC0066a runnableC0066a5 = this.f2438a;
                            this.f2438a.f2217k = (short) 7;
                            runnableC0066a5.f2216j = (short) 7;
                            C0015ao c0015ao5 = RunnableC0066a.f2113e;
                            RunnableC0066a.f2113e.f358k = (short) 0;
                            c0015ao5.f357j = (short) 0;
                        }
                        this.f2438a.m1442b(this.f2439b.readUTF());
                        break;
                    case 9222:
                        C0047bt.m844aQ(this.f2439b);
                        if (RunnableC0066a.f2113e != null) {
                            RunnableC0066a.f2113e.m404ac();
                            break;
                        }
                        break;
                    case 9223:
                        byte b11 = this.f2439b.readByte();
                        if (RunnableC0066a.f2113e != null) {
                            if (b11 == 1) {
                                RunnableC0066a.f2113e.m407af();
                                break;
                            } else if (b11 == 2) {
                                RunnableC0066a.f2113e.m408ag();
                                break;
                            }
                        }
                        break;
                    case 9472:
                        C0047bt.m783M(this.f2439b);
                        if (C0088t.f2506a != 0 && !C0088t.f2537w) {
                            if (C0047bt.f1255hw) {
                                if (!C0047bt.f1255hw || C0047bt.f1207hA.length > 0) {
                                    RunnableC0066a runnableC0066a6 = this.f2438a;
                                    this.f2438a.f2216j = (short) 4;
                                    runnableC0066a6.f2217k = (short) 4;
                                    this.f2438a.f2126a = 0;
                                    this.f2438a.f2159b = 0;
                                    this.f2438a.m1432a(0);
                                    this.f2438a.f2126a = 0;
                                    break;
                                } else {
                                    this.f2438a.m1442b("服务维护中，暂无可以进入的服务器");
                                    break;
                                }
                            } else if (C0047bt.f1207hA == null || C0047bt.f1207hA.length <= 0) {
                                this.f2438a.m1442b("服务维护中，暂无可以进入的服务器");
                                break;
                            } else {
                                this.f2438a.m1447d();
                                break;
                            }
                        } else {
                            this.f2438a.m1447d();
                            break;
                        }
                        break;
                    case 9473:
                        C0047bt.f1461lq = this.f2439b.readByte();
                        C0047bt.f1460lp = this.f2439b.readShort();
                        C0047bt.f1391kZ = this.f2439b.readShort();
                        C0047bt.f1450lf = this.f2439b.readUTF();
                        C0047bt.f1451lg = this.f2439b.readByte();
                        short s = this.f2439b.readShort();
                        C0047bt.f1449le = s;
                        if (s > 0) {
                            C0047bt.m839aL(this.f2439b);
                            RunnableC0066a.f2113e.m441d(C0047bt.f1391kZ);
                            break;
                        } else {
                            this.f2438a.m1442b("没有更多的成就!");
                            break;
                        }
                    case 9474:
                        C0047bt.f1463ls = this.f2439b.readByte();
                        C0047bt.f1462lr = this.f2439b.readShort();
                        C0047bt.f1391kZ = this.f2439b.readShort();
                        this.f2439b.readUTF();
                        this.f2439b.readByte();
                        C0047bt.f1457lm = this.f2439b.readByte();
                        C0047bt.f1452lh = this.f2439b.readUTF();
                        short s2 = this.f2439b.readShort();
                        C0047bt.f1456ll = s2;
                        if (s2 > 0) {
                            C0047bt.m840aM(this.f2439b);
                            RunnableC0066a.f2113e.m448e(C0047bt.f1391kZ);
                            break;
                        } else {
                            this.f2438a.m1442b("没有更多的成就!");
                            break;
                        }
                    case 9488:
                        C0047bt.m950x(this.f2439b);
                        RunnableC0066a.f2113e.m410ai();
                        break;
                    case 9489:
                        C0047bt.m952y(this.f2439b);
                        RunnableC0066a.f2113e.m411aj();
                        break;
                    case 9491:
                        C0088t.m1679a("exec 随机名称");
                        this.f2438a.f2157ay = this.f2439b.readUTF();
                        if (this.f2438a.f2217k == 6) {
                            this.f2438a.f2216j = this.f2438a.f2217k;
                            break;
                        }
                        break;
                    case 9494:
                        if (RunnableC0066a.f2113e != null) {
                            if (RunnableC0066a.f2113e.f188R == null) {
                                RunnableC0066a.f2113e.f188R = new C0031bd(RunnableC0066a.f2113e, RunnableC0066a.f2113e.f354e, RunnableC0066a.f2114f);
                            }
                            RunnableC0066a.f2113e.f188R.m638a(this.f2439b);
                            RunnableC0066a.f2113e.f188R.m637a();
                            break;
                        }
                        break;
                    case 10496:
                        byte b12 = this.f2439b.readByte();
                        this.f2439b.readByte();
                        if (b12 == 4) {
                            String[] strArrM1718a = C0094z.m1718a(this.f2439b.readUTF(), ':');
                            C0029bb.f556j = strArrM1718a[0].trim();
                            C0029bb.f555i = strArrM1718a[1].trim();
                            C0029bb.f559m = C0029bb.f556j;
                            C0029bb.f560n = C0029bb.f555i;
                            C0029bb.m625b();
                            this.f2438a.m1442b(this.f2439b.readUTF());
                            break;
                        } else if (b12 == 2) {
                            String[] strArrM1718a2 = C0094z.m1718a(this.f2439b.readUTF(), ':');
                            C0029bb.f556j = strArrM1718a2[0].trim();
                            C0029bb.f555i = strArrM1718a2[1].trim();
                            C0029bb.f559m = C0029bb.f556j;
                            C0029bb.f560n = C0029bb.f555i;
                            C0029bb.m625b();
                            this.f2438a.m1442b(this.f2439b.readUTF());
                            break;
                        }
                        break;
                    case 12289:
                        byte b13 = this.f2439b.readByte();
                        C0047bt.f1396ke = -1;
                        C0047bt.f1397kf = -1;
                        C0047bt.f1398kg = -1;
                        if (b13 == 0) {
                            C0047bt.f1396ke = this.f2439b.readInt();
                            C0047bt.f1397kf = this.f2439b.readInt();
                            C0047bt.f1398kg = this.f2439b.readInt();
                            break;
                        }
                        break;
                }
                if (c0091w != null) {
                    this.f2441d = c0091w.m1709a();
                }
                try {
                    if (this.f2439b != null) {
                        this.f2439b.close();
                    }
                    if (this.f2440c != null) {
                        this.f2440c.close();
                    }
                } catch (IOException e15) {
                    e15.printStackTrace();
                }
            } catch (Exception e16) {
                e16.printStackTrace();
                this.f2438a.m1433a(e16, (byte) 5);
                if (c0091w != null) {
                    this.f2441d = c0091w.m1709a();
                }
                try {
                    if (this.f2439b != null) {
                        this.f2439b.close();
                    }
                    if (this.f2440c != null) {
                        this.f2440c.close();
                    }
                } catch (IOException e17) {
                    e17.printStackTrace();
                }
            }
        } catch (Throwable th) {
            if (c0091w != null) {
                this.f2441d = c0091w.m1709a();
            }
            try {
                if (this.f2439b != null) {
                    this.f2439b.close();
                }
                if (this.f2440c != null) {
                    this.f2440c.close();
                }
            } catch (IOException e18) {
                e18.printStackTrace();
            }
            throw th;
        }
    }
}

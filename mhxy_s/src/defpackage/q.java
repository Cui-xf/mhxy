package defpackage;

import com.yinhan.kjava.main.a;
import com.yinhan.kjava.main.c;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Vector;

/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-8105993946875401281/classes.dex */
public final class q {
    private a a;
    private DataInputStream b;
    private ByteArrayInputStream c;
    private int e;
    private int f;
    private int g;
    private int h;
    private bl[] j;
    private short d = -1;
    private Vector i = new Vector();

    private static bs a(Vector vector, bs bsVar) {
        bs bsVar2 = null;
        int i = 0;
        while (i < vector.size()) {
            bs bsVar3 = (bs) vector.elementAt(i);
            if (bsVar2 != null && bsVar2.a(bsVar) <= bsVar3.a(bsVar)) {
                bsVar3 = bsVar2;
            }
            i++;
            bsVar2 = bsVar3;
        }
        return bsVar2;
    }

    private void a() {
        bt.C = new byte[this.b.readByte()];
        for (byte b = 0; b < bt.C.length; b = (byte) (b + 1)) {
            bt.C[b] = this.b.readByte();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:161:0x020d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01bb A[Catch: Exception -> 0x02f2, TryCatch #0 {Exception -> 0x02f2, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x000c, B:9:0x0015, B:11:0x0020, B:13:0x0024, B:14:0x002a, B:16:0x002f, B:17:0x003e, B:19:0x0042, B:21:0x004d, B:23:0x0054, B:25:0x0058, B:66:0x0153, B:68:0x0158, B:69:0x0160, B:72:0x0167, B:73:0x017b, B:75:0x017e, B:77:0x0182, B:80:0x0187, B:82:0x018c, B:84:0x0192, B:86:0x01a0, B:88:0x01bb, B:90:0x01cd, B:92:0x01d1, B:94:0x01d5, B:97:0x01db, B:99:0x01ec, B:102:0x01ff, B:104:0x0204, B:106:0x0211, B:105:0x020d, B:27:0x005e, B:30:0x0064, B:32:0x0069, B:34:0x006f, B:37:0x0082, B:40:0x0098, B:43:0x00ae, B:46:0x00c4, B:48:0x00cd, B:50:0x00d3, B:52:0x00f5, B:54:0x0108, B:56:0x0116, B:57:0x0120, B:59:0x0126, B:64:0x0130, B:129:0x02a4, B:116:0x022a, B:117:0x024c, B:119:0x0252, B:124:0x025c, B:128:0x0282, B:130:0x02a9, B:136:0x02c7, B:139:0x02cd, B:141:0x02d0, B:143:0x02e2, B:145:0x02e5, B:146:0x02ed, B:132:0x02af, B:134:0x02b2), top: B:154:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(java.io.DataInputStream r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 774
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q.a(java.io.DataInputStream):void");
    }

    private static boolean a(Vector vector, int i, int i2) {
        for (int i3 = 0; i3 < vector.size(); i3++) {
            if (i == ((bs) vector.elementAt(i3)).a && i2 == ((bs) vector.elementAt(i3)).b) {
                return true;
            }
        }
        return false;
    }

    private void b() {
        bt.c(this.b);
        if (a.e != null && a.e.I != null) {
            if (t.o && this.a.aj != null) {
                if (!a.e.I.c.isEmpty()) {
                    a.e.I.c.removeAllElements();
                    a.e.I.b();
                }
                if (this.a.aj != null) {
                    this.a.aj.c = 0;
                    this.a.aj.d = 0;
                }
                this.a.b = 0;
                this.a.a = 0;
            }
            a.e.I.j = bt.at;
            a.e.I.k = bt.au;
        }
        if (bt.bs == 0 && bt.q != null && bt.s == 0) {
            for (int i = 0; i < bt.q.length; i++) {
                bt.q[i].f.removeAllElements();
                if (bt.q[i].j == -1 && bt.q[i].k == -1) {
                    bt.q[i].j = bt.at;
                    bt.q[i].k = bt.au;
                }
                bt.q[i].l = bt.at;
                bt.q[i].m = bt.au;
            }
        }
        if (a.e == null) {
            this.a.g();
            a.e.I.d();
            return;
        }
        if (a.e != null) {
            a.e.I.a((int) bt.av);
        }
        if (a.e.Y != bt.ar || a.e.I.h()) {
            if (bt.bs == -1) {
                a.e.aY = 0L;
            }
            if (a.e.I.d != null) {
                a.e.I.d.e.removeAllElements();
                a.e.I.d.h = bt.at;
                a.e.I.d.i = bt.au;
                a.e.I.d.j = a.e.I.h;
                a.e.I.d.a(a.e.I.h);
            }
            if (ao.i()) {
                if (a.e.Y != bt.ar) {
                    a.e.e();
                } else {
                    a.e.f();
                }
                a.e.I.i();
                a.e.Y = bt.ar;
            }
            a.e.I.d();
            return;
        }
        if (bt.bs == 0 && bt.q != null && bt.s == 0) {
            a aVar = this.a;
            Vector vector = new Vector();
            this.e = (bt.q[0].j % 16 == 0 ? 0 : 1) + (bt.q[0].j / 16);
            this.f = (bt.q[0].k % 16 == 0 ? 0 : 1) + (bt.q[0].k / 16);
            this.g = (bt.q[0].l % 16 == 0 ? 0 : 1) + (bt.q[0].l / 16);
            this.h = (bt.q[0].m % 16 == 0 ? 0 : 1) + (bt.q[0].m / 16);
            if (this.e == this.g && this.f == this.h) {
                return;
            }
            if (bt.q[0].f == null) {
                bt.q[0].f = new Vector();
            }
            Vector vectorA = a(a.e.f, vector, new bs(this.e, this.f), new bs(this.g, this.h));
            int size = vectorA.size();
            for (int i2 = 0; i2 < bt.q.length; i2++) {
                bt.q[i2].f.removeAllElements();
                int i3 = 0;
                while (i3 < size) {
                    bs bsVar = (bs) vectorA.elementAt(i3);
                    bs bsVar2 = i3 < size + (-1) ? (bs) vectorA.elementAt(i3 + 1) : bsVar;
                    if (bsVar.a != bsVar2.a) {
                        if (bsVar.a > bsVar2.a) {
                            for (int i4 = 0; i4 < 4; i4++) {
                                bt.q[i2].f.addElement(new short[]{(short) ((bsVar.a << 4) - (i4 << 2)), (short) (bsVar.b << 4)});
                            }
                        } else {
                            for (int i5 = 0; i5 < 4; i5++) {
                                bt.q[i2].f.addElement(new short[]{(short) ((bsVar.a << 4) + (i5 << 2)), (short) (bsVar.b << 4)});
                            }
                        }
                    } else if (bsVar.b != bsVar2.b) {
                        if (bsVar.b > bsVar2.b) {
                            for (int i6 = 0; i6 < 4; i6++) {
                                bt.q[i2].f.addElement(new short[]{(short) (bsVar.a << 4), (short) ((bsVar.b << 4) - (i6 << 2))});
                            }
                        } else {
                            for (int i7 = 0; i7 < 4; i7++) {
                                bt.q[i2].f.addElement(new short[]{(short) (bsVar.a << 4), (short) ((bsVar.b << 4) + (i7 << 2))});
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
    private static void b(DataInputStream dataInputStream) throws IOException {
        long j = dataInputStream.readLong();
        if (bq.g > 0 && bt.v <= 0) {
            bt.v = j;
            bq.g = -1;
        }
        short s = dataInputStream.readShort();
        if (s > 0) {
            for (short s2 = 0; s2 < s; s2++) {
                int i = dataInputStream.readShort();
                if (i > 0) {
                    i[] iVarArr = new i[i];
                    for (int i2 = 0; i2 < i; i2++) {
                        iVarArr[i2] = new i();
                        i iVar = iVarArr[i2];
                        iVar.a = dataInputStream.readByte();
                        iVar.b = dataInputStream.readByte();
                        dataInputStream.readByte();
                        iVar.c = dataInputStream.readByte();
                        iVar.d = dataInputStream.readByte();
                        iVar.e = dataInputStream.readShort();
                        iVar.f = dataInputStream.readUTF();
                    }
                    a.e.g.a(iVarArr);
                }
            }
            for (int i3 = 0; i3 < s; i3++) {
                int i4 = dataInputStream.readShort();
                if (i4 > 0) {
                    ae[] aeVarArr = new ae[i4];
                    for (int i5 = 0; i5 < i4; i5++) {
                        aeVarArr[i5] = new ae();
                        ae aeVar = aeVarArr[i5];
                        aeVar.f = 0;
                        aeVar.a = dataInputStream.readByte();
                        aeVar.b = dataInputStream.readByte();
                        aeVar.c = dataInputStream.readByte();
                        aeVar.d = dataInputStream.readInt();
                        aeVar.g = dataInputStream.readInt();
                        aeVar.i = dataInputStream.readInt();
                        aeVar.e = dataInputStream.readInt();
                        aeVar.h = dataInputStream.readInt();
                        aeVar.j = dataInputStream.readInt();
                        aeVar.k = dataInputStream.readByte();
                    }
                    a.e.g.a(aeVarArr);
                }
            }
            for (int i6 = 0; i6 < s; i6++) {
                a.e.g.a(dataInputStream.readUTF());
            }
            if (a.e.k == 25 || a.e.k == 18 || !ao.i()) {
                a.e.g.f = (short) 1;
            }
        }
    }

    private static boolean b(Vector vector, int i, int i2) {
        for (int i3 = 0; i3 < vector.size(); i3++) {
            if (i == ((bs) vector.elementAt(i3)).a && i2 == ((bs) vector.elementAt(i3)).b) {
                return true;
            }
        }
        return false;
    }

    private void c() {
        boolean z = this.b.readByte() == 1;
        bt.bE = z;
        if (z) {
            bt.bF = this.b.readInt();
        } else {
            bt.bF = -1;
        }
        bt.bG = this.b.readInt();
        bt.bH = this.b.readUTF();
        if (bt.bE) {
            a.e.k = (short) 2;
        }
        if (a.e.k != 2) {
            if (a.e.k == 6) {
                this.a.b("不处理");
                return;
            }
            return;
        }
        ao.K = new bw(bt.bH, (short) (t.b - 20));
        if (bt.bE) {
            a.e.an = new String[]{"接受", "返回"};
        } else if (bt.bK[a.e.ai] == -1) {
            a.e.an = new String[]{"接受", "返回"};
        } else if (bt.bK[a.e.ai] == 0) {
            a.e.an = new String[]{"确定", "返回"};
        } else if (bt.bK[a.e.ai] == 1) {
            a.e.an = new String[]{"提交", "返回"};
        }
        ca.a(a.F, ao.K, a.e.an, (String[]) null, true);
        this.a.j = this.a.k;
        a.e.l = (short) 1;
    }

    private static void c(DataInputStream dataInputStream) throws IOException {
        bt.am(dataInputStream);
        a.e.l((byte) 1);
    }

    private void d() throws IOException {
        bt.I(this.b);
        if (a.e == null || !ao.i()) {
            return;
        }
        if (a.e.k != 13) {
            if (a.e.k == 36) {
                a.e.b(false);
                return;
            }
            if (a.e.k == 96 && a.e.ap) {
                a.e.k(a.e.aE);
                a.e.ap = false;
                return;
            } else if (a.e.k == 4 && a.e.bh) {
                a.e.s(a.e.bg);
                return;
            } else {
                if (a.e.k == 120) {
                    a.e.t(this.a.ar.g());
                    return;
                }
                return;
            }
        }
        if (bt.fA == null) {
            bt.B();
            this.a.b("您没有宠物！");
            return;
        }
        if (a.e.l == 6) {
            a.e.k(a.e.aE);
            return;
        }
        if (a.e.l == 8) {
            if (this.a.j != 2) {
                this.a.j = this.a.k;
                return;
            }
            return;
        }
        if (o.e == 1) {
            if (this.a.j != 2) {
                this.a.j = this.a.k;
                return;
            }
            return;
        }
        a.e.j(a.e.as);
        if (this.a.j != 2) {
            this.a.j = this.a.k;
        }
    }

    private void e() throws IOException {
        int i = this.b.readByte();
        if (i <= 0) {
            if (a.e != null) {
                a.e.a((bp[]) null);
                return;
            }
            return;
        }
        bt.s = this.b.readByte();
        bp[] bpVarArr = new bp[i];
        byte b = 1;
        for (int i2 = 0; i2 < i; i2++) {
            bpVarArr[i2] = new bp();
            bpVarArr[i2].a(a.e, this.b);
            if (bpVarArr[i2].s == 1) {
                bpVarArr[i2].a = (byte) 0;
            } else {
                bpVarArr[i2].a = b;
                b = (byte) (b + 1);
            }
        }
        for (int i3 = 0; i3 < bpVarArr.length - 1; i3++) {
            for (int i4 = 0; i4 < bpVarArr.length - 1; i4++) {
                bp bpVar = bpVarArr[i4];
                bp bpVar2 = bpVarArr[i4 + 1];
                if (bpVar2.a < bpVar.a) {
                    bpVarArr[i4] = bpVar2;
                    bpVarArr[i4 + 1] = bpVar;
                }
            }
        }
        if (a.e != null) {
            a.e.a(bpVarArr);
        }
    }

    private void f() throws IOException {
        byte b = this.b.readByte();
        if (bt.fl != null) {
            bt.v();
        }
        if (bt.fs != null) {
            bt.w();
        }
        bt.fw = null;
        bt.y();
        bt.z();
        bt.fg = 0L;
        bt.fn = 0L;
        a.e.am = null;
        a.e.al = null;
        if (ao.i()) {
            a.f.a(a.e.f, ao.h, ao.i, true, false, 2109231);
            a aVar = this.a;
            this.a.k = (short) 7;
            aVar.j = (short) 7;
            ao aoVar = a.e;
            a.e.k = (short) 0;
            aoVar.j = (short) 0;
        }
        if (b == 1) {
            this.a.b("交易成功!");
        } else if (b == 0) {
            this.a.b("交易取消!");
        } else if (b == -1) {
            this.a.b(this.b.readUTF());
        }
    }

    public final Vector a(aw awVar, Vector vector, bs bsVar, bs bsVar2) {
        if (awVar != null && vector != null) {
            if (awVar.i != null) {
                Vector vector2 = new Vector();
                vector.removeAllElements();
                vector.addElement(bsVar);
                boolean z = false;
                while (!vector.isEmpty()) {
                    bs bsVarA = a(vector, bsVar2);
                    boolean z2 = bsVarA.b(bsVar2) ? true : z;
                    if (z2) {
                        vector2.removeAllElements();
                        vector2.addElement(bsVar2);
                        bs bsVarA2 = a(vector, bsVar2);
                        while (!bsVarA2.b(bsVar)) {
                            bsVarA2 = bsVarA2.c;
                            vector2.addElement(bsVarA2);
                        }
                        return vector2;
                    }
                    vector.removeElement(bsVarA);
                    vector2.addElement(bsVarA);
                    bs[] bsVarArr = {new bs(bsVarA.a, bsVarA.b - 1), new bs(bsVarA.a, bsVarA.b + 1), new bs(bsVarA.a - 1, bsVarA.b), new bs(bsVarA.a + 1, bsVarA.b)};
                    for (int i = 0; i < bsVarArr.length; i++) {
                        if ((bsVarArr[i].a != bsVarA.a || bsVarArr[i].b != bsVarA.b) && bsVarArr[i].a >= 0) {
                            if (bsVarArr[i].a < (awVar.a % 16 == 0 ? 0 : 1) + (awVar.a / 16) + 1 && bsVarArr[i].b >= 0) {
                                if (bsVarArr[i].b < (awVar.b % 16 == 0 ? 0 : 1) + (awVar.b / 16) + 1 && !a(vector, bsVarArr[i].a, bsVarArr[i].b) && !b(vector2, bsVarArr[i].a, bsVarArr[i].b) && a.f.a(awVar, (bsVarArr[i].a << 4) + 8, bsVarArr[i].b << 4) == 0 && !a.f.a((bsVarArr[i].a << 4) + 8, bsVarArr[i].b << 4)) {
                                    vector.addElement(new bs(bsVarArr[i].a, bsVarArr[i].b, bsVarA));
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

    public final void a(a aVar) {
        this.a = aVar;
    }

    public final void a(w wVar) {
        try {
            if (wVar == null) {
                return;
            }
            try {
                this.d = wVar.a();
                if (this.d != 8192) {
                    if (wVar.b == null) {
                        if (wVar != null) {
                            this.d = wVar.a();
                        }
                        try {
                            if (this.b != null) {
                                this.b.close();
                            }
                            if (this.c != null) {
                                this.c.close();
                                return;
                            }
                            return;
                        } catch (IOException e) {
                            e.printStackTrace();
                            return;
                        }
                    }
                    this.c = new ByteArrayInputStream(wVar.b);
                    this.b = new DataInputStream(this.c);
                }
                switch (this.d) {
                    case 8192:
                        if (wVar.c != null) {
                            while (wVar.c.size() > 0) {
                                a((w) wVar.c.elementAt(0));
                                wVar.c.removeElementAt(0);
                            }
                            break;
                        }
                        break;
                    case 8193:
                        bt.w(this.b);
                        if (bt.eB == 53) {
                            if (a.e.g != null) {
                                a.e.g.d();
                                ao aoVar = a.e;
                                a.e.k = (short) 0;
                                aoVar.j = (short) 0;
                                this.a.b(t.Y[bt.eB]);
                                break;
                            }
                        } else if (bt.eB == 48) {
                            if (a.e.g != null) {
                                a.e.g.f = (short) -2;
                                break;
                            } else {
                                this.a.b(t.Y[bt.eB]);
                                break;
                            }
                        } else if (bt.eB != -2) {
                            if (a.e == null || a.e.g == null || a.e.g.f != -1 || bt.eC == null || !bt.eC.startsWith("等待他人操作")) {
                                if (bt.eC != null) {
                                    this.a.b(bt.eC);
                                    break;
                                } else {
                                    this.a.b(t.Y[bt.eB >= 0 ? bt.eB : (byte) 0]);
                                    break;
                                }
                            }
                        } else if (a.e.k == 111 && a.e.j == 0) {
                            a.e.k = a.e.j;
                            break;
                        }
                        break;
                    case 8194:
                        bt.b = this.b.readUTF();
                        bt.d = this.b.readUTF();
                        break;
                    case 8195:
                        t.a("exec角色列表:");
                        bt.a(this.b);
                        this.a.b(bt.W != null ? bt.W.length : 0);
                        break;
                    case 8197:
                        bt.d(this.b);
                        if (a.e != null) {
                            a.e.aX = false;
                            if (a.e.k == 2 && a.e.l == 4) {
                                String strA = t.a(this.a.l, bt.aq);
                                t.a(this.a.l, bt.ap);
                                a.e.am = ca.a(new StringBuffer().append(bt.t[a.e.af].b).append(":已存入银两").append(strA).append("，现有银两").append(this.a.l.toString()).toString(), t.i, t.b == 176 ? 118 : 152, "\t");
                                a.e.ah = a.e.m == 1 ? bt.aq : bt.ap;
                            } else if (a.e.k == 37 && a.e.ao) {
                                a.e.p();
                                a.e.ao = false;
                            }
                            a.e.I.a();
                            break;
                        }
                        break;
                    case 8198:
                        int i = this.b.readByte();
                        if (i > 0) {
                            az[] azVarArr = new az[i];
                            for (int i2 = 0; i2 < i; i2++) {
                                azVarArr[i2] = new az();
                                azVarArr[i2].a(this.b);
                            }
                            bt.u.addElement(azVarArr);
                        }
                        ao.Q();
                        if (a.e != null) {
                            a.e.P();
                            break;
                        }
                        break;
                    case 8199:
                        b();
                        break;
                    case 8200:
                        bt.b(this.b);
                        break;
                    case 8201:
                        byte b = this.b.readByte();
                        bt.e(this.b);
                        if (b == 1) {
                            this.a.i();
                        } else if (b == 2 && a.e != null) {
                            a.e.e(0);
                        }
                        if (a.e == null || a.e.j != 4) {
                            if (a.e != null && a.e.k == 9) {
                                a.e.s();
                                break;
                            }
                        } else {
                            a.e.s();
                            break;
                        }
                        break;
                    case 8202:
                        bt.l(this.b);
                        if (a.e != null && a.e.k == 5) {
                            a.e.l = (short) 0;
                            a aVar = this.a;
                            this.a.k = (short) 7;
                            aVar.j = (short) 7;
                            break;
                        }
                        break;
                    case 8203:
                        this.b.readByte();
                        bt.n(this.b);
                        if (a.e.k == 12) {
                            if (this.a.as.a == 0) {
                                a.e.a((byte) 1, true);
                                break;
                            } else if (this.a.as.a == 1) {
                                a.e.a((byte) 0, true);
                                break;
                            }
                        }
                        break;
                    case 8204:
                        a(this.b);
                        break;
                    case 8205:
                        bt.A(this.b);
                        break;
                    case 8206:
                        b(this.b);
                        break;
                    case 8207:
                        if (!ao.i()) {
                            if (wVar != null) {
                                this.d = wVar.a();
                            }
                            try {
                                if (this.b != null) {
                                    this.b.close();
                                }
                                if (this.c != null) {
                                    this.c.close();
                                    return;
                                }
                                return;
                            } catch (IOException e2) {
                                e2.printStackTrace();
                                return;
                            }
                        }
                        bt.g(this.b);
                        a.e.l = (short) 0;
                        a.e.m();
                        break;
                    case 8208:
                        byte b2 = this.b.readByte();
                        bt.b(this.b, b2);
                        if (b2 == 1) {
                            a.e.M.y();
                            break;
                        } else {
                            a.e.N();
                            break;
                        }
                    case 8209:
                        c();
                        if (a.e.k == 0) {
                            a.e.l = (short) 0;
                            a.e.m();
                            break;
                        }
                        break;
                    case 8210:
                        bt.t(this.b);
                        if (a.e == null) {
                            if (wVar != null) {
                                this.d = wVar.a();
                            }
                            try {
                                if (this.b != null) {
                                    this.b.close();
                                }
                                if (this.c != null) {
                                    this.c.close();
                                    return;
                                }
                                return;
                            } catch (IOException e3) {
                                e3.printStackTrace();
                                return;
                            }
                        }
                        if (a.e.k != 12 || a.e.l < 6) {
                            if (a.e.k == 4 && a.e.l >= 8) {
                                if (this.a.j != 2) {
                                    this.a.j = this.a.k;
                                }
                                a.e.a(bt.en);
                                a.e.l = (short) 8;
                                break;
                            }
                        } else {
                            if (this.a.j != 2) {
                                this.a.j = this.a.k;
                            }
                            a.e.l = (short) 6;
                            a.e.a(bt.en);
                            break;
                        }
                        break;
                    case 8211:
                        bt.D(this.b);
                        a.e.a(bt.fs);
                        a.e.a(bt.fl);
                        if (this.a.j == 1) {
                            this.a.j = this.a.k;
                            break;
                        }
                        break;
                    case 8212:
                        bt.E(this.b);
                        if (this.a.j == 1) {
                            this.a.j = this.a.k;
                            break;
                        }
                        break;
                    case 8213:
                        bt.q(this.b);
                        if (a.e != null) {
                            if (!ao.i() || a.e.k == 20) {
                                this.a.az = false;
                                a.e.b(bt.dT[1], bt.dX);
                                if (wVar != null) {
                                    this.d = wVar.a();
                                }
                                try {
                                    if (this.b != null) {
                                        this.b.close();
                                    }
                                    if (this.c != null) {
                                        this.c.close();
                                        return;
                                    }
                                    return;
                                } catch (IOException e4) {
                                    e4.printStackTrace();
                                    return;
                                }
                            }
                            if (this.a.j != 2) {
                                a.e.a(a.e.k);
                                break;
                            } else {
                                this.a.az = true;
                                break;
                            }
                        }
                        break;
                    case 8214:
                        int i3 = this.b.readByte();
                        if (i3 > 0) {
                            ce[] ceVarArr = new ce[i3];
                            for (int i4 = 0; i4 < i3; i4++) {
                                ceVarArr[i4] = new ce();
                                ceVarArr[i4].a(this.b);
                            }
                            if (a.e != null) {
                                a.e.a(ceVarArr);
                                break;
                            }
                        }
                        break;
                    case 8215:
                        bt.B(this.b);
                        if (!ao.i()) {
                            this.a.b("战斗中不能进行该操作");
                            if (wVar != null) {
                                this.d = wVar.a();
                            }
                            try {
                                if (this.b != null) {
                                    this.b.close();
                                }
                                if (this.c != null) {
                                    this.c.close();
                                    return;
                                }
                                return;
                            } catch (IOException e5) {
                                e5.printStackTrace();
                                return;
                            }
                        }
                        a.e.v();
                        break;
                    case 8216:
                        bt.m(this.b);
                        if (bt.cG == null || bt.cG.length <= 0) {
                            this.a.b("该玩家没有武器装备!");
                            break;
                        } else {
                            if (!ao.i()) {
                                this.a.b("战斗中不能进行该操作");
                                if (wVar != null) {
                                    this.d = wVar.a();
                                }
                                try {
                                    if (this.b != null) {
                                        this.b.close();
                                    }
                                    if (this.c != null) {
                                        this.c.close();
                                        return;
                                    }
                                    return;
                                } catch (IOException e6) {
                                    e6.printStackTrace();
                                    return;
                                }
                            }
                            a.e.w();
                            break;
                        }
                    case 8217:
                        e();
                        if (a.e.k == 100) {
                            a.e.N();
                            break;
                        } else if (a.e.k == 7) {
                            a.e.b((byte) a.e.aV);
                            break;
                        }
                        break;
                    case 8218:
                        long j = this.b.readLong();
                        byte b3 = this.b.readByte();
                        if (j == -1) {
                            if (a.e.g != null) {
                                bt.v = -1L;
                                bt.x = (short) -1;
                                a.e.g.l();
                            }
                        } else if (bq.g > 0 || j == bt.v) {
                            if (b3 == 0) {
                                a.e.g.f = (short) 7;
                                bt.v = -1L;
                                bt.x = (short) -1;
                            } else {
                                bt.v = -1L;
                                bt.x = (short) -1;
                            }
                        } else if (a.e.g != null) {
                            bt.v = -1L;
                            bt.x = (short) -1;
                            a.e.g.l();
                        }
                        bt.a();
                        if (bt.bu) {
                            a.e.X.b();
                            break;
                        }
                        break;
                    case 8219:
                        byte b4 = this.b.readByte();
                        this.b.readLong();
                        bt.C(this.b);
                        if (ao.i()) {
                            if (b4 == 0) {
                                bt.N();
                            } else if (b4 == 1) {
                                bt.x();
                            }
                            a.e.b(b4, false);
                            break;
                        } else {
                            a.e.g(b4);
                            break;
                        }
                    case 8220:
                        f();
                        break;
                    case 8221:
                        bt.F(this.b);
                        break;
                    case 8222:
                        t.a("exec宠物列表:");
                        d();
                        break;
                    case 8223:
                        if (!ao.i()) {
                            bt.h(this.b);
                            if (wVar != null) {
                                this.d = wVar.a();
                            }
                            try {
                                if (this.b != null) {
                                    this.b.close();
                                }
                                if (this.c != null) {
                                    this.c.close();
                                    return;
                                }
                                return;
                            } catch (IOException e7) {
                                e7.printStackTrace();
                                return;
                            }
                        }
                        if (ao.i()) {
                            bt.h(this.b);
                            if (a.e.k == 6) {
                                if (bt.bR != null || bt.bL != null) {
                                    a.e.x();
                                    break;
                                } else {
                                    this.a.b("当前没有任务");
                                    break;
                                }
                            }
                        }
                        break;
                    case 8224:
                        bt.bH = this.b.readUTF();
                        if (a.e.k == 6) {
                            this.a.aq.b();
                            this.a.aq.a("任务详细");
                            this.a.at.a(bt.bH, t.i, (byte) 2);
                            this.a.at.a((byte) 0);
                            this.a.au.a("确定");
                            this.a.aq.a(this.a.at);
                            this.a.aq.a(this.a.au);
                            this.a.aq.a(t.f, t.g, t.d, t.e);
                            this.a.j = this.a.k;
                            a.e.l = (short) 3;
                            break;
                        }
                        break;
                    case 8225:
                        bt.i(this.b);
                        if (bt.bW) {
                            a.e.F();
                            break;
                        }
                        break;
                    case 8226:
                        bt.J(this.b);
                        if (bt.gS != null) {
                            if (!ao.i()) {
                                this.a.b("战斗中不能查看周围玩家");
                                if (wVar != null) {
                                    this.d = wVar.a();
                                }
                                try {
                                    if (this.b != null) {
                                        this.b.close();
                                    }
                                    if (this.c != null) {
                                        this.c.close();
                                        return;
                                    }
                                    return;
                                } catch (IOException e8) {
                                    e8.printStackTrace();
                                    return;
                                }
                            }
                            if (a.e.j != 7) {
                                a.e.b((byte) 0);
                                break;
                            } else {
                                a.e.b((byte) a.e.aV);
                                break;
                            }
                        } else {
                            this.a.b("附近没有玩家!");
                            break;
                        }
                    case 8227:
                        bt.j(this.b);
                        if (bt.cs == null) {
                            this.a.b("没有可传送的目的地!");
                            break;
                        } else if (a.e.k == 1 || a.e.k == 100) {
                            a.e.a(false);
                            break;
                        }
                        break;
                    case 8228:
                        bt.s(this.b);
                        if (bt.gs != null) {
                            a.e.J();
                            break;
                        } else {
                            if (a.e.aM > 1) {
                                ao aoVar2 = a.e;
                                aoVar2.aM--;
                                this.a.b("没有更多的宠物了！");
                            } else {
                                bt.t();
                            }
                            this.a.j = this.a.k;
                            this.a.b("找不到您搜索的宠物!");
                            break;
                        }
                    case 8229:
                        c(this.b);
                        break;
                    case 8230:
                        bt.H(this.b);
                        a.e.C();
                        break;
                    case 8231:
                        bt.r(this.b);
                        if (bt.dY != null) {
                            a.e.I();
                            break;
                        } else if (a.e.aM > 1) {
                            ao aoVar3 = a.e;
                            aoVar3.aM--;
                            this.a.b("没有更多的物品了！");
                            this.a.j = this.a.k;
                            break;
                        } else {
                            this.a.b("拍卖场没有对应物品!");
                            a.e.j = (short) 14;
                            break;
                        }
                    case 8232:
                        bt.k(this.b);
                        if (a.e.k == 11) {
                            if (bt.ct == null) {
                                this.a.b("仓库没有物品");
                                break;
                            } else {
                                a.e.G();
                                break;
                            }
                        }
                        break;
                    case 8233:
                        bt.G(this.b);
                        if (a.e.j == 35) {
                            if (bt.gs != null) {
                                a.e.D();
                                if (this.a.j != 2) {
                                    this.a.j = this.a.k;
                                    break;
                                }
                            } else {
                                this.a.b("没有寄养宠物!");
                                break;
                            }
                        }
                        break;
                    case 8234:
                        bt.o(this.b);
                        if (a.e.k == 29 && bt.dE != null) {
                            a.e.i(a.e.aE > bt.dE.length + (-1) ? bt.dE.length - 1 : a.e.aE);
                            break;
                        }
                        break;
                    case 8235:
                        if (ao.i()) {
                            bt.p(this.b);
                        } else {
                            bt.s();
                        }
                        if (!bt.dJ) {
                            if (wVar != null) {
                                this.d = wVar.a();
                            }
                            try {
                                if (this.b != null) {
                                    this.b.close();
                                }
                                if (this.c != null) {
                                    this.c.close();
                                    return;
                                }
                                return;
                            } catch (IOException e9) {
                                e9.printStackTrace();
                                return;
                            }
                        }
                        if (!ao.i()) {
                            if (wVar != null) {
                                this.d = wVar.a();
                            }
                            try {
                                if (this.b != null) {
                                    this.b.close();
                                }
                                if (this.c != null) {
                                    this.c.close();
                                    return;
                                }
                                return;
                            } catch (IOException e10) {
                                e10.printStackTrace();
                                return;
                            }
                        }
                        a.e.p(0);
                        break;
                    case 8236:
                        bt.p(this.b);
                        if (a.e.k != 7) {
                            a.e.p(2);
                            break;
                        }
                        break;
                    case 8238:
                        bt.v(this.b);
                        if (!ao.aj || bt.ev) {
                            if (bt.ew != null) {
                                a.e.a(a.e.k, (byte) 1);
                                break;
                            } else {
                                bt.u();
                                break;
                            }
                        }
                        break;
                    case 8239:
                        if (this.b.readByte() == 0) {
                            bt.bt = false;
                        } else {
                            bt.bt = true;
                        }
                        bq.k();
                        if (a.e != null) {
                            a.e.d(false);
                            break;
                        }
                        break;
                    case 8240:
                        bt.z(this.b);
                        a.e.f((byte) 1);
                        break;
                    case 8241:
                        bt.L(this.b);
                        break;
                    case 8242:
                        bt.K(this.b);
                        break;
                    case 8243:
                        bt.a(this.b, this.b.readByte());
                        if (bt.db == null || bt.db.length <= 0) {
                            this.a.b("宠物没有技能!");
                            break;
                        } else {
                            a.e.a(bt.fz[a.e.ay] == 0, false);
                            break;
                        }
                    case 8244:
                        bt.u(this.b);
                        if (a.e == null) {
                            if (wVar != null) {
                                this.d = wVar.a();
                            }
                            try {
                                if (this.b != null) {
                                    this.b.close();
                                }
                                if (this.c != null) {
                                    this.c.close();
                                    return;
                                }
                                return;
                            } catch (IOException e11) {
                                e11.printStackTrace();
                                return;
                            }
                        }
                        if (a.e.k == 36 && a.e.l >= 2) {
                            if (this.a.j != 2) {
                                this.a.j = this.a.k;
                            }
                            a.e.l = (short) 2;
                            a.e.a(bt.et);
                            break;
                        }
                        break;
                    case 8245:
                        bt.aI(this.b);
                        if (this.b.readByte() == 1) {
                            this.a.e();
                            break;
                        }
                        break;
                    case 8246:
                        bt.N(this.b);
                        break;
                    case 8247:
                        bt.z = this.b.readByte();
                        if (a.e != null) {
                            if (a.e.k == 3) {
                                a.e.a((byte) 2);
                            }
                            if (a.e.k == 100) {
                                a.e.N();
                                break;
                            }
                        }
                        break;
                    case 8248:
                        bt.A = this.b.readByte();
                        if (a.e != null) {
                            a.e.d(false);
                            break;
                        }
                        break;
                    case 8249:
                        bt.B = this.b.readByte();
                        if (a.e != null) {
                            a.e.d(false);
                            break;
                        }
                        break;
                    case 8250:
                        a();
                        if (a.e != null) {
                            a.e.d(false);
                            break;
                        }
                        break;
                    case 8251:
                        bt.D = this.b.readByte();
                        if (a.e != null) {
                            a.e.d(false);
                            break;
                        }
                        break;
                    case 8252:
                        byte b5 = this.b.readByte();
                        bt.f(this.b);
                        if (b5 == 1) {
                            this.a.i();
                        }
                        if (a.e == null || a.e.j != 4) {
                            if (a.e != null && a.e.k == 9) {
                                a.e.s();
                                break;
                            }
                        } else {
                            a.e.s();
                            break;
                        }
                        break;
                    case 8253:
                        bt.aD(this.b);
                        if (a.e.k != 20) {
                            a.e.Y();
                            break;
                        }
                        break;
                    case 8254:
                        bt.aE(this.b);
                        a.e.c(a.e.k);
                        break;
                    case 8255:
                        bt.aG(this.b);
                        a.e.Z();
                        break;
                    case 8257:
                        bt.E = this.b.readByte();
                        if (a.e != null) {
                            a.e.d(false);
                            break;
                        }
                        break;
                    case 8258:
                        bt.aH(this.b);
                        if (a.e.j != 4 && a.e.j != 33) {
                            a.e.ah();
                            break;
                        }
                        break;
                    case 8259:
                        bt.Y(this.b);
                        if (a.e.k == 2) {
                            a.e.M.b(false);
                            break;
                        } else if (a.e.k == 50) {
                            this.a.at.b(bt.iI[this.a.ar.g()], t.i, (byte) 2);
                            this.a.at.a((byte) 1);
                            break;
                        }
                        break;
                    case 8260:
                        int i5 = this.b.readInt();
                        if (i5 > 0) {
                            byte[] bArr = new byte[i5];
                            bt.kX = this.b.readUTF();
                            this.b.read(bArr);
                            a.ae = new bu(bt.kX, bArr);
                        }
                        bt.aJ(this.b);
                        break;
                    case 8261:
                        bt.aK(this.b);
                        if (this.b.readByte() == 1) {
                            this.a.f();
                        }
                        if (bt.bs == 0) {
                            this.a.n();
                            this.a.a = 0;
                            this.a.b = 0;
                            this.a.d.a();
                            break;
                        }
                        break;
                    case 8264:
                        boolean z = this.b.readByte() != 0;
                        bt.bu = z;
                        if (z) {
                            ab.b = true;
                        }
                        if (a.e != null && a.e.X != null) {
                            a.e.X.b();
                        }
                        if (a.e.k == 100) {
                            a.e.N();
                            break;
                        }
                        break;
                    case 8265:
                        bt.bv = this.b.readInt();
                        break;
                    case 8267:
                        bt.bz = this.b.readUTF();
                        bt.by = this.b.readUTF();
                        if (a.e != null) {
                            a.e.aa();
                            break;
                        }
                        break;
                    case 8269:
                        if (a.e != null) {
                            a.e.U.a(this.b);
                            a.e.U.a(false);
                            break;
                        }
                        break;
                    case 8270:
                        if (a.e != null) {
                            a.e.O.b(this.b);
                            a.e.O.a(false);
                            break;
                        }
                        break;
                    case 8271:
                        bt.aR(this.b);
                        if (a.e != null) {
                            if (bt.mq < 4) {
                                a.e.ae();
                                break;
                            } else if (bt.mq != 4 && bt.mq != 5) {
                                if (bt.mq == 6) {
                                    this.a.j = this.a.k;
                                    break;
                                }
                            } else {
                                a.e.N();
                                break;
                            }
                        }
                        break;
                    case 8272:
                        if (a.e != null) {
                            a.e.N();
                            break;
                        }
                        break;
                    case 8273:
                        a.e.J = this.b.readUTF();
                        ca.h = 0;
                        if (!a.e.c && a.e.k != 0 && a.e.k != 25) {
                            a aVar2 = this.a;
                            this.a.k = (short) 7;
                            aVar2.j = (short) 7;
                            a.e.N();
                            break;
                        }
                        break;
                    case 8274:
                        int i6 = this.b.readInt();
                        int i7 = this.b.readInt();
                        if (a.e.k != 0 && a.e.k != 25 && bt.H == null) {
                            a aVar3 = this.a;
                            this.a.k = (short) 7;
                            aVar3.j = (short) 7;
                            a.e.N();
                        }
                        this.a.b(i6 + 8, i7 + 16);
                        break;
                    case 8275:
                        byte b6 = this.b.readByte();
                        bt.F = null;
                        bt.G = null;
                        if (b6 == 1) {
                            bt.F = this.b.readUTF();
                            bt.G = this.b.readUTF();
                        }
                        a aVar4 = this.a;
                        this.a.k = (short) 7;
                        aVar4.j = (short) 7;
                        break;
                    case 8277:
                        if (a.e != null && a.e.P != null) {
                            a.e.P.a(this.b);
                            a.e.P.a(false);
                            break;
                        }
                        break;
                    case 8278:
                        bt.Z(this.b);
                        a.e.M.n();
                        break;
                    case 8280:
                        bt.p(this.b);
                        if (a.e.k != 7) {
                            a.e.p(1);
                            break;
                        }
                        break;
                    case 8286:
                        bt.l = this.b.readByte();
                        String utf = this.b.readUTF();
                        bt.k = utf;
                        if (utf != null) {
                            a.e.ab();
                            break;
                        }
                        break;
                    case 8288:
                        a.aH = this.b.readUTF();
                        a.aI = this.b.readUTF();
                        this.a.q();
                        break;
                    case 8290:
                        bt.b = this.b.readUTF();
                        bt.d = this.b.readUTF();
                        if (t.a == 1) {
                            this.b.readUTF();
                            bt.m = this.b.readUTF();
                            break;
                        }
                        break;
                    case 8291:
                        byte b7 = this.b.readByte();
                        bt.aa(this.b);
                        if (a.e.k == 115) {
                            a.e.M.p();
                            if (b7 == 3 || b7 == 4) {
                                this.a.at.a((byte) 1);
                            }
                            if (b7 == 5) {
                                this.a.i();
                                break;
                            }
                        }
                        break;
                    case 8293:
                        if (a.e != null && a.e.Q != null) {
                            a.e.Q.a(this.b);
                            a.e.Q.a(false);
                            break;
                        }
                        break;
                    case 8294:
                        if (a.e != null) {
                            if (t.a == 0) {
                                if (bt.jy != 1) {
                                    this.a.b("充值卡充值暂时关闭");
                                    break;
                                }
                            } else if (bt.jy == 1) {
                                c.g();
                                break;
                            } else {
                                this.a.b("充值功能暂时关闭");
                                break;
                            }
                        }
                        break;
                    case 8295:
                        t.a("exec宠物升星");
                        bt.aS(this.b);
                        if (a.e != null) {
                            a.e.e(false);
                            break;
                        }
                        break;
                    case 8296:
                        t.a("exec抽奖");
                        bt.aW(this.b);
                        a.e.am();
                        break;
                    case 8297:
                        t.a("exec抽奖结果");
                        bt.aX(this.b);
                        if (a.e.k == 127) {
                            a.e.am();
                            this.a.b(new StringBuffer().append("恭喜您，抽中了").append(bt.nj).append("×").append(bt.nk).toString());
                            break;
                        }
                        break;
                    case 8298:
                        t.a("exec宠物升星结果");
                        bt.bc(this.b);
                        if (bt.nB == 1) {
                            this.a.b("升星成功");
                            break;
                        } else {
                            this.a.b("升星失败");
                            break;
                        }
                    case 8300:
                        if (a.e != null) {
                            a.e.O.b(this.b);
                            a.e.O.a(false);
                            break;
                        }
                        break;
                    case 8301:
                        if (a.e != null) {
                            a.e.V.a(this.b);
                            a.e.V.a(false);
                            break;
                        }
                        break;
                    case 8302:
                        if (a.e.N == null) {
                            a.e.N = new cc(a.e, this.a);
                        }
                        a.e.N.a(this.b);
                        a.e.N.a((short) 0);
                        break;
                    case 8303:
                        t.a("宠物继承");
                        cg.a(cg.b);
                        cg.a(this.b);
                        a.e.W.b();
                        break;
                    case 8304:
                        if (this.b.readInt() == 1) {
                            if (a.e.N == null) {
                                a.e.N = new cc(a.e, this.a);
                            }
                            a.e.N.b(this.b);
                            a.e.N.a((short) 2);
                            break;
                        }
                        break;
                    case 8448:
                        if (this.b.readByte() == 1) {
                            this.a.c();
                            break;
                        }
                        break;
                    case 8449:
                        bt.O(this.b);
                        a.e.i((byte) 0);
                        break;
                    case 8450:
                        bt.P(this.b);
                        if (a.e.k == 1) {
                            a.e.X();
                            break;
                        } else {
                            a.e.k((byte) 1);
                            break;
                        }
                    case 8451:
                        bt.O(this.b);
                        a.e.i((byte) 2);
                        break;
                    case 8452:
                        bt.P(this.b);
                        a.e.k((byte) 3);
                        break;
                    case 8453:
                        bt.S(this.b);
                        if (a.e != null) {
                            a.e.U();
                            break;
                        }
                        break;
                    case 8454:
                        bt.O(this.b);
                        if (a.e.as != 5 && a.e.aZ != 4 && a.e.as != 9 && a.e.as != 10) {
                            a.e.i((byte) 4);
                            break;
                        } else {
                            if (a.e.aZ == 4) {
                                a.e.aZ = (byte) -1;
                            }
                            a.e.j((byte) 6);
                            this.a.j = this.a.k;
                            ao aoVar4 = a.e;
                            a.e.k = (short) 38;
                            aoVar4.j = (short) 38;
                            break;
                        }
                        break;
                    case 8455:
                        bt.P(this.b);
                        a.e.k((byte) 5);
                        break;
                    case 8456:
                        String utf2 = this.b.readUTF();
                        if (a.e != null) {
                            a.e.d(utf2);
                            break;
                        }
                        break;
                    case 8704:
                        bt.T(this.b);
                        if (bt.ik == null || bt.ik.length <= 0) {
                            this.a.b("没有等待响应的帮派!");
                            break;
                        } else {
                            a.e.M.b();
                            break;
                        }
                        break;
                    case 8705:
                        bt.W(this.b);
                        a.e.M.h(0);
                        break;
                    case 8706:
                        bt.X(this.b);
                        a.e.M.h(1);
                        break;
                    case 8708:
                        bt.U(this.b);
                        if (bt.ip != null) {
                            a.e.M.c();
                            break;
                        } else {
                            this.a.b("没有帮派发布招募!");
                            break;
                        }
                    case 8709:
                        bt.V(this.b);
                        if (bt.it != null) {
                            a.e.M.f();
                            break;
                        } else {
                            this.a.b("没有申请入帮玩家!");
                            break;
                        }
                    case 8710:
                        bt.W(this.b);
                        if (bt.iy != null) {
                            a.e.M.i();
                            break;
                        } else if (a.e.M.g == 1) {
                            a.e.M.a(true);
                            break;
                        } else if (a.e.M.g == 0) {
                            a.e.k();
                            a.e.c(4);
                            break;
                        }
                        break;
                    case 8711:
                        bt.ab(this.b);
                        a.e.M.j();
                        break;
                    case 8712:
                        bt.ac(this.b);
                        a.e.M.k();
                        break;
                    case 8713:
                        bt.ad(this.b);
                        a.e.M.l();
                        break;
                    case 8714:
                        bt.ae(this.b);
                        if (bt.jo != null) {
                            a.e.M.s();
                            break;
                        } else {
                            this.a.b("没有可购买的设施!");
                            break;
                        }
                    case 8715:
                        bt.ag(this.b);
                        if (a.e != null) {
                            a.e.U();
                            break;
                        }
                        break;
                    case 8716:
                        bt.af(this.b);
                        a.e.M.t();
                        break;
                    case 8717:
                        bt.ah(this.b);
                        if (bt.jz != null) {
                            a.e.W();
                            break;
                        } else {
                            this.a.b("增值仓库没有物品!");
                            break;
                        }
                    case 8718:
                        bt.ai(this.b);
                        a.e.a((byte) 3);
                        break;
                    case 8722:
                        bt.jv = this.b.readByte() == 1;
                        bt.jw = this.b.readByte() == 1;
                        bt.jx = this.b.readByte();
                        bt.jy = this.b.readByte();
                        break;
                    case 8723:
                        bt.f = System.currentTimeMillis();
                        bt.g = false;
                        if (bt.f - bt.e <= 800) {
                            bt.h = (byte) 0;
                            break;
                        } else if (bt.f - bt.e <= 2000) {
                            bt.h = (byte) 1;
                            break;
                        } else {
                            bt.h = (byte) 2;
                            break;
                        }
                    case 8724:
                        bt.aj(this.b);
                        if (!ao.i()) {
                            this.a.b("战斗中不能进行该操作");
                            if (wVar != null) {
                                this.d = wVar.a();
                            }
                            try {
                                if (this.b != null) {
                                    this.b.close();
                                }
                                if (this.c != null) {
                                    this.c.close();
                                    return;
                                }
                                return;
                            } catch (IOException e12) {
                                e12.printStackTrace();
                                return;
                            }
                        }
                        if (a.e == null) {
                            if (wVar != null) {
                                this.d = wVar.a();
                            }
                            try {
                                if (this.b != null) {
                                    this.b.close();
                                }
                                if (this.c != null) {
                                    this.c.close();
                                    return;
                                }
                                return;
                            } catch (IOException e13) {
                                e13.printStackTrace();
                                return;
                            }
                        }
                        a.e.c(false);
                        break;
                    case 8725:
                        bt.ak(this.b);
                        a.e.l((byte) 0);
                        break;
                    case 8726:
                        bt.H(this.b);
                        a.e.C();
                        break;
                    case 8727:
                        bt.al(this.b);
                        a.e.l((byte) 2);
                        break;
                    case 8728:
                        bt.an(this.b);
                        a.e.C();
                        break;
                    case 8729:
                        bt.aF(this.b);
                        break;
                    case 8730:
                        bt.at(this.b);
                        break;
                    case 8731:
                        bt.aw(this.b);
                        break;
                    case 8732:
                        bt.av(this.b);
                        if (o.e == 1) {
                            a.e.O.a((int) a.e.O.a, a.e.O.c, a.e.O.d);
                            break;
                        } else {
                            a.e.O.a(0, (short) -1, -1);
                            break;
                        }
                    case 8733:
                        o.a(this.b);
                        a.e.O.c();
                        break;
                    case 8734:
                        bt.Q(this.b);
                        if (a.e.as != 3 && a.e.as != 8 && a.e.as != 7 && a.e.as != 2) {
                            if (a.e.as == 4 || a.e.as == 5 || a.e.as == 6 || a.e.as == 10) {
                                a.e.i((byte) 9);
                                break;
                            }
                        } else {
                            a.e.i((byte) 7);
                            break;
                        }
                        break;
                    case 8735:
                        bt.R(this.b);
                        if (a.e.as != 7 && a.e.as != 2 && a.e.as != 3 && a.e.as != 8) {
                            if (a.e.as == 9 || a.e.as == 4 || a.e.as == 5 || a.e.as == 6) {
                                a.e.i((byte) 10);
                                break;
                            }
                        } else {
                            a.e.i((byte) 8);
                            break;
                        }
                        break;
                    case 8736:
                        bt.aP(this.b);
                        if (a.e == null || !a.e.ad()) {
                            if (a.e != null && (bt.lt[0] == 0 || bt.lt[0] == 1 || bt.lt[0] == 2)) {
                                a.e.e((byte) 0);
                                bt.lt[0] = -1;
                                break;
                            }
                        } else {
                            a.e.e((byte) 0);
                            bt.lt[0] = -1;
                            break;
                        }
                        break;
                    case 8737:
                        if (a.e != null) {
                            byte[] bArrA = bz.a((short) 4255, bt.lt, bt.ad);
                            if (bArrA != null) {
                                a.i.a(new w((short) 4255, bArrA));
                                break;
                            } else {
                                this.a.b("获取上传指令数据错误!");
                                break;
                            }
                        }
                        break;
                    case 8738:
                        bt.aO(this.b);
                        if (a.e == null || !a.e.ad()) {
                            if (a.e == null || bt.lt[1] != 1) {
                                if (a.e.e.j == 1) {
                                    a.e.e.j = this.a.k;
                                    break;
                                }
                            } else {
                                a.e.l = (short) 0;
                                a.e.c((byte) 0);
                                bt.lt[1] = -1;
                                break;
                            }
                        } else {
                            a.e.l = (short) 0;
                            a.e.c((byte) 0);
                            bt.lt[1] = -1;
                            break;
                        }
                        break;
                    case 8739:
                        bt.aN(this.b);
                        c.a("游客注册 第2步: ", "创建一哥哥通行证密码");
                        this.a.j = (short) 7;
                        break;
                    case 8960:
                        bt.ao(this.b);
                        if (a.e.M.p == 0) {
                            a.e.M.u();
                            break;
                        } else {
                            a.e.M.h(2);
                            break;
                        }
                    case 8961:
                        bt.ap(this.b);
                        a.e.f((byte) 2);
                        break;
                    case 8962:
                        bt.aq(this.b);
                        break;
                    case 8963:
                        bt.kj = this.b.readShort();
                        break;
                    case 8964:
                        bt.ar(this.b);
                        if (bt.kk != null) {
                            this.a.b(bt.kk);
                            this.a.a(false);
                            break;
                        }
                        break;
                    case 8965:
                        bt.as(this.b);
                        a.e.M.h(3);
                        break;
                    case 8966:
                        bt.ax(this.b);
                        a.e.M.w();
                        break;
                    case 8967:
                        bt.ay(this.b);
                        a.e.M.x();
                        break;
                    case 8968:
                        bt.aC(this.b);
                        bt.O.a();
                        break;
                    case 8969:
                        bt.aB(this.b);
                        if (a.e.k == 76) {
                            byte b8 = this.a.as.a;
                            int iG = this.a.ar.g();
                            a.e.d(b8);
                            this.a.ar.a(Math.min(iG, b8 == 0 ? bt.O.f.length : bt.P.b.length));
                            break;
                        }
                        break;
                    case 8970:
                        bt.a(this.b.readByte(), this.b);
                        break;
                    case 8971:
                        if (a.e.k == 111) {
                            if (wVar != null) {
                                this.d = wVar.a();
                            }
                            try {
                                if (this.b != null) {
                                    this.b.close();
                                }
                                if (this.c != null) {
                                    this.c.close();
                                    return;
                                }
                                return;
                            } catch (IOException e14) {
                                e14.printStackTrace();
                                return;
                            }
                        }
                        bt.au(this.b);
                        if (bt.Q.b != null && bt.Q.b.length() > 0) {
                            this.a.av.b();
                            bt.Q.a(this.a.av);
                            bt.Q.a();
                            bt.Q.b();
                            a.e.j = a.e.k;
                            a.e.k = (short) 111;
                            this.a.j = this.a.k;
                            break;
                        }
                        break;
                    case 8972:
                        bt.aA(this.b);
                        if (a.e.k == 76) {
                            byte b9 = this.a.as.a;
                            int iG2 = this.a.ar.g();
                            a.e.d(b9);
                            this.a.ar.a(iG2);
                        }
                        if (a.e.k == 111) {
                            if (this.a.j == 1) {
                                this.a.j = (short) 7;
                            }
                            if (a.e.j == 76) {
                                byte b10 = this.a.as.a;
                                int iG3 = this.a.ar.g();
                                a.e.d(b10);
                                this.a.ar.a(iG3);
                                break;
                            }
                        }
                        break;
                    case 8973:
                        bt.az(this.b);
                        bt.P.c();
                        a.e.u();
                        break;
                    case 8974:
                        t.a("exec特效查看");
                        bt.aT(this.b);
                        a.e.z();
                        break;
                    case 8975:
                        t.a("exec特效激活");
                        bt.aU(this.b);
                        a.e.B();
                        break;
                    case 8976:
                        t.a("exec特效消除");
                        bt.aV(this.b);
                        a.e.A();
                        break;
                    case 8977:
                        t.a("exec查看坐骑");
                        bt.aY(this.b);
                        a.e.al();
                        a.e.I.a(true);
                        break;
                    case 8978:
                        t.a("exec坐骑升星");
                        bt.aZ(this.b);
                        a.e.al();
                        break;
                    case 8979:
                        t.a("exec更换坐骑");
                        bt.ba(this.b);
                        a.e.al();
                        a.e.I.a(true);
                        break;
                    case 8981:
                        t.a("exec特效技能");
                        bt.bb(this.b);
                        a.e.an();
                        break;
                    case 8982:
                        t.a("exec宠物炼化需 求");
                        String[] strArr = new String[3];
                        bt.nC = strArr;
                        strArr[0] = this.b.readUTF();
                        bt.nC[1] = this.b.readUTF();
                        bt.nC[2] = this.b.readUTF();
                        a.e.l = (short) 11;
                        ca.h = 0;
                        this.a.j = this.a.k;
                        break;
                    case 9216:
                        v.a(this.b);
                        if (v.a != null) {
                            a.e.S.a(0);
                            break;
                        } else {
                            this.a.b("暂无求爱信息!");
                            break;
                        }
                    case 9217:
                        v.b(this.b);
                        if (v.b != null) {
                            a.e.S.b();
                            break;
                        } else {
                            this.a.b("求爱信息不存在!");
                            break;
                        }
                    case 9218:
                        v.c(this.b);
                        a.e.S.c();
                        break;
                    case 9219:
                        v.d(this.b);
                        a.e.S.d();
                        break;
                    case 9220:
                        v.e(this.b);
                        a.e.S.f();
                        break;
                    case 9221:
                        if (ao.i()) {
                            a aVar5 = this.a;
                            this.a.k = (short) 7;
                            aVar5.j = (short) 7;
                            ao aoVar5 = a.e;
                            a.e.k = (short) 0;
                            aoVar5.j = (short) 0;
                        }
                        this.a.b(this.b.readUTF());
                        break;
                    case 9222:
                        bt.aQ(this.b);
                        if (a.e != null) {
                            a.e.ac();
                            break;
                        }
                        break;
                    case 9223:
                        byte b11 = this.b.readByte();
                        if (a.e != null) {
                            if (b11 == 1) {
                                a.e.af();
                                break;
                            } else if (b11 == 2) {
                                a.e.ag();
                                break;
                            }
                        }
                        break;
                    case 9472:
                        bt.M(this.b);
                        if (t.a != 0 && !t.w) {
                            if (bt.hw) {
                                if (!bt.hw || bt.hA.length > 0) {
                                    a aVar6 = this.a;
                                    this.a.j = (short) 4;
                                    aVar6.k = (short) 4;
                                    this.a.a = 0;
                                    this.a.b = 0;
                                    this.a.a(0);
                                    this.a.a = 0;
                                    break;
                                } else {
                                    this.a.b("服务维护中，暂无可以进入的服务器");
                                    break;
                                }
                            } else if (bt.hA == null || bt.hA.length <= 0) {
                                this.a.b("服务维护中，暂无可以进入的服务器");
                                break;
                            } else {
                                this.a.d();
                                break;
                            }
                        } else {
                            this.a.d();
                            break;
                        }
                        break;
                    case 9473:
                        bt.lq = this.b.readByte();
                        bt.lp = this.b.readShort();
                        bt.kZ = this.b.readShort();
                        bt.lf = this.b.readUTF();
                        bt.lg = this.b.readByte();
                        short s = this.b.readShort();
                        bt.le = s;
                        if (s > 0) {
                            bt.aL(this.b);
                            a.e.d(bt.kZ);
                            break;
                        } else {
                            this.a.b("没有更多的成就!");
                            break;
                        }
                    case 9474:
                        bt.ls = this.b.readByte();
                        bt.lr = this.b.readShort();
                        bt.kZ = this.b.readShort();
                        this.b.readUTF();
                        this.b.readByte();
                        bt.lm = this.b.readByte();
                        bt.lh = this.b.readUTF();
                        short s2 = this.b.readShort();
                        bt.ll = s2;
                        if (s2 > 0) {
                            bt.aM(this.b);
                            a.e.e(bt.kZ);
                            break;
                        } else {
                            this.a.b("没有更多的成就!");
                            break;
                        }
                    case 9488:
                        bt.x(this.b);
                        a.e.ai();
                        break;
                    case 9489:
                        bt.y(this.b);
                        a.e.aj();
                        break;
                    case 9491:
                        t.a("exec 随机名称");
                        this.a.ay = this.b.readUTF();
                        if (this.a.k == 6) {
                            this.a.j = this.a.k;
                            break;
                        }
                        break;
                    case 9494:
                        if (a.e != null) {
                            if (a.e.R == null) {
                                a.e.R = new bd(a.e, a.e.e, a.f);
                            }
                            a.e.R.a(this.b);
                            a.e.R.a();
                            break;
                        }
                        break;
                    case 10496:
                        byte b12 = this.b.readByte();
                        this.b.readByte();
                        if (b12 == 4) {
                            String[] strArrA = z.a(this.b.readUTF(), ':');
                            bb.j = strArrA[0].trim();
                            bb.i = strArrA[1].trim();
                            bb.m = bb.j;
                            bb.n = bb.i;
                            bb.b();
                            this.a.b(this.b.readUTF());
                            break;
                        } else if (b12 == 2) {
                            String[] strArrA2 = z.a(this.b.readUTF(), ':');
                            bb.j = strArrA2[0].trim();
                            bb.i = strArrA2[1].trim();
                            bb.m = bb.j;
                            bb.n = bb.i;
                            bb.b();
                            this.a.b(this.b.readUTF());
                            break;
                        }
                        break;
                    case 12289:
                        byte b13 = this.b.readByte();
                        bt.ke = -1;
                        bt.kf = -1;
                        bt.kg = -1;
                        if (b13 == 0) {
                            bt.ke = this.b.readInt();
                            bt.kf = this.b.readInt();
                            bt.kg = this.b.readInt();
                            break;
                        }
                        break;
                }
                if (wVar != null) {
                    this.d = wVar.a();
                }
                try {
                    if (this.b != null) {
                        this.b.close();
                    }
                    if (this.c != null) {
                        this.c.close();
                    }
                } catch (IOException e15) {
                    e15.printStackTrace();
                }
            } catch (Exception e16) {
                e16.printStackTrace();
                this.a.a(e16, (byte) 5);
                if (wVar != null) {
                    this.d = wVar.a();
                }
                try {
                    if (this.b != null) {
                        this.b.close();
                    }
                    if (this.c != null) {
                        this.c.close();
                    }
                } catch (IOException e17) {
                    e17.printStackTrace();
                }
            }
        } catch (Throwable th) {
            if (wVar != null) {
                this.d = wVar.a();
            }
            try {
                if (this.b != null) {
                    this.b.close();
                }
                if (this.c != null) {
                    this.c.close();
                }
            } catch (IOException e18) {
                e18.printStackTrace();
            }
            throw th;
        }
    }
}

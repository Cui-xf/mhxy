package p000;

import com.yinhan.kjava.main.RunnableC0066a;
import java.io.DataInputStream;
import java.io.IOException;

/* renamed from: bl */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-4234804660425969496/classes.dex */
public final class C0039bl extends AbstractC0018ar {

    /* renamed from: A */
    private short f680A;

    /* renamed from: b */
    public String f685b;

    /* renamed from: c */
    public byte f686c;

    /* renamed from: n */
    public byte f687n;

    /* renamed from: o */
    public byte f688o;

    /* renamed from: p */
    public byte f689p;

    /* renamed from: q */
    public short f690q;

    /* renamed from: r */
    public short f691r;

    /* renamed from: s */
    public short f692s;

    /* renamed from: t */
    public short f693t;

    /* renamed from: u */
    public byte f694u;

    /* renamed from: v */
    public byte f695v;

    /* renamed from: w */
    private int f696w;

    /* renamed from: x */
    private String f697x;

    /* renamed from: y */
    private short f698y;

    /* renamed from: z */
    private short f699z;

    /* renamed from: a */
    public String f684a = "";

    /* renamed from: B */
    private boolean f681B = false;

    /* renamed from: C */
    private int[] f682C = new int[4];

    /* renamed from: D */
    private int[] f683D = new int[4];

    /* renamed from: a */
    private void m692a(boolean z) {
        if (this.f697x.equals("")) {
            this.f399g = RunnableC0066a.f2096ab.m997c(z ? this.f683D[this.f400h] : this.f682C[this.f400h]);
        } else {
            this.f399g = RunnableC0066a.f2096ab.m983a(z ? this.f683D[this.f400h] : this.f682C[this.f400h], this.f698y, this.f699z, this.f680A);
        }
        if (this.f399g != null || this.f681B) {
            return;
        }
        if (this.f697x.equals("")) {
            C0015ao.m137a(this.f686c, this.f687n, this.f688o, "", (short) 0, (short) 0, (short) 0);
        } else {
            C0015ao.m137a(this.f686c, this.f687n, this.f688o, this.f697x, this.f698y, this.f699z, this.f680A);
        }
        if (this.f697x.equals("")) {
            this.f399g = RunnableC0066a.f2096ab.m997c(z ? this.f683D[this.f400h] : this.f682C[this.f400h]);
        } else {
            this.f399g = RunnableC0066a.f2096ab.m983a(z ? this.f683D[this.f400h] : this.f682C[this.f400h], this.f698y, this.f699z, this.f680A);
        }
        this.f681B = true;
    }

    /* renamed from: a */
    public final int m693a(byte b, byte b2) {
        if (C0047bt.f937bw >= 1) {
            if (b == 2 || b == 3) {
                return 16711680;
            }
            if (b2 >= 0) {
                return 65280;
            }
            if (this.f685b != null && !this.f685b.equals("")) {
                return this.f696w;
            }
            if (b == 0) {
                return 16777215;
            }
            if (b == 1) {
                return 16776960;
            }
        }
        if (b2 >= 0) {
            return 65280;
        }
        if (this.f685b == null || this.f685b.equals("")) {
            return 16776960;
        }
        return this.f696w;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0045 A[Catch: Exception -> 0x0076, TryCatch #0 {Exception -> 0x0076, blocks: (B:3:0x0002, B:5:0x0006, B:7:0x000a, B:9:0x0012, B:11:0x0028, B:13:0x0032, B:15:0x003c, B:16:0x003f, B:18:0x0045, B:19:0x0063, B:20:0x0068, B:22:0x006c, B:36:0x009f, B:24:0x0072, B:28:0x007b, B:30:0x0085, B:32:0x008f, B:33:0x0092, B:34:0x0097, B:35:0x009b, B:37:0x00a4), top: B:39:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009b A[Catch: Exception -> 0x0076, TryCatch #0 {Exception -> 0x0076, blocks: (B:3:0x0002, B:5:0x0006, B:7:0x000a, B:9:0x0012, B:11:0x0028, B:13:0x0032, B:15:0x003c, B:16:0x003f, B:18:0x0045, B:19:0x0063, B:20:0x0068, B:22:0x006c, B:36:0x009f, B:24:0x0072, B:28:0x007b, B:30:0x0085, B:32:0x008f, B:33:0x0092, B:34:0x0097, B:35:0x009b, B:37:0x00a4), top: B:39:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009f A[Catch: Exception -> 0x0076, TryCatch #0 {Exception -> 0x0076, blocks: (B:3:0x0002, B:5:0x0006, B:7:0x000a, B:9:0x0012, B:11:0x0028, B:13:0x0032, B:15:0x003c, B:16:0x003f, B:18:0x0045, B:19:0x0063, B:20:0x0068, B:22:0x006c, B:36:0x009f, B:24:0x0072, B:28:0x007b, B:30:0x0085, B:32:0x008f, B:33:0x0092, B:34:0x0097, B:35:0x009b, B:37:0x00a4), top: B:39:0x0002 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m694a(C0023aw c0023aw, C0009ai c0009ai, long j) {
        byte b;
        try {
            if (this.f399g != null) {
                if (this.f398f == null || this.f398f.size() <= 3) {
                    m692a(true);
                    C0009ai.m43a(this.f399g, j);
                } else {
                    short[] sArr = (short[]) this.f398f.elementAt(this.f398f.size() - 1);
                    if (this.f401i == null) {
                        this.f401i = sArr;
                        b = -1;
                        if (b == -1) {
                            m692a(false);
                            this.f402j = sArr[0];
                            this.f403k = sArr[1];
                            m570r();
                            this.f398f.removeElementAt(this.f398f.size() - 1);
                        } else {
                            m692a(false);
                        }
                        C0009ai.m43a(this.f399g, j);
                    } else {
                        if (this.f401i[0] == sArr[0]) {
                            if (sArr[1] > this.f401i[1]) {
                                this.f400h = (byte) 3;
                            } else {
                                this.f400h = (byte) 1;
                            }
                            this.f401i = sArr;
                            b = this.f400h;
                        } else if (this.f401i[1] == sArr[1]) {
                            if (sArr[0] > this.f401i[0]) {
                                this.f400h = (byte) 2;
                            } else {
                                this.f400h = (byte) 0;
                            }
                            this.f401i = sArr;
                            b = this.f400h;
                        }
                        if (b == -1) {
                        }
                        C0009ai.m43a(this.f399g, j);
                    }
                }
                if (this.f396d != null) {
                    this.f396d.mo584a(c0023aw, c0009ai, j);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void m695a(DataInputStream dataInputStream) throws IOException {
        this.f684a = dataInputStream.readUTF();
        this.f397e = dataInputStream.readUTF();
        this.f685b = dataInputStream.readUTF();
        this.f696w = C0055ca.m1278a(dataInputStream.readByte());
        dataInputStream.readShort();
        this.f686c = dataInputStream.readByte();
        this.f687n = dataInputStream.readByte();
        short s = dataInputStream.readShort();
        this.f402j = s;
        this.f404l = s;
        short s2 = dataInputStream.readShort();
        this.f403k = s2;
        this.f405m = s2;
        this.f689p = dataInputStream.readByte();
        this.f690q = dataInputStream.readShort();
        this.f688o = dataInputStream.readByte();
        this.f697x = dataInputStream.readUTF();
        if (this.f690q > 0) {
            this.f691r = dataInputStream.readShort();
            this.f692s = dataInputStream.readShort();
            this.f693t = dataInputStream.readShort();
        }
        if (!this.f697x.equals("")) {
            this.f698y = dataInputStream.readShort();
            this.f699z = dataInputStream.readShort();
            this.f680A = dataInputStream.readShort();
        }
        this.f682C[1] = C0048bu.m955a(RunnableC0066a.m1391a(this.f686c, this.f687n, (byte) 1, this.f688o, false, this.f697x), (byte) 2);
        this.f683D[1] = C0048bu.m955a(RunnableC0066a.m1391a(this.f686c, this.f687n, (byte) 1, this.f688o, true, this.f697x), (byte) 2);
        this.f682C[3] = C0048bu.m955a(RunnableC0066a.m1391a(this.f686c, this.f687n, (byte) 3, this.f688o, false, this.f697x), (byte) 2);
        this.f683D[3] = C0048bu.m955a(RunnableC0066a.m1391a(this.f686c, this.f687n, (byte) 3, this.f688o, true, this.f697x), (byte) 2);
        this.f682C[0] = C0048bu.m955a(RunnableC0066a.m1391a(this.f686c, this.f687n, (byte) 0, this.f688o, false, this.f697x), (byte) 2);
        this.f683D[0] = C0048bu.m955a(RunnableC0066a.m1391a(this.f686c, this.f687n, (byte) 0, this.f688o, true, this.f697x), (byte) 2);
        this.f682C[2] = C0048bu.m955a(RunnableC0066a.m1391a(this.f686c, this.f687n, (byte) 2, this.f688o, false, this.f697x), (byte) 2);
        this.f683D[2] = C0048bu.m955a(RunnableC0066a.m1391a(this.f686c, this.f687n, (byte) 2, this.f688o, true, this.f697x), (byte) 2);
        m692a(true);
    }
}

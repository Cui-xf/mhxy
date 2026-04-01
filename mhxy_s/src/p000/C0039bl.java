package p000;

import com.yinhan.kjava.main.RunnableC0066a;
import java.io.DataInputStream;
import java.io.IOException;

/* renamed from: bl */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-5080095226433994817/classes.dex */
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
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m694a(p000.C0023aw r6, p000.C0009ai r7, long r8) {
        /*
            r5 = this;
            r1 = 3
            r2 = -1
            bc r0 = r5.f399g     // Catch: java.lang.Exception -> L76
            if (r0 == 0) goto L71
            java.util.Vector r0 = r5.f398f     // Catch: java.lang.Exception -> L76
            if (r0 == 0) goto La4
            java.util.Vector r0 = r5.f398f     // Catch: java.lang.Exception -> L76
            int r0 = r0.size()     // Catch: java.lang.Exception -> L76
            if (r0 <= r1) goto La4
            java.util.Vector r0 = r5.f398f     // Catch: java.lang.Exception -> L76
            java.util.Vector r1 = r5.f398f     // Catch: java.lang.Exception -> L76
            int r1 = r1.size()     // Catch: java.lang.Exception -> L76
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.elementAt(r1)     // Catch: java.lang.Exception -> L76
            short[] r0 = (short[]) r0     // Catch: java.lang.Exception -> L76
            short[] r0 = (short[]) r0     // Catch: java.lang.Exception -> L76
            short[] r1 = r5.f401i     // Catch: java.lang.Exception -> L76
            if (r1 == 0) goto L9b
            short[] r1 = r5.f401i     // Catch: java.lang.Exception -> L76
            r3 = 0
            short r1 = r1[r3]     // Catch: java.lang.Exception -> L76
            r3 = 0
            short r3 = r0[r3]     // Catch: java.lang.Exception -> L76
            if (r1 != r3) goto L7b
            r1 = 1
            short r1 = r0[r1]     // Catch: java.lang.Exception -> L76
            short[] r3 = r5.f401i     // Catch: java.lang.Exception -> L76
            r4 = 1
            short r3 = r3[r4]     // Catch: java.lang.Exception -> L76
            if (r1 <= r3) goto L72
            r1 = 3
            r5.f400h = r1     // Catch: java.lang.Exception -> L76
        L3f:
            r5.f401i = r0     // Catch: java.lang.Exception -> L76
            byte r1 = r5.f400h     // Catch: java.lang.Exception -> L76
        L43:
            if (r1 == r2) goto L9f
            r1 = 0
            r5.m692a(r1)     // Catch: java.lang.Exception -> L76
            r1 = 0
            short r1 = r0[r1]     // Catch: java.lang.Exception -> L76
            r5.f402j = r1     // Catch: java.lang.Exception -> L76
            r1 = 1
            short r0 = r0[r1]     // Catch: java.lang.Exception -> L76
            r5.f403k = r0     // Catch: java.lang.Exception -> L76
            r5.m570r()     // Catch: java.lang.Exception -> L76
            java.util.Vector r0 = r5.f398f     // Catch: java.lang.Exception -> L76
            java.util.Vector r1 = r5.f398f     // Catch: java.lang.Exception -> L76
            int r1 = r1.size()     // Catch: java.lang.Exception -> L76
            int r1 = r1 + (-1)
            r0.removeElementAt(r1)     // Catch: java.lang.Exception -> L76
        L63:
            bc r0 = r5.f399g     // Catch: java.lang.Exception -> L76
            p000.C0009ai.m43a(r0, r8)     // Catch: java.lang.Exception -> L76
        L68:
            au r0 = r5.f396d     // Catch: java.lang.Exception -> L76
            if (r0 == 0) goto L71
            au r0 = r5.f396d     // Catch: java.lang.Exception -> L76
            r0.mo584a(r6, r7, r8)     // Catch: java.lang.Exception -> L76
        L71:
            return
        L72:
            r1 = 1
            r5.f400h = r1     // Catch: java.lang.Exception -> L76
            goto L3f
        L76:
            r0 = move-exception
            r0.printStackTrace()
            goto L71
        L7b:
            short[] r1 = r5.f401i     // Catch: java.lang.Exception -> L76
            r3 = 1
            short r1 = r1[r3]     // Catch: java.lang.Exception -> L76
            r3 = 1
            short r3 = r0[r3]     // Catch: java.lang.Exception -> L76
            if (r1 != r3) goto L9b
            r1 = 0
            short r1 = r0[r1]     // Catch: java.lang.Exception -> L76
            short[] r3 = r5.f401i     // Catch: java.lang.Exception -> L76
            r4 = 0
            short r3 = r3[r4]     // Catch: java.lang.Exception -> L76
            if (r1 <= r3) goto L97
            r1 = 2
            r5.f400h = r1     // Catch: java.lang.Exception -> L76
        L92:
            r5.f401i = r0     // Catch: java.lang.Exception -> L76
            byte r1 = r5.f400h     // Catch: java.lang.Exception -> L76
            goto L43
        L97:
            r1 = 0
            r5.f400h = r1     // Catch: java.lang.Exception -> L76
            goto L92
        L9b:
            r5.f401i = r0     // Catch: java.lang.Exception -> L76
            r1 = r2
            goto L43
        L9f:
            r0 = 0
            r5.m692a(r0)     // Catch: java.lang.Exception -> L76
            goto L63
        La4:
            r0 = 1
            r5.m692a(r0)     // Catch: java.lang.Exception -> L76
            bc r0 = r5.f399g     // Catch: java.lang.Exception -> L76
            p000.C0009ai.m43a(r0, r8)     // Catch: java.lang.Exception -> L76
            goto L68
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0039bl.m694a(aw, ai, long):void");
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

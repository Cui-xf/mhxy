package defpackage;

import com.yinhan.kjava.main.a;
import java.io.DataInputStream;

/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-8105993946875401281/classes.dex */
public final class bl extends ar {
    private short A;
    public String b;
    public byte c;
    public byte n;
    public byte o;
    public byte p;
    public short q;
    public short r;
    public short s;
    public short t;
    public byte u;
    public byte v;
    private int w;
    private String x;
    private short y;
    private short z;
    public String a = "";
    private boolean B = false;
    private int[] C = new int[4];
    private int[] D = new int[4];

    private void a(boolean z) {
        if (this.x.equals("")) {
            this.g = a.ab.c(z ? this.D[this.h] : this.C[this.h]);
        } else {
            this.g = a.ab.a(z ? this.D[this.h] : this.C[this.h], this.y, this.z, this.A);
        }
        if (this.g != null || this.B) {
            return;
        }
        if (this.x.equals("")) {
            ao.a(this.c, this.n, this.o, "", (short) 0, (short) 0, (short) 0);
        } else {
            ao.a(this.c, this.n, this.o, this.x, this.y, this.z, this.A);
        }
        if (this.x.equals("")) {
            this.g = a.ab.c(z ? this.D[this.h] : this.C[this.h]);
        } else {
            this.g = a.ab.a(z ? this.D[this.h] : this.C[this.h], this.y, this.z, this.A);
        }
        this.B = true;
    }

    public final int a(byte b, byte b2) {
        if (bt.bw >= 1) {
            if (b == 2 || b == 3) {
                return 16711680;
            }
            if (b2 >= 0) {
                return 65280;
            }
            if (this.b != null && !this.b.equals("")) {
                return this.w;
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
        if (this.b == null || this.b.equals("")) {
            return 16776960;
        }
        return this.w;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0045 A[Catch: Exception -> 0x0076, TryCatch #0 {Exception -> 0x0076, blocks: (B:3:0x0002, B:5:0x0006, B:7:0x000a, B:9:0x0012, B:11:0x0028, B:13:0x0032, B:15:0x003c, B:16:0x003f, B:18:0x0045, B:19:0x0063, B:20:0x0068, B:22:0x006c, B:36:0x009f, B:24:0x0072, B:28:0x007b, B:30:0x0085, B:32:0x008f, B:33:0x0092, B:34:0x0097, B:35:0x009b, B:37:0x00a4), top: B:39:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009b A[Catch: Exception -> 0x0076, TryCatch #0 {Exception -> 0x0076, blocks: (B:3:0x0002, B:5:0x0006, B:7:0x000a, B:9:0x0012, B:11:0x0028, B:13:0x0032, B:15:0x003c, B:16:0x003f, B:18:0x0045, B:19:0x0063, B:20:0x0068, B:22:0x006c, B:36:0x009f, B:24:0x0072, B:28:0x007b, B:30:0x0085, B:32:0x008f, B:33:0x0092, B:34:0x0097, B:35:0x009b, B:37:0x00a4), top: B:39:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009f A[Catch: Exception -> 0x0076, TryCatch #0 {Exception -> 0x0076, blocks: (B:3:0x0002, B:5:0x0006, B:7:0x000a, B:9:0x0012, B:11:0x0028, B:13:0x0032, B:15:0x003c, B:16:0x003f, B:18:0x0045, B:19:0x0063, B:20:0x0068, B:22:0x006c, B:36:0x009f, B:24:0x0072, B:28:0x007b, B:30:0x0085, B:32:0x008f, B:33:0x0092, B:34:0x0097, B:35:0x009b, B:37:0x00a4), top: B:39:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.aw r6, defpackage.ai r7, long r8) {
        /*
            r5 = this;
            r1 = 3
            r2 = -1
            bc r0 = r5.g     // Catch: java.lang.Exception -> L76
            if (r0 == 0) goto L71
            java.util.Vector r0 = r5.f     // Catch: java.lang.Exception -> L76
            if (r0 == 0) goto La4
            java.util.Vector r0 = r5.f     // Catch: java.lang.Exception -> L76
            int r0 = r0.size()     // Catch: java.lang.Exception -> L76
            if (r0 <= r1) goto La4
            java.util.Vector r0 = r5.f     // Catch: java.lang.Exception -> L76
            java.util.Vector r1 = r5.f     // Catch: java.lang.Exception -> L76
            int r1 = r1.size()     // Catch: java.lang.Exception -> L76
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.elementAt(r1)     // Catch: java.lang.Exception -> L76
            short[] r0 = (short[]) r0     // Catch: java.lang.Exception -> L76
            short[] r0 = (short[]) r0     // Catch: java.lang.Exception -> L76
            short[] r1 = r5.i     // Catch: java.lang.Exception -> L76
            if (r1 == 0) goto L9b
            short[] r1 = r5.i     // Catch: java.lang.Exception -> L76
            r3 = 0
            short r1 = r1[r3]     // Catch: java.lang.Exception -> L76
            r3 = 0
            short r3 = r0[r3]     // Catch: java.lang.Exception -> L76
            if (r1 != r3) goto L7b
            r1 = 1
            short r1 = r0[r1]     // Catch: java.lang.Exception -> L76
            short[] r3 = r5.i     // Catch: java.lang.Exception -> L76
            r4 = 1
            short r3 = r3[r4]     // Catch: java.lang.Exception -> L76
            if (r1 <= r3) goto L72
            r1 = 3
            r5.h = r1     // Catch: java.lang.Exception -> L76
        L3f:
            r5.i = r0     // Catch: java.lang.Exception -> L76
            byte r1 = r5.h     // Catch: java.lang.Exception -> L76
        L43:
            if (r1 == r2) goto L9f
            r1 = 0
            r5.a(r1)     // Catch: java.lang.Exception -> L76
            r1 = 0
            short r1 = r0[r1]     // Catch: java.lang.Exception -> L76
            r5.j = r1     // Catch: java.lang.Exception -> L76
            r1 = 1
            short r0 = r0[r1]     // Catch: java.lang.Exception -> L76
            r5.k = r0     // Catch: java.lang.Exception -> L76
            r5.r()     // Catch: java.lang.Exception -> L76
            java.util.Vector r0 = r5.f     // Catch: java.lang.Exception -> L76
            java.util.Vector r1 = r5.f     // Catch: java.lang.Exception -> L76
            int r1 = r1.size()     // Catch: java.lang.Exception -> L76
            int r1 = r1 + (-1)
            r0.removeElementAt(r1)     // Catch: java.lang.Exception -> L76
        L63:
            bc r0 = r5.g     // Catch: java.lang.Exception -> L76
            defpackage.ai.a(r0, r8)     // Catch: java.lang.Exception -> L76
        L68:
            au r0 = r5.d     // Catch: java.lang.Exception -> L76
            if (r0 == 0) goto L71
            au r0 = r5.d     // Catch: java.lang.Exception -> L76
            r0.a(r6, r7, r8)     // Catch: java.lang.Exception -> L76
        L71:
            return
        L72:
            r1 = 1
            r5.h = r1     // Catch: java.lang.Exception -> L76
            goto L3f
        L76:
            r0 = move-exception
            r0.printStackTrace()
            goto L71
        L7b:
            short[] r1 = r5.i     // Catch: java.lang.Exception -> L76
            r3 = 1
            short r1 = r1[r3]     // Catch: java.lang.Exception -> L76
            r3 = 1
            short r3 = r0[r3]     // Catch: java.lang.Exception -> L76
            if (r1 != r3) goto L9b
            r1 = 0
            short r1 = r0[r1]     // Catch: java.lang.Exception -> L76
            short[] r3 = r5.i     // Catch: java.lang.Exception -> L76
            r4 = 0
            short r3 = r3[r4]     // Catch: java.lang.Exception -> L76
            if (r1 <= r3) goto L97
            r1 = 2
            r5.h = r1     // Catch: java.lang.Exception -> L76
        L92:
            r5.i = r0     // Catch: java.lang.Exception -> L76
            byte r1 = r5.h     // Catch: java.lang.Exception -> L76
            goto L43
        L97:
            r1 = 0
            r5.h = r1     // Catch: java.lang.Exception -> L76
            goto L92
        L9b:
            r5.i = r0     // Catch: java.lang.Exception -> L76
            r1 = r2
            goto L43
        L9f:
            r0 = 0
            r5.a(r0)     // Catch: java.lang.Exception -> L76
            goto L63
        La4:
            r0 = 1
            r5.a(r0)     // Catch: java.lang.Exception -> L76
            bc r0 = r5.g     // Catch: java.lang.Exception -> L76
            defpackage.ai.a(r0, r8)     // Catch: java.lang.Exception -> L76
            goto L68
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bl.a(aw, ai, long):void");
    }

    public final void a(DataInputStream dataInputStream) {
        this.a = dataInputStream.readUTF();
        this.e = dataInputStream.readUTF();
        this.b = dataInputStream.readUTF();
        this.w = ca.a(dataInputStream.readByte());
        dataInputStream.readShort();
        this.c = dataInputStream.readByte();
        this.n = dataInputStream.readByte();
        short s = dataInputStream.readShort();
        this.j = s;
        this.l = s;
        short s2 = dataInputStream.readShort();
        this.k = s2;
        this.m = s2;
        this.p = dataInputStream.readByte();
        this.q = dataInputStream.readShort();
        this.o = dataInputStream.readByte();
        this.x = dataInputStream.readUTF();
        if (this.q > 0) {
            this.r = dataInputStream.readShort();
            this.s = dataInputStream.readShort();
            this.t = dataInputStream.readShort();
        }
        if (!this.x.equals("")) {
            this.y = dataInputStream.readShort();
            this.z = dataInputStream.readShort();
            this.A = dataInputStream.readShort();
        }
        this.C[1] = bu.a(a.a(this.c, this.n, (byte) 1, this.o, false, this.x), (byte) 2);
        this.D[1] = bu.a(a.a(this.c, this.n, (byte) 1, this.o, true, this.x), (byte) 2);
        this.C[3] = bu.a(a.a(this.c, this.n, (byte) 3, this.o, false, this.x), (byte) 2);
        this.D[3] = bu.a(a.a(this.c, this.n, (byte) 3, this.o, true, this.x), (byte) 2);
        this.C[0] = bu.a(a.a(this.c, this.n, (byte) 0, this.o, false, this.x), (byte) 2);
        this.D[0] = bu.a(a.a(this.c, this.n, (byte) 0, this.o, true, this.x), (byte) 2);
        this.C[2] = bu.a(a.a(this.c, this.n, (byte) 2, this.o, false, this.x), (byte) 2);
        this.D[2] = bu.a(a.a(this.c, this.n, (byte) 2, this.o, true, this.x), (byte) 2);
        a(true);
    }
}

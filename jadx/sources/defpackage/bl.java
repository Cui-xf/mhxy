package defpackage;

import com.yinhan.kjava.main.a;
import java.io.DataInputStream;
import java.io.IOException;

/* loaded from: java版梦回西游3区251011.jar:bl.class */
public final class bl extends ar {
    public String b;
    private int w;
    public byte c;
    public byte n;
    public byte o;
    private String x;
    private short y;
    private short z;
    private short A;
    public byte p;
    public short q;
    public short r;
    public short s;
    public short t;
    public byte u;
    public byte v;
    public String a = "";
    private boolean B = false;
    private int[] C = new int[4];
    private int[] D = new int[4];

    public final void a(DataInputStream dataInputStream) throws IOException {
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

    /* JADX WARN: Removed duplicated region for block: B:24:0x00b3 A[Catch: Exception -> 0x011f, TryCatch #0 {Exception -> 0x011f, blocks: (B:2:0x0000, B:4:0x0007, B:6:0x000e, B:8:0x0019, B:10:0x003f, B:12:0x004d, B:14:0x005b, B:16:0x006a, B:27:0x00c2, B:29:0x00f3, B:31:0x010d, B:33:0x0114, B:28:0x00ee, B:15:0x0064, B:17:0x0079, B:19:0x0087, B:21:0x0095, B:23:0x00a4, B:22:0x009e, B:24:0x00b3, B:30:0x00ff), top: B:38:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c2 A[Catch: Exception -> 0x011f, TryCatch #0 {Exception -> 0x011f, blocks: (B:2:0x0000, B:4:0x0007, B:6:0x000e, B:8:0x0019, B:10:0x003f, B:12:0x004d, B:14:0x005b, B:16:0x006a, B:27:0x00c2, B:29:0x00f3, B:31:0x010d, B:33:0x0114, B:28:0x00ee, B:15:0x0064, B:17:0x0079, B:19:0x0087, B:21:0x0095, B:23:0x00a4, B:22:0x009e, B:24:0x00b3, B:30:0x00ff), top: B:38:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ee A[Catch: Exception -> 0x011f, TryCatch #0 {Exception -> 0x011f, blocks: (B:2:0x0000, B:4:0x0007, B:6:0x000e, B:8:0x0019, B:10:0x003f, B:12:0x004d, B:14:0x005b, B:16:0x006a, B:27:0x00c2, B:29:0x00f3, B:31:0x010d, B:33:0x0114, B:28:0x00ee, B:15:0x0064, B:17:0x0079, B:19:0x0087, B:21:0x0095, B:23:0x00a4, B:22:0x009e, B:24:0x00b3, B:30:0x00ff), top: B:38:0x0000 }] */
    /* JADX WARN: Type inference failed for: r0v12, types: [au, java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.aw r7, defpackage.ai r8, long r9) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bl.a(aw, ai, long):void");
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
}

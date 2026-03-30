package defpackage;

import com.yinhan.kjava.main.a;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;

/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-8105993946875401281/classes.dex */
public final class av {
    public static byte d;
    public byte e;
    public a f;
    public at g;
    private x l;
    public static String a = "http://117.135.138.130:7099";
    public static String b = "socket://120.78.151.213:20008";
    public static String c = "";
    private static String j = "";
    public static byte h = -1;
    public static byte i = 2;
    private Vector m = new Vector();
    private w n = null;
    private q k = new q();

    public av() {
        bz.c = t.a == 0 ? 162 : 40;
        h = (byte) -1;
        i = (byte) 2;
        if (a == null) {
            a = "http://117.135.138.130:7099";
        }
        if (b == null) {
            b = "socket://120.78.151.213:20008";
        }
        c = "";
        j = "";
        b();
    }

    public static void a(int i2) throws InterruptedException {
        try {
            Thread.sleep(15);
        } catch (Exception e) {
        }
    }

    private void a(DataInputStream dataInputStream) throws IOException {
        byte b2 = dataInputStream.readByte();
        if (b2 > 0) {
            w wVar = new w((short) 8192);
            for (int i2 = 0; i2 < b2; i2++) {
                short s = dataInputStream.readShort();
                new StringBuffer().append("接收子数据包_|").append((int) s).toString();
                byte[] bArr = new byte[dataInputStream.readInt()];
                dataInputStream.readFully(bArr);
                wVar.c.addElement(new w(s, bArr));
            }
            b(wVar);
        }
    }

    public static boolean a(String str) {
        return !c.equals(str);
    }

    public static boolean a(Vector vector, w wVar) {
        for (int i2 = 0; i2 < vector.size(); i2++) {
            if (wVar.a() == ((w) vector.elementAt(i2)).a()) {
                return true;
            }
        }
        return false;
    }

    private void b(w wVar) {
        this.m.addElement(wVar);
    }

    private void e() {
        if (h == 2) {
            d = (byte) 1;
            c = b;
            if (this.g != null) {
                this.g.a();
            }
            this.g = new at(this);
            if (this.l == null) {
                this.l = new x(this);
            }
        }
    }

    public final q a() {
        return this.k;
    }

    public final void a(a aVar) {
        this.f = aVar;
        if (this.k != null) {
            this.k.a(aVar);
        }
    }

    public final void a(InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        if (dataInputStream.readByte() == 2) {
            short s = dataInputStream.readShort();
            new StringBuffer().append("接收数据包|").append((int) s).toString();
            if (s == 8192) {
                dataInputStream.readInt();
                a(dataInputStream);
                return;
            } else {
                byte[] bArr = new byte[dataInputStream.readInt()];
                dataInputStream.readFully(bArr);
                b(new w(s, bArr));
                return;
            }
        }
        int i2 = dataInputStream.readByte();
        int i3 = dataInputStream.readByte();
        if (i2 < 0) {
            i2 += 256;
        }
        int i4 = i2 << 8;
        if (i3 < 0) {
            i3 += 256;
        }
        int i5 = i3 + i4;
        new StringBuffer().append("接收压缩数据包大小|").append(i5).toString();
        if (i5 > 0) {
            byte[] bArr2 = new byte[i5];
            dataInputStream.readFully(bArr2);
            DataInputStream dataInputStream2 = new DataInputStream(new ByteArrayInputStream(ci.a(bArr2)));
            short s2 = dataInputStream2.readShort();
            new StringBuffer().append("接收压缩数据包|").append((int) s2).toString();
            if (s2 == 8192) {
                dataInputStream2.readInt();
                a(dataInputStream2);
            } else {
                byte[] bArr3 = new byte[dataInputStream2.readInt()];
                dataInputStream2.readFully(bArr3);
                b(new w(s2, bArr3));
            }
        }
    }

    public final void a(w wVar) {
        t.a(new StringBuffer().append("sendPacket:").append(Integer.toHexString(wVar.a())).toString());
        at atVar = this.g;
        if (wVar.a() == 4101) {
            if (atVar.b.size() == 0) {
                atVar.b.addElement(wVar);
            }
        } else {
            if (a(atVar.a, wVar)) {
                return;
            }
            new StringBuffer().append("添加发送数据包: ").append((int) wVar.a()).toString();
            atVar.a.addElement(wVar);
        }
    }

    public final void b() {
        if (t.a != 0) {
            j = i == 2 ? b : a;
            h = i;
            c = j;
            d = (byte) 3;
            if (h == 2) {
                e();
            }
            t.a(new StringBuffer().append("当前服务地址-->").append(c).toString());
            return;
        }
        if (h == -1) {
            i = (byte) 2;
            j = null;
            b = null;
            c = null;
            h = i;
            e();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0053 A[Catch: IOException -> 0x0057, TRY_LEAVE, TryCatch #0 {IOException -> 0x0057, blocks: (B:24:0x004e, B:26:0x0053), top: B:38:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.String r6) throws java.lang.Throwable {
        /*
            r5 = this;
            r2 = 0
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: java.io.IOException -> L33 java.lang.Throwable -> L49
            r3.<init>()     // Catch: java.io.IOException -> L33 java.lang.Throwable -> L49
            java.io.DataOutputStream r1 = new java.io.DataOutputStream     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L61
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L61
            r0 = -10
            r1.writeByte(r0)     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L64
            r1.writeUTF(r6)     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L64
            r1.flush()     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L64
            r3.flush()     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L64
            byte[] r0 = r3.toByteArray()     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L64
            w r2 = new w     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L64
            r4 = 8193(0x2001, float:1.1481E-41)
            r2.<init>(r4, r0)     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L64
            r5.b(r2)     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L64
            r1.close()     // Catch: java.io.IOException -> L2e
            r3.close()     // Catch: java.io.IOException -> L2e
        L2d:
            return
        L2e:
            r0 = move-exception
            r0.printStackTrace()
            goto L2d
        L33:
            r0 = move-exception
            r1 = r2
            r3 = r2
        L36:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L5f
            if (r1 == 0) goto L3e
            r1.close()     // Catch: java.io.IOException -> L44
        L3e:
            if (r3 == 0) goto L2d
            r3.close()     // Catch: java.io.IOException -> L44
            goto L2d
        L44:
            r0 = move-exception
            r0.printStackTrace()
            goto L2d
        L49:
            r0 = move-exception
            r1 = r2
            r3 = r2
        L4c:
            if (r1 == 0) goto L51
            r1.close()     // Catch: java.io.IOException -> L57
        L51:
            if (r3 == 0) goto L56
            r3.close()     // Catch: java.io.IOException -> L57
        L56:
            throw r0
        L57:
            r1 = move-exception
            r1.printStackTrace()
            goto L56
        L5c:
            r0 = move-exception
            r1 = r2
            goto L4c
        L5f:
            r0 = move-exception
            goto L4c
        L61:
            r0 = move-exception
            r1 = r2
            goto L36
        L64:
            r0 = move-exception
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.av.b(java.lang.String):void");
    }

    public final void c() {
        if (this.m.size() > 0) {
            for (int i2 = 0; i2 < this.m.size(); i2++) {
                this.n = (w) this.m.elementAt(0);
                if (this.n != null) {
                    try {
                        w wVar = this.n;
                        if (this.k != null) {
                            this.k.a(wVar);
                        } else {
                            this.f.b("网络数据包处理器未启动");
                        }
                    } catch (Exception e) {
                        if (this.f != null) {
                            this.f.a(e, (byte) 6);
                            e.printStackTrace();
                        }
                    }
                    this.m.removeElementAt(0);
                    return;
                }
            }
        }
    }

    public final void d() {
        d = (byte) 3;
        if (this.l != null) {
            this.l.a();
        }
        if (this.g != null) {
            this.g.a();
        }
        this.l = null;
        this.g = null;
    }
}

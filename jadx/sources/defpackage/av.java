package defpackage;

import com.yinhan.kjava.main.a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;

/* loaded from: java版梦回西游3区251011.jar:av.class */
public final class av {
    public static byte d;
    public byte e;
    public a f;
    private x l;
    public at g;
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

    public final void a(a aVar) {
        this.f = aVar;
        if (this.k != null) {
            this.k.a(aVar);
        }
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

    public static boolean a(String str) {
        return !c.equals(str);
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

    private void b(w wVar) {
        this.m.addElement(wVar);
    }

    public static boolean a(Vector vector, w wVar) {
        for (int i2 = 0; i2 < vector.size(); i2++) {
            if (wVar.a() == ((w) vector.elementAt(i2)).a()) {
                return true;
            }
        }
        return false;
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
        short s2 = dataInputStream.readByte();
        short s3 = dataInputStream.readByte();
        int i2 = ((s2 < 0 ? s2 + 256 : s2) << 8) + (s3 < 0 ? s3 + 256 : s3);
        new StringBuffer().append("接收压缩数据包大小|").append(i2).toString();
        if (i2 > 0) {
            byte[] bArr2 = new byte[i2];
            dataInputStream.readFully(bArr2);
            DataInputStream dataInputStream2 = new DataInputStream(new ByteArrayInputStream(ci.a(bArr2)));
            short s4 = dataInputStream2.readShort();
            new StringBuffer().append("接收压缩数据包|").append((int) s4).toString();
            if (s4 == 8192) {
                dataInputStream2.readInt();
                a(dataInputStream2);
            } else {
                byte[] bArr3 = new byte[dataInputStream2.readInt()];
                dataInputStream2.readFully(bArr3);
                b(new w(s4, bArr3));
            }
        }
    }

    private void a(DataInputStream dataInputStream) throws IOException {
        int i2 = dataInputStream.readByte();
        if (i2 > 0) {
            w wVar = new w((short) 8192);
            for (int i3 = 0; i3 < i2; i3++) {
                short s = dataInputStream.readShort();
                new StringBuffer().append("接收子数据包_|").append((int) s).toString();
                byte[] bArr = new byte[dataInputStream.readInt()];
                dataInputStream.readFully(bArr);
                wVar.c.addElement(new w(s, bArr));
            }
            b(wVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v24, types: [av] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.io.DataOutputStream] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final void b(String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = null;
        ?? r0 = 0;
        DataOutputStream dataOutputStream = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream2 = new DataOutputStream(byteArrayOutputStream);
                dataOutputStream = dataOutputStream2;
                dataOutputStream2.writeByte(-10);
                dataOutputStream.writeUTF(str);
                dataOutputStream.flush();
                byteArrayOutputStream.flush();
                r0 = this;
                r0.b(new w((short) 8193, byteArrayOutputStream.toByteArray()));
                ?? r02 = dataOutputStream;
                try {
                    r02.close();
                    r02 = byteArrayOutputStream;
                    r02.close();
                } catch (IOException e) {
                    r02.printStackTrace();
                }
            } catch (IOException e2) {
                r0.printStackTrace();
                ?? r03 = dataOutputStream;
                if (r03 != 0) {
                    try {
                        dataOutputStream.close();
                    } catch (IOException e3) {
                        r03.printStackTrace();
                        return;
                    }
                }
                if (byteArrayOutputStream != null) {
                    r03 = byteArrayOutputStream;
                    r03.close();
                }
            }
        } catch (Throwable th) {
            ?? r04 = dataOutputStream;
            if (r04 != 0) {
                try {
                    dataOutputStream.close();
                } catch (IOException e4) {
                    r04.printStackTrace();
                    throw th;
                }
            }
            if (byteArrayOutputStream != null) {
                r04 = byteArrayOutputStream;
                r04.close();
            }
            throw th;
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

    public static void a(int i2) throws InterruptedException {
        try {
            Thread.sleep(15);
        } catch (Exception unused) {
        }
    }
}

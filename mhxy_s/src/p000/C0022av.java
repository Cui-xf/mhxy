package p000;

import com.yinhan.kjava.main.RunnableC0066a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;

/* renamed from: av */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-4234804660425969496/classes.dex */
public final class C0022av {

    /* renamed from: d */
    public static byte f445d;

    /* renamed from: e */
    public byte f449e;

    /* renamed from: f */
    public RunnableC0066a f450f;

    /* renamed from: g */
    public RunnableC0020at f451g;

    /* renamed from: l */
    private RunnableC0092x f453l;

    /* renamed from: a */
    public static String f442a = "http://117.135.138.130:7099";

    /* renamed from: b */
    public static String f443b = "socket://120.78.151.213:20008";

    /* renamed from: c */
    public static String f444c = "";

    /* renamed from: j */
    private static String f448j = "";

    /* renamed from: h */
    public static byte f446h = -1;

    /* renamed from: i */
    public static byte f447i = 2;

    /* renamed from: m */
    private Vector f454m = new Vector();

    /* renamed from: n */
    private C0091w f455n = null;

    /* renamed from: k */
    private C0085q f452k = new C0085q();

    public C0022av() {
        C0053bz.f1806c = C0088t.f2506a == 0 ? 162 : 40;
        f446h = (byte) -1;
        f447i = (byte) 2;
        if (f442a == null) {
            f442a = "http://117.135.138.130:7099";
        }
        if (f443b == null) {
            f443b = "socket://120.78.151.213:20008";
        }
        f444c = "";
        f448j = "";
        m601b();
    }

    /* renamed from: a */
    public static void m591a(int i) throws InterruptedException {
        try {
            Thread.sleep(15);
        } catch (Exception e) {
        }
    }

    /* renamed from: a */
    private void m592a(DataInputStream dataInputStream) throws IOException {
        byte b = dataInputStream.readByte();
        if (b > 0) {
            C0091w c0091w = new C0091w((short) 8192);
            for (int i = 0; i < b; i++) {
                short s = dataInputStream.readShort();
                new StringBuffer().append("接收子数据包_|").append((int) s).toString();
                byte[] bArr = new byte[dataInputStream.readInt()];
                dataInputStream.readFully(bArr);
                c0091w.f2565c.addElement(new C0091w(s, bArr));
            }
            m595b(c0091w);
        }
    }

    /* renamed from: a */
    public static boolean m593a(String str) {
        return !f444c.equals(str);
    }

    /* renamed from: a */
    public static boolean m594a(Vector vector, C0091w c0091w) {
        for (int i = 0; i < vector.size(); i++) {
            if (c0091w.m1709a() == ((C0091w) vector.elementAt(i)).m1709a()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m595b(C0091w c0091w) {
        this.f454m.addElement(c0091w);
    }

    /* renamed from: e */
    private void m596e() {
        if (f446h == 2) {
            f445d = (byte) 1;
            f444c = f443b;
            if (this.f451g != null) {
                this.f451g.m579a();
            }
            this.f451g = new RunnableC0020at(this);
            if (this.f453l == null) {
                this.f453l = new RunnableC0092x(this);
            }
        }
    }

    /* renamed from: a */
    public final C0085q m597a() {
        return this.f452k;
    }

    /* renamed from: a */
    public final void m598a(RunnableC0066a runnableC0066a) {
        this.f450f = runnableC0066a;
        if (this.f452k != null) {
            this.f452k.m1660a(runnableC0066a);
        }
    }

    /* renamed from: a */
    public final void m599a(InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        if (dataInputStream.readByte() == 2) {
            short s = dataInputStream.readShort();
            new StringBuffer().append("接收数据包|").append((int) s).toString();
            if (s == 8192) {
                dataInputStream.readInt();
                m592a(dataInputStream);
                return;
            } else {
                byte[] bArr = new byte[dataInputStream.readInt()];
                dataInputStream.readFully(bArr);
                m595b(new C0091w(s, bArr));
                return;
            }
        }
        int i = dataInputStream.readByte();
        int i2 = dataInputStream.readByte();
        if (i < 0) {
            i += 256;
        }
        int i3 = i << 8;
        if (i2 < 0) {
            i2 += 256;
        }
        int i4 = i2 + i3;
        new StringBuffer().append("接收压缩数据包大小|").append(i4).toString();
        if (i4 > 0) {
            byte[] bArr2 = new byte[i4];
            dataInputStream.readFully(bArr2);
            DataInputStream dataInputStream2 = new DataInputStream(new ByteArrayInputStream(C0063ci.m1364a(bArr2)));
            short s2 = dataInputStream2.readShort();
            new StringBuffer().append("接收压缩数据包|").append((int) s2).toString();
            if (s2 == 8192) {
                dataInputStream2.readInt();
                m592a(dataInputStream2);
            } else {
                byte[] bArr3 = new byte[dataInputStream2.readInt()];
                dataInputStream2.readFully(bArr3);
                m595b(new C0091w(s2, bArr3));
            }
        }
    }

    /* renamed from: a */
    public final void m600a(C0091w c0091w) {
        C0088t.m1679a(new StringBuffer().append("sendPacket:").append(Integer.toHexString(c0091w.m1709a())).toString());
        RunnableC0020at runnableC0020at = this.f451g;
        if (c0091w.m1709a() == 4101) {
            if (runnableC0020at.f423b.size() == 0) {
                runnableC0020at.f423b.addElement(c0091w);
            }
        } else {
            if (m594a(runnableC0020at.f422a, c0091w)) {
                return;
            }
            new StringBuffer().append("添加发送数据包: ").append((int) c0091w.m1709a()).toString();
            runnableC0020at.f422a.addElement(c0091w);
        }
    }

    /* renamed from: b */
    public final void m601b() {
        if (C0088t.f2506a != 0) {
            f448j = f447i == 2 ? f443b : f442a;
            f446h = f447i;
            f444c = f448j;
            f445d = (byte) 3;
            if (f446h == 2) {
                m596e();
            }
            C0088t.m1679a(new StringBuffer().append("当前服务地址-->").append(f444c).toString());
            return;
        }
        if (f446h == -1) {
            f447i = (byte) 2;
            f448j = null;
            f443b = null;
            f444c = null;
            f446h = f447i;
            m596e();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0053 A[Catch: IOException -> 0x0057, TRY_LEAVE, TryCatch #0 {IOException -> 0x0057, blocks: (B:24:0x004e, B:26:0x0053), top: B:38:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m602b(String str) throws Throwable {
        DataOutputStream dataOutputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            } catch (IOException e) {
                e = e;
                dataOutputStream = null;
            } catch (Throwable th) {
                th = th;
                dataOutputStream = null;
                if (dataOutputStream != null) {
                }
                if (byteArrayOutputStream != null) {
                }
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            dataOutputStream = null;
            byteArrayOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            dataOutputStream = null;
            byteArrayOutputStream = null;
        }
        try {
            try {
                dataOutputStream.writeByte(-10);
                dataOutputStream.writeUTF(str);
                dataOutputStream.flush();
                byteArrayOutputStream.flush();
                m595b(new C0091w((short) 8193, byteArrayOutputStream.toByteArray()));
                try {
                    dataOutputStream.close();
                    byteArrayOutputStream.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
            } catch (Throwable th3) {
                th = th3;
                if (dataOutputStream != null) {
                    try {
                        dataOutputStream.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                        throw th;
                    }
                }
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.close();
                }
                throw th;
            }
        } catch (IOException e5) {
            e = e5;
            e.printStackTrace();
            if (dataOutputStream != null) {
                try {
                    dataOutputStream.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                    return;
                }
            }
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.close();
            }
        }
    }

    /* renamed from: c */
    public final void m603c() {
        if (this.f454m.size() > 0) {
            for (int i = 0; i < this.f454m.size(); i++) {
                this.f455n = (C0091w) this.f454m.elementAt(0);
                if (this.f455n != null) {
                    try {
                        C0091w c0091w = this.f455n;
                        if (this.f452k != null) {
                            this.f452k.m1661a(c0091w);
                        } else {
                            this.f450f.m1442b("网络数据包处理器未启动");
                        }
                    } catch (Exception e) {
                        if (this.f450f != null) {
                            this.f450f.m1433a(e, (byte) 6);
                            e.printStackTrace();
                        }
                    }
                    this.f454m.removeElementAt(0);
                    return;
                }
            }
        }
    }

    /* renamed from: d */
    public final void m604d() {
        f445d = (byte) 3;
        if (this.f453l != null) {
            this.f453l.m1710a();
        }
        if (this.f451g != null) {
            this.f451g.m579a();
        }
        this.f453l = null;
        this.f451g = null;
    }
}

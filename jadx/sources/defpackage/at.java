package defpackage;

import com.yinhan.kjava.main.a;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;
import javax.microedition.io.Connector;
import javax.microedition.io.SocketConnection;

/* loaded from: java版梦回西游3区251011.jar:at.class */
public final class at implements Runnable {
    private SocketConnection c;
    private DataOutputStream d;
    private DataInputStream e;
    private av f;
    private long g;
    public Vector a = new Vector();
    public Vector b = new Vector();
    private boolean h = true;
    private boolean i;

    public at(av avVar) {
        av.d = (byte) 1;
        this.f = avVar;
        new Thread(this).start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [at] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.Vector] */
    public final void a() {
        ?? r0 = this;
        r0.h = false;
        try {
            if (this.e != null) {
                this.e.close();
            }
            if (this.d != null) {
                this.d.close();
            }
            if (this.c != null) {
                this.c.close();
            }
            this.a.removeAllElements();
            r0 = this.b;
            r0.removeAllElements();
        } catch (IOException e) {
            r0.printStackTrace();
        }
        this.c = null;
        this.d = null;
        this.e = null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [byte, java.lang.Throwable] */
    public final void b() {
        ?? r0 = av.d;
        if (r0 == 3) {
            return;
        }
        try {
            if (this.c == null) {
                this.c = Connector.open(av.c);
                this.c.setSocketOption((byte) 2, 1);
                this.c.setSocketOption((byte) 1, 5);
                this.c.setSocketOption((byte) 0, 10000);
                this.d = this.c.openDataOutputStream();
                this.e = this.c.openDataInputStream();
                this.i = true;
            }
            if (this.c != null) {
                if (this.a.size() > 0) {
                    a(this.a);
                    this.g = this.f.f.ak;
                } else {
                    if (this.b.size() <= 0 || this.f.f.ak - this.g < 2000) {
                        return;
                    }
                    a(this.b);
                    this.g = this.f.f.ak;
                }
            }
        } catch (IOException e) {
            r0.printStackTrace();
            av avVar = this.f;
            avVar.e = (byte) (avVar.e + 1);
            new StringBuffer().append("数据发送异常，尝试重连|").append((int) this.f.e).toString();
            if (this.f.e > 30) {
                this.f.d();
                this.f.b("连接超时,请尝试其他连接方式!");
            }
            a();
            this.g = this.f.f.ak;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [at] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.io.DataOutputStream] */
    private void a(Vector vector) throws IOException {
        w wVar = (w) vector.elementAt(0);
        new StringBuffer().append("开始数据包发送|").append((int) wVar.a()).toString();
        byte[] bArr = new byte[wVar.b.length + 2];
        short s = 0;
        while (true) {
            short s2 = s;
            if (s2 >= bArr.length) {
                break;
            }
            if (s2 == 0) {
                bArr[s2] = wVar.b[s2];
            } else if (s2 == 1) {
                bArr[s2] = (byte) ((wVar.b.length >> 8) & 255);
                s2 = (short) (s2 + 1);
                bArr[s2] = (byte) wVar.b.length;
            } else {
                bArr[s2] = wVar.b[s2 - 2];
            }
            s = (short) (s2 + 1);
        }
        ?? r0 = this;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            if (r0.i || wVar.a) {
                if (t.a == 0) {
                    dataOutputStream.write(bz.a((byte) 1, bz.c, 0, 0));
                } else {
                    dataOutputStream.writeByte(bz.a);
                    dataOutputStream.writeByte(bz.b);
                }
                r0.i = false;
            }
            dataOutputStream.write(bArr);
            r0.d.write(byteArrayOutputStream.toByteArray());
            r0 = r0.d;
            r0.flush();
        } catch (IOException e) {
            r0.printStackTrace();
        }
        if (wVar.a() == 4630) {
            bt.e = System.currentTimeMillis();
        }
        this.g = this.f.f.ak;
        this.f.e = (byte) 0;
        vector.removeElementAt(0);
        if (wVar.a() == 4352) {
            this.a.removeAllElements();
            this.b.removeAllElements();
        }
        new StringBuffer().append("完成数据包发送|").append((int) wVar.a()).toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [ao] */
    /* JADX WARN: Type inference failed for: r0v2, types: [byte] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v32, types: [javax.microedition.io.SocketConnection] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Throwable] */
    @Override // java.lang.Runnable
    public final void run() {
        ?? r0;
        while (this.h && (r0 = av.d) != 3) {
            try {
                r0 = this.c;
                if (r0 != 0 && this.e != null) {
                    this.f.a((InputStream) this.e);
                }
            } catch (Exception e) {
                r0.printStackTrace();
                ?? string = new StringBuffer().append("数据读取异常").append(e.getMessage()).toString();
                try {
                    a();
                    string = a.e;
                    if (string == 0 || a.e.k != 25) {
                        if (this.f.f.k != 3 && this.f.f.k != 9 && this.f.f.k != 4) {
                            this.f.b("数据更新失败:");
                        }
                    } else if (a.e.g != null) {
                        a.e.g.l();
                    }
                } catch (Exception e2) {
                    string.printStackTrace();
                }
            }
        }
    }
}

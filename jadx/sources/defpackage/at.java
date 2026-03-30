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

/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-8105993946875401281/classes.dex */
public final class at implements Runnable {
    private SocketConnection c;
    private DataOutputStream d;
    private DataInputStream e;
    private av f;
    private long g;
    private boolean i;
    public Vector a = new Vector();
    public Vector b = new Vector();
    private boolean h = true;

    public at(av avVar) {
        av.d = (byte) 1;
        this.f = avVar;
        new Thread(this).start();
    }

    private void a(Vector vector) throws IOException {
        w wVar = (w) vector.elementAt(0);
        new StringBuffer().append("开始数据包发送|").append((int) wVar.a()).toString();
        byte[] bArr = new byte[wVar.b.length + 2];
        short s = 0;
        while (s < bArr.length) {
            if (s == 0) {
                bArr[s] = wVar.b[s];
            } else if (s == 1) {
                bArr[s] = (byte) ((wVar.b.length >> 8) & 255);
                s = (short) (s + 1);
                bArr[s] = (byte) wVar.b.length;
            } else {
                bArr[s] = wVar.b[s - 2];
            }
            s = (short) (s + 1);
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            if (this.i || wVar.a) {
                if (t.a == 0) {
                    dataOutputStream.write(bz.a((byte) 1, bz.c, 0, 0));
                } else {
                    dataOutputStream.writeByte(bz.a);
                    dataOutputStream.writeByte(bz.b);
                }
                this.i = false;
            }
            dataOutputStream.write(bArr);
            this.d.write(byteArrayOutputStream.toByteArray());
            this.d.flush();
        } catch (IOException e) {
            e.printStackTrace();
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

    public final void a() {
        this.h = false;
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
            this.b.removeAllElements();
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.c = null;
        this.d = null;
        this.e = null;
    }

    public final void b() {
        try {
            if (av.d == 3) {
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
                e.printStackTrace();
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
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        while (this.h && av.d != 3) {
            try {
                if (this.c != null && this.e != null) {
                    this.f.a((InputStream) this.e);
                }
            } catch (Exception e) {
                e.printStackTrace();
                new StringBuffer().append("数据读取异常").append(e.getMessage()).toString();
                try {
                    a();
                    if (a.e == null || a.e.k != 25) {
                        if (this.f.f.k != 3 && this.f.f.k != 9 && this.f.f.k != 4) {
                            this.f.b("数据更新失败:");
                        }
                    } else if (a.e.g != null) {
                        a.e.g.l();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }
}

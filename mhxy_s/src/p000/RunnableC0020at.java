package p000;

import com.yinhan.kjava.main.RunnableC0066a;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;
import javax.microedition.io.Connector;
import javax.microedition.io.SocketConnection;

/* renamed from: at */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-4234804660425969496/classes.dex */
public final class RunnableC0020at implements Runnable {

    /* renamed from: c */
    private SocketConnection f424c;

    /* renamed from: d */
    private DataOutputStream f425d;

    /* renamed from: e */
    private DataInputStream f426e;

    /* renamed from: f */
    private C0022av f427f;

    /* renamed from: g */
    private long f428g;

    /* renamed from: i */
    private boolean f430i;

    /* renamed from: a */
    public Vector f422a = new Vector();

    /* renamed from: b */
    public Vector f423b = new Vector();

    /* renamed from: h */
    private boolean f429h = true;

    public RunnableC0020at(C0022av c0022av) {
        C0022av.f445d = (byte) 1;
        this.f427f = c0022av;
        new Thread(this).start();
    }

    /* renamed from: a */
    private void m578a(Vector vector) throws IOException {
        C0091w c0091w = (C0091w) vector.elementAt(0);
        new StringBuffer().append("开始数据包发送|").append((int) c0091w.m1709a()).toString();
        byte[] bArr = new byte[c0091w.f2564b.length + 2];
        short s = 0;
        while (s < bArr.length) {
            if (s == 0) {
                bArr[s] = c0091w.f2564b[s];
            } else if (s == 1) {
                bArr[s] = (byte) ((c0091w.f2564b.length >> 8) & 255);
                s = (short) (s + 1);
                bArr[s] = (byte) c0091w.f2564b.length;
            } else {
                bArr[s] = c0091w.f2564b[s - 2];
            }
            s = (short) (s + 1);
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            if (this.f430i || c0091w.f2563a) {
                if (C0088t.f2506a == 0) {
                    dataOutputStream.write(C0053bz.m1032a((byte) 1, C0053bz.f1806c, 0, 0));
                } else {
                    dataOutputStream.writeByte(C0053bz.f1804a);
                    dataOutputStream.writeByte(C0053bz.f1805b);
                }
                this.f430i = false;
            }
            dataOutputStream.write(bArr);
            this.f425d.write(byteArrayOutputStream.toByteArray());
            this.f425d.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (c0091w.m1709a() == 4630) {
            C0047bt.f1047e = System.currentTimeMillis();
        }
        this.f428g = this.f427f.f450f.f2147ak;
        this.f427f.f449e = (byte) 0;
        vector.removeElementAt(0);
        if (c0091w.m1709a() == 4352) {
            this.f422a.removeAllElements();
            this.f423b.removeAllElements();
        }
        new StringBuffer().append("完成数据包发送|").append((int) c0091w.m1709a()).toString();
    }

    /* renamed from: a */
    public final void m579a() {
        this.f429h = false;
        try {
            if (this.f426e != null) {
                this.f426e.close();
            }
            if (this.f425d != null) {
                this.f425d.close();
            }
            if (this.f424c != null) {
                this.f424c.close();
            }
            this.f422a.removeAllElements();
            this.f423b.removeAllElements();
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.f424c = null;
        this.f425d = null;
        this.f426e = null;
    }

    /* renamed from: b */
    public final void m580b() {
        if (C0022av.f445d == 3) {
            return;
        }
        try {
            if (this.f424c == null) {
                this.f424c = Connector.open(C0022av.f444c);
                this.f424c.setSocketOption((byte) 2, 1);
                this.f424c.setSocketOption((byte) 1, 5);
                this.f424c.setSocketOption((byte) 0, 10000);
                this.f425d = this.f424c.openDataOutputStream();
                this.f426e = this.f424c.openDataInputStream();
                this.f430i = true;
            }
            if (this.f424c != null) {
                if (this.f422a.size() > 0) {
                    m578a(this.f422a);
                    this.f428g = this.f427f.f450f.f2147ak;
                } else {
                    if (this.f423b.size() <= 0 || this.f427f.f450f.f2147ak - this.f428g < 2000) {
                        return;
                    }
                    m578a(this.f423b);
                    this.f428g = this.f427f.f450f.f2147ak;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            C0022av c0022av = this.f427f;
            c0022av.f449e = (byte) (c0022av.f449e + 1);
            new StringBuffer().append("数据发送异常，尝试重连|").append((int) this.f427f.f449e).toString();
            if (this.f427f.f449e > 30) {
                this.f427f.m604d();
                this.f427f.m602b("连接超时,请尝试其他连接方式!");
            }
            m579a();
            this.f428g = this.f427f.f450f.f2147ak;
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        while (this.f429h && C0022av.f445d != 3) {
            try {
                if (this.f424c != null && this.f426e != null) {
                    this.f427f.m599a((InputStream) this.f426e);
                }
            } catch (Exception e) {
                e.printStackTrace();
                new StringBuffer().append("数据读取异常").append(e.getMessage()).toString();
                try {
                    m579a();
                    if (RunnableC0066a.f2113e == null || RunnableC0066a.f2113e.f358k != 25) {
                        if (this.f427f.f450f.f2217k != 3 && this.f427f.f450f.f2217k != 9 && this.f427f.f450f.f2217k != 4) {
                            this.f427f.m602b("数据更新失败:");
                        }
                    } else if (RunnableC0066a.f2113e.f356g != null) {
                        RunnableC0066a.f2113e.f356g.m754l();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }
}

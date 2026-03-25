/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.io.Connector
 *  javax.microedition.io.SocketConnection
 */
import com.yinhan.kjava.main.a;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import javax.microedition.io.Connector;
import javax.microedition.io.SocketConnection;

public final class at
implements Runnable {
    private SocketConnection c;
    private DataOutputStream d;
    private DataInputStream e;
    private av f;
    private long g;
    public Vector a = new Vector();
    public Vector b = new Vector();
    private boolean h = true;
    private boolean i;

    public at(av av2) {
        av.d = 1;
        this.f = av2;
        new Thread(this).start();
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
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
        }
        this.c = null;
        this.d = null;
        this.e = null;
    }

    public final void b() {
        if (av.d == 3) {
            return;
        }
        try {
            block14: {
                block13: {
                    if (this.c == null) {
                        at at2 = this;
                        this.c = (SocketConnection)Connector.open((String)av.c);
                        at2.c.setSocketOption((byte)2, 1);
                        at2.c.setSocketOption((byte)1, 5);
                        at2.c.setSocketOption((byte)0, 10000);
                        at2.d = at2.c.openDataOutputStream();
                        at2.e = at2.c.openDataInputStream();
                        at2.i = true;
                    }
                    if (this.c == null) break block13;
                    if (this.a.size() > 0) break block14;
                    if (this.b.size() > 0) {
                        if (this.f.f.ak - this.g < 2000L) {
                            return;
                        }
                        this.a(this.b);
                        this.g = this.f.f.ak;
                    }
                }
                return;
            }
            this.a(this.a);
            this.g = this.f.f.ak;
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            this.f.e = (byte)(this.f.e + 1);
            String cfr_ignored_0 = "\u6570\u636e\u53d1\u9001\u5f02\u5e38\uff0c\u5c1d\u8bd5\u91cd\u8fde|" + this.f.e;
            if (this.f.e > 30) {
                this.f.d();
                this.f.b("\u8fde\u63a5\u8d85\u65f6,\u8bf7\u5c1d\u8bd5\u5176\u4ed6\u8fde\u63a5\u65b9\u5f0f!");
            }
            this.a();
            this.g = this.f.f.ak;
            return;
        }
    }

    private void a(Vector vector) {
        w w2 = (w)vector.elementAt(0);
        String cfr_ignored_0 = "\u5f00\u59cb\u6570\u636e\u5305\u53d1\u9001|" + w2.a();
        Object object = new byte[w2.b.length + 2];
        for (int n2 = 0; n2 < ((byte[])object).length; n2 = (int)((short)(n2 + 1))) {
            if (n2 == 0) {
                object[n2] = w2.b[n2];
                continue;
            }
            if (n2 == 1) {
                object[n2] = (byte)(w2.b.length >> 8 & 0xFF);
                n2 = (short)(n2 + 1);
                object[n2] = (byte)w2.b.length;
                continue;
            }
            object[n2] = w2.b[n2 - 2];
        }
        w w3 = w2;
        byte[] byArray = object;
        object = this;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            if (object.i || w3.a) {
                if (t.a == 0) {
                    ((OutputStream)dataOutputStream).write(bz.a((byte)1, bz.c, 0, 0));
                } else {
                    dataOutputStream.writeByte(bz.a);
                    dataOutputStream.writeByte(bz.b);
                }
                object.i = false;
            }
            ((OutputStream)dataOutputStream).write(byArray);
            ((OutputStream)object.d).write(byteArrayOutputStream.toByteArray());
            object.d.flush();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
        }
        if (w2.a() == 4630) {
            bt.e = System.currentTimeMillis();
        }
        this.g = this.f.f.ak;
        this.f.e = 0;
        vector.removeElementAt(0);
        if (w2.a() == 4352) {
            this.a.removeAllElements();
            this.b.removeAllElements();
        }
        String cfr_ignored_1 = "\u5b8c\u6210\u6570\u636e\u5305\u53d1\u9001|" + w2.a();
    }

    public final void run() {
        while (this.h && av.d != 3) {
            try {
                if (this.c == null || this.e == null) continue;
                this.f.a((InputStream)this.e);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                String cfr_ignored_0 = "\u6570\u636e\u8bfb\u53d6\u5f02\u5e38" + exception2.getMessage();
                try {
                    this.a();
                    if (com.yinhan.kjava.main.a.e != null && com.yinhan.kjava.main.a.e.k == 25) {
                        if (com.yinhan.kjava.main.a.e.g == null) continue;
                        com.yinhan.kjava.main.a.e.g.l();
                        continue;
                    }
                    if (this.f.f.k == 3 || this.f.f.k == 9 || this.f.f.k == 4) continue;
                    this.f.b("\u6570\u636e\u66f4\u65b0\u5931\u8d25:");
                }
                catch (Exception exception3) {
                    exception2 = exception3;
                    exception3.printStackTrace();
                }
            }
        }
    }
}


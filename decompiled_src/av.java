/*
 * Decompiled with CFR 0.152.
 */
import com.yinhan.kjava.main.a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;

public final class av {
    public static String a = "http://117.135.138.130:7099";
    public static String b = "socket://120.78.151.213:20008";
    public static String c = "";
    private static String j = "";
    public static byte d;
    public byte e;
    public a f;
    private q k;
    private x l;
    public at g;
    private Vector m = new Vector();
    private w n = null;
    public static byte h;
    public static byte i;

    public av() {
        this.k = new q();
        bz.c = t.a == 0 ? 162 : 40;
        h = (byte)-1;
        i = (byte)2;
        if (a == null) {
            a = "http://117.135.138.130:7099";
        }
        if (b == null) {
            b = "socket://120.78.151.213:20008";
        }
        c = "";
        j = "";
        this.b();
    }

    public final void a(a a2) {
        this.f = a2;
        if (this.k != null) {
            this.k.a(a2);
        }
    }

    private void e() {
        if (h == 2) {
            d = 1;
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

    public static boolean a(String string) {
        return !c.equals(string);
    }

    public final void b() {
        if (t.a == 0) {
            if (h == -1) {
                i = (byte)2;
                j = null;
                b = null;
                c = null;
                h = i;
                this.e();
            }
            return;
        }
        j = i == 2 ? b : a;
        h = i;
        c = j;
        d = (byte)3;
        if (h == 2) {
            this.e();
        }
        t.a("\u5f53\u524d\u670d\u52a1\u5730\u5740-->" + c);
    }

    private void b(w w2) {
        this.m.addElement(w2);
    }

    public static boolean a(Vector vector, w w2) {
        w w3 = null;
        for (int i2 = 0; i2 < vector.size(); ++i2) {
            w3 = (w)vector.elementAt(i2);
            if (w2.a() != w3.a()) continue;
            return true;
        }
        return false;
    }

    public final void c() {
        if (this.m.size() > 0) {
            for (int i2 = 0; i2 < this.m.size(); ++i2) {
                block6: {
                    this.n = (w)this.m.elementAt(0);
                    if (this.n == null) continue;
                    try {
                        w w2 = this.n;
                        av av2 = this;
                        if (av2.k != null) {
                            av2.k.a(w2);
                        } else {
                            av2.f.b("\u7f51\u7edc\u6570\u636e\u5305\u5904\u7406\u5668\u672a\u542f\u52a8");
                        }
                    }
                    catch (Exception exception) {
                        if (this.f == null) break block6;
                        this.f.a(exception, (byte)6);
                        exception.printStackTrace();
                    }
                }
                this.m.removeElementAt(0);
                return;
            }
        }
    }

    public final void a(w w2) {
        t.a("sendPacket:" + Integer.toHexString(w2.a()));
        at at2 = ((av)((Object)at2)).g;
        if (w2.a() == 4101) {
            if (at2.b.size() == 0) {
                at2.b.addElement(w2);
                return;
            }
        } else if (!av.a(at2.a, w2)) {
            String cfr_ignored_0 = "\u6dfb\u52a0\u53d1\u9001\u6570\u636e\u5305: " + w2.a();
            at2.a.addElement(w2);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(InputStream inputStream) {
        int n2 = ((DataInputStream)(inputStream = new DataInputStream(inputStream))).readByte();
        if (n2 == 2) {
            n2 = ((DataInputStream)inputStream).readShort();
            String cfr_ignored_0 = "\u63a5\u6536\u6570\u636e\u5305|" + n2;
            if (n2 == 8192) {
                ((DataInputStream)inputStream).readInt();
                this.a((DataInputStream)inputStream);
                return;
            }
            int n3 = ((DataInputStream)inputStream).readInt();
            byte[] byArray = new byte[n3];
            ((DataInputStream)inputStream).readFully(byArray);
            this.b(new w((short)n2, byArray));
            return;
        }
        n2 = ((DataInputStream)inputStream).readByte();
        int n4 = ((DataInputStream)inputStream).readByte();
        n4 = ((n2 < 0 ? n2 + 256 : n2) << 8) + (n4 < 0 ? n4 + 256 : n4);
        String cfr_ignored_1 = "\u63a5\u6536\u538b\u7f29\u6570\u636e\u5305\u5927\u5c0f|" + n4;
        if (n4 <= 0) return;
        byte[] byArray = new byte[n4];
        ((DataInputStream)inputStream).readFully(byArray);
        byArray = ci.a(byArray);
        inputStream = new ByteArrayInputStream(byArray);
        inputStream = new DataInputStream(inputStream);
        short s2 = ((DataInputStream)inputStream).readShort();
        String cfr_ignored_2 = "\u63a5\u6536\u538b\u7f29\u6570\u636e\u5305|" + s2;
        if (s2 == 8192) {
            ((DataInputStream)inputStream).readInt();
            this.a((DataInputStream)inputStream);
            return;
        }
        n4 = ((DataInputStream)inputStream).readInt();
        byte[] byArray2 = new byte[n4];
        ((DataInputStream)inputStream).readFully(byArray2);
        this.b(new w(s2, byArray2));
    }

    private void a(DataInputStream dataInputStream) {
        int n2 = dataInputStream.readByte();
        if (n2 > 0) {
            w w2 = new w(8192);
            int n3 = 0;
            for (int i2 = 0; i2 < n2; ++i2) {
                short s2 = dataInputStream.readShort();
                String cfr_ignored_0 = "\u63a5\u6536\u5b50\u6570\u636e\u5305_|" + s2;
                n3 = dataInputStream.readInt();
                byte[] byArray = new byte[n3];
                dataInputStream.readFully(byArray);
                w w3 = new w(s2, byArray);
                w2.c.addElement(w3);
            }
            this.b(w2);
        }
    }

    /*
     * Loose catch block
     */
    public final void b(String object) {
        ByteArrayOutputStream byteArrayOutputStream = null;
        FilterOutputStream filterOutputStream = null;
        boolean bl2 = false;
        Object object2 = null;
        byteArrayOutputStream = new ByteArrayOutputStream();
        filterOutputStream = new DataOutputStream(byteArrayOutputStream);
        ((DataOutputStream)filterOutputStream).writeByte(-10);
        ((DataOutputStream)filterOutputStream).writeUTF((String)object);
        ((DataOutputStream)filterOutputStream).flush();
        byteArrayOutputStream.flush();
        object2 = byteArrayOutputStream.toByteArray();
        object = new w(8193, (byte[])object2);
        this.b((w)object);
        try {
            filterOutputStream.close();
            byteArrayOutputStream.close();
            return;
        }
        catch (IOException iOException) {
            object2 = iOException;
            iOException.printStackTrace();
            return;
        }
        catch (IOException iOException) {
            IOException iOException2;
            try {
                iOException2 = iOException;
                iOException.printStackTrace();
            }
            catch (Throwable throwable) {
                try {
                    if (filterOutputStream != null) {
                        filterOutputStream.close();
                    }
                    if (byteArrayOutputStream != null) {
                        byteArrayOutputStream.close();
                    }
                }
                catch (IOException iOException3) {
                    object = iOException3;
                    iOException3.printStackTrace();
                }
                throw throwable;
            }
            try {
                if (filterOutputStream != null) {
                    filterOutputStream.close();
                }
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.close();
                }
                return;
            }
            catch (IOException iOException4) {
                iOException2 = iOException4;
                iOException4.printStackTrace();
                return;
            }
        }
    }

    public final void d() {
        d = (byte)3;
        if (this.l != null) {
            this.l.a();
        }
        if (this.g != null) {
            this.g.a();
        }
        this.l = null;
        this.g = null;
    }

    public static void a(int n2) {
        try {
            Thread.sleep(15);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    static {
        h = (byte)-1;
        i = (byte)2;
    }
}


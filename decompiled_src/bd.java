/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Command
 *  javax.microedition.lcdui.CommandListener
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.lcdui.Form
 *  javax.microedition.lcdui.Item
 *  javax.microedition.lcdui.TextField
 */
import com.yinhan.kjava.main.a;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.TextField;

public final class bd
implements CommandListener {
    public ao a;
    public a b;
    public byte c = 0;
    private String e;
    private String f;
    private short g;
    private short[] h = new short[3];
    private short i;
    private byte[] j;
    private short[] k;
    private int[] l;
    private String[] m;
    private Form n;
    public TextField d;
    private Command o;
    private Command p;

    public bd(ao ao2, a a2, ai ai2) {
        this.a = ao2;
        this.b = a2;
    }

    public final void a(DataInputStream dataInputStream) {
        int n2;
        this.e = dataInputStream.readUTF();
        this.f = dataInputStream.readUTF();
        this.g = dataInputStream.readShort();
        this.h[0] = dataInputStream.readShort();
        this.h[1] = dataInputStream.readShort();
        this.h[2] = dataInputStream.readShort();
        this.i = dataInputStream.readShort();
        int n3 = this.i % 10;
        short s2 = (short)(this.i / 10 % 10);
        short s3 = (short)(this.i / 100 % 10);
        short s4 = (short)(this.i / 1000 % 10);
        this.j = null;
        if (n3 > 0) {
            this.j = new byte[n3];
            for (n2 = 0; n2 < n3; ++n2) {
                this.j[n2] = dataInputStream.readByte();
            }
        }
        this.k = null;
        if (s2 > 0) {
            this.k = new short[s2];
            for (n2 = 0; n2 < s2; ++n2) {
                this.k[n2] = dataInputStream.readShort();
            }
        }
        this.l = null;
        if (s3 > 0) {
            this.l = new int[s3];
            for (n2 = 0; n2 < s3; ++n2) {
                this.l[n2] = dataInputStream.readInt();
            }
        }
        this.m = null;
        if (s4 > 0) {
            this.m = new String[s4];
            for (n2 = 0; n2 < s4; ++n2) {
                this.m[n2] = dataInputStream.readUTF();
            }
        }
    }

    public final void a() {
        this.c = 0;
        ca.h = 0;
        ca.g = 0;
        short s2 = this.g;
        String string = this.f;
        String string2 = this.e;
        bd bd2 = this;
        if (string2 == null) {
            string2 = "";
        }
        if (string == null) {
            string = "";
        }
        bd2.n = new Form(string2);
        bd2.o = new Command("\u786e\u5b9a", 4, 2);
        bd2.p = new Command("\u8fd4\u56de", 2, 1);
        bd2.n.addCommand(bd2.p);
        bd2.n.addCommand(bd2.o);
        bd2.n.setCommandListener((CommandListener)bd2);
        bd2.n.append(string);
        bd2.d = new TextField(null, "", (int)s2, 0);
        bd2.n.append((Item)bd2.d);
        bd2.b.q.setCurrent((Displayable)bd2.n);
        this.b.a = 0;
        this.b.b = 0;
        this.b.j = this.b.k;
        this.a.l = 0;
        this.a.k = (short)129;
    }

    public final byte[] a(short s2, String string, String string2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4375);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(string);
            dataOutputStream.writeUTF(string2);
            dataOutputStream.writeShort(this.h[0]);
            dataOutputStream.writeShort(this.h[1]);
            dataOutputStream.writeShort(this.h[2]);
            dataOutputStream.writeShort(this.i);
            if (this.j != null && this.j.length > 0 && this.j.length < 10) {
                for (int i2 = 0; i2 < this.j.length; ++i2) {
                    dataOutputStream.writeByte(this.j[i2]);
                }
            }
            if (this.k != null && this.k.length > 0 && this.k.length < 10) {
                for (int i3 = 0; i3 < this.k.length; ++i3) {
                    dataOutputStream.writeShort(this.k[i3]);
                }
            }
            if (this.l != null && this.l.length > 0 && this.l.length < 10) {
                for (int i4 = 0; i4 < this.l.length; ++i4) {
                    dataOutputStream.writeInt(this.l[i4]);
                }
            }
            if (this.m != null && this.m.length > 0 && this.m.length < 10) {
                for (int i5 = 0; i5 < this.m.length; ++i5) {
                    dataOutputStream.writeUTF(this.m[i5]);
                }
            }
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return null;
        }
    }

    public final void b() {
        this.e = null;
        this.f = null;
        this.g = 0;
        this.h[0] = 0;
        this.h[1] = 0;
        this.h[2] = 0;
        this.i = 0;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
    }

    public final void c() {
        if (this.n != null) {
            this.n.removeCommand(this.o);
            this.n.removeCommand(this.p);
            this.n.deleteAll();
        }
        this.o = null;
        this.p = null;
        this.d = null;
        this.n = null;
    }

    public final void commandAction(Command object, Displayable object2) {
        object = object.getLabel();
        object2 = this.d.getString();
        if (((String)object).equals("\u786e\u5b9a") && object2 != null) {
            if (((String)object2).length() == 0) {
                this.b.b("\u540d\u79f0\u4e3a\u7a7a\uff01");
                return;
            }
            if (this.a.R != null) {
                this.a.R.c = 1;
            }
            this.b.d.a();
            return;
        }
        if (((String)object).equals("\u8fd4\u56de")) {
            if (this.a.R != null) {
                this.a.R.c = (byte)2;
            }
            this.b.d.a();
            this.c();
        }
    }
}


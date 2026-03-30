package defpackage;

import com.yinhan.kjava.main.a;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.TextField;

/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-8105993946875401281/classes.dex */
public final class bd implements CommandListener {
    public ao a;
    public a b;
    public TextField d;
    private String e;
    private String f;
    private short g;
    private short i;
    private byte[] j;
    private short[] k;
    private int[] l;
    private String[] m;
    private Form n;
    private Command o;
    private Command p;
    public byte c = 0;
    private short[] h = new short[3];

    public bd(ao aoVar, a aVar, ai aiVar) {
        this.a = aoVar;
        this.b = aVar;
    }

    public final void a() {
        this.c = (byte) 0;
        ca.h = 0;
        ca.g = 0;
        String str = this.e;
        String str2 = this.f;
        short s = this.g;
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        this.n = new Form(str);
        this.o = new Command("确定", 4, 2);
        this.p = new Command("返回", 2, 1);
        this.n.addCommand(this.p);
        this.n.addCommand(this.o);
        this.n.setCommandListener(this);
        this.n.append(str2);
        this.d = new TextField((String) null, "", s, 0);
        this.n.append(this.d);
        this.b.q.setCurrent(this.n);
        this.b.a = 0;
        this.b.b = 0;
        this.b.j = this.b.k;
        this.a.l = (short) 0;
        this.a.k = (short) 129;
    }

    public final void a(DataInputStream dataInputStream) {
        this.e = dataInputStream.readUTF();
        this.f = dataInputStream.readUTF();
        this.g = dataInputStream.readShort();
        this.h[0] = dataInputStream.readShort();
        this.h[1] = dataInputStream.readShort();
        this.h[2] = dataInputStream.readShort();
        this.i = dataInputStream.readShort();
        int i = (short) (this.i % 10);
        int i2 = (short) ((this.i / 10) % 10);
        int i3 = (short) ((this.i / 100) % 10);
        int i4 = (short) ((this.i / 1000) % 10);
        this.j = null;
        if (i > 0) {
            this.j = new byte[i];
            for (int i5 = 0; i5 < i; i5++) {
                this.j[i5] = dataInputStream.readByte();
            }
        }
        this.k = null;
        if (i2 > 0) {
            this.k = new short[i2];
            for (int i6 = 0; i6 < i2; i6++) {
                this.k[i6] = dataInputStream.readShort();
            }
        }
        this.l = null;
        if (i3 > 0) {
            this.l = new int[i3];
            for (int i7 = 0; i7 < i3; i7++) {
                this.l[i7] = dataInputStream.readInt();
            }
        }
        this.m = null;
        if (i4 > 0) {
            this.m = new String[i4];
            for (int i8 = 0; i8 < i4; i8++) {
                this.m[i8] = dataInputStream.readUTF();
            }
        }
    }

    public final byte[] a(short s, String str, String str2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4375);
            dataOutputStream.writeUTF(bt.b);
            dataOutputStream.writeUTF(bt.d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeShort(this.h[0]);
            dataOutputStream.writeShort(this.h[1]);
            dataOutputStream.writeShort(this.h[2]);
            dataOutputStream.writeShort(this.i);
            if (this.j != null && this.j.length > 0 && this.j.length < 10) {
                for (int i = 0; i < this.j.length; i++) {
                    dataOutputStream.writeByte(this.j[i]);
                }
            }
            if (this.k != null && this.k.length > 0 && this.k.length < 10) {
                for (int i2 = 0; i2 < this.k.length; i2++) {
                    dataOutputStream.writeShort(this.k[i2]);
                }
            }
            if (this.l != null && this.l.length > 0 && this.l.length < 10) {
                for (int i3 = 0; i3 < this.l.length; i3++) {
                    dataOutputStream.writeInt(this.l[i3]);
                }
            }
            if (this.m != null && this.m.length > 0 && this.m.length < 10) {
                for (int i4 = 0; i4 < this.m.length; i4++) {
                    dataOutputStream.writeUTF(this.m[i4]);
                }
            }
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public final void b() {
        this.e = null;
        this.f = null;
        this.g = (short) 0;
        this.h[0] = 0;
        this.h[1] = 0;
        this.h[2] = 0;
        this.i = (short) 0;
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

    public final void commandAction(Command command, Displayable displayable) {
        String label = command.getLabel();
        String string = this.d.getString();
        if (!label.equals("确定") || string == null) {
            if (label.equals("返回")) {
                if (this.a.R != null) {
                    this.a.R.c = (byte) 2;
                }
                this.b.d.a();
                c();
                return;
            }
            return;
        }
        if (string.length() == 0) {
            this.b.b("名称为空！");
            return;
        }
        if (this.a.R != null) {
            this.a.R.c = (byte) 1;
        }
        this.b.d.a();
    }
}

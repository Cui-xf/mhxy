package p000;

import com.yinhan.kjava.main.RunnableC0066a;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.TextField;

/* renamed from: bd */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-5080095226433994817/classes.dex */
public final class C0031bd implements CommandListener {

    /* renamed from: a */
    public C0015ao f576a;

    /* renamed from: b */
    public RunnableC0066a f577b;

    /* renamed from: d */
    public TextField f579d;

    /* renamed from: e */
    private String f580e;

    /* renamed from: f */
    private String f581f;

    /* renamed from: g */
    private short f582g;

    /* renamed from: i */
    private short f584i;

    /* renamed from: j */
    private byte[] f585j;

    /* renamed from: k */
    private short[] f586k;

    /* renamed from: l */
    private int[] f587l;

    /* renamed from: m */
    private String[] f588m;

    /* renamed from: n */
    private Form f589n;

    /* renamed from: o */
    private Command f590o;

    /* renamed from: p */
    private Command f591p;

    /* renamed from: c */
    public byte f578c = 0;

    /* renamed from: h */
    private short[] f583h = new short[3];

    public C0031bd(C0015ao c0015ao, RunnableC0066a runnableC0066a, C0009ai c0009ai) {
        this.f576a = c0015ao;
        this.f577b = runnableC0066a;
    }

    /* renamed from: a */
    public final void m637a() {
        this.f578c = (byte) 0;
        C0055ca.f1888h = 0;
        C0055ca.f1887g = 0;
        String str = this.f580e;
        String str2 = this.f581f;
        short s = this.f582g;
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        this.f589n = new Form(str);
        this.f590o = new Command("确定", 4, 2);
        this.f591p = new Command("返回", 2, 1);
        this.f589n.addCommand(this.f591p);
        this.f589n.addCommand(this.f590o);
        this.f589n.setCommandListener(this);
        this.f589n.append(str2);
        this.f579d = new TextField((String) null, "", s, 0);
        this.f589n.append(this.f579d);
        this.f577b.f2222q.setCurrent(this.f589n);
        this.f577b.f2126a = 0;
        this.f577b.f2159b = 0;
        this.f577b.f2216j = this.f577b.f2217k;
        this.f576a.f359l = (short) 0;
        this.f576a.f358k = (short) 129;
    }

    /* renamed from: a */
    public final void m638a(DataInputStream dataInputStream) {
        this.f580e = dataInputStream.readUTF();
        this.f581f = dataInputStream.readUTF();
        this.f582g = dataInputStream.readShort();
        this.f583h[0] = dataInputStream.readShort();
        this.f583h[1] = dataInputStream.readShort();
        this.f583h[2] = dataInputStream.readShort();
        this.f584i = dataInputStream.readShort();
        int i = (short) (this.f584i % 10);
        int i2 = (short) ((this.f584i / 10) % 10);
        int i3 = (short) ((this.f584i / 100) % 10);
        int i4 = (short) ((this.f584i / 1000) % 10);
        this.f585j = null;
        if (i > 0) {
            this.f585j = new byte[i];
            for (int i5 = 0; i5 < i; i5++) {
                this.f585j[i5] = dataInputStream.readByte();
            }
        }
        this.f586k = null;
        if (i2 > 0) {
            this.f586k = new short[i2];
            for (int i6 = 0; i6 < i2; i6++) {
                this.f586k[i6] = dataInputStream.readShort();
            }
        }
        this.f587l = null;
        if (i3 > 0) {
            this.f587l = new int[i3];
            for (int i7 = 0; i7 < i3; i7++) {
                this.f587l[i7] = dataInputStream.readInt();
            }
        }
        this.f588m = null;
        if (i4 > 0) {
            this.f588m = new String[i4];
            for (int i8 = 0; i8 < i4; i8++) {
                this.f588m[i8] = dataInputStream.readUTF();
            }
        }
    }

    /* renamed from: a */
    public final byte[] m639a(short s, String str, String str2) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4375);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeShort(this.f583h[0]);
            dataOutputStream.writeShort(this.f583h[1]);
            dataOutputStream.writeShort(this.f583h[2]);
            dataOutputStream.writeShort(this.f584i);
            if (this.f585j != null && this.f585j.length > 0 && this.f585j.length < 10) {
                for (int i = 0; i < this.f585j.length; i++) {
                    dataOutputStream.writeByte(this.f585j[i]);
                }
            }
            if (this.f586k != null && this.f586k.length > 0 && this.f586k.length < 10) {
                for (int i2 = 0; i2 < this.f586k.length; i2++) {
                    dataOutputStream.writeShort(this.f586k[i2]);
                }
            }
            if (this.f587l != null && this.f587l.length > 0 && this.f587l.length < 10) {
                for (int i3 = 0; i3 < this.f587l.length; i3++) {
                    dataOutputStream.writeInt(this.f587l[i3]);
                }
            }
            if (this.f588m != null && this.f588m.length > 0 && this.f588m.length < 10) {
                for (int i4 = 0; i4 < this.f588m.length; i4++) {
                    dataOutputStream.writeUTF(this.f588m[i4]);
                }
            }
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public final void m640b() {
        this.f580e = null;
        this.f581f = null;
        this.f582g = (short) 0;
        this.f583h[0] = 0;
        this.f583h[1] = 0;
        this.f583h[2] = 0;
        this.f584i = (short) 0;
        this.f585j = null;
        this.f586k = null;
        this.f587l = null;
        this.f588m = null;
    }

    /* renamed from: c */
    public final void m641c() {
        if (this.f589n != null) {
            this.f589n.removeCommand(this.f590o);
            this.f589n.removeCommand(this.f591p);
            this.f589n.deleteAll();
        }
        this.f590o = null;
        this.f591p = null;
        this.f579d = null;
        this.f589n = null;
    }

    public final void commandAction(Command command, Displayable displayable) {
        String label = command.getLabel();
        String string = this.f579d.getString();
        if (!label.equals("确定") || string == null) {
            if (label.equals("返回")) {
                if (this.f576a.f188R != null) {
                    this.f576a.f188R.f578c = (byte) 2;
                }
                this.f577b.f2213d.m1377a();
                m641c();
                return;
            }
            return;
        }
        if (string.length() == 0) {
            this.f577b.m1442b("名称为空！");
            return;
        }
        if (this.f576a.f188R != null) {
            this.f576a.f188R.f578c = (byte) 1;
        }
        this.f577b.f2213d.m1377a();
    }
}

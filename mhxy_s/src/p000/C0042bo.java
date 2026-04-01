package p000;

import java.io.DataInputStream;
import javax.microedition.lcdui.Image;

/* renamed from: bo */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-5080095226433994817/classes.dex */
public final class C0042bo {

    /* renamed from: g */
    public static Image[] f736g = new Image[2];

    /* renamed from: a */
    public String f737a;

    /* renamed from: b */
    public String f738b;

    /* renamed from: c */
    public String f739c;

    /* renamed from: d */
    public String f740d;

    /* renamed from: e */
    public String f741e;

    /* renamed from: f */
    public boolean f742f;

    /* renamed from: h */
    private String f743h;

    /* renamed from: a */
    public final String m697a() {
        return this.f738b.length() < 5 ? this.f738b : new StringBuffer().append(this.f738b.substring(0, 5)).append("…").toString();
    }

    /* renamed from: a */
    public final void m698a(DataInputStream dataInputStream) {
        this.f737a = dataInputStream.readUTF();
        this.f738b = dataInputStream.readUTF();
        this.f743h = dataInputStream.readUTF();
        this.f741e = dataInputStream.readUTF();
        this.f739c = dataInputStream.readUTF();
        this.f740d = dataInputStream.readUTF();
        this.f742f = dataInputStream.readBoolean();
    }

    /* renamed from: b */
    public final String m699b() {
        if (!this.f742f) {
            return "<10>未读邮件。\t<8>选择<6>查看<8>可打开阅读。";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(new StringBuffer().append("<2>标题: <7>").append(this.f738b).toString());
        stringBuffer.append("\t");
        stringBuffer.append(new StringBuffer().append("<2>内容: <7>").append(this.f743h).toString());
        stringBuffer.append("\t");
        stringBuffer.append(new StringBuffer().append("<2>发件人: <7>").append(this.f741e).toString());
        stringBuffer.append(new StringBuffer().append("\t").append(this.f739c).toString());
        return stringBuffer.toString();
    }
}

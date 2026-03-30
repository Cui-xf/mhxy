package defpackage;

import java.io.DataInputStream;
import javax.microedition.lcdui.Image;

/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-8105993946875401281/classes.dex */
public final class bo {
    public static Image[] g = new Image[2];
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public boolean f;
    private String h;

    public final String a() {
        return this.b.length() < 5 ? this.b : new StringBuffer().append(this.b.substring(0, 5)).append("…").toString();
    }

    public final void a(DataInputStream dataInputStream) {
        this.a = dataInputStream.readUTF();
        this.b = dataInputStream.readUTF();
        this.h = dataInputStream.readUTF();
        this.e = dataInputStream.readUTF();
        this.c = dataInputStream.readUTF();
        this.d = dataInputStream.readUTF();
        this.f = dataInputStream.readBoolean();
    }

    public final String b() {
        if (!this.f) {
            return "<10>未读邮件。\t<8>选择<6>查看<8>可打开阅读。";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(new StringBuffer().append("<2>标题: <7>").append(this.b).toString());
        stringBuffer.append("\t");
        stringBuffer.append(new StringBuffer().append("<2>内容: <7>").append(this.h).toString());
        stringBuffer.append("\t");
        stringBuffer.append(new StringBuffer().append("<2>发件人: <7>").append(this.e).toString());
        stringBuffer.append(new StringBuffer().append("\t").append(this.c).toString());
        return stringBuffer.toString();
    }
}

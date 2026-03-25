/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import java.io.DataInputStream;
import javax.microedition.lcdui.Image;

public final class bo {
    public String a;
    public String b;
    private String h;
    public String c;
    public String d;
    public String e;
    public boolean f;
    public static Image[] g = new Image[2];

    public final void a(DataInputStream dataInputStream) {
        this.a = dataInputStream.readUTF();
        this.b = dataInputStream.readUTF();
        this.h = dataInputStream.readUTF();
        this.e = dataInputStream.readUTF();
        this.c = dataInputStream.readUTF();
        this.d = dataInputStream.readUTF();
        this.f = dataInputStream.readBoolean();
    }

    public final String a() {
        if (this.b.length() < 5) {
            return this.b;
        }
        return this.b.substring(0, 5) + "\u2026";
    }

    public final String b() {
        if (this.f) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("<2>\u6807\u9898: <7>" + this.b);
            stringBuffer.append("\t");
            stringBuffer.append("<2>\u5185\u5bb9: <7>" + this.h);
            stringBuffer.append("\t");
            stringBuffer.append("<2>\u53d1\u4ef6\u4eba: <7>" + this.e);
            stringBuffer.append("\t" + this.c);
            return stringBuffer.toString();
        }
        return "<10>\u672a\u8bfb\u90ae\u4ef6\u3002\t<8>\u9009\u62e9<6>\u67e5\u770b<8>\u53ef\u6253\u5f00\u9605\u8bfb\u3002";
    }
}


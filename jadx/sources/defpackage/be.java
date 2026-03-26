package defpackage;

import java.io.DataInputStream;
import javax.microedition.lcdui.Image;

/* loaded from: java版梦回西游3区251011.jar:be.class */
public final class be {
    public String a;
    public String b;
    public String c;
    public boolean d;
    public static Image[] e = new Image[2];

    public final void a(DataInputStream dataInputStream) {
        this.a = dataInputStream.readUTF();
        this.b = dataInputStream.readUTF();
        this.c = dataInputStream.readUTF();
        this.d = dataInputStream.readBoolean();
    }
}

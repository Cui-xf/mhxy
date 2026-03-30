package defpackage;

import java.io.DataInputStream;
import javax.microedition.lcdui.Image;

/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-8105993946875401281/classes.dex */
public final class be {
    public static Image[] e = new Image[2];
    public String a;
    public String b;
    public String c;
    public boolean d;

    public final void a(DataInputStream dataInputStream) {
        this.a = dataInputStream.readUTF();
        this.b = dataInputStream.readUTF();
        this.c = dataInputStream.readUTF();
        this.d = dataInputStream.readBoolean();
    }
}

package p000;

import java.io.DataInputStream;
import javax.microedition.lcdui.Image;

/* renamed from: be */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-4234804660425969496/classes.dex */
public final class C0032be {

    /* renamed from: e */
    public static Image[] f592e = new Image[2];

    /* renamed from: a */
    public String f593a;

    /* renamed from: b */
    public String f594b;

    /* renamed from: c */
    public String f595c;

    /* renamed from: d */
    public boolean f596d;

    /* renamed from: a */
    public final void m642a(DataInputStream dataInputStream) {
        this.f593a = dataInputStream.readUTF();
        this.f594b = dataInputStream.readUTF();
        this.f595c = dataInputStream.readUTF();
        this.f596d = dataInputStream.readBoolean();
    }
}

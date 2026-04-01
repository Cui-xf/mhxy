package p000;

import java.io.DataInputStream;
import javax.microedition.lcdui.Graphics;

/* renamed from: bv */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-4234804660425969496/classes.dex */
public final class C0049bv {

    /* renamed from: a */
    public short f1778a;

    /* renamed from: b */
    public short f1779b;

    /* renamed from: c */
    public int f1780c;

    /* renamed from: d */
    public C0030bc f1781d;

    /* renamed from: e */
    public short f1782e;

    /* renamed from: f */
    public short f1783f;

    /* renamed from: g */
    public short f1784g;

    /* renamed from: h */
    public int f1785h;

    /* renamed from: i */
    public byte f1786i;

    /* renamed from: j */
    public int[] f1787j;

    /* renamed from: k */
    public String[] f1788k;

    public C0049bv() {
        this.f1778a = (short) 4;
        this.f1779b = (short) 4;
        this.f1786i = (byte) -1;
    }

    public C0049bv(int i, short s, short s2, short s3, byte b) {
        this.f1778a = (short) 4;
        this.f1779b = (short) 4;
        this.f1786i = (byte) -1;
        this.f1780c = i;
        this.f1782e = s;
        this.f1783f = s2;
        this.f1784g = s3;
        this.f1786i = b;
    }

    /* renamed from: a */
    public final short m1002a() {
        if (this.f1781d == null) {
            return (short) 0;
        }
        if (this.f1781d.m633g() == 0) {
            return (short) 16;
        }
        return this.f1781d.m633g();
    }

    /* renamed from: a */
    public final void m1003a(byte b) {
        if (C0047bt.f933bs == 0 && C0047bt.f1765s == 0) {
            return;
        }
        if (b == 0) {
            this.f1778a = (short) -4;
            this.f1779b = (short) 0;
            return;
        }
        if (b == 2) {
            this.f1778a = (short) 4;
            this.f1779b = (short) 0;
        } else if (b == 1) {
            this.f1778a = (short) 0;
            this.f1779b = (short) -4;
        } else if (b == 3) {
            this.f1778a = (short) 0;
            this.f1779b = (short) 4;
        } else {
            this.f1778a = (short) 0;
            this.f1779b = (short) 0;
        }
    }

    /* renamed from: a */
    public final void m1004a(DataInputStream dataInputStream) {
        this.f1780c = dataInputStream.readInt();
        dataInputStream.readUTF();
        this.f1782e = dataInputStream.readShort();
        this.f1783f = dataInputStream.readShort();
        this.f1784g = dataInputStream.readShort();
        int i = dataInputStream.readByte();
        this.f1787j = new int[i];
        this.f1788k = new String[i];
        this.f1785h = C0048bu.m955a(String.valueOf((int) this.f1784g), (byte) 2);
        for (int i2 = 0; i2 < i; i2++) {
            this.f1787j[i2] = dataInputStream.readInt();
            this.f1788k[i2] = dataInputStream.readUTF();
        }
    }

    /* renamed from: a */
    public final void m1005a(Graphics graphics, C0009ai c0009ai, int i, int i2, byte b) {
        if (this.f1781d == null || this.f1781d.f571k == null) {
            return;
        }
        c0009ai.m66a(graphics, this.f1781d.f571k[this.f1781d.f566f], this.f1781d.m633g(), this.f1781d.m634h(), null, i, i2, this.f1782e, this.f1783f, 20, 0);
    }

    /* renamed from: b */
    public final short m1006b() {
        if (this.f1781d == null) {
            return (short) 0;
        }
        if (this.f1781d.m634h() == 0) {
            return (short) 24;
        }
        return this.f1781d.m634h();
    }
}

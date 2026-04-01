package p000;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* renamed from: bz */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-5080095226433994817/classes.dex */
public final class C0053bz {

    /* renamed from: a */
    public static byte f1804a = 90;

    /* renamed from: b */
    public static byte f1805b = 72;

    /* renamed from: c */
    public static int f1806c = 162;

    /* renamed from: A */
    public static byte[] m1022A(short s, String str) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4254);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: A */
    public static byte[] m1023A(short s, String str, int i) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4859);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: B */
    public static byte[] m1024B(short s, String str) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4222);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: C */
    public static byte[] m1025C(short s, String str) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(s);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: D */
    public static byte[] m1026D(short s, String str) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4369);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeShort(C0047bt.f1052eE[0]);
            dataOutputStream.writeShort(C0047bt.f1052eE[1]);
            dataOutputStream.writeShort(C0047bt.f1052eE[2]);
            dataOutputStream.writeShort(C0047bt.f1053eF);
            if (C0047bt.f1054eG != null && C0047bt.f1054eG.length > 0 && C0047bt.f1054eG.length < 10) {
                for (int i = 0; i < C0047bt.f1054eG.length; i++) {
                    dataOutputStream.writeByte(C0047bt.f1054eG[i]);
                }
            }
            if (C0047bt.f1055eH != null && C0047bt.f1055eH.length > 0 && C0047bt.f1055eH.length < 10) {
                for (int i2 = 0; i2 < C0047bt.f1055eH.length; i2++) {
                    dataOutputStream.writeShort(C0047bt.f1055eH[i2]);
                }
            }
            if (C0047bt.f1056eI != null && C0047bt.f1056eI.length > 0 && C0047bt.f1056eI.length < 10) {
                for (int i3 = 0; i3 < C0047bt.f1056eI.length; i3++) {
                    dataOutputStream.writeInt(C0047bt.f1056eI[i3]);
                }
            }
            if (C0047bt.f1057eJ != null && C0047bt.f1057eJ.length > 0 && C0047bt.f1057eJ.length < 10) {
                for (int i4 = 0; i4 < C0047bt.f1057eJ.length; i4++) {
                    dataOutputStream.writeUTF(C0047bt.f1057eJ[i4]);
                }
            }
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static C0091w m1027a(byte b, byte b2, String str) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(6400);
            dataOutputStream.writeByte(b);
            dataOutputStream.writeInt(C0029bb.f547a);
            dataOutputStream.writeInt(C0029bb.f548b);
            dataOutputStream.writeUTF(C0088t.f2536v);
            dataOutputStream.writeUTF(C0088t.f2485F);
            dataOutputStream.writeInt(-1);
            dataOutputStream.writeByte(C0088t.f2532r);
            dataOutputStream.writeByte(C0088t.f2533s);
            dataOutputStream.writeByte(C0088t.f2535u);
            dataOutputStream.writeInt((int) Runtime.getRuntime().totalMemory());
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return new C0091w((short) 6400, byteArrayOutputStream.toByteArray());
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    private static void m1028a(ByteArrayOutputStream byteArrayOutputStream, DataOutputStream dataOutputStream) throws IOException {
        if (byteArrayOutputStream != null) {
            try {
                byteArrayOutputStream.close();
            } catch (IOException e) {
                return;
            }
        }
        if (dataOutputStream != null) {
            dataOutputStream.close();
        }
    }

    /* renamed from: a */
    public static byte[] m1029a(byte b) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4683);
            dataOutputStream.writeByte(b);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(C0047bt.f865ad);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1030a(byte b, byte b2, short s) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4685);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(C0047bt.f865ad);
            dataOutputStream.writeByte(b);
            if (b == 2 || b == 5) {
                dataOutputStream.writeByte(b2);
            } else if (b == 3) {
                dataOutputStream.writeShort(s);
            }
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1031a(byte b, int i, int i2, byte b2, byte b3) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4684);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeInt(i2);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeByte(b);
            dataOutputStream.writeByte(b3);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(C0047bt.f865ad);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1032a(byte b, int i, int i2, int i3) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(1);
            new StringBuffer().append("代理服务器包头: ").append(1).append("|").append(i).append("|").append(0).append("|").append(0).toString();
            dataOutputStream.writeInt(i);
            dataOutputStream.writeInt(0);
            dataOutputStream.writeInt(0);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1033a(byte b, int i, int i2, int[] iArr, int i3, byte b2) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4681);
            dataOutputStream.writeByte(b);
            dataOutputStream.writeInt(i);
            if (b != 0 && b != 3) {
                dataOutputStream.writeInt(i2);
                dataOutputStream.writeInt(iArr[0]);
                dataOutputStream.writeInt(iArr[1]);
                dataOutputStream.writeInt(iArr[2]);
                if (b == 2) {
                    dataOutputStream.writeInt(i3);
                    dataOutputStream.writeByte(b2);
                } else if (b == 5) {
                    dataOutputStream.writeByte(b2);
                }
            }
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(C0047bt.f865ad);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1034a(byte b, int i, int i2, int[] iArr, byte[] bArr, int i3, byte b2, String str) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4266);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeInt(i2);
            dataOutputStream.writeByte(b);
            if (b == 4 || b == 5 || b == 0) {
                if (iArr == null || iArr.length <= 0) {
                    dataOutputStream.writeByte(0);
                } else {
                    dataOutputStream.writeByte(iArr.length);
                    for (int i4 = 0; i4 < iArr.length; i4++) {
                        dataOutputStream.writeInt(iArr[i4]);
                        dataOutputStream.writeByte(bArr[i4]);
                    }
                }
                if (b == 4 || b == 5) {
                    dataOutputStream.writeInt(i3);
                    dataOutputStream.writeByte(b2);
                }
            }
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1035a(byte b, String str, int i) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4374);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(C0047bt.f865ad);
            dataOutputStream.writeByte(b);
            if (b > 0 && b != 5) {
                dataOutputStream.writeUTF(str);
            }
            if (b == 2 || b == 4 || b == 5 || b == 6) {
                dataOutputStream.writeInt(i);
            }
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1036a(int i) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4682);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(C0047bt.f865ad);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1037a(short s) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4630);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1038a(short s, byte b) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4372);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeByte(b);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1039a(short s, byte b, byte b2, byte b3, byte b4, String str) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4259);
            dataOutputStream.writeByte(b);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeByte(b3);
            dataOutputStream.writeByte(b4);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1040a(short s, byte b, int i, int i2, String str, String str2, String str3, String str4, String str5, int i3, int i4) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(5392);
            dataOutputStream.writeByte(b);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeInt(i2);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeUTF(str3);
            dataOutputStream.writeUTF(str4);
            dataOutputStream.writeUTF(str5);
            dataOutputStream.writeInt(i3);
            dataOutputStream.writeInt(i4);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1041a(short s, byte b, long j, String str) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4676);
            dataOutputStream.writeByte(b);
            dataOutputStream.writeLong(j);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1042a(short s, byte b, String str) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4648);
            dataOutputStream.writeByte(b);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1043a(short s, byte b, String str, byte b2, String str2) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4882);
            dataOutputStream.writeByte(b);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1044a(short s, byte b, String str, String str2, boolean z, String str3, String str4, int i, String str5) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(5383);
            dataOutputStream.writeByte(C0088t.f2532r);
            dataOutputStream.writeByte(C0088t.f2533s);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeInt(1);
            dataOutputStream.writeInt(1);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeUTF(str3);
            dataOutputStream.writeUTF(str4);
            dataOutputStream.writeInt(-1);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeInt(-1);
            dataOutputStream.writeUTF(str5);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1045a(short s, byte b, short s2, String str) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4649);
            dataOutputStream.writeByte(b);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1046a(short s, byte b, int[] iArr, String str) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4239);
            dataOutputStream.writeByte(b);
            if (b == 2) {
                dataOutputStream.writeByte(iArr[0]);
                dataOutputStream.writeByte(iArr[2]);
                dataOutputStream.writeInt(iArr[1]);
            }
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1047a(short s, int i, byte b, byte b2, String str) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4689);
            dataOutputStream.writeByte(b);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1048a(short s, int i, byte b, int i2, int i3, byte b2, String str, String str2) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4687);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeByte(b);
            dataOutputStream.writeInt(i2);
            dataOutputStream.writeInt(i3);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1049a(short s, int i, byte b, String str) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4368);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeByte(b);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1050a(short s, int i, int i2, byte b, String str) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4663);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeInt(i2);
            dataOutputStream.writeByte(b);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1051a(short s, int i, int i2, String str) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4650);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeInt(i2);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1052a(short s, int i, long j, byte b, byte b2, int i2, byte[] bArr, String str) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4688);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeLong(j);
            dataOutputStream.writeByte(b);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeInt(i2);
            if (b == 3) {
                if (bArr == null || bArr.length <= 0) {
                    dataOutputStream.writeByte(0);
                } else {
                    dataOutputStream.writeByte(bArr.length);
                    for (byte b3 : bArr) {
                        dataOutputStream.writeByte(b3);
                    }
                }
            }
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1053a(short s, int i, long j, byte b, int[] iArr, byte[] bArr, int i2, byte b2, String str) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4262);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeLong(j);
            dataOutputStream.writeByte(b);
            if (b == 1 || b == 2 || b == 3) {
                if (iArr == null || iArr.length <= 0) {
                    dataOutputStream.writeByte(0);
                } else {
                    dataOutputStream.writeByte(iArr.length);
                    for (int i3 = 0; i3 < iArr.length; i3++) {
                        dataOutputStream.writeInt(iArr[i3]);
                        dataOutputStream.writeByte(bArr[i3]);
                    }
                }
                if (b == 1 || b == 2) {
                    dataOutputStream.writeInt(i2);
                    dataOutputStream.writeByte(b2);
                }
            }
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1054a(short s, String str) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4100);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1055a(short s, String str, byte b) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4194);
            dataOutputStream.writeByte(b == 1 ? 0 : 1);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1056a(short s, String str, byte b, byte b2) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(s);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(b);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1057a(short s, String str, byte b, byte b2, int i) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4117);
            dataOutputStream.writeByte(b);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1058a(short s, String str, byte b, int i, byte b2) throws IOException {
        byte[] byteArray;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            try {
                dataOutputStream.writeByte(-82);
                dataOutputStream.writeShort(4363);
                dataOutputStream.writeByte(b2);
                dataOutputStream.writeByte(b);
                dataOutputStream.writeInt(i);
                dataOutputStream.writeUTF(C0047bt.f888b);
                dataOutputStream.writeUTF(C0047bt.f994d);
                dataOutputStream.writeUTF(str);
                dataOutputStream.writeByte(-81);
                byteArray = byteArrayOutputStream.toByteArray();
                m1028a(byteArrayOutputStream, dataOutputStream);
            } catch (IOException e) {
                e.printStackTrace();
                m1028a(byteArrayOutputStream, dataOutputStream);
                byteArray = null;
            }
            return byteArray;
        } catch (Throwable th) {
            m1028a(byteArrayOutputStream, dataOutputStream);
            throw th;
        }
    }

    /* renamed from: a */
    public static byte[] m1059a(short s, String str, byte b, int i, int i2) throws IOException {
        byte[] byteArray;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            try {
                dataOutputStream.writeByte(-82);
                dataOutputStream.writeShort(4364);
                dataOutputStream.writeInt(i2);
                dataOutputStream.writeByte(b);
                dataOutputStream.writeInt(i);
                dataOutputStream.writeUTF(C0047bt.f888b);
                dataOutputStream.writeUTF(C0047bt.f994d);
                dataOutputStream.writeUTF(str);
                dataOutputStream.writeByte(-81);
                byteArray = byteArrayOutputStream.toByteArray();
                m1028a(byteArrayOutputStream, dataOutputStream);
            } catch (IOException e) {
                e.printStackTrace();
                m1028a(byteArrayOutputStream, dataOutputStream);
                byteArray = null;
            }
            return byteArray;
        } catch (Throwable th) {
            m1028a(byteArrayOutputStream, dataOutputStream);
            throw th;
        }
    }

    /* renamed from: a */
    public static byte[] m1060a(short s, String str, byte b, int i, String str2, short s2, short s3) throws IOException {
        byte[] byteArray;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            try {
                dataOutputStream.writeByte(-82);
                dataOutputStream.writeShort(4356);
                dataOutputStream.writeUTF(str2);
                dataOutputStream.writeByte(b);
                dataOutputStream.writeInt(i);
                dataOutputStream.writeShort(s2);
                dataOutputStream.writeShort(s3);
                dataOutputStream.writeUTF(C0047bt.f888b);
                dataOutputStream.writeUTF(C0047bt.f994d);
                dataOutputStream.writeUTF(str);
                dataOutputStream.writeByte(-81);
                byteArray = byteArrayOutputStream.toByteArray();
                m1028a(byteArrayOutputStream, dataOutputStream);
            } catch (IOException e) {
                e.printStackTrace();
                m1028a(byteArrayOutputStream, dataOutputStream);
                byteArray = null;
            }
            return byteArray;
        } catch (Throwable th) {
            m1028a(byteArrayOutputStream, dataOutputStream);
            throw th;
        }
    }

    /* renamed from: a */
    public static byte[] m1061a(short s, String str, byte b, int i, short s2, short s3, String str2) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4253);
            dataOutputStream.writeByte(b);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeShort(s3);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1062a(short s, String str, byte b, C0049bv c0049bv) throws IOException {
        byte[] byteArray;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            try {
                dataOutputStream.writeByte(-82);
                dataOutputStream.writeShort(4360);
                dataOutputStream.writeByte(b);
                dataOutputStream.writeInt(c0049bv.f1780c);
                dataOutputStream.writeShort(c0049bv.f1782e);
                dataOutputStream.writeShort(c0049bv.f1783f);
                dataOutputStream.writeUTF(C0047bt.f888b);
                dataOutputStream.writeUTF(C0047bt.f994d);
                dataOutputStream.writeUTF(str);
                dataOutputStream.writeByte(-81);
                byteArray = byteArrayOutputStream.toByteArray();
                m1028a(byteArrayOutputStream, dataOutputStream);
            } catch (IOException e) {
                e.printStackTrace();
                m1028a(byteArrayOutputStream, dataOutputStream);
                byteArray = null;
            }
            return byteArray;
        } catch (Throwable th) {
            m1028a(byteArrayOutputStream, dataOutputStream);
            throw th;
        }
    }

    /* renamed from: a */
    public static byte[] m1063a(short s, String str, byte b, String str2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4865);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(b);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1064a(short s, String str, byte b, String str2, String str3) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4184);
            dataOutputStream.writeByte(b);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeUTF(str3);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1065a(short s, String str, byte b, short s2) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4631);
            dataOutputStream.writeByte(b);
            dataOutputStream.writeByte(s2);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1066a(short s, String str, byte b, short s2, short s3) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4195);
            dataOutputStream.writeByte(b);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeShort(s3);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1067a(short s, String str, int i) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(s);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1068a(short s, String str, int i, byte b) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4104);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeByte(b);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1069a(short s, String str, int i, byte b, byte b2) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4652);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeByte(b);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1070a(short s, String str, int i, byte b, byte b2, int i2) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4193);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeByte(b);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeInt(i2);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1071a(short s, String str, int i, byte b, long j) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4640);
            dataOutputStream.writeByte(b);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeLong(j);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1072a(short s, String str, int i, int i2) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4107);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeInt(i2);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1073a(short s, String str, int i, int i2, byte b) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4138);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeInt(i2);
            dataOutputStream.writeByte(b);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1074a(short s, String str, int i, int i2, int i3) throws IOException {
        if (str == null || str.equals("") || i < 0 || i2 < 0 || i2 > 9 || i3 < 0) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4126);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeByte((byte) i2);
            dataOutputStream.writeByte((byte) i3);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1075a(short s, String str, int i, int i2, long j) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4148);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeByte(1);
            dataOutputStream.writeLong(j);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1076a(short s, String str, int i, int i2, short s2) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4101);
            dataOutputStream.writeShort(i);
            dataOutputStream.writeShort(i2);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1077a(short s, String str, int i, int i2, short s2, long j) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4144);
            dataOutputStream.writeShort(i);
            dataOutputStream.writeShort(i2);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeLong(j);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1078a(short s, String str, int i, int i2, short s2, short s3) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4863);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeInt(i2);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeShort(s3);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1079a(short s, String str, int i, String str2) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4188);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1080a(short s, String str, int i, short s2) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4142);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1081a(short s, String str, int i, short s2, short s3) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4234);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeShort(s3);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1082a(short s, String str, int i, short[] sArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4187);
            dataOutputStream.writeInt(i);
            for (byte b = 0; b < sArr.length; b = (byte) (b + 1)) {
                dataOutputStream.writeShort(sArr[b]);
            }
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1083a(short s, String str, long j) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4224);
            dataOutputStream.writeLong(j);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1084a(short s, String str, long j, byte b) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4159);
            dataOutputStream.writeLong(j);
            dataOutputStream.writeByte(b);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1085a(short s, String str, long j, int i) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4127);
            dataOutputStream.writeLong(j);
            dataOutputStream.writeByte(i);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1086a(short s, String str, long j, int i, short s2, byte b, int i2, byte b2, byte b3, short s3, int i3, byte b4, byte b5) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4180);
            dataOutputStream.writeLong(j);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeByte(s2);
            dataOutputStream.writeByte(b);
            dataOutputStream.writeInt(i2);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeByte(b3);
            dataOutputStream.writeByte(s3);
            dataOutputStream.writeInt(i3);
            dataOutputStream.writeByte(b4);
            dataOutputStream.writeByte(b5);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1087a(short s, String str, long j, short s2, short s3, short s4, short s5) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4220);
            dataOutputStream.writeLong(j);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeShort(s3);
            dataOutputStream.writeShort(s4);
            dataOutputStream.writeShort(s5);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1088a(short s, String str, String str2) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4098);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1089a(short s, String str, String str2, byte b) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4110);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeByte(b);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1090a(short s, String str, String str2, byte b, String str3, int i) throws IOException {
        byte[] byteArray;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            try {
                dataOutputStream.writeByte(-82);
                dataOutputStream.writeShort(s);
                dataOutputStream.writeUTF(str2);
                dataOutputStream.writeByte(b);
                dataOutputStream.writeUTF(str3);
                dataOutputStream.writeInt(i);
                dataOutputStream.writeUTF(C0047bt.f888b);
                dataOutputStream.writeUTF(C0047bt.f994d);
                dataOutputStream.writeUTF(str);
                dataOutputStream.writeByte(-81);
                byteArray = byteArrayOutputStream.toByteArray();
                m1028a(byteArrayOutputStream, dataOutputStream);
            } catch (IOException e) {
                e.printStackTrace();
                m1028a(byteArrayOutputStream, dataOutputStream);
                byteArray = null;
            }
            return byteArray;
        } catch (Throwable th) {
            m1028a(byteArrayOutputStream, dataOutputStream);
            throw th;
        }
    }

    /* renamed from: a */
    public static byte[] m1091a(short s, String str, String str2, byte b, short s2, short s3) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(5121);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeByte(1);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeShort(s3);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1092a(short s, String str, String str2, int i) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4671);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1093a(short s, String str, String str2, long j) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4185);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeLong(j);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1094a(short s, String str, String str2, String str3) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(s);
            dataOutputStream.writeByte(C0088t.f2532r);
            dataOutputStream.writeByte(C0088t.f2533s);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeUTF(str3);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1095a(short s, String str, String str2, String str3, int i) throws IOException {
        byte[] byteArray;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            try {
                dataOutputStream.writeByte(-82);
                dataOutputStream.writeShort(4670);
                dataOutputStream.writeUTF(str2);
                dataOutputStream.writeUTF(str3);
                dataOutputStream.writeInt(i);
                dataOutputStream.writeUTF(C0047bt.f888b);
                dataOutputStream.writeUTF(C0047bt.f994d);
                dataOutputStream.writeUTF(str);
                dataOutputStream.writeByte(-81);
                byteArray = byteArrayOutputStream.toByteArray();
                m1028a(byteArrayOutputStream, dataOutputStream);
            } catch (IOException e) {
                e.printStackTrace();
                m1028a(byteArrayOutputStream, dataOutputStream);
                byteArray = null;
            }
            return byteArray;
        } catch (Throwable th) {
            m1028a(byteArrayOutputStream, dataOutputStream);
            throw th;
        }
    }

    /* renamed from: a */
    public static byte[] m1096a(short s, String str, String str2, String str3, int i, int i2) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4147);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeUTF(str3);
            dataOutputStream.writeShort((short) i);
            dataOutputStream.writeByte((byte) i2);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1097a(short s, String str, String str2, String str3, int i, String str4) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            try {
                dataOutputStream.writeByte(-82);
                dataOutputStream.writeShort(4669);
                dataOutputStream.writeUTF(str2);
                dataOutputStream.writeUTF(str3);
                dataOutputStream.writeUTF(str4);
                dataOutputStream.writeInt(i);
                dataOutputStream.writeUTF(C0047bt.f888b);
                dataOutputStream.writeUTF(C0047bt.f994d);
                dataOutputStream.writeUTF(str);
                dataOutputStream.writeByte(-81);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                m1028a(byteArrayOutputStream, dataOutputStream);
                return byteArray;
            } catch (IOException e) {
                e.printStackTrace();
                m1028a(byteArrayOutputStream, dataOutputStream);
                return null;
            }
        } catch (Throwable th) {
            m1028a(byteArrayOutputStream, dataOutputStream);
            throw th;
        }
    }

    /* renamed from: a */
    public static byte[] m1098a(short s, String str, String str2, String str3, long j) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4857);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeUTF(str3);
            dataOutputStream.writeLong(j);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1099a(short s, String str, String str2, String str3, boolean z) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4096);
            dataOutputStream.writeByte(C0088t.f2532r);
            dataOutputStream.writeByte(C0088t.f2533s);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeByte(z ? 1 : 0);
            dataOutputStream.writeUTF(str3);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1100a(short s, String str, String str2, short s2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4112);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeByte(s2);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1101a(short s, String str, String str2, short s2, short s3) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(5122);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeShort(s3);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1102a(short s, String str, String str2, boolean z) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4628);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeByte(z ? 1 : 0);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1103a(short s, String str, short s2) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4140);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1104a(short s, String str, short s2, byte b) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            try {
                dataOutputStream.writeByte(-82);
                dataOutputStream.writeShort(s);
                dataOutputStream.writeShort(s2);
                dataOutputStream.writeByte(b);
                dataOutputStream.writeUTF(C0047bt.f888b);
                dataOutputStream.writeUTF(C0047bt.f994d);
                dataOutputStream.writeUTF(str);
                dataOutputStream.writeByte(-81);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                m1028a(byteArrayOutputStream, dataOutputStream);
                return byteArray;
            } catch (IOException e) {
                e.printStackTrace();
                m1028a(byteArrayOutputStream, dataOutputStream);
                return null;
            }
        } catch (Throwable th) {
            m1028a(byteArrayOutputStream, dataOutputStream);
            throw th;
        }
    }

    /* renamed from: a */
    public static byte[] m1105a(short s, String str, short s2, int i) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            try {
                dataOutputStream.writeByte(-82);
                dataOutputStream.writeShort(s);
                dataOutputStream.writeInt(i);
                dataOutputStream.writeShort(s2);
                dataOutputStream.writeUTF(C0047bt.f888b);
                dataOutputStream.writeUTF(C0047bt.f994d);
                dataOutputStream.writeUTF(str);
                dataOutputStream.writeByte(-81);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                m1028a(byteArrayOutputStream, dataOutputStream);
                return byteArray;
            } catch (IOException e) {
                e.printStackTrace();
                m1028a(byteArrayOutputStream, dataOutputStream);
                return null;
            }
        } catch (Throwable th) {
            m1028a(byteArrayOutputStream, dataOutputStream);
            throw th;
        }
    }

    /* renamed from: a */
    public static byte[] m1106a(short s, String str, short s2, int i, String str2, String str3) throws IOException {
        byte[] byteArray;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            try {
                dataOutputStream.writeByte(-82);
                dataOutputStream.writeShort(4256);
                dataOutputStream.writeShort(s2);
                dataOutputStream.writeInt(i);
                dataOutputStream.writeUTF(str2);
                if (str3 == null) {
                    str3 = "";
                }
                dataOutputStream.writeUTF(str3);
                dataOutputStream.writeUTF(C0047bt.f888b);
                dataOutputStream.writeUTF(C0047bt.f994d);
                dataOutputStream.writeUTF(str);
                dataOutputStream.writeByte(-81);
                byteArray = byteArrayOutputStream.toByteArray();
                m1028a(byteArrayOutputStream, dataOutputStream);
            } catch (IOException e) {
                e.printStackTrace();
                m1028a(byteArrayOutputStream, dataOutputStream);
                byteArray = null;
            }
            return byteArray;
        } catch (Throwable th) {
            m1028a(byteArrayOutputStream, dataOutputStream);
            throw th;
        }
    }

    /* renamed from: a */
    public static byte[] m1107a(short s, String str, short[] sArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4186);
            for (byte b = 0; b < sArr.length; b = (byte) (b + 1)) {
                dataOutputStream.writeShort(sArr[b]);
            }
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1108a(short s, short s2, String str) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(s);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m1109a(short s, short[] sArr, String str) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4255);
            dataOutputStream.writeShort(sArr[0]);
            dataOutputStream.writeShort(sArr[1]);
            dataOutputStream.writeShort(sArr[2]);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static byte[] m1110b(byte b, int i, int i2, int i3) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4691);
            dataOutputStream.writeByte(b);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeInt(i2);
            dataOutputStream.writeInt(i3);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(C0047bt.f865ad);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static byte[] m1111b(int i) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4686);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(C0047bt.f865ad);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static byte[] m1112b(short s) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4267);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(C0047bt.f865ad);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static byte[] m1113b(short s, byte b, long j, String str) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4264);
            dataOutputStream.writeByte(b);
            dataOutputStream.writeLong(j);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static byte[] m1114b(short s, byte b, String str) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4881);
            dataOutputStream.writeByte(b);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static byte[] m1115b(short s, int i, byte b, String str) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(s);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeByte(b);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static byte[] m1116b(short s, int i, int i2, String str) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4244);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeByte((byte) i2);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static byte[] m1117b(short s, String str) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4103);
            dataOutputStream.writeShort(C0088t.f2516b);
            dataOutputStream.writeShort(C0088t.f2517c);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static byte[] m1118b(short s, String str, byte b) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4608);
            dataOutputStream.writeByte(b == 1 ? 0 : 1);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static byte[] m1119b(short s, String str, byte b, byte b2) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4610);
            dataOutputStream.writeByte(b);
            dataOutputStream.writeByte(b2 == 0 ? 1 : 0);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static byte[] m1120b(short s, String str, byte b, String str2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4866);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(b);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static byte[] m1121b(short s, String str, byte b, short s2) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4632);
            dataOutputStream.writeByte(b);
            dataOutputStream.writeByte(s2);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static byte[] m1122b(short s, String str, int i) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4105);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static byte[] m1123b(short s, String str, int i, byte b) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4135);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeByte(b);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static byte[] m1124b(short s, String str, int i, int i2) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4108);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeInt(i2);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static byte[] m1125b(short s, String str, int i, int i2, byte b) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4614);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeInt(i2);
            dataOutputStream.writeByte(b);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static byte[] m1126b(short s, String str, int i, int i2, int i3) throws IOException {
        byte[] byteArray;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            try {
                dataOutputStream.writeByte(-82);
                dataOutputStream.writeShort(4667);
                dataOutputStream.writeInt(i);
                dataOutputStream.writeShort(i2);
                dataOutputStream.writeShort(i3);
                dataOutputStream.writeUTF(C0047bt.f888b);
                dataOutputStream.writeUTF(C0047bt.f994d);
                dataOutputStream.writeUTF(str);
                dataOutputStream.writeByte(-81);
                byteArray = byteArrayOutputStream.toByteArray();
                m1028a(byteArrayOutputStream, dataOutputStream);
            } catch (IOException e) {
                e.printStackTrace();
                m1028a(byteArrayOutputStream, dataOutputStream);
                byteArray = null;
            }
            return byteArray;
        } catch (Throwable th) {
            m1028a(byteArrayOutputStream, dataOutputStream);
            throw th;
        }
    }

    /* renamed from: b */
    public static byte[] m1127b(short s, String str, int i, int i2, long j) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4152);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeByte((byte) i2);
            dataOutputStream.writeLong(j);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static byte[] m1128b(short s, String str, int i, int i2, short s2) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4642);
            dataOutputStream.writeShort(i);
            dataOutputStream.writeInt(i2);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static byte[] m1129b(short s, String str, String str2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4111);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static byte[] m1130b(short s, String str, String str2, byte b) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4124);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeByte(b);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static byte[] m1131b(short s, String str, String str2, int i) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4856);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static byte[] m1132b(short s, String str, String str2, String str3) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4197);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeUTF(str3);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static byte[] m1133b(short s, String str, String str2, String str3, int i, int i2) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4153);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeUTF(str3);
            dataOutputStream.writeShort((short) i);
            dataOutputStream.writeByte((byte) i2);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static byte[] m1134b(short s, String str, String str2, short s2) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4122);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static byte[] m1135b(short s, String str, short s2) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4115);
            dataOutputStream.writeByte(s2);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    public static byte[] m1136c(short s, byte b, String str) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4370);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(b);
            dataOutputStream.writeShort(C0047bt.f1060eM[0]);
            dataOutputStream.writeShort(C0047bt.f1060eM[1]);
            dataOutputStream.writeShort(C0047bt.f1060eM[2]);
            dataOutputStream.writeShort(C0047bt.f1061eN);
            if (C0047bt.f1062eO != null && C0047bt.f1062eO.length > 0 && C0047bt.f1062eO.length < 10) {
                for (int i = 0; i < C0047bt.f1062eO.length; i++) {
                    dataOutputStream.writeByte(C0047bt.f1062eO[i]);
                }
            }
            if (C0047bt.f1063eP != null && C0047bt.f1063eP.length > 0 && C0047bt.f1063eP.length < 10) {
                for (int i2 = 0; i2 < C0047bt.f1063eP.length; i2++) {
                    dataOutputStream.writeShort(C0047bt.f1063eP[i2]);
                }
            }
            if (C0047bt.f1064eQ != null && C0047bt.f1064eQ.length > 0 && C0047bt.f1064eQ.length < 10) {
                for (int i3 = 0; i3 < C0047bt.f1064eQ.length; i3++) {
                    dataOutputStream.writeInt(C0047bt.f1064eQ[i3]);
                }
            }
            if (C0047bt.f1065eR != null && C0047bt.f1065eR.length > 0 && C0047bt.f1065eR.length < 10) {
                for (int i4 = 0; i4 < C0047bt.f1065eR.length; i4++) {
                    dataOutputStream.writeUTF(C0047bt.f1065eR[i4]);
                }
            }
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    public static byte[] m1137c(short s, String str) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(s);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    public static byte[] m1138c(short s, String str, byte b) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(s);
            dataOutputStream.writeByte(b == 1 ? 0 : 1);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    public static byte[] m1139c(short s, String str, byte b, byte b2) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4134);
            dataOutputStream.writeByte(b);
            dataOutputStream.writeByte(b2);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    public static byte[] m1140c(short s, String str, byte b, String str2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4872);
            dataOutputStream.writeByte(b);
            if (str2 != null && b == 0) {
                dataOutputStream.writeUTF(str2);
            }
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    public static byte[] m1141c(short s, String str, byte b, short s2) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4150);
            dataOutputStream.writeByte(b);
            dataOutputStream.writeByte(s2);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    public static byte[] m1142c(short s, String str, int i) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4106);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    public static byte[] m1143c(short s, String str, int i, byte b) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4249);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeByte(b);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    public static byte[] m1144c(short s, String str, int i, int i2) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4109);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeInt(i2);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    public static byte[] m1145c(short s, String str, int i, int i2, byte b) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4645);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeInt(i2);
            dataOutputStream.writeByte(b);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    public static byte[] m1146c(short s, String str, String str2) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4170);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    public static byte[] m1147c(short s, String str, String str2, byte b) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4113);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeByte(b);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    public static byte[] m1148c(short s, String str, String str2, String str3) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4674);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeUTF(str3);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    public static byte[] m1149c(short s, String str, String str2, short s2) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4123);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    public static byte[] m1150c(short s, String str, short s2) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4118);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: d */
    public static byte[] m1151d(short s, byte b, String str) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4690);
            dataOutputStream.writeByte(b);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(C0047bt.f865ad);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: d */
    public static byte[] m1152d(short s, String str) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4641);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: d */
    public static byte[] m1153d(short s, String str, byte b) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(5120);
            dataOutputStream.writeByte(b == 1 ? 0 : 1);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: d */
    public static byte[] m1154d(short s, String str, int i) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4132);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: d */
    public static byte[] m1155d(short s, String str, int i, byte b) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4615);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeByte(b);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: d */
    public static byte[] m1156d(short s, String str, int i, int i2) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4139);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeShort(i2);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: d */
    public static byte[] m1157d(short s, String str, String str2) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4171);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: d */
    public static byte[] m1158d(short s, String str, String str2, byte b) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4217);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeByte(b);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: d */
    public static byte[] m1159d(short s, String str, String str2, short s2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4864);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: d */
    public static byte[] m1160d(short s, String str, short s2) throws IOException {
        byte[] byteArray;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            try {
                dataOutputStream.writeByte(-82);
                dataOutputStream.writeShort(s);
                dataOutputStream.writeShort(s2);
                dataOutputStream.writeUTF(C0047bt.f888b);
                dataOutputStream.writeUTF(C0047bt.f994d);
                dataOutputStream.writeUTF(str);
                dataOutputStream.writeByte(-81);
                byteArray = byteArrayOutputStream.toByteArray();
                m1028a(byteArrayOutputStream, dataOutputStream);
            } catch (IOException e) {
                e.printStackTrace();
                m1028a(byteArrayOutputStream, dataOutputStream);
                byteArray = null;
            }
            return byteArray;
        } catch (Throwable th) {
            m1028a(byteArrayOutputStream, dataOutputStream);
            throw th;
        }
    }

    /* renamed from: e */
    public static byte[] m1161e(short s, String str) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(5123);
            dataOutputStream.writeByte(1);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: e */
    public static byte[] m1162e(short s, String str, byte b) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4352);
            dataOutputStream.writeByte(b);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: e */
    public static byte[] m1163e(short s, String str, int i) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4133);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: e */
    public static byte[] m1164e(short s, String str, int i, byte b) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4633);
            dataOutputStream.writeByte(b);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: e */
    public static byte[] m1165e(short s, String str, int i, int i2) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4157);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeByte((byte) i2);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: e */
    public static byte[] m1166e(short s, String str, String str2) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4114);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: e */
    public static byte[] m1167e(short s, String str, short s2) throws IOException {
        byte[] byteArray;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            try {
                dataOutputStream.writeByte(-82);
                dataOutputStream.writeShort(s);
                dataOutputStream.writeShort(s2);
                dataOutputStream.writeUTF(C0047bt.f888b);
                dataOutputStream.writeUTF(C0047bt.f994d);
                dataOutputStream.writeUTF(str);
                dataOutputStream.writeByte(-81);
                byteArray = byteArrayOutputStream.toByteArray();
                m1028a(byteArrayOutputStream, dataOutputStream);
            } catch (IOException e) {
                e.printStackTrace();
                m1028a(byteArrayOutputStream, dataOutputStream);
                byteArray = null;
            }
            return byteArray;
        } catch (Throwable th) {
            m1028a(byteArrayOutputStream, dataOutputStream);
            throw th;
        }
    }

    /* renamed from: f */
    public static byte[] m1168f(short s, String str) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4168);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: f */
    public static byte[] m1169f(short s, String str, byte b) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4125);
            dataOutputStream.writeByte(b);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: f */
    public static byte[] m1170f(short s, String str, int i) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4136);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: f */
    public static byte[] m1171f(short s, String str, int i, byte b) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4646);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeByte(b);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: f */
    public static byte[] m1172f(short s, String str, int i, int i2) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4158);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeByte((byte) i2);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: f */
    public static byte[] m1173f(short s, String str, String str2) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4119);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: f */
    public static byte[] m1174f(short s, String str, short s2) throws IOException {
        byte[] byteArray;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            try {
                dataOutputStream.writeByte(-82);
                dataOutputStream.writeShort(s);
                dataOutputStream.writeShort(s2);
                dataOutputStream.writeUTF(C0047bt.f888b);
                dataOutputStream.writeUTF(C0047bt.f994d);
                dataOutputStream.writeUTF(str);
                dataOutputStream.writeByte(-81);
                byteArray = byteArrayOutputStream.toByteArray();
                m1028a(byteArrayOutputStream, dataOutputStream);
            } catch (IOException e) {
                e.printStackTrace();
                m1028a(byteArrayOutputStream, dataOutputStream);
                byteArray = null;
            }
            return byteArray;
        } catch (Throwable th) {
            m1028a(byteArrayOutputStream, dataOutputStream);
            throw th;
        }
    }

    /* renamed from: g */
    public static byte[] m1175g(short s, String str) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4169);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: g */
    public static byte[] m1176g(short s, String str, byte b) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4128);
            dataOutputStream.writeByte(b);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: g */
    public static byte[] m1177g(short s, String str, int i) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4165);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: g */
    public static byte[] m1178g(short s, String str, int i, byte b) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4647);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeByte(b);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: g */
    public static byte[] m1179g(short s, String str, int i, int i2) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4173);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeInt(i2);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: g */
    public static byte[] m1180g(short s, String str, String str2) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4196);
            dataOutputStream.writeByte(C0088t.f2532r);
            dataOutputStream.writeByte(C0088t.f2533s);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: g */
    public static byte[] m1181g(short s, String str, short s2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4198);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: h */
    public static byte[] m1182h(short s, String str) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4120);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: h */
    public static byte[] m1183h(short s, String str, byte b) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4129);
            dataOutputStream.writeByte(b);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: h */
    public static byte[] m1184h(short s, String str, int i) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4163);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: h */
    public static byte[] m1185h(short s, String str, int i, int i2) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(s);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeInt(i2);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: h */
    public static byte[] m1186h(short s, String str, String str2) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4673);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: h */
    public static byte[] m1187h(short s, String str, short s2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(s);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: i */
    public static byte[] m1188i(short s, String str) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4121);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: i */
    public static byte[] m1189i(short s, String str, byte b) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            try {
                dataOutputStream.writeByte(-82);
                dataOutputStream.writeShort(4355);
                dataOutputStream.writeByte(b);
                dataOutputStream.writeUTF(C0047bt.f888b);
                dataOutputStream.writeUTF(C0047bt.f994d);
                dataOutputStream.writeUTF(str);
                dataOutputStream.writeByte(-81);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                m1028a(byteArrayOutputStream, dataOutputStream);
                return byteArray;
            } catch (IOException e) {
                e.printStackTrace();
                m1028a(byteArrayOutputStream, dataOutputStream);
                return null;
            }
        } catch (Throwable th) {
            m1028a(byteArrayOutputStream, dataOutputStream);
            throw th;
        }
    }

    /* renamed from: i */
    public static byte[] m1190i(short s, String str, int i) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4164);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: i */
    public static byte[] m1191i(short s, String str, int i, int i2) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4172);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeByte(i2);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: i */
    public static byte[] m1192i(short s, String str, String str2) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4216);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: i */
    public static byte[] m1193i(short s, String str, short s2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4227);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: j */
    public static byte[] m1194j(short s, String str) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4143);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: j */
    public static byte[] m1195j(short s, String str, byte b) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            try {
                dataOutputStream.writeByte(-82);
                dataOutputStream.writeShort(4357);
                dataOutputStream.writeByte(b);
                dataOutputStream.writeUTF(C0047bt.f888b);
                dataOutputStream.writeUTF(C0047bt.f994d);
                dataOutputStream.writeUTF(str);
                dataOutputStream.writeByte(-81);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                m1028a(byteArrayOutputStream, dataOutputStream);
                return byteArray;
            } catch (IOException e) {
                e.printStackTrace();
                m1028a(byteArrayOutputStream, dataOutputStream);
                return null;
            }
        } catch (Throwable th) {
            m1028a(byteArrayOutputStream, dataOutputStream);
            throw th;
        }
    }

    /* renamed from: j */
    public static byte[] m1196j(short s, String str, int i) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4177);
            dataOutputStream.writeByte((byte) i);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: j */
    public static byte[] m1197j(short s, String str, int i, int i2) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4166);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeInt(i2);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: j */
    public static byte[] m1198j(short s, String str, String str2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4201);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: j */
    public static byte[] m1199j(short s, String str, short s2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4225);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: k */
    public static byte[] m1200k(short s, String str) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4190);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: k */
    public static byte[] m1201k(short s, String str, byte b) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4263);
            dataOutputStream.writeByte(b);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: k */
    public static byte[] m1202k(short s, String str, int i) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4161);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: k */
    public static byte[] m1203k(short s, String str, int i, int i2) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(s);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeShort(i2);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: k */
    public static byte[] m1204k(short s, String str, String str2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4208);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: k */
    public static byte[] m1205k(short s, String str, short s2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(s);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: l */
    public static byte[] m1206l(short s, String str) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4672);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: l */
    public static byte[] m1207l(short s, String str, byte b) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4233);
            dataOutputStream.writeByte(b);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: l */
    public static byte[] m1208l(short s, String str, int i) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4154);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: l */
    public static byte[] m1209l(short s, String str, int i, int i2) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4238);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeInt(i2);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: l */
    public static byte[] m1210l(short s, String str, String str2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(s);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: l */
    public static byte[] m1211l(short s, String str, short s2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4869);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: m */
    public static byte[] m1212m(short s, String str) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4209);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: m */
    public static byte[] m1213m(short s, String str, byte b) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4860);
            dataOutputStream.writeByte(b);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: m */
    public static byte[] m1214m(short s, String str, int i) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4149);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: m */
    public static byte[] m1215m(short s, String str, int i, int i2) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4629);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeInt(i2);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: m */
    public static byte[] m1216m(short s, String str, String str2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(s);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: m */
    public static byte[] m1217m(short s, String str, short s2) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4858);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: n */
    public static byte[] m1218n(short s, String str) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4214);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: n */
    public static byte[] m1219n(short s, String str, byte b) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4861);
            dataOutputStream.writeByte(b);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: n */
    public static byte[] m1220n(short s, String str, int i) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4151);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: n */
    public static byte[] m1221n(short s, String str, String str2) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4218);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: n */
    public static byte[] m1222n(short s, String str, short s2) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4862);
            dataOutputStream.writeShort(s2);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: o */
    public static byte[] m1223o(short s, String str) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4211);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: o */
    public static byte[] m1224o(short s, String str, int i) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4162);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: o */
    public static byte[] m1225o(short s, String str, String str2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4868);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: p */
    public static byte[] m1226p(short s, String str) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4241);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: p */
    public static byte[] m1227p(short s, String str, int i) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4155);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: p */
    public static byte[] m1228p(short s, String str, String str2) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4651);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: q */
    public static byte[] m1229q(short s, String str) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4219);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: q */
    public static byte[] m1230q(short s, String str, int i) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4167);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: q */
    public static byte[] m1231q(short s, String str, String str2) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4880);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: r */
    public static byte[] m1232r(short s, String str) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4221);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: r */
    public static byte[] m1233r(short s, String str, int i) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4146);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: r */
    public static byte[] m1234r(short s, String str, String str2) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4678);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: s */
    public static byte[] m1235s(short s, String str) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4236);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: s */
    public static byte[] m1236s(short s, String str, int i) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4145);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: s */
    public static byte[] m1237s(short s, String str, String str2) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4675);
            dataOutputStream.writeUTF(str2);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: t */
    public static byte[] m1238t(short s, String str) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4248);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: t */
    public static byte[] m1239t(short s, String str, int i) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4192);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: u */
    public static byte[] m1240u(short s, String str) throws Throwable {
        DataOutputStream dataOutputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] byteArray = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
        } catch (IOException e) {
            e = e;
            dataOutputStream = null;
            byteArrayOutputStream = null;
        } catch (Throwable th) {
            th = th;
            dataOutputStream = null;
            byteArrayOutputStream = null;
        }
        try {
            dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        } catch (IOException e2) {
            e = e2;
            dataOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            dataOutputStream = null;
            m1028a(byteArrayOutputStream, dataOutputStream);
            throw th;
        }
        try {
            try {
                dataOutputStream.writeByte(-82);
                dataOutputStream.writeShort(4612);
                dataOutputStream.writeUTF(C0047bt.f888b);
                dataOutputStream.writeUTF(C0047bt.f994d);
                dataOutputStream.writeUTF(str);
                dataOutputStream.writeByte(-81);
                byteArray = byteArrayOutputStream.toByteArray();
                m1028a(byteArrayOutputStream, dataOutputStream);
            } catch (Throwable th3) {
                th = th3;
                m1028a(byteArrayOutputStream, dataOutputStream);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            e.printStackTrace();
            m1028a(byteArrayOutputStream, dataOutputStream);
            return byteArray;
        }
        return byteArray;
    }

    /* renamed from: u */
    public static byte[] m1241u(short s, String str, int i) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4189);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: v */
    public static byte[] m1242v(short s, String str) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(s);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: v */
    public static byte[] m1243v(short s, String str, int i) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4191);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: w */
    public static byte[] m1244w(short s, String str) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4653);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: w */
    public static byte[] m1245w(short s, String str, int i) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4668);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: x */
    public static byte[] m1246x(short s, String str) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4658);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: x */
    public static byte[] m1247x(short s, String str, int i) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(s);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: y */
    public static byte[] m1248y(short s, String str) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4659);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: y */
    public static byte[] m1249y(short s, String str, int i) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4237);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: z */
    public static byte[] m1250z(short s, String str) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4223);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: z */
    public static byte[] m1251z(short s, String str, int i) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(-82);
            dataOutputStream.writeShort(4613);
            dataOutputStream.writeInt(i);
            dataOutputStream.writeUTF(C0047bt.f888b);
            dataOutputStream.writeUTF(C0047bt.f994d);
            dataOutputStream.writeUTF(str);
            dataOutputStream.writeByte(-81);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
